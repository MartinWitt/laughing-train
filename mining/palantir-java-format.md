# palantir-java-format 
 
# Bad smells
I found 189 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalUsedAsFieldOrParameterType | 36 | false |
| NullableProblems | 32 | false |
| DataFlowIssue | 16 | false |
| JavadocReference | 12 | false |
| OptionalGetWithoutIsPresent | 10 | false |
| Deprecation | 9 | false |
| JavadocLinkAsPlainText | 7 | false |
| SimplifyOptionalCallChains | 7 | false |
| UNCHECKED_WARNING | 6 | false |
| UnnecessarySemicolon | 4 | false |
| SwitchStatementWithTooFewBranches | 4 | false |
| ConstantValue | 4 | false |
| EmptyStatementBody | 3 | false |
| StaticInitializerReferencesSubClass | 3 | false |
| RegExpRedundantEscape | 3 | false |
| DuplicatedCode | 3 | false |
| AutoCloseableResource | 3 | false |
| JavadocDeclaration | 3 | false |
| UnusedAssignment | 3 | false |
| StringConcatenationInsideStringBufferAppend | 3 | false |
| OptionalIsPresent | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| CommentedOutCode | 2 | false |
| TrivialIf | 2 | false |
| BlockingMethodInNonBlockingContext | 2 | false |
| FieldMayBeFinal | 2 | false |
| UnnecessaryLabelOnBreakStatement | 1 | false |
| JavaReflectionMemberAccess | 1 | false |
| RedundantMethodOverride | 1 | false |
| UnnecessaryContinue | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| WriteOnlyObject | 1 | false |
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/PalantirCodeStyleManager.java`
#### Snippet
```java
    public void reformatText(PsiFile file, Collection ranges) throws IncorrectOperationException {
        if (overrideFormatterForFile(file)) {
            formatInternal(file, ranges);
        } else {
            super.reformatText(file, ranges);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/PalantirCodeStyleManager.java`
#### Snippet
```java
    public void reformatTextWithContext(PsiFile file, Collection ranges) {
        if (overrideFormatterForFile(file)) {
            formatInternal(file, ranges);
        } else {
            super.reformatTextWithContext(file, ranges);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/java14/Java14InputAstVisitor.java`
#### Snippet
```java
        boolean isDefault;
        if (CASE_TREE_GET_LABELS != null) {
            labels = (List<? extends Tree>) invoke(CASE_TREE_GET_LABELS, node);
            isDefault = labels.size() == 1
                    && Iterables.getOnlyElement(labels).getKind().name().equals("DEFAULT_CASE_LABEL");
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/java14/Java14InputAstVisitor.java`
#### Snippet
```java
    protected List<? extends Tree> getPermitsClause(ClassTree node) {
        if (CLASS_TREE_GET_PERMITS_CLAUSE != null) {
            return (List<? extends Tree>) invoke(CLASS_TREE_GET_PERMITS_CLAUSE, node);
        } else {
            // Java < 15
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java
    @Override
    public void reformatText(PsiFile file, Collection ranges) throws IncorrectOperationException {
        delegate.reformatText(file, ranges);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java
    @Override
    public void reformatTextWithContext(PsiFile file, Collection ranges) throws IncorrectOperationException {
        delegate.reformatTextWithContext(file, ranges);
    }

```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `ImmutableOpenOp.Builder`
in `palantir-java-format/src/main/java/com/palantir/javaformat/OpenOp.java`
#### Snippet
```java
    }

    /** @see ImmutableOpenOp.Builder#Builder() */
    public static Builder builder() {
        return new Builder();
```

### JavadocReference
Cannot resolve symbol `Builder()`
in `palantir-java-format/src/main/java/com/palantir/javaformat/OpenOp.java`
#### Snippet
```java
    }

    /** @see ImmutableOpenOp.Builder#Builder() */
    public static Builder builder() {
        return new Builder();
```

### JavadocReference
Cannot resolve symbol `Doc.Level`
in `palantir-java-format/src/main/java/com/palantir/javaformat/CloseOp.java`
#### Snippet
```java
 * A {@code CloseOp} closes a level. It is an {@link Op} in the sequence of {@link Op}s generated by {@link OpsBuilder}.
 * When the sequence is turned into a {@link Doc} by {@link DocBuilder}, ranges delimited by
 * {@link OpenOp}-{@code CloseOp} pairs turn into nested {@link Doc.Level}s.
 */
public enum CloseOp implements Op {
```

### JavadocReference
Cannot resolve symbol `Doc.Level`
in `palantir-java-format/src/main/java/com/palantir/javaformat/Op.java`
#### Snippet
```java
/**
 * An {@code Op} is a member of the sequence of formatting operations emitted by {@link OpsBuilder} and transformed by
 * {@link DocBuilder} into a {@link Doc}. Leaf subclasses of {@link Doc} implement {@code Op}; {@link Doc.Level} is the
 * only non-leaf, and is represented by paired {@link OpenOp}-{@link CloseOp} {@code Op}s.
 */
```

### JavadocReference
Symbol `TokenKind` is inaccessible from here
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java

    /**
     * {@link TokenKind}s that indicate the start of a type definition. We use this to avoid scanning the whole file,
     * since we know that imports must precede any type definition.
     */
```

### JavadocReference
Symbol `com.palantir.javaformat.OpsBuilder.BlankLineWanted.ConditionalBlankLine` is inaccessible from here
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/BreakTag.java`
#### Snippet
```java
 * Unique identifier for a break. A BreakTag can correspond to one or more {@link Break breaks}, and the state of the
 * BreakTag is determined by whether any of the breaks were taken. Then, conditional structures like
 * {@link com.palantir.javaformat.OpsBuilder.BlankLineWanted.ConditionalBlankLine} and
 * {@link com.palantir.javaformat.Indent.If} behave differently based on whether this BreakTag was 'broken' or not.
 *
```

### JavadocReference
Symbol `JavaTokenizer` is inaccessible from here
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavacTokens.java`
#### Snippet
```java
    }

    /** A {@link JavaTokenizer} that saves comments. */
    static class CommentSavingTokenizer extends JavaTokenizer {
        CommentSavingTokenizer(ScannerFactory fac, char[] buffer, int length) {
```

### JavadocReference
Symbol `Comment` is inaccessible from here
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavacTokens.java`
#### Snippet
```java
    }

    /** A {@link Comment} that saves its text and start position. */
    static class CommentWithTextAndPosition implements Comment {

```

### JavadocReference
Cannot resolve symbol `BreakBehaviours`
in `palantir-java-format/src/main/java/com/palantir/javaformat/PartialInlineability.java`
#### Snippet
```java
/**
 * What are the conditions for a level to be partially inlineable. Partial inlining refers to the behaviour of
 * {@link BreakBehaviours#breakOnlyIfInnerLevelsThenFitOnOneLine} where a level is too large to fit on the current line,
 * but a prefix thereof is partially inlined onto the current line.
 *
```

### JavadocReference
Cannot resolve symbol `breakOnlyIfInnerLevelsThenFitOnOneLine`
in `palantir-java-format/src/main/java/com/palantir/javaformat/PartialInlineability.java`
#### Snippet
```java
/**
 * What are the conditions for a level to be partially inlineable. Partial inlining refers to the behaviour of
 * {@link BreakBehaviours#breakOnlyIfInnerLevelsThenFitOnOneLine} where a level is too large to fit on the current line,
 * but a prefix thereof is partially inlined onto the current line.
 *
```

### JavadocReference
Cannot resolve symbol `StartsWithBreakVisitor`
in `palantir-java-format/src/main/java/com/palantir/javaformat/PartialInlineability.java`
#### Snippet
```java
     * Partially inlineable if the <em>first</em> inner level of this level fits on the current line.
     *
     * <p>This assumes that the next Doc after that starts with a {@link Break} (see {@link StartsWithBreakVisitor}) and
     * makes sense in contexts like {@link JavaInputAstVisitor#visitDotWithPrefix} where we want to treat first doc (the
     * longest prefix) as a single entity to be fit onto the same line.
```

### JavadocReference
Symbol `visitDotWithPrefix` is inaccessible from here
in `palantir-java-format/src/main/java/com/palantir/javaformat/PartialInlineability.java`
#### Snippet
```java
     *
     * <p>This assumes that the next Doc after that starts with a {@link Break} (see {@link StartsWithBreakVisitor}) and
     * makes sense in contexts like {@link JavaInputAstVisitor#visitDotWithPrefix} where we want to treat first doc (the
     * longest prefix) as a single entity to be fit onto the same line.
     */
```

## RuleId[id=UnnecessarySemicolon]
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
in `palantir-java-format/src/main/java/com/palantir/javaformat/doc/Token.java`
#### Snippet
```java
    public enum RealOrImaginary {
        REAL,
        IMAGINARY;
    }

```

## RuleId[id=DataFlowIssue]
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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/javadoc/JavadocWriter.java`
#### Snippet
```java
        postWriteModifiedContinuingListCount.reset();

        if (!wroteAnythingSignificant) {
            // Javadoc consists solely of tags. This is frowned upon in general but OK for @Overrides.
        } else if (!continuingFooterTag) {
```

### EmptyStatementBody
`if` statement has empty body
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java
            int start = 0;
            for (int idx = 0; idx < text.length(); idx++) {
                if (CharMatcher.whitespace().matches(text.charAt(idx))) {
                    // continue below
                } else if (hasEscapedWhitespaceAt(text, idx) != -1) {
```

### EmptyStatementBody
`if` statement has empty body
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/StringWrapper.java`
#### Snippet
```java
                if (CharMatcher.whitespace().matches(text.charAt(idx))) {
                    // continue below
                } else if (hasEscapedWhitespaceAt(text, idx) != -1) {
                    // continue below
                } else if (hasEscapedNewlineAt(text, idx) != -1) {
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

## RuleId[id=UnnecessaryLabelOnBreakStatement]
### UnnecessaryLabelOnBreakStatement
Unnecessary label `OUTER` on break statement
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            }
            if (isArray) {
                break OUTER;
            }
        }
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

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
                }
                if (toks.get(k).isJavadocComment()) {
                    switch (tok.getText()) {
                        case ";":
                            break OUTER;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/Formatter.java`
#### Snippet
```java
            return false;
        }
        switch (input.getCode()) {
            case "compiler.err.invalid.meth.decl.ret.type.req":
                // accept constructor-like method declarations that don't match the name of their
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
        Deque<ExpressionTree> indices = getArrayIndices(expression);
        expression = getArrayBase(expression);
        switch (expression.getKind()) {
            case METHOD_INVOCATION:
                // Note: we don't BREAK_HERE because we want to make sure that the last argument is actually
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            AllowTrailingBlankLine allowTrailingBlank) {
        sync(node);
        switch (node.getKind()) {
            case BLOCK:
                builder.space();
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
        List<Replacement> replacements = new ArrayList<>(replacementsCollection);
        replacements.sort(comparing((Replacement r) -> r.getReplaceRange().lowerEndpoint())
                .reversed());
        StringBuilder writer = new StringBuilder(input);
        for (Replacement replacement : replacements) {
            writer.replace(
                    replacement.getReplaceRange().lowerEndpoint(),
                    replacement.getReplaceRange().upperEndpoint(),
                    replacement.getReplacementString());
        }
        return writer.toString();
```

### DuplicatedCode
Duplicated code
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/FormatDiff.java`
#### Snippet
```java
        lines.add(input.length() + 1);

        final RangeSet<Integer> characterRanges = TreeRangeSet.create();
        for (Range<Integer> lineRange :
                lineRanges.subRangeSet(Range.closedOpen(0, lines.size() - 1)).asRanges()) {
            int lineStart = lines.get(lineRange.lowerEndpoint());
            // Exclude the trailing newline. This isn't strictly necessary, but handling blank lines
            // as empty ranges is convenient.
            int lineEnd = lines.get(lineRange.upperEndpoint()) - 1;
            Range<Integer> range = Range.closedOpen(lineStart, lineEnd);
            characterRanges.add(range);
        }
        return characterRanges;
```

### DuplicatedCode
Duplicated code
in `gradle-palantir-java-format/src/main/java/com/palantir/javaformat/gradle/LineOffsetIterator.java`
#### Snippet
```java
        for (; idx < input.length(); idx++) {
            char c = input.charAt(idx);
            switch (c) {
                case '\r':
                    if (idx + 1 < input.length() && input.charAt(idx + 1) == '\n') {
                        idx++;
                    }
                    // falls through
                case '\n':
                    idx++;
                    curr = idx;
                    return;
                default:
                    break;
            }
        }
        curr = -1;
```

## RuleId[id=Deprecation]
### Deprecation
'com.intellij.openapi.fileTypes.StdFileTypes' is deprecated
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/PalantirCodeStyleManager.java`
#### Snippet
```java
    /** Return whether or not this formatter can handle formatting the given file. */
    private boolean overrideFormatterForFile(PsiFile file) {
        return StdFileTypes.JAVA.equals(file.getFileType())
                && PalantirJavaFormatSettings.getInstance(getProject()).isEnabled();
    }
```

### Deprecation
'JAVA' is deprecated
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/PalantirCodeStyleManager.java`
#### Snippet
```java
    /** Return whether or not this formatter can handle formatting the given file. */
    private boolean overrideFormatterForFile(PsiFile file) {
        return StdFileTypes.JAVA.equals(file.getFileType())
                && PalantirJavaFormatSettings.getInstance(getProject()).isEnabled();
    }
```

### Deprecation
'getPlugin(com.intellij.openapi.extensions.@org.jetbrains.annotations.Nullable PluginId)' is deprecated
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/PalantirCodeStyleManager.java`
#### Snippet
```java
    private static final String PLUGIN_ID = "palantir-java-format";
    static final IdeaPluginDescriptor PLUGIN = Preconditions.checkNotNull(
            PluginManager.getPlugin(PluginId.getId(PLUGIN_ID)), "Couldn't find our own plugin: %s", PLUGIN_ID);

    private final FormatterProvider formatterProvider = new FormatterProvider();
```

### Deprecation
'getPath()' is deprecated
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/FormatterProvider.java`
#### Snippet
```java
    private static List<Path> getBundledImplementationUrls() {
        // Load from the jars bundled with the plugin.
        Path implDir = PalantirCodeStyleManager.PLUGIN.getPath().toPath().resolve("impl");
        log.debug("Using palantir-java-format implementation bundled with plugin: {}", implDir);
        return listDirAsUrlsUnchecked(implDir);
```

### Deprecation
'groovy.util.XmlParser' is deprecated
in `gradle-palantir-java-format/src/main/groovy/com/palantir/javaformat/gradle/PalantirJavaFormatIdeaPlugin.java`
#### Snippet
```java
        if (configurationFile.isFile()) {
            try {
                rootNode = new XmlParser().parse(configurationFile);
            } catch (IOException | SAXException | ParserConfigurationException e) {
                throw new RuntimeException("Couldn't parse existing configuration file: " + configurationFile, e);
```

### Deprecation
'groovy.util.XmlNodePrinter' is deprecated
in `gradle-palantir-java-format/src/main/groovy/com/palantir/javaformat/gradle/PalantirJavaFormatIdeaPlugin.java`
#### Snippet
```java
        try (BufferedWriter writer = Files.newWriter(configurationFile, Charset.defaultCharset());
                PrintWriter printWriter = new PrintWriter(writer)) {
            XmlNodePrinter nodePrinter = new XmlNodePrinter(printWriter);
            nodePrinter.setPreserveWhitespace(true);
            nodePrinter.print(rootNode);
```

### Deprecation
'groovy.util.XmlNodePrinter' is deprecated
in `gradle-palantir-java-format/src/main/groovy/com/palantir/javaformat/gradle/PalantirJavaFormatIdeaPlugin.java`
#### Snippet
```java
        try (BufferedWriter writer = Files.newWriter(configurationFile, Charset.defaultCharset());
                PrintWriter printWriter = new PrintWriter(writer)) {
            XmlNodePrinter nodePrinter = new XmlNodePrinter(printWriter);
            nodePrinter.setPreserveWhitespace(true);
            nodePrinter.print(rootNode);
```

### Deprecation
'getExpression()' is deprecated
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
        markForPartialFormat();
        builder.forcedBreak();
        if (node.getExpression() == null) {
            token("default", plusTwo);
            token(":");
```

### Deprecation
'getExpression()' is deprecated
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            token("case", plusTwo);
            builder.space();
            scan(node.getExpression(), null);
            token(":");
        }
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/PalantirJavaFormatSettings.java`
#### Snippet
```java

    @Override
    public void loadState(State state) {
        this.state = state;
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public void reformatText(PsiFile file, Collection ranges) throws IncorrectOperationException {
        delegate.reformatText(file, ranges);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public void reformatText(PsiFile file, Collection ranges) throws IncorrectOperationException {
        delegate.reformatText(file, ranges);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public void reformatText(PsiFile file, int startOffset, int endOffset) throws IncorrectOperationException {
        delegate.reformatText(file, startOffset, endOffset);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java
    @Override
    @Nullable
    public String getLineIndent(PsiFile file, int offset, FormattingMode mode) {
        return delegate.getLineIndent(file, offset, mode);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public boolean isLineToBeIndented(PsiFile file, int offset) {
        return delegate.isLineToBeIndented(file, offset);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public DocCommentSettings getDocCommentSettings(PsiFile file) {
        return delegate.getDocCommentSettings(file);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public DocCommentSettings getDocCommentSettings(PsiFile file) {
        return delegate.getDocCommentSettings(file);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public Project getProject() {
        return delegate.getProject();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public void scheduleIndentAdjustment(Document document, int offset) {
        delegate.scheduleIndentAdjustment(document, offset);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java
    @Override
    public PsiElement reformatRange(
            PsiElement element, int startOffset, int endOffset, boolean canChangeWhiteSpacesOnly)
            throws IncorrectOperationException {
        return delegate.reformatRange(element, startOffset, endOffset, canChangeWhiteSpacesOnly);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public PsiElement reformat(PsiElement element, boolean canChangeWhiteSpacesOnly)
            throws IncorrectOperationException {
        return delegate.reformat(element, canChangeWhiteSpacesOnly);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public PsiElement reformat(PsiElement element, boolean canChangeWhiteSpacesOnly)
            throws IncorrectOperationException {
        return delegate.reformat(element, canChangeWhiteSpacesOnly);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public void reformatNewlyAddedElement(ASTNode parent, ASTNode addedElement) throws IncorrectOperationException {
        delegate.reformatNewlyAddedElement(parent, addedElement);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public void reformatNewlyAddedElement(ASTNode parent, ASTNode addedElement) throws IncorrectOperationException {
        delegate.reformatNewlyAddedElement(parent, addedElement);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java
    @Override
    @Nullable
    public String getLineIndent(Document document, int offset) {
        return delegate.getLineIndent(document, offset);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public int adjustLineIndent(PsiFile file, int offset) throws IncorrectOperationException {
        return delegate.adjustLineIndent(file, offset);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public int adjustLineIndent(Document document, int offset) {
        return delegate.adjustLineIndent(document, offset);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public int getMinLineFeeds(PsiFile file, int offset) {
        return delegate.getMinLineFeeds(file, offset);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public void runWithDocCommentFormattingDisabled(PsiFile file, Runnable runnable) {
        delegate.runWithDocCommentFormattingDisabled(file, runnable);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public void runWithDocCommentFormattingDisabled(PsiFile file, Runnable runnable) {
        delegate.runWithDocCommentFormattingDisabled(file, runnable);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public void reformatTextWithContext(PsiFile psiFile, ChangedRangesInfo changedRangesInfo)
            throws IncorrectOperationException {
        delegate.reformatTextWithContext(psiFile, changedRangesInfo);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public void reformatTextWithContext(PsiFile psiFile, ChangedRangesInfo changedRangesInfo)
            throws IncorrectOperationException {
        delegate.reformatTextWithContext(psiFile, changedRangesInfo);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public int adjustLineIndent(final Document document, final int offset, FormattingMode mode)
            throws IncorrectOperationException {
        if (delegate instanceof FormattingModeAwareIndentAdjuster) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java
    @Override
    @Nullable
    public String getLineIndent(PsiFile file, int offset) {
        return delegate.getLineIndent(file, offset);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public void reformatTextWithContext(PsiFile file, Collection ranges) throws IncorrectOperationException {
        delegate.reformatTextWithContext(file, ranges);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public void reformatTextWithContext(PsiFile file, Collection ranges) throws IncorrectOperationException {
        delegate.reformatTextWithContext(file, ranges);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public PsiElement reformatRange(PsiElement element, int startOffset, int endOffset)
            throws IncorrectOperationException {
        return delegate.reformatRange(element, startOffset, endOffset);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public int getSpacing(PsiFile file, int offset) {
        return delegate.getSpacing(file, offset);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public void adjustLineIndent(PsiFile file, TextRange rangeToAdjust) throws IncorrectOperationException {
        delegate.adjustLineIndent(file, rangeToAdjust);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public PsiElement reformat(PsiElement element) throws IncorrectOperationException {
        return delegate.reformat(element);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java

    @Override
    public PsiElement reformat(PsiElement element) throws IncorrectOperationException {
        return delegate.reformat(element);
    }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/FormatterProvider.java`
#### Snippet
```java
     * bootstrapping formatter.
     * Separately, starting from 2022.2 (branch number '222'), Intellij now runs with JDK 17 which also requires the
     * bootstrapping formatter. See https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html for
     * how the build number is formatted.
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java
    /**
     * A {@link Comparator} that orders {@link Import}s by Google Style, defined at
     * https://google.github.io/styleguide/javaguide.html#s3.3.3-import-ordering-and-spacing.
     */
    private static final Comparator<Import> GOOGLE_IMPORT_COMPARATOR =
```

### JavadocLinkAsPlainText
Link specified as plain text
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java
    /**
     * A {@link Comparator} that orders {@link Import}s by AOSP Style, defined at
     * https://source.android.com/setup/contribute/code-style#order-import-statements and implemented in IntelliJ at
     * https://android.googlesource.com/platform/development/+/master/ide/intellij/codestyles/AndroidStyle.xml.
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/ImportOrderer.java`
#### Snippet
```java
     * A {@link Comparator} that orders {@link Import}s by AOSP Style, defined at
     * https://source.android.com/setup/contribute/code-style#order-import-statements and implemented in IntelliJ at
     * https://android.googlesource.com/platform/development/+/master/ide/intellij/codestyles/AndroidStyle.xml.
     */
    private static final Comparator<Import> AOSP_IMPORT_COMPARATOR = Comparator.comparing(Import::isStatic, trueFirst())
```

### JavadocLinkAsPlainText
Link specified as plain text
in `palantir-java-format/src/main/java/com/palantir/javaformat/BreakBehaviour.java`
#### Snippet
```java

    /**
     * This is gross but just wanted to get something working. See https://github.com/derive4j/derive4j/issues/51 for a
     * potential better implementation.
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java
 * inherited automatically with a reasonable default implementation.
 *
 * The https://github.com/JetBrains/intellij-community/commit/2d5740176cc9206db2d5ab5d8f67cec74b85a017
 * added a CodeManager#scheduleReformatWhenSettingsComputed(PsiFile) method in idea/202.5103.13 where the
 * default implementation throws an UnsupportedOperationException.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/CodeStyleManagerDecorator.java`
#### Snippet
```java
 * added a CodeManager#scheduleReformatWhenSettingsComputed(PsiFile) method in idea/202.5103.13 where the
 * default implementation throws an UnsupportedOperationException.
 * See https://youtrack.jetbrains.com/issue/IDEA-244645 for more details.
 */
@SuppressWarnings("deprecation")
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/RemoveUnusedImports.java`
#### Snippet
```java
            return false;
        }
        if (usedInJavadoc.containsKey(simpleName)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInputAstVisitor.java`
#### Snippet
```java
            return false;
        }
        if (!operatorName(node).startsWith(operatorName)) {
            return false;
        }
```

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/PalantirJavaFormatSettings.java`
#### Snippet
```java
                        if (jar.getEntry("META-INF/services/" + FormatterService.class.getName()) != null) {
                            String implementationVersion =
                                    jar.getManifest().getMainAttributes().getValue("Implementation-Version");
                            return Stream.of(implementationVersion);
                        }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/FormatterProvider.java`
#### Snippet
```java

    private static List<Path> listDirAsUrlsUnchecked(Path dir) {
        try (Stream<Path> list = Files.list(dir)) {
            return list.collect(Collectors.toList());
        } catch (IOException e) {
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
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
`Optional`> used as type for field 'implementationClassPath'
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/PalantirJavaFormatSettings.java`
#### Snippet
```java

        private EnabledState enabled = EnabledState.UNKNOWN;
        private Optional<List<URI>> implementationClassPath = Optional.empty();

        public JavaFormatterOptions.Style style = JavaFormatterOptions.Style.PALANTIR;
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

    private static ImmutableList<Op> forceBreakList(Optional<BreakTag> breakTag) {
        return ImmutableList.of(Break.make(FillMode.FORCED, "", Indent.Const.ZERO, breakTag));
    }
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
            ModifiersTree modifiersTree,
            Direction annotationsDirection,
            Optional<BreakTag> declarationAnnotationBreak) {
        return visitModifiers(modifiersTree.getAnnotations(), annotationsDirection, declarationAnnotationBreak);
    }
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

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `disposeUIResources()` is identical to its super method
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/PalantirJavaFormatConfigurable.java`
#### Snippet
```java

    @Override
    public void disposeUIResources() {}

    private static String getFormatterVersionText(PalantirJavaFormatSettings settings) {
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'JarFile' used without 'try'-with-resources statement
in `idea-plugin/src/main/java/com/palantir/javaformat/intellij/PalantirJavaFormatSettings.java`
#### Snippet
```java
                .flatMap(uri -> {
                    try {
                        JarFile jar = new JarFile(uri.getPath());
                        // Identify the implementation jar by the service it produces.
                        if (jar.getEntry("META-INF/services/" + FormatterService.class.getName()) != null) {
```

### AutoCloseableResource
'JavacFileManager' used without 'try'-with-resources statement
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
        Context context = new Context();
        Options.instance(context).put("--enable-preview", "true");
        new JavacFileManager(context, true, UTF_8);
        DiagnosticCollector<JavaFileObject> diagnosticCollector = new DiagnosticCollector<>();
        context.put(DiagnosticListener.class, diagnosticCollector);
```

### AutoCloseableResource
'JavacFileManager' used without 'try'-with-resources statement
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/Formatter.java`
#### Snippet
```java
        Options.instance(context).put("--enable-preview", "true");
        JCCompilationUnit unit;
        JavacFileManager fileManager = new JavacFileManager(context, true, UTF_8);
        try {
            fileManager.setLocation(StandardLocation.PLATFORM_CLASS_PATH, ImmutableList.of());
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
                || Double.isInfinite(breakWidth)
                || !tryToFitOnOneLine(maxWidth, state.withColumn(state.column() + (int) breakWidth), split)
                        .isPresent();

        if (optBreakDoc.isPresent()) {
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
        int innerLevelIndex = docs.indexOf(innerLevel);
        List<Doc> leadingDocs = docs.subList(0, innerLevelIndex);
        if (!tryToFitOnOneLine(maxWidth, state, leadingDocs).isPresent()) {
            return Optional.empty();
        }
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param state` tag description is missing
in `palantir-java-format/src/main/java/com/palantir/javaformat/Output.java`
#### Snippet
```java
     * Output a string.
     *
     * @param state
     * @param text the string
     * @param range the {@link Range} corresponding to the string
```

### JavadocDeclaration
Wrong tag ``code```
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/javadoc/JavadocLexer.java`
#### Snippet
```java

    /**
     * Adjust indentation inside `<pre>{@code` blocks.
     *
     * <p>Also trim leading and trailing blank lines, and move the trailing `}` to its own line.
```

### JavadocDeclaration
`@throws` tag description is missing
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/JavaInput.java`
#### Snippet
```java
     * @param length the length in characters
     * @return the {@code 0}-based {@link Range} of tokens
     * @throws FormatterException
     */
    Range<Integer> characterRangeToTokenRange(int offset, int length) throws FormatterException {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `diagnostics` may be 'final'
in `palantir-java-format-spi/src/main/java/com/palantir/javaformat/java/FormatterException.java`
#### Snippet
```java
public final class FormatterException extends Exception {

    private ImmutableList<FormatterDiagnostic> diagnostics;

    public FormatterException(String message) {
```

### FieldMayBeFinal
Field `publicDir` may be 'final'
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/DebugRenderer.java`
#### Snippet
```java
public class DebugRenderer {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static Path publicDir = Paths.get("../debugger/public");

    static Path getOutputFile() {
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

## RuleId[id=UnusedAssignment]
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

## RuleId[id=ConstantValue]
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
                case ".":
                    if (!builder.peekToken().get().equals(".")
                            || !builder.peekToken(1).get().equals(".")) {
                        return;
                    }
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
            String name = node.getName().toString();
            if (name.equals("<init>")) {
                name = builder.peekToken().get();
            }
            token(name);
```

## RuleId[id=WriteOnlyObject]
### WriteOnlyObject
Write-only object
in `palantir-java-format/src/main/java/com/palantir/javaformat/java/javadoc/JavadocLexer.java`
#### Snippet
```java
        ImmutableList.Builder<Token> output = ImmutableList.builder();
        StringBuilder accumulated = new StringBuilder();
        NestingCounter inlineTagDepth = new NestingCounter();
        boolean lastTagWasInlineTagStart = false;

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

