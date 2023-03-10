# palantir-java-format 
 
# Bad smells
I found 434 bad smells with 21 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 146 | false |
| AssignmentToMethodParameter | 45 | false |
| OptionalUsedAsFieldOrParameterType | 36 | false |
| BoundedWildcard | 33 | false |
| RedundantFieldInitialization | 21 | false |
| DataFlowIssue | 16 | false |
| UtilityClassWithoutPrivateConstructor | 10 | true |
| OptionalGetWithoutIsPresent | 10 | false |
| ReturnNull | 9 | false |
| SystemOutErr | 8 | false |
| SimplifyOptionalCallChains | 7 | false |
| UnstableTypeUsedInSignature | 7 | false |
| SizeReplaceableByIsEmpty | 6 | true |
| ConstantValue | 6 | false |
| OptionalContainsCollection | 5 | false |
| UnnecessarySemicolon | 4 | false |
| AbstractClassNeverImplemented | 4 | false |
| DynamicRegexReplaceableByCompiledPattern | 4 | false |
| NestedAssignment | 4 | false |
| CodeBlock2Expr | 4 | true |
| IOResource | 3 | false |
| StaticInitializerReferencesSubClass | 3 | false |
| RegExpRedundantEscape | 3 | false |
| ReadWriteStringCanBeUsed | 3 | false |
| ClassNameSameAsAncestorName | 3 | false |
| UnusedAssignment | 3 | false |
| StringConcatenationInsideStringBufferAppend | 3 | false |
| OptionalIsPresent | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| CommentedOutCode | 2 | false |
| NonShortCircuitBoolean | 2 | false |
| AssignmentToForLoopParameter | 2 | false |
| RedundantSuppression | 2 | false |
| UnnecessaryFullyQualifiedName | 2 | false |
| FieldMayBeStatic | 1 | false |
| StaticCallOnSubclass | 1 | false |
| Convert2MethodRef | 1 | false |
| JavaReflectionMemberAccess | 1 | false |
| StaticPseudoFunctionalStyleMethod | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| UnnecessaryBoxing | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| UnnecessaryContinue | 1 | false |
| RedundantImplements | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| NonFinalFieldOfException | 1 | false |
## RuleId[id=IOResource]
### IOResource
'JarFile' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/PalantirJavaFormatSettings.java`
#### Snippet
```java
                .flatMap(uri -> {
                    try {
                        JarFile jar = new JarFile(uri.getPath());
                        // Identify the implementation jar by the service it produces.
                        if (jar.getEntry("META-INF/services/" + FormatterService.class.getName()) != null) {
```

### IOResource
'JavacFileManager' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/Formatter.java`
#### Snippet
```java
        Options.instance(context).put("--enable-preview", "true");
        JCCompilationUnit unit;
        JavacFileManager fileManager = new JavacFileManager(context, true, UTF_8);
        try {
            fileManager.setLocation(StandardLocation.PLATFORM_CLASS_PATH, ImmutableList.of());
```

### IOResource
'JavacFileManager' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
        Context context = new Context();
        Options.instance(context).put("--enable-preview", "true");
        new JavacFileManager(context, true, UTF_8);
        DiagnosticCollector<JavaFileObject> diagnosticCollector = new DiagnosticCollector<>();
        context.put(DiagnosticListener.class, diagnosticCollector);
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java
            List<Doc> split,
            Obs.ExplorationNode explorationNode) {
        float breakWidth = optBreakDoc.isPresent() ? optBreakDoc.get().getWidth() : 0.0F;
        float splitWidth = getWidth(split);

```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
                        : ZERO);
        {
            if (modifiers.isPresent()) {
                visitAndBreakModifiers(modifiers.get(), annotationsDirection, Optional.of(verticalAnnotationBreak));
            }
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `stepName` may be 'static'
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/spotless/PalantirJavaFormatStep.java`
#### Snippet
```java
        // Kept for state serialization purposes.
        @SuppressWarnings("unused")
        private final String stepName = NAME;

        // Kept for state serialization purposes.
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Newlines` has only 'static' members, and lacks a 'private' constructor
in `palantir-java-format/src/main/java/com/palantir/javaformat/Newlines.java`
#### Snippet
```java

/** Platform-independent newline handling. */
public class Newlines {

    /** Returns the number of line breaks in the input. */
```

### UtilityClassWithoutPrivateConstructor
Class `JavacTokens` has only 'static' members, and lacks a 'private' constructor
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavacTokens.java`
#### Snippet
```java

/** A wrapper around javac's lexer. */
class JavacTokens {

    /** The lexer eats terminal comments, so feed it one we don't care about. */
```

### UtilityClassWithoutPrivateConstructor
Class `DebugRenderer` has only 'static' members, and lacks a 'private' constructor
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/DebugRenderer.java`
#### Snippet
```java
import java.util.stream.Collectors;

public class DebugRenderer {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static Path publicDir = Paths.get("../debugger/public");
```

### UtilityClassWithoutPrivateConstructor
Class `CommandLineOptionsParser` has only 'static' members, and lacks a 'private' constructor
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptionsParser.java`
#### Snippet
```java

/** A parser for {@link CommandLineOptions}. */
final class CommandLineOptionsParser {

    private static final Splitter COMMA_SPLITTER = Splitter.on(',');
```

### UtilityClassWithoutPrivateConstructor
Class `DimensionHelpers` has only 'static' members, and lacks a 'private' constructor
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/DimensionHelpers.java`
#### Snippet
```java
 * <p>For example, {@code int [] a;} cannot be distinguished from {@code int [] a [];} in the AST.
 */
class DimensionHelpers {

    /** The array dimension specifiers (including any type annotations) associated with a type. */
```

### UtilityClassWithoutPrivateConstructor
Class `FormatDiff` has only 'static' members, and lacks a 'private' constructor
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
import java.util.stream.Stream;

final class FormatDiff {
    // each section in the git diff output starts like this
    private static final Pattern SEPARATOR = Pattern.compile("diff --git");
```

### UtilityClassWithoutPrivateConstructor
Class `ModifierOrderer` has only 'static' members, and lacks a 'private' constructor
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ModifierOrderer.java`
#### Snippet
```java

/** Fixes sequences of modifiers to be in JLS order. */
final class ModifierOrderer {

    /** Reorders all modifiers in the given text to be in JLS order. */
```

### UtilityClassWithoutPrivateConstructor
Class `RemoveUnusedImports` has only 'static' members, and lacks a 'private' constructor
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/RemoveUnusedImports.java`
#### Snippet
```java
 * in javadoc are replaced with fully qualified names.
 */
public class RemoveUnusedImports {

    // Visits an AST, recording all simple names that could refer to imported
```

### UtilityClassWithoutPrivateConstructor
Class `FormatterCommandRunner` has only 'static' members, and lacks a 'private' constructor
in `palantir-java-format-jdk-bootstrap/src/main/java/com/palantir/javaformat/bootstrap/FormatterCommandRunner.java`
#### Snippet
```java
import java.util.regex.Pattern;

final class FormatterCommandRunner {
    private static final Pattern SYNTAX_ERROR_PATTERN = Pattern.compile(":\\d+:\\d+:\\serror:\\s");

```

### UtilityClassWithoutPrivateConstructor
Class `Trees` has only 'static' members, and lacks a 'private' constructor
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/Trees.java`
#### Snippet
```java

/** Utilities for working with {@link Tree}s. */
class Trees {
    /** Returns the length of the source for the node. */
    static int getLength(Tree tree, TreePath path) {
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `makeKToIJ()` declared in class 'com.palantir.javaformat.InputOutput' but referenced via subclass 'com.palantir.javaformat.java.JavaOutput'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java
    public ImmutableList<Replacement> getFormatReplacements(RangeSet<Integer> iRangeSet0) {
        ImmutableList.Builder<Replacement> result = ImmutableList.builder();
        Map<Integer, Range<Integer>> kToJ = JavaOutput.makeKToIJ(this);

        // Expand the token ranges to align with re-formattable boundaries.
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `convert` may produce `NullPointerException`
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/PalantirJavaFormatConfigurable.java`
#### Snippet
```java
        PalantirJavaFormatSettings settings = PalantirJavaFormatSettings.getInstance(project);
        settings.setEnabled(enable.isSelected() ? EnabledState.ENABLED : getDisabledState());
        settings.setStyle(((UiFormatterStyle) styleComboBox.getSelectedItem()).convert());
    }

```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/PalantirJavaFormatConfigurable.java`
#### Snippet
```java
        PalantirJavaFormatSettings settings = PalantirJavaFormatSettings.getInstance(project);
        return enable.isSelected() != settings.isEnabled()
                || !styleComboBox.getSelectedItem().equals(UiFormatterStyle.convert(settings.getStyle()));
    }

```

### DataFlowIssue
Method invocation `lowerEndpoint` may produce `NullPointerException`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java
            return EMPTY_RANGE;
        }
        loTok = partialFormatRanges().rangeContaining(loTok).lowerEndpoint();
        hiTok = partialFormatRanges().rangeContaining(hiTok).upperEndpoint();
        return Range.closedOpen(loTok, hiTok + 1);
```

### DataFlowIssue
Method invocation `upperEndpoint` may produce `NullPointerException`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java
        }
        loTok = partialFormatRanges().rangeContaining(loTok).lowerEndpoint();
        hiTok = partialFormatRanges().rangeContaining(hiTok).upperEndpoint();
        return Range.closedOpen(loTok, hiTok + 1);
    }
```

### DataFlowIssue
Method invocation `wanted` may produce `NullPointerException`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java
             */
            BlankLineWanted wanted = inputMetadata.blankLines().getOrDefault(lastK, BlankLineWanted.NO);
            if (isComment(text) ? sawNewlines : wanted.wanted(state).orElse(sawNewlines)) {
                ++newlinesPending;
            }
```

### DataFlowIssue
Argument `PluginManager.getPlugin(PluginId.getId(PLUGIN_ID))` might be null
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/PalantirCodeStyleManager.java`
#### Snippet
```java
    private static final String PLUGIN_ID = "palantir-java-format";
    static final IdeaPluginDescriptor PLUGIN = Preconditions.checkNotNull(
            PluginManager.getPlugin(PluginId.getId(PLUGIN_ID)), "Couldn't find our own plugin: %s", PLUGIN_ID);

    private final FormatterProvider formatterProvider = new FormatterProvider();
```

### DataFlowIssue
Method invocation `getTok` may produce `NullPointerException`
in `palantir-java-format/src/main/java/com/palantir/javaformat/OpsBuilder.java`
#### Snippet
```java
    public int actualSize(int position, int length) {
        Input.Token startToken = input.getPositionTokenMap().get(position);
        int start = startToken.getTok().getPosition();
        for (Input.Tok tok : startToken.getToksBefore()) {
            if (tok.isComment()) {
```

### DataFlowIssue
Method invocation `getTok` may produce `NullPointerException`
in `palantir-java-format/src/main/java/com/palantir/javaformat/OpsBuilder.java`
#### Snippet
```java
        }
        Input.Token endToken = input.getPositionTokenMap().get(position + length - 1);
        int end = endToken.getTok().getPosition() + endToken.getTok().length();
        for (Input.Tok tok : endToken.getToksAfter()) {
            if (tok.isComment()) {
```

### DataFlowIssue
Method invocation `getTok` may produce `NullPointerException`
in `palantir-java-format/src/main/java/com/palantir/javaformat/OpsBuilder.java`
#### Snippet
```java
    public Integer actualStartColumn(int position) {
        Input.Token startToken = input.getPositionTokenMap().get(position);
        int start = startToken.getTok().getPosition();
        int line0 = input.getLineNumber(start);
        for (Input.Tok tok : startToken.getToksBefore()) {
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/DocBuilder.java`
#### Snippet
```java
    void breakDoc(Break breakDoc) {
        appendLevel = stack.peekLast();
        appendLevel.add(breakDoc);
    }

```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/DocBuilder.java`
#### Snippet
```java
    public void close() {
        Level top = stack.removeLast();
        stack.peekLast().add(top);
    }

```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
                if (tokText.startsWith("//") && (originalTokText.endsWith("\n") || originalTokText.endsWith("\r"))) {
                    extraNewline = Newlines.getLineEnding(originalTokText);
                    tokText = tokText.substring(0, tokText.length() - extraNewline.length());
                    originalTokText = originalTokText.substring(0, originalTokText.length() - extraNewline.length());
                }
```

### DataFlowIssue
Unboxing of `inExpression.peekLast()` may produce `NullPointerException`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java

    private boolean inExpression() {
        return inExpression.peekLast();
    }

```

### DataFlowIssue
Unboxing of `inExpression.peekLast()` may produce `NullPointerException`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
    @Override
    public Void scan(Tree tree, Void unused) {
        inExpression.addLast(tree instanceof ExpressionTree || inExpression.peekLast());
        int previous = builder.depth();
        try {
```

### DataFlowIssue
Argument `endToken` might be null
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
        Input.Token startToken = positionTokenMap.get(startPosition);
        Input.Token endToken = positionTokenMap.get(endPosition);
        return lineNumberAt(endToken) - lineNumberAt(startToken) + 1;
    }

```

### DataFlowIssue
Argument `startToken` might be null
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
        Input.Token startToken = positionTokenMap.get(startPosition);
        Input.Token endToken = positionTokenMap.get(endPosition);
        return lineNumberAt(endToken) - lineNumberAt(startToken) + 1;
    }

```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/javadoc/Token.java`
#### Snippet
```java
         */
        LITERAL,
        ;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `palantir-java-format/src/main/java/com/palantir/javaformat/LastLevelBreakability.java`
#### Snippet
```java
     */
    ACCEPT_INLINE_CHAIN_IF_SIMPLE_OTHERWISE_CHECK_INNER,
    ;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/javadoc/JavadocWriter.java`
#### Snippet
```java
        NEWLINE,
        BLANK_LINE,
        ;
    }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Token.java`
#### Snippet
```java
    public enum RealOrImaginary {
        REAL,
        IMAGINARY;
    }

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptionsParser.java`
#### Snippet
```java
            if (idx >= 0) {
                flag = option.substring(0, idx);
                value = option.substring(idx + 1, option.length());
            } else {
                flag = option;
```

### StringOperationCanBeSimplified
Inefficient conversion from ByteArrayOutputStream
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ByteStreams.copy(process.getInputStream(), baos);
        return new String(baos.toByteArray(), UTF_8).trim();
    }

```

## RuleId[id=StaticInitializerReferencesSubClass]
### StaticInitializerReferencesSubClass
Referencing subclass SimpleBlankLine from superclass BlankLineWanted initializer might lead to class loading deadlock
in `palantir-java-format/src/main/java/com/palantir/javaformat/OpsBuilder.java`
#### Snippet
```java

        /** Never emit a blank line. */
        public static final BlankLineWanted NO = new SimpleBlankLine(Optional.of(false));

        /**
```

### StaticInitializerReferencesSubClass
Referencing subclass SimpleBlankLine from superclass BlankLineWanted initializer might lead to class loading deadlock
in `palantir-java-format/src/main/java/com/palantir/javaformat/OpsBuilder.java`
#### Snippet
```java
         * Overrides conditional blank lines.
         */
        public static final BlankLineWanted PRESERVE = new SimpleBlankLine(/* wanted= */ Optional.empty());

        /** Is the blank line wanted? */
```

### StaticInitializerReferencesSubClass
Referencing subclass SimpleBlankLine from superclass BlankLineWanted initializer might lead to class loading deadlock
in `palantir-java-format/src/main/java/com/palantir/javaformat/OpsBuilder.java`
#### Snippet
```java

        /** Always emit a blank line. */
        public static final BlankLineWanted YES = new SimpleBlankLine(Optional.of(true));

        /** Never emit a blank line. */
```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `List`
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/PalantirJavaFormatSettings.java`
#### Snippet
```java
     * be used instead of the bundled version.
     */
    Optional<List<URI>> getImplementationClassPath() {
        return state.implementationClassPath;
    }
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/PalantirJavaFormatSettings.java`
#### Snippet
```java

        private EnabledState enabled = EnabledState.UNKNOWN;
        private Optional<List<URI>> implementationClassPath = Optional.empty();

        public JavaFormatterOptions.Style style = JavaFormatterOptions.Style.PALANTIR;
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/FormatterProvider.java`
#### Snippet
```java

    private static List<Path> getImplementationUrls(
            Optional<List<URI>> implementationClassPath, boolean useBundledImplementation) {
        if (useBundledImplementation) {
            log.debug("Using palantir-java-format implementation bundled with plugin");
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/FormatterProvider.java`
#### Snippet
```java
                Project project,
                int jdkMajorVersion,
                Optional<List<URI>> implementationClassPath,
                boolean useBundledImplementation) {
            this.project = project;
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/FormatterProvider.java`
#### Snippet
```java
        private final Project project;
        private final int jdkMajorVersion;
        private final Optional<List<URI>> implementationClassPath;
        private final boolean useBundledImplementation;

```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java
                // should get indented from the beginning of the first line.
                // This is to handle cases like:
                // String foo = "first component"
                //     + "rest";
                width += textStartColumn - firstLineStartColumn;
```

### CommentedOutCode
Commented out code (6 lines)
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
        //
        // But if there's no 'bar()' to worry about the alignment of we prefer:
        //
        // myField.foo();
        //
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `gradle-palantir-java-format/src/main/groovy/com/palantir/javaformat/gradle/PalantirJavaFormatIdeaPlugin.java`
#### Snippet
```java
            createOrUpdateIdeaXmlFile(
                    project.file(".idea/externalDependencies.xml"),
                    node -> ConfigureJavaFormatterXml.configureExternalDependencies(node));
            updateIdeaXmlFileIfExists(project.file(project.getName() + ".ipr"), node -> {
                ConfigureJavaFormatterXml.configureJavaFormat(node, uris);
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java

    private static boolean isParamComment(Tok tok) {
        return tok.isSlashStarComment() && tok.getText().matches("\\/\\*[A-Za-z0-9\\s_\\-]+=\\s*\\*\\/");
    }

```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java

    private static boolean isParamComment(Tok tok) {
        return tok.isSlashStarComment() && tok.getText().matches("\\/\\*[A-Za-z0-9\\s_\\-]+=\\s*\\*\\/");
    }

```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
    }

    private static final Pattern FORMAT_SPECIFIER = Pattern.compile("%|\\{[0-9]\\}");

    private boolean isStringConcat(ExpressionTree first) {
```

## RuleId[id=JavaReflectionMemberAccess]
### JavaReflectionMemberAccess
Cannot resolve field 'reader'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavacTokens.java`
#### Snippet
```java
            Object instance;
            try {
                instance = JavaTokenizer.class.getDeclaredField("reader").get(this);
            } catch (ReflectiveOperationException e) {
                instance = this;
```

## RuleId[id=StaticPseudoFunctionalStyleMethod]
### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/FormatterExceptions.java`
#### Snippet
```java

    static FormatterException fromJavacDiagnostics(Iterable<Diagnostic<? extends JavaFileObject>> diagnostics) {
        return new FormatterException(Iterables.transform(diagnostics, FormatterExceptions::toFormatterDiagnostic));
    }

```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `Level` on 'this' is unnecessary in this context
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java
        SplitsBreaks prefixSplitsBreaks = splitByBreaks(leadingDocs);

        boolean isSimpleInlining = isSimpleInliningSoFar && Level.this.openOp.complexity() == Complexity.SIMPLE;

        State state1 = tryToLayOutLevelOnOneLine(commentsHelper, maxWidth, state, prefixSplitsBreaks, explorationNode);
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`lineBuilder.length() > 0` can be replaced with '!lineBuilder.isEmpty()'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java
                        while (newlinesPending > 0) {
                            // drop leading blank lines
                            if (!mutableLines.isEmpty() || lineBuilder.length() > 0) {
                                mutableLines.add(lineBuilder.toString());
                            }
```

### SizeReplaceableByIsEmpty
`piece.length() > 0` can be replaced with '!piece.isEmpty()'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java
                start = idx;
            }
            if (piece.length() > 0) {
                result.add(piece.toString());
                piece = new StringBuilder();
```

### SizeReplaceableByIsEmpty
`piece.length() > 0` can be replaced with '!piece.isEmpty()'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java
            }
        }
        if (piece.length() > 0) {
            result.add(piece.toString());
        }
```

### SizeReplaceableByIsEmpty
`accumulated.length() == 0` can be replaced with 'accumulated.isEmpty()'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/javadoc/JavadocLexer.java`
#### Snippet
```java
             */

            if (accumulated.length() == 0) {
                output.add(tokens.peek());
                tokens.next();
```

### SizeReplaceableByIsEmpty
`seenWhitespace.length() > 0` can be replaced with '!seenWhitespace.isEmpty()'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/javadoc/JavadocLexer.java`
#### Snippet
```java
            accumulated.setLength(0);

            if (seenWhitespace.length() > 0) {
                output.add(new Token(WHITESPACE, seenWhitespace.toString()));
            }
```

### SizeReplaceableByIsEmpty
`docs.size() > 0` can be replaced with '!docs.isEmpty()'
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java
            boolean isSimpleInliningSoFar) {
        Preconditions.checkState(
                docs.size() > 0 && getLast(docs) instanceof Level,
                "Level with break behaviour inlineSuffix must end with a level as its last doc");
        Level lastLevel = (Level) getLast(docs);
```

## RuleId[id=ReadWriteStringCanBeUsed]
### ReadWriteStringCanBeUsed
Can be replaced with 'Files.readString()'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/Main.java`
#### Snippet
```java
            String input;
            try {
                input = new String(Files.readAllBytes(path), UTF_8);
                inputs.put(path, input);
                results.put(path, executorService.submit(new FormatFileCallable(parameters, input, options)));
```

### ReadWriteStringCanBeUsed
Can be replaced with 'Files.readString()'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptionsParser.java`
#### Snippet
```java
                Path path = Paths.get(arg.substring(1));
                try {
                    String sequence = new String(Files.readAllBytes(path), UTF_8);
                    expandParamsFiles(ARG_SPLITTER.split(sequence), expanded);
                } catch (IOException e) {
```

### ReadWriteStringCanBeUsed
Can be replaced with 'Files.readString()'
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
        String input;
        try {
            input = new String(Files.readAllBytes(diff.path), UTF_8);
        } catch (IOException e) {
            System.err.println("Failed to read file " + diff.path);
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasUppercase |= Character.isUpperCase(c)`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/TypeNameClassifier.java`
#### Snippet
```java
                    first = false;
                }
                hasUppercase |= Character.isUpperCase(c);
                hasLowercase |= Character.isLowerCase(c);
            }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasLowercase |= Character.isLowerCase(c)`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/TypeNameClassifier.java`
#### Snippet
```java
                }
                hasUppercase |= Character.isUpperCase(c);
                hasLowercase |= Character.isLowerCase(c);
            }
            if (firstUppercase) {
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java
                    case '\r':
                        if (i + 1 < text.length() && text.charAt(i + 1) == '\n') {
                            i++;
                        }
                        // falls through
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `idx`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java
                    int length;
                    while ((length = hasEscapedNewlineAt(text, idx)) != -1) {
                        idx += length;
                    }
                } else {
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `BreakBehaviour` has no concrete subclass
in `palantir-java-format/src/main/java/com/palantir/javaformat/BreakBehaviour.java`
#### Snippet
```java
@Immutable
@JsonSerialize(using = BreakBehaviour.Json.class)
public abstract class BreakBehaviour {
    public interface Cases<R> {

```

### AbstractClassNeverImplemented
Abstract class `OpenOp` has no concrete subclass
in `palantir-java-format/src/main/java/com/palantir/javaformat/OpenOp.java`
#### Snippet
```java
@Value.Immutable
@JsonSerialize(as = ImmutableOpenOp.class)
public abstract class OpenOp extends HasUniqueId implements Op {
    /** The extra indent inside this level. */
    public abstract Indent plusIndent();
```

### AbstractClassNeverImplemented
Abstract class `Break` has no concrete subclass
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Break.java`
#### Snippet
```java
@Immutable
@Value.Immutable
public abstract class Break extends Doc implements Op {
    public abstract FillMode fillMode();

```

### AbstractClassNeverImplemented
Abstract class `State` has no concrete subclass
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/State.java`
#### Snippet
```java
@JsonSerialize(as = ImmutableState.class)
@Immutable
public abstract class State {
    /** Last indent that was actually taken. */
    public abstract int lastIndent();
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Doc`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/CountWidthUntilBreakVisitor.java`
#### Snippet
```java
     * returns {@link OptionalInt#empty}.
     */
    private static OptionalInt getFirstNonEmptyLevel(List<Doc> docs) {
        int idx = 0;
        for (Doc doc : docs) {
```

### BoundedWildcard
Can generalize to `? extends TextRange`
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/PalantirCodeStyleManager.java`
#### Snippet
```java
    }

    private void performReplacements(final Document document, final Map<TextRange, String> replacements) {
        if (replacements.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends Op`
in `palantir-java-format/src/main/java/com/palantir/javaformat/OpsBuilder.java`
#### Snippet
```java

    /** Add a list of {@link Op}s. */
    public void addAll(List<Op> ops) {
        for (Op op : ops) {
            add(op);
```

### BoundedWildcard
Can generalize to `? super String`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptionsParser.java`
#### Snippet
```java
     * file and appending whitespace-delimited options to {@code arguments}.
     */
    private static void expandParamsFiles(Iterable<String> args, List<String> expanded) {
        for (String arg : args) {
            if (arg.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends Import`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java

    // Produces the sorted output based on the imports we have scanned.
    private String reorderedImportsString(ImmutableSortedSet<Import> imports) {
        Preconditions.checkArgument(!imports.isEmpty(), "imports");

```

### BoundedWildcard
Can generalize to `? extends Tree`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java
     */
    private static ImmutableList<String> stringComponents(
            String input, JCTree.JCCompilationUnit unit, List<Tree> flat) {
        ImmutableList.Builder<String> result = ImmutableList.builder();
        StringBuilder piece = new StringBuilder();
```

### BoundedWildcard
Can generalize to `? extends Diagnostic`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/FormatterExceptions.java`
#### Snippet
```java
final class FormatterExceptions {

    static FormatterException fromJavacDiagnostics(Iterable<Diagnostic<? extends JavaFileObject>> diagnostics) {
        return new FormatterException(Iterables.transform(diagnostics, FormatterExceptions::toFormatterDiagnostic));
    }
```

### BoundedWildcard
Can generalize to `? extends Op`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/DocBuilder.java`
#### Snippet
```java
     * @return the {@link OpsBuilder}
     */
    public DocBuilder withOps(List<Op> ops) {
        for (Op op : ops) {
            op.add(this); // These operations call the operations below to build the doc.
```

### BoundedWildcard
Can generalize to `? super List`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/DimensionHelpers.java`
#### Snippet
```java
     * <p>Given {@code int @A @B [][] @C []}, adds {@code [[@A, @B], [@C]]} to dims and returns {@code int}.
     */
    private static Tree extractDims(Deque<List<AnnotationTree>> dims, Tree node) {
        switch (node.getKind()) {
            case ARRAY_TYPE:
```

### BoundedWildcard
Can generalize to `? extends FormatterService`
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/spotless/PalantirJavaFormatStep.java`
#### Snippet
```java
         *     up-to-dateness purposes.
         */
        State(Iterable<File> jars, Supplier<FormatterService> memoizedFormatter) throws IOException {
            this.jarsSignature = FileSignature.signAsSet(jars);
            this.memoizedFormatter = memoizedFormatter;
```

### BoundedWildcard
Can generalize to `? super ExplorationNode`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Obs.java`
#### Snippet
```java
        @Override
        public Exploration explore(
                String humanDescription, State incomingState, Function<ExplorationNode, State> explorationFunc) {
            ExplorationNodeImpl explorationNode =
                    new ExplorationNodeImpl(this, humanDescription, sink, startColumn, Optional.of(incomingState));
```

### BoundedWildcard
Can generalize to `? extends State`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Obs.java`
#### Snippet
```java
        @Override
        public Exploration explore(
                String humanDescription, State incomingState, Function<ExplorationNode, State> explorationFunc) {
            ExplorationNodeImpl explorationNode =
                    new ExplorationNodeImpl(this, humanDescription, sink, startColumn, Optional.of(incomingState));
```

### BoundedWildcard
Can generalize to `? super ExplorationNode`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Obs.java`
#### Snippet
```java
                String humanDescription,
                State incomingState,
                Function<ExplorationNode, Optional<State>> explorationFunc) {
            ExplorationNodeImpl explorationNode =
                    new ExplorationNodeImpl(this, humanDescription, sink, startColumn, Optional.of(incomingState));
```

### BoundedWildcard
Can generalize to `? extends State`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Obs.java`
#### Snippet
```java
        }

        void recordNewState(Optional<State> maybeNewState) {
            maybeNewState.ifPresent(
                    newState -> parentLevel.ifPresent(parent -> finishExplorationNode.finishNode(parent, newState)));
```

### BoundedWildcard
Can generalize to `? super Token`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/javadoc/JavadocLexer.java`
#### Snippet
```java
    }

    private static void deindentPreCodeBlock(ImmutableList.Builder<Token> output, PeekingIterator<Token> tokens) {
        Deque<Token> saved = new ArrayDeque<>();
        output.add(new Token(LITERAL, tokens.next().getValue().trim()));
```

### BoundedWildcard
Can generalize to `? extends Doc`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java
     * @return the width, or {@code Float.POSITIVE_INFINITY} if any {@link Doc} must be broken
     */
    static float getWidth(Iterable<Doc> docs) {
        float width = 0.0F;
        for (Doc doc : docs) {
```

### BoundedWildcard
Can generalize to `? extends Doc`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java
            CommentsHelper commentsHelper,
            int maxWidth,
            List<Doc> docs,
            State state,
            Obs.ExplorationNode explorationNode) {
```

### BoundedWildcard
Can generalize to `? extends Doc`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java
     *     {@code maxWidth}
     */
    private Optional<Integer> tryToFitOnOneLine(int maxWidth, State state, Iterable<Doc> docs) {
        int column = state.column();
        int columnBeforeLastBreak = 0; // Not activated by default
```

### BoundedWildcard
Can generalize to `? extends Break`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java
            int maxWidth,
            State state,
            Optional<Break> optBreakDoc,
            List<Doc> split,
            Obs.ExplorationNode explorationNode) {
```

### BoundedWildcard
Can generalize to `? super Node`
in `gradle-palantir-java-format/src/main/groovy/com/palantir/javaformat/gradle/PalantirJavaFormatIdeaPlugin.java`
#### Snippet
```java
    }

    private static void updateIdeaXmlFile(File configurationFile, Consumer<Node> configure, boolean createIfAbsent) {
        Node rootNode;
        if (configurationFile.isFile()) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/FormatterProvider.java`
#### Snippet
```java

    private static List<Path> getImplementationUrls(
            Optional<List<URI>> implementationClassPath, boolean useBundledImplementation) {
        if (useBundledImplementation) {
            log.debug("Using palantir-java-format implementation bundled with plugin");
```

### BoundedWildcard
Can generalize to `? extends Path`
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/FormatterProvider.java`
#### Snippet
```java
    }

    private static URL[] toUrlsUnchecked(List<Path> paths) {
        return paths.stream()
                .map(path -> {
```

### BoundedWildcard
Can generalize to `? extends VariableTree`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
    }

    protected void visitFormals(Optional<VariableTree> receiver, List<? extends VariableTree> parameters) {
        if (!receiver.isPresent() && parameters.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? super ExpressionTree`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
    /** Accumulate the operands and operators. */
    private static void walkInfix(
            int precedence, ExpressionTree expression, List<ExpressionTree> operands, List<String> operators) {
        if (expression instanceof BinaryTree) {
            BinaryTree binaryTree = (BinaryTree) expression;
```

### BoundedWildcard
Can generalize to `? super String`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
    /** Accumulate the operands and operators. */
    private static void walkInfix(
            int precedence, ExpressionTree expression, List<ExpressionTree> operands, List<String> operators) {
        if (expression instanceof BinaryTree) {
            BinaryTree binaryTree = (BinaryTree) expression;
```

### BoundedWildcard
Can generalize to `? extends VariableTree`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
    }

    private void declareMany(List<VariableTree> fragments, Direction annotationDirection) {
        builder.open(ZERO);

```

### BoundedWildcard
Can generalize to `? extends ExpressionTree`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
     *     {@code int @A [] @B @C []}
     */
    private void maybeAddDims(Deque<ExpressionTree> dimExpressions, Deque<List<? extends AnnotationTree>> annotations) {
        boolean lastWasAnnotation = false;
        while (builder.peekToken().isPresent()) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
     *     {@code int @A [] @B @C []}
     */
    private void maybeAddDims(Deque<ExpressionTree> dimExpressions, Deque<List<? extends AnnotationTree>> annotations) {
        boolean lastWasAnnotation = false;
        while (builder.peekToken().isPresent()) {
```

### BoundedWildcard
Can generalize to `? extends ExpressionTree`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java

    /** Returns the simple names of expressions in a "." chain. */
    private List<String> simpleNames(Deque<ExpressionTree> stack) {
        ImmutableList.Builder<String> simpleNames = ImmutableList.builder();
        OUTER:
```

### BoundedWildcard
Can generalize to `? extends List`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java

    /** Returns true if {@code atLeastM} of the expressions in the given column are the same kind. */
    private static boolean expressionsAreParallel(List<List<ExpressionTree>> rows, int column, int atLeastM) {
        Multiset<Tree.Kind> nodeTypes = HashMultiset.create();
        for (List<? extends ExpressionTree> row : rows) {
```

### BoundedWildcard
Can generalize to `? extends ExpressionTree`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java

    /** Lays out one or more array indices. Does not output the expression for the array itself. */
    private void formatArrayIndices(Deque<ExpressionTree> indices) {
        if (indices.isEmpty()) {
            return;
```

### BoundedWildcard
Can generalize to `? extends T`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
    }

    private static <T> Stream<Long> indexes(Stream<T> stream, Predicate<T> predicate) {
        return Streams.mapWithIndex(stream, (x, i) -> predicate.apply(x) ? i : -1)
                .filter(x -> x != -1);
```

### BoundedWildcard
Can generalize to `? super T`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
    }

    private static <T> Stream<Long> indexes(Stream<T> stream, Predicate<T> predicate) {
        return Streams.mapWithIndex(stream, (x, i) -> predicate.apply(x) ? i : -1)
                .filter(x -> x != -1);
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/spotless/PalantirJavaFormatStep.java`
#### Snippet
```java

        @SuppressWarnings("NullableProblems")
        FormatterFunc createFormat() {
            return memoizedFormatter.get()::formatSourceReflowStringsAndFixImports;
        }
```

### RedundantSuppression
Redundant suppression
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java

    @SuppressWarnings("ResultOfMethodCallIgnored")
    private static ImmutableSet<Range<Integer>> rangesAfterAppliedReplacements(
            TreeRangeMap<Integer, String> replacements) {
        ImmutableSet.Builder<Range<Integer>> outputRanges = ImmutableSet.builder();
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/PalantirJavaFormatSettings.java`
#### Snippet
```java
            if (enabledStr == null) {
                enabled = EnabledState.UNKNOWN;
            } else if (Boolean.valueOf(enabledStr)) {
                enabled = EnabledState.ENABLED;
            } else {
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'implementationClassPath'
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/PalantirJavaFormatSettings.java`
#### Snippet
```java

        private EnabledState enabled = EnabledState.UNKNOWN;
        private Optional<List<URI>> implementationClassPath = Optional.empty();

        public JavaFormatterOptions.Style style = JavaFormatterOptions.Style.PALANTIR;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optTag'
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Break.java`
#### Snippet
```java
     * @return the new {@code Break}
     */
    public static Break make(FillMode fillMode, String flat, Indent plusIndent, Optional<BreakTag> optTag) {
        return builder()
                .fillMode(fillMode)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'wanted'
in `palantir-java-format/src/main/java/com/palantir/javaformat/OpsBuilder.java`
#### Snippet
```java
            private final Optional<Boolean> wanted;

            SimpleBlankLine(Optional<Boolean> wanted) {
                this.wanted = wanted;
            }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'wanted'
in `palantir-java-format/src/main/java/com/palantir/javaformat/OpsBuilder.java`
#### Snippet
```java

        private static final class SimpleBlankLine extends BlankLineWanted {
            private final Optional<Boolean> wanted;

            SimpleBlankLine(Optional<Boolean> wanted) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optionalTag'
in `palantir-java-format/src/main/java/com/palantir/javaformat/OpsBuilder.java`
#### Snippet
```java
     * @param optionalTag an optional tag for remembering whether the break was taken
     */
    public void breakOp(FillMode fillMode, String flat, Indent plusIndent, Optional<BreakTag> optionalTag) {
        add(Break.make(fillMode, flat, plusIndent, optionalTag));
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'breakAndIndentTrailingComment'
in `palantir-java-format/src/main/java/com/palantir/javaformat/OpsBuilder.java`
#### Snippet
```java
            Token.RealOrImaginary realOrImaginary,
            Indent plusIndentCommentsBefore,
            Optional<Indent> breakAndIndentTrailingComment) {
        ImmutableList<? extends Input.Token> tokens = input.getTokens();
        if (token.equals(peekToken().orElse(null))) { // Found the input token. Output it.
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'assumeFilename'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
        private boolean dryRun = false;
        private boolean setExitIfChanged = false;
        private Optional<String> assumeFilename = Optional.empty();
        private boolean reflowLongStrings = true;
        private boolean outputReplacements = false;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'assumeFilename'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
            boolean dryRun,
            boolean setExitIfChanged,
            Optional<String> assumeFilename,
            boolean reflowLongStrings,
            boolean outputReplacements) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'assumeFilename'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
    private final boolean dryRun;
    private final boolean setExitIfChanged;
    private final Optional<String> assumeFilename;
    private final boolean reflowLongStrings;
    private final boolean outputReplacements;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'breakAndIndentTrailingComment'
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Token.java`
#### Snippet
```java
            RealOrImaginary realOrImaginary,
            Indent plusIndentCommentsBefore,
            Optional<Indent> breakAndIndentTrailingComment) {
        return new Token(token, realOrImaginary, plusIndentCommentsBefore, breakAndIndentTrailingComment);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'breakAndIndentTrailingComment'
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Token.java`
#### Snippet
```java
            RealOrImaginary realOrImaginary,
            Indent plusIndentCommentsBefore,
            Optional<Indent> breakAndIndentTrailingComment) {
        this.token = token;
        this.realOrImaginary = realOrImaginary;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'breakAndIndentTrailingComment'
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Token.java`
#### Snippet
```java
    private final RealOrImaginary realOrImaginary;
    private final Indent plusIndentCommentsBefore;
    private final Optional<Indent> breakAndIndentTrailingComment;

    private Token(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'incomingState'
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Obs.java`
#### Snippet
```java
                Sink sink,
                int startColumn,
                Optional<State> incomingState) {
            this.parentLevel = Optional.ofNullable(parent).map(p -> p.level);
            this.sink = sink;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'parentLevel'
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Obs.java`
#### Snippet
```java
        private final Sink sink;
        private final FinishExplorationNode finishExplorationNode;
        private final Optional<Level> parentLevel;

        public ExplorationNodeImpl(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'maybeNewState'
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Obs.java`
#### Snippet
```java
        }

        void recordNewState(Optional<State> maybeNewState) {
            maybeNewState.ifPresent(
                    newState -> parentLevel.ifPresent(parent -> finishExplorationNode.finishNode(parent, newState)));
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'parentLevelId'
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Obs.java`
#### Snippet
```java
        FinishExplorationNode startExplorationNode(
                int exporationId,
                OptionalInt parentLevelId,
                String humanDescription,
                int startColumn,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'incomingState'
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Obs.java`
#### Snippet
```java
                String humanDescription,
                int startColumn,
                Optional<State> incomingState);

        /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optBreakDoc'
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java
            int maxWidth,
            State state,
            Optional<Break> optBreakDoc,
            List<Doc> split,
            Obs.ExplorationNode explorationNode) {
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'implementationClassPath'
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/FormatterProvider.java`
#### Snippet
```java

    private static List<Path> getImplementationUrls(
            Optional<List<URI>> implementationClassPath, boolean useBundledImplementation) {
        if (useBundledImplementation) {
            log.debug("Using palantir-java-format implementation bundled with plugin");
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for parameter 'implementationClassPath'
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/FormatterProvider.java`
#### Snippet
```java
                Project project,
                int jdkMajorVersion,
                Optional<List<URI>> implementationClassPath,
                boolean useBundledImplementation) {
            this.project = project;
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'implementationClassPath'
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/FormatterProvider.java`
#### Snippet
```java
        private final Project project;
        private final int jdkMajorVersion;
        private final Optional<List<URI>> implementationClassPath;
        private final boolean useBundledImplementation;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'initializer'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            Direction annotationsDirection,
            VariableTree node,
            Optional<ExpressionTree> initializer,
            String equals,
            Optional<String> trailing) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'trailing'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            Optional<ExpressionTree> initializer,
            String equals,
            Optional<String> trailing) {
        sync(node);
        declareOne(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'tyargTag'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
    }

    private void dotExpressionUpToArgs(ExpressionTree expression, Optional<BreakTag> tyargTag) {
        expression = getArrayBase(expression);
        switch (expression.getKind()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'modifiers'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            DeclarationKind kind,
            Direction annotationsDirection,
            Optional<ModifiersTree> modifiers,
            Tree type,
            Name name,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'initializer'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            String op,
            String equals,
            Optional<ExpressionTree> initializer,
            Optional<String> trailing,
            Optional<ExpressionTree> receiverExpression,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'trailing'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            String equals,
            Optional<ExpressionTree> initializer,
            Optional<String> trailing,
            Optional<ExpressionTree> receiverExpression,
            Optional<TypeWithDims> typeWithDims) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'receiverExpression'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            Optional<ExpressionTree> initializer,
            Optional<String> trailing,
            Optional<ExpressionTree> receiverExpression,
            Optional<TypeWithDims> typeWithDims) {

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'typeWithDims'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            Optional<String> trailing,
            Optional<ExpressionTree> receiverExpression,
            Optional<TypeWithDims> typeWithDims) {

        BreakTag typeBreak = new BreakTag();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'receiver'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
    }

    protected void visitFormals(Optional<VariableTree> receiver, List<? extends VariableTree> parameters) {
        if (!receiver.isPresent() && parameters.isEmpty()) {
            return;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'declarationAnnotationBreak'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
    /** Output combined modifiers and annotations and the trailing break. */
    void visitAndBreakModifiers(
            ModifiersTree modifiers, Direction annotationDirection, Optional<BreakTag> declarationAnnotationBreak) {
        builder.addAll(visitModifiers(modifiers, annotationDirection, declarationAnnotationBreak));
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'declarationAnnotationBreak'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            List<? extends AnnotationTree> annotationTrees,
            Direction annotationsDirection,
            Optional<BreakTag> declarationAnnotationBreak) {
        if (annotationTrees.isEmpty() && !nextIsModifier()) {
            return EMPTY_LIST;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'breakTag'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
    }

    private static ImmutableList<Op> breakFillList(Optional<BreakTag> breakTag) {
        return ImmutableList.of(
                OpenOp.make(ZERO), Break.make(FillMode.INDEPENDENT, " ", ZERO, breakTag), CloseOp.make());
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'breakTag'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
    protected final Indent.Const plusFour;

    private static ImmutableList<Op> breakList(Optional<BreakTag> breakTag) {
        return ImmutableList.of(Break.make(FillMode.UNIFIED, " ", ZERO, breakTag));
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'breakTag'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
    }

    private static ImmutableList<Op> forceBreakList(Optional<BreakTag> breakTag) {
        return ImmutableList.of(Break.make(FillMode.FORCED, "", Indent.Const.ZERO, breakTag));
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'declarationAnnotationBreak'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            ModifiersTree modifiersTree,
            Direction annotationsDirection,
            Optional<BreakTag> declarationAnnotationBreak) {
        return visitModifiers(modifiersTree.getAnnotations(), annotationsDirection, declarationAnnotationBreak);
    }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/Main.java`
#### Snippet
```java
    public static void main(String[] args) {
        int result;
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, UTF_8));
        PrintWriter err = new PrintWriter(new OutputStreamWriter(System.err, UTF_8));
        try {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/Main.java`
#### Snippet
```java
        int result;
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, UTF_8));
        PrintWriter err = new PrintWriter(new OutputStreamWriter(System.err, UTF_8));
        try {
            Main formatter = new Main(out, err, System.in);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
                    Matcher filenameMatcher = FILENAME.matcher(singleFileDiff);
                    if (!filenameMatcher.find()) {
                        System.err.println("Failed to find filename");
                        return Stream.empty();
                    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
            input = new String(Files.readAllBytes(diff.path), UTF_8);
        } catch (IOException e) {
            System.err.println("Failed to read file " + diff.path);
            e.printStackTrace(System.err);
            return;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
        } catch (IOException e) {
            System.err.println("Failed to read file " + diff.path);
            e.printStackTrace(System.err);
            return;
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java

        try {
            System.err.println("Formatting " + diff.path);
            ImmutableList<Replacement> replacements = formatter.getFormatReplacements(input, charRanges.asRanges());
            String output = applyReplacements(input, replacements);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
            Files.write(diff.path, output.getBytes(UTF_8));
        } catch (IOException | FormatterException e) {
            System.err.println("Failed to format file " + diff.path);
            e.printStackTrace(System.err);
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
        } catch (IOException | FormatterException e) {
            System.err.println("Failed to format file " + diff.path);
            e.printStackTrace(System.err);
        }
    }
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `DocTreeScanner` is the same as one of its superclass' names
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/RemoveUnusedImports.java`
#### Snippet
```java

        // scan javadoc comments, checking for references to imported types
        class DocTreeScanner extends DocTreePathScanner<Void, Void> {
            @Override
            public Void visitIdentifier(com.sun.source.doctree.IdentifierTree node, Void aVoid) {
```

### ClassNameSameAsAncestorName
Class name `Tok` is the same as one of its superclass' names
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
     */
    @Immutable
    static final class Tok implements Input.Tok {
        private final int index;
        private final String originalText;
```

### ClassNameSameAsAncestorName
Class name `Token` is the same as one of its superclass' names
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
     */
    @Immutable
    static final class Token implements Input.Token {
        private final Tok tok;
        private final ImmutableList<Tok> toksBefore;
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/javadoc/JavadocLexer.java`
#### Snippet
```java

        for (PeekingIterator<Token> tokens = peekingIterator(input.iterator()); tokens.hasNext(); ) {
            if (tokens.peek().getType() == LITERAL && tokens.peek().getValue().matches("^href=[^>]*>")) {
                output.add(tokens.next());

```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/javadoc/JavadocLexer.java`
#### Snippet
```java
                initialNewlines.add(tokens.next());
            }
            if (tokens.peek().getType() != LITERAL || !tokens.peek().getValue().matches("[ \t]*[{]@code")) {
                output.addAll(initialNewlines);
                output.add(tokens.next());
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/FormatterProvider.java`
#### Snippet
```java
        String normalizedVersion =
                indexOfVersionDelimiter >= 0 ? version.substring(0, indexOfVersionDelimiter) : version;
        normalizedVersion = normalizedVersion.replaceAll("-ea", "");
        try {
            return Integer.parseInt(normalizedVersion);
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java

    private static boolean isParamComment(Tok tok) {
        return tok.isSlashStarComment() && tok.getText().matches("\\/\\*[A-Za-z0-9\\s_\\-]+=\\s*\\*\\/");
    }

```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java
        int firstImportStart;
        Optional<Integer> maybeFirstImport = findIdentifier(0, IMPORT_OR_CLASS_START);
        if (!maybeFirstImport.isPresent() || !tokenAt(maybeFirstImport.get()).equals("import")) {
            // No imports, so nothing to do.
            return text;
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Obs.java`
#### Snippet
```java
            explorationNode.recordNewState(maybeNewState);

            if (!maybeNewState.isPresent()) {
                return Optional.empty();
            }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java
        Optional<State> partiallyInlinedStateOpt =
                tryInlinePrefixOntoCurrentLine(commentsHelper, maxWidth, state, keepIndent, explorationNode);
        if (!partiallyInlinedStateOpt.isPresent()) {
            return Optional.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java
        int innerLevelIndex = docs.indexOf(innerLevel);
        List<Doc> leadingDocs = docs.subList(0, innerLevelIndex);
        if (!tryToFitOnOneLine(maxWidth, state, leadingDocs).isPresent()) {
            return Optional.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java
                Level innerLevel = (Level) doc;
                Optional<Integer> newWidth = innerLevel.tryToFitOnOneLine(maxWidth, newState, innerLevel.getDocs());
                if (!newWidth.isPresent()) {
                    return Optional.empty();
                }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java
                || Double.isInfinite(breakWidth)
                || !tryToFitOnOneLine(maxWidth, state.withColumn(state.column() + (int) breakWidth), split)
                        .isPresent();

        if (optBreakDoc.isPresent()) {
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java

    protected void visitFormals(Optional<VariableTree> receiver, List<? extends VariableTree> parameters) {
        if (!receiver.isPresent() && parameters.isEmpty()) {
            return;
        }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.palantir.javaformat.gradle` is unnecessary and can be removed
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/SpotlessInterop.java`
#### Snippet
```java
/**
 * Class that exists only to encapsulate accessing spotless classes, so that Gradle can generate a decorated class for
 * {@link com.palantir.javaformat.gradle.PalantirJavaFormatSpotlessPlugin} even if spotless is not on the classpath.
 */
final class SpotlessInterop {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.lang.model.element` is unnecessary and can be removed
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ModifierOrderer.java`
#### Snippet
```java

    /**
     * Returns the given token as a {@link javax.lang.model.element.Modifier}, or {@code null} if it is not a modifier.
     */
    private static Modifier asModifier(Token token) {
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/Main.java`
#### Snippet
```java
            throw new UsageException(e.getMessage());
        } catch (Throwable t) {
            t.printStackTrace();
            throw new UsageException(t.getMessage());
        }
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`baseDims = baseDims - dims.size()` could be simplified to 'baseDims -= dims.size()'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
        int baseDims = dims.size();
        maybeAddDims(dims);
        baseDims = baseDims - dims.size();
        boolean first = true;
        for (VariableTree fragment : fragments) {
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JsonSink.java`
#### Snippet
```java
            json = childrenMap.get(parentLevelId.getAsInt()).addObject();
        } else {
            json = rootNode = OBJECT_MAPPER.createObjectNode();
        }
        json.put("type", "exploration");
```

### NestedAssignment
Result of assignment expression used
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavacTokens.java`
#### Snippet
```java
            String text = this.text;
            if (text == null) {
                this.text = text = new String(reader.getRawCharacters());
            }
            return text;
```

### NestedAssignment
Result of assignment expression used
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java
                } else if (hasEscapedNewlineAt(text, idx) != -1) {
                    int length;
                    while ((length = hasEscapedNewlineAt(text, idx)) != -1) {
                        idx += length;
                    }
```

### NestedAssignment
Result of assignment expression used
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            }
            token("}", plusTwo);
        } else if ((cols = argumentsAreTabular(expressions)) != -1) {
            builder.open(ZERO, BreakBehaviours.breakThisLevel(), LastLevelBreakability.ACCEPT_INLINE_CHAIN);
            builder.open(plusTwo, BreakBehaviours.breakThisLevel(), LastLevelBreakability.ACCEPT_INLINE_CHAIN);
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/PalantirCodeStyleManager.java`
#### Snippet
```java
        try {
            ImmutableMap.Builder<TextRange, String> replacements = ImmutableMap.builder();
            formatter.getFormatReplacements(text, toRanges(ranges)).forEach(replacement -> {
                replacements.put(toTextRange(replacement.getReplaceRange()), replacement.getReplacementString());
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/PalantirJavaFormatSpotlessPlugin.java`
#### Snippet
```java
        project.getRootProject().getPluginManager().apply(PalantirJavaFormatProviderPlugin.class);

        project.getPluginManager().withPlugin("java", _javaPlugin -> {
            SPOTLESS_PLUGINS.forEach(
                    spotlessPluginId -> project.getPluginManager().withPlugin(spotlessPluginId, _spotlessPlugin -> {
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/PalantirJavaFormatSpotlessPlugin.java`
#### Snippet
```java
        project.getPluginManager().withPlugin("java", _javaPlugin -> {
            SPOTLESS_PLUGINS.forEach(
                    spotlessPluginId -> project.getPluginManager().withPlugin(spotlessPluginId, _spotlessPlugin -> {
                        SpotlessInterop.addSpotlessJavaStep(
                                project, PalantirJavaFormatProviderPlugin.CONFIGURATION_NAME);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/PalantirJavaFormatProviderPlugin.java`
#### Snippet
```java
            conf.setCanBeConsumed(false);

            conf.defaultDependencies(deps -> {
                deps.add(rootProject
                        .getDependencies()
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/LevelDelimitedFlatValueDocVisitor.java`
#### Snippet
```java
public final class LevelDelimitedFlatValueDocVisitor implements DocVisitor<String> {
    private final State state;
    int indent = 0;

    public LevelDelimitedFlatValueDocVisitor(State state) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `palantir-java-format/src/main/java/com/palantir/javaformat/Newlines.java`
#### Snippet
```java
    private static final class LineOffsetIterator implements Iterator<Integer> {

        private int curr = 0;
        private int idx = 0;
        private final String input;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `palantir-java-format/src/main/java/com/palantir/javaformat/Newlines.java`
#### Snippet
```java

        private int curr = 0;
        private int idx = 0;
        private final String input;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/LineOffsetIterator.java`
#### Snippet
```java

    private int curr = 0;
    private int idx = 0;
    private final String input;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/LineOffsetIterator.java`
#### Snippet
```java
final class LineOffsetIterator implements Iterator<Integer> {

    private int curr = 0;
    private int idx = 0;
    private final String input;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java
    private int lastK = -1; // Last {@link Tok} index output.
    private int spacesPending = 0;
    private int newlinesPending = 0;
    private StringBuilder lineBuilder = new StringBuilder();

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java
    private final int kN; // The number of tokens or comments in the input, excluding the EOF.
    private final InputMetadata inputMetadata;
    private int iLine = 0; // Closest corresponding line number on input.
    private int lastK = -1; // Last {@link Tok} index output.
    private int spacesPending = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java
    private int iLine = 0; // Closest corresponding line number on input.
    private int lastK = -1; // Last {@link Tok} index output.
    private int spacesPending = 0;
    private int newlinesPending = 0;
    private StringBuilder lineBuilder = new StringBuilder();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavacTokens.java`
#### Snippet
```java
        private final CommentStyle style;

        private String text = null;

        public CommentWithTextAndPosition(int pos, int endPos, AccessibleReader reader, CommentStyle style) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `palantir-java-format/src/main/java/com/palantir/javaformat/OpsBuilder.java`
#### Snippet
```java
    private static final Const ZERO = Const.ZERO;

    private int tokenI = 0;
    private int inputPosition = Integer.MIN_VALUE;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `palantir-java-format/src/main/java/com/palantir/javaformat/OpsBuilder.java`
#### Snippet
```java

    /** The number of unclosed open ops in the input stream. */
    int depth = 0;

    /** Add an {@link Op}, and record open/close ops for later validation of unclosed levels. */
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
        private final ImmutableList.Builder<Integer> offsets = ImmutableList.builder();
        private final ImmutableList.Builder<Integer> lengths = ImmutableList.builder();
        private boolean inPlace = false;
        private boolean aosp = false;
        private boolean palantirStyle = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
        private boolean sortImports = true;
        private boolean removeUnusedImports = true;
        private boolean dryRun = false;
        private boolean setExitIfChanged = false;
        private Optional<String> assumeFilename = Optional.empty();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
        private Optional<String> assumeFilename = Optional.empty();
        private boolean reflowLongStrings = true;
        private boolean outputReplacements = false;

        private Builder() {}
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
        private boolean removeUnusedImports = true;
        private boolean dryRun = false;
        private boolean setExitIfChanged = false;
        private Optional<String> assumeFilename = Optional.empty();
        private boolean reflowLongStrings = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
        private final ImmutableList.Builder<Integer> lengths = ImmutableList.builder();
        private boolean inPlace = false;
        private boolean aosp = false;
        private boolean palantirStyle = false;
        private boolean version = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
        private boolean inPlace = false;
        private boolean aosp = false;
        private boolean palantirStyle = false;
        private boolean version = false;
        private boolean help = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
        private boolean palantirStyle = false;
        private boolean version = false;
        private boolean help = false;
        private boolean stdin = false;
        private boolean fixImportsOnly = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
        private boolean version = false;
        private boolean help = false;
        private boolean stdin = false;
        private boolean fixImportsOnly = false;
        private boolean sortImports = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
        private boolean help = false;
        private boolean stdin = false;
        private boolean fixImportsOnly = false;
        private boolean sortImports = true;
        private boolean removeUnusedImports = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
        private boolean aosp = false;
        private boolean palantirStyle = false;
        private boolean version = false;
        private boolean help = false;
        private boolean stdin = false;
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `input`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/FormatFileCallable.java`
#### Snippet
```java
    private String fixImports(String input) throws FormatterException {
        if (parameters.removeUnusedImports()) {
            input = RemoveUnusedImports.removeUnusedImports(input);
        }
        if (parameters.sortImports()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `input`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/FormatFileCallable.java`
#### Snippet
```java
        }
        if (parameters.sortImports()) {
            input = ImportOrderer.reorderImports(input, options.style());
        }
        return input;
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java
        // zero-width it doesn't matter if we include it in our string concatenation at the end.
        while (i < toks.size() && tokenAt(i).equals("import")) {
            i++;
            if (isSpaceToken(i)) {
                i++;
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java
            i++;
            if (isSpaceToken(i)) {
                i++;
            }
            boolean isStatic = tokenAt(i).equals("static");
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java
            boolean isStatic = tokenAt(i).equals("static");
            if (isStatic) {
                i++;
                if (isSpaceToken(i)) {
                    i++;
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java
                i++;
                if (isSpaceToken(i)) {
                    i++;
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java
            StringAndIndex imported = scanImported(i);
            String importedName = imported.string;
            i = imported.index;
            if (isSpaceToken(i)) {
                i++;
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java
            i = imported.index;
            if (isSpaceToken(i)) {
                i++;
            }
            if (!tokenAt(i).equals(";")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java
            while (tokenAt(i).equals(";")) {
                // Extra semicolons are not allowed by the JLS but are accepted by javac.
                i++;
            }
            StringBuilder trailing = new StringBuilder();
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java
            if (isSpaceToken(i)) {
                trailing.append(tokenAt(i));
                i++;
            }
            if (isNewlineToken(i)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java
            if (isNewlineToken(i)) {
                trailing.append(tokenAt(i));
                i++;
            }
            // Gather (if any) all single line comments and accompanied line terminators following this
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java
            while (isSlashSlashCommentToken(i)) {
                trailing.append(tokenAt(i));
                i++;
                if (isNewlineToken(i)) {
                    trailing.append(tokenAt(i));
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java
                if (isNewlineToken(i)) {
                    trailing.append(tokenAt(i));
                    i++;
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java
            afterLastImport = i;
            while (isNewlineToken(i) || isSpaceToken(i)) {
                i++;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `input`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java
            // If formatting the replacement ranges resulted in a change, recalculate the replacements on
            // the updated input.
            input = firstPass;
            replacements = getReflowReplacements(columnLimit, input);
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `lines`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaCommentsHelper.java`
#### Snippet
```java
    // Wraps and re-indents line comments.
    private String indentLineComments(List<String> lines, int column0) {
        lines = wrapLineComments(lines, column0);
        StringBuilder builder = new StringBuilder();
        builder.append(lines.get(0).trim());
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/DimensionHelpers.java`
#### Snippet
```java
    static TypeWithDims extractDims(Tree node, SortedDims sorted) {
        Deque<List<AnnotationTree>> builder = new ArrayDeque<>();
        node = extractDims(builder, node);
        Iterable<List<AnnotationTree>> dims;
        if (sorted == SortedDims.YES) {
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/DimensionHelpers.java`
#### Snippet
```java
                    return node;
                }
                node = extractDims(dims, annotatedTypeTree.getUnderlyingType());
                dims.addFirst(ImmutableList.copyOf(annotatedTypeTree.getAnnotations()));
                return node;
```

### AssignmentToMethodParameter
Assignment to method parameter `input`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/Formatter.java`
#### Snippet
```java
     */
    public String formatSourceAndFixImports(String input) throws FormatterException {
        input = ImportOrderer.reorderImports(input, options.style());
        input = RemoveUnusedImports.removeUnusedImports(input);
        String formatted = formatSource(input);
```

### AssignmentToMethodParameter
Assignment to method parameter `input`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/Formatter.java`
#### Snippet
```java
    public String formatSourceAndFixImports(String input) throws FormatterException {
        input = ImportOrderer.reorderImports(input, options.style());
        input = RemoveUnusedImports.removeUnusedImports(input);
        String formatted = formatSource(input);
        formatted = StringWrapper.wrap(options.maxLineLength(), formatted, this);
```

### AssignmentToMethodParameter
Assignment to method parameter `input`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/javadoc/JavadocLexer.java`
#### Snippet
```java
         * so we'll probably never bother.
         */
        input = stripJavadocBeginAndEnd(input);
        input = normalizeLineEndings(input);
        return new JavadocLexer(new CharStream(input)).generateTokens();
```

### AssignmentToMethodParameter
Assignment to method parameter `input`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/javadoc/JavadocLexer.java`
#### Snippet
```java
         */
        input = stripJavadocBeginAndEnd(input);
        input = normalizeLineEndings(input);
        return new JavadocLexer(new CharStream(input)).generateTokens();
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/Trees.java`
#### Snippet
```java
    /** Returns the enclosing type declaration (class, enum, interface, or annotation) for the given path. */
    static ClassTree getEnclosingTypeDeclaration(TreePath path) {
        for (; path != null; path = path.getParentPath()) {
            switch (path.getLeaf().getKind()) {
                case CLASS:
```

### AssignmentToMethodParameter
Assignment to method parameter `state`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java
        for (int i = 0; i < splitsBreaks.splits().size(); ++i) {
            if (i > 0) {
                state = splitsBreaks.breaks().get(i - 1).computeBreaks(state, false);
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `state`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java
            float splitWidth = getWidth(split);
            boolean enoughRoom = state.column() + splitWidth <= maxWidth;
            state = computeSplit(commentsHelper, maxWidth, split, state.withMustBreak(false), explorationNode);
            if (!enoughRoom) {
                state = state.withMustBreak(true);
```

### AssignmentToMethodParameter
Assignment to method parameter `state`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java
            state = computeSplit(commentsHelper, maxWidth, split, state.withMustBreak(false), explorationNode);
            if (!enoughRoom) {
                state = state.withMustBreak(true);
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `state`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java
            Obs.ExplorationNode explorationNode) {
        for (Doc doc : docs) {
            state = doc.computeBreaks(commentsHelper, maxWidth, state, explorationNode);
        }
        return state;
```

### AssignmentToMethodParameter
Assignment to method parameter `state`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java

        if (optBreakDoc.isPresent()) {
            state = optBreakDoc.get().computeBreaks(state, shouldBreak);
        }
        boolean enoughRoom = state.column() + splitWidth <= maxWidth;
```

### AssignmentToMethodParameter
Assignment to method parameter `state`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java
        }
        boolean enoughRoom = state.column() + splitWidth <= maxWidth;
        state = computeSplit(commentsHelper, maxWidth, split, state.withMustBreak(false), explorationNode);
        if (!enoughRoom) {
            state = state.withMustBreak(true); // Break after, too.
```

### AssignmentToMethodParameter
Assignment to method parameter `state`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java
        state = computeSplit(commentsHelper, maxWidth, split, state.withMustBreak(false), explorationNode);
        if (!enoughRoom) {
            state = state.withMustBreak(true); // Break after, too.
        }
        return state;
```

### AssignmentToMethodParameter
Assignment to method parameter `state`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java

        if (!splitsBreaks.breaks().isEmpty()) {
            state = state.withBrokenLevel();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `state`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java

        ImmutableList<Doc> splitDocs = splitsBreaks.splits().get(0);
        state = computeBreakAndSplit(
                commentsHelper, maxWidth, state, /* optBreakDoc= */ Optional.empty(), splitDocs, explorationNode);

```

### AssignmentToMethodParameter
Assignment to method parameter `state`
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Level.java`
#### Snippet
```java
        // Handle following breaks and split.
        for (int i = 0; i < splitsBreaks.breaks().size(); i++) {
            state = computeBreakAndSplit(
                    commentsHelper,
                    maxWidth,
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
        if (length == 0) {
            // 0 stands for "format the line under the cursor"
            length = 1;
        }
        ImmutableCollection<Token> enclosed = getPositionTokenMap()
```

### AssignmentToMethodParameter
Assignment to method parameter `columnI`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
        Integer last = Iterators.getLast(Newlines.lineOffsetIterator(originalTokText));
        if (last > 0) {
            columnI = originalTokText.length() - last;
        } else {
            columnI += originalTokText.length();
```

### AssignmentToMethodParameter
Assignment to method parameter `columnI`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
            columnI = originalTokText.length() - last;
        } else {
            columnI += originalTokText.length();
        }
        return columnI;
```

### AssignmentToMethodParameter
Assignment to method parameter `stopTokens`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
     */
    static ImmutableList<Tok> buildToks(String text, ImmutableSet<TokenKind> stopTokens) throws FormatterException {
        stopTokens = ImmutableSet.<TokenKind>builder()
                .addAll(stopTokens)
                .add(TokenKind.EOF)
```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java

    private void dotExpressionUpToArgs(ExpressionTree expression, Optional<BreakTag> tyargTag) {
        expression = getArrayBase(expression);
        switch (expression.getKind()) {
            case MEMBER_SELECT:
```

### AssignmentToMethodParameter
Assignment to method parameter `needDot`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            }
            length += getLength(e, getCurrentPath());
            needDot = true;
        }
        if (!needDot0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
    private ExpressionTree getArrayBase(ExpressionTree node) {
        while (node instanceof ArrayAccessTree) {
            node = ((ArrayAccessTree) node).getExpression();
        }
        return node;
```

### AssignmentToMethodParameter
Assignment to method parameter `needDot`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            dotExpressionArgsAndParen(e, tyargIndent, argsIndent);

            needDot = true;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            ArrayAccessTree array = (ArrayAccessTree) expression;
            indices.addLast(array.getIndex());
            expression = array.getExpression();
        }
        return indices;
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            statements.add(node.getThenStatement());
            if (node.getElseStatement() != null && node.getElseStatement().getKind() == IF) {
                node = (IfTree) node.getElseStatement();
            } else {
                break;
```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
    private void dotExpressionArgsAndParen(ExpressionTree expression, Indent tyargIndent, Indent indent) {
        Deque<ExpressionTree> indices = getArrayIndices(expression);
        expression = getArrayBase(expression);
        switch (expression.getKind()) {
            case METHOD_INVOCATION:
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
    private void visitName(Tree node) {
        Deque<Name> stack = new ArrayDeque<>();
        for (; node instanceof MemberSelectTree; node = ((MemberSelectTree) node).getExpression()) {
            stack.addFirst(((MemberSelectTree) node).getIdentifier());
        }
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/Main.java`
#### Snippet
```java
                    errWriter.println(path + ": could not write file: " + e.getMessage());
                    allOk = false;
                    continue;
                }
            } else if (parameters.dryRun()) {
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `FormattingModeAwareIndentAdjuster`
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java
 */
@SuppressWarnings("deprecation")
class CodeStyleManagerDecorator extends CodeStyleManagerImpl implements FormattingModeAwareIndentAdjuster {

    private final CodeStyleManager delegate;
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `palantir-java-format/src/main/java/com/palantir/javaformat/Newlines.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/PalantirJavaFormatSettings.java`
#### Snippet
```java
                    return "false";
                default:
                    return null;
            }
        }
```

### ReturnNull
Return of `null`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/java14/Java14InputAstVisitor.java`
#### Snippet
```java
            return c.getMethod(name);
        } catch (ReflectiveOperationException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/RemoveUnusedImports.java`
#### Snippet
```java
                return CaseTree.class.getMethod("getLabels");
            } catch (NoSuchMethodException e) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ModifierOrderer.java`
#### Snippet
```java
                return Modifier.valueOf("SEALED");
            default:
                return null;
        }
    }
```

### ReturnNull
Return of `null`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/Trees.java`
#### Snippet
```java
    static ExpressionTree getMethodReceiver(MethodInvocationTree methodInvocation) {
        ExpressionTree select = methodInvocation.getMethodSelect();
        return select instanceof MemberSelectTree ? ((MemberSelectTree) select).getExpression() : null;
    }

```

### ReturnNull
Return of `null`
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/FormatterProvider.java`
#### Snippet
```java
        } catch (NumberFormatException e) {
            log.error("Could not parse sdk version: {}", version, e);
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
    private TypeWithDims variableFragmentDims(boolean first, int leadingDims, Tree type) {
        if (type == null) {
            return null;
        }
        if (first) {
```

### ReturnNull
Return of `null`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
    private ExpressionTree getMethodReceiver(MethodInvocationTree methodInvocation) {
        ExpressionTree select = methodInvocation.getMethodSelect();
        return select instanceof MemberSelectTree ? ((MemberSelectTree) select).getExpression() : null;
    }

```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `FormattingError` does not end with 'Exception'
in `palantir-java-format/src/main/java/com/palantir/javaformat/FormattingError.java`
#### Snippet
```java

/** An unchecked formatting error. */
public class FormattingError extends RuntimeException {

    private final ImmutableList<FormatterDiagnostic> diagnostics;
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `endPosition` is redundant
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java
                    return null;
                }
                int endPosition = getEndPosition(unit, literalTree);
                int lineEnd = endPosition;
                while (Newlines.hasNewlineAt(input, lineEnd) == -1) {
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `diagnostics` of exception class
in `palantir-java-format-spi/src/main/java/com/palantir/javaformat/java/FormatterException.java`
#### Snippet
```java
public final class FormatterException extends Exception {

    private ImmutableList<FormatterDiagnostic> diagnostics;

    public FormatterException(String message) {
```

## RuleId[id=UnstableTypeUsedInSignature]
### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.ImmutableRangeMap'
in `palantir-java-format/src/main/java/com/palantir/javaformat/Input.java`
#### Snippet
```java

    /** A map from [start, end] position ranges to {@link Token}s. */
    public abstract ImmutableRangeMap<Integer, ? extends Token> getPositionTokenMap();

    public abstract ImmutableMap<Integer, Integer> getPositionToColumnMap();
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.RangeSet'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java
     * @return a list of {@link Replacement}s, sorted by start index, without overlaps
     */
    public ImmutableList<Replacement> getFormatReplacements(RangeSet<Integer> iRangeSet0) {
        ImmutableList.Builder<Replacement> result = ImmutableList.builder();
        Map<Integer, Range<Integer>> kToJ = JavaOutput.makeKToIJ(this);
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.RangeSet'
in `palantir-java-format/src/main/java/com/palantir/javaformat/Utils.java`
#### Snippet
```java

    /** Converts zero-indexed, [closed, open) line ranges in the given source file to character ranges. */
    public static RangeSet<Integer> lineRangesToCharRanges(String input, RangeSet<Integer> lineRanges) {
        List<Integer> lines = new ArrayList<>();
        Iterators.addAll(lines, Newlines.lineOffsetIterator(input));
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.ImmutableRangeSet'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/InputMetadata.java`
#### Snippet
```java
     */
    @Default
    default ImmutableRangeSet<Integer> partialFormatRanges() {
        return ImmutableRangeSet.of();
    }
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.ImmutableRangeMap'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
     */
    @Override
    public ImmutableRangeMap<Integer, Token> getPositionTokenMap() {
        return positionTokenMap;
    }
```

### UnstableTypeUsedInSignature
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.RangeSet'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
    }

    public RangeSet<Integer> characterRangesToTokenRanges(Collection<Range<Integer>> characterRanges)
            throws FormatterException {
        RangeSet<Integer> tokenRangeSet = TreeRangeSet.create();
```

### UnstableTypeUsedInSignature
Field must be marked with '@com.google.common.annotations.Beta' annotation because its type references unstable type 'com.google.common.collect.ImmutableRangeMap'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
    private final ImmutableMap<Integer, Integer> positionToColumnMap; // Map Tok position to column.
    private final ImmutableList<Token> tokens; // The Tokens for this input.
    private final ImmutableRangeMap<Integer, Token> positionTokenMap; // Map position to Token.

    /** Map from Tok index to the associated Token. */
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
The value `false` assigned to `first` is never used
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
                builder.breakOp(FillMode.INDEPENDENT, " ", ZERO, Optional.of(breakBeforeName));
            } else {
                first = false;
            }
            if (!openedNameAndTypeScope) {
```

### UnusedAssignment
The value `true` assigned to `openedNameAndTypeScope` is never used
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            if (!openedNameAndTypeScope) {
                builder.open(ZERO);
                openedNameAndTypeScope = true;
            }
            String name = node.getName().toString();
```

### UnusedAssignment
The value `true` assigned to `lastWasAnnotation` is never used
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            } else {
                scan(annotations.removeFirst(), null);
                lastWasAnnotation = true;
            }
            first = false;
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `unit == null` is always `false`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/RemoveUnusedImports.java`
#### Snippet
```java
        Context context = new Context();
        JCCompilationUnit unit = parse(context, contents);
        if (unit == null) {
            // error handling is done during formatting
            return contents;
```

### ConstantValue
Condition `strings.size() != 1` is always `true`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java

            } else {
                if (strings.size() != 1 && !tokText.equals(originalTokText)) {
                    throw new FormatterException(
                            "Unicode escapes not allowed in whitespace or multi-character operators");
```

### ConstantValue
Condition `!openedNameAndTypeScope` is always `true`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
                    first = false;
                }
                if (!openedNameAndTypeScope) {
                    builder.open(make(breakBeforeType, plusFour, ZERO));
                    openedNameAndTypeScope = true;
```

### ConstantValue
Value `openedNameAndTypeScope` is always 'false'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
                    first = false;
                }
                if (!openedNameAndTypeScope) {
                    builder.open(make(breakBeforeType, plusFour, ZERO));
                    openedNameAndTypeScope = true;
```

### ConstantValue
Condition `!first` is always `true`
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
                if (first) {
                    builder.blankLineWanted(PRESERVE);
                } else if (!first && (thisOneGetsBlankLineBefore || lastOneGotBlankLineBefore)) {
                    builder.blankLineWanted(YES);
                }
```

### ConstantValue
Value `first` is always 'false'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
                if (first) {
                    builder.blankLineWanted(PRESERVE);
                } else if (!first && (thisOneGetsBlankLineBefore || lastOneGotBlankLineBefore)) {
                    builder.blankLineWanted(YES);
                }
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/UiFormatterStyle.java`
#### Snippet
```java
                .filter(value -> Objects.equals(value.style, style))
                .findFirst()
                .get();
    }
}
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            String name = node.getName().toString();
            if (name.equals("<init>")) {
                name = builder.peekToken().get();
            }
            token(name);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
                visitAndBreakModifiers(modifiers.get(), annotationsDirection, Optional.of(verticalAnnotationBreak));
            }
            boolean isVar = builder.peekToken().get().equals("var")
                    && (!name.contentEquals("var") || builder.peekToken(1).get().equals("var"));
            boolean hasType = type != null || isVar;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            }
            boolean isVar = builder.peekToken().get().equals("var")
                    && (!name.contentEquals("var") || builder.peekToken(1).get().equals("var"));
            boolean hasType = type != null || isVar;
            builder.open(hasType ? plusFour : ZERO);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
                    builder.close();
                } else {
                    if (builder.peekToken().get().equals("switch")) {
                        // TODO(fawind): Don't break switch expression assignment
                        builder.open(Indent.If.make(typeBreak, plusFour, ZERO));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            }
            if (nextIsModifier()) {
                String currentToken = builder.peekToken().get();
                token(currentToken);
                if (currentToken.equals("non")) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
                token(currentToken);
                if (currentToken.equals("non")) {
                    token(builder.peekToken().get());
                    token(builder.peekToken().get());
                }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
                if (currentToken.equals("non")) {
                    token(builder.peekToken().get());
                    token(builder.peekToken().get());
                }
            } else {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java

    boolean nextIsModifier() {
        switch (builder.peekToken().get()) {
            case "public":
            case "protected":
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
                case ".":
                    if (!builder.peekToken().get().equals(".")
                            || !builder.peekToken(1).get().equals(".")) {
                        return;
                    }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/Input.java`
#### Snippet
```java

    /** A map from [start, end] position ranges to {@link Token}s. */
    public abstract ImmutableRangeMap<Integer, ? extends Token> getPositionTokenMap();

    public abstract ImmutableMap<Integer, Integer> getPositionToColumnMap();
```

### UnstableApiUsage
'asRanges()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/FormatFileCallable.java`
#### Snippet
```java

    private String formatFile(Formatter formatter) throws FormatterException {
        String formatted = formatter.formatSource(input, characterRanges(input).asRanges());
        formatted = fixImports(formatted);
        if (parameters.reflowLongStrings()) {
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/FormatFileCallable.java`
#### Snippet
```java
    }

    private RangeSet<Integer> characterRanges(String input) {
        final RangeSet<Integer> characterRanges = TreeRangeSet.create();

```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/FormatFileCallable.java`
#### Snippet
```java

    private RangeSet<Integer> characterRanges(String input) {
        final RangeSet<Integer> characterRanges = TreeRangeSet.create();

        if (parameters.characterRanges().isEmpty()
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/FormatFileCallable.java`
#### Snippet
```java

    private RangeSet<Integer> characterRanges(String input) {
        final RangeSet<Integer> characterRanges = TreeRangeSet.create();

        if (parameters.characterRanges().isEmpty()
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/FormatFileCallable.java`
#### Snippet
```java

    private RangeSet<Integer> characterRanges(String input) {
        final RangeSet<Integer> characterRanges = TreeRangeSet.create();

        if (parameters.characterRanges().isEmpty()
```

### UnstableApiUsage
'isEmpty()' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/FormatFileCallable.java`
#### Snippet
```java
        final RangeSet<Integer> characterRanges = TreeRangeSet.create();

        if (parameters.characterRanges().isEmpty()
                && parameters.lines().isEmpty()
                && parameters.offsets().isEmpty()) {
```

### UnstableApiUsage
'isEmpty()' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/FormatFileCallable.java`
#### Snippet
```java

        if (parameters.characterRanges().isEmpty()
                && parameters.lines().isEmpty()
                && parameters.offsets().isEmpty()) {
            characterRanges.add(Range.closedOpen(0, input.length()));
```

### UnstableApiUsage
'add(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/FormatFileCallable.java`
#### Snippet
```java
                && parameters.lines().isEmpty()
                && parameters.offsets().isEmpty()) {
            characterRanges.add(Range.closedOpen(0, input.length()));
            return characterRanges;
        }
```

### UnstableApiUsage
'isEmpty()' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/FormatFileCallable.java`
#### Snippet
```java
        }

        if (!parameters.characterRanges().isEmpty()) {
            characterRanges.addAll(parameters.characterRanges());
        }
```

### UnstableApiUsage
'addAll(com.google.common.collect.RangeSet)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/FormatFileCallable.java`
#### Snippet
```java

        if (!parameters.characterRanges().isEmpty()) {
            characterRanges.addAll(parameters.characterRanges());
        }

```

### UnstableApiUsage
'isEmpty()' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/FormatFileCallable.java`
#### Snippet
```java
        }

        if (!parameters.lines().isEmpty()) {
            characterRanges.addAll(Utils.lineRangesToCharRanges(input, parameters.lines()));
        }
```

### UnstableApiUsage
'addAll(com.google.common.collect.RangeSet)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/FormatFileCallable.java`
#### Snippet
```java

        if (!parameters.lines().isEmpty()) {
            characterRanges.addAll(Utils.lineRangesToCharRanges(input, parameters.lines()));
        }

```

### UnstableApiUsage
'add(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/FormatFileCallable.java`
#### Snippet
```java
                length = 1;
            }
            characterRanges.add(Range.closedOpen(
                    parameters.offsets().get(i), parameters.offsets().get(i) + length));
        }
```

### UnstableApiUsage
'asRanges()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/FormatFileCallable.java`
#### Snippet
```java
    private String formatReplacements(Formatter formatter) throws FormatterException {
        ImmutableList<Replacement> replacements =
                formatter.getFormatReplacements(input, characterRanges(input).asRanges());
        try {
            return MAPPER.writeValueAsString(replacements);
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java
     * @return a list of {@link Replacement}s, sorted by start index, without overlaps
     */
    public ImmutableList<Replacement> getFormatReplacements(RangeSet<Integer> iRangeSet0) {
        ImmutableList.Builder<Replacement> result = ImmutableList.builder();
        Map<Integer, Range<Integer>> kToJ = JavaOutput.makeKToIJ(this);
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java

        // Expand the token ranges to align with re-formattable boundaries.
        RangeSet<Integer> breakableRanges = TreeRangeSet.create();
        RangeSet<Integer> iRangeSet = iRangeSet0.subRangeSet(Range.closed(0, javaInput.getkN()));
        for (Range<Integer> iRange : iRangeSet.asRanges()) {
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java

        // Expand the token ranges to align with re-formattable boundaries.
        RangeSet<Integer> breakableRanges = TreeRangeSet.create();
        RangeSet<Integer> iRangeSet = iRangeSet0.subRangeSet(Range.closed(0, javaInput.getkN()));
        for (Range<Integer> iRange : iRangeSet.asRanges()) {
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java

        // Expand the token ranges to align with re-formattable boundaries.
        RangeSet<Integer> breakableRanges = TreeRangeSet.create();
        RangeSet<Integer> iRangeSet = iRangeSet0.subRangeSet(Range.closed(0, javaInput.getkN()));
        for (Range<Integer> iRange : iRangeSet.asRanges()) {
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java
        // Expand the token ranges to align with re-formattable boundaries.
        RangeSet<Integer> breakableRanges = TreeRangeSet.create();
        RangeSet<Integer> iRangeSet = iRangeSet0.subRangeSet(Range.closed(0, javaInput.getkN()));
        for (Range<Integer> iRange : iRangeSet.asRanges()) {
            Range<Integer> range = expandToBreakableRegions(iRange.canonical(DiscreteDomain.integers()));
```

### UnstableApiUsage
'subRangeSet(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java
        // Expand the token ranges to align with re-formattable boundaries.
        RangeSet<Integer> breakableRanges = TreeRangeSet.create();
        RangeSet<Integer> iRangeSet = iRangeSet0.subRangeSet(Range.closed(0, javaInput.getkN()));
        for (Range<Integer> iRange : iRangeSet.asRanges()) {
            Range<Integer> range = expandToBreakableRegions(iRange.canonical(DiscreteDomain.integers()));
```

### UnstableApiUsage
'asRanges()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java
        RangeSet<Integer> breakableRanges = TreeRangeSet.create();
        RangeSet<Integer> iRangeSet = iRangeSet0.subRangeSet(Range.closed(0, javaInput.getkN()));
        for (Range<Integer> iRange : iRangeSet.asRanges()) {
            Range<Integer> range = expandToBreakableRegions(iRange.canonical(DiscreteDomain.integers()));
            if (range.equals(EMPTY_RANGE)) {
```

### UnstableApiUsage
'add(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java
                continue;
            }
            breakableRanges.add(range);
        }

```

### UnstableApiUsage
'asRanges()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java

        // Construct replacements for each reformatted region.
        for (Range<Integer> range : breakableRanges.asRanges()) {

            Input.Tok startTok = startTok(javaInput.getToken(range.lowerEndpoint()));
```

### UnstableApiUsage
'contains(C)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java

        // Expand the token indices to formattable boundaries (e.g. edges of statements).
        if (!partialFormatRanges().contains(loTok) || !partialFormatRanges().contains(hiTok)) {
            return EMPTY_RANGE;
        }
```

### UnstableApiUsage
'contains(C)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java

        // Expand the token indices to formattable boundaries (e.g. edges of statements).
        if (!partialFormatRanges().contains(loTok) || !partialFormatRanges().contains(hiTok)) {
            return EMPTY_RANGE;
        }
```

### UnstableApiUsage
'rangeContaining(C)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java
            return EMPTY_RANGE;
        }
        loTok = partialFormatRanges().rangeContaining(loTok).lowerEndpoint();
        hiTok = partialFormatRanges().rangeContaining(hiTok).upperEndpoint();
        return Range.closedOpen(loTok, hiTok + 1);
```

### UnstableApiUsage
'rangeContaining(C)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java
        }
        loTok = partialFormatRanges().rangeContaining(loTok).lowerEndpoint();
        hiTok = partialFormatRanges().rangeContaining(hiTok).upperEndpoint();
        return Range.closedOpen(loTok, hiTok + 1);
    }
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaOutput.java`
#### Snippet
```java
    }

    private RangeSet<Integer> partialFormatRanges() {
        return inputMetadata.partialFormatRanges();
    }
```

### UnstableApiUsage
'get(K)' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/OpsBuilder.java`
#### Snippet
```java
    /** @return the actual size of the AST node at position, including comments. */
    public int actualSize(int position, int length) {
        Input.Token startToken = input.getPositionTokenMap().get(position);
        int start = startToken.getTok().getPosition();
        for (Input.Tok tok : startToken.getToksBefore()) {
```

### UnstableApiUsage
'get(K)' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/OpsBuilder.java`
#### Snippet
```java
            }
        }
        Input.Token endToken = input.getPositionTokenMap().get(position + length - 1);
        int end = endToken.getTok().getPosition() + endToken.getTok().length();
        for (Input.Tok tok : endToken.getToksAfter()) {
```

### UnstableApiUsage
'get(K)' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/OpsBuilder.java`
#### Snippet
```java
    /** @return the start column of the token at {@code position}, including leading comments. */
    public Integer actualStartColumn(int position) {
        Input.Token startToken = input.getPositionTokenMap().get(position);
        int start = startToken.getTok().getPosition();
        int line0 = input.getLineNumber(start);
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptionsParser.java`
#### Snippet
```java
     * {@code 1}-based, but are converted to the {@code 0}-based numbering used internally by google-java-format.
     */
    private static void parseRangeSet(ImmutableRangeSet.Builder<Integer> result, String ranges) {
        for (String range : COMMA_SPLITTER.split(ranges)) {
            result.add(parseRange(range));
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet.Builder' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptionsParser.java`
#### Snippet
```java
     * {@code 1}-based, but are converted to the {@code 0}-based numbering used internally by google-java-format.
     */
    private static void parseRangeSet(ImmutableRangeSet.Builder<Integer> result, String ranges) {
        for (String range : COMMA_SPLITTER.split(ranges)) {
            result.add(parseRange(range));
```

### UnstableApiUsage
'add(com.google.common.collect.Range)' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptionsParser.java`
#### Snippet
```java
    private static void parseRangeSet(ImmutableRangeSet.Builder<Integer> result, String ranges) {
        for (String range : COMMA_SPLITTER.split(ranges)) {
            result.add(parseRange(range));
        }
    }
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
        }

        ImmutableRangeSet.Builder<Integer> characterRangesBuilder() {
            return characterRanges;
        }
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet.Builder' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
        }

        ImmutableRangeSet.Builder<Integer> characterRangesBuilder() {
            return characterRanges;
        }
```

### UnstableApiUsage
'isEmpty()' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
    /** Returns true if partial formatting was selected. */
    boolean isSelection() {
        return !lines().isEmpty() || !offsets().isEmpty() || !lengths().isEmpty();
    }

```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
        }

        ImmutableRangeSet.Builder<Integer> linesBuilder() {
            return lines;
        }
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet.Builder' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
        }

        ImmutableRangeSet.Builder<Integer> linesBuilder() {
            return lines;
        }
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
        private final ImmutableList.Builder<String> files = ImmutableList.builder();
        private final ImmutableRangeSet.Builder<Integer> lines = ImmutableRangeSet.builder();
        private final ImmutableRangeSet.Builder<Integer> characterRanges = ImmutableRangeSet.builder();
        private final ImmutableList.Builder<Integer> offsets = ImmutableList.builder();
        private final ImmutableList.Builder<Integer> lengths = ImmutableList.builder();
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet.Builder' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
        private final ImmutableList.Builder<String> files = ImmutableList.builder();
        private final ImmutableRangeSet.Builder<Integer> lines = ImmutableRangeSet.builder();
        private final ImmutableRangeSet.Builder<Integer> characterRanges = ImmutableRangeSet.builder();
        private final ImmutableList.Builder<Integer> offsets = ImmutableList.builder();
        private final ImmutableList.Builder<Integer> lengths = ImmutableList.builder();
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
        private final ImmutableList.Builder<String> files = ImmutableList.builder();
        private final ImmutableRangeSet.Builder<Integer> lines = ImmutableRangeSet.builder();
        private final ImmutableRangeSet.Builder<Integer> characterRanges = ImmutableRangeSet.builder();
        private final ImmutableList.Builder<Integer> offsets = ImmutableList.builder();
        private final ImmutableList.Builder<Integer> lengths = ImmutableList.builder();
```

### UnstableApiUsage
'builder()' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
        private final ImmutableList.Builder<String> files = ImmutableList.builder();
        private final ImmutableRangeSet.Builder<Integer> lines = ImmutableRangeSet.builder();
        private final ImmutableRangeSet.Builder<Integer> characterRanges = ImmutableRangeSet.builder();
        private final ImmutableList.Builder<Integer> offsets = ImmutableList.builder();
        private final ImmutableList.Builder<Integer> lengths = ImmutableList.builder();
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java

    /** Line ranges to format. */
    ImmutableRangeSet<Integer> lines() {
        return lines;
    }
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java

    /** Character ranges to format. */
    ImmutableRangeSet<Integer> characterRanges() {
        return characterRanges;
    }
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java

        private final ImmutableList.Builder<String> files = ImmutableList.builder();
        private final ImmutableRangeSet.Builder<Integer> lines = ImmutableRangeSet.builder();
        private final ImmutableRangeSet.Builder<Integer> characterRanges = ImmutableRangeSet.builder();
        private final ImmutableList.Builder<Integer> offsets = ImmutableList.builder();
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet.Builder' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java

        private final ImmutableList.Builder<String> files = ImmutableList.builder();
        private final ImmutableRangeSet.Builder<Integer> lines = ImmutableRangeSet.builder();
        private final ImmutableRangeSet.Builder<Integer> characterRanges = ImmutableRangeSet.builder();
        private final ImmutableList.Builder<Integer> offsets = ImmutableList.builder();
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java

        private final ImmutableList.Builder<String> files = ImmutableList.builder();
        private final ImmutableRangeSet.Builder<Integer> lines = ImmutableRangeSet.builder();
        private final ImmutableRangeSet.Builder<Integer> characterRanges = ImmutableRangeSet.builder();
        private final ImmutableList.Builder<Integer> offsets = ImmutableList.builder();
```

### UnstableApiUsage
'builder()' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java

        private final ImmutableList.Builder<String> files = ImmutableList.builder();
        private final ImmutableRangeSet.Builder<Integer> lines = ImmutableRangeSet.builder();
        private final ImmutableRangeSet.Builder<Integer> characterRanges = ImmutableRangeSet.builder();
        private final ImmutableList.Builder<Integer> offsets = ImmutableList.builder();
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
    private final boolean inPlace;
    private final ImmutableRangeSet<Integer> lines;
    private final ImmutableRangeSet<Integer> characterRanges;
    private final ImmutableList<Integer> offsets;
    private final ImmutableList<Integer> lengths;
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
    private final ImmutableList<String> files;
    private final boolean inPlace;
    private final ImmutableRangeSet<Integer> lines;
    private final ImmutableRangeSet<Integer> characterRanges;
    private final ImmutableList<Integer> offsets;
```

### UnstableApiUsage
'build()' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
                    files.build(),
                    inPlace,
                    lines.build(),
                    characterRanges.build(),
                    offsets.build(),
```

### UnstableApiUsage
'build()' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
                    inPlace,
                    lines.build(),
                    characterRanges.build(),
                    offsets.build(),
                    lengths.build(),
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
            ImmutableList<String> files,
            boolean inPlace,
            ImmutableRangeSet<Integer> lines,
            ImmutableRangeSet<Integer> characterRanges,
            ImmutableList<Integer> offsets,
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/CommandLineOptions.java`
#### Snippet
```java
            boolean inPlace,
            ImmutableRangeSet<Integer> lines,
            ImmutableRangeSet<Integer> characterRanges,
            ImmutableList<Integer> offsets,
            ImmutableList<Integer> lengths,
```

### UnstableApiUsage
'trueFirst()' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java
     */
    private static final Comparator<Import> GOOGLE_IMPORT_COMPARATOR =
            Comparator.comparing(Import::isStatic, trueFirst()).thenComparing(Import::imported);

    /**
```

### UnstableApiUsage
'trueFirst()' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java
     * https://android.googlesource.com/platform/development/+/master/ide/intellij/codestyles/AndroidStyle.xml.
     */
    private static final Comparator<Import> AOSP_IMPORT_COMPARATOR = Comparator.comparing(Import::isStatic, trueFirst())
            .thenComparing(Import::isAndroid, trueFirst())
            .thenComparing(Import::isThirdParty, trueFirst())
```

### UnstableApiUsage
'trueFirst()' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java
     */
    private static final Comparator<Import> AOSP_IMPORT_COMPARATOR = Comparator.comparing(Import::isStatic, trueFirst())
            .thenComparing(Import::isAndroid, trueFirst())
            .thenComparing(Import::isThirdParty, trueFirst())
            .thenComparing(Import::isJava, trueFirst())
```

### UnstableApiUsage
'trueFirst()' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java
    private static final Comparator<Import> AOSP_IMPORT_COMPARATOR = Comparator.comparing(Import::isStatic, trueFirst())
            .thenComparing(Import::isAndroid, trueFirst())
            .thenComparing(Import::isThirdParty, trueFirst())
            .thenComparing(Import::isJava, trueFirst())
            .thenComparing(Import::imported);
```

### UnstableApiUsage
'trueFirst()' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java
            .thenComparing(Import::isAndroid, trueFirst())
            .thenComparing(Import::isThirdParty, trueFirst())
            .thenComparing(Import::isJava, trueFirst())
            .thenComparing(Import::imported);

```

### UnstableApiUsage
'com.google.common.collect.TreeRangeMap' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java

    /** Applies replacements to the given string. */
    private static String applyReplacements(String javaInput, TreeRangeMap<Integer, String> replacementMap) {
        // process in descending order so the replacement ranges aren't perturbed if any replacements
        // differ in size from the input
```

### UnstableApiUsage
'asDescendingMapOfRanges()' is declared in unstable class 'com.google.common.collect.TreeRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java
        // process in descending order so the replacement ranges aren't perturbed if any replacements
        // differ in size from the input
        Map<Range<Integer>, String> ranges = replacementMap.asDescendingMapOfRanges();
        if (ranges.isEmpty()) {
            return javaInput;
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeMap' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java
    @SuppressWarnings("ResultOfMethodCallIgnored")
    private static ImmutableSet<Range<Integer>> rangesAfterAppliedReplacements(
            TreeRangeMap<Integer, String> replacements) {
        ImmutableSet.Builder<Range<Integer>> outputRanges = ImmutableSet.builder();
        int offset = 0;
```

### UnstableApiUsage
'asMapOfRanges()' is declared in unstable class 'com.google.common.collect.TreeRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java
        int offset = 0;
        for (Map.Entry<Range<Integer>, String> entry :
                replacements.asMapOfRanges().entrySet()) {
            Range<Integer> range = entry.getKey();
            String replacement = entry.getValue();
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeMap' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java
    }

    private static TreeRangeMap<Integer, String> getReflowReplacements(int columnLimit, final String input)
            throws FormatterException {
        JCTree.JCCompilationUnit unit = parse(input, /* allowStringFolding= */ false);
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeMap' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java
        }.scan(new TreePath(unit), null);

        TreeRangeMap<Integer, String> replacements = TreeRangeMap.create();
        for (TreePath path : toFix) {
            // Find the outermost contiguous enclosing concatenation expression
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeMap' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java
        }.scan(new TreePath(unit), null);

        TreeRangeMap<Integer, String> replacements = TreeRangeMap.create();
        for (TreePath path : toFix) {
            // Find the outermost contiguous enclosing concatenation expression
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java
        }.scan(new TreePath(unit), null);

        TreeRangeMap<Integer, String> replacements = TreeRangeMap.create();
        for (TreePath path : toFix) {
            // Find the outermost contiguous enclosing concatenation expression
```

### UnstableApiUsage
'put(com.google.common.collect.Range, V)' is declared in unstable class 'com.google.common.collect.TreeRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java
            // Get the original source text of the string literals, excluding `"` and `+`.
            ImmutableList<String> components = stringComponents(input, unit, flat);
            replacements.put(
                    Range.closedOpen(getStartPosition(flat.get(0)), getEndPosition(unit, getLast(flat))),
                    reflow(separator, columnLimit, trailing, components, first.get(), startColumn, fistLineCol));
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeMap' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java
        }

        TreeRangeMap<Integer, String> replacements = getReflowReplacements(columnLimit, input);
        String firstPass =
                formatter.formatSource(input, replacements.asMapOfRanges().keySet());
```

### UnstableApiUsage
'asMapOfRanges()' is declared in unstable class 'com.google.common.collect.TreeRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java
        TreeRangeMap<Integer, String> replacements = getReflowReplacements(columnLimit, input);
        String firstPass =
                formatter.formatSource(input, replacements.asMapOfRanges().keySet());

        if (!firstPass.equals(input)) {
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/InputMetadataBuilder.java`
#### Snippet
```java
public final class InputMetadataBuilder {
    private final Map<Integer, BlankLineWanted> blankLines = new HashMap<>(); // Info on blank lines.
    private final RangeSet<Integer> partialFormatRanges = TreeRangeSet.create();

    /**
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/InputMetadataBuilder.java`
#### Snippet
```java
public final class InputMetadataBuilder {
    private final Map<Integer, BlankLineWanted> blankLines = new HashMap<>(); // Info on blank lines.
    private final RangeSet<Integer> partialFormatRanges = TreeRangeSet.create();

    /**
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/InputMetadataBuilder.java`
#### Snippet
```java
public final class InputMetadataBuilder {
    private final Map<Integer, BlankLineWanted> blankLines = new HashMap<>(); // Info on blank lines.
    private final RangeSet<Integer> partialFormatRanges = TreeRangeSet.create();

    /**
```

### UnstableApiUsage
'add(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/InputMetadataBuilder.java`
#### Snippet
```java
        int lo = JavaOutput.startTok(start).getIndex();
        int hi = JavaOutput.endTok(end).getIndex();
        partialFormatRanges.add(Range.closed(lo, hi));
    }

```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/InputMetadataBuilder.java`
#### Snippet
```java
        return ImmutableInputMetadata.builder()
                .blankLines(ImmutableMap.copyOf(blankLines))
                .partialFormatRanges(ImmutableRangeSet.copyOf(partialFormatRanges))
                .build();
    }
```

### UnstableApiUsage
'copyOf(com.google.common.collect.RangeSet)' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/InputMetadataBuilder.java`
#### Snippet
```java
        return ImmutableInputMetadata.builder()
                .blankLines(ImmutableMap.copyOf(blankLines))
                .partialFormatRanges(ImmutableRangeSet.copyOf(partialFormatRanges))
                .build();
    }
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/RemoveUnusedImports.java`
#### Snippet
```java

    /** Construct replacements to fix unused imports. */
    private static RangeMap<Integer, String> buildReplacements(
            String contents,
            JCCompilationUnit unit,
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/RemoveUnusedImports.java`
#### Snippet
```java
            Set<String> usedNames,
            Multimap<String, Range<Integer>> usedInJavadoc) {
        RangeMap<Integer, String> replacements = TreeRangeMap.create();
        for (JCImport importTree : unit.getImports()) {
            String simpleName = getSimpleName(importTree);
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeMap' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/RemoveUnusedImports.java`
#### Snippet
```java
            Set<String> usedNames,
            Multimap<String, Range<Integer>> usedInJavadoc) {
        RangeMap<Integer, String> replacements = TreeRangeMap.create();
        for (JCImport importTree : unit.getImports()) {
            String simpleName = getSimpleName(importTree);
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
    public static class SingleFileDiff {
        private final Path path;
        private final RangeSet<Integer> lineRanges; // zero-indexed

        public SingleFileDiff(Path path, RangeSet<Integer> lineRanges) {
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java

    /** Converts zero-indexed, [closed, open) line ranges in the given source file to character ranges. */
    private static RangeSet<Integer> lineRangesToCharRanges(String input, RangeSet<Integer> lineRanges) {
        List<Integer> lines = new ArrayList<>();
        Iterators.addAll(lines, new LineOffsetIterator(input));
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java

    /** Converts zero-indexed, [closed, open) line ranges in the given source file to character ranges. */
    private static RangeSet<Integer> lineRangesToCharRanges(String input, RangeSet<Integer> lineRanges) {
        List<Integer> lines = new ArrayList<>();
        Iterators.addAll(lines, new LineOffsetIterator(input));
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
        lines.add(input.length() + 1);

        final RangeSet<Integer> characterRanges = TreeRangeSet.create();
        for (Range<Integer> lineRange :
                lineRanges.subRangeSet(Range.closedOpen(0, lines.size() - 1)).asRanges()) {
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
        lines.add(input.length() + 1);

        final RangeSet<Integer> characterRanges = TreeRangeSet.create();
        for (Range<Integer> lineRange :
                lineRanges.subRangeSet(Range.closedOpen(0, lines.size() - 1)).asRanges()) {
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
        lines.add(input.length() + 1);

        final RangeSet<Integer> characterRanges = TreeRangeSet.create();
        for (Range<Integer> lineRange :
                lineRanges.subRangeSet(Range.closedOpen(0, lines.size() - 1)).asRanges()) {
```

### UnstableApiUsage
'subRangeSet(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
        final RangeSet<Integer> characterRanges = TreeRangeSet.create();
        for (Range<Integer> lineRange :
                lineRanges.subRangeSet(Range.closedOpen(0, lines.size() - 1)).asRanges()) {
            int lineStart = lines.get(lineRange.lowerEndpoint());
            // Exclude the trailing newline. This isn't strictly necessary, but handling blank lines
```

### UnstableApiUsage
'asRanges()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
        final RangeSet<Integer> characterRanges = TreeRangeSet.create();
        for (Range<Integer> lineRange :
                lineRanges.subRangeSet(Range.closedOpen(0, lines.size() - 1)).asRanges()) {
            int lineStart = lines.get(lineRange.lowerEndpoint());
            // Exclude the trailing newline. This isn't strictly necessary, but handling blank lines
```

### UnstableApiUsage
'add(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
            int lineEnd = lines.get(lineRange.upperEndpoint()) - 1;
            Range<Integer> range = Range.closedOpen(lineStart, lineEnd);
            characterRanges.add(range);
        }
        return characterRanges;
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
                    Path path = Paths.get(filenameMatcher.group("filename"));

                    RangeSet<Integer> lineRanges = TreeRangeSet.create();
                    Matcher hunk = HUNK.matcher(singleFileDiff);
                    while (hunk.find()) {
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
                    Path path = Paths.get(filenameMatcher.group("filename"));

                    RangeSet<Integer> lineRanges = TreeRangeSet.create();
                    Matcher hunk = HUNK.matcher(singleFileDiff);
                    while (hunk.find()) {
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
                    Path path = Paths.get(filenameMatcher.group("filename"));

                    RangeSet<Integer> lineRanges = TreeRangeSet.create();
                    Matcher hunk = HUNK.matcher(singleFileDiff);
                    while (hunk.find()) {
```

### UnstableApiUsage
'add(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
                        Range<Integer> rangeZeroIndexed =
                                Range.closedOpen(firstLineOfHunk, firstLineOfHunk + hunkLength);
                        lineRanges.add(rangeZeroIndexed);
                    }

```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
        }

        RangeSet<Integer> charRanges = lineRangesToCharRanges(input, diff.lineRanges);

        try {
```

### UnstableApiUsage
'asRanges()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
        try {
            System.err.println("Formatting " + diff.path);
            ImmutableList<Replacement> replacements = formatter.getFormatReplacements(input, charRanges.asRanges());
            String output = applyReplacements(input, replacements);
            Files.write(diff.path, output.getBytes(UTF_8));
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
        private final RangeSet<Integer> lineRanges; // zero-indexed

        public SingleFileDiff(Path path, RangeSet<Integer> lineRanges) {
            this.path = path;
            this.lineRanges = lineRanges;
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/Formatter.java`
#### Snippet
```java
            throw new FormatterException(e.diagnostics());
        }
        RangeSet<Integer> tokenRangeSet = javaInput.characterRangesToTokenRanges(characterRanges);
        return javaOutput.getFormatReplacements(tokenRangeSet);
    }
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeMap' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ModifierOrderer.java`
#### Snippet
```java

    /** Applies replacements to the given string. */
    private static JavaInput applyReplacements(JavaInput javaInput, TreeRangeMap<Integer, String> replacementMap)
            throws FormatterException {
        // process in descending order so the replacement ranges aren't perturbed if any replacements
```

### UnstableApiUsage
'asDescendingMapOfRanges()' is declared in unstable class 'com.google.common.collect.TreeRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ModifierOrderer.java`
#### Snippet
```java
        // process in descending order so the replacement ranges aren't perturbed if any replacements
        // differ in size from the input
        Map<Range<Integer>, String> ranges = replacementMap.asDescendingMapOfRanges();
        if (ranges.isEmpty()) {
            return javaInput;
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ModifierOrderer.java`
#### Snippet
```java
            return javaInput;
        }
        RangeSet<Integer> tokenRanges = javaInput.characterRangesToTokenRanges(characterRanges);
        Iterator<? extends Token> it = javaInput.getTokens().iterator();
        TreeRangeMap<Integer, String> replacements = TreeRangeMap.create();
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeMap' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ModifierOrderer.java`
#### Snippet
```java
        RangeSet<Integer> tokenRanges = javaInput.characterRangesToTokenRanges(characterRanges);
        Iterator<? extends Token> it = javaInput.getTokens().iterator();
        TreeRangeMap<Integer, String> replacements = TreeRangeMap.create();
        while (it.hasNext()) {
            Token token = it.next();
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeMap' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ModifierOrderer.java`
#### Snippet
```java
        RangeSet<Integer> tokenRanges = javaInput.characterRangesToTokenRanges(characterRanges);
        Iterator<? extends Token> it = javaInput.getTokens().iterator();
        TreeRangeMap<Integer, String> replacements = TreeRangeMap.create();
        while (it.hasNext()) {
            Token token = it.next();
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ModifierOrderer.java`
#### Snippet
```java
        RangeSet<Integer> tokenRanges = javaInput.characterRangesToTokenRanges(characterRanges);
        Iterator<? extends Token> it = javaInput.getTokens().iterator();
        TreeRangeMap<Integer, String> replacements = TreeRangeMap.create();
        while (it.hasNext()) {
            Token token = it.next();
```

### UnstableApiUsage
'contains(C)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ModifierOrderer.java`
#### Snippet
```java
        while (it.hasNext()) {
            Token token = it.next();
            if (!tokenRanges.contains(token.getTok().getIndex())) {
                continue;
            }
```

### UnstableApiUsage
'put(com.google.common.collect.Range, V)' is declared in unstable class 'com.google.common.collect.TreeRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ModifierOrderer.java`
#### Snippet
```java
                    }
                }
                replacements.put(Range.closedOpen(begin, end), replacement.toString());
            }
        }
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/RemoveUnusedImports.java`
#### Snippet
```java
            Set<String> usedNames,
            Multimap<String, Range<Integer>> usedInJavadoc) {
        RangeMap<Integer, String> replacements = TreeRangeMap.create();
        for (JCImport importTree : unit.getImports()) {
            String simpleName = getSimpleName(importTree);
```

### UnstableApiUsage
'put(com.google.common.collect.Range, V)' is declared in unstable interface 'com.google.common.collect.RangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/RemoveUnusedImports.java`
#### Snippet
```java
                endPosition += sep.length();
            }
            replacements.put(Range.closedOpen(importTree.getStartPosition(), endPosition), "");
        }
        return replacements;
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/RemoveUnusedImports.java`
#### Snippet
```java

    /** Applies the replacements to the given source, and re-format any edited javadoc. */
    private static String applyReplacements(String source, RangeMap<Integer, String> replacements) {
        // save non-empty fixed ranges for reformatting after fixes are applied
        RangeSet<Integer> fixedRanges = TreeRangeSet.create();
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/RemoveUnusedImports.java`
#### Snippet
```java
    private static String applyReplacements(String source, RangeMap<Integer, String> replacements) {
        // save non-empty fixed ranges for reformatting after fixes are applied
        RangeSet<Integer> fixedRanges = TreeRangeSet.create();

        // Apply the fixes in increasing order, adjusting ranges to account for
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/RemoveUnusedImports.java`
#### Snippet
```java
    private static String applyReplacements(String source, RangeMap<Integer, String> replacements) {
        // save non-empty fixed ranges for reformatting after fixes are applied
        RangeSet<Integer> fixedRanges = TreeRangeSet.create();

        // Apply the fixes in increasing order, adjusting ranges to account for
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/RemoveUnusedImports.java`
#### Snippet
```java
    private static String applyReplacements(String source, RangeMap<Integer, String> replacements) {
        // save non-empty fixed ranges for reformatting after fixes are applied
        RangeSet<Integer> fixedRanges = TreeRangeSet.create();

        // Apply the fixes in increasing order, adjusting ranges to account for
```

### UnstableApiUsage
'asMapOfRanges()' is declared in unstable interface 'com.google.common.collect.RangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/RemoveUnusedImports.java`
#### Snippet
```java
        int offset = 0;
        for (Map.Entry<Range<Integer>, String> replacement :
                replacements.asMapOfRanges().entrySet()) {
            Range<Integer> range = replacement.getKey();
            String replaceWith = replacement.getValue();
```

### UnstableApiUsage
'add(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/RemoveUnusedImports.java`
#### Snippet
```java
            sb.replace(start, end, replaceWith);
            if (!replaceWith.isEmpty()) {
                fixedRanges.add(Range.closedOpen(start, end));
            }
            offset += replaceWith.length() - (range.upperEndpoint() - range.lowerEndpoint());
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/Utils.java`
#### Snippet
```java

    /** Converts zero-indexed, [closed, open) line ranges in the given source file to character ranges. */
    public static RangeSet<Integer> lineRangesToCharRanges(String input, RangeSet<Integer> lineRanges) {
        List<Integer> lines = new ArrayList<>();
        Iterators.addAll(lines, Newlines.lineOffsetIterator(input));
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/Utils.java`
#### Snippet
```java

    /** Converts zero-indexed, [closed, open) line ranges in the given source file to character ranges. */
    public static RangeSet<Integer> lineRangesToCharRanges(String input, RangeSet<Integer> lineRanges) {
        List<Integer> lines = new ArrayList<>();
        Iterators.addAll(lines, Newlines.lineOffsetIterator(input));
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/Utils.java`
#### Snippet
```java
        lines.add(input.length() + 1);

        final RangeSet<Integer> characterRanges = TreeRangeSet.create();
        for (Range<Integer> lineRange :
                lineRanges.subRangeSet(Range.closedOpen(0, lines.size() - 1)).asRanges()) {
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/Utils.java`
#### Snippet
```java
        lines.add(input.length() + 1);

        final RangeSet<Integer> characterRanges = TreeRangeSet.create();
        for (Range<Integer> lineRange :
                lineRanges.subRangeSet(Range.closedOpen(0, lines.size() - 1)).asRanges()) {
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/Utils.java`
#### Snippet
```java
        lines.add(input.length() + 1);

        final RangeSet<Integer> characterRanges = TreeRangeSet.create();
        for (Range<Integer> lineRange :
                lineRanges.subRangeSet(Range.closedOpen(0, lines.size() - 1)).asRanges()) {
```

### UnstableApiUsage
'subRangeSet(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/Utils.java`
#### Snippet
```java
        final RangeSet<Integer> characterRanges = TreeRangeSet.create();
        for (Range<Integer> lineRange :
                lineRanges.subRangeSet(Range.closedOpen(0, lines.size() - 1)).asRanges()) {
            int lineStart = lines.get(lineRange.lowerEndpoint());
            // Exclude the trailing newline. This isn't strictly necessary, but handling blank lines
```

### UnstableApiUsage
'asRanges()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/Utils.java`
#### Snippet
```java
        final RangeSet<Integer> characterRanges = TreeRangeSet.create();
        for (Range<Integer> lineRange :
                lineRanges.subRangeSet(Range.closedOpen(0, lines.size() - 1)).asRanges()) {
            int lineStart = lines.get(lineRange.lowerEndpoint());
            // Exclude the trailing newline. This isn't strictly necessary, but handling blank lines
```

### UnstableApiUsage
'add(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/Utils.java`
#### Snippet
```java
            int lineEnd = lines.get(lineRange.upperEndpoint()) - 1;
            Range<Integer> range = Range.closedOpen(lineStart, lineEnd);
            characterRanges.add(range);
        }
        return characterRanges;
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/InputMetadata.java`
#### Snippet
```java
     */
    @Default
    default ImmutableRangeSet<Integer> partialFormatRanges() {
        return ImmutableRangeSet.of();
    }
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/InputMetadata.java`
#### Snippet
```java
    @Default
    default ImmutableRangeSet<Integer> partialFormatRanges() {
        return ImmutableRangeSet.of();
    }
}
```

### UnstableApiUsage
'of()' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/InputMetadata.java`
#### Snippet
```java
    @Default
    default ImmutableRangeSet<Integer> partialFormatRanges() {
        return ImmutableRangeSet.of();
    }
}
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
     */
    @Override
    public ImmutableRangeMap<Integer, Token> getPositionTokenMap() {
        return positionTokenMap;
    }
```

### UnstableApiUsage
'subRangeMap(com.google.common.collect.Range)' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
        }
        ImmutableCollection<Token> enclosed = getPositionTokenMap()
                .subRangeMap(Range.closedOpen(offset, offset + length))
                .asMapOfRanges()
                .values();
```

### UnstableApiUsage
'asMapOfRanges()' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
        ImmutableCollection<Token> enclosed = getPositionTokenMap()
                .subRangeMap(Range.closedOpen(offset, offset + length))
                .asMapOfRanges()
                .values();
        if (enclosed.isEmpty()) {
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
    }

    public RangeSet<Integer> characterRangesToTokenRanges(Collection<Range<Integer>> characterRanges)
            throws FormatterException {
        RangeSet<Integer> tokenRangeSet = TreeRangeSet.create();
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
    public RangeSet<Integer> characterRangesToTokenRanges(Collection<Range<Integer>> characterRanges)
            throws FormatterException {
        RangeSet<Integer> tokenRangeSet = TreeRangeSet.create();
        for (Range<Integer> characterRange0 : characterRanges) {
            Range<Integer> characterRange = characterRange0.canonical(DiscreteDomain.integers());
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
    public RangeSet<Integer> characterRangesToTokenRanges(Collection<Range<Integer>> characterRanges)
            throws FormatterException {
        RangeSet<Integer> tokenRangeSet = TreeRangeSet.create();
        for (Range<Integer> characterRange0 : characterRanges) {
            Range<Integer> characterRange = characterRange0.canonical(DiscreteDomain.integers());
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
    public RangeSet<Integer> characterRangesToTokenRanges(Collection<Range<Integer>> characterRanges)
            throws FormatterException {
        RangeSet<Integer> tokenRangeSet = TreeRangeSet.create();
        for (Range<Integer> characterRange0 : characterRanges) {
            Range<Integer> characterRange = characterRange0.canonical(DiscreteDomain.integers());
```

### UnstableApiUsage
'add(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
        for (Range<Integer> characterRange0 : characterRanges) {
            Range<Integer> characterRange = characterRange0.canonical(DiscreteDomain.integers());
            tokenRangeSet.add(characterRangeToTokenRange(
                    characterRange.lowerEndpoint(), characterRange.upperEndpoint() - characterRange.lowerEndpoint()));
        }
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
        positionToColumnMap = makePositionToColumnMap(toks);
        tokens = buildTokens(toks);
        ImmutableRangeMap.Builder<Integer, Token> tokenLocations = ImmutableRangeMap.builder();
        for (Token token : tokens) {
            Input.Tok end = JavaOutput.endTok(token);
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap.Builder' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
        positionToColumnMap = makePositionToColumnMap(toks);
        tokens = buildTokens(toks);
        ImmutableRangeMap.Builder<Integer, Token> tokenLocations = ImmutableRangeMap.builder();
        for (Token token : tokens) {
            Input.Tok end = JavaOutput.endTok(token);
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
        positionToColumnMap = makePositionToColumnMap(toks);
        tokens = buildTokens(toks);
        ImmutableRangeMap.Builder<Integer, Token> tokenLocations = ImmutableRangeMap.builder();
        for (Token token : tokens) {
            Input.Tok end = JavaOutput.endTok(token);
```

### UnstableApiUsage
'builder()' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
        positionToColumnMap = makePositionToColumnMap(toks);
        tokens = buildTokens(toks);
        ImmutableRangeMap.Builder<Integer, Token> tokenLocations = ImmutableRangeMap.builder();
        for (Token token : tokens) {
            Input.Tok end = JavaOutput.endTok(token);
```

### UnstableApiUsage
'put(com.google.common.collect.Range, V)' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
                upper += end.length() - 1;
            }
            tokenLocations.put(Range.closed(JavaOutput.startTok(token).getPosition(), upper), token);
        }
        positionTokenMap = tokenLocations.build();
```

### UnstableApiUsage
'build()' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
            tokenLocations.put(Range.closed(JavaOutput.startTok(token).getPosition(), upper), token);
        }
        positionTokenMap = tokenLocations.build();

        // adjust kN for EOF
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
    private final ImmutableMap<Integer, Integer> positionToColumnMap; // Map Tok position to column.
    private final ImmutableList<Token> tokens; // The Tokens for this input.
    private final ImmutableRangeMap<Integer, Token> positionTokenMap; // Map position to Token.

    /** Map from Tok index to the associated Token. */
```

### UnstableApiUsage
'get(K)' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java

    private static Optional<? extends Input.Token> getNextToken(Input input, int position) {
        return Optional.ofNullable(input.getPositionTokenMap().get(position));
    }

```

### UnstableApiUsage
'get(K)' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
    private boolean hasJavaDoc(Tree bodyDeclaration) {
        int position = ((JCTree) bodyDeclaration).getStartPosition();
        Input.Token token = builder.getInput().getPositionTokenMap().get(position);
        if (token != null) {
            for (Input.Tok tok : token.getToksBefore()) {
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap' is marked unstable with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
    /** How many lines does this node take up in the input. Returns at least 1. */
    int lineSpan(Tree node) {
        ImmutableRangeMap<Integer, ? extends Input.Token> positionTokenMap =
                builder.getInput().getPositionTokenMap();

```

### UnstableApiUsage
'get(K)' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
        // Thus, we go back until we find a "real" last token.
        // If all tokens down from endPosition are null, then we are guaranteed stop at startPosition.
        while (endPosition > startPosition && positionTokenMap.get(endPosition) == null) {
            endPosition--;
        }
```

### UnstableApiUsage
'get(K)' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            endPosition--;
        }
        Input.Token startToken = positionTokenMap.get(startPosition);
        Input.Token endToken = positionTokenMap.get(endPosition);
        return lineNumberAt(endToken) - lineNumberAt(startToken) + 1;
```

### UnstableApiUsage
'get(K)' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
        }
        Input.Token startToken = positionTokenMap.get(startPosition);
        Input.Token endToken = positionTokenMap.get(endPosition);
        return lineNumberAt(endToken) - lineNumberAt(startToken) + 1;
    }
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/LevelDelimitedFlatValueDocVisitor.java`
#### Snippet
```java
                new StringBuilder().append("⏎").append(doc.getFlat().isEmpty() ? "" : "(" + doc.getFlat() + ")");
        if (!doc.plusIndent().equals(Indent.Const.ZERO)) {
            sb.append(" +" + doc.evalPlusIndent(state));
        }
        return sb.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/LevelDelimitedFlatValueDocVisitor.java`
#### Snippet
```java
        StringBuilder builder = new StringBuilder();
        builder.append("❰");
        level.getDebugName().ifPresent(name -> builder.append(" \"" + name + "\""));
        if (!level.getPlusIndent().equals(Indent.Const.ZERO)) {
            builder.append(" +" + level.getPlusIndent().eval(state));
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/LevelDelimitedFlatValueDocVisitor.java`
#### Snippet
```java
        level.getDebugName().ifPresent(name -> builder.append(" \"" + name + "\""));
        if (!level.getPlusIndent().equals(Indent.Const.ZERO)) {
            builder.append(" +" + level.getPlusIndent().eval(state));
        }
        BreakBehaviours.caseOf(level.getBreakBehaviour()).breakThisLevel_(null).otherwise(() -> {
```

