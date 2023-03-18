# assertj-joda-time 
 
# Bad smells
I found 23 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| MethodOverloadsParentMethod | 16 | false |
| UnnecessaryFullyQualifiedName | 3 | false |
| UnnecessarySuperQualifier | 2 | false |
| HtmlWrongAttributeValue | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-18-05-35-00.882.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Assertions` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/assertj/jodatime/api/Assertions.java`
#### Snippet
```java
 * @author Paweł Stawicki
 */
public class Assertions {

  public static DateTimeAssert assertThat(DateTime date) {
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/assertj/jodatime/api/DateTimeAssert.java`
#### Snippet
```java
  public DateTimeAssert isNotIn(DateTime... expected) {
    checkIsNotNullAndNotEmpty(expected);
    return super.isNotIn((Object[]) changeToActualTimeZone(expected));
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/assertj/jodatime/api/DateTimeAssert.java`
#### Snippet
```java
  public DateTimeAssert isIn(DateTime... expected) {
    checkIsNotNullAndNotEmpty(expected);
    return super.isIn((Object[]) changeToActualTimeZone(expected));
  }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.joda.time` is unnecessary and can be removed
in `src/main/java/org/assertj/jodatime/api/DateTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isNotIn(org.joda.time.DateTime...)} but the {@link DateTime} is built from given String,
   * which must follow <a
   * href="http://joda-time.sourceforge.net/api-release/org/joda/time/format/ISODateTimeFormat.html#dateTimeParser()"
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.jodatime.api` is unnecessary and can be removed
in `src/main/java/org/assertj/jodatime/api/DateTimeAssert.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.jodatime.api.DateTimeAssert}</code>.
   * 
   * @param selfType the "self type"
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.jodatime.api` is unnecessary and can be removed
in `src/main/java/org/assertj/jodatime/api/LocalDateTimeAssert.java`
#### Snippet
```java

  /**
   * Creates a new <code>{@link org.assertj.jodatime.api.LocalDateTimeAssert}</code>.
   *
   * @param selfType the "self type"
```

## RuleId[id=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `isNotIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/assertj/jodatime/api/LocalDateAssert.java`
#### Snippet
```java
   *           Strings.
   */
  public LocalDateAssert isNotIn(String... localDatesAsString) {
    checkIsNotNullAndNotEmpty(localDatesAsString);
    return isNotIn(convertToLocalDateArray(localDatesAsString));
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/assertj/jodatime/api/LocalDateTimeAssert.java`
#### Snippet
```java
   *           given String.
   */
  public LocalDateTimeAssert isEqualTo(String dateTimeAsString) {
    assertLocalDateTimeAsStringParameterIsNotNull(dateTimeAsString);
    return isEqualTo(new LocalDateTime(dateTimeAsString));
```

### MethodOverloadsParentMethod
Method `isNotEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/assertj/jodatime/api/LocalDateAssert.java`
#### Snippet
```java
   *           String.
   */
  public LocalDateAssert isNotEqualTo(String localDateAsString) {
    assertLocalDateAsStringParameterIsNotNull(localDateAsString);
    return isNotEqualTo(new LocalDate(localDateAsString));
```

### MethodOverloadsParentMethod
Method `isIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/assertj/jodatime/api/DateTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code DateTime} is not in the {@link DateTime}s built from given Strings.
   */
  public DateTimeAssert isIn(String... dateTimesAsString) {
    checkIsNotNullAndNotEmpty(dateTimesAsString);
    return isIn(convertToDateTimeArray(dateTimesAsString));
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/assertj/jodatime/api/LocalDateAssert.java`
#### Snippet
```java
   *           given String.
   */
  public LocalDateAssert isEqualTo(String localDateString) {
    assertLocalDateAsStringParameterIsNotNull(localDateString);
    return isEqualTo(new LocalDate(localDateString));
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/assertj/jodatime/api/DateTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code DateTime} is not equal to the {@link DateTime} built from given String.
   */
  public DateTimeAssert isEqualTo(String dateTimeAsString) {
    assertDateTimeAsStringParameterIsNotNull(dateTimeAsString);
    return isEqualTo(new DateTime(dateTimeAsString));
```

### MethodOverloadsParentMethod
Method `isNotIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/assertj/jodatime/api/DateTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code DateTime} is not equal to the {@link DateTime} built from given String.
   */
  public DateTimeAssert isNotIn(String... dateTimesAsString) {
    checkIsNotNullAndNotEmpty(dateTimesAsString);
    return isNotIn(convertToDateTimeArray(dateTimesAsString));
```

### MethodOverloadsParentMethod
Method `isIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/assertj/jodatime/api/LocalDateAssert.java`
#### Snippet
```java
   *           Strings.
   */
  public LocalDateAssert isIn(String... localDatesAsString) {
    checkIsNotNullAndNotEmpty(localDatesAsString);
    return isIn(convertToLocalDateArray(localDatesAsString));
```

### MethodOverloadsParentMethod
Method `isNotIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/assertj/jodatime/api/DateTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code DateTime} is not in the given {@link DateTime}s.
   */
  public DateTimeAssert isNotIn(DateTime... expected) {
    checkIsNotNullAndNotEmpty(expected);
    return super.isNotIn((Object[]) changeToActualTimeZone(expected));
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/assertj/jodatime/api/DateTimeAssert.java`
#### Snippet
```java
   *           DateTimeZone.
   */
  public DateTimeAssert isEqualTo(DateTime expected) {
    if (actual == expected) return this;
    isNotNull();
```

### MethodOverloadsParentMethod
Method `isNotEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/assertj/jodatime/api/DateTimeAssert.java`
#### Snippet
```java
   *           DateTimeZone.
   */
  public DateTimeAssert isNotEqualTo(DateTime expected) {
    // if actual is null, we don't really care about DateTimeZone
    DateTime other = actual == null ? expected : new DateTime(expected, actual.getZone());
```

### MethodOverloadsParentMethod
Method `isNotEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/assertj/jodatime/api/LocalDateTimeAssert.java`
#### Snippet
```java
   *           String.
   */
  public LocalDateTimeAssert isNotEqualTo(String dateTimeAsString) {
    assertLocalDateTimeAsStringParameterIsNotNull(dateTimeAsString);
    return isNotEqualTo(new LocalDateTime(dateTimeAsString));
```

### MethodOverloadsParentMethod
Method `isNotIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/assertj/jodatime/api/LocalDateTimeAssert.java`
#### Snippet
```java
   *           Strings.
   */
  public LocalDateTimeAssert isNotIn(String... dateTimesAsString) {
    checkIsNotNullAndNotEmpty(dateTimesAsString);
    return isNotIn(convertToLocalDateTimeArray(dateTimesAsString));
```

### MethodOverloadsParentMethod
Method `isIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/assertj/jodatime/api/LocalDateTimeAssert.java`
#### Snippet
```java
   *           Strings.
   */
  public LocalDateTimeAssert isIn(String... dateTimesAsString) {
    checkIsNotNullAndNotEmpty(dateTimesAsString);
    return isIn(convertToLocalDateTimeArray(dateTimesAsString));
```

### MethodOverloadsParentMethod
Method `isNotEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/assertj/jodatime/api/DateTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code DateTime} is equal to the {@link DateTime} built from given String.
   */
  public DateTimeAssert isNotEqualTo(String dateTimeAsString) {
    assertDateTimeAsStringParameterIsNotNull(dateTimeAsString);
    return isNotEqualTo(new DateTime(dateTimeAsString));
```

### MethodOverloadsParentMethod
Method `isIn()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/assertj/jodatime/api/DateTimeAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual {@code DateTime} is not in the given {@link DateTime}s.
   */
  public DateTimeAssert isIn(DateTime... expected) {
    checkIsNotNullAndNotEmpty(expected);
    return super.isIn((Object[]) changeToActualTimeZone(expected));
```

