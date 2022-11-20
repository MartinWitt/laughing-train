# commons-lang 
 
# Bad smells
I found 1263 bad smells with 6 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=AssignmentToMethodParameter] | 347 | false |
| RuleId[ruleID=ReturnNull] | 239 | false |
| RuleId[ruleID=BoundedWildcard] | 115 | false |
| RuleId[ruleID=UnnecessaryBoxing] | 108 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 108 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 49 | false |
| RuleId[ruleID=UnnecessaryUnboxing] | 41 | false |
| RuleId[ruleID=UtilityClassWithPublicConstructor] | 31 | false |
| RuleId[ruleID=DeprecatedIsStillUsed] | 23 | false |
| RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment] | 21 | false |
| RuleId[ruleID=SuspiciousSystemArraycopy] | 19 | false |
| RuleId[ruleID=FinalStaticMethod] | 18 | false |
| RuleId[ruleID=ArrayEquality] | 18 | false |
| RuleId[ruleID=MethodOverridesStaticMethod] | 18 | false |
| RuleId[ruleID=ConstantValue] | 13 | false |
| RuleId[ruleID=StaticInitializerReferencesSubClass] | 10 | false |
| RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator] | 10 | false |
| RuleId[ruleID=RedundantSuppression] | 9 | false |
| RuleId[ruleID=NestedAssignment] | 8 | false |
| RuleId[ruleID=AssignmentToForLoopParameter] | 6 | false |
| RuleId[ruleID=StringEquality] | 5 | false |
| RuleId[ruleID=SynchronizeOnThis] | 5 | false |
| RuleId[ruleID=UnnecessaryToStringCall] | 4 | true |
| RuleId[ruleID=NullArgumentToVariableArgMethod] | 4 | false |
| RuleId[ruleID=CommentedOutCode] | 3 | false |
| RuleId[ruleID=IOResource] | 2 | false |
| RuleId[ruleID=MagicConstant] | 2 | false |
| RuleId[ruleID=DataFlowIssue] | 2 | false |
| RuleId[ruleID=RefusedBequest] | 2 | false |
| RuleId[ruleID=StringBufferReplaceableByString] | 2 | false |
| RuleId[ruleID=FunctionalExpressionCanBeFolded] | 2 | false |
| RuleId[ruleID=RedundantMethodOverride] | 2 | false |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 2 | true |
| RuleId[ruleID=SuspiciousNameCombination] | 1 | false |
| RuleId[ruleID=UnnecessaryCallToStringValueOf] | 1 | false |
| RuleId[ruleID=MismatchedJavadocCode] | 1 | false |
| RuleId[ruleID=NonShortCircuitBoolean] | 1 | false |
| RuleId[ruleID=NumberEquality] | 1 | false |
| RuleId[ruleID=SuspiciousInvocationHandlerImplementation] | 1 | false |
| RuleId[ruleID=NegativeIntConstantInLongContext] | 1 | false |
| RuleId[ruleID=SystemOutErr] | 1 | false |
| RuleId[ruleID=ClassNameSameAsAncestorName] | 1 | false |
| RuleId[ruleID=UnnecessaryContinue] | 1 | false |
| RuleId[ruleID=PointlessBitwiseExpression] | 1 | false |
| RuleId[ruleID=HtmlWrongAttributeValue] | 1 | false |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 1 | false |
| RuleId[ruleID=FuseStreamOperations] | 1 | false |
| RuleId[ruleID=TypeParameterExtendsObject] | 1 | false |
## RuleId[ruleID=IOResource]
### RuleId[ruleID=IOResource]
'ObjectOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/commons/lang3/event/EventListenerSupport.java`
#### Snippet
```java

        // don't just rely on instanceof Serializable:
        ObjectOutputStream testObjectOutputStream = new ObjectOutputStream(new ByteArrayOutputStream());
        for (final L listener : listeners) {
            try {
```

### RuleId[ruleID=IOResource]
'ObjectOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/commons/lang3/event/EventListenerSupport.java`
#### Snippet
```java
            } catch (final IOException exception) {
                //recreate test stream in case of indeterminate state
                testObjectOutputStream = new ObjectOutputStream(new ByteArrayOutputStream());
            }
        }
```

## RuleId[ruleID=SuspiciousNameCombination]
### RuleId[ruleID=SuspiciousNameCombination]
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

## RuleId[ruleID=StringEquality]
### RuleId[ruleID=StringEquality]
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

### RuleId[ruleID=StringEquality]
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

### RuleId[ruleID=StringEquality]
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

### RuleId[ruleID=StringEquality]
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

### RuleId[ruleID=StringEquality]
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

## RuleId[ruleID=MagicConstant]
### RuleId[ruleID=MagicConstant]
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

### RuleId[ruleID=MagicConstant]
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

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `RegExUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/RegExUtils.java`
#### Snippet
```java
 * @since 3.8
 */
public class RegExUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `FormattableUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/text/FormattableUtils.java`
#### Snippet
```java
 */
@Deprecated
public class FormattableUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `LockingVisitors` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/concurrent/locks/LockingVisitors.java`
#### Snippet
```java
 * @since 3.11
 */
public class LockingVisitors {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CharEncoding` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/CharEncoding.java`
#### Snippet
```java
 */
@Deprecated
public class CharEncoding {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Suppliers` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/function/Suppliers.java`
#### Snippet
```java
 * @since 3.13.0
 */
public class Suppliers {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SerializationUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/SerializationUtils.java`
#### Snippet
```java
 * @since 1.0
 */
public class SerializationUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SystemUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/SystemUtils.java`
#### Snippet
```java
 * @since 1.0
 */
public class SystemUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `WordUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/text/WordUtils.java`
#### Snippet
```java
 */
@Deprecated
public class WordUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `NumberUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
 * @since 2.0
 */
public class NumberUtils {

    /** Reusable Long constant for zero. */
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ClassUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
 * @since 2.0
 */
public class ClassUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ClassLoaderUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/ClassLoaderUtils.java`
#### Snippet
```java
 * @since 3.10
 */
public class ClassLoaderUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MethodUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
 * @since 2.5
 */
public class MethodUtils {

    private static final Comparator<Method> METHOD_BY_SIGNATURE = Comparator.comparing(Method::toString);
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Streams` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/Streams.java`
#### Snippet
```java
 */
@Deprecated
public class Streams {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Validate` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/Validate.java`
#### Snippet
```java
 * @since 2.0
 */
public class Validate {

    private static final String DEFAULT_NOT_NAN_EX_MESSAGE =
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `RandomStringUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/RandomStringUtils.java`
#### Snippet
```java
 * @since 1.0
 */
public class RandomStringUtils {

    private static ThreadLocalRandom random() {
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `FieldUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/reflect/FieldUtils.java`
#### Snippet
```java
 * @since 2.5
 */
public class FieldUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Conversion` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/Conversion.java`
#### Snippet
```java
 */

public class Conversion {

    private static final boolean[] TTTT = {true, true, true, true};
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ArchUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/ArchUtils.java`
#### Snippet
```java
 * @since 3.6
 */
public class ArchUtils {

    private static final Map<String, Processor> ARCH_TO_PROCESSOR;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `StringEscapeUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/StringEscapeUtils.java`
#### Snippet
```java
 */
@Deprecated
public class StringEscapeUtils {

    /* ESCAPE TRANSLATORS */
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ArraySorter` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/ArraySorter.java`
#### Snippet
```java
 * @since 3.12.0
 */
public class ArraySorter {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `DurationUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/time/DurationUtils.java`
#### Snippet
```java
 * @since 3.12.0
 */
public class DurationUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ConstructorUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/reflect/ConstructorUtils.java`
#### Snippet
```java
 * @since 2.5
 */
public class ConstructorUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `DurationFormatUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/time/DurationFormatUtils.java`
#### Snippet
```java
 * @since 2.1
 */
public class DurationFormatUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `EnumUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/EnumUtils.java`
#### Snippet
```java
 * @since 3.0
 */
public class EnumUtils {

    private static final String CANNOT_STORE_S_S_VALUES_IN_S_BITS = "Cannot store %s %s values in %s bits";
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CharSetUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/CharSetUtils.java`
#### Snippet
```java
 * @since 1.0
 */
public class CharSetUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `EventUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/event/EventUtils.java`
#### Snippet
```java
 * @since 3.0
 */
public class EventUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `DateUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/time/DateUtils.java`
#### Snippet
```java
 * @since 2.0
 */
public class DateUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `IntStreams` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/stream/IntStreams.java`
#### Snippet
```java
 * @since 3.13.0
 */
public class IntStreams {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Streams` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/stream/Streams.java`
#### Snippet
```java
 * @since 3.11
 */
public class Streams {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `StringUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
 */
//@Immutable
public class StringUtils {

    // Performance testing notes (JDK 1.4, Jul03, scolebourne)
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ClassPathUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/ClassPathUtils.java`
#### Snippet
```java
 */
//@Immutable
public class ClassPathUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ObjectUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/ObjectUtils.java`
#### Snippet
```java
@SuppressWarnings("deprecation") // deprecated class StrBuilder is imported
// because it is part of the signature of deprecated methods
public class ObjectUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `EntityArrays` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/text/translate/EntityArrays.java`
#### Snippet
```java
 */
@Deprecated
public class EntityArrays {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `BooleanUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
 * @since 2.0
 */
public class BooleanUtils {

    private static final List<Boolean> BOOLEAN_LIST = Collections.unmodifiableList(Arrays.asList(Boolean.FALSE, Boolean.TRUE));
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `TypeUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
 * @since 3.0
 */
public class TypeUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `AnnotationUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/AnnotationUtils.java`
#### Snippet
```java
 * @since 3.0
 */
public class AnnotationUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ThreadUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/ThreadUtils.java`
#### Snippet
```java
 * @since 3.5
 */
public class ThreadUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `RandomUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/RandomUtils.java`
#### Snippet
```java
 */
@Deprecated
public class RandomUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `IEEE754rUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/math/IEEE754rUtils.java`
#### Snippet
```java
 * @since 2.4
 */
public class IEEE754rUtils {

     /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CharSequenceUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/CharSequenceUtils.java`
#### Snippet
```java
 * @since 3.0
 */
public class CharSequenceUtils {

    private static final int NOT_FOUND = -1;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Charsets` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/Charsets.java`
#### Snippet
```java
 * @since 3.10
 */
class Charsets {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `MemberUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/reflect/MemberUtils.java`
#### Snippet
```java
 * @since 2.5
 */
final class MemberUtils {
    // TODO extract an interface to implement compareParameterSets(...)?

```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `InheritanceUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/reflect/InheritanceUtils.java`
#### Snippet
```java
 * @since 3.2
 */
public class InheritanceUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `DateFormatUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/time/DateFormatUtils.java`
#### Snippet
```java
 * @since 2.0
 */
public class DateFormatUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `CharUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/CharUtils.java`
#### Snippet
```java
 * @since 2.1
 */
public class CharUtils {

    private static final String[] CHAR_STRING_ARRAY = new String[128];
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `LocaleUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/LocaleUtils.java`
#### Snippet
```java
 * @since 2.2
 */
public class LocaleUtils {
    private static final char UNDERSCORE = '_';
    private static final char DASH = '-';
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Functions` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
 */
@Deprecated
public class Functions {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ExceptionUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/exception/ExceptionUtils.java`
#### Snippet
```java
 * @since 1.0
 */
public class ExceptionUtils {

    private static final int NOT_FOUND = -1;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ArrayUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
 * @since 2.0
 */
public class ArrayUtils {

    /**
```

## RuleId[ruleID=SuspiciousSystemArraycopy]
### RuleId[ruleID=SuspiciousSystemArraycopy]
`varArgsArray` is not of an array type
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
        Object varArgsArray = Array.newInstance(ClassUtils.primitiveToWrapper(varArgComponentType), varArgLength);
        // Copy the variadic arguments into the varargs array.
        System.arraycopy(args, methodParameterTypes.length - 1, varArgsArray, 0, varArgLength);

        if (varArgComponentType.isPrimitive()) {
```

### RuleId[ruleID=SuspiciousSystemArraycopy]
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

### RuleId[ruleID=SuspiciousSystemArraycopy]
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

### RuleId[ruleID=SuspiciousSystemArraycopy]
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

### RuleId[ruleID=SuspiciousSystemArraycopy]
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

### RuleId[ruleID=SuspiciousSystemArraycopy]
`array` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

        final Object result = Array.newInstance(array.getClass().getComponentType(), length - 1);
        System.arraycopy(array, 0, result, 0, index);
        if (index < length - 1) {
            System.arraycopy(array, index + 1, result, index, length - index - 1);
```

### RuleId[ruleID=SuspiciousSystemArraycopy]
`result` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

        final Object result = Array.newInstance(array.getClass().getComponentType(), length - 1);
        System.arraycopy(array, 0, result, 0, index);
        if (index < length - 1) {
            System.arraycopy(array, index + 1, result, index, length - index - 1);
```

### RuleId[ruleID=SuspiciousSystemArraycopy]
`array` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        System.arraycopy(array, 0, result, 0, index);
        if (index < length - 1) {
            System.arraycopy(array, index + 1, result, index, length - index - 1);
        }

```

### RuleId[ruleID=SuspiciousSystemArraycopy]
`result` is not of an array type
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        System.arraycopy(array, 0, result, 0, index);
        if (index < length - 1) {
            System.arraycopy(array, index + 1, result, index, length - index - 1);
        }

```

### RuleId[ruleID=SuspiciousSystemArraycopy]
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

### RuleId[ruleID=SuspiciousSystemArraycopy]
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

### RuleId[ruleID=SuspiciousSystemArraycopy]
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

### RuleId[ruleID=SuspiciousSystemArraycopy]
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

### RuleId[ruleID=SuspiciousSystemArraycopy]
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

### RuleId[ruleID=SuspiciousSystemArraycopy]
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

### RuleId[ruleID=SuspiciousSystemArraycopy]
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

### RuleId[ruleID=SuspiciousSystemArraycopy]
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

### RuleId[ruleID=SuspiciousSystemArraycopy]
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

### RuleId[ruleID=SuspiciousSystemArraycopy]
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

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Method invocation `keySet` may produce `NullPointerException`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java

        // now to check each type argument
        for (final TypeVariable<?> var : toTypeVarAssigns.keySet()) {
            final Type toTypeArg = unrollVariableAssignments(var, toTypeVarAssigns);
            final Type fromTypeArg = unrollVariableAssignments(var, fromTypeVarAssigns);
```

## RuleId[ruleID=StaticInitializerReferencesSubClass]
### RuleId[ruleID=StaticInitializerReferencesSubClass]
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

### RuleId[ruleID=StaticInitializerReferencesSubClass]
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

### RuleId[ruleID=StaticInitializerReferencesSubClass]
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

### RuleId[ruleID=StaticInitializerReferencesSubClass]
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

### RuleId[ruleID=StaticInitializerReferencesSubClass]
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

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass NoMatcher from superclass StrMatcher initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/lang3/text/StrMatcher.java`
#### Snippet
```java
     * Matches no characters.
     */
    private static final StrMatcher NONE_MATCHER = new NoMatcher();

    /**
```

### RuleId[ruleID=StaticInitializerReferencesSubClass]
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

### RuleId[ruleID=StaticInitializerReferencesSubClass]
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

### RuleId[ruleID=StaticInitializerReferencesSubClass]
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

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass MapStrLookup from superclass StrLookup initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/lang3/text/StrLookup.java`
#### Snippet
```java
     * Lookup that always returns null.
     */
    private static final StrLookup<String> NONE_LOOKUP = new MapStrLookup<>(null);

    /**
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'ThreadPredicate' is still used
in `src/main/java/org/apache/commons/lang3/ThreadUtils.java`
#### Snippet
```java
    // When breaking BC, replace this with Predicate<Thread>
    @FunctionalInterface
    public interface ThreadPredicate {

        /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'ALWAYS_TRUE_PREDICATE' is still used
in `src/main/java/org/apache/commons/lang3/ThreadUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final AlwaysTruePredicate ALWAYS_TRUE_PREDICATE = new AlwaysTruePredicate();

    private static final Predicate<?> ALWAYS_TRUE = t -> true;
```

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'ThreadGroupPredicate' is still used
in `src/main/java/org/apache/commons/lang3/ThreadUtils.java`
#### Snippet
```java
    // When breaking BC, replace this with Predicate<ThreadGroup>
    @FunctionalInterface
    public interface ThreadGroupPredicate {

        /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'ISO_TIME_TIME_ZONE_FORMAT' is still used
in `src/main/java/org/apache/commons/lang3/time/DateFormatUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final FastDateFormat ISO_TIME_TIME_ZONE_FORMAT
            = FastDateFormat.getInstance("'T'HH:mm:ssZZ");

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'ISO_TIME_FORMAT' is still used
in `src/main/java/org/apache/commons/lang3/time/DateFormatUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final FastDateFormat ISO_TIME_FORMAT
            = FastDateFormat.getInstance("'T'HH:mm:ss");

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'ISO_DATETIME_FORMAT' is still used
in `src/main/java/org/apache/commons/lang3/time/DateFormatUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final FastDateFormat ISO_DATETIME_FORMAT = ISO_8601_EXTENDED_DATETIME_FORMAT;

    /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'ISO_TIME_NO_T_FORMAT' is still used
in `src/main/java/org/apache/commons/lang3/time/DateFormatUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final FastDateFormat ISO_TIME_NO_T_FORMAT = ISO_8601_EXTENDED_TIME_FORMAT;

    /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'ISO_DATE_TIME_ZONE_FORMAT' is still used
in `src/main/java/org/apache/commons/lang3/time/DateFormatUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final FastDateFormat ISO_DATE_TIME_ZONE_FORMAT
            = FastDateFormat.getInstance("yyyy-MM-ddZZ");

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'ISO_TIME_NO_T_TIME_ZONE_FORMAT' is still used
in `src/main/java/org/apache/commons/lang3/time/DateFormatUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final FastDateFormat ISO_TIME_NO_T_TIME_ZONE_FORMAT = ISO_8601_EXTENDED_TIME_TIME_ZONE_FORMAT;

    /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'ISO_DATE_FORMAT' is still used
in `src/main/java/org/apache/commons/lang3/time/DateFormatUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static final FastDateFormat ISO_DATE_FORMAT = ISO_8601_EXTENDED_DATE_FORMAT;

    /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
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

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'FailableBiFunction' is still used
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
    @Deprecated
    @FunctionalInterface
    public interface FailableBiFunction<O1, O2, R, T extends Throwable> {

        /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'FailablePredicate' is still used
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
    @Deprecated
    @FunctionalInterface
    public interface FailablePredicate<I, T extends Throwable> {

        /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'FailableRunnable' is still used
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
    @Deprecated
    @FunctionalInterface
    public interface FailableRunnable<T extends Throwable> {

        /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'FailableCallable' is still used
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
    @Deprecated
    @FunctionalInterface
    public interface FailableCallable<R, T extends Throwable> {

        /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'FailableBiPredicate' is still used
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
    @Deprecated
    @FunctionalInterface
    public interface FailableBiPredicate<O1, O2, T extends Throwable> {

        /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'FailableSupplier' is still used
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
    @Deprecated
    @FunctionalInterface
    public interface FailableSupplier<R, T extends Throwable> {

        /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'FailableBiConsumer' is still used
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
    @Deprecated
    @FunctionalInterface
    public interface FailableBiConsumer<O1, O2, T extends Throwable> {

        /**
```

## RuleId[ruleID=CommentedOutCode]
### RuleId[ruleID=CommentedOutCode]
Commented out code (2 lines)
in `src/main/java/org/apache/commons/lang3/SystemUtils.java`
#### Snippet
```java
        } catch (final SecurityException ex) {
            // we are not allowed to look at this property
            // System.err.println("Caught a SecurityException reading the system property '" + property
            // + "'; the SystemUtils property value will default to null.");
            return null;
```

### RuleId[ruleID=CommentedOutCode]
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

### RuleId[ruleID=CommentedOutCode]
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

## RuleId[ruleID=UnnecessaryCallToStringValueOf]
### RuleId[ruleID=UnnecessaryCallToStringValueOf]
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

## RuleId[ruleID=RefusedBequest]
### RuleId[ruleID=RefusedBequest]
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

### RuleId[ruleID=RefusedBequest]
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

## RuleId[ruleID=MismatchedJavadocCode]
### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return array but the return type is list
in `src/main/java/org/apache/commons/lang3/reflect/FieldUtils.java`
#### Snippet
```java
     * @param cls
     *            the {@link Class} to query
     * @return an array of Fields (possibly empty).
     * @throws IllegalArgumentException
     *             if the class is {@code null}
```

## RuleId[ruleID=StringBufferReplaceableByString]
### RuleId[ruleID=StringBufferReplaceableByString]
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

### RuleId[ruleID=StringBufferReplaceableByString]
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

## RuleId[ruleID=NonShortCircuitBoolean]
### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `left != null | middle != null`
in `src/main/java/org/apache/commons/lang3/tuple/ImmutableTriple.java`
#### Snippet
```java
     */
    public static <L, M, R> ImmutableTriple<L, M, R> of(final L left, final M middle, final R right) {
        return left != null | middle != null || right != null ? new ImmutableTriple<>(left, middle, right) : nullTriple();
    }

```

## RuleId[ruleID=UnnecessaryToStringCall]
### RuleId[ruleID=UnnecessaryToStringCall]
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

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
            }
        }
        return str + suffix.toString();
    }

```

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
            }
        }
        return prefix.toString() + str;
    }

```

### RuleId[ruleID=UnnecessaryToStringCall]
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

## RuleId[ruleID=AssignmentToForLoopParameter]
### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
                final int len = i - start;
                deleteImpl(start, i, len);
                i -= len;
            }
        }
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `si`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
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
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
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
in `src/main/java/org/apache/commons/lang3/time/FastDatePrinter.java`
#### Snippet
```java
            indexRef[0] = i;
            final String token = parseToken(pattern, indexRef);
            i = indexRef[0];

            final int tokenLen = token.length();
```

## RuleId[ruleID=FinalStaticMethod]
### RuleId[ruleID=FinalStaticMethod]
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

### RuleId[ruleID=FinalStaticMethod]
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

### RuleId[ruleID=FinalStaticMethod]
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

### RuleId[ruleID=FinalStaticMethod]
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

### RuleId[ruleID=FinalStaticMethod]
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

### RuleId[ruleID=FinalStaticMethod]
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

### RuleId[ruleID=FinalStaticMethod]
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

### RuleId[ruleID=FinalStaticMethod]
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

### RuleId[ruleID=FinalStaticMethod]
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

### RuleId[ruleID=FinalStaticMethod]
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

### RuleId[ruleID=FinalStaticMethod]
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

### RuleId[ruleID=FinalStaticMethod]
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

### RuleId[ruleID=FinalStaticMethod]
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

### RuleId[ruleID=FinalStaticMethod]
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

### RuleId[ruleID=FinalStaticMethod]
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

### RuleId[ruleID=FinalStaticMethod]
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

### RuleId[ruleID=FinalStaticMethod]
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

### RuleId[ruleID=FinalStaticMethod]
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

## RuleId[ruleID=NumberEquality]
### RuleId[ruleID=NumberEquality]
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

## RuleId[ruleID=SuspiciousInvocationHandlerImplementation]
### RuleId[ruleID=SuspiciousInvocationHandlerImplementation]
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

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableLongUnaryOperator.java`
#### Snippet
```java
     * @see #andThen(FailableLongUnaryOperator)
     */
    default FailableLongUnaryOperator<E> compose(final FailableLongUnaryOperator<E> before) {
        Objects.requireNonNull(before);
        return (final long v) -> applyAsLong(before.applyAsLong(v));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableLongUnaryOperator.java`
#### Snippet
```java
     * @see #compose(FailableLongUnaryOperator)
     */
    default FailableLongUnaryOperator<E> andThen(final FailableLongUnaryOperator<E> after) {
        Objects.requireNonNull(after);
        return (final long t) -> after.applyAsLong(applyAsLong(t));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `src/main/java/org/apache/commons/lang3/text/StrTokenizer.java`
#### Snippet
```java
     * @param tok  the token to add
     */
    private void addToken(final List<String> list, String tok) {
        if (StringUtils.isEmpty(tok)) {
            if (isIgnoreEmptyTokens()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Lock`
in `src/main/java/org/apache/commons/lang3/concurrent/locks/LockingVisitors.java`
#### Snippet
```java
         * @see #applyWriteLocked(FailableFunction)
         */
        protected <T> T lockApplyUnlock(final Supplier<Lock> lockSupplier, final FailableFunction<O, T, ?> function) {
            final Lock lock = lockSupplier.get();
            lock.lock();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super O`
in `src/main/java/org/apache/commons/lang3/concurrent/locks/LockingVisitors.java`
#### Snippet
```java
         * @see #applyWriteLocked(FailableFunction)
         */
        protected <T> T lockApplyUnlock(final Supplier<Lock> lockSupplier, final FailableFunction<O, T, ?> function) {
            final Lock lock = lockSupplier.get();
            lock.lock();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Lock`
in `src/main/java/org/apache/commons/lang3/concurrent/locks/LockingVisitors.java`
#### Snippet
```java
         * @see #acceptWriteLocked(FailableConsumer)
         */
        protected void lockAcceptUnlock(final Supplier<Lock> lockSupplier, final FailableConsumer<O, ?> consumer) {
            final Lock lock = lockSupplier.get();
            lock.lock();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super O`
in `src/main/java/org/apache/commons/lang3/concurrent/locks/LockingVisitors.java`
#### Snippet
```java
         * @see #acceptWriteLocked(FailableConsumer)
         */
        protected void lockAcceptUnlock(final Supplier<Lock> lockSupplier, final FailableConsumer<O, ?> consumer) {
            final Lock lock = lockSupplier.get();
            lock.lock();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableBiPredicate.java`
#### Snippet
```java
     * @throws NullPointerException if other is null
     */
    default FailableBiPredicate<T, U, E> and(final FailableBiPredicate<? super T, ? super U, E> other) {
        Objects.requireNonNull(other);
        return (final T t, final U u) -> test(t, u) && other.test(t, u);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableBiPredicate.java`
#### Snippet
```java
     * @throws NullPointerException if other is null
     */
    default FailableBiPredicate<T, U, E> or(final FailableBiPredicate<? super T, ? super U, E> other) {
        Objects.requireNonNull(other);
        return (final T t, final U u) -> test(t, u) || other.test(t, u);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableIntConsumer.java`
#### Snippet
```java
     * @throws NullPointerException if {@code after} is null
     */
    default FailableIntConsumer<E> andThen(final FailableIntConsumer<E> after) {
        Objects.requireNonNull(after);
        return (final int t) -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableDoublePredicate.java`
#### Snippet
```java
     * @throws NullPointerException if other is null
     */
    default FailableDoublePredicate<E> and(final FailableDoublePredicate<E> other) {
        Objects.requireNonNull(other);
        return t -> test(t) && other.test(t);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableDoublePredicate.java`
#### Snippet
```java
     * @throws NullPointerException if other is null
     */
    default FailableDoublePredicate<E> or(final FailableDoublePredicate<E> other) {
        Objects.requireNonNull(other);
        return t -> test(t) || other.test(t);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableIntPredicate.java`
#### Snippet
```java
     * @throws NullPointerException if other is null
     */
    default FailableIntPredicate<E> or(final FailableIntPredicate<E> other) {
        Objects.requireNonNull(other);
        return t -> test(t) || other.test(t);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableIntPredicate.java`
#### Snippet
```java
     * @throws NullPointerException if other is null
     */
    default FailableIntPredicate<E> and(final FailableIntPredicate<E> other) {
        Objects.requireNonNull(other);
        return t -> test(t) && other.test(t);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableDoubleConsumer.java`
#### Snippet
```java
     * @throws NullPointerException when {@code after} is null.
     */
    default FailableDoubleConsumer<E> andThen(final FailableDoubleConsumer<E> after) {
        Objects.requireNonNull(after);
        return (final double t) -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Class`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
                }

                private void walkInterfaces(final Set<Class<?>> addTo, final Class<?> c) {
                    for (final Class<?> iface : c.getInterfaces()) {
                        if (!seenInterfaces.contains(iface)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Class`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
     * @param interfacesFound the {@link Set} of interfaces for the class
     */
    private static void getAllInterfaces(Class<?> cls, final HashSet<Class<?>> interfacesFound) {
        while (cls != null) {
            final Class<?>[] interfaces = cls.getInterfaces();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableFunction.java`
#### Snippet
```java
     * @throws NullPointerException when {@code after} is null.
     */
    default <V> FailableFunction<T, V, E> andThen(final FailableFunction<? super R, ? extends V, E> after) {
        Objects.requireNonNull(after);
        return (final T t) -> after.apply(apply(t));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableFunction.java`
#### Snippet
```java
     * @see #andThen(FailableFunction)
     */
    default <V> FailableFunction<V, R, E> compose(final FailableFunction<? super V, ? extends T, E> before) {
        Objects.requireNonNull(before);
        return (final V v) -> apply(before.apply(v));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends L`
in `src/main/java/org/apache/commons/lang3/tuple/MutablePair.java`
#### Snippet
```java
     * @return a pair formed from the map entry
     */
    public static <L, R> MutablePair<L, R> of(final Map.Entry<L, R> pair) {
        final L left;
        final R right;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `src/main/java/org/apache/commons/lang3/tuple/MutablePair.java`
#### Snippet
```java
     * @return a pair formed from the map entry
     */
    public static <L, R> MutablePair<L, R> of(final Map.Entry<L, R> pair) {
        final L left;
        final R right;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `src/main/java/org/apache/commons/lang3/concurrent/ConcurrentUtils.java`
#### Snippet
```java
     */
    public static <K, V> V createIfAbsent(final ConcurrentMap<K, V> map, final K key,
            final ConcurrentInitializer<V> init) throws ConcurrentException {
        if (map == null || init == null) {
            return null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableLongPredicate.java`
#### Snippet
```java
     * @throws NullPointerException if other is null
     */
    default FailableLongPredicate<E> and(final FailableLongPredicate<E> other) {
        Objects.requireNonNull(other);
        return t -> test(t) && other.test(t);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableLongPredicate.java`
#### Snippet
```java
     * @throws NullPointerException if other is null
     */
    default FailableLongPredicate<E> or(final FailableLongPredicate<E> other) {
        Objects.requireNonNull(other);
        return t -> test(t) || other.test(t);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableBiFunction.java`
#### Snippet
```java
     * @throws NullPointerException when {@code after} is null.
     */
    default <V> FailableBiFunction<T, U, V, E> andThen(final FailableFunction<? super R, ? extends V, E> after) {
        Objects.requireNonNull(after);
        return (final T t, final U u) -> after.apply(apply(t, u));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super O`
in `src/main/java/org/apache/commons/lang3/Streams.java`
#### Snippet
```java
         * predicate, otherwise {@code false}
         */
        public boolean anyMatch(final FailablePredicate<O, ?> predicate) {
            assertNotTerminated();
            return stream().anyMatch(Functions.asPredicate(predicate));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super O`
in `src/main/java/org/apache/commons/lang3/Streams.java`
#### Snippet
```java
         * @return the new stream
         */
        public FailableStream<O> filter(final FailablePredicate<O, ?> predicate){
            assertNotTerminated();
            stream = stream.filter(Functions.asPredicate(predicate));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super O`
in `src/main/java/org/apache/commons/lang3/Streams.java`
#### Snippet
```java
         * @return the new stream
         */
        public <R> FailableStream<R> map(final FailableFunction<O, R, ?> mapper) {
            assertNotTerminated();
            return new FailableStream<>(stream.map(Functions.asFunction(mapper)));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `src/main/java/org/apache/commons/lang3/Streams.java`
#### Snippet
```java
         * @return the new stream
         */
        public <R> FailableStream<R> map(final FailableFunction<O, R, ?> mapper) {
            assertNotTerminated();
            return new FailableStream<>(stream.map(Functions.asFunction(mapper)));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends O`
in `src/main/java/org/apache/commons/lang3/Streams.java`
#### Snippet
```java
         * @param elementType The element type.
         */
        public ArrayCollector(final Class<O> elementType) {
            this.elementType = elementType;
        }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super O`
in `src/main/java/org/apache/commons/lang3/Streams.java`
#### Snippet
```java
         * @param action a non-interfering action to perform on the elements
         */
        public void forEach(final FailableConsumer<O, ?> action) {
            makeTerminated();
            stream().forEach(Functions.asConsumer(action));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super O`
in `src/main/java/org/apache/commons/lang3/Streams.java`
#### Snippet
```java
         * provided predicate or the stream is empty, otherwise {@code false}.
         */
        public boolean allMatch(final FailablePredicate<O, ?> predicate) {
            assertNotTerminated();
            return stream().allMatch(Functions.asPredicate(predicate));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableIntUnaryOperator.java`
#### Snippet
```java
     * @see #andThen(FailableIntUnaryOperator)
     */
    default FailableIntUnaryOperator<E> compose(final FailableIntUnaryOperator<E> before) {
        Objects.requireNonNull(before);
        return (final int v) -> applyAsInt(before.applyAsInt(v));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableIntUnaryOperator.java`
#### Snippet
```java
     * @see #compose(FailableIntUnaryOperator)
     */
    default FailableIntUnaryOperator<E> andThen(final FailableIntUnaryOperator<E> after) {
        Objects.requireNonNull(after);
        return (final int t) -> after.applyAsInt(applyAsInt(t));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends BackgroundInitializer`
in `src/main/java/org/apache/commons/lang3/concurrent/MultiBackgroundInitializer.java`
#### Snippet
```java
         */
        private MultiBackgroundInitializerResults(
                final Map<String, BackgroundInitializer<?>> inits,
                final Map<String, Object> results,
                final Map<String, ConcurrentException> excepts) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ConcurrentException`
in `src/main/java/org/apache/commons/lang3/concurrent/MultiBackgroundInitializer.java`
#### Snippet
```java
                final Map<String, BackgroundInitializer<?>> inits,
                final Map<String, Object> results,
                final Map<String, ConcurrentException> excepts) {
            initializers = inits;
            resultObjects = results;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends L`
in `src/main/java/org/apache/commons/lang3/event/EventListenerSupport.java`
#### Snippet
```java
     * @param classLoader the class loader to be used
     */
    private void createProxy(final Class<L> listenerInterface, final ClassLoader classLoader) {
        proxy = listenerInterface.cast(Proxy.newProxyInstance(classLoader,
                new Class[] { listenerInterface }, createInvocationHandler()));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Instant`
in `src/main/java/org/apache/commons/lang3/time/DurationUtils.java`
#### Snippet
```java
     * @since 3.13.0
     */
    public static <E extends Throwable> Duration of(final FailableConsumer<Instant, E> consumer) throws E {
        return since(now(consumer::accept));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Long`
in `src/main/java/org/apache/commons/lang3/time/DurationUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("boxing") // boxing unavoidable
    public static <T extends Throwable> void accept(final FailableBiConsumer<Long, Integer, T> consumer, final Duration duration)
            throws T {
        if (consumer != null && duration != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Integer`
in `src/main/java/org/apache/commons/lang3/time/DurationUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("boxing") // boxing unavoidable
    public static <T extends Throwable> void accept(final FailableBiConsumer<Long, Integer, T> consumer, final Duration duration)
            throws T {
        if (consumer != null && duration != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Instant`
in `src/main/java/org/apache/commons/lang3/time/DurationUtils.java`
#### Snippet
```java
    }

    private static <E extends Throwable> Instant now(final FailableConsumer<Instant, E> nowConsumer) throws E {
        final Instant start = Instant.now();
        nowConsumer.accept(start);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Future`
in `src/main/java/org/apache/commons/lang3/concurrent/UncheckedFuture.java`
#### Snippet
```java
     * @return a new stream.
     */
    static <T> Stream<UncheckedFuture<T>> map(final Collection<Future<T>> futures) {
        return futures.stream().map(UncheckedFuture::on);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StrategyAndWidth`
in `src/main/java/org/apache/commons/lang3/time/FastDateParser.java`
#### Snippet
```java
        }

        int getMaxWidth(final ListIterator<StrategyAndWidth> lt) {
            if (!strategy.isNumber() || !lt.hasNext()) {
                return 0;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailablePredicate.java`
#### Snippet
```java
     * @throws NullPointerException if other is null
     */
    default FailablePredicate<T, E> and(final FailablePredicate<? super T, E> other) {
        Objects.requireNonNull(other);
        return t -> test(t) && other.test(t);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailablePredicate.java`
#### Snippet
```java
     * @throws NullPointerException if other is null
     */
    default FailablePredicate<T, E> or(final FailablePredicate<? super T, E> other) {
        Objects.requireNonNull(other);
        return t -> test(t) || other.test(t);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/EnumUtils.java`
#### Snippet
```java
     * @return the modifiable list of enums, never null
     */
    public static <E extends Enum<E>> List<E> getEnumList(final Class<E> enumClass) {
        return new ArrayList<>(Arrays.asList(enumClass.getEnumConstants()));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super E`
in `src/main/java/org/apache/commons/lang3/EnumUtils.java`
#### Snippet
```java
     * @since 3.13.0
     */
    public static <E extends Enum<E>> E getFirstEnumIgnoreCase(final Class<E> enumClass, final String enumName, final Function<E, String> stringFunction,
        final E defaultEnum) {
        if (enumName == null || !enumClass.isEnum()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/EnumUtils.java`
#### Snippet
```java
     * @since 3.13.0
     */
    public static <E extends Enum<E>, K> Map<K, E> getEnumMap(final Class<E> enumClass, final Function<E, K> keyFunction) {
        return Stream.of(enumClass.getEnumConstants()).collect(Collectors.toMap(keyFunction::apply, Function.identity()));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super E`
in `src/main/java/org/apache/commons/lang3/EnumUtils.java`
#### Snippet
```java
     * @since 3.13.0
     */
    public static <E extends Enum<E>, K> Map<K, E> getEnumMap(final Class<E> enumClass, final Function<E, K> keyFunction) {
        return Stream.of(enumClass.getEnumConstants()).collect(Collectors.toMap(keyFunction::apply, Function.identity()));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `src/main/java/org/apache/commons/lang3/EnumUtils.java`
#### Snippet
```java
     * @since 3.13.0
     */
    public static <E extends Enum<E>, K> Map<K, E> getEnumMap(final Class<E> enumClass, final Function<E, K> keyFunction) {
        return Stream.of(enumClass.getEnumConstants()).collect(Collectors.toMap(keyFunction::apply, Function.identity()));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends L`
in `src/main/java/org/apache/commons/lang3/tuple/ImmutablePair.java`
#### Snippet
```java
     * @since 3.10
     */
    public static <L, R> ImmutablePair<L, R> of(final Map.Entry<L, R> pair) {
        return pair != null ? new ImmutablePair<>(pair.getKey(), pair.getValue()) : nullPair();
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `src/main/java/org/apache/commons/lang3/tuple/ImmutablePair.java`
#### Snippet
```java
     * @since 3.10
     */
    public static <L, R> ImmutablePair<L, R> of(final Map.Entry<L, R> pair) {
        return pair != null ? new ImmutablePair<>(pair.getKey(), pair.getValue()) : nullPair();
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/org/apache/commons/lang3/stream/Streams.java`
#### Snippet
```java
         * @return {@code true} if any elements of the stream match the provided predicate, otherwise {@code false}
         */
        public boolean anyMatch(final FailablePredicate<T, ?> predicate) {
            assertNotTerminated();
            return stream().anyMatch(Failable.asPredicate(predicate));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/org/apache/commons/lang3/stream/Streams.java`
#### Snippet
```java
         * @return the new stream
         */
        public <R> FailableStream<R> map(final FailableFunction<T, R, ?> mapper) {
            assertNotTerminated();
            return new FailableStream<>(stream.map(Failable.asFunction(mapper)));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `src/main/java/org/apache/commons/lang3/stream/Streams.java`
#### Snippet
```java
         * @return the new stream
         */
        public <R> FailableStream<R> map(final FailableFunction<T, R, ?> mapper) {
            assertNotTerminated();
            return new FailableStream<>(stream.map(Failable.asFunction(mapper)));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/org/apache/commons/lang3/stream/Streams.java`
#### Snippet
```java
         * @return the new stream
         */
        public FailableStream<T> filter(final FailablePredicate<T, ?> predicate) {
            assertNotTerminated();
            stream = stream.filter(Failable.asPredicate(predicate));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/org/apache/commons/lang3/stream/Streams.java`
#### Snippet
```java
         *         otherwise {@code false}.
         */
        public boolean allMatch(final FailablePredicate<T, ?> predicate) {
            assertNotTerminated();
            return stream().allMatch(Failable.asPredicate(predicate));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/org/apache/commons/lang3/stream/Streams.java`
#### Snippet
```java
         * @param action a non-interfering action to perform on the elements
         */
        public void forEach(final FailableConsumer<T, ?> action) {
            makeTerminated();
            stream().forEach(Failable.asConsumer(action));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/stream/Streams.java`
#### Snippet
```java
     * @since 3.13.0
     */
    public static <E> Stream<E> of(final Iterator<E> iterator) {
        return iterator == null ? Stream.empty() : StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, Spliterator.ORDERED), false);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * @since 3.10
     */
    public static <T extends CharSequence> T getIfBlank(final T str, final Supplier<T> defaultSupplier) {
        return isBlank(str) ? Suppliers.get(defaultSupplier) : str;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * @since 3.10
     */
    public static <T extends CharSequence> T getIfEmpty(final T str, final Supplier<T> defaultSupplier) {
        return isEmpty(str) ? Suppliers.get(defaultSupplier) : str;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super CharSequence`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * @since 3.12.0
     */
    private static boolean containsAny(final ToBooleanBiFunction<CharSequence, CharSequence> test,
        final CharSequence cs, final CharSequence... searchCharSequences) {
        if (isEmpty(cs) || ArrayUtils.isEmpty(searchCharSequences)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super CharSequence`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * @since 3.12.0
     */
    private static boolean containsAny(final ToBooleanBiFunction<CharSequence, CharSequence> test,
        final CharSequence cs, final CharSequence... searchCharSequences) {
        if (isEmpty(cs) || ArrayUtils.isEmpty(searchCharSequences)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableDoubleUnaryOperator.java`
#### Snippet
```java
     * @see #andThen(FailableDoubleUnaryOperator)
     */
    default FailableDoubleUnaryOperator<E> compose(final FailableDoubleUnaryOperator<E> before) {
        Objects.requireNonNull(before);
        return (final double v) -> applyAsDouble(before.applyAsDouble(v));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableDoubleUnaryOperator.java`
#### Snippet
```java
     * @see #compose(FailableDoubleUnaryOperator)
     */
    default FailableDoubleUnaryOperator<E> andThen(final FailableDoubleUnaryOperator<E> after) {
        Objects.requireNonNull(after);
        return (final double t) -> after.applyAsDouble(applyAsDouble(t));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/lang3/ObjectUtils.java`
#### Snippet
```java
     * @since 3.10
     */
    public static <T> T getIfNull(final T object, final Supplier<T> defaultSupplier) {
        return object != null ? object : Suppliers.get(defaultSupplier);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/org/apache/commons/lang3/ObjectUtils.java`
#### Snippet
```java
     */
    @SafeVarargs
    public static <T> T median(final Comparator<T> comparator, final T... items) {
        Validate.notEmpty(items, "null/empty items");
        Validate.noNullElements(items);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableConsumer.java`
#### Snippet
```java
     * @throws NullPointerException when {@code after} is null
     */
    default FailableConsumer<T, E> andThen(final FailableConsumer<? super T, E> after) {
        Objects.requireNonNull(after);
        return (final T t) -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableLongConsumer.java`
#### Snippet
```java
     * @throws NullPointerException if {@code after} is null
     */
    default FailableLongConsumer<E> andThen(final FailableLongConsumer<E> after) {
        Objects.requireNonNull(after);
        return (final long t) -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Boolean`
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
     * @since 3.13.0
     */
    public static void forEach(final Consumer<Boolean> action) {
        values().forEach(action);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TypeVariable`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
    private static Map<TypeVariable<?>, Type> getTypeArguments(
            final ParameterizedType parameterizedType, final Class<?> toClass,
            final Map<TypeVariable<?>, Type> subtypeVarAssigns) {
        final Class<?> cls = getRawType(parameterizedType);

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
    private static Map<TypeVariable<?>, Type> getTypeArguments(
            final ParameterizedType parameterizedType, final Class<?> toClass,
            final Map<TypeVariable<?>, Type> subtypeVarAssigns) {
        final Class<?> cls = getRawType(parameterizedType);

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
     * @since 3.2
     */
    private static Type unrollVariableAssignments(TypeVariable<?> typeVariable, final Map<TypeVariable<?>, Type> typeVarAssigns) {
        Type result;
        do {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
     * @throws IllegalArgumentException if the type cannot be substituted
     */
    private static Type substituteTypeVariables(final Type type, final Map<TypeVariable<?>, Type> typeVarAssigns) {
        if (type instanceof TypeVariable<?> && typeVarAssigns != null) {
            final Type replacementType = typeVarAssigns.get(type);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
     * @return array of map values corresponding to specified keys
     */
    private static Type[] extractTypeArgumentsFrom(final Map<TypeVariable<?>, Type> mappings, final TypeVariable<?>[] variables) {
        final Type[] result = new Type[variables.length];
        int index = 0;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TypeVariable`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
     */
    private static <T> void mapTypeVariablesToArguments(final Class<T> cls,
            final ParameterizedType parameterizedType, final Map<TypeVariable<?>, Type> typeVarAssigns) {
        // capture the type variables from the owner type that have assignments
        final Type ownerType = parameterizedType.getOwnerType();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TypeVariable`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
     */
    private static Map<TypeVariable<?>, Type> getTypeArguments(Class<?> cls, final Class<?> toClass,
            final Map<TypeVariable<?>, Type> subtypeVarAssigns) {
        // make sure they're assignable
        if (!isAssignable(cls, toClass)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
     */
    private static Map<TypeVariable<?>, Type> getTypeArguments(Class<?> cls, final Class<?> toClass,
            final Map<TypeVariable<?>, Type> subtypeVarAssigns) {
        // make sure they're assignable
        if (!isAssignable(cls, toClass)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Thread`
in `src/main/java/org/apache/commons/lang3/ThreadUtils.java`
#### Snippet
```java
     * @since 3.13.0
     */
    public static Collection<Thread> findThreads(final ThreadGroup threadGroup, final boolean recurse, final Predicate<Thread> predicate) {
        Objects.requireNonNull(threadGroup, "The group must not be null");
        Objects.requireNonNull(predicate, "The predicate must not be null");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ThreadGroup`
in `src/main/java/org/apache/commons/lang3/ThreadUtils.java`
#### Snippet
```java
     * @since 3.13.0
     */
    public static Collection<ThreadGroup> findThreadGroups(final ThreadGroup threadGroup, final boolean recurse, final Predicate<ThreadGroup> predicate) {
        Objects.requireNonNull(threadGroup, "threadGroup");
        Objects.requireNonNull(predicate, "predicate");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/org/apache/commons/lang3/ThreadUtils.java`
#### Snippet
```java
    }

    private static <T> Predicate<T> namePredicate(final String name, final Function<T, String> nameGetter) {
        return (Predicate<T>) t -> t != null && Objects.equals(nameGetter.apply(t), Objects.requireNonNull(name));
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/lang3/Range.java`
#### Snippet
```java
     * @throws RuntimeException if ranges cannot be compared
     */
    public boolean isBeforeRange(final Range<T> otherRange) {
        if (otherRange == null) {
            return false;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/lang3/Range.java`
#### Snippet
```java
     * @throws RuntimeException if ranges cannot be compared
     */
    public boolean containsRange(final Range<T> otherRange) {
        if (otherRange == null) {
            return false;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/lang3/Range.java`
#### Snippet
```java
     * @throws RuntimeException if ranges cannot be compared
     */
    public boolean isAfterRange(final Range<T> otherRange) {
        if (otherRange == null) {
            return false;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/org/apache/commons/lang3/function/Failable.java`
#### Snippet
```java
     * @return a standard {@link BiPredicate}
     */
    public static <T, U> BiPredicate<T, U> asBiPredicate(final FailableBiPredicate<T, U, ?> predicate) {
        return (input1, input2) -> test(predicate, input1, input2);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super U`
in `src/main/java/org/apache/commons/lang3/function/Failable.java`
#### Snippet
```java
     * @return a standard {@link BiPredicate}
     */
    public static <T, U> BiPredicate<T, U> asBiPredicate(final FailableBiPredicate<T, U, ?> predicate) {
        return (input1, input2) -> test(predicate, input1, input2);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/org/apache/commons/lang3/function/Failable.java`
#### Snippet
```java
     * @return a standard {@link Function}
     */
    public static <T, R> Function<T, R> asFunction(final FailableFunction<T, R, ?> function) {
        return input -> apply(function, input);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `src/main/java/org/apache/commons/lang3/function/Failable.java`
#### Snippet
```java
     * @return a standard {@link Function}
     */
    public static <T, R> Function<T, R> asFunction(final FailableFunction<T, R, ?> function) {
        return input -> apply(function, input);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/lang3/function/Failable.java`
#### Snippet
```java
     * @return a standard {@link Supplier}
     */
    public static <T> Supplier<T> asSupplier(final FailableSupplier<T, ?> supplier) {
        return () -> get(supplier);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/org/apache/commons/lang3/function/Failable.java`
#### Snippet
```java
     * @return a standard {@link Consumer}
     */
    public static <T> Consumer<T> asConsumer(final FailableConsumer<T, ?> consumer) {
        return input -> accept(consumer, input);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `src/main/java/org/apache/commons/lang3/function/Failable.java`
#### Snippet
```java
     * @return a standard {@link Callable}
     */
    public static <V> Callable<V> asCallable(final FailableCallable<V, ?> callable) {
        return () -> call(callable);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/org/apache/commons/lang3/function/Failable.java`
#### Snippet
```java
     * @return a standard {@link BiConsumer}
     */
    public static <T, U> BiConsumer<T, U> asBiConsumer(final FailableBiConsumer<T, U, ?> consumer) {
        return (input1, input2) -> accept(consumer, input1, input2);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super U`
in `src/main/java/org/apache/commons/lang3/function/Failable.java`
#### Snippet
```java
     * @return a standard {@link BiConsumer}
     */
    public static <T, U> BiConsumer<T, U> asBiConsumer(final FailableBiConsumer<T, U, ?> consumer) {
        return (input1, input2) -> accept(consumer, input1, input2);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/org/apache/commons/lang3/function/Failable.java`
#### Snippet
```java
     * @return a standard {@link BiFunction}
     */
    public static <T, U, R> BiFunction<T, U, R> asBiFunction(final FailableBiFunction<T, U, R, ?> function) {
        return (input1, input2) -> apply(function, input1, input2);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super U`
in `src/main/java/org/apache/commons/lang3/function/Failable.java`
#### Snippet
```java
     * @return a standard {@link BiFunction}
     */
    public static <T, U, R> BiFunction<T, U, R> asBiFunction(final FailableBiFunction<T, U, R, ?> function) {
        return (input1, input2) -> apply(function, input1, input2);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `src/main/java/org/apache/commons/lang3/function/Failable.java`
#### Snippet
```java
     * @return a standard {@link BiFunction}
     */
    public static <T, U, R> BiFunction<T, U, R> asBiFunction(final FailableBiFunction<T, U, R, ?> function) {
        return (input1, input2) -> apply(function, input1, input2);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/org/apache/commons/lang3/function/Failable.java`
#### Snippet
```java
     * @return a standard {@link Predicate}
     */
    public static <T> Predicate<T> asPredicate(final FailablePredicate<T, ?> predicate) {
        return input -> test(predicate, input);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/lang3/function/FailableBiConsumer.java`
#### Snippet
```java
     * @throws NullPointerException when {@code after} is null.
     */
    default FailableBiConsumer<T, U, E> andThen(final FailableBiConsumer<? super T, ? super U, E> after) {
        Objects.requireNonNull(after);
        return (t, u) -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Locale`
in `src/main/java/org/apache/commons/lang3/LocaleUtils.java`
#### Snippet
```java
    }

    private static List<Locale> availableLocaleList(final Predicate<Locale> predicate) {
        return availableLocaleList().stream().filter(predicate).collect(Collectors.toList());
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Throwable`
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
    @SafeVarargs
    public static void tryWithResources(final FailableRunnable<? extends Throwable> action,
        final FailableConsumer<Throwable, ? extends Throwable> errorHandler,
        final FailableRunnable<? extends Throwable>... resources) {
        final org.apache.commons.lang3.function.FailableRunnable<?>[] fr = new org.apache.commons.lang3.function.FailableRunnable[resources.length];
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends O`
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
     * @since 3.10
     */
    public static <O> Supplier<O> asSupplier(final FailableSupplier<O, ?> supplier) {
        return () -> get(supplier);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super I`
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
     * @since 3.10
     */
    public static <I> Predicate<I> asPredicate(final FailablePredicate<I, ?> predicate) {
        return input -> test(predicate, input);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super I`
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
     * @since 3.10
     */
    public static <I, O> Function<I, O> asFunction(final FailableFunction<I, O, ?> function) {
        return input -> apply(function, input);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends O`
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
     * @since 3.10
     */
    public static <I, O> Function<I, O> asFunction(final FailableFunction<I, O, ?> function) {
        return input -> apply(function, input);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super O1`
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
     * @since 3.10
     */
    public static <O1, O2> BiPredicate<O1, O2> asBiPredicate(final FailableBiPredicate<O1, O2, ?> predicate) {
        return (input1, input2) -> test(predicate, input1, input2);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super O2`
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
     * @since 3.10
     */
    public static <O1, O2> BiPredicate<O1, O2> asBiPredicate(final FailableBiPredicate<O1, O2, ?> predicate) {
        return (input1, input2) -> test(predicate, input1, input2);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super O1`
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
     * @since 3.10
     */
    public static <O1, O2> BiConsumer<O1, O2> asBiConsumer(final FailableBiConsumer<O1, O2, ?> consumer) {
        return (input1, input2) -> accept(consumer, input1, input2);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super O2`
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
     * @since 3.10
     */
    public static <O1, O2> BiConsumer<O1, O2> asBiConsumer(final FailableBiConsumer<O1, O2, ?> consumer) {
        return (input1, input2) -> accept(consumer, input1, input2);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends O`
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
     * @since 3.10
     */
    public static <O> Callable<O> asCallable(final FailableCallable<O, ?> callable) {
        return () -> call(callable);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super I`
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
     * @since 3.10
     */
    public static <I> Consumer<I> asConsumer(final FailableConsumer<I, ?> consumer) {
        return input -> accept(consumer, input);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super O1`
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
     * @since 3.10
     */
    public static <O1, O2, O> BiFunction<O1, O2, O> asBiFunction(final FailableBiFunction<O1, O2, O, ?> function) {
        return (input1, input2) -> apply(function, input1, input2);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super O2`
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
     * @since 3.10
     */
    public static <O1, O2, O> BiFunction<O1, O2, O> asBiFunction(final FailableBiFunction<O1, O2, O, ?> function) {
        return (input1, input2) -> apply(function, input1, input2);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends O`
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
     * @since 3.10
     */
    public static <O1, O2, O> BiFunction<O1, O2, O> asBiFunction(final FailableBiFunction<O1, O2, O, ?> function) {
        return (input1, input2) -> apply(function, input1, input2);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Throwable`
in `src/main/java/org/apache/commons/lang3/exception/ExceptionUtils.java`
#### Snippet
```java
     * @since 3.13.0
     */
    public static void forEach(final Throwable throwable, final Consumer<Throwable> consumer) {
        stream(throwable).forEach(consumer);
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     * @since 3.4
     */
    public static <T> boolean isSorted(final T[] array, final Comparator<T> comparator) {
        Objects.requireNonNull(comparator, "comparator");
        if (getLength(array) < 2) {
```

## RuleId[ruleID=NegativeIntConstantInLongContext]
### RuleId[ruleID=NegativeIntConstantInLongContext]
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

## RuleId[ruleID=RedundantSuppression]
### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     * @throws IllegalArgumentException if the array types are incompatible
     */
    public static <T> T[] addAll(final T[] array1, @SuppressWarnings("unchecked") final T... array2) {
        if (array1 == null) {
            return clone(array2);
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     * @since 3.0
     */
    public static <T> T[] toArray(@SuppressWarnings("unchecked") final T... items) {
        return items;
    }
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `src/main/java/org/apache/commons/lang3/ObjectUtils.java`
#### Snippet
```java
@SuppressWarnings("deprecation") // deprecated class StrBuilder is imported
// because it is part of the signature of deprecated methods
public class ObjectUtils {

    /**
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `src/main/java/org/apache/commons/lang3/SerializationUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // inputStream is managed by the caller
    public static <T> T deserialize(final InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputStream");
        try (ObjectInputStream in = new ObjectInputStream(inputStream)) {
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `src/main/java/org/apache/commons/lang3/SerializationUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // outputStream is managed by the caller
    public static void serialize(final Serializable obj, final OutputStream outputStream) {
        Objects.requireNonNull(outputStream, "outputStream");
        try (ObjectOutputStream out = new ObjectOutputStream(outputStream)) {
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `src/main/java/org/apache/commons/lang3/exception/ExceptionUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    public static void printRootCauseStackTrace(final Throwable throwable, final PrintStream printStream) {
        if (throwable == null) {
            return;
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `src/main/java/org/apache/commons/lang3/exception/ExceptionUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource")
    public static void printRootCauseStackTrace(final Throwable throwable, final PrintWriter printWriter) {
        if (throwable == null) {
            return;
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
     */
    private static <T> StringBuilder appendAllTo(final StringBuilder builder, final String sep,
        @SuppressWarnings("unchecked") final T... types) {
        Validate.notEmpty(Validate.noNullElements(types));
        if (types.length > 0) {
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
     * @since 2.3
     */
    public <T> StrBuilder appendAll(@SuppressWarnings("unchecked") final T... array) {
        /*
         * @SuppressWarnings used to hide warning about vararg usage. We cannot
```

## RuleId[ruleID=UtilityClassWithPublicConstructor]
### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `FormattableUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/text/FormattableUtils.java`
#### Snippet
```java
 */
@Deprecated
public class FormattableUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `SerializationUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/SerializationUtils.java`
#### Snippet
```java
 * @since 1.0
 */
public class SerializationUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `SystemUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/SystemUtils.java`
#### Snippet
```java
 * @since 1.0
 */
public class SystemUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `WordUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/text/WordUtils.java`
#### Snippet
```java
 */
@Deprecated
public class WordUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `NumberUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
 * @since 2.0
 */
public class NumberUtils {

    /** Reusable Long constant for zero. */
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `ClassUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
 * @since 2.0
 */
public class ClassUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `MethodUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
 * @since 2.5
 */
public class MethodUtils {

    private static final Comparator<Method> METHOD_BY_SIGNATURE = Comparator.comparing(Method::toString);
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `Validate` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/Validate.java`
#### Snippet
```java
 * @since 2.0
 */
public class Validate {

    private static final String DEFAULT_NOT_NAN_EX_MESSAGE =
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `RandomStringUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/RandomStringUtils.java`
#### Snippet
```java
 * @since 1.0
 */
public class RandomStringUtils {

    private static ThreadLocalRandom random() {
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `FieldUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/reflect/FieldUtils.java`
#### Snippet
```java
 * @since 2.5
 */
public class FieldUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `StringEscapeUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/StringEscapeUtils.java`
#### Snippet
```java
 */
@Deprecated
public class StringEscapeUtils {

    /* ESCAPE TRANSLATORS */
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `ConstructorUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/reflect/ConstructorUtils.java`
#### Snippet
```java
 * @since 2.5
 */
public class ConstructorUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `DurationFormatUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/time/DurationFormatUtils.java`
#### Snippet
```java
 * @since 2.1
 */
public class DurationFormatUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `EnumUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/EnumUtils.java`
#### Snippet
```java
 * @since 3.0
 */
public class EnumUtils {

    private static final String CANNOT_STORE_S_S_VALUES_IN_S_BITS = "Cannot store %s %s values in %s bits";
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `CharSetUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/CharSetUtils.java`
#### Snippet
```java
 * @since 1.0
 */
public class CharSetUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `DateUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/time/DateUtils.java`
#### Snippet
```java
 * @since 2.0
 */
public class DateUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `StringUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
 */
//@Immutable
public class StringUtils {

    // Performance testing notes (JDK 1.4, Jul03, scolebourne)
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `ClassPathUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/ClassPathUtils.java`
#### Snippet
```java
 */
//@Immutable
public class ClassPathUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `ObjectUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/ObjectUtils.java`
#### Snippet
```java
@SuppressWarnings("deprecation") // deprecated class StrBuilder is imported
// because it is part of the signature of deprecated methods
public class ObjectUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `BooleanUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
 * @since 2.0
 */
public class BooleanUtils {

    private static final List<Boolean> BOOLEAN_LIST = Collections.unmodifiableList(Arrays.asList(Boolean.FALSE, Boolean.TRUE));
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `TypeUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
 * @since 3.0
 */
public class TypeUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `AnnotationUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/AnnotationUtils.java`
#### Snippet
```java
 * @since 3.0
 */
public class AnnotationUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `ThreadUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/ThreadUtils.java`
#### Snippet
```java
 * @since 3.5
 */
public class ThreadUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `RandomUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/RandomUtils.java`
#### Snippet
```java
 */
@Deprecated
public class RandomUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `CharSequenceUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/CharSequenceUtils.java`
#### Snippet
```java
 * @since 3.0
 */
public class CharSequenceUtils {

    private static final int NOT_FOUND = -1;
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `InheritanceUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/reflect/InheritanceUtils.java`
#### Snippet
```java
 * @since 3.2
 */
public class InheritanceUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `DateFormatUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/time/DateFormatUtils.java`
#### Snippet
```java
 * @since 2.0
 */
public class DateFormatUtils {

    /**
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `CharUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/CharUtils.java`
#### Snippet
```java
 * @since 2.1
 */
public class CharUtils {

    private static final String[] CHAR_STRING_ARRAY = new String[128];
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `LocaleUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/LocaleUtils.java`
#### Snippet
```java
 * @since 2.2
 */
public class LocaleUtils {
    private static final char UNDERSCORE = '_';
    private static final char DASH = '-';
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `ExceptionUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/exception/ExceptionUtils.java`
#### Snippet
```java
 * @since 1.0
 */
public class ExceptionUtils {

    private static final int NOT_FOUND = -1;
```

### RuleId[ruleID=UtilityClassWithPublicConstructor]
Class `ArrayUtils` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
 * @since 2.0
 */
public class ArrayUtils {

    /**
```

## RuleId[ruleID=UnnecessaryBoxing]
### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/CharRange.java`
#### Snippet
```java
            final char cur = current;
            prepareNext();
            return Character.valueOf(cur);
        }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/DiffBuilder.java`
#### Snippet
```java
                @Override
                public Long getLeft() {
                    return Long.valueOf(lhs);
                }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/DiffBuilder.java`
#### Snippet
```java
                @Override
                public Integer getRight() {
                    return Integer.valueOf(rhs);
                }
            });
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/DiffBuilder.java`
#### Snippet
```java
                @Override
                public Double getLeft() {
                    return Double.valueOf(lhs);
                }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/DiffBuilder.java`
#### Snippet
```java
                @Override
                public Byte getLeft() {
                    return Byte.valueOf(lhs);
                }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/DiffBuilder.java`
#### Snippet
```java
                @Override
                public Byte getRight() {
                    return Byte.valueOf(rhs);
                }
            });
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/DiffBuilder.java`
#### Snippet
```java
                @Override
                public Double getRight() {
                    return Double.valueOf(rhs);
                }
            });
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/DiffBuilder.java`
#### Snippet
```java
                @Override
                public Character getLeft() {
                    return Character.valueOf(lhs);
                }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/DiffBuilder.java`
#### Snippet
```java
                @Override
                public Boolean getRight() {
                    return Boolean.valueOf(rhs);
                }
            });
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/DiffBuilder.java`
#### Snippet
```java
                @Override
                public Short getLeft() {
                    return Short.valueOf(lhs);
                }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/DiffBuilder.java`
#### Snippet
```java
                @Override
                public Float getLeft() {
                    return Float.valueOf(lhs);
                }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/DiffBuilder.java`
#### Snippet
```java
                @Override
                public Short getRight() {
                    return Short.valueOf(rhs);
                }
            });
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/DiffBuilder.java`
#### Snippet
```java
                @Override
                public Integer getLeft() {
                    return Integer.valueOf(lhs);
                }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/DiffBuilder.java`
#### Snippet
```java
                @Override
                public Character getRight() {
                    return Character.valueOf(rhs);
                }
            });
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/DiffBuilder.java`
#### Snippet
```java
                @Override
                public Long getRight() {
                    return Long.valueOf(rhs);
                }
            });
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/DiffBuilder.java`
#### Snippet
```java
                @Override
                public Float getRight() {
                    return Float.valueOf(rhs);
                }
            });
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/DiffBuilder.java`
#### Snippet
```java
                @Override
                public Boolean getLeft() {
                    return Boolean.valueOf(lhs);
                }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/ToStringBuilder.java`
#### Snippet
```java
     */
    public ToStringBuilder append(final String fieldName, final Object[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        return this;
    }
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/ToStringBuilder.java`
#### Snippet
```java
     */
    public ToStringBuilder append(final String fieldName, final boolean[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        return this;
    }
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/ToStringBuilder.java`
#### Snippet
```java
     */
    public ToStringBuilder append(final String fieldName, final short[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        return this;
    }
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/ToStringBuilder.java`
#### Snippet
```java
     */
    public ToStringBuilder append(final String fieldName, final float[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        return this;
    }
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/ToStringBuilder.java`
#### Snippet
```java
     */
    public ToStringBuilder append(final String fieldName, final long[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        return this;
    }
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/ToStringBuilder.java`
#### Snippet
```java
     */
    public ToStringBuilder append(final String fieldName, final int[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        return this;
    }
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/ToStringBuilder.java`
#### Snippet
```java
     */
    public ToStringBuilder append(final String fieldName, final Object obj, final boolean fullDetail) {
        style.append(buffer, fieldName, obj, Boolean.valueOf(fullDetail));
        return this;
    }
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/ToStringBuilder.java`
#### Snippet
```java
     */
    public ToStringBuilder append(final String fieldName, final char[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        return this;
    }
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/ToStringBuilder.java`
#### Snippet
```java
     */
    public ToStringBuilder append(final String fieldName, final double[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        return this;
    }
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/ToStringBuilder.java`
#### Snippet
```java
     */
    public ToStringBuilder append(final String fieldName, final byte[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, Boolean.valueOf(fullDetail));
        return this;
    }
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java`
#### Snippet
```java
    @Override
    public Boolean build() {
        return Boolean.valueOf(isEquals());
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/mutable/MutableDouble.java`
#### Snippet
```java
    @Override
    public Double getValue() {
        return Double.valueOf(this.value);
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/mutable/MutableDouble.java`
#### Snippet
```java
     */
    public Double toDouble() {
        return Double.valueOf(doubleValue());
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/text/FormattableUtils.java`
#### Snippet
```java
            final int precision, final char padChar, final CharSequence ellipsis) {
        Validate.isTrue(ellipsis == null || precision < 0 || ellipsis.length() <= precision,
                "Specified ellipsis '%1$s' exceeds precision of %2$s", ellipsis, Integer.valueOf(precision));
        final StringBuilder buf = new StringBuilder(seq);
        if (precision >= 0 && precision < seq.length()) {
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/mutable/MutableShort.java`
#### Snippet
```java
     */
    public Short toShort() {
        return Short.valueOf(shortValue());
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/mutable/MutableShort.java`
#### Snippet
```java
    @Override
    public Short getValue() {
        return Short.valueOf(this.value);
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/CompareToBuilder.java`
#### Snippet
```java
    @Override
    public Integer build() {
        return Integer.valueOf(toComparison());
    }
}
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static final Integer INTEGER_TWO = Integer.valueOf(2);
    /** Reusable Integer constant for minus one. */
    public static final Integer INTEGER_MINUS_ONE = Integer.valueOf(-1);
    /** Reusable Short constant for zero. */
    public static final Short SHORT_ZERO = Short.valueOf((short) 0);
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static final Byte BYTE_ZERO = Byte.valueOf((byte) 0);
    /** Reusable Byte constant for one. */
    public static final Byte BYTE_ONE = Byte.valueOf((byte) 1);
    /** Reusable Byte constant for minus one. */
    public static final Byte BYTE_MINUS_ONE = Byte.valueOf((byte) -1);
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static final Integer INTEGER_ZERO = Integer.valueOf(0);
    /** Reusable Integer constant for one. */
    public static final Integer INTEGER_ONE = Integer.valueOf(1);
    /** Reusable Integer constant for two */
    public static final Integer INTEGER_TWO = Integer.valueOf(2);
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static final Long LONG_ZERO = Long.valueOf(0L);
    /** Reusable Long constant for one. */
    public static final Long LONG_ONE = Long.valueOf(1L);
    /** Reusable Long constant for minus one. */
    public static final Long LONG_MINUS_ONE = Long.valueOf(-1L);
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static final Float FLOAT_ZERO = Float.valueOf(0.0f);
    /** Reusable Float constant for one. */
    public static final Float FLOAT_ONE = Float.valueOf(1.0f);
    /** Reusable Float constant for minus one. */
    public static final Float FLOAT_MINUS_ONE = Float.valueOf(-1.0f);
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static final Long LONG_ONE = Long.valueOf(1L);
    /** Reusable Long constant for minus one. */
    public static final Long LONG_MINUS_ONE = Long.valueOf(-1L);
    /** Reusable Integer constant for zero. */
    public static final Integer INTEGER_ZERO = Integer.valueOf(0);
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
     * @since 3.12.0
     */
    public static final Long LONG_INT_MIN_VALUE = Long.valueOf(Integer.MIN_VALUE);


```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static final Double DOUBLE_MINUS_ONE = Double.valueOf(-1.0d);
    /** Reusable Float constant for zero. */
    public static final Float FLOAT_ZERO = Float.valueOf(0.0f);
    /** Reusable Float constant for one. */
    public static final Float FLOAT_ONE = Float.valueOf(1.0f);
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static final Short SHORT_MINUS_ONE = Short.valueOf((short) -1);
    /** Reusable Byte constant for zero. */
    public static final Byte BYTE_ZERO = Byte.valueOf((byte) 0);
    /** Reusable Byte constant for one. */
    public static final Byte BYTE_ONE = Byte.valueOf((byte) 1);
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static final Integer INTEGER_ONE = Integer.valueOf(1);
    /** Reusable Integer constant for two */
    public static final Integer INTEGER_TWO = Integer.valueOf(2);
    /** Reusable Integer constant for minus one. */
    public static final Integer INTEGER_MINUS_ONE = Integer.valueOf(-1);
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static final Byte BYTE_ONE = Byte.valueOf((byte) 1);
    /** Reusable Byte constant for minus one. */
    public static final Byte BYTE_MINUS_ONE = Byte.valueOf((byte) -1);
    /** Reusable Double constant for zero. */
    public static final Double DOUBLE_ZERO = Double.valueOf(0.0d);
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java

    /** Reusable Long constant for zero. */
    public static final Long LONG_ZERO = Long.valueOf(0L);
    /** Reusable Long constant for one. */
    public static final Long LONG_ONE = Long.valueOf(1L);
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
     * @since 3.12.0
     */
    public static final Long LONG_INT_MAX_VALUE = Long.valueOf(Integer.MAX_VALUE);

    /**
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static final Byte BYTE_MINUS_ONE = Byte.valueOf((byte) -1);
    /** Reusable Double constant for zero. */
    public static final Double DOUBLE_ZERO = Double.valueOf(0.0d);
    /** Reusable Double constant for one. */
    public static final Double DOUBLE_ONE = Double.valueOf(1.0d);
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static final Short SHORT_ONE = Short.valueOf((short) 1);
    /** Reusable Short constant for minus one. */
    public static final Short SHORT_MINUS_ONE = Short.valueOf((short) -1);
    /** Reusable Byte constant for zero. */
    public static final Byte BYTE_ZERO = Byte.valueOf((byte) 0);
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static final Float FLOAT_ONE = Float.valueOf(1.0f);
    /** Reusable Float constant for minus one. */
    public static final Float FLOAT_MINUS_ONE = Float.valueOf(-1.0f);

    /**
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static final Integer INTEGER_MINUS_ONE = Integer.valueOf(-1);
    /** Reusable Short constant for zero. */
    public static final Short SHORT_ZERO = Short.valueOf((short) 0);
    /** Reusable Short constant for one. */
    public static final Short SHORT_ONE = Short.valueOf((short) 1);
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static final Long LONG_MINUS_ONE = Long.valueOf(-1L);
    /** Reusable Integer constant for zero. */
    public static final Integer INTEGER_ZERO = Integer.valueOf(0);
    /** Reusable Integer constant for one. */
    public static final Integer INTEGER_ONE = Integer.valueOf(1);
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static final Double DOUBLE_ZERO = Double.valueOf(0.0d);
    /** Reusable Double constant for one. */
    public static final Double DOUBLE_ONE = Double.valueOf(1.0d);
    /** Reusable Double constant for minus one. */
    public static final Double DOUBLE_MINUS_ONE = Double.valueOf(-1.0d);
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static final Short SHORT_ZERO = Short.valueOf((short) 0);
    /** Reusable Short constant for one. */
    public static final Short SHORT_ONE = Short.valueOf((short) 1);
    /** Reusable Short constant for minus one. */
    public static final Short SHORT_MINUS_ONE = Short.valueOf((short) -1);
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static final Double DOUBLE_ONE = Double.valueOf(1.0d);
    /** Reusable Double constant for minus one. */
    public static final Double DOUBLE_MINUS_ONE = Double.valueOf(-1.0d);
    /** Reusable Float constant for zero. */
    public static final Float FLOAT_ZERO = Float.valueOf(0.0f);
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/mutable/MutableLong.java`
#### Snippet
```java
     */
    public Long toLong() {
        return Long.valueOf(longValue());
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/mutable/MutableLong.java`
#### Snippet
```java
    @Override
    public Long getValue() {
        return Long.valueOf(this.value);
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/mutable/MutableFloat.java`
#### Snippet
```java
     */
    public Float toFloat() {
        return Float.valueOf(floatValue());
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/mutable/MutableFloat.java`
#### Snippet
```java
    @Override
    public Float getValue() {
        return Float.valueOf(this.value);
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/builder/HashCodeBuilder.java`
#### Snippet
```java
    @Override
    public Integer build() {
        return Integer.valueOf(toHashCode());
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/Validate.java`
#### Snippet
```java
     */
    public static <T> T[] validIndex(final T[] array, final int index) {
        return validIndex(array, index, DEFAULT_VALID_INDEX_ARRAY_EX_MESSAGE, Integer.valueOf(index));
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/Validate.java`
#### Snippet
```java
     */
    public static <T extends Collection<?>> T validIndex(final T collection, final int index) {
        return validIndex(collection, index, DEFAULT_VALID_INDEX_COLLECTION_EX_MESSAGE, Integer.valueOf(index));
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/Validate.java`
#### Snippet
```java
     */
    public static <T extends CharSequence> T validIndex(final T chars, final int index) {
        return validIndex(chars, index, DEFAULT_VALID_INDEX_CHAR_SEQUENCE_EX_MESSAGE, Integer.valueOf(index));
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/Validate.java`
#### Snippet
```java
    public static void isTrue(final boolean expression, final String message, final long value) {
        if (!expression) {
            throw new IllegalArgumentException(String.format(message, Long.valueOf(value)));
        }
    }
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/Validate.java`
#### Snippet
```java
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                final Object[] values2 = ArrayUtils.add(values, Integer.valueOf(i));
                throw new IllegalArgumentException(getMessage(message, values2));
            }
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/Validate.java`
#### Snippet
```java
        for (final Iterator<?> it = iterable.iterator(); it.hasNext(); i++) {
            if (it.next() == null) {
                final Object[] values2 = ArrayUtils.addAll(values, Integer.valueOf(i));
                throw new IllegalArgumentException(getMessage(message, values2));
            }
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/Validate.java`
#### Snippet
```java
    public static void isTrue(final boolean expression, final String message, final double value) {
        if (!expression) {
            throw new IllegalArgumentException(String.format(message, Double.valueOf(value)));
        }
    }
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/time/DurationUtils.java`
#### Snippet
```java
        Objects.requireNonNull(duration, "duration");
        // intValue() does not do a narrowing conversion here
        return LONG_TO_INT_RANGE.fit(Long.valueOf(duration.toMillis())).intValue();
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/concurrent/ConstantInitializer.java`
#### Snippet
```java
    @Override
    public String toString() {
        return String.format(FMT_TO_STRING, Integer.valueOf(System.identityHashCode(this)),
                String.valueOf(getObject()));
    }
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/EnumUtils.java`
#### Snippet
```java
        final E[] constants = asEnum(enumClass).getEnumConstants();
        Validate.isTrue(constants.length <= Long.SIZE, CANNOT_STORE_S_S_VALUES_IN_S_BITS,
            Integer.valueOf(constants.length), enumClass.getSimpleName(), Integer.valueOf(Long.SIZE));

        return enumClass;
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/EnumUtils.java`
#### Snippet
```java
        final E[] constants = asEnum(enumClass).getEnumConstants();
        Validate.isTrue(constants.length <= Long.SIZE, CANNOT_STORE_S_S_VALUES_IN_S_BITS,
            Integer.valueOf(constants.length), enumClass.getSimpleName(), Integer.valueOf(Long.SIZE));

        return enumClass;
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/time/FormatCache.java`
#### Snippet
```java
    // package protected, for access from FastDateFormat; do not make public or protected
    F getDateInstance(final int dateStyle, final TimeZone timeZone, final Locale locale) {
        return getDateTimeInstance(Integer.valueOf(dateStyle), null, timeZone, locale);
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/time/FormatCache.java`
#### Snippet
```java
    // package protected, for access from FastDateFormat; do not make public or protected
    F getTimeInstance(final int timeStyle, final TimeZone timeZone, final Locale locale) {
        return getDateTimeInstance(null, Integer.valueOf(timeStyle), timeZone, locale);
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/mutable/MutableBoolean.java`
#### Snippet
```java
     */
    public Boolean toBoolean() {
        return Boolean.valueOf(booleanValue());
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/mutable/MutableBoolean.java`
#### Snippet
```java
    @Override
    public Boolean getValue() {
        return Boolean.valueOf(this.value);
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/mutable/MutableByte.java`
#### Snippet
```java
    @Override
    public Byte getValue() {
        return Byte.valueOf(this.value);
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/mutable/MutableByte.java`
#### Snippet
```java
     */
    public Byte toByte() {
        return Byte.valueOf(byteValue());
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/mutable/MutableInt.java`
#### Snippet
```java
    @Override
    public Integer getValue() {
        return Integer.valueOf(this.value);
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/mutable/MutableInt.java`
#### Snippet
```java
     */
    public Integer toInteger() {
        return Integer.valueOf(intValue());
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
     */
    public static Boolean oneHot(final Boolean... array) {
        return Boolean.valueOf(oneHot(ArrayUtils.toPrimitive(array)));
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/concurrent/BasicThreadFactory.java`
#### Snippet
```java
         */
        public Builder priority(final int priority) {
            this.priority = Integer.valueOf(priority);
            return this;
        }
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/concurrent/BasicThreadFactory.java`
#### Snippet
```java

        if (getNamingPattern() != null) {
            final Long count = Long.valueOf(threadCounter.incrementAndGet());
            thread.setName(String.format(getNamingPattern(), count));
        }
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/concurrent/BasicThreadFactory.java`
#### Snippet
```java
         */
        public Builder daemon(final boolean daemon) {
            this.daemon = Boolean.valueOf(daemon);
            return this;
        }
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/CharUtils.java`
#### Snippet
```java
    @Deprecated
    public static Character toCharacterObject(final char ch) {
        return Character.valueOf(ch);
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/CharUtils.java`
#### Snippet
```java
     */
    public static Character toCharacterObject(final String str) {
        return StringUtils.isEmpty(str) ? null : Character.valueOf(str.charAt(0));
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    @Deprecated
    public static long[] add(final long[] array, final int index, final long element) {
        return (long[]) add(array, index, Long.valueOf(element), Long.TYPE);
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            return EMPTY_FLOAT_OBJECT_ARRAY;
        }
        return setAll(new Float[array.length], i -> Float.valueOf(array[i]));
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        final HashMap<Short, MutableInt> occurrences = new HashMap<>(values.length);
        for (final short v : values) {
            final Short boxed = Short.valueOf(v);
            final MutableInt count = occurrences.get(boxed);
            if (count == null) {
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            return EMPTY_LONG_OBJECT_ARRAY;
        }
        return setAll(new Long[array.length], i -> Long.valueOf(array[i]));
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    @Deprecated
    public static double[] add(final double[] array, final int index, final double element) {
        return (double[]) add(array, index, Double.valueOf(element), Double.TYPE);
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        final HashMap<Character, MutableInt> occurrences = new HashMap<>(values.length);
        for (final char v : values) {
            final Character boxed = Character.valueOf(v);
            final MutableInt count = occurrences.get(boxed);
            if (count == null) {
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    @Deprecated
    public static byte[] add(final byte[] array, final int index, final byte element) {
        return (byte[]) add(array, index, Byte.valueOf(element), Byte.TYPE);
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    @Deprecated
    public static int[] add(final int[] array, final int index, final int element) {
        return (int[]) add(array, index, Integer.valueOf(element), Integer.TYPE);
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        final Map<Byte, MutableInt> occurrences = new HashMap<>(values.length);
        for (final byte v : values) {
            final Byte boxed = Byte.valueOf(v);
            final MutableInt count = occurrences.get(boxed);
            if (count == null) {
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    @Deprecated
    public static boolean[] add(final boolean[] array, final int index, final boolean element) {
        return (boolean[]) add(array, index, Boolean.valueOf(element), Boolean.TYPE);
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        final HashMap<Long, MutableInt> occurrences = new HashMap<>(values.length);
        for (final long v : values) {
            final Long boxed = Long.valueOf(v);
            final MutableInt count = occurrences.get(boxed);
            if (count == null) {
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            return EMPTY_INTEGER_OBJECT_ARRAY;
        }
        return setAll(new Integer[array.length], i -> Integer.valueOf(array[i]));
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    @Deprecated
    public static char[] add(final char[] array, final int index, final char element) {
        return (char[]) add(array, index, Character.valueOf(element), Character.TYPE);
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    @Deprecated
    public static short[] add(final short[] array, final int index, final short element) {
        return (short[]) add(array, index, Short.valueOf(element), Short.TYPE);
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            return EMPTY_CHARACTER_OBJECT_ARRAY;
        }
        return setAll(new Character[array.length], i -> Character.valueOf(array[i]));
     }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            return EMPTY_SHORT_OBJECT_ARRAY;
        }
        return setAll(new Short[array.length], i -> Short.valueOf(array[i]));
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            return EMPTY_DOUBLE_OBJECT_ARRAY;
        }
        return setAll(new Double[array.length], i -> Double.valueOf(array[i]));
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        final HashMap<Float, MutableInt> occurrences = new HashMap<>(values.length);
        for (final float v : values) {
            final Float boxed = Float.valueOf(v);
            final MutableInt count = occurrences.get(boxed);
            if (count == null) {
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        final HashMap<Boolean, MutableInt> occurrences = new HashMap<>(2); // only two possible values here
        for (final boolean v : values) {
            final Boolean boxed = Boolean.valueOf(v);
            final MutableInt count = occurrences.get(boxed);
            if (count == null) {
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            return EMPTY_BYTE_OBJECT_ARRAY;
        }
        return setAll(new Byte[array.length], i -> Byte.valueOf(array[i]));
    }

```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        final HashMap<Integer, MutableInt> occurrences = new HashMap<>(values.length);
        for (final int v : values) {
            final Integer boxed = Integer.valueOf(v);
            final MutableInt count = occurrences.get(boxed);
            if (count == null) {
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        final HashMap<Double, MutableInt> occurrences = new HashMap<>(values.length);
        for (final double v : values) {
            final Double boxed = Double.valueOf(v);
            final MutableInt count = occurrences.get(boxed);
            if (count == null) {
```

### RuleId[ruleID=UnnecessaryBoxing]
Unnecessary boxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    @Deprecated
    public static float[] add(final float[] array, final int index, final float element) {
        return (float[]) add(array, index, Float.valueOf(element), Float.TYPE);
    }

```

## RuleId[ruleID=FunctionalExpressionCanBeFolded]
### RuleId[ruleID=FunctionalExpressionCanBeFolded]
Method reference can be replaced with qualifier
in `src/main/java/org/apache/commons/lang3/time/DurationUtils.java`
#### Snippet
```java
     */
    public static <E extends Throwable> Duration of(final FailableConsumer<Instant, E> consumer) throws E {
        return since(now(consumer::accept));
    }

```

### RuleId[ruleID=FunctionalExpressionCanBeFolded]
Method reference can be replaced with qualifier
in `src/main/java/org/apache/commons/lang3/EnumUtils.java`
#### Snippet
```java
     */
    public static <E extends Enum<E>, K> Map<K, E> getEnumMap(final Class<E> enumClass, final Function<E, K> keyFunction) {
        return Stream.of(enumClass.getEnumConstants()).collect(Collectors.toMap(keyFunction::apply, Function.identity()));
    }

```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/lang3/exception/ExceptionUtils.java`
#### Snippet
```java
     */
    public static void printRootCauseStackTrace(final Throwable throwable) {
        printRootCauseStackTrace(throwable, System.err);
    }

```

## RuleId[ruleID=UnnecessaryUnboxing]
### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
                    try {
                        final Float f = createFloat(str);
                        if (!(f.isInfinite() || f.floatValue() == 0.0F && !isZero(mant, dec))) {
                            //If it's too big for a float or the float value = 0 and the string
                            //has non-zeros in it, then float does not have the precision we want
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
                    try {
                        final Double d = createDouble(str);
                        if (!(d.isInfinite() || d.doubleValue() == 0.0D && !isZero(mant, dec))) {
                            return d;
                        }
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
            final Double d = createDouble(str);
            if (!f.isInfinite()
                    && !(f.floatValue() == 0.0F && !isZero(mant, dec))
                    && f.toString().equals(d.toString())) {
                return f;
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
                return f;
            }
            if (!d.isInfinite() && !(d.doubleValue() == 0.0D && !isZero(mant, dec))) {
                final BigDecimal b = createBigDecimal(str);
                if (b.compareTo(BigDecimal.valueOf(d.doubleValue())) == 0) {
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
            if (!d.isInfinite() && !(d.doubleValue() == 0.0D && !isZero(mant, dec))) {
                final BigDecimal b = createBigDecimal(str);
                if (b.compareTo(BigDecimal.valueOf(d.doubleValue())) == 0) {
                    return d;
                }
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/builder/ToStringStyle.java`
#### Snippet
```java
            return defaultFullDetail;
        }
        return fullDetailRequest.booleanValue();
    }

```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/time/FastDateParser.java`
#### Snippet
```java
            //LANG-1669: Mimic fix done in OpenJDK 17 to resolve issue with parsing newly supported day periods added in OpenJDK 16
            if (Calendar.AM_PM != this.field || iVal <= 1) {
                calendar.set(field, iVal.intValue());
            }
        }
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/time/FormatCache.java`
#### Snippet
```java
                final DateFormat formatter;
                if (dateStyle == null) {
                    formatter = DateFormat.getTimeInstance(timeStyle.intValue(), safeLocale);
                } else if (timeStyle == null) {
                    formatter = DateFormat.getDateInstance(dateStyle.intValue(), safeLocale);
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/time/FormatCache.java`
#### Snippet
```java
                    formatter = DateFormat.getTimeInstance(timeStyle.intValue(), safeLocale);
                } else if (timeStyle == null) {
                    formatter = DateFormat.getDateInstance(dateStyle.intValue(), safeLocale);
                } else {
                    formatter = DateFormat.getDateTimeInstance(dateStyle.intValue(), timeStyle.intValue(), safeLocale);
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/time/FormatCache.java`
#### Snippet
```java
                    formatter = DateFormat.getDateInstance(dateStyle.intValue(), safeLocale);
                } else {
                    formatter = DateFormat.getDateTimeInstance(dateStyle.intValue(), timeStyle.intValue(), safeLocale);
                }
                return ((SimpleDateFormat) formatter).toPattern();
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/time/FormatCache.java`
#### Snippet
```java
                    formatter = DateFormat.getDateInstance(dateStyle.intValue(), safeLocale);
                } else {
                    formatter = DateFormat.getDateTimeInstance(dateStyle.intValue(), timeStyle.intValue(), safeLocale);
                }
                return ((SimpleDateFormat) formatter).toPattern();
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/mutable/MutableBoolean.java`
#### Snippet
```java
    @Override
    public void setValue(final Boolean value) {
        this.value = value.booleanValue();
    }

```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/mutable/MutableBoolean.java`
#### Snippet
```java
     */
    public MutableBoolean(final Boolean value) {
        this.value = value.booleanValue();
    }

```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
            return nullValue;
        }
        return bool.booleanValue() ? trueValue : falseValue;
    }

```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
     */
    public static boolean toBoolean(final Boolean bool) {
        return bool != null && bool.booleanValue();
    }

```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
            return null;
        }
        return value.intValue() == 0 ? Boolean.FALSE : Boolean.TRUE;
    }

```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
            return null;
        }
        return bool.booleanValue() ? NumberUtils.INTEGER_ONE : NumberUtils.INTEGER_ZERO;
    }

```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
            return nullValue;
        }
        return bool.booleanValue() ? trueValue : falseValue;
    }

```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
            return null;
        }
        return bool.booleanValue() ? Boolean.FALSE : Boolean.TRUE;
    }

```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
            return valueIfNull;
        }
        return bool.booleanValue();
    }

```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
            return nullString;
        }
        return bool.booleanValue() ? trueString : falseString;
    }

```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/concurrent/BasicThreadFactory.java`
#### Snippet
```java

        if (getPriority() != null) {
            thread.setPriority(getPriority().intValue());
        }

```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/concurrent/BasicThreadFactory.java`
#### Snippet
```java

        if (getDaemonFlag() != null) {
            thread.setDaemon(getDaemonFlag().booleanValue());
        }
    }
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/time/FastDatePrinter.java`
#### Snippet
```java
        }
        if (obj instanceof Long) {
            return format(((Long) obj).longValue(), toAppendTo);
        }
        throw new IllegalArgumentException("Unknown class: " + ClassUtils.getName(obj, "<null>"));
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/CharUtils.java`
#### Snippet
```java
     */
    public static char toChar(final Character ch) {
        return Objects.requireNonNull(ch, "ch").charValue();
    }

```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/CharUtils.java`
#### Snippet
```java
     */
    public static char toChar(final Character ch, final char defaultValue) {
        return ch != null ? ch.charValue() : defaultValue;
    }

```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        for (int i = 0; i < array.length; i++) {
            final Boolean b = array[i];
            result[i] = b == null ? valueForNull : b.booleanValue();
        }
        return result;
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        final int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i].intValue();
        }
        return result;
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        final long[] result = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i].longValue();
        }
        return result;
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        for (int i = 0; i < array.length; i++) {
            final Float b = array[i];
            result[i] = b == null ? valueForNull : b.floatValue();
        }
        return result;
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        for (int i = 0; i < array.length; i++) {
            final Byte b = array[i];
            result[i] = b == null ? valueForNull : b.byteValue();
        }
        return result;
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        for (int i = 0; i < array.length; i++) {
            final Character b = array[i];
            result[i] = b == null ? valueForNull : b.charValue();
        }
        return result;
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        for (int i = 0; i < array.length; i++) {
            final Long b = array[i];
            result[i] = b == null ? valueForNull : b.longValue();
        }
        return result;
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        final short[] result = new short[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i].shortValue();
        }
        return result;
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        for (int i = 0; i < array.length; i++) {
            final Integer b = array[i];
            result[i] = b == null ? valueForNull : b.intValue();
        }
        return result;
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        final char[] result = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i].charValue();
        }
        return result;
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        final double[] result = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i].doubleValue();
        }
        return result;
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        final byte[] result = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i].byteValue();
        }
        return result;
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        for (int i = 0; i < array.length; i++) {
            final Double b = array[i];
            result[i] = b == null ? valueForNull : b.doubleValue();
        }
        return result;
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        for (int i = 0; i < array.length; i++) {
            final Short b = array[i];
            result[i] = b == null ? valueForNull : b.shortValue();
        }
        return result;
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        final float[] result = new float[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i].floatValue();
        }
        return result;
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Builder` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/lang3/concurrent/BasicThreadFactory.java`
#### Snippet
```java
     *
     */
    public static class Builder
        implements org.apache.commons.lang3.builder.Builder<BasicThreadFactory> {

```

## RuleId[ruleID=RedundantMethodOverride]
### RuleId[ruleID=RedundantMethodOverride]
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

### RuleId[ruleID=RedundantMethodOverride]
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

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/RegExUtils.java`
#### Snippet
```java
     * @see #replacePattern(String, String, String)
     * @see String#replaceAll(String, String)
     * @see java.util.regex.Pattern
     * @see java.util.regex.Pattern#DOTALL
     */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/RegExUtils.java`
#### Snippet
```java
     * @see String#replaceAll(String, String)
     * @see java.util.regex.Pattern
     * @see java.util.regex.Pattern#DOTALL
     */
    public static String replaceAll(final String text, final String regex, final String replacement) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/RegExUtils.java`
#### Snippet
```java
     *
     * @see java.util.regex.Matcher#replaceAll(String)
     * @see java.util.regex.Pattern
     */
    public static String replaceAll(final String text, final Pattern regex, final String replacement) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/RegExUtils.java`
#### Snippet
```java
     * @see #removePattern(String, String)
     * @see String#replaceAll(String, String)
     * @see java.util.regex.Pattern
     * @see java.util.regex.Pattern#DOTALL
     */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/RegExUtils.java`
#### Snippet
```java
     * @see String#replaceAll(String, String)
     * @see java.util.regex.Pattern
     * @see java.util.regex.Pattern#DOTALL
     */
    public static String removeAll(final String text, final String regex) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/RegExUtils.java`
#### Snippet
```java
     *
     * @see java.util.regex.Matcher#replaceFirst(String)
     * @see java.util.regex.Pattern
     */
    public static String replaceFirst(final String text, final Pattern regex, final String replacement) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/RegExUtils.java`
#### Snippet
```java
     * @see #replaceFirst(String, String, String)
     * @see String#replaceFirst(String, String)
     * @see java.util.regex.Pattern
     * @see java.util.regex.Pattern#DOTALL
     */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/RegExUtils.java`
#### Snippet
```java
     * @see String#replaceFirst(String, String)
     * @see java.util.regex.Pattern
     * @see java.util.regex.Pattern#DOTALL
     */
    public static String removeFirst(final String text, final String regex) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/RegExUtils.java`
#### Snippet
```java
/**
 * Helpers to process Strings using regular expressions.
 * @see java.util.regex.Pattern
 * @since 3.8
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/RegExUtils.java`
#### Snippet
```java
     * @see #replaceAll(String, Pattern, String)
     * @see java.util.regex.Matcher#replaceAll(String)
     * @see java.util.regex.Pattern
     */
    public static String removeAll(final String text, final Pattern regex) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/RegExUtils.java`
#### Snippet
```java
     * @see #replaceFirst(String, Pattern, String)
     * @see java.util.regex.Matcher#replaceFirst(String)
     * @see java.util.regex.Pattern
     */
    public static String removeFirst(final String text, final Pattern regex) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/RegExUtils.java`
#### Snippet
```java
     *
     * @see String#replaceFirst(String, String)
     * @see java.util.regex.Pattern
     * @see java.util.regex.Pattern#DOTALL
     */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/RegExUtils.java`
#### Snippet
```java
     * @see String#replaceFirst(String, String)
     * @see java.util.regex.Pattern
     * @see java.util.regex.Pattern#DOTALL
     */
    public static String replaceFirst(final String text, final String regex, final String replacement) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/CharRange.java`
#### Snippet
```java
         *
         * @throws UnsupportedOperationException Always thrown.
         * @see java.util.Iterator#remove()
         */
        @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/CharRange.java`
#### Snippet
```java
     * Required for serialization support. Lang version 2.0.
     *
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 8270183163158333422L;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/text/StrTokenizer.java`
#### Snippet
```java
 * <p>
 * This class can split a String into many smaller strings. It aims
 * to do a similar job to {@link java.util.StringTokenizer StringTokenizer},
 * however it offers much more control and flexibility including implementing
 * the {@link ListIterator} interface. By default, it is set up
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/builder/ReflectionToStringBuilder.java`
#### Snippet
```java
 * <p>
 * This class uses reflection to determine the fields to append. Because these fields are usually private, the class
 * uses {@link java.lang.reflect.AccessibleObject#setAccessible(java.lang.reflect.AccessibleObject[], boolean)} to
 * change the visibility of the fields. This will fail under a security manager, unless the appropriate permissions are
 * set up correctly.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/builder/ReflectionToStringBuilder.java`
#### Snippet
```java
 * <p>
 * This class uses reflection to determine the fields to append. Because these fields are usually private, the class
 * uses {@link java.lang.reflect.AccessibleObject#setAccessible(java.lang.reflect.AccessibleObject[], boolean)} to
 * change the visibility of the fields. This will fail under a security manager, unless the appropriate permissions are
 * set up correctly.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/builder/ReflectionToStringBuilder.java`
#### Snippet
```java
 * </p>
 * <ul>
 * <li>{@link #accept(java.lang.reflect.Field)}</li>
 * <li>{@link #getValue(java.lang.reflect.Field)}</li>
 * </ul>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/builder/ReflectionToStringBuilder.java`
#### Snippet
```java
 * <ul>
 * <li>{@link #accept(java.lang.reflect.Field)}</li>
 * <li>{@link #getValue(java.lang.reflect.Field)}</li>
 * </ul>
 * <p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/builder/ReflectionToStringBuilder.java`
#### Snippet
```java
     *
     * @throws IllegalArgumentException
     *             see {@link java.lang.reflect.Field#get(Object)}
     * @throws IllegalAccessException
     *             see {@link java.lang.reflect.Field#get(Object)}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/builder/ReflectionToStringBuilder.java`
#### Snippet
```java
     *             see {@link java.lang.reflect.Field#get(Object)}
     * @throws IllegalAccessException
     *             see {@link java.lang.reflect.Field#get(Object)}
     *
     * @see java.lang.reflect.Field#get(Object)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/builder/ReflectionToStringBuilder.java`
#### Snippet
```java
     *             see {@link java.lang.reflect.Field#get(Object)}
     *
     * @see java.lang.reflect.Field#get(Object)
     */
    protected Object getValue(final Field field) throws IllegalAccessException {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent.locks` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/concurrent/locks/LockingVisitors.java`
#### Snippet
```java

/**
 * Combines the monitor and visitor pattern to work with {@link java.util.concurrent.locks.Lock locked objects}. Locked
 * objects are an alternative to synchronization. This, on Wikipedia, is known as the Visitor pattern
 * (https://en.wikipedia.org/wiki/Visitor_pattern), and from the "Gang of Four" "Design Patterns" book's Visitor pattern
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/SerializationUtils.java`
#### Snippet
```java
         * @param classLoader classloader to use
         * @throws IOException if an I/O error occurs while reading stream header.
         * @see java.io.ObjectInputStream
         */
        ClassLoaderAwareObjectInputStream(final InputStream in, final ClassLoader classLoader) throws IOException {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/SerializationUtils.java`
#### Snippet
```java

    /**
     * Custom specialization of the standard JDK {@link java.io.ObjectInputStream}
     * that uses a custom  {@link ClassLoader} to resolve a class.
     * If the specified {@link ClassLoader} is not able to resolve the class,
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/builder/CompareToBuilder.java`
#### Snippet
```java

/**
 * Assists in implementing {@link java.lang.Comparable#compareTo(Object)} methods.
 *
 * <p>It is consistent with {@code equals(Object)} and
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/builder/CompareToBuilder.java`
#### Snippet
```java
 * <p>Alternatively, there are {@link #reflectionCompare(Object, Object) reflectionCompare} methods that use
 * reflection to determine the fields to append. Because fields can be private,
 * {@code reflectionCompare} uses {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} to
 * bypass normal access control checks. This will fail under a security manager,
 * unless the appropriate permissions are set up correctly. It is also
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/mutable/MutableObject.java`
#### Snippet
```java
     * Required for serialization support.
     *
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 86241875189L;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java

    /**
     * Utility method for {@link #createNumber(java.lang.String)}.
     *
     * <p>This will check if the magnitude of the number is zero by checking if there
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java

    /**
     * Utility method for {@link #createNumber(java.lang.String)}.
     *
     * <p>Returns mantissa of the given number.</p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java

    /**
     * Utility method for {@link #createNumber(java.lang.String)}.
     *
     * <p>Returns {@code true} if s is {@code null} or empty.</p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
     * Required for serialization support.
     *
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 7628716375283629643L;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
     *
     * <p>
     * Unlike the {@link Class#isAssignableFrom(java.lang.Class)} method, this method takes into account widenings of
     * primitive classes and {@code null}s.
     * </p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
     *
     * <p>
     * Unlike the {@link Class#isAssignableFrom(java.lang.Class)} method, this method takes into account widenings of
     * primitive classes and {@code null}s.
     * </p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
     *
     * <p>
     * Unlike the {@link Class#isAssignableFrom(java.lang.Class)} method, this method takes into account widenings of
     * primitive classes and {@code null}s.
     * </p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
     *
     * <p>
     * Unlike the {@link Class#isAssignableFrom(java.lang.Class)} method, this method takes into account widenings of
     * primitive classes and {@code null}s.
     * </p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/builder/ToStringStyle.java`
#### Snippet
```java

    /**
     * Appends the {@link System#identityHashCode(java.lang.Object)}.
     *
     * @param buffer  the {@link StringBuffer} to populate
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/builder/ToStringStyle.java`
#### Snippet
```java
         * Required for serialization support.
         *
         * @see java.io.Serializable
         */
        private static final long serialVersionUID = 1L;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/FastDateFormat.java`
#### Snippet
```java
     * locale.
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible
     *  pattern
     * @param locale  optional locale, overrides system locale
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/FastDateFormat.java`
#### Snippet
```java
     * and locale.
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible
     *  pattern
     * @param timeZone  optional time zone, overrides time zone of
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/FastDateFormat.java`
#### Snippet
```java
/**
 * FastDateFormat is a fast and thread-safe version of
 * {@link java.text.SimpleDateFormat}.
 *
 * <p>To obtain an instance of FastDateFormat, use one of the static factory methods:
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/FastDateFormat.java`
#### Snippet
```java
     * Constructs a new FastDateFormat.
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible pattern
     * @param timeZone  non-null time zone to use
     * @param locale  non-null locale to use
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/FastDateFormat.java`
#### Snippet
```java
     * default locale.
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible
     *  pattern
     * @return a pattern based date/time formatter
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/FastDateFormat.java`
#### Snippet
```java
     * Constructs a new FastDateFormat.
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible pattern
     * @param timeZone  non-null time zone to use
     * @param locale  non-null locale to use
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/FastDateFormat.java`
#### Snippet
```java
     * Gets the pattern used by this formatter.
     *
     * @return the pattern, {@link java.text.SimpleDateFormat} compatible
     */
    @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/FastDateFormat.java`
#### Snippet
```java
     * time zone.
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible
     *  pattern
     * @param timeZone  optional time zone, overrides time zone of
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.annotation` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
     *            the {@link Class} to query
     * @param annotationCls
     *            the {@link java.lang.annotation.Annotation} that must be present on a method to be matched
     * @param searchSupers
     *            determines if a lookup in the entire inheritance hierarchy of the given class should be performed
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.annotation` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
     *            the {@link Class} to query
     * @param annotationCls
     *            the {@link java.lang.annotation.Annotation} that must be present on a method to be matched
     * @return an array of Methods (possibly empty).
     * @throws NullPointerException if the class or annotation are {@code null}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/util/FluentBitSet.java`
#### Snippet
```java
 * A fluent {@link BitSet} with additional operations.
 * <p>
 * Originally from Apache Commons VFS with more added to act as a fluent replacement for {@link java.util.BitSet}.
 * </p>
 * @since 3.13.0
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/StringEscapeUtils.java`
#### Snippet
```java
     * @return a new escaped {@link String}, {@code null} if null string input
     * @see #unescapeXml(String)
     * @deprecated use {@link #escapeXml10(java.lang.String)} or {@link #escapeXml11(java.lang.String)} instead.
     */
    @Deprecated
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/StringEscapeUtils.java`
#### Snippet
```java
     * @return a new escaped {@link String}, {@code null} if null string input
     * @see #unescapeXml(String)
     * @deprecated use {@link #escapeXml10(java.lang.String)} or {@link #escapeXml11(java.lang.String)} instead.
     */
    @Deprecated
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/FastDateParser.java`
#### Snippet
```java
/**
 * FastDateParser is a fast and thread-safe version of
 * {@link java.text.SimpleDateFormat}.
 *
 * <p>To obtain a proxy to a FastDateParser, use {@link FastDateFormat#getInstance(String, TimeZone, Locale)}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/FastDateParser.java`
#### Snippet
```java
     * Required for serialization support.
     *
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 3L;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/FastDateParser.java`
#### Snippet
```java
     * This is called from constructor and from readObject (de-serialization)
     *
     * @param definingCalendar the {@link java.util.Calendar} instance used to initialize this FastDateParser
     */
    private void init(final Calendar definingCalendar) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/FastDateParser.java`
#### Snippet
```java
     * factory methods of {@link FastDateFormat} to get a cached FastDateParser instance.
     *
     * @param pattern non-null {@link java.text.SimpleDateFormat} compatible
     *  pattern
     * @param timeZone non-null time zone to use
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/FastDateParser.java`
#### Snippet
```java
     * Constructs a new FastDateParser.
     *
     * @param pattern non-null {@link java.text.SimpleDateFormat} compatible
     *  pattern
     * @param timeZone non-null time zone to use
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/FastDateParser.java`
#### Snippet
```java
     * This implementation updates the ParsePosition if the parse succeeds.
     * However, it sets the error index to the position before the failed field unlike
     * the method {@link java.text.SimpleDateFormat#parse(String, ParsePosition)} which sets
     * the error index to after the failed field.
     * <p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.commons.lang3.time` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/FastDateParser.java`
#### Snippet
```java
     * parsed, then the index will point to just after the end of the input buffer.
     *
     * @see org.apache.commons.lang3.time.DateParser#parse(String, java.text.ParsePosition)
     */
    @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/FastDateParser.java`
#### Snippet
```java
     * parsed, then the index will point to just after the end of the input buffer.
     *
     * @see org.apache.commons.lang3.time.DateParser#parse(String, java.text.ParsePosition)
     */
    @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/reflect/ConstructorUtils.java`
#### Snippet
```java
     * @return the constructor, {@code null} if no matching accessible constructor found
     * @see Class#getConstructor
     * @see #getAccessibleConstructor(java.lang.reflect.Constructor)
     * @throws NullPointerException if {@code cls} is {@code null}
     */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/CharSet.java`
#### Snippet
```java
     * Required for serialization support. Lang version 2.0.
     *
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 5947847346149275958L;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.commons.lang3.time` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/DurationFormatUtils.java`
#### Snippet
```java
     * for the ISO 8601 period format used in durations.
     *
     * @see org.apache.commons.lang3.time.FastDateFormat
     * @see java.text.SimpleDateFormat
     */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/DurationFormatUtils.java`
#### Snippet
```java
     *
     * @see org.apache.commons.lang3.time.FastDateFormat
     * @see java.text.SimpleDateFormat
     */
    public static final String ISO_EXTENDED_FORMAT_PATTERN = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'";
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/FormatCache.java`
#### Snippet
```java
     * and locale.
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible pattern, this will not be null.
     * @param timeZone  time zone, this will not be null.
     * @param locale  locale, this will not be null.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/FormatCache.java`
#### Snippet
```java
     * and locale.
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible
     *  pattern, non-null
     * @param timeZone  the time zone, null means use the default TimeZone
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/DateUtils.java`
#### Snippet
```java
         *
         * @throws UnsupportedOperationException Always thrown.
         * @see java.util.Iterator#remove()
         */
        @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/DateUtils.java`
#### Snippet
```java
     * @throws NullPointerException if the date string or pattern array is null
     * @throws ParseException if none of the date patterns were suitable
     * @see java.util.Calendar#isLenient()
     */
    private static Date parseDateWithLeniency(final String dateStr, final Locale locale, final String[] parsePatterns,
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/DateUtils.java`
#### Snippet
```java
/**
 * A suite of utilities surrounding the use of the
 * {@link java.util.Calendar} and {@link java.util.Date} object.
 *
 * <p>DateUtils contains a lot of common methods considering manipulations
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/DateUtils.java`
#### Snippet
```java
/**
 * A suite of utilities surrounding the use of the
 * {@link java.util.Calendar} and {@link java.util.Date} object.
 *
 * <p>DateUtils contains a lot of common methods considering manipulations
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java

/**
 * Operations on {@link java.lang.String} that are
 * {@code null} safe.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * @see #replacePattern(String, String, String)
     * @see String#replaceAll(String, String)
     * @see java.util.regex.Pattern
     * @see java.util.regex.Pattern#DOTALL
     * @since 3.5
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * @see String#replaceAll(String, String)
     * @see java.util.regex.Pattern
     * @see java.util.regex.Pattern#DOTALL
     * @since 3.5
     *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     *
     * @see String#replaceFirst(String, String)
     * @see java.util.regex.Pattern
     * @see java.util.regex.Pattern#DOTALL
     * @since 3.5
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * @see String#replaceFirst(String, String)
     * @see java.util.regex.Pattern
     * @see java.util.regex.Pattern#DOTALL
     * @since 3.5
     *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * @see #replaceFirst(String, String, String)
     * @see String#replaceFirst(String, String)
     * @see java.util.regex.Pattern
     * @see java.util.regex.Pattern#DOTALL
     * @since 3.5
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * @see String#replaceFirst(String, String)
     * @see java.util.regex.Pattern
     * @see java.util.regex.Pattern#DOTALL
     * @since 3.5
     *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * @see #removePattern(String, String)
     * @see String#replaceAll(String, String)
     * @see java.util.regex.Pattern
     * @see java.util.regex.Pattern#DOTALL
     * @since 3.5
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     * @see String#replaceAll(String, String)
     * @see java.util.regex.Pattern
     * @see java.util.regex.Pattern#DOTALL
     * @since 3.5
     *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/ObjectUtils.java`
#### Snippet
```java
         * Required for serialization support. Declare serialization compatibility with Commons Lang 1.0
         *
         * @see java.io.Serializable
         */
        private static final long serialVersionUID = 7092611880189329093L;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/ObjectUtils.java`
#### Snippet
```java
     *
     * <p>For example, in a {@link HashMap} the
     * {@link java.util.HashMap#get(Object)} method returns
     * {@code null} if the {@link Map} contains {@code null} or if there
     * is no matching key. The {@code null} placeholder can be used to
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/ObjectUtils.java`
#### Snippet
```java
     *
     * <p>For example, in a {@link HashMap} the
     * {@link java.util.HashMap#get(Object)} method returns
     * {@code null} if the {@link Map} contains {@code null} or if there is
     * no matching key. The {@code null} placeholder can be used to distinguish
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/ObjectUtils.java`
#### Snippet
```java
     * @return a negative value if c1 &lt; c2, zero if c1 = c2
     *  and a positive value if c1 &gt; c2
     * @see java.util.Comparator#compare(Object, Object)
     */
    public static <T extends Comparable<? super T>> int compare(final T c1, final T c2, final boolean nullGreater) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/mutable/MutableBoolean.java`
#### Snippet
```java
     * Required for serialization support.
     *
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = -4830728138360036487L;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
     * In cases where the interface specified by {@code toClass} is
     * (indirectly) implemented more than once (e.g. where {@code toClass}
     * specifies the interface {@link java.lang.Iterable Iterable} and
     * {@code type} specifies a parameterized type that implements both
     * {@link java.util.Set Set} and {@link java.util.Collection Collection}),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
     * specifies the interface {@link java.lang.Iterable Iterable} and
     * {@code type} specifies a parameterized type that implements both
     * {@link java.util.Set Set} and {@link java.util.Collection Collection}),
     * this method will look at the inheritance hierarchy of only one of the
     * implementations/subclasses; the first interface encountered that isn't a
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
     * specifies the interface {@link java.lang.Iterable Iterable} and
     * {@code type} specifies a parameterized type that implements both
     * {@link java.util.Set Set} and {@link java.util.Collection Collection}),
     * this method will look at the inheritance hierarchy of only one of the
     * implementations/subclasses; the first interface encountered that isn't a
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
     *
     * <p>
     * Example: {@link java.util.TreeSet
     * TreeSet} sets its parameter as the parameter for
     * {@link java.util.NavigableSet NavigableSet}, which in turn sets the
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
     * parameter of {@link java.util.SortedSet}, which in turn sets the
     * parameter of {@link Set}, which in turn sets the parameter of
     * {@link java.util.Collection}, which in turn sets the parameter of
     * {@link Iterable}. Since {@link TreeSet}'s parameter maps
     * (indirectly) to {@link Iterable}'s parameter, it will be able to
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/Range.java`
#### Snippet
```java
     * Serialization version.
     *
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 1L;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.function` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/function/Failable.java`
#### Snippet
```java
 *
 * <p>
 * By replacing a {@link java.util.function.Consumer Consumer&lt;O&gt;} with a {@link FailableConsumer
 * FailableConsumer&lt;O,? extends Throwable&gt;}, this can be written like follows:
 * </p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/reflect/MemberUtils.java`
#### Snippet
```java

/**
 * Contains common code for working with {@link java.lang.reflect.Method Methods}/{@link java.lang.reflect.Constructor Constructors},
 * extracted and refactored from {@link MethodUtils} when it was imported from Commons BeanUtils.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/reflect/MemberUtils.java`
#### Snippet
```java

/**
 * Contains common code for working with {@link java.lang.reflect.Method Methods}/{@link java.lang.reflect.Constructor Constructors},
 * extracted and refactored from {@link MethodUtils} when it was imported from Commons BeanUtils.
 *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/FastDatePrinter.java`
#### Snippet
```java
     * factory methods of {@link FastDateFormat} to get a cached FastDatePrinter instance.
     *
     * @param pattern  {@link java.text.SimpleDateFormat} compatible pattern
     * @param timeZone  non-null time zone to use
     * @param locale  non-null locale to use
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/FastDatePrinter.java`
#### Snippet
```java
     * Required for serialization support.
     *
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 1L;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.text` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/FastDatePrinter.java`
#### Snippet
```java
/**
 * FastDatePrinter is a fast and thread-safe version of
 * {@link java.text.SimpleDateFormat}.
 *
 * <p>To obtain a FastDatePrinter, use {@link FastDateFormat#getInstance(String, TimeZone, Locale)}
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/TimeZones.java`
#### Snippet
```java

/**
 * Helps to deal with {@link java.util.TimeZone}s.
 *
 * @since 3.7
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/TimeZones.java`
#### Snippet
```java

    /**
     * A public version of {@link java.util.TimeZone}'s package private {@code GMT_ID} field.
     */
    public static final String GMT_ID = "GMT";
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.commons.lang3.time` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/time/DateFormatUtils.java`
#### Snippet
```java
 *
 * <p>Formatting is performed using the thread-safe
 * {@link org.apache.commons.lang3.time.FastDateFormat} class.</p>
 *
 * <p>Note that the JDK has a bug wherein calling Calendar.get(int) will
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.function` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
 *
 * <p>
 * By replacing a {@link java.util.function.Consumer Consumer&lt;O&gt;} with a {@link FailableConsumer
 * FailableConsumer&lt;O,? extends Throwable&gt;}, this can be written like follows:
 * </p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.commons.lang3.function` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java
 * </p>
 * @since 3.9
 * @deprecated Use {@link org.apache.commons.lang3.function.Failable}.
 */
@Deprecated
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/Functions.java`
#### Snippet
```java

    /**
     * A functional interface like {@link java.util.concurrent.Callable} that declares a {@link Throwable}.
     *
     * <p>TODO for 4.0: Move to org.apache.commons.lang3.function.</p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/exception/ExceptionUtils.java`
#### Snippet
```java
     *
     * <p>The result of this method vary by JDK version as this method
     * uses {@link Throwable#printStackTrace(java.io.PrintWriter)}.
     * On JDK1.3 and earlier, the cause exception will not be shown
     * unless the specified throwable alters printStackTrace.</p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/exception/ExceptionUtils.java`
#### Snippet
```java
     *
     * <p>The result of this method vary by JDK version as this method
     * uses {@link Throwable#printStackTrace(java.io.PrintWriter)}.
     * On JDK1.3 and earlier, the cause exception will not be shown
     * unless the specified throwable alters printStackTrace.</p>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

    /**
     * Converts the given array into a {@link java.util.Map}. Each element of the array
     * must be either a {@link java.util.Map.Entry} or an Array, containing at least two
     * elements, where the first element is used as key and the second as
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    /**
     * Converts the given array into a {@link java.util.Map}. Each element of the array
     * must be either a {@link java.util.Map.Entry} or an Array, containing at least two
     * elements, where the first element is used as key and the second as
     * value.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     * </p>
     *
     * @param array  an array whose elements are either a {@link java.util.Map.Entry} or
     *  an Array containing at least two elements, may be {@code null}
     * @return a {@link Map} that was created from the array
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     *  itself an Array containing less than two elements
     * @throws IllegalArgumentException  if the array contains elements other
     *  than {@link java.util.Map.Entry} and an Array
     */
    public static Map<Object, Object> toMap(final Object[] array) {
```

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
            ensureCapacity(size + 1);
            int read;
            while ((read = r.read(buffer, size, buffer.length - size)) != -1) {
                size += read;
                ensureCapacity(size + 1);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java`
#### Snippet
```java
                while (pos < bufEnd) {
                    if (substitutionInVariablesEnabled
                            && (endMatchLen = pfxMatcher.isMatch(chars,
                                    pos, offset, bufEnd)) != 0) {
                        // found a nested variable start
                        nestedVarCount++;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java`
#### Snippet
```java
                                        break;
                                    }
                                    if ((valueDelimiterMatchLen = valueDelimMatcher.isMatch(varNameExprChars, i)) != 0) {
                                        varName = varNameExpr.substring(0, i);
                                        varDefaultValue = varNameExpr.substring(i + valueDelimiterMatchLen);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        int count = 0;
        int idx = 0;
        while ((idx = CharSequenceUtils.indexOf(str, sub, idx)) != INDEX_NOT_FOUND) {
            count++;
            idx += sub.length();
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/org/apache/commons/lang3/concurrent/LazyInitializer.java`
#### Snippet
```java
                result = object;
                if (result == NO_INIT) {
                    object = result = initialize();
                }
            }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/org/apache/commons/lang3/concurrent/AtomicSafeInitializer.java`
#### Snippet
```java
        T result;

        while ((result = reference.get()) == null) {
            if (factory.compareAndSet(null, this)) {
                reference.set(initialize());
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/org/apache/commons/lang3/concurrent/BackgroundInitializer.java`
#### Snippet
```java
            executor = getExternalExecutor();
            if (executor == null) {
                executor = tempExec = createExecutor();
            } else {
                tempExec = null;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        int count;
        int set;
        while ((set = indices.nextSetBit(srcIndex)) != -1) {
            count = set - srcIndex;
            if (count > 0) {
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`current = (char) (current + 1)` could be simplified to 'current += 1'
in `src/main/java/org/apache/commons/lang3/CharRange.java`
#### Snippet
```java
                    }
                } else {
                    current = (char) (current + 1);
                }
            } else if (current < range.end) {
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`current = (char) (current + 1)` could be simplified to 'current += 1'
in `src/main/java/org/apache/commons/lang3/CharRange.java`
#### Snippet
```java
                }
            } else if (current < range.end) {
                current = (char) (current + 1);
            } else {
                hasNext = false;
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`answer = answer + 2` could be simplified to 'answer += 2'
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
                answer++;
            } else {
                answer = answer + 2;
            }
        }
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`iTotal = iTotal * iConstant` could be simplified to 'iTotal \*= iConstant'
in `src/main/java/org/apache/commons/lang3/builder/HashCodeBuilder.java`
#### Snippet
```java
    public HashCodeBuilder append(final byte[] array) {
        if (array == null) {
            iTotal = iTotal * iConstant;
        } else {
            for (final byte element : array) {
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`iTotal = iTotal * iConstant` could be simplified to 'iTotal \*= iConstant'
in `src/main/java/org/apache/commons/lang3/builder/HashCodeBuilder.java`
#### Snippet
```java
    public HashCodeBuilder append(final Object[] array) {
        if (array == null) {
            iTotal = iTotal * iConstant;
        } else {
            for (final Object element : array) {
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`iTotal = iTotal * iConstant` could be simplified to 'iTotal \*= iConstant'
in `src/main/java/org/apache/commons/lang3/builder/HashCodeBuilder.java`
#### Snippet
```java
    public HashCodeBuilder append(final boolean[] array) {
        if (array == null) {
            iTotal = iTotal * iConstant;
        } else {
            for (final boolean element : array) {
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`iTotal = iTotal * iConstant` could be simplified to 'iTotal \*= iConstant'
in `src/main/java/org/apache/commons/lang3/builder/HashCodeBuilder.java`
#### Snippet
```java
    public HashCodeBuilder append(final short[] array) {
        if (array == null) {
            iTotal = iTotal * iConstant;
        } else {
            for (final short element : array) {
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`iTotal = iTotal * iConstant` could be simplified to 'iTotal \*= iConstant'
in `src/main/java/org/apache/commons/lang3/builder/HashCodeBuilder.java`
#### Snippet
```java
    public HashCodeBuilder append(final long[] array) {
        if (array == null) {
            iTotal = iTotal * iConstant;
        } else {
            for (final long element : array) {
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`iTotal = iTotal * iConstant` could be simplified to 'iTotal \*= iConstant'
in `src/main/java/org/apache/commons/lang3/builder/HashCodeBuilder.java`
#### Snippet
```java
    public HashCodeBuilder append(final int[] array) {
        if (array == null) {
            iTotal = iTotal * iConstant;
        } else {
            for (final int element : array) {
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`iTotal = iTotal * iConstant` could be simplified to 'iTotal \*= iConstant'
in `src/main/java/org/apache/commons/lang3/builder/HashCodeBuilder.java`
#### Snippet
```java
    public HashCodeBuilder append(final Object object) {
        if (object == null) {
            iTotal = iTotal * iConstant;

        } else if (ObjectUtils.isArray(object)) {
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`iTotal = iTotal * iConstant` could be simplified to 'iTotal \*= iConstant'
in `src/main/java/org/apache/commons/lang3/builder/HashCodeBuilder.java`
#### Snippet
```java
    public HashCodeBuilder append(final float[] array) {
        if (array == null) {
            iTotal = iTotal * iConstant;
        } else {
            for (final float element : array) {
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`iTotal = iTotal * iConstant` could be simplified to 'iTotal \*= iConstant'
in `src/main/java/org/apache/commons/lang3/builder/HashCodeBuilder.java`
#### Snippet
```java
    public HashCodeBuilder append(final double[] array) {
        if (array == null) {
            iTotal = iTotal * iConstant;
        } else {
            for (final double element : array) {
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`iTotal = iTotal * iConstant` could be simplified to 'iTotal \*= iConstant'
in `src/main/java/org/apache/commons/lang3/builder/HashCodeBuilder.java`
#### Snippet
```java
    public HashCodeBuilder append(final char[] array) {
        if (array == null) {
            iTotal = iTotal * iConstant;
        } else {
            for (final char element : array) {
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`milliseconds = milliseconds - (days * DateUtils.MILLIS_PER_DAY)` could be simplified to 'milliseconds -= (days \* DateUtils.MILLIS_PER_DAY)'
in `src/main/java/org/apache/commons/lang3/time/DurationFormatUtils.java`
#### Snippet
```java
        if (Token.containsTokenWithValue(tokens, d)) {
            days = milliseconds / DateUtils.MILLIS_PER_DAY;
            milliseconds = milliseconds - (days * DateUtils.MILLIS_PER_DAY);
        }
        if (Token.containsTokenWithValue(tokens, H)) {
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`milliseconds = milliseconds - (hours * DateUtils.MILLIS_PER_HOUR)` could be simplified to 'milliseconds -= (hours \* DateUtils.MILLIS_PER_HOUR)'
in `src/main/java/org/apache/commons/lang3/time/DurationFormatUtils.java`
#### Snippet
```java
        if (Token.containsTokenWithValue(tokens, H)) {
            hours = milliseconds / DateUtils.MILLIS_PER_HOUR;
            milliseconds = milliseconds - (hours * DateUtils.MILLIS_PER_HOUR);
        }
        if (Token.containsTokenWithValue(tokens, m)) {
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`milliseconds = milliseconds - (minutes * DateUtils.MILLIS_PER_MINUTE)` could be simplified to 'milliseconds -= (minutes \* DateUtils.MILLIS_PER_MINUTE)'
in `src/main/java/org/apache/commons/lang3/time/DurationFormatUtils.java`
#### Snippet
```java
        if (Token.containsTokenWithValue(tokens, m)) {
            minutes = milliseconds / DateUtils.MILLIS_PER_MINUTE;
            milliseconds = milliseconds - (minutes * DateUtils.MILLIS_PER_MINUTE);
        }
        if (Token.containsTokenWithValue(tokens, s)) {
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`milliseconds = milliseconds - (seconds * DateUtils.MILLIS_PER_SECOND)` could be simplified to 'milliseconds -= (seconds \* DateUtils.MILLIS_PER_SECOND)'
in `src/main/java/org/apache/commons/lang3/time/DurationFormatUtils.java`
#### Snippet
```java
        if (Token.containsTokenWithValue(tokens, s)) {
            seconds = milliseconds / DateUtils.MILLIS_PER_SECOND;
            milliseconds = milliseconds - (seconds * DateUtils.MILLIS_PER_SECOND);
        }

```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`time = time - millisecs` could be simplified to 'time -= millisecs'
in `src/main/java/org/apache/commons/lang3/time/DateUtils.java`
#### Snippet
```java
        final int millisecs = val.get(Calendar.MILLISECOND);
        if (ModifyType.TRUNCATE == modType || millisecs < 500) {
            time = time - millisecs;
        }
        if (field == Calendar.SECOND) {
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`time = time - (seconds * 1000L)` could be simplified to 'time -= (seconds \* 1000L)'
in `src/main/java/org/apache/commons/lang3/time/DateUtils.java`
#### Snippet
```java
        final int seconds = val.get(Calendar.SECOND);
        if (!done && (ModifyType.TRUNCATE == modType || seconds < 30)) {
            time = time - (seconds * 1000L);
        }
        if (field == Calendar.MINUTE) {
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`time = time - (minutes * 60000L)` could be simplified to 'time -= (minutes \* 60000L)'
in `src/main/java/org/apache/commons/lang3/time/DateUtils.java`
#### Snippet
```java
        final int minutes = val.get(Calendar.MINUTE);
        if (!done && (ModifyType.TRUNCATE == modType || minutes < 30)) {
            time = time - (minutes * 60000L);
        }

```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`value = value / 10` could be simplified to 'value /= 10'
in `src/main/java/org/apache/commons/lang3/time/FastDatePrinter.java`
#### Snippet
```java
            while (value != 0) {
                work[digit++] = (char) (value % 10 + '0');
                value = value / 10;
            }

```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractCircuitBreaker()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/lang3/concurrent/AbstractCircuitBreaker.java`
#### Snippet
```java
     * Creates an {@link AbstractCircuitBreaker}. It also creates an internal {@link PropertyChangeSupport}.
     */
    public AbstractCircuitBreaker() {
        changeSupport = new PropertyChangeSupport(this);
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractFutureProxy()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/lang3/concurrent/AbstractFutureProxy.java`
#### Snippet
```java
     * @param future the delegate.
     */
    public AbstractFutureProxy(final Future<V> future) {
        this.future = Objects.requireNonNull(future, "future");
    }
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `pos`
in `src/main/java/org/apache/commons/lang3/text/StrMatcher.java`
#### Snippet
```java
                return 0;
            }
            for (int i = 0; i < chars.length; i++, pos++) {
                if (chars[i] != buffer[pos]) {
                    return 0;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `start`
in `src/main/java/org/apache/commons/lang3/CharRange.java`
#### Snippet
```java
        if (start > end) {
            final char temp = start;
            start = end;
            end = temp;
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `end`
in `src/main/java/org/apache/commons/lang3/CharRange.java`
#### Snippet
```java
            final char temp = start;
            start = end;
            end = temp;
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `tok`
in `src/main/java/org/apache/commons/lang3/text/StrTokenizer.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrTokenizer.java`
#### Snippet
```java
                break;
            }
            start += removeLen;
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `style`
in `src/main/java/org/apache/commons/lang3/builder/ToStringBuilder.java`
#### Snippet
```java
    public ToStringBuilder(final Object object, ToStringStyle style, StringBuffer buffer) {
        if (style == null) {
            style = getDefaultStyle();
        }
        if (buffer == null) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `buffer`
in `src/main/java/org/apache/commons/lang3/builder/ToStringBuilder.java`
#### Snippet
```java
        }
        if (buffer == null) {
            buffer = new StringBuffer(512);
        }
        this.buffer = buffer;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/lang3/math/Fraction.java`
#### Snippet
```java
        if (pos > 0) {
            final int whole = Integer.parseInt(str.substring(0, pos));
            str = str.substring(pos + 1);
            pos = str.indexOf('/');
            if (pos < 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/lang3/math/Fraction.java`
#### Snippet
```java
    public static Fraction getFraction(double value) {
        final int sign = value < 0 ? -1 : 1;
        value = Math.abs(value);
        if (value > Integer.MAX_VALUE || Double.isNaN(value)) {
            throw new ArithmeticException("The value must not be greater than Integer.MAX_VALUE or NaN");
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/lang3/math/Fraction.java`
#### Snippet
```java
        }
        final int wholeNumber = (int) value;
        value -= wholeNumber;

        int numer0 = 0; // the pre-previous
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `numerator`
in `src/main/java/org/apache/commons/lang3/math/Fraction.java`
#### Snippet
```java
        // allow 2^k/-2^31 as a valid fraction (where k>0)
        if (denominator == Integer.MIN_VALUE && (numerator & 1) == 0) {
            numerator /= 2;
            denominator /= 2;
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `denominator`
in `src/main/java/org/apache/commons/lang3/math/Fraction.java`
#### Snippet
```java
        if (denominator == Integer.MIN_VALUE && (numerator & 1) == 0) {
            numerator /= 2;
            denominator /= 2;
        }
        if (denominator < 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `numerator`
in `src/main/java/org/apache/commons/lang3/math/Fraction.java`
#### Snippet
```java
                throw new ArithmeticException("overflow: can't negate");
            }
            numerator = -numerator;
            denominator = -denominator;
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `denominator`
in `src/main/java/org/apache/commons/lang3/math/Fraction.java`
#### Snippet
```java
            }
            numerator = -numerator;
            denominator = -denominator;
        }
        // simplify fraction.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `numerator`
in `src/main/java/org/apache/commons/lang3/math/Fraction.java`
#### Snippet
```java
        // simplify fraction.
        final int gcd = greatestCommonDivisor(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        return new Fraction(numerator, denominator);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `denominator`
in `src/main/java/org/apache/commons/lang3/math/Fraction.java`
#### Snippet
```java
        final int gcd = greatestCommonDivisor(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        return new Fraction(numerator, denominator);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `u`
in `src/main/java/org/apache/commons/lang3/math/Fraction.java`
#### Snippet
```java
        // overflow)
        if (u > 0) {
            u = -u;
        } // make u negative
        if (v > 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `v`
in `src/main/java/org/apache/commons/lang3/math/Fraction.java`
#### Snippet
```java
        } // make u negative
        if (v > 0) {
            v = -v;
        } // make v negative
        // B1. [Find power of 2]
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `u`
in `src/main/java/org/apache/commons/lang3/math/Fraction.java`
#### Snippet
```java
        int k = 0;
        while ((u & 1) == 0 && (v & 1) == 0 && k < 31) { // while u and v are both even...
            u /= 2;
            v /= 2;
            k++; // cast out twos.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `v`
in `src/main/java/org/apache/commons/lang3/math/Fraction.java`
#### Snippet
```java
        while ((u & 1) == 0 && (v & 1) == 0 && k < 31) { // while u and v are both even...
            u /= 2;
            v /= 2;
            k++; // cast out twos.
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `u`
in `src/main/java/org/apache/commons/lang3/math/Fraction.java`
#### Snippet
```java
            // B5 [reset max(u,v)]
            if (t > 0) {
                u = -t;
            } else {
                v = t;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `v`
in `src/main/java/org/apache/commons/lang3/math/Fraction.java`
#### Snippet
```java
                u = -t;
            } else {
                v = t;
            }
            // B6/B3. at this point both u and v should be odd.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `numerator`
in `src/main/java/org/apache/commons/lang3/math/Fraction.java`
#### Snippet
```java
                throw new ArithmeticException("overflow: can't negate");
            }
            numerator = -numerator;
            denominator = -denominator;
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `denominator`
in `src/main/java/org/apache/commons/lang3/math/Fraction.java`
#### Snippet
```java
            }
            numerator = -numerator;
            denominator = -denominator;
        }
        return new Fraction(numerator, denominator);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `newLineStr`
in `src/main/java/org/apache/commons/lang3/text/WordUtils.java`
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
in `src/main/java/org/apache/commons/lang3/text/WordUtils.java`
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
in `src/main/java/org/apache/commons/lang3/text/WordUtils.java`
#### Snippet
```java
        }
        if (StringUtils.isBlank(wrapOn)) {
            wrapOn = " ";
        }
        final Pattern patternToWrapOn = Pattern.compile(wrapOn);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `context`
in `src/main/java/org/apache/commons/lang3/exception/ContextedException.java`
#### Snippet
```java
        super(message, cause);
        if (context == null) {
            context = new DefaultExceptionContext();
        }
        exceptionContext = context;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static byte min(byte a, final byte b, final byte c) {
        if (b < a) {
            a = b;
        }
        if (c < a) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
        }
        if (c < a) {
            a = c;
        }
        return a;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static int max(int a, final int b, final int c) {
        if (b > a) {
            a = b;
        }
        if (c > a) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
        }
        if (c > a) {
            a = c;
        }
        return a;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static int min(int a, final int b, final int c) {
        if (b < a) {
            a = b;
        }
        if (c < a) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
        }
        if (c < a) {
            a = c;
        }
        return a;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static byte max(byte a, final byte b, final byte c) {
        if (b > a) {
            a = b;
        }
        if (c > a) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
        }
        if (c > a) {
            a = c;
        }
        return a;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static long max(long a, final long b, final long c) {
        if (b > a) {
            a = b;
        }
        if (c > a) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
        }
        if (c > a) {
            a = c;
        }
        return a;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static long min(long a, final long b, final long c) {
        if (b < a) {
            a = b;
        }
        if (c < a) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
        }
        if (c < a) {
            a = c;
        }
        return a;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static short min(short a, final short b, final short c) {
        if (b < a) {
            a = b;
        }
        if (c < a) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
        }
        if (c < a) {
            a = c;
        }
        return a;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static short max(short a, final short b, final short c) {
        if (b > a) {
            a = b;
        }
        if (c > a) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
        }
        if (c > a) {
            a = c;
        }
        return a;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndex`
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
     */
    public String substring(final int startIndex, int endIndex) {
        endIndex = validateRange(startIndex, endIndex);
        return new String(buffer, startIndex, endIndex - startIndex);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
            final StrMatcher matcher, final String replaceStr,
            final int startIndex, int endIndex, final int replaceCount) {
        endIndex = validateRange(startIndex, endIndex);
        return replaceImpl(matcher, replaceStr, startIndex, endIndex, replaceCount);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
            buffer[index++] = 'a';
            buffer[index++] = 'l';
            buffer[index++] = 's';
            buffer[index] = 'e';
            size += 5;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `n`
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
        public long skip(long n) {
            if (pos + n > StrBuilder.this.size()) {
                n = StrBuilder.this.size() - pos;
            }
            if (n < 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
        validateIndex(index);
        if (str == null) {
            str = nullText;
        }
        if (str != null) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `to`
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
     */
    public int lastIndexOf(final char ch, int startIndex) {
        startIndex = startIndex >= size ? size - 1 : startIndex;
        if (startIndex < 0) {
            return -1;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
     */
    public int indexOf(final StrMatcher matcher, int startIndex) {
        startIndex = Math.max(startIndex, 0);
        if (matcher == null || startIndex >= size) {
            return -1;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndex`
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
     */
    public char[] toCharArray(final int startIndex, int endIndex) {
        endIndex = validateRange(startIndex, endIndex);
        final int len = endIndex - startIndex;
        if (len == 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndex`
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
        }
        if (endIndex > size) {
            endIndex = size;
        }
        if (startIndex > endIndex) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
     */
    public int indexOf(final char ch, int startIndex) {
        startIndex = Math.max(startIndex, 0);
        if (startIndex >= size) {
            return -1;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndex`
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
     */
    public StrBuilder replace(final int startIndex, int endIndex, final String replaceStr) {
        endIndex = validateRange(startIndex, endIndex);
        final int insertLen = StringUtils.length(replaceStr);
        replaceImpl(startIndex, endIndex, endIndex - startIndex, replaceStr, insertLen);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
     */
    public int lastIndexOf(final StrMatcher matcher, int startIndex) {
        startIndex = startIndex >= size ? size - 1 : startIndex;
        if (matcher == null || startIndex < 0) {
            return -1;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `nullText`
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
    public StrBuilder setNullText(String nullText) {
        if (StringUtils.isEmpty(nullText)) {
            nullText = null;
        }
        this.nullText = nullText;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `destination`
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
        final int len = length();
        if (destination == null || destination.length < len) {
            destination = new char[len];
        }
        System.arraycopy(buffer, 0, destination, 0, len);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `initialCapacity`
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
    public StrBuilder(int initialCapacity) {
        if (initialCapacity <= 0) {
            initialCapacity = CAPACITY;
        }
        buffer = new char[initialCapacity];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndex`
in `src/main/java/org/apache/commons/lang3/text/StrBuilder.java`
#### Snippet
```java
     */
    public StrBuilder delete(final int startIndex, int endIndex) {
        endIndex = validateRange(startIndex, endIndex);
        final int len = endIndex - startIndex;
        if (len > 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `priorVariables`
in `src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java`
#### Snippet
```java
                            // on the first call initialize priorVariables
                            if (priorVariables == null) {
                                priorVariables = new ArrayList<>();
                                priorVariables.add(new String(chars,
                                        offset, length));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `cls`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
            }

            cls = cls.getSuperclass();
        }
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `className`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
        if (className.startsWith("[")) {
            while (className.charAt(0) == '[') {
                className = className.substring(1);
                arrayPrefix.append("[]");
            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `className`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
            // Strip Object type encoding
            if (className.charAt(0) == 'L' && className.charAt(className.length() - 1) == ';') {
                className = className.substring(1, className.length() - 1);
            }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `className`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java

            if (reverseAbbreviationMap.containsKey(className)) {
                className = reverseAbbreviationMap.get(className);
            }
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `cls`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
        if (autoboxing) {
            if (cls.isPrimitive() && !toClass.isPrimitive()) {
                cls = primitiveToWrapper(cls);
                if (cls == null) {
                    return false;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `cls`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
            }
            if (toClass.isPrimitive() && !cls.isPrimitive()) {
                cls = wrapperToPrimitive(cls);
                if (cls == null) {
                    return false;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `className`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
        // Strip array encoding
        while (className.charAt(0) == '[') {
            className = className.substring(1);
        }
        // Strip Object type encoding
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `className`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
        // Strip Object type encoding
        if (className.charAt(0) == 'L' && className.charAt(className.length() - 1) == ';') {
            className = className.substring(1);
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `classArray`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
        }
        if (classArray == null) {
            classArray = ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        if (toClassArray == null) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `toClassArray`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
        }
        if (toClassArray == null) {
            toClassArray = ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        for (int i = 0; i < classArray.length; i++) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `className`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
     */
    private static String getCanonicalName(String className) {
        className = StringUtils.deleteWhitespace(className);
        if (className == null) {
            return null;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `className`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
        while (className.startsWith("[")) {
            dim++;
            className = className.substring(1);
        }
        if (dim < 1) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `className`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
        }
        if (className.startsWith("L")) {
            className = className.substring(1, className.endsWith(";") ? className.length() - 1 : className.length());
        } else if (!className.isEmpty()) {
            className = reverseAbbreviationMap.get(className.substring(0, 1));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `className`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
            className = className.substring(1, className.endsWith(";") ? className.length() - 1 : className.length());
        } else if (!className.isEmpty()) {
            className = reverseAbbreviationMap.get(className.substring(0, 1));
        }
        final StringBuilder canonicalClassNameBuffer = new StringBuilder(className);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `sizeEndText`
in `src/main/java/org/apache/commons/lang3/builder/ToStringStyle.java`
#### Snippet
```java
    protected void setSizeEndText(String sizeEndText) {
        if (sizeEndText == null) {
            sizeEndText = StringUtils.EMPTY;
        }
        this.sizeEndText = sizeEndText;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `fieldSeparator`
in `src/main/java/org/apache/commons/lang3/builder/ToStringStyle.java`
#### Snippet
```java
    protected void setFieldSeparator(String fieldSeparator) {
        if (fieldSeparator == null) {
            fieldSeparator = StringUtils.EMPTY;
        }
        this.fieldSeparator = fieldSeparator;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `nullText`
in `src/main/java/org/apache/commons/lang3/builder/ToStringStyle.java`
#### Snippet
```java
    protected void setNullText(String nullText) {
        if (nullText == null) {
            nullText = StringUtils.EMPTY;
        }
        this.nullText = nullText;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `arraySeparator`
in `src/main/java/org/apache/commons/lang3/builder/ToStringStyle.java`
#### Snippet
```java
    protected void setArraySeparator(String arraySeparator) {
        if (arraySeparator == null) {
            arraySeparator = StringUtils.EMPTY;
        }
        this.arraySeparator = arraySeparator;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `contentEnd`
in `src/main/java/org/apache/commons/lang3/builder/ToStringStyle.java`
#### Snippet
```java
    protected void setContentEnd(String contentEnd) {
        if (contentEnd == null) {
            contentEnd = StringUtils.EMPTY;
        }
        this.contentEnd = contentEnd;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `summaryObjectStartText`
in `src/main/java/org/apache/commons/lang3/builder/ToStringStyle.java`
#### Snippet
```java
    protected void setSummaryObjectStartText(String summaryObjectStartText) {
        if (summaryObjectStartText == null) {
            summaryObjectStartText = StringUtils.EMPTY;
        }
        this.summaryObjectStartText = summaryObjectStartText;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `fieldNameValueSeparator`
in `src/main/java/org/apache/commons/lang3/builder/ToStringStyle.java`
#### Snippet
```java
    protected void setFieldNameValueSeparator(String fieldNameValueSeparator) {
        if (fieldNameValueSeparator == null) {
            fieldNameValueSeparator = StringUtils.EMPTY;
        }
        this.fieldNameValueSeparator = fieldNameValueSeparator;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `sizeStartText`
in `src/main/java/org/apache/commons/lang3/builder/ToStringStyle.java`
#### Snippet
```java
    protected void setSizeStartText(String sizeStartText) {
        if (sizeStartText == null) {
            sizeStartText = StringUtils.EMPTY;
        }
        this.sizeStartText = sizeStartText;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `arrayStart`
in `src/main/java/org/apache/commons/lang3/builder/ToStringStyle.java`
#### Snippet
```java
    protected void setArrayStart(String arrayStart) {
        if (arrayStart == null) {
            arrayStart = StringUtils.EMPTY;
        }
        this.arrayStart = arrayStart;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `contentStart`
in `src/main/java/org/apache/commons/lang3/builder/ToStringStyle.java`
#### Snippet
```java
    protected void setContentStart(String contentStart) {
        if (contentStart == null) {
            contentStart = StringUtils.EMPTY;
        }
        this.contentStart = contentStart;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `arrayEnd`
in `src/main/java/org/apache/commons/lang3/builder/ToStringStyle.java`
#### Snippet
```java
    protected void setArrayEnd(String arrayEnd) {
        if (arrayEnd == null) {
            arrayEnd = StringUtils.EMPTY;
        }
        this.arrayEnd = arrayEnd;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `summaryObjectEndText`
in `src/main/java/org/apache/commons/lang3/builder/ToStringStyle.java`
#### Snippet
```java
    protected void setSummaryObjectEndText(String summaryObjectEndText) {
        if (summaryObjectEndText == null) {
            summaryObjectEndText = StringUtils.EMPTY;
        }
        this.summaryObjectEndText = summaryObjectEndText;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
        if (method.isVarArgs()) {
            final Class<?>[] methodParameterTypes = method.getParameterTypes();
            args = getVarArgs(args, methodParameterTypes);
        }
        return args;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
            Object... args) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {
        args = ArrayUtils.nullToEmpty(args);
        return invokeMethod(object, forceAccess, methodName, args, ClassUtils.toClass(args));
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
            Object... args) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {
        args = ArrayUtils.nullToEmpty(args);
        return invokeExactStaticMethod(cls, methodName, args, ClassUtils.toClass(args));
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
            throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException {
        args = ArrayUtils.nullToEmpty(args);
        parameterTypes = ArrayUtils.nullToEmpty(parameterTypes);
        final Method method = getMatchingAccessibleMethod(cls, methodName,
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `parameterTypes`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
            InvocationTargetException {
        args = ArrayUtils.nullToEmpty(args);
        parameterTypes = ArrayUtils.nullToEmpty(parameterTypes);
        final Method method = getMatchingAccessibleMethod(cls, methodName,
                parameterTypes);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
                    + methodName + "() on class: " + cls.getName());
        }
        args = toVarArgs(method, args);
        return method.invoke(null, args);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `method`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java

        // Check the implemented interfaces and subinterfaces
        method = getAccessibleMethodFromInterfaceNest(cls, methodName,
                parameterTypes);

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `method`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
        // Check the superclass chain
        if (method == null) {
            method = getAccessibleMethodFromSuperclass(cls, methodName,
                    parameterTypes);
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `parameterTypes`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
        throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Objects.requireNonNull(object, "object");
        parameterTypes = ArrayUtils.nullToEmpty(parameterTypes);
        args = ArrayUtils.nullToEmpty(args);

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
        Objects.requireNonNull(object, "object");
        parameterTypes = ArrayUtils.nullToEmpty(parameterTypes);
        args = ArrayUtils.nullToEmpty(args);

        final String messagePrefix;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
            throw new NoSuchMethodException(messagePrefix + methodName + "() on object: " + cls.getName());
        }
        args = toVarArgs(method, args);

        return method.invoke(object, args);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
            Object... args) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {
        args = ArrayUtils.nullToEmpty(args);
        return invokeStaticMethod(cls, methodName, args, ClassUtils.toClass(args));
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
            throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException {
        args = ArrayUtils.nullToEmpty(args);
        parameterTypes = ArrayUtils.nullToEmpty(parameterTypes);
        final Method method = getAccessibleMethod(cls, methodName, parameterTypes);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `parameterTypes`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
            InvocationTargetException {
        args = ArrayUtils.nullToEmpty(args);
        parameterTypes = ArrayUtils.nullToEmpty(parameterTypes);
        final Method method = getAccessibleMethod(cls, methodName, parameterTypes);
        if (method == null) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
            Object... args) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {
        args = ArrayUtils.nullToEmpty(args);
        return invokeExactMethod(object, methodName, args, ClassUtils.toClass(args));
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `cls`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
            final String methodName, final Class<?>... parameterTypes) {
        // Search up the superclass chain
        for (; cls != null; cls = cls.getSuperclass()) {

            // Check the implemented interfaces of the parent class
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
        throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Objects.requireNonNull(object, "object");
        args = ArrayUtils.nullToEmpty(args);
        parameterTypes = ArrayUtils.nullToEmpty(parameterTypes);
        final Class<?> cls = object.getClass();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `parameterTypes`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
        Objects.requireNonNull(object, "object");
        args = ArrayUtils.nullToEmpty(args);
        parameterTypes = ArrayUtils.nullToEmpty(parameterTypes);
        final Class<?> cls = object.getClass();
        final Method method = getAccessibleMethod(cls, methodName, parameterTypes);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
            Object... args) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {
        args = ArrayUtils.nullToEmpty(args);
        return invokeMethod(object, methodName, args, ClassUtils.toClass(args));
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `end`
in `src/main/java/org/apache/commons/lang3/RandomStringUtils.java`
#### Snippet
```java
        if (start == 0 && end == 0) {
            if (chars != null) {
                end = chars.length;
            } else if (!letters && !numbers) {
                end = Character.MAX_CODE_POINT;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `end`
in `src/main/java/org/apache/commons/lang3/RandomStringUtils.java`
#### Snippet
```java
                end = chars.length;
            } else if (!letters && !numbers) {
                end = Character.MAX_CODE_POINT;
            } else {
                end = 'z' + 1;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `end`
in `src/main/java/org/apache/commons/lang3/RandomStringUtils.java`
#### Snippet
```java
                end = Character.MAX_CODE_POINT;
            } else {
                end = 'z' + 1;
                start = ' ';
            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `start`
in `src/main/java/org/apache/commons/lang3/RandomStringUtils.java`
#### Snippet
```java
            } else {
                end = 'z' + 1;
                start = ' ';
            }
        } else if (end <= start) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `count`
in `src/main/java/org/apache/commons/lang3/RandomStringUtils.java`
#### Snippet
```java
        final int gap = end - start;

        while (count-- != 0) {
            final int codePoint;
            if (chars == null) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `count`
in `src/main/java/org/apache/commons/lang3/RandomStringUtils.java`
#### Snippet
```java
                case Character.PRIVATE_USE:
                case Character.SURROGATE:
                    count++;
                    continue;
                }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `count`
in `src/main/java/org/apache/commons/lang3/RandomStringUtils.java`
#### Snippet
```java
            final int numberOfChars = Character.charCount(codePoint);
            if (count == 0 && numberOfChars > 1) {
                count++;
                continue;
            }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `count`
in `src/main/java/org/apache/commons/lang3/RandomStringUtils.java`
#### Snippet
```java

                if (numberOfChars == 2) {
                    count--;
                }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `count`
in `src/main/java/org/apache/commons/lang3/RandomStringUtils.java`
#### Snippet
```java

            } else {
                count++;
            }
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `context`
in `src/main/java/org/apache/commons/lang3/exception/ContextedRuntimeException.java`
#### Snippet
```java
        super(message, cause);
        if (context == null) {
            context = new DefaultExceptionContext();
        }
        exceptionContext = context;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/lang3/reflect/ConstructorUtils.java`
#### Snippet
```java
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {
        args = ArrayUtils.nullToEmpty(args);
        parameterTypes = ArrayUtils.nullToEmpty(parameterTypes);
        final Constructor<T> ctor = getMatchingAccessibleConstructor(cls, parameterTypes);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `parameterTypes`
in `src/main/java/org/apache/commons/lang3/reflect/ConstructorUtils.java`
#### Snippet
```java
            InstantiationException {
        args = ArrayUtils.nullToEmpty(args);
        parameterTypes = ArrayUtils.nullToEmpty(parameterTypes);
        final Constructor<T> ctor = getMatchingAccessibleConstructor(cls, parameterTypes);
        if (ctor == null) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/lang3/reflect/ConstructorUtils.java`
#### Snippet
```java
        if (ctor.isVarArgs()) {
            final Class<?>[] methodParameterTypes = ctor.getParameterTypes();
            args = MethodUtils.getVarArgs(args, methodParameterTypes);
        }
        return ctor.newInstance(args);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/lang3/reflect/ConstructorUtils.java`
#### Snippet
```java
            Class<?>[] parameterTypes) throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        args = ArrayUtils.nullToEmpty(args);
        parameterTypes = ArrayUtils.nullToEmpty(parameterTypes);
        final Constructor<T> ctor = getAccessibleConstructor(cls, parameterTypes);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `parameterTypes`
in `src/main/java/org/apache/commons/lang3/reflect/ConstructorUtils.java`
#### Snippet
```java
            InvocationTargetException, InstantiationException {
        args = ArrayUtils.nullToEmpty(args);
        parameterTypes = ArrayUtils.nullToEmpty(parameterTypes);
        final Constructor<T> ctor = getAccessibleConstructor(cls, parameterTypes);
        if (ctor == null) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/lang3/reflect/ConstructorUtils.java`
#### Snippet
```java
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {
        args = ArrayUtils.nullToEmpty(args);
        return invokeExactConstructor(cls, args, ClassUtils.toClass(args));
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/lang3/reflect/ConstructorUtils.java`
#### Snippet
```java
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {
        args = ArrayUtils.nullToEmpty(args);
        return invokeConstructor(cls, args, ClassUtils.toClass(args));
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `locale`
in `src/main/java/org/apache/commons/lang3/time/FormatCache.java`
#### Snippet
```java
    // This must remain private, see LANG-884
    private F getDateTimeInstance(final Integer dateStyle, final Integer timeStyle, final TimeZone timeZone, Locale locale) {
        locale = LocaleUtils.toLocale(locale);
        final String pattern = getPatternForStyle(dateStyle, timeStyle, locale);
        return getInstance(pattern, timeZone, locale);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `end`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        // handle negatives
        if (end < 0) {
            end = str.length() + end; // remember end is negative
        }
        if (start < 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `start`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }
        if (start < 0) {
            start = str.length() + start; // remember start is negative
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `end`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        // check length next
        if (end > str.length()) {
            end = str.length();
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `start`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java

        if (start < 0) {
            start = 0;
        }
        if (end < 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `end`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }
        if (end < 0) {
            end = 0;
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `overlay`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }
        if (overlay == null) {
            overlay = EMPTY;
        }
        final int len = str.length();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `start`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        final int len = str.length();
        if (start < 0) {
            start = 0;
        }
        if (start > len) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `start`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }
        if (start > len) {
            start = len;
        }
        if (end < 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `end`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }
        if (end < 0) {
            end = 0;
        }
        if (end > len) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `end`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }
        if (end > len) {
            end = len;
        }
        if (start > end) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `start`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        if (start > end) {
            final int temp = start;
            start = end;
            end = temp;
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `end`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
            final int temp = start;
            start = end;
            end = temp;
        }
        return str.substring(0, start) +
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `pos`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }
        if (pos < 0) {
            pos = 0;
        }
        if (str.length() <= pos + len) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startPos`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        final int strLength = str.length();
        if (startPos > strLength - searchStrLength) {
            startPos = strLength - searchStrLength;
        }
        if (startPos < 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `padStr`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }
        if (isEmpty(padStr)) {
            padStr = SPACE;
        }
        final int padLen = padStr.length();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startPos`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }
        if (startPos < 0) {
            startPos = 0;
        }
        final int endLimit = str.length() - searchStr.length() + 1;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `s`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
            // swap the two strings to consume less memory
            final CharSequence tmp = s;
            s = t;
            t = tmp;
            n = m;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `t`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
            final CharSequence tmp = s;
            s = t;
            t = tmp;
            n = m;
            m = t.length();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     */
    public static String strip(String str, final String stripChars) {
        str = stripStart(str, stripChars);
        return stripEnd(str, stripChars);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `searchString`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
         }
         if (ignoreCase) {
             searchString = searchString.toLowerCase();
         }
         int start = 0;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `max`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
             buf.append(text, start, end).append(replacement);
             start = end + replLength;
             if (--max == 0) {
                 break;
             }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `padStr`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }
        if (isEmpty(padStr)) {
            padStr = SPACE;
        }
        final int padLen = padStr.length();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
            return str;
        }
        str = leftPad(str, strLen + pads / 2, padChar);
        str = rightPad(str, size, padChar);
        return str;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }
        str = leftPad(str, strLen + pads / 2, padChar);
        str = rightPad(str, size, padChar);
        return str;
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `padStr`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }
        if (isEmpty(padStr)) {
            padStr = SPACE;
        }
        final int strLen = str.length();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
            return str;
        }
        str = leftPad(str, strLen + pads / 2, padStr);
        str = rightPad(str, size, padStr);
        return str;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }
        str = leftPad(str, strLen + pads / 2, padStr);
        str = rightPad(str, size, padStr);
        return str;
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }
        if (offset > strLen) {
            offset = strLen;
        }
        if (strLen - offset < maxWidth - abbrevMarkerLength) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }
        if (strLen - offset < maxWidth - abbrevMarkerLength) {
            offset = strLen - (maxWidth - abbrevMarkerLength);
        }
        if (offset <= abbrevMarkerLength+1) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
            return null;
        }
        str = strip(str, null);
        return str.isEmpty() ? null : str; // NOSONARLINT str cannot be null here
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `replaceChars`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }
        if (replaceChars == null) {
            replaceChars = EMPTY;
        }
        boolean modified = false;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `s`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
            // swap the input strings to consume less memory
            final CharSequence tmp = s;
            s = t;
            t = tmp;
            n = m;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `t`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
            final CharSequence tmp = s;
            s = t;
            t = tmp;
            n = m;
            m = t.length();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `start`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        // handle negatives, which means last n characters
        if (start < 0) {
            start = str.length() + start; // remember start is negative
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `start`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java

        if (start < 0) {
            start = 0;
        }
        if (start > str.length()) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `typeArguments`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
    public static Type unrollVariables(Map<TypeVariable<?>, Type> typeArguments, final Type type) {
        if (typeArguments == null) {
            typeArguments = Collections.emptyMap();
        }
        if (containsTypeVariables(type)) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `typeVariable`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
                break;
            }
            typeVariable = (TypeVariable<?>) result;
        } while (true);
        return result;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `cls`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java

            // work with wrapper the wrapper class instead of the primitive
            cls = ClassUtils.primitiveToWrapper(cls);
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `type`
in `src/main/java/org/apache/commons/lang3/AnnotationUtils.java`
#### Snippet
```java
        }
        if (type.isArray()) {
            type = type.getComponentType();
        }
        return type.isPrimitive() || type.isEnum() || type.isAnnotation()
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/lang3/AnnotationUtils.java`
#### Snippet
```java
        protected void appendDetail(final StringBuffer buffer, final String fieldName, Object value) {
            if (value instanceof Annotation) {
                value = AnnotationUtils.toString((Annotation) value);
            }
            super.appendDetail(buffer, fieldName, value);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `start`
in `src/main/java/org/apache/commons/lang3/CharSequenceUtils.java`
#### Snippet
```java
        }
        if (start >= sz) {
            start = sz - 1;
        }
        if (searchChar < Character.MIN_SUPPLEMENTARY_CODE_POINT) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `start`
in `src/main/java/org/apache/commons/lang3/CharSequenceUtils.java`
#### Snippet
```java
        final int sz = cs.length();
        if (start < 0) {
            start = 0;
        }
        if (searchChar < Character.MIN_SUPPLEMENTARY_CODE_POINT) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `start`
in `src/main/java/org/apache/commons/lang3/CharSequenceUtils.java`
#### Snippet
```java

        if (start > len1) {
            start = len1;
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `start`
in `src/main/java/org/apache/commons/lang3/CharSequenceUtils.java`
#### Snippet
```java

        if (start + len2 > len1) {
            start = len1 - len2;
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `srcClass`
in `src/main/java/org/apache/commons/lang3/reflect/MemberUtils.java`
#### Snippet
```java
            }
            cost++;
            srcClass = srcClass.getSuperclass();
        }
        /*
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/lang3/time/FastDatePrinter.java`
#### Snippet
```java
            case 4:
                buffer.append((char) (value / 1000 + '0'));
                value %= 1000;
            case 3:
                if (value >= 100) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/lang3/time/FastDatePrinter.java`
#### Snippet
```java
                if (value >= 100) {
                    buffer.append((char) (value / 100 + '0'));
                    value %= 100;
                } else {
                    buffer.append('0');
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/lang3/time/FastDatePrinter.java`
#### Snippet
```java
                if (value >= 10) {
                    buffer.append((char) (value / 10 + '0'));
                    value %= 10;
                } else {
                    buffer.append('0');
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/lang3/time/FastDatePrinter.java`
#### Snippet
```java
            while (value != 0) {
                work[digit++] = (char) (value % 10 + '0');
                value = value / 10;
            }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `minFieldWidth`
in `src/main/java/org/apache/commons/lang3/time/FastDatePrinter.java`
#### Snippet
```java
            while (digit < minFieldWidth) {
                buffer.append('0');
                --minFieldWidth;
            }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `calendar`
in `src/main/java/org/apache/commons/lang3/time/FastDatePrinter.java`
#### Snippet
```java
        // do not pass in calendar directly, this will cause TimeZone of FastDatePrinter to be ignored
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar = (Calendar) calendar.clone();
            calendar.setTimeZone(timeZone);
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `chain`
in `src/main/java/org/apache/commons/lang3/exception/ExceptionUtils.java`
#### Snippet
```java
            final Class<? extends Throwable> type) {
        if (chain instanceof UndeclaredThrowableException) {
            chain = chain.getCause();
        }
        return type.isInstance(chain);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `methodNames`
in `src/main/java/org/apache/commons/lang3/exception/ExceptionUtils.java`
#### Snippet
```java
                return cause;
            }
            methodNames = CAUSE_METHOD_NAMES;
        }
        return Stream.of(methodNames).map(m -> getCauseUsingMethodName(throwable, m)).filter(Objects::nonNull).findFirst().orElse(null);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `fromIndex`
in `src/main/java/org/apache/commons/lang3/exception/ExceptionUtils.java`
#### Snippet
```java
        }
        if (fromIndex < 0) {
            fromIndex = 0;
        }
        final Throwable[] throwables = getThrowables(throwable);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `throwable`
in `src/main/java/org/apache/commons/lang3/exception/ExceptionUtils.java`
#### Snippet
```java
        while (throwable != null && !list.contains(throwable)) {
            list.add(throwable);
            throwable = throwable.getCause();
        }
        return list;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `fromIndex`
in `src/main/java/org/apache/commons/lang3/exception/ExceptionUtils.java`
#### Snippet
```java
        }
        if (fromIndex < 0) {
            fromIndex = 0;
        }
        final Throwable[] throwables = getThrowables(throwable);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        for (int i = startIndex; i < array.length; i++) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        for (int i = startIndex; i < array.length; i++) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }
        for (int i = startIndex; i >= 0; i--) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        final double min = valueToFind - tolerance;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }
        if (endIndexExclusive >= array.length) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndexExclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (endIndexExclusive >= array.length) {
            endIndexExclusive = array.length;
        }
        int n = endIndexExclusive - startIndexInclusive;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            return;
        }
        offset %= n;
        if (offset < 0) {
            offset += n;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        offset %= n;
        if (offset < 0) {
            offset += n;
        }
        // For algorithm explanations and proof of O(n) time complexity and O(1) space complexity
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
                swap(array, startIndexInclusive, startIndexInclusive + n - n_offset,  n_offset);
                n = offset;
                offset -= n_offset;
            } else if (offset < n_offset) {
                swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            } else if (offset < n_offset) {
                swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
                startIndexInclusive += offset;
                n = n_offset;
            } else {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        final boolean searchNaN = Float.isNaN(valueToFind);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

        while (startIndex < array.length) {
            startIndex = indexOf(array, valueToFind, startIndex, tolerance);

            if (startIndex == INDEX_NOT_FOUND) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

            bitSet.set(startIndex);
            ++startIndex;
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }
        final double min = valueToFind - tolerance;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }
        for (int i = startIndex; i >= 0; i--) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        for (int i = startIndex; i < array.length; i++) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }
        if (endIndexExclusive > array.length) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndexExclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (endIndexExclusive > array.length) {
            endIndexExclusive = array.length;
        }
        final int newSize = endIndexExclusive - startIndexInclusive;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }
        if (endIndexExclusive > array.length) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndexExclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (endIndexExclusive > array.length) {
            endIndexExclusive = array.length;
        }
        final int newSize = endIndexExclusive - startIndexInclusive;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset1`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (offset1 < 0) {
            offset1 = 0;
        }
        if (offset2 < 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset2`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (offset2 < 0) {
            offset2 = 0;
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            offset2 = 0;
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final long aux = array[offset1];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset1`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final long aux = array[offset1];
            array[offset1] = array[offset2];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset2`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final long aux = array[offset1];
            array[offset1] = array[offset2];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset1`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (offset1 < 0) {
            offset1 = 0;
        }
        if (offset2 < 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset2`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (offset2 < 0) {
            offset2 = 0;
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            offset2 = 0;
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final int aux = array[offset1];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset1`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final int aux = array[offset1];
            array[offset1] = array[offset2];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset2`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final int aux = array[offset1];
            array[offset1] = array[offset2];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset1`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (offset1 < 0) {
            offset1 = 0;
        }
        if (offset2 < 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset2`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (offset2 < 0) {
            offset2 = 0;
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            offset2 = 0;
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final float aux = array[offset1];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset1`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final float aux = array[offset1];
            array[offset1] = array[offset2];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset2`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final float aux = array[offset1];
            array[offset1] = array[offset2];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }
        if (endIndexExclusive > array.length) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndexExclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (endIndexExclusive > array.length) {
            endIndexExclusive = array.length;
        }
        final int newSize = endIndexExclusive - startIndexInclusive;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }
        for (int i = startIndex; i >= 0; i--) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

        while (startIndex < array.length) {
            startIndex = indexOf(array, objectToFind, startIndex);

            if (startIndex == INDEX_NOT_FOUND) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

            bitSet.set(startIndex);
            ++startIndex;
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }
        for (int i = startIndex; i >= 0; i--) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }
        if (endIndexExclusive >= array.length) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndexExclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (endIndexExclusive >= array.length) {
            endIndexExclusive = array.length;
        }
        int n = endIndexExclusive - startIndexInclusive;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            return;
        }
        offset %= n;
        if (offset < 0) {
            offset += n;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        offset %= n;
        if (offset < 0) {
            offset += n;
        }
        // For algorithm explanations and proof of O(n) time complexity and O(1) space complexity
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
                swap(array, startIndexInclusive, startIndexInclusive + n - n_offset,  n_offset);
                n = offset;
                offset -= n_offset;
            } else if (offset < n_offset) {
                swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            } else if (offset < n_offset) {
                swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
                startIndexInclusive += offset;
                n = n_offset;
            } else {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }
        if (endIndexExclusive >= array.length) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndexExclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (endIndexExclusive >= array.length) {
            endIndexExclusive = array.length;
        }
        int n = endIndexExclusive - startIndexInclusive;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            return;
        }
        offset %= n;
        if (offset < 0) {
            offset += n;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        offset %= n;
        if (offset < 0) {
            offset += n;
        }
        // For algorithm explanations and proof of O(n) time complexity and O(1) space complexity
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
                swap(array, startIndexInclusive, startIndexInclusive + n - n_offset,  n_offset);
                n = offset;
                offset -= n_offset;
            } else if (offset < n_offset) {
                swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            } else if (offset < n_offset) {
                swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
                startIndexInclusive += offset;
                n = n_offset;
            } else {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        for (int i = startIndex; i < array.length; i++) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }
        if (endIndexExclusive > array.length) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndexExclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (endIndexExclusive > array.length) {
            endIndexExclusive = array.length;
        }
        final int newSize = endIndexExclusive - startIndexInclusive;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }
        if (endIndexExclusive > array.length) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndexExclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (endIndexExclusive > array.length) {
            endIndexExclusive = array.length;
        }
        final int newSize = endIndexExclusive - startIndexInclusive;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }
        if (endIndexExclusive >= array.length) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndexExclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (endIndexExclusive >= array.length) {
            endIndexExclusive = array.length;
        }
        int n = endIndexExclusive - startIndexInclusive;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            return;
        }
        offset %= n;
        if (offset < 0) {
            offset += n;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        offset %= n;
        if (offset < 0) {
            offset += n;
        }
        // For algorithm explanations and proof of O(n) time complexity and O(1) space complexity
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
                swap(array, startIndexInclusive, startIndexInclusive + n - n_offset,  n_offset);
                n = offset;
                offset -= n_offset;
            } else if (offset < n_offset) {
                swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            } else if (offset < n_offset) {
                swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
                startIndexInclusive += offset;
                n = n_offset;
            } else {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }
        for (int i = startIndex; i >= 0; i--) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }
        for (int i = startIndex; i >= 0; i--) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }
        if (endIndexExclusive > array.length) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndexExclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (endIndexExclusive > array.length) {
            endIndexExclusive = array.length;
        }
        final int newSize = endIndexExclusive - startIndexInclusive;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }
        if (endIndexExclusive >= array.length) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndexExclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (endIndexExclusive >= array.length) {
            endIndexExclusive = array.length;
        }
        int n = endIndexExclusive - startIndexInclusive;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            return;
        }
        offset %= n;
        if (offset < 0) {
            offset += n;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        offset %= n;
        if (offset < 0) {
            offset += n;
        }
        // For algorithm explanations and proof of O(n) time complexity and O(1) space complexity
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
                swap(array, startIndexInclusive, startIndexInclusive + n - n_offset,  n_offset);
                n = offset;
                offset -= n_offset;
            } else if (offset < n_offset) {
                swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            } else if (offset < n_offset) {
                swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
                startIndexInclusive += offset;
                n = n_offset;
            } else {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

        while (startIndex < array.length) {
            startIndex = indexOf(array, valueToFind, startIndex);

            if (startIndex == INDEX_NOT_FOUND) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

            bitSet.set(startIndex);
            ++startIndex;
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset1`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (offset1 < 0) {
            offset1 = 0;
        }
        if (offset2 < 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset2`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (offset2 < 0) {
            offset2 = 0;
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            offset2 = 0;
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final Object aux = array[offset1];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset1`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final Object aux = array[offset1];
            array[offset1] = array[offset2];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset2`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final Object aux = array[offset1];
            array[offset1] = array[offset2];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset1`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (offset1 < 0) {
            offset1 = 0;
        }
        if (offset2 < 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset2`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (offset2 < 0) {
            offset2 = 0;
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            offset2 = 0;
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final double aux = array[offset1];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset1`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final double aux = array[offset1];
            array[offset1] = array[offset2];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset2`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final double aux = array[offset1];
            array[offset1] = array[offset2];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        for (int i = startIndex; i < array.length; i++) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }
        if (endIndexExclusive >= array.length) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndexExclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (endIndexExclusive >= array.length) {
            endIndexExclusive = array.length;
        }
        int n = endIndexExclusive - startIndexInclusive;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            return;
        }
        offset %= n;
        if (offset < 0) {
            offset += n;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        offset %= n;
        if (offset < 0) {
            offset += n;
        }
        // For algorithm explanations and proof of O(n) time complexity and O(1) space complexity
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
                swap(array, startIndexInclusive, startIndexInclusive + n - n_offset,  n_offset);
                n = offset;
                offset -= n_offset;
            } else if (offset < n_offset) {
                swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            } else if (offset < n_offset) {
                swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
                startIndexInclusive += offset;
                n = n_offset;
            } else {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }
        if (endIndexExclusive > array.length) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndexExclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (endIndexExclusive > array.length) {
            endIndexExclusive = array.length;
        }
        final int newSize = endIndexExclusive - startIndexInclusive;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset1`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (offset1 < 0) {
            offset1 = 0;
        }
        if (offset2 < 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset2`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (offset2 < 0) {
            offset2 = 0;
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            offset2 = 0;
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final byte aux = array[offset1];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset1`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final byte aux = array[offset1];
            array[offset1] = array[offset2];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset2`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final byte aux = array[offset1];
            array[offset1] = array[offset2];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }
        if (endIndexExclusive >= array.length) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndexExclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (endIndexExclusive >= array.length) {
            endIndexExclusive = array.length;
        }
        int n = endIndexExclusive - startIndexInclusive;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            return;
        }
        offset %= n;
        if (offset < 0) {
            offset += n;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        offset %= n;
        if (offset < 0) {
            offset += n;
        }
        // For algorithm explanations and proof of O(n) time complexity and O(1) space complexity
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
                swap(array, startIndexInclusive, startIndexInclusive + n - n_offset,  n_offset);
                n = offset;
                offset -= n_offset;
            } else if (offset < n_offset) {
                swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            } else if (offset < n_offset) {
                swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
                startIndexInclusive += offset;
                n = n_offset;
            } else {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }
        if (endIndexExclusive > array.length) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndexExclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (endIndexExclusive > array.length) {
            endIndexExclusive = array.length;
        }
        final int newSize = endIndexExclusive - startIndexInclusive;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

        while (startIndex < array.length) {
            startIndex = indexOf(array, valueToFind, startIndex);

            if (startIndex == INDEX_NOT_FOUND) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

            bitSet.set(startIndex);
            ++startIndex;
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }
        if (objectToFind == null) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }
        if (endIndexExclusive > array.length) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndexExclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (endIndexExclusive > array.length) {
            endIndexExclusive = array.length;
        }
        final int newSize = endIndexExclusive - startIndexInclusive;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        final boolean searchNaN = Double.isNaN(valueToFind);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

        while (startIndex < array.length) {
            startIndex = indexOf(array, valueToFind, startIndex);

            if (startIndex == INDEX_NOT_FOUND) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

            bitSet.set(startIndex);
            ++startIndex;
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }
        if (endIndexExclusive >= array.length) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndexExclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (endIndexExclusive >= array.length) {
            endIndexExclusive = array.length;
        }
        int n = endIndexExclusive - startIndexInclusive;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            return;
        }
        offset %= n;
        if (offset < 0) {
            offset += n;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        offset %= n;
        if (offset < 0) {
            offset += n;
        }
        // For algorithm explanations and proof of O(n) time complexity and O(1) space complexity
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
                swap(array, startIndexInclusive, startIndexInclusive + n - n_offset,  n_offset);
                n = offset;
                offset -= n_offset;
            } else if (offset < n_offset) {
                swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            } else if (offset < n_offset) {
                swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
                startIndexInclusive += offset;
                n = n_offset;
            } else {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

        while (startIndex < array.length) {
            startIndex = indexOf(array, valueToFind, startIndex);

            if (startIndex == INDEX_NOT_FOUND) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

            bitSet.set(startIndex);
            ++startIndex;
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset1`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (offset1 < 0) {
            offset1 = 0;
        }
        if (offset2 < 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset2`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (offset2 < 0) {
            offset2 = 0;
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            offset2 = 0;
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final boolean aux = array[offset1];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset1`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final boolean aux = array[offset1];
            array[offset1] = array[offset2];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset2`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final boolean aux = array[offset1];
            array[offset1] = array[offset2];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndexInclusive < 0) {
            startIndexInclusive = 0;
        }
        if (endIndexExclusive >= array.length) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endIndexExclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (endIndexExclusive >= array.length) {
            endIndexExclusive = array.length;
        }
        int n = endIndexExclusive - startIndexInclusive;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            return;
        }
        offset %= n;
        if (offset < 0) {
            offset += n;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        offset %= n;
        if (offset < 0) {
            offset += n;
        }
        // For algorithm explanations and proof of O(n) time complexity and O(1) space complexity
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
                swap(array, startIndexInclusive, startIndexInclusive + n - n_offset,  n_offset);
                n = offset;
                offset -= n_offset;
            } else if (offset < n_offset) {
                swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndexInclusive`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            } else if (offset < n_offset) {
                swap(array, startIndexInclusive, startIndexInclusive + n_offset,  offset);
                startIndexInclusive += offset;
                n = n_offset;
            } else {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }
        for (int i = startIndex; i >= 0; i--) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

        while (startIndex < array.length) {
            startIndex = indexOf(array, valueToFind, startIndex);

            if (startIndex == INDEX_NOT_FOUND) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

            bitSet.set(startIndex);
            ++startIndex;
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        for (int i = startIndex; i < array.length; i++) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset1`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (offset1 < 0) {
            offset1 = 0;
        }
        if (offset2 < 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset2`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (offset2 < 0) {
            offset2 = 0;
        }
        if (offset1 == offset2) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            return;
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final short aux = array[offset1];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset1`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final short aux = array[offset1];
            array[offset1] = array[offset2];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset2`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final short aux = array[offset1];
            array[offset1] = array[offset2];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset1`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (offset1 < 0) {
            offset1 = 0;
        }
        if (offset2 < 0) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset2`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (offset2 < 0) {
            offset2 = 0;
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
            offset2 = 0;
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final char aux = array[offset1];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset1`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final char aux = array[offset1];
            array[offset1] = array[offset2];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `offset2`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        len = Math.min(Math.min(len, array.length - offset1), array.length - offset2);
        for (int i = 0; i < len; i++, offset1++, offset2++) {
            final char aux = array[offset1];
            array[offset1] = array[offset2];
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

        while (startIndex < array.length) {
            startIndex = indexOf(array, valueToFind, startIndex);

            if (startIndex == INDEX_NOT_FOUND) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

            bitSet.set(startIndex);
            ++startIndex;
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

        while (startIndex < array.length) {
            startIndex = indexOf(array, valueToFind, startIndex);

            if (startIndex == INDEX_NOT_FOUND) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

            bitSet.set(startIndex);
            ++startIndex;
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        if (objectToFind == null) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

        while (startIndex < array.length) {
            startIndex = indexOf(array, valueToFind, startIndex);

            if (startIndex == INDEX_NOT_FOUND) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

            bitSet.set(startIndex);
            ++startIndex;
        }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `startIndex`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
        }
        if (startIndex >= array.length) {
            startIndex = array.length - 1;
        }
        for (int i = startIndex; i >= 0; i--) {
```

## RuleId[ruleID=UnnecessaryContinue]
### RuleId[ruleID=UnnecessaryContinue]
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

## RuleId[ruleID=PointlessBitwiseExpression]
### RuleId[ruleID=PointlessBitwiseExpression]
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

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/text/StrTokenizer.java`
#### Snippet
```java
            return tokens[tokenPos++];
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/text/StrTokenizer.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrTokenizer.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrTokenizer.java`
#### Snippet
```java
            return tokens[--tokenPos];
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/function/FailableDoubleFunction.java`
#### Snippet
```java
    /** NOP singleton */
    @SuppressWarnings("rawtypes")
    FailableDoubleFunction NOP = t -> null;

    /**
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/text/ExtendedMessageFormat.java`
#### Snippet
```java
            if (c[pos.getIndex()] == QUOTE) {
                next(pos);
                return appendTo == null ? null : appendTo.append(c, start,
                        pos.getIndex() - start);
            }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/text/ExtendedMessageFormat.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/function/Suppliers.java`
#### Snippet
```java
     */
    public static <T> T get(final Supplier<T> supplier) {
        return supplier == null ? null : supplier.get();
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/SerializationUtils.java`
#### Snippet
```java
    public static <T extends Serializable> T clone(final T object) {
        if (object == null) {
            return null;
        }
        final byte[] objectData = serialize(object);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/SystemUtils.java`
#### Snippet
```java
            // System.err.println("Caught a SecurityException reading the system property '" + property
            // + "'; the SystemUtils property value will default to null.");
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/text/WordUtils.java`
#### Snippet
```java
    public static String wrap(final String str, int wrapLength, String newLineStr, final boolean wrapLongWords, String wrapOn) {
        if (str == null) {
            return null;
        }
        if (newLineStr == null) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static Long createLong(final String str) {
        if (str == null) {
            return null;
        }
        return Long.decode(str);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static BigInteger createBigInteger(final String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static Double createDouble(final String str) {
        if (str == null) {
            return null;
        }
        return Double.valueOf(str);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static BigDecimal createBigDecimal(final String str) {
        if (str == null) {
            return null;
        }
        // handle JDK1.3.1 bug where "" throws IndexOutOfBoundsException
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static Integer createInteger(final String str) {
        if (str == null) {
            return null;
        }
        // decode() handles 0xAABD and 0777 (hex and octal) as well.
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static Float createFloat(final String str) {
        if (str == null) {
            return null;
        }
        return Float.valueOf(str);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/math/NumberUtils.java`
#### Snippet
```java
    public static Number createNumber(final String str) {
        if (str == null) {
            return null;
        }
        if (StringUtils.isBlank(str)) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/function/FailableIntFunction.java`
#### Snippet
```java
    /** NOP singleton */
    @SuppressWarnings("rawtypes")
    FailableIntFunction NOP = t -> null;

    /**
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrSubstitutor.java`
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
in `src/main/java/org/apache/commons/lang3/text/StrLookup.java`
#### Snippet
```java
        public String lookup(final String key) {
            if (map == null) {
                return null;
            }
            final Object obj = map.get(key);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/text/StrLookup.java`
#### Snippet
```java
            final Object obj = map.get(key);
            if (obj == null) {
                return null;
            }
            return obj.toString();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/text/StrLookup.java`
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
in `src/main/java/org/apache/commons/lang3/JavaVersion.java`
#### Snippet
```java
    static JavaVersion get(final String versionStr) {
        if (versionStr == null) {
            return null;
        }
        switch (versionStr) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/JavaVersion.java`
#### Snippet
```java
                return JAVA_RECENT;
            }
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
    public static List<Class<?>> convertClassNamesToClasses(final List<String> classNames) {
        if (classNames == null) {
            return null;
        }
        final List<Class<?>> classes = new ArrayList<>(classNames.size());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
    public static Class<?>[] wrappersToPrimitives(final Class<?>... classes) {
        if (classes == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
    public static List<Class<?>> getAllInterfaces(final Class<?> cls) {
        if (cls == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
    public static List<Class<?>> getAllSuperclasses(final Class<?> cls) {
        if (cls == null) {
            return null;
        }
        final List<Class<?>> classes = new ArrayList<>();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
    public static Class<?>[] toClass(final Object... array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
        }
        final Class<?>[] classes = new Class[array.length];
        Arrays.setAll(classes, i -> array[i] == null ? null : array[i].getClass());
        return classes;
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
        className = StringUtils.deleteWhitespace(className);
        if (className == null) {
            return null;
        }
        int dim = 0;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public static <T> Class<T> getComponentType(final Class<T[]> cls) {
        return cls == null ? null : (Class<T>) cls.getComponentType();
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
     */
    public static List<String> convertClassesToClassNames(final List<Class<?>> classes) {
        return classes == null ? null : classes.stream().map(e -> getName(e, null)).collect(Collectors.toList());
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ClassUtils.java`
#### Snippet
```java
    public static Class<?>[] primitivesToWrappers(final Class<?>... classes) {
        if (classes == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/function/FailableFunction.java`
#### Snippet
```java
    /** NOP singleton */
    @SuppressWarnings("rawtypes")
    FailableFunction NOP = t -> null;

    /**
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
        Objects.requireNonNull(annotationCls, "annotationCls");
        if (!ignoreAccess && !MemberUtils.isAccessible(method)) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
                    return parentClass.getMethod(methodName, parameterTypes);
                } catch (final NoSuchMethodException e) {
                    return null;
                }
            }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
            parentClass = parentClass.getSuperclass();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
    public static Method getAccessibleMethod(Method method) {
        if (!MemberUtils.isAccessible(method)) {
            return null;
        }
        // If the declaring class is public, we are done
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
            if (parameterTypeName != null && parameterTypeSuperClassName != null && !methodParameterComponentTypeName.equals(parameterTypeName)
                && !methodParameterComponentTypeName.equals(parameterTypeSuperClassName)) {
                return null;
            }
        }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
    private static List<Class<?>> getAllSuperclassesAndInterfaces(final Class<?> cls) {
        if (cls == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
            return getAccessibleMethod(cls.getMethod(methodName, parameterTypes));
        } catch (final NoSuchMethodException e) {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java

        if (candidates.isEmpty()) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/time/CalendarUtils.java`
#### Snippet
```java
        final Map<String, Integer> displayNames = calendar.getDisplayNames(Calendar.MONTH, style, locale);
        if (displayNames == null) {
            return null;
        }
        final String[] monthNames = new String[displayNames.size()];
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/concurrent/ConcurrentUtils.java`
#### Snippet
```java
    public static <K, V> V putIfAbsent(final ConcurrentMap<K, V> map, final K key, final V value) {
        if (map == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/concurrent/ConcurrentUtils.java`
#### Snippet
```java
            final ExecutionException ex) {
        if (ex == null || ex.getCause() == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/concurrent/ConcurrentUtils.java`
#### Snippet
```java
    public static ConcurrentException extractCause(final ExecutionException ex) {
        if (ex == null || ex.getCause() == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/concurrent/ConcurrentUtils.java`
#### Snippet
```java
            final ConcurrentInitializer<V> init) throws ConcurrentException {
        if (map == null || init == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/concurrent/ConcurrentUtils.java`
#### Snippet
```java
    public static <T> T initialize(final ConcurrentInitializer<T> initializer)
            throws ConcurrentException {
        return initializer != null ? initializer.get() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/function/FailableBiFunction.java`
#### Snippet
```java
    /** NOP singleton */
    @SuppressWarnings("rawtypes")
    FailableBiFunction NOP = (t, u) -> null;

    /**
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/time/FastTimeZone.java`
#### Snippet
```java
            return new GmtTimeZone(parseSign(m.group(1)), hours, minutes);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/FieldUtils.java`
#### Snippet
```java
            if (!MemberUtils.isAccessible(field)) {
                if (!forceAccess) {
                    return null;
                }
                field.setAccessible(true);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/FieldUtils.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/event/EventListenerSupport.java`
#### Snippet
```java
                method.invoke(listener, args);
            }
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/time/FastDateParser.java`
#### Snippet
```java
        cal.clear();

        return parse(source, pos, cal) ? cal.getTime() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/time/FastDateParser.java`
#### Snippet
```java
        StrategyAndWidth getNextStrategy() {
            if (currentIdx >= pattern.length()) {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/ConstructorUtils.java`
#### Snippet
```java
        Objects.requireNonNull(ctor, "ctor");
        return MemberUtils.isAccessible(ctor)
                && isAccessible(ctor.getDeclaringClass()) ? ctor : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/ConstructorUtils.java`
#### Snippet
```java
            return getAccessibleConstructor(cls.getConstructor(parameterTypes));
        } catch (final NoSuchMethodException e) {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/CharSet.java`
#### Snippet
```java
    public static CharSet getInstance(final String... setStrs) {
        if (setStrs == null) {
            return null;
        }
        if (setStrs.length == 1) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/CharSetUtils.java`
#### Snippet
```java
    public static String keep(final String str, final String... set) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty() || deepEmpty(set)) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/event/EventUtils.java`
#### Snippet
```java
                return MethodUtils.invokeMethod(target, methodName);
            }
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
            final String str, final String separator, final int max, final boolean preserveAllTokens) {
        if (str == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String substring(final String str, int start, int end) {
        if (str == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        // handle null, zero and one elements before building a buffer
        if (iterator == null) {
            return null;
        }
        if (!iterator.hasNext()) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String join(final byte[] array, final char delimiter, final int startIndex, final int endIndex) {
        if (array == null) {
            return null;
        }
        if (endIndex - startIndex <= 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String leftPad(final String str, final int size, String padStr) {
        if (str == null) {
            return null;
        }
        if (isEmpty(padStr)) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String trimToNull(final String str) {
        final String ts = trim(str);
        return isEmpty(ts) ? null : ts;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String join(final float[] array, final char delimiter) {
        if (array == null) {
            return null;
        }
        return join(array, delimiter, 0, array.length);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String lowerCase(final String str, final Locale locale) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(LocaleUtils.toLocale(locale));
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String lowerCase(final String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static int[] toCodePoints(final CharSequence cs) {
        if (cs == null) {
            return null;
        }
        if (cs.length() == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String reverseDelimited(final String str, final char separatorChar) {
        if (str == null) {
            return null;
        }
        // could implement manually, but simple way is to reuse other,
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String chop(final String str) {
        if (str == null) {
            return null;
        }
        final int strLen = str.length();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String upperCase(final String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String join(final char[] array, final char delimiter) {
        if (array == null) {
            return null;
        }
        return join(array, delimiter, 0, array.length);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String mid(final String str, int pos, final int len) {
        if (str == null) {
            return null;
        }
        if (len < 0 || pos > str.length()) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    private static String[] splitByCharacterType(final String str, final boolean camelCase) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     */
    public static String valueOf(final char[] value) {
        return value == null ? null : String.valueOf(value);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String left(final String str, final int len) {
        if (str == null) {
            return null;
        }
        if (len < 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String join(final List<?> list, final String separator, final int startIndex, final int endIndex) {
        if (list == null) {
            return null;
        }
        final int noOfItems = endIndex - startIndex;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String join(final byte[] array, final char delimiter) {
        if (array == null) {
            return null;
        }
        return join(array, delimiter, 0, array.length);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String join(final short[] array, final char delimiter) {
        if (array == null) {
            return null;
        }
        return join(array, delimiter, 0, array.length);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String join(final long[] array, final char delimiter, final int startIndex, final int endIndex) {
        if (array == null) {
            return null;
        }
        if (endIndex - startIndex <= 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String join(final short[] array, final char delimiter, final int startIndex, final int endIndex) {
        if (array == null) {
            return null;
        }
        if (endIndex - startIndex <= 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String join(final boolean[] array, final char delimiter) {
        if (array == null) {
            return null;
        }
        return join(array, delimiter, 0, array.length);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     */
    public static String trim(final String str) {
        return str == null ? null : str.trim();
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     */
    public static String join(final Object[] array, final String delimiter) {
        return array != null ? join(array, toStringOrEmpty(delimiter), 0, array.length) : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     */
    public static String toRootUpperCase(final String source) {
        return source == null ? null : source.toUpperCase(Locale.ROOT);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String rotate(final String str, final int shift) {
        if (str == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String overlay(final String str, String overlay, int start, int end) {
        if (str == null) {
            return null;
        }
        if (overlay == null) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String join(final char[] array, final char delimiter, final int startIndex, final int endIndex) {
        if (array == null) {
            return null;
        }
        if (endIndex - startIndex <= 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String join(final Object[] array, final char delimiter) {
        if (array == null) {
            return null;
        }
        return join(array, delimiter, 0, array.length);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String upperCase(final String str, final Locale locale) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(LocaleUtils.toLocale(locale));
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String rightPad(final String str, final int size, String padStr) {
        if (str == null) {
            return null;
        }
        if (isEmpty(padStr)) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String join(final long[] array, final char separator) {
        if (array == null) {
            return null;
        }
        return join(array, separator, 0, array.length);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     */
    public static String toRootLowerCase(final String source) {
        return source == null ? null : source.toLowerCase(Locale.ROOT);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String leftPad(final String str, final int size, final char padChar) {
        if (str == null) {
            return null;
        }
        final int pads = size - str.length();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String stripToNull(String str) {
        if (str == null) {
            return null;
        }
        str = strip(str, null);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }
        str = strip(str, null);
        return str.isEmpty() ? null : str; // NOSONARLINT str cannot be null here
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java

        if (str == null) {
            return null;
        }
        final int len = str.length();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java

        if (str == null) {
            return null;
        }
        final int len = str.length();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String join(final double[] array, final char delimiter, final int startIndex, final int endIndex) {
        if (array == null) {
            return null;
        }
        if (endIndex - startIndex <= 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String replaceChars(final String str, final char searchChar, final char replaceChar) {
        if (str == null) {
            return null;
        }
        return str.replace(searchChar, replaceChar);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     */
    public static String join(final Iterable<?> iterable, final char separator) {
        return iterable != null ? join(iterable.iterator(), separator) : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String join(final double[] array, final char delimiter) {
        if (array == null) {
            return null;
        }
        return join(array, delimiter, 0, array.length);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String right(final String str, final int len) {
        if (str == null) {
            return null;
        }
        if (len < 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String substring(final String str, int start) {
        if (str == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
     */
    public static String join(final Iterable<?> iterable, final String separator) {
        return iterable != null ? join(iterable.iterator(), separator) : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String join(final int[] array, final char separator) {
        if (array == null) {
            return null;
        }
        return join(array, separator, 0, array.length);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String join(final boolean[] array, final char delimiter, final int startIndex, final int endIndex) {
        if (array == null) {
            return null;
        }
        if (endIndex - startIndex <= 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String substringBetween(final String str, final String open, final String close) {
        if (!ObjectUtils.allNotNull(str, open, close)) {
            return null;
        }
        final int start = str.indexOf(open);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String join(final List<?> list, final char separator, final int startIndex, final int endIndex) {
        if (list == null) {
            return null;
        }
        final int noOfItems = endIndex - startIndex;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String reverse(final String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String[] substringsBetween(final String str, final String open, final String close) {
        if (str == null || isEmpty(open) || isEmpty(close)) {
            return null;
        }
        final int strLen = str.length();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }
        if (list.isEmpty()) {
            return null;
        }
        return list.toArray(ArrayUtils.EMPTY_STRING_ARRAY);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String join(final Object[] array, final String delimiter, final int startIndex, final int endIndex) {
        return array != null ? Streams.of(array).skip(startIndex).limit(Math.max(0, endIndex - startIndex))
            .collect(LangCollectors.joining(delimiter, EMPTY, EMPTY, StringUtils::toStringOrEmpty)) : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String join(final float[] array, final char delimiter, final int startIndex, final int endIndex) {
        if (array == null) {
            return null;
        }
        if (endIndex - startIndex <= 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }
        if (str == null) {
            return null;
        }
        if (offset > str.length()) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        // Performance tuned for 2.0 (JDK1.4)
        if (str == null) {
            return null;
        }
        if (repeat <= 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String join(final int[] array, final char delimiter, final int startIndex, final int endIndex) {
        if (array == null) {
            return null;
        }
        if (endIndex - startIndex <= 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        // handle null, zero and one elements before building a buffer
        if (iterator == null) {
            return null;
        }
        if (!iterator.hasNext()) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String rightPad(final String str, final int size, final char padChar) {
        if (str == null) {
            return null;
        }
        final int pads = size - str.length();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
    public static String stripAccents(final String input) {
        if (input == null) {
            return null;
        }
        final StringBuilder decomposed = new StringBuilder(Normalizer.normalize(input, Normalizer.Form.NFD));
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ObjectUtils.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public static <T> Class<T> getClass(final T object) {
        return object == null ? null : (Class<T>) object.getClass();
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ObjectUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ObjectUtils.java`
#### Snippet
```java
    @SafeVarargs
    public static <T> T getFirstNonNull(final Supplier<T>... suppliers) {
        return Streams.of(suppliers).map(s -> s != null ? s.get() : null).filter(Objects::nonNull).findFirst().orElse(null);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ObjectUtils.java`
#### Snippet
```java
    public static String identityToString(final Object object) {
        if (object == null) {
            return null;
        }
        final String name = object.getClass().getName();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ObjectUtils.java`
#### Snippet
```java
            return result;
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
        }
        if (str == null) {
            return null;
        }
        switch (str.length()) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
        }

        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
    public static Boolean toBooleanObject(final Integer value) {
        if (value == null) {
            return null;
        }
        return value.intValue() == 0 ? Boolean.FALSE : Boolean.TRUE;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
    public static Integer toIntegerObject(final Boolean bool) {
        if (bool == null) {
            return null;
        }
        return bool.booleanValue() ? NumberUtils.INTEGER_ONE : NumberUtils.INTEGER_ZERO;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
        }
        if (value == nullValue) {
            return null;
        }
        throw new IllegalArgumentException("The Integer did not match any specified value");
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
    public static Boolean negate(final Boolean bool) {
        if (bool == null) {
            return null;
        }
        return bool.booleanValue() ? Boolean.FALSE : Boolean.TRUE;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
            }
            if (nullString == null) {
                return null;
            }
        } else if (str.equals(trueString)) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
            return Boolean.FALSE;
        } else if (str.equals(nullString)) {
            return null;
        }
        // no match
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
            }
            if (nullValue == null) {
                return null;
            }
        } else if (value.equals(trueValue)) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/BooleanUtils.java`
#### Snippet
```java
            return Boolean.FALSE;
        } else if (value.equals(nullValue)) {
            return null;
        }
        throw new IllegalArgumentException("The Integer did not match any specified value");
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/function/FailableLongFunction.java`
#### Snippet
```java
    /** NOP singleton */
    @SuppressWarnings("rawtypes")
    FailableLongFunction NOP = t -> null;

    /**
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
        // make sure they're assignable
        if (!isAssignable(cls, toClass)) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
        if (type instanceof Class<?>) {
            final Class<?> cls = (Class<?>) type;
            return cls.isArray() ? cls.getComponentType() : null;
        }
        if (type instanceof GenericArrayType) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
        // compatibility check
        if (!isAssignable(cls, superClass)) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
            }

            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
            }

            return null;
        }
        throw new IllegalStateException("found an unhandled type: " + type);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
        // make sure they're assignable
        if (!isAssignable(cls, toClass)) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
        if (type instanceof TypeVariable<?>) {
            if (assigningType == null) {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
            // variable
            if (!(genericDeclaration instanceof Class<?>)) {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
            // declaring type
            if (typeVarAssigns == null) {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java

            if (typeArgument == null) {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
        // (hand-waving) this is not the method you're looking for
        if (type instanceof WildcardType) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ThreadUtils.java`
#### Snippet
```java
        }
        final Collection<Thread> result = findThreads((Predicate<Thread>) t -> t != null && t.getId() == threadId);
        return result.isEmpty() ? null : result.iterator().next();
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ThreadUtils.java`
#### Snippet
```java
            return thread;
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ThreadUtils.java`
#### Snippet
```java
            return thread;
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/text/translate/CharSequenceTranslator.java`
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
in `src/main/java/org/apache/commons/lang3/CharSequenceUtils.java`
#### Snippet
```java
     */
    public static CharSequence subSequence(final CharSequence cs, final int start) {
        return cs == null ? null : cs.subSequence(start, cs.length());
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/concurrent/BackgroundInitializer.java`
#### Snippet
```java
        } catch (final ExecutionException execex) {
            ConcurrentUtils.handleCause(execex);
            return null; // should not be reached
        } catch (final InterruptedException iex) {
            // reset interrupted state
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/time/DateFormatUtils.java`
#### Snippet
```java

    private static TimeZone getTimeZone(final Calendar calendar) {
        return calendar == null ? null : calendar.getTimeZone();
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/CharUtils.java`
#### Snippet
```java
     */
    public static String unicodeEscaped(final Character ch) {
        return ch != null ? unicodeEscaped(ch.charValue()) : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/CharUtils.java`
#### Snippet
```java
     */
    public static String toString(final Character ch) {
        return ch != null ? toString(ch.charValue()) : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/CharUtils.java`
#### Snippet
```java
     */
    public static Character toCharacterObject(final String str) {
        return StringUtils.isEmpty(str) ? null : Character.valueOf(str.charAt(0));
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/LocaleUtils.java`
#### Snippet
```java
        if (str == null) {
            // TODO Should this return the default locale?
            return null;
        }
        if (str.isEmpty()) { // LANG-941 - JDK 8 introduced an empty locale where all fields are blank
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/exception/ExceptionUtils.java`
#### Snippet
```java
    public static Throwable getRootCause(final Throwable throwable) {
        final List<Throwable> list = getThrowableList(throwable);
        return list.isEmpty() ? null : list.get(list.size() - 1);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/exception/ExceptionUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/exception/ExceptionUtils.java`
#### Snippet
```java
    public static Throwable getCause(final Throwable throwable, String[] methodNames) {
        if (throwable == null) {
            return null;
        }
        if (methodNames == null) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/exception/ExceptionUtils.java`
#### Snippet
```java
    private static <T extends Throwable> T throwableOf(final Throwable throwable, final Class<T> type, int fromIndex, final boolean subclass) {
        if (throwable == null || type == null) {
            return null;
        }
        if (fromIndex < 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/exception/ExceptionUtils.java`
#### Snippet
```java
        final Throwable[] throwables = getThrowables(throwable);
        if (fromIndex >= throwables.length) {
            return null;
        }
        if (subclass) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/exception/ExceptionUtils.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static String[] toStringArray(final Object[] array, final String valueForNullElements) {
        if (null == array) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static String[] toStringArray(final Object[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static byte[] toPrimitive(final Byte[] array, final byte valueForNull) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static float[] insert(final int index, final float[] array, final float... values) {
        if (array == null) {
            return null;
        }
        if (ArrayUtils.isEmpty(values)) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static Object toPrimitive(final Object array) {
        if (array == null) {
            return null;
        }
        final Class<?> ct = array.getClass().getComponentType();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static long[] insert(final int index, final long[] array, final long... values) {
        if (array == null) {
            return null;
        }
        if (ArrayUtils.isEmpty(values)) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static short[] toPrimitive(final Short[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static Character[] toObject(final char[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static double[] insert(final int index, final double[] array, final double... values) {
        if (array == null) {
            return null;
        }
        if (ArrayUtils.isEmpty(values)) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static int[] clone(final int[] array) {
        return array != null ? array.clone() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static double[] toPrimitive(final Double[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static double[] toPrimitive(final Double[] array, final double valueForNull) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    static Object removeAll(final Object array, final BitSet indices) {
        if (array == null) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static boolean[] clone(final boolean[] array) {
        return array != null ? array.clone() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static short[] subarray(final short[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return null;
        }
        if (startIndexInclusive < 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static double[] subarray(final double[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return null;
        }
        if (startIndexInclusive < 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static byte[] insert(final int index, final byte[] array, final byte... values) {
        if (array == null) {
            return null;
        }
        if (ArrayUtils.isEmpty(values)) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static short[] clone(final short[] array) {
        return array != null ? array.clone() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static char[] insert(final int index, final char[] array, final char... values) {
        if (array == null) {
            return null;
        }
        if (ArrayUtils.isEmpty(values)) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static char[] toPrimitive(final Character[] array, final char valueForNull) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java

        if (array == null) {
            return null;
        }
        if (ArrayUtils.isEmpty(values)) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static float[] subarray(final float[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return null;
        }
        if (startIndexInclusive < 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static Boolean[] toObject(final boolean[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static float[] clone(final float[] array) {
        return array != null ? array.clone() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static char[] toPrimitive(final Character[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static byte[] toPrimitive(final Byte[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static byte[] subarray(final byte[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return null;
        }
        if (startIndexInclusive < 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static long[] clone(final long[] array) {
        return array != null ? array.clone() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static boolean[] subarray(final boolean[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return null;
        }
        if (startIndexInclusive < 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static int[] insert(final int index, final int[] array, final int... values) {
        if (array == null) {
            return null;
        }
        if (ArrayUtils.isEmpty(values)) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static int[] toPrimitive(final Integer[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static Float[] toObject(final float[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static Long[] toObject(final long[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static long[] toPrimitive(final Long[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static long[] toPrimitive(final Long[] array, final long valueForNull) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static long[] subarray(final long[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return null;
        }
        if (startIndexInclusive < 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static Integer[] toObject(final int[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static boolean[] insert(final int index, final boolean[] array, final boolean... values) {
        if (array == null) {
            return null;
        }
        if (ArrayUtils.isEmpty(values)) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static int[] toPrimitive(final Integer[] array, final int valueForNull) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static Double[] toObject(final double[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static char[] subarray(final char[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return null;
        }
        if (startIndexInclusive < 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static <T> T[] subarray(final T[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return null;
        }
        if (startIndexInclusive < 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static boolean[] toPrimitive(final Boolean[] array, final boolean valueForNull) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static byte[] clone(final byte[] array) {
        return array != null ? array.clone() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static int[] subarray(final int[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return null;
        }
        if (startIndexInclusive < 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static Map<Object, Object> toMap(final Object[] array) {
        if (array == null) {
            return null;
        }
        final Map<Object, Object> map = new HashMap<>((int) (array.length * 1.5));
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static short[] insert(final int index, final short[] array, final short... values) {
        if (array == null) {
            return null;
        }
        if (ArrayUtils.isEmpty(values)) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static <T> T[] clone(final T[] array) {
        return array != null ? array.clone() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static float[] toPrimitive(final Float[] array, final float valueForNull) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static char[] clone(final char[] array) {
        return array != null ? array.clone() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static double[] clone(final double[] array) {
        return array != null ? array.clone() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static Short[] toObject(final short[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static Byte[] toObject(final byte[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static short[] toPrimitive(final Short[] array, final short valueForNull) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
    public static float[] toPrimitive(final Float[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
```

## RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }

        return wrapWith.concat(str).concat(wrapWith);
    }

```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }

        return wrapWith.concat(str).concat(wrapWith);
    }

```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
            return leftPad(str, size, String.valueOf(padChar));
        }
        return repeat(padChar, pads).concat(str);
    }

```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java

        if (pads == padLen) {
            return padStr.concat(str);
        }
        if (pads < padLen) {
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }
        if (pads < padLen) {
            return padStr.substring(0, pads).concat(str);
        }
        final char[] padding = new char[pads];
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
            padding[i] = padChars[i % padLen];
        }
        return new String(padding).concat(str);
    }

```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java

        if (pads == padLen) {
            return str.concat(padStr);
        }
        if (pads < padLen) {
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }
        if (pads < padLen) {
            return str.concat(padStr.substring(0, pads));
        }
        final char[] padding = new char[pads];
```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
            padding[i] = padChars[i % padLen];
        }
        return str.concat(new String(padding));
    }

```

### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
            return rightPad(str, size, String.valueOf(padChar));
        }
        return str.concat(repeat(padChar, pads));
    }

```

## RuleId[ruleID=HtmlWrongAttributeValue]
### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-20-03-13-48.990.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ArrayEquality]
### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java`
#### Snippet
```java
            return this;
        }
        if (lhs == rhs) {
            return this;
        }
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java`
#### Snippet
```java
            return this;
        }
        if (lhs == rhs) {
            return this;
        }
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java`
#### Snippet
```java
            return this;
        }
        if (lhs == rhs) {
            return this;
        }
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java`
#### Snippet
```java
            return this;
        }
        if (lhs == rhs) {
            return this;
        }
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java`
#### Snippet
```java
            return this;
        }
        if (lhs == rhs) {
            return this;
        }
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java`
#### Snippet
```java
            return this;
        }
        if (lhs == rhs) {
            return this;
        }
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java`
#### Snippet
```java
            return this;
        }
        if (lhs == rhs) {
            return this;
        }
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java`
#### Snippet
```java
            return this;
        }
        if (lhs == rhs) {
            return this;
        }
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/lang3/builder/EqualsBuilder.java`
#### Snippet
```java
            return this;
        }
        if (lhs == rhs) {
            return this;
        }
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/lang3/builder/CompareToBuilder.java`
#### Snippet
```java
            return this;
        }
        if (lhs == rhs) {
            return this;
        }
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/lang3/builder/CompareToBuilder.java`
#### Snippet
```java
            return this;
        }
        if (lhs == rhs) {
            return this;
        }
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/lang3/builder/CompareToBuilder.java`
#### Snippet
```java
            return this;
        }
        if (lhs == rhs) {
            return this;
        }
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/lang3/builder/CompareToBuilder.java`
#### Snippet
```java
            return this;
        }
        if (lhs == rhs) {
            return this;
        }
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/lang3/builder/CompareToBuilder.java`
#### Snippet
```java
            return this;
        }
        if (lhs == rhs) {
            return this;
        }
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/lang3/builder/CompareToBuilder.java`
#### Snippet
```java
            return this;
        }
        if (lhs == rhs) {
            return this;
        }
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/lang3/builder/CompareToBuilder.java`
#### Snippet
```java
            return this;
        }
        if (lhs == rhs) {
            return this;
        }
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/lang3/builder/CompareToBuilder.java`
#### Snippet
```java
            return this;
        }
        if (lhs == rhs) {
            return this;
        }
```

### RuleId[ruleID=ArrayEquality]
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/lang3/builder/CompareToBuilder.java`
#### Snippet
```java
            return this;
        }
        if (lhs == rhs) {
            return this;
        }
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java`
#### Snippet
```java
        final Type[] filteredArgumentTypes = Arrays.copyOf(parameterizedType.getActualTypeArguments(),
            parameterizedType.getActualTypeArguments().length);
        int[] indexesToRemove = {};
        for (int i = 0; i < filteredArgumentTypes.length; i++) {
            if (filteredArgumentTypes[i] instanceof TypeVariable<?> && containsVariableTypeSameParametrizedTypeBound(
```

## RuleId[ruleID=SynchronizeOnThis]
### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/lang3/concurrent/MultiBackgroundInitializer.java`
#### Snippet
```java
        Objects.requireNonNull(backgroundInitializer, "backgroundInitializer");

        synchronized (this) {
            if (isStarted()) {
                throw new IllegalStateException("addInitializer() must not be called after start()!");
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/lang3/concurrent/MultiBackgroundInitializer.java`
#### Snippet
```java
    protected MultiBackgroundInitializerResults initialize() throws Exception {
        final Map<String, BackgroundInitializer<?>> inits;
        synchronized (this) {
            // create a snapshot to operate on
            inits = new HashMap<>(childInitializers);
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/lang3/concurrent/TimedSemaphore.java`
#### Snippet
```java
            canPass = acquirePermit();
            if (!canPass) {
                wait();
            }
        } while (!canPass);
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/lang3/concurrent/TimedSemaphore.java`
#### Snippet
```java
        periodCount++;
        acquireCount = 0;
        notifyAll();
    }

```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/lang3/concurrent/LazyInitializer.java`
#### Snippet
```java

        if (result == NO_INIT) {
            synchronized (this) {
                result = object;
                if (result == NO_INIT) {
```

## RuleId[ruleID=FuseStreamOperations]
### RuleId[ruleID=FuseStreamOperations]
Stream may be extended replacing 'sort'
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
        final Method[] methods = cls.getMethods();
        final List<Method> matchingMethods = Stream.of(methods)
            .filter(method -> method.getName().equals(methodName) && MemberUtils.isMatchingMethod(method, parameterTypes)).collect(Collectors.toList());

        // Sort methods by signature to force deterministic result
```

## RuleId[ruleID=NullArgumentToVariableArgMethod]
### RuleId[ruleID=NullArgumentToVariableArgMethod]
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/apache/commons/lang3/text/WordUtils.java`
#### Snippet
```java
     */
    public static String uncapitalize(final String str) {
        return uncapitalize(str, null);
    }

```

### RuleId[ruleID=NullArgumentToVariableArgMethod]
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/apache/commons/lang3/text/WordUtils.java`
#### Snippet
```java
     */
    public static String capitalize(final String str) {
        return capitalize(str, null);
    }

```

### RuleId[ruleID=NullArgumentToVariableArgMethod]
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/apache/commons/lang3/text/WordUtils.java`
#### Snippet
```java
     */
    public static String initials(final String str) {
        return initials(str, null);
    }

```

### RuleId[ruleID=NullArgumentToVariableArgMethod]
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/apache/commons/lang3/text/WordUtils.java`
#### Snippet
```java
     */
    public static String capitalizeFully(final String str) {
        return capitalizeFully(str, null);
    }

```

## RuleId[ruleID=TypeParameterExtendsObject]
### RuleId[ruleID=TypeParameterExtendsObject]
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
        final Method method;

        final Class<? extends Object> cls = object.getClass();
        if (forceAccess) {
            messagePrefix = "No such method: ";
```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Condition `parameterTypeSuperClassName != null` is always `true`
in `src/main/java/org/apache/commons/lang3/reflect/MethodUtils.java`
#### Snippet
```java
            final String parameterTypeSuperClassName = lastParameterType == null ? null : lastParameterType.getSuperclass().getName();

            if (parameterTypeName != null && parameterTypeSuperClassName != null && !methodParameterComponentTypeName.equals(parameterTypeName)
                && !methodParameterComponentTypeName.equals(parameterTypeSuperClassName)) {
                return null;
```

### RuleId[ruleID=ConstantValue]
Condition `tmp.length() != duration.length()` is always `false`
in `src/main/java/org/apache/commons/lang3/time/DurationFormatUtils.java`
#### Snippet
```java
                    tmp = StringUtils.replaceOnce(duration, " 0 minutes", StringUtils.EMPTY);
                    duration = tmp;
                    if (tmp.length() != duration.length()) {
                        duration = StringUtils.replaceOnce(tmp, " 0 seconds", StringUtils.EMPTY);
                    }
```

### RuleId[ruleID=ConstantValue]
Value `repeat` is always 'true'
in `src/main/java/org/apache/commons/lang3/StringUtils.java`
#### Snippet
```java
        }

        return replaceEach(result, searchList, replacementList, repeat, timeToLive - 1);
    }

```

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
Value `array` is always 'null'
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static short[] addFirst(final short[] array, final short element) {
        return array == null ? add(array, element) : insert(0, array, element);
    }

```

### RuleId[ruleID=ConstantValue]
Value `array` is always 'null'
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static float[] addFirst(final float[] array, final float element) {
        return array == null ? add(array, element) : insert(0, array, element);
    }

```

### RuleId[ruleID=ConstantValue]
Value `array` is always 'null'
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static char[] addFirst(final char[] array, final char element) {
        return array == null ? add(array, element) : insert(0, array, element);
    }

```

### RuleId[ruleID=ConstantValue]
Value `array` is always 'null'
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static <T> T[] addFirst(final T[] array, final T element) {
        return array == null ? add(array, element) : insert(0, array, element);
    }

```

### RuleId[ruleID=ConstantValue]
Value `array` is always 'null'
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static long[] addFirst(final long[] array, final long element) {
        return array == null ? add(array, element) : insert(0, array, element);
    }

```

### RuleId[ruleID=ConstantValue]
Value `array` is always 'null'
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static byte[] addFirst(final byte[] array, final byte element) {
        return array == null ? add(array, element) : insert(0, array, element);
    }

```

### RuleId[ruleID=ConstantValue]
Value `array` is always 'null'
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static boolean[] addFirst(final boolean[] array, final boolean element) {
        return array == null ? add(array, element) : insert(0, array, element);
    }

```

### RuleId[ruleID=ConstantValue]
Value `array` is always 'null'
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static double[] addFirst(final double[] array, final double element) {
        return array == null ? add(array, element) : insert(0, array, element);
    }

```

### RuleId[ruleID=ConstantValue]
Value `array` is always 'null'
in `src/main/java/org/apache/commons/lang3/ArrayUtils.java`
#### Snippet
```java
     */
    public static int[] addFirst(final int[] array, final int element) {
        return array == null ? add(array, element) : insert(0, array, element);
    }

```

## RuleId[ruleID=MethodOverridesStaticMethod]
### RuleId[ruleID=MethodOverridesStaticMethod]
Method `emptyArray()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/lang3/tuple/ImmutableTriple.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    public static <L, M, R> ImmutableTriple<L, M, R>[] emptyArray() {
        return (ImmutableTriple<L, M, R>[]) EMPTY_ARRAY;
    }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `ofNonNull()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/lang3/tuple/ImmutableTriple.java`
#### Snippet
```java
     * @since 3.13.0
     */
    public static <L, M, R> ImmutableTriple<L, M, R> ofNonNull(final L left, final M middle, final R right) {
        return of(Objects.requireNonNull(left, "left"), Objects.requireNonNull(middle, "middle"), Objects.requireNonNull(right, "right"));
    }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/lang3/tuple/ImmutableTriple.java`
#### Snippet
```java
     * @return a triple formed from the three parameters, not null
     */
    public static <L, M, R> ImmutableTriple<L, M, R> of(final L left, final M middle, final R right) {
        return left != null | middle != null || right != null ? new ImmutableTriple<>(left, middle, right) : nullTriple();
    }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `emptyArray()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/lang3/tuple/MutableTriple.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    public static <L, M, R> MutableTriple<L, M, R>[] emptyArray() {
        return (MutableTriple<L, M, R>[]) EMPTY_ARRAY;
    }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/lang3/tuple/MutableTriple.java`
#### Snippet
```java
     * @return a triple formed from the three parameters, not null
     */
    public static <L, M, R> MutableTriple<L, M, R> of(final L left, final M middle, final R right) {
        return new MutableTriple<>(left, middle, right);
    }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `ofNonNull()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/lang3/tuple/MutableTriple.java`
#### Snippet
```java
     * @since 3.13.0
     */
    public static <L, M, R> MutableTriple<L, M, R> ofNonNull(final L left, final M middle, final R right) {
        return of(Objects.requireNonNull(left, "left"), Objects.requireNonNull(middle, "middle"), Objects.requireNonNull(right, "right"));
    }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `below()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/lang3/text/translate/JavaUnicodeEscaper.java`
#### Snippet
```java
     * @return the newly created {@link UnicodeEscaper} instance
     */
    public static JavaUnicodeEscaper below(final int codePoint) {
        return outsideOf(codePoint, Integer.MAX_VALUE);
    }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `above()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/lang3/text/translate/JavaUnicodeEscaper.java`
#### Snippet
```java
     * @return the newly created {@link UnicodeEscaper} instance
     */
    public static JavaUnicodeEscaper above(final int codePoint) {
        return outsideOf(0, codePoint);
    }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `between()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/lang3/text/translate/JavaUnicodeEscaper.java`
#### Snippet
```java
     * @return the newly created {@link UnicodeEscaper} instance
     */
    public static JavaUnicodeEscaper between(final int codePointLow, final int codePointHigh) {
        return new JavaUnicodeEscaper(codePointLow, codePointHigh, true);
    }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `outsideOf()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/lang3/text/translate/JavaUnicodeEscaper.java`
#### Snippet
```java
     * @return the newly created {@link UnicodeEscaper} instance
     */
    public static JavaUnicodeEscaper outsideOf(final int codePointLow, final int codePointHigh) {
        return new JavaUnicodeEscaper(codePointLow, codePointHigh, false);
    }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/lang3/tuple/MutablePair.java`
#### Snippet
```java
     * @return a pair formed from the two parameters, not null
     */
    public static <L, R> MutablePair<L, R> of(final L left, final R right) {
        return new MutablePair<>(left, right);
    }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `ofNonNull()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/lang3/tuple/MutablePair.java`
#### Snippet
```java
     * @since 3.13.0
     */
    public static <L, R> MutablePair<L, R> ofNonNull(final L left, final R right) {
        return of(Objects.requireNonNull(left, "left"), Objects.requireNonNull(right, "right"));
    }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `emptyArray()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/lang3/tuple/MutablePair.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    public static <L, R> MutablePair<L, R>[] emptyArray() {
        return (MutablePair<L, R>[]) EMPTY_ARRAY;
    }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/lang3/tuple/MutablePair.java`
#### Snippet
```java
     * @return a pair formed from the map entry
     */
    public static <L, R> MutablePair<L, R> of(final Map.Entry<L, R> pair) {
        final L left;
        final R right;
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/lang3/tuple/ImmutablePair.java`
#### Snippet
```java
     * @since 3.10
     */
    public static <L, R> ImmutablePair<L, R> of(final Map.Entry<L, R> pair) {
        return pair != null ? new ImmutablePair<>(pair.getKey(), pair.getValue()) : nullPair();
    }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `of()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/lang3/tuple/ImmutablePair.java`
#### Snippet
```java
     * @return a pair formed from the two parameters, not null
     */
    public static <L, R> ImmutablePair<L, R> of(final L left, final R right) {
        return left != null || right != null ? new ImmutablePair<>(left, right) : nullPair();
    }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `ofNonNull()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/lang3/tuple/ImmutablePair.java`
#### Snippet
```java
     * @since 3.13.0
     */
    public static <L, R> ImmutablePair<L, R> ofNonNull(final L left, final R right) {
        return of(Objects.requireNonNull(left, "left"), Objects.requireNonNull(right, "right"));
    }
```

### RuleId[ruleID=MethodOverridesStaticMethod]
Method `emptyArray()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/lang3/tuple/ImmutablePair.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    public static <L, R> ImmutablePair<L, R>[] emptyArray() {
        return (ImmutablePair<L, R>[]) EMPTY_ARRAY;
    }
```

