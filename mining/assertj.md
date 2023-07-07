# assertj 
 
# Bad smells
I found 336 bad smells with 6 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalUsedAsFieldOrParameterType | 60 | false |
| FieldMayBeFinal | 50 | false |
| DeprecatedIsStillUsed | 37 | false |
| JavadocLinkAsPlainText | 22 | false |
| IgnoreResultOfCall | 18 | false |
| OptionalGetWithoutIsPresent | 15 | false |
| Deprecation | 12 | false |
| UnnecessaryUnicodeEscape | 12 | false |
| TypeParameterExtendsObject | 12 | false |
| DuplicatedCode | 11 | false |
| JavadocDeclaration | 11 | false |
| DataFlowIssue | 9 | false |
| ConstantValue | 9 | false |
| WrapperTypeMayBePrimitive | 8 | false |
| JavadocReference | 4 | false |
| AutoCloseableResource | 4 | false |
| ComparatorMethodParameterNotUsed | 4 | false |
| RedundantStringFormatCall | 4 | false |
| SuspiciousMethodCalls | 3 | false |
| EqualsWithItself | 2 | false |
| RegExpRedundantEscape | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| NullableProblems | 2 | false |
| RedundantMethodOverride | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| RegExpUnnecessaryNonCapturingGroup | 2 | false |
| UnnecessarySemicolon | 1 | false |
| EmptyStatementBody | 1 | false |
| SortedCollectionWithNonComparableKeys | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| NonFinalFieldInEnum | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| IOStreamConstructor | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| IfStatementMissingBreakInLoop | 1 | false |
| MalformedFormatString | 1 | false |
| SimplifyOptionalCallChains | 1 | false |
| ArrayHashCode | 1 | false |
| PointlessNullCheck | 1 | false |
| PointlessBooleanExpression | 1 | true |
| UseBulkOperation | 1 | false |
| SuspiciousIndentAfterControlStatement | 1 | false |
| StringConcatenationInsideStringBufferAppend | 1 | false |
## RuleId[id=EqualsWithItself]
### EqualsWithItself
`compare()` called on itself
in `assertj-core/src/main/java/org/assertj/core/internal/Lists.java`
#### Snippet
```java
        // Compare unique element with itself to verify that it is compatible with comparator (a ClassCastException is
        // thrown if not). We have to use a raw comparator to compare the unique element of actual ... :(
        rawComparator.compare(actual.get(0), actual.get(0));
        return;
      }
```

### EqualsWithItself
`compare()` called on itself
in `assertj-core/src/main/java/org/assertj/core/internal/Arrays.java`
#### Snippet
```java
      if (arrayAsList.size() == 1) {
        // call compare to see if unique element is compatible with comparator.
        comparator.compare(arrayAsList.get(0), arrayAsList.get(0));
        return;
      }
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `assertj-core/src/main/java/org/assertj/core/util/introspection/FieldSupport.java`
#### Snippet
```java
        switch (clazz.getSimpleName()) {
        case BYTE:
          Byte byteValue = (byte) fieldValue;
          return (T) byteValue;
        case SHORT:
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `assertj-core/src/main/java/org/assertj/core/util/introspection/FieldSupport.java`
#### Snippet
```java
          return (T) byteValue;
        case SHORT:
          Short shortValue = (short) fieldValue;
          return (T) shortValue;
        case INT:
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `assertj-core/src/main/java/org/assertj/core/util/introspection/FieldSupport.java`
#### Snippet
```java
          return (T) shortValue;
        case INT:
          Integer intValue = (int) fieldValue;
          return (T) intValue;
        case LONG:
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `assertj-core/src/main/java/org/assertj/core/util/introspection/FieldSupport.java`
#### Snippet
```java
          return (T) intValue;
        case LONG:
          Long longValue = (long) fieldValue;
          return (T) longValue;
        case FLOAT:
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `assertj-core/src/main/java/org/assertj/core/util/introspection/FieldSupport.java`
#### Snippet
```java
          return (T) longValue;
        case FLOAT:
          Float floatValue = (float) fieldValue;
          return (T) floatValue;
        case DOUBLE:
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `assertj-core/src/main/java/org/assertj/core/util/introspection/FieldSupport.java`
#### Snippet
```java
          return (T) floatValue;
        case DOUBLE:
          Double doubleValue = (double) fieldValue;
          return (T) doubleValue;
        case BOOLEAN:
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `assertj-core/src/main/java/org/assertj/core/util/introspection/FieldSupport.java`
#### Snippet
```java
          return (T) doubleValue;
        case BOOLEAN:
          Boolean booleanValue = (boolean) fieldValue;
          return (T) booleanValue;
        case CHAR:
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `assertj-core/src/main/java/org/assertj/core/util/introspection/FieldSupport.java`
#### Snippet
```java
          return (T) booleanValue;
        case CHAR:
          Character charValue = (char) fieldValue;
          return (T) charValue;
        }
```

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `toStringOf(Date)` is inaccessible from here
in `assertj-core/src/main/java/org/assertj/core/api/Assert.java`
#### Snippet
```java
   * The usual way to introduce a new {@link Representation} is to extend {@link StandardRepresentation}
   * and override any existing {@code toStringOf} methods that don't suit you. For example you can control
   * {@link Date} formatting by overriding {@link StandardRepresentation#toStringOf(Date)}).
   * <p>
   * You can also control other types format by overriding {@link StandardRepresentation#toStringOf(Object)})
```

### JavadocReference
Cannot resolve symbol `compareTo(Object)`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractBigDecimalAssert.java`
#### Snippet
```java
   * <pre><code class='java'> // assertions will pass
   * assertThat(new BigDecimal(&quot;8.0&quot;)).isEqualByComparingTo(&quot;8.0&quot;);
   * // assertion will pass because 8.0 is equals to 8.00 using {@link BigDecimal#compareTo(Object)}
   * assertThat(new BigDecimal(&quot;8.0&quot;)).isEqualByComparingTo(&quot;8.00&quot;);
   *
```

### JavadocReference
Symbol `toStringOf(Map)` is inaccessible from here
in `assertj-core/src/main/java/org/assertj/core/util/Maps.java`
#### Snippet
```java
   * @return the {@code String} representation of the given map.
   * 
   * @deprecated use {@link StandardRepresentation#toStringOf(Map)} instead.
   */
  @Deprecated
```

### JavadocReference
Symbol `toStringOf(Map)` is inaccessible from here
in `assertj-core/src/main/java/org/assertj/core/util/Maps.java`
#### Snippet
```java
   * @return the {@code String} representation of the given map.
   * 
   * @deprecated use {@link StandardRepresentation#toStringOf(Map)} instead.
   */
  @Deprecated
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `assertj-core/src/main/java/org/assertj/core/internal/ComparisonStrategy.java`
#### Snippet
```java
  default String asText() {
    return "";
  };

}
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `spliterator` may produce `NullPointerException`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
  protected AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> flatExtractingForProxy(Function<? super ELEMENT, ?>[] extractors) {
    if (actual == null) throwAssertionError(shouldNotBeNull());
    Stream<? extends ELEMENT> actualStream = stream(actual.spliterator(), false);
    List<Object> result = actualStream.flatMap(element -> Stream.of(extractors).map(extractor -> extractor.apply(element)))
                                      .collect(toList());
```

### DataFlowIssue
Method invocation `spliterator` may produce `NullPointerException`
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
                                                                                          .map(extractor -> extractor.apply(objectToExtractValueFrom))
                                                                                          .toArray());
    List<Tuple> tuples = stream(actual.spliterator(), false).map(tupleExtractor).collect(toList());
    return newListAssertInstanceForMethodsChangingElementType(tuples);
  }
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `assertj-core/src/main/java/org/assertj/core/api/AbstractMapAssert.java`
#### Snippet
```java
    expectUnsupportedOperationException(() -> actual.computeIfAbsent(null, k -> null), "Map.computeIfAbsent(null, k -> null)");
    expectUnsupportedOperationException(() -> actual.computeIfPresent(null, (k, v) -> v), "Map.computeIfPresent(null, (k, v) -> v)");
    expectUnsupportedOperationException(() -> actual.merge(null, null, (v1, v2) -> v1), "Map.merge(null, null, (v1, v2) -> v1))");
    expectUnsupportedOperationException(() -> actual.put(null, null), "Map.put(null, null)");
    expectUnsupportedOperationException(() -> actual.putAll(new HashMap<>()), "Map.putAll(new HashMap<>())");
```

### DataFlowIssue
Immutable object is modified
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/DualValueDeque.java`
#### Snippet
```java
  public boolean add(DualValue dualKey) {
    if (shouldIgnore(dualKey)) return false;
    return super.add(dualKey);
  }

```

### DataFlowIssue
Immutable object is modified
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/DualValueDeque.java`
#### Snippet
```java
  @Override
  public boolean addAll(int index, Collection<? extends DualValue> collection) {
    return super.addAll(index, collection.stream().filter(this::shouldAddDualKey).collect(toList()));
  }

```

### DataFlowIssue
Immutable object is modified
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/DualValueDeque.java`
#### Snippet
```java
  public void add(int index, DualValue dualKey) {
    if (shouldIgnore(dualKey)) return;
    super.add(index, dualKey);
  }

```

### DataFlowIssue
Method invocation `getClass` may produce `NullPointerException`
in `assertj-core/src/main/java/org/assertj/core/error/ShouldHaveRootCauseInstance.java`
#### Snippet
```java
    super("%nExpecting a throwable with root cause being an instance of:%n  %s%nbut was an instance of:%n  %s%n" +
          "%nThrowable that failed the check:%n" + escapePercent(getStackTrace(actual)),
          expectedCauseType, Throwables.getRootCause(actual).getClass());
  }

```

### DataFlowIssue
Method invocation `getClass` may produce `NullPointerException`
in `assertj-core/src/main/java/org/assertj/core/error/ShouldHaveRootCauseExactlyInstance.java`
#### Snippet
```java
    super("%nExpecting a throwable with root cause being exactly an instance of:%n  %s%nbut was an instance of:%n  %s%n" +
          "%nThrowable that failed the check:%n" + escapePercent(getStackTrace(actual)),
          expectedCauseType, Throwables.getRootCause(actual).getClass());
  }

```

### DataFlowIssue
Argument `actual` might be null
in `assertj-core/src/main/java/org/assertj/core/internal/Strings.java`
#### Snippet
```java
  public void assertEqualsToNormalizingUnicode(AssertionInfo info, CharSequence actual, CharSequence expected) {
    if (actual != null) checkCharSequenceIsNotNull(expected);
    String normalizedActual = Normalizer.normalize(actual, Normalizer.Form.NFC);
    String normalizedExpected = Normalizer.normalize(expected, Normalizer.Form.NFC);
    if (!java.util.Objects.equals(normalizedActual, normalizedExpected))
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`while` statement has empty body
in `assertj-core/src/main/java/org/assertj/core/internal/Strings.java`
#### Snippet
```java
    LineNumberReader reader = new LineNumberReader(new StringReader(actual.toString()));
    try {
      while (reader.readLine() != null);
    } catch (IOException e) {
      throw new InputStreamsException(format("Unable to count lines in `%s`", actual), e);
```

## RuleId[id=SortedCollectionWithNonComparableKeys]
### SortedCollectionWithNonComparableKeys
Construction of sorted collection with non-comparable elements
in `assertj-core/src/main/java/org/assertj/core/util/Sets.java`
#### Snippet
```java
   */
  public static <T> TreeSet<T> newTreeSet() {
    return new TreeSet<>();
  }

```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'isEqualToIgnoringHours' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isEqualToIgnoringHours(OffsetDateTime other) {
    Objects.instance().assertNotNull(info, actual);
    assertOffsetDateTimeParameterIsNotNull(other);
```

### DeprecatedIsStillUsed
Deprecated member 'isEqualToIgnoringMinutes' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOffsetDateTimeAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isEqualToIgnoringMinutes(OffsetDateTime other) {
    Objects.instance().assertNotNull(info, actual);
    assertOffsetDateTimeParameterIsNotNull(other);
```

### DeprecatedIsStillUsed
Deprecated member 'isEqualToIgnoringMinutes' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractLocalDateTimeAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isEqualToIgnoringMinutes(LocalDateTime other) {
    Objects.instance().assertNotNull(info, actual);
    assertLocalDateTimeParameterIsNotNull(other);
```

### DeprecatedIsStillUsed
Deprecated member 'isEqualToIgnoringHours' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractLocalDateTimeAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isEqualToIgnoringHours(LocalDateTime other) {
    Objects.instance().assertNotNull(info, actual);
    assertLocalDateTimeParameterIsNotNull(other);
```

### DeprecatedIsStillUsed
Deprecated member 'Java6JUnitSoftAssertions' is still used
in `assertj-core/src/main/java/org/assertj/core/api/Java6JUnitSoftAssertions.java`
#### Snippet
```java
 */
@Deprecated
public class Java6JUnitSoftAssertions extends AbstractSoftAssertions
    implements Java6StandardSoftAssertionsProvider, SoftAssertionsRule {

```

### DeprecatedIsStillUsed
Deprecated member 'Java6JUnitBDDSoftAssertions' is still used
in `assertj-core/src/main/java/org/assertj/core/api/Java6JUnitBDDSoftAssertions.java`
#### Snippet
```java
 */
@Deprecated
public class Java6JUnitBDDSoftAssertions extends AbstractSoftAssertions
    implements Java6BDDSoftAssertionsProvider, SoftAssertionsRule {
}
```

### DeprecatedIsStillUsed
Deprecated member 'isEqualToIgnoringNullFields' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isEqualToIgnoringNullFields(Object other) {
    objects.assertIsEqualToIgnoringNullFields(info, actual, other, comparatorsByPropertyOrField, getComparatorsByType());
    return myself;
```

### DeprecatedIsStillUsed
Deprecated member 'isEqualToIgnoringGivenFields' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isEqualToIgnoringGivenFields(Object other, String... propertiesOrFieldsToIgnore) {
    objects.assertIsEqualToIgnoringGivenFields(info, actual, other, comparatorsByPropertyOrField, getComparatorsByType(),
                                               propertiesOrFieldsToIgnore);
```

### DeprecatedIsStillUsed
Deprecated member 'isEqualToComparingOnlyGivenFields' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isEqualToComparingOnlyGivenFields(Object other, String... propertiesOrFieldsUsedInComparison) {
    objects.assertIsEqualToComparingOnlyGivenFields(info, actual, other, comparatorsByPropertyOrField, getComparatorsByType(),
                                                    propertiesOrFieldsUsedInComparison);
```

### DeprecatedIsStillUsed
Deprecated member 'isEqualToComparingFieldByFieldRecursively' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isEqualToComparingFieldByFieldRecursively(Object other) {
    objects.assertIsEqualToComparingFieldByFieldRecursively(info, actual, other, comparatorsByPropertyOrField,
                                                            getComparatorsByType());
```

### DeprecatedIsStillUsed
Deprecated member 'Java6Assertions' is still used
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
@CheckReturnValue
@Deprecated
public class Java6Assertions {

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'isEqualToIgnoringMinutes' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractZonedDateTimeAssert.java`
#### Snippet
```java
   * this is the right way to compare with a given precision.
   */
  public SELF isEqualToIgnoringMinutes(ZonedDateTime other) {
    Objects.instance().assertNotNull(info, actual);
    assertDateTimeParameterIsNotNull(other);
```

### DeprecatedIsStillUsed
Deprecated member 'isEqualToIgnoringHours' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractZonedDateTimeAssert.java`
#### Snippet
```java
   * this is the right way to compare with a given precision.
   */
  public SELF isEqualToIgnoringHours(ZonedDateTime other) {
    Objects.instance().assertNotNull(info, actual);
    assertDateTimeParameterIsNotNull(other);
```

### DeprecatedIsStillUsed
Deprecated member 'isJavaBlank' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharSequenceAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isJavaBlank() {
    strings.assertJavaBlank(info, actual);
    return myself;
```

### DeprecatedIsStillUsed
Deprecated member 'isXmlEqualToContentOf' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharSequenceAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isXmlEqualToContentOf(File xmlFile) {
    isXmlEqualTo(contentOf(xmlFile));
    return myself;
```

### DeprecatedIsStillUsed
Deprecated member 'isNotJavaBlank' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharSequenceAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isNotJavaBlank() {
    strings.assertNotJavaBlank(info, actual);
    return myself;
```

### DeprecatedIsStillUsed
Deprecated member 'isXmlEqualTo' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharSequenceAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isXmlEqualTo(CharSequence expectedXml) {
    strings.assertXmlEqualsTo(info, actual, expectedXml);
    return myself;
```

### DeprecatedIsStillUsed
Deprecated member 'temporaryFolder' is still used
in `assertj-core/src/main/java/org/assertj/core/util/Files.java`
#### Snippet
```java
   */
  @Deprecated
  public static File temporaryFolder() {
    File temp = new File(temporaryFolderPath());
    if (!temp.isDirectory()) {
```

### DeprecatedIsStillUsed
Deprecated member 'hasNotFailed' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCompletableFutureAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF hasNotFailed() {
    isNotNull();
    if (actual.isCompletedExceptionally() && !actual.isCancelled()) throwAssertionError(shouldNotHaveFailed(actual));
```

### DeprecatedIsStillUsed
Deprecated member 'hasFailed' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCompletableFutureAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF hasFailed() {
    isNotNull();
    if (!(actual.isCompletedExceptionally() && !actual.isCancelled())) throwAssertionError(shouldHaveFailed(actual));
```

### DeprecatedIsStillUsed
Deprecated member 'hasFailedWithThrowableThat' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCompletableFutureAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public AbstractThrowableAssert<?, ? extends Throwable> hasFailedWithThrowableThat() {
    hasFailed();
    try {
```

### DeprecatedIsStillUsed
Deprecated member 'SoftlyExtension' is still used
in `assertj-core/src/main/java/org/assertj/core/api/junit/jupiter/SoftlyExtension.java`
#### Snippet
```java
 **/
@Deprecated
public class SoftlyExtension implements AfterTestExecutionCallback, TestInstancePostProcessor {

  private static final Namespace SOFTLY_EXTENSION_NAMESPACE = Namespace.create(SoftlyExtension.class);
```

### DeprecatedIsStillUsed
Deprecated member 'isInSameSecondAs' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isInSameSecondAs(String dateAsString) {
    return isInSameSecondAs(parse(dateAsString));
  }
```

### DeprecatedIsStillUsed
Deprecated member 'isEqualToIgnoringMillis' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isEqualToIgnoringMillis(Date date) {
    dates.assertIsEqualWithPrecision(info, actual, date, MILLISECONDS);
    return myself;
```

### DeprecatedIsStillUsed
Deprecated member 'isEqualToIgnoringMinutes' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isEqualToIgnoringMinutes(String dateAsString) {
    return isEqualToIgnoringMinutes(parse(dateAsString));
  }
```

### DeprecatedIsStillUsed
Deprecated member 'isEqualToIgnoringMinutes' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isEqualToIgnoringMinutes(Instant instant) {
    return isEqualToIgnoringMinutes(Date.from(instant));
  }
```

### DeprecatedIsStillUsed
Deprecated member 'isEqualToIgnoringHours' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isEqualToIgnoringHours(String dateAsString) {
    return isEqualToIgnoringHours(parse(dateAsString));
  }
```

### DeprecatedIsStillUsed
Deprecated member 'isEqualToIgnoringHours' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isEqualToIgnoringHours(Instant instant) {
    return isEqualToIgnoringHours(Date.from(instant));
  }
```

### DeprecatedIsStillUsed
Deprecated member 'isEqualToIgnoringMinutes' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isEqualToIgnoringMinutes(Date date) {
    dates.assertIsEqualWithPrecision(info, actual, date, MINUTES);
    return myself;
```

### DeprecatedIsStillUsed
Deprecated member 'isInSameMinuteAs' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isInSameMinuteAs(String dateAsString) {
    return isInSameMinuteAs(parse(dateAsString));
  }
```

### DeprecatedIsStillUsed
Deprecated member 'isInSameHourAs' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isInSameHourAs(Date other) {
    dates.assertIsInSameHourAs(info, actual, other);
    return myself;
```

### DeprecatedIsStillUsed
Deprecated member 'isEqualToIgnoringMillis' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isEqualToIgnoringMillis(Instant instant) {
    return isEqualToIgnoringMillis(Date.from(instant));
  }
```

### DeprecatedIsStillUsed
Deprecated member 'isEqualToIgnoringMillis' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isEqualToIgnoringMillis(String dateAsString) {
    return isEqualToIgnoringMillis(parse(dateAsString));
  }
```

### DeprecatedIsStillUsed
Deprecated member 'isInSameMinuteAs' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isInSameMinuteAs(Date other) {
    dates.assertIsInSameMinuteAs(info, actual, other);
    return myself;
```

### DeprecatedIsStillUsed
Deprecated member 'isInSameSecondAs' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isInSameSecondAs(Date other) {
    dates.assertIsInSameSecondAs(info, actual, other);
    return myself;
```

### DeprecatedIsStillUsed
Deprecated member 'isInSameHourAs' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isInSameHourAs(String dateAsString) {
    return isInSameHourAs(parse(dateAsString));
  }
```

### DeprecatedIsStillUsed
Deprecated member 'isEqualToIgnoringHours' is still used
in `assertj-core/src/main/java/org/assertj/core/api/AbstractDateAssert.java`
#### Snippet
```java
   */
  @Deprecated
  public SELF isEqualToIgnoringHours(Date date) {
    dates.assertIsEqualWithPrecision(info, actual, date, HOURS);
    return myself;
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/ComparisonDifference.java`
#### Snippet
```java
    String index = path.substring(1);
    // index = 12
    return index.replaceFirst("\\]", "");
  }

```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/ComparisonDifference.java`
#### Snippet
```java
  // - \] represents ] in a regex
  // - $ represents the end of the string in a regex
  private static final String TOP_LEVEL_ELEMENT_PATTERN = "^\\[\\d+\\]$";
  private static final String FIELD = "field/property '%s'";
  private static final String TOP_LEVEL_OBJECTS = "Top level actual and expected objects";
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `assertj-core/src/main/java/org/assertj/core/internal/Dates.java`
#### Snippet
```java
      calendarOther.set(Calendar.MILLISECOND, 0);
    case MICROSECONDS:
      break;
    default:
      break;
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `description` in enum 'GroupType'
in `assertj-core/src/main/java/org/assertj/core/presentation/StandardRepresentation.java`
#### Snippet
```java
    ITERABLE("iterable"), ARRAY("array");

    private String description;

    GroupType(String value) {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `assertj-core/src/main/java/org/assertj/core/api/Boolean2DArrayAssert.java`
#### Snippet
```java
      if (actualSubArray == expectedSubArray) continue;
      if (actualSubArray == null) throw failures.failure(info, shouldNotBeNull("actual[" + i + "]"));
      if (expectedSubArray.length != actualSubArray.length) {
        throw failures.failure(info, subarraysShouldHaveSameSize(actual, expected, actualSubArray, actualSubArray.length,
                                                                 expectedSubArray, expectedSubArray.length, i),
                               info.representation().toStringOf(actual), info.representation().toStringOf(expected));
      }
```

### DuplicatedCode
Duplicated code
in `assertj-core/src/main/java/org/assertj/core/api/ClassBasedNavigableIterableAssert.java`
#### Snippet
```java
    try {
      Constructor<?>[] declaredConstructors = assertClass.getDeclaredConstructors();
      // find a matching Assert constructor for E or one of its subclass.
      for (Constructor<?> constructor : declaredConstructors) {
        if (constructor.getParameterCount() == 1 && constructor.getParameterTypes()[0].isAssignableFrom(clazz)) {
          @SuppressWarnings("unchecked")
          ELEMENT_ASSERT newAssert = (ELEMENT_ASSERT) constructor.newInstance(value);
          return newAssert.as(description);
        }
      }
      throw new RuntimeException("Failed to find a constructor matching " + value
                                 + " class to build the expected Assert class");
    } catch (Exception e) {
      throw new RuntimeException("Failed to build an assert object with " + value + ": " + e.getMessage(), e);
    }
```

### DuplicatedCode
Duplicated code
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/RecursiveComparisonDifferenceCalculator.java`
#### Snippet
```java
    FieldLocation arrayFieldLocation = dualValue.fieldLocation;
    for (int i = 0; i < actualArrayLength; i++) {
      Object actualElement = actual.get(i);
      Object expectedElement = expected.get(i);
      FieldLocation elementFieldLocation = arrayFieldLocation.field(format(ARRAY_FIELD_NAME + "[%d]", i));
      comparisonState.registerForComparison(new DualValue(elementFieldLocation, actualElement, expectedElement));
    }
```

### DuplicatedCode
Duplicated code
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/RecursiveComparisonDifferenceCalculator.java`
#### Snippet
```java
    if (customEquals.containsKey(c)) {
      return customEquals.get(c);
    }

    Class<?> origClass = c;
    while (!Object.class.equals(c)) {
      try {
        c.getDeclaredMethod("equals", Object.class);
        customEquals.put(origClass, true);
        return true;
      } catch (Exception ignored) {}
      c = c.getSuperclass();
    }
    customEquals.put(origClass, false);
    return false;
```

### DuplicatedCode
Duplicated code
in `assertj-core/src/main/java/org/assertj/core/internal/Arrays.java`
#### Snippet
```java
      if (arrayAsList.size() == 1) {
        // call compare to see if unique element is compatible with comparator.
        comparator.compare(arrayAsList.get(0), arrayAsList.get(0));
        return;
      }
      for (int i = 0; i < arrayAsList.size() - 1; i++) {
        // array is sorted in comparator defined order iif element i is less or equal than element i+1
        if (comparator.compare(arrayAsList.get(i), arrayAsList.get(i + 1)) > 0)
          throw failures.failure(info, shouldBeSortedAccordingToGivenComparator(i, array, comparator));
      }
```

### DuplicatedCode
Duplicated code
in `assertj-core/src/main/java/org/assertj/core/internal/DeepDifference.java`
#### Snippet
```java
      DualKey dk = new DualKey(path, entry1.getKey(), entry2.getKey());
      if (!visited.contains(dk)) {
        toCompare.addFirst(dk);
      }

      dk = new DualKey(path, entry1.getValue(), entry2.getValue());
      if (!visited.contains(dk)) {
        toCompare.addFirst(dk);
      }
```

### DuplicatedCode
Duplicated code
in `assertj-core/src/main/java/org/assertj/core/internal/Objects.java`
#### Snippet
```java
      Object actualFieldValue = getPropertyOrFieldValue(actual, fieldName);
      Object otherFieldValue = getPropertyOrFieldValue(other, fieldName);
      if (!propertyOrFieldValuesAreEqual(actualFieldValue, otherFieldValue, fieldName, comparatorByPropertyOrField,
                                         comparatorByType)) {
        rejectedFieldsNames.add(fieldName);
        expectedValues.add(otherFieldValue);
        rejectedValues.add(actualFieldValue);
      }
```

### DuplicatedCode
Duplicated code
in `assertj-core/src/main/java/org/assertj/core/internal/Strings.java`
#### Snippet
```java
    doCommonCheckForCharSequence(info, actual, sequence);

    Set<CharSequence> notFound = stream(sequence).filter(value -> !stringContains(actual, value))
                                                 .collect(toCollection(LinkedHashSet::new));

    if (!notFound.isEmpty()) {
      // don't bother looking for a sequence, some of the sequence elements were not found !
      if (notFound.size() == 1 && sequence.length == 1) {
        throw failures.failure(info, shouldContain(actual, sequence[0], comparisonStrategy));
      }
      throw failures.failure(info, shouldContain(actual, sequence, notFound, comparisonStrategy));
    }

    // we have found all the given values but were they in the expected order ?
    if (sequence.length == 1) return; // no order check needed for a one element sequence
```

### DuplicatedCode
Duplicated code
in `assertj-core/src/main/java/org/assertj/core/util/diff/DiffUtils.java`
#### Snippet
```java
        if (rawChunk.size() != 0) {
          List<String> oldChunkLines = new ArrayList<>();
          List<String> newChunkLines = new ArrayList<>();

          for (String[] raw_line : rawChunk) {
            tag = raw_line[0];
            rest = raw_line[1];
            if (tag.equals(" ") || tag.equals("-")) {
              oldChunkLines.add(rest);
            }
            if (tag.equals(" ") || tag.equals("+")) {
              newChunkLines.add(rest);
            }
          }
          patch.addDelta(new ChangeDelta<>(new Chunk<>(old_ln - 1, oldChunkLines),
                                           new Chunk<>(new_ln - 1, newChunkLines)));
          rawChunk.clear();
        }
```

### DuplicatedCode
Duplicated code
in `assertj-core/src/main/java/org/assertj/core/util/diff/DiffUtils.java`
#### Snippet
```java
    for (line = contextStart; line < curDelta.getOriginal().getPosition(); line++) { //
      buffer.add(" " + origLines.get(line));
      origTotal++;
      revTotal++;
    }

    // output the first Delta
    buffer.addAll(getDeltaText(curDelta));
    origTotal += curDelta.getOriginal().getLines().size();
    revTotal += curDelta.getRevised().getLines().size();
```

### DuplicatedCode
Duplicated code
in `assertj-core/src/main/javadoc/assertj-javadoc.css`
#### Snippet
```java
/*
 * Javadoc style sheet
 */
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `assertj-core/src/main/java/org/assertj/core/condition/VerboseCondition.java`
#### Snippet
```java
   * @return the verbose condition description.
   */
  protected String buildVerboseDescription(T objectUnderTest, boolean matches) {
    StringBuilder sb = new StringBuilder(format("%s", description));
    if (!matches) sb.append(objectUnderTestDescriptor.apply(objectUnderTest));
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `assertj-core/src/main/java/org/assertj/core/util/TextFileWriter.java`
#### Snippet
```java

  public void write(File file, Charset charset, String... content) throws IOException {
    try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file), charset))) {
      for (String line : content) {
        writer.println(line);
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `assertj-core/src/main/java/org/assertj/core/error/ShouldNotSatisfyPredicateRecursively.java`
#### Snippet
```java
                                                                List<FieldLocation> failedFields) {
    List<String> fieldsDescription = failedFields.stream().map(FieldLocation::getPathToUseInErrorReport).collect(toList());
    StringBuilder builder = new StringBuilder(NEW_LINE);
    builder.append("The following fields did not satisfy the predicate:").append(NEW_LINE);
    builder.append(INDENT + fieldsDescription.toString() + NEW_LINE);
```

## RuleId[id=Deprecation]
### Deprecation
'org.assertj.core.api.Java6Assertions' is deprecated
in `assertj-core/src/main/java/org/assertj/core/api/Java6BDDAssertions.java`
#### Snippet
```java

import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.Java6Assertions.assertThat;

import java.io.File;
```

### Deprecation
'usingElementComparatorOnFields(java.lang.String...)' is deprecated
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * <ul>
   * <li>
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code>
   * </li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
```

### Deprecation
'isEqualToComparingFieldByField(java.lang.Object)' is deprecated
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code>
   * </li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
   * </ul>
   *
```

### Deprecation
'usingElementComparatorOnFields(java.lang.String...)' is deprecated
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * <ul>
   * <li>
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code>
   * </li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
```

### Deprecation
'isEqualToComparingFieldByField(java.lang.Object)' is deprecated
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code>
   * </li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
   * </ul>
   *
```

### Deprecation
'usingElementComparatorOnFields(java.lang.String...)' is deprecated
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * The following (incomplete) list of methods will be impacted by this change :
   * <ul>
   * <li><code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code></li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
   * </ul>
```

### Deprecation
'isEqualToComparingFieldByField(java.lang.Object)' is deprecated
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * <ul>
   * <li><code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code></li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
   * </ul>
   *
```

### Deprecation
'org.assertj.core.api.junit.jupiter.SoftlyExtension' is deprecated
in `assertj-core/src/main/java/org/assertj/core/api/junit/jupiter/SoftAssertionsExtension.java`
#### Snippet
```java
 *
 * @author Sam Brannen
 * @author Arthur Mita (author of {@link SoftlyExtension})
 * @author Fr Jeremy Krieg
 * @since 3.13
```

### Deprecation
'usingElementComparatorOnFields(java.lang.String...)' is deprecated
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * <ul>
   * <li>
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code>
   * </li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
```

### Deprecation
'isEqualToComparingFieldByField(java.lang.Object)' is deprecated
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * <code>{@link org.assertj.core.api.AbstractIterableAssert#usingElementComparatorOnFields(java.lang.String...)}</code>
   * </li>
   * <li><code>{@link org.assertj.core.api.AbstractObjectAssert#isEqualToComparingFieldByField(Object)}</code></li>
   * </ul>
   *
```

### Deprecation
'isAccessible()' is deprecated
in `assertj-core/src/main/java/org/assertj/core/util/introspection/MemberUtils.java`
#### Snippet
```java
     */
    static void setAccessibleWorkaround(AccessibleObject o) {
        if (o == null || o.isAccessible()) {
            return;
        }
```

### Deprecation
'isAccessible()' is deprecated
in `assertj-core/src/main/java/org/assertj/core/util/introspection/FieldUtils.java`
#### Snippet
```java
  private static Object readField(Field field, Object target, boolean forceAccess) throws IllegalAccessException {
    checkArgument(field != null, "The field must not be null");
    if (forceAccess && !field.isAccessible()) {
      field.setAccessible(true);
    } else {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `assertj-core/src/main/java/org/assertj/core/error/ShouldNotSatisfyPredicateRecursively.java`
#### Snippet
```java
    StringBuilder builder = new StringBuilder(NEW_LINE);
    builder.append("The following fields did not satisfy the predicate:").append(NEW_LINE);
    builder.append(INDENT + fieldsDescription.toString() + NEW_LINE);
    builder.append("The recursive assertion was performed with this configuration:").append(NEW_LINE);
    builder.append(recursiveAssertionConfiguration);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `assertj-core/src/main/java/org/assertj/core/internal/ComparatorBasedComparisonStrategy.java`
#### Snippet
```java
  @Override
  public String asText() {
    return "when comparing values using " + toString();
  }

```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractMapAssert.java`
#### Snippet
```java
  public AbstractListAssert<?, List<?>, Object, ObjectAssert<Object>> extracting(Object... keys) {
    isNotNull();
    List<Object> extractedValues = Stream.of(keys).map(actual::get).collect(toList());
    String extractedPropertiesOrFieldsDescription = extractedDescriptionOf(keys);
    String description = mostRelevantDescription(info.description(), extractedPropertiesOrFieldsDescription);
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractMapAssert.java`
#### Snippet
```java
  public AbstractObjectAssert<?, ?> extracting(Object key) {
    isNotNull();
    Object extractedValue = actual.get(key);
    String extractedPropertyOrFieldDescription = extractedDescriptionOf(key);
    String description = mostRelevantDescription(info.description(), extractedPropertyOrFieldDescription);
```

### SuspiciousMethodCalls
'Set' may not contain objects of type 'capture of ?'
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/RecursiveComparisonDifferenceCalculator.java`
#### Snippet
```java
    // actual and expected maps same size but do they have the same keys?
    Set<?> expectedKeysNotFound = new LinkedHashSet<>(expectedMap.keySet());
    expectedKeysNotFound.removeAll(actualMap.keySet());
    if (!expectedKeysNotFound.isEmpty()) {
      comparisonState.addDifference(dualValue, format("The following keys were not found in the actual map value:%n  %s",
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @ByDefault
in `assertj-core/src/main/java/org/assertj/core/api/ClassLoadingStrategyFactory.java`
#### Snippet
```java

    @Override
    public Map<TypeDescription, Class<?>> load(ClassLoader classLoader, Map<TypeDescription, byte[]> types) {
      Map<TypeDescription, Class<?>> result = new LinkedHashMap<>();
      for (Map.Entry<TypeDescription, byte[]> entry : types.entrySet()) {
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `assertj-core/src/main/java/org/assertj/core/error/BasicErrorMessageFactory.java`
#### Snippet
```java

    @Override
    public CharSequence subSequence(int start, int end) {
      return string.subSequence(start, end);
    }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
 * <p>
 * This why {@link Assertions} have been split in {@link AssertionsForClassTypes} and {@link AssertionsForInterfaceTypes}
 * (see http://stackoverflow.com/questions/29499847/ambiguous-method-in-java-8-why).
 *
 * @author Alex Ruiz
```

### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
 * Based on an idea by David Gageot :
 *
 * http://blog.javabien.net/2014/04/23/what-if-assertj-used-java-8/
 *
 * @author Alan Rothkopf
```

### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForInterfaceTypes.java`
#### Snippet
```java
 * <p>
 * This why {@link Assertions} have been split in {@link AssertionsForClassTypes} and {@link AssertionsForInterfaceTypes}
 * (see http://stackoverflow.com/questions/29499847/ambiguous-method-in-java-8-why).
 *
 * @author Alex Ruiz
```

### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
 * <p>
 * This why {@link Assertions} have been split in {@link AssertionsForClassTypes} and {@link AssertionsForInterfaceTypes}
 * (see http://stackoverflow.com/questions/29499847/ambiguous-method-in-java-8-why).
 */
@CheckReturnValue
```

### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/util/Files.java`
#### Snippet
```java
   * @param file the file or directory to delete.
   *
   * @deprecated use https://commons.apache.org/proper/commons-io/javadocs/api-release/org/apache/commons/io/FileUtils.html#forceDelete-java.io.File- instead
   */
  @Deprecated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/util/diff/InsertDelta.java`
#### Snippet
```java

/**
 * Initially copied from https://code.google.com/p/java-diff-utils/.
 * <p>
 * Describes the add-delta between original and revised texts.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/util/xml/XmlStringPrettyFormatter.java`
#### Snippet
```java
 * Format an XML String with indent = 2 space.
 * <p>
 * Very much inspired by http://stackoverflow.com/questions/139076/how-to-pretty-print-xml-from-java and
 * http://pastebin.com/XL7932aC
 * </p>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/util/xml/XmlStringPrettyFormatter.java`
#### Snippet
```java
 * <p>
 * Very much inspired by http://stackoverflow.com/questions/139076/how-to-pretty-print-xml-from-java and
 * http://pastebin.com/XL7932aC
 * </p>
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/util/diff/DeltaComparator.java`
#### Snippet
```java

/**
 * Copy from https://code.google.com/p/java-diff-utils/.
 * <p>
 * @author mksenzov
```

### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/util/diff/DiffAlgorithm.java`
#### Snippet
```java

/**
 * Copy from https://code.google.com/p/java-diff-utils/.
 * <p>
 * The general interface for computing diffs between two lists of elements of type T. 
```

### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/util/diff/ChangeDelta.java`
#### Snippet
```java

/**
 * Initially copied from https://code.google.com/p/java-diff-utils/.
 * <p>
 * Describes the change-delta between original and revised texts.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/util/diff/DeleteDelta.java`
#### Snippet
```java

/**
 * Initially copied from https://code.google.com/p/java-diff-utils/.
 * <p>
 * Describes the delete-delta between original and revised texts.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/util/diff/Patch.java`
#### Snippet
```java

/**
 * Copy from https://code.google.com/p/java-diff-utils/.
 * <p>
 * Describes the patch holding all deltas between the original and revised texts.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/util/diff/Delta.java`
#### Snippet
```java

/**
 * Initially copied from https://code.google.com/p/java-diff-utils/.
 * <p>
 * Describes the delta between original and revised texts.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/util/diff/myers/Snake.java`
#### Snippet
```java

/**
 * Copy from https://code.google.com/p/java-diff-utils/.
 * <p>
 *  Represents a snake in a diffpath.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/util/diff/myers/DiffNode.java`
#### Snippet
```java

/**
 * Copy from https://code.google.com/p/java-diff-utils/.
 * <p>
 * A diffnode in a diffpath.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/util/diff/myers/Equalizer.java`
#### Snippet
```java

/**
 * Copy from https://code.google.com/p/java-diff-utils/.
 * <p>
 * Specifies when two compared elements in the Myers algorithm are equal.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/util/diff/Chunk.java`
#### Snippet
```java

/**
 * Copy from https://code.google.com/p/java-diff-utils/.
 * <p>
 * Holds the information about the part of text involved in the diff process
```

### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/util/diff/myers/PathNode.java`
#### Snippet
```java

/**
 * Copy from https://code.google.com/p/java-diff-utils/.
 * <p>
 * A node in a diffpath.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/util/diff/DiffUtils.java`
#### Snippet
```java

/**
 * Copy from https://code.google.com/p/java-diff-utils/.
 * <p>
 * Implements the difference and patching engine
```

### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/util/diff/myers/MyersDiff.java`
#### Snippet
```java

/**
 * Copy from https://code.google.com/p/java-diff-utils/.
 * <p>
 * A clean-room implementation of <a href="http://www.cs.arizona.edu/people/gene/">
```

### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-core/src/main/java/org/assertj/core/internal/DeepDifference.java`
#### Snippet
```java
 * Tests two objects for differences by doing a 'deep' comparison.
 *
 * Based on the deep equals implementation of https://github.com/jdereg/java-util
 *
 * @author John DeRegnaucourt (john@cedarsoftware.com)
```

## RuleId[id=IfStatementMissingBreakInLoop]
### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `assertj-core/src/main/java/org/assertj/core/internal/Arrays.java`
#### Snippet
```java
      boolean matching = false;
      for (Class<?> expectedType : expectedTypes) {
        if (expectedType.isInstance(value)) matching = true;
      }
      if (!matching) nonMatchingElements.add(value);
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `AbstractIterableAssert.usingElementComparator()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
  public <T> SELF usingComparatorForType(Comparator<T> comparator, Class<T> type) {
    if (iterables.getComparator() == null) {
      usingElementComparator(new ExtendedByTypesComparator(getComparatorsByType()));
    }

```

### IgnoreResultOfCall
Result of `AbstractIterableAssert.usingDefaultElementComparator()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
      // compatible with extracted values type, example with a SortedSet<Person> using a comparator on the Person's age, after
      // extracting names we get a List<String> which is mot suitable for the age comparator
      usingDefaultElementComparator();
    }
    return newListAssertInstance(values).withAssertionState(myself);
```

### IgnoreResultOfCall
Result of `FilterOperator.applyOn()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
    checkNotNull(filterOperator);
    Filters<? extends ELEMENT> filter = filter((Iterable<? extends ELEMENT>) actual).with(propertyOrFieldName);
    filterOperator.applyOn(filter);
    return newAbstractIterableAssert(filter.get()).withAssertionState(myself);
  }
```

### IgnoreResultOfCall
Result of `AbstractIterableAssert.usingElementComparator()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
      SortedSet<ELEMENT> sortedSet = (SortedSet<ELEMENT>) actual;
      Comparator<? super ELEMENT> comparator = sortedSet.comparator();
      if (comparator != null) usingElementComparator(sortedSet.comparator());
    }
  }
```

### IgnoreResultOfCall
Result of `ThrowableAssertAlternative.as()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/SoftThrowableAssertAlternative.java`
#### Snippet
```java
  @Override
  public SoftThrowableAssertAlternative<ACTUAL> as(Description description) {
    super.as(description);
    return this;
  }
```

### IgnoreResultOfCall
Result of `FilterOperator.applyOn()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/AtomicReferenceArrayAssert.java`
#### Snippet
```java
    checkNotNull(filterOperator);
    Filters<? extends T> filter = filter(array).with(propertyOrFieldName);
    filterOperator.applyOn(filter);
    return new AtomicReferenceArrayAssert<>(new AtomicReferenceArray<>(toArray(filter.get())));
  }
```

### IgnoreResultOfCall
Result of `AtomicReferenceArrayAssert.usingElementComparator()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/AtomicReferenceArrayAssert.java`
#### Snippet
```java
  public <C> AtomicReferenceArrayAssert<T> usingComparatorForType(Comparator<C> comparator, Class<C> type) {
    if (arrays.getComparator() == null) {
      usingElementComparator(new ExtendedByTypesComparator(getComparatorsByType()));
    }

```

### IgnoreResultOfCall
Result of `FilterOperator.applyOn()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
    checkNotNull(filterOperator);
    Filters<ELEMENT> filter = filter(actual).with(propertyOrFieldName);
    filterOperator.applyOn(filter);
    return newObjectArrayAssert(filter.get());
  }
```

### IgnoreResultOfCall
Result of `AbstractObjectArrayAssert.usingElementComparator()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
  public <C> SELF usingComparatorForType(Comparator<C> comparator, Class<C> type) {
    if (arrays.getComparator() == null) {
      usingElementComparator(new ExtendedByTypesComparator(getComparatorsByType()));
    }
    getComparatorsForElementPropertyOrFieldTypes().registerComparator(type, comparator);
```

### IgnoreResultOfCall
Result of `ListFromStream.initList()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/ListAssert.java`
#### Snippet
```java
    @Override
    public ELEMENT get(int index) {
      initList();
      return list.get(index);
    }
```

### IgnoreResultOfCall
Result of `ListFromStream.initList()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/ListAssert.java`
#### Snippet
```java
    @Override
    public Stream<ELEMENT> stream() {
      initList();
      return list.stream();
    }
```

### IgnoreResultOfCall
Result of `ListFromStream.initList()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/ListAssert.java`
#### Snippet
```java
    @Override
    public int size() {
      initList();
      return list.size();
    }
```

### IgnoreResultOfCall
Result of `Object.hashCode()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
  static {
    // just call a method to trigger loading the ConfigurationProvider and thus look for any registered Configuration
    ConfigurationProvider.class.hashCode();
  }

```

### IgnoreResultOfCall
Result of `AbstractAssert.describedAs()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/ThrowableAssertAlternative.java`
#### Snippet
```java
  @CheckReturnValue
  public ThrowableAssertAlternative<ACTUAL> describedAs(Description description) {
    getDelegate().describedAs(description);
    return super.describedAs(description);
  }
```

### IgnoreResultOfCall
Result of `RecursiveComparisonAssert.withComparatorForType()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/RecursiveComparisonAssert.java`
#### Snippet
```java
  @SuppressWarnings({ "unchecked", "rawtypes" })
  private void registerComparatorForType(Entry<Class<?>, Comparator<?>> entry) {
    withComparatorForType((Comparator) entry.getValue(), entry.getKey());
  }

```

### IgnoreResultOfCall
Result of `AbstractAssert.usingComparator()` is ignored
in `assertj-core/src/main/java/org/assertj/core/api/RecursiveComparisonAssert.java`
#### Snippet
```java
  private void usingRecursiveComparator() {
    RecursiveComparator recursiveComparator = new RecursiveComparator(recursiveComparisonConfiguration);
    usingComparator(recursiveComparator, recursiveComparator.getDescription());
  }

```

### IgnoreResultOfCall
Result of `Comparator.compare()` is ignored
in `assertj-core/src/main/java/org/assertj/core/internal/Lists.java`
#### Snippet
```java
        // Compare unique element with itself to verify that it is compatible with comparator (a ClassCastException is
        // thrown if not). We have to use a raw comparator to compare the unique element of actual ... :(
        rawComparator.compare(actual.get(0), actual.get(0));
        return;
      }
```

### IgnoreResultOfCall
Result of `Comparator.compare()` is ignored
in `assertj-core/src/main/java/org/assertj/core/internal/Arrays.java`
#### Snippet
```java
      if (arrayAsList.size() == 1) {
        // call compare to see if unique element is compatible with comparator.
        comparator.compare(arrayAsList.get(0), arrayAsList.get(0));
        return;
      }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalLongAssert.java`
#### Snippet
```java
    AbstractAssert<SELF, OptionalLong> {

  protected AbstractOptionalLongAssert(OptionalLong actual, Class<?> selfType) {
    super(actual, selfType);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalIntAssert.java`
#### Snippet
```java
  Integers integers = Integers.instance();

  protected AbstractOptionalIntAssert(OptionalInt actual, Class<?> selfType) {
    super(actual, selfType);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/OptionalAssert.java`
#### Snippet
```java
public class OptionalAssert<VALUE> extends AbstractOptionalAssert<OptionalAssert<VALUE>, VALUE> {

  protected OptionalAssert(Optional<VALUE> actual) {
	super(actual, OptionalAssert.class);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/OptionalIntAssert.java`
#### Snippet
```java
public class OptionalIntAssert extends AbstractOptionalIntAssert<OptionalIntAssert> {

  protected OptionalIntAssert(OptionalInt actual) {
    super(actual, OptionalIntAssert.class);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/Assumptions.java`
#### Snippet
```java
   * @since 3.9.0
   */
  public static OptionalIntAssert assumeThat(OptionalInt actual) {
    return asAssumption(OptionalIntAssert.class, OptionalInt.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/Assumptions.java`
#### Snippet
```java
   * @since 3.9.0
   */
  public static OptionalLongAssert assumeThat(OptionalLong actual) {
    return asAssumption(OptionalLongAssert.class, OptionalLong.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/Assumptions.java`
#### Snippet
```java
   * @since 3.9.0
   */
  public static OptionalDoubleAssert assumeThat(OptionalDouble actual) {
    return asAssumption(OptionalDoubleAssert.class, OptionalDouble.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/Assumptions.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  public static <VALUE> OptionalAssert<VALUE> assumeThat(Optional<VALUE> actual) {
    return asAssumption(OptionalAssert.class, Optional.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
  private ComparisonStrategy optionalValueComparisonStrategy;

  protected AbstractOptionalAssert(Optional<VALUE> actual, Class<?> selfType) {
    super(actual, selfType);
    this.optionalValueComparisonStrategy = StandardComparisonStrategy.instance();
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
  Doubles doubles = Doubles.instance();

  protected AbstractOptionalDoubleAssert(OptionalDouble actual, Class<?> selfType) {
    super(actual, selfType);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/OptionalDoubleAssert.java`
#### Snippet
```java
public class OptionalDoubleAssert extends AbstractOptionalDoubleAssert<OptionalDoubleAssert> {

  protected OptionalDoubleAssert(OptionalDouble actual) {
    super(actual, OptionalDoubleAssert.class);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/StandardSoftAssertionsProvider.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  default OptionalIntAssert assertThat(OptionalInt actual) {
    return proxy(OptionalIntAssert.class, OptionalInt.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/StandardSoftAssertionsProvider.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  default OptionalLongAssert assertThat(OptionalLong actual) {
    return proxy(OptionalLongAssert.class, OptionalLong.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/StandardSoftAssertionsProvider.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  default OptionalDoubleAssert assertThat(OptionalDouble actual) {
    return proxy(OptionalDoubleAssert.class, OptionalDouble.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/StandardSoftAssertionsProvider.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  default <VALUE> OptionalAssert<VALUE> assertThat(Optional<VALUE> actual) {
    return proxy(OptionalAssert.class, Optional.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/BDDSoftAssertionsProvider.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  default <VALUE> OptionalAssert<VALUE> then(Optional<VALUE> actual) {
    return proxy(OptionalAssert.class, Optional.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/BDDSoftAssertionsProvider.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  default OptionalIntAssert then(OptionalInt actual) {
    return proxy(OptionalIntAssert.class, OptionalInt.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/BDDSoftAssertionsProvider.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  default OptionalLongAssert then(OptionalLong actual) {
    return proxy(OptionalLongAssert.class, OptionalLong.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/BDDSoftAssertionsProvider.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  default OptionalDoubleAssert then(OptionalDouble actual) {
    return proxy(OptionalDoubleAssert.class, OptionalDouble.class, actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssumptions.java`
#### Snippet
```java
   * @since 3.14.0
   */
  public static <VALUE> OptionalAssert<VALUE> given(Optional<VALUE> actual) {
    return assumeThat(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssumptions.java`
#### Snippet
```java
   * @since 3.14.0
   */
  public static OptionalDoubleAssert given(OptionalDouble actual) {
    return assumeThat(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssumptions.java`
#### Snippet
```java
   * @since 3.14.0
   */
  public static OptionalLongAssert given(OptionalLong actual) {
    return assumeThat(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssumptions.java`
#### Snippet
```java
   * @since 3.14.0
   */
  public static OptionalIntAssert given(OptionalInt actual) {
    return assumeThat(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'optionalDouble'
in `assertj-core/src/main/java/org/assertj/core/api/WithAssumptions.java`
#### Snippet
```java
   * @since 2.9.0 / 3.9.0
   */
  default OptionalDoubleAssert assumeThat(final OptionalDouble optionalDouble) {
    return Assumptions.assumeThat(optionalDouble);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'optionalInt'
in `assertj-core/src/main/java/org/assertj/core/api/WithAssumptions.java`
#### Snippet
```java
   * @since 2.9.0 / 3.9.0
   */
  default OptionalIntAssert assumeThat(final OptionalInt optionalInt) {
    return Assumptions.assumeThat(optionalInt);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'optionalLong'
in `assertj-core/src/main/java/org/assertj/core/api/WithAssumptions.java`
#### Snippet
```java
   * @since 2.9.0 / 3.9.0
   */
  default OptionalLongAssert assumeThat(final OptionalLong optionalLong) {
    return Assumptions.assumeThat(optionalLong);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/api/WithAssumptions.java`
#### Snippet
```java
   * @since 3.9.0
   */
  default <VALUE> OptionalAssert<VALUE> assumeThat(final Optional<VALUE> optional) {
    return Assumptions.assumeThat(optional);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static OptionalIntAssert assertThat(OptionalInt actual) {
    return AssertionsForClassTypes.assertThat(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static OptionalLongAssert assertThat(OptionalLong actual) {
    return AssertionsForClassTypes.assertThat(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static OptionalDoubleAssert assertThat(OptionalDouble actual) {
    return AssertionsForClassTypes.assertThat(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static <VALUE> OptionalAssert<VALUE> assertThat(Optional<VALUE> actual) {
    return AssertionsForClassTypes.assertThat(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  default <VALUE> OptionalAssert<VALUE> assertThat(final Optional<VALUE> optional) {
    return Assertions.assertThat(optional);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  default OptionalLongAssert assertThat(final OptionalLong optional) {
    return Assertions.assertThat(optional);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  default OptionalDoubleAssert assertThat(final OptionalDouble optional) {
    return Assertions.assertThat(optional);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  default OptionalIntAssert assertThat(final OptionalInt optional) {
    return Assertions.assertThat(optional);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/OptionalLongAssert.java`
#### Snippet
```java
public class OptionalLongAssert extends AbstractOptionalLongAssert<OptionalLongAssert> {

  protected OptionalLongAssert(OptionalLong actual) {
    super(actual, OptionalLongAssert.class);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static OptionalIntAssert assertThat(OptionalInt actual) {
    return new OptionalIntAssert(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static <VALUE> OptionalAssert<VALUE> assertThat(Optional<VALUE> actual) {
    return new OptionalAssert<>(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static OptionalDoubleAssert assertThat(OptionalDouble actual) {
    return new OptionalDoubleAssert(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static OptionalLongAssert assertThat(OptionalLong actual) {
    return new OptionalLongAssert(actual);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'additionalInformation'
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/ComparisonDifference.java`
#### Snippet
```java
  final Object actual;
  final Object expected;
  final Optional<String> additionalInformation;
  final String template;

```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static OptionalIntAssert then(OptionalInt optional) {
    return assertThat(optional);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static <VALUE> OptionalAssert<VALUE> then(Optional<VALUE> optional) {
    return assertThat(optional);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static OptionalDoubleAssert then(OptionalDouble optional) {
    return assertThat(optional);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * @return the created assertion object.
   */
  public static OptionalLongAssert then(OptionalLong optional) {
    return assertThat(optional);
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java
   * @return a error message factory.
   */
  public static OptionalShouldBeEmpty shouldBeEmpty(OptionalInt optional) {
    return new OptionalShouldBeEmpty(optional.getClass(), optional.getAsInt());
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java
   * @return a error message factory.
   */
  public static <VALUE> OptionalShouldBeEmpty shouldBeEmpty(Optional<VALUE> optional) {
    return new OptionalShouldBeEmpty(optional.getClass(), optional.get());
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java
   * @return a error message factory.
   */
  public static OptionalShouldBeEmpty shouldBeEmpty(OptionalLong optional) {
    return new OptionalShouldBeEmpty(optional.getClass(), optional.getAsLong());
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java
   * @return a error message factory.
   */
  public static OptionalShouldBeEmpty shouldBeEmpty(OptionalDouble optional) {
    return new OptionalShouldBeEmpty(optional.getClass(), optional.getAsDouble());
  }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalDoubleShouldHaveValueCloseToPercentage.java`
#### Snippet
```java
  }

  private OptionalDoubleShouldHaveValueCloseToPercentage(OptionalDouble actual, double expected, Percentage percentage,
                                                         double expectedPercentage) {
    super("%nExpecting actual:%n" +
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalDoubleShouldHaveValueCloseToPercentage.java`
#### Snippet
```java
   * @return an error message factory
   */
  public static OptionalDoubleShouldHaveValueCloseToPercentage shouldHaveValueCloseToPercentage(OptionalDouble optional,
                                                                                                double expectedValue,
                                                                                                Percentage percentage,
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   * @return a error message factory
   */
  public static OptionalShouldContain shouldContain(OptionalDouble optional, double expectedValue) {
    return optional.isPresent()
        ? new OptionalShouldContain(EXPECTING_TO_CONTAIN, optional, expectedValue)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   * @return a error message factory
   */
  public static <VALUE> OptionalShouldContain shouldContainSame(Optional<VALUE> optional, VALUE expectedValue) {
    return optional.isPresent()
        ? new OptionalShouldContain(EXPECTING_TO_CONTAIN_SAME, optional, expectedValue)
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   * @return a error message factory
   */
  public static <VALUE> OptionalShouldContain shouldContain(Optional<VALUE> optional, VALUE expectedValue) {
    return optional.isPresent()
        ? new OptionalShouldContain(EXPECTING_TO_CONTAIN, optional, expectedValue)
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   * @return a error message factory
   */
  public static OptionalShouldContain shouldContain(OptionalLong optional, long expectedValue) {
    return optional.isPresent()
        ? new OptionalShouldContain(EXPECTING_TO_CONTAIN, optional, expectedValue)
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldContain.java`
#### Snippet
```java
   * @return a error message factory
   */
  public static OptionalShouldContain shouldContain(OptionalInt optional, int expectedValue) {
    return optional.isPresent()
        ? new OptionalShouldContain(EXPECTING_TO_CONTAIN, optional, expectedValue)
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'actual'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalDoubleShouldHaveValueCloseToOffset.java`
#### Snippet
```java
public class OptionalDoubleShouldHaveValueCloseToOffset extends BasicErrorMessageFactory {

  private OptionalDoubleShouldHaveValueCloseToOffset(OptionalDouble actual, double expected, Offset<Double> offset,
                                                     double difference) {
    super("%nExpecting actual:%n  %s%nto be close to:%n  %s%n" +
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'optional'
in `assertj-core/src/main/java/org/assertj/core/error/OptionalDoubleShouldHaveValueCloseToOffset.java`
#### Snippet
```java
   * @return a error message factory
   */
  public static OptionalDoubleShouldHaveValueCloseToOffset shouldHaveValueCloseToOffset(OptionalDouble optional,
                                                                                        double expectedValue,
                                                                                        Offset<Double> offset,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'currentContext'
in `assertj-core/src/main/java/org/assertj/core/api/junit/jupiter/SoftlyExtension.java`
#### Snippet
```java
  }

  private static Optional<ExtensionContext> getParent(Optional<ExtensionContext> currentContext) {
    return currentContext.flatMap(ExtensionContext::getParent);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'description'
in `assertj-core/src/main/java/org/assertj/core/internal/DeepDifference.java`
#### Snippet
```java
    Object actual;
    Object other;
    Optional<String> description;

    public Difference(List<String> path, Object actual, Object other) {
```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Too many arguments for format string (found: 4, expected: 3)
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/ComparingNormalizedFields.java`
#### Snippet
```java
        return COMPARISON.getSimpleValue(originalFieldName, instance);
      } catch (Exception ex) {
        throw new IntrospectionError(format(NO_FIELD_FOUND, instance, fieldName, originalFieldName, ex));
      }
    }
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `apply()` is identical to its super method
in `assertj-core/src/main/java/org/assertj/core/api/Java6JUnitSoftAssertions.java`
#### Snippet
```java

  @Override
  public Statement apply(final Statement base, Description description) {
    return softAssertionsStatement(this, base);
  }
```

### RedundantMethodOverride
Method `isStandard()` is identical to its super method
in `assertj-core/src/main/java/org/assertj/core/internal/ComparatorBasedComparisonStrategy.java`
#### Snippet
```java

  @Override
  public boolean isStandard() {
    return false;
  }
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Unloaded' used without 'try'-with-resources statement
in `assertj-core/src/main/java/org/assertj/core/api/SoftProxies.java`
#### Snippet
```java
                     .intercept(FieldAccessor.ofField(ProxifyMethodChangingTheObjectUnderTest.FIELD_NAME).setsArgumentAt(0)
                                             .andThen(FieldAccessor.ofField(ErrorCollector.FIELD_NAME).setsArgumentAt(1)))
                     .make()
                     .load(strategy.getClassLoader(), strategy.getClassLoadingStrategy())
                     .getLoaded();
```

### AutoCloseableResource
'Unloaded' used without 'try'-with-resources statement
in `assertj-core/src/main/java/org/assertj/core/api/Assumptions.java`
#### Snippet
```java
                     .method(any().and(not(METHODS_NOT_TO_PROXY)))
                     .intercept(ASSUMPTION)
                     .make()
                     .load(strategy.getClassLoader(), strategy.getClassLoadingStrategy())
                     .getLoaded();
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `assertj-core/src/main/java/org/assertj/core/internal/Paths.java`
#### Snippet
```java
  private Stream<Path> recursiveContentOf(Path directory) {
    try {
      return walk(directory).filter(p -> !p.equals(directory));
    } catch (IOException e) {
      throw new UncheckedIOException(format("Unable to walk recursively the directory :<%s>", directory), e);
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `assertj-core/src/main/java/org/assertj/core/internal/Files.java`
#### Snippet
```java
    Path path = directory.toPath();
    try {
      return java.nio.file.Files.walk(path)
                                .filter(p -> !p.equals(path))
                                .map(Path::toFile);
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Optional chain can be simplified
in `assertj-core/src/main/java/org/assertj/core/configuration/PreferredAssumptionException.java`
#### Snippet
```java
      return Stream.of(TEST_NG, JUNIT4, JUNIT5)
                   .map(PreferredAssumptionException::loadAssumptionExceptionClass)
                   .flatMap(optional -> optional.map(Stream::of).orElse(Stream.empty()))
                   .findFirst()
                   .orElseThrow(() -> new IllegalStateException("Assumptions require TestNG, JUnit 4 or opentest4j on the classpath"));
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator never returns negative values
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/RecursiveComparisonConfiguration.java`
#### Snippet
```java
  private static Comparator toComparator(BiPredicate equals) {
    requireNonNull(equals, "Expecting a non null BiPredicate");
    return (o1, o2) -> equals.test(o1, o2) ? 0 : 1;
  }

```

### ComparatorMethodParameterNotUsed
Comparator never returns positive values
in `assertj-core/src/main/java/org/assertj/core/internal/ExtendedByTypesComparator.java`
#### Snippet
```java
         new Comparator<Object>() {
           @Override
           public int compare(Object actual, Object other) {
             return Objects.deepEquals(actual, other) ? 0 : NOT_EQUAL;
           }
```

### ComparatorMethodParameterNotUsed
Comparator never returns positive values
in `assertj-core/src/main/java/org/assertj/core/internal/ConfigurableRecursiveFieldByFieldComparator.java`
#### Snippet
```java

  @Override
  public int compare(Object actual, Object other) {
    if (actual == null && other == null) return 0;
    if (actual == null || other == null) return NOT_EQUAL;
```

### ComparatorMethodParameterNotUsed
Comparator never returns positive values
in `assertj-core/src/main/java/org/assertj/core/internal/FieldByFieldComparator.java`
#### Snippet
```java

  @Override
  public int compare(Object actual, Object other) {
    if (actual == null && other == null) return 0;
    if (actual == null || other == null) return NOT_EQUAL;
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `assertj-core/src/main/java/org/assertj/core/api/Java6StandardSoftAssertionsProvider.java`
#### Snippet
```java
   * If the provided {@link ThrowingCallable} does not validate against next assertions, an error is immediately raised,
   * in that case the test description provided with {@link AbstractAssert#as(String, Object...) as(String, Object...)} is not honored.<br>
   * To use a test description, use {@link #assertThatCode(ThrowableAssert.ThrowingCallable)} as shown below.
   *
   * <pre><code class='java'> ThrowingCallable doNothing = () -&gt; {
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-core/src/main/java/org/assertj/core/api/Java6Assertions.java`
#### Snippet
```java
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
   * <p>
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-core/src/main/java/org/assertj/core/api/Assertions.java`
#### Snippet
```java
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
   * <p>
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
   * <p>
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-core/src/main/java/org/assertj/core/api/WithAssertions.java`
#### Snippet
```java
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-core/src/main/java/org/assertj/core/api/AssertionsForClassTypes.java`
#### Snippet
```java
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
   * <p>
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(String)}</li>
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-core/src/main/java/org/assertj/core/api/BDDAssertions.java`
#### Snippet
```java
   * <li>{@link org.assertj.core.api.AbstractDateAssert#withDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(java.text.DateFormat)}</li>
   * <li>{@link #registerCustomDateFormat(String)}</li>
   * </ul>
   * <p>
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `matcher` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/api/HamcrestCondition.java`
#### Snippet
```java
public class HamcrestCondition<T> extends Condition<T> {

  private Matcher<? extends T> matcher;

  /**
```

### FieldMayBeFinal
Field `assertFactory` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/api/FactoryBasedNavigableListAssert.java`
#### Snippet
```java
       extends AbstractListAssert<SELF, ACTUAL, ELEMENT, ELEMENT_ASSERT> {
         
  private AssertFactory<ELEMENT, ELEMENT_ASSERT> assertFactory;

  @SuppressWarnings({ "unchecked", "rawtypes" })
```

### FieldMayBeFinal
Field `collector` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/api/SoftProxies.java`
#### Snippet
```java
  private static final TypeCache<TypeCache.SimpleKey> CACHE = new TypeCache.WithInlineExpunction<>(Sort.SOFT);

  private ErrorCollector collector;

  public SoftProxies(AssertionErrorCollector assertionErrorCollector) {
```

### FieldMayBeFinal
Field `source` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/api/MapSizeAssert.java`
#### Snippet
```java
public class MapSizeAssert<KEY, VALUE> extends AbstractMapSizeAssert<MapAssert<KEY, VALUE>, Map<KEY, VALUE>, KEY, VALUE> {

  private AbstractMapAssert<MapAssert<KEY, VALUE>, Map<KEY, VALUE>, KEY, VALUE> source;

  public MapSizeAssert(AbstractMapAssert<MapAssert<KEY, VALUE>, Map<KEY, VALUE>, KEY, VALUE> source, Integer i) {
```

### FieldMayBeFinal
Field `assertFactory` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/api/FactoryBasedNavigableIterableAssert.java`
#### Snippet
```java
       extends AbstractIterableAssert<SELF, ACTUAL, ELEMENT, ELEMENT_ASSERT> {

  private AssertFactory<ELEMENT, ELEMENT_ASSERT> assertFactory;

  @SuppressWarnings({ "unchecked", "rawtypes" })
```

### FieldMayBeFinal
Field `fileAssert` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/api/FileSizeAssert.java`
#### Snippet
```java
public class FileSizeAssert<T> extends AbstractFileSizeAssert<FileAssert> {

  private AbstractFileAssert<FileAssert> fileAssert;

  public FileSizeAssert(AbstractFileAssert<FileAssert> fileAssert) {
```

### FieldMayBeFinal
Field `array` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/api/AtomicIntegerArrayAssert.java`
#### Snippet
```java
  protected IntArrays arrays = IntArrays.instance();

  private int[] array;

  public AtomicIntegerArrayAssert(AtomicIntegerArray actual) {
```

### FieldMayBeFinal
Field `assertClass` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/api/ClassBasedNavigableListAssert.java`
#### Snippet
```java
       extends AbstractListAssert<SELF, ACTUAL, ELEMENT, ELEMENT_ASSERT> {
         
   private Class<ELEMENT_ASSERT> assertClass;

   @SuppressWarnings({ "unchecked", "rawtypes" })
```

### FieldMayBeFinal
Field `array` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/api/AtomicLongArrayAssert.java`
#### Snippet
```java
  protected LongArrays arrays = LongArrays.instance();

  private long[] array;

  public AtomicLongArrayAssert(AtomicLongArray actual) {
```

### FieldMayBeFinal
Field `source` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/api/IterableSizeAssert.java`
#### Snippet
```java


  private AbstractIterableAssert<IterableAssert<T>, Iterable<? extends T>, T, ObjectAssert<T>> source;

  public IterableSizeAssert(AbstractIterableAssert<IterableAssert<T>, Iterable<? extends T>, T, ObjectAssert<T>> source, Integer i) {
```

### FieldMayBeFinal
Field `assertionErrorCreator` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/api/JUnitJupiterSoftAssertions.java`
#### Snippet
```java
    implements StandardSoftAssertionsProvider, AfterEachCallback {

  private AssertionErrorCreator assertionErrorCreator = new AssertionErrorCreator();

  @Override
```

### FieldMayBeFinal
Field `collectedAssertionErrors` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/api/DefaultAssertionErrorCollector.java`
#### Snippet
```java
  // (mutual exclusion, race-free behaviour), but guarantees eventual visibility
  private volatile boolean wasSuccess = true;
  private List<AssertionError> collectedAssertionErrors = synchronizedList(new ArrayList<>());

  private AfterAssertionErrorCollected callback = this;
```

### FieldMayBeFinal
Field `assertionErrorCreator` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/api/JUnitJupiterBDDSoftAssertions.java`
#### Snippet
```java
    implements BDDSoftAssertionsProvider, AfterEachCallback {

  private AssertionErrorCreator assertionErrorCreator = new AssertionErrorCreator();

  @Override
```

### FieldMayBeFinal
Field `bigDecimalAssert` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/api/BigDecimalScaleAssert.java`
#### Snippet
```java
public class BigDecimalScaleAssert<T> extends AbstractBigDecimalScaleAssert<BigDecimalAssert> {

  private AbstractBigDecimalAssert<BigDecimalAssert> bigDecimalAssert;

  public BigDecimalScaleAssert(AbstractBigDecimalAssert<BigDecimalAssert> bigDecimalAssert) {
```

### FieldMayBeFinal
Field `assertClass` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/api/ClassBasedNavigableIterableAssert.java`
#### Snippet
```java
                                               ELEMENT_ASSERT extends AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
       extends AbstractIterableAssert<SELF, ACTUAL, ELEMENT, ELEMENT_ASSERT> {
   private Class<ELEMENT_ASSERT> assertClass;

   
```

### FieldMayBeFinal
Field `stream` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/api/ListAssert.java`
#### Snippet
```java
  @VisibleForTesting
  static class ListFromStream<ELEMENT, STREAM extends BaseStream<ELEMENT, STREAM>> extends AbstractList<ELEMENT> {
    private BaseStream<ELEMENT, STREAM> stream;
    private List<ELEMENT> list;

```

### FieldMayBeFinal
Field `assertionErrorCollector` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/api/ErrorCollector.java`
#### Snippet
```java
  private static final String CLASS_NAME = ErrorCollector.class.getName();

  private AssertionErrorCollector assertionErrorCollector;

  ErrorCollector(AssertionErrorCollector collector) {
```

### FieldMayBeFinal
Field `soft` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/api/SoftAssertionsStatement.java`
#### Snippet
```java
class SoftAssertionsStatement {

  private SoftAssertionsProvider soft;
  private AssertionErrorCreator assertionErrorCreator = new AssertionErrorCreator();

```

### FieldMayBeFinal
Field `assertionErrorCreator` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/api/SoftAssertionsStatement.java`
#### Snippet
```java

  private SoftAssertionsProvider soft;
  private AssertionErrorCreator assertionErrorCreator = new AssertionErrorCreator();

  private SoftAssertionsStatement(SoftAssertionsProvider soft) {
```

### FieldMayBeFinal
Field `dualValues` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/VisitedDualValues.java`
#### Snippet
```java
class VisitedDualValues {

  private List<VisitedDualValue> dualValues;

  VisitedDualValues() {
```

### FieldMayBeFinal
Field `recursiveComparisonConfiguration` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/api/recursive/comparison/DualValueDeque.java`
#### Snippet
```java
@SuppressWarnings("serial")
class DualValueDeque extends LinkedList<DualValue> {
  private RecursiveComparisonConfiguration recursiveComparisonConfiguration;

  public DualValueDeque(RecursiveComparisonConfiguration recursiveComparisonConfiguration) {
```

### FieldMayBeFinal
Field `description` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/util/NaturalOrderComparator.java`
#### Snippet
```java
public class NaturalOrderComparator<T extends Comparable<? super T>> extends NullSafeComparator<T> {

  private String description;

  public NaturalOrderComparator(Class<T> clazz) {
```

### FieldMayBeFinal
Field `precision` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/util/FloatComparator.java`
#### Snippet
```java
public class FloatComparator extends NullSafeComparator<Float> {

  private float precision;

  public FloatComparator(float epsilon) {
```

### FieldMayBeFinal
Field `precision` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/util/DoubleComparator.java`
#### Snippet
```java
public class DoubleComparator extends NullSafeComparator<Double> {

  private double precision;

  public DoubleComparator(double epsilon) {
```

### FieldMayBeFinal
Field `deltas` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/util/diff/Patch.java`
#### Snippet
```java
 */
public class Patch<T> {
  private List<Delta<T>> deltas = new LinkedList<>();

  /**
```

### FieldMayBeFinal
Field `revised` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/util/diff/Delta.java`
#### Snippet
```java

  /** The revised chunk. */
  private Chunk<T> revised;

  /**
```

### FieldMayBeFinal
Field `original` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/util/diff/Delta.java`
#### Snippet
```java

  /** The original chunk. */
  private Chunk<T> original;

  /** The revised chunk. */
```

### FieldMayBeFinal
Field `lines` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/util/diff/Chunk.java`
#### Snippet
```java

  private final int position;
  private List<T> lines;

  /**
```

### FieldMayBeFinal
Field `unifiedDiffChunkRe` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/util/diff/DiffUtils.java`
#### Snippet
```java
public class DiffUtils {

  private static Pattern unifiedDiffChunkRe = Pattern.compile("^@@\\s+-(?:(\\d+)(?:,(\\d+))?)\\s+\\+(?:(\\d+)(?:,(\\d+))?)\\s+@@$");

  /**
```

### FieldMayBeFinal
Field `propertySupport` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/util/introspection/PropertyOrFieldSupport.java`
#### Snippet
```java
public class PropertyOrFieldSupport {
  private static final String SEPARATOR = ".";
  private PropertySupport propertySupport;
  private FieldSupport fieldSupport;

```

### FieldMayBeFinal
Field `fieldSupport` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/util/introspection/PropertyOrFieldSupport.java`
#### Snippet
```java
  private static final String SEPARATOR = ".";
  private PropertySupport propertySupport;
  private FieldSupport fieldSupport;

  public static final PropertyOrFieldSupport EXTRACTION = new PropertyOrFieldSupport();
```

### FieldMayBeFinal
Field `representation` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/error/ShouldBeEqual.java`
#### Snippet
```java
  protected final MessageFormatter messageFormatter = MessageFormatter.instance();
  protected final ComparisonStrategy comparisonStrategy;
  private Representation representation;
  @VisibleForTesting
  ConstructorInvoker constructorInvoker = new ConstructorInvoker();
```

### FieldMayBeFinal
Field `elementTypeName` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/error/GroupTypeDescription.java`
#### Snippet
```java
  private static final int SPLITERATORS_CLASS_STACK_TRACE_NUM = 5;
  private String groupTypeName;
  private String elementTypeName;

  public GroupTypeDescription(String groupTypeName, String elementTypeName) {
```

### FieldMayBeFinal
Field `groupTypeName` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/error/GroupTypeDescription.java`
#### Snippet
```java
public class GroupTypeDescription {
  private static final int SPLITERATORS_CLASS_STACK_TRACE_NUM = 5;
  private String groupTypeName;
  private String elementTypeName;

```

### FieldMayBeFinal
Field `configuration` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/internal/ConfigurableRecursiveFieldByFieldComparator.java`
#### Snippet
```java
public class ConfigurableRecursiveFieldByFieldComparator implements Comparator<Object> {

  private RecursiveComparisonConfiguration configuration;
  private RecursiveComparisonDifferenceCalculator recursiveComparisonDifferenceCalculator;

```

### FieldMayBeFinal
Field `recursiveComparisonDifferenceCalculator` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/internal/ConfigurableRecursiveFieldByFieldComparator.java`
#### Snippet
```java

  private RecursiveComparisonConfiguration configuration;
  private RecursiveComparisonDifferenceCalculator recursiveComparisonDifferenceCalculator;

  // for testing
```

### FieldMayBeFinal
Field `failures` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/internal/CommonValidations.java`
#### Snippet
```java
public final class CommonValidations {

  private static Failures failures = Failures.instance();

  private CommonValidations() {}
```

### FieldMayBeFinal
Field `assertionErrorCreator` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/internal/Failures.java`
#### Snippet
```java
  private static final Failures INSTANCE = new Failures();

  private AssertionErrorCreator assertionErrorCreator = new AssertionErrorCreator();

  /**
```

### FieldMayBeFinal
Field `condition` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/condition/MappedCondition.java`
#### Snippet
```java
public class MappedCondition<FROM, TO> extends Condition<FROM> {

  private Condition<TO> condition;
  private Function<FROM, TO> mapping;
  private String mappingDescription;
```

### FieldMayBeFinal
Field `mapping` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/condition/MappedCondition.java`
#### Snippet
```java

  private Condition<TO> condition;
  private Function<FROM, TO> mapping;
  private String mappingDescription;

```

### FieldMayBeFinal
Field `mappingDescription` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/condition/MappedCondition.java`
#### Snippet
```java
  private Condition<TO> condition;
  private Function<FROM, TO> mapping;
  private String mappingDescription;

  /**
```

### FieldMayBeFinal
Field `comparisonStrategy` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/internal/Classes.java`
#### Snippet
```java

  private Failures failures = Failures.instance();
  private ComparisonStrategy comparisonStrategy = StandardComparisonStrategy.instance();

  /**
```

### FieldMayBeFinal
Field `failures` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/internal/Classes.java`
#### Snippet
```java
  }

  private Failures failures = Failures.instance();
  private ComparisonStrategy comparisonStrategy = StandardComparisonStrategy.instance();

```

### FieldMayBeFinal
Field `description` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/condition/VerboseCondition.java`
#### Snippet
```java

  // needed to avoid an incorrect description when matches is run multiple times.
  private String description;

  /**
```

### FieldMayBeFinal
Field `objectUnderTestDescriptor` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/condition/VerboseCondition.java`
#### Snippet
```java
public final class VerboseCondition<T> extends Condition<T> {

  private Function<T, String> objectUnderTestDescriptor;

  // needed to avoid an incorrect description when matches is run multiple times.
```

### FieldMayBeFinal
Field `descriptionSupplier` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/description/LazyTextDescription.java`
#### Snippet
```java
public class LazyTextDescription extends Description {

  private Supplier<String> descriptionSupplier;

  public LazyTextDescription(Supplier<String> descriptionSupplier) {
```

### FieldMayBeFinal
Field `binaryGroupPattern` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/presentation/NumberGrouping.java`
#### Snippet
```java
  private static final String UNDERSCORE_SEPARATOR = "_";
  private static Pattern hexGroupPattern = Pattern.compile("([0-9|A-Z]{4})");
  private static Pattern binaryGroupPattern = Pattern.compile("([0-1]{8})");

  static String toHexLiteral(String value) {
```

### FieldMayBeFinal
Field `hexGroupPattern` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/presentation/NumberGrouping.java`
#### Snippet
```java

  private static final String UNDERSCORE_SEPARATOR = "_";
  private static Pattern hexGroupPattern = Pattern.compile("([0-9|A-Z]{4})");
  private static Pattern binaryGroupPattern = Pattern.compile("([0-1]{8})");

```

### FieldMayBeFinal
Field `compositeRepresentation` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/configuration/ConfigurationProvider.java`
#### Snippet
```java
  public static final ConfigurationProvider CONFIGURATION_PROVIDER = new ConfigurationProvider();
  private final Configuration configuration;
  private CompositeRepresentation compositeRepresentation;

  private ConfigurationProvider() {
```

### FieldMayBeFinal
Field `description` may be 'final'
in `assertj-core/src/main/java/org/assertj/core/presentation/StandardRepresentation.java`
#### Snippet
```java
    ITERABLE("iterable"), ARRAY("array");

    private String description;

    GroupType(String value) {
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00f3` can be replaced with 'ó'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharArrayAssert.java`
#### Snippet
```java
   *
   * org.junit.ComparisonFailure:
   * Expected :[a, b, \u00f3]
   * Actual   :[a, 6, c]</code></pre>
   *
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03bc` can be replaced with 'μ'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharacterAssert.java`
#### Snippet
```java
   *
   * org.junit.ComparisonFailure:
   * Expected :\u03bc
   * Actual   :\u00b5</code></pre>
   *
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00b5` can be replaced with 'µ'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharacterAssert.java`
#### Snippet
```java
   * org.junit.ComparisonFailure:
   * Expected :\u03bc
   * Actual   :\u00b5</code></pre>
   *
   * @return {@code this} assertion object.
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0107` can be replaced with 'ć'
in `assertj-core/src/main/java/org/assertj/core/api/Char2DArrayAssert.java`
#### Snippet
```java
   *  &lt;c&gt;
   * but was
   *  &lt;\u0107&gt;</code></pre>
   *
   * @return {@code this} assertion object.
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00b5` can be replaced with 'µ'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharSequenceAssert.java`
#### Snippet
```java
   * java.lang.AssertionError:
   * Expecting:
   *   &lt;\u00b5\u00b5\u00b5&gt;
   * to contain:
   *   &lt;\u03bc\u03bc\u03bc&gt;</code></pre>
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00b5` can be replaced with 'µ'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharSequenceAssert.java`
#### Snippet
```java
   * java.lang.AssertionError:
   * Expecting:
   *   &lt;\u00b5\u00b5\u00b5&gt;
   * to contain:
   *   &lt;\u03bc\u03bc\u03bc&gt;</code></pre>
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00b5` can be replaced with 'µ'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharSequenceAssert.java`
#### Snippet
```java
   * java.lang.AssertionError:
   * Expecting:
   *   &lt;\u00b5\u00b5\u00b5&gt;
   * to contain:
   *   &lt;\u03bc\u03bc\u03bc&gt;</code></pre>
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03bc` can be replaced with 'μ'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharSequenceAssert.java`
#### Snippet
```java
   *   &lt;\u00b5\u00b5\u00b5&gt;
   * to contain:
   *   &lt;\u03bc\u03bc\u03bc&gt;</code></pre>
   *
   * @return {@code this} assertion object.
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03bc` can be replaced with 'μ'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharSequenceAssert.java`
#### Snippet
```java
   *   &lt;\u00b5\u00b5\u00b5&gt;
   * to contain:
   *   &lt;\u03bc\u03bc\u03bc&gt;</code></pre>
   *
   * @return {@code this} assertion object.
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03bc` can be replaced with 'μ'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharSequenceAssert.java`
#### Snippet
```java
   *   &lt;\u00b5\u00b5\u00b5&gt;
   * to contain:
   *   &lt;\u03bc\u03bc\u03bc&gt;</code></pre>
   *
   * @return {@code this} assertion object.
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2303` can be replaced with '⌃'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharSequenceAssert.java`
#### Snippet
```java
   * assertThat(&quot;&quot;).isASCII();
   * assertThat(&quot;♪&quot;).isASCII();
   * assertThat(&quot;\u2303&quot;).isASCII();
   * assertThat(&quot;L3go123\u230300abc&quot;).isASCII();</code></pre>
   *
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2303` can be replaced with '⌃'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractCharSequenceAssert.java`
#### Snippet
```java
   * assertThat(&quot;♪&quot;).isASCII();
   * assertThat(&quot;\u2303&quot;).isASCII();
   * assertThat(&quot;L3go123\u230300abc&quot;).isASCII();</code></pre>
   *
   * @return {@code this} assertion object.
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `rawComparator` is redundant
in `assertj-core/src/main/java/org/assertj/core/internal/Lists.java`
#### Snippet
```java
      // We can't verify that point because of erasure type at runtime.
      if (actual.size() == 0) return;
      Comparator rawComparator = comparator;
      if (actual.size() == 1) {
        // Compare unique element with itself to verify that it is compatible with comparator (a ClassCastException is
```

### UnnecessaryLocalVariable
Local variable `message` is redundant
in `assertj-core/src/main/java/org/assertj/core/internal/Failures.java`
#### Snippet
```java
  protected String assertionErrorMessage(AssertionInfo info, ErrorMessageFactory messageFactory) {
    String overridingErrorMessage = info.overridingErrorMessage();
    String message = isNullOrEmpty(overridingErrorMessage)
        ? messageFactory.create(info.description(), info.representation())
        : MessageFormatter.instance().format(info.description(), info.representation(), overridingErrorMessage);
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `assertj-core/src/main/java/org/assertj/core/configuration/Services.java`
#### Snippet
```java
    if (services.hasNext()) {
      result = defaultValue;
      System.err.println(format("Found multiple implementations for the service provider %s. Using the default: %s",
                                serviceType, result.getClass()));
    }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `assertj-core/src/main/java/org/assertj/core/configuration/ConfigurationProvider.java`
#### Snippet
```java
      // registered representations are only used if the configuration representation
      if (representations.size() == 1) {
        System.out.println(format("AssertJ has found one registered representation: %s, AssertJ will use it first and then fall back to standard representation if it returned a null representation of the value to display.",
                                  representations.get(0)));
      } else if (representations.size() > 1) {
```

### RedundantStringFormatCall
Redundant call to `format()`
in `assertj-core/src/main/java/org/assertj/core/configuration/ConfigurationProvider.java`
#### Snippet
```java
                                  representations.get(0)));
      } else if (representations.size() > 1) {
        System.out.println(format("AssertJ has found %s registered representations, AssertJ will use them first and then fall back to standard representation if they returned a null representation of the value to display, the order (by highest priority first) of use will be: %s",
                                  representations.size(), compositeRepresentation.getAllRepresentationsOrderedByPriority()));
      }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `assertj-core/src/main/java/org/assertj/core/configuration/ConfigurationProvider.java`
#### Snippet
```java
      }
    } else if (!representations.isEmpty()) {
      System.out.println(format("AssertJ has found these representations %s in the classpath but they won't be used as the loaded configuration has specified a custom representation which takes precedence over representations loaded with the java ServiceLoader: %s",
                                representations, representation()));
    }
```

## RuleId[id=ArrayHashCode]
### ArrayHashCode
Array passed to 'Objects.hash()' should be wrapped in 'Arrays.hashcode()'
in `assertj-core/src/main/java/org/assertj/core/description/TextDescription.java`
#### Snippet
```java
  @Override
  public int hashCode() {
    return Objects.hash(value, args);
  }

```

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:(\\d+)(?:,(\\d+))?)`
in `assertj-core/src/main/java/org/assertj/core/util/diff/DiffUtils.java`
#### Snippet
```java
public class DiffUtils {

  private static Pattern unifiedDiffChunkRe = Pattern.compile("^@@\\s+-(?:(\\d+)(?:,(\\d+))?)\\s+\\+(?:(\\d+)(?:,(\\d+))?)\\s+@@$");

  /**
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:(\\d+)(?:,(\\d+))?)`
in `assertj-core/src/main/java/org/assertj/core/util/diff/DiffUtils.java`
#### Snippet
```java
public class DiffUtils {

  private static Pattern unifiedDiffChunkRe = Pattern.compile("^@@\\s+-(?:(\\d+)(?:,(\\d+))?)\\s+\\+(?:(\\d+)(?:,(\\d+))?)\\s+@@$");

  /**
```

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'isArray()' call
in `assertj-core/src/main/java/org/assertj/core/util/Arrays.java`
#### Snippet
```java

  public static boolean isArrayTypePrimitive(Object o) {
    return o != null && isArray(o) && o.getClass().getComponentType().isPrimitive();
  }

```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`actual == false` can be simplified to '!actual'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractBooleanAssert.java`
#### Snippet
```java
  public SELF isFalse() {
    objects.assertNotNull(info, actual);
    if (actual == false) return myself;
    throw Failures.instance().failure(info, shouldBeFalse(actual), actual, false);
  }
```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
  // The public method for it (the one not ending with "ForProxy") is marked as final and annotated with @SafeVarargs
  // in order to avoid compiler warning in user code
  protected AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> flatExtractingForProxy(Function<? super ELEMENT, ?>[] extractors) {
    if (actual == null) throwAssertionError(shouldNotBeNull());
    Stream<? extends ELEMENT> actualStream = stream(actual.spliterator(), false);
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> extracting(String propertyOrField) {
    List<Object> values = FieldsOrPropertiesExtractor.extract(actual, byName(propertyOrField));
    String extractedDescription = extractedDescriptionOf(propertyOrField);
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> flatExtracting(String... fieldOrPropertyNames) {
    List<Object> extractedValues = FieldsOrPropertiesExtractor.extract(actual, byName(fieldOrPropertyNames)).stream()
                                                              .flatMap(tuple -> tuple.toList().stream())
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
  @CheckReturnValue
  @SafeVarargs
  public final <EXCEPTION extends Exception> AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> flatMap(ThrowingExtractor<? super ELEMENT, ?, EXCEPTION>... mappers) {
    return flatExtractingForProxy(mappers);
  }
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> flatExtracting(String fieldOrPropertyName) {
    List<Object> extractedValues = newArrayList();
    List<?> extractedGroups = FieldsOrPropertiesExtractor.extract(actual, byName(fieldOrPropertyName));
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
  @CheckReturnValue
  @SafeVarargs
  public final <EXCEPTION extends Exception> AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> flatExtracting(ThrowingExtractor<? super ELEMENT, ?, EXCEPTION>... extractors) {
    return flatExtractingForProxy(extractors);
  }
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> extractingResultOf(String method) {
    // can't refactor by calling extractingResultOf(method, Object.class) as SoftAssertion would fail
    List<Object> values = FieldsOrPropertiesExtractor.extract(actual, resultOf(method));
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
  @CheckReturnValue
  @SafeVarargs
  public final AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> flatMap(Function<? super ELEMENT, ?>... mappers) {
    return flatExtractingForProxy(mappers);
  }
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractIterableAssert.java`
#### Snippet
```java
  @CheckReturnValue
  @SafeVarargs
  public final AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> flatExtracting(Function<? super ELEMENT, ?>... extractors) {
    return flatExtractingForProxy(extractors);
  }
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> extractingResultOf(String method) {
    Object[] values = FieldsOrPropertiesExtractor.extract(actual, resultOf(method));
    String extractedDescription = extractedDescriptionOfMethod(method);
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> flatExtracting(String propertyName) {
    List<Object> extractedValues = newArrayList();
    List<?> extractedGroups = FieldsOrPropertiesExtractor.extract(Arrays.asList(actual), byName(propertyName));
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractObjectArrayAssert.java`
#### Snippet
```java
   */
  @CheckReturnValue
  public AbstractListAssert<?, List<? extends Object>, Object, ObjectAssert<Object>> extracting(String fieldOrProperty) {
    Object[] values = FieldsOrPropertiesExtractor.extract(actual, byName(fieldOrProperty));
    String extractedDescription = extractedDescriptionOf(fieldOrProperty);
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `assertj-core/src/main/java/org/assertj/core/configuration/Configuration.java`
#### Snippet
```java
   */
  public void addAdditionalDateFormats(DateFormat... additionalDateFormats) {
    Stream.of(additionalDateFormats).forEach(this.additionalDateFormats::add);
  }

```

## RuleId[id=ConstantValue]
### ConstantValue
Value `actual` is always 'true'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractBooleanAssert.java`
#### Snippet
```java
    objects.assertNotNull(info, actual);
    if (actual == false) return myself;
    throw Failures.instance().failure(info, shouldBeFalse(actual), actual, false);
  }

```

### ConstantValue
Value `actual` is always 'true'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractBooleanAssert.java`
#### Snippet
```java
    objects.assertNotNull(info, actual);
    if (actual == false) return myself;
    throw Failures.instance().failure(info, shouldBeFalse(actual), actual, false);
  }

```

### ConstantValue
Value `actual` is always 'false'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractBooleanAssert.java`
#### Snippet
```java
    objects.assertNotNull(info, actual);
    if (actual) return myself;
    throw Failures.instance().failure(info, shouldBeTrue(actual), actual, true);
  }

```

### ConstantValue
Value `actual` is always 'false'
in `assertj-core/src/main/java/org/assertj/core/api/AbstractBooleanAssert.java`
#### Snippet
```java
    objects.assertNotNull(info, actual);
    if (actual) return myself;
    throw Failures.instance().failure(info, shouldBeTrue(actual), actual, true);
  }

```

### ConstantValue
Value `recurse` is always 'true'
in `assertj-core/src/main/java/org/assertj/core/util/Files.java`
#### Snippet
```java
      if (existingFile.isDirectory()) {
        if (recurse) {
          scriptNames.addAll(fileNamesIn(existingFile, recurse));
        }
        continue;
```

### ConstantValue
Value `rootCause` is always 'null'
in `assertj-core/src/main/java/org/assertj/core/internal/Throwables.java`
#### Snippet
```java
    assertNotNull(info, actual);
    Throwable rootCause = getRootCause(actual);
    if (null == rootCause) throw failures.failure(info, shouldHaveRootCauseWithMessage(actual, rootCause, expectedMessage));
    if (java.util.Objects.equals(rootCause.getMessage(), expectedMessage)) return;
    throw failures.failure(info, shouldHaveRootCauseWithMessage(actual, rootCause, expectedMessage), rootCause.getMessage(),
```

### ConstantValue
Condition `stackTrace != null` is always `true`
in `assertj-core/src/main/java/org/assertj/core/internal/Throwables.java`
#### Snippet
```java
    assertNotNull(info, actual);
    String stackTrace = org.assertj.core.util.Throwables.getStackTrace(actual);
    if (stackTrace != null && stackTrace.contains(description)) return;
    throw failures.failure(info, shouldContain(stackTrace, description));
  }
```

### ConstantValue
Value `from` is always 'null'
in `assertj-core/src/main/java/org/assertj/core/condition/MappedCondition.java`
#### Snippet
```java
    if (!mappingDescription.isEmpty()) sb.append(format("%n   using: %s", mappingDescription));

    if (from == null) sb.append(format("%n   from: %s%n", from));
    else sb.append(format("%n   from: <%s> %s%n", className(from), from));

```

### ConstantValue
Value `to` is always 'null'
in `assertj-core/src/main/java/org/assertj/core/condition/MappedCondition.java`
#### Snippet
```java
    else sb.append(format("%n   from: <%s> %s%n", className(from), from));

    if (to == null) sb.append(format("   to:   %s%n", to));
    else sb.append(format("   to:   <%s> %s%n", className(to), to));

```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalLongAssert.java`
#### Snippet
```java
    isNotNull();
    if (!actual.isPresent()) throwAssertionError(shouldContain(expectedValue));
    if (expectedValue != actual.getAsLong())
      throw Failures.instance().failure(info, shouldContain(actual, expectedValue), actual.getAsLong(), expectedValue);
    return myself;
```

### OptionalGetWithoutIsPresent
`OptionalInt.getAsInt()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalIntAssert.java`
#### Snippet
```java
    isNotNull();
    if (!actual.isPresent()) throwAssertionError(shouldContain(expectedValue));
    if (expectedValue != actual.getAsInt())
      throw Failures.instance().failure(info, shouldContain(actual, expectedValue), actual.getAsInt(), expectedValue);
    return myself;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
  private AbstractObjectAssert<?, VALUE> internalGet() {
    isPresent();
    return assertThat(actual.get()).withAssertionState(myself);
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
  public SELF hasValueSatisfying(Condition<? super VALUE> condition) {
    assertValueIsPresent();
    conditions.assertIs(info, actual.get(), condition);
    return myself;
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
  public SELF hasValueSatisfying(Consumer<VALUE> requirement) {
    assertValueIsPresent();
    requirement.accept(actual.get());
    return myself;
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
    checkNotNull(expectedValue);
    if (!actual.isPresent()) throwAssertionError(shouldContain(expectedValue));
    if (!optionalValueComparisonStrategy.areEqual(actual.get(), expectedValue))
      throw Failures.instance().failure(info, shouldContain(actual, expectedValue), actual.get(), expectedValue);
    return myself;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
  public SELF containsInstanceOf(Class<?> clazz) {
    assertValueIsPresent();
    if (!clazz.isInstance(actual.get())) throwAssertionError(shouldContainInstanceOf(actual, clazz));
    return myself;
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalAssert.java`
#### Snippet
```java
    checkNotNull(expectedValue);
    if (!actual.isPresent()) throwAssertionError(shouldContain(expectedValue));
    if (actual.get() != expectedValue) throwAssertionError(shouldContainSame(actual, expectedValue));
    return myself;
  }
```

### OptionalGetWithoutIsPresent
`OptionalDouble.getAsDouble()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
    // Reuses doubles functionality, catches potential assertion error and throw correct one
    try {
      doubles.assertIsCloseTo(info, actual.getAsDouble(), expectedValue, offset);
    } catch (AssertionError assertionError) {
      throwAssertionError(shouldHaveValueCloseToOffset(actual, expectedValue, offset, abs(expectedValue - actual.getAsDouble())));
```

### OptionalGetWithoutIsPresent
`OptionalDouble.getAsDouble()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
    if (!actual.isPresent()) throwAssertionError(shouldHaveValueCloseToPercentage(expectedValue));
    try {
      doubles.assertIsCloseToPercentage(info, actual.getAsDouble(), expectedValue, percentage);
    } catch (AssertionError assertionError) {
      throwAssertionError(shouldHaveValueCloseToPercentage(actual, expectedValue, percentage, abs(expectedValue - actual.getAsDouble())));
```

### OptionalGetWithoutIsPresent
`OptionalDouble.getAsDouble()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/api/AbstractOptionalDoubleAssert.java`
#### Snippet
```java
    isNotNull();
    if (!actual.isPresent()) throwAssertionError(shouldContain(expectedValue));
    if (expectedValue != actual.getAsDouble())
      throw Failures.instance().failure(info, shouldContain(actual, expectedValue), actual.getAsDouble(), expectedValue);
    return myself;
```

### OptionalGetWithoutIsPresent
`OptionalInt.getAsInt()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java
   */
  public static OptionalShouldBeEmpty shouldBeEmpty(OptionalInt optional) {
    return new OptionalShouldBeEmpty(optional.getClass(), optional.getAsInt());
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java
   */
  public static <VALUE> OptionalShouldBeEmpty shouldBeEmpty(Optional<VALUE> optional) {
    return new OptionalShouldBeEmpty(optional.getClass(), optional.get());
  }

```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java
   */
  public static OptionalShouldBeEmpty shouldBeEmpty(OptionalLong optional) {
    return new OptionalShouldBeEmpty(optional.getClass(), optional.getAsLong());
  }
}
```

### OptionalGetWithoutIsPresent
`OptionalDouble.getAsDouble()` without 'isPresent()' check
in `assertj-core/src/main/java/org/assertj/core/error/OptionalShouldBeEmpty.java`
#### Snippet
```java
   */
  public static OptionalShouldBeEmpty shouldBeEmpty(OptionalDouble optional) {
    return new OptionalShouldBeEmpty(optional.getClass(), optional.getAsDouble());
  }

```

## RuleId[id=SuspiciousIndentAfterControlStatement]
### SuspiciousIndentAfterControlStatement
Suspicious indentation after 'if' statement
in `assertj-core/src/main/java/org/assertj/core/internal/ObjectArrayElementComparisonStrategy.java`
#### Snippet
```java
	if (actual == null || other == null) return false;
    // expecting actual and other to be T[]
    return isArray(actual) && isArray(other) && compareElementsOf((T[]) actual, (T[]) other);
  }

```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `assertj-core/src/main/java/org/assertj/core/error/ShouldNotSatisfyPredicateRecursively.java`
#### Snippet
```java
    StringBuilder builder = new StringBuilder(NEW_LINE);
    builder.append("The following fields did not satisfy the predicate:").append(NEW_LINE);
    builder.append(INDENT + fieldsDescription.toString() + NEW_LINE);
    builder.append("The recursive assertion was performed with this configuration:").append(NEW_LINE);
    builder.append(recursiveAssertionConfiguration);
```

