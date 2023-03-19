# commons-imaging 
 
# Bad smells
I found 783 bad smells with 29 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 170 | false |
| CommentedOutCode | 118 | false |
| AssignmentToMethodParameter | 92 | false |
| PointlessBitwiseExpression | 92 | false |
| PointlessArithmeticExpression | 32 | false |
| ConstantValue | 32 | false |
| BoundedWildcard | 25 | false |
| UnusedAssignment | 25 | false |
| StaticInitializerReferencesSubClass | 22 | false |
| RedundantFieldInitialization | 20 | false |
| UnnecessaryFullyQualifiedName | 15 | false |
| ReplaceAssignmentWithOperatorAssignment | 14 | false |
| NonProtectedConstructorInAbstractClass | 14 | true |
| StringConcatenationInsideStringBufferAppend | 14 | false |
| IntegerMultiplicationImplicitCastToLong | 13 | false |
| DataFlowIssue | 11 | false |
| UnnecessaryUnboxing | 9 | false |
| NestedAssignment | 9 | false |
| UnnecessarySuperQualifier | 8 | false |
| DuplicateBranchesInSwitch | 6 | false |
| ConstantMathCall | 6 | false |
| UnnecessaryLocalVariable | 6 | true |
| StringBufferReplaceableByString | 4 | false |
| ProtectedMemberInFinalClass | 3 | true |
| IOResource | 2 | false |
| UtilityClassWithoutPrivateConstructor | 2 | true |
| SizeReplaceableByIsEmpty | 2 | true |
| UnnecessaryToStringCall | 2 | true |
| IfStatementWithIdenticalBranches | 2 | false |
| MismatchedArrayReadWrite | 1 | false |
| UnnecessarySemicolon | 1 | false |
| MismatchedJavadocCode | 1 | false |
| CatchMayIgnoreException | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| AssignmentToForLoopParameter | 1 | false |
| RedundantMethodOverride | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| SynchronizeOnThis | 1 | false |
| RedundantUnmodifiable | 1 | false |
| CastCanBeRemovedNarrowingVariableType | 1 | false |
## RuleId[id=IOResource]
### IOResource
'CachingInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/commons/imaging/icc/IccProfileParser.java`
#### Snippet
```java

    private IccProfileInfo readICCProfileInfo(InputStream is) {
        final CachingInputStream cis = new CachingInputStream(is);
        is = cis;

```

### IOResource
'DeflaterOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/commons/imaging/formats/png/PngWriter.java`
#### Snippet
```java
            final int chunkSize = 256 * 1024;
            final Deflater deflater = new Deflater(compressionLevel);
            final DeflaterOutputStream dos = new DeflaterOutputStream(baos,deflater,chunkSize);

            for (int index = 0; index < uncompressed.length; index += chunkSize) {
```

## RuleId[id=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `quantizationTables` are written to, but never read
in `src/main/java/org/apache/commons/imaging/formats/jpeg/decoder/JpegDecoder.java`
#### Snippet
```java
     */

    private final DqtSegment.QuantizationTable[] quantizationTables = new DqtSegment.QuantizationTable[4];
    private final DhtSegment.HuffmanTable[] huffmanDCTables = new DhtSegment.HuffmanTable[4];
    private final DhtSegment.HuffmanTable[] huffmanACTables = new DhtSegment.HuffmanTable[4];
```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java

    private static double toDouble(final byte[] bytes, final int offset, final ByteOrder byteOrder) {
        final long byte0 = 0xffL & bytes[offset + 0];
        final long byte1 = 0xffL & bytes[offset + 1];
        final long byte2 = 0xffL & bytes[offset + 2];
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java

    public static int toUInt16(final byte[] bytes, final int offset, final ByteOrder byteOrder) {
        final int byte0 = 0xff & bytes[offset + 0];
        final int byte1 = 0xff & bytes[offset + 1];
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
        final int bits = Float.floatToRawIntBits(value);
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            result[offset + 0] = (byte) (0xff & (bits >> 0));
            result[offset + 1] = (byte) (0xff & (bits >> 8));
            result[offset + 2] = (byte) (0xff & (bits >> 16));
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
            result[offset + 2] = (byte) (0xff & (bits >> 8));
            result[offset + 1] = (byte) (0xff & (bits >> 16));
            result[offset + 0] = (byte) (0xff & (bits >> 24));
        }
    }
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
            final byte[] result, final int offset) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            result[offset + 0] = (byte) (value.numerator >> 24);
            result[offset + 1] = (byte) (value.numerator >> 16);
            result[offset + 2] = (byte) (value.numerator >> 8);
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
            result[offset + 2] = (byte) (value.numerator >> 16);
            result[offset + 1] = (byte) (value.numerator >> 8);
            result[offset + 0] = (byte) (value.numerator >> 0);
            result[offset + 7] = (byte) (value.divisor >> 24);
            result[offset + 6] = (byte) (value.divisor >> 16);
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
            final ByteOrder byteOrder,
            final boolean unsignedType) {
        final int byte0 = 0xff & bytes[offset + 0];
        final int byte1 = 0xff & bytes[offset + 1];
        final int byte2 = 0xff & bytes[offset + 2];
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java

    private static float toFloat(final byte[] bytes, final int offset, final ByteOrder byteOrder) {
        final int byte0 = 0xff & bytes[offset + 0];
        final int byte1 = 0xff & bytes[offset + 1];
        final int byte2 = 0xff & bytes[offset + 2];
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java

    public static int toInt(final byte[] bytes, final int offset, final ByteOrder byteOrder) {
        final int byte0 = 0xff & bytes[offset + 0];
        final int byte1 = 0xff & bytes[offset + 1];
        final int byte2 = 0xff & bytes[offset + 2];
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
        final long bits = Double.doubleToRawLongBits(value);
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            result[offset + 0] = (byte) (0xff & (bits >> 0));
            result[offset + 1] = (byte) (0xff & (bits >> 8));
            result[offset + 2] = (byte) (0xff & (bits >> 16));
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
            result[offset + 2] = (byte) (0xff & (bits >> 40));
            result[offset + 1] = (byte) (0xff & (bits >> 48));
            result[offset + 0] = (byte) (0xff & (bits >> 56));
        }
    }
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
    private static void toBytes(final int value, final ByteOrder byteOrder, final byte[] result, final int offset) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            result[offset + 0] = (byte) (value >> 24);
            result[offset + 1] = (byte) (value >> 16);
            result[offset + 2] = (byte) (value >> 8);
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
            result[offset + 2] = (byte) (value >> 16);
            result[offset + 1] = (byte) (value >> 8);
            result[offset + 0] = (byte) (value >> 0);
        }
    }
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
    private static void toBytes(final short value, final ByteOrder byteOrder, final byte[] result, final int offset) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            result[offset + 0] = (byte) (value >> 8);
            result[offset + 1] = (byte) (value >> 0);
        } else {
```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
        } else {
            result[offset + 1] = (byte) (value >> 8);
            result[offset + 0] = (byte) (value >> 0);
        }
    }
```

### PointlessArithmeticExpression
`byteCount + 0` can be replaced with 'byteCount'
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParserBitFields.java`
#### Snippet
```java
        switch (bhi.bitsPerPixel) {
        case 8:
            data = 0xff & imageData[byteCount + 0];
            byteCount += 1;
            break;
```

### PointlessArithmeticExpression
`0 * 256` can be replaced with '0'
in `src/main/java/org/apache/commons/imaging/formats/psd/dataparsers/DataParserIndexed.java`
#### Snippet
```java
        colorTable = new int[256];
        Arrays.setAll(colorTable, i -> {
            final int red = 0xff & colorModeData[0 * 256 + i];
            final int green = 0xff & colorModeData[1 * 256 + i];
            final int blue = 0xff & colorModeData[2 * 256 + i];
```

### PointlessArithmeticExpression
`0 * 256 + i` can be replaced with 'i'
in `src/main/java/org/apache/commons/imaging/formats/psd/dataparsers/DataParserIndexed.java`
#### Snippet
```java
        colorTable = new int[256];
        Arrays.setAll(colorTable, i -> {
            final int red = 0xff & colorModeData[0 * 256 + i];
            final int green = 0xff & colorModeData[1 * 256 + i];
            final int blue = 0xff & colorModeData[2 * 256 + i];
```

### PointlessArithmeticExpression
`1 * 256` can be replaced with '256'
in `src/main/java/org/apache/commons/imaging/formats/psd/dataparsers/DataParserIndexed.java`
#### Snippet
```java
        Arrays.setAll(colorTable, i -> {
            final int red = 0xff & colorModeData[0 * 256 + i];
            final int green = 0xff & colorModeData[1 * 256 + i];
            final int blue = 0xff & colorModeData[2 * 256 + i];
            final int alpha = 0xff;
```

### PointlessArithmeticExpression
`1 * precision` can be replaced with 'precision'
in `src/main/java/org/apache/commons/imaging/palette/PaletteFactory.java`
#### Snippet
```java
            final int b = (blue << (2 * precision));
            for (int green = mins[1]; green <= maxs[1]; green++) {
                final int g = (green << (1 * precision));
                for (int red = mins[0]; red <= maxs[0]; red++) {
                    final int index = b | g | red;
```

### PointlessArithmeticExpression
`4 * x + 0` can be replaced with '4 \* x'
in `src/main/java/org/apache/commons/imaging/formats/pcx/PcxWriter.java`
#### Snippet
```java
            src.getRGB(0, y, src.getWidth(), 1, rgbs, 0, src.getWidth());
            for (int x = 0; x < rgbs.length; x++) {
                plane[4 * x + 0] = (byte) rgbs[x];
                plane[4 * x + 1] = (byte) (rgbs[x] >> 8);
                plane[4 * x + 2] = (byte) (rgbs[x] >> 16);
```

### PointlessArithmeticExpression
`3 * i + 0` can be replaced with '3 \* i'
in `src/main/java/org/apache/commons/imaging/formats/pcx/PcxWriter.java`
#### Snippet
```java
                rgb = 0;
            }
            palette16[3 * i + 0] = (byte) (0xff & (rgb >> 16));
            palette16[3 * i + 1] = (byte) (0xff & (rgb >> 8));
            palette16[3 * i + 2] = (byte) (0xff & rgb);
```

### PointlessArithmeticExpression
`1 * precision` can be replaced with 'precision'
in `src/main/java/org/apache/commons/imaging/palette/ColorSpaceSubset.java`
#### Snippet
```java
                    // note: order reversed
                    final int idx = (blue << (2 * precision))
                            | (green << (1 * precision))
                            | (red << (0 * precision));
                    final int count = table[idx];
```

### PointlessArithmeticExpression
`0 * precision` can be replaced with '0'
in `src/main/java/org/apache/commons/imaging/palette/ColorSpaceSubset.java`
#### Snippet
```java
                    final int idx = (blue << (2 * precision))
                            | (green << (1 * precision))
                            | (red << (0 * precision));
                    final int count = table[idx];
                    redsum += count * (red << (8 - precision));
```

### PointlessArithmeticExpression
`byteCount + 0` can be replaced with 'byteCount'
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParserRgb.java`
#### Snippet
```java
        }
        if (bhi.bitsPerPixel == 8) { // always grayscale?
            final int sample = 0xff & imageData[byteCount + 0];

            final int rgb = getColorTableRGB(sample);
```

### PointlessArithmeticExpression
`byteCount + 0` can be replaced with 'byteCount'
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParserRgb.java`
#### Snippet
```java
        }
        if (bhi.bitsPerPixel == 24) {
            final int blue = 0xff & imageData[byteCount + 0];
            final int green = 0xff & imageData[byteCount + 1];
            final int red = 0xff & imageData[byteCount + 2];
```

### PointlessArithmeticExpression
`byteCount + 0` can be replaced with 'byteCount'
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParserRgb.java`
#### Snippet
```java
        }
        if (bhi.bitsPerPixel == 32) {
            final int blue = 0xff & imageData[byteCount + 0];
            final int green = 0xff & imageData[byteCount + 1];
            final int red = 0xff & imageData[byteCount + 2];
```

### PointlessArithmeticExpression
`precision * 1` can be replaced with 'precision'
in `src/main/java/org/apache/commons/imaging/palette/QuantizedPalette.java`
#### Snippet
```java
                    for (int k = subset.mins[2]; k <= subset.maxs[2]; k++) {
                        final int index = (u << (precision * 2))
                                | (j << (precision * 1))
                                | (k << (precision * 0));
                        straight[index] = subset;
```

### PointlessArithmeticExpression
`precision * 0` can be replaced with '0'
in `src/main/java/org/apache/commons/imaging/palette/QuantizedPalette.java`
#### Snippet
```java
                        final int index = (u << (precision * 2))
                                | (j << (precision * 1))
                                | (k << (precision * 0));
                        straight[index] = subset;
                    }
```

### PointlessArithmeticExpression
`index + 0` can be replaced with 'index'
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParser.java`
#### Snippet
```java
    int getColorTableRGB(int index) {
        index *= 4;
        final int blue = 0xff & colorTable[index + 0];
        final int green = 0xff & colorTable[index + 1];
        final int red = 0xff & colorTable[index + 2];
```

### PointlessArithmeticExpression
`(i * 3) + 0` can be replaced with '(i \* 3)'
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java

        for (int i = 0; i < length; i++) {
            final int red = 0xff & bytes[(i * 3) + 0];
            final int green = 0xff & bytes[(i * 3) + 1];
            final int blue = 0xff & bytes[(i * 3) + 2];
```

### PointlessArithmeticExpression
`index + 0` can be replaced with 'index'
in `src/main/java/org/apache/commons/imaging/formats/png/PngWriter.java`
#### Snippet
```java
            final int index = i * 3;
            // Debug.debug("index", index);
            bytes[index + 0] = (byte) (0xff & (rgb >> 16));
            bytes[index + 1] = (byte) (0xff & (rgb >> 8));
            bytes[index + 2] = (byte) (0xff & (rgb >> 0));
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ZlibDeflate` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/imaging/common/ZlibDeflate.java`
#### Snippet
```java
 * </p>
 */
public class ZlibDeflate {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `T4_T6_Tables` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/imaging/common/itu_t4/T4_T6_Tables.java`
#### Snippet
```java
package org.apache.commons.imaging.common.itu_t4;

class T4_T6_Tables {
    public static final Entry[] WHITE_TERMINATING_CODES = {
            new Entry("00110101", 0),
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `src/main/java/org/apache/commons/imaging/formats/icns/IcnsImageParser.java`
#### Snippet
```java

            final IcnsType maskType = IcnsType.find8BPPMaskType(imageType);
            bos.write4Bytes(maskType.getType());
            bos.write4Bytes(4 + 4 + imageType.getWidth() * imageType.getWidth());
            for (int y = 0; y < src.getHeight(); y++) {
```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `src/main/java/org/apache/commons/imaging/formats/pcx/PcxWriter.java`
#### Snippet
```java
        for (int i = 0; i < 16; i++) {
            int rgb;
            if (i < palette.length()) {
                rgb = palette.getEntry(i);
            } else {
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
                // proper handling would be ARGB.
                hasAlpha = true;
                isAlphaPremultiplied = false;
            } else {
                final int extraSamplesValue = extraSamplesField.getIntValue();
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
                    case TiffTagConstants.EXTRA_SAMPLE_UNASSOCIATED_ALPHA:
                        hasAlpha = true;
                        isAlphaPremultiplied = false;
                        break;
                    case TiffTagConstants.EXTRA_SAMPLE_ASSOCIATED_ALPHA:
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
                    case 0:
                    default:
                        hasAlpha = false;
                        isAlphaPremultiplied = false;
                        break;
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
                    default:
                        hasAlpha = false;
                        isAlphaPremultiplied = false;
                        break;
                }
```

### DataFlowIssue
Method invocation `name` may produce `NullPointerException`
in `src/main/java/org/apache/commons/imaging/formats/png/PngImageParser.java`
#### Snippet
```java
        }
        final PngChunkIhdr pngChunkIHDR = (PngChunkIhdr) IHDRs.get(0);
        pw.println("Color: " + pngChunkIHDR.pngColorType.name());

        pw.println("chunks: " + chunks.size());
```

### DataFlowIssue
Method invocation `hasAlpha` may produce `NullPointerException`
in `src/main/java/org/apache/commons/imaging/formats/png/PngImageParser.java`
#### Snippet
```java
        } else {
            // CE - Fix Alpha.
            transparent = pngChunkIHDR.pngColorType.hasAlpha();
            // END FIX
        }
```

### DataFlowIssue
Method invocation `getSamplesPerPixel` may produce `NullPointerException`
in `src/main/java/org/apache/commons/imaging/formats/png/PngImageParser.java`
#### Snippet
```java
        }

        final int bitsPerPixel = pngChunkIHDR.bitDepth * pngChunkIHDR.pngColorType.getSamplesPerPixel();
        final ImageFormat format = ImageFormats.PNG;
        final String formatName = "PNG Portable Network Graphics";
```

### DataFlowIssue
Argument `pngChunkIHDR.pngColorType` might be null
in `src/main/java/org/apache/commons/imaging/formats/png/PngImageParser.java`
#### Snippet
```java
        if (!tRNSs.isEmpty()) {
            final PngChunk pngChunktRNS = tRNSs.get(0);
            transparencyFilter = getTransparencyFilter(pngChunkIHDR.pngColorType, pngChunktRNS);
        }

```

### DataFlowIssue
Method invocation `getSamplesPerPixel` may produce `NullPointerException`
in `src/main/java/org/apache/commons/imaging/formats/png/PngImageParser.java`
#### Snippet
```java
            }

            final int bitsPerPixel = bitDepth * pngColorType.getSamplesPerPixel();

            final boolean hasAlpha = pngColorType.hasAlpha() || transparencyFilter != null;
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffRasterDataType.java`
#### Snippet
```java
     * may result in a truncated value.
     */
    FLOAT;
}

```

## RuleId[id=StaticInitializerReferencesSubClass]
### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeLong from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
    public static final List<FieldType> LONG_OR_IFD =
            Collections.unmodifiableList(Arrays.asList(
                    (FieldType) LONG, IFD));

    public static final List<FieldType> ASCII_OR_RATIONAL =
```

### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeLong from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
    public static final FieldTypeByte UNDEFINED = new FieldTypeByte(7, "Undefined");
    public static final FieldTypeShort SSHORT = new FieldTypeShort(8, "SShort");
    public static final FieldTypeLong SLONG = new FieldTypeLong(9, "SLong");
    public static final FieldTypeRational SRATIONAL = new FieldTypeRational(10, "SRational");
    public static final FieldTypeFloat FLOAT = new FieldTypeFloat(11, "Float");
```

### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeAscii from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
public abstract class FieldType {
    public static final FieldTypeByte BYTE = new FieldTypeByte(1, "Byte");
    public static final FieldTypeAscii ASCII = new FieldTypeAscii(2, "ASCII");
    public static final FieldTypeShort SHORT = new FieldTypeShort(3, "Short");
    public static final FieldTypeLong LONG = new FieldTypeLong(4, "Long");
```

### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeByte from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
 */
public abstract class FieldType {
    public static final FieldTypeByte BYTE = new FieldTypeByte(1, "Byte");
    public static final FieldTypeAscii ASCII = new FieldTypeAscii(2, "ASCII");
    public static final FieldTypeShort SHORT = new FieldTypeShort(3, "Short");
```

### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeByte from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
    public static final List<FieldType> ASCII_OR_BYTE =
            Collections.unmodifiableList(Arrays.asList(
                    ASCII, BYTE));

    protected FieldType(final int type, final String name, final int elementSize) {
```

### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeRational from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
    public static final FieldTypeShort SSHORT = new FieldTypeShort(8, "SShort");
    public static final FieldTypeLong SLONG = new FieldTypeLong(9, "SLong");
    public static final FieldTypeRational SRATIONAL = new FieldTypeRational(10, "SRational");
    public static final FieldTypeFloat FLOAT = new FieldTypeFloat(11, "Float");
    public static final FieldTypeDouble DOUBLE = new FieldTypeDouble(12, "Double");
```

### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeByte from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
    public static final FieldTypeRational RATIONAL = new FieldTypeRational(5, "Rational");
    public static final FieldTypeByte SBYTE = new FieldTypeByte(6, "SByte");
    public static final FieldTypeByte UNDEFINED = new FieldTypeByte(7, "Undefined");
    public static final FieldTypeShort SSHORT = new FieldTypeShort(8, "SShort");
    public static final FieldTypeLong SLONG = new FieldTypeLong(9, "SLong");
```

### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeLong from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
    public static final List<FieldType> LONG_OR_SHORT =
            Collections.unmodifiableList(Arrays.asList(
                    SHORT, LONG));

    public static final List<FieldType> BYTE_OR_SHORT =
```

### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeLong from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
    public static final FieldTypeAscii ASCII = new FieldTypeAscii(2, "ASCII");
    public static final FieldTypeShort SHORT = new FieldTypeShort(3, "Short");
    public static final FieldTypeLong LONG = new FieldTypeLong(4, "Long");
    public static final FieldTypeRational RATIONAL = new FieldTypeRational(5, "Rational");
    public static final FieldTypeByte SBYTE = new FieldTypeByte(6, "SByte");
```

### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeRational from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
    public static final List<FieldType> ASCII_OR_RATIONAL =
            Collections.unmodifiableList(Arrays.asList(
                    ASCII, RATIONAL));

    public static final List<FieldType> ASCII_OR_BYTE =
```

### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeLong from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
    public static final FieldTypeFloat FLOAT = new FieldTypeFloat(11, "Float");
    public static final FieldTypeDouble DOUBLE = new FieldTypeDouble(12, "Double");
    public static final FieldTypeLong IFD = new FieldTypeLong(13, "IFD");

    private final int type;
```

### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeRational from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
    public static final FieldTypeShort SHORT = new FieldTypeShort(3, "Short");
    public static final FieldTypeLong LONG = new FieldTypeLong(4, "Long");
    public static final FieldTypeRational RATIONAL = new FieldTypeRational(5, "Rational");
    public static final FieldTypeByte SBYTE = new FieldTypeByte(6, "SByte");
    public static final FieldTypeByte UNDEFINED = new FieldTypeByte(7, "Undefined");
```

### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeRational from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
    public static final List<FieldType> SHORT_OR_LONG_OR_RATIONAL =
            Collections.unmodifiableList(Arrays.asList(
                    SHORT, LONG, RATIONAL));

    public static final List<FieldType> LONG_OR_SHORT =
```

### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeLong from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
                    UNDEFINED, SSHORT, SLONG,
                    SRATIONAL, FLOAT, DOUBLE,
                    IFD));

    public static final List<FieldType> SHORT_OR_LONG =
```

### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeShort from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
    public static final FieldTypeByte BYTE = new FieldTypeByte(1, "Byte");
    public static final FieldTypeAscii ASCII = new FieldTypeAscii(2, "ASCII");
    public static final FieldTypeShort SHORT = new FieldTypeShort(3, "Short");
    public static final FieldTypeLong LONG = new FieldTypeLong(4, "Long");
    public static final FieldTypeRational RATIONAL = new FieldTypeRational(5, "Rational");
```

### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeByte from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
    public static final FieldTypeLong LONG = new FieldTypeLong(4, "Long");
    public static final FieldTypeRational RATIONAL = new FieldTypeRational(5, "Rational");
    public static final FieldTypeByte SBYTE = new FieldTypeByte(6, "SByte");
    public static final FieldTypeByte UNDEFINED = new FieldTypeByte(7, "Undefined");
    public static final FieldTypeShort SSHORT = new FieldTypeShort(8, "SShort");
```

### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeFloat from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
    public static final FieldTypeLong SLONG = new FieldTypeLong(9, "SLong");
    public static final FieldTypeRational SRATIONAL = new FieldTypeRational(10, "SRational");
    public static final FieldTypeFloat FLOAT = new FieldTypeFloat(11, "Float");
    public static final FieldTypeDouble DOUBLE = new FieldTypeDouble(12, "Double");
    public static final FieldTypeLong IFD = new FieldTypeLong(13, "IFD");
```

### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeByte from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
    public static final List<FieldType> BYTE_OR_SHORT =
            Collections.unmodifiableList(Arrays.asList(
                    SHORT, BYTE));

    public static final List<FieldType> LONG_OR_IFD =
```

### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeRational from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
    public static final List<FieldType> SHORT_OR_RATIONAL =
            Collections.unmodifiableList(Arrays.asList(
                    SHORT, RATIONAL));

    public static final List<FieldType> SHORT_OR_LONG_OR_RATIONAL =
```

### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeShort from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
    public static final FieldTypeByte SBYTE = new FieldTypeByte(6, "SByte");
    public static final FieldTypeByte UNDEFINED = new FieldTypeByte(7, "Undefined");
    public static final FieldTypeShort SSHORT = new FieldTypeShort(8, "SShort");
    public static final FieldTypeLong SLONG = new FieldTypeLong(9, "SLong");
    public static final FieldTypeRational SRATIONAL = new FieldTypeRational(10, "SRational");
```

### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeDouble from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
    public static final FieldTypeRational SRATIONAL = new FieldTypeRational(10, "SRational");
    public static final FieldTypeFloat FLOAT = new FieldTypeFloat(11, "Float");
    public static final FieldTypeDouble DOUBLE = new FieldTypeDouble(12, "Double");
    public static final FieldTypeLong IFD = new FieldTypeLong(13, "IFD");

```

### StaticInitializerReferencesSubClass
Referencing subclass FieldTypeLong from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
    public static final List<FieldType> SHORT_OR_LONG =
            Collections.unmodifiableList(Arrays.asList(
                    SHORT, LONG));

    public static final List<FieldType> SHORT_OR_RATIONAL =
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/imaging/formats/pnm/FileInfo.java`
#### Snippet
```java
        // }
        // finally
        // {
        // System.out.println("count: " + count);
        // dump();
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/common/GenericImageMetadata.java`
#### Snippet
```java
                result.append(NEWLINE);
            }
            // if (null != prefix)
            // result.append(prefix);

```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/common/GenericImageMetadata.java`
#### Snippet
```java
            result.append(item.toString(prefix + "\t"));

            // Debug.debug("prefix", prefix);
            // Debug.debug("item", items.get(i));
            // Debug.debug();
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java

            skipBytes(is, colorModeDataLength);
            // byte ColorModeData[] = readByteArray("ColorModeData",
            // ColorModeDataLength, is, "Not a Valid PSD File");

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java

            skipBytes(is, imageResourcesLength);
            // byte ImageResources[] = readByteArray("ImageResources",
            // ImageResourcesLength, is, "Not a Valid PSD File");

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java

            skipBytes(is, layerAndMaskDataLength);
            // byte LayerAndMaskData[] = readByteArray("LayerAndMaskData",
            // LayerAndMaskDataLength, is, "Not a Valid PSD File");

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
            read2Bytes("Compression", is, "Not a Valid PSD File", getByteOrder());

            // byte ImageData[] = readByteArray("ImageData",
            // LayerAndMaskDataLength, is, "Not a Valid PSD File");

```

### CommentedOutCode
Commented out code (7 lines)
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
        }

        // ImageDescriptor id = (ImageDescriptor)
        // findBlock(fImageContents.blocks,
        // kImageSeperator);
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
        final int width = header.columns;
        final int height = header.rows;
        // int height = header.Columns;

        // int transfer_type;
```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
            final byte[] ColorModeData = getData(byteSource, PSD_SECTION_COLOR_MODE);

            // ImageResourceBlock block = findImageResourceBlock(blocks,
            // 0x03EB);
            // if (block == null)
```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
        }
        case 7: // Multichannel=7;
            // fDataParser = new DataParserStub();
            // break;

```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
            fDataReader.readData(is, result, imageContents, this);

            // is.
            // ImageContents imageContents = readImageContents(is);
            // return imageContents;
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
            final int dataSize = read4Bytes("Size", is, "Not a Valid PSD File", getByteOrder());
            available -= 4;
            // int ActualDataSize = ((DataSize % 2) == 0)
            // ? DataSize
            // : DataSize + 1; // pad to make even
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java

        int BitsPerPixel = header.depth * getChannelsPerMode(header.mode);
        // System.out.println("header.Depth: " + header.Depth);
        // System.out.println("header.Mode: " + header.Mode);
        // System.out.println("getChannelsPerMode(header.Mode): " +
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
                "Not a Valid PSD File", getByteOrder());
        skipBytes(is, ColorModeDataLength);
        // is.skip(ColorModeDataLength);
        // byte ColorModeData[] = readByteArray("ColorModeData",
        // ColorModeDataLength, is, "Not a Valid PSD File");
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
                "Not a Valid PSD File", getByteOrder());
        skipBytes(is, ImageResourcesLength);
        // long skipped = is.skip(ImageResourcesLength);
        // byte ImageResources[] = readByteArray("ImageResources",
        // ImageResourcesLength, is, "Not a Valid PSD File");
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
                "Not a Valid PSD File", getByteOrder());
        skipBytes(is, LayerAndMaskDataLength);
        // is.skip(LayerAndMaskDataLength);
        // byte LayerAndMaskData[] = readByteArray("LayerAndMaskData",
        // LayerAndMaskDataLength, is, "Not a Valid PSD File");
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
        final int Compression = read2Bytes("Compression", is, "Not a Valid PSD File", getByteOrder());

        // skip_bytes(is, LayerAndMaskDataLength);
        // byte ImageData[] = readByteArray("ImageData", LayerAndMaskDataLength,
        // is, "Not a Valid PSD File");
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java

            skipBytes(is, ColorModeDataLength);
            // byte ColorModeData[] = readByteArray("ColorModeData",
            // ColorModeDataLength, is, "Not a Valid PSD File");

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java

            skipBytes(is, ImageResourcesLength);
            // byte ImageResources[] = readByteArray("ImageResources",
            // ImageResourcesLength, is, "Not a Valid PSD File");

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java

            skipBytes(is, LayerAndMaskDataLength);
            // byte LayerAndMaskData[] = readByteArray("LayerAndMaskData",
            // LayerAndMaskDataLength, is, "Not a Valid PSD File");

```

### CommentedOutCode
Commented out code (6 lines)
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
            read2Bytes("Compression", is, "Not a Valid PSD File", getByteOrder());

            // byte ImageData[] = readByteArray("ImageData",
            // LayerAndMaskDataLength, is, "Not a Valid PSD File");

```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/common/itu_t4/BitInputStreamFlexible.java`
#### Snippet
```java
                    throw new IOException("couldn't read bits");
                }
                // System.out.println("cache 1: " + cache + " ("
                // + Integer.toHexString(cache) + ", "
                // + Integer.toBinaryString(cache) + ")");
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/common/itu_t4/BitInputStreamFlexible.java`
#### Snippet
```java
                    throw new IOException("couldn't read bits");
                }
                // System.out.println("cache 2: " + cache + " ("
                // + Integer.toHexString(cache) + ", "
                // + Integer.toBinaryString(cache) + ")");
```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageContents.java`
#### Snippet
```java
        pw.println("LayerAndMaskDataLength: " + LayerAndMaskDataLength + " ("
                + Integer.toHexString(LayerAndMaskDataLength) + ")");
        // System.out.println("Depth: " + Depth + " ("
        // + Integer.toHexString(Depth) + ")");
        // System.out.println("Mode: " + Mode + " (" + Integer.toHexString(Mode)
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/psd/datareaders/CompressedDataReader.java`
#### Snippet
```java
                    + "]", is, "PSD: bad Image Data", bfp.getByteOrder());
        }
        // System.out.println("fImageContents.Compression: "
        // + imageContents.Compression);

```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/org/apache/commons/imaging/formats/png/scanlinefilters/ScanlineFilterUp.java`
#### Snippet
```java
            }

            // if(i<10)
            // System.out.println("\t" + i + ": " + dst[i]);
            // dst[i] = b;
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/formats/png/scanlinefilters/ScanlineFilterPaeth.java`
#### Snippet
```java

            dst[i] = (byte) ((src[i] + paethPredictor) % 256);
            // dst[i] = (byte) ((src[i] + paethPredictor) );
            // dst[i] = src[i];

```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputDirectory.java`
#### Snippet
```java
            field.writeField(bos);

            // Debug.debug("\t" + "writing field (" + field.tag + ", 0x" +
            // Integer.toHexString(field.tag) + ")", field.tagInfo);
            // if(field.tagInfo.isOffset())
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffImageWriterBase.java`
#### Snippet
```java
            final int dirType = directory.type;
            directoryTypeMap.put(dirType, directory);
            // Debug.debug("validating dirType", dirType + " ("
            // + directory.getFields().size() + " fields)");

```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffImageWriterBase.java`
#### Snippet
```java
        final byte[][] strips = getStrips(src, samplesPerPixel, bitsPerSample, rowsPerStrip);

        // System.out.println("width: " + width);
        // System.out.println("height: " + height);
        // System.out.println("fRowsPerStrip: " + fRowsPerStrip);
```

### CommentedOutCode
Commented out code (13 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffImageWriterBase.java`
#### Snippet
```java
                break;
            }
            // {
            // stripOffsetsField = new WriteField(TIFF_TAG_STRIP_OFFSETS,
            // FIELD_TYPE_LONG, stripOffsets.length, FIELD_TYPE_LONG
```

### CommentedOutCode
Commented out code (6 lines)
in `src/main/java/org/apache/commons/imaging/formats/png/GammaCorrection.java`
#### Snippet
```java

    private int correctSample(final int sample, final double srcGamma, final double dstGamma) {
        // if (kUseAdobeGammaMethod && val <= 32)
        // {
        // double slope = Math.round(255.0d * Math.pow((32.0 / 255.0d),
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffField.java`
#### Snippet
```java
    public int getIntValueOrArraySum() throws ImageReadException {
        final Object o = getValue();
        // if (o == null)
        // return -1;

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffField.java`
#### Snippet
```java
    public int[] getIntArrayValue() throws ImageReadException {
        final Object o = getValue();
        // if (o == null)
        // return null;

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffField.java`
#### Snippet
```java
    public double[] getDoubleArrayValue() throws ImageReadException {
        final Object o = getValue();
        // if (o == null)
        // return null;

```

### CommentedOutCode
Commented out code (14 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffField.java`
#### Snippet
```java
            return result.toString();
        // } else if (o instanceof Number[])
        // {
        // Number numbers[] = (Number[]) o;
        // StringBuilder result = new StringBuilder();
```

### CommentedOutCode
Commented out code (15 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffField.java`
#### Snippet
```java
            return result.toString();
        }
        // else if (o instanceof short[])
        // {
        // short numbers[] = (short[]) o;
```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/org/apache/commons/imaging/icc/IccProfileParser.java`
#### Snippet
```java

    public boolean issRGB(final ByteSource byteSource) throws IOException {
        // setDebug(true);

        // long length = byteSource.getLength();
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/icc/IccProfileParser.java`
#### Snippet
```java
            read4Bytes("ProfileSize", is, "Not a Valid ICC Profile", getByteOrder());

            // if (length != ProfileSize)
            // return null;

```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/icc/IccProfileParser.java`
#### Snippet
```java
        is = cis;

        // setDebug(true);

        // if (LOGGER.isLoggable(Level.FINEST))
```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/org/apache/commons/imaging/icc/IccProfileParser.java`
#### Snippet
```java

            skipBytes(is, 16, "Not a Valid ICC Profile");
            // readByteArray("ProfileID", 16, is,
            // "Not a Valid ICC Profile");
            // if (LOGGER.isLoggable(Level.FINEST))
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/icc/IccProfileParser.java`
#### Snippet
```java
            for (int i = 0; i < tagCount; i++) {
                final int tagSignature = read4Bytes("TagSignature[" + i + "]", is, "Not a Valid ICC Profile", getByteOrder());
                // Debug.debug("TagSignature t "
                // + Integer.toHexString(TagSignature));

```

### CommentedOutCode
Commented out code (10 lines)
in `src/main/java/org/apache/commons/imaging/icc/IccProfileParser.java`
#### Snippet
```java

                final IccTagType fIccTagType = getIccTagType(tagSignature);
                // if (fIccTagType == null)
                // throw new Error("oops.");

```

### CommentedOutCode
Commented out code (18 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffReader.java`
#### Snippet
```java

//    NOT USED
//    private static class DirectoryCollector extends Collector {
//        private final boolean readImageData;
//
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java
                    break;
                case 1: // EOF
                    // System.out.println("xXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"
                    // );
                    done = true;
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java
                    break;
                case 2: {
                    // System.out.println("xXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"
                    // );
                    final int c = 0xff & readByte("RLE c", is, "BMP: Bad RLE");
```

### CommentedOutCode
Commented out code (6 lines)
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java
                    }

                    // System.out.println("b: " + b);
                    // System.out.println("size: " + size);
                    // System.out.println("RLESamplesPerByte: " +
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java
                paletteLength = 0;
            }
            // BytesPerPaletteEntry = 0;
            // System.out.println("Compression: BI_RGBx2: " + bhi.BitsPerPixel);
            // System.out.println("Compression: BI_RGBx2: " + (bhi.BitsPerPixel
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java
            // ExtraBitsPerPixel = 8;
            rle = true;
            // BytesPerPixel = 2;
            // BytesPerPaletteEntry = 0;
            break;
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java
                paletteLength = 0;
            }
            // BytesPerPixel = 2;
            // BytesPerPaletteEntry = 4;
            break;
```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java
        if (LOGGER.isLoggable(Level.FINE)) {
            final int pixelCount = bhi.width * bhi.height;
            // this.debugNumber("Total BitsPerPixel",
            // (ExtraBitsPerPixel + bhi.BitsPerPixel), 4);
            // this.debugNumber("Total Bit Per Line",
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java

        final BmpHeaderInfo bhi = ic.bhi;
        // byte colorTable[] = ic.colorTable;
        // byte imageData[] = ic.imageData;

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/palette/PaletteFactory.java`
#### Snippet
```java
            LOGGER.finest("first total: " + sum);
            LOGGER.finest("second total: " + (total - sum));
            // System.out.println("start: " + start);
            // System.out.println("end: " + end);
            LOGGER.finest("slice: " + slice);
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/GenericSegment.java`
#### Snippet
```java
    }

    // public String getDescription()
    // {
    // return "Unknown";
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/imaging/formats/png/scanlinefilters/ScanlineFilterSub.java`
#### Snippet
```java
            }

            // if(i<10)
            // System.out.println("\t" + i + ": " + dst[i] + " (" + src[i] +
            // ", " + prevIndex + ")");
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputField.java`
#### Snippet
```java

    protected void setData(final byte[] bytes) throws ImageWriteException {
        // if(tagInfo.isUnknown())
        // Debug.debug("unknown tag(0x" + Integer.toHexString(tag)
        // + ") setData", bytes);
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputField.java`
#### Snippet
```java
            separateValueItem.updateValue(bytes);
        }
        // if (isLocalValue() != wasLocalValue)
        // throw new Error("Bug. Locality disrupted! "
        // + tagInfo.getDescription());
```

### CommentedOutCode
Commented out code (16 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/iptc/IptcParser.java`
#### Snippet
```java
            Debug.debug("recordNumber: " + recordNumber + " (0x" + Integer.toHexString(recordNumber) + ")");

            // int recordPrefix = convertByteArrayToShort("recordPrefix", index,
            // bytes);
            // if (verbose)
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/iptc/IptcParser.java`
#### Snippet
```java
            index += recordSize;

            // Debug.debug("recordSize", recordSize + " (0x"
            // + Integer.toHexString(recordSize) + ")");

```

### CommentedOutCode
Commented out code (23 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/iptc/IptcParser.java`
#### Snippet
```java
                continue;
            }
            // if (recordVersion == null)
            // {
            // // The first record in a JPEG/Photoshop IPTC block must be
```

### CommentedOutCode
Commented out code (9 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/iptc/IptcParser.java`
#### Snippet
```java
            final IptcType iptcType = IptcTypeLookup.getIptcType(recordType);

            // Debug.debug("iptcType", iptcType);
            // debugByteArray("iptcData", iptcData);
            // Debug.debug();
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/iptc/IptcParser.java`
#### Snippet
```java

                final byte[] recordData = element.getValue().getBytes(charset);
                /*
                if (!new String(recordData, charset).equals(element.getValue())) {
                    throw new ImageWriteException(
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java
        }

        // if (SOF_segments.size() != 1)
        // System.out.println("Incoherent SOFN Data Found: "
        // + SOF_segments.size());
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java

        final SofnSegment fSOFNSegment = (SofnSegment) SOF_segments.get(0);
        // SofnSegment fSOFNSegment = (SofnSegment) findSegment(segments,
        // SOFNmarkers);

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java
        }

        // JfifSegment fTheJFIFSegment = (JfifSegment) findSegment(segments,
        // kJFIFMarker);

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java
        double yDensity = -1.0;
        double unitsPerInch = -1.0;
        // int JFIF_major_version;
        // int JFIF_minor_version;
        String formatDetails;
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java
            yDensity = jfifSegment.yDensity;
            final int densityUnits = jfifSegment.densityUnits;
            // JFIF_major_version = fTheJFIFSegment.JFIF_major_version;
            // JFIF_minor_version = fTheJFIFSegment.JFIF_minor_version;

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java
                // // Debug.debug("visitSegment keepMarker(marker, markers)",
                // keepMarker(marker, markers));
                // Debug.debug("visitSegment keepMarker(marker, markers)",
                // keepMarker(marker, markers));

```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java
        final byte[] bytes = segment.getSegmentData();

        // byte head[] = readBytearray("exif head", bytes, 0, 6);
        //
        // Debug.debug("head", head);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/SosSegment.java`
#### Snippet
```java
        numberOfComponents = readByte("number_of_components_in_scan", is,
                "Not a Valid JPEG File");
        // Debug.debug("number_of_components_in_scan",
        // numberOfComponents);

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/SosSegment.java`
#### Snippet
```java
                    "acDcEntropyCodingTableSelector", is,
                    "Not a Valid JPEG File");
            // Debug.debug("ac_dc_entrooy_coding_table_selector",
            // acDcEntropyCodingTableSelector);

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/SosSegment.java`
#### Snippet
```java
                "successive_approximation_bit_position", is,
                "Not a Valid JPEG File");
        // Debug.debug("successive_approximation_bit_position",
        // successive_approximation_bit_position);
        successiveApproximationBitHigh = (successiveApproximationBitPosition >> 4) & 0xf;
```

### CommentedOutCode
Commented out code (23 lines)
in `src/main/java/org/apache/commons/imaging/formats/ico/IcoImageParser.java`
#### Snippet
```java
    }

    // public boolean extractImages(ByteSource byteSource, File dst_dir,
    // String dst_root, ImageParser encoder) throws ImageReadException,
    // IOException, ImageWriteException
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/png/ScanExpediterInterlaced.java`
#### Snippet
```java
    private static final int[] ROW_INCREMENT = { 8, 8, 8, 4, 4, 2, 2 };
    private static final int[] COL_INCREMENT = { 8, 8, 4, 4, 2, 2, 1 };
//    private static final int Block_Height[] = { 8, 8, 4, 4, 2, 2, 1 };
//    private static final int Block_Width[] = { 8, 4, 4, 2, 2, 1, 1 };

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/png/ScanExpediterInterlaced.java`
#### Snippet
```java

            int y = STARTING_ROW[pass - 1];
            // int y_stride = ROW_INCREMENT[pass - 1];
            //final boolean rows_in_pass = (y < height);
            while (y < height) {
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/ImageDump.java`
#### Snippet
```java

    private String colorSpaceTypeToName(final ColorSpace cs) {
        // System.out.println(prefix + ": " + "type: "
        // + cs.getType() );
        switch (cs.getType()) {
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/imaging/ColorTools.java`
#### Snippet
```java
                RenderingHints.VALUE_DITHER_ENABLE);

        // bi = relabelColorSpace(bi, cs);
        // dumpColorSpace("\tcs_sRGB", cs_sRGB);
        // dumpColorSpace("\tColorModel.getRGBdefaultc",
```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/decoder/JpegDecoder.java`
#### Snippet
```java
                                0x00ff0000, 0x0000ff00, 0x000000ff }, null);
                // FIXME: why do images come out too bright with CS_GRAY?
                // colorModel = new ComponentColorModel(
                // ColorSpace.getInstance(ColorSpace.CS_GRAY), false, true,
                // Transparency.OPAQUE, DataBuffer.TYPE_BYTE);
```

### CommentedOutCode
Commented out code (6 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/decoder/JpegDecoder.java`
#### Snippet
```java
            image = new BufferedImage(colorModel, raster,
                    colorModel.isAlphaPremultiplied(), new Properties());
            // byte[] remainder = super.getStreamBytes(is);
            // for (int i = 0; i < remainder.length; i++)
            // {
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/FormatCompliance.java`
#### Snippet
```java
        }
        for (int i = 0; i < expected.length; i++) {
            // System.out.println("expected: "
            // + getValueDescription(expected[i]) + ", actual: "
            // + getValueDescription(actual[i]) + ")");
```

### CommentedOutCode
Commented out code (6 lines)
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpWriterRgb.java`
#### Snippet
```java

class BmpWriterRgb implements BmpWriter {
    // private final boolean alpha;
    //
    // public BmpWriterRgb(boolean alpha)
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpWriterRgb.java`
#### Snippet
```java

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // BinaryOutputStream bos = new BinaryOutputStream(baos,
        // BYTE_ORDER_Network);

```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/exif/ExifRewriter.java`
#### Snippet
```java
        final List<JFIFPiece> pieces = jfifPieces.pieces;

        // Debug.debug("pieces", pieces);

        // pieces.removeAll(jfifPieces.exifSegments);
```

### CommentedOutCode
Commented out code (6 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/exif/ExifRewriter.java`
#### Snippet
```java
        new JpegUtils().traverseJFIF(byteSource, visitor);

        // GenericSegment exifSegment = exifSegmentArray[0];
        // if (exifSegments.size() < 1)
        // {
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/imaging/icc/IccTag.java`
#### Snippet
```java

            itdt = getIccTagDataType(dataTypeSignature);
            // if (itdt != null)
            // {
            // System.out.println("\t\t\t" + "itdt: " + itdt.name);
```

### CommentedOutCode
Commented out code (10 lines)
in `src/main/java/org/apache/commons/imaging/formats/png/chunks/PngChunkPlte.java`
#### Snippet
```java
    }

    // public void printPalette() {
    // Debug.debug();
    // Debug.debug("palette");
```

### CommentedOutCode
Commented out code (16 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/xmp/JpegRewriter.java`
#### Snippet
```java
    }

    // private void writeSegment(OutputStream os, JFIFPieceSegment piece)
    // throws ImageWriteException, IOException
    // {
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java

        Palette palette2 = new PaletteFactory().makeExactRgbPaletteSimple(src, maxColors);
        // int palette[] = new PaletteFactory().makePaletteSimple(src, 256);
        // Map palette_map = paletteToMap(palette);

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java
            bos.write(EXTENSION_CODE);
            bos.write((byte) 0xf9);
            // bos.write(0xff & (kGraphicControlExtension >> 8));
            // bos.write(0xff & (kGraphicControlExtension >> 0));

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java
                        stopBeforeImageData, formatCompliance);
                result.add(id);
                // if (stopBeforeImageData)
                // return result;

```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegUtils.java`
#### Snippet
```java
        case JpegConstants.SOS_MARKER:
            return "SOS_MARKER";
            // case JPEG_APP0 :
            // return "JPEG_APP0";
            // case JPEG_APP0_MARKER :
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
        final double var_V = (9 * Y) / (X + (15 * Y) + (3 * Z));

        // Debug.debug("var_U", var_U);
        // Debug.debug("var_V", var_V);

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
        final double ref_V = (9 * REF_Y) / (REF_X + (15 * REF_Y) + (3 * REF_Z));

        // Debug.debug("ref_U", ref_U);
        // Debug.debug("ref_V", ref_V);

```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java

        // Attention: A lot of sources do list these values with less precision. But it makes a visual difference:
        // double var_R = var_X * 3.2406 + var_Y * -1.5372 + var_Z * -0.4986;
        // double var_G = var_X * -0.9689 + var_Y * 1.8758 + var_Z * 0.0415;
        // double var_B = var_X * 0.0557 + var_Y * -0.2040 + var_Z * 1.0570;
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java

        // Attention: A lot of sources do list these values with less precision. But it makes a visual difference:
        // final double X = var_R * 0.4124 + var_G * 0.3576 + var_B * 0.1805;
        // final double Y = var_R * 0.2126 + var_G * 0.7152 + var_B * 0.0722;
        // final double Z = var_R * 0.0193 + var_G * 0.1192 + var_B * 0.9505;
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/png/scanlinefilters/ScanlineFilterAverage.java`
#### Snippet
```java

            dst[i] = (byte) ((src[i] + average) % 256);
            // dst[i] = src[i];
            // dst[i] = (byte) 255;
        }
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
                    final TagInfo tagInfo = srcField.getTagInfo();
                    final FieldType fieldType = srcField.getFieldType();
                    // byte bytes[] = srcField.fieldType.getRawBytes(srcField);

                    // Debug.debug("tagInfo", tagInfo);
```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
                            byteOrder);

                    // if (tagInfo.isUnknown())
                    // Debug.debug(
                    // "\t" + "unknown tag(0x"
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/png/PngCrc.java`
#### Snippet
```java
        }
        for (n = 0; n < buf.length; n++) {
            // Debug.debug("crc[" + n + "]", c + " (" + Long.toHexString(c) +
            // ")");

```

### CommentedOutCode
Commented out code (13 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/App13Segment.java`
#### Snippet
```java
        super(marker, markerLength, is);

        // isIPTCJpegSegment = new IptcParser().isIPTCJpegSegment(bytes);
        // if (isIPTCJpegSegment)
        // {
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/Segment.java`
#### Snippet
```java
        case 0xffdf:
            return "Expand reference component(s)";
            // case 0xffd8 :
            // return "Reserved for application segments";
            // case 0xffd8 :
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/Segment.java`
#### Snippet
```java
        case 0xff01:
            return "For temporary private use in arithmetic coding";
            // case 0xffd8 :
            // return "Reserved";

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
        }

        // int bitsPerPixel = getTagAsValueOrArraySum(entries,
        // TIFF_TAG_BITS_PER_SAMPLE);

```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
        int predictor = -1;
        {
            // dumpOptionalNumberTag(entries, TIFF_TAG_FILL_ORDER);
            // dumpOptionalNumberTag(entries, TIFF_TAG_FREE_BYTE_COUNTS);
            // dumpOptionalNumberTag(entries, TIFF_TAG_FREE_OFFSETS);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
        }

        // int bitsPerPixel = getTagAsValueOrArraySum(entries,
        // TIFF_TAG_BITS_PER_SAMPLE);
        int predictor = -1;
```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
        int predictor = -1;
        {
            // dumpOptionalNumberTag(entries, TIFF_TAG_FILL_ORDER);
            // dumpOptionalNumberTag(entries, TIFF_TAG_FREE_BYTE_COUNTS);
            // dumpOptionalNumberTag(entries, TIFF_TAG_FREE_OFFSETS);
```

### CommentedOutCode
Commented out code (14 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
                    bitsPerSample, predictor, width, height);
        case 6: {
//            final double yCbCrCoefficients[] = directory.findField(
//                    TiffTagConstants.TIFF_TAG_YCBCR_COEFFICIENTS, true)
//                    .getDoubleArrayValue();
```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
            }
            // catch (Exception e)
            // {
            // Debug.debug(e);
            // pw.println("");
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParserRle.java`
#### Snippet
```java

            if ((x >= 0) && (x < width) && (y >= 0) && (y < height)) {
                // int rgb = 0xff000000;
                // rgb = getNextRGB();
                final int rgb = rgbs[i % rgbs.length];
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParserRle.java`
#### Snippet
```java
                    }

                    // System.out.println("b: " + b);
                    // System.out.println("size: " + size);
                    // System.out.println("SamplesPerByte: " + SamplesPerByte);
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParserRle.java`
#### Snippet
```java
                        final int[] samples = convertDataToSamples(0xff & bytes[i]);
                        final int towrite = Math.min(remaining, samplesPerByte);
                        // System.out.println("remaining: " + remaining);
                        // System.out.println("SamplesPerByte: "
                        // + SamplesPerByte);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParserRle.java`
#### Snippet
```java
                        final int written = processByteOfData(samples, towrite, x, y,
                                width, height, imageBuilder);
                        // System.out.println("written: " + written);
                        // System.out.println("");
                        x += written;
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/photometricinterpreters/PhotometricInterpreterLogLuv.java`
#### Snippet
```java
        }

        // var_R = ((var_R + 0.16561039f) / (3.0152583f + 0.16561039f));
        // var_G = ((var_G + 0.06561642f) / (3.0239854f + 0.06561642f));
        // var_B = ((var_B + 0.19393992f) / (3.1043448f + 0.19393992f));
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/photometricinterpreters/PhotometricInterpreterLogLuv.java`
#### Snippet
```java
        final RgbValues rgbValues = getRgbValues(tristimulusValues);

        // float R = 1.910f * X - 0.532f * Y - 0.288f * Z;
        // float G = -0.985f * X + 1.999f * Y - 0.028f * Z;
        // float B = 0.058f * X - 0.118f * Y + 0.898f * Z;
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageData.java`
#### Snippet
```java
        }

        // public TiffElement[] getElements()
        // {
        // return tiles;
```

### CommentedOutCode
Commented out code (9 lines)
in `src/main/java/org/apache/commons/imaging/formats/png/PngImageParser.java`
#### Snippet
```java
        float physicalWidthInch = -1;

        // if (pngChunkpHYs != null)
        // {
        // System.out.println("\t" + "pngChunkpHYs.UnitSpecifier: " +
```

### CommentedOutCode
Commented out code (12 lines)
in `src/main/java/org/apache/commons/imaging/formats/png/PngWriter.java`
#### Snippet
```java
                            if (isGrayscale) {
                                final int gray = (red + green + blue) / 3;
                                // if (y == 0)
                                // {
                                // Debug.debug("gray: " + x + ", " + y +
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java
            switch (densityUnits) {
            case 0:
                break;
            case 1: // inches
                unitsPerInch = 1.0;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java
                        switch (densityUnits) {
                        case 1:
                            break;
                        case 2: // inches
                            unitsPerInch = 1.0;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/commons/imaging/formats/jpeg/decoder/JpegDecoder.java`
#### Snippet
```java
                break;
            case 1:
                colorModel = new DirectColorModel(24, 0x00ff0000, 0x0000ff00,
                        0x000000ff);
                raster = Raster.createPackedRaster(DataBuffer.TYPE_INT,
                        sofnSegment.width, sofnSegment.height, new int[] {
                                0x00ff0000, 0x0000ff00, 0x000000ff }, null);
                // FIXME: why do images come out too bright with CS_GRAY?
                // colorModel = new ComponentColorModel(
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `src/main/java/org/apache/commons/imaging/formats/tiff/constants/TiffPlanarConfiguration.java`
#### Snippet
```java
        switch (codeValue) {
            case TiffTagConstants.PLANAR_CONFIGURATION_VALUE_CHUNKY:
                return CHUNKY;
            case TiffTagConstants.PLANAR_CONFIGURATION_VALUE_PLANAR:
                return PLANAR;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
        switch (resolutionUnit) {
        case 1:
            break;
        case 2: // Inch
            unitsPerInch = 1.0;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
            break;
        case TIFF_COMPRESSION_UNCOMPRESSED_2:
            compressionAlgorithm = ImageInfo.CompressionAlgorithm.NONE;
            break;
        case TIFF_COMPRESSION_PACKBITS:
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `src/main/java/org/apache/commons/imaging/ImageParser.java`
#### Snippet
```java
     *
     * @param byteSource A valid instance of ByteSource
     * @return true if the content is format-compliant; otherwise, false
     * @throws ImageReadException may be thrown by sub-classes
     * @throws IOException        may be thrown by sub-classes
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/org/apache/commons/imaging/formats/jpeg/iptc/IptcParser.java`
#### Snippet
```java
                return Charset.forName(codedCharsetString);
            }
        } catch (final IllegalArgumentException e) { }
        // check if encoding is a escape sequence
        // normalize encoding byte sequence
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`fileName.trim().length() == 0` can be replaced with 'fileName.trim().isEmpty()'
in `src/main/java/org/apache/commons/imaging/Imaging.java`
#### Snippet
```java
                    .anyMatch((extension) -> {
                        final String fileName = byteSource.getFileName();
                        if (fileName == null || fileName.trim().length() == 0) {
                            return false;
                        }
```

### SizeReplaceableByIsEmpty
`extension.trim().length() > 0` can be replaced with '!extension.trim().isEmpty()'
in `src/main/java/org/apache/commons/imaging/Imaging.java`
#### Snippet
```java
                        final String fileExtension = fileName.substring(fileName.lastIndexOf('.') + 1);
                        return extension != null
                                && extension.trim().length() > 0
                                && fileExtension.equalsIgnoreCase(extension);
                    }))
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputDirectory.java`
#### Snippet
```java
    }

    protected List<TiffOutputItem> getOutputItems(
            final TiffOutputSummary outputSummary) throws ImageWriteException {
        // first validate directory fields.
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/imaging/Imaging.java`
#### Snippet
```java
    }

    protected static ICC_Profile getICCProfile(final ByteSource byteSource) throws ImageReadException, IOException {
        final byte[] bytes = getICCProfileBytes(byteSource);
        if (bytes == null) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputSet.java`
#### Snippet
```java
    }

    protected List<TiffOutputItem> getOutputItems(
            final TiffOutputSummary outputSummary) throws ImageWriteException {
        final List<TiffOutputItem> result = new ArrayList<>();
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputField.java`
#### Snippet
```java
            prefix = "";
        }
        final StringBuilder result = new StringBuilder();

        result.append(prefix);
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageMetadataItem.java`
#### Snippet
```java
    public String toString(String prefix) {
        prefix = prefix == null ? "" : prefix;
        final StringBuilder result = new StringBuilder();
        result.append(String.format("%sDelay: %d%s", prefix, delay, NEWLINE));
        result.append(String.format("%sLeft position: %d%s", prefix, leftPosition, NEWLINE));
```

### StringBufferReplaceableByString
`StringBuilder buffer` can be replaced with 'String'
in `src/main/java/org/apache/commons/imaging/internal/Debug.java`
#### Snippet
```java
        final char c4 = (char) b4;
        // return new String(new char[] { c1, c2, c3, c4 });
        final StringBuilder buffer = new StringBuilder(31);
        buffer.append(new String(new char[]{c1, c2, c3, c4}));
        buffer.append(" byteQuad: ");
```

### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `src/main/java/org/apache/commons/imaging/formats/png/PngImageParser.java`
#### Snippet
```java

    public static String getChunkTypeName(final int chunkType) {
        final StringBuilder result = new StringBuilder();
        result.append((char) (0xff & (chunkType >> 24)));
        result.append((char) (0xff & (chunkType >> 16)));
```

## RuleId[id=ConstantMathCall]
### ConstantMathCall
Constant call to `sqrt()` can be simplified
in `src/main/java/org/apache/commons/imaging/formats/jpeg/decoder/Dct.java`
#### Snippet
```java

    private static final float[] IDCT_SCALING_FACTORS = {
            (float) (2.0 * 4.0 / Math.sqrt(2.0) * 0.0625),
            (float) (4.0 * Math.cos(Math.PI / 16.0) * 0.125),
            (float) (4.0 * Math.cos(2.0 * Math.PI / 16.0) * 0.125),
```

### ConstantMathCall
Constant call to `sqrt()` can be simplified
in `src/main/java/org/apache/commons/imaging/formats/jpeg/decoder/Dct.java`
#### Snippet
```java

    private static final float[] DCT_SCALING_FACTORS = {
            (float) (0.5 / Math.sqrt(2.0)),
            (float) (0.25 / Math.cos(Math.PI / 16.0)),
            (float) (0.25 / Math.cos(2.0 * Math.PI / 16.0)),
```

### ConstantMathCall
Constant call to `toRadians()` can be simplified
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
        final double kCH = 1.0; // chroma and hue factor, 1.0 for CIE reference conditions
        final double FAC_1 = 100.0 / Math.log(139.0 / 100.0); // L99 scaling factor = 303.67100547050995
        final double ang = Math.toRadians(26.0);

        final double L = (Math.exp(L99o * kE / FAC_1) - 1.0) / 0.0039;
```

### ConstantMathCall
Constant call to `toRadians()` can be simplified
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
        final double kCH = 1.0; // chroma and hue factor, 1.0 for CIE reference conditions
        final double FAC_1 = 100.0 / Math.log(139.0 / 100.0); // L99 scaling factor = 303.67100547050995
        final double ang = Math.toRadians(26.0);

        final double L99o = FAC_1 / kE * Math.log(1 + 0.0039 * L); // Lightness correction kE
```

### ConstantMathCall
Constant call to `toRadians()` can be simplified
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
        final double kCH = 1.0; // chroma and hue factor, 1.0 for CIE reference conditions
        final double FAC_1 = 100.0 / Math.log(129.0 / 50.0); // L99 scaling factor = 105.50867113783109
        final double ang = Math.toRadians(16.0);

        final double hef = Math.atan2(b99b, a99b);
```

### ConstantMathCall
Constant call to `toRadians()` can be simplified
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
        final double kE = 1.0; // brightness factor, 1.0 for CIE reference conditions
        final double kCH = 1.0; // chroma and hue factor, 1.0 for CIE reference conditions
        final double ang = Math.toRadians(16.0);

        final double L99 = kE * FAC_1 * Math.log(1. + 0.0158 * L);
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffField.java`
#### Snippet
```java
        }

        pw.println(toString());
        pw.flush();
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/imaging/formats/icns/IcnsImageParser.java`
#### Snippet
```java
                typeDescription = "";
            } else {
                typeDescription = " " + icnsType.toString();
            }
            pw.println("Type: 0x" + Integer.toHexString(type) + " ("
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffImageWriterBase.java`
#### Snippet
```java
        for(int iRead=0; iRead<nReads; iRead++){
            final int i0 = iRead*nRowsPerRead;
            final int i1 = i0+nRowsPerRead>height? height: i0+nRowsPerRead;
            src.getRGB(0, i0, width, i1-i0, argb, 0, width);
            final int n = (i1-i0)*width;
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/imaging/common/BasicCParser.java`
#### Snippet
```java
            final char c = string.charAt(i);
            if (hadBackSlash) {
                i = parseEscape(i, stringBuilder, string);
                hadBackSlash = false;
            } else {
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/imaging/common/BasicCParser.java`
#### Snippet
```java

    public static ByteArrayOutputStream preprocess(final InputStream is,
            final StringBuilder firstComment, final Map<String, String> defines)
            throws IOException, ImageReadException {
        boolean inSingleQuotes = false;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/imaging/common/BasicCParser.java`
#### Snippet
```java

    public static ByteArrayOutputStream preprocess(final InputStream is,
            final StringBuilder firstComment, final Map<String, String> defines)
            throws IOException, ImageReadException {
        boolean inSingleQuotes = false;
```

### BoundedWildcard
Can generalize to `? extends TiffOutputItem`
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffImageWriterLossy.java`
#### Snippet
```java

    private void writeStep(final BinaryOutputStream bos,
            final List<TiffOutputItem> outputItems) throws IOException,
            ImageWriteException {
        writeImageFileHeader(bos);
```

### BoundedWildcard
Can generalize to `? extends TiffOutputItem`
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffImageWriterLossy.java`
#### Snippet
```java
    }

    private void updateOffsetsStep(final List<TiffOutputItem> outputItems) {
        int offset = TIFF_HEADER_SIZE;

```

### BoundedWildcard
Can generalize to `? extends TiffElement`
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffImageWriterLossless.java`
#### Snippet
```java
    }

    private long updateOffsetsStep(final List<TiffElement> analysis,
            final List<TiffOutputItem> outputItems) {
        // items we cannot fit into a gap, we shall append to tail.
```

### BoundedWildcard
Can generalize to `? extends TiffOutputItem`
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffImageWriterLossless.java`
#### Snippet
```java

    private long updateOffsetsStep(final List<TiffElement> analysis,
            final List<TiffOutputItem> outputItems) {
        // items we cannot fit into a gap, we shall append to tail.
        long overflowIndex = exifBytes.length;
```

### BoundedWildcard
Can generalize to `? extends TiffOutputField`
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffImageWriterLossless.java`
#### Snippet
```java
    }

    private List<TiffElement> analyzeOldTiff(final Map<Integer, TiffOutputField> frozenFields) throws ImageWriteException,
            IOException {
        try {
```

### BoundedWildcard
Can generalize to `? extends TiffElement`
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffImageWriterLossless.java`
#### Snippet
```java

    private void writeStep(final OutputStream os, final TiffOutputSet outputSet,
            final List<TiffElement> analysis, final List<TiffOutputItem> outputItems,
            final long outputLength) throws IOException, ImageWriteException {
        final TiffOutputDirectory rootDirectory = outputSet.getRootDirectory();
```

### BoundedWildcard
Can generalize to `? extends TiffOutputItem`
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffImageWriterLossless.java`
#### Snippet
```java

    private void writeStep(final OutputStream os, final TiffOutputSet outputSet,
            final List<TiffElement> analysis, final List<TiffOutputItem> outputItems,
            final long outputLength) throws IOException, ImageWriteException {
        final TiffOutputDirectory rootDirectory = outputSet.getRootDirectory();
```

### BoundedWildcard
Can generalize to `? super ImageParser`
in `src/main/java/org/apache/commons/imaging/internal/Util.java`
#### Snippet
```java
    // This generics suppression is as good as the predicate given. If the predicate violates a generics design,
    // then there will be an error during runtime.
    private static ImageParser<?> getImageParser(final Predicate<ImageParser<?>> pred, final Supplier<? extends RuntimeException> supplier) {
        return ImageParser
                .getAllImageParsers()
```

### BoundedWildcard
Can generalize to `? extends ColorCount`
in `src/main/java/org/apache/commons/imaging/palette/ColorGroup.java`
#### Snippet
```java
    final int totalPoints;

    ColorGroup(final List<ColorCount> colorCounts, final boolean ignoreAlpha) throws ImageWriteException {
        this.colorCounts = colorCounts;
        this.ignoreAlpha = ignoreAlpha;
```

### BoundedWildcard
Can generalize to `? extends TagInfo`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffTags.java`
#### Snippet
```java
    }

    private static TagInfo getTag(final int directoryType, final List<TagInfo> possibleMatches) {
        // Please keep this method in sync with TiffImageMetadata's findField()

```

### BoundedWildcard
Can generalize to `? extends TagInfo`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffTags.java`
#### Snippet
```java
    }

    private static Map<Integer, Integer> countTags(final List<TagInfo> tags) {
        final Map<Integer, Integer> map = new HashMap<>();

```

### BoundedWildcard
Can generalize to `? extends TagInfo`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffTags.java`
#### Snippet
```java

    private static Map<Integer, List<TagInfo>> makeTagMap(
            final List<TagInfo> tags) {
        // make sure to use the thread-safe version; this is shared state.
        final Map<Integer, List<TagInfo>> map = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends PngText`
in `src/main/java/org/apache/commons/imaging/formats/png/PngImageInfo.java`
#### Snippet
```java
            final boolean progressive, final boolean transparent, final boolean usesPalette,
            final ColorType colorType, final CompressionAlgorithm compressionAlgorithm,
            final List<PngText> textChunks, final PhysicalScale physicalScale) {
        super(formatDetails, bitsPerPixel, comments, format, formatName,
                height, mimeType, numberOfImages, physicalHeightDpi,
```

### BoundedWildcard
Can generalize to `? extends IptcRecord`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/iptc/IptcParser.java`
#### Snippet
```java
    }

    public byte[] writeIPTCBlock(List<IptcRecord> elements)
            throws ImageWriteException, IOException {
        Charset charset = DEFAULT_CHARSET;
```

### BoundedWildcard
Can generalize to `? extends App2Segment`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java
    }

    private byte[] assembleSegments(final List<App2Segment> segments, final boolean startWithZero)
            throws ImageReadException {
        if (segments.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends Segment`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java
    }

    private List<Segment> filterAPP1Segments(final List<Segment> segments) {
        final List<Segment> result = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends PaletteEntry`
in `src/main/java/org/apache/commons/imaging/formats/tiff/photometricinterpreters/floatingpoint/PhotometricInterpreterFloat.java`
#### Snippet
```java
     * @param paletteEntries a valid, non-empty list of palette entries
     */
    public PhotometricInterpreterFloat(final List<PaletteEntry> paletteEntries) {
        // The abstract base class requires that the following fields
        // be set in the constructor:
```

### BoundedWildcard
Can generalize to `? super ColorGroup`
in `src/main/java/org/apache/commons/imaging/palette/LongestAxisMedianCut.java`
#### Snippet
```java

    private void doCut(final ColorGroup colorGroup, final ColorComponent mode,
            final List<ColorGroup> colorGroups, final boolean ignoreAlpha) throws ImageWriteException {

        final List<ColorCount> colorCounts = colorGroup.getColorCounts();
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/xmp/JpegRewriter.java`
#### Snippet
```java
    }

    protected <T extends JFIFPiece> List<T> filterSegments(final List<T> segments,
            final SegmentFilter filter, final boolean reverse) {
        final List<T> result = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends GifBlock`
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java
    }

    private List<String> getComments(final List<GifBlock> blocks) throws IOException {
        final List<String> result = new ArrayList<>();
        final int code = 0x21fe;
```

### BoundedWildcard
Can generalize to `? extends GifBlock`
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java
     */
    @SuppressWarnings("unchecked")
    private <T extends GifBlock> List<T> findAllBlocks(final List<GifBlock> blocks, final int code) {
        final List<T> filteredBlocks = new ArrayList<>();
        for (final GifBlock gifBlock : blocks) {
```

### BoundedWildcard
Can generalize to `? extends GifBlock`
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java
    }

    private GifBlock findBlock(final List<GifBlock> blocks, final int code) {
        for (final GifBlock gifBlock : blocks) {
            if (gifBlock.blockCode == code) {
```

### BoundedWildcard
Can generalize to `? extends PngChunk`
in `src/main/java/org/apache/commons/imaging/formats/png/PngImageParser.java`
#### Snippet
```java
    }

    private List<PngChunk> filterChunks(final List<PngChunk> chunks, final ChunkType type) {
        final List<PngChunk> result = new ArrayList<>();

```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffImageWriterBase.java`
#### Snippet
```java
            final Integer t4Parameter = params.getT4Options();
            if (t4Parameter != null) {
                t4Options = t4Parameter.intValue();
            }
            t4Options &= 0x7;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffImageWriterBase.java`
#### Snippet
```java
            final Integer t6Parameter = params.getT6Options();
            if (t6Parameter != null) {
                t6Options = t6Parameter.intValue();
            }
            t6Options &= 0x4;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldTypeFloat.java`
#### Snippet
```java
    public byte[] writeData(final Object o, final ByteOrder byteOrder) throws ImageWriteException {
        if (o instanceof Float) {
            return ByteConversions.toBytes(((Float) o).floatValue(), byteOrder);
        }
        if (o instanceof float[]) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldTypeFloat.java`
#### Snippet
```java
        final float[] values = new float[numbers.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = numbers[i].floatValue();
        }
        return ByteConversions.toBytes(values, byteOrder);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldTypeByte.java`
#### Snippet
```java
    public byte[] writeData(final Object o, final ByteOrder byteOrder) throws ImageWriteException {
        if (o instanceof Byte) {
            return new byte[] { ((Byte) o).byteValue(), };
        }
        if (o instanceof byte[]) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldTypeShort.java`
#### Snippet
```java
    public byte[] writeData(final Object o, final ByteOrder byteOrder) throws ImageWriteException {
        if (o instanceof Short) {
            return ByteConversions.toBytes(((Short) o).shortValue(), byteOrder);
        }
        if (o instanceof short[]) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldTypeShort.java`
#### Snippet
```java
        final short[] values = new short[numbers.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = numbers[i].shortValue();
        }
        return ByteConversions.toBytes(values, byteOrder);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldTypeDouble.java`
#### Snippet
```java
    public byte[] writeData(final Object o, final ByteOrder byteOrder) throws ImageWriteException {
        if (o instanceof Double) {
            return ByteConversions.toBytes(((Double) o).doubleValue(), byteOrder);
        }
        if (o instanceof double[]) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldTypeDouble.java`
#### Snippet
```java
        }
        final double[] values = new double[((Double[]) o).length];
        Arrays.setAll(values, i -> ((Double[]) o)[i].doubleValue());
        return ByteConversions.toBytes(values, byteOrder);
    }
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getElementDescription()` is identical to its super method
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageData.java`
#### Snippet
```java

        @Override
        public String getElementDescription() {
            return "Tiff image data: " + getDataLength() + " bytes";
        }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
color.count \* color.alpha: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/imaging/palette/ColorGroup.java`
#### Snippet
```java
        for (final ColorCount color : colorCounts) {
            countTotal += color.count;
            alphaTotal += color.count * color.alpha;
            redTotal += color.count * color.red;
            greenTotal += color.count * color.green;
```

### IntegerMultiplicationImplicitCastToLong
color.count \* color.red: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/imaging/palette/ColorGroup.java`
#### Snippet
```java
            countTotal += color.count;
            alphaTotal += color.count * color.alpha;
            redTotal += color.count * color.red;
            greenTotal += color.count * color.green;
            blueTotal += color.count * color.blue;
```

### IntegerMultiplicationImplicitCastToLong
color.count \* color.green: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/imaging/palette/ColorGroup.java`
#### Snippet
```java
            alphaTotal += color.count * color.alpha;
            redTotal += color.count * color.red;
            greenTotal += color.count * color.green;
            blueTotal += color.count * color.blue;
        }
```

### IntegerMultiplicationImplicitCastToLong
color.count \* color.blue: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/imaging/palette/ColorGroup.java`
#### Snippet
```java
            redTotal += color.count * color.red;
            greenTotal += color.count * color.green;
            blueTotal += color.count * color.blue;
        }

```

### IntegerMultiplicationImplicitCastToLong
bitsPerPixel \* width: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/DataReaderStrips.java`
#### Snippet
```java
                final long rowsRemaining = height - (strip * rowsPerStripLong);
                final long rowsInThisStrip = Math.min(rowsRemaining, rowsPerStripLong);
                final long bytesPerRow = (bitsPerPixel * width + 7) / 8;
                final long bytesPerStrip = rowsInThisStrip * bytesPerRow;
                final long pixelsPerStrip = rowsInThisStrip * width;
```

### IntegerMultiplicationImplicitCastToLong
bitsPerPixel \* width: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/DataReaderStrips.java`
#### Snippet
```java
                final long rowsRemaining = height - (strip * rowsPerStripLong);
                final long rowsInThisStrip = Math.min(rowsRemaining, rowsPerStripLong);
                final long bytesPerRow = (bitsPerPixel * width + 7) / 8;
                final long bytesPerStrip = rowsInThisStrip * bytesPerRow;
                final long pixelsPerStrip = rowsInThisStrip * width;
```

### IntegerMultiplicationImplicitCastToLong
count \* (red \<\< (8 - precision)): integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/imaging/palette/ColorSpaceSubset.java`
#### Snippet
```java
                            | (red << (0 * precision));
                    final int count = table[idx];
                    redsum += count * (red << (8 - precision));
                    greensum += count * (green << (8 - precision));
                    bluesum += count * (blue << (8 - precision));
```

### IntegerMultiplicationImplicitCastToLong
red \<\< (8 - precision): integer shift implicitly cast to long
in `src/main/java/org/apache/commons/imaging/palette/ColorSpaceSubset.java`
#### Snippet
```java
                            | (red << (0 * precision));
                    final int count = table[idx];
                    redsum += count * (red << (8 - precision));
                    greensum += count * (green << (8 - precision));
                    bluesum += count * (blue << (8 - precision));
```

### IntegerMultiplicationImplicitCastToLong
count \* (green \<\< (8 - precision)): integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/imaging/palette/ColorSpaceSubset.java`
#### Snippet
```java
                    final int count = table[idx];
                    redsum += count * (red << (8 - precision));
                    greensum += count * (green << (8 - precision));
                    bluesum += count * (blue << (8 - precision));
                }
```

### IntegerMultiplicationImplicitCastToLong
green \<\< (8 - precision): integer shift implicitly cast to long
in `src/main/java/org/apache/commons/imaging/palette/ColorSpaceSubset.java`
#### Snippet
```java
                    final int count = table[idx];
                    redsum += count * (red << (8 - precision));
                    greensum += count * (green << (8 - precision));
                    bluesum += count * (blue << (8 - precision));
                }
```

### IntegerMultiplicationImplicitCastToLong
count \* (blue \<\< (8 - precision)): integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/imaging/palette/ColorSpaceSubset.java`
#### Snippet
```java
                    redsum += count * (red << (8 - precision));
                    greensum += count * (green << (8 - precision));
                    bluesum += count * (blue << (8 - precision));
                }
            }
```

### IntegerMultiplicationImplicitCastToLong
blue \<\< (8 - precision): integer shift implicitly cast to long
in `src/main/java/org/apache/commons/imaging/palette/ColorSpaceSubset.java`
#### Snippet
```java
                    redsum += count * (red << (8 - precision));
                    greensum += count * (green << (8 - precision));
                    bluesum += count * (blue << (8 - precision));
                }
            }
```

### IntegerMultiplicationImplicitCastToLong
maxColors \* WRITE_PALETTE.length: integer multiplication implicitly cast to long
in `src/main/java/org/apache/commons/imaging/formats/xpm/XpmImageParser.java`
#### Snippet
```java
            // leave the loop if numbers would go beyond Integer.MAX_VALUE to avoid infinite loops
            // test every operation from below if it would increase an int value beyond Integer.MAX_VALUE
            final long nextMaxColors = maxColors * WRITE_PALETTE.length;
            final long nextCharsPerPixel = charsPerPixel + 1;
            if (nextMaxColors > Integer.MAX_VALUE) {
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common parts with variables can be extracted from 'if'
in `src/main/java/org/apache/commons/imaging/common/mylzw/MyBitOutputStream.java`
#### Snippet
```java

        while (bitsInCache >= 8) {
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                // MSB, so write from left
                final int b = 0xff & (bitCache >> (bitsInCache - 8));
```

### IfStatementWithIdenticalBranches
Common parts with variables can be extracted from 'if'
in `src/main/java/org/apache/commons/imaging/formats/icns/Rle24Compression.java`
#### Snippet
```java
            int resultPos = 0;
            while (remaining > 0) {
                if ((data[dataPos] & 0x80) != 0) {
                    final int count = (0xff & data[dataPos]) - 125;
                    for (int i = 0; i < count; i++) {
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/imaging/common/BasicCParser.java`
#### Snippet
```java

    public static String[] tokenizeRow(final String row) {
        final String[] tokens = row.split("[ \t]");
        int numLiveTokens = 0;
        for (final String token : tokens) {
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java

    public PsdImageParser() {
        super.setByteOrder(ByteOrder.BIG_ENDIAN);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/imaging/formats/pnm/PnmImageParser.java`
#### Snippet
```java

    public PnmImageParser() {
        super.setByteOrder(ByteOrder.LITTLE_ENDIAN);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/imaging/formats/icns/IcnsImageParser.java`
#### Snippet
```java

    public IcnsImageParser() {
        super.setByteOrder(ByteOrder.BIG_ENDIAN);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java

    public BmpImageParser() {
        super.setByteOrder(ByteOrder.LITTLE_ENDIAN);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/imaging/formats/pcx/PcxImageParser.java`
#### Snippet
```java

    public PcxImageParser() {
        super.setByteOrder(ByteOrder.LITTLE_ENDIAN);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/imaging/formats/ico/IcoImageParser.java`
#### Snippet
```java

    public IcoImageParser() {
        super.setByteOrder(ByteOrder.LITTLE_ENDIAN);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java

    public GifImageParser() {
        super.setByteOrder(ByteOrder.LITTLE_ENDIAN);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/imaging/formats/dcx/DcxImageParser.java`
#### Snippet
```java

    public DcxImageParser() {
        super.setByteOrder(ByteOrder.LITTLE_ENDIAN);
    }

```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/imaging/formats/jpeg/xmp/JpegXmpRewriter.java`
#### Snippet
```java
     *            OutputStream to write the image to.
     *
     * @see java.io.File
     * @see java.io.OutputStream
     * @throws ImageReadException if it fails to read the JFIF segments
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/imaging/formats/jpeg/xmp/JpegXmpRewriter.java`
#### Snippet
```java
     *
     * @see java.io.File
     * @see java.io.OutputStream
     * @throws ImageReadException if it fails to read the JFIF segments
     * @throws IOException if it fails to read or write the data from the segments
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.imaging.common` is unnecessary and can be removed
in `src/main/java/org/apache/commons/imaging/Imaging.java`
#### Snippet
```java
     * @param fileName Filename associated with image data (optional).
     * @return An instance of IImageMetadata.
     * @see org.apache.commons.imaging.common.ImageMetadata
     * @throws ImageReadException if it fails to read the image metadata
     * @throws IOException if it fails to read the image data
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.imaging.common` is unnecessary and can be removed
in `src/main/java/org/apache/commons/imaging/Imaging.java`
#### Snippet
```java
     * @param file File containing image data.
     * @return An instance of IImageMetadata.
     * @see org.apache.commons.imaging.common.ImageMetadata
     * @throws ImageReadException if it fails to read the image metadata
     * @throws IOException if it fails to read the image data
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.imaging.common` is unnecessary and can be removed
in `src/main/java/org/apache/commons/imaging/Imaging.java`
#### Snippet
```java
     * @param bytes Byte array containing an image file.
     * @return An instance of ImageMetadata.
     * @see org.apache.commons.imaging.common.ImageMetadata
     * @throws ImageReadException if it fails to read the image metadata
     * @throws IOException if it fails to read the image data
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/imaging/formats/jpeg/iptc/JpegIptcRewriter.java`
#### Snippet
```java
     *            Remove the App13 segment.
     *
     * @see java.io.File
     * @see java.io.OutputStream
     * @throws ImageReadException if there are more than one Photoshop App13 segment, or if
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/imaging/formats/jpeg/iptc/JpegIptcRewriter.java`
#### Snippet
```java
     *
     * @see java.io.File
     * @see java.io.OutputStream
     * @throws ImageReadException if there are more than one Photoshop App13 segment, or if
     *         the Photoshop segment cannot be parsed
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/imaging/formats/jpeg/iptc/JpegIptcRewriter.java`
#### Snippet
```java
     *         target byte source
     * @throws ImageWriteException if it fails to write the target image
     * @see java.io.File
     * @see java.io.OutputStream
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/imaging/formats/jpeg/iptc/JpegIptcRewriter.java`
#### Snippet
```java
     * @throws ImageWriteException if it fails to write the target image
     * @see java.io.File
     * @see java.io.OutputStream
     */
    public void removeIPTC(final File src, final OutputStream os)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.imaging.formats.png` is unnecessary and can be removed
in `src/main/java/org/apache/commons/imaging/formats/png/PngImagingParameters.java`
#### Snippet
```java
     * <p>Valid values: PhysicalScale</p>
     *
     * @see org.apache.commons.imaging.formats.png.PhysicalScale
     */
    private PhysicalScale physicalScale = null;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.imaging` is unnecessary and can be removed
in `src/main/java/org/apache/commons/imaging/ImageInfo.java`
#### Snippet
```java

    /**
     * Returns the {@link org.apache.commons.imaging.ImageInfo.ColorType} of the image.
     *
     * @return image color type.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/imaging/formats/jpeg/exif/ExifRewriter.java`
#### Snippet
```java
     * @throws IOException if it fails to read the image data
     * @throws ImageWriteException if it fails to write the updated data
     * @see java.io.File
     * @see java.io.OutputStream
     * @see java.io.File
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/imaging/formats/jpeg/exif/ExifRewriter.java`
#### Snippet
```java
     * @throws ImageWriteException if it fails to write the updated data
     * @see java.io.File
     * @see java.io.OutputStream
     * @see java.io.File
     * @see java.io.OutputStream
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/imaging/formats/jpeg/exif/ExifRewriter.java`
#### Snippet
```java
     * @see java.io.File
     * @see java.io.OutputStream
     * @see java.io.File
     * @see java.io.OutputStream
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/commons/imaging/formats/jpeg/exif/ExifRewriter.java`
#### Snippet
```java
     * @see java.io.OutputStream
     * @see java.io.File
     * @see java.io.OutputStream
     */
    public void removeExifMetadata(final File src, final OutputStream os)
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/imaging/common/bytesource/ByteSourceFile.java`
#### Snippet
```java
            final byte[] buffer = new byte[1024];
            int read;
            while ((read = is.read(buffer)) > 0) {
                baos.write(buffer, 0, read);
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/imaging/formats/pnm/PnmImageParser.java`
#### Snippet
```java
            wsr.readLine();
            String line;
            while ((line = wsr.readLine()) != null) {
                line = line.trim();
                if (line.charAt(0) == '#') {
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/imaging/common/mylzw/MyLzwDecompressor.java`
#### Snippet
```java
        clearTable();

        while ((code = getNextCode(mbis)) != eoiCode) {
            if (code == clearCode) {
                clearTable();
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/imaging/formats/jpeg/decoder/JpegDecoder.java`
#### Snippet
```java
                // we had already read 0xFF and are now at 0xDn
                intervalStarts.add(pos + 1);
                foundFF = foundD0toD7 = false;
            }
            pos++;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/imaging/common/bytesource/ByteSourceInputStream.java`
#### Snippet
```java
        long result = 0;
        long skipped;
        while ((skipped = cis.skip(1024)) > 0) {
            result += skipped;
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/imaging/formats/xpm/XpmImageParser.java`
#### Snippet
```java
                        BufferedReader reader = new BufferedReader(isReader)) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.charAt(0) == '!') {
                            continue;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/imaging/common/BinaryFunctions.java`
#### Snippet
```java
        int b = -1;
        int position = 0;
        while ((b = bis.read()) != -1) {
            if (needle[position] == b) {
                position++;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/imaging/common/BinaryFunctions.java`
#### Snippet
```java
        final byte[] buffer = new byte[1024];
        int read;
        while ((read = is.read(buffer)) > 0) {
            os.write(buffer, 0, read);
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/imaging/formats/rgbe/InfoHeaderReader.java`
#### Snippet
```java
        char c;

        while ((c = read()) != '\n') {
            buffer.append(c);
        }
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`bitcache = bitcache << (8 - bitsInCache)` could be simplified to 'bitcache \<\<= (8 - bitsInCache)'
in `src/main/java/org/apache/commons/imaging/formats/pnm/PbmWriter.java`
#### Snippet
```java

            if (rawBits && (bitsInCache > 0)) {
                bitcache = bitcache << (8 - bitsInCache);
                os.write((byte) bitcache);
                bitcache = 0;
```

### ReplaceAssignmentWithOperatorAssignment
`bitCache = bitCache | (value << bitsInCache)` could be simplified to 'bitCache \|= (value \<\< bitsInCache)'
in `src/main/java/org/apache/commons/imaging/common/mylzw/MyBitOutputStream.java`
#### Snippet
```java
        } else {
            // LSB, so add to left
            bitCache = bitCache | (value << bitsInCache);
        }
        bitsInCache += sampleBits;
```

### ReplaceAssignmentWithOperatorAssignment
`d = d / gcd` could be simplified to 'd /= gcd'
in `src/main/java/org/apache/commons/imaging/common/RationalNumber.java`
#### Snippet
```java

        final long gcd = gcd(n, d);
        d = d / gcd;
        n = n / gcd;

```

### ReplaceAssignmentWithOperatorAssignment
`n = n / gcd` could be simplified to 'n /= gcd'
in `src/main/java/org/apache/commons/imaging/common/RationalNumber.java`
#### Snippet
```java
        final long gcd = gcd(n, d);
        d = d / gcd;
        n = n / gcd;

        return new RationalNumber((int) n, (int) d);
```

### ReplaceAssignmentWithOperatorAssignment
`mask = mask | (mask << 8) | (mask << 16) | (mask << 24)` could be simplified to 'mask \|= (mask \<\< 8) \| (mask \<\< 16) \| (mask \<\< 24)'
in `src/main/java/org/apache/commons/imaging/palette/MedianCutQuantizer.java`
#### Snippet
```java
        for (int i = 0; i < 8; i++) {
            int mask = 0xff & (0xff << i);
            mask = mask | (mask << 8) | (mask << 16) | (mask << 24);

            Debug.debug("mask(" + i + "): " + mask + " (" + Integer.toHexString(mask) + ")");
```

### ReplaceAssignmentWithOperatorAssignment
`x = x + COL_INCREMENT[pass - 1]` could be simplified to 'x += COL_INCREMENT\[pass - 1\]'
in `src/main/java/org/apache/commons/imaging/formats/png/ScanExpediterInterlaced.java`
#### Snippet
```java
                        visit(x, y, bi, fBitParser, pixelIndexInScanline);

                        x = x + COL_INCREMENT[pass - 1];
                        pixelIndexInScanline++;
                    }
```

### ReplaceAssignmentWithOperatorAssignment
`y = y + ROW_INCREMENT[pass - 1]` could be simplified to 'y += ROW_INCREMENT\[pass - 1\]'
in `src/main/java/org/apache/commons/imaging/formats/png/ScanExpediterInterlaced.java`
#### Snippet
```java
                    }
                }
                y = y + ROW_INCREMENT[pass - 1];
            }
            pass = pass + 1;
```

### ReplaceAssignmentWithOperatorAssignment
`pass = pass + 1` could be simplified to 'pass += 1'
in `src/main/java/org/apache/commons/imaging/formats/png/ScanExpediterInterlaced.java`
#### Snippet
```java
                y = y + ROW_INCREMENT[pass - 1];
            }
            pass = pass + 1;
        }
    }
```

### ReplaceAssignmentWithOperatorAssignment
`sample = sample << (8 - bits)` could be simplified to 'sample \<\<= (8 - bits)'
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/ImageDataReader.java`
#### Snippet
```java
            if (bits < 8) {
                final int sign = sample & 1;
                sample = sample << (8 - bits); // scale to byte.
                if (sign > 0) {
                    sample = sample | ((1 << (8 - bits)) - 1); // extend to byte
```

### ReplaceAssignmentWithOperatorAssignment
`sample = sample | ((1 << (8 - bits)) - 1)` could be simplified to 'sample \|= ((1 \<\< (8 - bits)) - 1)'
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/ImageDataReader.java`
#### Snippet
```java
                sample = sample << (8 - bits); // scale to byte.
                if (sign > 0) {
                    sample = sample | ((1 << (8 - bits)) - 1); // extend to byte
                }
            } else if (bits > 8) {
```

### ReplaceAssignmentWithOperatorAssignment
`sample = sample >> (bits - 8)` could be simplified to 'sample \>\>= (bits - 8)'
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/ImageDataReader.java`
#### Snippet
```java
                }
            } else if (bits > 8) {
                sample = sample >> (bits - 8); // extend to byte.
            }
            result[i] = sample;
```

### ReplaceAssignmentWithOperatorAssignment
`bitCache = (bitCache << (8 - bitsInCache))` could be simplified to 'bitCache \<\<= (8 - bitsInCache)'
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpWriterPalette.java`
#### Snippet
```java

            if (bitsInCache > 0) {
                bitCache = (bitCache << (8 - bitsInCache));

                baos.write(0xff & bitCache);
```

### ReplaceAssignmentWithOperatorAssignment
`n = n / 12.92` could be simplified to 'n /= 12.92'
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
            n = Math.pow((n + 0.055) / 1.055, 2.4);
        } else {
            n = n / 12.92;
        }
        return n;
```

### ReplaceAssignmentWithOperatorAssignment
`c = c >> 1` could be simplified to 'c \>\>= 1'
in `src/main/java/org/apache/commons/imaging/formats/png/PngCrc.java`
#### Snippet
```java
                    c = 0xedb88320L ^ (c >> 1);
                } else {
                    c = c >> 1;
                }
            }
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `TiffImageWriterBase()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffImageWriterBase.java`
#### Snippet
```java
    }

    public TiffImageWriterBase(final ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `TiffImageWriterBase()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffImageWriterBase.java`
#### Snippet
```java
    protected final ByteOrder byteOrder;

    public TiffImageWriterBase() {
        this.byteOrder = DEFAULT_TIFF_BYTE_ORDER;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `PngTextChunk()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/imaging/formats/png/chunks/PngTextChunk.java`
#### Snippet
```java
public abstract class PngTextChunk extends PngChunk {

    public PngTextChunk(final int length, final int chunkType, final int crc, final byte[] bytes) {
        super(length, chunkType, crc, bytes);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `TiffRasterData()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffRasterData.java`
#### Snippet
```java
     * @param samplesPerPixel a value of 1 or greater
     */
    public TiffRasterData(final int width, final int height, final int samplesPerPixel) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException(
```

### NonProtectedConstructorInAbstractClass
Constructor `ByteSource()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/imaging/common/bytesource/ByteSource.java`
#### Snippet
```java
    private final String fileName;

    public ByteSource(final String fileName) {
        this.fileName = fileName;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `TransparencyFilter()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/imaging/formats/png/transparencyfilters/TransparencyFilter.java`
#### Snippet
```java
    private final byte[] bytes;

    public TransparencyFilter(final byte[] bytes) {
        this.bytes = bytes.clone();

```

### NonProtectedConstructorInAbstractClass
Constructor `DataElement()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffElement.java`
#### Snippet
```java
        private final byte[] data;

        public DataElement(final long offset, final int length, final byte[] data) {
            super(offset, length);

```

### NonProtectedConstructorInAbstractClass
Constructor `TiffElement()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffElement.java`
#### Snippet
```java
    public static final Comparator<TiffElement> COMPARATOR = Comparator.comparingLong(e -> e.offset);

    public TiffElement(final long offset, final int length) {
        this.offset = offset;
        this.length = length;
```

### NonProtectedConstructorInAbstractClass
Constructor `GenericSegment()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/GenericSegment.java`
#### Snippet
```java
    private final byte[] segmentData;

    public GenericSegment(final int marker, final int markerLength, final InputStream is) throws IOException {
        super(marker, markerLength);

```

### NonProtectedConstructorInAbstractClass
Constructor `GenericSegment()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/GenericSegment.java`
#### Snippet
```java
    }

    public GenericSegment(final int marker, final byte[] bytes) {
        super(marker, bytes.length);

```

### NonProtectedConstructorInAbstractClass
Constructor `PhotometricInterpreter()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/imaging/formats/tiff/photometricinterpreters/PhotometricInterpreter.java`
#### Snippet
```java
    protected final int height;

    public PhotometricInterpreter(final int samplesPerPixel, final int[] bitsPerSample,
            final int predictor, final int width, final int height) {
        this.samplesPerPixel = samplesPerPixel;
```

### NonProtectedConstructorInAbstractClass
Constructor `ImageDataReader()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/ImageDataReader.java`
#### Snippet
```java
    protected final TiffPlanarConfiguration planarConfiguration;

    public ImageDataReader(final TiffDirectory directory,
        final PhotometricInterpreter photometricInterpreter, final int[] bitsPerSample,
        final int predictor, final int samplesPerPixel, final int sampleFormat,
```

### NonProtectedConstructorInAbstractClass
Constructor `PngText()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/imaging/formats/png/PngText.java`
#### Snippet
```java
    public final String text;

    public PngText(final String keyword, final String text) {
        this.keyword = keyword;
        this.text = text;
```

### NonProtectedConstructorInAbstractClass
Constructor `Segment()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/Segment.java`
#### Snippet
```java
    public final int length;

    public Segment(final int marker, final int length) {
        // super();

```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `colorNames` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/imaging/formats/xpm/XpmImageParser.java`
#### Snippet
```java
    private static final String DEFAULT_EXTENSION = ImageFormats.XPM.getDefaultExtension();
    private static final String[] ACCEPTED_EXTENSIONS = ImageFormats.XPM.getExtensions();
    private static Map<String, Integer> colorNames;
    private static final char[] WRITE_PALETTE = { ' ', '.', 'X', 'o', 'O', '+',
        '@', '#', '$', '%', '&', '*', '=', '-', ';', ':', '>', ',', '<',
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImagingParameters.java`
#### Snippet
```java
     * TIFF_FLAG_T6_OPTIONS_UNCOMPRESSED_MODE.</p>
     */
    private Integer t6Options = null;

    public boolean isReadThumbnails() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImagingParameters.java`
#### Snippet
```java
     * the image's metadata including standard directory and EXIF tags.
     */
    private TiffOutputSet tiffOutputSet = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImagingParameters.java`
#### Snippet
```java
     * and TIFF_FLAG_T4_OPTIONS_FILL flags.</p>
     */
    private Integer t4Options = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImagingParameters.java`
#### Snippet
```java
     * TIFF compression algorithm, if any.
     */
    private Integer compression = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImagingParameters.java`
#### Snippet
```java
     * 8000 (roughly 8K). Minimum value is 8000.
     */
    private Integer lzwCompressionBlockSize = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImagingParameters.java`
#### Snippet
```java
     * a class that implements PhotometricInterpreter.</p>
     */
    private PhotometricInterpreter customPhotometricInterpreter = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/imaging/formats/pcx/RleWriter.java`
#### Snippet
```java
    private final boolean isCompressed;
    private int previousByte = -1;
    private int repeatCount = 0;

    RleWriter(final boolean isCompressed) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/imaging/formats/png/PngImagingParameters.java`
#### Snippet
```java
    private boolean forceTrueColor = false;

    private boolean predictorEnabled = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/imaging/formats/png/PngImagingParameters.java`
#### Snippet
```java
     * <p>Valid values: a list of WriteTexts.</p>
     */
    private List<? extends PngText> textChunks = null;

    public byte getBitDepth() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/imaging/formats/png/PngImagingParameters.java`
#### Snippet
```java
    private byte bitDepth = DEFAULT_BIT_DEPTH;

    private boolean forceIndexedColor = false;

    private boolean forceTrueColor = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/imaging/formats/png/PngImagingParameters.java`
#### Snippet
```java
     * @see org.apache.commons.imaging.formats.png.PhysicalScale
     */
    private PhysicalScale physicalScale = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/imaging/formats/png/PngImagingParameters.java`
#### Snippet
```java
    private boolean forceIndexedColor = false;

    private boolean forceTrueColor = false;

    private boolean predictorEnabled = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/imaging/ImagingParameters.java`
#### Snippet
```java
     * Default is {@code null}.
     */
    private String fileName = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/imaging/ImagingParameters.java`
#### Snippet
```java
     * Factory to create {@code BufferedImage}s. Default is {@code null}.
     */
    private BufferedImageFactory bufferedImageFactory = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/imaging/ImagingParameters.java`
#### Snippet
```java
     * or writing a file format. Default is {@code false}.
     */
    private boolean strict = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/imaging/formats/pnm/PnmImagingParameters.java`
#### Snippet
```java
     * Pnm format subtype (e.g. pam, pbm, etc).
     */
    private ImageFormats subtype = null;

    public boolean isRawBits() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/imaging/formats/xpm/XpmImageParser.java`
#### Snippet
```java
        boolean haveColor = false;
        int colorArgb;
        boolean haveGray = false;
        int grayArgb;
        boolean haveGray4Level = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/imaging/formats/xpm/XpmImageParser.java`
#### Snippet
```java
    private static class PaletteEntry {
        int index;
        boolean haveColor = false;
        int colorArgb;
        boolean haveGray = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/imaging/formats/xpm/XpmImageParser.java`
#### Snippet
```java
        boolean haveGray4Level = false;
        int gray4LevelArgb;
        boolean haveMono = false;
        int monoArgb;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/imaging/formats/xpm/XpmImageParser.java`
#### Snippet
```java
        boolean haveGray = false;
        int grayArgb;
        boolean haveGray4Level = false;
        int gray4LevelArgb;
        boolean haveMono = false;
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `sample`
in `src/main/java/org/apache/commons/imaging/formats/pnm/FileInfo.java`
#### Snippet
```java
        if (sample > max) {
            // invalid values -> black
            sample = 0;
        }
        return (int) ((sample * scale / max) + 0.5f);
```

### AssignmentToMethodParameter
Assignment to method parameter `prefix`
in `src/main/java/org/apache/commons/imaging/common/GenericImageMetadata.java`
#### Snippet
```java
    public String toString(String prefix) {
        if (null == prefix) {
            prefix = "";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/imaging/common/mylzw/MyBitOutputStream.java`
#### Snippet
```java
    public void writeBits(int value, final int sampleBits) throws IOException {
        final int sampleMask = (1 << sampleBits) - 1;
        value &= sampleMask;

        if (byteOrder == ByteOrder.BIG_ENDIAN) {
```

### AssignmentToMethodParameter
Assignment to method parameter `available`
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
            readAndVerifyBytes(is, new byte[] { 56, 66, 73, 77 },
                    "Not a Valid PSD File");
            available -= 4;

            final int id = read2Bytes("ID", is, "Not a Valid PSD File", getByteOrder());
```

### AssignmentToMethodParameter
Assignment to method parameter `available`
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java

            final int id = read2Bytes("ID", is, "Not a Valid PSD File", getByteOrder());
            available -= 2;

            final int nameLength = readByte("NameLength", is, "Not a Valid PSD File");
```

### AssignmentToMethodParameter
Assignment to method parameter `available`
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
            final int nameLength = readByte("NameLength", is, "Not a Valid PSD File");

            available -= 1;
            final byte[] nameBytes = readBytes("NameData", is, nameLength,
                    "Not a Valid PSD File");
```

### AssignmentToMethodParameter
Assignment to method parameter `available`
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
            final byte[] nameBytes = readBytes("NameData", is, nameLength,
                    "Not a Valid PSD File");
            available -= nameLength;
            if (((nameLength + 1) % 2) != 0) {
                //final int NameDiscard =
```

### AssignmentToMethodParameter
Assignment to method parameter `available`
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
                readByte("NameDiscard", is,
                        "Not a Valid PSD File");
                available -= 1;
            }
            // String Name = readPString("Name", 6, is, "Not a Valid PSD File");
```

### AssignmentToMethodParameter
Assignment to method parameter `available`
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
            // String Name = readPString("Name", 6, is, "Not a Valid PSD File");
            final int dataSize = read4Bytes("Size", is, "Not a Valid PSD File", getByteOrder());
            available -= 4;
            // int ActualDataSize = ((DataSize % 2) == 0)
            // ? DataSize
```

### AssignmentToMethodParameter
Assignment to method parameter `available`
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java

            final byte[] data = readBytes("Data", is, dataSize, "Not a Valid PSD File");
            available -= dataSize;

            if ((dataSize % 2) != 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `available`
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
                //final int DataDiscard =
                readByte("DataDiscard", is, "Not a Valid PSD File");
                available -= 1;
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `src/main/java/org/apache/commons/imaging/common/itu_t4/BitInputStreamFlexible.java`
#### Snippet
```java
                if (count >= cacheBitsRemaining) {
                    result = ((1 << cacheBitsRemaining) - 1) & cache;
                    count -= cacheBitsRemaining;
                    cacheBitsRemaining = 0;
                } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `src/main/java/org/apache/commons/imaging/common/itu_t4/BitInputStreamFlexible.java`
#### Snippet
```java
                    cacheBitsRemaining -= count;
                    result = ((1 << count) - 1) & (cache >> cacheBitsRemaining);
                    count = 0;
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `src/main/java/org/apache/commons/imaging/common/itu_t4/BitInputStreamFlexible.java`
#### Snippet
```java
                bytesRead++;
                result = (result << 8) | (0xff & cache);
                count -= 8;
            }
            if (count > 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `src/main/java/org/apache/commons/imaging/common/itu_t4/BitInputStreamFlexible.java`
#### Snippet
```java
                result = (result << count)
                        | (((1 << count) - 1) & (cache >> cacheBitsRemaining));
                count = 0;
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `src/main/java/org/apache/commons/imaging/common/BasicCParser.java`
#### Snippet
```java
            constant += (string.charAt(i + j) - '0');
        }
        i += length - 1;
        stringBuilder.append((char) constant);
        return i;
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `src/main/java/org/apache/commons/imaging/common/BasicCParser.java`
#### Snippet
```java
            break;
        case 'x':
            i = appendHex(i, stringBuilder, string);
            break;
        case '0':
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `src/main/java/org/apache/commons/imaging/common/BasicCParser.java`
#### Snippet
```java
        case '6':
        case '7':
            i = appendOct(i, stringBuilder, string);
            break;
        case 'a':
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `src/main/java/org/apache/commons/imaging/common/BasicCParser.java`
#### Snippet
```java
        final char hex1 = string.charAt(i + 1);
        final char hex2 = string.charAt(i + 2);
        i += 2;
        int constant;
        try {
```

### AssignmentToMethodParameter
Assignment to method parameter `runLength`
in `src/main/java/org/apache/commons/imaging/common/itu_t4/T4AndT6Compression.java`
#### Snippet
```java
                    T4_T6_Tables.ADDITIONAL_MAKE_UP_CODES, runLength);
            entry.writeBits(bitStream);
            runLength -= entry.value;
        }
        while (runLength >= 64) {
```

### AssignmentToMethodParameter
Assignment to method parameter `runLength`
in `src/main/java/org/apache/commons/imaging/common/itu_t4/T4AndT6Compression.java`
#### Snippet
```java
            final T4_T6_Tables.Entry entry = lowerBound(makeUpCodes, runLength);
            entry.writeBits(bitStream);
            runLength -= entry.value;
        }
        final T4_T6_Tables.Entry terminatingEntry = terminatingCodes[runLength];
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/imaging/common/RationalNumber.java`
#### Snippet
```java
        if (value < 0) {
            negative = true;
            value = Math.abs(value);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/org/apache/commons/imaging/common/RationalNumber.java`
#### Snippet
```java
                // brutal, imprecise truncation =(
                // use the sign-preserving right shift operator.
                n >>= 1;
                d >>= 1;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `d`
in `src/main/java/org/apache/commons/imaging/common/RationalNumber.java`
#### Snippet
```java
                // use the sign-preserving right shift operator.
                n >>= 1;
                d >>= 1;
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `d`
in `src/main/java/org/apache/commons/imaging/common/RationalNumber.java`
#### Snippet
```java

        final long gcd = gcd(n, d);
        d = d / gcd;
        n = n / gcd;

```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/org/apache/commons/imaging/common/RationalNumber.java`
#### Snippet
```java
        final long gcd = gcd(n, d);
        d = d / gcd;
        n = n / gcd;

        return new RationalNumber((int) n, (int) d);
```

### AssignmentToMethodParameter
Assignment to method parameter `mask`
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParserBitFields.java`
#### Snippet
```java

        while ((0x1 & mask) == 0) {
            mask = 0x7fffffff & (mask >> 1);
            trailingZeroes++;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `mask`
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParserBitFields.java`
#### Snippet
```java

        while ((0x1 & mask) == 1) {
            mask = 0x7fffffff & (mask >> 1);
            maskLength++;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `prefix`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageMetadata.java`
#### Snippet
```java
    public String toString(String prefix) {
        if (prefix == null) {
            prefix = "";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `is`
in `src/main/java/org/apache/commons/imaging/icc/IccProfileParser.java`
#### Snippet
```java
    private IccProfileInfo readICCProfileInfo(InputStream is) {
        final CachingInputStream cis = new CachingInputStream(is);
        is = cis;

        // setDebug(true);
```

### AssignmentToMethodParameter
Assignment to method parameter `markerLength`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/App2Segment.java`
#### Snippet
```java
            numMarkers = readByte("numMarkers", is, "Not a valid App2 Marker");

            markerLength -= JpegConstants.ICC_PROFILE_LABEL.size();
            markerLength -= (1 + 1);

```

### AssignmentToMethodParameter
Assignment to method parameter `markerLength`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/App2Segment.java`
#### Snippet
```java

            markerLength -= JpegConstants.ICC_PROFILE_LABEL.size();
            markerLength -= (1 + 1);

            iccBytes = readBytes("App2 Data", is, markerLength, "Invalid App2 Segment: insufficient data");
```

### AssignmentToMethodParameter
Assignment to method parameter `params`
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java
    public void writeImage(final BufferedImage src, final OutputStream os, BmpImagingParameters params) throws ImageWriteException, IOException {
        if (params == null) {
            params = new BmpImagingParameters();
        }
        final PixelDensity pixelDensity = params.getPixelDensity();
```

### AssignmentToMethodParameter
Assignment to method parameter `argb`
in `src/main/java/org/apache/commons/imaging/palette/PaletteFactory.java`
#### Snippet
```java
        for (int i = 0; i < COMPONENTS; i++) {
            int sample = argb & 0xff;
            argb >>= 8;

            sample >>= (8 - precision);
```

### AssignmentToMethodParameter
Assignment to method parameter `prefix`
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputField.java`
#### Snippet
```java
    public String toString(String prefix) {
        if (prefix == null) {
            prefix = "";
        }
        final StringBuilder result = new StringBuilder();
```

### AssignmentToMethodParameter
Assignment to method parameter `elements`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/iptc/IptcParser.java`
#### Snippet
```java

            // make a copy of the list.
            elements = new ArrayList<>(elements);

            // sort the list. Records must be in numerical order.
```

### AssignmentToMethodParameter
Assignment to method parameter `params`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java

        if (params == null) {
            params = new TiffImagingParameters();
        }
        params.setReadThumbnails(Boolean.TRUE);
```

### AssignmentToMethodParameter
Assignment to method parameter `params`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java
            throws ImageReadException, IOException {
        if (params == null) {
            params = new JpegImagingParameters();
        }
        final TiffImageMetadata exif = getExifMetadata(byteSource, new TiffImagingParameters());
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/DqtSegment.java`
#### Snippet
```java
                    "QuantizationTablePrecisionAndDestination", is,
                    "Not a Valid JPEG File");
            length--;
            final int precision = (precisionAndDestination >> 4) & 0xf;
            final int destinationIdentifier = precisionAndDestination & 0xf;
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/DqtSegment.java`
#### Snippet
```java
                    elements[i] = 0xff & readByte("QuantizationTableElement",
                            is, "Not a Valid JPEG File");
                    length--;
                } else if (precision == 1) {
                    elements[i] = read2Bytes("QuantizationTableElement", is, "Not a Valid JPEG File", getByteOrder());
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/DqtSegment.java`
#### Snippet
```java
                } else if (precision == 1) {
                    elements[i] = read2Bytes("QuantizationTableElement", is, "Not a Valid JPEG File", getByteOrder());
                    length -= 2;
                } else {
                    throw new ImageReadException(
```

### AssignmentToMethodParameter
Assignment to method parameter `params`
in `src/main/java/org/apache/commons/imaging/formats/pcx/PcxImageParser.java`
#### Snippet
```java
    public final BufferedImage getBufferedImage(final ByteSource byteSource, PcxImagingParameters params) throws ImageReadException, IOException {
        if (params == null) {
            params = new PcxImagingParameters();
        }
        try (InputStream is = byteSource.getInputStream()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `prefix`
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageMetadata.java`
#### Snippet
```java
    @Override
    public String toString(String prefix) {
        prefix = prefix == null ? "" : prefix;
        final StringBuilder result = new StringBuilder();
        result.append(String.format("%sGIF metadata:", prefix));
```

### AssignmentToMethodParameter
Assignment to method parameter `params`
in `src/main/java/org/apache/commons/imaging/formats/ico/IcoImageParser.java`
#### Snippet
```java
    public void writeImage(final BufferedImage src, final OutputStream os, IcoImagingParameters params) throws ImageWriteException, IOException {
        if (params == null) {
            params = new IcoImagingParameters();
        }
        final PixelDensity pixelDensity = params.getPixelDensity();
```

### AssignmentToMethodParameter
Assignment to method parameter `params`
in `src/main/java/org/apache/commons/imaging/formats/pcx/PcxWriter.java`
#### Snippet
```java
        // let alone supported by most image viewers
        if (params == null) {
            params = new PcxImagingParameters();
        }
        encoding = PcxImageParser.PcxHeader.ENCODING_RLE;
```

### AssignmentToMethodParameter
Assignment to method parameter `newData`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/iptc/JpegIptcRewriter.java`
#### Snippet
```java
            newBlocks.add(newBlock);

            newData = new PhotoshopApp13Data(newData.getRecords(), newBlocks);

            final byte[] segmentBytes = new IptcParser().writePhotoshopApp13Segment(newData);
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/DhtSegment.java`
#### Snippet
```java
            final int tableClassAndDestinationId = 0xff & readByte(
                    "TableClassAndDestinationId", is, "Not a Valid JPEG File");
            length--;
            final int tableClass = (tableClassAndDestinationId >> 4) & 0xf;
            final int destinationIdentifier = tableClassAndDestinationId & 0xf;
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/DhtSegment.java`
#### Snippet
```java
            for (int i = 1; i < bits.length; i++) {
                bits[i] = 0xff & readByte("Li", is, "Not a Valid JPEG File");
                length--;
                bitsSum += bits[i];
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/DhtSegment.java`
#### Snippet
```java
            for (int i = 0; i < bitsSum; i++) {
                huffVal[i] = 0xff & readByte("Vij", is, "Not a Valid JPEG File");
                length--;
            }

```

### AssignmentToMethodParameter
Assignment to method parameter `prefix`
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageMetadataItem.java`
#### Snippet
```java
    @Override
    public String toString(String prefix) {
        prefix = prefix == null ? "" : prefix;
        final StringBuilder result = new StringBuilder();
        result.append(String.format("%sDelay: %d%s", prefix, delay, NEWLINE));
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `src/main/java/org/apache/commons/imaging/ColorTools.java`
#### Snippet
```java
            // uses the unsigned version of java's right shift operator,
            // so that left hand bits are zeroed.
            i >>>= 1;
        }
        return count;
```

### AssignmentToMethodParameter
Assignment to method parameter `bi`
in `src/main/java/org/apache/commons/imaging/ColorTools.java`
#### Snippet
```java
        // ColorModel.getRGBdefault().getColorSpace());

        bi = relabelColorSpace(bi, from);
        final ColorConvertOp op = new ColorConvertOp(from, to, hints);
        bi = op.filter(bi, null);
```

### AssignmentToMethodParameter
Assignment to method parameter `bi`
in `src/main/java/org/apache/commons/imaging/ColorTools.java`
#### Snippet
```java
        bi = relabelColorSpace(bi, from);
        final ColorConvertOp op = new ColorConvertOp(from, to, hints);
        bi = op.filter(bi, null);

        bi = relabelColorSpace(bi, from);
```

### AssignmentToMethodParameter
Assignment to method parameter `bi`
in `src/main/java/org/apache/commons/imaging/ColorTools.java`
#### Snippet
```java
        bi = op.filter(bi, null);

        bi = relabelColorSpace(bi, from);

        bi = op.filter(bi, null);
```

### AssignmentToMethodParameter
Assignment to method parameter `bi`
in `src/main/java/org/apache/commons/imaging/ColorTools.java`
#### Snippet
```java
        bi = relabelColorSpace(bi, from);

        bi = op.filter(bi, null);

        bi = relabelColorSpace(bi, to);
```

### AssignmentToMethodParameter
Assignment to method parameter `bi`
in `src/main/java/org/apache/commons/imaging/ColorTools.java`
#### Snippet
```java
        bi = op.filter(bi, null);

        bi = relabelColorSpace(bi, to);

        return bi;
```

### AssignmentToMethodParameter
Assignment to method parameter `bi`
in `src/main/java/org/apache/commons/imaging/ColorTools.java`
#### Snippet
```java
        final ColorConvertOp op = new ColorConvertOp(from, to, hints);

        bi = relabelColorSpace(bi, from);

        BufferedImage result = op.filter(bi, null);
```

### AssignmentToMethodParameter
Assignment to method parameter `v`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/decoder/JpegDecoder.java`
#### Snippet
```java
        if (v < vt) {
            vt = (-1 << t) + 1;
            v += vt;
        }
        return v;
```

### AssignmentToMethodParameter
Assignment to method parameter `red`
in `src/main/java/org/apache/commons/imaging/palette/ColorSpaceSubset.java`
#### Snippet
```java

    public final boolean contains(int red, int green, int blue) {
        red >>= (8 - precision);
        if (mins[0] > red) {
            return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `green`
in `src/main/java/org/apache/commons/imaging/palette/ColorSpaceSubset.java`
#### Snippet
```java
        }

        green >>= (8 - precision);
        if (mins[1] > green) {
            return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `blue`
in `src/main/java/org/apache/commons/imaging/palette/ColorSpaceSubset.java`
#### Snippet
```java
        }

        blue >>= (8 - precision);
        if (mins[2] > blue) {
            return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParser.java`
#### Snippet
```java

    int getColorTableRGB(int index) {
        index *= 4;
        final int blue = 0xff & colorTable[index + 0];
        final int green = 0xff & colorTable[index + 1];
```

### AssignmentToMethodParameter
Assignment to method parameter `params`
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java
    public void writeImage(final BufferedImage src, final OutputStream os, GifImagingParameters params) throws ImageWriteException, IOException {
        if (params == null) {
            params = new GifImagingParameters();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
    private static double unPivotRGB(double n) {
        if (n > 0.04045) {
            n = Math.pow((n + 0.055) / 1.055, 2.4);
        } else {
            n = n / 12.92;
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
            n = Math.pow((n + 0.055) / 1.055, 2.4);
        } else {
            n = n / 12.92;
        }
        return n;
```

### AssignmentToMethodParameter
Assignment to method parameter `vH`
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
    private static double convertHuetoRGB(final double v1, final double v2, double vH) {
        if (vH < 0) {
            vH += 1;
        }
        if (vH > 1) {
```

### AssignmentToMethodParameter
Assignment to method parameter `vH`
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
        }
        if (vH > 1) {
            vH -= 1;
        }
        if ((6 * vH) < 1) {
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
    private static double pivotRGB(double n) {
        if (n > 0.0031308) {
            n = 1.055 * Math.pow(n, 1 / 2.4) - 0.055;
        } else {
            n = 12.92 * n;
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
            n = 1.055 * Math.pow(n, 1 / 2.4) - 0.055;
        } else {
            n = 12.92 * n;
        }
        return n;
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
        final double nCube = Math.pow(n, 3);
        if (nCube > XYZ_t0) {
            n = nCube;
        } else {
            n = (n - 16 / 116.0) / XYZ_m;
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
            n = nCube;
        } else {
            n = (n - 16 / 116.0) / XYZ_m;
        }
        return n;
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
    private static double pivotXYZ(double n) {
        if (n > XYZ_t0) {
            n = Math.pow(n, 1 / 3.0);
        } else {
            n = XYZ_m * n + 16 / 116.0;
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
            n = Math.pow(n, 1 / 3.0);
        } else {
            n = XYZ_m * n + 16 / 116.0;
        }
        return n;
```

### AssignmentToMethodParameter
Assignment to method parameter `red`
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java

    private static int convertRGBtoRGB(int red, int green, int blue) {
        red = Math.min(255, Math.max(0, red));
        green = Math.min(255, Math.max(0, green));
        blue = Math.min(255, Math.max(0, blue));
```

### AssignmentToMethodParameter
Assignment to method parameter `green`
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
    private static int convertRGBtoRGB(int red, int green, int blue) {
        red = Math.min(255, Math.max(0, red));
        green = Math.min(255, Math.max(0, green));
        blue = Math.min(255, Math.max(0, blue));

```

### AssignmentToMethodParameter
Assignment to method parameter `blue`
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
        red = Math.min(255, Math.max(0, red));
        green = Math.min(255, Math.max(0, green));
        blue = Math.min(255, Math.max(0, blue));

        final int alpha = 0xff;
```

### AssignmentToMethodParameter
Assignment to method parameter `C`
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
        // Where CMYK and CMY values = 0 ÷ 1

        C = (C * (1 - K) + K);
        M = (M * (1 - K) + K);
        Y = (Y * (1 - K) + K);
```

### AssignmentToMethodParameter
Assignment to method parameter `M`
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java

        C = (C * (1 - K) + K);
        M = (M * (1 - K) + K);
        Y = (Y * (1 - K) + K);

```

### AssignmentToMethodParameter
Assignment to method parameter `Y`
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
        C = (C * (1 - K) + K);
        M = (M * (1 - K) + K);
        Y = (Y * (1 - K) + K);

        return new ColorCmy(C, M, Y);
```

### AssignmentToMethodParameter
Assignment to method parameter `color`
in `src/main/java/org/apache/commons/imaging/formats/xpm/XpmImageParser.java`
#### Snippet
```java
    private int parseColor(String color) throws ImageReadException {
        if (color.charAt(0) == '#') {
            color = color.substring(1);
            if (color.length() == 3) {
                final int red = Integer.parseInt(color.substring(0, 1), 16);
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `src/main/java/org/apache/commons/imaging/formats/xpm/XpmImageParser.java`
#### Snippet
```java
        for (int i = 0; i < charsPerPixel; i++) {
            final int multiple = index / highestPower;
            index -= (multiple * highestPower);
            highestPower /= WRITE_PALETTE.length;
            stringBuilder.append(WRITE_PALETTE[multiple]);
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `src/main/java/org/apache/commons/imaging/common/BinaryFunctions.java`
#### Snippet
```java
    public static byte[] head(final byte[] bytes, int count) {
        if (count > bytes.length) {
            count = bytes.length;
        }
        return slice(bytes, 0, count);
```

### AssignmentToMethodParameter
Assignment to method parameter `params`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
            throws ImageReadException, IOException {
        if (params == null) {
            params = new XmpImagingParameters();
        }
        final FormatCompliance formatCompliance = FormatCompliance.getDefault();
```

### AssignmentToMethodParameter
Assignment to method parameter `params`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
            throws ImageWriteException, IOException {
        if (params == null) {
            params = new TiffImagingParameters();
        }
        new TiffImageWriterLossy().writeImage(src, os, params);
```

### AssignmentToMethodParameter
Assignment to method parameter `params`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java

        if (params == null) {
            params = this.getDefaultParameters();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `params`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
            throws ImageReadException, IOException {
        if (params == null) {
            params = new TiffImagingParameters();
        }
        final FormatCompliance formatCompliance = FormatCompliance.getDefault();
```

### AssignmentToMethodParameter
Assignment to method parameter `params`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
            throws ImageReadException, IOException {
        if (params == null) {
            params = this.getDefaultParameters();
        }
        final FormatCompliance formatCompliance = FormatCompliance.getDefault();
```

### AssignmentToMethodParameter
Assignment to method parameter `x`
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParserRle.java`
#### Snippet
```java
            }

            x++;
            pixelsWritten++;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `longitude`
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputSet.java`
#### Snippet
```java

        final String longitudeRef = longitude < 0 ? "W" : "E";
        longitude = Math.abs(longitude);
        final String latitudeRef = latitude < 0 ? "S" : "N";
        latitude = Math.abs(latitude);
```

### AssignmentToMethodParameter
Assignment to method parameter `latitude`
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputSet.java`
#### Snippet
```java
        longitude = Math.abs(longitude);
        final String latitudeRef = latitude < 0 ? "S" : "N";
        latitude = Math.abs(latitude);

        gpsDirectory.removeField(GpsTagConstants.GPS_TAG_GPS_LONGITUDE_REF);
```

### AssignmentToMethodParameter
Assignment to method parameter `prefix`
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputSet.java`
#### Snippet
```java
    public String toString(String prefix) {
        if (prefix == null) {
            prefix = "";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `params`
in `src/main/java/org/apache/commons/imaging/formats/png/PngWriter.java`
#### Snippet
```java
    public void writeImage(final BufferedImage src, final OutputStream os, PngImagingParameters params) throws ImageWriteException, IOException {
        if (params == null) {
            params = new PngImagingParameters();
        }
        final int compressionLevel = Deflater.DEFAULT_COMPRESSION;
```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`(0xff & blue) << 0` can be replaced with '(0xff \& blue)'
in `src/main/java/org/apache/commons/imaging/formats/pnm/PamFileInfo.java`
#### Snippet
```java
                 | ((0xff & red)   << 16)
                 | ((0xff & green) << 8)
                 | ((0xff & blue)  << 0);
        }
    }
```

### PointlessBitwiseExpression
`(0xff & sample) << 0` can be replaced with '(0xff \& sample)'
in `src/main/java/org/apache/commons/imaging/formats/pnm/PamFileInfo.java`
#### Snippet
```java
                 | ((0xff & sample) << 16)
                 | ((0xff & sample) << 8)
                 | ((0xff & sample) << 0);
        }
    }
```

### PointlessBitwiseExpression
`argb >> 0` can be replaced with 'argb'
in `src/main/java/org/apache/commons/imaging/formats/pnm/PamWriter.java`
#### Snippet
```java
                final int red = 0xff & (argb >> 16);
                final int green = 0xff & (argb >> 8);
                final int blue = 0xff & (argb >> 0);

                os.write((byte) red);
```

### PointlessBitwiseExpression
`byte7 << 0` can be replaced with 'byte7'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
            bits = (byte0 << 56) | (byte1 << 48) | (byte2 << 40)
                    | (byte3 << 32) | (byte4 << 24) | (byte5 << 16)
                    | (byte6 << 8) | (byte7 << 0);
        } else {
            bits = (byte7 << 56) | (byte6 << 48) | (byte5 << 40)
```

### PointlessBitwiseExpression
`byte0 << 0` can be replaced with 'byte0'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
            bits = (byte7 << 56) | (byte6 << 48) | (byte5 << 40)
                    | (byte4 << 32) | (byte3 << 24) | (byte2 << 16)
                    | (byte1 << 8) | (byte0 << 0);
        }
        return Double.longBitsToDouble(bits);
```

### PointlessBitwiseExpression
`bits >> 0` can be replaced with 'bits'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
        final int bits = Float.floatToRawIntBits(value);
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            result[offset + 0] = (byte) (0xff & (bits >> 0));
            result[offset + 1] = (byte) (0xff & (bits >> 8));
            result[offset + 2] = (byte) (0xff & (bits >> 16));
```

### PointlessBitwiseExpression
`bits >> 0` can be replaced with 'bits'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
            result[offset + 3] = (byte) (0xff & (bits >> 24));
        } else {
            result[offset + 3] = (byte) (0xff & (bits >> 0));
            result[offset + 2] = (byte) (0xff & (bits >> 8));
            result[offset + 1] = (byte) (0xff & (bits >> 16));
```

### PointlessBitwiseExpression
`value.numerator >> 0` can be replaced with 'value.numerator'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
            result[offset + 1] = (byte) (value.numerator >> 16);
            result[offset + 2] = (byte) (value.numerator >> 8);
            result[offset + 3] = (byte) (value.numerator >> 0);
            result[offset + 4] = (byte) (value.divisor >> 24);
            result[offset + 5] = (byte) (value.divisor >> 16);
```

### PointlessBitwiseExpression
`value.divisor >> 0` can be replaced with 'value.divisor'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
            result[offset + 5] = (byte) (value.divisor >> 16);
            result[offset + 6] = (byte) (value.divisor >> 8);
            result[offset + 7] = (byte) (value.divisor >> 0);
        } else {
            result[offset + 3] = (byte) (value.numerator >> 24);
```

### PointlessBitwiseExpression
`value.numerator >> 0` can be replaced with 'value.numerator'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
            result[offset + 2] = (byte) (value.numerator >> 16);
            result[offset + 1] = (byte) (value.numerator >> 8);
            result[offset + 0] = (byte) (value.numerator >> 0);
            result[offset + 7] = (byte) (value.divisor >> 24);
            result[offset + 6] = (byte) (value.divisor >> 16);
```

### PointlessBitwiseExpression
`value.divisor >> 0` can be replaced with 'value.divisor'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
            result[offset + 6] = (byte) (value.divisor >> 16);
            result[offset + 5] = (byte) (value.divisor >> 8);
            result[offset + 4] = (byte) (value.divisor >> 0);
        }
    }
```

### PointlessBitwiseExpression
`byte3 << 0` can be replaced with 'byte3'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
        final int bits;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            bits = (byte0 << 24) | (byte1 << 16) | (byte2 << 8) | (byte3 << 0);
        } else {
            bits = (byte3 << 24) | (byte2 << 16) | (byte1 << 8) | (byte0 << 0);
```

### PointlessBitwiseExpression
`byte0 << 0` can be replaced with 'byte0'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
            bits = (byte0 << 24) | (byte1 << 16) | (byte2 << 8) | (byte3 << 0);
        } else {
            bits = (byte3 << 24) | (byte2 << 16) | (byte1 << 8) | (byte0 << 0);
        }
        return Float.intBitsToFloat(bits);
```

### PointlessBitwiseExpression
`bits >> 0` can be replaced with 'bits'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
        final long bits = Double.doubleToRawLongBits(value);
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            result[offset + 0] = (byte) (0xff & (bits >> 0));
            result[offset + 1] = (byte) (0xff & (bits >> 8));
            result[offset + 2] = (byte) (0xff & (bits >> 16));
```

### PointlessBitwiseExpression
`bits >> 0` can be replaced with 'bits'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
            result[offset + 7] = (byte) (0xff & (bits >> 56));
        } else {
            result[offset + 7] = (byte) (0xff & (bits >> 0));
            result[offset + 6] = (byte) (0xff & (bits >> 8));
            result[offset + 5] = (byte) (0xff & (bits >> 16));
```

### PointlessBitwiseExpression
`value >> 0` can be replaced with 'value'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
            result[offset + 1] = (byte) (value >> 16);
            result[offset + 2] = (byte) (value >> 8);
            result[offset + 3] = (byte) (value >> 0);
        } else {
            result[offset + 3] = (byte) (value >> 24);
```

### PointlessBitwiseExpression
`value >> 0` can be replaced with 'value'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
            result[offset + 2] = (byte) (value >> 16);
            result[offset + 1] = (byte) (value >> 8);
            result[offset + 0] = (byte) (value >> 0);
        }
    }
```

### PointlessBitwiseExpression
`value >> 0` can be replaced with 'value'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            result[offset + 0] = (byte) (value >> 8);
            result[offset + 1] = (byte) (value >> 0);
        } else {
            result[offset + 1] = (byte) (value >> 8);
```

### PointlessBitwiseExpression
`value >> 0` can be replaced with 'value'
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
        } else {
            result[offset + 1] = (byte) (value >> 8);
            result[offset + 0] = (byte) (value >> 0);
        }
    }
```

### PointlessBitwiseExpression
`argb >> 0` can be replaced with 'argb'
in `src/main/java/org/apache/commons/imaging/formats/pnm/PgmWriter.java`
#### Snippet
```java
                final int red = 0xff & (argb >> 16);
                final int green = 0xff & (argb >> 8);
                final int blue = 0xff & (argb >> 0);
                final int sample = (red + green + blue) / 3;

```

### PointlessBitwiseExpression
`argb >> 0` can be replaced with 'argb'
in `src/main/java/org/apache/commons/imaging/formats/pnm/PbmWriter.java`
#### Snippet
```java
                final int red = 0xff & (argb >> 16);
                final int green = 0xff & (argb >> 8);
                final int blue = 0xff & (argb >> 0);
                int sample = (red + green + blue) / 3;
                if (sample > 127) {
```

### PointlessBitwiseExpression
`(0xff & blue) << 0` can be replaced with '(0xff \& blue)'
in `src/main/java/org/apache/commons/imaging/formats/pnm/PpmFileInfo.java`
#### Snippet
```java
             | ((0xff & red)   << 16)
             | ((0xff & green) << 8)
             | ((0xff & blue)  << 0);
    }

```

### PointlessBitwiseExpression
`(0xff & blue) << 0` can be replaced with '(0xff \& blue)'
in `src/main/java/org/apache/commons/imaging/formats/pnm/PpmFileInfo.java`
#### Snippet
```java
              | ((0xff & red)   << 16)
              | ((0xff & green) << 8)
              | ((0xff & blue)  << 0);
    }
}
```

### PointlessBitwiseExpression
`(0xff & blue) << 0` can be replaced with '(0xff \& blue)'
in `src/main/java/org/apache/commons/imaging/formats/psd/dataparsers/DataParserRgb.java`
#### Snippet
```java
             | ((0xff & red)   << 16)
             | ((0xff & green) << 8)
             | ((0xff & blue)  << 0);
    }

```

### PointlessBitwiseExpression
`(0xff & sample) << 0` can be replaced with '(0xff \& sample)'
in `src/main/java/org/apache/commons/imaging/formats/pnm/PgmFileInfo.java`
#### Snippet
```java
             | ((0xff & sample) << 16)
             | ((0xff & sample) << 8)
             | ((0xff & sample) << 0);
    }

```

### PointlessBitwiseExpression
`(0xff & sample) << 0` can be replaced with '(0xff \& sample)'
in `src/main/java/org/apache/commons/imaging/formats/pnm/PgmFileInfo.java`
#### Snippet
```java
             | ((0xff & sample) << 16)
             | ((0xff & sample) << 8)
             | ((0xff & sample) << 0);
    }

```

### PointlessBitwiseExpression
`(0xff & transparentBlue) << 0` can be replaced with '(0xff \& transparentBlue)'
in `src/main/java/org/apache/commons/imaging/formats/png/transparencyfilters/TransparencyFilterTrueColor.java`
#### Snippet
```java
        transparentColor = ((0xff & transparentRed) << 16)
                | ((0xff & transparentGreen) << 8)
                | ((0xff & transparentBlue) << 0);

    }
```

### PointlessBitwiseExpression
`(0xff & sample) << 0` can be replaced with '(0xff \& sample)'
in `src/main/java/org/apache/commons/imaging/formats/psd/dataparsers/DataParserBitmap.java`
#### Snippet
```java
             | ((0xff & sample) << 16)
             | ((0xff & sample) << 8)
             | ((0xff & sample) << 0);
    }

```

### PointlessBitwiseExpression
`argb >> 0` can be replaced with 'argb'
in `src/main/java/org/apache/commons/imaging/formats/pnm/PpmWriter.java`
#### Snippet
```java
                final int red = 0xff & (argb >> 16);
                final int green = 0xff & (argb >> 8);
                final int blue = 0xff & (argb >> 0);

                if (rawbits) {
```

### PointlessBitwiseExpression
`rgb >> 0` can be replaced with 'rgb'
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffImageWriterBase.java`
#### Snippet
```java
                        final int red = 0xff & (rgb >> 16);
                        final int green = 0xff & (rgb >> 8);
                        final int blue = 0xff & (rgb >> 0);

                        if (bitsPerSample == 1) {
```

### PointlessBitwiseExpression
`(0xff & 'B') << 0` can be replaced with '(0xff \& 'B')'
in `src/main/java/org/apache/commons/imaging/icc/IccConstants.java`
#### Snippet
```java
            | ((0xff & 'C') << 8) | ((0xff & ' ') << 0));
    public static final int sRGB = (((0xff & 's') << 24) | ((0xff & 'R') << 16)
            | ((0xff & 'G') << 8) | ((0xff & 'B') << 0));

    private IccConstants() {
```

### PointlessBitwiseExpression
`(0xff & ' ') << 0` can be replaced with '(0xff \& ' ')'
in `src/main/java/org/apache/commons/imaging/icc/IccConstants.java`
#### Snippet
```java
public final class IccConstants {
    public static final int IEC = (((0xff & 'I') << 24) | ((0xff & 'E') << 16)
            | ((0xff & 'C') << 8) | ((0xff & ' ') << 0));
    public static final int sRGB = (((0xff & 's') << 24) | ((0xff & 'R') << 16)
            | ((0xff & 'G') << 8) | ((0xff & 'B') << 0));
```

### PointlessBitwiseExpression
`argb >> 0` can be replaced with 'argb'
in `src/main/java/org/apache/commons/imaging/palette/ColorGroup.java`
#### Snippet
```java
        final int red = 0xff & (argb >> 16);
        final int green = 0xff & (argb >> 8);
        final int blue = 0xff & (argb >> 0);

        if (!ignoreAlpha && (alpha < minAlpha || alpha > maxAlpha)) {
```

### PointlessBitwiseExpression
`pixel >> 0` can be replaced with 'pixel'
in `src/main/java/org/apache/commons/imaging/formats/png/GammaCorrection.java`
#### Snippet
```java
        int red = (pixel >> 16) & 0xff;
        int green = (pixel >> 8) & 0xff;
        int blue = (pixel >> 0) & 0xff;

        red = correctSample(red);
```

### PointlessBitwiseExpression
`(0xff & blue) << 0` can be replaced with '(0xff \& blue)'
in `src/main/java/org/apache/commons/imaging/formats/png/GammaCorrection.java`
#### Snippet
```java
        blue = correctSample(blue);

        return alpha | ((0xff & red) << 16) | ((0xff & green) << 8) | ((0xff & blue) << 0);
    }

```

### PointlessBitwiseExpression
`blue << 0` can be replaced with 'blue'
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParserBitFields.java`
#### Snippet
```java
        alpha = (alphaShift >= 0) ? alpha >> alphaShift : alpha << -alphaShift;

        return (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
    }

```

### PointlessBitwiseExpression
`argb >> 0` can be replaced with 'argb'
in `src/main/java/org/apache/commons/imaging/formats/xbm/XbmImageParser.java`
#### Snippet
```java
                final int red = 0xff & (argb >> 16);
                final int green = 0xff & (argb >> 8);
                final int blue = 0xff & (argb >> 0);
                int sample = (red + green + blue) / 3;
                if (sample > 127) {
```

### PointlessBitwiseExpression
`(0xff & blue) << 0` can be replaced with '(0xff \& blue)'
in `src/main/java/org/apache/commons/imaging/formats/png/ScanExpediter.java`
#### Snippet
```java
             | ((0xff & red)   << 16)
             | ((0xff & green) << 8)
             | ((0xff & blue)  << 0);
    }

```

### PointlessBitwiseExpression
`(0xff & blue) << 0` can be replaced with '(0xff \& blue)'
in `src/main/java/org/apache/commons/imaging/formats/psd/dataparsers/DataParserIndexed.java`
#### Snippet
```java
            // return RGB
            return ((0xff & alpha) << 24) | ((0xff & red) << 16)
                    | ((0xff & green) << 8) | ((0xff & blue) << 0);
        });
    }
```

### PointlessBitwiseExpression
`argb >> 0` can be replaced with 'argb'
in `src/main/java/org/apache/commons/imaging/palette/ColorCount.java`
#### Snippet
```java
        red = 0xff & (argb >> 16);
        green = 0xff & (argb >> 8);
        blue = 0xff & (argb >> 0);
    }

```

### PointlessBitwiseExpression
`argb >> 0` can be replaced with 'argb'
in `src/main/java/org/apache/commons/imaging/palette/PaletteFactory.java`
#### Snippet
```java
                final int red = 0xff & (argb >> 16);
                final int green = 0xff & (argb >> 8);
                final int blue = 0xff & (argb >> 0);

                if (red != green || red != blue) {
```

### PointlessBitwiseExpression
`argb >> 0` can be replaced with 'argb'
in `src/main/java/org/apache/commons/imaging/formats/wbmp/WbmpImageParser.java`
#### Snippet
```java
                final int red = 0xff & (argb >> 16);
                final int green = 0xff & (argb >> 8);
                final int blue = 0xff & (argb >> 0);
                final int sample = (red + green + blue) / 3;
                if (sample > 127) {
```

### PointlessBitwiseExpression
`is.read() << 0` can be replaced with 'is.read()'
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/BitInputStream.java`
#### Snippet
```java
            case 16:
                bytesRead += 2;
                return (is.read() << 8) | (is.read() << 0);
            case 24:
                bytesRead += 3;
```

### PointlessBitwiseExpression
`is.read() << 0` can be replaced with 'is.read()'
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/BitInputStream.java`
#### Snippet
```java
            case 24:
                bytesRead += 3;
                return (is.read() << 16) | (is.read() << 8) | (is.read() << 0);
            case 32:
                bytesRead += 4;
```

### PointlessBitwiseExpression
`is.read() << 0` can be replaced with 'is.read()'
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/BitInputStream.java`
#### Snippet
```java
                bytesRead += 4;
                return (is.read() << 24) | (is.read() << 16) | (is.read() << 8)
                        | (is.read() << 0);
            default:
                break;
```

### PointlessBitwiseExpression
`is.read() << 0` can be replaced with 'is.read()'
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/BitInputStream.java`
#### Snippet
```java
            case 16:
                bytesRead += 2;
                return ((is.read() << 0) | (is.read() << 8));
            case 24:
                bytesRead += 3;
```

### PointlessBitwiseExpression
`is.read() << 0` can be replaced with 'is.read()'
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/BitInputStream.java`
#### Snippet
```java
            case 24:
                bytesRead += 3;
                return ((is.read() << 0) | (is.read() << 8) | (is.read() << 16));
            case 32:
                bytesRead += 4;
```

### PointlessBitwiseExpression
`is.read() << 0` can be replaced with 'is.read()'
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/BitInputStream.java`
#### Snippet
```java
            case 32:
                bytesRead += 4;
                return ((is.read() << 0) | (is.read() << 8) | (is.read() << 16) | (is.read() << 24));
            default:
                break;
```

### PointlessBitwiseExpression
`blue << 0` can be replaced with 'blue'
in `src/main/java/org/apache/commons/imaging/formats/tiff/photometricinterpreters/PhotometricInterpreterRgb.java`
#### Snippet
```java

        final int alpha = 0xff;
        final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
        imageBuilder.setRGB(x, y, rgb);

```

### PointlessBitwiseExpression
`blue << 0` can be replaced with 'blue'
in `src/main/java/org/apache/commons/imaging/formats/tiff/photometricinterpreters/PhotometricInterpreterYCbCr.java`
#### Snippet
```java

        final int alpha = 0xff;
        final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
        imageBuilder.setRGB(x, y, rgb);

```

### PointlessBitwiseExpression
`b << 0` can be replaced with 'b'
in `src/main/java/org/apache/commons/imaging/formats/tiff/photometricinterpreters/PhotometricInterpreterYCbCr.java`
#### Snippet
```java

        final int alpha = 0xff;
        return (alpha << 24) | (r << 16) | (g << 8) | (b << 0);
    }

```

### PointlessBitwiseExpression
`(bluesum & 0xff) << 0` can be replaced with '(bluesum \& 0xff)'
in `src/main/java/org/apache/commons/imaging/palette/ColorSpaceSubset.java`
#### Snippet
```java
        greensum /= total;
        bluesum /= total;
        rgb = (int) (((redsum & 0xff) << 16) | ((greensum & 0xff) << 8) | ((bluesum & 0xff) << 0));
    }

```

### PointlessBitwiseExpression
`rgb >> 0` can be replaced with 'rgb'
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpWriterRgb.java`
#### Snippet
```java
                final int red = 0xff & (rgb >> 16);
                final int green = 0xff & (rgb >> 8);
                final int blue = 0xff & (rgb >> 0);

                baos.write(blue);
```

### PointlessBitwiseExpression
`theSignature >> 0` can be replaced with 'theSignature'
in `src/main/java/org/apache/commons/imaging/icc/IccTagDataTypes.java`
#### Snippet
```java
                                (byte) (0xff & (theSignature >> 16)),
                                (byte) (0xff & (theSignature >> 8)),
                                (byte) (0xff & (theSignature >> 0)), }, StandardCharsets.US_ASCII)
                        + ")");
            }
```

### PointlessBitwiseExpression
`data >> 0` can be replaced with 'data'
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParserRgb.java`
#### Snippet
```java
            final int data = read2Bytes("Pixel", is, "BMP Image Data", ByteOrder.LITTLE_ENDIAN);

            final int blue = (0x1f & (data >> 0)) << 3;
            final int green = (0x1f & (data >> 5)) << 3;
            final int red = (0x1f & (data >> 10)) << 3;
```

### PointlessBitwiseExpression
`blue << 0` can be replaced with 'blue'
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParserRgb.java`
#### Snippet
```java
            final int alpha = 0xff;

            final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);

            byteCount += 2;
```

### PointlessBitwiseExpression
`blue << 0` can be replaced with 'blue'
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParserRgb.java`
#### Snippet
```java
            final int alpha = 0xff;

            final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);

            byteCount += 3;
```

### PointlessBitwiseExpression
`blue << 0` can be replaced with 'blue'
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParserRgb.java`
#### Snippet
```java
            final int alpha = 0xff;

            final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);

            byteCount += 4;
```

### PointlessBitwiseExpression
`signature >> 0` can be replaced with 'signature'
in `src/main/java/org/apache/commons/imaging/icc/IccTag.java`
#### Snippet
```java
                        (byte) (0xff & (signature >> 16)),
                        (byte) (0xff & (signature >> 8)),
                        (byte) (0xff & (signature >> 0)), }, StandardCharsets.US_ASCII)
                + ")");

```

### PointlessBitwiseExpression
`dataTypeSignature >> 0` can be replaced with 'dataTypeSignature'
in `src/main/java/org/apache/commons/imaging/icc/IccTag.java`
#### Snippet
```java
                            (byte) (0xff & (dataTypeSignature >> 16)),
                            (byte) (0xff & (dataTypeSignature >> 8)),
                            (byte) (0xff & (dataTypeSignature >> 0)), }, StandardCharsets.US_ASCII)
                    + ")");

```

### PointlessBitwiseExpression
`(0xff & blue) << 0` can be replaced with '(0xff \& blue)'
in `src/main/java/org/apache/commons/imaging/formats/png/chunks/PngChunkPlte.java`
#### Snippet
```java
                    "Not a Valid Png File: PLTE Corrupt");
            rgb[i] = 0xff000000 | ((0xff & red) << 16) | ((0xff & green) << 8)
                    | ((0xff & blue) << 0);
        }
    }
```

### PointlessBitwiseExpression
`i >> 0` can be replaced with 'i'
in `src/main/java/org/apache/commons/imaging/icc/IccProfileInfo.java`
#### Snippet
```java
        pw.println(msg + ": '" + (char) (0xff & (i >> 24))
                + (char) (0xff & (i >> 16)) + (char) (0xff & (i >> 8))
                + (char) (0xff & (i >> 0)) + "'");
    }

```

### PointlessBitwiseExpression
`blue << 0` can be replaced with 'blue'
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParser.java`
#### Snippet
```java
                | (red << 16)
                | (green << 8)
                | (blue << 0);
    }

```

### PointlessBitwiseExpression
`0 | (interlaceFlag ? INTERLACE_FLAG_MASK : 0) ...` can be replaced with '(interlaceFlag ? INTERLACE_FLAG_MASK : 0) \| (sortFlag ? SORT_FLAG_MASK : 0) \| (7 \& sizeOfLocalColorTable)'
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java
                            | (7 & sizeOfLocalColorTable));
                } else {
                    packedFields = (0
                            | (interlaceFlag ? INTERLACE_FLAG_MASK : 0)
                            | (sortFlag ? SORT_FLAG_MASK : 0)
                            | (7 & sizeOfLocalColorTable));
                }
                bos.write(packedFields); // one byte
```

### PointlessBitwiseExpression
`rgb >> 0` can be replaced with 'rgb'
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java
                    final int red = 0xff & (rgb >> 16);
                    final int green = 0xff & (rgb >> 8);
                    final int blue = 0xff & (rgb >> 0);

                    bos.write(red);
```

### PointlessBitwiseExpression
`blue << 0` can be replaced with 'blue'
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java
            final int alpha = 0xff;

            final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
            result[i] = rgb;
        }
```

### PointlessBitwiseExpression
`identifier3 << 0` can be replaced with 'identifier3'
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java
        if (LOGGER.isLoggable(Level.FINEST)) {
            printCharQuad("identifier: ", ((identifier1 << 16)
                    | (identifier2 << 8) | (identifier3 << 0)));
            printCharQuad("version: ",
                    ((version1 << 16) | (version2 << 8) | (version3 << 0)));
```

### PointlessBitwiseExpression
`version3 << 0` can be replaced with 'version3'
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java
                    | (identifier2 << 8) | (identifier3 << 0)));
            printCharQuad("version: ",
                    ((version1 << 16) | (version2 << 8) | (version3 << 0)));
        }

```

### PointlessBitwiseExpression
`byteQuad >> 0` can be replaced with 'byteQuad'
in `src/main/java/org/apache/commons/imaging/internal/Debug.java`
#### Snippet
```java
        final byte b2 = (byte) ((byteQuad >> 16) & 0xff);
        final byte b3 = (byte) ((byteQuad >> 8) & 0xff);
        final byte b4 = (byte) ((byteQuad >> 0) & 0xff);

        final char c1 = (char) b1;
```

### PointlessBitwiseExpression
`rgb >> 0` can be replaced with 'rgb'
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpWriterPalette.java`
#### Snippet
```java
            final int red = 0xff & (rgb >> 16);
            final int green = 0xff & (rgb >> 8);
            final int blue = 0xff & (rgb >> 0);

            bos.write(blue);
```

### PointlessBitwiseExpression
`rgb >> 0` can be replaced with 'rgb'
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
        final int R = 0xff & (rgb >> 16);
        final int G = 0xff & (rgb >> 8);
        final int B = 0xff & (rgb >> 0);

        // RGB values = 0 ÷ 255
```

### PointlessBitwiseExpression
`rgb >> 0` can be replaced with 'rgb'
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
        final int R = 0xff & (rgb >> 16);
        final int G = 0xff & (rgb >> 8);
        final int B = 0xff & (rgb >> 0);

        final double var_R = (R / 255.0); // Where RGB values = 0 ÷ 255
```

### PointlessBitwiseExpression
`rgb >> 0` can be replaced with 'rgb'
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
        final int R = 0xff & (rgb >> 16);
        final int G = 0xff & (rgb >> 8);
        final int B = 0xff & (rgb >> 0);

        final double var_R = (R / 255.0); // RGB values = 0 ÷ 255
```

### PointlessBitwiseExpression
`blue << 0` can be replaced with 'blue'
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
        final int alpha = 0xff;

        return (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
    }

```

### PointlessBitwiseExpression
`rgb >> 0` can be replaced with 'rgb'
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
        final int r = 0xff & (rgb >> 16);
        final int g = 0xff & (rgb >> 8);
        final int b = 0xff & (rgb >> 0);

        double var_R = r / 255.0; // Where R = 0 ÷ 255
```

### PointlessBitwiseExpression
`blue << 0` can be replaced with 'blue'
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
        final int alpha = 0xff;

        return (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
    }

```

### PointlessBitwiseExpression
`(0xff & sample) << 0` can be replaced with '(0xff \& sample)'
in `src/main/java/org/apache/commons/imaging/formats/psd/dataparsers/DataParserGrayscale.java`
#### Snippet
```java
              | ((0xff & sample) << 16)
              | ((0xff & sample) << 8)
              | ((0xff & sample) << 0);
    }

```

### PointlessBitwiseExpression
`i >> 0` can be replaced with 'i'
in `src/main/java/org/apache/commons/imaging/common/BinaryFunctions.java`
#### Snippet
```java
        LOGGER.finest(msg + ": '" + (char) (0xff & (i >> 24))
                + (char) (0xff & (i >> 16)) + (char) (0xff & (i >> 8))
                + (char) (0xff & (i >> 0)) + "'");

    }
```

### PointlessBitwiseExpression
`byte3 << 0` can be replaced with 'byte3'
in `src/main/java/org/apache/commons/imaging/common/BinaryFunctions.java`
#### Snippet
```java
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            result = (byte0 << 24) | (byte1 << 16)
                    | (byte2 << 8) | (byte3 << 0);
        } else {
            result = (byte3 << 24) | (byte2 << 16)
```

### PointlessBitwiseExpression
`byte0 << 0` can be replaced with 'byte0'
in `src/main/java/org/apache/commons/imaging/common/BinaryFunctions.java`
#### Snippet
```java
        } else {
            result = (byte3 << 24) | (byte2 << 16)
                    | (byte1 << 8) | (byte0 << 0);
        }

```

### PointlessBitwiseExpression
`(0xff & c4) << 0` can be replaced with '(0xff \& c4)'
in `src/main/java/org/apache/commons/imaging/common/BinaryFunctions.java`
#### Snippet
```java

    public static int charsToQuad(final char c1, final char c2, final char c3, final char c4) {
        return (((0xff & c1) << 24) | ((0xff & c2) << 16) | ((0xff & c3) << 8) | ((0xff & c4) << 0));
    }

```

### PointlessBitwiseExpression
`byte2 << 0` can be replaced with 'byte2'
in `src/main/java/org/apache/commons/imaging/common/BinaryFunctions.java`
#### Snippet
```java
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            result = (byte0 << 16) | (byte1 << 8)
                    | (byte2 << 0);
        } else {
            result = (byte2 << 16) | (byte1 << 8)
```

### PointlessBitwiseExpression
`byte0 << 0` can be replaced with 'byte0'
in `src/main/java/org/apache/commons/imaging/common/BinaryFunctions.java`
#### Snippet
```java
        } else {
            result = (byte2 << 16) | (byte1 << 8)
                    | (byte0 << 0);
        }

```

### PointlessBitwiseExpression
`i >> 0` can be replaced with 'i'
in `src/main/java/org/apache/commons/imaging/common/BinaryFunctions.java`
#### Snippet
```java
        pw.println(msg + ": '" + (char) (0xff & (i >> 24))
                + (char) (0xff & (i >> 16)) + (char) (0xff & (i >> 8))
                + (char) (0xff & (i >> 0)) + "'");

    }
```

### PointlessBitwiseExpression
`blue << 0` can be replaced with 'blue'
in `src/main/java/org/apache/commons/imaging/formats/tiff/photometricinterpreters/PhotometricInterpreterLogLuv.java`
#### Snippet
```java
        final int blue = Math.min(255, Math.max(0, rgbValues.b));
        final int alpha = 0xff;
        final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
        imageBuilder.setRGB(x, y, rgb);

```

### PointlessBitwiseExpression
`blue << 0` can be replaced with 'blue'
in `src/main/java/org/apache/commons/imaging/formats/tiff/photometricinterpreters/PhotometricInterpreterBiLevel.java`
#### Snippet
```java

        final int alpha = 0xff;
        final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);

        imageBuilder.setRGB(x, y, rgb);
```

### PointlessBitwiseExpression
`chunkType >> 0` can be replaced with 'chunkType'
in `src/main/java/org/apache/commons/imaging/formats/png/PngImageParser.java`
#### Snippet
```java
        result.append((char) (0xff & (chunkType >> 16)));
        result.append((char) (0xff & (chunkType >> 8)));
        result.append((char) (0xff & (chunkType >> 0)));
        return result.toString();
    }
```

### PointlessBitwiseExpression
`argb >> 0` can be replaced with 'argb'
in `src/main/java/org/apache/commons/imaging/formats/png/PngWriter.java`
#### Snippet
```java
                            final int red = 0xff & (argb >> 16);
                            final int green = 0xff & (argb >> 8);
                            final int blue = 0xff & (argb >> 0);

                            if (isGrayscale) {
```

### PointlessBitwiseExpression
`value >> 0` can be replaced with 'value'
in `src/main/java/org/apache/commons/imaging/formats/png/PngWriter.java`
#### Snippet
```java
        os.write(0xff & (value >> 16));
        os.write(0xff & (value >> 8));
        os.write(0xff & (value >> 0));
    }

```

### PointlessBitwiseExpression
`xPPU >> 0` can be replaced with 'xPPU'
in `src/main/java/org/apache/commons/imaging/formats/png/PngWriter.java`
#### Snippet
```java
        bytes[1] = (byte) (0xff & (xPPU >> 16));
        bytes[2] = (byte) (0xff & (xPPU >> 8));
        bytes[3] = (byte) (0xff & (xPPU >> 0));
        bytes[4] = (byte) (0xff & (yPPU >> 24));
        bytes[5] = (byte) (0xff & (yPPU >> 16));
```

### PointlessBitwiseExpression
`yPPU >> 0` can be replaced with 'yPPU'
in `src/main/java/org/apache/commons/imaging/formats/png/PngWriter.java`
#### Snippet
```java
        bytes[5] = (byte) (0xff & (yPPU >> 16));
        bytes[6] = (byte) (0xff & (yPPU >> 8));
        bytes[7] = (byte) (0xff & (yPPU >> 0));
        bytes[8] = units;
        writeChunk(os, ChunkType.pHYs, bytes);
```

### PointlessBitwiseExpression
`rgb >> 0` can be replaced with 'rgb'
in `src/main/java/org/apache/commons/imaging/formats/png/PngWriter.java`
#### Snippet
```java
            bytes[index + 0] = (byte) (0xff & (rgb >> 16));
            bytes[index + 1] = (byte) (0xff & (rgb >> 8));
            bytes[index + 2] = (byte) (0xff & (rgb >> 0));
        }

```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-19-05-45-57.005.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/pnm/WhiteSpaceReader.java`
#### Snippet
```java
            buffer.append(c);
        }
        return buffer.length() > 0 ? buffer.toString() : null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java

        if (blocks.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java

        if (xmpBlocks.isEmpty()) {
            return null;
        }
        if (xmpBlocks.size() > 1) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java

        if (blocks.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
        final byte[] bytes = irb.data;
        if ((bytes == null) || (bytes.length < 1)) {
            return null;
        }
        return bytes.clone();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
    public ImageMetadata getMetadata(final ByteSource byteSource, final PsdImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/common/BasicCParser.java`
#### Snippet
```java
            throw new ImageReadException("Unterminated string ends XMP file");
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/pnm/PnmImageParser.java`
#### Snippet
```java
    public ImageMetadata getMetadata(final ByteSource byteSource, final PnmImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/pnm/PnmImageParser.java`
#### Snippet
```java
    public byte[] getICCProfileBytes(final ByteSource byteSource, final PnmImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputDirectory.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/icns/IcnsType.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/icns/IcnsType.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/icns/IcnsType.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/icns/IcnsType.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/palette/MedianCutQuantizer.java`
#### Snippet
```java
                    colorMap.put(argb, color);
                    if (colorMap.size() > max) {
                        return null;
                    }
                }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffTags.java`
#### Snippet
```java

        if (possibleMatches.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageMetadata.java`
#### Snippet
```java
    public TiffImageData getRawImageData() {
        if (exif == null) {
            return null;
        }
        final List<? extends ImageMetadataItem> dirs = exif.getDirectories();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageMetadata.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageMetadata.java`
#### Snippet
```java

        if (exif == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageMetadata.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageMetadata.java`
#### Snippet
```java
    public TiffField findEXIFValue(final TagInfo tagInfo) {
        try {
            return exif != null ? exif.findField(tagInfo) : null;
        } catch (final ImageReadException cannotHappen) {
            return null;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageMetadata.java`
#### Snippet
```java
            return exif != null ? exif.findField(tagInfo) : null;
        } catch (final ImageReadException cannotHappen) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageMetadata.java`
#### Snippet
```java
            return Imaging.getImageSize(data);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageMetadata.java`
#### Snippet
```java
    public byte[] getEXIFThumbnailData() {
        if (exif == null) {
            return null;
        }
        final List<? extends ImageMetadataItem> dirs = exif.getDirectories();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageMetadata.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageMetadata.java`
#### Snippet
```java
    public TiffField findEXIFValueWithExactMatch(final TagInfo tagInfo) {
        try {
            return exif != null ? exif.findField(tagInfo, true) : null;
        } catch (final ImageReadException cannotHappen) {
            return null;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageMetadata.java`
#### Snippet
```java
            return exif != null ? exif.findField(tagInfo, true) : null;
        } catch (final ImageReadException cannotHappen) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffField.java`
#### Snippet
```java
        final Object o = getValue();
        if (o == null) {
            return null;
        }
        if (!(o instanceof String)) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffField.java`
#### Snippet
```java
    private String getValueDescription(final Object o) {
        if (o == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffField.java`
#### Snippet
```java
    public TiffElement getOversizeValueElement() {
        if (isLocalValue()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/icns/IcnsDecoder.java`
#### Snippet
```java
        final IcnsType imageType = IcnsType.findImageType(imageElement.type);
        if (imageType == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/icns/IcnsImageParser.java`
#### Snippet
```java
    public ImageMetadata getMetadata(final ByteSource byteSource, final IcnsImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/icns/IcnsImageParser.java`
#### Snippet
```java
    public byte[] getICCProfileBytes(final ByteSource byteSource, final IcnsImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/icc/IccProfileParser.java`
#### Snippet
```java

            if (result == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/icc/IccProfileParser.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/icc/IccProfileParser.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/icc/IccProfileParser.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/icc/IccProfileParser.java`
#### Snippet
```java
    public IccProfileInfo getICCProfileInfo(final byte[] bytes) {
        if (bytes == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/icc/IccProfileParser.java`
#### Snippet
```java
    public IccProfileInfo getICCProfileInfo(final File file) {
        if (file == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/icc/IccProfileParser.java`
#### Snippet
```java
    public IccProfileInfo getICCProfileInfo(final ICC_Profile iccProfile) {
        if (iccProfile == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/App2Segment.java`
#### Snippet
```java
     */
    public byte[] getIccBytes() {
        return iccBytes != null ? iccBytes.clone() : null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/xbm/XbmImageParser.java`
#### Snippet
```java
    public byte[] getICCProfileBytes(final ByteSource byteSource, final XbmImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/xbm/XbmImageParser.java`
#### Snippet
```java
    public ImageMetadata getMetadata(final ByteSource byteSource, final XbmImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/png/ScanExpediter.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/rgbe/RgbeImageParser.java`
#### Snippet
```java
    public byte[] getICCProfileBytes(final ByteSource byteSource, final RgbeImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java
            throws ImageReadException, IOException {
        // TODO this should throw UnsupportedOperationException, but RoundtripTest has to be refactored completely before this can be changed
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java
    public byte[] getICCProfileBytes(final ByteSource byteSource, final BmpImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/png/PngColorType.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/palette/PaletteFactory.java`
#### Snippet
```java
        if ((slice < subset.mins[component])
                || (slice >= subset.maxs[component])) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/palette/PaletteFactory.java`
#### Snippet
```java

        if ((sum < 1) || (sum >= total)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/palette/PaletteFactory.java`
#### Snippet
```java

                if (rgbs.add(rgb) && rgbs.size() > max) {
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/wbmp/WbmpImageParser.java`
#### Snippet
```java
    public byte[] getICCProfileBytes(final ByteSource byteSource, final WbmpImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/wbmp/WbmpImageParser.java`
#### Snippet
```java
    public ImageMetadata getMetadata(final ByteSource byteSource, final WbmpImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffContents.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/Imaging.java`
#### Snippet
```java
            return ((XmpEmbeddable) imageParser).getXmpXml(byteSource, null);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/Imaging.java`
#### Snippet
```java
        final byte[] bytes = getICCProfileBytes(byteSource);
        if (bytes == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/Imaging.java`
#### Snippet
```java
        final IccProfileInfo info = parser.getICCProfileInfo(bytes);
        if (info == null) {
            return null;
        }
        if (info.issRGB()) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/Imaging.java`
#### Snippet
```java
        }
        if (info.issRGB()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java
        final byte[] bytes = getExifRawData(byteSource);
        if (null == bytes) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java

        if ((segments == null) || (segments.isEmpty())) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java
        // TODO: concatenate if multiple segments, need example.
        if (exifSegments.isEmpty()) {
            return null;
        }
        if (exifSegments.size() > 1) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java

        if (filtered.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java

        if (result.isEmpty()) {
            return null;
        }
        if (result.size() > 1) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java

        if (null == exif && null == photoshop) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java

        if ((segments == null) || (segments.isEmpty())) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java

        if (null == photoshopApp13Data) {
            return null;
        }
        return new JpegPhotoshopMetadata(photoshopApp13Data);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/pcx/PcxImageParser.java`
#### Snippet
```java
                "Error reading palette");
        if (paletteBytes[0] != 12) {
            return null;
        }
        final int[] palette = new int[256];
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/pcx/PcxImageParser.java`
#### Snippet
```java
    public byte[] getICCProfileBytes(final ByteSource byteSource, final PcxImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/pcx/PcxImageParser.java`
#### Snippet
```java
    public ImageMetadata getMetadata(final ByteSource byteSource, final PcxImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/ico/IcoImageParser.java`
#### Snippet
```java
    public Dimension getImageSize(final ByteSource byteSource, final IcoImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/ico/IcoImageParser.java`
#### Snippet
```java
    public ImageInfo getImageInfo(final ByteSource byteSource, final IcoImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/ico/IcoImageParser.java`
#### Snippet
```java
    public ImageMetadata getMetadata(final ByteSource byteSource, final IcoImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/ico/IcoImageParser.java`
#### Snippet
```java
    public byte[] getICCProfileBytes(final ByteSource byteSource, final IcoImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/photometricinterpreters/floatingpoint/PaletteEntryForValue.java`
#### Snippet
```java
            return color;
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/ImageFormats.java`
#### Snippet
```java
    @Override
    public String getDefaultExtension() {
        return this.extensions != null ? this.extensions[0] : null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/png/PngImagingParameters.java`
#### Snippet
```java

    public List<? extends PngText> getTextChunks() {
        return textChunks != null ? Collections.unmodifiableList(textChunks) : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/photometricinterpreters/floatingpoint/PaletteEntryForRange.java`
#### Snippet
```java
            return new Color(r, g, b, a);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/icc/IccTag.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java

            if (result.isEmpty()) {
                return null;
            }
            if (result.size() > 1) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java
    public byte[] getICCProfileBytes(final ByteSource byteSource, final GifImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        return field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        return field.getValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        return field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        return tag.getValue(field);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        return tag.getValue(field);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
            }
            if (exactDirectoryMatch || tagsMatching > 1) {
                return null;
            }
            for (final ImageMetadataItem directory1 : directories) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        final TiffDirectory gpsDirectory = findDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_GPS);
        if (null == gpsDirectory) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        if (latitudeRefField == null || latitudeField == null
                || longitudeRefField == null || longitudeField == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        return field.getValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        return field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" is missing");
            }
            return null;
        }
        return tag.getValue(field);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
        throws ImageReadException, IOException {
        if (null == tiffImageData) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" is missing");
            }
            return null;
        }
        return tag.getValue(field);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
    public BufferedImage getTiffImage() throws ImageReadException, IOException {
        if (null == tiffImageData) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
            throws ImageReadException {
        if (entries == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/dcx/DcxImageParser.java`
#### Snippet
```java
    public ImageMetadata getMetadata(final ByteSource byteSource, final PcxImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/dcx/DcxImageParser.java`
#### Snippet
```java
    public ImageInfo getImageInfo(final ByteSource byteSource, final PcxImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/dcx/DcxImageParser.java`
#### Snippet
```java
    public byte[] getICCProfileBytes(final ByteSource byteSource, final PcxImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/dcx/DcxImageParser.java`
#### Snippet
```java
            final PcxImagingParameters params) throws ImageReadException, IOException {
        final List<BufferedImage> list = getAllBufferedImages(byteSource);
        return list.isEmpty() ? null : list.get(0);
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/dcx/DcxImageParser.java`
#### Snippet
```java
    public Dimension getImageSize(final ByteSource byteSource, final PcxImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        return field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
                        + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
            throws ImageReadException, IOException {
        if (null == tiffImageData) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/common/bytesource/ByteSourceInputStream.java`
#### Snippet
```java
        final int read = is.read(readBuffer);
        if (read < 1) {
            return null;
        }
        if (read < BLOCK_SIZE) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/common/bytesource/ByteSourceInputStream.java`
#### Snippet
```java
            }
            if (triedNext) {
                return null;
            }
            triedNext = true;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/App13Segment.java`
#### Snippet
```java
         */
        if (!isPhotoshopJpegSegment()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/xpm/XpmImageParser.java`
#### Snippet
```java
    public byte[] getICCProfileBytes(final ByteSource byteSource, final XpmImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/xpm/XpmImageParser.java`
#### Snippet
```java
    public ImageMetadata getMetadata(final ByteSource byteSource, final XpmImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
                false);
        if (bytes == null) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
            return new Rectangle(ix0, iy0, iwidth, iheight);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputSet.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputSet.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/ImageParser.java`
#### Snippet
```java
    public final List<BufferedImage> getAllBufferedImages(final File file) throws ImageReadException, IOException {
        if (!canAcceptExtension(file)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/ImageParser.java`
#### Snippet
```java
            throws ImageReadException, IOException {
        if (!canAcceptExtension(file)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/ImageParser.java`
#### Snippet
```java
            throws ImageReadException, IOException {
        if (!canAcceptExtension(file)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/ImageParser.java`
#### Snippet
```java
            throws ImageReadException, IOException {
        if (!canAcceptExtension(file)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/ImageParser.java`
#### Snippet
```java

        if (!canAcceptExtension(file)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/ImageParser.java`
#### Snippet
```java

        if (!canAcceptExtension(file)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/ImageParser.java`
#### Snippet
```java
    public FormatCompliance getFormatCompliance(final ByteSource byteSource)
            throws ImageReadException, IOException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/ImageParser.java`
#### Snippet
```java
            throws ImageReadException, IOException {
        if (!canAcceptExtension(file)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/ImageParser.java`
#### Snippet
```java
    public final String dumpImageFile(final File file) throws ImageReadException, IOException {
        if (!canAcceptExtension(file)) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/png/PngImageParser.java`
#### Snippet
```java

        if (chunks.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/png/PngImageParser.java`
#### Snippet
```java

        if (chunks.isEmpty()) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/png/PngImageParser.java`
#### Snippet
```java

        if (xmpChunks.isEmpty()) {
            return null;
        }
        if (xmpChunks.size() > 1) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/imaging/formats/png/PngImageParser.java`
#### Snippet
```java

        if (chunks.isEmpty()) {
            return null;
        }

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `i0` is redundant
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/DataReaderTiled.java`
#### Snippet
```java
            // tileLength: number of rows in tile
            // tileWidth:  number of columns in tile
            final int i0 = startY;
            int i1 = startY + tileLength;
            if (i1 > yLimit) {
```

### UnnecessaryLocalVariable
Local variable `j0` is redundant
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/DataReaderTiled.java`
#### Snippet
```java
                i1 = yLimit;
            }
            final int j0 = startX;
            int j1 = startX + tileWidth;
            if (j1 > xLimit) {
```

### UnnecessaryLocalVariable
Local variable `neg_n5` is redundant
in `src/main/java/org/apache/commons/imaging/formats/jpeg/decoder/Dct.java`
#### Snippet
```java
        final float n2 = b2 - a3;
        final float n3 = vector[0] + vector[4];
        final float neg_n5 = neg_b4;

        // A2
```

### UnnecessaryLocalVariable
Local variable `rrrr` is redundant
in `src/main/java/org/apache/commons/imaging/formats/jpeg/decoder/JpegDecoder.java`
#### Snippet
```java
                                huffmanACTables[scanComponent.acCodingTableSelector]);
                        final int ssss = rs & 0xf;
                        final int rrrr = rs >> 4;
                        final int r = rrrr;

```

### UnnecessaryLocalVariable
Local variable `r` is redundant
in `src/main/java/org/apache/commons/imaging/formats/jpeg/decoder/JpegDecoder.java`
#### Snippet
```java
                        final int ssss = rs & 0xf;
                        final int rrrr = rs >> 4;
                        final int r = rrrr;

                        if (ssss == 0) {
```

### UnnecessaryLocalVariable
Local variable `sizeOfLocalColorTable` is redundant
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java
                final boolean interlaceFlag = false;
                final boolean sortFlag = false;
                final int sizeOfLocalColorTable = colorTableScaleLessOne;

                // int SizeOfLocalColorTable = 0;
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `src/main/java/org/apache/commons/imaging/formats/xpm/XpmImageParser.java`
#### Snippet
```java

    private static void loadColorNames() throws ImageReadException {
        synchronized (XpmImageParser.class) {
            if (colorNames != null) {
                return;
```

## RuleId[id=RedundantUnmodifiable]
### RedundantUnmodifiable
Redundant usage of the 'unmodifiableList' wrapper
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageMetadata.java`
#### Snippet
```java
    @Override
    public List<GifImageMetadataItem> getItems() {
        return Collections.unmodifiableList(items);
    }
}
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
The value changed at `stringsAdded++` is never used
in `src/main/java/org/apache/commons/imaging/formats/tiff/taginfos/TagInfoAscii.java`
#### Snippet
```java
            final String string = new String(bytes, nextStringPos, bytes.length
                    - nextStringPos, StandardCharsets.UTF_8);
            strings[stringsAdded++] = string;
        }
        return strings;
```

### UnusedAssignment
The value `0` assigned to `count` is never used
in `src/main/java/org/apache/commons/imaging/common/itu_t4/BitInputStreamFlexible.java`
#### Snippet
```java
                result = (result << count)
                        | (((1 << count) - 1) & (cache >> cacheBitsRemaining));
                count = 0;
            }

```

### UnusedAssignment
Variable `position` initializer `0` is redundant
in `src/main/java/org/apache/commons/imaging/formats/icns/IcnsDecoder.java`
#### Snippet
```java

    private static void apply1BPPMask(final byte[] maskData, final ImageBuilder image) throws ImageReadException {
        int position = 0;
        int bitsLeft = 0;
        int value = 0;
```

### UnusedAssignment
Variable `xHot` initializer `-1` is redundant
in `src/main/java/org/apache/commons/imaging/formats/xbm/XbmImageParser.java`
#### Snippet
```java
        final int width;
        final int height;
        int xHot = -1;
        int yHot = -1;

```

### UnusedAssignment
Variable `yHot` initializer `-1` is redundant
in `src/main/java/org/apache/commons/imaging/formats/xbm/XbmImageParser.java`
#### Snippet
```java
        final int height;
        int xHot = -1;
        int yHot = -1;

        XbmHeader(final int width, final int height, final int xHot, final int yHot) {
```

### UnusedAssignment
Variable `ic` initializer `null` is redundant
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java
    public ImageInfo getImageInfo(final ByteSource byteSource, final BmpImagingParameters params)
            throws ImageReadException, IOException {
        BmpImageContents ic = null;
        try (InputStream is = byteSource.getInputStream()) {
            ic = readImageContents(is, FormatCompliance.getDefault());
```

### UnusedAssignment
Variable `width` initializer `0` is redundant
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java

        final int bitmapHeaderSize = read4Bytes("Bitmap Header Size", is, "Not a Valid BMP File", getByteOrder());
        int width = 0;
        int height = 0;
        int planes = 0;
```

### UnusedAssignment
Variable `height` initializer `0` is redundant
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java
        final int bitmapHeaderSize = read4Bytes("Bitmap Header Size", is, "Not a Valid BMP File", getByteOrder());
        int width = 0;
        int height = 0;
        int planes = 0;
        int bitsPerPixel = 0;
```

### UnusedAssignment
Variable `planes` initializer `0` is redundant
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java
        int width = 0;
        int height = 0;
        int planes = 0;
        int bitsPerPixel = 0;
        int compression = 0;
```

### UnusedAssignment
Variable `bitsPerPixel` initializer `0` is redundant
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java
        int height = 0;
        int planes = 0;
        int bitsPerPixel = 0;
        int compression = 0;
        int bitmapDataSize = 0;
```

### UnusedAssignment
Variable `compression` initializer `0` is redundant
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java
        int planes = 0;
        int bitsPerPixel = 0;
        int compression = 0;
        int bitmapDataSize = 0;
        int hResolution = 0;
```

### UnusedAssignment
Variable `bitmapDataSize` initializer `0` is redundant
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java
        int bitsPerPixel = 0;
        int compression = 0;
        int bitmapDataSize = 0;
        int hResolution = 0;
        int vResolution = 0;
```

### UnusedAssignment
Variable `hResolution` initializer `0` is redundant
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java
        int compression = 0;
        int bitmapDataSize = 0;
        int hResolution = 0;
        int vResolution = 0;
        int colorsUsed = 0;
```

### UnusedAssignment
Variable `vResolution` initializer `0` is redundant
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java
        int bitmapDataSize = 0;
        int hResolution = 0;
        int vResolution = 0;
        int colorsUsed = 0;
        int colorsImportant = 0;
```

### UnusedAssignment
Variable `colorsUsed` initializer `0` is redundant
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java
        int hResolution = 0;
        int vResolution = 0;
        int colorsUsed = 0;
        int colorsImportant = 0;
        int redMask = 0;
```

### UnusedAssignment
Variable `colorsImportant` initializer `0` is redundant
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpImageParser.java`
#### Snippet
```java
        int vResolution = 0;
        int colorsUsed = 0;
        int colorsImportant = 0;
        int redMask = 0;
        int greenMask = 0;
```

### UnusedAssignment
Variable `bitDepthWanted` initializer `-1` is redundant
in `src/main/java/org/apache/commons/imaging/formats/pcx/PcxWriter.java`
#### Snippet
```java
class PcxWriter {
    private int encoding;
    private int bitDepthWanted = -1;
    private int planesWanted = -1;
    private PixelDensity pixelDensity;
```

### UnusedAssignment
Variable `planesWanted` initializer `-1` is redundant
in `src/main/java/org/apache/commons/imaging/formats/pcx/PcxWriter.java`
#### Snippet
```java
    private int encoding;
    private int bitDepthWanted = -1;
    private int planesWanted = -1;
    private PixelDensity pixelDensity;
    private final RleWriter rleWriter;
```

### UnusedAssignment
Variable `lastK` initializer `-1` is redundant
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/DhtSegment.java`
#### Snippet
```java
            int i = 1;
            int j = 1;
            int lastK = -1;
            while (true) {
                if (j > bits[i]) {
```

### UnusedAssignment
The value changed at `stringsAdded++` is never used
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldTypeAscii.java`
#### Snippet
```java
            final String string = new String(bytes, nextStringPos, bytes.length
                    - nextStringPos, StandardCharsets.UTF_8);
            strings[stringsAdded++] = string;
        }
        if (strings.length == 1) {
```

### UnusedAssignment
Variable `xHotSpot` initializer `-1` is redundant
in `src/main/java/org/apache/commons/imaging/formats/xpm/XpmImageParser.java`
#### Snippet
```java
        final int numColors;
        final int numCharsPerPixel;
        int xHotSpot = -1;
        int yHotSpot = -1;
        final boolean xpmExt;
```

### UnusedAssignment
Variable `yHotSpot` initializer `-1` is redundant
in `src/main/java/org/apache/commons/imaging/formats/xpm/XpmImageParser.java`
#### Snippet
```java
        final int numCharsPerPixel;
        int xHotSpot = -1;
        int yHotSpot = -1;
        final boolean xpmExt;

```

### UnusedAssignment
Variable `b` initializer `-1` is redundant
in `src/main/java/org/apache/commons/imaging/common/BinaryFunctions.java`
#### Snippet
```java
    public static boolean searchQuad(final int quad, final InputStream bis) throws IOException {
        final byte[] needle = BinaryFunctions.quadsToByteArray(quad);
        int b = -1;
        int position = 0;
        while ((b = bis.read()) != -1) {
```

### UnusedAssignment
Variable `transparent` initializer `false` is redundant
in `src/main/java/org/apache/commons/imaging/formats/png/PngImageParser.java`
#### Snippet
```java
        final PngChunkIhdr pngChunkIHDR = (PngChunkIhdr) IHDRs.get(0);

        boolean transparent = false;

        final List<PngChunk> tRNSs = filterChunks(chunks, ChunkType.tRNS);
```

### UnusedAssignment
The value `null` assigned to `baos` is never used
in `src/main/java/org/apache/commons/imaging/formats/png/PngImageParser.java`
#### Snippet
```java
        final byte[] compressed = baos.toByteArray();

        baos = null;

        TransparencyFilter transparencyFilter = null;
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `n <= 127` is always `true` when reached
in `src/main/java/org/apache/commons/imaging/common/PackBits.java`
#### Snippet
```java

            final int n = bytes[i++];
            if ((n >= 0) && (n <= 127)) {
                // If n is between 0 and 127 inclusive, copy the next n+1 bytes
                // literally.
```

### ConstantValue
Condition `n <= -1` is always `true` when reached
in `src/main/java/org/apache/commons/imaging/common/PackBits.java`
#### Snippet
```java
                    baos.write(bytes[i++]);
                }
            } else if ((n >= -127) && (n <= -1)) {
                // Else if n is between -127 and -1 inclusive, copy the next byte
                // -n+1 times.
```

### ConstantValue
Condition `n == -128` is always `true`
in `src/main/java/org/apache/commons/imaging/common/PackBits.java`
#### Snippet
```java
                    baos.write(b);
                }
            } else if (n == -128) {
                // Else if n is -128, noop.
                throw new ImageReadException("Packbits: " + n);
```

### ConstantValue
Condition `xmpBlocks.isEmpty()` is always `false`
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
//        }

        if (xmpBlocks.isEmpty()) {
            return null;
        }
```

### ConstantValue
Condition `is != null` is always `true` when reached
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
            notFound = true;
        } finally {
            if (notFound && is != null) {
                is.close();
            }
```

### ConstantValue
Condition `rowLength > width` is always `true`
in `src/main/java/org/apache/commons/imaging/common/itu_t4/T4AndT6Compression.java`
#### Snippet
```java
                    inputStream.flushCache();
                    outputStream.flush();
                } else if (rowLength > width) {
                    throw new ImageReadException("Unrecoverable row length error in image row " + y);
                }
```

### ConstantValue
Condition `rowLength > width` is always `true`
in `src/main/java/org/apache/commons/imaging/common/itu_t4/T4AndT6Compression.java`
#### Snippet
```java
            if (rowLength == width) {
                outputStream.flush();
            } else if (rowLength > width) {
                throw new ImageReadException("Unrecoverable row length error in image row " + y);
            }
```

### ConstantValue
Condition `rowLength > width` is always `true`
in `src/main/java/org/apache/commons/imaging/common/itu_t4/T4AndT6Compression.java`
#### Snippet
```java
                if (rowLength == width) {
                    outputStream.flush();
                } else if (rowLength > width) {
                    throw new ImageReadException("Unrecoverable row length error in image row " + y);
                }
```

### ConstantValue
Condition `identifier2 == PnmConstants.PPM_RAW_CODE` is always `true`
in `src/main/java/org/apache/commons/imaging/formats/pnm/PnmImageParser.java`
#### Snippet
```java
                return new PpmFileInfo(width, height, false, max);
            }
            if (identifier2 == PnmConstants.PPM_RAW_CODE) {
                final int max = Integer.parseInt(wsr.readtoWhiteSpace());
                return new PpmFileInfo(width, height, true, max);
```

### ConstantValue
Condition `usesUncompressedMode` is always `false`
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffImageWriterBase.java`
#### Snippet
```java
            t6Options &= 0x4;
            final boolean usesUncompressedMode = (t6Options & TIFF_FLAG_T6_OPTIONS_UNCOMPRESSED_MODE) != 0;
            if (usesUncompressedMode) {
                throw new ImageWriteException(
                        "T.6 compression with the uncompressed mode extension is not yet supported");
```

### ConstantValue
Condition `offset < 0` is always `false`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffReader.java`
#### Snippet
```java
                final byte[] value;
                if (valueLength > TIFF_ENTRY_MAX_VALUE_LENGTH) {
                    if ((offset < 0) || (offset + valueLength) > byteSource.getLength()) {
                        if (strict) {
                            throw new IOException(
```

### ConstantValue
Condition `bit == 1` is always `true`
in `src/main/java/org/apache/commons/imaging/formats/pnm/PbmFileInfo.java`
#### Snippet
```java
            return 0xffffffff;
        }
        if (bit == 1) {
            return 0xff000000;
        }
```

### ConstantValue
Condition `bytes.length > 4` is always `false`
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputField.java`
#### Snippet
```java
                throw new ImageWriteException("Unexpected separate value item.");
            }
            if (bytes.length > 4) {
                throw new ImageWriteException(
                        "Local value has invalid length: " + bytes.length);
```

### ConstantValue
Condition `numberOfComponents == 4` is always `true`
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java
                                colorType = ImageInfo.ColorType.RGB;
                            }
                        } else if (numberOfComponents == 4) {
                            if (isSubsampled) {
                                colorType = ImageInfo.ColorType.YCCK;
```

### ConstantValue
Condition `bitsPerPixel == 32` is always `true`
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/DataReaderTiled.java`
#### Snippet
```java
                    }
                }
            } else if (bitsPerPixel == 32) {
                // 32 bit case, we don't mask the high byte because any
                // sign-extended bits get shifted up and out of result.
```

### ConstantValue
Condition `2 <= pcxHeader.nPlanes` is always `true`
in `src/main/java/org/apache/commons/imaging/formats/pcx/PcxImageParser.java`
#### Snippet
```java
                    colorModel.isAlphaPremultiplied(), new Properties());
        }
        if (pcxHeader.bitsPerPixel == 1 && 2 <= pcxHeader.nPlanes
                && pcxHeader.nPlanes <= 4) {
            final IndexColorModel colorModel = new IndexColorModel(pcxHeader.nPlanes,
```

### ConstantValue
Condition `pcxHeader.nPlanes <= 4` is always `true`
in `src/main/java/org/apache/commons/imaging/formats/pcx/PcxImageParser.java`
#### Snippet
```java
        }
        if (pcxHeader.bitsPerPixel == 1 && 2 <= pcxHeader.nPlanes
                && pcxHeader.nPlanes <= 4) {
            final IndexColorModel colorModel = new IndexColorModel(pcxHeader.nPlanes,
                    1 << pcxHeader.nPlanes, pcxHeader.colormap, 0, false, -1,
```

### ConstantValue
Condition `bitCount == 32` is always `true`
in `src/main/java/org/apache/commons/imaging/formats/ico/IcoImageParser.java`
#### Snippet
```java
                    if (bitCount == 24) {
                        bos.write3Bytes(argb);
                    } else if (bitCount == 32) {
                        bos.write4Bytes(argb);
                    }
```

### ConstantValue
Condition `bitCount == 8` is always `true`
in `src/main/java/org/apache/commons/imaging/formats/ico/IcoImageParser.java`
#### Snippet
```java
                            bitsInCache = 0;
                        }
                    } else if (bitCount == 8) {
                        final int rgb = 0xffffff & argb;
                        final int index = palette.getPaletteIndex(rgb);
```

### ConstantValue
Condition `!"32-bit_rle_rgbe".equals(value)` is always `true` when reached
in `src/main/java/org/apache/commons/imaging/formats/rgbe/RgbeInfo.java`
#### Snippet
```java
                final String value = info.substring(equals + 1);

                if ("FORMAT".equals(value) && !"32-bit_rle_rgbe".equals(value)) {
                    throw new ImageReadException("Only 32-bit_rle_rgbe images are supported, trying to read " + value);
                }
```

### ConstantValue
Result of `"32-bit_rle_rgbe".equals(value)` is always 'false'
in `src/main/java/org/apache/commons/imaging/formats/rgbe/RgbeInfo.java`
#### Snippet
```java
                final String value = info.substring(equals + 1);

                if ("FORMAT".equals(value) && !"32-bit_rle_rgbe".equals(value)) {
                    throw new ImageReadException("Only 32-bit_rle_rgbe images are supported, trying to read " + value);
                }
```

### ConstantValue
Result of `0 * precision` is always '0'
in `src/main/java/org/apache/commons/imaging/palette/ColorSpaceSubset.java`
#### Snippet
```java
                    final int idx = (blue << (2 * precision))
                            | (green << (1 * precision))
                            | (red << (0 * precision));
                    final int count = table[idx];
                    redsum += count * (red << (8 - precision));
```

### ConstantValue
Value `ignoreAlpha` is always 'false'
in `src/main/java/org/apache/commons/imaging/palette/LongestAxisMedianCut.java`
#### Snippet
```java
                && colorGroup.alphaDiff > colorGroup.greenDiff
                && colorGroup.alphaDiff > colorGroup.blueDiff) {
            doCut(colorGroup, ColorComponent.ALPHA, colorGroups, ignoreAlpha);
        } else if (colorGroup.redDiff > colorGroup.greenDiff
                && colorGroup.redDiff > colorGroup.blueDiff) {
```

### ConstantValue
Result of `precision * 0` is always '0'
in `src/main/java/org/apache/commons/imaging/palette/QuantizedPalette.java`
#### Snippet
```java
                        final int index = (u << (precision * 2))
                                | (j << (precision * 1))
                                | (k << (precision * 0));
                        straight[index] = subset;
                    }
```

### ConstantValue
Condition `localColorTableFlag` is always `true`
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java

                final int packedFields;
                if (localColorTableFlag) {
                    packedFields = (LOCAL_COLOR_TABLE_FLAG_MASK
                            | (interlaceFlag ? INTERLACE_FLAG_MASK : 0)
```

### ConstantValue
Condition `interlaceFlag` is always `false`
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java
                if (localColorTableFlag) {
                    packedFields = (LOCAL_COLOR_TABLE_FLAG_MASK
                            | (interlaceFlag ? INTERLACE_FLAG_MASK : 0)
                            | (sortFlag ? SORT_FLAG_MASK : 0)
                            | (7 & sizeOfLocalColorTable));
```

### ConstantValue
Condition `sortFlag` is always `false`
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java
                    packedFields = (LOCAL_COLOR_TABLE_FLAG_MASK
                            | (interlaceFlag ? INTERLACE_FLAG_MASK : 0)
                            | (sortFlag ? SORT_FLAG_MASK : 0)
                            | (7 & sizeOfLocalColorTable));
                } else {
```

### ConstantValue
Condition `index > length` is always `false` when reached
in `src/main/java/org/apache/commons/imaging/formats/png/transparencyfilters/TransparencyFilterIndexedColor.java`
#### Snippet
```java
        }

        if ((index < 0) || (index > length)) { // TODO check for > length cannot be true because of check above
            throw new ImageReadException(
                    "TransparencyFilterIndexedColor index: " + index + ", bytes.length: " + length);
```

### ConstantValue
Condition `nextMaxColors > Integer.MAX_VALUE` is always `false`
in `src/main/java/org/apache/commons/imaging/formats/xpm/XpmImageParser.java`
#### Snippet
```java
            final long nextMaxColors = maxColors * WRITE_PALETTE.length;
            final long nextCharsPerPixel = charsPerPixel + 1;
            if (nextMaxColors > Integer.MAX_VALUE) {
                throw new ImageWriteException("Xpm: Can't write images with more than Integer.MAX_VALUE colors.");
            }
```

### ConstantValue
Condition `nextCharsPerPixel > Integer.MAX_VALUE` is always `false`
in `src/main/java/org/apache/commons/imaging/formats/xpm/XpmImageParser.java`
#### Snippet
```java
                throw new ImageWriteException("Xpm: Can't write images with more than Integer.MAX_VALUE colors.");
            }
            if (nextCharsPerPixel > Integer.MAX_VALUE) {
                throw new ImageWriteException("Xpm: Can't write images with more than Integer.MAX_VALUE chars per pixel.");
            }
```

### ConstantValue
Condition `directories == null` is always `false`
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java

                final List<TiffDirectory> directories = contents.directories;
                if (directories == null) {
                    return false;
                }
```

### ConstantValue
Value `hasAlpha` is always 'true'
in `src/main/java/org/apache/commons/imaging/formats/png/PngWriter.java`
#### Snippet
```java

            if (hasAlpha) {
                palette = paletteFactory.makeQuantizedRgbaPalette(src, hasAlpha, maxColors);
                writeChunkPLTE(os, palette);
                writeChunkTRNS(os, palette);
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'pixelDensityObj' to 'PixelDensity'
in `src/main/java/org/apache/commons/imaging/formats/png/PngWriter.java`
#### Snippet
```java
        final Object pixelDensityObj = params.getPixelDensity();
        if (pixelDensityObj != null) {
            final PixelDensity pixelDensity = (PixelDensity) pixelDensityObj;
            if (pixelDensity.isUnitless()) {
                writeChunkPHYS(os, (int) Math.round(pixelDensity.getRawHorizontalDensity()),
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/imaging/internal/Debug.java`
#### Snippet
```java

        final List<Object> keys = new ArrayList<>(map.keySet());
        result.append(message + " map: " + keys.size() + NEWLINE);
        for (int i = 0; i < keys.size(); i++) {
            final Object key = keys.get(i);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/imaging/internal/Debug.java`
#### Snippet
```java
            final Object key = keys.get(i);
            final Object value = map.get(key);
            result.append("\t" + i + ": '" + key + "' -> '" + value + "'" + NEWLINE);
        }

```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/imaging/internal/Debug.java`
#### Snippet
```java
                    final StackTraceElement ste = stes[i];

                    result.append("\tat " + ste.getClassName() + "."
                            + ste.getMethodName() + "(" + ste.getFileName()
                            + ":" + ste.getLineNumber() + ")" + NEWLINE);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/imaging/internal/Debug.java`
#### Snippet
```java

        result.append(NEWLINE);
        result.append("Throwable: "
                + ((e == null) ? "" : ("(" + e.getClass().getName() + ")"))
                + ":" + datetime + NEWLINE);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/imaging/internal/Debug.java`
#### Snippet
```java
                + ((e == null) ? "" : ("(" + e.getClass().getName() + ")"))
                + ":" + datetime + NEWLINE);
        result.append("Throwable: " + ((e == null) ? "null" : e.getLocalizedMessage()) + NEWLINE);
        result.append(NEWLINE);

```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/imaging/internal/Debug.java`
#### Snippet
```java

        if (v == null) {
            result.append(message + " (" + null + ")" + NEWLINE);
        } else {
            result.append(message + " (" + v.length + ")" + NEWLINE);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/imaging/internal/Debug.java`
#### Snippet
```java
            result.append(message + " (" + null + ")" + NEWLINE);
        } else {
            result.append(message + " (" + v.length + ")" + NEWLINE);
            for (int i = 0; i < max && i < v.length; i++) {
                final int b = 0xff & v[i];
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/imaging/internal/Debug.java`
#### Snippet
```java
                }

                result.append("\t" + i + ": " + b + " (" + c + ", 0x"
                        + Integer.toHexString(b) + ")" + NEWLINE);
            }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/imaging/internal/Debug.java`
#### Snippet
```java

        if (v == null) {
            result.append(message + " (" + null + ")" + NEWLINE);
        } else {
            result.append(message + " (" + v.length + ")" + NEWLINE);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/imaging/internal/Debug.java`
#### Snippet
```java
            result.append(message + " (" + null + ")" + NEWLINE);
        } else {
            result.append(message + " (" + v.length + ")" + NEWLINE);
            for (final char element : v) {
                result.append("\t" + element + " (" + (0xff & element) + ")" + NEWLINE);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/imaging/internal/Debug.java`
#### Snippet
```java
            result.append(message + " (" + v.length + ")" + NEWLINE);
            for (final char element : v) {
                result.append("\t" + element + " (" + (0xff & element) + ")" + NEWLINE);
            }
            result.append(NEWLINE);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/imaging/internal/Debug.java`
#### Snippet
```java

        if (v == null) {
            result.append(message + " (" + null + ")" + NEWLINE);
        } else {
            result.append(message + " (" + v.length + ")" + NEWLINE);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/imaging/internal/Debug.java`
#### Snippet
```java
            result.append(message + " (" + null + ")" + NEWLINE);
        } else {
            result.append(message + " (" + v.length + ")" + NEWLINE);
            for (final int element : v) {
                result.append("\t" + element + NEWLINE);
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `src/main/java/org/apache/commons/imaging/internal/Debug.java`
#### Snippet
```java
            result.append(message + " (" + v.length + ")" + NEWLINE);
            for (final int element : v) {
                result.append("\t" + element + NEWLINE);
            }
            result.append(NEWLINE);
```

