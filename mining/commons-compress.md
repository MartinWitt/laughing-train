# commons-compress 
 
# Bad smells
I found 771 bad smells with 10 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 147 | false |
| UnusedAssignment | 79 | false |
| UNCHECKED_WARNING | 72 | false |
| DuplicatedCode | 53 | false |
| OctalLiteral | 51 | false |
| ConstantValue | 32 | false |
| DataFlowIssue | 28 | false |
| FieldCanBeLocal | 25 | false |
| IntegerMultiplicationImplicitCastToLong | 25 | false |
| IgnoreResultOfCall | 23 | false |
| CommentedOutCode | 18 | false |
| TrivialIf | 18 | false |
| MagicConstant | 16 | false |
| JavadocReference | 14 | false |
| StaticInitializerReferencesSubClass | 10 | false |
| TrivialStringConcatenation | 10 | false |
| EmptyStatementBody | 9 | false |
| UnnecessaryLabelOnBreakStatement | 9 | false |
| PointlessBitwiseExpression | 8 | false |
| StringOperationCanBeSimplified | 8 | false |
| DeprecatedIsStillUsed | 8 | false |
| SuspiciousMethodCalls | 8 | false |
| UnnecessaryLabelOnContinueStatement | 7 | false |
| JavadocLinkAsPlainText | 6 | false |
| UnaryPlus | 6 | false |
| InnerClassMayBeStatic | 6 | true |
| MismatchedArrayReadWrite | 5 | false |
| PointlessArithmeticExpression | 5 | false |
| FinalStaticMethod | 5 | false |
| NegativeIntConstantInLongContext | 5 | false |
| DuplicateBranchesInSwitch | 4 | false |
| Deprecation | 4 | false |
| StringBufferReplaceableByString | 4 | false |
| FieldMayBeFinal | 4 | false |
| SuspiciousSystemArraycopy | 3 | false |
| CatchMayIgnoreException | 3 | false |
| RedundantCast | 3 | false |
| StringEquality | 2 | false |
| FinalPrivateMethod | 2 | false |
| UnnecessaryReturn | 2 | true |
| ManualMinMaxCalculation | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| StringConcatenationInLoops | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| IOStreamConstructor | 2 | false |
| SuspiciousToArrayCall | 2 | false |
| UnnecessaryUnicodeEscape | 2 | false |
| ConditionalBreakInInfiniteLoop | 1 | false |
| SimplifiableConditionalExpression | 1 | false |
| SillyAssignment | 1 | false |
| IfStatementMissingBreakInLoop | 1 | false |
| MalformedFormatString | 1 | false |
| UNUSED_IMPORT | 1 | false |
| TypeParameterExtendsObject | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| NonStrictComparisonCanBeEquality | 1 | true |
| CopyConstructorMissesField | 1 | false |
## RuleId[id=StringEquality]
### StringEquality
String values are compared using `==`, not 'equals()'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentConstantPoolArrayCache.java`
#### Snippet
```java
        // several secondary elements with the same primary
        // key.
        if ((lastArray == array) && (lastKey == key)) {
            return lastIndexes;
        }
```

### StringEquality
String values are compared using `==`, not 'equals()'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/AttributeLayout.java`
#### Snippet
```java

    public int numBackwardsCallables() {
        if (layout == "*") {
            return 1;
        }
```

## RuleId[id=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `newArray` are written to, but never read
in `src/main/java/org/apache/commons/compress/harmony/pack200/SegmentHeader.java`
#### Snippet
```java
                length++;
                if (length > objs.length - 1) {
                    final Object[] newArray = new Object[objs.length + 8];
                    System.arraycopy(objs, 0, newArray, 0, length);
                }
```

### MismatchedArrayReadWrite
Contents of array `canonicalSmallest` are written to, but never read
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
    private long[] canonicalLargest;

    private long[] canonicalSmallest;

    /**
```

### MismatchedArrayReadWrite
Contents of array `cpFieldDescriptor` are written to, but never read
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java
    private double[] cpDouble;
    private String[] cpFieldClass;
    private String[] cpFieldDescriptor;
    private int[] cpFieldClassInts;
    private int[] cpFieldDescriptorInts;
```

### MismatchedArrayReadWrite
Contents of array `cpIMethodDescriptor` are written to, but never read
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java
    private float[] cpFloat;
    private String[] cpIMethodClass;
    private String[] cpIMethodDescriptor;
    private int[] cpIMethodClassInts;
    private int[] cpIMethodDescriptorInts;
```

### MismatchedArrayReadWrite
Contents of array `codes` are written to, but never read
in `src/main/java/org/apache/commons/compress/harmony/unpack200/BcBands.java`
#### Snippet
```java
                    methodByteCodePacked[c][m] = codeBytes.toByteArray();
                    bcParsed += methodByteCodePacked[c][m].length;
                    final int[] codes = new int[methodByteCodePacked[c][m].length];
                    for (int i = 0; i < codes.length; i++) {
                        codes[i] = methodByteCodePacked[c][m][i] & 0xff;
```

## RuleId[id=ConditionalBreakInInfiniteLoop]
### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
        /*-- LBZ2: the log(N) loop --*/
        H = 1;
        while (true) {

            j = 0;
```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`1024L * 1024 * 1` can be replaced with '1024L \* 1024'
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
    private Archive tryToLocateEndHeader(final byte[] password) throws IOException {
        final ByteBuffer nidBuf = ByteBuffer.allocate(1);
        final long searchLimit = 1024L * 1024 * 1;
        // Main header, plus bytes that readStartHeader would read
        final long previousDataSize = channel.position() + 20;
```

### PointlessArithmeticExpression
`SIGNATURE_HEADER_SIZE + archive.packPos + 0` can be replaced with 'SIGNATURE_HEADER_SIZE + archive.packPos'
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
        final Folder folder = archive.folders[0];
        final int firstPackStreamIndex = 0;
        final long folderOffset = SIGNATURE_HEADER_SIZE + archive.packPos +
                0;

        channel.position(folderOffset);
```

### PointlessArithmeticExpression
`0*256` can be replaced with '0'
in `src/main/java/org/apache/commons/compress/compressors/snappy/PureJavaCrc32C.java`
#### Snippet
```java
final class PureJavaCrc32C implements Checksum {

  private static final int T8_0_START = 0*256;

  private static final int T8_1_START = 1*256;
```

### PointlessArithmeticExpression
`off+0` can be replaced with 'off'
in `src/main/java/org/apache/commons/compress/compressors/snappy/PureJavaCrc32C.java`
#### Snippet
```java

    while(len > 7) {
      final int c0 =(b[off+0] ^ localCrc) & 0xff;
      final int c1 =(b[off+1] ^ (localCrc >>>= 8)) & 0xff; //NOSONAR
      final int c2 =(b[off+2] ^ (localCrc >>>= 8)) & 0xff; //NOSONAR
```

### PointlessArithmeticExpression
`1*256` can be replaced with '256'
in `src/main/java/org/apache/commons/compress/compressors/snappy/PureJavaCrc32C.java`
#### Snippet
```java
  private static final int T8_0_START = 0*256;

  private static final int T8_1_START = 1*256;

  private static final int T8_2_START = 2*256;
```

## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: ZipEntry.STORED, ZipEntry.DEFLATED
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipUtil.java`
#### Snippet
```java
    private static boolean supportsMethodOf(final ZipArchiveEntry entry) {
        return entry.getMethod() == ZipEntry.STORED
            || entry.getMethod() == ZipMethod.UNSHRINKING.getCode()
            || entry.getMethod() == ZipMethod.IMPLODING.getCode()
            || entry.getMethod() == ZipEntry.DEFLATED
```

### MagicConstant
Should be one of: ZipEntry.STORED, ZipEntry.DEFLATED
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipUtil.java`
#### Snippet
```java
        return entry.getMethod() == ZipEntry.STORED
            || entry.getMethod() == ZipMethod.UNSHRINKING.getCode()
            || entry.getMethod() == ZipMethod.IMPLODING.getCode()
            || entry.getMethod() == ZipEntry.DEFLATED
            || entry.getMethod() == ZipMethod.ENHANCED_DEFLATED.getCode()
```

### MagicConstant
Should be one of: ZipEntry.STORED, ZipEntry.DEFLATED
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipUtil.java`
#### Snippet
```java
            || entry.getMethod() == ZipMethod.IMPLODING.getCode()
            || entry.getMethod() == ZipEntry.DEFLATED
            || entry.getMethod() == ZipMethod.ENHANCED_DEFLATED.getCode()
            || entry.getMethod() == ZipMethod.BZIP2.getCode();
    }
```

### MagicConstant
Should be one of: ZipEntry.STORED, ZipEntry.DEFLATED
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipUtil.java`
#### Snippet
```java
            || entry.getMethod() == ZipEntry.DEFLATED
            || entry.getMethod() == ZipMethod.ENHANCED_DEFLATED.getCode()
            || entry.getMethod() == ZipMethod.BZIP2.getCode();
    }

```

### MagicConstant
Should be one of: ZipEntry.STORED, ZipEntry.DEFLATED
in `src/main/java/org/apache/commons/compress/archivers/zip/ScatterZipOutputStream.java`
#### Snippet
```java
            entry.setSize(size);
            entry.setCrc(crc);
            entry.setMethod(zipArchiveEntryRequest.getMethod());
            return entry;
        }
```

### MagicConstant
Should be one of: ZipEntry.STORED, ZipEntry.DEFLATED
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java
    @Override
    public int getMethod() {
        return method;
    }

```

### MagicConstant
Should be one of: ZipEntry.STORED, ZipEntry.DEFLATED
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java`
#### Snippet
```java
     */
    private void setDefaults(final ZipArchiveEntry entry) {
        if (entry.getMethod() == -1) { // not specified
            entry.setMethod(method);
        }
```

### MagicConstant
Should be one of: ZipEntry.STORED, ZipEntry.DEFLATED
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java`
#### Snippet
```java
        if (ae instanceof ZipArchiveEntry) {
            final ZipArchiveEntry zae = (ZipArchiveEntry) ae;
            return zae.getMethod() != ZipMethod.IMPLODING.getCode()
                && zae.getMethod() != ZipMethod.UNSHRINKING.getCode()
                && ZipUtil.canHandleEntryData(zae);
```

### MagicConstant
Should be one of: ZipEntry.STORED, ZipEntry.DEFLATED
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java`
#### Snippet
```java
            final ZipArchiveEntry zae = (ZipArchiveEntry) ae;
            return zae.getMethod() != ZipMethod.IMPLODING.getCode()
                && zae.getMethod() != ZipMethod.UNSHRINKING.getCode()
                && ZipUtil.canHandleEntryData(zae);
        }
```

### MagicConstant
Should be one of: ZipEntry.STORED, ZipEntry.DEFLATED
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java`
#### Snippet
```java
        off += SHORT;

        current.entry.setMethod(ZipShort.getValue(lfhBuf, off));
        off += SHORT;

```

### MagicConstant
Should be one of: ZipEntry.STORED, ZipEntry.DEFLATED
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java`
#### Snippet
```java
        return entry.getCompressedSize() != ArchiveEntry.SIZE_UNKNOWN
            || entry.getMethod() == ZipEntry.DEFLATED
            || entry.getMethod() == ZipMethod.ENHANCED_DEFLATED.getCode()
            || (entry.getGeneralPurposeBit().usesDataDescriptor()
                && allowStoredEntriesWithDataDescriptor
```

### MagicConstant
Should be one of: ZipEntry.STORED, ZipEntry.DEFLATED
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java`
#### Snippet
```java
        } else if (current.entry.getMethod() == ZipArchiveOutputStream.DEFLATED) {
            read = readDeflated(buffer, offset, length);
        } else if (current.entry.getMethod() == ZipMethod.UNSHRINKING.getCode()
                || current.entry.getMethod() == ZipMethod.IMPLODING.getCode()
                || current.entry.getMethod() == ZipMethod.ENHANCED_DEFLATED.getCode()
```

### MagicConstant
Should be one of: ZipEntry.STORED, ZipEntry.DEFLATED
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java`
#### Snippet
```java
            read = readDeflated(buffer, offset, length);
        } else if (current.entry.getMethod() == ZipMethod.UNSHRINKING.getCode()
                || current.entry.getMethod() == ZipMethod.IMPLODING.getCode()
                || current.entry.getMethod() == ZipMethod.ENHANCED_DEFLATED.getCode()
                || current.entry.getMethod() == ZipMethod.BZIP2.getCode()) {
```

### MagicConstant
Should be one of: ZipEntry.STORED, ZipEntry.DEFLATED
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java`
#### Snippet
```java
        } else if (current.entry.getMethod() == ZipMethod.UNSHRINKING.getCode()
                || current.entry.getMethod() == ZipMethod.IMPLODING.getCode()
                || current.entry.getMethod() == ZipMethod.ENHANCED_DEFLATED.getCode()
                || current.entry.getMethod() == ZipMethod.BZIP2.getCode()) {
            read = current.inputStream.read(buffer, offset, length);
```

### MagicConstant
Should be one of: ZipEntry.STORED, ZipEntry.DEFLATED
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java`
#### Snippet
```java
                || current.entry.getMethod() == ZipMethod.IMPLODING.getCode()
                || current.entry.getMethod() == ZipMethod.ENHANCED_DEFLATED.getCode()
                || current.entry.getMethod() == ZipMethod.BZIP2.getCode()) {
            read = current.inputStream.read(buffer, offset, length);
        } else {
```

### MagicConstant
Should be one of: ZipEntry.STORED, ZipEntry.DEFLATED
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java`
#### Snippet
```java
                || (allowStoredEntriesWithDataDescriptor && entry.getMethod() == ZipEntry.STORED)
                || entry.getMethod() == ZipEntry.DEFLATED
                || entry.getMethod() == ZipMethod.ENHANCED_DEFLATED.getCode();
    }
}
```

## RuleId[id=SuspiciousSystemArraycopy]
### SuspiciousSystemArraycopy
Source parameter type 'int\[\]' is not assignable to destination parameter `newArray` of type 'java.lang.Object\[\]'
in `src/main/java/org/apache/commons/compress/harmony/pack200/SegmentHeader.java`
#### Snippet
```java
                if (length > objs.length - 1) {
                    final Object[] newArray = new Object[objs.length + 8];
                    System.arraycopy(objs, 0, newArray, 0, length);
                }
            }
```

### SuspiciousSystemArraycopy
Copying to the same array with intersecting ranges
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java`
#### Snippet
```java
            final byte[] missedLfhBytes = new byte[4];
            readFully(missedLfhBytes);
            System.arraycopy(lfhBuf, 4, lfhBuf, 0, LFH_LEN - 4);
            System.arraycopy(missedLfhBytes, 0, lfhBuf, LFH_LEN - 4, 4);
        }
```

### SuspiciousSystemArraycopy
Copying to the same array with intersecting ranges
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java`
#### Snippet
```java
                    }
                } else {
                    System.arraycopy(yy, 0, yy, 1, nextSym - 1);
                }

```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
            } else if ((tag.equals("I") || tag.equals("FI")) || tag.equals("SI")) {
                value = readInteger(4, inputStream);
            } else if (tag.equals("V") || tag.equals("FV") || tag.equals("SV")) {
                // Not currently supported
            } else if (tag.startsWith("PO") || tag.startsWith("OS")) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentUtils.java`
#### Snippet
```java
            } else if (charAt == '[') {
                consumingNextType = true;
            } else if (inType) {
                // NOP
            } else if (consumingNextType) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
                    return encodedBand;
                }
                if (betterCodec instanceof RunCodec) {

                }
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/apache/commons/compress/harmony/unpack200/IcTuple.java`
#### Snippet
```java
        // this class name.
        final String[] nameComponents = innerBreakAtDollar(C);
        if (nameComponents.length == 0) {
            // Unable to predict outer class
            // throw new Error("Unable to predict outer class name: " + C);
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/apache/commons/compress/harmony/unpack200/IcTuple.java`
#### Snippet
```java
            // throw new Error("Unable to predict outer class name: " + C);
        }
        if (nameComponents.length == 1) {
            // Unable to predict simple class name
            // throw new Error("Unable to predict inner class name: " + C);
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
            } else if ((tag.equals("I") || tag.equals("FI")) || tag.equals("SI")) {
                attribute.addInteger(4, value);
            } else if (tag.equals("V") || tag.equals("FV") || tag.equals("SV")) {
                // Don't add V's - they shouldn't be written out to the class
                // file
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
			} else if (charAt == '[') {
				consumingNextType = true;
			} else if (inType) {
				// NOP
			} else if (consumingNextType) {
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveInputStream.java`
#### Snippet
```java
        // the skip implementation of this class will not skip more
        // than Integer.MAX_VALUE bytes
        while (skip((long) Integer.MAX_VALUE) == Integer.MAX_VALUE) { // NOPMD NOSONAR
            // do nothing
        }
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/apache/commons/compress/compressors/lz77support/AbstractLZ77CompressorInputStream.java`
#### Snippet
```java
        final int copy = Math.min((int) Math.min(bytesToCopy, bytesRemaining),
                            buf.length - writeIndex);
        if (copy == 0) {
            // NOP
        } else if (backReferenceOffset == 1) { // pretty common special case
```

## RuleId[id=StaticInitializerReferencesSubClass]
### StaticInitializerReferencesSubClass
Referencing subclass BHSDCodec from superclass Codec initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/compress/harmony/pack200/Codec.java`
#### Snippet
```java
     * values.
     */
    public static final BHSDCodec DELTA5 = new BHSDCodec(5, 64, 1, 1);

    /**
```

### StaticInitializerReferencesSubClass
Referencing subclass BHSDCodec from superclass Codec initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/compress/harmony/pack200/Codec.java`
#### Snippet
```java
     * properties; ASCII characters &lt; 127 are stored in a single byte.
     */
    public static final BHSDCodec CHAR3 = new BHSDCodec(3, 128);

    /**
```

### StaticInitializerReferencesSubClass
Referencing subclass BHSDCodec from superclass Codec initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/compress/harmony/pack200/Codec.java`
#### Snippet
```java
     * SIGNED5 = (5,64,1): Used for small signed values.
     */
    public static final BHSDCodec SIGNED5 = new BHSDCodec(5, 64, 1);

    /**
```

### StaticInitializerReferencesSubClass
Referencing subclass BHSDCodec from superclass Codec initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/compress/harmony/pack200/Codec.java`
#### Snippet
```java
     * values, but where most of them are expected to be non-negative.
     */
    public static final BHSDCodec MDELTA5 = new BHSDCodec(5, 64, 2, 1);

    /**
```

### StaticInitializerReferencesSubClass
Referencing subclass BHSDCodec from superclass Codec initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/compress/harmony/pack200/Codec.java`
#### Snippet
```java
     * values.
     */
    public static final BHSDCodec UDELTA5 = new BHSDCodec(5, 64, 0, 1);

    /**
```

### StaticInitializerReferencesSubClass
Referencing subclass BHSDCodec from superclass Codec initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/compress/harmony/pack200/Codec.java`
#### Snippet
```java
     * UNSIGNED5 = (5,64): Used for small unsigned values.
     */
    public static final BHSDCodec UNSIGNED5 = new BHSDCodec(5, 64);

    public int lastBandLength;
```

### StaticInitializerReferencesSubClass
Referencing subclass BHSDCodec from superclass Codec initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/compress/harmony/pack200/Codec.java`
#### Snippet
```java
     * BCI5 = (5,4): Used for storing branching information in bytecode.
     */
    public static final BHSDCodec BCI5 = new BHSDCodec(5, 4);

    /**
```

### StaticInitializerReferencesSubClass
Referencing subclass BHSDCodec from superclass Codec initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/compress/harmony/pack200/Codec.java`
#### Snippet
```java
     * BYTE1 = (1,256): Used for storing plain bytes.
     */
    public static final BHSDCodec BYTE1 = new BHSDCodec(1, 256);

    /**
```

### StaticInitializerReferencesSubClass
Referencing subclass BHSDCodec from superclass Codec initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/compress/harmony/pack200/Codec.java`
#### Snippet
```java
     * BRANCH5 = (5,4,2): Used for storing branching information in bytecode.
     */
    public static final BHSDCodec BRANCH5 = new BHSDCodec(5, 4, 2);

    /**
```

### StaticInitializerReferencesSubClass
Referencing subclass NoArgumentForm from superclass ByteCodeForm initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/ByteCodeForm.java`
#### Snippet
```java
        // Reserved bytecodes
        byteCodeArray[254] = new NoArgumentForm(254, "impdep1");
        byteCodeArray[255] = new NoArgumentForm(255, "impdep2");

        // Bytecodes that aren't defined in the spec but are useful when
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/org/apache/commons/compress/harmony/pack200/BHSDCodec.java`
#### Snippet
```java
    }

    // private long cast32(long u) {
    // u = (long) ((long) ((u + Math.pow(2, 31)) % Math.pow(2, 32)) -
    // Math.pow(2, 31));
```

### CommentedOutCode
Commented out code (14 lines)
in `src/main/java/org/apache/commons/compress/harmony/pack200/BHSDCodec.java`
#### Snippet
```java
        // This algorithm does the same thing, but is probably slower. Leaving
        // in for now for readability
        // if (isSigned()) {
        // long u = z;
        // long twoPowS = (long)Math.pow(2, s);
```

### CommentedOutCode
Commented out code (7 lines)
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from bcInitRef[" + bcInitRef.size() + "]");

        // out.write(encodeBandInt(cpEntryintegerListToArray(bcEscRef),
        // Codec.UNSIGNED5));
        // out.write(encodeBandInt(integerListToArray(bcEscRefSize),
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
        byte[] encodedBand = null;
        // Useful for debugging
//        if (ints.length > 0) {
//            System.out.println("encoding " + name + " " + ints.length);
//        }
```

### CommentedOutCode
Commented out code (23 lines)
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java

// This could be useful if further enhancements are done but is not currently used
//
//    private void encodeWithRunCodec(String name, int[] band, int index,
//            BHSDCodec defaultCodec, BandData bandData,
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/compress/harmony/unpack200/BandSet.java`
#### Snippet
```java
        int[] band;
        // Useful for debugging
//        if (count > 0) {
//            System.out.println("decoding " + name + " " + count);
//        }
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/compress/harmony/unpack200/BandSet.java`
#### Snippet
```java
        }
        // Useful for debugging -E options:
        // if (!codecUsed.equals(codec)) {
        // int bytes = codecUsed.lastBandLength;
        // System.out.println(count + " " + name + " encoded with " + codecUsed + " " + bytes);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentConstantPool.java`
#### Snippet
```java
        case CP_DESCR:
            throw new Error("I don't know what to do with descriptors yet");
            // return null /* new CPDescriptor(bands.getCpDescriptor()[index])
            // */;
        case CP_FIELD:
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
			anySyntheticClasses = true;
		}
//		if ((flags & Opcodes.ACC_DEPRECATED) != 0) { // ASM uses (1<<17) flag for deprecated
//			flags = flags & ~Opcodes.ACC_DEPRECATED;
//			flags = flags | (1 << 20);
```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java
            mapSignature.put(signature.toString(), Integer.valueOf(i));
        }
//        for (int i = 0; i < cpSignatureInts.length; i++) {
//            if (cpSignatureInts[i] == -1) {
//                cpSignatureInts[i] = search(cpUTF8, cpSignature[i]);
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java`
#### Snippet
```java
                final Dirent d = new Dirent(ino, entry.getIno(), type, name);

                /*
                if ((type == 4) && names.containsKey(ino)) {
                    System.out.println("we already have ino: " +
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java`
#### Snippet
```java
            ? (Zip64ExtendedInformationExtraField) extra : null;
        if (z64 == null) {
            /*
              System.err.println("Adding z64 for " + ze.getName()
              + ", method: " + ze.getMethod()
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
                    buffer, 0));

        //header.dumpDate = new Date(1000L * DumpArchiveUtil.convert32(buffer, 4));
        //header.previousDumpDate = new Date(1000L * DumpArchiveUtil.convert32(
        //            buffer, 8));
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
        entry.ino = header.ino = DumpArchiveUtil.convert32(buffer, 20);

        //header.magic = DumpArchiveUtil.convert32(buffer, 24);
        //header.checksum = DumpArchiveUtil.convert32(buffer, 28);
        final int m = DumpArchiveUtil.convert16(buffer, 32);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
        // db: 72-119 - direct blocks
        // id: 120-131 - indirect blocks
        //entry.flags = DumpArchiveUtil.convert32(buffer, 132);
        //entry.blocks = DumpArchiveUtil.convert32(buffer, 136);
        entry.generation = DumpArchiveUtil.convert32(buffer, 140);
```

### CommentedOutCode
Commented out code (7 lines)
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZOutputFile.java`
#### Snippet
```java
    private void writeSubStreamsInfo(final DataOutput header) throws IOException {
        header.write(NID.kSubStreamsInfo);
        //
        //        header.write(NID.kCRC);
        //        header.write(1);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java`
#### Snippet
```java
                final int sfmap_i = sfmap[gs];

                //
                // inlined: bsW(len_selCtr[sfmap_i] & 0xff,
                // code_selCtr[sfmap_i]);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java`
#### Snippet
```java
            }

            // assert (maxLen <= 20) : maxLen;
            // assert (minLen >= 1) : minLen;

```

## RuleId[id=UnnecessaryLabelOnContinueStatement]
### UnnecessaryLabelOnContinueStatement
Unnecessary label `X` on continue statement
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
                                                                                    }
                                                                                    workDoneShadow++;
                                                                                    continue X;
                                                                                }
                                                                                if ((quadrant[i1 + 3] > quadrant[i2 + 3])) {
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `HAMMER` on continue statement
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
                                            } // while x > 0
                                            if ((block[i1] & 0xff) > (block[i2] & 0xff)) {
                                                continue HAMMER;
                                            }
                                            break HAMMER;
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `HAMMER` on continue statement
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
                                        }
                                        if ((block[i1 + 5] & 0xff) > (block[i2 + 5] & 0xff)) {
                                            continue HAMMER;
                                        }
                                        break HAMMER;
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `HAMMER` on continue statement
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
                                    }
                                    if ((block[i1 + 4] & 0xff) > (block[i2 + 4] & 0xff)) {
                                        continue HAMMER;
                                    }
                                    break HAMMER;
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `HAMMER` on continue statement
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
                                }
                                if ((block[i1 + 3] & 0xff) > (block[i2 + 3] & 0xff)) {
                                    continue HAMMER;
                                }
                                break HAMMER;
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `HAMMER` on continue statement
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
                            }
                            if ((block[i1 + 2] & 0xff) > (block[i2 + 2] & 0xff)) {
                                continue HAMMER;
                            }
                            break HAMMER;
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `HAMMER` on continue statement
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
                        }
                        if ((block[i1 + 1] & 0xff) > (block[i2 + 1] & 0xff)) {
                            continue HAMMER;
                        }
                        break HAMMER;
```

## RuleId[id=UnnecessaryLabelOnBreakStatement]
### UnnecessaryLabelOnBreakStatement
Unnecessary label `LOOP` on break statement
in `src/main/java/org/apache/commons/compress/archivers/zip/ExtraFieldUtils.java`
#### Snippet
```java
                // the extra field consumes the whole rest of the
                // available data
                break LOOP;
            }
            try {
```

### UnnecessaryLabelOnBreakStatement
Unnecessary label `HAMMER` on break statement
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
                            fmap[j] = a;
                            if ((j -= h) <= mj) { //NOSONAR
                                break HAMMER;
                            }
                        } else {
```

### UnnecessaryLabelOnBreakStatement
Unnecessary label `HAMMER` on break statement
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java

                                                }
                                                break HAMMER;
                                            } // while x > 0
                                            if ((block[i1] & 0xff) > (block[i2] & 0xff)) {
```

### UnnecessaryLabelOnBreakStatement
Unnecessary label `HAMMER` on break statement
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
                                                continue HAMMER;
                                            }
                                            break HAMMER;
                                        }
                                        if ((block[i1 + 5] & 0xff) > (block[i2 + 5] & 0xff)) {
```

### UnnecessaryLabelOnBreakStatement
Unnecessary label `HAMMER` on break statement
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
                                            continue HAMMER;
                                        }
                                        break HAMMER;
                                    }
                                    if ((block[i1 + 4] & 0xff) > (block[i2 + 4] & 0xff)) {
```

### UnnecessaryLabelOnBreakStatement
Unnecessary label `HAMMER` on break statement
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
                                        continue HAMMER;
                                    }
                                    break HAMMER;
                                }
                                if ((block[i1 + 3] & 0xff) > (block[i2 + 3] & 0xff)) {
```

### UnnecessaryLabelOnBreakStatement
Unnecessary label `HAMMER` on break statement
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
                                    continue HAMMER;
                                }
                                break HAMMER;
                            }
                            if ((block[i1 + 2] & 0xff) > (block[i2 + 2] & 0xff)) {
```

### UnnecessaryLabelOnBreakStatement
Unnecessary label `HAMMER` on break statement
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
                                continue HAMMER;
                            }
                            break HAMMER;
                        }
                        if ((block[i1 + 1] & 0xff) > (block[i2 + 1] & 0xff)) {
```

### UnnecessaryLabelOnBreakStatement
Unnecessary label `HAMMER` on break statement
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
                            continue HAMMER;
                        }
                        break HAMMER;

                    } // HAMMER
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveEntry.java`
#### Snippet
```java
            break;
        case FORMAT_NEW_CRC:
            this.headerSize = 110;
            this.alignmentBoundary = 4;
            break;
        case FORMAT_OLD_ASCII:
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
                    break;
                }
                case NID.kDummy: {
                    // 7z 9.20 asserts the content is all zeros and ignores the property
                    // Compress up to 1.8.1 would throw an exception, now we ignore it (see COMPRESS-287

                    skipBytesFully(header, size);
                    break;
                }

                default: {
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java`
#### Snippet
```java

        case RAND_PART_A_STATE:
            throw new IllegalStateException();

        case RAND_PART_B_STATE:
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java`
#### Snippet
```java

        case NO_RAND_PART_A_STATE:
            throw new IllegalStateException();

        case NO_RAND_PART_B_STATE:
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveInputStream.java`
#### Snippet
```java
    }

    private final byte[] readRange(final int len)
            throws IOException {
        final byte[] b = IOUtils.readRange(in, len);
```

### FinalPrivateMethod
'private' method declared `final`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveInputStream.java`
#### Snippet
```java
    }

    private final int readFully(final byte[] b, final int off, final int len)
            throws IOException {
        final int count = IOUtils.readFully(in, b, off, len);
```

## RuleId[id=OctalLiteral]
### OctalLiteral
Octal integer `077777777777L`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarConstants.java`
#### Snippet
```java
     * The maximum size of a file in a tar archive which can be expressed in octal char notation (that's 11 sevens, octal).
     */
    long MAXSIZE = 077777777777L;

    /** Offset of start of magic field within header record */
```

### OctalLiteral
Octal integer `07777777L`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarConstants.java`
#### Snippet
```java
     * The maximum value of gid/uid in a tar archive which can be expressed in octal char notation (that's 7 sevens, octal).
     */
    long MAXID = 07777777L;

    /**
```

### OctalLiteral
Octal integer `0170000`
in `src/main/java/org/apache/commons/compress/archivers/zip/UnixStat.java`
#### Snippet
```java
     * @since 1.14
     */
    int FILE_TYPE_FLAG = 0170000;
    /**
     * Indicates symbolic links.
```

### OctalLiteral
Octal integer `0120000`
in `src/main/java/org/apache/commons/compress/archivers/zip/UnixStat.java`
#### Snippet
```java
     * Indicates symbolic links.
     */
    int LINK_FLAG = 0120000;
    /**
     * Indicates plain files.
```

### OctalLiteral
Octal integer `07777`
in `src/main/java/org/apache/commons/compress/archivers/zip/UnixStat.java`
#### Snippet
```java
     * Bits used for permissions (and sticky bit)
     */
    int PERM_MASK = 07777;
    /**
     * Bits used to indicate the file system object type.
```

### OctalLiteral
Octal integer `040000`
in `src/main/java/org/apache/commons/compress/archivers/zip/UnixStat.java`
#### Snippet
```java
     * Indicates directories.
     */
    int DIR_FLAG = 040000;

    // ----------------------------------------------------------
```

### OctalLiteral
Octal integer `0755`
in `src/main/java/org/apache/commons/compress/archivers/zip/UnixStat.java`
#### Snippet
```java
     * Default permissions for directories.
     */
    int DEFAULT_DIR_PERM = 0755;

    /**
```

### OctalLiteral
Octal integer `0644`
in `src/main/java/org/apache/commons/compress/archivers/zip/UnixStat.java`
#### Snippet
```java
     * Default permissions for plain files.
     */
    int DEFAULT_FILE_PERM = 0644;
}

```

### OctalLiteral
Octal integer `0777`
in `src/main/java/org/apache/commons/compress/archivers/zip/UnixStat.java`
#### Snippet
```java
     * Default permissions for symbolic links.
     */
    int DEFAULT_LINK_PERM = 0777;

    /**
```

### OctalLiteral
Octal integer `0100000`
in `src/main/java/org/apache/commons/compress/archivers/zip/UnixStat.java`
#### Snippet
```java
     * Indicates plain files.
     */
    int FILE_FLAG = 0100000;
    /**
     * Indicates directories.
```

### OctalLiteral
Octal integer `0100644`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java

    /** Default permissions bits for files */
    public static final int DEFAULT_FILE_MODE = 0100644;

    /**
```

### OctalLiteral
Octal integer `040755`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java

    /** Default permissions bits for directories */
    public static final int DEFAULT_DIR_MODE = 040755;

    /** Default permissions bits for files */
```

### OctalLiteral
Octal integer `0000200`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Permits the owner of a file to write to the file */
    int C_IWUSR  = 0000200;

    /** Permits the owner of a file to execute the file or to search the directory */
```

### OctalLiteral
Octal integer `070707`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** magic number of a cpio entry in the old binary format */
    int MAGIC_OLD_BINARY = 070707;

    /** write/read a CpioArchiveEntry in the new format. FORMAT_ constants are internal. */
```

### OctalLiteral
Octal integer `0000004`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Permits others to read the file */
    int C_IROTH  = 0000004;

    /** Permits others to write to the file */
```

### OctalLiteral
Octal integer `0000020`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Permits a file's group to write to the file */
    int C_IWGRP  = 0000020;

    /** Permits a file's group to execute the file or to search the directory */
```

### OctalLiteral
Octal integer `0140000`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Defines a socket */
    int C_ISSOCK = 0140000;

    /** Defines a symbolic link */
```

### OctalLiteral
Octal integer `0020000`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Defines a character device */
    int C_ISCHR  = 0020000;

    /** Defines a pipe */
```

### OctalLiteral
Octal integer `0120000`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Defines a symbolic link */
    int C_ISLNK  = 0120000;

    /** HP/UX network special (C_ISCTG) */
```

### OctalLiteral
Octal integer `0100000`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Defines a regular file */
    int C_ISREG  = 0100000;

    /** Defines a block device */
```

### OctalLiteral
Octal integer `0000400`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Permits the owner of a file to read the file */
    int C_IRUSR  = 0000400;

    /** Permits the owner of a file to write to the file */
```

### OctalLiteral
Octal integer `0000010`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Permits a file's group to execute the file or to search the directory */
    int C_IXGRP  = 0000010;


```

### OctalLiteral
Octal integer `0004000`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Set user ID */
    int C_ISUID  = 0004000;

    /** Set group ID */
```

### OctalLiteral
Octal integer `0170000`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Mask for all file type bits. */
    int S_IFMT   = 0170000;

    /** Defines a socket */
```

### OctalLiteral
Octal integer `0000001`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Permits others to execute the file or to search the directory */
    int C_IXOTH  = 0000001;

    /** The special trailer marker */
```

### OctalLiteral
Octal integer `0000002`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Permits others to write to the file */
    int C_IWOTH  = 0000002;

    /** Permits others to execute the file or to search the directory */
```

### OctalLiteral
Octal integer `0002000`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Set group ID */
    int C_ISGID  = 0002000;

    /** On directories, restricted deletion flag. */
```

### OctalLiteral
Octal integer `0001000`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** On directories, restricted deletion flag. */
    int C_ISVTX  = 0001000;


```

### OctalLiteral
Octal integer `0010000`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Defines a pipe */
    int C_ISFIFO = 0010000;


```

### OctalLiteral
Octal integer `0060000`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Defines a block device */
    int C_ISBLK  = 0060000;

    /** Defines a directory */
```

### OctalLiteral
Octal integer `0110000`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** HP/UX network special (C_ISCTG) */
    int C_ISNWK  = 0110000;

    /** Defines a regular file */
```

### OctalLiteral
Octal integer `0000100`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Permits the owner of a file to execute the file or to search the directory */
    int C_IXUSR  = 0000100;


```

### OctalLiteral
Octal integer `0000040`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Permits a file's group to read the file */
    int C_IRGRP  = 0000040;

    /** Permits a file's group to write to the file */
```

### OctalLiteral
Octal integer `0040000`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Defines a directory */
    int C_ISDIR  = 0040000;

    /** Defines a character device */
```

### OctalLiteral
Octal integer `0200`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java
        setExternalAttributes((mode << SHORT_SHIFT)
                              // MS-DOS read-only attribute
                              | ((mode & 0200) == 0 ? 1 : 0)
                              // MS-DOS directory flag
                              | (isDirectory() ? 0x10 : 0));
```

### OctalLiteral
Octal integer `0777777`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java`
#### Snippet
```java
            inode = device = 0;
        } else if (inode == 0 && device == 0) {
            inode = nextArtificalDeviceAndInode & 0777777;
            device = (nextArtificalDeviceAndInode++ >> 18) & 0777777;
        } else {
```

### OctalLiteral
Octal integer `0777777`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java`
#### Snippet
```java
        } else if (inode == 0 && device == 0) {
            inode = nextArtificalDeviceAndInode & 0777777;
            device = (nextArtificalDeviceAndInode++ >> 18) & 0777777;
        } else {
            nextArtificalDeviceAndInode =
```

### OctalLiteral
Octal integer `01000000`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java`
#### Snippet
```java
            nextArtificalDeviceAndInode =
                Math.max(nextArtificalDeviceAndInode,
                         inode + 01000000 * device) + 1;
        }

```

### OctalLiteral
Octal integer `00004`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
        GROUP_WRITE(00020),
        GROUP_EXEC(00010),
        WORLD_READ(00004),
        WORLD_WRITE(00002),
        WORLD_EXEC(00001);
```

### OctalLiteral
Octal integer `00100`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
        USER_READ(00400),
        USER_WRITE(00200),
        USER_EXEC(00100),
        GROUP_READ(00040),
        GROUP_WRITE(00020),
```

### OctalLiteral
Octal integer `00400`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
        SETGUI(02000),
        STICKY(01000),
        USER_READ(00400),
        USER_WRITE(00200),
        USER_EXEC(00100),
```

### OctalLiteral
Octal integer `07777`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
     */
    public void setMode(final int mode) {
        this.mode = mode & 07777;
        this.permissions = PERMISSION.find(mode);
    }
```

### OctalLiteral
Octal integer `00010`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
        GROUP_READ(00040),
        GROUP_WRITE(00020),
        GROUP_EXEC(00010),
        WORLD_READ(00004),
        WORLD_WRITE(00002),
```

### OctalLiteral
Octal integer `00020`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
        USER_EXEC(00100),
        GROUP_READ(00040),
        GROUP_WRITE(00020),
        GROUP_EXEC(00010),
        WORLD_READ(00004),
```

### OctalLiteral
Octal integer `04000`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
public class DumpArchiveEntry implements ArchiveEntry {
    public enum PERMISSION {
        SETUID(04000),
        SETGUI(02000),
        STICKY(01000),
```

### OctalLiteral
Octal integer `02000`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
    public enum PERMISSION {
        SETUID(04000),
        SETGUI(02000),
        STICKY(01000),
        USER_READ(00400),
```

### OctalLiteral
Octal integer `00001`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
        WORLD_READ(00004),
        WORLD_WRITE(00002),
        WORLD_EXEC(00001);

        public static Set<PERMISSION> find(final int code) {
```

### OctalLiteral
Octal integer `00040`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
        USER_WRITE(00200),
        USER_EXEC(00100),
        GROUP_READ(00040),
        GROUP_WRITE(00020),
        GROUP_EXEC(00010),
```

### OctalLiteral
Octal integer `01000`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
        SETUID(04000),
        SETGUI(02000),
        STICKY(01000),
        USER_READ(00400),
        USER_WRITE(00200),
```

### OctalLiteral
Octal integer `00002`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
        GROUP_EXEC(00010),
        WORLD_READ(00004),
        WORLD_WRITE(00002),
        WORLD_EXEC(00001);

```

### OctalLiteral
Octal integer `00200`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
        STICKY(01000),
        USER_READ(00400),
        USER_WRITE(00200),
        USER_EXEC(00100),
        GROUP_READ(00040),
```

## RuleId[id=Deprecation]
### Deprecation
Overrides deprecated method in 'org.apache.commons.compress.archivers.ArchiveOutputStream'
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.java`
#### Snippet
```java
    @Deprecated
    @Override
    public int getCount() {
        return (int) getBytesWritten();
    }
```

### Deprecation
'EFS_FLAG' is deprecated
in `src/main/java/org/apache/commons/compress/archivers/zip/GeneralPurposeBit.java`
#### Snippet
```java
     *
     * <p>The only reason this is public is that {@link
     * ZipArchiveOutputStream#EFS_FLAG} was public in Apache Commons
     * Compress 1.0 and we needed a substitute for it.</p>
     */
```

### Deprecation
Overrides deprecated method in 'org.apache.commons.compress.archivers.ArchiveInputStream'
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java`
#### Snippet
```java
    @Deprecated
    @Override
    public int getCount() {
        return (int) getBytesRead();
    }
```

### Deprecation
'getCount()' is deprecated
in `src/main/java/org/apache/commons/compress/compressors/pack200/Pack200CompressorInputStream.java`
#### Snippet
```java
 * as any other stream.
 *
 * <p>The {@link CompressorInputStream#getCount getCount} and {@link
 * CompressorInputStream#getBytesRead getBytesRead} methods always
 * return 0.</p>
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/IcTuple.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder();
        result.append("IcTuple ");
        result.append('(');
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/org/apache/commons/compress/archivers/arj/LocalFileHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("LocalFileHeader [archiverVersionNumber=");
        builder.append(archiverVersionNumber);
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `src/main/java/org/apache/commons/compress/archivers/arj/MainHeader.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("MainHeader [archiverVersionNumber=");
        builder.append(archiverVersionNumber);
```

### StringBufferReplaceableByString
`StringBuilder buf` can be replaced with 'String'
in `src/main/java/org/apache/commons/compress/archivers/zip/X000A_NTFS.java`
#### Snippet
```java
    @Override
    public String toString() {
        final StringBuilder buf = new StringBuilder();
        buf.append("0x000A Zip Extra Field:")
            .append(" Modify:[").append(getModifyFileTime()).append("] ")
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/LabelForm.java`
#### Snippet
```java
        // The byte code operands actually get set later -
        // once we have all the bytecodes - in fixUpByteCodeTarget().
        return;
    }
}
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/ByteCodeForm.java`
#### Snippet
```java
    public void fixUpByteCodeTargets(final ByteCode byteCode, final CodeAttribute codeAttribute) {
        // Most ByteCodeForms don't have any fixing up to do.
        return;
    }

```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
    private static final int CLEARMASK = (~SETMASK);
    private static int med3(final int a, final int b, final int c) {
        return (a < b) ? (b < c ? b : a < c ? c : a) : (b > c ? b : a > c ? c
                                                        : a);
    }
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
    private static final int CLEARMASK = (~SETMASK);
    private static int med3(final int a, final int b, final int c) {
        return (a < b) ? (b < c ? b : a < c ? c : a) : (b > c ? b : a > c ? c
                                                        : a);
    }
    private static void vswap(final int[] fmap, int p1, int p2, int n) {
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveUtil.java`
#### Snippet
```java
     * @return the 4-byte entry as an int
     */
    public static final int convert32(final byte[] buffer, final int offset) {
        return (int) ByteUtils.fromLittleEndian(buffer, offset, 4);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveUtil.java`
#### Snippet
```java
     * @return the 8-byte entry as a long
     */
    public static final long convert64(final byte[] buffer, final int offset) {
        return ByteUtils.fromLittleEndian(buffer, offset, 8);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveUtil.java`
#### Snippet
```java
     * @return Whether the buffer contains a tape segment header.
     */
    public static final boolean verify(final byte[] buffer) {
        // verify magic. for now only accept NFS_MAGIC.
        final int magic = convert32(buffer, 24);
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveUtil.java`
#### Snippet
```java
     * @return the 2-byte entry as an int
     */
    public static final int convert16(final byte[] buffer, final int offset) {
        return (int) ByteUtils.fromLittleEndian(buffer, offset, 2);
    }
```

### FinalStaticMethod
'static' method declared `final`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveUtil.java`
#### Snippet
```java
     * @return the ino associated with this buffer.
     */
    public static final int getIno(final byte[] buffer) {
        return convert32(buffer, 20);
    }
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/commons/compress/harmony/pack200/CPLong.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "" + theLong;
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/commons/compress/harmony/pack200/IntList.java`
#### Snippet
```java
            return array[firstIndex + location];
        }
        throw new IndexOutOfBoundsException("" + location);
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/commons/compress/harmony/pack200/IntList.java`
#### Snippet
```java
    public void increment(final int location) {
        if ((0 > location) || (location >= (lastIndex - firstIndex))) {
            throw new IndexOutOfBoundsException("" + location);
        }
        array[firstIndex + location]++;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
            reader.read(); // '['
            final String str = readUpToMatchingBracket(reader);
            return new Replication("" + uint_type, str);

        // Union
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
            stream.read(); // '['
            final String str = readUpToMatchingBracket(stream);
            return new Replication("" + uintType, str);

        // Union
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
        // Union
        case 'T':
            String intType = "" + (char) stream.read();
            if (intType.equals("S")) {
                intType += (char) stream.read();
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveOutputStream.java`
#### Snippet
```java

        offset = fill(offset, 16, ' ');
        final String m = "" + pEntry.getLastModified();
        if (m.length() > 12) {
            throw new IOException("Last modified too long");
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveOutputStream.java`
#### Snippet
```java

        offset = fill(offset, 28, ' ');
        final String u = "" + pEntry.getUserId();
        if (u.length() > 6) {
            throw new IOException("User id too long");
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveOutputStream.java`
#### Snippet
```java

        offset = fill(offset, 34, ' ');
        final String g = "" + pEntry.getGroupId();
        if (g.length() > 6) {
            throw new IOException("Group id too long");
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveOutputStream.java`
#### Snippet
```java

        offset = fill(offset, 40, ' ');
        final String fm = "" + Integer.toString(pEntry.getMode(), 8);
        if (fm.length() > 8) {
            throw new IOException("Filemode too long");
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`time == null ? true : isUnixTime(toUnixTime(time))` can be simplified to 'time == null \|\| isUnixTime(toUnixTime(time))'
in `src/main/java/org/apache/commons/compress/utils/TimeUtils.java`
#### Snippet
```java
     */
    public static boolean isUnixTime(final FileTime time) {
        return time == null ? true : isUnixTime(toUnixTime(time));
    }

```

## RuleId[id=SillyAssignment]
### SillyAssignment
Variable 'value' is assigned to itself
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
                    break;
                case 4:
                    value = value;
                    break;
                default:
```

## RuleId[id=NegativeIntConstantInLongContext]
### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
    @Deprecated
    public int getUserId() {
        return (int) (userId & 0xffffffff);
    }

```

### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
    @Deprecated
    public int getGroupId() {
        return (int) (groupId & 0xffffffff);
    }

```

### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java`
#### Snippet
```java
            inode = devMin = 0;
        } else if (inode == 0 && devMin == 0) {
            inode = nextArtificalDeviceAndInode & 0xFFFFFFFF;
            devMin = (nextArtificalDeviceAndInode++ >> 32) & 0xFFFFFFFF;
        } else {
```

### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java`
#### Snippet
```java
        } else if (inode == 0 && devMin == 0) {
            inode = nextArtificalDeviceAndInode & 0xFFFFFFFF;
            devMin = (nextArtificalDeviceAndInode++ >> 32) & 0xFFFFFFFF;
        } else {
            nextArtificalDeviceAndInode =
```

### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `src/main/java/org/apache/commons/compress/compressors/lz4/FramedLZ4CompressorInputStream.java`
#### Snippet
```java
        maybeFinishCurrentBlock();
        final long len = ByteUtils.fromLittleEndian(supplier, 4);
        final boolean uncompressed = (len & UNCOMPRESSED_FLAG_MASK) != 0;
        final int realLen = (int) (len & (~UNCOMPRESSED_FLAG_MASK));
        if (realLen == 0) {
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java

    }
    /** See https://asm.ow2.io/javadoc/org/objectweb/asm/Opcodes.html#ASM4 */
    public static int ASM_API = Opcodes.ASM4;
    private SegmentHeader segmentHeader;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/compress/archivers/zip/X0017_StrongEncryptionHeader.java`
#### Snippet
```java
 *           Microsoft.
 *
 *           For more details see https://msdn.microsoft.com/en-us/library/aa920051.aspx
 * </pre>
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java
 * based on code from the jRPM project (jrpm.sourceforge.net)
 *
 * http://www.opengroup.org/onlinepubs/9699919799/basedefs/cpio.h.html has a list of the C_xxx constants.
 */
public interface CpioConstants {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveEntry.java`
#### Snippet
```java
 * threadsafe.</p>
 *
 * <p>Based on code from the jRPM project (http://jrpm.sourceforge.net).</p>
 *
 * <p>The MAGIC numbers and other constants are defined in {@link CpioConstants}</p>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java`
#### Snippet
```java
     * <p>
     * See also :
     * https://issues.apache.org/jira/projects/COMPRESS/issues/COMPRESS-555
     * https://github.com/apache/commons-compress/pull/137#issuecomment-690835644
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java`
#### Snippet
```java
     * See also :
     * https://issues.apache.org/jira/projects/COMPRESS/issues/COMPRESS-555
     * https://github.com/apache/commons-compress/pull/137#issuecomment-690835644
     */
    private final boolean allowStoredEntriesWithDataDescriptor;
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java

    // Don't need to include default attribute names in the constant pool bands
    private final Set<String> defaultAttributeNames = new HashSet<>();

    private final Set<CPUTF8> cp_Utf8 = new TreeSet<>();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
    private ClassBands classBands;
    private BcBands bcBands;
    private FileBands fileBands;
    private final SegmentFieldVisitor fieldVisitor = new SegmentFieldVisitor();
    private final SegmentMethodVisitor methodVisitor = new SegmentMethodVisitor();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
    private boolean stripDebug;

    private Attribute[] nonStandardAttributePrototypes;

    public Segment() {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
    private long[] canonicalLargest;

    private long[] canonicalSmallest;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentHeader.java`
#### Snippet
```java
    private static final int[] magic = {0xCA, 0xFE, 0xD0, 0x0D};

    private int archiveMajor;

    private int archiveMinor;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentHeader.java`
#### Snippet
```java
    private int archiveMajor;

    private int archiveMinor;

    private long archiveModtime;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/harmony/unpack200/AttrDefinitionBands.java`
#### Snippet
```java
public class AttrDefinitionBands extends BandSet {

    private int[] attributeDefinitionHeader;

    private String[] attributeDefinitionLayout;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/harmony/unpack200/AttrDefinitionBands.java`
#### Snippet
```java
    private int[] attributeDefinitionHeader;

    private String[] attributeDefinitionLayout;

    private String[] attributeDefinitionName;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/harmony/unpack200/AttrDefinitionBands.java`
#### Snippet
```java
    private String[] attributeDefinitionLayout;

    private String[] attributeDefinitionName;

    private AttributeLayoutMap attributeDefinitionMap;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
        private final List<UnionCase> unionCases;
        private final List<LayoutElement> defaultCaseBody;
        private int[] caseCounts;
        private int defaultCount;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/harmony/unpack200/BcBands.java`
#### Snippet
```java
    private int[] bcInitRef;
    private int[] bcEscRef;
    private int[] bcEscRefSize;
    private int[] bcEscSize;
    private int[][] bcEscByte;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/harmony/unpack200/BcBands.java`
#### Snippet
```java
    private int[] bcEscRefSize;
    private int[] bcEscSize;
    private int[][] bcEscByte;

    private List<Integer> wideByteCodes;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/harmony/unpack200/BcBands.java`
#### Snippet
```java
    private int[] bcSuperMethod;
    private int[] bcInitRef;
    private int[] bcEscRef;
    private int[] bcEscRefSize;
    private int[] bcEscSize;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/harmony/unpack200/BcBands.java`
#### Snippet
```java
    private int[] bcEscRef;
    private int[] bcEscRefSize;
    private int[] bcEscSize;
    private int[][] bcEscByte;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/archivers/zip/X0017_StrongEncryptionHeader.java`
#### Snippet
```java
    private byte[] ivData;

    private byte[] erdData;
    // encryption key
    private byte[] recipientKeyHash;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/archivers/zip/X0017_StrongEncryptionHeader.java`
#### Snippet
```java
    private byte[] erdData;
    // encryption key
    private byte[] recipientKeyHash;

    private byte[] keyBlob;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/archivers/zip/X0017_StrongEncryptionHeader.java`
#### Snippet
```java
    private byte[] vData;

    private byte[] vCRC32;

    public X0017_StrongEncryptionHeader() {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/archivers/zip/X0017_StrongEncryptionHeader.java`
#### Snippet
```java
    private byte[] recipientKeyHash;

    private byte[] keyBlob;
    // password verification data
    private byte[] vData;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/archivers/zip/X0017_StrongEncryptionHeader.java`
#### Snippet
```java
    private int hashSize;
    // encryption data
    private byte[] ivData;

    private byte[] erdData;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/archivers/zip/X0017_StrongEncryptionHeader.java`
#### Snippet
```java
    private byte[] keyBlob;
    // password verification data
    private byte[] vData;

    private byte[] vCRC32;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/harmony/unpack200/ClassBands.java`
#### Snippet
```java
    private final int classCount;

    private int[] methodAttrCalls;

    private int[][] codeHandlerStartP;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java`
#### Snippet
```java
     * File name of actual source.
     */
    private final String archiveName;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/compressors/lz4/FramedLZ4CompressorInputStream.java`
#### Snippet
```java
    private boolean expectBlockDependency;

    private boolean expectContentSize;
    private boolean expectContentChecksum;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java`
#### Snippet
```java
    private int currentState = START_BLOCK_STATE;
    private int storedBlockCRC, storedCombinedCRC;
    private int computedBlockCRC, computedCombinedCRC;
    private int su_count;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java`
#### Snippet
```java
    private int runLength;

    private int blockCRC;
    private int combinedCRC;

```

## RuleId[id=IfStatementMissingBreakInLoop]
### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `src/main/java/org/apache/commons/compress/harmony/unpack200/Archive.java`
#### Snippet
```java
            boolean compressedWithE0 = false;
            for (int m = 0; m < magic.length; m++) {
                if (word[m] != magic[m]) {
                    compressedWithE0 = true;
                }
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `StringReader.read()` is ignored
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
    private UnionCase readNextUnionCase(final StringReader reader) throws IOException {
        reader.mark(2);
        reader.read(); // '('
        final int next = reader.read();
        char ch = (char) next;
```

### IgnoreResultOfCall
Result of `StringReader.read()` is ignored
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        }
        reader.reset();
        reader.read(); // '('
        final List<Integer> tags = new ArrayList<>();
        Integer nextTag;
```

### IgnoreResultOfCall
Result of `StringReader.read()` is ignored
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
            if (nextTag != null) {
                tags.add(nextTag);
                reader.read(); // ',' or ')'
            }
        } while (nextTag != null);
```

### IgnoreResultOfCall
Result of `StringReader.read()` is ignored
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
            }
        } while (nextTag != null);
        reader.read(); // '['
        reader.mark(1);
        ch = (char) reader.read();
```

### IgnoreResultOfCall
Result of `StringReader.read()` is ignored
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        case 'N':
            final char uint_type = (char) reader.read();
            reader.read(); // '['
            final String str = readUpToMatchingBracket(reader);
            return new Replication("" + uint_type, str);
```

### IgnoreResultOfCall
Result of `StringReader.read()` is ignored
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
                unionCases.add(c);
            }
            reader.read(); // '('
            reader.read(); // ')'
            reader.read(); // '['
```

### IgnoreResultOfCall
Result of `StringReader.read()` is ignored
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
            }
            reader.read(); // '('
            reader.read(); // ')'
            reader.read(); // '['
            List<LayoutElement> body = null;
```

### IgnoreResultOfCall
Result of `StringReader.read()` is ignored
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
            reader.read(); // '('
            reader.read(); // ')'
            reader.read(); // '['
            List<LayoutElement> body = null;
            reader.mark(1);
```

### IgnoreResultOfCall
Result of `StringReader.read()` is ignored
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        case '(':
            final int number = readNumber(reader).intValue();
            reader.read(); // ')'
            return new Call(number);
        // Reference
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `src/main/java/org/apache/commons/compress/harmony/unpack200/Segment.java`
#### Snippet
```java
        if (doPreRead && header.getArchiveSize() != 0) {
            final byte[] data = new byte[size];
            in.read(data);
            internalBuffer = new BufferedInputStream(new ByteArrayInputStream(data));
        } else {
```

### IgnoreResultOfCall
Result of `StringReader.read()` is ignored
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
    private UnionCase readNextUnionCase(final StringReader stream) throws IOException {
        stream.mark(2);
        stream.read(); // '('
        final int next = stream.read();
        char ch = (char) next;
```

### IgnoreResultOfCall
Result of `StringReader.read()` is ignored
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
        }
        stream.reset();
        stream.read(); // '('
        final List<Integer> tags = new ArrayList<>();
        Integer nextTag;
```

### IgnoreResultOfCall
Result of `StringReader.read()` is ignored
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
            if (nextTag != null) {
                tags.add(nextTag);
                stream.read(); // ',' or ')'
            }
        } while (nextTag != null);
```

### IgnoreResultOfCall
Result of `StringReader.read()` is ignored
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
            }
        } while (nextTag != null);
        stream.read(); // '['
        stream.mark(1);
        ch = (char) stream.read();
```

### IgnoreResultOfCall
Result of `StringReader.read()` is ignored
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
        case 'N':
            final char uintType = (char) stream.read();
            stream.read(); // '['
            final String str = readUpToMatchingBracket(stream);
            return new Replication("" + uintType, str);
```

### IgnoreResultOfCall
Result of `StringReader.read()` is ignored
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
                unionCases.add(c);
            }
            stream.read(); // '('
            stream.read(); // ')'
            stream.read(); // '['
```

### IgnoreResultOfCall
Result of `StringReader.read()` is ignored
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
            }
            stream.read(); // '('
            stream.read(); // ')'
            stream.read(); // '['
            List<LayoutElement> body = null;
```

### IgnoreResultOfCall
Result of `StringReader.read()` is ignored
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
            stream.read(); // '('
            stream.read(); // ')'
            stream.read(); // '['
            List<LayoutElement> body = null;
            stream.mark(1);
```

### IgnoreResultOfCall
Result of `StringReader.read()` is ignored
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
        case '(':
            final int number = readNumber(stream).intValue();
            stream.read(); // ')'
            return new Call(number);
        // Reference
```

### IgnoreResultOfCall
Result of `ExecutorService.awaitTermination()` is ignored
in `src/main/java/org/apache/commons/compress/archivers/zip/ParallelScatterZipCreator.java`
#### Snippet
```java
            }

            executorService.awaitTermination(1000 * 60L, TimeUnit.SECONDS);  // == Infinity. We really *must* wait for this to complete

            // It is important that all threads terminate before we go on, ensure happens-before relationship
```

### IgnoreResultOfCall
Result of `ZipArchiveInputStream.skip()` is ignored
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java`
#### Snippet
```java
        } else {
            // this is guaranteed to exhaust the stream
            skip(Long.MAX_VALUE); //NOSONAR

            final long inB = current.entry.getMethod() == ZipArchiveOutputStream.DEFLATED
```

### IgnoreResultOfCall
Result of `XZCompressorInputStream.matches()` is ignored
in `src/main/java/org/apache/commons/compress/compressors/xz/XZUtils.java`
#### Snippet
```java
    private static boolean internalIsXZCompressionAvailable() {
        try {
            XZCompressorInputStream.matches(null, 0);
            return true;
        } catch (final NoClassDefFoundError error) { // NOSONAR
```

### IgnoreResultOfCall
Result of `LZMACompressorInputStream.matches()` is ignored
in `src/main/java/org/apache/commons/compress/compressors/lzma/LZMAUtils.java`
#### Snippet
```java
    private static boolean internalIsLZMACompressionAvailable() {
        try {
            LZMACompressorInputStream.matches(null, 0);
            return true;
        } catch (final NoClassDefFoundError error) { // NOSONAR
```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Illegal format string specifier: flag ' ' not allowed in '% %'
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
    private static int assertFitsIntoNonNegativeInt(final String what, final long value) throws IOException {
        if (value > Integer.MAX_VALUE || value < 0) {
            throw new IOException(String.format("Cannot handle % %,d", what, value));
        }
        return (int) value;
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
1 \<\< s: integer shift implicitly cast to long
in `src/main/java/org/apache/commons/compress/harmony/pack200/BHSDCodec.java`
#### Snippet
```java
            }
        } else {
            result = Math.max(Integer.MIN_VALUE, -cardinality() / (1 << s));
        }
        return result;
```

### IntegerMultiplicationImplicitCastToLong
1 \<\< flagIndex: integer shift implicitly cast to long
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				final int flagIndex = bands.getFlagIndex();
				final Long flags = tempMethodFlags.remove(tempMethodFlags.size() - 1);
				tempMethodFlags.add(Long.valueOf(flags.longValue() | (1 << flagIndex)));
				return;
			}
```

### IntegerMultiplicationImplicitCastToLong
1 \<\< flagIndex: integer shift implicitly cast to long
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				final int flagIndex = bands.getFlagIndex();
				final Long flags = tempFieldFlags.remove(tempFieldFlags.size() - 1);
				tempFieldFlags.add(Long.valueOf(flags.longValue() | (1 << flagIndex)));
				return;
			}
```

### IntegerMultiplicationImplicitCastToLong
1 \<\< flagIndex: integer shift implicitly cast to long
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				bands.addAttribute(attribute);
				final int flagIndex = bands.getFlagIndex();
				class_flags[index] |= (1 << flagIndex);
				return;
			}
```

### IntegerMultiplicationImplicitCastToLong
1 \<\< flagIndex: integer shift implicitly cast to long
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				final int flagIndex = bands.getFlagIndex();
				final Long flags = codeFlags.remove(codeFlags.size() - 1);
				codeFlags.add(Long.valueOf(flags.longValue() | (1 << flagIndex)));
				return;
			}
```

### IntegerMultiplicationImplicitCastToLong
(ldt.getYear() - 1980) \<\< 25: integer shift implicitly cast to long
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipUtil.java`
#### Snippet
```java
            return DOSTIME_BEFORE_1980;
        }
        return ((ldt.getYear() - 1980) << 25
                | ldt.getMonthValue() << 21
                | ldt.getDayOfMonth() << 16
```

### IntegerMultiplicationImplicitCastToLong
mode \<\< SHORT_SHIFT: integer shift implicitly cast to long
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java
    public void setUnixMode(final int mode) {
        // CheckStyle:MagicNumberCheck OFF - no point
        setExternalAttributes((mode << SHORT_SHIFT)
                              // MS-DOS read-only attribute
                              | ((mode & 0200) == 0 ? 1 : 0)
```

### IntegerMultiplicationImplicitCastToLong
(b \& 0x7f) \<\< (index++ \* 7): integer shift implicitly cast to long
in `src/main/java/org/apache/commons/compress/compressors/snappy/SnappyCompressorInputStream.java`
#### Snippet
```java
                throw new IOException("Premature end of stream reading size");
            }
            sz |= (b & 0x7f) << (index++ * 7);
        } while (0 != (b & 0x80));
        return sz;
```

### IntegerMultiplicationImplicitCastToLong
8 \* timesDefined: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
                        throw new IOException("Not implemented");
                    }
                    if (skipBytesFully(header, 8 * timesDefined) < 8 * timesDefined) {
                        throw new IOException("invalid creation dates size");
                    }
```

### IntegerMultiplicationImplicitCastToLong
8 \* timesDefined: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
                        throw new IOException("Not implemented");
                    }
                    if (skipBytesFully(header, 8 * timesDefined) < 8 * timesDefined) {
                        throw new IOException("invalid creation dates size");
                    }
```

### IntegerMultiplicationImplicitCastToLong
8 \* timesDefined: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
                        throw new IOException("Not implemented");
                    }
                    if (skipBytesFully(header, 8 * timesDefined) < 8 * timesDefined) {
                        throw new IOException("invalid access dates size");
                    }
```

### IntegerMultiplicationImplicitCastToLong
8 \* timesDefined: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
                        throw new IOException("Not implemented");
                    }
                    if (skipBytesFully(header, 8 * timesDefined) < 8 * timesDefined) {
                        throw new IOException("invalid access dates size");
                    }
```

### IntegerMultiplicationImplicitCastToLong
8 \* timesDefined: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
                        throw new IOException("Not implemented");
                    }
                    if (skipBytesFully(header, 8 * timesDefined) < 8 * timesDefined) {
                        throw new IOException("invalid modification dates size");
                    }
```

### IntegerMultiplicationImplicitCastToLong
8 \* timesDefined: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
                        throw new IOException("Not implemented");
                    }
                    if (skipBytesFully(header, 8 * timesDefined) < 8 * timesDefined) {
                        throw new IOException("invalid modification dates size");
                    }
```

### IntegerMultiplicationImplicitCastToLong
4 \* attributesDefined: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
                        throw new IOException("Not implemented");
                    }
                    if (skipBytesFully(header, 4 * attributesDefined) < 4 * attributesDefined) {
                        throw new IOException("invalid windows attributes size");
                    }
```

### IntegerMultiplicationImplicitCastToLong
4 \* attributesDefined: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
                        throw new IOException("Not implemented");
                    }
                    if (skipBytesFully(header, 4 * attributesDefined) < 4 * attributesDefined) {
                        throw new IOException("invalid windows attributes size");
                    }
```

### IntegerMultiplicationImplicitCastToLong
4 \* crcsDefined: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
            stats.folderHasCrc = readAllOrBits(header, stats.numberOfFolders);
            final int crcsDefined = stats.folderHasCrc.cardinality();
            if (skipBytesFully(header, 4 * crcsDefined) < 4 * crcsDefined) {
                throw new IOException("invalid number of CRCs in UnpackInfo");
            }
```

### IntegerMultiplicationImplicitCastToLong
4 \* crcsDefined: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
            stats.folderHasCrc = readAllOrBits(header, stats.numberOfFolders);
            final int crcsDefined = stats.folderHasCrc.cardinality();
            if (skipBytesFully(header, 4 * crcsDefined) < 4 * crcsDefined) {
                throw new IOException("invalid number of CRCs in UnpackInfo");
            }
```

### IntegerMultiplicationImplicitCastToLong
8 \* numberOfFolders: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java

        private long streamMapSize() {
            return 8 * numberOfFolders /* folderFirstPackStreamIndex, folderFirstFileIndex */
                + 8 * numberOfPackedStreams /* packStreamOffsets */
                + 4 * numberOfEntries /* fileFolderIndex */
```

### IntegerMultiplicationImplicitCastToLong
8 \* numberOfPackedStreams: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
        private long streamMapSize() {
            return 8 * numberOfFolders /* folderFirstPackStreamIndex, folderFirstFileIndex */
                + 8 * numberOfPackedStreams /* packStreamOffsets */
                + 4 * numberOfEntries /* fileFolderIndex */
                ;
```

### IntegerMultiplicationImplicitCastToLong
4 \* numberOfEntries: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
            return 8 * numberOfFolders /* folderFirstPackStreamIndex, folderFirstFileIndex */
                + 8 * numberOfPackedStreams /* packStreamOffsets */
                + 4 * numberOfEntries /* fileFolderIndex */
                ;
        }
```

### IntegerMultiplicationImplicitCastToLong
4 \* missingCrcs: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
            final int missingCrcs = readAllOrBits(header, numDigests)
                .cardinality();
            if (skipBytesFully(header, 4 * missingCrcs) < 4 * missingCrcs) {
                throw new IOException("invalid number of missing CRCs in SubStreamInfo");
            }
```

### IntegerMultiplicationImplicitCastToLong
4 \* missingCrcs: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
            final int missingCrcs = readAllOrBits(header, numDigests)
                .cardinality();
            if (skipBytesFully(header, 4 * missingCrcs) < 4 * missingCrcs) {
                throw new IOException("invalid number of missing CRCs in SubStreamInfo");
            }
```

### IntegerMultiplicationImplicitCastToLong
4 \* crcsDefined: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
            final int crcsDefined = readAllOrBits(header, stats.numberOfPackedStreams)
                .cardinality();
            if (skipBytesFully(header, 4 * crcsDefined) < 4 * crcsDefined) {
                throw new IOException("invalid number of CRCs in PackInfo");
            }
```

### IntegerMultiplicationImplicitCastToLong
4 \* crcsDefined: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
            final int crcsDefined = readAllOrBits(header, stats.numberOfPackedStreams)
                .cardinality();
            if (skipBytesFully(header, 4 * crcsDefined) < 4 * crcsDefined) {
                throw new IOException("invalid number of CRCs in PackInfo");
            }
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.apache.commons.compress.utils.ExactMath;`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.java`
#### Snippet
```java
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.apache.commons.compress.utils.CountingOutputStream;
import org.apache.commons.compress.utils.ExactMath;
import org.apache.commons.compress.utils.FixedLengthBlockOutputStream;
import org.apache.commons.compress.utils.TimeUtils;
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `defaultAttributeNames` are updated, but never queried
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java

    // Don't need to include default attribute names in the constant pool bands
    private final Set<String> defaultAttributeNames = new HashSet<>();

    private final Set<CPUTF8> cp_Utf8 = new TreeSet<>();
```

### MismatchedCollectionQueryUpdate
Contents of collection `list` are updated, but never queried
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java
            final int len = form.length();
            final StringBuilder signature = new StringBuilder(64);
            final ArrayList<String> list = new ArrayList<>();
            for (int j = 0; j < len; j++) {
                final char c = form.charAt(j);
```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`z >>> s ^ -1L` can be replaced with '\~(z \>\>\> s)'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BHSDCodec.java`
#### Snippet
```java
            final int u = ((1 << s) - 1);
            if ((z & u) == u) {
                z = z >>> s ^ -1L;
            } else {
                z = z - (z >>> s);
```

### PointlessBitwiseExpression
`(1 << 1) ^ 0xFFFFFFFF` can be replaced with '\~(1 \<\< 1)'
in `src/main/java/org/apache/commons/compress/harmony/pack200/FileBands.java`
#### Snippet
```java
                if (options.isPassFile(name)) {
                    fileName[i] = cpBands.getCPUtf8(name);
                    file_options[i] &= (1 << 1) ^ 0xFFFFFFFF;
                }
            }
```

### PointlessBitwiseExpression
`1 << 0` can be replaced with '1'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentOptions.java`
#### Snippet
```java
    private static final int HAVE_METHOD_FLAGS_HI = 1 << 11;

    private static final int HAVE_SPECIAL_FORMATS = 1 << 0;

    /**
```

### PointlessBitwiseExpression
`userId & 0xffffffff` can be replaced with 'userId'
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
    @Deprecated
    public int getUserId() {
        return (int) (userId & 0xffffffff);
    }

```

### PointlessBitwiseExpression
`groupId & 0xffffffff` can be replaced with 'groupId'
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
    @Deprecated
    public int getGroupId() {
        return (int) (groupId & 0xffffffff);
    }

```

### PointlessBitwiseExpression
`1 << 0` can be replaced with '1'
in `src/main/java/org/apache/commons/compress/archivers/zip/GeneralPurposeBit.java`
#### Snippet
```java
     * Indicates that the file is encrypted.
     */
    private static final int ENCRYPTION_FLAG = 1 << 0;

    /**
```

### PointlessBitwiseExpression
`nextArtificalDeviceAndInode & 0xFFFFFFFF` can be replaced with 'nextArtificalDeviceAndInode'
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java`
#### Snippet
```java
            inode = devMin = 0;
        } else if (inode == 0 && devMin == 0) {
            inode = nextArtificalDeviceAndInode & 0xFFFFFFFF;
            devMin = (nextArtificalDeviceAndInode++ >> 32) & 0xFFFFFFFF;
        } else {
```

### PointlessBitwiseExpression
`(nextArtificalDeviceAndInode++ >> 32) & 0xFFFFFFFF` can be replaced with '(nextArtificalDeviceAndInode++ \>\> 32)'
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java`
#### Snippet
```java
        } else if (inode == 0 && devMin == 0) {
            inode = nextArtificalDeviceAndInode & 0xFFFFFFFF;
            devMin = (nextArtificalDeviceAndInode++ >> 32) & 0xFFFFFFFF;
        } else {
            nextArtificalDeviceAndInode =
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/org/apache/commons/compress/harmony/unpack200/IcTuple.java`
#### Snippet
```java
        cachedOuterClassString = "";
        for (int index = 0; index < lastPosition; index++) {
            cachedOuterClassString += nameComponents[index];
            if (isAllDigits(nameComponents[index])) {
                member = false;
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/org/apache/commons/compress/harmony/unpack200/IcTuple.java`
#### Snippet
```java
                // classes with separators of non-$ characters
                // (ie Foo#Bar)
                cachedOuterClassString += '$';
            }
        }
```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `src/main/java/org/apache/commons/compress/archivers/zip/ParallelScatterZipCreator.java`
#### Snippet
```java
     * @param callable The callable to run, created by {@link #createCallable createCallable}, possibly wrapped by caller.
     */
    public final void submit(final Callable<? extends Object> callable) {
        submitStreamAwareCallable(() -> {
            callable.call();
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `overflow` initializer `0L` is redundant
in `src/main/java/org/apache/commons/compress/utils/BitInputStream.java`
#### Snippet
```java
        final long bitsOut;
        final int overflowBits;
        long overflow = 0L;

        // bitsCachedSize >= 57 and left-shifting it 8 bits would cause an overflow
```

### UnusedAssignment
Variable `n` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/utils/IOUtils.java`
#### Snippet
```java
        }
        final byte[] buffer = new byte[(int) Math.min(buffersize, len)];
        int n = 0;
        long count = 0;
        while (count < len && -1 != (n = input.read(buffer, 0, (int) Math.min(len - count, buffer.length)))) {
```

### UnusedAssignment
Variable `n` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/utils/IOUtils.java`
#### Snippet
```java
        }
        final byte[] buffer = new byte[buffersize];
        int n = 0;
        long count = 0;
        while (-1 != (n = input.read(buffer))) {
```

### UnusedAssignment
Variable `x` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/utils/IOUtils.java`
#### Snippet
```java
            throw new IndexOutOfBoundsException();
        }
        int count = 0, x = 0;
        while (count != len) {
            x = input.read(array, offset + count, len - count);
```

### UnusedAssignment
Variable `x` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/BHSDCodec.java`
#### Snippet
```java
        int n = 0;
        long z = 0;
        long x = 0;

        do {
```

### UnusedAssignment
The value changed at `index++` is never used
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java
                        if (index != -1) {
                            // TODO: check range is ok for ks
                            tDefL = index++;
                        }
                    }
```

### UnusedAssignment
Variable `value` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/PopulationCodec.java`
#### Snippet
```java
        int smallest = Integer.MAX_VALUE, absoluteSmallest;
        int last = 0;
        int value = 0, absoluteValue;
        int k = -1;
        while (true) {
```

### UnusedAssignment
Variable `codec` initializer `null` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/PopulationCodec.java`
#### Snippet
```java
                // if k >= 256, b >= 2
                int b = 1;
                BHSDCodec codec = null;
                while (++b < 5) {
                    codec = new BHSDCodec(b, 256 - l, 0);
```

### UnusedAssignment
Variable `encodedBand` initializer `null` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/MetadataBandGroup.java`
#### Snippet
```java
                contextStr = "Method";
            }
            byte[] encodedBand = null;
            if (!type.equals("AD")) {
                if (type.indexOf('P') != -1) {
```

### UnusedAssignment
Variable `nullsAllowed` initializer `false` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        private List<ConstantPoolEntry> band;

        private boolean nullsAllowed = false;

        public Reference(final String tag) {
```

### UnusedAssignment
The value `false` assigned to `aload_0` is never used
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
            bcFieldRef.add(cpField);
        }
        aload_0 = false;
        bcCodes.add(opcode);
    }
```

### UnusedAssignment
Variable `context` initializer `-1` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
    public class SegmentAnnotationVisitor extends AnnotationVisitor {

        private int context = -1;
        private int parameter = -1;
        private String desc;
```

### UnusedAssignment
The value `""` assigned to `name` is never used
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
            caseArrayN.add(indexInCaseArrayN, Integer.valueOf(numCases.intValue() + 1));
            if (name == null) {
                name = "";
            }
            addValueAndTag(value, tags, values);
```

### UnusedAssignment
Variable `realIndex` initializer `-1` is redundant
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentConstantPool.java`
#### Snippet
```java
        final String desiredClassName) throws Pack200Exception {
        final int index = (int) desiredIndex;
        int realIndex = -1;
        String[] array = null;
        switch (cp) {
```

### UnusedAssignment
Variable `array` initializer `null` is redundant
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentConstantPool.java`
#### Snippet
```java
        final int index = (int) desiredIndex;
        int realIndex = -1;
        String[] array = null;
        switch (cp) {
        case CP_FIELD:
```

### UnusedAssignment
Variable `realIndex` initializer `-1` is redundant
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentConstantPool.java`
#### Snippet
```java
    public ConstantPoolEntry getInitMethodPoolEntry(final int cp, final long value, final String desiredClassName)
        throws Pack200Exception {
        int realIndex = -1;
        if (cp != CP_METHOD) {
            // TODO really an error?
```

### UnusedAssignment
Variable `fileName` initializer `null` is redundant
in `src/main/java/org/apache/commons/compress/harmony/unpack200/Segment.java`
#### Snippet
```java
                    }
                }
                String fileName = null;

                if (firstDollar > -1 && (i <= firstDollar)) {
```

### UnusedAssignment
Variable `innerClass` initializer `null` is redundant
in `src/main/java/org/apache/commons/compress/harmony/unpack200/Segment.java`
#### Snippet
```java
            final String simpleClassName = icStored.simpleClassName();

            CPClass innerClass = null;
            CPUTF8 innerName = null;
            CPClass outerClass = null;
```

### UnusedAssignment
Variable `revisedLength` initializer `-1` is redundant
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/LocalVariableTypeTableAttribute.java`
#### Snippet
```java
        for (int index = 0; index < lengths.length; index++) {
            final int startPc = startPcs[index];
            int revisedLength = -1;
            final int encodedLength = lengths[index];

```

### UnusedAssignment
Variable `innerClassAccessFlags` initializer `-1` is redundant
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/InnerClassesAttribute.java`
#### Snippet
```java
        int outerClassInfoIndex = -1;
        int innerNameIndex = -1;
        int innerClassAccessFlags = -1;

        public InnerClassesEntry(final CPClass innerClass, final CPClass outerClass, final CPUTF8 innerName,
```

### UnusedAssignment
Variable `nested` initializer `null` is redundant
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/ClassSpecificReferenceForm.java`
#### Snippet
```java
        throws Pack200Exception {
        final SegmentConstantPool globalPool = operandManager.globalConstantPool();
        ClassFileEntry[] nested = null;
        nested = new ClassFileEntry[] {
            globalPool.getClassSpecificPoolEntry(getPoolID(), offset, context(operandManager))};
```

### UnusedAssignment
Variable `revisedLength` initializer `-1` is redundant
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/LocalVariableTableAttribute.java`
#### Snippet
```java
        for (int index = 0; index < lengths.length; index++) {
            final int startPc = startPcs[index];
            int revisedLength = -1;
            final int encodedLength = lengths[index];

```

### UnusedAssignment
Variable `nested` initializer `null` is redundant
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/NewClassRefForm.java`
#### Snippet
```java
    public void setByteCodeOperands(final ByteCode byteCode, final OperandManager operandManager,
        final int codeLength) {
        ClassFileEntry[] nested = null;
        final int offset = getOffset(operandManager);
        if (offset == 0) {
```

### UnusedAssignment
Variable `nested` initializer `null` is redundant
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/NewInitMethodRefForm.java`
#### Snippet
```java
        throws Pack200Exception {
        final SegmentConstantPool globalPool = operandManager.globalConstantPool();
        ClassFileEntry[] nested = null;
        nested = new ClassFileEntry[] {
            globalPool.getInitMethodPoolEntry(SegmentConstantPool.CP_METHOD, offset, context(operandManager))};
```

### UnusedAssignment
The value `2` assigned to `rewriteIndex` is never used
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/WideForm.java`
#### Snippet
```java
        // Index bytes
        setRewrite2Bytes(local, rewriteIndex, newRewrite);
        rewriteIndex += 2;

        byteCode.setRewrite(newRewrite);
```

### UnusedAssignment
The value `2` assigned to `rewriteIndex` is never used
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/WideForm.java`
#### Snippet
```java
        // constant bytes
        setRewrite2Bytes(constWord, rewriteIndex, newRewrite);
        rewriteIndex += 2; // not strictly necessary, but just in case
        // something comes along later

```

### UnusedAssignment
Variable `nested` initializer `null` is redundant
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/ClassRefForm.java`
#### Snippet
```java
        // its own form.)
        final SegmentConstantPool globalPool = operandManager.globalConstantPool();
        ClassFileEntry[] nested = null;
        // How do I get this class?
        nested = new ClassFileEntry[] {globalPool.getClassPoolEntry(operandManager.getCurrentClass())};
```

### UnusedAssignment
Variable `nested` initializer `null` is redundant
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/ReferenceForm.java`
#### Snippet
```java
        throws Pack200Exception {
        final SegmentConstantPool globalPool = operandManager.globalConstantPool();
        ClassFileEntry[] nested = null;
        nested = new ClassFileEntry[] {globalPool.getConstantPoolEntry(getPoolID(), offset)};
        Objects.requireNonNull(nested[0], "Null nested entries are not allowed");
```

### UnusedAssignment
Variable `nested` initializer `null` is redundant
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/InitMethodReferenceForm.java`
#### Snippet
```java
        throws Pack200Exception {
        final SegmentConstantPool globalPool = operandManager.globalConstantPool();
        ClassFileEntry[] nested = null;
        nested = new ClassFileEntry[] {
            globalPool.getInitMethodPoolEntry(SegmentConstantPool.CP_METHOD, offset, context(operandManager))};
```

### UnusedAssignment
Variable `nested` initializer `null` is redundant
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/StringRefForm.java`
#### Snippet
```java
        throws Pack200Exception {
        final SegmentConstantPool globalPool = operandManager.globalConstantPool();
        ClassFileEntry[] nested = null;
        nested = new ClassFileEntry[] {((CPString) globalPool.getValue(getPoolID(), offset))};
        byteCode.setNested(nested);
```

### UnusedAssignment
Variable `caseValue` initializer `-1` is redundant
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/TableSwitchForm.java`
#### Snippet
```java
        final int caseCount = operandManager.nextCaseCount();
        final int defaultPc = operandManager.nextLabel();
        int caseValue = -1;
        caseValue = operandManager.nextCaseValues();

```

### UnusedAssignment
The value `write(n)` assigned to `offset` is never used
in `src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveOutputStream.java`
#### Snippet
```java

        if (mustAppendName) {
            offset += write(n);
        }

```

### UnusedAssignment
Variable `signatureLength` initializer `-1` is redundant
in `src/main/java/org/apache/commons/compress/archivers/ArchiveStreamFactory.java`
#### Snippet
```java
        final byte[] signature = new byte[SIGNATURE_SIZE];
        in.mark(signature.length);
        int signatureLength = -1;
        try {
            signatureLength = IOUtils.readFully(in, signature);
```

### UnusedAssignment
Variable `first` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/archivers/arj/ArjArchiveInputStream.java`
#### Snippet
```java
        byte[] basicHeaderBytes = null;
        do {
            int first = 0;
            int second = read8(in);
            do {
```

### UnusedAssignment
Variable `totalRead` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java`
#### Snippet
```java
            return 0;
        }
    	int totalRead = 0;

        if (isAtEOF() || isDirectory()) {
```

### UnusedAssignment
Variable `length` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java`
#### Snippet
```java
        // read in the name
        final ByteArrayOutputStream longName = new ByteArrayOutputStream();
        int length = 0;
        while ((length = read(smallBuf)) >= 0) {
            longName.write(smallBuf, 0, length);
```

### UnusedAssignment
The value `WORD` assigned to `offset` is never used
in `src/main/java/org/apache/commons/compress/archivers/zip/Zip64ExtendedInformationExtraField.java`
#### Snippet
```java
        if (remaining >= WORD) {
            diskStart = new ZipLong(buffer, offset);
            offset += WORD; // NOSONAR - assignment as documentation
            remaining -= WORD; // NOSONAR - assignment as documentation
        }
```

### UnusedAssignment
The value `WORD` assigned to `remaining` is never used
in `src/main/java/org/apache/commons/compress/archivers/zip/Zip64ExtendedInformationExtraField.java`
#### Snippet
```java
            diskStart = new ZipLong(buffer, offset);
            offset += WORD; // NOSONAR - assignment as documentation
            remaining -= WORD; // NOSONAR - assignment as documentation
        }
    }
```

### UnusedAssignment
The value `WORD` assigned to `off` is never used
in `src/main/java/org/apache/commons/compress/archivers/zip/Zip64ExtendedInformationExtraField.java`
#### Snippet
```java
        if (diskStart != null) {
            System.arraycopy(diskStart.getBytes(), 0, data, off, WORD);
            off += WORD; // NOSONAR - assignment as documentation
        }
        return data;
```

### UnusedAssignment
The value `WORD` assigned to `offset` is never used
in `src/main/java/org/apache/commons/compress/archivers/zip/Zip64ExtendedInformationExtraField.java`
#### Snippet
```java
            if (hasDiskStart) {
                diskStart = new ZipLong(rawCentralDirectoryData, offset);
                offset += WORD; // NOSONAR - assignment as documentation
            }
        }
```

### UnusedAssignment
The value `fill(0, offset, outbuf, outbuf.length - offset)` assigned to `offset` is never used
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
        }

        offset = fill(0, offset, outbuf, outbuf.length - offset); // NOSONAR - assignment as documentation

        final long chk = TarUtils.computeCheckSum(outbuf);
```

### UnusedAssignment
The value `REALSIZELEN_GNU` assigned to `offset` is never used
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
            offset += ISEXTENDEDLEN_GNU;
            realSize = TarUtils.parseOctal(header, offset, REALSIZELEN_GNU);
            offset += REALSIZELEN_GNU; // NOSONAR - assignment as documentation
            break;
        }
```

### UnusedAssignment
The value `CTIMELEN_XSTAR` assigned to `offset` is never used
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
            offset += ATIMELEN_XSTAR;
            cTime = fileTimeFromOptionalSeconds(parseOctalOrBinary(header, offset, CTIMELEN_XSTAR, lenient));
            offset += CTIMELEN_XSTAR; // NOSONAR - assignment as documentation
            break;
        }
```

### UnusedAssignment
The value `PREFIXLEN` assigned to `offset` is never used
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
                ? TarUtils.parseName(header, offset, PREFIXLEN)
                : TarUtils.parseName(header, offset, PREFIXLEN, encoding);
            offset += PREFIXLEN; // NOSONAR - assignment as documentation
            // SunOS tar -E does not add / to directory names, so fix
            // up to be consistent
```

### UnusedAssignment
The value `4` assigned to `offset` is never used
in `src/main/java/org/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp.java`
#### Snippet
```java
        if (bit2_createTimePresent && offset + 4 <= len) {
            createTime = new ZipLong(data, offset);
            offset += 4; // NOSONAR - assignment as documentation
        } else {
            bit2_createTimePresent = false;
```

### UnusedAssignment
The value `4` assigned to `pos` is never used
in `src/main/java/org/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp.java`
#### Snippet
```java
            data[0] |= CREATE_TIME_BIT;
            System.arraycopy(createTime.getBytes(), 0, data, pos, 4);
            pos += 4; // NOSONAR - assignment as documentation
        }
        return data;
```

### UnusedAssignment
Variable `pos` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioUtil.java`
#### Snippet
```java
            final boolean swapHalfWord) {
        final byte[] ret = new byte[length];
        int pos = 0;
        long tmp_number;

```

### UnusedAssignment
Variable `tmp` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioUtil.java`
#### Snippet
```java

        if (!swapHalfWord) {
            byte tmp = 0;
            for (pos = 0; pos < length; pos++) {
                tmp = ret[pos];
```

### UnusedAssignment
Variable `pos` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioUtil.java`
#### Snippet
```java

        long ret;
        int pos = 0;
        final byte[] tmpNumber = Arrays.copyOf(number, number.length);

```

### UnusedAssignment
Variable `tmp` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioUtil.java`
#### Snippet
```java

        if (!swapHalfWord) {
            byte tmp = 0;
            for (pos = 0; pos < tmpNumber.length; pos++) {
                tmp = tmpNumber[pos];
```

### UnusedAssignment
Variable `c` initializer `null` is redundant
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java
        final List<ZipExtraField> merged = new ArrayList<>();
        for (final ZipExtraField l : localFields) {
            ZipExtraField c = null;
            if (l instanceof UnparseableExtraFieldData) {
                c = findUnparseable(centralFields);
```

### UnusedAssignment
Variable `n` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/archivers/dump/TapeInputStream.java`
#### Snippet
```java
            }

            long n = 0;

            if ((readOffset + (len - bytes)) <= blockSize) {
```

### UnusedAssignment
Variable `n` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/archivers/dump/TapeInputStream.java`
#### Snippet
```java
            }

            int n = 0;

            if ((readOffset + (len - bytes)) <= blockSize) {
```

### UnusedAssignment
Variable `reclen` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java`
#### Snippet
```java
            }

            int reclen = 0;

            for (int i = 0; i < datalen - 8 && i < size - 8;
```

### UnusedAssignment
Variable `dirent` initializer `null` is redundant
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java`
#### Snippet
```java
        // still missing an intermediate value and if so we
        final Stack<String> elements = new Stack<>();
        Dirent dirent = null;

        for (int i = entry.getIno();; i = dirent.getParentIno()) {
```

### UnusedAssignment
Variable `streamCompressor` initializer `null` is redundant
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java`
#### Snippet
```java
        OutputStream outputStream = null;
        SeekableByteChannel channel = null;
        StreamCompressor streamCompressor = null;
        try {
            channel = Files.newByteChannel(file,
```

### UnusedAssignment
The value `SHORT` assigned to `off` is never used
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java`
#### Snippet
```java

        final int extraLen = ZipShort.getValue(lfhBuf, off);
        off += SHORT; // NOSONAR - assignment as documentation

        final byte[] fileName = readRange(fileNameLen);
```

### UnusedAssignment
Variable `closed` initializer `true` is redundant
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java`
#### Snippet
```java
     * Whether the file is closed.
     */
    private volatile boolean closed = true;

    /**
```

### UnusedAssignment
Variable `backReferenceOffset` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/compressors/lz4/BlockLZ4CompressorInputStream.java`
#### Snippet
```java
     */
    private boolean initializeBackReference() throws IOException {
        int backReferenceOffset = 0;
        try {
            backReferenceOffset = (int) ByteUtils.fromLittleEndian(supplier, 2);
```

### UnusedAssignment
Variable `n` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZOutputFile.java`
#### Snippet
```java
    public void write(final InputStream inputStream) throws IOException {
        final byte[] buffer = new byte[8024];
        int n = 0;
        while (-1 != (n = inputStream.read(buffer))) {
            write(buffer, 0, n);
```

### UnusedAssignment
Variable `format` initializer `null` is redundant
in `src/main/java/org/apache/commons/compress/archivers/examples/Expander.java`
#### Snippet
```java
     */
    public void expand(final Path archive, final Path targetDirectory) throws IOException, ArchiveException {
        String format = null;
        try (InputStream inputStream = new BufferedInputStream(Files.newInputStream(archive))) {
            format = ArchiveStreamFactory.detect(inputStream);
```

### UnusedAssignment
Variable `signatureLength` initializer `-1` is redundant
in `src/main/java/org/apache/commons/compress/compressors/CompressorStreamFactory.java`
#### Snippet
```java
        final byte[] signature = new byte[12];
        inputStream.mark(signature.length);
        int signatureLength = -1;
        try {
            signatureLength = IOUtils.readFully(inputStream, signature);
```

### UnusedAssignment
Variable `b` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/compressors/gzip/GzipCompressorInputStream.java`
#### Snippet
```java
    private static byte[] readToNull(final DataInput inData) throws IOException {
        try (final ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            int b = 0;
            while ((b = inData.readUnsignedByte()) != 0x00) { // NOPMD NOSONAR
                bos.write(b);
```

### UnusedAssignment
Variable `b` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/compressors/snappy/SnappyCompressorInputStream.java`
#### Snippet
```java
        int index = 0;
        long sz = 0;
        int b = 0;

        do {
```

### UnusedAssignment
Variable `length` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/compressors/snappy/SnappyCompressorInputStream.java`
#### Snippet
```java
            throw new IOException("Premature end of stream reading block start");
        }
        int length = 0;
        int offset = 0;

```

### UnusedAssignment
Variable `offset` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/compressors/snappy/SnappyCompressorInputStream.java`
#### Snippet
```java
        }
        int length = 0;
        int offset = 0;

        switch (b & TAG_MASK) {
```

### UnusedAssignment
Variable `more` initializer `false` is redundant
in `src/main/java/org/apache/commons/compress/compressors/snappy/SnappyCompressorOutputStream.java`
#### Snippet
```java

    private void writeUncompressedSize(long uncompressedSize) throws IOException {
        boolean more = false;
        do {
            int currentByte = (int) (uncompressedSize & 0x7F);
```

### UnusedAssignment
The value `getUnsignedByte(header)` assigned to `nid` is never used
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
        if (nid == NID.kFilesInfo) {
            readFilesInfo(header, archive);
            nid = getUnsignedByte(header);
        }
    }
```

### UnusedAssignment
The value `getUnsignedByte(header)` assigned to `nid` is never used
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
        if (nid == NID.kSubStreamsInfo) {
            readSubStreamsInfo(header, archive);
            nid = getUnsignedByte(header);
        }
    }
```

### UnusedAssignment
Variable `nid` initializer `getUnsignedByte(header)` is redundant
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java

    private void readUnpackInfo(final ByteBuffer header, final Archive archive) throws IOException {
        int nid = getUnsignedByte(header);
        final int numFoldersInt = (int) readUint64(header);
        final Folder[] folders = new Folder[numFoldersInt];
```

### UnusedAssignment
The value `getUnsignedByte(header)` assigned to `nid` is never used
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
        }

        nid = getUnsignedByte(header);
        for (final Folder folder : folders) {
            assertFitsIntoNonNegativeInt("totalOutputStreams", folder.totalOutputStreams);
```

### UnusedAssignment
The value `getUnsignedByte(header)` assigned to `nid` is never used
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
            }

            nid = getUnsignedByte(header);
        }
    }
```

### UnusedAssignment
The value `getUnsignedByte(header)` assigned to `nid` is never used
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
            }

            nid = getUnsignedByte(header);
        }

```

### UnusedAssignment
The value `getUnsignedByte(header)` assigned to `nid` is never used
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
            }

            nid = getUnsignedByte(header);
        }
    }
```

### UnusedAssignment
The value `8` assigned to `localCrc` is never used
in `src/main/java/org/apache/commons/compress/compressors/snappy/PureJavaCrc32C.java`
#### Snippet
```java
      final int c1 =(b[off+1] ^ (localCrc >>>= 8)) & 0xff; //NOSONAR
      final int c2 =(b[off+2] ^ (localCrc >>>= 8)) & 0xff; //NOSONAR
      final int c3 =(b[off+3] ^ (localCrc >>>= 8)) & 0xff; //NOSONAR
      localCrc = (T[T8_7_START + c0] ^ T[T8_6_START + c1])
          ^ (T[T8_5_START + c2] ^ T[T8_4_START + c3]);
```

### UnusedAssignment
The value changed at `off++` is never used
in `src/main/java/org/apache/commons/compress/compressors/snappy/PureJavaCrc32C.java`
#### Snippet
```java
      case 3: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 2: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 1: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      default:
        /* nothing */
```

### UnusedAssignment
Variable `yy` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java`
#### Snippet
```java
                nHeap--;

                int yy = 0;
                int zz = 1;
                int tmp = heap[1];
```

### UnusedAssignment
The value `0` assigned to `yy` is never used
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java`
#### Snippet
```java
                nHeap--;

                yy = 0;
                zz = 1;
                tmp = heap[1];
```

### UnusedAssignment
The value `0` assigned to `tmp` is never used
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java`
#### Snippet
```java
                heap[nHeap] = nNodes;

                tmp = 0;
                zz = nHeap;
                tmp = heap[zz];
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `loader != null` is always `false`
in `src/main/java/org/apache/commons/compress/harmony/archive/internal/nls/Messages.java`
#### Snippet
```java
            final ClassLoader loader = null;// VM.bootCallerClassLoader();
            return (ResourceBundle) AccessController.doPrivileged((PrivilegedAction<Object>) () -> ResourceBundle
                .getBundle(resource, locale, loader != null ? loader : ClassLoader.getSystemClassLoader()));
        } catch (final MissingResourceException e) {
            // ignore
```

### ConstantValue
Condition `canonicalCodec.length != 116` is always `false`
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java
        // Sanity check to make sure that no-one has changed
        // the canonical codecs, which would really cause havoc
        if (canonicalCodec.length != 116) {
            throw new Error("Canonical encodings have been incorrectly modified");
        }
```

### ConstantValue
Condition `value >= 117` is always `true`
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java
            return new BHSDCodec(b, h, s, d);
        }
        if (value >= 117 && value <= 140) { // Run codec
            final int offset = value - 117;
            final int kx = offset & 3;
```

### ConstantValue
Condition `value < 141` is always `false`
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java
            return new RunCodec(k, aCodec, bCodec);
        }
        if ((value < 141) || (value > 188)) {
            throw new Pack200Exception("Invalid codec encoding byte (" + value + ") found");
        }
```

### ConstantValue
Condition `fileSize < 0` is always `false`
in `src/main/java/org/apache/commons/compress/harmony/pack200/Archive.java`
#### Snippet
```java
        }
        long fileSize = packingFile.contents.length;
        if (fileSize < 0) {
            fileSize = 0;
        }
```

### ConstantValue
Condition `value instanceof Type` is always `false`
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
                constant = new CPString(getCPUtf8((String) value));
                cp_String.add((CPString) constant);
            } else if (value instanceof Type) {
                String className = ((Type) value).getClassName();
                if (className.endsWith("[]")) {
```

### ConstantValue
Condition `label instanceof Label` is always `false`
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
                    break;
                }
                if (label instanceof Label) {
                    band.remove(i);
                    final Integer bytecodeIndex = labelsToOffsets.get(label);
```

### ConstantValue
Condition `label instanceof Label` is always `false`
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
                        break;
                    }
                    if (label instanceof Label) {
                        band.remove(i);
                        final Integer bytecodeIndex = labelsToOffsets.get(label);
```

### ConstantValue
Condition `label instanceof Label` is always `false`
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
                    break;
                }
                if (label instanceof Label) {
                    bcLabel.remove(i);
                    final Integer offset = labelsToOffsets.get(label);
```

### ConstantValue
Condition `value instanceof Type` is always `false`
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
            tags.add("s");
            values.add(value);
        } else if (value instanceof Type) {
            tags.add("c");
            values.add(((Type) value).toString());
```

### ConstantValue
Condition `label instanceof Label` is always `false`
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				break;
			}
			if (label instanceof Label) {
				list.remove(i);
				final Integer bytecodeIndex = labelsToOffsets.get(label);
```

### ConstantValue
Value `label` is always 'null'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				break;
			}
			if (label instanceof Label) {
				list.remove(i);
				final Integer bytecodeIndex = labelsToOffsets.get(label);
```

### ConstantValue
Condition `label instanceof Label` is always `false`
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				break;
			}
			if (label instanceof Label) {
				list.remove(i);
				final Integer bytecodeIndex = labelsToOffsets.get(label);
```

### ConstantValue
Value `label` is always 'null'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				break;
			}
			if (label instanceof Label) {
				list.remove(i);
				final Integer bytecodeIndex = labelsToOffsets.get(label);
```

### ConstantValue
Condition `label instanceof Label` is always `false`
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				break;
			}
			if (label instanceof Label) {
				list.remove(i);
				final Integer bytecodeIndex = labelsToOffsets.get(label);
```

### ConstantValue
Value `manifestAttributes` is always 'null'
in `src/main/java/org/apache/commons/compress/archivers/jar/JarArchiveEntry.java`
#### Snippet
```java
    @Deprecated
    public Attributes getManifestAttributes() {
        return manifestAttributes;
    }

```

### ConstantValue
Condition `certificates != null` is always `false`
in `src/main/java/org/apache/commons/compress/archivers/jar/JarArchiveEntry.java`
#### Snippet
```java
    @Deprecated
    public Certificate[] getCertificates() {
        if (certificates != null) { // never true currently // NOSONAR
            return Arrays.copyOf(certificates, certificates.length);
        }
```

### ConstantValue
Condition `header < 0` is always `false`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/ClassBands.java`
#### Snippet
```java
        for (int i = 0; i < codeCount; i++) {
            final int header = 0xff & codeHeaders[i];
            if (header < 0) {
                throw new IllegalStateException("Shouldn't get here");
            }
```

### ConstantValue
Condition `header <= 255` is always `true`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/ClassBands.java`
#### Snippet
```java
                codeMaxNALocals[i] = (header - 145) / 8;
                codeHandlerCount[i] = 1;
            } else if (header <= 255) {
                codeMaxStack[i] = (header - 209) % 7;
                codeMaxNALocals[i] = (header - 209) / 7;
```

### ConstantValue
Condition `l >= Integer.MIN_VALUE` is always `true` when reached
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipUtil.java`
#### Snippet
```java
            throw new IllegalArgumentException("Negative longs < -2^31 not permitted: [" + l + "]");
        }
        if (l < 0 && l >= Integer.MIN_VALUE) {
            // If someone passes in a -2, they probably mean 4294967294
            // (For example, Unix UID/GID's are 32 bit unsigned.)
```

### ConstantValue
Condition `raw.skip((long) DumpArchiveConstants.TP_SIZE * active.getHeaderCount()) == -1` is always `false`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java`
#### Snippet
```java

        // we don't do anything with this yet.
        if (raw.skip((long) DumpArchiveConstants.TP_SIZE * active.getHeaderCount())
            == -1) {
            throw new EOFException();
        }
```

### ConstantValue
Condition `!active.isSparseRecord(readIdx++) && raw.skip(DumpArchiveConstants.TP_SIZE) == -...` is always `false`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java`
#### Snippet
```java
            // the unnecessary decompression time adds up.
            while (readIdx < active.getHeaderCount()) {
                if (!active.isSparseRecord(readIdx++)
                    && raw.skip(DumpArchiveConstants.TP_SIZE) == -1) {
                    throw new EOFException();
                }
```

### ConstantValue
Condition `raw.skip(DumpArchiveConstants.TP_SIZE) == -1` is always `false` when reached
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java`
#### Snippet
```java
            while (readIdx < active.getHeaderCount()) {
                if (!active.isSparseRecord(readIdx++)
                    && raw.skip(DumpArchiveConstants.TP_SIZE) == -1) {
                    throw new EOFException();
                }
```

### ConstantValue
Condition `raw.skip((long) DumpArchiveConstants.TP_SIZE * (active.getHeaderCount()...` is always `false`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java`
#### Snippet
```java
            // skip any remaining segments for prior file.
            while (DumpArchiveConstants.SEGMENT_TYPE.ADDR == active.getHeaderType()) {
                if (raw.skip((long) DumpArchiveConstants.TP_SIZE
                             * (active.getHeaderCount()
                                - active.getHeaderHoles())) == -1) {
                    throw new EOFException();
                }
```

### ConstantValue
Condition `raw.skip((long) DumpArchiveConstants.TP_SIZE * active.getHeaderCount()) == -1` is always `false`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java`
#### Snippet
```java

        // we don't do anything with this yet.
        if (raw.skip((long) DumpArchiveConstants.TP_SIZE * active.getHeaderCount())
            == -1) {
            throw new EOFException();
        }
```

### ConstantValue
Value `channel` is always 'null'
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java`
#### Snippet
```java
            streamCompressor = StreamCompressor.create(channel, def); //NOSONAR
        } catch (final IOException e) { // NOSONAR
            IOUtils.closeQuietly(channel);
            channel = null;
            outputStream = Files.newOutputStream(file, options);
```

### ConstantValue
Condition `(summary == null && rhs.summary != null) // NOSONAR || (summary != null && !summary....` is always `false`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java

        // summary is always null right now, but this may change some day
        if ((summary == null && rhs.summary != null) // NOSONAR
                || (summary != null && !summary.equals(rhs.summary))) { // NOSONAR
            return false;
        }
```

### ConstantValue
Condition `summary == null && rhs.summary != null` is always `false`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java

        // summary is always null right now, but this may change some day
        if ((summary == null && rhs.summary != null) // NOSONAR
                || (summary != null && !summary.equals(rhs.summary))) { // NOSONAR
            return false;
```

### ConstantValue
Condition `summary == null` is always `true`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java

        // summary is always null right now, but this may change some day
        if ((summary == null && rhs.summary != null) // NOSONAR
                || (summary != null && !summary.equals(rhs.summary))) { // NOSONAR
            return false;
```

### ConstantValue
Condition `rhs.summary != null` is always `false` when reached
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java

        // summary is always null right now, but this may change some day
        if ((summary == null && rhs.summary != null) // NOSONAR
                || (summary != null && !summary.equals(rhs.summary))) { // NOSONAR
            return false;
```

### ConstantValue
Condition `summary != null` is always `false` when reached
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
        // summary is always null right now, but this may change some day
        if ((summary == null && rhs.summary != null) // NOSONAR
                || (summary != null && !summary.equals(rhs.summary))) { // NOSONAR
            return false;
        }
```

### ConstantValue
Condition `summary != null && !summary.equals(rhs.summary)` is always `false` when reached
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
        // summary is always null right now, but this may change some day
        if ((summary == null && rhs.summary != null) // NOSONAR
                || (summary != null && !summary.equals(rhs.summary))) { // NOSONAR
            return false;
        }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        public void pack(final OutputStream outputStream) throws IOException, Pack200Exception {
            PackingUtils.log("Writing new attribute bands...");
            final byte[] encodedBand = encodeBandInt(tag, integerListToArray(band), defaultCodec);
            outputStream.write(encodedBand);
            PackingUtils.log("Wrote " + encodedBand.length + " bytes from " + tag + "[" + band.size() + "]");
```

### UNCHECKED_WARNING
Unchecked call to 'add(int, E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
                    final Integer renumberedOffset = Integer
                        .valueOf(bciRenumbering.get(bytecodeIndex.intValue()) - ((Integer) relative.get(i)).intValue());
                    band.add(i, renumberedOffset);
                }
            }
```

### UNCHECKED_WARNING
Unchecked call to 'add(int, E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
                        band.remove(i);
                        final Integer bytecodeIndex = labelsToOffsets.get(label);
                        band.add(i, Integer.valueOf(bciRenumbering.get(bytecodeIndex.intValue())));
                    }
                }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        public UnionCase(final List<Integer> tags) {
            this.tags = tags;
            this.body = Collections.EMPTY_LIST;
        }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
                val = Integer.valueOf(value);
            }
            band.add(val);
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/AttributeLayoutMap.java`
#### Snippet
```java

    private Map<Integer, AttributeLayout> getLayout(final int context) {
		return layouts[context];
	}

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/AttributeLayoutMap.java`
#### Snippet
```java
     */
    public void checkMap() throws Pack200Exception {
        for (final Map<Integer, AttributeLayout> map : layouts) {
            Collection<AttributeLayout> c = map.values();
            if (!(c instanceof List)) {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
    public void visitLookupSwitchInsn(final Label dflt, final int[] keys, final Label[] labels) {
        bcCodes.add(LOOKUPSWITCH);
        bcLabel.add(dflt);
        bcLabelRelativeOffsets.add(byteCodeOffset);
        bcCaseCount.add(keys.length);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
        for (int i = 0; i < labels.length; i++) {
            bcCaseValue.add(keys[i]);
            bcLabel.add(labels[i]);
            bcLabelRelativeOffsets.add(byteCodeOffset);
        }
```

### UNCHECKED_WARNING
Unchecked call to 'add(int, E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
                    final Integer offset = labelsToOffsets.get(label);
                    final int relativeOffset = bcLabelRelativeOffsets.get(i);
                    bcLabel.add(i,
                        Integer.valueOf(bciRenumbering.get(offset.intValue()) - bciRenumbering.get(relativeOffset)));
                }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
        if (owner.equals(currentClass)) {
            opcode += 24; // change to getstatic_this, putstatic_this etc.
            bcThisField.add(cpField);
//        } else if (owner.equals(superClass)) {
//            opcode += 38; // change to getstatic_super etc.
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
    public void visitJumpInsn(final int opcode, final Label label) {
        bcCodes.add(opcode);
        bcLabel.add(label);
        bcLabelRelativeOffsets.add(byteCodeOffset);
        byteCodeOffset += 3;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
                if (name.equals("<init>") && opcode == 207) {
                    opcode = 230; // invokespecial_this_init
                    bcInitRef.add(cpBands.getCPMethod(owner, name, desc));
                } else {
                    bcThisMethod.add(cpBands.getCPMethod(owner, name, desc));
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
                    bcInitRef.add(cpBands.getCPMethod(owner, name, desc));
                } else {
                    bcThisMethod.add(cpBands.getCPMethod(owner, name, desc));
                }
            } else if (owner.equals(superClass)) { // TODO
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
                if (name.equals("<init>") && opcode == 221) {
                    opcode = 231; // invokespecial_super_init
                    bcInitRef.add(cpBands.getCPMethod(owner, name, desc));
                } else {
                    bcSuperMethod.add(cpBands.getCPMethod(owner, name, desc));
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
                    bcInitRef.add(cpBands.getCPMethod(owner, name, desc));
                } else {
                    bcSuperMethod.add(cpBands.getCPMethod(owner, name, desc));
                }
            } else {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
                if (name.equals("<init>") && opcode == 183 && owner.equals(currentNewClass)) {
                    opcode = 232; // invokespecial_new_init
                    bcInitRef.add(cpBands.getCPMethod(owner, name, desc));
                } else {
                    bcMethodRef.add(cpBands.getCPMethod(owner, name, desc));
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
    public void visitTableSwitchInsn(final int min, final int max, final Label dflt, final Label... labels) {
        bcCodes.add(TABLESWITCH);
        bcLabel.add(dflt);
        bcLabelRelativeOffsets.add(byteCodeOffset);
        bcCaseValue.add(min);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
        bcCaseCount.add(count);
        for (int i = 0; i < count; i++) {
            bcLabel.add(labels[i]);
            bcLabelRelativeOffsets.add(byteCodeOffset);
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
     */
    public void finaliseBands() {
        bcThisField = getIndexInClass(bcThisField);
        bcThisMethod = getIndexInClass(bcThisMethod);
        bcSuperMethod = getIndexInClass(bcSuperMethod);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
    public void finaliseBands() {
        bcThisField = getIndexInClass(bcThisField);
        bcThisMethod = getIndexInClass(bcThisMethod);
        bcSuperMethod = getIndexInClass(bcSuperMethod);
        bcInitRef = getIndexInClassForConstructor(bcInitRef);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
        bcThisField = getIndexInClass(bcThisField);
        bcThisMethod = getIndexInClass(bcThisMethod);
        bcSuperMethod = getIndexInClass(bcSuperMethod);
        bcInitRef = getIndexInClassForConstructor(bcInitRef);
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
        bcThisMethod = getIndexInClass(bcThisMethod);
        bcSuperMethod = getIndexInClass(bcSuperMethod);
        bcInitRef = getIndexInClassForConstructor(bcInitRef);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from bcLocal[" + bcLocal.size() + "]");

        encodedBand = encodeBandInt("bcLabel", integerListToArray(bcLabel), Codec.BRANCH5);
        out.write(encodedBand);
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from bcLabel[" + bcLabel.size() + "]");
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from bcIMethodRef[" + bcIMethodRef.size() + "]");

        encodedBand = encodeBandInt("bcThisField", integerListToArray(bcThisField), Codec.UNSIGNED5);
        out.write(encodedBand);
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from bcThisField[" + bcThisField.size() + "]");
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from bcThisField[" + bcThisField.size() + "]");

        encodedBand = encodeBandInt("bcSuperField", integerListToArray(bcSuperField), Codec.UNSIGNED5);
        out.write(encodedBand);
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from bcSuperField[" + bcSuperField.size() + "]");
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from bcSuperField[" + bcSuperField.size() + "]");

        encodedBand = encodeBandInt("bcThisMethod", integerListToArray(bcThisMethod), Codec.UNSIGNED5);
        out.write(encodedBand);
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from bcThisMethod[" + bcThisMethod.size() + "]");
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from bcThisMethod[" + bcThisMethod.size() + "]");

        encodedBand = encodeBandInt("bcSuperMethod", integerListToArray(bcSuperMethod), Codec.UNSIGNED5);
        out.write(encodedBand);
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from bcSuperMethod[" + bcSuperMethod.size() + "]");
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from bcSuperMethod[" + bcSuperMethod.size() + "]");

        encodedBand = encodeBandInt("bcInitRef", integerListToArray(bcInitRef), Codec.UNSIGNED5);
        out.write(encodedBand);
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from bcInitRef[" + bcInitRef.size() + "]");
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java

        public List<LayoutElement> getBody() {
            return body == null ? Collections.EMPTY_LIST : body;
        }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				codeLocalVariableTypeTableN.increment(codeLocalVariableTypeTableN.size() - 1);
			}
			codeLocalVariableTypeTableBciP.add(start);
			codeLocalVariableTypeTableSpanO.add(end);
			codeLocalVariableTypeTableNameRU.add(cpBands.getCPUtf8(name));
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
			}
			codeLocalVariableTypeTableBciP.add(start);
			codeLocalVariableTypeTableSpanO.add(end);
			codeLocalVariableTypeTableNameRU.add(cpBands.getCPUtf8(name));
			codeLocalVariableTypeTableTypeRS.add(cpBands.getCPSignature(signature));
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		// LocalVariableTable attribute
		codeLocalVariableTableN.increment(codeLocalVariableTableN.size() - 1);
		codeLocalVariableTableBciP.add(start);
		codeLocalVariableTableSpanO.add(end);
		codeLocalVariableTableNameRU.add(cpBands.getCPUtf8(name));
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		codeLocalVariableTableN.increment(codeLocalVariableTableN.size() - 1);
		codeLocalVariableTableBciP.add(start);
		codeLocalVariableTableSpanO.add(end);
		codeLocalVariableTableNameRU.add(cpBands.getCPUtf8(name));
		codeLocalVariableTableTypeRS.add(cpBands.getCPSignature(desc));
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		final int handlers = codeHandlerCount.remove(codeHandlerCount.size() - 1);
		codeHandlerCount.add(handlers + 1);
		codeHandlerStartP.add(start);
		codeHandlerEndPO.add(end);
		codeHandlerCatchPO.add(handler);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		codeHandlerCount.add(handlers + 1);
		codeHandlerStartP.add(start);
		codeHandlerEndPO.add(end);
		codeHandlerCatchPO.add(handler);
		codeHandlerClass.add(type == null ? null : cpBands.getCPClass(type));
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		codeHandlerStartP.add(start);
		codeHandlerEndPO.add(end);
		codeHandlerCatchPO.add(handler);
		codeHandlerClass.add(type == null ? null : cpBands.getCPClass(type));
	}
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		}
		codeLineNumberTableLine.add(line);
		codeLineNumberTableBciP.add(start);
	}

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				+ codeLineNumberTableN.size() + "]");

		encodedBand = encodeBandInt("code_LineNumberTable_bci_P", integerListToArray(codeLineNumberTableBciP),
				Codec.BCI5);
		out.write(encodedBand);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				+ codeLocalVariableTableN.size() + "]");

		encodedBand = encodeBandInt("code_LocalVariableTable_bci_P", integerListToArray(codeLocalVariableTableBciP),
				Codec.BCI5);
		out.write(encodedBand);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				+ codeLocalVariableTableBciP.size() + "]");

		encodedBand = encodeBandInt("code_LocalVariableTable_span_O", integerListToArray(codeLocalVariableTableSpanO),
				Codec.BRANCH5);
		out.write(encodedBand);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java

		encodedBand = encodeBandInt("code_LocalVariableTypeTable_bci_P",
				integerListToArray(codeLocalVariableTypeTableBciP), Codec.BCI5);
		out.write(encodedBand);
		PackingUtils.log("Wrote " + encodedBand.length + " bytes from code_LocalVariableTypeTable_bci_P["
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java

		encodedBand = encodeBandInt("code_LocalVariableTypeTable_span_O",
				integerListToArray(codeLocalVariableTypeTableSpanO), Codec.BRANCH5);
		out.write(encodedBand);
		PackingUtils.log("Wrote " + encodedBand.length + " bytes from code_LocalVariableTypeTable_span_O["
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				.log("Wrote " + encodedBand.length + " bytes from codeHandlerCount[" + codeHandlerCount.size() + "]");

		encodedBand = encodeBandInt("codeHandlerStartP", integerListToArray(codeHandlerStartP), Codec.BCI5);
		out.write(encodedBand);
		PackingUtils
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				.log("Wrote " + encodedBand.length + " bytes from codeHandlerStartP[" + codeHandlerStartP.size() + "]");

		encodedBand = encodeBandInt("codeHandlerEndPO", integerListToArray(codeHandlerEndPO), Codec.BRANCH5);
		out.write(encodedBand);
		PackingUtils
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				.log("Wrote " + encodedBand.length + " bytes from codeHandlerEndPO[" + codeHandlerEndPO.size() + "]");

		encodedBand = encodeBandInt("codeHandlerCatchPO", integerListToArray(codeHandlerCatchPO), Codec.BRANCH5);
		out.write(encodedBand);
		PackingUtils.log(
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java

	public void doBciRenumbering(final IntList bciRenumbering, final Map<Label, Integer> labelsToOffsets) {
		renumberBci(codeLineNumberTableBciP, bciRenumbering, labelsToOffsets);
		renumberBci(codeLocalVariableTableBciP, bciRenumbering, labelsToOffsets);
		renumberOffsetBci(codeLocalVariableTableBciP, codeLocalVariableTableSpanO, bciRenumbering, labelsToOffsets);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
	public void doBciRenumbering(final IntList bciRenumbering, final Map<Label, Integer> labelsToOffsets) {
		renumberBci(codeLineNumberTableBciP, bciRenumbering, labelsToOffsets);
		renumberBci(codeLocalVariableTableBciP, bciRenumbering, labelsToOffsets);
		renumberOffsetBci(codeLocalVariableTableBciP, codeLocalVariableTableSpanO, bciRenumbering, labelsToOffsets);
		renumberBci(codeLocalVariableTypeTableBciP, bciRenumbering, labelsToOffsets);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		renumberBci(codeLineNumberTableBciP, bciRenumbering, labelsToOffsets);
		renumberBci(codeLocalVariableTableBciP, bciRenumbering, labelsToOffsets);
		renumberOffsetBci(codeLocalVariableTableBciP, codeLocalVariableTableSpanO, bciRenumbering, labelsToOffsets);
		renumberBci(codeLocalVariableTypeTableBciP, bciRenumbering, labelsToOffsets);
		renumberOffsetBci(codeLocalVariableTypeTableBciP, codeLocalVariableTypeTableSpanO, bciRenumbering,
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		renumberBci(codeLineNumberTableBciP, bciRenumbering, labelsToOffsets);
		renumberBci(codeLocalVariableTableBciP, bciRenumbering, labelsToOffsets);
		renumberOffsetBci(codeLocalVariableTableBciP, codeLocalVariableTableSpanO, bciRenumbering, labelsToOffsets);
		renumberBci(codeLocalVariableTypeTableBciP, bciRenumbering, labelsToOffsets);
		renumberOffsetBci(codeLocalVariableTypeTableBciP, codeLocalVariableTypeTableSpanO, bciRenumbering,
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		renumberBci(codeLocalVariableTableBciP, bciRenumbering, labelsToOffsets);
		renumberOffsetBci(codeLocalVariableTableBciP, codeLocalVariableTableSpanO, bciRenumbering, labelsToOffsets);
		renumberBci(codeLocalVariableTypeTableBciP, bciRenumbering, labelsToOffsets);
		renumberOffsetBci(codeLocalVariableTypeTableBciP, codeLocalVariableTypeTableSpanO, bciRenumbering,
				labelsToOffsets);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		renumberOffsetBci(codeLocalVariableTableBciP, codeLocalVariableTableSpanO, bciRenumbering, labelsToOffsets);
		renumberBci(codeLocalVariableTypeTableBciP, bciRenumbering, labelsToOffsets);
		renumberOffsetBci(codeLocalVariableTypeTableBciP, codeLocalVariableTypeTableSpanO, bciRenumbering,
				labelsToOffsets);
		renumberBci(codeHandlerStartP, bciRenumbering, labelsToOffsets);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		renumberOffsetBci(codeLocalVariableTableBciP, codeLocalVariableTableSpanO, bciRenumbering, labelsToOffsets);
		renumberBci(codeLocalVariableTypeTableBciP, bciRenumbering, labelsToOffsets);
		renumberOffsetBci(codeLocalVariableTypeTableBciP, codeLocalVariableTypeTableSpanO, bciRenumbering,
				labelsToOffsets);
		renumberBci(codeHandlerStartP, bciRenumbering, labelsToOffsets);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		renumberOffsetBci(codeLocalVariableTypeTableBciP, codeLocalVariableTypeTableSpanO, bciRenumbering,
				labelsToOffsets);
		renumberBci(codeHandlerStartP, bciRenumbering, labelsToOffsets);
		renumberOffsetBci(codeHandlerStartP, codeHandlerEndPO, bciRenumbering, labelsToOffsets);
		renumberDoubleOffsetBci(codeHandlerStartP, codeHandlerEndPO, codeHandlerCatchPO, bciRenumbering,
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				labelsToOffsets);
		renumberBci(codeHandlerStartP, bciRenumbering, labelsToOffsets);
		renumberOffsetBci(codeHandlerStartP, codeHandlerEndPO, bciRenumbering, labelsToOffsets);
		renumberDoubleOffsetBci(codeHandlerStartP, codeHandlerEndPO, codeHandlerCatchPO, bciRenumbering,
				labelsToOffsets);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				labelsToOffsets);
		renumberBci(codeHandlerStartP, bciRenumbering, labelsToOffsets);
		renumberOffsetBci(codeHandlerStartP, codeHandlerEndPO, bciRenumbering, labelsToOffsets);
		renumberDoubleOffsetBci(codeHandlerStartP, codeHandlerEndPO, codeHandlerCatchPO, bciRenumbering,
				labelsToOffsets);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		renumberBci(codeHandlerStartP, bciRenumbering, labelsToOffsets);
		renumberOffsetBci(codeHandlerStartP, codeHandlerEndPO, bciRenumbering, labelsToOffsets);
		renumberDoubleOffsetBci(codeHandlerStartP, codeHandlerEndPO, codeHandlerCatchPO, bciRenumbering,
				labelsToOffsets);

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		renumberBci(codeHandlerStartP, bciRenumbering, labelsToOffsets);
		renumberOffsetBci(codeHandlerStartP, codeHandlerEndPO, bciRenumbering, labelsToOffsets);
		renumberDoubleOffsetBci(codeHandlerStartP, codeHandlerEndPO, codeHandlerCatchPO, bciRenumbering,
				labelsToOffsets);

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		renumberBci(codeHandlerStartP, bciRenumbering, labelsToOffsets);
		renumberOffsetBci(codeHandlerStartP, codeHandlerEndPO, bciRenumbering, labelsToOffsets);
		renumberDoubleOffsetBci(codeHandlerStartP, codeHandlerEndPO, codeHandlerCatchPO, bciRenumbering,
				labelsToOffsets);

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/CPMember.java`
#### Snippet
```java
        this.descriptor = Objects.requireNonNull(descriptor, "descriptor");
        this.flags = (short) flags;
        this.attributes = attributes == null ? Collections.EMPTY_LIST : attributes;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/BcBands.java`
#### Snippet
```java
                        codeAttributeIndex++;
                    } else {
                        currentAttributes = Collections.EMPTY_LIST;
                    }
                    for (final Attribute currentAttribute : currentAttributes) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List\[\]' to 'java.util.List\[\]'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/ClassBands.java`
#### Snippet
```java
        final int codeFlagsCount = allCodeHasFlags ? codeCount : codeSpecialHeader;

        codeAttributes = new List[codeFlagsCount];
        Arrays.setAll(codeAttributes, i -> new ArrayList<>());
        parseCodeAttrBands(in, codeFlagsCount);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List\[\]' to 'java.util.List\[\]'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/ClassBands.java`
#### Snippet
```java
        }
        final MetadataBandGroup[] mbgs = parseMetadata(in, RxA, rxaCounts, backwardsCalls, "method");
        final List<Attribute>[] attributeLists = new List[RxA.length];
        final int[] attributeListIndexes = new int[RxA.length];
        for (int i = 0; i < mbgs.length; i++) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList\[\]' to 'java.util.ArrayList\[\]'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/ClassBands.java`
#### Snippet
```java

        // Prepare empty attribute lists
        classAttributes = new ArrayList[classCount];
        Arrays.setAll(classAttributes, i -> new ArrayList<>());

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List\[\]' to 'java.util.List\[\]'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/ClassBands.java`
#### Snippet
```java
        final AttributeLayout[] otherLayouts = new AttributeLayout[limit + 1];
        final int[] counts = new int[limit + 1];
        final List<Attribute>[] otherAttributes = new List[limit + 1];
        for (int i = 0; i < limit; i++) {
            final AttributeLayout layout = attrMap.getAttributeLayout(i, AttributeLayout.CONTEXT_CLASS);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList\[\]\[\]' to 'java.util.ArrayList\[\]\[\]'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/ClassBands.java`
#### Snippet
```java

        // Assign empty field attributes
        fieldAttributes = new ArrayList[classCount][];
        for (int i = 0; i < classCount; i++) {
            fieldAttributes[i] = new ArrayList[fieldFlags[i].length];
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList\[\]' to 'java.util.ArrayList\[\]'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/ClassBands.java`
#### Snippet
```java
        fieldAttributes = new ArrayList[classCount][];
        for (int i = 0; i < classCount; i++) {
            fieldAttributes[i] = new ArrayList[fieldFlags[i].length];
            for (int j = 0; j < fieldFlags[i].length; j++) {
                fieldAttributes[i][j] = new ArrayList<>();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List\[\]' to 'java.util.List\[\]'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/ClassBands.java`
#### Snippet
```java
        final AttributeLayout[] otherLayouts = new AttributeLayout[limit + 1];
        final int[] counts = new int[limit + 1];
        final List<Attribute>[] otherAttributes = new List[limit + 1];
        for (int i = 0; i < limit; i++) {
            final AttributeLayout layout = attrMap.getAttributeLayout(i, AttributeLayout.CONTEXT_FIELD);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List\[\]' to 'java.util.List\[\]'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/ClassBands.java`
#### Snippet
```java
        final AttributeLayout[] otherLayouts = new AttributeLayout[limit + 1];
        final int[] counts = new int[limit + 1];
        final List<Attribute>[] otherAttributes = new List[limit + 1];
        for (int i = 0; i < limit; i++) {
            final AttributeLayout layout = attrMap.getAttributeLayout(i, AttributeLayout.CONTEXT_CODE);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList\[\]\[\]' to 'java.util.ArrayList\[\]\[\]'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/ClassBands.java`
#### Snippet
```java

        // assign empty method attributes
        methodAttributes = new ArrayList[classCount][];
        for (int i = 0; i < classCount; i++) {
            methodAttributes[i] = new ArrayList[methodFlags[i].length];
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList\[\]' to 'java.util.ArrayList\[\]'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/ClassBands.java`
#### Snippet
```java
        methodAttributes = new ArrayList[classCount][];
        for (int i = 0; i < classCount; i++) {
            methodAttributes[i] = new ArrayList[methodFlags[i].length];
            for (int j = 0; j < methodFlags[i].length; j++) {
                methodAttributes[i][j] = new ArrayList<>();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List\[\]' to 'java.util.List\[\]'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/ClassBands.java`
#### Snippet
```java
            }
        }
        final List<Attribute>[] otherAttributes = new List[limit + 1];
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `tokens`
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
     * Resolve calls in the attribute layout and returns the number of backwards callables
     *
     * @param tokens - the attribute layout as a List of AttributeElements
     */
    private void resolveCalls() {
```

### JavadocReference
Cannot resolve symbol `java.lang.DataInputStream`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentHeader.java`
#### Snippet
```java

    /**
     * Completely reads in a byte array, akin to the implementation in {@link java.lang.DataInputStream}. TODO Refactor
     * out into a separate InputStream handling class
     *
```

### JavadocReference
Cannot resolve symbol `cpIMethodCount`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java

    /**
     * Parses the constant pool interface method definitions, using {@link #cpIMethodCount} to populate
     * {@link #cpIMethodClass} and {@link #cpIMethodDescriptor}.
     *
```

### JavadocReference
Cannot resolve symbol `cpDescriptorCount`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java

    /**
     * Parses the constant pool descriptor definitions, using {@link #cpDescriptorCount} to populate
     * {@link #cpDescriptor}. For ease of use, the cpDescriptor is stored as a string of the form <i>name:type</i>,
     * largely to make it easier for representing field and method descriptors (e.g.
```

### JavadocReference
Cannot resolve symbol `cpStringCount`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java

    /**
     * Parses the constant pool strings, using {@link #cpStringCount} to populate {@link #cpString} from indexes into
     * {@link #cpUTF8}.
     *
```

### JavadocReference
Cannot resolve symbol `cpClassCount`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java

    /**
     * Parses the constant pool class names, using {@link #cpClassCount} to populate {@link #cpClass} from
     * {@link #cpUTF8}.
     *
```

### JavadocReference
Cannot resolve symbol `cpMethodCount`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java

    /**
     * Parses the constant pool method definitions, using {@link #cpMethodCount} to populate {@link #cpMethodClass} and
     * {@link #cpMethodDescriptor}.
     *
```

### JavadocReference
Cannot resolve symbol `cpSignatureCount`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java

    /**
     * Parses the constant pool signature classes, using {@link #cpSignatureCount} to populate {@link #cpSignature}. A
     * signature form is akin to the bytecode representation of a class; Z for boolean, I for int, [ for array etc.
     * However, although classes are started with L, the classname does not follow the form; instead, there is a
```

### JavadocReference
Cannot resolve symbol `cpFieldCount`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java

    /**
     * Parses the constant pool field definitions, using {@link #cpFieldCount} to populate {@link #cpFieldClass} and
     * {@link #cpFieldDescriptor}.
     *
```

### JavadocReference
Cannot resolve symbol `org.tukaani.xz.XZInputStream`
in `src/main/java/org/apache/commons/compress/compressors/xz/package-info.java`
#### Snippet
```java
 * Provides stream classes for compressing and decompressing streams using the XZ algorithm.
 * <p>
 * The classes in this package are wrappers around {@link org.tukaani.xz.XZInputStream org.tukaani.xz.XZInputStream} and {@link org.tukaani.xz.XZOutputStream
 * org.tukaani.xz.XZOutputStream} provided by the public domain <a href="https://tukaani.org/xz/java.html">XZ for Java</a> library.
 * </p>
```

### JavadocReference
Cannot resolve symbol `org.tukaani.xz.XZOutputStream`
in `src/main/java/org/apache/commons/compress/compressors/xz/package-info.java`
#### Snippet
```java
 * Provides stream classes for compressing and decompressing streams using the XZ algorithm.
 * <p>
 * The classes in this package are wrappers around {@link org.tukaani.xz.XZInputStream org.tukaani.xz.XZInputStream} and {@link org.tukaani.xz.XZOutputStream
 * org.tukaani.xz.XZOutputStream} provided by the public domain <a href="https://tukaani.org/xz/java.html">XZ for Java</a> library.
 * </p>
```

### JavadocReference
Cannot resolve symbol `LZMAOutputStream`
in `src/main/java/org/apache/commons/compress/compressors/lzma/LZMACompressorOutputStream.java`
#### Snippet
```java

    /**
     * Doesn't do anything as {@link LZMAOutputStream} doesn't support flushing.
     */
    @Override
```

### JavadocReference
@value tag must reference a field with a constant initializer
in `src/main/java/org/apache/commons/compress/compressors/gzip/GzipCompressorOutputStream.java`
#### Snippet
```java

    /**
     * Gets the bytes encoded in the {@value GzipUtils#GZIP_ENCODING} Charset.
     * <p>
     * If the string cannot be encoded directly with {@value GzipUtils#GZIP_ENCODING}, then use URI-style percent encoding.
```

### JavadocReference
@value tag must reference a field with a constant initializer
in `src/main/java/org/apache/commons/compress/compressors/gzip/GzipCompressorOutputStream.java`
#### Snippet
```java
     * Gets the bytes encoded in the {@value GzipUtils#GZIP_ENCODING} Charset.
     * <p>
     * If the string cannot be encoded directly with {@value GzipUtils#GZIP_ENCODING}, then use URI-style percent encoding.
     * </p>
     *
```

## RuleId[id=UnaryPlus]
### UnaryPlus
Unary `+` operator
in `src/main/java/org/apache/commons/compress/harmony/unpack200/IcTuple.java`
#### Snippet
```java
        cachedHashCode = 17;
        if (C != null) {
            cachedHashCode = +C.hashCode();
        }
        if (C2 != null) {
```

### UnaryPlus
Unary `+` operator
in `src/main/java/org/apache/commons/compress/harmony/unpack200/IcTuple.java`
#### Snippet
```java
        }
        if (C2 != null) {
            cachedHashCode = +C2.hashCode();
        }
        if (N != null) {
```

### UnaryPlus
Unary `+` operator
in `src/main/java/org/apache/commons/compress/harmony/unpack200/IcTuple.java`
#### Snippet
```java
        }
        if (N != null) {
            cachedHashCode = +N.hashCode();
        }
    }
```

### UnaryPlus
Unary `+` operator
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/LocalVariableTypeTableAttribute.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "LocalVariableTypeTable: " + +localVariableTypeTableLength + " varaibles";
    }

```

### UnaryPlus
Unary `+` operator
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/LocalVariableTableAttribute.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "LocalVariableTable: " + +localVariableTableLength + " variables";
    }

```

### UnaryPlus
Unary `+` operator
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java`
#### Snippet
```java
    private static final int CFD_LOCATOR_RELATIVE_OFFSET =
            /* total number of entries in      */
            /* the central dir on this disk    */ + ZipConstants.SHORT
            /* total number of entries in      */
            /* the central dir                 */ + ZipConstants.SHORT
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Dereference of `aSpecifier` may produce `NullPointerException`
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java
            final int[] aSpecifier = abDef == 1 ? new int[0] : getSpecifier(aCodec, defaultForBand);
            final int[] bSpecifier = abDef == 2 ? new int[0] : getSpecifier(bCodec, defaultForBand);
            final int[] specifier = new int[1 + (kx == 3 ? 0 : 1) + aSpecifier.length + bSpecifier.length];
            specifier[0] = first;
            int index = 1;
```

### DataFlowIssue
Dereference of `bSpecifier` may produce `NullPointerException`
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java
            final int[] aSpecifier = abDef == 1 ? new int[0] : getSpecifier(aCodec, defaultForBand);
            final int[] bSpecifier = abDef == 2 ? new int[0] : getSpecifier(bCodec, defaultForBand);
            final int[] specifier = new int[1 + (kx == 3 ? 0 : 1) + aSpecifier.length + bSpecifier.length];
            specifier[0] = first;
            int index = 1;
```

### DataFlowIssue
Dereference of `favouredSpecifier` may produce `NullPointerException`
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java
            final int[] tokenSpecifier = tDefL != 0 ? new int[0] : getSpecifier(tokenCodec, defaultForBand);
            final int[] unfavouredSpecifier = uDef == 1 ? new int[0] : getSpecifier(unfavouredCodec, defaultForBand);
            final int[] specifier = new int[1 + favouredSpecifier.length + unfavouredSpecifier.length
                + tokenSpecifier.length];
            specifier[0] = first;
```

### DataFlowIssue
Dereference of `unfavouredSpecifier` may produce `NullPointerException`
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java
            final int[] tokenSpecifier = tDefL != 0 ? new int[0] : getSpecifier(tokenCodec, defaultForBand);
            final int[] unfavouredSpecifier = uDef == 1 ? new int[0] : getSpecifier(unfavouredCodec, defaultForBand);
            final int[] specifier = new int[1 + favouredSpecifier.length + unfavouredSpecifier.length
                + tokenSpecifier.length];
            specifier[0] = first;
```

### DataFlowIssue
Dereference of `tokenSpecifier` may produce `NullPointerException`
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java
            final int[] unfavouredSpecifier = uDef == 1 ? new int[0] : getSpecifier(unfavouredCodec, defaultForBand);
            final int[] specifier = new int[1 + favouredSpecifier.length + unfavouredSpecifier.length
                + tokenSpecifier.length];
            specifier[0] = first;
            int index = 1;
```

### DataFlowIssue
Array access `getSpecifier(defaultCodec, null)[0]` may produce `NullPointerException`
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java

    public static int getSpecifierForDefaultCodec(final BHSDCodec defaultCodec) {
        return getSpecifier(defaultCodec, null)[0];
    }
}
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
                break;
            case 'V':
                length = 0;
                break;
            }
```

### DataFlowIssue
Method invocation `intValue` may produce `NullPointerException`
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        // Call
        case '(':
            final int number = readNumber(reader).intValue();
            reader.read(); // ')'
            return new Call(number);
```

### DataFlowIssue
Argument `CodecEncoding.getSpecifier(favouredCodec, null)` might be null
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
        final IntList extraBandMetadata = new IntList(3);
        if (favouredCodec != null) {
            IntStream.of(CodecEncoding.getSpecifier(favouredCodec, null)).forEach(extraBandMetadata::add);
        }
        if (tdefL == 0) {
```

### DataFlowIssue
Argument `CodecEncoding.getSpecifier(tokenCodec, null)` might be null
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
        }
        if (tdefL == 0) {
            IntStream.of(CodecEncoding.getSpecifier(tokenCodec, null)).forEach(extraBandMetadata::add);
        }
        if (unfavouredCodec != null) {
```

### DataFlowIssue
Argument `CodecEncoding.getSpecifier(unfavouredCodec, null)` might be null
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
        }
        if (unfavouredCodec != null) {
            IntStream.of(CodecEncoding.getSpecifier(unfavouredCodec, null)).forEach(extraBandMetadata::add);
        }
        final int[] extraMetadata = extraBandMetadata.toArray();
```

### DataFlowIssue
Array access `specifierBand[0]` may produce `NullPointerException`
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
                if (betterCodec instanceof BHSDCodec) {
                    final int[] specifierBand = CodecEncoding.getSpecifier(betterCodec, defaultCodec);
                    int specifier = specifierBand[0];
                    if (specifierBand.length > 1) {
                        for (int i = 1; i < specifierBand.length; i++) {
```

### DataFlowIssue
Argument `CodecEncoding.getSpecifier(potential, null)` might be null
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
                    final byte[] encoded2 = potential.encode(band);
                    results.numCodecsTried++;
                    final byte[] specifierEncoded = defaultCodec.encode(CodecEncoding.getSpecifier(potential, null));
                    final int saved = encoded.length - encoded2.length - specifierEncoded.length;
                    if (saved > results.saved) {
```

### DataFlowIssue
Argument `CodecEncoding.getSpecifier(potential, null)` might be null
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
                final byte[] encoded2 = potential.encode(band);
                results.numCodecsTried++;
                final byte[] specifierEncoded = defaultCodec.encode(CodecEncoding.getSpecifier(potential, null));
                final int saved = encoded.length - encoded2.length - specifierEncoded.length;
                if (saved > results.saved) {
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
                    break;
                case 4:
                    value = value;
                    break;
                default:
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
                break;
            case 'V':
                length = 0;
                break;
            }
```

### DataFlowIssue
Method invocation `intValue` may produce `NullPointerException`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
        // Call
        case '(':
            final int number = readNumber(stream).intValue();
            stream.read(); // ')'
            return new Call(number);
```

### DataFlowIssue
Condition `label instanceof Integer` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		for (int i = list.size() - 1; i >= 0; i--) {
			final Object label = list.get(i);
			if (label instanceof Integer) {
				break;
			}
```

### DataFlowIssue
Condition `label instanceof Integer` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		for (int i = list.size() - 1; i >= 0; i--) {
			final Object label = list.get(i);
			if (label instanceof Integer) {
				break;
			}
```

### DataFlowIssue
Casting `previous` to `BCIndex` may produce `ClassCastException`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/NewAttribute.java`
#### Snippet
```java
                    // previous must be a BCIndex
                    final BCLength bcLength = (BCLength) obj;
                    final BCIndex prevIndex = (BCIndex) previous;
                    final int index = prevIndex.index + bcLength.length;
                    final int actualLength = byteCodeOffsets.get(index).intValue() - prevIndex.actualValue;
```

### DataFlowIssue
Dereference of `prevIndex` may produce `NullPointerException`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/NewAttribute.java`
#### Snippet
```java
                    final BCLength bcLength = (BCLength) obj;
                    final BCIndex prevIndex = (BCIndex) previous;
                    final int index = prevIndex.index + bcLength.length;
                    final int actualLength = byteCodeOffsets.get(index).intValue() - prevIndex.actualValue;
                    bcLength.setActualValue(actualLength);
```

### DataFlowIssue
Dereference of `DumpArchiveConstants.COMPRESSION_TYPE.find(flags & 0x03)` may produce `NullPointerException`
in `src/main/java/org/apache/commons/compress/archivers/dump/TapeInputStream.java`
#### Snippet
```java
                    Arrays.fill(blockBuffer, (byte) 0);
                } else {
                    switch (DumpArchiveConstants.COMPRESSION_TYPE.find(flags &
                        0x03)) {
                    case ZLIB:

```

### DataFlowIssue
Result of 'min' is the same as the first argument making the call meaningless
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java`
#### Snippet
```java
            ZipLong.putLong(ZipConstants.ZIP64_MAGIC, buf, CFH_LFH_OFFSET);
        } else {
            ZipLong.putLong(Math.min(entryMetaData.offset, ZipConstants.ZIP64_MAGIC), buf, CFH_LFH_OFFSET);
        }

```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java`
#### Snippet
```java
        } catch (final IOException e) { // NOSONAR
            IOUtils.closeQuietly(channel);
            channel = null;
            outputStream = Files.newOutputStream(file, options);
            streamCompressor = StreamCompressor.create(outputStream, def);
```

### DataFlowIssue
Array access `block[block.length - 1]` may produce `NullPointerException`
in `src/main/java/org/apache/commons/compress/compressors/lz4/BlockLZ4CompressorOutputStream.java`
#### Snippet
```java
        if (offset == 1) { // surprisingly common special case
            final byte[] block = expandedBlocks.peekFirst();
            final byte b = block[block.length - 1];
            if (b != 0) { // the fresh array contains 0s anyway
                Arrays.fill(expanded, b);
```

### DataFlowIssue
Method invocation `hasBeenWritten` may produce `NullPointerException`
in `src/main/java/org/apache/commons/compress/compressors/lz4/BlockLZ4CompressorOutputStream.java`
#### Snippet
```java
        for (int i = pairsToKeep; i < size; i++) {
            final Pair p = pairs.peekFirst();
            if (!p.hasBeenWritten()) {
                break;
            }
```

### DataFlowIssue
Method invocation `cardinality` may produce `NullPointerException`
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
                }
                case NID.kEmptyFile: {
                    isEmptyFile = readBits(header, isEmptyStream.cardinality());
                    break;
                }
```

### DataFlowIssue
Method invocation `cardinality` may produce `NullPointerException`
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
                }
                case NID.kAnti: {
                    isAnti = readBits(header, isEmptyStream.cardinality());
                    break;
                }
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'collect(mapping())' can be replaced with 'map().collect()'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java

    private List<Integer> getIndexInClassForConstructor(final List<CPMethodOrField> cPMethodList) {
        return cPMethodList.stream().collect(Collectors.mapping(CPMethodOrField::getIndexInClassForConstructor, Collectors.toList()));
    }

```

### SimplifyStreamApiCallChains
'collect(mapping())' can be replaced with 'map().collect()'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java

    private List<Integer> getIndexInClass(final List<CPMethodOrField> cPMethodOrFieldList) {
        return cPMethodOrFieldList.stream().collect(Collectors.mapping(CPMethodOrField::getIndexInClass, Collectors.toList()));
    }

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary zero argument
in `src/main/java/org/apache/commons/compress/harmony/archive/internal/nls/Messages.java`
#### Snippet
```java
        Arrays.setAll(argStrings, i -> Objects.toString(args[i], "<null>")); //$NON-NLS-1$
        int lastI = 0;
        for (int i = format.indexOf('{', 0); i >= 0; i = format.indexOf('{', lastI)) {
            if (i != 0 && format.charAt(i - 1) == '\\') {
                // It's escaped, just print and loop.
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/main/java/org/apache/commons/compress/harmony/archive/internal/nls/Messages.java`
#### Snippet
```java
                // It's escaped, just print and loop.
                if (i != 1) {
                    answer.append(format.substring(lastI, i - 1));
                }
                answer.append('{');
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/main/java/org/apache/commons/compress/harmony/archive/internal/nls/Messages.java`
#### Snippet
```java
                if (argnum < 0 || format.charAt(i + 2) != '}') {
                    // Bad format, just print and loop.
                    answer.append(format.substring(lastI, i + 1));
                    lastI = i + 1;
                } else {
```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `src/main/java/org/apache/commons/compress/harmony/archive/internal/nls/Messages.java`
#### Snippet
```java
                } else {
                    // Got a good one!
                    answer.append(format.substring(lastI, i));
                    if (argnum >= argStrings.length) {
                        answer.append("<missing argument>"); //$NON-NLS-1$
```

### StringOperationCanBeSimplified
Can be replaced with 'String.valueOf()'
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        case 'I':
        case 'V':
            return new Integral(new String(new char[] {(char) nextChar}));
        case 'S':
        case 'F':
```

### StringOperationCanBeSimplified
Unnecessary empty string argument
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        case 'K':
        case 'R':
            final StringBuilder string = new StringBuilder("").append((char) nextChar).append((char) reader.read());
            final char nxt = (char) reader.read();
            string.append(nxt);
```

### StringOperationCanBeSimplified
Can be replaced with 'String.valueOf()'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
        case 'I':
        case 'V':
            return new Integral(new String(new char[] {(char) nextChar}));
        case 'S':
        case 'F':
```

### StringOperationCanBeSimplified
Unnecessary empty string argument
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
        case 'K':
        case 'R':
            final StringBuilder string = new StringBuilder("").append((char) nextChar).append((char) stream.read());
            final char nxt = (char) stream.read();
            string.append(nxt);
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'ServiceLoaderIterator' is still used
in `src/main/java/org/apache/commons/compress/utils/ServiceLoaderIterator.java`
#### Snippet
```java
 */
@Deprecated
public class ServiceLoaderIterator<E> implements Iterator<E> {

    private E nextServiceLoader;
```

### DeprecatedIsStillUsed
Deprecated member 'setEntryEncoding' is still used
in `src/main/java/org/apache/commons/compress/archivers/ArchiveStreamFactory.java`
#### Snippet
```java
     */
    @Deprecated
    public void setEntryEncoding(final String entryEncoding) {
        // Note: this does not detect new ArchiveStreamFactory(null) but that does not set the encoding anyway
        if (encoding != null) {
```

### DeprecatedIsStillUsed
Deprecated member 'getRecordSize' is still used
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.java`
#### Snippet
```java
     */
    @Deprecated
    public int getRecordSize() {
        return RECORD_SIZE;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'parsePaxHeaders' is still used
in `src/main/java/org/apache/commons/compress/archivers/tar/TarUtils.java`
#### Snippet
```java
     */
    @Deprecated
    protected static Map<String, String> parsePaxHeaders(final InputStream inputStream, final List<TarArchiveStructSparse> sparseHeaders, final Map<String, String> globalPaxHeaders)
            throws IOException {
        return parsePaxHeaders(inputStream, sparseHeaders, globalPaxHeaders, -1);
```

### DeprecatedIsStillUsed
Deprecated member 'parsePAX01SparseHeaders' is still used
in `src/main/java/org/apache/commons/compress/archivers/tar/TarUtils.java`
#### Snippet
```java
     */
    @Deprecated
    protected static List<TarArchiveStructSparse> parsePAX01SparseHeaders(final String sparseMap) {
        try {
            return parseFromPAX01SparseHeaders(sparseMap);
```

### DeprecatedIsStillUsed
Deprecated member 'javaTimeToNtfsTime' is still used
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZArchiveEntry.java`
#### Snippet
```java
     */
    @Deprecated
    public static long javaTimeToNtfsTime(final Date date) {
        return TimeUtils.toNtfsTime(date);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'ntfsTimeToJavaTime' is still used
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZArchiveEntry.java`
#### Snippet
```java
     */
    @Deprecated
    public static Date ntfsTimeToJavaTime(final long ntfsTime) {
        return TimeUtils.ntfsTimeToDate(ntfsTime);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setDecompressConcatenated' is still used
in `src/main/java/org/apache/commons/compress/compressors/CompressorStreamFactory.java`
#### Snippet
```java
     */
    @Deprecated
    public void setDecompressConcatenated(final boolean decompressConcatenated) {
        if (this.decompressUntilEOF != null) {
            throw new IllegalStateException("Cannot override the setting defined by the constructor");
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
        header.count = DumpArchiveUtil.convert32(buffer, 160);

        header.holes = 0;

        for (int i = 0; (i < 512) && (i < header.count); i++) {
            if (buffer[164 + i] == 0) {
                header.holes++;
            }
        }

        System.arraycopy(buffer, 164, header.cdata, 0, 512);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZOutputFile.java`
#### Snippet
```java
            final ByteArrayOutputStream baos = new ByteArrayOutputStream();
            final DataOutputStream out = new DataOutputStream(baos);
            writeBits(out, antiItems, antiItemCounter);
            out.flush();
            final byte[] contents = baos.toByteArray();
            writeUint64(header, contents.length);
            header.write(contents);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java`
#### Snippet
```java
        if (currEntry == null) {
            // Bugzilla: 40334
            // Malformed tar file - long entry name not followed by entry
            return null;
        }
        byte[] longNameData = longName.toByteArray();
        // remove trailing null terminator(s)
        length = longNameData.length;
        while (length > 0 && longNameData[length - 1] == 0) {
            --length;
        }
        if (length != longNameData.length) {
            longNameData = Arrays.copyOf(longNameData, length);
        }
        return longNameData;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java`
#### Snippet
```java
        if (currEntry.isGNULongLinkEntry()) {
            final byte[] longLinkData = getLongNameData();
            if (longLinkData == null) {
                // Bugzilla: 40334
                // Malformed tar file - long link entry name not followed by
                // entry
                return null;
            }
            currEntry.setLinkName(zipEncoding.decode(longLinkData));
        }

        if (currEntry.isGNULongNameEntry()) {
            final byte[] longNameData = getLongNameData();
            if (longNameData == null) {
                // Bugzilla: 40334
                // Malformed tar file - long entry name not followed by
                // entry
                return null;
            }

            // COMPRESS-509 : the name of directories should end with '/'
            final String name = zipEncoding.decode(longNameData);
            currEntry.setName(name);
            if (currEntry.isDirectory() && !name.endsWith("/")) {
                currEntry.setName(name + "/");
            }
        }

        if (currEntry.isGlobalPaxHeader()){ // Process Global Pax headers
            readGlobalPaxHeaders();
        }

        try {
            if (currEntry.isPaxHeader()){ // Process Pax headers
                paxHeaders();
            } else if (!globalPaxHeaders.isEmpty()) {
                applyPaxHeadersToCurrentEntry(globalPaxHeaders, globalSparseHeaders);
            }
        } catch (final NumberFormatException e) {
            throw new IOException("Error detected parsing the pax header", e);
        }

        if (currEntry.isOldGNUSparse()){ // Process sparse files
            readOldGNUSparse();
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/archivers/zip/ExtraFieldUtils.java`
#### Snippet
```java
        final int dataLength = data.length;
        final boolean lastIsUnparseableHolder = dataLength > 0
            && data[dataLength - 1] instanceof UnparseableExtraFieldData;
        final int regularExtraFieldCount =
            lastIsUnparseableHolder ? dataLength - 1 : dataLength;

        int sum = WORD * regularExtraFieldCount;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipSplitReadOnlySeekableByteChannel.java`
#### Snippet
```java
        final List<SeekableByteChannel> channels = new ArrayList<>();
        for (final Path path : Objects.requireNonNull(paths, "paths must not be null")) {
            channels.add(Files.newByteChannel(path, StandardOpenOption.READ));
        }
        if (channels.size() == 1) {
            return channels.get(0);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/compressors/FileNameUtil.java`
#### Snippet
```java
        final String lower = fileName.toLowerCase(Locale.ENGLISH);
        final int n = lower.length();
        for (int i = shortestUncompressedSuffix;
             i <= longestUncompressedSuffix && i < n; i++) {
            final String suffix = compressSuffix.get(lower.substring(n - i));
            if (suffix != null) {
                return fileName.substring(0, n - i) + suffix;
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java`
#### Snippet
```java
                    if (groupPos == 0) {
                        groupPos = G_SIZE - 1;
                        checkBounds(++groupNo, MAX_SELECTORS, "groupNo");
                        zt = selector[groupNo] & 0xff;
                        checkBounds(zt, N_GROUPS, "zt");
                        base_zt = base[zt];
                        limit_zt = limit[zt];
                        perm_zt = perm[zt];
                        minLens_zt = minLens[zt];
                    } else {
                        groupPos--;
                    }

                    int zn = minLens_zt;
                    checkBounds(zn, MAX_ALPHA_SIZE, "zn");
                    int zvec = bsR(bin, zn);
                    while(zvec > limit_zt[zn]) {
                        checkBounds(++zn, MAX_ALPHA_SIZE, "zn");
                        zvec = (zvec << 1) | bsR(bin, 1);
                    }
                    final int tmp = zvec - base_zt[zn];
                    checkBounds(tmp, MAX_ALPHA_SIZE, "zvec");
                    nextSym = perm_zt[tmp];
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java`
#### Snippet
```java
            checkBounds(this.su_tPos, this.data.tt.length, "su_tPos");
            this.su_tPos = this.data.tt[this.su_tPos];
            if (this.su_rNToGo == 0) {
                this.su_rNToGo = Rand.rNums(this.su_rTPos) - 1;
                if (++this.su_rTPos == 512) {
                    this.su_rTPos = 0;
                }
            } else {
                this.su_rNToGo--;
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java`
#### Snippet
```java
                while (true) {
                    yy = zz << 1;

                    if (yy > nHeap) {
                        break;
                    }

                    if ((yy < nHeap)
                        && (weight[heap[yy + 1]] < weight[heap[yy]])) {
                        yy++;
                    }

                    if (weight[tmp] < weight[heap[yy]]) {
                        break;
                    }

                    heap[zz] = heap[yy];
                    zz = yy;
                }

                heap[zz] = tmp;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java`
#### Snippet
```java
            byte tmp = yy[0];
            int j = 0;

            while (ll_i != tmp) {
                j++;
                final byte tmp2 = tmp;
                tmp = yy[j];
                yy[j] = tmp2;
            }
            yy[0] = tmp;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java`
#### Snippet
```java
                    zPend--;
                    while (true) {
                        if ((zPend & 1) == 0) {
                            sfmap[wr] = RUNA;
                            wr++;
                            mtfFreq[RUNA]++;
                        } else {
                            sfmap[wr] = RUNB;
                            wr++;
                            mtfFreq[RUNB]++;
                        }

                        if (zPend < 2) {
                            break;
                        }
                        zPend = (zPend - 2) >> 1;
                    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/compressors/lzma/LZMAUtils.java`
#### Snippet
```java
        if (length < HEADER_MAGIC.length) {
            return false;
        }

        for (int i = 0; i < HEADER_MAGIC.length; ++i) {
            if (signature[i] != HEADER_MAGIC[i]) {
                return false;
            }
        }

        return true;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/BHSDCodec.java`
#### Snippet
```java
        if (isDelta()) {
            for (int i = 0; i < band.length; i++) {
                while (band[i] > largest) {
                    band[i] -= cardinality;
                }
                while (band[i] < smallest) {
                    band[i] = ExactMath.add(band[i], cardinality);
                }
            }
        }
        return band;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
                    final byte[] specifierEncoded = defaultCodec.encode(new int[] {specifier});
                    final byte[] band = new byte[specifierEncoded.length + encodedBand.length];
                    System.arraycopy(specifierEncoded, 0, band, 0, specifierEncoded.length);
                    System.arraycopy(encodedBand, 0, band, specifierEncoded.length, encodedBand.length);
                    return band;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
                    final byte[] encoded2 = potential.encode(band);
                    results.numCodecsTried++;
                    final byte[] specifierEncoded = defaultCodec.encode(CodecEncoding.getSpecifier(potential, null));
                    final int saved = encoded.length - encoded2.length - specifierEncoded.length;
                    if (saved > results.saved) {
                        results.betterCodec = potential;
                        results.encodedBand = encoded2;
                        results.saved = saved;
                    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		final int bra = descriptor.indexOf('(');
		final int ket = descriptor.indexOf(')');
		if (bra == -1 || ket == -1 || ket < bra) {
			throw new IllegalArgumentException("No arguments");
		}

		boolean inType = false;
		boolean consumingNextType = false;
		int count = 0;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
			if (visible) {
				field_RVA_bands.addAnnotation(desc, nameRU, tags, values, caseArrayN, nestTypeRS, nestNameRU,
						nestPairN);
				final Long flag = tempFieldFlags.remove(tempFieldFlags.size() - 1);
				if ((flag.intValue() & (1 << 21)) != 0) {
					field_RVA_bands.incrementAnnoN();
				} else {
					field_RVA_bands.newEntryInAnnoN();
				}
				tempFieldFlags.add(Long.valueOf(flag.intValue() | (1 << 21)));
			} else {
				field_RIA_bands.addAnnotation(desc, nameRU, tags, values, caseArrayN, nestTypeRS, nestNameRU,
						nestPairN);
				final Long flag = tempFieldFlags.remove(tempFieldFlags.size() - 1);
				if ((flag.intValue() & (1 << 22)) != 0) {
					field_RIA_bands.incrementAnnoN();
				} else {
					field_RIA_bands.newEntryInAnnoN();
				}
				tempFieldFlags.add(Long.valueOf(flag.intValue() | (1 << 22)));
			}
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		final String attributeName = attribute.type;
		for (final NewAttributeBands bands : codeAttributeBands) {
			if (bands.getAttributeName().equals(attributeName)) {
				bands.addAttribute(attribute);
				final int flagIndex = bands.getFlagIndex();
				final Long flags = codeFlags.remove(codeFlags.size() - 1);
				codeFlags.add(Long.valueOf(flags.longValue() | (1 << flagIndex)));
				return;
			}
		}
		throw new IllegalArgumentException("No suitable definition for " + attributeName);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		if (class_RVA_bands.hasContent()) {
			classAttrCalls.add(class_RVA_bands.numBackwardsCalls());
		}
		if (class_RIA_bands.hasContent()) {
			classAttrCalls.add(class_RIA_bands.numBackwardsCalls());
		}
		if (field_RVA_bands.hasContent()) {
			fieldAttrCalls.add(field_RVA_bands.numBackwardsCalls());
		}
		if (field_RIA_bands.hasContent()) {
			fieldAttrCalls.add(field_RIA_bands.numBackwardsCalls());
		}
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		for (final NewAttributeBands bands : classAttributeBands) {
			if (bands.isUsedAtLeastOnce()) {
				for (final int backwardsCallCount : bands.numBackwardsCalls()) {
					classAttrCalls.add(backwardsCallCount);
				}
			}
		}
		for (final NewAttributeBands bands : methodAttributeBands) {
			if (bands.isUsedAtLeastOnce()) {
				for (final int backwardsCallCount : bands.numBackwardsCalls()) {
					methodAttrCalls.add(backwardsCallCount);
				}
			}
		}
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		k = 0;
		for (int i = 0; i < index; i++) {
			for (int j = 0; j < field_descr[i].length; j++) {
				final CPNameAndType descr = field_descr[i][j];
				fieldDescr[k] = descr.getIndex();
				k++;
			}
		}
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
					final int numLocalVariables = codeLocalVariableTableN.remove(codeLocalVariableTableN.size() - 1);
					for (int i = 0; i < numLocalVariables; i++) {
						final int location = codeLocalVariableTableBciP.size() - 1;
						codeLocalVariableTableBciP.remove(location);
						codeLocalVariableTableSpanO.remove(location);
						codeLocalVariableTableNameRU.remove(location);
						codeLocalVariableTableTypeRS.remove(location);
						codeLocalVariableTableSlot.remove(location);
					}
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		for (int i = list.size() - 1; i >= 0; i--) {
			final Object label = list.get(i);
			if (label instanceof Integer) {
				break;
			}
			if (label instanceof Label) {
				list.remove(i);
				final Integer bytecodeIndex = labelsToOffsets.get(label);
				list.add(i, Integer.valueOf(bciRenumbering.get(bytecodeIndex.intValue())));
			}
		}
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java
            for (final int element : aSpecifier) {
                specifier[index] = element;
                index++;
            }
            for (final int element : bSpecifier) {
                specifier[index] = element;
                index++;
            }
            return specifier;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
			final CPClass cpClassName = mOrF.getClassName();
			final Integer index = classNameToIndex.get(cpClassName);
			if (index == null) {
				classNameToIndex.put(cpClassName, Integer.valueOf(1));
				mOrF.setIndexInClass(0);
			} else {
				final int theIndex = index.intValue();
				mOrF.setIndexInClass(theIndex);
				classNameToIndex.put(cpClassName, Integer.valueOf(theIndex + 1));
			}
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
        final String key = cpClass.toString() + ":" + name + ":" + desc;
        CPMethodOrField cpF = stringsToCpField.get(key);
        if (cpF == null) {
            final CPNameAndType nAndT = getCPNameAndType(name, desc);
            cpF = new CPMethodOrField(cpClass, nAndT);
            cp_Field.add(cpF);
            stringsToCpField.put(key, cpF);
        }
        return cpF;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/MetadataBandGroup.java`
#### Snippet
```java
nameRU.forEach(name -> name_RU.add(cpBands.getCPUtf8(name)));

		final Iterator<Object> valuesIterator = values.iterator();
		for (final String tag : tags) {
			T.add(tag);
            switch (tag) {
                case "B":
                case "C":
                case "I":
                case "S":
                case "Z": {
                    caseI_KI.add(cpBands.getConstant(valuesIterator.next()));
                    break;
                }
                case "D": {
                    caseD_KD.add(cpBands.getConstant(valuesIterator.next()));
                    break;
                }
                case "F": {
                    caseF_KF.add(cpBands.getConstant(valuesIterator.next()));
                    break;
                }
                case "J": {
                    caseJ_KJ.add(cpBands.getConstant(valuesIterator.next()));
                    break;
                }
                case "c": {
                    casec_RS.add(cpBands.getCPSignature(nextString(valuesIterator)));
                    break;
                }
                case "e": {
                    caseet_RS.add(cpBands.getCPSignature(nextString(valuesIterator)));
                    caseec_RU.add(cpBands.getCPUtf8(nextString(valuesIterator)));
                    break;
                }
                case "s": {
                    cases_RU.add(cpBands.getCPUtf8(nextString(valuesIterator)));
                    break;
                }
            }
			// do nothing here for [ or @ (handled below)
		}
		for (final Integer element : caseArrayN) {
			final int arraySize = element.intValue();
			casearray_N.add(arraySize);
			numBackwardsCalls += arraySize;
		}
		nestTypeRS.forEach(element -> nesttype_RS.add(cpBands.getCPSignature(element)));
		nestNameRU.forEach(element -> nestname_RU.add(cpBands.getCPUtf8(element)));
		for (final Integer numPairs : nestPairN) {
			nestpair_N.add(numPairs.intValue());
			numBackwardsCalls += numPairs.intValue();
		}
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/MetadataBandGroup.java`
#### Snippet
```java
final Iterator<Object> valuesIterator = values.iterator();
		for (final String tag : tags) {
			T.add(tag);
            switch (tag) {
                case "B":
                case "C":
                case "I":
                case "S":
                case "Z": {
                    caseI_KI.add(cpBands.getConstant(valuesIterator.next()));
                    break;
                }
                case "D": {
                    caseD_KD.add(cpBands.getConstant(valuesIterator.next()));
                    break;
                }
                case "F": {
                    caseF_KF.add(cpBands.getConstant(valuesIterator.next()));
                    break;
                }
                case "J": {
                    caseJ_KJ.add(cpBands.getConstant(valuesIterator.next()));
                    break;
                }
                case "c": {
                    casec_RS.add(cpBands.getCPSignature(nextString(valuesIterator)));
                    break;
                }
                case "e": {
                    caseet_RS.add(cpBands.getCPSignature(nextString(valuesIterator)));
                    caseec_RU.add(cpBands.getCPUtf8(nextString(valuesIterator)));
                    break;
                }
                case "s": {
                    cases_RU.add(cpBands.getCPUtf8(nextString(valuesIterator)));
                    break;
                }
            }
			// do nothing here for [ or @ (handled below)
		}
		for (final Integer element : caseArrayN) {
			final int arraySize = element.intValue();
			casearray_N.add(arraySize);
			numBackwardsCalls += arraySize;
		}
		nestTypeRS.forEach(type -> nesttype_RS.add(cpBands.getCPSignature(type)));
		nestNameRU.forEach(name -> nestname_RU.add(cpBands.getCPUtf8(name)));
		for (final Integer numPairs : nestPairN) {
			nestpair_N.add(numPairs.intValue());
			numBackwardsCalls += numPairs.intValue();
		}
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
            int length = 0;
            switch (uint_type) {
            case 'B':
                length = 1;
                break;
            case 'H':
                length = 2;
                break;
            case 'I':
                length = 4;
                break;
            case 'V':
                length = 0;
                break;
            }
            return length;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        if (layoutElement.indexOf('O') >= 0) {
            return Codec.BRANCH5;
        }
        if (layoutElement.indexOf('P') >= 0) {
            return Codec.BCI5;
        }
        if (layoutElement.indexOf('S') >= 0 && layoutElement.indexOf("KS") < 0 //$NON-NLS-1$
            && layoutElement.indexOf("RS") < 0) { //$NON-NLS-1$
            return Codec.SIGNED5;
        }
        if (layoutElement.indexOf('B') >= 0) {
            return Codec.BYTE1;
        }
        return Codec.UNSIGNED5;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        final StringBuilder sb = new StringBuilder();
        int foundBracket = -1;
        while (foundBracket != 0) {
            final int read = reader.read();
            if (read == -1) {
            	break;
            }
			final char c = (char) read;
            if (c == ']') {
                foundBracket++;
            }
            if (c == '[') {
                foundBracket--;
            }
            if (!(foundBracket == 0)) {
                sb.append(c);
            }
        }
        return new StringReader(sb.toString());
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        reader.mark(1);
        final int next = reader.read();
        if (next == -1) {
            return null;
        }
        if (next == '[') {
            return new Callable(readBody(getStreamUpToMatchingBracket(reader)));
        }
        reader.reset();
        return readNextLayoutElement(reader);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        reader.mark(2);
        reader.read(); // '('
        final int next = reader.read();
        char ch = (char) next;
        if (ch == ')' || next == -1) {
            reader.reset();
            return null;
        }
        reader.reset();
        reader.read(); // '('
        final List<Integer> tags = new ArrayList<>();
        Integer nextTag;
        do {
            nextTag = readNumber(reader);
            if (nextTag != null) {
                tags.add(nextTag);
                reader.read(); // ',' or ')'
            }
        } while (nextTag != null);
        reader.read(); // '['
        reader.mark(1);
        ch = (char) reader.read();
        if (ch == ']') {
            return new UnionCase(tags);
        }
        reader.reset();
        return new UnionCase(tags, readBody(getStreamUpToMatchingBracket(reader)));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        stream.mark(1);
        final char first = (char) stream.read();
        final boolean negative = first == '-';
        if (!negative) {
            stream.reset();
        }
        stream.mark(100);
        int i;
        int length = 0;
        while ((i = (stream.read())) != -1 && Character.isDigit((char) i)) {
            length++;
        }
        stream.reset();
        if (length == 0) {
            return null;
        }
        final char[] digits = new char[length];
        final int read = stream.read(digits);
        if (read != digits.length) {
            throw new IOException("Error reading from the input stream");
        }
        return Integer.valueOf(Integer.parseInt((negative ? "-" : "") + new String(digits)));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        final StringBuilder sb = new StringBuilder();
        int foundBracket = -1;
        while (foundBracket != 0) {
            final int read = reader.read();
            if (read == -1) {
            	break;
            }
			final char c = (char) read;
            if (c == ']') {
                foundBracket++;
            }
            if (c == '[') {
                foundBracket--;
            }
            if (!(foundBracket == 0)) {
                sb.append(c);
            }
        }
        return sb.toString();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
                for (int k = i + 1; k < attributeLayoutElements.size(); k++) {
                    final AttributeLayoutElement el = attributeLayoutElements.get(k);
                    if (el instanceof Callable) {
                        index--;
                        if (index == 0) {
                            call.setCallable((Callable) el);
                            break;
                        }
                    }
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
                for (int k = i - 1; k >= 0; k--) {
                    final AttributeLayoutElement el = attributeLayoutElements.get(k);
                    if (el instanceof Callable) {
                        index++;
                        if (index == 0) {
                            call.setCallable((Callable) el);
                            break;
                        }
                    }
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/pack200/SegmentHeader.java`
#### Snippet
```java
            out.write(encodeScalar(archive_size_hi, Codec.UNSIGNED5));
            out.write(encodeScalar(archive_size_lo, Codec.UNSIGNED5));
            out.write(encodeScalar(archive_next_count, Codec.UNSIGNED5));
            out.write(encodeScalar(archive_modtime, Codec.UNSIGNED5));
            out.write(encodeScalar(file_count, Codec.UNSIGNED5));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/unpack200/BandSet.java`
#### Snippet
```java
        final CPUTF8[][] result = new CPUTF8[counts.length][];
        int sum = 0;
        for (int i = 0; i < counts.length; i++) {
            result[i] = new CPUTF8[counts[i]];
            sum += counts[i];
        }
        final CPUTF8[] result1 = new CPUTF8[sum];
        final int[] indices = decodeBandInt(name, in, codec, sum);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/unpack200/BandSet.java`
#### Snippet
```java
        int pos = 0;
        for (int i = 0; i < counts.length; i++) {
            final int num = counts[i];
            result[i] = new CPUTF8[num];
            System.arraycopy(result1, pos, result[i], 0, num);
            pos += num;
        }
        return result;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/unpack200/BcBands.java`
#### Snippet
```java
        int bcCaseCountCount = 0;
        int bcByteCount = 0;
        int bcShortCount = 0;
        int bcLocalCount = 0;
        int bcLabelCount = 0;
        int bcIntRefCount = 0;
        int bcFloatRefCount = 0;
        int bcLongRefCount = 0;
        int bcDoubleRefCount = 0;
        int bcStringRefCount = 0;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/unpack200/ClassBands.java`
#### Snippet
```java
            fieldAccessFlags = new long[fieldFlags.length][];
            for (int i = 0; i < fieldFlags.length; i++) {
                fieldAccessFlags[i] = new long[fieldFlags[i].length];
                for (int j = 0; j < fieldFlags[i].length; j++) {
                    fieldAccessFlags[i][j] = fieldFlags[i][j] & mask;
                }
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/unpack200/ClassBands.java`
#### Snippet
```java
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                final NewAttributeBands bands = attrMap.getAttributeBands(otherLayouts[i]);
                otherAttributes[i] = bands.parseAttributes(in, counts[i]);
                final int numBackwardsCallables = otherLayouts[i].numBackwardsCallables();
                if (numBackwardsCallables > 0) {
                    final int[] backwardsCalls = new int[numBackwardsCallables];
                    System.arraycopy(classAttrCalls, backwardsCallIndex, backwardsCalls, 0, numBackwardsCallables);
                    bands.setBackwardsCalls(backwardsCalls);
                    backwardsCallIndex += numBackwardsCallables;
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/unpack200/ClassBands.java`
#### Snippet
```java
        fieldAttributes = new ArrayList[classCount][];
        for (int i = 0; i < classCount; i++) {
            fieldAttributes[i] = new ArrayList[fieldFlags[i].length];
            for (int j = 0; j < fieldFlags[i].length; j++) {
                fieldAttributes[i][j] = new ArrayList<>();
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/unpack200/ClassBands.java`
#### Snippet
```java
            for (int j = 0; j < fieldFlags[i].length; j++) {
                final long flag = fieldFlags[i][j];
                int othersAddedAtStart = 0;
                for (int k = 0; k < otherLayouts.length; k++) {
                    if (otherLayouts[k] != null && otherLayouts[k].matches(flag)) {
                        // Add the next attribute
                        if (otherLayouts[k].getIndex() < 15) {
                            fieldAttributes[i][j].add(othersAddedAtStart++, otherAttributes[k].get(0));
                        } else {
                            fieldAttributes[i][j].add(otherAttributes[k].get(0));
                        }
                        otherAttributes[k].remove(0);
                    }
                }
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/unpack200/IcBands.java`
#### Snippet
```java
        final String[] icOuterClass = new String[outerClasses];
        for (int i = 0; i < icOuterClass.length; i++) {
            if (icOuterClassInts[i] == 0) {
                icOuterClass[i] = null;
            } else {
                icOuterClass[i] = cpClass[icOuterClassInts[i] - 1];
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/ClassConstantPool.java`
#### Snippet
```java
        for (final ClassFileEntry entry : startOfPool) {
            indexCache.put(entry, Integer.valueOf(index));

            if (entry instanceof CPLong || entry instanceof CPDouble) {
                entries.add(entry); // these get 2 slots because of their size
                entries.add(entry);
                index += 2;
            } else {
                entries.add(entry);
                index += 1;
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/LocalVariableTableAttribute.java`
#### Snippet
```java
        final List<CPUTF8> nestedEntries = new ArrayList<>();
        nestedEntries.add(getAttributeName());
        for (int i = 0; i < localVariableTableLength; i++) {
            nestedEntries.add(names[i]);
            nestedEntries.add(descriptors[i]);
        }
        return nestedEntries.toArray(ClassFileEntry.NONE);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/LocalVariableTableAttribute.java`
#### Snippet
```java
final int[] unrenumberedStartPcs = Arrays.copyOf(startPcs, startPcs.length);

        // Next renumber startPcs in place
        super.renumber(byteCodeOffsets);

        // lengths are BRANCH5 encoded, not BCI-encoded.
        // In other words:
        // startPc is BCI5 startPc
        // endPc is byteCodeOffset[(index of startPc in byteCodeOffset) +
        // (encoded length)]
        // real length = endPc - startPc
        // special case if endPc is beyond end of bytecode array

        final int maxSize = codeLength;

        // Iterate through the lengths and update each in turn.
        // This is done in place in the lengths array.
        for (int index = 0; index < lengths.length; index++) {
            final int startPc = startPcs[index];
            int revisedLength = -1;
            final int encodedLength = lengths[index];

            // First get the index of the startPc in the byteCodeOffsets
            final int indexOfStartPC = unrenumberedStartPcs[index];
            // Given the index of the startPc, we can now add
            // the encodedLength to it to get the stop index.
            final int stopIndex = indexOfStartPC + encodedLength;
            if (stopIndex < 0) {
                throw new Pack200Exception("Error renumbering bytecode indexes");
            }
            // Length can either be an index into the byte code offsets, or one
            // beyond the
            // end of the byte code offsets. Need to determine which this is.
            if (stopIndex == byteCodeOffsets.size()) {
                // Pointing to one past the end of the byte code array
                revisedLength = maxSize - startPc;
            } else {
                // We're indexed into the byte code array
                final int stopValue = byteCodeOffsets.get(stopIndex).intValue();
                revisedLength = stopValue - startPc;
            }
            lengths[index] = revisedLength;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/LocalVariableTableAttribute.java`
#### Snippet
```java
        dos.writeShort(localVariableTableLength);
        for (int i = 0; i < localVariableTableLength; i++) {
            dos.writeShort(startPcs[i]);
            dos.writeShort(lengths[i]);
            dos.writeShort(nameIndexes[i]);
            dos.writeShort(descriptorIndexes[i]);
            dos.writeShort(indexes[i]);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/LookupSwitchForm.java`
#### Snippet
```java
        final int[] casePcs = new int[caseCount];
        Arrays.setAll(casePcs, i -> operandManager.nextLabel());

        final int[] labelsArray = new int[caseCount + 1];
        labelsArray[0] = defaultPc;
        System.arraycopy(casePcs, 0, labelsArray, 1, caseCount + 1 - 1);
        byteCode.setByteCodeTargets(labelsArray);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/LookupSwitchForm.java`
#### Snippet
```java
        final int[] newRewrite = new int[rewriteSize];
        int rewriteIndex = 0;

        // Fill in what we can now
        // opcode
        newRewrite[rewriteIndex++] = byteCode.getOpcode();

        // padding
        for (int index = 0; index < padLength; index++) {
            newRewrite[rewriteIndex++] = 0;
        }

        // defaultbyte
        // This gets overwritten by fixUpByteCodeTargets
        newRewrite[rewriteIndex++] = -1;
        newRewrite[rewriteIndex++] = -1;
        newRewrite[rewriteIndex++] = -1;
        newRewrite[rewriteIndex++] = -1;

        // npairs
        final int npairsIndex = rewriteIndex;
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/org/apache/commons/compress/harmony/unpack200/Archive.java`
#### Snippet
```java
            try {
                inputStream.close();
            } catch (final Exception e) {
            }
            try {
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/org/apache/commons/compress/harmony/unpack200/Archive.java`
#### Snippet
```java
            try {
                outputStream.close();
            } catch (final Exception e) {
            }
            if (logFile != null) {
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/org/apache/commons/compress/harmony/unpack200/Archive.java`
#### Snippet
```java
                try {
                    logFile.close();
                } catch (final Exception e) {
                }
            }
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/Archive.java`
#### Snippet
```java
        this.inputFileName = inputFile;
        this.outputFileName = outputFile;
        inputStream = new FileInputStream(inputFile);
        outputStream = new JarOutputStream(new BufferedOutputStream(new FileOutputStream(outputFile)));
    }
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/Archive.java`
#### Snippet
```java
        this.outputFileName = outputFile;
        inputStream = new FileInputStream(inputFile);
        outputStream = new JarOutputStream(new BufferedOutputStream(new FileOutputStream(outputFile)));
    }

```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentUtils.java`
#### Snippet
```java
     * @return integer count
     */
    protected static int countArgs(final String descriptor, final int widthOfLongsAndDoubles) {
        final int bra = descriptor.indexOf('(');
        final int ket = descriptor.indexOf(')');
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `IcTuple` may be 'static'
in `src/main/java/org/apache/commons/compress/harmony/pack200/IcBands.java`
#### Snippet
```java
public class IcBands extends BandSet {

    class IcTuple implements Comparable<IcTuple> {

        protected CPClass C; // this class
```

### InnerClassMayBeStatic
Inner class `LayoutElement` may be 'static'
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java

    }
    public abstract class LayoutElement implements AttributeLayoutElement {

        protected int getLength(final char uint_type) {
```

### InnerClassMayBeStatic
Inner class `CachedArray` may be 'static'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentConstantPoolArrayCache.java`
#### Snippet
```java
     * element values to the indices of the array which contain that value.
     */
    protected class CachedArray {
        String[] primaryArray;
        int lastKnownSize;
```

### InnerClassMayBeStatic
Inner class `BandAnalysisResults` may be 'static'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
     * Results obtained by trying different Codecs to encode a band
     */
    public class BandAnalysisResults {

        // The number of Codecs tried so far
```

### InnerClassMayBeStatic
Inner class `UnionCase` may be 'static'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
     * A Union case
     */
    public class UnionCase extends LayoutElement {

        private List<LayoutElement> body;
```

### InnerClassMayBeStatic
Inner class `Call` may be 'static'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
    }

    public class Call extends LayoutElement {

        private final int callableIndex;
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java
        }

		if (canonicalCodecsToSpecifiers.containsKey(codec)) {
			return new int[] { canonicalCodecsToSpecifiers.get(codec).intValue() };
		}
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java

		if (canonicalCodecsToSpecifiers.containsKey(codec)) {
			return new int[] { canonicalCodecsToSpecifiers.get(codec).intValue() };
		}
        if (codec instanceof BHSDCodec) {
```

### SuspiciousMethodCalls
'Map' may not contain keys of type 'Object'
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
                if (label instanceof Label) {
                    band.remove(i);
                    final Integer bytecodeIndex = labelsToOffsets.get(label);
                    final Integer renumberedOffset = Integer
                        .valueOf(bciRenumbering.get(bytecodeIndex.intValue()) - ((Integer) relative.get(i)).intValue());
```

### SuspiciousMethodCalls
'Map' may not contain keys of type 'Object'
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
                    if (label instanceof Label) {
                        band.remove(i);
                        final Integer bytecodeIndex = labelsToOffsets.get(label);
                        band.add(i, Integer.valueOf(bciRenumbering.get(bytecodeIndex.intValue())));
                    }
```

### SuspiciousMethodCalls
'Map' may not contain keys of type 'Object'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
                if (label instanceof Label) {
                    bcLabel.remove(i);
                    final Integer offset = labelsToOffsets.get(label);
                    final int relativeOffset = bcLabelRelativeOffsets.get(i);
                    bcLabel.add(i,
```

### SuspiciousMethodCalls
'Map' may not contain keys of type 'Object'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
			if (label instanceof Label) {
				list.remove(i);
				final Integer bytecodeIndex = labelsToOffsets.get(label);
				list.add(i, Integer.valueOf(bciRenumbering.get(bytecodeIndex.intValue())));
			}
```

### SuspiciousMethodCalls
'Map' may not contain keys of type 'Object'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
			if (label instanceof Label) {
				list.remove(i);
				final Integer bytecodeIndex = labelsToOffsets.get(label);
				final Integer renumberedOffset = Integer
						.valueOf(bciRenumbering.get(bytecodeIndex.intValue()) - relative.get(i).intValue());
```

### SuspiciousMethodCalls
'Map' may not contain keys of type 'Object'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
			if (label instanceof Label) {
				list.remove(i);
				final Integer bytecodeIndex = labelsToOffsets.get(label);
				final Integer renumberedOffset = Integer.valueOf(bciRenumbering.get(bytecodeIndex.intValue())
						- relative.get(i).intValue() - firstOffset.get(i).intValue());
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/compress/harmony/unpack200/IcTuple.java`
#### Snippet
```java
        }

        if (!nullSafeEquals(this.N, compareTuple.N)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/compress/harmony/unpack200/IcTuple.java`
#### Snippet
```java
            anonymous = true;
            member = false;
            if (nestedExplicitFlagSet()) {
                // Predicted class - marking as member
                member = true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/CPConstant.java`
#### Snippet
```java
        }
        final CPConstant other = (CPConstant) obj;
        if (!Objects.equals(value, other.value)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/ConstantValueAttribute.java`
#### Snippet
```java
        }
        final ConstantValueAttribute other = (ConstantValueAttribute) obj;
        if (!Objects.equals(entry, other.entry)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/CPNameAndType.java`
#### Snippet
```java
            return false;
        }
        if (!name.equals(other.name)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/CPFieldRef.java`
#### Snippet
```java
            return false;
        }
        if (!Objects.equals(nameAndType, other.nameAndType)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/InnerClassesAttribute.java`
#### Snippet
```java
        final InnerClassesAttribute other = (InnerClassesAttribute) obj;
        if (getAttributeName() == null) {
            if (other.getAttributeName() != null) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/InnerClassesAttribute.java`
#### Snippet
```java
                return false;
            }
        } else if (!getAttributeName().equals(other.getAttributeName())) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/ExceptionsAttribute.java`
#### Snippet
```java
        }
        final ExceptionsAttribute other = (ExceptionsAttribute) obj;
        if (!Arrays.equals(exceptions, other.exceptions)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/CPRef.java`
#### Snippet
```java
            return false;
        }
        if (!nameAndType.equals(other.nameAndType)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/Attribute.java`
#### Snippet
```java
        }
        final Attribute other = (Attribute) obj;
        if (!Objects.equals(attributeName, other.attributeName)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/SourceFileAttribute.java`
#### Snippet
```java
        }
        final SourceFileAttribute other = (SourceFileAttribute) obj;
        if (!Objects.equals(name, other.name)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/CPMember.java`
#### Snippet
```java
            return false;
        }
        if (!name.equals(other.name)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
            // Check for both POSIX compliant end of number characters if not using base 256
            final byte b = buffer[offset + lastIndex];
            if (b != ' ' && b != 0) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
            // As of 1.22, commons-compress does not support multivolume tar archives.
            // If/when it does, this should work as intended.
            if ((header[XSTAR_MULTIVOLUME_OFFSET] & 0x80) == 0
                    && header[XSTAR_MULTIVOLUME_OFFSET + 11] != ' ') {
                return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
            return false;
        }
        if (isInvalidXtarTime(header, XSTAR_CTIME_OFFSET, CTIMELEN_XSTAR)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveInputStream.java`
#### Snippet
```java
            return true;
        }
        if (signature[5] == 0x37) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java

        // summary is always null right now, but this may change some day
        if ((summary == null && rhs.summary != null) // NOSONAR
                || (summary != null && !summary.equals(rhs.summary))) { // NOSONAR
            return false;
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/commons/compress/utils/SeekableInMemoryByteChannel.java`
#### Snippet
```java
    private void resize(final int newLength) {
        int len = data.length;
        if (len <= 0) {
            len = 1;
        }
```

## RuleId[id=SuspiciousToArrayCall]
### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry\[\]' found
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/RuntimeVisibleorInvisibleParameterAnnotationsAttribute.java`
#### Snippet
```java
            nested.addAll(parameterAnnotation.getClassFileEntries());
        }
        return nested.toArray(ClassFileEntry.NONE);
    }

```

### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry\[\]' found
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/RuntimeVisibleorInvisibleAnnotationsAttribute.java`
#### Snippet
```java
            nested.addAll(annotation.getClassFileEntries());
        }
        return nested.toArray(ClassFileEntry.NONE);
    }

```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `logFile` to `OutputStream` is redundant
in `src/main/java/org/apache/commons/compress/harmony/unpack200/Archive.java`
#### Snippet
```java
                    final Segment segment = new Segment();
                    segment.setLogLevel(logLevel);
                    segment.setLogStream(logFile != null ? (OutputStream) logFile : (OutputStream) System.out);
                    segment.setPreRead(false);

```

### RedundantCast
Casting `System.out` to `OutputStream` is redundant
in `src/main/java/org/apache/commons/compress/harmony/unpack200/Archive.java`
#### Snippet
```java
                    final Segment segment = new Segment();
                    segment.setLogLevel(logLevel);
                    segment.setLogStream(logFile != null ? (OutputStream) logFile : (OutputStream) System.out);
                    segment.setPreRead(false);

```

### RedundantCast
Casting `globalPool.getValue(...)` to `CPString` is redundant
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/StringRefForm.java`
#### Snippet
```java
        final SegmentConstantPool globalPool = operandManager.globalConstantPool();
        ClassFileEntry[] nested = null;
        nested = new ClassFileEntry[] {((CPString) globalPool.getValue(getPoolID(), offset))};
        byteCode.setNested(nested);
        if (widened) {
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Wrong tag `ThreadSafe`
in `src/main/java/org/apache/commons/compress/utils/BoundedSeekableByteChannelInputStream.java`
#### Snippet
```java
 * InputStream that delegates requests to the underlying SeekableByteChannel, making sure that only bytes from a certain
 * range can be read.
 * @ThreadSafe
 * @since 1.21
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/utils/CRC32VerifyingInputStream.java`
#### Snippet
```java
 * A stream that verifies the CRC of the data read once the stream is
 * exhausted.
 * @NotThreadSafe
 * @since 1.6
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/utils/ChecksumVerifyingInputStream.java`
#### Snippet
```java
 * exhausted.
 *
 * @NotThreadSafe
 * @since 1.7
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/utils/CountingOutputStream.java`
#### Snippet
```java
 * Stream that tracks the number of bytes read.
 * @since 1.3
 * @NotThreadSafe
 */
public class CountingOutputStream extends FilterOutputStream {
```

### JavadocDeclaration
Wrong tag `ThreadSafe`
in `src/main/java/org/apache/commons/compress/utils/BoundedArchiveInputStream.java`
#### Snippet
```java
/**
 * NIO backed bounded input stream for reading a predefined amount of data from.
 * @ThreadSafe this base class is thread safe but implementations must not be.
 * @since 1.21
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/utils/BitInputStream.java`
#### Snippet
```java
 * Reads bits from an InputStream.
 * @since 1.10
 * @NotThreadSafe
 */
public class BitInputStream implements Closeable {
```

### JavadocDeclaration
`@param count` tag description is missing
in `src/main/java/org/apache/commons/compress/utils/BitInputStream.java`
#### Snippet
```java
    /**
     * Fills the cache up to 56 bits
     * @param count
     * @return return true, when EOF
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/compress/utils/BitInputStream.java`
#### Snippet
```java
     * @param count
     * @return return true, when EOF
     * @throws IOException
     */
    private boolean ensureCache(final int count) throws IOException {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/utils/CountingInputStream.java`
#### Snippet
```java
 * Input stream that tracks the number of bytes read.
 * @since 1.3
 * @NotThreadSafe
 */
public class CountingInputStream extends FilterInputStream {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/utils/ChecksumCalculatingInputStream.java`
#### Snippet
```java
 * Calculates the checksum of the data read.
 *
 * @NotThreadSafe
 * @since 1.14
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/utils/BoundedInputStream.java`
#### Snippet
```java
/**
 * A stream that limits reading from a wrapped stream to a given number of bytes.
 * @NotThreadSafe
 * @since 1.6
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/utils/SeekableInMemoryByteChannel.java`
#### Snippet
```java
 *
 * @since 1.13
 * @NotThreadSafe
 */
public class SeekableInMemoryByteChannel implements SeekableByteChannel {
```

### JavadocDeclaration
Wrong tag `Immutable`
in `src/main/java/org/apache/commons/compress/utils/IOUtils.java`
#### Snippet
```java
/**
 * Utility functions
 * @Immutable (has mutable data but it is write-only)
 */
public final class IOUtils {
```

### JavadocDeclaration
Wrong tag `Immutable`
in `src/main/java/org/apache/commons/compress/changes/Change.java`
#### Snippet
```java
 * Change holds meta information about a change.
 *
 * @Immutable
 */
class Change {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/changes/ChangeSet.java`
#### Snippet
```java
 * cause conflicts.
 *
 * @NotThreadSafe
 */
public final class ChangeSet {
```

### JavadocDeclaration
Wrong tag `ThreadSafe`
in `src/main/java/org/apache/commons/compress/changes/ChangeSetPerformer.java`
#### Snippet
```java
 * a new Performer must be created.
 *
 * @ThreadSafe
 * @Immutable
 */
```

### JavadocDeclaration
Wrong tag `Immutable`
in `src/main/java/org/apache/commons/compress/changes/ChangeSetPerformer.java`
#### Snippet
```java
 *
 * @ThreadSafe
 * @Immutable
 */
public class ChangeSetPerformer {
```

### JavadocDeclaration
`@param reader` tag description is missing
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
     * Read a UnionCase from the stream
     *
     * @param reader
     * @return
     * @throws IOException If an I/O error occurs.
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
     *
     * @param reader
     * @return
     * @throws IOException If an I/O error occurs.
     */
```

### JavadocDeclaration
`@param reader` tag description is missing
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
     * Read a 'body' section of the layout from the given stream
     *
     * @param reader
     * @return List of LayoutElements
     * @throws IOException If an I/O error occurs.
```

### JavadocDeclaration
`@param stream` tag description is missing
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
     * Read a number from the stream and return it
     *
     * @param stream
     * @return
     * @throws IOException If an I/O error occurs.
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
     *
     * @param stream
     * @return
     * @throws IOException If an I/O error occurs.
     */
```

### JavadocDeclaration
`@param reader` tag description is missing
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
     * ']')
     *
     * @param reader
     * @return
     * @throws IOException If an I/O error occurs.
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
     *
     * @param reader
     * @return
     * @throws IOException If an I/O error occurs.
     */
```

### JavadocDeclaration
`@param layoutElement` tag description is missing
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
     * Returns the {@link BHSDCodec} that should be used for the given layout element
     *
     * @param layoutElement
     */
    private BHSDCodec getCodec(final String layoutElement) {
```

### JavadocDeclaration
`@param reader` tag description is missing
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
     * ']')
     *
     * @param reader
     * @return
     * @throws IOException If an I/O error occurs.
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
     *
     * @param reader
     * @return
     * @throws IOException If an I/O error occurs.
     */
```

### JavadocDeclaration
`@param stream` tag description is missing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
     * Read a 'body' section of the layout from the given stream
     *
     * @param stream
     * @return List of LayoutElements
     * @throws IOException If an I/O error occurs.
```

### JavadocDeclaration
`@param stream` tag description is missing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
     * Read a number from the stream and return it
     *
     * @param stream
     * @return
     * @throws IOException If an I/O error occurs.
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
     *
     * @param stream
     * @return
     * @throws IOException If an I/O error occurs.
     */
```

### JavadocDeclaration
`@param stream` tag description is missing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
     * ']')
     *
     * @param stream
     * @return
     * @throws IOException If an I/O error occurs.
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
     *
     * @param stream
     * @return
     * @throws IOException If an I/O error occurs.
     */
```

### JavadocDeclaration
Wrong tag `Immutable`
in `src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveEntry.java`
#### Snippet
```java
 * @see <a href="https://www.freebsd.org/cgi/man.cgi?query=ar&sektion=5">ar man page</a>
 *
 * @Immutable
 */
public class ArArchiveEntry implements ArchiveEntry {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveOutputStream.java`
#### Snippet
```java
 * Implements the "ar" archive format as an output stream.
 *
 * @NotThreadSafe
 */
public class ArArchiveOutputStream extends ArchiveOutputStream {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/jar/JarArchiveInputStream.java`
#### Snippet
```java
 * Implements an input stream that can read entries from jar files.
 *
 * @NotThreadSafe
 */
public class JarArchiveInputStream extends ZipArchiveInputStream {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/jar/JarArchiveOutputStream.java`
#### Snippet
```java
 * Solaris.
 *
 * @NotThreadSafe
 */
public class JarArchiveOutputStream extends ZipArchiveOutputStream {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/arj/ArjArchiveEntry.java`
#### Snippet
```java
 * An entry in an ARJ archive.
 *
 * @NotThreadSafe
 * @since 1.6
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveInputStream.java`
#### Snippet
```java
 * Implements the "ar" archive format as an input stream.
 *
 * @NotThreadSafe
 */
public class ArArchiveInputStream extends ArchiveInputStream {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/jar/JarArchiveEntry.java`
#### Snippet
```java
/**
 *
 * @NotThreadSafe (parent is not thread-safe)
 */
public class JarArchiveEntry extends ZipArchiveEntry {
```

### JavadocDeclaration
Wrong tag `Immutable`
in `src/main/java/org/apache/commons/compress/archivers/ArchiveStreamFactory.java`
#### Snippet
```java
 * in.close();
 * </pre>
 * @Immutable provided that the deprecated method setEntryEncoding is not used.
 * @ThreadSafe even if the deprecated method setEntryEncoding is used
 */
```

### JavadocDeclaration
Wrong tag `ThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/ArchiveStreamFactory.java`
#### Snippet
```java
 * </pre>
 * @Immutable provided that the deprecated method setEntryEncoding is not used.
 * @ThreadSafe even if the deprecated method setEntryEncoding is used
 */
public class ArchiveStreamFactory implements ArchiveStreamProvider {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/arj/ArjArchiveInputStream.java`
#### Snippet
```java
 * <br>
 * <a href="http://www.fileformat.info/format/arj/corion.htm">Reference 2</a>
 * @NotThreadSafe
 * @since 1.6
 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveSparseZeroInputStream.java`
#### Snippet
```java
     *
     * @return 0
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.java`
#### Snippet
```java
 * 1.15.</p>
 *
 * @NotThreadSafe
 */
public class TarArchiveOutputStream extends ArchiveOutputStream {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/zip/X000A_NTFS.java`
#### Snippet
```java
 *
 * @since 1.11
 * @NotThreadSafe
 */
public class X000A_NTFS implements ZipExtraField {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/tar/TarFile.java`
#### Snippet
```java
     * The first number gives the number of entries in the map. Following are map entries, each one consisting of two numbers
     * giving the offset and size of the data block it describes.
     * @throws IOException
     */
    private void paxHeaders() throws IOException {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/zip/ExtraFieldUtils.java`
#### Snippet
```java
/**
 * ZipExtraField related methods
 * @NotThreadSafe because the HashMap is not synch.
 */
// CheckStyle:HideUtilityClassConstructorCheck OFF (bc)
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java`
#### Snippet
```java
 * the archive, and the read each entry as a normal input stream
 * using read().
 * @NotThreadSafe
 */
public class TarArchiveInputStream extends ArchiveInputStream {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java`
#### Snippet
```java
     * The first number gives the number of entries in the map. Following are map entries, each one consisting of two numbers
     * giving the offset and size of the data block it describes.
     * @throws IOException
     */
    private void paxHeaders() throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java`
#### Snippet
```java
     * @param n bytes of data to skip
     * @return actual bytes of data skipped
     * @throws IOException
     */
    private long skipSparse(final long n) throws IOException {
```

### JavadocDeclaration
`@param stream` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/zip/BinaryTree.java`
#### Snippet
```java
     * Reads a value from the specified bit stream.
     *
     * @param stream
     * @return the value decoded, or -1 if the end of the stream is reached
     * @throws IOException on error.
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/zip/AsiExtraField.java`
#### Snippet
```java
 * <p>Short is two bytes and Long is four bytes in big endian byte and
 * word order, device numbers are currently not supported.</p>
 * @NotThreadSafe
 *
 * <p>Since the documentation this class is based upon doesn't mention
```

### JavadocDeclaration
Wrong tag `Immutable`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipLong.java`
#### Snippet
```java
 * Utility class that represents a four byte integer with conversion
 * rules for the little endian byte order of ZIP files.
 * @Immutable
 */
public final class ZipLong implements Cloneable, Serializable {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipSplitOutputStream.java`
#### Snippet
```java
     * @param off offset of the start of data in param b
     * @param len the length of data to write
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipSplitOutputStream.java`
#### Snippet
```java
     * Create a new ZIP split segment and prepare to write to the new segment
     *
     * @throws IOException
     */
    private void openNewSplitSegment() throws IOException {
```

### JavadocDeclaration
`@param zipSplitSegmentSuffixIndex` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipSplitOutputStream.java`
#### Snippet
```java
     * so the new segment suffix should be (currentSplitSegmentIndex + 2)
     *
     * @param zipSplitSegmentSuffixIndex
     * @return
     * @throws IOException
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipSplitOutputStream.java`
#### Snippet
```java
     *
     * @param zipSplitSegmentSuffixIndex
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipSplitOutputStream.java`
#### Snippet
```java
     * @param zipSplitSegmentSuffixIndex
     * @return
     * @throws IOException
     */
    private Path createNewSplitSegmentFile(final Integer zipSplitSegmentSuffixIndex) throws IOException {
```

### JavadocDeclaration
`@param unsplittableContentSize` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipSplitOutputStream.java`
#### Snippet
```java
     * disk when splitting or spanning an archive.
     *
     * @param unsplittableContentSize
     * @throws IllegalArgumentException
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipSplitOutputStream.java`
#### Snippet
```java
     *
     * @param unsplittableContentSize
     * @throws IllegalArgumentException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipSplitOutputStream.java`
#### Snippet
```java
     * @param unsplittableContentSize
     * @throws IllegalArgumentException
     * @throws IOException
     */
    public void prepareToWriteUnsplittableContent(final long unsplittableContentSize) throws IllegalArgumentException, IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipSplitOutputStream.java`
#### Snippet
```java
     * Write the ZIP split signature (0x08074B50) to the head of the first ZIP split segment
     *
     * @throws IOException
     */
    private void writeZipSplitSignature() throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipSplitOutputStream.java`
#### Snippet
```java
     * The last ZIP split segment's suffix should be .zip
     *
     * @throws IOException
     */
    private void finish() throws IOException {
```

### JavadocDeclaration
Wrong tag `Immutable`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarUtils.java`
#### Snippet
```java
 * This class provides static utility methods to work with byte streams.
 *
 * @Immutable
 */
// CheckStyle:HideUtilityClassConstructorCheck OFF (bc)
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/tar/TarUtils.java`
#### Snippet
```java
     * @param inputStream the input stream of the tar file
     * @return the decimal number delimited by '\n', and the bytes read from input stream
     * @throws IOException
     */
    private static long[] readLineOfNumberForPax1X(final InputStream inputStream) throws IOException {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/zip/Zip64ExtendedInformationExtraField.java`
#### Snippet
```java
 *
 * @since 1.2
 * @NotThreadSafe
 */
public class Zip64ExtendedInformationExtraField implements ZipExtraField {
```

### JavadocDeclaration
Wrong tag `Immutable`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipEightByteInteger.java`
#### Snippet
```java
 * Utility class that represents an eight byte integer with conversion
 * rules for the little endian byte order of ZIP files.
 * @Immutable
 *
 * @since 1.2
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/zip/X0017_StrongEncryptionHeader.java`
#### Snippet
```java
 * information.</b></p>
 *
 * @NotThreadSafe
 * @since 1.11
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/zip/X0019_EncryptionRecipientCertificateList.java`
#### Snippet
```java
 * information.</b></p>
 *
 * @NotThreadSafe
 * @since 1.11
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/zip/X0014_X509Certificates.java`
#### Snippet
```java
 * </pre>
 *
 * @NotThreadSafe
 * @since 1.11
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/zip/UnicodePathExtraField.java`
#### Snippet
```java
 * APPNOTE.TXT, section 4.6.9</a>
 *
 * @NotThreadSafe super-class is not thread-safe
 */
public class UnicodePathExtraField extends AbstractUnicodeExtraField {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/zip/UnshrinkingInputStream.java`
#### Snippet
```java
/**
 * Input stream that decompresses ZIP method 1 (unshrinking). A variation of the LZW algorithm, with some twists.
 * @NotThreadSafe
 * @since 1.7
 */
```

### JavadocDeclaration
`@param inputStream` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/zip/UnshrinkingInputStream.java`
#### Snippet
```java
     * IOException is not actually thrown!
     *
     * @param inputStream
     */
    public UnshrinkingInputStream(final InputStream inputStream) {
```

### JavadocDeclaration
Wrong tag `Immutable`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipUtil.java`
#### Snippet
```java
/**
 * Utility class for handling DOS and Java time conversions.
 * @Immutable
 */
public abstract class ZipUtil {
```

### JavadocDeclaration
`@param headers` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
    /**
     * Update the entry using a map of pax headers.
     * @param headers
     * @since 1.15
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
     * process one pax header, using the entries extraPaxHeaders map as source for extra headers
     * used when handling entries for sparse files.
     * @param key
     * @param val
     * @since 1.15
```

### JavadocDeclaration
`@param val` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
     * used when handling entries for sparse files.
     * @param key
     * @param val
     * @since 1.15
     */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
 * </pre>
 *
 * @NotThreadSafe
 */
public class TarArchiveEntry implements ArchiveEntry, TarConstants, EntryStreamOffsets {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipSplitReadOnlySeekableByteChannel.java`
#### Snippet
```java
     *
     * @param channels channels to be validated
     * @throws IOException
     */
    private void assertSplitSignature(final List<SeekableByteChannel> channels)
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/zip/X0016_CertificateIdForCentralDirectory.java`
#### Snippet
```java
 * </pre>
 *
 * @NotThreadSafe
 * @since 1.11
 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/zip/ExplodingInputStream.java`
#### Snippet
```java
     * Reads the encoded binary trees and prepares the bit stream.
     *
     * @throws IOException
     */
    private void init() throws IOException {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/zip/UnicodeCommentExtraField.java`
#### Snippet
```java
 * APPNOTE.TXT, section 4.6.8</a>
 *
 * @NotThreadSafe super-class is not thread-safe
 */
public class UnicodeCommentExtraField extends AbstractUnicodeExtraField {
```

### JavadocDeclaration
Wrong tag `Immutable`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipShort.java`
#### Snippet
```java
 * Utility class that represents a two byte integer with conversion
 * rules for the little endian byte order of ZIP files.
 * @Immutable
 */
public final class ZipShort implements Cloneable, Serializable {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/zip/X0015_CertificateIdForFile.java`
#### Snippet
```java
 * </pre>
 *
 * @NotThreadSafe
 * @since 1.11
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/zip/GeneralPurposeBit.java`
#### Snippet
```java
 *
 * @since 1.1
 * @NotThreadSafe
 */
public final class GeneralPurposeBit implements Cloneable {
```

### JavadocDeclaration
Wrong tag `Immutable`
in `src/main/java/org/apache/commons/compress/archivers/zip/JarMarker.java`
#### Snippet
```java
 * If this extra field is added as the very first extra field of the
 * archive, Solaris will consider it an executable jar file.
 * @Immutable
 */
public final class JarMarker implements ZipExtraField {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/zip/UnparseableExtraFieldData.java`
#### Snippet
```java
 *
 * @since 1.1
 * @NotThreadSafe
 */
public final class UnparseableExtraFieldData implements ZipExtraField {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/zip/AbstractUnicodeExtraField.java`
#### Snippet
```java
/**
 * A common base class for Unicode extra information extra fields.
 * @NotThreadSafe
 */
public abstract class AbstractUnicodeExtraField implements ZipExtraField {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/zip/UnrecognizedExtraField.java`
#### Snippet
```java
 * <p>Assumes local file data and central directory entries are
 * identical - unless told the opposite.</p>
 * @NotThreadSafe
 */
public class UnrecognizedExtraField implements ZipExtraField {
```

### JavadocDeclaration
Wrong tag `Immutable`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioUtil.java`
#### Snippet
```java
 * Package private utility class for Cpio
 *
 * @Immutable
 */
class CpioUtil {
```

### JavadocDeclaration
Wrong tag `Immutable`
in `src/main/java/org/apache/commons/compress/archivers/zip/NioZipEncoding.java`
#### Snippet
```java
 * java.nio.charset.Charset Charset} to encode names.
 * <p>The methods of this class are reentrant.</p>
 * @Immutable
 */
class NioZipEncoding implements ZipEncoding, CharsetAccessor {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java
 * or write extra data not conforming to the recommendation.</p>
 *
 * @NotThreadSafe
 */
public class ZipArchiveEntry extends java.util.zip.ZipEntry implements ArchiveEntry, EntryStreamOffsets {
```

### JavadocDeclaration
`@param ino` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/dump/Dirent.java`
#### Snippet
```java
     * Constructor
     *
     * @param ino
     * @param parentIno
     * @param type
```

### JavadocDeclaration
`@param parentIno` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/dump/Dirent.java`
#### Snippet
```java
     *
     * @param ino
     * @param parentIno
     * @param type
     * @param name
```

### JavadocDeclaration
`@param type` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/dump/Dirent.java`
#### Snippet
```java
     * @param ino
     * @param parentIno
     * @param type
     * @param name
     */
```

### JavadocDeclaration
`@param name` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/dump/Dirent.java`
#### Snippet
```java
     * @param parentIno
     * @param type
     * @param name
     */
    Dirent(final int ino, final int parentIno, final int type, final String name) {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/dump/TapeInputStream.java`
#### Snippet
```java
 * the data stream.
 *
 * @NotThreadSafe
 */
class TapeInputStream extends FilterInputStream {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveEntry.java`
#### Snippet
```java
 * N.B. does not handle the cpio "tar" format
 * </p>
 * @NotThreadSafe
 * @see <a href="https://people.freebsd.org/~kientzle/libarchive/man/cpio.5.txt">https://people.freebsd.org/~kientzle/libarchive/man/cpio.5.txt</a>
 */
```

### JavadocDeclaration
`@param buffer` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveUtil.java`
#### Snippet
```java
     * Read 4-byte integer from buffer.
     *
     * @param buffer
     * @param offset
     * @return the 4-byte entry as an int
```

### JavadocDeclaration
`@param offset` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveUtil.java`
#### Snippet
```java
     *
     * @param buffer
     * @param offset
     * @return the 4-byte entry as an int
     */
```

### JavadocDeclaration
`@param buffer` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveUtil.java`
#### Snippet
```java
     * Read 8-byte integer from buffer.
     *
     * @param buffer
     * @param offset
     * @return the 8-byte entry as a long
```

### JavadocDeclaration
`@param offset` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveUtil.java`
#### Snippet
```java
     *
     * @param buffer
     * @param offset
     * @return the 8-byte entry as a long
     */
```

### JavadocDeclaration
`@param buffer` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveUtil.java`
#### Snippet
```java
     * Verifies that the buffer contains a tape segment header.
     *
     * @param buffer
     * @return Whether the buffer contains a tape segment header.
     */
```

### JavadocDeclaration
`@param buffer` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveUtil.java`
#### Snippet
```java
     * Read 2-byte integer from buffer.
     *
     * @param buffer
     * @param offset
     * @return the 2-byte entry as an int
```

### JavadocDeclaration
`@param offset` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveUtil.java`
#### Snippet
```java
     *
     * @param buffer
     * @param offset
     * @return the 2-byte entry as an int
     */
```

### JavadocDeclaration
`@param buffer` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveUtil.java`
#### Snippet
```java
     * Gets the ino associated with this buffer.
     *
     * @param buffer
     * @return the ino associated with this buffer.
     */
```

### JavadocDeclaration
Wrong tag `Immutable`
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZMethodConfiguration.java`
#### Snippet
```java
 * </table>
 *
 * @Immutable
 * @since 1.8
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java`
#### Snippet
```java
 * current default encoding of the system.
 *
 * @NotThreadSafe
 */
public class DumpArchiveInputStream extends ArchiveInputStream {
```

### JavadocDeclaration
`@param entry` tag description is missing
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java`
#### Snippet
```java
     * Get full path for specified archive entry, or null if there's a gap.
     *
     * @param entry
     * @return  full path for specified archive entry, or null if there's a gap.
     */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java`
#### Snippet
```java
 * unknown size, then Zip64 extensions will be disabled by default.</p>
 *
 * @NotThreadSafe
 */
public class ZipArchiveOutputStream extends ArchiveOutputStream {
```

### JavadocDeclaration
Wrong tag `Immutable`
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFileOptions.java`
#### Snippet
```java
 *
 * @since 1.19
 * @Immutable
 */
public class SevenZFileOptions {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
 * </pre>
 *
 * @NotThreadSafe
 */
public class DumpArchiveEntry implements ArchiveEntry {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java`
#### Snippet
```java
 *
 * @see ZipFile
 * @NotThreadSafe
 */
public class ZipArchiveInputStream extends ArchiveInputStream implements InputStreamStatistics {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZArchiveEntry.java`
#### Snippet
```java
 * An entry in a 7z archive.
 *
 * @NotThreadSafe
 * @since 1.6
 */
```

### JavadocDeclaration
Wrong tag `ThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/FileNameUtil.java`
#### Snippet
```java
/**
 * File name mapping code for the compression formats.
 * @ThreadSafe
 * @since 1.4
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/z/ZCompressorInputStream.java`
#### Snippet
```java
/**
 * Input stream that decompresses .Z files.
 * @NotThreadSafe
 * @since 1.7
 */
```

### JavadocDeclaration
Wrong tag `ThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/xz/XZUtils.java`
#### Snippet
```java
/**
 * Utility code for the xz compression format.
 * @ThreadSafe
 * @since 1.4
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/lz4/XXHash32.java`
#### Snippet
```java
 *
 * @see <a href="http://cyan4973.github.io/xxHash/">xxHash</a>
 * @NotThreadSafe
 * @since 1.14
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/lz4/BlockLZ4CompressorInputStream.java`
#### Snippet
```java
 * @see <a href="http://lz4.github.io/lz4/lz4_Block_format.html">LZ4 Block Format Description</a>
 * @since 1.14
 * @NotThreadSafe
 */
public class BlockLZ4CompressorInputStream extends AbstractLZ77CompressorInputStream {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/lzw/LZWInputStream.java`
#### Snippet
```java
 * but may be useful for third-party projects in implementing their own LZW variations.</p>
 *
 * @NotThreadSafe
 * @since 1.10
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/lz4/FramedLZ4CompressorOutputStream.java`
#### Snippet
```java
 * @see <a href="http://lz4.github.io/lz4/lz4_Frame_format.html">LZ4 Frame Format Description</a>
 * @since 1.14
 * @NotThreadSafe
 */
public class FramedLZ4CompressorOutputStream extends CompressorOutputStream {
```

### JavadocDeclaration
Wrong tag `ThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/gzip/GzipUtils.java`
#### Snippet
```java
/**
 * Utility code for the gzip compression format.
 * @ThreadSafe
 */
public class GzipUtils {
```

### JavadocDeclaration
Wrong tag `ThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/lzma/LZMAUtils.java`
#### Snippet
```java
/**
 * Utility code for the lzma compression format.
 * @ThreadSafe
 * @since 1.10
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/lz4/FramedLZ4CompressorInputStream.java`
#### Snippet
```java
 * @see <a href="http://lz4.github.io/lz4/lz4_Frame_format.html">LZ4 Frame Format Description</a>
 * @since 1.14
 * @NotThreadSafe
 */
public class FramedLZ4CompressorInputStream extends CompressorInputStream
```

### JavadocDeclaration
Wrong tag `ThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2Utils.java`
#### Snippet
```java
/**
 * Utility code for the BZip2 compression format.
 * @ThreadSafe
 * @since 1.1
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/lz4/BlockLZ4CompressorOutputStream.java`
#### Snippet
```java
 * @see <a href="http://lz4.github.io/lz4/lz4_Block_format.html">LZ4 Block Format Description</a>
 * @since 1.14
 * @NotThreadSafe
 */
public class BlockLZ4CompressorOutputStream extends CompressorOutputStream {
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/org/apache/commons/compress/compressors/gzip/GzipCompressorOutputStream.java`
#### Snippet
```java
     *
     * @param string The string to encode.
     * @return
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/compress/compressors/gzip/GzipCompressorOutputStream.java`
#### Snippet
```java
     * @param string The string to encode.
     * @return
     * @throws IOException
     */
    private byte[] getBytes(final String string) throws IOException {
```

### JavadocDeclaration
Wrong tag `Immutable`
in `src/main/java/org/apache/commons/compress/compressors/CompressorStreamFactory.java`
#### Snippet
```java
 * </pre>
 *
 * @Immutable provided that the deprecated method setDecompressConcatenated is
 *            not used.
 * @ThreadSafe even if the deprecated method setDecompressConcatenated is used
```

### JavadocDeclaration
Wrong tag `ThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/CompressorStreamFactory.java`
#### Snippet
```java
 * @Immutable provided that the deprecated method setDecompressConcatenated is
 *            not used.
 * @ThreadSafe even if the deprecated method setDecompressConcatenated is used
 */
public class CompressorStreamFactory implements CompressorStreamProvider {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/bzip2/CRC.java`
#### Snippet
```java
 * A simple class the hold and calculate the CRC for sanity checking of the
 * data.
 * @NotThreadSafe
 */
class CRC {
```

### JavadocDeclaration
Wrong tag `ThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/brotli/BrotliUtils.java`
#### Snippet
```java
/**
 * Utility code for the Brotli compression format.
 * @ThreadSafe
 * @since 1.14
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/snappy/FramedSnappyCompressorOutputStream.java`
#### Snippet
```java
 * @see <a href="https://github.com/google/snappy/blob/master/framing_format.txt">Snappy framing format description</a>
 * @since 1.14
 * @NotThreadSafe
 */
public class FramedSnappyCompressorOutputStream extends CompressorOutputStream {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/snappy/SnappyCompressorOutputStream.java`
#### Snippet
```java
 * @see <a href="https://github.com/google/snappy/blob/master/format_description.txt">Snappy compressed format description</a>
 * @since 1.14
 * @NotThreadSafe
 */
public class SnappyCompressorOutputStream extends CompressorOutputStream {
```

### JavadocDeclaration
Wrong tag `ThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/pack200/Pack200Utils.java`
#### Snippet
```java
 * Utility methods for Pack200.
 *
 * @ThreadSafe
 * @since 1.3
 */
```

### JavadocDeclaration
Wrong tag `ThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/pack200/StreamBridge.java`
#### Snippet
```java
 * OutputStream.
 *
 * @ThreadSafe
 * @since 1.3
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
 * for example.</p>
 *
 * @NotThreadSafe
 * @since 1.6
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/pack200/Pack200CompressorOutputStream.java`
#### Snippet
```java
 * An output stream that compresses using the Pack200 format.
 *
 * @NotThreadSafe
 * @since 1.3
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/deflate64/Deflate64CompressorInputStream.java`
#### Snippet
```java
 *
 * @since 1.16
 * @NotThreadSafe
 */
public class Deflate64CompressorInputStream extends CompressorInputStream implements InputStreamStatistics {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/pack200/Pack200CompressorInputStream.java`
#### Snippet
```java
 * return 0.</p>
 *
 * @NotThreadSafe
 * @since 1.3
 */
```

### JavadocDeclaration
Wrong tag `ThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/zstandard/ZstdUtils.java`
#### Snippet
```java
/**
 * Utility code for the Zstandard compression format.
 * @ThreadSafe
 * @since 1.16
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/snappy/PureJavaCrc32C.java`
#### Snippet
```java
 * <p>This file is a copy of the implementation at the Apache Hadoop project.</p>
 * @see "https://svn.apache.org/repos/asf/hadoop/common/trunk/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/util/PureJavaCrc32C.java"
 * @NotThreadSafe
 * @since 1.7
 */
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/lz77support/LZ77Compressor.java`
#### Snippet
```java
 * @see "https://tools.ietf.org/html/rfc1951#section-4"
 * @since 1.14
 * @NotThreadSafe
 */
public class LZ77Compressor {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java`
#### Snippet
```java
     * @param n the number of bits to read, must not exceed 32?
     * @return the requested bits combined into an int
     * @throws IOException
     */
    private static int bsR(final BitInputStream bin, final int n) throws IOException {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java`
#### Snippet
```java
 * An input stream that decompresses from the BZip2 format to be read as any other stream.
 *
 * @NotThreadSafe
 */
public class BZip2CompressorInputStream extends CompressorInputStream
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
 * </ul>
 *
 * @NotThreadSafe
 */
class BlockSort {
```

### JavadocDeclaration
Wrong tag `NotThreadSafe`
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java`
#### Snippet
```java
 * TODO: Update to BZip2 1.0.1
 * </p>
 * @NotThreadSafe
 */
public class BZip2CompressorOutputStream extends CompressorOutputStream
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `cardinality` may be 'final'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BHSDCodec.java`
#### Snippet
```java
    private final int s;

    private long cardinality;

    private final long smallest;
```

### FieldMayBeFinal
Field `packingLogger` may be 'final'
in `src/main/java/org/apache/commons/compress/harmony/pack200/PackingUtils.java`
#### Snippet
```java
    }

    private static PackingLogger packingLogger;

    static {
```

### FieldMayBeFinal
Field `mask` may be 'final'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/AttributeLayout.java`
#### Snippet
```java
    private final String layout;

    private long mask;

    private final String name;
```

### FieldMayBeFinal
Field `noArgByteCodes` may be 'final'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/ByteCode.java`
#### Snippet
```java
public class ByteCode extends ClassFileEntry {

    private static ByteCode[] noArgByteCodes = new ByteCode[255];

    public static ByteCode getByteCode(final int opcode) {
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00D6` can be replaced with 'Ö'
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipEncoding.java`
#### Snippet
```java
     * <pre>
     *  encode("\u20AC_for_Dollar.txt") = "%U20AC_for_Dollar.txt"
     *  encode("\u00D6lf\u00E4sser.txt") = "\231lf\204sser.txt"
     * </pre>
     *
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00E4` can be replaced with 'ä'
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipEncoding.java`
#### Snippet
```java
     * <pre>
     *  encode("\u20AC_for_Dollar.txt") = "%U20AC_for_Dollar.txt"
     *  encode("\u00D6lf\u00E4sser.txt") = "\231lf\204sser.txt"
     * </pre>
     *
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy 15 fields
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java
     * @throws ZipException on error
     */
    public ZipArchiveEntry(final ZipArchiveEntry entry) throws ZipException {
        this((java.util.zip.ZipEntry) entry);
        setInternalAttributes(entry.getInternalAttributes());
```

