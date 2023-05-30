# commons-validator 
 
# Bad smells
I found 262 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantCast | 82 | false |
| RegExpRedundantEscape | 65 | false |
| UnusedAssignment | 18 | false |
| JavadocDeclaration | 14 | false |
| TrivialIf | 13 | false |
| DeprecatedIsStillUsed | 10 | false |
| DuplicatedCode | 7 | false |
| UnnecessaryUnicodeEscape | 7 | false |
| StringConcatenationInsideStringBufferAppend | 7 | false |
| JavadocLinkAsPlainText | 5 | false |
| ConstantValue | 5 | false |
| StringBufferReplaceableByString | 4 | false |
| SimplifiableConditionalExpression | 4 | false |
| PointlessBitwiseExpression | 4 | false |
| CStyleArrayDeclaration | 3 | false |
| Deprecation | 3 | false |
| StringOperationCanBeSimplified | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| UnnecessarySemicolon | 1 | false |
| UnaryPlus | 1 | false |
| TrivialStringConcatenation | 1 | false |
| DanglingJavadoc | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| RegExpUnnecessaryNonCapturingGroup | 1 | false |
| CastCanBeRemovedNarrowingVariableType | 1 | false |
## RuleId[id=UnnecessarySemicolon]
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

## RuleId[id=UnaryPlus]
### UnaryPlus
Unary `+` operator
in `src/main/java/org/apache/commons/validator/routines/checkdigit/ModulusCheckDigit.java`
#### Snippet
```java
        }
        throw new CheckDigitException("Invalid Check Digit Value =" +
                + charValue);
    }

```

## RuleId[id=StringOperationCanBeSimplified]
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

## RuleId[id=CStyleArrayDeclaration]
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

### CStyleArrayDeclaration
C-style array declaration of local variable `indexedList`
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
        final int fieldIndex = this.methodParameterList.indexOf(Validator.FIELD_PARAM);

        final Object indexedList[] = field.getIndexedProperty(paramValues[beanIndex]);

        // Set current iteration object to the parameter array
```

## RuleId[id=DeprecatedIsStillUsed]
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
Deprecated member 'MASTERCARD_PRE_OCT2016' is still used
in `src/main/java/org/apache/commons/validator/routines/CreditCardValidator.java`
#### Snippet
```java
     */
    @Deprecated
    public static final long MASTERCARD_PRE_OCT2016 = 1 << 6; // CHECKSTYLE IGNORE MagicNumber


```

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

## RuleId[id=RegExpRedundantEscape]
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
        this.depends = depends;

        this.dependencyList.clear();

        final StringTokenizer st = new StringTokenizer(depends, ",");
        while (st.hasMoreTokens()) {
            final String depend = st.nextToken().trim();

            if (depend != null && !depend.isEmpty()) {
                this.dependencyList.add(depend);
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
        for (final Entry<String, String> entry : constants.entrySet()) {
            final String key1 = entry.getKey();
            final String key2 = TOKEN_START + key1 + TOKEN_END;
            final String replaceValue = entry.getValue();

            property = ValidatorUtils.replace(property, key2, replaceValue);

            processVars(key2, replaceValue);

            this.processMessageComponents(key2, replaceValue);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
            NumberFormat formatter = null;
            if (locale != null) {
                formatter = NumberFormat.getNumberInstance(locale);
            } else {
                formatter = NumberFormat.getNumberInstance(Locale.getDefault());
            }
            formatter.setParseIntegerOnly(true);
            final ParsePosition pos = new ParsePosition(0);
            final Number num = formatter.parse(value, pos);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/validator/GenericTypeValidator.java`
#### Snippet
```java
            NumberFormat formatter = null;
            if (locale != null) {
                formatter = NumberFormat.getInstance(locale);
            } else {
                formatter = NumberFormat.getInstance(Locale.getDefault());
            }
            final ParsePosition pos = new ParsePosition(0);
            final Number num = formatter.parse(value, pos);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/validator/UrlValidator.java`
#### Snippet
```java
        int tokenIndex = 0;
        int count = 0;
        while (tokenIndex != -1) {
            tokenIndex = target.indexOf(token, tokenIndex);
            if (tokenIndex > -1) {
                tokenIndex++;
                count++;
            }
        }
        return count;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/validator/routines/CurrencyValidator.java`
#### Snippet
```java
            final StringBuilder buffer = new StringBuilder(pattern.length());
            for (int i = 0; i < pattern.length(); i++) {
                if (pattern.charAt(i) != CURRENCY_SYMBOL) {
                    buffer.append(pattern.charAt(i));
                }
            }
            decimalFormat.applyPattern(buffer.toString());
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/validator/util/ValidatorUtils.java`
#### Snippet
```java
        map.forEach((key, value) -> {
            if (value instanceof Msg) {
                results.put(key, ((Msg) value).clone());
            } else if (value instanceof Arg) {
                results.put(key, ((Arg) value).clone());
            } else if (value instanceof Var) {
                results.put(key, ((Var) value).clone());
            } else {
                results.put(key, value);
            }
        });
```

## RuleId[id=StringBufferReplaceableByString]
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

## RuleId[id=Deprecation]
### Deprecation
'org.apache.commons.validator.DateValidator' is deprecated
in `src/main/java/org/apache/commons/validator/GenericValidator.java`
#### Snippet
```java
    public static boolean isDate(final String value, final String datePattern, final boolean strict) {
        // TODO method isValid() not yet supported in routines version
        return org.apache.commons.validator.DateValidator.getInstance().isValid(value, datePattern, strict);
    }

```

### Deprecation
'copyFastHashMap(org.apache.commons.collections.FastHashMap)' is deprecated
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
        }

        field.hVars = ValidatorUtils.copyFastHashMap(hVars);
        field.hMsgs = ValidatorUtils.copyFastHashMap(hMsgs);

```

### Deprecation
'copyFastHashMap(org.apache.commons.collections.FastHashMap)' is deprecated
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java

        field.hVars = ValidatorUtils.copyFastHashMap(hVars);
        field.hMsgs = ValidatorUtils.copyFastHashMap(hMsgs);

        return field;
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`(status == null) ? false : status.isValid()` can be simplified to 'status!=null \&\& status.isValid()'
in `src/main/java/org/apache/commons/validator/ValidatorResult.java`
#### Snippet
```java
    public boolean isValid(final String validatorName) {
        final ResultStatus status = hAction.get(validatorName);
        return (status == null) ? false : status.isValid();
    }

```

### SimplifiableConditionalExpression
`parsedValue == null ? false : true` can be simplified to 'parsedValue!=null'
in `src/main/java/org/apache/commons/validator/routines/AbstractCalendarValidator.java`
#### Snippet
```java
    public boolean isValid(final String value, final String pattern, final Locale locale) {
        final Object parsedValue = parse(value, pattern, locale, (TimeZone)null);
        return (parsedValue == null ? false : true);
    }

```

### SimplifiableConditionalExpression
`parsedValue == null ? false : true` can be simplified to 'parsedValue!=null'
in `src/main/java/org/apache/commons/validator/routines/AbstractNumberValidator.java`
#### Snippet
```java
    public boolean isValid(final String value, final String pattern, final Locale locale) {
        final Object parsedValue = parse(value, pattern, locale);
        return (parsedValue == null ? false : true);
    }

```

### SimplifiableConditionalExpression
`(sum == 0) ? false : (sum % 10 == 0)` can be simplified to 'sum!=0 \&\& (sum % 10 == 0)'
in `src/main/java/org/apache/commons/validator/CreditCardValidator.java`
#### Snippet
```java
        }

        return (sum == 0) ? false : (sum % 10 == 0);
    }

```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/commons/validator/CreditCardValidator.java`
#### Snippet
```java
            int digit = 0;
            try {
                digit = Integer.parseInt(cardNumber.charAt(count) + "");
            } catch (final NumberFormatException e) {
                return false;
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/commons/validator/routines/DomainValidator.java`
#### Snippet
```java
    }

    /**
     * The above instances must only be returned via the getInstance() methods.
     * This is to ensure that the override data arrays are properly protected.
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
                results.append(key1);
                results.append("=");
                results.append(getVarMap().get(key1));
                results.append("\n");
            }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/validator/UrlValidator.java`
#### Snippet
```java
 *
 * <p>Originally based in on php script by Debbie Dyer, validation.php v1.2b, Date: 03/07/02,
 * http://javascript.internet.com. However, this validation now bears little resemblance
 * to the php original.</p>
 * <pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/validator/routines/IBANValidator.java`
#### Snippet
```java
 * <p>
 * The validator includes a default set of formats derived from the IBAN registry at
 * https://www.swift.com/standards/data-standards/iban.
 * </p>
 * <p>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/validator/routines/UrlValidator.java`
#### Snippet
```java
 *
 * <p>Originally based in on php script by Debbie Dyer, validation.php v1.2b, Date: 03/07/02,
 * http://javascript.internet.com. However, this validation now bears little resemblance
 * to the php original.</p>
 * <pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/validator/routines/UrlValidator.java`
#### Snippet
```java

    /**
     * Allow local URLs, such as http://localhost/ or http://machine/ .
     * This enables a broad-brush check, for complex local machine name
     *  validation requirements you should create your validator with
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/validator/routines/UrlValidator.java`
#### Snippet
```java

    /**
     * Allow local URLs, such as http://localhost/ or http://machine/ .
     * This enables a broad-brush check, for complex local machine name
     *  validation requirements you should create your validator with
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/validator/DateValidator.java`
#### Snippet
```java
        }

        if (strict && (datePattern.length() != value.length())) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/validator/routines/InetAddressValidator.java`
#### Snippet
```java
            validOctets++;
        }
        if (validOctets > IPV6_MAX_HEX_GROUPS || (validOctets < IPV6_MAX_HEX_GROUPS && !containsCompressedZeroes)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/validator/UrlValidator.java`
#### Snippet
```java
        final int slashCount = countToken("/", path);
        final int dot2Count = countToken("..", path);
        if (dot2Count > 0 && (slashCount - slash2Count - 1) <= dot2Count){
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/validator/UrlValidator.java`
#### Snippet
```java
        }

        if (!isValidFragment(urlMatcher.group(PARSE_URL_FRAGMENT))) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/validator/UrlValidator.java`
#### Snippet
```java
        }

        if (options.isOff(ALLOW_ALL_SCHEMES) && !allowedSchemes.contains(scheme)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/validator/UrlValidator.java`
#### Snippet
```java

        final String extra = authorityMatcher.group(PARSE_AUTHORITY_EXTRA);
        if (!GenericValidator.isBlankOrNull(extra)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
            return false;
        }
        if (! TLD_PATTERN.matcher(tld).matches()) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
            return false;
        }
        if (!isValidSymbolicDomain(domain)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/validator/routines/EmailValidator.java`
#### Snippet
```java
        }

        if (!isValidDomain(emailMatcher.group(2))) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/validator/routines/UrlValidator.java`
#### Snippet
```java

        final int slash2Count = countToken("//", path);
        if (isOff(ALLOW_2_SLASHES) && (slash2Count > 0)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/validator/routines/UrlValidator.java`
#### Snippet
```java

        final String extra = authorityMatcher.group(PARSE_AUTHORITY_EXTRA);
        if (extra != null && !extra.trim().isEmpty()){
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/validator/routines/UrlValidator.java`
#### Snippet
```java
        }

        if (!isValidFragment(uri.getRawFragment())) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/validator/routines/UrlValidator.java`
#### Snippet
```java
        }

        if (isOff(ALLOW_ALL_SCHEMES) && !allowedSchemes.contains(scheme.toLowerCase(Locale.ENGLISH))) {
            return false;
        }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/validator/Form.java`
#### Snippet
```java
     * @return                     A ValidatorResults object containing all
     *      validation messages.
     * @throws ValidatorException
     */
    ValidatorResults validate(final Map<String, Object> params, final Map<String, ValidatorAction> actions, final int page)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/validator/Form.java`
#### Snippet
```java
     * @return                     A ValidatorResults object containing all
     *      validation messages.
     * @throws ValidatorException
     * @since 1.2.0
     */
```

### JavadocDeclaration
`@param results` tag description is missing
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
     * TODO ValidatorAction should know how to run its own dependencies.
     * @param va Run dependent validators for this action.
     * @param results
     * @param actions
     * @param pos
```

### JavadocDeclaration
`@param actions` tag description is missing
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
     * @param va Run dependent validators for this action.
     * @param results
     * @param actions
     * @param pos
     * @return true if all of the dependent validations passed.
```

### JavadocDeclaration
`@param pos` tag description is missing
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
     * @param results
     * @param actions
     * @param pos
     * @return true if all of the dependent validations passed.
     * @throws ValidatorException If there's an error running a validator
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
     * no know ValidatorAction configured for that name.
     * @param name The name of the validator in the depends list.
     * @throws ValidatorException
     */
    private void handleMissingAction(final String name) throws ValidatorException {
```

### JavadocDeclaration
`@param field` tag description is missing
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * Dynamically runs the validation method for this validator and returns
     * true if the data is valid.
     * @param field
     * @param params A Map of class names to parameter values.
     * @param results
```

### JavadocDeclaration
`@param results` tag description is missing
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * @param field
     * @param params A Map of class names to parameter values.
     * @param results
     * @param pos The index of the list property to validate if it's indexed.
     * @throws ValidatorException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * @param results
     * @param pos The index of the list property to validate if it's indexed.
     * @throws ValidatorException
     */
    boolean executeValidationMethod(
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * Load the Class object for the configured validation class name.
     * @param loader The ClassLoader used to load the Class object.
     * @throws ValidatorException
     */
    private void loadValidationClass(final ClassLoader loader)
```

### JavadocDeclaration
`@param field` tag description is missing
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * Modifies the paramValue array with indexed fields.
     *
     * @param field
     * @param pos
     * @param paramValues
```

### JavadocDeclaration
`@param pos` tag description is missing
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     *
     * @param field
     * @param pos
     * @param paramValues
     */
```

### JavadocDeclaration
`@param paramValues` tag description is missing
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
     * @param field
     * @param pos
     * @param paramValues
     */
    private void handleIndexedField(final Field field, final int pos, final Object[] paramValues)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/validator/ValidatorAction.java`
#### Snippet
```java
    /**
     * Load the Method object for the configured validation method name.
     * @throws ValidatorException
     */
    private void loadValidationMethod() throws ValidatorException {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/IntegerValidator.java`
#### Snippet
```java
     */
    public Integer validate(final String value, final Locale locale) {
        return (Integer)parse(value, (String)null, locale);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/IntegerValidator.java`
#### Snippet
```java
     */
    public Integer validate(final String value, final String pattern) {
        return (Integer)parse(value, pattern, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/IntegerValidator.java`
#### Snippet
```java
     */
    public Integer validate(final String value) {
        return (Integer)parse(value, (String)null, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/ShortValidator.java`
#### Snippet
```java
     */
    public Short validate(final String value, final String pattern) {
        return (Short)parse(value, pattern, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/IntegerValidator.java`
#### Snippet
```java
     */
    public Integer validate(final String value) {
        return (Integer)parse(value, (String)null, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/ShortValidator.java`
#### Snippet
```java
     */
    public Short validate(final String value) {
        return (Short)parse(value, (String)null, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/AbstractFormatValidator.java`
#### Snippet
```java
     */
    public String format(final Object value, final Locale locale) {
        return format(value, (String)null, locale);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/AbstractFormatValidator.java`
#### Snippet
```java
     */
    public String format(final Object value) {
        return format(value, (String)null, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/ShortValidator.java`
#### Snippet
```java
     */
    public Short validate(final String value) {
        return (Short)parse(value, (String)null, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/AbstractFormatValidator.java`
#### Snippet
```java
     */
    public String format(final Object value) {
        return format(value, (String)null, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/AbstractFormatValidator.java`
#### Snippet
```java
     */
    public boolean isValid(final String value) {
        return isValid(value, (String)null, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/ShortValidator.java`
#### Snippet
```java
     */
    public Short validate(final String value, final Locale locale) {
        return (Short)parse(value, (String)null, locale);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/AbstractFormatValidator.java`
#### Snippet
```java
     */
    public boolean isValid(final String value) {
        return isValid(value, (String)null, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/AbstractFormatValidator.java`
#### Snippet
```java
     */
    public String format(final Object value, final String pattern) {
        return format(value, pattern, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/AbstractFormatValidator.java`
#### Snippet
```java
     */
    public boolean isValid(final String value, final Locale locale) {
        return isValid(value, (String)null, locale);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/AbstractFormatValidator.java`
#### Snippet
```java
     */
    public boolean isValid(final String value, final String pattern) {
        return isValid(value, pattern, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/TimeValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value, final String pattern, final TimeZone timeZone) {
        return (Calendar)parse(value, pattern, (Locale)null, timeZone);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/TimeValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value, final Locale locale) {
        return (Calendar)parse(value, (String)null, locale, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `TimeZone` is redundant
in `src/main/java/org/apache/commons/validator/routines/TimeValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value, final Locale locale) {
        return (Calendar)parse(value, (String)null, locale, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/TimeValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value, final TimeZone timeZone) {
        return (Calendar)parse(value, (String)null, (Locale)null, timeZone);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/TimeValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value, final TimeZone timeZone) {
        return (Calendar)parse(value, (String)null, (Locale)null, timeZone);
    }

```

### RedundantCast
Casting `null` to `TimeZone` is redundant
in `src/main/java/org/apache/commons/validator/routines/TimeValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value, final String pattern, final Locale locale) {
        return (Calendar)parse(value, pattern, locale, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/TimeValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value, final Locale locale, final TimeZone timeZone) {
        return (Calendar)parse(value, (String)null, locale, timeZone);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/TimeValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value) {
        return (Calendar)parse(value, (String)null, (Locale)null, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/TimeValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value) {
        return (Calendar)parse(value, (String)null, (Locale)null, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `TimeZone` is redundant
in `src/main/java/org/apache/commons/validator/routines/TimeValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value) {
        return (Calendar)parse(value, (String)null, (Locale)null, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/TimeValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value, final String pattern) {
        return (Calendar)parse(value, pattern, (Locale)null, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `TimeZone` is redundant
in `src/main/java/org/apache/commons/validator/routines/TimeValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value, final String pattern) {
        return (Calendar)parse(value, pattern, (Locale)null, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/CalendarValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value) {
        return (Calendar)parse(value, (String)null, (Locale)null, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/CalendarValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value) {
        return (Calendar)parse(value, (String)null, (Locale)null, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `TimeZone` is redundant
in `src/main/java/org/apache/commons/validator/routines/CalendarValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value) {
        return (Calendar)parse(value, (String)null, (Locale)null, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `TimeZone` is redundant
in `src/main/java/org/apache/commons/validator/routines/CalendarValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value, final String pattern, final Locale locale) {
        return (Calendar)parse(value, pattern, locale, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/CalendarValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value, final String pattern) {
        return (Calendar)parse(value, pattern, (Locale)null, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `TimeZone` is redundant
in `src/main/java/org/apache/commons/validator/routines/CalendarValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value, final String pattern) {
        return (Calendar)parse(value, pattern, (Locale)null, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/CalendarValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value, final String pattern, final TimeZone timeZone) {
        return (Calendar)parse(value, pattern, (Locale)null, timeZone);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/CalendarValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value, final Locale locale, final TimeZone timeZone) {
        return (Calendar)parse(value, (String)null, locale, timeZone);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/CalendarValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value, final TimeZone timeZone) {
        return (Calendar)parse(value, (String)null, (Locale)null, timeZone);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/CalendarValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value, final TimeZone timeZone) {
        return (Calendar)parse(value, (String)null, (Locale)null, timeZone);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/CalendarValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value, final Locale locale) {
        return (Calendar)parse(value, (String)null, locale, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `TimeZone` is redundant
in `src/main/java/org/apache/commons/validator/routines/CalendarValidator.java`
#### Snippet
```java
     */
    public Calendar validate(final String value, final Locale locale) {
        return (Calendar)parse(value, (String)null, locale, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/DateValidator.java`
#### Snippet
```java
     */
    public Date validate(final String value, final Locale locale) {
        return (Date)parse(value, (String)null, locale, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `TimeZone` is redundant
in `src/main/java/org/apache/commons/validator/routines/DateValidator.java`
#### Snippet
```java
     */
    public Date validate(final String value, final Locale locale) {
        return (Date)parse(value, (String)null, locale, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/DateValidator.java`
#### Snippet
```java
     */
    public Date validate(final String value, final String pattern) {
        return (Date)parse(value, pattern, (Locale)null, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `TimeZone` is redundant
in `src/main/java/org/apache/commons/validator/routines/DateValidator.java`
#### Snippet
```java
     */
    public Date validate(final String value, final String pattern) {
        return (Date)parse(value, pattern, (Locale)null, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/DateValidator.java`
#### Snippet
```java
     */
    public Date validate(final String value, final Locale locale, final TimeZone timeZone) {
        return (Date)parse(value, (String)null, locale, timeZone);
    }

```

### RedundantCast
Casting `null` to `TimeZone` is redundant
in `src/main/java/org/apache/commons/validator/routines/DateValidator.java`
#### Snippet
```java
     */
    public Date validate(final String value, final String pattern, final Locale locale) {
        return (Date)parse(value, pattern, locale, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/DateValidator.java`
#### Snippet
```java
     */
    public Date validate(final String value, final TimeZone timeZone) {
        return (Date)parse(value, (String)null, (Locale)null, timeZone);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/DateValidator.java`
#### Snippet
```java
     */
    public Date validate(final String value, final TimeZone timeZone) {
        return (Date)parse(value, (String)null, (Locale)null, timeZone);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/DateValidator.java`
#### Snippet
```java
     */
    public Date validate(final String value) {
        return (Date)parse(value, (String)null, (Locale)null, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/DateValidator.java`
#### Snippet
```java
     */
    public Date validate(final String value) {
        return (Date)parse(value, (String)null, (Locale)null, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `TimeZone` is redundant
in `src/main/java/org/apache/commons/validator/routines/DateValidator.java`
#### Snippet
```java
     */
    public Date validate(final String value) {
        return (Date)parse(value, (String)null, (Locale)null, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/DateValidator.java`
#### Snippet
```java
     */
    public Date validate(final String value, final String pattern, final TimeZone timeZone) {
        return (Date)parse(value, pattern, (Locale)null, timeZone);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/AbstractCalendarValidator.java`
#### Snippet
```java
     */
    public String format(final Object value, final Locale locale, final TimeZone timeZone) {
        return format(value, (String)null, locale, timeZone);
    }

```

### RedundantCast
Casting `null` to `TimeZone` is redundant
in `src/main/java/org/apache/commons/validator/routines/AbstractCalendarValidator.java`
#### Snippet
```java
    @Override
    public String format(final Object value, final String pattern, final Locale locale) {
        return format(value, pattern, locale, (TimeZone)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/AbstractCalendarValidator.java`
#### Snippet
```java
     */
    public String format(final Object value, final TimeZone timeZone) {
        return format(value, (String)null, (Locale)null, timeZone);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/AbstractCalendarValidator.java`
#### Snippet
```java
     */
    public String format(final Object value, final TimeZone timeZone) {
        return format(value, (String)null, (Locale)null, timeZone);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/AbstractCalendarValidator.java`
#### Snippet
```java
     */
    public String format(final Object value, final String pattern, final TimeZone timeZone) {
        return format(value, pattern, (Locale)null, timeZone);
    }

```

### RedundantCast
Casting `null` to `TimeZone` is redundant
in `src/main/java/org/apache/commons/validator/routines/AbstractCalendarValidator.java`
#### Snippet
```java
    @Override
    public boolean isValid(final String value, final String pattern, final Locale locale) {
        final Object parsedValue = parse(value, pattern, locale, (TimeZone)null);
        return (parsedValue == null ? false : true);
    }
```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/ByteValidator.java`
#### Snippet
```java
     */
    public Byte validate(final String value, final String pattern) {
        return (Byte)parse(value, pattern, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/ByteValidator.java`
#### Snippet
```java
     */
    public Byte validate(final String value, final Locale locale) {
        return (Byte)parse(value, (String)null, locale);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/ByteValidator.java`
#### Snippet
```java
     */
    public Byte validate(final String value) {
        return (Byte)parse(value, (String)null, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/ByteValidator.java`
#### Snippet
```java
     */
    public Byte validate(final String value) {
        return (Byte)parse(value, (String)null, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/LongValidator.java`
#### Snippet
```java
     */
    public Long validate(final String value, final String pattern) {
        return (Long)parse(value, pattern, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/LongValidator.java`
#### Snippet
```java
     */
    public Long validate(final String value) {
        return (Long)parse(value, (String)null, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/LongValidator.java`
#### Snippet
```java
     */
    public Long validate(final String value) {
        return (Long)parse(value, (String)null, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/LongValidator.java`
#### Snippet
```java
     */
    public Long validate(final String value, final Locale locale) {
        return (Long)parse(value, (String)null, locale);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/FloatValidator.java`
#### Snippet
```java
     */
    public Float validate(final String value, final Locale locale) {
        return (Float)parse(value, (String)null, locale);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/FloatValidator.java`
#### Snippet
```java
     */
    public Float validate(final String value, final String pattern) {
        return (Float)parse(value, pattern, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/FloatValidator.java`
#### Snippet
```java
     */
    public Float validate(final String value) {
        return (Float)parse(value, (String)null, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/FloatValidator.java`
#### Snippet
```java
     */
    public Float validate(final String value) {
        return (Float)parse(value, (String)null, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/BigIntegerValidator.java`
#### Snippet
```java
     */
    public BigInteger validate(final String value, final Locale locale) {
        return (BigInteger)parse(value, (String)null, locale);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/BigIntegerValidator.java`
#### Snippet
```java
     */
    public BigInteger validate(final String value, final String pattern) {
        return (BigInteger)parse(value, pattern, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/BigIntegerValidator.java`
#### Snippet
```java
     */
    public BigInteger validate(final String value) {
        return (BigInteger)parse(value, (String)null, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/BigIntegerValidator.java`
#### Snippet
```java
     */
    public BigInteger validate(final String value) {
        return (BigInteger)parse(value, (String)null, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/BigDecimalValidator.java`
#### Snippet
```java
     */
    public BigDecimal validate(final String value, final Locale locale) {
        return (BigDecimal)parse(value, (String)null, locale);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/BigDecimalValidator.java`
#### Snippet
```java
     */
    public BigDecimal validate(final String value, final String pattern) {
        return (BigDecimal)parse(value, pattern, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/BigDecimalValidator.java`
#### Snippet
```java
     */
    public BigDecimal validate(final String value) {
        return (BigDecimal)parse(value, (String)null, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/BigDecimalValidator.java`
#### Snippet
```java
     */
    public BigDecimal validate(final String value) {
        return (BigDecimal)parse(value, (String)null, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/DoubleValidator.java`
#### Snippet
```java
     */
    public Double validate(final String value) {
        return (Double)parse(value, (String)null, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/DoubleValidator.java`
#### Snippet
```java
     */
    public Double validate(final String value) {
        return (Double)parse(value, (String)null, (Locale)null);
    }

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/main/java/org/apache/commons/validator/routines/DoubleValidator.java`
#### Snippet
```java
     */
    public Double validate(final String value, final Locale locale) {
        return (Double)parse(value, (String)null, locale);
    }

```

### RedundantCast
Casting `null` to `Locale` is redundant
in `src/main/java/org/apache/commons/validator/routines/DoubleValidator.java`
#### Snippet
```java
     */
    public Double validate(final String value, final String pattern) {
        return (Double)parse(value, pattern, (Locale)null);
    }

```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A4` can be replaced with '¤'
in `src/main/java/org/apache/commons/validator/routines/package-info.java`
#### Snippet
```java
 * IntegerValidator validator =
 * new IntegerValidator(true, IntegerValidator.CURRENCY_FORMAT);
 * String pattern = "#,###" + '\u00A4' + '\u00A4';  // Use international symbol
 * Integer fooAmount = validator.validate("10.100EUR", pattern, Locale.GERMAN);
 * if (fooAmount == null) {
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A4` can be replaced with '¤'
in `src/main/java/org/apache/commons/validator/routines/package-info.java`
#### Snippet
```java
 * IntegerValidator validator =
 * new IntegerValidator(true, IntegerValidator.CURRENCY_FORMAT);
 * String pattern = "#,###" + '\u00A4' + '\u00A4';  // Use international symbol
 * Integer fooAmount = validator.validate("10.100EUR", pattern, Locale.GERMAN);
 * if (fooAmount == null) {
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00A4` can be replaced with '¤'
in `src/main/java/org/apache/commons/validator/routines/CurrencyValidator.java`
#### Snippet
```java

    /** DecimalFormat's currency symbol */
    private static final char CURRENCY_SYMBOL = '\u00A4';

    /**
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u002E` can be replaced with '.'
in `src/main/java/org/apache/commons/validator/routines/DomainValidator.java`
#### Snippet
```java
            final char lastChar = input.charAt(length-1);// fetch original last char
            switch(lastChar) {
                case '\u002E': // "." full stop
                case '\u3002': // ideographic full stop
                case '\uFF0E': // fullwidth full stop
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u3002` can be replaced with '。'
in `src/main/java/org/apache/commons/validator/routines/DomainValidator.java`
#### Snippet
```java
            switch(lastChar) {
                case '\u002E': // "." full stop
                case '\u3002': // ideographic full stop
                case '\uFF0E': // fullwidth full stop
                case '\uFF61': // halfwidth ideographic full stop
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\uFF0E` can be replaced with '．'
in `src/main/java/org/apache/commons/validator/routines/DomainValidator.java`
#### Snippet
```java
                case '\u002E': // "." full stop
                case '\u3002': // ideographic full stop
                case '\uFF0E': // fullwidth full stop
                case '\uFF61': // halfwidth ideographic full stop
                    return ascii + "."; // restore the missing stop
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\uFF61` can be replaced with '｡'
in `src/main/java/org/apache/commons/validator/routines/DomainValidator.java`
#### Snippet
```java
                case '\u3002': // ideographic full stop
                case '\uFF0E': // fullwidth full stop
                case '\uFF61': // halfwidth ideographic full stop
                    return ascii + "."; // restore the missing stop
                default:
```

## RuleId[id=PointlessBitwiseExpression]
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
in `src/main/java/org/apache/commons/validator/routines/UrlValidator.java`
#### Snippet
```java
     * supplying a set of valid schemes.
     */
    public static final long ALLOW_ALL_SCHEMES = 1 << 0;

    /**
```

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
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

## RuleId[id=UnusedAssignment]
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
Variable `iIpSegment` initializer `0` is redundant
in `src/main/java/org/apache/commons/validator/EmailValidator.java`
#### Snippet
```java
            }

            int iIpSegment = 0;

            try {
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
Variable `indexProp` initializer `null` is redundant
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
     */
    Object[] getIndexedProperty(final Object bean) throws ValidatorException {
        Object indexProp = null;

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

## RuleId[id=ConstantValue]
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
Condition `depend != null` is always `true`
in `src/main/java/org/apache/commons/validator/Field.java`
#### Snippet
```java
            final String depend = st.nextToken().trim();

            if (depend != null && !depend.isEmpty()) {
                this.dependencyList.add(depend);
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

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
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

## RuleId[id=StringConcatenationInsideStringBufferAppend]
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

