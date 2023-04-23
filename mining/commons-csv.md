# commons-csv 
 
# Bad smells
I found 96 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DeprecatedIsStillUsed | 36 | false |
| UnnecessaryUnboxing | 13 | false |
| ReturnNull | 9 | false |
| RedundantSuppression | 7 | false |
| UnnecessarySuperQualifier | 4 | false |
| UnnecessaryFullyQualifiedName | 4 | false |
| NestedAssignment | 4 | false |
| UnnecessaryToStringCall | 3 | true |
| UnnecessaryBoxing | 3 | false |
| DataFlowIssue | 2 | false |
| AssignmentToMethodParameter | 2 | false |
| IgnoreResultOfCall | 2 | false |
| IOResource | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| SystemOutErr | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| NonShortCircuitBoolean | 1 | false |
| AssignmentToForLoopParameter | 1 | false |
## RuleId[id=IOResource]
### IOResource
'ExtendedBufferedReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java

        @SuppressWarnings("resource") // Temp reader on input reader.
        final ExtendedBufferedReader bufferedReader = new ExtendedBufferedReader(reader);
        final char[] delim = getDelimiterString().toCharArray();
        final int delimLength = delim.length;
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
            return;
        case MINIMAL:
            if (len <= 0) {
                // always quote an empty token that is the first
                // on the line, as it may be the only thing on the
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    public CSVPrinter printer() throws IOException {
        return new CSVPrinter(System.out, this);
    }

```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/csv/CSVPrinter.java`
#### Snippet
```java
            println();
        }
        appendable.append(format.getCommentMarker().charValue());
        appendable.append(SP);
        for (int i = 0; i < comment.length(); i++) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/csv/CSVPrinter.java`
#### Snippet
```java
            case LF:
                println();
                appendable.append(format.getCommentMarker().charValue());
                appendable.append(SP);
                break;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/csv/CSVRecord.java`
#### Snippet
```java
        }
        try {
            return values[index.intValue()];
        } catch (final ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException(String.format(
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/csv/CSVRecord.java`
#### Snippet
```java
     */
    public boolean isSet(final String name) {
        return isMapped(name) && getHeaderMapRaw().get(name).intValue() < values.length;
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/csv/Lexer.java`
#### Snippet
```java

    private char mapNullToDisabled(final Character c) {
        return c == null ? DISABLED : c.charValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
        final char[] delim = getDelimiterString().toCharArray();
        final int delimLength = delim.length;
        final char escape = getEscapeCharacter().charValue();

        while (pos < end) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
        int pos = 0;

        final char quote = getQuoteCharacter().charValue();
        final StringBuilder builder = new StringBuilder(IOUtils.DEFAULT_BUFFER_SIZE);

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
        final char[] delim = getDelimiterString().toCharArray();
        final int delimLength = delim.length;
        final char quoteChar = getQuoteCharacter().charValue();
        // If escape char not specified, default to the quote char
        // This avoids having to keep checking whether there is an escape character
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
        // This avoids having to keep checking whether there is an escape character
        // at the cost of checking against quote twice
        final char escapeChar = isEscapeCharacterSet() ? getEscapeCharacter().charValue() : quoteChar;

        QuoteMode quoteModePolicy = getQuoteMode();
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
        final char[] delim = getDelimiterString().toCharArray();
        final int delimLength = delim.length;
        final char escape = getEscapeCharacter().charValue();
        final StringBuilder builder = new StringBuilder(IOUtils.DEFAULT_BUFFER_SIZE);

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
        }

        if (quoteCharacter != null && contains(delimiter, quoteCharacter.charValue())) {
            throw new IllegalArgumentException("The quoteChar character and the delimiter cannot be the same ('" + quoteCharacter + "')");
        }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
        }

        if (escapeCharacter != null && contains(delimiter, escapeCharacter.charValue())) {
            throw new IllegalArgumentException("The escape character and the delimiter cannot be the same ('" + escapeCharacter + "')");
        }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
        }

        if (commentMarker != null && contains(delimiter, commentMarker.charValue())) {
            throw new IllegalArgumentException("The comment start character and the delimiter cannot be the same ('" + commentMarker + "')");
        }
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/csv/ExtendedBufferedReader.java`
#### Snippet
```java
    char[] lookAhead(final char[] buf) throws IOException {
        final int n = buf.length;
        super.mark(n);
        super.read(buf, 0, n);
        super.reset();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/csv/ExtendedBufferedReader.java`
#### Snippet
```java
        super.mark(n);
        super.read(buf, 0, n);
        super.reset();

        return buf;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/csv/ExtendedBufferedReader.java`
#### Snippet
```java
     */
    int lookAhead() throws IOException {
        super.mark(1);
        final int c = super.read();
        super.reset();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/csv/ExtendedBufferedReader.java`
#### Snippet
```java
        super.mark(1);
        final int c = super.read();
        super.reset();

        return c;
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/csv/CSVParser.java`
#### Snippet
```java
 * </p>
 * <ul>
 *     <li>{@link #parse(java.io.File, Charset, CSVFormat)}</li>
 *     <li>{@link #parse(String, CSVFormat)}</li>
 *     <li>{@link #parse(java.net.URL, java.nio.charset.Charset, CSVFormat)}</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.net` is unnecessary and can be removed
in `src/main/java/org/apache/commons/csv/CSVParser.java`
#### Snippet
```java
 *     <li>{@link #parse(java.io.File, Charset, CSVFormat)}</li>
 *     <li>{@link #parse(String, CSVFormat)}</li>
 *     <li>{@link #parse(java.net.URL, java.nio.charset.Charset, CSVFormat)}</li>
 * </ul>
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `src/main/java/org/apache/commons/csv/CSVParser.java`
#### Snippet
```java
 *     <li>{@link #parse(java.io.File, Charset, CSVFormat)}</li>
 *     <li>{@link #parse(String, CSVFormat)}</li>
 *     <li>{@link #parse(java.net.URL, java.nio.charset.Charset, CSVFormat)}</li>
 * </ul>
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/csv/CSVParser.java`
#### Snippet
```java
 * Alternatively parsers can also be created by passing a {@link Reader} directly to the sole constructor.
 *
 * For those who like fluent APIs, parsers can be created using {@link CSVFormat#parse(java.io.Reader)} as a shortcut:
 * </p>
 * <pre>
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `src/main/java/org/apache/commons/csv/CSVRecord.java`
#### Snippet
```java
     */
    public boolean isSet(final String name) {
        return isMapped(name) && getHeaderMapRaw().get(name).intValue() < values.length;
    }

```

### DataFlowIssue
Method invocation `forEach` may produce `NullPointerException`
in `src/main/java/org/apache/commons/csv/CSVRecord.java`
#### Snippet
```java
            return map;
        }
        getHeaderMapRaw().forEach((key, value) -> {
            if (value < values.length) {
                map.put(key, values[value]);
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`length = length - 1` could be simplified to 'length -= 1'
in `src/main/java/org/apache/commons/csv/Lexer.java`
#### Snippet
```java
        int length = buffer.length();
        while (length > 0 && Character.isWhitespace(buffer.charAt(length - 1))) {
            length = length - 1;
        }
        if (length != buffer.length()) {
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/csv/IOUtils.java`
#### Snippet
```java
        long count = 0;
        int n;
        while (EOF != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
            count += n;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/csv/IOUtils.java`
#### Snippet
```java
        long count = 0;
        int n;
        while (EOF != (n = input.read(buffer))) {
            ((Buffer) buffer).flip();
            output.append(buffer, 0, n);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java

        int c;
        while (-1 != (c = reader.read())) {
            builder.append((char) c);
            if (c == quote) {
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java

        int c;
        while (-1 != (c = bufferedReader.read())) {
            builder.append((char) c);
            final boolean isDelimiterStart = isDelimiter((char) c, builder.toString() + new String(bufferedReader.lookAhead(delimLength - 1)), pos, delim,
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'withCommentMarker' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withCommentMarker(final char commentMarker) {
        return builder().setCommentMarker(commentMarker).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withQuote' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withQuote(final char quoteChar) {
        return builder().setQuote(quoteChar).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withRecordSeparator' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withRecordSeparator(final char recordSeparator) {
        return builder().setRecordSeparator(recordSeparator).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withHeader' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withHeader(final ResultSetMetaData resultSetMetaData) throws SQLException {
        return builder().setHeader(resultSetMetaData).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getAllowDuplicateHeaderNames' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public boolean getAllowDuplicateHeaderNames() {
        return duplicateHeaderMode == DuplicateHeaderMode.ALLOW_ALL;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withHeader' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withHeader(final ResultSet resultSet) throws SQLException {
        return builder().setHeader(resultSet).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withEscape' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withEscape(final Character escape) {
        return builder().setEscape(escape).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withSkipHeaderRecord' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withSkipHeaderRecord(final boolean skipHeaderRecord) {
        return builder().setSkipHeaderRecord(skipHeaderRecord).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withEscape' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withEscape(final char escape) {
        return builder().setEscape(escape).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withAutoFlush' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withAutoFlush(final boolean autoFlush) {
        return builder().setAutoFlush(autoFlush).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getDelimiter' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public char getDelimiter() {
        return delimiter.charAt(0);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withNullString' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withNullString(final String nullString) {
        return builder().setNullString(nullString).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withHeaderComments' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withHeaderComments(final Object... headerComments) {
        return builder().setHeaderComments(headerComments).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withSkipHeaderRecord' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withSkipHeaderRecord() {
        return builder().setSkipHeaderRecord(true).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withIgnoreSurroundingSpaces' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withIgnoreSurroundingSpaces() {
        return builder().setIgnoreSurroundingSpaces(true).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withCommentMarker' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withCommentMarker(final Character commentMarker) {
        return builder().setCommentMarker(commentMarker).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withQuote' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withQuote(final Character quoteChar) {
        return builder().setQuote(quoteChar).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setAllowDuplicateHeaderNames' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
         */
        @Deprecated
        public Builder setAllowDuplicateHeaderNames(final boolean allowDuplicateHeaderNames) {
            setDuplicateHeaderMode(allowDuplicateHeaderNames ? DuplicateHeaderMode.ALLOW_ALL : DuplicateHeaderMode.ALLOW_EMPTY);
            return this;
```

### DeprecatedIsStillUsed
Deprecated member 'withIgnoreHeaderCase' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withIgnoreHeaderCase(final boolean ignoreHeaderCase) {
        return builder().setIgnoreHeaderCase(ignoreHeaderCase).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withAllowMissingColumnNames' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withAllowMissingColumnNames() {
        return builder().setAllowMissingColumnNames(true).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withSystemRecordSeparator' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withSystemRecordSeparator() {
        return builder().setRecordSeparator(System.lineSeparator()).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withRecordSeparator' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withRecordSeparator(final String recordSeparator) {
        return builder().setRecordSeparator(recordSeparator).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withTrailingDelimiter' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withTrailingDelimiter() {
        return builder().setTrailingDelimiter(true).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withHeader' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withHeader(final String... header) {
        return builder().setHeader(header).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withDelimiter' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withDelimiter(final char delimiter) {
        return builder().setDelimiter(delimiter).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withIgnoreHeaderCase' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withIgnoreHeaderCase() {
        return builder().setIgnoreHeaderCase(true).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withIgnoreEmptyLines' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withIgnoreEmptyLines() {
        return builder().setIgnoreEmptyLines(true).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withFirstRecordAsHeader' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withFirstRecordAsHeader() {
        // @formatter:off
        return builder()
```

### DeprecatedIsStillUsed
Deprecated member 'withTrim' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withTrim() {
        return builder().setTrim(true).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withAllowDuplicateHeaderNames' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withAllowDuplicateHeaderNames(final boolean allowDuplicateHeaderNames) {
        final DuplicateHeaderMode mode = allowDuplicateHeaderNames ? DuplicateHeaderMode.ALLOW_ALL : DuplicateHeaderMode.ALLOW_EMPTY;
        return builder().setDuplicateHeaderMode(mode).build();
```

### DeprecatedIsStillUsed
Deprecated member 'withTrim' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withTrim(final boolean trim) {
        return builder().setTrim(trim).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withAllowDuplicateHeaderNames' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withAllowDuplicateHeaderNames() {
        return builder().setDuplicateHeaderMode(DuplicateHeaderMode.ALLOW_ALL).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withQuoteMode' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withQuoteMode(final QuoteMode quoteMode) {
        return builder().setQuoteMode(quoteMode).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withIgnoreSurroundingSpaces' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withIgnoreSurroundingSpaces(final boolean ignoreSurroundingSpaces) {
        return builder().setIgnoreSurroundingSpaces(ignoreSurroundingSpaces).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withIgnoreEmptyLines' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withIgnoreEmptyLines(final boolean ignoreEmptyLines) {
        return builder().setIgnoreEmptyLines(ignoreEmptyLines).build();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'withHeader' is still used
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @Deprecated
    public CSVFormat withHeader(final Class<? extends Enum<?>> headerEnum) {
        return builder().setHeader(headerEnum).build();
    }
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `ch`
in `src/main/java/org/apache/commons/csv/Lexer.java`
#### Snippet
```java
        if (ch == CR && reader.lookAhead() == LF) {
            // note: does not change ch outside of this method!
            ch = reader.read();
            // Save the EOL state
            if (firstEol == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `ch`
in `src/main/java/org/apache/commons/csv/Lexer.java`
#### Snippet
```java
                token.content.append((char) ch);
            }
            ch = reader.read(); // continue
        }

```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/csv/ExtendedBufferedReader.java`
#### Snippet
```java
    public String readLine() throws IOException {
        if (lookAhead() == END_OF_STREAM) {
            return null;
        }
        final StringBuilder buffer = new StringBuilder();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/csv/CSVRecord.java`
#### Snippet
```java

    private Map<String, Integer> getHeaderMapRaw() {
        return parser == null ? null : parser.getHeaderMapRaw();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
    @SafeVarargs
    static <T> T[] clone(final T... values) {
        return values == null ? null : values.clone();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
    static String[] toStringArray(final Object[] values) {
        if (values == null) {
            return null;
        }
        final String[] strings = new String[values.length];
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    public String[] getHeader() {
        return headers != null ? headers.clone() : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    public String[] getHeaderComments() {
        return headerComments != null ? headerComments.clone() : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/csv/CSVParser.java`
#### Snippet
```java
        if (input.equals(nullString)) {
            // nullString = NULL(String), distinguish between "NULL" and NULL in ALL_NON_NULL or NON_NUMERIC quote mode
            return strictQuoteMode && isQuoted ? input : null;
        }
        // don't set nullString, distinguish between "" and ,, (absent values) in All_NON_NULL or NON_NUMERIC quote mode
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/csv/CSVParser.java`
#### Snippet
```java
        }
        // don't set nullString, distinguish between "" and ,, (absent values) in All_NON_NULL or NON_NUMERIC quote mode
        return strictQuoteMode && nullString == null && input.isEmpty() && !isQuoted ? null : input;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/csv/CSVParser.java`
#### Snippet
```java
    public Map<String, Integer> getHeaderMap() {
        if (this.headers.headerMap == null) {
            return null;
        }
        final Map<String, Integer> map = createEmptyHeaderMap();
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-23-21-05-39.608.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `observedMissing |= blankHeader`
in `src/main/java/org/apache/commons/csv/CSVParser.java`
#### Snippet
```java
                                header, Arrays.toString(headerRecord)));
                    }
                    observedMissing |= blankHeader;
                    if (header != null) {
                        hdrMap.put(header, Integer.valueOf(i));
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/csv/Token.java`
#### Snippet
```java
    @Override
    public String toString() {
        return type.name() + " [" + content.toString() + "]";
    }
}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
        while (-1 != (c = bufferedReader.read())) {
            builder.append((char) c);
            final boolean isDelimiterStart = isDelimiter((char) c, builder.toString() + new String(bufferedReader.lookAhead(delimLength - 1)), pos, delim,
                    delimLength);
            if (c == CR || c == LF || c == escape || isDelimiterStart) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/csv/CSVParser.java`
#### Snippet
```java
                return CSVParser.this.nextRecord();
            } catch (final IOException e) {
                throw new UncheckedIOException(e.getClass().getSimpleName() + " reading next record: " + e.toString(), e);
            }
        }
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/csv/CSVPrinter.java`
#### Snippet
```java
            case CR:
                if (i + 1 < comment.length() && comment.charAt(i + 1) == LF) {
                    i++;
                }
                //$FALL-THROUGH$ break intentionally excluded.
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    public CSVPrinter print(final File out, final Charset charset) throws IOException {
        // The writer will be closed when close() is called.
        return new CSVPrinter(new OutputStreamWriter(new FileOutputStream(out), charset), this);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    public CSVPrinter print(final Path out, final Charset charset) throws IOException {
        return print(Files.newBufferedWriter(out, charset));
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/csv/CSVFormat.java`
#### Snippet
```java
        int pos = 0;

        @SuppressWarnings("resource") // Temp reader on input reader.
        final ExtendedBufferedReader bufferedReader = new ExtendedBufferedReader(reader);
        final char[] delim = getDelimiterString().toCharArray();
        final int delimLength = delim.length;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/csv/CSVParser.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    public static CSVParser parse(final InputStream inputStream, final Charset charset, final CSVFormat format)
            throws IOException {
        Objects.requireNonNull(inputStream, "inputStream");
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/csv/CSVParser.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    public static CSVParser parse(final Path path, final Charset charset, final CSVFormat format) throws IOException {
        Objects.requireNonNull(path, "path");
        Objects.requireNonNull(format, "format");
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/csv/CSVParser.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    public static CSVParser parse(final URL url, final Charset charset, final CSVFormat format) throws IOException {
        Objects.requireNonNull(url, "url");
        Objects.requireNonNull(charset, "charset");
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/csv/CSVParser.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    public CSVParser(final Reader reader, final CSVFormat format, final long characterOffset, final long recordNumber)
        throws IOException {
        Objects.requireNonNull(reader, "reader");
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ExtendedBufferedReader.read()` is ignored
in `src/main/java/org/apache/commons/csv/ExtendedBufferedReader.java`
#### Snippet
```java
                final int next = lookAhead();
                if (next == LF) {
                    read();
                }
            }
```

### IgnoreResultOfCall
Result of `BufferedReader.read()` is ignored
in `src/main/java/org/apache/commons/csv/ExtendedBufferedReader.java`
#### Snippet
```java
        final int n = buf.length;
        super.mark(n);
        super.read(buf, 0, n);
        super.reset();

```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/csv/Constants.java`
#### Snippet
```java
    static final String CRLF = "\r\n";

    static final Character DOUBLE_QUOTE_CHAR = Character.valueOf('"');

    static final String EMPTY = "";
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/csv/CSVRecord.java`
#### Snippet
```java
            throw new IllegalArgumentException(String.format(
                "Index for header '%s' is %d but CSVRecord only has %d values!", name, index,
                Integer.valueOf(values.length)));
        }
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/csv/CSVParser.java`
#### Snippet
```java
                    observedMissing |= blankHeader;
                    if (header != null) {
                        hdrMap.put(header, Integer.valueOf(i));
                        if (headerNames == null) {
                            headerNames = new ArrayList<>(headerRecord.length);
```

