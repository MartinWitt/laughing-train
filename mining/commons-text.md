# commons-text 
 
# Bad smells
I found 276 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=AssignmentToMethodParameter] | 77 | false |
| RuleId[ruleID=ReturnNull] | 65 | false |
| RuleId[ruleID=BoundedWildcard] | 27 | false |
| RuleId[ruleID=UnusedAssignment] | 17 | false |
| RuleId[ruleID=FinalStaticMethod] | 15 | false |
| RuleId[ruleID=StaticInitializerReferencesSubClass] | 10 | false |
| RuleId[ruleID=AssignmentToForLoopParameter] | 8 | false |
| RuleId[ruleID=SystemOutErr] | 7 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 7 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 5 | false |
| RuleId[ruleID=DeprecatedIsStillUsed] | 4 | false |
| RuleId[ruleID=UtilityClassWithPublicConstructor] | 4 | false |
| RuleId[ruleID=NullArgumentToVariableArgMethod] | 4 | false |
| RuleId[ruleID=MethodOverridesStaticMethod] | 4 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 3 | false |
| RuleId[ruleID=RedundantLengthCheck] | 2 | false |
| RuleId[ruleID=RefusedBequest] | 2 | false |
| RuleId[ruleID=RedundantSuppression] | 2 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 2 | false |
| RuleId[ruleID=NestedAssignment] | 2 | false |
| RuleId[ruleID=CommentedOutCode] | 1 | false |
| RuleId[ruleID=DuplicateBranchesInSwitch] | 1 | false |
| RuleId[ruleID=UnnecessaryUnboxing] | 1 | false |
| RuleId[ruleID=RedundantMethodOverride] | 1 | false |
| RuleId[ruleID=ClassNameSameAsAncestorName] | 1 | false |
| RuleId[ruleID=IfStatementWithIdenticalBranches] | 1 | false |
| RuleId[ruleID=UnnecessarySuperQualifier] | 1 | false |
| RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment] | 1 | false |
| RuleId[ruleID=HtmlWrongAttributeValue] | 1 | false |
## RuleId[ruleID=RedundantLengthCheck]
### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
         * vouch for itself whether its use of 'array' is safe.
         */
        if (array != null && array.length > 0) {
            for (final Object element : array) {
                append(element);
```

### RuleId[ruleID=RedundantLengthCheck]
Redundant array length check
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
         * vouch for itself whether its use of 'array' is safe.
         */
        if (array != null && array.length > 0) {
            for (final Object element : array) {
                append(element);
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `EntityArrays` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/text/translate/EntityArrays.java`
#### Snippet
```java
 * @since 1.0
 */
public class EntityArrays {

   /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CaseUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/text/CaseUtils.java`
#### Snippet
```java
 * @since 1.2
 */
public class CaseUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `WordUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/text/WordUtils.java`
#### Snippet
```java
 * @since 1.1
 */
public class WordUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `FormattableUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/text/FormattableUtils.java`
#### Snippet
```java
 *
 */
public class FormattableUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `StringEscapeUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/text/StringEscapeUtils.java`
#### Snippet
```java
 * @since 1.0
 */
public class StringEscapeUtils {

    /* ESCAPE TRANSLATORS */
```

## RuleId[ruleID=StaticInitializerReferencesSubClass]
### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass NoMatcher from superclass StrMatcher initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/text/StrMatcher.java`
#### Snippet
```java
     * Matches no characters.
     */
    private static final StrMatcher NONE_MATCHER = new NoMatcher();

    /**
```

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass CharSetMatcher from superclass StrMatcher initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/text/StrMatcher.java`
#### Snippet
```java
     * Matches the single or double quote character.
     */
    private static final StrMatcher QUOTE_MATCHER = new CharSetMatcher("'\"".toCharArray());

    /**
```

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass CharMatcher from superclass StrMatcher initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/text/StrMatcher.java`
#### Snippet
```java
     * Matches the double quote character.
     */
    private static final StrMatcher SINGLE_QUOTE_MATCHER = new CharMatcher('\'');

    /**
```

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass CharMatcher from superclass StrMatcher initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/text/StrMatcher.java`
#### Snippet
```java
     * Matches the space character.
     */
    private static final StrMatcher SPACE_MATCHER = new CharMatcher(' ');

    /**
```

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass CharMatcher from superclass StrMatcher initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/text/StrMatcher.java`
#### Snippet
```java
     * Matches the tab character.
     */
    private static final StrMatcher TAB_MATCHER = new CharMatcher('\t');

    /**
```

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass CharMatcher from superclass StrMatcher initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/text/StrMatcher.java`
#### Snippet
```java
     * Matches the comma character.
     */
    private static final StrMatcher COMMA_MATCHER = new CharMatcher(',');

    /**
```

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass TrimMatcher from superclass StrMatcher initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/text/StrMatcher.java`
#### Snippet
```java
     * Matches the String trim() whitespace characters.
     */
    private static final StrMatcher TRIM_MATCHER = new TrimMatcher();

    /**
```

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass CharMatcher from superclass StrMatcher initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/text/StrMatcher.java`
#### Snippet
```java
     * Matches the double quote character.
     */
    private static final StrMatcher DOUBLE_QUOTE_MATCHER = new CharMatcher('"');

    /**
```

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass CharSetMatcher from superclass StrMatcher initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/text/StrMatcher.java`
#### Snippet
```java
     * namely space, tab, newline, form feed.
     */
    private static final StrMatcher SPLIT_MATCHER = new CharSetMatcher(" \t\n\r\f".toCharArray());

    /**
```

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass MapStrLookup from superclass StrLookup initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/text/StrLookup.java`
#### Snippet
```java
     * Lookup that always returns null.
     */
    private static final StrLookup<String> NONE_LOOKUP = new MapStrLookup<>(null);

    /**
```

## RuleId[ruleID=CommentedOutCode]
### RuleId[ruleID=CommentedOutCode]
Commented out code (13 lines)
in `src/main/java/org/apache/commons/text/matcher/AbstractStringMatcher.java`
#### Snippet
```java
    }

//    /**
//     * Validates indices for {@code bufferStart <= start < bufferEnd}.
//     *
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'logestCommonSubsequence' is still used
in `src/main/java/org/apache/commons/text/similarity/LongestCommonSubsequence.java`
#### Snippet
```java
     */
    @Deprecated
    public CharSequence logestCommonSubsequence(final CharSequence left, final CharSequence right) {
        return longestCommonSubsequence(left, right);
    }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'substringAfter' is still used
in `src/main/java/org/apache/commons/text/lookup/AbstractStringLookup.java`
#### Snippet
```java
     */
    @Deprecated
    protected String substringAfter(final String value, final String str) {
        return StringUtils.substringAfter(value, str);
    }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'substringAfterLast' is still used
in `src/main/java/org/apache/commons/text/lookup/AbstractStringLookup.java`
#### Snippet
```java
     */
    @Deprecated
    protected String substringAfterLast(final String value, final char ch) {
        return StringUtils.substringAfterLast(value, ch);
    }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'substringAfter' is still used
in `src/main/java/org/apache/commons/text/lookup/AbstractStringLookup.java`
#### Snippet
```java
     */
    @Deprecated
    protected String substringAfter(final String value, final char ch) {
        return StringUtils.substringAfter(value, ch);
    }
```

## RuleId[ruleID=RefusedBequest]
### RuleId[ruleID=RefusedBequest]
Method `clone()` does not call 'super.clone()'
in `src/main/java/org/apache/commons/text/StringTokenizer.java`
#### Snippet
```java
     */
    @Override
    public Object clone() {
        try {
            return cloneReset();
```

### RuleId[ruleID=RefusedBequest]
Method `clone()` does not call 'super.clone()'
in `src/main/java/org/apache/commons/text/StrTokenizer.java`
#### Snippet
```java
     */
    @Override
    public Object clone() {
        try {
            return cloneReset();
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### RuleId[ruleID=DuplicateBranchesInSwitch]
Branch in 'switch' is a duplicate of the default branch
in `src/main/java/org/apache/commons/text/lookup/DnsStringLookup.java`
#### Snippet
```java
                return inetAddress.getCanonicalHostName();
            case InetAddressKeys.KEY_ADDRESS:
                return inetAddress.getHostAddress();
            default:
                return inetAddress.getHostAddress();
```

## RuleId[ruleID=FinalStaticMethod]
### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `src/main/java/org/apache/commons/text/StringEscapeUtils.java`
#### Snippet
```java
     * @return a new unescaped {@code String}, {@code null} if null string input
     */
    public static final String unescapeXSI(final String input) {
        return UNESCAPE_XSI.translate(input);
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `src/main/java/org/apache/commons/text/StringEscapeUtils.java`
#### Snippet
```java
     * @see #escapeXml11(String)
     */
    public static final String unescapeXml(final String input) {
        return UNESCAPE_XML.translate(input);
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `src/main/java/org/apache/commons/text/StringEscapeUtils.java`
#### Snippet
```java
     * quotes unescaped, {@code null} if null string input
     */
    public static final String unescapeCsv(final String input) {
        return UNESCAPE_CSV.translate(input);
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `src/main/java/org/apache/commons/text/StringEscapeUtils.java`
#### Snippet
```java
     * @return a new unescaped {@code String}, {@code null} if null string input
     */
    public static final String unescapeHtml3(final String input) {
        return UNESCAPE_HTML3.translate(input);
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `src/main/java/org/apache/commons/text/StringEscapeUtils.java`
#### Snippet
```java
     * @return A new unescaped {@code String}, {@code null} if null string input
     */
    public static final String unescapeJson(final String input) {
        return UNESCAPE_JSON.translate(input);
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `src/main/java/org/apache/commons/text/StringEscapeUtils.java`
#### Snippet
```java
     * @see <a href="http://www.w3.org/TR/html401/charset.html#code-position">HTML 4.01 Code positions</a>
     */
    public static final String escapeHtml4(final String input) {
        return ESCAPE_HTML4.translate(input);
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `src/main/java/org/apache/commons/text/StringEscapeUtils.java`
#### Snippet
```java
     * @return a new unescaped {@code String}, {@code null} if null string input
     */
    public static final String unescapeHtml4(final String input) {
        return UNESCAPE_HTML4.translate(input);
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `src/main/java/org/apache/commons/text/StringEscapeUtils.java`
#### Snippet
```java
     * @return a new escaped {@code String}, {@code null} if null string input
     */
    public static final String escapeHtml3(final String input) {
        return ESCAPE_HTML3.translate(input);
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `src/main/java/org/apache/commons/text/StringEscapeUtils.java`
#### Snippet
```java
     * newline or double quote, {@code null} if null string input
     */
    public static final String escapeCsv(final String input) {
        return ESCAPE_CSV.translate(input);
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `src/main/java/org/apache/commons/text/StringEscapeUtils.java`
#### Snippet
```java
     * @return A new unescaped {@code String}, {@code null} if null string input
     */
    public static final String unescapeEcmaScript(final String input) {
        return UNESCAPE_ECMASCRIPT.translate(input);
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `src/main/java/org/apache/commons/text/StringEscapeUtils.java`
#### Snippet
```java
     * @return String with escaped values, {@code null} if null string input
     */
    public static final String escapeJson(final String input) {
        return ESCAPE_JSON.translate(input);
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `src/main/java/org/apache/commons/text/StringEscapeUtils.java`
#### Snippet
```java
     * @return String with escaped values, {@code null} if null string input
     */
    public static final String escapeEcmaScript(final String input) {
        return ESCAPE_ECMASCRIPT.translate(input);
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `src/main/java/org/apache/commons/text/StringEscapeUtils.java`
#### Snippet
```java
     * @return a new unescaped {@code String}, {@code null} if null string input
     */
    public static final String unescapeJava(final String input) {
        return UNESCAPE_JAVA.translate(input);
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `src/main/java/org/apache/commons/text/StringEscapeUtils.java`
#### Snippet
```java
     * @return String with escaped values, {@code null} if null string input
     */
    public static final String escapeJava(final String input) {
        return ESCAPE_JAVA.translate(input);
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `src/main/java/org/apache/commons/text/StringEscapeUtils.java`
#### Snippet
```java
     * @return String with escaped values, {@code null} if null string input
     */
    public static final String escapeXSI(final String input) {
        return ESCAPE_XSI.translate(input);
    }
```

## RuleId[ruleID=AssignmentToForLoopParameter]
### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `si`
in `src/main/java/org/apache/commons/text/similarity/JaroWinklerSimilarity.java`
#### Snippet
```java
            if (matchIndexes[i] != -1) {
                ms1[si] = min.charAt(i);
                si++;
            }
        }
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `si`
in `src/main/java/org/apache/commons/text/similarity/JaroWinklerSimilarity.java`
#### Snippet
```java
            if (matchFlags[i]) {
                ms2[si] = max.charAt(i);
                si++;
            }
        }
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
            if (buffer[i] == ch) {
                final int start = i;
                while (++i < size) {
                    if (buffer[i] != ch) {
                        break;
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
                final int len = i - start;
                deleteImpl(start, i, len);
                i -= len;
            }
        }
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
                replaceImpl(i, i + removeLen, removeLen, replaceStr, replaceLen);
                to = to - removeLen + replaceLen;
                i = i + replaceLen - 1;
                if (replaceCount > 0) {
                    replaceCount--;
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
            if (buffer[i] == ch) {
                final int start = i;
                while (++i < size) {
                    if (buffer[i] != ch) {
                        break;
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
                final int len = i - start;
                deleteImpl(start, i, len);
                i -= len;
            }
        }
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
                replaceImpl(i, i + removeLen, removeLen, replaceStr, replaceLen);
                to = to - removeLen + replaceLen;
                i = i + replaceLen - 1;
                if (replaceCount > 0) {
                    replaceCount--;
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CharSequence`
in `src/main/java/org/apache/commons/text/translate/EntityArrays.java`
#### Snippet
```java
     * @return Map&lt;String, String&gt; inverted array
     */
    public static Map<CharSequence, CharSequence> invert(final Map<CharSequence, CharSequence> map) {
        return map.entrySet().stream().collect(Collectors.toMap(Entry::getValue, Entry::getKey));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CharSequence`
in `src/main/java/org/apache/commons/text/translate/EntityArrays.java`
#### Snippet
```java
     * @return Map&lt;String, String&gt; inverted array
     */
    public static Map<CharSequence, CharSequence> invert(final Map<CharSequence, CharSequence> map) {
        return map.entrySet().stream().collect(Collectors.toMap(Entry::getValue, Entry::getKey));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `src/main/java/org/apache/commons/text/lookup/FunctionStringLookup.java`
#### Snippet
```java
     * @return a new instance backed by the given map.
     */
    static <V> FunctionStringLookup<V> on(final Map<String, V> map) {
        return on(StringLookupFactory.toMap(map)::get);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/org/apache/commons/text/lookup/FunctionStringLookup.java`
#### Snippet
```java
     * @param function the function, may be null.
     */
    private FunctionStringLookup(final Function<String, V> function) {
        this.function = function;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `src/main/java/org/apache/commons/text/lookup/FunctionStringLookup.java`
#### Snippet
```java
     * @param function the function, may be null.
     */
    private FunctionStringLookup(final Function<String, V> function) {
        this.function = function;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super CharSequence`
in `src/main/java/org/apache/commons/text/similarity/IntersectionSimilarity.java`
#### Snippet
```java
     * @throws IllegalArgumentException if the converter is null
     */
    public IntersectionSimilarity(final Function<CharSequence, Collection<T>> converter) {
        if (converter == null) {
            throw new IllegalArgumentException("Converter must not be null");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Collection`
in `src/main/java/org/apache/commons/text/similarity/IntersectionSimilarity.java`
#### Snippet
```java
     * @throws IllegalArgumentException if the converter is null
     */
    public IntersectionSimilarity(final Function<CharSequence, Collection<T>> converter) {
        if (converter == null) {
            throw new IllegalArgumentException("Converter must not be null");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/text/similarity/IntersectionSimilarity.java`
#### Snippet
```java
     * @return The intersection
     */
    private static <T> int getIntersection(final Set<T> setA, final Set<T> setB) {
        int intersection = 0;
        for (final T element : setA) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/text/similarity/IntersectionSimilarity.java`
#### Snippet
```java
     * @return The bag
     */
    private TinyBag toBag(final Collection<T> objects) {
        final TinyBag bag = new TinyBag(objects.size());
        objects.forEach(bag::add);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/org/apache/commons/text/lookup/StringLookupFactory.java`
#### Snippet
```java
     * @since 1.5
     */
    public void addDefaultStringLookups(final Map<String, StringLookup> stringLookupMap) {
        if (stringLookupMap != null) {
            stringLookupMap.putAll(DefaultStringLookupsHolder.INSTANCE.getDefaultStringLookups());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super StringLookup`
in `src/main/java/org/apache/commons/text/lookup/StringLookupFactory.java`
#### Snippet
```java
     * @since 1.5
     */
    public void addDefaultStringLookups(final Map<String, StringLookup> stringLookupMap) {
        if (stringLookupMap != null) {
            stringLookupMap.putAll(DefaultStringLookupsHolder.INSTANCE.getDefaultStringLookups());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/org/apache/commons/text/lookup/StringLookupFactory.java`
#### Snippet
```java
         * @param map map to add to
         */
        private static void addLookup(final DefaultStringLookup lookup, final Map<String, StringLookup> map) {
            map.put(toKey(lookup.getKey()), lookup.getStringLookup());

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super StringLookup`
in `src/main/java/org/apache/commons/text/lookup/StringLookupFactory.java`
#### Snippet
```java
         * @param map map to add to
         */
        private static void addLookup(final DefaultStringLookup lookup, final Map<String, StringLookup> map) {
            map.put(toKey(lookup.getKey()), lookup.getStringLookup());

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/org/apache/commons/text/diff/KeepCommand.java`
#### Snippet
```java
     */
    @Override
    public void accept(final CommandVisitor<T> visitor) {
        visitor.visitKeepCommand(getObject());
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/org/apache/commons/text/lookup/BiFunctionStringLookup.java`
#### Snippet
```java
     * @param biFunction the function, may be null.
     */
    private BiFunctionStringLookup(final BiFunction<String, P, R> biFunction) {
        this.biFunction = biFunction;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super P`
in `src/main/java/org/apache/commons/text/lookup/BiFunctionStringLookup.java`
#### Snippet
```java
     * @param biFunction the function, may be null.
     */
    private BiFunctionStringLookup(final BiFunction<String, P, R> biFunction) {
        this.biFunction = biFunction;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `src/main/java/org/apache/commons/text/lookup/BiFunctionStringLookup.java`
#### Snippet
```java
     * @param biFunction the function, may be null.
     */
    private BiFunctionStringLookup(final BiFunction<String, P, R> biFunction) {
        this.biFunction = biFunction;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/text/lookup/BiFunctionStringLookup.java`
#### Snippet
```java
     * @return a new instance backed by the given map.
     */
    static <U, T> BiFunctionStringLookup<U, T> on(final Map<String, T> map) {
        return on((key, u) -> map.get(key));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/org/apache/commons/text/AlphabetConverter.java`
#### Snippet
```java
     */
    private AlphabetConverter(final Map<Integer, String> originalToEncoded,
                              final Map<String, String> encodedToOriginal,
                              final int encodedLetterLength) {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/org/apache/commons/text/StringTokenizer.java`
#### Snippet
```java
     *            the token to add
     */
    private void addToken(final List<String> list, String tok) {
        if (tok == null || tok.isEmpty()) {
            if (isIgnoreEmptyTokens()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/org/apache/commons/text/diff/InsertCommand.java`
#### Snippet
```java
     */
    @Override
    public void accept(final CommandVisitor<T> visitor) {
        visitor.visitInsertCommand(getObject());
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/org/apache/commons/text/diff/DeleteCommand.java`
#### Snippet
```java
     */
    @Override
    public void accept(final CommandVisitor<T> visitor) {
        visitor.visitDeleteCommand(getObject());
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CharacterPredicate`
in `src/main/java/org/apache/commons/text/RandomStringGenerator.java`
#### Snippet
```java
     */
    private RandomStringGenerator(final int minimumCodePoint, final int maximumCodePoint,
                                  final Set<CharacterPredicate> inclusivePredicates, final TextRandomProvider random,
                                  final List<Character> characterList) {
        this.minimumCodePoint = minimumCodePoint;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Character`
in `src/main/java/org/apache/commons/text/diff/StringsComparator.java`
#### Snippet
```java
     */
    private void buildScript(final int start1, final int end1, final int start2, final int end2,
            final EditScript<Character> script) {
        final Snake middle = getMiddleSnake(start1, end1, start2, end2);

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CharSequence`
in `src/main/java/org/apache/commons/text/similarity/CosineSimilarity.java`
#### Snippet
```java
     * @return common strings
     */
    private Set<CharSequence> getIntersection(final Map<CharSequence, Integer> leftVector,
            final Map<CharSequence, Integer> rightVector) {
        final Set<CharSequence> intersection = new HashSet<>(leftVector.keySet());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CharSequence`
in `src/main/java/org/apache/commons/text/similarity/CosineSimilarity.java`
#### Snippet
```java
     */
    private double dot(final Map<CharSequence, Integer> leftVector, final Map<CharSequence, Integer> rightVector,
            final Set<CharSequence> intersection) {
        long dotProduct = 0;
        for (final CharSequence key : intersection) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/org/apache/commons/text/StrTokenizer.java`
#### Snippet
```java
     * @param tok  the token to add
     */
    private void addToken(final List<String> list, String tok) {
        if (tok == null || tok.isEmpty()) {
            if (isIgnoreEmptyTokens()) {
```

## RuleId[ruleID=RedundantSuppression]
### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
     * @return this, to enable chaining
     */
    public <T> StrBuilder appendAll(@SuppressWarnings("unchecked") final T... array) {
        /*
         * @SuppressWarnings used to hide warning about vararg usage. We cannot
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
     * @return this, to enable chaining
     */
    public <T> TextStringBuilder appendAll(@SuppressWarnings("unchecked") final T... array) {
        /*
         * @SuppressWarnings used to hide warning about vararg usage. We cannot use @SafeVarargs, since this method is
```

## RuleId[ruleID=UtilityClassWithPublicConstructor]
### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `CaseUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/text/CaseUtils.java`
#### Snippet
```java
 * @since 1.2
 */
public class CaseUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `WordUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/text/WordUtils.java`
#### Snippet
```java
 * @since 1.1
 */
public class WordUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `FormattableUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/text/FormattableUtils.java`
#### Snippet
```java
 *
 */
public class FormattableUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `StringEscapeUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/text/StringEscapeUtils.java`
#### Snippet
```java
 * @since 1.0
 */
public class StringEscapeUtils {

    /* ESCAPE TRANSLATORS */
```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/text/lookup/JavaPlatformStringLookup.java`
#### Snippet
```java
     */
    public static void main(final String[] args) {
        System.out.println(JavaPlatformStringLookup.class);
        System.out.printf("%s = %s%n", KEY_VERSION, JavaPlatformStringLookup.INSTANCE.lookup(KEY_VERSION));
        System.out.printf("%s = %s%n", KEY_RUNTIME, JavaPlatformStringLookup.INSTANCE.lookup(KEY_RUNTIME));
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/text/lookup/JavaPlatformStringLookup.java`
#### Snippet
```java
    public static void main(final String[] args) {
        System.out.println(JavaPlatformStringLookup.class);
        System.out.printf("%s = %s%n", KEY_VERSION, JavaPlatformStringLookup.INSTANCE.lookup(KEY_VERSION));
        System.out.printf("%s = %s%n", KEY_RUNTIME, JavaPlatformStringLookup.INSTANCE.lookup(KEY_RUNTIME));
        System.out.printf("%s = %s%n", KEY_VM, JavaPlatformStringLookup.INSTANCE.lookup(KEY_VM));
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/text/lookup/JavaPlatformStringLookup.java`
#### Snippet
```java
        System.out.println(JavaPlatformStringLookup.class);
        System.out.printf("%s = %s%n", KEY_VERSION, JavaPlatformStringLookup.INSTANCE.lookup(KEY_VERSION));
        System.out.printf("%s = %s%n", KEY_RUNTIME, JavaPlatformStringLookup.INSTANCE.lookup(KEY_RUNTIME));
        System.out.printf("%s = %s%n", KEY_VM, JavaPlatformStringLookup.INSTANCE.lookup(KEY_VM));
        System.out.printf("%s = %s%n", KEY_OS, JavaPlatformStringLookup.INSTANCE.lookup(KEY_OS));
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/text/lookup/JavaPlatformStringLookup.java`
#### Snippet
```java
        System.out.printf("%s = %s%n", KEY_VERSION, JavaPlatformStringLookup.INSTANCE.lookup(KEY_VERSION));
        System.out.printf("%s = %s%n", KEY_RUNTIME, JavaPlatformStringLookup.INSTANCE.lookup(KEY_RUNTIME));
        System.out.printf("%s = %s%n", KEY_VM, JavaPlatformStringLookup.INSTANCE.lookup(KEY_VM));
        System.out.printf("%s = %s%n", KEY_OS, JavaPlatformStringLookup.INSTANCE.lookup(KEY_OS));
        System.out.printf("%s = %s%n", KEY_HARDWARE, JavaPlatformStringLookup.INSTANCE.lookup(KEY_HARDWARE));
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/text/lookup/JavaPlatformStringLookup.java`
#### Snippet
```java
        System.out.printf("%s = %s%n", KEY_RUNTIME, JavaPlatformStringLookup.INSTANCE.lookup(KEY_RUNTIME));
        System.out.printf("%s = %s%n", KEY_VM, JavaPlatformStringLookup.INSTANCE.lookup(KEY_VM));
        System.out.printf("%s = %s%n", KEY_OS, JavaPlatformStringLookup.INSTANCE.lookup(KEY_OS));
        System.out.printf("%s = %s%n", KEY_HARDWARE, JavaPlatformStringLookup.INSTANCE.lookup(KEY_HARDWARE));
        System.out.printf("%s = %s%n", KEY_LOCALE, JavaPlatformStringLookup.INSTANCE.lookup(KEY_LOCALE));
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/text/lookup/JavaPlatformStringLookup.java`
#### Snippet
```java
        System.out.printf("%s = %s%n", KEY_VM, JavaPlatformStringLookup.INSTANCE.lookup(KEY_VM));
        System.out.printf("%s = %s%n", KEY_OS, JavaPlatformStringLookup.INSTANCE.lookup(KEY_OS));
        System.out.printf("%s = %s%n", KEY_HARDWARE, JavaPlatformStringLookup.INSTANCE.lookup(KEY_HARDWARE));
        System.out.printf("%s = %s%n", KEY_LOCALE, JavaPlatformStringLookup.INSTANCE.lookup(KEY_LOCALE));
    }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/text/lookup/JavaPlatformStringLookup.java`
#### Snippet
```java
        System.out.printf("%s = %s%n", KEY_OS, JavaPlatformStringLookup.INSTANCE.lookup(KEY_OS));
        System.out.printf("%s = %s%n", KEY_HARDWARE, JavaPlatformStringLookup.INSTANCE.lookup(KEY_HARDWARE));
        System.out.printf("%s = %s%n", KEY_LOCALE, JavaPlatformStringLookup.INSTANCE.lookup(KEY_LOCALE));
    }

```

## RuleId[ruleID=UnnecessaryUnboxing]
### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/text/similarity/JaccardDistance.java`
#### Snippet
```java
            throw new IllegalArgumentException("Input cannot be null");
        }
        return 1.0 - jaccardSimilarity.apply(left, right).doubleValue();
    }
}
```

## RuleId[ruleID=RedundantMethodOverride]
### RuleId[ruleID=RedundantMethodOverride]
Method `size()` is identical to its super method
in `src/main/java/org/apache/commons/text/matcher/AbstractStringMatcher.java`
#### Snippet
```java
         */
        @Override
        public int size() {
            return 0;
        }
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Builder` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/text/RandomStringGenerator.java`
#### Snippet
```java
     * @since 1.1
     */
    public static class Builder implements org.apache.commons.text.Builder<RandomStringGenerator> {

        /**
```

## RuleId[ruleID=IfStatementWithIdenticalBranches]
### RuleId[ruleID=IfStatementWithIdenticalBranches]
Common part can be extracted from 'if'
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
     */
    public StrBuilder append(final boolean value) {
        if (value) {
            ensureCapacity(size + 4);
            buffer[size++] = 't';
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/text/lookup/StringLookupFactory.java`
#### Snippet
```java

            try {
                for (final String lookupName : str.split("[\\s,]+")) {
                    if (!lookupName.isEmpty()) {
                        addLookup(DefaultStringLookup.valueOf(lookupName.toUpperCase()), lookupMap);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/text/lookup/PropertiesStringLookup.java`
#### Snippet
```java
            return null;
        }
        final String[] keys = key.split(SEPARATOR);
        final int keyLen = keys.length;
        if (keyLen < 2) {
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/text/io/StringSubstitutorReader.java`
#### Snippet
```java
     */
    private int buffer(final int requestReadCount) throws IOException {
        final int actualReadCount = buffer.readFrom(super.in, requestReadCount);
        eos = actualReadCount == EOS;
        return actualReadCount;
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/text/lookup/DateStringLookup.java`
#### Snippet
```java
/**
 * Formats the current date with the format given in the key in a format compatible with
 * {@link java.text.SimpleDateFormat}.
 * <p>
 * Using a {@link StringLookup} from the {@link StringLookupFactory}:
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/text/lookup/DateStringLookup.java`
#### Snippet
```java
    /**
     * Formats the current date with the format given in the key in a format compatible with
     * {@link java.text.SimpleDateFormat}.
     *
     * @param key the format to use. If null, the default {@link DateFormat} will be used.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/text/StringEscapeUtils.java`
#### Snippet
```java

    /**
     * Convenience wrapper for {@link java.lang.StringBuilder} providing escape methods.
     *
     * <p>Example:</p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/text/StringEscapeUtils.java`
#### Snippet
```java
     *
     * <p><b>Beware!</b> In most cases you don't want to escape shell commands but use multi-argument
     * methods provided by {@link java.lang.ProcessBuilder} or {@link java.lang.Runtime#exec(String[])}
     * instead.</p>
     *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/text/StringEscapeUtils.java`
#### Snippet
```java
     *
     * <p><b>Beware!</b> In most cases you don't want to escape shell commands but use multi-argument
     * methods provided by {@link java.lang.ProcessBuilder} or {@link java.lang.Runtime#exec(String[])}
     * instead.</p>
     *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
     * Required for serialization support.
     *
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 1L;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
     * Required for serialization support.
     *
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 7628716375283629643L;
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`lettersLeft = lettersLeft / encodingCopy.size()` could be simplified to 'lettersLeft /= encodingCopy.size()'
in `src/main/java/org/apache/commons/text/AlphabetConverter.java`
#### Snippet
```java

        while (lettersLeft / encodingCopy.size() >= 1) {
            lettersLeft = lettersLeft / encodingCopy.size();
            lettersSoFar++;
        }
```

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/org/apache/commons/text/lookup/UrlStringLookup.java`
#### Snippet
```java
                InputStreamReader reader = new InputStreamReader(bis, charsetName)) {
                int n;
                while (-1 != (n = reader.read(buffer))) {
                    writer.write(buffer, 0, n);
                }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
            ensureCapacity(size + 1);
            int read;
            while ((read = r.read(buffer, size, buffer.length - size)) != -1) {
                size += read;
                ensureCapacity(size + 1);
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/text/numbers/DoubleFormat.java`
#### Snippet
```java

        /** Maximum number of significant decimal digits in formatted strings. */
        private int maxPrecision = 0;

        /** Minimum decimal exponent. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/text/numbers/DoubleFormat.java`
#### Snippet
```java

        /** If {@code true}, thousands groups will be separated by the grouping separator. */
        private boolean groupThousands = false;

        /** Minus sign character. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/text/numbers/DoubleFormat.java`
#### Snippet
```java

        /** Flag indicating if the exponent value should always be included, even if zero. */
        private boolean alwaysIncludeExponent = false;

        /**
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `pos`
in `src/main/java/org/apache/commons/text/StrMatcher.java`
#### Snippet
```java
                return 0;
            }
            for (int i = 0; i < chars.length; i++, pos++) {
                if (chars[i] != buffer[pos]) {
                    return 0;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `key`
in `src/main/java/org/apache/commons/text/lookup/InterpolatorStringLookup.java`
#### Snippet
```java
                return value;
            }
            key = key.substring(prefixPos + 1);
        }
        if (defaultStringLookup != null) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/text/CaseUtils.java`
#### Snippet
```java
            return str;
        }
        str = str.toLowerCase();
        final int strLen = str.length();
        final int[] newCodePoints = new int[strLen];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newLineStr`
in `src/main/java/org/apache/commons/text/WordUtils.java`
#### Snippet
```java
        }
        if (newLineStr == null) {
            newLineStr = System.lineSeparator();
        }
        if (wrapLength < 1) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `wrapLength`
in `src/main/java/org/apache/commons/text/WordUtils.java`
#### Snippet
```java
        }
        if (wrapLength < 1) {
            wrapLength = 1;
        }
        if (StringUtils.isBlank(wrapOn)) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `wrapOn`
in `src/main/java/org/apache/commons/text/WordUtils.java`
#### Snippet
```java
        }
        if (StringUtils.isBlank(wrapOn)) {
            wrapOn = " ";
        }
        final Pattern patternToWrapOn = Pattern.compile(wrapOn);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `lower`
in `src/main/java/org/apache/commons/text/WordUtils.java`
#### Snippet
```java
        // set to the length of the string
        if (lower > str.length()) {
            lower = str.length();
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `upper`
in `src/main/java/org/apache/commons/text/WordUtils.java`
#### Snippet
```java
        // than the length of the string, set to the length of the string
        if (upper == -1 || upper > str.length()) {
            upper = str.length();
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/text/WordUtils.java`
#### Snippet
```java
            return str;
        }
        str = str.toLowerCase();
        return capitalize(str, delimiters);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `left`
in `src/main/java/org/apache/commons/text/similarity/LevenshteinDetailedDistance.java`
#### Snippet
```java
            // swap the two strings to consume less memory
            final CharSequence tmp = left;
            left = right;
            right = tmp;
            n = m;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `right`
in `src/main/java/org/apache/commons/text/similarity/LevenshteinDetailedDistance.java`
#### Snippet
```java
            final CharSequence tmp = left;
            left = right;
            right = tmp;
            n = m;
            m = right.length();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `left`
in `src/main/java/org/apache/commons/text/similarity/LevenshteinDetailedDistance.java`
#### Snippet
```java
            // swap the input strings to consume less memory
            final CharSequence tmp = left;
            left = right;
            right = tmp;
            n = m;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `right`
in `src/main/java/org/apache/commons/text/similarity/LevenshteinDetailedDistance.java`
#### Snippet
```java
            final CharSequence tmp = left;
            left = right;
            right = tmp;
            n = m;
            m = right.length();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `start`
in `src/main/java/org/apache/commons/text/StringTokenizer.java`
#### Snippet
```java
                break;
            }
            start += removeLen;
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `tok`
in `src/main/java/org/apache/commons/text/StringTokenizer.java`
#### Snippet
```java
            }
            if (isEmptyTokenAsNull()) {
                tok = null;
            }
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
     */
    public int indexOf(final char ch, int startIndex) {
        startIndex = Math.max(0, startIndex);
        if (startIndex >= size) {
            return StringUtils.INDEX_NOT_FOUND;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
            }
            if (pos + len > size()) {
                len = TextStringBuilder.this.size() - pos;
            }
            TextStringBuilder.this.getChars(pos, pos + len, b, off);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
    /** Appends {@code "false"}. */
    private void appendFalse(int index) {
        buffer[index++] = 'f';
        buffer[index++] = 'a';
        buffer[index++] = 'l';
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
    private void appendFalse(int index) {
        buffer[index++] = 'f';
        buffer[index++] = 'a';
        buffer[index++] = 'l';
        buffer[index++] = 's';
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
        buffer[index++] = 'f';
        buffer[index++] = 'a';
        buffer[index++] = 'l';
        buffer[index++] = 's';
        buffer[index] = 'e';
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
        buffer[index++] = 'a';
        buffer[index++] = 'l';
        buffer[index++] = 's';
        buffer[index] = 'e';
        size += FALSE_STRING_SIZE;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndex`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
     */
    public char[] toCharArray(final int startIndex, int endIndex) {
        endIndex = validateRange(startIndex, endIndex);
        final int len = endIndex - startIndex;
        return len == 0 ? ArrayUtils.EMPTY_CHAR_ARRAY : Arrays.copyOfRange(buffer, startIndex, endIndex);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `target`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
        final int len = length();
        if (target == null || target.length < len) {
            target = new char[len];
        }
        System.arraycopy(buffer, 0, target, 0, len);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndex`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
     */
    public String substring(final int startIndex, int endIndex) {
        endIndex = validateRange(startIndex, endIndex);
        return new String(buffer, startIndex, endIndex - startIndex);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
    public String midString(int index, final int length) {
        if (index < 0) {
            index = 0;
        }
        if (length <= 0 || index >= size) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
     */
    public int lastIndexOf(final String str, int startIndex) {
        startIndex = startIndex >= size ? size - 1 : startIndex;
        if (str == null || startIndex < 0) {
            return StringUtils.INDEX_NOT_FOUND;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
    /** Appends {@code "true"}. */
    private void appendTrue(int index) {
        buffer[index++] = 't';
        buffer[index++] = 'r';
        buffer[index++] = 'u';
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
    private void appendTrue(int index) {
        buffer[index++] = 't';
        buffer[index++] = 'r';
        buffer[index++] = 'u';
        buffer[index] = 'e';
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
        buffer[index++] = 't';
        buffer[index++] = 'r';
        buffer[index++] = 'u';
        buffer[index] = 'e';
        size += TRUE_STRING_SIZE;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndex`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
    public TextStringBuilder replace(final StringMatcher matcher, final String replaceStr, final int startIndex,
        int endIndex, final int replaceCount) {
        endIndex = validateRange(startIndex, endIndex);
        return replaceImpl(matcher, replaceStr, startIndex, endIndex, replaceCount);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndex`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
        }
        if (endIndex > size) {
            endIndex = size;
        }
        if (startIndex > endIndex) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `nullText`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
    public TextStringBuilder setNullText(String nullText) {
        if (nullText != null && nullText.isEmpty()) {
            nullText = null;
        }
        this.nullText = nullText;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
        validateIndex(index);
        if (str == null) {
            str = nullText;
        }
        if (str != null) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
     */
    public int indexOf(final StringMatcher matcher, int startIndex) {
        startIndex = Math.max(0, startIndex);
        if (matcher == null || startIndex >= size) {
            return StringUtils.INDEX_NOT_FOUND;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
     */
    public int lastIndexOf(final StringMatcher matcher, int startIndex) {
        startIndex = startIndex >= size ? size - 1 : startIndex;
        if (matcher == null || startIndex < 0) {
            return StringUtils.INDEX_NOT_FOUND;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndex`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
     */
    public TextStringBuilder replace(final int startIndex, int endIndex, final String replaceStr) {
        endIndex = validateRange(startIndex, endIndex);
        final int insertLen = replaceStr == null ? 0 : replaceStr.length();
        replaceImpl(startIndex, endIndex, endIndex - startIndex, replaceStr, insertLen);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
     */
    public int lastIndexOf(final char ch, int startIndex) {
        startIndex = startIndex >= size ? size - 1 : startIndex;
        if (startIndex < 0) {
            return StringUtils.INDEX_NOT_FOUND;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `n`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
        public long skip(long n) {
            if (pos + n > TextStringBuilder.this.size()) {
                n = TextStringBuilder.this.size() - pos;
            }
            if (n < 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `to`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
            if (removeLen > 0) {
                replaceImpl(i, i + removeLen, removeLen, replaceStr, replaceLen);
                to = to - removeLen + replaceLen;
                i = i + replaceLen - 1;
                if (replaceCount > 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `replaceCount`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
                i = i + replaceLen - 1;
                if (replaceCount > 0) {
                    replaceCount--;
                }
            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/text/TextStringBuilder.java`
#### Snippet
```java
     */
    public int indexOf(final String str, int startIndex) {
        startIndex = Math.max(0, startIndex);
        if (str == null || startIndex >= size) {
            return StringUtils.INDEX_NOT_FOUND;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `left`
in `src/main/java/org/apache/commons/text/similarity/LevenshteinDistance.java`
#### Snippet
```java
            // swap the input strings to consume less memory
            final CharSequence tmp = left;
            left = right;
            right = tmp;
            n = m;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `right`
in `src/main/java/org/apache/commons/text/similarity/LevenshteinDistance.java`
#### Snippet
```java
            final CharSequence tmp = left;
            left = right;
            right = tmp;
            n = m;
            m = right.length();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `left`
in `src/main/java/org/apache/commons/text/similarity/LevenshteinDistance.java`
#### Snippet
```java
            // swap the two strings to consume less memory
            final CharSequence tmp = left;
            left = right;
            right = tmp;
            n = m;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `right`
in `src/main/java/org/apache/commons/text/similarity/LevenshteinDistance.java`
#### Snippet
```java
            final CharSequence tmp = left;
            left = right;
            right = tmp;
            n = m;
            m = right.length();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `priorVariables`
in `src/main/java/org/apache/commons/text/StringSubstitutor.java`
#### Snippet
```java
                            // on the first call initialize priorVariables
                            if (priorVariables == null) {
                                priorVariables = new ArrayList<>();
                                priorVariables.add(builder.midString(offset, length));
                            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `priorVariables`
in `src/main/java/org/apache/commons/text/StrSubstitutor.java`
#### Snippet
```java
                                // on the first call initialize priorVariables
                                if (priorVariables == null) {
                                    priorVariables = new ArrayList<>();
                                    priorVariables.add(new String(chars,
                                            offset, length));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `nullText`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
    public StrBuilder setNullText(String nullText) {
        if (nullText != null && nullText.isEmpty()) {
            nullText = null;
        }
        this.nullText = nullText;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
     */
    public int indexOf(final String str, int startIndex) {
        startIndex = Math.max(startIndex, 0);
        if (str == null || startIndex >= size) {
            return -1;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
            }
            if (pos + len > size()) {
                len = StrBuilder.this.size() - pos;
            }
            StrBuilder.this.getChars(pos, pos + len, b, off);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndex`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
     */
    public String substring(final int startIndex, int endIndex) {
        endIndex = validateRange(startIndex, endIndex);
        return new String(buffer, startIndex, endIndex - startIndex);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
     */
    public int indexOf(final StrMatcher matcher, int startIndex) {
        startIndex = Math.max(startIndex, 0);
        if (matcher == null || startIndex >= size) {
            return -1;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
        validateIndex(index);
        if (str == null) {
            str = nullText;
        }
        if (str != null) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndex`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
     */
    public StrBuilder replace(final int startIndex, int endIndex, final String replaceStr) {
        endIndex = validateRange(startIndex, endIndex);
        final int insertLen = replaceStr == null ? 0 : replaceStr.length();
        replaceImpl(startIndex, endIndex, endIndex - startIndex, replaceStr, insertLen);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
            ensureCapacity(size + 4);
            System.arraycopy(buffer, index, buffer, index + 4, size - index);
            buffer[index++] = 't';
            buffer[index++] = 'r';
            buffer[index++] = 'u';
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
            System.arraycopy(buffer, index, buffer, index + 4, size - index);
            buffer[index++] = 't';
            buffer[index++] = 'r';
            buffer[index++] = 'u';
            buffer[index] = 'e';
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
            buffer[index++] = 't';
            buffer[index++] = 'r';
            buffer[index++] = 'u';
            buffer[index] = 'e';
            size += 4;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
            ensureCapacity(size + 5);
            System.arraycopy(buffer, index, buffer, index + 5, size - index);
            buffer[index++] = 'f';
            buffer[index++] = 'a';
            buffer[index++] = 'l';
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
            System.arraycopy(buffer, index, buffer, index + 5, size - index);
            buffer[index++] = 'f';
            buffer[index++] = 'a';
            buffer[index++] = 'l';
            buffer[index++] = 's';
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
            buffer[index++] = 'f';
            buffer[index++] = 'a';
            buffer[index++] = 'l';
            buffer[index++] = 's';
            buffer[index] = 'e';
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
            buffer[index++] = 'a';
            buffer[index++] = 'l';
            buffer[index++] = 's';
            buffer[index] = 'e';
            size += 5;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndex`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
     */
    public char[] toCharArray(final int startIndex, int endIndex) {
        endIndex = validateRange(startIndex, endIndex);
        final int len = endIndex - startIndex;
        if (len == 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
     */
    public int lastIndexOf(final String str, int startIndex) {
        startIndex = startIndex >= size ? size - 1 : startIndex;
        if (str == null || startIndex < 0) {
            return -1;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndex`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
        }
        if (endIndex > size) {
            endIndex = size;
        }
        if (startIndex > endIndex) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
    public String midString(int index, final int length) {
        if (index < 0) {
            index = 0;
        }
        if (length <= 0 || index >= size) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `destination`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
        final int len = length();
        if (destination == null || destination.length < len) {
            destination = new char[len];
        }
        System.arraycopy(buffer, 0, destination, 0, len);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `n`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
        public long skip(long n) {
            if (pos + n > StrBuilder.this.size()) {
                n = StrBuilder.this.size() - pos;
            }
            if (n < 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
     */
    public int lastIndexOf(final StrMatcher matcher, int startIndex) {
        startIndex = startIndex >= size ? size - 1 : startIndex;
        if (matcher == null || startIndex < 0) {
            return -1;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndex`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
            final StrMatcher matcher, final String replaceStr,
            final int startIndex, int endIndex, final int replaceCount) {
        endIndex = validateRange(startIndex, endIndex);
        return replaceImpl(matcher, replaceStr, startIndex, endIndex, replaceCount);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndex`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
     */
    public StrBuilder delete(final int startIndex, int endIndex) {
        endIndex = validateRange(startIndex, endIndex);
        final int len = endIndex - startIndex;
        if (len > 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
     */
    public int lastIndexOf(final char ch, int startIndex) {
        startIndex = startIndex >= size ? size - 1 : startIndex;
        if (startIndex < 0) {
            return -1;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `to`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
            if (removeLen > 0) {
                replaceImpl(i, i + removeLen, removeLen, replaceStr, replaceLen);
                to = to - removeLen + replaceLen;
                i = i + replaceLen - 1;
                if (replaceCount > 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `replaceCount`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
                i = i + replaceLen - 1;
                if (replaceCount > 0) {
                    replaceCount--;
                }
            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
     */
    public int indexOf(final char ch, int startIndex) {
        startIndex = Math.max(startIndex, 0);
        if (startIndex >= size) {
            return -1;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `initialCapacity`
in `src/main/java/org/apache/commons/text/StrBuilder.java`
#### Snippet
```java
    public StrBuilder(int initialCapacity) {
        if (initialCapacity <= 0) {
            initialCapacity = CAPACITY;
        }
        buffer = new char[initialCapacity];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `tok`
in `src/main/java/org/apache/commons/text/StrTokenizer.java`
#### Snippet
```java
            }
            if (isEmptyTokenAsNull()) {
                tok = null;
            }
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `start`
in `src/main/java/org/apache/commons/text/StrTokenizer.java`
#### Snippet
```java
                break;
            }
            start += removeLen;
        }

```

## RuleId[ruleID=HtmlWrongAttributeValue]
### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-19-23-16-26.295.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/FileStringLookup.java`
#### Snippet
```java
    public String lookup(final String key) {
        if (key == null) {
            return null;
        }
        final String[] keys = key.split(String.valueOf(SPLIT_CH));
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/DnsStringLookup.java`
#### Snippet
```java
    public String lookup(final String key) {
        if (key == null) {
            return null;
        }
        final String[] keys = key.trim().split("\\|");
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/DnsStringLookup.java`
#### Snippet
```java
            }
        } catch (final UnknownHostException e) {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/UrlStringLookup.java`
#### Snippet
```java
    public String lookup(final String key) {
        if (key == null) {
            return null;
        }
        final String[] keys = key.split(SPLIT_STR);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/InterpolatorStringLookup.java`
#### Snippet
```java
    public String lookup(String key) {
        if (key == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/InterpolatorStringLookup.java`
#### Snippet
```java
            return defaultStringLookup.lookup(key);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/FunctionStringLookup.java`
#### Snippet
```java
    public String lookup(final String key) {
        if (function == null) {
            return null;
        }
        final V obj;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/FunctionStringLookup.java`
#### Snippet
```java
            // Squelched. All lookup(String) will return null.
            // Could be a ConcurrentHashMap and a null key request
            return null;
        }
        return Objects.toString(obj, null);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/WordUtils.java`
#### Snippet
```java
                              String wrapOn) {
        if (str == null) {
            return null;
        }
        if (newLineStr == null) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/UrlEncoderStringLookup.java`
#### Snippet
```java
    public String lookup(final String key) {
        if (key == null) {
            return null;
        }
        final String enc = StandardCharsets.UTF_8.name();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/ResourceBundleStringLookup.java`
#### Snippet
```java
    public String lookup(final String key) {
        if (key == null) {
            return null;
        }
        final String[] keys = key.split(SPLIT_STR);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/ResourceBundleStringLookup.java`
#### Snippet
```java
        } catch (final MissingResourceException e) {
            // The key is missing, return null such that an interpolator can supply a default value.
            return null;
        } catch (final Exception e) {
            // Should only be a ClassCastException
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/StringLookupFactory.java`
#### Snippet
```java
     * Defines the FunctionStringLookup singleton that always returns null.
     */
    static final FunctionStringLookup<String> INSTANCE_NULL = FunctionStringLookup.on(key -> null);

    /**
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/UrlDecoderStringLookup.java`
#### Snippet
```java
    public String lookup(final String key) {
        if (key == null) {
            return null;
        }
        final String enc = StandardCharsets.UTF_8.name();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/BiFunctionStringLookup.java`
#### Snippet
```java
    public String lookup(final String key, final P object) {
        if (biFunction == null) {
            return null;
        }
        final R obj;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/BiFunctionStringLookup.java`
#### Snippet
```java
            // Squelched. All lookup(String) will return null.
            // Could be a ConcurrentHashMap and a null key request
            return null;
        }
        return Objects.toString(obj, null);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/AlphabetConverter.java`
#### Snippet
```java
            throws UnsupportedEncodingException {
        if (encoded == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/AlphabetConverter.java`
#### Snippet
```java
            throws UnsupportedEncodingException {
        if (original == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StringTokenizer.java`
#### Snippet
```java
            return tokens[tokenPos++];
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StringTokenizer.java`
#### Snippet
```java
            return cloneReset();
        } catch (final CloneNotSupportedException ex) {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StringTokenizer.java`
#### Snippet
```java
    public String getContent() {
        if (chars == null) {
            return null;
        }
        return new String(chars);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StringTokenizer.java`
#### Snippet
```java
            return tokens[--tokenPos];
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/translate/CharSequenceTranslator.java`
#### Snippet
```java
    public final String translate(final CharSequence input) {
        if (input == null) {
            return null;
        }
        try {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/XmlStringLookup.java`
#### Snippet
```java
    public String lookup(final String key) {
        if (key == null) {
            return null;
        }
        final String[] keys = key.split(SPLIT_STR);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/ScriptStringLookup.java`
#### Snippet
```java
    public String lookup(final String key) {
        if (key == null) {
            return null;
        }
        final String[] keys = key.split(SPLIT_STR, 2);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StrLookup.java`
#### Snippet
```java
        public String lookup(final String key) {
            if (resourceBundle == null || key == null || !resourceBundle.containsKey(key)) {
                return null;
            }
            return resourceBundle.getString(key);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StrLookup.java`
#### Snippet
```java
                }
            }
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/diff/StringsComparator.java`
#### Snippet
```java
        final int n = end2 - start2;
        if (m == 0 || n == 0) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StringSubstitutor.java`
#### Snippet
```java
    public String replace(final String source) {
        if (source == null) {
            return null;
        }
        final TextStringBuilder buf = new TextStringBuilder(source);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StringSubstitutor.java`
#### Snippet
```java
    public String replace(final StringBuffer source, final int offset, final int length) {
        if (source == null) {
            return null;
        }
        final TextStringBuilder buf = new TextStringBuilder(length).append(source, offset, length);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StringSubstitutor.java`
#### Snippet
```java
    public String replace(final CharSequence source, final int offset, final int length) {
        if (source == null) {
            return null;
        }
        final TextStringBuilder buf = new TextStringBuilder(length).append(source.toString(), offset, length);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StringSubstitutor.java`
#### Snippet
```java
    public String replace(final char[] source) {
        if (source == null) {
            return null;
        }
        final TextStringBuilder buf = new TextStringBuilder(source.length).append(source);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StringSubstitutor.java`
#### Snippet
```java
        final StringLookup resolver = getStringLookup();
        if (resolver == null) {
            return null;
        }
        return resolver.lookup(variableName);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StringSubstitutor.java`
#### Snippet
```java
    public String replace(final CharSequence source) {
        if (source == null) {
            return null;
        }
        return replace(source, 0, source.length());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StringSubstitutor.java`
#### Snippet
```java
    public String replace(final char[] source, final int offset, final int length) {
        if (source == null) {
            return null;
        }
        final TextStringBuilder buf = new TextStringBuilder(length).append(source, offset, length);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StringSubstitutor.java`
#### Snippet
```java
    public String replace(final String source, final int offset, final int length) {
        if (source == null) {
            return null;
        }
        final TextStringBuilder buf = new TextStringBuilder(length).append(source, offset, length);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StringSubstitutor.java`
#### Snippet
```java
    public String replace(final TextStringBuilder source, final int offset, final int length) {
        if (source == null) {
            return null;
        }
        final TextStringBuilder buf = new TextStringBuilder(length).append(source, offset, length);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StringSubstitutor.java`
#### Snippet
```java
    public String replace(final TextStringBuilder source) {
        if (source == null) {
            return null;
        }
        final TextStringBuilder builder = new TextStringBuilder(source.length()).append(source);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StringSubstitutor.java`
#### Snippet
```java
    public String replace(final StringBuffer source) {
        if (source == null) {
            return null;
        }
        final TextStringBuilder buf = new TextStringBuilder(source.length()).append(source);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StringSubstitutor.java`
#### Snippet
```java
    public String replace(final Object source) {
        if (source == null) {
            return null;
        }
        final TextStringBuilder buf = new TextStringBuilder().append(source);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/JavaPlatformStringLookup.java`
#### Snippet
```java
    public String lookup(final String key) {
        if (key == null) {
            return null;
        }
        switch (key) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/LocalHostStringLookup.java`
#### Snippet
```java
    public String lookup(final String key) {
        if (key == null) {
            return null;
        }
        try {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/LocalHostStringLookup.java`
#### Snippet
```java
            }
        } catch (final UnknownHostException e) {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/PropertiesStringLookup.java`
#### Snippet
```java
    public String lookup(final String key) {
        if (key == null) {
            return null;
        }
        final String[] keys = key.split(SEPARATOR);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/ConstantStringLookup.java`
#### Snippet
```java
    public synchronized String lookup(final String key) {
        if (key == null) {
            return null;
        }
        String result;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/ConstantStringLookup.java`
#### Snippet
```java
        final int fieldPos = key.lastIndexOf(FIELD_SEPARATOR);
        if (fieldPos < 0) {
            return null;
        }
        try {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/ConstantStringLookup.java`
#### Snippet
```java
        } catch (final Exception ex) {
            // TODO it would be nice to log
            return null;
        }
        return result;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/lookup/ConstantStringLookup.java`
#### Snippet
```java
        final Class<?> clazz = fetchClass(className);
        if (clazz == null) {
            return null;
        }
        return clazz.getField(fieldName).get(null);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StrSubstitutor.java`
#### Snippet
```java
    public String replace(final Object source) {
        if (source == null) {
            return null;
        }
        final StrBuilder buf = new StrBuilder().append(source);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StrSubstitutor.java`
#### Snippet
```java
    public String replace(final StrBuilder source, final int offset, final int length) {
        if (source == null) {
            return null;
        }
        final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StrSubstitutor.java`
#### Snippet
```java
    public String replace(final StringBuffer source, final int offset, final int length) {
        if (source == null) {
            return null;
        }
        final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StrSubstitutor.java`
#### Snippet
```java
    public String replace(final String source) {
        if (source == null) {
            return null;
        }
        final StrBuilder buf = new StrBuilder(source);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StrSubstitutor.java`
#### Snippet
```java
    public String replace(final CharSequence source, final int offset, final int length) {
        if (source == null) {
            return null;
        }
        final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StrSubstitutor.java`
#### Snippet
```java
    public String replace(final StrBuilder source) {
        if (source == null) {
            return null;
        }
        final StrBuilder buf = new StrBuilder(source.length()).append(source);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StrSubstitutor.java`
#### Snippet
```java
    public String replace(final char[] source, final int offset, final int length) {
        if (source == null) {
            return null;
        }
        final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StrSubstitutor.java`
#### Snippet
```java
    public String replace(final String source, final int offset, final int length) {
        if (source == null) {
            return null;
        }
        final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StrSubstitutor.java`
#### Snippet
```java
    public String replace(final StringBuffer source) {
        if (source == null) {
            return null;
        }
        final StrBuilder buf = new StrBuilder(source.length()).append(source);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StrSubstitutor.java`
#### Snippet
```java
    public String replace(final char[] source) {
        if (source == null) {
            return null;
        }
        final StrBuilder buf = new StrBuilder(source.length).append(source);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StrSubstitutor.java`
#### Snippet
```java
        final StrLookup<?> resolver = getVariableResolver();
        if (resolver == null) {
            return null;
        }
        return resolver.lookup(variableName);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StrSubstitutor.java`
#### Snippet
```java
    public String replace(final CharSequence source) {
        if (source == null) {
            return null;
        }
        return replace(source, 0, source.length());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StrTokenizer.java`
#### Snippet
```java
    public String getContent() {
        if (chars == null) {
            return null;
        }
        return new String(chars);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StrTokenizer.java`
#### Snippet
```java
            return tokens[--tokenPos];
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StrTokenizer.java`
#### Snippet
```java
            return tokens[tokenPos++];
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/StrTokenizer.java`
#### Snippet
```java
            return cloneReset();
        } catch (final CloneNotSupportedException ex) {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/text/ExtendedMessageFormat.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

## RuleId[ruleID=NullArgumentToVariableArgMethod]
### RuleId[ruleID=NullArgumentToVariableArgMethod]
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/apache/commons/text/WordUtils.java`
#### Snippet
```java
     */
    public static String capitalizeFully(final String str) {
        return capitalizeFully(str, null);
    }

```

### RuleId[ruleID=NullArgumentToVariableArgMethod]
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/apache/commons/text/WordUtils.java`
#### Snippet
```java
     */
    public static String uncapitalize(final String str) {
        return uncapitalize(str, null);
    }

```

### RuleId[ruleID=NullArgumentToVariableArgMethod]
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/apache/commons/text/WordUtils.java`
#### Snippet
```java
     */
    public static String initials(final String str) {
        return initials(str, null);
    }

```

### RuleId[ruleID=NullArgumentToVariableArgMethod]
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/apache/commons/text/WordUtils.java`
#### Snippet
```java
     */
    public static String capitalize(final String str) {
        return capitalize(str, null);
    }

```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
Variable `dataAtLeft` initializer `0` is redundant
in `src/main/java/org/apache/commons/text/similarity/LevenshteinDetailedDistance.java`
#### Snippet
```java
        int columnIndex = left.length();

        int dataAtLeft = 0;
        int dataAtTop = 0;
        int dataAtDiagonal = 0;
```

### RuleId[ruleID=UnusedAssignment]
Variable `dataAtTop` initializer `0` is redundant
in `src/main/java/org/apache/commons/text/similarity/LevenshteinDetailedDistance.java`
#### Snippet
```java

        int dataAtLeft = 0;
        int dataAtTop = 0;
        int dataAtDiagonal = 0;
        int data = 0;
```

### RuleId[ruleID=UnusedAssignment]
Variable `dataAtDiagonal` initializer `0` is redundant
in `src/main/java/org/apache/commons/text/similarity/LevenshteinDetailedDistance.java`
#### Snippet
```java
        int dataAtLeft = 0;
        int dataAtTop = 0;
        int dataAtDiagonal = 0;
        int data = 0;
        boolean deleted = false;
```

### RuleId[ruleID=UnusedAssignment]
Variable `data` initializer `0` is redundant
in `src/main/java/org/apache/commons/text/similarity/LevenshteinDetailedDistance.java`
#### Snippet
```java
        int dataAtTop = 0;
        int dataAtDiagonal = 0;
        int data = 0;
        boolean deleted = false;
        boolean added = false;
```

### RuleId[ruleID=UnusedAssignment]
Variable `deleted` initializer `false` is redundant
in `src/main/java/org/apache/commons/text/similarity/LevenshteinDetailedDistance.java`
#### Snippet
```java
        int dataAtDiagonal = 0;
        int data = 0;
        boolean deleted = false;
        boolean added = false;

```

### RuleId[ruleID=UnusedAssignment]
Variable `added` initializer `false` is redundant
in `src/main/java/org/apache/commons/text/similarity/LevenshteinDetailedDistance.java`
#### Snippet
```java
        int data = 0;
        boolean deleted = false;
        boolean added = false;

        while (rowIndex >= 0 && columnIndex >= 0) {
```

### RuleId[ruleID=UnusedAssignment]
Variable `count` initializer `0` is redundant
in `src/main/java/org/apache/commons/text/io/StringSubstitutorReader.java`
#### Snippet
```java
    @Override
    public int read() throws IOException {
        int count = 0;
        // ask until we get a char or EOS
        do {
```

### RuleId[ruleID=UnusedAssignment]
Variable `readCount` initializer `buffer(readCount(minReadLenPrefix, 0))` is redundant
in `src/main/java/org/apache/commons/text/io/StringSubstitutorReader.java`
#### Snippet
```java
        final int minReadLenPrefix = prefixEscapeMatcher.size();
        // READ enough to test for an [optionally escaped] variable start
        int readCount = buffer(readCount(minReadLenPrefix, 0));
        if (buffer.length() < minReadLenPrefix && targetLength < minReadLenPrefix) {
            // read less than minReadLenPrefix, no variable possible
```

### RuleId[ruleID=UnusedAssignment]
The value `readCount` assigned to `targetLength` is never used
in `src/main/java/org/apache/commons/text/io/StringSubstitutorReader.java`
#### Snippet
```java
                    if (readCount != EOS) {
                        targetIndex += readCount;
                        targetLength -= readCount;
                    }
                    final int actual = targetIndex - targetIndexIn;
```

### RuleId[ruleID=UnusedAssignment]
The value `buffer(readCount(minReadLenSuffix, pos))` assigned to `readCount` is never used
in `src/main/java/org/apache/commons/text/io/StringSubstitutorReader.java`
#### Snippet
```java
        final StringMatcher suffixMatcher = stringSubstitutor.getVariableSuffixMatcher();
        final int minReadLenSuffix = Math.max(minReadLenPrefix, suffixMatcher.size());
        readCount = buffer(readCount(minReadLenSuffix, pos));
        if (eos) {
            // EOS
```

### RuleId[ruleID=UnusedAssignment]
Variable `endMatchLen` initializer `0` is redundant
in `src/main/java/org/apache/commons/text/StringSubstitutor.java`
#### Snippet
```java
                int startPos = pos;
                pos += startMatchLen;
                int endMatchLen = 0;
                int nestedVarCount = 0;
                while (pos < bufEnd) {
```

### RuleId[ruleID=UnusedAssignment]
The value changed at `startPos--` is never used
in `src/main/java/org/apache/commons/text/StringSubstitutor.java`
#### Snippet
```java
                                bufEnd--;
                                pos = startPos + 1;
                                startPos--;
                                continue outer;
                            }
```

### RuleId[ruleID=UnusedAssignment]
Variable `valueDelimiterMatchLen` initializer `0` is redundant
in `src/main/java/org/apache/commons/text/StringSubstitutor.java`
#### Snippet
```java
                            if (valueDelimMatcher != null) {
                                final char[] varNameExprChars = varNameExpr.toCharArray();
                                int valueDelimiterMatchLen = 0;
                                for (int i = 0; i < varNameExprChars.length; i++) {
                                    // if there's any nested variable when nested variable substitution disabled,
```

### RuleId[ruleID=UnusedAssignment]
Variable `endMatchLen` initializer `0` is redundant
in `src/main/java/org/apache/commons/text/StrSubstitutor.java`
#### Snippet
```java
                    final int startPos = pos;
                    pos += startMatchLen;
                    int endMatchLen = 0;
                    int nestedVarCount = 0;
                    while (pos < bufEnd) {
```

### RuleId[ruleID=UnusedAssignment]
Variable `valueDelimiterMatchLen` initializer `0` is redundant
in `src/main/java/org/apache/commons/text/StrSubstitutor.java`
#### Snippet
```java
                                if (valueDelimMatcher != null) {
                                    final char[] varNameExprChars = varNameExpr.toCharArray();
                                    int valueDelimiterMatchLen = 0;
                                    for (int i = 0; i < varNameExprChars.length; i++) {
                                        // if there's any nested variable when nested variable substitution disabled,
```

### RuleId[ruleID=UnusedAssignment]
Variable `exponentDigitCount` initializer `0` is redundant
in `src/main/java/org/apache/commons/text/numbers/ParsedDecimal.java`
#### Snippet
```java
        // characters needed for the exponent digits
        int size = getDigitStringSize(decimalPos, opts);
        int exponentDigitCount = 0;
        if (includeExponent) {
            exponentDigitCount = absTargetExponent > 0
```

### RuleId[ruleID=UnusedAssignment]
Variable `len` initializer `0` is redundant
in `src/main/java/org/apache/commons/text/ExtendedMessageFormat.java`
#### Snippet
```java
     */
    private void seekNonWs(final String pattern, final ParsePosition pos) {
        int len = 0;
        final char[] buffer = pattern.toCharArray();
        do {
```

## RuleId[ruleID=MethodOverridesStaticMethod]
### RuleId[ruleID=MethodOverridesStaticMethod]
Method `below()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/text/translate/JavaUnicodeEscaper.java`
#### Snippet
```java
     * @return The newly created {@code UnicodeEscaper} instance
     */
    public static JavaUnicodeEscaper below(final int codePoint) {
        return outsideOf(codePoint, Integer.MAX_VALUE);
    }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `above()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/text/translate/JavaUnicodeEscaper.java`
#### Snippet
```java
     * @return The newly created {@code UnicodeEscaper} instance
     */
    public static JavaUnicodeEscaper above(final int codePoint) {
        return outsideOf(0, codePoint);
    }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `between()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/text/translate/JavaUnicodeEscaper.java`
#### Snippet
```java
     * @return The newly created {@code UnicodeEscaper} instance
     */
    public static JavaUnicodeEscaper between(final int codePointLow, final int codePointHigh) {
        return new JavaUnicodeEscaper(codePointLow, codePointHigh, true);
    }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `outsideOf()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/text/translate/JavaUnicodeEscaper.java`
#### Snippet
```java
     * @return The newly created {@code UnicodeEscaper} instance
     */
    public static JavaUnicodeEscaper outsideOf(final int codePointLow, final int codePointHigh) {
        return new JavaUnicodeEscaper(codePointLow, codePointHigh, false);
    }
```

