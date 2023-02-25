# maven-doxia 
 
# Bad smells
I found 295 bad smells with 39 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 122 | false |
| ReturnNull | 20 | false |
| AssignmentToForLoopParameter | 19 | false |
| UnnecessaryToStringCall | 18 | true |
| ObsoleteCollection | 17 | false |
| SizeReplaceableByIsEmpty | 9 | true |
| RedundantFieldInitialization | 8 | false |
| AssignmentToMethodParameter | 7 | false |
| DuplicateExpressions | 6 | false |
| WhileLoopSpinsOnField | 6 | false |
| UnnecessaryReturn | 5 | true |
| RedundantMethodOverride | 4 | false |
| NestedAssignment | 4 | false |
| DataFlowIssue | 3 | false |
| StringEqualsEmptyString | 3 | false |
| DynamicRegexReplaceableByCompiledPattern | 3 | false |
| NonProtectedConstructorInAbstractClass | 3 | true |
| NonFinalFieldOfException | 3 | false |
| SimplifyStreamApiCallChains | 2 | false |
| RegExpRedundantEscape | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| UnnecessaryBoxing | 2 | false |
| IgnoreResultOfCall | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| EmptyMethod | 2 | false |
| RegExpUnnecessaryNonCapturingGroup | 2 | false |
| UnusedAssignment | 2 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| CommentedOutCode | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| RefusedBequest | 1 | false |
| RedundantArrayCreation | 1 | true |
| DuplicateBranchesInSwitch | 1 | false |
| RegExpSimplifiable | 1 | false |
| RegExpUnexpectedAnchor | 1 | false |
| BoundedWildcard | 1 | false |
| AbstractClassNeverImplemented | 1 | false |
| SuspiciousInvocationHandlerImplementation | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| ClassNameSameAsAncestorName | 1 | false |
| MissingDeprecatedAnnotation | 1 | false |
| RedundantImplements | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Semantics` has only 'static' members, and lacks a 'private' constructor
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/SinkEventAttributeSet.java`
#### Snippet
```java
     * Attribute sets for the semantic attribute.
     */
    public static class Semantics {
        /**
         * An unmodifiable attribute set containing only an emphasis attribute.
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Array access `headers[i]` may produce `NullPointerException`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                            } else {
                                processedGrid = true;
                                headers[i] = false;
                            }
                            continue;
```

### DataFlowIssue
Array access `cells[i]` may produce `NullPointerException`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                        cellLine = cellLine.trim();

                        StringBuilder cell = cells[i];
                        if (cellLine.length() > 0) {
                            // line break in table cells
```

### DataFlowIssue
Variable is already assigned to this value
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/Xhtml5BaseParser.java`
#### Snippet
```java
                    break;
                case "list-style-type: decimal":
                    numbering = Sink.NUMBERING_DECIMAL;
                    break;
                default:
```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownParser.java`
#### Snippet
```java
        if ("title".equalsIgnoreCase(key)) {
            html.append("<title>");
            html.append(HtmlTools.escapeHTML(values.stream().collect(Collectors.joining(", ")), false));
            html.append("</title>");
            return true;
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownParser.java`
#### Snippet
```java
                html.append(HtmlTools.escapeHTML(key));
                html.append("' content='");
                html.append(HtmlTools.escapeHTML(values.stream().collect(Collectors.joining(separator))));
                html.append("' />");
            }
```

## RuleId[ruleID=CommentedOutCode]
### CommentedOutCode
Commented out code (14 lines)
in `doxia-core/src/main/java/org/apache/maven/doxia/index/IndexingSink.java`
#### Snippet
```java
    }

    // public void definedTerm()
    // {
    // type = TYPE_DEFINED_TERM;
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'BOXED' is still used
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/SinkEventAttributeSet.java`
#### Snippet
```java
     */
    @Deprecated
    public static final SinkEventAttributes BOXED;

    /**
```

## RuleId[ruleID=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/FlexmarkDoxiaLinkResolver.java`
#### Snippet
```java
     */
    public FlexmarkDoxiaLinkResolver(@NotNull LinkResolverBasicContext context) {
        this.pattern = Pattern.compile("^(?![^:]+:)((?:\\./)?(?:\\.\\./)*[^\\.]+).(?:"
                + MarkdownParserModule.FILE_EXTENSION
                + "|"
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/FlexmarkDoxiaLinkResolver.java`
#### Snippet
```java
                + "|"
                + MarkdownParserModule.ALTERNATE_FILE_EXTENSION
                + ")(#[^#\\.]*){0,1}$");
    }

```

## RuleId[ruleID=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack`> used
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptSink.java`
#### Snippet
```java

    /** Keep track of the closing tags for inline events. */
    protected Stack<List<String>> inlineStack = new Stack<>();

    // ----------------------------------------------------------------------
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptSink.java`
#### Snippet
```java

    /** Keep track of the closing tags for inline events. */
    protected Stack<List<String>> inlineStack = new Stack<>();

    // ----------------------------------------------------------------------
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptSink.java`
#### Snippet
```java

    /**  listStyles. */
    private final Stack<String> listStyles;

    /** Keep track of the closing tags for inline events. */
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptSink.java`
#### Snippet
```java
    protected AptSink(Writer writer) {
        this.writer = new PrintWriter(writer);
        this.listStyles = new Stack<>();

        init();
```

### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java

        /** Map with systemId as key and the content of systemId as byte[]. */
        protected static final Map<String, byte[]> ENTITY_CACHE = new Hashtable<>();

        private static final Map<String, String> WELL_KNOWN_SYSTEM_IDS = new HashMap<>();
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `doxia-core/src/main/java/org/apache/maven/doxia/index/IndexingSink.java`
#### Snippet
```java
     */
    public IndexingSink(IndexEntry sectionEntry) {
        stack = new Stack<>();
        stack.push(sectionEntry);
        usedIds = new HashMap<>();
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `doxia-core/src/main/java/org/apache/maven/doxia/index/IndexingSink.java`
#### Snippet
```java

    /** The stack. */
    private final Stack<IndexEntry> stack;

    /** A map containing all used ids of index entries as key and how often they are used as value
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/Xhtml5BaseParser.java`
#### Snippet
```java

    /** Used to keep track of closing tags for content events */
    private Stack<String> divStack = new Stack<>();

    /** Used to wrap the definedTerm with its definition, even when one is omitted */
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/Xhtml5BaseParser.java`
#### Snippet
```java

    /** Used to keep track of closing tags for content events */
    private Stack<String> divStack = new Stack<>();

    /** Used to wrap the definedTerm with its definition, even when one is omitted */
```

### ObsoleteCollection
Obsolete collection type `Stack`> used
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java

    /** Keep track of the closing tags for inline events. */
    protected Stack<List<Tag>> inlineStack = new Stack<>();

    /** An indication on if we're inside a paragraph flag. */
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java

    /** Keep track of the closing tags for inline events. */
    protected Stack<List<Tag>> inlineStack = new Stack<>();

    /** An indication on if we're inside a paragraph flag. */
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java

    /** Keep track of the main and div tags for content events. */
    protected Stack<Tag> contentStack = new Stack<>();

    /** Keep track of the closing tags for inline events. */
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java

    /** Keep track of the main and div tags for content events. */
    protected Stack<Tag> contentStack = new Stack<>();

    /** Keep track of the closing tags for inline events. */
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownSink.java`
#### Snippet
```java

    /**  listStyles. */
    private final Stack<String> listStyles;

    /** Keep track of the closing tags for inline events. */
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownSink.java`
#### Snippet
```java
    protected MarkdownSink(Writer writer) {
        this.writer = new PrintWriter(writer);
        this.listStyles = new Stack<>();

        init();
```

### ObsoleteCollection
Obsolete collection type `Stack`> used
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownSink.java`
#### Snippet
```java

    /** Keep track of the closing tags for inline events. */
    protected Stack<List<String>> inlineStack = new Stack<>();

    // ----------------------------------------------------------------------
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownSink.java`
#### Snippet
```java

    /** Keep track of the closing tags for inline events. */
    protected Stack<List<String>> inlineStack = new Stack<>();

    // ----------------------------------------------------------------------
```

## RuleId[ruleID=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/SinkEventAttributeSet.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override
    public Object clone() {
        SinkEventAttributeSet attr = new SinkEventAttributeSet(attribs.size());
        attr.attribs = new LinkedHashMap<>(attribs);
```

## RuleId[ruleID=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/module/AbstractParserModule.java`
#### Snippet
```java
     */
    public AbstractParserModule(String parserId, String extension) {
        this(parserId, parserId, new String[] {extension});
    }

```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                            break;
                        case Sink.JUSTIFY_LEFT:
                            justif = SinkEventAttributeSet.LEFT;
                            break;
                        case Sink.JUSTIFY_RIGHT:
```

## RuleId[ruleID=RegExpSimplifiable]
### RegExpSimplifiable
`{0,1}` can be simplified to '?'
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/FlexmarkDoxiaLinkResolver.java`
#### Snippet
```java
                + "|"
                + MarkdownParserModule.ALTERNATE_FILE_EXTENSION
                + ")(#[^#\\.]*){0,1}$");
    }

```

## RuleId[ruleID=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `text.substring(i + 2, i + 4)`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                                    int value = '?';
                                    try {
                                        value = Integer.parseInt(text.substring(i + 2, i + 4), 16);
                                    } catch (NumberFormatException e) {
                                        LOGGER.debug("Not a number: {}", text.substring(i + 2, i + 4));
```

### DuplicateExpressions
Multiple occurrences of `text.substring(i + 2, i + 4)`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                                        value = Integer.parseInt(text.substring(i + 2, i + 4), 16);
                                    } catch (NumberFormatException e) {
                                        LOGGER.debug("Not a number: {}", text.substring(i + 2, i + 4));
                                    }

```

### DuplicateExpressions
Multiple occurrences of `text.substring(i + 2, i + 6)`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                                    int value = '?';
                                    try {
                                        value = Integer.parseInt(text.substring(i + 2, i + 6), 16);
                                    } catch (NumberFormatException e) {
                                        LOGGER.debug("Not a number: {}", text.substring(i + 2, i + 6));
```

### DuplicateExpressions
Multiple occurrences of `text.substring(i + 2, i + 6)`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                                        value = Integer.parseInt(text.substring(i + 2, i + 6), 16);
                                    } catch (NumberFormatException e) {
                                        LOGGER.debug("Not a number: {}", text.substring(i + 2, i + 6));
                                    }

```

### DuplicateExpressions
Multiple occurrences of `text.substring(i + 1, i + 1 + octalChars)`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                                    int value = '?';
                                    try {
                                        value = Integer.parseInt(text.substring(i + 1, i + 1 + octalChars), 8);
                                    } catch (NumberFormatException e) {
                                        LOGGER.debug("Not a number: {}", text.substring(i + 1, i + 1 + octalChars));
```

### DuplicateExpressions
Multiple occurrences of `text.substring(i + 1, i + 1 + octalChars)`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                                        value = Integer.parseInt(text.substring(i + 1, i + 1 + octalChars), 8);
                                    } catch (NumberFormatException e) {
                                        LOGGER.debug("Not a number: {}", text.substring(i + 1, i + 1 + octalChars));
                                    }

```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`text.length() == 0` can be replaced with 'text.isEmpty()'
in `doxia-core/src/main/java/org/apache/maven/doxia/util/DoxiaUtils.java`
#### Snippet
```java
     */
    public static boolean isValidId(final String text) {
        if (text == null || text.length() == 0) {
            return false;
        }
```

### SizeReplaceableByIsEmpty
`s.length() != 0` can be replaced with '!s.isEmpty()'
in `doxia-core/src/main/java/org/apache/maven/doxia/util/ByLineReaderSource.java`
#### Snippet
```java
        Objects.requireNonNull(s, "s cannot be null");

        if (s.length() != 0) {
            ungetLine();
            lastLine = s;
```

### SizeReplaceableByIsEmpty
`text.trim().length() != 0` can be replaced with '!text.trim().isEmpty()'
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java

                if (isIgnorableWhitespace()) {
                    if (text.trim().length() != 0) {
                        handleText(parser, sink);
                    }
```

### SizeReplaceableByIsEmpty
`sectionIndex.getChildEntries().size() > 0` can be replaced with '!sectionIndex.getChildEntries().isEmpty()'
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/toc/TocMacro.java`
#### Snippet
```java

        if (toDepth > n) {
            if (sectionIndex.getChildEntries().size() > 0) {
                if (fromDepth <= n) {
                    sink.list();
```

### SizeReplaceableByIsEmpty
`index.getChildEntries().size() > 0` can be replaced with '!index.getChildEntries().isEmpty()'
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/toc/TocMacro.java`
#### Snippet
```java
        }

        if (index.getChildEntries().size() > 0) {
            sink.list(getAttributesFromMap(request.getParameters()));

```

### SizeReplaceableByIsEmpty
`entries.size() == 0` can be replaced with 'entries.isEmpty()'
in `doxia-core/src/main/java/org/apache/maven/doxia/index/IndexEntry.java`
#### Snippet
```java
        List<IndexEntry> entries = getChildEntries();

        if (entries.size() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`entries.size() == 0` can be replaced with 'entries.isEmpty()'
in `doxia-core/src/main/java/org/apache/maven/doxia/index/IndexEntry.java`
#### Snippet
```java
        List<IndexEntry> entries = getChildEntries();

        if (entries.size() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`entries.size() == 0` can be replaced with 'entries.isEmpty()'
in `doxia-core/src/main/java/org/apache/maven/doxia/index/IndexEntry.java`
#### Snippet
```java
        List<IndexEntry> entries = getChildEntries();

        if (entries.size() == 0) {
            return null;
        } else if (entries.size() > 1) {
```

### SizeReplaceableByIsEmpty
`cellLine.length() > 0` can be replaced with '!cellLine.isEmpty()'
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java

                        StringBuilder cell = cells[i];
                        if (cellLine.length() > 0) {
                            // line break in table cells
                            if (cell.toString().trim().endsWith("\\u00A0")) {
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java
        if (tableCaption != null) {
            // DOXIA-177
            StringBuilder sb = new StringBuilder();
            sb.append(tableContent, 0, tableContent.indexOf(Markup.GREATER_THAN) + 1);
            sb.append(tableCaption);
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java
            }

            final StringBuilder buffer = new StringBuilder(comment.length() + 7);

            buffer.append(LESS_THAN).append(BANG).append(MINUS).append(MINUS);
```

## RuleId[ruleID=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `doxia-modules/doxia-module-xdoc/src/main/java/org/apache/maven/doxia/module/xdoc/XdocParser.java`
#### Snippet
```java
        if (parser.getName().equals(DOCUMENT_TAG.toString())) {
            // Do nothing
            return;
        } else if (parser.getName().equals(HEAD.toString())) {
            if (!inHead) // we might be in head from a <properties> already
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/SinkEventAttributeSet.java`
#### Snippet
```java
    public void removeAttributes(AttributeSet attributes) {
        if (attributes == null) {
            return;
        } else if (attributes == this) {
            attribs.clear();
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `doxia-modules/doxia-module-xhtml5/src/main/java/org/apache/maven/doxia/module/xhtml5/Xhtml5Parser.java`
#### Snippet
```java
        if (parser.getName().equals(HTML.toString())) {
            // Do nothing
            return;
        } else if (parser.getName().equals(HEAD.toString())) {
            sink.head(attribs);
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `doxia-modules/doxia-module-fml/src/main/java/org/apache/maven/doxia/module/fml/FmlContentParser.java`
#### Snippet
```java
                || parser.getName().equals(ANSWER_TAG.toString())) {
            // ignore
            return;
        } else if (parser.getName().equals(SOURCE_TAG.toString())) {
            verbatim();
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `doxia-modules/doxia-module-fml/src/main/java/org/apache/maven/doxia/module/fml/FmlParser.java`
#### Snippet
```java
        if (parser.getName().equals(FAQS_TAG.toString())) {
            // Do nothing
            return;
        } else if (parser.getName().equals(PART_TAG.toString())) {
            faqs.addPart(currentPart);
```

## RuleId[ruleID=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/AbstractSink.java`
#### Snippet
```java
            if (text.charAt(i) == '\r') {
                if ((i + 1) < length && text.charAt(i + 1) == '\n') {
                    i++;
                }

```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `doxia-core/src/main/java/org/apache/maven/doxia/util/HtmlTools.java`
#### Snippet
```java

                        if (isHighSurrogate(c)) {
                            int codePoint = toCodePoint(c, url.charAt(++i));
                            unicode = toChars(codePoint);
                            bytes = (new String(unicode, 0, unicode.length)).getBytes(StandardCharsets.UTF_8);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `doxia-core/src/main/java/org/apache/maven/doxia/util/HtmlTools.java`
#### Snippet
```java
                            buffer.append("&#x");
                            if (isHighSurrogate(c)) {
                                buffer.append(Integer.toHexString(toCodePoint(c, text.charAt(++i))));
                            } else {
                                buffer.append(Integer.toHexString(c));
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                        switch (escaped) {
                            case SPACE:
                                ++i;
                                flushTraversed(buffer, sink);
                                sink.nonBreakingSpace();
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                            case '\r':
                            case '\n':
                                ++i;
                                // Skip white space which may follow a line break.
                                while (i + 1 < end && Character.isWhitespace(text.charAt(i + 1))) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                                // Skip white space which may follow a line break.
                                while (i + 1 < end && Character.isWhitespace(text.charAt(i + 1))) {
                                    ++i;
                                }
                                flushTraversed(buffer, sink);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                            case LEFT_CURLY_BRACKET:
                            case RIGHT_CURLY_BRACKET:
                                ++i;
                                buffer.append(escaped);
                                break;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                                    }

                                    i += 3;
                                    buffer.append((char) value);
                                } else {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                                    }

                                    i += 5;
                                    buffer.append((char) value);
                                } else {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                                    }

                                    i += octalChars;
                                    buffer.append((char) value);
                                } else {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                    if (!anchor && !link) {
                        if (i + 1 < end && text.charAt(i + 1) == LEFT_CURLY_BRACKET /*}*/) {
                            ++i;
                            link = true;
                            flushTraversed(buffer, sink);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java

                            if (i + 1 < end && text.charAt(i + 1) == LEFT_CURLY_BRACKET /*}*/) {
                                ++i;
                                StringBuilder buf = new StringBuilder();
                                i = skipTraversedLinkAnchor(text, i + 1, end, buf);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                                ++i;
                                StringBuilder buf = new StringBuilder();
                                i = skipTraversedLinkAnchor(text, i + 1, end, buf);
                                linkAnchor = buf.toString();
                            }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                case /*{*/ RIGHT_CURLY_BRACKET:
                    if (link && i + 1 < end && text.charAt(i + 1) == /*{*/ RIGHT_CURLY_BRACKET) {
                        ++i;
                        link = false;
                        flushTraversed(buffer, sink);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                        if (i + 1 < end && text.charAt(i + 1) == LESS_THAN) {
                            if (i + 2 < end && text.charAt(i + 2) == LESS_THAN) {
                                i += 2;
                                monospaced = true;
                                flushTraversed(buffer, sink);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                                sink.monospaced();
                            } else {
                                ++i;
                                bold = true;
                                flushTraversed(buffer, sink);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                            && text.charAt(i + 1) == GREATER_THAN
                            && text.charAt(i + 2) == GREATER_THAN) {
                        i += 2;
                        monospaced = false;
                        flushTraversed(buffer, sink);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                        sink.monospaced_();
                    } else if (bold && i + 1 < end && text.charAt(i + 1) == GREATER_THAN) {
                        ++i;
                        bold = false;
                        flushTraversed(buffer, sink);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
                        // Skip to the last char of a sequence of white spaces.
                        while (i + 1 < end && Character.isWhitespace(text.charAt(i + 1))) {
                            ++i;
                        }
                    } else {
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/SinkUtils.java`
#### Snippet
```java
                if (SinkEventAttributes.STYLE.equals(key.toString())) {
                    sb.append(Markup.SPACE)
                            .append(key.toString())
                            .append(Markup.EQUAL)
                            .append(Markup.QUOTE)
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `doxia-modules/doxia-module-xdoc/src/main/java/org/apache/maven/doxia/module/xdoc/XdocParser.java`
#### Snippet
```java
                if (StringUtils.isEmpty(paramName) || StringUtils.isEmpty(paramValue)) {
                    throw new MacroExecutionException(
                            "'" + Attribute.NAME.toString() + "' and '" + Attribute.VALUE.toString()
                                    + "' attributes for the '" + PARAM.toString() + "' tag are required inside the '"
                                    + MACRO_TAG.toString() + "' tag.");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `doxia-modules/doxia-module-xdoc/src/main/java/org/apache/maven/doxia/module/xdoc/XdocParser.java`
#### Snippet
```java
                if (StringUtils.isEmpty(paramName) || StringUtils.isEmpty(paramValue)) {
                    throw new MacroExecutionException(
                            "'" + Attribute.NAME.toString() + "' and '" + Attribute.VALUE.toString()
                                    + "' attributes for the '" + PARAM.toString() + "' tag are required inside the '"
                                    + MACRO_TAG.toString() + "' tag.");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `doxia-modules/doxia-module-xdoc/src/main/java/org/apache/maven/doxia/module/xdoc/XdocParser.java`
#### Snippet
```java
                    throw new MacroExecutionException(
                            "'" + Attribute.NAME.toString() + "' and '" + Attribute.VALUE.toString()
                                    + "' attributes for the '" + PARAM.toString() + "' tag are required inside the '"
                                    + MACRO_TAG.toString() + "' tag.");
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `doxia-modules/doxia-module-xdoc/src/main/java/org/apache/maven/doxia/module/xdoc/XdocParser.java`
#### Snippet
```java
                            "'" + Attribute.NAME.toString() + "' and '" + Attribute.VALUE.toString()
                                    + "' attributes for the '" + PARAM.toString() + "' tag are required inside the '"
                                    + MACRO_TAG.toString() + "' tag.");
                }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `doxia-modules/doxia-module-xdoc/src/main/java/org/apache/maven/doxia/module/xdoc/XdocParser.java`
#### Snippet
```java

            if (StringUtils.isEmpty(macroName)) {
                throw new MacroExecutionException("The '" + Attribute.NAME.toString() + "' attribute for the '"
                        + MACRO_TAG.toString() + "' tag is required.");
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `doxia-modules/doxia-module-xdoc/src/main/java/org/apache/maven/doxia/module/xdoc/XdocParser.java`
#### Snippet
```java
            if (StringUtils.isEmpty(macroName)) {
                throw new MacroExecutionException("The '" + Attribute.NAME.toString() + "' attribute for the '"
                        + MACRO_TAG.toString() + "' tag is required.");
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptSink.java`
#### Snippet
```java

        if (tableCaptionBuffer.length() > 0) {
            text(tableCaptionBuffer.toString() + EOL);
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/AbstractXmlSink.java`
#### Snippet
```java
        }

        sb.append(t.toString());
        sb.append(GREATER_THAN);

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/AbstractXmlSink.java`
#### Snippet
```java
        }

        sb.append(t.toString());

        sb.append(SinkUtils.getAttributeString(att));
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `doxia-modules/doxia-module-fml/src/main/java/org/apache/maven/doxia/module/fml/FmlParser.java`
#### Snippet
```java

                if (StringUtils.isEmpty(paramName) || StringUtils.isEmpty(paramValue)) {
                    throw new MacroExecutionException("'" + Attribute.NAME.toString()
                            + "' and '" + Attribute.VALUE.toString() + "' attributes for the '" + PARAM.toString()
                            + "' tag are required inside the '" + MACRO_TAG.toString() + "' tag.");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `doxia-modules/doxia-module-fml/src/main/java/org/apache/maven/doxia/module/fml/FmlParser.java`
#### Snippet
```java
                if (StringUtils.isEmpty(paramName) || StringUtils.isEmpty(paramValue)) {
                    throw new MacroExecutionException("'" + Attribute.NAME.toString()
                            + "' and '" + Attribute.VALUE.toString() + "' attributes for the '" + PARAM.toString()
                            + "' tag are required inside the '" + MACRO_TAG.toString() + "' tag.");
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `doxia-modules/doxia-module-fml/src/main/java/org/apache/maven/doxia/module/fml/FmlParser.java`
#### Snippet
```java
                if (StringUtils.isEmpty(paramName) || StringUtils.isEmpty(paramValue)) {
                    throw new MacroExecutionException("'" + Attribute.NAME.toString()
                            + "' and '" + Attribute.VALUE.toString() + "' attributes for the '" + PARAM.toString()
                            + "' tag are required inside the '" + MACRO_TAG.toString() + "' tag.");
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `doxia-modules/doxia-module-fml/src/main/java/org/apache/maven/doxia/module/fml/FmlParser.java`
#### Snippet
```java
                    throw new MacroExecutionException("'" + Attribute.NAME.toString()
                            + "' and '" + Attribute.VALUE.toString() + "' attributes for the '" + PARAM.toString()
                            + "' tag are required inside the '" + MACRO_TAG.toString() + "' tag.");
                }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `doxia-modules/doxia-module-fml/src/main/java/org/apache/maven/doxia/module/fml/FmlParser.java`
#### Snippet
```java
                    executeMacro(macroName, request, sink);
                    sink.close();
                    buffer.append(sw.toString());
                } catch (MacroNotFoundException me) {
                    throw new MacroExecutionException("Macro not found: " + macroName, me);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `doxia-modules/doxia-module-fml/src/main/java/org/apache/maven/doxia/module/fml/FmlParser.java`
#### Snippet
```java

            if (StringUtils.isEmpty(macroName)) {
                throw new MacroExecutionException("The '" + Attribute.NAME.toString() + "' attribute for the '"
                        + MACRO_TAG.toString() + "' tag is required.");
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `doxia-modules/doxia-module-fml/src/main/java/org/apache/maven/doxia/module/fml/FmlParser.java`
#### Snippet
```java
            if (StringUtils.isEmpty(macroName)) {
                throw new MacroExecutionException("The '" + Attribute.NAME.toString() + "' attribute for the '"
                        + MACRO_TAG.toString() + "' tag is required.");
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownSink.java`
#### Snippet
```java
    public void table_() {
        if (tableCaptionBuffer.length() > 0) {
            text(tableCaptionBuffer.toString() + EOL);
        }

```

## RuleId[ruleID=RegExpUnexpectedAnchor]
### RegExpUnexpectedAnchor
Anchor `^` in unexpected position
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownParser.java`
#### Snippet
```java
     */
    private static final Pattern METADATA_SECTION_PATTERN = Pattern.compile(
            "\\A^"
                    + "(?:title|author|date|address|affiliation|copyright|email|keywords|language|phone|subtitle)"
                    + "[ \\t]*:[\\S\\s]+?^[ \\t]*$",
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Tag`
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java
    }

    private void inlineSemantics(SinkEventAttributes attributes, String semantic, List<Tag> tags, Tag tag) {
        if (attributes.containsAttribute(SinkEventAttributes.SEMANTICS, semantic)) {
            SinkEventAttributes attributesNoSemantics = (SinkEventAttributes) attributes.copyAttributes();
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `AbstractXhtml5Sink` has no concrete subclass
in `doxia-modules/doxia-module-xhtml5/src/main/java/org/apache/maven/doxia/module/xhtml5/AbstractXhtml5Sink.java`
#### Snippet
```java
 * <p>Abstract AbstractXhtml5Sink class.</p>
 */
public abstract class AbstractXhtml5Sink extends SinkAdapter {}

```

## RuleId[ruleID=SuspiciousInvocationHandlerImplementation]
### SuspiciousInvocationHandlerImplementation
Null might be returned when proxying method 'equals()': this may cause NullPointerException
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/PipelineSink.java`
#### Snippet
```java
        }

        return null;
    }

```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/snippet/SnippetMacro.java`
#### Snippet
```java
        String verbatimParam = (String) request.getParameter("verbatim");

        if (verbatimParam != null && !"".equals(verbatimParam)) {
            verbatim = Boolean.valueOf(verbatimParam);
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/snippet/SnippetMacro.java`
#### Snippet
```java
        String sourceParam = (String) request.getParameter("source");

        if (sourceParam != null && !"".equals(sourceParam)) {
            source = Boolean.valueOf(sourceParam);
        }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/snippet/SnippetReader.java`
#### Snippet
```java
    private List<String> readLines(String snippetId) throws IOException {
        BufferedReader reader;
        if (encoding == null || "".equals(encoding)) {
            reader = new BufferedReader(new InputStreamReader(source.openStream()));
        } else {
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/snippet/SnippetMacro.java`
#### Snippet
```java

        if (verbatimParam != null && !"".equals(verbatimParam)) {
            verbatim = Boolean.valueOf(verbatimParam);
        }

```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/snippet/SnippetMacro.java`
#### Snippet
```java

        if (sourceParam != null && !"".equals(sourceParam)) {
            source = Boolean.valueOf(sourceParam);
        }

```

## RuleId[ruleID=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/AbstractTextSinkFactory.java`
#### Snippet
```java

        if (!outputDir.exists()) {
            outputDir.mkdirs();
        } else {
            if (!outputDir.isDirectory()) {
```

### IgnoreResultOfCall
Result of `Integer.toString()` is ignored
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java

        if (!this.cellCountStack.isEmpty()) {
            this.cellCountStack.removeLast().toString();
        }

```

## RuleId[ruleID=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/AbstractMacro.java`
#### Snippet
```java
        final int count = parameters.size();

        if (count <= 0) {
            return null;
        }
```

## RuleId[ruleID=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java

        loop:
        while (block != null) {
            int blockIndent = block.getIndent();

```

### WhileLoopSpinsOnField
`while` loop spins on field
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java

        loop:
        while (block != null) {
            int blockIndent = block.getIndent();

```

### WhileLoopSpinsOnField
`while` loop spins on field
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
        }

        while (block != null) {
            traverseSection(0);
        }
```

### WhileLoopSpinsOnField
`while` loop spins on field
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
    private void traverseSectionBlocks() throws AptParseException {
        loop:
        while (block != null) {
            switch (block.getType()) {
                case PARAGRAPH:
```

### WhileLoopSpinsOnField
`while` loop spins on field
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java

        loop:
        while (block != null) {
            int blockIndent = block.getIndent();

```

### WhileLoopSpinsOnField
`while` loop spins on field
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
        traverseSectionBlocks();

        while (block != null) {
            if (block.getType() <= type) {
                break;
```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `init()` only delegates to its super method
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownParser.java`
#### Snippet
```java

        @Override
        protected void init() {
            super.init();
        }
```

### RedundantMethodOverride
Method `initXmlParser()` only delegates to its super method
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/Xhtml5BaseParser.java`
#### Snippet
```java
     */
    @Override
    protected void initXmlParser(XmlPullParser parser) throws XmlPullParserException {
        super.initXmlParser(parser);
    }
```

### RedundantMethodOverride
Method `anchor_()` is identical to its super method
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownSink.java`
#### Snippet
```java
     * {@inheritDoc}
     */
    public void anchor_() {
        // write(ANCHOR_END_MARKUP);
    }
```

### RedundantMethodOverride
Method `anchor()` is identical to its super method
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownSink.java`
#### Snippet
```java

    /** {@inheritDoc} */
    public void anchor(String name) {
        // write(ANCHOR_START_MARKUP + name);
        // TODO get implementation from Xhtml5 base sink
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `YamlFrontMatterVisitor` is the same as one of its superclass' names
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/YamlFrontMatterVisitor.java`
#### Snippet
```java
import com.vladsch.flexmark.ext.yaml.front.matter.YamlFrontMatterBlock;

public class YamlFrontMatterVisitor extends AbstractYamlFrontMatterVisitor {

    int endOffset = 0;
```

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'firstNode != null' covered by subsequent condition 'firstNode instanceof HtmlCommentBlock'
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownParser.java`
#### Snippet
```java
            // Skip the comment nodes
            Node firstNode = documentRoot.getFirstChild();
            while (firstNode != null && firstNode instanceof HtmlCommentBlock) {
                firstNode = firstNode.getNext();
            }
```

### ConditionCoveredByFurtherCondition
Condition 'firstNode != null' covered by subsequent condition 'firstNode instanceof Heading'
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownParser.java`
#### Snippet
```java

            // If this first non-comment node is a heading, we use it as the document title
            if (firstNode != null && firstNode instanceof Heading) {
                html.append("<title>");
                TextCollectingVisitor collectingVisitor = new TextCollectingVisitor();
```

## RuleId[ruleID=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractParser.java`
#### Snippet
```java
     * @deprecated this does not work in multi-module builds, see DOXIA-373
     */
    protected File getBasedir() {
        // TODO: This is baaad, it should come in with the request.
        // (this is only used for macro requests, see AptParser)
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownParser.java`
#### Snippet
```java

    static String normalizeMultilineValue(String value) {
        return value.trim().replaceAll("[ \\t]*[\\r\\n]+[ \\t]*", " ");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `doxia-core/src/main/java/org/apache/maven/doxia/index/IndexingSink.java`
#### Snippet
```java

                String title = entry.getTitle() + text;
                title = title.replaceAll("[\\r\\n]+", "");
                entry.setTitle(title);

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java
            // http://www.w3.org/TR/2000/REC-xml-20001006#sec-comments
            while (comment.contains("--")) {
                comment = comment.replace("--", "- -");
            }

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.module.apt` is unnecessary and can be removed
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptSource.java`
#### Snippet
```java
     *
     * @return a line of the apt source.
     * @throws org.apache.maven.doxia.module.apt.AptParseException if the document can't be parsed.
     */
    String getNextLine() throws AptParseException;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptReaderSource.java`
#### Snippet
```java
     * {@inheritDoc}
     *
     * @return a {@link java.lang.String} object.
     * @throws org.apache.maven.doxia.module.apt.AptParseException if any.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.module.apt` is unnecessary and can be removed
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptReaderSource.java`
#### Snippet
```java
     *
     * @return a {@link java.lang.String} object.
     * @throws org.apache.maven.doxia.module.apt.AptParseException if any.
     */
    public String getNextLine() throws AptParseException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptReaderSource.java`
#### Snippet
```java
     * {@inheritDoc}
     *
     * @return a {@link java.lang.String} object.
     */
    public String getName() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.sink` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/SinkUtils.java`
#### Snippet
```java
     * AttributeSets are ignored unless the Attribute name is SinkEventAttributeSet.STYLE,
     * in which case they are written as outlined at
     * {@link org.apache.maven.doxia.sink.SinkEventAttributes#STYLE SinkEventAttributes.STYLE}.
     * All other keys and values are written as Strings.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/LineBreaker.java`
#### Snippet
```java
     *
     * @param text The text to write.
     * @throws java.io.IOException if there's a problem writing the text.
     */
    public void write(String text) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.sink` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/PipelineSink.java`
#### Snippet
```java
     *
     * @param pipeline A List of Sinks.
     * @return a {@link org.apache.maven.doxia.sink.Sink} object.
     */
    public static Sink newInstance(List<Sink> pipeline) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/PipelineSink.java`
#### Snippet
```java
     * @throws IllegalAccessException if any.
     * @throws InvocationTargetException if any.
     * @param proxy a {@link java.lang.Object} object.
     * @param method a {@link java.lang.reflect.Method} object.
     * @param args an array of {@link java.lang.Object} objects.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/PipelineSink.java`
#### Snippet
```java
     * @throws InvocationTargetException if any.
     * @param proxy a {@link java.lang.Object} object.
     * @param method a {@link java.lang.reflect.Method} object.
     * @param args an array of {@link java.lang.Object} objects.
     * @return a {@link java.lang.Object} object.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/PipelineSink.java`
#### Snippet
```java
     * @param proxy a {@link java.lang.Object} object.
     * @param method a {@link java.lang.reflect.Method} object.
     * @param args an array of {@link java.lang.Object} objects.
     * @return a {@link java.lang.Object} object.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/PipelineSink.java`
#### Snippet
```java
     * @param method a {@link java.lang.reflect.Method} object.
     * @param args an array of {@link java.lang.Object} objects.
     * @return a {@link java.lang.Object} object.
     */
    public Object invoke(Object proxy, Method method, Object[] args)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/MacroRequest.java`
#### Snippet
```java
     * <p>getSourceContent.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSourceContent() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.parser` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/MacroRequest.java`
#### Snippet
```java
     * <p>getParser.</p>
     *
     * @return a {@link org.apache.maven.doxia.parser.Parser} object.
     */
    public Parser getParser() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/MacroRequest.java`
#### Snippet
```java
     * <p>Constructor for MacroRequest.</p>
     *
     * @param sourceContent a {@link java.lang.String} object.
     * @param parser a {@link org.apache.maven.doxia.parser.AbstractParser} object.
     * @param param a {@link java.util.Map} object.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.parser` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/MacroRequest.java`
#### Snippet
```java
     *
     * @param sourceContent a {@link java.lang.String} object.
     * @param parser a {@link org.apache.maven.doxia.parser.AbstractParser} object.
     * @param param a {@link java.util.Map} object.
     * @param basedir a {@link java.io.File} object.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/MacroRequest.java`
#### Snippet
```java
     * @param sourceContent a {@link java.lang.String} object.
     * @param parser a {@link org.apache.maven.doxia.parser.AbstractParser} object.
     * @param param a {@link java.util.Map} object.
     * @param basedir a {@link java.io.File} object.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/MacroRequest.java`
#### Snippet
```java
     * @param parser a {@link org.apache.maven.doxia.parser.AbstractParser} object.
     * @param param a {@link java.util.Map} object.
     * @param basedir a {@link java.io.File} object.
     */
    public MacroRequest(String sourceContent, AbstractParser parser, Map<String, Object> param, File basedir) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/MacroRequest.java`
#### Snippet
```java
     * <p>isInternalParameter.</p>
     *
     * @param name a {@link java.lang.String} object.
     * @return a boolean.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.parser` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/ByLineSource.java`
#### Snippet
```java
     *
     * @return the next line. <code>null</code> if we reached the end.
     * @throws org.apache.maven.doxia.parser.ParseException on I/O error
     */
    String getNextLine() throws ParseException;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/DoxiaUtils.java`
#### Snippet
```java
     * @return The trimmed and encoded id, or null if id is null.
     * If id is not null, the return value is guaranteed to be a valid Doxia id.
     * @see #isValidId(java.lang.String)
     * @since 1.1.1
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/DoxiaUtils.java`
#### Snippet
```java
     * to another document (a local link) of the same site.
     * If link is not null, then exactly one of the three methods
     * {@link #isInternalLink(java.lang.String)}, {@link #isExternalLink(java.lang.String)} and
     * {@link #isLocalLink(java.lang.String)} will return true.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/DoxiaUtils.java`
#### Snippet
```java
     * to another document (a local link) of the same site.
     * If link is not null, then exactly one of the three methods
     * {@link #isInternalLink(java.lang.String)}, {@link #isExternalLink(java.lang.String)} and
     * {@link #isLocalLink(java.lang.String)} will return true.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/DoxiaUtils.java`
#### Snippet
```java
     * If link is not null, then exactly one of the three methods
     * {@link #isInternalLink(java.lang.String)}, {@link #isExternalLink(java.lang.String)} and
     * {@link #isLocalLink(java.lang.String)} will return true.
     *
     * @param link The link to check. Not null.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/DoxiaUtils.java`
#### Snippet
```java
     * ie it is a link to an anchor within the same document.
     * If link is not null, then exactly one of the three methods
     * {@link #isInternalLink(java.lang.String)}, {@link #isExternalLink(java.lang.String)} and
     * {@link #isLocalLink(java.lang.String)} will return true.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/DoxiaUtils.java`
#### Snippet
```java
     * ie it is a link to an anchor within the same document.
     * If link is not null, then exactly one of the three methods
     * {@link #isInternalLink(java.lang.String)}, {@link #isExternalLink(java.lang.String)} and
     * {@link #isLocalLink(java.lang.String)} will return true.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/DoxiaUtils.java`
#### Snippet
```java
     * If link is not null, then exactly one of the three methods
     * {@link #isInternalLink(java.lang.String)}, {@link #isExternalLink(java.lang.String)} and
     * {@link #isLocalLink(java.lang.String)} will return true.
     *
     * @param link The link to check. Not null.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/DoxiaUtils.java`
#### Snippet
```java
     * nor an {@link #isExternalLink(String) external} link.
     * If link is not null, then exactly one of the three methods
     * {@link #isInternalLink(java.lang.String)}, {@link #isExternalLink(java.lang.String)} and
     * {@link #isLocalLink(java.lang.String)} will return true.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/DoxiaUtils.java`
#### Snippet
```java
     * nor an {@link #isExternalLink(String) external} link.
     * If link is not null, then exactly one of the three methods
     * {@link #isInternalLink(java.lang.String)}, {@link #isExternalLink(java.lang.String)} and
     * {@link #isLocalLink(java.lang.String)} will return true.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/DoxiaUtils.java`
#### Snippet
```java
     * If link is not null, then exactly one of the three methods
     * {@link #isInternalLink(java.lang.String)}, {@link #isExternalLink(java.lang.String)} and
     * {@link #isLocalLink(java.lang.String)} will return true.
     *
     * @param link The link to check. Not null.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/DoxiaUtils.java`
#### Snippet
```java
     * @return a set of SinkEventAttributes, or null if no ImageReader was found to read the image.
     *
     * @throws java.io.IOException if an error occurs during reading.
     * @throws NullPointerException if logo is null.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/DoxiaUtils.java`
#### Snippet
```java
     *
     * <p>
     *   This method is equivalent to {@link #encodeId(java.lang.String, boolean) encodeId(id, false)}.
     * </p>
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/DoxiaUtils.java`
#### Snippet
```java
     *      May be null in which case null is returned.
     * @return The trimmed and encoded id, or null if id is null.
     * @see #encodeId(java.lang.String, boolean)
     */
    public static String encodeId(final String id) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/module/AbstractParserModule.java`
#### Snippet
```java
     * {@inheritDoc}
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSourceDirectory() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/module/AbstractParserModule.java`
#### Snippet
```java
     * {@inheritDoc}
     *
     * @return an array of {@link java.lang.String} objects.
     */
    public String[] getExtensions() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/module/AbstractParserModule.java`
#### Snippet
```java
     * {@inheritDoc}
     *
     * @return a {@link java.lang.String} object.
     */
    public String getParserId() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.util` is unnecessary and can be removed
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptUtils.java`
#### Snippet
```java
     * @return True if link is neither an {@link #isExternalLink(String) external}
     * nor a {@link #isLocalLink(String) local} link.
     * @see org.apache.maven.doxia.util.DoxiaUtils#isInternalLink(String)
     * @see #isExternalLink(String)
     * @see #isLocalLink(String)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.util` is unnecessary and can be removed
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptUtils.java`
#### Snippet
```java
     * ie is not a link within the same document nor a link to another
     * document within the same site. This forwards to
     * {@link org.apache.maven.doxia.util.DoxiaUtils#isExternalLink(String)}.
     *
     * @param link The link to check.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.util` is unnecessary and can be removed
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptUtils.java`
#### Snippet
```java
     * @param link The link to check.
     * @return True if DoxiaUtils.isExternalLink(link) returns true.
     * @see org.apache.maven.doxia.util.DoxiaUtils#isExternalLink(String)
     * @see #isInternalLink(String)
     * @see #isLocalLink(String)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.util` is unnecessary and can be removed
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptUtils.java`
#### Snippet
```java
    /**
     * Construct a valid anchor. This is a simplified version of
     * {@link org.apache.maven.doxia.util.DoxiaUtils#encodeId(String)}
     * to ensure the anchor is a valid Doxia id.
     * The procedure is identical to the one in
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.util` is unnecessary and can be removed
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptUtils.java`
#### Snippet
```java
     * @param link The link to check.
     * @return True if the link starts with either "/", "./" or "../".
     * @see org.apache.maven.doxia.util.DoxiaUtils#isLocalLink(String)
     * @see #isExternalLink(String)
     * @see #isInternalLink(String)
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `doxia-sink-api/src/main/java/org/apache/maven/doxia/sink/SinkFactory.java`
#### Snippet
```java
     * @return a <code>Sink</code> instance.
     * @since 1.1
     * @throws java.io.IOException if any.
     */
    Sink createSink(OutputStream out) throws IOException;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `doxia-sink-api/src/main/java/org/apache/maven/doxia/sink/SinkFactory.java`
#### Snippet
```java
     * @param outputName the not-null output name.
     * @return a <code>Sink</code> instance with a file as output.
     * @throws java.io.IOException if any.
     */
    Sink createSink(File outputDir, String outputName) throws IOException;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `doxia-sink-api/src/main/java/org/apache/maven/doxia/sink/SinkFactory.java`
#### Snippet
```java
     * @return a <code>Sink</code> instance using specified encoding.
     * @since 1.1
     * @throws java.io.IOException if any.
     */
    Sink createSink(OutputStream out, String encoding) throws IOException;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `doxia-sink-api/src/main/java/org/apache/maven/doxia/sink/SinkFactory.java`
#### Snippet
```java
     * @see #createSink(File, String)
     * @since 1.1
     * @throws java.io.IOException if any.
     */
    Sink createSink(File outputDir, String outputName, String encoding) throws IOException;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-sink-api/src/main/java/org/apache/maven/doxia/sink/Sink.java`
#### Snippet
```java
     *
     * @see #data(String, SinkEventAttributes)
     * @param value a {@link java.lang.String} object.
     */
    void data(String value);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/ByLineReaderSource.java`
#### Snippet
```java
     * {@inheritDoc}
     *
     * @return a {@link java.lang.String} object.
     */
    public final String getName() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/ByLineReaderSource.java`
#### Snippet
```java
     * <p>Constructor for ByLineReaderSource.</p>
     *
     * @param in a {@link java.io.Reader} object.
     * @param name a {@link java.lang.String} object.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/ByLineReaderSource.java`
#### Snippet
```java
     *
     * @param in a {@link java.io.Reader} object.
     * @param name a {@link java.lang.String} object.
     */
    public ByLineReaderSource(final Reader in, final String name) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/ByLineReaderSource.java`
#### Snippet
```java
     * {@inheritDoc}
     *
     * @return a {@link java.lang.String} object.
     * @throws org.apache.maven.doxia.parser.ParseException if any.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.parser` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/ByLineReaderSource.java`
#### Snippet
```java
     *
     * @return a {@link java.lang.String} object.
     * @throws org.apache.maven.doxia.parser.ParseException if any.
     */
    public final String getNextLine() throws ParseException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.sink` is unnecessary and can be removed
in `doxia-modules/doxia-module-xdoc/src/main/java/org/apache/maven/doxia/module/xdoc/XdocSink.java`
#### Snippet
```java
     * @see XdocMarkup#SOURCE_TAG
     * @see javax.swing.text.html.HTML.Tag#PRE
     * @param attributes a {@link org.apache.maven.doxia.sink.SinkEventAttributes} object.
     */
    public void verbatim(SinkEventAttributes attributes) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.sink` is unnecessary and can be removed
in `doxia-modules/doxia-module-xdoc/src/main/java/org/apache/maven/doxia/module/xdoc/XdocSink.java`
#### Snippet
```java
     * {@inheritDoc}
     *
     * @see #body(org.apache.maven.doxia.sink.SinkEventAttributes)
     */
    public void body() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.sink` is unnecessary and can be removed
in `doxia-modules/doxia-module-xdoc/src/main/java/org/apache/maven/doxia/module/xdoc/XdocSink.java`
#### Snippet
```java
     * {@inheritDoc}
     *
     * @see #head(org.apache.maven.doxia.sink.SinkEventAttributes)
     */
    public void head() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.markup` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/HtmlTools.java`
#### Snippet
```java
    /**
     * Returns a tag for a defined HTML tag name. This is one of
     * the tags defined in {@link org.apache.maven.doxia.markup.HtmlMarkup}.
     * If the given name does not represent one of the defined tags, then
     * <code>null</code> will be returned.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/util/HtmlTools.java`
#### Snippet
```java
     * @param id The id to be encoded.
     * @return The trimmed and encoded id, or null if id is null.
     * @see DoxiaUtils#encodeId(java.lang.String,boolean)
     */
    public static String encodeId(String id) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractParser.java`
#### Snippet
```java
    /**
     * Initialize the parser. This is called first by
     * {@link #parse(java.io.Reader, org.apache.maven.doxia.sink.Sink)} and can be used
     * to set the parser into a clear state so it can be re-used.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.sink` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractParser.java`
#### Snippet
```java
    /**
     * Initialize the parser. This is called first by
     * {@link #parse(java.io.Reader, org.apache.maven.doxia.sink.Sink)} and can be used
     * to set the parser into a clear state so it can be re-used.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.parser` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractParser.java`
#### Snippet
```java
     * @param sink a sink that consumes the Doxia events
     * @param reference a string containing the reference to the source of the input string (e.g. filename)
     * @throws org.apache.maven.doxia.parser.ParseException if the string could not be parsed
     * @since 1.10
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.parser` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractParser.java`
#### Snippet
```java
     * @param string a string that provides the source input
     * @param sink a sink that consumes the Doxia events
     * @throws org.apache.maven.doxia.parser.ParseException if the string could not be parsed
     * @since 1.1
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.macro` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractParser.java`
#### Snippet
```java
     * @param request the corresponding MacroRequest
     * @param sink the sink to receive the events
     * @throws org.apache.maven.doxia.macro.MacroExecutionException if an error occurred during execution
     * @throws org.apache.maven.doxia.macro.manager.MacroNotFoundException if the macro could not be found
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.macro.manager` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractParser.java`
#### Snippet
```java
     * @param sink the sink to receive the events
     * @throws org.apache.maven.doxia.macro.MacroExecutionException if an error occurred during execution
     * @throws org.apache.maven.doxia.macro.manager.MacroNotFoundException if the macro could not be found
     */
    // Made public right now because of the structure of the APT parser and
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.sink` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
     * <p>Constructor for RandomAccessSink.</p>
     *
     * @param sinkFactory a {@link org.apache.maven.doxia.sink.SinkFactory} object.
     * @param stream a {@link java.io.OutputStream} object.
     * @param encoding a {@link java.lang.String} object.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
     *
     * @param sinkFactory a {@link org.apache.maven.doxia.sink.SinkFactory} object.
     * @param stream a {@link java.io.OutputStream} object.
     * @param encoding a {@link java.lang.String} object.
     * @throws java.io.IOException if any.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
     * @param sinkFactory a {@link org.apache.maven.doxia.sink.SinkFactory} object.
     * @param stream a {@link java.io.OutputStream} object.
     * @param encoding a {@link java.lang.String} object.
     * @throws java.io.IOException if any.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
     * @param stream a {@link java.io.OutputStream} object.
     * @param encoding a {@link java.lang.String} object.
     * @throws java.io.IOException if any.
     */
    public RandomAccessSink(SinkFactory sinkFactory, OutputStream stream, String encoding) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.sink` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
     * <p>Constructor for RandomAccessSink.</p>
     *
     * @param sinkFactory a {@link org.apache.maven.doxia.sink.SinkFactory} object.
     * @param outputDirectory a {@link java.io.File} object.
     * @param outputName a {@link java.lang.String} object.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
     *
     * @param sinkFactory a {@link org.apache.maven.doxia.sink.SinkFactory} object.
     * @param outputDirectory a {@link java.io.File} object.
     * @param outputName a {@link java.lang.String} object.
     * @throws java.io.IOException if any.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
     * @param sinkFactory a {@link org.apache.maven.doxia.sink.SinkFactory} object.
     * @param outputDirectory a {@link java.io.File} object.
     * @param outputName a {@link java.lang.String} object.
     * @throws java.io.IOException if any.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
     * @param outputDirectory a {@link java.io.File} object.
     * @param outputName a {@link java.lang.String} object.
     * @throws java.io.IOException if any.
     */
    public RandomAccessSink(SinkFactory sinkFactory, File outputDirectory, String outputName) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.sink` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
     * <p>Constructor for RandomAccessSink.</p>
     *
     * @param sinkFactory a {@link org.apache.maven.doxia.sink.SinkFactory} object.
     * @param outputDirectory a {@link java.io.File} object.
     * @param outputName a {@link java.lang.String} object.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
     *
     * @param sinkFactory a {@link org.apache.maven.doxia.sink.SinkFactory} object.
     * @param outputDirectory a {@link java.io.File} object.
     * @param outputName a {@link java.lang.String} object.
     * @param encoding a {@link java.lang.String} object.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.parser` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/Parser.java`
#### Snippet
```java
     * You could use <code>newReader</code> methods from {@link org.codehaus.plexus.util.ReaderFactory}.
     * @param sink A sink that consumes the Doxia events.
     * @throws org.apache.maven.doxia.parser.ParseException if the model could not be parsed.
     */
    void parse(Reader source, Sink sink) throws ParseException;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
     * @param sinkFactory a {@link org.apache.maven.doxia.sink.SinkFactory} object.
     * @param outputDirectory a {@link java.io.File} object.
     * @param outputName a {@link java.lang.String} object.
     * @param encoding a {@link java.lang.String} object.
     * @throws java.io.IOException if any.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
     * @param outputDirectory a {@link java.io.File} object.
     * @param outputName a {@link java.lang.String} object.
     * @param encoding a {@link java.lang.String} object.
     * @throws java.io.IOException if any.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.parser` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/Parser.java`
#### Snippet
```java
     * @param sink A sink that consumes the Doxia events.
     * @param reference the reference
     * @throws org.apache.maven.doxia.parser.ParseException if the model could not be parsed.
     */
    void parse(Reader source, Sink sink, String reference) throws ParseException;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
     * @param outputName a {@link java.lang.String} object.
     * @param encoding a {@link java.lang.String} object.
     * @throws java.io.IOException if any.
     */
    public RandomAccessSink(SinkFactory sinkFactory, File outputDirectory, String outputName, String encoding)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.sink` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
     * <p>Constructor for RandomAccessSink.</p>
     *
     * @param sinkFactory a {@link org.apache.maven.doxia.sink.SinkFactory} object.
     * @param stream a {@link java.io.OutputStream} object.
     * @throws java.io.IOException if any.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
     *
     * @param sinkFactory a {@link org.apache.maven.doxia.sink.SinkFactory} object.
     * @param stream a {@link java.io.OutputStream} object.
     * @throws java.io.IOException if any.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
     * @param sinkFactory a {@link org.apache.maven.doxia.sink.SinkFactory} object.
     * @param stream a {@link java.io.OutputStream} object.
     * @throws java.io.IOException if any.
     */
    public RandomAccessSink(SinkFactory sinkFactory, OutputStream stream) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/SinkEventAttributeSet.java`
#### Snippet
```java
     * {@inheritDoc}
     *
     * @return a {@link java.util.Enumeration} object.
     */
    public Enumeration<String> getAttributeNames() {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.swing.text` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/SinkEventAttributeSet.java`
#### Snippet
```java
     * {@inheritDoc}
     *
     * @return a {@link javax.swing.text.AttributeSet} object.
     */
    public AttributeSet copyAttributes() {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.swing.text` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/SinkEventAttributeSet.java`
#### Snippet
```java
     * {@inheritDoc}
     *
     * @return a {@link javax.swing.text.AttributeSet} object.
     */
    public AttributeSet getResolveParent() {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.swing.text` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/SinkEventAttributeSet.java`
#### Snippet
```java
     * {@inheritDoc}
     *
     * @param attributes a {@link javax.swing.text.AttributeSet} object.
     */
    public void removeAttributes(AttributeSet attributes) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.macro.manager` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/manager/MacroManager.java`
#### Snippet
```java
     * @param id The identifier.
     * @return The corresponding MacroManager.
     * @throws org.apache.maven.doxia.macro.manager.MacroNotFoundException if no MacroManager could be found
     * for the given id.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vladsch.flexmark.parser` is unnecessary, and can be replaced with an import
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownParser.java`
#### Snippet
```java
     * Flexmark's Markdown parser (one static instance fits all)
     */
    private static final com.vladsch.flexmark.parser.Parser FLEXMARK_PARSER;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vladsch.flexmark.parser` is unnecessary, and can be replaced with an import
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownParser.java`
#### Snippet
```java
     * Flexmark's Markdown Metadata parser
     */
    private static final com.vladsch.flexmark.parser.Parser FLEXMARK_METADATA_PARSER;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vladsch.flexmark.parser` is unnecessary, and can be replaced with an import
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownParser.java`
#### Snippet
```java
        // Enable the extensions that we used to have in Pegdown
        flexmarkOptions.set(
                com.vladsch.flexmark.parser.Parser.EXTENSIONS,
                Arrays.asList(
                        EscapedCharacterExtension.create(),
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vladsch.flexmark.parser` is unnecessary, and can be replaced with an import
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownParser.java`
#### Snippet
```java
        // Build the Markdown parser
        FLEXMARK_PARSER =
                com.vladsch.flexmark.parser.Parser.builder(flexmarkOptions).build();

        MutableDataSet flexmarkMetadataOptions = new MutableDataSet();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vladsch.flexmark.parser` is unnecessary, and can be replaced with an import
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownParser.java`
#### Snippet
```java
        MutableDataSet flexmarkMetadataOptions = new MutableDataSet();
        flexmarkMetadataOptions.set(
                com.vladsch.flexmark.parser.Parser.EXTENSIONS, Arrays.asList(YamlFrontMatterExtension.create()));
        FLEXMARK_METADATA_PARSER = com.vladsch.flexmark.parser.Parser.builder(flexmarkMetadataOptions)
                .build();
```

### UnnecessaryFullyQualifiedName
Qualifier `com.vladsch.flexmark.parser` is unnecessary, and can be replaced with an import
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownParser.java`
#### Snippet
```java
        flexmarkMetadataOptions.set(
                com.vladsch.flexmark.parser.Parser.EXTENSIONS, Arrays.asList(YamlFrontMatterExtension.create()));
        FLEXMARK_METADATA_PARSER = com.vladsch.flexmark.parser.Parser.builder(flexmarkMetadataOptions)
                .build();

```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.util.xml.pull` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param parser A parser, not null.
     * @param sink the sink to receive the events. Not null.
     * @throws org.codehaus.plexus.util.xml.pull.XmlPullParserException if there's a problem parsing the model
     */
    protected void handleComment(XmlPullParser parser, Sink sink) throws XmlPullParserException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.util.xml.pull` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param parser A parser, not null.
     * @param sink the sink to receive the events.
     * @throws org.codehaus.plexus.util.xml.pull.XmlPullParserException if there's a problem parsing the model
     * @throws org.apache.maven.doxia.macro.MacroExecutionException if there's a problem executing a macro
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.macro` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param sink the sink to receive the events.
     * @throws org.codehaus.plexus.util.xml.pull.XmlPullParserException if there's a problem parsing the model
     * @throws org.apache.maven.doxia.macro.MacroExecutionException if there's a problem executing a macro
     */
    protected abstract void handleEndTag(XmlPullParser parser, Sink sink)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.sink` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * It will be passed as the first argument of the required parameters to the Sink
     * {@link
     * org.apache.maven.doxia.sink.Sink#unknown(String, Object[], org.apache.maven.doxia.sink.SinkEventAttributes)}
     * method.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.util.xml.pull` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param parser A parser, not null.
     * @param sink the sink to receive the events. Not null.
     * @throws org.codehaus.plexus.util.xml.pull.XmlPullParserException if there's a problem parsing the model
     */
    protected void handleCdsect(XmlPullParser parser, Sink sink) throws XmlPullParserException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.util.xml.pull` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param parser A parser, not null.
     * @param sink the sink to receive the events.
     * @throws org.codehaus.plexus.util.xml.pull.XmlPullParserException if there's a problem parsing the model
     * @throws org.apache.maven.doxia.macro.MacroExecutionException if there's a problem executing a macro
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.macro` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param sink the sink to receive the events.
     * @throws org.codehaus.plexus.util.xml.pull.XmlPullParserException if there's a problem parsing the model
     * @throws org.apache.maven.doxia.macro.MacroExecutionException if there's a problem executing a macro
     */
    private void parseXml(XmlPullParser parser, Sink sink) throws XmlPullParserException, MacroExecutionException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.util.xml.pull` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param parser A parser, not null.
     * @param sink the sink to receive the events. Not null.
     * @throws org.codehaus.plexus.util.xml.pull.XmlPullParserException if there's a problem parsing the model
     */
    protected void handleEntity(XmlPullParser parser, Sink sink) throws XmlPullParserException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.util.xml.pull` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param parser A parser, not null.
     * @param sink the sink to receive the events.
     * @throws org.codehaus.plexus.util.xml.pull.XmlPullParserException if there's a problem parsing the model
     * @throws org.apache.maven.doxia.macro.MacroExecutionException if there's a problem executing a macro
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.macro` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param sink the sink to receive the events.
     * @throws org.codehaus.plexus.util.xml.pull.XmlPullParserException if there's a problem parsing the model
     * @throws org.apache.maven.doxia.macro.MacroExecutionException if there's a problem executing a macro
     */
    protected abstract void handleStartTag(XmlPullParser parser, Sink sink)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.util.xml.pull` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param parser A parser, not null.
     * @param sink the sink to receive the events. Not null.
     * @throws org.codehaus.plexus.util.xml.pull.XmlPullParserException if there's a problem parsing the model
     */
    protected void handleText(XmlPullParser parser, Sink sink) throws XmlPullParserException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.codehaus.plexus.util.xml.pull` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     *
     * @param parser A parser, not null.
     * @throws org.codehaus.plexus.util.xml.pull.XmlPullParserException if there's a problem initializing the parser
     */
    protected void initXmlParser(XmlPullParser parser) throws XmlPullParserException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.parser.manager` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/manager/ParserManager.java`
#### Snippet
```java
     * @param id The identifier.
     * @return The corresponding parser.
     * @throws org.apache.maven.doxia.parser.manager.ParserNotFoundException if no parser could be found
     * for the given id.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/snippet/SnippetReader.java`
#### Snippet
```java
     * @param snippetId The id of the snippet.
     * @return The snippet.
     * @throws java.io.IOException if something goes wrong.
     */
    public StringBuffer readSnippet(String snippetId) throws IOException {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/module/DefaultParserModuleManager.java`
#### Snippet
```java
     * {@inheritDoc}
     *
     * @return a {@link java.util.Collection} object.
     */
    public Collection<ParserModule> getParserModules() {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.macro` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/Macro.java`
#### Snippet
```java
     * @param sink The sink to receive the events.
     * @param request The corresponding MacroRequest.
     * @throws org.apache.maven.doxia.macro.MacroExecutionException if an error occurred during execution.
     */
    void execute(Sink sink, MacroRequest request) throws MacroExecutionException;
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.swing.text` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/AbstractXmlSink.java`
#### Snippet
```java
     * @param t a non null tag.
     * @param att a set of attributes. May be null.
     * @see #writeStartTag(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet, boolean)
     */
    protected void writeSimpleTag(Tag t, MutableAttributeSet att) {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.swing.text` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/AbstractXmlSink.java`
#### Snippet
```java
     * @param t a non null tag.
     * @param att a set of attributes. May be null.
     * @see #writeStartTag(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet, boolean)
     */
    protected void writeStartTag(Tag t, MutableAttributeSet att) {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.swing.text` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/AbstractXmlSink.java`
#### Snippet
```java
     *
     * @param t a non null tag
     * @see #writeStartTag(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet)
     */
    protected void writeStartTag(Tag t) {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.swing.text` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/AbstractXmlSink.java`
#### Snippet
```java
     *
     * @param t a non null tag
     * @see #writeSimpleTag(javax.swing.text.html.HTML.Tag, javax.swing.text.MutableAttributeSet)
     */
    protected void writeSimpleTag(Tag t) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.module.apt` is unnecessary and can be removed
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
     * @param end offset.
     * @param sink the sink to receive the events.
     * @throws org.apache.maven.doxia.module.apt.AptParseException if something goes wrong.
     */
    protected void doTraverseText(String text, int begin, int end, Sink sink) throws AptParseException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.module.apt` is unnecessary and can be removed
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
     * Parse the next line of the Apt source document.
     *
     * @throws org.apache.maven.doxia.module.apt.AptParseException if something goes wrong.
     */
    protected void nextLine() throws AptParseException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.sink.impl` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/Xhtml5BaseParser.java`
#### Snippet
```java
     * @param newLevel the new section level, all upper levels have to be closed.
     * @param sink the sink to receive the events.
     * @param attribs a {@link org.apache.maven.doxia.sink.impl.SinkEventAttributeSet} object.
     */
    protected void consecutiveSections(int newLevel, Sink sink, SinkEventAttributeSet attribs) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.util` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java
     * @param text the String to encode, may be null.
     * @return the text encoded, null if null String input.
     * @see org.apache.maven.doxia.util.HtmlTools#encodeURL(String)
     */
    protected static String encodeURL(String text) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.util` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java
     * @param text the String to escape, may be null
     * @return the text escaped, "" if null String input
     * @see org.apache.maven.doxia.util.HtmlTools#escapeHTML(String)
     */
    protected static String escapeHTML(String text) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.util` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java
     *
     * <p>
     * If {@link org.apache.maven.doxia.util.HtmlTools#getHtmlTag(String) HtmlTools.getHtmlTag(name)}
     * does not return null, the corresponding tag will be written.
     * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.markup` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java
     *
     * @param name the name of the event. If this is not a valid xhtml tag name
     *      as defined in {@link org.apache.maven.doxia.markup.HtmlMarkup} then the event is ignored.
     * @param requiredParams If this is null or the first argument is not an Integer then the event is ignored.
     *      The first argument should indicate the type of the unknown event, its integer value should be one of
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.markup` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java
     * @param requiredParams If this is null or the first argument is not an Integer then the event is ignored.
     *      The first argument should indicate the type of the unknown event, its integer value should be one of
     *      {@link org.apache.maven.doxia.markup.HtmlMarkup#TAG_TYPE_START TAG_TYPE_START},
     *      {@link org.apache.maven.doxia.markup.HtmlMarkup#TAG_TYPE_END TAG_TYPE_END},
     *      {@link org.apache.maven.doxia.markup.HtmlMarkup#TAG_TYPE_SIMPLE TAG_TYPE_SIMPLE},
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.markup` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java
     *      The first argument should indicate the type of the unknown event, its integer value should be one of
     *      {@link org.apache.maven.doxia.markup.HtmlMarkup#TAG_TYPE_START TAG_TYPE_START},
     *      {@link org.apache.maven.doxia.markup.HtmlMarkup#TAG_TYPE_END TAG_TYPE_END},
     *      {@link org.apache.maven.doxia.markup.HtmlMarkup#TAG_TYPE_SIMPLE TAG_TYPE_SIMPLE},
     *      {@link org.apache.maven.doxia.markup.HtmlMarkup#ENTITY_TYPE ENTITY_TYPE}, or
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.markup` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java
     *      {@link org.apache.maven.doxia.markup.HtmlMarkup#TAG_TYPE_START TAG_TYPE_START},
     *      {@link org.apache.maven.doxia.markup.HtmlMarkup#TAG_TYPE_END TAG_TYPE_END},
     *      {@link org.apache.maven.doxia.markup.HtmlMarkup#TAG_TYPE_SIMPLE TAG_TYPE_SIMPLE},
     *      {@link org.apache.maven.doxia.markup.HtmlMarkup#ENTITY_TYPE ENTITY_TYPE}, or
     *      {@link org.apache.maven.doxia.markup.HtmlMarkup#CDATA_TYPE CDATA_TYPE},
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.markup` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java
     *      {@link org.apache.maven.doxia.markup.HtmlMarkup#TAG_TYPE_END TAG_TYPE_END},
     *      {@link org.apache.maven.doxia.markup.HtmlMarkup#TAG_TYPE_SIMPLE TAG_TYPE_SIMPLE},
     *      {@link org.apache.maven.doxia.markup.HtmlMarkup#ENTITY_TYPE ENTITY_TYPE}, or
     *      {@link org.apache.maven.doxia.markup.HtmlMarkup#CDATA_TYPE CDATA_TYPE},
     *      otherwise the event will be ignored.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.maven.doxia.markup` is unnecessary and can be removed
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java
     *      {@link org.apache.maven.doxia.markup.HtmlMarkup#TAG_TYPE_SIMPLE TAG_TYPE_SIMPLE},
     *      {@link org.apache.maven.doxia.markup.HtmlMarkup#ENTITY_TYPE ENTITY_TYPE}, or
     *      {@link org.apache.maven.doxia.markup.HtmlMarkup#CDATA_TYPE CDATA_TYPE},
     *      otherwise the event will be ignored.
     * @param attributes a set of attributes for the event. May be null.
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `doxia-modules/doxia-module-xdoc/src/main/java/org/apache/maven/doxia/module/xdoc/XdocSink.java`
#### Snippet
```java

        if (atts.isDefined(SinkEventAttributes.DECORATION)) {
            sourceFlag = source = "source".equals(atts.getAttribute(SinkEventAttributes.DECORATION));
        }

```

### NestedAssignment
Result of assignment expression used
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
                String tmpLine = "";
                Matcher matcher;
                while ((line = reader.readLine()) != null) {
                    tmpLine += "\n" + line;
                    matcher = PATTERN_ENTITY_1.matcher(tmpLine);
```

### NestedAssignment
Result of assignment expression used
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/snippet/SnippetReader.java`
#### Snippet
```java
            boolean foundEnd = false;
            boolean hasSnippetId = StringUtils.isNotEmpty(snippetId);
            while ((line = reader.readLine()) != null) {
                if (!hasSnippetId) {
                    lines.add(line);
```

### NestedAssignment
Result of assignment expression used
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java

        begin = 0;
        while ((end = string.indexOf(oldSub, begin)) >= 0) {
            if (end > begin) {
                replaced.append(string, begin, end);
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractParserModule()` of an abstract class should not be declared 'public'
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/module/AbstractParserModule.java`
#### Snippet
```java
     * @param extension the file extension
     */
    public AbstractParserModule(String parserId, String extension) {
        this(parserId, parserId, new String[] {extension});
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractParserModule()` of an abstract class should not be declared 'public'
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/module/AbstractParserModule.java`
#### Snippet
```java
     * @param parserId the parser id
     */
    public AbstractParserModule(String parserId) {
        this(parserId, parserId, parserId);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractParserModule()` of an abstract class should not be declared 'public'
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/module/AbstractParserModule.java`
#### Snippet
```java
     * Constructor with null.
     */
    public AbstractParserModule() {
        this(null, null, (String[]) null);
    }
```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
Empty method overrides empty method
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownSink.java`
#### Snippet
```java

    /** {@inheritDoc} */
    public void anchor(String name) {
        // write(ANCHOR_START_MARKUP + name);
        // TODO get implementation from Xhtml5 base sink
```

### EmptyMethod
Empty method overrides empty method
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownSink.java`
#### Snippet
```java
     * {@inheritDoc}
     */
    public void anchor_() {
        // write(ANCHOR_END_MARKUP);
    }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `doxia-core/src/main/java/org/apache/maven/doxia/util/LineBreaker.java`
#### Snippet
```java

    /** The current line length. */
    private int lineLength = 0;

    /** The string buffer to store the current text. */
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/YamlFrontMatterVisitor.java`
#### Snippet
```java
public class YamlFrontMatterVisitor extends AbstractYamlFrontMatterVisitor {

    int endOffset = 0;

    @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `doxia-core/src/main/java/org/apache/maven/doxia/util/ByLineReaderSource.java`
#### Snippet
```java
     * called
     */
    private boolean ungetted = false;

    private String name;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractParser.java`
#### Snippet
```java
public abstract class AbstractParser implements Parser {
    /** Indicates that a second parsing is required. */
    private boolean secondParsing = false;

    @Inject
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/snippet/SnippetMacro.java`
#### Snippet
```java
     * Debug.
     */
    private boolean debug = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
    private Map<String, String> entities;

    private boolean validate = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/Xhtml5BaseParser.java`
#### Snippet
```java

    /** Used to wrap the definedTerm with its definition, even when one is omitted */
    boolean hasDefinitionListItem = false;

    /** {@inheritDoc} */
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/Xhtml5BaseParser.java`
#### Snippet
```java

    /** Used for nested lists. */
    private int orderedListDepth = 0;

    /** Counts section level. */
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `id`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptUtils.java`
#### Snippet
```java
        }

        id = id.trim();

        int length = id.length();
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
        protected int skipFromLeftToRightBracket(int i) throws AptParseException {
            char previous = LEFT_SQUARE_BRACKET;
            for (++i; i < textLength; ++i) {
                char c = text.charAt(i);
                if (c == RIGHT_SQUARE_BRACKET && previous != BACKSLASH) {
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
        protected int skipFromLeftToRightBracket(int i) throws AptParseException {
            char previous = LEFT_SQUARE_BRACKET;
            for (++i; i < textLength; ++i) {
                char c = text.charAt(i);
                if (c == RIGHT_SQUARE_BRACKET && previous != BACKSLASH) {
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
    protected static int skipSpace(String string, int length, int i) {
        loop:
        for (; i < length; ++i) {
            switch (string.charAt(i)) {
                case SPACE:
```

### AssignmentToMethodParameter
Assignment to method parameter `attributes`
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java

                if (attributes == null) {
                    attributes = new SinkEventAttributeSet();
                }
                if (atts != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `comment`
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java
            // http://www.w3.org/TR/2000/REC-xml-20001006#sec-comments
            while (comment.contains("--")) {
                comment = comment.replace("--", "- -");
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `comment`
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java

            if (comment.endsWith("-")) {
                comment += " ";
            }

```

## RuleId[ruleID=RedundantImplements]
### RedundantImplements
Redundant interface declaration `TextMarkup`
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownParser.java`
#### Snippet
```java
@Singleton
@Named("markdown")
public class MarkdownParser extends AbstractTextParser implements TextMarkup {

    /**
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-02-25-14-36-29.682.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptReaderSource.java`
#### Snippet
```java
    public String getNextLine() throws AptParseException {
        if (reader == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/SinkUtils.java`
#### Snippet
```java
    public static MutableAttributeSet filterAttributes(AttributeSet attributes, String[] valids) {
        if (attributes == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/AbstractSink.java`
#### Snippet
```java
    protected static String unifyEOLs(String text) {
        if (text == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/PipelineSink.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `doxia-core/src/main/java/org/apache/maven/doxia/util/DoxiaUtils.java`
#### Snippet
```java
    public static String encodeId(final String id, final boolean chop) {
        if (id == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-core/src/main/java/org/apache/maven/doxia/util/DoxiaUtils.java`
#### Snippet
```java

        if (img == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptUtils.java`
#### Snippet
```java
    public static String encodeAnchor(String id) {
        if (id == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/AbstractMacro.java`
#### Snippet
```java
    protected static SinkEventAttributes getAttributesFromMap(Map<?, ?> parameters) {
        if (parameters == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/AbstractMacro.java`
#### Snippet
```java

        if (count <= 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-core/src/main/java/org/apache/maven/doxia/util/ByLineReaderSource.java`
#### Snippet
```java
    public final String getNextLine() throws ParseException {
        if (reader == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-core/src/main/java/org/apache/maven/doxia/util/HtmlTools.java`
#### Snippet
```java
    public static String encodeURL(String url) {
        if (url == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-core/src/main/java/org/apache/maven/doxia/util/HtmlTools.java`
#### Snippet
```java
    public static String unescapeHTML(String text, boolean xmlMode) {
        if (text == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java

        if (count < 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-core/src/main/java/org/apache/maven/doxia/index/IndexEntry.java`
#### Snippet
```java
    public IndexEntry getPrevEntry() {
        if (parent == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-core/src/main/java/org/apache/maven/doxia/index/IndexEntry.java`
#### Snippet
```java

        if (index == 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-core/src/main/java/org/apache/maven/doxia/index/IndexEntry.java`
#### Snippet
```java

        if (entries.size() == 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-core/src/main/java/org/apache/maven/doxia/index/IndexEntry.java`
#### Snippet
```java

        if (entries.size() == 0) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-core/src/main/java/org/apache/maven/doxia/index/IndexEntry.java`
#### Snippet
```java
    public IndexEntry getNextEntry() {
        if (parent == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-core/src/main/java/org/apache/maven/doxia/index/IndexEntry.java`
#### Snippet
```java

        if (index + 1 >= entries.size()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `doxia-core/src/main/java/org/apache/maven/doxia/index/IndexEntry.java`
#### Snippet
```java

        if (entries.size() == 0) {
            return null;
        } else if (entries.size() > 1) {
            throw new IllegalStateException("This index has more than one root entry");
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `style` is redundant
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownSink.java`
#### Snippet
```java
                    numbering);
        }
        String style = LIST_ORDERED_ITEM_START_MARKUP;
        listStyles.push(style);
    }
```

## RuleId[ruleID=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `columnNumber` of exception class
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/ParseException.java`
#### Snippet
```java

    /** Column number where the parse exception occurred. */
    private int columnNumber;

    /**
```

### NonFinalFieldOfException
Non-final field `fileName` of exception class
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/ParseException.java`
#### Snippet
```java

    /** The file that caused the ParseException. */
    private String fileName;

    /** Line number where the parse exception occurred. */
```

### NonFinalFieldOfException
Non-final field `lineNumber` of exception class
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/ParseException.java`
#### Snippet
```java

    /** Line number where the parse exception occurred. */
    private int lineNumber;

    /** Column number where the parse exception occurred. */
```

## RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:^(?:[^:\\r\\n]+?)[ \\t]*:)`
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownParser.java`
#### Snippet
```java
     */
    private static final Pattern METADATA_ENTRY_PATTERN = Pattern.compile(
            "^([^:\\r\\n]+?)[ \\t]*:([\\S\\s]+?)(?=(?:^(?:[^:\\r\\n]+?)[ \\t]*:)|^[ \\t]*$)", Pattern.MULTILINE);

    /**
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:[^:\\r\\n]+?)`
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownParser.java`
#### Snippet
```java
     */
    private static final Pattern METADATA_ENTRY_PATTERN = Pattern.compile(
            "^([^:\\r\\n]+?)[ \\t]*:([\\S\\s]+?)(?=(?:^(?:[^:\\r\\n]+?)[ \\t]*:)|^[ \\t]*$)", Pattern.MULTILINE);

    /**
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
The value `new ArrayList<>()` assigned to `childEntries` is never used
in `doxia-core/src/main/java/org/apache/maven/doxia/index/IndexEntry.java`
#### Snippet
```java
    public void setChildEntries(List<IndexEntry> entries) {
        if (entries == null) {
            childEntries = new ArrayList<>();
        }

```

### UnusedAssignment
Variable `divAtts` initializer `null` is redundant
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java
        }

        SinkEventAttributes divAtts = null;
        String divClass = "verbatim";

```

