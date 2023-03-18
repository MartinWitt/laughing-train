# assertj-db 
 
# Bad smells
I found 314 bad smells with 6 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryFullyQualifiedName | 205 | false |
| TrivialStringConcatenation | 31 | false |
| ZeroLengthArrayInitialization | 24 | false |
| ReturnNull | 12 | false |
| BoundedWildcard | 10 | false |
| DynamicRegexReplaceableByCompiledPattern | 8 | false |
| NonProtectedConstructorInAbstractClass | 5 | true |
| NullArgumentToVariableArgMethod | 5 | false |
| RedundantFieldInitialization | 3 | false |
| IOResource | 2 | false |
| AssignmentToMethodParameter | 2 | false |
| SystemOutErr | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| UnnecessarySuperQualifier | 1 | false |
| UNUSED_IMPORT | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| NonShortCircuitBoolean | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=IOResource]
### IOResource
'PrintStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/assertj/db/output/AbstractOutputter.java`
#### Snippet
```java
    String output = getOutput(outputType);
    try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
      PrintStream printStream = new PrintStream(fileOutputStream);
      printStream.print(output);
    } catch (IOException e) {
```

### IOResource
'PrintStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/assertj/db/output/AbstractOutputter.java`
#### Snippet
```java
  public E toStream(OutputStream outputStream) {
    String output = getOutput(outputType);
    PrintStream printStream = new PrintStream(outputStream);
    printStream.print(output);
    return myself;
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/assertj/db/output/AbstractOutputter.java`
#### Snippet
```java
  @SuppressWarnings("squid:S106")
  public E toConsole() {
    return toStream(System.out);
  }

```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Proxies` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/assertj/db/util/Proxies.java`
#### Snippet
```java
 * @author Julien Roy
 */
public class Proxies {

  public static final String BYTE_BUDDY_PATTERN = "$ByteBuddy$";
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/assertj/db/type/Request.java`
#### Snippet
```java
  public Request setPksName(String... pksName) {
    List<String> pksNameList = new ArrayList<>(Arrays.asList(pksName));
    super.setPksNameList(pksNameList);
    return this;
  }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/assertj/db/type/DateTimeValue.java`
#### Snippet
```java
    }

    if (dateTime.matches(DATE_FORMAT)) {
      date = DateValue.parse(dateTime);
      time = new TimeValue(0, 0);
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/assertj/db/type/DateTimeValue.java`
#### Snippet
```java
      date = DateValue.parse(dateTime);
      time = new TimeValue(0, 0);
    } else if (dateTime.matches(TIME_FORMAT) || dateTime.matches(TIME_FORMAT_WITH_SECONDS)
        || dateTime.matches(TIME_FORMAT_WITH_NANO)) {

```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/assertj/db/type/DateTimeValue.java`
#### Snippet
```java
      date = DateValue.parse(dateTime);
      time = new TimeValue(0, 0);
    } else if (dateTime.matches(TIME_FORMAT) || dateTime.matches(TIME_FORMAT_WITH_SECONDS)
        || dateTime.matches(TIME_FORMAT_WITH_NANO)) {

```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/assertj/db/type/DateTimeValue.java`
#### Snippet
```java
      time = new TimeValue(0, 0);
    } else if (dateTime.matches(TIME_FORMAT) || dateTime.matches(TIME_FORMAT_WITH_SECONDS)
        || dateTime.matches(TIME_FORMAT_WITH_NANO)) {

      date = DateValue.parse(dateTime.substring(0, 10));
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/assertj/db/type/DateValue.java`
#### Snippet
```java
    }

    if (date.matches(DATE_FORMAT)) {
      year = Integer.parseInt(date.substring(0, 4));
      month = Integer.parseInt(date.substring(5, 7));
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/assertj/db/type/TimeValue.java`
#### Snippet
```java
    }

    if (time.matches(TIME_FORMAT)) {
      hours = Integer.parseInt(time.substring(0, 2));
      minutes = Integer.parseInt(time.substring(3));
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/assertj/db/type/TimeValue.java`
#### Snippet
```java
      seconds = 0;
      nanoSeconds = 0;
    } else if (time.matches(TIME_FORMAT_WITH_SECONDS)) {
      hours = Integer.parseInt(time.substring(0, 2));
      minutes = Integer.parseInt(time.substring(3, 5));
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/assertj/db/type/TimeValue.java`
#### Snippet
```java
      seconds = Integer.parseInt(time.substring(6));
      nanoSeconds = 0;
    } else if (time.matches(TIME_FORMAT_WITH_NANO)) {
      hours = Integer.parseInt(time.substring(0, 2));
      minutes = Integer.parseInt(time.substring(3, 5));
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.error` is unnecessary and can be removed
in `src/main/java/org/assertj/db/error/ShouldBeValueClassWithStartPoint.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.db.error.ShouldBeValueClassWithStartPoint}</code>.
   *
   * @param actual The actual value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.error` is unnecessary and can be removed
in `src/main/java/org/assertj/db/error/ShouldBeValueTypeWithEndPoint.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.db.error.ShouldBeValueTypeWithEndPoint}</code>.
   *
   * @param actual The actual value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.error` is unnecessary and can be removed
in `src/main/java/org/assertj/db/error/ShouldBeValueTypeWithStartPoint.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.db.error.ShouldBeValueTypeWithStartPoint}</code>.
   *
   * @param actual The actual value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.error` is unnecessary and can be removed
in `src/main/java/org/assertj/db/error/ShouldNotExist.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.db.error.ShouldNotExist}</code>.
   *
   * @return the created {@code ErrorMessageFactory}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/origin/OriginWithColumnsAndRows.java`
#### Snippet
```java
 * @author Régis Pouiller
 *
 * @param <C> The class of a element of navigation on column (an sub-class of {@link org.assertj.db.navigation.element.ColumnElement}).
 * @param <R> The class of a element of navigation on a row (an sub-class of {@link org.assertj.db.navigation.element.RowElement}).
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/origin/OriginWithColumnsAndRows.java`
#### Snippet
```java
 *
 * @param <C> The class of a element of navigation on column (an sub-class of {@link org.assertj.db.navigation.element.ColumnElement}).
 * @param <R> The class of a element of navigation on a row (an sub-class of {@link org.assertj.db.navigation.element.RowElement}).
 */
public interface OriginWithColumnsAndRows<C extends ColumnElement, R extends RowElement>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/origin/OriginWithValuesFromColumn.java`
#### Snippet
```java
 * @author Régis Pouiller
 *
 * @param <CHS> The class of a element of navigation on changes (an sub-class of {@link org.assertj.db.navigation.element.ChangesElement}).
 * @param <CH> The class of a element of navigation on a change (an sub-class of {@link org.assertj.db.navigation.element.ChangeElement}).
 * @param <C> The class of a element of navigation on column (an sub-class of {@link org.assertj.db.navigation.element.ColumnElement}).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/origin/OriginWithValuesFromColumn.java`
#### Snippet
```java
 *
 * @param <CHS> The class of a element of navigation on changes (an sub-class of {@link org.assertj.db.navigation.element.ChangesElement}).
 * @param <CH> The class of a element of navigation on a change (an sub-class of {@link org.assertj.db.navigation.element.ChangeElement}).
 * @param <C> The class of a element of navigation on column (an sub-class of {@link org.assertj.db.navigation.element.ColumnElement}).
 * @param <R> The class of a element of navigation on a row (an sub-class of {@link org.assertj.db.navigation.element.RowElement}).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/origin/OriginWithValuesFromColumn.java`
#### Snippet
```java
 * @param <CHS> The class of a element of navigation on changes (an sub-class of {@link org.assertj.db.navigation.element.ChangesElement}).
 * @param <CH> The class of a element of navigation on a change (an sub-class of {@link org.assertj.db.navigation.element.ChangeElement}).
 * @param <C> The class of a element of navigation on column (an sub-class of {@link org.assertj.db.navigation.element.ColumnElement}).
 * @param <R> The class of a element of navigation on a row (an sub-class of {@link org.assertj.db.navigation.element.RowElement}).
 * @param <V> The class of a element of navigation on a value (an sub-class of {@link org.assertj.db.navigation.element.ValueElement}).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/origin/OriginWithValuesFromColumn.java`
#### Snippet
```java
 * @param <CH> The class of a element of navigation on a change (an sub-class of {@link org.assertj.db.navigation.element.ChangeElement}).
 * @param <C> The class of a element of navigation on column (an sub-class of {@link org.assertj.db.navigation.element.ColumnElement}).
 * @param <R> The class of a element of navigation on a row (an sub-class of {@link org.assertj.db.navigation.element.RowElement}).
 * @param <V> The class of a element of navigation on a value (an sub-class of {@link org.assertj.db.navigation.element.ValueElement}).
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/origin/OriginWithValuesFromColumn.java`
#### Snippet
```java
 * @param <C> The class of a element of navigation on column (an sub-class of {@link org.assertj.db.navigation.element.ColumnElement}).
 * @param <R> The class of a element of navigation on a row (an sub-class of {@link org.assertj.db.navigation.element.RowElement}).
 * @param <V> The class of a element of navigation on a value (an sub-class of {@link org.assertj.db.navigation.element.ValueElement}).
 */
public interface OriginWithValuesFromColumn<CHS extends ChangesElement, CH extends ChangeElement, C extends ColumnElement, R extends RowElement, V extends ValueElement>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/lettercase/CaseConversions.java`
#### Snippet
```java
  },
  /**
   * Upper conversion of the case of a {@link java.lang.String}.
   */
  UPPER {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/lettercase/CaseConversions.java`
#### Snippet
```java

/**
 * Conversions of the case of a {@link java.lang.String}.
 * @author Régis Pouiller
 * @since 1.1.0
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/lettercase/CaseConversions.java`
#### Snippet
```java
  },
  /**
   * No conversion of the case of a {@link java.lang.String}.
   */
  NO {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/lettercase/CaseConversions.java`
#### Snippet
```java

  /**
   * Lower conversion of the case of a {@link java.lang.String}.
   */
  LOWER {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnColumnContent.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the column are not containing the date/time values in parameter.
   * @see org.assertj.db.api.AbstractColumnAssert#containsValues(org.assertj.db.type.DateTimeValue...)
   */
  T containsValues(DateTimeValue... expected);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnColumnContent.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the column are not containing the time values in parameter.
   * @see org.assertj.db.api.AbstractColumnAssert#containsValues(org.assertj.db.type.TimeValue...)
   */
  T containsValues(TimeValue... expected);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnColumnContent.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the column are not containing the UUIDs in parameter.
   * @see org.assertj.db.api.AbstractColumnAssert#containsValues(java.util.UUID...)
   */
  T containsValues(UUID... expected);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/ChangeColumnAssert.java`
#### Snippet
```java

  /**
   * Returns to level of assertion methods on a {@link org.assertj.db.type.Change}.
   *
   * @return a object of assertion methods on a {@link org.assertj.db.type.Change}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnColumnContent.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the column are not containing the date values in parameter.
   * @see org.assertj.db.api.AbstractColumnAssert#containsValues(org.assertj.db.type.DateValue...)
   */
  T containsValues(DateValue... expected);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/ChangeColumnAssert.java`
#### Snippet
```java
   * Returns to level of assertion methods on a {@link org.assertj.db.type.Change}.
   *
   * @return a object of assertion methods on a {@link org.assertj.db.type.Change}.
   */
  public ChangeAssert returnToChange() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/lettercase/LetterCase.java`
#### Snippet
```java

  /**
   * The conversion of the case of a {@link java.lang.String}.
   */
  private final CaseConversion conversion;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/lettercase/LetterCase.java`
#### Snippet
```java
  /**
   * Constructor.
   * @param conversion The conversion of the case of a {@link java.lang.String}.
   * @param comparison The comparison on {@link java.lang.String} which consider the case.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/lettercase/LetterCase.java`
#### Snippet
```java
   * Constructor.
   * @param conversion The conversion of the case of a {@link java.lang.String}.
   * @param comparison The comparison on {@link java.lang.String} which consider the case.
   */
  private LetterCase(CaseConversion conversion, CaseComparison comparison) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/lettercase/LetterCase.java`
#### Snippet
```java

  /**
   * The comparison on {@link java.lang.String} which consider the case.
   */
  private final CaseComparison comparison;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/lettercase/LetterCase.java`
#### Snippet
```java
  /**
   * Returns a instance of a letter case.
   * @param conversion The conversion of the case of a {@link java.lang.String}.
   * @param comparison The comparison on {@link java.lang.String} which consider the case.
   * @return An instance of a letter case.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/lettercase/LetterCase.java`
#### Snippet
```java
   * Returns a instance of a letter case.
   * @param conversion The conversion of the case of a {@link java.lang.String}.
   * @param comparison The comparison on {@link java.lang.String} which consider the case.
   * @return An instance of a letter case.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToChanges.java`
#### Snippet
```java
 * @author Régis Pouiller
 *
 * @param <CHS> The class of a assertion on changes (an sub-class of {@link org.assertj.db.navigation.element.ChangesElement}).
 */
public interface ToChanges<CHS extends ChangesElement> extends Navigation {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToColumnFromChange.java`
#### Snippet
```java
/**
 * Defines methods to navigate to a modified {@link org.assertj.db.type.Column} from a {@link org.assertj.db.type.Change}.
 * <p>The different methods return an assertion on one column {@link org.assertj.db.navigation.element.ColumnElement}.</p>
 * <p>These methods exists when navigating (at the beginning {@code assertThat()}) from changes.</p>
 * <p>The difference with {@link ToColumn} is that {@link ToColumn}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToColumnFromChange.java`
#### Snippet
```java
 * with a modification between the start point and the end point.
 * </p>
 * <p>As shown in the diagram below, it is possible to call the method to navigate to a {@link org.assertj.db.navigation.element.ColumnElement} from :</p>
 * <ul>
 *     <li>a change ({@link org.assertj.db.api.ChangeAssert})</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToColumnFromChange.java`
#### Snippet
```java
 * @author Régis Pouiller
 *
 * @param <C> The class of a assertion on a column (an sub-class of {@link org.assertj.db.navigation.element.ColumnElement}).
 */
public interface ToColumnFromChange<C extends ColumnElement> extends Navigation {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToColumn.java`
#### Snippet
```java
/**
 * Defines methods to navigate to a {@link org.assertj.db.type.Column}.
 * <p>The different methods return an assertion on one column {@link org.assertj.db.navigation.element.ColumnElement}.</p>
 * <p>These methods exists when navigating (at the beginning {@code assertThat()}) from changes, from a {@link org.assertj.db.type.Table} or from a {@link org.assertj.db.type.Request}.</p>
 * <p>As shown in the diagram below, if navigating from table or request, it is possible to call the method to navigate to a {@link org.assertj.db.navigation.element.ColumnElement} from :</p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToColumn.java`
#### Snippet
```java
 * <p>The different methods return an assertion on one column {@link org.assertj.db.navigation.element.ColumnElement}.</p>
 * <p>These methods exists when navigating (at the beginning {@code assertThat()}) from changes, from a {@link org.assertj.db.type.Table} or from a {@link org.assertj.db.type.Request}.</p>
 * <p>As shown in the diagram below, if navigating from table or request, it is possible to call the method to navigate to a {@link org.assertj.db.navigation.element.ColumnElement} from :</p>
 * <ul>
 *     <li>a table ({@link org.assertj.db.api.TableAssert})</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToColumn.java`
#### Snippet
```java
 * </code>
 * </pre>
 * <p>As shown in the diagram below, if navigating from changes, it is possible to call the method to navigate to a {@link org.assertj.db.navigation.element.ColumnElement} from :</p>
 * <ul>
 *     <li>a change ({@link org.assertj.db.api.ChangeAssert})</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToColumn.java`
#### Snippet
```java
 * @author Régis Pouiller
 *
 * @param <C> The class of a assertion on a column (an sub-class of {@link org.assertj.db.navigation.element.ColumnElement}).
 */
public interface ToColumn<C extends ColumnElement> extends Navigation {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToValueFromRow.java`
#### Snippet
```java
/**
 * Defines methods to navigate to a value from a {@link org.assertj.db.type.Row}.
 * <p>The different methods return an assertion on one value {@link org.assertj.db.navigation.element.ValueElement}.</p>
 * <p>These methods exists when navigating (at the beginning {@code assertThat()}) from changes, from a {@link org.assertj.db.type.Table} or from a {@link org.assertj.db.type.Request}.</p>
 * <p>As shown in the diagram below, if navigating from table or request, it is possible to call the method to navigate to a {@link org.assertj.db.navigation.element.ValueElement} from :</p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToValueFromRow.java`
#### Snippet
```java
 * <p>The different methods return an assertion on one value {@link org.assertj.db.navigation.element.ValueElement}.</p>
 * <p>These methods exists when navigating (at the beginning {@code assertThat()}) from changes, from a {@link org.assertj.db.type.Table} or from a {@link org.assertj.db.type.Request}.</p>
 * <p>As shown in the diagram below, if navigating from table or request, it is possible to call the method to navigate to a {@link org.assertj.db.navigation.element.ValueElement} from :</p>
 * <ul>
 *     <li>a row ({@link org.assertj.db.api.AbstractRowAssert})</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToValueFromRow.java`
#### Snippet
```java
 * </code>
 * </pre>
 * <p>As shown in the diagram below, if navigating from changes, it is possible to call the method to navigate to a {@link org.assertj.db.navigation.element.ValueElement} from :</p>
 * <ul>
 *     <li>a row of a change ({@link org.assertj.db.api.ChangeRowAssert})</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToValueFromRow.java`
#### Snippet
```java
 * @author Régis Pouiller
 *
 * @param <V> The class of a assertion on a value (an sub-class of {@link org.assertj.db.navigation.element.ValueElement}).
 */
public interface ToValueFromRow<V extends ValueElement> extends Navigation {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.global` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithPoints.java`
#### Snippet
```java
 * Position with point (start point and end point) during navigation.
 *
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <D> The class of the database element on which is the next position (an sub-class of {@link org.assertj.db.type.DbElement}).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithPoints.java`
#### Snippet
```java
 * Position with point (start point and end point) during navigation.
 *
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <D> The class of the database element on which is the next position (an sub-class of {@link org.assertj.db.type.DbElement}).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.global` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithPoints.java`
#### Snippet
```java
 *
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <D> The class of the database element on which is the next position (an sub-class of {@link org.assertj.db.type.DbElement}).
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithPoints.java`
#### Snippet
```java
 *
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <D> The class of the database element on which is the next position (an sub-class of {@link org.assertj.db.type.DbElement}).
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithPoints.java`
#### Snippet
```java
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <D> The class of the database element on which is the next position (an sub-class of {@link org.assertj.db.type.DbElement}).
 *
 * @author Régis Pouiller
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToValueFromColumn.java`
#### Snippet
```java
 * Defines methods to navigate to a value from a {@link org.assertj.db.type.Column}
 * (a column from a {@link org.assertj.db.type.Change}}.
 * <p>The different methods return an assertion on one value {@link org.assertj.db.navigation.element.ValueElement}.</p>
 * <p>These methods exists when navigating (at the beginning {@code assertThat()}) from changes.</p>
 * <p>As shown in the diagram below, if navigating from changes, it is possible to call the method to navigate to a {@link org.assertj.db.navigation.element.ColumnElement} from :</p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToValueFromColumn.java`
#### Snippet
```java
 * @author Régis Pouiller
 *
 * @param <V> The class of a assertion on a value (an sub-class of {@link org.assertj.db.navigation.element.ValueElement}).
 */
public interface ToValueFromColumn<V extends ValueElement> extends Navigation {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.error` is unnecessary and can be removed
in `src/main/java/org/assertj/db/error/ShouldExist.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.db.error.ShouldExist}</code>.
   *
   * @return the created {@code ErrorMessageFactory}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/lettercase/CaseComparisons.java`
#### Snippet
```java
  },
  /**
   * Comparison on {@link java.lang.String} which strictly consider the case.
   */
  STRICT {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/lettercase/CaseComparisons.java`
#### Snippet
```java

  /**
   * Comparison on {@link java.lang.String} which ignore the case.
   */
  IGNORE {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/lettercase/CaseComparisons.java`
#### Snippet
```java

/**
 * Comparisons on {@link java.lang.String} which consider the case.
 * @author Régis Pouiller
 * @since 1.1.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnChangeType.java`
#### Snippet
```java
   * @see #isModification()
   * @see #isDeletion()
   * @see org.assertj.db.api.ChangeAssert#isOfType(org.assertj.db.type.ChangeType)
   */
  T isOfType(ChangeType expected);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnChangeType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the change is not a deletion.
   * @see org.assertj.db.type.ChangeType#DELETION
   * @see org.assertj.db.api.ChangeAssert#isDeletion()
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnChangeType.java`
#### Snippet
```java
/**
 * Defines the assertion methods on the type of a change (creation, modification or deletion of a row).
 * <p>The different type of changes are enumerated in {@link org.assertj.db.type.ChangeType}.</p>
 *
 * @param <T> The "self" type of this assertion class. Please read &quot;<a href="http://bit.ly/1IZIRcY"
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnChangeType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the change is not a modification.
   * @see org.assertj.db.type.ChangeType#MODIFICATION
   * @see org.assertj.db.api.ChangeAssert#isModification()
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnChangeType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the change is not a creation.
   * @see org.assertj.db.type.ChangeType#CREATION
   * @see org.assertj.db.api.ChangeAssert#isCreation()
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/AbstractAssertWithValues.java`
#### Snippet
```java

/**
 * Base class for all values from a {@link org.assertj.db.type.Change} assertions.
 *
 * @param <E> The "self" type of this assertion class. Please read &quot;<a href="http://bit.ly/1IZIRcY"
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/output/TableOutputter.java`
#### Snippet
```java

/**
 * Output methods for a {@link org.assertj.db.type.Table}.
 *
 * @author Régis Pouiller
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the value is not UUID.
   * @see org.assertj.db.type.ValueType#UUID
   * @see org.assertj.db.api.AbstractValueAssert#isUUID()
   * @see org.assertj.db.api.AbstractAssertWithValues#isUUID()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the value is different to the type in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isOfType(org.assertj.db.type.ValueType)
   * @see org.assertj.db.api.AbstractAssertWithValues#isOfType(org.assertj.db.type.ValueType)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueType.java`
#### Snippet
```java
   * @throws AssertionError If the type of the value is different to the type in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isOfType(org.assertj.db.type.ValueType)
   * @see org.assertj.db.api.AbstractAssertWithValues#isOfType(org.assertj.db.type.ValueType)
   */
  T isOfType(ValueType expected);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the value is not time.
   * @see org.assertj.db.type.ValueType#TIME
   * @see org.assertj.db.api.AbstractValueAssert#isTime()
   * @see org.assertj.db.api.AbstractAssertWithValues#isTime()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the value is not date.
   * @see org.assertj.db.type.ValueType#DATE
   * @see org.assertj.db.api.AbstractValueAssert#isDate()
   * @see org.assertj.db.api.AbstractAssertWithValues#isDate()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the value is not text.
   * @see org.assertj.db.type.ValueType#TEXT
   * @see org.assertj.db.api.AbstractValueAssert#isText()
   * @see org.assertj.db.api.AbstractAssertWithValues#isText()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the value is not date/time.
   * @see org.assertj.db.type.ValueType#DATE_TIME
   * @see org.assertj.db.api.AbstractValueAssert#isDateTime()
   * @see org.assertj.db.api.AbstractAssertWithValues#isDateTime()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the value is not boolean.
   * @see org.assertj.db.type.ValueType#BOOLEAN
   * @see org.assertj.db.api.AbstractValueAssert#isBoolean()
   * @see org.assertj.db.api.AbstractAssertWithValues#isBoolean()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the value is not number.
   * @see org.assertj.db.type.ValueType#NUMBER
   * @see org.assertj.db.api.AbstractValueAssert#isNumber()
   * @see org.assertj.db.api.AbstractAssertWithValues#isNumber()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the value is not array of bytes.
   * @see org.assertj.db.type.ValueType#BYTES
   * @see org.assertj.db.api.AbstractValueAssert#isBytes()
   * @see org.assertj.db.api.AbstractAssertWithValues#isBytes()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueType.java`
#### Snippet
```java
/**
 * Defines the assertion methods on the type of a value.
 * <p>The different type of values are enumerated in {@link org.assertj.db.type.ValueType}.</p>
 *
 * @param <T> The "self" type of this assertion class. Please read &quot;<a href="http://bit.ly/1IZIRcY"
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the value is different to all the types in parameters.
   * @see org.assertj.db.api.AbstractValueAssert#isOfAnyTypeIn(org.assertj.db.type.ValueType...)
   * @see org.assertj.db.api.AbstractAssertWithValues#isOfAnyTypeIn(org.assertj.db.type.ValueType...)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueType.java`
#### Snippet
```java
   * @throws AssertionError If the type of the value is different to all the types in parameters.
   * @see org.assertj.db.api.AbstractValueAssert#isOfAnyTypeIn(org.assertj.db.type.ValueType...)
   * @see org.assertj.db.api.AbstractAssertWithValues#isOfAnyTypeIn(org.assertj.db.type.ValueType...)
   */
  T isOfAnyTypeIn(ValueType... expected);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.global` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/Position.java`
#### Snippet
```java
 * Position during navigation.
 *
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <D> The class of the database element on which is the next position (an sub-class of {@link org.assertj.db.type.DbElement}).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/Position.java`
#### Snippet
```java
 * Position during navigation.
 *
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <D> The class of the database element on which is the next position (an sub-class of {@link org.assertj.db.type.DbElement}).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.global` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/Position.java`
#### Snippet
```java
 *
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <D> The class of the database element on which is the next position (an sub-class of {@link org.assertj.db.type.DbElement}).
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/Position.java`
#### Snippet
```java
 *
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <D> The class of the database element on which is the next position (an sub-class of {@link org.assertj.db.type.DbElement}).
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/Position.java`
#### Snippet
```java
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <D> The class of the database element on which is the next position (an sub-class of {@link org.assertj.db.type.DbElement}).
 *
 * @author Régis Pouiller
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/origin/OriginWithColumnsAndRowsFromChange.java`
#### Snippet
```java
 * @author Régis Pouiller
 *
 * @param <CHS> The class of a element of navigation on changes (an sub-class of {@link org.assertj.db.navigation.element.ChangesElement}).
 * @param <CH> The class of a element of navigation on a change (an sub-class of {@link org.assertj.db.navigation.element.ChangeElement}).
 * @param <C> The class of a element of navigation on column (an sub-class of {@link org.assertj.db.navigation.element.ColumnElement}).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/origin/OriginWithColumnsAndRowsFromChange.java`
#### Snippet
```java
 *
 * @param <CHS> The class of a element of navigation on changes (an sub-class of {@link org.assertj.db.navigation.element.ChangesElement}).
 * @param <CH> The class of a element of navigation on a change (an sub-class of {@link org.assertj.db.navigation.element.ChangeElement}).
 * @param <C> The class of a element of navigation on column (an sub-class of {@link org.assertj.db.navigation.element.ColumnElement}).
 * @param <R> The class of a element of navigation on a row (an sub-class of {@link org.assertj.db.navigation.element.RowElement}).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/origin/OriginWithColumnsAndRowsFromChange.java`
#### Snippet
```java
 * @param <CHS> The class of a element of navigation on changes (an sub-class of {@link org.assertj.db.navigation.element.ChangesElement}).
 * @param <CH> The class of a element of navigation on a change (an sub-class of {@link org.assertj.db.navigation.element.ChangeElement}).
 * @param <C> The class of a element of navigation on column (an sub-class of {@link org.assertj.db.navigation.element.ColumnElement}).
 * @param <R> The class of a element of navigation on a row (an sub-class of {@link org.assertj.db.navigation.element.RowElement}).
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/origin/OriginWithColumnsAndRowsFromChange.java`
#### Snippet
```java
 * @param <CH> The class of a element of navigation on a change (an sub-class of {@link org.assertj.db.navigation.element.ChangeElement}).
 * @param <C> The class of a element of navigation on column (an sub-class of {@link org.assertj.db.navigation.element.ColumnElement}).
 * @param <R> The class of a element of navigation on a row (an sub-class of {@link org.assertj.db.navigation.element.RowElement}).
 */
public interface OriginWithColumnsAndRowsFromChange<CHS extends ChangesElement, CH extends ChangeElement, C extends ColumnElement, R extends RowElement>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.exception` is unnecessary and can be removed
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
   * @param expected Expected values for comparison.
   * @return A representation of the values.
   * @throws org.assertj.db.exception.AssertJDBException If the length of the two arrays are different.
   */
  public static Object[] getRepresentationsFromValuesInFrontOfExpected(Value[] values, Object[] expected) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnValueType.java`
#### Snippet
```java
/**
 * Implements the assertion methods on the type of a value.
 * <p>The different type of values are enumerated in {@link org.assertj.db.type.ValueType}.</p>
 *
 * @author Régis Pouiller
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.error` is unnecessary and can be removed
in `src/main/java/org/assertj/db/error/ShouldBeEqualWithStartPoint.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.db.error.ShouldBeEqualWithStartPoint}</code>.
   *
   * @param actual The actual value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.error` is unnecessary and can be removed
in `src/main/java/org/assertj/db/error/ShouldBeEqualWithStartPoint.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.db.error.ShouldBeEqualWithStartPoint}</code>.
   *
   * @return the created {@code ErrorMessageFactory}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnColumnType.java`
#### Snippet
```java
/**
 * Implements the assertion methods on the type of a column.
 * <p>The different type of values are enumerated in {@link org.assertj.db.type.ValueType}.</p>
 *
 * @author Régis Pouiller
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToChange.java`
#### Snippet
```java
 * @author Régis Pouiller
 *
 * @param <CH> The class of a assertion on a change (an sub-class of {@link org.assertj.db.navigation.element.ChangeElement}).
 */
public interface ToChange<CH extends ChangeElement> extends Navigation {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/output/RequestOutputter.java`
#### Snippet
```java

/**
 * Output methods for a {@link org.assertj.db.type.Request}.
 *
 * @author Régis Pouiller
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/Table.java`
#### Snippet
```java
  /**
   * Indicates an order with the name on which is the order and the type.
   * @see org.assertj.db.type.Table.Order.OrderType
   */
  public static class Order {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnPrimaryKey.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError                 If the columns of the primary key are different to the names in parameters.
   * @throws java.lang.NullPointerException If one of the names in parameters is {@code null}.
   */
  public static <A extends AbstractAssert<?>> A hasPksNames(A assertion, WritableAssertionInfo info, Change change,
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnPrimaryKey.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError                 If the columns of the primary key are different to the names in parameters.
   * @throws java.lang.NullPointerException If one of the names in parameters is {@code null}.
   * @see org.assertj.db.api.ChangeAssert#hasPksNames(String...)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnDataType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError                 If the type of data is not table or if the table have a different name.
   * @throws java.lang.NullPointerException If the name in parameter is {@code null}.
   */
  public static <A extends AbstractAssert<?>> A isOnTable(A assertion, WritableAssertionInfo info, Change change,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnDataType.java`
#### Snippet
```java
/**
 * Implements the assertion methods on the type of data (from a table or from a request).
 * <p>The different type of data are enumerated in {@link org.assertj.db.type.DataType}.</p>
 *
 * @author Régis Pouiller
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnColumnOfChangeType.java`
#### Snippet
```java
/**
 * Implements the assertion methods on the type of a column of a change.
 * <p>The different type of values are enumerated in {@link org.assertj.db.type.ValueType}.</p>
 *
 * @author Régis Pouiller
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.error` is unnecessary and can be removed
in `src/main/java/org/assertj/db/error/ShouldBeValueClassWithEndPoint.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.db.error.ShouldBeValueClassWithEndPoint}</code>.
   *
   * @param actual The actual value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.origin` is unnecessary and can be removed
in `src/main/java/org/assertj/db/output/AbstractOutputterWithOrigin.java`
#### Snippet
```java
   *
   * @param selfType Type of this assertion class : a sub-class of {@code AbstractOutputterWithOrigin}.
   * @param origin The assertion of {@link org.assertj.db.navigation.origin.Origin}.
   */
  AbstractOutputterWithOrigin(Class<E> selfType, O origin) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.origin` is unnecessary and can be removed
in `src/main/java/org/assertj/db/output/AbstractOutputterWithOrigin.java`
#### Snippet
```java

/**
 * Base class for all outputs with an {@link org.assertj.db.navigation.origin.Origin}.
 *
 * @author Régis Pouiller
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.origin` is unnecessary and can be removed
in `src/main/java/org/assertj/db/output/AbstractOutputterWithOrigin.java`
#### Snippet
```java
 *          target="_blank">Emulating 'self types' using Java Generics to simplify fluent API implementation</a>&quot;
 *          for more details.
 * @param <O> The type of the assertion class of {@link org.assertj.db.navigation.origin.Origin}.
 */
public abstract class AbstractOutputterWithOrigin<E extends AbstractOutputterWithOrigin<E, O>, O extends Origin>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.origin` is unnecessary and can be removed
in `src/main/java/org/assertj/db/output/AbstractOutputterWithOrigin.java`
#### Snippet
```java

  /**
   * Returns the assertion of origin (an instance of a sub-class of {@link org.assertj.db.navigation.origin.Origin}.
   *
   * @return The assertion of origin.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToRow.java`
#### Snippet
```java

  /**
   * Returns assertion methods on the next {@link org.assertj.db.type.Row} in the list of {@link org.assertj.db.type.Row}.
   * 
   * @return An object to make assertions on the next {@link Row}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToRow.java`
#### Snippet
```java

  /**
   * Returns assertion methods on the next {@link org.assertj.db.type.Row} in the list of {@link org.assertj.db.type.Row}.
   * 
   * @return An object to make assertions on the next {@link Row}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToRow.java`
#### Snippet
```java
   * 
   * @return An object to make assertions on the next {@link Row}.
   * @throws AssertJDBException If there are no more {@link org.assertj.db.type.Row} in the list of {@link org.assertj.db.type.Row}s.
   * @see org.assertj.db.api.TableAssert#row()
   * @see org.assertj.db.api.RequestAssert#row()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToRow.java`
#### Snippet
```java
   * 
   * @return An object to make assertions on the next {@link Row}.
   * @throws AssertJDBException If there are no more {@link org.assertj.db.type.Row} in the list of {@link org.assertj.db.type.Row}s.
   * @see org.assertj.db.api.TableAssert#row()
   * @see org.assertj.db.api.RequestAssert#row()
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToRow.java`
#### Snippet
```java

  /**
   * Returns assertion methods on the {@link org.assertj.db.type.Row} at the {@code index} in parameter.
   * 
   * @param index The index corresponding to the {@link org.assertj.db.type.Row}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToRow.java`
#### Snippet
```java
   * Returns assertion methods on the {@link org.assertj.db.type.Row} at the {@code index} in parameter.
   * 
   * @param index The index corresponding to the {@link org.assertj.db.type.Row}.
   * @return An object to make assertions on the {@link org.assertj.db.type.Row}.
   * @throws AssertJDBException If the {@code index} is out of the bounds.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToRow.java`
#### Snippet
```java
   * 
   * @param index The index corresponding to the {@link org.assertj.db.type.Row}.
   * @return An object to make assertions on the {@link org.assertj.db.type.Row}.
   * @throws AssertJDBException If the {@code index} is out of the bounds.
   * @see org.assertj.db.api.TableAssert#row(int)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToRow.java`
#### Snippet
```java

/**
 * Defines methods to navigate to a {@link org.assertj.db.type.Row}.
 * <p>The different methods return an assertion on one row {@link org.assertj.db.navigation.element.RowElement}.</p>
 * <p>These methods exists when navigating (at the beginning {@code assertThat()}) from a {@link org.assertj.db.type.Table} or from a {@link org.assertj.db.type.Request}.</p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToRow.java`
#### Snippet
```java
/**
 * Defines methods to navigate to a {@link org.assertj.db.type.Row}.
 * <p>The different methods return an assertion on one row {@link org.assertj.db.navigation.element.RowElement}.</p>
 * <p>These methods exists when navigating (at the beginning {@code assertThat()}) from a {@link org.assertj.db.type.Table} or from a {@link org.assertj.db.type.Request}.</p>
 * <p>As shown in the diagram below, it is possible to call the method to navigate to a {@link org.assertj.db.navigation.element.RowElement} from :</p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToRow.java`
#### Snippet
```java
 * <p>The different methods return an assertion on one row {@link org.assertj.db.navigation.element.RowElement}.</p>
 * <p>These methods exists when navigating (at the beginning {@code assertThat()}) from a {@link org.assertj.db.type.Table} or from a {@link org.assertj.db.type.Request}.</p>
 * <p>As shown in the diagram below, it is possible to call the method to navigate to a {@link org.assertj.db.navigation.element.RowElement} from :</p>
 * <ul>
 *     <li>a table ({@link org.assertj.db.api.TableAssert})</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToRow.java`
#### Snippet
```java
 * @author Régis Pouiller
 *
 * @param <R> The class of a assertion on a row (an sub-class of {@link org.assertj.db.navigation.element.RowElement}).
 */
public interface ToRow<R extends RowElement> extends Navigation {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the value is not after to the date value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isAfter(org.assertj.db.type.DateValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isAfter(org.assertj.db.type.DateValue)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @throws AssertionError If the value is not after to the date value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isAfter(org.assertj.db.type.DateValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isAfter(org.assertj.db.type.DateValue)
   */
  T isAfter(DateValue date);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the value is not before or equal to the time value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isBeforeOrEqualTo(org.assertj.db.type.TimeValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isBeforeOrEqualTo(org.assertj.db.type.TimeValue)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @throws AssertionError If the value is not before or equal to the time value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isBeforeOrEqualTo(org.assertj.db.type.TimeValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isBeforeOrEqualTo(org.assertj.db.type.TimeValue)
   */
  T isBeforeOrEqualTo(TimeValue time);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the value is not before to the date/time value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isBefore(org.assertj.db.type.DateTimeValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isBefore(org.assertj.db.type.DateTimeValue)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @throws AssertionError If the value is not before to the date/time value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isBefore(org.assertj.db.type.DateTimeValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isBefore(org.assertj.db.type.DateTimeValue)
   */
  T isBefore(DateTimeValue dateTime);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the value is not after or equal to the date/time value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isAfterOrEqualTo(org.assertj.db.type.DateTimeValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isAfterOrEqualTo(org.assertj.db.type.DateTimeValue)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @throws AssertionError If the value is not after or equal to the date/time value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isAfterOrEqualTo(org.assertj.db.type.DateTimeValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isAfterOrEqualTo(org.assertj.db.type.DateTimeValue)
   */
  T isAfterOrEqualTo(DateTimeValue dateTime);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the value is not before to the date value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isBefore(org.assertj.db.type.DateValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isBefore(org.assertj.db.type.DateValue)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @throws AssertionError If the value is not before to the date value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isBefore(org.assertj.db.type.DateValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isBefore(org.assertj.db.type.DateValue)
   */
  T isBefore(DateValue date);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the value is not after or equal to the time value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isAfterOrEqualTo(org.assertj.db.type.TimeValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isAfterOrEqualTo(org.assertj.db.type.TimeValue)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @throws AssertionError If the value is not after or equal to the time value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isAfterOrEqualTo(org.assertj.db.type.TimeValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isAfterOrEqualTo(org.assertj.db.type.TimeValue)
   */
  T isAfterOrEqualTo(TimeValue time);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the value is not after to the date/time value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isAfter(org.assertj.db.type.DateTimeValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isAfter(org.assertj.db.type.DateTimeValue)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @throws AssertionError If the value is not after to the date/time value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isAfter(org.assertj.db.type.DateTimeValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isAfter(org.assertj.db.type.DateTimeValue)
   */
  T isAfter(DateTimeValue dateTime);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the value is not before or equal to the date/time value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isBeforeOrEqualTo(org.assertj.db.type.DateTimeValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isBeforeOrEqualTo(org.assertj.db.type.DateTimeValue)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @throws AssertionError If the value is not before or equal to the date/time value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isBeforeOrEqualTo(org.assertj.db.type.DateTimeValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isBeforeOrEqualTo(org.assertj.db.type.DateTimeValue)
   */
  T isBeforeOrEqualTo(DateTimeValue dateTime);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the value is not after or equal to the time value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isAfterOrEqualTo(org.assertj.db.type.DateValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isAfterOrEqualTo(org.assertj.db.type.DateValue)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @throws AssertionError If the value is not after or equal to the time value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isAfterOrEqualTo(org.assertj.db.type.DateValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isAfterOrEqualTo(org.assertj.db.type.DateValue)
   */
  T isAfterOrEqualTo(DateValue date);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the value is not before or equal to the date value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isBeforeOrEqualTo(org.assertj.db.type.DateValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isBeforeOrEqualTo(org.assertj.db.type.DateValue)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @throws AssertionError If the value is not before or equal to the date value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isBeforeOrEqualTo(org.assertj.db.type.DateValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isBeforeOrEqualTo(org.assertj.db.type.DateValue)
   */
  T isBeforeOrEqualTo(DateValue date);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the value is not after to the time value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isAfter(org.assertj.db.type.TimeValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isAfter(org.assertj.db.type.TimeValue)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @throws AssertionError If the value is not after to the time value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isAfter(org.assertj.db.type.TimeValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isAfter(org.assertj.db.type.TimeValue)
   */
  T isAfter(TimeValue time);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the value is not before to the time value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isBefore(org.assertj.db.type.TimeValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isBefore(org.assertj.db.type.TimeValue)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnValueChronology.java`
#### Snippet
```java
   * @throws AssertionError If the value is not before to the time value in parameter.
   * @see org.assertj.db.api.AbstractValueAssert#isBefore(org.assertj.db.type.TimeValue)
   * @see org.assertj.db.api.AbstractAssertWithValues#isBefore(org.assertj.db.type.TimeValue)
   */
  T isBefore(TimeValue time);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/Change.java`
#### Snippet
```java
 * <p>
 * Note : you never instantiate directly this class. You will get an object of this class from a {@link Changes}
 * with the list by using {@link org.assertj.db.type.Changes#getChangesList()},
 * {@link org.assertj.db.type.Changes#getChangesOfTable(String)}
 * or {@link org.assertj.db.type.Changes#getChangesOfType(ChangeType)}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/Change.java`
#### Snippet
```java
 * Note : you never instantiate directly this class. You will get an object of this class from a {@link Changes}
 * with the list by using {@link org.assertj.db.type.Changes#getChangesList()},
 * {@link org.assertj.db.type.Changes#getChangesOfTable(String)}
 * or {@link org.assertj.db.type.Changes#getChangesOfType(ChangeType)}.
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/Change.java`
#### Snippet
```java
 * with the list by using {@link org.assertj.db.type.Changes#getChangesList()},
 * {@link org.assertj.db.type.Changes#getChangesOfTable(String)}
 * or {@link org.assertj.db.type.Changes#getChangesOfType(ChangeType)}.
 * </p>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToValue.java`
#### Snippet
```java
/**
 * Defines methods to navigate to a value.
 * <p>The different methods return an assertion on one value {@link org.assertj.db.navigation.element.ValueElement}.</p>
 * <p>These methods exists when navigating (at the beginning {@code assertThat()}) from changes, from a {@link org.assertj.db.type.Table} or from a {@link org.assertj.db.type.Request}.</p>
 * <p>As shown in the diagram below, if navigating from table or request, it is possible to call the method to navigate to a {@link org.assertj.db.navigation.element.ValueElement} from :</p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToValue.java`
#### Snippet
```java
 * <p>The different methods return an assertion on one value {@link org.assertj.db.navigation.element.ValueElement}.</p>
 * <p>These methods exists when navigating (at the beginning {@code assertThat()}) from changes, from a {@link org.assertj.db.type.Table} or from a {@link org.assertj.db.type.Request}.</p>
 * <p>As shown in the diagram below, if navigating from table or request, it is possible to call the method to navigate to a {@link org.assertj.db.navigation.element.ValueElement} from :</p>
 * <ul>
 *     <li>a column ({@link org.assertj.db.api.AbstractColumnAssert})</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToValue.java`
#### Snippet
```java
 * </code>
 * </pre>
 * <p>As shown in the diagram below, if navigating from changes, it is possible to call the method to navigate to a {@link org.assertj.db.navigation.element.ValueElement} from :</p>
 * <ul>
 *     <li>a row of a change ({@link org.assertj.db.api.ChangeRowAssert})</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToValue.java`
#### Snippet
```java
 * @author Régis Pouiller
 *
 * @param <V> The class of a assertion on a value (an sub-class of {@link org.assertj.db.navigation.element.ValueElement}).
 */
public interface ToValue<V extends ValueElement> extends Navigation {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/lettercase/CaseConversion.java`
#### Snippet
```java

  /**
   * Converts the {@link java.lang.String} in parameter to another.
   * @param value The {@link java.lang.String} to convert.
   * @return The result.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/lettercase/CaseConversion.java`
#### Snippet
```java
  /**
   * Converts the {@link java.lang.String} in parameter to another.
   * @param value The {@link java.lang.String} to convert.
   * @return The result.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/lettercase/CaseConversion.java`
#### Snippet
```java

/**
 * Conversion of the case of a {@link java.lang.String}.
 * @author Régis Pouiller
 * @since 1.1.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnDataType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of data is not request.
   * @see org.assertj.db.type.DataType#REQUEST
   * @see org.assertj.db.api.ChangeAssert#isOnRequest()
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnDataType.java`
#### Snippet
```java
/**
 * Defines the assertion methods on the type of data (from a table or from a request).
 * <p>The different type of data are enumerated in {@link org.assertj.db.type.DataType}.</p>
 *
 * @param <T> The "self" type of this assertion class. Please read &quot;<a href="http://bit.ly/1IZIRcY"
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnDataType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError                 If the type of data is not table or if the table have a different name.
   * @throws java.lang.NullPointerException If the name in parameter is {@code null}.
   * @see org.assertj.db.api.ChangeAssert#isOnTable(String)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnDataType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of data is not table.
   * @see org.assertj.db.type.DataType#TABLE
   * @see org.assertj.db.api.ChangeAssert#isOnTable()
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnDataType.java`
#### Snippet
```java
   * @see #isOnTable()
   * @see #isOnRequest()
   * @see org.assertj.db.api.ChangeAssert#isOnDataType(org.assertj.db.type.DataType)
   */
  T isOnDataType(DataType expected);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/Value.java`
#### Snippet
```java
      return ValueType.DATE_TIME;
    }
    if (object instanceof java.util.UUID) {
      return ValueType.UUID;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.exception` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithColumnsChange.java`
#### Snippet
```java
   * @param index Index of the instance.
   * @return The instance.
   * @throws org.assertj.db.exception.AssertJDBException If the {@code index} is out of the bounds.
   */
  public N getModifiedChangeColumnInstance(Change change, int index) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.exception` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithColumnsChange.java`
#### Snippet
```java
   * @param comparison      Case comparison for column name.
   * @return The instance.
   * @throws org.assertj.db.exception.AssertJDBException If the {@code index} is out of the bounds.
   */
  public N getChangeColumnInstance(Change change, String columnName, CaseComparison comparison) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.exception` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithColumnsChange.java`
#### Snippet
```java
   * @param change The change
   * @return The instance.
   * @throws org.assertj.db.exception.AssertJDBException If the {@code index} is out of the bounds.
   */
  public N getModifiedChangeColumnInstance(Change change) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.exception` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithColumnsChange.java`
#### Snippet
```java
   * @param index Index of the instance.
   * @return The instance.
   * @throws org.assertj.db.exception.AssertJDBException If the {@code index} is out of the bounds.
   */
  public N getChangeColumnInstance(Change change, int index) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.exception` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithColumnsChange.java`
#### Snippet
```java
   * @param comparison      Case comparison for column name.
   * @return The instance.
   * @throws org.assertj.db.exception.AssertJDBException If the {@code index} is out of the bounds.
   */
  public N getModifiedChangeColumnInstance(Change change, String columnName, CaseComparison comparison) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.global` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithColumnsChange.java`
#### Snippet
```java
 * Position during navigation.
 *
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithColumnsChange.java`
#### Snippet
```java
 * Position during navigation.
 *
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.global` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithColumnsChange.java`
#### Snippet
```java
 *
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 *
 * @author Régis Pouiller
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithColumnsChange.java`
#### Snippet
```java
 *
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 *
 * @author Régis Pouiller
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.exception` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithColumnsChange.java`
#### Snippet
```java
   * @param change The change
   * @return The instance.
   * @throws org.assertj.db.exception.AssertJDBException If the {@code index} is out of the bounds.
   */
  public N getChangeColumnInstance(Change change) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnColumnType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the column is not time.
   * @see org.assertj.db.type.ValueType#TIME
   * @see org.assertj.db.api.AbstractColumnAssert#isTime(boolean)
   * @see org.assertj.db.api.ChangeColumnAssert#isTime(boolean)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnColumnType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the column is not boolean.
   * @see org.assertj.db.type.ValueType#BOOLEAN
   * @see org.assertj.db.api.AbstractColumnAssert#isBoolean(boolean)
   * @see org.assertj.db.api.ChangeColumnAssert#isBoolean(boolean)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnColumnType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the column is not UUID.
   * @see org.assertj.db.type.ValueType#UUID
   * @see org.assertj.db.api.AbstractColumnAssert#isUUID(boolean)
   * @see org.assertj.db.api.ChangeColumnAssert#isUUID(boolean)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnColumnType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the column is different to the type in parameter.
   * @see org.assertj.db.api.AbstractColumnAssert#isOfType(org.assertj.db.type.ValueType, boolean)
   * @see org.assertj.db.api.ChangeColumnAssert#isOfType(org.assertj.db.type.ValueType, boolean)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnColumnType.java`
#### Snippet
```java
   * @throws AssertionError If the type of the column is different to the type in parameter.
   * @see org.assertj.db.api.AbstractColumnAssert#isOfType(org.assertj.db.type.ValueType, boolean)
   * @see org.assertj.db.api.ChangeColumnAssert#isOfType(org.assertj.db.type.ValueType, boolean)
   */
  T isOfType(ValueType expected, boolean lenient);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnColumnType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the column is different to all the types in parameters.
   * @see org.assertj.db.api.AbstractColumnAssert#isOfAnyTypeIn(org.assertj.db.type.ValueType...)
   * @see org.assertj.db.api.ChangeColumnAssert#isOfAnyTypeIn(org.assertj.db.type.ValueType...)
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnColumnType.java`
#### Snippet
```java
   * @throws AssertionError If the type of the column is different to all the types in parameters.
   * @see org.assertj.db.api.AbstractColumnAssert#isOfAnyTypeIn(org.assertj.db.type.ValueType...)
   * @see org.assertj.db.api.ChangeColumnAssert#isOfAnyTypeIn(org.assertj.db.type.ValueType...)
   */
  T isOfAnyTypeIn(ValueType... expected);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnColumnType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the column is not date.
   * @see org.assertj.db.type.ValueType#DATE
   * @see org.assertj.db.api.AbstractColumnAssert#isDate(boolean)
   * @see org.assertj.db.api.ChangeColumnAssert#isDate(boolean)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnColumnType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the column is not date/time.
   * @see org.assertj.db.type.ValueType#DATE_TIME
   * @see org.assertj.db.api.AbstractColumnAssert#isDateTime(boolean)
   * @see org.assertj.db.api.ChangeColumnAssert#isDateTime(boolean)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnColumnType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the column is not number.
   * @see org.assertj.db.type.ValueType#NUMBER
   * @see org.assertj.db.api.AbstractColumnAssert#isNumber(boolean)
   * @see org.assertj.db.api.ChangeColumnAssert#isNumber(boolean)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnColumnType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the column is not text.
   * @see org.assertj.db.type.ValueType#TEXT
   * @see org.assertj.db.api.AbstractColumnAssert#isText(boolean)
   * @see org.assertj.db.api.ChangeColumnAssert#isText(boolean)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnColumnType.java`
#### Snippet
```java
/**
 * Defines the assertion methods on the type of a column.
 * <p>The different type of values are enumerated in {@link org.assertj.db.type.ValueType}.</p>
 *
 * @param <T> The "self" type of this assertion class. Please read &quot;<a href="http://bit.ly/1IZIRcY"
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/AssertOnColumnType.java`
#### Snippet
```java
   * @return {@code this} assertion object.
   * @throws AssertionError If the type of the column is not array of bytes.
   * @see org.assertj.db.type.ValueType#BYTES
   * @see org.assertj.db.api.AbstractColumnAssert#isBytes(boolean)
   * @see org.assertj.db.api.ChangeColumnAssert#isBytes(boolean)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/origin/OriginWithValuesFromRow.java`
#### Snippet
```java
 * @author Régis Pouiller
 *
 * @param <CHS> The class of a element of navigation on changes (an sub-class of {@link org.assertj.db.navigation.element.ChangesElement}).
 * @param <CH> The class of a element of navigation on a change (an sub-class of {@link org.assertj.db.navigation.element.ChangeElement}).
 * @param <C> The class of a element of navigation on column (an sub-class of {@link org.assertj.db.navigation.element.ColumnElement}).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/origin/OriginWithValuesFromRow.java`
#### Snippet
```java
 *
 * @param <CHS> The class of a element of navigation on changes (an sub-class of {@link org.assertj.db.navigation.element.ChangesElement}).
 * @param <CH> The class of a element of navigation on a change (an sub-class of {@link org.assertj.db.navigation.element.ChangeElement}).
 * @param <C> The class of a element of navigation on column (an sub-class of {@link org.assertj.db.navigation.element.ColumnElement}).
 * @param <R> The class of a element of navigation on a row (an sub-class of {@link org.assertj.db.navigation.element.RowElement}).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/origin/OriginWithValuesFromRow.java`
#### Snippet
```java
 * @param <CHS> The class of a element of navigation on changes (an sub-class of {@link org.assertj.db.navigation.element.ChangesElement}).
 * @param <CH> The class of a element of navigation on a change (an sub-class of {@link org.assertj.db.navigation.element.ChangeElement}).
 * @param <C> The class of a element of navigation on column (an sub-class of {@link org.assertj.db.navigation.element.ColumnElement}).
 * @param <R> The class of a element of navigation on a row (an sub-class of {@link org.assertj.db.navigation.element.RowElement}).
 * @param <V> The class of a element of navigation on a value (an sub-class of {@link org.assertj.db.navigation.element.ValueElement}).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/origin/OriginWithValuesFromRow.java`
#### Snippet
```java
 * @param <CH> The class of a element of navigation on a change (an sub-class of {@link org.assertj.db.navigation.element.ChangeElement}).
 * @param <C> The class of a element of navigation on column (an sub-class of {@link org.assertj.db.navigation.element.ColumnElement}).
 * @param <R> The class of a element of navigation on a row (an sub-class of {@link org.assertj.db.navigation.element.RowElement}).
 * @param <V> The class of a element of navigation on a value (an sub-class of {@link org.assertj.db.navigation.element.ValueElement}).
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/origin/OriginWithValuesFromRow.java`
#### Snippet
```java
 * @param <C> The class of a element of navigation on column (an sub-class of {@link org.assertj.db.navigation.element.ColumnElement}).
 * @param <R> The class of a element of navigation on a row (an sub-class of {@link org.assertj.db.navigation.element.RowElement}).
 * @param <V> The class of a element of navigation on a value (an sub-class of {@link org.assertj.db.navigation.element.ValueElement}).
 */
public interface OriginWithValuesFromRow<CHS extends ChangesElement, CH extends ChangeElement, C extends ColumnElement, R extends RowElement, V extends ValueElement>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.global` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithChanges.java`
#### Snippet
```java
 * Position during navigation.
 *
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithChanges.java`
#### Snippet
```java
 * Position during navigation.
 *
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.global` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithChanges.java`
#### Snippet
```java
 *
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 *
 * @author Régis Pouiller
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithChanges.java`
#### Snippet
```java
 *
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 *
 * @author Régis Pouiller
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithChanges.java`
#### Snippet
```java
   * @param changes The changes
   * @param tableName  Name of the table on which is the instance of change assert.
   * @param pksValues The values of the primary key corresponding to the {@link org.assertj.db.type.Change}.
   * @return The change assert implementation.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/assertj/db/type/lettercase/CaseComparison.java`
#### Snippet
```java

/**
 * Comparison on {@link java.lang.String} which consider the case.
 * @author Régis Pouiller
 * @since 1.1.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.error` is unnecessary and can be removed
in `src/main/java/org/assertj/db/error/ShouldBeEqualWithEndPoint.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.db.error.ShouldBeEqualWithEndPoint}</code>.
   *
   * @param actual The actual value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.error` is unnecessary and can be removed
in `src/main/java/org/assertj/db/error/ShouldBeEqualWithEndPoint.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.db.error.ShouldBeEqualWithEndPoint}</code>.
   *
   * @return the created {@code ErrorMessageFactory}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.error` is unnecessary and can be removed
in `src/main/java/org/assertj/db/error/ShouldContainsValue.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.db.error.ShouldContainsValue}</code>.
   *
   * @param index The index of the value which is not found.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.error` is unnecessary and can be removed
in `src/main/java/org/assertj/db/error/ShouldContainsValue.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.db.error.ShouldContainsValue}</code>.
   *
   * @param actual The actual values in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/origin/OriginWithChanges.java`
#### Snippet
```java
/**
 * Defines a class which is the {@link Origin} of another
 * and have {@link org.assertj.db.navigation.element.ChangesElement}.
 *
 * @author Régis Pouiller
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/origin/OriginWithChanges.java`
#### Snippet
```java
 * @author Régis Pouiller
 *
 * @param <CHS> The class of a element of navigation on changes (an sub-class of {@link org.assertj.db.navigation.element.ChangesElement}).
 * @param <CH> The class of a element of navigation on a change (an sub-class of {@link org.assertj.db.navigation.element.ChangeElement}).
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/origin/OriginWithChanges.java`
#### Snippet
```java
 *
 * @param <CHS> The class of a element of navigation on changes (an sub-class of {@link org.assertj.db.navigation.element.ChangesElement}).
 * @param <CH> The class of a element of navigation on a change (an sub-class of {@link org.assertj.db.navigation.element.ChangeElement}).
 */
public interface OriginWithChanges<CHS extends ChangesElement, CH extends ChangeElement>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnChangeType.java`
#### Snippet
```java
/**
 * Implements the assertion methods on the type of a change (creation, modification or deletion of a row).
 * <p>The different type of changes are enumerated in {@link org.assertj.db.type.ChangeType}.</p>
 *
 * @author Régis Pouiller
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.error` is unnecessary and can be removed
in `src/main/java/org/assertj/db/error/ShouldBeValueTypeOfAnyWithStartPoint.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.db.error.ShouldBeValueTypeOfAnyWithStartPoint}</code>.
   *
   * @param actual The actual value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.origin` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/AbstractAssertWithOrigin.java`
#### Snippet
```java

/**
 * Base class for all assertions with an {@link org.assertj.db.navigation.origin.Origin}.
 * 
 * @author Régis Pouiller
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.origin` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/AbstractAssertWithOrigin.java`
#### Snippet
```java
 *          target="_blank">Emulating 'self types' using Java Generics to simplify fluent API implementation</a>&quot;
 *          for more details.
 * @param <O> The type of the assertion class of {@link org.assertj.db.navigation.origin.Origin}.
 */
public abstract class AbstractAssertWithOrigin<E extends AbstractAssertWithOrigin<E, O>, O extends Origin>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.origin` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/AbstractAssertWithOrigin.java`
#### Snippet
```java

  /**
   * Returns the assertion of origin (an instance of a sub-class of {@link org.assertj.db.navigation.origin.Origin}.
   * 
   * @return The assertion of origin.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.origin` is unnecessary and can be removed
in `src/main/java/org/assertj/db/api/AbstractAssertWithOrigin.java`
#### Snippet
```java
   * 
   * @param selfType Type of this assertion class : a sub-class of {@code AbstractAssertWithOrigin}.
   * @param origin The assertion of {@link org.assertj.db.navigation.origin.Origin}.
   */
  AbstractAssertWithOrigin(Class<E> selfType, O origin) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToRowFromChange.java`
#### Snippet
```java
/**
 * Defines methods to navigate to a {@link org.assertj.db.type.Row} from a {@link org.assertj.db.type.Change}.
 * <p>The different methods return an assertion on one row {@link org.assertj.db.navigation.element.RowElement}.</p>
 * <p>These methods exists when navigating (at the beginning {@code assertThat()}) from changes.</p>
 * <p>As shown in the diagram below, it is possible to call the method to navigate to a {@link org.assertj.db.navigation.element.RowElement} from :</p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToRowFromChange.java`
#### Snippet
```java
 * <p>The different methods return an assertion on one row {@link org.assertj.db.navigation.element.RowElement}.</p>
 * <p>These methods exists when navigating (at the beginning {@code assertThat()}) from changes.</p>
 * <p>As shown in the diagram below, it is possible to call the method to navigate to a {@link org.assertj.db.navigation.element.RowElement} from :</p>
 * <ul>
 *     <li>a change ({@link org.assertj.db.api.ChangeAssert})</li>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation.element` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/ToRowFromChange.java`
#### Snippet
```java
 * @author Régis Pouiller
 *
 * @param <R> The class of a assertion on a row (an sub-class of {@link org.assertj.db.navigation.element.RowElement}).
 */
public interface ToRowFromChange<R extends RowElement> extends Navigation {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.error` is unnecessary and can be removed
in `src/main/java/org/assertj/db/error/ShouldHaveName.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.db.error.ShouldHaveName}</code>.
   *
   * @param name The name of the column.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.error` is unnecessary and can be removed
in `src/main/java/org/assertj/db/error/ShouldBeValueTypeOfAnyWithEndPoint.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.db.error.ShouldBeValueTypeOfAnyWithEndPoint}</code>.
   *
   * @param actual The actual value in the failed assertion.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.global` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithColumns.java`
#### Snippet
```java
 * Position with columns during navigation.
 *
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <D> The class of the database element on which is the next position (an sub-class of {@link org.assertj.db.type.DbElement}).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithColumns.java`
#### Snippet
```java
 * Position with columns during navigation.
 *
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <D> The class of the database element on which is the next position (an sub-class of {@link org.assertj.db.type.DbElement}).
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.global` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithColumns.java`
#### Snippet
```java
 *
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <D> The class of the database element on which is the next position (an sub-class of {@link org.assertj.db.type.DbElement}).
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.navigation` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithColumns.java`
#### Snippet
```java
 *
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <D> The class of the database element on which is the next position (an sub-class of {@link org.assertj.db.type.DbElement}).
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.db.type` is unnecessary and can be removed
in `src/main/java/org/assertj/db/navigation/PositionWithColumns.java`
#### Snippet
```java
 * @param <E> The class of the actual position (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <N> The class of the next position where the navigation go (an sub-class of {@link org.assertj.db.global.AbstractElement} and of {@link org.assertj.db.navigation.Navigation}).
 * @param <D> The class of the database element on which is the next position (an sub-class of {@link org.assertj.db.type.DbElement}).
 *
 * @author Régis Pouiller
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.assertj.core.api.Condition;`
in `src/main/java/org/assertj/db/api/assertions/AssertOnRowCondition.java`
#### Snippet
```java
package org.assertj.db.api.assertions;

import org.assertj.core.api.Condition;

/**
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `PositionWithPoints()` of an abstract class should not be declared 'public'
in `src/main/java/org/assertj/db/navigation/PositionWithPoints.java`
#### Snippet
```java
   * @param atEndPoint The element at end point
   */
  public PositionWithPoints(E myself, Class<N> elementClass, Class<D> pointClass, D atStartPoint, D atEndPoint) {
    this.myself = myself;
    this.elementClass = elementClass;
```

### NonProtectedConstructorInAbstractClass
Constructor `Position()` of an abstract class should not be declared 'public'
in `src/main/java/org/assertj/db/navigation/Position.java`
#### Snippet
```java
   * @param elementClass Class of the element of navigation (used to make instance).
   */
  public Position(E myself, Class<N> elementClass) {
    this.myself = myself;
    this.elementClass = elementClass;
```

### NonProtectedConstructorInAbstractClass
Constructor `PositionWithColumnsChange()` of an abstract class should not be declared 'public'
in `src/main/java/org/assertj/db/navigation/PositionWithColumnsChange.java`
#### Snippet
```java
   * @param elementClass Class of the element of navigation (used to make instance).
   */
  public PositionWithColumnsChange(E myself, Class<N> elementClass) {
    this.myself = myself;
    this.elementClass = elementClass;
```

### NonProtectedConstructorInAbstractClass
Constructor `PositionWithChanges()` of an abstract class should not be declared 'public'
in `src/main/java/org/assertj/db/navigation/PositionWithChanges.java`
#### Snippet
```java
   * @param nextElementClass Class of the next element of navigation (used to make instance).
   */
  public PositionWithChanges(E myself, Class<E> actualElementClass, Class<N> nextElementClass) {
    this.myself = myself;
    this.actualElementClass = actualElementClass;
```

### NonProtectedConstructorInAbstractClass
Constructor `PositionWithColumns()` of an abstract class should not be declared 'public'
in `src/main/java/org/assertj/db/navigation/PositionWithColumns.java`
#### Snippet
```java
   * @param elementClass Class of the element of navigation (used to make instance).
   */
  public PositionWithColumns(E myself, Class<N> elementClass) {
    super(myself, elementClass);
  }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/assertj/db/api/ErrorCollector.java`
#### Snippet
```java
  private static class LastResult {
    private boolean wasSuccess = true;
    private boolean errorFound = false;

    private boolean wasSuccess() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/assertj/db/type/Table.java`
#### Snippet
```java
   * @since 1.2.0
   */
  private Character endDelimiter = null;

  /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/assertj/db/type/Table.java`
#### Snippet
```java
   * @since 1.2.0
   */
  private Character startDelimiter = null;
  /**
   * End delimiter for column name and table name.
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `changes`
in `src/main/java/org/assertj/db/navigation/PositionWithChanges.java`
#### Snippet
```java
  private Change getChange(Changes changes, int index, ChangeType changeType, String tableName) {
    if (changeType != null) {
      changes = changes.getChangesOfType(changeType);
    }
    if (tableName != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `changes`
in `src/main/java/org/assertj/db/navigation/PositionWithChanges.java`
#### Snippet
```java
    }
    if (tableName != null) {
      changes = changes.getChangesOfTable(tableName);
    }
    List<Change> changesList = changes.getChangesList();
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-18-16-00-25.387.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/assertj/db/type/lettercase/CaseConversions.java`
#### Snippet
```java
    public String convert(String value) {
      if (value == null) {
        return null;
      }
      return value.toUpperCase();
```

### ReturnNull
Return of `null`
in `src/main/java/org/assertj/db/type/lettercase/CaseConversions.java`
#### Snippet
```java
    public String convert(String value) {
      if (value == null) {
        return null;
      }
      return value.toLowerCase();
```

### ReturnNull
Return of `null`
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
      return (Long) object;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/org/assertj/db/type/Table.java`
#### Snippet
```java
  public Order[] getColumnsToOrder() {
    if (columnsToOrder == null) {
      return null;
    }
    return columnsToOrder.clone();
```

### ReturnNull
Return of `null`
in `src/main/java/org/assertj/db/type/Table.java`
#### Snippet
```java
  public String[] getColumnsToExclude() {
    if (columnsToExclude == null) {
      return null;
    }
    return columnsToExclude.clone();
```

### ReturnNull
Return of `null`
in `src/main/java/org/assertj/db/type/Table.java`
#### Snippet
```java
  public String[] getColumnsToCheck() {
    if (columnsToCheck == null) {
      return null;
    }
    return columnsToCheck.clone();
```

### ReturnNull
Return of `null`
in `src/main/java/org/assertj/db/type/AbstractDbElement.java`
#### Snippet
```java
    }
    catch (Exception throwable) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/assertj/db/type/AbstractDbElement.java`
#### Snippet
```java
    }
    catch (Exception throwable) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/main/java/org/assertj/db/navigation/PositionWithChanges.java`
#### Snippet
```java
    Map<String, E> mapWithTableName = changesAssertMap.get(changeType);
    if (mapWithTableName == null) {
      return null;
    }
    return mapWithTableName.get(tableName);
```

### ReturnNull
Return of `null`
in `src/main/java/org/assertj/db/type/Request.java`
#### Snippet
```java
  public Object[] getParameters() {
    if (parameters == null) {
      return null;
    }
    return parameters.clone();
```

### ReturnNull
Return of `null`
in `src/main/java/org/assertj/db/type/Row.java`
#### Snippet
```java
    int index = NameComparator.INSTANCE.indexOf(columnsNameList, columnName, columnLetterCase);
    if (index == -1) {
      return null;
    }
    return getColumnValue(index);
```

### ReturnNull
Return of `null`
in `src/main/java/org/assertj/db/type/AbstractDbData.java`
#### Snippet
```java
      }
    }
    return null;
  }
}
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `errorFound |= !success`
in `src/main/java/org/assertj/db/api/ErrorCollector.java`
#### Snippet
```java
      // ---- proxied isFalse() : no AssertionError caught => last result success = true
      // The overall last result success should not be true as one of the nested calls was not a success.
      errorFound |= !success;

      if (resolvingOutermostErrorCollectorProxyNestedCall()) {
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/util/RowComparator.java`
#### Snippet
```java
    List<Value> valuesList1 = row1.getValuesList();
    List<Value> valuesList2 = row2.getValuesList();
    Value[] values1 = valuesList1.toArray(new Value[0]);
    Value[] values2 = valuesList2.toArray(new Value[0]);
    return compare(values1, values2);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/util/RowComparator.java`
#### Snippet
```java
    List<Value> valuesList2 = row2.getValuesList();
    Value[] values1 = valuesList1.toArray(new Value[0]);
    Value[] values2 = valuesList2.toArray(new Value[0]);
    return compare(values1, values2);
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/util/Changes.java`
#### Snippet
```java
    }

    return indexesList.toArray(new Integer[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/type/Table.java`
#### Snippet
```java
        }
      }
      this.columnsToOrder = columnsToOrderList.toArray(new Order[0]);
    } else {
      this.columnsToOrder = null;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/type/Table.java`
#### Snippet
```java
        }
      }
      this.columnsToCheck = columnsToCheckList.toArray(new String[0]);
    } else {
      this.columnsToCheck = null;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/type/Table.java`
#### Snippet
```java
        }
      }
      this.columnsToExclude = columnsToExcludeList.toArray(new String[0]);
    } else {
      this.columnsToExclude = null;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/type/Changes.java`
#### Snippet
```java
            .setRequest(request.getRequest())
            .setParameters(request.getParameters())
            .setPksName(request.getPksNameList().toArray(new String[0]));
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnPrimaryKey.java`
#### Snippet
```java
      String pk = pksIterator.next();
      if (!primaryKeyLetterCase.isEqual(name, pk)) {
        String[] pksNames = pksNameList.toArray(new String[0]);
        throw failures.failure(info, shouldHavePksNames(pksNames, names));
      }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnPrimaryKey.java`
#### Snippet
```java
    }
    if (namesIterator.hasNext() || pksIterator.hasNext()) {
      String[] pksNames = pksNameList.toArray(new String[0]);
      throw failures.failure(info, shouldHavePksNames(pksNames, names));
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnPrimaryKey.java`
#### Snippet
```java
    // Create a array from the primary keys columns
    List<Value> pksValueList = change.getPksValueList();
    Value[] pksValues = pksValueList.toArray(new Value[0]);

    // If the length of the values is different than the length of the expected values
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/navigation/PositionWithChanges.java`
#### Snippet
```java
    for (Change change : changesList) {
      List<Value> pksValueList = change.getPksValueList();
      Value[] values = pksValueList.toArray(new Value[0]);
      boolean equal = false;
      if (pksValues.length == values.length) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/output/impl/HtmlOutput.java`
#### Snippet
```java
    List<String> columnsNameList = table.getColumnsNameList();
    List<Row> rowsList = table.getRowsList();
    Row[] rows = rowsList.toArray(new Row[0]);

    List<String> typesList = OutputType.getTypesList(rows);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/output/impl/HtmlOutput.java`
#### Snippet
```java
    String columnName = column.getName();
    List<Value> valuesList = column.getValuesList();
    Value[] values = valuesList.toArray(new Value[0]);
    String type = OutputType.getType(values);

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/output/impl/HtmlOutput.java`
#### Snippet
```java
    List<String> columnsNameList = request.getColumnsNameList();
    List<Row> rowsList = request.getRowsList();
    Row[] rows = rowsList.toArray(new Row[0]);

    List<String> typesList = OutputType.getTypesList(rows);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/output/impl/OutputType.java`
#### Snippet
```java
          }
        }
        String type = OutputType.getType(valuesList.toArray(new Value[0]));
        typesList.add(type);
      }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/output/impl/OutputType.java`
#### Snippet
```java
      stringBuildersList.add(pksValueStringBuilder);
    }
    return stringBuildersList.toArray(new StringBuilder[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/output/impl/OutputType.java`
#### Snippet
```java
      stringBuildersList.add(pksValueStringBuilder);
    }
    return stringBuildersList.toArray(new StringBuilder[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/type/Row.java`
#### Snippet
```java
      }
    }
    return pksValuesList.toArray(new Value[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
    List<String> columnsNameList = table.getColumnsNameList();
    List<Row> rowsList = table.getRowsList();
    Row[] rows = rowsList.toArray(new Row[0]);

    List<String> typesList = OutputType.getTypesList(rows);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
        }
      }
      String type = OutputType.getType(valuesList.toArray(new Value[0]));
      int columnSize = getColumnSize(columnName, type, index, valuesList.toArray(new Value[0]));
      columnSizesList.add(columnSize);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
      }
      String type = OutputType.getType(valuesList.toArray(new Value[0]));
      int columnSize = getColumnSize(columnName, type, index, valuesList.toArray(new Value[0]));
      columnSizesList.add(columnSize);
      index++;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
    String columnName = column.getName();
    List<Value> valuesList = column.getValuesList();
    Value[] values = valuesList.toArray(new Value[0]);
    int indexColumnSize = getIndexColumnSize(values.length);
    String type = OutputType.getType(values);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
  public String getChangesOutput(WritableAssertionInfo info, Changes changes) {
    List<Change> changesList = changes.getChangesList();
    Change[] changesArray = changesList.toArray(new Change[0]);
    int indexColumnSize = getIndexColumnSize(changesList.size());
    int changeTypeColumnSize = getChangeTypeColumnSize(changesArray);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
    List<String> columnsNameList = request.getColumnsNameList();
    List<Row> rowsList = request.getRowsList();
    Row[] rows = rowsList.toArray(new Row[0]);

    List<String> typesList = OutputType.getTypesList(rows);
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
    } else {
      try {
        bd = new BigDecimal("" + object);
      } catch (NumberFormatException e) {
        throw new AssertJDBException("Expected <%s> can not be compared to a BigDecimal (<%s>)", expected, object);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
    }

    BigDecimal bigTolerance = new BigDecimal("" + tolerance);
    BigDecimal bigMin = expected.subtract(bigTolerance);
    BigDecimal bigMax = expected.add(bigTolerance);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
   */
  private static boolean isBigDecimalCloseToNumber(BigDecimal nb, Number expected, Number tolerance) {
    BigDecimal bigExpected = new BigDecimal("" + expected);
    BigDecimal bigTolerance = new BigDecimal("" + tolerance);
    BigDecimal bigMin = bigExpected.subtract(bigTolerance);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
  private static boolean isBigDecimalCloseToNumber(BigDecimal nb, Number expected, Number tolerance) {
    BigDecimal bigExpected = new BigDecimal("" + expected);
    BigDecimal bigTolerance = new BigDecimal("" + tolerance);
    BigDecimal bigMin = bigExpected.subtract(bigTolerance);
    BigDecimal bigMax = bigExpected.add(bigTolerance);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
        }
      } else if (number instanceof BigInteger) {
        BigInteger bi = new BigInteger("" + expected);
        if (((BigInteger) number).compareTo(bi) == 0) {
          return true;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
        }
      } else if (number instanceof BigDecimal) {
        BigDecimal bd = new BigDecimal("" + expected);
        if (((BigDecimal) number).compareTo(bd) == 0) {
          return true;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
   */
  private static boolean isBigIntegerCloseToNumber(BigInteger nb, Number expected, Number tolerance) {
    BigInteger bigExpected = new BigInteger("" + expected);
    BigInteger bigTolerance = new BigInteger("" + tolerance);
    BigInteger bigMin = bigExpected.subtract(bigTolerance);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
  private static boolean isBigIntegerCloseToNumber(BigInteger nb, Number expected, Number tolerance) {
    BigInteger bigExpected = new BigInteger("" + expected);
    BigInteger bigTolerance = new BigInteger("" + tolerance);
    BigInteger bigMin = bigExpected.subtract(bigTolerance);
    BigInteger bigMax = bigExpected.add(bigTolerance);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
    } else {
      try {
        bi = new BigInteger("" + object);
      } catch (NumberFormatException e) {
        throw new AssertJDBException("Expected <%s> can not be compared to a BigInteger (<%s>)", expected, object);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
    }

    BigInteger bigTolerance = new BigInteger("" + tolerance);
    BigInteger bigMin = expected.subtract(bigTolerance);
    BigInteger bigMax = expected.add(bigTolerance);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
      } else {
        try {
          bi = new BigInteger("" + object);
        } catch (NumberFormatException e) {
          throw new AssertJDBException("Expected <%s> can not be compared to a BigInteger (<%s>)", expected, object);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
      } else {
        try {
          bd = new BigDecimal("" + object);
        } catch (NumberFormatException e) {
          throw new AssertJDBException("Expected <%s> can not be compared to a BigDecimal (<%s>)", expected, object);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
        }
      } else if (object instanceof BigInteger) {
        BigInteger bi = new BigInteger("" + expected);
        if (((BigInteger) object).compareTo(bi) == 0) {
          return true;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
        }
      } else if (object instanceof BigDecimal) {
        BigDecimal bd = new BigDecimal("" + expected);
        if (((BigDecimal) object).compareTo(bd) == 0) {
          return true;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
      } else {
        try {
          bi = new BigInteger("" + object);
        } catch (NumberFormatException e) {
          throw new AssertJDBException("Expected <%s> can not be compared to a BigInteger (<%s>)", expected, object);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
      } else {
        try {
          bd = new BigDecimal("" + object);
        } catch (NumberFormatException e) {
          throw new AssertJDBException("Expected <%s> can not be compared to a BigDecimal (<%s>)", expected, object);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
        return Double.compare(d, expectedD);
      } else if (object instanceof BigInteger) {
        BigInteger bi = new BigInteger("" + expected);
        return ((BigInteger) object).compareTo(bi);
      } else if (object instanceof BigDecimal) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/util/Values.java`
#### Snippet
```java
        return ((BigInteger) object).compareTo(bi);
      } else if (object instanceof BigDecimal) {
        BigDecimal bd = new BigDecimal("" + expected);
        return ((BigDecimal) object).compareTo(bd);
      } else if (object instanceof Byte) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/OutputType.java`
#### Snippet
```java
    }
    if (type == ValueType.DATE_TIME) {
      return "" + DateTimeValue.from((Timestamp) object);
    }
    if (type == ValueType.DATE) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/OutputType.java`
#### Snippet
```java
    }
    if (type == ValueType.DATE) {
      return "" + DateValue.from((Date) object);
    }
    if (type == ValueType.TIME) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/OutputType.java`
#### Snippet
```java
    }
    if (type == ValueType.TIME) {
      return "" + TimeValue.from((Time) object);
    } else {
      return "" + object;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/OutputType.java`
#### Snippet
```java
      return "" + TimeValue.from((Time) object);
    } else {
      return "" + object;
    }
  }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
   */
  private static String getText(Object object) {
    return "" + object;
  }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
      DataType dataType = change.getDataType();
      String dataName = OutputType.getDataName(change);
      int dataTypeColumnSize = getColumnSize("" + dataType, dataName);
      if (size < dataTypeColumnSize) {
        size = dataTypeColumnSize;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java

    int changeTypeColumnSize = getColumnSize("TYPE", changeType);
    int dataTypeColumnSize = getColumnSize("" + dataType, dataName);
    int primaryKeyColumnSize = getColumnSize("PRIMARY", pksValueStringBuilders);
    List<Integer> sizesList = getSizesList(getColumnSizesList(rowAtStartPoint, rowAtEndPoint),
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
           // Column name
           + getCompleteColumnName(sizesList, columnsNameList,
                                                   "TYPE", "" + dataType, "PRIMARY", "")
           // Type
           + getCompleteType(sizesList, typesList,
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
   */
  private static int getColumnSize(String columnName, Object... objects) {
    int size = ("" + columnName).length();
    for (Object object : objects) {
      int valueSize = getText(object).length();
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
    for (Integer size : sizesList) {
      if (index < otherColumnsContent.length) {
        stringBuilder.append(getFilledText("" + otherColumnsContent[index], size));
        stringBuilder.append("|");
      }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
    for (int size : sizesList) {
      if (index < otherColumnsContent.length) {
        stringBuilder.append(getFilledText("" + otherColumnsContent[index], size));
      } else {
        stringBuilder.append(getCellLine(size));
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
   */
  private static int getColumnSize(String columnName, String type, Integer index, Value... values) {
    int size = ("" + columnName).length();
    int typeSize = type.length();
    if (typeSize > size) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
      // Column name
      stringBuilder.append(getCompleteColumnName(sizesList, columnsNameList,
                                                 "", "TYPE", "" + dataType, "PRIMARY", ""));
      // Type
      stringBuilder.append(getCompleteType(sizesList, typesList,
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `pksValueStringBuilders`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
    int indexColumnSize = getIndexColumnSize(rows.length);
    StringBuilder[] pksValueStringBuilders = OutputType.getPksValueStringBuilder(rows);
    int primaryKeyColumnSize = getColumnSize("PRIMARY", pksValueStringBuilders);
    List<Integer> sizesList = getSizesList(rows.length == 0 ? getColumnSizesList(columnsNameList) : getColumnSizesList(rows),
                                           indexColumnSize,
```

### NullArgumentToVariableArgMethod
Confusing argument `pksValueStringBuilders`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
    int changeTypeColumnSize = getColumnSize("TYPE", changeType);
    int dataTypeColumnSize = getColumnSize("" + dataType, dataName);
    int primaryKeyColumnSize = getColumnSize("PRIMARY", pksValueStringBuilders);
    List<Integer> sizesList = getSizesList(getColumnSizesList(rowAtStartPoint, rowAtEndPoint),
                                           changeTypeColumnSize,
```

### NullArgumentToVariableArgMethod
Confusing argument `pksValueStringBuilders`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
    List<String> typesList = OutputType.getTypesList(row);
    StringBuilder[] pksValueStringBuilders = OutputType.getPksValueStringBuilder(row);
    int primaryKeyColumnSize = getColumnSize("PRIMARY", pksValueStringBuilders);
    List<Integer> sizesList = getSizesList(getColumnSizesList(row),
                                           primaryKeyColumnSize);
```

### NullArgumentToVariableArgMethod
Confusing argument `pksValueStringBuilders`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
    int dataTypeColumnSize = getDataTypeColumnSize(changesArray);
    StringBuilder[] pksValueStringBuilders = OutputType.getPksValueStringBuilder(changesArray);
    int primaryKeyColumnSize = getColumnSize("PRIMARY", pksValueStringBuilders);

    StringBuilder stringBuilder = new StringBuilder();
```

### NullArgumentToVariableArgMethod
Confusing argument `pksValueStringBuilders`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/assertj/db/output/impl/PlainOutput.java`
#### Snippet
```java
    int indexColumnSize = getIndexColumnSize(rows.length);
    StringBuilder[] pksValueStringBuilders = OutputType.getPksValueStringBuilder(rows);
    int primaryKeyColumnSize = getColumnSize("PRIMARY", pksValueStringBuilders);
    List<Integer> sizesList = getSizesList(rows.length == 0 ? getColumnSizesList(columnsNameList) : getColumnSizesList(rows),
                                           indexColumnSize,
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends D`
in `src/main/java/org/assertj/db/navigation/Position.java`
#### Snippet
```java
   * @throws AssertJDBException If the {@code index} is out of the bounds.
   */
  protected D getDbElement(List<D> dbElementsList, int index) {
    int size = dbElementsList.size();
    if (index < 0 || index >= size) {
```

### BoundedWildcard
Can generalize to `? extends Value`
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnColumnType.java`
#### Snippet
```java
   */
  public static <A extends AbstractAssert<?>> A isOfAnyTypeIn(A assertion, WritableAssertionInfo info,
                                                           List<Value> valuesList, ValueType... expected) {
    int index = 0;
    loop:
```

### BoundedWildcard
Can generalize to `? extends D`
in `src/main/java/org/assertj/db/type/AbstractDbElement.java`
#### Snippet
```java
   * @param selfType Class of this element : a sub-class of {@code AbstractDbElement}.
   */
  AbstractDbElement(Class<D> selfType) {
    myself = selfType.cast(this);
    setLetterCases();
```

### BoundedWildcard
Can generalize to `? extends Value`
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnValuesNullity.java`
#### Snippet
```java
   */
  public static <A extends AbstractAssert<?>> A hasOnlyNotNullValues(A assertion, WritableAssertionInfo info,
                                                                  List<Value> valuesList) {
    int index = 0;
    for (Value value : valuesList) {
```

### BoundedWildcard
Can generalize to `? extends Value`
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnValuesNullity.java`
#### Snippet
```java
   */
  public static <A extends AbstractAssert<?>> A hasOnlyNullValues(A assertion, WritableAssertionInfo info,
                                                               List<Value> valuesList) {
    int index = 0;
    for (Value value : valuesList) {
```

### BoundedWildcard
Can generalize to `? extends Value`
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnColumnClass.java`
#### Snippet
```java
   * @since 1.1.0
   */
  public static <A extends AbstractAssert<?>> A isOfClass(A assertion, WritableAssertionInfo info, List<Value> valuesList,
                                                          Class<?> expected, boolean lenient) {

```

### BoundedWildcard
Can generalize to `? extends Value`
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnRowEquality.java`
#### Snippet
```java
   */
  public static <A extends AbstractAssert<?>> A hasValues(A assertion, WritableAssertionInfo info,
                                                       List<Value> valuesList, Object... expected) {
    AssertionsOnNumberOfColumns.hasNumberOfColumns(assertion, info, valuesList.size(), expected.length);
    int index = 0;
```

### BoundedWildcard
Can generalize to `? extends Value`
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnColumnContent.java`
#### Snippet
```java
   */
  public static <A extends AbstractAssert<?>> A containsValues(A assertion, WritableAssertionInfo info,
                                                       List<Value> valuesList, Object... expected) {
    AssertionsOnNumberOfRows.hasNumberOfRows(assertion, info, valuesList.size(), expected.length);
    List<Value> list = new ArrayList<>(valuesList);
```

### BoundedWildcard
Can generalize to `? extends Value`
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnRowCondition.java`
#### Snippet
```java

  public static <A extends AbstractAssert<?>> A hasValuesSatisfying(A assertion, WritableAssertionInfo info,
                                                                    List<Value> valuesList, Object... expected) {

    if (valuesList.size() != expected.length) {
```

### BoundedWildcard
Can generalize to `? extends Value`
in `src/main/java/org/assertj/db/api/assertions/impl/AssertionsOnColumnEquality.java`
#### Snippet
```java
   */
  public static <A extends AbstractAssert<?>> A hasValues(A assertion, WritableAssertionInfo info,
                                                       List<Value> valuesList, Object... expected) {
    AssertionsOnNumberOfRows.hasNumberOfRows(assertion, info, valuesList.size(), expected.length);
    int index = 0;
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `expected` is always 'null'
in `src/main/java/org/assertj/db/error/ShouldBeCompatible.java`
#### Snippet
```java
  public static ErrorMessageFactory shouldBeCompatible(Value actual, Object expected) {
    if (expected == null) {
      return new ShouldBeCompatible(actual, expected);
    }
    return new ShouldBeCompatible(actual, expected.getClass(), expected);
```

