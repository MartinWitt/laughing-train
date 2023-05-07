# maven-doxia 
 
# Bad smells
I found 169 bad smells with 26 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 24 | false |
| FieldMayBeFinal | 22 | false |
| UnnecessaryToStringCall | 18 | true |
| JavadocLinkAsPlainText | 14 | false |
| EmptyStatementBody | 9 | false |
| Deprecation | 9 | false |
| DuplicatedCode | 8 | false |
| DuplicateExpressions | 6 | false |
| UnnecessaryReturn | 5 | true |
| NullableProblems | 5 | false |
| JavadocDeclaration | 4 | false |
| DataFlowIssue | 3 | false |
| CdiInjectionPointsInspection | 3 | false |
| SuspiciousMethodCalls | 3 | false |
| SimplifyStreamApiCallChains | 2 | false |
| DeprecatedIsStillUsed | 2 | false |
| RegExpRedundantEscape | 2 | false |
| IOStreamConstructor | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| IgnoreResultOfCall | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| RedundantCast | 2 | false |
| UnnecessaryUnicodeEscape | 2 | false |
| RegExpUnnecessaryNonCapturingGroup | 2 | false |
| UnusedAssignment | 2 | false |
| StringOperationCanBeSimplified | 1 | false |
| CommentedOutCode | 1 | false |
| RefusedBequest | 1 | false |
| RedundantArrayCreation | 1 | true |
| DuplicateBranchesInSwitch | 1 | false |
| RegExpSimplifiable | 1 | false |
| TrivialStringConcatenation | 1 | false |
| RegExpUnexpectedAnchor | 1 | false |
| SuspiciousInvocationHandlerImplementation | 1 | false |
| FieldCanBeLocal | 1 | false |
| TrivialIf | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| UnnecessaryLocalVariable | 1 | true |
| ArraysAsListWithZeroOrOneArgument | 1 | false |
## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.util.ReaderFactory`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/Parser.java`
#### Snippet
```java
     *
     * @param source not null reader that provides the source document.
     * You could use <code>newReader</code> methods from {@link org.codehaus.plexus.util.ReaderFactory}.
     * @param sink A sink that consumes the Doxia events.
     * @throws org.apache.maven.doxia.parser.ParseException if the model could not be parsed.
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.util.ReaderFactory`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/Parser.java`
#### Snippet
```java
     *
     * @param source not null reader that provides the source document.
     * You could use <code>newReader</code> methods from {@link org.codehaus.plexus.util.ReaderFactory}.
     * @param sink A sink that consumes the Doxia events.
     * @param reference the reference
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.util.WriterFactory`
in `doxia-modules/doxia-module-xdoc/src/main/java/org/apache/maven/doxia/module/xdoc/XdocSink.java`
#### Snippet
```java
     *
     * @param writer not null writer to write the result. <b>Should</b> be an UTF-8 Writer.
     * You could use <code>newXmlWriter</code> methods from {@link org.codehaus.plexus.util.WriterFactory}.
     */
    protected XdocSink(Writer writer) {
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.util.WriterFactory`
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptSink.java`
#### Snippet
```java
     *
     * @param writer not null writer to write the result. <b>Should</b> be an UTF-8 Writer.
     * You could use <code>newWriter</code> methods from {@link org.codehaus.plexus.util.WriterFactory}.
     */
    protected AptSink(Writer writer) {
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param entityName not null
     * @param entityValue not null
     * @throws XmlPullParserException if any
     * @see XmlPullParser#defineEntityReplacementText(String, String)
     */
```

### JavadocReference
Cannot resolve symbol `XmlPullParser`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param entityValue not null
     * @throws XmlPullParserException if any
     * @see XmlPullParser#defineEntityReplacementText(String, String)
     */
    private void addEntity(XmlPullParser parser, String entityName, String entityValue) throws XmlPullParserException {
```

### JavadocReference
Cannot resolve symbol `defineEntityReplacementText(String, String)`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param entityValue not null
     * @throws XmlPullParserException if any
     * @see XmlPullParser#defineEntityReplacementText(String, String)
     */
    private void addEntity(XmlPullParser parser, String entityName, String entityValue) throws XmlPullParserException {
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.util.xml.pull.XmlPullParserException`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param parser A parser, not null.
     * @param sink the sink to receive the events. Not null.
     * @throws org.codehaus.plexus.util.xml.pull.XmlPullParserException if there's a problem parsing the model
     */
    protected void handleComment(XmlPullParser parser, Sink sink) throws XmlPullParserException {
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.util.xml.pull.XmlPullParserException`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param parser A parser, not null.
     * @param sink the sink to receive the events.
     * @throws org.codehaus.plexus.util.xml.pull.XmlPullParserException if there's a problem parsing the model
     * @throws org.apache.maven.doxia.macro.MacroExecutionException if there's a problem executing a macro
     */
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.util.xml.pull.XmlPullParserException`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param parser A parser, not null.
     * @param sink the sink to receive the events. Not null.
     * @throws org.codehaus.plexus.util.xml.pull.XmlPullParserException if there's a problem parsing the model
     */
    protected void handleText(XmlPullParser parser, Sink sink) throws XmlPullParserException {
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param parser not null
     * @param text not null
     * @throws XmlPullParserException if any
     */
    private void addLocalEntities(XmlPullParser parser, String text) throws XmlPullParserException {
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.util.xml.pull.XmlPullParserException`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param parser A parser, not null.
     * @param sink the sink to receive the events.
     * @throws org.codehaus.plexus.util.xml.pull.XmlPullParserException if there's a problem parsing the model
     * @throws org.apache.maven.doxia.macro.MacroExecutionException if there's a problem executing a macro
     */
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.util.xml.pull.XmlPullParserException`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param parser A parser, not null.
     * @param sink the sink to receive the events. Not null.
     * @throws org.codehaus.plexus.util.xml.pull.XmlPullParserException if there's a problem parsing the model
     */
    protected void handleCdsect(XmlPullParser parser, Sink sink) throws XmlPullParserException {
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.util.xml.pull.XmlPullParserException`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     *
     * @param parser A parser, not null.
     * @throws org.codehaus.plexus.util.xml.pull.XmlPullParserException if there's a problem initializing the parser
     */
    protected void initXmlParser(XmlPullParser parser) throws XmlPullParserException {
```

### JavadocReference
Cannot resolve symbol `XmlPullParserException`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param parser not null
     * @param text not null
     * @throws XmlPullParserException if any
     */
    private void addDTDEntities(XmlPullParser parser, String text) throws XmlPullParserException {
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.util.xml.pull.XmlPullParserException`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param parser A parser, not null.
     * @param sink the sink to receive the events.
     * @throws org.codehaus.plexus.util.xml.pull.XmlPullParserException if there's a problem parsing the model
     * @throws org.apache.maven.doxia.macro.MacroExecutionException if there's a problem executing a macro
     */
```

### JavadocReference
Cannot resolve symbol `XmlPullParser`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     *
     * @param parser A parser, not null.
     * @return the {@link XmlPullParser#getText()} taking care of trimmable or collapsible configuration.
     * @see XmlPullParser#getText()
     * @see #isCollapsibleWhitespace()
```

### JavadocReference
Cannot resolve symbol `getText()`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     *
     * @param parser A parser, not null.
     * @return the {@link XmlPullParser#getText()} taking care of trimmable or collapsible configuration.
     * @see XmlPullParser#getText()
     * @see #isCollapsibleWhitespace()
```

### JavadocReference
Cannot resolve symbol `XmlPullParser`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param parser A parser, not null.
     * @return the {@link XmlPullParser#getText()} taking care of trimmable or collapsible configuration.
     * @see XmlPullParser#getText()
     * @see #isCollapsibleWhitespace()
     * @see #isTrimmableWhitespace()
```

### JavadocReference
Cannot resolve symbol `getText()`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param parser A parser, not null.
     * @return the {@link XmlPullParser#getText()} taking care of trimmable or collapsible configuration.
     * @see XmlPullParser#getText()
     * @see #isCollapsibleWhitespace()
     * @see #isTrimmableWhitespace()
```

### JavadocReference
Cannot resolve symbol `org.codehaus.plexus.util.xml.pull.XmlPullParserException`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * @param parser A parser, not null.
     * @param sink the sink to receive the events. Not null.
     * @throws org.codehaus.plexus.util.xml.pull.XmlPullParserException if there's a problem parsing the model
     */
    protected void handleEntity(XmlPullParser parser, Sink sink) throws XmlPullParserException {
```

### JavadocReference
Cannot resolve symbol `XmlPullParser`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/Xhtml5BaseParser.java`
#### Snippet
```java
     * {@inheritDoc}
     *
     * Just calls {@link #baseStartTag(XmlPullParser,Sink)}, this should be
     * overridden by implementing parsers to include additional tags.
     */
```

### JavadocReference
Cannot resolve symbol `XmlPullParser`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/Xhtml5BaseParser.java`
#### Snippet
```java
     *   Goes through a common list of possible html end tags.
     *   These should be re-usable by different xhtml-based parsers.
     *   The tags handled here are the same as for {@link #baseStartTag(XmlPullParser,Sink)},
     *   except for the empty elements ({@code <br/>, <hr/>, <img/>}).
     * </p>
```

### JavadocReference
Cannot resolve symbol `XmlPullParser`
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/Xhtml5BaseParser.java`
#### Snippet
```java
     * {@inheritDoc}
     *
     * Just calls {@link #baseEndTag(XmlPullParser,Sink)}, this should be
     * overridden by implementing parsers to include additional tags.
     */
```

## RuleId[id=DataFlowIssue]
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

## RuleId[id=SimplifyStreamApiCallChains]
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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `doxia-modules/doxia-module-xdoc/src/main/java/org/apache/maven/doxia/module/xdoc/XdocParser.java`
#### Snippet
```java
            // Do nothing
            return;
        } else if (parser.getName().equals(HEAD.toString())) {
            // Do nothing, head is closed with BODY start.
        } else if (parser.getName().equals(BODY.toString())) {
```

### EmptyStatementBody
`if` statement has empty body
in `doxia-modules/doxia-module-xdoc/src/main/java/org/apache/maven/doxia/module/xdoc/XdocParser.java`
#### Snippet
```java

            sink.verbatim_();
        } else if (parser.getName().equals(PROPERTIES_TAG.toString())) {
            // Do nothing, head is closed with BODY start.
        } else if (parser.getName().equals(MACRO_TAG.toString())) {
```

### EmptyStatementBody
`if` statement has empty body
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownSink.java`
#### Snippet
```java
    @Override
    public void paragraph_() {
        if (tableCellFlag || listNestingLevel > 0) {
            // ignore paragraphs in table cells or lists
        } else {
```

### EmptyStatementBody
`if` statement has empty body
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptSink.java`
#### Snippet
```java
     */
    public void paragraph_() {
        if (tableCellFlag) {
            // ignore paragraphs in table cells
        } else {
```

### EmptyStatementBody
`if` statement has empty body
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptSink.java`
#### Snippet
```java
     */
    public void paragraph() {
        if (tableCellFlag) {
            // ignore paragraphs in table cells
        } else if (itemFlag) {
```

### EmptyStatementBody
`if` statement has empty body
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
            } else if (eventType == XmlPullParser.ENTITY_REF) {
                handleEntity(parser, sink);
            } else if (eventType == XmlPullParser.IGNORABLE_WHITESPACE) {
                // nop
            } else if (eventType == XmlPullParser.PROCESSING_INSTRUCTION) {
```

### EmptyStatementBody
`if` statement has empty body
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
            } else if (eventType == XmlPullParser.IGNORABLE_WHITESPACE) {
                // nop
            } else if (eventType == XmlPullParser.PROCESSING_INSTRUCTION) {
                // nop
            } else if (eventType == XmlPullParser.DOCDECL) {
```

### EmptyStatementBody
`if` statement has empty body
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/Xhtml5BaseParser.java`
#### Snippet
```java
    protected void handleEndTag(XmlPullParser parser, Sink sink)
            throws XmlPullParserException, MacroExecutionException {
        if (!baseEndTag(parser, sink)) {
            // unrecognized tag is already logged in StartTag
        }
```

### EmptyStatementBody
`if` statement has empty body
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java

            j = skipSpaceFrom(j + 1);
            if (j == textLength) {
                // TODO: this doesn't handle the case of a dd in a paragraph
                // throw new AptParseException("no definition");
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary arguments
in `doxia-core/src/main/java/org/apache/maven/doxia/util/HtmlTools.java`
#### Snippet
```java
                            int codePoint = toCodePoint(c, url.charAt(++i));
                            unicode = toChars(codePoint);
                            bytes = (new String(unicode, 0, unicode.length)).getBytes(StandardCharsets.UTF_8);
                        } else {
                            unicode[0] = c;
```

## RuleId[id=CommentedOutCode]
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

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'encodeAnchor' is still used
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String encodeAnchor(String id) {
        if (id == null) {
            return null;
```

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

## RuleId[id=RegExpRedundantEscape]
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

## RuleId[id=RefusedBequest]
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

## RuleId[id=RedundantArrayCreation]
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

## RuleId[id=DuplicateBranchesInSwitch]
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
            if (s == null || s.length() < 1) {
                return s;
            }

            String result = s;

            // use some outrageously out-of-place chars for text
            // (these are device control one/two in unicode)
            result = StringUtils.replace(result, "\\=", "\u0011");
            result = StringUtils.replace(result, "\\|", "\u0012");

            return result;
```

### DuplicatedCode
Duplicated code
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
            if (s == null || s.length() < 1) {
                return s;
            }

            String result = s;

            result = StringUtils.replace(result, "\u0011", "=");
            result = StringUtils.replace(result, "\u0012", "|");

            return result;
```

### DuplicatedCode
Duplicated code
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptSink.java`
#### Snippet
```java
        for (int i = 0; i < cellCount; i++) {
            if (cellJustif != null) {
                switch (cellJustif[i]) {
                    case 1:
                        rLine.append(TABLE_COL_LEFT_ALIGNED_MARKUP);
                        break;
                    case 2:
                        rLine.append(TABLE_COL_RIGHT_ALIGNED_MARKUP);
                        break;
                    default:
                        rLine.append(TABLE_COL_CENTERED_ALIGNED_MARKUP);
                }
            } else {
                rLine.append(TABLE_COL_CENTERED_ALIGNED_MARKUP);
            }
        }
        rLine.append(EOL);

        this.rowLine = rLine.toString();
```

### DuplicatedCode
Duplicated code
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptSink.java`
#### Snippet
```java
            List<String> tags = new ArrayList<>();

            if (attributes != null) {

                if (attributes.containsAttribute(SinkEventAttributes.SEMANTICS, "italic")) {
                    write(ITALIC_START_MARKUP);
                    tags.add(0, ITALIC_END_MARKUP);
                }

                if (attributes.containsAttribute(SinkEventAttributes.SEMANTICS, "bold")) {
                    write(BOLD_START_MARKUP);
                    tags.add(0, BOLD_END_MARKUP);
                }

                if (attributes.containsAttribute(SinkEventAttributes.SEMANTICS, "code")) {
                    write(MONOSPACED_START_MARKUP);
                    tags.add(0, MONOSPACED_END_MARKUP);
                }
            }

            inlineStack.push(tags);
```

### DuplicatedCode
Duplicated code
in `doxia-modules/doxia-module-fml/src/main/java/org/apache/maven/doxia/module/fml/FmlParser.java`
#### Snippet
```java
        if (!isSecondParsing()) {
            macroName = parser.getAttributeValue(null, Attribute.NAME.toString());

            if (macroParameters == null) {
                macroParameters = new HashMap<>();
            }

            if (StringUtils.isEmpty(macroName)) {
                throw new MacroExecutionException("The '" + Attribute.NAME.toString() + "' attribute for the '"
                        + MACRO_TAG.toString() + "' tag is required.");
            }
        }
```

### DuplicatedCode
Duplicated code
in `doxia-modules/doxia-module-fml/src/main/java/org/apache/maven/doxia/module/fml/FmlParser.java`
#### Snippet
```java
        if (!isSecondParsing()) {
            if (StringUtils.isNotEmpty(macroName)) {
                String paramName = parser.getAttributeValue(null, Attribute.NAME.toString());
                String paramValue = parser.getAttributeValue(null, Attribute.VALUE.toString());

                if (StringUtils.isEmpty(paramName) || StringUtils.isEmpty(paramValue)) {
                    throw new MacroExecutionException("'" + Attribute.NAME.toString()
                            + "' and '" + Attribute.VALUE.toString() + "' attributes for the '" + PARAM.toString()
                            + "' tag are required inside the '" + MACRO_TAG.toString() + "' tag.");
                }

                macroParameters.put(paramName, paramValue);
            } else {
                // param tag from non-macro object, see MSITE-288
                handleUnknown(parser, sink, TAG_TYPE_START);
            }
        }
```

### DuplicatedCode
Duplicated code
in `doxia-modules/doxia-module-xdoc/src/main/java/org/apache/maven/doxia/module/xdoc/XdocParser.java`
#### Snippet
```java
        this.sourceContent = null;

        try (Reader reader = source) {
            StringWriter contentWriter = new StringWriter();
            IOUtils.copy(reader, contentWriter);
            sourceContent = contentWriter.toString();
        } catch (IOException ex) {
            throw new ParseException("Error reading the input source", ex);
        }

        // leave this at default (false) until everything is properly implemented, see DOXIA-226
        // setIgnorableWhitespace(true);

        try {
            super.parse(new StringReader(sourceContent), sink, reference);
        } finally {
            this.sourceContent = null;
        }
```

### DuplicatedCode
Duplicated code
in `doxia-modules/doxia-module-xdoc/src/main/java/org/apache/maven/doxia/module/xdoc/XdocParser.java`
#### Snippet
```java
        String name = parser.getAttributeValue(null, Attribute.NAME.toString());
        String content = parser.getAttributeValue(null, Attribute.CONTENT.toString());

        if ("author".equals(name)) {
            sink.author(null);
            sink.text(content);
            sink.author_();
        } else if ("date".equals(name)) {
            sink.date(null);
            sink.text(content);
            sink.date_();
        } else {
            sink.unknown("meta", new Object[] {TAG_TYPE_SIMPLE}, attribs);
        }
```

## RuleId[id=RegExpSimplifiable]
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

## RuleId[id=DuplicateExpressions]
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

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
            throws IOException {
        this.sinkFactory = sinkFactory;
        this.coreOutputStream = new FileOutputStream(new File(outputDirectory, outputName));
        this.encoding = encoding;
        this.currentSink = sinkFactory.createSink(coreOutputStream, encoding);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
    public RandomAccessSink(SinkFactory sinkFactory, File outputDirectory, String outputName) throws IOException {
        this.sinkFactory = sinkFactory;
        this.coreOutputStream = new FileOutputStream(new File(outputDirectory, outputName));
        this.currentSink = sinkFactory.createSink(coreOutputStream);
        this.coreSink = this.currentSink;
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java
            }

            final StringBuilder buffer = new StringBuilder(comment.length() + 7);

            buffer.append(LESS_THAN).append(BANG).append(MINUS).append(MINUS);
```

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

## RuleId[id=Deprecation]
### Deprecation
'getBasedir()' is deprecated
in `doxia-modules/doxia-module-xdoc/src/main/java/org/apache/maven/doxia/module/xdoc/XdocParser.java`
#### Snippet
```java
    private void handleMacroEnd(Sink sink) throws MacroExecutionException {
        if (!isSecondParsing() && StringUtils.isNotEmpty(macroName)) {
            MacroRequest request = new MacroRequest(sourceContent, new XdocParser(), macroParameters, getBasedir());

            try {
```

### Deprecation
'encodeId(java.lang.String)' is deprecated
in `doxia-core/src/main/java/org/apache/maven/doxia/index/IndexingSink.java`
#### Snippet
```java
                entry.setTitle(title);

                entry.setId(getUniqueId(HtmlTools.encodeId(title)));

                break;
```

### Deprecation
'encodeId(java.lang.String)' is deprecated
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/toc/TocMacro.java`
#### Snippet
```java
        if (fromDepth <= n) {
            sink.listItem();
            sink.link("#" + HtmlTools.encodeId(sectionIndex.getId()));
            sink.text(sectionIndex.getTitle());
            sink.link_();
```

### Deprecation
'encodeId(java.lang.String)' is deprecated
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/toc/TocMacro.java`
#### Snippet
```java
                    if (n == toDepth - 1) {
                        sink.listItem();
                        sink.link("#" + HtmlTools.encodeId(subsectionIndex.getId()));
                        sink.text(subsectionIndex.getTitle());
                        sink.link_();
```

### Deprecation
'getBasedir()' is deprecated
in `doxia-modules/doxia-module-xhtml5/src/main/java/org/apache/maven/doxia/module/xhtml5/Xhtml5Parser.java`
#### Snippet
```java
        }

        MacroRequest request = new MacroRequest(sourceContent, new Xhtml5Parser(), parameters, getBasedir());

        try {
```

### Deprecation
'getBasedir()' is deprecated
in `doxia-modules/doxia-module-fml/src/main/java/org/apache/maven/doxia/module/fml/FmlParser.java`
#### Snippet
```java
        if (!isSecondParsing()) {
            if (StringUtils.isNotEmpty(macroName)) {
                MacroRequest request = new MacroRequest(sourceContent, new FmlParser(), macroParameters, getBasedir());

                try {
```

### Deprecation
'com.vladsch.flexmark.ast.util.TextCollectingVisitor' is deprecated
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownParser.java`
#### Snippet
```java
            if (firstNode != null && firstNode instanceof Heading) {
                html.append("<title>");
                TextCollectingVisitor collectingVisitor = new TextCollectingVisitor();
                String headingText = collectingVisitor.collectAndGetText(firstNode);
                html.append(HtmlTools.escapeHTML(headingText, false));
```

### Deprecation
'com.vladsch.flexmark.ast.util.TextCollectingVisitor' is deprecated
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownParser.java`
#### Snippet
```java
            if (firstNode != null && firstNode instanceof Heading) {
                html.append("<title>");
                TextCollectingVisitor collectingVisitor = new TextCollectingVisitor();
                String headingText = collectingVisitor.collectAndGetText(firstNode);
                html.append(HtmlTools.escapeHTML(headingText, false));
```

### Deprecation
'getBasedir()' is deprecated
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
            // getBasedir() does not work in multi-module builds, see DOXIA-373
            // the basedir should be injected from here, see DOXIA-224
            MacroRequest request = new MacroRequest(sourceContent, new AptParser(), parameters, getBasedir());
            try {
                AptParser.this.executeMacro(macroId, request, sink);
```

## RuleId[id=UnnecessaryReturn]
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
in `doxia-modules/doxia-module-fml/src/main/java/org/apache/maven/doxia/module/fml/FmlParser.java`
#### Snippet
```java
        if (parser.getName().equals(FAQS_TAG.toString())) {
            // Do nothing
            return;
        } else if (parser.getName().equals(PART_TAG.toString())) {
            faqs.addPart(currentPart);
```

## RuleId[id=CdiInjectionPointsInspection]
### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/manager/DefaultParserManager.java`
#### Snippet
```java
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    @Inject
    private Map<String, Parser> parsers;

    /** {@inheritDoc} */
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/module/DefaultParserModuleManager.java`
#### Snippet
```java
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    @Inject
    private Map<String, ParserModule> parserModules;

    private Collection<ParserModule> parserModulesValues;
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/manager/DefaultMacroManager.java`
#### Snippet
```java
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    @Inject
    private Map<String, Macro> macros;

    /** {@inheritDoc} */
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownSink.java`
#### Snippet
```java
            write(EOL);
        } else {
            write("" + SPACE + SPACE + EOL);
        }
    }
```

## RuleId[id=UnnecessaryToStringCall]
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
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownSink.java`
#### Snippet
```java
    public void table_() {
        if (tableCaptionBuffer.length() > 0) {
            text(tableCaptionBuffer.toString() + EOL);
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

        sb.append(SinkUtils.getAttributeString(att));
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

## RuleId[id=RegExpUnexpectedAnchor]
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

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/SinkEventAttributeSet.java`
#### Snippet
```java
    /** {@inheritDoc} */
    public boolean isDefined(Object attrName) {
        return attribs.containsKey(attrName);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/SinkEventAttributeSet.java`
#### Snippet
```java
    /** {@inheritDoc} */
    public Object getAttribute(Object key) {
        Object value = attribs.get(key);

        if (value == null) {
```

### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/SinkEventAttributeSet.java`
#### Snippet
```java
    /** {@inheritDoc} */
    public void removeAttribute(Object name) {
        attribs.remove(name);
    }

```

## RuleId[id=SuspiciousInvocationHandlerImplementation]
### SuspiciousInvocationHandlerImplementation
Null might be returned when proxying method 'equals()': this may cause NullPointerException
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/PipelineSink.java`
#### Snippet
```java
        }

        return null;
    }

```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/FlexmarkDoxiaLinkResolver.java`
#### Snippet
```java
    /** {@inheritDoc} */
    @Override
    public @NotNull ResolvedLink resolveLink(
            @NotNull Node node, @NotNull LinkResolverBasicContext context, @NotNull ResolvedLink link) {
        if (link.getLinkType() == LinkType.LINK) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/FlexmarkDoxiaLinkResolver.java`
#### Snippet
```java
    @Override
    public @NotNull ResolvedLink resolveLink(
            @NotNull Node node, @NotNull LinkResolverBasicContext context, @NotNull ResolvedLink link) {
        if (link.getLinkType() == LinkType.LINK) {
            Matcher matcher = this.pattern.matcher(link.getUrl());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/FlexmarkDoxiaLinkResolver.java`
#### Snippet
```java
    @Override
    public @NotNull ResolvedLink resolveLink(
            @NotNull Node node, @NotNull LinkResolverBasicContext context, @NotNull ResolvedLink link) {
        if (link.getLinkType() == LinkType.LINK) {
            Matcher matcher = this.pattern.matcher(link.getUrl());
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/FlexmarkDoxiaLinkResolver.java`
#### Snippet
```java

        @Override
        public @NotNull LinkResolver apply(@NotNull LinkResolverBasicContext context) {
            return new FlexmarkDoxiaLinkResolver(context);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/FlexmarkDoxiaLinkResolver.java`
#### Snippet
```java

        @Override
        public @NotNull LinkResolver apply(@NotNull LinkResolverBasicContext context) {
            return new FlexmarkDoxiaLinkResolver(context);
        }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-modules/doxia-module-xdoc/src/main/java/org/apache/maven/doxia/module/xdoc/XdocMarkup.java`
#### Snippet
```java
@SuppressWarnings("checkstyle:interfaceistype")
public interface XdocMarkup extends HtmlMarkup {
    /** XDOC namespace: "http://maven.apache.org/XDOC/2.0" */
    String XDOC_NAMESPACE = "http://maven.apache.org/XDOC/2.0";

```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-modules/doxia-module-xdoc/src/main/java/org/apache/maven/doxia/module/xdoc/XdocMarkup.java`
#### Snippet
```java
    String XDOC_NAMESPACE = "http://maven.apache.org/XDOC/2.0";

    /** XDOC system id: "https://maven.apache.org/xsd/xdoc-2.0.xsd" */
    String XDOC_SYSTEM_ID = "https://maven.apache.org/xsd/xdoc-2.0.xsd";

```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/FlexmarkDoxiaLinkResolver.java`
#### Snippet
```java
 *
 * Sample links it leaves untouched:
 * - http://doc.md
 * - https://doc.markdown
 * - doc.md.badformat
```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/FlexmarkDoxiaLinkResolver.java`
#### Snippet
```java
 * Sample links it leaves untouched:
 * - http://doc.md
 * - https://doc.markdown
 * - doc.md.badformat
 * - doc.md#bad#format
```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-modules/doxia-module-xhtml5/src/main/java/org/apache/maven/doxia/module/xhtml5/Xhtml5Markup.java`
#### Snippet
```java
@SuppressWarnings("checkstyle:interfaceistype")
public interface Xhtml5Markup extends HtmlMarkup {
    /** XHTML5 namespace: "http://www.w3.org/1999/xhtml" */
    String XHTML5_NAMESPACE = "http://www.w3.org/1999/xhtml";
}
```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-core/src/main/java/org/apache/maven/doxia/util/DoxiaUtils.java`
#### Snippet
```java
     * "https:/", "ftp:/", "mailto:", "file:/", or contains the string "://".
     * Note that Windows style separators "\" are not allowed
     * for URIs, see  http://www.ietf.org/rfc/rfc2396.txt , section 2.4.3.
     *
     * @throws NullPointerException if link is null.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-core/src/main/java/org/apache/maven/doxia/markup/XmlMarkup.java`
#### Snippet
```java
@SuppressWarnings("checkstyle:interfaceistype")
public interface XmlMarkup extends Markup {
    /** XML namespace: "http://www.w3.org/2001/XMLSchema-instance" */
    String XML_NAMESPACE = "http://www.w3.org/2001/XMLSchema-instance";

```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-modules/doxia-module-fml/src/main/java/org/apache/maven/doxia/module/fml/FmlMarkup.java`
#### Snippet
```java
    String FML_NAMESPACE = "http://maven.apache.org/FML/1.0.1";

    /** FML system id: "https://maven.apache.org/xsd/fml-1.0.1.xsd" */
    String FML_SYSTEM_ID = "https://maven.apache.org/xsd/fml-1.0.1.xsd";

```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-modules/doxia-module-fml/src/main/java/org/apache/maven/doxia/module/fml/FmlMarkup.java`
#### Snippet
```java
@SuppressWarnings("checkstyle:interfaceistype")
public interface FmlMarkup extends HtmlMarkup {
    /** FML namespace: "http://maven.apache.org/FML/1.0.1" */
    String FML_NAMESPACE = "http://maven.apache.org/FML/1.0.1";

```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     *   &lt;!-- These are the entity sets for ISO Latin 1 characters for the XHTML --&gt;
     *   &lt;!ENTITY % HTMLlat1 PUBLIC "-//W3C//ENTITIES Latin 1 for XHTML//EN"
     *          "http://www.w3.org/TR/xhtml1/DTD/xhtml-lat1.ent"&gt;
     *   %HTMLlat1;
     * ]&gt;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * The entities used:
     * <ul>
     * <li>http://www.w3.org/TR/xhtml1/DTD/xhtml-lat1.ent</li>
     * <li>http://www.w3.org/TR/xhtml1/DTD/xhtml-special.ent</li>
     * <li>http://www.w3.org/TR/xhtml1/DTD/xhtml-symbol.ent</li>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * <ul>
     * <li>http://www.w3.org/TR/xhtml1/DTD/xhtml-lat1.ent</li>
     * <li>http://www.w3.org/TR/xhtml1/DTD/xhtml-special.ent</li>
     * <li>http://www.w3.org/TR/xhtml1/DTD/xhtml-symbol.ent</li>
     * </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/AbstractXmlParser.java`
#### Snippet
```java
     * <li>http://www.w3.org/TR/xhtml1/DTD/xhtml-lat1.ent</li>
     * <li>http://www.w3.org/TR/xhtml1/DTD/xhtml-special.ent</li>
     * <li>http://www.w3.org/TR/xhtml1/DTD/xhtml-symbol.ent</li>
     * </ul>
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `doxia-core/src/main/java/org/apache/maven/doxia/util/XmlValidator.java`
#### Snippet
```java
    private static final Pattern PATTERN_DOCTYPE = Pattern.compile(".*" + XmlMarkup.DOCTYPE_START + "([^>]*)>.*");

    /** Tag pattern as defined in http://www.w3.org/TR/REC-xml/#NT-Name */
    private static final Pattern PATTERN_TAG = Pattern.compile(".*<([A-Za-z][A-Za-z0-9:_.-]*)([^>]*)>.*");

```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/toc/TocMacro.java`
#### Snippet
```java
public class TocMacro extends AbstractMacro {
    /** The section to display. */
    private int section;

    /** Start depth. */
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/Xhtml5BaseParser.java`
#### Snippet
```java
        String givenTableClass = parser.getAttributeValue(null, Attribute.CLASS.toString());
        boolean grid = false;
        if (givenTableClass != null
                && BODYTABLEBORDER_CLASS_PATTERN.matcher(givenTableClass).matches()) {
            grid = true;
```

## RuleId[id=IgnoreResultOfCall]
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

## RuleId[id=NonStrictComparisonCanBeEquality]
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

## RuleId[id=ConditionCoveredByFurtherCondition]
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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `null` to `SinkEventAttributeSet` is redundant
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java
    @Override
    public void tableHeaderCell() {
        tableHeaderCell((SinkEventAttributeSet) null);
    }

```

### RedundantCast
Casting `null` to `SinkEventAttributeSet` is redundant
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/Xhtml5BaseSink.java`
#### Snippet
```java
    @Override
    public void tableCell() {
        tableCell((SinkEventAttributeSet) null);
    }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `doxia-core/src/main/java/org/apache/maven/doxia/util/DoxiaUtils.java`
#### Snippet
```java
     * If link is not null, then exactly one of the three methods
     * {@link #isInternalLink(java.lang.String)}, {@link #isExternalLink(java.lang.String)} and
     * {@link #isLocalLink(java.lang.String)} will return true.
     *
     * @param link The link to check. Not null.
```

### JavadocDeclaration
Javadoc pointing to itself
in `doxia-core/src/main/java/org/apache/maven/doxia/util/DoxiaUtils.java`
#### Snippet
```java
     * ie it is a link to an anchor within the same document.
     * If link is not null, then exactly one of the three methods
     * {@link #isInternalLink(java.lang.String)}, {@link #isExternalLink(java.lang.String)} and
     * {@link #isLocalLink(java.lang.String)} will return true.
     *
```

### JavadocDeclaration
Javadoc pointing to itself
in `doxia-core/src/main/java/org/apache/maven/doxia/util/DoxiaUtils.java`
#### Snippet
```java
     * to another document (a local link) of the same site.
     * If link is not null, then exactly one of the three methods
     * {@link #isInternalLink(java.lang.String)}, {@link #isExternalLink(java.lang.String)} and
     * {@link #isLocalLink(java.lang.String)} will return true.
     *
```

### JavadocDeclaration
`@param id` tag description is missing
in `doxia-core/src/main/java/org/apache/maven/doxia/index/IndexingSink.java`
#### Snippet
```java
     * Converts the given id into a unique one by potentially suffixing it with an index value.
     *
     * @param id
     * @return the unique id
     */
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `fileName` may be 'final'
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/ParseException.java`
#### Snippet
```java

    /** The file that caused the ParseException. */
    private String fileName;

    /** Line number where the parse exception occurred. */
```

### FieldMayBeFinal
Field `columnNumber` may be 'final'
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/ParseException.java`
#### Snippet
```java

    /** Column number where the parse exception occurred. */
    private int columnNumber;

    /**
```

### FieldMayBeFinal
Field `lineNumber` may be 'final'
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/ParseException.java`
#### Snippet
```java

    /** Line number where the parse exception occurred. */
    private int lineNumber;

    /** Column number where the parse exception occurred. */
```

### FieldMayBeFinal
Field `pipeline` may be 'final'
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/PipelineSink.java`
#### Snippet
```java
 */
public class PipelineSink implements InvocationHandler {
    private List<Sink> pipeline;

    /**
```

### FieldMayBeFinal
Field `cache` may be 'final'
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/snippet/SnippetMacro.java`
#### Snippet
```java
     * Holds the cache.
     */
    private static Map<String, String> cache = new HashMap<>();

    private static final int HOUR = 60;
```

### FieldMayBeFinal
Field `timeCached` may be 'final'
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/snippet/SnippetMacro.java`
#### Snippet
```java
     * Holds the time cache.
     */
    private static Map<String, Long> timeCached = new HashMap<>();

    /**
```

### FieldMayBeFinal
Field `source` may be 'final'
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/snippet/SnippetReader.java`
#### Snippet
```java

    /** The source. */
    private URL source;

    /** The encoding of the source. */
```

### FieldMayBeFinal
Field `encoding` may be 'final'
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/snippet/SnippetReader.java`
#### Snippet
```java

    /** The encoding of the source. */
    private String encoding;

    /**
```

### FieldMayBeFinal
Field `parameters` may be 'final'
in `doxia-core/src/main/java/org/apache/maven/doxia/macro/MacroRequest.java`
#### Snippet
```java

    /** A map of parameters. */
    private Map<String, Object> parameters;

    /**
```

### FieldMayBeFinal
Field `outputStreams` may be 'final'
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
    private List<Sink> sinks = new ArrayList<>();

    private List<ByteArrayOutputStream> outputStreams = new ArrayList<>();

    private Sink currentSink;
```

### FieldMayBeFinal
Field `coreOutputStream` may be 'final'
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
    private String encoding;

    private OutputStream coreOutputStream;

    private Sink coreSink;
```

### FieldMayBeFinal
Field `coreSink` may be 'final'
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
    private OutputStream coreOutputStream;

    private Sink coreSink;

    private List<Sink> sinks = new ArrayList<>();
```

### FieldMayBeFinal
Field `sinkFactory` may be 'final'
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
 */
public class RandomAccessSink implements Sink {
    private SinkFactory sinkFactory;

    private String encoding;
```

### FieldMayBeFinal
Field `sinks` may be 'final'
in `doxia-core/src/main/java/org/apache/maven/doxia/sink/impl/RandomAccessSink.java`
#### Snippet
```java
    private Sink coreSink;

    private List<Sink> sinks = new ArrayList<>();

    private List<ByteArrayOutputStream> outputStreams = new ArrayList<>();
```

### FieldMayBeFinal
Field `name` may be 'final'
in `doxia-core/src/main/java/org/apache/maven/doxia/util/ByLineReaderSource.java`
#### Snippet
```java
    private boolean ungetted = false;

    private String name;

    /**
```

### FieldMayBeFinal
Field `word` may be 'final'
in `doxia-core/src/main/java/org/apache/maven/doxia/util/LineBreaker.java`
#### Snippet
```java

    /** The string buffer to store the current text. */
    private StringBuilder word = new StringBuilder(1024);

    /**
```

### FieldMayBeFinal
Field `destination` may be 'final'
in `doxia-core/src/main/java/org/apache/maven/doxia/util/LineBreaker.java`
#### Snippet
```java

    /** The destination writer. */
    private Writer destination;

    /** The writer to use. */
```

### FieldMayBeFinal
Field `maxLineLength` may be 'final'
in `doxia-core/src/main/java/org/apache/maven/doxia/util/LineBreaker.java`
#### Snippet
```java

    /** The maximal line length. */
    private int maxLineLength;

    /** The current line length. */
```

### FieldMayBeFinal
Field `writer` may be 'final'
in `doxia-core/src/main/java/org/apache/maven/doxia/util/LineBreaker.java`
#### Snippet
```java

    /** The writer to use. */
    private BufferedWriter writer;

    /** The maximal line length. */
```

### FieldMayBeFinal
Field `divStack` may be 'final'
in `doxia-core/src/main/java/org/apache/maven/doxia/parser/Xhtml5BaseParser.java`
#### Snippet
```java

    /** Used to keep track of closing tags for content events */
    private Stack<String> divStack = new Stack<>();

    /** Used to wrap the definedTerm with its definition, even when one is omitted */
```

### FieldMayBeFinal
Field `numbering` may be 'final'
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
    private class NumberedListItem extends Block {
        /** numbering. */
        private int numbering;

        /**
```

### FieldMayBeFinal
Field `source` may be 'final'
in `doxia-modules/doxia-module-apt/src/main/java/org/apache/maven/doxia/module/apt/AptParser.java`
#### Snippet
```java
    private class Verbatim extends Block {
        /** source. */
        private boolean source;

        /**
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0159` can be replaced with 'ř'
in `doxia-core/src/main/java/org/apache/maven/doxia/util/HtmlTools.java`
#### Snippet
```java
     * <b>Note</b>: all unicode entities are decoded, i.e.:
     * <pre>
     * &#38;#x159;   = \u0159
     * &#38;#x1d7ed; = \uD835\uDFED
     * </pre>
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0159` can be replaced with 'ř'
in `doxia-core/src/main/java/org/apache/maven/doxia/util/HtmlTools.java`
#### Snippet
```java
     * <b>Note</b>: all characters are encoded, i.e.:
     * <pre>
     * \u0159       = &#38;#x159;
     * \uD835\uDFED = &#38;#x1d7ed;
     * </pre>
```

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `doxia-modules/doxia-module-markdown/src/main/java/org/apache/maven/doxia/module/markdown/MarkdownParser.java`
#### Snippet
```java
        MutableDataSet flexmarkMetadataOptions = new MutableDataSet();
        flexmarkMetadataOptions.set(
                com.vladsch.flexmark.parser.Parser.EXTENSIONS, Arrays.asList(YamlFrontMatterExtension.create()));
        FLEXMARK_METADATA_PARSER = com.vladsch.flexmark.parser.Parser.builder(flexmarkMetadataOptions)
                .build();
```

## RuleId[id=UnusedAssignment]
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

