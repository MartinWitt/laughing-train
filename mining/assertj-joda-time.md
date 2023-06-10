# assertj-joda-time 
 
# Bad smells
I found 17 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 10 | false |
| InfiniteRecursion | 4 | false |
| JavadocDeclaration | 2 | false |
| DuplicatedCode | 1 | false |
## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/javadoc/assertj-javadoc.css`
#### Snippet
```java
    background-color:#4D7A97;
    color:#FFFFFF;
    float:left;
    padding:0;
    width:100%;
    clear:right;
    height:2.8em;
    padding-top:10px;
    overflow:hidden;
    font-size:12px; 
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `a`
in `src/main/java/org/assertj/jodatime/api/LocalDateTimeAssert.java`
#### Snippet
```java
   *
   * @param other the {@link LocalDateTime} to check
   * @throws a {@link IllegalArgumentException} with an explicit message if the given {@link LocalDateTime} is null
   */
  private static void assertLocalDateTimeParameterIsNotNull(LocalDateTime other) {
```

### JavadocReference
Cannot resolve symbol `isEqualTo(Object)`
in `src/main/java/org/assertj/jodatime/api/LocalDateTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isEqualTo(Object)} (where Object is expected to be {@link LocalDateTime}) but here you
   * pass {@link LocalDateTime} String representation that must follow <a href=
   * "http://joda-time.sourceforge.net/api-release/org/joda/time/format/ISODateTimeFormat.html#localDateOptionalTimeParser()"
```

### JavadocReference
Cannot resolve symbol `isNotEqualTo(Object)`
in `src/main/java/org/assertj/jodatime/api/LocalDateTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isNotEqualTo(Object)} (where Object is expected to be {@link LocalDateTime}) but here you
   * pass {@link LocalDateTime} String representation that must follow <a href=
   * "http://joda-time.sourceforge.net/api-release/org/joda/time/format/ISODateTimeFormat.html#localDateOptionalTimeParser()"
```

### JavadocReference
Cannot resolve symbol `a`
in `src/main/java/org/assertj/jodatime/api/LocalDateTimeAssert.java`
#### Snippet
```java
   *
   * @param localDateTimeAsString String representing the {@link LocalDateTime} to compare actual with
   * @throws a {@link IllegalArgumentException} with an explicit message if the given {@link String} is null
   */
  private static void assertLocalDateTimeAsStringParameterIsNotNull(String localDateTimeAsString) {
```

### JavadocReference
Cannot resolve symbol `isIn(Object...)`
in `src/main/java/org/assertj/jodatime/api/LocalDateTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isIn(Object...)} (where Objects are expected to be {@link LocalDateTime}) but here you
   * pass {@link LocalDateTime} String representations that must follow <a href=
   * "http://joda-time.sourceforge.net/api-release/org/joda/time/format/ISODateTimeFormat.html#localDateOptionalTimeParser()"
```

### JavadocReference
Cannot resolve symbol `isNotIn(Object...)`
in `src/main/java/org/assertj/jodatime/api/LocalDateTimeAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isNotIn(Object...)} (where Objects are expected to be {@link LocalDateTime}) but here you
   * pass {@link LocalDateTime} String representations that must follow <a href=
   * "http://joda-time.sourceforge.net/api-release/org/joda/time/format/ISODateTimeFormat.html#localDateOptionalTimeParser()"
```

### JavadocReference
Cannot resolve symbol `isNotIn(Object...)`
in `src/main/java/org/assertj/jodatime/api/LocalDateAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isNotIn(Object...)} (where Objects are expected to be {@link LocalDate}) but here you
   * pass {@link LocalDate} String representations that must follow ISO8601 format (yyyy-MM-dd)
   * to allow calling {@link LocalDate#LocalDate(Object) LocalDate(Object)} constructor.
```

### JavadocReference
Cannot resolve symbol `isIn(Object...)`
in `src/main/java/org/assertj/jodatime/api/LocalDateAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isIn(Object...)} (where Objects are expected to be {@link LocalDate}) but here you
   * pass {@link LocalDate} String representations that must followISO8601 format (yyyy-MM-dd) to allow calling
   * {@link LocalDate#LocalDate(Object) LocalDate(Object)} constructor.
```

### JavadocReference
Cannot resolve symbol `isEqualTo(Object)`
in `src/main/java/org/assertj/jodatime/api/LocalDateAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isEqualTo(Object)} (where Object is expected to be {@link LocalDate}) but here you
   * pass {@link LocalDate} String representation that must follow ISO8601 format (yyyy-MM-dd)
   * to allow calling {@link LocalDate#LocalDate(Object) LocalDate(Object)} constructor.
```

### JavadocReference
Cannot resolve symbol `isNotEqualTo(Object)`
in `src/main/java/org/assertj/jodatime/api/LocalDateAssert.java`
#### Snippet
```java

  /**
   * Same assertion as {@link #isNotEqualTo(Object)} (where Object is expected to be {@link LocalDate}) but here you
   * pass {@link LocalDate} String representation that must follow ISO8601 format (yyyy-MM-dd) to
   * allow calling {@link LocalDate#LocalDate(Object) LocalDate(Object)} constructor.
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Class reference expected
in `src/main/java/org/assertj/jodatime/api/DateTimeAssert.java`
#### Snippet
```java
   * 
   * @param dateTime the {@link DateTime} to check
   * @throws {@link IllegalArgumentException} with an explicit message if the given {@link DateTime} is null
   */
  private static void assertDateTimeParameterIsNotNull(DateTime dateTime) {
```

### JavadocDeclaration
Class reference expected
in `src/main/java/org/assertj/jodatime/api/DateTimeAssert.java`
#### Snippet
```java
   * 
   * @param dateTimeAsString String representing the DateTime to compare actual with
   * @throws {@link IllegalArgumentException} with an explicit message if the given {@link String} is null
   */
  private static void assertDateTimeAsStringParameterIsNotNull(String dateTimeAsString) {
```

## RuleId[id=InfiniteRecursion]
### InfiniteRecursion
Method `isEqualTo()` recurses infinitely, and can only end by throwing an exception
in `src/main/java/org/assertj/jodatime/api/LocalDateTimeAssert.java`
#### Snippet
```java
   *           given String.
   */
  public LocalDateTimeAssert isEqualTo(String dateTimeAsString) {
    assertLocalDateTimeAsStringParameterIsNotNull(dateTimeAsString);
    return isEqualTo(new LocalDateTime(dateTimeAsString));
```

### InfiniteRecursion
Method `isNotEqualTo()` recurses infinitely, and can only end by throwing an exception
in `src/main/java/org/assertj/jodatime/api/LocalDateTimeAssert.java`
#### Snippet
```java
   *           String.
   */
  public LocalDateTimeAssert isNotEqualTo(String dateTimeAsString) {
    assertLocalDateTimeAsStringParameterIsNotNull(dateTimeAsString);
    return isNotEqualTo(new LocalDateTime(dateTimeAsString));
```

### InfiniteRecursion
Method `isEqualTo()` recurses infinitely, and can only end by throwing an exception
in `src/main/java/org/assertj/jodatime/api/LocalDateAssert.java`
#### Snippet
```java
   *           given String.
   */
  public LocalDateAssert isEqualTo(String localDateString) {
    assertLocalDateAsStringParameterIsNotNull(localDateString);
    return isEqualTo(new LocalDate(localDateString));
```

### InfiniteRecursion
Method `isNotEqualTo()` recurses infinitely, and can only end by throwing an exception
in `src/main/java/org/assertj/jodatime/api/LocalDateAssert.java`
#### Snippet
```java
   *           String.
   */
  public LocalDateAssert isNotEqualTo(String localDateAsString) {
    assertLocalDateAsStringParameterIsNotNull(localDateAsString);
    return isNotEqualTo(new LocalDate(localDateAsString));
```

