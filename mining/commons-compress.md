# commons-compress 
 
# Bad smells
I found 1157 bad smells with 64 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| AssignmentToMethodParameter | 123 | false |
| ReturnNull | 93 | false |
| UnnecessaryBoxing | 84 | false |
| UnnecessaryUnboxing | 80 | false |
| UnusedAssignment | 79 | false |
| NestedAssignment | 76 | false |
| UnnecessaryFullyQualifiedName | 62 | false |
| OctalLiteral | 51 | false |
| BoundedWildcard | 36 | false |
| DataFlowIssue | 28 | false |
| SystemOutErr | 27 | false |
| ConstantValue | 26 | false |
| IntegerMultiplicationImplicitCastToLong | 25 | false |
| UtilityClassWithoutPrivateConstructor | 23 | true |
| IgnoreResultOfCall | 22 | false |
| RedundantFieldInitialization | 22 | false |
| ReplaceAssignmentWithOperatorAssignment | 19 | false |
| CommentedOutCode | 18 | false |
| ZeroLengthArrayInitialization | 18 | false |
| NonProtectedConstructorInAbstractClass | 18 | true |
| MagicConstant | 16 | false |
| MissortedModifiers | 14 | false |
| SizeReplaceableByIsEmpty | 13 | true |
| AssignmentToForLoopParameter | 11 | false |
| StaticInitializerReferencesSubClass | 10 | false |
| TrivialStringConcatenation | 10 | false |
| EqualsAndHashcode | 9 | false |
| PointlessBitwiseExpression | 8 | false |
| StringOperationCanBeSimplified | 8 | false |
| DeprecatedIsStillUsed | 8 | false |
| IndexOfReplaceableByContains | 6 | false |
| InnerClassMayBeStatic | 6 | true |
| MismatchedArrayReadWrite | 5 | false |
| PointlessArithmeticExpression | 5 | false |
| FinalStaticMethod | 5 | false |
| NegativeIntConstantInLongContext | 5 | false |
| IOResource | 5 | false |
| DuplicateBranchesInSwitch | 4 | false |
| StringBufferReplaceableByString | 4 | false |
| RedundantSuppression | 4 | false |
| DynamicRegexReplaceableByCompiledPattern | 4 | false |
| SuspiciousSystemArraycopy | 3 | false |
| NonShortCircuitBoolean | 3 | false |
| AbstractClassNeverImplemented | 3 | false |
| RedundantMethodOverride | 3 | false |
| UnnecessarySuperQualifier | 3 | false |
| ArrayEquality | 3 | false |
| MethodOverridesStaticMethod | 3 | false |
| CatchMayIgnoreException | 3 | false |
| Finalize | 2 | false |
| StringEquality | 2 | false |
| ObsoleteCollection | 2 | false |
| FinalPrivateMethod | 2 | false |
| UnnecessaryReturn | 2 | true |
| ManualMinMaxCalculation | 2 | false |
| MismatchedCollectionQueryUpdate | 2 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 2 | false |
| EmptyMethod | 2 | false |
| FieldMayBeStatic | 2 | false |
| SimplifyStreamApiCallChains | 2 | false |
| SuspiciousToArrayCall | 2 | false |
| Java8MapApi | 2 | false |
| ConditionalBreakInInfiniteLoop | 1 | false |
| EmptyStatementBody | 1 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| UnnecessaryQualifierForThis | 1 | false |
| SillyAssignment | 1 | false |
| IfStatementMissingBreakInLoop | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| NonFinalFieldOfException | 1 | false |
| TypeParameterExtendsObject | 1 | false |
| ComparatorCombinators | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| SetReplaceableByEnumSet | 1 | false |
| StringEqualsEmptyString | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| ThrowablePrintStackTrace | 1 | false |
| CopyConstructorMissesField | 1 | false |
## RuleId[ruleID=Finalize]
### Finalize
'finalize()' should not be overridden
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java`
#### Snippet
```java
     */
    @Override
    protected void finalize() throws Throwable {
        try {
            if (!closed) {
```

### Finalize
'finalize()' should not be overridden
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java`
#### Snippet
```java
     */
    @Override
    protected void finalize() throws Throwable {
        if (!closed) {
            System.err.println("Unclosed BZip2CompressorOutputStream detected, will *not* close it");
```

## RuleId[ruleID=StringEquality]
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

## RuleId[ruleID=MismatchedArrayReadWrite]
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

## RuleId[ruleID=ConditionalBreakInInfiniteLoop]
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

## RuleId[ruleID=PointlessArithmeticExpression]
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

## RuleId[ruleID=MagicConstant]
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
        off += SHORT;

        current.entry.setMethod(ZipShort.getValue(lfhBuf, off));
        off += SHORT;

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
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java`
#### Snippet
```java
     */
    private void setDefaults(final ZipArchiveEntry entry) {
        if (entry.getMethod() == -1) { // not specified
            entry.setMethod(method);
        }
```

## RuleId[ruleID=SuspiciousSystemArraycopy]
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

## RuleId[ruleID=EmptyStatementBody]
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

## RuleId[ruleID=StaticInitializerReferencesSubClass]
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
    public static final BHSDCodec DELTA5 = new BHSDCodec(5, 64, 1, 1);

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
     * BRANCH5 = (5,4,2): Used for storing branching information in bytecode.
     */
    public static final BHSDCodec BRANCH5 = new BHSDCodec(5, 4, 2);

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
     * BCI5 = (5,4): Used for storing branching information in bytecode.
     */
    public static final BHSDCodec BCI5 = new BHSDCodec(5, 4);

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

## RuleId[ruleID=CommentedOutCode]
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

## RuleId[ruleID=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java`
#### Snippet
```java
        // build the stack of elements. It's possible that we're
        // still missing an intermediate value and if so we
        final Stack<String> elements = new Stack<>();
        Dirent dirent = null;

```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java`
#### Snippet
```java
        // build the stack of elements. It's possible that we're
        // still missing an intermediate value and if so we
        final Stack<String> elements = new Stack<>();
        Dirent dirent = null;

```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `attributeActions.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/org/apache/commons/compress/harmony/pack200/PackingOptions.java`
#### Snippet
```java
        if (attributeActions != null && attributeActions.size() > 0) {
            NewAttribute newAttribute;
            for (final String name : attributeActions.keySet()) {
                final String action = attributeActions.get(name);
                boolean prototypeExists = false;
```

## RuleId[ruleID=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `OutputStreamWrapper` on 'this' is unnecessary in this context
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZOutputFile.java`
#### Snippet
```java
        @Override
        public void write(final byte[] b) throws IOException {
            OutputStreamWrapper.this.write(b, 0, b.length);
        }

```

## RuleId[ruleID=DuplicateBranchesInSwitch]
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

## RuleId[ruleID=FinalPrivateMethod]
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

## RuleId[ruleID=OctalLiteral]
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
Octal integer `0001000`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** On directories, restricted deletion flag. */
    int C_ISVTX  = 0001000;


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
Octal integer `0010000`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Defines a pipe */
    int C_ISFIFO = 0010000;


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
Octal integer `0002000`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Set group ID */
    int C_ISGID  = 0002000;

    /** On directories, restricted deletion flag. */
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
Octal integer `0000002`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Permits others to write to the file */
    int C_IWOTH  = 0000002;

    /** Permits others to execute the file or to search the directory */
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
Octal integer `0170000`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Mask for all file type bits. */
    int S_IFMT   = 0170000;

    /** Defines a socket */
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
Octal integer `0140000`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Defines a socket */
    int C_ISSOCK = 0140000;

    /** Defines a symbolic link */
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
Octal integer `0020000`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Defines a character device */
    int C_ISCHR  = 0020000;

    /** Defines a pipe */
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
Octal integer `0000040`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Permits a file's group to read the file */
    int C_IRGRP  = 0000040;

    /** Permits a file's group to write to the file */
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
Octal integer `0000200`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Permits the owner of a file to write to the file */
    int C_IWUSR  = 0000200;

    /** Permits the owner of a file to execute the file or to search the directory */
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
Octal integer `0040000`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioConstants.java`
#### Snippet
```java

    /** Defines a directory */
    int C_ISDIR  = 0040000;

    /** Defines a character device */
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
Octal integer `040755`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java

    /** Default permissions bits for directories */
    public static final int DEFAULT_DIR_MODE = 040755;

    /** Default permissions bits for files */
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

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`classes.size() > 0` can be replaced with '!classes.isEmpty()'
in `src/main/java/org/apache/commons/compress/harmony/pack200/CPSignature.java`
#### Snippet
```java
            return classes.size() - ((CPSignature) arg0).classes.size();
        }
        if (classes.size() > 0) {
            for (int i = classes.size() - 1; i >= 0; i--) {
                final CPClass cpClass = classes.get(i);
```

### SizeReplaceableByIsEmpty
`band_headers.size() > 0` can be replaced with '!band_headers.isEmpty()'
in `src/main/java/org/apache/commons/compress/harmony/pack200/SegmentHeader.java`
#### Snippet
```java
        writeCpCounts(out);
        writeClassCounts(out);
        if (band_headers.size() > 0) {
            out.write(encodeScalar(band_headers.toArray(), Codec.BYTE1));
        }
```

### SizeReplaceableByIsEmpty
`band_headers.size() > 0` can be replaced with '!band_headers.isEmpty()'
in `src/main/java/org/apache/commons/compress/harmony/pack200/SegmentHeader.java`
#### Snippet
```java

    private void calculateArchiveOptions() {
        if (attribute_definition_count > 0 || band_headers.size() > 0) {
            archive_options |= 1;
        }
```

### SizeReplaceableByIsEmpty
`classes.size() > 0` can be replaced with '!classes.isEmpty()'
in `src/main/java/org/apache/commons/compress/harmony/pack200/Archive.java`
#### Snippet
```java
        // Change for Apache Commons Compress based on Apache Harmony.
        // if (classes.size() > 0 && files.size() > 0) {
        if (classes.size() > 0 || files.size() > 0) {
            segmentUnitList.add(new SegmentUnit(classes, files));
        }
```

### SizeReplaceableByIsEmpty
`files.size() > 0` can be replaced with '!files.isEmpty()'
in `src/main/java/org/apache/commons/compress/harmony/pack200/Archive.java`
#### Snippet
```java
        // Change for Apache Commons Compress based on Apache Harmony.
        // if (classes.size() > 0 && files.size() > 0) {
        if (classes.size() > 0 || files.size() > 0) {
            segmentUnitList.add(new SegmentUnit(classes, files));
        }
```

### SizeReplaceableByIsEmpty
`attributeActions.size() > 0` can be replaced with '!attributeActions.isEmpty()'
in `src/main/java/org/apache/commons/compress/harmony/pack200/PackingOptions.java`
#### Snippet
```java

    private void addOrUpdateAttributeActions(final List<Attribute> prototypes, final Map<String, String> attributeActions, final int tag) {
        if (attributeActions != null && attributeActions.size() > 0) {
            NewAttribute newAttribute;
            for (final String name : attributeActions.keySet()) {
```

### SizeReplaceableByIsEmpty
`bcCodes.size() > 0` can be replaced with '!bcCodes.isEmpty()'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
        case 184: // invokestatic
            boolean aload_0 = false;
            if (bcCodes.size() > 0 && (bcCodes.get(bcCodes.size() - 1)) == (ALOAD_0)) {
                bcCodes.remove(bcCodes.size() - 1);
                aload_0 = true;
```

### SizeReplaceableByIsEmpty
`bcCodes.size() > 0` can be replaced with '!bcCodes.isEmpty()'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
        updateRenumbering();
        boolean aload_0 = false;
        if (bcCodes.size() > 0 && (bcCodes.get(bcCodes.size() - 1)) == ALOAD_0) {
            bcCodes.remove(bcCodes.size() - 1);
            aload_0 = true;
```

### SizeReplaceableByIsEmpty
`name.length() == 0` can be replaced with 'name.isEmpty()'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/AttributeLayout.java`
#### Snippet
```java
            throw new Pack200Exception("Cannot have a null layout");
        }
        if (name == null || name.length() == 0) {
            throw new Pack200Exception("Cannot have an unnamed layout");
        }
```

### SizeReplaceableByIsEmpty
`type_RS.size() > 0` can be replaced with '!type_RS.isEmpty()'
in `src/main/java/org/apache/commons/compress/harmony/pack200/MetadataBandGroup.java`
#### Snippet
```java
     */
    public boolean hasContent() {
        return type_RS.size() > 0;
    }

```

### SizeReplaceableByIsEmpty
`tuplesToScan.size() > 0` can be replaced with '!tuplesToScan.isEmpty()'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/IcBands.java`
#### Snippet
```java
        final List<IcTuple> tuplesToAdd = new ArrayList<>();

        while (tuplesToScan.size() > 0) {

            tuplesToAdd.clear();
```

### SizeReplaceableByIsEmpty
`parents.size() > 0` can be replaced with '!parents.isEmpty()'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/ClassConstantPool.java`
#### Snippet
```java
        // while there any parents to traverse and at least one change in target
        // storage was made
        while (added || parents.size() > 0) {

            children.clear();
```

### SizeReplaceableByIsEmpty
`codeFlags.size() > 0` can be replaced with '!codeFlags.isEmpty()'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
			tempMethodRIPA = null;
		}
		if (codeFlags.size() > 0) {
			final long latestCodeFlag = codeFlags.get(codeFlags.size() - 1).longValue();
			final int latestLocalVariableTableN = codeLocalVariableTableN.get(codeLocalVariableTableN.size() - 1);
```

## RuleId[ruleID=StringBufferReplaceableByString]
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

## RuleId[ruleID=UnnecessaryReturn]
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

## RuleId[ruleID=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `wasModified |= collection.add(iterator.next())`
in `src/main/java/org/apache/commons/compress/utils/Iterators.java`
#### Snippet
```java
        boolean wasModified = false;
        while (iterator.hasNext()) {
            wasModified |= collection.add(iterator.next());
        }
        return wasModified;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasAntiItems |= isAnti`
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZOutputFile.java`
#### Snippet
```java
                final boolean isAnti = file1.isAntiItem();
                antiItems.set(antiItemCounter++, isAnti);
                hasAntiItems |= isAnti;
            }
        }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasEmptyFiles |= !isDir`
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZOutputFile.java`
#### Snippet
```java
                final boolean isDir = file1.isDirectory();
                emptyFiles.set(emptyStreamCounter++, !isDir);
                hasEmptyFiles |= !isDir;
            }
        }
```

## RuleId[ruleID=ManualMinMaxCalculation]
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

## RuleId[ruleID=FinalStaticMethod]
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
     * @return the ino associated with this buffer.
     */
    public static final int getIno(final byte[] buffer) {
        return convert32(buffer, 20);
    }
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
     * @return Whether the buffer contains a tape segment header.
     */
    public static final boolean verify(final byte[] buffer) {
        // verify magic. for now only accept NFS_MAGIC.
        final int magic = convert32(buffer, 24);
```

## RuleId[ruleID=TrivialStringConcatenation]
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

## RuleId[ruleID=SillyAssignment]
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

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Change`
in `src/main/java/org/apache/commons/compress/changes/ChangeSetPerformer.java`
#### Snippet
```java
     * @return true, if this entry has an deletion change later, false otherwise
     */
    private boolean isDeletedLater(final Set<Change> workingSet, final ArchiveEntry entry) {
        final String source = entry.getName();

```

### BoundedWildcard
Can generalize to `? extends PackingFile`
in `src/main/java/org/apache/commons/compress/harmony/pack200/Archive.java`
#### Snippet
```java
    }

    private List<SegmentUnit> splitIntoSegments(final List<PackingFile> packingFileList) {
        final List<SegmentUnit> segmentUnitList = new ArrayList<>();
        List<Pack200ClassReader> classes = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super Pack200ClassReader`
in `src/main/java/org/apache/commons/compress/harmony/pack200/Archive.java`
#### Snippet
```java
    }

	private boolean addJarEntry(final PackingFile packingFile, final List<Pack200ClassReader> javaClasses, final List<PackingFile> files) {
        final long segmentLimit = options.getSegmentLimit();
        if (segmentLimit != -1 && segmentLimit != 0) {
```

### BoundedWildcard
Can generalize to `? super PackingFile`
in `src/main/java/org/apache/commons/compress/harmony/pack200/Archive.java`
#### Snippet
```java
    }

	private boolean addJarEntry(final PackingFile packingFile, final List<Pack200ClassReader> javaClasses, final List<PackingFile> files) {
        final long segmentLimit = options.getSegmentLimit();
        if (segmentLimit != -1 && segmentLimit != 0) {
```

### BoundedWildcard
Can generalize to `? super Attribute`
in `src/main/java/org/apache/commons/compress/harmony/pack200/PackingOptions.java`
#### Snippet
```java
    }

    private void addOrUpdateAttributeActions(final List<Attribute> prototypes, final Map<String, String> attributeActions, final int tag) {
        if (attributeActions != null && attributeActions.size() > 0) {
            NewAttribute newAttribute;
```

### BoundedWildcard
Can generalize to `? extends CPMethodOrField`
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
    }

    private void writeCpMethodOrField(final Set<CPMethodOrField> cp, final OutputStream out, final String name)
        throws IOException, Pack200Exception {
        PackingUtils.log("Writing " + cp.size() + " Method and Field entries...");
```

### BoundedWildcard
Can generalize to `? super Character`
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
    }

    private void addCharacters(final List<Character> chars, final char[] charArray) {
        for (final char element : charArray) {
            chars.add(Character.valueOf(element));
```

### BoundedWildcard
Can generalize to `? extends CPUTF8`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/MetadataBandGroup.java`
#### Snippet
```java
    }

    private Annotation getAnnotation(final CPUTF8 type, final int pairCount, final Iterator<CPUTF8> namesIterator) {
        final CPUTF8[] elementNames = new CPUTF8[pairCount];
        final ElementValue[] elementValues = new ElementValue[pairCount];
```

### BoundedWildcard
Can generalize to `? extends CPMethodOrField`
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
    }

    private List<Integer> getIndexInClassForConstructor(final List<CPMethodOrField> cPMethodList) {
        return cPMethodList.stream().collect(Collectors.mapping(CPMethodOrField::getIndexInClassForConstructor, Collectors.toList()));
    }
```

### BoundedWildcard
Can generalize to `? extends CPMethodOrField`
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
    }

    private List<Integer> getIndexInClass(final List<CPMethodOrField> cPMethodOrFieldList) {
        return cPMethodOrFieldList.stream().collect(Collectors.mapping(CPMethodOrField::getIndexInClass, Collectors.toList()));
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java

    // helper method for annotation visitors
    private void addValueAndTag(final Object value, final List<String> tags, final List<Object> values) {
        if (value instanceof Integer) {
            tags.add("I");
```

### BoundedWildcard
Can generalize to `? extends AttributeLayoutElement`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
     * @return attribute at the given index.
     */
    private Attribute getOneAttribute(final int index, final List<AttributeLayoutElement> elements) {
        final NewAttribute attribute = new NewAttribute(segment.getCpBands().cpUTF8Value(attributeLayout.getName()),
            attributeLayout.getIndex());
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/compress/archivers/ArchiveStreamFactory.java`
#### Snippet
```java
    }

    static void putAll(final Set<String> names, final ArchiveStreamProvider provider, final TreeMap<String, ArchiveStreamProvider> map) {
        names.forEach(name -> map.put(toKey(name), provider));
    }
```

### BoundedWildcard
Can generalize to `? super ArchiveStreamProvider`
in `src/main/java/org/apache/commons/compress/archivers/ArchiveStreamFactory.java`
#### Snippet
```java
    }

    static void putAll(final Set<String> names, final ArchiveStreamProvider provider, final TreeMap<String, ArchiveStreamProvider> map) {
        names.forEach(name -> map.put(toKey(name), provider));
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.java`
#### Snippet
```java
    }

    private void addInstantPaxHeader(final Map<String, String> paxHeaders,
        final String header, final long seconds, final int nanos) {
        final BigDecimal bdSeconds = BigDecimal.valueOf(seconds);
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.java`
#### Snippet
```java
    }

    private void addInstantPaxHeader(final Map<String, String> paxHeaders,
        final String header, final long seconds, final int nanos) {
        final BigDecimal bdSeconds = BigDecimal.valueOf(seconds);
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.java`
#### Snippet
```java
    }

    private void addPaxHeaderForBigNumber(final Map<String, String> paxHeaders,
        final String header, final long value,
        final long maxValue) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.java`
#### Snippet
```java
    }

    private void addPaxHeaderForBigNumber(final Map<String, String> paxHeaders,
        final String header, final long value,
        final long maxValue) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.java`
#### Snippet
```java
     */
    private boolean handleLongName(final TarArchiveEntry entry, final String name,
        final Map<String, String> paxHeaders,
        final String paxHeaderName, final byte linkType, final String fieldName)
        throws IOException {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.java`
#### Snippet
```java
     */
    private boolean handleLongName(final TarArchiveEntry entry, final String name,
        final Map<String, String> paxHeaders,
        final String paxHeaderName, final byte linkType, final String fieldName)
        throws IOException {
```

### BoundedWildcard
Can generalize to `? super Integer`
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
	}

	private void renumberBci(final List<Integer> list, final IntList bciRenumbering,
			final Map<Label, Integer> labelsToOffsets) {
		for (int i = list.size() - 1; i >= 0; i--) {
```

### BoundedWildcard
Can generalize to `? super Integer`
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
	}

	private void renumberOffsetBci(final List<Integer> relative, final List<Integer> list, final IntList bciRenumbering,
			final Map<Label, Integer> labelsToOffsets) {
		for (int i = list.size() - 1; i >= 0; i--) {
```

### BoundedWildcard
Can generalize to `? extends ZipExtraField`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java
    }

    private ZipExtraField findUnparseable(final List<ZipExtraField> fs) {
        return fs.stream().filter(UnparseableExtraFieldData.class::isInstance).findFirst().orElse(null);
    }
```

### BoundedWildcard
Can generalize to `? extends ZipExtraField`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java
    }

    private ZipExtraField findMatching(final ZipShort headerId, final List<ZipExtraField> fs) {
        return fs.stream().filter(f -> headerId.equals(f.getHeaderId())).findFirst().orElse(null);
    }
```

### BoundedWildcard
Can generalize to `? extends Path`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipSplitReadOnlySeekableByteChannel.java`
#### Snippet
```java
     * @since 1.22
     */
    public static SeekableByteChannel forPaths(final Path lastSegmentPath, final Iterable<Path> paths) throws IOException {
        Objects.requireNonNull(paths, "paths");
        Objects.requireNonNull(lastSegmentPath, "lastSegmentPath");
```

### BoundedWildcard
Can generalize to `? extends File`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipSplitReadOnlySeekableByteChannel.java`
#### Snippet
```java
     * @throws NullPointerException if files or lastSegmentFile is null
     */
    public static SeekableByteChannel forFiles(final File lastSegmentFile, final Iterable<File> files) throws IOException {
        Objects.requireNonNull(files, "files");
        Objects.requireNonNull(lastSegmentFile, "lastSegmentFile");
```

### BoundedWildcard
Can generalize to `? extends SeekableByteChannel`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipSplitReadOnlySeekableByteChannel.java`
#### Snippet
```java
     */
    public static SeekableByteChannel forOrderedSeekableByteChannels(final SeekableByteChannel lastSegmentChannel,
        final Iterable<SeekableByteChannel> channels) throws IOException {
        Objects.requireNonNull(channels, "channels");
        Objects.requireNonNull(lastSegmentChannel, "lastSegmentChannel");
```

### BoundedWildcard
Can generalize to `? extends SeekableByteChannel`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipSplitReadOnlySeekableByteChannel.java`
#### Snippet
```java
     * @throws IOException
     */
    private void assertSplitSignature(final List<SeekableByteChannel> channels)
        throws IOException {
        final SeekableByteChannel channel = channels.get(0);
```

### BoundedWildcard
Can generalize to `? super ZipArchiveEntry`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java`
#### Snippet
```java
     */
    private void
        readCentralDirectoryEntry(final Map<ZipArchiveEntry, NameAndComment> noUTF8Flag)
        throws IOException {
        cfhBbuf.rewind();
```

### BoundedWildcard
Can generalize to `? super NameAndComment`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java`
#### Snippet
```java
     */
    private void
        readCentralDirectoryEntry(final Map<ZipArchiveEntry, NameAndComment> noUTF8Flag)
        throws IOException {
        cfhBbuf.rewind();
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZOutputFile.java`
#### Snippet
```java
        }
    }
    private static <T> Iterable<T> reverse(final Iterable<T> i) {
        final LinkedList<T> l = new LinkedList<>();
        for (final T t : i) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/compress/compressors/CompressorStreamFactory.java`
#### Snippet
```java
    }

    static void putAll(final Set<String> names, final CompressorStreamProvider provider, final TreeMap<String, CompressorStreamProvider> map) {
        names.forEach(name -> map.put(toKey(name), provider));
    }
```

### BoundedWildcard
Can generalize to `? super CompressorStreamProvider`
in `src/main/java/org/apache/commons/compress/compressors/CompressorStreamFactory.java`
#### Snippet
```java
    }

    static void putAll(final Set<String> names, final CompressorStreamProvider provider, final TreeMap<String, CompressorStreamProvider> map) {
        names.forEach(name -> map.put(toKey(name), provider));
    }
```

### BoundedWildcard
Can generalize to `? super Integer`
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
    }

    private void checkEntryIsInitialized(final Map<Integer, SevenZArchiveEntry> archiveEntries, final int index) {
        if (archiveEntries.get(index) == null) {
            archiveEntries.put(index, new SevenZArchiveEntry());
```

### BoundedWildcard
Can generalize to `? super SevenZArchiveEntry`
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
    }

    private void checkEntryIsInitialized(final Map<Integer, SevenZArchiveEntry> archiveEntries, final int index) {
        if (archiveEntries.get(index) == null) {
            archiveEntries.put(index, new SevenZArchiveEntry());
```

### BoundedWildcard
Can generalize to `? super TarArchiveStructSparse`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarUtils.java`
#### Snippet
```java
     */
    protected static Map<String, String> parsePaxHeaders(final InputStream inputStream,
            final List<TarArchiveStructSparse> sparseHeaders, final Map<String, String> globalPaxHeaders,
            final long headerSize) throws IOException {
        final Map<String, String> headers = new HashMap<>(globalPaxHeaders);
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `Pack200` has no concrete subclass
in `src/main/java/org/apache/commons/compress/java/util/jar/Pack200.java`
#### Snippet
```java
 * Class factory for {@link Pack200.Packer} and {@link Pack200.Unpacker}.
 */
public abstract class Pack200 {

    /**
```

### AbstractClassNeverImplemented
Abstract class `ZipUtil` has no concrete subclass
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipUtil.java`
#### Snippet
```java
 * @Immutable
 */
public abstract class ZipUtil {

    /**
```

### AbstractClassNeverImplemented
Abstract class `BZip2Utils` has no concrete subclass
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2Utils.java`
#### Snippet
```java
 * @since 1.1
 */
public abstract class BZip2Utils {

    private static final FileNameUtil fileNameUtil;
```

## RuleId[ruleID=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `static public`
in `src/main/java/org/apache/commons/compress/harmony/archive/internal/nls/Messages.java`
#### Snippet
```java
     * @return String the message for that key in the system message bundle.
     */
    static public String getString(final String msg, final Object arg1, final Object arg2) {
        return getString(msg, new Object[] {arg1, arg2});
    }
```

### MissortedModifiers
Missorted modifiers `static private`
in `src/main/java/org/apache/commons/compress/harmony/archive/internal/nls/Messages.java`
#### Snippet
```java

    // ResourceBundle holding the system messages.
    static private ResourceBundle bundle = null;

    static {
```

### MissortedModifiers
Missorted modifiers `static public`
in `src/main/java/org/apache/commons/compress/harmony/archive/internal/nls/Messages.java`
#### Snippet
```java
     * @return String the message for that key in the system message bundle.
     */
    static public String getString(final String msg, final Object arg) {
        return getString(msg, new Object[] {arg});
    }
```

### MissortedModifiers
Missorted modifiers `static public`
in `src/main/java/org/apache/commons/compress/harmony/archive/internal/nls/Messages.java`
#### Snippet
```java
     * @return String the message for that key in the system message bundle.
     */
    static public String getString(final String msg, final Object[] args) {
        String format = msg;

```

### MissortedModifiers
Missorted modifiers `static public`
in `src/main/java/org/apache/commons/compress/harmony/archive/internal/nls/Messages.java`
#### Snippet
```java
     * @return The ResourceBundle.
     */
    static public ResourceBundle setLocale(final Locale locale, final String resource) {
        try {
            // VM.bootCallerClassLoader() returns null
```

### MissortedModifiers
Missorted modifiers `static public`
in `src/main/java/org/apache/commons/compress/harmony/archive/internal/nls/Messages.java`
#### Snippet
```java
     * @return String the message for that key in the system message bundle.
     */
    static public String getString(final String msg, final char arg) {
        return getString(msg, new Object[] {String.valueOf(arg)});
    }
```

### MissortedModifiers
Missorted modifiers `static public`
in `src/main/java/org/apache/commons/compress/harmony/archive/internal/nls/Messages.java`
#### Snippet
```java
     * @return String the message for that key in the system message bundle.
     */
    static public String getString(final String msg, final int arg) {
        return getString(msg, new Object[] {Integer.toString(arg)});
    }
```

### MissortedModifiers
Missorted modifiers `static public`
in `src/main/java/org/apache/commons/compress/harmony/archive/internal/nls/Messages.java`
#### Snippet
```java
     * @return String the message for that key in the system message bundle.
     */
    static public String getString(final String msg) {
        if (bundle == null) {
            return msg;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/NewAttribute.java`
#### Snippet
```java
    }
    // Bytecode-related value (either a bytecode index or a length)
    private static abstract class BCValue {

        int actualValue;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipSplitOutputStream.java`
#### Snippet
```java
     */
    private final static long ZIP_SEGMENT_MIN_SIZE = 64 * 1024L;
    private final static long ZIP_SEGMENT_MAX_SIZE = 4294967295L;
    private OutputStream outputStream;
    private Path zipFile;
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipSplitOutputStream.java`
#### Snippet
```java
     * Maximum PKSFX segment size = 2,147,483,647 bytes
     */
    private final static long ZIP_SEGMENT_MIN_SIZE = 64 * 1024L;
    private final static long ZIP_SEGMENT_MAX_SIZE = 4294967295L;
    private OutputStream outputStream;
```

### MissortedModifiers
Missorted modifiers `transient final`
in `src/main/java/org/apache/commons/compress/archivers/zip/UnsupportedZipFeatureException.java`
#### Snippet
```java
    private final Feature reason;

    private transient final ZipArchiveEntry entry;

    /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/org/apache/commons/compress/compressors/lz4/BlockLZ4CompressorOutputStream.java`
#### Snippet
```java
public class BlockLZ4CompressorOutputStream extends CompressorOutputStream {

    final static class Pair {
        private static int lengths(final int litLength, final int brLength) {
            final int l = Math.min(litLength, 15);
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `src/main/java/org/apache/commons/compress/compressors/lz77support/LZ77Compressor.java`
#### Snippet
```java
     * future releases.</p>
     */
    public static abstract class Block {
        /** Enumeration of the block types the compressor may emit. */
        public enum BlockType {
```

## RuleId[ruleID=NegativeIntConstantInLongContext]
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
in `src/main/java/org/apache/commons/compress/compressors/lz4/FramedLZ4CompressorInputStream.java`
#### Snippet
```java
        maybeFinishCurrentBlock();
        final long len = ByteUtils.fromLittleEndian(supplier, 4);
        final boolean uncompressed = (len & UNCOMPRESSED_FLAG_MASK) != 0;
        final int realLen = (int) (len & (~UNCOMPRESSED_FLAG_MASK));
        if (realLen == 0) {
```

## RuleId[ruleID=IfStatementMissingBreakInLoop]
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

## RuleId[ruleID=IgnoreResultOfCall]
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

## RuleId[ruleID=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/BHSDCodec.java`
#### Snippet
```java
        final byte[] bytes = new byte[byteList.size()];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = byteList.get(i).byteValue();
        }
        return bytes;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java

		if (canonicalCodecsToSpecifiers.containsKey(codec)) {
			return new int[] { canonicalCodecsToSpecifiers.get(codec).intValue() };
		}
        if (codec instanceof BHSDCodec) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
				mOrF.setIndexInClass(0);
			} else {
				final int theIndex = index.intValue();
				mOrF.setIndexInClass(theIndex);
				classNameToIndex.put(cpClassName, Integer.valueOf(theIndex + 1));
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
				mOrF.setIndexInClass(0);
			} else {
				final int theIndex = index.intValue();
				mOrF.setIndexInClass(theIndex);
				classNameToIndex.put(cpClassName, Integer.valueOf(theIndex + 1));
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
					mOrF.setIndexInClassForConstructor(0);
				} else {
					final int theIndex = constructorIndex.intValue();
					mOrF.setIndexInClassForConstructor(theIndex);
					classNameToConstructorIndex.put(cpClassName, Integer.valueOf(theIndex + 1));
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
        final int[] cpUtf8BigSuffix = new int[bigSuffix.size()];
        final int[][] cpUtf8BigChars = new int[bigSuffix.size()][];
        Arrays.setAll(cpUtf8Chars, i -> chars.get(i).charValue());
        for (int i = 0; i < cpUtf8BigSuffix.length; i++) {
            final int numBigChars = bigSuffix.get(i).intValue();
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
        Arrays.setAll(cpUtf8Chars, i -> chars.get(i).charValue());
        for (int i = 0; i < cpUtf8BigSuffix.length; i++) {
            final int numBigChars = bigSuffix.get(i).intValue();
            cpUtf8BigSuffix[i] = numBigChars;
            cpUtf8BigChars[i] = new int[numBigChars];
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
            cpUtf8BigSuffix[i] = numBigChars;
            cpUtf8BigChars[i] = new int[numBigChars];
            Arrays.setAll(cpUtf8BigChars[i], j -> bigChars.remove(0).charValue());
        }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
        if (constant == null) {
            if (value instanceof Integer) {
                constant = new CPInt(((Integer) value).intValue());
                cp_Int.add((CPInt) constant);
            } else if (value instanceof Long) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
                cp_Int.add((CPInt) constant);
            } else if (value instanceof Long) {
                constant = new CPLong(((Long) value).longValue());
                cp_Long.add((CPLong) constant);
            } else if (value instanceof Float) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
                cp_Long.add((CPLong) constant);
            } else if (value instanceof Float) {
                constant = new CPFloat(((Float) value).floatValue());
                cp_Float.add((CPFloat) constant);
            } else if (value instanceof Double) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
                cp_Float.add((CPFloat) constant);
            } else if (value instanceof Double) {
                constant = new CPDouble(((Double) value).doubleValue());
                cp_Double.add((CPDouble) constant);
            } else if (value instanceof String) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
                    final int relativeOffset = bcLabelRelativeOffsets.get(i);
                    bcLabel.add(i,
                        Integer.valueOf(bciRenumbering.get(offset.intValue()) - bciRenumbering.get(relativeOffset)));
                }
            }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
                public void visit(final String name, final Object value) {
                    final Integer numPairs = nestPairN.remove(nestPairN.size() - 1);
                    nestPairN.add(Integer.valueOf(numPairs.intValue() + 1));
                    nestNameRU.add(name);
                    addValueAndTag(value, tags, values);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
        public void visit(String name, final Object value) {
            final Integer numCases = caseArrayN.remove(indexInCaseArrayN);
            caseArrayN.add(indexInCaseArrayN, Integer.valueOf(numCases.intValue() + 1));
            if (name == null) {
                name = "";
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
        } else if (value instanceof Character) {
            tags.add("C");
            values.add(Integer.valueOf(((Character) value).charValue()));
        } else if (value instanceof Short) {
            tags.add("S");
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
        } else if (value instanceof Boolean) {
            tags.add("Z");
            values.add(Integer.valueOf(((Boolean) value).booleanValue() ? 1 : 0));
        } else if (value instanceof String) {
            tags.add("s");
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
        public void visitEnum(final String name, final String desc, final String value) {
            final Integer numCases = caseArrayN.remove(caseArrayN.size() - 1);
            caseArrayN.add(Integer.valueOf(numCases.intValue() + 1));
            tags.add("e");
            values.add(desc);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
                public void visitEnum(final String name, final String desc, final String value) {
                    final Integer numPairs = nestPairN.remove(nestPairN.size() - 1);
                    nestPairN.add(Integer.valueOf(numPairs.intValue() + 1));
                    tags.add("e");
                    nestNameRU.add(name);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
        final List<Integer> favored = new ArrayList<>();
        distinctValues.forEach((k, v) -> {
            if (v.intValue() > 2 || distinctValues.size() < 256) { // TODO: tweak
                favored.add(k);
            }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
                unfavoured.add(band[i]);
            } else {
                tokens[i] = favouredIndex.intValue() + 1;
            }
        }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
                        count = one;
                    } else {
                        count = Integer.valueOf(count.intValue() + 1);
                    }
                    distinctValues.put(value, count);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/MetadataBandGroup.java`
#### Snippet
```java
		}
		for (final Integer element : caseArrayN) {
			final int arraySize = element.intValue();
			casearray_N.add(arraySize);
			numBackwardsCalls += arraySize;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/MetadataBandGroup.java`
#### Snippet
```java
		nestNameRU.forEach(name -> nestname_RU.add(cpBands.getCPUtf8(name)));
		for (final Integer numPairs : nestPairN) {
			nestpair_N.add(numPairs.intValue());
			numBackwardsCalls += numPairs.intValue();
		}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/MetadataBandGroup.java`
#### Snippet
```java
		for (final Integer numPairs : nestPairN) {
			nestpair_N.add(numPairs.intValue());
			numBackwardsCalls += numPairs.intValue();
		}
	}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/MetadataBandGroup.java`
#### Snippet
```java
		}
		for (final Integer element : caseArrayN) {
			final int arraySize = element.intValue();
			casearray_N.add(arraySize);
			numBackwardsCalls += arraySize;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/MetadataBandGroup.java`
#### Snippet
```java
		nestNameRU.forEach(element -> nestname_RU.add(cpBands.getCPUtf8(element)));
		for (final Integer numPairs : nestPairN) {
			nestpair_N.add(numPairs.intValue());
			numBackwardsCalls += numPairs.intValue();
		}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/MetadataBandGroup.java`
#### Snippet
```java
		for (final Integer numPairs : nestPairN) {
			nestpair_N.add(numPairs.intValue());
			numBackwardsCalls += numPairs.intValue();
		}
	}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
                    final Integer bytecodeIndex = labelsToOffsets.get(label);
                    final Integer renumberedOffset = Integer
                        .valueOf(bciRenumbering.get(bytecodeIndex.intValue()) - ((Integer) relative.get(i)).intValue());
                    band.add(i, renumberedOffset);
                }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
                    final Integer bytecodeIndex = labelsToOffsets.get(label);
                    final Integer renumberedOffset = Integer
                        .valueOf(bciRenumbering.get(bytecodeIndex.intValue()) - ((Integer) relative.get(i)).intValue());
                    band.add(i, renumberedOffset);
                }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java

        public int latestValue() {
            return ((Integer) band.get(band.size() - 1)).intValue();
        }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        // Call
        case '(':
            final int number = readNumber(reader).intValue();
            reader.read(); // ')'
            return new Call(number);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
                        band.remove(i);
                        final Integer bytecodeIndex = labelsToOffsets.get(label);
                        band.add(i, Integer.valueOf(bciRenumbering.get(bytecodeIndex.intValue())));
                    }
                }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentConstantPool.java`
#### Snippet
```java

        for (final Integer element : indexList) {
            final int arrayIndex = element.intValue();
            if (regexMatches(secondaryCompareRegex, secondaryArray[arrayIndex])) {
                instanceCount++;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/BCIRenumberedAttribute.java`
#### Snippet
```java
        renumbered = true;
        final int[] startPCs = getStartPCs();
        Arrays.setAll(startPCs, i -> byteCodeOffsets.get(startPCs[i]).intValue());
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java
            final Integer index = mapDescriptor.get(descriptor);
            if (index != null) {
                return cpNameAndTypeValue(index.intValue());
            }
            final int colon = descriptor.indexOf(':');
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java
            }
            if (index != null) {
                return cpUTF8Value(index.intValue());
            }
            if (searchForIndex) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java
            }
            if (index != null) {
                return cpSignatureValue(index.intValue());
            }
            cputf8 = new CPUTF8(string, -1);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java
            final Integer index = mapClass.get(string);
            if (index != null) {
                return cpClassValue(index.intValue());
            }
            cpString = new CPClass(cpUTF8Value(string, false), -1);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/LocalVariableTypeTableAttribute.java`
#### Snippet
```java
            } else {
                // We're indexed into the byte code array
                final int stopValue = byteCodeOffsets.get(stopIndex).intValue();
                revisedLength = stopValue - startPc;
            }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/ExceptionTableEntry.java`
#### Snippet
```java

    public void renumber(final List<Integer> byteCodeOffsets) {
        startPcRenumbered = byteCodeOffsets.get(startPC).intValue();
        final int endPcIndex = startPC + endPC;
        endPcRenumbered = byteCodeOffsets.get(endPcIndex).intValue();
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/ExceptionTableEntry.java`
#### Snippet
```java
        startPcRenumbered = byteCodeOffsets.get(startPC).intValue();
        final int endPcIndex = startPC + endPC;
        endPcRenumbered = byteCodeOffsets.get(endPcIndex).intValue();
        final int handlerPcIndex = endPcIndex + handlerPC;
        handlerPcRenumbered = byteCodeOffsets.get(handlerPcIndex).intValue();
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/ExceptionTableEntry.java`
#### Snippet
```java
        endPcRenumbered = byteCodeOffsets.get(endPcIndex).intValue();
        final int handlerPcIndex = endPcIndex + handlerPC;
        handlerPcRenumbered = byteCodeOffsets.get(handlerPcIndex).intValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/CodeAttribute.java`
#### Snippet
```java
            byteCodes.add(byteCode);
            codeLength += byteCode.getLength();
            final int lastBytecodePosition = byteCodeOffsets.get(byteCodeOffsets.size() - 1).intValue();
            // This code assumes all multiple byte bytecodes are
            // replaced by a single-byte bytecode followed by
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/NewAttribute.java`
#### Snippet
```java
                if (obj instanceof BCIndex) {
                    final BCIndex bcIndex = (BCIndex) obj;
                    bcIndex.setActualValue(byteCodeOffsets.get(bcIndex.index).intValue());
                } else if (obj instanceof BCOffset) {
                    final BCOffset bcOffset = (BCOffset) obj;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/NewAttribute.java`
#### Snippet
```java
                        final int index = ((BCIndex) previous).index + bcOffset.offset;
                        bcOffset.setIndex(index);
                        bcOffset.setActualValue(byteCodeOffsets.get(index).intValue());
                    } else if (previous instanceof BCOffset) {
                        final int index = ((BCOffset) previous).index + bcOffset.offset;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/NewAttribute.java`
#### Snippet
```java
                        final int index = ((BCOffset) previous).index + bcOffset.offset;
                        bcOffset.setIndex(index);
                        bcOffset.setActualValue(byteCodeOffsets.get(index).intValue());
                    } else {
                        // Not sure if this should be able to happen
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/NewAttribute.java`
#### Snippet
```java
                    } else {
                        // Not sure if this should be able to happen
                        bcOffset.setActualValue(byteCodeOffsets.get(bcOffset.offset).intValue());
                    }
                } else if (obj instanceof BCLength) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/NewAttribute.java`
#### Snippet
```java
                    final BCIndex prevIndex = (BCIndex) previous;
                    final int index = prevIndex.index + bcLength.length;
                    final int actualLength = byteCodeOffsets.get(index).intValue() - prevIndex.actualValue;
                    bcLength.setActualValue(actualLength);
                }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/NewAttribute.java`
#### Snippet
```java
    protected void writeBody(final DataOutputStream dos) throws IOException {
        for (int i = 0; i < lengths.size(); i++) {
            final int length = lengths.get(i).intValue();
            final Object obj = body.get(i);
            long value = 0;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/NewAttribute.java`
#### Snippet
```java
            long value = 0;
            if (obj instanceof Long) {
                value = ((Long) obj).longValue();
            } else if (obj instanceof ClassFileEntry) {
                value = pool.indexOf(((ClassFileEntry) obj));
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/NewAttribute.java`
#### Snippet
```java
        int length = 0;
        for (final Integer len : lengths) {
            length += len.intValue();
        }
        return length;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
        // Call
        case '(':
            final int number = readNumber(stream).intValue();
            stream.read(); // ')'
            return new Call(number);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/SwitchForm.java`
#### Snippet
```java

        final int sourceIndex = byteCode.getByteCodeIndex();
        final int sourceValue = codeAttribute.byteCodeOffsets.get(sourceIndex).intValue();
        for (int index = 0; index < numberOfLabels; index++) {
            final int absoluteInstructionTargetIndex = sourceIndex + originalTargets[index];
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/SwitchForm.java`
#### Snippet
```java
            final int absoluteInstructionTargetIndex = sourceIndex + originalTargets[index];
            final int targetValue = codeAttribute.byteCodeOffsets.get(absoluteInstructionTargetIndex)
                .intValue();
            replacementTargets[index] = targetValue - sourceValue;
        }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/LocalVariableTableAttribute.java`
#### Snippet
```java
            } else {
                // We're indexed into the byte code array
                final int stopValue = byteCodeOffsets.get(stopIndex).intValue();
                revisedLength = stopValue - startPc;
            }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/LabelForm.java`
#### Snippet
```java
        final int absoluteInstructionTargetIndex = sourceIndex + originalTarget;
        final int targetValue = codeAttribute.byteCodeOffsets.get(absoluteInstructionTargetIndex)
            .intValue();
        final int sourceValue = codeAttribute.byteCodeOffsets.get(sourceIndex).intValue();
        // The operand is the difference between the source instruction
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/LabelForm.java`
#### Snippet
```java
        final int targetValue = codeAttribute.byteCodeOffsets.get(absoluteInstructionTargetIndex)
            .intValue();
        final int sourceValue = codeAttribute.byteCodeOffsets.get(sourceIndex).intValue();
        // The operand is the difference between the source instruction
        // and the destination instruction.
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/ClassConstantPool.java`
#### Snippet
```java
        // If the entry isn't found, answer -1. Otherwise answer the entry.
        if (entryIndex != null) {
            return entryIndex.intValue() + 1;
        }
        return -1;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/BcBands.java`
#### Snippet
```java
        final int[] wideByteCodeArray = new int[wideByteCodes.size()];
        for (int index = 0; index < wideByteCodeArray.length; index++) {
            wideByteCodeArray[index] = wideByteCodes.get(index).intValue();
        }
        final OperandManager operandManager = new OperandManager(bcCaseCount, bcCaseValue, bcByte, bcShort, bcLocal,
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/BcBands.java`
#### Snippet
```java
        int bcCaseValueCount = 0;
        for (int i = 0; i < bcCaseCount.length; i++) {
            final boolean isTableSwitch = switchIsTableSwitch.get(i).booleanValue();
            if (isTableSwitch) {
                bcCaseValueCount += 1;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				list.remove(i);
				final Integer bytecodeIndex = labelsToOffsets.get(label);
				list.add(i, Integer.valueOf(bciRenumbering.get(bytecodeIndex.intValue())));
			}
		}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				final int flagIndex = bands.getFlagIndex();
				final Long flags = tempFieldFlags.remove(tempFieldFlags.size() - 1);
				tempFieldFlags.add(Long.valueOf(flags.longValue() | (1 << flagIndex)));
				return;
			}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		}
		if (codeFlags.size() > 0) {
			final long latestCodeFlag = codeFlags.get(codeFlags.size() - 1).longValue();
			final int latestLocalVariableTableN = codeLocalVariableTableN.get(codeLocalVariableTableN.size() - 1);
			if (latestCodeFlag == (1 << 2) && latestLocalVariableTableN == 0) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
			}
			final Long flag = tempMethodFlags.remove(tempMethodFlags.size() - 1);
			tempMethodFlags.add(Long.valueOf(flag.longValue() | (1 << 23)));
		} else {
			if (tempMethodRIPA == null) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
			}
			final Long flag = tempMethodFlags.remove(tempMethodFlags.size() - 1);
			tempMethodFlags.add(Long.valueOf(flag.longValue() | (1 << 24)));
		}
	}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				final int flagIndex = bands.getFlagIndex();
				final Long flags = codeFlags.remove(codeFlags.size() - 1);
				codeFlags.add(Long.valueOf(flags.longValue() | (1 << flagIndex)));
				return;
			}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				final int flagIndex = bands.getFlagIndex();
				final Long flags = tempMethodFlags.remove(tempMethodFlags.size() - 1);
				tempMethodFlags.add(Long.valueOf(flags.longValue() | (1 << flagIndex)));
				return;
			}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		tempMethodFlags.add(newFlag);
		codeMaxStack.add(maxStack);
		if ((newFlag.longValue() & (1 << 3)) == 0) { // not static
			maxLocals--; // minus 'this' local
		}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		}
		for (final Long flagsL : tempFieldFlags) {
			final long flags = flagsL.longValue();
			if ((flags & (1 << 19)) != 0) {
				fieldSignature.remove(fieldSignature.size() - 1);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		}
		for (final Long flagsL : tempMethodFlags) {
			final long flags = flagsL.longValue();
			if ((flags & (1 << 19)) != 0) {
				methodSignature.remove(methodSignature.size() - 1);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				}
				if (!stripDebug) {
					final long cdeFlags = codeFlags.remove(codeFlags.size() - 1).longValue();
					final int numLocalVariables = codeLocalVariableTableN.remove(codeLocalVariableTableN.size() - 1);
					for (int i = 0; i < numLocalVariables; i++) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		method_AD_bands.addAnnotation(null, nameRU, tags, values, caseArrayN, nestTypeRS, nestNameRU, nestPairN);
		final Long flag = tempMethodFlags.remove(tempMethodFlags.size() - 1);
		tempMethodFlags.add(Long.valueOf(flag.longValue() | (1 << 25)));
	}

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				list.remove(i);
				final Integer bytecodeIndex = labelsToOffsets.get(label);
				final Integer renumberedOffset = Integer.valueOf(bciRenumbering.get(bytecodeIndex.intValue())
						- relative.get(i).intValue() - firstOffset.get(i).intValue());
				list.add(i, renumberedOffset);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				final Integer bytecodeIndex = labelsToOffsets.get(label);
				final Integer renumberedOffset = Integer.valueOf(bciRenumbering.get(bytecodeIndex.intValue())
						- relative.get(i).intValue() - firstOffset.get(i).intValue());
				list.add(i, renumberedOffset);
			}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				final Integer bytecodeIndex = labelsToOffsets.get(label);
				final Integer renumberedOffset = Integer.valueOf(bciRenumbering.get(bytecodeIndex.intValue())
						- relative.get(i).intValue() - firstOffset.get(i).intValue());
				list.add(i, renumberedOffset);
			}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				final Integer bytecodeIndex = labelsToOffsets.get(label);
				final Integer renumberedOffset = Integer
						.valueOf(bciRenumbering.get(bytecodeIndex.intValue()) - relative.get(i).intValue());
				list.add(i, renumberedOffset);
			}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				final Integer bytecodeIndex = labelsToOffsets.get(label);
				final Integer renumberedOffset = Integer
						.valueOf(bciRenumbering.get(bytecodeIndex.intValue()) - relative.get(i).intValue());
				list.add(i, renumberedOffset);
			}
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		for (int i = 0; i < numFields; i++) {
			field_descr[index][i] = tempFieldDesc.get(i);
			field_flags[index][i] = tempFieldFlags.get(i).longValue();
		}
		final int numMethods = tempMethodDesc.size();
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		for (int i = 0; i < numMethods; i++) {
			method_descr[index][i] = tempMethodDesc.get(i);
			method_flags[index][i] = tempMethodFlags.get(i).longValue();
		}
		tempFieldDesc.clear();
```

## RuleId[ruleID=RedundantMethodOverride]
### RedundantMethodOverride
Method `resolve()` only delegates to its super method
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/LineNumberTableAttribute.java`
#### Snippet
```java
     */
    @Override
    protected void resolve(final ClassConstantPool pool) {
        super.resolve(pool);
    }
```

### RedundantMethodOverride
Method `getNestedClassFileEntries()` is identical to its super method
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/LineNumberTableAttribute.java`
#### Snippet
```java
     */
    @Override
    protected ClassFileEntry[] getNestedClassFileEntries() {
        return new ClassFileEntry[] {getAttributeName()};
    }
```

### RedundantMethodOverride
Method `doWrite()` only delegates to its super method
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/InnerClassesAttribute.java`
#### Snippet
```java

    @Override
    protected void doWrite(final DataOutputStream dos) throws IOException {
        // Hack so I can see what's being written.
        super.doWrite(dos);
```

## RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
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
				final int flagIndex = bands.getFlagIndex();
				final Long flags = codeFlags.remove(codeFlags.size() - 1);
				codeFlags.add(Long.valueOf(flags.longValue() | (1 << flagIndex)));
				return;
			}
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
				bands.addAttribute(attribute);
				final int flagIndex = bands.getFlagIndex();
				class_flags[index] |= (1 << flagIndex);
				return;
			}
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

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java`
#### Snippet
```java
                return getLocalHeaderOffset()
                        == otherEntry.getLocalHeaderOffset()
                    && super.getDataOffset()
                        == otherEntry.getDataOffset()
                    && super.getDiskNumberStart()
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java`
#### Snippet
```java
                    && super.getDataOffset()
                        == otherEntry.getDataOffset()
                    && super.getDiskNumberStart()
                        == otherEntry.getDiskNumberStart();
            }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java`
#### Snippet
```java
        @Override
        public long getCompressedCount() {
            return super.getBytesRead();
        }

```

## RuleId[ruleID=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/utils/IOUtils.java`
#### Snippet
```java
        int n = 0;
        long count=0;
        while (-1 != (n = input.read(buffer))) {
            if (output != null) {
                output.write(buffer, 0, n);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/utils/IOUtils.java`
#### Snippet
```java
        int n = 0;
        long count = 0;
        while (count < len && -1 != (n = input.read(buffer, 0, (int) Math.min(len - count, buffer.length)))) {
            if (output != null) {
                output.write(buffer, 0, n);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/pack200/Codec.java`
#### Snippet
```java
        int last = firstValue;
        for (int i = 1; i < n + 1; i++) {
            result[i] = last = decode(in, last);
        }
        return result;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/pack200/Codec.java`
#### Snippet
```java
        int last = 0;
        for (int i = 0; i < n; i++) {
            result[i] = last = decode(in, last);
        }
        return result;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/changes/ChangeSetPerformer.java`
#### Snippet
```java
        @Override
        public boolean hasNext() throws IOException {
            return (next = in.getNextEntry()) != null;
        }
        @Override
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/pack200/IntList.java`
#### Snippet
```java
        if (firstIndex != lastIndex) {
            Arrays.fill(array, firstIndex, lastIndex, -1);
            firstIndex = lastIndex = 0;
            modCount++;
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/pack200/IntList.java`
#### Snippet
```java
        }
        if (firstIndex == lastIndex) {
            firstIndex = lastIndex = 0;
        }

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/pack200/IntList.java`
#### Snippet
```java
            throw new IllegalArgumentException();
        }
        firstIndex = lastIndex = 0;
        array = new int[capacity];
    }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/pack200/PopulationCodec.java`
#### Snippet
```java
            if (index == 0) {
                lastBandLength++;
                result[i] = last = unfavouredCodec.decode(in, last);
            } else {
                result[i] = favoured[index - 1];
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/pack200/PackingUtils.java`
#### Snippet
```java
			JarEntry jarEntry;
			int bytesRead;
			while ((jarEntry = jarInputStream.getNextJarEntry()) != null) {
				jarOutputStream.putNextEntry(jarEntry);
				while ((bytesRead = jarInputStream.read(bytes)) != -1) {
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/pack200/PackingUtils.java`
#### Snippet
```java
			while ((jarEntry = jarInputStream.getNextJarEntry()) != null) {
				jarOutputStream.putNextEntry(jarEntry);
				while ((bytesRead = jarInputStream.read(bytes)) != -1) {
					jarOutputStream.write(bytes, 0, bytesRead);
				}
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/pack200/PackingUtils.java`
#### Snippet
```java
        JarEntry jarEntry;
        byte[] bytes;
        while ((jarEntry = jarInputStream.getNextJarEntry()) != null) {
            bytes = readJarEntry(jarEntry, new BufferedInputStream(jarInputStream));
            packingFileList.add(new PackingFile(bytes, jarEntry));
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/pack200/PackingUtils.java`
#### Snippet
```java
				try (InputStream inputStream = jarFile.getInputStream(jarEntry)) {
					int bytesRead;
					while ((bytesRead = inputStream.read(bytes)) != -1) {
						jarOutputStream.write(bytes, 0, bytesRead);
					}
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        int i;
        int length = 0;
        while ((i = (stream.read())) != -1 && Character.isDigit((char) i)) {
            length++;
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
            final StringReader reader = new StringReader(layout);
            AttributeLayoutElement e;
            while ((e = readNextAttributeElement(reader)) != null) {
                attributeLayoutElements.add(e);
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
            final List<UnionCase> unionCases = new ArrayList<>();
            UnionCase c;
            while ((c = readNextUnionCase(reader)) != null) {
                unionCases.add(c);
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
            final StringReader stream = new StringReader(contents);
            LayoutElement e;
            while ((e = readNextLayoutElement(stream)) != null) {
                layoutElements.add(e);
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        final List<LayoutElement> layoutElements = new ArrayList<>();
        LayoutElement e;
        while ((e = readNextLayoutElement(reader)) != null) {
            layoutElements.add(e);
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/unpack200/Archive.java`
#### Snippet
```java
                final JarInputStream jarInputStream = new JarInputStream(inputStream);
                JarEntry jarEntry;
                while ((jarEntry = jarInputStream.getNextJarEntry()) != null) {
                    outputStream.putNextEntry(jarEntry);
                    final byte[] bytes = new byte[16384];
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
        int i;
        int length = 0;
        while ((i = (stream.read())) != -1 && Character.isDigit((char) i)) {
            length++;
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
        final List<LayoutElement> layoutElements = new ArrayList<>();
        LayoutElement e;
        while ((e = readNextLayoutElement(stream)) != null) {
            layoutElements.add(e);
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
            final List<UnionCase> unionCases = new ArrayList<>();
            UnionCase c;
            while ((c = readNextUnionCase(stream)) != null) {
                unionCases.add(c);
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
            final StringReader stream = new StringReader(attributeLayout.getLayout());
            AttributeLayoutElement e;
            while ((e = readNextAttributeElement(stream)) != null) {
                attributeLayoutElements.add(e);
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
            final StringReader stream = new StringReader(contents);
            LayoutElement e;
            while ((e = readNextLayoutElement(stream)) != null) {
                layoutElements.add(e);
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/ClassFile.java`
#### Snippet
```java
        for (int i = 1; i <= pool.size(); i++) {
            ConstantPoolEntry entry;
            (entry = (ConstantPoolEntry) pool.get(i)).doWrite(dos);
            // Doubles and longs take up two spaces in the pool, but only one
            // gets written
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/harmony/unpack200/BcBands.java`
#### Snippet
```java
                    final ByteArrayOutputStream codeBytes = new ByteArrayOutputStream();
                    byte code;
                    while ((code = (byte) (0xff & in.read())) != -1) {
                        codeBytes.write(code);
                    }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/Lister.java`
#### Snippet
```java
            System.out.println("Created " + ais.toString());
            ArchiveEntry ae;
            while ((ae = ais.getNextEntry()) != null) {
                System.out.println(ae.getName());
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/Lister.java`
#### Snippet
```java
            System.out.println("Created " + z);
            ArchiveEntry ae;
            while ((ae = z.getNextEntry()) != null) {
                final String name = ae.getName() == null ? z.getDefaultName() + " (entry name was null)"
                    : ae.getName();
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/arj/ArjArchiveInputStream.java`
#### Snippet
```java
        try (final ByteArrayOutputStream buffer = new ByteArrayOutputStream()) {
            int nextByte;
            while ((nextByte = dataIn.readUnsignedByte()) != 0) {
                buffer.write(nextByte);
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/arj/ArjArchiveInputStream.java`
#### Snippet
```java
                final ArrayList<byte[]> extendedHeaders = new ArrayList<>();
                int extendedHeaderSize;
                while ((extendedHeaderSize = read16(in)) > 0) {
                    final byte[] extendedHeaderBytes = readRange(in, extendedHeaderSize);
                    final long extendedHeaderCrc32 = 0xffffFFFFL & read32(in);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/tar/TarFile.java`
#### Snippet
```java

        TarArchiveEntry entry;
        while ((entry = getNextTarEntry()) != null) {
            entries.add(entry);
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/tar/TarFile.java`
#### Snippet
```java
        int length;
        try (final InputStream in = getInputStream(currEntry)) {
            while ((length = in.read(smallBuf)) >= 0) {
                longName.write(smallBuf, 0, length);
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java`
#### Snippet
```java
        final ByteArrayOutputStream longName = new ByteArrayOutputStream();
        int length = 0;
        while ((length = read(smallBuf)) >= 0) {
            longName.write(smallBuf, 0, length);
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveOutputStream.java`
#### Snippet
```java
            throw new IllegalArgumentException("Block size must be a multiple of 512 bytes. Attempt to use set size of " + blockSize);
        }
        out = new FixedLengthBlockOutputStream(countingOut = new CountingOutputStream(os),
                                               RECORD_SIZE);
        this.encoding = encoding;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/zip/StreamCompressor.java`
#### Snippet
```java
        int length;

        while ((length = source.read(readerBuf, 0, readerBuf.length)) >= 0) {
            write(readerBuf, 0, length, method);
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java`
#### Snippet
```java
        long device = entry.getDevice();
        if (CPIO_TRAILER.equals(entry.getName())) {
            inode = device = 0;
        } else if (inode == 0 && device == 0) {
            inode = nextArtificalDeviceAndInode & 0xFFFF;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java`
#### Snippet
```java
        long devMin = entry.getDeviceMin();
        if (CPIO_TRAILER.equals(entry.getName())) {
            inode = devMin = 0;
        } else if (inode == 0 && devMin == 0) {
            inode = nextArtificalDeviceAndInode & 0xFFFFFFFF;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java`
#### Snippet
```java
        long device = entry.getDevice();
        if (CPIO_TRAILER.equals(entry.getName())) {
            inode = device = 0;
        } else if (inode == 0 && device == 0) {
            inode = nextArtificalDeviceAndInode & 0777777;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java`
#### Snippet
```java
        int currentByte = -1;
        boolean skipReadCall = false;
        while (skipReadCall || (currentByte = readOneByte()) > -1) {
            skipReadCall = false;
            if (!isFirstByteOfEocdSig(currentByte)) {
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
        header.volume = DumpArchiveUtil.convert32(buffer, 12);
        //header.tapea = DumpArchiveUtil.convert32(buffer, 16);
        entry.ino = header.ino = DumpArchiveUtil.convert32(buffer, 20);

        //header.magic = DumpArchiveUtil.convert32(buffer, 24);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/sevenz/CLI.java`
#### Snippet
```java
        try (final SevenZFile archive = new SevenZFile(f)) {
            SevenZArchiveEntry ae;
            while((ae=archive.getNextEntry()) != null) {
                mode.takeAction(archive, ae);
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java`
#### Snippet
```java
                    && entry.entry.getSize() != ArchiveEntry.SIZE_UNKNOWN) {
                // actually, we already know the sizes
                compressedSize = size = new ZipEightByteInteger(entry.entry.getSize());
            } else {
                // just a placeholder, real data will be in data
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java`
#### Snippet
```java
                // just a placeholder, real data will be in data
                // descriptor or inserted later via SeekableByteChannel
                compressedSize = size = ZipEightByteInteger.ZERO;
            }
            z64.setSize(size);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java`
#### Snippet
```java
        entry.hasWritten = true;
        int length;
        while ((length = src.read(copyBuffer)) >= 0 )
        {
            streamCompressor.writeCounted(copyBuffer, 0, length);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/examples/Expander.java`
#### Snippet
```java
            final byte[] buffer = new byte[8192];
            int n;
            while (-1 != (n = archive.read(buffer))) {
                if (out != null) {
                    out.write(buffer, 0, n);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZOutputFile.java`
#### Snippet
```java
        final byte[] buffer = new byte[8024];
        int n = 0;
        while (-1 != (n = inputStream.read(buffer))) {
            write(buffer, 0, n);
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/lzma/LZMACompressorInputStream.java`
#### Snippet
```java
    public LZMACompressorInputStream(final InputStream inputStream)
            throws IOException {
        in = new LZMAInputStream(countingStream = new CountingInputStream(inputStream), -1);
    }

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/lzma/LZMACompressorInputStream.java`
#### Snippet
```java
            throws IOException {
        try {
            in = new LZMAInputStream(countingStream = new CountingInputStream(inputStream), memoryLimitInKb);
        } catch (final org.tukaani.xz.MemoryLimitException e) {
            //convert to commons-compress exception
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/gzip/GzipCompressorInputStream.java`
#### Snippet
```java
        try (final ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            int b = 0;
            while ((b = inData.readUnsignedByte()) != 0x00) { // NOPMD NOSONAR
                bos.write(b);
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/brotli/BrotliCompressorInputStream.java`
#### Snippet
```java

    public BrotliCompressorInputStream(final InputStream in) throws IOException {
        decIS = new BrotliInputStream(countingStream = new CountingInputStream(in));
    }

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/snappy/SnappyCompressorInputStream.java`
#### Snippet
```java
            throws IOException {
        super(is, blockSize);
        uncompressedBytesRemaining = size = (int) readSize();
    }

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/deflate/DeflateCompressorInputStream.java`
#### Snippet
```java
                                        final DeflateParameters parameters) {
        inflater = new Inflater(!parameters.withZlibHeader());
        in = new InflaterInputStream(countingStream = new CountingInputStream(inputStream), inflater);
    }

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/snappy/PureJavaCrc32C.java`
#### Snippet
```java
    while(len > 7) {
      final int c0 =(b[off+0] ^ localCrc) & 0xff;
      final int c1 =(b[off+1] ^ (localCrc >>>= 8)) & 0xff; //NOSONAR
      final int c2 =(b[off+2] ^ (localCrc >>>= 8)) & 0xff; //NOSONAR
      final int c3 =(b[off+3] ^ (localCrc >>>= 8)) & 0xff; //NOSONAR
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/snappy/PureJavaCrc32C.java`
#### Snippet
```java
      final int c0 =(b[off+0] ^ localCrc) & 0xff;
      final int c1 =(b[off+1] ^ (localCrc >>>= 8)) & 0xff; //NOSONAR
      final int c2 =(b[off+2] ^ (localCrc >>>= 8)) & 0xff; //NOSONAR
      final int c3 =(b[off+3] ^ (localCrc >>>= 8)) & 0xff; //NOSONAR
      localCrc = (T[T8_7_START + c0] ^ T[T8_6_START + c1])
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/snappy/PureJavaCrc32C.java`
#### Snippet
```java
      final int c1 =(b[off+1] ^ (localCrc >>>= 8)) & 0xff; //NOSONAR
      final int c2 =(b[off+2] ^ (localCrc >>>= 8)) & 0xff; //NOSONAR
      final int c3 =(b[off+3] ^ (localCrc >>>= 8)) & 0xff; //NOSONAR
      localCrc = (T[T8_7_START + c0] ^ T[T8_6_START + c1])
          ^ (T[T8_5_START + c2] ^ T[T8_4_START + c3]);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/zstandard/ZstdCompressorInputStream.java`
#### Snippet
```java
     */
    public ZstdCompressorInputStream(final InputStream in, final BufferPool bufferPool) throws IOException {
        this.decIS = new ZstdInputStream(countingStream = new CountingInputStream(in), bufferPool);
    }

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/zstandard/ZstdCompressorInputStream.java`
#### Snippet
```java

    public ZstdCompressorInputStream(final InputStream in) throws IOException {
        this.decIS = new ZstdInputStream(countingStream = new CountingInputStream(in));
    }

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
        }
        buildDecodingStream(currentEntryIndex, false);
        uncompressedBytesReadFromCurrentEntry = compressedBytesReadFromCurrentEntry = 0;
        return entry;
    }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/lz77support/Parameters.java`
#### Snippet
```java
         */
        public Builder tunedForCompressionRatio() {
            niceBackReferenceLength = lazyThreshold = maxBackReferenceLength;
            maxCandidates = Math.max(32, windowSize / 16);
            lazyMatches = true;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java`
#### Snippet
```java
                heap[zz] = tmp;
                nNodes++;
                parent[n1] = parent[n2] = nNodes;

                final int weight_n1 = weight[n1];
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java`
#### Snippet
```java
                int k = i;

                for (int parent_k; (parent_k = parent[k]) >= 0;) {
                    k = parent_k;
                    j++;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java`
#### Snippet
```java
        int destOffs = offs;
        int b;
        while (destOffs < hi && ((b = read0()) >= 0)) {
            dest[destOffs++] = (byte) b;
            count(1);
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java`
#### Snippet
```java
            // than others.
            if ((ttShadow == null) || (ttShadow.length < length)) {
                this.tt = ttShadow = new int[length];
            }

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java`
#### Snippet
```java
                this.su_rNToGo--;
            }
            this.su_ch2 = su_ch2Shadow ^= (this.su_rNToGo == 1) ? 1 : 0;
            this.su_i2++;
            this.currentState = RAND_PART_B_STATE;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/lz77support/LZ77Compressor.java`
#### Snippet
```java
            missedInserts = len;
        }
        blockStart = currentPosition = len;
    }

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/tar/TarUtils.java`
#### Snippet
```java
        long bytesRead = 0;

        while ((number = inputStream.read()) != '\n') {
            bytesRead += 1;
            if (number == -1) {
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/tar/TarUtils.java`
#### Snippet
```java
            int len = 0;
            int read = 0;
            while((ch = inputStream.read()) != -1) {
                read++;
                totalRead++;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/archivers/tar/TarUtils.java`
#### Snippet
```java
                    // Get keyword
                    final ByteArrayOutputStream coll = new ByteArrayOutputStream();
                    while((ch = inputStream.read()) != -1) {
                        read++;
                        totalRead++;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
            }

            unLo = ltLo = lo;
            unHi = gtHi = hi;

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java

            unLo = ltLo = lo;
            unHi = gtHi = hi;

            // looks like the ternary partition attributed to Wegner
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
                        if (onceRunned) {
                            fmap[j] = a;
                            if ((j -= h) <= mj) { //NOSONAR
                                break HAMMER;
                            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
                                    if (block[i1 + 4] == block[i2 + 4]) {
                                        if (block[i1 + 5] == block[i2 + 5]) {
                                            if (block[(i1 += 6)] == block[(i2 += 6)]) { //NOSONAR
                                                int x = lastShadow;
                                                X: while (x > 0) {
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
                                    if (block[i1 + 4] == block[i2 + 4]) {
                                        if (block[i1 + 5] == block[i2 + 5]) {
                                            if (block[(i1 += 6)] == block[(i2 += 6)]) { //NOSONAR
                                                int x = lastShadow;
                                                X: while (x > 0) {
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
                                                                            if (block[i1 + 4] == block[i2 + 4]) {
                                                                                if (quadrant[i1 + 3] == quadrant[i2 + 3]) {
                                                                                    if ((i1 += 4) >= lastPlus1) { //NOSONAR
                                                                                        i1 -= lastPlus1;
                                                                                    }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
                                                                                        i1 -= lastPlus1;
                                                                                    }
                                                                                    if ((i2 += 4) >= lastPlus1) { //NOSONAR
                                                                                        i2 -= lastPlus1;
                                                                                    }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/compress/compressors/lz77support/AbstractLZ77CompressorInputStream.java`
#### Snippet
```java
        this.windowSize = windowSize;
        buf = new byte[3 * windowSize];
        writeIndex = readIndex = 0;
        bytesRemaining = 0;
    }
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`z = z << s` could be simplified to 'z \<\<= s'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BHSDCodec.java`
#### Snippet
```java
                z = (-z << s) - 1;
            } else if (s == 1) {
                z = z << s;
            } else {
                z += (z - z % 3) / 3;
```

### ReplaceAssignmentWithOperatorAssignment
`z = z - (z >>> s)` could be simplified to 'z -= (z \>\>\> s)'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BHSDCodec.java`
#### Snippet
```java
                z = z >>> s ^ -1L;
            } else {
                z = z - (z >>> s);
            }
        }
```

### ReplaceAssignmentWithOperatorAssignment
`pass = pass + "/"` could be simplified to 'pass += "/"'
in `src/main/java/org/apache/commons/compress/harmony/pack200/PackingOptions.java`
#### Snippet
```java
                    // exclude "org/apache/harmony/pack" should not match
                    // files under "org/apache/harmony/pack200/")
                    pass = pass + "/";
                }
                return passFileName.startsWith(pass);
```

### ReplaceAssignmentWithOperatorAssignment
`specifier = specifier + defaultCodec.getL()` could be simplified to 'specifier += defaultCodec.getL()'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
            specifier = -1 - specifier;
        } else {
            specifier = specifier + defaultCodec.getL();
        }
        final byte[] firstValueEncoded = defaultCodec.encode(new int[] {specifier});
```

### ReplaceAssignmentWithOperatorAssignment
`specifier = specifier + defaultCodec.getL()` could be simplified to 'specifier += defaultCodec.getL()'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
                        specifier = -1 - specifier;
                    } else {
                        specifier = specifier + defaultCodec.getL();
                    }
                    final byte[] specifierEncoded = defaultCodec.encode(new int[] {specifier});
```

### ReplaceAssignmentWithOperatorAssignment
`archiveSizeOffset = archiveSizeOffset - in.available()` could be simplified to 'archiveSizeOffset -= in.available()'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentHeader.java`
#### Snippet
```java
        }

        archiveSizeOffset = archiveSizeOffset - in.available();
    }

```

### ReplaceAssignmentWithOperatorAssignment
`bytesWritten = bytesWritten + written` could be simplified to 'bytesWritten += written'
in `src/main/java/org/apache/commons/compress/archivers/ArchiveOutputStream.java`
#### Snippet
```java
    protected void count(final long written) {
        if (written != -1) {
            bytesWritten = bytesWritten + written;
        }
    }
```

### ReplaceAssignmentWithOperatorAssignment
`bytesRead = bytesRead + read` could be simplified to 'bytesRead += read'
in `src/main/java/org/apache/commons/compress/archivers/ArchiveInputStream.java`
#### Snippet
```java
    protected void count(final long read) {
        if (read != -1) {
            bytesRead = bytesRead + read;
        }
    }
```

### ReplaceAssignmentWithOperatorAssignment
`code = code + codeIncrement` could be simplified to 'code += codeIncrement'
in `src/main/java/org/apache/commons/compress/archivers/zip/BinaryTree.java`
#### Snippet
```java

        for (int i = totalNumberOfValues - 1; i >= 0; i--) {
            code = code + codeIncrement;
            if (sortedBitLengths[i] != lastBitLength) {
                lastBitLength = sortedBitLengths[i];
```

### ReplaceAssignmentWithOperatorAssignment
`flags = flags & 0xFFFF` could be simplified to 'flags \&= 0xFFFF'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java

	public void addField(int flags, final String name, final String desc, final String signature, final Object value) {
		flags = flags & 0xFFFF;
		tempFieldDesc.add(cpBands.getCPNameAndType(name, desc));
		if (signature != null) {
```

### ReplaceAssignmentWithOperatorAssignment
`flags = flags & ~Opcodes.ACC_DEPRECATED` could be simplified to 'flags \&= \~Opcodes.ACC_DEPRECATED'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		}
		if ((flags & Opcodes.ACC_DEPRECATED) != 0) { // ASM uses (1<<17) flag for deprecated
			flags = flags & ~Opcodes.ACC_DEPRECATED;
			flags = flags | (1 << 20);
		}
```

### ReplaceAssignmentWithOperatorAssignment
`flags = flags | (1 << 20)` could be simplified to 'flags \|= (1 \<\< 20)'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		if ((flags & Opcodes.ACC_DEPRECATED) != 0) { // ASM uses (1<<17) flag for deprecated
			flags = flags & ~Opcodes.ACC_DEPRECATED;
			flags = flags | (1 << 20);
		}
		if (value != null) {
```

### ReplaceAssignmentWithOperatorAssignment
`flags = flags & ~Opcodes.ACC_DEPRECATED` could be simplified to 'flags \&= \~Opcodes.ACC_DEPRECATED'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		}
		if ((flags & Opcodes.ACC_DEPRECATED) != 0) { // ASM uses (1<<17) flag for deprecated
			flags = flags & ~Opcodes.ACC_DEPRECATED;
			flags = flags | (1 << 20);
		}
```

### ReplaceAssignmentWithOperatorAssignment
`flags = flags | (1 << 20)` could be simplified to 'flags \|= (1 \<\< 20)'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		if ((flags & Opcodes.ACC_DEPRECATED) != 0) { // ASM uses (1<<17) flag for deprecated
			flags = flags & ~Opcodes.ACC_DEPRECATED;
			flags = flags | (1 << 20);
		}
		tempMethodFlags.add(Long.valueOf(flags));
```

### ReplaceAssignmentWithOperatorAssignment
`class_flags[index] = class_flags[index] | (1 << 21)` could be simplified to 'class_flags\[index\] \|= (1 \<\< 21)'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				} else {
					class_RVA_bands.newEntryInAnnoN();
					class_flags[index] = class_flags[index] | (1 << 21);
				}
			} else {
```

### ReplaceAssignmentWithOperatorAssignment
`class_flags[index] = class_flags[index] | (1 << 22)` could be simplified to 'class_flags\[index\] \|= (1 \<\< 22)'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				} else {
					class_RIA_bands.newEntryInAnnoN();
					class_flags[index] = class_flags[index] | (1 << 22);
				}
			}
```

### ReplaceAssignmentWithOperatorAssignment
`bytesRead = bytesRead + read` could be simplified to 'bytesRead += read'
in `src/main/java/org/apache/commons/compress/compressors/CompressorInputStream.java`
#### Snippet
```java
    protected void count(final long read) {
        if (read != -1) {
            bytesRead = bytesRead + read;
        }
    }
```

### ReplaceAssignmentWithOperatorAssignment
`name = name + "/"` could be simplified to 'name += "/"'
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
            // up to be consistent
            if (isDirectory() && !name.endsWith("/")){
                name = name + "/";
            }
            if (!prefix.isEmpty()){
```

### ReplaceAssignmentWithOperatorAssignment
`val = val >>> 3` could be simplified to 'val \>\>\>= 3'
in `src/main/java/org/apache/commons/compress/archivers/tar/TarUtils.java`
#### Snippet
```java
                // CheckStyle:MagicNumber OFF
                buffer[offset + remaining] = (byte) ((byte) '0' + (byte) (val & 7));
                val = val >>> 3;
                // CheckStyle:MagicNumber ON
            }
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
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

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `globalPosition` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/compress/utils/MultiReadOnlySeekableByteChannel.java`
#### Snippet
```java
    private final List<SeekableByteChannel> channels;

    private long globalPosition;

    private int currentChannelIdx;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `input` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/compress/compressors/pack200/StreamBridge.java`
#### Snippet
```java
 */
abstract class StreamBridge extends FilterOutputStream {
    private InputStream input;
    private final Object inputLock = new Object();

```

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentHeader.java`
#### Snippet
```java
    }

    public void unpack() {

    }
```

### EmptyMethod
Method only calls its super
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/ByteCodeForm.java`
#### Snippet
```java
     * @param codeAttribute a CodeAttribute used to determine how the ByteCode should be fixed up.
     */
    public void fixUpByteCodeTargets(final ByteCode byteCode, final CodeAttribute codeAttribute) {
        // Most ByteCodeForms don't have any fixing up to do.
        return;
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/IcBands.java`
#### Snippet
```java
    private final Set<IcTuple> innerClasses = new TreeSet<>();
    private final CpBands cpBands;
    private int bit16Count = 0;

    private final Map<String, List<IcTuple>> outerToInner = new HashMap<>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/compress/harmony/archive/internal/nls/Messages.java`
#### Snippet
```java

    // ResourceBundle holding the system messages.
    static private ResourceBundle bundle = null;

    static {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttribute.java`
#### Snippet
```java

    private boolean contextMethod = false;
    private boolean contextField = false;
    private boolean contextCode = false;
    private final String layout;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttribute.java`
#### Snippet
```java
    private boolean contextClass = false;

    private boolean contextMethod = false;
    private boolean contextField = false;
    private boolean contextCode = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttribute.java`
#### Snippet
```java
        }
    }
    private boolean contextClass = false;

    private boolean contextMethod = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttribute.java`
#### Snippet
```java
    private boolean contextMethod = false;
    private boolean contextField = false;
    private boolean contextCode = false;
    private final String layout;
    private byte[] contents;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/PackingUtils.java`
#### Snippet
```java
    private static class PackingLogger extends Logger {

        private boolean verbose = false;

        protected PackingLogger(final String name, final String resourceBundleName) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
        private int largestDelta;

        private int deltaIsAscending = 0;
        private int smallDeltaCount = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
        private int smallDeltaCount = 0;

        private double averageAbsoluteDelta = 0;
        private double averageAbsoluteValue = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java

        // The number of bytes saved by using betterCodec instead of the default codec
        private int saved = 0;

        // Extra metadata to pass to the segment header (to be appended to the
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java

        private double averageAbsoluteDelta = 0;
        private double averageAbsoluteValue = 0;

        private Map<Integer, Integer> distinctValues;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java

        // The number of Codecs tried so far
        private int numCodecsTried = 0;

        // The number of bytes saved by using betterCodec instead of the default codec
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java

        private int deltaIsAscending = 0;
        private int smallDeltaCount = 0;

        private double averageAbsoluteDelta = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/MetadataBandGroup.java`
#### Snippet
```java

    private final String type;
    private int numBackwardsCalls = 0;

    public IntList param_NB = new IntList(); // TODO: Lazy instantiation?
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        private List<ConstantPoolEntry> band;

        private boolean nullsAllowed = false;

        public Reference(final String tag) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
	private final boolean stripDebug;
	private int index = 0;
	private int numMethodArgs = 0;
	private int[] class_InnerClasses_N;
	private CPClass[] class_InnerClasses_RC;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
	private boolean anySyntheticFields = false;

	private boolean anySyntheticMethods = false;
	private final Segment segment;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java

	private final boolean stripDebug;
	private int index = 0;
	private int numMethodArgs = 0;
	private int[] class_InnerClasses_N;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
	private TempParamAnnotation tempMethodRIPA;
	private boolean anySyntheticClasses = false;
	private boolean anySyntheticFields = false;

	private boolean anySyntheticMethods = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
	private TempParamAnnotation tempMethodRVPA;
	private TempParamAnnotation tempMethodRIPA;
	private boolean anySyntheticClasses = false;
	private boolean anySyntheticFields = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java
    private long diskNumberStart;

    private boolean lastModifiedDateSet = false;

    private long time = -1;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/compress/archivers/sevenz/AES256SHA256Decoder.java`
#### Snippet
```java
            private final int cipherBlockSize = opts.getCipher().getBlockSize();
            private final byte[] cipherBlockBuffer = new byte[cipherBlockSize];
            private int count = 0;

            @Override
```

## RuleId[ruleID=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/org/apache/commons/compress/harmony/pack200/IcBands.java`
#### Snippet
```java
public class IcBands extends BandSet {

    class IcTuple implements Comparable<IcTuple> {

        protected CPClass C; // this class
```

### EqualsAndHashcode
Class has `hashCode()` defined but does not define `equals()`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/AttributeLayout.java`
#### Snippet
```java
 * AttributeLayout defines a layout that describes how an attribute will be transmitted.
 */
public class AttributeLayout implements IMatcher {

    public static final String ACC_ABSTRACT = "ACC_ABSTRACT"; //$NON-NLS-1$
```

### EqualsAndHashcode
Class has `hashCode()` defined but does not define `equals()`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/CPString.java`
#### Snippet
```java
 * String constant pool entry.
 */
public class CPString extends CPConstant {

    private transient int nameIndex;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/LineNumberTableAttribute.java`
#### Snippet
```java
 * Line number table
 */
public class LineNumberTableAttribute extends BCIRenumberedAttribute {

    private static CPUTF8 attributeName;
```

### EqualsAndHashcode
Class has `hashCode()` defined but does not define `equals()`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/CPInterfaceMethodRef.java`
#### Snippet
```java
 * Interface method reference constant pool entry.
 */
public class CPInterfaceMethodRef extends CPRef {

    private boolean hashCodeComputed;
```

### EqualsAndHashcode
Class has `hashCode()` defined but does not define `equals()`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/CPMethod.java`
#### Snippet
```java
 * Method constant pool entry.
 */
public class CPMethod extends CPMember {

    private boolean hashCodeComputed;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/CPRef.java`
#### Snippet
```java
 * Abstract superclass for reference constant pool entries, such as a method or field reference.
 */
public abstract class CPRef extends ConstantPoolEntry {

    CPClass className;
```

### EqualsAndHashcode
Class has `hashCode()` defined but does not define `equals()`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/CPMethodRef.java`
#### Snippet
```java
 * Method reference constant pool entry.
 */
public class CPMethodRef extends CPRef {

    private boolean hashCodeComputed;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/AnnotationDefaultAttribute.java`
#### Snippet
```java
 * AnnotationDefault class file attribute
 */
public class AnnotationDefaultAttribute extends AnnotationsAttribute {

    private static CPUTF8 attributeName;
```

## RuleId[ruleID=PointlessBitwiseExpression]
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

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-02-27-01-34-43.098.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ArrayEquality]
### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentConstantPoolArrayCache.java`
#### Snippet
```java
        // several secondary elements with the same primary
        // key.
        if ((lastArray == array) && (lastKey == key)) {
            return lastIndexes;
        }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java
    private ZipExtraField[] getAllExtraFields() {
        final ZipExtraField[] allExtraFieldsNoCopy = getAllExtraFieldsNoCopy();
        return (allExtraFieldsNoCopy == extraFields) ? copyOf(allExtraFieldsNoCopy, allExtraFieldsNoCopy.length)
            : allExtraFieldsNoCopy;
    }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java
    private ZipExtraField[] getParseableExtraFields() {
        final ZipExtraField[] parseableExtraFields = getParseableExtraFieldsNoCopy();
        return (parseableExtraFields == extraFields) ? copyOf(parseableExtraFields, parseableExtraFields.length)
            : parseableExtraFields;
    }
```

## RuleId[ruleID=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `offset` of exception class
in `src/main/java/org/apache/commons/compress/archivers/dump/InvalidFormatException.java`
#### Snippet
```java
public class InvalidFormatException extends DumpArchiveException {
    private static final long serialVersionUID = 1L;
    protected long offset;

    public InvalidFormatException() {
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java
            }
            final int first = 117 + kb + (kx == 3 ? 0 : 4) + (8 * abDef);
            final int[] aSpecifier = abDef == 1 ? new int[0] : getSpecifier(aCodec, defaultForBand);
            final int[] bSpecifier = abDef == 2 ? new int[0] : getSpecifier(bCodec, defaultForBand);
            final int[] specifier = new int[1 + (kx == 3 ? 0 : 1) + aSpecifier.length + bSpecifier.length];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java
            final int first = 117 + kb + (kx == 3 ? 0 : 4) + (8 * abDef);
            final int[] aSpecifier = abDef == 1 ? new int[0] : getSpecifier(aCodec, defaultForBand);
            final int[] bSpecifier = abDef == 2 ? new int[0] : getSpecifier(bCodec, defaultForBand);
            final int[] specifier = new int[1 + (kx == 3 ? 0 : 1) + aSpecifier.length + bSpecifier.length];
            specifier[0] = first;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java
            }
            final int first = 141 + fDef + (2 * uDef) + (4 * tDefL);
            final int[] favouredSpecifier = fDef == 1 ? new int[0] : getSpecifier(favouredCodec, defaultForBand);
            final int[] tokenSpecifier = tDefL != 0 ? new int[0] : getSpecifier(tokenCodec, defaultForBand);
            final int[] unfavouredSpecifier = uDef == 1 ? new int[0] : getSpecifier(unfavouredCodec, defaultForBand);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java
            final int first = 141 + fDef + (2 * uDef) + (4 * tDefL);
            final int[] favouredSpecifier = fDef == 1 ? new int[0] : getSpecifier(favouredCodec, defaultForBand);
            final int[] tokenSpecifier = tDefL != 0 ? new int[0] : getSpecifier(tokenCodec, defaultForBand);
            final int[] unfavouredSpecifier = uDef == 1 ? new int[0] : getSpecifier(unfavouredCodec, defaultForBand);
            final int[] specifier = new int[1 + favouredSpecifier.length + unfavouredSpecifier.length
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java
            final int[] favouredSpecifier = fDef == 1 ? new int[0] : getSpecifier(favouredCodec, defaultForBand);
            final int[] tokenSpecifier = tDefL != 0 ? new int[0] : getSpecifier(tokenCodec, defaultForBand);
            final int[] unfavouredSpecifier = uDef == 1 ? new int[0] : getSpecifier(unfavouredCodec, defaultForBand);
            final int[] specifier = new int[1 + favouredSpecifier.length + unfavouredSpecifier.length
                + tokenSpecifier.length];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/compress/harmony/pack200/Archive.java`
#### Snippet
```java
            classParser.setFileName(name);
            javaClasses.add(classParser);
            packingFile.contents = new byte[0];
        }
        files.add(packingFile);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
            return encodedBand;
        }
        return new byte[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/compress/harmony/unpack200/BandSet.java`
#### Snippet
```java
        final int count = counts.length;
        if (count == 0) {
            return new String[][] {{}};
        }
        final String[][] result = new String[count][];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/compress/harmony/unpack200/BandSet.java`
#### Snippet
```java
        final int count = counts.length;
        if (count == 0) {
            return new long[][] {{}};
        }
        int sum = 0;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentHeader.java`
#### Snippet
```java
    public InputStream getBandHeadersInputStream() {
        if (bandHeadersInputStream == null) {
            bandHeadersInputStream = new ByteArrayInputStream(new byte[0]);
        }
        return bandHeadersInputStream;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/compress/harmony/unpack200/Segment.java`
#### Snippet
```java
                classFile.attributes = new Attribute[] {(Attribute) cp.add(sourceFileAttribute)};
            } else {
                classFile.attributes = new Attribute[] {};
            }
        } else {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/compress/archivers/arj/ArjArchiveInputStream.java`
#### Snippet
```java
                    extendedHeaders.add(extendedHeaderBytes);
                }
                localFileHeader.extendedHeaders = extendedHeaders.toArray(new byte[0][]);

                return localFileHeader;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		method_flags = new long[numClasses][];
		for (int i = 0; i < numClasses; i++) {
			field_flags[i] = new long[0];
			method_flags[i] = new long[0];
		}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		for (int i = 0; i < numClasses; i++) {
			field_flags[i] = new long[0];
			method_flags[i] = new long[0];
		}
		// minor_versions = new int[numClasses];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipSplitReadOnlySeekableByteChannel.java`
#### Snippet
```java
        channelsList.add(lastSegmentChannel);

        return forOrderedSeekableByteChannels(channelsList.toArray(new SeekableByteChannel[0]));
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/compress/archivers/sevenz/Archive.java`
#### Snippet
```java
    long packPos;
    /// Size of each packed stream.
    long[] packSizes = {};
    /// Whether each particular packed streams has a CRC.
    BitSet packCrcsDefined;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/compress/archivers/sevenz/AES256Options.java`
#### Snippet
```java
     */
    public AES256Options(final char[] password) {
        this(password, new byte[0], randomBytes(16), 19);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZOutputFile.java`
#### Snippet
```java
        }
        if (!moreStreams.isEmpty()) {
            additionalCountingStreams = moreStreams.toArray(new CountingOutputStream[0]);
        }
        return new CountingOutputStream(out) {
```

## RuleId[ruleID=TypeParameterExtendsObject]
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

## RuleId[ruleID=UnusedAssignment]
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
        final byte[] buffer = new byte[buffersize];
        int n = 0;
        long count=0;
        while (-1 != (n = input.read(buffer))) {
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
Variable `nullsAllowed` initializer `false` is redundant
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        private List<ConstantPoolEntry> band;

        private boolean nullsAllowed = false;

        public Reference(final String tag) {
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
Variable `n` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/archivers/dump/TapeInputStream.java`
#### Snippet
```java
            }

            int n = 0;

            if ((readOffset + (len - bytes)) <= blockSize) {
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
Variable `reclen` initializer `0` is redundant
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java`
#### Snippet
```java
            }

            int reclen = 0;

            for (int i = 0; i < datalen - 8 && i < size - 8;
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
            }

            nid = getUnsignedByte(header);
        }
    }
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

## RuleId[ruleID=IndexOfReplaceableByContains]
### IndexOfReplaceableByContains
`layout.indexOf("KS") < 0` can be replaced with '!layout.contains("KS")'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/AttributeLayout.java`
#### Snippet
```java
            return Codec.BCI5;
        }
        if (layout.indexOf('S') >= 0 && layout.indexOf("KS") < 0 //$NON-NLS-1$
            && layout.indexOf("RS") < 0) { //$NON-NLS-1$
            return Codec.SIGNED5;
```

### IndexOfReplaceableByContains
`layout.indexOf("RS") < 0` can be replaced with '!layout.contains("RS")'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/AttributeLayout.java`
#### Snippet
```java
        }
        if (layout.indexOf('S') >= 0 && layout.indexOf("KS") < 0 //$NON-NLS-1$
            && layout.indexOf("RS") < 0) { //$NON-NLS-1$
            return Codec.SIGNED5;
        }
```

### IndexOfReplaceableByContains
`layoutElement.indexOf("KS") < 0` can be replaced with '!layoutElement.contains("KS")'
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
            return Codec.BCI5;
        }
        if (layoutElement.indexOf('S') >= 0 && layoutElement.indexOf("KS") < 0 //$NON-NLS-1$
            && layoutElement.indexOf("RS") < 0) { //$NON-NLS-1$
            return Codec.SIGNED5;
```

### IndexOfReplaceableByContains
`layoutElement.indexOf("RS") < 0` can be replaced with '!layoutElement.contains("RS")'
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        }
        if (layoutElement.indexOf('S') >= 0 && layoutElement.indexOf("KS") < 0 //$NON-NLS-1$
            && layoutElement.indexOf("RS") < 0) { //$NON-NLS-1$
            return Codec.SIGNED5;
        }
```

### IndexOfReplaceableByContains
`layoutElement.indexOf("KS") < 0` can be replaced with '!layoutElement.contains("KS")'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
            return Codec.BCI5;
        }
        if (layoutElement.indexOf('S') >= 0 && layoutElement.indexOf("KS") < 0 //$NON-NLS-1$
            && layoutElement.indexOf("RS") < 0) { //$NON-NLS-1$
            return Codec.SIGNED5;
```

### IndexOfReplaceableByContains
`layoutElement.indexOf("RS") < 0` can be replaced with '!layoutElement.contains("RS")'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
        }
        if (layoutElement.indexOf('S') >= 0 && layoutElement.indexOf("KS") < 0 //$NON-NLS-1$
            && layoutElement.indexOf("RS") < 0) { //$NON-NLS-1$
            return Codec.SIGNED5;
        }
```

## RuleId[ruleID=ConstantValue]
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

## RuleId[ruleID=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `matches()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/compress/archivers/jar/JarArchiveInputStream.java`
#### Snippet
```java
     * @return true, if this stream is a jar archive stream, false otherwise
     */
    public static boolean matches(final byte[] signature, final int length ) {
        return ZipArchiveInputStream.matches(signature, length);
    }
```

### MethodOverridesStaticMethod
Method `forFiles()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipSplitReadOnlySeekableByteChannel.java`
#### Snippet
```java
     * the beginning of a split archive
     */
    public static SeekableByteChannel forFiles(final File... files) throws IOException {
        final List<Path> paths = new ArrayList<>();
        for (final File f : Objects.requireNonNull(files, "files must not be null")) {
```

### MethodOverridesStaticMethod
Method `forPaths()` tries to override a static method of a superclass
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipSplitReadOnlySeekableByteChannel.java`
#### Snippet
```java
     * @since 1.22
     */
    public static SeekableByteChannel forPaths(final Path... paths) throws IOException {
        final List<SeekableByteChannel> channels = new ArrayList<>();
        for (final Path path : Objects.requireNonNull(paths, "paths must not be null")) {
```

## RuleId[ruleID=IOResource]
### IOResource
'GZIPOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/commons/compress/harmony/pack200/Archive.java`
#### Snippet
```java
        this.options = options;
        if (options.isGzip()) {
            outputStream = new GZIPOutputStream(outputStream);
        }
        this.outputStream = new BufferedOutputStream(outputStream);
```

### IOResource
'GZIPOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/commons/compress/harmony/pack200/Archive.java`
#### Snippet
```java
        this.options = options;
        if (options.isGzip()) {
            outputStream = new GZIPOutputStream(outputStream);
        }
        this.outputStream = new BufferedOutputStream(outputStream);
```

### IOResource
'BufferedInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/commons/compress/harmony/unpack200/Segment.java`
#### Snippet
```java
    void unpackRead(InputStream in) throws IOException, Pack200Exception {
        if (!in.markSupported()) {
            in = new BufferedInputStream(in);
        }

```

### IOResource
'DataOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZOutputFile.java`
#### Snippet
```java

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final DataOutputStream out = new DataOutputStream(baos);
        out.write(0);
        for (final SevenZArchiveEntry entry : files) {
```

### IOResource
'CheckedInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
        if (verifyCrc) {
            final long position = channel.position();
            final CheckedInputStream cis = new CheckedInputStream(Channels.newInputStream(channel), new CRC32());
            if (cis.skip(nextHeaderSizeInt) != nextHeaderSizeInt) {
                throw new IOException("Problem computing NextHeader CRC-32");
```

## RuleId[ruleID=FieldMayBeStatic]
### FieldMayBeStatic
Field `have_file_modtime` may be 'static'
in `src/main/java/org/apache/commons/compress/harmony/pack200/SegmentHeader.java`
#### Snippet
```java

    private boolean deflate_hint;
    private final boolean have_file_modtime = true;
    private final boolean have_file_options = true;
    private boolean have_file_size_hi;
```

### FieldMayBeStatic
Field `have_file_options` may be 'static'
in `src/main/java/org/apache/commons/compress/harmony/pack200/SegmentHeader.java`
#### Snippet
```java
    private boolean deflate_hint;
    private final boolean have_file_modtime = true;
    private final boolean have_file_options = true;
    private boolean have_file_size_hi;
    private boolean have_class_flags_hi;
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Charsets` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/utils/Charsets.java`
#### Snippet
```java
 * @since 1.4
 */
public class Charsets {

    //
```

### UtilityClassWithoutPrivateConstructor
Class `OsgiUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/utils/OsgiUtils.java`
#### Snippet
```java
 * @since 1.21
 */
public class OsgiUtils {

    private static final boolean inOsgiEnvironment;
```

### UtilityClassWithoutPrivateConstructor
Class `CharsetNames` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/utils/CharsetNames.java`
#### Snippet
```java
 * @since 1.4
 */
public class CharsetNames {
    /**
     * CharEncodingISO Latin Alphabet No. 1, a.k.a. ISO-LATIN-1.
```

### UtilityClassWithoutPrivateConstructor
Class `FileNameUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/utils/FileNameUtils.java`
#### Snippet
```java
 * @since 1.20
 */
public class FileNameUtils {

    private static String fileNameToBaseName(final String name) {
```

### UtilityClassWithoutPrivateConstructor
Class `Messages` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/harmony/archive/internal/nls/Messages.java`
#### Snippet
```java
 *
 */
public class Messages {

    // ResourceBundle holding the system messages.
```

### UtilityClassWithoutPrivateConstructor
Class `CanonicalCodecFamilies` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies.java`
#### Snippet
```java
 * Sets of codecs that share characteristics. Mainly used for different effort compression heuristics in BandSet.
 */
public class CanonicalCodecFamilies {

    // Families of codecs for bands of positive integers that do not correlate
```

### UtilityClassWithoutPrivateConstructor
Class `CodecEncoding` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java
 * CodecEncoding is used to get the right Codec for a given meta-encoding
 */
public class CodecEncoding {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `PackingUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/harmony/pack200/PackingUtils.java`
#### Snippet
```java
import org.apache.commons.compress.harmony.pack200.Archive.PackingFile;

public class PackingUtils {

    private static class PackingLogger extends Logger {
```

### UtilityClassWithoutPrivateConstructor
Class `SegmentUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentUtils.java`
#### Snippet
```java
 * Utility class for unpack200
 */
public final class SegmentUtils {

    public static int countArgs(final String descriptor) {
```

### UtilityClassWithoutPrivateConstructor
Class `HostOs` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/archivers/arj/ArjArchiveEntry.java`
#### Snippet
```java
     * The known values for HostOs.
     */
    public static class HostOs {
        public static final int DOS = 0;
        public static final int PRIMOS = 1;
```

### UtilityClassWithoutPrivateConstructor
Class `HostOS` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/archivers/arj/MainHeader.java`
#### Snippet
```java
        static final int ALTNAME = 0x80;
    }
    static class HostOS {
        static final int MS_DOS = 0;
        static final int PRIMOS = 1;
```

### UtilityClassWithoutPrivateConstructor
Class `Flags` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/archivers/arj/MainHeader.java`
#### Snippet
```java

class MainHeader {
    static class Flags {
        static final int GARBLED = 0x01;
        static final int OLD_SECURED_NEW_ANSI_PAGE = 0x02;
```

### UtilityClassWithoutPrivateConstructor
Class `Flags` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/archivers/arj/LocalFileHeader.java`
#### Snippet
```java
        static final int CHAPTER_LABEL = 5;
    }
    static class Flags {
        static final int GARBLED = 0x01;
        static final int VOLUME = 0x04;
```

### UtilityClassWithoutPrivateConstructor
Class `FileTypes` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/archivers/arj/LocalFileHeader.java`
#### Snippet
```java

class LocalFileHeader {
    static class FileTypes {
        static final int BINARY = 0;
        static final int SEVEN_BIT_TEXT = 1;
```

### UtilityClassWithoutPrivateConstructor
Class `Methods` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/archivers/arj/LocalFileHeader.java`
#### Snippet
```java
        static final int BACKUP = 0x20;
    }
    static class Methods {
        static final int STORED = 0;
        static final int COMPRESSED_MOST = 1;
```

### UtilityClassWithoutPrivateConstructor
Class `Lister` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/archivers/Lister.java`
#### Snippet
```java
 * @since 1.1
 */
public final class Lister {

    private static final ArchiveStreamFactory FACTORY = ArchiveStreamFactory.DEFAULT;
```

### UtilityClassWithoutPrivateConstructor
Class `TarGnuSparseKeys` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/archivers/tar/TarGnuSparseKeys.java`
#### Snippet
```java
 * GNU sparse key names.
 */
class TarGnuSparseKeys {

    static final String MAP = "GNU.sparse.map";
```

### UtilityClassWithoutPrivateConstructor
Class `ExtraFieldUtils` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/archivers/zip/ExtraFieldUtils.java`
#### Snippet
```java
 */
// CheckStyle:HideUtilityClassConstructorCheck OFF (bc)
public class ExtraFieldUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CpioUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioUtil.java`
#### Snippet
```java
 * @Immutable
 */
class CpioUtil {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `NID` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/archivers/sevenz/NID.java`
#### Snippet
```java
package org.apache.commons.compress.archivers.sevenz;

final class NID {
    public static final int kEnd = 0x00;
    public static final int kHeader = 0x01;
```

### UtilityClassWithoutPrivateConstructor
Class `CLI` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/archivers/sevenz/CLI.java`
#### Snippet
```java
import java.io.IOException;

public class CLI {


```

### UtilityClassWithoutPrivateConstructor
Class `Coders` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/archivers/sevenz/Coders.java`
#### Snippet
```java
import org.tukaani.xz.X86Options;

class Coders {
    static class BCJDecoder extends AbstractCoder {
        private final FilterOptions opts;
```

### UtilityClassWithoutPrivateConstructor
Class `Rand` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/compress/compressors/bzip2/Rand.java`
#### Snippet
```java
 * Random numbers for both the compress and decompress BZip2 classes.
 */
final class Rand {

    private static final int[] RNUMS = {
```

## RuleId[ruleID=DataFlowIssue]
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

## RuleId[ruleID=SimplifyStreamApiCallChains]
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

## RuleId[ruleID=StringOperationCanBeSimplified]
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

## RuleId[ruleID=DeprecatedIsStillUsed]
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

## RuleId[ruleID=ComparatorCombinators]
### ComparatorCombinators
Can be replaced with 'Comparator.comparingInt'
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java

		// Sort non-predefined attribute bands
		final Comparator<NewAttributeBands> comparator = (arg0, arg1) -> arg0.getFlagIndex() - arg1.getFlagIndex();
		classAttributeBands.sort(comparator);
		methodAttributeBands.sort(comparator);
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'onUnparseableData' in a Serializable class
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java
        }

        private final ExtraFieldUtils.UnparseableExtraField onUnparseableData;

        ExtraFieldParsingMode(final ExtraFieldUtils.UnparseableExtraField onUnparseableData) {
```

## RuleId[ruleID=CatchMayIgnoreException]
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

## RuleId[ruleID=ProtectedMemberInFinalClass]
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

## RuleId[ruleID=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
                                && (c != '_')) {
                                classes.add(className.toString());
                                i = j - 1;
                                break;
                            }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/CodeAttribute.java`
#### Snippet
```java
                // instruction is from the opcode manager, so ignore the
                // next instruction
                i++;
            }
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/ClassFile.java`
#### Snippet
```java
            // gets written
            if (entry.getTag() == ConstantPoolEntry.CP_Double || entry.getTag() == ConstantPoolEntry.CP_Long) {
                i++;
            }
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/BcBands.java`
#### Snippet
```java
                                    "Found unhandled " + ByteCode.getByteCode(nextInstruction));
                            }
                            i++;
                            break;
                        case 230: // invokespecial_this_init
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveInputStream.java`
#### Snippet
```java
            if (namebuffer[i] == '\012' || namebuffer[i] == 0) {
                if (namebuffer[i - 1] == '/') {
                    i--; // drop trailing /
                }
                return ArchiveUtils.toAsciiString(namebuffer, offset, i - offset);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `c`
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java`
#### Snippet
```java

        for (int i = 1, c = cftab[0]; i <= 256; i++) {
            c += cftab[i];
            cftab[i] = c;
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `pp`
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java`
#### Snippet
```java
            for (int j = 0; j < alphaSize; j++) {
                if (length[j] == i) {
                    perm[pp++] = j;
                }
            }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `b`
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java`
#### Snippet
```java

        for (int i = 1, b = base[0]; i < MAX_CODE_LEN; i++) {
            b += base[i];
            base[i] = b;
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `vec`
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java`
#### Snippet
```java
        for (int i = minLen, vec = 0, b = base[i]; i <= maxLen; i++) {
            final int nb = base[i + 1];
            vec += nb - b;
            b = nb;
            limit[i] = vec - 1;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `b`
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java`
#### Snippet
```java
            final int nb = base[i + 1];
            vec += nb - b;
            b = nb;
            limit[i] = vec - 1;
            vec <<= 1;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `vec`
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java`
#### Snippet
```java
            b = nb;
            limit[i] = vec - 1;
            vec <<= 1;
        }

```

## RuleId[ruleID=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java

        public static Set<PERMISSION> find(final int code) {
            final Set<PERMISSION> set = new HashSet<>();

            for (final PERMISSION p : PERMISSION.values()) {
```

## RuleId[ruleID=InnerClassMayBeStatic]
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
Inner class `LayoutElement` may be 'static'
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java

    }
    public abstract class LayoutElement implements AttributeLayoutElement {

        protected int getLength(final char uint_type) {
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

## RuleId[ruleID=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/Segment.java`
#### Snippet
```java
            String name = fileName[i];

            final boolean nameIsEmpty = (name == null) || name.equals("");
            final boolean isClass = (fileOptions[i] & 2) == 2 || nameIsEmpty;
            if (isClass && nameIsEmpty) {
```

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/compress/archivers/examples/Archiver.java`
#### Snippet
```java
            }
        }
        try (@SuppressWarnings("resource") // ArchiveOutputStream wraps newOutputStream result
        ArchiveOutputStream outputStream = ArchiveStreamFactory.DEFAULT.createArchiveOutputStream(format,
            Files.newOutputStream(target))) {
            create(outputStream, directory, EMPTY_FileVisitOption);
        }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/compress/archivers/sevenz/Coders.java`
#### Snippet
```java
        @SuppressWarnings("resource")
        @Override
        OutputStream encode(final OutputStream out, final Object options) {
            return new FlushShieldFilterOutputStream(opts.getOutputStream(new FinishableWrapperOutputStream(out)));
        }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/compress/archivers/sevenz/DeltaDecoder.java`
#### Snippet
```java
    @SuppressWarnings("resource")
    @Override
    OutputStream encode(final OutputStream out, final Object options) throws IOException {
        final int distance = toInt(options, 1);
        try {
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/commons/compress/archivers/sevenz/LZMA2Decoder.java`
#### Snippet
```java
    @SuppressWarnings("resource") // Caller closes result.
    @Override
    OutputStream encode(final OutputStream out, final Object opts) throws IOException {
        return getOptions(opts).getOutputStream(new FinishableWrapperOutputStream(out));
    }
```

## RuleId[ruleID=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/BHSDCodec.java`
#### Snippet
```java
                }
            }
            byteList.add(Byte.valueOf((byte) byteN));
            if (byteN < l) {
                break;
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java
            final HashMap<BHSDCodec, Integer> reverseMap = new HashMap<>(canonicalCodec.length);
            for (int i = 0; i < canonicalCodec.length; i++) {
                reverseMap.put(canonicalCodec[i], Integer.valueOf(i));
            }
            canonicalCodecsToSpecifiers = reverseMap;
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
			final Integer index = classNameToIndex.get(cpClassName);
			if (index == null) {
				classNameToIndex.put(cpClassName, Integer.valueOf(1));
				mOrF.setIndexInClass(0);
			} else {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
				final int theIndex = index.intValue();
				mOrF.setIndexInClass(theIndex);
				classNameToIndex.put(cpClassName, Integer.valueOf(theIndex + 1));
			}
		});
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
			final Integer index = classNameToIndex.get(cpClassName);
			if (index == null) {
				classNameToIndex.put(cpClassName, Integer.valueOf(1));
				mOrF.setIndexInClass(0);
			} else {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
				final int theIndex = index.intValue();
				mOrF.setIndexInClass(theIndex);
				classNameToIndex.put(cpClassName, Integer.valueOf(theIndex + 1));
			}
			if (mOrF.getDesc().getName().equals("<init>")) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
				final Integer constructorIndex = classNameToConstructorIndex.get(cpClassName);
				if (constructorIndex == null) {
					classNameToConstructorIndex.put(cpClassName, Integer.valueOf(1));
					mOrF.setIndexInClassForConstructor(0);
				} else {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
					final int theIndex = constructorIndex.intValue();
					mOrF.setIndexInClassForConstructor(theIndex);
					classNameToConstructorIndex.put(cpClassName, Integer.valueOf(theIndex + 1));
				}
			}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
                // do better?)
                cpUtf8Suffix[i - 1] = 0;
                bigSuffix.add(Integer.valueOf(suffix.length));
                addCharacters(bigChars, suffix);
            } else {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
    private void addCharacters(final List<Character> chars, final char[] charArray) {
        for (final char element : charArray) {
            chars.add(Character.valueOf(element));
        }
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java

    public void visitLabel(final Label label) {
        labelsToOffsets.put(label, Integer.valueOf(byteCodeOffset));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
                    final int relativeOffset = bcLabelRelativeOffsets.get(i);
                    bcLabel.add(i,
                        Integer.valueOf(bciRenumbering.get(offset.intValue()) - bciRenumbering.get(relativeOffset)));
                }
            }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/AttributeLayoutMap.java`
#### Snippet
```java

    public void add(final AttributeLayout layout) {
        getLayout(layout.getContext()).put(Integer.valueOf(layout.getIndex()), layout);
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/AttributeLayoutMap.java`
#### Snippet
```java
    public AttributeLayout getAttributeLayout(final int index, final int context) {
        final Map<Integer, AttributeLayout> map = getLayout(context);
        return map.get(Integer.valueOf(index));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
            }
            nameRU.add(name);
            caseArrayN.add(Integer.valueOf(0));
            return new ArrayVisitor(caseArrayN, tags, nameRU, values);
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
                public void visit(final String name, final Object value) {
                    final Integer numPairs = nestPairN.remove(nestPairN.size() - 1);
                    nestPairN.add(Integer.valueOf(numPairs.intValue() + 1));
                    nestNameRU.add(name);
                    addValueAndTag(value, tags, values);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
        public void visit(String name, final Object value) {
            final Integer numCases = caseArrayN.remove(indexInCaseArrayN);
            caseArrayN.add(indexInCaseArrayN, Integer.valueOf(numCases.intValue() + 1));
            if (name == null) {
                name = "";
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
            nameRU.add(name);
            nestTypeRS.add(desc);
            nestPairN.add(Integer.valueOf(0));
            return new AnnotationVisitor(context, av) {
                @Override
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
        } else if (value instanceof Byte) {
            tags.add("B");
            values.add(Integer.valueOf(((Byte) value).intValue()));
        } else if (value instanceof Character) {
            tags.add("C");
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
        } else if (value instanceof Character) {
            tags.add("C");
            values.add(Integer.valueOf(((Character) value).charValue()));
        } else if (value instanceof Short) {
            tags.add("S");
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
        } else if (value instanceof Short) {
            tags.add("S");
            values.add(Integer.valueOf(((Short) value).intValue()));
        } else if (value instanceof Boolean) {
            tags.add("Z");
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
        } else if (value instanceof Boolean) {
            tags.add("Z");
            values.add(Integer.valueOf(((Boolean) value).booleanValue() ? 1 : 0));
        } else if (value instanceof String) {
            tags.add("s");
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
            }
            nameRU.add(name);
            caseArrayN.add(Integer.valueOf(0));
            return new ArrayVisitor(caseArrayN, tags, nameRU, values);
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
        public void visitEnum(final String name, final String desc, final String value) {
            final Integer numCases = caseArrayN.remove(caseArrayN.size() - 1);
            caseArrayN.add(Integer.valueOf(numCases.intValue() + 1));
            tags.add("e");
            values.add(desc);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
                public void visitEnum(final String name, final String desc, final String value) {
                    final Integer numPairs = nestPairN.remove(nestPairN.size() - 1);
                    nestPairN.add(Integer.valueOf(numPairs.intValue() + 1));
                    tags.add("e");
                    nestNameRU.add(name);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentConstantPoolArrayCache.java`
#### Snippet
```java
                final String key = primaryArray[index];
                primaryTable.computeIfAbsent(key, k -> new ArrayList<>());
                primaryTable.get(key).add(Integer.valueOf(index));
            }
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
        final Map<Integer, Integer> favoredToIndex = new HashMap<>();
        for (int i = 0; i < favored.size(); i++) {
            favoredToIndex.put(favored.get(i), Integer.valueOf(i));
        }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
        final int[] tokens = new int[band.length];
        for (int i = 0; i < band.length; i++) {
            final Integer favouredIndex = favoredToIndex.get(Integer.valueOf(band[i]));
            if (favouredIndex == null) {
                tokens[i] = 0;
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
        public BandData(final int[] band) {
            this.band = band;
            final Integer one = Integer.valueOf(1);
            for (int i = 0; i < band.length; i++) {
                if (band[i] < smallest) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
                        distinctValues = new HashMap<>();
                    }
                    final Integer value = Integer.valueOf(band[i]);
                    Integer count = distinctValues.get(value);
                    if (count == null) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
                        count = one;
                    } else {
                        count = Integer.valueOf(count.intValue() + 1);
                    }
                    distinctValues.put(value, count);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/IcBands.java`
#### Snippet
```java
        // Now order the result as a subsequence of ic_all
        relevantTuples.sort((arg0, arg1) -> {
            final Integer index1 = Integer.valueOf(arg0.getTupleIndex());
            final Integer index2 = Integer.valueOf(arg1.getTupleIndex());
            return index1.compareTo(index2);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/IcBands.java`
#### Snippet
```java
        relevantTuples.sort((arg0, arg1) -> {
            final Integer index1 = Integer.valueOf(arg0.getTupleIndex());
            final Integer index2 = Integer.valueOf(arg1.getTupleIndex());
            return index1.compareTo(index2);
        });
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
            throw new IOException("Error reading from the input stream");
        }
        return Integer.valueOf(Integer.parseInt((negative ? "-" : "") + new String(digits)));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
                    final Integer bytecodeIndex = labelsToOffsets.get(label);
                    final Integer renumberedOffset = Integer
                        .valueOf(bciRenumbering.get(bytecodeIndex.intValue()) - ((Integer) relative.get(i)).intValue());
                    band.add(i, renumberedOffset);
                }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java

        public boolean hasTag(final long l) {
            return tags.contains(Integer.valueOf((int) l));
        }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
                        band.remove(i);
                        final Integer bytecodeIndex = labelsToOffsets.get(label);
                        band.add(i, Integer.valueOf(bciRenumbering.get(bytecodeIndex.intValue())));
                    }
                }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
            }
            if (val == null) {
                val = Integer.valueOf(value);
            }
            band.add(val);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java
        mapUTF8 = new HashMap<>(cpUTF8Count + 1);
        cpUTF8[0] = ""; //$NON-NLS-1$
        mapUTF8.put("", Integer.valueOf(0));
        final int[] prefix = decodeBandInt("cpUTF8Prefix", in, Codec.DELTA5, cpUTF8Count - 2);
        int charCount = 0;
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java
                cpUTF8[i] = lastString.substring(0, i > 1 ? prefix[i - 2] : 0)
                    + new String(bigSuffixData[bigSuffixCount++]);
                mapUTF8.put(cpUTF8[i], Integer.valueOf(i));
            } else {
                cpUTF8[i] = lastString.substring(0, i > 1 ? prefix[i - 2] : 0)
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java
                    + new String(data, charCount, suffix[i - 1]);
                charCount += suffix[i - 1];
                mapUTF8.put(cpUTF8[i], Integer.valueOf(i));
            }
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java
        for (int i = 0; i < cpDescriptorCount; i++) {
            cpDescriptor[i] = cpDescriptorNames[i] + ":" + cpDescriptorTypes[i]; //$NON-NLS-1$
            mapDescriptor.put(cpDescriptor[i], Integer.valueOf(i));
        }
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java

    public CPInteger cpIntegerValue(final int index) {
        final Integer i = Integer.valueOf(cpInt[index]);
        CPInteger cpInteger = integersToCPIntegers.get(i);
        if (cpInteger == null) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java

    public CPDouble cpDoubleValue(final int index) {
        final Double dbl = Double.valueOf(cpDouble[index]);
        CPDouble cpDouble = doublesToCPDoubles.get(dbl);
        if (cpDouble == null) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java
            }
            cpSignature[i] = signature.toString();
            mapSignature.put(signature.toString(), Integer.valueOf(i));
        }
//        for (int i = 0; i < cpSignatureInts.length; i++) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java

    public CPLong cpLongValue(final int index) {
        final Long l = Long.valueOf(cpLong[index]);
        CPLong cpLong = longsToCPLongs.get(l);
        if (cpLong == null) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java

    public CPFloat cpFloatValue(final int index) {
        final Float f = Float.valueOf(cpFloat[index]);
        CPFloat cpFloat = floatsToCPFloats.get(f);
        if (cpFloat == null) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/CpBands.java`
#### Snippet
```java
        for (int i = 0; i < cpClassCount; i++) {
            cpClass[i] = cpUTF8[cpClassInts[i]];
            mapClass.put(cpClass[i], Integer.valueOf(i));
        }
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/CodeAttribute.java`
#### Snippet
```java
        this.codeLength = 0;
        this.exceptionTable = exceptionTable;
        byteCodeOffsets.add(Integer.valueOf(0));
        int byteCodeIndex = 0;
        for (int i = 0; i < codePacked.length; i++) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/CodeAttribute.java`
#### Snippet
```java
            // another bytecode.
            if (byteCode.hasMultipleByteCodes()) {
                byteCodeOffsets.add(Integer.valueOf(lastBytecodePosition + 1));
                byteCodeIndex++;
            }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/CodeAttribute.java`
#### Snippet
```java
            // after the last element.
            if (i < (codePacked.length - 1)) {
                byteCodeOffsets.add(Integer.valueOf(lastBytecodePosition + byteCode.getLength()));
            }
            if (byteCode.getOpcode() == 0xC4) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/NewAttribute.java`
#### Snippet
```java

    public void addBCIndex(final int length, final int value) {
        lengths.add(Integer.valueOf(length));
        body.add(new BCIndex(value));
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/NewAttribute.java`
#### Snippet
```java

    public void addToBody(final int length, final Object value) {
        lengths.add(Integer.valueOf(length));
        body.add(value);
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/NewAttribute.java`
#### Snippet
```java

    public void addInteger(final int length, final long value) {
        lengths.add(Integer.valueOf(length));
        body.add(Long.valueOf(value));
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/NewAttribute.java`
#### Snippet
```java
    public void addInteger(final int length, final long value) {
        lengths.add(Integer.valueOf(length));
        body.add(Long.valueOf(value));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/NewAttribute.java`
#### Snippet
```java

    public void addBCLength(final int length, final int value) {
        lengths.add(Integer.valueOf(length));
        body.add(new BCLength(value));
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/NewAttribute.java`
#### Snippet
```java

    public void addBCOffset(final int length, final int value) {
        lengths.add(Integer.valueOf(length));
        body.add(new BCOffset(value));
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
            throw new IOException("Error reading from the input stream");
        }
        return Integer.valueOf(Integer.parseInt((negative ? "-" : "") + new String(digits)));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java

        public boolean hasTag(final int i) {
            return tags.contains(Integer.valueOf(i));
        }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java

        public boolean hasTag(final long l) {
            return tags.contains(Integer.valueOf((int) l));
        }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/ClassConstantPool.java`
#### Snippet
```java

        for (final ClassFileEntry entry : startOfPool) {
            indexCache.put(entry, Integer.valueOf(index));

            if (entry instanceof CPLong || entry instanceof CPDouble) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/ClassConstantPool.java`
#### Snippet
```java

        for (final ClassFileEntry entry : finalSort) {
            indexCache.put(entry, Integer.valueOf(index));

            if (entry instanceof CPLong || entry instanceof CPDouble) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/unpack200/BcBands.java`
#### Snippet
```java
                        case 196: // wide
                            final int nextInstruction = 0xff & methodByteCodePacked[c][m][i + 1];
                            wideByteCodes.add(Integer.valueOf(nextInstruction));
                            if (nextInstruction == 132) { // iinc
                                bcLocalCount++;
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				final int flagIndex = bands.getFlagIndex();
				final Long flags = tempFieldFlags.remove(tempFieldFlags.size() - 1);
				tempFieldFlags.add(Long.valueOf(flags.longValue() | (1 << flagIndex)));
				return;
			}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
			}
			final Long flag = tempMethodFlags.remove(tempMethodFlags.size() - 1);
			tempMethodFlags.add(Long.valueOf(flag.longValue() | (1 << 23)));
		} else {
			if (tempMethodRIPA == null) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
			}
			final Long flag = tempMethodFlags.remove(tempMethodFlags.size() - 1);
			tempMethodFlags.add(Long.valueOf(flag.longValue() | (1 << 24)));
		}
	}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				final int flagIndex = bands.getFlagIndex();
				final Long flags = tempMethodFlags.remove(tempMethodFlags.size() - 1);
				tempMethodFlags.add(Long.valueOf(flags.longValue() | (1 << flagIndex)));
				return;
			}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				list.remove(i);
				final Integer bytecodeIndex = labelsToOffsets.get(label);
				final Integer renumberedOffset = Integer.valueOf(bciRenumbering.get(bytecodeIndex.intValue())
						- relative.get(i).intValue() - firstOffset.get(i).intValue());
				list.add(i, renumberedOffset);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				removed++;
			} else if (!segment.getSegmentHeader().have_all_code_flags()) {
				codeFlags.add(Long.valueOf(0));
			}
		}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
			anySyntheticFields = true;
		}
		tempFieldFlags.add(Long.valueOf(flags));
	}

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				list.remove(i);
				final Integer bytecodeIndex = labelsToOffsets.get(label);
				list.add(i, Integer.valueOf(bciRenumbering.get(bytecodeIndex.intValue())));
			}
		}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
			if ((latestCodeFlag.intValue() & (1 << 3)) == 0) {
				codeFlags.remove(codeFlags.size() - 1);
				codeFlags.add(Long.valueOf(latestCodeFlag.intValue() | (1 << 3)));
				codeLocalVariableTypeTableN.add(1);
			} else {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		codeHandlerCount.add(0);
		if (!stripDebug) {
			codeFlags.add(Long.valueOf(1 << 2));
			codeLocalVariableTableN.add(0);
		}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				codeLocalVariableTableN.remove(codeLocalVariableTableN.size() - 1);
				codeFlags.remove(codeFlags.size() - 1);
				codeFlags.add(Long.valueOf(0));
			}
		}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		if ((latestCodeFlag.intValue() & (1 << 1)) == 0) {
			codeFlags.remove(codeFlags.size() - 1);
			codeFlags.add(Long.valueOf(latestCodeFlag.intValue() | (1 << 1)));
			codeLineNumberTableN.add(1);
		} else {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				final int flagIndex = bands.getFlagIndex();
				final Long flags = codeFlags.remove(codeFlags.size() - 1);
				codeFlags.add(Long.valueOf(flags.longValue() | (1 << flagIndex)));
				return;
			}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
	public void addMaxStack(final int maxStack, int maxLocals) {
		final Long latestFlag = tempMethodFlags.remove(tempMethodFlags.size() - 1);
		final Long newFlag = Long.valueOf(latestFlag.intValue() | (1 << 17));
		tempMethodFlags.add(newFlag);
		codeMaxStack.add(maxStack);
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
			flags = flags | (1 << 20);
		}
		tempMethodFlags.add(Long.valueOf(flags));
		numMethodArgs = countArgs(desc);
		if (!anySyntheticMethods && ((flags & (1 << 12)) != 0)
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		method_AD_bands.addAnnotation(null, nameRU, tags, values, caseArrayN, nestTypeRS, nestNameRU, nestPairN);
		final Long flag = tempMethodFlags.remove(tempMethodFlags.size() - 1);
		tempMethodFlags.add(Long.valueOf(flag.longValue() | (1 << 25)));
	}

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				final Integer bytecodeIndex = labelsToOffsets.get(label);
				final Integer renumberedOffset = Integer
						.valueOf(bciRenumbering.get(bytecodeIndex.intValue()) - relative.get(i).intValue());
				list.add(i, renumberedOffset);
			}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
					field_RVA_bands.newEntryInAnnoN();
				}
				tempFieldFlags.add(Long.valueOf(flag.intValue() | (1 << 21)));
			} else {
				field_RIA_bands.addAnnotation(desc, nameRU, tags, values, caseArrayN, nestTypeRS, nestNameRU,
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
					field_RIA_bands.newEntryInAnnoN();
				}
				tempFieldFlags.add(Long.valueOf(flag.intValue() | (1 << 22)));
			}
			break;
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
					method_RVA_bands.newEntryInAnnoN();
				}
				tempMethodFlags.add(Long.valueOf(flag.intValue() | (1 << 21)));
			} else {
				method_RIA_bands.addAnnotation(desc, nameRU, tags, values, caseArrayN, nestTypeRS, nestNameRU,
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
					method_RIA_bands.newEntryInAnnoN();
				}
				tempMethodFlags.add(Long.valueOf(flag.intValue() | (1 << 22)));
			}
			break;
```

## RuleId[ruleID=NonStrictComparisonCanBeEquality]
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

## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
        }
        if (name.equalsIgnoreCase("cpint")) {
            System.out.print("");
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/harmony/unpack200/Archive.java`
#### Snippet
```java
                    final Segment segment = new Segment();
                    segment.setLogLevel(logLevel);
                    segment.setLogStream(logFile != null ? (OutputStream) logFile : (OutputStream) System.out);
                    segment.setPreRead(false);

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/Lister.java`
#### Snippet
```java
    private static void listZipUsingTarFile(final File f) throws IOException {
        try (TarFile t = new TarFile(f)) {
            System.out.println("Created " + t);
            t.getEntries().forEach(en -> System.out.println(en.getName()));
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/Lister.java`
#### Snippet
```java
        try (TarFile t = new TarFile(f)) {
            System.out.println("Created " + t);
            t.getEntries().forEach(en -> System.out.println(en.getName()));
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/Lister.java`
#### Snippet
```java
        try (final InputStream fis = new BufferedInputStream(Files.newInputStream(f.toPath()));
                final ArchiveInputStream ais = createArchiveInputStream(args, fis)) {
            System.out.println("Created " + ais.toString());
            ArchiveEntry ae;
            while ((ae = ais.getNextEntry()) != null) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/Lister.java`
#### Snippet
```java
            ArchiveEntry ae;
            while ((ae = ais.getNextEntry()) != null) {
                System.out.println(ae.getName());
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/Lister.java`
#### Snippet
```java

    private static void usage() {
        System.out.println("Parameters: archive-name [archive-type]\n");
        System.out.println("The magic archive-type 'zipfile' prefers ZipFile over ZipArchiveInputStream");
        System.out.println("The magic archive-type 'tarfile' prefers TarFile over TarArchiveInputStream");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/Lister.java`
#### Snippet
```java
    private static void usage() {
        System.out.println("Parameters: archive-name [archive-type]\n");
        System.out.println("The magic archive-type 'zipfile' prefers ZipFile over ZipArchiveInputStream");
        System.out.println("The magic archive-type 'tarfile' prefers TarFile over TarArchiveInputStream");
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/Lister.java`
#### Snippet
```java
        System.out.println("Parameters: archive-name [archive-type]\n");
        System.out.println("The magic archive-type 'zipfile' prefers ZipFile over ZipArchiveInputStream");
        System.out.println("The magic archive-type 'tarfile' prefers TarFile over TarArchiveInputStream");
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/Lister.java`
#### Snippet
```java
    private static void listZipUsingZipFile(final File f) throws IOException {
        try (ZipFile z = new ZipFile(f)) {
            System.out.println("Created " + z);
            for (final Enumeration<ZipArchiveEntry> en = z.getEntries(); en.hasMoreElements(); ) {
                System.out.println(en.nextElement().getName());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/Lister.java`
#### Snippet
```java
            System.out.println("Created " + z);
            for (final Enumeration<ZipArchiveEntry> en = z.getEntries(); en.hasMoreElements(); ) {
                System.out.println(en.nextElement().getName());
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/Lister.java`
#### Snippet
```java
    private static void list7z(final File f) throws IOException {
        try (SevenZFile z = new SevenZFile(f)) {
            System.out.println("Created " + z);
            ArchiveEntry ae;
            while ((ae = z.getNextEntry()) != null) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/Lister.java`
#### Snippet
```java
                final String name = ae.getName() == null ? z.getDefaultName() + " (entry name was null)"
                    : ae.getName();
                System.out.println(name);
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/Lister.java`
#### Snippet
```java
            return;
        }
        System.out.println("Analysing " + args[0]);
        final File f = new File(args[0]);
        if (!f.isFile()) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/Lister.java`
#### Snippet
```java
        final File f = new File(args[0]);
        if (!f.isFile()) {
            System.err.println(f + " doesn't exist or is a directory");
        }
        final String format = args.length > 1 ? args[1] : detectFormat(f);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/sevenz/CLI.java`
#### Snippet
```java
            @Override
            public void takeAction(final SevenZFile archive, final SevenZArchiveEntry entry) {
                System.out.print(entry.getName());
                if (entry.isDirectory()) {
                    System.out.print(" dir");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/sevenz/CLI.java`
#### Snippet
```java
                System.out.print(entry.getName());
                if (entry.isDirectory()) {
                    System.out.print(" dir");
                } else {
                    System.out.print(" " + entry.getCompressedSize()
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/sevenz/CLI.java`
#### Snippet
```java
                    System.out.print(" dir");
                } else {
                    System.out.print(" " + entry.getCompressedSize()
                                     + "/" + entry.getSize());
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/sevenz/CLI.java`
#### Snippet
```java
                }
                if (entry.getHasLastModifiedDate()) {
                    System.out.print(" " + entry.getLastModifiedDate());
                } else {
                    System.out.print(" no last modified date");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/sevenz/CLI.java`
#### Snippet
```java
                    System.out.print(" " + entry.getLastModifiedDate());
                } else {
                    System.out.print(" no last modified date");
                }
                if (!entry.isDirectory()) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/sevenz/CLI.java`
#### Snippet
```java
                }
                if (!entry.isDirectory()) {
                    System.out.println(" " + getContentMethods(entry));
                } else {
                    System.out.println();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/sevenz/CLI.java`
#### Snippet
```java
                    System.out.println(" " + getContentMethods(entry));
                } else {
                    System.out.println();
                }
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/sevenz/CLI.java`
#### Snippet
```java
        }
        final Mode mode = grabMode(args);
        System.out.println(mode.getMessage() + " " + args[0]);
        final File f = new File(args[0]);
        if (!f.isFile()) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/sevenz/CLI.java`
#### Snippet
```java
        final File f = new File(args[0]);
        if (!f.isFile()) {
            System.err.println(f + " doesn't exist or is a directory");
        }
        try (final SevenZFile archive = new SevenZFile(f)) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/sevenz/CLI.java`
#### Snippet
```java

    private static void usage() {
        System.out.println("Parameters: archive-name [list]");
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java`
#### Snippet
```java
        try {
            if (!closed) {
                System.err.println("Cleaning up unclosed ZipFile for archive "
                                   + archiveName);
                close();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java`
#### Snippet
```java
    protected void finalize() throws Throwable {
        if (!closed) {
            System.err.println("Unclosed BZip2CompressorOutputStream detected, will *not* close it");
        }
        super.finalize();
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/compress/archivers/arj/ArjArchiveEntry.java`
#### Snippet
```java
    public String getName() {
        if ((localFileHeader.arjFlags & LocalFileHeader.Flags.PATHSYM) != 0) {
            return localFileHeader.name.replace("/",
                    File.separator);
        }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveInputStream.java`
#### Snippet
```java
     */
    private boolean isGNULongName(final String name) {
        return name != null && name.matches(GNU_LONGNAME_PATTERN);
    }

```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveInputStream.java`
#### Snippet
```java
     */
    private static boolean isBSDLongName(final String name) {
        return name != null && name.matches(BSD_LONGNAME_PATTERN);
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/compress/archivers/tar/TarUtils.java`
#### Snippet
```java
        String string = new String(buffer, offset, length, Charset.defaultCharset());

        string = string.replace("\0", "{NUL}"); // Replace NULs to allow string to be printed
        return "Invalid byte " + currentByte + " at offset " + (current - offset) + " in '" + string + "' len=" + length;
    }
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.harmony.pack200` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/harmony/pack200/Pack200PackerAdapter.java`
#### Snippet
```java
        completed(0);
        try {
            new org.apache.commons.compress.harmony.pack200.Archive(file, out, options).pack();
        } catch (final Pack200Exception e) {
            throw new IOException("Failed to pack Jar:" + e);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.harmony.pack200` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/harmony/pack200/Pack200PackerAdapter.java`
#### Snippet
```java

        try {
            new org.apache.commons.compress.harmony.pack200.Archive(in, out, options).pack();
        } catch (final Pack200Exception e) {
            throw new IOException("Failed to pack Jar:" + e);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.harmony.unpack200.bytecode` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/SuperInitMethodRefForm.java`
#### Snippet
```java
    @Override
    protected String context(
        final org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager operandManager) {
        return operandManager.getSuperClass();
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.archivers` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/ArchiveStreamProvider.java`
#### Snippet
```java
     * @param name
     *            the archive name, i.e.
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#AR},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#ZIP},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#TAR},
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.archivers` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/ArchiveStreamProvider.java`
#### Snippet
```java
     *            the archive name, i.e.
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#AR},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#ZIP},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#TAR},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#JAR}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.archivers` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/ArchiveStreamProvider.java`
#### Snippet
```java
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#AR},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#ZIP},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#TAR},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#JAR}
     *            or
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.archivers` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/ArchiveStreamProvider.java`
#### Snippet
```java
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#ZIP},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#TAR},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#JAR}
     *            or
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#CPIO}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.archivers` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/ArchiveStreamProvider.java`
#### Snippet
```java
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#JAR}
     *            or
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#CPIO}
     * @param out
     *            the output stream
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.archivers` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/ArchiveStreamProvider.java`
#### Snippet
```java
     * @param name
     *            the archive name, i.e.
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#AR},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#ARJ},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#ZIP},
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.archivers` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/ArchiveStreamProvider.java`
#### Snippet
```java
     *            the archive name, i.e.
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#AR},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#ARJ},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#ZIP},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#TAR},
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.archivers` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/ArchiveStreamProvider.java`
#### Snippet
```java
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#AR},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#ARJ},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#ZIP},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#TAR},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#JAR},
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.archivers` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/ArchiveStreamProvider.java`
#### Snippet
```java
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#ARJ},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#ZIP},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#TAR},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#JAR},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#CPIO},
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.archivers` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/ArchiveStreamProvider.java`
#### Snippet
```java
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#ZIP},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#TAR},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#JAR},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#CPIO},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#DUMP}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.archivers` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/ArchiveStreamProvider.java`
#### Snippet
```java
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#TAR},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#JAR},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#CPIO},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#DUMP}
     *            or
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.archivers` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/ArchiveStreamProvider.java`
#### Snippet
```java
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#JAR},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#CPIO},
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#DUMP}
     *            or
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#SEVEN_Z}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.archivers` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/ArchiveStreamProvider.java`
#### Snippet
```java
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#DUMP}
     *            or
     *            {@value org.apache.commons.compress.archivers.ArchiveStreamFactory#SEVEN_Z}
     * @param in
     *            the input stream
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.jar` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/jar/JarArchiveEntry.java`
#### Snippet
```java
    /**
     * This method is not implemented and won't ever be.
     * The JVM equivalent has a different name {@link java.util.jar.JarEntry#getAttributes()}
     *
     * @deprecated since 1.5, do not use; always returns null
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.zip` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/zip/X000A_NTFS.java`
#### Snippet
```java
     * @param offset the start offset
     * @param length the number of bytes in the array from offset
     * @throws java.util.zip.ZipException on error
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.zip` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/zip/X7875_NewUnix.java`
#### Snippet
```java
     * @param offset the start offset
     * @param length the number of bytes in the array from offset
     * @throws java.util.zip.ZipException on error
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.zip` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp.java`
#### Snippet
```java
     * @param offset the start offset
     * @param length the number of bytes in the array from offset
     * @throws java.util.zip.ZipException on error
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.zip` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/zip/StreamCompressor.java`
#### Snippet
```java
/**
 * Encapsulates a {@link Deflater} and crc calculator, handling multiple types of output streams.
 * Currently {@link java.util.zip.ZipEntry#DEFLATED} and {@link java.util.zip.ZipEntry#STORED} are the only
 * supported compression methods.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.zip` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/zip/StreamCompressor.java`
#### Snippet
```java
/**
 * Encapsulates a {@link Deflater} and crc calculator, handling multiple types of output streams.
 * Currently {@link java.util.zip.ZipEntry#DEFLATED} and {@link java.util.zip.ZipEntry#STORED} are the only
 * supported compression methods.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/zip/ParallelScatterZipCreator.java`
#### Snippet
```java
 * </p>
 * <p>
 * The client can supply an {@link java.util.concurrent.ExecutorService}, but for reasons of memory model consistency, this will be shut down by this class
 * prior to completion.
 * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/zip/ParallelScatterZipCreator.java`
#### Snippet
```java
    /**
     * Constructs a ParallelScatterZipCreator with default threads, which is set to the number of available
     * processors, as defined by {@link java.lang.Runtime#availableProcessors}
     */
    public ParallelScatterZipCreator() {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipEncoding.java`
#### Snippet
```java
 *
 * <p>The main reason for defining an own encoding layer comes from
 * the problems with {@link java.lang.String#getBytes(String)
 * String.getBytes}, which encodes unknown characters as ASCII
 * quotation marks ('?'). Quotation marks are per definition an
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.zip` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java
 * @NotThreadSafe
 */
public class ZipArchiveEntry extends java.util.zip.ZipEntry implements ArchiveEntry, EntryStreamOffsets {

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.zip` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java
    private int method = ZipMethod.UNKNOWN_CODE;
    /**
     * The {@link java.util.zip.ZipEntry#setSize} method in the base
     * class throws an IllegalArgumentException if the size is bigger
     * than 2GB for Java versions &lt; 7 and even in Java 7+ if the
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.zip` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java

    /**
     * The {@link java.util.zip.ZipEntry} base class only supports
     * the compression methods STORED and DEFLATED. We override the
     * field so that any compression methods can be used.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.zip` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java

    /**
     * Workaround for the fact that, as of Java 17, {@link java.util.zip.ZipEntry} parses NTFS
     * timestamps with a maximum precision of microseconds, which is lower than the 100ns precision
     * provided by this extra field.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.zip` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java

    /**
     * Workaround for the fact that, as of Java 17, {@link java.util.zip.ZipEntry} does not properly modify
     * the entry's {@code xdostime} field, only setting {@code mtime}. While this is not strictly necessary,
     * it's better to maintain the same behavior between this and the NTFS field.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.zip` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java
     * @throws ZipException on error
     */
    public ZipArchiveEntry(final java.util.zip.ZipEntry entry) throws ZipException {
        super(entry);
        setName(entry.getName());
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.zip` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java

    /**
     * Wraps {@link java.util.zip.ZipEntry#getTime} with a {@link Date} as the
     * entry's last modified date.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.zip` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java
     * entry's last modified date.
     *
     * <p>Changes to the implementation of {@link java.util.zip.ZipEntry#getTime}
     * leak through and the returned value may depend on your local
     * time zone as well as your version of Java.</p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.zip` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java
     */
    public ZipArchiveEntry(final ZipArchiveEntry entry) throws ZipException {
        this((java.util.zip.ZipEntry) entry);
        setInternalAttributes(entry.getInternalAttributes());
        setExternalAttributes(entry.getExternalAttributes());
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.charset` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/zip/NioZipEncoding.java`
#### Snippet
```java
/**
 * A ZipEncoding, which uses a java.nio {@link
 * java.nio.charset.Charset Charset} to encode names.
 * <p>The methods of this class are reentrant.</p>
 * @Immutable
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.archivers` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveEntry.java`
#### Snippet
```java
     *
     * @return Returns the filesize.
     * @see org.apache.commons.compress.archivers.ArchiveEntry#getSize()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.archivers` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java`
#### Snippet
```java
     * Creates a new ArchiveEntry. The entryName must be an ASCII encoded string.
     *
     * @see org.apache.commons.compress.archivers.ArchiveOutputStream#createArchiveEntry(java.io.File, String)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java`
#### Snippet
```java
     * Creates a new ArchiveEntry. The entryName must be an ASCII encoded string.
     *
     * @see org.apache.commons.compress.archivers.ArchiveOutputStream#createArchiveEntry(java.io.File, String)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.archivers` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java`
#### Snippet
```java
     * Creates a new ArchiveEntry. The entryName must be an ASCII encoded string.
     *
     * @see org.apache.commons.compress.archivers.ArchiveOutputStream#createArchiveEntry(java.io.File, String)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveOutputStream.java`
#### Snippet
```java
     * Creates a new ArchiveEntry. The entryName must be an ASCII encoded string.
     *
     * @see org.apache.commons.compress.archivers.ArchiveOutputStream#createArchiveEntry(java.io.File, String)
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/dump/TapeInputStream.java`
#### Snippet
```java

    /**
     * @see java.io.InputStream#read()
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/dump/TapeInputStream.java`
#### Snippet
```java

    /**
     * @see java.io.InputStream#available
     */
    @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.zip` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java`
#### Snippet
```java
     * Compression method for stored entries.
     */
    public static final int STORED = java.util.zip.ZipEntry.STORED;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java`
#### Snippet
```java
     * when calling {@link #putArchiveEntry} or the archive is written
     * to a seekable output (i.e. you have used the {@link
     * #ZipArchiveOutputStream(java.io.File) File-arg constructor}) -
     * this mode is not valid when the output stream is not seekable
     * and the uncompressed size is unknown when {@link
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.zip` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java`
#### Snippet
```java
     * Default compression method for next entry.
     */
    private int method = java.util.zip.ZipEntry.DEFLATED;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `java.nio.channels` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java`
#### Snippet
```java
 *
 * <p>This class will try to use {@link
 * java.nio.channels.SeekableByteChannel} when it knows that the
 * output is going to go to a file and no split archive shall be
 * created.</p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.zip` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java`
#### Snippet
```java
     * Compression method for deflated entries.
     */
    public static final int DEFLATED = java.util.zip.ZipEntry.DEFLATED;

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.compressors` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/compressors/CompressorStreamProvider.java`
#### Snippet
```java
     * @param name
     *            the compressor name, i.e.
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#GZIP},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#BZIP2},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#XZ},
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.compressors` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/compressors/CompressorStreamProvider.java`
#### Snippet
```java
     *            the compressor name, i.e.
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#GZIP},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#BZIP2},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#XZ},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#PACK200}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.compressors` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/compressors/CompressorStreamProvider.java`
#### Snippet
```java
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#GZIP},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#BZIP2},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#XZ},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#PACK200}
     *            or
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.compressors` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/compressors/CompressorStreamProvider.java`
#### Snippet
```java
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#BZIP2},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#XZ},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#PACK200}
     *            or
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#DEFLATE}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.compressors` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/compressors/CompressorStreamProvider.java`
#### Snippet
```java
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#PACK200}
     *            or
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#DEFLATE}
     * @param out
     *            the output stream
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.compressors` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/compressors/CompressorStreamProvider.java`
#### Snippet
```java
     * @param name
     *            of the compressor, i.e.
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#GZIP},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#BZIP2},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#XZ},
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.compressors` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/compressors/CompressorStreamProvider.java`
#### Snippet
```java
     *            of the compressor, i.e.
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#GZIP},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#BZIP2},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#XZ},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#LZMA},
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.compressors` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/compressors/CompressorStreamProvider.java`
#### Snippet
```java
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#GZIP},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#BZIP2},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#XZ},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#LZMA},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#PACK200},
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.compressors` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/compressors/CompressorStreamProvider.java`
#### Snippet
```java
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#BZIP2},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#XZ},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#LZMA},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#PACK200},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#SNAPPY_RAW},
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.compressors` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/compressors/CompressorStreamProvider.java`
#### Snippet
```java
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#XZ},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#LZMA},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#PACK200},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#SNAPPY_RAW},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#SNAPPY_FRAMED},
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.compressors` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/compressors/CompressorStreamProvider.java`
#### Snippet
```java
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#LZMA},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#PACK200},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#SNAPPY_RAW},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#SNAPPY_FRAMED},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#Z}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.compressors` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/compressors/CompressorStreamProvider.java`
#### Snippet
```java
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#PACK200},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#SNAPPY_RAW},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#SNAPPY_FRAMED},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#Z}
     *            or
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.compressors` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/compressors/CompressorStreamProvider.java`
#### Snippet
```java
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#SNAPPY_RAW},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#SNAPPY_FRAMED},
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#Z}
     *            or
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#DEFLATE}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.compress.compressors` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/compressors/CompressorStreamProvider.java`
#### Snippet
```java
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#Z}
     *            or
     *            {@value org.apache.commons.compress.compressors.CompressorStreamFactory#DEFLATE}
     * @param in
     *            the input stream
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.zip` is unnecessary and can be removed
in `src/main/java/org/apache/commons/compress/compressors/gzip/GzipCompressorInputStream.java`
#### Snippet
```java
 * Instead of using {@code GZIPInputStream}, this class has its own .gz
 * container format decoder. The actual decompression is done with
 * {@link java.util.zip.Inflater}.
 * </p>
 *
```

## RuleId[ruleID=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/compress/harmony/archive/internal/nls/Messages.java`
#### Snippet
```java
                "org.apache.commons.compress.harmony.archive.internal.nls.messages"); //$NON-NLS-1$
        } catch (final Throwable e) {
            e.printStackTrace();
        }
    }
```

## RuleId[ruleID=SuspiciousToArrayCall]
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

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `BoundedArchiveInputStream()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/compress/utils/BoundedArchiveInputStream.java`
#### Snippet
```java
     * @param remaining amount of bytes which are allowed to read from the bounded stream.
     */
    public BoundedArchiveInputStream(final long start, final long remaining) {
        this.end = start + remaining;
        if (this.end < start) {
```

### NonProtectedConstructorInAbstractClass
Constructor `BandSet()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/compress/harmony/pack200/BandSet.java`
#### Snippet
```java
     * @param header - the segment header
     */
    public BandSet(final int effort, final SegmentHeader header) {
        this.effort = effort;
        this.segmentHeader = header;
```

### NonProtectedConstructorInAbstractClass
Constructor `BandSet()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/BandSet.java`
#### Snippet
```java
    protected SegmentHeader header;

    public BandSet(final Segment segment) {
        this.segment = segment;
        this.header = segment.getSegmentHeader();
```

### NonProtectedConstructorInAbstractClass
Constructor `CPConstant()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/CPConstant.java`
#### Snippet
```java
     * @throws NullPointerException if value is null
     */
    public CPConstant(final byte tag, final Object value, final int globalIndex) {
        super(tag, globalIndex);
        this.value = Objects.requireNonNull(value, "value");
```

### NonProtectedConstructorInAbstractClass
Constructor `BCIRenumberedAttribute()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/BCIRenumberedAttribute.java`
#### Snippet
```java
    protected boolean renumbered;

    public BCIRenumberedAttribute(final CPUTF8 attributeName) {
        super(attributeName);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `CPConstantNumber()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/CPConstantNumber.java`
#### Snippet
```java
public abstract class CPConstantNumber extends CPConstant {

    public CPConstantNumber(final byte tag, final Object value, final int globalIndex) {
        super(tag, value, globalIndex);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `CPRef()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/CPRef.java`
#### Snippet
```java
     * @throws NullPointerException if descriptor or className is null
     */
    public CPRef(final byte type, final CPClass className, final CPNameAndType descriptor, final int globalIndex) {
        super(type, globalIndex);
        this.className = Objects.requireNonNull(className, "className");
```

### NonProtectedConstructorInAbstractClass
Constructor `AnnotationsAttribute()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/AnnotationsAttribute.java`
#### Snippet
```java
    }

    public AnnotationsAttribute(final CPUTF8 attributeName) {
        super(attributeName);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `Attribute()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/Attribute.java`
#### Snippet
```java
    private int attributeNameIndex;

    public Attribute(final CPUTF8 attributeName) {
        this.attributeName = attributeName;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ClassSpecificReferenceForm()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/ClassSpecificReferenceForm.java`
#### Snippet
```java
public abstract class ClassSpecificReferenceForm extends ReferenceForm {

    public ClassSpecificReferenceForm(final int opcode, final String name, final int[] rewrite) {
        super(opcode, name, rewrite);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SwitchForm()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/SwitchForm.java`
#### Snippet
```java
public abstract class SwitchForm extends VariableInstructionForm {

    public SwitchForm(final int opcode, final String name) {
        super(opcode, name);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `VariableInstructionForm()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/VariableInstructionForm.java`
#### Snippet
```java
public abstract class VariableInstructionForm extends ByteCodeForm {

    public VariableInstructionForm(final int opcode, final String name) {
        super(opcode, name);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `SingleByteReferenceForm()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/SingleByteReferenceForm.java`
#### Snippet
```java
    protected boolean widened;

    public SingleByteReferenceForm(final int opcode, final String name, final int[] rewrite) {
        super(opcode, name, rewrite);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `InitMethodReferenceForm()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/InitMethodReferenceForm.java`
#### Snippet
```java
public abstract class InitMethodReferenceForm extends ClassSpecificReferenceForm {

    public InitMethodReferenceForm(final int opcode, final String name, final int[] rewrite) {
        super(opcode, name, rewrite);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ReferenceForm()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/ReferenceForm.java`
#### Snippet
```java
public abstract class ReferenceForm extends ByteCodeForm {

    public ReferenceForm(final int opcode, final String name, final int[] rewrite) {
        super(opcode, name, rewrite);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ByteCodeForm()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/ByteCodeForm.java`
#### Snippet
```java
     *        by -1.
     */
    public ByteCodeForm(final int opcode, final String name, final int[] rewrite) {
        this.opcode = opcode;
        this.name = name;
```

### NonProtectedConstructorInAbstractClass
Constructor `ByteCodeForm()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/forms/ByteCodeForm.java`
#### Snippet
```java
     * @param name String printable name of the opcode
     */
    public ByteCodeForm(final int opcode, final String name) {
        this(opcode, name, new int[] {opcode});
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractLZ77CompressorInputStream()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/compress/compressors/lz77support/AbstractLZ77CompressorInputStream.java`
#### Snippet
```java
     * @throws IllegalArgumentException if windowSize is not bigger than 0
     */
    public AbstractLZ77CompressorInputStream(final InputStream is, final int windowSize) {
        this.in = new CountingInputStream(is);
        if (windowSize <= 0) {
```

## RuleId[ruleID=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `src/main/java/org/apache/commons/compress/harmony/unpack200/IcBands.java`
#### Snippet
```java
                final String key = tuple.outerClassString();
                List<IcTuple> bucket = outerClassToTuples.get(key);
                if (bucket == null) {
                    bucket = new ArrayList<>();
                    outerClassToTuples.put(key, bucket);
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
					&& !isInnerClassOf(currentClass.toString(), inner)) {
				Set<CPClass> referencedInnerClasses = classReferencesInnerClass.get(currentClass);
				if (referencedInnerClasses == null) {
					referencedInnerClasses = new HashSet<>();
					classReferencesInnerClass.put(currentClass, referencedInnerClasses);
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `numToSkip`
in `src/main/java/org/apache/commons/compress/utils/IOUtils.java`
#### Snippet
```java
                break;
            }
            numToSkip -= skipped;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `numToSkip`
in `src/main/java/org/apache/commons/compress/utils/IOUtils.java`
#### Snippet
```java
                break;
            }
            numToSkip -= read;
        }
        return available - numToSkip;
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/compress/harmony/pack200/RunCodec.java`
#### Snippet
```java
                final long cardinality = bhsd.cardinality();
                while (value > bhsd.largest()) {
                    value -= cardinality;
                }
                while (value < bhsd.smallest()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/compress/harmony/pack200/RunCodec.java`
#### Snippet
```java
                }
                while (value < bhsd.smallest()) {
                    value = ExactMath.add(value, cardinality);
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `flags`
in `src/main/java/org/apache/commons/compress/harmony/pack200/IcBands.java`
#### Snippet
```java
                innerClasses.add(innerClass);
            } else {
                flags |= (1 << 16);
                final IcTuple icTuple = new IcTuple(cpBands.getCPClass(name), flags, cpBands.getCPClass(outerName),
                    cpBands.getCPUtf8(innerName));
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `src/main/java/org/apache/commons/compress/harmony/pack200/Archive.java`
#### Snippet
```java
    public Archive(final JarFile jarFile, OutputStream outputStream, PackingOptions options) throws IOException {
        if (options == null) { // use all defaults
            options = new PackingOptions();
        }
        this.options = options;
```

### AssignmentToMethodParameter
Assignment to method parameter `outputStream`
in `src/main/java/org/apache/commons/compress/harmony/pack200/Archive.java`
#### Snippet
```java
        this.options = options;
        if (options.isGzip()) {
            outputStream = new GZIPOutputStream(outputStream);
        }
        this.outputStream = new BufferedOutputStream(outputStream);
```

### AssignmentToMethodParameter
Assignment to method parameter `options`
in `src/main/java/org/apache/commons/compress/harmony/pack200/Archive.java`
#### Snippet
```java
        if (options == null) {
            // use all defaults
            options = new PackingOptions();
        }
        this.options = options;
```

### AssignmentToMethodParameter
Assignment to method parameter `outputStream`
in `src/main/java/org/apache/commons/compress/harmony/pack200/Archive.java`
#### Snippet
```java
        this.options = options;
        if (options.isGzip()) {
            outputStream = new GZIPOutputStream(outputStream);
        }
        this.outputStream = new BufferedOutputStream(outputStream);
```

### AssignmentToMethodParameter
Assignment to method parameter `passFileName`
in `src/main/java/org/apache/commons/compress/harmony/pack200/PackingOptions.java`
#### Snippet
```java
            fileSeparator += "\\";
        }
        passFileName = passFileName.replaceAll(fileSeparator, "/");
        passFiles.add(passFileName);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `className`
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
            return null;
        }
        className = className.replace('.', '/');
        CPClass cpClass = stringsToCpClass.get(className);
        if (cpClass == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `opcode`
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
                bcCodes.remove(bcCodes.size() - 1);
                aload_0 = true;
                opcode += 7;
            }
            if (owner.equals(currentClass)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `opcode`
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
            }
            if (owner.equals(currentClass)) {
                opcode += 24; // change to invokevirtual_this,
                // invokespecial_this etc.

```

### AssignmentToMethodParameter
Assignment to method parameter `opcode`
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java

                if (name.equals("<init>") && opcode == 207) {
                    opcode = 230; // invokespecial_this_init
                    bcInitRef.add(cpBands.getCPMethod(owner, name, desc));
                } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `opcode`
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
                }
            } else if (owner.equals(superClass)) { // TODO
                opcode += 38; // change to invokevirtual_super,
                // invokespecial_super etc.
                if (name.equals("<init>") && opcode == 221) {
```

### AssignmentToMethodParameter
Assignment to method parameter `opcode`
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
                // invokespecial_super etc.
                if (name.equals("<init>") && opcode == 221) {
                    opcode = 231; // invokespecial_super_init
                    bcInitRef.add(cpBands.getCPMethod(owner, name, desc));
                } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `opcode`
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
            } else {
                if (aload_0) {
                    opcode -= 7;
                    bcCodes.add(ALOAD_0); // add aload_0 back in
                    // because there's no
```

### AssignmentToMethodParameter
Assignment to method parameter `opcode`
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
                }
                if (name.equals("<init>") && opcode == 183 && owner.equals(currentNewClass)) {
                    opcode = 232; // invokespecial_new_init
                    bcInitRef.add(cpBands.getCPMethod(owner, name, desc));
                } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `opcode`
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
        final CPMethodOrField cpField = cpBands.getCPField(owner, name, desc);
        if (aload_0) {
            opcode += 7;
        }
        if (owner.equals(currentClass)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `opcode`
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
        }
        if (owner.equals(currentClass)) {
            opcode += 24; // change to getstatic_this, putstatic_this etc.
            bcThisField.add(cpField);
//        } else if (owner.equals(superClass)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `opcode`
in `src/main/java/org/apache/commons/compress/harmony/pack200/BcBands.java`
#### Snippet
```java
        } else {
            if (aload_0) {
                opcode -= 7;
                bcCodes.add(ALOAD_0); // add aload_0 back in because
                // there's no special rewrite in
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/AttributeLayout.java`
#### Snippet
```java
            // references
            if (layout.indexOf('N') != -1) {
                value--;
            }
            if (layout.startsWith("RU")) { //$NON-NLS-1$
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
            tags.add("[");
            if (name == null) {
                name = "";
            }
            nameRU.add(name);
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
            caseArrayN.add(indexInCaseArrayN, Integer.valueOf(numCases.intValue() + 1));
            if (name == null) {
                name = "";
            }
            addValueAndTag(value, tags, values);
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
            tags.add("@");
            if (name == null) {
                name = "";
            }
            nameRU.add(name);
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
            tags.add("[");
            if (name == null) {
                name = "";
            }
            nameRU.add(name);
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
            tags.add("e");
            if (name == null) {
                name = "";
            }
            nameRU.add(name);
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/compress/harmony/pack200/Segment.java`
#### Snippet
```java
        public void visit(String name, final Object value) {
            if (name == null) {
                name = "";
            }
            nameRU.add(name);
```

### AssignmentToMethodParameter
Assignment to method parameter `in`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/Segment.java`
#### Snippet
```java
    void unpackRead(InputStream in) throws IOException, Pack200Exception {
        if (!in.markSupported()) {
            in = new BufferedInputStream(in);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
        public void readBands(final InputStream in, int count) throws IOException, Pack200Exception {
            if (isFirstCallable) {
                count += this.count;
            } else {
                count = this.count;
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
                count += this.count;
            } else {
                count = this.count;
            }
            for (final LayoutElement element : body) {
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/ClassConstantPool.java`
#### Snippet
```java
            throw new IllegalStateException("Constant pool is not yet resolved; this does not make any sense");
        }
        return entries.get(--i);
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/X000A_NTFS.java`
#### Snippet
```java

        // skip reserved
        offset += 4;

        while (offset + 4 <= len) {
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/X000A_NTFS.java`
#### Snippet
```java
        while (offset + 4 <= len) {
            final ZipShort tag = new ZipShort(data, offset);
            offset += 2;
            if (tag.equals(TIME_ATTR_TAG)) {
                readTimeAttr(data, offset, len - offset);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/X000A_NTFS.java`
#### Snippet
```java
            }
            final ZipShort size = new ZipShort(data, offset);
            offset += 2 + size.getValue();
        }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/X000A_NTFS.java`
#### Snippet
```java
            final ZipShort tagValueLength = new ZipShort(data, offset);
            if (TIME_ATTR_SIZE.equals(tagValueLength)) {
                offset += 2;
                modifyTime = new ZipEightByteInteger(data, offset);
                offset += 8;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/X000A_NTFS.java`
#### Snippet
```java
                offset += 2;
                modifyTime = new ZipEightByteInteger(data, offset);
                offset += 8;
                accessTime = new ZipEightByteInteger(data, offset);
                offset += 8;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/X000A_NTFS.java`
#### Snippet
```java
                offset += 8;
                accessTime = new ZipEightByteInteger(data, offset);
                offset += 8;
                createTime = new ZipEightByteInteger(data, offset);
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `numToRead`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java`
#### Snippet
```java
        }

        numToRead = Math.min(numToRead, available());

        if (currEntry.isSparse()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/Zip64ExtendedInformationExtraField.java`
#### Snippet
```java
        }
        size = new ZipEightByteInteger(buffer, offset);
        offset += DWORD;
        compressedSize = new ZipEightByteInteger(buffer, offset);
        offset += DWORD;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/Zip64ExtendedInformationExtraField.java`
#### Snippet
```java
        offset += DWORD;
        compressedSize = new ZipEightByteInteger(buffer, offset);
        offset += DWORD;
        int remaining = length - 2 * DWORD;
        if (remaining >= DWORD) {
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/Zip64ExtendedInformationExtraField.java`
#### Snippet
```java
        if (remaining >= DWORD) {
            relativeHeaderOffset = new ZipEightByteInteger(buffer, offset);
            offset += DWORD;
            remaining -= DWORD;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/Zip64ExtendedInformationExtraField.java`
#### Snippet
```java
        if (remaining >= WORD) {
            diskStart = new ZipLong(buffer, offset);
            offset += WORD; // NOSONAR - assignment as documentation
            remaining -= WORD; // NOSONAR - assignment as documentation
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/Zip64ExtendedInformationExtraField.java`
#### Snippet
```java
        } else if (length == 3 * DWORD) {
            size = new ZipEightByteInteger(buffer, offset);
            offset += DWORD;
            compressedSize = new ZipEightByteInteger(buffer, offset);
            offset += DWORD;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/Zip64ExtendedInformationExtraField.java`
#### Snippet
```java
            offset += DWORD;
            compressedSize = new ZipEightByteInteger(buffer, offset);
            offset += DWORD;
            relativeHeaderOffset = new ZipEightByteInteger(buffer, offset);
        } else if (length % DWORD == WORD) {
```

### AssignmentToMethodParameter
Assignment to method parameter `l`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipUtil.java`
#### Snippet
```java
            // If someone passes in a -2, they probably mean 4294967294
            // (For example, Unix UID/GID's are 32 bit unsigned.)
            l = ZipUtil.adjustToLong((int) l);
        }
        return BigInteger.valueOf(l);
```

### AssignmentToMethodParameter
Assignment to method parameter `flags`
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java

	public void addField(int flags, final String name, final String desc, final String signature, final Object value) {
		flags = flags & 0xFFFF;
		tempFieldDesc.add(cpBands.getCPNameAndType(name, desc));
		if (signature != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `flags`
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		if (signature != null) {
			fieldSignature.add(cpBands.getCPSignature(signature));
			flags |= (1 << 19);
		}
		if ((flags & Opcodes.ACC_DEPRECATED) != 0) { // ASM uses (1<<17) flag for deprecated
```

### AssignmentToMethodParameter
Assignment to method parameter `flags`
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		}
		if ((flags & Opcodes.ACC_DEPRECATED) != 0) { // ASM uses (1<<17) flag for deprecated
			flags = flags & ~Opcodes.ACC_DEPRECATED;
			flags = flags | (1 << 20);
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `flags`
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		if ((flags & Opcodes.ACC_DEPRECATED) != 0) { // ASM uses (1<<17) flag for deprecated
			flags = flags & ~Opcodes.ACC_DEPRECATED;
			flags = flags | (1 << 20);
		}
		if (value != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `flags`
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		if (value != null) {
			fieldConstantValueKQ.add(cpBands.getConstant(value));
			flags |= (1 << 17);
		}
		if (!anySyntheticFields && ((flags & (1 << 12)) != 0)
```

### AssignmentToMethodParameter
Assignment to method parameter `maxLocals`
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		codeMaxStack.add(maxStack);
		if ((newFlag.longValue() & (1 << 3)) == 0) { // not static
			maxLocals--; // minus 'this' local
		}
		maxLocals -= numMethodArgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `maxLocals`
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
			maxLocals--; // minus 'this' local
		}
		maxLocals -= numMethodArgs;
		codeMaxLocals.add(maxLocals);
	}
```

### AssignmentToMethodParameter
Assignment to method parameter `flags`
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		if (signature != null) {
			methodSignature.add(cpBands.getCPSignature(signature));
			flags |= (1 << 19);
		}
		if (exceptions != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `flags`
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
				methodExceptionClasses.add(cpBands.getCPClass(exception));
			}
			flags |= (1 << 18);
		}
		if ((flags & Opcodes.ACC_DEPRECATED) != 0) { // ASM uses (1<<17) flag for deprecated
```

### AssignmentToMethodParameter
Assignment to method parameter `flags`
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		}
		if ((flags & Opcodes.ACC_DEPRECATED) != 0) { // ASM uses (1<<17) flag for deprecated
			flags = flags & ~Opcodes.ACC_DEPRECATED;
			flags = flags | (1 << 20);
		}
```

### AssignmentToMethodParameter
Assignment to method parameter `flags`
in `src/main/java/org/apache/commons/compress/harmony/pack200/ClassBands.java`
#### Snippet
```java
		if ((flags & Opcodes.ACC_DEPRECATED) != 0) { // ASM uses (1<<17) flag for deprecated
			flags = flags & ~Opcodes.ACC_DEPRECATED;
			flags = flags | (1 << 20);
		}
		tempMethodFlags.add(Long.valueOf(flags));
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/X7875_NewUnix.java`
#### Snippet
```java
                + length + " bytes");
        }
        this.version = signedByteToUnsignedInt(data[offset++]);
        final int uidSize = signedByteToUnsignedInt(data[offset++]);
        if (uidSize + 3 > length) {
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/X7875_NewUnix.java`
#### Snippet
```java
        }
        this.version = signedByteToUnsignedInt(data[offset++]);
        final int uidSize = signedByteToUnsignedInt(data[offset++]);
        if (uidSize + 3 > length) {
            throw new ZipException("X7875_NewUnix invalid: uidSize " + uidSize
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/X7875_NewUnix.java`
#### Snippet
```java
        }
        final byte[] uidBytes = Arrays.copyOfRange(data, offset, offset + uidSize);
        offset += uidSize;
        this.uid = new BigInteger(1, reverse(uidBytes)); // sign-bit forced positive

```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/X7875_NewUnix.java`
#### Snippet
```java
        this.uid = new BigInteger(1, reverse(uidBytes)); // sign-bit forced positive

        final int gidSize = signedByteToUnsignedInt(data[offset++]);
        if (uidSize + 3 + gidSize > length) {
            throw new ZipException("X7875_NewUnix invalid: gidSize " + gidSize
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp.java`
#### Snippet
```java
        }
        final int len = offset + length;
        setFlags(data[offset++]);
        if (bit0_modifyTimePresent && offset + 4 <= len) {
            modifyTime = new ZipLong(data, offset);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp.java`
#### Snippet
```java
        if (bit0_modifyTimePresent && offset + 4 <= len) {
            modifyTime = new ZipLong(data, offset);
            offset += 4;
        } else {
            bit0_modifyTimePresent = false;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp.java`
#### Snippet
```java
        if (bit1_accessTimePresent && offset + 4 <= len) {
            accessTime = new ZipLong(data, offset);
            offset += 4;
        } else {
            bit1_accessTimePresent = false;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp.java`
#### Snippet
```java
        if (bit2_createTimePresent && offset + 4 <= len) {
            createTime = new ZipLong(data, offset);
            offset += 4; // NOSONAR - assignment as documentation
        } else {
            bit2_createTimePresent = false;
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java
        if (name != null && getPlatform() == PLATFORM_FAT
            && !name.contains("/")) {
            name = name.replace('\\', '/');
        }
        this.name = name;
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/compress/archivers/dump/TapeInputStream.java`
#### Snippet
```java
            readOffset += n;
            bytes += n;
            off += n;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `entry`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java`
#### Snippet
```java
            }

            entry = DumpArchiveEntry.parse(peekBytes);
            first = false;
            size -= DumpArchiveConstants.TP_SIZE;
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java`
#### Snippet
```java

        if (len + entryOffset > entrySize) {
            len = (int) (entrySize - entryOffset);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java`
#### Snippet
```java
                totalRead += sz;
                recordOffset += sz;
                len -= sz;
                off += sz;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java`
#### Snippet
```java
                recordOffset += sz;
                len -= sz;
                off += sz;
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java`
#### Snippet
```java
            bos.write(buf.array(), 0, cacheable);
            System.arraycopy(buf.array(), cacheable, buf.array(), 0, expecteDDLen + 3);
            offset = expecteDDLen + 3;
        } else {
            offset += lastRead;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java`
#### Snippet
```java
            offset = expecteDDLen + 3;
        } else {
            offset += lastRead;
        }
        return offset;
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
        if (name != null) {
            if (isDirectory() && !name.endsWith("/")) {
                name += "/";
            }
            if (name.startsWith("./")) {
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java`
#### Snippet
```java
            }
            if (name.startsWith("./")) {
                name = name.substring(2);
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZOutputFile.java`
#### Snippet
```java
        for (; i > 0; i--) {
            header.write((int) (0xff & value));
            value >>>= 8;
        }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/compress/compressors/lz4/XXHash32.java`
#### Snippet
```java
            System.arraycopy(b, off, buffer, pos, size);
            process(buffer, 0);
            off += size;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/compress/compressors/lz4/XXHash32.java`
#### Snippet
```java
        while (off <= limit) {
            process(b, off);
            off += BUF_SIZE;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
    private int writeEntryHeaderOptionalTimeField(final FileTime time, int offset, final byte[] outbuf, final int fieldLength) {
        if (time != null) {
            offset = writeEntryHeaderField(TimeUtils.toUnixTime(time), outbuf, offset, fieldLength, true);
        } else {
            offset = fill(0, offset, outbuf, fieldLength);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
            offset = writeEntryHeaderField(TimeUtils.toUnixTime(time), outbuf, offset, fieldLength, true);
        } else {
            offset = fill(0, offset, outbuf, fieldLength);
        }
        return offset;
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java

                        if (ch2 == ':' && (ch1 >= 'a' && ch1 <= 'z' || ch1 >= 'A' && ch1 <= 'Z')) {
                            fileName = fileName.substring(2);
                        }
                    }
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
                    final int colon = fileName.indexOf(':');
                    if (colon != -1) {
                        fileName = fileName.substring(colon + 1);
                    }
                }
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
        }

        fileName = fileName.replace(File.separatorChar, '/');

        // No absolute pathnames
```

### AssignmentToMethodParameter
Assignment to method parameter `fileName`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
        // so we loop on starting /'s.
        while (!preserveAbsolutePath && fileName.startsWith("/")) {
            fileName = fileName.substring(1);
        }
        return fileName;
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
        this(preserveAbsolutePath);

        name = normalizeFileName(name, preserveAbsolutePath);
        final boolean isDir = name.endsWith("/");

```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/compress/compressors/lz4/FramedLZ4CompressorOutputStream.java`
#### Snippet
```java

    private void appendToBlockDependencyBuffer(final byte[] b, final int off, int len) {
        len = Math.min(len, blockDependencyBuffer.length);
        if (len > 0) {
            final int keep = blockDependencyBuffer.length - len;
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/compress/compressors/lz4/FramedLZ4CompressorOutputStream.java`
#### Snippet
```java
            while (len > blockDataLength) {
                System.arraycopy(data, off, blockData, 0, blockDataLength);
                off += blockDataLength;
                len -= blockDataLength;
                currentIndex = blockDataLength;
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/compress/compressors/lz4/FramedLZ4CompressorOutputStream.java`
#### Snippet
```java
                System.arraycopy(data, off, blockData, 0, blockDataLength);
                off += blockDataLength;
                len -= blockDataLength;
                currentIndex = blockDataLength;
                flushBlock();
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/compress/compressors/lz4/FramedLZ4CompressorInputStream.java`
#### Snippet
```java

    private void appendToBlockDependencyBuffer(final byte[] b, final int off, int len) {
        len = Math.min(len, blockDependencyBuffer.length);
        if (len > 0) {
            final int keep = blockDependencyBuffer.length - len;
```

### AssignmentToMethodParameter
Assignment to method parameter `repeat`
in `src/main/java/org/apache/commons/compress/compressors/bzip2/CRC.java`
#### Snippet
```java
        void updateCRC(final int inCh, int repeat) {
            int globalCrcShadow = this.globalCrc;
            while (repeat-- > 0) {
                final int temp = (globalCrcShadow >> 24) ^ inCh;
                globalCrcShadow = (globalCrcShadow << 8) ^ crc32Table[(temp >= 0)
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `src/main/java/org/apache/commons/compress/compressors/lz4/BlockLZ4CompressorOutputStream.java`
#### Snippet
```java
            while (length >= 255) {
                out.write(255);
                length -= 255;
            }
            out.write(length);
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/compress/compressors/gzip/GzipCompressorInputStream.java`
#### Snippet
```java

            crc.update(b, off, ret);
            off += ret;
            len -= ret;
            size += ret;
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/compress/compressors/gzip/GzipCompressorInputStream.java`
#### Snippet
```java
            crc.update(b, off, ret);
            off += ret;
            len -= ret;
            size += ret;
            count(ret);
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/compress/compressors/snappy/FramedSnappyCompressorOutputStream.java`
#### Snippet
```java
            while (len > MAX_COMPRESSED_BUFFER_SIZE) {
                System.arraycopy(data, off, buffer, 0, MAX_COMPRESSED_BUFFER_SIZE);
                off += MAX_COMPRESSED_BUFFER_SIZE;
                len -= MAX_COMPRESSED_BUFFER_SIZE;
                currentIndex = MAX_COMPRESSED_BUFFER_SIZE;
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/compress/compressors/snappy/FramedSnappyCompressorOutputStream.java`
#### Snippet
```java
                System.arraycopy(data, off, buffer, 0, MAX_COMPRESSED_BUFFER_SIZE);
                off += MAX_COMPRESSED_BUFFER_SIZE;
                len -= MAX_COMPRESSED_BUFFER_SIZE;
                currentIndex = MAX_COMPRESSED_BUFFER_SIZE;
                flushBuffer();
```

### AssignmentToMethodParameter
Assignment to method parameter `x`
in `src/main/java/org/apache/commons/compress/compressors/snappy/FramedSnappyCompressorOutputStream.java`
#### Snippet
```java
        // ugly, maybe we should just have used ints and deal with the
        // overflow
        x = ((x >> 15) | (x << 17));
        x += FramedSnappyCompressorInputStream.MASK_OFFSET;
        x &= 0xffffFFFFL;
```

### AssignmentToMethodParameter
Assignment to method parameter `x`
in `src/main/java/org/apache/commons/compress/compressors/snappy/FramedSnappyCompressorOutputStream.java`
#### Snippet
```java
        // overflow
        x = ((x >> 15) | (x << 17));
        x += FramedSnappyCompressorInputStream.MASK_OFFSET;
        x &= 0xffffFFFFL;
        return x;
```

### AssignmentToMethodParameter
Assignment to method parameter `x`
in `src/main/java/org/apache/commons/compress/compressors/snappy/FramedSnappyCompressorOutputStream.java`
#### Snippet
```java
        x = ((x >> 15) | (x << 17));
        x += FramedSnappyCompressorInputStream.MASK_OFFSET;
        x &= 0xffffFFFFL;
        return x;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `uncompressedSize`
in `src/main/java/org/apache/commons/compress/compressors/snappy/SnappyCompressorOutputStream.java`
#### Snippet
```java
            }
            os.write(currentByte);
            uncompressedSize >>= 7;
        } while (more);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `x`
in `src/main/java/org/apache/commons/compress/compressors/snappy/FramedSnappyCompressorInputStream.java`
#### Snippet
```java
        // ugly, maybe we should just have used ints and deal with the
        // overflow
        x -= MASK_OFFSET;
        x &= 0xffffFFFFL;
        return ((x >> 17) | (x << 15)) & 0xffffFFFFL;
```

### AssignmentToMethodParameter
Assignment to method parameter `x`
in `src/main/java/org/apache/commons/compress/compressors/snappy/FramedSnappyCompressorInputStream.java`
#### Snippet
```java
        // overflow
        x -= MASK_OFFSET;
        x &= 0xffffFFFFL;
        return ((x >> 17) | (x << 15)) & 0xffffFFFFL;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/compress/compressors/snappy/PureJavaCrc32C.java`
#### Snippet
```java
           ^ (T[T8_1_START + c6] ^ T[T8_0_START + c7]);

      off += 8;
      len -= 8;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/compress/compressors/snappy/PureJavaCrc32C.java`
#### Snippet
```java

      off += 8;
      len -= 8;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/compress/compressors/snappy/PureJavaCrc32C.java`
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
in `src/main/java/org/apache/commons/compress/compressors/snappy/PureJavaCrc32C.java`
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
in `src/main/java/org/apache/commons/compress/compressors/snappy/PureJavaCrc32C.java`
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
in `src/main/java/org/apache/commons/compress/compressors/snappy/PureJavaCrc32C.java`
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
in `src/main/java/org/apache/commons/compress/compressors/snappy/PureJavaCrc32C.java`
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
in `src/main/java/org/apache/commons/compress/compressors/snappy/PureJavaCrc32C.java`
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
in `src/main/java/org/apache/commons/compress/compressors/snappy/PureJavaCrc32C.java`
#### Snippet
```java
      case 3: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 2: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      case 1: localCrc = (localCrc >>> 8) ^ T[T8_0_START + ((localCrc ^ b[off++]) & 0xff)];
      default:
        /* nothing */
```

### AssignmentToMethodParameter
Assignment to method parameter `props`
in `src/main/java/org/apache/commons/compress/compressors/pack200/Pack200Utils.java`
#### Snippet
```java
            throws IOException {
        if (props == null) {
            props = new HashMap<>();
        }
        props.put(Pack200.Packer.SEGMENT_LIMIT, "-1");
```

### AssignmentToMethodParameter
Assignment to method parameter `bytesToSkip`
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
        final int maxSkip = input.remaining();
        if (maxSkip < bytesToSkip) {
            bytesToSkip = maxSkip;
        }
        input.position(current + (int) bytesToSkip);
```

### AssignmentToMethodParameter
Assignment to method parameter `offs`
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java`
#### Snippet
```java

        for (final int hi = offs + len; offs < hi;) {
            write0(buf[offs++]);
        }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java`
#### Snippet
```java
    private void write0(int b) throws IOException {
        if (this.currentChar != -1) {
            b &= 0xff;
            if (this.currentChar == b) {
                if (++this.runLength > 254) {
```

### AssignmentToMethodParameter
Assignment to method parameter `off`
in `src/main/java/org/apache/commons/compress/compressors/lz77support/LZ77Compressor.java`
#### Snippet
```java
        while (len > wSize) { // chop into windowSize sized chunks
            doCompress(data, off, wSize);
            off += wSize;
            len -= wSize;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `len`
in `src/main/java/org/apache/commons/compress/compressors/lz77support/LZ77Compressor.java`
#### Snippet
```java
            doCompress(data, off, wSize);
            off += wSize;
            len -= wSize;
        }
        if (len > 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `matchHead`
in `src/main/java/org/apache/commons/compress/compressors/lz77support/LZ77Compressor.java`
#### Snippet
```java
                }
            }
            matchHead = prev[matchHead & wMask];
        }
        return longestMatchLength; // < minLength if no matches have been found, will be ignored in compress()
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
    }
    private static void vswap(final int[] fmap, int p1, int p2, int n) {
        n += p1;
        while (p1 < n) {
            final int t = fmap[p1];
```

### AssignmentToMethodParameter
Assignment to method parameter `p1`
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
        while (p1 < n) {
            final int t = fmap[p1];
            fmap[p1++] = fmap[p2];
            fmap[p2++] = t;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `p2`
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
            final int t = fmap[p1];
            fmap[p1++] = fmap[p2];
            fmap[p2++] = t;
        }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `yyp1`
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
        while (yyn > 0) {
            fswap(fmap, yyp1, yyp2);
            yyp1++; yyp2++; yyn--;
        }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `yyp2`
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
        while (yyn > 0) {
            fswap(fmap, yyp1, yyp2);
            yyp1++; yyp2++; yyn--;
        }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `yyn`
in `src/main/java/org/apache/commons/compress/compressors/bzip2/BlockSort.java`
#### Snippet
```java
        while (yyn > 0) {
            fswap(fmap, yyp1, yyp2);
            yyp1++; yyp2++; yyn--;
        }
    }
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/utils/FileNameUtils.java`
#### Snippet
```java
    public static String getBaseName(final String filename) {
        if (filename == null) {
            return null;
        }
        return fileNameToBaseName(new File(filename).getName());
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/utils/FileNameUtils.java`
#### Snippet
```java
    public static String getExtension(final Path path) {
        if (path == null) {
            return null;
        }
        final Path fileName = path.getFileName();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/utils/FileNameUtils.java`
#### Snippet
```java
        }
        final Path fileName = path.getFileName();
        return fileName != null ? fileNameToExtension(fileName.toString()) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/utils/FileNameUtils.java`
#### Snippet
```java
    public static String getBaseName(final Path path) {
        if (path == null) {
            return null;
        }
        final Path fileName = path.getFileName();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/utils/FileNameUtils.java`
#### Snippet
```java
        }
        final Path fileName = path.getFileName();
        return fileName != null ? fileNameToBaseName(fileName.toString()) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/utils/FileNameUtils.java`
#### Snippet
```java
    public static String getExtension(final String filename) {
        if (filename == null) {
            return null;
        }
        return fileNameToExtension(new File(filename).getName());
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/utils/TimeUtils.java`
#### Snippet
```java
     */
    public static Date toDate(final FileTime fileTime) {
        return fileTime != null ? new Date(fileTime.toMillis()) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/utils/TimeUtils.java`
#### Snippet
```java
     */
    public static FileTime toFileTime(final Date date) {
        return date != null ? FileTime.fromMillis(date.getTime()) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/pack200/IcBands.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/archive/internal/nls/Messages.java`
#### Snippet
```java
            // ignore
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/pack200/CodecEncoding.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttribute.java`
#### Snippet
```java
            final int codeOff, final Label[] labels) {
            // TODO Not sure if this works, can we really strip an attribute if we don't know the layout?
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
    public CPUTF8 getCPUtf8(final String utf8) {
        if (utf8 == null) {
            return null;
        }
        CPUTF8 cpUtf8 = stringsToCpUtf8.get(utf8);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
    public CPClass getCPClass(String className) {
        if (className == null) {
            return null;
        }
        className = className.replace('.', '/');
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/pack200/CpBands.java`
#### Snippet
```java
    public CPSignature getCPSignature(final String signature) {
        if (signature == null) {
            return null;
        }
        CPSignature cpS = stringsToCpSignature.get(signature);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/MetadataBandGroup.java`
#### Snippet
```java
            return getAnnotation(type, numPairs, nestname_RU_Iterator);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/AttributeLayoutMap.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        stream.reset();
        if (length == 0) {
            return null;
        }
        final char[] digits = new char[length];
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        final int nextChar = reader.read();
        if (nextChar == -1) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
            return new Reference(string.toString());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        final int next = reader.read();
        if (next == -1) {
            return null;
        }
        if (next == '[') {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/pack200/NewAttributeBands.java`
#### Snippet
```java
        if (ch == ')' || next == -1) {
            reader.reset();
            return null;
        }
        reader.reset();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentConstantPool.java`
#### Snippet
```java
        final int index = (int) value;
        if (index == -1) {
            return null;
        }
        if (index < 0) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentConstantPool.java`
#### Snippet
```java
        final int index = (int) value;
        if (index == -1) {
            return null;
        }
        if (index < 0) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/SegmentConstantPool.java`
#### Snippet
```java
        final int index = matchSpecificPoolEntryIndex(classes, name, 0);
        if (index == -1) {
            return null;
        }
        try {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/CodeAttribute.java`
#### Snippet
```java
    protected int[] getStartPCs() {
        // Do nothing here as we've overriden renumber
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/NewAttribute.java`
#### Snippet
```java
    protected int[] getStartPCs() {
        // Don't need to return anything here as we've overridden renumber
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
        stream.reset();
        if (length == 0) {
            return null;
        }
        final char[] digits = new char[length];
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
        if (ch == ')'|| next == -1) {
            stream.reset();
            return null;
        }
        stream.reset();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
        final int nextChar = stream.read();
        if (nextChar == -1) {
            return null;
        }
        switch (nextChar) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
            return new Reference(string.toString());
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/NewAttributeBands.java`
#### Snippet
```java
        final int next = stream.read();
        if (next == -1) {
            return null;
        }
        if (next == '[') {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/harmony/unpack200/bytecode/ClassConstantPool.java`
#### Snippet
```java
    public ClassFileEntry add(final ClassFileEntry entry) {
        if (entry instanceof ByteCode) {
            return null;
        }
        if (entry instanceof ConstantPoolEntry) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveInputStream.java`
#### Snippet
```java
            if (input.read() < 0) {
                // hit eof
                return null;
            }
            trackReadBytes(1);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveInputStream.java`
#### Snippet
```java
            trackReadBytes(read);
            if (read == 0) {
                return null;
            }
            if (read < metaData.length) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/jar/JarArchiveInputStream.java`
#### Snippet
```java
    public JarArchiveEntry getNextJarEntry() throws IOException {
        final ZipArchiveEntry entry = getNextZipEntry();
        return entry == null ? null : new JarArchiveEntry(entry);
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/jar/JarArchiveEntry.java`
#### Snippet
```java
         * also returns null or the list of certificates (but not copied)
         */
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/arj/ArjArchiveInputStream.java`
#### Snippet
```java
        final byte[] basicHeaderBytes = readHeader();
        if (basicHeaderBytes == null) {
            return null;
        }
        try (final DataInputStream basicHeader = new DataInputStream(new ByteArrayInputStream(basicHeaderBytes))) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/arj/ArjArchiveInputStream.java`
#### Snippet
```java
        }
        currentInputStream = null;
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/arj/ArjArchiveInputStream.java`
#### Snippet
```java
            if (basicHeaderSize == 0) {
                // end of archive
                return null;
            }
            if (basicHeaderSize <= 2600) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/X000A_NTFS.java`
#### Snippet
```java
    private static Date zipToDate(final ZipEightByteInteger z) {
        if (z == null || ZipEightByteInteger.ZERO.equals(z)) {
            return null;
        }
        return TimeUtils.ntfsTimeToDate(z.getLongValue());
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/X000A_NTFS.java`
#### Snippet
```java
    private static FileTime zipToFileTime(final ZipEightByteInteger z) {
        if (z == null || ZipEightByteInteger.ZERO.equals(z)) {
            return null;
        }
        return TimeUtils.ntfsTimeToFileTime(z.getLongValue());
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/X000A_NTFS.java`
#### Snippet
```java
    private static ZipEightByteInteger fileTimeToZip(final FileTime time) {
        if (time == null) {
            return null;
        }
        return new ZipEightByteInteger(TimeUtils.toNtfsTime(time));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/X000A_NTFS.java`
#### Snippet
```java
    private static ZipEightByteInteger dateToZip(final Date d) {
        if (d == null) {
            return null;
        }
        return new ZipEightByteInteger(TimeUtils.toNtfsTime(d));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarFile.java`
#### Snippet
```java
    private TarArchiveEntry getNextTarEntry() throws IOException {
        if (isAtEOF()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarFile.java`
#### Snippet
```java
            /* hit EOF */
            currEntry = null;
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarFile.java`
#### Snippet
```java
                // Malformed tar file - long link entry name not followed by
                // entry
                return null;
            }
            currEntry.setLinkName(zipEncoding.decode(longLinkData));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarFile.java`
#### Snippet
```java
                // Malformed tar file - long entry name not followed by
                // entry
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarFile.java`
#### Snippet
```java
        final int readNow = archive.read(recordBuffer);
        if (readNow != recordSize) {
            return null;
        }
        return recordBuffer;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarFile.java`
#### Snippet
```java
            // Bugzilla: 40334
            // Malformed tar file - long entry name not followed by entry
            return null;
        }
        byte[] longNameData = longName.toByteArray();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java`
#### Snippet
```java
    public TarArchiveEntry getNextTarEntry() throws IOException {
        if (isAtEOF()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java`
#### Snippet
```java
            /* hit EOF */
            currEntry = null;
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java`
#### Snippet
```java
                // Malformed tar file - long link entry name not followed by
                // entry
                return null;
            }
            currEntry.setLinkName(zipEncoding.decode(longLinkData));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java`
#### Snippet
```java
                // Malformed tar file - long entry name not followed by
                // entry
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java`
#### Snippet
```java
        count(readNow);
        if (readNow != recordSize) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveInputStream.java`
#### Snippet
```java
            // Bugzilla: 40334
            // Malformed tar file - long entry name not followed by entry
            return null;
        }
        byte[] longNameData = longName.toByteArray();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/ExtraFieldUtils.java`
#### Snippet
```java
            return (ZipExtraField) c.newInstance();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/ExtraFieldUtils.java`
#### Snippet
```java
                return field;
            case SKIP_KEY:
                return null;
            default:
                throw new ZipException("Unknown UnparseableExtraField key: " + key);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipUtil.java`
#### Snippet
```java
        }
        // TODO log this anywhere?
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipUtil.java`
#### Snippet
```java
            return Arrays.copyOf(from, from.length);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/X7875_NewUnix.java`
#### Snippet
```java
    static byte[] trimLeadingZeroesForceMinLength(final byte[] array) {
        if (array == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp.java`
#### Snippet
```java

    private static FileTime unixTimeToFileTime(final ZipLong unixTime) {
        return unixTime != null ? TimeUtils.unixTimeToFileTime(unixTime.getIntValue()) : null;
    }
    // The 3 boolean fields (below) come from this flags byte.  The remaining 5 bits
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp.java`
#### Snippet
```java
    private static ZipLong dateToZipLong(final Date d) {
        if (d == null) {
            return null;
        }
        return unixTimeToZipLong(d.getTime() / 1000);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp.java`
#### Snippet
```java

    private static Date zipLongToDate(final ZipLong unixTime) {
        return unixTime != null ? new Date(unixTime.getIntValue() * 1000L) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp.java`
#### Snippet
```java
     */
    private static ZipLong fileTimeToZipLong(final FileTime time) {
        return time == null ? null : unixTimeToZipLong(TimeUtils.toUnixTime(time));
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java
            return Arrays.copyOf(rawName, rawName.length);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntry.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/AbstractUnicodeExtraField.java`
#### Snippet
```java
     */
    public byte[] getUnicodeName() {
        return unicodeName != null ? Arrays.copyOf(unicodeName, unicodeName.length) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveConstants.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveConstants.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/cpio/CpioArchiveInputStream.java`
#### Snippet
```java
            this.entryEOF = true;
            skipRemainderOfLastBlock();
            return null;
        }
        return this.entry;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/dump/TapeInputStream.java`
#### Snippet
```java
                readBlock(true);
            } catch (final ShortFileException sfe) { // NOSONAR
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java`
#### Snippet
```java
            pending.put(entry.getIno(), entry);

            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java`
#### Snippet
```java
        while (entry == null) {
            if (hasHitEOF) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveInputStream.java`
#### Snippet
```java
                hasHitEOF = true;

                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java`
#### Snippet
```java
        boolean firstEntry = true;
        if (closed || hitCentralDirectory) {
            return null;
        }
        if (current != null) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java`
#### Snippet
```java
            }
        } catch (final EOFException e) { //NOSONAR
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java`
#### Snippet
```java
                hitCentralDirectory = true;
                skipRemainderOfArchive();
                return null;
            }
            throw new ZipException(String.format("Unexpected record signature: 0x%x", sig.getValue()));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/sevenz/AbstractCoder.java`
#### Snippet
```java
     */
    Object getOptionsFromCoder(final Coder coder, final InputStream in) throws IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZMethod.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java`
#### Snippet
```java
        throws IOException {
        if (!(zipEntry instanceof Entry)) {
            return null;
        }
        // cast validity is checked just above
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java`
#### Snippet
```java
    public ZipArchiveEntry getEntry(final String name) {
        final LinkedList<ZipArchiveEntry> entriesOfThatName = nameMap.get(name);
        return entriesOfThatName != null ? entriesOfThatName.getFirst() : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java`
#### Snippet
```java
    public InputStream getRawInputStream(final ZipArchiveEntry ze) throws IOException {
        if (!(ze instanceof Entry)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java`
#### Snippet
```java
        final long start = getDataOffset(ze);
        if (start == EntryStreamOffsets.OFFSET_UNKNOWN) {
            return null;
        }
        return createBoundedInputStream(start, ze.getCompressedSize());
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java`
#### Snippet
```java
    public InputStream getContentBeforeFirstLocalFileHeader() {
        return firstLocalFileHeaderOffset == 0
                ? null : createBoundedInputStream(0, firstLocalFileHeaderOffset);
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/sevenz/AES256SHA256Decoder.java`
#### Snippet
```java
    static byte[] utf16Decode(final char[] chars) {
        if (chars == null) {
            return null;
        }
        final ByteBuffer encoded = UTF_16LE.encode(CharBuffer.wrap(chars));
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/examples/Expander.java`
#### Snippet
```java

    private Path toPath(final File targetDirectory) {
        return targetDirectory != null ? targetDirectory.toPath() : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/examples/Expander.java`
#### Snippet
```java
        throws IOException {
        final Iterator<TarArchiveEntry> entryIterator = archive.getEntries().iterator();
        expand(() -> entryIterator.hasNext() ? entryIterator.next() : null,
            (entry, out) -> {
            try (InputStream in = archive.getInputStream((TarArchiveEntry) entry)) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
    public File getFile() {
        if (file == null) {
            return null;
        }
        return file.toFile();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java`
#### Snippet
```java
    private static FileTime fileTimeFromOptionalSeconds(final long seconds) {
        if (seconds <= 0) {
            return null;
        }
        return TimeUtils.unixTimeToFileTime(seconds);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
    public String getDefaultName() {
        if (DEFAULT_FILE_NAME.equals(fileName) || fileName == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java`
#### Snippet
```java
    public SevenZArchiveEntry getNextEntry() throws IOException {
        if (currentEntryIndex >= archive.files.length - 1) {
            return null;
        }
        ++currentEntryIndex;
```

## RuleId[ruleID=CopyConstructorMissesField]
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

