# commons-lang 
 
# Bad smells
I found 507 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryUnicodeEscape | 250 | false |
| UNCHECKED_WARNING | 41 | false |
| DeprecatedIsStillUsed | 24 | false |
| JavadocReference | 22 | false |
| RedundantCast | 20 | false |
| SuspiciousSystemArraycopy | 19 | false |
| NullableProblems | 19 | false |
| FinalStaticMethod | 18 | false |
| DuplicatedCode | 14 | false |
| ConstantValue | 12 | false |
| Deprecation | 11 | false |
| StaticInitializerReferencesSubClass | 10 | false |
| StringEquality | 5 | false |
| JavadocLinkAsPlainText | 5 | false |
| UnnecessaryToStringCall | 4 | true |
| NullArgumentToVariableArgMethod | 4 | false |
| CommentedOutCode | 3 | false |
| MagicConstant | 2 | false |
| DataFlowIssue | 2 | false |
| RefusedBequest | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| SuspiciousMethodCalls | 2 | false |
| FunctionalExpressionCanBeFolded | 2 | false |
| JavadocDeclaration | 2 | false |
| SuspiciousNameCombination | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| DanglingJavadoc | 1 | false |
| RedundantTypeArguments | 1 | false |
| NumberEquality | 1 | false |
| SuspiciousInvocationHandlerImplementation | 1 | false |
| NegativeIntConstantInLongContext | 1 | false |
| RedundantMethodOverride | 1 | false |
| PointlessBitwiseExpression | 1 | false |
| UnnecessaryContinue | 1 | false |
| FuseStreamOperations | 1 | false |
| TypeParameterExtendsObject | 1 | false |
## RuleId[id=StringEquality]
### StringEquality
String values are compared using `==`, not 'equals()'
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
     */
    public static boolean toBoolean(final String str, final String trueString, final String falseString) {
        if (str == trueString) {
            return true;
        }
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
            return true;
        }
        if (str == falseString) {
            return false;
        }
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
        // Similar performance for null, 'false', and other strings not length 2/3/4.
        // 'true'/'TRUE' match 4 times slower, 'tRUE'/'True' 7 times slower.
        if (str == TRUE) {
            return Boolean.TRUE;
        }
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     */
    public static int compareIgnoreCase(final String str1, final String str2, final boolean nullIsLess) {
        if (str1 == str2) { // NOSONARLINT this intentionally uses == to allow for both null
            return 0;
        }
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     */
    public static int compare(final String str1, final String str2, final boolean nullIsLess) {
        if (str1 == str2) { // NOSONARLINT this intentionally uses == to allow for both null
            return 0;
        }
```

## RuleId[id=SuspiciousNameCombination]
### SuspiciousNameCombination
'y1' should probably not be assigned to 'x2'
in `src/main/java/org/apache/commons/lang3/math/Fraction.java`
#### Snippet
```java
            delta1 = delta2;
            a2 = (int) (x1 / y1);
            x2 = y1;
            y2 = x1 - a2 * y1;
            numer2 = a1 * numer1 + numer0;
```

## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: Calendar.SUNDAY, Calendar.MONDAY, Calendar.TUESDAY, Calendar.WEDNESDAY, Calendar.THURSDAY, ...
in `src/main/java/org/apache/commons/lang3/time/DateUtils.java`
#### Snippet
```java
            endCutoff -= 7;
        }
        while (start.get(Calendar.DAY_OF_WEEK) != startCutoff) {
            start.add(Calendar.DATE, -1);
        }
```

### MagicConstant
Should be one of: Calendar.SUNDAY, Calendar.MONDAY, Calendar.TUESDAY, Calendar.WEDNESDAY, Calendar.THURSDAY, ...
in `src/main/java/org/apache/commons/lang3/time/DateUtils.java`
#### Snippet
```java
            start.add(Calendar.DATE, -1);
        }
        while (end.get(Calendar.DAY_OF_WEEK) != endCutoff) {
            end.add(Calendar.DATE, 1);
        }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableIntToDoubleFunction' to 'org.apache.commons.lang3.function.FailableIntToDoubleFunction'
in `src/main/java/org/apache/commons/lang3/function/FailableIntToDoubleFunction.java`
#### Snippet
```java
     */
    static <E extends Throwable> FailableIntToDoubleFunction<E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableIntConsumer' to 'org.apache.commons.lang3.function.FailableIntConsumer'
in `src/main/java/org/apache/commons/lang3/function/FailableIntConsumer.java`
#### Snippet
```java
     */
    static <E extends Throwable> FailableIntConsumer<E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableToDoubleFunction' to 'org.apache.commons.lang3.function.FailableToDoubleFunction'
in `src/main/java/org/apache/commons/lang3/function/FailableToDoubleFunction.java`
#### Snippet
```java
     */
    static <T, E extends Throwable> FailableToDoubleFunction<T, E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableIntFunction' to 'org.apache.commons.lang3.function.FailableIntFunction'
in `src/main/java/org/apache/commons/lang3/function/FailableIntFunction.java`
#### Snippet
```java
     */
    static <R, E extends Throwable> FailableIntFunction<R, E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableBiConsumer' to 'org.apache.commons.lang3.function.FailableBiConsumer'
in `src/main/java/org/apache/commons/lang3/function/FailableBiConsumer.java`
#### Snippet
```java
     */
    static <T, U, E extends Throwable> FailableBiConsumer<T, U, E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableLongUnaryOperator' to 'org.apache.commons.lang3.function.FailableLongUnaryOperator'
in `src/main/java/org/apache/commons/lang3/function/FailableLongUnaryOperator.java`
#### Snippet
```java
     */
   static <E extends Throwable> FailableLongUnaryOperator<E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableObjDoubleConsumer' to 'org.apache.commons.lang3.function.FailableObjDoubleConsumer'
in `src/main/java/org/apache/commons/lang3/function/FailableObjDoubleConsumer.java`
#### Snippet
```java
     */
   static <T, E extends Throwable> FailableObjDoubleConsumer<T, E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableIntToLongFunction' to 'org.apache.commons.lang3.function.FailableIntToLongFunction'
in `src/main/java/org/apache/commons/lang3/function/FailableIntToLongFunction.java`
#### Snippet
```java
     */
    static <E extends Throwable> FailableIntToLongFunction<E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableToLongFunction' to 'org.apache.commons.lang3.function.FailableToLongFunction'
in `src/main/java/org/apache/commons/lang3/function/FailableToLongFunction.java`
#### Snippet
```java
     */
    static <T, E extends Throwable> FailableToLongFunction<T, E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableConsumer' to 'org.apache.commons.lang3.function.FailableConsumer'
in `src/main/java/org/apache/commons/lang3/function/FailableConsumer.java`
#### Snippet
```java
     */
    static <T, E extends Throwable> FailableConsumer<T, E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableLongConsumer' to 'org.apache.commons.lang3.function.FailableLongConsumer'
in `src/main/java/org/apache/commons/lang3/function/FailableLongConsumer.java`
#### Snippet
```java
     */
    static <E extends Throwable> FailableLongConsumer<E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableLongToIntFunction' to 'org.apache.commons.lang3.function.FailableLongToIntFunction'
in `src/main/java/org/apache/commons/lang3/function/FailableLongToIntFunction.java`
#### Snippet
```java
     */
    static <E extends Throwable> FailableLongToIntFunction<E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableToIntBiFunction' to 'org.apache.commons.lang3.function.FailableToIntBiFunction'
in `src/main/java/org/apache/commons/lang3/function/FailableToIntBiFunction.java`
#### Snippet
```java
     */
    static <T, U, E extends Throwable> FailableToIntBiFunction<T, U, E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableToDoubleBiFunction' to 'org.apache.commons.lang3.function.FailableToDoubleBiFunction'
in `src/main/java/org/apache/commons/lang3/function/FailableToDoubleBiFunction.java`
#### Snippet
```java
     */
    static <T, U, E extends Throwable> FailableToDoubleBiFunction<T, U, E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableObjLongConsumer' to 'org.apache.commons.lang3.function.FailableObjLongConsumer'
in `src/main/java/org/apache/commons/lang3/function/FailableObjLongConsumer.java`
#### Snippet
```java
     */
    static <T, E extends Throwable> FailableObjLongConsumer<T, E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableToLongBiFunction' to 'org.apache.commons.lang3.function.FailableToLongBiFunction'
in `src/main/java/org/apache/commons/lang3/function/FailableToLongBiFunction.java`
#### Snippet
```java
     */
    static <T, U, E extends Throwable> FailableToLongBiFunction<T, U, E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableDoubleUnaryOperator' to 'org.apache.commons.lang3.function.FailableDoubleUnaryOperator'
in `src/main/java/org/apache/commons/lang3/function/FailableDoubleUnaryOperator.java`
#### Snippet
```java
     */
    static <E extends Throwable> FailableDoubleUnaryOperator<E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableBiFunction' to 'org.apache.commons.lang3.function.FailableBiFunction'
in `src/main/java/org/apache/commons/lang3/function/FailableBiFunction.java`
#### Snippet
```java
     */
    static <T, U, R, E extends Throwable> FailableBiFunction<T, U, R, E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableDoubleToIntFunction' to 'org.apache.commons.lang3.function.FailableDoubleToIntFunction'
in `src/main/java/org/apache/commons/lang3/function/FailableDoubleToIntFunction.java`
#### Snippet
```java
     */
   static <E extends Throwable> FailableDoubleToIntFunction<E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableLongFunction' to 'org.apache.commons.lang3.function.FailableLongFunction'
in `src/main/java/org/apache/commons/lang3/function/FailableLongFunction.java`
#### Snippet
```java
     */
   static <R, E extends Throwable> FailableLongFunction<R, E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableDoubleToLongFunction' to 'org.apache.commons.lang3.function.FailableDoubleToLongFunction'
in `src/main/java/org/apache/commons/lang3/function/FailableDoubleToLongFunction.java`
#### Snippet
```java
     */
    static <E extends Throwable> FailableDoubleToLongFunction<E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableLongPredicate' to 'org.apache.commons.lang3.function.FailableLongPredicate'
in `src/main/java/org/apache/commons/lang3/function/FailableLongPredicate.java`
#### Snippet
```java
     */
    static <E extends Throwable> FailableLongPredicate<E> truePredicate() {
        return TRUE;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableLongPredicate' to 'org.apache.commons.lang3.function.FailableLongPredicate'
in `src/main/java/org/apache/commons/lang3/function/FailableLongPredicate.java`
#### Snippet
```java
     */
   static <E extends Throwable> FailableLongPredicate<E> falsePredicate() {
        return FALSE;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableObjIntConsumer' to 'org.apache.commons.lang3.function.FailableObjIntConsumer'
in `src/main/java/org/apache/commons/lang3/function/FailableObjIntConsumer.java`
#### Snippet
```java
     */
    static <T, E extends Throwable> FailableObjIntConsumer<T, E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableDoubleConsumer' to 'org.apache.commons.lang3.function.FailableDoubleConsumer'
in `src/main/java/org/apache/commons/lang3/function/FailableDoubleConsumer.java`
#### Snippet
```java
     */
    static <E extends Throwable> FailableDoubleConsumer<E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T\[\]'
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            throw new IllegalArgumentException("Array and element cannot both be null");
        }
        return (T[]) add(array, index, element, clss);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T\[\]'
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static <T> T[] removeAllOccurrences(final T[] array, final T element) {
        return (T[]) removeAll((Object) array, indexesOf(array, element));
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T\[\]'
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    @Deprecated
    public static <T> T[] removeAllOccurences(final T[] array, final T element) {
        return (T[]) removeAll((Object) array, indexesOf(array, element));
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailablePredicate' to 'org.apache.commons.lang3.function.FailablePredicate'
in `src/main/java/org/apache/commons/lang3/function/FailablePredicate.java`
#### Snippet
```java
     */
    static <T, E extends Throwable> FailablePredicate<T, E> truePredicate() {
        return TRUE;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailablePredicate' to 'org.apache.commons.lang3.function.FailablePredicate'
in `src/main/java/org/apache/commons/lang3/function/FailablePredicate.java`
#### Snippet
```java
     */
    static <T, E extends Throwable> FailablePredicate<T, E> falsePredicate() {
        return FALSE;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableToIntFunction' to 'org.apache.commons.lang3.function.FailableToIntFunction'
in `src/main/java/org/apache/commons/lang3/function/FailableToIntFunction.java`
#### Snippet
```java
     */
    static <T, E extends Throwable> FailableToIntFunction<T, E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableLongToDoubleFunction' to 'org.apache.commons.lang3.function.FailableLongToDoubleFunction'
in `src/main/java/org/apache/commons/lang3/function/FailableLongToDoubleFunction.java`
#### Snippet
```java
     */
    static <E extends Throwable> FailableLongToDoubleFunction<E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableFunction' to 'org.apache.commons.lang3.function.FailableFunction'
in `src/main/java/org/apache/commons/lang3/function/FailableFunction.java`
#### Snippet
```java
     */
    static <T, R, E extends Throwable> FailableFunction<T, R, E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableBiPredicate' to 'org.apache.commons.lang3.function.FailableBiPredicate'
in `src/main/java/org/apache/commons/lang3/function/FailableBiPredicate.java`
#### Snippet
```java
     */
    static <T, U, E extends Throwable> FailableBiPredicate<T, U, E> falsePredicate() {
        return FALSE;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableBiPredicate' to 'org.apache.commons.lang3.function.FailableBiPredicate'
in `src/main/java/org/apache/commons/lang3/function/FailableBiPredicate.java`
#### Snippet
```java
     */
    static <T, U, E extends Throwable> FailableBiPredicate<T, U, E> truePredicate() {
        return TRUE;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableIntUnaryOperator' to 'org.apache.commons.lang3.function.FailableIntUnaryOperator'
in `src/main/java/org/apache/commons/lang3/function/FailableIntUnaryOperator.java`
#### Snippet
```java
     */
    static <E extends Throwable> FailableIntUnaryOperator<E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableDoubleFunction' to 'org.apache.commons.lang3.function.FailableDoubleFunction'
in `src/main/java/org/apache/commons/lang3/function/FailableDoubleFunction.java`
#### Snippet
```java
     */
    static <R, E extends Throwable> FailableDoubleFunction<R, E> nop() {
        return NOP;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableDoublePredicate' to 'org.apache.commons.lang3.function.FailableDoublePredicate'
in `src/main/java/org/apache/commons/lang3/function/FailableDoublePredicate.java`
#### Snippet
```java
     */
   static <E extends Throwable> FailableDoublePredicate<E> falsePredicate() {
        return FALSE;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableDoublePredicate' to 'org.apache.commons.lang3.function.FailableDoublePredicate'
in `src/main/java/org/apache/commons/lang3/function/FailableDoublePredicate.java`
#### Snippet
```java
     */
   static <E extends Throwable> FailableDoublePredicate<E> truePredicate() {
        return TRUE;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableIntPredicate' to 'org.apache.commons.lang3.function.FailableIntPredicate'
in `src/main/java/org/apache/commons/lang3/function/FailableIntPredicate.java`
#### Snippet
```java
     */
    static <E extends Throwable> FailableIntPredicate<E> truePredicate() {
        return TRUE;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.commons.lang3.function.FailableIntPredicate' to 'org.apache.commons.lang3.function.FailableIntPredicate'
in `src/main/java/org/apache/commons/lang3/function/FailableIntPredicate.java`
#### Snippet
```java
     */
    static <E extends Throwable> FailableIntPredicate<E> falsePredicate() {
        return FALSE;
    }

```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `String`
in `src/main/java/org/apache/commons/lang3/concurrent/package-info.java`
#### Snippet
```java
 * configuring the new {@link org.apache.commons.lang3.concurrent.BasicThreadFactory} instance. Objects of this class
 * are immutable, so these attributes cannot be changed later. The naming pattern is a string which can be passed to
 * {@link String#format(java.util.Locale, String, Object...)}. The placeholder <em>%d</em> is replaced by an
 * increasing counter value. An instance can wrap another {@link java.util.concurrent.ThreadFactory} implementation;
 * this is achieved by calling the builder's
```

### JavadocReference
Cannot resolve symbol `format(java.util.Locale, String, Object...)`
in `src/main/java/org/apache/commons/lang3/concurrent/package-info.java`
#### Snippet
```java
 * configuring the new {@link org.apache.commons.lang3.concurrent.BasicThreadFactory} instance. Objects of this class
 * are immutable, so these attributes cannot be changed later. The naming pattern is a string which can be passed to
 * {@link String#format(java.util.Locale, String, Object...)}. The placeholder <em>%d</em> is replaced by an
 * increasing counter value. An instance can wrap another {@link java.util.concurrent.ThreadFactory} implementation;
 * this is achieved by calling the builder's
```

### JavadocReference
Cannot resolve symbol `Throwable`
in `src/main/java/org/apache/commons/lang3/exception/package-info.java`
#### Snippet
```java
 * <p>Contains the concept of an exception with context i.e. such an exception will contain a map with keys and values.
 * This provides an easy way to pass valuable state information at exception time in useful form to a calling process.</p>
 * <p>Lastly, {@link org.apache.commons.lang3.exception.ExceptionUtils} also contains {@link Throwable} manipulation
 * and examination routines.</p>
 *
```

### JavadocReference
Cannot resolve symbol `MultipartKey`
in `src/main/java/org/apache/commons/lang3/time/FormatCache.java`
#### Snippet
```java

        /**
         * Constructs an instance of {@link MultipartKey} to hold the specified objects.
         *
         * @param keys the set of objects that make up the key.  Each key may be null.
```

### JavadocReference
Cannot resolve symbol `Object`
in `src/main/java/org/apache/commons/lang3/builder/package-info.java`
#### Snippet
```java
 * It, and its buddies ({@link org.apache.commons.lang3.builder.EqualsBuilder}, {@link org.apache.commons.lang3.builder.CompareToBuilder}, {@link org.apache.commons.lang3.builder.ToStringBuilder}), take care of the nasty bits while you focus on the important bits, like which fields will go into making up the hashcode.</p>
 *
 * @see Object#equals(Object)
 * @see Object#toString()
 * @see Object#hashCode()
```

### JavadocReference
Cannot resolve symbol `equals(Object)`
in `src/main/java/org/apache/commons/lang3/builder/package-info.java`
#### Snippet
```java
 * It, and its buddies ({@link org.apache.commons.lang3.builder.EqualsBuilder}, {@link org.apache.commons.lang3.builder.CompareToBuilder}, {@link org.apache.commons.lang3.builder.ToStringBuilder}), take care of the nasty bits while you focus on the important bits, like which fields will go into making up the hashcode.</p>
 *
 * @see Object#equals(Object)
 * @see Object#toString()
 * @see Object#hashCode()
```

### JavadocReference
Cannot resolve symbol `Object`
in `src/main/java/org/apache/commons/lang3/builder/package-info.java`
#### Snippet
```java
 *
 * @see Object#equals(Object)
 * @see Object#toString()
 * @see Object#hashCode()
 * @see Comparable#compareTo(Object)
```

### JavadocReference
Cannot resolve symbol `toString()`
in `src/main/java/org/apache/commons/lang3/builder/package-info.java`
#### Snippet
```java
 *
 * @see Object#equals(Object)
 * @see Object#toString()
 * @see Object#hashCode()
 * @see Comparable#compareTo(Object)
```

### JavadocReference
Cannot resolve symbol `Object`
in `src/main/java/org/apache/commons/lang3/builder/package-info.java`
#### Snippet
```java
 * @see Object#equals(Object)
 * @see Object#toString()
 * @see Object#hashCode()
 * @see Comparable#compareTo(Object)
 *
```

### JavadocReference
Cannot resolve symbol `hashCode()`
in `src/main/java/org/apache/commons/lang3/builder/package-info.java`
#### Snippet
```java
 * @see Object#equals(Object)
 * @see Object#toString()
 * @see Object#hashCode()
 * @see Comparable#compareTo(Object)
 *
```

### JavadocReference
Cannot resolve symbol `Comparable`
in `src/main/java/org/apache/commons/lang3/builder/package-info.java`
#### Snippet
```java
 * @see Object#toString()
 * @see Object#hashCode()
 * @see Comparable#compareTo(Object)
 *
 * @since 1.0
```

### JavadocReference
Cannot resolve symbol `compareTo(Object)`
in `src/main/java/org/apache/commons/lang3/builder/package-info.java`
#### Snippet
```java
 * @see Object#toString()
 * @see Object#hashCode()
 * @see Comparable#compareTo(Object)
 *
 * @since 1.0
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.text.WordUtils`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * per {@link Character#toTitleCase(int)}. No other characters are changed.
     *
     * <p>For a word based algorithm, see {@link org.apache.commons.text.WordUtils#capitalize(String)}.
     * A {@code null} input String returns {@code null}.</p>
     *
```

### JavadocReference
Cannot resolve symbol `capitalize(String)`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * per {@link Character#toTitleCase(int)}. No other characters are changed.
     *
     * <p>For a word based algorithm, see {@link org.apache.commons.text.WordUtils#capitalize(String)}.
     * A {@code null} input String returns {@code null}.</p>
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.text.WordUtils`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * @param str the String to capitalize, may be null
     * @return the capitalized String, {@code null} if null String input
     * @see org.apache.commons.text.WordUtils#capitalize(String)
     * @see #uncapitalize(String)
     * @since 2.0
```

### JavadocReference
Cannot resolve symbol `capitalize(String)`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * @param str the String to capitalize, may be null
     * @return the capitalized String, {@code null} if null String input
     * @see org.apache.commons.text.WordUtils#capitalize(String)
     * @see #uncapitalize(String)
     * @since 2.0
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.text.WordUtils`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * per {@link Character#toLowerCase(int)}. No other characters are changed.
     *
     * <p>For a word based algorithm, see {@link org.apache.commons.text.WordUtils#uncapitalize(String)}.
     * A {@code null} input String returns {@code null}.</p>
     *
```

### JavadocReference
Cannot resolve symbol `uncapitalize(String)`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * per {@link Character#toLowerCase(int)}. No other characters are changed.
     *
     * <p>For a word based algorithm, see {@link org.apache.commons.text.WordUtils#uncapitalize(String)}.
     * A {@code null} input String returns {@code null}.</p>
     *
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.text.WordUtils`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * @param str the String to uncapitalize, may be null
     * @return the uncapitalized String, {@code null} if null String input
     * @see org.apache.commons.text.WordUtils#uncapitalize(String)
     * @see #capitalize(String)
     * @since 2.0
```

### JavadocReference
Cannot resolve symbol `uncapitalize(String)`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * @param str the String to uncapitalize, may be null
     * @return the uncapitalized String, {@code null} if null String input
     * @see org.apache.commons.text.WordUtils#uncapitalize(String)
     * @see #capitalize(String)
     * @since 2.0
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.text.WordUtils`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * </ul>
     *
     * <p>For a word based algorithm, see {@link org.apache.commons.text.WordUtils#swapCase(String)}.
     * A {@code null} input String returns {@code null}.</p>
     *
```

### JavadocReference
Cannot resolve symbol `swapCase(String)`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * </ul>
     *
     * <p>For a word based algorithm, see {@link org.apache.commons.text.WordUtils#swapCase(String)}.
     * A {@code null} input String returns {@code null}.</p>
     *
```

## RuleId[id=SuspiciousSystemArraycopy]
### SuspiciousSystemArraycopy
`varArgsArray` is not of an array type
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
        Object varArgsArray = Array.newInstance(ClassUtils.primitiveToWrapper(varArgComponentType), varArgLength);
        // Copy the variadic arguments into the varargs array.
        System.arraycopy(args, methodParameterTypes.length - 1, varArgsArray, 0, varArgLength);

        if (varArgComponentType.isPrimitive()) {
```

### SuspiciousSystemArraycopy
`array` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
                    final int cp = end - index - 1;
                    dest -= cp;
                    System.arraycopy(array, index + 1, result, dest, cp);
                    // After this copy, we still have room for dest items.
                }
```

### SuspiciousSystemArraycopy
`result` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
                    final int cp = end - index - 1;
                    dest -= cp;
                    System.arraycopy(array, index + 1, result, dest, cp);
                    // After this copy, we still have room for dest items.
                }
```

### SuspiciousSystemArraycopy
`array` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            }
            if (end > 0) {
                System.arraycopy(array, 0, result, 0, end);
            }
        }
```

### SuspiciousSystemArraycopy
`result` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            }
            if (end > 0) {
                System.arraycopy(array, 0, result, 0, end);
            }
        }
```

### SuspiciousSystemArraycopy
`array` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

        final Object result = Array.newInstance(array.getClass().getComponentType(), length - 1);
        System.arraycopy(array, 0, result, 0, index);
        if (index < length - 1) {
            System.arraycopy(array, index + 1, result, index, length - index - 1);
```

### SuspiciousSystemArraycopy
`result` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

        final Object result = Array.newInstance(array.getClass().getComponentType(), length - 1);
        System.arraycopy(array, 0, result, 0, index);
        if (index < length - 1) {
            System.arraycopy(array, index + 1, result, index, length - index - 1);
```

### SuspiciousSystemArraycopy
`array` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        System.arraycopy(array, 0, result, 0, index);
        if (index < length - 1) {
            System.arraycopy(array, index + 1, result, index, length - index - 1);
        }

```

### SuspiciousSystemArraycopy
`result` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        System.arraycopy(array, 0, result, 0, index);
        if (index < length - 1) {
            System.arraycopy(array, index + 1, result, index, length - index - 1);
        }

```

### SuspiciousSystemArraycopy
`array` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        final Object result = Array.newInstance(clss, length + 1);
        System.arraycopy(array, 0, result, 0, index);
        Array.set(result, index, element);
        if (index < length) {
```

### SuspiciousSystemArraycopy
`result` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        final Object result = Array.newInstance(clss, length + 1);
        System.arraycopy(array, 0, result, 0, index);
        Array.set(result, index, element);
        if (index < length) {
```

### SuspiciousSystemArraycopy
`array` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        Array.set(result, index, element);
        if (index < length) {
            System.arraycopy(array, index, result, index + 1, length - index);
        }
        return result;
```

### SuspiciousSystemArraycopy
`result` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        Array.set(result, index, element);
        if (index < length) {
            System.arraycopy(array, index, result, index + 1, length - index);
        }
        return result;
```

### SuspiciousSystemArraycopy
`array` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            final int arrayLength = Array.getLength(array);
            final Object newArray = Array.newInstance(array.getClass().getComponentType(), arrayLength + 1);
            System.arraycopy(array, 0, newArray, 0, arrayLength);
            return newArray;
        }
```

### SuspiciousSystemArraycopy
`newArray` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            final int arrayLength = Array.getLength(array);
            final Object newArray = Array.newInstance(array.getClass().getComponentType(), arrayLength + 1);
            System.arraycopy(array, 0, newArray, 0, arrayLength);
            return newArray;
        }
```

### SuspiciousSystemArraycopy
`array` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            count = set - srcIndex;
            if (count > 0) {
                System.arraycopy(array, srcIndex, result, destIndex, count);
                destIndex += count;
            }
```

### SuspiciousSystemArraycopy
`result` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            count = set - srcIndex;
            if (count > 0) {
                System.arraycopy(array, srcIndex, result, destIndex, count);
                destIndex += count;
            }
```

### SuspiciousSystemArraycopy
`array` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        count = srcLength - srcIndex;
        if (count > 0) {
            System.arraycopy(array, srcIndex, result, destIndex, count);
        }
        return result;
```

### SuspiciousSystemArraycopy
`result` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        count = srcLength - srcIndex;
        if (count > 0) {
            System.arraycopy(array, srcIndex, result, destIndex, count);
        }
        return result;
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `put` may produce `NullPointerException`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
        for (int i = 0; i < typeParams.length; i++) {
            final Type typeArg = typeArgs[i];
            typeVarAssigns.put(
                    typeParams[i],
                    typeVarAssigns.getOrDefault(typeArg, typeArg)
```

### DataFlowIssue
Method invocation `keySet` may produce `NullPointerException`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java

        // now to check each type argument
        for (final TypeVariable<?> var : toTypeVarAssigns.keySet()) {
            final Type toTypeArg = unrollVariableAssignments(var, toTypeVarAssigns);
            final Type fromTypeArg = unrollVariableAssignments(var, fromTypeVarAssigns);
```

## RuleId[id=StaticInitializerReferencesSubClass]
### StaticInitializerReferencesSubClass
Referencing subclass MapStrLookup from superclass StrLookup initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/lang3/text/StrLookup.java`
#### Snippet
```java
     * Lookup that always returns null.
     */
    private static final StrLookup<String> NONE_LOOKUP = new MapStrLookup<>(null);

    /**
```

### StaticInitializerReferencesSubClass
Referencing subclass NoMatcher from superclass StrMatcher initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/lang3/text/StrMatcher.java`
#### Snippet
```java
     * Matches no characters.
     */
    private static final StrMatcher NONE_MATCHER = new NoMatcher();

    /**
```

### StaticInitializerReferencesSubClass
Referencing subclass CharMatcher from superclass StrMatcher initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/lang3/text/StrMatcher.java`
#### Snippet
```java
     * Matches the space character.
     */
    private static final StrMatcher SPACE_MATCHER = new CharMatcher(' ');
    /**
     * Matches the same characters as StringTokenizer,
```

### StaticInitializerReferencesSubClass
Referencing subclass CharMatcher from superclass StrMatcher initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/lang3/text/StrMatcher.java`
#### Snippet
```java
     * Matches the double quote character.
     */
    private static final StrMatcher DOUBLE_QUOTE_MATCHER = new CharMatcher('"');
    /**
     * Matches the single or double quote character.
```

### StaticInitializerReferencesSubClass
Referencing subclass CharMatcher from superclass StrMatcher initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/lang3/text/StrMatcher.java`
#### Snippet
```java
     * Matches the double quote character.
     */
    private static final StrMatcher SINGLE_QUOTE_MATCHER = new CharMatcher('\'');
    /**
     * Matches the double quote character.
```

### StaticInitializerReferencesSubClass
Referencing subclass TrimMatcher from superclass StrMatcher initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/lang3/text/StrMatcher.java`
#### Snippet
```java
     * Matches the String trim() whitespace characters.
     */
    private static final StrMatcher TRIM_MATCHER = new TrimMatcher();
    /**
     * Matches the double quote character.
```

### StaticInitializerReferencesSubClass
Referencing subclass CharSetMatcher from superclass StrMatcher initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/lang3/text/StrMatcher.java`
#### Snippet
```java
     * namely space, tab, newline, formfeed.
     */
    private static final StrMatcher SPLIT_MATCHER = new CharSetMatcher(" \t\n\r\f".toCharArray());
    /**
     * Matches the String trim() whitespace characters.
```

### StaticInitializerReferencesSubClass
Referencing subclass CharSetMatcher from superclass StrMatcher initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/lang3/text/StrMatcher.java`
#### Snippet
```java
     * Matches the single or double quote character.
     */
    private static final StrMatcher QUOTE_MATCHER = new CharSetMatcher("'\"".toCharArray());
    /**
     * Matches no characters.
```

### StaticInitializerReferencesSubClass
Referencing subclass CharMatcher from superclass StrMatcher initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/lang3/text/StrMatcher.java`
#### Snippet
```java
     * Matches the tab character.
     */
    private static final StrMatcher TAB_MATCHER = new CharMatcher('\t');
    /**
     * Matches the space character.
```

### StaticInitializerReferencesSubClass
Referencing subclass CharMatcher from superclass StrMatcher initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/lang3/text/StrMatcher.java`
#### Snippet
```java
     * Matches the comma character.
     */
    private static final StrMatcher COMMA_MATCHER = new CharMatcher(',');
    /**
     * Matches the tab character.
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'ThreadGroupPredicate' is still used
in `src/main/java/org/apache/commons/lang3/ThreadUtils.java`
#### Snippet
```java
    // When breaking BC, replace this with Predicate<ThreadGroup>
    @FunctionalInterface
    public interface ThreadGroupPredicate {

        /**
```

### DeprecatedIsStillUsed
Deprecated member 'ThreadPredicate' is still used
in `src/main/java/org/apache/commons/lang3/ThreadUtils.java`
#### Snippet
```java
    // When breaking BC, replace this with Predicate<Thread>
    @FunctionalInterface
    public interface ThreadPredicate {

        /**
```

### DeprecatedIsStillUsed
Deprecated member 'findThreadGroups' is still used
in `src/main/java/org/apache/commons/lang3/ThreadUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static Collection<ThreadGroup> findThreadGroups(final ThreadGroupPredicate predicate) {
        return findThreadGroups(getSystemThreadGroup(), true, predicate);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'ALWAYS_TRUE_PREDICATE' is still used
in `src/main/java/org/apache/commons/lang3/ThreadUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final AlwaysTruePredicate ALWAYS_TRUE_PREDICATE = new AlwaysTruePredicate();

    private static final Predicate<?> ALWAYS_TRUE = t -> true;
```

### DeprecatedIsStillUsed
Deprecated member 'findThreads' is still used
in `src/main/java/org/apache/commons/lang3/ThreadUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static Collection<Thread> findThreads(final ThreadPredicate predicate) {
        return findThreads(getSystemThreadGroup(), true, predicate);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'findThreadGroups' is still used
in `src/main/java/org/apache/commons/lang3/ThreadUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static Collection<ThreadGroup> findThreadGroups(final ThreadGroup threadGroup, final boolean recurse, final ThreadGroupPredicate predicate) {
        return findThreadGroups(threadGroup, recurse, (Predicate<ThreadGroup>) predicate::test);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'toCharacterObject' is still used
in `src/main/java/org/apache/commons/lang3/CharUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static Character toCharacterObject(final char ch) {
        return Character.valueOf(ch);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'isSupported' is still used
in `src/main/java/org/apache/commons/lang3/CharEncoding.java`
#### Snippet
```java
     */
    @Deprecated
    public static boolean isSupported(final String name) {
        if (name == null) {
            return false;
```

### DeprecatedIsStillUsed
Deprecated member 'getNanosOfMiili' is still used
in `src/main/java/org/apache/commons/lang3/time/DurationUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static int getNanosOfMiili(final Duration duration) {
        return getNanosOfMilli(duration);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'ISO_DATE_TIME_ZONE_FORMAT' is still used
in `src/main/java/org/apache/commons/lang3/time/DateFormatUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final FastDateFormat ISO_DATE_TIME_ZONE_FORMAT
            = FastDateFormat.getInstance("yyyy-MM-ddZZ");

```

### DeprecatedIsStillUsed
Deprecated member 'ISO_DATETIME_FORMAT' is still used
in `src/main/java/org/apache/commons/lang3/time/DateFormatUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final FastDateFormat ISO_DATETIME_FORMAT = ISO_8601_EXTENDED_DATETIME_FORMAT;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'ISO_TIME_NO_T_TIME_ZONE_FORMAT' is still used
in `src/main/java/org/apache/commons/lang3/time/DateFormatUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final FastDateFormat ISO_TIME_NO_T_TIME_ZONE_FORMAT = ISO_8601_EXTENDED_TIME_TIME_ZONE_FORMAT;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'ISO_TIME_TIME_ZONE_FORMAT' is still used
in `src/main/java/org/apache/commons/lang3/time/DateFormatUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final FastDateFormat ISO_TIME_TIME_ZONE_FORMAT
            = FastDateFormat.getInstance("'T'HH:mm:ssZZ");

```

### DeprecatedIsStillUsed
Deprecated member 'ISO_DATE_FORMAT' is still used
in `src/main/java/org/apache/commons/lang3/time/DateFormatUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final FastDateFormat ISO_DATE_FORMAT = ISO_8601_EXTENDED_DATE_FORMAT;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'ISO_TIME_NO_T_FORMAT' is still used
in `src/main/java/org/apache/commons/lang3/time/DateFormatUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final FastDateFormat ISO_TIME_NO_T_FORMAT = ISO_8601_EXTENDED_TIME_FORMAT;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'ISO_TIME_FORMAT' is still used
in `src/main/java/org/apache/commons/lang3/time/DateFormatUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final FastDateFormat ISO_TIME_FORMAT
            = FastDateFormat.getInstance("'T'HH:mm:ss");

```

### DeprecatedIsStillUsed
Deprecated member 'FailableBiConsumer' is still used
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
    @Deprecated
    @FunctionalInterface
    public interface FailableBiConsumer<O1, O2, T extends Throwable> {

        /**
```

### DeprecatedIsStillUsed
Deprecated member 'FailableBiFunction' is still used
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
    @Deprecated
    @FunctionalInterface
    public interface FailableBiFunction<O1, O2, R, T extends Throwable> {

        /**
```

### DeprecatedIsStillUsed
Deprecated member 'FailableSupplier' is still used
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
    @Deprecated
    @FunctionalInterface
    public interface FailableSupplier<R, T extends Throwable> {

        /**
```

### DeprecatedIsStillUsed
Deprecated member 'FailablePredicate' is still used
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
    @Deprecated
    @FunctionalInterface
    public interface FailablePredicate<I, T extends Throwable> {

        /**
```

### DeprecatedIsStillUsed
Deprecated member 'FailableCallable' is still used
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
    @Deprecated
    @FunctionalInterface
    public interface FailableCallable<R, T extends Throwable> {

        /**
```

### DeprecatedIsStillUsed
Deprecated member 'FailableRunnable' is still used
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
    @Deprecated
    @FunctionalInterface
    public interface FailableRunnable<T extends Throwable> {

        /**
```

### DeprecatedIsStillUsed
Deprecated member 'FailableBiPredicate' is still used
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
    @Deprecated
    @FunctionalInterface
    public interface FailableBiPredicate<O1, O2, T extends Throwable> {

        /**
```

### DeprecatedIsStillUsed
Deprecated member 'getUserName' is still used
in `src/main/java/org/apache/commons/lang3/SystemUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String getUserName() {
        return SystemProperties.getUserName();
    }
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/lang3/SystemProperties.java`
#### Snippet
```java
        } catch (final SecurityException ignore) {
            // We are not allowed to look at this property.
            //
            // System.err.println("Caught a SecurityException reading the system property '" + property
            // + "'; the SystemUtils property value will default to null.");
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        // No need to check maxIndex here, because method only currently called from removeElements()
        // which guarantee to generate only valid bit entries.
//        final int maxIndex = indices.length();
//        if (maxIndex > srcLength) {
//            throw new IndexOutOfBoundsException("Index: " + (maxIndex-1) + ", Length: " + srcLength);
```

### CommentedOutCode
Commented out code (9 lines)
in `src/main/java/org/apache/commons/lang3/CharSequenceUtils.java`
#### Snippet
```java
        }
        return cs.toString().indexOf(searchChar.toString(), start);
//        if (cs instanceof String && searchChar instanceof String) {
//            // TODO: Do we assume searchChar is usually relatively small;
//            //       If so then calling toString() on it is better than reverting to
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/commons/lang3/concurrent/ConstantInitializer.java`
#### Snippet
```java
    public String toString() {
        return String.format(FMT_TO_STRING, Integer.valueOf(System.identityHashCode(this)),
                String.valueOf(getObject()));
    }
}
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/org/apache/commons/lang3/text/StrTokenizer.java`
#### Snippet
```java
     */
    @Override
    public Object clone() {
        try {
            return cloneReset();
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/org/apache/commons/lang3/util/FluentBitSet.java`
#### Snippet
```java
     */
    @Override
    public Object clone() {
        return new FluentBitSet((BitSet) bitSet.clone());
    }
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
        if (value == null) {
            if (trueValue == null) {
                return Boolean.TRUE;
            }
            if (falseValue == null) {
                return Boolean.FALSE;
            }
            if (nullValue == null) {
                return null;
            }
        } else if (value.equals(trueValue)) {
            return Boolean.TRUE;
        } else if (value.equals(falseValue)) {
            return Boolean.FALSE;
        } else if (value.equals(nullValue)) {
            return null;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/lang3/Conversion.java`
#### Snippet
```java
        final StringBuilder sb = new StringBuilder(dstInit);
        int append = sb.length();
        for (int i = 0; i < nHexs; i++) {
            final int shift = i * 4 + srcPos;
            final int bits = 0xF & (src >> shift);
            if (dstPos + i == append) {
                ++append;
                sb.append(intToHexDigit(bits));
            } else {
                sb.setCharAt(dstPos + i, intToHexDigit(bits));
            }
        }
        return sb.toString();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/lang3/EnumUtils.java`
#### Snippet
```java
        final long[] result = new long[(enumClass.getEnumConstants().length - 1) / Long.SIZE + 1];
        for (final E value : condensed) {
            result[value.ordinal() / Long.SIZE] |= 1L << (value.ordinal() % Long.SIZE);
        }
        ArrayUtils.reverse(result);
        return result;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
        Objects.requireNonNull(throwable, "throwable");
        if (throwable instanceof RuntimeException) {
            throw (RuntimeException) throwable;
        }
        if (throwable instanceof Error) {
            throw (Error) throwable;
        }
        if (throwable instanceof IOException) {
            throw new UncheckedIOException((IOException) throwable);
        }
        throw new UndeclaredThrowableException(throwable);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/lang3/ObjectUtils.java`
#### Snippet
```java
        Objects.requireNonNull(object, "object");
        final String name = object.getClass().getName();
        final String hexString = identityHashCodeHex(object);
        builder.ensureCapacity(builder.length() +  name.length() + 1 + hexString.length());
        builder.append(name)
              .append(AT_SIGN)
              .append(hexString);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/lang3/builder/CompareToBuilder.java`
#### Snippet
```java
        if (comparison != 0) {
            return this;
        }
        if (lhs == rhs) {
            return this;
        }
        if (lhs == null) {
            comparison = -1;
            return this;
        }
        if (rhs == null) {
            comparison = 1;
            return this;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java`
#### Snippet
```java
        if (!isEquals) {
            return this;
        }
        if (lhs == rhs) {
            return this;
        }
        if (lhs == null || rhs == null) {
            this.setEquals(false);
            return this;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/lang3/builder/ToStringStyle.java`
#### Snippet
```java
        buffer.append(arrayStart);
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                buffer.append(arraySeparator);
            }
            appendDetail(buffer, fieldName, array[i]);
        }
        buffer.append(arrayEnd);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
        if (str == null) {
            return appendNull();
        }
        final int strLen = str.length();
        if (strLen > 0) {
            final int len = length();
            ensureCapacity(len + strLen);
            str.getChars(0, strLen, buffer, len);
            size += strLen;
        }
        return this;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
        if (str == null) {
            return appendNull();
        }
        if (startIndex < 0 || startIndex > str.length()) {
            throw new StringIndexOutOfBoundsException("startIndex must be valid");
        }
        if (length < 0 || startIndex + length > str.length()) {
            throw new StringIndexOutOfBoundsException("length must be valid");
        }
        if (length > 0) {
            final int len = length();
            ensureCapacity(len + length);
            str.getChars(startIndex, startIndex + length, buffer, len);
            size += length;
        }
        return this;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java`
#### Snippet
```java
        if (source == null) {
            return false;
        }
        final StrBuilder buf = new StrBuilder(length).append(source, offset, length);
        if (!substitute(buf, 0, length)) {
            return false;
        }
        source.replace(offset, offset + length, buf.toString());
        return true;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/lang3/text/WordUtils.java`
#### Snippet
```java
        final int delimLen = delimiters == null ? -1 : delimiters.length;
        if (StringUtils.isEmpty(str) || delimLen == 0) {
            return str;
        }
        final char[] buffer = str.toCharArray();
        boolean capitalizeNext = true;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/lang3/time/FastDateParser.java`
#### Snippet
```java
            switch(tokenLen) {
            case 1:
                return ISO_8601_1_STRATEGY;
            case 2:
                return ISO_8601_2_STRATEGY;
            case 3:
                return ISO_8601_3_STRATEGY;
            default:
                throw new IllegalArgumentException("invalid number of X");
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/lang3/time/FastDatePrinter.java`
#### Snippet
```java
            if (offset < 0) {
                buffer.append('-');
                offset = -offset;
            } else {
                buffer.append('+');
            }

            final int hours = offset / (60 * 60 * 1000);
            appendDigits(buffer, hours);
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/org/apache/commons/lang3/arch/Processor.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(type.getLabel()).append(' ').append(arch.getLabel());
        return builder.toString();
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/org/apache/commons/lang3/ObjectUtils.java`
#### Snippet
```java
        final String name = object.getClass().getName();
        final String hexString = identityHashCodeHex(object);
        final StringBuilder builder = new StringBuilder(name.length() + 1 + hexString.length());
        // @formatter:off
        builder.append(name)
```

## RuleId[id=Deprecation]
### Deprecation
'org.apache.commons.lang3.text.StrBuilder' is deprecated
in `src/main/java/org/apache/commons/lang3/text/package-info.java`
#### Snippet
```java
 * with lots of static methods).
 *
 * <p>Amongst other classes, the text package provides a replacement for {@link java.lang.StringBuffer} named {@link org.apache.commons.lang3.text.StrBuilder}, a class for substituting variables within a String named {@link org.apache.commons.lang3.text.StrSubstitutor} and a replacement for {@link java.util.StringTokenizer} named {@link org.apache.commons.lang3.text.StrTokenizer}.
 * While somewhat ungainly, the {@code Str} prefix has been used to ensure we don't clash with any current or future standard Java classes.</p>
 *
```

### Deprecation
'org.apache.commons.lang3.text.StrSubstitutor' is deprecated
in `src/main/java/org/apache/commons/lang3/text/package-info.java`
#### Snippet
```java
 * with lots of static methods).
 *
 * <p>Amongst other classes, the text package provides a replacement for {@link java.lang.StringBuffer} named {@link org.apache.commons.lang3.text.StrBuilder}, a class for substituting variables within a String named {@link org.apache.commons.lang3.text.StrSubstitutor} and a replacement for {@link java.util.StringTokenizer} named {@link org.apache.commons.lang3.text.StrTokenizer}.
 * While somewhat ungainly, the {@code Str} prefix has been used to ensure we don't clash with any current or future standard Java classes.</p>
 *
```

### Deprecation
'org.apache.commons.lang3.text.StrTokenizer' is deprecated
in `src/main/java/org/apache/commons/lang3/text/package-info.java`
#### Snippet
```java
 * with lots of static methods).
 *
 * <p>Amongst other classes, the text package provides a replacement for {@link java.lang.StringBuffer} named {@link org.apache.commons.lang3.text.StrBuilder}, a class for substituting variables within a String named {@link org.apache.commons.lang3.text.StrSubstitutor} and a replacement for {@link java.util.StringTokenizer} named {@link org.apache.commons.lang3.text.StrTokenizer}.
 * While somewhat ungainly, the {@code Str} prefix has been used to ensure we don't clash with any current or future standard Java classes.</p>
 *
```

### Deprecation
'org.apache.commons.lang3.StringEscapeUtils' is deprecated
in `src/main/java/org/apache/commons/lang3/package-info.java`
#### Snippet
```java
 * <p>Lang has a series of String utilities.
 * The first is {@link org.apache.commons.lang3.StringUtils}, oodles and oodles of functions which tweak, transform, squeeze and cuddle {@link java.lang.String java.lang.Strings}.
 * In addition to StringUtils, there are a series of other String manipulating classes; {@link org.apache.commons.lang3.RandomStringUtils} and {@link org.apache.commons.lang3.StringEscapeUtils StringEscapeUtils}.
 * RandomStringUtils speaks for itself.
 * It's provides ways in which to generate pieces of text, such as might be used for default passwords.
```

### Deprecation
'org.apache.commons.lang3.CharEncoding' is deprecated
in `src/main/java/org/apache/commons/lang3/package-info.java`
#### Snippet
```java
 * There was no obvious solution and I needed to move onwards, so the simple solution was to wrap that particular test in a <code>if (SystemUtils.isJavaVersionAtLeast(1.3f)) {</code>, make a note and move on.</p>
 *
 * <p>The {@link org.apache.commons.lang3.CharEncoding} class is also used to interact with the Java environment and may be used to see which character encodings are supported in a particular environment.</p>
 *
 * <h2>Serialization - SerializationUtils, SerializationException</h2>
```

### Deprecation
'org.apache.commons.lang3.RandomUtils' is deprecated
in `src/main/java/org/apache/commons/lang3/RandomStringUtils.java`
#### Snippet
```java
     */
    public static String randomAlphanumeric(final int minLengthInclusive, final int maxLengthExclusive) {
        return randomAlphanumeric(RandomUtils.nextInt(minLengthInclusive, maxLengthExclusive));
    }

```

### Deprecation
'org.apache.commons.lang3.RandomUtils' is deprecated
in `src/main/java/org/apache/commons/lang3/RandomStringUtils.java`
#### Snippet
```java
     */
    public static String randomPrint(final int minLengthInclusive, final int maxLengthExclusive) {
        return randomPrint(RandomUtils.nextInt(minLengthInclusive, maxLengthExclusive));
    }

```

### Deprecation
'org.apache.commons.lang3.RandomUtils' is deprecated
in `src/main/java/org/apache/commons/lang3/RandomStringUtils.java`
#### Snippet
```java
     */
    public static String randomNumeric(final int minLengthInclusive, final int maxLengthExclusive) {
        return randomNumeric(RandomUtils.nextInt(minLengthInclusive, maxLengthExclusive));
    }

```

### Deprecation
'org.apache.commons.lang3.RandomUtils' is deprecated
in `src/main/java/org/apache/commons/lang3/RandomStringUtils.java`
#### Snippet
```java
     */
    public static String randomGraph(final int minLengthInclusive, final int maxLengthExclusive) {
        return randomGraph(RandomUtils.nextInt(minLengthInclusive, maxLengthExclusive));
    }

```

### Deprecation
'org.apache.commons.lang3.RandomUtils' is deprecated
in `src/main/java/org/apache/commons/lang3/RandomStringUtils.java`
#### Snippet
```java
     */
    public static String randomAscii(final int minLengthInclusive, final int maxLengthExclusive) {
        return randomAscii(RandomUtils.nextInt(minLengthInclusive, maxLengthExclusive));
    }

```

### Deprecation
'org.apache.commons.lang3.RandomUtils' is deprecated
in `src/main/java/org/apache/commons/lang3/RandomStringUtils.java`
#### Snippet
```java
     */
    public static String randomAlphabetic(final int minLengthInclusive, final int maxLengthExclusive) {
        return randomAlphabetic(RandomUtils.nextInt(minLengthInclusive, maxLengthExclusive));
    }

```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/lang3/time/DurationFormatUtils.java`
#### Snippet
```java
            final int count = token.getCount();
            if (value instanceof StringBuilder) {
                buffer.append(value.toString());
            } else if (value.equals(y)) {
                buffer.append(paddedValue(years, padWithZeros, count));
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
                builder.append(((Class<?>) useOwner).getName());
            } else {
                builder.append(useOwner.toString());
            }
            builder.append('.').append(raw.getSimpleName());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
            }
        }
        return prefix.toString() + str;
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
            }
        }
        return str + suffix.toString();
    }

```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/lang3/StringEscapeUtils.java`
#### Snippet
```java
     * @since 3.0
     */
    public static final String unescapeHtml3(final String input) {
        return UNESCAPE_HTML3.translate(input);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/lang3/StringEscapeUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final String escapeXml(final String input) {
        return ESCAPE_XML.translate(input);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/lang3/StringEscapeUtils.java`
#### Snippet
```java
     * @since 3.2
     */
    public static final String escapeJson(final String input) {
        return ESCAPE_JSON.translate(input);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/lang3/StringEscapeUtils.java`
#### Snippet
```java
     * @since 2.4
     */
    public static final String unescapeCsv(final String input) {
        return UNESCAPE_CSV.translate(input);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/lang3/StringEscapeUtils.java`
#### Snippet
```java
     * @since 3.0
     */
    public static final String escapeHtml4(final String input) {
        return ESCAPE_HTML4.translate(input);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/lang3/StringEscapeUtils.java`
#### Snippet
```java
     * @return a new unescaped {@link String}, {@code null} if null string input
     */
    public static final String unescapeJava(final String input) {
        return UNESCAPE_JAVA.translate(input);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/lang3/StringEscapeUtils.java`
#### Snippet
```java
     * @since 3.0
     */
    public static final String unescapeHtml4(final String input) {
        return UNESCAPE_HTML4.translate(input);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/lang3/StringEscapeUtils.java`
#### Snippet
```java
     * @return String with escaped values, {@code null} if null string input
     */
    public static final String escapeJava(final String input) {
        return ESCAPE_JAVA.translate(input);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/lang3/StringEscapeUtils.java`
#### Snippet
```java
     * @since 3.0
     */
    public static final String escapeHtml3(final String input) {
        return ESCAPE_HTML3.translate(input);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/lang3/StringEscapeUtils.java`
#### Snippet
```java
     * @since 2.4
     */
    public static final String escapeCsv(final String input) {
        return ESCAPE_CSV.translate(input);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/lang3/StringEscapeUtils.java`
#### Snippet
```java
     * @see #escapeXml11(String)
     */
    public static final String unescapeXml(final String input) {
        return UNESCAPE_XML.translate(input);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/lang3/StringEscapeUtils.java`
#### Snippet
```java
     * @since 3.2
     */
    public static final String unescapeJson(final String input) {
        return UNESCAPE_JSON.translate(input);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/lang3/StringEscapeUtils.java`
#### Snippet
```java
     * @since 3.0
     */
    public static final String unescapeEcmaScript(final String input) {
        return UNESCAPE_ECMASCRIPT.translate(input);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/lang3/StringEscapeUtils.java`
#### Snippet
```java
     * @since 3.0
     */
    public static final String escapeEcmaScript(final String input) {
        return ESCAPE_ECMASCRIPT.translate(input);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
     * @since 3.2
     */
    public static final ParameterizedType parameterize(final Class<?> rawClass,
        final Map<TypeVariable<?>, Type> typeVariableMap) {
        Objects.requireNonNull(rawClass, "rawClass");
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
     * @since 3.2
     */
    public static final ParameterizedType parameterizeWithOwner(final Type owner, final Class<?> rawClass,
        final Map<TypeVariable<?>, Type> typeVariableMap) {
        Objects.requireNonNull(rawClass, "rawClass");
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
     * @since 3.2
     */
    public static final ParameterizedType parameterize(final Class<?> rawClass, final Type... typeArguments) {
        return parameterizeWithOwner(null, rawClass, typeArguments);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
     * @since 3.2
     */
    public static final ParameterizedType parameterizeWithOwner(final Type owner, final Class<?> rawClass,
        final Type... typeArguments) {
        Objects.requireNonNull(rawClass, "rawClass");
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
    private static final Map<String, String> reverseAbbreviationMap;

    /** Feed abbreviation maps. */
    static {
        final Map<String, String> map = new HashMap<>();
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.getOrDefault()'
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
            typeVarAssigns.put(
                    typeParams[i],
                    typeVarAssigns.getOrDefault(typeArg, typeArg)
            );
        }
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java

            // argument of parameterizedType is a type variable of cls
            if (typeVarList.contains(typeArg)
            // type variable of parameterizedType has an assignment in
                    // the super type.
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/org/apache/commons/lang3/exception/ExceptionUtils.java`
#### Snippet
```java
    public static <R> R rethrow(final Throwable throwable) {
        // claim that the typeErasure invocation throws a RuntimeException
        return ExceptionUtils.<R, RuntimeException>eraseType(throwable);
    }

```

## RuleId[id=NumberEquality]
### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/org/apache/commons/lang3/math/Fraction.java`
#### Snippet
```java
    @Override
    public int compareTo(final Fraction other) {
        if (this == other) {
            return 0;
        }
```

## RuleId[id=SuspiciousInvocationHandlerImplementation]
### SuspiciousInvocationHandlerImplementation
Null might be returned when proxying method 'equals()': this may cause NullPointerException
in `src/main/java/org/apache/commons/lang3/event/EventListenerSupport.java`
#### Snippet
```java
                method.invoke(listener, args);
            }
            return null;
        }
    }
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/lang3/concurrent/AbstractFutureProxy.java`
#### Snippet
```java

    @Override
    public V get(final long timeout, final TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return future.get(timeout, unit);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/lang3/text/CompositeFormat.java`
#### Snippet
```java
     */
    @Override
    public Object parseObject(final String source, final ParsePosition pos) {
        return parser.parseObject(source, pos);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/lang3/text/CompositeFormat.java`
#### Snippet
```java
     */
    @Override // Therefore has to use StringBuffer
    public StringBuffer format(final Object obj, final StringBuffer toAppendTo,
            final FieldPosition pos) {
        return formatter.format(obj, toAppendTo, pos);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/lang3/text/CompositeFormat.java`
#### Snippet
```java
    @Override // Therefore has to use StringBuffer
    public StringBuffer format(final Object obj, final StringBuffer toAppendTo,
            final FieldPosition pos) {
        return formatter.format(obj, toAppendTo, pos);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/lang3/math/Fraction.java`
#### Snippet
```java
     */
    @Override
    public int compareTo(final Fraction other) {
        if (this == other) {
            return 0;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/lang3/concurrent/UncheckedFuture.java`
#### Snippet
```java
     */
    @Override
    V get(long timeout, TimeUnit unit);

}
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/lang3/concurrent/BasicThreadFactory.java`
#### Snippet
```java
     */
    @Override
    public Thread newThread(final Runnable runnable) {
        final Thread thread = getWrappedFactory().newThread(runnable);
        initializeThread(thread);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/lang3/text/ExtendedMessageFormat.java`
#### Snippet
```java
     */
    @Override
    public void setFormatsByArgumentIndex(final Format[] newFormats) {
        throw new UnsupportedOperationException();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/lang3/text/ExtendedMessageFormat.java`
#### Snippet
```java
     */
    @Override
    public final void applyPattern(final String pattern) {
        if (registry == null) {
            super.applyPattern(pattern);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/lang3/text/ExtendedMessageFormat.java`
#### Snippet
```java
     */
    @Override
    public void setFormats(final Format[] newFormats) {
        throw new UnsupportedOperationException();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/lang3/time/FastDateFormat.java`
#### Snippet
```java
     */
    @Override
    public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) {
        return toAppendTo.append(printer.format(obj));
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/lang3/time/FastDateFormat.java`
#### Snippet
```java
     */
    @Override
    public Object parseObject(final String source, final ParsePosition pos) {
        return parser.parseObject(source, pos);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/lang3/concurrent/ConcurrentUtils.java`
#### Snippet
```java
         */
        @Override
        public T get(final long timeout, final TimeUnit unit) {
            return value;
        }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/apache/commons/lang3/CharRange.java`
#### Snippet
```java
     */
    @Override
    public Iterator<Character> iterator() {
        return new CharacterIterator(this);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
        /** {@inheritDoc} */
        @Override
        public void write(final String str, final int off, final int len) {
            StrBuilder.this.append(str, off, len);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
        /** {@inheritDoc} */
        @Override
        public void write(final char[] cbuf, final int off, final int len) {
            StrBuilder.this.append(cbuf, off, len);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
        /** {@inheritDoc} */
        @Override
        public void write(final String str) {
            StrBuilder.this.append(str);
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
        /** {@inheritDoc} */
        @Override
        public int read(final char[] b, final int off, int len) {
            if (off < 0 || len < 0 || off > b.length ||
                    off + len > b.length || off + len < 0) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
        /** {@inheritDoc} */
        @Override
        public void write(final char[] cbuf) {
            StrBuilder.this.append(cbuf);
        }
```

## RuleId[id=NegativeIntConstantInLongContext]
### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `src/main/java/org/apache/commons/lang3/Conversion.java`
#### Snippet
```java
        for (int i = 0; i < nInts; i++) {
            final int shift = i * 32 + srcPos;
            dst[dstPos + i] = (int) (0xffffffff & (src >> shift));
        }
        return dst;
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/lang3/concurrent/locks/LockingVisitors.java`
#### Snippet
```java
 * Combines the monitor and visitor pattern to work with {@link java.util.concurrent.locks.Lock locked objects}. Locked
 * objects are an alternative to synchronization. This, on Wikipedia, is known as the Visitor pattern
 * (https://en.wikipedia.org/wiki/Visitor_pattern), and from the "Gang of Four" "Design Patterns" book's Visitor pattern
 * [Gamma, E., Helm, R., &amp; Johnson, R. (1998). Visitor. In Design patterns elements of reusable object oriented software (pp. 331-344). Reading: Addison Wesley.].
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/lang3/StringEscapeUtils.java`
#### Snippet
```java
     * is that in Json, forward-slash (/) is escaped.</p>
     *
     * <p>See https://www.ietf.org/rfc/rfc4627.txt for further details.</p>
     *
     * <p>Example:</p>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/lang3/reflect/FieldUtils.java`
#### Snippet
```java
     * @deprecated As of Java 12, we can no longer drop the {@code final} modifier, thus
     *             rendering this method obsolete. The JDK discussion about this change can be found
     *             here: https://mail.openjdk.java.net/pipermail/core-libs-dev/2018-November/056486.html
     * @since 3.3
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/lang3/SystemUtils.java`
#### Snippet
```java
     * </p>
     * <ul>
     * <li>Affects Java versions 7u321, 8u311, 11.0.13-oracle, 17.0.1: https://bugs.openjdk.org/browse/JDK-8274737</li>
     * <li>Fixed in OpenJDK commit https://github.com/openjdk/jdk/commit/97ea9dd2f24f9f1fb9b9345a4202a825ee28e014</li>
     * </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/lang3/SystemUtils.java`
#### Snippet
```java
     * <ul>
     * <li>Affects Java versions 7u321, 8u311, 11.0.13-oracle, 17.0.1: https://bugs.openjdk.org/browse/JDK-8274737</li>
     * <li>Fixed in OpenJDK commit https://github.com/openjdk/jdk/commit/97ea9dd2f24f9f1fb9b9345a4202a825ee28e014</li>
     * </ul>
     * <p>
```

## RuleId[id=FunctionalExpressionCanBeFolded]
### FunctionalExpressionCanBeFolded
Method reference can be replaced with qualifier
in `src/main/java/org/apache/commons/lang3/time/DurationUtils.java`
#### Snippet
```java
     */
    public static <E extends Throwable> Duration of(final FailableConsumer<Instant, E> consumer) throws E {
        return since(now(consumer::accept));
    }

```

### FunctionalExpressionCanBeFolded
Method reference can be replaced with qualifier
in `src/main/java/org/apache/commons/lang3/EnumUtils.java`
#### Snippet
```java
     */
    public static <E extends Enum<E>, K> Map<K, E> getEnumMap(final Class<E> enumClass, final Function<E, K> keyFunction) {
        return Stream.of(enumClass.getEnumConstants()).collect(Collectors.toMap(keyFunction::apply, Function.identity()));
    }

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `isNumber()` is identical to its super method
in `src/main/java/org/apache/commons/lang3/time/FastDateParser.java`
#### Snippet
```java
         */
        @Override
        boolean isNumber() {
            return false;
        }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
     *
     * <p>
     * This method simply gets the name using {@code Class.getName()} and then calls {@link #getShortClassName(Class)}. See
     * relevant notes there.
     * </p>
```

### JavadocDeclaration
Javadoc pointing to itself
in `src/main/java/org/apache/commons/lang3/text/StrLookup.java`
#### Snippet
```java
     * </p>
     * <p>
     * The {@link #lookup(String)} method always returns a String, regardless of
     * the underlying data, by converting it as necessary. For example:
     * </p>
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `t -> {...}` to `Predicate` is redundant
in `src/main/java/org/apache/commons/lang3/ThreadUtils.java`
#### Snippet
```java

    private static <T> Predicate<T> namePredicate(final String name, final Function<T, String> nameGetter) {
        return (Predicate<T>) t -> t != null && Objects.equals(nameGetter.apply(t), Objects.requireNonNull(name));
    }

```

### RedundantCast
Casting `deserialize(...)` to `T` is redundant
in `src/main/java/org/apache/commons/lang3/SerializationUtils.java`
#### Snippet
```java
    @SuppressWarnings("unchecked") // OK, because we serialized a type `T`
    public static <T extends Serializable> T roundtrip(final T obj) {
        return (T) deserialize(serialize(obj));
    }

```

### RedundantCast
Casting `array` to `Object` is redundant
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static long[] removeAllOccurrences(final long[] array, final long element) {
        return (long[]) removeAll((Object) array, indexesOf(array, element));
    }

```

### RedundantCast
Casting `array` to `Object` is redundant
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    @Deprecated
    public static boolean[] removeAllOccurences(final boolean[] array, final boolean element) {
        return (boolean[]) removeAll((Object) array, indexesOf(array, element));
    }

```

### RedundantCast
Casting `array` to `Object` is redundant
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static short[] removeAllOccurrences(final short[] array, final short element) {
        return (short[]) removeAll((Object) array, indexesOf(array, element));
    }

```

### RedundantCast
Casting `array` to `Object` is redundant
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static char[] removeAllOccurrences(final char[] array, final char element) {
        return (char[]) removeAll((Object) array, indexesOf(array, element));
    }

```

### RedundantCast
Casting `array` to `Object` is redundant
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static boolean[] removeAllOccurrences(final boolean[] array, final boolean element) {
        return (boolean[]) removeAll((Object) array, indexesOf(array, element));
    }

```

### RedundantCast
Casting `array` to `Object` is redundant
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    @Deprecated
    public static int[] removeAllOccurences(final int[] array, final int element) {
        return (int[]) removeAll((Object) array, indexesOf(array, element));
    }

```

### RedundantCast
Casting `array` to `Object` is redundant
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    @Deprecated
    public static double[] removeAllOccurences(final double[] array, final double element) {
        return (double[]) removeAll((Object) array, indexesOf(array, element));
    }

```

### RedundantCast
Casting `array` to `Object` is redundant
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static byte[] removeAllOccurrences(final byte[] array, final byte element) {
        return (byte[]) removeAll((Object) array, indexesOf(array, element));
    }

```

### RedundantCast
Casting `array` to `Object` is redundant
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    @Deprecated
    public static byte[] removeAllOccurences(final byte[] array, final byte element) {
        return (byte[]) removeAll((Object) array, indexesOf(array, element));
    }

```

### RedundantCast
Casting `array` to `Object` is redundant
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    @Deprecated
    public static float[] removeAllOccurences(final float[] array, final float element) {
        return (float[]) removeAll((Object) array, indexesOf(array, element));
    }

```

### RedundantCast
Casting `array` to `Object` is redundant
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    @Deprecated
    public static char[] removeAllOccurences(final char[] array, final char element) {
        return (char[]) removeAll((Object) array, indexesOf(array, element));
    }

```

### RedundantCast
Casting `array` to `Object` is redundant
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static <T> T[] removeAllOccurrences(final T[] array, final T element) {
        return (T[]) removeAll((Object) array, indexesOf(array, element));
    }

```

### RedundantCast
Casting `array` to `Object` is redundant
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    @Deprecated
    public static long[] removeAllOccurences(final long[] array, final long element) {
        return (long[]) removeAll((Object) array, indexesOf(array, element));
    }

```

### RedundantCast
Casting `array` to `Object` is redundant
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static double[] removeAllOccurrences(final double[] array, final double element) {
        return (double[]) removeAll((Object) array, indexesOf(array, element));
    }

```

### RedundantCast
Casting `array` to `Object` is redundant
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static int[] removeAllOccurrences(final int[] array, final int element) {
        return (int[]) removeAll((Object) array, indexesOf(array, element));
    }

```

### RedundantCast
Casting `array` to `Object` is redundant
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    @Deprecated
    public static short[] removeAllOccurences(final short[] array, final short element) {
        return (short[]) removeAll((Object) array, indexesOf(array, element));
    }

```

### RedundantCast
Casting `array` to `Object` is redundant
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    @Deprecated
    public static <T> T[] removeAllOccurences(final T[] array, final T element) {
        return (T[]) removeAll((Object) array, indexesOf(array, element));
    }

```

### RedundantCast
Casting `array` to `Object` is redundant
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static float[] removeAllOccurrences(final float[] array, final float element) {
        return (float[]) removeAll((Object) array, indexesOf(array, element));
    }

```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`0xffffffff & (src >> shift)` can be replaced with '(src \>\> shift)'
in `src/main/java/org/apache/commons/lang3/Conversion.java`
#### Snippet
```java
        for (int i = 0; i < nInts; i++) {
            final int shift = i * 32 + srcPos;
            dst[dstPos + i] = (int) (0xffffffff & (src >> shift));
        }
        return dst;
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0020` can be replaced with ' '
in `src/main/java/org/apache/commons/lang3/CharUtils.java`
#### Snippet
```java

    /**
     * Converts the string to the Unicode format '\u0020'.
     *
     * <p>This format is the Java source code format.</p>
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0020` can be replaced with ' '
in `src/main/java/org/apache/commons/lang3/CharUtils.java`
#### Snippet
```java
     * <pre>
     *   CharUtils.unicodeEscaped(null) = null
     *   CharUtils.unicodeEscaped(' ')  = "\u0020"
     *   CharUtils.unicodeEscaped('A')  = "\u0041"
     * </pre>
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0041` can be replaced with 'A'
in `src/main/java/org/apache/commons/lang3/CharUtils.java`
#### Snippet
```java
     *   CharUtils.unicodeEscaped(null) = null
     *   CharUtils.unicodeEscaped(' ')  = "\u0020"
     *   CharUtils.unicodeEscaped('A')  = "\u0041"
     * </pre>
     *
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0020` can be replaced with ' '
in `src/main/java/org/apache/commons/lang3/CharUtils.java`
#### Snippet
```java

    /**
     * Converts the string to the Unicode format '\u0020'.
     *
     * <p>This format is the Java source code format.</p>
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0020` can be replaced with ' '
in `src/main/java/org/apache/commons/lang3/CharUtils.java`
#### Snippet
```java
     *
     * <pre>
     *   CharUtils.unicodeEscaped(' ') = "\u0020"
     *   CharUtils.unicodeEscaped('A') = "\u0041"
     * </pre>
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0041` can be replaced with 'A'
in `src/main/java/org/apache/commons/lang3/CharUtils.java`
#### Snippet
```java
     * <pre>
     *   CharUtils.unicodeEscaped(' ') = "\u0020"
     *   CharUtils.unicodeEscaped('A') = "\u0041"
     * </pre>
     *
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0192` can be replaced with 'ƒ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
    private static final String[][] HTML40_EXTENDED_ESCAPE = {
        // <!-- Latin Extended-B -->
        {"\u0192", "&fnof;"}, // latin small f with hook = function= florin, U+0192 ISOtech -->
        // <!-- Greek -->
        {"\u0391", "&Alpha;"}, // greek capital letter alpha, U+0391 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0391` can be replaced with 'Α'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u0192", "&fnof;"}, // latin small f with hook = function= florin, U+0192 ISOtech -->
        // <!-- Greek -->
        {"\u0391", "&Alpha;"}, // greek capital letter alpha, U+0391 -->
        {"\u0392", "&Beta;"}, // greek capital letter beta, U+0392 -->
        {"\u0393", "&Gamma;"}, // greek capital letter gamma, U+0393 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0392` can be replaced with 'Β'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // <!-- Greek -->
        {"\u0391", "&Alpha;"}, // greek capital letter alpha, U+0391 -->
        {"\u0392", "&Beta;"}, // greek capital letter beta, U+0392 -->
        {"\u0393", "&Gamma;"}, // greek capital letter gamma, U+0393 ISOgrk3 -->
        {"\u0394", "&Delta;"}, // greek capital letter delta, U+0394 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0393` can be replaced with 'Γ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u0391", "&Alpha;"}, // greek capital letter alpha, U+0391 -->
        {"\u0392", "&Beta;"}, // greek capital letter beta, U+0392 -->
        {"\u0393", "&Gamma;"}, // greek capital letter gamma, U+0393 ISOgrk3 -->
        {"\u0394", "&Delta;"}, // greek capital letter delta, U+0394 ISOgrk3 -->
        {"\u0395", "&Epsilon;"}, // greek capital letter epsilon, U+0395 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0394` can be replaced with 'Δ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u0392", "&Beta;"}, // greek capital letter beta, U+0392 -->
        {"\u0393", "&Gamma;"}, // greek capital letter gamma, U+0393 ISOgrk3 -->
        {"\u0394", "&Delta;"}, // greek capital letter delta, U+0394 ISOgrk3 -->
        {"\u0395", "&Epsilon;"}, // greek capital letter epsilon, U+0395 -->
        {"\u0396", "&Zeta;"}, // greek capital letter zeta, U+0396 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0395` can be replaced with 'Ε'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u0393", "&Gamma;"}, // greek capital letter gamma, U+0393 ISOgrk3 -->
        {"\u0394", "&Delta;"}, // greek capital letter delta, U+0394 ISOgrk3 -->
        {"\u0395", "&Epsilon;"}, // greek capital letter epsilon, U+0395 -->
        {"\u0396", "&Zeta;"}, // greek capital letter zeta, U+0396 -->
        {"\u0397", "&Eta;"}, // greek capital letter eta, U+0397 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0396` can be replaced with 'Ζ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u0394", "&Delta;"}, // greek capital letter delta, U+0394 ISOgrk3 -->
        {"\u0395", "&Epsilon;"}, // greek capital letter epsilon, U+0395 -->
        {"\u0396", "&Zeta;"}, // greek capital letter zeta, U+0396 -->
        {"\u0397", "&Eta;"}, // greek capital letter eta, U+0397 -->
        {"\u0398", "&Theta;"}, // greek capital letter theta, U+0398 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0397` can be replaced with 'Η'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u0395", "&Epsilon;"}, // greek capital letter epsilon, U+0395 -->
        {"\u0396", "&Zeta;"}, // greek capital letter zeta, U+0396 -->
        {"\u0397", "&Eta;"}, // greek capital letter eta, U+0397 -->
        {"\u0398", "&Theta;"}, // greek capital letter theta, U+0398 ISOgrk3 -->
        {"\u0399", "&Iota;"}, // greek capital letter iota, U+0399 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0398` can be replaced with 'Θ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u0396", "&Zeta;"}, // greek capital letter zeta, U+0396 -->
        {"\u0397", "&Eta;"}, // greek capital letter eta, U+0397 -->
        {"\u0398", "&Theta;"}, // greek capital letter theta, U+0398 ISOgrk3 -->
        {"\u0399", "&Iota;"}, // greek capital letter iota, U+0399 -->
        {"\u039A", "&Kappa;"}, // greek capital letter kappa, U+039A -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0399` can be replaced with 'Ι'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u0397", "&Eta;"}, // greek capital letter eta, U+0397 -->
        {"\u0398", "&Theta;"}, // greek capital letter theta, U+0398 ISOgrk3 -->
        {"\u0399", "&Iota;"}, // greek capital letter iota, U+0399 -->
        {"\u039A", "&Kappa;"}, // greek capital letter kappa, U+039A -->
        {"\u039B", "&Lambda;"}, // greek capital letter lambda, U+039B ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u039A` can be replaced with 'Κ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u0398", "&Theta;"}, // greek capital letter theta, U+0398 ISOgrk3 -->
        {"\u0399", "&Iota;"}, // greek capital letter iota, U+0399 -->
        {"\u039A", "&Kappa;"}, // greek capital letter kappa, U+039A -->
        {"\u039B", "&Lambda;"}, // greek capital letter lambda, U+039B ISOgrk3 -->
        {"\u039C", "&Mu;"}, // greek capital letter mu, U+039C -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u039B` can be replaced with 'Λ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u0399", "&Iota;"}, // greek capital letter iota, U+0399 -->
        {"\u039A", "&Kappa;"}, // greek capital letter kappa, U+039A -->
        {"\u039B", "&Lambda;"}, // greek capital letter lambda, U+039B ISOgrk3 -->
        {"\u039C", "&Mu;"}, // greek capital letter mu, U+039C -->
        {"\u039D", "&Nu;"}, // greek capital letter nu, U+039D -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u039C` can be replaced with 'Μ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u039A", "&Kappa;"}, // greek capital letter kappa, U+039A -->
        {"\u039B", "&Lambda;"}, // greek capital letter lambda, U+039B ISOgrk3 -->
        {"\u039C", "&Mu;"}, // greek capital letter mu, U+039C -->
        {"\u039D", "&Nu;"}, // greek capital letter nu, U+039D -->
        {"\u039E", "&Xi;"}, // greek capital letter xi, U+039E ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u039D` can be replaced with 'Ν'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u039B", "&Lambda;"}, // greek capital letter lambda, U+039B ISOgrk3 -->
        {"\u039C", "&Mu;"}, // greek capital letter mu, U+039C -->
        {"\u039D", "&Nu;"}, // greek capital letter nu, U+039D -->
        {"\u039E", "&Xi;"}, // greek capital letter xi, U+039E ISOgrk3 -->
        {"\u039F", "&Omicron;"}, // greek capital letter omicron, U+039F -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u039E` can be replaced with 'Ξ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u039C", "&Mu;"}, // greek capital letter mu, U+039C -->
        {"\u039D", "&Nu;"}, // greek capital letter nu, U+039D -->
        {"\u039E", "&Xi;"}, // greek capital letter xi, U+039E ISOgrk3 -->
        {"\u039F", "&Omicron;"}, // greek capital letter omicron, U+039F -->
        {"\u03A0", "&Pi;"}, // greek capital letter pi, U+03A0 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u039F` can be replaced with 'Ο'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u039D", "&Nu;"}, // greek capital letter nu, U+039D -->
        {"\u039E", "&Xi;"}, // greek capital letter xi, U+039E ISOgrk3 -->
        {"\u039F", "&Omicron;"}, // greek capital letter omicron, U+039F -->
        {"\u03A0", "&Pi;"}, // greek capital letter pi, U+03A0 ISOgrk3 -->
        {"\u03A1", "&Rho;"}, // greek capital letter rho, U+03A1 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03A0` can be replaced with 'Π'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u039E", "&Xi;"}, // greek capital letter xi, U+039E ISOgrk3 -->
        {"\u039F", "&Omicron;"}, // greek capital letter omicron, U+039F -->
        {"\u03A0", "&Pi;"}, // greek capital letter pi, U+03A0 ISOgrk3 -->
        {"\u03A1", "&Rho;"}, // greek capital letter rho, U+03A1 -->
        // <!-- there is no Sigmaf, and no U+03A2 character either -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03A1` can be replaced with 'Ρ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u039F", "&Omicron;"}, // greek capital letter omicron, U+039F -->
        {"\u03A0", "&Pi;"}, // greek capital letter pi, U+03A0 ISOgrk3 -->
        {"\u03A1", "&Rho;"}, // greek capital letter rho, U+03A1 -->
        // <!-- there is no Sigmaf, and no U+03A2 character either -->
        {"\u03A3", "&Sigma;"}, // greek capital letter sigma, U+03A3 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03A3` can be replaced with 'Σ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03A1", "&Rho;"}, // greek capital letter rho, U+03A1 -->
        // <!-- there is no Sigmaf, and no U+03A2 character either -->
        {"\u03A3", "&Sigma;"}, // greek capital letter sigma, U+03A3 ISOgrk3 -->
        {"\u03A4", "&Tau;"}, // greek capital letter tau, U+03A4 -->
        {"\u03A5", "&Upsilon;"}, // greek capital letter upsilon, U+03A5 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03A4` can be replaced with 'Τ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // <!-- there is no Sigmaf, and no U+03A2 character either -->
        {"\u03A3", "&Sigma;"}, // greek capital letter sigma, U+03A3 ISOgrk3 -->
        {"\u03A4", "&Tau;"}, // greek capital letter tau, U+03A4 -->
        {"\u03A5", "&Upsilon;"}, // greek capital letter upsilon, U+03A5 ISOgrk3 -->
        {"\u03A6", "&Phi;"}, // greek capital letter phi, U+03A6 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03A5` can be replaced with 'Υ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03A3", "&Sigma;"}, // greek capital letter sigma, U+03A3 ISOgrk3 -->
        {"\u03A4", "&Tau;"}, // greek capital letter tau, U+03A4 -->
        {"\u03A5", "&Upsilon;"}, // greek capital letter upsilon, U+03A5 ISOgrk3 -->
        {"\u03A6", "&Phi;"}, // greek capital letter phi, U+03A6 ISOgrk3 -->
        {"\u03A7", "&Chi;"}, // greek capital letter chi, U+03A7 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03A6` can be replaced with 'Φ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03A4", "&Tau;"}, // greek capital letter tau, U+03A4 -->
        {"\u03A5", "&Upsilon;"}, // greek capital letter upsilon, U+03A5 ISOgrk3 -->
        {"\u03A6", "&Phi;"}, // greek capital letter phi, U+03A6 ISOgrk3 -->
        {"\u03A7", "&Chi;"}, // greek capital letter chi, U+03A7 -->
        {"\u03A8", "&Psi;"}, // greek capital letter psi, U+03A8 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03A7` can be replaced with 'Χ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03A5", "&Upsilon;"}, // greek capital letter upsilon, U+03A5 ISOgrk3 -->
        {"\u03A6", "&Phi;"}, // greek capital letter phi, U+03A6 ISOgrk3 -->
        {"\u03A7", "&Chi;"}, // greek capital letter chi, U+03A7 -->
        {"\u03A8", "&Psi;"}, // greek capital letter psi, U+03A8 ISOgrk3 -->
        {"\u03A9", "&Omega;"}, // greek capital letter omega, U+03A9 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03A8` can be replaced with 'Ψ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03A6", "&Phi;"}, // greek capital letter phi, U+03A6 ISOgrk3 -->
        {"\u03A7", "&Chi;"}, // greek capital letter chi, U+03A7 -->
        {"\u03A8", "&Psi;"}, // greek capital letter psi, U+03A8 ISOgrk3 -->
        {"\u03A9", "&Omega;"}, // greek capital letter omega, U+03A9 ISOgrk3 -->
        {"\u03B1", "&alpha;"}, // greek small letter alpha, U+03B1 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03A9` can be replaced with 'Ω'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03A7", "&Chi;"}, // greek capital letter chi, U+03A7 -->
        {"\u03A8", "&Psi;"}, // greek capital letter psi, U+03A8 ISOgrk3 -->
        {"\u03A9", "&Omega;"}, // greek capital letter omega, U+03A9 ISOgrk3 -->
        {"\u03B1", "&alpha;"}, // greek small letter alpha, U+03B1 ISOgrk3 -->
        {"\u03B2", "&beta;"}, // greek small letter beta, U+03B2 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03B1` can be replaced with 'α'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03A8", "&Psi;"}, // greek capital letter psi, U+03A8 ISOgrk3 -->
        {"\u03A9", "&Omega;"}, // greek capital letter omega, U+03A9 ISOgrk3 -->
        {"\u03B1", "&alpha;"}, // greek small letter alpha, U+03B1 ISOgrk3 -->
        {"\u03B2", "&beta;"}, // greek small letter beta, U+03B2 ISOgrk3 -->
        {"\u03B3", "&gamma;"}, // greek small letter gamma, U+03B3 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03B2` can be replaced with 'β'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03A9", "&Omega;"}, // greek capital letter omega, U+03A9 ISOgrk3 -->
        {"\u03B1", "&alpha;"}, // greek small letter alpha, U+03B1 ISOgrk3 -->
        {"\u03B2", "&beta;"}, // greek small letter beta, U+03B2 ISOgrk3 -->
        {"\u03B3", "&gamma;"}, // greek small letter gamma, U+03B3 ISOgrk3 -->
        {"\u03B4", "&delta;"}, // greek small letter delta, U+03B4 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03B3` can be replaced with 'γ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03B1", "&alpha;"}, // greek small letter alpha, U+03B1 ISOgrk3 -->
        {"\u03B2", "&beta;"}, // greek small letter beta, U+03B2 ISOgrk3 -->
        {"\u03B3", "&gamma;"}, // greek small letter gamma, U+03B3 ISOgrk3 -->
        {"\u03B4", "&delta;"}, // greek small letter delta, U+03B4 ISOgrk3 -->
        {"\u03B5", "&epsilon;"}, // greek small letter epsilon, U+03B5 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03B4` can be replaced with 'δ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03B2", "&beta;"}, // greek small letter beta, U+03B2 ISOgrk3 -->
        {"\u03B3", "&gamma;"}, // greek small letter gamma, U+03B3 ISOgrk3 -->
        {"\u03B4", "&delta;"}, // greek small letter delta, U+03B4 ISOgrk3 -->
        {"\u03B5", "&epsilon;"}, // greek small letter epsilon, U+03B5 ISOgrk3 -->
        {"\u03B6", "&zeta;"}, // greek small letter zeta, U+03B6 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03B5` can be replaced with 'ε'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03B3", "&gamma;"}, // greek small letter gamma, U+03B3 ISOgrk3 -->
        {"\u03B4", "&delta;"}, // greek small letter delta, U+03B4 ISOgrk3 -->
        {"\u03B5", "&epsilon;"}, // greek small letter epsilon, U+03B5 ISOgrk3 -->
        {"\u03B6", "&zeta;"}, // greek small letter zeta, U+03B6 ISOgrk3 -->
        {"\u03B7", "&eta;"}, // greek small letter eta, U+03B7 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03B6` can be replaced with 'ζ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03B4", "&delta;"}, // greek small letter delta, U+03B4 ISOgrk3 -->
        {"\u03B5", "&epsilon;"}, // greek small letter epsilon, U+03B5 ISOgrk3 -->
        {"\u03B6", "&zeta;"}, // greek small letter zeta, U+03B6 ISOgrk3 -->
        {"\u03B7", "&eta;"}, // greek small letter eta, U+03B7 ISOgrk3 -->
        {"\u03B8", "&theta;"}, // greek small letter theta, U+03B8 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03B7` can be replaced with 'η'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03B5", "&epsilon;"}, // greek small letter epsilon, U+03B5 ISOgrk3 -->
        {"\u03B6", "&zeta;"}, // greek small letter zeta, U+03B6 ISOgrk3 -->
        {"\u03B7", "&eta;"}, // greek small letter eta, U+03B7 ISOgrk3 -->
        {"\u03B8", "&theta;"}, // greek small letter theta, U+03B8 ISOgrk3 -->
        {"\u03B9", "&iota;"}, // greek small letter iota, U+03B9 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03B8` can be replaced with 'θ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03B6", "&zeta;"}, // greek small letter zeta, U+03B6 ISOgrk3 -->
        {"\u03B7", "&eta;"}, // greek small letter eta, U+03B7 ISOgrk3 -->
        {"\u03B8", "&theta;"}, // greek small letter theta, U+03B8 ISOgrk3 -->
        {"\u03B9", "&iota;"}, // greek small letter iota, U+03B9 ISOgrk3 -->
        {"\u03BA", "&kappa;"}, // greek small letter kappa, U+03BA ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03B9` can be replaced with 'ι'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03B7", "&eta;"}, // greek small letter eta, U+03B7 ISOgrk3 -->
        {"\u03B8", "&theta;"}, // greek small letter theta, U+03B8 ISOgrk3 -->
        {"\u03B9", "&iota;"}, // greek small letter iota, U+03B9 ISOgrk3 -->
        {"\u03BA", "&kappa;"}, // greek small letter kappa, U+03BA ISOgrk3 -->
        {"\u03BB", "&lambda;"}, // greek small letter lambda, U+03BB ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03BA` can be replaced with 'κ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03B8", "&theta;"}, // greek small letter theta, U+03B8 ISOgrk3 -->
        {"\u03B9", "&iota;"}, // greek small letter iota, U+03B9 ISOgrk3 -->
        {"\u03BA", "&kappa;"}, // greek small letter kappa, U+03BA ISOgrk3 -->
        {"\u03BB", "&lambda;"}, // greek small letter lambda, U+03BB ISOgrk3 -->
        {"\u03BC", "&mu;"}, // greek small letter mu, U+03BC ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03BB` can be replaced with 'λ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03B9", "&iota;"}, // greek small letter iota, U+03B9 ISOgrk3 -->
        {"\u03BA", "&kappa;"}, // greek small letter kappa, U+03BA ISOgrk3 -->
        {"\u03BB", "&lambda;"}, // greek small letter lambda, U+03BB ISOgrk3 -->
        {"\u03BC", "&mu;"}, // greek small letter mu, U+03BC ISOgrk3 -->
        {"\u03BD", "&nu;"}, // greek small letter nu, U+03BD ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03BC` can be replaced with 'μ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03BA", "&kappa;"}, // greek small letter kappa, U+03BA ISOgrk3 -->
        {"\u03BB", "&lambda;"}, // greek small letter lambda, U+03BB ISOgrk3 -->
        {"\u03BC", "&mu;"}, // greek small letter mu, U+03BC ISOgrk3 -->
        {"\u03BD", "&nu;"}, // greek small letter nu, U+03BD ISOgrk3 -->
        {"\u03BE", "&xi;"}, // greek small letter xi, U+03BE ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03BD` can be replaced with 'ν'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03BB", "&lambda;"}, // greek small letter lambda, U+03BB ISOgrk3 -->
        {"\u03BC", "&mu;"}, // greek small letter mu, U+03BC ISOgrk3 -->
        {"\u03BD", "&nu;"}, // greek small letter nu, U+03BD ISOgrk3 -->
        {"\u03BE", "&xi;"}, // greek small letter xi, U+03BE ISOgrk3 -->
        {"\u03BF", "&omicron;"}, // greek small letter omicron, U+03BF NEW -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03BE` can be replaced with 'ξ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03BC", "&mu;"}, // greek small letter mu, U+03BC ISOgrk3 -->
        {"\u03BD", "&nu;"}, // greek small letter nu, U+03BD ISOgrk3 -->
        {"\u03BE", "&xi;"}, // greek small letter xi, U+03BE ISOgrk3 -->
        {"\u03BF", "&omicron;"}, // greek small letter omicron, U+03BF NEW -->
        {"\u03C0", "&pi;"}, // greek small letter pi, U+03C0 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03BF` can be replaced with 'ο'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03BD", "&nu;"}, // greek small letter nu, U+03BD ISOgrk3 -->
        {"\u03BE", "&xi;"}, // greek small letter xi, U+03BE ISOgrk3 -->
        {"\u03BF", "&omicron;"}, // greek small letter omicron, U+03BF NEW -->
        {"\u03C0", "&pi;"}, // greek small letter pi, U+03C0 ISOgrk3 -->
        {"\u03C1", "&rho;"}, // greek small letter rho, U+03C1 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03C0` can be replaced with 'π'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03BE", "&xi;"}, // greek small letter xi, U+03BE ISOgrk3 -->
        {"\u03BF", "&omicron;"}, // greek small letter omicron, U+03BF NEW -->
        {"\u03C0", "&pi;"}, // greek small letter pi, U+03C0 ISOgrk3 -->
        {"\u03C1", "&rho;"}, // greek small letter rho, U+03C1 ISOgrk3 -->
        {"\u03C2", "&sigmaf;"}, // greek small letter final sigma, U+03C2 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03C1` can be replaced with 'ρ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03BF", "&omicron;"}, // greek small letter omicron, U+03BF NEW -->
        {"\u03C0", "&pi;"}, // greek small letter pi, U+03C0 ISOgrk3 -->
        {"\u03C1", "&rho;"}, // greek small letter rho, U+03C1 ISOgrk3 -->
        {"\u03C2", "&sigmaf;"}, // greek small letter final sigma, U+03C2 ISOgrk3 -->
        {"\u03C3", "&sigma;"}, // greek small letter sigma, U+03C3 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03C2` can be replaced with 'ς'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03C0", "&pi;"}, // greek small letter pi, U+03C0 ISOgrk3 -->
        {"\u03C1", "&rho;"}, // greek small letter rho, U+03C1 ISOgrk3 -->
        {"\u03C2", "&sigmaf;"}, // greek small letter final sigma, U+03C2 ISOgrk3 -->
        {"\u03C3", "&sigma;"}, // greek small letter sigma, U+03C3 ISOgrk3 -->
        {"\u03C4", "&tau;"}, // greek small letter tau, U+03C4 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03C3` can be replaced with 'σ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03C1", "&rho;"}, // greek small letter rho, U+03C1 ISOgrk3 -->
        {"\u03C2", "&sigmaf;"}, // greek small letter final sigma, U+03C2 ISOgrk3 -->
        {"\u03C3", "&sigma;"}, // greek small letter sigma, U+03C3 ISOgrk3 -->
        {"\u03C4", "&tau;"}, // greek small letter tau, U+03C4 ISOgrk3 -->
        {"\u03C5", "&upsilon;"}, // greek small letter upsilon, U+03C5 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03C4` can be replaced with 'τ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03C2", "&sigmaf;"}, // greek small letter final sigma, U+03C2 ISOgrk3 -->
        {"\u03C3", "&sigma;"}, // greek small letter sigma, U+03C3 ISOgrk3 -->
        {"\u03C4", "&tau;"}, // greek small letter tau, U+03C4 ISOgrk3 -->
        {"\u03C5", "&upsilon;"}, // greek small letter upsilon, U+03C5 ISOgrk3 -->
        {"\u03C6", "&phi;"}, // greek small letter phi, U+03C6 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03C5` can be replaced with 'υ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03C3", "&sigma;"}, // greek small letter sigma, U+03C3 ISOgrk3 -->
        {"\u03C4", "&tau;"}, // greek small letter tau, U+03C4 ISOgrk3 -->
        {"\u03C5", "&upsilon;"}, // greek small letter upsilon, U+03C5 ISOgrk3 -->
        {"\u03C6", "&phi;"}, // greek small letter phi, U+03C6 ISOgrk3 -->
        {"\u03C7", "&chi;"}, // greek small letter chi, U+03C7 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03C6` can be replaced with 'φ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03C4", "&tau;"}, // greek small letter tau, U+03C4 ISOgrk3 -->
        {"\u03C5", "&upsilon;"}, // greek small letter upsilon, U+03C5 ISOgrk3 -->
        {"\u03C6", "&phi;"}, // greek small letter phi, U+03C6 ISOgrk3 -->
        {"\u03C7", "&chi;"}, // greek small letter chi, U+03C7 ISOgrk3 -->
        {"\u03C8", "&psi;"}, // greek small letter psi, U+03C8 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03C7` can be replaced with 'χ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03C5", "&upsilon;"}, // greek small letter upsilon, U+03C5 ISOgrk3 -->
        {"\u03C6", "&phi;"}, // greek small letter phi, U+03C6 ISOgrk3 -->
        {"\u03C7", "&chi;"}, // greek small letter chi, U+03C7 ISOgrk3 -->
        {"\u03C8", "&psi;"}, // greek small letter psi, U+03C8 ISOgrk3 -->
        {"\u03C9", "&omega;"}, // greek small letter omega, U+03C9 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03C8` can be replaced with 'ψ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03C6", "&phi;"}, // greek small letter phi, U+03C6 ISOgrk3 -->
        {"\u03C7", "&chi;"}, // greek small letter chi, U+03C7 ISOgrk3 -->
        {"\u03C8", "&psi;"}, // greek small letter psi, U+03C8 ISOgrk3 -->
        {"\u03C9", "&omega;"}, // greek small letter omega, U+03C9 ISOgrk3 -->
        {"\u03D1", "&thetasym;"}, // greek small letter theta symbol, U+03D1 NEW -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03C9` can be replaced with 'ω'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03C7", "&chi;"}, // greek small letter chi, U+03C7 ISOgrk3 -->
        {"\u03C8", "&psi;"}, // greek small letter psi, U+03C8 ISOgrk3 -->
        {"\u03C9", "&omega;"}, // greek small letter omega, U+03C9 ISOgrk3 -->
        {"\u03D1", "&thetasym;"}, // greek small letter theta symbol, U+03D1 NEW -->
        {"\u03D2", "&upsih;"}, // greek upsilon with hook symbol, U+03D2 NEW -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03D1` can be replaced with 'ϑ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03C8", "&psi;"}, // greek small letter psi, U+03C8 ISOgrk3 -->
        {"\u03C9", "&omega;"}, // greek small letter omega, U+03C9 ISOgrk3 -->
        {"\u03D1", "&thetasym;"}, // greek small letter theta symbol, U+03D1 NEW -->
        {"\u03D2", "&upsih;"}, // greek upsilon with hook symbol, U+03D2 NEW -->
        {"\u03D6", "&piv;"}, // greek pi symbol, U+03D6 ISOgrk3 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03D2` can be replaced with 'ϒ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03C9", "&omega;"}, // greek small letter omega, U+03C9 ISOgrk3 -->
        {"\u03D1", "&thetasym;"}, // greek small letter theta symbol, U+03D1 NEW -->
        {"\u03D2", "&upsih;"}, // greek upsilon with hook symbol, U+03D2 NEW -->
        {"\u03D6", "&piv;"}, // greek pi symbol, U+03D6 ISOgrk3 -->
        // <!-- General Punctuation -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u03D6` can be replaced with 'ϖ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03D1", "&thetasym;"}, // greek small letter theta symbol, U+03D1 NEW -->
        {"\u03D2", "&upsih;"}, // greek upsilon with hook symbol, U+03D2 NEW -->
        {"\u03D6", "&piv;"}, // greek pi symbol, U+03D6 ISOgrk3 -->
        // <!-- General Punctuation -->
        {"\u2022", "&bull;"}, // bullet = black small circle, U+2022 ISOpub -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2022` can be replaced with '•'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u03D6", "&piv;"}, // greek pi symbol, U+03D6 ISOgrk3 -->
        // <!-- General Punctuation -->
        {"\u2022", "&bull;"}, // bullet = black small circle, U+2022 ISOpub -->
        // <!-- bullet is NOT the same as bullet operator, U+2219 -->
        {"\u2026", "&hellip;"}, // horizontal ellipsis = three dot leader, U+2026 ISOpub -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2026` can be replaced with '...'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2022", "&bull;"}, // bullet = black small circle, U+2022 ISOpub -->
        // <!-- bullet is NOT the same as bullet operator, U+2219 -->
        {"\u2026", "&hellip;"}, // horizontal ellipsis = three dot leader, U+2026 ISOpub -->
        {"\u2032", "&prime;"}, // prime = minutes = feet, U+2032 ISOtech -->
        {"\u2033", "&Prime;"}, // double prime = seconds = inches, U+2033 ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2032` can be replaced with '′'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // <!-- bullet is NOT the same as bullet operator, U+2219 -->
        {"\u2026", "&hellip;"}, // horizontal ellipsis = three dot leader, U+2026 ISOpub -->
        {"\u2032", "&prime;"}, // prime = minutes = feet, U+2032 ISOtech -->
        {"\u2033", "&Prime;"}, // double prime = seconds = inches, U+2033 ISOtech -->
        {"\u203E", "&oline;"}, // overline = spacing overscore, U+203E NEW -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2033` can be replaced with '″'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2026", "&hellip;"}, // horizontal ellipsis = three dot leader, U+2026 ISOpub -->
        {"\u2032", "&prime;"}, // prime = minutes = feet, U+2032 ISOtech -->
        {"\u2033", "&Prime;"}, // double prime = seconds = inches, U+2033 ISOtech -->
        {"\u203E", "&oline;"}, // overline = spacing overscore, U+203E NEW -->
        {"\u2044", "&frasl;"}, // fraction slash, U+2044 NEW -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u203E` can be replaced with '‾'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2032", "&prime;"}, // prime = minutes = feet, U+2032 ISOtech -->
        {"\u2033", "&Prime;"}, // double prime = seconds = inches, U+2033 ISOtech -->
        {"\u203E", "&oline;"}, // overline = spacing overscore, U+203E NEW -->
        {"\u2044", "&frasl;"}, // fraction slash, U+2044 NEW -->
        // <!-- Letterlike Symbols -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2044` can be replaced with '⁄'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2033", "&Prime;"}, // double prime = seconds = inches, U+2033 ISOtech -->
        {"\u203E", "&oline;"}, // overline = spacing overscore, U+203E NEW -->
        {"\u2044", "&frasl;"}, // fraction slash, U+2044 NEW -->
        // <!-- Letterlike Symbols -->
        {"\u2118", "&weierp;"}, // script capital P = power set= Weierstrass p, U+2118 ISOamso -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2118` can be replaced with '℘'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2044", "&frasl;"}, // fraction slash, U+2044 NEW -->
        // <!-- Letterlike Symbols -->
        {"\u2118", "&weierp;"}, // script capital P = power set= Weierstrass p, U+2118 ISOamso -->
        {"\u2111", "&image;"}, // blackletter capital I = imaginary part, U+2111 ISOamso -->
        {"\u211C", "&real;"}, // blackletter capital R = real part symbol, U+211C ISOamso -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2111` can be replaced with 'ℑ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // <!-- Letterlike Symbols -->
        {"\u2118", "&weierp;"}, // script capital P = power set= Weierstrass p, U+2118 ISOamso -->
        {"\u2111", "&image;"}, // blackletter capital I = imaginary part, U+2111 ISOamso -->
        {"\u211C", "&real;"}, // blackletter capital R = real part symbol, U+211C ISOamso -->
        {"\u2122", "&trade;"}, // trade mark sign, U+2122 ISOnum -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u211C` can be replaced with 'ℜ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2118", "&weierp;"}, // script capital P = power set= Weierstrass p, U+2118 ISOamso -->
        {"\u2111", "&image;"}, // blackletter capital I = imaginary part, U+2111 ISOamso -->
        {"\u211C", "&real;"}, // blackletter capital R = real part symbol, U+211C ISOamso -->
        {"\u2122", "&trade;"}, // trade mark sign, U+2122 ISOnum -->
        {"\u2135", "&alefsym;"}, // alef symbol = first transfinite cardinal, U+2135 NEW -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2122` can be replaced with '™'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2111", "&image;"}, // blackletter capital I = imaginary part, U+2111 ISOamso -->
        {"\u211C", "&real;"}, // blackletter capital R = real part symbol, U+211C ISOamso -->
        {"\u2122", "&trade;"}, // trade mark sign, U+2122 ISOnum -->
        {"\u2135", "&alefsym;"}, // alef symbol = first transfinite cardinal, U+2135 NEW -->
        // <!-- alef symbol is NOT the same as hebrew letter alef, U+05D0 although the
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2135` can be replaced with 'ℵ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u211C", "&real;"}, // blackletter capital R = real part symbol, U+211C ISOamso -->
        {"\u2122", "&trade;"}, // trade mark sign, U+2122 ISOnum -->
        {"\u2135", "&alefsym;"}, // alef symbol = first transfinite cardinal, U+2135 NEW -->
        // <!-- alef symbol is NOT the same as hebrew letter alef, U+05D0 although the
        // same glyph could be used to depict both characters -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2190` can be replaced with '←'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // same glyph could be used to depict both characters -->
        // <!-- Arrows -->
        {"\u2190", "&larr;"}, // leftwards arrow, U+2190 ISOnum -->
        {"\u2191", "&uarr;"}, // upwards arrow, U+2191 ISOnum-->
        {"\u2192", "&rarr;"}, // rightwards arrow, U+2192 ISOnum -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2191` can be replaced with '↑'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // <!-- Arrows -->
        {"\u2190", "&larr;"}, // leftwards arrow, U+2190 ISOnum -->
        {"\u2191", "&uarr;"}, // upwards arrow, U+2191 ISOnum-->
        {"\u2192", "&rarr;"}, // rightwards arrow, U+2192 ISOnum -->
        {"\u2193", "&darr;"}, // downwards arrow, U+2193 ISOnum -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2192` can be replaced with '→'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2190", "&larr;"}, // leftwards arrow, U+2190 ISOnum -->
        {"\u2191", "&uarr;"}, // upwards arrow, U+2191 ISOnum-->
        {"\u2192", "&rarr;"}, // rightwards arrow, U+2192 ISOnum -->
        {"\u2193", "&darr;"}, // downwards arrow, U+2193 ISOnum -->
        {"\u2194", "&harr;"}, // left right arrow, U+2194 ISOamsa -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2193` can be replaced with '↓'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2191", "&uarr;"}, // upwards arrow, U+2191 ISOnum-->
        {"\u2192", "&rarr;"}, // rightwards arrow, U+2192 ISOnum -->
        {"\u2193", "&darr;"}, // downwards arrow, U+2193 ISOnum -->
        {"\u2194", "&harr;"}, // left right arrow, U+2194 ISOamsa -->
        {"\u21B5", "&crarr;"}, // downwards arrow with corner leftwards= carriage return, U+21B5 NEW -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2194` can be replaced with '↔'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2192", "&rarr;"}, // rightwards arrow, U+2192 ISOnum -->
        {"\u2193", "&darr;"}, // downwards arrow, U+2193 ISOnum -->
        {"\u2194", "&harr;"}, // left right arrow, U+2194 ISOamsa -->
        {"\u21B5", "&crarr;"}, // downwards arrow with corner leftwards= carriage return, U+21B5 NEW -->
        {"\u21D0", "&lArr;"}, // leftwards double arrow, U+21D0 ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u21B5` can be replaced with '↵'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2193", "&darr;"}, // downwards arrow, U+2193 ISOnum -->
        {"\u2194", "&harr;"}, // left right arrow, U+2194 ISOamsa -->
        {"\u21B5", "&crarr;"}, // downwards arrow with corner leftwards= carriage return, U+21B5 NEW -->
        {"\u21D0", "&lArr;"}, // leftwards double arrow, U+21D0 ISOtech -->
        // <!-- ISO 10646 does not say that lArr is the same as the 'is implied by'
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u21D0` can be replaced with '⇐'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2194", "&harr;"}, // left right arrow, U+2194 ISOamsa -->
        {"\u21B5", "&crarr;"}, // downwards arrow with corner leftwards= carriage return, U+21B5 NEW -->
        {"\u21D0", "&lArr;"}, // leftwards double arrow, U+21D0 ISOtech -->
        // <!-- ISO 10646 does not say that lArr is the same as the 'is implied by'
        // arrow but also does not have any other character for that function.
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u21D1` can be replaced with '⇑'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // arrow but also does not have any other character for that function.
        // So ? lArr canbe used for 'is implied by' as ISOtech suggests -->
        {"\u21D1", "&uArr;"}, // upwards double arrow, U+21D1 ISOamsa -->
        {"\u21D2", "&rArr;"}, // rightwards double arrow, U+21D2 ISOtech -->
        // <!-- ISO 10646 does not say this is the 'implies' character but does not
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u21D2` can be replaced with '⇒'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // So ? lArr canbe used for 'is implied by' as ISOtech suggests -->
        {"\u21D1", "&uArr;"}, // upwards double arrow, U+21D1 ISOamsa -->
        {"\u21D2", "&rArr;"}, // rightwards double arrow, U+21D2 ISOtech -->
        // <!-- ISO 10646 does not say this is the 'implies' character but does not
        // have another character with this function so ?rArr can be used for
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u21D3` can be replaced with '⇓'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // have another character with this function so ?rArr can be used for
        // 'implies' as ISOtech suggests -->
        {"\u21D3", "&dArr;"}, // downwards double arrow, U+21D3 ISOamsa -->
        {"\u21D4", "&hArr;"}, // left right double arrow, U+21D4 ISOamsa -->
        // <!-- Mathematical Operators -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u21D4` can be replaced with '⇔'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // 'implies' as ISOtech suggests -->
        {"\u21D3", "&dArr;"}, // downwards double arrow, U+21D3 ISOamsa -->
        {"\u21D4", "&hArr;"}, // left right double arrow, U+21D4 ISOamsa -->
        // <!-- Mathematical Operators -->
        {"\u2200", "&forall;"}, // for all, U+2200 ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2200` can be replaced with '∀'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u21D4", "&hArr;"}, // left right double arrow, U+21D4 ISOamsa -->
        // <!-- Mathematical Operators -->
        {"\u2200", "&forall;"}, // for all, U+2200 ISOtech -->
        {"\u2202", "&part;"}, // partial differential, U+2202 ISOtech -->
        {"\u2203", "&exist;"}, // there exists, U+2203 ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2202` can be replaced with '∂'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // <!-- Mathematical Operators -->
        {"\u2200", "&forall;"}, // for all, U+2200 ISOtech -->
        {"\u2202", "&part;"}, // partial differential, U+2202 ISOtech -->
        {"\u2203", "&exist;"}, // there exists, U+2203 ISOtech -->
        {"\u2205", "&empty;"}, // empty set = null set = diameter, U+2205 ISOamso -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2203` can be replaced with '∃'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2200", "&forall;"}, // for all, U+2200 ISOtech -->
        {"\u2202", "&part;"}, // partial differential, U+2202 ISOtech -->
        {"\u2203", "&exist;"}, // there exists, U+2203 ISOtech -->
        {"\u2205", "&empty;"}, // empty set = null set = diameter, U+2205 ISOamso -->
        {"\u2207", "&nabla;"}, // nabla = backward difference, U+2207 ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2205` can be replaced with '∅'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2202", "&part;"}, // partial differential, U+2202 ISOtech -->
        {"\u2203", "&exist;"}, // there exists, U+2203 ISOtech -->
        {"\u2205", "&empty;"}, // empty set = null set = diameter, U+2205 ISOamso -->
        {"\u2207", "&nabla;"}, // nabla = backward difference, U+2207 ISOtech -->
        {"\u2208", "&isin;"}, // element of, U+2208 ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2207` can be replaced with '∇'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2203", "&exist;"}, // there exists, U+2203 ISOtech -->
        {"\u2205", "&empty;"}, // empty set = null set = diameter, U+2205 ISOamso -->
        {"\u2207", "&nabla;"}, // nabla = backward difference, U+2207 ISOtech -->
        {"\u2208", "&isin;"}, // element of, U+2208 ISOtech -->
        {"\u2209", "&notin;"}, // not an element of, U+2209 ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2208` can be replaced with '∈'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2205", "&empty;"}, // empty set = null set = diameter, U+2205 ISOamso -->
        {"\u2207", "&nabla;"}, // nabla = backward difference, U+2207 ISOtech -->
        {"\u2208", "&isin;"}, // element of, U+2208 ISOtech -->
        {"\u2209", "&notin;"}, // not an element of, U+2209 ISOtech -->
        {"\u220B", "&ni;"}, // contains as member, U+220B ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2209` can be replaced with '∉'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2207", "&nabla;"}, // nabla = backward difference, U+2207 ISOtech -->
        {"\u2208", "&isin;"}, // element of, U+2208 ISOtech -->
        {"\u2209", "&notin;"}, // not an element of, U+2209 ISOtech -->
        {"\u220B", "&ni;"}, // contains as member, U+220B ISOtech -->
        // <!-- should there be a more memorable name than 'ni'? -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u220B` can be replaced with '∋'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2208", "&isin;"}, // element of, U+2208 ISOtech -->
        {"\u2209", "&notin;"}, // not an element of, U+2209 ISOtech -->
        {"\u220B", "&ni;"}, // contains as member, U+220B ISOtech -->
        // <!-- should there be a more memorable name than 'ni'? -->
        {"\u220F", "&prod;"}, // n-ary product = product sign, U+220F ISOamsb -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u220F` can be replaced with '∏'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u220B", "&ni;"}, // contains as member, U+220B ISOtech -->
        // <!-- should there be a more memorable name than 'ni'? -->
        {"\u220F", "&prod;"}, // n-ary product = product sign, U+220F ISOamsb -->
        // <!-- prod is NOT the same character as U+03A0 'greek capital letter pi'
        // though the same glyph might be used for both -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2211` can be replaced with '∑'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // <!-- prod is NOT the same character as U+03A0 'greek capital letter pi'
        // though the same glyph might be used for both -->
        {"\u2211", "&sum;"}, // n-ary summation, U+2211 ISOamsb -->
        // <!-- sum is NOT the same character as U+03A3 'greek capital letter sigma'
        // though the same glyph might be used for both -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2212` can be replaced with '−'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // <!-- sum is NOT the same character as U+03A3 'greek capital letter sigma'
        // though the same glyph might be used for both -->
        {"\u2212", "&minus;"}, // minus sign, U+2212 ISOtech -->
        {"\u2217", "&lowast;"}, // asterisk operator, U+2217 ISOtech -->
        {"\u221A", "&radic;"}, // square root = radical sign, U+221A ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2217` can be replaced with '∗'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // though the same glyph might be used for both -->
        {"\u2212", "&minus;"}, // minus sign, U+2212 ISOtech -->
        {"\u2217", "&lowast;"}, // asterisk operator, U+2217 ISOtech -->
        {"\u221A", "&radic;"}, // square root = radical sign, U+221A ISOtech -->
        {"\u221D", "&prop;"}, // proportional to, U+221D ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u221A` can be replaced with '√'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2212", "&minus;"}, // minus sign, U+2212 ISOtech -->
        {"\u2217", "&lowast;"}, // asterisk operator, U+2217 ISOtech -->
        {"\u221A", "&radic;"}, // square root = radical sign, U+221A ISOtech -->
        {"\u221D", "&prop;"}, // proportional to, U+221D ISOtech -->
        {"\u221E", "&infin;"}, // infinity, U+221E ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u221D` can be replaced with '∝'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2217", "&lowast;"}, // asterisk operator, U+2217 ISOtech -->
        {"\u221A", "&radic;"}, // square root = radical sign, U+221A ISOtech -->
        {"\u221D", "&prop;"}, // proportional to, U+221D ISOtech -->
        {"\u221E", "&infin;"}, // infinity, U+221E ISOtech -->
        {"\u2220", "&ang;"}, // angle, U+2220 ISOamso -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u221E` can be replaced with '∞'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u221A", "&radic;"}, // square root = radical sign, U+221A ISOtech -->
        {"\u221D", "&prop;"}, // proportional to, U+221D ISOtech -->
        {"\u221E", "&infin;"}, // infinity, U+221E ISOtech -->
        {"\u2220", "&ang;"}, // angle, U+2220 ISOamso -->
        {"\u2227", "&and;"}, // logical and = wedge, U+2227 ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2220` can be replaced with '∠'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u221D", "&prop;"}, // proportional to, U+221D ISOtech -->
        {"\u221E", "&infin;"}, // infinity, U+221E ISOtech -->
        {"\u2220", "&ang;"}, // angle, U+2220 ISOamso -->
        {"\u2227", "&and;"}, // logical and = wedge, U+2227 ISOtech -->
        {"\u2228", "&or;"}, // logical or = vee, U+2228 ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2227` can be replaced with '∧'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u221E", "&infin;"}, // infinity, U+221E ISOtech -->
        {"\u2220", "&ang;"}, // angle, U+2220 ISOamso -->
        {"\u2227", "&and;"}, // logical and = wedge, U+2227 ISOtech -->
        {"\u2228", "&or;"}, // logical or = vee, U+2228 ISOtech -->
        {"\u2229", "&cap;"}, // intersection = cap, U+2229 ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2228` can be replaced with '∨'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2220", "&ang;"}, // angle, U+2220 ISOamso -->
        {"\u2227", "&and;"}, // logical and = wedge, U+2227 ISOtech -->
        {"\u2228", "&or;"}, // logical or = vee, U+2228 ISOtech -->
        {"\u2229", "&cap;"}, // intersection = cap, U+2229 ISOtech -->
        {"\u222A", "&cup;"}, // union = cup, U+222A ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2229` can be replaced with '∩'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2227", "&and;"}, // logical and = wedge, U+2227 ISOtech -->
        {"\u2228", "&or;"}, // logical or = vee, U+2228 ISOtech -->
        {"\u2229", "&cap;"}, // intersection = cap, U+2229 ISOtech -->
        {"\u222A", "&cup;"}, // union = cup, U+222A ISOtech -->
        {"\u222B", "&int;"}, // integral, U+222B ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u222A` can be replaced with '∪'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2228", "&or;"}, // logical or = vee, U+2228 ISOtech -->
        {"\u2229", "&cap;"}, // intersection = cap, U+2229 ISOtech -->
        {"\u222A", "&cup;"}, // union = cup, U+222A ISOtech -->
        {"\u222B", "&int;"}, // integral, U+222B ISOtech -->
        {"\u2234", "&there4;"}, // therefore, U+2234 ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u222B` can be replaced with '∫'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2229", "&cap;"}, // intersection = cap, U+2229 ISOtech -->
        {"\u222A", "&cup;"}, // union = cup, U+222A ISOtech -->
        {"\u222B", "&int;"}, // integral, U+222B ISOtech -->
        {"\u2234", "&there4;"}, // therefore, U+2234 ISOtech -->
        {"\u223C", "&sim;"}, // tilde operator = varies with = similar to, U+223C ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2234` can be replaced with '∴'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u222A", "&cup;"}, // union = cup, U+222A ISOtech -->
        {"\u222B", "&int;"}, // integral, U+222B ISOtech -->
        {"\u2234", "&there4;"}, // therefore, U+2234 ISOtech -->
        {"\u223C", "&sim;"}, // tilde operator = varies with = similar to, U+223C ISOtech -->
        // <!-- tilde operator is NOT the same character as the tilde, U+007E, although
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u223C` can be replaced with '∼'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u222B", "&int;"}, // integral, U+222B ISOtech -->
        {"\u2234", "&there4;"}, // therefore, U+2234 ISOtech -->
        {"\u223C", "&sim;"}, // tilde operator = varies with = similar to, U+223C ISOtech -->
        // <!-- tilde operator is NOT the same character as the tilde, U+007E, although
        // the same glyph might be used to represent both -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2245` can be replaced with '≅'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // <!-- tilde operator is NOT the same character as the tilde, U+007E, although
        // the same glyph might be used to represent both -->
        {"\u2245", "&cong;"}, // approximately equal to, U+2245 ISOtech -->
        {"\u2248", "&asymp;"}, // almost equal to = asymptotic to, U+2248 ISOamsr -->
        {"\u2260", "&ne;"}, // not equal to, U+2260 ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2248` can be replaced with '≈'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // the same glyph might be used to represent both -->
        {"\u2245", "&cong;"}, // approximately equal to, U+2245 ISOtech -->
        {"\u2248", "&asymp;"}, // almost equal to = asymptotic to, U+2248 ISOamsr -->
        {"\u2260", "&ne;"}, // not equal to, U+2260 ISOtech -->
        {"\u2261", "&equiv;"}, // identical to, U+2261 ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2260` can be replaced with '≠'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2245", "&cong;"}, // approximately equal to, U+2245 ISOtech -->
        {"\u2248", "&asymp;"}, // almost equal to = asymptotic to, U+2248 ISOamsr -->
        {"\u2260", "&ne;"}, // not equal to, U+2260 ISOtech -->
        {"\u2261", "&equiv;"}, // identical to, U+2261 ISOtech -->
        {"\u2264", "&le;"}, // less-than or equal to, U+2264 ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2261` can be replaced with '≡'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2248", "&asymp;"}, // almost equal to = asymptotic to, U+2248 ISOamsr -->
        {"\u2260", "&ne;"}, // not equal to, U+2260 ISOtech -->
        {"\u2261", "&equiv;"}, // identical to, U+2261 ISOtech -->
        {"\u2264", "&le;"}, // less-than or equal to, U+2264 ISOtech -->
        {"\u2265", "&ge;"}, // greater-than or equal to, U+2265 ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2264` can be replaced with '≤'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2260", "&ne;"}, // not equal to, U+2260 ISOtech -->
        {"\u2261", "&equiv;"}, // identical to, U+2261 ISOtech -->
        {"\u2264", "&le;"}, // less-than or equal to, U+2264 ISOtech -->
        {"\u2265", "&ge;"}, // greater-than or equal to, U+2265 ISOtech -->
        {"\u2282", "&sub;"}, // subset of, U+2282 ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2265` can be replaced with '≥'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2261", "&equiv;"}, // identical to, U+2261 ISOtech -->
        {"\u2264", "&le;"}, // less-than or equal to, U+2264 ISOtech -->
        {"\u2265", "&ge;"}, // greater-than or equal to, U+2265 ISOtech -->
        {"\u2282", "&sub;"}, // subset of, U+2282 ISOtech -->
        {"\u2283", "&sup;"}, // superset of, U+2283 ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2282` can be replaced with '⊂'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2264", "&le;"}, // less-than or equal to, U+2264 ISOtech -->
        {"\u2265", "&ge;"}, // greater-than or equal to, U+2265 ISOtech -->
        {"\u2282", "&sub;"}, // subset of, U+2282 ISOtech -->
        {"\u2283", "&sup;"}, // superset of, U+2283 ISOtech -->
        // <!-- note that nsup, 'not a superset of, U+2283' is not covered by the
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2283` can be replaced with '⊃'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2265", "&ge;"}, // greater-than or equal to, U+2265 ISOtech -->
        {"\u2282", "&sub;"}, // subset of, U+2282 ISOtech -->
        {"\u2283", "&sup;"}, // superset of, U+2283 ISOtech -->
        // <!-- note that nsup, 'not a superset of, U+2283' is not covered by the
        // Symbol font encoding and is not included. Should it be, for symmetry?
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2284` can be replaced with '⊄'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // Symbol font encoding and is not included. Should it be, for symmetry?
        // It is in ISOamsn -->,
        {"\u2284", "&nsub;"}, // not a subset of, U+2284 ISOamsn -->
        {"\u2286", "&sube;"}, // subset of or equal to, U+2286 ISOtech -->
        {"\u2287", "&supe;"}, // superset of or equal to, U+2287 ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2286` can be replaced with '⊆'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // It is in ISOamsn -->,
        {"\u2284", "&nsub;"}, // not a subset of, U+2284 ISOamsn -->
        {"\u2286", "&sube;"}, // subset of or equal to, U+2286 ISOtech -->
        {"\u2287", "&supe;"}, // superset of or equal to, U+2287 ISOtech -->
        {"\u2295", "&oplus;"}, // circled plus = direct sum, U+2295 ISOamsb -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2287` can be replaced with '⊇'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2284", "&nsub;"}, // not a subset of, U+2284 ISOamsn -->
        {"\u2286", "&sube;"}, // subset of or equal to, U+2286 ISOtech -->
        {"\u2287", "&supe;"}, // superset of or equal to, U+2287 ISOtech -->
        {"\u2295", "&oplus;"}, // circled plus = direct sum, U+2295 ISOamsb -->
        {"\u2297", "&otimes;"}, // circled times = vector product, U+2297 ISOamsb -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2295` can be replaced with '⊕'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2286", "&sube;"}, // subset of or equal to, U+2286 ISOtech -->
        {"\u2287", "&supe;"}, // superset of or equal to, U+2287 ISOtech -->
        {"\u2295", "&oplus;"}, // circled plus = direct sum, U+2295 ISOamsb -->
        {"\u2297", "&otimes;"}, // circled times = vector product, U+2297 ISOamsb -->
        {"\u22A5", "&perp;"}, // up tack = orthogonal to = perpendicular, U+22A5 ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2297` can be replaced with '⊗'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2287", "&supe;"}, // superset of or equal to, U+2287 ISOtech -->
        {"\u2295", "&oplus;"}, // circled plus = direct sum, U+2295 ISOamsb -->
        {"\u2297", "&otimes;"}, // circled times = vector product, U+2297 ISOamsb -->
        {"\u22A5", "&perp;"}, // up tack = orthogonal to = perpendicular, U+22A5 ISOtech -->
        {"\u22C5", "&sdot;"}, // dot operator, U+22C5 ISOamsb -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u22A5` can be replaced with '⊥'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2295", "&oplus;"}, // circled plus = direct sum, U+2295 ISOamsb -->
        {"\u2297", "&otimes;"}, // circled times = vector product, U+2297 ISOamsb -->
        {"\u22A5", "&perp;"}, // up tack = orthogonal to = perpendicular, U+22A5 ISOtech -->
        {"\u22C5", "&sdot;"}, // dot operator, U+22C5 ISOamsb -->
        // <!-- dot operator is NOT the same character as U+00B7 middle dot -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u22C5` can be replaced with '⋅'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2297", "&otimes;"}, // circled times = vector product, U+2297 ISOamsb -->
        {"\u22A5", "&perp;"}, // up tack = orthogonal to = perpendicular, U+22A5 ISOtech -->
        {"\u22C5", "&sdot;"}, // dot operator, U+22C5 ISOamsb -->
        // <!-- dot operator is NOT the same character as U+00B7 middle dot -->
        // <!-- Miscellaneous Technical -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2308` can be replaced with '⌈'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // <!-- dot operator is NOT the same character as U+00B7 middle dot -->
        // <!-- Miscellaneous Technical -->
        {"\u2308", "&lceil;"}, // left ceiling = apl upstile, U+2308 ISOamsc -->
        {"\u2309", "&rceil;"}, // right ceiling, U+2309 ISOamsc -->
        {"\u230A", "&lfloor;"}, // left floor = apl downstile, U+230A ISOamsc -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2309` can be replaced with '⌉'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // <!-- Miscellaneous Technical -->
        {"\u2308", "&lceil;"}, // left ceiling = apl upstile, U+2308 ISOamsc -->
        {"\u2309", "&rceil;"}, // right ceiling, U+2309 ISOamsc -->
        {"\u230A", "&lfloor;"}, // left floor = apl downstile, U+230A ISOamsc -->
        {"\u230B", "&rfloor;"}, // right floor, U+230B ISOamsc -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u230A` can be replaced with '⌊'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2308", "&lceil;"}, // left ceiling = apl upstile, U+2308 ISOamsc -->
        {"\u2309", "&rceil;"}, // right ceiling, U+2309 ISOamsc -->
        {"\u230A", "&lfloor;"}, // left floor = apl downstile, U+230A ISOamsc -->
        {"\u230B", "&rfloor;"}, // right floor, U+230B ISOamsc -->
        {"\u2329", "&lang;"}, // left-pointing angle bracket = bra, U+2329 ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u230B` can be replaced with '⌋'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2309", "&rceil;"}, // right ceiling, U+2309 ISOamsc -->
        {"\u230A", "&lfloor;"}, // left floor = apl downstile, U+230A ISOamsc -->
        {"\u230B", "&rfloor;"}, // right floor, U+230B ISOamsc -->
        {"\u2329", "&lang;"}, // left-pointing angle bracket = bra, U+2329 ISOtech -->
        // <!-- lang is NOT the same character as U+003C 'less than' or U+2039 'single left-pointing angle quotation
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2329` can be replaced with '〈'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u230A", "&lfloor;"}, // left floor = apl downstile, U+230A ISOamsc -->
        {"\u230B", "&rfloor;"}, // right floor, U+230B ISOamsc -->
        {"\u2329", "&lang;"}, // left-pointing angle bracket = bra, U+2329 ISOtech -->
        // <!-- lang is NOT the same character as U+003C 'less than' or U+2039 'single left-pointing angle quotation
        // mark' -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u232A` can be replaced with '〉'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // <!-- lang is NOT the same character as U+003C 'less than' or U+2039 'single left-pointing angle quotation
        // mark' -->
        {"\u232A", "&rang;"}, // right-pointing angle bracket = ket, U+232A ISOtech -->
        // <!-- rang is NOT the same character as U+003E 'greater than' or U+203A
        // 'single right-pointing angle quotation mark' -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u25CA` can be replaced with '◊'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // 'single right-pointing angle quotation mark' -->
        // <!-- Geometric Shapes -->
        {"\u25CA", "&loz;"}, // lozenge, U+25CA ISOpub -->
        // <!-- Miscellaneous Symbols -->
        {"\u2660", "&spades;"}, // black spade suit, U+2660 ISOpub -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2660` can be replaced with '♠'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u25CA", "&loz;"}, // lozenge, U+25CA ISOpub -->
        // <!-- Miscellaneous Symbols -->
        {"\u2660", "&spades;"}, // black spade suit, U+2660 ISOpub -->
        // <!-- black here seems to mean filled as opposed to hollow -->
        {"\u2663", "&clubs;"}, // black club suit = shamrock, U+2663 ISOpub -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2663` can be replaced with '♣'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2660", "&spades;"}, // black spade suit, U+2660 ISOpub -->
        // <!-- black here seems to mean filled as opposed to hollow -->
        {"\u2663", "&clubs;"}, // black club suit = shamrock, U+2663 ISOpub -->
        {"\u2665", "&hearts;"}, // black heart suit = valentine, U+2665 ISOpub -->
        {"\u2666", "&diams;"}, // black diamond suit, U+2666 ISOpub -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2665` can be replaced with '♥'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // <!-- black here seems to mean filled as opposed to hollow -->
        {"\u2663", "&clubs;"}, // black club suit = shamrock, U+2663 ISOpub -->
        {"\u2665", "&hearts;"}, // black heart suit = valentine, U+2665 ISOpub -->
        {"\u2666", "&diams;"}, // black diamond suit, U+2666 ISOpub -->

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2666` can be replaced with '♦'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2663", "&clubs;"}, // black club suit = shamrock, U+2663 ISOpub -->
        {"\u2665", "&hearts;"}, // black heart suit = valentine, U+2665 ISOpub -->
        {"\u2666", "&diams;"}, // black diamond suit, U+2666 ISOpub -->

        // <!-- Latin Extended-A -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0152` can be replaced with 'Œ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java

        // <!-- Latin Extended-A -->
        {"\u0152", "&OElig;"}, // -- latin capital ligature OE, U+0152 ISOlat2 -->
        {"\u0153", "&oelig;"}, // -- latin small ligature oe, U+0153 ISOlat2 -->
        // <!-- ligature is a misnomer, this is a separate character in some languages -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0153` can be replaced with 'œ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // <!-- Latin Extended-A -->
        {"\u0152", "&OElig;"}, // -- latin capital ligature OE, U+0152 ISOlat2 -->
        {"\u0153", "&oelig;"}, // -- latin small ligature oe, U+0153 ISOlat2 -->
        // <!-- ligature is a misnomer, this is a separate character in some languages -->
        {"\u0160", "&Scaron;"}, // -- latin capital letter S with caron, U+0160 ISOlat2 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0160` can be replaced with 'Š'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u0153", "&oelig;"}, // -- latin small ligature oe, U+0153 ISOlat2 -->
        // <!-- ligature is a misnomer, this is a separate character in some languages -->
        {"\u0160", "&Scaron;"}, // -- latin capital letter S with caron, U+0160 ISOlat2 -->
        {"\u0161", "&scaron;"}, // -- latin small letter s with caron, U+0161 ISOlat2 -->
        {"\u0178", "&Yuml;"}, // -- latin capital letter Y with diaeresis, U+0178 ISOlat2 -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0161` can be replaced with 'š'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // <!-- ligature is a misnomer, this is a separate character in some languages -->
        {"\u0160", "&Scaron;"}, // -- latin capital letter S with caron, U+0160 ISOlat2 -->
        {"\u0161", "&scaron;"}, // -- latin small letter s with caron, U+0161 ISOlat2 -->
        {"\u0178", "&Yuml;"}, // -- latin capital letter Y with diaeresis, U+0178 ISOlat2 -->
        // <!-- Spacing Modifier Letters -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0178` can be replaced with 'Ÿ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u0160", "&Scaron;"}, // -- latin capital letter S with caron, U+0160 ISOlat2 -->
        {"\u0161", "&scaron;"}, // -- latin small letter s with caron, U+0161 ISOlat2 -->
        {"\u0178", "&Yuml;"}, // -- latin capital letter Y with diaeresis, U+0178 ISOlat2 -->
        // <!-- Spacing Modifier Letters -->
        {"\u02C6", "&circ;"}, // -- modifier letter circumflex accent, U+02C6 ISOpub -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u02C6` can be replaced with 'ˆ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u0178", "&Yuml;"}, // -- latin capital letter Y with diaeresis, U+0178 ISOlat2 -->
        // <!-- Spacing Modifier Letters -->
        {"\u02C6", "&circ;"}, // -- modifier letter circumflex accent, U+02C6 ISOpub -->
        {"\u02DC", "&tilde;"}, // small tilde, U+02DC ISOdia -->
        // <!-- General Punctuation -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u02DC` can be replaced with '˜'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        // <!-- Spacing Modifier Letters -->
        {"\u02C6", "&circ;"}, // -- modifier letter circumflex accent, U+02C6 ISOpub -->
        {"\u02DC", "&tilde;"}, // small tilde, U+02DC ISOdia -->
        // <!-- General Punctuation -->
        {"\u2002", "&ensp;"}, // en space, U+2002 ISOpub -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2013` can be replaced with '--'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u200E", "&lrm;"}, // left-to-right mark, U+200E NEW RFC 2070 -->
        {"\u200F", "&rlm;"}, // right-to-left mark, U+200F NEW RFC 2070 -->
        {"\u2013", "&ndash;"}, // en dash, U+2013 ISOpub -->
        {"\u2014", "&mdash;"}, // em dash, U+2014 ISOpub -->
        {"\u2018", "&lsquo;"}, // left single quotation mark, U+2018 ISOnum -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2014` can be replaced with '---'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u200F", "&rlm;"}, // right-to-left mark, U+200F NEW RFC 2070 -->
        {"\u2013", "&ndash;"}, // en dash, U+2013 ISOpub -->
        {"\u2014", "&mdash;"}, // em dash, U+2014 ISOpub -->
        {"\u2018", "&lsquo;"}, // left single quotation mark, U+2018 ISOnum -->
        {"\u2019", "&rsquo;"}, // right single quotation mark, U+2019 ISOnum -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2018` can be replaced with '''
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2013", "&ndash;"}, // en dash, U+2013 ISOpub -->
        {"\u2014", "&mdash;"}, // em dash, U+2014 ISOpub -->
        {"\u2018", "&lsquo;"}, // left single quotation mark, U+2018 ISOnum -->
        {"\u2019", "&rsquo;"}, // right single quotation mark, U+2019 ISOnum -->
        {"\u201A", "&sbquo;"}, // single low-9 quotation mark, U+201A NEW -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2019` can be replaced with '''
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2014", "&mdash;"}, // em dash, U+2014 ISOpub -->
        {"\u2018", "&lsquo;"}, // left single quotation mark, U+2018 ISOnum -->
        {"\u2019", "&rsquo;"}, // right single quotation mark, U+2019 ISOnum -->
        {"\u201A", "&sbquo;"}, // single low-9 quotation mark, U+201A NEW -->
        {"\u201C", "&ldquo;"}, // left double quotation mark, U+201C ISOnum -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u201A` can be replaced with '‚'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2018", "&lsquo;"}, // left single quotation mark, U+2018 ISOnum -->
        {"\u2019", "&rsquo;"}, // right single quotation mark, U+2019 ISOnum -->
        {"\u201A", "&sbquo;"}, // single low-9 quotation mark, U+201A NEW -->
        {"\u201C", "&ldquo;"}, // left double quotation mark, U+201C ISOnum -->
        {"\u201D", "&rdquo;"}, // right double quotation mark, U+201D ISOnum -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u201C` can be replaced with '"'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2019", "&rsquo;"}, // right single quotation mark, U+2019 ISOnum -->
        {"\u201A", "&sbquo;"}, // single low-9 quotation mark, U+201A NEW -->
        {"\u201C", "&ldquo;"}, // left double quotation mark, U+201C ISOnum -->
        {"\u201D", "&rdquo;"}, // right double quotation mark, U+201D ISOnum -->
        {"\u201E", "&bdquo;"}, // double low-9 quotation mark, U+201E NEW -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u201D` can be replaced with '"'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u201A", "&sbquo;"}, // single low-9 quotation mark, U+201A NEW -->
        {"\u201C", "&ldquo;"}, // left double quotation mark, U+201C ISOnum -->
        {"\u201D", "&rdquo;"}, // right double quotation mark, U+201D ISOnum -->
        {"\u201E", "&bdquo;"}, // double low-9 quotation mark, U+201E NEW -->
        {"\u2020", "&dagger;"}, // dagger, U+2020 ISOpub -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u201E` can be replaced with '„'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u201C", "&ldquo;"}, // left double quotation mark, U+201C ISOnum -->
        {"\u201D", "&rdquo;"}, // right double quotation mark, U+201D ISOnum -->
        {"\u201E", "&bdquo;"}, // double low-9 quotation mark, U+201E NEW -->
        {"\u2020", "&dagger;"}, // dagger, U+2020 ISOpub -->
        {"\u2021", "&Dagger;"}, // double dagger, U+2021 ISOpub -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2020` can be replaced with '†'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u201D", "&rdquo;"}, // right double quotation mark, U+201D ISOnum -->
        {"\u201E", "&bdquo;"}, // double low-9 quotation mark, U+201E NEW -->
        {"\u2020", "&dagger;"}, // dagger, U+2020 ISOpub -->
        {"\u2021", "&Dagger;"}, // double dagger, U+2021 ISOpub -->
        {"\u2030", "&permil;"}, // per mille sign, U+2030 ISOtech -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2021` can be replaced with '‡'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u201E", "&bdquo;"}, // double low-9 quotation mark, U+201E NEW -->
        {"\u2020", "&dagger;"}, // dagger, U+2020 ISOpub -->
        {"\u2021", "&Dagger;"}, // double dagger, U+2021 ISOpub -->
        {"\u2030", "&permil;"}, // per mille sign, U+2030 ISOtech -->
        {"\u2039", "&lsaquo;"}, // single left-pointing angle quotation mark, U+2039 ISO proposed -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2030` can be replaced with '‰'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2020", "&dagger;"}, // dagger, U+2020 ISOpub -->
        {"\u2021", "&Dagger;"}, // double dagger, U+2021 ISOpub -->
        {"\u2030", "&permil;"}, // per mille sign, U+2030 ISOtech -->
        {"\u2039", "&lsaquo;"}, // single left-pointing angle quotation mark, U+2039 ISO proposed -->
        // <!-- lsaquo is proposed but not yet ISO standardized -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2039` can be replaced with '‹'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2021", "&Dagger;"}, // double dagger, U+2021 ISOpub -->
        {"\u2030", "&permil;"}, // per mille sign, U+2030 ISOtech -->
        {"\u2039", "&lsaquo;"}, // single left-pointing angle quotation mark, U+2039 ISO proposed -->
        // <!-- lsaquo is proposed but not yet ISO standardized -->
        {"\u203A", "&rsaquo;"}, // single right-pointing angle quotation mark, U+203A ISO proposed -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u203A` can be replaced with '›'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u2039", "&lsaquo;"}, // single left-pointing angle quotation mark, U+2039 ISO proposed -->
        // <!-- lsaquo is proposed but not yet ISO standardized -->
        {"\u203A", "&rsaquo;"}, // single right-pointing angle quotation mark, U+203A ISO proposed -->
        // <!-- rsaquo is proposed but not yet ISO standardized -->
        {"\u20AC", "&euro;"}, // -- euro sign, U+20AC NEW -->
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u20AC` can be replaced with '€'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u203A", "&rsaquo;"}, // single right-pointing angle quotation mark, U+203A ISO proposed -->
        // <!-- rsaquo is proposed but not yet ISO standardized -->
        {"\u20AC", "&euro;"}, // -- euro sign, U+20AC NEW -->
    };

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A1` can be replaced with '¡'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
    private static final String[][] ISO8859_1_ESCAPE = {
        {"\u00A0", "&nbsp;"}, // non-breaking space
        {"\u00A1", "&iexcl;"}, // inverted exclamation mark
        {"\u00A2", "&cent;"}, // cent sign
        {"\u00A3", "&pound;"}, // pound sign
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A2` can be replaced with '¢'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00A0", "&nbsp;"}, // non-breaking space
        {"\u00A1", "&iexcl;"}, // inverted exclamation mark
        {"\u00A2", "&cent;"}, // cent sign
        {"\u00A3", "&pound;"}, // pound sign
        {"\u00A4", "&curren;"}, // currency sign
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A3` can be replaced with '£'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00A1", "&iexcl;"}, // inverted exclamation mark
        {"\u00A2", "&cent;"}, // cent sign
        {"\u00A3", "&pound;"}, // pound sign
        {"\u00A4", "&curren;"}, // currency sign
        {"\u00A5", "&yen;"}, // yen sign = yuan sign
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A4` can be replaced with '¤'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00A2", "&cent;"}, // cent sign
        {"\u00A3", "&pound;"}, // pound sign
        {"\u00A4", "&curren;"}, // currency sign
        {"\u00A5", "&yen;"}, // yen sign = yuan sign
        {"\u00A6", "&brvbar;"}, // broken bar = broken vertical bar
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A5` can be replaced with '¥'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00A3", "&pound;"}, // pound sign
        {"\u00A4", "&curren;"}, // currency sign
        {"\u00A5", "&yen;"}, // yen sign = yuan sign
        {"\u00A6", "&brvbar;"}, // broken bar = broken vertical bar
        {"\u00A7", "&sect;"}, // section sign
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A6` can be replaced with '¦'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00A4", "&curren;"}, // currency sign
        {"\u00A5", "&yen;"}, // yen sign = yuan sign
        {"\u00A6", "&brvbar;"}, // broken bar = broken vertical bar
        {"\u00A7", "&sect;"}, // section sign
        {"\u00A8", "&uml;"}, // diaeresis = spacing diaeresis
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A7` can be replaced with '§'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00A5", "&yen;"}, // yen sign = yuan sign
        {"\u00A6", "&brvbar;"}, // broken bar = broken vertical bar
        {"\u00A7", "&sect;"}, // section sign
        {"\u00A8", "&uml;"}, // diaeresis = spacing diaeresis
        {"\u00A9", "&copy;"}, // © - copyright sign
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A8` can be replaced with '¨'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00A6", "&brvbar;"}, // broken bar = broken vertical bar
        {"\u00A7", "&sect;"}, // section sign
        {"\u00A8", "&uml;"}, // diaeresis = spacing diaeresis
        {"\u00A9", "&copy;"}, // © - copyright sign
        {"\u00AA", "&ordf;"}, // feminine ordinal indicator
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A9` can be replaced with '©'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00A7", "&sect;"}, // section sign
        {"\u00A8", "&uml;"}, // diaeresis = spacing diaeresis
        {"\u00A9", "&copy;"}, // © - copyright sign
        {"\u00AA", "&ordf;"}, // feminine ordinal indicator
        {"\u00AB", "&laquo;"}, // left-pointing double angle quotation mark = left pointing guillemet
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00AA` can be replaced with 'ª'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00A8", "&uml;"}, // diaeresis = spacing diaeresis
        {"\u00A9", "&copy;"}, // © - copyright sign
        {"\u00AA", "&ordf;"}, // feminine ordinal indicator
        {"\u00AB", "&laquo;"}, // left-pointing double angle quotation mark = left pointing guillemet
        {"\u00AC", "&not;"}, // not sign
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00AB` can be replaced with '\<\<'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00A9", "&copy;"}, // © - copyright sign
        {"\u00AA", "&ordf;"}, // feminine ordinal indicator
        {"\u00AB", "&laquo;"}, // left-pointing double angle quotation mark = left pointing guillemet
        {"\u00AC", "&not;"}, // not sign
        {"\u00AD", "&shy;"}, // soft hyphen = discretionary hyphen
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00AC` can be replaced with '¬'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00AA", "&ordf;"}, // feminine ordinal indicator
        {"\u00AB", "&laquo;"}, // left-pointing double angle quotation mark = left pointing guillemet
        {"\u00AC", "&not;"}, // not sign
        {"\u00AD", "&shy;"}, // soft hyphen = discretionary hyphen
        {"\u00AE", "&reg;"}, // ® - registered trademark sign
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00AE` can be replaced with '®'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00AC", "&not;"}, // not sign
        {"\u00AD", "&shy;"}, // soft hyphen = discretionary hyphen
        {"\u00AE", "&reg;"}, // ® - registered trademark sign
        {"\u00AF", "&macr;"}, // macron = spacing macron = overline = APL overbar
        {"\u00B0", "&deg;"}, // degree sign
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00AF` can be replaced with '¯'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00AD", "&shy;"}, // soft hyphen = discretionary hyphen
        {"\u00AE", "&reg;"}, // ® - registered trademark sign
        {"\u00AF", "&macr;"}, // macron = spacing macron = overline = APL overbar
        {"\u00B0", "&deg;"}, // degree sign
        {"\u00B1", "&plusmn;"}, // plus-minus sign = plus-or-minus sign
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B0` can be replaced with '°'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00AE", "&reg;"}, // ® - registered trademark sign
        {"\u00AF", "&macr;"}, // macron = spacing macron = overline = APL overbar
        {"\u00B0", "&deg;"}, // degree sign
        {"\u00B1", "&plusmn;"}, // plus-minus sign = plus-or-minus sign
        {"\u00B2", "&sup2;"}, // superscript two = superscript digit two = squared
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B1` can be replaced with '±'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00AF", "&macr;"}, // macron = spacing macron = overline = APL overbar
        {"\u00B0", "&deg;"}, // degree sign
        {"\u00B1", "&plusmn;"}, // plus-minus sign = plus-or-minus sign
        {"\u00B2", "&sup2;"}, // superscript two = superscript digit two = squared
        {"\u00B3", "&sup3;"}, // superscript three = superscript digit three = cubed
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B2` can be replaced with '²'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00B0", "&deg;"}, // degree sign
        {"\u00B1", "&plusmn;"}, // plus-minus sign = plus-or-minus sign
        {"\u00B2", "&sup2;"}, // superscript two = superscript digit two = squared
        {"\u00B3", "&sup3;"}, // superscript three = superscript digit three = cubed
        {"\u00B4", "&acute;"}, // acute accent = spacing acute
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B3` can be replaced with '³'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00B1", "&plusmn;"}, // plus-minus sign = plus-or-minus sign
        {"\u00B2", "&sup2;"}, // superscript two = superscript digit two = squared
        {"\u00B3", "&sup3;"}, // superscript three = superscript digit three = cubed
        {"\u00B4", "&acute;"}, // acute accent = spacing acute
        {"\u00B5", "&micro;"}, // micro sign
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B4` can be replaced with '´'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00B2", "&sup2;"}, // superscript two = superscript digit two = squared
        {"\u00B3", "&sup3;"}, // superscript three = superscript digit three = cubed
        {"\u00B4", "&acute;"}, // acute accent = spacing acute
        {"\u00B5", "&micro;"}, // micro sign
        {"\u00B6", "&para;"}, // pilcrow sign = paragraph sign
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B5` can be replaced with 'µ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00B3", "&sup3;"}, // superscript three = superscript digit three = cubed
        {"\u00B4", "&acute;"}, // acute accent = spacing acute
        {"\u00B5", "&micro;"}, // micro sign
        {"\u00B6", "&para;"}, // pilcrow sign = paragraph sign
        {"\u00B7", "&middot;"}, // middle dot = Georgian comma = Greek middle dot
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B6` can be replaced with '¶'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00B4", "&acute;"}, // acute accent = spacing acute
        {"\u00B5", "&micro;"}, // micro sign
        {"\u00B6", "&para;"}, // pilcrow sign = paragraph sign
        {"\u00B7", "&middot;"}, // middle dot = Georgian comma = Greek middle dot
        {"\u00B8", "&cedil;"}, // cedilla = spacing cedilla
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B7` can be replaced with '·'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00B5", "&micro;"}, // micro sign
        {"\u00B6", "&para;"}, // pilcrow sign = paragraph sign
        {"\u00B7", "&middot;"}, // middle dot = Georgian comma = Greek middle dot
        {"\u00B8", "&cedil;"}, // cedilla = spacing cedilla
        {"\u00B9", "&sup1;"}, // superscript one = superscript digit one
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B8` can be replaced with '¸'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00B6", "&para;"}, // pilcrow sign = paragraph sign
        {"\u00B7", "&middot;"}, // middle dot = Georgian comma = Greek middle dot
        {"\u00B8", "&cedil;"}, // cedilla = spacing cedilla
        {"\u00B9", "&sup1;"}, // superscript one = superscript digit one
        {"\u00BA", "&ordm;"}, // masculine ordinal indicator
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B9` can be replaced with '¹'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00B7", "&middot;"}, // middle dot = Georgian comma = Greek middle dot
        {"\u00B8", "&cedil;"}, // cedilla = spacing cedilla
        {"\u00B9", "&sup1;"}, // superscript one = superscript digit one
        {"\u00BA", "&ordm;"}, // masculine ordinal indicator
        {"\u00BB", "&raquo;"}, // right-pointing double angle quotation mark = right pointing guillemet
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00BA` can be replaced with 'º'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00B8", "&cedil;"}, // cedilla = spacing cedilla
        {"\u00B9", "&sup1;"}, // superscript one = superscript digit one
        {"\u00BA", "&ordm;"}, // masculine ordinal indicator
        {"\u00BB", "&raquo;"}, // right-pointing double angle quotation mark = right pointing guillemet
        {"\u00BC", "&frac14;"}, // vulgar fraction one quarter = fraction one quarter
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00BB` can be replaced with '\>\>'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00B9", "&sup1;"}, // superscript one = superscript digit one
        {"\u00BA", "&ordm;"}, // masculine ordinal indicator
        {"\u00BB", "&raquo;"}, // right-pointing double angle quotation mark = right pointing guillemet
        {"\u00BC", "&frac14;"}, // vulgar fraction one quarter = fraction one quarter
        {"\u00BD", "&frac12;"}, // vulgar fraction one half = fraction one half
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00BC` can be replaced with '¼'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00BA", "&ordm;"}, // masculine ordinal indicator
        {"\u00BB", "&raquo;"}, // right-pointing double angle quotation mark = right pointing guillemet
        {"\u00BC", "&frac14;"}, // vulgar fraction one quarter = fraction one quarter
        {"\u00BD", "&frac12;"}, // vulgar fraction one half = fraction one half
        {"\u00BE", "&frac34;"}, // vulgar fraction three quarters = fraction three quarters
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00BD` can be replaced with '½'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00BB", "&raquo;"}, // right-pointing double angle quotation mark = right pointing guillemet
        {"\u00BC", "&frac14;"}, // vulgar fraction one quarter = fraction one quarter
        {"\u00BD", "&frac12;"}, // vulgar fraction one half = fraction one half
        {"\u00BE", "&frac34;"}, // vulgar fraction three quarters = fraction three quarters
        {"\u00BF", "&iquest;"}, // inverted question mark = turned question mark
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00BE` can be replaced with '¾'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00BC", "&frac14;"}, // vulgar fraction one quarter = fraction one quarter
        {"\u00BD", "&frac12;"}, // vulgar fraction one half = fraction one half
        {"\u00BE", "&frac34;"}, // vulgar fraction three quarters = fraction three quarters
        {"\u00BF", "&iquest;"}, // inverted question mark = turned question mark
        {"\u00C0", "&Agrave;"}, // À - uppercase A, grave accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00BF` can be replaced with '¿'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00BD", "&frac12;"}, // vulgar fraction one half = fraction one half
        {"\u00BE", "&frac34;"}, // vulgar fraction three quarters = fraction three quarters
        {"\u00BF", "&iquest;"}, // inverted question mark = turned question mark
        {"\u00C0", "&Agrave;"}, // À - uppercase A, grave accent
        {"\u00C1", "&Aacute;"}, // Á - uppercase A, acute accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00C0` can be replaced with 'À'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00BE", "&frac34;"}, // vulgar fraction three quarters = fraction three quarters
        {"\u00BF", "&iquest;"}, // inverted question mark = turned question mark
        {"\u00C0", "&Agrave;"}, // À - uppercase A, grave accent
        {"\u00C1", "&Aacute;"}, // Á - uppercase A, acute accent
        {"\u00C2", "&Acirc;"}, // Â - uppercase A, circumflex accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00C1` can be replaced with 'Á'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00BF", "&iquest;"}, // inverted question mark = turned question mark
        {"\u00C0", "&Agrave;"}, // À - uppercase A, grave accent
        {"\u00C1", "&Aacute;"}, // Á - uppercase A, acute accent
        {"\u00C2", "&Acirc;"}, // Â - uppercase A, circumflex accent
        {"\u00C3", "&Atilde;"}, // Ã - uppercase A, tilde
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00C2` can be replaced with 'Â'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00C0", "&Agrave;"}, // À - uppercase A, grave accent
        {"\u00C1", "&Aacute;"}, // Á - uppercase A, acute accent
        {"\u00C2", "&Acirc;"}, // Â - uppercase A, circumflex accent
        {"\u00C3", "&Atilde;"}, // Ã - uppercase A, tilde
        {"\u00C4", "&Auml;"}, // Ä - uppercase A, umlaut
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00C3` can be replaced with 'Ã'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00C1", "&Aacute;"}, // Á - uppercase A, acute accent
        {"\u00C2", "&Acirc;"}, // Â - uppercase A, circumflex accent
        {"\u00C3", "&Atilde;"}, // Ã - uppercase A, tilde
        {"\u00C4", "&Auml;"}, // Ä - uppercase A, umlaut
        {"\u00C5", "&Aring;"}, // Å - uppercase A, ring
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00C4` can be replaced with 'Ä'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00C2", "&Acirc;"}, // Â - uppercase A, circumflex accent
        {"\u00C3", "&Atilde;"}, // Ã - uppercase A, tilde
        {"\u00C4", "&Auml;"}, // Ä - uppercase A, umlaut
        {"\u00C5", "&Aring;"}, // Å - uppercase A, ring
        {"\u00C6", "&AElig;"}, // Æ - uppercase AE
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00C5` can be replaced with 'Å'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00C3", "&Atilde;"}, // Ã - uppercase A, tilde
        {"\u00C4", "&Auml;"}, // Ä - uppercase A, umlaut
        {"\u00C5", "&Aring;"}, // Å - uppercase A, ring
        {"\u00C6", "&AElig;"}, // Æ - uppercase AE
        {"\u00C7", "&Ccedil;"}, // Ç - uppercase C, cedilla
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00C6` can be replaced with 'Æ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00C4", "&Auml;"}, // Ä - uppercase A, umlaut
        {"\u00C5", "&Aring;"}, // Å - uppercase A, ring
        {"\u00C6", "&AElig;"}, // Æ - uppercase AE
        {"\u00C7", "&Ccedil;"}, // Ç - uppercase C, cedilla
        {"\u00C8", "&Egrave;"}, // È - uppercase E, grave accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00C7` can be replaced with 'Ç'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00C5", "&Aring;"}, // Å - uppercase A, ring
        {"\u00C6", "&AElig;"}, // Æ - uppercase AE
        {"\u00C7", "&Ccedil;"}, // Ç - uppercase C, cedilla
        {"\u00C8", "&Egrave;"}, // È - uppercase E, grave accent
        {"\u00C9", "&Eacute;"}, // É - uppercase E, acute accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00C8` can be replaced with 'È'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00C6", "&AElig;"}, // Æ - uppercase AE
        {"\u00C7", "&Ccedil;"}, // Ç - uppercase C, cedilla
        {"\u00C8", "&Egrave;"}, // È - uppercase E, grave accent
        {"\u00C9", "&Eacute;"}, // É - uppercase E, acute accent
        {"\u00CA", "&Ecirc;"}, // Ê - uppercase E, circumflex accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00C9` can be replaced with 'É'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00C7", "&Ccedil;"}, // Ç - uppercase C, cedilla
        {"\u00C8", "&Egrave;"}, // È - uppercase E, grave accent
        {"\u00C9", "&Eacute;"}, // É - uppercase E, acute accent
        {"\u00CA", "&Ecirc;"}, // Ê - uppercase E, circumflex accent
        {"\u00CB", "&Euml;"}, // Ë - uppercase E, umlaut
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00CA` can be replaced with 'Ê'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00C8", "&Egrave;"}, // È - uppercase E, grave accent
        {"\u00C9", "&Eacute;"}, // É - uppercase E, acute accent
        {"\u00CA", "&Ecirc;"}, // Ê - uppercase E, circumflex accent
        {"\u00CB", "&Euml;"}, // Ë - uppercase E, umlaut
        {"\u00CC", "&Igrave;"}, // Ì - uppercase I, grave accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00CB` can be replaced with 'Ë'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00C9", "&Eacute;"}, // É - uppercase E, acute accent
        {"\u00CA", "&Ecirc;"}, // Ê - uppercase E, circumflex accent
        {"\u00CB", "&Euml;"}, // Ë - uppercase E, umlaut
        {"\u00CC", "&Igrave;"}, // Ì - uppercase I, grave accent
        {"\u00CD", "&Iacute;"}, // Í - uppercase I, acute accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00CC` can be replaced with 'Ì'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00CA", "&Ecirc;"}, // Ê - uppercase E, circumflex accent
        {"\u00CB", "&Euml;"}, // Ë - uppercase E, umlaut
        {"\u00CC", "&Igrave;"}, // Ì - uppercase I, grave accent
        {"\u00CD", "&Iacute;"}, // Í - uppercase I, acute accent
        {"\u00CE", "&Icirc;"}, // Î - uppercase I, circumflex accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00CD` can be replaced with 'Í'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00CB", "&Euml;"}, // Ë - uppercase E, umlaut
        {"\u00CC", "&Igrave;"}, // Ì - uppercase I, grave accent
        {"\u00CD", "&Iacute;"}, // Í - uppercase I, acute accent
        {"\u00CE", "&Icirc;"}, // Î - uppercase I, circumflex accent
        {"\u00CF", "&Iuml;"}, // Ï - uppercase I, umlaut
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00CE` can be replaced with 'Î'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00CC", "&Igrave;"}, // Ì - uppercase I, grave accent
        {"\u00CD", "&Iacute;"}, // Í - uppercase I, acute accent
        {"\u00CE", "&Icirc;"}, // Î - uppercase I, circumflex accent
        {"\u00CF", "&Iuml;"}, // Ï - uppercase I, umlaut
        {"\u00D0", "&ETH;"}, // Ð - uppercase Eth, Icelandic
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00CF` can be replaced with 'Ï'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00CD", "&Iacute;"}, // Í - uppercase I, acute accent
        {"\u00CE", "&Icirc;"}, // Î - uppercase I, circumflex accent
        {"\u00CF", "&Iuml;"}, // Ï - uppercase I, umlaut
        {"\u00D0", "&ETH;"}, // Ð - uppercase Eth, Icelandic
        {"\u00D1", "&Ntilde;"}, // Ñ - uppercase N, tilde
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D0` can be replaced with 'Ð'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00CE", "&Icirc;"}, // Î - uppercase I, circumflex accent
        {"\u00CF", "&Iuml;"}, // Ï - uppercase I, umlaut
        {"\u00D0", "&ETH;"}, // Ð - uppercase Eth, Icelandic
        {"\u00D1", "&Ntilde;"}, // Ñ - uppercase N, tilde
        {"\u00D2", "&Ograve;"}, // Ò - uppercase O, grave accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D1` can be replaced with 'Ñ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00CF", "&Iuml;"}, // Ï - uppercase I, umlaut
        {"\u00D0", "&ETH;"}, // Ð - uppercase Eth, Icelandic
        {"\u00D1", "&Ntilde;"}, // Ñ - uppercase N, tilde
        {"\u00D2", "&Ograve;"}, // Ò - uppercase O, grave accent
        {"\u00D3", "&Oacute;"}, // Ó - uppercase O, acute accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D2` can be replaced with 'Ò'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00D0", "&ETH;"}, // Ð - uppercase Eth, Icelandic
        {"\u00D1", "&Ntilde;"}, // Ñ - uppercase N, tilde
        {"\u00D2", "&Ograve;"}, // Ò - uppercase O, grave accent
        {"\u00D3", "&Oacute;"}, // Ó - uppercase O, acute accent
        {"\u00D4", "&Ocirc;"}, // Ô - uppercase O, circumflex accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D3` can be replaced with 'Ó'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00D1", "&Ntilde;"}, // Ñ - uppercase N, tilde
        {"\u00D2", "&Ograve;"}, // Ò - uppercase O, grave accent
        {"\u00D3", "&Oacute;"}, // Ó - uppercase O, acute accent
        {"\u00D4", "&Ocirc;"}, // Ô - uppercase O, circumflex accent
        {"\u00D5", "&Otilde;"}, // Õ - uppercase O, tilde
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D4` can be replaced with 'Ô'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00D2", "&Ograve;"}, // Ò - uppercase O, grave accent
        {"\u00D3", "&Oacute;"}, // Ó - uppercase O, acute accent
        {"\u00D4", "&Ocirc;"}, // Ô - uppercase O, circumflex accent
        {"\u00D5", "&Otilde;"}, // Õ - uppercase O, tilde
        {"\u00D6", "&Ouml;"}, // Ö - uppercase O, umlaut
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D5` can be replaced with 'Õ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00D3", "&Oacute;"}, // Ó - uppercase O, acute accent
        {"\u00D4", "&Ocirc;"}, // Ô - uppercase O, circumflex accent
        {"\u00D5", "&Otilde;"}, // Õ - uppercase O, tilde
        {"\u00D6", "&Ouml;"}, // Ö - uppercase O, umlaut
        {"\u00D7", "&times;"}, // multiplication sign
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D6` can be replaced with 'Ö'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00D4", "&Ocirc;"}, // Ô - uppercase O, circumflex accent
        {"\u00D5", "&Otilde;"}, // Õ - uppercase O, tilde
        {"\u00D6", "&Ouml;"}, // Ö - uppercase O, umlaut
        {"\u00D7", "&times;"}, // multiplication sign
        {"\u00D8", "&Oslash;"}, // Ø - uppercase O, slash
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D7` can be replaced with '×'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00D5", "&Otilde;"}, // Õ - uppercase O, tilde
        {"\u00D6", "&Ouml;"}, // Ö - uppercase O, umlaut
        {"\u00D7", "&times;"}, // multiplication sign
        {"\u00D8", "&Oslash;"}, // Ø - uppercase O, slash
        {"\u00D9", "&Ugrave;"}, // Ù - uppercase U, grave accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D8` can be replaced with 'Ø'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00D6", "&Ouml;"}, // Ö - uppercase O, umlaut
        {"\u00D7", "&times;"}, // multiplication sign
        {"\u00D8", "&Oslash;"}, // Ø - uppercase O, slash
        {"\u00D9", "&Ugrave;"}, // Ù - uppercase U, grave accent
        {"\u00DA", "&Uacute;"}, // Ú - uppercase U, acute accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D9` can be replaced with 'Ù'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00D7", "&times;"}, // multiplication sign
        {"\u00D8", "&Oslash;"}, // Ø - uppercase O, slash
        {"\u00D9", "&Ugrave;"}, // Ù - uppercase U, grave accent
        {"\u00DA", "&Uacute;"}, // Ú - uppercase U, acute accent
        {"\u00DB", "&Ucirc;"}, // Û - uppercase U, circumflex accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00DA` can be replaced with 'Ú'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00D8", "&Oslash;"}, // Ø - uppercase O, slash
        {"\u00D9", "&Ugrave;"}, // Ù - uppercase U, grave accent
        {"\u00DA", "&Uacute;"}, // Ú - uppercase U, acute accent
        {"\u00DB", "&Ucirc;"}, // Û - uppercase U, circumflex accent
        {"\u00DC", "&Uuml;"}, // Ü - uppercase U, umlaut
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00DB` can be replaced with 'Û'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00D9", "&Ugrave;"}, // Ù - uppercase U, grave accent
        {"\u00DA", "&Uacute;"}, // Ú - uppercase U, acute accent
        {"\u00DB", "&Ucirc;"}, // Û - uppercase U, circumflex accent
        {"\u00DC", "&Uuml;"}, // Ü - uppercase U, umlaut
        {"\u00DD", "&Yacute;"}, // Ý - uppercase Y, acute accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00DC` can be replaced with 'Ü'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00DA", "&Uacute;"}, // Ú - uppercase U, acute accent
        {"\u00DB", "&Ucirc;"}, // Û - uppercase U, circumflex accent
        {"\u00DC", "&Uuml;"}, // Ü - uppercase U, umlaut
        {"\u00DD", "&Yacute;"}, // Ý - uppercase Y, acute accent
        {"\u00DE", "&THORN;"}, // Þ - uppercase THORN, Icelandic
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00DD` can be replaced with 'Ý'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00DB", "&Ucirc;"}, // Û - uppercase U, circumflex accent
        {"\u00DC", "&Uuml;"}, // Ü - uppercase U, umlaut
        {"\u00DD", "&Yacute;"}, // Ý - uppercase Y, acute accent
        {"\u00DE", "&THORN;"}, // Þ - uppercase THORN, Icelandic
        {"\u00DF", "&szlig;"}, // ß - lowercase sharps, German
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00DE` can be replaced with 'Þ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00DC", "&Uuml;"}, // Ü - uppercase U, umlaut
        {"\u00DD", "&Yacute;"}, // Ý - uppercase Y, acute accent
        {"\u00DE", "&THORN;"}, // Þ - uppercase THORN, Icelandic
        {"\u00DF", "&szlig;"}, // ß - lowercase sharps, German
        {"\u00E0", "&agrave;"}, // à - lowercase a, grave accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00DF` can be replaced with 'ß'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00DD", "&Yacute;"}, // Ý - uppercase Y, acute accent
        {"\u00DE", "&THORN;"}, // Þ - uppercase THORN, Icelandic
        {"\u00DF", "&szlig;"}, // ß - lowercase sharps, German
        {"\u00E0", "&agrave;"}, // à - lowercase a, grave accent
        {"\u00E1", "&aacute;"}, // á - lowercase a, acute accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00E0` can be replaced with 'à'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00DE", "&THORN;"}, // Þ - uppercase THORN, Icelandic
        {"\u00DF", "&szlig;"}, // ß - lowercase sharps, German
        {"\u00E0", "&agrave;"}, // à - lowercase a, grave accent
        {"\u00E1", "&aacute;"}, // á - lowercase a, acute accent
        {"\u00E2", "&acirc;"}, // â - lowercase a, circumflex accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00E1` can be replaced with 'á'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00DF", "&szlig;"}, // ß - lowercase sharps, German
        {"\u00E0", "&agrave;"}, // à - lowercase a, grave accent
        {"\u00E1", "&aacute;"}, // á - lowercase a, acute accent
        {"\u00E2", "&acirc;"}, // â - lowercase a, circumflex accent
        {"\u00E3", "&atilde;"}, // ã - lowercase a, tilde
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00E2` can be replaced with 'â'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00E0", "&agrave;"}, // à - lowercase a, grave accent
        {"\u00E1", "&aacute;"}, // á - lowercase a, acute accent
        {"\u00E2", "&acirc;"}, // â - lowercase a, circumflex accent
        {"\u00E3", "&atilde;"}, // ã - lowercase a, tilde
        {"\u00E4", "&auml;"}, // ä - lowercase a, umlaut
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00E3` can be replaced with 'ã'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00E1", "&aacute;"}, // á - lowercase a, acute accent
        {"\u00E2", "&acirc;"}, // â - lowercase a, circumflex accent
        {"\u00E3", "&atilde;"}, // ã - lowercase a, tilde
        {"\u00E4", "&auml;"}, // ä - lowercase a, umlaut
        {"\u00E5", "&aring;"}, // å - lowercase a, ring
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00E4` can be replaced with 'ä'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00E2", "&acirc;"}, // â - lowercase a, circumflex accent
        {"\u00E3", "&atilde;"}, // ã - lowercase a, tilde
        {"\u00E4", "&auml;"}, // ä - lowercase a, umlaut
        {"\u00E5", "&aring;"}, // å - lowercase a, ring
        {"\u00E6", "&aelig;"}, // æ - lowercase ae
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00E5` can be replaced with 'å'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00E3", "&atilde;"}, // ã - lowercase a, tilde
        {"\u00E4", "&auml;"}, // ä - lowercase a, umlaut
        {"\u00E5", "&aring;"}, // å - lowercase a, ring
        {"\u00E6", "&aelig;"}, // æ - lowercase ae
        {"\u00E7", "&ccedil;"}, // ç - lowercase c, cedilla
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00E6` can be replaced with 'æ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00E4", "&auml;"}, // ä - lowercase a, umlaut
        {"\u00E5", "&aring;"}, // å - lowercase a, ring
        {"\u00E6", "&aelig;"}, // æ - lowercase ae
        {"\u00E7", "&ccedil;"}, // ç - lowercase c, cedilla
        {"\u00E8", "&egrave;"}, // è - lowercase e, grave accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00E7` can be replaced with 'ç'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00E5", "&aring;"}, // å - lowercase a, ring
        {"\u00E6", "&aelig;"}, // æ - lowercase ae
        {"\u00E7", "&ccedil;"}, // ç - lowercase c, cedilla
        {"\u00E8", "&egrave;"}, // è - lowercase e, grave accent
        {"\u00E9", "&eacute;"}, // é - lowercase e, acute accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00E8` can be replaced with 'è'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00E6", "&aelig;"}, // æ - lowercase ae
        {"\u00E7", "&ccedil;"}, // ç - lowercase c, cedilla
        {"\u00E8", "&egrave;"}, // è - lowercase e, grave accent
        {"\u00E9", "&eacute;"}, // é - lowercase e, acute accent
        {"\u00EA", "&ecirc;"}, // ê - lowercase e, circumflex accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00E9` can be replaced with 'é'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00E7", "&ccedil;"}, // ç - lowercase c, cedilla
        {"\u00E8", "&egrave;"}, // è - lowercase e, grave accent
        {"\u00E9", "&eacute;"}, // é - lowercase e, acute accent
        {"\u00EA", "&ecirc;"}, // ê - lowercase e, circumflex accent
        {"\u00EB", "&euml;"}, // ë - lowercase e, umlaut
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00EA` can be replaced with 'ê'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00E8", "&egrave;"}, // è - lowercase e, grave accent
        {"\u00E9", "&eacute;"}, // é - lowercase e, acute accent
        {"\u00EA", "&ecirc;"}, // ê - lowercase e, circumflex accent
        {"\u00EB", "&euml;"}, // ë - lowercase e, umlaut
        {"\u00EC", "&igrave;"}, // ì - lowercase i, grave accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00EB` can be replaced with 'ë'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00E9", "&eacute;"}, // é - lowercase e, acute accent
        {"\u00EA", "&ecirc;"}, // ê - lowercase e, circumflex accent
        {"\u00EB", "&euml;"}, // ë - lowercase e, umlaut
        {"\u00EC", "&igrave;"}, // ì - lowercase i, grave accent
        {"\u00ED", "&iacute;"}, // í - lowercase i, acute accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00EC` can be replaced with 'ì'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00EA", "&ecirc;"}, // ê - lowercase e, circumflex accent
        {"\u00EB", "&euml;"}, // ë - lowercase e, umlaut
        {"\u00EC", "&igrave;"}, // ì - lowercase i, grave accent
        {"\u00ED", "&iacute;"}, // í - lowercase i, acute accent
        {"\u00EE", "&icirc;"}, // î - lowercase i, circumflex accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00ED` can be replaced with 'í'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00EB", "&euml;"}, // ë - lowercase e, umlaut
        {"\u00EC", "&igrave;"}, // ì - lowercase i, grave accent
        {"\u00ED", "&iacute;"}, // í - lowercase i, acute accent
        {"\u00EE", "&icirc;"}, // î - lowercase i, circumflex accent
        {"\u00EF", "&iuml;"}, // ï - lowercase i, umlaut
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00EE` can be replaced with 'î'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00EC", "&igrave;"}, // ì - lowercase i, grave accent
        {"\u00ED", "&iacute;"}, // í - lowercase i, acute accent
        {"\u00EE", "&icirc;"}, // î - lowercase i, circumflex accent
        {"\u00EF", "&iuml;"}, // ï - lowercase i, umlaut
        {"\u00F0", "&eth;"}, // ð - lowercase eth, Icelandic
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00EF` can be replaced with 'ï'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00ED", "&iacute;"}, // í - lowercase i, acute accent
        {"\u00EE", "&icirc;"}, // î - lowercase i, circumflex accent
        {"\u00EF", "&iuml;"}, // ï - lowercase i, umlaut
        {"\u00F0", "&eth;"}, // ð - lowercase eth, Icelandic
        {"\u00F1", "&ntilde;"}, // ñ - lowercase n, tilde
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00F0` can be replaced with 'ð'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00EE", "&icirc;"}, // î - lowercase i, circumflex accent
        {"\u00EF", "&iuml;"}, // ï - lowercase i, umlaut
        {"\u00F0", "&eth;"}, // ð - lowercase eth, Icelandic
        {"\u00F1", "&ntilde;"}, // ñ - lowercase n, tilde
        {"\u00F2", "&ograve;"}, // ò - lowercase o, grave accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00F1` can be replaced with 'ñ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00EF", "&iuml;"}, // ï - lowercase i, umlaut
        {"\u00F0", "&eth;"}, // ð - lowercase eth, Icelandic
        {"\u00F1", "&ntilde;"}, // ñ - lowercase n, tilde
        {"\u00F2", "&ograve;"}, // ò - lowercase o, grave accent
        {"\u00F3", "&oacute;"}, // ó - lowercase o, acute accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00F2` can be replaced with 'ò'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00F0", "&eth;"}, // ð - lowercase eth, Icelandic
        {"\u00F1", "&ntilde;"}, // ñ - lowercase n, tilde
        {"\u00F2", "&ograve;"}, // ò - lowercase o, grave accent
        {"\u00F3", "&oacute;"}, // ó - lowercase o, acute accent
        {"\u00F4", "&ocirc;"}, // ô - lowercase o, circumflex accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00F3` can be replaced with 'ó'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00F1", "&ntilde;"}, // ñ - lowercase n, tilde
        {"\u00F2", "&ograve;"}, // ò - lowercase o, grave accent
        {"\u00F3", "&oacute;"}, // ó - lowercase o, acute accent
        {"\u00F4", "&ocirc;"}, // ô - lowercase o, circumflex accent
        {"\u00F5", "&otilde;"}, // õ - lowercase o, tilde
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00F4` can be replaced with 'ô'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00F2", "&ograve;"}, // ò - lowercase o, grave accent
        {"\u00F3", "&oacute;"}, // ó - lowercase o, acute accent
        {"\u00F4", "&ocirc;"}, // ô - lowercase o, circumflex accent
        {"\u00F5", "&otilde;"}, // õ - lowercase o, tilde
        {"\u00F6", "&ouml;"}, // ö - lowercase o, umlaut
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00F5` can be replaced with 'õ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00F3", "&oacute;"}, // ó - lowercase o, acute accent
        {"\u00F4", "&ocirc;"}, // ô - lowercase o, circumflex accent
        {"\u00F5", "&otilde;"}, // õ - lowercase o, tilde
        {"\u00F6", "&ouml;"}, // ö - lowercase o, umlaut
        {"\u00F7", "&divide;"}, // division sign
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00F6` can be replaced with 'ö'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00F4", "&ocirc;"}, // ô - lowercase o, circumflex accent
        {"\u00F5", "&otilde;"}, // õ - lowercase o, tilde
        {"\u00F6", "&ouml;"}, // ö - lowercase o, umlaut
        {"\u00F7", "&divide;"}, // division sign
        {"\u00F8", "&oslash;"}, // ø - lowercase o, slash
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00F7` can be replaced with '÷'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00F5", "&otilde;"}, // õ - lowercase o, tilde
        {"\u00F6", "&ouml;"}, // ö - lowercase o, umlaut
        {"\u00F7", "&divide;"}, // division sign
        {"\u00F8", "&oslash;"}, // ø - lowercase o, slash
        {"\u00F9", "&ugrave;"}, // ù - lowercase u, grave accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00F8` can be replaced with 'ø'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00F6", "&ouml;"}, // ö - lowercase o, umlaut
        {"\u00F7", "&divide;"}, // division sign
        {"\u00F8", "&oslash;"}, // ø - lowercase o, slash
        {"\u00F9", "&ugrave;"}, // ù - lowercase u, grave accent
        {"\u00FA", "&uacute;"}, // ú - lowercase u, acute accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00F9` can be replaced with 'ù'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00F7", "&divide;"}, // division sign
        {"\u00F8", "&oslash;"}, // ø - lowercase o, slash
        {"\u00F9", "&ugrave;"}, // ù - lowercase u, grave accent
        {"\u00FA", "&uacute;"}, // ú - lowercase u, acute accent
        {"\u00FB", "&ucirc;"}, // û - lowercase u, circumflex accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00FA` can be replaced with 'ú'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00F8", "&oslash;"}, // ø - lowercase o, slash
        {"\u00F9", "&ugrave;"}, // ù - lowercase u, grave accent
        {"\u00FA", "&uacute;"}, // ú - lowercase u, acute accent
        {"\u00FB", "&ucirc;"}, // û - lowercase u, circumflex accent
        {"\u00FC", "&uuml;"}, // ü - lowercase u, umlaut
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00FB` can be replaced with 'û'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00F9", "&ugrave;"}, // ù - lowercase u, grave accent
        {"\u00FA", "&uacute;"}, // ú - lowercase u, acute accent
        {"\u00FB", "&ucirc;"}, // û - lowercase u, circumflex accent
        {"\u00FC", "&uuml;"}, // ü - lowercase u, umlaut
        {"\u00FD", "&yacute;"}, // ý - lowercase y, acute accent
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00FC` can be replaced with 'ü'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00FA", "&uacute;"}, // ú - lowercase u, acute accent
        {"\u00FB", "&ucirc;"}, // û - lowercase u, circumflex accent
        {"\u00FC", "&uuml;"}, // ü - lowercase u, umlaut
        {"\u00FD", "&yacute;"}, // ý - lowercase y, acute accent
        {"\u00FE", "&thorn;"}, // þ - lowercase thorn, Icelandic
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00FD` can be replaced with 'ý'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00FB", "&ucirc;"}, // û - lowercase u, circumflex accent
        {"\u00FC", "&uuml;"}, // ü - lowercase u, umlaut
        {"\u00FD", "&yacute;"}, // ý - lowercase y, acute accent
        {"\u00FE", "&thorn;"}, // þ - lowercase thorn, Icelandic
        {"\u00FF", "&yuml;"}, // ÿ - lowercase y, umlaut
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00FE` can be replaced with 'þ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00FC", "&uuml;"}, // ü - lowercase u, umlaut
        {"\u00FD", "&yacute;"}, // ý - lowercase y, acute accent
        {"\u00FE", "&thorn;"}, // þ - lowercase thorn, Icelandic
        {"\u00FF", "&yuml;"}, // ÿ - lowercase y, umlaut
    };
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00FF` can be replaced with 'ÿ'
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
        {"\u00FD", "&yacute;"}, // ý - lowercase y, acute accent
        {"\u00FE", "&thorn;"}, // þ - lowercase thorn, Icelandic
        {"\u00FF", "&yuml;"}, // ÿ - lowercase y, umlaut
    };

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0020` can be replaced with ' '
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * StringUtils.isAsciiPrintable("ab2c")   = true
     * StringUtils.isAsciiPrintable("!ab-c~") = true
     * StringUtils.isAsciiPrintable("\u0020") = true
     * StringUtils.isAsciiPrintable("\u0021") = true
     * StringUtils.isAsciiPrintable("\u007e") = true
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0021` can be replaced with '!'
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * StringUtils.isAsciiPrintable("!ab-c~") = true
     * StringUtils.isAsciiPrintable("\u0020") = true
     * StringUtils.isAsciiPrintable("\u0021") = true
     * StringUtils.isAsciiPrintable("\u007e") = true
     * StringUtils.isAsciiPrintable("\u007f") = false
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u007e` can be replaced with '\~'
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * StringUtils.isAsciiPrintable("\u0020") = true
     * StringUtils.isAsciiPrintable("\u0021") = true
     * StringUtils.isAsciiPrintable("\u007e") = true
     * StringUtils.isAsciiPrintable("\u007f") = false
     * StringUtils.isAsciiPrintable("Ceki G\u00fclc\u00fc") = false
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00fc` can be replaced with 'ü'
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * StringUtils.isAsciiPrintable("\u007e") = true
     * StringUtils.isAsciiPrintable("\u007f") = false
     * StringUtils.isAsciiPrintable("Ceki G\u00fclc\u00fc") = false
     * </pre>
     *
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00fc` can be replaced with 'ü'
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * StringUtils.isAsciiPrintable("\u007e") = true
     * StringUtils.isAsciiPrintable("\u007f") = false
     * StringUtils.isAsciiPrintable("Ceki G\u00fclc\u00fc") = false
     * </pre>
     *
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/org/apache/commons/lang3/text/WordUtils.java`
#### Snippet
```java
                lastWasGap = false;
            } else {
                continue; // ignore ch
            }
        }
```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing 'sort'
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
        final Method[] methods = cls.getMethods();
        final List<Method> matchingMethods = Stream.of(methods)
            .filter(method -> method.getName().equals(methodName) && MemberUtils.isMatchingMethod(method, parameterTypes)).collect(Collectors.toList());

        // Sort methods by signature to force deterministic result
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/apache/commons/lang3/text/WordUtils.java`
#### Snippet
```java
     */
    public static String uncapitalize(final String str) {
        return uncapitalize(str, null);
    }

```

### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/apache/commons/lang3/text/WordUtils.java`
#### Snippet
```java
     */
    public static String capitalize(final String str) {
        return capitalize(str, null);
    }

```

### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/apache/commons/lang3/text/WordUtils.java`
#### Snippet
```java
     */
    public static String capitalizeFully(final String str) {
        return capitalizeFully(str, null);
    }

```

### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/apache/commons/lang3/text/WordUtils.java`
#### Snippet
```java
     */
    public static String initials(final String str) {
        return initials(str, null);
    }

```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
        final Method method;

        final Class<? extends Object> cls = object.getClass();
        if (forceAccess) {
            messagePrefix = "No such method: ";
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `parameterTypeSuperClassName != null` is always `true`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
            final String parameterTypeSuperClassName = lastParameterType == null ? null : lastParameterType.getSuperclass().getName();

            if (parameterTypeName != null && parameterTypeSuperClassName != null && !methodParameterComponentTypeName.equals(parameterTypeName)
                && !methodParameterComponentTypeName.equals(parameterTypeSuperClassName)) {
                return null;
```

### ConstantValue
Value `array` is always 'null'
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static char[] addFirst(final char[] array, final char element) {
        return array == null ? add(array, element) : insert(0, array, element);
    }

```

### ConstantValue
Value `array` is always 'null'
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static boolean[] addFirst(final boolean[] array, final boolean element) {
        return array == null ? add(array, element) : insert(0, array, element);
    }

```

### ConstantValue
Value `array` is always 'null'
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static byte[] addFirst(final byte[] array, final byte element) {
        return array == null ? add(array, element) : insert(0, array, element);
    }

```

### ConstantValue
Value `array` is always 'null'
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static long[] addFirst(final long[] array, final long element) {
        return array == null ? add(array, element) : insert(0, array, element);
    }

```

### ConstantValue
Value `array` is always 'null'
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static float[] addFirst(final float[] array, final float element) {
        return array == null ? add(array, element) : insert(0, array, element);
    }

```

### ConstantValue
Value `array` is always 'null'
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static double[] addFirst(final double[] array, final double element) {
        return array == null ? add(array, element) : insert(0, array, element);
    }

```

### ConstantValue
Value `array` is always 'null'
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static <T> T[] addFirst(final T[] array, final T element) {
        return array == null ? add(array, element) : insert(0, array, element);
    }

```

### ConstantValue
Value `array` is always 'null'
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static short[] addFirst(final short[] array, final short element) {
        return array == null ? add(array, element) : insert(0, array, element);
    }

```

### ConstantValue
Value `array` is always 'null'
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static int[] addFirst(final int[] array, final int element) {
        return array == null ? add(array, element) : insert(0, array, element);
    }

```

### ConstantValue
Value `repeat` is always 'true'
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }

        return replaceEach(result, searchList, replacementList, repeat, timeToLive - 1);
    }

```

### ConstantValue
Condition `lastMatch` is always `true` when reached
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
            i++;
        }
        if (match || preserveAllTokens && lastMatch) {
            list.add(str.substring(start, i));
        }
```

