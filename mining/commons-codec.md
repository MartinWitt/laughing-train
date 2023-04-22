# commons-codec 
 
# Bad smells
I found 530 bad smells with 20 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| AssignmentToMethodParameter | 152 | false |
| DynamicRegexReplaceableByCompiledPattern | 128 | false |
| DeprecatedIsStillUsed | 58 | false |
| ReturnNull | 55 | false |
| UnnecessaryFullyQualifiedName | 29 | false |
| UnusedAssignment | 15 | false |
| UtilityClassWithoutPrivateConstructor | 13 | true |
| AssignmentToForLoopParameter | 11 | false |
| ReplaceAssignmentWithOperatorAssignment | 10 | false |
| NestedAssignment | 7 | false |
| FinalStaticMethod | 6 | false |
| DataFlowIssue | 4 | false |
| RegExpRedundantEscape | 4 | false |
| MissortedModifiers | 4 | false |
| PointlessArithmeticExpression | 3 | false |
| BoundedWildcard | 3 | false |
| RedundantSuppression | 3 | false |
| ArrayEquality | 3 | false |
| Convert2MethodRef | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| NonProtectedConstructorInAbstractClass | 2 | true |
| RedundantFieldInitialization | 2 | false |
| RedundantOperationOnEmptyContainer | 1 | false |
| FieldMayBeStatic | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| FinalPrivateMethod | 1 | false |
| MismatchedJavadocCode | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| UnnecessaryToStringCall | 1 | true |
| TrivialStringConcatenation | 1 | false |
| StringEqualsEmptyString | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| SystemOutErr | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=RedundantOperationOnEmptyContainer]
### RedundantOperationOnEmptyContainer
Collection `nextBranches` is always empty
in `src/main/java/org/apache/commons/codec/language/DaitchMokotoffSoundex.java`
#### Snippet
```java
                if (rule.matches(inputContext)) {
                    if (branching) {
                        nextBranches.clear();
                    }
                    final String[] replacements = rule.getReplacements(inputContext, lastChar == '\0');
```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`1 * 256` can be replaced with '256'
in `src/main/java/org/apache/commons/codec/digest/PureJavaCrc32C.java`
#### Snippet
```java

  private static final int T8_0_START = 0 * 256;
  private static final int T8_1_START = 1 * 256;
  private static final int T8_2_START = 2 * 256;
  private static final int T8_3_START = 3 * 256;
```

### PointlessArithmeticExpression
`off+0` can be replaced with 'off'
in `src/main/java/org/apache/commons/codec/digest/PureJavaCrc32C.java`
#### Snippet
```java

    while(len > 7) {
      final int c0 =(b[off+0] ^ localCrc) & 0xff;
      final int c1 =(b[off+1] ^ (localCrc >>>= 8)) & 0xff;
      final int c2 =(b[off+2] ^ (localCrc >>>= 8)) & 0xff;
```

### PointlessArithmeticExpression
`0 * 256` can be replaced with '0'
in `src/main/java/org/apache/commons/codec/digest/PureJavaCrc32C.java`
#### Snippet
```java
  //   org.apache.hadoop.util.TestPureJavaCrc32\$Table 82F63B78

  private static final int T8_0_START = 0 * 256;
  private static final int T8_1_START = 1 * 256;
  private static final int T8_2_START = 2 * 256;
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `PAD` may be 'static'
in `src/main/java/org/apache/commons/codec/binary/BaseNCodec.java`
#### Snippet
```java
     */
    @Deprecated
    protected final byte PAD = PAD_DEFAULT; // instance variable just in case it needs to vary later

    /** Pad byte. Instance variable just in case it needs to vary later. */
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `CharSequenceUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/codec/binary/CharSequenceUtils.java`
#### Snippet
```java
 * @since 1.10
 */
public class CharSequenceUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `SoundexUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/codec/language/SoundexUtils.java`
#### Snippet
```java
 * @since 1.3
 */
final class SoundexUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Resources` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/codec/Resources.java`
#### Snippet
```java
 * @since 1.12
 */
public class Resources {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Md5Crypt` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/codec/digest/Md5Crypt.java`
#### Snippet
```java
 * @since 1.7
 */
public class Md5Crypt {

    /** The Identifier of the Apache variant. */
```

### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/codec/net/Utils.java`
#### Snippet
```java
 * @since 1.4
 */
class Utils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `UnixCrypt` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/codec/digest/UnixCrypt.java`
#### Snippet
```java
 * @since 1.7
 */
public class UnixCrypt {

    private static final int[] CON_SALT = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
```

### UtilityClassWithoutPrivateConstructor
Class `Charsets` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/codec/Charsets.java`
#### Snippet
```java
 * @since 1.7
 */
public class Charsets {

    //
```

### UtilityClassWithoutPrivateConstructor
Class `B64` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/codec/digest/B64.java`
#### Snippet
```java
 * @since 1.7
 */
class B64 {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CharEncoding` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/codec/CharEncoding.java`
#### Snippet
```java
 * @since 1.4
 */
public class CharEncoding {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Crypt` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/codec/digest/Crypt.java`
#### Snippet
```java
 * @since 1.7
 */
public class Crypt {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `StringUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/codec/binary/StringUtils.java`
#### Snippet
```java
 * @since 1.4
 */
public class StringUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ResourceConstants` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/codec/language/bm/ResourceConstants.java`
#### Snippet
```java
 * @since 1.6
 */
class ResourceConstants {

    static final String CMT = "//";
```

### UtilityClassWithoutPrivateConstructor
Class `Sha2Crypt` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/codec/digest/Sha2Crypt.java`
#### Snippet
```java
 * @since 1.7
 */
public class Sha2Crypt {

    /** Default number of rounds if not explicitly specified. */
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `encode` may produce `NullPointerException`
in `src/main/java/org/apache/commons/codec/StringEncoderComparator.java`
#### Snippet
```java
            @SuppressWarnings("unchecked") // May fail with CCE if encode returns something that is not Comparable
            // However this was always the case.
            final Comparable<Comparable<?>> s1 = (Comparable<Comparable<?>>) this.stringEncoder.encode(o1);
            final Comparable<?> s2 = (Comparable<?>) this.stringEncoder.encode(o2);
            compareCode = s1.compareTo(s2);
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/codec/StringEncoderComparator.java`
#### Snippet
```java
            compareCode = s1.compareTo(s2);
        } catch (final EncoderException ee) {
            compareCode = 0;
        }
        return compareCode;
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/codec/digest/UnixCrypt.java`
#### Snippet
```java
        }

        t = right;
        right = left >>> 1 | left << 31;
        left = t >>> 1 | t << 31;
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/codec/net/PercentCodec.java`
#### Snippet
```java
                byte bb = b;
                if (bb < 0) {
                    bb = (byte) (256 + bb);
                }
                final char hex1 = Utils.hexDigit(bb >> 4);
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `src/main/java/org/apache/commons/codec/language/bm/PhoneticEngine.java`
#### Snippet
```java
     */
    private static String join(final List<String> strings, final String sep) {
        return strings.stream().collect(Collectors.joining(sep));
    }

```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'WWW_FORM_URL' is still used
in `src/main/java/org/apache/commons/codec/net/URLCodec.java`
#### Snippet
```java
     */
    @Deprecated
    protected static final BitSet WWW_FORM_URL;

    private static final BitSet WWW_FORM_URL_SAFE = new BitSet(256);
```

### DeprecatedIsStillUsed
Deprecated member 'UTF_16LE' is still used
in `src/main/java/org/apache/commons/codec/Charsets.java`
#### Snippet
```java
     */
    @Deprecated
    public static final Charset UTF_16LE = StandardCharsets.UTF_16LE;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'UTF_16' is still used
in `src/main/java/org/apache/commons/codec/Charsets.java`
#### Snippet
```java
     */
    @Deprecated
    public static final Charset UTF_16 = StandardCharsets.UTF_16;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'UTF_16BE' is still used
in `src/main/java/org/apache/commons/codec/Charsets.java`
#### Snippet
```java
     */
    @Deprecated
    public static final Charset UTF_16BE = StandardCharsets.UTF_16BE;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'US_ASCII' is still used
in `src/main/java/org/apache/commons/codec/Charsets.java`
#### Snippet
```java
     */
    @Deprecated
    public static final Charset US_ASCII = StandardCharsets.US_ASCII;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'getHmacSha256' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static Mac getHmacSha256(final byte[] key) {
        return getInitializedMac(HmacAlgorithms.HMAC_SHA_256, key);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacMd5Hex' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String hmacMd5Hex(final byte[] key, final InputStream valueToDigest) throws IOException {
        return new HmacUtils(HmacAlgorithms.HMAC_MD5, key).hmacHex(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha512' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static byte[] hmacSha512(final byte[] key, final InputStream valueToDigest) throws IOException {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_512, key).hmac(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha1Hex' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String hmacSha1Hex(final String key, final String valueToDigest) {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_1, key).hmacHex(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacMd5Hex' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String hmacMd5Hex(final byte[] key, final byte[] valueToDigest) {
        return new HmacUtils(HmacAlgorithms.HMAC_MD5, key).hmacHex(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getHmacSha384' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static Mac getHmacSha384(final byte[] key) {
        return getInitializedMac(HmacAlgorithms.HMAC_SHA_384, key);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha256' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static byte[] hmacSha256(final String key, final String valueToDigest) {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key).hmac(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha512Hex' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String hmacSha512Hex(final String key, final String valueToDigest) {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_512, key).hmacHex(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getHmacMd5' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static Mac getHmacMd5(final byte[] key) {
        return getInitializedMac(HmacAlgorithms.HMAC_MD5, key);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha384' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static byte[] hmacSha384(final byte[] key, final InputStream valueToDigest) throws IOException {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_384, key).hmac(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha1' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static byte[] hmacSha1(final byte[] key, final byte[] valueToDigest) {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_1, key).hmac(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha1Hex' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String hmacSha1Hex(final byte[] key, final byte[] valueToDigest) {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_1, key).hmacHex(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha256Hex' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String hmacSha256Hex(final byte[] key, final InputStream valueToDigest) throws IOException {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key).hmacHex(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha256' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static byte[] hmacSha256(final byte[] key, final byte[] valueToDigest) {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key).hmac(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha1' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static byte[] hmacSha1(final String key, final String valueToDigest) {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_1, key).hmac(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha1Hex' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String hmacSha1Hex(final byte[] key, final InputStream valueToDigest) throws IOException {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_1, key).hmacHex(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha512Hex' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String hmacSha512Hex(final byte[] key, final InputStream valueToDigest) throws IOException {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_512, key).hmacHex(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha256Hex' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String hmacSha256Hex(final String key, final String valueToDigest) {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key).hmacHex(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacMd5' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static byte[] hmacMd5(final byte[] key, final byte[] valueToDigest) {
        return new HmacUtils(HmacAlgorithms.HMAC_MD5, key).hmac(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha256Hex' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String hmacSha256Hex(final byte[] key, final byte[] valueToDigest) {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key).hmacHex(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha512' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static byte[] hmacSha512(final String key, final String valueToDigest) {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_512, key).hmac(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha384Hex' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String hmacSha384Hex(final byte[] key, final InputStream valueToDigest) throws IOException {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_384, key).hmacHex(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha384' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static byte[] hmacSha384(final byte[] key, final byte[] valueToDigest) {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_384, key).hmac(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha512Hex' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String hmacSha512Hex(final byte[] key, final byte[] valueToDigest) {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_512, key).hmacHex(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getHmacSha1' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static Mac getHmacSha1(final byte[] key) {
        return getInitializedMac(HmacAlgorithms.HMAC_SHA_1, key);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha384Hex' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String hmacSha384Hex(final String key, final String valueToDigest) {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_384, key).hmacHex(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha384Hex' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String hmacSha384Hex(final byte[] key, final byte[] valueToDigest) {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_384, key).hmacHex(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha256' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static byte[] hmacSha256(final byte[] key, final InputStream valueToDigest) throws IOException {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key).hmac(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getHmacSha512' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static Mac getHmacSha512(final byte[] key) {
        return getInitializedMac(HmacAlgorithms.HMAC_SHA_512, key);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacMd5' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static byte[] hmacMd5(final String key, final String valueToDigest) {
        return new HmacUtils(HmacAlgorithms.HMAC_MD5, key).hmac(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha1' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static byte[] hmacSha1(final byte[] key, final InputStream valueToDigest) throws IOException {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_1, key).hmac(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha512' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static byte[] hmacSha512(final byte[] key, final byte[] valueToDigest) {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_512, key).hmac(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacMd5' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static byte[] hmacMd5(final byte[] key, final InputStream valueToDigest) throws IOException {
        return new HmacUtils(HmacAlgorithms.HMAC_MD5, key).hmac(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacSha384' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static byte[] hmacSha384(final String key, final String valueToDigest) {
        return new HmacUtils(HmacAlgorithms.HMAC_SHA_384, key).hmac(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hmacMd5Hex' is still used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String hmacMd5Hex(final String key, final String valueToDigest) {
        return new HmacUtils(HmacAlgorithms.HMAC_MD5, key).hmacHex(valueToDigest);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'shaHex' is still used
in `src/main/java/org/apache/commons/codec/digest/DigestUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String shaHex(final InputStream data) throws IOException {
        return sha1Hex(data);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'shaHex' is still used
in `src/main/java/org/apache/commons/codec/digest/DigestUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String shaHex(final String data) {
        return sha1Hex(data);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'shaHex' is still used
in `src/main/java/org/apache/commons/codec/digest/DigestUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static String shaHex(final byte[] data) {
        return sha1Hex(data);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'getShaDigest' is still used
in `src/main/java/org/apache/commons/codec/digest/DigestUtils.java`
#### Snippet
```java
     */
    @Deprecated
    public static MessageDigest getShaDigest() {
        return getSha1Digest();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hash128' is still used
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
     */
    @Deprecated
    public static long[] hash128(final byte[] data, final int offset, final int length, final int seed) {
        // ************
        // Note: This deliberately fails to apply masking using 0xffffffffL to the seed
```

### DeprecatedIsStillUsed
Deprecated member 'hash64' is still used
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
     */
    @Deprecated
    public static long hash64(final byte[] data, final int offset, final int length) {
        return hash64(data, offset, length, DEFAULT_SEED);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hash64' is still used
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
     */
    @Deprecated
    public static long hash64(final short data) {
        long hash = DEFAULT_SEED;
        long k1 = 0;
```

### DeprecatedIsStillUsed
Deprecated member 'hash32' is still used
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
     */
    @Deprecated
    public static int hash32(final String data) {
        final byte[] bytes = StringUtils.getBytesUtf8(data);
        return hash32(bytes, 0, bytes.length, DEFAULT_SEED);
```

### DeprecatedIsStillUsed
Deprecated member 'hash64' is still used
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
     */
    @Deprecated
    public static long hash64(final byte[] data, final int offset, final int length, final int seed) {
        // ************
        // Note: This fails to apply masking using 0xffffffffL to the seed.
```

### DeprecatedIsStillUsed
Deprecated member 'hash32' is still used
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
     */
    @Deprecated
    public static int hash32(final byte[] data, final int length) {
        return hash32(data, length, DEFAULT_SEED);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hash32' is still used
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
     */
    @Deprecated
    public static int hash32(final byte[] data) {
        return hash32(data, 0, data.length, DEFAULT_SEED);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hash128' is still used
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
     */
    @Deprecated
    public static long[] hash128(final String data) {
        final byte[] bytes = StringUtils.getBytesUtf8(data);
        return hash128(bytes, 0, bytes.length, DEFAULT_SEED);
```

### DeprecatedIsStillUsed
Deprecated member 'hash64' is still used
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
     */
    @Deprecated
    public static long hash64(final long data) {
        long hash = DEFAULT_SEED;
        long k = Long.reverseBytes(data);
```

### DeprecatedIsStillUsed
Deprecated member 'hash64' is still used
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
     */
    @Deprecated
    public static long hash64(final byte[] data) {
        return hash64(data, 0, data.length, DEFAULT_SEED);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'hash32' is still used
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
     */
    @Deprecated
    public static int hash32(final byte[] data, final int offset, final int length, final int seed) {
        int hash = seed;
        final int nblocks = length >> 2;
```

### DeprecatedIsStillUsed
Deprecated member 'hash32' is still used
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
     */
    @Deprecated
    public static int hash32(final byte[] data, final int length, final int seed) {
        return hash32(data, 0, length, seed);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'IncrementalHash32' is still used
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
     */
    @Deprecated
    public static class IncrementalHash32 extends IncrementalHash32x86 {

        /**
```

### DeprecatedIsStillUsed
Deprecated member 'hash64' is still used
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
     */
    @Deprecated
    public static long hash64(final int data) {
        long k1 = Integer.reverseBytes(data) & (-1L >>> 32);
        long hash = DEFAULT_SEED;
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/org/apache/commons/codec/language/bm/Rule.java`
#### Snippet
```java
        final Map<String, List<Rule>> ruleMap = getInstanceMap(nameType, rt, langs);
        final List<Rule> allRules = new ArrayList<>();
        ruleMap.values().forEach(rules -> allRules.addAll(rules));
        return allRules;
    }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `src/main/java/org/apache/commons/codec/language/bm/Languages.java`
#### Snippet
```java
            }
            final SomeLanguages someLanguages = (SomeLanguages) other;
            return from(languages.stream().filter(lang -> someLanguages.languages.contains(lang)).collect(Collectors.toSet()));
        }

```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `src/main/java/org/apache/commons/codec/digest/Md5Crypt.java`
#### Snippet
```java
            saltString = B64.getRandomSalt(8, random);
        } else {
            final Pattern p = Pattern.compile("^" + prefix.replace("$", "\\$") + "([\\.\\/a-zA-Z0-9]{1,8}).*");
            final Matcher m = p.matcher(salt);
            if (!m.find()) {
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `src/main/java/org/apache/commons/codec/digest/Md5Crypt.java`
#### Snippet
```java
            saltString = B64.getRandomSalt(8, random);
        } else {
            final Pattern p = Pattern.compile("^" + prefix.replace("$", "\\$") + "([\\.\\/a-zA-Z0-9]{1,8}).*");
            final Matcher m = p.matcher(salt);
            if (!m.find()) {
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `src/main/java/org/apache/commons/codec/digest/Sha2Crypt.java`
#### Snippet
```java
    /** The pattern to match valid salt values. */
    private static final Pattern SALT_PATTERN = Pattern
            .compile("^\\$([56])\\$(rounds=(\\d+)\\$)?([\\.\\/a-zA-Z0-9]{1,16}).*");

    /**
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `src/main/java/org/apache/commons/codec/digest/Sha2Crypt.java`
#### Snippet
```java
    /** The pattern to match valid salt values. */
    private static final Pattern SALT_PATTERN = Pattern
            .compile("^\\$([56])\\$(rounds=(\\d+)\\$)?([\\.\\/a-zA-Z0-9]{1,16}).*");

    /**
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/commons/codec/net/QuotedPrintableCodec.java`
#### Snippet
```java
     * @return The number of bytes written to the {@code buffer}
     */
    private static final int encodeQuotedPrintable(final int b, final ByteArrayOutputStream buffer) {
        buffer.write(ESCAPE_CHAR);
        final char hex1 = Utils.hexDigit(b >> 4);
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return 'true' but there's no such enum constant in CodecPolicy
in `src/main/java/org/apache/commons/codec/binary/BaseNCodec.java`
#### Snippet
```java
     * </p>
     *
     * @return true if using strict decoding
     * @since 1.15
     */
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/codec/language/DaitchMokotoffSoundex.java`
#### Snippet
```java
        private final String[] replacementDefault;

        protected Rule(final String pattern, final String replacementAtStart, final String replacementBeforeVowel,
                final String replacementDefault) {
            this.pattern = pattern;
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `src/main/java/org/apache/commons/codec/language/bm/Rule.java`
#### Snippet
```java
                            @Override
                            public String toString() {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Rule");
                                sb.append("{line=").append(myLine);
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `src/main/java/org/apache/commons/codec/net/RFC1522Codec.java`
#### Snippet
```java
            return null;
        }
        final StringBuilder buffer = new StringBuilder();
        buffer.append(PREFIX);
        buffer.append(charset);
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/codec/language/DaitchMokotoffSoundex.java`
#### Snippet
```java
        public Branch createBranch() {
            final Branch branch = new Branch();
            branch.builder.append(toString());
            branch.lastReplacement = this.lastReplacement;
            return branch;
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/codec/net/QuotedPrintableCodec.java`
#### Snippet
```java
     * @since 1.10
     */
    public static final byte[] encodeQuotedPrintable(BitSet printable, final byte[] bytes, final boolean strict) {
        if (bytes == null) {
            return null;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/codec/net/QuotedPrintableCodec.java`
#### Snippet
```java
     *             Thrown if quoted-printable decoding is unsuccessful
     */
    public static final byte[] decodeQuotedPrintable(final byte[] bytes) throws DecoderException {
        if (bytes == null) {
            return null;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/codec/net/QuotedPrintableCodec.java`
#### Snippet
```java
     * @return The number of bytes written to the {@code buffer}
     */
    private static final int encodeQuotedPrintable(final int b, final ByteArrayOutputStream buffer) {
        buffer.write(ESCAPE_CHAR);
        final char hex1 = Utils.hexDigit(b >> 4);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/codec/net/QuotedPrintableCodec.java`
#### Snippet
```java
     * @return array of bytes containing quoted-printable data
     */
    public static final byte[] encodeQuotedPrintable(final BitSet printable, final byte[] bytes) {
        return encodeQuotedPrintable(printable, bytes, false);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/codec/net/URLCodec.java`
#### Snippet
```java
     *             Thrown if URL decoding is unsuccessful
     */
    public static final byte[] decodeUrl(final byte[] bytes) throws DecoderException {
        if (bytes == null) {
            return null;
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/codec/net/URLCodec.java`
#### Snippet
```java
     * @return array of bytes containing URL safe characters
     */
    public static final byte[] encodeUrl(BitSet urlsafe, final byte[] bytes) {
        if (bytes == null) {
            return null;
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/codec/net/QuotedPrintableCodec.java`
#### Snippet
```java
                try {
                    // if the next octet is a CR we have found a soft line break
                    if (bytes[++i] == CR) {
                        continue;
                    }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/codec/net/QuotedPrintableCodec.java`
#### Snippet
```java
                    }
                    final int u = Utils.digit16(bytes[i]);
                    final int l = Utils.digit16(bytes[++i]);
                    buffer.write((char) ((u << 4) + l));
                } catch (final ArrayIndexOutOfBoundsException e) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/codec/net/URLCodec.java`
#### Snippet
```java
            } else if (b == ESCAPE_CHAR) {
                try {
                    final int u = Utils.digit16(bytes[++i]);
                    final int l = Utils.digit16(bytes[++i]);
                    buffer.write((char) ((u << 4) + l));
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/codec/net/URLCodec.java`
#### Snippet
```java
                try {
                    final int u = Utils.digit16(bytes[++i]);
                    final int l = Utils.digit16(bytes[++i]);
                    buffer.write((char) ((u << 4) + l));
                } catch (final ArrayIndexOutOfBoundsException e) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `src/main/java/org/apache/commons/codec/binary/Hex.java`
#### Snippet
```java
        // two characters form the hex value.
        for (int i = dataOffset, j = outOffset; i < dataOffset + dataLen; i++) {
            out[j++] = toDigits[(0xF0 & data[i]) >>> 4];
            out[j++] = toDigits[0x0F & data[i]];
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `src/main/java/org/apache/commons/codec/binary/Hex.java`
#### Snippet
```java
        for (int i = dataOffset, j = outOffset; i < dataOffset + dataLen; i++) {
            out[j++] = toDigits[(0xF0 & data[i]) >>> 4];
            out[j++] = toDigits[0x0F & data[i]];
        }
    }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `src/main/java/org/apache/commons/codec/binary/Hex.java`
#### Snippet
```java
        for (int i = outOffset, j = 0; j < len; i++) {
            int f = toDigit(data[j], j) << 4;
            j++;
            f = f | toDigit(data[j], j);
            j++;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `src/main/java/org/apache/commons/codec/binary/Hex.java`
#### Snippet
```java
            j++;
            f = f | toDigit(data[j], j);
            j++;
            out[i] = (byte) (f & 0xFF);
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `src/main/java/org/apache/commons/codec/language/DaitchMokotoffSoundex.java`
#### Snippet
```java
                        currentBranches.addAll(nextBranches);
                    }
                    index += rule.getPatternLength() - 1;
                    break;
                }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/codec/net/PercentCodec.java`
#### Snippet
```java
            if (b == ESCAPE_CHAR) {
                try {
                    final int u = Utils.digit16(bytes[++i]);
                    final int l = Utils.digit16(bytes[++i]);
                    buffer.put((byte) ((u << 4) + l));
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/codec/net/PercentCodec.java`
#### Snippet
```java
                try {
                    final int u = Utils.digit16(bytes[++i]);
                    final int l = Utils.digit16(bytes[++i]);
                    buffer.put((byte) ((u << 4) + l));
                } catch (final ArrayIndexOutOfBoundsException e) {
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/commons/codec/digest/UnixCrypt.java`
#### Snippet
```java
            final ThreadLocalRandom randomGenerator = ThreadLocalRandom.current();
            final int numSaltChars = SALT_CHARS.length;
            salt = "" + SALT_CHARS[randomGenerator.nextInt(numSaltChars)] +
                    SALT_CHARS[randomGenerator.nextInt(numSaltChars)];
        } else if (!salt.matches("^[" + B64.B64T_STRING + "]{2,}$")) {
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `CologneOutputBuffer` may be 'static'
in `src/main/java/org/apache/commons/codec/language/ColognePhonetic.java`
#### Snippet
```java
    }

    private class CologneOutputBuffer extends CologneBuffer {

        private char lastCode;
```

### InnerClassMayBeStatic
Inner class `CologneInputBuffer` may be 'static'
in `src/main/java/org/apache/commons/codec/language/ColognePhonetic.java`
#### Snippet
```java
    }

    private class CologneInputBuffer extends CologneBuffer {

        public CologneInputBuffer(final char[] data) {
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Character`
in `src/main/java/org/apache/commons/codec/language/DaitchMokotoffSoundex.java`
#### Snippet
```java

    private static void parseRules(final Scanner scanner, final String location,
            final Map<Character, List<Rule>> ruleMapping, final Map<Character, Character> asciiFoldings) {
        int currentLine = 0;
        boolean inMultilineComment = false;
```

### BoundedWildcard
Can generalize to `? super Character`
in `src/main/java/org/apache/commons/codec/language/DaitchMokotoffSoundex.java`
#### Snippet
```java

    private static void parseRules(final Scanner scanner, final String location,
            final Map<Character, List<Rule>> ruleMapping, final Map<Character, Character> asciiFoldings) {
        int currentLine = 0;
        boolean inMultilineComment = false;
```

### BoundedWildcard
Can generalize to `? super Character`
in `src/main/java/org/apache/commons/codec/language/DaitchMokotoffSoundex.java`
#### Snippet
```java

    private static void parseRules(final Scanner scanner, final String location,
            final Map<Character, List<Rule>> ruleMapping, final Map<Character, Character> asciiFoldings) {
        int currentLine = 0;
        boolean inMultilineComment = false;
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final public`
in `src/main/java/org/apache/commons/codec/digest/PureJavaCrc32C.java`
#### Snippet
```java

  @Override
  final public void update(final int b) {
    crc = (crc >>> 8) ^ T[T8_0_START + ((crc ^ b) & 0xff)];
  }
```

### MissortedModifiers
Missorted modifiers `final public`
in `src/main/java/org/apache/commons/codec/digest/PureJavaCrc32.java`
#### Snippet
```java

  @Override
  final public void update(final int b) {
    crc = (crc >>> 8) ^ T[(((crc ^ b) << 24) >>> 24)];
  }
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `src/main/java/org/apache/commons/codec/language/bm/Languages.java`
#### Snippet
```java
     * A set of languages.
     */
    public static abstract class LanguageSet {

        public static LanguageSet from(final Set<String> langs) {
```

### MissortedModifiers
Missorted modifiers `final private`
in `src/main/java/org/apache/commons/codec/language/Caverphone.java`
#### Snippet
```java
     * Delegate to a {@link Caverphone2} instance to avoid code duplication.
     */
    final private Caverphone2 encoder = new Caverphone2();

    /**
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/org/apache/commons/codec/net/RFC1522Codec.java`
#### Snippet
```java
        }
        final String charset = text.substring(from, to);
        if (charset.equals("")) {
            throw new DecoderException("RFC 1522 violation: charset not specified");
        }
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/codec/digest/DigestUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // Closing RandomAccessFile closes the channel.
    public static MessageDigest updateDigest(final MessageDigest digest, final RandomAccessFile data)
            throws IOException {
        return updateDigest(digest, data.getChannel());
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/codec/language/bm/Rule.java`
#### Snippet
```java

    @SuppressWarnings("resource") // Closing the Scanner closes the resource
    private static Scanner createScanner(final NameType nameType, final RuleType rt, final String lang) {
        final String resName = createResourceName(nameType, rt, lang);
        return new Scanner(Resources.getInputStream(resName), ResourceConstants.ENCODING);
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/codec/language/bm/Rule.java`
#### Snippet
```java

    @SuppressWarnings("resource") // Closing the Scanner closes the resource
    private static Scanner createScanner(final String lang) {
        final String resName = String.format("org/apache/commons/codec/language/bm/%s.txt", lang);
        return new Scanner(Resources.getInputStream(resName), ResourceConstants.ENCODING);
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/commons/codec/cli/Digest.java`
#### Snippet
```java
        this.args = args;
        algorithm = args[0];
        if (argsLength <= 1) {
            inputs = null;
        } else {
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/codec/cli/Digest.java`
#### Snippet
```java
        // shasum(1) has a -b option which generates " *" separator
        // we don't distinguish binary files at present
        System.out.println(prefix + Hex.encodeHexString(digest) + (fileName != null ? "  " + fileName : ""));
    }

```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java

        // 2. Remove anything not A-Z
        txt = txt.replaceAll("[^a-z]", "");

        // 2.5. Remove final e
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java

        // 2.5. Remove final e
        txt = txt.replaceAll("e$", ""); // 2.0 only

        // 3. Handle various start options
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java

        // 3. Handle various start options
        txt = txt.replaceAll("^cough", "cou2f");
        txt = txt.replaceAll("^rough", "rou2f");
        txt = txt.replaceAll("^tough", "tou2f");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        // 3. Handle various start options
        txt = txt.replaceAll("^cough", "cou2f");
        txt = txt.replaceAll("^rough", "rou2f");
        txt = txt.replaceAll("^tough", "tou2f");
        txt = txt.replaceAll("^enough", "enou2f"); // 2.0 only
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replaceAll("^cough", "cou2f");
        txt = txt.replaceAll("^rough", "rou2f");
        txt = txt.replaceAll("^tough", "tou2f");
        txt = txt.replaceAll("^enough", "enou2f"); // 2.0 only
        txt = txt.replaceAll("^trough", "trou2f"); // 2.0 only
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replaceAll("^rough", "rou2f");
        txt = txt.replaceAll("^tough", "tou2f");
        txt = txt.replaceAll("^enough", "enou2f"); // 2.0 only
        txt = txt.replaceAll("^trough", "trou2f"); // 2.0 only
                                                   // note the spec says ^enough here again, c+p error I assume
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replaceAll("^tough", "tou2f");
        txt = txt.replaceAll("^enough", "enou2f"); // 2.0 only
        txt = txt.replaceAll("^trough", "trou2f"); // 2.0 only
                                                   // note the spec says ^enough here again, c+p error I assume
        txt = txt.replaceAll("^gn", "2n");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replaceAll("^trough", "trou2f"); // 2.0 only
                                                   // note the spec says ^enough here again, c+p error I assume
        txt = txt.replaceAll("^gn", "2n");

        // End
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java

        // End
        txt = txt.replaceAll("mb$", "m2");

        // 4. Handle replacements
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java

        // 4. Handle replacements
        txt = txt.replace("cq", "2q");
        txt = txt.replace("ci", "si");
        txt = txt.replace("ce", "se");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        // 4. Handle replacements
        txt = txt.replace("cq", "2q");
        txt = txt.replace("ci", "si");
        txt = txt.replace("ce", "se");
        txt = txt.replace("cy", "sy");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("cq", "2q");
        txt = txt.replace("ci", "si");
        txt = txt.replace("ce", "se");
        txt = txt.replace("cy", "sy");
        txt = txt.replace("tch", "2ch");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("ci", "si");
        txt = txt.replace("ce", "se");
        txt = txt.replace("cy", "sy");
        txt = txt.replace("tch", "2ch");
        txt = txt.replace("c", "k");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("ce", "se");
        txt = txt.replace("cy", "sy");
        txt = txt.replace("tch", "2ch");
        txt = txt.replace("c", "k");
        txt = txt.replace("q", "k");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("cy", "sy");
        txt = txt.replace("tch", "2ch");
        txt = txt.replace("c", "k");
        txt = txt.replace("q", "k");
        txt = txt.replace("x", "k");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("tch", "2ch");
        txt = txt.replace("c", "k");
        txt = txt.replace("q", "k");
        txt = txt.replace("x", "k");
        txt = txt.replace("v", "f");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("c", "k");
        txt = txt.replace("q", "k");
        txt = txt.replace("x", "k");
        txt = txt.replace("v", "f");
        txt = txt.replace("dg", "2g");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("q", "k");
        txt = txt.replace("x", "k");
        txt = txt.replace("v", "f");
        txt = txt.replace("dg", "2g");
        txt = txt.replace("tio", "sio");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("x", "k");
        txt = txt.replace("v", "f");
        txt = txt.replace("dg", "2g");
        txt = txt.replace("tio", "sio");
        txt = txt.replace("tia", "sia");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("v", "f");
        txt = txt.replace("dg", "2g");
        txt = txt.replace("tio", "sio");
        txt = txt.replace("tia", "sia");
        txt = txt.replace("d", "t");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("dg", "2g");
        txt = txt.replace("tio", "sio");
        txt = txt.replace("tia", "sia");
        txt = txt.replace("d", "t");
        txt = txt.replace("ph", "fh");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("tio", "sio");
        txt = txt.replace("tia", "sia");
        txt = txt.replace("d", "t");
        txt = txt.replace("ph", "fh");
        txt = txt.replace("b", "p");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("tia", "sia");
        txt = txt.replace("d", "t");
        txt = txt.replace("ph", "fh");
        txt = txt.replace("b", "p");
        txt = txt.replace("sh", "s2");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("d", "t");
        txt = txt.replace("ph", "fh");
        txt = txt.replace("b", "p");
        txt = txt.replace("sh", "s2");
        txt = txt.replace("z", "s");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("ph", "fh");
        txt = txt.replace("b", "p");
        txt = txt.replace("sh", "s2");
        txt = txt.replace("z", "s");
        txt = txt.replaceAll("^[aeiou]", "A");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("b", "p");
        txt = txt.replace("sh", "s2");
        txt = txt.replace("z", "s");
        txt = txt.replaceAll("^[aeiou]", "A");
        txt = txt.replaceAll("[aeiou]", "3");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("sh", "s2");
        txt = txt.replace("z", "s");
        txt = txt.replaceAll("^[aeiou]", "A");
        txt = txt.replaceAll("[aeiou]", "3");
        txt = txt.replace("j", "y"); // 2.0 only
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("z", "s");
        txt = txt.replaceAll("^[aeiou]", "A");
        txt = txt.replaceAll("[aeiou]", "3");
        txt = txt.replace("j", "y"); // 2.0 only
        txt = txt.replaceAll("^y3", "Y3"); // 2.0 only
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replaceAll("^[aeiou]", "A");
        txt = txt.replaceAll("[aeiou]", "3");
        txt = txt.replace("j", "y"); // 2.0 only
        txt = txt.replaceAll("^y3", "Y3"); // 2.0 only
        txt = txt.replaceAll("^y", "A"); // 2.0 only
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replaceAll("[aeiou]", "3");
        txt = txt.replace("j", "y"); // 2.0 only
        txt = txt.replaceAll("^y3", "Y3"); // 2.0 only
        txt = txt.replaceAll("^y", "A"); // 2.0 only
        txt = txt.replace("y", "3"); // 2.0 only
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("j", "y"); // 2.0 only
        txt = txt.replaceAll("^y3", "Y3"); // 2.0 only
        txt = txt.replaceAll("^y", "A"); // 2.0 only
        txt = txt.replace("y", "3"); // 2.0 only
        txt = txt.replace("3gh3", "3kh3");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replaceAll("^y3", "Y3"); // 2.0 only
        txt = txt.replaceAll("^y", "A"); // 2.0 only
        txt = txt.replace("y", "3"); // 2.0 only
        txt = txt.replace("3gh3", "3kh3");
        txt = txt.replace("gh", "22");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replaceAll("^y", "A"); // 2.0 only
        txt = txt.replace("y", "3"); // 2.0 only
        txt = txt.replace("3gh3", "3kh3");
        txt = txt.replace("gh", "22");
        txt = txt.replace("g", "k");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("y", "3"); // 2.0 only
        txt = txt.replace("3gh3", "3kh3");
        txt = txt.replace("gh", "22");
        txt = txt.replace("g", "k");
        txt = txt.replaceAll("s+", "S");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("3gh3", "3kh3");
        txt = txt.replace("gh", "22");
        txt = txt.replace("g", "k");
        txt = txt.replaceAll("s+", "S");
        txt = txt.replaceAll("t+", "T");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("gh", "22");
        txt = txt.replace("g", "k");
        txt = txt.replaceAll("s+", "S");
        txt = txt.replaceAll("t+", "T");
        txt = txt.replaceAll("p+", "P");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("g", "k");
        txt = txt.replaceAll("s+", "S");
        txt = txt.replaceAll("t+", "T");
        txt = txt.replaceAll("p+", "P");
        txt = txt.replaceAll("k+", "K");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replaceAll("s+", "S");
        txt = txt.replaceAll("t+", "T");
        txt = txt.replaceAll("p+", "P");
        txt = txt.replaceAll("k+", "K");
        txt = txt.replaceAll("f+", "F");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replaceAll("t+", "T");
        txt = txt.replaceAll("p+", "P");
        txt = txt.replaceAll("k+", "K");
        txt = txt.replaceAll("f+", "F");
        txt = txt.replaceAll("m+", "M");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replaceAll("p+", "P");
        txt = txt.replaceAll("k+", "K");
        txt = txt.replaceAll("f+", "F");
        txt = txt.replaceAll("m+", "M");
        txt = txt.replaceAll("n+", "N");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replaceAll("k+", "K");
        txt = txt.replaceAll("f+", "F");
        txt = txt.replaceAll("m+", "M");
        txt = txt.replaceAll("n+", "N");
        txt = txt.replace("w3", "W3");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replaceAll("f+", "F");
        txt = txt.replaceAll("m+", "M");
        txt = txt.replaceAll("n+", "N");
        txt = txt.replace("w3", "W3");
        txt = txt.replace("wh3", "Wh3");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replaceAll("m+", "M");
        txt = txt.replaceAll("n+", "N");
        txt = txt.replace("w3", "W3");
        txt = txt.replace("wh3", "Wh3");
        txt = txt.replaceAll("w$", "3"); // 2.0 only
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replaceAll("n+", "N");
        txt = txt.replace("w3", "W3");
        txt = txt.replace("wh3", "Wh3");
        txt = txt.replaceAll("w$", "3"); // 2.0 only
        txt = txt.replace("w", "2");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("w3", "W3");
        txt = txt.replace("wh3", "Wh3");
        txt = txt.replaceAll("w$", "3"); // 2.0 only
        txt = txt.replace("w", "2");
        txt = txt.replaceAll("^h", "A");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("wh3", "Wh3");
        txt = txt.replaceAll("w$", "3"); // 2.0 only
        txt = txt.replace("w", "2");
        txt = txt.replaceAll("^h", "A");
        txt = txt.replace("h", "2");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replaceAll("w$", "3"); // 2.0 only
        txt = txt.replace("w", "2");
        txt = txt.replaceAll("^h", "A");
        txt = txt.replace("h", "2");
        txt = txt.replace("r3", "R3");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("w", "2");
        txt = txt.replaceAll("^h", "A");
        txt = txt.replace("h", "2");
        txt = txt.replace("r3", "R3");
        txt = txt.replaceAll("r$", "3"); // 2.0 only
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replaceAll("^h", "A");
        txt = txt.replace("h", "2");
        txt = txt.replace("r3", "R3");
        txt = txt.replaceAll("r$", "3"); // 2.0 only
        txt = txt.replace("r", "2");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("h", "2");
        txt = txt.replace("r3", "R3");
        txt = txt.replaceAll("r$", "3"); // 2.0 only
        txt = txt.replace("r", "2");
        txt = txt.replace("l3", "L3");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("r3", "R3");
        txt = txt.replaceAll("r$", "3"); // 2.0 only
        txt = txt.replace("r", "2");
        txt = txt.replace("l3", "L3");
        txt = txt.replaceAll("l$", "3"); // 2.0 only
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replaceAll("r$", "3"); // 2.0 only
        txt = txt.replace("r", "2");
        txt = txt.replace("l3", "L3");
        txt = txt.replaceAll("l$", "3"); // 2.0 only
        txt = txt.replace("l", "2");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("r", "2");
        txt = txt.replace("l3", "L3");
        txt = txt.replaceAll("l$", "3"); // 2.0 only
        txt = txt.replace("l", "2");

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("l3", "L3");
        txt = txt.replaceAll("l$", "3"); // 2.0 only
        txt = txt.replace("l", "2");

        // 5. Handle removals
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java

        // 5. Handle removals
        txt = txt.replace("2", "");
        txt = txt.replaceAll("3$", "A"); // 2.0 only
        txt = txt.replace("3", "");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        // 5. Handle removals
        txt = txt.replace("2", "");
        txt = txt.replaceAll("3$", "A"); // 2.0 only
        txt = txt.replace("3", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java
        txt = txt.replace("2", "");
        txt = txt.replaceAll("3$", "A"); // 2.0 only
        txt = txt.replace("3", "");

        // 6. put ten 1s on the end
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/digest/Md5Crypt.java`
#### Snippet
```java
            saltString = B64.getRandomSalt(8, random);
        } else {
            final Pattern p = Pattern.compile("^" + prefix.replace("$", "\\$") + "([\\.\\/a-zA-Z0-9]{1,8}).*");
            final Matcher m = p.matcher(salt);
            if (!m.find()) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java
        final String firstLetter = name.substring(0, 1);

        name = name.replace("A", EMPTY);
        name = name.replace("E", EMPTY);
        name = name.replace("I", EMPTY);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java

        name = name.replace("A", EMPTY);
        name = name.replace("E", EMPTY);
        name = name.replace("I", EMPTY);
        name = name.replace("O", EMPTY);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java
        name = name.replace("A", EMPTY);
        name = name.replace("E", EMPTY);
        name = name.replace("I", EMPTY);
        name = name.replace("O", EMPTY);
        name = name.replace("U", EMPTY);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java
        name = name.replace("E", EMPTY);
        name = name.replace("I", EMPTY);
        name = name.replace("O", EMPTY);
        name = name.replace("U", EMPTY);

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java
        name = name.replace("I", EMPTY);
        name = name.replace("O", EMPTY);
        name = name.replace("U", EMPTY);

        name = name.replaceAll("\\s{2,}\\b", SPACE);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java
        name = name.replace("U", EMPTY);

        name = name.replaceAll("\\s{2,}\\b", SPACE);

        // return isVowel(firstLetter) ? (firstLetter + name) : name;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java

        // Char arrays -> string & remove extraneous space
        final String strA = new String(name1Char).replaceAll("\\s+", EMPTY);
        final String strB = new String(name2Char).replaceAll("\\s+", EMPTY);

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java
        // Char arrays -> string & remove extraneous space
        final String strA = new String(name1Char).replaceAll("\\s+", EMPTY);
        final String strB = new String(name2Char).replaceAll("\\s+", EMPTY);

        // Final bit - subtract the longest string from 6 and return this int value
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java

        upperName = removeAccents(upperName);
        upperName = upperName.replaceAll("\\s+", EMPTY);

        return upperName;
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/digest/UnixCrypt.java`
#### Snippet
```java
            salt = "" + SALT_CHARS[randomGenerator.nextInt(numSaltChars)] +
                    SALT_CHARS[randomGenerator.nextInt(numSaltChars)];
        } else if (!salt.matches("^[" + B64.B64T_STRING + "]{2,}$")) {
            throw new IllegalArgumentException("Invalid salt value: " + salt);
        }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/bm/Lang.java`
#### Snippet
```java

                    // split it up
                    final String[] parts = line.split("\\s+");

                    if (parts.length != 3) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java

        // 2. Remove anything not A-Z
        txt = txt.replaceAll("[^a-z]", "");

        // 3. Handle various start options
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        // 3. Handle various start options
        // 2 is a temporary placeholder to indicate a consonant which we are no longer interested in.
        txt = txt.replaceAll("^cough", "cou2f");
        txt = txt.replaceAll("^rough", "rou2f");
        txt = txt.replaceAll("^tough", "tou2f");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        // 2 is a temporary placeholder to indicate a consonant which we are no longer interested in.
        txt = txt.replaceAll("^cough", "cou2f");
        txt = txt.replaceAll("^rough", "rou2f");
        txt = txt.replaceAll("^tough", "tou2f");
        txt = txt.replaceAll("^enough", "enou2f");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replaceAll("^cough", "cou2f");
        txt = txt.replaceAll("^rough", "rou2f");
        txt = txt.replaceAll("^tough", "tou2f");
        txt = txt.replaceAll("^enough", "enou2f");
        txt = txt.replaceAll("^gn", "2n");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replaceAll("^rough", "rou2f");
        txt = txt.replaceAll("^tough", "tou2f");
        txt = txt.replaceAll("^enough", "enou2f");
        txt = txt.replaceAll("^gn", "2n");

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replaceAll("^tough", "tou2f");
        txt = txt.replaceAll("^enough", "enou2f");
        txt = txt.replaceAll("^gn", "2n");

        // End
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java

        // End
        txt = txt.replaceAll("mb$", "m2");

        // 4. Handle replacements
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java

        // 4. Handle replacements
        txt = txt.replace("cq", "2q");
        txt = txt.replace("ci", "si");
        txt = txt.replace("ce", "se");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        // 4. Handle replacements
        txt = txt.replace("cq", "2q");
        txt = txt.replace("ci", "si");
        txt = txt.replace("ce", "se");
        txt = txt.replace("cy", "sy");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("cq", "2q");
        txt = txt.replace("ci", "si");
        txt = txt.replace("ce", "se");
        txt = txt.replace("cy", "sy");
        txt = txt.replace("tch", "2ch");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("ci", "si");
        txt = txt.replace("ce", "se");
        txt = txt.replace("cy", "sy");
        txt = txt.replace("tch", "2ch");
        txt = txt.replace("c", "k");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("ce", "se");
        txt = txt.replace("cy", "sy");
        txt = txt.replace("tch", "2ch");
        txt = txt.replace("c", "k");
        txt = txt.replace("q", "k");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("cy", "sy");
        txt = txt.replace("tch", "2ch");
        txt = txt.replace("c", "k");
        txt = txt.replace("q", "k");
        txt = txt.replace("x", "k");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("tch", "2ch");
        txt = txt.replace("c", "k");
        txt = txt.replace("q", "k");
        txt = txt.replace("x", "k");
        txt = txt.replace("v", "f");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("c", "k");
        txt = txt.replace("q", "k");
        txt = txt.replace("x", "k");
        txt = txt.replace("v", "f");
        txt = txt.replace("dg", "2g");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("q", "k");
        txt = txt.replace("x", "k");
        txt = txt.replace("v", "f");
        txt = txt.replace("dg", "2g");
        txt = txt.replace("tio", "sio");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("x", "k");
        txt = txt.replace("v", "f");
        txt = txt.replace("dg", "2g");
        txt = txt.replace("tio", "sio");
        txt = txt.replace("tia", "sia");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("v", "f");
        txt = txt.replace("dg", "2g");
        txt = txt.replace("tio", "sio");
        txt = txt.replace("tia", "sia");
        txt = txt.replace("d", "t");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("dg", "2g");
        txt = txt.replace("tio", "sio");
        txt = txt.replace("tia", "sia");
        txt = txt.replace("d", "t");
        txt = txt.replace("ph", "fh");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("tio", "sio");
        txt = txt.replace("tia", "sia");
        txt = txt.replace("d", "t");
        txt = txt.replace("ph", "fh");
        txt = txt.replace("b", "p");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("tia", "sia");
        txt = txt.replace("d", "t");
        txt = txt.replace("ph", "fh");
        txt = txt.replace("b", "p");
        txt = txt.replace("sh", "s2");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("d", "t");
        txt = txt.replace("ph", "fh");
        txt = txt.replace("b", "p");
        txt = txt.replace("sh", "s2");
        txt = txt.replace("z", "s");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("ph", "fh");
        txt = txt.replace("b", "p");
        txt = txt.replace("sh", "s2");
        txt = txt.replace("z", "s");
        txt = txt.replaceAll("^[aeiou]", "A");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("b", "p");
        txt = txt.replace("sh", "s2");
        txt = txt.replace("z", "s");
        txt = txt.replaceAll("^[aeiou]", "A");
        // 3 is a temporary placeholder marking a vowel
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("sh", "s2");
        txt = txt.replace("z", "s");
        txt = txt.replaceAll("^[aeiou]", "A");
        // 3 is a temporary placeholder marking a vowel
        txt = txt.replaceAll("[aeiou]", "3");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replaceAll("^[aeiou]", "A");
        // 3 is a temporary placeholder marking a vowel
        txt = txt.replaceAll("[aeiou]", "3");
        txt = txt.replace("3gh3", "3kh3");
        txt = txt.replace("gh", "22");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        // 3 is a temporary placeholder marking a vowel
        txt = txt.replaceAll("[aeiou]", "3");
        txt = txt.replace("3gh3", "3kh3");
        txt = txt.replace("gh", "22");
        txt = txt.replace("g", "k");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replaceAll("[aeiou]", "3");
        txt = txt.replace("3gh3", "3kh3");
        txt = txt.replace("gh", "22");
        txt = txt.replace("g", "k");
        txt = txt.replaceAll("s+", "S");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("3gh3", "3kh3");
        txt = txt.replace("gh", "22");
        txt = txt.replace("g", "k");
        txt = txt.replaceAll("s+", "S");
        txt = txt.replaceAll("t+", "T");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("gh", "22");
        txt = txt.replace("g", "k");
        txt = txt.replaceAll("s+", "S");
        txt = txt.replaceAll("t+", "T");
        txt = txt.replaceAll("p+", "P");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("g", "k");
        txt = txt.replaceAll("s+", "S");
        txt = txt.replaceAll("t+", "T");
        txt = txt.replaceAll("p+", "P");
        txt = txt.replaceAll("k+", "K");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replaceAll("s+", "S");
        txt = txt.replaceAll("t+", "T");
        txt = txt.replaceAll("p+", "P");
        txt = txt.replaceAll("k+", "K");
        txt = txt.replaceAll("f+", "F");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replaceAll("t+", "T");
        txt = txt.replaceAll("p+", "P");
        txt = txt.replaceAll("k+", "K");
        txt = txt.replaceAll("f+", "F");
        txt = txt.replaceAll("m+", "M");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replaceAll("p+", "P");
        txt = txt.replaceAll("k+", "K");
        txt = txt.replaceAll("f+", "F");
        txt = txt.replaceAll("m+", "M");
        txt = txt.replaceAll("n+", "N");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replaceAll("k+", "K");
        txt = txt.replaceAll("f+", "F");
        txt = txt.replaceAll("m+", "M");
        txt = txt.replaceAll("n+", "N");
        txt = txt.replace("w3", "W3");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replaceAll("f+", "F");
        txt = txt.replaceAll("m+", "M");
        txt = txt.replaceAll("n+", "N");
        txt = txt.replace("w3", "W3");
        txt = txt.replace("wy", "Wy"); // 1.0 only
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replaceAll("m+", "M");
        txt = txt.replaceAll("n+", "N");
        txt = txt.replace("w3", "W3");
        txt = txt.replace("wy", "Wy"); // 1.0 only
        txt = txt.replace("wh3", "Wh3");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replaceAll("n+", "N");
        txt = txt.replace("w3", "W3");
        txt = txt.replace("wy", "Wy"); // 1.0 only
        txt = txt.replace("wh3", "Wh3");
        txt = txt.replace("why", "Why"); // 1.0 only
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("w3", "W3");
        txt = txt.replace("wy", "Wy"); // 1.0 only
        txt = txt.replace("wh3", "Wh3");
        txt = txt.replace("why", "Why"); // 1.0 only
        txt = txt.replace("w", "2");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("wy", "Wy"); // 1.0 only
        txt = txt.replace("wh3", "Wh3");
        txt = txt.replace("why", "Why"); // 1.0 only
        txt = txt.replace("w", "2");
        txt = txt.replaceAll("^h", "A");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("wh3", "Wh3");
        txt = txt.replace("why", "Why"); // 1.0 only
        txt = txt.replace("w", "2");
        txt = txt.replaceAll("^h", "A");
        txt = txt.replace("h", "2");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("why", "Why"); // 1.0 only
        txt = txt.replace("w", "2");
        txt = txt.replaceAll("^h", "A");
        txt = txt.replace("h", "2");
        txt = txt.replace("r3", "R3");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("w", "2");
        txt = txt.replaceAll("^h", "A");
        txt = txt.replace("h", "2");
        txt = txt.replace("r3", "R3");
        txt = txt.replace("ry", "Ry"); // 1.0 only
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replaceAll("^h", "A");
        txt = txt.replace("h", "2");
        txt = txt.replace("r3", "R3");
        txt = txt.replace("ry", "Ry"); // 1.0 only
        txt = txt.replace("r", "2");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("h", "2");
        txt = txt.replace("r3", "R3");
        txt = txt.replace("ry", "Ry"); // 1.0 only
        txt = txt.replace("r", "2");
        txt = txt.replace("l3", "L3");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("r3", "R3");
        txt = txt.replace("ry", "Ry"); // 1.0 only
        txt = txt.replace("r", "2");
        txt = txt.replace("l3", "L3");
        txt = txt.replace("ly", "Ly"); // 1.0 only
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("ry", "Ry"); // 1.0 only
        txt = txt.replace("r", "2");
        txt = txt.replace("l3", "L3");
        txt = txt.replace("ly", "Ly"); // 1.0 only
        txt = txt.replace("l", "2");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("r", "2");
        txt = txt.replace("l3", "L3");
        txt = txt.replace("ly", "Ly"); // 1.0 only
        txt = txt.replace("l", "2");
        txt = txt.replace("j", "y"); // 1.0 only
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("l3", "L3");
        txt = txt.replace("ly", "Ly"); // 1.0 only
        txt = txt.replace("l", "2");
        txt = txt.replace("j", "y"); // 1.0 only
        txt = txt.replace("y3", "Y3"); // 1.0 only
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("ly", "Ly"); // 1.0 only
        txt = txt.replace("l", "2");
        txt = txt.replace("j", "y"); // 1.0 only
        txt = txt.replace("y3", "Y3"); // 1.0 only
        txt = txt.replace("y", "2"); // 1.0 only
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("l", "2");
        txt = txt.replace("j", "y"); // 1.0 only
        txt = txt.replace("y3", "Y3"); // 1.0 only
        txt = txt.replace("y", "2"); // 1.0 only

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        txt = txt.replace("j", "y"); // 1.0 only
        txt = txt.replace("y3", "Y3"); // 1.0 only
        txt = txt.replace("y", "2"); // 1.0 only

        // 5. Handle removals
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java

        // 5. Handle removals
        txt = txt.replace("2", "");
        txt = txt.replace("3", "");

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java
        // 5. Handle removals
        txt = txt.replace("2", "");
        txt = txt.replace("3", "");

        // 6. put six 1s on the end
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/bm/Rule.java`
#### Snippet
```java
                } else {
                    // rule
                    final String[] parts = line.split("\\s+");
                    if (parts.length != 4) {
                        throw new IllegalArgumentException("Malformed rule statement split into " + parts.length +
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/bm/Rule.java`
#### Snippet
```java
            final String before = ph.substring(0, open);
            final String in = ph.substring(open + 1, ph.length() - 1);
            final Set<String> langs = new HashSet<>(Arrays.asList(in.split("[+]")));

            return new Phoneme(before, Languages.LanguageSet.from(langs));
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/bm/Rule.java`
#### Snippet
```java
            final List<Phoneme> phs = new ArrayList<>();
            final String body = ph.substring(1, ph.length() - 1);
            for (final String part : body.split("[|]")) {
                phs.add(parsePhoneme(part));
            }
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/DaitchMokotoffSoundex.java`
#### Snippet
```java
                } else {
                    // rule
                    final String[] parts = line.split("\\s+");
                    if (parts.length != 4) {
                        throw new IllegalArgumentException("Malformed rule statement split into " + parts.length +
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/codec/language/bm/PhoneticEngine.java`
#### Snippet
```java
        }

        final List<String> words = Arrays.asList(input.split("\\s+"));
        final List<String> words2 = new ArrayList<>();

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.codec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/binary/BinaryCodec.java`
#### Snippet
```java
     *                  the raw binary data to convert
     * @return 0 and 1 ASCII character bytes one for each bit of the argument
     * @see org.apache.commons.codec.BinaryEncoder#encode(byte[])
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.codec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/binary/BinaryCodec.java`
#### Snippet
```java
     *                  the raw binary data to convert
     * @return a String of 0 and 1 characters representing the binary data
     * @see org.apache.commons.codec.BinaryEncoder#encode(byte[])
     */
    public static String toAsciiString(final byte[] raw) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.codec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/binary/BinaryCodec.java`
#### Snippet
```java
     *                  the raw binary data to convert
     * @return an array of 0 and 1 character bytes for each bit of the argument
     * @see org.apache.commons.codec.BinaryEncoder#encode(byte[])
     */
    public static byte[] toAsciiBytes(final byte[] raw) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.codec` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/binary/BinaryCodec.java`
#### Snippet
```java
     *                  the raw binary data to convert
     * @return an array of 0 and 1 characters for each bit of the argument
     * @see org.apache.commons.codec.BinaryEncoder#encode(byte[])
     */
    public static char[] toAsciiChars(final byte[] raw) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/codec/language/SoundexUtils.java`
#### Snippet
```java
        }
        if (count == len) {
            return str.toUpperCase(java.util.Locale.ENGLISH);
        }
        return new String(chars, 0, count).toUpperCase(java.util.Locale.ENGLISH);
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/codec/language/SoundexUtils.java`
#### Snippet
```java
            return str.toUpperCase(java.util.Locale.ENGLISH);
        }
        return new String(chars, 0, count).toUpperCase(java.util.Locale.ENGLISH);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java

        // 1. Convert to lowercase
        txt = txt.toLowerCase(java.util.Locale.ENGLISH);

        // 2. Remove anything not A-Z
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.codec.binary` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/binary/Base32.java`
#### Snippet
```java
     * </p>
     * <p>
     * Output is written to {@link org.apache.commons.codec.binary.BaseNCodec.Context#buffer Context#buffer} as 8-bit
     * octets, using {@link org.apache.commons.codec.binary.BaseNCodec.Context#pos Context#pos} as the buffer position
     * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.codec.binary` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/binary/Base32.java`
#### Snippet
```java
     * <p>
     * Output is written to {@link org.apache.commons.codec.binary.BaseNCodec.Context#buffer Context#buffer} as 8-bit
     * octets, using {@link org.apache.commons.codec.binary.BaseNCodec.Context#pos Context#pos} as the buffer position
     * </p>
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/Charsets.java`
#### Snippet
```java
     * </p>
     *
     * @deprecated Use {@link java.nio.charset.StandardCharsets#UTF_16LE} instead.
     * @see <a href="http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/Charsets.java`
#### Snippet
```java
     * </p>
     *
     * @deprecated Use {@link java.nio.charset.StandardCharsets#ISO_8859_1} instead.
     * @see <a href="http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/Charsets.java`
#### Snippet
```java
     * </p>
     *
     * @deprecated Use {@link java.nio.charset.StandardCharsets#UTF_16} instead.
     * @see <a href="http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/Charsets.java`
#### Snippet
```java
     * </p>
     *
     * @deprecated Use {@link java.nio.charset.StandardCharsets#UTF_16BE} instead.
     * @see <a href="http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/Charsets.java`
#### Snippet
```java
     * </p>
     *
     * @deprecated Use {@link java.nio.charset.StandardCharsets#US_ASCII} instead.
     * @see <a href="http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/Charsets.java`
#### Snippet
```java
     * </p>
     *
     * @deprecated Use {@link java.nio.charset.StandardCharsets#UTF_8} instead.
     * @see <a href="http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/codec/language/Metaphone.java`
#### Snippet
```java
        // single character is itself
        if (txtLength == 1) {
            return txt.toUpperCase(java.util.Locale.ENGLISH);
        }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/codec/language/Metaphone.java`
#### Snippet
```java
        }

        final char[] inwd = txt.toUpperCase(java.util.Locale.ENGLISH).toCharArray();

        final StringBuilder local = new StringBuilder(40); // manipulate
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java

        // 1. Convert to lowercase
        txt = txt.toLowerCase(java.util.Locale.ENGLISH);

        // 2. Remove anything not A-Z
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.crypto` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java

/**
 * Simplifies common {@link javax.crypto.Mac} tasks. This class is immutable and thread-safe.
 * However the Mac may not be.
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/binary/StringUtils.java`
#### Snippet
```java
     *            the String to encode, may be {@code null}
     * @param charsetName
     *            The name of a required {@link java.nio.charset.Charset}
     * @return encoded bytes, or {@code null} if the input string was {@code null}
     * @throws IllegalStateException
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/binary/StringUtils.java`
#### Snippet
```java
     *            The bytes to be decoded into characters, may be {@code null}
     * @param charsetName
     *            The name of a required {@link java.nio.charset.Charset}
     * @return A new {@code String} decoded from the specified array of bytes using the given charset,
     *         or {@code null} if the input byte array was {@code null}.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/digest/Sha2Crypt.java`
#### Snippet
```java
     * @return complete hash value
     * @throws IllegalArgumentException
     *             when a {@link java.security.NoSuchAlgorithmException} is caught.
     */
    public static String sha256Crypt(final byte[] keyBytes) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/digest/Sha2Crypt.java`
#### Snippet
```java
     *             if the salt does not match the allowed pattern
     * @throws IllegalArgumentException
     *             when a {@link java.security.NoSuchAlgorithmException} is caught.
     * @since 1.12
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/digest/Sha2Crypt.java`
#### Snippet
```java
     *             if the salt does not match the allowed pattern
     * @throws IllegalArgumentException
     *             when a {@link java.security.NoSuchAlgorithmException} is caught.
     * @since 1.12
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/digest/Sha2Crypt.java`
#### Snippet
```java
     * @return complete hash value
     * @throws IllegalArgumentException
     *             when a {@link java.security.NoSuchAlgorithmException} is caught.
     */
    public static String sha512Crypt(final byte[] keyBytes) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/digest/Sha2Crypt.java`
#### Snippet
```java
     *             if the salt does not match the allowed pattern
     * @throws IllegalArgumentException
     *             when a {@link java.security.NoSuchAlgorithmException} is caught.
     */
    public static String sha256Crypt(final byte[] keyBytes, String salt) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/digest/Sha2Crypt.java`
#### Snippet
```java
     *             if the salt does not match the allowed pattern
     * @throws IllegalArgumentException
     *             when a {@link java.security.NoSuchAlgorithmException} is caught.
     */
    public static String sha512Crypt(final byte[] keyBytes, String salt) {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            return null;
        }
        return input.toUpperCase(java.util.Locale.ENGLISH);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.security` is unnecessary and can be removed
in `src/main/java/org/apache/commons/codec/digest/DigestUtils.java`
#### Snippet
```java

/**
 * Operations to simplify common {@link java.security.MessageDigest} tasks.
 * This class is immutable and thread-safe.
 * However the MessageDigest instances it creates generally won't be.
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/codec/binary/BaseNCodec.java`
#### Snippet
```java
                // hasData(context) will still return false, and this method will return 0 until
                // more data is available, or -1 if EOF.
                context.pos = context.readPos = 0;
            }
            return len;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/codec/language/Metaphone.java`
#### Snippet
```java
        boolean hard = false;
        final int txtLength;
        if (txt == null || (txtLength = txt.length()) == 0) {
            return "";
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/codec/digest/PureJavaCrc32C.java`
#### Snippet
```java
    while(len > 7) {
      final int c0 =(b[off+0] ^ localCrc) & 0xff;
      final int c1 =(b[off+1] ^ (localCrc >>>= 8)) & 0xff;
      final int c2 =(b[off+2] ^ (localCrc >>>= 8)) & 0xff;
      final int c3 =(b[off+3] ^ (localCrc >>>= 8)) & 0xff;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/codec/digest/PureJavaCrc32C.java`
#### Snippet
```java
      final int c0 =(b[off+0] ^ localCrc) & 0xff;
      final int c1 =(b[off+1] ^ (localCrc >>>= 8)) & 0xff;
      final int c2 =(b[off+2] ^ (localCrc >>>= 8)) & 0xff;
      final int c3 =(b[off+3] ^ (localCrc >>>= 8)) & 0xff;
      localCrc = (T[T8_7_START + c0] ^ T[T8_6_START + c1]) ^
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/codec/digest/PureJavaCrc32C.java`
#### Snippet
```java
      final int c1 =(b[off+1] ^ (localCrc >>>= 8)) & 0xff;
      final int c2 =(b[off+2] ^ (localCrc >>>= 8)) & 0xff;
      final int c3 =(b[off+3] ^ (localCrc >>>= 8)) & 0xff;
      localCrc = (T[T8_7_START + c0] ^ T[T8_6_START + c1]) ^
                 (T[T8_5_START + c2] ^ T[T8_4_START + c3]);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/codec/digest/HmacUtils.java`
#### Snippet
```java
        int read;

        while ((read = valueToDigest.read(buffer, 0, STREAM_BUFFER_LENGTH) ) > -1) {
            mac.update(buffer, 0, read);
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
        public final void start(final int seed) {
            // Reset
            unprocessedLength = totalLen = 0;
            this.hash = seed;
        }
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`txt = txt + TEN_1` could be simplified to 'txt += TEN_1'
in `src/main/java/org/apache/commons/codec/language/Caverphone2.java`
#### Snippet
```java

        // 6. put ten 1s on the end
        txt = txt + TEN_1;

        // 7. take the first ten characters as the code
```

### ReplaceAssignmentWithOperatorAssignment
`context.lbitWorkArea = context.lbitWorkArea >> 4` could be simplified to 'context.lbitWorkArea \>\>= 4'
in `src/main/java/org/apache/commons/codec/binary/Base32.java`
#### Snippet
```java
                case 4 : // 20 bits = 2*8 + 4
                    validateCharacter(MASK_4BITS, context);
                    context.lbitWorkArea = context.lbitWorkArea >> 4; // drop 4 bits
                    buffer[context.pos++] = (byte) ((context.lbitWorkArea >> 8) & MASK_8BITS);
                    buffer[context.pos++] = (byte) ((context.lbitWorkArea) & MASK_8BITS);
```

### ReplaceAssignmentWithOperatorAssignment
`context.lbitWorkArea = context.lbitWorkArea >> 1` could be simplified to 'context.lbitWorkArea \>\>= 1'
in `src/main/java/org/apache/commons/codec/binary/Base32.java`
#### Snippet
```java
                case 5 : // 25 bits = 3*8 + 1
                    validateCharacter(MASK_1BITS, context);
                    context.lbitWorkArea = context.lbitWorkArea >> 1;
                    buffer[context.pos++] = (byte) ((context.lbitWorkArea >> 16) & MASK_8BITS);
                    buffer[context.pos++] = (byte) ((context.lbitWorkArea >> 8) & MASK_8BITS);
```

### ReplaceAssignmentWithOperatorAssignment
`context.lbitWorkArea = context.lbitWorkArea >> 6` could be simplified to 'context.lbitWorkArea \>\>= 6'
in `src/main/java/org/apache/commons/codec/binary/Base32.java`
#### Snippet
```java
                    validateTrailingCharacters();
                    // Not possible from a valid encoding but decode anyway
                    context.lbitWorkArea = context.lbitWorkArea >> 6;
                    buffer[context.pos++] = (byte) ((context.lbitWorkArea >> 16) & MASK_8BITS);
                    buffer[context.pos++] = (byte) ((context.lbitWorkArea >> 8) & MASK_8BITS);
```

### ReplaceAssignmentWithOperatorAssignment
`context.lbitWorkArea = context.lbitWorkArea >> 3` could be simplified to 'context.lbitWorkArea \>\>= 3'
in `src/main/java/org/apache/commons/codec/binary/Base32.java`
#### Snippet
```java
                case 7 : // 35 bits = 4*8 +3
                    validateCharacter(MASK_3BITS, context);
                    context.lbitWorkArea = context.lbitWorkArea >> 3;
                    buffer[context.pos++] = (byte) ((context.lbitWorkArea >> 24) & MASK_8BITS);
                    buffer[context.pos++] = (byte) ((context.lbitWorkArea >> 16) & MASK_8BITS);
```

### ReplaceAssignmentWithOperatorAssignment
`context.ibitWorkArea = context.ibitWorkArea >> 4` could be simplified to 'context.ibitWorkArea \>\>= 4'
in `src/main/java/org/apache/commons/codec/binary/Base64.java`
#### Snippet
```java
                case 2 : // 12 bits = 8 + 4
                    validateCharacter(MASK_4BITS, context);
                    context.ibitWorkArea = context.ibitWorkArea >> 4; // dump the extra 4 bits
                    buffer[context.pos++] = (byte) ((context.ibitWorkArea) & MASK_8BITS);
                    break;
```

### ReplaceAssignmentWithOperatorAssignment
`context.ibitWorkArea = context.ibitWorkArea >> 2` could be simplified to 'context.ibitWorkArea \>\>= 2'
in `src/main/java/org/apache/commons/codec/binary/Base64.java`
#### Snippet
```java
                case 3 : // 18 bits = 8 + 8 + 2
                    validateCharacter(MASK_2BITS, context);
                    context.ibitWorkArea = context.ibitWorkArea >> 2; // dump 2 bits
                    buffer[context.pos++] = (byte) ((context.ibitWorkArea >> 8) & MASK_8BITS);
                    buffer[context.pos++] = (byte) ((context.ibitWorkArea) & MASK_8BITS);
```

### ReplaceAssignmentWithOperatorAssignment
`txt = txt + SIX_1` could be simplified to 'txt += SIX_1'
in `src/main/java/org/apache/commons/codec/language/Caverphone1.java`
#### Snippet
```java

        // 6. put six 1s on the end
        txt = txt + SIX_1;

        // 7. take the first six characters as the code
```

### ReplaceAssignmentWithOperatorAssignment
`f = f | toDigit(data[j], j)` could be simplified to 'f \|= toDigit(data\[j\], j)'
in `src/main/java/org/apache/commons/codec/binary/Hex.java`
#### Snippet
```java
            int f = toDigit(data[j], j) << 4;
            j++;
            f = f | toDigit(data[j], j);
            j++;
            out[i] = (byte) (f & 0xFF);
```

### ReplaceAssignmentWithOperatorAssignment
`index = index + 2` could be simplified to 'index += 2'
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
                result.append("KN");
            }
            index = index + 2;
        } else if (contains(value, index + 1, 2, "LI") && !slavoGermanic) {
            result.append("KL", "L");
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `CologneBuffer()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/codec/language/ColognePhonetic.java`
#### Snippet
```java
        }

        public CologneBuffer(final int buffSize) {
            this.data = new char[buffSize];
            this.length = 0;
```

### NonProtectedConstructorInAbstractClass
Constructor `CologneBuffer()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/codec/language/ColognePhonetic.java`
#### Snippet
```java
        protected int length = 0;

        public CologneBuffer(final char[] data) {
            this.data = data;
            this.length = data.length;
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/codec/language/ColognePhonetic.java`
#### Snippet
```java
        protected final char[] data;

        protected int length = 0;

        public CologneBuffer(final char[] data) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/codec/net/QCodec.java`
#### Snippet
```java
    private static final byte UNDERSCORE = 95;

    private boolean encodeBlanks = false;

    /**
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/codec/language/Soundex.java`
#### Snippet
```java
            return null;
        }
        str = SoundexUtils.clean(str);
        if (str.isEmpty()) {
            return str;
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/codec/language/RefinedSoundex.java`
#### Snippet
```java
            return null;
        }
        str = SoundexUtils.clean(str);
        if (str.isEmpty()) {
            return str;
```

### AssignmentToMethodParameter
Assignment to method parameter `salt`
in `src/main/java/org/apache/commons/codec/digest/Md5Crypt.java`
#### Snippet
```java
        // to make the md5Crypt regex happy
        if (salt != null && !salt.startsWith(APR1_PREFIX)) {
            salt = APR1_PREFIX + salt;
        }
        return Md5Crypt.md5Crypt(keyBytes, salt, APR1_PREFIX);
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java
        final String firstLetter = name.substring(0, 1);

        name = name.replace("A", EMPTY);
        name = name.replace("E", EMPTY);
        name = name.replace("I", EMPTY);
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java

        name = name.replace("A", EMPTY);
        name = name.replace("E", EMPTY);
        name = name.replace("I", EMPTY);
        name = name.replace("O", EMPTY);
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java
        name = name.replace("A", EMPTY);
        name = name.replace("E", EMPTY);
        name = name.replace("I", EMPTY);
        name = name.replace("O", EMPTY);
        name = name.replace("U", EMPTY);
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java
        name = name.replace("E", EMPTY);
        name = name.replace("I", EMPTY);
        name = name.replace("O", EMPTY);
        name = name.replace("U", EMPTY);

```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java
        name = name.replace("I", EMPTY);
        name = name.replace("O", EMPTY);
        name = name.replace("U", EMPTY);

        name = name.replaceAll("\\s{2,}\\b", SPACE);
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java
        name = name.replace("U", EMPTY);

        name = name.replaceAll("\\s{2,}\\b", SPACE);

        // return isVowel(firstLetter) ? (firstLetter + name) : name;
```

### AssignmentToMethodParameter
Assignment to method parameter `name1`
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java

        // Preprocessing
        name1 = cleanName(name1);
        name2 = cleanName(name2);

```

### AssignmentToMethodParameter
Assignment to method parameter `name2`
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java
        // Preprocessing
        name1 = cleanName(name1);
        name2 = cleanName(name2);

        // Actual MRA Algorithm
```

### AssignmentToMethodParameter
Assignment to method parameter `name1`
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java

        // 1. Remove vowels
        name1 = removeVowels(name1);
        name2 = removeVowels(name2);

```

### AssignmentToMethodParameter
Assignment to method parameter `name2`
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java
        // 1. Remove vowels
        name1 = removeVowels(name1);
        name2 = removeVowels(name2);

        // 2. Remove double consonants
```

### AssignmentToMethodParameter
Assignment to method parameter `name1`
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java

        // 2. Remove double consonants
        name1 = removeDoubleConsonants(name1);
        name2 = removeDoubleConsonants(name2);

```

### AssignmentToMethodParameter
Assignment to method parameter `name2`
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java
        // 2. Remove double consonants
        name1 = removeDoubleConsonants(name1);
        name2 = removeDoubleConsonants(name2);

        // 3. Reduce down to 3 letters
```

### AssignmentToMethodParameter
Assignment to method parameter `name1`
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java

        // 3. Reduce down to 3 letters
        name1 = getFirst3Last3(name1);
        name2 = getFirst3Last3(name2);

```

### AssignmentToMethodParameter
Assignment to method parameter `name2`
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java
        // 3. Reduce down to 3 letters
        name1 = getFirst3Last3(name1);
        name2 = getFirst3Last3(name2);

        // 4. Check for length difference - if 3 or greater, then no similarity
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java

        // Preprocessing
        name = cleanName(name);

        // BEGIN: Actual encoding part of the algorithm...
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java
        // BEGIN: Actual encoding part of the algorithm...
        // 1. Delete all vowels unless the vowel begins the word
        name = removeVowels(name);

        // 2. Remove second consonant from any double consonant
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java

        // 2. Remove second consonant from any double consonant
        name = removeDoubleConsonants(name);

        // 3. Reduce codex to 6 letters by joining the first 3 and last 3 letters
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java

        // 3. Reduce codex to 6 letters by joining the first 3 and last 3 letters
        name = getFirst3Last3(name);

        return name;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/codec/binary/Base16.java`
#### Snippet
```java
            // we have 1/2 byte from previous invocation to decode
            result = (context.ibitWorkArea - 1) << BITS_PER_ENCODED_BYTE;
            result |= decodeOctet(data[offset++]);

            buffer[context.pos++] = (byte)result;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/codec/binary/Base16.java`
#### Snippet
```java
        final int loopEnd = end - 1;
        while (offset < loopEnd) {
            result = decodeOctet(data[offset++]) << BITS_PER_ENCODED_BYTE;
            result |= decodeOctet(data[offset++]);
            buffer[context.pos++] = (byte)result;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/codec/binary/Base16.java`
#### Snippet
```java
        while (offset < loopEnd) {
            result = decodeOctet(data[offset++]) << BITS_PER_ENCODED_BYTE;
            result |= decodeOctet(data[offset++]);
            buffer[context.pos++] = (byte)result;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `salt`
in `src/main/java/org/apache/commons/codec/digest/UnixCrypt.java`
#### Snippet
```java
            final ThreadLocalRandom randomGenerator = ThreadLocalRandom.current();
            final int numSaltChars = SALT_CHARS.length;
            salt = "" + SALT_CHARS[randomGenerator.nextInt(numSaltChars)] +
                    SALT_CHARS[randomGenerator.nextInt(numSaltChars)];
        } else if (!salt.matches("^[" + B64.B64T_STRING + "]{2,}$")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `src/main/java/org/apache/commons/codec/digest/UnixCrypt.java`
#### Snippet
```java
    private static int hPermOp(int a, final int n, final int m) {
        final int t = (a << 16 - n ^ a) & m;
        a = a ^ t ^ t >>> 16 - n;
        return a;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/codec/digest/UnixCrypt.java`
#### Snippet
```java

    private static int fourBytesToInt(final byte[] b, int offset) {
        int value = byteToUnsigned(b[offset++]);
        value |= byteToUnsigned(b[offset++]) << 8;
        value |= byteToUnsigned(b[offset++]) << 16;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/codec/digest/UnixCrypt.java`
#### Snippet
```java
    private static int fourBytesToInt(final byte[] b, int offset) {
        int value = byteToUnsigned(b[offset++]);
        value |= byteToUnsigned(b[offset++]) << 8;
        value |= byteToUnsigned(b[offset++]) << 16;
        value |= byteToUnsigned(b[offset++]) << 24;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/codec/digest/UnixCrypt.java`
#### Snippet
```java
        int value = byteToUnsigned(b[offset++]);
        value |= byteToUnsigned(b[offset++]) << 8;
        value |= byteToUnsigned(b[offset++]) << 16;
        value |= byteToUnsigned(b[offset++]) << 24;
        return value;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/codec/digest/UnixCrypt.java`
#### Snippet
```java
        value |= byteToUnsigned(b[offset++]) << 8;
        value |= byteToUnsigned(b[offset++]) << 16;
        value |= byteToUnsigned(b[offset++]) << 24;
        return value;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/codec/digest/UnixCrypt.java`
#### Snippet
```java

    private static void intToFourBytes(final int iValue, final byte[] b, int offset) {
        b[offset++] = (byte) (iValue & 0xff);
        b[offset++] = (byte) (iValue >>> 8 & 0xff);
        b[offset++] = (byte) (iValue >>> 16 & 0xff);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/codec/digest/UnixCrypt.java`
#### Snippet
```java
    private static void intToFourBytes(final int iValue, final byte[] b, int offset) {
        b[offset++] = (byte) (iValue & 0xff);
        b[offset++] = (byte) (iValue >>> 8 & 0xff);
        b[offset++] = (byte) (iValue >>> 16 & 0xff);
        b[offset++] = (byte) (iValue >>> 24 & 0xff);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/codec/digest/UnixCrypt.java`
#### Snippet
```java
        b[offset++] = (byte) (iValue & 0xff);
        b[offset++] = (byte) (iValue >>> 8 & 0xff);
        b[offset++] = (byte) (iValue >>> 16 & 0xff);
        b[offset++] = (byte) (iValue >>> 24 & 0xff);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/codec/digest/UnixCrypt.java`
#### Snippet
```java
        b[offset++] = (byte) (iValue >>> 8 & 0xff);
        b[offset++] = (byte) (iValue >>> 16 & 0xff);
        b[offset++] = (byte) (iValue >>> 24 & 0xff);
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `el`
in `src/main/java/org/apache/commons/codec/digest/UnixCrypt.java`
#### Snippet
```java
        int t = v ^ v << 16 ^ r ^ sArr[s + 1];
        t = t >>> 4 | t << 28;
        el ^= SPTRANS[1][t & 0x3f] | SPTRANS[3][t >>> 8 & 0x3f] | SPTRANS[5][t >>> 16 & 0x3f] |
                SPTRANS[7][t >>> 24 & 0x3f] | SPTRANS[0][u & 0x3f] | SPTRANS[2][u >>> 8 & 0x3f] |
                SPTRANS[4][u >>> 16 & 0x3f] | SPTRANS[6][u >>> 24 & 0x3f];
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `src/main/java/org/apache/commons/codec/digest/UnixCrypt.java`
#### Snippet
```java
    private static void permOp(int a, int b, final int n, final int m, final int[] results) {
        final int t = (a >>> n ^ b) & m;
        a ^= t << n;
        b ^= t;
        results[0] = a;
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `src/main/java/org/apache/commons/codec/digest/UnixCrypt.java`
#### Snippet
```java
        final int t = (a >>> n ^ b) & m;
        a ^= t << n;
        b ^= t;
        results[0] = a;
        results[1] = b;
```

### AssignmentToMethodParameter
Assignment to method parameter `inPos`
in `src/main/java/org/apache/commons/codec/binary/Base32.java`
#### Snippet
```java
        }
        for (int i = 0; i < inAvail; i++) {
            final byte b = input[inPos++];
            if (b == pad) {
                // We're done.
```

### AssignmentToMethodParameter
Assignment to method parameter `inPos`
in `src/main/java/org/apache/commons/codec/binary/Base32.java`
#### Snippet
```java
                final byte[] buffer = ensureBufferSize(encodeSize, context);
                context.modulus = (context.modulus+1) % BYTES_PER_UNENCODED_BLOCK;
                int b = input[inPos++];
                if (b < 0) {
                    b += 256;
```

### AssignmentToMethodParameter
Assignment to method parameter `printable`
in `src/main/java/org/apache/commons/codec/net/QuotedPrintableCodec.java`
#### Snippet
```java
        }
        if (printable == null) {
            printable = PRINTABLE_CHARS;
        }
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
```

### AssignmentToMethodParameter
Assignment to method parameter `urlsafe`
in `src/main/java/org/apache/commons/codec/net/URLCodec.java`
#### Snippet
```java
        }
        if (urlsafe == null) {
            urlsafe = WWW_FORM_URL_SAFE;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `inPos`
in `src/main/java/org/apache/commons/codec/binary/Base64.java`
#### Snippet
```java
                final byte[] buffer = ensureBufferSize(encodeSize, context);
                context.modulus = (context.modulus+1) % BYTES_PER_UNENCODED_BLOCK;
                int b = in[inPos++];
                if (b < 0) {
                    b += 256;
```

### AssignmentToMethodParameter
Assignment to method parameter `inPos`
in `src/main/java/org/apache/commons/codec/binary/Base64.java`
#### Snippet
```java
        for (int i = 0; i < inAvail; i++) {
            final byte[] buffer = ensureBufferSize(decodeSize, context);
            final byte b = input[inPos++];
            if (b == pad) {
                // We're done.
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/codec/digest/Blake3.java`
#### Snippet
```java
                System.arraycopy(input, offset, block, blockLength, take);
                blockLength += take;
                offset += take;
                length -= take;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `src/main/java/org/apache/commons/codec/digest/Blake3.java`
#### Snippet
```java
                blockLength += take;
                offset += take;
                length -= take;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `src/main/java/org/apache/commons/codec/digest/Blake3.java`
#### Snippet
```java
            while (length > 0) {
                int chunkLength = Math.min(OUT_LEN * 2, length);
                length -= chunkLength;
                final int[] words =
                        compress(inputChainingValue, blockWords, blockLength, outputBlockCounter++, flags | ROOT);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/codec/digest/Blake3.java`
#### Snippet
```java
                    final int wordLength = Math.min(Integer.BYTES, chunkLength);
                    packInt(words[wordCounter++], out, offset, wordLength);
                    offset += wordLength;
                    chunkLength -= wordLength;
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/codec/digest/Blake3.java`
#### Snippet
```java
                final int take = Math.min(want, length);
                state.update(in, offset, take);
                offset += take;
                length -= take;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `src/main/java/org/apache/commons/codec/digest/Blake3.java`
#### Snippet
```java
                state.update(in, offset, take);
                offset += take;
                length -= take;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/codec/digest/XXHash32.java`
#### Snippet
```java
            System.arraycopy(b, off, buffer, pos, size);
            process(buffer, 0);
            off += size;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/codec/digest/XXHash32.java`
#### Snippet
```java
        while (off <= limit) {
            process(b, off);
            off += BUF_SIZE;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/codec/digest/PureJavaCrc32C.java`
#### Snippet
```java
                  (T[T8_1_START + c6] ^ T[T8_0_START + c7]);

      off += 8;
      len -= 8;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/codec/digest/PureJavaCrc32C.java`
#### Snippet
```java

      off += 8;
      len -= 8;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/codec/digest/PureJavaCrc32C.java`
#### Snippet
```java
    /* loop unroll - duff's device style */
    switch(len) {
      case 7: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 6: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 5: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/codec/digest/PureJavaCrc32C.java`
#### Snippet
```java
    switch(len) {
      case 7: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 6: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 5: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 4: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/codec/digest/PureJavaCrc32C.java`
#### Snippet
```java
      case 7: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 6: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 5: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 4: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 3: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/codec/digest/PureJavaCrc32C.java`
#### Snippet
```java
      case 6: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 5: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 4: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 3: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 2: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/codec/digest/PureJavaCrc32C.java`
#### Snippet
```java
      case 5: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 4: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 3: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 2: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 1: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/codec/digest/PureJavaCrc32C.java`
#### Snippet
```java
      case 4: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 3: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 2: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 1: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      default:
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/codec/digest/PureJavaCrc32C.java`
#### Snippet
```java
      case 3: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 2: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 1: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      default:
        break; // satisfy Findbugs
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/codec/language/bm/Rule.java`
#### Snippet
```java
    private static String stripQuotes(String str) {
        if (str.startsWith(DOUBLE_QUOTE)) {
            str = str.substring(1);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/codec/language/bm/Rule.java`
#### Snippet
```java

        if (str.endsWith(DOUBLE_QUOTE)) {
            str = str.substring(0, str.length() - 1);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/codec/language/DaitchMokotoffSoundex.java`
#### Snippet
```java
    private static String stripQuotes(String str) {
        if (str.startsWith(DOUBLE_QUOTE)) {
            str = str.substring(1);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/codec/language/DaitchMokotoffSoundex.java`
#### Snippet
```java

        if (str.endsWith(DOUBLE_QUOTE)) {
            str = str.substring(0, str.length() - 1);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `input`
in `src/main/java/org/apache/commons/codec/language/bm/PhoneticEngine.java`
#### Snippet
```java
        // tidy the input
        // lower case is a locale-dependent operation
        input = input.toLowerCase(Locale.ENGLISH).replace('-', ' ').trim();

        if (this.nameType == NameType.GENERIC) {
```

### AssignmentToMethodParameter
Assignment to method parameter `input`
in `src/main/java/org/apache/commons/codec/language/bm/PhoneticEngine.java`
#### Snippet
```java
        if (this.concat) {
            // concat mode enabled
            input = join(words2, " ");
        } else if (words2.size() == 1) {
            // not a multi-word name
```

### AssignmentToMethodParameter
Assignment to method parameter `input`
in `src/main/java/org/apache/commons/codec/language/bm/PhoneticEngine.java`
#### Snippet
```java
        } else if (words2.size() == 1) {
            // not a multi-word name
            input = words.iterator().next();
        } else {
            // encode each word in a multi-word name separately (normally used for approx matches)
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/codec/language/Nysiis.java`
#### Snippet
```java

        // Use the same clean rules as Soundex
        str = SoundexUtils.clean(str);

        if (str.isEmpty()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/codec/language/Nysiis.java`
#### Snippet
```java
        // Translate first characters of name:
        // MAC -> MCC, KN -> NN, K -> C, PH | PF -> FF, SCH -> SSS
        str = PAT_MAC.matcher(str).replaceFirst("MCC");
        str = PAT_KN.matcher(str).replaceFirst("NN");
        str = PAT_K.matcher(str).replaceFirst("C");
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/codec/language/Nysiis.java`
#### Snippet
```java
        // MAC -> MCC, KN -> NN, K -> C, PH | PF -> FF, SCH -> SSS
        str = PAT_MAC.matcher(str).replaceFirst("MCC");
        str = PAT_KN.matcher(str).replaceFirst("NN");
        str = PAT_K.matcher(str).replaceFirst("C");
        str = PAT_PH_PF.matcher(str).replaceFirst("FF");
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/codec/language/Nysiis.java`
#### Snippet
```java
        str = PAT_MAC.matcher(str).replaceFirst("MCC");
        str = PAT_KN.matcher(str).replaceFirst("NN");
        str = PAT_K.matcher(str).replaceFirst("C");
        str = PAT_PH_PF.matcher(str).replaceFirst("FF");
        str = PAT_SCH.matcher(str).replaceFirst("SSS");
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/codec/language/Nysiis.java`
#### Snippet
```java
        str = PAT_KN.matcher(str).replaceFirst("NN");
        str = PAT_K.matcher(str).replaceFirst("C");
        str = PAT_PH_PF.matcher(str).replaceFirst("FF");
        str = PAT_SCH.matcher(str).replaceFirst("SSS");

```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/codec/language/Nysiis.java`
#### Snippet
```java
        str = PAT_K.matcher(str).replaceFirst("C");
        str = PAT_PH_PF.matcher(str).replaceFirst("FF");
        str = PAT_SCH.matcher(str).replaceFirst("SSS");

        // Translate last characters of name:
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/codec/language/Nysiis.java`
#### Snippet
```java
        // Translate last characters of name:
        // EE -> Y, IE -> Y, DT | RT | RD | NT | ND -> D
        str = PAT_EE_IE.matcher(str).replaceFirst("Y");
        str = PAT_DT_ETC.matcher(str).replaceFirst("D");

```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/commons/codec/language/Nysiis.java`
#### Snippet
```java
        // EE -> Y, IE -> Y, DT | RT | RD | NT | ND -> D
        str = PAT_EE_IE.matcher(str).replaceFirst("Y");
        str = PAT_DT_ETC.matcher(str).replaceFirst("D");

        // First character of key = first character of name.
```

### AssignmentToMethodParameter
Assignment to method parameter `salt`
in `src/main/java/org/apache/commons/codec/digest/Sha2Crypt.java`
#### Snippet
```java
    public static String sha512Crypt(final byte[] keyBytes, String salt, final Random random) {
        if (salt == null) {
            salt = SHA512_PREFIX + B64.getRandomSalt(8, random);
        }
        return sha2Crypt(keyBytes, salt, SHA512_PREFIX, SHA512_BLOCKSIZE, MessageDigestAlgorithms.SHA_512);
```

### AssignmentToMethodParameter
Assignment to method parameter `salt`
in `src/main/java/org/apache/commons/codec/digest/Sha2Crypt.java`
#### Snippet
```java
    public static String sha256Crypt(final byte[] keyBytes, String salt, final Random random) {
        if (salt == null) {
            salt = SHA256_PREFIX + B64.getRandomSalt(8, random);
        }
        return sha2Crypt(keyBytes, salt, SHA256_PREFIX, SHA256_BLOCKSIZE, MessageDigestAlgorithms.SHA_256);
```

### AssignmentToMethodParameter
Assignment to method parameter `salt`
in `src/main/java/org/apache/commons/codec/digest/Sha2Crypt.java`
#### Snippet
```java
    public static String sha256Crypt(final byte[] keyBytes, String salt) {
        if (salt == null) {
            salt = SHA256_PREFIX + B64.getRandomSalt(8);
        }
        return sha2Crypt(keyBytes, salt, SHA256_PREFIX, SHA256_BLOCKSIZE, MessageDigestAlgorithms.SHA_256);
```

### AssignmentToMethodParameter
Assignment to method parameter `salt`
in `src/main/java/org/apache/commons/codec/digest/Sha2Crypt.java`
#### Snippet
```java
    public static String sha512Crypt(final byte[] keyBytes, String salt) {
        if (salt == null) {
            salt = SHA512_PREFIX + B64.getRandomSalt(8);
        }
        return sha2Crypt(keyBytes, salt, SHA512_PREFIX, SHA512_BLOCKSIZE, MessageDigestAlgorithms.SHA_512);
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
        if (contains(value, index - 1, 3, "ISL", "YSL")) {
            //-- special cases "island", "isle", "carlisle", "carlysle" --//
            index++;
        } else if (index == 0 && contains(value, index, 5, "SUGAR")) {
            //-- special case "sugar-" --//
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            //-- special case "sugar-" --//
            result.append('X', 'S');
            index++;
        } else if (contains(value, index, 2, "SH")) {
            if (contains(value, index + 1, 4, "HEIM", "HOEK", "HOLM", "HOLZ")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
                result.append('X');
            }
            index += 2;
        } else if (contains(value, index, 3, "SIO", "SIA") || contains(value, index, 4, "SIAN")) {
            //-- Italian and Armenian --//
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
                result.append('S', 'X');
            }
            index += 3;
        } else if ((index == 0 && contains(value, index + 1, 1, "M", "N", "L", "W")) ||
                   contains(value, index + 1, 1, "Z")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            //   is pronounced "s" --//
            result.append('S', 'X');
            index = contains(value, index + 1, 1, "Z") ? index + 2 : index + 1;
        } else if (contains(value, index, 2, "SC")) {
            index = handleSC(value, result, index);
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            index = contains(value, index + 1, 1, "Z") ? index + 2 : index + 1;
        } else if (contains(value, index, 2, "SC")) {
            index = handleSC(value, result, index);
        } else {
            if (index == value.length() - 1 && contains(value, index - 2, 2, "AI", "OI")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
                result.append('S');
            }
            index = contains(value, index + 1, 1, "S", "Z") ? index + 2 : index + 1;
        }
        return index;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
        if (index == 0) {
            result.append('S');
            index++;
        } else {
            if (!((index == value.length() - 1) &&
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
                result.append("KS");
            }
            index = contains(value, index + 1, 1, "C", "X") ? index + 2 : index + 1;
        }
        return index;
```

### AssignmentToMethodParameter
Assignment to method parameter `input`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            return null;
        }
        input = input.trim();
        if (input.isEmpty()) {
            return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
        if (index > 0 && !isVowel(charAt(value, index - 1))) {
            result.append('K');
            index += 2;
        } else if (index == 0) {
            if (charAt(value, index + 2) == 'I') {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
                result.append('K');
            }
            index += 2;
        } else if ((index > 1 && contains(value, index - 2, 1, "B", "H", "D")) ||
                   (index > 2 && contains(value, index - 3, 1, "B", "H", "D")) ||
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
                   (index > 3 && contains(value, index - 4, 1, "B", "H"))) {
            //-- Parker's rule (with some further refinements) - "hugh"
            index += 2;
        } else {
            if (index > 2 && charAt(value, index - 1) == 'U' &&
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
                result.append('K');
            }
            index += 2;
        }
        return index;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
        if (charAt(value, index + 1) == 'H') {
            result.append('F');
            index += 2;
        } else {
            result.append('P');
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
        } else {
            result.append('P');
            index = contains(value, index + 1, 1, "P", "B") ? index + 2 : index + 1;
        }
        return index;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            //-- Chinese pinyin e.g. "zhao" or Angelina "Zhang" --//
            result.append('J');
            index += 2;
        } else {
            if (contains(value, index + 1, 2, "ZO", "ZI", "ZA") ||
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
                result.append('S');
            }
            index = charAt(value, index + 1) == 'Z' ? index + 2 : index + 1;
        }
        return index;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
                result.append('X');
            }
            index += 3;
        } else {    // Pierce's rule
            result.append('K');
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
        } else {    // Pierce's rule
            result.append('K');
            index += 2;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            //-- can also be in middle of word --//
            result.append('R');
            index += 2;
        } else if (index == 0 && (isVowel(charAt(value, index + 1)) ||
                           contains(value, index, 2, "WH"))) {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
                result.append('A');
            }
            index++;
        } else if ((index == value.length() - 1 && isVowel(charAt(value, index - 1))) ||
                   contains(value, index - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY") ||
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            //-- Arnow should match Arnoff --//
            result.appendAlternate('F');
            index++;
        } else if (contains(value, index, 4, "WICZ", "WITZ")) {
            //-- Polish e.g. "filipowicz" --//
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            //-- Polish e.g. "filipowicz" --//
            result.append("TS", "FX");
            index += 4;
        } else {
            index++;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            index += 4;
        } else {
            index++;
        }
        return index;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
        if (contains(value, index, 4, "TION")) {
            result.append('X');
            index += 3;
        } else if (contains(value, index, 3, "TIA", "TCH")) {
            result.append('X');
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
        } else if (contains(value, index, 3, "TIA", "TCH")) {
            result.append('X');
            index += 3;
        } else if (contains(value, index, 2, "TH") || contains(value, index, 3, "TTH")) {
            if (contains(value, index + 2, 2, "OM", "AM") ||
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
                result.append('0', 'T');
            }
            index += 2;
        } else {
            result.append('T');
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
        } else {
            result.append('T');
            index = contains(value, index + 1, 1, "T", "D") ? index + 2 : index + 1;
        }
        return index;
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
     */
    public String doubleMetaphone(String value, final boolean alternate) {
        value = cleanInput(value);
        if (value == null) {
            return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
        if (conditionC0(value, index)) {  // very confusing, moved out
            result.append('K');
            index += 2;
        } else if (index == 0 && contains(value, index, 6, "CAESAR")) {
            result.append('S');
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
        } else if (index == 0 && contains(value, index, 6, "CAESAR")) {
            result.append('S');
            index += 2;
        } else if (contains(value, index, 2, "CH")) {
            index = handleCH(value, result, index);
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            index += 2;
        } else if (contains(value, index, 2, "CH")) {
            index = handleCH(value, result, index);
        } else if (contains(value, index, 2, "CZ") &&
                   !contains(value, index - 2, 4, "WICZ")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            //-- "Czerny" --//
            result.append('S', 'X');
            index += 2;
        } else if (contains(value, index + 1, 3, "CIA")) {
            //-- "focaccia" --//
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            //-- "focaccia" --//
            result.append('X');
            index += 3;
        } else if (contains(value, index, 2, "CC") &&
                   !(index == 1 && charAt(value, 0) == 'M')) {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
        } else if (contains(value, index, 2, "CK", "CG", "CQ")) {
            result.append('K');
            index += 2;
        } else if (contains(value, index, 2, "CI", "CE", "CY")) {
            //-- Italian vs. English --//
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
                result.append('S');
            }
            index += 2;
        } else {
            result.append('K');
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            if (contains(value, index + 1, 2, " C", " Q", " G")) {
                //-- Mac Caffrey, Mac Gregor --//
                index += 3;
            } else if (contains(value, index + 1, 1, "C", "K", "Q") &&
                       !contains(value, index + 1, 2, "CE", "CI")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            } else if (contains(value, index + 1, 1, "C", "K", "Q") &&
                       !contains(value, index + 1, 2, "CE", "CI")) {
                index += 2;
            } else {
                index++;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
                index += 2;
            } else {
                index++;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            if (contains(value, index + 2, 1, "I", "E", "Y")) {
                result.append('J');
                index += 3;
                //-- "Edgar" --//
            } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            } else {
                result.append("TK");
                index += 2;
            }
        } else if (contains(value, index, 2, "DT", "DD")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
        } else if (contains(value, index, 2, "DT", "DD")) {
            result.append('T');
            index += 2;
        } else {
            result.append('T');
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
        } else {
            result.append('T');
            index++;
        }
        return index;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
                    result.append('J', 'H');
                }
                index++;
            } else {
                if (index == 0 && !contains(value, index, 4, "JOSE")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java

                if (charAt(value, index + 1) == 'J') {
                    index += 2;
                } else {
                    index++;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
                    index += 2;
                } else {
                    index++;
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            isVowel(charAt(value, index + 1))) {
            result.append('H');
            index += 2;
            //-- also takes car of "HH" --//
        } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            //-- also takes car of "HH" --//
        } else {
            index++;
        }
        return index;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
                result.append('L');
            }
            index += 2;
        } else {
            index++;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            index += 2;
        } else {
            index++;
            result.append('L');
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
                        final boolean slavoGermanic) {
        if (charAt(value, index + 1) == 'H') {
            index = handleGH(value, result, index);
        } else if (charAt(value, index + 1) == 'N') {
            if (index == 1 && isVowel(charAt(value, 0)) && !slavoGermanic) {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
                result.append("KN");
            }
            index = index + 2;
        } else if (contains(value, index + 1, 2, "LI") && !slavoGermanic) {
            result.append("KL", "L");
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
        } else if (contains(value, index + 1, 2, "LI") && !slavoGermanic) {
            result.append("KL", "L");
            index += 2;
        } else if (index == 0 &&
                   (charAt(value, index + 1) == 'Y' ||
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            //-- -ges-, -gep-, -gel-, -gie- at beginning --//
            result.append('K', 'J');
            index += 2;
        } else if ((contains(value, index + 1, 2, "ER") ||
                    charAt(value, index + 1) == 'Y') &&
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            //-- -ger-, -gy- --//
            result.append('K', 'J');
            index += 2;
        } else if (contains(value, index + 1, 1, "E", "I", "Y") ||
                   contains(value, index - 1, 4, "AGGI", "OGGI")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
                result.append('J', 'K');
            }
            index += 2;
        } else if (charAt(value, index + 1) == 'G') {
            index += 2;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            index += 2;
        } else if (charAt(value, index + 1) == 'G') {
            index += 2;
            result.append('K');
        } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            result.append('K');
        } else {
            index++;
            result.append('K');
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `k`
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
     */
    private static int mix32(int k, int hash) {
        k *= C1_32;
        k = Integer.rotateLeft(k, R1_32);
        k *= C2_32;
```

### AssignmentToMethodParameter
Assignment to method parameter `k`
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
    private static int mix32(int k, int hash) {
        k *= C1_32;
        k = Integer.rotateLeft(k, R1_32);
        k *= C2_32;
        hash ^= k;
```

### AssignmentToMethodParameter
Assignment to method parameter `k`
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
        k *= C1_32;
        k = Integer.rotateLeft(k, R1_32);
        k *= C2_32;
        hash ^= k;
        return Integer.rotateLeft(hash, R2_32) * M_32 + N_32;
```

### AssignmentToMethodParameter
Assignment to method parameter `hash`
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
        k = Integer.rotateLeft(k, R1_32);
        k *= C2_32;
        hash ^= k;
        return Integer.rotateLeft(hash, R2_32) * M_32 + N_32;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `hash`
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
     */
    private static long fmix64(long hash) {
        hash ^= (hash >>> 33);
        hash *= 0xff51afd7ed558ccdL;
        hash ^= (hash >>> 33);
```

### AssignmentToMethodParameter
Assignment to method parameter `hash`
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
    private static long fmix64(long hash) {
        hash ^= (hash >>> 33);
        hash *= 0xff51afd7ed558ccdL;
        hash ^= (hash >>> 33);
        hash *= 0xc4ceb9fe1a85ec53L;
```

### AssignmentToMethodParameter
Assignment to method parameter `hash`
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
        hash ^= (hash >>> 33);
        hash *= 0xff51afd7ed558ccdL;
        hash ^= (hash >>> 33);
        hash *= 0xc4ceb9fe1a85ec53L;
        hash ^= (hash >>> 33);
```

### AssignmentToMethodParameter
Assignment to method parameter `hash`
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
        hash *= 0xff51afd7ed558ccdL;
        hash ^= (hash >>> 33);
        hash *= 0xc4ceb9fe1a85ec53L;
        hash ^= (hash >>> 33);
        return hash;
```

### AssignmentToMethodParameter
Assignment to method parameter `hash`
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
        hash ^= (hash >>> 33);
        hash *= 0xc4ceb9fe1a85ec53L;
        hash ^= (hash >>> 33);
        return hash;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `hash`
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
     */
    private static int fmix32(int hash) {
        hash ^= (hash >>> 16);
        hash *= 0x85ebca6b;
        hash ^= (hash >>> 13);
```

### AssignmentToMethodParameter
Assignment to method parameter `hash`
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
    private static int fmix32(int hash) {
        hash ^= (hash >>> 16);
        hash *= 0x85ebca6b;
        hash ^= (hash >>> 13);
        hash *= 0xc2b2ae35;
```

### AssignmentToMethodParameter
Assignment to method parameter `hash`
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
        hash ^= (hash >>> 16);
        hash *= 0x85ebca6b;
        hash ^= (hash >>> 13);
        hash *= 0xc2b2ae35;
        hash ^= (hash >>> 16);
```

### AssignmentToMethodParameter
Assignment to method parameter `hash`
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
        hash *= 0x85ebca6b;
        hash ^= (hash >>> 13);
        hash *= 0xc2b2ae35;
        hash ^= (hash >>> 16);
        return hash;
```

### AssignmentToMethodParameter
Assignment to method parameter `hash`
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
        hash ^= (hash >>> 13);
        hash *= 0xc2b2ae35;
        hash ^= (hash >>> 16);
        return hash;
    }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/BCodec.java`
#### Snippet
```java
    public String encode(final String strSource, final String sourceCharset) throws EncoderException {
        if (strSource == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/BCodec.java`
#### Snippet
```java
    protected byte[] doEncoding(final byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        return Base64.encodeBase64(bytes);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/BCodec.java`
#### Snippet
```java
    public Object decode(final Object value) throws DecoderException {
        if (value == null) {
            return null;
        }
        if (value instanceof String) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/BCodec.java`
#### Snippet
```java
    public Object encode(final Object value) throws EncoderException {
        if (value == null) {
            return null;
        }
        if (value instanceof String) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/BCodec.java`
#### Snippet
```java
    public String encode(final String strSource) throws EncoderException {
        if (strSource == null) {
            return null;
        }
        return encode(strSource, this.getCharset());
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/BCodec.java`
#### Snippet
```java
    protected byte[] doDecoding(final byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        return new Base64(0, BaseNCodec.getChunkSeparator(), false, decodingPolicy).decode(bytes);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/BCodec.java`
#### Snippet
```java
    public String encode(final String strSource, final Charset sourceCharset) throws EncoderException {
        if (strSource == null) {
            return null;
        }
        return encodeText(strSource, sourceCharset);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/BCodec.java`
#### Snippet
```java
    public String decode(final String value) throws DecoderException {
        if (value == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/language/Soundex.java`
#### Snippet
```java
    public String soundex(String str) {
        if (str == null) {
            return null;
        }
        str = SoundexUtils.clean(str);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/language/RefinedSoundex.java`
#### Snippet
```java
    public String soundex(String str) {
        if (str == null) {
            return null;
        }
        str = SoundexUtils.clean(str);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java
    String removeAccents(final String accentedWord) {
        if (accentedWord == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/QuotedPrintableCodec.java`
#### Snippet
```java
            throws DecoderException, UnsupportedEncodingException {
        if (sourceStr == null) {
            return null;
        }
        return new String(decode(StringUtils.getBytesUsAscii(sourceStr)), sourceCharset);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/QuotedPrintableCodec.java`
#### Snippet
```java
    public static final byte[] encodeQuotedPrintable(BitSet printable, final byte[] bytes, final boolean strict) {
        if (bytes == null) {
            return null;
        }
        if (printable == null) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/QuotedPrintableCodec.java`
#### Snippet
```java
    public String encode(final String sourceStr, final Charset sourceCharset) {
        if (sourceStr == null) {
            return null;
        }
        return StringUtils.newStringUsAscii(this.encode(sourceStr.getBytes(sourceCharset)));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/QuotedPrintableCodec.java`
#### Snippet
```java
    public Object decode(final Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/QuotedPrintableCodec.java`
#### Snippet
```java
    public static final byte[] decodeQuotedPrintable(final byte[] bytes) throws DecoderException {
        if (bytes == null) {
            return null;
        }
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/QuotedPrintableCodec.java`
#### Snippet
```java
    public String encode(final String sourceStr, final String sourceCharset) throws UnsupportedEncodingException {
        if (sourceStr == null) {
            return null;
        }
        return StringUtils.newStringUsAscii(encode(sourceStr.getBytes(sourceCharset)));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/QuotedPrintableCodec.java`
#### Snippet
```java
    public Object encode(final Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/QuotedPrintableCodec.java`
#### Snippet
```java
    public String decode(final String sourceStr, final Charset sourceCharset) throws DecoderException {
        if (sourceStr == null) {
            return null;
        }
        return new String(this.decode(StringUtils.getBytesUsAscii(sourceStr)), sourceCharset);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/URLCodec.java`
#### Snippet
```java
            throws DecoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return new String(decode(StringUtils.getBytesUsAscii(str)), charsetName);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/URLCodec.java`
#### Snippet
```java
    public static final byte[] decodeUrl(final byte[] bytes) throws DecoderException {
        if (bytes == null) {
            return null;
        }
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/URLCodec.java`
#### Snippet
```java
    public String decode(final String str) throws DecoderException {
        if (str == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/URLCodec.java`
#### Snippet
```java
    public Object decode(final Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/URLCodec.java`
#### Snippet
```java
    public String encode(final String str, final String charsetName) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return StringUtils.newStringUsAscii(encode(str.getBytes(charsetName)));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/URLCodec.java`
#### Snippet
```java
    public Object encode(final Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/URLCodec.java`
#### Snippet
```java
    public String encode(final String str) throws EncoderException {
        if (str == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/URLCodec.java`
#### Snippet
```java
    public static final byte[] encodeUrl(BitSet urlsafe, final byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        if (urlsafe == null) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/language/DaitchMokotoffSoundex.java`
#### Snippet
```java
    public String encode(final String source) {
        if (source == null) {
            return null;
        }
        return soundex(source, false)[0];
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/language/DaitchMokotoffSoundex.java`
#### Snippet
```java
    private String[] soundex(final String source, final boolean branching) {
        if (source == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/language/ColognePhonetic.java`
#### Snippet
```java
    public String colognePhonetic(final String text) {
        if (text == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/RFC1522Codec.java`
#### Snippet
```java
            throws EncoderException, UnsupportedEncodingException {
        if (text == null) {
            return null;
        }
        return this.encodeText(text, Charset.forName(charsetName));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/RFC1522Codec.java`
#### Snippet
```java
            throws DecoderException, UnsupportedEncodingException {
        if (text == null) {
            return null;
        }
        if (!text.startsWith(PREFIX) || !text.endsWith(POSTFIX)) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/RFC1522Codec.java`
#### Snippet
```java
    protected String encodeText(final String text, final Charset charset) throws EncoderException {
        if (text == null) {
            return null;
        }
        final StringBuilder buffer = new StringBuilder();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/PercentCodec.java`
#### Snippet
```java
    public byte[] encode(final byte[] bytes) throws EncoderException {
        if (bytes == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/PercentCodec.java`
#### Snippet
```java
    public Object encode(final Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/PercentCodec.java`
#### Snippet
```java
    public Object decode(final Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/PercentCodec.java`
#### Snippet
```java
    public byte[] decode(final byte[] bytes) throws DecoderException {
        if (bytes == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/binary/StringUtils.java`
#### Snippet
```java
     */
    private static String newString(final byte[] bytes, final Charset charset) {
        return bytes == null ? null : new String(bytes, charset);
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/binary/StringUtils.java`
#### Snippet
```java
     */
    private static byte[] getBytes(final String string, final Charset charset) {
        return string == null ? null : string.getBytes(charset);
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/binary/StringUtils.java`
#### Snippet
```java
    public static byte[] getBytesUnchecked(final String string, final String charsetName) {
        if (string == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/binary/StringUtils.java`
#### Snippet
```java
    public static String newString(final byte[] bytes, final String charsetName) {
        if (bytes == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/binary/StringUtils.java`
#### Snippet
```java
    private static ByteBuffer getByteBuffer(final String string, final Charset charset) {
        if (string == null) {
            return null;
        }
        return ByteBuffer.wrap(string.getBytes(charset));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/QCodec.java`
#### Snippet
```java
    public String decode(final String str) throws DecoderException {
        if (str == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/QCodec.java`
#### Snippet
```java
    public String encode(final String sourceStr) throws EncoderException {
        if (sourceStr == null) {
            return null;
        }
        return encode(sourceStr, getCharset());
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/QCodec.java`
#### Snippet
```java
    public String encode(final String sourceStr, final String sourceCharset) throws EncoderException {
        if (sourceStr == null) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/QCodec.java`
#### Snippet
```java
    protected byte[] doEncoding(final byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        final byte[] data = QuotedPrintableCodec.encodeQuotedPrintable(PRINTABLE_CHARS, bytes);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/QCodec.java`
#### Snippet
```java
    public String encode(final String sourceStr, final Charset sourceCharset) throws EncoderException {
        if (sourceStr == null) {
            return null;
        }
        return encodeText(sourceStr, sourceCharset);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/QCodec.java`
#### Snippet
```java
    protected byte[] doDecoding(final byte[] bytes) throws DecoderException {
        if (bytes == null) {
            return null;
        }
        boolean hasUnderscores = false;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/QCodec.java`
#### Snippet
```java
    public Object encode(final Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/net/QCodec.java`
#### Snippet
```java
    public Object decode(final Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/language/bm/BeiderMorseEncoder.java`
#### Snippet
```java
    public String encode(final String source) throws EncoderException {
        if (source == null) {
            return null;
        }
        return this.engine.encode(source);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/language/Nysiis.java`
#### Snippet
```java
    public String nysiis(String str) {
        if (str == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
        value = cleanInput(value);
        if (value == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
    private String cleanInput(String input) {
        if (input == null) {
            return null;
        }
        input = input.trim();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
        input = input.trim();
        if (input.isEmpty()) {
            return null;
        }
        return input.toUpperCase(java.util.Locale.ENGLISH);
```

## RuleId[id=ArrayEquality]
### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/codec/binary/Base64.java`
#### Snippet
```java
                    buffer[context.pos++] = encodeTable[(context.ibitWorkArea << 4) & MASK_6BITS];
                    // URL-SAFE skips the padding to further reduce size.
                    if (encodeTable == STANDARD_ENCODE_TABLE) {
                        buffer[context.pos++] = pad;
                        buffer[context.pos++] = pad;
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/codec/binary/Base64.java`
#### Snippet
```java
                    buffer[context.pos++] = encodeTable[(context.ibitWorkArea << 2) & MASK_6BITS];
                    // URL-SAFE skips the padding to further reduce size.
                    if (encodeTable == STANDARD_ENCODE_TABLE) {
                        buffer[context.pos++] = pad;
                    }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/codec/binary/Base64.java`
#### Snippet
```java
     */
    public boolean isUrlSafe() {
        return this.encodeTable == URL_SAFE_ENCODE_TABLE;
    }

```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `compareCode` initializer `0` is redundant
in `src/main/java/org/apache/commons/codec/StringEncoderComparator.java`
#### Snippet
```java
    public int compare(final Object o1, final Object o2) {

        int compareCode = 0;

        try {
```

### UnusedAssignment
Variable `minRating` initializer `0` is redundant
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java
     */
    int getMinRating(final int sumLength) {
        int minRating = 0;

        if (sumLength <= 4) {
```

### UnusedAssignment
Variable `name1LtRStart` initializer `EMPTY` is redundant
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java
        final int name2Size = name2.length() - 1;

        String name1LtRStart = EMPTY;
        String name1LtREnd = EMPTY;

```

### UnusedAssignment
Variable `name1LtREnd` initializer `EMPTY` is redundant
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java

        String name1LtRStart = EMPTY;
        String name1LtREnd = EMPTY;

        String name2RtLStart = EMPTY;
```

### UnusedAssignment
Variable `name2RtLStart` initializer `EMPTY` is redundant
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java
        String name1LtREnd = EMPTY;

        String name2RtLStart = EMPTY;
        String name2RtLEnd = EMPTY;

```

### UnusedAssignment
Variable `name2RtLEnd` initializer `EMPTY` is redundant
in `src/main/java/org/apache/commons/codec/language/MatchRatingApproachEncoder.java`
#### Snippet
```java

        String name2RtLStart = EMPTY;
        String name2RtLEnd = EMPTY;

        for (int i = 0; i < name1Char.length; i++) {
```

### UnusedAssignment
The value changed at `offset++` is never used
in `src/main/java/org/apache/commons/codec/digest/UnixCrypt.java`
#### Snippet
```java
        value |= byteToUnsigned(b[offset++]) << 8;
        value |= byteToUnsigned(b[offset++]) << 16;
        value |= byteToUnsigned(b[offset++]) << 24;
        return value;
    }
```

### UnusedAssignment
The value changed at `offset++` is never used
in `src/main/java/org/apache/commons/codec/digest/UnixCrypt.java`
#### Snippet
```java
        b[offset++] = (byte) (iValue >>> 8 & 0xff);
        b[offset++] = (byte) (iValue >>> 16 & 0xff);
        b[offset++] = (byte) (iValue >>> 24 & 0xff);
    }

```

### UnusedAssignment
Variable `t` initializer `0` is redundant
in `src/main/java/org/apache/commons/codec/digest/UnixCrypt.java`
#### Snippet
```java
        int left = 0;
        int right = 0;
        int t = 0;
        for (int j = 0; j < 25; j++) {
            for (int i = 0; i < 32; i += 4) {
```

### UnusedAssignment
Variable `hard` initializer `false` is redundant
in `src/main/java/org/apache/commons/codec/language/Metaphone.java`
#### Snippet
```java
     */
    public String metaphone(final String txt) {
        boolean hard = false;
        final int txtLength;
        if (txt == null || (txtLength = txt.length()) == 0) {
```

### UnusedAssignment
The value `8` assigned to `localCrc` is never used
in `src/main/java/org/apache/commons/codec/digest/PureJavaCrc32C.java`
#### Snippet
```java
      final int c1 =(b[off+1] ^ (localCrc >>>= 8)) & 0xff;
      final int c2 =(b[off+2] ^ (localCrc >>>= 8)) & 0xff;
      final int c3 =(b[off+3] ^ (localCrc >>>= 8)) & 0xff;
      localCrc = (T[T8_7_START + c0] ^ T[T8_6_START + c1]) ^
                 (T[T8_5_START + c2] ^ T[T8_4_START + c3]);
```

### UnusedAssignment
The value changed at `off++` is never used
in `src/main/java/org/apache/commons/codec/digest/PureJavaCrc32C.java`
#### Snippet
```java
      case 3: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 2: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 1: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      default:
        break; // satisfy Findbugs
```

### UnusedAssignment
Variable `length` initializer `0` is redundant
in `src/main/java/org/apache/commons/codec/language/ColognePhonetic.java`
#### Snippet
```java
        protected final char[] data;

        protected int length = 0;

        public CologneBuffer(final char[] data) {
```

### UnusedAssignment
The value changed at `i++` is never used
in `src/main/java/org/apache/commons/codec/digest/PureJavaCrc32.java`
#### Snippet
```java
      case 3: localCrc = (localCrc >>> 8) ^ T[((localCrc ^ b[i++]) << 24) >>> 24];
      case 2: localCrc = (localCrc >>> 8) ^ T[((localCrc ^ b[i++]) << 24) >>> 24];
      case 1: localCrc = (localCrc >>> 8) ^ T[((localCrc ^ b[i++]) << 24) >>> 24];
      default:
        /* nothing */
```

### UnusedAssignment
Variable `k` initializer `-1` is redundant
in `src/main/java/org/apache/commons/codec/digest/MurmurHash3.java`
#### Snippet
```java
            final int newLength;
            if (unprocessedLength > 0) {
                int k = -1;
                switch (unprocessedLength) {
                case 1:
```

## RuleId[id=ConstantValue]
### ConstantValue
Result of `index - 1` is always '0'
in `src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java`
#### Snippet
```java
            !contains(value, index + 2, 2, "HU")) {
            //-- "bellocchio" but not "bacchus" --//
            if ((index == 1 && charAt(value, index - 1) == 'A') ||
                contains(value, index - 1, 5, "UCCEE", "UCCES")) {
                //-- "accident", "accede", "succeed" --//
```

