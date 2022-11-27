# commons-validator 
 
# Bad smells
I found 355 bad smells with 8 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RegExpRedundantEscape | 65 | false |
| ReturnNull | 54 | false |
| RedundantFieldInitialization | 49 | false |
| MethodOverloadsParentMethod | 42 | false |
| UnusedAssignment | 30 | false |
| AssignmentToMethodParameter | 13 | false |
| UnnecessaryBoxing | 11 | false |
| DeprecatedIsStillUsed | 10 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 8 | false |
| StringConcatenationInsideStringBufferAppend | 7 | false |
| ConstantValue | 5 | false |
| NonSerializableFieldInSerializableClass | 4 | false |
| StringBufferReplaceableByString | 4 | false |
| MissortedModifiers | 4 | false |
| UnnecessaryUnboxing | 4 | false |
| DynamicRegexReplaceableByCompiledPattern | 4 | false |
| NonProtectedConstructorInAbstractClass | 4 | true |
| PointlessBitwiseExpression | 4 | false |
| CStyleArrayDeclaration | 3 | false |
| UnnecessaryFullyQualifiedName | 3 | false |
| UNUSED_IMPORT | 3 | false |
| StringOperationCanBeSimplified | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| ZeroLengthArrayInitialization | 2 | false |
| UseCompareMethod | 2 | false |
| MethodOverridesStaticMethod | 2 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| UnnecessarySemicolon | 1 | false |
| ConfusingOctalEscape | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| TrivialStringConcatenation | 1 | false |
| StringEqualsEmptyString | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| NestedAssignment | 1 | false |
| ReplaceAssignmentWithOperatorAssignment | 1 | false |
| InstanceofCatchParameter | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| SynchronizeOnThis | 1 | false |
| RegExpUnnecessaryNonCapturingGroup | 1 | false |
| CastCanBeRemovedNarrowingVariableType | 1 | false |
## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ValidatorUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/validator/util/ValidatorUtils.java`
#### Snippet
```java
 *
 */
public class ValidatorUtils {

    private static final Log LOG = LogFactory.getLog(ValidatorUtils.class);
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/org/apache/commons/validator/routines/DomainValidator.java`
#### Snippet
```java
         */
        LOCAL_MINUS
        ;
    }

```

## RuleId[ruleID=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/main/java/org/apache/commons/validator/CreditCardValidator.java`
#### Snippet
```java
        @Override
        public boolean matches(final String card) {
            return (card.substring(0, 4).equals(PREFIX) && (card.length() == 16));
        }
    }
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/main/java/org/apache/commons/validator/CreditCardValidator.java`
#### Snippet
```java
        public boolean matches(final String card) {
            return (
                card.substring(0, 1).equals(PREFIX)
                    && (card.length() == 13 || card.length() == 16));
        }
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'MASTERCARD_VALIDATOR_PRE_OCT2016' is still used
in `src/main/java/org/apache/commons/validator/routines/CreditCardValidator.java`
#### Snippet
```java
     */
    @Deprecated
    public static final CodeValidator MASTERCARD_VALIDATOR_PRE_OCT2016 = new CodeValidator("^(5[1-5]\\d{14})$", LUHN_VALIDATOR);

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'MASTERCARD_PRE_OCT2016' is still used
in `src/main/java/org/apache/commons/validator/routines/CreditCardValidator.java`
#### Snippet
```java
     */
    @Deprecated
    public static final long MASTERCARD_PRE_OCT2016 = 1 << 6; // CHECKSTYLE IGNORE MagicNumber


```

### DeprecatedIsStillUsed
Deprecated member 'DateValidator' is still used
in `src/main/java/org/apache/commons/validator/DateValidator.java`
#### Snippet
```java
 */
@Deprecated
public class DateValidator {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'hFormSets' is still used
in `src/main/java/org/apache/commons/validator/ValidatorResources.java`
#### Snippet
```java
     */
    @Deprecated
    protected FastHashMap hFormSets = new FastHashMap(); // <String, FormSet>

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'hConstants' is still used
in `src/main/java/org/apache/commons/validator/ValidatorResources.java`
#### Snippet
```java
     */
    @Deprecated
    protected FastHashMap hConstants = new FastHashMap(); // <String, String>

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'hActions' is still used
in `src/main/java/org/apache/commons/validator/ValidatorResources.java`
#### Snippet
```java
     */
    @Deprecated
    protected FastHashMap hActions = new FastHashMap(); // <String, ValidatorAction>

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'copyFastHashMap' is still used
in `src/main/java/org/apache/commons/validator/util/ValidatorUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static FastHashMap copyFastHashMap(final FastHashMap fastHashMap) {
        final FastHashMap results = new FastHashMap();
        @SuppressWarnings("unchecked") // FastHashMap is not generic
```

### DeprecatedIsStillUsed
Deprecated member 'hFields' is still used
in `src/main/java/org/apache/commons/validator/Form.java`
#### Snippet
```java
     */
    @Deprecated
    protected FastHashMap hFields = new FastHashMap(); // <String, Field>

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'hVars' is still used
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
     */
    @Deprecated
    protected FastHashMap hVars = new FastHashMap(); // <String, Var>

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'hMsgs' is still used
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
     */
    @Deprecated
    protected FastHashMap hMsgs = new FastHashMap(); // <String, Msg>

    /**
```

## RuleId[ruleID=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of field `lengths`
in `src/main/java/org/apache/commons/validator/routines/CreditCardValidator.java`
#### Snippet
```java
        final int minLen; // e.g. 16 or -1
        final int maxLen; // e.g. 19 or -1
        final int lengths[]; // e.g. 16,18,19

        /**
```

### CStyleArrayDeclaration
C-style array declaration of local variable `indexedList`
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
        final int fieldIndex = this.methodParameterList.indexOf(Validator.FIELD_PARAM);

        final Object indexedList[] = field.getIndexedProperty(paramValues[beanIndex]);

        // Set current iteration object to the parameter array
```

### CStyleArrayDeclaration
C-style array declaration of field `REGISTRATIONS`
in `src/main/java/org/apache/commons/validator/ValidatorResources.java`
#### Snippet
```java
     * <strong>MUST</strong> be an even number of Strings in this list!
     */
    private static final String REGISTRATIONS[] = {
        "-//Apache Software Foundation//DTD Commons Validator Rules Configuration 1.0//EN",
        "/org/apache/commons/validator/resources/validator_1_0.dtd",
```

## RuleId[ruleID=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `maxValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/LongValidator.java`
#### Snippet
```java
     *         or equal to the maximum.
     */
    public boolean maxValue(final long value, final long max) {
        return (value <= max);
    }
```

### MethodOverloadsParentMethod
Method `maxValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/ByteValidator.java`
#### Snippet
```java
     *         or equal to the maximum.
     */
    public boolean maxValue(final Byte value, final byte max) {
        return maxValue(value.byteValue(), max);
    }
```

### MethodOverloadsParentMethod
Method `minValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/LongValidator.java`
#### Snippet
```java
     *         or equal to the minimum.
     */
    public boolean minValue(final long value, final long min) {
        return (value >= min);
    }
```

### MethodOverloadsParentMethod
Method `maxValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/ByteValidator.java`
#### Snippet
```java
     *         or equal to the maximum.
     */
    public boolean maxValue(final byte value, final byte max) {
        return (value <= max);
    }
```

### MethodOverloadsParentMethod
Method `isInRange()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/LongValidator.java`
#### Snippet
```java
     *         specified range.
     */
    public boolean isInRange(final long value, final long min, final long max) {
        return (value >= min && value <= max);
    }
```

### MethodOverloadsParentMethod
Method `isInRange()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/ByteValidator.java`
#### Snippet
```java
     *         specified range.
     */
    public boolean isInRange(final byte value, final byte min, final byte max) {
        return (value >= min && value <= max);
    }
```

### MethodOverloadsParentMethod
Method `minValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/LongValidator.java`
#### Snippet
```java
     *         or equal to the minimum.
     */
    public boolean minValue(final Long value, final long min) {
        return minValue(value.longValue(), min);
    }
```

### MethodOverloadsParentMethod
Method `isInRange()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/LongValidator.java`
#### Snippet
```java
     *         specified range.
     */
    public boolean isInRange(final Long value, final long min, final long max) {
        return isInRange(value.longValue(), min, max);
    }
```

### MethodOverloadsParentMethod
Method `minValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/ByteValidator.java`
#### Snippet
```java
     *         or equal to the minimum.
     */
    public boolean minValue(final byte value, final byte min) {
        return (value >= min);
    }
```

### MethodOverloadsParentMethod
Method `maxValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/LongValidator.java`
#### Snippet
```java
     *         or equal to the maximum.
     */
    public boolean maxValue(final Long value, final long max) {
        return maxValue(value.longValue(), max);
    }
```

### MethodOverloadsParentMethod
Method `isInRange()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/ByteValidator.java`
#### Snippet
```java
     *         specified range.
     */
    public boolean isInRange(final Byte value, final byte min, final byte max) {
        return isInRange(value.byteValue(), min, max);
    }
```

### MethodOverloadsParentMethod
Method `minValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/ByteValidator.java`
#### Snippet
```java
     *         or equal to the minimum.
     */
    public boolean minValue(final Byte value, final byte min) {
        return minValue(value.byteValue(), min);
    }
```

### MethodOverloadsParentMethod
Method `isInRange()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/BigDecimalValidator.java`
#### Snippet
```java
     *         specified range.
     */
    public boolean isInRange(final BigDecimal value, final double min, final double max) {
        return (value.doubleValue() >= min && value.doubleValue() <= max);
    }
```

### MethodOverloadsParentMethod
Method `maxValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/BigDecimalValidator.java`
#### Snippet
```java
     *         or equal to the maximum.
     */
    public boolean maxValue(final BigDecimal value, final double max) {
        return (value.doubleValue() <= max);
    }
```

### MethodOverloadsParentMethod
Method `minValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/BigDecimalValidator.java`
#### Snippet
```java
     *         or equal to the minimum.
     */
    public boolean minValue(final BigDecimal value, final double min) {
        return (value.doubleValue() >= min);
    }
```

### MethodOverloadsParentMethod
Method `isInRange()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/DoubleValidator.java`
#### Snippet
```java
     *         specified range.
     */
    public boolean isInRange(final Double value, final double min, final double max) {
        return isInRange(value.doubleValue(), min, max);
    }
```

### MethodOverloadsParentMethod
Method `minValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/DoubleValidator.java`
#### Snippet
```java
     *         or equal to the minimum.
     */
    public boolean minValue(final Double value, final double min) {
        return minValue(value.doubleValue(), min);
    }
```

### MethodOverloadsParentMethod
Method `minValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/DoubleValidator.java`
#### Snippet
```java
     *         or equal to the minimum.
     */
    public boolean minValue(final double value, final double min) {
        return (value >= min);
    }
```

### MethodOverloadsParentMethod
Method `maxValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/DoubleValidator.java`
#### Snippet
```java
     *         or equal to the maximum.
     */
    public boolean maxValue(final Double value, final double max) {
        return maxValue(value.doubleValue(), max);
    }
```

### MethodOverloadsParentMethod
Method `isInRange()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/DoubleValidator.java`
#### Snippet
```java
     *         specified range.
     */
    public boolean isInRange(final double value, final double min, final double max) {
        return (value >= min && value <= max);
    }
```

### MethodOverloadsParentMethod
Method `maxValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/DoubleValidator.java`
#### Snippet
```java
     *         or equal to the maximum.
     */
    public boolean maxValue(final double value, final double max) {
        return (value <= max);
    }
```

### MethodOverloadsParentMethod
Method `minValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/ShortValidator.java`
#### Snippet
```java
     *         or equal to the minimum.
     */
    public boolean minValue(final Short value, final short min) {
        return minValue(value.shortValue(), min);
    }
```

### MethodOverloadsParentMethod
Method `maxValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/ShortValidator.java`
#### Snippet
```java
     *         or equal to the maximum.
     */
    public boolean maxValue(final short value, final short max) {
        return (value <= max);
    }
```

### MethodOverloadsParentMethod
Method `minValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/ShortValidator.java`
#### Snippet
```java
     *         or equal to the minimum.
     */
    public boolean minValue(final short value, final short min) {
        return (value >= min);
    }
```

### MethodOverloadsParentMethod
Method `isInRange()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/ShortValidator.java`
#### Snippet
```java
     *         specified range.
     */
    public boolean isInRange(final Short value, final short min, final short max) {
        return isInRange(value.shortValue(), min, max);
    }
```

### MethodOverloadsParentMethod
Method `isInRange()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/ShortValidator.java`
#### Snippet
```java
     *         specified range.
     */
    public boolean isInRange(final short value, final short min, final short max) {
        return (value >= min && value <= max);
    }
```

### MethodOverloadsParentMethod
Method `maxValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/ShortValidator.java`
#### Snippet
```java
     *         or equal to the maximum.
     */
    public boolean maxValue(final Short value, final short max) {
        return maxValue(value.shortValue(), max);
    }
```

### MethodOverloadsParentMethod
Method `isInRange()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/IntegerValidator.java`
#### Snippet
```java
     *         specified range.
     */
    public boolean isInRange(final int value, final int min, final int max) {
        return (value >= min && value <= max);
    }
```

### MethodOverloadsParentMethod
Method `minValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/IntegerValidator.java`
#### Snippet
```java
     *         or equal to the minimum.
     */
    public boolean minValue(final Integer value, final int min) {
        return minValue(value.intValue(), min);
    }
```

### MethodOverloadsParentMethod
Method `isInRange()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/IntegerValidator.java`
#### Snippet
```java
     *         specified range.
     */
    public boolean isInRange(final Integer value, final int min, final int max) {
        return isInRange(value.intValue(), min, max);
    }
```

### MethodOverloadsParentMethod
Method `maxValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/IntegerValidator.java`
#### Snippet
```java
     *         or equal to the maximum.
     */
    public boolean maxValue(final int value, final int max) {
        return (value <= max);
    }
```

### MethodOverloadsParentMethod
Method `minValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/IntegerValidator.java`
#### Snippet
```java
     *         or equal to the minimum.
     */
    public boolean minValue(final int value, final int min) {
        return (value >= min);
    }
```

### MethodOverloadsParentMethod
Method `maxValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/IntegerValidator.java`
#### Snippet
```java
     *         or equal to the maximum.
     */
    public boolean maxValue(final Integer value, final int max) {
        return maxValue(value.intValue(), max);
    }
```

### MethodOverloadsParentMethod
Method `isInRange()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/BigIntegerValidator.java`
#### Snippet
```java
     *         specified range.
     */
    public boolean isInRange(final BigInteger value, final long min, final long max) {
        return (value.longValue() >= min && value.longValue() <= max);
    }
```

### MethodOverloadsParentMethod
Method `maxValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/BigIntegerValidator.java`
#### Snippet
```java
     *         or equal to the maximum.
     */
    public boolean maxValue(final BigInteger value, final long max) {
        return (value.longValue() <= max);
    }
```

### MethodOverloadsParentMethod
Method `minValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/BigIntegerValidator.java`
#### Snippet
```java
     *         or equal to the minimum.
     */
    public boolean minValue(final BigInteger value, final long min) {
        return (value.longValue() >= min);
    }
```

### MethodOverloadsParentMethod
Method `isInRange()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/FloatValidator.java`
#### Snippet
```java
     *         specified range.
     */
    public boolean isInRange(final float value, final float min, final float max) {
        return (value >= min && value <= max);
    }
```

### MethodOverloadsParentMethod
Method `minValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/FloatValidator.java`
#### Snippet
```java
     *         or equal to the minimum.
     */
    public boolean minValue(final float value, final float min) {
        return (value >= min);
    }
```

### MethodOverloadsParentMethod
Method `maxValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/FloatValidator.java`
#### Snippet
```java
     *         or equal to the maximum.
     */
    public boolean maxValue(final float value, final float max) {
        return (value <= max);
    }
```

### MethodOverloadsParentMethod
Method `minValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/FloatValidator.java`
#### Snippet
```java
     *         or equal to the minimum.
     */
    public boolean minValue(final Float value, final float min) {
        return minValue(value.floatValue(), min);
    }
```

### MethodOverloadsParentMethod
Method `isInRange()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/FloatValidator.java`
#### Snippet
```java
     *         specified range.
     */
    public boolean isInRange(final Float value, final float min, final float max) {
        return isInRange(value.floatValue(), min, max);
    }
```

### MethodOverloadsParentMethod
Method `maxValue()` overloads a compatible method of a superclass, when overriding might have been intended
in `src/main/java/org/apache/commons/validator/routines/FloatValidator.java`
#### Snippet
```java
     *         or equal to the maximum.
     */
    public boolean maxValue(final Float value, final float max) {
        return maxValue(value.floatValue(), max);
    }
```

## RuleId[ruleID=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `src/main/java/org/apache/commons/validator/routines/EmailValidator.java`
#### Snippet
```java
    private static final String EMAIL_REGEX = "^(.+)@(\\S+)$";
    private static final String IP_DOMAIN_REGEX = "^\\[(.*)\\]$";
    private static final String USER_REGEX = "^" + WORD + "(\\." + WORD + ")*$";

    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `src/main/java/org/apache/commons/validator/routines/EmailValidator.java`
#### Snippet
```java
    private static final String EMAIL_REGEX = "^(.+)@(\\S+)$";
    private static final String IP_DOMAIN_REGEX = "^\\[(.*)\\]$";
    private static final String USER_REGEX = "^" + WORD + "(\\." + WORD + ")*$";

    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
```

### RegExpRedundantEscape
Redundant character escape `\"` in RegExp
in `src/main/java/org/apache/commons/validator/routines/EmailValidator.java`
#### Snippet
```java
    private static final String EMAIL_REGEX = "^(.+)@(\\S+)$";
    private static final String IP_DOMAIN_REGEX = "^\\[(.*)\\]$";
    private static final String USER_REGEX = "^" + WORD + "(\\." + WORD + ")*$";

    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
```

### RegExpRedundantEscape
Redundant character escape `\.` in RegExp
in `src/main/java/org/apache/commons/validator/routines/EmailValidator.java`
#### Snippet
```java
    private static final String EMAIL_REGEX = "^(.+)@(\\S+)$";
    private static final String IP_DOMAIN_REGEX = "^\\[(.*)\\]$";
    private static final String USER_REGEX = "^" + WORD + "(\\." + WORD + ")*$";

    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `src/main/java/org/apache/commons/validator/routines/EmailValidator.java`
#### Snippet
```java
    private static final String EMAIL_REGEX = "^(.+)@(\\S+)$";
    private static final String IP_DOMAIN_REGEX = "^\\[(.*)\\]$";
    private static final String USER_REGEX = "^" + WORD + "(\\." + WORD + ")*$";

    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `src/main/java/org/apache/commons/validator/routines/EmailValidator.java`
#### Snippet
```java
    private static final String EMAIL_REGEX = "^(.+)@(\\S+)$";
    private static final String IP_DOMAIN_REGEX = "^\\[(.*)\\]$";
    private static final String USER_REGEX = "^" + WORD + "(\\." + WORD + ")*$";

    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
```

### RegExpRedundantEscape
Redundant character escape `\"` in RegExp
in `src/main/java/org/apache/commons/validator/routines/EmailValidator.java`
#### Snippet
```java
    private static final String EMAIL_REGEX = "^(.+)@(\\S+)$";
    private static final String IP_DOMAIN_REGEX = "^\\[(.*)\\]$";
    private static final String USER_REGEX = "^" + WORD + "(\\." + WORD + ")*$";

    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
```

### RegExpRedundantEscape
Redundant character escape `\.` in RegExp
in `src/main/java/org/apache/commons/validator/routines/EmailValidator.java`
#### Snippet
```java
    private static final String EMAIL_REGEX = "^(.+)@(\\S+)$";
    private static final String IP_DOMAIN_REGEX = "^\\[(.*)\\]$";
    private static final String USER_REGEX = "^" + WORD + "(\\." + WORD + ")*$";

    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/org/apache/commons/validator/routines/EmailValidator.java`
#### Snippet
```java

    private static final String EMAIL_REGEX = "^(.+)@(\\S+)$";
    private static final String IP_DOMAIN_REGEX = "^\\[(.*)\\]$";
    private static final String USER_REGEX = "^" + WORD + "(\\." + WORD + ")*$";

```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `src/main/java/org/apache/commons/validator/routines/EmailValidator.java`
#### Snippet
```java

    private static final String SPECIAL_CHARS = "\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]";
    private static final String VALID_CHARS = "(\\\\.)|[^\\s" + SPECIAL_CHARS + "]";
    private static final String QUOTED_USER = "(\"(\\\\\"|[^\"])*\")";
    private static final String WORD = "((" + VALID_CHARS + "|')+|" + QUOTED_USER + ")";
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `src/main/java/org/apache/commons/validator/routines/EmailValidator.java`
#### Snippet
```java

    private static final String SPECIAL_CHARS = "\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]";
    private static final String VALID_CHARS = "(\\\\.)|[^\\s" + SPECIAL_CHARS + "]";
    private static final String QUOTED_USER = "(\"(\\\\\"|[^\"])*\")";
    private static final String WORD = "((" + VALID_CHARS + "|')+|" + QUOTED_USER + ")";
```

### RegExpRedundantEscape
Redundant character escape `\"` in RegExp
in `src/main/java/org/apache/commons/validator/routines/EmailValidator.java`
#### Snippet
```java

    private static final String SPECIAL_CHARS = "\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]";
    private static final String VALID_CHARS = "(\\\\.)|[^\\s" + SPECIAL_CHARS + "]";
    private static final String QUOTED_USER = "(\"(\\\\\"|[^\"])*\")";
    private static final String WORD = "((" + VALID_CHARS + "|')+|" + QUOTED_USER + ")";
```

### RegExpRedundantEscape
Redundant character escape `\.` in RegExp
in `src/main/java/org/apache/commons/validator/routines/EmailValidator.java`
#### Snippet
```java

    private static final String SPECIAL_CHARS = "\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]";
    private static final String VALID_CHARS = "(\\\\.)|[^\\s" + SPECIAL_CHARS + "]";
    private static final String QUOTED_USER = "(\"(\\\\\"|[^\"])*\")";
    private static final String WORD = "((" + VALID_CHARS + "|')+|" + QUOTED_USER + ")";
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `src/main/java/org/apache/commons/validator/routines/EmailValidator.java`
#### Snippet
```java
    private static final String VALID_CHARS = "(\\\\.)|[^\\s" + SPECIAL_CHARS + "]";
    private static final String QUOTED_USER = "(\"(\\\\\"|[^\"])*\")";
    private static final String WORD = "((" + VALID_CHARS + "|')+|" + QUOTED_USER + ")";

    private static final String EMAIL_REGEX = "^(.+)@(\\S+)$";
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `src/main/java/org/apache/commons/validator/routines/EmailValidator.java`
#### Snippet
```java
    private static final String VALID_CHARS = "(\\\\.)|[^\\s" + SPECIAL_CHARS + "]";
    private static final String QUOTED_USER = "(\"(\\\\\"|[^\"])*\")";
    private static final String WORD = "((" + VALID_CHARS + "|')+|" + QUOTED_USER + ")";

    private static final String EMAIL_REGEX = "^(.+)@(\\S+)$";
```

### RegExpRedundantEscape
Redundant character escape `\"` in RegExp
in `src/main/java/org/apache/commons/validator/routines/EmailValidator.java`
#### Snippet
```java
    private static final String VALID_CHARS = "(\\\\.)|[^\\s" + SPECIAL_CHARS + "]";
    private static final String QUOTED_USER = "(\"(\\\\\"|[^\"])*\")";
    private static final String WORD = "((" + VALID_CHARS + "|')+|" + QUOTED_USER + ")";

    private static final String EMAIL_REGEX = "^(.+)@(\\S+)$";
```

### RegExpRedundantEscape
Redundant character escape `\.` in RegExp
in `src/main/java/org/apache/commons/validator/routines/EmailValidator.java`
#### Snippet
```java
    private static final String VALID_CHARS = "(\\\\.)|[^\\s" + SPECIAL_CHARS + "]";
    private static final String QUOTED_USER = "(\"(\\\\\"|[^\"])*\")";
    private static final String WORD = "((" + VALID_CHARS + "|')+|" + QUOTED_USER + ")";

    private static final String EMAIL_REGEX = "^(.+)@(\\S+)$";
```

### RegExpRedundantEscape
Redundant character escape `\\\"` in RegExp
in `src/main/java/org/apache/commons/validator/routines/EmailValidator.java`
#### Snippet
```java
    private static final long serialVersionUID = 1705927040799295880L;

    private static final String SPECIAL_CHARS = "\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]";
    private static final String VALID_CHARS = "(\\\\.)|[^\\s" + SPECIAL_CHARS + "]";
    private static final String QUOTED_USER = "(\"(\\\\\"|[^\"])*\")";
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/org/apache/commons/validator/routines/EmailValidator.java`
#### Snippet
```java
    private static final long serialVersionUID = 1705927040799295880L;

    private static final String SPECIAL_CHARS = "\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]";
    private static final String VALID_CHARS = "(\\\\.)|[^\\s" + SPECIAL_CHARS + "]";
    private static final String QUOTED_USER = "(\"(\\\\\"|[^\"])*\")";
```

### RegExpRedundantEscape
Redundant character escape `\\+` in RegExp
in `src/main/java/org/apache/commons/validator/UrlValidator.java`
#### Snippet
```java
     * Protocol (ie. http:, ftp:,https:).
     */
    private static final Pattern SCHEME_PATTERN = Pattern.compile("^\\p{Alpha}[\\p{Alnum}\\+\\-\\.]*");

    private static final String AUTHORITY_REGEX =
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `src/main/java/org/apache/commons/validator/UrlValidator.java`
#### Snippet
```java
     * Protocol (ie. http:, ftp:,https:).
     */
    private static final Pattern SCHEME_PATTERN = Pattern.compile("^\\p{Alpha}[\\p{Alnum}\\+\\-\\.]*");

    private static final String AUTHORITY_REGEX =
```

### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `src/main/java/org/apache/commons/validator/UrlValidator.java`
#### Snippet
```java

    // Drop numeric, and  "+-." for now
    private static final String AUTHORITY_CHARS_REGEX = "\\p{Alnum}\\-\\.";

    private static final String ATOM = VALID_CHARS + '+';
```

### RegExpRedundantEscape
Redundant character escape `\.` in RegExp
in `src/main/java/org/apache/commons/validator/UrlValidator.java`
#### Snippet
```java

    private static final String AUTHORITY_REGEX =
       "^([" + AUTHORITY_CHARS_REGEX + "]*)(:\\d*)?(.*)?";
    //                                                                            1                          2  3       4
    private static final Pattern AUTHORITY_PATTERN = Pattern.compile(AUTHORITY_REGEX);
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
// NOT USED   private static final Pattern LEGAL_ASCII_PATTERN = Pattern.compile("^\\p{ASCII}+$");
// NOT USED   private static final Pattern EMAIL_PATTERN = Pattern.compile("^(.+)@(.+)$");
    private static final Pattern IP_DOMAIN_PATTERN = Pattern.compile("^\\[(.*)\\]$");
    private static final Pattern TLD_PATTERN = Pattern.compile("^([a-zA-Z]+)$");

```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
    private static final String QUOTED_USER = "(\"[^\"]*\")";
    private static final String ATOM = VALID_CHARS + '+';
    private static final String WORD = "((" + VALID_CHARS + "|')+|" + QUOTED_USER + ")";

// NOT USED   private static final Pattern LEGAL_ASCII_PATTERN = Pattern.compile("^\\p{ASCII}+$");
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
    private static final String QUOTED_USER = "(\"[^\"]*\")";
    private static final String ATOM = VALID_CHARS + '+';
    private static final String WORD = "((" + VALID_CHARS + "|')+|" + QUOTED_USER + ")";

// NOT USED   private static final Pattern LEGAL_ASCII_PATTERN = Pattern.compile("^\\p{ASCII}+$");
```

### RegExpRedundantEscape
Redundant character escape `\"` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
    private static final String QUOTED_USER = "(\"[^\"]*\")";
    private static final String ATOM = VALID_CHARS + '+';
    private static final String WORD = "((" + VALID_CHARS + "|')+|" + QUOTED_USER + ")";

// NOT USED   private static final Pattern LEGAL_ASCII_PATTERN = Pattern.compile("^\\p{ASCII}+$");
```

### RegExpRedundantEscape
Redundant character escape `\.` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
    private static final String QUOTED_USER = "(\"[^\"]*\")";
    private static final String ATOM = VALID_CHARS + '+';
    private static final String WORD = "((" + VALID_CHARS + "|')+|" + QUOTED_USER + ")";

// NOT USED   private static final Pattern LEGAL_ASCII_PATTERN = Pattern.compile("^\\p{ASCII}+$");
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
    private static final Pattern USER_PATTERN = Pattern.compile("^\\s*" + WORD + "(\\." + WORD + ")*$");
    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^" + ATOM + "(\\." + ATOM + ")*\\s*$");
    private static final Pattern ATOM_PATTERN = Pattern.compile("(" + ATOM + ")");

    /**
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
    private static final Pattern USER_PATTERN = Pattern.compile("^\\s*" + WORD + "(\\." + WORD + ")*$");
    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^" + ATOM + "(\\." + ATOM + ")*\\s*$");
    private static final Pattern ATOM_PATTERN = Pattern.compile("(" + ATOM + ")");

    /**
```

### RegExpRedundantEscape
Redundant character escape `\"` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
    private static final Pattern USER_PATTERN = Pattern.compile("^\\s*" + WORD + "(\\." + WORD + ")*$");
    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^" + ATOM + "(\\." + ATOM + ")*\\s*$");
    private static final Pattern ATOM_PATTERN = Pattern.compile("(" + ATOM + ")");

    /**
```

### RegExpRedundantEscape
Redundant character escape `\.` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
    private static final Pattern USER_PATTERN = Pattern.compile("^\\s*" + WORD + "(\\." + WORD + ")*$");
    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^" + ATOM + "(\\." + ATOM + ")*\\s*$");
    private static final Pattern ATOM_PATTERN = Pattern.compile("(" + ATOM + ")");

    /**
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java

    private static final Pattern USER_PATTERN = Pattern.compile("^\\s*" + WORD + "(\\." + WORD + ")*$");
    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^" + ATOM + "(\\." + ATOM + ")*\\s*$");
    private static final Pattern ATOM_PATTERN = Pattern.compile("(" + ATOM + ")");

```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java

    private static final Pattern USER_PATTERN = Pattern.compile("^\\s*" + WORD + "(\\." + WORD + ")*$");
    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^" + ATOM + "(\\." + ATOM + ")*\\s*$");
    private static final Pattern ATOM_PATTERN = Pattern.compile("(" + ATOM + ")");

```

### RegExpRedundantEscape
Redundant character escape `\"` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java

    private static final Pattern USER_PATTERN = Pattern.compile("^\\s*" + WORD + "(\\." + WORD + ")*$");
    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^" + ATOM + "(\\." + ATOM + ")*\\s*$");
    private static final Pattern ATOM_PATTERN = Pattern.compile("(" + ATOM + ")");

```

### RegExpRedundantEscape
Redundant character escape `\.` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java

    private static final Pattern USER_PATTERN = Pattern.compile("^\\s*" + WORD + "(\\." + WORD + ")*$");
    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^" + ATOM + "(\\." + ATOM + ")*\\s*$");
    private static final Pattern ATOM_PATTERN = Pattern.compile("(" + ATOM + ")");

```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java

    private static final Pattern USER_PATTERN = Pattern.compile("^\\s*" + WORD + "(\\." + WORD + ")*$");
    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^" + ATOM + "(\\." + ATOM + ")*\\s*$");
    private static final Pattern ATOM_PATTERN = Pattern.compile("(" + ATOM + ")");

```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java

    private static final Pattern USER_PATTERN = Pattern.compile("^\\s*" + WORD + "(\\." + WORD + ")*$");
    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^" + ATOM + "(\\." + ATOM + ")*\\s*$");
    private static final Pattern ATOM_PATTERN = Pattern.compile("(" + ATOM + ")");

```

### RegExpRedundantEscape
Redundant character escape `\"` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java

    private static final Pattern USER_PATTERN = Pattern.compile("^\\s*" + WORD + "(\\." + WORD + ")*$");
    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^" + ATOM + "(\\." + ATOM + ")*\\s*$");
    private static final Pattern ATOM_PATTERN = Pattern.compile("(" + ATOM + ")");

```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/org/apache/commons/validator/routines/UrlValidator.java`
#### Snippet
```java
            "(?::" + USERINFO_CHARS_REGEX + "*)?@"; // colon and password may be absent
    private static final String AUTHORITY_REGEX =
            "(?:\\[("+IPV6_REGEX+")\\]|(?:(?:"+USERINFO_FIELD_REGEX+")?([" + AUTHORITY_CHARS_REGEX + "]*)))(?::(\\d*))?(.*)?";
    //             1                          e.g. user:pass@          2                                         3       4
    private static final Pattern AUTHORITY_PATTERN = Pattern.compile(AUTHORITY_REGEX);
```

### RegExpRedundantEscape
Redundant character escape `\.` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java

    private static final Pattern USER_PATTERN = Pattern.compile("^\\s*" + WORD + "(\\." + WORD + ")*$");
    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^" + ATOM + "(\\." + ATOM + ")*\\s*$");
    private static final Pattern ATOM_PATTERN = Pattern.compile("(" + ATOM + ")");

```

### RegExpRedundantEscape
Redundant character escape `\.` in RegExp
in `src/main/java/org/apache/commons/validator/routines/UrlValidator.java`
#### Snippet
```java
            "(?::" + USERINFO_CHARS_REGEX + "*)?@"; // colon and password may be absent
    private static final String AUTHORITY_REGEX =
            "(?:\\[("+IPV6_REGEX+")\\]|(?:(?:"+USERINFO_FIELD_REGEX+")?([" + AUTHORITY_CHARS_REGEX + "]*)))(?::(\\d*))?(.*)?";
    //             1                          e.g. user:pass@          2                                         3       4
    private static final Pattern AUTHORITY_PATTERN = Pattern.compile(AUTHORITY_REGEX);
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
    private static final Pattern TLD_PATTERN = Pattern.compile("^([a-zA-Z]+)$");

    private static final Pattern USER_PATTERN = Pattern.compile("^\\s*" + WORD + "(\\." + WORD + ")*$");
    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^" + ATOM + "(\\." + ATOM + ")*\\s*$");
    private static final Pattern ATOM_PATTERN = Pattern.compile("(" + ATOM + ")");
```

### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `src/main/java/org/apache/commons/validator/routines/UrlValidator.java`
#### Snippet
```java
    // TODO does not allow for optional userinfo.
    // Validation of character set is done by isValidAuthority
    private static final String AUTHORITY_CHARS_REGEX = "\\p{Alnum}\\-\\."; // allows for IPV4 but not IPV6
    // Allow for IPv4 mapped addresses: ::FFF:123.123.123.123
    private static final String IPV6_REGEX = "::FFFF:(?:\\d{1,3}\\.){3}\\d{1,3}|[0-9a-fA-F:]+"; // do this as separate match because : could cause ambiguity with port prefix
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
    private static final Pattern TLD_PATTERN = Pattern.compile("^([a-zA-Z]+)$");

    private static final Pattern USER_PATTERN = Pattern.compile("^\\s*" + WORD + "(\\." + WORD + ")*$");
    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^" + ATOM + "(\\." + ATOM + ")*\\s*$");
    private static final Pattern ATOM_PATTERN = Pattern.compile("(" + ATOM + ")");
```

### RegExpRedundantEscape
Redundant character escape `\\(` in RegExp
in `src/main/java/org/apache/commons/validator/routines/UrlValidator.java`
#### Snippet
```java
    private static final int PARSE_AUTHORITY_EXTRA = 4;

    private static final String PATH_REGEX = "^(/[-\\w:@&?=+,.!/~*'%$_;\\(\\)]*)?$";
    private static final Pattern PATH_PATTERN = Pattern.compile(PATH_REGEX);

```

### RegExpRedundantEscape
Redundant character escape `\\)` in RegExp
in `src/main/java/org/apache/commons/validator/routines/UrlValidator.java`
#### Snippet
```java
    private static final int PARSE_AUTHORITY_EXTRA = 4;

    private static final String PATH_REGEX = "^(/[-\\w:@&?=+,.!/~*'%$_;\\(\\)]*)?$";
    private static final Pattern PATH_PATTERN = Pattern.compile(PATH_REGEX);

```

### RegExpRedundantEscape
Redundant character escape `\"` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
    private static final Pattern TLD_PATTERN = Pattern.compile("^([a-zA-Z]+)$");

    private static final Pattern USER_PATTERN = Pattern.compile("^\\s*" + WORD + "(\\." + WORD + ")*$");
    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^" + ATOM + "(\\." + ATOM + ")*\\s*$");
    private static final Pattern ATOM_PATTERN = Pattern.compile("(" + ATOM + ")");
```

### RegExpRedundantEscape
Redundant character escape `\\+` in RegExp
in `src/main/java/org/apache/commons/validator/routines/UrlValidator.java`
#### Snippet
```java
     * Protocol scheme (e.g. http, ftp, https).
     */
    private static final String SCHEME_REGEX = "^\\p{Alpha}[\\p{Alnum}\\+\\-\\.]*";
    private static final Pattern SCHEME_PATTERN = Pattern.compile(SCHEME_REGEX);

```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `src/main/java/org/apache/commons/validator/routines/UrlValidator.java`
#### Snippet
```java
     * Protocol scheme (e.g. http, ftp, https).
     */
    private static final String SCHEME_REGEX = "^\\p{Alpha}[\\p{Alnum}\\+\\-\\.]*";
    private static final Pattern SCHEME_PATTERN = Pattern.compile(SCHEME_REGEX);

```

### RegExpRedundantEscape
Redundant character escape `\.` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
    private static final Pattern TLD_PATTERN = Pattern.compile("^([a-zA-Z]+)$");

    private static final Pattern USER_PATTERN = Pattern.compile("^\\s*" + WORD + "(\\." + WORD + ")*$");
    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^" + ATOM + "(\\." + ATOM + ")*\\s*$");
    private static final Pattern ATOM_PATTERN = Pattern.compile("(" + ATOM + ")");
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
    private static final Pattern TLD_PATTERN = Pattern.compile("^([a-zA-Z]+)$");

    private static final Pattern USER_PATTERN = Pattern.compile("^\\s*" + WORD + "(\\." + WORD + ")*$");
    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^" + ATOM + "(\\." + ATOM + ")*\\s*$");
    private static final Pattern ATOM_PATTERN = Pattern.compile("(" + ATOM + ")");
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
    private static final Pattern TLD_PATTERN = Pattern.compile("^([a-zA-Z]+)$");

    private static final Pattern USER_PATTERN = Pattern.compile("^\\s*" + WORD + "(\\." + WORD + ")*$");
    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^" + ATOM + "(\\." + ATOM + ")*\\s*$");
    private static final Pattern ATOM_PATTERN = Pattern.compile("(" + ATOM + ")");
```

### RegExpRedundantEscape
Redundant character escape `\"` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
    private static final Pattern TLD_PATTERN = Pattern.compile("^([a-zA-Z]+)$");

    private static final Pattern USER_PATTERN = Pattern.compile("^\\s*" + WORD + "(\\." + WORD + ")*$");
    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^" + ATOM + "(\\." + ATOM + ")*\\s*$");
    private static final Pattern ATOM_PATTERN = Pattern.compile("(" + ATOM + ")");
```

### RegExpRedundantEscape
Redundant character escape `\.` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
    private static final Pattern TLD_PATTERN = Pattern.compile("^([a-zA-Z]+)$");

    private static final Pattern USER_PATTERN = Pattern.compile("^\\s*" + WORD + "(\\." + WORD + ")*$");
    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^" + ATOM + "(\\." + ATOM + ")*\\s*$");
    private static final Pattern ATOM_PATTERN = Pattern.compile("(" + ATOM + ")");
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java

    private static final String SPECIAL_CHARS = "\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]";
    private static final String VALID_CHARS = "[^\\s" + SPECIAL_CHARS + "]";
    private static final String QUOTED_USER = "(\"[^\"]*\")";
    private static final String ATOM = VALID_CHARS + '+';
```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java

    private static final String SPECIAL_CHARS = "\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]";
    private static final String VALID_CHARS = "[^\\s" + SPECIAL_CHARS + "]";
    private static final String QUOTED_USER = "(\"[^\"]*\")";
    private static final String ATOM = VALID_CHARS + '+';
```

### RegExpRedundantEscape
Redundant character escape `\"` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java

    private static final String SPECIAL_CHARS = "\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]";
    private static final String VALID_CHARS = "[^\\s" + SPECIAL_CHARS + "]";
    private static final String QUOTED_USER = "(\"[^\"]*\")";
    private static final String ATOM = VALID_CHARS + '+';
```

### RegExpRedundantEscape
Redundant character escape `\.` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java

    private static final String SPECIAL_CHARS = "\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]";
    private static final String VALID_CHARS = "[^\\s" + SPECIAL_CHARS + "]";
    private static final String QUOTED_USER = "(\"[^\"]*\")";
    private static final String ATOM = VALID_CHARS + '+';
```

### RegExpRedundantEscape
Redundant character escape `\(` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
    private static final String VALID_CHARS = "[^\\s" + SPECIAL_CHARS + "]";
    private static final String QUOTED_USER = "(\"[^\"]*\")";
    private static final String ATOM = VALID_CHARS + '+';
    private static final String WORD = "((" + VALID_CHARS + "|')+|" + QUOTED_USER + ")";

```

### RegExpRedundantEscape
Redundant character escape `\)` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
    private static final String VALID_CHARS = "[^\\s" + SPECIAL_CHARS + "]";
    private static final String QUOTED_USER = "(\"[^\"]*\")";
    private static final String ATOM = VALID_CHARS + '+';
    private static final String WORD = "((" + VALID_CHARS + "|')+|" + QUOTED_USER + ")";

```

### RegExpRedundantEscape
Redundant character escape `\"` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
    private static final String VALID_CHARS = "[^\\s" + SPECIAL_CHARS + "]";
    private static final String QUOTED_USER = "(\"[^\"]*\")";
    private static final String ATOM = VALID_CHARS + '+';
    private static final String WORD = "((" + VALID_CHARS + "|')+|" + QUOTED_USER + ")";

```

### RegExpRedundantEscape
Redundant character escape `\.` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
    private static final String VALID_CHARS = "[^\\s" + SPECIAL_CHARS + "]";
    private static final String QUOTED_USER = "(\"[^\"]*\")";
    private static final String ATOM = VALID_CHARS + '+';
    private static final String WORD = "((" + VALID_CHARS + "|')+|" + QUOTED_USER + ")";

```

### RegExpRedundantEscape
Redundant character escape `\\\"` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
public class EmailValidator {

    private static final String SPECIAL_CHARS = "\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]";
    private static final String VALID_CHARS = "[^\\s" + SPECIAL_CHARS + "]";
    private static final String QUOTED_USER = "(\"[^\"]*\")";
```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
public class EmailValidator {

    private static final String SPECIAL_CHARS = "\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]";
    private static final String VALID_CHARS = "[^\\s" + SPECIAL_CHARS + "]";
    private static final String QUOTED_USER = "(\"[^\"]*\")";
```

## RuleId[ruleID=ConfusingOctalEscape]
### ConfusingOctalEscape
Octal escape sequence `\111` immediately followed by a digit
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
    protected String stripComments(final String emailStr)  {
     String result = emailStr;
     final String commentPat = "^((?:[^\"\\\\]|\\\\.)*(?:\"(?:[^\"\\\\]|\\\\.)*\"(?:[^\"\\\\]|\111111\\\\.)*)*)\\((?:[^()\\\\]|\\\\.)*\\)/";
     final Pattern commentMatcher = Pattern.compile(commentPat);

```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'result' in a Serializable class
in `src/main/java/org/apache/commons/validator/ValidatorResult.java`
#### Snippet
```java

        private boolean valid = false;
        private Object result = null;

       /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'ccr' in a Serializable class
in `src/main/java/org/apache/commons/validator/routines/CreditCardValidator.java`
#### Snippet
```java
                new RegexValidator("(\\d+)") {
                    private static final long serialVersionUID = 1L;
                    private final CreditCardRange[] ccr = creditCardRanges.clone();
                    @Override
                    // must return full string
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'validationMethod' in a Serializable class
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * The Method object loaded from the method name.
     */
    private Method validationMethod = null;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'instance' in a Serializable class
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * safe.
     */
    private Object instance = null;

    /**
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder results` can be replaced with 'String'
in `src/main/java/org/apache/commons/validator/Arg.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder results = new StringBuilder();

        results.append("Arg: name=");
```

### StringBufferReplaceableByString
`StringBuilder results` can be replaced with 'String'
in `src/main/java/org/apache/commons/validator/Msg.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder results = new StringBuilder();

        results.append("Msg: name=");
```

### StringBufferReplaceableByString
`StringBuilder jsName` can be replaced with 'String'
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     */
    private String generateJsFunction() {
        final StringBuilder jsName =
                new StringBuilder("org.apache.commons.validator.javascript");

```

### StringBufferReplaceableByString
`StringBuilder results` can be replaced with 'String'
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder results = new StringBuilder("ValidatorAction: ");
        results.append(name);
        results.append("\n");
```

## RuleId[ruleID=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/validator/ValidatorResources.java`
#### Snippet
```java
            if (formset == null) {// it hasn't been included yet
                if (getLog().isDebugEnabled()) {
                    getLog().debug("Adding FormSet '" + fs.toString() + "'.");
                }
            } else if (getLog().isWarnEnabled()) {// warn the user he might not
```

## RuleId[ruleID=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/commons/validator/CreditCardValidator.java`
#### Snippet
```java
            int digit = 0;
            try {
                digit = Integer.parseInt(cardNumber.charAt(count) + "");
            } catch(final NumberFormatException e) {
                return false;
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/commons/validator/FormSet.java`
#### Snippet
```java
     * locale are specified.
     */
    protected final static int COUNTRY_FORMSET = 3;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/commons/validator/FormSet.java`
#### Snippet
```java
     * This is the type of <code>FormSet</code>s where no locale is specified.
     */
    protected final static int GLOBAL_FORMSET = 1;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/commons/validator/FormSet.java`
#### Snippet
```java
     * This is the type of <code>FormSet</code>s where full locale has been set.
     */
    protected final static int VARIANT_FORMSET = 4;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/commons/validator/FormSet.java`
#### Snippet
```java
     * specified.
     */
    protected final static int LANGUAGE_FORMSET = 2;

    /**
```

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java

        final String function = buffer.toString();
        return function.equals("") ? null : function;
    }

```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/validator/routines/ByteValidator.java`
#### Snippet
```java
            if (longValue >= Byte.MIN_VALUE &&
                longValue <= Byte.MAX_VALUE) {
                return Byte.valueOf((byte)longValue);
            }
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/validator/routines/DoubleValidator.java`
#### Snippet
```java
            return value;
        }
        return Double.valueOf(((Number)value).doubleValue());

    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
                    num.doubleValue() >= (Float.MAX_VALUE * -1) &&
                    num.doubleValue() <= Float.MAX_VALUE) {
                result = Float.valueOf(num.floatValue());
            }
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
                    num.doubleValue() >= Byte.MIN_VALUE &&
                    num.doubleValue() <= Byte.MAX_VALUE) {
                result = Byte.valueOf(num.byteValue());
            }
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
                    num.doubleValue() >= (Double.MAX_VALUE * -1) &&
                    num.doubleValue() <= Double.MAX_VALUE) {
                result = Double.valueOf(num.doubleValue());
            }
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
                    num.doubleValue() >= Short.MIN_VALUE &&
                    num.doubleValue() <= Short.MAX_VALUE) {
                result = Short.valueOf(num.shortValue());
            }
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
                    num.doubleValue() >= Integer.MIN_VALUE &&
                    num.doubleValue() <= Integer.MAX_VALUE) {
                result = Integer.valueOf(num.intValue());
            }
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
                    num.doubleValue() >= Long.MIN_VALUE &&
                    num.doubleValue() <= Long.MAX_VALUE) {
                result = Long.valueOf(num.longValue());
            }
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/validator/routines/ShortValidator.java`
#### Snippet
```java
            return null;
        }
        return Short.valueOf((short)longValue);
    }
}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/validator/routines/IntegerValidator.java`
#### Snippet
```java
            if (longValue >= Integer.MIN_VALUE &&
                longValue <= Integer.MAX_VALUE) {
                return Integer.valueOf((int)longValue);
            }
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/validator/routines/FloatValidator.java`
#### Snippet
```java
        }

        return Float.valueOf((float)doubleValue);

    }
```

## RuleId[ruleID=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/validator/routines/ByteValidator.java`
#### Snippet
```java
        // Parsed value will be Long if it fits in a long and is not fractional
        if (value instanceof Long) {
            final long longValue = ((Long)value).longValue();
            if (longValue >= Byte.MIN_VALUE &&
                longValue <= Byte.MAX_VALUE) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/validator/routines/BigDecimalValidator.java`
#### Snippet
```java
        BigDecimal decimal = null;
        if (value instanceof Long) {
            decimal = BigDecimal.valueOf(((Long)value).longValue());
        } else {
            decimal = new BigDecimal(value.toString());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/validator/routines/IntegerValidator.java`
#### Snippet
```java
        // Parsed value will be Long if it fits in a long and is not fractional
        if (value instanceof Long) {
            final long longValue = ((Long)value).longValue();
            if (longValue >= Integer.MIN_VALUE &&
                longValue <= Integer.MAX_VALUE) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
        if (result instanceof Boolean) {
            final Boolean valid = (Boolean) result;
            return valid.booleanValue();
        }
        return result != null;
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/validator/routines/ISSNValidator.java`
#### Snippet
```java
    public String convertToEAN13(final String issn, final String suffix) {

        if (suffix == null || !suffix.matches("\\d\\d")) {
            throw new IllegalArgumentException("Suffix must be two digits: '" + suffix + "'");
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/validator/routines/InetAddressValidator.java`
#### Snippet
```java
        }
        if (parts.length == 2) {
            if (!parts[1].matches("\\d{1,3}")) {
                return false; // not a valid number
            }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/validator/routines/InetAddressValidator.java`
#### Snippet
```java
        // The id syntax is implementation independent, but it presumably cannot allow:
        // whitespace, '/' or '%'
        if ((parts.length == 2) && !parts[1].matches("[^\\s/%]+")) {
            return false; // invalid id
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java

     while (commentMatcher.matcher(result).matches()) {
        result = result.replaceFirst(commentPat, "\1 ");
     }
     return result;
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/validator/routines/DateValidator.java`
#### Snippet
```java
        final Calendar calendarValue   = getCalendar(value, timeZone);
        final Calendar calendarCompare = getCalendar(compare, timeZone);
        return super.compareQuarters(calendarValue, calendarCompare, monthOfFirstQuarter);
    }

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
     * Checks if the field is a valid date.
     *
     * <p>The {@code Locale} is used with {@code java.text.DateFormat}. The {@link java.text.DateFormat#setLenient(boolean)}
     * method is set to {@code false} for all.
     * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
     * If strict is true, then the length will be checked so '2/12/1999' will
     * not pass validation with the format 'MM/dd/yyyy' because the month isn't
     * two digits. The {@link java.text.SimpleDateFormat#setLenient(boolean)}
     * method is set to {@code false} for all.
     * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.validator` is unnecessary and can be removed
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
 * </p>
 *
 * @see org.apache.commons.validator.Form
 */
// TODO mutable non-private fields
```

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.Iterator;`
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import java.util.Iterator;`
in `src/main/java/org/apache/commons/validator/util/ValidatorUtils.java`
#### Snippet
```java
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
```

### UNUSED_IMPORT
Unused import `import java.util.Map.Entry;`
in `src/main/java/org/apache/commons/validator/util/ValidatorUtils.java`
#### Snippet
```java
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.beanutils.PropertyUtils;
```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
        try {
            String line = null;
            while ((line = reader.readLine()) != null) {
                buffer.append(line).append("\n");
            }
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`todo = todo / 10` could be simplified to 'todo /= 10'
in `src/main/java/org/apache/commons/validator/routines/checkdigit/ModulusCheckDigit.java`
#### Snippet
```java
        while (todo > 0) {
            total += todo % 10; // CHECKSTYLE IGNORE MagicNumber
            todo  = todo / 10; // CHECKSTYLE IGNORE MagicNumber
        }
        return total;
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractCalendarValidator()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/validator/routines/AbstractCalendarValidator.java`
#### Snippet
```java
     * @param timeStyle the time style to use for Locale validation.
     */
    public AbstractCalendarValidator(final boolean strict, final int dateStyle, final int timeStyle) {
        super(strict);
        this.dateStyle = dateStyle;
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractFormatValidator()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/validator/routines/AbstractFormatValidator.java`
#### Snippet
```java
     *        <code>Format</code> parsing should be used.
     */
    public AbstractFormatValidator(final boolean strict) {
        this.strict = strict;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractNumberValidator()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/validator/routines/AbstractNumberValidator.java`
#### Snippet
```java
     *        allowed or <code>false</code> if integers only.
     */
    public AbstractNumberValidator(final boolean strict, final int formatType, final boolean allowFractions) {
        super(strict);
        this.allowFractions = allowFractions;
```

### NonProtectedConstructorInAbstractClass
Constructor `ModulusCheckDigit()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/validator/routines/checkdigit/ModulusCheckDigit.java`
#### Snippet
```java
     * @param modulus The modulus value to use for the check digit calculation
     */
    public ModulusCheckDigit(final int modulus) {
        this.modulus = modulus;
    }
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `processed` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/validator/FormSet.java`
#### Snippet
```java
     * variables in strings with their values.
     */
    private boolean processed = false;

    /** Language component of <code>Locale</code> (required). */
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `name` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * The name of the validation.
     */
    private String name = null;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `jsFunction` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * JavaScript function.
     */
    private String jsFunction = null;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `validationMethod` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * The Method object loaded from the method name.
     */
    private Method validationMethod = null;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `classname` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * the validation method associated with this action.
     */
    private String classname = null;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `method` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * must be thread safe.
     */
    private String method = null;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `javascript` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * java method assocated with this action.
     */
    private String javascript = null;

    /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `validationClass` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * The Class object loaded from the classname.
     */
    private Class<?> validationClass = null;

    /**
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/Arg.java`
#### Snippet
```java
     * The name dependency that this argument goes with (optional).
     */
    protected String name = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/Arg.java`
#### Snippet
```java
     * @since 1.1
     */
    protected String bundle = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/Arg.java`
#### Snippet
```java
     * The key or value of the argument.
     */
    protected String key = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/validator/Validator.java`
#### Snippet
```java
     * for instantiating new objects.  Default is <code>false</code>.
     */
    protected boolean useContextClassLoader = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/validator/Validator.java`
#### Snippet
```java
     * Set this to true to not return Fields that pass validation.  Only return failures.
     */
    protected boolean onlyReturnErrors = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/Validator.java`
#### Snippet
```java
     * @since 1.2.0
     */
    protected String fieldName = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/Validator.java`
#### Snippet
```java
     * The name of the form to validate
     */
    protected String formName = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/Validator.java`
#### Snippet
```java
     * <code>useContextClassLoader</code> variable.
     */
    protected transient ClassLoader classLoader = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/validator/Validator.java`
#### Snippet
```java
     * The current page number to validate.
     */
    protected int page = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/Validator.java`
#### Snippet
```java
     * The Validator Resources.
     */
    protected ValidatorResources resources = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/ValidatorResult.java`
#### Snippet
```java

        private boolean valid = false;
        private Object result = null;

       /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/validator/ValidatorResult.java`
#### Snippet
```java
        private static final long serialVersionUID = 4076665918535320007L;

        private boolean valid = false;
        private Object result = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/ValidatorResult.java`
#### Snippet
```java
     * TODO This variable is not used.  Need to investigate removing it.
     */
    protected Field field = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/Var.java`
#### Snippet
```java
     * The optional JavaScript type of the variable.
     */
    private String jsType = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/Var.java`
#### Snippet
```java
     * The bundle for a variable (when resource = 'true').
     */
    private String bundle = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/validator/Var.java`
#### Snippet
```java
     * Whether the variable is a resource [false]
     */
    private boolean resource = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/Var.java`
#### Snippet
```java
     * The key or value the variable.
     */
    private String value = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/Var.java`
#### Snippet
```java
     * The name of the variable.
     */
    private String name = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/Msg.java`
#### Snippet
```java
     * The name dependency that this argument goes with (optional).
     */
    protected String name = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/Msg.java`
#### Snippet
```java
     * @since 1.1
     */
    protected String bundle = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/Msg.java`
#### Snippet
```java
     * The key or value of the argument.
     */
    protected String key = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/FormSet.java`
#### Snippet
```java

    /** Country component of <code>Locale</code> (optional). */
    private String country = null;

    /** Variant component of <code>Locale</code> (optional). */
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/validator/FormSet.java`
#### Snippet
```java
     * variables in strings with their values.
     */
    private boolean processed = false;

    /** Language component of <code>Locale</code> (required). */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/FormSet.java`
#### Snippet
```java

    /** Variant component of <code>Locale</code> (optional). */
    private String variant = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/FormSet.java`
#### Snippet
```java

    /** Language component of <code>Locale</code> (required). */
    private String language = null;

    /** Country component of <code>Locale</code> (optional). */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * JavaScript function.
     */
    private String jsFunction = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * The Class objects for each entry in methodParameterList.
     */
    private Class<?>[] parameterClasses = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * The name of the validation.
     */
    private String name = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * The Method object loaded from the method name.
     */
    private Method validationMethod = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * not be processsed.
     */
    private String depends = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * the validation method associated with this action.
     */
    private String classname = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * must be thread safe.
     */
    private String method = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * The default error message associated with this action.
     */
    private String msg = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * safe.
     */
    private Object instance = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * generated.
     */
    private String jsFunctionName = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * java method assocated with this action.
     */
    private String javascript = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * The Class object loaded from the classname.
     */
    private Class<?> validationClass = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/validator/util/Flags.java`
#### Snippet
```java
     * Represents the current flag state.
     */
    private long flags = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/validator/routines/DomainValidator.java`
#### Snippet
```java
     * synchronized methods.
     */
    private static boolean inUse = false;

    /*
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/validator/Form.java`
#### Snippet
```java
     * variables in strings with their values.
     */
    private boolean processed = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/Form.java`
#### Snippet
```java

    /** The name/key the set of validation rules is stored under. */
    protected String name = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/Form.java`
#### Snippet
```java
     * @since 1.2.0
     */
    protected String inherit = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
     * The Field's property name.
     */
    protected String property = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
     * The Page Number
     */
    protected int page = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
     * The Field's indexed property name.
     */
    protected String indexedProperty = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
     * The Field's unique key.
     */
    protected String key = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
     * The Field's indexed list property name.
     */
    protected String indexedListProperty = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
     * The order of the Field in the Form.
     */
    protected int fieldOrder = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
     * A comma separated list of validator's this field depends on.
     */
    protected String depends = null;

    /**
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/validator/routines/AbstractCalendarValidator.java`
#### Snippet
```java
        }
        if (value instanceof Calendar) {
            value = ((Calendar)value).getTime();
        }
        return formatter.format(value);
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/validator/routines/AbstractCalendarValidator.java`
#### Snippet
```java
    protected Object parse(String value, final String pattern, final Locale locale, final TimeZone timeZone) {

        value = (value == null ? null : value.trim());
        if (value == null || value.isEmpty()) {
            return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/validator/routines/AbstractNumberValidator.java`
#### Snippet
```java
    protected Object parse(String value, final String pattern, final Locale locale) {

        value = (value == null ? null : value.trim());
        if (value == null || value.isEmpty()) {
            return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `inet6Address`
in `src/main/java/org/apache/commons/validator/routines/InetAddressValidator.java`
#### Snippet
```java
            return false; // invalid id
        }
        inet6Address = parts[0];
        final boolean containsCompressedZeroes = inet6Address.contains("::");
        if (containsCompressedZeroes && (inet6Address.indexOf("::") != inet6Address.lastIndexOf("::"))) {
```

### AssignmentToMethodParameter
Assignment to method parameter `code`
in `src/main/java/org/apache/commons/validator/routines/checkdigit/IBANCheckDigit.java`
#### Snippet
```java
                    (code == null ? 0 : code.length()));
        }
        code = code.substring(0, 2) + "00" + code.substring(4); // CHECKSTYLE IGNORE MagicNumber
        final int modulusResult = calculateModulus(code);
        final int charValue = (98 - modulusResult); // CHECKSTYLE IGNORE MagicNumber
```

### AssignmentToMethodParameter
Assignment to method parameter `schemes`
in `src/main/java/org/apache/commons/validator/UrlValidator.java`
#### Snippet
```java

        if (schemes == null) {
            schemes = this.defaultSchemes;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `domain`
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
                domainSegment[i] = atomMatcher.group(1);
                final int l = domainSegment[i].length() + 1;
                domain =
                        (l >= domain.length())
                        ? ""
```

### AssignmentToMethodParameter
Assignment to method parameter `schemes`
in `src/main/java/org/apache/commons/validator/routines/UrlValidator.java`
#### Snippet
```java
        } else {
            if (schemes == null) {
                schemes = DEFAULT_SCHEMES;
            }
            allowedSchemes = new HashSet<>(schemes.length);
```

### AssignmentToMethodParameter
Assignment to method parameter `domain`
in `src/main/java/org/apache/commons/validator/routines/DomainValidator.java`
#### Snippet
```java
            return false;
        }
        domain = unicodeToASCII(domain);
        // hosts must be equally reachable via punycode and Unicode
        // Unicode is never shorter than punycode, so check punycode
```

### AssignmentToMethodParameter
Assignment to method parameter `domain`
in `src/main/java/org/apache/commons/validator/routines/DomainValidator.java`
#### Snippet
```java
            return false;
        }
        domain = unicodeToASCII(domain);
        // hosts must be equally reachable via punycode and Unicode
        // Unicode is never shorter than punycode, so check punycode
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/validator/util/ValidatorUtils.java`
#### Snippet
```java

        if (length == key.length()) {
            value = replaceValue;

        } else if (end == length) {
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/validator/util/ValidatorUtils.java`
#### Snippet
```java

        } else if (end == length) {
            value = value.substring(0, start) + replaceValue;

        } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/validator/util/ValidatorUtils.java`
#### Snippet
```java

        } else {
            value =
                    value.substring(0, start)
                    + replaceValue
```

## RuleId[ruleID=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`1 << 0` can be replaced with '1'
in `src/main/java/org/apache/commons/validator/routines/CreditCardValidator.java`
#### Snippet
```java
     * Option specifying that American Express cards are allowed.
     */
    public static final long AMEX = 1 << 0;

    /**
```

### PointlessBitwiseExpression
`1 << 0` can be replaced with '1'
in `src/main/java/org/apache/commons/validator/CreditCardValidator.java`
#### Snippet
```java
     * Option specifying that American Express cards are allowed.
     */
    public static final int AMEX = 1 << 0;

    /**
```

### PointlessBitwiseExpression
`1 << 0` can be replaced with '1'
in `src/main/java/org/apache/commons/validator/UrlValidator.java`
#### Snippet
```java
     * supplying a set of valid schemes.
     */
    public static final int ALLOW_ALL_SCHEMES = 1 << 0;

    /**
```

### PointlessBitwiseExpression
`1 << 0` can be replaced with '1'
in `src/main/java/org/apache/commons/validator/routines/UrlValidator.java`
#### Snippet
```java
     * supplying a set of valid schemes.
     */
    public static final long ALLOW_ALL_SCHEMES = 1 << 0;

    /**
```

## RuleId[ruleID=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
            // this for Validator 2.0 when exception scheme changes.
        } catch (final Exception e) {
            if (e instanceof ValidatorException) {
                throw (ValidatorException) e;
            }
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-27-00-51-29.120.html`
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
in `src/main/java/org/apache/commons/validator/routines/LongValidator.java`
#### Snippet
```java
            return value;
        }
        return null;

    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/ByteValidator.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/ValidatorResult.java`
#### Snippet
```java
    public Object getResult(final String validatorName) {
        final ResultStatus status = hAction.get(validatorName);
        return (status == null) ? null : status.getResult();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
    public static Double formatDouble(final String value) {
        if (value == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
            return Double.valueOf(value);
        } catch (final NumberFormatException e) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
     */
    public static Long formatCreditCard(final String value) {
        return GenericValidator.isCreditCard(value) ? Long.valueOf(value) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
    public static Short formatShort(final String value) {
        if (value == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
            return Short.valueOf(value);
        } catch (final NumberFormatException e) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java

        if (value == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
    public static Float formatFloat(final String value) {
        if (value == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
            return Float.valueOf(value);
        } catch (final NumberFormatException e) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
    public static Long formatLong(final String value) {
        if (value == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
            return Long.valueOf(value);
        } catch (final NumberFormatException e) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
    public static Integer formatInt(final String value) {
        if (value == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
            return Integer.valueOf(value);
        } catch (final NumberFormatException e) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
                || datePattern == null
                || datePattern.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
    public static Byte formatByte(final String value) {
        if (value == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
            return Byte.valueOf(value);
        } catch (final NumberFormatException e) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/ISINValidator.java`
#### Snippet
```java
        final Object validate = VALIDATOR.validate(code);
        if (validate != null && checkCountryCode) {
            return checkCode(code.substring(0,2)) ? validate : null;
        }
        return validate;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/AbstractCalendarValidator.java`
#### Snippet
```java
    protected String format(Object value, final Format formatter) {
        if (value == null) {
            return null;
        }
        if (value instanceof Calendar) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/AbstractCalendarValidator.java`
#### Snippet
```java
        value = (value == null ? null : value.trim());
        if (value == null || value.isEmpty()) {
            return null;
        }
        final DateFormat formatter = (DateFormat)getFormat(pattern, locale);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/IBANValidator.java`
#### Snippet
```java
    public Validator getValidator(final String code) {
        if (code == null || code.length() < 2) { // ensure we can extract the code
            return null;
        }
        final String key = code.substring(0, 2);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/ShortValidator.java`
#### Snippet
```java
        if (longValue < Short.MIN_VALUE ||
            longValue > Short.MAX_VALUE) {
            return null;
        }
        return Short.valueOf((short)longValue);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/CreditCardValidator.java`
#### Snippet
```java
    public Object validate(final String card) {
        if (card == null || card.isEmpty()) {
            return null;
        }
        Object result = null;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/CreditCardValidator.java`
#### Snippet
```java
            }
        }
        return null;

    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/CreditCardValidator.java`
#### Snippet
```java
                            }
                        }
                        return null;
                    }
                    @Override
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/AbstractFormatValidator.java`
#### Snippet
```java
        Object parsedValue = formatter.parseObject(value, pos);
        if (pos.getErrorIndex() > -1) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/AbstractFormatValidator.java`
#### Snippet
```java

        if (isStrict() && pos.getIndex() < value.length()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/ISSNValidator.java`
#### Snippet
```java
        final Object result = validateEan(input);
        if (result == null) {
            return null;
        }
        // Calculate the ISSN code
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/ISSNValidator.java`
#### Snippet
```java
        final Object result = validate(issn);
        if (result == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/ISBNValidator.java`
#### Snippet
```java
    public String validateISBN13(final String code) {
        final Object result = isbn13Validator.validate(code);
        return (result == null ? null : result.toString());
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/ISBNValidator.java`
#### Snippet
```java
    public String validateISBN10(final String code) {
        final Object result = isbn10Validator.validate(code);
        return (result == null ? null : result.toString());
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/ISBNValidator.java`
#### Snippet
```java

        if (isbn10 == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/AbstractNumberValidator.java`
#### Snippet
```java
        value = (value == null ? null : value.trim());
        if (value == null || value.isEmpty()) {
            return null;
        }
        final Format formatter = getFormat(pattern, locale);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/IntegerValidator.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/CodeValidator.java`
#### Snippet
```java

        if (input == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/RegexValidator.java`
#### Snippet
```java
    public String[] match(final String value) {
        if (value == null) {
            return null;
        }
        for (final Pattern pattern : patterns) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/CodeValidator.java`
#### Snippet
```java
        String code = input.trim();
        if (code.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/RegexValidator.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/RegexValidator.java`
#### Snippet
```java
    public String validate(final String value) {
        if (value == null) {
            return null;
        }
        for (final Pattern pattern : patterns) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/RegexValidator.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/CodeValidator.java`
#### Snippet
```java
            code = regexValidator.validate(code);
            if (code == null) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/CodeValidator.java`
#### Snippet
```java
        if ((minLength >= 0 && code.length() < minLength) ||
            (maxLength >= 0 && code.length() > maxLength)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/CodeValidator.java`
#### Snippet
```java
        // validate the check digit
        if (checkdigit != null && !checkdigit.isValid(code)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
        if (is == null) {
            getLog().debug("  Unable to read javascript name "+javascriptFileName);
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java

        final String function = buffer.toString();
        return function.equals("") ? null : function;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/FloatValidator.java`
#### Snippet
```java
        if (doubleValue > 0) {
            if (doubleValue < Float.MIN_VALUE) {
                return null;
            }
            if (doubleValue > Float.MAX_VALUE) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/FloatValidator.java`
#### Snippet
```java
            }
            if (doubleValue > Float.MAX_VALUE) {
                return null;
            }
        } else  if (doubleValue < 0){
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/FloatValidator.java`
#### Snippet
```java
            final double posDouble = doubleValue * -1;
            if (posDouble < Float.MIN_VALUE) {
                return null;
            }
            if (posDouble > Float.MAX_VALUE) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/routines/FloatValidator.java`
#### Snippet
```java
            }
            if (posDouble > Float.MAX_VALUE) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/util/ValidatorUtils.java`
#### Snippet
```java

        if (value == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
    public String getMsg(final String key) {
        final Msg msg = getMessage(key);
        return (msg == null) ? null : msg.getKey();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
    public Arg getArg(final String key, final int position) {
        if ((position >= this.args.length) || (this.args[position] == null)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
        // infinite recursion
        if ((arg == null) && key.equals(DEFAULT_ARG)) {
            return null;
        }

```

## RuleId[ruleID=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `issn` is redundant
in `src/main/java/org/apache/commons/validator/routines/ISSNValidator.java`
#### Snippet
```java
            //CHECKSTYLE:ON: MagicNumber
            final String checkDigit = ISSNCheckDigit.ISSN_CHECK_DIGIT.calculate(issnBase);
            final String issn = issnBase + checkDigit;
            return issn;
        } catch (final CheckDigitException e) { // Should not happen
```

### UnnecessaryLocalVariable
Local variable `start` is redundant
in `src/main/java/org/apache/commons/validator/util/ValidatorUtils.java`
#### Snippet
```java

        final int length = value.length();
        final int start = pos;
        final int end = pos + key.length();

```

## RuleId[ruleID=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
        try {
            if (this.validationMethod == null) {
                synchronized(this) {
                    final ClassLoader loader = this.getClassLoader(params);
                    this.loadValidationClass(loader);
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/validator/routines/InetAddressValidator.java`
#### Snippet
```java
                octetList.remove(0);
            }
            octets = octetList.toArray(new String[0]);
        }
        if (octets.length > IPV6_MAX_HEX_GROUPS) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked") // cannot instantiate generic array, so have to assume this is OK
    protected Map<String, Arg>[] args = new Map[0];

    /**
```

## RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:(?:[a-zA-Z0-9%-._~!$&'()*+,;=]+(?::[a-zA-Z0-9%-._~!$&'()*+,;=]*)?@)?([\p{Alnum}\-\.]*))`
in `src/main/java/org/apache/commons/validator/routines/UrlValidator.java`
#### Snippet
```java
            "(?::" + USERINFO_CHARS_REGEX + "*)?@"; // colon and password may be absent
    private static final String AUTHORITY_REGEX =
            "(?:\\[("+IPV6_REGEX+")\\]|(?:(?:"+USERINFO_FIELD_REGEX+")?([" + AUTHORITY_CHARS_REGEX + "]*)))(?::(\\d*))?(.*)?";
    //             1                          e.g. user:pass@          2                                         3       4
    private static final Pattern AUTHORITY_PATTERN = Pattern.compile(AUTHORITY_REGEX);
```

## RuleId[ruleID=UseCompareMethod]
### UseCompareMethod
Expression can be replaced with 'Integer.compare'
in `src/main/java/org/apache/commons/validator/routines/AbstractCalendarValidator.java`
#### Snippet
```java
        final int valueQuarter   = calculateQuarter(value, monthOfFirstQuarter);
        final int compareQuarter = calculateQuarter(compare, monthOfFirstQuarter);
        if (valueQuarter < compareQuarter) {
            return -1;
        }
```

### UseCompareMethod
Expression can be replaced with 'Integer.compare'
in `src/main/java/org/apache/commons/validator/routines/AbstractCalendarValidator.java`
#### Snippet
```java
    private int calculateCompareResult(final Calendar value, final Calendar compare, final int field) {
        final int difference = value.get(field) - compare.get(field);
        if (difference < 0) {
            return -1;
        }
```

## RuleId[ruleID=UnusedAssignment]
### UnusedAssignment
Variable `formName` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/Validator.java`
#### Snippet
```java
     * The name of the form to validate
     */
    protected String formName = null;

    /**
```

### UnusedAssignment
Variable `resources` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/Validator.java`
#### Snippet
```java
     * The Validator Resources.
     */
    protected ValidatorResources resources = null;

    /**
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/ValidatorResult.java`
#### Snippet
```java

        private boolean valid = false;
        private Object result = null;

       /**
```

### UnusedAssignment
Variable `valid` initializer `false` is redundant
in `src/main/java/org/apache/commons/validator/ValidatorResult.java`
#### Snippet
```java
        private static final long serialVersionUID = 4076665918535320007L;

        private boolean valid = false;
        private Object result = null;

```

### UnusedAssignment
Variable `field` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/ValidatorResult.java`
#### Snippet
```java
     * TODO This variable is not used.  Need to investigate removing it.
     */
    protected Field field = null;

    /**
```

### UnusedAssignment
Variable `decimal` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/routines/BigDecimalValidator.java`
#### Snippet
```java
    @Override
    protected Object processParsedValue(final Object value, final Format formatter) {
        BigDecimal decimal = null;
        if (value instanceof Long) {
            decimal = BigDecimal.valueOf(((Long)value).longValue());
```

### UnusedAssignment
Variable `calendar` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/routines/DateValidator.java`
#### Snippet
```java
    private Calendar getCalendar(final Date value, final TimeZone timeZone) {

        Calendar calendar = null;
        if (timeZone != null) {
            calendar = Calendar.getInstance(timeZone);
```

### UnusedAssignment
Variable `formatter` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java

        if (value != null) {
            NumberFormat formatter = null;
            if (locale != null) {
                formatter = NumberFormat.getInstance(locale);
```

### UnusedAssignment
Variable `formatter` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java

        if (value != null) {
            NumberFormat formatter = null;
            if (locale != null) {
                formatter = NumberFormat.getNumberInstance(locale);
```

### UnusedAssignment
Variable `formatter` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java

        if (value != null) {
            NumberFormat formatter = null;
            if (locale != null) {
                formatter = NumberFormat.getInstance(locale);
```

### UnusedAssignment
Variable `formatterShort` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
        try {
            // Get the formatters to check against
            DateFormat formatterShort = null;
            DateFormat formatterDefault = null;
            if (locale != null) {
```

### UnusedAssignment
Variable `formatterDefault` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
            // Get the formatters to check against
            DateFormat formatterShort = null;
            DateFormat formatterDefault = null;
            if (locale != null) {
                formatterShort =
```

### UnusedAssignment
Variable `formatter` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java

        if (value != null) {
            NumberFormat formatter = null;
            if (locale != null) {
                formatter = NumberFormat.getNumberInstance(locale);
```

### UnusedAssignment
Variable `formatter` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java

        if (value != null) {
            NumberFormat formatter = null;
            if (locale != null) {
                formatter = NumberFormat.getNumberInstance(locale);
```

### UnusedAssignment
Variable `formatter` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java

        if (value != null) {
            NumberFormat formatter = null;
            if (locale != null) {
                formatter = NumberFormat.getNumberInstance(locale);
```

### UnusedAssignment
Variable `formatter` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/routines/AbstractCalendarValidator.java`
#### Snippet
```java
    @Override
    protected Format getFormat(final String pattern, final Locale locale) {
        DateFormat formatter = null;
        final boolean usePattern = pattern != null && !pattern.isEmpty();
        if (!usePattern) {
```

### UnusedAssignment
Variable `formatter` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/routines/AbstractCalendarValidator.java`
#### Snippet
```java
    protected Format getFormat(final Locale locale) {

        DateFormat formatter = null;
        if (dateStyle >= 0 && timeStyle >= 0) {
            if (locale == null) {
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/routines/CreditCardValidator.java`
#### Snippet
```java
            return null;
        }
        Object result = null;
        for (final CodeValidator cardType : cardTypes) {
            result = cardType.validate(card);
```

### UnusedAssignment
Variable `formatter` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/routines/AbstractNumberValidator.java`
#### Snippet
```java
    protected Format getFormat(final String pattern, final Locale locale) {

        NumberFormat formatter = null;
        final boolean usePattern = pattern != null && !pattern.isEmpty();
        if (!usePattern) {
```

### UnusedAssignment
Variable `formatter` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/routines/AbstractNumberValidator.java`
#### Snippet
```java
     */
    protected Format getFormat(final Locale locale) {
        NumberFormat formatter = null;
        switch (formatType) {
        case CURRENCY_FORMAT:
```

### UnusedAssignment
Variable `octetInt` initializer `0` is redundant
in `src/main/java/org/apache/commons/validator/routines/InetAddressValidator.java`
#### Snippet
```java
                    return false;
                }
                int octetInt = 0;
                try {
                    octetInt = Integer.parseInt(octet, BASE_16);
```

### UnusedAssignment
Variable `iIpSegment` initializer `0` is redundant
in `src/main/java/org/apache/commons/validator/routines/InetAddressValidator.java`
#### Snippet
```java
            }

            int iIpSegment = 0;

            try {
```

### UnusedAssignment
Variable `digit` initializer `0` is redundant
in `src/main/java/org/apache/commons/validator/CreditCardValidator.java`
#### Snippet
```java
        long sum = 0;
        for (int count = 0; count < digits; count++) {
            int digit = 0;
            try {
                digit = Integer.parseInt(cardNumber.charAt(count) + "");
```

### UnusedAssignment
Variable `line` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
        final BufferedReader reader = new BufferedReader(new InputStreamReader(is)); // TODO encoding
        try {
            String line = null;
            while ((line = reader.readLine()) != null) {
                buffer.append(line).append("\n");
```

### UnusedAssignment
Variable `segmentLength` initializer `0` is redundant
in `src/main/java/org/apache/commons/validator/UrlValidator.java`
#### Snippet
```java
            boolean match = true;
            int segmentCount = 0;
            int segmentLength = 0;

            while (match) {
```

### UnusedAssignment
Variable `formatter` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/DateValidator.java`
#### Snippet
```java
        }

        DateFormat formatter = null;
        if (locale != null) {
            formatter = DateFormat.getDateInstance(DateFormat.SHORT, locale);
```

### UnusedAssignment
Variable `iIpSegment` initializer `0` is redundant
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
            }

            int iIpSegment = 0;

            try {
```

### UnusedAssignment
Variable `indexProp` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
     */
    private int getIndexedPropertySize(final Object bean) throws ValidatorException {
        Object indexProp = null;

        try {
```

### UnusedAssignment
Variable `field` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
    @Override
    public Object clone() {
        Field field = null;
        try {
            field = (Field) super.clone();
```

### UnusedAssignment
Variable `indexProp` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
     */
    Object[] getIndexedProperty(final Object bean) throws ValidatorException {
        Object indexProp = null;

        try {
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `valid` is always `true` when reached
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java

            final boolean valid = this.isValid(result);
            if (!valid || (valid && !onlyReturnErrors(params))) {
                results.add(field, this.name, valid, result);
            }
```

### ConstantValue
Condition `depend != null` is always `true`
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
            final String depend = st.nextToken().trim();

            if (depend != null && !depend.isEmpty()) {
                this.dependencyList.add(depend);
            }
```

### ConstantValue
Condition `value != null` is always `true`
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
            final String value = st.nextToken().trim();

            if (value != null && !value.isEmpty()) {
                this.methodParameterList.add(value);
            }
```

### ConstantValue
Condition `authority != null` is always `true`
in `src/main/java/org/apache/commons/validator/routines/UrlValidator.java`
#### Snippet
```java
            return true; // this is a local file - nothing more to do here
        }
        if ("file".equals(scheme) && authority != null && authority.contains(":")) {
            return false;
        }
```

### ConstantValue
Condition `depend != null` is always `true`
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
            final String depend = st.nextToken().trim();

            if (depend != null && !depend.isEmpty()) {
                this.dependencyList.add(depend);
            }
```

## RuleId[ruleID=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `getInstance()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/validator/routines/CurrencyValidator.java`
#### Snippet
```java
     * @return A singleton instance of the CurrencyValidator.
     */
    public static BigDecimalValidator getInstance() {
        return VALIDATOR;
    }
```

### MethodOverridesStaticMethod
Method `getInstance()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/validator/routines/PercentValidator.java`
#### Snippet
```java
     * @return A singleton instance of the PercentValidator.
     */
    public static BigDecimalValidator getInstance() {
        return VALIDATOR;
    }
```

## RuleId[ruleID=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'cardType' to 'CreditCardType'
in `src/main/java/org/apache/commons/validator/CreditCardValidator.java`
#### Snippet
```java

        for (final Object cardType : this.cardTypes) {
            final CreditCardType type = (CreditCardType) cardType;
            if (type.matches(card)) {
                return true;
```

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
        final StringBuilder results = new StringBuilder();

        results.append("\t\tkey = " + key + "\n");
        results.append("\t\tproperty = " + property + "\n");
        results.append("\t\tindexedProperty = " + indexedProperty + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java

        results.append("\t\tkey = " + key + "\n");
        results.append("\t\tproperty = " + property + "\n");
        results.append("\t\tindexedProperty = " + indexedProperty + "\n");
        results.append("\t\tindexedListProperty = " + indexedListProperty + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
        results.append("\t\tkey = " + key + "\n");
        results.append("\t\tproperty = " + property + "\n");
        results.append("\t\tindexedProperty = " + indexedProperty + "\n");
        results.append("\t\tindexedListProperty = " + indexedListProperty + "\n");
        results.append("\t\tdepends = " + depends + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
        results.append("\t\tproperty = " + property + "\n");
        results.append("\t\tindexedProperty = " + indexedProperty + "\n");
        results.append("\t\tindexedListProperty = " + indexedListProperty + "\n");
        results.append("\t\tdepends = " + depends + "\n");
        results.append("\t\tpage = " + page + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
        results.append("\t\tindexedProperty = " + indexedProperty + "\n");
        results.append("\t\tindexedListProperty = " + indexedListProperty + "\n");
        results.append("\t\tdepends = " + depends + "\n");
        results.append("\t\tpage = " + page + "\n");
        results.append("\t\tfieldOrder = " + fieldOrder + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
        results.append("\t\tindexedListProperty = " + indexedListProperty + "\n");
        results.append("\t\tdepends = " + depends + "\n");
        results.append("\t\tpage = " + page + "\n");
        results.append("\t\tfieldOrder = " + fieldOrder + "\n");

```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
        results.append("\t\tdepends = " + depends + "\n");
        results.append("\t\tpage = " + page + "\n");
        results.append("\t\tfieldOrder = " + fieldOrder + "\n");

        if (hVars != null) {
```

