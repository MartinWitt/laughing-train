# jreleaser/jreleaser
# Bad smells
I found 1104 bad smells with 36 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 239 | false |
| ReturnNull | 147 | false |
| BoundedWildcard | 144 | false |
| DynamicRegexReplaceableByCompiledPattern | 93 | false |
| AbstractClassNeverImplemented | 81 | false |
| AssignmentToMethodParameter | 52 | false |
| UnusedAssignment | 35 | false |
| ConstantConditions | 33 | false |
| UtilityClassWithoutPrivateConstructor | 33 | false |
| SizeReplaceableByIsEmpty | 29 | true |
| SystemOutErr | 18 | false |
| EmptyMethod | 17 | false |
| UnstableTypeUsedInSignature | 17 | false |
| CallToStringConcatCanBeReplacedByOperator | 15 | false |
| RedundantImplements | 14 | false |
| IgnoreResultOfCall | 13 | false |
| RegExpRedundantEscape | 10 | false |
| DuplicateExpressions | 10 | false |
| ClassNameSameAsAncestorName | 9 | false |
| TrivialStringConcatenation | 8 | false |
| OctalLiteral | 6 | false |
| MissortedModifiers | 6 | false |
| EnumSwitchStatementWhichMissesCases | 5 | false |
| NestedAssignment | 5 | false |
| RedundantSuppression | 5 | false |
| NonProtectedConstructorInAbstractClass | 5 | true |
| KeySetIterationMayUseEntrySet | 3 | false |
| RegExpSimplifiable | 3 | false |
| ZeroLengthArrayInitialization | 3 | false |
| DeprecatedIsStillUsed | 3 | false |
| EqualsWhichDoesntCheckParameterClass | 3 | false |
| ObsoleteCollection | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| NonShortCircuitBoolean | 2 | false |
| InfiniteRecursion | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| RedundantCollectionOperation | 2 | false |
| OptionalUsedAsFieldOrParameterType | 2 | false |
| SuspiciousToArrayCall | 2 | false |
| Convert2Lambda | 2 | false |
| RegExpUnnecessaryNonCapturingGroup | 2 | false |
| MagicConstant | 1 | false |
| RedundantClassCall | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| DefaultAnnotationParam | 1 | false |
| RedundantMethodOverride | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| SlowListContainsAll | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| CodeBlock2Expr | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| DuplicateThrows | 1 | false |
| OptionalIsPresent | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| CatchMayIgnoreException | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| InnerClassMayBeStatic | 1 | true |
| PublicFieldAccessedInSynchronizedContext | 1 | false |
| StringEqualsEmptyString | 1 | false |
| UnnecessaryBoxing | 1 | false |
## EnumSwitchStatementWhichMissesCases
### EnumSwitchStatementWhichMissesCases
`switch (fileType) { case TGZ: case TAR_GZ: return new GzipCo...` statement on enum type 'org.jreleaser.util.FileType' misses cases: 'ASC', 'DEB', 'DMG', 'EXE', 'JAR', 'MSI', ...
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java

    private static InputStream resolveCompressorInputStream(FileType fileType, InputStream in) throws IOException {
        switch (fileType) {
            case TGZ:
            case TAR_GZ:
                return new GzipCompressorInputStream(in);
            case TBZ2:
            case TAR_BZ2:
                return new BZip2CompressorInputStream(in);
            case TXZ:
            case TAR_XZ:
                return new XZCompressorInputStream(in);
        }

        return null;
```

### EnumSwitchStatementWhichMissesCases
`switch (type) { case PACKAGE: return JReleaserCommand.PACKAGE.toStep(); ...` statement on enum type 'org.jreleaser.engine.distribution.DistributionProcessor.PackagingAction.Type' misses case 'PREPARE'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/distribution/Distributions.java`
#### Snippet
```java

    private static String actionToStep(DistributionProcessor.PackagingAction.Type type) {
        switch (type) {
            case PACKAGE:
                return JReleaserCommand.PACKAGE.toStep();
            case PUBLISH:
                return JReleaserCommand.PUBLISH.toStep();
        }
        return JReleaserCommand.PREPARE.toStep();
    }
```

### EnumSwitchStatementWhichMissesCases
`switch (type) { case CALVER: case CUSTOM: if (is...` statement on enum type 'org.jreleaser.model.VersionPattern.Type' misses cases: 'SEMVER', 'CHRONVER', 'JAVA_RUNTIME', ...
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java
        public String toString() {
            String s = type.toString();
            switch (type) {
                case CALVER:
                case CUSTOM:
                    if (isNotBlank(format)) {
                        s += ":" + format;
                    }
            }
            return s;
        }
```

### EnumSwitchStatementWhichMissesCases
`switch (element.getKind()) { case INTERFACE: collector.p...` statement on enum type 'javax.lang.model.element.ElementKind' misses cases: 'PACKAGE', 'ANNOTATION_TYPE', 'ENUM_CONSTANT', ...
in `infra/jreleaser-nativeimage-processor/src/main/java/org/jreleaser/infra/nativeimage/processor/ReflectConfigGenerator.java`
#### Snippet
```java
            String className = elementTypeName(element.asType());
            if (!collector.containsKey(className)) {
                switch (element.getKind()) {
                    case INTERFACE:
                        collector.put(className, formatInterface(className));
                        break;
                    case ENUM:
                        collector.put(className, formatEnum(className));
                        break;
                    case CLASS:
                        collector.put(className, formatClass(className));
                }
            }
        }
```

### EnumSwitchStatementWhichMissesCases
`switch (element.getKind()) { case ENUM: case...` statement on enum type 'javax.lang.model.element.ElementKind' misses cases: 'PACKAGE', 'ANNOTATION_TYPE', 'ENUM_CONSTANT', ...
in `infra/jreleaser-nativeimage-processor/src/main/java/org/jreleaser/infra/nativeimage/processor/AbstractNativeImageProcessor.java`
#### Snippet
```java
                    elements.add(rootElement);
                    for (Element element : rootElement.getEnclosedElements()) {
                        switch (element.getKind()) {
                            case ENUM:
                            case INTERFACE:
                            case CLASS:
                                elements.add(element);
                        }
                    }
                }
```

## MagicConstant
### MagicConstant
Should be one of: ZipEntry.STORED, ZipEntry.DEFLATED
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
                    ZipArchiveEntry archiveEntry = new ZipArchiveEntry(inputFile, entryName);

                    archiveEntry.setMethod(ZipOutputStream.DEFLATED);
                    if (inputFile.isFile() && Files.isExecutable(file)) {
                        archiveEntry.setUnixMode(0100755);
```

## RedundantClassCall
### RedundantClassCall
Redundant call to `cast()`
in `sdks/jreleaser-nexus2-java-sdk/src/main/java/org/jreleaser/sdk/nexus2/Nexus2.java`
#### Snippet
```java
            } catch (RuntimeJsonMappingException e) {
                if (e.getCause() != null && e.getCause() instanceof IOException) {
                    throw IOException.class.cast(e.getCause());
                }
                throw e;
```

## RegExpRedundantEscape
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
 */
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
public abstract class JpackageAssemblerValidator extends Validator {
    private static final String MAC_IDENTIFIER = "[a-zA-Z0-9][a-zA-Z0-9\\.\\-]*";
    private static final Pattern MAC_IDENTIFIER_PATTERN = Pattern.compile(MAC_IDENTIFIER);

```

## ObsoleteCollection
### ObsoleteCollection
Obsolete collection type `Stack` used
in `api/jreleaser-logger-api/src/main/java/org/jreleaser/logging/AbstractJReleaserLogger.java`
#### Snippet
```java
 */
public abstract class AbstractJReleaserLogger implements JReleaserLogger {
    private final Stack<String> prefix = new Stack<>();
    private final PrintWriter tracer;
    private String indent = "";
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `api/jreleaser-logger-api/src/main/java/org/jreleaser/logging/AbstractJReleaserLogger.java`
#### Snippet
```java
 */
public abstract class AbstractJReleaserLogger implements JReleaserLogger {
    private final Stack<String> prefix = new Stack<>();
    private final PrintWriter tracer;
    private String indent = "";
```

## KeySetIterationMayUseEntrySet
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
in `sdks/jreleaser-codeberg-java-sdk/src/main/java/org/jreleaser/sdk/codeberg/CodebergReleaser.java`
#### Snippet
```java
        assets.forEach(asset -> assetsToBePublished.put(asset.getFilename(), asset));

        assetsToBePublished.keySet().forEach(name -> {
            if (existingAssets.containsKey(name)) {
                assetsToBeUpdated.add(assetsToBePublished.get(name));
```

## OctalLiteral
### OctalLiteral
Octal integer `0100755`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java

                if (inputFile.isFile() && Files.isExecutable(file)) {
                    archiveEntry.setMode(0100755);
                }

```

### OctalLiteral
Octal integer `0100755`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
                    archiveEntry.setMethod(ZipOutputStream.DEFLATED);
                    if (inputFile.isFile() && Files.isExecutable(file)) {
                        archiveEntry.setUnixMode(0100755);
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

## RegExpSimplifiable
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

## SizeReplaceableByIsEmpty
### SizeReplaceableByIsEmpty
`str.length() == 0` can be replaced with 'str.isEmpty()'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
     */
    public static boolean isBlank(String str) {
        if (str == null || str.length() == 0) {
            return true;
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
                if (token == null || token.length() == 0) {
                    continue;
                }
```

### SizeReplaceableByIsEmpty
`string.length() == 0` can be replaced with 'string.isEmpty()'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java

    private static String applyQuotes(String string) {
        if (string == null || string.length() == 0) {
            return "\"\"";
        }
```

### SizeReplaceableByIsEmpty
`token.length() == 0` can be replaced with 'token.isEmpty()'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
            String[] tokens = name.split("-");
            for (String token : tokens) {
                if (token == null || token.length() == 0) {
                    continue;
                }
```

### SizeReplaceableByIsEmpty
`name.length() > 0` can be replaced with '!name.isEmpty()'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
    public static String getClassNameRepresentation(String name) {
        StringBuilder buf = new StringBuilder();
        if (name != null && name.length() > 0) {
            String[] tokens = name.split("[^\\w\\d]");
            for (String token1 : tokens) {
```

### SizeReplaceableByIsEmpty
`extensionManagers.size() == 0` can be replaced with 'extensionManagers.isEmpty()'
in `api/jreleaser-model-api/src/main/java/org/jreleaser/extensions/api/ExtensionManagerHolder.java`
#### Snippet
```java
                .collect(toList());

            if (extensionManagers.size() == 0) {
                // Should never happen!
                throw new IllegalStateException(RB.$("ERROR_extension_manager_load"));
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
`tokens.size() > 0` can be replaced with '!tokens.isEmpty()'
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
        }

        if (tokens.size() > 0 && tokens.get(tokens.size() - 1).endsWith(MODIFIER_OP2)) {
            String sep = tokens.remove(tokens.size() - 2);
            String mod = "(?:" + sep + PATTERNS.get(MODIFIER_OP);
```

### SizeReplaceableByIsEmpty
`hooks.size() > 0` can be replaced with '!hooks.isEmpty()'
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/hooks/CommandHookExecutor.java`
#### Snippet
```java
        }

        if (hooks.size() > 0) {
            context.getLogger().info(RB.$("hooks.execution"), event.getType().name().toLowerCase(Locale.ENGLISH), hooks.size());
        }
```

### SizeReplaceableByIsEmpty
`activeArtifacts.size() == 0` can be replaced with 'activeArtifacts.isEmpty()'
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/AbstractPackagerProcessor.java`
#### Snippet
```java
            .collect(Collectors.toList());

        if (activeArtifacts.size() == 0) {
            // we can't proceed
            context.getLogger().warn(RB.$("packager.no.matching.artifacts"),
```

### SizeReplaceableByIsEmpty
`jpackage.getRuntimeImages().size() > 0` can be replaced with '!jpackage.getRuntimeImages().isEmpty()'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/JpackageAssemblerValidator.java`
#### Snippet
```java
            }

            if (jpackage.getRuntimeImages().size() > 0 && jpackage.getRuntimeImages().size() != candidateRuntimeImages.size()) {
                errors.configuration(RB.$("validation_jpackage_jlink_application", jpackage.getName()));
            }
```

### SizeReplaceableByIsEmpty
`jpackage.getRuntimeImages().size() > 0` can be replaced with '!jpackage.getRuntimeImages().isEmpty()'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/JpackageAssemblerValidator.java`
#### Snippet
```java
            }

            if (jpackage.getRuntimeImages().size() > 0 && count != candidateRuntimeImages.size()) {
                errors.configuration(RB.$("validation_jpackage_jlink_application", jpackage.getName()));
            }
```

### SizeReplaceableByIsEmpty
`jpackage.getRuntimeImages().size() == 0` can be replaced with 'jpackage.getRuntimeImages().isEmpty()'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/JpackageAssemblerValidator.java`
#### Snippet
```java
        }

        if (jpackage.getRuntimeImages().size() == 0) {
            errors.configuration(RB.$("validation_jpackage_runtime_images_missing", jpackage.getName()));
            return;
```

### SizeReplaceableByIsEmpty
`candidateArtifacts.size() == 0` can be replaced with 'candidateArtifacts.isEmpty()'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/MacportsPackagerValidator.java`
#### Snippet
```java

        List<Artifact> candidateArtifacts = packager.resolveCandidateArtifacts(context, distribution);
        if (candidateArtifacts.size() == 0) {
            packager.setActive(Active.NEVER);
            context.getLogger().debug(RB.$("validation.disabled.no.artifacts"));
```

### SizeReplaceableByIsEmpty
`candidateArtifacts.size() == 0` can be replaced with 'candidateArtifacts.isEmpty()'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/ChocolateyPackagerValidator.java`
#### Snippet
```java

        List<Artifact> candidateArtifacts = packager.resolveCandidateArtifacts(context, distribution);
        if (candidateArtifacts.size() == 0) {
            packager.setActive(Active.NEVER);
            context.getLogger().debug(RB.$("validation.disabled.no.artifacts"));
```

### SizeReplaceableByIsEmpty
`candidateArtifacts.size() == 0` can be replaced with 'candidateArtifacts.isEmpty()'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/GofishPackagerValidator.java`
#### Snippet
```java

        List<Artifact> candidateArtifacts = packager.resolveCandidateArtifacts(context, distribution);
        if (candidateArtifacts.size() == 0) {
            packager.setActive(Active.NEVER);
            context.getLogger().debug(RB.$("validation.disabled.no.artifacts"));
```

### SizeReplaceableByIsEmpty
`candidateArtifacts.size() == 0` can be replaced with 'candidateArtifacts.isEmpty()'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/SdkmanPackagerValidator.java`
#### Snippet
```java

        List<Artifact> candidateArtifacts = packager.resolveCandidateArtifacts(context, distribution);
        if (candidateArtifacts.size() == 0) {
            packager.setActive(Active.NEVER);
            context.getLogger().debug(RB.$("validation.disabled.no.artifacts"));
```

### SizeReplaceableByIsEmpty
`candidateArtifacts.size() == 0` can be replaced with 'candidateArtifacts.isEmpty()'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/SnapPackagerValidator.java`
#### Snippet
```java

        List<Artifact> candidateArtifacts = packager.resolveCandidateArtifacts(context, distribution);
        if (candidateArtifacts.size() == 0) {
            packager.setActive(Active.NEVER);
            context.getLogger().debug(RB.$("validation.disabled.no.artifacts"));
```

### SizeReplaceableByIsEmpty
`candidateArtifacts.size() == 0` can be replaced with 'candidateArtifacts.isEmpty()'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/AsdfPackagerValidator.java`
#### Snippet
```java

        List<Artifact> candidateArtifacts = packager.resolveCandidateArtifacts(context, distribution);
        if (candidateArtifacts.size() == 0) {
            packager.setActive(Active.NEVER);
            context.getLogger().debug(RB.$("validation.disabled.no.artifacts"));
```

### SizeReplaceableByIsEmpty
`candidateArtifacts.size() == 0` can be replaced with 'candidateArtifacts.isEmpty()'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/SpecPackagerValidator.java`
#### Snippet
```java

        List<Artifact> candidateArtifacts = packager.resolveCandidateArtifacts(context, distribution);
        if (candidateArtifacts.size() == 0) {
            packager.setActive(Active.NEVER);
            context.getLogger().debug(RB.$("validation.disabled.no.artifacts"));
```

### SizeReplaceableByIsEmpty
`candidateArtifacts.size() == 0` can be replaced with 'candidateArtifacts.isEmpty()'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/DockerPackagerValidator.java`
#### Snippet
```java

        List<Artifact> candidateArtifacts = packager.resolveCandidateArtifacts(context, distribution);
        if (candidateArtifacts.size() == 0) {
            packager.setActive(Active.NEVER);
            context.getLogger().debug(RB.$("validation.disabled.no.artifacts"));
```

### SizeReplaceableByIsEmpty
`candidateArtifacts.size() == 0` can be replaced with 'candidateArtifacts.isEmpty()'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/ScoopPackagerValidator.java`
#### Snippet
```java

        List<Artifact> candidateArtifacts = packager.resolveCandidateArtifacts(context, distribution);
        if (candidateArtifacts.size() == 0) {
            packager.setActive(Active.NEVER);
            context.getLogger().debug(RB.$("validation.disabled.no.artifacts"));
```

### SizeReplaceableByIsEmpty
`candidateArtifacts.size() == 0` can be replaced with 'candidateArtifacts.isEmpty()'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/BrewPackagerValidator.java`
#### Snippet
```java
        validateCask(context, distribution, packager, cask, errors);
        List<Artifact> candidateArtifacts = packager.resolveCandidateArtifacts(context, distribution);
        if (candidateArtifacts.size() == 0) {
            packager.setActive(Active.NEVER);
            context.getLogger().debug(RB.$("validation.disabled.no.artifacts"));
```

### SizeReplaceableByIsEmpty
`candidateArtifacts.size() == 0` can be replaced with 'candidateArtifacts.isEmpty()'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/AppImagePackagerValidator.java`
#### Snippet
```java

        List<Artifact> candidateArtifacts = packager.resolveCandidateArtifacts(context, distribution);
        if (candidateArtifacts.size() == 0) {
            packager.setActive(Active.NEVER);
            context.getLogger().debug(RB.$("validation.disabled.no.artifacts"));
```

### SizeReplaceableByIsEmpty
`candidateArtifacts.size() == 0` can be replaced with 'candidateArtifacts.isEmpty()'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/FlatpakPackagerValidator.java`
#### Snippet
```java

        List<Artifact> candidateArtifacts = packager.resolveCandidateArtifacts(context, distribution);
        if (candidateArtifacts.size() == 0) {
            packager.setActive(Active.NEVER);
            context.getLogger().debug(RB.$("validation.disabled.no.artifacts"));
```

### SizeReplaceableByIsEmpty
`values.size() > 0` can be replaced with '!values.isEmpty()'
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/internal/Page.java`
#### Snippet
```java
    private int resolveInt(Map<String, Collection<String>> headers, String key) {
        Collection<String> values = headers.get(key);
        if (values != null && values.size() > 0) {
            try {
                return Integer.parseInt(values.iterator().next());
```

### SizeReplaceableByIsEmpty
`input.size() > 0` can be replaced with '!input.isEmpty()'
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/Links.java`
#### Snippet
```java

    public static Links of(Collection<String> input) {
        return new Links(null != input && input.size() > 0 ? input.iterator().next() : "");
    }
}
```

## DuplicateExpressions
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

### DuplicateExpressions
Multiple occurrences of `Paths.get(input)`
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpArtifactDownloader.java`
#### Snippet
```java
    private void downloadAsset(String name, Downloader.Asset asset) throws DownloadException {
        String input = asset.getResolvedInput(context, downloader);
        String output = asset.getResolvedOutput(context, downloader, Paths.get(input).getFileName().toString());

        if (isBlank(output)) {
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(input)`
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpArtifactDownloader.java`
#### Snippet
```java

        if (isBlank(output)) {
            output = Paths.get(input).getFileName().toString();
        }

```

## StringBufferReplaceableByString
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `sdks/jreleaser-nexus2-java-sdk/src/main/java/org/jreleaser/sdk/nexus2/Nexus2.java`
#### Snippet
```java
            headers.put("Authorization", "Basic " + auth);

            String url = new StringBuilder(apiHost)
                .append("/staging/deployByRepositoryId/")
                .append(stagingRepositoryId)
```

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

## NonShortCircuitBoolean
### NonShortCircuitBoolean
Non-short-circuit boolean expression `matched &= PlatformUtils.isCompatible(String.valueOf(e.getValue()), artifact.getPlatform())`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerSpec.java`
#### Snippet
```java
            String key = e.getKey();
            if ("platform".equals(key)) {
                matched &= PlatformUtils.isCompatible(String.valueOf(e.getValue()), artifact.getPlatform());
            } else if (artifact.getExtraProperties().containsKey(key)) {
                matched &= e.getValue().equals(artifact.getExtraProperties().get(key));
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `matched &= e.getValue().equals(artifact.getExtraProperties().get(key))`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerSpec.java`
#### Snippet
```java
                matched &= PlatformUtils.isCompatible(String.valueOf(e.getValue()), artifact.getPlatform());
            } else if (artifact.getExtraProperties().containsKey(key)) {
                matched &= e.getValue().equals(artifact.getExtraProperties().get(key));
            }
        }
```

## ManualMinMaxCalculation
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
        }

        folderIndex = folderIndex < 0 ? 0 : folderIndex;

        return path.substring(folderIndex, extIndex);
```

## TrivialStringConcatenation
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
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java

    private static String getPadding(String padding, int length) {
        return padding.length() < length ? times(padding, length / padding.length() + 1).substring(0, length) : "" + padding.subSequence(0, length);
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/ClientUtils.java`
#### Snippet
```java
            connection.addRequestProperty("Accept", "*/*");
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
                        if (!JReleaserOutput.isQuiet()) out.println(BANNER.banner);
                    }
                    writeQuietly(markerFile, (count + 1) + "");
                } catch (NumberFormatException e) {
                    writeQuietly(markerFile, "1");
```

### TrivialStringConcatenation
Empty string used in concatenation
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Init.java`
#### Snippet
```java
            String content = IOUtils.toString(template.getReader());
            LocalDate now = LocalDate.now();
            content = content.replaceAll("@year@", now.getYear() + "");

            logger.info($("jreleaser.init.TEXT_writing_file"), outputFile.toAbsolutePath());
```

### TrivialStringConcatenation
Empty string used in concatenation
in `plugins/jdks-maven-plugin/src/main/java/org/jreleaser/jdks/maven/plugin/Banner.java`
#### Snippet
```java
                        System.out.println(BANNER.banner);
                    }
                    writeQuietly(markerFile, (count + 1) + "");
                } catch (NumberFormatException e) {
                    writeQuietly(markerFile, "1");
```

### TrivialStringConcatenation
Empty string used in concatenation
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/Banner.java`
#### Snippet
```java
                        writer.println(BANNER.banner);
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
                        if (!quiet) System.out.println(BANNER.banner);
                    }
                    writeQuietly(markerFile, (count + 1) + "");
                } catch (NumberFormatException e) {
                    writeQuietly(markerFile, "1");
```

## ConstantConditions
### ConstantConditions
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

### ConstantConditions
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

### ConstantConditions
Value `p` is always 'null'
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
            Matcher m = O.matcher(s);
            if (m.matches()) {
                return new JavaRuntimeVersion(v, p, b, m.group(1), O);
            }

```

### ConstantConditions
Value `b` is always 'null'
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
            Matcher m = O.matcher(s);
            if (m.matches()) {
                return new JavaRuntimeVersion(v, p, b, m.group(1), O);
            }

```

### ConstantConditions
Value `b` is always 'null'
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/JavaRuntimeVersion.java`
#### Snippet
```java
            m = PO.matcher(s);
            if (m.matches()) {
                return new JavaRuntimeVersion(v, m.group(1), b, m.group(2), PO);
            }

```

### ConstantConditions
Condition `tokens.size() > 0` is always `true`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
        }

        if (tokens.size() > 0 && tokens.get(tokens.size() - 1).endsWith(MODIFIER_OP2)) {
            String sep = tokens.remove(tokens.size() - 2);
            String mod = "(?:" + sep + PATTERNS.get(MODIFIER_OP);
```

### ConstantConditions
Condition `!failure` is always `true`
in `core/jreleaser-engine/src/main/java/org/jreleaser/workflow/WorkflowImpl.java`
#### Snippet
```java
                }

                if (!failure) {
                    try {
                        context.fireWorkflowEvent(ExecutionEvent.success(item.getCommand().toStep()));
```

### ConstantConditions
Value `failure` is always 'false'
in `core/jreleaser-engine/src/main/java/org/jreleaser/workflow/WorkflowImpl.java`
#### Snippet
```java
                }

                if (!failure) {
                    try {
                        context.fireWorkflowEvent(ExecutionEvent.success(item.getCommand().toStep()));
```

### ConstantConditions
Dereference of `assets.toFile().listFiles()` may produce `NullPointerException`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/spi/release/AbstractReleaserBuilder.java`
#### Snippet
```java
    public ReleaserBuilder<R> addReleaseAssets(Path assets) {
        if (assets.toFile().exists()) {
            for (File asset : assets.toFile().listFiles()) {
                addReleaseAsset(Asset.file(Artifact.of(asset.toPath().toAbsolutePath())));
            }
```

### ConstantConditions
Value `b` is always 'true'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
        if ("true".equalsIgnoreCase(s) || "false".equalsIgnoreCase(s)) {
            boolean b = Boolean.valueOf(s);
            return b ? green(String.valueOf(b)) : red(String.valueOf(b));
        } else {
            return null;
```

### ConstantConditions
Value `b` is always 'false'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
        if ("true".equalsIgnoreCase(s) || "false".equalsIgnoreCase(s)) {
            boolean b = Boolean.valueOf(s);
            return b ? green(String.valueOf(b)) : red(String.valueOf(b));
        } else {
            return null;
```

### ConstantConditions
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

### ConstantConditions
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

### ConstantConditions
Value `value` is always 'null'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
        }

        return String.valueOf(value);
    }

```

### ConstantConditions
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

### ConstantConditions
Dereference of `templateDirectoryFile.listFiles()` may produce `NullPointerException`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/ArticleAnnouncerValidator.java`
#### Snippet
```java
        }

        if (templateDirectoryFile.listFiles() == null || templateDirectoryFile.listFiles().length == 0) {
            errors.configuration(RB.$("validation_directory_is_empty", "announce.article.templateDirectory", article.getTemplateDirectory()));
        }
```

### ConstantConditions
Method invocation `extension` may produce `NullPointerException`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/JlinkAssemblerResolver.java`
#### Snippet
```java

            Path image = baseOutputDirectory
                .resolve(imageName + "-" + platformReplaced + "." + archiveFormat.extension())
                .toAbsolutePath();

```

### ConstantConditions
Condition `!date && !integer` is always `false`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/ChocolateyPackagerValidator.java`
#### Snippet
```java
        }

        if (!date && !integer) {
            throw new IllegalArgumentException();
        }
```

### ConstantConditions
Condition `!integer` is always `false` when reached
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/ChocolateyPackagerValidator.java`
#### Snippet
```java
        }

        if (!date && !integer) {
            throw new IllegalArgumentException();
        }
```

### ConstantConditions
Value `integer` is always 'true'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/ChocolateyPackagerValidator.java`
#### Snippet
```java
        }

        if (!date && !integer) {
            throw new IllegalArgumentException();
        }
```

### ConstantConditions
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

### ConstantConditions
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

### ConstantConditions
Argument `basedir` might be null
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/GitSdk.java`
#### Snippet
```java
        }

        throw new RepositoryNotFoundException(basedir);
    }

```

### ConstantConditions
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

### ConstantConditions
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

### ConstantConditions
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

### ConstantConditions
Argument `sftp` might be null
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/SftpArtifactUploader.java`
#### Snippet
```java
            }
        } finally {
            close(uploader, sftp);
            disconnect(uploader, ssh);
        }
```

### ConstantConditions
Method invocation `findStagingProfileId` may produce `NullPointerException`
in `sdks/jreleaser-nexus2-java-sdk/src/main/java/org/jreleaser/sdk/nexus2/Nexus2MavenDeployer.java`
#### Snippet
```java
            try {
                context.getLogger().info(RB.$("nexus.lookup.staging.profile", groupId));
                stagingProfileId = nexus.findStagingProfileId(groupId);
            } catch (Nexus2Exception e) {
                context.getLogger().trace(e);
```

### ConstantConditions
Method invocation `deploy` may produce `NullPointerException`
in `sdks/jreleaser-nexus2-java-sdk/src/main/java/org/jreleaser/sdk/nexus2/Nexus2MavenDeployer.java`
#### Snippet
```java
            if (!context.isDryrun()) {
                try {
                    nexus.deploy(stagingRepositoryId, deployable.getPath(), deployable.getLocalPath());
                } catch (Nexus2Exception e) {
                    context.getLogger().trace(e);
```

### ConstantConditions
Method invocation `closeStagingRepository` may produce `NullPointerException`
in `sdks/jreleaser-nexus2-java-sdk/src/main/java/org/jreleaser/sdk/nexus2/Nexus2MavenDeployer.java`
#### Snippet
```java
                try {
                    context.getLogger().info(RB.$("nexus.close.repository", stagingRepositoryId));
                    nexus.closeStagingRepository(stagingProfileId, stagingRepositoryId, groupId);
                } catch (Nexus2Exception e) {
                    context.getLogger().trace(e);
```

### ConstantConditions
Method invocation `releaseStagingRepository` may produce `NullPointerException`
in `sdks/jreleaser-nexus2-java-sdk/src/main/java/org/jreleaser/sdk/nexus2/Nexus2MavenDeployer.java`
#### Snippet
```java
                try {
                    context.getLogger().info(RB.$("nexus.release.repository", stagingRepositoryId));
                    nexus.releaseStagingRepository(stagingProfileId, stagingRepositoryId, groupId);
                } catch (Nexus2Exception e) {
                    context.getLogger().trace(e);
```

### ConstantConditions
Variable is already assigned to this value
in `sdks/jreleaser-twitter-java-sdk/src/main/java/org/jreleaser/sdk/twitter/UpdateStatusTwitterCommand.java`
#### Snippet
```java
        public UpdateStatusTwitterCommand build() {
            validate();
            this.statuses = (List<String>) requireNonEmpty(statuses, "'statuses' must not be empty");

            return new UpdateStatusTwitterCommand(
```

### ConstantConditions
Argument `Algorithm.of(algo)` might be null
in `plugins/jdks-maven-plugin/src/main/java/org/jreleaser/jdks/maven/plugin/JdkHelper.java`
#### Snippet
```java
            // calculate checksum
            Path input = new File(jdkExtractDirectory, filename).toPath();
            String calculatedChecksum = ChecksumUtils.checksum(Algorithm.of(algo), Files.readAllBytes(input));

            // verify checksum
```

## AbstractClassNeverImplemented
### AbstractClassNeverImplemented
Abstract class `FilesValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/files/FilesValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class FilesValidator extends Validator {
    public static void validateFiles(JReleaserContext context, Mode mode, Errors errors) {
        if (!mode.validateConfig()) {
```

### AbstractClassNeverImplemented
Abstract class `HooksValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/hooks/HooksValidator.java`
#### Snippet
```java
 * @since 1.2.0
 */
public abstract class HooksValidator extends Validator {
    public static void validateHooks(JReleaserContext context, Mode mode, Errors errors) {
        context.getLogger().debug("hooks");
```

### AbstractClassNeverImplemented
Abstract class `SshValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/common/SshValidator.java`
#### Snippet
```java
 * @since 1.1.0
 */
public abstract class SshValidator extends Validator {
    public static void validateSsh(JReleaserContext context, Ssh ssh, String name,
                                   String envPrefix, String propPrefix, Errors errors) {
```

### AbstractClassNeverImplemented
Abstract class `TemplateValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/common/TemplateValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class TemplateValidator extends Validator {
    public static void validateTemplate(JReleaserContext context, Distribution distribution,
                                        TemplatePackager packager, TemplatePackager parentPackager, Errors errors) {
```

### AbstractClassNeverImplemented
Abstract class `ExtraPropertiesValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/common/ExtraPropertiesValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class ExtraPropertiesValidator extends Validator {
    public static void mergeExtraProperties(ExtraProperties self, ExtraProperties common) {
        Map<String, Object> extraProperties = new LinkedHashMap<>(common.getExtraProperties());
```

### AbstractClassNeverImplemented
Abstract class `CommandHooksValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/hooks/CommandHooksValidator.java`
#### Snippet
```java
 * @since 1.2.0
 */
public abstract class CommandHooksValidator extends Validator {
    public static void validateCommandHooks(JReleaserContext context, Mode mode, Errors errors) {
        context.getLogger().debug("hooks.command");
```

### AbstractClassNeverImplemented
Abstract class `DeployValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/deploy/DeployValidator.java`
#### Snippet
```java
 * @since 1.3.0
 */
public abstract class DeployValidator extends Validator {
    public static void validateDeploy(JReleaserContext context, Mode mode, Errors errors) {
        context.getLogger().debug("deploy");
```

### AbstractClassNeverImplemented
Abstract class `GiteaMavenDeployerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/deploy/maven/GiteaMavenDeployerValidator.java`
#### Snippet
```java
 * @since 1.3.0
 */
public abstract class GiteaMavenDeployerValidator extends Validator {
    public static void validateGiteaMavenDeployer(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, GiteaMavenDeployer> gitea = context.getModel().getDeploy().getMaven().getGitea();
```

### AbstractClassNeverImplemented
Abstract class `Nexus2MavenDeployerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/deploy/maven/Nexus2MavenDeployerValidator.java`
#### Snippet
```java
 * @since 1.3.0
 */
public abstract class Nexus2MavenDeployerValidator extends Validator {
    public static void validateNexus2MavenDeployer(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, Nexus2MavenDeployer> artifactory = context.getModel().getDeploy().getMaven().getNexus2();
```

### AbstractClassNeverImplemented
Abstract class `GitlabMavenDeployerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/deploy/maven/GitlabMavenDeployerValidator.java`
#### Snippet
```java
 * @since 1.3.0
 */
public abstract class GitlabMavenDeployerValidator extends Validator {
    public static void validateGitlabMavenDeployer(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, GitlabMavenDeployer> gitlab = context.getModel().getDeploy().getMaven().getGitlab();
```

### AbstractClassNeverImplemented
Abstract class `ArtifactoryMavenDeployerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/deploy/maven/ArtifactoryMavenDeployerValidator.java`
#### Snippet
```java
 * @since 1.3.0
 */
public abstract class ArtifactoryMavenDeployerValidator extends Validator {
    public static void validateArtifactoryMavenDeployer(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, ArtifactoryMavenDeployer> artifactory = context.getModel().getDeploy().getMaven().getArtifactory();
```

### AbstractClassNeverImplemented
Abstract class `GithubMavenDeployerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/deploy/maven/GithubMavenDeployerValidator.java`
#### Snippet
```java
 * @since 1.3.0
 */
public abstract class GithubMavenDeployerValidator extends Validator {
    public static void validateGithubMavenDeployer(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, GithubMavenDeployer> github = context.getModel().getDeploy().getMaven().getGithub();
```

### AbstractClassNeverImplemented
Abstract class `SftpUploaderValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/upload/SftpUploaderValidator.java`
#### Snippet
```java
 * @since 1.1.0
 */
public abstract class SftpUploaderValidator extends Validator {
    public static void validateSftpUploader(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, SftpUploader> sftp = context.getModel().getUpload().getSftp();
```

### AbstractClassNeverImplemented
Abstract class `MavenDeployersValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/deploy/maven/MavenDeployersValidator.java`
#### Snippet
```java
 * @since 1.3.0
 */
public abstract class MavenDeployersValidator extends Validator {
    public static void validateMavenDeployers(JReleaserContext context, Mode mode, Errors errors) {
        Maven maven = context.getModel().getDeploy().getMaven();
```

### AbstractClassNeverImplemented
Abstract class `GitlabUploaderValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/upload/GitlabUploaderValidator.java`
#### Snippet
```java
 * @since 1.2.0
 */
public abstract class GitlabUploaderValidator extends Validator {
    public static void validateGitlabUploader(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, GitlabUploader> gitlab = context.getModel().getUpload().getGitlab();
```

### AbstractClassNeverImplemented
Abstract class `FtpUploaderValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/upload/FtpUploaderValidator.java`
#### Snippet
```java
 * @since 1.1.0
 */
public abstract class FtpUploaderValidator extends Validator {
    public static void validateFtpUploader(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, FtpUploader> ftp = context.getModel().getUpload().getFtp();
```

### AbstractClassNeverImplemented
Abstract class `UploadersValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/upload/UploadersValidator.java`
#### Snippet
```java
 * @since 0.3.0
 */
public abstract class UploadersValidator extends Validator {
    public static void validateUploaders(JReleaserContext context, Mode mode, Errors errors) {
        Upload upload = context.getModel().getUpload();
```

### AbstractClassNeverImplemented
Abstract class `GiteaUploaderValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/upload/GiteaUploaderValidator.java`
#### Snippet
```java
 * @since 1.2.0
 */
public abstract class GiteaUploaderValidator extends Validator {
    public static void validateGiteaUploader(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, GiteaUploader> gitea = context.getModel().getUpload().getGitea();
```

### AbstractClassNeverImplemented
Abstract class `ScpUploaderValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/upload/ScpUploaderValidator.java`
#### Snippet
```java
 * @since 1.1.0
 */
public abstract class ScpUploaderValidator extends Validator {
    public static void validateScpUploader(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, ScpUploader> scp = context.getModel().getUpload().getScp();
```

### AbstractClassNeverImplemented
Abstract class `ArtifactoryUploaderValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/upload/ArtifactoryUploaderValidator.java`
#### Snippet
```java
 * @since 0.3.0
 */
public abstract class ArtifactoryUploaderValidator extends Validator {
    public static void validateArtifactory(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, ArtifactoryUploader> artifactory = context.getModel().getUpload().getArtifactory();
```

### AbstractClassNeverImplemented
Abstract class `HttpUploaderValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/upload/HttpUploaderValidator.java`
#### Snippet
```java
 * @since 0.4.0
 */
public abstract class HttpUploaderValidator extends Validator {
    public static void validateHttpUploader(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, HttpUploader> http = context.getModel().getUpload().getHttp();
```

### AbstractClassNeverImplemented
Abstract class `GithubReleaserValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/release/GithubReleaserValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class GithubReleaserValidator extends BaseReleaserValidator {
    public static boolean validateGithub(JReleaserContext context, Mode mode, GithubReleaser github, Errors errors) {
        if (null == github) return false;
```

### AbstractClassNeverImplemented
Abstract class `ReleaseValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/release/ReleaseValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class ReleaseValidator extends Validator {
    public static void validateRelease(JReleaserContext context, Mode mode, Errors errors) {
        context.getLogger().debug("release");
```

### AbstractClassNeverImplemented
Abstract class `GiteaReleaserValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/release/GiteaReleaserValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class GiteaReleaserValidator extends BaseReleaserValidator {
    public static boolean validateGitea(JReleaserContext context, Mode mode, GiteaReleaser gitea, Errors errors) {
        if (null == gitea) return false;
```

### AbstractClassNeverImplemented
Abstract class `GitlabReleaserValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/release/GitlabReleaserValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class GitlabReleaserValidator extends BaseReleaserValidator {
    public static boolean validateGitlab(JReleaserContext context, Mode mode, GitlabReleaser gitlab, Errors errors) {
        if (null == gitlab) return false;
```

### AbstractClassNeverImplemented
Abstract class `S3UploaderValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/upload/S3UploaderValidator.java`
#### Snippet
```java
 * @since 0.3.0
 */
public abstract class S3UploaderValidator extends Validator {
    public static void validateS3(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, S3Uploader> s3 = context.getModel().getUpload().getS3();
```

### AbstractClassNeverImplemented
Abstract class `GenericGitReleaserValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/release/GenericGitReleaserValidator.java`
#### Snippet
```java
 * @since 0.4.0
 */
public abstract class GenericGitReleaserValidator extends BaseReleaserValidator {
    public static boolean validateGeneric(JReleaserContext context, Mode mode, GenericGitReleaser generic, Errors errors) {
        if (null == generic) return false;
```

### AbstractClassNeverImplemented
Abstract class `CodebergReleaserValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/release/CodebergReleaserValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class CodebergReleaserValidator extends BaseReleaserValidator {
    public static boolean validateCodeberg(JReleaserContext context, Mode mode, CodebergReleaser codeberg, Errors errors) {
        if (null == codeberg) return false;
```

### AbstractClassNeverImplemented
Abstract class `DiscourseAnnouncerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/DiscourseAnnouncerValidator.java`
#### Snippet
```java
 * @since 1.3.0
 */
public abstract class DiscourseAnnouncerValidator extends Validator {
    private static final String DEFAULT_DISCOURSE_TPL = "src/jreleaser/templates/discourse.tpl";

```

### AbstractClassNeverImplemented
Abstract class `SigningValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/signing/SigningValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class SigningValidator extends Validator {
    public static void validateSigning(JReleaserContext context, Mode mode, Errors errors) {
        if (!mode.validateConfig()) {
```

### AbstractClassNeverImplemented
Abstract class `SdkmanAnnouncerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/SdkmanAnnouncerValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class SdkmanAnnouncerValidator extends Validator {
    public static void validateSdkmanAnnouncer(JReleaserContext context, SdkmanAnnouncer sdkman, Errors errors) {
        context.getLogger().debug("announce.sdkman");
```

### AbstractClassNeverImplemented
Abstract class `TelegramAnnouncerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/TelegramAnnouncerValidator.java`
#### Snippet
```java
 * @since 0.8.0
 */
public abstract class TelegramAnnouncerValidator extends Validator {
    private static final String DEFAULT_TELEGRAM_TPL = "src/jreleaser/templates/telegram.tpl";

```

### AbstractClassNeverImplemented
Abstract class `TwitterAnnouncerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/TwitterAnnouncerValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class TwitterAnnouncerValidator extends Validator {
    public static void validateTwitter(JReleaserContext context, TwitterAnnouncer twitter, Errors errors) {
        context.getLogger().debug("announce.twitter");
```

### AbstractClassNeverImplemented
Abstract class `ZulipAnnouncerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/ZulipAnnouncerValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class ZulipAnnouncerValidator extends Validator {
    private static final String DEFAULT_ZULIP_TPL = "src/jreleaser/templates/zulip.tpl";

```

### AbstractClassNeverImplemented
Abstract class `DiscussionsAnnouncerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/DiscussionsAnnouncerValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class DiscussionsAnnouncerValidator extends Validator {
    private static final String DEFAULT_DISCUSSIONS_TPL = "src/jreleaser/templates/discussions.tpl";

```

### AbstractClassNeverImplemented
Abstract class `GitterAnnouncerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/GitterAnnouncerValidator.java`
#### Snippet
```java
 * @since 0.2.0
 */
public abstract class GitterAnnouncerValidator extends Validator {
    private static final String DEFAULT_GITTER_TPL = "src/jreleaser/templates/gitter.tpl";

```

### AbstractClassNeverImplemented
Abstract class `ProjectValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/project/ProjectValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class ProjectValidator extends Validator {
    public static void validateProject(JReleaserContext context, Mode mode, Errors errors) {
        context.getLogger().debug("project");
```

### AbstractClassNeverImplemented
Abstract class `DiscordAnnouncerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/DiscordAnnouncerValidator.java`
#### Snippet
```java
 * @since 0.2.0
 */
public abstract class DiscordAnnouncerValidator extends Validator {
    private static final String DEFAULT_DISCORD_TPL = "src/jreleaser/templates/discord.tpl";

```

### AbstractClassNeverImplemented
Abstract class `SmtpAnnouncerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/SmtpAnnouncerValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class SmtpAnnouncerValidator extends Validator {
    public static void validateSmtp(JReleaserContext context, SmtpAnnouncer smtp, Errors errors) {
        context.getLogger().debug("announce.mail");
```

### AbstractClassNeverImplemented
Abstract class `SlackAnnouncerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/SlackAnnouncerValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class SlackAnnouncerValidator extends Validator {
    private static final String DEFAULT_SLACK_TPL = "src/jreleaser/templates/slack.tpl";

```

### AbstractClassNeverImplemented
Abstract class `TeamsAnnouncerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/TeamsAnnouncerValidator.java`
#### Snippet
```java
 * @since 0.2.0
 */
public abstract class TeamsAnnouncerValidator extends Validator {
    private static final String DEFAULT_TEAMS_TPL = "src/jreleaser/templates/teams.tpl";

```

### AbstractClassNeverImplemented
Abstract class `MastodonAnnouncerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/MastodonAnnouncerValidator.java`
#### Snippet
```java
 * @since 0.4.0
 */
public abstract class MastodonAnnouncerValidator extends Validator {
    public static void validateMastodon(JReleaserContext context, MastodonAnnouncer mastodon, Errors errors) {
        context.getLogger().debug("announce.mastodon");
```

### AbstractClassNeverImplemented
Abstract class `AnnouncersValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/AnnouncersValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class AnnouncersValidator extends Validator {
    public static void validateAnnouncers(JReleaserContext context, Mode mode, Errors errors) {
        Announce announce = context.getModel().getAnnounce();
```

### AbstractClassNeverImplemented
Abstract class `ArticleAnnouncerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/ArticleAnnouncerValidator.java`
#### Snippet
```java
 * @since 0.6.0
 */
public abstract class ArticleAnnouncerValidator extends Validator {
    public static void validateArticle(JReleaserContext context, ArticleAnnouncer article, Errors errors) {
        context.getLogger().debug("announce.article");
```

### AbstractClassNeverImplemented
Abstract class `GoogleChatAnnouncerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/GoogleChatAnnouncerValidator.java`
#### Snippet
```java
 * @since 0.5.0
 */
public abstract class GoogleChatAnnouncerValidator extends Validator {
    private static final String DEFAULT_GOOGLE_CHAT_TPL = "src/jreleaser/templates/googleChat.tpl";

```

### AbstractClassNeverImplemented
Abstract class `MattermostAnnouncerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/MattermostAnnouncerValidator.java`
#### Snippet
```java
 * @since 0.4.0
 */
public abstract class MattermostAnnouncerValidator extends Validator {
    private static final String DEFAULT_MATTERMOST_TPL = "src/jreleaser/templates/mattermost.tpl";

```

### AbstractClassNeverImplemented
Abstract class `HttpAnnouncerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/HttpAnnouncerValidator.java`
#### Snippet
```java
 * @since 1.3.0
 */
public abstract class HttpAnnouncerValidator extends Validator {
    private static final String DEFAULT_TPL = "src/jreleaser/templates";

```

### AbstractClassNeverImplemented
Abstract class `NativeImageAssemblerResolver` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/NativeImageAssemblerResolver.java`
#### Snippet
```java
 * @since 0.2.0
 */
public abstract class NativeImageAssemblerResolver extends Validator {
    public static void resolveNativeImageOutputs(JReleaserContext context, Errors errors) {
        List<NativeImageAssembler> activeNativeImages = context.getModel().getAssemble().getActiveNativeImages();
```

### AbstractClassNeverImplemented
Abstract class `AssemblersResolver` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/AssemblersResolver.java`
#### Snippet
```java
 * @since 0.2.0
 */
public abstract class AssemblersResolver extends Validator {
    public static void resolveAssemblers(JReleaserContext context, Errors errors) {
        Environment environment = context.getModel().getEnvironment();
```

### AbstractClassNeverImplemented
Abstract class `WebhooksAnnouncerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/WebhooksAnnouncerValidator.java`
#### Snippet
```java
 * @since 0.5.0
 */
public abstract class WebhooksAnnouncerValidator extends Validator {
    private static final String DEFAULT_TPL = "src/jreleaser/templates/";

```

### AbstractClassNeverImplemented
Abstract class `AssemblersValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/AssemblersValidator.java`
#### Snippet
```java
 * @since 0.2.0
 */
public abstract class AssemblersValidator extends Validator {
    public static void validateAssemblers(JReleaserContext context, Mode mode, Errors errors) {
        Assemble assemble = context.getModel().getAssemble();
```

### AbstractClassNeverImplemented
Abstract class `BaseReleaserValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/release/BaseReleaserValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class BaseReleaserValidator extends Validator {
    private static final String DEFAULT_CHANGELOG_TPL = "src/jreleaser/templates/changelog.tpl";

```

### AbstractClassNeverImplemented
Abstract class `ArchiveAssemblerResolver` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/ArchiveAssemblerResolver.java`
#### Snippet
```java
 * @since 0.8.0
 */
public abstract class ArchiveAssemblerResolver extends Validator {
    public static void resolveArchiveOutputs(JReleaserContext context, Errors errors) {
        List<ArchiveAssembler> activeArchives = context.getModel().getAssemble().getActiveArchives();
```

### AbstractClassNeverImplemented
Abstract class `JpackageAssemblerResolver` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/JpackageAssemblerResolver.java`
#### Snippet
```java
 * @since 0.10.0
 */
public abstract class JpackageAssemblerResolver extends Validator {
    public static void resolveJpackageOutputs(JReleaserContext context, Errors errors) {
        List<JpackageAssembler> activeJpackages = context.getModel().getAssemble().getActiveJpackages();
```

### AbstractClassNeverImplemented
Abstract class `ChecksumValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/checksum/ChecksumValidator.java`
#### Snippet
```java
 * @since 0.4.0
 */
public abstract class ChecksumValidator extends Validator {
    public static void validateChecksum(JReleaserContext context, Mode mode, Errors errors) {
        context.getLogger().debug("checksum");
```

### AbstractClassNeverImplemented
Abstract class `JlinkAssemblerResolver` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/JlinkAssemblerResolver.java`
#### Snippet
```java
 * @since 0.2.0
 */
public abstract class JlinkAssemblerResolver extends Validator {
    public static void resolveJlinkOutputs(JReleaserContext context, Errors errors) {
        List<JlinkAssembler> activeJlinks = context.getModel().getAssemble().getActiveJlinks();
```

### AbstractClassNeverImplemented
Abstract class `ArchiveAssemblerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/ArchiveAssemblerValidator.java`
#### Snippet
```java
 * @since 0.8.0
 */
public abstract class ArchiveAssemblerValidator extends Validator {
    public static void validateArchive(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, ArchiveAssembler> archive = context.getModel().getAssemble().getArchive();
```

### AbstractClassNeverImplemented
Abstract class `ScpDownloaderValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/download/ScpDownloaderValidator.java`
#### Snippet
```java
 * @since 1.1.0
 */
public abstract class ScpDownloaderValidator extends Validator {
    public static void validateScpDownloader(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, ScpDownloader> scp = context.getModel().getDownload().getScp();
```

### AbstractClassNeverImplemented
Abstract class `NativeImageAssemblerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/NativeImageAssemblerValidator.java`
#### Snippet
```java
 * @since 0.2.0
 */
public abstract class NativeImageAssemblerValidator extends Validator {
    public static void validateNativeImage(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, NativeImageAssembler> nativeImage = context.getModel().getAssemble().getNativeImage();
```

### AbstractClassNeverImplemented
Abstract class `DownloadersValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/download/DownloadersValidator.java`
#### Snippet
```java
 * @since 1.1.0
 */
public abstract class DownloadersValidator extends Validator {
    public static void validateDownloaders(JReleaserContext context, Mode mode, Errors errors) {
        Download download = context.getModel().getDownload();
```

### AbstractClassNeverImplemented
Abstract class `HttpDownloaderValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/download/HttpDownloaderValidator.java`
#### Snippet
```java
 * @since 1.1.0
 */
public abstract class HttpDownloaderValidator extends Validator {
    public static void validateHttpDownloader(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, HttpDownloader> http = context.getModel().getDownload().getHttp();
```

### AbstractClassNeverImplemented
Abstract class `FtpDownloaderValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/download/FtpDownloaderValidator.java`
#### Snippet
```java
 * @since 1.1.0
 */
public abstract class FtpDownloaderValidator extends Validator {
    public static void validateFtpDownloader(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, FtpDownloader> ftp = context.getModel().getDownload().getFtp();
```

### AbstractClassNeverImplemented
Abstract class `SftpDownloaderValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/download/SftpDownloaderValidator.java`
#### Snippet
```java
 * @since 1.1.0
 */
public abstract class SftpDownloaderValidator extends Validator {
    public static void validateSftpDownloader(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, SftpDownloader> sftp = context.getModel().getDownload().getSftp();
```

### AbstractClassNeverImplemented
Abstract class `JlinkAssemblerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/JlinkAssemblerValidator.java`
#### Snippet
```java
 * @since 0.2.0
 */
public abstract class JlinkAssemblerValidator extends Validator {
    public static void validateJlink(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, JlinkAssembler> jlink = context.getModel().getAssemble().getJlink();
```

### AbstractClassNeverImplemented
Abstract class `JpackageAssemblerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/JpackageAssemblerValidator.java`
#### Snippet
```java
 * @since 0.10.0
 */
public abstract class JpackageAssemblerValidator extends Validator {
    private static final String MAC_IDENTIFIER = "[a-zA-Z0-9][a-zA-Z0-9\\.\\-]*";
    private static final Pattern MAC_IDENTIFIER_PATTERN = Pattern.compile(MAC_IDENTIFIER);
```

### AbstractClassNeverImplemented
Abstract class `MacportsPackagerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/MacportsPackagerValidator.java`
#### Snippet
```java
 * @since 0.9.0
 */
public abstract class MacportsPackagerValidator extends Validator {
    public static void validateMacports(JReleaserContext context, Distribution distribution, MacportsPackager packager, Errors errors) {
        context.getLogger().debug("distribution.{}.macports", distribution.getName());
```

### AbstractClassNeverImplemented
Abstract class `PackagersValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/PackagersValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class PackagersValidator extends Validator {
    public static void validatePackagers(JReleaserContext context, Mode mode, Errors errors) {
        if (!mode.validateConfig()) {
```

### AbstractClassNeverImplemented
Abstract class `GofishPackagerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/GofishPackagerValidator.java`
#### Snippet
```java
 * @since 0.10.0
 */
public abstract class GofishPackagerValidator extends Validator {
    public static void validateGofish(JReleaserContext context, Distribution distribution, GofishPackager packager, Errors errors) {
        context.getLogger().debug("distribution.{}.gofish", distribution.getName());
```

### AbstractClassNeverImplemented
Abstract class `ChocolateyPackagerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/ChocolateyPackagerValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class ChocolateyPackagerValidator extends Validator {
    public static void validateChocolatey(JReleaserContext context, Distribution distribution, ChocolateyPackager packager, Errors errors) {
        context.getLogger().debug("distribution.{}.chocolatey", distribution.getName());
```

### AbstractClassNeverImplemented
Abstract class `SdkmanPackagerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/SdkmanPackagerValidator.java`
#### Snippet
```java
 * @since 0.6.0
 */
public abstract class SdkmanPackagerValidator extends Validator {
    public static void validateSdkman(JReleaserContext context, Distribution distribution, SdkmanPackager packager, Errors errors) {
        context.getLogger().debug("distribution.{}.sdkman", distribution.getName());
```

### AbstractClassNeverImplemented
Abstract class `SnapPackagerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/SnapPackagerValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class SnapPackagerValidator extends Validator {
    public static void validateSnap(JReleaserContext context, Distribution distribution, SnapPackager packager, Errors errors) {
        context.getLogger().debug("distribution.{}.snap", distribution.getName());
```

### AbstractClassNeverImplemented
Abstract class `AsdfPackagerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/AsdfPackagerValidator.java`
#### Snippet
```java
 * @since 1.2.0
 */
public abstract class AsdfPackagerValidator extends Validator {
    public static void validateAsdf(JReleaserContext context, Distribution distribution, AsdfPackager packager, Errors errors) {
        context.getLogger().debug("distribution.{}.asdf", distribution.getName());
```

### AbstractClassNeverImplemented
Abstract class `SpecPackagerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/SpecPackagerValidator.java`
#### Snippet
```java
 * @since 0.9.1
 */
public abstract class SpecPackagerValidator extends Validator {
    public static void validateSpec(JReleaserContext context, Distribution distribution, SpecPackager packager, Errors errors) {
        context.getLogger().debug("distribution.{}.spec", distribution.getName());
```

### AbstractClassNeverImplemented
Abstract class `JbangPackagerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/JbangPackagerValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class JbangPackagerValidator extends Validator {
    public static void validateJbang(JReleaserContext context, Distribution distribution, JbangPackager packager, Errors errors) {
        context.getLogger().debug("distribution.{}.jbang", distribution.getName());
```

### AbstractClassNeverImplemented
Abstract class `DockerPackagerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/DockerPackagerValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class DockerPackagerValidator extends Validator {
    public static void validateDocker(JReleaserContext context, Distribution distribution, DockerPackager packager, Errors errors) {
        String element = "distribution." + distribution.getName() + ".docker";
```

### AbstractClassNeverImplemented
Abstract class `ExtensionsValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/extensions/ExtensionsValidator.java`
#### Snippet
```java
 * @since 1.3.0
 */
public abstract class ExtensionsValidator extends Validator {
    public static void validateExtensions(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, Extension> extensions = context.getModel().getExtensions();
```

### AbstractClassNeverImplemented
Abstract class `ScoopPackagerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/ScoopPackagerValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class ScoopPackagerValidator extends Validator {
    public static void validateScoop(JReleaserContext context, Distribution distribution, ScoopPackager packager, Errors errors) {
        context.getLogger().debug("distribution.{}.scoop", distribution.getName());
```

### AbstractClassNeverImplemented
Abstract class `BrewPackagerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/BrewPackagerValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class BrewPackagerValidator extends Validator {
    public static void validateBrew(JReleaserContext context, Distribution distribution, BrewPackager packager, Errors errors) {
        context.getLogger().debug("distribution.{}.brew", distribution.getName());
```

### AbstractClassNeverImplemented
Abstract class `AppImagePackagerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/AppImagePackagerValidator.java`
#### Snippet
```java
 * @since 1.2.0
 */
public abstract class AppImagePackagerValidator extends Validator {
    public static void validateAppImage(JReleaserContext context, Mode mode, Distribution distribution, AppImagePackager packager, Errors errors) {
        context.getLogger().debug("distribution.{}.appImage", distribution.getName());
```

### AbstractClassNeverImplemented
Abstract class `FlatpakPackagerValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/FlatpakPackagerValidator.java`
#### Snippet
```java
 * @since 1.2.0
 */
public abstract class FlatpakPackagerValidator extends Validator {
    public static void validateFlatpak(JReleaserContext context, Mode mode, Distribution distribution, FlatpakPackager packager, Errors errors) {
        context.getLogger().debug("distribution.{}.flatpak", distribution.getName());
```

### AbstractClassNeverImplemented
Abstract class `DistributionsValidator` has no concrete subclass
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/distributions/DistributionsValidator.java`
#### Snippet
```java
 * @since 0.1.0
 */
public abstract class DistributionsValidator extends Validator {
    public static void validateDistributions(JReleaserContext context, Mode mode, Errors errors) {
        Map<String, Distribution> distributions = context.getModel().getDistributions();
```

## BoundedWildcard
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
Can generalize to `? super SigningUtils.FilePair`
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java
    }

    private static List<SigningUtils.FilePair> collectArtifacts(JReleaserContext context, boolean forceSign, Function<SigningUtils.FilePair, Boolean> validator) {
        List<SigningUtils.FilePair> files = new ArrayList<>();

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
                             Cosign cosign, Path privateKeyFile, byte[] password) throws SigningException {
        Path signaturesDirectory = context.getSignaturesDirectory();
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

    private static void verify(JReleaserContext context, List<SigningUtils.FilePair> files) throws SigningException {
        context.getLogger().debug(RB.$("signing.verify.signatures"), files.size());

```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/SnapPackagerProcessor.java`
#### Snippet
```java

    @Override
    protected void fillPackagerProperties(Map<String, Object> props, Distribution distribution) throws PackagerProcessingException {
        BaseReleaser<?, ?> releaser = context.getModel().getRelease().getReleaser();

```

### BoundedWildcard
Can generalize to `? super String`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java
    }

    public static void safePut(String key, Object value, Map<String, Object> dest, boolean forceKey) {
        if (value != null) {
            dest.put(key, value);
```

### BoundedWildcard
Can generalize to `? super String`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java
    }

    public static void safePut(String key, Object value, Map<String, Object> dest) {
        if (value != null) {
            dest.put(key, value);
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

    public static void safePut(String key, Map<String, Object> src, Map<String, Object> dest, boolean forceKey) {
        if (src.containsKey(key)) {
            dest.put(key, src.get(key));
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
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/SpecPackagerProcessor.java`
#### Snippet
```java
    }

    private void setupJavaBinary(Distribution distribution, Map<String, Object> props) throws PackagerProcessingException {
        Artifact artifact = (Artifact) props.get(KEY_DISTRIBUTION_ARTIFACT);
        Path artifactPath = artifact.getResolvedPath(context, distribution);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/SpecPackagerProcessor.java`
#### Snippet
```java

    @Override
    protected void fillPackagerProperties(Map<String, Object> props, Distribution distribution) throws PackagerProcessingException {
        props.put(KEY_SPEC_PACKAGE_NAME, packager.getPackageName());
        props.put(KEY_SPEC_RELEASE, packager.getRelease());
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/JbangPackagerProcessor.java`
#### Snippet
```java

    @Override
    protected void fillPackagerProperties(Map<String, Object> props, Distribution distribution) throws PackagerProcessingException {
        BaseReleaser<?, ?> releaser = context.getModel().getRelease().getReleaser();

```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/AppImagePackagerProcessor.java`
#### Snippet
```java

    @Override
    protected void fillPackagerProperties(Map<String, Object> props, Distribution distribution) throws PackagerProcessingException {
        props.put(KEY_PROJECT_AUTHORS, context.getModel().getProject().getAuthors());
        props.put(KEY_APPIMAGE_URLS, context.getModel().getProject().getLinks().asLinkTemplates());
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/FlatpakPackagerProcessor.java`
#### Snippet
```java

    @Override
    protected void fillPackagerProperties(Map<String, Object> props, Distribution distribution) throws PackagerProcessingException {
        props.put(KEY_PROJECT_AUTHORS, context.getModel().getProject().getAuthors());
        props.put(KEY_FLATPAK_URLS, context.getModel().getProject().getLinks().asLinkTemplates());
```

### BoundedWildcard
Can generalize to `? extends Path`
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/NativeImageAssemblerProcessor.java`
#### Snippet
```java
    }

    private Artifact nativeImage(Path assembleDirectory, Path graalPath, Set<Path> jars, String imageName) throws AssemblerProcessingException {
        String platform = assembler.getGraal().getPlatform();
        String platformReplaced = assembler.getPlatform().applyReplacements(platform);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/AbstractAssemblerProcessor.java`
#### Snippet
```java
    }

    protected void fillAssemblerProperties(Map<String, Object> props) {
        props.putAll(assembler.props());
    }
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
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/mustache/DefaultMustacheExtensionPoint.java`
#### Snippet
```java
        private final Function<String, String> delegate;

        private DelegatingFunction(Function<String, String> delegate) {
            this.delegate = delegate;
        }
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/AbstractPackagerProcessor.java`
#### Snippet
```java
    }

    protected void safePut(Map<String, Object> dest, String key, Object value) {
        if (value instanceof CharSequence && isNotBlank(String.valueOf(value))) {
            dest.put(key, value);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/AbstractPackagerProcessor.java`
#### Snippet
```java
    }

    protected void fillDistributionProperties(Map<String, Object> props, Distribution distribution) {
        props.putAll(distribution.props());
    }
```

### BoundedWildcard
Can generalize to `? extends Asset`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/spi/release/AbstractReleaserBuilder.java`
#### Snippet
```java

    @Override
    public ReleaserBuilder<R> setReleaseAssets(List<Asset> assets) {
        if (null != assets) {
            this.assets.addAll(assets);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/SdkmanHelper.java`
#### Snippet
```java
    }

    public static void collectArtifacts(JReleaserContext context, Distribution distribution, Map<String, String> platforms) {
        for (Artifact artifact : distribution.getArtifacts()) {
            if (!artifact.isActive()) continue;
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/SdkmanHelper.java`
#### Snippet
```java
    }

    public static void collectArtifacts(JReleaserContext context, Distribution distribution, Map<String, String> platforms) {
        for (Artifact artifact : distribution.getArtifacts()) {
            if (!artifact.isActive()) continue;
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModel.java`
#### Snippet
```java
    }

    private void fillReleaserProperties(Map<String, Object> props, Release release) {
        BaseReleaser service = release.getReleaser();
        props.put(Constants.KEY_REPO_HOST, service.getHost());
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/Nexus2MavenDeployer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("closeRepository", isCloseRepository());
        props.put("releaseRepository", isReleaseRepository());
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
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/HttpUploader.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("authorization", authorization);
        props.put("method", method);
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/AbstractWebUploader.java`
#### Snippet
```java
    }

    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("uploadUrl", uploadUrl);
        props.put("downloadUrl", downloadUrl);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/GiteaUploader.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("host", host);
        props.put("owner", owner);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/GitlabUploader.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("host", host);
        props.put("token", isNotBlank(getResolvedToken()) ? HIDE : UNSET);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/AbstractSshUploader.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("host", isNotBlank(getResolvedHost()) ? HIDE : UNSET);
        props.put("port", getResolvedPort());
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/ArtifactoryUploader.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("authorization", authorization);
        props.put("host", getResolvedHost());
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/S3Uploader.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("region", getResolvedRegion());
        props.put("bucket", getResolvedBucket());
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/TeamsAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("webhook", isNotBlank(getResolvedWebhook()) ? HIDE : UNSET);
        props.put("messageTemplate", messageTemplate);
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/FtpUploader.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("host", getResolvedHost());
        props.put("port", getResolvedPort());
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/SdkmanAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("consumerKey", isNotBlank(getResolvedConsumerKey()) ? HIDE : UNSET);
        props.put("consumerToken", isNotBlank(getResolvedConsumerToken()) ? HIDE : UNSET);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/MastodonAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("host", host);
        props.put("accessToken", isNotBlank(getResolvedAccessToken()) ? HIDE : UNSET);
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java
        }

        public void fillProps(Map<String, Object> props) {
            if (isNotBlank(homepage)) props.put(PROJECT_LINK + "Homepage", homepage);
            if (isNotBlank(documentation)) props.put(PROJECT_LINK + "Documentation", documentation);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/BaseReleaser.java`
#### Snippet
```java
    }

    public void fillProps(Map<String, Object> props, JReleaserModel model) {
        props.put(Constants.KEY_REPO_HOST, host);
        props.put(Constants.KEY_REPO_OWNER, owner);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/TelegramAnnouncer.java`
#### Snippet
```java
    }

    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("token", isNotBlank(getResolvedToken()) ? HIDE : UNSET);
        props.put("chatId", isNotBlank(getResolvedChatId()) ? HIDE : UNSET);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/DiscourseAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("host", host);
        props.put("apiKey", isNotBlank(getResolvedApiKey()) ? HIDE : UNSET);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/GitterAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("webhook", isNotBlank(getResolvedWebhook()) ? HIDE : UNSET);
        props.put("message", message);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/GoogleChatAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("webhook", isNotBlank(getResolvedWebhook()) ? HIDE : UNSET);
        props.put("message", message);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/WebhookAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("webhook", isNotBlank(getResolvedWebhook()) ? HIDE : UNSET);
        props.put("message", message);
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/MattermostAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("webhook", isNotBlank(getResolvedWebhook()) ? HIDE : UNSET);
        props.put("message", message);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/ZulipAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("account", account);
        props.put("apiKey", isNotBlank(getResolvedApiKey()) ? HIDE : UNSET);
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/DiscordAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("webhook", isNotBlank(getResolvedWebhook()) ? HIDE : UNSET);
        props.put("message", message);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/HttpAnnouncers.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        this.httpAnnouncers.values()
            .stream()
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/SlackAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("webhook", isNotBlank(getResolvedWebhook()) ? HIDE : UNSET);
        props.put("token", isNotBlank(getResolvedToken()) ? HIDE : UNSET);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/TwitterAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("consumerKey", isNotBlank(getResolvedConsumerKey()) ? HIDE : UNSET);
        props.put("consumerSecret", isNotBlank(getResolvedConsumerSecret()) ? HIDE : UNSET);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/HttpAnnouncer.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("url", url);
        props.put("authorization", authorization);
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/download/FtpDownloader.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("host", getResolvedHost());
        props.put("port", getResolvedPort());
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/AbstractJavaAssembler.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("executable", executable);
        props.put("templateDirectory", templateDirectory);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/download/AbstractSshDownloader.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("host", isNotBlank(getResolvedHost()) ? HIDE : UNSET);
        props.put("port", getResolvedPort());
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
    }

    public void setAssets(List<Asset> assets) {
        this.assets.clear();
        this.assets.addAll(assets);
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/download/HttpDownloader.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("authorization", authorization);
        props.put("username", isNotBlank(getResolvedUsername()) ? HIDE : UNSET);
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AppImagePackager.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> map) {
        super.asMap(full, map);
        map.put("componentId", componentId);
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AbstractTemplatePackager.java`
#### Snippet
```java
    }

    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("templateDirectory", templateDirectory);
        props.put("skipTemplates", skipTemplates);
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerSpec.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        props.put("matchers", matchers);
        if (artifact != null) {
```

### BoundedWildcard
Can generalize to `? super String`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/FlatpakPackager.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> map) {
        super.asMap(full, map);
        map.put("componentId", componentId);
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SnapPackager.java`
#### Snippet
```java

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {
        super.asMap(full, props);
        props.put("packageName", packageName);
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
Can generalize to `? super String`
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpArtifactUploader.java`
#### Snippet
```java
    }

    private void resolveHeaders(Artifact artifact, Map<String, String> headers) {
        Map<String, Object> props = uploader.artifactProps(context, artifact);
        uploader.getHeaders().forEach((k, v) -> {
```

### BoundedWildcard
Can generalize to `? super String`
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpArtifactUploader.java`
#### Snippet
```java
    }

    private void resolveHeaders(Artifact artifact, Map<String, String> headers) {
        Map<String, Object> props = uploader.artifactProps(context, artifact);
        uploader.getHeaders().forEach((k, v) -> {
```

### BoundedWildcard
Can generalize to `? super String`
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpAnnouncer.java`
#### Snippet
```java
    }

    private void resolveHeaders(org.jreleaser.model.internal.announce.HttpAnnouncer announcer, Map<String, String> headers) {
        Map<String, Object> props = context.props();
        announcer.getHeaders().forEach((k, v) -> {
```

### BoundedWildcard
Can generalize to `? super String`
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpAnnouncer.java`
#### Snippet
```java
    }

    private void resolveHeaders(org.jreleaser.model.internal.announce.HttpAnnouncer announcer, Map<String, String> headers) {
        Map<String, Object> props = context.props();
        announcer.getHeaders().forEach((k, v) -> {
```

### BoundedWildcard
Can generalize to `? extends GtLabel`
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/api/GtIssue.java`
#### Snippet
```java
    }

    public void setLabels(List<GtLabel> labels) {
        if (labels != null) {
            this.labels.clear();
```

### BoundedWildcard
Can generalize to `? extends Asset`
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/Gitea.java`
#### Snippet
```java
    }

    public void updateAssets(String owner, String repo, GtRelease release, List<Asset> assets, Map<String, GtAsset> existingAssets) throws IOException {
        for (Asset asset : assets) {
            if (0 == Files.size(asset.getPath()) || !Files.exists(asset.getPath())) {
```

### BoundedWildcard
Can generalize to `? extends GtAsset`
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/Gitea.java`
#### Snippet
```java
    }

    public void updateAssets(String owner, String repo, GtRelease release, List<Asset> assets, Map<String, GtAsset> existingAssets) throws IOException {
        for (Asset asset : assets) {
            if (0 == Files.size(asset.getPath()) || !Files.exists(asset.getPath())) {
```

### BoundedWildcard
Can generalize to `? extends Asset`
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/Gitea.java`
#### Snippet
```java
    }

    public void uploadAssets(String owner, String repo, GtRelease release, List<Asset> assets) throws IOException {
        for (Asset asset : assets) {
            if (0 == Files.size(asset.getPath()) || !Files.exists(asset.getPath())) {
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
Can generalize to `? extends List`
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/XGithub.java`
#### Snippet
```java
    }

    private void collectPackageVersions(Page<List<GhPackageVersion>> page, List<GhPackageVersion> issues) throws URISyntaxException {
        URI next = new URI(page.getLinks().next());
        logger.debug(next.toString());
```

### BoundedWildcard
Can generalize to `? super GhPackageVersion`
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/XGithub.java`
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

    void uploadAssets(GHRelease release, List<Asset> assets) throws IOException {
        for (Asset asset : assets) {
            if (0 == Files.size(asset.getPath()) || !Files.exists(asset.getPath())) {
```

### BoundedWildcard
Can generalize to `? extends Asset`
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/Github.java`
#### Snippet
```java
    }

    void updateAssets(GHRelease release, List<Asset> assets, Map<String, GHAsset> existingAssets) throws IOException {
        for (Asset asset : assets) {
            if (0 == Files.size(asset.getPath()) || !Files.exists(asset.getPath())) {
```

### BoundedWildcard
Can generalize to `? extends GHAsset`
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/Github.java`
#### Snippet
```java
    }

    void updateAssets(GHRelease release, List<Asset> assets, Map<String, GHAsset> existingAssets) throws IOException {
        for (Asset asset : assets) {
            if (0 == Files.size(asset.getPath()) || !Files.exists(asset.getPath())) {
```

### BoundedWildcard
Can generalize to `? extends Collection`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/internal/Page.java`
#### Snippet
```java
    }

    private int resolveInt(Map<String, Collection<String>> headers, String key) {
        Collection<String> values = headers.get(key);
        if (values != null && values.size() > 0) {
```

### BoundedWildcard
Can generalize to `? extends GlLinkRequest`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
    }

    void linkAssets(String owner, String repoName, GlRelease release, String projectIdentifier, Collection<GlLinkRequest> links) throws IOException, RestAPIException {
        logger.debug(RB.$("git.upload.asset.links"), owner, repoName, release.getTagName());

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
Can generalize to `? extends Asset`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
    }

    Collection<GlFileUpload> uploadAssets(String owner, String repoName, String projectIdentifier, List<Asset> assets) throws IOException, RestAPIException {
        logger.debug(RB.$("git.upload.assets"), owner, repoName);

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
Can generalize to `? extends GlFileUpload`
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/Gitlab.java`
#### Snippet
```java
    }

    void linkReleaseAssets(String owner, String repoName, GlRelease release, String projectIdentifier, Collection<GlFileUpload> uploads) throws IOException, RestAPIException {
        logger.debug(RB.$("git.upload.asset.links"), owner, repoName, release.getTagName());

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
Can generalize to `? extends Deployable`
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/AbstractMavenDeployer.java`
#### Snippet
```java
    }

    private void checkMavenCentralRules(Map<String, Deployable> deployablesMap, Errors errors) {
        if (!getDeployer().isApplyMavenCentralRules()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends Deployable`
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/AbstractMavenDeployer.java`
#### Snippet
```java
    }

    private void checksumDeployables(Map<String, Deployable> deployablesMap, Set<Deployable> deployables) {
        for (Deployable deployable : deployablesMap.values()) {
            if (!deployable.getFilename().endsWith(".jar") &&
```

### BoundedWildcard
Can generalize to `? super Deployable`
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/AbstractMavenDeployer.java`
#### Snippet
```java
    }

    private void checksumDeployables(Map<String, Deployable> deployablesMap, Set<Deployable> deployables) {
        for (Deployable deployable : deployablesMap.values()) {
            if (!deployable.getFilename().endsWith(".jar") &&
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
Can generalize to `? extends Developer`
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/internal/JReleaserModelConfigurer.java`
#### Snippet
```java
    }

    private static List<String> resolveAuthors(List<Developer> developers) {
        if (null == developers || developers.isEmpty()) return Collections.emptyList();

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

## MissortedModifiers
### MissortedModifiers
Missorted modifiers `final static`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/ChronVer.java`
#### Snippet
```java
    }

    public final static class Changeset implements Comparable<Changeset> {
        private final String identifier;
        private final int change;
```

### MissortedModifiers
Missorted modifiers `final static`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/VersionUtils.java`
#### Snippet
```java
 */
public class VersionUtils {
    private final static UnparseableTags UNPARSEABLE_TAGS = new UnparseableTags();

    public static Pattern resolveVersionPattern(JReleaserContext context) {
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/NativeImageAssembler.java`
#### Snippet
```java
    }

    private static abstract class AbstractPlatformCustomizer<S extends AbstractPlatformCustomizer<S>> extends AbstractModelObject<S> implements PlatformCustomizer {
        protected final List<String> args = new ArrayList<>();
        protected final String platform;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JpackageAssembler.java`
#### Snippet
```java
    }

    public static abstract class AbstractPlatformPackager<S extends AbstractPlatformPackager<S>> extends AbstractModelObject<S> implements PlatformPackager {
        protected final Artifact jdk = new Artifact();
        protected final List<String> types = new ArrayList<>();
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/environment/Environment.java`
#### Snippet
```java
    }

    public static abstract class AbstractPropertiesSource implements PropertiesSource {
        @Override
        public Map<String, String> getProperties() {
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/JReleaserGpgSigner.java`
#### Snippet
```java
    }

    private static abstract class AbstractSigner implements Signer {
        protected final JReleaserContext context;

```

## IgnoreResultOfCall
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
Result of `File.delete()` is ignored
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
                .sorted(Comparator.reverseOrder())
                .map(Path::toFile)
                .forEach(File::delete);
            if (!keepRoot) Files.deleteIfExists(path);
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
Result of `File.mkdirs()` is ignored
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/checksum/Checksum.java`
#### Snippet
```java
            context.getLogger().info("{}.{}", context.relativizeToBasedir(input), algorithm.formatted());
            String hashcode = ChecksumUtils.checksum(algorithm, Files.readAllBytes(input));
            output.toFile().getParentFile().mkdirs();
            Files.write(output, hashcode.getBytes());
            return hashcode;
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Banner.java`
#### Snippet
```java
            if (!markerFile.exists()) {
                if (!JReleaserOutput.isQuiet()) out.println(BANNER.banner);
                markerFile.getParentFile().mkdirs();
                PrintStream fout = new PrintStream(new FileOutputStream(markerFile));
                fout.println("1");
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `plugins/jdks-maven-plugin/src/main/java/org/jreleaser/jdks/maven/plugin/Banner.java`
#### Snippet
```java
            if (!markerFile.exists()) {
                System.out.println(BANNER.banner);
                markerFile.getParentFile().mkdirs();
                PrintStream out = new PrintStream(new FileOutputStream(markerFile));
                out.println("1");
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/Banner.java`
#### Snippet
```java
            if (!markerFile.exists()) {
                writer.println(BANNER.banner);
                markerFile.getParentFile().mkdirs();
                PrintStream out = new PrintStream(new FileOutputStream(markerFile));
                out.println("1");
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/Banner.java`
#### Snippet
```java
            if (!markerFile.exists()) {
                if (!quiet) System.out.println(BANNER.banner);
                markerFile.getParentFile().mkdirs();
                PrintStream out = new PrintStream(new FileOutputStream(markerFile));
                out.println("1");
```

## DefaultAnnotationParam
### DefaultAnnotationParam
Redundant default parameter value assignment
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Template.java`
#### Snippet
```java
@CommandLine.Command(name = "template")
public class Template extends AbstractLoggingCommand {
    @CommandLine.ArgGroup(exclusive = true, multiplicity = "1")
    Composite composite;

```

## ClassNameSameAsAncestorName
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
in `sdks/jreleaser-twitter-java-sdk/src/main/java/org/jreleaser/sdk/twitter/UpdateStatusTwitterCommand.java`
#### Snippet
```java
    }

    public static class Builder extends AbstractTwitterCommand.Builder<Builder> {
        private List<String> statuses;

```

### ClassNameSameAsAncestorName
Class name `JReleaserModelPrinter` is the same as one of its superclass' names
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/internal/JReleaserModelPrinter.java`
#### Snippet
```java
 * @since 0.1.0
 */
public class JReleaserModelPrinter extends org.jreleaser.model.internal.JReleaserModelPrinter {
    public JReleaserModelPrinter(PrintWriter out) {
        super(out);
```

### ClassNameSameAsAncestorName
Class name `JReleaserModelPrinter` is the same as one of its superclass' names
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/internal/JReleaserModelPrinter.java`
#### Snippet
```java
 * @since 0.1.0
 */
public class JReleaserModelPrinter extends org.jreleaser.model.internal.JReleaserModelPrinter {
    public JReleaserModelPrinter(PrintWriter out) {
        super(out);
```

### ClassNameSameAsAncestorName
Class name `JReleaserModelPrinter` is the same as one of its superclass' names
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/internal/JReleaserModelPrinter.java`
#### Snippet
```java
 * @since 0.1.0
 */
public class JReleaserModelPrinter extends org.jreleaser.model.internal.JReleaserModelPrinter {
    public JReleaserModelPrinter(PrintWriter out) {
        super(out);
```

## RedundantMethodOverride
### RedundantMethodOverride
Method `setAssembler()` is identical to its super method
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/AbstractJavaAssemblerProcessor.java`
#### Snippet
```java

    @Override
    public void setAssembler(S assembler) {
        this.assembler = assembler;
    }
```

## UnnecessarySuperQualifier
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

## SlowListContainsAll
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        public boolean containsAll(Collection<?> objects) {
            return delegate.containsAll(objects);
        }

```

## ReplaceAssignmentWithOperatorAssignment
### ReplaceAssignmentWithOperatorAssignment
`className = className + trailingName` could be simplified to 'className += trailingName'
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
        String className = capitalize(logicalName);
        if (trailingName != null) {
            className = className + trailingName;
        }

```

## NestedAssignment
### NestedAssignment
Result of assignment expression used
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java

        ArchiveEntry entry = null;
        while ((entry = in.getNextEntry()) != null) {
            if (!in.canReadEntryData(entry)) {
                // log something?
```

### NestedAssignment
Result of assignment expression used
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
    private static void unpackArchive(String basename, File destinationDir, ArchiveInputStream in) throws IOException {
        ArchiveEntry entry = null;
        while ((entry = in.getNextEntry()) != null) {
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

## CodeBlock2Expr
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `sdks/jreleaser-nexus2-java-sdk/src/main/java/org/jreleaser/sdk/nexus2/Nexus2.java`
#### Snippet
```java
            .decoder(new ContentNegotiationDecoder())
            .requestInterceptor(new BasicAuthRequestInterceptor(username, password))
            .requestInterceptor(template -> {
                template.header("User-Agent", "JReleaser/" + JReleaserVersion.getPlainVersion());
            })
```

## FieldAccessedSynchronizedAndUnsynchronized
### FieldAccessedSynchronizedAndUnsynchronized
Field `processingEnv` is accessed in both synchronized and unsynchronized contexts
in `infra/jreleaser-nativeimage-processor/src/main/java/org/jreleaser/infra/nativeimage/processor/AbstractNativeImageProcessor.java`
#### Snippet
```java
 */
abstract class AbstractNativeImageProcessor extends AbstractProcessor {
    protected ProcessingEnvironment processingEnv;

    @Override
```

## EmptyMethod
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
The method is empty
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/JpackageAssemblerValidator.java`
#### Snippet
```java
    }

    private static void validateWindows(JReleaserContext context, JpackageAssembler jpackage, JpackageAssembler.Windows packager, Errors errors) {

    }
```

### EmptyMethod
The method is empty
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/ChocolateyPackagerValidator.java`
#### Snippet
```java
    }

    private static void checkCalVer(JReleaserContext context, Distribution distribution, ChocolateyPackager packager, CalVer version, Errors errors) {

    }
```

### EmptyMethod
The method is empty
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/ChocolateyPackagerValidator.java`
#### Snippet
```java
    }

    private static void checkCustomVersion(JReleaserContext context, Distribution distribution, ChocolateyPackager packager, CustomVersion version, Errors errors) {

    }
```

## RedundantImplements
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
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/assemble/JpackageAssembler.java`
#### Snippet
```java
 * @since 0.10.0
 */
public interface JpackageAssembler extends Assembler, JavaAssembler {
    String TYPE = "jpackage";

```

### RedundantImplements
Redundant interface declaration `ExtraProperties`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/deploy/maven/AbstractMavenDeployer.java`
#### Snippet
```java
 * @since 1.3.0
 */
public abstract class AbstractMavenDeployer<S extends AbstractMavenDeployer<S, A>, A extends org.jreleaser.model.api.deploy.maven.MavenDeployer> extends AbstractModelObject<S> implements MavenDeployer<A>, ExtraProperties {
    @JsonIgnore
    protected final String type;
```

### RedundantImplements
Redundant interface declaration `ExtraProperties`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/AbstractUploader.java`
#### Snippet
```java
 * @since 0.3.0
 */
public abstract class AbstractUploader<A extends org.jreleaser.model.api.upload.Uploader, S extends AbstractUploader<A, S>> extends AbstractModelObject<S> implements Uploader<A>, ExtraProperties {
    @JsonIgnore
    protected final String type;
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

```

### RedundantImplements
Redundant interface declaration `Domain`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerPackager.java`
#### Snippet
```java
    }

    public static final class DockerRepository extends AbstractRepositoryTap<DockerRepository> implements Domain {
        private Boolean versionedSubfolders;

```

### RedundantImplements
Redundant interface declaration `Domain`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerSpec.java`
#### Snippet
```java
 * @since 0.4.0
 */
public final class DockerSpec extends AbstractDockerConfiguration<DockerSpec> implements Domain {
    private final Map<String, Object> matchers = new LinkedHashMap<>();
    private Artifact artifact;
```

### RedundantImplements
Redundant interface declaration `ExtraProperties`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AbstractDockerConfiguration.java`
#### Snippet
```java
 */
public abstract class AbstractDockerConfiguration<S extends AbstractDockerConfiguration<S>> extends AbstractModelObject<S>
    implements DockerConfiguration, ExtraProperties, Activatable {
    protected final Map<String, Object> extraProperties = new LinkedHashMap<>();
    protected final Map<String, String> labels = new LinkedHashMap<>();
```

### RedundantImplements
Redundant interface declaration `Activatable`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AbstractDockerConfiguration.java`
#### Snippet
```java
 */
public abstract class AbstractDockerConfiguration<S extends AbstractDockerConfiguration<S>> extends AbstractModelObject<S>
    implements DockerConfiguration, ExtraProperties, Activatable {
    protected final Map<String, Object> extraProperties = new LinkedHashMap<>();
    protected final Map<String, String> labels = new LinkedHashMap<>();
```

### RedundantImplements
Redundant interface declaration `Domain`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
 * @since 0.1.0
 */
public final class Distribution extends Packagers<Distribution> implements Domain, Activatable, ExtraProperties {
    private final List<String> tags = new ArrayList<>();
    private final Map<String, Object> extraProperties = new LinkedHashMap<>();
```

### RedundantImplements
Redundant interface declaration `Callable`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/AbstractLoggingCommand.java`
#### Snippet
```java
 * @since 0.1.0
 */
abstract class AbstractLoggingCommand extends AbstractCommand implements Callable<Integer> {
    protected JReleaserLogger logger;

```

## ExceptionNameDoesntEndWithException
### ExceptionNameDoesntEndWithException
Exception class name `NotXml` does not end with 'Exception'
in `sdks/jreleaser-nexus2-java-sdk/src/main/java/org/jreleaser/sdk/nexus2/Nexus2.java`
#### Snippet
```java
    }

    static class NotXml extends IOException {

    }
```

## CallToStringConcatCanBeReplacedByOperator
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java
                if (!artifact.isActive() || artifact.extraPropertyIsTrue(KEY_SKIP_SIGNING)) continue;
                Path input = artifact.getEffectivePath(context);
                Path output = signaturesDirectory.resolve(input.getFileName().toString().concat(extension));
                SigningUtils.FilePair pair = new SigningUtils.FilePair(input, output);
                if (!forceSign) pair.setValid(validator.apply(pair));
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java
                    if (!artifact.isActive() || artifact.extraPropertyIsTrue(KEY_SKIP_SIGNING)) continue;
                    Path input = artifact.getEffectivePath(context, distribution);
                    Path output = signaturesDirectory.resolve(input.getFileName().toString().concat(extension));
                    SigningUtils.FilePair pair = new SigningUtils.FilePair(input, output);
                    if (!forceSign) pair.setValid(validator.apply(pair));
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
                    if (!forceSign) pair.setValid(validator.apply(pair));
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
        String scriptName = (String) props.get(KEY_JBANG_SCRIPT_NAME);
        Path outputFile = "jbang.java".equals(fileName) ?
            outputDirectory.resolve(scriptName.concat(".java")) :
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
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/ScoopPackagerProcessor.java`
#### Snippet
```java

        Path outputFile = "manifest.json".equals(fileName) ?
            outputDirectory.resolve("bucket").resolve(packager.getPackageName().concat(".json")) :
            outputDirectory.resolve(fileName);

```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/BrewPackagerProcessor.java`
#### Snippet
```java
            if (FORMULA_RB.equals(fileName) || FORMULA_MULTI_RB.equals(fileName)) return;
            Path outputFile = CASK_RB.equals(fileName) ?
                outputDirectory.resolve(CASKS).resolve(packager.getCask().getResolvedCaskName(props).concat(RB)) :
                outputDirectory.resolve(fileName);
            writeFile(content, outputFile);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/BrewPackagerProcessor.java`
#### Snippet
```java
            if (CASK_RB.equals(fileName) || FORMULA_RB.equals(fileName)) return;
            Path outputFile = FORMULA_MULTI_RB.equals(fileName) ?
                outputDirectory.resolve(FORMULA).resolve(distribution.getExecutable().getName().concat(RB)) :
                outputDirectory.resolve(fileName);
            writeFile(content, outputFile);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/BrewPackagerProcessor.java`
#### Snippet
```java
            Path outputFile = FORMULA_RB.equals(fileName) ?
                outputDirectory.resolve(FORMULA)
                        .resolve(getHyphenatedName(packager.getFormulaName()).concat(RB)) :
                outputDirectory.resolve(fileName);
            writeFile(content, outputFile);
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/JlinkAssemblerProcessor.java`
#### Snippet
```java

        Path outputFile = "launcher.bat".equals(fileName) ?
            inputsDirectory.resolve(assembler.getExecutable().concat(".bat")) :
            "launcher".equals(fileName) ?
                inputsDirectory.resolve(assembler.getExecutable()) :
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/JlinkAssemblerProcessor.java`
#### Snippet
```java
            try {
                if (PlatformUtils.isWindows(platform)) {
                    Files.copy(inputsDirectory.resolve(assembler.getExecutable().concat(".bat")),
                        imageDirectory.resolve("bin").resolve(assembler.getExecutable().concat(".bat")));
                } else {
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/JlinkAssemblerProcessor.java`
#### Snippet
```java
                if (PlatformUtils.isWindows(platform)) {
                    Files.copy(inputsDirectory.resolve(assembler.getExecutable().concat(".bat")),
                        imageDirectory.resolve("bin").resolve(assembler.getExecutable().concat(".bat")));
                } else {
                    Path launcher = imageDirectory.resolve("bin").resolve(assembler.getExecutable());
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

## DuplicateThrows
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

## ZeroLengthArrayInitialization
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

## UnstableTypeUsedInSignature
### UnstableTypeUsedInSignature
Method must be marked with '@org.gradle.api.Incubating' annotation because its signature references unstable type 'org.gradle.api.provider.MapProperty'
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/dsl/common/ExtraProperties.groovy`
#### Snippet
```java
 */
interface ExtraProperties {
    MapProperty<String, Object> getExtraProperties()
}

```

### UnstableTypeUsedInSignature
Method must be marked with '@org.gradle.api.Incubating' annotation because its signature references unstable type 'org.gradle.api.provider.MapProperty'
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/dsl/upload/S3Uploader.groovy`
#### Snippet
```java
    Property<String> getDownloadUrl()

    MapProperty<String, String> getHeaders()

    void setHeader(String key, String value)
```

### UnstableTypeUsedInSignature
Method must be marked with '@org.gradle.api.Incubating' annotation because its signature references unstable type 'org.gradle.api.provider.MapProperty'
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/dsl/upload/HttpUploader.groovy`
#### Snippet
```java
    Property<Http.Authorization> getAuthorization()

    MapProperty<String, String> getHeaders()

    void setHeader(String key, String value)
```

### UnstableTypeUsedInSignature
Method must be marked with '@org.gradle.api.Incubating' annotation because its signature references unstable type 'org.gradle.api.provider.MapProperty'
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/dsl/release/GitlabReleaser.groovy`
#### Snippet
```java
    Property<String> getProjectIdentifier()

    MapProperty<String, String> getUploadLinks()
}

```

### UnstableTypeUsedInSignature
Method must be marked with '@org.gradle.api.Incubating' annotation because its signature references unstable type 'org.gradle.api.provider.MapProperty'
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/dsl/announce/HttpAnnouncer.groovy`
#### Snippet
```java
    Property<String> getBearerKeyword()

    MapProperty<String, String> getHeaders()

    void setHeader(String key, String value)
```

### UnstableTypeUsedInSignature
Method must be marked with '@org.gradle.api.Incubating' annotation because its signature references unstable type 'org.gradle.api.provider.MapProperty'
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/dsl/announce/SmtpAnnouncer.groovy`
#### Snippet
```java
    void setMessageTemplate(String messageTemplate)

    MapProperty<String, String> getProperties()
}
```

### UnstableTypeUsedInSignature
Method must be marked with '@org.gradle.api.Incubating' annotation because its signature references unstable type 'org.gradle.api.provider.MapProperty'
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/dsl/download/HttpDownloader.groovy`
#### Snippet
```java
    Property<Http.Authorization> getAuthorization()

    MapProperty<String, String> getHeaders()

    void setHeader(String key, String value)
```

### UnstableTypeUsedInSignature
Method must be marked with '@org.gradle.api.Incubating' annotation because its signature references unstable type 'org.gradle.api.provider.MapProperty'
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/dsl/platform/Platform.groovy`
#### Snippet
```java
@CompileStatic
interface Platform {
    MapProperty<String, String> getReplacements()
}
```

### UnstableTypeUsedInSignature
Method must be marked with '@org.gradle.api.Incubating' annotation because its signature references unstable type 'org.gradle.api.provider.MapProperty'
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/dsl/packagers/DockerConfiguration.groovy`
#### Snippet
```java
    ListProperty<String> getPostCommands()

    MapProperty<String, String> getLabels()

    void imageName(String imageName)
```

### UnstableTypeUsedInSignature
Method must be marked with '@org.gradle.api.Incubating' annotation because its signature references unstable type 'org.gradle.api.provider.MapProperty'
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/dsl/packagers/DockerSpec.groovy`
#### Snippet
```java
@CompileStatic
interface DockerSpec extends DockerConfiguration {
    MapProperty<String, Object> getMatchers()

    void matcher(String key, Object value)
```

### UnstableTypeUsedInSignature
Method must be marked with '@org.gradle.api.Incubating' annotation because its signature references unstable type 'org.gradle.api.provider.MapProperty'
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/dsl/packagers/BrewPackager.groovy`
#### Snippet
```java
    ListProperty<String> getLivecheck()

    MapProperty<String, String> getDependencies()

    void dependency(String key, String value)
```

### UnstableTypeUsedInSignature
Method must be marked with '@org.gradle.api.Incubating' annotation because its signature references unstable type 'org.gradle.api.provider.MapProperty'
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/dsl/packagers/BrewPackager.groovy`
#### Snippet
```java
        Property<Boolean> getEnabled()

        MapProperty<String, List<String>> getUninstall()

        MapProperty<String, List<String>> getZap()
```

### UnstableTypeUsedInSignature
Method must be marked with '@org.gradle.api.Incubating' annotation because its signature references unstable type 'org.gradle.api.provider.MapProperty'
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/dsl/packagers/BrewPackager.groovy`
#### Snippet
```java
        MapProperty<String, List<String>> getUninstall()

        MapProperty<String, List<String>> getZap()
    }
}
```

### UnstableTypeUsedInSignature
Method must be marked with '@org.gradle.api.Incubating' annotation because its signature references unstable type 'org.gradle.api.provider.MapProperty'
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/dsl/environment/Environment.groovy`
#### Snippet
```java
    void setVariables(String variables)

    MapProperty<String, Object> getProperties()
}
```

### UnstableTypeUsedInSignature
Method must be marked with '@org.gradle.api.Incubating' annotation because its signature references unstable type 'org.gradle.api.provider.MapProperty'
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/dsl/extensions/Extension.groovy`
#### Snippet
```java
        Property<String> getType()

        MapProperty<String, Object> getProperties()
    }
}
```

### UnstableTypeUsedInSignature
Method must be marked with '@org.gradle.api.Incubating' annotation because its signature references unstable type 'org.gradle.api.provider.MapProperty'
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/dsl/packagers/SnapPackager.groovy`
#### Snippet
```java
    @CompileStatic
    interface Slot {
        MapProperty<String, String> getAttributes()

        void attribute(String key, String value)
```

### UnstableTypeUsedInSignature
Method must be marked with '@org.gradle.api.Incubating' annotation because its signature references unstable type 'org.gradle.api.provider.MapProperty'
in `plugins/jreleaser-gradle-plugin/src/main/groovy/org/jreleaser/gradle/plugin/dsl/packagers/SnapPackager.groovy`
#### Snippet
```java
    @CompileStatic
    interface Plug {
        MapProperty<String, String> getAttributes()

        void attribute(String key, String value)
```

## InfiniteRecursion
### InfiniteRecursion
Method `isExported()` recurses infinitely, and can only end by throwing an exception
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JlinkAssembler.java`
#### Snippet
```java

        @Override
        public boolean isExported() {
            return isExported();
        }
```

### InfiniteRecursion
Method `isEnabled()` recurses infinitely, and can only end by throwing an exception
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JlinkAssembler.java`
#### Snippet
```java

        @Override
        public boolean isEnabled() {
            return isEnabled();
        }
```

## UnusedAssignment
### UnusedAssignment
Variable `entry` initializer `null` is redundant
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java
        List<String> entries = new ArrayList<>();

        ArchiveEntry entry = null;
        while ((entry = in.getNextEntry()) != null) {
            if (!in.canReadEntryData(entry)) {
```

### UnusedAssignment
Variable `entry` initializer `null` is redundant
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java

    private static void unpackArchive(String basename, File destinationDir, ArchiveInputStream in) throws IOException {
        ArchiveEntry entry = null;
        while ((entry = in.getNextEntry()) != null) {
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
Variable `commandLine` initializer `null` is redundant
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/hooks/CommandHookExecutor.java`
#### Snippet
```java
                String resolvedCmd = hook.getResolvedCmd(context, event);

                List<String> commandLine = null;

                try {
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
Variable `service` initializer `null` is redundant
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/context/ModelAutoConfigurer.java`
#### Snippet
```java
        try {
            Repository repository = GitSdk.of(basedir, gitRootSearch).getRemote();
            BaseReleaser service = null;
            switch (repository.getKind()) {
                case GITHUB:
```

### UnusedAssignment
The value `true` assigned to `failure` is never used
in `core/jreleaser-engine/src/main/java/org/jreleaser/workflow/WorkflowImpl.java`
#### Snippet
```java
                } catch (RuntimeException e) {
                    // terminate
                    failure = true;
                    stepException = e;

```

### UnusedAssignment
Variable `pgpSigList` initializer `null` is redundant
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java

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
        try {
            jars = Files.list(directoryPath)
```

### UnusedAssignment
Variable `artifactFile` initializer `""` is redundant
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModel.java`
#### Snippet
```java
        public String apply(String input) {
            String format = "md";
            String artifactFile = "";
            String[] parts = input.split(":");
            if (parts.length == 1) {
```

### UnusedAssignment
Variable `integer` initializer `false` is redundant
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/packagers/ChocolateyPackagerValidator.java`
#### Snippet
```java
        String tag = version.getTag();

        boolean integer = false;
        boolean date = false;
        // tag is either an integer
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
Variable `ghOrganization` initializer `null` is redundant
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/Github.java`
#### Snippet
```java

    private GHTeam resolveTeam(String organization, String team) throws IOException {
        GHOrganization ghOrganization = null;

        try {
```

### UnusedAssignment
Variable `ghTeam` initializer `null` is redundant
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/Github.java`
#### Snippet
```java
        }

        GHTeam ghTeam = null;

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
Variable `message` initializer `""` is redundant
in `sdks/jreleaser-gitter-java-sdk/src/main/java/org/jreleaser/sdk/gitter/GitterAnnouncer.java`
#### Snippet
```java
    @Override
    public void announce() throws AnnounceException {
        String message = "";
        if (isNotBlank(gitter.getMessage())) {
            message = gitter.getResolvedMessage(context);
```

### UnusedAssignment
Variable `ghLabel` initializer `null` is redundant
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/GithubReleaser.java`
#### Snippet
```java

        GHRepository ghRepository = api.findRepository(github.getOwner(), github.getName());
        GHLabel ghLabel = null;

        try {
```

### UnusedAssignment
Variable `message` initializer `""` is redundant
in `sdks/jreleaser-discord-java-sdk/src/main/java/org/jreleaser/sdk/discord/DiscordAnnouncer.java`
#### Snippet
```java
    @Override
    public void announce() throws AnnounceException {
        String message = "";
        if (isNotBlank(discord.getMessage())) {
            message = discord.getResolvedMessage(context);
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
Variable `pgpSigList` initializer `null` is redundant
in `sdks/jreleaser-signing-java-sdk/src/main/java/org/jreleaser/sdk/signing/SigningUtils.java`
#### Snippet
```java

            PGPObjectFactory pgpObjFactory = new PGPObjectFactory(sigInputStream, keyring.getKeyFingerPrintCalculator());
            Iterable<?> pgpSigList = null;

            Object obj = pgpObjFactory.nextObject();
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

    public void announce(WebhookAnnouncer webhook) throws AnnounceException {
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
in `sdks/jreleaser-mattermost-java-sdk/src/main/java/org/jreleaser/sdk/mattermost/MattermostAnnouncer.java`
#### Snippet
```java
    @Override
    public void announce() throws AnnounceException {
        String message = "";
        if (isNotBlank(mattermost.getMessage())) {
            message = mattermost.getResolvedMessage(context);
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

## OptionalIsPresent
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

## UtilityClassWithoutPrivateConstructor
### UtilityClassWithoutPrivateConstructor
Class `ObjectUtils` has only 'static' members, and lacks a 'private' constructor
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/ObjectUtils.java`
#### Snippet
```java
 * @since 0.2.0
 */
public class ObjectUtils {
    private static final String MESSAGE = "message";

```

### UtilityClassWithoutPrivateConstructor
Class `Env` has only 'static' members, and lacks a 'private' constructor
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/Env.java`
#### Snippet
```java
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class Env {
    private static final String JRELEASER_ENV_PREFIX = "JRELEASER_";
    private static final String JRELEASER_SYS_PREFIX = "jreleaser.";
```

### UtilityClassWithoutPrivateConstructor
Class `Templates` has only 'static' members, and lacks a 'private' constructor
in `api/jreleaser-mustache/src/main/java/org/jreleaser/mustache/Templates.java`
#### Snippet
```java
 * @since 0.10.0
 */
public class Templates {
    public static String resolveTemplate(String input, Map<String, Object> props) {
        if (isBlank(input)) return input;
```

### UtilityClassWithoutPrivateConstructor
Class `JReleaserVersion` has only 'static' members, and lacks a 'private' constructor
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/JReleaserVersion.java`
#### Snippet
```java
 * @since 0.1.0
 */
public class JReleaserVersion {
    private static final ResourceBundle BUNDLE = ResourceBundle.getBundle(JReleaserVersion.class.getName());
    private static final String JRELEASER_VERSION = BUNDLE.getString("jreleaser_version");
```

### UtilityClassWithoutPrivateConstructor
Class `StringUtils` has only 'static' members, and lacks a 'private' constructor
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
 * @since 0.1.0
 */
public class StringUtils {
    private static final String PROPERTY_SET_PREFIX = "set";
    private static final String PROPERTY_GET_PREFIX = "get";
```

### UtilityClassWithoutPrivateConstructor
Class `ExtensionManagerHolder` has only 'static' members, and lacks a 'private' constructor
in `api/jreleaser-model-api/src/main/java/org/jreleaser/extensions/api/ExtensionManagerHolder.java`
#### Snippet
```java
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public final class ExtensionManagerHolder {
    private static final ThreadLocal<ExtensionManager> EXTENSION_MANAGER_THREAD_LOCAL = ThreadLocal.withInitial(new Supplier<ExtensionManager>() {
        @Override
```

### UtilityClassWithoutPrivateConstructor
Class `ArtifactDeployers` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/deploy/maven/ArtifactDeployers.java`
#### Snippet
```java
 * @since 1.3.0
 */
public class ArtifactDeployers {
    public static <A extends org.jreleaser.model.api.deploy.maven.MavenDeployer, D extends org.jreleaser.model.internal.deploy.maven.MavenDeployer<A>> MavenDeployer<A, D> findMavenDeployer(JReleaserContext context, D deployer) {
        Map<String, MavenDeployer<?, ?>> deployers = StreamSupport.stream(ServiceLoader.load(MavenDeployerFactory.class,
```

### UtilityClassWithoutPrivateConstructor
Class `MavenDeployers` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/deploy/maven/MavenDeployers.java`
#### Snippet
```java
 * @since 1.3.0
 */
public class MavenDeployers {
    public static void deploy(JReleaserContext context) {
        Maven maven = context.getModel().getDeploy().getMaven();
```

### UtilityClassWithoutPrivateConstructor
Class `ArtifactUploaders` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/upload/ArtifactUploaders.java`
#### Snippet
```java
 * @since 0.3.0
 */
public class ArtifactUploaders {
    public static <A extends org.jreleaser.model.api.upload.Uploader, U extends Uploader<A>> ArtifactUploader<A, U> findUploader(JReleaserContext context, U uploader) {
        Map<String, ArtifactUploader<?, ?>> uploaders = StreamSupport.stream(ServiceLoader.load(ArtifactUploaderFactory.class,
```

### UtilityClassWithoutPrivateConstructor
Class `Uploaders` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/upload/Uploaders.java`
#### Snippet
```java
 * @since 0.3.0
 */
public class Uploaders {
    public static void upload(JReleaserContext context) {
        Upload upload = context.getModel().getUpload();
```

### UtilityClassWithoutPrivateConstructor
Class `ModelValidator` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/context/ModelValidator.java`
#### Snippet
```java
 * @since 1.0.0
 */
public class ModelValidator {
    public static void validate(JReleaserContext context) {
        try {
```

### UtilityClassWithoutPrivateConstructor
Class `Announcers` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/announce/Announcers.java`
#### Snippet
```java
 * @since 0.1.0
 */
public class Announcers {
    public static void announce(JReleaserContext context) throws AnnounceException {
        context.getLogger().info(RB.$("announcers.header"));
```

### UtilityClassWithoutPrivateConstructor
Class `Releasers` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/release/Releasers.java`
#### Snippet
```java
 * @since 0.1.0
 */
public class Releasers {
    public static void release(JReleaserContext context) throws ReleaseException {
        org.jreleaser.model.api.release.Releaser releaser = context.getModel().getRelease().releaser();
```

### UtilityClassWithoutPrivateConstructor
Class `ModelConfigurer` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/context/ModelConfigurer.java`
#### Snippet
```java
 * @since 0.2.0
 */
public class ModelConfigurer {
    public static void configure(JReleaserContext context) {
        try {
```

### UtilityClassWithoutPrivateConstructor
Class `AssemblerProcessors` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/assemble/AssemblerProcessors.java`
#### Snippet
```java
 * @since 0.2.0
 */
public class AssemblerProcessors {
    public static <A extends org.jreleaser.model.api.assemble.Assembler, S extends Assembler<A>> AssemblerProcessor<A, S> findProcessor(JReleaserContext context, S assembler) {
        Map<String, AssemblerProcessor<?, ?>> processors = StreamSupport.stream(ServiceLoader.load(AssemblerProcessorFactory.class,
```

### UtilityClassWithoutPrivateConstructor
Class `ArtifactDownloaders` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/download/ArtifactDownloaders.java`
#### Snippet
```java
 * @since 1.1.0
 */
public class ArtifactDownloaders {
    public static <A extends org.jreleaser.model.api.download.Downloader, D extends Downloader<A>> ArtifactDownloader<A, D> findDownloader(JReleaserContext context, D downloader) {
        Map<String, ArtifactDownloader<?, ?>> downloaders = StreamSupport.stream(ServiceLoader.load(ArtifactDownloaderFactory.class,
```

### UtilityClassWithoutPrivateConstructor
Class `Assemblers` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/assemble/Assemblers.java`
#### Snippet
```java
 * @since 0.2.0
 */
public class Assemblers {
    public static void assemble(JReleaserContext context) {
        Assemble assemble = context.getModel().getAssemble();
```

### UtilityClassWithoutPrivateConstructor
Class `Changelog` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/changelog/Changelog.java`
#### Snippet
```java
 * @since 0.1.0
 */
public class Changelog {
    public static String createChangelog(JReleaserContext context) {
        try {
```

### UtilityClassWithoutPrivateConstructor
Class `Downloaders` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/download/Downloaders.java`
#### Snippet
```java
 * @since 1.1.0
 */
public class Downloaders {
    public static void download(JReleaserContext context) {
        Download download = context.getModel().getDownload();
```

### UtilityClassWithoutPrivateConstructor
Class `PackagerProcessors` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/distribution/PackagerProcessors.java`
#### Snippet
```java
 * @since 0.1.0
 */
public class PackagerProcessors {
    public static <T extends Packager> PackagerProcessor<T> findProcessor(JReleaserContext context, T packager) {
        Map<String, PackagerProcessor> processors = StreamSupport.stream(ServiceLoader.load(PackagerProcessorFactory.class,
```

### UtilityClassWithoutPrivateConstructor
Class `Checksum` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/checksum/Checksum.java`
#### Snippet
```java
 * @since 0.1.0
 */
public class Checksum {
    public static void collectAndWriteChecksums(JReleaserContext context) throws JReleaserException {
        context.getLogger().info(RB.$("checksum.header"));
```

### UtilityClassWithoutPrivateConstructor
Class `Distributions` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/distribution/Distributions.java`
#### Snippet
```java
 * @since 0.1.0
 */
public class Distributions {
    public static void process(JReleaserContext context, DistributionProcessor.PackagingAction action) {
        List<Distribution> activeDistributions = context.getModel().getActiveDistributions();
```

### UtilityClassWithoutPrivateConstructor
Class `Workflows` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-engine/src/main/java/org/jreleaser/workflow/Workflows.java`
#### Snippet
```java
 * @since 0.1.0
 */
public class Workflows {
    public static Workflow download(JReleaserContext context) {
        context.setCommand(JReleaserCommand.DOWNLOAD);
```

### UtilityClassWithoutPrivateConstructor
Class `ContextCreator` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/context/ContextCreator.java`
#### Snippet
```java
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class ContextCreator {
    public static JReleaserContext create(JReleaserLogger logger,
                                          JReleaserContext.Configurer configurer,
```

### UtilityClassWithoutPrivateConstructor
Class `Signer` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/sign/Signer.java`
#### Snippet
```java
 * @since 0.1.0
 */
public class Signer {
    public static void sign(JReleaserContext context) throws SigningException {
        context.getLogger().info(RB.$("signing.header"));
```

### UtilityClassWithoutPrivateConstructor
Class `VersionUtils` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/VersionUtils.java`
#### Snippet
```java
 * @since 1.2.0
 */
public class VersionUtils {
    private final static UnparseableTags UNPARSEABLE_TAGS = new UnparseableTags();

```

### UtilityClassWithoutPrivateConstructor
Class `Artifacts` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/Artifacts.java`
#### Snippet
```java
 * @since 0.1.0
 */
public class Artifacts {
    private static final String DOWNLOAD_URL_SUFFIX = "DownloadUrl";
    private static final String DOWNLOAD_URL_KEY = "downloadUrl";
```

### UtilityClassWithoutPrivateConstructor
Class `JReleaserConfigLoader` has only 'static' members, and lacks a 'private' constructor
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/config/JReleaserConfigLoader.java`
#### Snippet
```java
 * @since 0.1.0
 */
public class JReleaserConfigLoader {
    public static JReleaserModel loadConfig(Path configFile) {
        ServiceLoader<JReleaserConfigParser> parsers = ServiceLoader.load(JReleaserConfigParser.class, JReleaserConfigParser.class.getClassLoader());
```

### UtilityClassWithoutPrivateConstructor
Class `ChangelogProvider` has only 'static' members, and lacks a 'private' constructor
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogProvider.java`
#### Snippet
```java
 * @since 0.1.0
 */
public class ChangelogProvider {
    public static final String ISSUES_FILE = "issues.txt";
    public static final String CHANGELOG_FILE = "CHANGELOG.md";
```

### UtilityClassWithoutPrivateConstructor
Class `JReleaserVersion` has only 'static' members, and lacks a 'private' constructor
in `sdks/jreleaser-disco-java-sdk/src/main/java/org/jreleaser/sdk/disco/JReleaserVersion.java`
#### Snippet
```java
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class JReleaserVersion {
    private static final ResourceBundle BUNDLE = ResourceBundle.getBundle(JReleaserVersion.class.getName());
    private static final String JRELEASER_VERSION = BUNDLE.getString("jreleaser_version");
```

### UtilityClassWithoutPrivateConstructor
Class `UrlEncoder` has only 'static' members, and lacks a 'private' constructor
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/internal/UrlEncoder.java`
#### Snippet
```java
 * @since 0.1.0
 */
public class UrlEncoder {
    public static String urlEncode(String s) throws GitlabException {
        try {
```

### UtilityClassWithoutPrivateConstructor
Class `SigningUtils` has only 'static' members, and lacks a 'private' constructor
in `sdks/jreleaser-signing-java-sdk/src/main/java/org/jreleaser/sdk/signing/SigningUtils.java`
#### Snippet
```java
 * @since 0.1.0
 */
public class SigningUtils {
    static {
        // replace BC provider with our version
```

### UtilityClassWithoutPrivateConstructor
Class `ProcessorUtil` has only 'static' members, and lacks a 'private' constructor
in `infra/jreleaser-nativeimage-processor/src/main/java/org/jreleaser/infra/nativeimage/processor/ProcessorUtil.java`
#### Snippet
```java
 * @since 1.0.0
 */
public final class ProcessorUtil {
    static void generate(Location location, String fileName, String content, Context context) throws IOException {
        if (content == null || content.isEmpty()) return;
```

## StringOperationCanBeSimplified
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java

    public static String padLeft(String str, int numChars, String padding) {
        return numChars <= str.length() ? str : getPadding(padding.toString(), numChars - str.length()) + str;
    }

```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
        int i = className.lastIndexOf(".");
        if (i > -1) {
            className = className.substring(i + 1, className.length());
        }

```

## DeprecatedIsStillUsed
### DeprecatedIsStillUsed
Deprecated member 'getLicenseUrl' is still used
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java

    @Deprecated
    public String getLicenseUrl() {
        return links.getLicense();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getDocsUrl' is still used
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java

    @Deprecated
    public String getDocsUrl() {
        return links.getDocumentation();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getWebsite' is still used
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java

    @Deprecated
    public String getWebsite() {
        return links.getHomepage();
    }
```

## NonSerializableFieldInSerializableClass
### NonSerializableFieldInSerializableClass
Non-serializable field 'versionPattern' in a Serializable class
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/project/Project.java`
#### Snippet
```java
    private String name;
    private String version;
    private VersionPattern versionPattern = new VersionPattern();
    private String description;
    private String longDescription;
```

## RedundantCollectionOperation
### RedundantCollectionOperation
Unnecessary 'Arrays.asList()' call
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/FileUtils.java`
#### Snippet
```java

    public static Optional<Path> findLicenseFile(Path basedir) {
        for (String licenseFilename : Arrays.asList(LICENSE_FILE_NAMES)) {
            Path path = basedir.resolve(licenseFilename);
            if (Files.exists(path)) {
```

### RedundantCollectionOperation
Unnecessary 'contains()' check
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/NativeImageAssemblerValidator.java`
#### Snippet
```java
        }

        if (nativeImage.getComponents().contains("native-image")) {
            nativeImage.getComponents().remove("native-image");
        }
```

## CatchMayIgnoreException
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

## ProtectedMemberInFinalClass
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/DockerPackager.java`
#### Snippet
```java
    }

    protected boolean isNotSkipped(Artifact artifact) {
        return isFalse(artifact.getExtraProperties().get(SKIP_DOCKER));
    }
```

## InnerClassMayBeStatic
### InnerClassMayBeStatic
Inner class `RecursiveEvalFunction` may be 'static'
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/mustache/DefaultMustacheExtensionPoint.java`
#### Snippet
```java
    }

    private class RecursiveEvalFunction implements Function<String, String> {
        private final Map<String, Object> context;

```

## PublicFieldAccessedInSynchronizedContext
### PublicFieldAccessedInSynchronizedContext
Non-private field `this.processingEnv` accessed in synchronized context
in `infra/jreleaser-nativeimage-processor/src/main/java/org/jreleaser/infra/nativeimage/processor/AbstractNativeImageProcessor.java`
#### Snippet
```java
    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        this.processingEnv = processingEnv;
    }

```

## StringEqualsEmptyString
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `api/jreleaser-logger-api/src/main/java/org/jreleaser/logging/AbstractJReleaserLogger.java`
#### Snippet
```java

    protected boolean isIndented() {
        return !indent.equals("");
    }

```

## RedundantSuppression
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

## UnnecessaryBoxing
### UnnecessaryBoxing
Redundant boxing inside `Boolean.valueOf(s)`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
    private String parseAsBoolean(String s) {
        if ("true".equalsIgnoreCase(s) || "false".equalsIgnoreCase(s)) {
            boolean b = Boolean.valueOf(s);
            return b ? green(String.valueOf(b)) : red(String.valueOf(b));
        } else {
```

## OptionalUsedAsFieldOrParameterType
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'current'
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogGenerator.java`
#### Snippet
```java

    public static class Tags {
        private final Optional<Ref> current;
        private final Optional<Ref> previous;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'previous'
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogGenerator.java`
#### Snippet
```java
    public static class Tags {
        private final Optional<Ref> current;
        private final Optional<Ref> previous;

        private Tags(Ref current, Ref previous) {
```

## SystemOutErr
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/JReleaserOutput.java`
#### Snippet
```java
    public static void nag(String msg) {
        if (!isQuiet()) {
            System.out.println(msg);
        }
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `api/jreleaser-logger-api/src/main/java/org/jreleaser/logging/SimpleJReleaserLoggerAdapter.java`
#### Snippet
```java

    public SimpleJReleaserLoggerAdapter(PrintWriter out, Level level) {
        super(new PrintWriter(System.err));
        this.out = out;
        this.level = level;
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
in `plugins/jdks-maven-plugin/src/main/java/org/jreleaser/jdks/maven/plugin/Banner.java`
#### Snippet
```java
            File markerFile = getMarkerFile(parent, BANNER);
            if (!markerFile.exists()) {
                System.out.println(BANNER.banner);
                markerFile.getParentFile().mkdirs();
                PrintStream out = new PrintStream(new FileOutputStream(markerFile));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `plugins/jdks-maven-plugin/src/main/java/org/jreleaser/jdks/maven/plugin/Banner.java`
#### Snippet
```java
                    int count = Integer.parseInt(readQuietly(markerFile));
                    if (count < 3) {
                        System.out.println(BANNER.banner);
                    }
                    writeQuietly(markerFile, (count + 1) + "");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `plugins/jdks-maven-plugin/src/main/java/org/jreleaser/jdks/maven/plugin/Banner.java`
#### Snippet
```java
                } catch (NumberFormatException e) {
                    writeQuietly(markerFile, "1");
                    System.out.println(BANNER.banner);
                }
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/JReleaserConfigTask.java`
#### Snippet
```java
    protected void doExecute(JReleaserContext context) {
        ModelValidator.validate(context);
        new JReleaserModelPrinter(new PrintWriter(System.out, true))
            .print(context.getModel().asMap(full));
        context.report();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/AbstractJReleaserTask.java`
#### Snippet
```java
    @Override
    public void execute() throws BuildException {
        Banner.display(new PrintWriter(System.out, true));
        if (skip) return;

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/JReleaserInitTask.java`
#### Snippet
```java
    @Override
    public void execute() throws BuildException {
        Banner.display(new PrintWriter(System.out, true));

        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/JReleaserTemplateTask.java`
#### Snippet
```java
    @Override
    public void execute() throws BuildException {
        Banner.display(new PrintWriter(System.out, true));
        if (skip) return;

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/JReleaserAutoConfigReleaseTask.java`
#### Snippet
```java
    @Override
    public void execute() throws BuildException {
        Banner.display(new PrintWriter(System.out, true));

        basedir();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserConfigMojo.java`
#### Snippet
```java
        JReleaserContext context = createContext();
        ModelValidator.validate(context);
        new JReleaserModelPrinter(new PrintWriter(System.out, true))
            .print(context.getModel().asMap(full));
        context.report();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/Banner.java`
#### Snippet
```java
            File markerFile = getMarkerFile(parent, BANNER);
            if (!markerFile.exists()) {
                if (!quiet) System.out.println(BANNER.banner);
                markerFile.getParentFile().mkdirs();
                PrintStream out = new PrintStream(new FileOutputStream(markerFile));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/Banner.java`
#### Snippet
```java
                    int count = Integer.parseInt(readQuietly(markerFile));
                    if (count < 3) {
                        if (!quiet) System.out.println(BANNER.banner);
                    }
                    writeQuietly(markerFile, (count + 1) + "");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/Banner.java`
#### Snippet
```java
                } catch (NumberFormatException e) {
                    writeQuietly(markerFile, "1");
                    if (!quiet) System.out.println(BANNER.banner);
                }
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `plugins/jreleaser-tool-provider/src/main/java/org/jreleaser/tool/JReleaser.java`
#### Snippet
```java

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true);
        PrintWriter err = new PrintWriter(System.err, true);
        System.exit(Main.run(out, err, args));
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `plugins/jreleaser-tool-provider/src/main/java/org/jreleaser/tool/JReleaser.java`
#### Snippet
```java
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true);
        PrintWriter err = new PrintWriter(System.err, true);
        System.exit(Main.run(out, err, args));
    }
```

## DynamicRegexReplaceableByCompiledPattern
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
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/Env.java`
#### Snippet
```java
            key = JRELEASER_ENV_PREFIX + key;
        }
        return key.replace(".", "_")
            .toUpperCase(Locale.ENGLISH);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/Env.java`
#### Snippet
```java

    public static String toVar(String str) {
        return str.replaceAll(" ", "_")
            .replaceAll("-", "_")
            .toUpperCase(Locale.ENGLISH);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/Env.java`
#### Snippet
```java
    public static String toVar(String str) {
        return str.replaceAll(" ", "_")
            .replaceAll("-", "_")
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
        return key.replace("_", ".")
            .toLowerCase(Locale.ENGLISH);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/VersionPattern.java`
#### Snippet
```java
        public static Type of(String str) {
            if (isBlank(str)) return null;
            return Type.valueOf(str.replaceAll(" ", "_")
                .replaceAll("-", "_")
                .toUpperCase(Locale.ENGLISH).trim());
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/VersionPattern.java`
#### Snippet
```java
            if (isBlank(str)) return null;
            return Type.valueOf(str.replaceAll(" ", "_")
                .replaceAll("-", "_")
                .toUpperCase(Locale.ENGLISH).trim());
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Distribution.java`
#### Snippet
```java
            if (isBlank(str)) return null;

            String value = str.replaceAll(" ", "_")
                .replaceAll("-", "_")
                .toUpperCase(Locale.ENGLISH).trim();
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Distribution.java`
#### Snippet
```java

            String value = str.replaceAll(" ", "_")
                .replaceAll("-", "_")
                .toUpperCase(Locale.ENGLISH).trim();

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
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/hooks/ExecutionEvent.java`
#### Snippet
```java
        public static Type of(String str) {
            if (isBlank(str)) return null;
            return Type.valueOf(str.replaceAll(" ", "_")
                .replaceAll("-", "_")
                .toUpperCase(Locale.ENGLISH).trim());
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/hooks/ExecutionEvent.java`
#### Snippet
```java
            if (isBlank(str)) return null;
            return Type.valueOf(str.replaceAll(" ", "_")
                .replaceAll("-", "_")
                .toUpperCase(Locale.ENGLISH).trim());
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
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java

        String naturalName = getNaturalName(getShortName(name));
        return naturalName.replaceAll("\\s", "-").toLowerCase(Locale.ENGLISH);
    }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
        StringBuilder buf = new StringBuilder();
        if (name != null && name.length() > 0) {
            String[] tokens = name.split("[^\\w\\d]");
            for (String token1 : tokens) {
                String token = token1.trim();
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
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
    @Override
    public String toRpmVersion() {
        return toString().replace("-", "_");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
        requireNonBlank(format, "Argument 'format' must not be blank");

        return of(format, format.replace(YEAR_LONG, "2000")
            .replace(YEAR_SHORT, "0")
            .replace(YEAR_ZERO, "0")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java

        return of(format, format.replace(YEAR_LONG, "2000")
            .replace(YEAR_SHORT, "0")
            .replace(YEAR_ZERO, "0")
            .replace(MONTH_SHORT, "1")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
        return of(format, format.replace(YEAR_LONG, "2000")
            .replace(YEAR_SHORT, "0")
            .replace(YEAR_ZERO, "0")
            .replace(MONTH_SHORT, "1")
            .replace(MONTH_ZERO, "01")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(YEAR_SHORT, "0")
            .replace(YEAR_ZERO, "0")
            .replace(MONTH_SHORT, "1")
            .replace(MONTH_ZERO, "01")
            .replace(WEEK_SHORT, "1")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(YEAR_ZERO, "0")
            .replace(MONTH_SHORT, "1")
            .replace(MONTH_ZERO, "01")
            .replace(WEEK_SHORT, "1")
            .replace(WEEK_ZERO, "01")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(MONTH_SHORT, "1")
            .replace(MONTH_ZERO, "01")
            .replace(WEEK_SHORT, "1")
            .replace(WEEK_ZERO, "01")
            .replace(DAY_SHORT, "1")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(MONTH_ZERO, "01")
            .replace(WEEK_SHORT, "1")
            .replace(WEEK_ZERO, "01")
            .replace(DAY_SHORT, "1")
            .replace(DAY_ZERO, "01")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(WEEK_SHORT, "1")
            .replace(WEEK_ZERO, "01")
            .replace(DAY_SHORT, "1")
            .replace(DAY_ZERO, "01")
            .replace(MINOR, "0")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(WEEK_ZERO, "01")
            .replace(DAY_SHORT, "1")
            .replace(DAY_ZERO, "01")
            .replace(MINOR, "0")
            .replace(MICRO, "0")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(DAY_SHORT, "1")
            .replace(DAY_ZERO, "01")
            .replace(MINOR, "0")
            .replace(MICRO, "0")
            .replace(MODIFIER, "A")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(DAY_ZERO, "01")
            .replace(MINOR, "0")
            .replace(MICRO, "0")
            .replace(MODIFIER, "A")
            .replace("[", "")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(MINOR, "0")
            .replace(MICRO, "0")
            .replace(MODIFIER, "A")
            .replace("[", "")
            .replace("]", ""));
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(MICRO, "0")
            .replace(MODIFIER, "A")
            .replace("[", "")
            .replace("]", ""));
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/CalVer.java`
#### Snippet
```java
            .replace(MODIFIER, "A")
            .replace("[", "")
            .replace("]", ""));
    }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/MacportsPackagerProcessor.java`
#### Snippet
```java
            releaser.getResolvedRepoCloneUrl(context.getModel(), packager.getRepository().getOwner(), packager.getRepository().getResolvedName()));

        List<String> longDescription = Arrays.asList(context.getModel().getProject().getLongDescription().split("\\n"));

        props.put(KEY_MACPORTS_PACKAGE_NAME, packager.getPackageName());
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/JbangPackagerProcessor.java`
#### Snippet
```java

    private String sanitizeScriptName(String scriptName) {
        scriptName = scriptName.replaceAll("-", "_");
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
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/AssemblerUtils.java`
#### Snippet
```java
    public static Path maybeAdjust(Path path) {
        if (PlatformUtils.isWindows()) {
            return Paths.get(path.toString().replace("/", File.separator));
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
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/DefaultExtensionManager.java`
#### Snippet
```java

            String content = IOUtils.toString(template.getReader());
            content = content.replaceAll("@groupId@", gav[0])
                .replaceAll("@artifactId@", gav[1])
                .replaceAll("@version@", gav[2]);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/DefaultExtensionManager.java`
#### Snippet
```java
            String content = IOUtils.toString(template.getReader());
            content = content.replaceAll("@groupId@", gav[0])
                .replaceAll("@artifactId@", gav[1])
                .replaceAll("@version@", gav[2]);

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-engine/src/main/java/org/jreleaser/extensions/internal/DefaultExtensionManager.java`
#### Snippet
```java
            content = content.replaceAll("@groupId@", gav[0])
                .replaceAll("@artifactId@", gav[1])
                .replaceAll("@version@", gav[2]);

            Files.write(pom, content.getBytes(), WRITE, TRUNCATE_EXISTING);
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
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/util/VersionUtils.java`
#### Snippet
```java
        BaseReleaser gitService = context.getModel().getRelease().getReleaser();
        String tagName = gitService.getConfiguredTagName();
        Pattern vp = Pattern.compile(tagName.replaceAll("\\{\\{.*}}", "\\(\\.\\*\\)"));
        if (!tagName.contains("{{")) {
            vp = Pattern.compile("(.*)");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModel.java`
#### Snippet
```java
                case "md":
                    return ("[{{artifactFile}}](" + getRelease().getReleaser().getDownloadUrl() + ")")
                        .replace("{{artifactFile}}", artifactFile);
                case "adoc":
                    return ("link:" + getRelease().getReleaser().getDownloadUrl() + "[{{artifactFile}}]")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModel.java`
#### Snippet
```java
                case "adoc":
                    return ("link:" + getRelease().getReleaser().getDownloadUrl() + "[{{artifactFile}}]")
                        .replace("{{artifactFile}}", artifactFile);
                case "html":
                    return ("<a href=\"" + getRelease().getReleaser().getDownloadUrl() + "\">{{artifactFile}}</a>")
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModel.java`
#### Snippet
```java
                case "html":
                    return ("<a href=\"" + getRelease().getReleaser().getDownloadUrl() + "\">{{artifactFile}}</a>")
                        .replace("{{artifactFile}}", artifactFile);
            }

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
            if (!Paths.get(test).isAbsolute()) {
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
            if (!Paths.get(test).isAbsolute()) {
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
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/SmtpAnnouncer.java`
#### Snippet
```java

    public void setMimeType(String mimeType) {
        this.mimeType = Mail.MimeType.valueOf(mimeType.replaceAll(" ", "_")
            .replaceAll("-", "_")
            .toUpperCase(Locale.ENGLISH));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/SmtpAnnouncer.java`
#### Snippet
```java
    public void setMimeType(String mimeType) {
        this.mimeType = Mail.MimeType.valueOf(mimeType.replaceAll(" ", "_")
            .replaceAll("-", "_")
            .toUpperCase(Locale.ENGLISH));
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/SmtpAnnouncer.java`
#### Snippet
```java

    public void setTransport(String transport) {
        this.transport = Mail.Transport.valueOf(transport.replaceAll(" ", "_")
            .replaceAll("-", "_")
            .toUpperCase(Locale.ENGLISH));
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/SmtpAnnouncer.java`
#### Snippet
```java
    public void setTransport(String transport) {
        this.transport = Mail.Transport.valueOf(transport.replaceAll(" ", "_")
            .replaceAll("-", "_")
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
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sdks/jreleaser-teams-java-sdk/src/main/java/org/jreleaser/sdk/teams/TeamsAnnouncer.java`
#### Snippet
```java

    public static String convertLineEndings(String str) {
        return str.replaceAll("\\n", "\\\\n\\\\n");
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ChangelogGenerator.java`
#### Snippet
```java
        String effectiveTagName = releaser.getEffectiveTagName(context.getModel());
        String tagName = releaser.getConfiguredTagName();
        String tagPattern = tagName.replaceAll("\\{\\{.*}}", "\\.\\*");

        Pattern versionPattern = VersionUtils.resolveVersionPattern(context);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `sdks/jreleaser-gitlab-java-sdk/src/main/java/org/jreleaser/sdk/gitlab/GitlabMavenDeployer.java`
#### Snippet
```java
    private void deletePackage(Gitlab api, Deployable deployable, List<GlPackage> glPackages) throws DeployException {
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
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Init.java`
#### Snippet
```java
            String content = IOUtils.toString(template.getReader());
            LocalDate now = LocalDate.now();
            content = content.replaceAll("@year@", now.getYear() + "");

            logger.info($("jreleaser.init.TEXT_writing_file"), outputFile.toAbsolutePath());
```

## UnnecessaryFullyQualifiedName
### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/Env.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class Env {
    private static final String JRELEASER_ENV_PREFIX = "JRELEASER_";
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
in `api/jreleaser-model-api/src/main/java/org/jreleaser/extensions/api/ExtensionManagerHolder.java`
#### Snippet
```java
 * @since 1.3.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public final class ExtensionManagerHolder {
    private static final ThreadLocal<ExtensionManager> EXTENSION_MANAGER_THREAD_LOCAL = ThreadLocal.withInitial(new Supplier<ExtensionManager>() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `api/jreleaser-mustache/src/main/java/org/jreleaser/mustache/MustacheUtils.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public final class MustacheUtils {
    private MustacheUtils() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/engine/context/ContextCreator.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class ContextCreator {
    public static JReleaserContext create(JReleaserLogger logger,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.io` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/AppImagePackagerProcessor.java`
#### Snippet
```java
                context.getLogger().debug("{} -> {}", iconUrl, context.relativizeToBasedir(iconPath));
                try {
                    org.apache.commons.io.FileUtils.copyURLToFile(
                        new URL(iconUrl),
                        iconPath.toFile(),
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
Qualifier `org.jreleaser.model.api.assemble` is unnecessary, and can be replaced with an import
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/AbstractJavaAssemblerProcessor.java`
#### Snippet
```java
 * @since 0.8.0
 */
abstract class AbstractJavaAssemblerProcessor<A extends org.jreleaser.model.api.assemble.Assembler, S extends JavaAssembler<A>> extends AbstractAssemblerProcessor<A, S> {
    protected AbstractJavaAssemblerProcessor(JReleaserContext context) {
        super(context);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `core/jreleaser-templates/src/main/java/org/jreleaser/templates/TemplateGenerator.java`
#### Snippet
```java
    private TemplateGenerator(JReleaserLogger logger,
                              String distributionName,
                              org.jreleaser.model.Distribution.DistributionType distributionType,
                              String packagerName,
                              String announcerName,
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
    private final JReleaserLogger logger;
    private final String distributionName;
    private final org.jreleaser.model.Distribution.DistributionType distributionType;
    private final String packagerName;
    private final String announcerName;
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
        set.add(org.jreleaser.model.api.packagers.DockerPackager.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.AsdfPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.BrewPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.ChocolateyPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.DockerPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.FlatpakPackager.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.BrewPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.ChocolateyPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.DockerPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.FlatpakPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.GofishPackager.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.ChocolateyPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.DockerPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.FlatpakPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.GofishPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.JbangPackager.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.DockerPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.FlatpakPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.GofishPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.JbangPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.MacportsPackager.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.FlatpakPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.GofishPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.JbangPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.MacportsPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.ScoopPackager.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.GofishPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.JbangPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.MacportsPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.ScoopPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.SdkmanPackager.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.JbangPackager.TYPE);
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
        return unmodifiableSet(set);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.packagers.SdkmanPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.SnapPackager.TYPE);
        set.add(org.jreleaser.model.api.packagers.SpecPackager.TYPE);
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
        set.add(org.jreleaser.model.api.assemble.JlinkAssembler.TYPE);
        set.add(org.jreleaser.model.api.assemble.JpackageAssembler.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.assemble` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        Set<String> set = new LinkedHashSet<>();
        set.add(org.jreleaser.model.api.assemble.ArchiveAssembler.TYPE);
        set.add(org.jreleaser.model.api.assemble.JlinkAssembler.TYPE);
        set.add(org.jreleaser.model.api.assemble.JpackageAssembler.TYPE);
        set.add(org.jreleaser.model.api.assemble.NativeImageAssembler.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.assemble` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.assemble.ArchiveAssembler.TYPE);
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
Qualifier `org.jreleaser.model.api.deploy.maven` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
    public static Set<String> supportedMavenDeployers() {
        Set<String> set = new LinkedHashSet<>();
        set.add(org.jreleaser.model.api.deploy.maven.ArtifactoryMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.GiteaMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.GithubMavenDeployer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.deploy.maven` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        Set<String> set = new LinkedHashSet<>();
        set.add(org.jreleaser.model.api.deploy.maven.ArtifactoryMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.GiteaMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.GithubMavenDeployer.TYPE);
        set.add(org.jreleaser.model.api.deploy.maven.GitlabMavenDeployer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.deploy.maven` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.deploy.maven.ArtifactoryMavenDeployer.TYPE);
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
        set.add(org.jreleaser.model.api.announce.HttpAnnouncers.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.DiscussionsAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.GitterAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.GoogleChatAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.HttpAnnouncers.TYPE);
        set.add(org.jreleaser.model.api.announce.SmtpAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.GitterAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.GoogleChatAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.HttpAnnouncers.TYPE);
        set.add(org.jreleaser.model.api.announce.SmtpAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.MastodonAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.GoogleChatAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.HttpAnnouncers.TYPE);
        set.add(org.jreleaser.model.api.announce.SmtpAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.MastodonAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.MattermostAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.HttpAnnouncers.TYPE);
        set.add(org.jreleaser.model.api.announce.SmtpAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.MastodonAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.MattermostAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.SdkmanAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.SmtpAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.MastodonAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.MattermostAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.SdkmanAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.SlackAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.MastodonAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.MattermostAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.SdkmanAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.SlackAnnouncer.TYPE);
        set.add(org.jreleaser.model.api.announce.TeamsAnnouncer.TYPE);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.announce` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserSupport.java`
#### Snippet
```java
        set.add(org.jreleaser.model.api.announce.MattermostAnnouncer.TYPE);
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
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/GithubReleaser.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return commitAuthor.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/GiteaReleaser.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return commitAuthor.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/CodebergReleaser.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return commitAuthor.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/GenericGitReleaser.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return commitAuthor.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/release/GitlabReleaser.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return commitAuthor.asImmutable();
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
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/DiscussionsAnnouncer.java`
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/TelegramAnnouncer.java`
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/DiscourseAnnouncer.java`
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
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/WebhookAnnouncer.java`
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/SmtpAnnouncer.java`
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/ZulipAnnouncer.java`
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
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/SlackAnnouncer.java`
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
Qualifier `org.jreleaser.model.api.platform` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/ArchiveAssembler.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.platform.Platform getPlatform() {
            return platform.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JlinkAssembler.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.Java getJava() {
            return java.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.platform` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JlinkAssembler.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.platform.Platform getPlatform() {
            return platform.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.platform` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/NativeImageAssembler.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.platform.Platform getPlatform() {
            return platform.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/NativeImageAssembler.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.Java getJava() {
            return java.asImmutable();
        }
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/ScoopPackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return commitAuthor.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/ChocolateyPackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return commitAuthor.asImmutable();
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

    static {
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

    static {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SdkmanPackager.java`
#### Snippet
```java
 */
public final class SdkmanPackager extends AbstractPackager<org.jreleaser.model.api.packagers.SdkmanPackager, SdkmanPackager> implements TimeoutAware {
    private static final Map<org.jreleaser.model.Distribution.DistributionType, Set<String>> SUPPORTED = new LinkedHashMap<>();

    static {
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AsdfPackager.java`
#### Snippet
```java

    @Override
    public boolean supportsDistribution(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return SUPPORTED.containsKey(distributionType);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AsdfPackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return commitAuthor.asImmutable();
        }
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
 */
public final class AsdfPackager extends AbstractRepositoryPackager<org.jreleaser.model.api.packagers.AsdfPackager, AsdfPackager> {
    private static final Map<org.jreleaser.model.Distribution.DistributionType, Set<String>> SUPPORTED = new LinkedHashMap<>();

    static {
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
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/GofishPackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return commitAuthor.asImmutable();
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

    static {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AppImagePackager.java`
#### Snippet
```java
 */
public final class AppImagePackager extends AbstractRepositoryPackager<org.jreleaser.model.api.packagers.AppImagePackager, AppImagePackager> {
    private static final Map<org.jreleaser.model.Distribution.DistributionType, Set<String>> SUPPORTED = new LinkedHashMap<>();

    static {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AppImagePackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return commitAuthor.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.platform` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JpackageAssembler.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.platform.Platform getPlatform() {
            return platform.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JpackageAssembler.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.Java getJava() {
            return java.asImmutable();
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

    static {
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/MacportsPackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return commitAuthor.asImmutable();
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/FlatpakPackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return commitAuthor.asImmutable();
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/FlatpakPackager.java`
#### Snippet
```java
 */
public final class FlatpakPackager extends AbstractRepositoryPackager<org.jreleaser.model.api.packagers.FlatpakPackager, FlatpakPackager> {
    private static final Map<org.jreleaser.model.Distribution.DistributionType, Set<String>> SUPPORTED = new LinkedHashMap<>();

    static {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/JbangPackager.java`
#### Snippet
```java
 */
public final class JbangPackager extends AbstractRepositoryPackager<org.jreleaser.model.api.packagers.JbangPackager, JbangPackager> {
    private static final Map<org.jreleaser.model.Distribution.DistributionType, Set<String>> SUPPORTED = new LinkedHashMap<>();

    static {
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
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/JbangPackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return commitAuthor.asImmutable();
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SpecPackager.java`
#### Snippet
```java

    @Override
    public Set<String> getSupportedFileExtensions(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return unmodifiableSet(SUPPORTED.getOrDefault(distributionType, emptySet()));
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SpecPackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return commitAuthor.asImmutable();
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

    static {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/SdkmanAnnouncerValidator.java`
#### Snippet
```java

        if (null == sdkman.getCommand()) {
            sdkman.setCommand(org.jreleaser.model.Sdkman.Command.MAJOR);
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/project/ProjectValidator.java`
#### Snippet
```java
                false));

        if (project.versionPattern().getType() == org.jreleaser.model.VersionPattern.Type.CALVER) {
            if (isBlank(project.versionPattern().getFormat())) {
                errors.configuration(RB.$("validation_version_format_missing",
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/SmtpAnnouncerValidator.java`
#### Snippet
```java

        if (null == smtp.getTransport()) {
            smtp.setTransport(org.jreleaser.model.Mail.Transport.SMTP);
        }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/announce/SmtpAnnouncerValidator.java`
#### Snippet
```java

        if (null == smtp.getMimeType()) {
            smtp.setMimeType(org.jreleaser.model.Mail.MimeType.TEXT);
        }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/release/BaseReleaserValidator.java`
#### Snippet
```java
        if (mode.validateConfig()) {
            if (service.isSign()) {
                if (model.getSigning().getMode() == org.jreleaser.model.Signing.Mode.COSIGN) {
                    service.setSign(false);
                    errors.warning(RB.$("validation_git_signing_cosign", service.getServiceName()));
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/assemble/ArchiveAssemblerResolver.java`
#### Snippet
```java
        String archiveName = archive.getResolvedArchiveName(context);

        for (org.jreleaser.model.Archive.Format format : archive.getFormats()) {
            Path path = baseOutputDirectory
                .resolve(archiveName + "." + format.extension())
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

    @Override
    public boolean supportsDistribution(org.jreleaser.model.Distribution.DistributionType distributionType) {
        return SUPPORTED.containsKey(distributionType);
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

    static {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/SnapPackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return commitAuthor.asImmutable();
        }
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
Qualifier `org.jreleaser.model.api.common` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/BrewPackager.java`
#### Snippet
```java

        @Override
        public org.jreleaser.model.api.common.CommitAuthor getCommitAuthor() {
            return commitAuthor.asImmutable();
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
public class JsonJReleaserConfigParser implements JReleaserConfigParser {
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
public class TomlJReleaserConfigParser implements JReleaserConfigParser {
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
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-git-java-sdk/src/main/java/org/jreleaser/sdk/git/ReleaseUtils.java`
#### Snippet
```java
 * @since 0.7.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public final class ReleaseUtils {
    private ReleaseUtils() {
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
        public org.jreleaser.model.api.packagers.DockerPackager getDocker() {
            return docker.asImmutable();
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
            case org.jreleaser.model.api.packagers.DockerPackager.TYPE:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
            case org.jreleaser.model.api.packagers.ChocolateyPackager.TYPE:
                return (T) getChocolatey();
            case org.jreleaser.model.api.packagers.DockerPackager.TYPE:
                return (T) getDocker();
            case org.jreleaser.model.api.packagers.FlatpakPackager.TYPE:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
            case org.jreleaser.model.api.packagers.DockerPackager.TYPE:
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
            case org.jreleaser.model.api.packagers.MacportsPackager.TYPE:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model.api.packagers` is unnecessary, and can be replaced with an import
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/distributions/Distribution.java`
#### Snippet
```java
            case org.jreleaser.model.api.packagers.JbangPackager.TYPE:
                return (T) getJbang();
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
            default:
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
        public org.jreleaser.model.api.packagers.ChocolateyPackager getChocolatey() {
            return chocolatey.asImmutable();
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
Qualifier `org.jreleaser.infra.nativeimage.annotations` is unnecessary, and can be replaced with an import
in `core/jreleaser-config-yaml/src/main/java/org/jreleaser/config/yaml/YamlJReleaserConfigParser.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
@ServiceProviderFor(JReleaserConfigParser.class)
public class YamlJReleaserConfigParser implements JReleaserConfigParser {
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
Qualifier `org.apache.commons.io` is unnecessary, and can be replaced with an import
in `sdks/jreleaser-http-java-sdk/src/main/java/org/jreleaser/sdk/http/HttpArtifactDownloader.java`
#### Snippet
```java

        try {
            org.apache.commons.io.FileUtils.copyURLToFile(
                new URL(input),
                outputPath.toFile(),
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
    private static final Tika TIKA = new Tika();
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
    private final Integer port;
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
                               Integer port,
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
        private final JReleaserLogger logger;
        private boolean dryrun;
        private org.jreleaser.model.Mail.Transport transport = org.jreleaser.model.Mail.Transport.SMTP;
        private String host;
        private Integer port;
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
        private Integer port;
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
in `sdks/jreleaser-gitea-java-sdk/src/main/java/org/jreleaser/sdk/gitea/GiteaReleaser.java`
#### Snippet
```java
 * @since 0.1.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class GiteaReleaser extends AbstractReleaser<org.jreleaser.model.api.release.GiteaReleaser> {
    private final org.jreleaser.model.internal.release.GiteaReleaser gitea;
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
    private final org.jreleaser.model.internal.release.GitlabReleaser gitlab;
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
in `sdks/jreleaser-genericgit-java-sdk/src/main/java/org/jreleaser/sdk/generic/git/GenericGitReleaser.java`
#### Snippet
```java
 * @since 0.4.0
 */
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public class GenericGitReleaser extends AbstractReleaser<org.jreleaser.model.api.release.GenericGitReleaser> {
    public GenericGitReleaser(JReleaserContext context, List<Asset> assets) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary and can be removed
in `sdks/jreleaser-java-sdk-commons/src/main/java/org/jreleaser/sdk/commons/AbstractMavenDeployer.java`
#### Snippet
```java
                DeployableCollector collector = new DeployableCollector(root);

                java.nio.file.Files.walkFileTree(root, collector);
                if (collector.failed) {
                    throw new JReleaserException(RB.$("ERROR_deployer_stage_resolution"));
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
    private final org.jreleaser.model.internal.release.CodebergReleaser codeberg;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Template.java`
#### Snippet
```java
            required = true,
            defaultValue = "JAVA_BINARY")
        org.jreleaser.model.Distribution.DistributionType distributionType;
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Template.java`
#### Snippet
```java
        }

        org.jreleaser.model.Distribution.DistributionType distributionType() {
            return packagers != null ? packagers.distributionType : null;
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/JReleaserTemplateTask.java`
#### Snippet
```java
    }

    public void setDistributionType(org.jreleaser.model.Distribution.DistributionType distributionType) {
        this.distributionType = distributionType;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/JReleaserTemplateTask.java`
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
in `plugins/jreleaser-ant-tasks/src/main/java/org/jreleaser/ant/tasks/JReleaserTemplateTask.java`
#### Snippet
```java
    private Path outputDir;
    private String distributionName;
    private org.jreleaser.model.Distribution.DistributionType distributionType = org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;
    private String packagerName;
    private String announcerName;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserAutoConfigReleaseMojo.java`
#### Snippet
```java
    }

    private Set<org.jreleaser.model.UpdateSection> collectUpdateSections() {
        Set<org.jreleaser.model.UpdateSection> set = new LinkedHashSet<>();
        if (updateSections != null && updateSections.length > 0) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserAutoConfigReleaseMojo.java`
#### Snippet
```java

    private Set<org.jreleaser.model.UpdateSection> collectUpdateSections() {
        Set<org.jreleaser.model.UpdateSection> set = new LinkedHashSet<>();
        if (updateSections != null && updateSections.length > 0) {
            for (UpdateSection updateSection : updateSections) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary and can be removed
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserAutoConfigReleaseMojo.java`
#### Snippet
```java
        if (updateSections != null && updateSections.length > 0) {
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
            return new PrintWriter(new FileOutputStream(
                outputDirectory.toPath().resolve("trace.log").toFile()));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserTemplateMojo.java`
#### Snippet
```java
    protected PrintWriter createTracer() throws MojoExecutionException {
        try {
            java.nio.file.Files.createDirectories(outputDirectory.toPath());
            return new PrintWriter(new FileOutputStream(outputDirectory.toPath().resolve("trace.log").toFile()));
        } catch (IOException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserTemplateMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "jreleaser.template.distribution.type", defaultValue = "JAVA_BINARY")
    private final org.jreleaser.model.Distribution.DistributionType distributionType = org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jreleaser.model` is unnecessary, and can be replaced with an import
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/JReleaserTemplateMojo.java`
#### Snippet
```java
     */
    @Parameter(property = "jreleaser.template.distribution.type", defaultValue = "JAVA_BINARY")
    private final org.jreleaser.model.Distribution.DistributionType distributionType = org.jreleaser.model.Distribution.DistributionType.JAVA_BINARY;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `plugins/jreleaser-maven-plugin/src/main/java/org/jreleaser/maven/plugin/AbstractJReleaserMojo.java`
#### Snippet
```java
    protected PrintWriter createTracer() throws MojoExecutionException {
        try {
            java.nio.file.Files.createDirectories(outputDirectory.toPath());
            return new PrintWriter(new FileOutputStream(
                outputDirectory.toPath().resolve("trace.log").toFile()),
```

## SuspiciousToArrayCall
### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'T\[\]' found
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        public <T> T[] toArray(T[] ts) {
            return delegate.toArray(ts);
        }

```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'T\[\]' found
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java

        public <T> T[] toArray(T[] ts) {
            return delegate.toArray(ts);
        }

```

## NonProtectedConstructorInAbstractClass
### NonProtectedConstructorInAbstractClass
Constructor `Keyring()` of an abstract class should not be declared 'public'
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/signing/Keyring.java`
#### Snippet
```java
    private PGPSecretKeyRingCollection secretKeyRings;

    public Keyring() throws IOException, PGPException {
        this.publicKeyRings = new PGPPublicKeyRingCollection(Collections.emptyList());
        this.secretKeyRings = new PGPSecretKeyRingCollection(Collections.emptyList());
```

### NonProtectedConstructorInAbstractClass
Constructor `JReleaserModelPrinter()` of an abstract class should not be declared 'public'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/JReleaserModelPrinter.java`
#### Snippet
```java
    private final PrintWriter out;

    public JReleaserModelPrinter(PrintWriter out) {
        this.out = out;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSshUploader()` of an abstract class should not be declared 'public'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/upload/AbstractSshUploader.java`
#### Snippet
```java
    protected String downloadUrl;

    public AbstractSshUploader(String type) {
        super(type);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSshDownloader()` of an abstract class should not be declared 'public'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/download/AbstractSshDownloader.java`
#### Snippet
```java
    protected String fingerprint;

    public AbstractSshDownloader(String type) {
        super(type);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractRepositoryTap()` of an abstract class should not be declared 'public'
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/packagers/AbstractRepositoryTap.java`
#### Snippet
```java
    protected String commitMessage;

    public AbstractRepositoryTap(String basename, String tapName) {
        this.basename = basename;
        this.tapName = tapName;
```

## Convert2Lambda
### Convert2Lambda
Anonymous new Supplier() can be replaced with lambda
in `api/jreleaser-model-api/src/main/java/org/jreleaser/extensions/api/ExtensionManagerHolder.java`
#### Snippet
```java
@org.jreleaser.infra.nativeimage.annotations.NativeImage
public final class ExtensionManagerHolder {
    private static final ThreadLocal<ExtensionManager> EXTENSION_MANAGER_THREAD_LOCAL = ThreadLocal.withInitial(new Supplier<ExtensionManager>() {
        @Override
        public ExtensionManager get() {
```

### Convert2Lambda
Anonymous new Predicate() can be replaced with lambda
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/JpackageAssemblerProcessor.java`
#### Snippet
```java

        try {
            if (!FileUtils.copyFilesRecursive(context.getLogger(), originalImage, adjustedImage, new Predicate<Path>() {
                @Override
                public boolean test(Path path) {
```

## AssignmentToMethodParameter
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
        return key.replace(".", "_")
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/Env.java`
#### Snippet
```java
        if (isBlank(value)) {
            String prefixedKey = envKey(key);
            value = System.getenv(prefixedKey);
            if (isBlank(value)) {
                errors.configuration(RB.$("ERROR_environment_property_check",
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
        return key.replace("_", ".")
```

### AssignmentToMethodParameter
Assignment to method parameter `input`
in `api/jreleaser-mustache/src/main/java/org/jreleaser/mustache/Templates.java`
#### Snippet
```java

        while (input.contains("{{")) {
            input = applyTemplate(input, props);
            count++;

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
        int pos = name.lastIndexOf(".");
        if (pos != -1) {
            name = name.substring(pos + 1);
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
Assignment to method parameter `className`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
        int i = className.lastIndexOf(".");
        if (i > -1) {
            className = className.substring(i + 1, className.length());
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/MacportsPackagerProcessor.java`
#### Snippet
```java
                             String fileName)
        throws PackagerProcessingException {
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
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/SnapPackagerProcessor.java`
#### Snippet
```java
                             String fileName)
        throws PackagerProcessingException {
        fileName = trimTplExtension(fileName);

        Path outputFile = outputDirectory.resolve(fileName);
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/SpecPackagerProcessor.java`
#### Snippet
```java
                             String fileName)
        throws PackagerProcessingException {
        fileName = trimTplExtension(fileName);

        Path outputFile = "app.spec".equals(fileName) ?
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/JbangPackagerProcessor.java`
#### Snippet
```java
                             String fileName)
        throws PackagerProcessingException {
        fileName = trimTplExtension(fileName);

        String scriptName = (String) props.get(KEY_JBANG_SCRIPT_NAME);
```

### AssignmentToMethodParameter
Assignment to method parameter `scriptName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/JbangPackagerProcessor.java`
#### Snippet
```java

    private String sanitizeScriptName(String scriptName) {
        scriptName = scriptName.replaceAll("-", "_");
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < scriptName.length(); i++) {
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/GofishPackagerProcessor.java`
#### Snippet
```java
                             String fileName)
        throws PackagerProcessingException {
        fileName = trimTplExtension(fileName);

        Path outputFile = "food.lua".equals(fileName) ?
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
                fileName = fileName.substring(distribution.getStereotype().toString().length() + 1);
            } else {
                // skip it
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/ScoopPackagerProcessor.java`
#### Snippet
```java
                             String fileName)
        throws PackagerProcessingException {
        fileName = trimTplExtension(fileName);

        Path outputFile = "manifest.json".equals(fileName) ?
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
                fileName = fileName.substring(distribution.getStereotype().toString().length() + 1);
            } else {
                // skip it
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
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/JlinkAssemblerProcessor.java`
#### Snippet
```java
    protected void writeFile(Project project, String content, Map<String, Object> props, String fileName)
        throws AssemblerProcessingException {
        fileName = trimTplExtension(fileName);

        Path outputDirectory = (Path) props.get(Constants.KEY_DISTRIBUTION_ASSEMBLE_DIRECTORY);
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/assemblers/JpackageAssemblerProcessor.java`
#### Snippet
```java
    protected void writeFile(Project project, String content, Map<String, Object> props, String fileName)
        throws AssemblerProcessingException {
        fileName = trimTplExtension(fileName);

        Path outputDirectory = (Path) props.get(Constants.KEY_DISTRIBUTION_ASSEMBLE_DIRECTORY);
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/DockerPackagerProcessor.java`
#### Snippet
```java
                             String fileName)
        throws PackagerProcessingException {
        fileName = trimTplExtension(fileName);

        Path outputFile = "executable".equals(fileName) ?
```

### AssignmentToMethodParameter
Assignment to method parameter `imageName`
in `core/jreleaser-engine/src/main/java/org/jreleaser/packagers/DockerPackagerProcessor.java`
#### Snippet
```java

    private void publish(AbstractDockerConfiguration.Registry registry, String imageName, Map<String, Object> props) throws PackagerProcessingException {
        imageName = resolveTemplate(imageName, props);

        String tag = imageName;
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
Assignment to method parameter `page`
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/XGithub.java`
#### Snippet
```java
        logger.debug(next.toString());

        page = api.listPackageVersions1(next);
        issues.addAll(page.getContent());

```

### AssignmentToMethodParameter
Assignment to method parameter `endpoint`
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/Github.java`
#### Snippet
```java

        if (isBlank(endpoint)) {
            endpoint = ENDPOINT;
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

        page = api.listLabels1(next);
        labels.addAll(page.getContent());

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

        page = api.listIssues1(next);
        issues.addAll(page.getContent());

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

## ReturnNull
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
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/Algorithm.java`
#### Snippet
```java
    @JsonCreator
    public static Algorithm of(String str) {
        if (isBlank(str)) return null;

        String value = str.toUpperCase(Locale.ENGLISH).trim();
```

### ReturnNull
Return of `null`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/ResourceUtils.java`
#### Snippet
```java

    public static URL resolveLocation(Class<?> klass) {
        if (klass == null) return null;

        try {
```

### ReturnNull
Return of `null`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/ResourceUtils.java`
#### Snippet
```java

        URL classResource = klass.getResource(klass.getSimpleName() + ".class");
        if (classResource == null) return null;

        String url = classResource.toString();
```

### ReturnNull
Return of `null`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/ResourceUtils.java`
#### Snippet
```java
        String url = classResource.toString();
        String suffix = klass.getCanonicalName().replace('.', '/') + ".class";
        if (!url.endsWith(suffix)) return null;
        String path = url.substring(0, url.length() - suffix.length());

```

### ReturnNull
Return of `null`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/ResourceUtils.java`
#### Snippet
```java
            return new URL(path);
        } catch (MalformedURLException ignored) {
            return null;
        }
    }
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
            return Type.valueOf(str.replaceAll(" ", "_")
                .replaceAll("-", "_")
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
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/Distribution.java`
#### Snippet
```java

        public static DistributionType of(String str) {
            if (isBlank(str)) return null;

            String value = str.replaceAll(" ", "_")
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
in `api/jreleaser-model-api/src/main/java/org/jreleaser/model/api/hooks/ExecutionEvent.java`
#### Snippet
```java

        public static Type of(String str) {
            if (isBlank(str)) return null;
            return Type.valueOf(str.replaceAll(" ", "_")
                .replaceAll("-", "_")
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
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
    public static String getFilename(String path) {
        if (path == null) {
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
        if (clazz == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/StringUtils.java`
#### Snippet
```java
    public static String getFilenameExtension(String path) {
        if (path == null) {
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
in `api/jreleaser-utils/src/main/java/org/jreleaser/util/CollectionUtils.java`
#### Snippet
```java
        public String getProperty(String key) { // lgtm [java/unsynchronized-getter]
            Object value = map.get(key);
            return value != null ? String.valueOf(value) : null;
        }

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
            return b ? green(String.valueOf(b)) : red(String.valueOf(b));
        } else {
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
            return cyan(s);
        } catch (Exception e) {
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
        if (null != codeberg) return codeberg.asImmutable();
        if (null != generic) return generic.asImmutable();
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

        Optional<? extends Uploader> uploader = upload
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/announce/HttpAnnouncer.java`
#### Snippet
```java
        @Override
        public Method getMethod() {
            return null;
        }

```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/JlinkAssembler.java`
#### Snippet
```java

    public String getResolvedImageNameTransform(JReleaserContext context) {
        if (isBlank(imageNameTransform)) return null;
        Map<String, Object> props = context.getModel().props();
        props.putAll(props());
```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/assemble/NativeImageAssembler.java`
#### Snippet
```java

    public String getResolvedImageNameTransform(JReleaserContext context) {
        if (isBlank(imageNameTransform)) return null;
        Map<String, Object> props = context.getModel().props();
        props.putAll(props());
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
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/common/Validator.java`
#### Snippet
```java
        String configFilePath = environment.getPropertiesFile().toAbsolutePath().normalize().toString();
        String val = Env.check(keys, environment.getVars(), property, dsl, configFilePath, dryrun ? new Errors() : errors);
        return isNotBlank(val) ? Integer.parseInt(val) : null;
    }

```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/common/Validator.java`
#### Snippet
```java
        String configFilePath = environment.getPropertiesFile().toAbsolutePath().normalize().toString();
        String val = Env.check(key, environment.getVariable(key), property, dsl, configFilePath, dryrun ? new Errors() : errors);
        return isNotBlank(val) ? Integer.parseInt(val) : null;
    }

```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/common/Validator.java`
#### Snippet
```java
        Errors errors = new Errors();
        String result = Env.check(keys, environment.getVars(), property, dsl, configFilePath, errors);
        return !errors.hasErrors() ? result : (null != defaultValue ? defaultValue.name() : null);
    }

```

### ReturnNull
Return of `null`
in `core/jreleaser-model-impl/src/main/java/org/jreleaser/model/internal/validation/common/Validator.java`
#### Snippet
```java
        Errors errors = new Errors();
        String result = Env.check(key, environment.getVariable(key), property, dsl, configFilePath, errors);
        return !errors.hasErrors() ? result : (null != defaultValue ? defaultValue.name() : null);
    }

```

### ReturnNull
Return of `null`
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/SshUtils.java`
#### Snippet
```java

    public static SSHClient createSSHClient(JReleaserContext context, SshUploader uploader) throws UploadException {
        if (context.isDryrun()) return null;

        try {
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-ssh-java-sdk/src/main/java/org/jreleaser/sdk/ssh/SshUtils.java`
#### Snippet
```java

    public static SFTPClient createSFTPClient(JReleaserContext context, SshUploader uploader, SSHClient ssh) throws UploadException {
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
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/Github.java`
#### Snippet
```java
        } catch (GHFileNotFoundException e) {
            // OK, this means the repository does not exist
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `sdks/jreleaser-github-java-sdk/src/main/java/org/jreleaser/sdk/github/Github.java`
#### Snippet
```java
        } catch (GHFileNotFoundException ignored) {
            // OK, means the organization does not exist
            return null;
        }
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
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] excludedAnnouncers() {
            return exclude != null ? exclude.excludedAnnouncers : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] excludedDeployerNames() {
            return exclude != null ? exclude.excludedDeployerNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Assemble.java`
#### Snippet
```java

        String[] excludedAssemblers() {
            return exclude != null ? exclude.excludedAssemblers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] excludedUploaderTypes() {
            return exclude != null ? exclude.excludedUploaderTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] excludedDeployerTypes() {
            return exclude != null ? exclude.excludedDeployerTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] includedDeployerNames() {
            return include != null ? include.includedDeployerNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] includedDeployerTypes() {
            return include != null ? include.includedDeployerTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] includedDistributions() {
            return include != null ? include.includedDistributions : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] excludedPackagers() {
            return exclude != null ? exclude.excludedPackagers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Assemble.java`
#### Snippet
```java

        String[] includedDistributions() {
            return include != null ? include.includedDistributions : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Assemble.java`
#### Snippet
```java

        String[] includedAssemblers() {
            return include != null ? include.includedAssemblers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] includedAnnouncers() {
            return include != null ? include.includedAnnouncers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] includedPackagers() {
            return include != null ? include.includedPackagers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Assemble.java`
#### Snippet
```java

        String[] excludedDistributions() {
            return exclude != null ? exclude.excludedDistributions : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] includedUploaderTypes() {
            return include != null ? include.includedUploaderTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] includedUploaderNames() {
            return include != null ? include.includedUploaderNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] excludedDistributions() {
            return exclude != null ? exclude.excludedDistributions : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/FullRelease.java`
#### Snippet
```java

        String[] excludedUploaderNames() {
            return exclude != null ? exclude.excludedUploaderNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Checksum.java`
#### Snippet
```java

        String[] excludedDistributions() {
            return exclude != null ? exclude.excludedDistributions : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Checksum.java`
#### Snippet
```java

        String[] includedDistributions() {
            return include != null ? include.includedDistributions : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Sign.java`
#### Snippet
```java

        String[] includedDistributions() {
            return include != null ? include.includedDistributions : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Sign.java`
#### Snippet
```java

        String[] excludedDistributions() {
            return exclude != null ? exclude.excludedDistributions : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Deploy.java`
#### Snippet
```java

        String[] includedDeployerTypes() {
            return include != null ? include.includedDeployerTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Deploy.java`
#### Snippet
```java

        String[] excludedDeployerTypes() {
            return exclude != null ? exclude.excludedDeployerTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Deploy.java`
#### Snippet
```java

        String[] excludedDeployerNames() {
            return exclude != null ? exclude.excludedDeployerNames : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Deploy.java`
#### Snippet
```java

        String[] includedDeployerNames() {
            return include != null ? include.includedDeployerNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Package.java`
#### Snippet
```java

        String[] excludedDistributions() {
            return exclude != null ? exclude.excludedDistributions : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Package.java`
#### Snippet
```java

        String[] includedDistributions() {
            return include != null ? include.includedDistributions : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Package.java`
#### Snippet
```java

        String[] excludedPackagers() {
            return exclude != null ? exclude.excludedPackagers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Package.java`
#### Snippet
```java

        String[] includedPackagers() {
            return include != null ? include.includedPackagers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Download.java`
#### Snippet
```java

        String[] excludedDownloaderTypes() {
            return exclude != null ? exclude.excludedDownloaderTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Download.java`
#### Snippet
```java

        String[] includedDownloaderNames() {
            return include != null ? include.includedDownloaderNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Download.java`
#### Snippet
```java

        String[] excludedDownloaderNames() {
            return exclude != null ? exclude.excludedDownloaderNames : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Download.java`
#### Snippet
```java

        String[] includedDownloaderTypes() {
            return include != null ? include.includedDownloaderTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Template.java`
#### Snippet
```java

        String packagerName() {
            return packagers != null ? packagers.packagerName : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Template.java`
#### Snippet
```java

        String announcerName() {
            return announcers != null ? announcers.announcerName : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Template.java`
#### Snippet
```java

        String distributionName() {
            return packagers != null ? packagers.distributionName : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Template.java`
#### Snippet
```java

        org.jreleaser.model.Distribution.DistributionType distributionType() {
            return packagers != null ? packagers.distributionType : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Upload.java`
#### Snippet
```java

        String[] excludedUploaderNames() {
            return exclude != null ? exclude.excludedUploaderNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Upload.java`
#### Snippet
```java

        String[] excludedUploaderTypes() {
            return exclude != null ? exclude.excludedUploaderTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Upload.java`
#### Snippet
```java

        String[] excludedDistributions() {
            return exclude != null ? exclude.excludedDistributions : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Upload.java`
#### Snippet
```java

        String[] includedDistributions() {
            return include != null ? include.includedDistributions : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Upload.java`
#### Snippet
```java

        String[] includedUploaderNames() {
            return include != null ? include.includedUploaderNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Upload.java`
#### Snippet
```java

        String[] includedUploaderTypes() {
            return include != null ? include.includedUploaderTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/JsonSchema.java`
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
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/JsonSchema.java`
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
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/JsonSchema.java`
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
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Prepare.java`
#### Snippet
```java

        String[] includedDistributions() {
            return include != null ? include.includedDistributions : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Prepare.java`
#### Snippet
```java

        String[] excludedPackagers() {
            return exclude != null ? exclude.excludedPackagers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Prepare.java`
#### Snippet
```java

        String[] includedPackagers() {
            return include != null ? include.includedPackagers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Prepare.java`
#### Snippet
```java

        String[] excludedDistributions() {
            return exclude != null ? exclude.excludedDistributions : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Publish.java`
#### Snippet
```java

        String[] excludedPackagers() {
            return exclude != null ? exclude.excludedPackagers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Publish.java`
#### Snippet
```java

        String[] includedDistributions() {
            return include != null ? include.includedDistributions : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Publish.java`
#### Snippet
```java

        String[] includedPackagers() {
            return include != null ? include.includedPackagers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Publish.java`
#### Snippet
```java

        String[] excludedDistributions() {
            return exclude != null ? exclude.excludedDistributions : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Announce.java`
#### Snippet
```java

        String[] includedAnnouncers() {
            return include != null ? include.includedAnnouncers : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Announce.java`
#### Snippet
```java

        String[] excludedAnnouncers() {
            return exclude != null ? exclude.excludedAnnouncers : null;
        }
    }
```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] excludedDeployerNames() {
            return exclude != null ? exclude.excludedDeployerNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] excludedUploaderTypes() {
            return exclude != null ? exclude.excludedUploaderTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] excludedDistributions() {
            return exclude != null ? exclude.excludedDistributions : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] includedUploaderTypes() {
            return include != null ? include.includedUploaderTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] includedDeployerTypes() {
            return include != null ? include.includedDeployerTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] excludedUploaderNames() {
            return exclude != null ? exclude.excludedUploaderNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] excludedDeployerTypes() {
            return exclude != null ? exclude.excludedDeployerTypes : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] includedUploaderNames() {
            return include != null ? include.includedUploaderNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] includedDeployerNames() {
            return include != null ? include.includedDeployerNames : null;
        }

```

### ReturnNull
Return of `null`
in `plugins/jreleaser/src/main/java/org/jreleaser/cli/Release.java`
#### Snippet
```java

        String[] includedDistributions() {
            return include != null ? include.includedDistributions : null;
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
in `plugins/jdks-maven-plugin/src/main/java/org/jreleaser/jdks/maven/plugin/SetupDiscoMojo.java`
#### Snippet
```java

        if (result.isEmpty()) {
            return null;
        }

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

## RegExpUnnecessaryNonCapturingGroup
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[1-9]\\d*)`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/ChronVer.java`
#### Snippet
```java
public class ChronVer implements Version<ChronVer> {
    private static final Pattern PATTERN = Pattern.compile("^([2-9][0-9]{3})\\.(0[1-9]|1[0-2])\\.(0[1-9]|[1-2][0-9]|3[0-1])(?:\\.((?:[1-9]\\d*)(?:(?:-[a-zA-Z0-9]+)+(?:\\.[1-9]\\d*)?)?))?$");
    private static final Pattern CHANGESET = Pattern.compile("^(?:((?:[1-9]\\d*))(?:-([a-zA-Z0-9-]+[a-zA-Z0-9]?)(?:\\.([1-9]\\d*))?)?)?$");

    private final int year;
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[1-9]\\d*)`
in `api/jreleaser-model-api/src/main/java/org/jreleaser/version/ChronVer.java`
#### Snippet
```java
 */
public class ChronVer implements Version<ChronVer> {
    private static final Pattern PATTERN = Pattern.compile("^([2-9][0-9]{3})\\.(0[1-9]|1[0-2])\\.(0[1-9]|[1-2][0-9]|3[0-1])(?:\\.((?:[1-9]\\d*)(?:(?:-[a-zA-Z0-9]+)+(?:\\.[1-9]\\d*)?)?))?$");
    private static final Pattern CHANGESET = Pattern.compile("^(?:((?:[1-9]\\d*))(?:-([a-zA-Z0-9-]+[a-zA-Z0-9]?)(?:\\.([1-9]\\d*))?)?)?$");

```

## EqualsWhichDoesntCheckParameterClass
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

