# assertj-joda-time 
 
# Bad smells
I found 37 bad smells with 37 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 37 | true |
## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/datetime/DateTimeAssert_isAfter_Test.java`
#### Snippet
```java
other.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/datetime/DateTimeAssert_isBefore_Test.java`
#### Snippet
```java
other.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/datetime/DateTimeAssert_isEqualTo_errors_Test.java`
#### Snippet
```java
other.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/datetime/DateTimeAssert_isEqualTo_errors_Test.java`
#### Snippet
```java
reference.plus(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/datetime/DateTimeAssert_isIn_errors_Test.java`
#### Snippet
```java
referenceDate.plus(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/datetime/DateTimeAssert_isIn_errors_Test.java`
#### Snippet
```java
reference.plus(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/datetime/DateTimeAssert_isIn_errors_Test.java`
#### Snippet
```java
reference.plus(2).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/datetime/DateTimeAssert_isNotEqualTo_Test.java`
#### Snippet
```java
DateTime.now().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/datetime/DateTimeAssert_isNotEqualTo_errors_Test.java`
#### Snippet
```java
referenceDate.plus(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/datetime/DateTimeAssert_isNotEqualTo_errors_Test.java`
#### Snippet
```java
now().toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/datetime/DateTimeAssert_isNotIn_errors_Test.java`
#### Snippet
```java
referenceDate.plus(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/datetime/DateTimeAssert_isNotIn_errors_Test.java`
#### Snippet
```java
referenceDate.plus(2).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/datetime/DateTimeAssert_isNotIn_errors_Test.java`
#### Snippet
```java
reference.plus(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdate/LocalDateAssert_isAfterOrEqualTo_Test.java`
#### Snippet
```java
reference.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdate/LocalDateAssert_isAfter_Test.java`
#### Snippet
```java
other.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdate/LocalDateAssert_isAfter_Test.java`
#### Snippet
```java
reference.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdate/LocalDateAssert_isBeforeOrEqualTo_Test.java`
#### Snippet
```java
reference.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdate/LocalDateAssert_isBefore_Test.java`
#### Snippet
```java
other.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdate/LocalDateAssert_isBefore_Test.java`
#### Snippet
```java
reference.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdate/LocalDateAssert_isEqualTo_Test.java`
#### Snippet
```java
reference.plusDays(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdate/LocalDateAssert_isIn_Test.java`
#### Snippet
```java
referenceDate.plusDays(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdate/LocalDateAssert_isIn_Test.java`
#### Snippet
```java
reference.plusDays(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdate/LocalDateAssert_isIn_Test.java`
#### Snippet
```java
reference.plusDays(2).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdate/LocalDateAssert_isNotEqualTo_Test.java`
#### Snippet
```java
referenceDate.plusDays(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdate/LocalDateAssert_isNotEqualTo_Test.java`
#### Snippet
```java
reference.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdate/LocalDateAssert_isNotIn_Test.java`
#### Snippet
```java
referenceDate.plusDays(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdate/LocalDateAssert_isNotIn_Test.java`
#### Snippet
```java
referenceDate.plusDays(2).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdate/LocalDateAssert_isNotIn_Test.java`
#### Snippet
```java
reference.toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdate/LocalDateAssert_isNotIn_Test.java`
#### Snippet
```java
reference.plusDays(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdatetime/LocalDateTimeAssert_isEqualTo_Test.java`
#### Snippet
```java
reference.plusDays(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdatetime/LocalDateTimeAssert_isIn_Test.java`
#### Snippet
```java
referenceDate.plusDays(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdatetime/LocalDateTimeAssert_isIn_Test.java`
#### Snippet
```java
reference.plusDays(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdatetime/LocalDateTimeAssert_isIn_Test.java`
#### Snippet
```java
reference.plusDays(2).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdatetime/LocalDateTimeAssert_isNotEqualTo_Test.java`
#### Snippet
```java
referenceDate.plusDays(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdatetime/LocalDateTimeAssert_isNotIn_Test.java`
#### Snippet
```java
referenceDate.plusDays(1).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdatetime/LocalDateTimeAssert_isNotIn_Test.java`
#### Snippet
```java
referenceDate.plusDays(2).toString()
```

### UnnecessaryToStringCall
The `toString()` method is not needed in cases the underlying method handles the conversion. Also calling toString() on a String is redundant. Removing them simplifies the code.
in `/tmp/laughing-train-assertj-joda-time-892662103766073360614207014595371283888/src/test/java/org/assertj/jodatime/api/localdatetime/LocalDateTimeAssert_isNotIn_Test.java`
#### Snippet
```java
reference.plusDays(1).toString()
```

