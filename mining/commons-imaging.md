# commons-imaging 
 
# Bad smells
I found 522 bad smells with 11 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| CommentedOutCode | 118 | false |
| PointlessBitwiseExpression | 92 | false |
| DuplicatedCode | 68 | false |
| PointlessArithmeticExpression | 32 | false |
| ConstantValue | 31 | false |
| UnusedAssignment | 25 | false |
| JavadocLinkAsPlainText | 24 | false |
| StaticInitializerReferencesSubClass | 22 | false |
| TrivialIf | 18 | false |
| StringConcatenationInsideStringBufferAppend | 14 | false |
| IntegerMultiplicationImplicitCastToLong | 13 | false |
| DataFlowIssue | 11 | false |
| EmptyStatementBody | 7 | false |
| ArraysAsListWithZeroOrOneArgument | 7 | false |
| DuplicateBranchesInSwitch | 6 | false |
| UnnecessaryLocalVariable | 6 | true |
| StringBufferReplaceableByString | 4 | false |
| ProtectedMemberInFinalClass | 3 | true |
| FieldCanBeLocal | 3 | false |
| UnnecessaryToStringCall | 2 | true |
| DanglingJavadoc | 2 | false |
| IfStatementWithIdenticalBranches | 2 | false |
| MismatchedArrayReadWrite | 1 | false |
| UnnecessarySemicolon | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| MismatchedJavadocCode | 1 | false |
| CatchMayIgnoreException | 1 | false |
| IOStreamConstructor | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| RedundantMethodOverride | 1 | false |
| JavadocDeclaration | 1 | false |
| RedundantUnmodifiable | 1 | false |
| CastCanBeRemovedNarrowingVariableType | 1 | false |
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

## RuleId[id=DataFlowIssue]
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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/apache/commons/imaging/formats/tiff/taginfos/TagInfoGpsText.java`
#### Snippet
```java
            throw new ImageReadException("Unexpected ASCII type decoded");
        }
        if (entry.getFieldType() == FieldType.UNDEFINED) {
            /* later */
        } else if (entry.getFieldType() == FieldType.BYTE) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/apache/commons/imaging/formats/tiff/taginfos/TagInfoGpsText.java`
#### Snippet
```java
        if (entry.getFieldType() == FieldType.UNDEFINED) {
            /* later */
        } else if (entry.getFieldType() == FieldType.BYTE) {
            /* later */
        } else {
```

### EmptyStatementBody
`for` statement has empty body
in `src/main/java/org/apache/commons/imaging/common/itu_t4/T4AndT6Compression.java`
#### Snippet
```java
    private static int nextChangingElement(final int[] line, final int currentColour, final int start) {
        int position;
        for (position = start; position < line.length
                && line[position] == currentColour; position++) {
            // noop
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/apache/commons/imaging/common/BasicCParser.java`
#### Snippet
```java
                    token.append((char) c);
                    return token.toString();
                } else if (c == ' ' || c == '\t' || c == '\r' || c == '\n') {
                    // ignore
                } else {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffImageWriterBase.java`
#### Snippet
```java
                strips[i] = ZlibDeflate.compress(strips[i]);
            }
        } else if (compression == TIFF_COMPRESSION_UNCOMPRESSED) {
            // do nothing.
        } else {
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/org/apache/commons/imaging/icc/IccProfileParser.java`
#### Snippet
```java
            {
                // read stream to end, filling cache.
                while (is.read() >= 0) { // NOPMD we're doing nothing with the data
                }
            }
```

### EmptyStatementBody
`for` statement has empty body
in `src/main/java/org/apache/commons/imaging/common/PackBits.java`
#### Snippet
```java
        int i;

        for (i = start + 1; (i < bytes.length) && (bytes[i] == b); i++) {
            // do nothing
        }
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary arguments
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java

        // segment data is UTF-8 encoded xml.
        return new String(block.data, 0, block.data.length, StandardCharsets.UTF_8);
    }

```

## RuleId[id=StaticInitializerReferencesSubClass]
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
    public static final List<FieldType> SHORT_OR_LONG_OR_RATIONAL =
            Collections.unmodifiableList(Arrays.asList(
                    SHORT, LONG, RATIONAL));

    public static final List<FieldType> LONG_OR_SHORT =
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
    public static final List<FieldType> SHORT_OR_RATIONAL =
            Collections.unmodifiableList(Arrays.asList(
                    SHORT, RATIONAL));

    public static final List<FieldType> SHORT_OR_LONG_OR_RATIONAL =
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
Referencing subclass FieldTypeLong from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
    public static final List<FieldType> SHORT_OR_LONG =
            Collections.unmodifiableList(Arrays.asList(
                    SHORT, LONG));

    public static final List<FieldType> SHORT_OR_RATIONAL =
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
Referencing subclass FieldTypeLong from superclass FieldType initializer might lead to class loading deadlock
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldType.java`
#### Snippet
```java
    public static final FieldTypeFloat FLOAT = new FieldTypeFloat(11, "Float");
    public static final FieldTypeDouble DOUBLE = new FieldTypeDouble(12, "Double");
    public static final FieldTypeLong IFD = new FieldTypeLong(13, "IFD");

    private final int type;
```

## RuleId[id=CommentedOutCode]
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
in `src/main/java/org/apache/commons/imaging/formats/psd/datareaders/CompressedDataReader.java`
#### Snippet
```java
                    + "]", is, "PSD: bad Image Data", bfp.getByteOrder());
        }
        // System.out.println("fImageContents.Compression: "
        // + imageContents.Compression);

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
    public int getIntValueOrArraySum() throws ImageReadException {
        final Object o = getValue();
        // if (o == null)
        // return -1;

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
in `src/main/java/org/apache/commons/imaging/formats/png/ScanExpediterInterlaced.java`
#### Snippet
```java
    private static final int[] ROW_INCREMENT = { 8, 8, 8, 4, 4, 2, 2 };
    private static final int[] COL_INCREMENT = { 8, 8, 4, 4, 2, 2, 1 };
//    private static final int Block_Height[] = { 8, 8, 4, 4, 2, 2, 1 };
//    private static final int Block_Width[] = { 8, 4, 4, 2, 2, 1, 1 };

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
Commented out code (3 lines)
in `src/main/java/org/apache/commons/imaging/formats/png/scanlinefilters/ScanlineFilterPaeth.java`
#### Snippet
```java

            dst[i] = (byte) ((src[i] + paethPredictor) % 256);
            // dst[i] = (byte) ((src[i] + paethPredictor) );
            // dst[i] = src[i];

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

## RuleId[id=DuplicateBranchesInSwitch]
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/FormatCompliance.java`
#### Snippet
```java
        try (StringWriter sw = new StringWriter(); PrintWriter pw = new PrintWriter(sw)) {
            dump(pw);
            pw.flush();
            sw.flush();
            LOGGER.fine(sw.toString());
        } catch (final IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/Imaging.java`
#### Snippet
```java
            final int i1 = is.read();
            final int i2 = is.read();
            if ((i1 < 0) || (i2 < 0)) {
                throw new IllegalArgumentException("Couldn't read magic numbers to guess format.");
            }

            final int b1 = i1 & 0xff;
            final int b2 = i2 & 0xff;
            final int[] bytePair = { b1, b2, };
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
        final int R = 0xff & (rgb >> 16);
        final int G = 0xff & (rgb >> 8);
        final int B = 0xff & (rgb >> 0);

        final double var_R = (R / 255.0); // Where RGB values = 0 ÷ 255
        final double var_G = (G / 255.0);
        final double var_B = (B / 255.0);

        final double var_Min = Math.min(var_R, Math.min(var_G, var_B)); // Min. value
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
        if (var_R >= var_G && var_R >= var_B) {
            var_Max = var_R;
            maxIsR = true;
        } else if (var_G > var_B) {
            var_Max = var_G;
            maxIsG = true;
        } else {
            var_Max = var_B;
        }
        final double del_Max = var_Max - var_Min; // Delta RGB value
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
            final double del_R = (((var_Max - var_R) / 6) + (del_Max / 2)) / del_Max;
            final double del_G = (((var_Max - var_G) / 6) + (del_Max / 2)) / del_Max;
            final double del_B = (((var_Max - var_B) / 6) + (del_Max / 2)) / del_Max;

            if (maxIsR) {
                H = del_B - del_G;
            } else if (maxIsG) {
                H = (1 / 3.0) + del_R - del_B;
            } else {
                H = (2 / 3.0) + del_G - del_R;
            }

            // Debug.debug("H1", H);

            if (H < 0) {
                H += 1;
            }
            if (H > 1) {
                H -= 1;
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
        red = Math.min(255, Math.max(0, red));
        green = Math.min(255, Math.max(0, green));
        blue = Math.min(255, Math.max(0, blue));

        final int alpha = 0xff;

        return (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/common/BinaryFunctions.java`
#### Snippet
```java
        final int result;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            result = (byte0 << 24) | (byte1 << 16)
                    | (byte2 << 8) | (byte3 << 0);
        } else {
            result = (byte3 << 24) | (byte2 << 16)
                    | (byte1 << 8) | (byte0 << 0);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/common/ByteConversions.java`
#### Snippet
```java
            result[offset + 0] = (byte) (0xff & (bits >> 0));
            result[offset + 1] = (byte) (0xff & (bits >> 8));
            result[offset + 2] = (byte) (0xff & (bits >> 16));
            result[offset + 3] = (byte) (0xff & (bits >> 24));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/common/bytesource/ByteSourceInputStream.java`
#### Snippet
```java
            if (null == block) {
                if (readFirst) {
                    return -1;
                }
                block = getFirstBlock();
                readFirst = true;
            }

            if (block != null && blockIndex >= block.bytes.length) {
                block = block.getNext();
                blockIndex = 0;
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/common/itu_t4/T4AndT6Compression.java`
#### Snippet
```java
                for (rowLength = 0; rowLength < width;) {
                    final int runLength = readTotalRunLength(inputStream, color);
                    for (int i = 0; i < runLength; i++) {
                        outputStream.writeBit(color);
                    }
                    color = 1 - color;
                    rowLength += runLength;
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/common/itu_t4/T4AndT6Compression.java`
#### Snippet
```java
                if (hasFill) {
                    int bitsAvailable = outputStream.getBitsAvailableInCurrentByte();
                    if (bitsAvailable < 4) {
                        outputStream.flush();
                        bitsAvailable = 8;
                    }
                    for (; bitsAvailable > 4; bitsAvailable--) {
                        outputStream.writeBit(0);
                    }
                }
                T4_T6_Tables.EOL.writeBits(outputStream);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/common/itu_t4/T4AndT6Compression.java`
#### Snippet
```java
for (int i = 0; i < width; i++) {
                    try {
                        codingLine[i] = inputStream.readBits(1);
                    } catch (final IOException ioException) {
                        throw new ImageWriteException("Error reading image to compress", ioException);
                    }
                }
                int codingA0Color = WHITE;
                int referenceA0Color = WHITE;
                int a1 = nextChangingElement(codingLine, codingA0Color, 0);
                int b1 = nextChangingElement(referenceLine, referenceA0Color, 0);
                int b2 = nextChangingElement(referenceLine, 1 - referenceA0Color, b1 + 1);
                for (int a0 = 0; a0 < width;) {
                    if (b2 < a1) {
                        T4_T6_Tables.P.writeBits(outputStream);
                        a0 = b2;
                    } else {
                        a0 = compressT(a0, a1, b1, outputStream, codingA0Color, codingLine);
                        if (a0 == a1) {
                            codingA0Color = 1 - codingA0Color;
                        }
                    }
                    referenceA0Color = changingElementAt(referenceLine, a0);
                    a1 = nextChangingElement(codingLine, codingA0Color, a0 + 1);
                    if (codingA0Color == referenceA0Color) {
                        b1 = nextChangingElement(referenceLine, referenceA0Color, a0 + 1);
                    } else {
                        b1 = nextChangingElement(referenceLine, referenceA0Color, a0 + 1);
                        b1 = nextChangingElement(referenceLine, 1 - referenceA0Color, b1 + 1);
                    }
                    b2 = nextChangingElement(referenceLine, 1 - codingA0Color, b1 + 1);
                }
                final int[] swap = referenceLine;
                referenceLine = codingLine;
                codingLine = swap;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/common/itu_t4/T4AndT6Compression.java`
#### Snippet
```java
                                final int a0a1 = readTotalRunLength(inputStream, codingA0Color);
                                a1 = a0 + a0a1;
                                fillRange(outputStream, referenceLine, a0, a1, codingA0Color);
                                final int a1a2 = readTotalRunLength(inputStream, 1 - codingA0Color);
                                a2 = a1 + a1a2;
                                fillRange(outputStream, referenceLine, a1, a2, 1 - codingA0Color);
                                a0 = a2;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/common/itu_t4/T4AndT6Compression.java`
#### Snippet
```java
                            referenceA0Color = changingElementAt(referenceLine, a0);
                            if (codingA0Color == referenceA0Color) {
                                b1 = nextChangingElement(referenceLine, referenceA0Color, a0 + 1);
                            } else {
                                b1 = nextChangingElement(referenceLine, referenceA0Color, a0 + 1);
                                b1 = nextChangingElement(referenceLine, 1 - referenceA0Color, b1 + 1);
                            }
                            b2 = nextChangingElement(referenceLine, 1 - codingA0Color, b1 + 1);
                            rowLength = a0;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpWriterPalette.java`
#### Snippet
```java
            final int rgb = palette.getEntry(i);

            final int red = 0xff & (rgb >> 16);
            final int green = 0xff & (rgb >> 8);
            final int blue = 0xff & (rgb >> 0);

            bos.write(blue);
            bos.write(green);
            bos.write(red);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpWriterRgb.java`
#### Snippet
```java
                final int red = 0xff & (rgb >> 16);
                final int green = 0xff & (rgb >> 8);
                final int blue = 0xff & (rgb >> 0);

                baos.write(blue);
                baos.write(green);
                baos.write(red);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParserRgb.java`
#### Snippet
```java
            final int blue = 0xff & imageData[byteCount + 0];
            final int green = 0xff & imageData[byteCount + 1];
            final int red = 0xff & imageData[byteCount + 2];
            final int alpha = 0xff;

            final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/ico/IcoImageParser.java`
#### Snippet
```java
            if (bitsInCache > 0) {
                bitCache <<= (8 - bitsInCache);
                bos.write(0xff & bitCache);
                bitCache = 0;
                bitsInCache = 0;
            }

            for (int x = 0; x < rowPadding; x++) {
                bos.write(0);
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/jpeg/JpegImageParser.java`
#### Snippet
```java
                        switch (densityUnits) {
                        case 1:
                            break;
                        case 2: // inches
                            unitsPerInch = 1.0;
                            break;
                        case 3: // cms
                            unitsPerInch = 2.54;
                            break;
                        default:
                            break;
                        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/jpeg/decoder/Dct.java`
#### Snippet
```java
            a01 = a00 + a30;
            a11 = a10 + a20;
            a21 = a10 - a20;
            a31 = a00 - a30;
            neg_a41 = a40 + a50;
            a51 = a50 + a60;
            a61 = a60 + a70;
            a22 = a21 + a31;
            a23 = a22 * A1;
            mul5 = (a61 - neg_a41) * A5;
            a43 = neg_a41 * A2 - mul5;
            a53 = a51 * A3;
            a63 = a61 * A4 - mul5;
            a54 = a70 + a53;
            a74 = a70 - a53;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/jpeg/decoder/Dct.java`
#### Snippet
```java
            a7 = tmp1 + tmp2;
            tmp4 = C6 * (a4 + a6);
            neg_b4 = Q * a4 + tmp4;
            b6 = R * a6 - tmp4;
            b2 = a2 * C4;
            b5 = a5 * C4;
            tmp3 = b6 - a7;
            n0 = tmp3 - b5;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/jpeg/decoder/JpegDecoder.java`
#### Snippet
```java
            final SosSegment.Component scanComponent = sosSegment.getComponents(i);
            SofnSegment.Component frameComponent = null;
            for (int j = 0; j < sofnSegment.numberOfComponents; j++) {
                if (sofnSegment.getComponents(j).componentIdentifier == scanComponent.scanComponentSelector) {
                    frameComponent = sofnSegment.getComponents(j);
                    break;
                }
            }
            if (frameComponent == null) {
                throw new ImageReadException("Invalid component");
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/jpeg/exif/ExifRewriter.java`
#### Snippet
```java
                final byte[] markerBytes = ByteConversions.toBytes((short) JpegConstants.JPEG_APP1_MARKER, getByteOrder());
                if (newBytes.length > 0xffff) {
                    throw new ExifOverflowException(
                            "APP1 Segment is too long: " + newBytes.length);
                }
                final int markerLength = newBytes.length + 2;
                final byte[] markerLengthBytes = ByteConversions.toBytes((short) markerLength, getByteOrder());
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/jpeg/iptc/JpegIptcRewriter.java`
#### Snippet
```java
        final JFIFPieces jfifPieces = analyzeJFIF(byteSource);
        final List<JFIFPiece> oldPieces = jfifPieces.pieces;
        final List<JFIFPiece> photoshopApp13Segments = findPhotoshopApp13Segments(oldPieces);

        if (photoshopApp13Segments.size() > 1) {
            throw new ImageReadException(
                    "Image contains more than one Photoshop App13 segment.");
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/pcx/PcxImageParser.java`
#### Snippet
```java
        final int xSize = pcxHeader.xMax - pcxHeader.xMin + 1;
        if (xSize < 0) {
            throw new ImageReadException("Image width is negative");
        }
        final int ySize = pcxHeader.yMax - pcxHeader.yMin + 1;
        if (ySize < 0) {
            throw new ImageReadException("Image height is negative");
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/pcx/PcxWriter.java`
#### Snippet
```java
                    final int argb = src.getRGB(x, y);
                    final int index = palette.getPaletteIndex(0xffffff & argb);
                    plane0[x >>> 3] |= (index & 1) << (7 - (x & 7));
                    plane1[x >>> 3] |= ((index & 2) >> 1) << (7 - (x & 7));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/png/PngImageParser.java`
#### Snippet
```java
        if (chunks.isEmpty()) {
            throw new ImageReadException("PNG: no chunks");
        }

        final List<PngChunk> IHDRs = filterChunks(chunks, ChunkType.IHDR);
        if (IHDRs.size() != 1) {
            throw new ImageReadException("PNG contains more than one Header");
        }

        final PngChunkIhdr pngChunkIHDR = (PngChunkIhdr) IHDRs.get(0);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/png/scanlinefilters/ScanlineFilterAverage.java`
#### Snippet
```java
            int raw = 0;
            final int prevIndex = i - bytesPerPixel;
            if (prevIndex >= 0) {
                raw = dst[prevIndex];
            }

            int prior = 0;
            if (up != null) {
                prior = up[i];
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/pnm/PamFileInfo.java`
#### Snippet
```java
            int alpha = 0xff;
            if (hasAlpha) {
                alpha = readSample(is, bytesPerSample);
                alpha = scaleSample(alpha, scale, maxval);
            }

            return ((0xff & alpha)  << 24)
                 | ((0xff & sample) << 16)
                 | ((0xff & sample) << 8)
                 | ((0xff & sample) << 0);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/pnm/PamFileInfo.java`
#### Snippet
```java
            int red = readSample(is, bytesPerSample);
            int green = readSample(is, bytesPerSample);
            int blue = readSample(is, bytesPerSample);

            red = scaleSample(red, scale, maxval);
            green = scaleSample(green, scale, maxval);
            blue = scaleSample(blue, scale, maxval);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/pnm/PbmWriter.java`
#### Snippet
```java
        os.write(PnmConstants.PNM_SEPARATOR);

        final int width = src.getWidth();
        final int height = src.getHeight();

        os.write(Integer.toString(width).getBytes(StandardCharsets.US_ASCII));
        os.write(PnmConstants.PNM_SEPARATOR);

        os.write(Integer.toString(height).getBytes(StandardCharsets.US_ASCII));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/pnm/PbmWriter.java`
#### Snippet
```java
                final int argb = src.getRGB(x, y);
                final int red = 0xff & (argb >> 16);
                final int green = 0xff & (argb >> 8);
                final int blue = 0xff & (argb >> 0);
                int sample = (red + green + blue) / 3;
                if (sample > 127) {
                    sample = 0;
                } else {
                    sample = 1;
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/pnm/PgmWriter.java`
#### Snippet
```java
                final int argb = src.getRGB(x, y);
                final int red = 0xff & (argb >> 16);
                final int green = 0xff & (argb >> 8);
                final int blue = 0xff & (argb >> 0);
                final int sample = (red + green + blue) / 3;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/pnm/PpmFileInfo.java`
#### Snippet
```java
        green = scaleSample(green, scale, max);
        blue = scaleSample(blue, scale, max);
        final int alpha = 0xff;

        return ((0xff & alpha)  << 24)
              | ((0xff & red)   << 16)
              | ((0xff & green) << 8)
              | ((0xff & blue)  << 0);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
        final TiffField field = findField(tag);
        if (field == null) {
            throw new ImageReadException("Required field \"" + tag.name
                    + "\" is missing");
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            throw new ImageReadException("Required field \"" + tag.name
                    + "\" has incorrect type " + field.getFieldType().getName());
        }
        if (field.getCount() != 1) {
            throw new ImageReadException("Field \"" + tag.name + "\" has wrong count " + field.getCount());
        }
        return field.getByteArrayValue()[0];
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        return field.getByteArrayValue();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffDirectory.java`
#### Snippet
```java
        final TiffField field = findField(tag);
        if (field == null) {
            throw new ImageReadException("Required field \"" + tag.name
                    + "\" is missing");
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            throw new ImageReadException("Required field \"" + tag.name
                    + "\" has incorrect type " + field.getFieldType().getName());
        }
        if (field.getCount() != 1) {
            throw new ImageReadException("Field \"" + tag.name + "\" has wrong count " + field.getCount());
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageMetadata.java`
#### Snippet
```java
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
        final TiffDirectory directory = contents.directories.get(0);

        final TiffField widthField = directory.findField(
                TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, true);
        final TiffField heightField = directory.findField(
                TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, true);

        if ((widthField == null) || (heightField == null)) {
            throw new ImageReadException("TIFF image missing size info.");
        }

        final int height = heightField.getIntValue();
        final int width = widthField.getIntValue();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
        final TiffField widthField = directory.findField(
                TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, true);
        final TiffField heightField = directory.findField(
                TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, true);

        if ((widthField == null) || (heightField == null)) {
            throw new ImageReadException("TIFF image missing size info.");
        }

        final int height = heightField.getIntValue();
        final int width = widthField.getIntValue();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
        final short compressionFieldValue;
        if (directory.findField(TiffTagConstants.TIFF_TAG_COMPRESSION) != null) {
            compressionFieldValue = directory.getFieldValue(TiffTagConstants.TIFF_TAG_COMPRESSION);
        } else {
            compressionFieldValue = TIFF_COMPRESSION_UNCOMPRESSED_1;
        }
        final int compression = 0xffff & compressionFieldValue;
        final int width = directory.getSingleFieldValue(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH);
        final int height = directory.getSingleFieldValue(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
            if (subImage.width <= 0) {
                throw new ImageReadException("negative or zero subimage width");
            }
            if (subImage.height <= 0) {
                throw new ImageReadException("negative or zero subimage height");
            }
            if (subImage.x < 0 || subImage.x >= width) {
                throw new ImageReadException("subimage x is outside raster");
            }
            if (subImage.x + subImage.width > width) {
                throw new ImageReadException("subimage (x+width) is outside raster");
            }
            if (subImage.y < 0 || subImage.y >= height) {
                throw new ImageReadException("subimage y is outside raster");
            }
            if (subImage.y + subImage.height > height) {
                throw new ImageReadException("subimage (y+height) is outside raster");
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffImageParser.java`
#### Snippet
```java
        int samplesPerPixel = 1;
        final TiffField samplesPerPixelField = directory.findField(
                TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL);
        if (samplesPerPixelField != null) {
            samplesPerPixel = samplesPerPixelField.getIntValue();
        }
        int[] bitsPerSample = { 1 };
        int bitsPerPixel = samplesPerPixel;
        final TiffField bitsPerSampleField = directory.findField(
                TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE);
        if (bitsPerSampleField != null) {
            bitsPerSample = bitsPerSampleField.getIntArrayValue();
            bitsPerPixel = bitsPerSampleField.getIntValueOrArraySum();
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/DataReaderStrips.java`
#### Snippet
```java
            int k = 0;
            int nRows = pixelsPerStrip / width;
            if (y + nRows > yLimit) {
                nRows = yLimit - y;
            }
            final int i0 = y;
            final int i1 = y + nRows;
            x = 0;
            y += nRows;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/DataReaderStrips.java`
#### Snippet
```java
                final long rowsPerStripLong = 0xFFFFffffL & rowsPerStrip;
                final long rowsRemaining = height - (strip * rowsPerStripLong);
                final long rowsInThisStrip = Math.min(rowsRemaining, rowsPerStripLong);
                final long bytesPerRow = (bitsPerPixel * width + 7) / 8;
                final long bytesPerStrip = rowsInThisStrip * bytesPerRow;
                final long pixelsPerStrip = rowsInThisStrip * width;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/DataReaderStrips.java`
#### Snippet
```java
        int xRaster;
        int yRaster;
        int rasterWidth;
        int rasterHeight;
        if (subImage != null) {
            xRaster = subImage.x;
            yRaster = subImage.y;
            rasterWidth = subImage.width;
            rasterHeight = subImage.height;
        } else {
            xRaster = 0;
            yRaster = 0;
            rasterWidth = width;
            rasterHeight = height;
        }

        final float[] rasterDataFloat = new float[rasterWidth * rasterHeight * samplesPerPixel];

        // the legacy code is optimized to the reading of whole
        // strips (except for the last strip in the image, which can
        // be a partial).  So create a working image with compatible
        // dimensions and read that.  Later on, the working image
        // will be sub-imaged to the proper size.
        // strip0 and strip1 give the indices of the strips containing
        // the first and last rows of pixels in the subimage
        final int strip0 = yRaster / rowsPerStrip;
        final int strip1 = (yRaster + rasterHeight - 1) / rowsPerStrip;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/DataReaderStrips.java`
#### Snippet
```java
            final int yStrip = strip * rowsPerStrip;
            final int rowsRemaining = height - yStrip;
            final int rowsInThisStrip = Math.min(rowsRemaining, rowsPerStrip);
            final int bytesPerRow = (bitsPerPixel * width + 7) / 8;
            final int bytesPerStrip = rowsInThisStrip * bytesPerRow;

            final byte[] compressed = imageData.getImageData(strip).getData();
            final byte[] decompressed = decompress(compressed, compression,
                    bytesPerStrip, width, rowsInThisStrip);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/DataReaderStrips.java`
#### Snippet
```java
        int xRaster;
        int yRaster;
        int rasterWidth;
        int rasterHeight;
        if (subImage != null) {
            xRaster = subImage.x;
            yRaster = subImage.y;
            rasterWidth = subImage.width;
            rasterHeight = subImage.height;
        } else {
            xRaster = 0;
            yRaster = 0;
            rasterWidth = width;
            rasterHeight = height;
        }

        final int[] rasterDataInt = new int[rasterWidth * rasterHeight];

        // the legacy code is optimized to the reading of whole
        // strips (except for the last strip in the image, which can
        // be a partial).  So create a working image with compatible
        // dimensions and read that.  Later on, the working image
        // will be sub-imaged to the proper size.
        // strip0 and strip1 give the indices of the strips containing
        // the first and last rows of pixels in the subimage
        final int strip0 = yRaster / rowsPerStrip;
        final int strip1 = (yRaster + rasterHeight - 1) / rowsPerStrip;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/DataReaderTiled.java`
#### Snippet
```java
        final int bitsPerRow = tileWidth * bitsPerPixel;
        final int bytesPerRow = (bitsPerRow + 7) / 8;
        final int bytesPerTile = bytesPerRow * tileLength;
        int xRaster;
        int yRaster;
        int rasterWidth;
        int rasterHeight;
        if (subImage != null) {
            xRaster = subImage.x;
            yRaster = subImage.y;
            rasterWidth = subImage.width;
            rasterHeight = subImage.height;
        } else {
            xRaster = 0;
            yRaster = 0;
            rasterWidth = width;
            rasterHeight = height;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/DataReaderTiled.java`
#### Snippet
```java
                final int tile = iRow * nColumnsOfTiles + iCol;
                final byte[] compressed = imageData.tiles[tile].getData();
                final byte[] decompressed = decompress(compressed, compression,
                        bytesPerTile, tileWidth, tileLength);
                final int x = iCol * tileWidth;
                final int y = iRow * tileLength;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/ImageDataReader.java`
#### Snippet
```java
                        final int a = bytes[aOffset + j];
                        final int b = bytes[bOffset + j];
                        final int c = bytes[cOffset + j];
                        final int d = bytes[dOffset + j];
                        // Pack the 4 byte components into a single integer
                        // in the byte order used by the TIFF standard
                        samples[index++] = ((a & 0xff) << 24)
                            | ((b & 0xff) << 16)
                            | ((c & 0xff) << 8)
                            | (d & 0xff);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/ImageDataReader.java`
#### Snippet
```java
        int xR0 = xBlock - xRaster;  // xR0, yR0 coordinates relative to
        int yR0 = yBlock - yRaster; // the raster
        int xR1 = xR0 + blockWidth;
        int yR1 = yR0 + blockHeight;
        if (xR0 < 0) {
            xR0 = 0;
        }
        if (yR0 < 0) {
            yR0 = 0;
        }
        if (xR1 > rasterWidth) {
            xR1 = rasterWidth;
        }
        if (yR1 > rasterHeight) {
            yR1 = rasterHeight;
        }

        // Recall that the above logic may have adjusted xR0, xY0 so that
        // they are not necessarily point to the source pixel at xRaster, yRaster
        // we compute xSource = xR0+xRaster.
        //            xOffset = xSource-xBlock
        // since the block cannot be accessed with a negative offset,
        // we check for negatives and adjust xR0, yR0 upward as necessary
        int xB0 = xR0 + xRaster - xBlock;
        int yB0 = yR0 + yRaster - yBlock;
        if (xB0 < 0) {
            xR0 -= xB0;
            xB0 = 0;
        }
        if (yB0 < 0) {
            yR0 -= yB0;
            yB0 = 0;
        }

        int w = xR1 - xR0;
        int h = yR1 - yR0;
        if (w <= 0 || h <= 0) {
            // The call to this method put the block outside the
            // bounds of the raster.  There is nothing to do.  Ideally,
            // this situation never arises, because it would mean that
            // the data was read from the file unnecessarily.
            return;
        }
        // see if the xR1, yR1 would extend past the limits of the block
        if (w > blockWidth) {
            w = blockWidth;
        }
        if (h > blockHeight) {
            h = blockHeight;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/fieldtypes/FieldTypeAscii.java`
#### Snippet
```java
        int stringsAdded = 0;
        strings[0] = ""; // if we have a 0 length string
        int nextStringPos = 0;
        // According to the Exiftool FAQ, http://www.metadataworkinggroup.org
        // specifies that the TIFF ASCII fields are actually UTF-8.
        // Exiftool however allows you to configure the charset used.
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == 0) {
                final String string = new String(bytes, nextStringPos, i
                        - nextStringPos, StandardCharsets.UTF_8);
                strings[stringsAdded++] = string;
                nextStringPos = i + 1;
            }
        }
        if (nextStringPos < bytes.length) {
            // Buggy file, string wasn't null terminated
            final String string = new String(bytes, nextStringPos, bytes.length
                    - nextStringPos, StandardCharsets.UTF_8);
            strings[stringsAdded++] = string;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/photometricinterpreters/floatingpoint/PaletteEntryForRange.java`
#### Snippet
```java
            final float t = (f - v0) / (v1 - v0);
            final int a = (int) (t * (a1 - a0) + a0 + 0.5);
            final int r = (int) (t * (r1 - r0) + r0 + 0.5);
            final int g = (int) (t * (g1 - g0) + g0 + 0.5);
            final int b = (int) (t * (b1 - b0) + b0 + 0.5);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputDirectory.java`
#### Snippet
```java
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.BYTE, values.length,
                bytes);
        add(tiffOutputField);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputDirectory.java`
#### Snippet
```java
        if (tagInfo.length > 0 && tagInfo.length != bytes.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " byte(s), not " + values.length);
        }
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.ASCII, bytes.length,
                bytes);
        add(tiffOutputField);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputDirectory.java`
#### Snippet
```java
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.SHORT,
                values.length, bytes);
        add(tiffOutputField);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputDirectory.java`
#### Snippet
```java
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.LONG, values.length,
                bytes);
        add(tiffOutputField);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputDirectory.java`
#### Snippet
```java
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.RATIONAL,
                values.length, bytes);
        add(tiffOutputField);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputDirectory.java`
#### Snippet
```java
        final byte[] bytes = tagInfo.encodeValue(
                FieldType.ASCII, values, byteOrder);
        if (tagInfo.length > 0 && tagInfo.length != bytes.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " byte(s), not " + values.length);
        }
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.ASCII, bytes.length,
                bytes);
        add(tiffOutputField);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputSet.java`
#### Snippet
```java
            double value = longitude;
            final double longitudeDegrees = (long) value;
            value %= 1;
            value *= 60.0;
            final double longitudeMinutes = (long) value;
            value %= 1;
            value *= 60.0;
            final double longitudeSeconds = value;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/xbm/XbmImageParser.java`
#### Snippet
```java
        final UUID uuid = UUID.randomUUID();
        final StringBuilder stringBuilder = new StringBuilder("a");
        long bits = uuid.getMostSignificantBits();
        // Long.toHexString() breaks for very big numbers
        for (int i = 64 - 8; i >= 0; i -= 8) {
            stringBuilder.append(Integer.toHexString((int) ((bits >> i) & 0xff)));
        }
        bits = uuid.getLeastSignificantBits();
        for (int i = 64 - 8; i >= 0; i -= 8) {
            stringBuilder.append(Integer.toHexString((int) ((bits >> i) & 0xff)));
        }
        return stringBuilder.toString();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/formats/xbm/XbmImageParser.java`
#### Snippet
```java
                    os.write(separator.getBytes(StandardCharsets.US_ASCII));
                    separator = ",";
                    if (written == 12) {
                        os.write("\n  ".getBytes(StandardCharsets.US_ASCII));
                        written = 0;
                    }
                    os.write(toPrettyHex(bitcache).getBytes(StandardCharsets.US_ASCII));
                    bitcache = 0;
                    bitsInCache = 0;
                    ++written;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/palette/ColorSpaceSubset.java`
#### Snippet
```java
        LOGGER.fine("\t" + "rgb: " + Integer.toHexString(rgb) + ", "
                + "red: " + Integer.toHexString(mins[0] << (8 - precision))
                + ", " + Integer.toHexString(maxs[0] << (8 - precision)) + ", "
                + "green: " + Integer.toHexString(mins[1] << (8 - precision))
                + ", " + Integer.toHexString(maxs[1] << (8 - precision)) + ", "
                + "blue: " + Integer.toHexString(mins[2] << (8 - precision))
                + ", " + Integer.toHexString(maxs[2] << (8 - precision)));
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/palette/LongestAxisMedianCut.java`
#### Snippet
```java
        colorCounts.sort(new ColorCountComparator(mode));
        final int countHalf = (int) Math.round((double) colorGroup.totalPoints / 2);
        int oldCount = 0;
        int newCount = 0;
        int medianIndex;
        for (medianIndex = 0; medianIndex < colorCounts.size(); medianIndex++) {
            final ColorCount colorCount = colorCounts.get(medianIndex);

            newCount += colorCount.count;

            if (newCount >= countHalf) {
                break;
            }
            oldCount = newCount;
        }

        if (medianIndex == colorCounts.size() - 1) {
            medianIndex--;
        } else if (medianIndex > 0) {
            final int newDiff = Math.abs(newCount - countHalf);
            final int oldDiff = Math.abs(countHalf - oldCount);
            if (oldDiff < newDiff) {
                medianIndex--;
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/palette/MostPopulatedBoxesMedianCut.java`
#### Snippet
```java
        colorGroups.add(upperGroup);

        final ColorCount medianValue = colorCounts.get(bestMedianIndex);
        int limit;
        switch (bestColorComponent) {
            case ALPHA:
                limit = medianValue.alpha;
                break;
            case RED:
                limit = medianValue.red;
                break;
            case GREEN:
                limit = medianValue.green;
                break;
            case BLUE:
                limit = medianValue.blue;
                break;
            default:
                throw new Error("Bad mode.");
        }
        colorGroup.cut = new ColorGroupCut(lowerGroup, upperGroup, bestColorComponent, limit);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/imaging/palette/LongestAxisMedianCut.java`
#### Snippet
```java
        final ColorCount medianValue = colorCounts.get(medianIndex);
        int limit;
        switch (mode) {
            case ALPHA:
                limit = medianValue.alpha;
                break;
            case RED:
                limit = medianValue.red;
                break;
            case GREEN:
                limit = medianValue.green;
                break;
            case BLUE:
                limit = medianValue.blue;
                break;
            default:
                throw new Error("Bad mode.");
        }
        colorGroup.cut = new ColorGroupCut(less, more, mode, limit);
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

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/commons/imaging/common/bytesource/ByteSourceFile.java`
#### Snippet
```java
    @Override
    public InputStream getInputStream() throws IOException {
        return new BufferedInputStream(new FileInputStream(file));
    }

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
in `src/main/java/org/apache/commons/imaging/formats/tiff/write/TiffOutputSet.java`
#### Snippet
```java
    }

    protected List<TiffOutputItem> getOutputItems(
            final TiffOutputSummary outputSummary) throws ImageWriteException {
        final List<TiffOutputItem> result = new ArrayList<>();
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

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/main/java/org/apache/commons/imaging/formats/psd/PsdImageParser.java`
#### Snippet
```java
//            }
//        } else {
            xmpBlocks.addAll(blocks);
//        }

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

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/commons/imaging/formats/tiff/TiffReader.java`
#### Snippet
```java
            } else {
                final TiffField imageHeight = directory.findField(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH);
                /**
                 * if rows per strip not present then rowsPerStrip is equal to
                 * imageLength or an infinity value;
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/BitInputStream.java`
#### Snippet
```java
        }

        /**
         * Taking default order of the Tiff to be Little Endian and reversing
         * the bytes in the end if its Big Endian.This is done because majority
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/formats/tiff/constants/AdobePhotoshopTagConstants.java`
#### Snippet
```java
 * Adobe Photoshop (R) TIFF Technical Notes
 * <BR>
 * http://partners.adobe.com/public/developer/en/tiff/TIFFphotoshop.pdf
 */
public final class AdobePhotoshopTagConstants {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/formats/tiff/constants/MolecularDynamicsGelTagConstants.java`
#### Snippet
```java
 * Molecular Dynamics GEL file format
 * <BR>
 * http://www.awaresystems.be/imaging/tiff/tifftags/docs/gel.html
 */
public final class MolecularDynamicsGelTagConstants {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/formats/tiff/constants/GdalLibraryTagConstants.java`
#### Snippet
```java
 * GDAL library.
 * <BR>
 * http://www.awaresystems.be/imaging/tiff/tifftags/gdal_metadata.html
 * <BR>
 * http://www.awaresystems.be/imaging/tiff/tifftags/gdal_nodata.html
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/formats/tiff/constants/GdalLibraryTagConstants.java`
#### Snippet
```java
 * http://www.awaresystems.be/imaging/tiff/tifftags/gdal_metadata.html
 * <BR>
 * http://www.awaresystems.be/imaging/tiff/tifftags/gdal_nodata.html
 */
public final class GdalLibraryTagConstants {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/formats/tiff/constants/GeoTiffTagConstants.java`
#### Snippet
```java
 * Geo Tiff.
 * <BR>
 * http://www.remotesensing.org/geotiff/spec/contents.html
 */
public final class GeoTiffTagConstants {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/formats/tiff/constants/AdobePageMaker6TagConstants.java`
#### Snippet
```java
 * Enhancements for Adobe PageMaker(R) 6.0 software
 * <BR>
 * http://partners.adobe.com/public/developer/en/tiff/TIFFPM6.pdf
 */
public final class AdobePageMaker6TagConstants {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/formats/tiff/constants/Rfc2301TagConstants.java`
#### Snippet
```java
 * Also subsumes  "The spirit of TIFF class F"
 * <BR>
 * http://cool.conservation-us.org/bytopic/imaging/std/tiff-f.html
 */
public final class Rfc2301TagConstants {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/formats/tiff/constants/ExifTagConstants.java`
#### Snippet
```java
/**
 * References:
 * http://www.sno.phy.queensu.ca/~phil/exiftool/TagNames/EXIF.html
 * http://tiki-lounge.com/~raf/tiff/fields.html
 * http://www.awaresystems.be/imaging/tiff/tifftags.html
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/formats/tiff/constants/ExifTagConstants.java`
#### Snippet
```java
 * References:
 * http://www.sno.phy.queensu.ca/~phil/exiftool/TagNames/EXIF.html
 * http://tiki-lounge.com/~raf/tiff/fields.html
 * http://www.awaresystems.be/imaging/tiff/tifftags.html
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/formats/tiff/constants/ExifTagConstants.java`
#### Snippet
```java
 * http://www.sno.phy.queensu.ca/~phil/exiftool/TagNames/EXIF.html
 * http://tiki-lounge.com/~raf/tiff/fields.html
 * http://www.awaresystems.be/imaging/tiff/tifftags.html
 *
 * "Stonits": http://www.anyhere.com/gward/pixformat/tiffluv.html
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/formats/tiff/constants/ExifTagConstants.java`
#### Snippet
```java
 * http://www.awaresystems.be/imaging/tiff/tifftags.html
 *
 * "Stonits": http://www.anyhere.com/gward/pixformat/tiffluv.html
 */
public final class ExifTagConstants {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/formats/tiff/constants/DcfTagConstants.java`
#### Snippet
```java
 * Design rule for Camera Filesystem
 * <BR>
 * http://www.exif.org/dcf.PDF
 */
public final class DcfTagConstants {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/formats/tiff/constants/DngTagConstants.java`
#### Snippet
```java
 * Digital Negative (DNG) Specification
 * <BR>
 * http://www.adobe.com/products/dng/pdfs/dng_spec_1_3_0_0.pdf
 */
public final class DngTagConstants {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/formats/tiff/constants/AliasSketchbookProTagConstants.java`
#### Snippet
```java
 * Alias Sketchbook Pro multi-layer TIFF
 * <BR>
 * http://www.awaresystems.be/imaging/tiff/tifftags/docs/alias.html
 */
public final class AliasSketchbookProTagConstants {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/formats/tiff/constants/TiffTagConstants.java`
#### Snippet
```java
 * Tags from the TIFF6 specification.
 * <BR>
 * http://partners.adobe.com/public/developer/en/tiff/TIFF6.pdf
 */
public final class TiffTagConstants {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/formats/jpeg/decoder/Dct.java`
#### Snippet
```java
    /**
     * Fast inverse Dct using AA&N. This is taken from the beautiful
     * http://vsr.finermatik.tu-chemnitz.de/~jan/MPEG/HTML/IDCT.html which gives
     * easy equations and properly explains constants and scaling factors. Terms
     * have been inlined and the negation optimized out of existence.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/formats/tiff/constants/Tiff4TagConstants.java`
#### Snippet
```java
 * Tags in TIFF4 but NOT in TIFF6.
 * <BR>
 * http://cool.conservation-us.org/bytopic/imaging/std/tiff4.html
 */
public final class Tiff4TagConstants {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
    private static final double REF_Z = 108.883;

    /** see: https://en.wikipedia.org/wiki/CIELAB_color_space#From_CIEXYZ_to_CIELAB[10] */
    private static final double XYZ_m = 7.787037; // match in slope. Note commonly seen 7.787 gives worse results

```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
    private static final double REF_X = 95.047; // Observer= 2°, Illuminant= D65

    /** see: https://en.wikipedia.org/wiki/CIELAB_color_space#From_CIEXYZ_to_CIELAB[10] */
    private static final double REF_Y = 100.000;

```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java

    // White reference
    /** see: https://en.wikipedia.org/wiki/CIELAB_color_space#From_CIEXYZ_to_CIELAB[10] */
    private static final double REF_X = 95.047; // Observer= 2°, Illuminant= D65

```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
    private static final double REF_Y = 100.000;

    /** see: https://en.wikipedia.org/wiki/CIELAB_color_space#From_CIEXYZ_to_CIELAB[10] */
    private static final double REF_Z = 108.883;

```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/color/ColorConversions.java`
#### Snippet
```java
    private static final double XYZ_m = 7.787037; // match in slope. Note commonly seen 7.787 gives worse results

    /** see: https://en.wikipedia.org/wiki/CIELAB_color_space#From_CIEXYZ_to_CIELAB[10] */
    private static final double XYZ_t0 = 0.008856;

```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/App14Segment.java`
#### Snippet
```java

/**
 * http://www.aiim.org/documents/standards/PDF-Ref/References/Adobe/5116.DCT_Filter.pdf
 */
public class App14Segment extends AppnSegment {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/imaging/formats/tiff/constants/OceScanjobTagConstants.java`
#### Snippet
```java
 * Oce Scanjob.
 * <BR>
 * http://www.awaresystems.be/imaging/tiff/tifftags/docs/oce.html
 */
public final class OceScanjobTagConstants {
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/DhtSegment.java`
#### Snippet
```java
        // derived properties:
        private final int[] huffSize = new int[16 * 256]; // 0-based
        private final int[] huffCode; // 0-based
        private final int[] minCode = new int[1 + 16]; // 1-based
        private final int[] maxCode = new int[1 + 16]; // 1-based
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/imaging/formats/jpeg/segments/DhtSegment.java`
#### Snippet
```java

        // derived properties:
        private final int[] huffSize = new int[16 * 256]; // 0-based
        private final int[] huffCode; // 0-based
        private final int[] minCode = new int[1 + 16]; // 1-based
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/imaging/formats/png/chunks/PngChunkIccp.java`
#### Snippet
```java
     * Compressed profile data.
     */
    private final byte[] compressedProfile;
    /**
     * Uncompressed profile data.
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/imaging/formats/jpeg/xmp/JpegRewriter.java`
#### Snippet
```java
                return false;
            }
            if (!new IptcParser().isPhotoshopJpegSegment(segmentData)) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/imaging/formats/jpeg/xmp/JpegRewriter.java`
#### Snippet
```java
                return false;
            }
            if (!startsWith(segmentData, JpegConstants.XMP_IDENTIFIER)) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/imaging/formats/jpeg/xmp/JpegRewriter.java`
#### Snippet
```java
                return false;
            }
            if (!startsWith(segmentData, JpegConstants.EXIF_IDENTIFIER_CODE)) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java

        boolean hasAlpha = false;
        if (gce != null && gce.transparency) {
            hasAlpha = true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/imaging/formats/gif/GifImageParser.java`
#### Snippet
```java

        boolean transparent = false;
        if (gce != null && gce.transparency) {
            transparent = true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/imaging/palette/ColorSpaceSubset.java`
#### Snippet
```java
            return false;
        }
        if (maxs[2] < blue) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/imaging/formats/xpm/XpmImageParser.java`
#### Snippet
```java
                final String token = tokens[j];
                boolean isKey = false;
                if (previousKeyIndex < (j - 1)
                        && "m".equals(token)
                        || "g4".equals(token)
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/imaging/color/ColorDin99Lab.java`
#### Snippet
```java
            return false;
        }
        if (Double.compare(that.b99, b99) != 0) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/imaging/color/ColorHsv.java`
#### Snippet
```java
            return false;
        }
        if (Double.compare(colorHsv.V, V) != 0) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/imaging/color/ColorCieLuv.java`
#### Snippet
```java
            return false;
        }
        if (Double.compare(that.v, v) != 0) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/imaging/color/ColorCmy.java`
#### Snippet
```java
            return false;
        }
        if (Double.compare(colorCmy.Y, Y) != 0) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/imaging/color/ColorHunterLab.java`
#### Snippet
```java
            return false;
        }
        if (Double.compare(that.b, b) != 0) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/imaging/palette/ColorGroup.java`
#### Snippet
```java
            return false;
        }
        if (blue < minBlue || blue > maxBlue) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/imaging/color/ColorCieLab.java`
#### Snippet
```java
            return false;
        }
        if (Double.compare(that.b, b) != 0) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/imaging/color/ColorCmyk.java`
#### Snippet
```java
            return false;
        }
        if (Double.compare(colorCmyk.Y, Y) != 0) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/imaging/color/ColorHsl.java`
#### Snippet
```java
            return false;
        }
        if (Double.compare(colorHsl.S, S) != 0) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/imaging/color/ColorXyz.java`
#### Snippet
```java
            return false;
        }
        if (Double.compare(colorXyz.Z, Z) != 0) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/imaging/color/ColorCieLch.java`
#### Snippet
```java
            return false;
        }
        if (Double.compare(that.L, L) != 0) {
            return false;
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

## RuleId[id=IfStatementWithIdenticalBranches]
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/imaging/formats/tiff/datareaders/ImageDataReader.java`
#### Snippet
```java
     * @param result the samples array to populate, must be the same length as
     * bitsPerSample.length
     * @throws IOException
     */
    void getSamplesAsBytes(final BitInputStream bis, final int[] result) throws IOException {
```

## RuleId[id=PointlessBitwiseExpression]
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
`blue << 0` can be replaced with 'blue'
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParserBitFields.java`
#### Snippet
```java
        alpha = (alphaShift >= 0) ? alpha >> alphaShift : alpha << -alphaShift;

        return (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
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
`blue << 0` can be replaced with 'blue'
in `src/main/java/org/apache/commons/imaging/formats/tiff/photometricinterpreters/PhotometricInterpreterBiLevel.java`
#### Snippet
```java

        final int alpha = 0xff;
        final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);

        imageBuilder.setRGB(x, y, rgb);
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
in `src/main/java/org/apache/commons/imaging/formats/bmp/PixelParser.java`
#### Snippet
```java
                | (red << 16)
                | (green << 8)
                | (blue << 0);
    }

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
in `src/main/java/org/apache/commons/imaging/formats/psd/dataparsers/DataParserBitmap.java`
#### Snippet
```java
             | ((0xff & sample) << 16)
             | ((0xff & sample) << 8)
             | ((0xff & sample) << 0);
    }

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
in `src/main/java/org/apache/commons/imaging/formats/tiff/photometricinterpreters/PhotometricInterpreterLogLuv.java`
#### Snippet
```java
        final int blue = Math.min(255, Math.max(0, rgbValues.b));
        final int alpha = 0xff;
        final int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
        imageBuilder.setRGB(x, y, rgb);

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
in `src/main/java/org/apache/commons/imaging/formats/bmp/BmpWriterPalette.java`
#### Snippet
```java
            final int red = 0xff & (rgb >> 16);
            final int green = 0xff & (rgb >> 8);
            final int blue = 0xff & (rgb >> 0);

            bos.write(blue);
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
`(0xff & c4) << 0` can be replaced with '(0xff \& c4)'
in `src/main/java/org/apache/commons/imaging/common/BinaryFunctions.java`
#### Snippet
```java

    public static int charsToQuad(final char c1, final char c2, final char c3, final char c4) {
        return (((0xff & c1) << 24) | ((0xff & c2) << 16) | ((0xff & c3) << 8) | ((0xff & c4) << 0));
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
in `src/main/java/org/apache/commons/imaging/formats/png/ScanExpediter.java`
#### Snippet
```java
             | ((0xff & red)   << 16)
             | ((0xff & green) << 8)
             | ((0xff & blue)  << 0);
    }

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

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/org/apache/commons/imaging/formats/jpeg/iptc/JpegIptcRewriter.java`
#### Snippet
```java
            final JFIFPieceSegment newSegment = new JFIFPieceSegment(JpegConstants.JPEG_APP13_MARKER, segmentBytes);

            newPieces = insertAfterLastAppSegments(newPieces, Arrays.asList(newSegment));
        }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/org/apache/commons/imaging/formats/tiff/constants/AliasSketchbookProTagConstants.java`
#### Snippet
```java

    public static final List<TagInfo> ALL_ALIAS_SKETCHBOOK_PRO_TAGS =
            Collections.unmodifiableList(Arrays.<TagInfo> asList(
                    EXIF_TAG_ALIAS_LAYER_METADATA));

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/org/apache/commons/imaging/formats/tiff/taginfos/TagInfo.java`
#### Snippet
```java

    public TagInfo(final String name, final int tag, final FieldType dataType, final int length) {
        this(name, tag, Arrays.asList(dataType), length,
                TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/org/apache/commons/imaging/formats/tiff/taginfos/TagInfo.java`
#### Snippet
```java
    public TagInfo(final String name, final int tag, final FieldType dataType, final int length,
            final TiffDirectoryType exifDirectory, final boolean isOffset) {
        this(name, tag, Arrays.asList(dataType), length, exifDirectory,
                isOffset);
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/org/apache/commons/imaging/formats/tiff/taginfos/TagInfo.java`
#### Snippet
```java
    public TagInfo(final String name, final int tag, final FieldType dataType, final int length,
            final TiffDirectoryType exifDirectory) {
        this(name, tag, Arrays.asList(dataType), length, exifDirectory);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/org/apache/commons/imaging/formats/tiff/constants/WangTagConstants.java`
#### Snippet
```java

    public static final List<TagInfo> ALL_WANG_TAGS =
            Collections.unmodifiableList(Arrays.<TagInfo> asList(
                    EXIF_TAG_WANG_ANNOTATION ));

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/main/java/org/apache/commons/imaging/formats/tiff/constants/Tiff4TagConstants.java`
#### Snippet
```java

    public static final List<TagInfo> ALL_TIFF_4_TAGS =
            Collections.unmodifiableList(Arrays.<TagInfo> asList(
                    TIFF_TAG_COLOR_RESPONSE_UNIT));

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
The value `null` assigned to `baos` is never used
in `src/main/java/org/apache/commons/imaging/formats/png/PngImageParser.java`
#### Snippet
```java
        final byte[] compressed = baos.toByteArray();

        baos = null;

        TransparencyFilter transparencyFilter = null;
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

## RuleId[id=ConstantValue]
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
Value `hasAlpha` is always 'true'
in `src/main/java/org/apache/commons/imaging/formats/png/PngWriter.java`
#### Snippet
```java

            if (hasAlpha) {
                palette = paletteFactory.makeQuantizedRgbaPalette(src, hasAlpha, maxColors);
                writeChunkPLTE(os, palette);
                writeChunkTRNS(os, palette);
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

