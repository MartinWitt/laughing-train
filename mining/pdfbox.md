# pdfbox 
 
# Bad smells
I found 2831 bad smells with 82 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| OctalLiteral | 1474 | false |
| JavadocDeclaration | 365 | false |
| DefaultAnnotationParam | 191 | false |
| DuplicatedCode | 101 | false |
| UnnecessaryUnicodeEscape | 101 | false |
| UnusedAssignment | 95 | false |
| ConstantValue | 62 | false |
| UnnecessaryModifier | 46 | true |
| DataFlowIssue | 27 | false |
| JavadocLinkAsPlainText | 24 | false |
| EmptyStatementBody | 22 | false |
| JavadocReference | 19 | false |
| TrivialIf | 16 | false |
| IOStreamConstructor | 15 | false |
| FieldCanBeLocal | 14 | false |
| PointlessArithmeticExpression | 13 | false |
| TrivialStringConcatenation | 12 | false |
| SuspiciousNameCombination | 12 | false |
| UnnecessaryToStringCall | 12 | true |
| UNCHECKED_WARNING | 11 | false |
| RedundantCompareCall | 10 | false |
| StaticInitializerReferencesSubClass | 9 | false |
| IfStatementWithIdenticalBranches | 9 | false |
| DanglingJavadoc | 9 | false |
| DuplicateExpressions | 8 | false |
| RedundantTypeArguments | 8 | false |
| MagicConstant | 7 | false |
| UnnecessaryStringEscape | 7 | true |
| RegExpRedundantEscape | 7 | false |
| StringBufferReplaceableByString | 7 | false |
| LongLiteralsEndingWithLowercaseL | 6 | false |
| DuplicateBranchesInSwitch | 6 | false |
| ToArrayCallWithZeroLengthArrayArgument | 5 | true |
| ManualMinMaxCalculation | 5 | false |
| SimplifyStreamApiCallChains | 5 | false |
| UnnecessaryLocalVariable | 5 | true |
| CommentedOutCode | 4 | false |
| Deprecation | 4 | false |
| IgnoreResultOfCall | 4 | false |
| IntegerMultiplicationImplicitCastToLong | 4 | false |
| RegExpSimplifiable | 3 | false |
| UnnecessaryReturn | 3 | true |
| PointlessBitwiseExpression | 3 | false |
| UnnecessaryUnaryMinus | 3 | false |
| StringOperationCanBeSimplified | 3 | false |
| RegExpSingleCharAlternation | 3 | false |
| FieldMayBeFinal | 3 | false |
| ArraysAsListWithZeroOrOneArgument | 3 | false |
| ConditionalBreakInInfiniteLoop | 2 | false |
| FinalStaticMethod | 2 | false |
| SuspiciousInvocationHandlerImplementation | 2 | false |
| SlowListContainsAll | 2 | false |
| StringConcatenationInLoops | 2 | false |
| SwitchStatementWithTooFewBranches | 2 | false |
| ProtectedMemberInFinalClass | 2 | true |
| SuspiciousMethodCalls | 2 | false |
| RedundantCast | 2 | false |
| CaughtExceptionImmediatelyRethrown | 2 | false |
| WrapperTypeMayBePrimitive | 1 | false |
| JavaLangInvokeHandleSignature | 1 | false |
| RefusedBequest | 1 | false |
| FinalMethodInFinalClass | 1 | false |
| SuspiciousListRemoveInLoop | 1 | false |
| ExplicitArrayFilling | 1 | false |
| PointlessNullCheck | 1 | false |
| ManualArrayToCollectionCopy | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| RedundantComparatorComparing | 1 | false |
| RedundantCollectionOperation | 1 | false |
| CatchMayIgnoreException | 1 | false |
| MismatchedJavadocCode | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| SwitchStatementWithConfusingDeclaration | 1 | false |
| SynchronizeOnNonFinalField | 1 | false |
| OptionalUsedAsFieldOrParameterType | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| ExcessiveRangeCheck | 1 | false |
| AutoCloseableResource | 1 | false |
| UnnecessaryContinue | 1 | false |
| CopyConstructorMissesField | 1 | false |
| RedundantFileCreation | 1 | false |
| ThrowableNotThrown | 1 | false |
| IntegerDivisionInFloatingPointContext | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[pieces.size()\]'
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/RecentFiles.java`
#### Snippet
```java
            remainingLength = fullPath.length() - endIndex;
        }
        return pieces.toArray(new String[pieces.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[strings.size()\]'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/PDNameTreeNode.java`
#### Snippet
```java
                    {
                        Set<String> strings = names.keySet();
                        String[] keys = strings.toArray(new String[strings.size()]);
                        String lowerLimit = keys[0];
                        setLowerLimit(lowerLimit);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Point2D.Double\[points.size()\]'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/CloudyBorder.java`
#### Snippet
```java
            0, 0, r, r, points, false);

        return points.toArray(new Point2D.Double[points.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Point2D.Double\[points.size()\]'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/CloudyBorder.java`
#### Snippet
```java
            points.add(points.get(points.size() - 1));
        }
        return points.toArray(new Point2D.Double[points.size()]);
    }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Long\[list.size()\]'
in `pdfbox/src/main/java/org/apache/pdfbox/pdfwriter/COSWriter.java`
#### Snippet
```java
            list.add(count);
        }
        return list.toArray(new Long[list.size()]);
    }
    
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `fontbox/src/main/java/org/apache/fontbox/cff/Type1CharStringParser.java`
#### Snippet
```java
            return;
        }
        Integer operand = (Integer) obj;

        if (operand >= 0 && operand < subrs.size())
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/Standard14Fonts.java`
#### Snippet
```java
        private final String name;

        private FontName(String name)
        {
            this.name = name;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/optionalcontent/PDOptionalContentGroup.java`
#### Snippet
```java
        private final COSName name;

        private RenderState(COSName value)
        {
            this.name = value;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/optionalcontent/PDOptionalContentProperties.java`
#### Snippet
```java
        private final COSName name;

        private BaseState(COSName value)
        {
            this.name = value;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/form/PlainTextFormatter.java`
#### Snippet
```java
        private final int alignment;
        
        private TextAlign(int alignment)
        {
            this.alignment = alignment;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/layout/PlainTextFormatter.java`
#### Snippet
```java
        private final int alignment;
        
        private TextAlign(int alignment)
        {
            this.alignment = alignment;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/pagenavigation/PDTransitionDirection.java`
#### Snippet
```java
    private final int degrees;

    private PDTransitionDirection(int degrees)
    {
        this.degrees = degrees;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `fontbox/src/main/java/org/apache/fontbox/cff/DataInput.java`
#### Snippet
```java
     * @throws IOException if an error occurs during reading
     */
    public byte readByte() throws IOException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `fontbox/src/main/java/org/apache/fontbox/cff/DataInput.java`
#### Snippet
```java
    public byte[] readBytes(int length) throws IOException;

    public int length() throws IOException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `fontbox/src/main/java/org/apache/fontbox/cff/DataInput.java`
#### Snippet
```java
     * @throws IOException if an error occurs during reading
     */
    public int readUnsignedByte() throws IOException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `fontbox/src/main/java/org/apache/fontbox/cff/DataInput.java`
#### Snippet
```java
     * @throws IOException if an error occurs during reading
     */
    public int peekUnsignedByte(int offset) throws IOException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `fontbox/src/main/java/org/apache/fontbox/cff/DataInput.java`
#### Snippet
```java
     * @throws IOException if an error occurs during reading
     */
    public byte[] readBytes(int length) throws IOException;

    public int length() throws IOException;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `fontbox/src/main/java/org/apache/fontbox/cff/DataInput.java`
#### Snippet
```java
     * @throws IOException if the new position ist out of range
     */
    public void setPosition(int position) throws IOException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `fontbox/src/main/java/org/apache/fontbox/cff/DataInput.java`
#### Snippet
```java
     * @throws IOException if an error occurs during reading
     */
    public int getPosition() throws IOException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `fontbox/src/main/java/org/apache/fontbox/cff/DataInput.java`
#### Snippet
```java
     * @throws IOException if an error occurs during reading
     */
    public boolean hasRemaining() throws IOException;

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFCharset.java`
#### Snippet
```java
     * @return GID
     */
    public abstract int getGIDForSID(int sid);

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFCharset.java`
#### Snippet
```java
     * @return GID
     */
    public abstract int getGIDForSID(int sid);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFCharset.java`
#### Snippet
```java
     * @return SID
     */
    public abstract int getSIDForGID(int gid);

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFCharset.java`
#### Snippet
```java
     * @return SID
     */
    public abstract int getSIDForGID(int gid);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFCharset.java`
#### Snippet
```java
     * @param cid CID
     */
    public abstract void addCID(int gid, int cid);

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFCharset.java`
#### Snippet
```java
     * @param cid CID
     */
    public abstract void addCID(int gid, int cid);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFCharset.java`
#### Snippet
```java
     * @return SID
     */
    public abstract int getSID(String name);

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFCharset.java`
#### Snippet
```java
     * @return SID
     */
    public abstract int getSID(String name);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFCharset.java`
#### Snippet
```java
     * @param name the postscript name of the glyph
     */
    public abstract void addSID(int gid, int sid, String name);

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFCharset.java`
#### Snippet
```java
     * @param name the postscript name of the glyph
     */
    public abstract void addSID(int gid, int sid, String name);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFCharset.java`
#### Snippet
```java
     * @return CID
     */
    public abstract int getCIDForGID(int gid);
}

```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFCharset.java`
#### Snippet
```java
     * @return CID
     */
    public abstract int getCIDForGID(int gid);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFCharset.java`
#### Snippet
```java
     * @return GID
     */
    public abstract int getGIDForCID(int cid);

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFCharset.java`
#### Snippet
```java
     * @return GID
     */
    public abstract int getGIDForCID(int cid);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFCharset.java`
#### Snippet
```java
     * @return PostScript glyph name
     */
    public abstract String getNameForGID(int gid);

    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFCharset.java`
#### Snippet
```java
     * @return PostScript glyph name
     */
    public abstract String getNameForGID(int gid);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFCharset.java`
#### Snippet
```java
     * @return true for CID fonts
     */
    public abstract boolean isCIDFont();
    
    /**
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFCharset.java`
#### Snippet
```java
     * @return true for CID fonts
     */
    public abstract boolean isCIDFont();
    
    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `fontbox/src/main/java/org/apache/fontbox/cff/FDSelect.java`
#### Snippet
```java
     * @return the font dictionary index of the given GID
     */
    public abstract int getFDIndex(int gid);
}
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `fontbox/src/main/java/org/apache/fontbox/cff/FDSelect.java`
#### Snippet
```java
     * @return the font dictionary index of the given GID
     */
    public abstract int getFDIndex(int gid);
}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `fontbox/src/main/java/org/apache/fontbox/cff/CharStringCommand.java`
#### Snippet
```java
        final Key key;

        private Type1KeyWord(Key key)
        {
            this.key = key;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `fontbox/src/main/java/org/apache/fontbox/cff/CharStringCommand.java`
#### Snippet
```java
        private final int hashValue;

        private Key(int b0)
        {
            hashValue = b0;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `fontbox/src/main/java/org/apache/fontbox/cff/CharStringCommand.java`
#### Snippet
```java
        final Key key;

        private Type2KeyWord(Key key)
        {
            this.key = key;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `fontbox/src/main/java/org/apache/fontbox/cff/CharStringCommand.java`
#### Snippet
```java
        }

        private Key(int b0, int b1)
        {
            hashValue = (b0 << 4) + b1;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `fontbox/src/main/java/org/apache/fontbox/ttf/model/Language.java`
#### Snippet
```java
    private final String[] scriptNames;

    private Language(String[] scriptNames)
    {
        this.scriptNames = scriptNames;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `io/src/main/java/org/apache/pdfbox/io/RandomAccessStreamCache.java`
#### Snippet
```java

    @FunctionalInterface
    public interface StreamCacheCreateFunction
    {
        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `io/src/main/java/org/apache/pdfbox/io/RandomAccessStreamCache.java`
#### Snippet
```java
     * @throws IOException if something went wrong
     */
    public abstract RandomAccess createBuffer() throws IOException;

}
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `io/src/main/java/org/apache/pdfbox/io/RandomAccessStreamCache.java`
#### Snippet
```java
     * @throws IOException if something went wrong
     */
    public abstract RandomAccess createBuffer() throws IOException;

}
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `xmpbox/src/main/java/org/apache/xmpbox/type/Types.java`
#### Snippet
```java
    private final Class<? extends AbstractField> clz;

    private Types(boolean s, Types b, Class<? extends AbstractField> c)
    {
        this.simple = s;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `xmpbox/src/main/java/org/apache/xmpbox/type/Cardinality.java`
#### Snippet
```java
    private final boolean array;

    private Cardinality(boolean a)
    {
        this.array = a;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `preflight/src/main/java/org/apache/pdfbox/preflight/Format.java`
#### Snippet
```java
    private final String fname;

    private Format(String name)
    {
        this.fname = name;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `preflight/src/main/java/org/apache/pdfbox/preflight/graphic/ColorSpaces.java`
#### Snippet
```java
    private final String label;

    private ColorSpaces(String _label)
    {
        label = _label;
```

## RuleId[id=ConditionalBreakInInfiniteLoop]
### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/COSParser.java`
#### Snippet
```java
        
        // Xref tables can have multiple sections. Each starts with a starting object id and a count.
        while(true)
        {
            String currentLine = readLine();
```

### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `preflight/src/main/java/org/apache/pdfbox/preflight/parser/PreflightParser.java`
#### Snippet
```java

        // Xref tables can have multiple sections. Each starts with a starting object id and a count.
        while (true)
        {
            // just after the xref<EOL> there are an integer
```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`selectedIndexInLine - 0` can be replaced with 'selectedIndexInLine'
in `debugger/src/main/java/org/apache/pdfbox/debugger/hexviewer/ASCIIPane.java`
#### Snippet
```java
        g.setFont(HexView.BOLD_FONT);
        char[] content = model.getLineChars(selectedLine);
        g.drawChars(content, 0, selectedIndexInLine - 0, x, y);

        g.setColor(HexView.SELECTED_COLOR);
```

### PointlessArithmeticExpression
`selectedIndexInLine-0` can be replaced with 'selectedIndexInLine'
in `debugger/src/main/java/org/apache/pdfbox/debugger/hexviewer/ASCIIPane.java`
#### Snippet
```java

        g.setColor(HexView.SELECTED_COLOR);
        x += g.getFontMetrics().charsWidth(content, 0, selectedIndexInLine-0);
        g.drawChars(content, selectedIndexInLine, 1, x, y);

```

### PointlessArithmeticExpression
`offset + 0` can be replaced with 'offset'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/PDType1Font.java`
#### Snippet
```java
        while (offset > 0)
        {
            if (bytes[offset + 0] == 'e'
                    && bytes[offset + 1] == 'x'
                    && bytes[offset + 2] == 'e'
```

### PointlessArithmeticExpression
`i + 0` can be replaced with 'i'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDHighlightAppearanceHandler.java`
#### Snippet
```java
            // horizontal or vertical
            // if it is diagonal then... uh...
            float delta = Math.max((pathsArray[i + 0] - pathsArray[i + 4]) / 4, 
                                   (pathsArray[i + 1] - pathsArray[i + 5]) / 4);
            maxDelta = Math.max(delta, maxDelta);
```

### PointlessArithmeticExpression
`of + 0` can be replaced with 'of'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDHighlightAppearanceHandler.java`
#### Snippet
```java
                    // note that curves won't appear if outside of the rectangle
                    float delta = 0;
                    if (Float.compare(pathsArray[of + 0], pathsArray[of + 4]) == 0 &&
                        Float.compare(pathsArray[of + 1], pathsArray[of + 3]) == 0 &&
                        Float.compare(pathsArray[of + 2], pathsArray[of + 6]) == 0 &&
```

### PointlessArithmeticExpression
`of + 0` can be replaced with 'of'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDHighlightAppearanceHandler.java`
#### Snippet
```java
                    }
                    else if (Float.compare(pathsArray[of + 1], pathsArray[of + 5]) == 0 &&
                             Float.compare(pathsArray[of + 0], pathsArray[of + 2]) == 0 &&
                             Float.compare(pathsArray[of + 3], pathsArray[of + 7]) == 0 &&
                             Float.compare(pathsArray[of + 4], pathsArray[of + 6]) == 0)
```

### PointlessArithmeticExpression
`of + 0` can be replaced with 'of'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDHighlightAppearanceHandler.java`
#### Snippet
```java
                    {
                        // vertical highlight
                        delta = (pathsArray[of + 0] - pathsArray[of + 4]) / 4;
                    }

```

### PointlessArithmeticExpression
`of + 0` can be replaced with 'of'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDHighlightAppearanceHandler.java`
#### Snippet
```java
                    frm2CS.moveTo(pathsArray[of + 4], pathsArray[of + 5]);

                    if (Float.compare(pathsArray[of + 0], pathsArray[of + 4]) == 0)
                    {
                        // horizontal highlight
```

### PointlessArithmeticExpression
`of + 0` can be replaced with 'of'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDHighlightAppearanceHandler.java`
#### Snippet
```java
                        // horizontal highlight
                        frm2CS.curveTo(pathsArray[of + 4] - delta, pathsArray[of + 5] + delta,
                                       pathsArray[of + 0] - delta, pathsArray[of + 1] - delta,
                                       pathsArray[of + 0], pathsArray[of + 1]);
                    }
```

### PointlessArithmeticExpression
`of + 0` can be replaced with 'of'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDHighlightAppearanceHandler.java`
#### Snippet
```java
                        frm2CS.curveTo(pathsArray[of + 4] - delta, pathsArray[of + 5] + delta,
                                       pathsArray[of + 0] - delta, pathsArray[of + 1] - delta,
                                       pathsArray[of + 0], pathsArray[of + 1]);
                    }
                    else if (Float.compare(pathsArray[of + 5], pathsArray[of + 1]) == 0)
```

### PointlessArithmeticExpression
`of + 0` can be replaced with 'of'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDHighlightAppearanceHandler.java`
#### Snippet
```java
                        // vertical highlight
                        frm2CS.curveTo(pathsArray[of + 4] + delta, pathsArray[of + 5] + delta,
                                       pathsArray[of + 0] - delta, pathsArray[of + 1] + delta,
                                       pathsArray[of + 0], pathsArray[of + 1]);
                    }
```

### PointlessArithmeticExpression
`of + 0` can be replaced with 'of'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDHighlightAppearanceHandler.java`
#### Snippet
```java
                        frm2CS.curveTo(pathsArray[of + 4] + delta, pathsArray[of + 5] + delta,
                                       pathsArray[of + 0] - delta, pathsArray[of + 1] + delta,
                                       pathsArray[of + 0], pathsArray[of + 1]);
                    }
                    else
```

### PointlessArithmeticExpression
`of + 0` can be replaced with 'of'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDHighlightAppearanceHandler.java`
#### Snippet
```java
                    else
                    {
                        frm2CS.lineTo(pathsArray[of + 0], pathsArray[of + 1]);
                    }
                    frm2CS.lineTo(pathsArray[of + 2], pathsArray[of + 3]);
```

## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: JOptionPane.DEFAULT_OPTION, JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_CANCEL_OPTION, ...
in `debugger/src/main/java/org/apache/pdfbox/debugger/PDFDebugger.java`
#### Snippet
```java
                    };
                    int option = JOptionPane.showOptionDialog(null, panel, "Enter password",
                            JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                            null, options, "");
                    if (option == 0)
```

### MagicConstant
Should be one of: Calendar.JANUARY, Calendar.FEBRUARY, Calendar.MARCH, Calendar.APRIL, Calendar.MAY, ...
in `pdfbox/src/main/java/org/apache/pdfbox/util/DateConverter.java`
#### Snippet
```java
        try 
        {
            dest.set(year, month, day, hour, minute, second);
            // trigger limit tests
            dest.getTimeInMillis();
```

### MagicConstant
Should be one of: BasicStroke.CAP_BUTT, BasicStroke.CAP_ROUND, BasicStroke.CAP_SQUARE
in `pdfbox/src/main/java/org/apache/pdfbox/rendering/PageDrawer.java`
#### Snippet
```java
            miterLimit = 10;
        }
        return new BasicStroke(lineWidth, lineCap, lineJoin,
                               miterLimit, dashArray, phaseStart);
    }
```

### MagicConstant
Should be one of: BasicStroke.JOIN_BEVEL, BasicStroke.JOIN_MITER, BasicStroke.JOIN_ROUND
in `pdfbox/src/main/java/org/apache/pdfbox/rendering/PageDrawer.java`
#### Snippet
```java
            miterLimit = 10;
        }
        return new BasicStroke(lineWidth, lineCap, lineJoin,
                               miterLimit, dashArray, phaseStart);
    }
```

### MagicConstant
Should be one of: Calendar.JANUARY, Calendar.FEBRUARY, Calendar.MARCH, Calendar.APRIL, Calendar.MAY, ...
in `fontbox/src/main/java/org/apache/fontbox/ttf/TTFDataStream.java`
#### Snippet
```java
        long secondsSince1904 = readLong();
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(1904, 0, 1, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        long millisFor1904 = cal.getTimeInMillis();
```

### MagicConstant
Should be one of: Calendar.JANUARY, Calendar.FEBRUARY, Calendar.MARCH, Calendar.APRIL, Calendar.MAY, ...
in `fontbox/src/main/java/org/apache/fontbox/ttf/TTFSubsetter.java`
#### Snippet
```java
        // inverse operation of TTFDataStream.readInternationalDate()
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.set(1904, 0, 1, 0, 0, 0);
        cal.set(Calendar.MILLISECOND, 0);
        long millisFor1904 = cal.getTimeInMillis();
```

### MagicConstant
Should be one of: Calendar.JANUARY, Calendar.FEBRUARY, Calendar.MARCH, Calendar.APRIL, Calendar.MAY, ...
in `xmpbox/src/main/java/org/apache/xmpbox/DateConverter.java`
#### Snippet
```java
                }
                retval.clear();
                retval.set(year, month - 1, day, hour, minute, second);
            }
            catch (NumberFormatException e)
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/PDSimpleFont.java`
#### Snippet
```java
                for (String name : ((DictionaryEncoding)encoding).getDifferences().values())
                {
                    if (".notdef".equals(name))
                    {
                        // skip
```

### EmptyStatementBody
`if` statement has empty body
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/PDStream.java`
#### Snippet
```java
            retval = new PDMetadata((COSStream) mdStream);
        } 
        else if (mdStream instanceof COSNull)
        {
            // null is authorized
```

### EmptyStatementBody
`if` statement has empty body
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/filespecification/PDFileSpecification.java`
#### Snippet
```java
    {
        PDFileSpecification retval = null;
        if( base == null )
        {
            //then simply return null
```

### EmptyStatementBody
`if` statement has empty body
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/shading/Patch.java`
#### Snippet
```java
                    list.add(tmpll);
                }
                if (ll && (overlaps(p2, p1) || overlaps(p2, p3)))
                {
                }
```

### EmptyStatementBody
`if` statement has empty body
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/shading/CoonsPatch.java`
#### Snippet
```java
                    lc2 = getLen(controlPoints[1][0], controlPoints[1][3]);
            // determine the dividing level by the lengths of edges
            if (lc1 > 800 || lc2 > 800)
            {
                // keeps init value 4
```

### EmptyStatementBody
`if` statement has empty body
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/shading/CoonsPatch.java`
#### Snippet
```java
            double ld1 = getLen(controlPoints[2][0], controlPoints[2][3]),
                    ld2 = getLen(controlPoints[3][0], controlPoints[3][3]);
            if (ld1 > 800 || ld2 > 800)
            {
                // keeps init value 4
```

### EmptyStatementBody
`if` statement has empty body
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/shading/TensorPatch.java`
#### Snippet
```java
             otherwise, determine the dividing level by the lengths of edges
             */
            if (isOnSameSideCC(controlPoints[1][1]) || isOnSameSideCC(controlPoints[1][2])
                    || isOnSameSideCC(controlPoints[2][1]) || isOnSameSideCC(controlPoints[2][2]))
            {
```

### EmptyStatementBody
`if` statement has empty body
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/shading/TensorPatch.java`
#### Snippet
```java
                // length's unit is one pixel in device space
                double lc1 = getLen(ctlC1[0], ctlC1[3]), lc2 = getLen(ctlC2[0], ctlC2[3]);
                if (lc1 > 800 || lc2 > 800)
                {
                    // keeps init value 4
```

### EmptyStatementBody
`if` statement has empty body
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/shading/TensorPatch.java`
#### Snippet
```java
        if (isEdgeALine(controlPoints[0]) && isEdgeALine(controlPoints[3]))
        {
            if (isOnSameSideDD(controlPoints[1][1]) || isOnSameSideDD(controlPoints[1][2])
                    || isOnSameSideDD(controlPoints[2][1]) || isOnSameSideDD(controlPoints[2][2]))
            {
```

### EmptyStatementBody
`if` statement has empty body
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/shading/TensorPatch.java`
#### Snippet
```java
                double ld1 = getLen(controlPoints[0][0], controlPoints[0][3]);
                double ld2 = getLen(controlPoints[3][0], controlPoints[3][3]);
                if (ld1 > 800 || ld2 > 800)
                {
                    // keeps init value 4
```

### EmptyStatementBody
`if` statement has empty body
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/documentnavigation/destination/PDDestination.java`
#### Snippet
```java
    {
        PDDestination retval = null;
        if( base == null )
        {
            //this is ok, just return null.
```

### EmptyStatementBody
`else` statement has empty body
in `pdfbox/src/main/java/org/apache/pdfbox/pdfwriter/COSWriter.java`
#### Snippet
```java

            }
            else
            {
                //then we won't write anything, there are a couple cases
```

### EmptyStatementBody
`if` statement has empty body
in `pdfbox/src/main/java/org/apache/pdfbox/contentstream/PDFStreamEngine.java`
#### Snippet
```java
            resources = streamResources;
        }
        else if (resources != null)
        {
            // inherit directly from parent stream, this is not in the PDF spec, but the file from
```

### EmptyStatementBody
`if` statement has empty body
in `pdfbox/src/main/java/org/apache/pdfbox/rendering/PageDrawer.java`
#### Snippet
```java
        {
            transferClip(graphics);
            if (initialClip != null)
            {
                // apply the remembered initial clip, but transform it first
```

### EmptyStatementBody
`if` statement has empty body
in `xmpbox/src/main/java/org/apache/xmpbox/xml/DomXmpParser.java`
#### Snippet
```java
        {
            Attr attr = (Attr) nnm.item(i);
            if (XMLConstants.XMLNS_ATTRIBUTE.equals(attr.getPrefix()))
            {
                // do nothing
```

### EmptyStatementBody
`if` statement has empty body
in `xmpbox/src/main/java/org/apache/xmpbox/xml/DomXmpParser.java`
#### Snippet
```java
            {
                Attr attr = (Attr) nnm.item(i);
                if (XmpConstants.DEFAULT_RDF_PREFIX.equals(attr.getPrefix())
                        && XmpConstants.ABOUT_NAME.equals(attr.getLocalName()))
                {
```

### EmptyStatementBody
`if` statement has empty body
in `xmpbox/src/main/java/org/apache/xmpbox/xml/DomXmpParser.java`
#### Snippet
```java
                    // do nothing
                }
                else if (attr.getPrefix() == null && XmpConstants.ABOUT_NAME.equals(attr.getLocalName()))
                {
                    // do nothing
```

### EmptyStatementBody
`else` statement has empty body
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/PrintURLs.java`
#### Snippet
```java
                                y = pageSize.getHeight() - y;
                            }
                            else
                            {
                                // do nothing
```

### EmptyStatementBody
`while` statement has empty body
in `examples/src/main/java/org/apache/pdfbox/examples/signature/TSAClient.java`
#### Snippet
```java
        digest.reset();
        DigestInputStream dis = new DigestInputStream(content, digest);
        while (dis.read() != -1)
        {
            // do nothing
```

### EmptyStatementBody
`while` statement has empty body
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
        try (DigestInputStream dis = new DigestInputStream(signedContentAsStream, md))
        {
            while (dis.read() != -1)
            {
                // do nothing
```

### EmptyStatementBody
`while` statement has empty body
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
                                    try (DigestInputStream dis = new DigestInputStream(signedContentAsStream, md))
                                    {
                                        while (dis.read() != -1)                                        
                                        {
                                            // do nothing
```

### EmptyStatementBody
`if` statement has empty body
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/ResourcesValidationProcess.java`
#### Snippet
```java
    {
        PreflightPath vPath = ctx.getValidationPath();
        if (vPath.isEmpty())
        {
        }
```

## RuleId[id=JavaLangInvokeHandleSignature]
### JavaLangInvokeHandleSignature
Cannot resolve method 'invokeCleaner'
in `io/src/main/java/org/apache/pdfbox/io/IOUtils.java`
#### Snippet
```java
                // first check if Unsafe has the right method, otherwise we can give up
                // without doing any security critical stuff:
                final MethodHandle unmapper = lookup.findVirtual(unsafeClass, "invokeCleaner",
                        methodType(void.class, ByteBuffer.class));
                // fetch the unsafe instance and bind it to the virtual MH:
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `pdfbox/src/main/java/org/apache/pdfbox/util/DateConverter.java`
#### Snippet
```java
        
        tzHours = parseTimeField(text, where, 2, -999);
        skipOptionals(text, where, "\': ");
        tzMin = parseTimeField(text, where, 2, 0);
        skipOptionals(text, where, "\' "); 
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `pdfbox/src/main/java/org/apache/pdfbox/util/DateConverter.java`
#### Snippet
```java
        skipOptionals(text, where, "\': ");
        tzMin = parseTimeField(text, where, 2, 0);
        skipOptionals(text, where, "\' "); 
        
        if (tzHours != -999) 
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/PublicKeySecurityHandler.java`
#### Snippet
```java
            extraInfo.append(" vs. cert ");
            extraInfo.append(certSerial);
            extraInfo.append(" issuer: rid \'");
            extraInfo.append(ktRid.getIssuer());
            extraInfo.append("\' vs. cert \'");
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/PublicKeySecurityHandler.java`
#### Snippet
```java
            extraInfo.append(" issuer: rid \'");
            extraInfo.append(ktRid.getIssuer());
            extraInfo.append("\' vs. cert \'");
            extraInfo.append(materialCert == null ? "null" : materialCert.getIssuer());
            extraInfo.append("\' ");
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/PublicKeySecurityHandler.java`
#### Snippet
```java
            extraInfo.append(" issuer: rid \'");
            extraInfo.append(ktRid.getIssuer());
            extraInfo.append("\' vs. cert \'");
            extraInfo.append(materialCert == null ? "null" : materialCert.getIssuer());
            extraInfo.append("\' ");
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/PublicKeySecurityHandler.java`
#### Snippet
```java
            extraInfo.append("\' vs. cert \'");
            extraInfo.append(materialCert == null ? "null" : materialCert.getIssuer());
            extraInfo.append("\' ");
        }
    }
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `xmpbox/src/main/java/org/apache/xmpbox/xml/DomXmpParser.java`
#### Snippet
```java
        {
            String token = tokens.nextToken();
            if (!token.endsWith("\"") && !token.endsWith("\'"))
            {
                throw new XmpParsingException(ErrorType.XpacketBadStart, "Cannot understand PI data part : '" + token
```

## RuleId[id=StaticInitializerReferencesSubClass]
### StaticInitializerReferencesSubClass
Referencing subclass PDImmutableRectangle from superclass PDRectangle initializer might lead to class loading deadlock
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/PDRectangle.java`
#### Snippet
```java
    /** An immutable rectangle the size of A5 Paper. */
    @SuppressWarnings("java:S2390")
    public static final PDRectangle A5 = new PDImmutableRectangle(148 * POINTS_PER_MM, 210 * POINTS_PER_MM);

    /**  An immutable rectangle the size of A6 Paper. */
```

### StaticInitializerReferencesSubClass
Referencing subclass PDImmutableRectangle from superclass PDRectangle initializer might lead to class loading deadlock
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/PDRectangle.java`
#### Snippet
```java
    /** An immutable rectangle the size of A1 Paper. */
    @SuppressWarnings("java:S2390")
    public static final PDRectangle A1 = new PDImmutableRectangle(594 * POINTS_PER_MM, 841 * POINTS_PER_MM);

    /**  An immutable rectangle the size of A2 Paper. */
```

### StaticInitializerReferencesSubClass
Referencing subclass PDImmutableRectangle from superclass PDRectangle initializer might lead to class loading deadlock
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/PDRectangle.java`
#### Snippet
```java
    /**  An immutable rectangle the size of A0 Paper. */
    @SuppressWarnings("java:S2390")
    public static final PDRectangle A0 = new PDImmutableRectangle(841 * POINTS_PER_MM, 1189 * POINTS_PER_MM);

    /** An immutable rectangle the size of A1 Paper. */
```

### StaticInitializerReferencesSubClass
Referencing subclass PDImmutableRectangle from superclass PDRectangle initializer might lead to class loading deadlock
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/PDRectangle.java`
#### Snippet
```java
    /** An immutable rectangle the size of U.S. Letter, 8.5" x 11". */
    @SuppressWarnings("java:S2390") // see also https://jira.sonarsource.com/browse/SONARJAVA-3580
    public static final PDRectangle LETTER = new PDImmutableRectangle(8.5f * POINTS_PER_INCH,
                                                             11f *POINTS_PER_INCH);
    /**  An immutable rectangle the size of U.S. Legal, 8.5" x 14". */
```

### StaticInitializerReferencesSubClass
Referencing subclass PDImmutableRectangle from superclass PDRectangle initializer might lead to class loading deadlock
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/PDRectangle.java`
#### Snippet
```java
    /** An immutable rectangle the size of A3 Paper.  */
    @SuppressWarnings("java:S2390")
    public static final PDRectangle A3 = new PDImmutableRectangle(297 * POINTS_PER_MM, 420 * POINTS_PER_MM);

    /**  An immutable rectangle the size of A4 Paper. */
```

### StaticInitializerReferencesSubClass
Referencing subclass PDImmutableRectangle from superclass PDRectangle initializer might lead to class loading deadlock
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/PDRectangle.java`
#### Snippet
```java
    /**  An immutable rectangle the size of A2 Paper. */
    @SuppressWarnings("java:S2390")
    public static final PDRectangle A2 = new PDImmutableRectangle(420 * POINTS_PER_MM, 594 * POINTS_PER_MM);

    /** An immutable rectangle the size of A3 Paper.  */
```

### StaticInitializerReferencesSubClass
Referencing subclass PDImmutableRectangle from superclass PDRectangle initializer might lead to class loading deadlock
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/PDRectangle.java`
#### Snippet
```java
    /**  An immutable rectangle the size of A4 Paper. */
    @SuppressWarnings("java:S2390")
    public static final PDRectangle A4 = new PDImmutableRectangle(210 * POINTS_PER_MM, 297 * POINTS_PER_MM);

    /** An immutable rectangle the size of A5 Paper. */
```

### StaticInitializerReferencesSubClass
Referencing subclass PDImmutableRectangle from superclass PDRectangle initializer might lead to class loading deadlock
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/PDRectangle.java`
#### Snippet
```java
    /**  An immutable rectangle the size of A6 Paper. */
    @SuppressWarnings("java:S2390")
    public static final PDRectangle A6 = new PDImmutableRectangle(105 * POINTS_PER_MM, 148 * POINTS_PER_MM);

    private final COSArray rectArray;
```

### StaticInitializerReferencesSubClass
Referencing subclass PDImmutableRectangle from superclass PDRectangle initializer might lead to class loading deadlock
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/PDRectangle.java`
#### Snippet
```java
    /**  An immutable rectangle the size of U.S. Legal, 8.5" x 14". */
    @SuppressWarnings("java:S2390")
    public static final PDRectangle LEGAL = new PDImmutableRectangle(8.5f * POINTS_PER_INCH,
                                                            14f * POINTS_PER_INCH);
    /**  An immutable rectangle the size of A0 Paper. */
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (15 lines)
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/DictionaryEncoding.java`
#### Snippet
```java
/*
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
```

### CommentedOutCode
Commented out code (10 lines)
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/PDAnnotationWidget.java`
#### Snippet
```java

    // TODO where to get acroForm from?
    // public PDField getParent() throws IOException
    // {
    // COSBase parent = this.getCOSObject().getDictionaryObject(COSName.PARENT);
```

### CommentedOutCode
Commented out code (2 lines)
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFParser.java`
#### Snippet
```java

        // TODO almost certainly erroneous - CIDFonts do not have a top-level private dict
        // font.addValueToPrivateDict("defaultWidthX", 1000);
        // font.addValueToPrivateDict("nominalWidthX", 0);

```

### CommentedOutCode
Commented out code (4 lines)
in `examples/src/main/java/org/apache/pdfbox/examples/printing/Printing.java`
#### Snippet
```java
            // choose your printing method:
            print(document);
            //printWithAttributes(document);
            //printWithDialog(document);
            //printWithDialogAndAttributes(document);
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/function/type4/InstructionSequenceBuilder.java`
#### Snippet
```java
{
    private static final Pattern INTEGER_PATTERN = Pattern.compile("[\\+\\-]?\\d+");
    private static final Pattern REAL_PATTERN = Pattern.compile("[\\-]?\\d*\\.\\d*([Ee]\\-?\\d+)?");

    private final InstructionSequence mainSequence = new InstructionSequence();
```

### RegExpRedundantEscape
Redundant character escape `\\+` in RegExp
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/function/type4/InstructionSequenceBuilder.java`
#### Snippet
```java
public final class InstructionSequenceBuilder extends Parser.AbstractSyntaxHandler
{
    private static final Pattern INTEGER_PATTERN = Pattern.compile("[\\+\\-]?\\d+");
    private static final Pattern REAL_PATTERN = Pattern.compile("[\\-]?\\d*\\.\\d*([Ee]\\-?\\d+)?");

```

### RegExpRedundantEscape
Redundant character escape `\\:` in RegExp
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDFreeTextAppearanceHandler.java`
#### Snippet
```java

    private static final Pattern COLOR_PATTERN =
            Pattern.compile(".*color\\:\\s*\\#([0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]).*");

    private float fontSize = 10;
```

### RegExpRedundantEscape
Redundant character escape `\\#` in RegExp
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDFreeTextAppearanceHandler.java`
#### Snippet
```java

    private static final Pattern COLOR_PATTERN =
            Pattern.compile(".*color\\:\\s*\\#([0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]).*");

    private float fontSize = 10;
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `xmpbox/src/main/java/org/apache/xmpbox/DateConverter.java`
#### Snippet
```java
        // Pattern to test for a time zone string
        Pattern timeZonePattern = Pattern.compile(
                    "[\\d-]*T?[\\d-\\.]([A-Z]{1,4})$|(.*\\d*)([A-Z][a-z]+\\/[A-Z][a-z]+)$"
                );
        Matcher timeZoneMatcher = timeZonePattern.matcher(dateString);
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `xmpbox/src/main/java/org/apache/xmpbox/DateConverter.java`
#### Snippet
```java
        // Pattern to test for a time zone string
        Pattern timeZonePattern = Pattern.compile(
                    "[\\d-]*T?[\\d-\\.]([A-Z]{1,4})$|(.*\\d*)([A-Z][a-z]+\\/[A-Z][a-z]+)$"
                );
        Matcher timeZoneMatcher = timeZonePattern.matcher(dateString);
```

### RegExpRedundantEscape
Redundant character escape `\\+` in RegExp
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/SynchronizedMetaDataValidation.java`
#### Snippet
```java
        {
            String date = ((COSString) item).getString();
            if (date.matches("D:\\d{4}(\\d{2}(\\d{2}(\\d{2}(\\d{2}(\\d{2}([\\+\\-Z](\\d{2}'\\d{2}')?)?)?)?)?)?)?"))
            {
                return true;
```

## RuleId[id=LongLiteralsEndingWithLowercaseL]
### LongLiteralsEndingWithLowercaseL
'long' literal `0xD800l` ends with lowercase 'l'
in `fontbox/src/main/java/org/apache/fontbox/ttf/CmapSubtable.java`
#### Snippet
```java
    private static final Log LOG = LogFactory.getLog(CmapSubtable.class);

    private static final long LEAD_OFFSET = 0xD800l - (0x10000 >> 10);
    private static final long SURROGATE_OFFSET = 0x10000l - (0xD800 << 10) - 0xDC00;

```

### LongLiteralsEndingWithLowercaseL
'long' literal `0x10000l` ends with lowercase 'l'
in `fontbox/src/main/java/org/apache/fontbox/ttf/CmapSubtable.java`
#### Snippet
```java

    private static final long LEAD_OFFSET = 0xD800l - (0x10000 >> 10);
    private static final long SURROGATE_OFFSET = 0x10000l - (0xD800 << 10) - 0xDC00;

    private int platformId;
```

### LongLiteralsEndingWithLowercaseL
'long' literal `4l` ends with lowercase 'l'
in `fontbox/src/main/java/org/apache/fontbox/ttf/TTFSubsetter.java`
#### Snippet
```java
                {
                    // copy width and lsb
                    offset = glyphId * 4l;
                    lastOffset = copyBytes(is, bos, offset, lastOffset, 4);
                }
```

### LongLiteralsEndingWithLowercaseL
'long' literal `4l` ends with lowercase 'l'
in `fontbox/src/main/java/org/apache/fontbox/ttf/TTFSubsetter.java`
#### Snippet
```java
                        // to all later glyphs
                        needLastGidWidth = false;
                        offset = lastgid * 4l;
                        lastOffset = copyBytes(is, bos, offset, lastOffset, 2);

```

### LongLiteralsEndingWithLowercaseL
'long' literal `4l` ends with lowercase 'l'
in `fontbox/src/main/java/org/apache/fontbox/ttf/TTFSubsetter.java`
#### Snippet
```java

                    // copy lsb only, as we are beyond numOfHMetrics
                    offset = h.getNumberOfHMetrics() * 4l + (glyphId - h.getNumberOfHMetrics()) * 2l;
                    lastOffset = copyBytes(is, bos, offset, lastOffset, 2);
                }
```

### LongLiteralsEndingWithLowercaseL
'long' literal `2l` ends with lowercase 'l'
in `fontbox/src/main/java/org/apache/fontbox/ttf/TTFSubsetter.java`
#### Snippet
```java

                    // copy lsb only, as we are beyond numOfHMetrics
                    offset = h.getNumberOfHMetrics() * 4l + (glyphId - h.getNumberOfHMetrics()) * 2l;
                    lastOffset = copyBytes(is, bos, offset, lastOffset, 2);
                }
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `pdfbox/src/main/java/org/apache/pdfbox/util/Matrix.java`
#### Snippet
```java
     */
    @Override
    public Matrix clone()
    {
        return new Matrix(single.clone());
```

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `pdfbox/src/main/java/org/apache/pdfbox/cos/COSObjectKey.java`
#### Snippet
```java
     * @return the internal hash for the given values
     */
    public static final long computeInternalHash(long num, int gen)
    {
        return num << NUMBER_OFFSET | (gen & GENERATION_MASK);
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/FontInfo.java`
#### Snippet
```java
        switch (usWeightClass)
        {
            case -1: return 0;
            case 0: return 0;
            case 100: return 2;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/FontInfo.java`
#### Snippet
```java
        {
            case -1: return 0;
            case 0: return 0;
            case 100: return 2;
            case 200: return 3;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/image/CCITTFactory.java`
#### Snippet
```java
                    }
                    case 324:
                    {
                        if (count == 1)
                        {
                            dataoffset = val;
                        }
                        break;
                    }
                    case 325:
                    {
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/image/CCITTFactory.java`
#### Snippet
```java
                    }
                    case 325:
                    {
                        if (count == 1)
                        {
                            datalength = val;
                        }
                        break;
                    }
                    default:
                    {
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/BaseParser.java`
#### Snippet
```java
                    case '(':
                    case '\\':
                        out.write(next);
                        break;
                    case ASCII_LF:
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `preflight/src/main/java/org/apache/pdfbox/preflight/utils/FilterHelper.java`
#### Snippet
```java
        {
        case PDF_A1A:
            isAuthorizedFilterInPDFA(context, filter);
            break;

```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\\-]` can be simplified to '\\-'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/function/type4/InstructionSequenceBuilder.java`
#### Snippet
```java
{
    private static final Pattern INTEGER_PATTERN = Pattern.compile("[\\+\\-]?\\d+");
    private static final Pattern REAL_PATTERN = Pattern.compile("[\\-]?\\d*\\.\\d*([Ee]\\-?\\d+)?");

    private final InstructionSequence mainSequence = new InstructionSequence();
```

### RegExpSimplifiable
`[Z]` can be simplified to 'Z'
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/SynchronizedMetaDataValidation.java`
#### Snippet
```java
    private boolean hasTimeZone(Object date)
    {
        final String datePattern = "^D:.*[Z]$|^D:.*[+-].*|^\\d{4}.*T.*Z(\\d{2}:\\d{2}){0,1}$|^\\d{4}.*T.*[+-]\\d{2}.*$";
        if (date instanceof Calendar)
        {
```

### RegExpSimplifiable
`{0,1}` can be simplified to '?'
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/SynchronizedMetaDataValidation.java`
#### Snippet
```java
    private boolean hasTimeZone(Object date)
    {
        final String datePattern = "^D:.*[Z]$|^D:.*[+-].*|^\\d{4}.*T.*Z(\\d{2}:\\d{2}){0,1}$|^\\d{4}.*T.*[+-]\\d{2}.*$";
        if (date instanceof Calendar)
        {
```

## RuleId[id=OctalLiteral]
### OctalLiteral
Octal integer `0101`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
     */
    private static final Object[][] SYMBOL_ENCODING_TABLE = {
        {0101, "Alpha"},
        {0102, "Beta"},
        {0103, "Chi"},
```

### OctalLiteral
Octal integer `0102`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
    private static final Object[][] SYMBOL_ENCODING_TABLE = {
        {0101, "Alpha"},
        {0102, "Beta"},
        {0103, "Chi"},
        {0104, "Delta"},
```

### OctalLiteral
Octal integer `0103`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0101, "Alpha"},
        {0102, "Beta"},
        {0103, "Chi"},
        {0104, "Delta"},
        {0105, "Epsilon"},
```

### OctalLiteral
Octal integer `0104`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0102, "Beta"},
        {0103, "Chi"},
        {0104, "Delta"},
        {0105, "Epsilon"},
        {0110, "Eta"},
```

### OctalLiteral
Octal integer `0105`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0103, "Chi"},
        {0104, "Delta"},
        {0105, "Epsilon"},
        {0110, "Eta"},
        {0240, "Euro"},
```

### OctalLiteral
Octal integer `0110`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0104, "Delta"},
        {0105, "Epsilon"},
        {0110, "Eta"},
        {0240, "Euro"},
        {0107, "Gamma"},
```

### OctalLiteral
Octal integer `0240`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0105, "Epsilon"},
        {0110, "Eta"},
        {0240, "Euro"},
        {0107, "Gamma"},
        {0301, "Ifraktur"},
```

### OctalLiteral
Octal integer `0107`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0110, "Eta"},
        {0240, "Euro"},
        {0107, "Gamma"},
        {0301, "Ifraktur"},
        {0111, "Iota"},
```

### OctalLiteral
Octal integer `0301`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0240, "Euro"},
        {0107, "Gamma"},
        {0301, "Ifraktur"},
        {0111, "Iota"},
        {0113, "Kappa"},
```

### OctalLiteral
Octal integer `0111`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0107, "Gamma"},
        {0301, "Ifraktur"},
        {0111, "Iota"},
        {0113, "Kappa"},
        {0114, "Lambda"},
```

### OctalLiteral
Octal integer `0113`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0301, "Ifraktur"},
        {0111, "Iota"},
        {0113, "Kappa"},
        {0114, "Lambda"},
        {0115, "Mu"},
```

### OctalLiteral
Octal integer `0114`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0111, "Iota"},
        {0113, "Kappa"},
        {0114, "Lambda"},
        {0115, "Mu"},
        {0116, "Nu"},
```

### OctalLiteral
Octal integer `0115`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0113, "Kappa"},
        {0114, "Lambda"},
        {0115, "Mu"},
        {0116, "Nu"},
        {0127, "Omega"},
```

### OctalLiteral
Octal integer `0116`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0114, "Lambda"},
        {0115, "Mu"},
        {0116, "Nu"},
        {0127, "Omega"},
        {0117, "Omicron"},
```

### OctalLiteral
Octal integer `0127`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0115, "Mu"},
        {0116, "Nu"},
        {0127, "Omega"},
        {0117, "Omicron"},
        {0106, "Phi"},
```

### OctalLiteral
Octal integer `0117`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0116, "Nu"},
        {0127, "Omega"},
        {0117, "Omicron"},
        {0106, "Phi"},
        {0120, "Pi"},
```

### OctalLiteral
Octal integer `0106`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0127, "Omega"},
        {0117, "Omicron"},
        {0106, "Phi"},
        {0120, "Pi"},
        {0131, "Psi"},
```

### OctalLiteral
Octal integer `0120`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0117, "Omicron"},
        {0106, "Phi"},
        {0120, "Pi"},
        {0131, "Psi"},
        {0302, "Rfraktur"},
```

### OctalLiteral
Octal integer `0131`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0106, "Phi"},
        {0120, "Pi"},
        {0131, "Psi"},
        {0302, "Rfraktur"},
        {0122, "Rho"},
```

### OctalLiteral
Octal integer `0302`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0120, "Pi"},
        {0131, "Psi"},
        {0302, "Rfraktur"},
        {0122, "Rho"},
        {0123, "Sigma"},
```

### OctalLiteral
Octal integer `0122`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0131, "Psi"},
        {0302, "Rfraktur"},
        {0122, "Rho"},
        {0123, "Sigma"},
        {0124, "Tau"},
```

### OctalLiteral
Octal integer `0123`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0302, "Rfraktur"},
        {0122, "Rho"},
        {0123, "Sigma"},
        {0124, "Tau"},
        {0121, "Theta"},
```

### OctalLiteral
Octal integer `0124`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0122, "Rho"},
        {0123, "Sigma"},
        {0124, "Tau"},
        {0121, "Theta"},
        {0125, "Upsilon"},
```

### OctalLiteral
Octal integer `0121`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0123, "Sigma"},
        {0124, "Tau"},
        {0121, "Theta"},
        {0125, "Upsilon"},
        {0241, "Upsilon1"},
```

### OctalLiteral
Octal integer `0125`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0124, "Tau"},
        {0121, "Theta"},
        {0125, "Upsilon"},
        {0241, "Upsilon1"},
        {0130, "Xi"},
```

### OctalLiteral
Octal integer `0241`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0121, "Theta"},
        {0125, "Upsilon"},
        {0241, "Upsilon1"},
        {0130, "Xi"},
        {0132, "Zeta"},
```

### OctalLiteral
Octal integer `0130`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0125, "Upsilon"},
        {0241, "Upsilon1"},
        {0130, "Xi"},
        {0132, "Zeta"},
        {0300, "aleph"},
```

### OctalLiteral
Octal integer `0132`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0241, "Upsilon1"},
        {0130, "Xi"},
        {0132, "Zeta"},
        {0300, "aleph"},
        {0141, "alpha"},
```

### OctalLiteral
Octal integer `0300`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0130, "Xi"},
        {0132, "Zeta"},
        {0300, "aleph"},
        {0141, "alpha"},
        {0046, "ampersand"},
```

### OctalLiteral
Octal integer `0141`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0132, "Zeta"},
        {0300, "aleph"},
        {0141, "alpha"},
        {0046, "ampersand"},
        {0320, "angle"},
```

### OctalLiteral
Octal integer `0046`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0300, "aleph"},
        {0141, "alpha"},
        {0046, "ampersand"},
        {0320, "angle"},
        {0341, "angleleft"},
```

### OctalLiteral
Octal integer `0320`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0141, "alpha"},
        {0046, "ampersand"},
        {0320, "angle"},
        {0341, "angleleft"},
        {0361, "angleright"},
```

### OctalLiteral
Octal integer `0341`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0046, "ampersand"},
        {0320, "angle"},
        {0341, "angleleft"},
        {0361, "angleright"},
        {0273, "approxequal"},
```

### OctalLiteral
Octal integer `0361`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0320, "angle"},
        {0341, "angleleft"},
        {0361, "angleright"},
        {0273, "approxequal"},
        {0253, "arrowboth"},
```

### OctalLiteral
Octal integer `0273`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0341, "angleleft"},
        {0361, "angleright"},
        {0273, "approxequal"},
        {0253, "arrowboth"},
        {0333, "arrowdblboth"},
```

### OctalLiteral
Octal integer `0253`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0361, "angleright"},
        {0273, "approxequal"},
        {0253, "arrowboth"},
        {0333, "arrowdblboth"},
        {0337, "arrowdbldown"},
```

### OctalLiteral
Octal integer `0333`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0273, "approxequal"},
        {0253, "arrowboth"},
        {0333, "arrowdblboth"},
        {0337, "arrowdbldown"},
        {0334, "arrowdblleft"},
```

### OctalLiteral
Octal integer `0337`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0253, "arrowboth"},
        {0333, "arrowdblboth"},
        {0337, "arrowdbldown"},
        {0334, "arrowdblleft"},
        {0336, "arrowdblright"},
```

### OctalLiteral
Octal integer `0334`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0333, "arrowdblboth"},
        {0337, "arrowdbldown"},
        {0334, "arrowdblleft"},
        {0336, "arrowdblright"},
        {0335, "arrowdblup"},
```

### OctalLiteral
Octal integer `0336`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0337, "arrowdbldown"},
        {0334, "arrowdblleft"},
        {0336, "arrowdblright"},
        {0335, "arrowdblup"},
        {0257, "arrowdown"},
```

### OctalLiteral
Octal integer `0335`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0334, "arrowdblleft"},
        {0336, "arrowdblright"},
        {0335, "arrowdblup"},
        {0257, "arrowdown"},
        {0276, "arrowhorizex"},
```

### OctalLiteral
Octal integer `0257`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0336, "arrowdblright"},
        {0335, "arrowdblup"},
        {0257, "arrowdown"},
        {0276, "arrowhorizex"},
        {0254, "arrowleft"},
```

### OctalLiteral
Octal integer `0276`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0335, "arrowdblup"},
        {0257, "arrowdown"},
        {0276, "arrowhorizex"},
        {0254, "arrowleft"},
        {0256, "arrowright"},
```

### OctalLiteral
Octal integer `0254`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0257, "arrowdown"},
        {0276, "arrowhorizex"},
        {0254, "arrowleft"},
        {0256, "arrowright"},
        {0255, "arrowup"},
```

### OctalLiteral
Octal integer `0256`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0276, "arrowhorizex"},
        {0254, "arrowleft"},
        {0256, "arrowright"},
        {0255, "arrowup"},
        {0275, "arrowvertex"},
```

### OctalLiteral
Octal integer `0255`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0254, "arrowleft"},
        {0256, "arrowright"},
        {0255, "arrowup"},
        {0275, "arrowvertex"},
        {0052, "asteriskmath"},
```

### OctalLiteral
Octal integer `0275`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0256, "arrowright"},
        {0255, "arrowup"},
        {0275, "arrowvertex"},
        {0052, "asteriskmath"},
        {0174, "bar"},
```

### OctalLiteral
Octal integer `0052`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0255, "arrowup"},
        {0275, "arrowvertex"},
        {0052, "asteriskmath"},
        {0174, "bar"},
        {0142, "beta"},
```

### OctalLiteral
Octal integer `0174`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0275, "arrowvertex"},
        {0052, "asteriskmath"},
        {0174, "bar"},
        {0142, "beta"},
        {0173, "braceleft"},
```

### OctalLiteral
Octal integer `0142`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0052, "asteriskmath"},
        {0174, "bar"},
        {0142, "beta"},
        {0173, "braceleft"},
        {0175, "braceright"},
```

### OctalLiteral
Octal integer `0173`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0174, "bar"},
        {0142, "beta"},
        {0173, "braceleft"},
        {0175, "braceright"},
        {0354, "bracelefttp"},
```

### OctalLiteral
Octal integer `0175`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0142, "beta"},
        {0173, "braceleft"},
        {0175, "braceright"},
        {0354, "bracelefttp"},
        {0355, "braceleftmid"},
```

### OctalLiteral
Octal integer `0354`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0173, "braceleft"},
        {0175, "braceright"},
        {0354, "bracelefttp"},
        {0355, "braceleftmid"},
        {0356, "braceleftbt"},
```

### OctalLiteral
Octal integer `0355`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0175, "braceright"},
        {0354, "bracelefttp"},
        {0355, "braceleftmid"},
        {0356, "braceleftbt"},
        {0374, "bracerighttp"},
```

### OctalLiteral
Octal integer `0356`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0354, "bracelefttp"},
        {0355, "braceleftmid"},
        {0356, "braceleftbt"},
        {0374, "bracerighttp"},
        {0375, "bracerightmid"},
```

### OctalLiteral
Octal integer `0374`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0355, "braceleftmid"},
        {0356, "braceleftbt"},
        {0374, "bracerighttp"},
        {0375, "bracerightmid"},
        {0376, "bracerightbt"},
```

### OctalLiteral
Octal integer `0375`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0356, "braceleftbt"},
        {0374, "bracerighttp"},
        {0375, "bracerightmid"},
        {0376, "bracerightbt"},
        {0357, "braceex"},
```

### OctalLiteral
Octal integer `0376`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0374, "bracerighttp"},
        {0375, "bracerightmid"},
        {0376, "bracerightbt"},
        {0357, "braceex"},
        {0133, "bracketleft"},
```

### OctalLiteral
Octal integer `0357`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0375, "bracerightmid"},
        {0376, "bracerightbt"},
        {0357, "braceex"},
        {0133, "bracketleft"},
        {0135, "bracketright"},
```

### OctalLiteral
Octal integer `0133`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0376, "bracerightbt"},
        {0357, "braceex"},
        {0133, "bracketleft"},
        {0135, "bracketright"},
        {0351, "bracketlefttp"},
```

### OctalLiteral
Octal integer `0135`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0357, "braceex"},
        {0133, "bracketleft"},
        {0135, "bracketright"},
        {0351, "bracketlefttp"},
        {0352, "bracketleftex"},
```

### OctalLiteral
Octal integer `0351`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0133, "bracketleft"},
        {0135, "bracketright"},
        {0351, "bracketlefttp"},
        {0352, "bracketleftex"},
        {0353, "bracketleftbt"},
```

### OctalLiteral
Octal integer `0352`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0135, "bracketright"},
        {0351, "bracketlefttp"},
        {0352, "bracketleftex"},
        {0353, "bracketleftbt"},
        {0371, "bracketrighttp"},
```

### OctalLiteral
Octal integer `0353`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0351, "bracketlefttp"},
        {0352, "bracketleftex"},
        {0353, "bracketleftbt"},
        {0371, "bracketrighttp"},
        {0372, "bracketrightex"},
```

### OctalLiteral
Octal integer `0371`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0352, "bracketleftex"},
        {0353, "bracketleftbt"},
        {0371, "bracketrighttp"},
        {0372, "bracketrightex"},
        {0373, "bracketrightbt"},
```

### OctalLiteral
Octal integer `0372`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0353, "bracketleftbt"},
        {0371, "bracketrighttp"},
        {0372, "bracketrightex"},
        {0373, "bracketrightbt"},
        {0267, "bullet"},
```

### OctalLiteral
Octal integer `0373`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0371, "bracketrighttp"},
        {0372, "bracketrightex"},
        {0373, "bracketrightbt"},
        {0267, "bullet"},
        {0277, "carriagereturn"},
```

### OctalLiteral
Octal integer `0267`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0372, "bracketrightex"},
        {0373, "bracketrightbt"},
        {0267, "bullet"},
        {0277, "carriagereturn"},
        {0143, "chi"},
```

### OctalLiteral
Octal integer `0277`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0373, "bracketrightbt"},
        {0267, "bullet"},
        {0277, "carriagereturn"},
        {0143, "chi"},
        {0304, "circlemultiply"},
```

### OctalLiteral
Octal integer `0143`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0267, "bullet"},
        {0277, "carriagereturn"},
        {0143, "chi"},
        {0304, "circlemultiply"},
        {0305, "circleplus"},
```

### OctalLiteral
Octal integer `0304`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0277, "carriagereturn"},
        {0143, "chi"},
        {0304, "circlemultiply"},
        {0305, "circleplus"},
        {0247, "club"},
```

### OctalLiteral
Octal integer `0305`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0143, "chi"},
        {0304, "circlemultiply"},
        {0305, "circleplus"},
        {0247, "club"},
        {0072, "colon"},
```

### OctalLiteral
Octal integer `0247`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0304, "circlemultiply"},
        {0305, "circleplus"},
        {0247, "club"},
        {0072, "colon"},
        {0054, "comma"},
```

### OctalLiteral
Octal integer `0072`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0305, "circleplus"},
        {0247, "club"},
        {0072, "colon"},
        {0054, "comma"},
        {0100, "congruent"},
```

### OctalLiteral
Octal integer `0054`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0247, "club"},
        {0072, "colon"},
        {0054, "comma"},
        {0100, "congruent"},
        {0343, "copyrightsans"},
```

### OctalLiteral
Octal integer `0100`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0072, "colon"},
        {0054, "comma"},
        {0100, "congruent"},
        {0343, "copyrightsans"},
        {0323, "copyrightserif"},
```

### OctalLiteral
Octal integer `0343`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0054, "comma"},
        {0100, "congruent"},
        {0343, "copyrightsans"},
        {0323, "copyrightserif"},
        {0260, "degree"},
```

### OctalLiteral
Octal integer `0323`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0100, "congruent"},
        {0343, "copyrightsans"},
        {0323, "copyrightserif"},
        {0260, "degree"},
        {0144, "delta"},
```

### OctalLiteral
Octal integer `0260`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0343, "copyrightsans"},
        {0323, "copyrightserif"},
        {0260, "degree"},
        {0144, "delta"},
        {0250, "diamond"},
```

### OctalLiteral
Octal integer `0144`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0323, "copyrightserif"},
        {0260, "degree"},
        {0144, "delta"},
        {0250, "diamond"},
        {0270, "divide"},
```

### OctalLiteral
Octal integer `0250`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0260, "degree"},
        {0144, "delta"},
        {0250, "diamond"},
        {0270, "divide"},
        {0327, "dotmath"},
```

### OctalLiteral
Octal integer `0270`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0144, "delta"},
        {0250, "diamond"},
        {0270, "divide"},
        {0327, "dotmath"},
        {0070, "eight"},
```

### OctalLiteral
Octal integer `0327`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0250, "diamond"},
        {0270, "divide"},
        {0327, "dotmath"},
        {0070, "eight"},
        {0316, "element"},
```

### OctalLiteral
Octal integer `0070`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0270, "divide"},
        {0327, "dotmath"},
        {0070, "eight"},
        {0316, "element"},
        {0274, "ellipsis"},
```

### OctalLiteral
Octal integer `0316`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0327, "dotmath"},
        {0070, "eight"},
        {0316, "element"},
        {0274, "ellipsis"},
        {0306, "emptyset"},
```

### OctalLiteral
Octal integer `0274`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0070, "eight"},
        {0316, "element"},
        {0274, "ellipsis"},
        {0306, "emptyset"},
        {0145, "epsilon"},
```

### OctalLiteral
Octal integer `0306`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0316, "element"},
        {0274, "ellipsis"},
        {0306, "emptyset"},
        {0145, "epsilon"},
        {0075, "equal"},
```

### OctalLiteral
Octal integer `0145`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0274, "ellipsis"},
        {0306, "emptyset"},
        {0145, "epsilon"},
        {0075, "equal"},
        {0272, "equivalence"},
```

### OctalLiteral
Octal integer `0075`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0306, "emptyset"},
        {0145, "epsilon"},
        {0075, "equal"},
        {0272, "equivalence"},
        {0150, "eta"},
```

### OctalLiteral
Octal integer `0272`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0145, "epsilon"},
        {0075, "equal"},
        {0272, "equivalence"},
        {0150, "eta"},
        {0041, "exclam"},
```

### OctalLiteral
Octal integer `0150`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0075, "equal"},
        {0272, "equivalence"},
        {0150, "eta"},
        {0041, "exclam"},
        {0044, "existential"},
```

### OctalLiteral
Octal integer `0041`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0272, "equivalence"},
        {0150, "eta"},
        {0041, "exclam"},
        {0044, "existential"},
        {0065, "five"},
```

### OctalLiteral
Octal integer `0044`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0150, "eta"},
        {0041, "exclam"},
        {0044, "existential"},
        {0065, "five"},
        {0246, "florin"},
```

### OctalLiteral
Octal integer `0065`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0041, "exclam"},
        {0044, "existential"},
        {0065, "five"},
        {0246, "florin"},
        {0064, "four"},
```

### OctalLiteral
Octal integer `0246`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0044, "existential"},
        {0065, "five"},
        {0246, "florin"},
        {0064, "four"},
        {0244, "fraction"},
```

### OctalLiteral
Octal integer `0064`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0065, "five"},
        {0246, "florin"},
        {0064, "four"},
        {0244, "fraction"},
        {0147, "gamma"},
```

### OctalLiteral
Octal integer `0244`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0246, "florin"},
        {0064, "four"},
        {0244, "fraction"},
        {0147, "gamma"},
        {0321, "gradient"},
```

### OctalLiteral
Octal integer `0147`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0064, "four"},
        {0244, "fraction"},
        {0147, "gamma"},
        {0321, "gradient"},
        {0076, "greater"},
```

### OctalLiteral
Octal integer `0321`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0244, "fraction"},
        {0147, "gamma"},
        {0321, "gradient"},
        {0076, "greater"},
        {0263, "greaterequal"},
```

### OctalLiteral
Octal integer `0076`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0147, "gamma"},
        {0321, "gradient"},
        {0076, "greater"},
        {0263, "greaterequal"},
        {0251, "heart"},
```

### OctalLiteral
Octal integer `0263`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0321, "gradient"},
        {0076, "greater"},
        {0263, "greaterequal"},
        {0251, "heart"},
        {0245, "infinity"},
```

### OctalLiteral
Octal integer `0251`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0076, "greater"},
        {0263, "greaterequal"},
        {0251, "heart"},
        {0245, "infinity"},
        {0362, "integral"},
```

### OctalLiteral
Octal integer `0245`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0263, "greaterequal"},
        {0251, "heart"},
        {0245, "infinity"},
        {0362, "integral"},
        {0363, "integraltp"},
```

### OctalLiteral
Octal integer `0362`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0251, "heart"},
        {0245, "infinity"},
        {0362, "integral"},
        {0363, "integraltp"},
        {0364, "integralex"},
```

### OctalLiteral
Octal integer `0363`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0245, "infinity"},
        {0362, "integral"},
        {0363, "integraltp"},
        {0364, "integralex"},
        {0365, "integralbt"},
```

### OctalLiteral
Octal integer `0364`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0362, "integral"},
        {0363, "integraltp"},
        {0364, "integralex"},
        {0365, "integralbt"},
        {0307, "intersection"},
```

### OctalLiteral
Octal integer `0365`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0363, "integraltp"},
        {0364, "integralex"},
        {0365, "integralbt"},
        {0307, "intersection"},
        {0151, "iota"},
```

### OctalLiteral
Octal integer `0307`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0364, "integralex"},
        {0365, "integralbt"},
        {0307, "intersection"},
        {0151, "iota"},
        {0153, "kappa"},
```

### OctalLiteral
Octal integer `0151`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0365, "integralbt"},
        {0307, "intersection"},
        {0151, "iota"},
        {0153, "kappa"},
        {0154, "lambda"},
```

### OctalLiteral
Octal integer `0153`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0307, "intersection"},
        {0151, "iota"},
        {0153, "kappa"},
        {0154, "lambda"},
        {0074, "less"},
```

### OctalLiteral
Octal integer `0154`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0151, "iota"},
        {0153, "kappa"},
        {0154, "lambda"},
        {0074, "less"},
        {0243, "lessequal"},
```

### OctalLiteral
Octal integer `0074`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0153, "kappa"},
        {0154, "lambda"},
        {0074, "less"},
        {0243, "lessequal"},
        {0331, "logicaland"},
```

### OctalLiteral
Octal integer `0243`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0154, "lambda"},
        {0074, "less"},
        {0243, "lessequal"},
        {0331, "logicaland"},
        {0330, "logicalnot"},
```

### OctalLiteral
Octal integer `0331`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0074, "less"},
        {0243, "lessequal"},
        {0331, "logicaland"},
        {0330, "logicalnot"},
        {0332, "logicalor"},
```

### OctalLiteral
Octal integer `0330`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0243, "lessequal"},
        {0331, "logicaland"},
        {0330, "logicalnot"},
        {0332, "logicalor"},
        {0340, "lozenge"},
```

### OctalLiteral
Octal integer `0332`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0331, "logicaland"},
        {0330, "logicalnot"},
        {0332, "logicalor"},
        {0340, "lozenge"},
        {0055, "minus"},
```

### OctalLiteral
Octal integer `0340`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0330, "logicalnot"},
        {0332, "logicalor"},
        {0340, "lozenge"},
        {0055, "minus"},
        {0242, "minute"},
```

### OctalLiteral
Octal integer `0055`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0332, "logicalor"},
        {0340, "lozenge"},
        {0055, "minus"},
        {0242, "minute"},
        {0155, "mu"},
```

### OctalLiteral
Octal integer `0242`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0340, "lozenge"},
        {0055, "minus"},
        {0242, "minute"},
        {0155, "mu"},
        {0264, "multiply"},
```

### OctalLiteral
Octal integer `0155`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0055, "minus"},
        {0242, "minute"},
        {0155, "mu"},
        {0264, "multiply"},
        {0071, "nine"},
```

### OctalLiteral
Octal integer `0264`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0242, "minute"},
        {0155, "mu"},
        {0264, "multiply"},
        {0071, "nine"},
        {0317, "notelement"},
```

### OctalLiteral
Octal integer `0071`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0155, "mu"},
        {0264, "multiply"},
        {0071, "nine"},
        {0317, "notelement"},
        {0271, "notequal"},
```

### OctalLiteral
Octal integer `0317`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0264, "multiply"},
        {0071, "nine"},
        {0317, "notelement"},
        {0271, "notequal"},
        {0313, "notsubset"},
```

### OctalLiteral
Octal integer `0271`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0071, "nine"},
        {0317, "notelement"},
        {0271, "notequal"},
        {0313, "notsubset"},
        {0156, "nu"},
```

### OctalLiteral
Octal integer `0313`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0317, "notelement"},
        {0271, "notequal"},
        {0313, "notsubset"},
        {0156, "nu"},
        {0043, "numbersign"},
```

### OctalLiteral
Octal integer `0156`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0271, "notequal"},
        {0313, "notsubset"},
        {0156, "nu"},
        {0043, "numbersign"},
        {0167, "omega"},
```

### OctalLiteral
Octal integer `040`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
     */
    private static final Object[][] ZAPFDINGBATS_ENCODING_TABLE = {
        {040, "space"},
        {041, "a1"},
        {042, "a2"},
```

### OctalLiteral
Octal integer `0043`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0313, "notsubset"},
        {0156, "nu"},
        {0043, "numbersign"},
        {0167, "omega"},
        {0166, "omega1"},
```

### OctalLiteral
Octal integer `041`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
    private static final Object[][] ZAPFDINGBATS_ENCODING_TABLE = {
        {040, "space"},
        {041, "a1"},
        {042, "a2"},
        {043, "a202"},
```

### OctalLiteral
Octal integer `0167`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0156, "nu"},
        {0043, "numbersign"},
        {0167, "omega"},
        {0166, "omega1"},
        {0157, "omicron"},
```

### OctalLiteral
Octal integer `042`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {040, "space"},
        {041, "a1"},
        {042, "a2"},
        {043, "a202"},
        {044, "a3"},
```

### OctalLiteral
Octal integer `0166`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0043, "numbersign"},
        {0167, "omega"},
        {0166, "omega1"},
        {0157, "omicron"},
        {0061, "one"},
```

### OctalLiteral
Octal integer `043`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {041, "a1"},
        {042, "a2"},
        {043, "a202"},
        {044, "a3"},
        {045, "a4"},
```

### OctalLiteral
Octal integer `0157`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0167, "omega"},
        {0166, "omega1"},
        {0157, "omicron"},
        {0061, "one"},
        {0050, "parenleft"},
```

### OctalLiteral
Octal integer `044`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {042, "a2"},
        {043, "a202"},
        {044, "a3"},
        {045, "a4"},
        {046, "a5"},
```

### OctalLiteral
Octal integer `0061`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0166, "omega1"},
        {0157, "omicron"},
        {0061, "one"},
        {0050, "parenleft"},
        {0051, "parenright"},
```

### OctalLiteral
Octal integer `045`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {043, "a202"},
        {044, "a3"},
        {045, "a4"},
        {046, "a5"},
        {047, "a119"},
```

### OctalLiteral
Octal integer `0050`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0157, "omicron"},
        {0061, "one"},
        {0050, "parenleft"},
        {0051, "parenright"},
        {0346, "parenlefttp"},
```

### OctalLiteral
Octal integer `046`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {044, "a3"},
        {045, "a4"},
        {046, "a5"},
        {047, "a119"},
        {050, "a118"},
```

### OctalLiteral
Octal integer `0051`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0061, "one"},
        {0050, "parenleft"},
        {0051, "parenright"},
        {0346, "parenlefttp"},
        {0347, "parenleftex"},
```

### OctalLiteral
Octal integer `0346`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0050, "parenleft"},
        {0051, "parenright"},
        {0346, "parenlefttp"},
        {0347, "parenleftex"},
        {0350, "parenleftbt"},
```

### OctalLiteral
Octal integer `0347`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0051, "parenright"},
        {0346, "parenlefttp"},
        {0347, "parenleftex"},
        {0350, "parenleftbt"},
        {0366, "parenrighttp"},
```

### OctalLiteral
Octal integer `0350`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0346, "parenlefttp"},
        {0347, "parenleftex"},
        {0350, "parenleftbt"},
        {0366, "parenrighttp"},
        {0367, "parenrightex"},
```

### OctalLiteral
Octal integer `0366`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0347, "parenleftex"},
        {0350, "parenleftbt"},
        {0366, "parenrighttp"},
        {0367, "parenrightex"},
        {0370, "parenrightbt"},
```

### OctalLiteral
Octal integer `0367`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0350, "parenleftbt"},
        {0366, "parenrighttp"},
        {0367, "parenrightex"},
        {0370, "parenrightbt"},
        {0266, "partialdiff"},
```

### OctalLiteral
Octal integer `0370`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0366, "parenrighttp"},
        {0367, "parenrightex"},
        {0370, "parenrightbt"},
        {0266, "partialdiff"},
        {0045, "percent"},
```

### OctalLiteral
Octal integer `0266`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0367, "parenrightex"},
        {0370, "parenrightbt"},
        {0266, "partialdiff"},
        {0045, "percent"},
        {0056, "period"},
```

### OctalLiteral
Octal integer `0045`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0370, "parenrightbt"},
        {0266, "partialdiff"},
        {0045, "percent"},
        {0056, "period"},
        {0136, "perpendicular"},
```

### OctalLiteral
Octal integer `0056`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0266, "partialdiff"},
        {0045, "percent"},
        {0056, "period"},
        {0136, "perpendicular"},
        {0146, "phi"},
```

### OctalLiteral
Octal integer `047`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {045, "a4"},
        {046, "a5"},
        {047, "a119"},
        {050, "a118"},
        {051, "a117"},
```

### OctalLiteral
Octal integer `050`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {046, "a5"},
        {047, "a119"},
        {050, "a118"},
        {051, "a117"},
        {052, "a11"},
```

### OctalLiteral
Octal integer `051`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {047, "a119"},
        {050, "a118"},
        {051, "a117"},
        {052, "a11"},
        {053, "a12"},
```

### OctalLiteral
Octal integer `052`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {050, "a118"},
        {051, "a117"},
        {052, "a11"},
        {053, "a12"},
        {054, "a13"},
```

### OctalLiteral
Octal integer `053`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {051, "a117"},
        {052, "a11"},
        {053, "a12"},
        {054, "a13"},
        {055, "a14"},
```

### OctalLiteral
Octal integer `054`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {052, "a11"},
        {053, "a12"},
        {054, "a13"},
        {055, "a14"},
        {056, "a15"},
```

### OctalLiteral
Octal integer `055`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {053, "a12"},
        {054, "a13"},
        {055, "a14"},
        {056, "a15"},
        {057, "a16"},
```

### OctalLiteral
Octal integer `056`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {054, "a13"},
        {055, "a14"},
        {056, "a15"},
        {057, "a16"},
        {060, "a105"},
```

### OctalLiteral
Octal integer `057`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {055, "a14"},
        {056, "a15"},
        {057, "a16"},
        {060, "a105"},
        {061, "a17"},
```

### OctalLiteral
Octal integer `0136`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0045, "percent"},
        {0056, "period"},
        {0136, "perpendicular"},
        {0146, "phi"},
        {0152, "phi1"},
```

### OctalLiteral
Octal integer `060`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {056, "a15"},
        {057, "a16"},
        {060, "a105"},
        {061, "a17"},
        {062, "a18"},
```

### OctalLiteral
Octal integer `061`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {057, "a16"},
        {060, "a105"},
        {061, "a17"},
        {062, "a18"},
        {063, "a19"},
```

### OctalLiteral
Octal integer `062`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {060, "a105"},
        {061, "a17"},
        {062, "a18"},
        {063, "a19"},
        {064, "a20"},
```

### OctalLiteral
Octal integer `063`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {061, "a17"},
        {062, "a18"},
        {063, "a19"},
        {064, "a20"},
        {065, "a21"},
```

### OctalLiteral
Octal integer `064`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {062, "a18"},
        {063, "a19"},
        {064, "a20"},
        {065, "a21"},
        {066, "a22"},
```

### OctalLiteral
Octal integer `065`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {063, "a19"},
        {064, "a20"},
        {065, "a21"},
        {066, "a22"},
        {067, "a23"},
```

### OctalLiteral
Octal integer `066`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {064, "a20"},
        {065, "a21"},
        {066, "a22"},
        {067, "a23"},
        {070, "a24"},
```

### OctalLiteral
Octal integer `067`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {065, "a21"},
        {066, "a22"},
        {067, "a23"},
        {070, "a24"},
        {071, "a25"},
```

### OctalLiteral
Octal integer `0146`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0056, "period"},
        {0136, "perpendicular"},
        {0146, "phi"},
        {0152, "phi1"},
        {0160, "pi"},
```

### OctalLiteral
Octal integer `0152`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0136, "perpendicular"},
        {0146, "phi"},
        {0152, "phi1"},
        {0160, "pi"},
        {0053, "plus"},
```

### OctalLiteral
Octal integer `0160`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0146, "phi"},
        {0152, "phi1"},
        {0160, "pi"},
        {0053, "plus"},
        {0261, "plusminus"},
```

### OctalLiteral
Octal integer `070`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {066, "a22"},
        {067, "a23"},
        {070, "a24"},
        {071, "a25"},
        {072, "a26"},
```

### OctalLiteral
Octal integer `0053`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0152, "phi1"},
        {0160, "pi"},
        {0053, "plus"},
        {0261, "plusminus"},
        {0325, "product"},
```

### OctalLiteral
Octal integer `071`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {067, "a23"},
        {070, "a24"},
        {071, "a25"},
        {072, "a26"},
        {073, "a27"},
```

### OctalLiteral
Octal integer `0261`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0160, "pi"},
        {0053, "plus"},
        {0261, "plusminus"},
        {0325, "product"},
        {0314, "propersubset"},
```

### OctalLiteral
Octal integer `072`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {070, "a24"},
        {071, "a25"},
        {072, "a26"},
        {073, "a27"},
        {074, "a28"},
```

### OctalLiteral
Octal integer `0325`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0053, "plus"},
        {0261, "plusminus"},
        {0325, "product"},
        {0314, "propersubset"},
        {0311, "propersuperset"},
```

### OctalLiteral
Octal integer `0314`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0261, "plusminus"},
        {0325, "product"},
        {0314, "propersubset"},
        {0311, "propersuperset"},
        {0265, "proportional"},
```

### OctalLiteral
Octal integer `073`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {071, "a25"},
        {072, "a26"},
        {073, "a27"},
        {074, "a28"},
        {075, "a6"},
```

### OctalLiteral
Octal integer `0311`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0325, "product"},
        {0314, "propersubset"},
        {0311, "propersuperset"},
        {0265, "proportional"},
        {0171, "psi"},
```

### OctalLiteral
Octal integer `0265`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0314, "propersubset"},
        {0311, "propersuperset"},
        {0265, "proportional"},
        {0171, "psi"},
        {0077, "question"},
```

### OctalLiteral
Octal integer `074`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {072, "a26"},
        {073, "a27"},
        {074, "a28"},
        {075, "a6"},
        {076, "a7"},
```

### OctalLiteral
Octal integer `0171`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0311, "propersuperset"},
        {0265, "proportional"},
        {0171, "psi"},
        {0077, "question"},
        {0326, "radical"},
```

### OctalLiteral
Octal integer `0077`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0265, "proportional"},
        {0171, "psi"},
        {0077, "question"},
        {0326, "radical"},
        {0140, "radicalex"},
```

### OctalLiteral
Octal integer `075`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {073, "a27"},
        {074, "a28"},
        {075, "a6"},
        {076, "a7"},
        {077, "a8"},
```

### OctalLiteral
Octal integer `0326`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0171, "psi"},
        {0077, "question"},
        {0326, "radical"},
        {0140, "radicalex"},
        {0315, "reflexsubset"},
```

### OctalLiteral
Octal integer `076`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {074, "a28"},
        {075, "a6"},
        {076, "a7"},
        {077, "a8"},
        {0100, "a9"},
```

### OctalLiteral
Octal integer `0140`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0077, "question"},
        {0326, "radical"},
        {0140, "radicalex"},
        {0315, "reflexsubset"},
        {0312, "reflexsuperset"},
```

### OctalLiteral
Octal integer `0315`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0326, "radical"},
        {0140, "radicalex"},
        {0315, "reflexsubset"},
        {0312, "reflexsuperset"},
        {0342, "registersans"},
```

### OctalLiteral
Octal integer `077`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {075, "a6"},
        {076, "a7"},
        {077, "a8"},
        {0100, "a9"},
        {0101, "a10"},
```

### OctalLiteral
Octal integer `0312`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0140, "radicalex"},
        {0315, "reflexsubset"},
        {0312, "reflexsuperset"},
        {0342, "registersans"},
        {0322, "registerserif"},
```

### OctalLiteral
Octal integer `0100`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {076, "a7"},
        {077, "a8"},
        {0100, "a9"},
        {0101, "a10"},
        {0102, "a29"},
```

### OctalLiteral
Octal integer `0342`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0315, "reflexsubset"},
        {0312, "reflexsuperset"},
        {0342, "registersans"},
        {0322, "registerserif"},
        {0162, "rho"},
```

### OctalLiteral
Octal integer `0322`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0312, "reflexsuperset"},
        {0342, "registersans"},
        {0322, "registerserif"},
        {0162, "rho"},
        {0262, "second"},
```

### OctalLiteral
Octal integer `0162`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0342, "registersans"},
        {0322, "registerserif"},
        {0162, "rho"},
        {0262, "second"},
        {0073, "semicolon"},
```

### OctalLiteral
Octal integer `0262`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0322, "registerserif"},
        {0162, "rho"},
        {0262, "second"},
        {0073, "semicolon"},
        {0067, "seven"},
```

### OctalLiteral
Octal integer `0073`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0162, "rho"},
        {0262, "second"},
        {0073, "semicolon"},
        {0067, "seven"},
        {0163, "sigma"},
```

### OctalLiteral
Octal integer `0067`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0262, "second"},
        {0073, "semicolon"},
        {0067, "seven"},
        {0163, "sigma"},
        {0126, "sigma1"},
```

### OctalLiteral
Octal integer `0163`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0073, "semicolon"},
        {0067, "seven"},
        {0163, "sigma"},
        {0126, "sigma1"},
        {0176, "similar"},
```

### OctalLiteral
Octal integer `0101`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {077, "a8"},
        {0100, "a9"},
        {0101, "a10"},
        {0102, "a29"},
        {0103, "a30"},
```

### OctalLiteral
Octal integer `0102`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0100, "a9"},
        {0101, "a10"},
        {0102, "a29"},
        {0103, "a30"},
        {0104, "a31"},
```

### OctalLiteral
Octal integer `0103`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0101, "a10"},
        {0102, "a29"},
        {0103, "a30"},
        {0104, "a31"},
        {0105, "a32"},
```

### OctalLiteral
Octal integer `0104`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0102, "a29"},
        {0103, "a30"},
        {0104, "a31"},
        {0105, "a32"},
        {0106, "a33"},
```

### OctalLiteral
Octal integer `0105`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0103, "a30"},
        {0104, "a31"},
        {0105, "a32"},
        {0106, "a33"},
        {0107, "a34"},
```

### OctalLiteral
Octal integer `0106`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0104, "a31"},
        {0105, "a32"},
        {0106, "a33"},
        {0107, "a34"},
        {0110, "a35"},
```

### OctalLiteral
Octal integer `0107`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0105, "a32"},
        {0106, "a33"},
        {0107, "a34"},
        {0110, "a35"},
        {0111, "a36"},
```

### OctalLiteral
Octal integer `0110`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0106, "a33"},
        {0107, "a34"},
        {0110, "a35"},
        {0111, "a36"},
        {0112, "a37"},
```

### OctalLiteral
Octal integer `0111`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0107, "a34"},
        {0110, "a35"},
        {0111, "a36"},
        {0112, "a37"},
        {0113, "a38"},
```

### OctalLiteral
Octal integer `0112`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0110, "a35"},
        {0111, "a36"},
        {0112, "a37"},
        {0113, "a38"},
        {0114, "a39"},
```

### OctalLiteral
Octal integer `0126`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0067, "seven"},
        {0163, "sigma"},
        {0126, "sigma1"},
        {0176, "similar"},
        {0066, "six"},
```

### OctalLiteral
Octal integer `0113`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0111, "a36"},
        {0112, "a37"},
        {0113, "a38"},
        {0114, "a39"},
        {0115, "a40"},
```

### OctalLiteral
Octal integer `0114`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0112, "a37"},
        {0113, "a38"},
        {0114, "a39"},
        {0115, "a40"},
        {0116, "a41"},
```

### OctalLiteral
Octal integer `0176`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0163, "sigma"},
        {0126, "sigma1"},
        {0176, "similar"},
        {0066, "six"},
        {0057, "slash"},
```

### OctalLiteral
Octal integer `0066`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0126, "sigma1"},
        {0176, "similar"},
        {0066, "six"},
        {0057, "slash"},
        {0040, "space"},
```

### OctalLiteral
Octal integer `0057`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0176, "similar"},
        {0066, "six"},
        {0057, "slash"},
        {0040, "space"},
        {0252, "spade"},
```

### OctalLiteral
Octal integer `0040`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0066, "six"},
        {0057, "slash"},
        {0040, "space"},
        {0252, "spade"},
        {0047, "suchthat"},
```

### OctalLiteral
Octal integer `0252`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0057, "slash"},
        {0040, "space"},
        {0252, "spade"},
        {0047, "suchthat"},
        {0345, "summation"},
```

### OctalLiteral
Octal integer `0047`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0040, "space"},
        {0252, "spade"},
        {0047, "suchthat"},
        {0345, "summation"},
        {0164, "tau"},
```

### OctalLiteral
Octal integer `0345`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0252, "spade"},
        {0047, "suchthat"},
        {0345, "summation"},
        {0164, "tau"},
        {0134, "therefore"},
```

### OctalLiteral
Octal integer `0164`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0047, "suchthat"},
        {0345, "summation"},
        {0164, "tau"},
        {0134, "therefore"},
        {0161, "theta"},
```

### OctalLiteral
Octal integer `0134`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0345, "summation"},
        {0164, "tau"},
        {0134, "therefore"},
        {0161, "theta"},
        {0112, "theta1"},
```

### OctalLiteral
Octal integer `0161`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0164, "tau"},
        {0134, "therefore"},
        {0161, "theta"},
        {0112, "theta1"},
        {0063, "three"},
```

### OctalLiteral
Octal integer `0112`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0134, "therefore"},
        {0161, "theta"},
        {0112, "theta1"},
        {0063, "three"},
        {0344, "trademarksans"},
```

### OctalLiteral
Octal integer `0063`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0161, "theta"},
        {0112, "theta1"},
        {0063, "three"},
        {0344, "trademarksans"},
        {0324, "trademarkserif"},
```

### OctalLiteral
Octal integer `0344`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0112, "theta1"},
        {0063, "three"},
        {0344, "trademarksans"},
        {0324, "trademarkserif"},
        {0062, "two"},
```

### OctalLiteral
Octal integer `0324`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0063, "three"},
        {0344, "trademarksans"},
        {0324, "trademarkserif"},
        {0062, "two"},
        {0137, "underscore"},
```

### OctalLiteral
Octal integer `0062`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0344, "trademarksans"},
        {0324, "trademarkserif"},
        {0062, "two"},
        {0137, "underscore"},
        {0310, "union"},
```

### OctalLiteral
Octal integer `0137`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0324, "trademarkserif"},
        {0062, "two"},
        {0137, "underscore"},
        {0310, "union"},
        {0042, "universal"},
```

### OctalLiteral
Octal integer `0310`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0062, "two"},
        {0137, "underscore"},
        {0310, "union"},
        {0042, "universal"},
        {0165, "upsilon"},
```

### OctalLiteral
Octal integer `0042`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0137, "underscore"},
        {0310, "union"},
        {0042, "universal"},
        {0165, "upsilon"},
        {0303, "weierstrass"},
```

### OctalLiteral
Octal integer `0165`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0310, "union"},
        {0042, "universal"},
        {0165, "upsilon"},
        {0303, "weierstrass"},
        {0170, "xi"},
```

### OctalLiteral
Octal integer `0303`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0042, "universal"},
        {0165, "upsilon"},
        {0303, "weierstrass"},
        {0170, "xi"},
        {0060, "zero"},
```

### OctalLiteral
Octal integer `0170`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0165, "upsilon"},
        {0303, "weierstrass"},
        {0170, "xi"},
        {0060, "zero"},
        {0172, "zeta"}       
```

### OctalLiteral
Octal integer `0115`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0113, "a38"},
        {0114, "a39"},
        {0115, "a40"},
        {0116, "a41"},
        {0117, "a42"},
```

### OctalLiteral
Octal integer `0116`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0114, "a39"},
        {0115, "a40"},
        {0116, "a41"},
        {0117, "a42"},
        {0120, "a43"},
```

### OctalLiteral
Octal integer `0117`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0115, "a40"},
        {0116, "a41"},
        {0117, "a42"},
        {0120, "a43"},
        {0121, "a44"},
```

### OctalLiteral
Octal integer `0120`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0116, "a41"},
        {0117, "a42"},
        {0120, "a43"},
        {0121, "a44"},
        {0122, "a45"},
```

### OctalLiteral
Octal integer `0121`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0117, "a42"},
        {0120, "a43"},
        {0121, "a44"},
        {0122, "a45"},
        {0123, "a46"},
```

### OctalLiteral
Octal integer `0122`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0120, "a43"},
        {0121, "a44"},
        {0122, "a45"},
        {0123, "a46"},
        {0124, "a47"},
```

### OctalLiteral
Octal integer `0123`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0121, "a44"},
        {0122, "a45"},
        {0123, "a46"},
        {0124, "a47"},
        {0125, "a48"},
```

### OctalLiteral
Octal integer `0124`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0122, "a45"},
        {0123, "a46"},
        {0124, "a47"},
        {0125, "a48"},
        {0126, "a49"},
```

### OctalLiteral
Octal integer `0060`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0303, "weierstrass"},
        {0170, "xi"},
        {0060, "zero"},
        {0172, "zeta"}       
    };
```

### OctalLiteral
Octal integer `0125`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0123, "a46"},
        {0124, "a47"},
        {0125, "a48"},
        {0126, "a49"},
        {0127, "a50"},
```

### OctalLiteral
Octal integer `0172`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/SymbolEncoding.java`
#### Snippet
```java
        {0170, "xi"},
        {0060, "zero"},
        {0172, "zeta"}       
    };
    
```

### OctalLiteral
Octal integer `0126`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0124, "a47"},
        {0125, "a48"},
        {0126, "a49"},
        {0127, "a50"},
        {0130, "a51"},
```

### OctalLiteral
Octal integer `0127`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0125, "a48"},
        {0126, "a49"},
        {0127, "a50"},
        {0130, "a51"},
        {0131, "a52"},
```

### OctalLiteral
Octal integer `0130`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0126, "a49"},
        {0127, "a50"},
        {0130, "a51"},
        {0131, "a52"},
        {0132, "a53"},
```

### OctalLiteral
Octal integer `0131`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0127, "a50"},
        {0130, "a51"},
        {0131, "a52"},
        {0132, "a53"},
        {0133, "a54"},
```

### OctalLiteral
Octal integer `0132`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0130, "a51"},
        {0131, "a52"},
        {0132, "a53"},
        {0133, "a54"},
        {0134, "a55"},
```

### OctalLiteral
Octal integer `0133`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0131, "a52"},
        {0132, "a53"},
        {0133, "a54"},
        {0134, "a55"},
        {0135, "a56"},
```

### OctalLiteral
Octal integer `0134`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0132, "a53"},
        {0133, "a54"},
        {0134, "a55"},
        {0135, "a56"},
        {0136, "a57"},
```

### OctalLiteral
Octal integer `0135`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0133, "a54"},
        {0134, "a55"},
        {0135, "a56"},
        {0136, "a57"},
        {0137, "a58"},
```

### OctalLiteral
Octal integer `0136`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0134, "a55"},
        {0135, "a56"},
        {0136, "a57"},
        {0137, "a58"},
        {0140, "a59"},
```

### OctalLiteral
Octal integer `0137`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0135, "a56"},
        {0136, "a57"},
        {0137, "a58"},
        {0140, "a59"},
        {0141, "a60"},
```

### OctalLiteral
Octal integer `0140`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0136, "a57"},
        {0137, "a58"},
        {0140, "a59"},
        {0141, "a60"},
        {0142, "a61"},
```

### OctalLiteral
Octal integer `0141`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0137, "a58"},
        {0140, "a59"},
        {0141, "a60"},
        {0142, "a61"},
        {0143, "a62"},
```

### OctalLiteral
Octal integer `0142`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0140, "a59"},
        {0141, "a60"},
        {0142, "a61"},
        {0143, "a62"},
        {0144, "a63"},
```

### OctalLiteral
Octal integer `0143`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0141, "a60"},
        {0142, "a61"},
        {0143, "a62"},
        {0144, "a63"},
        {0145, "a64"},
```

### OctalLiteral
Octal integer `0144`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0142, "a61"},
        {0143, "a62"},
        {0144, "a63"},
        {0145, "a64"},
        {0146, "a65"},
```

### OctalLiteral
Octal integer `0145`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0143, "a62"},
        {0144, "a63"},
        {0145, "a64"},
        {0146, "a65"},
        {0147, "a66"},
```

### OctalLiteral
Octal integer `0146`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0144, "a63"},
        {0145, "a64"},
        {0146, "a65"},
        {0147, "a66"},
        {0150, "a67"},
```

### OctalLiteral
Octal integer `0147`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0145, "a64"},
        {0146, "a65"},
        {0147, "a66"},
        {0150, "a67"},
        {0151, "a68"},
```

### OctalLiteral
Octal integer `0150`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0146, "a65"},
        {0147, "a66"},
        {0150, "a67"},
        {0151, "a68"},
        {0152, "a69"},
```

### OctalLiteral
Octal integer `0151`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0147, "a66"},
        {0150, "a67"},
        {0151, "a68"},
        {0152, "a69"},
        {0153, "a70"},
```

### OctalLiteral
Octal integer `0152`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0150, "a67"},
        {0151, "a68"},
        {0152, "a69"},
        {0153, "a70"},
        {0154, "a71"},
```

### OctalLiteral
Octal integer `0153`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0151, "a68"},
        {0152, "a69"},
        {0153, "a70"},
        {0154, "a71"},
        {0155, "a72"},
```

### OctalLiteral
Octal integer `0154`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0152, "a69"},
        {0153, "a70"},
        {0154, "a71"},
        {0155, "a72"},
        {0156, "a73"},
```

### OctalLiteral
Octal integer `0155`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0153, "a70"},
        {0154, "a71"},
        {0155, "a72"},
        {0156, "a73"},
        {0157, "a74"},
```

### OctalLiteral
Octal integer `0156`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0154, "a71"},
        {0155, "a72"},
        {0156, "a73"},
        {0157, "a74"},
        {0160, "a203"},
```

### OctalLiteral
Octal integer `0157`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0155, "a72"},
        {0156, "a73"},
        {0157, "a74"},
        {0160, "a203"},
        {0161, "a75"},
```

### OctalLiteral
Octal integer `0160`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0156, "a73"},
        {0157, "a74"},
        {0160, "a203"},
        {0161, "a75"},
        {0162, "a204"},
```

### OctalLiteral
Octal integer `0161`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0157, "a74"},
        {0160, "a203"},
        {0161, "a75"},
        {0162, "a204"},
        {0163, "a76"},
```

### OctalLiteral
Octal integer `0162`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0160, "a203"},
        {0161, "a75"},
        {0162, "a204"},
        {0163, "a76"},
        {0164, "a77"},
```

### OctalLiteral
Octal integer `0163`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0161, "a75"},
        {0162, "a204"},
        {0163, "a76"},
        {0164, "a77"},
        {0165, "a78"},
```

### OctalLiteral
Octal integer `0164`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0162, "a204"},
        {0163, "a76"},
        {0164, "a77"},
        {0165, "a78"},
        {0166, "a79"},
```

### OctalLiteral
Octal integer `0165`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0163, "a76"},
        {0164, "a77"},
        {0165, "a78"},
        {0166, "a79"},
        {0167, "a81"},
```

### OctalLiteral
Octal integer `0166`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0164, "a77"},
        {0165, "a78"},
        {0166, "a79"},
        {0167, "a81"},
        {0170, "a82"},
```

### OctalLiteral
Octal integer `0167`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0165, "a78"},
        {0166, "a79"},
        {0167, "a81"},
        {0170, "a82"},
        {0171, "a83"},
```

### OctalLiteral
Octal integer `0170`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0166, "a79"},
        {0167, "a81"},
        {0170, "a82"},
        {0171, "a83"},
        {0172, "a84"},
```

### OctalLiteral
Octal integer `0171`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0167, "a81"},
        {0170, "a82"},
        {0171, "a83"},
        {0172, "a84"},
        {0173, "a97"},
```

### OctalLiteral
Octal integer `0172`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0170, "a82"},
        {0171, "a83"},
        {0172, "a84"},
        {0173, "a97"},
        {0174, "a98"},
```

### OctalLiteral
Octal integer `0173`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0171, "a83"},
        {0172, "a84"},
        {0173, "a97"},
        {0174, "a98"},
        {0175, "a99"},
```

### OctalLiteral
Octal integer `0174`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0172, "a84"},
        {0173, "a97"},
        {0174, "a98"},
        {0175, "a99"},
        {0176, "a100"},
```

### OctalLiteral
Octal integer `0175`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0173, "a97"},
        {0174, "a98"},
        {0175, "a99"},
        {0176, "a100"},
        {0241, "a101"},
```

### OctalLiteral
Octal integer `0176`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0174, "a98"},
        {0175, "a99"},
        {0176, "a100"},
        {0241, "a101"},
        {0242, "a102"},
```

### OctalLiteral
Octal integer `0241`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0175, "a99"},
        {0176, "a100"},
        {0241, "a101"},
        {0242, "a102"},
        {0243, "a103"},
```

### OctalLiteral
Octal integer `0242`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0176, "a100"},
        {0241, "a101"},
        {0242, "a102"},
        {0243, "a103"},
        {0244, "a104"},
```

### OctalLiteral
Octal integer `0243`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0241, "a101"},
        {0242, "a102"},
        {0243, "a103"},
        {0244, "a104"},
        {0245, "a106"},
```

### OctalLiteral
Octal integer `0244`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0242, "a102"},
        {0243, "a103"},
        {0244, "a104"},
        {0245, "a106"},
        {0246, "a107"},
```

### OctalLiteral
Octal integer `0245`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0243, "a103"},
        {0244, "a104"},
        {0245, "a106"},
        {0246, "a107"},
        {0247, "a108"},
```

### OctalLiteral
Octal integer `0246`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0244, "a104"},
        {0245, "a106"},
        {0246, "a107"},
        {0247, "a108"},
        {0250, "a112"},
```

### OctalLiteral
Octal integer `0247`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0245, "a106"},
        {0246, "a107"},
        {0247, "a108"},
        {0250, "a112"},
        {0251, "a111"},
```

### OctalLiteral
Octal integer `0250`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0246, "a107"},
        {0247, "a108"},
        {0250, "a112"},
        {0251, "a111"},
        {0252, "a110"},
```

### OctalLiteral
Octal integer `0251`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0247, "a108"},
        {0250, "a112"},
        {0251, "a111"},
        {0252, "a110"},
        {0253, "a109"},
```

### OctalLiteral
Octal integer `0252`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0250, "a112"},
        {0251, "a111"},
        {0252, "a110"},
        {0253, "a109"},
        {0254, "a120"},
```

### OctalLiteral
Octal integer `0253`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0251, "a111"},
        {0252, "a110"},
        {0253, "a109"},
        {0254, "a120"},
        {0255, "a121"},
```

### OctalLiteral
Octal integer `0254`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0252, "a110"},
        {0253, "a109"},
        {0254, "a120"},
        {0255, "a121"},
        {0256, "a122"},
```

### OctalLiteral
Octal integer `0255`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0253, "a109"},
        {0254, "a120"},
        {0255, "a121"},
        {0256, "a122"},
        {0257, "a123"},
```

### OctalLiteral
Octal integer `0256`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0254, "a120"},
        {0255, "a121"},
        {0256, "a122"},
        {0257, "a123"},
        {0260, "a124"},
```

### OctalLiteral
Octal integer `0257`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0255, "a121"},
        {0256, "a122"},
        {0257, "a123"},
        {0260, "a124"},
        {0261, "a125"},
```

### OctalLiteral
Octal integer `0260`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0256, "a122"},
        {0257, "a123"},
        {0260, "a124"},
        {0261, "a125"},
        {0262, "a126"},
```

### OctalLiteral
Octal integer `0261`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0257, "a123"},
        {0260, "a124"},
        {0261, "a125"},
        {0262, "a126"},
        {0263, "a127"},
```

### OctalLiteral
Octal integer `0262`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0260, "a124"},
        {0261, "a125"},
        {0262, "a126"},
        {0263, "a127"},
        {0264, "a128"},
```

### OctalLiteral
Octal integer `0263`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0261, "a125"},
        {0262, "a126"},
        {0263, "a127"},
        {0264, "a128"},
        {0265, "a129"},
```

### OctalLiteral
Octal integer `0264`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0262, "a126"},
        {0263, "a127"},
        {0264, "a128"},
        {0265, "a129"},
        {0266, "a130"},
```

### OctalLiteral
Octal integer `0265`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0263, "a127"},
        {0264, "a128"},
        {0265, "a129"},
        {0266, "a130"},
        {0267, "a131"},
```

### OctalLiteral
Octal integer `0266`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0264, "a128"},
        {0265, "a129"},
        {0266, "a130"},
        {0267, "a131"},
        {0270, "a132"},
```

### OctalLiteral
Octal integer `0267`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0265, "a129"},
        {0266, "a130"},
        {0267, "a131"},
        {0270, "a132"},
        {0271, "a133"},
```

### OctalLiteral
Octal integer `0270`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0266, "a130"},
        {0267, "a131"},
        {0270, "a132"},
        {0271, "a133"},
        {0272, "a134"},
```

### OctalLiteral
Octal integer `0271`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0267, "a131"},
        {0270, "a132"},
        {0271, "a133"},
        {0272, "a134"},
        {0273, "a135"},
```

### OctalLiteral
Octal integer `0272`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0270, "a132"},
        {0271, "a133"},
        {0272, "a134"},
        {0273, "a135"},
        {0274, "a136"},
```

### OctalLiteral
Octal integer `0273`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0271, "a133"},
        {0272, "a134"},
        {0273, "a135"},
        {0274, "a136"},
        {0275, "a137"},
```

### OctalLiteral
Octal integer `0274`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0272, "a134"},
        {0273, "a135"},
        {0274, "a136"},
        {0275, "a137"},
        {0276, "a138"},
```

### OctalLiteral
Octal integer `0275`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0273, "a135"},
        {0274, "a136"},
        {0275, "a137"},
        {0276, "a138"},
        {0277, "a139"},
```

### OctalLiteral
Octal integer `0276`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0274, "a136"},
        {0275, "a137"},
        {0276, "a138"},
        {0277, "a139"},
        {0300, "a140"},
```

### OctalLiteral
Octal integer `0277`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0275, "a137"},
        {0276, "a138"},
        {0277, "a139"},
        {0300, "a140"},
        {0301, "a141"},
```

### OctalLiteral
Octal integer `0300`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0276, "a138"},
        {0277, "a139"},
        {0300, "a140"},
        {0301, "a141"},
        {0302, "a142"},
```

### OctalLiteral
Octal integer `0301`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0277, "a139"},
        {0300, "a140"},
        {0301, "a141"},
        {0302, "a142"},
        {0303, "a143"},
```

### OctalLiteral
Octal integer `0302`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0300, "a140"},
        {0301, "a141"},
        {0302, "a142"},
        {0303, "a143"},
        {0304, "a144"},
```

### OctalLiteral
Octal integer `0303`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0301, "a141"},
        {0302, "a142"},
        {0303, "a143"},
        {0304, "a144"},
        {0305, "a145"},
```

### OctalLiteral
Octal integer `0304`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0302, "a142"},
        {0303, "a143"},
        {0304, "a144"},
        {0305, "a145"},
        {0306, "a146"},
```

### OctalLiteral
Octal integer `0305`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0303, "a143"},
        {0304, "a144"},
        {0305, "a145"},
        {0306, "a146"},
        {0307, "a147"},
```

### OctalLiteral
Octal integer `0306`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0304, "a144"},
        {0305, "a145"},
        {0306, "a146"},
        {0307, "a147"},
        {0310, "a148"},
```

### OctalLiteral
Octal integer `0307`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0305, "a145"},
        {0306, "a146"},
        {0307, "a147"},
        {0310, "a148"},
        {0311, "a149"},
```

### OctalLiteral
Octal integer `0310`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0306, "a146"},
        {0307, "a147"},
        {0310, "a148"},
        {0311, "a149"},
        {0312, "a150"},
```

### OctalLiteral
Octal integer `0311`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0307, "a147"},
        {0310, "a148"},
        {0311, "a149"},
        {0312, "a150"},
        {0313, "a151"},
```

### OctalLiteral
Octal integer `0312`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0310, "a148"},
        {0311, "a149"},
        {0312, "a150"},
        {0313, "a151"},
        {0314, "a152"},
```

### OctalLiteral
Octal integer `0313`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0311, "a149"},
        {0312, "a150"},
        {0313, "a151"},
        {0314, "a152"},
        {0315, "a153"},
```

### OctalLiteral
Octal integer `0314`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0312, "a150"},
        {0313, "a151"},
        {0314, "a152"},
        {0315, "a153"},
        {0316, "a154"},
```

### OctalLiteral
Octal integer `0315`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0313, "a151"},
        {0314, "a152"},
        {0315, "a153"},
        {0316, "a154"},
        {0317, "a155"},
```

### OctalLiteral
Octal integer `0316`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0314, "a152"},
        {0315, "a153"},
        {0316, "a154"},
        {0317, "a155"},
        {0320, "a156"},
```

### OctalLiteral
Octal integer `0317`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0315, "a153"},
        {0316, "a154"},
        {0317, "a155"},
        {0320, "a156"},
        {0321, "a157"},
```

### OctalLiteral
Octal integer `0320`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0316, "a154"},
        {0317, "a155"},
        {0320, "a156"},
        {0321, "a157"},
        {0322, "a158"},
```

### OctalLiteral
Octal integer `0321`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0317, "a155"},
        {0320, "a156"},
        {0321, "a157"},
        {0322, "a158"},
        {0323, "a159"},
```

### OctalLiteral
Octal integer `0322`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0320, "a156"},
        {0321, "a157"},
        {0322, "a158"},
        {0323, "a159"},
        {0324, "a160"},
```

### OctalLiteral
Octal integer `0323`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0321, "a157"},
        {0322, "a158"},
        {0323, "a159"},
        {0324, "a160"},
        {0325, "a161"},
```

### OctalLiteral
Octal integer `0324`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0322, "a158"},
        {0323, "a159"},
        {0324, "a160"},
        {0325, "a161"},
        {0326, "a163"},
```

### OctalLiteral
Octal integer `0325`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0323, "a159"},
        {0324, "a160"},
        {0325, "a161"},
        {0326, "a163"},
        {0327, "a164"},
```

### OctalLiteral
Octal integer `0326`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0324, "a160"},
        {0325, "a161"},
        {0326, "a163"},
        {0327, "a164"},
        {0330, "a196"},
```

### OctalLiteral
Octal integer `0327`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0325, "a161"},
        {0326, "a163"},
        {0327, "a164"},
        {0330, "a196"},
        {0331, "a165"},
```

### OctalLiteral
Octal integer `0330`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0326, "a163"},
        {0327, "a164"},
        {0330, "a196"},
        {0331, "a165"},
        {0332, "a192"},
```

### OctalLiteral
Octal integer `0331`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0327, "a164"},
        {0330, "a196"},
        {0331, "a165"},
        {0332, "a192"},
        {0333, "a166"},
```

### OctalLiteral
Octal integer `0332`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0330, "a196"},
        {0331, "a165"},
        {0332, "a192"},
        {0333, "a166"},
        {0334, "a167"},
```

### OctalLiteral
Octal integer `0333`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0331, "a165"},
        {0332, "a192"},
        {0333, "a166"},
        {0334, "a167"},
        {0335, "a168"},
```

### OctalLiteral
Octal integer `0334`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0332, "a192"},
        {0333, "a166"},
        {0334, "a167"},
        {0335, "a168"},
        {0336, "a169"},
```

### OctalLiteral
Octal integer `0335`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0333, "a166"},
        {0334, "a167"},
        {0335, "a168"},
        {0336, "a169"},
        {0337, "a170"},
```

### OctalLiteral
Octal integer `0336`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0334, "a167"},
        {0335, "a168"},
        {0336, "a169"},
        {0337, "a170"},
        {0340, "a171"},
```

### OctalLiteral
Octal integer `0337`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0335, "a168"},
        {0336, "a169"},
        {0337, "a170"},
        {0340, "a171"},
        {0341, "a172"},
```

### OctalLiteral
Octal integer `0340`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0336, "a169"},
        {0337, "a170"},
        {0340, "a171"},
        {0341, "a172"},
        {0342, "a173"},
```

### OctalLiteral
Octal integer `0341`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0337, "a170"},
        {0340, "a171"},
        {0341, "a172"},
        {0342, "a173"},
        {0343, "a162"},
```

### OctalLiteral
Octal integer `0342`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0340, "a171"},
        {0341, "a172"},
        {0342, "a173"},
        {0343, "a162"},
        {0344, "a174"},
```

### OctalLiteral
Octal integer `0343`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0341, "a172"},
        {0342, "a173"},
        {0343, "a162"},
        {0344, "a174"},
        {0345, "a175"},
```

### OctalLiteral
Octal integer `0344`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0342, "a173"},
        {0343, "a162"},
        {0344, "a174"},
        {0345, "a175"},
        {0346, "a176"},
```

### OctalLiteral
Octal integer `0345`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0343, "a162"},
        {0344, "a174"},
        {0345, "a175"},
        {0346, "a176"},
        {0347, "a177"},
```

### OctalLiteral
Octal integer `0346`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0344, "a174"},
        {0345, "a175"},
        {0346, "a176"},
        {0347, "a177"},
        {0350, "a178"},
```

### OctalLiteral
Octal integer `0347`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0345, "a175"},
        {0346, "a176"},
        {0347, "a177"},
        {0350, "a178"},
        {0351, "a179"},
```

### OctalLiteral
Octal integer `0350`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0346, "a176"},
        {0347, "a177"},
        {0350, "a178"},
        {0351, "a179"},
        {0352, "a193"},
```

### OctalLiteral
Octal integer `0351`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0347, "a177"},
        {0350, "a178"},
        {0351, "a179"},
        {0352, "a193"},
        {0353, "a180"},
```

### OctalLiteral
Octal integer `0352`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0350, "a178"},
        {0351, "a179"},
        {0352, "a193"},
        {0353, "a180"},
        {0354, "a199"},
```

### OctalLiteral
Octal integer `0353`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0351, "a179"},
        {0352, "a193"},
        {0353, "a180"},
        {0354, "a199"},
        {0355, "a181"},
```

### OctalLiteral
Octal integer `0354`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0352, "a193"},
        {0353, "a180"},
        {0354, "a199"},
        {0355, "a181"},
        {0356, "a200"},
```

### OctalLiteral
Octal integer `0355`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0353, "a180"},
        {0354, "a199"},
        {0355, "a181"},
        {0356, "a200"},
        {0357, "a182"},
```

### OctalLiteral
Octal integer `0356`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0354, "a199"},
        {0355, "a181"},
        {0356, "a200"},
        {0357, "a182"},
        {0361, "a201"},
```

### OctalLiteral
Octal integer `0357`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0355, "a181"},
        {0356, "a200"},
        {0357, "a182"},
        {0361, "a201"},
        {0362, "a183"},
```

### OctalLiteral
Octal integer `0361`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0356, "a200"},
        {0357, "a182"},
        {0361, "a201"},
        {0362, "a183"},
        {0363, "a184"},
```

### OctalLiteral
Octal integer `0362`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0357, "a182"},
        {0361, "a201"},
        {0362, "a183"},
        {0363, "a184"},
        {0364, "a197"},
```

### OctalLiteral
Octal integer `0363`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0361, "a201"},
        {0362, "a183"},
        {0363, "a184"},
        {0364, "a197"},
        {0365, "a185"},
```

### OctalLiteral
Octal integer `0364`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0362, "a183"},
        {0363, "a184"},
        {0364, "a197"},
        {0365, "a185"},
        {0366, "a194"},
```

### OctalLiteral
Octal integer `0365`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0363, "a184"},
        {0364, "a197"},
        {0365, "a185"},
        {0366, "a194"},
        {0367, "a198"},
```

### OctalLiteral
Octal integer `0366`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0364, "a197"},
        {0365, "a185"},
        {0366, "a194"},
        {0367, "a198"},
        {0370, "a186"},
```

### OctalLiteral
Octal integer `0367`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0365, "a185"},
        {0366, "a194"},
        {0367, "a198"},
        {0370, "a186"},
        {0371, "a195"},
```

### OctalLiteral
Octal integer `0370`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0366, "a194"},
        {0367, "a198"},
        {0370, "a186"},
        {0371, "a195"},
        {0372, "a187"},
```

### OctalLiteral
Octal integer `0371`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0367, "a198"},
        {0370, "a186"},
        {0371, "a195"},
        {0372, "a187"},
        {0373, "a188"},
```

### OctalLiteral
Octal integer `0372`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0370, "a186"},
        {0371, "a195"},
        {0372, "a187"},
        {0373, "a188"},
        {0374, "a189"},
```

### OctalLiteral
Octal integer `0373`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0371, "a195"},
        {0372, "a187"},
        {0373, "a188"},
        {0374, "a189"},
        {0375, "a190"},
```

### OctalLiteral
Octal integer `0374`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0372, "a187"},
        {0373, "a188"},
        {0374, "a189"},
        {0375, "a190"},
        {0376, "a191"}
```

### OctalLiteral
Octal integer `0375`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0373, "a188"},
        {0374, "a189"},
        {0375, "a190"},
        {0376, "a191"}
    };
```

### OctalLiteral
Octal integer `0376`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/ZapfDingbatsEncoding.java`
#### Snippet
```java
        {0374, "a189"},
        {0375, "a190"},
        {0376, "a191"}
    };
    
```

### OctalLiteral
Octal integer `041`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
        // From the PDF specification:
        // In WinAnsiEncoding, all unused codes greater than 40 map to the bullet character.
        for (int i = 041; i <= 255; i++)
        {
            if (!codeToName.containsKey(i))
```

### OctalLiteral
Octal integer `0101`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
     */
    private static final Object[][] WIN_ANSI_ENCODING_TABLE = {
            {0101, "A"},
            {0306, "AE"},
            {0301, "Aacute"},
```

### OctalLiteral
Octal integer `0306`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
    private static final Object[][] WIN_ANSI_ENCODING_TABLE = {
            {0101, "A"},
            {0306, "AE"},
            {0301, "Aacute"},
            {0302, "Acircumflex"},
```

### OctalLiteral
Octal integer `0301`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0101, "A"},
            {0306, "AE"},
            {0301, "Aacute"},
            {0302, "Acircumflex"},
            {0304, "Adieresis"},
```

### OctalLiteral
Octal integer `0302`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0306, "AE"},
            {0301, "Aacute"},
            {0302, "Acircumflex"},
            {0304, "Adieresis"},
            {0300, "Agrave"},
```

### OctalLiteral
Octal integer `0304`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0301, "Aacute"},
            {0302, "Acircumflex"},
            {0304, "Adieresis"},
            {0300, "Agrave"},
            {0305, "Aring"},
```

### OctalLiteral
Octal integer `0300`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0302, "Acircumflex"},
            {0304, "Adieresis"},
            {0300, "Agrave"},
            {0305, "Aring"},
            {0303, "Atilde"},
```

### OctalLiteral
Octal integer `0305`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0304, "Adieresis"},
            {0300, "Agrave"},
            {0305, "Aring"},
            {0303, "Atilde"},
            {0102, "B"},
```

### OctalLiteral
Octal integer `0303`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0300, "Agrave"},
            {0305, "Aring"},
            {0303, "Atilde"},
            {0102, "B"},
            {0103, "C"},
```

### OctalLiteral
Octal integer `0102`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0305, "Aring"},
            {0303, "Atilde"},
            {0102, "B"},
            {0103, "C"},
            {0307, "Ccedilla"},
```

### OctalLiteral
Octal integer `0103`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0303, "Atilde"},
            {0102, "B"},
            {0103, "C"},
            {0307, "Ccedilla"},
            {0104, "D"},
```

### OctalLiteral
Octal integer `0307`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0102, "B"},
            {0103, "C"},
            {0307, "Ccedilla"},
            {0104, "D"},
            {0105, "E"},
```

### OctalLiteral
Octal integer `0104`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0103, "C"},
            {0307, "Ccedilla"},
            {0104, "D"},
            {0105, "E"},
            {0311, "Eacute"},
```

### OctalLiteral
Octal integer `0105`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0307, "Ccedilla"},
            {0104, "D"},
            {0105, "E"},
            {0311, "Eacute"},
            {0312, "Ecircumflex"},
```

### OctalLiteral
Octal integer `0311`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0104, "D"},
            {0105, "E"},
            {0311, "Eacute"},
            {0312, "Ecircumflex"},
            {0313, "Edieresis"},
```

### OctalLiteral
Octal integer `0312`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0105, "E"},
            {0311, "Eacute"},
            {0312, "Ecircumflex"},
            {0313, "Edieresis"},
            {0310, "Egrave"},
```

### OctalLiteral
Octal integer `0313`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0311, "Eacute"},
            {0312, "Ecircumflex"},
            {0313, "Edieresis"},
            {0310, "Egrave"},
            {0320, "Eth"},
```

### OctalLiteral
Octal integer `0310`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0312, "Ecircumflex"},
            {0313, "Edieresis"},
            {0310, "Egrave"},
            {0320, "Eth"},
            {0200, "Euro"},
```

### OctalLiteral
Octal integer `0320`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0313, "Edieresis"},
            {0310, "Egrave"},
            {0320, "Eth"},
            {0200, "Euro"},
            {0106, "F"},
```

### OctalLiteral
Octal integer `0200`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0310, "Egrave"},
            {0320, "Eth"},
            {0200, "Euro"},
            {0106, "F"},
            {0107, "G"},
```

### OctalLiteral
Octal integer `0106`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0320, "Eth"},
            {0200, "Euro"},
            {0106, "F"},
            {0107, "G"},
            {0110, "H"},
```

### OctalLiteral
Octal integer `0107`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0200, "Euro"},
            {0106, "F"},
            {0107, "G"},
            {0110, "H"},
            {0111, "I"},
```

### OctalLiteral
Octal integer `0110`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0106, "F"},
            {0107, "G"},
            {0110, "H"},
            {0111, "I"},
            {0315, "Iacute"},
```

### OctalLiteral
Octal integer `0111`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0107, "G"},
            {0110, "H"},
            {0111, "I"},
            {0315, "Iacute"},
            {0316, "Icircumflex"},
```

### OctalLiteral
Octal integer `0315`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0110, "H"},
            {0111, "I"},
            {0315, "Iacute"},
            {0316, "Icircumflex"},
            {0317, "Idieresis"},
```

### OctalLiteral
Octal integer `0316`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0111, "I"},
            {0315, "Iacute"},
            {0316, "Icircumflex"},
            {0317, "Idieresis"},
            {0314, "Igrave"},
```

### OctalLiteral
Octal integer `0317`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0315, "Iacute"},
            {0316, "Icircumflex"},
            {0317, "Idieresis"},
            {0314, "Igrave"},
            {0112, "J"},
```

### OctalLiteral
Octal integer `0314`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0316, "Icircumflex"},
            {0317, "Idieresis"},
            {0314, "Igrave"},
            {0112, "J"},
            {0113, "K"},
```

### OctalLiteral
Octal integer `0112`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0317, "Idieresis"},
            {0314, "Igrave"},
            {0112, "J"},
            {0113, "K"},
            {0114, "L"},
```

### OctalLiteral
Octal integer `0113`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0314, "Igrave"},
            {0112, "J"},
            {0113, "K"},
            {0114, "L"},
            {0115, "M"},
```

### OctalLiteral
Octal integer `0114`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0112, "J"},
            {0113, "K"},
            {0114, "L"},
            {0115, "M"},
            {0116, "N"},
```

### OctalLiteral
Octal integer `0115`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0113, "K"},
            {0114, "L"},
            {0115, "M"},
            {0116, "N"},
            {0321, "Ntilde"},
```

### OctalLiteral
Octal integer `0116`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0114, "L"},
            {0115, "M"},
            {0116, "N"},
            {0321, "Ntilde"},
            {0117, "O"},
```

### OctalLiteral
Octal integer `0321`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0115, "M"},
            {0116, "N"},
            {0321, "Ntilde"},
            {0117, "O"},
            {0214, "OE"},
```

### OctalLiteral
Octal integer `0117`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0116, "N"},
            {0321, "Ntilde"},
            {0117, "O"},
            {0214, "OE"},
            {0323, "Oacute"},
```

### OctalLiteral
Octal integer `0214`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0321, "Ntilde"},
            {0117, "O"},
            {0214, "OE"},
            {0323, "Oacute"},
            {0324, "Ocircumflex"},
```

### OctalLiteral
Octal integer `0323`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0117, "O"},
            {0214, "OE"},
            {0323, "Oacute"},
            {0324, "Ocircumflex"},
            {0326, "Odieresis"},
```

### OctalLiteral
Octal integer `0324`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0214, "OE"},
            {0323, "Oacute"},
            {0324, "Ocircumflex"},
            {0326, "Odieresis"},
            {0322, "Ograve"},
```

### OctalLiteral
Octal integer `0326`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0323, "Oacute"},
            {0324, "Ocircumflex"},
            {0326, "Odieresis"},
            {0322, "Ograve"},
            {0330, "Oslash"},
```

### OctalLiteral
Octal integer `0322`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0324, "Ocircumflex"},
            {0326, "Odieresis"},
            {0322, "Ograve"},
            {0330, "Oslash"},
            {0325, "Otilde"},
```

### OctalLiteral
Octal integer `0330`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0326, "Odieresis"},
            {0322, "Ograve"},
            {0330, "Oslash"},
            {0325, "Otilde"},
            {0120, "P"},
```

### OctalLiteral
Octal integer `0325`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0322, "Ograve"},
            {0330, "Oslash"},
            {0325, "Otilde"},
            {0120, "P"},
            {0121, "Q"},
```

### OctalLiteral
Octal integer `0120`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0330, "Oslash"},
            {0325, "Otilde"},
            {0120, "P"},
            {0121, "Q"},
            {0122, "R"},
```

### OctalLiteral
Octal integer `0121`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0325, "Otilde"},
            {0120, "P"},
            {0121, "Q"},
            {0122, "R"},
            {0123, "S"},
```

### OctalLiteral
Octal integer `0122`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0120, "P"},
            {0121, "Q"},
            {0122, "R"},
            {0123, "S"},
            {0212, "Scaron"},
```

### OctalLiteral
Octal integer `0123`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0121, "Q"},
            {0122, "R"},
            {0123, "S"},
            {0212, "Scaron"},
            {0124, "T"},
```

### OctalLiteral
Octal integer `0212`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0122, "R"},
            {0123, "S"},
            {0212, "Scaron"},
            {0124, "T"},
            {0336, "Thorn"},
```

### OctalLiteral
Octal integer `0124`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0123, "S"},
            {0212, "Scaron"},
            {0124, "T"},
            {0336, "Thorn"},
            {0125, "U"},
```

### OctalLiteral
Octal integer `0336`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0212, "Scaron"},
            {0124, "T"},
            {0336, "Thorn"},
            {0125, "U"},
            {0332, "Uacute"},
```

### OctalLiteral
Octal integer `0125`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0124, "T"},
            {0336, "Thorn"},
            {0125, "U"},
            {0332, "Uacute"},
            {0333, "Ucircumflex"},
```

### OctalLiteral
Octal integer `0332`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0336, "Thorn"},
            {0125, "U"},
            {0332, "Uacute"},
            {0333, "Ucircumflex"},
            {0334, "Udieresis"},
```

### OctalLiteral
Octal integer `0333`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0125, "U"},
            {0332, "Uacute"},
            {0333, "Ucircumflex"},
            {0334, "Udieresis"},
            {0331, "Ugrave"},
```

### OctalLiteral
Octal integer `0334`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0332, "Uacute"},
            {0333, "Ucircumflex"},
            {0334, "Udieresis"},
            {0331, "Ugrave"},
            {0126, "V"},
```

### OctalLiteral
Octal integer `0331`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0333, "Ucircumflex"},
            {0334, "Udieresis"},
            {0331, "Ugrave"},
            {0126, "V"},
            {0127, "W"},
```

### OctalLiteral
Octal integer `0126`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0334, "Udieresis"},
            {0331, "Ugrave"},
            {0126, "V"},
            {0127, "W"},
            {0130, "X"},
```

### OctalLiteral
Octal integer `0127`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0331, "Ugrave"},
            {0126, "V"},
            {0127, "W"},
            {0130, "X"},
            {0131, "Y"},
```

### OctalLiteral
Octal integer `0130`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0126, "V"},
            {0127, "W"},
            {0130, "X"},
            {0131, "Y"},
            {0335, "Yacute"},
```

### OctalLiteral
Octal integer `0131`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0127, "W"},
            {0130, "X"},
            {0131, "Y"},
            {0335, "Yacute"},
            {0237, "Ydieresis"},
```

### OctalLiteral
Octal integer `0335`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0130, "X"},
            {0131, "Y"},
            {0335, "Yacute"},
            {0237, "Ydieresis"},
            {0132, "Z"},
```

### OctalLiteral
Octal integer `0237`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0131, "Y"},
            {0335, "Yacute"},
            {0237, "Ydieresis"},
            {0132, "Z"},
            {0216, "Zcaron"},
```

### OctalLiteral
Octal integer `0132`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0335, "Yacute"},
            {0237, "Ydieresis"},
            {0132, "Z"},
            {0216, "Zcaron"},
            {0141, "a"},
```

### OctalLiteral
Octal integer `0216`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0237, "Ydieresis"},
            {0132, "Z"},
            {0216, "Zcaron"},
            {0141, "a"},
            {0341, "aacute"},
```

### OctalLiteral
Octal integer `0141`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0132, "Z"},
            {0216, "Zcaron"},
            {0141, "a"},
            {0341, "aacute"},
            {0342, "acircumflex"},
```

### OctalLiteral
Octal integer `0341`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0216, "Zcaron"},
            {0141, "a"},
            {0341, "aacute"},
            {0342, "acircumflex"},
            {0264, "acute"},
```

### OctalLiteral
Octal integer `0342`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0141, "a"},
            {0341, "aacute"},
            {0342, "acircumflex"},
            {0264, "acute"},
            {0344, "adieresis"},
```

### OctalLiteral
Octal integer `0264`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0341, "aacute"},
            {0342, "acircumflex"},
            {0264, "acute"},
            {0344, "adieresis"},
            {0346, "ae"},
```

### OctalLiteral
Octal integer `0344`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0342, "acircumflex"},
            {0264, "acute"},
            {0344, "adieresis"},
            {0346, "ae"},
            {0340, "agrave"},
```

### OctalLiteral
Octal integer `0346`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0264, "acute"},
            {0344, "adieresis"},
            {0346, "ae"},
            {0340, "agrave"},
            {046, "ampersand"},
```

### OctalLiteral
Octal integer `0340`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0344, "adieresis"},
            {0346, "ae"},
            {0340, "agrave"},
            {046, "ampersand"},
            {0345, "aring"},
```

### OctalLiteral
Octal integer `046`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0346, "ae"},
            {0340, "agrave"},
            {046, "ampersand"},
            {0345, "aring"},
            {0136, "asciicircum"},
```

### OctalLiteral
Octal integer `0345`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0340, "agrave"},
            {046, "ampersand"},
            {0345, "aring"},
            {0136, "asciicircum"},
            {0176, "asciitilde"},
```

### OctalLiteral
Octal integer `0136`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {046, "ampersand"},
            {0345, "aring"},
            {0136, "asciicircum"},
            {0176, "asciitilde"},
            {052, "asterisk"},
```

### OctalLiteral
Octal integer `0176`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0345, "aring"},
            {0136, "asciicircum"},
            {0176, "asciitilde"},
            {052, "asterisk"},
            {0100, "at"},
```

### OctalLiteral
Octal integer `052`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0136, "asciicircum"},
            {0176, "asciitilde"},
            {052, "asterisk"},
            {0100, "at"},
            {0343, "atilde"},
```

### OctalLiteral
Octal integer `0100`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0176, "asciitilde"},
            {052, "asterisk"},
            {0100, "at"},
            {0343, "atilde"},
            {0142, "b"},
```

### OctalLiteral
Octal integer `0343`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {052, "asterisk"},
            {0100, "at"},
            {0343, "atilde"},
            {0142, "b"},
            {0134, "backslash"},
```

### OctalLiteral
Octal integer `0142`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0100, "at"},
            {0343, "atilde"},
            {0142, "b"},
            {0134, "backslash"},
            {0174, "bar"},
```

### OctalLiteral
Octal integer `0134`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0343, "atilde"},
            {0142, "b"},
            {0134, "backslash"},
            {0174, "bar"},
            {0173, "braceleft"},
```

### OctalLiteral
Octal integer `0174`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0142, "b"},
            {0134, "backslash"},
            {0174, "bar"},
            {0173, "braceleft"},
            {0175, "braceright"},
```

### OctalLiteral
Octal integer `0173`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0134, "backslash"},
            {0174, "bar"},
            {0173, "braceleft"},
            {0175, "braceright"},
            {0133, "bracketleft"},
```

### OctalLiteral
Octal integer `0175`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0174, "bar"},
            {0173, "braceleft"},
            {0175, "braceright"},
            {0133, "bracketleft"},
            {0135, "bracketright"},
```

### OctalLiteral
Octal integer `0133`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0173, "braceleft"},
            {0175, "braceright"},
            {0133, "bracketleft"},
            {0135, "bracketright"},
            {0246, "brokenbar"},
```

### OctalLiteral
Octal integer `0135`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0175, "braceright"},
            {0133, "bracketleft"},
            {0135, "bracketright"},
            {0246, "brokenbar"},
            {0225, "bullet"},
```

### OctalLiteral
Octal integer `0246`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0133, "bracketleft"},
            {0135, "bracketright"},
            {0246, "brokenbar"},
            {0225, "bullet"},
            {0143, "c"},
```

### OctalLiteral
Octal integer `0225`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0135, "bracketright"},
            {0246, "brokenbar"},
            {0225, "bullet"},
            {0143, "c"},
            {0347, "ccedilla"},
```

### OctalLiteral
Octal integer `0143`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0246, "brokenbar"},
            {0225, "bullet"},
            {0143, "c"},
            {0347, "ccedilla"},
            {0270, "cedilla"},
```

### OctalLiteral
Octal integer `0347`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0225, "bullet"},
            {0143, "c"},
            {0347, "ccedilla"},
            {0270, "cedilla"},
            {0242, "cent"},
```

### OctalLiteral
Octal integer `0270`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0143, "c"},
            {0347, "ccedilla"},
            {0270, "cedilla"},
            {0242, "cent"},
            {0210, "circumflex"},
```

### OctalLiteral
Octal integer `0242`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0347, "ccedilla"},
            {0270, "cedilla"},
            {0242, "cent"},
            {0210, "circumflex"},
            {072, "colon"},
```

### OctalLiteral
Octal integer `0210`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0270, "cedilla"},
            {0242, "cent"},
            {0210, "circumflex"},
            {072, "colon"},
            {054, "comma"},
```

### OctalLiteral
Octal integer `072`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0242, "cent"},
            {0210, "circumflex"},
            {072, "colon"},
            {054, "comma"},
            {0251, "copyright"},
```

### OctalLiteral
Octal integer `054`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0210, "circumflex"},
            {072, "colon"},
            {054, "comma"},
            {0251, "copyright"},
            {0244, "currency"},
```

### OctalLiteral
Octal integer `0251`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {072, "colon"},
            {054, "comma"},
            {0251, "copyright"},
            {0244, "currency"},
            {0144, "d"},
```

### OctalLiteral
Octal integer `0244`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {054, "comma"},
            {0251, "copyright"},
            {0244, "currency"},
            {0144, "d"},
            {0206, "dagger"},
```

### OctalLiteral
Octal integer `0144`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0251, "copyright"},
            {0244, "currency"},
            {0144, "d"},
            {0206, "dagger"},
            {0207, "daggerdbl"},
```

### OctalLiteral
Octal integer `0206`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0244, "currency"},
            {0144, "d"},
            {0206, "dagger"},
            {0207, "daggerdbl"},
            {0260, "degree"},
```

### OctalLiteral
Octal integer `0207`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0144, "d"},
            {0206, "dagger"},
            {0207, "daggerdbl"},
            {0260, "degree"},
            {0250, "dieresis"},
```

### OctalLiteral
Octal integer `0260`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0206, "dagger"},
            {0207, "daggerdbl"},
            {0260, "degree"},
            {0250, "dieresis"},
            {0367, "divide"},
```

### OctalLiteral
Octal integer `0250`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0207, "daggerdbl"},
            {0260, "degree"},
            {0250, "dieresis"},
            {0367, "divide"},
            {044, "dollar"},
```

### OctalLiteral
Octal integer `0367`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0260, "degree"},
            {0250, "dieresis"},
            {0367, "divide"},
            {044, "dollar"},
            {0145, "e"},
```

### OctalLiteral
Octal integer `044`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0250, "dieresis"},
            {0367, "divide"},
            {044, "dollar"},
            {0145, "e"},
            {0351, "eacute"},
```

### OctalLiteral
Octal integer `0145`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0367, "divide"},
            {044, "dollar"},
            {0145, "e"},
            {0351, "eacute"},
            {0352, "ecircumflex"},
```

### OctalLiteral
Octal integer `0351`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {044, "dollar"},
            {0145, "e"},
            {0351, "eacute"},
            {0352, "ecircumflex"},
            {0353, "edieresis"},
```

### OctalLiteral
Octal integer `0352`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0145, "e"},
            {0351, "eacute"},
            {0352, "ecircumflex"},
            {0353, "edieresis"},
            {0350, "egrave"},
```

### OctalLiteral
Octal integer `0353`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0351, "eacute"},
            {0352, "ecircumflex"},
            {0353, "edieresis"},
            {0350, "egrave"},
            {070, "eight"},
```

### OctalLiteral
Octal integer `0350`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0352, "ecircumflex"},
            {0353, "edieresis"},
            {0350, "egrave"},
            {070, "eight"},
            {0205, "ellipsis"},
```

### OctalLiteral
Octal integer `070`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0353, "edieresis"},
            {0350, "egrave"},
            {070, "eight"},
            {0205, "ellipsis"},
            {0227, "emdash"},
```

### OctalLiteral
Octal integer `0205`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0350, "egrave"},
            {070, "eight"},
            {0205, "ellipsis"},
            {0227, "emdash"},
            {0226, "endash"},
```

### OctalLiteral
Octal integer `0227`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {070, "eight"},
            {0205, "ellipsis"},
            {0227, "emdash"},
            {0226, "endash"},
            {075, "equal"},
```

### OctalLiteral
Octal integer `0226`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0205, "ellipsis"},
            {0227, "emdash"},
            {0226, "endash"},
            {075, "equal"},
            {0360, "eth"},
```

### OctalLiteral
Octal integer `075`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0227, "emdash"},
            {0226, "endash"},
            {075, "equal"},
            {0360, "eth"},
            {041, "exclam"},
```

### OctalLiteral
Octal integer `0360`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0226, "endash"},
            {075, "equal"},
            {0360, "eth"},
            {041, "exclam"},
            {0241, "exclamdown"},
```

### OctalLiteral
Octal integer `041`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {075, "equal"},
            {0360, "eth"},
            {041, "exclam"},
            {0241, "exclamdown"},
            {0146, "f"},
```

### OctalLiteral
Octal integer `0241`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0360, "eth"},
            {041, "exclam"},
            {0241, "exclamdown"},
            {0146, "f"},
            {065, "five"},
```

### OctalLiteral
Octal integer `0146`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {041, "exclam"},
            {0241, "exclamdown"},
            {0146, "f"},
            {065, "five"},
            {0203, "florin"},
```

### OctalLiteral
Octal integer `065`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0241, "exclamdown"},
            {0146, "f"},
            {065, "five"},
            {0203, "florin"},
            {064, "four"},
```

### OctalLiteral
Octal integer `0203`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0146, "f"},
            {065, "five"},
            {0203, "florin"},
            {064, "four"},
            {0147, "g"},
```

### OctalLiteral
Octal integer `064`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {065, "five"},
            {0203, "florin"},
            {064, "four"},
            {0147, "g"},
            {0337, "germandbls"},
```

### OctalLiteral
Octal integer `0147`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0203, "florin"},
            {064, "four"},
            {0147, "g"},
            {0337, "germandbls"},
            {0140, "grave"},
```

### OctalLiteral
Octal integer `0337`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {064, "four"},
            {0147, "g"},
            {0337, "germandbls"},
            {0140, "grave"},
            {076, "greater"},
```

### OctalLiteral
Octal integer `0140`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0147, "g"},
            {0337, "germandbls"},
            {0140, "grave"},
            {076, "greater"},
            {0253, "guillemotleft"},
```

### OctalLiteral
Octal integer `076`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0337, "germandbls"},
            {0140, "grave"},
            {076, "greater"},
            {0253, "guillemotleft"},
            {0273, "guillemotright"},
```

### OctalLiteral
Octal integer `0253`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0140, "grave"},
            {076, "greater"},
            {0253, "guillemotleft"},
            {0273, "guillemotright"},
            {0213, "guilsinglleft"},
```

### OctalLiteral
Octal integer `0273`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {076, "greater"},
            {0253, "guillemotleft"},
            {0273, "guillemotright"},
            {0213, "guilsinglleft"},
            {0233, "guilsinglright"},
```

### OctalLiteral
Octal integer `0213`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0253, "guillemotleft"},
            {0273, "guillemotright"},
            {0213, "guilsinglleft"},
            {0233, "guilsinglright"},
            {0150, "h"},
```

### OctalLiteral
Octal integer `0233`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0273, "guillemotright"},
            {0213, "guilsinglleft"},
            {0233, "guilsinglright"},
            {0150, "h"},
            {055, "hyphen"},
```

### OctalLiteral
Octal integer `0150`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0213, "guilsinglleft"},
            {0233, "guilsinglright"},
            {0150, "h"},
            {055, "hyphen"},
            {0151, "i"},
```

### OctalLiteral
Octal integer `055`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0233, "guilsinglright"},
            {0150, "h"},
            {055, "hyphen"},
            {0151, "i"},
            {0355, "iacute"},
```

### OctalLiteral
Octal integer `0151`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0150, "h"},
            {055, "hyphen"},
            {0151, "i"},
            {0355, "iacute"},
            {0356, "icircumflex"},
```

### OctalLiteral
Octal integer `0355`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {055, "hyphen"},
            {0151, "i"},
            {0355, "iacute"},
            {0356, "icircumflex"},
            {0357, "idieresis"},
```

### OctalLiteral
Octal integer `0356`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0151, "i"},
            {0355, "iacute"},
            {0356, "icircumflex"},
            {0357, "idieresis"},
            {0354, "igrave"},
```

### OctalLiteral
Octal integer `0357`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0355, "iacute"},
            {0356, "icircumflex"},
            {0357, "idieresis"},
            {0354, "igrave"},
            {0152, "j"},
```

### OctalLiteral
Octal integer `0354`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0356, "icircumflex"},
            {0357, "idieresis"},
            {0354, "igrave"},
            {0152, "j"},
            {0153, "k"},
```

### OctalLiteral
Octal integer `0152`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0357, "idieresis"},
            {0354, "igrave"},
            {0152, "j"},
            {0153, "k"},
            {0154, "l"},
```

### OctalLiteral
Octal integer `0153`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0354, "igrave"},
            {0152, "j"},
            {0153, "k"},
            {0154, "l"},
            {074, "less"},
```

### OctalLiteral
Octal integer `0154`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0152, "j"},
            {0153, "k"},
            {0154, "l"},
            {074, "less"},
            {0254, "logicalnot"},
```

### OctalLiteral
Octal integer `074`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0153, "k"},
            {0154, "l"},
            {074, "less"},
            {0254, "logicalnot"},
            {0155, "m"},
```

### OctalLiteral
Octal integer `0254`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0154, "l"},
            {074, "less"},
            {0254, "logicalnot"},
            {0155, "m"},
            {0257, "macron"},
```

### OctalLiteral
Octal integer `0155`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {074, "less"},
            {0254, "logicalnot"},
            {0155, "m"},
            {0257, "macron"},
            {0265, "mu"},
```

### OctalLiteral
Octal integer `0257`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0254, "logicalnot"},
            {0155, "m"},
            {0257, "macron"},
            {0265, "mu"},
            {0327, "multiply"},
```

### OctalLiteral
Octal integer `0265`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0155, "m"},
            {0257, "macron"},
            {0265, "mu"},
            {0327, "multiply"},
            {0156, "n"},
```

### OctalLiteral
Octal integer `0327`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0257, "macron"},
            {0265, "mu"},
            {0327, "multiply"},
            {0156, "n"},
            {071, "nine"},
```

### OctalLiteral
Octal integer `0156`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0265, "mu"},
            {0327, "multiply"},
            {0156, "n"},
            {071, "nine"},
            {0361, "ntilde"},
```

### OctalLiteral
Octal integer `071`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0327, "multiply"},
            {0156, "n"},
            {071, "nine"},
            {0361, "ntilde"},
            {043, "numbersign"},
```

### OctalLiteral
Octal integer `0361`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0156, "n"},
            {071, "nine"},
            {0361, "ntilde"},
            {043, "numbersign"},
            {0157, "o"},
```

### OctalLiteral
Octal integer `043`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {071, "nine"},
            {0361, "ntilde"},
            {043, "numbersign"},
            {0157, "o"},
            {0363, "oacute"},
```

### OctalLiteral
Octal integer `0157`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0361, "ntilde"},
            {043, "numbersign"},
            {0157, "o"},
            {0363, "oacute"},
            {0364, "ocircumflex"},
```

### OctalLiteral
Octal integer `0363`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {043, "numbersign"},
            {0157, "o"},
            {0363, "oacute"},
            {0364, "ocircumflex"},
            {0366, "odieresis"},
```

### OctalLiteral
Octal integer `0364`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0157, "o"},
            {0363, "oacute"},
            {0364, "ocircumflex"},
            {0366, "odieresis"},
            {0234, "oe"},
```

### OctalLiteral
Octal integer `0366`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0363, "oacute"},
            {0364, "ocircumflex"},
            {0366, "odieresis"},
            {0234, "oe"},
            {0362, "ograve"},
```

### OctalLiteral
Octal integer `0234`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0364, "ocircumflex"},
            {0366, "odieresis"},
            {0234, "oe"},
            {0362, "ograve"},
            {061, "one"},
```

### OctalLiteral
Octal integer `0362`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0366, "odieresis"},
            {0234, "oe"},
            {0362, "ograve"},
            {061, "one"},
            {0275, "onehalf"},
```

### OctalLiteral
Octal integer `061`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0234, "oe"},
            {0362, "ograve"},
            {061, "one"},
            {0275, "onehalf"},
            {0274, "onequarter"},
```

### OctalLiteral
Octal integer `0275`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0362, "ograve"},
            {061, "one"},
            {0275, "onehalf"},
            {0274, "onequarter"},
            {0271, "onesuperior"},
```

### OctalLiteral
Octal integer `0274`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {061, "one"},
            {0275, "onehalf"},
            {0274, "onequarter"},
            {0271, "onesuperior"},
            {0252, "ordfeminine"},
```

### OctalLiteral
Octal integer `0271`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0275, "onehalf"},
            {0274, "onequarter"},
            {0271, "onesuperior"},
            {0252, "ordfeminine"},
            {0272, "ordmasculine"},
```

### OctalLiteral
Octal integer `0252`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0274, "onequarter"},
            {0271, "onesuperior"},
            {0252, "ordfeminine"},
            {0272, "ordmasculine"},
            {0370, "oslash"},
```

### OctalLiteral
Octal integer `0272`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0271, "onesuperior"},
            {0252, "ordfeminine"},
            {0272, "ordmasculine"},
            {0370, "oslash"},
            {0365, "otilde"},
```

### OctalLiteral
Octal integer `0370`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0252, "ordfeminine"},
            {0272, "ordmasculine"},
            {0370, "oslash"},
            {0365, "otilde"},
            {0160, "p"},
```

### OctalLiteral
Octal integer `0365`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0272, "ordmasculine"},
            {0370, "oslash"},
            {0365, "otilde"},
            {0160, "p"},
            {0266, "paragraph"},
```

### OctalLiteral
Octal integer `0160`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0370, "oslash"},
            {0365, "otilde"},
            {0160, "p"},
            {0266, "paragraph"},
            {050, "parenleft"},
```

### OctalLiteral
Octal integer `0266`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0365, "otilde"},
            {0160, "p"},
            {0266, "paragraph"},
            {050, "parenleft"},
            {051, "parenright"},
```

### OctalLiteral
Octal integer `050`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0160, "p"},
            {0266, "paragraph"},
            {050, "parenleft"},
            {051, "parenright"},
            {045, "percent"},
```

### OctalLiteral
Octal integer `051`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0266, "paragraph"},
            {050, "parenleft"},
            {051, "parenright"},
            {045, "percent"},
            {056, "period"},
```

### OctalLiteral
Octal integer `045`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {050, "parenleft"},
            {051, "parenright"},
            {045, "percent"},
            {056, "period"},
            {0267, "periodcentered"},
```

### OctalLiteral
Octal integer `056`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {051, "parenright"},
            {045, "percent"},
            {056, "period"},
            {0267, "periodcentered"},
            {0211, "perthousand"},
```

### OctalLiteral
Octal integer `0267`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {045, "percent"},
            {056, "period"},
            {0267, "periodcentered"},
            {0211, "perthousand"},
            {053, "plus"},
```

### OctalLiteral
Octal integer `0211`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {056, "period"},
            {0267, "periodcentered"},
            {0211, "perthousand"},
            {053, "plus"},
            {0261, "plusminus"},
```

### OctalLiteral
Octal integer `053`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0267, "periodcentered"},
            {0211, "perthousand"},
            {053, "plus"},
            {0261, "plusminus"},
            {0161, "q"},
```

### OctalLiteral
Octal integer `0261`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0211, "perthousand"},
            {053, "plus"},
            {0261, "plusminus"},
            {0161, "q"},
            {077, "question"},
```

### OctalLiteral
Octal integer `0161`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {053, "plus"},
            {0261, "plusminus"},
            {0161, "q"},
            {077, "question"},
            {0277, "questiondown"},
```

### OctalLiteral
Octal integer `077`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0261, "plusminus"},
            {0161, "q"},
            {077, "question"},
            {0277, "questiondown"},
            {042, "quotedbl"},
```

### OctalLiteral
Octal integer `0277`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0161, "q"},
            {077, "question"},
            {0277, "questiondown"},
            {042, "quotedbl"},
            {0204, "quotedblbase"},
```

### OctalLiteral
Octal integer `042`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {077, "question"},
            {0277, "questiondown"},
            {042, "quotedbl"},
            {0204, "quotedblbase"},
            {0223, "quotedblleft"},
```

### OctalLiteral
Octal integer `0204`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0277, "questiondown"},
            {042, "quotedbl"},
            {0204, "quotedblbase"},
            {0223, "quotedblleft"},
            {0224, "quotedblright"},
```

### OctalLiteral
Octal integer `0223`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {042, "quotedbl"},
            {0204, "quotedblbase"},
            {0223, "quotedblleft"},
            {0224, "quotedblright"},
            {0221, "quoteleft"},
```

### OctalLiteral
Octal integer `0224`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0204, "quotedblbase"},
            {0223, "quotedblleft"},
            {0224, "quotedblright"},
            {0221, "quoteleft"},
            {0222, "quoteright"},
```

### OctalLiteral
Octal integer `0221`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0223, "quotedblleft"},
            {0224, "quotedblright"},
            {0221, "quoteleft"},
            {0222, "quoteright"},
            {0202, "quotesinglbase"},
```

### OctalLiteral
Octal integer `0222`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0224, "quotedblright"},
            {0221, "quoteleft"},
            {0222, "quoteright"},
            {0202, "quotesinglbase"},
            {047, "quotesingle"},
```

### OctalLiteral
Octal integer `0202`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0221, "quoteleft"},
            {0222, "quoteright"},
            {0202, "quotesinglbase"},
            {047, "quotesingle"},
            {0162, "r"},
```

### OctalLiteral
Octal integer `047`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0222, "quoteright"},
            {0202, "quotesinglbase"},
            {047, "quotesingle"},
            {0162, "r"},
            {0256, "registered"},
```

### OctalLiteral
Octal integer `0162`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0202, "quotesinglbase"},
            {047, "quotesingle"},
            {0162, "r"},
            {0256, "registered"},
            {0163, "s"},
```

### OctalLiteral
Octal integer `0256`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {047, "quotesingle"},
            {0162, "r"},
            {0256, "registered"},
            {0163, "s"},
            {0232, "scaron"},
```

### OctalLiteral
Octal integer `0163`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0162, "r"},
            {0256, "registered"},
            {0163, "s"},
            {0232, "scaron"},
            {0247, "section"},
```

### OctalLiteral
Octal integer `0232`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0256, "registered"},
            {0163, "s"},
            {0232, "scaron"},
            {0247, "section"},
            {073, "semicolon"},
```

### OctalLiteral
Octal integer `0247`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0163, "s"},
            {0232, "scaron"},
            {0247, "section"},
            {073, "semicolon"},
            {067, "seven"},
```

### OctalLiteral
Octal integer `073`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0232, "scaron"},
            {0247, "section"},
            {073, "semicolon"},
            {067, "seven"},
            {066, "six"},
```

### OctalLiteral
Octal integer `067`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0247, "section"},
            {073, "semicolon"},
            {067, "seven"},
            {066, "six"},
            {057, "slash"},
```

### OctalLiteral
Octal integer `066`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {073, "semicolon"},
            {067, "seven"},
            {066, "six"},
            {057, "slash"},
            {040, "space"},
```

### OctalLiteral
Octal integer `057`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {067, "seven"},
            {066, "six"},
            {057, "slash"},
            {040, "space"},
            {0243, "sterling"},
```

### OctalLiteral
Octal integer `040`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {066, "six"},
            {057, "slash"},
            {040, "space"},
            {0243, "sterling"},
            {0164, "t"},
```

### OctalLiteral
Octal integer `0243`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {057, "slash"},
            {040, "space"},
            {0243, "sterling"},
            {0164, "t"},
            {0376, "thorn"},
```

### OctalLiteral
Octal integer `0164`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {040, "space"},
            {0243, "sterling"},
            {0164, "t"},
            {0376, "thorn"},
            {063, "three"},
```

### OctalLiteral
Octal integer `0376`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0243, "sterling"},
            {0164, "t"},
            {0376, "thorn"},
            {063, "three"},
            {0276, "threequarters"},
```

### OctalLiteral
Octal integer `063`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0164, "t"},
            {0376, "thorn"},
            {063, "three"},
            {0276, "threequarters"},
            {0263, "threesuperior"},
```

### OctalLiteral
Octal integer `0276`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0376, "thorn"},
            {063, "three"},
            {0276, "threequarters"},
            {0263, "threesuperior"},
            {0230, "tilde"},
```

### OctalLiteral
Octal integer `0263`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {063, "three"},
            {0276, "threequarters"},
            {0263, "threesuperior"},
            {0230, "tilde"},
            {0231, "trademark"},
```

### OctalLiteral
Octal integer `0230`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0276, "threequarters"},
            {0263, "threesuperior"},
            {0230, "tilde"},
            {0231, "trademark"},
            {062, "two"},
```

### OctalLiteral
Octal integer `0231`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0263, "threesuperior"},
            {0230, "tilde"},
            {0231, "trademark"},
            {062, "two"},
            {0262, "twosuperior"},
```

### OctalLiteral
Octal integer `062`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0230, "tilde"},
            {0231, "trademark"},
            {062, "two"},
            {0262, "twosuperior"},
            {0165, "u"},
```

### OctalLiteral
Octal integer `0262`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0231, "trademark"},
            {062, "two"},
            {0262, "twosuperior"},
            {0165, "u"},
            {0372, "uacute"},
```

### OctalLiteral
Octal integer `0165`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {062, "two"},
            {0262, "twosuperior"},
            {0165, "u"},
            {0372, "uacute"},
            {0373, "ucircumflex"},
```

### OctalLiteral
Octal integer `0372`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0262, "twosuperior"},
            {0165, "u"},
            {0372, "uacute"},
            {0373, "ucircumflex"},
            {0374, "udieresis"},
```

### OctalLiteral
Octal integer `0373`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0165, "u"},
            {0372, "uacute"},
            {0373, "ucircumflex"},
            {0374, "udieresis"},
            {0371, "ugrave"},
```

### OctalLiteral
Octal integer `0374`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0372, "uacute"},
            {0373, "ucircumflex"},
            {0374, "udieresis"},
            {0371, "ugrave"},
            {0137, "underscore"},
```

### OctalLiteral
Octal integer `0371`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0373, "ucircumflex"},
            {0374, "udieresis"},
            {0371, "ugrave"},
            {0137, "underscore"},
            {0166, "v"},
```

### OctalLiteral
Octal integer `0137`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0374, "udieresis"},
            {0371, "ugrave"},
            {0137, "underscore"},
            {0166, "v"},
            {0167, "w"},
```

### OctalLiteral
Octal integer `0166`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0371, "ugrave"},
            {0137, "underscore"},
            {0166, "v"},
            {0167, "w"},
            {0170, "x"},
```

### OctalLiteral
Octal integer `0167`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0137, "underscore"},
            {0166, "v"},
            {0167, "w"},
            {0170, "x"},
            {0171, "y"},
```

### OctalLiteral
Octal integer `0170`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0166, "v"},
            {0167, "w"},
            {0170, "x"},
            {0171, "y"},
            {0375, "yacute"},
```

### OctalLiteral
Octal integer `0171`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0167, "w"},
            {0170, "x"},
            {0171, "y"},
            {0375, "yacute"},
            {0377, "ydieresis"},
```

### OctalLiteral
Octal integer `0375`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0170, "x"},
            {0171, "y"},
            {0375, "yacute"},
            {0377, "ydieresis"},
            {0245, "yen"},
```

### OctalLiteral
Octal integer `0377`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0171, "y"},
            {0375, "yacute"},
            {0377, "ydieresis"},
            {0245, "yen"},
            {0172, "z"},
```

### OctalLiteral
Octal integer `0245`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0375, "yacute"},
            {0377, "ydieresis"},
            {0245, "yen"},
            {0172, "z"},
            {0236, "zcaron"},
```

### OctalLiteral
Octal integer `0172`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0377, "ydieresis"},
            {0245, "yen"},
            {0172, "z"},
            {0236, "zcaron"},
            {060, "zero"},
```

### OctalLiteral
Octal integer `0236`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0245, "yen"},
            {0172, "z"},
            {0236, "zcaron"},
            {060, "zero"},
            // adding some additional mappings as defined in Appendix D of the pdf spec
```

### OctalLiteral
Octal integer `060`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {0172, "z"},
            {0236, "zcaron"},
            {060, "zero"},
            // adding some additional mappings as defined in Appendix D of the pdf spec
            {0240, "nbspace"},
```

### OctalLiteral
Octal integer `0240`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            {060, "zero"},
            // adding some additional mappings as defined in Appendix D of the pdf spec
            {0240, "nbspace"},
            {0255, "sfthyphen"}
    };
```

### OctalLiteral
Octal integer `0255`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/WinAnsiEncoding.java`
#### Snippet
```java
            // adding some additional mappings as defined in Appendix D of the pdf spec
            {0240, "nbspace"},
            {0255, "sfthyphen"}
    };

```

### OctalLiteral
Octal integer `0276`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
     */
    private static final Object[][] MAC_EXPERT_ENCODING_TABLE = {
        {0276, "AEsmall"},
        {0207, "Aacutesmall"},
        {0211, "Acircumflexsmall"},
```

### OctalLiteral
Octal integer `0207`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
    private static final Object[][] MAC_EXPERT_ENCODING_TABLE = {
        {0276, "AEsmall"},
        {0207, "Aacutesmall"},
        {0211, "Acircumflexsmall"},
        {047, "Acutesmall"},
```

### OctalLiteral
Octal integer `0211`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0276, "AEsmall"},
        {0207, "Aacutesmall"},
        {0211, "Acircumflexsmall"},
        {047, "Acutesmall"},
        {0212, "Adieresissmall"},
```

### OctalLiteral
Octal integer `047`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0207, "Aacutesmall"},
        {0211, "Acircumflexsmall"},
        {047, "Acutesmall"},
        {0212, "Adieresissmall"},
        {0210, "Agravesmall"},
```

### OctalLiteral
Octal integer `0212`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0211, "Acircumflexsmall"},
        {047, "Acutesmall"},
        {0212, "Adieresissmall"},
        {0210, "Agravesmall"},
        {0214, "Aringsmall"},
```

### OctalLiteral
Octal integer `0210`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {047, "Acutesmall"},
        {0212, "Adieresissmall"},
        {0210, "Agravesmall"},
        {0214, "Aringsmall"},
        {0141, "Asmall"},
```

### OctalLiteral
Octal integer `0214`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0212, "Adieresissmall"},
        {0210, "Agravesmall"},
        {0214, "Aringsmall"},
        {0141, "Asmall"},
        {0213, "Atildesmall"},
```

### OctalLiteral
Octal integer `0141`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0210, "Agravesmall"},
        {0214, "Aringsmall"},
        {0141, "Asmall"},
        {0213, "Atildesmall"},
        {0363, "Brevesmall"},
```

### OctalLiteral
Octal integer `0213`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0214, "Aringsmall"},
        {0141, "Asmall"},
        {0213, "Atildesmall"},
        {0363, "Brevesmall"},
        {0142, "Bsmall"},
```

### OctalLiteral
Octal integer `0363`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0141, "Asmall"},
        {0213, "Atildesmall"},
        {0363, "Brevesmall"},
        {0142, "Bsmall"},
        {0256, "Caronsmall"},
```

### OctalLiteral
Octal integer `0142`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0213, "Atildesmall"},
        {0363, "Brevesmall"},
        {0142, "Bsmall"},
        {0256, "Caronsmall"},
        {0215, "Ccedillasmall"},
```

### OctalLiteral
Octal integer `0256`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0363, "Brevesmall"},
        {0142, "Bsmall"},
        {0256, "Caronsmall"},
        {0215, "Ccedillasmall"},
        {0311, "Cedillasmall"},
```

### OctalLiteral
Octal integer `0215`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0142, "Bsmall"},
        {0256, "Caronsmall"},
        {0215, "Ccedillasmall"},
        {0311, "Cedillasmall"},
        {0136, "Circumflexsmall"},
```

### OctalLiteral
Octal integer `0311`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0256, "Caronsmall"},
        {0215, "Ccedillasmall"},
        {0311, "Cedillasmall"},
        {0136, "Circumflexsmall"},
        {0143, "Csmall"},
```

### OctalLiteral
Octal integer `0136`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0215, "Ccedillasmall"},
        {0311, "Cedillasmall"},
        {0136, "Circumflexsmall"},
        {0143, "Csmall"},
        {0254, "Dieresissmall"},
```

### OctalLiteral
Octal integer `0143`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0311, "Cedillasmall"},
        {0136, "Circumflexsmall"},
        {0143, "Csmall"},
        {0254, "Dieresissmall"},
        {0372, "Dotaccentsmall"},
```

### OctalLiteral
Octal integer `0254`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0136, "Circumflexsmall"},
        {0143, "Csmall"},
        {0254, "Dieresissmall"},
        {0372, "Dotaccentsmall"},
        {0144, "Dsmall"},
```

### OctalLiteral
Octal integer `0372`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0143, "Csmall"},
        {0254, "Dieresissmall"},
        {0372, "Dotaccentsmall"},
        {0144, "Dsmall"},
        {0216, "Eacutesmall"},
```

### OctalLiteral
Octal integer `0144`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0254, "Dieresissmall"},
        {0372, "Dotaccentsmall"},
        {0144, "Dsmall"},
        {0216, "Eacutesmall"},
        {0220, "Ecircumflexsmall"},
```

### OctalLiteral
Octal integer `0216`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0372, "Dotaccentsmall"},
        {0144, "Dsmall"},
        {0216, "Eacutesmall"},
        {0220, "Ecircumflexsmall"},
        {0221, "Edieresissmall"},
```

### OctalLiteral
Octal integer `0220`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0144, "Dsmall"},
        {0216, "Eacutesmall"},
        {0220, "Ecircumflexsmall"},
        {0221, "Edieresissmall"},
        {0217, "Egravesmall"},
```

### OctalLiteral
Octal integer `0221`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0216, "Eacutesmall"},
        {0220, "Ecircumflexsmall"},
        {0221, "Edieresissmall"},
        {0217, "Egravesmall"},
        {0145, "Esmall"},
```

### OctalLiteral
Octal integer `0217`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0220, "Ecircumflexsmall"},
        {0221, "Edieresissmall"},
        {0217, "Egravesmall"},
        {0145, "Esmall"},
        {0104, "Ethsmall"},
```

### OctalLiteral
Octal integer `0145`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0221, "Edieresissmall"},
        {0217, "Egravesmall"},
        {0145, "Esmall"},
        {0104, "Ethsmall"},
        {0146, "Fsmall"},
```

### OctalLiteral
Octal integer `0104`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0217, "Egravesmall"},
        {0145, "Esmall"},
        {0104, "Ethsmall"},
        {0146, "Fsmall"},
        {0140, "Gravesmall"},
```

### OctalLiteral
Octal integer `0146`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0145, "Esmall"},
        {0104, "Ethsmall"},
        {0146, "Fsmall"},
        {0140, "Gravesmall"},
        {0147, "Gsmall"},
```

### OctalLiteral
Octal integer `0140`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0104, "Ethsmall"},
        {0146, "Fsmall"},
        {0140, "Gravesmall"},
        {0147, "Gsmall"},
        {0150, "Hsmall"},
```

### OctalLiteral
Octal integer `0147`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0146, "Fsmall"},
        {0140, "Gravesmall"},
        {0147, "Gsmall"},
        {0150, "Hsmall"},
        {042, "Hungarumlautsmall"},
```

### OctalLiteral
Octal integer `0150`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0140, "Gravesmall"},
        {0147, "Gsmall"},
        {0150, "Hsmall"},
        {042, "Hungarumlautsmall"},
        {0222, "Iacutesmall"},
```

### OctalLiteral
Octal integer `042`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0147, "Gsmall"},
        {0150, "Hsmall"},
        {042, "Hungarumlautsmall"},
        {0222, "Iacutesmall"},
        {0224, "Icircumflexsmall"},
```

### OctalLiteral
Octal integer `0222`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0150, "Hsmall"},
        {042, "Hungarumlautsmall"},
        {0222, "Iacutesmall"},
        {0224, "Icircumflexsmall"},
        {0225, "Idieresissmall"},
```

### OctalLiteral
Octal integer `0224`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {042, "Hungarumlautsmall"},
        {0222, "Iacutesmall"},
        {0224, "Icircumflexsmall"},
        {0225, "Idieresissmall"},
        {0223, "Igravesmall"},
```

### OctalLiteral
Octal integer `0225`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0222, "Iacutesmall"},
        {0224, "Icircumflexsmall"},
        {0225, "Idieresissmall"},
        {0223, "Igravesmall"},
        {0151, "Ismall"},
```

### OctalLiteral
Octal integer `0223`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0224, "Icircumflexsmall"},
        {0225, "Idieresissmall"},
        {0223, "Igravesmall"},
        {0151, "Ismall"},
        {0152, "Jsmall"},
```

### OctalLiteral
Octal integer `0151`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0225, "Idieresissmall"},
        {0223, "Igravesmall"},
        {0151, "Ismall"},
        {0152, "Jsmall"},
        {0153, "Ksmall"},
```

### OctalLiteral
Octal integer `0152`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0223, "Igravesmall"},
        {0151, "Ismall"},
        {0152, "Jsmall"},
        {0153, "Ksmall"},
        {0302, "Lslashsmall"},
```

### OctalLiteral
Octal integer `0153`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0151, "Ismall"},
        {0152, "Jsmall"},
        {0153, "Ksmall"},
        {0302, "Lslashsmall"},
        {0154, "Lsmall"},
```

### OctalLiteral
Octal integer `0302`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0152, "Jsmall"},
        {0153, "Ksmall"},
        {0302, "Lslashsmall"},
        {0154, "Lsmall"},
        {0364, "Macronsmall"},
```

### OctalLiteral
Octal integer `0154`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0153, "Ksmall"},
        {0302, "Lslashsmall"},
        {0154, "Lsmall"},
        {0364, "Macronsmall"},
        {0155, "Msmall"},
```

### OctalLiteral
Octal integer `0364`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0302, "Lslashsmall"},
        {0154, "Lsmall"},
        {0364, "Macronsmall"},
        {0155, "Msmall"},
        {0156, "Nsmall"},
```

### OctalLiteral
Octal integer `0155`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0154, "Lsmall"},
        {0364, "Macronsmall"},
        {0155, "Msmall"},
        {0156, "Nsmall"},
        {0226, "Ntildesmall"},
```

### OctalLiteral
Octal integer `0156`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0364, "Macronsmall"},
        {0155, "Msmall"},
        {0156, "Nsmall"},
        {0226, "Ntildesmall"},
        {0317, "OEsmall"},
```

### OctalLiteral
Octal integer `0226`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0155, "Msmall"},
        {0156, "Nsmall"},
        {0226, "Ntildesmall"},
        {0317, "OEsmall"},
        {0227, "Oacutesmall"},
```

### OctalLiteral
Octal integer `0317`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0156, "Nsmall"},
        {0226, "Ntildesmall"},
        {0317, "OEsmall"},
        {0227, "Oacutesmall"},
        {0231, "Ocircumflexsmall"},
```

### OctalLiteral
Octal integer `0227`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0226, "Ntildesmall"},
        {0317, "OEsmall"},
        {0227, "Oacutesmall"},
        {0231, "Ocircumflexsmall"},
        {0232, "Odieresissmall"},
```

### OctalLiteral
Octal integer `0231`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0317, "OEsmall"},
        {0227, "Oacutesmall"},
        {0231, "Ocircumflexsmall"},
        {0232, "Odieresissmall"},
        {0362, "Ogoneksmall"},
```

### OctalLiteral
Octal integer `0232`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0227, "Oacutesmall"},
        {0231, "Ocircumflexsmall"},
        {0232, "Odieresissmall"},
        {0362, "Ogoneksmall"},
        {0230, "Ogravesmall"},
```

### OctalLiteral
Octal integer `0362`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0231, "Ocircumflexsmall"},
        {0232, "Odieresissmall"},
        {0362, "Ogoneksmall"},
        {0230, "Ogravesmall"},
        {0277, "Oslashsmall"},
```

### OctalLiteral
Octal integer `0230`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0232, "Odieresissmall"},
        {0362, "Ogoneksmall"},
        {0230, "Ogravesmall"},
        {0277, "Oslashsmall"},
        {0157, "Osmall"},
```

### OctalLiteral
Octal integer `0277`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0362, "Ogoneksmall"},
        {0230, "Ogravesmall"},
        {0277, "Oslashsmall"},
        {0157, "Osmall"},
        {0233, "Otildesmall"},
```

### OctalLiteral
Octal integer `0157`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0230, "Ogravesmall"},
        {0277, "Oslashsmall"},
        {0157, "Osmall"},
        {0233, "Otildesmall"},
        {0160, "Psmall"},
```

### OctalLiteral
Octal integer `0233`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0277, "Oslashsmall"},
        {0157, "Osmall"},
        {0233, "Otildesmall"},
        {0160, "Psmall"},
        {0161, "Qsmall"},
```

### OctalLiteral
Octal integer `0160`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0157, "Osmall"},
        {0233, "Otildesmall"},
        {0160, "Psmall"},
        {0161, "Qsmall"},
        {0373, "Ringsmall"},
```

### OctalLiteral
Octal integer `0161`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0233, "Otildesmall"},
        {0160, "Psmall"},
        {0161, "Qsmall"},
        {0373, "Ringsmall"},
        {0162, "Rsmall"},
```

### OctalLiteral
Octal integer `0373`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0160, "Psmall"},
        {0161, "Qsmall"},
        {0373, "Ringsmall"},
        {0162, "Rsmall"},
        {0247, "Scaronsmall"},
```

### OctalLiteral
Octal integer `0162`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0161, "Qsmall"},
        {0373, "Ringsmall"},
        {0162, "Rsmall"},
        {0247, "Scaronsmall"},
        {0163, "Ssmall"},
```

### OctalLiteral
Octal integer `0247`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0373, "Ringsmall"},
        {0162, "Rsmall"},
        {0247, "Scaronsmall"},
        {0163, "Ssmall"},
        {0271, "Thornsmall"},
```

### OctalLiteral
Octal integer `0163`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0162, "Rsmall"},
        {0247, "Scaronsmall"},
        {0163, "Ssmall"},
        {0271, "Thornsmall"},
        {0176, "Tildesmall"},
```

### OctalLiteral
Octal integer `0271`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0247, "Scaronsmall"},
        {0163, "Ssmall"},
        {0271, "Thornsmall"},
        {0176, "Tildesmall"},
        {0164, "Tsmall"},
```

### OctalLiteral
Octal integer `0176`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0163, "Ssmall"},
        {0271, "Thornsmall"},
        {0176, "Tildesmall"},
        {0164, "Tsmall"},
        {0234, "Uacutesmall"},
```

### OctalLiteral
Octal integer `0164`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0271, "Thornsmall"},
        {0176, "Tildesmall"},
        {0164, "Tsmall"},
        {0234, "Uacutesmall"},
        {0236, "Ucircumflexsmall"},
```

### OctalLiteral
Octal integer `0234`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0176, "Tildesmall"},
        {0164, "Tsmall"},
        {0234, "Uacutesmall"},
        {0236, "Ucircumflexsmall"},
        {0237, "Udieresissmall"},
```

### OctalLiteral
Octal integer `0236`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0164, "Tsmall"},
        {0234, "Uacutesmall"},
        {0236, "Ucircumflexsmall"},
        {0237, "Udieresissmall"},
        {0235, "Ugravesmall"},
```

### OctalLiteral
Octal integer `0237`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0234, "Uacutesmall"},
        {0236, "Ucircumflexsmall"},
        {0237, "Udieresissmall"},
        {0235, "Ugravesmall"},
        {0165, "Usmall"},
```

### OctalLiteral
Octal integer `0235`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0236, "Ucircumflexsmall"},
        {0237, "Udieresissmall"},
        {0235, "Ugravesmall"},
        {0165, "Usmall"},
        {0166, "Vsmall"},
```

### OctalLiteral
Octal integer `0165`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0237, "Udieresissmall"},
        {0235, "Ugravesmall"},
        {0165, "Usmall"},
        {0166, "Vsmall"},
        {0167, "Wsmall"},
```

### OctalLiteral
Octal integer `0166`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0235, "Ugravesmall"},
        {0165, "Usmall"},
        {0166, "Vsmall"},
        {0167, "Wsmall"},
        {0170, "Xsmall"},
```

### OctalLiteral
Octal integer `0167`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0165, "Usmall"},
        {0166, "Vsmall"},
        {0167, "Wsmall"},
        {0170, "Xsmall"},
        {0264, "Yacutesmall"},
```

### OctalLiteral
Octal integer `0170`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0166, "Vsmall"},
        {0167, "Wsmall"},
        {0170, "Xsmall"},
        {0264, "Yacutesmall"},
        {0330, "Ydieresissmall"},
```

### OctalLiteral
Octal integer `0264`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0167, "Wsmall"},
        {0170, "Xsmall"},
        {0264, "Yacutesmall"},
        {0330, "Ydieresissmall"},
        {0171, "Ysmall"},
```

### OctalLiteral
Octal integer `0330`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0170, "Xsmall"},
        {0264, "Yacutesmall"},
        {0330, "Ydieresissmall"},
        {0171, "Ysmall"},
        {0275, "Zcaronsmall"},
```

### OctalLiteral
Octal integer `0171`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0264, "Yacutesmall"},
        {0330, "Ydieresissmall"},
        {0171, "Ysmall"},
        {0275, "Zcaronsmall"},
        {0172, "Zsmall"},
```

### OctalLiteral
Octal integer `0275`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0330, "Ydieresissmall"},
        {0171, "Ysmall"},
        {0275, "Zcaronsmall"},
        {0172, "Zsmall"},
        {046, "ampersandsmall"},
```

### OctalLiteral
Octal integer `0172`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0171, "Ysmall"},
        {0275, "Zcaronsmall"},
        {0172, "Zsmall"},
        {046, "ampersandsmall"},
        {0201, "asuperior"},
```

### OctalLiteral
Octal integer `046`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0275, "Zcaronsmall"},
        {0172, "Zsmall"},
        {046, "ampersandsmall"},
        {0201, "asuperior"},
        {0365, "bsuperior"},
```

### OctalLiteral
Octal integer `0201`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0172, "Zsmall"},
        {046, "ampersandsmall"},
        {0201, "asuperior"},
        {0365, "bsuperior"},
        {0251, "centinferior"},
```

### OctalLiteral
Octal integer `0365`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {046, "ampersandsmall"},
        {0201, "asuperior"},
        {0365, "bsuperior"},
        {0251, "centinferior"},
        {043, "centoldstyle"},
```

### OctalLiteral
Octal integer `0251`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0201, "asuperior"},
        {0365, "bsuperior"},
        {0251, "centinferior"},
        {043, "centoldstyle"},
        {0202, "centsuperior"},
```

### OctalLiteral
Octal integer `043`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0365, "bsuperior"},
        {0251, "centinferior"},
        {043, "centoldstyle"},
        {0202, "centsuperior"},
        {072, "colon"},
```

### OctalLiteral
Octal integer `0202`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0251, "centinferior"},
        {043, "centoldstyle"},
        {0202, "centsuperior"},
        {072, "colon"},
        {0173, "colonmonetary"},
```

### OctalLiteral
Octal integer `072`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {043, "centoldstyle"},
        {0202, "centsuperior"},
        {072, "colon"},
        {0173, "colonmonetary"},
        {054, "comma"},
```

### OctalLiteral
Octal integer `0173`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0202, "centsuperior"},
        {072, "colon"},
        {0173, "colonmonetary"},
        {054, "comma"},
        {0262, "commainferior"},
```

### OctalLiteral
Octal integer `054`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {072, "colon"},
        {0173, "colonmonetary"},
        {054, "comma"},
        {0262, "commainferior"},
        {0370, "commasuperior"},
```

### OctalLiteral
Octal integer `0262`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0173, "colonmonetary"},
        {054, "comma"},
        {0262, "commainferior"},
        {0370, "commasuperior"},
        {0266, "dollarinferior"},
```

### OctalLiteral
Octal integer `0370`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {054, "comma"},
        {0262, "commainferior"},
        {0370, "commasuperior"},
        {0266, "dollarinferior"},
        {044, "dollaroldstyle"},
```

### OctalLiteral
Octal integer `0266`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0262, "commainferior"},
        {0370, "commasuperior"},
        {0266, "dollarinferior"},
        {044, "dollaroldstyle"},
        {045, "dollarsuperior"},
```

### OctalLiteral
Octal integer `044`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0370, "commasuperior"},
        {0266, "dollarinferior"},
        {044, "dollaroldstyle"},
        {045, "dollarsuperior"},
        {0353, "dsuperior"},
```

### OctalLiteral
Octal integer `045`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0266, "dollarinferior"},
        {044, "dollaroldstyle"},
        {045, "dollarsuperior"},
        {0353, "dsuperior"},
        {0245, "eightinferior"},
```

### OctalLiteral
Octal integer `0353`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {044, "dollaroldstyle"},
        {045, "dollarsuperior"},
        {0353, "dsuperior"},
        {0245, "eightinferior"},
        {070, "eightoldstyle"},
```

### OctalLiteral
Octal integer `0245`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {045, "dollarsuperior"},
        {0353, "dsuperior"},
        {0245, "eightinferior"},
        {070, "eightoldstyle"},
        {0241, "eightsuperior"},
```

### OctalLiteral
Octal integer `070`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0353, "dsuperior"},
        {0245, "eightinferior"},
        {070, "eightoldstyle"},
        {0241, "eightsuperior"},
        {0344, "esuperior"},
```

### OctalLiteral
Octal integer `0241`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0245, "eightinferior"},
        {070, "eightoldstyle"},
        {0241, "eightsuperior"},
        {0344, "esuperior"},
        {0326, "exclamdownsmall"},
```

### OctalLiteral
Octal integer `0344`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {070, "eightoldstyle"},
        {0241, "eightsuperior"},
        {0344, "esuperior"},
        {0326, "exclamdownsmall"},
        {041, "exclamsmall"},
```

### OctalLiteral
Octal integer `0326`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0241, "eightsuperior"},
        {0344, "esuperior"},
        {0326, "exclamdownsmall"},
        {041, "exclamsmall"},
        {0126, "ff"},
```

### OctalLiteral
Octal integer `041`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0344, "esuperior"},
        {0326, "exclamdownsmall"},
        {041, "exclamsmall"},
        {0126, "ff"},
        {0131, "ffi"},
```

### OctalLiteral
Octal integer `0126`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0326, "exclamdownsmall"},
        {041, "exclamsmall"},
        {0126, "ff"},
        {0131, "ffi"},
        {0132, "ffl"},
```

### OctalLiteral
Octal integer `0131`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {041, "exclamsmall"},
        {0126, "ff"},
        {0131, "ffi"},
        {0132, "ffl"},
        {0127, "fi"},
```

### OctalLiteral
Octal integer `0132`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0126, "ff"},
        {0131, "ffi"},
        {0132, "ffl"},
        {0127, "fi"},
        {0320, "figuredash"},
```

### OctalLiteral
Octal integer `0127`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0131, "ffi"},
        {0132, "ffl"},
        {0127, "fi"},
        {0320, "figuredash"},
        {0114, "fiveeighths"},
```

### OctalLiteral
Octal integer `0320`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0132, "ffl"},
        {0127, "fi"},
        {0320, "figuredash"},
        {0114, "fiveeighths"},
        {0260, "fiveinferior"},
```

### OctalLiteral
Octal integer `0114`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0127, "fi"},
        {0320, "figuredash"},
        {0114, "fiveeighths"},
        {0260, "fiveinferior"},
        {065, "fiveoldstyle"},
```

### OctalLiteral
Octal integer `0260`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0320, "figuredash"},
        {0114, "fiveeighths"},
        {0260, "fiveinferior"},
        {065, "fiveoldstyle"},
        {0336, "fivesuperior"},
```

### OctalLiteral
Octal integer `065`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0114, "fiveeighths"},
        {0260, "fiveinferior"},
        {065, "fiveoldstyle"},
        {0336, "fivesuperior"},
        {0130, "fl"},
```

### OctalLiteral
Octal integer `0336`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0260, "fiveinferior"},
        {065, "fiveoldstyle"},
        {0336, "fivesuperior"},
        {0130, "fl"},
        {0242, "fourinferior"},
```

### OctalLiteral
Octal integer `0130`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {065, "fiveoldstyle"},
        {0336, "fivesuperior"},
        {0130, "fl"},
        {0242, "fourinferior"},
        {064, "fouroldstyle"},
```

### OctalLiteral
Octal integer `0242`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0336, "fivesuperior"},
        {0130, "fl"},
        {0242, "fourinferior"},
        {064, "fouroldstyle"},
        {0335, "foursuperior"},
```

### OctalLiteral
Octal integer `064`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0130, "fl"},
        {0242, "fourinferior"},
        {064, "fouroldstyle"},
        {0335, "foursuperior"},
        {057, "fraction"},
```

### OctalLiteral
Octal integer `0335`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0242, "fourinferior"},
        {064, "fouroldstyle"},
        {0335, "foursuperior"},
        {057, "fraction"},
        {055, "hyphen"},
```

### OctalLiteral
Octal integer `057`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {064, "fouroldstyle"},
        {0335, "foursuperior"},
        {057, "fraction"},
        {055, "hyphen"},
        {0137, "hypheninferior"},
```

### OctalLiteral
Octal integer `055`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0335, "foursuperior"},
        {057, "fraction"},
        {055, "hyphen"},
        {0137, "hypheninferior"},
        {0321, "hyphensuperior"},
```

### OctalLiteral
Octal integer `0137`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {057, "fraction"},
        {055, "hyphen"},
        {0137, "hypheninferior"},
        {0321, "hyphensuperior"},
        {0351, "isuperior"},
```

### OctalLiteral
Octal integer `0321`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {055, "hyphen"},
        {0137, "hypheninferior"},
        {0321, "hyphensuperior"},
        {0351, "isuperior"},
        {0361, "lsuperior"},
```

### OctalLiteral
Octal integer `0351`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0137, "hypheninferior"},
        {0321, "hyphensuperior"},
        {0351, "isuperior"},
        {0361, "lsuperior"},
        {0367, "msuperior"},
```

### OctalLiteral
Octal integer `0361`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0321, "hyphensuperior"},
        {0351, "isuperior"},
        {0361, "lsuperior"},
        {0367, "msuperior"},
        {0273, "nineinferior"},
```

### OctalLiteral
Octal integer `0367`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0351, "isuperior"},
        {0361, "lsuperior"},
        {0367, "msuperior"},
        {0273, "nineinferior"},
        {071, "nineoldstyle"},
```

### OctalLiteral
Octal integer `0273`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0361, "lsuperior"},
        {0367, "msuperior"},
        {0273, "nineinferior"},
        {071, "nineoldstyle"},
        {0341, "ninesuperior"},
```

### OctalLiteral
Octal integer `071`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0367, "msuperior"},
        {0273, "nineinferior"},
        {071, "nineoldstyle"},
        {0341, "ninesuperior"},
        {0366, "nsuperior"},
```

### OctalLiteral
Octal integer `0341`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0273, "nineinferior"},
        {071, "nineoldstyle"},
        {0341, "ninesuperior"},
        {0366, "nsuperior"},
        {053, "onedotenleader"},
```

### OctalLiteral
Octal integer `0366`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {071, "nineoldstyle"},
        {0341, "ninesuperior"},
        {0366, "nsuperior"},
        {053, "onedotenleader"},
        {0112, "oneeighth"},
```

### OctalLiteral
Octal integer `053`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0341, "ninesuperior"},
        {0366, "nsuperior"},
        {053, "onedotenleader"},
        {0112, "oneeighth"},
        {0174, "onefitted"},
```

### OctalLiteral
Octal integer `0112`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0366, "nsuperior"},
        {053, "onedotenleader"},
        {0112, "oneeighth"},
        {0174, "onefitted"},
        {0110, "onehalf"},
```

### OctalLiteral
Octal integer `0174`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {053, "onedotenleader"},
        {0112, "oneeighth"},
        {0174, "onefitted"},
        {0110, "onehalf"},
        {0301, "oneinferior"},
```

### OctalLiteral
Octal integer `0110`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0112, "oneeighth"},
        {0174, "onefitted"},
        {0110, "onehalf"},
        {0301, "oneinferior"},
        {061, "oneoldstyle"},
```

### OctalLiteral
Octal integer `0301`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0174, "onefitted"},
        {0110, "onehalf"},
        {0301, "oneinferior"},
        {061, "oneoldstyle"},
        {0107, "onequarter"},
```

### OctalLiteral
Octal integer `061`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0110, "onehalf"},
        {0301, "oneinferior"},
        {061, "oneoldstyle"},
        {0107, "onequarter"},
        {0332, "onesuperior"},
```

### OctalLiteral
Octal integer `0107`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0301, "oneinferior"},
        {061, "oneoldstyle"},
        {0107, "onequarter"},
        {0332, "onesuperior"},
        {0116, "onethird"},
```

### OctalLiteral
Octal integer `0332`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {061, "oneoldstyle"},
        {0107, "onequarter"},
        {0332, "onesuperior"},
        {0116, "onethird"},
        {0257, "osuperior"},
```

### OctalLiteral
Octal integer `0116`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0107, "onequarter"},
        {0332, "onesuperior"},
        {0116, "onethird"},
        {0257, "osuperior"},
        {0133, "parenleftinferior"},
```

### OctalLiteral
Octal integer `0257`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0332, "onesuperior"},
        {0116, "onethird"},
        {0257, "osuperior"},
        {0133, "parenleftinferior"},
        {050, "parenleftsuperior"},
```

### OctalLiteral
Octal integer `0101`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
     */
    private static final Object[][] STANDARD_ENCODING_TABLE = {
            {0101, "A"},
            {0341, "AE"},
            {0102, "B"},
```

### OctalLiteral
Octal integer `0341`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
    private static final Object[][] STANDARD_ENCODING_TABLE = {
            {0101, "A"},
            {0341, "AE"},
            {0102, "B"},
            {0103, "C"},
```

### OctalLiteral
Octal integer `0102`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0101, "A"},
            {0341, "AE"},
            {0102, "B"},
            {0103, "C"},
            {0104, "D"},
```

### OctalLiteral
Octal integer `0103`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0341, "AE"},
            {0102, "B"},
            {0103, "C"},
            {0104, "D"},
            {0105, "E"},
```

### OctalLiteral
Octal integer `0104`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0102, "B"},
            {0103, "C"},
            {0104, "D"},
            {0105, "E"},
            {0106, "F"},
```

### OctalLiteral
Octal integer `0105`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0103, "C"},
            {0104, "D"},
            {0105, "E"},
            {0106, "F"},
            {0107, "G"},
```

### OctalLiteral
Octal integer `0106`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0104, "D"},
            {0105, "E"},
            {0106, "F"},
            {0107, "G"},
            {0110, "H"},
```

### OctalLiteral
Octal integer `0107`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0105, "E"},
            {0106, "F"},
            {0107, "G"},
            {0110, "H"},
            {0111, "I"},
```

### OctalLiteral
Octal integer `0110`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0106, "F"},
            {0107, "G"},
            {0110, "H"},
            {0111, "I"},
            {0112, "J"},
```

### OctalLiteral
Octal integer `0111`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0107, "G"},
            {0110, "H"},
            {0111, "I"},
            {0112, "J"},
            {0113, "K"},
```

### OctalLiteral
Octal integer `0112`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0110, "H"},
            {0111, "I"},
            {0112, "J"},
            {0113, "K"},
            {0114, "L"},
```

### OctalLiteral
Octal integer `0113`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0111, "I"},
            {0112, "J"},
            {0113, "K"},
            {0114, "L"},
            {0350, "Lslash"},
```

### OctalLiteral
Octal integer `0114`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0112, "J"},
            {0113, "K"},
            {0114, "L"},
            {0350, "Lslash"},
            {0115, "M"},
```

### OctalLiteral
Octal integer `0350`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0113, "K"},
            {0114, "L"},
            {0350, "Lslash"},
            {0115, "M"},
            {0116, "N"},
```

### OctalLiteral
Octal integer `0115`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0114, "L"},
            {0350, "Lslash"},
            {0115, "M"},
            {0116, "N"},
            {0117, "O"},
```

### OctalLiteral
Octal integer `0133`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0116, "onethird"},
        {0257, "osuperior"},
        {0133, "parenleftinferior"},
        {050, "parenleftsuperior"},
        {0135, "parenrightinferior"},
```

### OctalLiteral
Octal integer `050`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0257, "osuperior"},
        {0133, "parenleftinferior"},
        {050, "parenleftsuperior"},
        {0135, "parenrightinferior"},
        {051, "parenrightsuperior"},
```

### OctalLiteral
Octal integer `0135`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0133, "parenleftinferior"},
        {050, "parenleftsuperior"},
        {0135, "parenrightinferior"},
        {051, "parenrightsuperior"},
        {056, "period"},
```

### OctalLiteral
Octal integer `051`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {050, "parenleftsuperior"},
        {0135, "parenrightinferior"},
        {051, "parenrightsuperior"},
        {056, "period"},
        {0263, "periodinferior"},
```

### OctalLiteral
Octal integer `056`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0135, "parenrightinferior"},
        {051, "parenrightsuperior"},
        {056, "period"},
        {0263, "periodinferior"},
        {0371, "periodsuperior"},
```

### OctalLiteral
Octal integer `0263`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {051, "parenrightsuperior"},
        {056, "period"},
        {0263, "periodinferior"},
        {0371, "periodsuperior"},
        {0300, "questiondownsmall"},
```

### OctalLiteral
Octal integer `0371`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {056, "period"},
        {0263, "periodinferior"},
        {0371, "periodsuperior"},
        {0300, "questiondownsmall"},
        {077, "questionsmall"},
```

### OctalLiteral
Octal integer `0300`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0263, "periodinferior"},
        {0371, "periodsuperior"},
        {0300, "questiondownsmall"},
        {077, "questionsmall"},
        {0345, "rsuperior"},
```

### OctalLiteral
Octal integer `077`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0371, "periodsuperior"},
        {0300, "questiondownsmall"},
        {077, "questionsmall"},
        {0345, "rsuperior"},
        {0175, "rupiah"},
```

### OctalLiteral
Octal integer `0345`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0300, "questiondownsmall"},
        {077, "questionsmall"},
        {0345, "rsuperior"},
        {0175, "rupiah"},
        {073, "semicolon"},
```

### OctalLiteral
Octal integer `0175`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {077, "questionsmall"},
        {0345, "rsuperior"},
        {0175, "rupiah"},
        {073, "semicolon"},
        {0115, "seveneighths"},
```

### OctalLiteral
Octal integer `073`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0345, "rsuperior"},
        {0175, "rupiah"},
        {073, "semicolon"},
        {0115, "seveneighths"},
        {0246, "seveninferior"},
```

### OctalLiteral
Octal integer `0115`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0175, "rupiah"},
        {073, "semicolon"},
        {0115, "seveneighths"},
        {0246, "seveninferior"},
        {067, "sevenoldstyle"},
```

### OctalLiteral
Octal integer `0246`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {073, "semicolon"},
        {0115, "seveneighths"},
        {0246, "seveninferior"},
        {067, "sevenoldstyle"},
        {0340, "sevensuperior"},
```

### OctalLiteral
Octal integer `067`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0115, "seveneighths"},
        {0246, "seveninferior"},
        {067, "sevenoldstyle"},
        {0340, "sevensuperior"},
        {0244, "sixinferior"},
```

### OctalLiteral
Octal integer `0340`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0246, "seveninferior"},
        {067, "sevenoldstyle"},
        {0340, "sevensuperior"},
        {0244, "sixinferior"},
        {066, "sixoldstyle"},
```

### OctalLiteral
Octal integer `0244`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {067, "sevenoldstyle"},
        {0340, "sevensuperior"},
        {0244, "sixinferior"},
        {066, "sixoldstyle"},
        {0337, "sixsuperior"},
```

### OctalLiteral
Octal integer `066`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0340, "sevensuperior"},
        {0244, "sixinferior"},
        {066, "sixoldstyle"},
        {0337, "sixsuperior"},
        {040, "space"},
```

### OctalLiteral
Octal integer `0337`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0244, "sixinferior"},
        {066, "sixoldstyle"},
        {0337, "sixsuperior"},
        {040, "space"},
        {0352, "ssuperior"},
```

### OctalLiteral
Octal integer `040`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {066, "sixoldstyle"},
        {0337, "sixsuperior"},
        {040, "space"},
        {0352, "ssuperior"},
        {0113, "threeeighths"},
```

### OctalLiteral
Octal integer `0116`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0350, "Lslash"},
            {0115, "M"},
            {0116, "N"},
            {0117, "O"},
            {0352, "OE"},
```

### OctalLiteral
Octal integer `0352`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0337, "sixsuperior"},
        {040, "space"},
        {0352, "ssuperior"},
        {0113, "threeeighths"},
        {0243, "threeinferior"},
```

### OctalLiteral
Octal integer `0113`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {040, "space"},
        {0352, "ssuperior"},
        {0113, "threeeighths"},
        {0243, "threeinferior"},
        {063, "threeoldstyle"},
```

### OctalLiteral
Octal integer `0243`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0352, "ssuperior"},
        {0113, "threeeighths"},
        {0243, "threeinferior"},
        {063, "threeoldstyle"},
        {0111, "threequarters"},
```

### OctalLiteral
Octal integer `063`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0113, "threeeighths"},
        {0243, "threeinferior"},
        {063, "threeoldstyle"},
        {0111, "threequarters"},
        {075, "threequartersemdash"},
```

### OctalLiteral
Octal integer `0111`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0243, "threeinferior"},
        {063, "threeoldstyle"},
        {0111, "threequarters"},
        {075, "threequartersemdash"},
        {0334, "threesuperior"},
```

### OctalLiteral
Octal integer `0117`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0115, "M"},
            {0116, "N"},
            {0117, "O"},
            {0352, "OE"},
            {0351, "Oslash"},
```

### OctalLiteral
Octal integer `075`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {063, "threeoldstyle"},
        {0111, "threequarters"},
        {075, "threequartersemdash"},
        {0334, "threesuperior"},
        {0346, "tsuperior"},
```

### OctalLiteral
Octal integer `0352`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0116, "N"},
            {0117, "O"},
            {0352, "OE"},
            {0351, "Oslash"},
            {0120, "P"},
```

### OctalLiteral
Octal integer `0334`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0111, "threequarters"},
        {075, "threequartersemdash"},
        {0334, "threesuperior"},
        {0346, "tsuperior"},
        {052, "twodotenleader"},
```

### OctalLiteral
Octal integer `0351`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0117, "O"},
            {0352, "OE"},
            {0351, "Oslash"},
            {0120, "P"},
            {0121, "Q"},
```

### OctalLiteral
Octal integer `0346`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {075, "threequartersemdash"},
        {0334, "threesuperior"},
        {0346, "tsuperior"},
        {052, "twodotenleader"},
        {0252, "twoinferior"},
```

### OctalLiteral
Octal integer `0120`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0352, "OE"},
            {0351, "Oslash"},
            {0120, "P"},
            {0121, "Q"},
            {0122, "R"},
```

### OctalLiteral
Octal integer `0121`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0351, "Oslash"},
            {0120, "P"},
            {0121, "Q"},
            {0122, "R"},
            {0123, "S"},
```

### OctalLiteral
Octal integer `0122`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0120, "P"},
            {0121, "Q"},
            {0122, "R"},
            {0123, "S"},
            {0124, "T"},
```

### OctalLiteral
Octal integer `0123`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0121, "Q"},
            {0122, "R"},
            {0123, "S"},
            {0124, "T"},
            {0125, "U"},
```

### OctalLiteral
Octal integer `0124`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0122, "R"},
            {0123, "S"},
            {0124, "T"},
            {0125, "U"},
            {0126, "V"},
```

### OctalLiteral
Octal integer `0125`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0123, "S"},
            {0124, "T"},
            {0125, "U"},
            {0126, "V"},
            {0127, "W"},
```

### OctalLiteral
Octal integer `0126`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0124, "T"},
            {0125, "U"},
            {0126, "V"},
            {0127, "W"},
            {0130, "X"},
```

### OctalLiteral
Octal integer `0127`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0125, "U"},
            {0126, "V"},
            {0127, "W"},
            {0130, "X"},
            {0131, "Y"},
```

### OctalLiteral
Octal integer `0130`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0126, "V"},
            {0127, "W"},
            {0130, "X"},
            {0131, "Y"},
            {0132, "Z"},
```

### OctalLiteral
Octal integer `0131`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0127, "W"},
            {0130, "X"},
            {0131, "Y"},
            {0132, "Z"},
            {0141, "a"},
```

### OctalLiteral
Octal integer `0132`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0130, "X"},
            {0131, "Y"},
            {0132, "Z"},
            {0141, "a"},
            {0302, "acute"},
```

### OctalLiteral
Octal integer `0141`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0131, "Y"},
            {0132, "Z"},
            {0141, "a"},
            {0302, "acute"},
            {0361, "ae"},
```

### OctalLiteral
Octal integer `0302`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0132, "Z"},
            {0141, "a"},
            {0302, "acute"},
            {0361, "ae"},
            {0046, "ampersand"},
```

### OctalLiteral
Octal integer `0361`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0141, "a"},
            {0302, "acute"},
            {0361, "ae"},
            {0046, "ampersand"},
            {0136, "asciicircum"},
```

### OctalLiteral
Octal integer `0046`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0302, "acute"},
            {0361, "ae"},
            {0046, "ampersand"},
            {0136, "asciicircum"},
            {0176, "asciitilde"},
```

### OctalLiteral
Octal integer `0136`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0361, "ae"},
            {0046, "ampersand"},
            {0136, "asciicircum"},
            {0176, "asciitilde"},
            {0052, "asterisk"},
```

### OctalLiteral
Octal integer `0176`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0046, "ampersand"},
            {0136, "asciicircum"},
            {0176, "asciitilde"},
            {0052, "asterisk"},
            {0100, "at"},
```

### OctalLiteral
Octal integer `052`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0334, "threesuperior"},
        {0346, "tsuperior"},
        {052, "twodotenleader"},
        {0252, "twoinferior"},
        {062, "twooldstyle"},
```

### OctalLiteral
Octal integer `0052`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0136, "asciicircum"},
            {0176, "asciitilde"},
            {0052, "asterisk"},
            {0100, "at"},
            {0142, "b"},
```

### OctalLiteral
Octal integer `0101`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
     */
    private static final Object[][] MAC_ROMAN_ENCODING_TABLE = {
            {0101, "A"},
            {0256, "AE"},
            {0347, "Aacute"},
```

### OctalLiteral
Octal integer `0100`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0176, "asciitilde"},
            {0052, "asterisk"},
            {0100, "at"},
            {0142, "b"},
            {0134, "backslash"},
```

### OctalLiteral
Octal integer `0256`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
    private static final Object[][] MAC_ROMAN_ENCODING_TABLE = {
            {0101, "A"},
            {0256, "AE"},
            {0347, "Aacute"},
            {0345, "Acircumflex"},
```

### OctalLiteral
Octal integer `0142`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0052, "asterisk"},
            {0100, "at"},
            {0142, "b"},
            {0134, "backslash"},
            {0174, "bar"},
```

### OctalLiteral
Octal integer `0347`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0101, "A"},
            {0256, "AE"},
            {0347, "Aacute"},
            {0345, "Acircumflex"},
            {0200, "Adieresis"},
```

### OctalLiteral
Octal integer `0134`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0100, "at"},
            {0142, "b"},
            {0134, "backslash"},
            {0174, "bar"},
            {0173, "braceleft"},
```

### OctalLiteral
Octal integer `0345`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0256, "AE"},
            {0347, "Aacute"},
            {0345, "Acircumflex"},
            {0200, "Adieresis"},
            {0313, "Agrave"},
```

### OctalLiteral
Octal integer `0252`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0346, "tsuperior"},
        {052, "twodotenleader"},
        {0252, "twoinferior"},
        {062, "twooldstyle"},
        {0333, "twosuperior"},
```

### OctalLiteral
Octal integer `0174`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0142, "b"},
            {0134, "backslash"},
            {0174, "bar"},
            {0173, "braceleft"},
            {0175, "braceright"},
```

### OctalLiteral
Octal integer `0200`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0347, "Aacute"},
            {0345, "Acircumflex"},
            {0200, "Adieresis"},
            {0313, "Agrave"},
            {0201, "Aring"},
```

### OctalLiteral
Octal integer `0173`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0134, "backslash"},
            {0174, "bar"},
            {0173, "braceleft"},
            {0175, "braceright"},
            {0133, "bracketleft"},
```

### OctalLiteral
Octal integer `062`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {052, "twodotenleader"},
        {0252, "twoinferior"},
        {062, "twooldstyle"},
        {0333, "twosuperior"},
        {0117, "twothirds"},
```

### OctalLiteral
Octal integer `0175`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0174, "bar"},
            {0173, "braceleft"},
            {0175, "braceright"},
            {0133, "bracketleft"},
            {0135, "bracketright"},
```

### OctalLiteral
Octal integer `0313`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0345, "Acircumflex"},
            {0200, "Adieresis"},
            {0313, "Agrave"},
            {0201, "Aring"},
            {0314, "Atilde"},
```

### OctalLiteral
Octal integer `0133`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0173, "braceleft"},
            {0175, "braceright"},
            {0133, "bracketleft"},
            {0135, "bracketright"},
            {0306, "breve"},
```

### OctalLiteral
Octal integer `0333`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0252, "twoinferior"},
        {062, "twooldstyle"},
        {0333, "twosuperior"},
        {0117, "twothirds"},
        {0274, "zeroinferior"},
```

### OctalLiteral
Octal integer `0201`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0200, "Adieresis"},
            {0313, "Agrave"},
            {0201, "Aring"},
            {0314, "Atilde"},
            {0102, "B"},
```

### OctalLiteral
Octal integer `0135`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0175, "braceright"},
            {0133, "bracketleft"},
            {0135, "bracketright"},
            {0306, "breve"},
            {0267, "bullet"},
```

### OctalLiteral
Octal integer `0314`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0313, "Agrave"},
            {0201, "Aring"},
            {0314, "Atilde"},
            {0102, "B"},
            {0103, "C"},
```

### OctalLiteral
Octal integer `0117`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {062, "twooldstyle"},
        {0333, "twosuperior"},
        {0117, "twothirds"},
        {0274, "zeroinferior"},
        {060, "zerooldstyle"},
```

### OctalLiteral
Octal integer `0306`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0133, "bracketleft"},
            {0135, "bracketright"},
            {0306, "breve"},
            {0267, "bullet"},
            {0143, "c"},
```

### OctalLiteral
Octal integer `0102`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0201, "Aring"},
            {0314, "Atilde"},
            {0102, "B"},
            {0103, "C"},
            {0202, "Ccedilla"},
```

### OctalLiteral
Octal integer `0103`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0314, "Atilde"},
            {0102, "B"},
            {0103, "C"},
            {0202, "Ccedilla"},
            {0104, "D"},
```

### OctalLiteral
Octal integer `0274`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0333, "twosuperior"},
        {0117, "twothirds"},
        {0274, "zeroinferior"},
        {060, "zerooldstyle"},
        {0342, "zerosuperior"}
```

### OctalLiteral
Octal integer `0267`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0135, "bracketright"},
            {0306, "breve"},
            {0267, "bullet"},
            {0143, "c"},
            {0317, "caron"},
```

### OctalLiteral
Octal integer `0202`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0102, "B"},
            {0103, "C"},
            {0202, "Ccedilla"},
            {0104, "D"},
            {0105, "E"},
```

### OctalLiteral
Octal integer `0143`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0306, "breve"},
            {0267, "bullet"},
            {0143, "c"},
            {0317, "caron"},
            {0313, "cedilla"},
```

### OctalLiteral
Octal integer `060`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0117, "twothirds"},
        {0274, "zeroinferior"},
        {060, "zerooldstyle"},
        {0342, "zerosuperior"}
    };
```

### OctalLiteral
Octal integer `0104`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0103, "C"},
            {0202, "Ccedilla"},
            {0104, "D"},
            {0105, "E"},
            {0203, "Eacute"},
```

### OctalLiteral
Octal integer `0317`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0267, "bullet"},
            {0143, "c"},
            {0317, "caron"},
            {0313, "cedilla"},
            {0242, "cent"},
```

### OctalLiteral
Octal integer `0342`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacExpertEncoding.java`
#### Snippet
```java
        {0274, "zeroinferior"},
        {060, "zerooldstyle"},
        {0342, "zerosuperior"}
    };
    
```

### OctalLiteral
Octal integer `0313`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0143, "c"},
            {0317, "caron"},
            {0313, "cedilla"},
            {0242, "cent"},
            {0303, "circumflex"},
```

### OctalLiteral
Octal integer `0242`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0317, "caron"},
            {0313, "cedilla"},
            {0242, "cent"},
            {0303, "circumflex"},
            {0072, "colon"},
```

### OctalLiteral
Octal integer `0303`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0313, "cedilla"},
            {0242, "cent"},
            {0303, "circumflex"},
            {0072, "colon"},
            {0054, "comma"},
```

### OctalLiteral
Octal integer `0072`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0242, "cent"},
            {0303, "circumflex"},
            {0072, "colon"},
            {0054, "comma"},
            {0250, "currency"},
```

### OctalLiteral
Octal integer `0054`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0303, "circumflex"},
            {0072, "colon"},
            {0054, "comma"},
            {0250, "currency"},
            {0144, "d"},
```

### OctalLiteral
Octal integer `0250`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0072, "colon"},
            {0054, "comma"},
            {0250, "currency"},
            {0144, "d"},
            {0262, "dagger"},
```

### OctalLiteral
Octal integer `0144`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0054, "comma"},
            {0250, "currency"},
            {0144, "d"},
            {0262, "dagger"},
            {0263, "daggerdbl"},
```

### OctalLiteral
Octal integer `0262`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0250, "currency"},
            {0144, "d"},
            {0262, "dagger"},
            {0263, "daggerdbl"},
            {0310, "dieresis"},
```

### OctalLiteral
Octal integer `0263`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0144, "d"},
            {0262, "dagger"},
            {0263, "daggerdbl"},
            {0310, "dieresis"},
            {0044, "dollar"},
```

### OctalLiteral
Octal integer `0105`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0202, "Ccedilla"},
            {0104, "D"},
            {0105, "E"},
            {0203, "Eacute"},
            {0346, "Ecircumflex"},
```

### OctalLiteral
Octal integer `0310`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0262, "dagger"},
            {0263, "daggerdbl"},
            {0310, "dieresis"},
            {0044, "dollar"},
            {0307, "dotaccent"},
```

### OctalLiteral
Octal integer `0203`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0104, "D"},
            {0105, "E"},
            {0203, "Eacute"},
            {0346, "Ecircumflex"},
            {0350, "Edieresis"},
```

### OctalLiteral
Octal integer `0044`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0263, "daggerdbl"},
            {0310, "dieresis"},
            {0044, "dollar"},
            {0307, "dotaccent"},
            {0365, "dotlessi"},
```

### OctalLiteral
Octal integer `0346`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0105, "E"},
            {0203, "Eacute"},
            {0346, "Ecircumflex"},
            {0350, "Edieresis"},
            {0351, "Egrave"},
```

### OctalLiteral
Octal integer `0307`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0310, "dieresis"},
            {0044, "dollar"},
            {0307, "dotaccent"},
            {0365, "dotlessi"},
            {0145, "e"},
```

### OctalLiteral
Octal integer `0350`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0203, "Eacute"},
            {0346, "Ecircumflex"},
            {0350, "Edieresis"},
            {0351, "Egrave"},
            {0106, "F"},
```

### OctalLiteral
Octal integer `0365`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0044, "dollar"},
            {0307, "dotaccent"},
            {0365, "dotlessi"},
            {0145, "e"},
            {0070, "eight"},
```

### OctalLiteral
Octal integer `0351`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0346, "Ecircumflex"},
            {0350, "Edieresis"},
            {0351, "Egrave"},
            {0106, "F"},
            {0107, "G"},
```

### OctalLiteral
Octal integer `0145`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0307, "dotaccent"},
            {0365, "dotlessi"},
            {0145, "e"},
            {0070, "eight"},
            {0274, "ellipsis"},
```

### OctalLiteral
Octal integer `0106`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0350, "Edieresis"},
            {0351, "Egrave"},
            {0106, "F"},
            {0107, "G"},
            {0110, "H"},
```

### OctalLiteral
Octal integer `0070`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0365, "dotlessi"},
            {0145, "e"},
            {0070, "eight"},
            {0274, "ellipsis"},
            {0320, "emdash"},
```

### OctalLiteral
Octal integer `0107`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0351, "Egrave"},
            {0106, "F"},
            {0107, "G"},
            {0110, "H"},
            {0111, "I"},
```

### OctalLiteral
Octal integer `0274`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0145, "e"},
            {0070, "eight"},
            {0274, "ellipsis"},
            {0320, "emdash"},
            {0261, "endash"},
```

### OctalLiteral
Octal integer `0110`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0106, "F"},
            {0107, "G"},
            {0110, "H"},
            {0111, "I"},
            {0352, "Iacute"},
```

### OctalLiteral
Octal integer `0320`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0070, "eight"},
            {0274, "ellipsis"},
            {0320, "emdash"},
            {0261, "endash"},
            {0075, "equal"},
```

### OctalLiteral
Octal integer `0111`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0107, "G"},
            {0110, "H"},
            {0111, "I"},
            {0352, "Iacute"},
            {0353, "Icircumflex"},
```

### OctalLiteral
Octal integer `0261`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0274, "ellipsis"},
            {0320, "emdash"},
            {0261, "endash"},
            {0075, "equal"},
            {0041, "exclam"},
```

### OctalLiteral
Octal integer `0352`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0110, "H"},
            {0111, "I"},
            {0352, "Iacute"},
            {0353, "Icircumflex"},
            {0354, "Idieresis"},
```

### OctalLiteral
Octal integer `0075`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0320, "emdash"},
            {0261, "endash"},
            {0075, "equal"},
            {0041, "exclam"},
            {0241, "exclamdown"},
```

### OctalLiteral
Octal integer `0353`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0111, "I"},
            {0352, "Iacute"},
            {0353, "Icircumflex"},
            {0354, "Idieresis"},
            {0355, "Igrave"},
```

### OctalLiteral
Octal integer `0041`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0261, "endash"},
            {0075, "equal"},
            {0041, "exclam"},
            {0241, "exclamdown"},
            {0146, "f"},
```

### OctalLiteral
Octal integer `0354`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0352, "Iacute"},
            {0353, "Icircumflex"},
            {0354, "Idieresis"},
            {0355, "Igrave"},
            {0112, "J"},
```

### OctalLiteral
Octal integer `0241`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0075, "equal"},
            {0041, "exclam"},
            {0241, "exclamdown"},
            {0146, "f"},
            {0256, "fi"},
```

### OctalLiteral
Octal integer `0355`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0353, "Icircumflex"},
            {0354, "Idieresis"},
            {0355, "Igrave"},
            {0112, "J"},
            {0113, "K"},
```

### OctalLiteral
Octal integer `0146`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0041, "exclam"},
            {0241, "exclamdown"},
            {0146, "f"},
            {0256, "fi"},
            {0065, "five"},
```

### OctalLiteral
Octal integer `0112`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0354, "Idieresis"},
            {0355, "Igrave"},
            {0112, "J"},
            {0113, "K"},
            {0114, "L"},
```

### OctalLiteral
Octal integer `0256`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0241, "exclamdown"},
            {0146, "f"},
            {0256, "fi"},
            {0065, "five"},
            {0257, "fl"},
```

### OctalLiteral
Octal integer `0113`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0355, "Igrave"},
            {0112, "J"},
            {0113, "K"},
            {0114, "L"},
            {0115, "M"},
```

### OctalLiteral
Octal integer `0065`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0146, "f"},
            {0256, "fi"},
            {0065, "five"},
            {0257, "fl"},
            {0246, "florin"},
```

### OctalLiteral
Octal integer `0257`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0256, "fi"},
            {0065, "five"},
            {0257, "fl"},
            {0246, "florin"},
            {0064, "four"},
```

### OctalLiteral
Octal integer `0246`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0065, "five"},
            {0257, "fl"},
            {0246, "florin"},
            {0064, "four"},
            {0244, "fraction"},
```

### OctalLiteral
Octal integer `0064`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0257, "fl"},
            {0246, "florin"},
            {0064, "four"},
            {0244, "fraction"},
            {0147, "g"},
```

### OctalLiteral
Octal integer `0244`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0246, "florin"},
            {0064, "four"},
            {0244, "fraction"},
            {0147, "g"},
            {0373, "germandbls"},
```

### OctalLiteral
Octal integer `0147`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0064, "four"},
            {0244, "fraction"},
            {0147, "g"},
            {0373, "germandbls"},
            {0301, "grave"},
```

### OctalLiteral
Octal integer `0373`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0244, "fraction"},
            {0147, "g"},
            {0373, "germandbls"},
            {0301, "grave"},
            {0076, "greater"},
```

### OctalLiteral
Octal integer `0301`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0147, "g"},
            {0373, "germandbls"},
            {0301, "grave"},
            {0076, "greater"},
            {0253, "guillemotleft"},
```

### OctalLiteral
Octal integer `0076`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0373, "germandbls"},
            {0301, "grave"},
            {0076, "greater"},
            {0253, "guillemotleft"},
            {0273, "guillemotright"},
```

### OctalLiteral
Octal integer `0253`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0301, "grave"},
            {0076, "greater"},
            {0253, "guillemotleft"},
            {0273, "guillemotright"},
            {0254, "guilsinglleft"},
```

### OctalLiteral
Octal integer `0114`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0112, "J"},
            {0113, "K"},
            {0114, "L"},
            {0115, "M"},
            {0116, "N"},
```

### OctalLiteral
Octal integer `0273`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0076, "greater"},
            {0253, "guillemotleft"},
            {0273, "guillemotright"},
            {0254, "guilsinglleft"},
            {0255, "guilsinglright"},
```

### OctalLiteral
Octal integer `0115`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0113, "K"},
            {0114, "L"},
            {0115, "M"},
            {0116, "N"},
            {0204, "Ntilde"},
```

### OctalLiteral
Octal integer `0254`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0253, "guillemotleft"},
            {0273, "guillemotright"},
            {0254, "guilsinglleft"},
            {0255, "guilsinglright"},
            {0150, "h"},
```

### OctalLiteral
Octal integer `0116`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0114, "L"},
            {0115, "M"},
            {0116, "N"},
            {0204, "Ntilde"},
            {0117, "O"},
```

### OctalLiteral
Octal integer `0255`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0273, "guillemotright"},
            {0254, "guilsinglleft"},
            {0255, "guilsinglright"},
            {0150, "h"},
            {0315, "hungarumlaut"},
```

### OctalLiteral
Octal integer `0150`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0254, "guilsinglleft"},
            {0255, "guilsinglright"},
            {0150, "h"},
            {0315, "hungarumlaut"},
            {0055, "hyphen"},
```

### OctalLiteral
Octal integer `0315`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0255, "guilsinglright"},
            {0150, "h"},
            {0315, "hungarumlaut"},
            {0055, "hyphen"},
            {0151, "i"},
```

### OctalLiteral
Octal integer `0055`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0150, "h"},
            {0315, "hungarumlaut"},
            {0055, "hyphen"},
            {0151, "i"},
            {0152, "j"},
```

### OctalLiteral
Octal integer `0151`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0315, "hungarumlaut"},
            {0055, "hyphen"},
            {0151, "i"},
            {0152, "j"},
            {0153, "k"},
```

### OctalLiteral
Octal integer `0152`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0055, "hyphen"},
            {0151, "i"},
            {0152, "j"},
            {0153, "k"},
            {0154, "l"},
```

### OctalLiteral
Octal integer `0153`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0151, "i"},
            {0152, "j"},
            {0153, "k"},
            {0154, "l"},
            {0074, "less"},
```

### OctalLiteral
Octal integer `0154`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0152, "j"},
            {0153, "k"},
            {0154, "l"},
            {0074, "less"},
            {0370, "lslash"},
```

### OctalLiteral
Octal integer `0074`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0153, "k"},
            {0154, "l"},
            {0074, "less"},
            {0370, "lslash"},
            {0155, "m"},
```

### OctalLiteral
Octal integer `0370`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0154, "l"},
            {0074, "less"},
            {0370, "lslash"},
            {0155, "m"},
            {0305, "macron"},
```

### OctalLiteral
Octal integer `0155`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0074, "less"},
            {0370, "lslash"},
            {0155, "m"},
            {0305, "macron"},
            {0156, "n"},
```

### OctalLiteral
Octal integer `0305`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0370, "lslash"},
            {0155, "m"},
            {0305, "macron"},
            {0156, "n"},
            {0071, "nine"},
```

### OctalLiteral
Octal integer `0156`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0155, "m"},
            {0305, "macron"},
            {0156, "n"},
            {0071, "nine"},
            {0043, "numbersign"},
```

### OctalLiteral
Octal integer `0071`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0305, "macron"},
            {0156, "n"},
            {0071, "nine"},
            {0043, "numbersign"},
            {0157, "o"},
```

### OctalLiteral
Octal integer `0043`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0156, "n"},
            {0071, "nine"},
            {0043, "numbersign"},
            {0157, "o"},
            {0372, "oe"},
```

### OctalLiteral
Octal integer `0204`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0115, "M"},
            {0116, "N"},
            {0204, "Ntilde"},
            {0117, "O"},
            {0316, "OE"},
```

### OctalLiteral
Octal integer `0157`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0071, "nine"},
            {0043, "numbersign"},
            {0157, "o"},
            {0372, "oe"},
            {0316, "ogonek"},
```

### OctalLiteral
Octal integer `0117`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0116, "N"},
            {0204, "Ntilde"},
            {0117, "O"},
            {0316, "OE"},
            {0356, "Oacute"},
```

### OctalLiteral
Octal integer `0372`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0043, "numbersign"},
            {0157, "o"},
            {0372, "oe"},
            {0316, "ogonek"},
            {0061, "one"},
```

### OctalLiteral
Octal integer `0316`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0204, "Ntilde"},
            {0117, "O"},
            {0316, "OE"},
            {0356, "Oacute"},
            {0357, "Ocircumflex"},
```

### OctalLiteral
Octal integer `0316`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0157, "o"},
            {0372, "oe"},
            {0316, "ogonek"},
            {0061, "one"},
            {0343, "ordfeminine"},
```

### OctalLiteral
Octal integer `0356`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0117, "O"},
            {0316, "OE"},
            {0356, "Oacute"},
            {0357, "Ocircumflex"},
            {0205, "Odieresis"},
```

### OctalLiteral
Octal integer `0061`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0372, "oe"},
            {0316, "ogonek"},
            {0061, "one"},
            {0343, "ordfeminine"},
            {0353, "ordmasculine"},
```

### OctalLiteral
Octal integer `0357`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0316, "OE"},
            {0356, "Oacute"},
            {0357, "Ocircumflex"},
            {0205, "Odieresis"},
            {0361, "Ograve"},
```

### OctalLiteral
Octal integer `0343`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0316, "ogonek"},
            {0061, "one"},
            {0343, "ordfeminine"},
            {0353, "ordmasculine"},
            {0371, "oslash"},
```

### OctalLiteral
Octal integer `0205`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0356, "Oacute"},
            {0357, "Ocircumflex"},
            {0205, "Odieresis"},
            {0361, "Ograve"},
            {0257, "Oslash"},
```

### OctalLiteral
Octal integer `0353`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0061, "one"},
            {0343, "ordfeminine"},
            {0353, "ordmasculine"},
            {0371, "oslash"},
            {0160, "p"},
```

### OctalLiteral
Octal integer `0361`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0357, "Ocircumflex"},
            {0205, "Odieresis"},
            {0361, "Ograve"},
            {0257, "Oslash"},
            {0315, "Otilde"},
```

### OctalLiteral
Octal integer `0371`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0343, "ordfeminine"},
            {0353, "ordmasculine"},
            {0371, "oslash"},
            {0160, "p"},
            {0266, "paragraph"},
```

### OctalLiteral
Octal integer `0257`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0205, "Odieresis"},
            {0361, "Ograve"},
            {0257, "Oslash"},
            {0315, "Otilde"},
            {0120, "P"},
```

### OctalLiteral
Octal integer `0160`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0353, "ordmasculine"},
            {0371, "oslash"},
            {0160, "p"},
            {0266, "paragraph"},
            {0050, "parenleft"},
```

### OctalLiteral
Octal integer `0266`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0371, "oslash"},
            {0160, "p"},
            {0266, "paragraph"},
            {0050, "parenleft"},
            {0051, "parenright"},
```

### OctalLiteral
Octal integer `0050`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0160, "p"},
            {0266, "paragraph"},
            {0050, "parenleft"},
            {0051, "parenright"},
            {0045, "percent"},
```

### OctalLiteral
Octal integer `0051`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0266, "paragraph"},
            {0050, "parenleft"},
            {0051, "parenright"},
            {0045, "percent"},
            {0056, "period"},
```

### OctalLiteral
Octal integer `0045`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0050, "parenleft"},
            {0051, "parenright"},
            {0045, "percent"},
            {0056, "period"},
            {0264, "periodcentered"},
```

### OctalLiteral
Octal integer `0056`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0051, "parenright"},
            {0045, "percent"},
            {0056, "period"},
            {0264, "periodcentered"},
            {0275, "perthousand"},
```

### OctalLiteral
Octal integer `0264`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0045, "percent"},
            {0056, "period"},
            {0264, "periodcentered"},
            {0275, "perthousand"},
            {0053, "plus"},
```

### OctalLiteral
Octal integer `0275`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0056, "period"},
            {0264, "periodcentered"},
            {0275, "perthousand"},
            {0053, "plus"},
            {0161, "q"},
```

### OctalLiteral
Octal integer `0053`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0264, "periodcentered"},
            {0275, "perthousand"},
            {0053, "plus"},
            {0161, "q"},
            {0077, "question"},
```

### OctalLiteral
Octal integer `0161`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0275, "perthousand"},
            {0053, "plus"},
            {0161, "q"},
            {0077, "question"},
            {0277, "questiondown"},
```

### OctalLiteral
Octal integer `0077`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0053, "plus"},
            {0161, "q"},
            {0077, "question"},
            {0277, "questiondown"},
            {0042, "quotedbl"},
```

### OctalLiteral
Octal integer `0277`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0161, "q"},
            {0077, "question"},
            {0277, "questiondown"},
            {0042, "quotedbl"},
            {0271, "quotedblbase"},
```

### OctalLiteral
Octal integer `0042`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0077, "question"},
            {0277, "questiondown"},
            {0042, "quotedbl"},
            {0271, "quotedblbase"},
            {0252, "quotedblleft"},
```

### OctalLiteral
Octal integer `0271`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0277, "questiondown"},
            {0042, "quotedbl"},
            {0271, "quotedblbase"},
            {0252, "quotedblleft"},
            {0272, "quotedblright"},
```

### OctalLiteral
Octal integer `0252`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0042, "quotedbl"},
            {0271, "quotedblbase"},
            {0252, "quotedblleft"},
            {0272, "quotedblright"},
            {0140, "quoteleft"},
```

### OctalLiteral
Octal integer `0272`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0271, "quotedblbase"},
            {0252, "quotedblleft"},
            {0272, "quotedblright"},
            {0140, "quoteleft"},
            {0047, "quoteright"},
```

### OctalLiteral
Octal integer `0140`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0252, "quotedblleft"},
            {0272, "quotedblright"},
            {0140, "quoteleft"},
            {0047, "quoteright"},
            {0270, "quotesinglbase"},
```

### OctalLiteral
Octal integer `0047`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0272, "quotedblright"},
            {0140, "quoteleft"},
            {0047, "quoteright"},
            {0270, "quotesinglbase"},
            {0251, "quotesingle"},
```

### OctalLiteral
Octal integer `0270`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0140, "quoteleft"},
            {0047, "quoteright"},
            {0270, "quotesinglbase"},
            {0251, "quotesingle"},
            {0162, "r"},
```

### OctalLiteral
Octal integer `0251`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0047, "quoteright"},
            {0270, "quotesinglbase"},
            {0251, "quotesingle"},
            {0162, "r"},
            {0312, "ring"},
```

### OctalLiteral
Octal integer `0162`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0270, "quotesinglbase"},
            {0251, "quotesingle"},
            {0162, "r"},
            {0312, "ring"},
            {0163, "s"},
```

### OctalLiteral
Octal integer `0312`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0251, "quotesingle"},
            {0162, "r"},
            {0312, "ring"},
            {0163, "s"},
            {0247, "section"},
```

### OctalLiteral
Octal integer `0163`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0162, "r"},
            {0312, "ring"},
            {0163, "s"},
            {0247, "section"},
            {0073, "semicolon"},
```

### OctalLiteral
Octal integer `0315`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0361, "Ograve"},
            {0257, "Oslash"},
            {0315, "Otilde"},
            {0120, "P"},
            {0121, "Q"},
```

### OctalLiteral
Octal integer `0247`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0312, "ring"},
            {0163, "s"},
            {0247, "section"},
            {0073, "semicolon"},
            {0067, "seven"},
```

### OctalLiteral
Octal integer `0120`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0257, "Oslash"},
            {0315, "Otilde"},
            {0120, "P"},
            {0121, "Q"},
            {0122, "R"},
```

### OctalLiteral
Octal integer `0073`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0163, "s"},
            {0247, "section"},
            {0073, "semicolon"},
            {0067, "seven"},
            {0066, "six"},
```

### OctalLiteral
Octal integer `0121`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0315, "Otilde"},
            {0120, "P"},
            {0121, "Q"},
            {0122, "R"},
            {0123, "S"},
```

### OctalLiteral
Octal integer `0067`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0247, "section"},
            {0073, "semicolon"},
            {0067, "seven"},
            {0066, "six"},
            {0057, "slash"},
```

### OctalLiteral
Octal integer `0122`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0120, "P"},
            {0121, "Q"},
            {0122, "R"},
            {0123, "S"},
            {0124, "T"},
```

### OctalLiteral
Octal integer `0066`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0073, "semicolon"},
            {0067, "seven"},
            {0066, "six"},
            {0057, "slash"},
            {0040, "space"},
```

### OctalLiteral
Octal integer `0123`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0121, "Q"},
            {0122, "R"},
            {0123, "S"},
            {0124, "T"},
            {0125, "U"},
```

### OctalLiteral
Octal integer `0057`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0067, "seven"},
            {0066, "six"},
            {0057, "slash"},
            {0040, "space"},
            {0243, "sterling"},
```

### OctalLiteral
Octal integer `0124`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0122, "R"},
            {0123, "S"},
            {0124, "T"},
            {0125, "U"},
            {0362, "Uacute"},
```

### OctalLiteral
Octal integer `0040`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0066, "six"},
            {0057, "slash"},
            {0040, "space"},
            {0243, "sterling"},
            {0164, "t"},
```

### OctalLiteral
Octal integer `0125`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0123, "S"},
            {0124, "T"},
            {0125, "U"},
            {0362, "Uacute"},
            {0363, "Ucircumflex"},
```

### OctalLiteral
Octal integer `0243`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0057, "slash"},
            {0040, "space"},
            {0243, "sterling"},
            {0164, "t"},
            {0063, "three"},
```

### OctalLiteral
Octal integer `0362`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0124, "T"},
            {0125, "U"},
            {0362, "Uacute"},
            {0363, "Ucircumflex"},
            {0206, "Udieresis"},
```

### OctalLiteral
Octal integer `0164`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0040, "space"},
            {0243, "sterling"},
            {0164, "t"},
            {0063, "three"},
            {0304, "tilde"},
```

### OctalLiteral
Octal integer `0363`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0125, "U"},
            {0362, "Uacute"},
            {0363, "Ucircumflex"},
            {0206, "Udieresis"},
            {0364, "Ugrave"},
```

### OctalLiteral
Octal integer `0206`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0362, "Uacute"},
            {0363, "Ucircumflex"},
            {0206, "Udieresis"},
            {0364, "Ugrave"},
            {0126, "V"},
```

### OctalLiteral
Octal integer `0063`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0243, "sterling"},
            {0164, "t"},
            {0063, "three"},
            {0304, "tilde"},
            {0062, "two"},
```

### OctalLiteral
Octal integer `0364`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0363, "Ucircumflex"},
            {0206, "Udieresis"},
            {0364, "Ugrave"},
            {0126, "V"},
            {0127, "W"},
```

### OctalLiteral
Octal integer `0126`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0206, "Udieresis"},
            {0364, "Ugrave"},
            {0126, "V"},
            {0127, "W"},
            {0130, "X"},
```

### OctalLiteral
Octal integer `0304`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0164, "t"},
            {0063, "three"},
            {0304, "tilde"},
            {0062, "two"},
            {0165, "u"},
```

### OctalLiteral
Octal integer `0127`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0364, "Ugrave"},
            {0126, "V"},
            {0127, "W"},
            {0130, "X"},
            {0131, "Y"},
```

### OctalLiteral
Octal integer `0062`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0063, "three"},
            {0304, "tilde"},
            {0062, "two"},
            {0165, "u"},
            {0137, "underscore"},
```

### OctalLiteral
Octal integer `0130`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0126, "V"},
            {0127, "W"},
            {0130, "X"},
            {0131, "Y"},
            {0331, "Ydieresis"},
```

### OctalLiteral
Octal integer `0165`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0304, "tilde"},
            {0062, "two"},
            {0165, "u"},
            {0137, "underscore"},
            {0166, "v"},
```

### OctalLiteral
Octal integer `0131`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0127, "W"},
            {0130, "X"},
            {0131, "Y"},
            {0331, "Ydieresis"},
            {0132, "Z"},
```

### OctalLiteral
Octal integer `0137`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0062, "two"},
            {0165, "u"},
            {0137, "underscore"},
            {0166, "v"},
            {0167, "w"},
```

### OctalLiteral
Octal integer `0331`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0130, "X"},
            {0131, "Y"},
            {0331, "Ydieresis"},
            {0132, "Z"},
            {0141, "a"},
```

### OctalLiteral
Octal integer `0166`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0165, "u"},
            {0137, "underscore"},
            {0166, "v"},
            {0167, "w"},
            {0170, "x"},
```

### OctalLiteral
Octal integer `0132`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0131, "Y"},
            {0331, "Ydieresis"},
            {0132, "Z"},
            {0141, "a"},
            {0207, "aacute"},
```

### OctalLiteral
Octal integer `0167`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0137, "underscore"},
            {0166, "v"},
            {0167, "w"},
            {0170, "x"},
            {0171, "y"},
```

### OctalLiteral
Octal integer `0141`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0331, "Ydieresis"},
            {0132, "Z"},
            {0141, "a"},
            {0207, "aacute"},
            {0211, "acircumflex"},
```

### OctalLiteral
Octal integer `0170`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0166, "v"},
            {0167, "w"},
            {0170, "x"},
            {0171, "y"},
            {0245, "yen"},
```

### OctalLiteral
Octal integer `0207`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0132, "Z"},
            {0141, "a"},
            {0207, "aacute"},
            {0211, "acircumflex"},
            {0253, "acute"},
```

### OctalLiteral
Octal integer `0171`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0167, "w"},
            {0170, "x"},
            {0171, "y"},
            {0245, "yen"},
            {0172, "z"},
```

### OctalLiteral
Octal integer `0211`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0141, "a"},
            {0207, "aacute"},
            {0211, "acircumflex"},
            {0253, "acute"},
            {0212, "adieresis"},
```

### OctalLiteral
Octal integer `0245`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0170, "x"},
            {0171, "y"},
            {0245, "yen"},
            {0172, "z"},
            {0060, "zero"}
```

### OctalLiteral
Octal integer `0253`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0207, "aacute"},
            {0211, "acircumflex"},
            {0253, "acute"},
            {0212, "adieresis"},
            {0276, "ae"},
```

### OctalLiteral
Octal integer `0172`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0171, "y"},
            {0245, "yen"},
            {0172, "z"},
            {0060, "zero"}
    };
```

### OctalLiteral
Octal integer `0212`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0211, "acircumflex"},
            {0253, "acute"},
            {0212, "adieresis"},
            {0276, "ae"},
            {0210, "agrave"},
```

### OctalLiteral
Octal integer `0060`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/StandardEncoding.java`
#### Snippet
```java
            {0245, "yen"},
            {0172, "z"},
            {0060, "zero"}
    };

```

### OctalLiteral
Octal integer `0276`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0253, "acute"},
            {0212, "adieresis"},
            {0276, "ae"},
            {0210, "agrave"},
            {046, "ampersand"},
```

### OctalLiteral
Octal integer `0210`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0212, "adieresis"},
            {0276, "ae"},
            {0210, "agrave"},
            {046, "ampersand"},
            {0214, "aring"},
```

### OctalLiteral
Octal integer `046`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0276, "ae"},
            {0210, "agrave"},
            {046, "ampersand"},
            {0214, "aring"},
            {0136, "asciicircum"},
```

### OctalLiteral
Octal integer `0214`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0210, "agrave"},
            {046, "ampersand"},
            {0214, "aring"},
            {0136, "asciicircum"},
            {0176, "asciitilde"},
```

### OctalLiteral
Octal integer `0136`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {046, "ampersand"},
            {0214, "aring"},
            {0136, "asciicircum"},
            {0176, "asciitilde"},
            {052, "asterisk"},
```

### OctalLiteral
Octal integer `0176`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0214, "aring"},
            {0136, "asciicircum"},
            {0176, "asciitilde"},
            {052, "asterisk"},
            {0100, "at"},
```

### OctalLiteral
Octal integer `052`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0136, "asciicircum"},
            {0176, "asciitilde"},
            {052, "asterisk"},
            {0100, "at"},
            {0213, "atilde"},
```

### OctalLiteral
Octal integer `0100`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0176, "asciitilde"},
            {052, "asterisk"},
            {0100, "at"},
            {0213, "atilde"},
            {0142, "b"},
```

### OctalLiteral
Octal integer `0213`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {052, "asterisk"},
            {0100, "at"},
            {0213, "atilde"},
            {0142, "b"},
            {0134, "backslash"},
```

### OctalLiteral
Octal integer `0142`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0100, "at"},
            {0213, "atilde"},
            {0142, "b"},
            {0134, "backslash"},
            {0174, "bar"},
```

### OctalLiteral
Octal integer `0134`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0213, "atilde"},
            {0142, "b"},
            {0134, "backslash"},
            {0174, "bar"},
            {0173, "braceleft"},
```

### OctalLiteral
Octal integer `0174`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0142, "b"},
            {0134, "backslash"},
            {0174, "bar"},
            {0173, "braceleft"},
            {0175, "braceright"},
```

### OctalLiteral
Octal integer `0173`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0134, "backslash"},
            {0174, "bar"},
            {0173, "braceleft"},
            {0175, "braceright"},
            {0133, "bracketleft"},
```

### OctalLiteral
Octal integer `0175`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0174, "bar"},
            {0173, "braceleft"},
            {0175, "braceright"},
            {0133, "bracketleft"},
            {0135, "bracketright"},
```

### OctalLiteral
Octal integer `0133`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0173, "braceleft"},
            {0175, "braceright"},
            {0133, "bracketleft"},
            {0135, "bracketright"},
            {0371, "breve"},
```

### OctalLiteral
Octal integer `0135`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0175, "braceright"},
            {0133, "bracketleft"},
            {0135, "bracketright"},
            {0371, "breve"},
            {0245, "bullet"},
```

### OctalLiteral
Octal integer `0371`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0133, "bracketleft"},
            {0135, "bracketright"},
            {0371, "breve"},
            {0245, "bullet"},
            {0143, "c"},
```

### OctalLiteral
Octal integer `0245`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0135, "bracketright"},
            {0371, "breve"},
            {0245, "bullet"},
            {0143, "c"},
            {0377, "caron"},
```

### OctalLiteral
Octal integer `0143`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0371, "breve"},
            {0245, "bullet"},
            {0143, "c"},
            {0377, "caron"},
            {0215, "ccedilla"},
```

### OctalLiteral
Octal integer `0377`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0245, "bullet"},
            {0143, "c"},
            {0377, "caron"},
            {0215, "ccedilla"},
            {0374, "cedilla"},
```

### OctalLiteral
Octal integer `0215`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0143, "c"},
            {0377, "caron"},
            {0215, "ccedilla"},
            {0374, "cedilla"},
            {0242, "cent"},
```

### OctalLiteral
Octal integer `0374`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0377, "caron"},
            {0215, "ccedilla"},
            {0374, "cedilla"},
            {0242, "cent"},
            {0366, "circumflex"},
```

### OctalLiteral
Octal integer `0242`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0215, "ccedilla"},
            {0374, "cedilla"},
            {0242, "cent"},
            {0366, "circumflex"},
            {072, "colon"},
```

### OctalLiteral
Octal integer `0366`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0374, "cedilla"},
            {0242, "cent"},
            {0366, "circumflex"},
            {072, "colon"},
            {054, "comma"},
```

### OctalLiteral
Octal integer `072`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0242, "cent"},
            {0366, "circumflex"},
            {072, "colon"},
            {054, "comma"},
            {0251, "copyright"},
```

### OctalLiteral
Octal integer `054`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0366, "circumflex"},
            {072, "colon"},
            {054, "comma"},
            {0251, "copyright"},
            {0333, "currency"},
```

### OctalLiteral
Octal integer `0251`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {072, "colon"},
            {054, "comma"},
            {0251, "copyright"},
            {0333, "currency"},
            {0144, "d"},
```

### OctalLiteral
Octal integer `0333`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {054, "comma"},
            {0251, "copyright"},
            {0333, "currency"},
            {0144, "d"},
            {0240, "dagger"},
```

### OctalLiteral
Octal integer `0144`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0251, "copyright"},
            {0333, "currency"},
            {0144, "d"},
            {0240, "dagger"},
            {0340, "daggerdbl"},
```

### OctalLiteral
Octal integer `0240`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0333, "currency"},
            {0144, "d"},
            {0240, "dagger"},
            {0340, "daggerdbl"},
            {0241, "degree"},
```

### OctalLiteral
Octal integer `0340`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0144, "d"},
            {0240, "dagger"},
            {0340, "daggerdbl"},
            {0241, "degree"},
            {0254, "dieresis"},
```

### OctalLiteral
Octal integer `0241`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0240, "dagger"},
            {0340, "daggerdbl"},
            {0241, "degree"},
            {0254, "dieresis"},
            {0326, "divide"},
```

### OctalLiteral
Octal integer `0254`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0340, "daggerdbl"},
            {0241, "degree"},
            {0254, "dieresis"},
            {0326, "divide"},
            {044, "dollar"},
```

### OctalLiteral
Octal integer `0326`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0241, "degree"},
            {0254, "dieresis"},
            {0326, "divide"},
            {044, "dollar"},
            {0372, "dotaccent"},
```

### OctalLiteral
Octal integer `044`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0254, "dieresis"},
            {0326, "divide"},
            {044, "dollar"},
            {0372, "dotaccent"},
            {0365, "dotlessi"},
```

### OctalLiteral
Octal integer `0372`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0326, "divide"},
            {044, "dollar"},
            {0372, "dotaccent"},
            {0365, "dotlessi"},
            {0145, "e"},
```

### OctalLiteral
Octal integer `0365`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {044, "dollar"},
            {0372, "dotaccent"},
            {0365, "dotlessi"},
            {0145, "e"},
            {0216, "eacute"},
```

### OctalLiteral
Octal integer `0145`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0372, "dotaccent"},
            {0365, "dotlessi"},
            {0145, "e"},
            {0216, "eacute"},
            {0220, "ecircumflex"},
```

### OctalLiteral
Octal integer `0216`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0365, "dotlessi"},
            {0145, "e"},
            {0216, "eacute"},
            {0220, "ecircumflex"},
            {0221, "edieresis"},
```

### OctalLiteral
Octal integer `0220`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0145, "e"},
            {0216, "eacute"},
            {0220, "ecircumflex"},
            {0221, "edieresis"},
            {0217, "egrave"},
```

### OctalLiteral
Octal integer `0221`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0216, "eacute"},
            {0220, "ecircumflex"},
            {0221, "edieresis"},
            {0217, "egrave"},
            {070, "eight"},
```

### OctalLiteral
Octal integer `0217`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0220, "ecircumflex"},
            {0221, "edieresis"},
            {0217, "egrave"},
            {070, "eight"},
            {0311, "ellipsis"},
```

### OctalLiteral
Octal integer `070`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0221, "edieresis"},
            {0217, "egrave"},
            {070, "eight"},
            {0311, "ellipsis"},
            {0321, "emdash"},
```

### OctalLiteral
Octal integer `0311`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0217, "egrave"},
            {070, "eight"},
            {0311, "ellipsis"},
            {0321, "emdash"},
            {0320, "endash"},
```

### OctalLiteral
Octal integer `0321`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {070, "eight"},
            {0311, "ellipsis"},
            {0321, "emdash"},
            {0320, "endash"},
            {075, "equal"},
```

### OctalLiteral
Octal integer `0320`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0311, "ellipsis"},
            {0321, "emdash"},
            {0320, "endash"},
            {075, "equal"},
            {041, "exclam"},
```

### OctalLiteral
Octal integer `075`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0321, "emdash"},
            {0320, "endash"},
            {075, "equal"},
            {041, "exclam"},
            {0301, "exclamdown"},
```

### OctalLiteral
Octal integer `041`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0320, "endash"},
            {075, "equal"},
            {041, "exclam"},
            {0301, "exclamdown"},
            {0146, "f"},
```

### OctalLiteral
Octal integer `0301`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {075, "equal"},
            {041, "exclam"},
            {0301, "exclamdown"},
            {0146, "f"},
            {0336, "fi"},
```

### OctalLiteral
Octal integer `0146`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {041, "exclam"},
            {0301, "exclamdown"},
            {0146, "f"},
            {0336, "fi"},
            {065, "five"},
```

### OctalLiteral
Octal integer `0336`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0301, "exclamdown"},
            {0146, "f"},
            {0336, "fi"},
            {065, "five"},
            {0337, "fl"},
```

### OctalLiteral
Octal integer `065`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0146, "f"},
            {0336, "fi"},
            {065, "five"},
            {0337, "fl"},
            {0304, "florin"},
```

### OctalLiteral
Octal integer `0337`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0336, "fi"},
            {065, "five"},
            {0337, "fl"},
            {0304, "florin"},
            {064, "four"},
```

### OctalLiteral
Octal integer `0304`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {065, "five"},
            {0337, "fl"},
            {0304, "florin"},
            {064, "four"},
            {0332, "fraction"},
```

### OctalLiteral
Octal integer `064`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0337, "fl"},
            {0304, "florin"},
            {064, "four"},
            {0332, "fraction"},
            {0147, "g"},
```

### OctalLiteral
Octal integer `0332`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0304, "florin"},
            {064, "four"},
            {0332, "fraction"},
            {0147, "g"},
            {0247, "germandbls"},
```

### OctalLiteral
Octal integer `0147`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {064, "four"},
            {0332, "fraction"},
            {0147, "g"},
            {0247, "germandbls"},
            {0140, "grave"},
```

### OctalLiteral
Octal integer `0247`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0332, "fraction"},
            {0147, "g"},
            {0247, "germandbls"},
            {0140, "grave"},
            {076, "greater"},
```

### OctalLiteral
Octal integer `0140`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0147, "g"},
            {0247, "germandbls"},
            {0140, "grave"},
            {076, "greater"},
            {0307, "guillemotleft"},
```

### OctalLiteral
Octal integer `076`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0247, "germandbls"},
            {0140, "grave"},
            {076, "greater"},
            {0307, "guillemotleft"},
            {0310, "guillemotright"},
```

### OctalLiteral
Octal integer `0307`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0140, "grave"},
            {076, "greater"},
            {0307, "guillemotleft"},
            {0310, "guillemotright"},
            {0334, "guilsinglleft"},
```

### OctalLiteral
Octal integer `0310`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {076, "greater"},
            {0307, "guillemotleft"},
            {0310, "guillemotright"},
            {0334, "guilsinglleft"},
            {0335, "guilsinglright"},
```

### OctalLiteral
Octal integer `0334`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0307, "guillemotleft"},
            {0310, "guillemotright"},
            {0334, "guilsinglleft"},
            {0335, "guilsinglright"},
            {0150, "h"},
```

### OctalLiteral
Octal integer `0335`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0310, "guillemotright"},
            {0334, "guilsinglleft"},
            {0335, "guilsinglright"},
            {0150, "h"},
            {0375, "hungarumlaut"},
```

### OctalLiteral
Octal integer `0150`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0334, "guilsinglleft"},
            {0335, "guilsinglright"},
            {0150, "h"},
            {0375, "hungarumlaut"},
            {055, "hyphen"},
```

### OctalLiteral
Octal integer `0375`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0335, "guilsinglright"},
            {0150, "h"},
            {0375, "hungarumlaut"},
            {055, "hyphen"},
            {0151, "i"},
```

### OctalLiteral
Octal integer `055`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0150, "h"},
            {0375, "hungarumlaut"},
            {055, "hyphen"},
            {0151, "i"},
            {0222, "iacute"},
```

### OctalLiteral
Octal integer `0151`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0375, "hungarumlaut"},
            {055, "hyphen"},
            {0151, "i"},
            {0222, "iacute"},
            {0224, "icircumflex"},
```

### OctalLiteral
Octal integer `0222`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {055, "hyphen"},
            {0151, "i"},
            {0222, "iacute"},
            {0224, "icircumflex"},
            {0225, "idieresis"},
```

### OctalLiteral
Octal integer `0224`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0151, "i"},
            {0222, "iacute"},
            {0224, "icircumflex"},
            {0225, "idieresis"},
            {0223, "igrave"},
```

### OctalLiteral
Octal integer `0225`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0222, "iacute"},
            {0224, "icircumflex"},
            {0225, "idieresis"},
            {0223, "igrave"},
            {0152, "j"},
```

### OctalLiteral
Octal integer `0223`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0224, "icircumflex"},
            {0225, "idieresis"},
            {0223, "igrave"},
            {0152, "j"},
            {0153, "k"},
```

### OctalLiteral
Octal integer `0152`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0225, "idieresis"},
            {0223, "igrave"},
            {0152, "j"},
            {0153, "k"},
            {0154, "l"},
```

### OctalLiteral
Octal integer `0153`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0223, "igrave"},
            {0152, "j"},
            {0153, "k"},
            {0154, "l"},
            {074, "less"},
```

### OctalLiteral
Octal integer `0154`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0152, "j"},
            {0153, "k"},
            {0154, "l"},
            {074, "less"},
            {0302, "logicalnot"},
```

### OctalLiteral
Octal integer `074`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0153, "k"},
            {0154, "l"},
            {074, "less"},
            {0302, "logicalnot"},
            {0155, "m"},
```

### OctalLiteral
Octal integer `0302`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0154, "l"},
            {074, "less"},
            {0302, "logicalnot"},
            {0155, "m"},
            {0370, "macron"},
```

### OctalLiteral
Octal integer `0155`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {074, "less"},
            {0302, "logicalnot"},
            {0155, "m"},
            {0370, "macron"},
            {0265, "mu"},
```

### OctalLiteral
Octal integer `0370`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0302, "logicalnot"},
            {0155, "m"},
            {0370, "macron"},
            {0265, "mu"},
            {0156, "n"},
```

### OctalLiteral
Octal integer `0265`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0155, "m"},
            {0370, "macron"},
            {0265, "mu"},
            {0156, "n"},
            {071, "nine"},
```

### OctalLiteral
Octal integer `0156`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0370, "macron"},
            {0265, "mu"},
            {0156, "n"},
            {071, "nine"},
            {0226, "ntilde"},
```

### OctalLiteral
Octal integer `071`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0265, "mu"},
            {0156, "n"},
            {071, "nine"},
            {0226, "ntilde"},
            {043, "numbersign"},
```

### OctalLiteral
Octal integer `0226`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0156, "n"},
            {071, "nine"},
            {0226, "ntilde"},
            {043, "numbersign"},
            {0157, "o"},
```

### OctalLiteral
Octal integer `043`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {071, "nine"},
            {0226, "ntilde"},
            {043, "numbersign"},
            {0157, "o"},
            {0227, "oacute"},
```

### OctalLiteral
Octal integer `0157`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0226, "ntilde"},
            {043, "numbersign"},
            {0157, "o"},
            {0227, "oacute"},
            {0231, "ocircumflex"},
```

### OctalLiteral
Octal integer `0227`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {043, "numbersign"},
            {0157, "o"},
            {0227, "oacute"},
            {0231, "ocircumflex"},
            {0232, "odieresis"},
```

### OctalLiteral
Octal integer `0231`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0157, "o"},
            {0227, "oacute"},
            {0231, "ocircumflex"},
            {0232, "odieresis"},
            {0317, "oe"},
```

### OctalLiteral
Octal integer `0232`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0227, "oacute"},
            {0231, "ocircumflex"},
            {0232, "odieresis"},
            {0317, "oe"},
            {0376, "ogonek"},
```

### OctalLiteral
Octal integer `0317`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0231, "ocircumflex"},
            {0232, "odieresis"},
            {0317, "oe"},
            {0376, "ogonek"},
            {0230, "ograve"},
```

### OctalLiteral
Octal integer `0376`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0232, "odieresis"},
            {0317, "oe"},
            {0376, "ogonek"},
            {0230, "ograve"},
            {061, "one"},
```

### OctalLiteral
Octal integer `0230`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0317, "oe"},
            {0376, "ogonek"},
            {0230, "ograve"},
            {061, "one"},
            {0273, "ordfeminine"},
```

### OctalLiteral
Octal integer `061`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0376, "ogonek"},
            {0230, "ograve"},
            {061, "one"},
            {0273, "ordfeminine"},
            {0274, "ordmasculine"},
```

### OctalLiteral
Octal integer `0273`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0230, "ograve"},
            {061, "one"},
            {0273, "ordfeminine"},
            {0274, "ordmasculine"},
            {0277, "oslash"},
```

### OctalLiteral
Octal integer `0274`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {061, "one"},
            {0273, "ordfeminine"},
            {0274, "ordmasculine"},
            {0277, "oslash"},
            {0233, "otilde"},
```

### OctalLiteral
Octal integer `0277`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0273, "ordfeminine"},
            {0274, "ordmasculine"},
            {0277, "oslash"},
            {0233, "otilde"},
            {0160, "p"},
```

### OctalLiteral
Octal integer `0233`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0274, "ordmasculine"},
            {0277, "oslash"},
            {0233, "otilde"},
            {0160, "p"},
            {0246, "paragraph"},
```

### OctalLiteral
Octal integer `0160`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0277, "oslash"},
            {0233, "otilde"},
            {0160, "p"},
            {0246, "paragraph"},
            {050, "parenleft"},
```

### OctalLiteral
Octal integer `0246`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0233, "otilde"},
            {0160, "p"},
            {0246, "paragraph"},
            {050, "parenleft"},
            {051, "parenright"},
```

### OctalLiteral
Octal integer `050`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0160, "p"},
            {0246, "paragraph"},
            {050, "parenleft"},
            {051, "parenright"},
            {045, "percent"},
```

### OctalLiteral
Octal integer `051`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0246, "paragraph"},
            {050, "parenleft"},
            {051, "parenright"},
            {045, "percent"},
            {056, "period"},
```

### OctalLiteral
Octal integer `045`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {050, "parenleft"},
            {051, "parenright"},
            {045, "percent"},
            {056, "period"},
            {0341, "periodcentered"},
```

### OctalLiteral
Octal integer `056`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {051, "parenright"},
            {045, "percent"},
            {056, "period"},
            {0341, "periodcentered"},
            {0344, "perthousand"},
```

### OctalLiteral
Octal integer `0341`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {045, "percent"},
            {056, "period"},
            {0341, "periodcentered"},
            {0344, "perthousand"},
            {053, "plus"},
```

### OctalLiteral
Octal integer `0344`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {056, "period"},
            {0341, "periodcentered"},
            {0344, "perthousand"},
            {053, "plus"},
            {0261, "plusminus"},
```

### OctalLiteral
Octal integer `053`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0341, "periodcentered"},
            {0344, "perthousand"},
            {053, "plus"},
            {0261, "plusminus"},
            {0161, "q"},
```

### OctalLiteral
Octal integer `0261`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0344, "perthousand"},
            {053, "plus"},
            {0261, "plusminus"},
            {0161, "q"},
            {077, "question"},
```

### OctalLiteral
Octal integer `0161`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {053, "plus"},
            {0261, "plusminus"},
            {0161, "q"},
            {077, "question"},
            {0300, "questiondown"},
```

### OctalLiteral
Octal integer `077`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0261, "plusminus"},
            {0161, "q"},
            {077, "question"},
            {0300, "questiondown"},
            {042, "quotedbl"},
```

### OctalLiteral
Octal integer `0300`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0161, "q"},
            {077, "question"},
            {0300, "questiondown"},
            {042, "quotedbl"},
            {0343, "quotedblbase"},
```

### OctalLiteral
Octal integer `042`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {077, "question"},
            {0300, "questiondown"},
            {042, "quotedbl"},
            {0343, "quotedblbase"},
            {0322, "quotedblleft"},
```

### OctalLiteral
Octal integer `0343`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0300, "questiondown"},
            {042, "quotedbl"},
            {0343, "quotedblbase"},
            {0322, "quotedblleft"},
            {0323, "quotedblright"},
```

### OctalLiteral
Octal integer `0322`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {042, "quotedbl"},
            {0343, "quotedblbase"},
            {0322, "quotedblleft"},
            {0323, "quotedblright"},
            {0324, "quoteleft"},
```

### OctalLiteral
Octal integer `0323`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0343, "quotedblbase"},
            {0322, "quotedblleft"},
            {0323, "quotedblright"},
            {0324, "quoteleft"},
            {0325, "quoteright"},
```

### OctalLiteral
Octal integer `0324`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0322, "quotedblleft"},
            {0323, "quotedblright"},
            {0324, "quoteleft"},
            {0325, "quoteright"},
            {0342, "quotesinglbase"},
```

### OctalLiteral
Octal integer `0325`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0323, "quotedblright"},
            {0324, "quoteleft"},
            {0325, "quoteright"},
            {0342, "quotesinglbase"},
            {047, "quotesingle"},
```

### OctalLiteral
Octal integer `0342`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0324, "quoteleft"},
            {0325, "quoteright"},
            {0342, "quotesinglbase"},
            {047, "quotesingle"},
            {0162, "r"},
```

### OctalLiteral
Octal integer `047`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0325, "quoteright"},
            {0342, "quotesinglbase"},
            {047, "quotesingle"},
            {0162, "r"},
            {0250, "registered"},
```

### OctalLiteral
Octal integer `0162`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0342, "quotesinglbase"},
            {047, "quotesingle"},
            {0162, "r"},
            {0250, "registered"},
            {0373, "ring"},
```

### OctalLiteral
Octal integer `0250`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {047, "quotesingle"},
            {0162, "r"},
            {0250, "registered"},
            {0373, "ring"},
            {0163, "s"},
```

### OctalLiteral
Octal integer `0373`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0162, "r"},
            {0250, "registered"},
            {0373, "ring"},
            {0163, "s"},
            {0244, "section"},
```

### OctalLiteral
Octal integer `0163`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0250, "registered"},
            {0373, "ring"},
            {0163, "s"},
            {0244, "section"},
            {073, "semicolon"},
```

### OctalLiteral
Octal integer `0244`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0373, "ring"},
            {0163, "s"},
            {0244, "section"},
            {073, "semicolon"},
            {067, "seven"},
```

### OctalLiteral
Octal integer `073`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0163, "s"},
            {0244, "section"},
            {073, "semicolon"},
            {067, "seven"},
            {066, "six"},
```

### OctalLiteral
Octal integer `067`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0244, "section"},
            {073, "semicolon"},
            {067, "seven"},
            {066, "six"},
            {057, "slash"},
```

### OctalLiteral
Octal integer `066`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {073, "semicolon"},
            {067, "seven"},
            {066, "six"},
            {057, "slash"},
            {040, "space"},
```

### OctalLiteral
Octal integer `057`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {067, "seven"},
            {066, "six"},
            {057, "slash"},
            {040, "space"},
            {0243, "sterling"},
```

### OctalLiteral
Octal integer `040`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {066, "six"},
            {057, "slash"},
            {040, "space"},
            {0243, "sterling"},
            {0164, "t"},
```

### OctalLiteral
Octal integer `0243`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {057, "slash"},
            {040, "space"},
            {0243, "sterling"},
            {0164, "t"},
            {063, "three"},
```

### OctalLiteral
Octal integer `0164`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {040, "space"},
            {0243, "sterling"},
            {0164, "t"},
            {063, "three"},
            {0367, "tilde"},
```

### OctalLiteral
Octal integer `063`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0243, "sterling"},
            {0164, "t"},
            {063, "three"},
            {0367, "tilde"},
            {0252, "trademark"},
```

### OctalLiteral
Octal integer `0367`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0164, "t"},
            {063, "three"},
            {0367, "tilde"},
            {0252, "trademark"},
            {062, "two"},
```

### OctalLiteral
Octal integer `0252`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {063, "three"},
            {0367, "tilde"},
            {0252, "trademark"},
            {062, "two"},
            {0165, "u"},
```

### OctalLiteral
Octal integer `062`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0367, "tilde"},
            {0252, "trademark"},
            {062, "two"},
            {0165, "u"},
            {0234, "uacute"},
```

### OctalLiteral
Octal integer `0165`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0252, "trademark"},
            {062, "two"},
            {0165, "u"},
            {0234, "uacute"},
            {0236, "ucircumflex"},
```

### OctalLiteral
Octal integer `0234`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {062, "two"},
            {0165, "u"},
            {0234, "uacute"},
            {0236, "ucircumflex"},
            {0237, "udieresis"},
```

### OctalLiteral
Octal integer `0236`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0165, "u"},
            {0234, "uacute"},
            {0236, "ucircumflex"},
            {0237, "udieresis"},
            {0235, "ugrave"},
```

### OctalLiteral
Octal integer `0237`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0234, "uacute"},
            {0236, "ucircumflex"},
            {0237, "udieresis"},
            {0235, "ugrave"},
            {0137, "underscore"},
```

### OctalLiteral
Octal integer `0235`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0236, "ucircumflex"},
            {0237, "udieresis"},
            {0235, "ugrave"},
            {0137, "underscore"},
            {0166, "v"},
```

### OctalLiteral
Octal integer `0137`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0237, "udieresis"},
            {0235, "ugrave"},
            {0137, "underscore"},
            {0166, "v"},
            {0167, "w"},
```

### OctalLiteral
Octal integer `0166`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0235, "ugrave"},
            {0137, "underscore"},
            {0166, "v"},
            {0167, "w"},
            {0170, "x"},
```

### OctalLiteral
Octal integer `0167`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0137, "underscore"},
            {0166, "v"},
            {0167, "w"},
            {0170, "x"},
            {0171, "y"},
```

### OctalLiteral
Octal integer `0170`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0166, "v"},
            {0167, "w"},
            {0170, "x"},
            {0171, "y"},
            {0330, "ydieresis"},
```

### OctalLiteral
Octal integer `0171`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0167, "w"},
            {0170, "x"},
            {0171, "y"},
            {0330, "ydieresis"},
            {0264, "yen"},
```

### OctalLiteral
Octal integer `0330`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0170, "x"},
            {0171, "y"},
            {0330, "ydieresis"},
            {0264, "yen"},
            {0172, "z"},
```

### OctalLiteral
Octal integer `0264`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0171, "y"},
            {0330, "ydieresis"},
            {0264, "yen"},
            {0172, "z"},
            {060, "zero"},
```

### OctalLiteral
Octal integer `0172`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0330, "ydieresis"},
            {0264, "yen"},
            {0172, "z"},
            {060, "zero"},
            // adding an additional mapping as defined in Appendix D of the pdf spec
```

### OctalLiteral
Octal integer `060`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0264, "yen"},
            {0172, "z"},
            {060, "zero"},
            // adding an additional mapping as defined in Appendix D of the pdf spec
            {0312, "nbspace"}
```

### OctalLiteral
Octal integer `0312`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {060, "zero"},
            // adding an additional mapping as defined in Appendix D of the pdf spec
            {0312, "nbspace"}
    };
    
```

### OctalLiteral
Octal integer `0101`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
     */
    private static final Object[][] STANDARD_ENCODING_TABLE = {
            {0101, "A"},
            {0341, "AE"},
            {0102, "B"},
```

### OctalLiteral
Octal integer `0341`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
    private static final Object[][] STANDARD_ENCODING_TABLE = {
            {0101, "A"},
            {0341, "AE"},
            {0102, "B"},
            {0103, "C"},
```

### OctalLiteral
Octal integer `0102`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0101, "A"},
            {0341, "AE"},
            {0102, "B"},
            {0103, "C"},
            {0104, "D"},
```

### OctalLiteral
Octal integer `0103`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0341, "AE"},
            {0102, "B"},
            {0103, "C"},
            {0104, "D"},
            {0105, "E"},
```

### OctalLiteral
Octal integer `0104`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0102, "B"},
            {0103, "C"},
            {0104, "D"},
            {0105, "E"},
            {0106, "F"},
```

### OctalLiteral
Octal integer `0105`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0103, "C"},
            {0104, "D"},
            {0105, "E"},
            {0106, "F"},
            {0107, "G"},
```

### OctalLiteral
Octal integer `0106`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0104, "D"},
            {0105, "E"},
            {0106, "F"},
            {0107, "G"},
            {0110, "H"},
```

### OctalLiteral
Octal integer `0107`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0105, "E"},
            {0106, "F"},
            {0107, "G"},
            {0110, "H"},
            {0111, "I"},
```

### OctalLiteral
Octal integer `0110`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0106, "F"},
            {0107, "G"},
            {0110, "H"},
            {0111, "I"},
            {0112, "J"},
```

### OctalLiteral
Octal integer `0111`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0107, "G"},
            {0110, "H"},
            {0111, "I"},
            {0112, "J"},
            {0113, "K"},
```

### OctalLiteral
Octal integer `0112`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0110, "H"},
            {0111, "I"},
            {0112, "J"},
            {0113, "K"},
            {0114, "L"},
```

### OctalLiteral
Octal integer `0113`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0111, "I"},
            {0112, "J"},
            {0113, "K"},
            {0114, "L"},
            {0350, "Lslash"},
```

### OctalLiteral
Octal integer `0114`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0112, "J"},
            {0113, "K"},
            {0114, "L"},
            {0350, "Lslash"},
            {0115, "M"},
```

### OctalLiteral
Octal integer `0350`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0113, "K"},
            {0114, "L"},
            {0350, "Lslash"},
            {0115, "M"},
            {0116, "N"},
```

### OctalLiteral
Octal integer `0115`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0114, "L"},
            {0350, "Lslash"},
            {0115, "M"},
            {0116, "N"},
            {0117, "O"},
```

### OctalLiteral
Octal integer `0116`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0350, "Lslash"},
            {0115, "M"},
            {0116, "N"},
            {0117, "O"},
            {0352, "OE"},
```

### OctalLiteral
Octal integer `0117`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0115, "M"},
            {0116, "N"},
            {0117, "O"},
            {0352, "OE"},
            {0351, "Oslash"},
```

### OctalLiteral
Octal integer `0352`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0116, "N"},
            {0117, "O"},
            {0352, "OE"},
            {0351, "Oslash"},
            {0120, "P"},
```

### OctalLiteral
Octal integer `0351`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0117, "O"},
            {0352, "OE"},
            {0351, "Oslash"},
            {0120, "P"},
            {0121, "Q"},
```

### OctalLiteral
Octal integer `0120`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0352, "OE"},
            {0351, "Oslash"},
            {0120, "P"},
            {0121, "Q"},
            {0122, "R"},
```

### OctalLiteral
Octal integer `0121`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0351, "Oslash"},
            {0120, "P"},
            {0121, "Q"},
            {0122, "R"},
            {0123, "S"},
```

### OctalLiteral
Octal integer `0122`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0120, "P"},
            {0121, "Q"},
            {0122, "R"},
            {0123, "S"},
            {0124, "T"},
```

### OctalLiteral
Octal integer `0123`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0121, "Q"},
            {0122, "R"},
            {0123, "S"},
            {0124, "T"},
            {0125, "U"},
```

### OctalLiteral
Octal integer `0124`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0122, "R"},
            {0123, "S"},
            {0124, "T"},
            {0125, "U"},
            {0126, "V"},
```

### OctalLiteral
Octal integer `0125`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0123, "S"},
            {0124, "T"},
            {0125, "U"},
            {0126, "V"},
            {0127, "W"},
```

### OctalLiteral
Octal integer `0126`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0124, "T"},
            {0125, "U"},
            {0126, "V"},
            {0127, "W"},
            {0130, "X"},
```

### OctalLiteral
Octal integer `0127`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0125, "U"},
            {0126, "V"},
            {0127, "W"},
            {0130, "X"},
            {0131, "Y"},
```

### OctalLiteral
Octal integer `0130`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0126, "V"},
            {0127, "W"},
            {0130, "X"},
            {0131, "Y"},
            {0132, "Z"},
```

### OctalLiteral
Octal integer `0131`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0127, "W"},
            {0130, "X"},
            {0131, "Y"},
            {0132, "Z"},
            {0141, "a"},
```

### OctalLiteral
Octal integer `0132`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0130, "X"},
            {0131, "Y"},
            {0132, "Z"},
            {0141, "a"},
            {0302, "acute"},
```

### OctalLiteral
Octal integer `0141`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0131, "Y"},
            {0132, "Z"},
            {0141, "a"},
            {0302, "acute"},
            {0361, "ae"},
```

### OctalLiteral
Octal integer `0302`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0132, "Z"},
            {0141, "a"},
            {0302, "acute"},
            {0361, "ae"},
            {0046, "ampersand"},
```

### OctalLiteral
Octal integer `0361`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0141, "a"},
            {0302, "acute"},
            {0361, "ae"},
            {0046, "ampersand"},
            {0136, "asciicircum"},
```

### OctalLiteral
Octal integer `0046`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0302, "acute"},
            {0361, "ae"},
            {0046, "ampersand"},
            {0136, "asciicircum"},
            {0176, "asciitilde"},
```

### OctalLiteral
Octal integer `0136`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0361, "ae"},
            {0046, "ampersand"},
            {0136, "asciicircum"},
            {0176, "asciitilde"},
            {0052, "asterisk"},
```

### OctalLiteral
Octal integer `0176`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0046, "ampersand"},
            {0136, "asciicircum"},
            {0176, "asciitilde"},
            {0052, "asterisk"},
            {0100, "at"},
```

### OctalLiteral
Octal integer `0052`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0136, "asciicircum"},
            {0176, "asciitilde"},
            {0052, "asterisk"},
            {0100, "at"},
            {0142, "b"},
```

### OctalLiteral
Octal integer `0100`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0176, "asciitilde"},
            {0052, "asterisk"},
            {0100, "at"},
            {0142, "b"},
            {0134, "backslash"},
```

### OctalLiteral
Octal integer `0142`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0052, "asterisk"},
            {0100, "at"},
            {0142, "b"},
            {0134, "backslash"},
            {0174, "bar"},
```

### OctalLiteral
Octal integer `0134`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0100, "at"},
            {0142, "b"},
            {0134, "backslash"},
            {0174, "bar"},
            {0173, "braceleft"},
```

### OctalLiteral
Octal integer `0174`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0142, "b"},
            {0134, "backslash"},
            {0174, "bar"},
            {0173, "braceleft"},
            {0175, "braceright"},
```

### OctalLiteral
Octal integer `0173`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0134, "backslash"},
            {0174, "bar"},
            {0173, "braceleft"},
            {0175, "braceright"},
            {0133, "bracketleft"},
```

### OctalLiteral
Octal integer `0175`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0174, "bar"},
            {0173, "braceleft"},
            {0175, "braceright"},
            {0133, "bracketleft"},
            {0135, "bracketright"},
```

### OctalLiteral
Octal integer `0133`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0173, "braceleft"},
            {0175, "braceright"},
            {0133, "bracketleft"},
            {0135, "bracketright"},
            {0306, "breve"},
```

### OctalLiteral
Octal integer `0135`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0175, "braceright"},
            {0133, "bracketleft"},
            {0135, "bracketright"},
            {0306, "breve"},
            {0267, "bullet"},
```

### OctalLiteral
Octal integer `0306`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0133, "bracketleft"},
            {0135, "bracketright"},
            {0306, "breve"},
            {0267, "bullet"},
            {0143, "c"},
```

### OctalLiteral
Octal integer `0267`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0135, "bracketright"},
            {0306, "breve"},
            {0267, "bullet"},
            {0143, "c"},
            {0317, "caron"},
```

### OctalLiteral
Octal integer `0143`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0306, "breve"},
            {0267, "bullet"},
            {0143, "c"},
            {0317, "caron"},
            {0313, "cedilla"},
```

### OctalLiteral
Octal integer `0317`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0267, "bullet"},
            {0143, "c"},
            {0317, "caron"},
            {0313, "cedilla"},
            {0242, "cent"},
```

### OctalLiteral
Octal integer `0313`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0143, "c"},
            {0317, "caron"},
            {0313, "cedilla"},
            {0242, "cent"},
            {0303, "circumflex"},
```

### OctalLiteral
Octal integer `0242`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0317, "caron"},
            {0313, "cedilla"},
            {0242, "cent"},
            {0303, "circumflex"},
            {0072, "colon"},
```

### OctalLiteral
Octal integer `0303`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0313, "cedilla"},
            {0242, "cent"},
            {0303, "circumflex"},
            {0072, "colon"},
            {0054, "comma"},
```

### OctalLiteral
Octal integer `0072`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0242, "cent"},
            {0303, "circumflex"},
            {0072, "colon"},
            {0054, "comma"},
            {0250, "currency"},
```

### OctalLiteral
Octal integer `0054`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0303, "circumflex"},
            {0072, "colon"},
            {0054, "comma"},
            {0250, "currency"},
            {0144, "d"},
```

### OctalLiteral
Octal integer `0250`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0072, "colon"},
            {0054, "comma"},
            {0250, "currency"},
            {0144, "d"},
            {0262, "dagger"},
```

### OctalLiteral
Octal integer `0144`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0054, "comma"},
            {0250, "currency"},
            {0144, "d"},
            {0262, "dagger"},
            {0263, "daggerdbl"},
```

### OctalLiteral
Octal integer `0262`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0250, "currency"},
            {0144, "d"},
            {0262, "dagger"},
            {0263, "daggerdbl"},
            {0310, "dieresis"},
```

### OctalLiteral
Octal integer `0263`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0144, "d"},
            {0262, "dagger"},
            {0263, "daggerdbl"},
            {0310, "dieresis"},
            {0044, "dollar"},
```

### OctalLiteral
Octal integer `0310`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0262, "dagger"},
            {0263, "daggerdbl"},
            {0310, "dieresis"},
            {0044, "dollar"},
            {0307, "dotaccent"},
```

### OctalLiteral
Octal integer `0044`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0263, "daggerdbl"},
            {0310, "dieresis"},
            {0044, "dollar"},
            {0307, "dotaccent"},
            {0365, "dotlessi"},
```

### OctalLiteral
Octal integer `0307`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0310, "dieresis"},
            {0044, "dollar"},
            {0307, "dotaccent"},
            {0365, "dotlessi"},
            {0145, "e"},
```

### OctalLiteral
Octal integer `0365`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0044, "dollar"},
            {0307, "dotaccent"},
            {0365, "dotlessi"},
            {0145, "e"},
            {0070, "eight"},
```

### OctalLiteral
Octal integer `0145`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0307, "dotaccent"},
            {0365, "dotlessi"},
            {0145, "e"},
            {0070, "eight"},
            {0274, "ellipsis"},
```

### OctalLiteral
Octal integer `0070`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0365, "dotlessi"},
            {0145, "e"},
            {0070, "eight"},
            {0274, "ellipsis"},
            {0320, "emdash"},
```

### OctalLiteral
Octal integer `0274`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0145, "e"},
            {0070, "eight"},
            {0274, "ellipsis"},
            {0320, "emdash"},
            {0261, "endash"},
```

### OctalLiteral
Octal integer `0320`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0070, "eight"},
            {0274, "ellipsis"},
            {0320, "emdash"},
            {0261, "endash"},
            {0075, "equal"},
```

### OctalLiteral
Octal integer `0261`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0274, "ellipsis"},
            {0320, "emdash"},
            {0261, "endash"},
            {0075, "equal"},
            {0041, "exclam"},
```

### OctalLiteral
Octal integer `0075`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0320, "emdash"},
            {0261, "endash"},
            {0075, "equal"},
            {0041, "exclam"},
            {0241, "exclamdown"},
```

### OctalLiteral
Octal integer `0041`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0261, "endash"},
            {0075, "equal"},
            {0041, "exclam"},
            {0241, "exclamdown"},
            {0146, "f"},
```

### OctalLiteral
Octal integer `0241`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0075, "equal"},
            {0041, "exclam"},
            {0241, "exclamdown"},
            {0146, "f"},
            {0256, "fi"},
```

### OctalLiteral
Octal integer `0146`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0041, "exclam"},
            {0241, "exclamdown"},
            {0146, "f"},
            {0256, "fi"},
            {0065, "five"},
```

### OctalLiteral
Octal integer `0256`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0241, "exclamdown"},
            {0146, "f"},
            {0256, "fi"},
            {0065, "five"},
            {0257, "fl"},
```

### OctalLiteral
Octal integer `0065`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0146, "f"},
            {0256, "fi"},
            {0065, "five"},
            {0257, "fl"},
            {0246, "florin"},
```

### OctalLiteral
Octal integer `0257`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0256, "fi"},
            {0065, "five"},
            {0257, "fl"},
            {0246, "florin"},
            {0064, "four"},
```

### OctalLiteral
Octal integer `0246`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0065, "five"},
            {0257, "fl"},
            {0246, "florin"},
            {0064, "four"},
            {0244, "fraction"},
```

### OctalLiteral
Octal integer `0064`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0257, "fl"},
            {0246, "florin"},
            {0064, "four"},
            {0244, "fraction"},
            {0147, "g"},
```

### OctalLiteral
Octal integer `0244`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0246, "florin"},
            {0064, "four"},
            {0244, "fraction"},
            {0147, "g"},
            {0373, "germandbls"},
```

### OctalLiteral
Octal integer `0147`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0064, "four"},
            {0244, "fraction"},
            {0147, "g"},
            {0373, "germandbls"},
            {0301, "grave"},
```

### OctalLiteral
Octal integer `0373`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0244, "fraction"},
            {0147, "g"},
            {0373, "germandbls"},
            {0301, "grave"},
            {0076, "greater"},
```

### OctalLiteral
Octal integer `0301`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0147, "g"},
            {0373, "germandbls"},
            {0301, "grave"},
            {0076, "greater"},
            {0253, "guillemotleft"},
```

### OctalLiteral
Octal integer `0076`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0373, "germandbls"},
            {0301, "grave"},
            {0076, "greater"},
            {0253, "guillemotleft"},
            {0273, "guillemotright"},
```

### OctalLiteral
Octal integer `0253`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0301, "grave"},
            {0076, "greater"},
            {0253, "guillemotleft"},
            {0273, "guillemotright"},
            {0254, "guilsinglleft"},
```

### OctalLiteral
Octal integer `0273`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0076, "greater"},
            {0253, "guillemotleft"},
            {0273, "guillemotright"},
            {0254, "guilsinglleft"},
            {0255, "guilsinglright"},
```

### OctalLiteral
Octal integer `0254`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0253, "guillemotleft"},
            {0273, "guillemotright"},
            {0254, "guilsinglleft"},
            {0255, "guilsinglright"},
            {0150, "h"},
```

### OctalLiteral
Octal integer `0255`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0273, "guillemotright"},
            {0254, "guilsinglleft"},
            {0255, "guilsinglright"},
            {0150, "h"},
            {0315, "hungarumlaut"},
```

### OctalLiteral
Octal integer `0150`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0254, "guilsinglleft"},
            {0255, "guilsinglright"},
            {0150, "h"},
            {0315, "hungarumlaut"},
            {0055, "hyphen"},
```

### OctalLiteral
Octal integer `0315`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0255, "guilsinglright"},
            {0150, "h"},
            {0315, "hungarumlaut"},
            {0055, "hyphen"},
            {0151, "i"},
```

### OctalLiteral
Octal integer `0055`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0150, "h"},
            {0315, "hungarumlaut"},
            {0055, "hyphen"},
            {0151, "i"},
            {0152, "j"},
```

### OctalLiteral
Octal integer `0151`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0315, "hungarumlaut"},
            {0055, "hyphen"},
            {0151, "i"},
            {0152, "j"},
            {0153, "k"},
```

### OctalLiteral
Octal integer `0152`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0055, "hyphen"},
            {0151, "i"},
            {0152, "j"},
            {0153, "k"},
            {0154, "l"},
```

### OctalLiteral
Octal integer `0153`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0151, "i"},
            {0152, "j"},
            {0153, "k"},
            {0154, "l"},
            {0074, "less"},
```

### OctalLiteral
Octal integer `0154`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0152, "j"},
            {0153, "k"},
            {0154, "l"},
            {0074, "less"},
            {0370, "lslash"},
```

### OctalLiteral
Octal integer `0074`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0153, "k"},
            {0154, "l"},
            {0074, "less"},
            {0370, "lslash"},
            {0155, "m"},
```

### OctalLiteral
Octal integer `0370`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0154, "l"},
            {0074, "less"},
            {0370, "lslash"},
            {0155, "m"},
            {0305, "macron"},
```

### OctalLiteral
Octal integer `0155`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0074, "less"},
            {0370, "lslash"},
            {0155, "m"},
            {0305, "macron"},
            {0156, "n"},
```

### OctalLiteral
Octal integer `0305`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0370, "lslash"},
            {0155, "m"},
            {0305, "macron"},
            {0156, "n"},
            {0071, "nine"},
```

### OctalLiteral
Octal integer `0156`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0155, "m"},
            {0305, "macron"},
            {0156, "n"},
            {0071, "nine"},
            {0043, "numbersign"},
```

### OctalLiteral
Octal integer `0071`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0305, "macron"},
            {0156, "n"},
            {0071, "nine"},
            {0043, "numbersign"},
            {0157, "o"},
```

### OctalLiteral
Octal integer `0043`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0156, "n"},
            {0071, "nine"},
            {0043, "numbersign"},
            {0157, "o"},
            {0372, "oe"},
```

### OctalLiteral
Octal integer `0157`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0071, "nine"},
            {0043, "numbersign"},
            {0157, "o"},
            {0372, "oe"},
            {0316, "ogonek"},
```

### OctalLiteral
Octal integer `0372`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0043, "numbersign"},
            {0157, "o"},
            {0372, "oe"},
            {0316, "ogonek"},
            {0061, "one"},
```

### OctalLiteral
Octal integer `0316`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0157, "o"},
            {0372, "oe"},
            {0316, "ogonek"},
            {0061, "one"},
            {0343, "ordfeminine"},
```

### OctalLiteral
Octal integer `0061`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0372, "oe"},
            {0316, "ogonek"},
            {0061, "one"},
            {0343, "ordfeminine"},
            {0353, "ordmasculine"},
```

### OctalLiteral
Octal integer `0343`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0316, "ogonek"},
            {0061, "one"},
            {0343, "ordfeminine"},
            {0353, "ordmasculine"},
            {0371, "oslash"},
```

### OctalLiteral
Octal integer `0353`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0061, "one"},
            {0343, "ordfeminine"},
            {0353, "ordmasculine"},
            {0371, "oslash"},
            {0160, "p"},
```

### OctalLiteral
Octal integer `0371`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0343, "ordfeminine"},
            {0353, "ordmasculine"},
            {0371, "oslash"},
            {0160, "p"},
            {0266, "paragraph"},
```

### OctalLiteral
Octal integer `0160`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0353, "ordmasculine"},
            {0371, "oslash"},
            {0160, "p"},
            {0266, "paragraph"},
            {0050, "parenleft"},
```

### OctalLiteral
Octal integer `0266`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0371, "oslash"},
            {0160, "p"},
            {0266, "paragraph"},
            {0050, "parenleft"},
            {0051, "parenright"},
```

### OctalLiteral
Octal integer `0050`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0160, "p"},
            {0266, "paragraph"},
            {0050, "parenleft"},
            {0051, "parenright"},
            {0045, "percent"},
```

### OctalLiteral
Octal integer `0051`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0266, "paragraph"},
            {0050, "parenleft"},
            {0051, "parenright"},
            {0045, "percent"},
            {0056, "period"},
```

### OctalLiteral
Octal integer `0045`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0050, "parenleft"},
            {0051, "parenright"},
            {0045, "percent"},
            {0056, "period"},
            {0264, "periodcentered"},
```

### OctalLiteral
Octal integer `0056`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0051, "parenright"},
            {0045, "percent"},
            {0056, "period"},
            {0264, "periodcentered"},
            {0275, "perthousand"},
```

### OctalLiteral
Octal integer `0264`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0045, "percent"},
            {0056, "period"},
            {0264, "periodcentered"},
            {0275, "perthousand"},
            {0053, "plus"},
```

### OctalLiteral
Octal integer `0275`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0056, "period"},
            {0264, "periodcentered"},
            {0275, "perthousand"},
            {0053, "plus"},
            {0161, "q"},
```

### OctalLiteral
Octal integer `0053`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0264, "periodcentered"},
            {0275, "perthousand"},
            {0053, "plus"},
            {0161, "q"},
            {0077, "question"},
```

### OctalLiteral
Octal integer `0161`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0275, "perthousand"},
            {0053, "plus"},
            {0161, "q"},
            {0077, "question"},
            {0277, "questiondown"},
```

### OctalLiteral
Octal integer `0077`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0053, "plus"},
            {0161, "q"},
            {0077, "question"},
            {0277, "questiondown"},
            {0042, "quotedbl"},
```

### OctalLiteral
Octal integer `0277`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0161, "q"},
            {0077, "question"},
            {0277, "questiondown"},
            {0042, "quotedbl"},
            {0271, "quotedblbase"},
```

### OctalLiteral
Octal integer `0042`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0077, "question"},
            {0277, "questiondown"},
            {0042, "quotedbl"},
            {0271, "quotedblbase"},
            {0252, "quotedblleft"},
```

### OctalLiteral
Octal integer `0271`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0277, "questiondown"},
            {0042, "quotedbl"},
            {0271, "quotedblbase"},
            {0252, "quotedblleft"},
            {0272, "quotedblright"},
```

### OctalLiteral
Octal integer `0252`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0042, "quotedbl"},
            {0271, "quotedblbase"},
            {0252, "quotedblleft"},
            {0272, "quotedblright"},
            {0140, "quoteleft"},
```

### OctalLiteral
Octal integer `0272`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0271, "quotedblbase"},
            {0252, "quotedblleft"},
            {0272, "quotedblright"},
            {0140, "quoteleft"},
            {0047, "quoteright"},
```

### OctalLiteral
Octal integer `0140`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0252, "quotedblleft"},
            {0272, "quotedblright"},
            {0140, "quoteleft"},
            {0047, "quoteright"},
            {0270, "quotesinglbase"},
```

### OctalLiteral
Octal integer `0047`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0272, "quotedblright"},
            {0140, "quoteleft"},
            {0047, "quoteright"},
            {0270, "quotesinglbase"},
            {0251, "quotesingle"},
```

### OctalLiteral
Octal integer `0270`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0140, "quoteleft"},
            {0047, "quoteright"},
            {0270, "quotesinglbase"},
            {0251, "quotesingle"},
            {0162, "r"},
```

### OctalLiteral
Octal integer `0251`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0047, "quoteright"},
            {0270, "quotesinglbase"},
            {0251, "quotesingle"},
            {0162, "r"},
            {0312, "ring"},
```

### OctalLiteral
Octal integer `0162`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0270, "quotesinglbase"},
            {0251, "quotesingle"},
            {0162, "r"},
            {0312, "ring"},
            {0163, "s"},
```

### OctalLiteral
Octal integer `0312`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0251, "quotesingle"},
            {0162, "r"},
            {0312, "ring"},
            {0163, "s"},
            {0247, "section"},
```

### OctalLiteral
Octal integer `0163`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0162, "r"},
            {0312, "ring"},
            {0163, "s"},
            {0247, "section"},
            {0073, "semicolon"},
```

### OctalLiteral
Octal integer `0247`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0312, "ring"},
            {0163, "s"},
            {0247, "section"},
            {0073, "semicolon"},
            {0067, "seven"},
```

### OctalLiteral
Octal integer `0073`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0163, "s"},
            {0247, "section"},
            {0073, "semicolon"},
            {0067, "seven"},
            {0066, "six"},
```

### OctalLiteral
Octal integer `0067`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0247, "section"},
            {0073, "semicolon"},
            {0067, "seven"},
            {0066, "six"},
            {0057, "slash"},
```

### OctalLiteral
Octal integer `0066`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0073, "semicolon"},
            {0067, "seven"},
            {0066, "six"},
            {0057, "slash"},
            {0040, "space"},
```

### OctalLiteral
Octal integer `0057`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0067, "seven"},
            {0066, "six"},
            {0057, "slash"},
            {0040, "space"},
            {0243, "sterling"},
```

### OctalLiteral
Octal integer `0040`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0066, "six"},
            {0057, "slash"},
            {0040, "space"},
            {0243, "sterling"},
            {0164, "t"},
```

### OctalLiteral
Octal integer `0243`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0057, "slash"},
            {0040, "space"},
            {0243, "sterling"},
            {0164, "t"},
            {0063, "three"},
```

### OctalLiteral
Octal integer `0164`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0040, "space"},
            {0243, "sterling"},
            {0164, "t"},
            {0063, "three"},
            {0304, "tilde"},
```

### OctalLiteral
Octal integer `0063`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0243, "sterling"},
            {0164, "t"},
            {0063, "three"},
            {0304, "tilde"},
            {0062, "two"},
```

### OctalLiteral
Octal integer `0304`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0164, "t"},
            {0063, "three"},
            {0304, "tilde"},
            {0062, "two"},
            {0165, "u"},
```

### OctalLiteral
Octal integer `0062`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0063, "three"},
            {0304, "tilde"},
            {0062, "two"},
            {0165, "u"},
            {0137, "underscore"},
```

### OctalLiteral
Octal integer `0165`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0304, "tilde"},
            {0062, "two"},
            {0165, "u"},
            {0137, "underscore"},
            {0166, "v"},
```

### OctalLiteral
Octal integer `0137`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0062, "two"},
            {0165, "u"},
            {0137, "underscore"},
            {0166, "v"},
            {0167, "w"},
```

### OctalLiteral
Octal integer `0166`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0165, "u"},
            {0137, "underscore"},
            {0166, "v"},
            {0167, "w"},
            {0170, "x"},
```

### OctalLiteral
Octal integer `0167`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0137, "underscore"},
            {0166, "v"},
            {0167, "w"},
            {0170, "x"},
            {0171, "y"},
```

### OctalLiteral
Octal integer `0170`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0166, "v"},
            {0167, "w"},
            {0170, "x"},
            {0171, "y"},
            {0245, "yen"},
```

### OctalLiteral
Octal integer `0171`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0167, "w"},
            {0170, "x"},
            {0171, "y"},
            {0245, "yen"},
            {0172, "z"},
```

### OctalLiteral
Octal integer `0245`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0170, "x"},
            {0171, "y"},
            {0245, "yen"},
            {0172, "z"},
            {0060, "zero"}
```

### OctalLiteral
Octal integer `0172`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0171, "y"},
            {0245, "yen"},
            {0172, "z"},
            {0060, "zero"}
    };
```

### OctalLiteral
Octal integer `0060`
in `fontbox/src/main/java/org/apache/fontbox/encoding/StandardEncoding.java`
#### Snippet
```java
            {0245, "yen"},
            {0172, "z"},
            {0060, "zero"}
    };
    /**
```

### OctalLiteral
Octal integer `0101`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
     */
    private static final Object[][] MAC_ROMAN_ENCODING_TABLE = {
            {0101, "A"},
            {0256, "AE"},
            {0347, "Aacute"},
```

### OctalLiteral
Octal integer `0256`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
    private static final Object[][] MAC_ROMAN_ENCODING_TABLE = {
            {0101, "A"},
            {0256, "AE"},
            {0347, "Aacute"},
            {0345, "Acircumflex"},
```

### OctalLiteral
Octal integer `0347`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0101, "A"},
            {0256, "AE"},
            {0347, "Aacute"},
            {0345, "Acircumflex"},
            {0200, "Adieresis"},
```

### OctalLiteral
Octal integer `0345`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0256, "AE"},
            {0347, "Aacute"},
            {0345, "Acircumflex"},
            {0200, "Adieresis"},
            {0313, "Agrave"},
```

### OctalLiteral
Octal integer `0200`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0347, "Aacute"},
            {0345, "Acircumflex"},
            {0200, "Adieresis"},
            {0313, "Agrave"},
            {0201, "Aring"},
```

### OctalLiteral
Octal integer `0313`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0345, "Acircumflex"},
            {0200, "Adieresis"},
            {0313, "Agrave"},
            {0201, "Aring"},
            {0314, "Atilde"},
```

### OctalLiteral
Octal integer `0201`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0200, "Adieresis"},
            {0313, "Agrave"},
            {0201, "Aring"},
            {0314, "Atilde"},
            {0102, "B"},
```

### OctalLiteral
Octal integer `0314`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0313, "Agrave"},
            {0201, "Aring"},
            {0314, "Atilde"},
            {0102, "B"},
            {0103, "C"},
```

### OctalLiteral
Octal integer `0102`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0201, "Aring"},
            {0314, "Atilde"},
            {0102, "B"},
            {0103, "C"},
            {0202, "Ccedilla"},
```

### OctalLiteral
Octal integer `0103`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0314, "Atilde"},
            {0102, "B"},
            {0103, "C"},
            {0202, "Ccedilla"},
            {0104, "D"},
```

### OctalLiteral
Octal integer `0202`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0102, "B"},
            {0103, "C"},
            {0202, "Ccedilla"},
            {0104, "D"},
            {0105, "E"},
```

### OctalLiteral
Octal integer `0104`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0103, "C"},
            {0202, "Ccedilla"},
            {0104, "D"},
            {0105, "E"},
            {0203, "Eacute"},
```

### OctalLiteral
Octal integer `0105`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0202, "Ccedilla"},
            {0104, "D"},
            {0105, "E"},
            {0203, "Eacute"},
            {0346, "Ecircumflex"},
```

### OctalLiteral
Octal integer `0203`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0104, "D"},
            {0105, "E"},
            {0203, "Eacute"},
            {0346, "Ecircumflex"},
            {0350, "Edieresis"},
```

### OctalLiteral
Octal integer `0346`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0105, "E"},
            {0203, "Eacute"},
            {0346, "Ecircumflex"},
            {0350, "Edieresis"},
            {0351, "Egrave"},
```

### OctalLiteral
Octal integer `0350`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0203, "Eacute"},
            {0346, "Ecircumflex"},
            {0350, "Edieresis"},
            {0351, "Egrave"},
            {0106, "F"},
```

### OctalLiteral
Octal integer `0351`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0346, "Ecircumflex"},
            {0350, "Edieresis"},
            {0351, "Egrave"},
            {0106, "F"},
            {0107, "G"},
```

### OctalLiteral
Octal integer `0106`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0350, "Edieresis"},
            {0351, "Egrave"},
            {0106, "F"},
            {0107, "G"},
            {0110, "H"},
```

### OctalLiteral
Octal integer `0107`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0351, "Egrave"},
            {0106, "F"},
            {0107, "G"},
            {0110, "H"},
            {0111, "I"},
```

### OctalLiteral
Octal integer `0110`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0106, "F"},
            {0107, "G"},
            {0110, "H"},
            {0111, "I"},
            {0352, "Iacute"},
```

### OctalLiteral
Octal integer `0111`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0107, "G"},
            {0110, "H"},
            {0111, "I"},
            {0352, "Iacute"},
            {0353, "Icircumflex"},
```

### OctalLiteral
Octal integer `0352`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0110, "H"},
            {0111, "I"},
            {0352, "Iacute"},
            {0353, "Icircumflex"},
            {0354, "Idieresis"},
```

### OctalLiteral
Octal integer `0353`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0111, "I"},
            {0352, "Iacute"},
            {0353, "Icircumflex"},
            {0354, "Idieresis"},
            {0355, "Igrave"},
```

### OctalLiteral
Octal integer `0354`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0352, "Iacute"},
            {0353, "Icircumflex"},
            {0354, "Idieresis"},
            {0355, "Igrave"},
            {0112, "J"},
```

### OctalLiteral
Octal integer `0355`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0353, "Icircumflex"},
            {0354, "Idieresis"},
            {0355, "Igrave"},
            {0112, "J"},
            {0113, "K"},
```

### OctalLiteral
Octal integer `0112`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0354, "Idieresis"},
            {0355, "Igrave"},
            {0112, "J"},
            {0113, "K"},
            {0114, "L"},
```

### OctalLiteral
Octal integer `0113`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0355, "Igrave"},
            {0112, "J"},
            {0113, "K"},
            {0114, "L"},
            {0115, "M"},
```

### OctalLiteral
Octal integer `0114`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0112, "J"},
            {0113, "K"},
            {0114, "L"},
            {0115, "M"},
            {0116, "N"},
```

### OctalLiteral
Octal integer `0115`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0113, "K"},
            {0114, "L"},
            {0115, "M"},
            {0116, "N"},
            {0204, "Ntilde"},
```

### OctalLiteral
Octal integer `0116`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0114, "L"},
            {0115, "M"},
            {0116, "N"},
            {0204, "Ntilde"},
            {0117, "O"},
```

### OctalLiteral
Octal integer `0204`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0115, "M"},
            {0116, "N"},
            {0204, "Ntilde"},
            {0117, "O"},
            {0316, "OE"},
```

### OctalLiteral
Octal integer `0117`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0116, "N"},
            {0204, "Ntilde"},
            {0117, "O"},
            {0316, "OE"},
            {0356, "Oacute"},
```

### OctalLiteral
Octal integer `0316`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0204, "Ntilde"},
            {0117, "O"},
            {0316, "OE"},
            {0356, "Oacute"},
            {0357, "Ocircumflex"},
```

### OctalLiteral
Octal integer `0356`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0117, "O"},
            {0316, "OE"},
            {0356, "Oacute"},
            {0357, "Ocircumflex"},
            {0205, "Odieresis"},
```

### OctalLiteral
Octal integer `0357`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0316, "OE"},
            {0356, "Oacute"},
            {0357, "Ocircumflex"},
            {0205, "Odieresis"},
            {0361, "Ograve"},
```

### OctalLiteral
Octal integer `0205`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0356, "Oacute"},
            {0357, "Ocircumflex"},
            {0205, "Odieresis"},
            {0361, "Ograve"},
            {0257, "Oslash"},
```

### OctalLiteral
Octal integer `0361`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0357, "Ocircumflex"},
            {0205, "Odieresis"},
            {0361, "Ograve"},
            {0257, "Oslash"},
            {0315, "Otilde"},
```

### OctalLiteral
Octal integer `0257`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0205, "Odieresis"},
            {0361, "Ograve"},
            {0257, "Oslash"},
            {0315, "Otilde"},
            {0120, "P"},
```

### OctalLiteral
Octal integer `0315`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0361, "Ograve"},
            {0257, "Oslash"},
            {0315, "Otilde"},
            {0120, "P"},
            {0121, "Q"},
```

### OctalLiteral
Octal integer `0120`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0257, "Oslash"},
            {0315, "Otilde"},
            {0120, "P"},
            {0121, "Q"},
            {0122, "R"},
```

### OctalLiteral
Octal integer `0121`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0315, "Otilde"},
            {0120, "P"},
            {0121, "Q"},
            {0122, "R"},
            {0123, "S"},
```

### OctalLiteral
Octal integer `0122`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0120, "P"},
            {0121, "Q"},
            {0122, "R"},
            {0123, "S"},
            {0124, "T"},
```

### OctalLiteral
Octal integer `0123`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0121, "Q"},
            {0122, "R"},
            {0123, "S"},
            {0124, "T"},
            {0125, "U"},
```

### OctalLiteral
Octal integer `0124`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0122, "R"},
            {0123, "S"},
            {0124, "T"},
            {0125, "U"},
            {0362, "Uacute"},
```

### OctalLiteral
Octal integer `0125`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0123, "S"},
            {0124, "T"},
            {0125, "U"},
            {0362, "Uacute"},
            {0363, "Ucircumflex"},
```

### OctalLiteral
Octal integer `0362`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0124, "T"},
            {0125, "U"},
            {0362, "Uacute"},
            {0363, "Ucircumflex"},
            {0206, "Udieresis"},
```

### OctalLiteral
Octal integer `0363`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0125, "U"},
            {0362, "Uacute"},
            {0363, "Ucircumflex"},
            {0206, "Udieresis"},
            {0364, "Ugrave"},
```

### OctalLiteral
Octal integer `0206`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0362, "Uacute"},
            {0363, "Ucircumflex"},
            {0206, "Udieresis"},
            {0364, "Ugrave"},
            {0126, "V"},
```

### OctalLiteral
Octal integer `0364`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0363, "Ucircumflex"},
            {0206, "Udieresis"},
            {0364, "Ugrave"},
            {0126, "V"},
            {0127, "W"},
```

### OctalLiteral
Octal integer `0126`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0206, "Udieresis"},
            {0364, "Ugrave"},
            {0126, "V"},
            {0127, "W"},
            {0130, "X"},
```

### OctalLiteral
Octal integer `0127`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0364, "Ugrave"},
            {0126, "V"},
            {0127, "W"},
            {0130, "X"},
            {0131, "Y"},
```

### OctalLiteral
Octal integer `0130`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0126, "V"},
            {0127, "W"},
            {0130, "X"},
            {0131, "Y"},
            {0331, "Ydieresis"},
```

### OctalLiteral
Octal integer `0131`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0127, "W"},
            {0130, "X"},
            {0131, "Y"},
            {0331, "Ydieresis"},
            {0132, "Z"},
```

### OctalLiteral
Octal integer `0331`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0130, "X"},
            {0131, "Y"},
            {0331, "Ydieresis"},
            {0132, "Z"},
            {0141, "a"},
```

### OctalLiteral
Octal integer `0132`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0131, "Y"},
            {0331, "Ydieresis"},
            {0132, "Z"},
            {0141, "a"},
            {0207, "aacute"},
```

### OctalLiteral
Octal integer `0141`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0331, "Ydieresis"},
            {0132, "Z"},
            {0141, "a"},
            {0207, "aacute"},
            {0211, "acircumflex"},
```

### OctalLiteral
Octal integer `0207`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0132, "Z"},
            {0141, "a"},
            {0207, "aacute"},
            {0211, "acircumflex"},
            {0253, "acute"},
```

### OctalLiteral
Octal integer `0211`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0141, "a"},
            {0207, "aacute"},
            {0211, "acircumflex"},
            {0253, "acute"},
            {0212, "adieresis"},
```

### OctalLiteral
Octal integer `0253`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0207, "aacute"},
            {0211, "acircumflex"},
            {0253, "acute"},
            {0212, "adieresis"},
            {0276, "ae"},
```

### OctalLiteral
Octal integer `0212`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0211, "acircumflex"},
            {0253, "acute"},
            {0212, "adieresis"},
            {0276, "ae"},
            {0210, "agrave"},
```

### OctalLiteral
Octal integer `0276`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0253, "acute"},
            {0212, "adieresis"},
            {0276, "ae"},
            {0210, "agrave"},
            {046, "ampersand"},
```

### OctalLiteral
Octal integer `0210`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0212, "adieresis"},
            {0276, "ae"},
            {0210, "agrave"},
            {046, "ampersand"},
            {0214, "aring"},
```

### OctalLiteral
Octal integer `046`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0276, "ae"},
            {0210, "agrave"},
            {046, "ampersand"},
            {0214, "aring"},
            {0136, "asciicircum"},
```

### OctalLiteral
Octal integer `0214`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0210, "agrave"},
            {046, "ampersand"},
            {0214, "aring"},
            {0136, "asciicircum"},
            {0176, "asciitilde"},
```

### OctalLiteral
Octal integer `0136`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {046, "ampersand"},
            {0214, "aring"},
            {0136, "asciicircum"},
            {0176, "asciitilde"},
            {052, "asterisk"},
```

### OctalLiteral
Octal integer `0176`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0214, "aring"},
            {0136, "asciicircum"},
            {0176, "asciitilde"},
            {052, "asterisk"},
            {0100, "at"},
```

### OctalLiteral
Octal integer `052`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0136, "asciicircum"},
            {0176, "asciitilde"},
            {052, "asterisk"},
            {0100, "at"},
            {0213, "atilde"},
```

### OctalLiteral
Octal integer `0100`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0176, "asciitilde"},
            {052, "asterisk"},
            {0100, "at"},
            {0213, "atilde"},
            {0142, "b"},
```

### OctalLiteral
Octal integer `0213`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {052, "asterisk"},
            {0100, "at"},
            {0213, "atilde"},
            {0142, "b"},
            {0134, "backslash"},
```

### OctalLiteral
Octal integer `0142`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0100, "at"},
            {0213, "atilde"},
            {0142, "b"},
            {0134, "backslash"},
            {0174, "bar"},
```

### OctalLiteral
Octal integer `0134`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0213, "atilde"},
            {0142, "b"},
            {0134, "backslash"},
            {0174, "bar"},
            {0173, "braceleft"},
```

### OctalLiteral
Octal integer `0174`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0142, "b"},
            {0134, "backslash"},
            {0174, "bar"},
            {0173, "braceleft"},
            {0175, "braceright"},
```

### OctalLiteral
Octal integer `0173`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0134, "backslash"},
            {0174, "bar"},
            {0173, "braceleft"},
            {0175, "braceright"},
            {0133, "bracketleft"},
```

### OctalLiteral
Octal integer `0175`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0174, "bar"},
            {0173, "braceleft"},
            {0175, "braceright"},
            {0133, "bracketleft"},
            {0135, "bracketright"},
```

### OctalLiteral
Octal integer `0133`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0173, "braceleft"},
            {0175, "braceright"},
            {0133, "bracketleft"},
            {0135, "bracketright"},
            {0371, "breve"},
```

### OctalLiteral
Octal integer `0135`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0175, "braceright"},
            {0133, "bracketleft"},
            {0135, "bracketright"},
            {0371, "breve"},
            {0245, "bullet"},
```

### OctalLiteral
Octal integer `0371`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0133, "bracketleft"},
            {0135, "bracketright"},
            {0371, "breve"},
            {0245, "bullet"},
            {0143, "c"},
```

### OctalLiteral
Octal integer `0245`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0135, "bracketright"},
            {0371, "breve"},
            {0245, "bullet"},
            {0143, "c"},
            {0377, "caron"},
```

### OctalLiteral
Octal integer `0143`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0371, "breve"},
            {0245, "bullet"},
            {0143, "c"},
            {0377, "caron"},
            {0215, "ccedilla"},
```

### OctalLiteral
Octal integer `0377`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0245, "bullet"},
            {0143, "c"},
            {0377, "caron"},
            {0215, "ccedilla"},
            {0374, "cedilla"},
```

### OctalLiteral
Octal integer `0215`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0143, "c"},
            {0377, "caron"},
            {0215, "ccedilla"},
            {0374, "cedilla"},
            {0242, "cent"},
```

### OctalLiteral
Octal integer `0374`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0377, "caron"},
            {0215, "ccedilla"},
            {0374, "cedilla"},
            {0242, "cent"},
            {0366, "circumflex"},
```

### OctalLiteral
Octal integer `0242`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0215, "ccedilla"},
            {0374, "cedilla"},
            {0242, "cent"},
            {0366, "circumflex"},
            {072, "colon"},
```

### OctalLiteral
Octal integer `0366`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0374, "cedilla"},
            {0242, "cent"},
            {0366, "circumflex"},
            {072, "colon"},
            {054, "comma"},
```

### OctalLiteral
Octal integer `072`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0242, "cent"},
            {0366, "circumflex"},
            {072, "colon"},
            {054, "comma"},
            {0251, "copyright"},
```

### OctalLiteral
Octal integer `054`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0366, "circumflex"},
            {072, "colon"},
            {054, "comma"},
            {0251, "copyright"},
            {0333, "currency"},
```

### OctalLiteral
Octal integer `0251`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {072, "colon"},
            {054, "comma"},
            {0251, "copyright"},
            {0333, "currency"},
            {0144, "d"},
```

### OctalLiteral
Octal integer `0333`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {054, "comma"},
            {0251, "copyright"},
            {0333, "currency"},
            {0144, "d"},
            {0240, "dagger"},
```

### OctalLiteral
Octal integer `0144`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0251, "copyright"},
            {0333, "currency"},
            {0144, "d"},
            {0240, "dagger"},
            {0340, "daggerdbl"},
```

### OctalLiteral
Octal integer `0240`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0333, "currency"},
            {0144, "d"},
            {0240, "dagger"},
            {0340, "daggerdbl"},
            {0241, "degree"},
```

### OctalLiteral
Octal integer `0340`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0144, "d"},
            {0240, "dagger"},
            {0340, "daggerdbl"},
            {0241, "degree"},
            {0254, "dieresis"},
```

### OctalLiteral
Octal integer `0241`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0240, "dagger"},
            {0340, "daggerdbl"},
            {0241, "degree"},
            {0254, "dieresis"},
            {0326, "divide"},
```

### OctalLiteral
Octal integer `0254`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0340, "daggerdbl"},
            {0241, "degree"},
            {0254, "dieresis"},
            {0326, "divide"},
            {044, "dollar"},
```

### OctalLiteral
Octal integer `0326`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0241, "degree"},
            {0254, "dieresis"},
            {0326, "divide"},
            {044, "dollar"},
            {0372, "dotaccent"},
```

### OctalLiteral
Octal integer `044`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0254, "dieresis"},
            {0326, "divide"},
            {044, "dollar"},
            {0372, "dotaccent"},
            {0365, "dotlessi"},
```

### OctalLiteral
Octal integer `0372`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0326, "divide"},
            {044, "dollar"},
            {0372, "dotaccent"},
            {0365, "dotlessi"},
            {0145, "e"},
```

### OctalLiteral
Octal integer `0365`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {044, "dollar"},
            {0372, "dotaccent"},
            {0365, "dotlessi"},
            {0145, "e"},
            {0216, "eacute"},
```

### OctalLiteral
Octal integer `0145`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0372, "dotaccent"},
            {0365, "dotlessi"},
            {0145, "e"},
            {0216, "eacute"},
            {0220, "ecircumflex"},
```

### OctalLiteral
Octal integer `0216`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0365, "dotlessi"},
            {0145, "e"},
            {0216, "eacute"},
            {0220, "ecircumflex"},
            {0221, "edieresis"},
```

### OctalLiteral
Octal integer `0220`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0145, "e"},
            {0216, "eacute"},
            {0220, "ecircumflex"},
            {0221, "edieresis"},
            {0217, "egrave"},
```

### OctalLiteral
Octal integer `0221`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0216, "eacute"},
            {0220, "ecircumflex"},
            {0221, "edieresis"},
            {0217, "egrave"},
            {070, "eight"},
```

### OctalLiteral
Octal integer `0217`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0220, "ecircumflex"},
            {0221, "edieresis"},
            {0217, "egrave"},
            {070, "eight"},
            {0311, "ellipsis"},
```

### OctalLiteral
Octal integer `070`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0221, "edieresis"},
            {0217, "egrave"},
            {070, "eight"},
            {0311, "ellipsis"},
            {0321, "emdash"},
```

### OctalLiteral
Octal integer `0311`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0217, "egrave"},
            {070, "eight"},
            {0311, "ellipsis"},
            {0321, "emdash"},
            {0320, "endash"},
```

### OctalLiteral
Octal integer `0321`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {070, "eight"},
            {0311, "ellipsis"},
            {0321, "emdash"},
            {0320, "endash"},
            {075, "equal"},
```

### OctalLiteral
Octal integer `0320`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0311, "ellipsis"},
            {0321, "emdash"},
            {0320, "endash"},
            {075, "equal"},
            {041, "exclam"},
```

### OctalLiteral
Octal integer `075`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0321, "emdash"},
            {0320, "endash"},
            {075, "equal"},
            {041, "exclam"},
            {0301, "exclamdown"},
```

### OctalLiteral
Octal integer `041`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0320, "endash"},
            {075, "equal"},
            {041, "exclam"},
            {0301, "exclamdown"},
            {0146, "f"},
```

### OctalLiteral
Octal integer `0301`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {075, "equal"},
            {041, "exclam"},
            {0301, "exclamdown"},
            {0146, "f"},
            {0336, "fi"},
```

### OctalLiteral
Octal integer `0146`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {041, "exclam"},
            {0301, "exclamdown"},
            {0146, "f"},
            {0336, "fi"},
            {065, "five"},
```

### OctalLiteral
Octal integer `0336`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0301, "exclamdown"},
            {0146, "f"},
            {0336, "fi"},
            {065, "five"},
            {0337, "fl"},
```

### OctalLiteral
Octal integer `065`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0146, "f"},
            {0336, "fi"},
            {065, "five"},
            {0337, "fl"},
            {0304, "florin"},
```

### OctalLiteral
Octal integer `0337`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0336, "fi"},
            {065, "five"},
            {0337, "fl"},
            {0304, "florin"},
            {064, "four"},
```

### OctalLiteral
Octal integer `0304`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {065, "five"},
            {0337, "fl"},
            {0304, "florin"},
            {064, "four"},
            {0332, "fraction"},
```

### OctalLiteral
Octal integer `064`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0337, "fl"},
            {0304, "florin"},
            {064, "four"},
            {0332, "fraction"},
            {0147, "g"},
```

### OctalLiteral
Octal integer `0332`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0304, "florin"},
            {064, "four"},
            {0332, "fraction"},
            {0147, "g"},
            {0247, "germandbls"},
```

### OctalLiteral
Octal integer `0147`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {064, "four"},
            {0332, "fraction"},
            {0147, "g"},
            {0247, "germandbls"},
            {0140, "grave"},
```

### OctalLiteral
Octal integer `0247`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0332, "fraction"},
            {0147, "g"},
            {0247, "germandbls"},
            {0140, "grave"},
            {076, "greater"},
```

### OctalLiteral
Octal integer `0140`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0147, "g"},
            {0247, "germandbls"},
            {0140, "grave"},
            {076, "greater"},
            {0307, "guillemotleft"},
```

### OctalLiteral
Octal integer `076`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0247, "germandbls"},
            {0140, "grave"},
            {076, "greater"},
            {0307, "guillemotleft"},
            {0310, "guillemotright"},
```

### OctalLiteral
Octal integer `0307`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0140, "grave"},
            {076, "greater"},
            {0307, "guillemotleft"},
            {0310, "guillemotright"},
            {0334, "guilsinglleft"},
```

### OctalLiteral
Octal integer `0310`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {076, "greater"},
            {0307, "guillemotleft"},
            {0310, "guillemotright"},
            {0334, "guilsinglleft"},
            {0335, "guilsinglright"},
```

### OctalLiteral
Octal integer `0334`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0307, "guillemotleft"},
            {0310, "guillemotright"},
            {0334, "guilsinglleft"},
            {0335, "guilsinglright"},
            {0150, "h"},
```

### OctalLiteral
Octal integer `0335`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0310, "guillemotright"},
            {0334, "guilsinglleft"},
            {0335, "guilsinglright"},
            {0150, "h"},
            {0375, "hungarumlaut"},
```

### OctalLiteral
Octal integer `0150`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0334, "guilsinglleft"},
            {0335, "guilsinglright"},
            {0150, "h"},
            {0375, "hungarumlaut"},
            {055, "hyphen"},
```

### OctalLiteral
Octal integer `0375`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0335, "guilsinglright"},
            {0150, "h"},
            {0375, "hungarumlaut"},
            {055, "hyphen"},
            {0151, "i"},
```

### OctalLiteral
Octal integer `055`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0150, "h"},
            {0375, "hungarumlaut"},
            {055, "hyphen"},
            {0151, "i"},
            {0222, "iacute"},
```

### OctalLiteral
Octal integer `0151`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0375, "hungarumlaut"},
            {055, "hyphen"},
            {0151, "i"},
            {0222, "iacute"},
            {0224, "icircumflex"},
```

### OctalLiteral
Octal integer `0222`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {055, "hyphen"},
            {0151, "i"},
            {0222, "iacute"},
            {0224, "icircumflex"},
            {0225, "idieresis"},
```

### OctalLiteral
Octal integer `0224`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0151, "i"},
            {0222, "iacute"},
            {0224, "icircumflex"},
            {0225, "idieresis"},
            {0223, "igrave"},
```

### OctalLiteral
Octal integer `0225`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0222, "iacute"},
            {0224, "icircumflex"},
            {0225, "idieresis"},
            {0223, "igrave"},
            {0152, "j"},
```

### OctalLiteral
Octal integer `0223`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0224, "icircumflex"},
            {0225, "idieresis"},
            {0223, "igrave"},
            {0152, "j"},
            {0153, "k"},
```

### OctalLiteral
Octal integer `0152`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0225, "idieresis"},
            {0223, "igrave"},
            {0152, "j"},
            {0153, "k"},
            {0154, "l"},
```

### OctalLiteral
Octal integer `0153`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0223, "igrave"},
            {0152, "j"},
            {0153, "k"},
            {0154, "l"},
            {074, "less"},
```

### OctalLiteral
Octal integer `0154`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0152, "j"},
            {0153, "k"},
            {0154, "l"},
            {074, "less"},
            {0302, "logicalnot"},
```

### OctalLiteral
Octal integer `074`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0153, "k"},
            {0154, "l"},
            {074, "less"},
            {0302, "logicalnot"},
            {0155, "m"},
```

### OctalLiteral
Octal integer `0302`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0154, "l"},
            {074, "less"},
            {0302, "logicalnot"},
            {0155, "m"},
            {0370, "macron"},
```

### OctalLiteral
Octal integer `0155`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {074, "less"},
            {0302, "logicalnot"},
            {0155, "m"},
            {0370, "macron"},
            {0265, "mu"},
```

### OctalLiteral
Octal integer `0370`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0302, "logicalnot"},
            {0155, "m"},
            {0370, "macron"},
            {0265, "mu"},
            {0156, "n"},
```

### OctalLiteral
Octal integer `0265`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0155, "m"},
            {0370, "macron"},
            {0265, "mu"},
            {0156, "n"},
            {071, "nine"},
```

### OctalLiteral
Octal integer `0156`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0370, "macron"},
            {0265, "mu"},
            {0156, "n"},
            {071, "nine"},
            {0226, "ntilde"},
```

### OctalLiteral
Octal integer `071`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0265, "mu"},
            {0156, "n"},
            {071, "nine"},
            {0226, "ntilde"},
            {043, "numbersign"},
```

### OctalLiteral
Octal integer `0226`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0156, "n"},
            {071, "nine"},
            {0226, "ntilde"},
            {043, "numbersign"},
            {0157, "o"},
```

### OctalLiteral
Octal integer `043`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {071, "nine"},
            {0226, "ntilde"},
            {043, "numbersign"},
            {0157, "o"},
            {0227, "oacute"},
```

### OctalLiteral
Octal integer `0157`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0226, "ntilde"},
            {043, "numbersign"},
            {0157, "o"},
            {0227, "oacute"},
            {0231, "ocircumflex"},
```

### OctalLiteral
Octal integer `0227`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {043, "numbersign"},
            {0157, "o"},
            {0227, "oacute"},
            {0231, "ocircumflex"},
            {0232, "odieresis"},
```

### OctalLiteral
Octal integer `0231`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0157, "o"},
            {0227, "oacute"},
            {0231, "ocircumflex"},
            {0232, "odieresis"},
            {0317, "oe"},
```

### OctalLiteral
Octal integer `0232`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0227, "oacute"},
            {0231, "ocircumflex"},
            {0232, "odieresis"},
            {0317, "oe"},
            {0376, "ogonek"},
```

### OctalLiteral
Octal integer `0317`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0231, "ocircumflex"},
            {0232, "odieresis"},
            {0317, "oe"},
            {0376, "ogonek"},
            {0230, "ograve"},
```

### OctalLiteral
Octal integer `0376`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0232, "odieresis"},
            {0317, "oe"},
            {0376, "ogonek"},
            {0230, "ograve"},
            {061, "one"},
```

### OctalLiteral
Octal integer `0230`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0317, "oe"},
            {0376, "ogonek"},
            {0230, "ograve"},
            {061, "one"},
            {0273, "ordfeminine"},
```

### OctalLiteral
Octal integer `061`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0376, "ogonek"},
            {0230, "ograve"},
            {061, "one"},
            {0273, "ordfeminine"},
            {0274, "ordmasculine"},
```

### OctalLiteral
Octal integer `0273`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0230, "ograve"},
            {061, "one"},
            {0273, "ordfeminine"},
            {0274, "ordmasculine"},
            {0277, "oslash"},
```

### OctalLiteral
Octal integer `0274`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {061, "one"},
            {0273, "ordfeminine"},
            {0274, "ordmasculine"},
            {0277, "oslash"},
            {0233, "otilde"},
```

### OctalLiteral
Octal integer `0277`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0273, "ordfeminine"},
            {0274, "ordmasculine"},
            {0277, "oslash"},
            {0233, "otilde"},
            {0160, "p"},
```

### OctalLiteral
Octal integer `0233`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0274, "ordmasculine"},
            {0277, "oslash"},
            {0233, "otilde"},
            {0160, "p"},
            {0246, "paragraph"},
```

### OctalLiteral
Octal integer `0160`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0277, "oslash"},
            {0233, "otilde"},
            {0160, "p"},
            {0246, "paragraph"},
            {050, "parenleft"},
```

### OctalLiteral
Octal integer `0246`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0233, "otilde"},
            {0160, "p"},
            {0246, "paragraph"},
            {050, "parenleft"},
            {051, "parenright"},
```

### OctalLiteral
Octal integer `050`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0160, "p"},
            {0246, "paragraph"},
            {050, "parenleft"},
            {051, "parenright"},
            {045, "percent"},
```

### OctalLiteral
Octal integer `051`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0246, "paragraph"},
            {050, "parenleft"},
            {051, "parenright"},
            {045, "percent"},
            {056, "period"},
```

### OctalLiteral
Octal integer `045`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {050, "parenleft"},
            {051, "parenright"},
            {045, "percent"},
            {056, "period"},
            {0341, "periodcentered"},
```

### OctalLiteral
Octal integer `056`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {051, "parenright"},
            {045, "percent"},
            {056, "period"},
            {0341, "periodcentered"},
            {0344, "perthousand"},
```

### OctalLiteral
Octal integer `0341`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {045, "percent"},
            {056, "period"},
            {0341, "periodcentered"},
            {0344, "perthousand"},
            {053, "plus"},
```

### OctalLiteral
Octal integer `0344`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {056, "period"},
            {0341, "periodcentered"},
            {0344, "perthousand"},
            {053, "plus"},
            {0261, "plusminus"},
```

### OctalLiteral
Octal integer `053`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0341, "periodcentered"},
            {0344, "perthousand"},
            {053, "plus"},
            {0261, "plusminus"},
            {0161, "q"},
```

### OctalLiteral
Octal integer `0261`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0344, "perthousand"},
            {053, "plus"},
            {0261, "plusminus"},
            {0161, "q"},
            {077, "question"},
```

### OctalLiteral
Octal integer `0161`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {053, "plus"},
            {0261, "plusminus"},
            {0161, "q"},
            {077, "question"},
            {0300, "questiondown"},
```

### OctalLiteral
Octal integer `077`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0261, "plusminus"},
            {0161, "q"},
            {077, "question"},
            {0300, "questiondown"},
            {042, "quotedbl"},
```

### OctalLiteral
Octal integer `0300`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0161, "q"},
            {077, "question"},
            {0300, "questiondown"},
            {042, "quotedbl"},
            {0343, "quotedblbase"},
```

### OctalLiteral
Octal integer `042`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {077, "question"},
            {0300, "questiondown"},
            {042, "quotedbl"},
            {0343, "quotedblbase"},
            {0322, "quotedblleft"},
```

### OctalLiteral
Octal integer `0343`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0300, "questiondown"},
            {042, "quotedbl"},
            {0343, "quotedblbase"},
            {0322, "quotedblleft"},
            {0323, "quotedblright"},
```

### OctalLiteral
Octal integer `0322`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {042, "quotedbl"},
            {0343, "quotedblbase"},
            {0322, "quotedblleft"},
            {0323, "quotedblright"},
            {0324, "quoteleft"},
```

### OctalLiteral
Octal integer `0323`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0343, "quotedblbase"},
            {0322, "quotedblleft"},
            {0323, "quotedblright"},
            {0324, "quoteleft"},
            {0325, "quoteright"},
```

### OctalLiteral
Octal integer `0324`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0322, "quotedblleft"},
            {0323, "quotedblright"},
            {0324, "quoteleft"},
            {0325, "quoteright"},
            {0342, "quotesinglbase"},
```

### OctalLiteral
Octal integer `0325`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0323, "quotedblright"},
            {0324, "quoteleft"},
            {0325, "quoteright"},
            {0342, "quotesinglbase"},
            {047, "quotesingle"},
```

### OctalLiteral
Octal integer `0342`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0324, "quoteleft"},
            {0325, "quoteright"},
            {0342, "quotesinglbase"},
            {047, "quotesingle"},
            {0162, "r"},
```

### OctalLiteral
Octal integer `047`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0325, "quoteright"},
            {0342, "quotesinglbase"},
            {047, "quotesingle"},
            {0162, "r"},
            {0250, "registered"},
```

### OctalLiteral
Octal integer `0162`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0342, "quotesinglbase"},
            {047, "quotesingle"},
            {0162, "r"},
            {0250, "registered"},
            {0373, "ring"},
```

### OctalLiteral
Octal integer `0250`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {047, "quotesingle"},
            {0162, "r"},
            {0250, "registered"},
            {0373, "ring"},
            {0163, "s"},
```

### OctalLiteral
Octal integer `0373`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0162, "r"},
            {0250, "registered"},
            {0373, "ring"},
            {0163, "s"},
            {0244, "section"},
```

### OctalLiteral
Octal integer `0163`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0250, "registered"},
            {0373, "ring"},
            {0163, "s"},
            {0244, "section"},
            {073, "semicolon"},
```

### OctalLiteral
Octal integer `0244`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0373, "ring"},
            {0163, "s"},
            {0244, "section"},
            {073, "semicolon"},
            {067, "seven"},
```

### OctalLiteral
Octal integer `073`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0163, "s"},
            {0244, "section"},
            {073, "semicolon"},
            {067, "seven"},
            {066, "six"},
```

### OctalLiteral
Octal integer `067`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0244, "section"},
            {073, "semicolon"},
            {067, "seven"},
            {066, "six"},
            {057, "slash"},
```

### OctalLiteral
Octal integer `066`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {073, "semicolon"},
            {067, "seven"},
            {066, "six"},
            {057, "slash"},
            {040, "space"},
```

### OctalLiteral
Octal integer `057`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {067, "seven"},
            {066, "six"},
            {057, "slash"},
            {040, "space"},
            {0243, "sterling"},
```

### OctalLiteral
Octal integer `040`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {066, "six"},
            {057, "slash"},
            {040, "space"},
            {0243, "sterling"},
            {0164, "t"},
```

### OctalLiteral
Octal integer `0243`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {057, "slash"},
            {040, "space"},
            {0243, "sterling"},
            {0164, "t"},
            {063, "three"},
```

### OctalLiteral
Octal integer `0164`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {040, "space"},
            {0243, "sterling"},
            {0164, "t"},
            {063, "three"},
            {0367, "tilde"},
```

### OctalLiteral
Octal integer `063`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0243, "sterling"},
            {0164, "t"},
            {063, "three"},
            {0367, "tilde"},
            {0252, "trademark"},
```

### OctalLiteral
Octal integer `0367`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0164, "t"},
            {063, "three"},
            {0367, "tilde"},
            {0252, "trademark"},
            {062, "two"},
```

### OctalLiteral
Octal integer `0252`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {063, "three"},
            {0367, "tilde"},
            {0252, "trademark"},
            {062, "two"},
            {0165, "u"},
```

### OctalLiteral
Octal integer `062`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0367, "tilde"},
            {0252, "trademark"},
            {062, "two"},
            {0165, "u"},
            {0234, "uacute"},
```

### OctalLiteral
Octal integer `0165`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0252, "trademark"},
            {062, "two"},
            {0165, "u"},
            {0234, "uacute"},
            {0236, "ucircumflex"},
```

### OctalLiteral
Octal integer `0234`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {062, "two"},
            {0165, "u"},
            {0234, "uacute"},
            {0236, "ucircumflex"},
            {0237, "udieresis"},
```

### OctalLiteral
Octal integer `0236`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0165, "u"},
            {0234, "uacute"},
            {0236, "ucircumflex"},
            {0237, "udieresis"},
            {0235, "ugrave"},
```

### OctalLiteral
Octal integer `0237`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0234, "uacute"},
            {0236, "ucircumflex"},
            {0237, "udieresis"},
            {0235, "ugrave"},
            {0137, "underscore"},
```

### OctalLiteral
Octal integer `0235`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0236, "ucircumflex"},
            {0237, "udieresis"},
            {0235, "ugrave"},
            {0137, "underscore"},
            {0166, "v"},
```

### OctalLiteral
Octal integer `0137`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0237, "udieresis"},
            {0235, "ugrave"},
            {0137, "underscore"},
            {0166, "v"},
            {0167, "w"},
```

### OctalLiteral
Octal integer `0166`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0235, "ugrave"},
            {0137, "underscore"},
            {0166, "v"},
            {0167, "w"},
            {0170, "x"},
```

### OctalLiteral
Octal integer `0167`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0137, "underscore"},
            {0166, "v"},
            {0167, "w"},
            {0170, "x"},
            {0171, "y"},
```

### OctalLiteral
Octal integer `0170`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0166, "v"},
            {0167, "w"},
            {0170, "x"},
            {0171, "y"},
            {0330, "ydieresis"},
```

### OctalLiteral
Octal integer `0171`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0167, "w"},
            {0170, "x"},
            {0171, "y"},
            {0330, "ydieresis"},
            {0264, "yen"},
```

### OctalLiteral
Octal integer `0330`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0170, "x"},
            {0171, "y"},
            {0330, "ydieresis"},
            {0264, "yen"},
            {0172, "z"},
```

### OctalLiteral
Octal integer `0264`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0171, "y"},
            {0330, "ydieresis"},
            {0264, "yen"},
            {0172, "z"},
            {060, "zero"}
```

### OctalLiteral
Octal integer `0172`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0330, "ydieresis"},
            {0264, "yen"},
            {0172, "z"},
            {060, "zero"}
            
```

### OctalLiteral
Octal integer `060`
in `fontbox/src/main/java/org/apache/fontbox/encoding/MacRomanEncoding.java`
#### Snippet
```java
            {0264, "yen"},
            {0172, "z"},
            {060, "zero"}
            
    };
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `cid == lastCid + 1 && w1Value == lastW1Value && vxValue == lastVxValue && vyValue == lastVyValue`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/PDCIDFontType2Embedder.java`
#### Snippet
```java
            {
            case FIRST:
                if (cid == lastCid + 1 && w1Value == lastW1Value && vxValue == lastVxValue && vyValue == lastVyValue)
                {
                    state = State.SERIAL;
```

### DuplicateExpressions
Multiple occurrences of `cid == lastCid + 1 && w1Value == lastW1Value && vxValue == lastVxValue && vyValue == lastVyValue`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/PDCIDFontType2Embedder.java`
#### Snippet
```java
                break;
            case BRACKET:
                if (cid == lastCid + 1 && w1Value == lastW1Value && vxValue == lastVxValue && vyValue == lastVyValue)
                {
                    state = State.SERIAL;
```

### DuplicateExpressions
Multiple occurrences of `(output - Math.min(dMin, dMax)) / Math.abs(dMax - dMin)`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/image/SampledImageReader.java`
#### Snippet
```java
                                // interpolate to TYPE_SHORT
                                int outputShort = Math
                                        .round(((output - Math.min(dMin, dMax)) / Math.abs(dMax - dMin)) * 65535f);

                                srcColorValuesShort[c] = (short) outputShort;
```

### DuplicateExpressions
Multiple occurrences of `(output - Math.min(dMin, dMax)) / Math.abs(dMax - dMin)`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/image/SampledImageReader.java`
#### Snippet
```java
                                // interpolate to TYPE_BYTE
                                int outputByte = Math
                                        .round(((output - Math.min(dMin, dMax)) / Math.abs(dMax - dMin)) * 255f);

                                srcColorValuesBytes[c] = (byte) outputByte;
```

### DuplicateExpressions
Multiple occurrences of `"FeatureRecord array not alphabetically sorted by FeatureTag: " + feat...`
in `fontbox/src/main/java/org/apache/fontbox/ttf/GlyphSubstitutionTable.java`
#### Snippet
```java
                    // ArialUni.ttf has many warnings but isn't corrupt, so we assume that only
                    // strings with trash characters indicate real corruption
                    LOG.debug("FeatureRecord array not alphabetically sorted by FeatureTag: " +
                              featureTags[i] + " < " + featureTags[i - 1]);
                }
                else
```

### DuplicateExpressions
Multiple occurrences of `"FeatureRecord array not alphabetically sorted by FeatureTag: " + feat...`
in `fontbox/src/main/java/org/apache/fontbox/ttf/GlyphSubstitutionTable.java`
#### Snippet
```java
                else
                {
                    LOG.warn("FeatureRecord array not alphabetically sorted by FeatureTag: " +
                              featureTags[i] + " < " + featureTags[i - 1]);
                    return new FeatureListTable(0, new FeatureRecord[0]);
                }
```

### DuplicateExpressions
Multiple occurrences of `date.charAt(date.length() - 6)`
in `xmpbox/src/main/java/org/apache/xmpbox/DateConverter.java`
#### Snippet
```java
                // remove the arbitrary : in the timezone. SimpleDateFormat can't handle it
                if (date.charAt(date.length() - 3) == ':' && 
                    (date.charAt(date.length() - 6) == '+' || date.charAt(date.length() - 6) == '-'))
                {
                    // that's a timezone string, remove the :
```

### DuplicateExpressions
Multiple occurrences of `date.charAt(date.length() - 6)`
in `xmpbox/src/main/java/org/apache/xmpbox/DateConverter.java`
#### Snippet
```java
                // remove the arbitrary : in the timezone. SimpleDateFormat can't handle it
                if (date.charAt(date.length() - 3) == ':' && 
                    (date.charAt(date.length() - 6) == '+' || date.charAt(date.length() - 6) == '-'))
                {
                    // that's a timezone string, remove the :
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/digitalsignature/PDSeedValueCertificate.java`
#### Snippet
```java
            char encipherOnly, char decipherOnly)
    {
        StringBuilder builder = new StringBuilder();
        builder.append(digitalSignature);
        builder.append(nonRepudiation);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/PDFAIdentificationValidation.java`
#### Snippet
```java
    protected ValidationError unexpectedPrefixFoundError(String prefFound, String prefExpected, String schema)
    {
        StringBuilder sb = new StringBuilder(80);
        sb.append(schema).append(" found but prefix used is '").append(prefFound).append("', prefix '")
                .append(prefExpected).append("' is expected.");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/SynchronizedMetaDataValidation.java`
#### Snippet
```java
    protected ValidationError absentXMPPropertyError(String target, String details)
    {
        StringBuilder sb = new StringBuilder(80);
        sb.append(target).append(" present in the document catalog dictionary can't be found in XMP information (")
                .append(details).append(")");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/SynchronizedMetaDataValidation.java`
#### Snippet
```java
    protected ValidationException schemaAccessException(String target, Throwable cause)
    {
        StringBuilder sb = new StringBuilder(80);
        sb.append("Cannot access to the ").append(target).append(" schema");
        return new ValidationException(sb.toString(), cause);
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/SynchronizedMetaDataValidation.java`
#### Snippet
```java
    protected ValidationError badFieldXMPPropertyError(String target, String details)
    {
        StringBuilder sb = new StringBuilder(80);
        sb.append(target).append(" property is not a multi-lingual property in XMP information(")
                .append(details).append(")");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/SynchronizedMetaDataValidation.java`
#### Snippet
```java
    protected ValidationError unexpectedPrefixFoundError(String prefFound, String prefExpected, String schema)
    {
        StringBuilder sb = new StringBuilder(80);
        sb.append(schema).append(" found but prefix used is '").append(prefFound).append("', prefix '")
                .append(prefExpected).append("' is expected.");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/SynchronizedMetaDataValidation.java`
#### Snippet
```java
    protected ValidationError absentSchemaMetaDataError(String target, String schema)
    {
        StringBuilder sb = new StringBuilder(80);
        sb.append(target).append(" present in the document catalog dictionary can't be found in XMP information (")
                .append(schema).append(" schema not declared)");
```

## RuleId[id=Deprecation]
### Deprecation
'appendRawCommands(byte\[\])' is deprecated
in `debugger/src/main/java/org/apache/pdfbox/debugger/fontencodingpane/Type3Font.java`
#### Snippet
```java
                cs.setFont(font, scale / Math.min(Math.abs(scalingFactorX), Math.abs(scalingFactorY)));
                // can't use showText() because there's no guarantee we have the unicode
                cs.appendRawCommands(String.format("<%02X> Tj%n", index).getBytes(StandardCharsets.ISO_8859_1));
                cs.endText();
            }
```

### Deprecation
'getHeight(int)' is deprecated
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/PDType0Font.java`
#### Snippet
```java
    public float getHeight(int code) throws IOException
    {
        return descendantFont.getHeight(code);
    }

```

### Deprecation
'setValue(byte\[\])' is deprecated
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/SecurityHandler.java`
#### Snippet
```java
        {
            encryptData(objNum, genNum, data, outputStream, true /* decrypt */);
            string.setValue(outputStream.toByteArray());
        }
        catch (IOException ex)
```

### Deprecation
'setValue(byte\[\])' is deprecated
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/SecurityHandler.java`
#### Snippet
```java
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        encryptData(objNum, genNum, data, buffer, false /* encrypt */);
        string.setValue(buffer.toByteArray());
    }

```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/AnnotationValidationProcess.java`
#### Snippet
```java
        if (vPath.isEmpty()) 
        {
            return;
        }
        else if (!vPath.isExpectedType(COSDictionary.class))
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/TilingPatternValidationProcess.java`
#### Snippet
```java
        if (vPath.isEmpty()) 
        {
            return;
        }
        else if (!vPath.isExpectedType(PDTilingPattern.class))
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/ActionsValidationProcess.java`
#### Snippet
```java
        if (vPath.isEmpty()) 
        {
            return;
        }
        else if (!vPath.isExpectedType(COSDictionary.class))
```

## RuleId[id=SuspiciousListRemoveInLoop]
### SuspiciousListRemoveInLoop
Suspicious 'List.remove()' in loop
in `pdfbox/src/main/java/org/apache/pdfbox/text/PDFTextStripper.java`
#### Snippet
```java
                        //TODO Looks like decrement (--i) needed because next value will be ignored.
                        // This segment is never reached in tests?!
                        charactersByArticle.remove(i);
                    }
                    else
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `pdfbox/src/main/java/org/apache/pdfbox/cos/COSObjectKey.java`
#### Snippet
```java
     * @return the internal hash for the given values
     */
    public static final long computeInternalHash(long num, int gen)
    {
        return num << NUMBER_OFFSET | (gen & GENERATION_MASK);
```

### FinalStaticMethod
'static' method declared `final`
in `pdfbox/src/main/java/org/apache/pdfbox/filter/Filter.java`
#### Snippet
```java
     * @throws MissingImageReaderException if no image reader is found.
     */
    public static final ImageReader findImageReader(String formatName, String errorCause)
            throws MissingImageReaderException
    {
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/RecentFiles.java`
#### Snippet
```java
        while (remainingLength > 0)
        {
            endIndex += remainingLength >= allowedStringLength ? allowedStringLength : remainingLength;
            pieces.add(fullPath.substring(beginIndex, endIndex));
            beginIndex = endIndex;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `debugger/src/main/java/org/apache/pdfbox/debugger/hexviewer/HexModel.java`
#### Snippet
```java
    {
        int start = (lineNumber-1) * 16;
        int length = data.size() - start < 16 ? data.size() - start:16;
        char[] chars = new char[length];

```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/color/PDICCBased.java`
#### Snippet
```java
            float minValue = cs.getMinValue(i);
            float maxValue = cs.getMaxValue(i);
            result[i] = value[i] < minValue ? minValue : (value[i] > maxValue ? maxValue : value[i]);
        }
        return result;
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/image/PDImageXObject.java`
#### Snippet
```java
    private static int clampColor(int color)
    {
        return color < 0 ? 0 : color > 255 ? 255 : color;
    }

```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `pdfbox/src/main/java/org/apache/pdfbox/rendering/GroupGraphics.java`
#### Snippet
```java
        float c0 = (backdropRGB >> shift) & 0xFF;
        int c = Math.round(cn + (cn - c0) * alphaFactor);
        return (c < 0) ? 0 : (c > 255 ? 255 : c);
    }
}
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/PrintDpiMenu.java`
#### Snippet
```java
        for (int dpi : DPIS)
        {
            PrintDpiMenuItem printDpiMenuItem = new PrintDpiMenuItem(dpi == 0 ? "auto" : "" + dpi, dpi);
            bg.add(printDpiMenuItem);
            menu.add(printDpiMenuItem);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `debugger/src/main/java/org/apache/pdfbox/debugger/PDFDebugger.java`
#### Snippet
```java
        if(selectedNode instanceof COSBoolean)
        {
            return "" + ((COSBoolean) selectedNode).getValue();
        }
        if (selectedNode instanceof COSFloat)
```

### TrivialStringConcatenation
Empty string used in concatenation
in `debugger/src/main/java/org/apache/pdfbox/debugger/PDFDebugger.java`
#### Snippet
```java
        if (selectedNode instanceof COSFloat)
        {
            return "" + ((COSFloat) selectedNode).floatValue();
        }
        if (selectedNode instanceof COSNull)
```

### TrivialStringConcatenation
Empty string used in concatenation
in `debugger/src/main/java/org/apache/pdfbox/debugger/PDFDebugger.java`
#### Snippet
```java
        if (selectedNode instanceof COSInteger)
        {
            return "" + ((COSInteger) selectedNode).intValue();
        }
        if (selectedNode instanceof COSName)
```

### TrivialStringConcatenation
Empty string used in concatenation
in `debugger/src/main/java/org/apache/pdfbox/debugger/PDFDebugger.java`
#### Snippet
```java
        if (selectedNode instanceof COSName)
        {
            return "" + ((COSName) selectedNode).getName();
        }
        if (selectedNode instanceof COSString)
```

### TrivialStringConcatenation
Empty string used in concatenation
in `debugger/src/main/java/org/apache/pdfbox/debugger/stringpane/StringPane.java`
#### Snippet
```java
            }
        }
        return  "" + text;
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationFreeText.java`
#### Snippet
```java
    public String getJustification()
    {
        return "" + annot.getInt(COSName.Q, 0);
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/PrintURLs.java`
#### Snippet
```java

                            Rectangle2D.Float awtRect = new Rectangle2D.Float( x,y,width,height );
                            stripper.addRegion( "" + j, awtRect );
                        }
                    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/PrintURLs.java`
#### Snippet
```java
                        if (uri != null)
                        {
                            String urlText = stripper.getTextForRegion("" + j);
                            System.out.println("Page " + pageNum + ":'" + urlText.trim() + "'=" + uri.getURI());
                        }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature2.java`
#### Snippet
```java
    {
        System.err.println("Usage: java " + CreateVisibleSignature2.class.getName()
                + " <pkcs12-keystore-file> <pin> <input-pdf> <sign-image>\n" + "" +
                           "options:\n" +
                           "  -tsa <url>    sign timestamp using the given TSA server\n"+
```

### TrivialStringConcatenation
Empty string used in concatenation
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateSignature.java`
#### Snippet
```java
    {
        System.err.println("usage: java " + CreateSignature.class.getName() + " " +
                           "<pkcs12_keystore> <password> <pdf_to_sign>\n" + "" +
                           "options:\n" +
                           "  -tsa <url>    sign timestamp using the given TSA server\n" +
```

### TrivialStringConcatenation
Empty string used in concatenation
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
    {
        System.err.println("Usage: java " + CreateVisibleSignature.class.getName()
                + " <pkcs12-keystore-file> <pin> <input-pdf> <sign-image>\n" + "" +
                           "options:\n" +
                           "  -tsa <url>    sign timestamp using the given TSA server\n"+
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `pdfbox/src/main/java/org/apache/pdfbox/cos/COSInputStream.java`
#### Snippet
```java
        if (filters.isEmpty())
        {
            return new COSInputStream(in, Collections.<DecodeResult>emptyList());
        }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `pdfbox/src/main/java/org/apache/pdfbox/multipdf/PDFMergerUtility.java`
#### Snippet
```java
        PDDocumentInformation destInfo = destination.getDocumentInformation();
        PDDocumentInformation srcInfo = source.getDocumentInformation();
        mergeInto(srcInfo.getCOSObject(), destInfo.getCOSObject(), Collections.<COSName>emptySet());

        // use the highest version number for the resulting pdf
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `pdfbox/src/main/java/org/apache/pdfbox/multipdf/PDFMergerUtility.java`
#### Snippet
```java
        }
        mergeInto(srcViewerPreferences.getCOSObject(), destViewerPreferences.getCOSObject(),
                  Collections.<COSName>emptySet());

        // check the booleans - set to true if one is set and true
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `fontbox/src/main/java/org/apache/fontbox/cff/Type2CharString.java`
#### Snippet
```java
        if (command != null && command.getType1KeyWord() != Type1KeyWord.CLOSEPATH)
        {
            addCommand(Collections.<Number> emptyList(), CharStringCommand.COMMAND_CLOSEPATH);
        }
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `fontbox/src/main/java/org/apache/fontbox/ttf/TrueTypeFont.java`
#### Snippet
```java
    {
        float scale = 1000f / getUnitsPerEm();
        return Arrays.<Number>asList(0.001f * scale, 0, 0, 0.001f * scale, 0, 0);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFParser.java`
#### Snippet
```java
        font.addValueToTopDict("PaintType", topDict.getNumber("PaintType", 0));
        font.addValueToTopDict("CharstringType", topDict.getNumber("CharstringType", 2));
        font.addValueToTopDict("FontMatrix", topDict.getArray("FontMatrix", Arrays.<Number>asList(
                                                      0.001, (double) 0, (double) 0, 0.001,
                                                      (double) 0, (double) 0)));
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFParser.java`
#### Snippet
```java
        font.addValueToTopDict("UniqueID", topDict.getNumber("UniqueID", null));
        font.addValueToTopDict("FontBBox", topDict.getArray("FontBBox",
                                                    Arrays.<Number> asList(0, 0, 0, 0)));
        font.addValueToTopDict("StrokeWidth", topDict.getNumber("StrokeWidth", 0));
        font.addValueToTopDict("XUID", topDict.getArray("XUID", null));
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFParser.java`
#### Snippet
```java
                    // default
                    font.addValueToTopDict("FontMatrix", topDict.getArray("FontMatrix",
                            Arrays.<Number> asList(0.001, 0.0, 0.0, 0.001, 0.0, 0.0)));
                }
            }
```

## RuleId[id=SuspiciousInvocationHandlerImplementation]
### SuspiciousInvocationHandlerImplementation
Null might be returned when proxying method 'equals()': this may cause NullPointerException
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/OSXAdapter.java`
#### Snippet
```java
                            quitHandler.invoke(target);
                        }
                        return null;
                    }
                });
```

### SuspiciousInvocationHandlerImplementation
Null might be returned when proxying method 'equals()': this may cause NullPointerException
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/OSXAdapter.java`
#### Snippet
```java
        }
        // All of the ApplicationListener methods are void; return null regardless of what happens
        return null;
    }

```

## RuleId[id=ExplicitArrayFilling]
### ExplicitArrayFilling
Can be replaced with single 'Arrays.fill()' method call
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/color/PDDeviceN.java`
#### Snippet
```java
        int n = getNumberOfComponents();
        float[] initial = new float[n];
        for (int i = 0; i < n; i++)
        {
            initial[i] = 1;
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `pdfbox/src/main/java/org/apache/pdfbox/util/filetypedetector/FileTypeDetector.java`
#### Snippet
```java
 * @author Drew Noakes
 *
 * code taken from https://github.com/drewnoakes/metadata-extractor
 *
 * 2016-01-04
```

### JavadocLinkAsPlainText
Link specified as plain text
in `pdfbox/src/main/java/org/apache/pdfbox/util/Hex.java`
#### Snippet
```java
     * for hex conversion.
     * 
     * https://stackoverflow.com/questions/2817752/java-code-to-convert-byte-to-hexadecimal
     *
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `pdfbox/src/main/java/org/apache/pdfbox/util/filetypedetector/FileType.java`
#### Snippet
```java
 * @author Drew Noakes
 *
 * code taken from https://github.com/drewnoakes/metadata-extractor
 *
 * 2016-01-04
```

### JavadocLinkAsPlainText
Link specified as plain text
in `pdfbox/src/main/java/org/apache/pdfbox/util/filetypedetector/ByteTrie.java`
#### Snippet
```java
 * @author Drew Noakes
 *
 * code taken from https://github.com/drewnoakes/metadata-extractor
 *
 * 2016-01-04
```

### JavadocLinkAsPlainText
Link specified as plain text
in `pdfbox/src/main/java/org/apache/pdfbox/text/PDFTextStripper.java`
#### Snippet
```java
     * characters!
     * 
     * Based on http://www.nesterovsky-bros.com/weblog/2013/07/28/VisualToLogicalConversionInJava.aspx
     * 
     * @param word The word that shall be processed
```

### JavadocLinkAsPlainText
Link specified as plain text
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/image/PNGConverter.java`
#### Snippet
```java
    /**
     * Map the renderIntent int to a PDF render intent. See also
     * https://www.w3.org/TR/2003/REC-PNG-20031110/#11sRGB
     *
     * @param renderIntent the PNG render intent
```

### JavadocLinkAsPlainText
Link specified as plain text
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/image/PNGConverter.java`
#### Snippet
```java
 * <p>
 * The W3C PNG spec was used to implement this class:
 * https://www.w3.org/TR/2003/REC-PNG-20031110
 *
 * @author Emmeran Seehuber
```

### JavadocLinkAsPlainText
Link specified as plain text
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/SaslPrep.java`
#### Snippet
```java

/**
 * Copied from https://github.com/tombentley/saslprep/blob/master/src/main/java/SaslPrep.java on
 * 30.5.2019, commit 2e30daa.
 *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `pdfbox/src/main/java/org/apache/pdfbox/contentstream/operator/state/EmptyGraphicsStackException.java`
#### Snippet
```java
{
    /**
     * See https://stackoverflow.com/questions/285793/
     */
    private static final long serialVersionUID = 1L;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `fontbox/src/main/java/org/apache/fontbox/ttf/GlyphDescription.java`
#### Snippet
```java
 * 
 * This class is based on code from Apache Batik a subproject of Apache XMLGraphics.
 * see http://xmlgraphics.apache.org/batik/ for further details.
 * 
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `fontbox/src/main/java/org/apache/fontbox/ttf/GlyfCompositeComp.java`
#### Snippet
```java
/**
 * This class is based on code from Apache Batik a subproject of Apache XMLGraphics. see
 * http://xmlgraphics.apache.org/batik/ for further details.
 */
public class GlyfCompositeComp
```

### JavadocLinkAsPlainText
Link specified as plain text
in `fontbox/src/main/java/org/apache/fontbox/ttf/GlyfCompositeDescript.java`
#### Snippet
```java
 *
 * This class is based on code from Apache Batik a subproject of Apache
 * XMLGraphics. see http://xmlgraphics.apache.org/batik/ for further details.
 */
public class GlyfCompositeDescript extends GlyfDescript
```

### JavadocLinkAsPlainText
Link specified as plain text
in `fontbox/src/main/java/org/apache/fontbox/ttf/GlyfDescript.java`
#### Snippet
```java
/**
 * This class is based on code from Apache Batik a subproject of Apache XMLGraphics.
 * see http://xmlgraphics.apache.org/batik/ for further details.
 * 
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `fontbox/src/main/java/org/apache/fontbox/ttf/GlyfSimpleDescript.java`
#### Snippet
```java
/**
 * This class is based on code from Apache Batik a subproject of Apache XMLGraphics. see
 * http://xmlgraphics.apache.org/batik/ for further details.
 */
public class GlyfSimpleDescript extends GlyfDescript
```

### JavadocLinkAsPlainText
Link specified as plain text
in `io/src/main/java/org/apache/pdfbox/io/IOUtils.java`
#### Snippet
```java
    /**
     * Unmap memory mapped byte buffers. This is a hack waiting for a proper JVM provided solution expected in java 10
     * https://bugs.openjdk.java.net/browse/JDK-4724038 The issue here is that even when closed, memory mapped byte
     * buffers hold a lock on the underlying file until GC is executes and this in turns result in an error if the user
     * tries to move or delete the file.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPSchema.java`
#### Snippet
```java
     *
     * @param metadata The parent XMP metadata that this schema will be part of.
     * @param namespaceURI The URI of the namespace, e.g. "http://ns.adobe.com/pdf/1.3/"
     * @param prefix The field prefix of the namespace.
     * @param name The property name.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPSchema.java`
#### Snippet
```java
     *
     * @param metadata The parent XMP metadata that this schema will be part of.
     * @param namespaceURI The URI of the namespace, e.g. "http://ns.adobe.com/pdf/1.3/"
     * @param prefix The field prefix of the namespace.
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/ReplaceURLs.java`
#### Snippet
```java
    /**
     * This will read in a document and replace all of the urls with
     * http://pdfbox.apache.org.
     * <br>
     * see usage() for commandline
```

### JavadocLinkAsPlainText
Link specified as plain text
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/EmbeddedMultipleFonts.java`
#### Snippet
```java
 * appear in the wrong direction. Complex scripts (Thai, Arabic, some Indian languages) are also not
 * supported, any output will look weird. There is an (unfinished) effort here:
 * https://issues.apache.org/jira/browse/PDFBOX-4189
 *
 * @author Tilman Hausherr
```

### JavadocLinkAsPlainText
Link specified as plain text
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/CertificateVerificationResult.java`
#### Snippet
```java
/**
 * Copied from Apache CXF 2.4.9, initial version:
 * https://svn.apache.org/repos/asf/cxf/tags/cxf-2.4.9/distribution/src/main/release/samples/sts_issue_operation/src/main/java/demo/sts/provider/cert/
 * 
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/CertificateVerificationException.java`
#### Snippet
```java
/**
 * Copied from Apache CXF 2.4.9, initial version:
 * https://svn.apache.org/repos/asf/cxf/tags/cxf-2.4.9/distribution/src/main/release/samples/sts_issue_operation/src/main/java/demo/sts/provider/cert/
 * 
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/CertificateVerifier.java`
#### Snippet
```java
/**
 * Copied from Apache CXF 2.4.9, initial version:
 * https://svn.apache.org/repos/asf/cxf/tags/cxf-2.4.9/distribution/src/main/release/samples/sts_issue_operation/src/main/java/demo/sts/provider/cert/
 * 
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/CRLVerifier.java`
#### Snippet
```java
    /**
     * Downloads a CRL from given HTTP/HTTPS/FTP URL, e.g.
     * http://crl.infonotary.com/crl/identity-ca.crl
     */
    public static X509CRL downloadCRLFromWeb(String crlURL)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/CRLVerifier.java`
#### Snippet
```java
/**
 * Copied from Apache CXF 2.4.9, initial version:
 * https://svn.apache.org/repos/asf/cxf/tags/cxf-2.4.9/distribution/src/main/release/samples/sts_issue_operation/src/main/java/demo/sts/provider/cert/
 * 
 */
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/TextDialog.java`
#### Snippet
```java
    private static TextDialog instance;
    private final JTextPane textPane;
    private final JScrollPane scrollPane;

    private TextDialog(Frame owner)
```

### FieldCanBeLocal
Field can be converted to a local variable
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/ViewMenu.java`
#### Snippet
```java
    private JCheckBoxMenuItem showGlyphBounds;
    private JCheckBoxMenuItem allowSubsampling;
    private JMenuItem extractTextMenuItem;
    private JCheckBoxMenuItem repairAcroFormMenuItem;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/LogDialog.java`
#### Snippet
```java
    private final JLabel logLabel;
    private final JTextPane textPane;
    private final JScrollPane scrollPane;
    private int fatalCount = 0;
    private int errorCount = 0;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `debugger/src/main/java/org/apache/pdfbox/debugger/PDFDebugger.java`
#### Snippet
```java

    @Option(names = "-viewstructure", description = "activate structure mode on startup")
    private boolean viewstructure = false;

    @Parameters(paramLabel = "inputfile", arity="0..1", description = "the PDF file to be loaded")
```

### FieldCanBeLocal
Field can be converted to a local variable
in `pdfbox/src/main/java/org/apache/pdfbox/filter/CCITTFaxDecoderStream.java`
#### Snippet
```java
    private final boolean optionG32D;
    // Leading zeros for aligning EOL
    private final boolean optionG3Fill;
    private final boolean optionUncompressed;
    private final boolean optionByteAligned;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `pdfbox/src/main/java/org/apache/pdfbox/filter/CCITTFaxDecoderStream.java`
#### Snippet
```java
    // Leading zeros for aligning EOL
    private final boolean optionG3Fill;
    private final boolean optionUncompressed;
    private final boolean optionByteAligned;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/image/LosslessFactory.java`
#### Snippet
```java
        private final BufferedImage image;
        private final int componentsPerPixel;
        private final int transferType;
        private final int bytesPerComponent;
        private final int bytesPerPixel;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/shading/Type4ShadingContext.java`
#### Snippet
```java
{
    private static final Log LOG = LogFactory.getLog(Type4ShadingContext.class);
    private final int bitsPerFlag;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `pdfbox/src/main/java/org/apache/pdfbox/rendering/PageDrawer.java`
#### Snippet
```java
        private final int minX;
        private final int minY;
        private final int maxX;
        private final int maxY;
        private final int width;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `fontbox/src/main/java/org/apache/fontbox/ttf/GlyfCompositeComp.java`
#### Snippet
```java
    private int xtranslate = 0;
    private int ytranslate = 0;
    private int point1 = 0;
    private int point2 = 0;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `fontbox/src/main/java/org/apache/fontbox/ttf/GlyfCompositeComp.java`
#### Snippet
```java
    private int ytranslate = 0;
    private int point1 = 0;
    private int point2 = 0;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `fontbox/src/main/java/org/apache/fontbox/ttf/KerningSubtable.java`
#### Snippet
```java
    private static class PairData0Format0 implements Comparator<int[]>, PairData
    {
        private int searchRange;
        private int[][] pairs;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature2.java`
#### Snippet
```java
public class CreateVisibleSignature2 extends CreateSignatureBase
{
    private SignatureOptions signatureOptions;
    private boolean lateExternalSigning = false;
    private File imageFile = null;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `preflight/src/main/java/org/apache/pdfbox/preflight/font/util/PreflightType3Stream.java`
#### Snippet
```java

    private PDInlineImage image = null;
    private BoundingBox box = null;

    public PreflightType3Stream(PreflightContext context, PDPage page, PDType3CharProc charProc)
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `pdfbox/src/main/java/org/apache/pdfbox/filter/FlateFilter.java`
#### Snippet
```java
        byte[] buf = new byte[2048];
        // skip zlib header
        in.read();
        in.read();
        int read = in.read(buf); 
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `pdfbox/src/main/java/org/apache/pdfbox/filter/FlateFilter.java`
#### Snippet
```java
        // skip zlib header
        in.read();
        in.read();
        int read = in.read(buf); 
        if (read > 0) 
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `fontbox/src/main/java/org/apache/fontbox/cmap/CMap.java`
#### Snippet
```java
    {
        byte[] bytes = new byte[maxCodeLength];
        in.read(bytes,0,minCodeLength);
        in.mark(maxCodeLength);
        for (int i = minCodeLength-1; i < maxCodeLength; i++)
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/ExtractEmbeddedFiles.java`
#### Snippet
```java
            // sometimes paths contain a directory
            System.out.println("Creating " + parentDir);
            parentDir.mkdirs();
        }
        System.out.println("Writing " + embeddedFilename);
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/VersionType.java`
#### Snippet
```java
    public static final String EVENT = "event";

    @PropertyType(type = Types.ProperName, card = Cardinality.Simple)
    public static final String MODIFIER = "modifier";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/VersionType.java`
#### Snippet
```java
{

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String COMMENTS = "comments";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/VersionType.java`
#### Snippet
```java
    public static final String MODIFIER = "modifier";

    @PropertyType(type = Types.Date, card = Cardinality.Simple)
    public static final String MODIFY_DATE = "modifyDate";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/VersionType.java`
#### Snippet
```java
    public static final String MODIFY_DATE = "modifyDate";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String VERSION = "version";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/VersionType.java`
#### Snippet
```java
    public static final String COMMENTS = "comments";

    @PropertyType(type = Types.ResourceEvent, card = Cardinality.Simple)
    public static final String EVENT = "event";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/PDFASchemaType.java`
#### Snippet
```java
{

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String SCHEMA = "schema";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/PDFASchemaType.java`
#### Snippet
```java
    public static final String NAMESPACE_URI = "namespaceURI";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String PREFIX = "prefix";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/PDFASchemaType.java`
#### Snippet
```java
    public static final String SCHEMA = "schema";

    @PropertyType(type = Types.URI, card = Cardinality.Simple)
    public static final String NAMESPACE_URI = "namespaceURI";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ThumbnailType.java`
#### Snippet
```java
    public static final String HEIGHT = "height";

    @PropertyType(type = Types.Integer, card = Cardinality.Simple)
    public static final String WIDTH = "width";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ThumbnailType.java`
#### Snippet
```java
    public static final String FORMAT = "format";

    @PropertyType(type = Types.Integer, card = Cardinality.Simple)
    public static final String HEIGHT = "height";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ThumbnailType.java`
#### Snippet
```java
{

    @PropertyType(type = Types.Choice, card = Cardinality.Simple)
    public static final String FORMAT = "format";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ThumbnailType.java`
#### Snippet
```java
    public static final String WIDTH = "width";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String IMAGE = "image";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/PDFATypeType.java`
#### Snippet
```java
    public static final String TYPE = "type";

    @PropertyType(type = Types.URI, card = Cardinality.Simple)
    public static final String NS_URI = "namespaceURI";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/PDFATypeType.java`
#### Snippet
```java
    public static final String NS_URI = "namespaceURI";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String PREFIX = "prefix";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/PDFATypeType.java`
#### Snippet
```java
    public static final String PREFIX = "prefix";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String DESCRIPTION = "description";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/PDFATypeType.java`
#### Snippet
```java
{

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String TYPE = "type";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/PDFAFieldType.java`
#### Snippet
```java
    public static final String VALUETYPE = "valueType";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String DESCRIPTION = "description";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/PDFAFieldType.java`
#### Snippet
```java
    public static final String NAME = "name";

    @PropertyType(type = Types.Choice, card = Cardinality.Simple)
    public static final String VALUETYPE = "valueType";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/PDFAFieldType.java`
#### Snippet
```java
{

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String NAME = "name";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ResourceEventType.java`
#### Snippet
```java
{

    @PropertyType(type = Types.Choice, card = Cardinality.Simple)
    public static final String ACTION = "action";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ResourceEventType.java`
#### Snippet
```java
    public static final String INSTANCE_ID = "instanceID";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String PARAMETERS = "parameters";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ResourceEventType.java`
#### Snippet
```java
    public static final String SOFTWARE_AGENT = "softwareAgent";

    @PropertyType(type = Types.Date, card = Cardinality.Simple)
    public static final String WHEN = "when";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ResourceEventType.java`
#### Snippet
```java
    public static final String PARAMETERS = "parameters";

    @PropertyType(type = Types.AgentName, card = Cardinality.Simple)
    public static final String SOFTWARE_AGENT = "softwareAgent";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ResourceEventType.java`
#### Snippet
```java
    public static final String ACTION = "action";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String CHANGED = "changed";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ResourceEventType.java`
#### Snippet
```java
    public static final String CHANGED = "changed";

    @PropertyType(type = Types.GUID, card = Cardinality.Simple)
    public static final String INSTANCE_ID = "instanceID";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/LayerType.java`
#### Snippet
```java
    public static final String LAYER_NAME = "LayerName";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String LAYER_TEXT = "LayerText";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/LayerType.java`
#### Snippet
```java
{

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String LAYER_NAME = "LayerName";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/PDFAPropertyType.java`
#### Snippet
```java
    public static final String VALUETYPE = "valueType";

    @PropertyType(type = Types.Choice, card = Cardinality.Simple)
    public static final String CATEGORY = "category";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/PDFAPropertyType.java`
#### Snippet
```java
{

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String NAME = "name";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/PDFAPropertyType.java`
#### Snippet
```java
    public static final String NAME = "name";

    @PropertyType(type = Types.Choice, card = Cardinality.Simple)
    public static final String VALUETYPE = "valueType";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/PDFAPropertyType.java`
#### Snippet
```java
    public static final String CATEGORY = "category";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String DESCRIPTION = "description";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/JobType.java`
#### Snippet
```java
    public static final String NAME = "name";

    @PropertyType(type = Types.URL, card = Cardinality.Simple)
    public static final String URL = "url";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/JobType.java`
#### Snippet
```java
    public static final String ID = "id";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String NAME = "name";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/JobType.java`
#### Snippet
```java
{

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String ID = "id";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPRightsManagementSchema.java`
#### Snippet
```java
{

    @PropertyType(type = Types.URL, card = Cardinality.Simple)
    public static final String CERTIFICATE = "Certificate";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPRightsManagementSchema.java`
#### Snippet
```java
    public static final String USAGETERMS = "UsageTerms";

    @PropertyType(type = Types.URL, card = Cardinality.Simple)
    public static final String WEBSTATEMENT = "WebStatement";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPRightsManagementSchema.java`
#### Snippet
```java
    public static final String OWNER = "Owner";

    @PropertyType(type = Types.LangAlt, card = Cardinality.Simple)
    public static final String USAGETERMS = "UsageTerms";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPRightsManagementSchema.java`
#### Snippet
```java
    public static final String CERTIFICATE = "Certificate";

    @PropertyType(type = Types.Boolean, card = Cardinality.Simple)
    public static final String MARKED = "Marked";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String DIGITAL_ZOOM_RATIO = "DigitalZoomRatio";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String FOCAL_LENGTH_IN_3_5MM_FILM = "FocalLengthIn35mmFilm";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GPS_DIFFERENTIAL = "GPSDifferential";

    @PropertyType(type=Types.Date, card= Cardinality.Simple)
    public static final String GPS_TIME_STAMP = "GPSTimeStamp";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GPS_PROCESSING_METHOD = "GPSProcessingMethod";

    @PropertyType(type=Types.Text, card= Cardinality.Simple)
    public static final String GPS_AREA_INFORMATION = "GPSAreaInformation";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String SATURATION = "Saturation";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String SHARPNESS = "Sharpness";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String PIXEL_Y_DIMENSION = "PixelYDimension";

    @PropertyType(type=Types.Text, card= Cardinality.Simple)
    public static final String RELATED_SOUND_FILE = "RelatedSoundFile";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String SUBJECT_DISTANCE = "SubjectDistance";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String METERING_MODE = "MeteringMode";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String FILE_SOURCE = "FileSource";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String SCENE_TYPE = "SceneType";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String FOCAL_PLANE_XRESOLUTION = "FocalPlaneXResolution";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String FOCAL_PLANE_YRESOLUTION = "FocalPlaneYResolution";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String METERING_MODE = "MeteringMode";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String LIGHT_SOURCE = "LightSource";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String FOCAL_LENGTH_IN_3_5MM_FILM = "FocalLengthIn35mmFilm";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String SCENE_CAPTURE_TYPE = "SceneCaptureType";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String DATE_TIME_ORIGINAL = "DateTimeOriginal";

    @PropertyType(type=Types.Date, card= Cardinality.Simple)
    public static final String DATE_TIME_DIGITIZED = "DateTimeDigitized";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String SUBJECT_AREA = "SubjectArea";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String FOCAL_PLANE_RESOLUTION_UNIT = "FocalPlaneResolutionUnit";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String COMPRESSED_BPP = "CompressedBitsPerPixel";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String PIXEL_X_DIMENSION = "PixelXDimension";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GPS_ALTITUDE = "GPSAltitude";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String GPS_DOP = "GPSDOP";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GPS_MEASURE_MODE = "GPSMeasureMode";

    @PropertyType(type=Types.Text, card= Cardinality.Simple)
    public static final String GPS_MAP_DATUM = "GPSMapDatum";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String EXIF_VERSION = "ExifVersion";

    @PropertyType(type=Types.Text, card= Cardinality.Simple)
    public static final String FLASH_PIX_VERSION = "FlashpixVersion";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef";

    @PropertyType(type=Types.Text, card= Cardinality.Simple)
    public static final String GPS_PROCESSING_METHOD = "GPSProcessingMethod";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GPS_AREA_INFORMATION = "GPSAreaInformation";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String GPS_ALTITUDE = "GPSAltitude";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String BRIGHTNESS_VALUE = "BrightnessValue";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String EXPOSURE_BIAS_VALUE = "ExposureBiasValue";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String EXPOSURE_PROGRAM = "ExposureProgram";

    @PropertyType(type=Types.Text, card= Cardinality.Simple)
    public static final String SPECTRAL_SENSITIVITY = "SpectralSensitivity";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String SHUTTER_SPEED_VALUE = "ShutterSpeedValue";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String APERTURE_VALUE = "ApertureValue";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String EXPOSURE_INDEX = "ExposureIndex";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String SENSING_METHOD = "SensingMethod";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String CONTRAST = "Contrast";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String SATURATION = "Saturation";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GPS_DOP = "GPSDOP";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String GPS_SPEED = "GPSSpeed";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GPS_IMG_DIRECTION = "GPSImgDirection";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String GPS_DEST_BEARING = "GPSDestBearing";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String MAX_APERTURE_VALUE = "MaxApertureValue";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String SUBJECT_DISTANCE = "SubjectDistance";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String RELATED_SOUND_FILE = "RelatedSoundFile";

    @PropertyType(type=Types.Date, card= Cardinality.Simple)
    public static final String DATE_TIME_ORIGINAL = "DateTimeOriginal";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GPS_MAP_DATUM = "GPSMapDatum";

    @PropertyType(type=Types.Text, card= Cardinality.Simple)
    public static final String GPS_SPEED_REF = "GPSSpeedRef";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String LIGHT_SOURCE = "LightSource";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String FLASH_ENERGY = "FlashEnergy";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GPS_DEST_DISTANCE = "GPSDestDistance";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String GPS_ALTITUDE_REF = "GPSAltitudeRef";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String COMPONENTS_CONFIGURATION = "ComponentsConfiguration";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String COMPRESSED_BPP = "CompressedBitsPerPixel";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String PIXEL_X_DIMENSION = "PixelXDimension";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String PIXEL_Y_DIMENSION = "PixelYDimension";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GPS_DEST_BEARING = "GPSDestBearing";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String GPS_DEST_DISTANCE = "GPSDestDistance";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String SUBJECT_LOCATION = "SubjectLocation";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String EXPOSURE_INDEX = "ExposureIndex";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String SCENE_TYPE = "SceneType";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String CUSTOM_RENDERED = "CustomRendered";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String ISO_SPEED_RATINGS = "ISOSpeedRatings";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String SHUTTER_SPEED_VALUE = "ShutterSpeedValue";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String EXPOSURE_TIME = "ExposureTime";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String F_NUMBER = "FNumber";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String FOCAL_LENGTH = "FocalLength";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String FOCAL_PLANE_XRESOLUTION = "FocalPlaneXResolution";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String F_NUMBER = "FNumber";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String EXPOSURE_PROGRAM = "ExposureProgram";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String CUSTOM_RENDERED = "CustomRendered";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String WHITE_BALANCE = "WhiteBalance";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String EXPOSURE_BIAS_VALUE = "ExposureBiasValue";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String MAX_APERTURE_VALUE = "MaxApertureValue";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String USER_COMMENT = "UserComment";

    @PropertyType(type=Types.Text, card= Cardinality.Simple)
    public static final String EXIF_VERSION = "ExifVersion";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GPS_SPEED_REF = "GPSSpeedRef";

    @PropertyType(type=Types.Text, card= Cardinality.Simple)
    public static final String GPS_TRACK_REF = "GPSTrackRef";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
{

    @PropertyType(type = Types.LangAlt, card = Cardinality.Simple)
    public static final String USER_COMMENT = "UserComment";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GPS_STATUS = "GPSStatus";

    @PropertyType(type=Types.Text, card= Cardinality.Simple)
    public static final String GPS_MEASURE_MODE = "GPSMeasureMode";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String FLASH_ENERGY = "FlashEnergy";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String FOCAL_LENGTH = "FocalLength";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GPS_SPEED = "GPSSpeed";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String GPS_TRACK = "GPSTrack";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GPS_SATELLITES = "GPSSatellites";

    @PropertyType(type=Types.Text, card= Cardinality.Simple)
    public static final String GPS_STATUS = "GPSStatus";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GPS_TRACK_REF = "GPSTrackRef";

    @PropertyType(type=Types.Text, card= Cardinality.Simple)
    public static final String GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GPS_TRACK = "GPSTrack";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String GPS_IMG_DIRECTION = "GPSImgDirection";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";

    @PropertyType(type=Types.Text, card= Cardinality.Simple)
    public static final String GPS_DEST_BEARING_REF = "GPSDestBearingRef";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String FLASH_PIX_VERSION = "FlashpixVersion";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String COLOR_SPACE = "ColorSpace";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String APERTURE_VALUE = "ApertureValue";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String BRIGHTNESS_VALUE = "BrightnessValue";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GPS_DEST_BEARING_REF = "GPSDestBearingRef";

    @PropertyType(type=Types.Text, card= Cardinality.Simple)
    public static final String GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GPSVERSION_ID = "GPSVersionID";

    @PropertyType(type=Types.Text, card= Cardinality.Simple)
    public static final String GPS_SATELLITES = "GPSSatellites";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String SCENE_CAPTURE_TYPE = "SceneCaptureType";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String GAIN_CONTROL = "GainControl";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GPS_ALTITUDE_REF = "GPSAltitudeRef";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String GPS_DIFFERENTIAL = "GPSDifferential";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange";

    @PropertyType(type=Types.Text, card= Cardinality.Simple)
    public static final String IMAGE_UNIQUE_ID = "ImageUniqueID";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String EXPOSURE_MODE = "ExposureMode";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String DIGITAL_ZOOM_RATIO = "DigitalZoomRatio";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String SHARPNESS = "Sharpness";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String SENSING_METHOD = "SensingMethod";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String FILE_SOURCE = "FileSource";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String IMAGE_UNIQUE_ID = "ImageUniqueID";

    @PropertyType(type=Types.Text, card= Cardinality.Simple)
    public static final String GPSVERSION_ID = "GPSVersionID";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String GAIN_CONTROL = "GainControl";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String CONTRAST = "Contrast";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String DATE_TIME_DIGITIZED = "DateTimeDigitized";

    @PropertyType(type=Types.Rational, card= Cardinality.Simple)
    public static final String EXPOSURE_TIME = "ExposureTime";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/ExifSchema.java`
#### Snippet
```java
    public static final String WHITE_BALANCE = "WhiteBalance";

    @PropertyType(type=Types.Integer, card= Cardinality.Simple)
    public static final String EXPOSURE_MODE = "ExposureMode";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/PDFAIdentificationSchema.java`
#### Snippet
```java
    public static final String PART = "part";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String AMD = "amd";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/PDFAIdentificationSchema.java`
#### Snippet
```java
{

    @PropertyType(type = Types.Integer, card = Cardinality.Simple)
    public static final String PART = "part";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/PDFAIdentificationSchema.java`
#### Snippet
```java
    public static final String AMD = "amd";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String CONFORMANCE = "conformance";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/TiffSchema.java`
#### Snippet
```java
    public static final String DATE_TIME = "DateTime";

    @PropertyType(type = Types.AgentName, card = Cardinality.Simple)
    public static final String SOFTWARE = "Software";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/TiffSchema.java`
#### Snippet
```java
    public static final String XRESOLUTION = "XResolution";

    @PropertyType(type = Types.Rational, card = Cardinality.Simple)
    public static final String YRESOLUTION = "YResolution";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/TiffSchema.java`
#### Snippet
```java
    public static final String REFERENCE_BLACK_WHITE = "ReferenceBlackWhite";

    @PropertyType(type = Types.Date, card = Cardinality.Simple)
    public static final String DATE_TIME = "DateTime";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/TiffSchema.java`
#### Snippet
```java
    public static final String YCB_CR_POSITIONING = "YCbCrPositioning";

    @PropertyType(type = Types.Rational, card = Cardinality.Simple)
    public static final String XRESOLUTION = "XResolution";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/TiffSchema.java`
#### Snippet
```java
    public static final String COMPRESSION = "Compression";

    @PropertyType(type = Types.Integer, card = Cardinality.Simple)
    public static final String PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/TiffSchema.java`
#### Snippet
```java
    public static final String ARTIST = "Artist";

    @PropertyType(type = Types.Integer, card = Cardinality.Simple)
    public static final String IMAGE_WIDTH = "ImageWidth";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/TiffSchema.java`
#### Snippet
```java
    public static final String IMAGE_WIDTH = "ImageWidth";

    @PropertyType(type = Types.Integer, card = Cardinality.Simple)
    public static final String IMAGE_LENGTH = "ImageLength";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/TiffSchema.java`
#### Snippet
```java
    public static final String PLANAR_CONFIGURATION = "PlanarConfiguration";

    @PropertyType(type = Types.Integer, card = Cardinality.Simple)
    public static final String YCB_CR_SUB_SAMPLING = "YCbCrSubSampling";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/TiffSchema.java`
#### Snippet
```java
    public static final String PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation";

    @PropertyType(type = Types.Integer, card = Cardinality.Simple)
    public static final String ORIENTATION = "Orientation";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/TiffSchema.java`
#### Snippet
```java
    public static final String ORIENTATION = "Orientation";

    @PropertyType(type = Types.Integer, card = Cardinality.Simple)
    public static final String SAMPLES_PER_PIXEL = "SamplesPerPixel";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/TiffSchema.java`
#### Snippet
```java
    public static final String  BITS_PER_SAMPLE= "BitsPerSample";

    @PropertyType(type = Types.Integer, card = Cardinality.Simple)
    public static final String COMPRESSION = "Compression";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/TiffSchema.java`
#### Snippet
```java
    public static final String SOFTWARE = "Software";

    @PropertyType(type = Types.ProperName, card = Cardinality.Simple)
    public static final String MAKE = "Make";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/TiffSchema.java`
#### Snippet
```java
    public static final String YRESOLUTION = "YResolution";

    @PropertyType(type = Types.Integer, card = Cardinality.Simple)
    public static final String RESOLUTION_UNIT = "ResolutionUnit";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/TiffSchema.java`
#### Snippet
```java
{

    @PropertyType(type = Types.LangAlt, card = Cardinality.Simple)
    public static final String IMAGE_DESCRIPTION = "ImageDescription";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/TiffSchema.java`
#### Snippet
```java
    public static final String MAKE = "Make";

    @PropertyType(type = Types.ProperName, card = Cardinality.Simple)
    public static final String MODEL = "Model";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/TiffSchema.java`
#### Snippet
```java
    public static final String COPYRIGHT = "Copyright";

    @PropertyType(type = Types.ProperName, card = Cardinality.Simple)
    public static final String ARTIST = "Artist";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/TiffSchema.java`
#### Snippet
```java
    public static final String IMAGE_DESCRIPTION = "ImageDescription";

    @PropertyType(type = Types.LangAlt, card = Cardinality.Simple)
    public static final String COPYRIGHT = "Copyright";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/TiffSchema.java`
#### Snippet
```java
    public static final String SAMPLES_PER_PIXEL = "SamplesPerPixel";

    @PropertyType(type = Types.Integer, card = Cardinality.Simple)
    public static final String PLANAR_CONFIGURATION = "PlanarConfiguration";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ResourceRefType.java`
#### Snippet
```java
    public static final String RENDITION_PARAMS = "renditionParams";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String VERSION_ID = "versionID";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ResourceRefType.java`
#### Snippet
```java
    public static final String MANAGER_VARIANT = "managerVariant";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String PART_MAPPING = "partMapping";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ResourceRefType.java`
#### Snippet
```java
    public static final String DOCUMENT_ID = "documentID";

    @PropertyType(type = Types.URI, card = Cardinality.Simple)
    public static final String FILE_PATH = "filePath";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ResourceRefType.java`
#### Snippet
```java
    public static final String MANAGER = "manager";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String MANAGER_VARIANT = "managerVariant";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ResourceRefType.java`
#### Snippet
```java
    public static final String FILE_PATH = "filePath";

    @PropertyType(type = Types.URI, card = Cardinality.Simple)
    public static final String INSTANCE_ID = "instanceID";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ResourceRefType.java`
#### Snippet
```java
{

    @PropertyType(type = Types.URI, card = Cardinality.Simple)
    public static final String DOCUMENT_ID = "documentID";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ResourceRefType.java`
#### Snippet
```java
    public static final String MANAGE_TO = "manageTo";

    @PropertyType(type = Types.URI, card = Cardinality.Simple)
    public static final String MANAGE_UI = "manageUI";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ResourceRefType.java`
#### Snippet
```java
    public static final String LAST_MODIFY_DATE = "lastModifyDate";

    @PropertyType(type = Types.URI, card = Cardinality.Simple)
    public static final String MANAGE_TO = "manageTo";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ResourceRefType.java`
#### Snippet
```java
    public static final String MANAGE_UI = "manageUI";

    @PropertyType(type = Types.AgentName, card = Cardinality.Simple)
    public static final String MANAGER = "manager";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ResourceRefType.java`
#### Snippet
```java
    public static final String PART_MAPPING = "partMapping";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String RENDITION_PARAMS = "renditionParams";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ResourceRefType.java`
#### Snippet
```java
    public static final String MASK_MARKERS = "maskMarkers";

    @PropertyType(type = Types.RenditionClass, card = Cardinality.Simple)
    public static final String RENDITION_CLASS = "renditionClass";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ResourceRefType.java`
#### Snippet
```java
    public static final String RENDITION_CLASS = "renditionClass";

    @PropertyType(type = Types.Part, card = Cardinality.Simple)
    public static final String FROM_PART = "fromPart";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ResourceRefType.java`
#### Snippet
```java
    public static final String FROM_PART = "fromPart";

    @PropertyType(type = Types.Part, card = Cardinality.Simple)
    public static final String TO_PART = "toPart";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ResourceRefType.java`
#### Snippet
```java
    public static final String VERSION_ID = "versionID";

    @PropertyType(type = Types.Choice, card = Cardinality.Simple)
    public static final String MASK_MARKERS = "maskMarkers";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/type/ResourceRefType.java`
#### Snippet
```java
    public static final String INSTANCE_ID = "instanceID";

    @PropertyType(type = Types.Date, card = Cardinality.Simple)
    public static final String LAST_MODIFY_DATE = "lastModifyDate";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/DublinCoreSchema.java`
#### Snippet
```java
    public static final String RELATION = "relation";

    @PropertyType(type = Types.LangAlt, card = Cardinality.Simple)
    public static final String RIGHTS = "rights";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/DublinCoreSchema.java`
#### Snippet
```java
    public static final String FORMAT = "format";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String IDENTIFIER = "identifier";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/DublinCoreSchema.java`
#### Snippet
```java
    public static final String SUBJECT = "subject";

    @PropertyType(type = Types.LangAlt, card = Cardinality.Simple)
    public static final String TITLE = "title";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/DublinCoreSchema.java`
#### Snippet
```java
    public static final String CONTRIBUTOR = "contributor";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String COVERAGE = "coverage";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/DublinCoreSchema.java`
#### Snippet
```java
    public static final String DESCRIPTION = "description";

    @PropertyType(type = Types.MIMEType, card = Cardinality.Simple)
    public static final String FORMAT = "format";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/DublinCoreSchema.java`
#### Snippet
```java
    public static final String DATE = "date";

    @PropertyType(type = Types.LangAlt, card = Cardinality.Simple)
    public static final String DESCRIPTION = "description";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/DublinCoreSchema.java`
#### Snippet
```java
    public static final String RIGHTS = "rights";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String SOURCE = "source";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/AdobePDFSchema.java`
#### Snippet
```java
    public static final String KEYWORDS = "Keywords";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String PDF_VERSION = "PDFVersion";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/AdobePDFSchema.java`
#### Snippet
```java
    public static final String PDF_VERSION = "PDFVersion";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String PRODUCER = "Producer";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/AdobePDFSchema.java`
#### Snippet
```java
{

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String KEYWORDS = "Keywords";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPBasicSchema.java`
#### Snippet
```java
    public static final String BASEURL = "BaseURL";

    @PropertyType(type = Types.Date, card = Cardinality.Simple)
    public static final String CREATEDATE = "CreateDate";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPBasicSchema.java`
#### Snippet
```java
    public static final String ADVISORY = "Advisory";

    @PropertyType(type = Types.URL, card = Cardinality.Simple)
    public static final String BASEURL = "BaseURL";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPBasicSchema.java`
#### Snippet
```java
    public static final String IDENTIFIER = "Identifier";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String LABEL = "Label";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPBasicSchema.java`
#### Snippet
```java
    public static final String CREATEDATE = "CreateDate";

    @PropertyType(type = Types.AgentName, card = Cardinality.Simple)
    public static final String CREATORTOOL = "CreatorTool";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPBasicSchema.java`
#### Snippet
```java
    public static final String THUMBNAILS = "Thumbnails";

    @PropertyType(type= Types.Date, card = Cardinality.Simple)
    public static final String MODIFIER_DATE = "ModifierDate";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPBasicSchema.java`
#### Snippet
```java
    public static final String NICKNAME = "Nickname";

    @PropertyType(type = Types.Integer, card = Cardinality.Simple)
    public static final String RATING = "Rating";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPBasicSchema.java`
#### Snippet
```java
    public static final String MODIFYDATE = "ModifyDate";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String NICKNAME = "Nickname";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPBasicSchema.java`
#### Snippet
```java
    public static final String LABEL = "Label";

    @PropertyType(type = Types.Date, card = Cardinality.Simple)
    public static final String METADATADATE = "MetadataDate";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPBasicSchema.java`
#### Snippet
```java
    public static final String METADATADATE = "MetadataDate";

    @PropertyType(type = Types.Date, card = Cardinality.Simple)
    public static final String MODIFYDATE = "ModifyDate";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/PhotoshopSchema.java`
#### Snippet
```java
    public static final String SOURCE = "Source";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String STATE = "State";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/PhotoshopSchema.java`
#### Snippet
```java
    public static final String CREDIT = "Credit";

    @PropertyType(type = Types.Date, card = Cardinality.Simple)
    public static final String DATE_CREATED = "DateCreated";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/PhotoshopSchema.java`
#### Snippet
```java
    public static final String ICC_PROFILE = "ICCProfile";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String INSTRUCTIONS = "Instructions";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/PhotoshopSchema.java`
#### Snippet
```java
    public static final String CATEGORY = "Category";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String CITY = "City";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/PhotoshopSchema.java`
#### Snippet
```java
    public static final String STATE = "State";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String SUPPLEMENTAL_CATEGORIES = "SupplementalCategories";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/PhotoshopSchema.java`
#### Snippet
```java
    public static final String AUTHORS_POSITION = "AuthorsPosition";

    @PropertyType(type = Types.ProperName, card = Cardinality.Simple)
    public static final String CAPTION_WRITER = "CaptionWriter";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/PhotoshopSchema.java`
#### Snippet
```java
    }

    @PropertyType(type = Types.URI, card = Cardinality.Simple)
    public static final String ANCESTORID = "AncestorID";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/PhotoshopSchema.java`
#### Snippet
```java
    public static final String CITY = "City";

    @PropertyType(type = Types.Integer, card = Cardinality.Simple)
    public static final String COLOR_MODE = "ColorMode";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/PhotoshopSchema.java`
#### Snippet
```java
    public static final String HISTORY = "History";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String ICC_PROFILE = "ICCProfile";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/PhotoshopSchema.java`
#### Snippet
```java
    public static final String HEADLINE = "Headline";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String HISTORY = "History";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/PhotoshopSchema.java`
#### Snippet
```java
    public static final String CAPTION_WRITER = "CaptionWriter";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String CATEGORY = "Category";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/PhotoshopSchema.java`
#### Snippet
```java
    public static final String ANCESTORID = "AncestorID";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String AUTHORS_POSITION = "AuthorsPosition";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/PhotoshopSchema.java`
#### Snippet
```java
    public static final String INSTRUCTIONS = "Instructions";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String SOURCE = "Source";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/PhotoshopSchema.java`
#### Snippet
```java
    public static final String DOCUMENT_ANCESTORS = "DocumentAncestors";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String HEADLINE = "Headline";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/PhotoshopSchema.java`
#### Snippet
```java
    private ArrayProperty seqLayer;

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String TRANSMISSION_REFERENCE = "TransmissionReference";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/PhotoshopSchema.java`
#### Snippet
```java
    public static final String COUNTRY = "Country";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String CREDIT = "Credit";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/PhotoshopSchema.java`
#### Snippet
```java
    public static final String COLOR_MODE = "ColorMode";

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String COUNTRY = "Country";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/PhotoshopSchema.java`
#### Snippet
```java
    public static final String TRANSMISSION_REFERENCE = "TransmissionReference";

    @PropertyType(type = Types.Integer, card = Cardinality.Simple)
    public static final String URGENCY = "Urgency";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPMediaManagementSchema.java`
#### Snippet
```java
{

    @PropertyType(type = Types.URL, card = Cardinality.Simple)
    public static final String LAST_URL = "LastURL";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPMediaManagementSchema.java`
#### Snippet
```java


    @PropertyType(type = Types.ResourceRef, card = Cardinality.Simple)
    public static final String RENDITION_OF = "RenditionOf";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPMediaManagementSchema.java`
#### Snippet
```java
    // -------------------------------- ResourceRef --------------------

    @PropertyType(type = Types.ResourceRef, card = Cardinality.Simple)
    public static final String DERIVED_FROM = "DerivedFrom";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPMediaManagementSchema.java`
#### Snippet
```java
    // ----------------------------

    @PropertyType(type = Types.AgentName, card = Cardinality.Simple)
    public static final String MANAGER = "Manager";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPMediaManagementSchema.java`
#### Snippet
```java
    // ----------------------------

    @PropertyType(type = Types.URI, card = Cardinality.Simple)
    public static final String DOCUMENTID = "DocumentID";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPMediaManagementSchema.java`
#### Snippet
```java
    // ----------------------------

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String MANAGERVARIANT = "ManagerVariant";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPMediaManagementSchema.java`
#### Snippet
```java
    // ----------------------------

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String ORIGINALDOCUMENTID = "OriginalDocumentID";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPMediaManagementSchema.java`
#### Snippet
```java
    // ----------------------------

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String VERSIONID = "VersionID";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPMediaManagementSchema.java`
#### Snippet
```java
    // ----------------------------

    @PropertyType(type = Types.RenditionClass, card = Cardinality.Simple)
    public static final String RENDITIONCLASS = "RenditionClass";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPMediaManagementSchema.java`
#### Snippet
```java
    // ----------------------------

    @PropertyType(type = Types.URI, card = Cardinality.Simple)
    public static final String INSTANCEID = "InstanceID";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPMediaManagementSchema.java`
#### Snippet
```java
    // ----------------------------

    @PropertyType(type = Types.Text, card = Cardinality.Simple)
    public static final String RENDITIONPARAMS = "RenditionParams";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPMediaManagementSchema.java`
#### Snippet
```java
    // ----------------------------

    @PropertyType(type = Types.URI, card = Cardinality.Simple)
    public static final String MANAGETO = "ManageTo";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPMediaManagementSchema.java`
#### Snippet
```java
    public static final String RENDITION_OF = "RenditionOf";

    @PropertyType(type = Types.Integer, card = Cardinality.Simple)
    public static final String SAVE_ID = "SaveID";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPMediaManagementSchema.java`
#### Snippet
```java
    // ----------------------------

    @PropertyType(type = Types.URI, card = Cardinality.Simple)
    public static final String MANAGEUI = "ManageUI";

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `xmpbox/src/main/java/org/apache/xmpbox/schema/XMPMediaManagementSchema.java`
#### Snippet
```java
    // ----------------------------

    @PropertyType(type = Types.ResourceRef, card = Cardinality.Simple)
    public static final String MANAGED_FROM = "ManagedFrom";

```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
((indata\[0\] \<\< 8) \| (indata\[1\] \& 0xFF)) \<\< 16: integer shift implicitly cast to long
in `pdfbox/src/main/java/org/apache/pdfbox/filter/ASCII85OutputStream.java`
#### Snippet
```java
    private void transformASCII85()
    {
        long word = ((((indata[0] << 8) | (indata[1] & 0xFF)) << 16) | ((indata[2] & 0xFF) << 8) | (indata[3] & 0xFF)) & 0xFFFFFFFFL;

        if (word == 0)
```

### IntegerMultiplicationImplicitCastToLong
i \* 10: integer multiplication implicitly cast to long
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/BruteForceParser.java`
#### Snippet
```java
            for (int i = 1; i < 40 && !objFound; i++)
            {
                long currentOffset = positionObjStream - (i * 10);
                if (currentOffset > 0)
                {
```

### IntegerMultiplicationImplicitCastToLong
i \* 10: integer multiplication implicitly cast to long
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/BruteForceParser.java`
#### Snippet
```java
            for (int i = 1; i < 40 && !objFound; i++)
            {
                long currentOffset = xrefOffset - (i * 10);
                if (currentOffset > 0)
                {
```

### IntegerMultiplicationImplicitCastToLong
input.readUnsignedShort() \<\< 16: integer shift implicitly cast to long
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFParser.java`
#### Snippet
```java
    private static long readLong(DataInput input) throws IOException
    {
        return (input.readUnsignedShort() << 16) | input.readUnsignedShort();
    }

```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/encoding/DictionaryEncoding.java`
#### Snippet
```java
        encoding.setItem(COSName.NAME, COSName.ENCODING);
        encoding.setItem(COSName.DIFFERENCES, differences);
        if (baseEncoding != COSName.STANDARD_ENCODING)
        {
            encoding.setItem(COSName.BASE_ENCODING, baseEncoding);
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/function/PDFunctionType0.java`
#### Snippet
```java
        {
            float[] resultSample = new float[numberOfOutputValues];
            if (step == in.length - 1)
            {
                // leaf
```

### IfStatementWithIdenticalBranches
Common parts with variables can be extracted from 'if'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/function/type4/BitwiseOperators.java`
#### Snippet
```java
            int shift = (Integer)stack.pop();
            int int1 = (Integer)stack.pop();
            if (shift < 0)
            {
                int result = int1 >> Math.abs(shift);
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/state/PDSoftMask.java`
#### Snippet
```java
        if (dictionary instanceof COSName)
        {
            if (COSName.NONE.equals(dictionary))
            {
                return null;
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/image/CCITTFactory.java`
#### Snippet
```java
    private static int readshort(char endianess, RandomAccessRead raf) throws IOException
    {
        if (endianess == 'I')
        {
            return raf.read() | (raf.read() << 8);
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/image/PDImageXObject.java`
#### Snippet
```java
    {
        COSArray mask = getCOSObject().getCOSArray(COSName.MASK);
        if (mask != null)
        {
            // color key mask, no explicit mask to return
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/form/PDRadioButton.java`
#### Snippet
```java
        List<String> exportValues = getExportValues();
        List<String> selectedExportValues = new ArrayList<>();
        if (exportValues.isEmpty())
        {
            selectedExportValues.add(getValue());
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/BaseParser.java`
#### Snippet
```java
        }

        if (ASCII_CR == whitespace)
        {
            whitespace = source.read();
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `io/src/main/java/org/apache/pdfbox/io/ScratchFileBuffer.java`
#### Snippet
```java
        }
        
        if ((seekToPosition >= currentPageOffset) && (seekToPosition <= currentPageOffset + pageSize))
        {
            // within same page
```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/COSArrayList.java`
#### Snippet
```java
    public boolean containsAll(Collection<?> c)
    {
        return actual.containsAll( c );
    }

```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/form/PDChoice.java`
#### Snippet
```java
            }
            List<String> options = getOptions();
            if (!options.containsAll(values))
            {
                throw new IllegalArgumentException("The values are not contained in the selectable options.");
```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`1 << 0` can be replaced with '1'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/PDAnnotation.java`
#### Snippet
```java
     * An annotation flag.
     */
    private static final int FLAG_INVISIBLE = 1 << 0;
    /**
     * An annotation flag.
```

### PointlessBitwiseExpression
`1 << 0` can be replaced with '1'
in `fontbox/src/main/java/org/apache/fontbox/ttf/TTFSubsetter.java`
#### Snippet
```java

                        // ARG_1_AND_2_ARE_WORDS
                        if ((flags & 1 << 0) != 0)
                        {
                            off += 2 * 2;
```

### PointlessBitwiseExpression
`1 << 0` can be replaced with '1'
in `fontbox/src/main/java/org/apache/fontbox/ttf/TTFSubsetter.java`
#### Snippet
```java
                            off += 2;
                            // ARG_1_AND_2_ARE_WORDS
                            if ((flags & 1 << 0) != 0)
                            {
                                off += 2 * 2;
```

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'isInstance()' call
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/AddValidationInformation.java`
#### Snippet
```java
        T result;
        COSBase element = parent.getDictionaryObject(name);
        if (element != null && clazz.isInstance(element))
        {
            result = clazz.cast(element);
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/LogDialog.java`
#### Snippet
```java
            if (info.length() > 0)
            {
                info += ", ";
            }
            info += str;
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/LogDialog.java`
#### Snippet
```java
                info += ", ";
            }
            info += str;
        }
        
```

## RuleId[id=UnnecessaryUnaryMinus]
### UnnecessaryUnaryMinus
Unnecessary unary `-` operator
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/PDCIDFontType2.java`
#### Snippet
```java
    {
        // todo: really we want the BBox, (for text extraction:)
        return (ttf.getHorizontalHeader().getAscender() + -ttf.getHorizontalHeader().getDescender())
                / ttf.getUnitsPerEm(); // todo: shouldn't this be the yMax/yMin?
    }
```

### UnnecessaryUnaryMinus
Unnecessary unary `-` operator
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/form/AppearanceGeneratorHelper.java`
#### Snippet
```java
                if (fontCapAtSize > clipRect.getHeight())
                {
                    y = clipRect.getLowerLeftY() + -fontDescentAtSize;
                }
                else
```

### UnnecessaryUnaryMinus
Unnecessary unary `-` operator
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/form/AppearanceGeneratorHelper.java`
#### Snippet
```java
                // fit height
                float height = (font.getFontDescriptor().getCapHeight() +
                               -font.getFontDescriptor().getDescent()) * font.getFontMatrix().getScaleY();
                if (height <= 0)
                {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `logLabel` initializer `null` is redundant
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/ReaderBottomPanel.java`
#### Snippet
```java
{
    private JLabel statusLabel = null;
    private JLabel logLabel = null;
    
    public ReaderBottomPanel()
```

### UnusedAssignment
Variable `statusLabel` initializer `null` is redundant
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/ReaderBottomPanel.java`
#### Snippet
```java
public class ReaderBottomPanel extends JPanel
{
    private JLabel statusLabel = null;
    private JLabel logLabel = null;
    
```

### UnusedAssignment
Variable `retval` initializer `null` is redundant
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/PDFTreeModel.java`
#### Snippet
```java
    public Object getChild(Object parent, int index)
    {
        Object retval = null;
        if( parent instanceof COSArray )
        {
```

### UnusedAssignment
Variable `pageIndex` initializer `-1` is redundant
in `debugger/src/main/java/org/apache/pdfbox/debugger/pagepane/PagePane.java`
#### Snippet
```java
    private final PDPage page;
    private JPanel panel;
    private int pageIndex = -1;
    private JLabel label;
    private ZoomMenu zoomMenu;
```

### UnusedAssignment
Variable `resRead` initializer `0` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/filter/FlateFilter.java`
#### Snippet
```java
                while (true) 
                { 
                    int resRead = 0;
                    try
                    {
```

### UnusedAssignment
Variable `position` initializer `null` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/text/PDFTextStripper.java`
#### Snippet
```java
        private boolean isArticleStart = false;

        private TextPosition position = null;

        /**
```

### UnusedAssignment
Variable `set` initializer `new HashSet<>()` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/PDPageTree.java`
#### Snippet
```java
    {
        private final Queue<COSDictionary> queue = new ArrayDeque<>();
        private Set<COSDictionary> set = new HashSet<>();

        private PageIterator(COSDictionary node)
```

### UnusedAssignment
Variable `retval` initializer `null` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFDocument.java`
#### Snippet
```java
    public FDFCatalog getCatalog()
    {
        FDFCatalog retval = null;
        COSDictionary trailer = document.getTrailer();
        COSDictionary root = trailer.getCOSDictionary(COSName.ROOT);
```

### UnusedAssignment
Variable `retval` initializer `null` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFIconFit.java`
#### Snippet
```java
    public PDRange getFractionalSpaceToAllocate()
    {
        PDRange retval = null;
        COSArray array = fit.getCOSArray(COSName.A);
        if (array == null)
```

### UnusedAssignment
Variable `actualObject` initializer `null` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/COSDictionaryMap.java`
#### Snippet
```java
            {
                COSBase cosObj = map.getDictionaryObject( key );
                Object actualObject = null;
                if( cosObj instanceof COSString )
                {
```

### UnusedAssignment
Variable `valueType` initializer `null` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/PDNumberTreeNode.java`
#### Snippet
```java

    private final COSDictionary node;
    private Class<? extends COSObjectable> valueType = null;

    /**
```

### UnusedAssignment
Variable `fontSetting` initializer `null` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/PDFontSetting.java`
#### Snippet
```java
public class PDFontSetting implements COSObjectable
{
    private COSArray fontSetting = null;

    /**
```

### UnusedAssignment
Variable `shading` initializer `null` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/shading/PDShading.java`
#### Snippet
```java
    public static PDShading create(COSDictionary shadingDictionary) throws IOException
    {
        PDShading shading = null;
        int shadingType = shadingDictionary.getInt(COSName.SHADING_TYPE, 0);
        switch (shadingType)
```

### UnusedAssignment
Variable `fileType` initializer `null` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/image/PDImageXObject.java`
#### Snippet
```java
    public static PDImageXObject createFromFileByContent(File file, PDDocument doc) throws IOException
    {
        FileType fileType = null;
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file)))
        {
```

### UnusedAssignment
Variable `flag` initializer `0` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/shading/PDMeshBasedShadingType.java`
#### Snippet
```java
            Point2D[] implicitEdge = new Point2D[4];
            float[][] implicitCornerColor = new float[2][colRange.length];
            byte flag = 0;

            try
```

### UnusedAssignment
Variable `userPassword` initializer `""` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/StandardProtectionPolicy.java`
#### Snippet
```java
    private String ownerPassword = "";
    @SuppressWarnings({"squid:S2068"})
    private String userPassword = "";

    /**
```

### UnusedAssignment
Variable `ownerPassword` initializer `""` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/StandardProtectionPolicy.java`
#### Snippet
```java
    private AccessPermission permissions;
    @SuppressWarnings({"squid:S2068"})
    private String ownerPassword = "";
    @SuppressWarnings({"squid:S2068"})
    private String userPassword = "";
```

### UnusedAssignment
Variable `cryptFilterDictionary` initializer `null` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/PDCryptFilterDictionary.java`
#### Snippet
```java
     * COS crypt filter dictionary.
     */
    protected COSDictionary cryptFilterDictionary = null;

    /**
```

### UnusedAssignment
Variable `annot` initializer `null` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/PDAnnotation.java`
#### Snippet
```java
    public static PDAnnotation createAnnotation(COSBase base) throws IOException
    {
        PDAnnotation annot = null;
        if (base instanceof COSDictionary)
        {
```

### UnusedAssignment
Variable `pageDestination` initializer `null` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/documentnavigation/outline/PDOutlineItem.java`
#### Snippet
```java
        }

        PDPageDestination pageDestination = null;
        if (dest instanceof PDNamedDestination)
        {
```

### UnusedAssignment
Variable `currentEnd` initializer `0` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/PDFXrefStreamParser.java`
#### Snippet
```java
        private final long[] end;
        private int currentRange = 0;
        private long currentEnd = 0;
        private long currentNumber = 0;
        private long maxValue = 0;
```

### UnusedAssignment
Variable `maxValue` initializer `0` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/PDFXrefStreamParser.java`
#### Snippet
```java
        private long currentEnd = 0;
        private long currentNumber = 0;
        private long maxValue = 0;

        private ObjectNumbers(COSArray indexArray) throws IOException
```

### UnusedAssignment
Variable `currentNumber` initializer `0` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/PDFXrefStreamParser.java`
#### Snippet
```java
        private int currentRange = 0;
        private long currentEnd = 0;
        private long currentNumber = 0;
        private long maxValue = 0;

```

### UnusedAssignment
Variable `objectNumbers` initializer `null` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/PDFObjectStreamParser.java`
#### Snippet
```java
    public Map<Long, Integer> readObjectNumbers() throws IOException
    {
        Map<Long, Integer> objectNumbers = null;
        try
        {
```

### UnusedAssignment
Variable `nextToken` initializer `null` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/PDFStreamParser.java`
#### Snippet
```java
                    COSDictionary imageParams = new COSDictionary();
                    beginImageOP.setImageParameters( imageParams );
                    Object nextToken = null;
                    while( (nextToken = parseNextToken()) instanceof COSName )
                    {
```

### UnusedAssignment
Variable `sourceDoc` initializer `null` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/multipdf/PDFMergerUtility.java`
#### Snippet
```java
                for (Object sourceObject : sources)
                {
                    PDDocument sourceDoc = null;
                    if (sourceObject instanceof File)
                    {
```

### UnusedAssignment
Variable `character` initializer `0` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/BaseParser.java`
#### Snippet
```java
                        }
    
                        int character = 0;
                        try
                        {
```

### UnusedAssignment
Variable `retval` initializer `0` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/BaseParser.java`
#### Snippet
```java
    {
        skipSpaces();
        long retval = 0;

        StringBuilder longBuffer = readStringNumber();
```

### UnusedAssignment
Variable `retval` initializer `0` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/BaseParser.java`
#### Snippet
```java
    {
        skipSpaces();
        int retval = 0;

        StringBuilder intBuffer = readStringNumber();
```

### UnusedAssignment
Variable `trailer` initializer `null` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/COSParser.java`
#### Snippet
```java
        // ---- parse whole chain of xref tables/object streams using PREV reference
        Set<Long> prevSet = new HashSet<>();
        COSDictionary trailer = null;
        while (prev > 0)
        {
```

### UnusedAssignment
Variable `count` initializer `0` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/COSParser.java`
#### Snippet
```java

            // the number of objects in the xref table
            int count = 0;
            try
            {
```

### UnusedAssignment
Variable `cosBase` initializer `null` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdfwriter/COSWriter.java`
#### Snippet
```java
        }

        COSBase cosBase = null;
        COSObjectKey cosObjectKey = null;
        if (actual != null)
```

### UnusedAssignment
Variable `cosObjectKey` initializer `null` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdfwriter/COSWriter.java`
#### Snippet
```java

        COSBase cosBase = null;
        COSObjectKey cosObjectKey = null;
        if (actual != null)
        {
```

### UnusedAssignment
Variable `current` initializer `null` is redundant
in `fontbox/src/main/java/org/apache/fontbox/cff/Type1CharString.java`
#### Snippet
```java
    private int width = 0;
    private Point2D.Float leftSideBearing = null;
    private Point2D.Float current = null;
    private boolean isFlex = false;
    private final List<Point2D.Float> flexPoints = new ArrayList<>();
```

### UnusedAssignment
Variable `defWidthX` initializer `0` is redundant
in `fontbox/src/main/java/org/apache/fontbox/cff/Type2CharString.java`
#### Snippet
```java
public class Type2CharString extends Type1CharString
{
    private float defWidthX = 0;
    private float nominalWidthX = 0;
    private int pathCount = 0;
```

### UnusedAssignment
Variable `nominalWidthX` initializer `0` is redundant
in `fontbox/src/main/java/org/apache/fontbox/cff/Type2CharString.java`
#### Snippet
```java
{
    private float defWidthX = 0;
    private float nominalWidthX = 0;
    private int pathCount = 0;
    private final int gid;
```

### UnusedAssignment
Variable `amountRead` initializer `0` is redundant
in `fontbox/src/main/java/org/apache/fontbox/ttf/TTFDataStream.java`
#### Snippet
```java
    {
        byte[] data = new byte[numberOfBytes];
        int amountRead = 0;
        int totalAmountRead = 0;
        // read at most numberOfBytes bytes from the stream.
```

### UnusedAssignment
Variable `endOfContour` initializer `false` is redundant
in `fontbox/src/main/java/org/apache/fontbox/ttf/GlyphRenderer.java`
#### Snippet
```java
        private int y = 0;
        private boolean onCurve = true;
        private boolean endOfContour = false;

        Point(int xValue, int yValue, boolean onCurveValue, boolean endOfContourValue)
```

### UnusedAssignment
Variable `onCurve` initializer `true` is redundant
in `fontbox/src/main/java/org/apache/fontbox/ttf/GlyphRenderer.java`
#### Snippet
```java
        private int x = 0;
        private int y = 0;
        private boolean onCurve = true;
        private boolean endOfContour = false;

```

### UnusedAssignment
Variable `x` initializer `0` is redundant
in `fontbox/src/main/java/org/apache/fontbox/ttf/GlyphRenderer.java`
#### Snippet
```java
    private static class Point
    {
        private int x = 0;
        private int y = 0;
        private boolean onCurve = true;
```

### UnusedAssignment
Variable `y` initializer `0` is redundant
in `fontbox/src/main/java/org/apache/fontbox/ttf/GlyphRenderer.java`
#### Snippet
```java
    {
        private int x = 0;
        private int y = 0;
        private boolean onCurve = true;
        private boolean endOfContour = false;
```

### UnusedAssignment
Variable `glyphTable` initializer `null` is redundant
in `fontbox/src/main/java/org/apache/fontbox/ttf/GlyfCompositeDescript.java`
#### Snippet
```java
    private final List<GlyfCompositeComp> components = new ArrayList<>();
    private final Map<Integer,GlyphDescription> descriptions = new HashMap<>();
    private GlyphTable glyphTable = null;
    private boolean beingResolved = false;
    private boolean resolved = false;
```

### UnusedAssignment
Variable `isEmbedded` initializer `false` is redundant
in `fontbox/src/main/java/org/apache/fontbox/ttf/TTFParser.java`
#### Snippet
```java
    private static final Log LOG = LogFactory.getLog(TTFParser.class);

    private boolean isEmbedded = false;

    /**
```

### UnusedAssignment
The value `data.readUnsignedShort()` assigned to `length` is never used
in `fontbox/src/main/java/org/apache/fontbox/ttf/CmapSubtable.java`
#### Snippet
```java
        if (subtableFormat < 8)
        {
            length = data.readUnsignedShort();
            version = data.readUnsignedShort();
        }
```

### UnusedAssignment
The value `data.readUnsignedShort()` assigned to `version` is never used
in `fontbox/src/main/java/org/apache/fontbox/ttf/CmapSubtable.java`
#### Snippet
```java
        {
            length = data.readUnsignedShort();
            version = data.readUnsignedShort();
        }
        else
```

### UnusedAssignment
The value `data.readUnsignedInt()` assigned to `length` is never used
in `fontbox/src/main/java/org/apache/fontbox/ttf/CmapSubtable.java`
#### Snippet
```java
            // read an other UnsignedShort to read a Fixed32
            data.readUnsignedShort();
            length = data.readUnsignedInt();
            version = data.readUnsignedInt();
        }
```

### UnusedAssignment
The value `data.readUnsignedInt()` assigned to `version` is never used
in `fontbox/src/main/java/org/apache/fontbox/ttf/CmapSubtable.java`
#### Snippet
```java
            data.readUnsignedShort();
            length = data.readUnsignedInt();
            version = data.readUnsignedInt();
        }

```

### UnusedAssignment
The value `data.readUnsignedInt()` assigned to `featureVariationsOffset` is never used
in `fontbox/src/main/java/org/apache/fontbox/ttf/GlyphSubstitutionTable.java`
#### Snippet
```java
        if (minorVersion == 1L)
        {
            featureVariationsOffset = data.readUnsignedInt();
        }

```

### UnusedAssignment
The value changed at `newGid++` is never used
in `fontbox/src/main/java/org/apache/fontbox/ttf/TTFSubsetter.java`
#### Snippet
```java
                prevEnd = offset + length;
            }
            newOffsets[newGid++] = newOffset;
        }

```

### UnusedAssignment
Variable `intValue` initializer `0` is redundant
in `fontbox/src/main/java/org/apache/fontbox/cmap/CMapParser.java`
#### Snippet
```java
                    continue;
                }
                int intValue = 0;
                if (theNextByte >= '0' && theNextByte <= '9')
                {
```

### UnusedAssignment
Variable `chunkSize` initializer `DEFAULT_CHUNK_SIZE_4KB` is redundant
in `io/src/main/java/org/apache/pdfbox/io/RandomAccessReadBuffer.java`
#### Snippet
```java
    private static final int DEFAULT_CHUNK_SIZE_4KB = 1 << 12;
    // use the default chunk size
    private int chunkSize = DEFAULT_CHUNK_SIZE_4KB;
    // list containing all chunks
    private final List<ByteBuffer> bufferList;
```

### UnusedAssignment
Variable `bytesRead` initializer `0` is redundant
in `io/src/main/java/org/apache/pdfbox/io/RandomAccessReadBuffer.java`
#### Snippet
```java
    {
        this();
        int bytesRead = 0;
        int remainingBytes = chunkSize;
        int offset = 0;
```

### UnusedAssignment
Variable `randomAccessRead` initializer `null` is redundant
in `io/src/main/java/org/apache/pdfbox/io/RandomAccessReadBuffer.java`
#### Snippet
```java
    public static RandomAccessReadBuffer createBufferFromStream(InputStream inputStream) throws IOException
    {
        RandomAccessReadBuffer randomAccessRead = null;
        try
        {
```

### UnusedAssignment
Variable `currentRandomAccessRead` initializer `null` is redundant
in `io/src/main/java/org/apache/pdfbox/io/SequenceRandomAccessRead.java`
#### Snippet
```java
    private long totalLength = 0;
    private boolean isClosed = false;
    private RandomAccessRead currentRandomAccessRead = null;
    
    public SequenceRandomAccessRead(List<RandomAccessRead> randomAccessReadList)
```

### UnusedAssignment
Variable `definedProperties` initializer `null` is redundant
in `xmpbox/src/main/java/org/apache/xmpbox/type/DefinedStructuredType.java`
#### Snippet
```java
{

    private Map<String, PropertyType> definedProperties = null;

    public DefinedStructuredType(XMPMetadata metadata, String namespaceURI, String fieldPrefix, String propertyName)
```

### UnusedAssignment
Variable `xpacketBegin` initializer `null` is redundant
in `xmpbox/src/main/java/org/apache/xmpbox/XMPMetadata.java`
#### Snippet
```java
    private String xpacketId = null;

    private String xpacketBegin = null;

    private String xpacketBytes = null;
```

### UnusedAssignment
Variable `xpacketBytes` initializer `null` is redundant
in `xmpbox/src/main/java/org/apache/xmpbox/XMPMetadata.java`
#### Snippet
```java
    private String xpacketBegin = null;

    private String xpacketBytes = null;

    private String xpacketEncoding = null;
```

### UnusedAssignment
Variable `xpacketId` initializer `null` is redundant
in `xmpbox/src/main/java/org/apache/xmpbox/XMPMetadata.java`
#### Snippet
```java
{

    private String xpacketId = null;

    private String xpacketBegin = null;
```

### UnusedAssignment
Variable `xpacketEncoding` initializer `null` is redundant
in `xmpbox/src/main/java/org/apache/xmpbox/XMPMetadata.java`
#### Snippet
```java
    private String xpacketBytes = null;

    private String xpacketEncoding = null;

    private String xpacketEndData = XmpConstants.DEFAULT_XPACKET_END;
```

### UnusedAssignment
Variable `n` initializer `0` is redundant
in `io/src/main/java/org/apache/pdfbox/io/IOUtils.java`
#### Snippet
```java
        byte[] buffer = new byte[4096];
        long count = 0;
        int n = 0;
        while (-1 != (n = input.read(buffer)))
        {
```

### UnusedAssignment
Variable `document` initializer `null` is redundant
in `xmpbox/src/main/java/org/apache/xmpbox/xml/DomXmpParser.java`
#### Snippet
```java
    public XMPMetadata parse(InputStream input) throws XmpParsingException
    {
        Document document = null;
        try
        {
```

### UnusedAssignment
Variable `xmp` initializer `null` is redundant
in `xmpbox/src/main/java/org/apache/xmpbox/xml/DomXmpParser.java`
#### Snippet
```java
        }

        XMPMetadata xmp = null;

        // Start reading
```

### UnusedAssignment
Variable `root` initializer `null` is redundant
in `xmpbox/src/main/java/org/apache/xmpbox/xml/DomXmpParser.java`
#### Snippet
```java
        }
        // expect root element
        Element root = null;
        if (!(node instanceof Element))
        {
```

### UnusedAssignment
The value changed at `i++` is never used
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/UsingTextMatrix.java`
#### Snippet
```java

            contentStream.setTextMatrix(new Matrix(0, -30, 30, 0, centeredXPosition, centeredYPosition*1.5f));
            contentStream.showText(message + " " + i++);

            contentStream.endText();
```

### UnusedAssignment
Variable `clazz` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/PreflightConfiguration.java`
#### Snippet
```java
    public ValidationProcess getInstanceOfProcess(String processName) throws ValidationException
    {
        Class<? extends ValidationProcess> clazz = null;
        if (processes.containsKey(processName))
        {
```

### UnusedAssignment
Variable `t` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/ValidationResult.java`
#### Snippet
```java
         * Throwable.
         */
        private Throwable t = null;

        /**
```

### UnusedAssignment
Variable `isValid` initializer `false` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/ValidationResult.java`
#### Snippet
```java
     * Boolean to know if the PDF is a valid PDF/A
     */
    private boolean isValid = false;

    /**
```

### UnusedAssignment
Variable `actionName` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/action/InvalidAction.java`
#### Snippet
```java
public class InvalidAction extends AbstractActionManager
{
    private String actionName = null;

    /**
```

### UnusedAssignment
Variable `actionName` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/action/UndefAction.java`
#### Snippet
```java
public class UndefAction extends AbstractActionManager
{
    private String actionName = null;

    /**
```

### UnusedAssignment
Variable `aaKey` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/action/AbstractActionManager.java`
#### Snippet
```java
     * Action name in a Additional Action dictionary
     */
    private String aaKey = null;
    /**
     * The action dictionary checked by this class
```

### UnusedAssignment
Variable `actionDictionary` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/action/AbstractActionManager.java`
#### Snippet
```java
     * The action dictionary checked by this class
     */
    protected COSDictionary actionDictionary = null;
    /**
     * The validation context
```

### UnusedAssignment
Variable `actionFact` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/action/AbstractActionManager.java`
#### Snippet
```java
     * ActionManager factory used to create new ActionManager
     */
    private ActionManagerFactory actionFact = null;
    /**
     * Action name in a Additional Action dictionary
```

### UnusedAssignment
Variable `context` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/action/AbstractActionManager.java`
#### Snippet
```java
     * The validation context
     */
    protected PreflightContext context = null;

    /**
```

### UnusedAssignment
Variable `pdDocument` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/parser/PreflightParser.java`
#### Snippet
```java
        this.config = config;
        validationResult = new ValidationResult(true);
        PDDocument pdDocument = null;
        checkPdfHeader();
        try
```

### UnusedAssignment
Variable `pdcs` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/graphic/StandardColorSpaceHelper.java`
#### Snippet
```java
     * High level object which represents the colors space to check.
     */
    protected PDColorSpace pdcs = null;

    protected StandardColorSpaceHelper(PreflightContext _context, PDColorSpace _cs)
```

### UnusedAssignment
Variable `context` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/graphic/StandardColorSpaceHelper.java`
#### Snippet
```java
     * The context which contains useful information to process the validation.
     */
    protected PreflightContext context = null;
    /**
     * The ICCProfile contained in the DestOutputIntent
```

### UnusedAssignment
Variable `processedPage` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightStreamEngine.java`
#### Snippet
```java

    protected PreflightContext context = null;
    protected PDPage processedPage = null;

    public PreflightStreamEngine(PreflightContext context, PDPage page)
```

### UnusedAssignment
Variable `context` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightStreamEngine.java`
#### Snippet
```java
    }

    protected PreflightContext context = null;
    protected PDPage processedPage = null;

```

### UnusedAssignment
Variable `context` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/xobject/AbstractXObjValidator.java`
#### Snippet
```java
     * The validation context which contains useful information to process validation.
     */
    protected PreflightContext context = null;

    public AbstractXObjValidator(PreflightContext context, COSStream xobj)
```

### UnusedAssignment
Variable `xobject` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/xobject/AbstractXObjValidator.java`
#### Snippet
```java
     * The XObject to validate as a COSStream.
     */
    protected COSStream xobject = null;
    /**
     * The validation context which contains useful information to process validation.
```

### UnusedAssignment
Variable `pdXObj` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/xobject/XObjFormValidator.java`
#### Snippet
```java
     * High level object which represents the XObjectForm
     */
    PDFormXObject pdXObj = null;

    public XObjFormValidator(PreflightContext context, PDFormXObject xobj)
```

### UnusedAssignment
Variable `pdUnk` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/annotation/PrintMarkAnnotationValidator.java`
#### Snippet
```java
     * PDFBox object which wraps the annotation dictionary
     */
    protected PDAnnotationUnknown pdUnk = null;

    public PrintMarkAnnotationValidator(PreflightContext ctx, COSDictionary annotDictionary)
```

### UnusedAssignment
Variable `pdSquareCircle` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/annotation/SquareCircleAnnotationValidator.java`
#### Snippet
```java
     * PDFBox object which wraps the annotation dictionary
     */
    protected PDAnnotationSquareCircle pdSquareCircle = null;

    public SquareCircleAnnotationValidator(PreflightContext ctx, PDAnnotationSquareCircle annotation)
```

### UnusedAssignment
Variable `pdRStamp` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/annotation/RubberStampAnnotationValidator.java`
#### Snippet
```java
     * PDFBox class which wraps the annotaiton dictionary
     */
    protected PDAnnotationRubberStamp pdRStamp = null;

    public RubberStampAnnotationValidator(PreflightContext ctx, COSDictionary annotDictionary)
```

### UnusedAssignment
Variable `pdFreeText` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/annotation/FreeTextAnnotationValidator.java`
#### Snippet
```java
     * PDFBox object which wraps the Annotation dictionary
     */
    protected PDAnnotationMarkup pdFreeText = null;

    public FreeTextAnnotationValidator(PreflightContext ctx, COSDictionary annotDictionary)
```

### UnusedAssignment
Variable `xImage` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/xobject/XObjImageValidator.java`
#### Snippet
```java
    private static final Log LOGGER = LogFactory.getLog(XObjImageValidator.class);

    protected PDImageXObject xImage = null;

    public XObjImageValidator(PreflightContext context, PDImageXObject xobj)
```

### UnusedAssignment
Variable `pdPopup` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/annotation/PopupAnnotationValidator.java`
#### Snippet
```java
     * PDFBox object which wraps the annotation dictionary
     */
    protected PDAnnotationPopup pdPopup = null;

    public PopupAnnotationValidator(PreflightContext ctx, COSDictionary annotDictionary)
```

### UnusedAssignment
Variable `pdUnk` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/annotation/InkAnnotationValidator.java`
#### Snippet
```java
     * PDFBox which wraps the annotation dictionary
     */
    protected PDAnnotationUnknown pdUnk = null;

    public InkAnnotationValidator(PreflightContext ctx, COSDictionary annotDictionary)
```

### UnusedAssignment
Variable `pdUnk` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/annotation/TrapNetAnnotationValidator.java`
#### Snippet
```java
     * PDFBox object which wraps the annotation dictionary
     */
    protected PDAnnotationUnknown pdUnk = null;

    public TrapNetAnnotationValidator(PreflightContext ctx, COSDictionary annotDictionary)
```

### UnusedAssignment
Variable `pdText` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/annotation/TextAnnotationValidator.java`
#### Snippet
```java
     * PDFBox object which wraps the annotation dictionary
     */
    protected PDAnnotationText pdText = null;

    public TextAnnotationValidator(PreflightContext ctx, COSDictionary annotDictionary)
```

### UnusedAssignment
Variable `pdLine` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/annotation/LineAnnotationValidator.java`
#### Snippet
```java
     * PDFBox object which wraps the annotation dictionary
     */
    protected PDAnnotationLine pdLine = null;

    public LineAnnotationValidator(PreflightContext ctx, COSDictionary annotDictionary)
```

### UnusedAssignment
Variable `pdWidget` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/annotation/WidgetAnnotationValidator.java`
#### Snippet
```java
     * PDFBox object which wraps the annotation dictionary
     */
    protected PDAnnotationWidget pdWidget = null;

    public WidgetAnnotationValidator(PreflightContext ctx, COSDictionary annotDictionary)
```

### UnusedAssignment
Variable `pdLink` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/annotation/LinkAnnotationValidator.java`
#### Snippet
```java
     * PDFBox object which wraps the annotation dictionary
     */
    protected PDAnnotationLink pdLink = null;

    public LinkAnnotationValidator(PreflightContext ctx, COSDictionary annotDictionary)
```

### UnusedAssignment
Variable `ctx` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/annotation/AnnotationValidator.java`
#### Snippet
```java
    private AnnotationValidatorFactory annotFact = null;

    protected PreflightContext ctx = null;
    /**
     * COSDictionary of the annotation
```

### UnusedAssignment
Variable `annotDictionary` initializer `null` is redundant
in `preflight/src/main/java/org/apache/pdfbox/preflight/annotation/AnnotationValidator.java`
#### Snippet
```java
     * COSDictionary of the annotation
     */
    protected COSDictionary annotDictionary = null;
    /**
     * Instance of PDAnnotation built using the annotDictionary
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `item` is always 'null'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/COSArray.java`
#### Snippet
```java
            if (item == null)
            {
                if (item == object)
                {
                    return i;
```

### ConstantValue
Condition `!omitTrailingZeros || remaining > 0` is always `true` when reached
in `pdfbox/src/main/java/org/apache/pdfbox/util/NumberFormatUtil.java`
#### Snippet
```java
        long remaining = number;

        while (remaining > Integer.MAX_VALUE && (!omitTrailingZeros || remaining > 0))
        {
            long digit = remaining / POWER_OF_TENS[exp];
```

### ConstantValue
Condition `remaining > 0` is always `true` when reached
in `pdfbox/src/main/java/org/apache/pdfbox/util/NumberFormatUtil.java`
#### Snippet
```java
        long remaining = number;

        while (remaining > Integer.MAX_VALUE && (!omitTrailingZeros || remaining > 0))
        {
            long digit = remaining / POWER_OF_TENS[exp];
```

### ConstantValue
Condition `textList.isEmpty()` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/text/PDFMarkedContentExtractor.java`
#### Snippet
```java
             * its associated character if the two are consecutive.
             */ 
            if(textList.isEmpty())
            {
                textList.add(text);
```

### ConstantValue
Condition `app14AdobeNodeList != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/filter/DCTFilter.java`
#### Snippet
```java
        Element markerSequence = (Element)tree.getElementsByTagName("markerSequence").item(0);
        NodeList app14AdobeNodeList = markerSequence.getElementsByTagName("app14Adobe");
        if (app14AdobeNodeList != null && app14AdobeNodeList.getLength() > 0)
        {
            Element adobe = (Element) app14AdobeNodeList.item(0);
```

### ConstantValue
Condition `transform != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/filter/DCTFilter.java`
#### Snippet
```java
                    transform = getAdobeTransformByBruteForce(iis);
                }
                int colorTransform = transform != null ? transform : 0;

                // 0 = Unknown (RGB or CMYK), 1 = YCbCr, 2 = YCCK
```

### ConstantValue
Condition `numberOfArticleSections < originalSize` is always `false`
in `pdfbox/src/main/java/org/apache/pdfbox/text/PDFTextStripper.java`
#### Snippet
```java
                else
                {
                    if (numberOfArticleSections < originalSize)
                    {
                        //TODO Looks like decrement (--i) needed because next value will be ignored.
```

### ConstantValue
Condition `lastPosition == null` is always `true` when reached
in `pdfbox/src/main/java/org/apache/pdfbox/text/PDFTextStripper.java`
#### Snippet
```java
                if (characterValue != null)
                {
                    if (startOfPage && lastPosition == null)
                    {
                        writeParagraphStart();// not sure this is correct for RTL?
```

### ConstantValue
Condition `icon != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationText.java`
#### Snippet
```java
        annot.setName(COSName.SUBTYPE, SUBTYPE);
        String icon = element.getAttribute("icon");
        if (icon != null && !icon.isEmpty())
        {
            setIcon(element.getAttribute("icon"));
```

### ConstantValue
Condition `state != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationText.java`
#### Snippet
```java
        }
        String state = element.getAttribute("state");
        if (state != null && !state.isEmpty())
        {
            String statemodel = element.getAttribute("statemodel");
```

### ConstantValue
Condition `statemodel != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationText.java`
#### Snippet
```java
        {
            String statemodel = element.getAttribute("statemodel");
            if (statemodel != null && !statemodel.isEmpty())
            {
                setState(element.getAttribute("state"));
```

### ConstantValue
Condition `startStyle != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationPolyline.java`
#### Snippet
```java
    {
        String startStyle = element.getAttribute("head");
        if (startStyle != null && !startStyle.isEmpty())
        {
            setStartPointEndingStyle(startStyle);
```

### ConstantValue
Condition `endStyle != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationPolyline.java`
#### Snippet
```java
        }
        String endStyle = element.getAttribute("tail");
        if (endStyle != null && !endStyle.isEmpty())
        {
            setEndPointEndingStyle(endStyle);
```

### ConstantValue
Condition `color != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationPolyline.java`
#### Snippet
```java

        String color = element.getAttribute("interior-color");
        if (color != null && color.length() == 7 && color.charAt(0) == '#')
        {
            int colorValue = Integer.parseInt(color.substring(1, 7), 16);
```

### ConstantValue
Condition `symbol != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationCaret.java`
#### Snippet
```java

        String symbol = element.getAttribute("symbol");
        if (symbol != null && !symbol.isEmpty())
        {
            setSymbol(symbol);
```

### ConstantValue
Condition `fringe != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationCaret.java`
#### Snippet
```java
    {
        String fringe = element.getAttribute("fringe");
        if (fringe != null && !fringe.isEmpty())
        {
            String[] fringeValues = fringe.split(",");
```

### ConstantValue
Condition `coords == null` is always `false`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationTextMarkup.java`
#### Snippet
```java

        String coords = element.getAttribute("coords");
        if (coords == null || coords.isEmpty())
        {
            throw new IOException("Error: missing attribute 'coords'");
```

### ConstantValue
Condition `color != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationPolygon.java`
#### Snippet
```java
        initVertices(element);
        String color = element.getAttribute("interior-color");
        if (color != null && color.length() == 7 && color.charAt(0) == '#')
        {
            int colorValue = Integer.parseInt(color.substring(1, 7), 16);
```

### ConstantValue
Condition `fringe != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationCircle.java`
#### Snippet
```java
    {
        String fringe = element.getAttribute("fringe");
        if (fringe != null && !fringe.isEmpty())
        {
            String[] fringeValues = fringe.split(",");
```

### ConstantValue
Condition `color != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationCircle.java`
#### Snippet
```java

        String color = element.getAttribute("interior-color");
        if (color != null && color.length() == 7 && color.charAt(0) == '#')
        {
            int colorValue = Integer.parseInt(color.substring(1, 7), 16);
```

### ConstantValue
Condition `fringe != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationSquare.java`
#### Snippet
```java
    {
        String fringe = element.getAttribute("fringe");
        if (fringe != null && !fringe.isEmpty())
        {
            String[] fringeValues = fringe.split(",");
```

### ConstantValue
Condition `color != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationSquare.java`
#### Snippet
```java

        String color = element.getAttribute("interior-color");
        if (color != null && color.length() == 7 && color.charAt(0) == '#')
        {
            int colorValue = Integer.parseInt(color.substring(1, 7), 16);
```

### ConstantValue
Condition `page == null` is always `false`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotation.java`
#### Snippet
```java

        String page = element.getAttribute("page");
        if (page == null || page.isEmpty())
        {
            throw new IOException("Error: missing required attribute 'page'");
```

### ConstantValue
Condition `color != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotation.java`
#### Snippet
```java

        String color = element.getAttribute("color");
        if (color != null && color.length() == 7 && color.charAt(0) == '#')
        {
            int colorValue = Integer.parseInt(color.substring(1, 7), 16);
```

### ConstantValue
Condition `flags != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotation.java`
#### Snippet
```java

        String flags = element.getAttribute("flags");
        if (flags != null)
        {
            String[] flagTokens = flags.split(",");
```

### ConstantValue
Condition `rect == null` is always `false`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotation.java`
#### Snippet
```java

        String rect = element.getAttribute("rect");
        if (rect == null)
        {
            throw new IOException("Error: missing attribute 'rect'");
```

### ConstantValue
Condition `opac != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotation.java`
#### Snippet
```java
        setCreationDate(DateConverter.toCalendar(element.getAttribute("creationdate")));
        String opac = element.getAttribute("opacity");
        if (opac != null && !opac.isEmpty())
        {
            setOpacity(Float.parseFloat(opac));
```

### ConstantValue
Condition `width != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotation.java`
#### Snippet
```java
        PDBorderStyleDictionary borderStyle = new PDBorderStyleDictionary();
        String width = element.getAttribute("width");
        if (width != null && !width.isEmpty())
        {
            borderStyle.setWidth(Float.parseFloat(width));
```

### ConstantValue
Condition `style != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotation.java`
#### Snippet
```java
        {
            String style = element.getAttribute("style");
            if (style != null && !style.isEmpty())
            {
                switch (style)
```

### ConstantValue
Condition `intensity != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotation.java`
#### Snippet
```java
                        borderEffect.setStyle("C");
                        String intensity = element.getAttribute("intensity");
                        if (intensity != null && !intensity.isEmpty())
                        {
                            borderEffect.setIntensity(Float.parseFloat(element
```

### ConstantValue
Condition `dashes != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotation.java`
#### Snippet
```java
            }
            String dashes = element.getAttribute("dashes");
            if (dashes != null && !dashes.isEmpty())
            {
                String[] dashesValues = dashes.split(",");
```

### ConstantValue
Condition `rotation != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationFreeText.java`
#### Snippet
```java
        initCallout(element);
        String rotation = element.getAttribute("rotation");
        if (rotation != null && !rotation.isEmpty())
        {
            setRotation(Integer.parseInt(rotation));
```

### ConstantValue
Condition `lineEndingStyle != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationFreeText.java`
#### Snippet
```java
        initFringe(element);
        String lineEndingStyle = element.getAttribute("head");
        if (lineEndingStyle != null && !lineEndingStyle.isEmpty())
        {
            setLineEndingStyle(lineEndingStyle);
```

### ConstantValue
Condition `callout != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationFreeText.java`
#### Snippet
```java
    {
        String callout = element.getAttribute("callout");
        if (callout != null && !callout.isEmpty())
        {
            String[] calloutValues = callout.split(",");
```

### ConstantValue
Condition `fringe != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationFreeText.java`
#### Snippet
```java
    {
        String fringe = element.getAttribute("fringe");
        if (fringe != null && !fringe.isEmpty())
        {
            String[] fringeValues = fringe.split(",");
```

### ConstantValue
Value `firstException` is always 'null'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/PDDocument.java`
#### Snippet
```java
            if (signingSupport != null)
            {
                firstException = IOUtils.closeAndLogException(signingSupport, LOG, "SigningSupport", firstException);
            }

```

### ConstantValue
Condition `base64EncodedAppearance != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationStamp.java`
#### Snippet
```java
            return;
        }
        if (base64EncodedAppearance != null && !base64EncodedAppearance.isEmpty())
        {
            LOG.debug("Decoded XML: " + new String(decodedAppearanceXML));
```

### ConstantValue
Condition `startCoords == null` is always `false`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationLine.java`
#### Snippet
```java

        String startCoords = element.getAttribute("start");
        if (startCoords == null || startCoords.isEmpty())
        {
            throw new IOException("Error: missing attribute 'start'");
```

### ConstantValue
Condition `endCoords == null` is always `false`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationLine.java`
#### Snippet
```java
        }
        String endCoords = element.getAttribute("end");
        if (endCoords == null || endCoords.isEmpty())
        {
            throw new IOException("Error: missing attribute 'end'");
```

### ConstantValue
Condition `leaderLine != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationLine.java`
#### Snippet
```java

        String leaderLine = element.getAttribute("leaderLength");
        if (leaderLine != null && !leaderLine.isEmpty())
        {
            setLeaderLength(Float.parseFloat(leaderLine));
```

### ConstantValue
Condition `leaderLineExtension != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationLine.java`
#### Snippet
```java

        String leaderLineExtension = element.getAttribute("leaderExtend");
        if (leaderLineExtension != null && !leaderLineExtension.isEmpty())
        {
            setLeaderExtend(Float.parseFloat(leaderLineExtension));
```

### ConstantValue
Condition `leaderLineOffset != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationLine.java`
#### Snippet
```java

        String leaderLineOffset = element.getAttribute("leaderOffset");
        if (leaderLineOffset != null && !leaderLineOffset.isEmpty())
        {
            setLeaderOffset(Float.parseFloat(leaderLineOffset));
```

### ConstantValue
Condition `startStyle != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationLine.java`
#### Snippet
```java

        String startStyle = element.getAttribute("head");
        if (startStyle != null && !startStyle.isEmpty())
        {
            setStartPointEndingStyle(startStyle);
```

### ConstantValue
Condition `endStyle != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationLine.java`
#### Snippet
```java
        }
        String endStyle = element.getAttribute("tail");
        if (endStyle != null && !endStyle.isEmpty())
        {
            setEndPointEndingStyle(endStyle);
```

### ConstantValue
Condition `color != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationLine.java`
#### Snippet
```java

        String color = element.getAttribute("interior-color");
        if (color != null && color.length() == 7 && color.charAt(0) == '#')
        {
            int colorValue = Integer.parseInt(color.substring(1, 7), 16);
```

### ConstantValue
Condition `caption != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationLine.java`
#### Snippet
```java

        String caption = element.getAttribute("caption");
        if (caption != null && !caption.isEmpty())
        {
            setCaption("yes".equals(caption));
```

### ConstantValue
Condition `captionH != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationLine.java`
#### Snippet
```java

        String captionH = element.getAttribute("caption-offset-h");
        if (captionH != null && !captionH.isEmpty())
        {
            setCaptionHorizontalOffset(Float.parseFloat(captionH));
```

### ConstantValue
Condition `captionV != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationLine.java`
#### Snippet
```java

        String captionV = element.getAttribute("caption-offset-v");
        if (captionV != null && !captionV.isEmpty())
        {
            setCaptionVerticalOffset(Float.parseFloat(captionV));
```

### ConstantValue
Condition `captionStyle != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationLine.java`
#### Snippet
```java

        String captionStyle = element.getAttribute("caption-style");
        if (captionStyle != null && !captionStyle.isEmpty())
        {
            setCaptionStyle(captionStyle);
```

### ConstantValue
Value `nil` is always 'null'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/color/PDIndexed.java`
#### Snippet
```java
        for (int i = 0, n = actualMaxIndex; i <= n; i++)
        {
            rgbColorTable[i] = rgbRaster.getPixel(i, 0, nil);
        }
    }
```

### ConstantValue
Condition `'\u0000' <= ch` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/SaslPrep.java`
#### Snippet
```java
    private static boolean asciiControl(char ch)
    {
        return '\u0000' <= ch && ch <= '\u001F' || ch == '\u007F';
    }

```

### ConstantValue
Condition `startOpIdx != -1` is always `true` when reached
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/PDFStreamParser.java`
#### Snippet
```java

            // PDFBOX-3742: just assuming that 1-3 non blanks is a PDF operator isn't enough
            if (endOpIdx != -1 && startOpIdx != -1)
            {
                // usually, the operator here is Q, sometimes EMC (PDFBOX-2376), S (PDFBOX-3784).
```

### ConstantValue
Condition `startOpIdx != -1` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/PDFStreamParser.java`
#### Snippet
```java
                    endOpIdx = MAX_BIN_CHAR_TEST_LENGTH;
                }
                if (endOpIdx != -1 && startOpIdx != -1 && endOpIdx - startOpIdx > 3)
                {
                    noBinData = false;
```

### ConstantValue
Condition `!(object instanceof COSBase)` is always `false`
in `pdfbox/src/main/java/org/apache/pdfbox/pdfwriter/compress/COSWriterObjectStream.java`
#### Snippet
```java
            return;
        }
        if (!(object instanceof COSBase))
        {
            throw new IOException("Error: Unknown type in object stream:" + object);
```

### ConstantValue
Condition `other.color != null` is always `true`
in `pdfbox/src/main/java/org/apache/pdfbox/rendering/TilingPaintFactory.java`
#### Snippet
```java
            try
            {
                if (this.color != null && other.color != null &&
                    this.color != other.color && this.color.toRGB() != other.color.toRGB())
                {
```

### ConstantValue
Condition `codepoint > Integer.MAX_VALUE` is always `false`
in `fontbox/src/main/java/org/apache/fontbox/ttf/CmapSubtable.java`
#### Snippet
```java

                    long codepoint = (lead << 10) + trail + SURROGATE_OFFSET;
                    if (codepoint > Integer.MAX_VALUE)
                    {
                        throw new IOException("[Sub Format 8] Invalid character code " + codepoint);
```

### ConstantValue
Condition `glyphIndex > Integer.MAX_VALUE` is always `false` when reached
in `fontbox/src/main/java/org/apache/fontbox/ttf/CmapSubtable.java`
#### Snippet
```java

                long glyphIndex = startGlyph + (j - firstCode);
                if (glyphIndex > numGlyphs || glyphIndex > Integer.MAX_VALUE)
                {
                    throw new IOException("CMap contains an invalid glyph index");
```

### ConstantValue
Value `useStrictMode` is always 'false'
in `fontbox/src/main/java/org/apache/fontbox/cmap/CMapParser.java`
#### Snippet
```java
            }
            data[position] = 0;
            increment(data, position - 1, useStrictMode);
        }
        else
```

### ConstantValue
Result of `sourcePage - 1` is always '0'
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/SuperimposePage.java`
#### Snippet
```java
                    // Create a Form XObject from the source document using LayerUtility
                    LayerUtility layerUtility = new LayerUtility(doc);
                    PDFormXObject form = layerUtility.importPageAsForm(sourceDoc, sourcePage - 1);
                    
                    // draw the full form
```

### ConstantValue
Condition `ve.pageNumber != null` is always `true`
in `preflight/src/main/java/org/apache/pdfbox/preflight/ValidationResult.java`
#### Snippet
```java
                    return false;
                }
                else if (pageNumber != null && ve.pageNumber != null
                        && pageNumber.compareTo(ve.pageNumber) != 0)
                {
```

### ConstantValue
Value `derObjCrlDP` is always 'null'
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/CRLVerifier.java`
#### Snippet
```java
            LOG.warn("CRL distribution points for certificate subject " +
                    cert.getSubjectX500Principal().getName() +
                    " should be an octet string, but is " + derObjCrlDP);
            return new ArrayList<>();
        }
```

### ConstantValue
Condition `isEqual` at the left side of assignment expression is always `true`. Can be simplified
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/TrailerValidationProcess.java`
#### Snippet
```java
                    oneIsEquals = ((COSString) ol).getString().equals(ofString);
                }
                isEqual &= oneIsEquals;
                if (!isEqual)
                {
```

## RuleId[id=SuspiciousNameCombination]
### SuspiciousNameCombination
'height' should probably not be assigned to 'x'
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/ImageUtil.java`
#### Snippet
```java
                return image;
            case 90:
                x = height;
                rotatedImage = new BufferedImage(height, width, image.getType());
                break;
```

### SuspiciousNameCombination
'height' should probably not be passed as parameter 'width'
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/ImageUtil.java`
#### Snippet
```java
            case 90:
                x = height;
                rotatedImage = new BufferedImage(height, width, image.getType());
                break;
            case 270:
```

### SuspiciousNameCombination
'width' should probably not be passed as parameter 'height'
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/ImageUtil.java`
#### Snippet
```java
            case 90:
                x = height;
                rotatedImage = new BufferedImage(height, width, image.getType());
                break;
            case 270:
```

### SuspiciousNameCombination
'width' should probably not be assigned to 'y'
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/ImageUtil.java`
#### Snippet
```java
                break;
            case 270:
                y = width;
                rotatedImage = new BufferedImage(height, width, image.getType());
                break;
```

### SuspiciousNameCombination
'height' should probably not be passed as parameter 'width'
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/ImageUtil.java`
#### Snippet
```java
            case 270:
                y = width;
                rotatedImage = new BufferedImage(height, width, image.getType());
                break;
            case 180:
```

### SuspiciousNameCombination
'width' should probably not be passed as parameter 'height'
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/ImageUtil.java`
#### Snippet
```java
            case 270:
                y = width;
                rotatedImage = new BufferedImage(height, width, image.getType());
                break;
            case 180:
```

### SuspiciousNameCombination
'imageWidth' should probably not be assigned to 'imageHeight'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/digitalsignature/visible/PDVisibleSignDesigner.java`
#### Snippet
```java

                temp = imageHeight;
                imageHeight = imageWidth;
                imageWidth = temp;
                break;
```

### SuspiciousNameCombination
'imageWidth' should probably not be assigned to 'imageHeight'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/digitalsignature/visible/PDVisibleSignDesigner.java`
#### Snippet
```java

                temp = imageHeight;
                imageHeight = imageWidth;
                imageWidth = temp;
                break;
```

### SuspiciousNameCombination
'heightPx' should probably not be passed as parameter 'width'
in `pdfbox/src/main/java/org/apache/pdfbox/rendering/PDFRenderer.java`
#### Snippet
```java
        if (rotationAngle == 90 || rotationAngle == 270)
        {
            image = new BufferedImage(heightPx, widthPx, bimType);
        }
        else
```

### SuspiciousNameCombination
'widthPx' should probably not be passed as parameter 'height'
in `pdfbox/src/main/java/org/apache/pdfbox/rendering/PDFRenderer.java`
#### Snippet
```java
        if (rotationAngle == 90 || rotationAngle == 270)
        {
            image = new BufferedImage(heightPx, widthPx, bimType);
        }
        else
```

### SuspiciousNameCombination
'xRefRangeX1' should probably not be passed as parameter 'y'
in `pdfbox/src/main/java/org/apache/pdfbox/pdfwriter/COSWriter.java`
#### Snippet
```java
            {
                long xRefRangeX1 = xRefRanges[x + 1];
                writeXrefRange(xRefRanges[x], xRefRangeX1);

                for (int i = 0; i < xRefRangeX1; ++i)
```

### SuspiciousNameCombination
'lineWidth' should probably not be passed as parameter 'y'
in `examples/src/main/java/org/apache/pdfbox/examples/interactive/form/CreateCheckBox.java`
#### Snippet
```java
            }

            yesAPCS.addRect(lineWidth, lineWidth, rect.getWidth() - lineWidth * 2, rect.getHeight() - lineWidth * 2);
            yesAPCS.clip();

```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFField.java`
#### Snippet
```java
        else if (value instanceof List)
        {
            List<String> items = (List<String>) value;
            for (String item : items)
            {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFField.java`
#### Snippet
```java
        if (value instanceof List)
        {
            cos = COSArray.ofCOSStrings((List<String>) value);
        }
        else if (value instanceof String)
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.apache.pdfbox.pdmodel.common.COSDictionaryMap'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/COSDictionaryMap.java`
#### Snippet
```java
        if( o instanceof COSDictionaryMap )
        {
            COSDictionaryMap<K, V> other = (COSDictionaryMap<K, V>) o;
            retval = other.map.equals( this.map );
        }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.List\>' to 'java.util.List'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/PDStream.java`
#### Snippet
```java
        else if (filters instanceof COSArray)
        {
            return (List<COSName>)((COSArray) filters).toList();
        }
        return Collections.emptyList();
```

### UNCHECKED_WARNING
Unchecked assignment: '? extends org.apache.pdfbox.pdmodel.encryption.SecurityHandler' to 'org.apache.pdfbox.pdmodel.encryption.SecurityHandler'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/SecurityHandlerFactory.java`
#### Snippet
```java
            Constructor<? extends SecurityHandler> ctor =
                    handlerClass.getDeclaredConstructor(argsClasses);
            return ctor.newInstance(args);
        }
        catch(NoSuchMethodException | IllegalAccessException | InstantiationException |
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/SecurityProvider.java`
#### Snippet
```java
            try
            {
                Class<Provider> providerClass = (Class<Provider>) Class
                        .forName("org.bouncycastle.jce.provider.BouncyCastleProvider");
                provider = providerClass.getDeclaredConstructor().newInstance();
            }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFFont.java`
#### Snippet
```java
    public List<Number> getFontMatrix()
    {
        return (List<Number>) topDict.get("FontMatrix");
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFFont.java`
#### Snippet
```java
    public BoundingBox getFontBBox() throws IOException
    {
        List<Number> numbers = (List<Number>) topDict.get("FontBBox");
        if (numbers.size() < 4)
        {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFParser.java`
#### Snippet
```java
            if (!fontDicts.isEmpty() && fontDicts.get(0).containsKey("FontMatrix"))
            {
                privMatrix = (List<Number>) fontDicts.get(0).get("FontMatrix");
            }
            // some malformed fonts have FontMatrix in their Font DICT, see PDFBOX-2495
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `fontbox/src/main/java/org/apache/fontbox/cmap/CMapParser.java`
#### Snippet
```java
            if (nextToken instanceof List<?>)
            {
                List<byte[]> array = (List<byte[]>) nextToken;
                // ignore empty and malformed arrays
                if (!array.isEmpty() && array.size() >= end - start)
```

### UNCHECKED_WARNING
Unchecked call to 'push(List)' as a member of raw type 'org.apache.pdfbox.preflight.font.container.FontContainer'
in `preflight/src/main/java/org/apache/pdfbox/preflight/font/descriptor/FontDescriptorHelper.java`
#### Snippet
```java
                    fontMDval.analyseFontName(xmpMeta, fontDescriptor, ve);
                    fontMDval.analyseRights(xmpMeta, fontDescriptor, ve);
                    this.fContainer.push(ve);

                }
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `com.twelvemonkeys.imageio.metadata.exif.TIFF`
in `pdfbox/src/main/java/org/apache/pdfbox/filter/TIFFExtension.java`
#### Snippet
```java
    /**
     * For use with Photometric: 5 (Separated), when image data is in a color space other than CMYK.
     * See {@link com.twelvemonkeys.imageio.metadata.exif.TIFF#TAG_INK_NAMES InkNames} field for a
     * description of the inks to be used.
     */
```

### JavadocReference
Cannot resolve symbol `TAG_INK_NAMES`
in `pdfbox/src/main/java/org/apache/pdfbox/filter/TIFFExtension.java`
#### Snippet
```java
    /**
     * For use with Photometric: 5 (Separated), when image data is in a color space other than CMYK.
     * See {@link com.twelvemonkeys.imageio.metadata.exif.TIFF#TAG_INK_NAMES InkNames} field for a
     * description of the inks to be used.
     */
```

### JavadocReference
Cannot resolve symbol `org.bouncycastle.cms.CMSProcessableByteArray`
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CMSProcessableInputStream.java`
#### Snippet
```java
/**
 * Wraps a InputStream into a CMSProcessable object for bouncy castle. It's a memory saving
 * alternative to the {@link org.bouncycastle.cms.CMSProcessableByteArray CMSProcessableByteArray}
 * class.
 *
```

### JavadocReference
Cannot resolve symbol `CMSException`
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateEmbeddedTimeStamp.java`
#### Snippet
```java
     * @param documentBytes byte[] of the input file
     * @throws IOException
     * @throws CMSException
     * @throws NoSuchAlgorithmException
     */
```

### JavadocReference
Cannot resolve symbol `OCSPException`
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/CertificateVerifier.java`
#### Snippet
```java
     * @throws RevokedCertificateException
     * @throws IOException
     * @throws OCSPException
     * @throws CertificateVerificationException
     */
```

### JavadocReference
Cannot resolve symbol `OCSPException`
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/OcspHelper.java`
#### Snippet
```java
     * @param basicResponse Response to be checked
     * @return true if the nonce is present and matches, false if nonce is missing.
     * @throws OCSPException if the nonce is different
     */
    private boolean checkNonce(BasicOCSPResp basicResponse) throws OCSPException
```

### JavadocReference
Cannot resolve symbol `OCSPException`
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/OcspHelper.java`
#### Snippet
```java
     *
     * @throws IOException
     * @throws OCSPException
     * @throws RevokedCertificateException
     */
```

### JavadocReference
Cannot resolve symbol `OCSPException`
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/OcspHelper.java`
#### Snippet
```java
     *
     * @return OCSP request, ready to fetch data
     * @throws OCSPException
     * @throws IOException
     */
```

### JavadocReference
Cannot resolve symbol `OCSPException`
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/OcspHelper.java`
#### Snippet
```java
     * @param certificate the certificate to check the signature
     * @param basicResponse OCSP response containing the signature
     * @throws OCSPException when the signature is invalid or could not be checked
     * @throws IOException if the default security provider can't be instantiated
     */
```

### JavadocReference
Cannot resolve symbol `OCSPException`
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/OcspHelper.java`
#### Snippet
```java
     * 
     * @param ocspResponse to be verified
     * @throws OCSPException
     * @throws RevokedCertificateException
     * @throws IOException if the default security provider can't be instantiated
```

### JavadocReference
Cannot resolve symbol `OCSPException`
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/OcspHelper.java`
#### Snippet
```java
     * 
     * @param resp OCSP response
     * @throws OCSPException if the response status is not ok
     */
    public void verifyRespStatus(OCSPResp resp) throws OCSPException
```

### JavadocReference
Cannot resolve symbol `OCSPException`
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/OcspHelper.java`
#### Snippet
```java
     * @return the OCSPResp, that has been fetched from the ocspUrl
     * @throws IOException
     * @throws OCSPException
     */
    private OCSPResp performRequest(String urlString) throws IOException, OCSPException
```

### JavadocReference
Cannot resolve symbol `CMSException`
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
     * @param contents the /Contents field as a COSString
     * @param sig the PDF signature (the /V dictionary)
     * @throws CMSException
     * @throws OperatorCreationException
     * @throws GeneralSecurityException
```

### JavadocReference
Cannot resolve symbol `OperatorCreationException`
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
     * @param sig the PDF signature (the /V dictionary)
     * @throws CMSException
     * @throws OperatorCreationException
     * @throws GeneralSecurityException
     * @throws CertificateVerificationException
```

### JavadocReference
Cannot resolve symbol `org.bouncycastle.tsp.TSPException`
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
     *
     * @throws IOException If there is an error reading the file.
     * @throws org.bouncycastle.tsp.TSPException
     * @throws org.apache.pdfbox.examples.signature.cert.CertificateVerificationException
     * @throws java.security.GeneralSecurityException
```

### JavadocReference
Cannot resolve symbol `CMSException`
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
     * @param signedContentAsStream the byte sequence that has been signed
     * @param contents the /Contents field as a COSString
     * @throws CMSException
     * @throws NoSuchAlgorithmException
     * @throws IOException
```

### JavadocReference
Cannot resolve symbol `TSPException`
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
     * @throws NoSuchAlgorithmException
     * @throws IOException
     * @throws TSPException
     * @throws OperatorCreationException
     * @throws CertificateVerificationException
```

### JavadocReference
Cannot resolve symbol `OperatorCreationException`
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
     * @throws IOException
     * @throws TSPException
     * @throws OperatorCreationException
     * @throws CertificateVerificationException
     * @throws CertificateException 
```

### JavadocReference
Cannot resolve symbol `OCSPException`
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/AddValidationInformation.java`
#### Snippet
```java
     * @param certInfo the certificate info, for it to check OCSP data.
     * @throws IOException
     * @throws OCSPException
     * @throws CertificateProccessingException
     * @throws RevokedCertificateException
```

## RuleId[id=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `fontbox/src/main/java/org/apache/fontbox/ttf/GlyphRenderer.java`
#### Snippet
```java
                Point lastPoint = points[p];
                List<Point> contour = new ArrayList<>();
                for (int q = start; q <= p; ++q)
                {
                    contour.add(points[q]);
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `icon` might be null
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/PDFTreeCellRenderer.java`
#### Snippet
```java
        if (isIndirect && !isStream)
        {
            OverlayIcon overlay = new OverlayIcon(icon);
            overlay.add(ICON_INDIRECT);
            return overlay;
```

### DataFlowIssue
Variable is already assigned to this value
in `debugger/src/main/java/org/apache/pdfbox/debugger/hexviewer/AddressPane.java`
#### Snippet
```java
                g.drawString(String.format("%08X", (line - 1)*16), x, y);
            }
            x = HexView.LINE_INSET;
            y += HexView.CHAR_HEIGHT;
        }
```

### DataFlowIssue
Variable is already assigned to this value
in `debugger/src/main/java/org/apache/pdfbox/debugger/hexviewer/ASCIIPane.java`
#### Snippet
```java
                g.drawChars(chars, 0, chars.length, x, y);
            }
            x = HexView.LINE_INSET;
            y += HexView.CHAR_HEIGHT;
        }
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `debugger/src/main/java/org/apache/pdfbox/debugger/streampane/StreamPane.java`
#### Snippet
```java
            try
            {
                if (currentFilter.equals(Stream.IMAGE))
                {
                    requestImageShowing();
```

### DataFlowIssue
Argument `resourceAsStream` might be null
in `pdfbox/src/main/java/org/apache/pdfbox/util/Version.java`
#### Snippet
```java
    {
        try (InputStream resourceAsStream = Version.class.getResourceAsStream(PDFBOX_VERSION_PROPERTIES);
             InputStream is = new BufferedInputStream(resourceAsStream))
        {
            Properties properties = new Properties();
```

### DataFlowIssue
Result of 'max' is the same as the first argument making the call meaningless
in `pdfbox/src/main/java/org/apache/pdfbox/filter/DCTFilter.java`
#### Snippet
```java
                if (len >= POS_TRANSFORM + 1)
                {
                    byte[] app14 = new byte[Math.max(len, POS_TRANSFORM + 1)];
                    if (iis.read(app14) >= POS_TRANSFORM + 1)
                    {
```

### DataFlowIssue
Argument `resourceAsStream` might be null
in `pdfbox/src/main/java/org/apache/pdfbox/text/PDFTextStripper.java`
#### Snippet
```java
        String path = "/org/apache/pdfbox/resources/text/BidiMirroring.txt";
        try (InputStream resourceAsStream = PDFTextStripper.class.getResourceAsStream(path);
             InputStream input = new BufferedInputStream(resourceAsStream))
        {
            parseBidiFile(input);
```

### DataFlowIssue
Argument `next` might be null
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/PDPageTree.java`
#### Snippet
```java
            COSDictionary next = queue.poll();
            
            sanitizeType(next);

            ResourceCache resourceCache = document != null ? document.getResourceCache() : null;
```

### DataFlowIssue
Variable is already assigned to this value
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/BaseParser.java`
#### Snippet
```java
            if (nextc != -2)
            {
                c = nextc;
            }
            else
```

### DataFlowIssue
Method invocation `clone` may produce `NullPointerException`
in `pdfbox/src/main/java/org/apache/pdfbox/contentstream/PDFStreamEngine.java`
#### Snippet
```java
        Deque<PDGraphicsState> savedStack = graphicsStack;
        graphicsStack = new ArrayDeque<>(1);
        graphicsStack.add(savedStack.peek().clone());
        return savedStack;
    }
```

### DataFlowIssue
Method invocation `clone` may produce `NullPointerException`
in `pdfbox/src/main/java/org/apache/pdfbox/contentstream/PDFStreamEngine.java`
#### Snippet
```java
    public void saveGraphicsState()
    {
        graphicsStack.push(graphicsStack.peek().clone());
    }

```

### DataFlowIssue
Variable is already assigned to this value
in `fontbox/src/main/java/org/apache/fontbox/ttf/NamingTable.java`
#### Snippet
```java
                        break;
                    case 2:
                        charset = StandardCharsets.ISO_8859_1;
                        break;
                    default:
```

### DataFlowIssue
Argument `resourceAsStream` might be null
in `fontbox/src/main/java/org/apache/fontbox/ttf/OpenTypeScript.java`
#### Snippet
```java
        String path = "/org/apache/fontbox/unicode/Scripts.txt";
        try (InputStream resourceAsStream = OpenTypeScript.class.getResourceAsStream(path);
             InputStream input = new BufferedInputStream(resourceAsStream))
        {
            parseScriptsFile(input);
```

### DataFlowIssue
Argument `BengaliPdfGenerationHelloWorld.class.getResourceAsStream(TEXT_SOURCE_FILE)` might be null
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/BengaliPdfGenerationHelloWorld.java`
#### Snippet
```java

        try (BufferedReader br = new BufferedReader(new InputStreamReader(
             BengaliPdfGenerationHelloWorld.class.getResourceAsStream(TEXT_SOURCE_FILE), StandardCharsets.UTF_8)))
        {
            while (true)
```

### DataFlowIssue
Variable is already assigned to this value
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/UsingTextMatrix.java`
#### Snippet
```java
            page = new PDPage(PDRectangle.A4);
            doc.addPage(page);
            fontSize = 1.0f;

            contentStream = new PDPageContentStream(doc, page, AppendMode.OVERWRITE, false);
```

### DataFlowIssue
Method invocation `getWidgets` may produce `NullPointerException`
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature2.java`
#### Snippet
```java
                if (signature != null)
                {
                    rect = acroForm.getField(signatureFieldName).getWidgets().get(0).getRectangle();
                }
            }
```

### DataFlowIssue
Method invocation `setValue` may produce `NullPointerException`
in `examples/src/main/java/org/apache/pdfbox/examples/interactive/form/FillFormField.java`
#### Snippet
```java
                // Retrieve an individual field and set its value.
                PDTextField field = (PDTextField) acroForm.getField( "sampleField" );
                field.setValue("Text Entry");
                
                // If a field is nested within the form tree a fully qualified name
```

### DataFlowIssue
Method invocation `setValue` may produce `NullPointerException`
in `examples/src/main/java/org/apache/pdfbox/examples/interactive/form/FillFormField.java`
#### Snippet
```java
                // might be provided to access the field.
                field = (PDTextField) acroForm.getField( "fieldsContainer.nestedSampleField" );
                field.setValue("Text Entry");
            }
            
```

### DataFlowIssue
Method invocation `getWidgets` may produce `NullPointerException`
in `examples/src/main/java/org/apache/pdfbox/examples/interactive/form/AddBorderToField.java`
#### Snippet
```java
            // Note: there might be multiple widgets
            PDField field = acroForm.getField("SampleField");
            PDAnnotationWidget widget = field.getWidgets().get(0);
            
            // Create the definition for a red border
```

### DataFlowIssue
Method invocation `getClass` will produce `NullPointerException`
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/CertificateVerifier.java`
#### Snippet
```java
        if (!(asn1Prim instanceof ASN1Sequence))
        {
            LOG.warn("ASN1Sequence expected, got " + asn1Prim.getClass().getSimpleName());
            return resultSet;
        }
```

### DataFlowIssue
Method invocation `getWidgets` may produce `NullPointerException`
in `examples/src/main/java/org/apache/pdfbox/examples/interactive/form/DetermineTextFitsField.java`
#### Snippet
```java
            // Note: there might be multiple widgets
            PDField field = acroForm.getField("SampleField");
            PDAnnotationWidget widget = field.getWidgets().get(0);
            
            // Get the width of the fields box
```

### DataFlowIssue
Method invocation `getFont` may produce `NullPointerException`
in `examples/src/main/java/org/apache/pdfbox/examples/interactive/form/DetermineTextFitsField.java`
#### Snippet
```java
            if (font == null)
            {
                font = acroForm.getDefaultResources().getFont(fontName);
            }
            
```

### DataFlowIssue
Method invocation `getCharMetrics` may produce `NullPointerException`
in `examples/src/main/java/org/apache/pdfbox/examples/interactive/form/CreateCheckBox.java`
#### Snippet
```java
                // ZapfDingbats font may be missing or substituted, let's use AFM resources instead.
                FontMetrics metric = Standard14Fonts.getAFM(FontName.ZAPF_DINGBATS.getName());
                for (CharMetric cm : metric.getCharMetrics())
                {
                    // The caption is not unicode, but the Zapf Dingbats code in the PDF.
```

### DataFlowIssue
Method invocation `getWidgets` may produce `NullPointerException`
in `examples/src/main/java/org/apache/pdfbox/examples/interactive/form/FieldTriggers.java`
#### Snippet
```java
            // Note: there might be multiple widgets
            PDField field = acroForm.getField("SampleField");
            PDAnnotationWidget widget = field.getWidgets().get(0);
            
            // Some of the actions are available to the widget, some are available to the form field.
```

### DataFlowIssue
Argument `firstTrailer` might be null
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/TrailerValidationProcess.java`
#### Snippet
```java
            }

            checkMainTrailer(ctx, firstTrailer);
            if (!compareIds(firstTrailer, lastTrailer))
            {
```

### DataFlowIssue
Argument `lastTrailer` might be null
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/TrailerValidationProcess.java`
#### Snippet
```java

            checkMainTrailer(ctx, firstTrailer);
            if (!compareIds(firstTrailer, lastTrailer))
            {
                addValidationError(ctx, new ValidationError(PreflightConstants.ERROR_SYNTAX_TRAILER_ID_CONSISTENCY,
```

### DataFlowIssue
Argument `last` might be null
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/TrailerValidationProcess.java`
#### Snippet
```java
            COSDictionary last = ctx.getXrefTrailerResolver().getLastTrailer();
            checkMainTrailer(ctx, first);
            if (!compareIds(first, last))
            {
                addValidationError(ctx, new ValidationError(PreflightConstants.ERROR_SYNTAX_TRAILER_ID_CONSISTENCY,
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'objects.stream()' call
in `pdfbox/src/main/java/org/apache/pdfbox/cos/COSArray.java`
#### Snippet
```java
    public List<String> toCOSNameStringList()
    {
        return StreamSupport.stream(objects.spliterator(), false) //
                .map(o -> ((COSName) o).getName()) //
                .collect(Collectors.toList());
```

### SimplifyStreamApiCallChains
Can be replaced with 'objects.stream()' call
in `pdfbox/src/main/java/org/apache/pdfbox/cos/COSArray.java`
#### Snippet
```java
    public List<String> toCOSStringStringList()
    {
        return StreamSupport.stream(objects.spliterator(), false) //
                .map(o -> ((COSString) o).getString()) //
                .collect(Collectors.toList());
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/COSParser.java`
#### Snippet
```java
                objectStreamObject = allStreamObjects.remove(key);
                allStreamObjects.entrySet().stream()
                        .forEach(e -> streamObjects.putIfAbsent(e.getKey(), e.getValue()));
            }
            catch (IOException ex)
```

### SimplifyStreamApiCallChains
'Stream.noneMatch(x -\> !(...))' can be replaced with 'allMatch()'
in `pdfbox/src/main/java/org/apache/pdfbox/rendering/PageDrawer.java`
#### Snippet
```java
        if (COSName.ANY_OFF.equals(visibilityPolicy))
        {
            return visibles.stream().noneMatch(v -> !v);
        }

```

### SimplifyStreamApiCallChains
Can be replaced with 'max()'
in `examples/src/main/java/org/apache/pdfbox/examples/signature/SigUtils.java`
#### Snippet
```java
                document.getSignatureDictionaries().stream().
                sorted(comparatorByOffset.reversed()).
                findFirst();
        if (optLastSignature.isPresent())
        {
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Can be replaced with 'String.valueOf()'
in `pdfbox/src/main/java/org/apache/pdfbox/text/LegacyPDFStreamEngine.java`
#### Snippet
```java
            {
                char c = (char) code;
                unicode = new String(new char[] { c });
            }
            else
```

### StringOperationCanBeSimplified
Can be replaced with 'String.valueOf()'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/PDFont.java`
#### Snippet
```java
                // PDFBOX-3123: do this only if the /ToUnicode entry is a name
                // PDFBOX-4322: identity streams are OK too
                return new String(new char[] { (char) code });
            }
            else
```

### StringOperationCanBeSimplified
`substring()` call can be replaced with 'charAt()'
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/EmbeddedMultipleFonts.java`
#### Snippet
```java
            if (!found)
            {
                throw new IllegalArgumentException("Could not show '" + text.substring(i, i + 1)
                        + "' with the fonts provided");
            }
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'appendRawCommands' is still used
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/PDPageContentStream.java`
#### Snippet
```java
     */
    @Deprecated
    public void appendRawCommands(byte[] commands) throws IOException
    {
        writeBytes(commands);
```

## RuleId[id=RedundantComparatorComparing]
### RedundantComparatorComparing
'Entry.comparingByValue()' can be used instead
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/StreamValidationProcess.java`
#### Snippet
```java
        List<COSObjectKey> objectKeys = cosDocument.getXrefTable().entrySet().stream() //
                .filter(e -> e.getValue() > 0L) //
                .sorted(Comparator.comparing(Entry::getValue)) //
                .map(Entry::getKey) //
                .collect(Collectors.toList());
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `fontbox/src/main/java/org/apache/fontbox/ttf/gsub/GsubWorkerFactory.java`
#### Snippet
```java
    public GsubWorker getGsubWorker(CmapLookup cmapLookup, GsubData gsubData)
    {
        switch (gsubData.getLanguage())
        {
        case BENGALI:
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `preflight/src/main/java/org/apache/pdfbox/preflight/utils/FilterHelper.java`
#### Snippet
```java
    {
        PreflightDocument preflightDocument = context.getDocument();
        switch (preflightDocument.getSpecification())
        {
        case PDF_A1A:
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'contains()' check
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/RecentFiles.java`
#### Snippet
```java
    public void removeFile(String path)
    {
        if (filePaths.contains(path))
        {
            filePaths.remove(path);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `debugger/src/main/java/org/apache/pdfbox/debugger/PDFDebugger.java`
#### Snippet
```java
            PDViewerPreferences vp = document.getDocumentCatalog().getViewerPreferences();
            if (vp != null && vp.getDuplex() != null)
            {
                String dp = vp.getDuplex();
                if (PDViewerPreferences.DUPLEX.DuplexFlipLongEdge.toString().equals(dp))
                {
                    pras.add(Sides.TWO_SIDED_LONG_EDGE);
                }
                else if (PDViewerPreferences.DUPLEX.DuplexFlipShortEdge.toString().equals(dp))
                {
                    pras.add(Sides.TWO_SIDED_SHORT_EDGE);
                }
                else if (PDViewerPreferences.DUPLEX.Simplex.toString().equals(dp))
                {
                    pras.add(Sides.ONE_SIDED);
                }
            }
```

### DuplicatedCode
Duplicated code
in `debugger/src/main/java/org/apache/pdfbox/debugger/colorpane/CSIndexed.java`
#### Snippet
```java
        scrollPane.setAlignmentX(Component.LEFT_ALIGNMENT);

        Box box = Box.createVerticalBox();
        box.add(colorCountLabel);
        box.add(scrollPane);
        box.setAlignmentX(Component.LEFT_ALIGNMENT);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 0.05;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.PAGE_START;

        panel.add(colorspaceLabelPanel, gbc);

        gbc.gridy = 2;
        gbc.weighty=0.9;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.BELOW_BASELINE;

        panel.add(box, gbc);
```

### DuplicatedCode
Duplicated code
in `debugger/src/main/java/org/apache/pdfbox/debugger/flagbitspane/FlagBitsPaneView.java`
#### Snippet
```java
        Box box = Box.createVerticalBox();
        box.add(flagValueLabel);
        box.add(scrollPane);
        box.setAlignmentX(Component.LEFT_ALIGNMENT);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 0.05;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.PAGE_START;

        panel.add(flagLabelPanel, gbc);

        gbc.gridy = 2;
        gbc.weighty = 0.9;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.BELOW_BASELINE;

        panel.add(box, gbc);
```

### DuplicatedCode
Duplicated code
in `debugger/src/main/java/org/apache/pdfbox/debugger/fontencodingpane/FontEncodingView.java`
#### Snippet
```java
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 0.05;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.PAGE_START;

        panel.add(headerPanel, gbc);

        gbc.gridy = 2;
        gbc.weighty = 0.9;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.BELOW_BASELINE;

        panel.add(scrollPane, gbc);
```

### DuplicatedCode
Duplicated code
in `debugger/src/main/java/org/apache/pdfbox/debugger/fontencodingpane/FontEncodingView.java`
#### Snippet
```java
                BufferedImage cellImage = new BufferedImage(
                        (int) (cellRect.getWidth() * DEFAULT_TRANSFORM.getScaleX()),
                        (int) (cellRect.getHeight() * DEFAULT_TRANSFORM.getScaleY()),
                        BufferedImage.TYPE_INT_RGB);
                Graphics2D g = (Graphics2D) cellImage.getGraphics();
                g.setBackground(Color.white);
                g.clearRect(0, 0, cellImage.getWidth(), cellImage.getHeight());
```

### DuplicatedCode
Duplicated code
in `debugger/src/main/java/org/apache/pdfbox/debugger/hexviewer/ASCIIPane.java`
#### Snippet
```java
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHints(HexView.RENDERING_HINTS);
        
        Rectangle bound = getVisibleRect();

        int x = HexView.LINE_INSET;
        int y = bound.y;

        if (y == 0 || y%HexView.CHAR_HEIGHT != 0)
        {
            y += HexView.CHAR_HEIGHT - y%HexView.CHAR_HEIGHT;
        }
        int firstLine = y/HexView.CHAR_HEIGHT;
```

### DuplicatedCode
Duplicated code
in `debugger/src/main/java/org/apache/pdfbox/debugger/hexviewer/HexPane.java`
#### Snippet
```java
        int x = HexView.LINE_INSET;
        int y = bound.y;
        if (y == 0 || y% HexView.CHAR_HEIGHT != 0)
        {
            y += HexView.CHAR_HEIGHT - y% HexView.CHAR_HEIGHT;
        }
        int firstLine = y/ HexView.CHAR_HEIGHT;
```

### DuplicatedCode
Duplicated code
in `debugger/src/main/java/org/apache/pdfbox/debugger/pagepane/DebugTextOverlay.java`
#### Snippet
```java
                float translateX = 0;
                float translateY = 0;
                switch (rotationAngle)
                {
                    case 90:
                        translateX = cropBox.getHeight();
                        break;
                    case 270:
                        translateY = cropBox.getWidth();
                        break;
                    case 180:
                        translateX = cropBox.getWidth();
                        translateY = cropBox.getHeight();
                        break;
                    default:
                        break;
                }
                graphics.translate(translateX, translateY);
```

### DuplicatedCode
Duplicated code
in `debugger/src/main/java/org/apache/pdfbox/debugger/pagepane/DebugTextOverlay.java`
#### Snippet
```java
                glyphBBox.setLowerLeftX(Math.max(fontBBox.getLowerLeftX(), glyphBBox.getLowerLeftX()));
                glyphBBox.setLowerLeftY(Math.max(fontBBox.getLowerLeftY(), glyphBBox.getLowerLeftY()));
                glyphBBox.setUpperRightX(Math.min(fontBBox.getUpperRightX(), glyphBBox.getUpperRightX()));
                glyphBBox.setUpperRightY(Math.min(fontBBox.getUpperRightY(), glyphBBox.getUpperRightY()));
                path = glyphBBox.toGeneralPath();
```

### DuplicatedCode
Duplicated code
in `debugger/src/main/java/org/apache/pdfbox/debugger/pagepane/DebugTextOverlay.java`
#### Snippet
```java
                if (!font.isEmbedded() && !font.isVertical() && !font.isStandard14() && font.hasExplicitWidth(code))
                {
                    float fontWidth = font.getWidthFromFont(code);
                    if (fontWidth > 0 && // ignore spaces
                            Math.abs(fontWidth - displacement.getX() * 1000) > 0.0001)
                    {
                        float pdfWidth = displacement.getX() * 1000;
                        at.scale(pdfWidth / fontWidth, 1);
                    }
                }
```

### DuplicatedCode
Duplicated code
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/ImageTypeMenu.java`
#### Snippet
```java
        rgbItem = new JRadioButtonMenuItem();
        argbItem = new JRadioButtonMenuItem();
        grayItem = new JRadioButtonMenuItem();
        bitonalItem = new JRadioButtonMenuItem();
        rgbItem.setSelected(true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rgbItem);
        bg.add(argbItem);
        bg.add(grayItem);
        bg.add(bitonalItem);

        rgbItem.setText(IMAGETYPE_RGB);
        argbItem.setText(IMAGETYPE_ARGB);
        grayItem.setText(IMAGETYPE_GRAY);
        bitonalItem.setText(IMAGETYPE_BITONAL);
        
        menu.add(rgbItem);
        menu.add(argbItem);
        menu.add(grayItem);
        menu.add(bitonalItem);

        return menu;
```

### DuplicatedCode
Duplicated code
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/RenderDestinationMenu.java`
#### Snippet
```java
        exportItem = new JRadioButtonMenuItem();
        printItem = new JRadioButtonMenuItem();
        viewItem = new JRadioButtonMenuItem();
        exportItem.setSelected(true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(exportItem);
        bg.add(printItem);
        bg.add(viewItem);

        exportItem.setText(RENDER_DESTINATION_EXPORT);
        printItem.setText(RENDER_DESTINATION_PRINT);
        viewItem.setText(RENDER_DESTINATION_VIEW);
        
        menu.add(exportItem);
        menu.add(printItem);
        menu.add(viewItem);

        return menu;
```

### DuplicatedCode
Duplicated code
in `examples/src/main/java/org/apache/pdfbox/examples/interactive/form/CreateMultiWidgetsForm.java`
#### Snippet
```java
            PDPage page2 = new PDPage(PDRectangle.A4);
            document.addPage(page2);
            
            // Adobe Acrobat uses Helvetica as a default font and
            // stores that under the name '/Helv' in the resources dictionary
            PDFont font = new PDType1Font(FontName.HELVETICA);
            PDResources resources = new PDResources();
            resources.put(COSName.HELV, font);
            
            // Add a new AcroForm and add that to the document
            PDAcroForm acroForm = new PDAcroForm(document);
            document.getDocumentCatalog().setAcroForm(acroForm);
            
            // Add and set the resources and default appearance at the form level
            acroForm.setDefaultResources(resources);
            
            // Acrobat sets the font size on the form level to be
            // auto sized as default. This is done by setting the font size to '0'
            String defaultAppearanceString = "/Helv 0 Tf 0 g";
            acroForm.setDefaultAppearance(defaultAppearanceString);
```

### DuplicatedCode
Duplicated code
in `examples/src/main/java/org/apache/pdfbox/examples/interactive/form/CreateRadioButtons.java`
#### Snippet
```java
        float magic = r * 0.551784f;
        cs.moveTo(x, y + r);
        cs.curveTo(x + magic, y + r, x + r, y + magic, x + r, y);
        cs.curveTo(x + r, y - magic, x + magic, y - r, x, y - r);
        cs.curveTo(x - magic, y - r, x - r, y - magic, x - r, y);
        cs.curveTo(x - r, y + magic, x - magic, y + r, x, y + r);
        cs.closePath();
```

### DuplicatedCode
Duplicated code
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/CreatePortableCollection.java`
#### Snippet
```java
            PDEmbeddedFile ef1 = new PDEmbeddedFile(doc, new ByteArrayInputStream(data1), COSName.FLATE_DECODE);
            //now lets some of the optional parameters
            ef1.setSubtype("text/plain");
            ef1.setSize(data1.length);
            ef1.setCreationDate(new GregorianCalendar());

            // use both methods for backwards, cross-platform and cross-language compatibility.
            fs1.setEmbeddedFile(ef1);
            fs1.setEmbeddedFileUnicode(ef1);
```

### DuplicatedCode
Duplicated code
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/CreatePortableCollection.java`
#### Snippet
```java
            List<PDEmbeddedFilesNameTreeNode> kids = new ArrayList<>();
            kids.add(treeNode);
            efTree.setKids(kids);

            // add the tree to the document catalog
            PDDocumentNameDictionary names = new PDDocumentNameDictionary(doc.getDocumentCatalog());
            names.setEmbeddedFiles(efTree);
            doc.getDocumentCatalog().setNames(names);

            // show attachments panel in some viewers 
            doc.getDocumentCatalog().setPageMode(PageMode.USE_ATTACHMENTS);
```

### DuplicatedCode
Duplicated code
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/CreatePortableCollection.java`
#### Snippet
```java
            COSDictionary ciDict1 = new COSDictionary();
            ciDict1.setItem(COSName.TYPE, COSName.COLLECTION_ITEM);
            // use the field names from earlier
            ciDict1.setString("fieldone", fs1.getFileDescription());
            ciDict1.setString("fieldtwo", fs1.getFile());
            ciDict1.setInt("fieldthree", fs1.getEmbeddedFile().getSize());
            fs1.getCOSObject().setItem(COSName.CI, ciDict1);
```

### DuplicatedCode
Duplicated code
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/HelloWorld.java`
#### Snippet
```java
            try (PDPageContentStream contents = new PDPageContentStream(doc, page))
            {
                contents.beginText();
                contents.setFont(font, 12);
                contents.newLineAtOffset(100, 700);
                contents.showText(message);
                contents.endText();
            }
            
            doc.save(filename);
```

### DuplicatedCode
Duplicated code
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/UsingTextMatrix.java`
#### Snippet
```java
            contentStream.endText();
            contentStream.close();

            // Page 2
            page = new PDPage(PDRectangle.A4);
            doc.addPage(page);
            fontSize = 1.0f;

            contentStream = new PDPageContentStream(doc, page, AppendMode.OVERWRITE, false);
            contentStream.setFont( font, fontSize );
            contentStream.beginText();
```

### DuplicatedCode
Duplicated code
in `examples/src/main/java/org/apache/pdfbox/examples/printing/OpaquePDFRenderer.java`
#### Snippet
```java
            if (operands.isEmpty())
            {
                throw new MissingOperandException(operator, operands);
            }
            COSBase base0 = operands.get(0);
            if (!(base0 instanceof COSName))
            {
                return;
            }
            COSName objectName = (COSName) base0;
            PDFGraphicsStreamEngine context = getGraphicsContext();
            PDXObject xobject = context.getResources().getXObject(objectName);
```

### DuplicatedCode
Duplicated code
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
            if (acroForm != null && acroForm.getNeedAppearances())
            {
                // PDFBOX-3738 NeedAppearances true results in visible signature becoming invisible 
                // with Adobe Reader
                if (acroForm.getFields().isEmpty())
                {
                    // we can safely delete it if there are no fields
                    acroForm.getCOSObject().removeItem(COSName.NEED_APPEARANCES);
                    // note that if you've set MDP permissions, the removal of this item
                    // may result in Adobe Reader claiming that the document has been changed.
                    // and/or that field content won't be displayed properly.
                    // ==> decide what you prefer and adjust your code accordingly.
                }
                else
                {
                    System.out.println("/NeedAppearances is set, signature may be ignored by Adobe Reader");
                }
            }

            // default filter
            signature.setFilter(PDSignature.FILTER_ADOBE_PPKLITE);

            // subfilter for basic and PAdES Part 2 signatures
            signature.setSubFilter(PDSignature.SUBFILTER_ADBE_PKCS7_DETACHED);
```

### DuplicatedCode
Duplicated code
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
if (isExternalSigning())
            {
                ExternalSigningSupport externalSigning = doc.saveIncrementalForExternalSigning(fos);
                // invoke external signature service
                byte[] cmsSignature = sign(externalSigning.getContent());

                // Explanation of late external signing (off by default):
                // If you want to add the signature in a separate step, then set an empty byte array
                // and call signature.getByteRange() and remember the offset signature.getByteRange()[1]+1.
                // you can write the ascii hex signature at a later time even if you don't have this
                // PDDocument object anymore, with classic java file random access methods.
                // If you can't remember the offset value from ByteRange because your context has changed,
                // then open the file with PDFBox, find the field with findExistingSignature() or
                // PDDocument.getLastSignatureDictionary() and get the ByteRange from there.
                // Close the file and then write the signature as explained earlier in this comment.
                if (isLateExternalSigning())
                {
                    // this saves the file with a 0 signature
                    externalSigning.setSignature(new byte[0]);

                    // remember the offset (add 1 because of "<")
                    int offset = signature.getByteRange()[1] + 1;

                    // now write the signature at the correct offset without any PDFBox methods
                    try (RandomAccessFile raf = new RandomAccessFile(signedFile, "rw"))
                    {
                        raf.seek(offset);
                        raf.write(Hex.getBytes(cmsSignature));
                    }
                }
                else
                {
                    // set signature bytes received from the service and save the file
                    externalSigning.setSignature(cmsSignature);
                }
            }
            else
            {
                // write incremental (only for signing purpose)
                doc.saveIncremental(fos);
            }
```

### DuplicatedCode
Duplicated code
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
        if (acroForm != null)
        {
            signatureField = (PDSignatureField) acroForm.getField(sigFieldName);
            if (signatureField != null)
            {
                // retrieve signature dictionary
                signature = signatureField.getSignature();
                if (signature == null)
                {
                    signature = new PDSignature();
                    // after solving PDFBOX-3524
                    // signatureField.setValue(signature)
                    // until then:
                    signatureField.getCOSObject().setItem(COSName.V, signature);
                }
                else
                {
                    throw new IllegalStateException("The signature field " + sigFieldName + " is already signed.");
                }
            }
        }
        return signature;
```

### DuplicatedCode
Duplicated code
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
        String tsaUrl = null;
        // External signing is needed if you are using an external signing service, e.g. to sign
        // several files at once.
        boolean externalSig = false;
        for (int i = 0; i < args.length; i++)
        {
            if ("-tsa".equals(args[i]))
            {
                i++;
                if (i >= args.length)
                {
                    usage();
                    System.exit(1);
                }
                tsaUrl = args[i];
            }
            if ("-e".equals(args[i]))
            {
                externalSig = true;
            }
        }

        File ksFile = new File(args[0]);
        KeyStore keystore = KeyStore.getInstance("PKCS12");
        char[] pin = args[1].toCharArray();
        try (InputStream is = new FileInputStream(ksFile))
        {
            keystore.load(is, pin);
        }

        File documentFile = new File(args[2]);
```

### DuplicatedCode
Duplicated code
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature2.java`
#### Snippet
```java
        for (int i = 0; i < args.length; i++)
        {
            if ("-tsa".equals(args[i]))
            {
                i++;
                if (i >= args.length)
                {
                    usage();
                    System.exit(1);
                }
                tsaUrl = args[i];
            }
            if ("-e".equals(args[i]))
            {
                externalSig = true;
            }
        }

        File ksFile = new File(args[0]);
        KeyStore keystore = KeyStore.getInstance("PKCS12");
        char[] pin = args[1].toCharArray();
        try (InputStream is = new FileInputStream(ksFile))
        {
            keystore.load(is, pin);
        }

        File documentFile = new File(args[2]);
```

### DuplicatedCode
Duplicated code
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
                                    try
                                    {
                                        if (sig.getSignDate() != null)
                                        {
                                            cert.checkValidity(sig.getSignDate().getTime());
                                            System.out.println("Certificate valid at signing time");
                                        }
                                        else
                                        {
                                            System.err.println("Certificate cannot be verified without signing time");
                                        }
                                    }
                                    catch (CertificateExpiredException ex)
                                    {
                                        System.err.println("Certificate expired at signing time");
                                    }
                                    catch (CertificateNotYetValidException ex)
                                    {
                                        System.err.println("Certificate not yet valid at signing time");
                                    }
```

### DuplicatedCode
Duplicated code
in `examples/src/main/java/org/apache/pdfbox/examples/util/DrawPrintTextLocations.java`
#### Snippet
```java
            PDType3Font t3Font = (PDType3Font) font;
            PDType3CharProc charProc = t3Font.getCharProc(code);
            if (charProc != null)
            {
                BoundingBox fontBBox = t3Font.getBoundingBox();
                PDRectangle glyphBBox = charProc.getGlyphBBox();
                if (glyphBBox != null)
                {
                    // PDFBOX-3850: glyph bbox could be larger than the font bbox
                    glyphBBox.setLowerLeftX(Math.max(fontBBox.getLowerLeftX(), glyphBBox.getLowerLeftX()));
                    glyphBBox.setLowerLeftY(Math.max(fontBBox.getLowerLeftY(), glyphBBox.getLowerLeftY()));
                    glyphBBox.setUpperRightX(Math.min(fontBBox.getUpperRightX(), glyphBBox.getUpperRightX()));
                    glyphBBox.setUpperRightY(Math.min(fontBBox.getUpperRightY(), glyphBBox.getUpperRightY()));
                    path = glyphBBox.toGeneralPath();
                }
            }
```

### DuplicatedCode
Duplicated code
in `fontbox/src/main/java/org/apache/fontbox/cff/Type1FontUtil.java`
#### Snippet
```java
        for (int i = 0; i < buffer.length; i++)
        {
            int plain = buffer[i] & 0xff;
            int cipher = plain ^ r >> 8;

            ciphertextBytes[i] = (byte) cipher;

            r = (cipher + r) * c1 + c2 & 0xffff;
        }
```

### DuplicatedCode
Duplicated code
in `fontbox/src/main/java/org/apache/fontbox/ttf/HorizontalHeaderTable.java`
#### Snippet
```java
        version = data.read32Fixed();
        ascender = data.readSignedShort();
        descender = data.readSignedShort();
        lineGap = data.readSignedShort();
        advanceWidthMax = data.readUnsignedShort();
        minLeftSideBearing = data.readSignedShort();
        minRightSideBearing = data.readSignedShort();
        xMaxExtent = data.readSignedShort();
        caretSlopeRise = data.readSignedShort();
        caretSlopeRun = data.readSignedShort();
        reserved1 = data.readSignedShort();
        reserved2 = data.readSignedShort();
        reserved3 = data.readSignedShort();
        reserved4 = data.readSignedShort();
        reserved5 = data.readSignedShort();
        metricDataFormat = data.readSignedShort();
        numberOfHMetrics = data.readUnsignedShort();
        initialized = true;
```

### DuplicatedCode
Duplicated code
in `fontbox/src/main/java/org/apache/fontbox/ttf/OS2WindowsMetricsTable.java`
#### Snippet
```java
        subscriptXOffset = data.readSignedShort();
        subscriptYOffset = data.readSignedShort();
        superscriptXSize = data.readSignedShort();
        superscriptYSize = data.readSignedShort();
        superscriptXOffset = data.readSignedShort();
        superscriptYOffset = data.readSignedShort();
        strikeoutSize = data.readSignedShort();
        strikeoutPosition = data.readSignedShort();
        familyClass = data.readSignedShort();
```

### DuplicatedCode
Duplicated code
in `fontbox/src/main/java/org/apache/fontbox/ttf/OpenTypeScript.java`
#### Snippet
```java
                String s = rd.readLine();
                if (s == null)
                {
                    break;
                }
                
                // ignore comments
                int comment = s.indexOf('#');
                if (comment != -1)
                {
                    s = s.substring(0, comment);
                }
                
                if (s.length() < 2)
                {
                    continue;
                }
                
                StringTokenizer st = new StringTokenizer(s, ";");
                int nFields = st.countTokens();
```

### DuplicatedCode
Duplicated code
in `fontbox/src/main/java/org/apache/fontbox/ttf/TTFSubsetter.java`
#### Snippet
```java
                    isResult = is.skip(offset - lastOff);
                    
                    if (Long.compare(isResult, offset - lastOff) != 0)
                    {
                        LOG.debug("Tried skipping " + (offset - lastOff) + " bytes but skipped only " + isResult + " bytes");
                    }

                    byte[] buf = new byte[(int)len];
                    isResult = is.read(buf);

                    if (Long.compare(isResult, len) != 0)
                    {
                        LOG.debug("Tried reading " + len + " bytes but only " + isResult + " bytes read");
                    }
```

### DuplicatedCode
Duplicated code
in `fontbox/src/main/java/org/apache/fontbox/ttf/TTFSubsetter.java`
#### Snippet
```java
                            off += 2;
                            // ARG_1_AND_2_ARE_WORDS
                            if ((flags & 1 << 0) != 0)
                            {
                                off += 2 * 2;
                            }
                            else
                            {
                                off += 2;
                            }
                            // WE_HAVE_A_TWO_BY_TWO
                            if ((flags & 1 << 7) != 0)
                            {
                                off += 2 * 4;
                            }
                            // WE_HAVE_AN_X_AND_Y_SCALE
                            else if ((flags & 1 << 6) != 0)
                            {
                                off += 2 * 2;
                            }
                            // WE_HAVE_A_SCALE
                            else if ((flags & 1 << 3) != 0)
                            {
                                off += 2;
                            }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/contentstream/operator/DrawObject.java`
#### Snippet
```java
        if (arguments.isEmpty())
        {
            throw new MissingOperandException(operator, arguments);
        }
        COSBase base0 = arguments.get(0);
        if (!(base0 instanceof COSName))
        {
            return;
        }
        COSName name = (COSName) base0;

        PDFStreamEngine context = getContext();
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/contentstream/operator/DrawObject.java`
#### Snippet
```java
        if (xobject instanceof PDFormXObject)
        {
            try
            {
                context.increaseLevel();
                if (context.getLevel() > 50)
                {
                    LOG.error("recursion is too deep, skipping form XObject");
                    return;
                }
                if (xobject instanceof PDTransparencyGroup)
                {
                    context.showTransparencyGroup((PDTransparencyGroup) xobject);
                }
                else
                {
                    context.showForm((PDFormXObject) xobject);
                }
            }
            finally
            {
                context.decreaseLevel();
            }
        }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/contentstream/operator/color/SetNonStrokingColorSpace.java`
#### Snippet
```java
        if (arguments.isEmpty())
        {
            return;
        }
        COSBase base = arguments.get(0);
        if (!(base instanceof COSName))
        {
            return;
        }
        PDFStreamEngine context = getContext();
        PDColorSpace cs = context.getResources().getColorSpace((COSName) base);
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/contentstream/operator/graphics/AppendRectangleToPath.java`
#### Snippet
```java
        if (operands.size() < 4)
        {
            throw new MissingOperandException(operator, operands);
        }
        if (!checkArrayTypesClass(operands, COSNumber.class))
        {
            return;
        }
        COSNumber x = (COSNumber) operands.get(0);
        COSNumber y = (COSNumber) operands.get(1);
        COSNumber w = (COSNumber) operands.get(2);
        COSNumber h = (COSNumber) operands.get(3);
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/contentstream/operator/graphics/CurveTo.java`
#### Snippet
```java
        if (operands.size() < 6)
        {
            throw new MissingOperandException(operator, operands);
        }
        if (!checkArrayTypesClass(operands, COSNumber.class))
        {
            return;
        }
        COSNumber x1 = (COSNumber)operands.get(0);
        COSNumber y1 = (COSNumber)operands.get(1);
        COSNumber x2 = (COSNumber)operands.get(2);
        COSNumber y2 = (COSNumber)operands.get(3);
        COSNumber x3 = (COSNumber)operands.get(4);
        COSNumber y3 = (COSNumber)operands.get(5);
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/contentstream/operator/graphics/LineTo.java`
#### Snippet
```java
        if (operands.size() < 2)
        {
            throw new MissingOperandException(operator, operands);
        }
        COSBase base0 = operands.get(0);
        if (!(base0 instanceof COSNumber))
        {
            return;
        }
        COSBase base1 = operands.get(1);
        if (!(base1 instanceof COSNumber))
        {
            return;
        }
        // append straight line segment from the current point to the point
        COSNumber x = (COSNumber) base0;
        COSNumber y = (COSNumber) base1;

        PDFGraphicsStreamEngine context = getGraphicsContext();
        Point2D.Float pos = context.transformedPoint(x.floatValue(), y.floatValue());
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/form/PDDefaultAppearanceString.java`
#### Snippet
```java
        COSBase base0 = operands.get(0);
        COSBase base1 = operands.get(1);
        if (!(base0 instanceof COSName))
        {
            return;
        }
        if (!(base1 instanceof COSNumber))
        {
            return;
        }
        COSName fontName = (COSName) base0;
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/cos/COSArray.java`
#### Snippet
```java
            if (cosBase instanceof COSObject)
            {
                // dereference object
                COSBase referencedObject = ((COSObject) cosBase).getObject();
                if (referencedObject instanceof COSDictionary)
                {
                    // descend to included dictionary to collect all included indirect objects
                    ((COSDictionary) referencedObject).getIndirectObjectKeys(indirectObjects);
                }
                else if (referencedObject instanceof COSArray)
                {
                    // descend to included array to collect all included indirect objects
                    ((COSArray) referencedObject).getIndirectObjectKeys(indirectObjects);
                }
            }
            else if (cosBase instanceof COSDictionary)
            {
                // descend to included dictionary to collect all included indirect objects
                ((COSDictionary) cosBase).getIndirectObjectKeys(indirectObjects);
            }
            else if (cosBase instanceof COSArray)
            {
                // descend to included array to collect all included indirect objects
                ((COSArray) cosBase).getIndirectObjectKeys(indirectObjects);
            }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/cos/COSStream.java`
#### Snippet
```java
        isWriting = true;
        return new FilterOutputStream(cosOut)
        {
            @Override
            public void write(byte[] b, int off, int len) throws IOException
            {
                this.out.write(b, off, len);
            }
            
            @Override
            public void close() throws IOException
            {
                super.close();
                setInt(COSName.LENGTH, (int)randomAccess.length());
                isWriting = false;
            }
        };
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/filter/ASCII85InputStream.java`
#### Snippet
```java
            do
            {
                int zz = (byte) in.read();
                if (zz == -1)
                {
                    eof = true;
                    return -1;
                }
                z = (byte) zz;
            } while (z == NEWLINE || z == RETURN || z == SPACE);
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/filter/DCTFilter.java`
#### Snippet
```java
                int cyan = 255 - r;
                int magenta = 255 - g;
                int yellow = 255 - b;

                // update new raster
                value[0] = cyan;
                value[1] = magenta;
                value[2] = yellow;
                value[3] = (int)K;
                writableRaster.setPixel(x, y, value);
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/multipdf/Overlay.java`
#### Snippet
```java
        if (defaultOverlayFilename != null)
        {
            defaultOverlay = loadPDF(defaultOverlayFilename);
        }
        if (defaultOverlay != null)
        {
            defaultOverlayPage = getLayoutPage(defaultOverlay);
        }
        // first page overlay PDF
        if (firstPageOverlayFilename != null)
        {
            firstPageOverlay = loadPDF(firstPageOverlayFilename);
        }
        if (firstPageOverlay != null)
        {
            firstPageOverlayPage = getLayoutPage(firstPageOverlay);
        }
        // last page overlay PDF
        if (lastPageOverlayFilename != null)
        {
            lastPageOverlay = loadPDF(lastPageOverlayFilename);
        }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/multipdf/Overlay.java`
#### Snippet
```java
        if (lastPageOverlay != null)
        {
            lastPageOverlayPage = getLayoutPage(lastPageOverlay);
        }
        // odd pages overlay PDF
        if (oddPageOverlayFilename != null)
        {
            oddPageOverlay = loadPDF(oddPageOverlayFilename);
        }
        if (oddPageOverlay != null)
        {
            oddPageOverlayPage = getLayoutPage(oddPageOverlay);
        }
        // even pages overlay PDF
        if (evenPageOverlayFilename != null)
        {
            evenPageOverlay = loadPDF(evenPageOverlayFilename);
        }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/multipdf/PDFCloneUtility.java`
#### Snippet
```java
        clonedVersion.put(stream, newStream);
        for (Map.Entry<COSName, COSBase> entry : stream.entrySet())
        {
            COSBase value = entry.getValue();
            if (hasSelfReference(stream, value))
            {
                newStream.setItem(entry.getKey(), newStream);
            }
            else
            {
                newStream.setItem(entry.getKey(), cloneForNewDocument(value));
            }
        }
        return newStream;
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/multipdf/PDFMergerUtility.java`
#### Snippet
```java
                        newPage.setCropBox(page.getCropBox());
                        newPage.setMediaBox(page.getMediaBox());
                        newPage.setRotation(page.getRotation());
                        PDResources resources = page.getResources();
                        if (resources != null)
                        {
                            // this is smart enough to just create references for resources that are used on multiple
                            // pages
                            newPage.setResources(new PDResources(
                                    cloner.cloneForNewDocument(resources.getCOSObject())));
                        }
                        else
                        {
                            newPage.setResources(new PDResources());
                        }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/PDFObjectStreamParser.java`
#### Snippet
```java
        long firstObjectPosition = source.getPosition() + firstObject - 1;
        for (int i = 0; i < numberOfObjects; i++)
        {
            // don't read beyond the part of the stream reserved for the object numbers
            if (source.getPosition() >= firstObjectPosition)
            {
                break;
            }
            long objectNumber = readObjectNumber();
            int offset = (int) readLong();
            objectNumbers.put(objectNumber, offset);
        }
        return objectNumbers;
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/PDAbstractContentStream.java`
#### Snippet
```java
        if (isOutsideOneInterval(c) || isOutsideOneInterval(m) || isOutsideOneInterval(y) || isOutsideOneInterval(k))
        {
            throw new IllegalArgumentException("Parameters must be within 0..1, but are "
                    + String.format("(%.2f,%.2f,%.2f,%.2f)", c, m, y, k));
        }
        writeOperand(c);
        writeOperand(m);
        writeOperand(y);
        writeOperand(k);
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/documentinterchange/logicalstructure/PDAttributeObject.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++)
        {
            if (i > 0)
            {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        return sb.append(']').toString();
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/documentinterchange/logicalstructure/PDStructureElement.java`
#### Snippet
```java
        COSBase a = this.getCOSObject().getDictionaryObject(key);
        COSArray array;
        if (a instanceof COSArray)
        {
            array = (COSArray) a;
        }
        else
        {
            array = new COSArray();
            if (a != null)
            {
                array.add(a);
                array.add(COSInteger.get(0));
            }
        }
        this.getCOSObject().setItem(key, array);
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/documentinterchange/logicalstructure/PDStructureElement.java`
#### Snippet
```java
        COSArray array;
        if (c instanceof COSArray)
        {
            array = (COSArray) c;
        }
        else
        {
            array = new COSArray();
            if (c != null)
            {
                array.add(c);
                array.add(COSInteger.get(0));
            }
        }
        this.getCOSObject().setItem(key, array);
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/PublicKeySecurityHandler.java`
#### Snippet
```java
            System.arraycopy(envelopedData, 0, sha1Input, 0, 20);

            // put each bytes of the recipients array in the sha1 input
            int sha1InputOffset = 20;
            for (byte[] recipientFieldsByte : recipientFieldsBytes)
            {
                System.arraycopy(recipientFieldsByte, 0, sha1Input, sha1InputOffset,
                        recipientFieldsByte.length);
                sha1InputOffset += recipientFieldsByte.length;
            }

            byte[] mdResult;
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/StandardSecurityHandler.java`
#### Snippet
```java
        if (encRevision == 3 || encRevision == 4)
        {
            for (int i = 0; i < 50; i++)
            {
                md.update(digest, 0, length);
                digest = md.digest();
            }
        }

        byte[] result = new byte[length];
        System.arraycopy(digest, 0, result, 0, length);
        return result;
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationCaret.java`
#### Snippet
```java
        String fringe = element.getAttribute("fringe");
        if (fringe != null && !fringe.isEmpty())
        {
            String[] fringeValues = fringe.split(",");
            if (fringeValues.length != 4)
            {
                throw new IOException("Error: wrong amount of numbers in attribute 'fringe'");
            }
            PDRectangle rect = new PDRectangle();
            rect.setLowerLeftX(Float.parseFloat(fringeValues[0]));
            rect.setLowerLeftY(Float.parseFloat(fringeValues[1]));
            rect.setUpperRightX(Float.parseFloat(fringeValues[2]));
            rect.setUpperRightY(Float.parseFloat(fringeValues[3]));
            setFringe(rect);
        }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationCircle.java`
#### Snippet
```java
        Color retval = null;
        COSArray array = annot.getCOSArray(COSName.IC);
        if (array != null)
        {
            float[] rgb = array.toFloatArray();
            if (rgb.length >= 3)
            {
                retval = new Color(rgb[0], rgb[1], rgb[2]);
            }
        }
        return retval;
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationLine.java`
#### Snippet
```java
        String actualStyle = style == null ? PDAnnotationLine.LE_NONE : style;
        COSArray array = annot.getCOSArray(COSName.LE);
        if (array == null)
        {
            array = new COSArray();
            array.add(COSName.getPDFName(actualStyle));
            array.add(COSName.getPDFName(PDAnnotationLine.LE_NONE));
            annot.setItem(COSName.LE, array);
        }
        else
        {
            array.setName(0, actualStyle);
        }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationLine.java`
#### Snippet
```java
        String actualStyle = style == null ? PDAnnotationLine.LE_NONE : style;
        COSArray array = annot.getCOSArray(COSName.LE);
        if (array == null)
        {
            array = new COSArray();
            array.add(COSName.getPDFName(PDAnnotationLine.LE_NONE));
            array.add(COSName.getPDFName(actualStyle));
            annot.setItem(COSName.LE, array);
        }
        else
        {
            array.setName(1, actualStyle);
        }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationPolygon.java`
#### Snippet
```java
            if (vertices == null || vertices.isEmpty())
            {
                throw new IOException("Error: missing element 'vertices'");
            }
            String[] verticesValues = vertices.split(",|;");
            float[] values = new float[verticesValues.length];
            for (int i = 0; i < verticesValues.length; i++)
            {
                values[i] = Float.parseFloat(verticesValues[i]);
            }
            setVertices(values);
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/PDCIDFontType0.java`
#### Snippet
```java
        if (getFontDescriptor() != null) {
            PDRectangle bbox = getFontDescriptor().getFontBoundingBox();
            if (bbox != null && (Float.compare(bbox.getLowerLeftX(),0) != 0 ||
                Float.compare(bbox.getLowerLeftY(),0) != 0 ||
                Float.compare(bbox.getUpperRightX(),0) != 0 ||
                Float.compare(bbox.getUpperRightY(),0) != 0))
            {
                return new BoundingBox(bbox.getLowerLeftX(), bbox.getLowerLeftY(),
                                          bbox.getUpperRightX(), bbox.getUpperRightY());
            }
        }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/PDType1CFont.java`
#### Snippet
```java
            if (numbers != null && numbers.size() == 6)
            {
                fontMatrix = new Matrix(
                        numbers.get(0).floatValue(), numbers.get(1).floatValue(),
                        numbers.get(2).floatValue(), numbers.get(3).floatValue(),
                        numbers.get(4).floatValue(), numbers.get(5).floatValue());
            }
            else
            {
                return super.getFontMatrix();
            }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/color/PDICCBased.java`
#### Snippet
```java
            int n = getNumberOfComponents();
            float[] decode = new float[n * 2];
            for (int i = 0; i < n; i++)
            {
                decode[i * 2] = awtColorSpace.getMinValue(i);
                decode[i * 2 + 1] = awtColorSpace.getMaxValue(i);
            }
            return decode;
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/form/PDFormXObject.java`
#### Snippet
```java
        COSArray matrix = new COSArray();
        double[] values = new double[6];
        transform.getMatrix(values);
        for (double v : values)
        {
            matrix.add(new COSFloat((float) v));
        }
        getCOSObject().setItem(COSName.MATRIX, matrix);
```

### DuplicatedCode
Duplicated code
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightStreamEngine.java`
#### Snippet
```java
        if (COSName.RGB.equals(cs))
        {
            return COSName.DEVICERGB;
        }
        if (COSName.CMYK.equals(cs))
        {
            return COSName.DEVICECMYK;
        }
        if (COSName.G.equals(cs))
        {
            return COSName.DEVICEGRAY;
        }
        return cs;
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/shading/TriangleBasedShadingContext.java`
#### Snippet
```java
                    int index = (row * w + col) * 4;
                    data[index] = value & 255;
                    value >>= 8;
                    data[index + 1] = value & 255;
                    value >>= 8;
                    data[index + 2] = value & 255;
                    data[index + 3] = 255;
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/shading/CoonsPatch.java`
#### Snippet
```java
            if (lc1 > 800 || lc2 > 800)
            {
                // keeps init value 4
            }
            else if (lc1 > 400 || lc2 > 400)
            {
                l[0] = 3;
            }
            else if (lc1 > 200 || lc2 > 200)
            {
                l[0] = 2;
            }
            else
            {
                l[0] = 1;
            }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/shading/CoonsPatch.java`
#### Snippet
```java
            if (ld1 > 800 || ld2 > 800)
            {
                // keeps init value 4
            }
            else if (ld1 > 400 || ld2 > 400)
            {
                l[1] = 3;
            }
            else if (ld1 > 200 || ld2 > 200)
            {
                l[1] = 2;
            }
            else
            {
                l[1] = 1;
            }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/shading/CoonsPatch.java`
#### Snippet
```java
                float[] paramSC = new float[numberOfColorComponents];
                for (int ci = 0; ci < numberOfColorComponents; ci++)
                {
                    paramSC[ci] = (float) ((1 - v) * ((1 - u) * cornerColor[0][ci] + u * cornerColor[3][ci])
                            + v * ((1 - u) * cornerColor[1][ci] + u * cornerColor[2][ci])); // bilinear interpolation
                }
                patchCC[i][j] = new CoordinateColorPair(tmpC, paramSC);
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/shading/PDMeshBasedShadingType.java`
#### Snippet
```java
        COSDictionary dict = getCOSObject();
        if (!(dict instanceof COSStream))
        {
            return Collections.emptyList();
        }
        PDRange rangeX = getDecodeForParameter(0);
        PDRange rangeY = getDecodeForParameter(1);
        if (rangeX == null || rangeY == null ||
            Float.compare(rangeX.getMin(), rangeX.getMax()) == 0 ||
            Float.compare(rangeY.getMin(), rangeY.getMax()) == 0)
        {
            return Collections.emptyList();
        }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/shading/PDMeshBasedShadingType.java`
#### Snippet
```java
                if (bounds == null)
                {
                    bounds = new Rectangle2D.Double(shadedTriangle.corner[0].getX(),
                            shadedTriangle.corner[0].getY(), 0, 0);
                }
                bounds.add(shadedTriangle.corner[0]);
                bounds.add(shadedTriangle.corner[1]);
                bounds.add(shadedTriangle.corner[2]);
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/action/PDActionEmbeddedGoTo.java`
#### Snippet
```java
        if (null == value)
        {
            getCOSObject().removeItem(COSName.NEW_WINDOW);
            return;
        }
        switch (value)
        {
            case USER_PREFERENCE:
                getCOSObject().removeItem(COSName.NEW_WINDOW);
                break;
            case SAME_WINDOW:
                getCOSObject().setBoolean(COSName.NEW_WINDOW, false);
                break;
            case NEW_WINDOW:
                getCOSObject().setBoolean(COSName.NEW_WINDOW, true);
                break;
            default:
                // shouldn't happen unless the enum type is changed
                break;
        }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/PDAnnotationCaret.java`
#### Snippet
```java
        COSArray margins = new COSArray();
        margins.add(new COSFloat(differenceLeft));
        margins.add(new COSFloat(differenceTop));
        margins.add(new COSFloat(differenceRight));
        margins.add(new COSFloat(differenceBottom));
        getCOSObject().setItem(COSName.RD, margins);    
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/PDAnnotationInk.java`
#### Snippet
```java
        if (array != null)
        {
            float[][] inkList = new float[array.size()][];
            for (int i = 0; i < array.size(); ++i)
            {
                COSBase base2 = array.getObject(i);
                if (base2 instanceof COSArray)
                {
                    inkList[i] = ((COSArray) base2).toFloatArray();
                }
                else
                {
                    inkList[i] = new float[0];
                }
            }
            return inkList;
        }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/PDAnnotationLine.java`
#### Snippet
```java
        String actualStyle = style == null ? PDAnnotationLine.LE_NONE : style;
        COSArray array = getCOSObject().getCOSArray(COSName.LE);
        if (array == null || array.size() == 0)
        {
            array = new COSArray();
            array.add(COSName.getPDFName(actualStyle));
            array.add(COSName.getPDFName(PDAnnotationLine.LE_NONE));
            getCOSObject().setItem(COSName.LE, array);
        }
        else
        {
            array.setName(0, actualStyle);
        }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/PDAnnotationLine.java`
#### Snippet
```java
        String actualStyle = style == null ? PDAnnotationLine.LE_NONE : style;
        COSArray array = getCOSObject().getCOSArray(COSName.LE);
        if (array == null || array.size() < 2)
        {
            array = new COSArray();
            array.add(COSName.getPDFName(PDAnnotationLine.LE_NONE));
            array.add(COSName.getPDFName(actualStyle));
            getCOSObject().setItem(COSName.LE, array);
        }
        else
        {
            array.setName(1, actualStyle);
        }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/CloudyBorder.java`
#### Snippet
```java
            if (addMoveTo)
            {
                double xs = cx + rx * cosA;
                double ys = cy + ry * sinA;
                if (out != null)
                {
                    out.add(new Point2D.Double(xs, ys));
                }
                else
                {
                    moveTo(xs, ys);
                }
            }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDCircleAppearanceHandler.java`
#### Snippet
```java
        PDAnnotationMarkup annotation = (PDAnnotationMarkup) getAnnotation();

        PDBorderStyleDictionary bs = annotation.getBorderStyle();

        if (bs != null)
        {
            return bs.getWidth();
        }

        COSArray borderCharacteristics = annotation.getBorder();
        if (borderCharacteristics.size() >= 3)
        {
            COSBase base = borderCharacteristics.getObject(2);
            if (base instanceof COSNumber)
            {
                return ((COSNumber) base).floatValue();
            }
        }

        return 1;
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDLinkAppearanceHandler.java`
#### Snippet
```java
        PDBorderStyleDictionary bs = annotation.getBorderStyle();

        if (bs != null)
        {
            return bs.getWidth();
        }

        COSArray borderCharacteristics = annotation.getBorder();
        if (borderCharacteristics.size() >= 3)
        {
            COSBase base = borderCharacteristics.getObject(2);
            if (base instanceof COSNumber)
            {
                return ((COSNumber) base).floatValue();
            }
        }

        return 1;
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDFreeTextAppearanceHandler.java`
#### Snippet
```java
                        float x1 = pathsArray[2];
                        float y1 = pathsArray[3];
                        float len = (float) (Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2)));
                        if (Float.compare(len, 0) != 0)
                        {
                            x += (x1 - x) / len * ab.width;
                            y += (y1 - y) / len * ab.width;
                        }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDFreeTextAppearanceHandler.java`
#### Snippet
```java
                float minX = Float.MAX_VALUE;
                float minY = Float.MAX_VALUE;
                float maxX = Float.MIN_VALUE;
                float maxY = Float.MIN_VALUE;
                for (int i = 0; i < pathsArray.length / 2; ++i)
                {
                    float x = pathsArray[i * 2];
                    float y = pathsArray[i * 2 + 1];
                    minX = Math.min(minX, x);
                    minY = Math.min(minY, y);
                    maxX = Math.max(maxX, x);
                    maxY = Math.max(maxY, y);
                }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDInkAppearanceHandler.java`
#### Snippet
```java
                float x = pathArray[i * 2];
                float y = pathArray[i * 2 + 1];
                minX = Math.min(minX, x);
                minY = Math.min(minY, y);
                maxX = Math.max(maxX, x);
                maxY = Math.max(maxY, y);
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDLineAppearanceHandler.java`
#### Snippet
```java
        if (pathsArray == null)
        {
            return;
        }
        AnnotationBorder ab = AnnotationBorder.getAnnotationBorder(annotation, annotation.getBorderStyle());
        PDColor color = annotation.getColor();
        if (color == null || color.getComponents().length == 0)
        {
            return;
        }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDLineAppearanceHandler.java`
#### Snippet
```java
        rect.setLowerLeftX(Math.min(minX - max, rect.getLowerLeftX()));
        rect.setLowerLeftY(Math.min(minY - max, rect.getLowerLeftY()));
        rect.setUpperRightX(Math.max(maxX + max, rect.getUpperRightX()));
        rect.setUpperRightY(Math.max(maxY + max, rect.getUpperRightY()));

        annotation.setRectangle(rect);
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDSquigglyAppearanceHandler.java`
#### Snippet
```java
        PDRectangle rect = annotation.getRectangle();
        if (rect == null)
        {
            return;
        }
        float[] pathsArray = annotation.getQuadPoints();
        if (pathsArray == null)
        {
            return;
        }
        AnnotationBorder ab = AnnotationBorder.getAnnotationBorder(annotation, annotation.getBorderStyle());
        PDColor color = annotation.getColor();
        if (color == null || color.getComponents().length == 0)
        {
            return;
        }
        if (Float.compare(ab.width, 0) == 0)
        {
            // value found in adobe reader
            ab.width = 1.5f;
        }

        // Adjust rectangle even if not empty, see PLPDF.com-MarkupAnnotations.pdf
        //TODO in a class structure this should be overridable
        // this is similar to polyline but different data type
        // all coordinates (unlike painting) are used because I'm lazy
        float minX = Float.MAX_VALUE;
        float minY = Float.MAX_VALUE;
        float maxX = Float.MIN_VALUE;
        float maxY = Float.MIN_VALUE;
        for (int i = 0; i < pathsArray.length / 2; ++i)
        {
            float x = pathsArray[i * 2];
            float y = pathsArray[i * 2 + 1];
            minX = Math.min(minX, x);
            minY = Math.min(minY, y);
            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }
        rect.setLowerLeftX(Math.min(minX - ab.width / 2, rect.getLowerLeftX()));
        rect.setLowerLeftY(Math.min(minY - ab.width / 2, rect.getLowerLeftY()));
        rect.setUpperRightX(Math.max(maxX + ab.width / 2, rect.getUpperRightX()));
        rect.setUpperRightY(Math.max(maxY + ab.width / 2, rect.getUpperRightY()));
        annotation.setRectangle(rect);
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDStrikeoutAppearanceHandler.java`
#### Snippet
```java
                float len0 = (float) (Math.sqrt(Math.pow(pathsArray[i * 8] - pathsArray[i * 8 + 4], 2) + 
                                      Math.pow(pathsArray[i * 8 + 1] - pathsArray[i * 8 + 5], 2)));
                float x0 = pathsArray[i * 8 + 4];
                float y0 = pathsArray[i * 8 + 5];
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDStrikeoutAppearanceHandler.java`
#### Snippet
```java
                float len1 = (float) (Math.sqrt(Math.pow(pathsArray[i * 8 + 2] - pathsArray[i * 8 + 6], 2) + 
                                      Math.pow(pathsArray[i * 8 + 3] - pathsArray[i * 8 + 7], 2)));
                float x1 = pathsArray[i * 8 + 6];
                float y1 = pathsArray[i * 8 + 7];
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDTextAppearanceHandler.java`
#### Snippet
```java
        contentStream.saveGraphicsState();
        contentStream.setLineWidth(1);
        PDExtendedGraphicsState gs = new PDExtendedGraphicsState();
        gs.setAlphaSourceFlag(false);
        gs.setStrokingAlphaConstant(0.6f);
        gs.setNonStrokingAlphaConstant(0.6f);
        gs.setBlendMode(BlendMode.NORMAL);
        contentStream.setGraphicsStateParameters(gs);
        contentStream.setNonStrokingColor(1f);
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDTextAppearanceHandler.java`
#### Snippet
```java
        PDRectangle bbox = adjustRectAndBBox(annotation, 20, 20);

        float min = Math.min(bbox.getWidth(), bbox.getHeight());

        contentStream.setMiterLimit(4);
        contentStream.setLineJoinStyle(1);
        contentStream.setLineCapStyle(0);
        contentStream.setLineWidth(0.59f); // value from Adobe

        // Adobe first fills a white circle with CA ca 0.6, so do we
        contentStream.saveGraphicsState();
        contentStream.setLineWidth(1);
        PDExtendedGraphicsState gs = new PDExtendedGraphicsState();
        gs.setAlphaSourceFlag(false);
        gs.setStrokingAlphaConstant(0.6f);
        gs.setNonStrokingAlphaConstant(0.6f);
        gs.setBlendMode(BlendMode.NORMAL);
        contentStream.setGraphicsStateParameters(gs);
        contentStream.setNonStrokingColor(1f);
        drawCircle2(contentStream, min / 2, min / 2, min / 2 - 1);
        contentStream.fill();
        contentStream.restoreGraphicsState();

        contentStream.saveGraphicsState();
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDTextAppearanceHandler.java`
#### Snippet
```java
        PDRectangle bbox = adjustRectAndBBox(annotation, 20, 19);

        float min = Math.min(bbox.getWidth(), bbox.getHeight());

        contentStream.setMiterLimit(4);
        contentStream.setLineJoinStyle(1);
        contentStream.setLineCapStyle(0);
        contentStream.setLineWidth(0.59f); // value from Adobe

        contentStream.transform(Matrix.getScaleInstance(0.001f * min / 0.8f, 0.001f * min / 0.8f));
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDTextAppearanceHandler.java`
#### Snippet
```java
        float min = Math.min(bbox.getWidth(), bbox.getHeight());

        contentStream.setMiterLimit(4);
        contentStream.setLineJoinStyle(1);
        contentStream.setLineCapStyle(0);
        contentStream.setLineWidth(0.59f); // value from Adobe

        contentStream.transform(Matrix.getScaleInstance(0.001f * min / 0.8f, 0.001f * min / 0.8f));
        contentStream.transform(Matrix.getTranslateInstance(0, 50));
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDTextAppearanceHandler.java`
#### Snippet
```java
        contentStream.moveTo(1, 7);
        contentStream.lineTo(5, 7);
        contentStream.lineTo(5, 1);
        contentStream.lineTo(12, 1);
        contentStream.lineTo(12, 7);
        contentStream.lineTo(16, 7);
        contentStream.lineTo(8.5f, 19);
        contentStream.closeAndFillAndStroke();
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/layout/PlainText.java`
#### Snippet
```java
            BreakIterator iterator = BreakIterator.getLineInstance();
            iterator.setText(textContent);
            
            final float scale = fontSize/FONTSCALE;
            
            int start = iterator.first();
            int end = iterator.next();
            float lineWidth = 0;
            
            List<Line> textLines = new ArrayList<>();
            Line textLine = new Line();
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/layout/PlainText.java`
#### Snippet
```java
            final float scale = fontSize/FONTSCALE;
            float calculatedWidth = 0f;
            int indexOfWord = 0;
            for (Word word : words)
            {
                calculatedWidth = calculatedWidth + 
                        (Float) word.getAttributes().getIterator().getAttribute(TextAttribute.WIDTH);
                String text = word.getText();
                if (indexOfWord == words.size() -1 && Character.isWhitespace(text.charAt(text.length()-1)))
                {
                    float whitespaceWidth = font.getStringWidth(text.substring(text.length()-1)) * scale;
                    calculatedWidth = calculatedWidth - whitespaceWidth;
                }
                ++indexOfWord;
            }
            return calculatedWidth;
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/layout/PlainTextFormatter.java`
#### Snippet
```java
        if (textContent != null && !textContent.getParagraphs().isEmpty())
        {
            boolean isFirstParagraph = true;
        	for (Paragraph paragraph : textContent.getParagraphs())
            {
                if (wrapLines)
                {
                    List<Line> lines = paragraph.getLines(
                                appearanceStyle.getFont(), 
                                appearanceStyle.getFontSize(), 
                                width
                            );
                    processLines(lines, isFirstParagraph);
                    isFirstParagraph = false;
                }
                else
                {
                    float startOffset = 0f;
                    
                    
                    float lineWidth = appearanceStyle.getFont().getStringWidth(paragraph.getText()) *
                            appearanceStyle.getFontSize() / FONTSCALE;
                    
                    if (lineWidth < width) 
                    {
                        switch (textAlignment)
                        {
                        case CENTER:
                            startOffset = (width - lineWidth)/2;
                            break;
                        case RIGHT:
                            startOffset = width - lineWidth;
                            break;
                        case JUSTIFY:
                        default:
                            startOffset = 0f;
                        }
                    }
                    
                    contents.newLineAtOffset(horizontalOffset + startOffset, verticalOffset);
                    contents.showText(paragraph.getText());
                }
            }
        }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/layout/PlainTextFormatter.java`
#### Snippet
```java
float wordWidth;

        float lastPos = 0f;
        float startOffset = 0f;
        float interWordSpacing = 0f;
        
        for (Line line : lines)
        {
            switch (textAlignment)
            {
            case CENTER:
                startOffset = (width - line.getWidth())/2;
                break;
            case RIGHT:
                startOffset = width - line.getWidth();
                break;
            case JUSTIFY:
                if (lines.indexOf(line) != lines.size() -1)
                {
                    interWordSpacing = line.getInterWordSpacing(width);
                }
                break;
            default:
                startOffset = 0f;
            }
            
            float offset = -lastPos + startOffset + horizontalOffset;
            
            if (lines.indexOf(line) == 0 && isFirstParagraph)
            {
                contents.newLineAtOffset(offset, verticalOffset);
            }
            else
            {
                // keep the last position
                verticalOffset = verticalOffset - appearanceStyle.getLeading();
                contents.newLineAtOffset(offset, - appearanceStyle.getLeading());
            }

            lastPos += offset; 

            List<Word> words = line.getWords();
            int wordIndex = 0;
            for (Word word : words)
            {
                contents.showText(word.getText());
                wordWidth = (Float) word.getAttributes().getIterator().getAttribute(TextAttribute.WIDTH);
                if (wordIndex != words.size() -1)
                {
                    contents.newLineAtOffset(wordWidth + interWordSpacing, 0f);
                    lastPos = lastPos + wordWidth + interWordSpacing;
                }
                ++wordIndex;
            }
        }
        horizontalOffset = horizontalOffset - lastPos;
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/form/PDButton.java`
#### Snippet
```java
        PDAppearanceDictionary apDictionary = widget.getAppearance();
        if (apDictionary != null) 
        {
            PDAppearanceEntry normalAppearance = apDictionary.getNormalAppearance();
            if (normalAppearance != null)
            {
                Set<COSName> entries = normalAppearance.getSubDictionary().keySet();
                for (COSName entry : entries)
                {
                    if (COSName.Off.compareTo(entry) != 0)
                    {
                        return entry.getName();
                    }
                }
            }
        }
        return "";
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/measurement/PDRectlinearMeasureDictionary.java`
#### Snippet
```java
        if (x != null)
        {
            PDNumberFormatDictionary[] retval =
                new PDNumberFormatDictionary[x.size()];
            for (int i = 0; i < x.size(); i++)
            {
                COSDictionary dic = (COSDictionary) x.get(i);
                retval[i] = new PDNumberFormatDictionary(dic);
            }
            return retval;
        }
        return null;
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/text/PDFMarkedContentExtractor.java`
#### Snippet
```java
            if(textList.isEmpty())
            {
                textList.add(text);
            }
            else
            {
                /* test if we overlap the previous entry.  
                 * Note that we are making an assumption that we need to only look back
                 * one TextPosition to find what we are overlapping.  
                 * This may not always be true. */
                TextPosition previousTextPosition = textList.get(textList.size()-1);
                if(text.isDiacritic() && previousTextPosition.contains(text))
                {
                    previousTextPosition.mergeDiacritic(text);
                }
                /* If the previous TextPosition was the diacritic, merge it into this
                 * one and remove it from the list. */
                else if(previousTextPosition.isDiacritic() && text.contains(previousTextPosition))
                {
                    text.mergeDiacritic(previousTextPosition);
                    textList.remove(textList.size()-1);
                    textList.add(text);
                }
                else
                {
                    textList.add(text);
                }
            }
```

### DuplicatedCode
Duplicated code
in `pdfbox/src/main/java/org/apache/pdfbox/util/DateConverter.java`
#### Snippet
```java
        int offset = tz.getRawOffset();
        char pm = '+';
        if (offset < 0)
        {
            pm = '-';
            offset = -offset;
        }
        int hh = offset / 3600000;
        int mm = offset % 3600000 / 60000;
        if (offset == 0)
        {
            tz.setID("GMT");
        }
        else if (pm == '+' && hh <= 12)
        {
            tz.setID(String.format(Locale.US, "GMT+%02d:%02d", hh, mm));
        }
        else if (pm == '-' && hh <= 14)
        {
            tz.setID(String.format(Locale.US, "GMT-%02d:%02d", hh, mm));
        }
        else
        {
            tz.setID("unknown");
        }
```

### DuplicatedCode
Duplicated code
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/StubOperator.java`
#### Snippet
```java
            if (!(arg instanceof COSName) && !(arg instanceof COSString))
            {
                throw createInvalidArgumentsError();
            }

            if (arg instanceof COSName && ((COSName) arg).getName().length() > MAX_NAME_SIZE)
            {
                throw createLimitError(ERROR_SYNTAX_NAME_TOO_LONG, "A Name operand is too long");
            }

            if (arg instanceof COSString && ((COSString) arg).getString().getBytes().length > MAX_STRING_LENGTH)
            {
                throw createLimitError(ERROR_SYNTAX_LITERAL_TOO_LONG, "A String operand is too long");
            }
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/PrintURLs.java`
#### Snippet
```java
            }
        }
        catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e)
        {
        }
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `fontbox/src/main/java/org/apache/fontbox/util/autodetect/UnixFontDirFinder.java`
#### Snippet
```java
     * Some guesses at possible unix font directory locations.
     * 
     * @return a list of possible font locations
     */
    @Override
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `debugger/src/main/java/org/apache/pdfbox/debugger/PDFDebugger.java`
#### Snippet
```java
            try
            {
                try (InputStream is = new FileInputStream(file))
                {
                    configuration.load(is);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `pdfbox/src/main/java/org/apache/pdfbox/Loader.java`
#### Snippet
```java
    public static FDFDocument loadXFDF(String filename) throws IOException
    {
        return Loader.loadXFDF(new BufferedInputStream(new FileInputStream(filename)));
    }

```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `pdfbox/src/main/java/org/apache/pdfbox/Loader.java`
#### Snippet
```java
    public static FDFDocument loadXFDF(File file) throws IOException
    {
        return Loader.loadXFDF(new BufferedInputStream(new FileInputStream(file)));
    }

```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFDocument.java`
#### Snippet
```java
    {
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(fileName), StandardCharsets.UTF_8)))
        {
            saveXFDF(writer);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/PDDocument.java`
#### Snippet
```java
        }
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
                new FileOutputStream(file)))
        {
            save(bufferedOutputStream, compressParameters);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/FileSystemFontProvider.java`
#### Snippet
```java
    private void addType1Font(File pfbFile) throws IOException
    {
        try (InputStream input = new FileInputStream(pfbFile))
        {
            Type1Font type1 = Type1Font.createWithPFB(input);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/FileSystemFontProvider.java`
#### Snippet
```java
        private Type1Font getType1Font(String postScriptName, File file)
        {
            try (InputStream input = new FileInputStream(file))
            {
                Type1Font type1 = Type1Font.createWithPFB(input);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/image/PDImageXObject.java`
#### Snippet
```java
    {
        FileType fileType = null;
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file)))
        {
            fileType = FileTypeDetector.detectFileType(bufferedInputStream);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/digitalsignature/visible/PDVisibleSignDesigner.java`
#### Snippet
```java
    public PDVisibleSignDesigner signatureImage(String path) throws IOException
    {
        try (InputStream in = new BufferedInputStream(new FileInputStream(path)))
        {
            readImageStream(in);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/ExtractTTFFonts.java`
#### Snippet
```java
            {
                System.out.println("Writing font: " + name);
                try (OutputStream os = new FileOutputStream(new File(name + ".ttf"));
                     InputStream is = ff2Stream.createInputStream())
                {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/HelloWorldType1.java`
#### Snippet
```java

            PDFont font;
            try (InputStream is = new FileInputStream(pfbPath))
            {
                font = new PDType1Font(doc, is);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature2.java`
#### Snippet
```java
        KeyStore keystore = KeyStore.getInstance("PKCS12");
        char[] pin = args[1].toCharArray();
        try (InputStream is = new FileInputStream(ksFile))
        {
            keystore.load(is, pin);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateSignature.java`
#### Snippet
```java
        KeyStore keystore = KeyStore.getInstance("PKCS12");
        char[] password = args[1].toCharArray(); // TODO use Java 6 java.io.Console.readPassword
        try (InputStream is = new FileInputStream(args[0]))
        {
            keystore.load(is, password);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
        KeyStore keystore = KeyStore.getInstance("PKCS12");
        char[] pin = args[1].toCharArray();
        try (InputStream is = new FileInputStream(ksFile))
        {
            keystore.load(is, pin);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
        File signedDocumentFile;
        int page;
        try (InputStream imageStream = new FileInputStream(args[3]))
        {
            String name = documentFile.getName();
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `pdfbox/src/main/java/org/apache/pdfbox/cos/COSInteger.java`
#### Snippet
```java
     * Constant for an out of range value which is bigger than Log.MAX_VALUE.
     */
    protected static final COSInteger OUT_OF_RANGE_MAX = getInvalid(true);

    /**
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `pdfbox/src/main/java/org/apache/pdfbox/cos/COSInteger.java`
#### Snippet
```java
     * Constant for an out of range value which is smaller than Log.MIN_VALUE.
     */
    protected static final COSInteger OUT_OF_RANGE_MIN = getInvalid(false);

    /**
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/XrefEntry.java`
#### Snippet
```java
        }
        return offset >= 0 ? //
                "Offset: " + offset + " [" + key.toString() + "]" : //
                "Compressed object stream: " + (-offset) + " [" + key.toString() + "]";
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/XrefEntry.java`
#### Snippet
```java
        return offset >= 0 ? //
                "Offset: " + offset + " [" + key.toString() + "]" : //
                "Compressed object stream: " + (-offset) + " [" + key.toString() + "]";
    }
}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/XrefEntry.java`
#### Snippet
```java
    public String getPath()
    {
        return XrefEntries.PATH + "/" + toString();
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/LogDialog.java`
#### Snippet
```java
            StringWriter sw = new StringWriter();
            throwable.printStackTrace(new PrintWriter(sw));
            message += "\n    " + sw.toString();
            exceptionCount++;
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/Tree.java`
#### Snippet
```java
        }
        nameListBuilder.delete(nameListBuilder.lastIndexOf("&"), nameListBuilder.length());
        JMenuItem menuItem = new JMenuItem("Keep " + nameListBuilder.toString() + "...");

        menuItem.addActionListener(actionEvent ->
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `debugger/src/main/java/org/apache/pdfbox/debugger/streampane/Stream.java`
#### Snippet
```java
            }
        }
        return "Encoded (" + sb.toString() + ")";
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `debugger/src/main/java/org/apache/pdfbox/debugger/streampane/Stream.java`
#### Snippet
```java
        nameListBuilder.delete(nameListBuilder.lastIndexOf("&"), nameListBuilder.length());

        return "Keep " + nameListBuilder.toString() + "...";
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotation.java`
#### Snippet
```java
                    attributeNodeValue));
        }
        return String.format("<%s%s>%s</%s>", node.getNodeName(), builder.toString(),
                sb.toString(), node.getNodeName());
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotation.java`
#### Snippet
```java
        }
        return String.format("<%s%s>%s</%s>", node.getNodeName(), builder.toString(),
                sb.toString(), node.getNodeName());
    }
}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/PublicKeySecurityHandler.java`
#### Snippet
```java
            {
                throw new IOException("The certificate matches none of " + array.size()
                        + " recipient entries" + extraInfo.toString());
            }
            if (envelopedData.length != 24)
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `fontbox/src/main/java/org/apache/fontbox/type1/Type1Lexer.java`
#### Snippet
```java
            catch (NumberFormatException ex)
            {
                throw new IOException("Invalid number '" + sb.toString() + "'", ex);
            }
            return new Token(Integer.toString(val), Token.INTEGER);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `preflight/src/main/java/org/apache/pdfbox/preflight/parser/PreflightParser.java`
#### Snippet
```java
            addValidationError(new ValidationError(ERROR_SYNTAX_OBJ_DELIMITER,
                    "Single space expected [offset=" + offset + "; key="
                            + offsetOrObjstmObNr.toString() + "; line=" + line + "; object="
                            + objKey.getNumber() + " " + objKey.getGeneration() + "]"));

```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `OpaquePageDrawer` may be 'static'
in `examples/src/main/java/org/apache/pdfbox/examples/printing/OpaquePDFRenderer.java`
#### Snippet
```java
    }

    private class OpaquePageDrawer extends PageDrawer
    {

```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.containsValue()'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/COSDictionary.java`
#### Snippet
```java
    public boolean containsValue(Object value)
    {
        boolean contains = items.containsValue(value);
        if (!contains && value instanceof COSObject)
        {
```

### SuspiciousMethodCalls
Suspicious call to 'List.indexOf()'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/COSArrayList.java`
#### Snippet
```java

        boolean retval = true;
        int index = actual.indexOf( o );
        if( index >= 0 )
        {
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `debugger/src/main/java/org/apache/pdfbox/debugger/ui/PDFTreeModel.java`
#### Snippet
```java
package org.apache.pdfbox.debugger.ui;

/**
 * A tree model that uses a cos document.
 *
```

### DanglingJavadoc
Dangling Javadoc comment
in `debugger/src/main/java/org/apache/pdfbox/debugger/colorpane/IndexedColorant.java`
#### Snippet
```java
import java.awt.Color;

/**
 * @author Khyrul Bashar.
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `debugger/src/main/java/org/apache/pdfbox/debugger/colorpane/ColorBarCellRenderer.java`
#### Snippet
```java
import javax.swing.table.TableCellRenderer;

/**
 * @author Khyrul Bashar.
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `debugger/src/main/java/org/apache/pdfbox/debugger/colorpane/DeviceNTableModel.java`
#### Snippet
```java
import javax.swing.table.AbstractTableModel;

/**
 * @author Khyrul Bashar.
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `debugger/src/main/java/org/apache/pdfbox/debugger/colorpane/IndexedTableModel.java`
#### Snippet
```java
import javax.swing.table.AbstractTableModel;

/**
 * @author Khyrul Bashar.
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/PDDocument.java`
#### Snippet
```java
    private static final Log LOG = LogFactory.getLog(PDDocument.class);

    /**
     * avoid concurrency issues with PDDeviceRGB
     */
```

### DanglingJavadoc
Dangling Javadoc comment
in `xmpbox/src/main/java/org/apache/xmpbox/type/PropertyType.java`
#### Snippet
```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
/**
 * Annotation to specify type expected for a property
 */
```

### DanglingJavadoc
Dangling Javadoc comment
in `preflight/src/main/java/org/apache/pdfbox/preflight/parser/PreflightParser.java`
#### Snippet
```java

    @Override
    /**
     * Call {@link BaseParser#parseCOSArray()} and check the number of element in the array
     */
```

### DanglingJavadoc
Dangling Javadoc comment
in `preflight/src/main/java/org/apache/pdfbox/preflight/parser/PreflightParser.java`
#### Snippet
```java

    @Override
    /**
     * Call {@link BaseParser#parseCOSName()} and check the length of the name
     */
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `temp` declared in one 'switch' branch and used in another
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/digitalsignature/visible/PDVisibleSignDesigner.java`
#### Snippet
```java
            case 90:
                // https://stackoverflow.com/a/34359956/535646
                float temp = yAxis;
                yAxis = pageHeight - xAxis - imageWidth;
                xAxis = temp;
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `debugger/src/main/java/org/apache/pdfbox/debugger/PDFDebugger.java`
#### Snippet
```java
            COSDictionary dict = (COSDictionary) selectedNode;
            COSBase typeItem = dict.getItem(COSName.TYPE);
            if (COSName.PAGE.equals(typeItem))
            {
                return true;
```

### TrivialIf
`if` statement can be simplified
in `debugger/src/main/java/org/apache/pdfbox/debugger/PDFDebugger.java`
#### Snippet
```java
            }
        }
        else if (selectedNode instanceof PageEntry)
        {
            return true;
```

### TrivialIf
`if` statement can be simplified
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/PDResources.java`
#### Snippet
```java
                    return false;
                }
                if (hasColorSpace(colorSpaceName))
                {
                    return false;
```

### TrivialIf
`if` statement can be simplified
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/TrueTypeEmbedder.java`
#### Snippet
```java
        {
            int fsType = ttf.getOS2Windows().getFsType();
            if ((fsType & OS2WindowsMetricsTable.FSTYPE_NO_SUBSETTING) ==
                          OS2WindowsMetricsTable.FSTYPE_NO_SUBSETTING)
            {
```

### TrivialIf
`if` statement can be simplified
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/TrueTypeEmbedder.java`
#### Snippet
```java
                return false;
            }
            else if ((fsType & OS2WindowsMetricsTable.FSTYPE_BITMAP_ONLY) ==
                                 OS2WindowsMetricsTable.FSTYPE_BITMAP_ONLY)
            {
```

### TrivialIf
`if` statement can be simplified
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/FontMapperImpl.java`
#### Snippet
```java

        OpenTypeFont otf = (OpenTypeFont) findFont(FontFormat.OTF, postScriptName);
        if (otf != null)
        {
            return otf;
```

### TrivialIf
`if` statement can be simplified
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/PDSimpleFont.java`
#### Snippet
```java
        {
            int firstChar = dict.getInt(COSName.FIRST_CHAR, -1);
            if (code >= firstChar && code - firstChar < getWidths().size())
            {
                return true;
```

### TrivialIf
`if` statement can be simplified
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/image/LosslessFactory.java`
#### Snippet
```java
            return true;
        }
        if (image.getType() == BufferedImage.TYPE_BYTE_BINARY && image.getColorModel().getPixelSize() == 1)
        {
            return true;
```

### TrivialIf
`if` statement can be simplified
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/documentinterchange/logicalstructure/PDUserProperty.java`
#### Snippet
```java
        if (userAttributeObject == null)
        {
            if (other.userAttributeObject != null)
            {
                return false;
```

### TrivialIf
`if` statement can be simplified
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/documentinterchange/logicalstructure/PDUserProperty.java`
#### Snippet
```java
            }
        }
        else if (!userAttributeObject.equals(other.userAttributeObject))
        {
            return false;
```

### TrivialIf
`if` statement can be simplified
in `pdfbox/src/main/java/org/apache/pdfbox/rendering/PageDrawer.java`
#### Snippet
```java
            if (printState == null)
            {
                if (!getRenderer().isGroupEnabled(group))
                {
                    return true;
```

### TrivialIf
`if` statement can be simplified
in `pdfbox/src/main/java/org/apache/pdfbox/rendering/PageDrawer.java`
#### Snippet
```java
                }
            }
            else if (RenderState.OFF.equals(printState))
            {
                return true;
```

### TrivialIf
`if` statement can be simplified
in `fontbox/src/main/java/org/apache/fontbox/cff/CharStringCommand.java`
#### Snippet
```java
                return true;
            }
            if (type1KeyWord == null && type2KeyWord == null)
            {
                return true;
```

### TrivialIf
`if` statement can be simplified
in `fontbox/src/main/java/org/apache/fontbox/ttf/model/MapBackedScriptFeature.java`
#### Snippet
```java
        if (name == null)
        {
            if (other.name != null)
            {
                return false;
```

### TrivialIf
`if` statement can be simplified
in `fontbox/src/main/java/org/apache/fontbox/ttf/model/MapBackedScriptFeature.java`
#### Snippet
```java
            }
        }
        else if (!name.equals(other.name))
        {
            return false;
```

### TrivialIf
`if` statement can be simplified
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/SynchronizedMetaDataValidation.java`
#### Snippet
```java
        {
            String date = ((COSString) item).getString();
            if (date.matches("D:\\d{4}(\\d{2}(\\d{2}(\\d{2}(\\d{2}(\\d{2}([\\+\\-Z](\\d{2}'\\d{2}')?)?)?)?)?)?)?"))
            {
                return true;
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `data`
in `fontbox/src/main/java/org/apache/fontbox/ttf/GlyphTable.java`
#### Snippet
```java
        // PDFBOX-4219: synchronize on data because it is accessed by several threads
        // when PDFBox is accessing a standard 14 font for the first time
        synchronized (data)
        {
            // read a single glyph
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'UNMAPPER'
in `io/src/main/java/org/apache/pdfbox/io/IOUtils.java`
#### Snippet
```java

    //TODO PDFBox should really use Apache Commons IO.
    private static final Optional<Consumer<ByteBuffer>> UNMAPPER;

    static
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/PDType1Font.java`
#### Snippet
```java
        // scan backwards from the end of the first segment to find 'exec'
        int offset = Math.max(0, length1 - 4);
        if (offset <= 0 || offset > bytes.length - 4)
        {
            offset = bytes.length - 4;
```

## RuleId[id=ExcessiveRangeCheck]
### ExcessiveRangeCheck
Can be replaced with 'arguments.size() != 2'
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/StubOperator.java`
#### Snippet
```java
    private void checkTagAndPropertyOperands(List<COSBase> arguments) throws ContentStreamException
    {
        if (arguments == null || arguments.isEmpty() || arguments.size() != 2)
        {
            throw createInvalidArgumentsError();
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'PDDocument' used without 'try'-with-resources statement
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/digitalsignature/SignatureOptions.java`
#### Snippet
```java
        pdfSource = rar;
        PDFParser parser = new PDFParser(pdfSource);
        visualSignature = parser.parse().getDocument();
    }

```

## RuleId[id=RedundantCompareCall]
### RedundantCompareCall
Redundant call to `Long.compare()`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/image/SampledImageReader.java`
#### Snippet
```java
                // we just need to copy all sample data, then convert to RGB image.
                long inputResult = IOUtils.populateBuffer(input, bank);
                if (Long.compare(inputResult, (long) width * height * numComponents) != 0)
                {
                    LOG.debug("Tried reading " + (long) width * height * numComponents + " bytes but only " + inputResult + " bytes read");
```

### RedundantCompareCall
Redundant call to `Long.compare()`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/image/SampledImageReader.java`
#### Snippet
```java
                long inputResult = IOUtils.populateBuffer(input, tempBytes);

                if (Long.compare(inputResult, tempBytes.length) != 0)
                {
                    LOG.debug("Tried reading " + tempBytes.length + " bytes but only " + inputResult + " bytes read");
```

### RedundantCompareCall
Redundant call to `Long.compare()`
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/SecurityHandler.java`
#### Snippet
```java
                long isResult = IOUtils.populateBuffer(is, buf);

                if (Long.compare(isResult, buf.length) != 0)
                {
                    LOG.debug("Tried reading " + buf.length + " bytes but only " + isResult + " bytes read");
```

### RedundantCompareCall
Redundant call to `Long.compare()`
in `fontbox/src/main/java/org/apache/fontbox/ttf/TTFSubsetter.java`
#### Snippet
```java
            long isResult = is.skip(g.getOffset());

            if (Long.compare(isResult, g.getOffset()) != 0)
            {
                LOG.debug("Tried skipping " + g.getOffset() + " bytes but skipped only " + isResult + " bytes");
```

### RedundantCompareCall
Redundant call to `Long.compare()`
in `fontbox/src/main/java/org/apache/fontbox/ttf/TTFSubsetter.java`
#### Snippet
```java
                isResult = is.skip(offset - prevEnd);

                if (Long.compare(isResult, offset - prevEnd) != 0)
                {
                    LOG.debug("Tried skipping " + (offset - prevEnd) + " bytes but skipped only " + isResult + " bytes");
```

### RedundantCompareCall
Redundant call to `Long.compare()`
in `fontbox/src/main/java/org/apache/fontbox/ttf/TTFSubsetter.java`
#### Snippet
```java
                isResult = is.read(buf);

                if (Long.compare(isResult, length) != 0)
                {
                    LOG.debug("Tried reading " + length + " bytes but only " + isResult + " bytes read");
```

### RedundantCompareCall
Redundant call to `Long.compare()`
in `fontbox/src/main/java/org/apache/fontbox/ttf/TTFSubsetter.java`
#### Snippet
```java
            long isResult = is.skip(hm.getOffset());

            if (Long.compare(isResult, hm.getOffset()) != 0)
            {
                LOG.debug("Tried skipping " + hm.getOffset() + " bytes but only " + isResult + " bytes skipped");
```

### RedundantCompareCall
Redundant call to `Long.compare()`
in `fontbox/src/main/java/org/apache/fontbox/ttf/TTFSubsetter.java`
#### Snippet
```java
                long isResult = is.skip(g.getOffset());

                if (Long.compare(isResult, g.getOffset()) != 0)
                {
                    LOG.debug("Tried skipping " + g.getOffset() + " bytes but skipped only " + isResult + " bytes");
```

### RedundantCompareCall
Redundant call to `Long.compare()`
in `fontbox/src/main/java/org/apache/fontbox/ttf/TTFSubsetter.java`
#### Snippet
```java
                    isResult = is.skip(offset - lastOff);
                    
                    if (Long.compare(isResult, offset - lastOff) != 0)
                    {
                        LOG.debug("Tried skipping " + (offset - lastOff) + " bytes but skipped only " + isResult + " bytes");
```

### RedundantCompareCall
Redundant call to `Long.compare()`
in `fontbox/src/main/java/org/apache/fontbox/ttf/TTFSubsetter.java`
#### Snippet
```java
                    isResult = is.read(buf);

                    if (Long.compare(isResult, len) != 0)
                    {
                        LOG.debug("Tried reading " + len + " bytes but only " + isResult + " bytes read");
```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationInk.java`
#### Snippet
```java
                {
                    String gesture = node.getFirstChild().getNodeValue();
                    String[] gestureValues = gesture.split(",|;");
                    float[] values = new float[gestureValues.length];
                    for (int j = 0; j < gestureValues.length; j++)
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationPolyline.java`
#### Snippet
```java
                throw new IOException("Error: missing element 'vertices'");
            }
            String[] verticesValues = vertices.split(",|;");
            float[] values = new float[verticesValues.length];
            for (int i = 0; i < verticesValues.length; i++)
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/fdf/FDFAnnotationPolygon.java`
#### Snippet
```java
                throw new IOException("Error: missing element 'vertices'");
            }
            String[] verticesValues = vertices.split(",|;");
            float[] values = new float[verticesValues.length];
            for (int i = 0; i < verticesValues.length; i++)
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `selectedNode` to `XrefEntry` is redundant
in `debugger/src/main/java/org/apache/pdfbox/debugger/PDFDebugger.java`
#### Snippet
```java
        if (selectedNode instanceof XrefEntry)
        {
            return ((XrefEntry) selectedNode).toString();
        }
        return null;
```

### RedundantCast
Casting `object` to `COSObject` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdfwriter/compress/COSWriterObjectStream.java`
#### Snippet
```java
            if (!topLevel)
            {
                COSObjectKey actualKey = ((COSObject) object).getKey();
                // the object reference can't be dereferenced be lenient and write the reference nevertheless
                // or the object is part of a compressed object stream and shouldn't be written directly
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@return` tag description is missing
in `debugger/src/main/java/org/apache/pdfbox/debugger/colorpane/CSIndexed.java`
#### Snippet
```java
     * Parses the colorant data from the array and return.
     *
     * @return
     */
    private IndexedColorant[] getColorantData()
```

### JavadocDeclaration
`@return` tag description is missing
in `debugger/src/main/java/org/apache/pdfbox/debugger/hexviewer/HexModel.java`
#### Snippet
```java
    /**
     *
     * @return
     */
    public int totalLine()
```

### JavadocDeclaration
`@param hexValue` tag description is missing
in `debugger/src/main/java/org/apache/pdfbox/debugger/streampane/tooltip/ColorToolTip.java`
#### Snippet
```java
    /**
     * Create a html string that actually shows a colored rect.
     * @param hexValue
     * @return String instance, In html format.
     */
```

### JavadocDeclaration
`@param color` tag description is missing
in `debugger/src/main/java/org/apache/pdfbox/debugger/streampane/tooltip/ColorToolTip.java`
#### Snippet
```java
    /**
     * provides the Hex value for a Color instance.
     * @param color
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `debugger/src/main/java/org/apache/pdfbox/debugger/streampane/tooltip/ColorToolTip.java`
#### Snippet
```java
     * provides the Hex value for a Color instance.
     * @param color
     * @return
     */
    static String colorHexValue(Color color)
```

### JavadocDeclaration
`@param index` tag description is missing
in `debugger/src/main/java/org/apache/pdfbox/debugger/hexviewer/HexPane.java`
#### Snippet
```java
    /**
     * Puts an index in selected state or in other word it selects the byte of the index.
     * @param index
     */
    private void putInSelected(int index)
```

### JavadocDeclaration
`@param obj` tag description is missing
in `debugger/src/main/java/org/apache/pdfbox/debugger/treestatus/TreeStatus.java`
#### Snippet
```java
    /**
     * An object is searched in the tree structure using the identifiers parsed earlier step.
     * @param obj
     * @param searchStr
     * @return
```

### JavadocDeclaration
`@param searchStr` tag description is missing
in `debugger/src/main/java/org/apache/pdfbox/debugger/treestatus/TreeStatus.java`
#### Snippet
```java
     * An object is searched in the tree structure using the identifiers parsed earlier step.
     * @param obj
     * @param searchStr
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `debugger/src/main/java/org/apache/pdfbox/debugger/treestatus/TreeStatus.java`
#### Snippet
```java
     * @param obj
     * @param searchStr
     * @return
     */
    private Object searchNode(Object obj, String searchStr)
```

### JavadocDeclaration
`@param pathString` tag description is missing
in `debugger/src/main/java/org/apache/pdfbox/debugger/treestatus/TreeStatus.java`
#### Snippet
```java
    /**
     * Constructs TreePath from Status String.
     * @param pathString
     * @return a TreePath, or null if there is an error.
     */
```

### JavadocDeclaration
`@param path` tag description is missing
in `debugger/src/main/java/org/apache/pdfbox/debugger/treestatus/TreeStatus.java`
#### Snippet
```java
    /**
     * Constructs a status string from the path.
     * @param path
     * @return the status string.
     */
```

### JavadocDeclaration
`@param tableData` tag description is missing
in `debugger/src/main/java/org/apache/pdfbox/debugger/fontencodingpane/FontEncodingPaneController.java`
#### Snippet
```java
     * Calculate vertical bounds common to all rendered glyphs.
     *
     * @param tableData
     * @param glyphIndex the table index that has glyphs.
     * @return an array with two elements: min lower bound (but max 0), and max upper bound (but min
```

### JavadocDeclaration
`@param ` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/util/IterativeMergeSort.java`
#### Snippet
```java
     * ordered result back into into arr array.
     *
     * @param <T>
     * @param arr Array containing source data to be sorted and target for destination data
     * @param aux Array containing copy of source data to be sorted
```

### JavadocDeclaration
`@param defaultValue` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/util/filetypedetector/ByteTrie.java`
#### Snippet
```java
    /**
     * Sets the default value to use in {@link ByteTrie#find(byte[])} when no path matches.
     * @param defaultValue
     */
    public void setDefaultValue(T defaultValue)
```

### JavadocDeclaration
`@param value` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/util/filetypedetector/ByteTrie.java`
#### Snippet
```java
    /**
     * Store the given value at the specified path.
     * @param value
     * @param parts
     */
```

### JavadocDeclaration
`@param parts` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/util/filetypedetector/ByteTrie.java`
#### Snippet
```java
     * Store the given value at the specified path.
     * @param value
     * @param parts
     */
    public void addPath(T value, byte[]... parts)
```

### JavadocDeclaration
`@return` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/util/filetypedetector/ByteTrie.java`
#### Snippet
```java
    /**
     * Gets the maximum depth stored in this trie.
     * @return 
     */
    public int getMaxDepth()
```

### JavadocDeclaration
`@param bytes` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/util/filetypedetector/ByteTrie.java`
#### Snippet
```java
     * <code>null</code> or a default values as specified by calling
     * {@link ByteTrie#setDefaultValue}.
     * @param bytes
     * @return 
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/util/filetypedetector/ByteTrie.java`
#### Snippet
```java
     * {@link ByteTrie#setDefaultValue}.
     * @param bytes
     * @return 
     */
    public T find(byte[] bytes)
```

### JavadocDeclaration
`@throws` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/CMapManager.java`
#### Snippet
```java
     * @param cMapName CMap name
     * @return The predefined CMap, never null.
     * @throws IOException 
     */
    public static CMap getPredefinedCMap(String cMapName) throws IOException
```

### JavadocDeclaration
`@param document` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/PDType0Font.java`
#### Snippet
```java
     * Private. Creates a new PDType0Font font for embedding.
     *
     * @param document
     * @param ttf
     * @param embedSubset
```

### JavadocDeclaration
`@param ttf` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/PDType0Font.java`
#### Snippet
```java
     *
     * @param document
     * @param ttf
     * @param embedSubset
     * @param closeTTF whether to close the ttf parameter after embedding. Must be true when the ttf
```

### JavadocDeclaration
`@param embedSubset` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/PDType0Font.java`
#### Snippet
```java
     * @param document
     * @param ttf
     * @param embedSubset
     * @param closeTTF whether to close the ttf parameter after embedding. Must be true when the ttf
     * parameter was created in the load() method, false when the ttf parameter was passed to the
```

### JavadocDeclaration
`@throws` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/PDType0Font.java`
#### Snippet
```java
     * load() method.
     * @param vertical whether to enable vertical substitutions.
     * @throws IOException
     */
    private PDType0Font(PDDocument document, TrueTypeFont ttf, boolean embedSubset,
```

### JavadocDeclaration
`@throws` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/image/SampledImageReader.java`
#### Snippet
```java
     * @param pdImage  The image to get the raw raster data from
     * @return the raw raster of this image
     * @throws IOException
     */
    public static WritableRaster getRawRaster(PDImage pdImage) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/image/LosslessFactory.java`
#### Snippet
```java
     * @param initColorSpace the color space
     * @return the newly created PDImageXObject with the data compressed.
     * @throws IOException 
     */
    static PDImageXObject prepareImageXObject(PDDocument document,
```

### JavadocDeclaration
`@param softMask` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/graphics/image/PDImageXObject.java`
#### Snippet
```java
     * Extract the matte color from a softmask.
     * 
     * @param softMask
     * @return the matte color.
     * @throws IOException if the color conversion fails.
```

### JavadocDeclaration
`@throws` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/form/PlainText.java`
#### Snippet
```java
         * @param width the width of the box holding the content.
         * @return the individual lines.
         * @throws IOException
         */
        List<Line> getLines(PDFont font, float fontSize, float width) throws IOException
```

### JavadocDeclaration
`@param appearanceStream` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/form/PDAcroForm.java`
#### Snippet
```java
     * the appearance stream
     * 
     * @param appearanceStream
     * @return the transformed rectangle
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/form/AppearanceGeneratorHelper.java`
#### Snippet
```java
     *
     * @param field the field which you wish to control the appearance of
     * @throws IOException 
     */
    AppearanceGeneratorHelper(PDVariableText field) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/form/AppearanceGeneratorHelper.java`
#### Snippet
```java
     * @param font the font to be used
     * @param fontSize the font size to be used
     * @throws IOException
     */
    private void insertGeneratedCombAppearance(PDAppearanceContentStream contents, PDAppearanceStream appearanceStream,
```

### JavadocDeclaration
`@throws` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/layout/PlainText.java`
#### Snippet
```java
         * @param width the width of the box holding the content.
         * @return the individual lines.
         * @throws IOException
         */
        List<Line> getLines(PDFont font, float fontSize, float width) throws IOException
```

### JavadocDeclaration
`@param contentStream` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDFileAttachmentAppearanceHandler.java`
#### Snippet
```java
     * (Apache licensed).
     *
     * @param contentStream
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDFileAttachmentAppearanceHandler.java`
#### Snippet
```java
     *
     * @param contentStream
     * @throws IOException
     */
    private void drawPaperclip(final PDAppearanceContentStream contentStream) throws IOException
```

### JavadocDeclaration
`@param x` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDAbstractAppearanceHandler.java`
#### Snippet
```java
     *
     * @param cs Content stream
     * @param x
     * @param y
     * @param r Radius
```

### JavadocDeclaration
`@param y` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDAbstractAppearanceHandler.java`
#### Snippet
```java
     * @param cs Content stream
     * @param x
     * @param y
     * @param r Radius
     *
```

### JavadocDeclaration
`@param x` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDAbstractAppearanceHandler.java`
#### Snippet
```java
     * 
     * @param cs Content stream
     * @param x
     * @param y
     * @param len The arm length. Positive goes to the right, negative goes to the left.
```

### JavadocDeclaration
`@param y` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDAbstractAppearanceHandler.java`
#### Snippet
```java
     * @param cs Content stream
     * @param x
     * @param y
     * @param len The arm length. Positive goes to the right, negative goes to the left.
     * 
```

### JavadocDeclaration
`@throws` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDAbstractAppearanceHandler.java`
#### Snippet
```java
     *
     * @return the appearance entry representing the normal appearance.
     * @throws IOException 
     */
    PDAppearanceContentStream getNormalAppearanceAsContentStream() throws IOException
```

### JavadocDeclaration
`@param x` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDAbstractAppearanceHandler.java`
#### Snippet
```java
     *
     * @param cs Content stream
     * @param x
     * @param y
     * @param r Radius (to a corner)
```

### JavadocDeclaration
`@param y` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDAbstractAppearanceHandler.java`
#### Snippet
```java
     * @param cs Content stream
     * @param x
     * @param y
     * @param r Radius (to a corner)
     * 
```

### JavadocDeclaration
`@param style` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDAbstractAppearanceHandler.java`
#### Snippet
```java
     * Draw a line ending style.
     * 
     * @param style
     * @param cs
     * @param x
```

### JavadocDeclaration
`@param cs` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDAbstractAppearanceHandler.java`
#### Snippet
```java
     * 
     * @param style
     * @param cs
     * @param x
     * @param y
```

### JavadocDeclaration
`@param x` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDAbstractAppearanceHandler.java`
#### Snippet
```java
     * @param style
     * @param cs
     * @param x
     * @param y
     * @param width
```

### JavadocDeclaration
`@param y` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDAbstractAppearanceHandler.java`
#### Snippet
```java
     * @param cs
     * @param x
     * @param y
     * @param width
     * @param hasStroke
```

### JavadocDeclaration
`@param width` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDAbstractAppearanceHandler.java`
#### Snippet
```java
     * @param x
     * @param y
     * @param width
     * @param hasStroke
     * @param hasBackground
```

### JavadocDeclaration
`@param hasStroke` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDAbstractAppearanceHandler.java`
#### Snippet
```java
     * @param y
     * @param width
     * @param hasStroke
     * @param hasBackground
     * @param ending false if left, true if right of an imagined horizontal line (important for
```

### JavadocDeclaration
`@param hasBackground` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDAbstractAppearanceHandler.java`
#### Snippet
```java
     * @param width
     * @param hasStroke
     * @param hasBackground
     * @param ending false if left, true if right of an imagined horizontal line (important for
     * arrows).
```

### JavadocDeclaration
`@throws` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDAbstractAppearanceHandler.java`
#### Snippet
```java
     * arrows).
     *
     * @throws IOException
     */
    void drawStyle(String style, final PDAppearanceContentStream cs, float x, float y,
```

### JavadocDeclaration
`@throws` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDAbstractAppearanceHandler.java`
#### Snippet
```java
     * creating long content streams.
     * @return the appearance entry representing the normal appearance.
     * @throws IOException
     */
    PDAppearanceContentStream getNormalAppearanceAsContentStream(boolean compress) throws IOException
```

### JavadocDeclaration
`@param x` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDAbstractAppearanceHandler.java`
#### Snippet
```java
     *
     * @param cs Content stream
     * @param x
     * @param y
     * @param r Radius
```

### JavadocDeclaration
`@param y` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/PDAbstractAppearanceHandler.java`
#### Snippet
```java
     * @param cs Content stream
     * @param x
     * @param y
     * @param r Radius
     * 
```

### JavadocDeclaration
`@param templateHeight` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/digitalsignature/visible/PDVisibleSignDesigner.java`
#### Snippet
```java
    /**
     * 
     * @param templateHeight
     * @return Visible Signature Configuration Object
     */
```

### JavadocDeclaration
`@param image` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/digitalsignature/visible/PDVisibleSignDesigner.java`
#### Snippet
```java
     * Set image and its height and width.
     *
     * @param image
     */
    private void setImage(BufferedImage image)
```

### JavadocDeclaration
`@param document` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/digitalsignature/visible/PDVisibleSignDesigner.java`
#### Snippet
```java
     * the page media box.
     * 
     * @param document
     * @param page The 1-based page number for which the page size should be calculated.
     * @throws IllegalArgumentException if the page argument is lower than 0.
```

### JavadocDeclaration
`@param newChild` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/documentnavigation/outline/PDOutlineNode.java`
#### Snippet
```java
     * Count key in the parent hierarchy.
     * 
     * @param newChild
     */
    private void append(PDOutlineItem newChild)
```

### JavadocDeclaration
`@param newChild` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/documentnavigation/outline/PDOutlineNode.java`
#### Snippet
```java
     * Count key in the parent hierarchy.
     * 
     * @param newChild
     */
    private void prepend(PDOutlineItem newChild)
```

### JavadocDeclaration
`@param node` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/documentnavigation/outline/PDOutlineNode.java`
#### Snippet
```java

    /**
     * @param node
     * @throws IllegalArgumentException if the given node is part of a list (i.e. if it has a previous or a next
     * sibling)
```

### JavadocDeclaration
`@return` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/multipdf/Overlay.java`
#### Snippet
```java
     * Create a LayoutPage object from given PDPage object.
     *
     * @return
     * @throws IOException 
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/multipdf/Overlay.java`
#### Snippet
```java
     *
     * @return
     * @throws IOException 
     */
    private LayoutPage createLayoutPage(PDPage page) throws IOException
```

### JavadocDeclaration
`@param doc` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/multipdf/Overlay.java`
#### Snippet
```java
     * Create a LayoutPage object from the first page of the given document.
     *
     * @param doc
     * @return
     * @throws IOException 
```

### JavadocDeclaration
`@return` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/multipdf/Overlay.java`
#### Snippet
```java
     *
     * @param doc
     * @return
     * @throws IOException 
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/multipdf/Overlay.java`
#### Snippet
```java
     * @param doc
     * @return
     * @throws IOException 
     */
    private LayoutPage getLayoutPage(PDDocument doc) throws IOException
```

### JavadocDeclaration
`@param parentTreeEntry` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/multipdf/PDFMergerUtility.java`
#### Snippet
```java
     * Update the Pg and Obj references to the new (merged) page.
     *
     * @param parentTreeEntry
     * @param objMapping mapping between old and new references
     */
```

### JavadocDeclaration
`@param dictionary` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/BruteForceParser.java`
#### Snippet
```java
     * Tell if the dictionary is a PDF or FDF catalog.
     * 
     * @param dictionary
     * @return true if the given dictionary is a root dictionary
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/BaseParser.java`
#### Snippet
```java
     *
     * @return the corrected value of the brace counter
     * @throws IOException
     */
    private int checkForEndOfString(final int bracesParameter) throws IOException
```

### JavadocDeclaration
Javadoc pointing to itself
in `pdfbox/src/main/java/org/apache/pdfbox/rendering/PDFRenderer.java`
#### Snippet
```java
     *
     * @return get the image downscaling optimization threshold. See
     * {@link #getImageDownscalingOptimizationThreshold()} for details.
     */
    public float getImageDownscalingOptimizationThreshold()
```

### JavadocDeclaration
`@param startXRefOffset` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/COSParser.java`
#### Snippet
```java
     * Check if the cross reference table/stream can be found at the current offset.
     * 
     * @param startXRefOffset
     * @return the revised offset
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/COSParser.java`
#### Snippet
```java
     * @param startXRefOffset
     * @return the revised offset
     * @throws IOException
     */
    private long checkXRefOffset(long startXRefOffset) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdfwriter/COSWriter.java`
#### Snippet
```java
     * signatures.
     *
     * @throws IOException
     */
    private void doWriteIncrement() throws IOException
```

### JavadocDeclaration
`@param base` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdfwriter/COSWriter.java`
#### Snippet
```java
     * Convenience method, so that we get false for types that can't be updated.
     * 
     * @param base
     * @return
     */
```

### JavadocDeclaration
`@return` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/pdfwriter/COSWriter.java`
#### Snippet
```java
     * 
     * @param base
     * @return
     */
    private boolean isNeedToBeUpdated(COSBase base)
```

### JavadocDeclaration
`@throws` tag description is missing
in `pdfbox/src/main/java/org/apache/pdfbox/rendering/PageDrawer.java`
#### Snippet
```java
         * @param backdropColor the color according to the /bc entry to be used for luminosity soft
         * masks.
         * @throws IOException
         */
        private TransparencyGroup(PDTransparencyGroup form, boolean isSoftMask, Matrix ctm, 
```

### JavadocDeclaration
`@param asb` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/cff/Type1CharString.java`
#### Snippet
```java
     *
     * Makes an accented character from two other characters.
     * @param asb
     */
    private void seac(Number asb, Number adx, Number ady, Number bchar, Number achar)
```

### JavadocDeclaration
`@param numbers` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/cff/Type2CharString.java`
#### Snippet
```java

    /**
     * @param numbers  
     * @param horizontal 
     */
```

### JavadocDeclaration
`@param horizontal` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/cff/Type2CharString.java`
#### Snippet
```java
    /**
     * @param numbers  
     * @param horizontal 
     */
    private void expandStemHints(List<Number> numbers, boolean horizontal)
```

### JavadocDeclaration
`@param randomAccessRead` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/ttf/TrueTypeCollection.java`
#### Snippet
```java
     * Creates a new TrueTypeCollection from a RandomAccessRead.
     *
     * @param randomAccessRead 
     * @throws IOException If the font could not be parsed.
     */
```

### JavadocDeclaration
IOException is not declared to be thrown by method GlyfSimpleDescript
in `fontbox/src/main/java/org/apache/fontbox/ttf/GlyfSimpleDescript.java`
#### Snippet
```java
     * Constructor for an empty description.
     * 
     * @throws IOException is thrown if something went wrong
     */
    GlyfSimpleDescript()
```

### JavadocDeclaration
`@param tags` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/ttf/GlyphSubstitutionTable.java`
#### Snippet
```java
     * context.
     *
     * @param tags
     * @return The best OpenType script tag
     */
```

### JavadocDeclaration
`@param dataInput` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFParser.java`
#### Snippet
```java
    /**
     * Read the Format 0 of the FDSelect data structure.
     * @param dataInput
     * @param nGlyphs
     * @return the Format 0 of the FDSelect data
```

### JavadocDeclaration
`@param nGlyphs` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFParser.java`
#### Snippet
```java
     * Read the Format 0 of the FDSelect data structure.
     * @param dataInput
     * @param nGlyphs
     * @return the Format 0 of the FDSelect data
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFParser.java`
#### Snippet
```java
     * @param nGlyphs
     * @return the Format 0 of the FDSelect data
     * @throws IOException
     */
    private static Format0FDSelect readFormat0FDSelect(DataInput dataInput, int nGlyphs)
```

### JavadocDeclaration
`@param dataInput` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFParser.java`
#### Snippet
```java
    /**
     * Read the FDSelect Data according to the format.
     * @param dataInput
     * @param nGlyphs
     * @return the FDSelect data
```

### JavadocDeclaration
`@param nGlyphs` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFParser.java`
#### Snippet
```java
     * Read the FDSelect Data according to the format.
     * @param dataInput
     * @param nGlyphs
     * @return the FDSelect data
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFParser.java`
#### Snippet
```java
     * @param nGlyphs
     * @return the FDSelect data
     * @throws IOException
     */
    private static FDSelect readFDSelect(DataInput dataInput, int nGlyphs) throws IOException
```

### JavadocDeclaration
`@param dataInput` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFParser.java`
#### Snippet
```java
     * Read the Format 3 of the FDSelect data structure.
     * 
     * @param dataInput
     * @return the Format 3 of the FDSelect data
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/cff/CFFParser.java`
#### Snippet
```java
     * @param dataInput
     * @return the Format 3 of the FDSelect data
     * @throws IOException
     */
    private static Format3FDSelect readFormat3FDSelect(DataInput dataInput)
```

### JavadocDeclaration
`@param character` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/type1/Token.java`
#### Snippet
```java
    /**
     * Constructs a new Token object given its single-character text and kind.
     * @param character
     * @param type
     */
```

### JavadocDeclaration
`@param type` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/type1/Token.java`
#### Snippet
```java
     * Constructs a new Token object given its single-character text and kind.
     * @param character
     * @param type
     */
    Token(char character, Kind type)
```

### JavadocDeclaration
`@param data` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/type1/Token.java`
#### Snippet
```java
     * Constructs a new Token object given its raw data and kind.
     * This is for CHARSTRING tokens only.
     * @param data
     * @param type
     */
```

### JavadocDeclaration
`@param type` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/type1/Token.java`
#### Snippet
```java
     * This is for CHARSTRING tokens only.
     * @param data
     * @param type
     */
    Token(byte[] data, Kind type)
```

### JavadocDeclaration
`@param text` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/type1/Token.java`
#### Snippet
```java
    /**
     * Constructs a new Token object given its text and kind.
     * @param text
     * @param type
     */
```

### JavadocDeclaration
`@param type` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/type1/Token.java`
#### Snippet
```java
     * Constructs a new Token object given its text and kind.
     * @param text
     * @param type
     */
    Token(String text, Kind type)
```

### JavadocDeclaration
`@param codePoint` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/ttf/OpenTypeScript.java`
#### Snippet
```java
     * Obtain the Unicode script associated with the given Unicode codepoint.
     *
     * @param codePoint
     * @return A Unicode script string, or {@code #UNKNOWN} if unknown
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/type1/Type1Parser.java`
#### Snippet
```java
     * @param segment1 Segment 1: ASCII
     * @param segment2 Segment 2: Binary
     * @throws IOException
     */
    public Type1Font parse(byte[] segment1, byte[] segment2) throws IOException
```

### JavadocDeclaration
Tag `return` is not allowed here
in `fontbox/src/main/java/org/apache/fontbox/type1/Type1Parser.java`
#### Snippet
```java
     * and does not have the given value.
     * 
     * @return token, never null
     */
    private void read(Token.Kind kind, String name) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `io/src/main/java/org/apache/pdfbox/io/ScratchFileBuffer.java`
#### Snippet
```java
     *         and current pointer points at end of last page
     * 
     * @throws IOException
     */
    private boolean ensureAvailableBytesInPage(boolean addNewPageIfNeeded) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `io/src/main/java/org/apache/pdfbox/io/ScratchFile.java`
#### Snippet
```java
     * @return byte array of size {@link #PAGE_SIZE} filled with page data read from file 
     * 
     * @throws IOException
     */
    byte[] readPage(int pageIdx) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `fontbox/src/main/java/org/apache/fontbox/type1/Type1Lexer.java`
#### Snippet
```java
     * Constructs a new Type1Lexer given a header-less .pfb segment.
     * @param bytes Header-less .pfb segment
     * @throws IOException
     */
    Type1Lexer(byte[] bytes) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `io/src/main/java/org/apache/pdfbox/io/RandomAccessReadView.java`
#### Snippet
```java
     * Restore the current position within the underlying random access read.
     * 
     * @throws IOException
     */
    private void restorePosition() throws IOException
```

### JavadocDeclaration
`@return` tag description is missing
in `io/src/main/java/org/apache/pdfbox/io/IOUtils.java`
#### Snippet
```java
     * This is adapted from org.apache.lucene.store.MMapDirectory
     * 
     * @return
     */
    private static Consumer<ByteBuffer> unmapper()
```

### JavadocDeclaration
`@param dateString` tag description is missing
in `xmpbox/src/main/java/org/apache/xmpbox/DateConverter.java`
#### Snippet
```java
     * Get a Calendar from an ISO8601 date string.
     * 
     * @param dateString
     * @return the Calendar instance.
     */
```

### JavadocDeclaration
`@param document` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/util/DrawPrintTextLocations.java`
#### Snippet
```java
     * Instantiate a new PDFTextStripper object.
     *
     * @param document
     * @param filename
     * @throws IOException If there is an error loading the properties.
```

### JavadocDeclaration
`@param filename` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/util/DrawPrintTextLocations.java`
#### Snippet
```java
     *
     * @param document
     * @param filename
     * @throws IOException If there is an error loading the properties.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/ExtractMetadata.java`
#### Snippet
```java
     *
     * @throws IOException If there is an error parsing the document.
     * @throws XmpParsingException
     * @throws BadFieldValueException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/ExtractMetadata.java`
#### Snippet
```java
     * @throws IOException If there is an error parsing the document.
     * @throws XmpParsingException
     * @throws BadFieldValueException
     */
    public static void main(String[] args) throws IOException, XmpParsingException, BadFieldValueException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/AddMetadataFromDocInfo.java`
#### Snippet
```java
     *
     * @throws IOException If there is an error parsing the document.
     * @throws TransformerException
     */
    public static void main( String[] args ) throws IOException, TransformerException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ValidationTimeStamp.java`
#### Snippet
```java
     * @param signer information about signer
     * @return information about SignerInformation
     * @throws IOException
     */
    private SignerInformation signTimeStamp(SignerInformation signer)
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ValidationTimeStamp.java`
#### Snippet
```java
     * @param content InputStream of the content to sign
     * @return the byte[] of the timestamp token
     * @throws IOException
     */
    public byte[] getTimeStampToken(InputStream content) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ValidationTimeStamp.java`
#### Snippet
```java
     * @param signedData Generated CMS signed data
     * @return CMSSignedData Extended CMS signed data
     * @throws IOException
     */
    public CMSSignedData addSignedTimeStamp(CMSSignedData signedData)
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ValidationTimeStamp.java`
#### Snippet
```java
    /**
     * @param tsaUrl The url where TS-Request will be done.
     * @throws NoSuchAlgorithmException
     * @throws MalformedURLException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ValidationTimeStamp.java`
#### Snippet
```java
     * @param tsaUrl The url where TS-Request will be done.
     * @throws NoSuchAlgorithmException
     * @throws MalformedURLException
     */
    public ValidationTimeStamp(String tsaUrl) throws NoSuchAlgorithmException, MalformedURLException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateSignatureBase.java`
#### Snippet
```java
     * answer</a> or <a href="https://stackoverflow.com/questions/56867465">this answer</a>.
     *
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateSignedTimeStamp.java`
#### Snippet
```java
     * @param document given Pdf
     * @param output Where the file will be written
     * @throws IOException
     */
    public void signDetached(PDDocument document, OutputStream output) throws IOException
```

### JavadocDeclaration
`@param content` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/TSAClient.java`
#### Snippet
```java
    /**
     *
     * @param content
     * @return the time stamp token
     * @throws IOException if there was an error with the connection or data from the TSA server,
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature2.java`
#### Snippet
```java
     * @param humanRect rectangle from a human viewpoint (coordinates start at top left)
     * @param tsaUrl optional TSA url
     * @throws IOException
     */
    public void signPDF(File inputFile, File signedFile, Rectangle2D humanRect, String tsaUrl) throws IOException
```

### JavadocDeclaration
`@param args` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature2.java`
#### Snippet
```java
     * [3] image of visible signature
     *
     * @param args
     * @throws java.security.KeyStoreException
     * @throws java.security.cert.CertificateException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature2.java`
#### Snippet
```java
     *
     * @param args
     * @throws java.security.KeyStoreException
     * @throws java.security.cert.CertificateException
     * @throws java.io.IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature2.java`
#### Snippet
```java
     * @param args
     * @throws java.security.KeyStoreException
     * @throws java.security.cert.CertificateException
     * @throws java.io.IOException
     * @throws java.security.NoSuchAlgorithmException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature2.java`
#### Snippet
```java
     * @throws java.security.KeyStoreException
     * @throws java.security.cert.CertificateException
     * @throws java.io.IOException
     * @throws java.security.NoSuchAlgorithmException
     * @throws java.security.UnrecoverableKeyException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature2.java`
#### Snippet
```java
     * @throws java.security.cert.CertificateException
     * @throws java.io.IOException
     * @throws java.security.NoSuchAlgorithmException
     * @throws java.security.UnrecoverableKeyException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature2.java`
#### Snippet
```java
     * @throws java.io.IOException
     * @throws java.security.NoSuchAlgorithmException
     * @throws java.security.UnrecoverableKeyException
     */
    public static void main(String[] args) throws KeyStoreException, CertificateException,
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature2.java`
#### Snippet
```java
     * @param tsaUrl optional TSA url
     * @param signatureFieldName optional name of an existing (unsigned) signature field
     * @throws IOException
     */
    public void signPDF(File inputFile, File signedFile, Rectangle2D humanRect, String tsaUrl, String signatureFieldName) throws IOException
```

### JavadocDeclaration
`@param lateExternalSigning` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature2.java`
#### Snippet
```java
     * by default.
     *
     * @param lateExternalSigning
     */
    public void setLateExternalSigning(boolean lateExternalSigning)
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateEmbeddedTimeStamp.java`
#### Snippet
```java
     * @param docBytes byte array of the document
     * @param output target, where the file will be written
     * @throws IOException
     */
    private void embedNewSignatureIntoDocument(byte[] docBytes, OutputStream output)
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateEmbeddedTimeStamp.java`
#### Snippet
```java
     * 
     * @param documentBytes byte[] of the input file
     * @throws IOException
     * @throws CMSException
     * @throws NoSuchAlgorithmException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/SigUtils.java`
#### Snippet
```java
     * @return the X.509 certificate.
     *
     * @throws GeneralSecurityException
     * @throws IOException 
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateEmbeddedTimeStamp.java`
#### Snippet
```java
     * @param documentBytes byte[] of the input file
     * @throws IOException
     * @throws CMSException
     * @throws NoSuchAlgorithmException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/SigUtils.java`
#### Snippet
```java
     *
     * @throws GeneralSecurityException
     * @throws IOException 
     */
    public static X509Certificate getTsaCertificate(String tsaUrl)
```

### JavadocDeclaration
`@param urlString` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/SigUtils.java`
#### Snippet
```java
     * Like {@link URL#openStream()} but will follow redirection from http to https.
     *
     * @param urlString
     * @return
     * @throws IOException 
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateEmbeddedTimeStamp.java`
#### Snippet
```java
     * @throws IOException
     * @throws CMSException
     * @throws NoSuchAlgorithmException
     */
    private void processRelevantSignatures(byte[] documentBytes)
```

### JavadocDeclaration
`@return` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/SigUtils.java`
#### Snippet
```java
     *
     * @param urlString
     * @return
     * @throws IOException 
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/SigUtils.java`
#### Snippet
```java
     * @param urlString
     * @return
     * @throws IOException 
     */
    public static InputStream openURL(String urlString) throws IOException
```

### JavadocDeclaration
`@param x509Certificate` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/SigUtils.java`
#### Snippet
```java
     * Log if the certificate is not valid for responding.
     *
     * @param x509Certificate 
     * @throws java.security.cert.CertificateParsingException 
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateEmbeddedTimeStamp.java`
#### Snippet
```java
     * @param inFile The pdf file possibly containing signatures
     * @param outFile Where the changed document will be saved
     * @throws IOException
     */
    public void embedTimeStamp(File inFile, File outFile) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/SigUtils.java`
#### Snippet
```java
     *
     * @param x509Certificate 
     * @throws java.security.cert.CertificateParsingException 
     */
    public static void checkResponderCertificateUsage(X509Certificate x509Certificate)
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateEmbeddedTimeStamp.java`
#### Snippet
```java
     * 
     * @param file the PDF file to sign and to overwrite
     * @throws IOException
     */
    public void embedTimeStamp(File file) throws IOException
```

### JavadocDeclaration
`@param x509Certificate` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/SigUtils.java`
#### Snippet
```java
     * Log if the certificate is not valid for timestamping.
     *
     * @param x509Certificate 
     * @throws java.security.cert.CertificateParsingException 
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateEmbeddedTimeStamp.java`
#### Snippet
```java
     * @param inFile The existing PDF file
     * @param outFile Where the new file will be written to
     * @throws IOException
     */
    private void processTimeStamping(File inFile, File outFile) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/SigUtils.java`
#### Snippet
```java
     *
     * @param x509Certificate 
     * @throws java.security.cert.CertificateParsingException 
     */
    public static void checkTimeStampCertificateUsage(X509Certificate x509Certificate)
```

### JavadocDeclaration
`@param x509Certificate` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/SigUtils.java`
#### Snippet
```java
     * anyway results in Adobe Reader failing to validate the PDF.
     *
     * @param x509Certificate 
     * @throws java.security.cert.CertificateParsingException 
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/SigUtils.java`
#### Snippet
```java
     *
     * @param x509Certificate 
     * @throws java.security.cert.CertificateParsingException 
     */
    public static void checkCertificateUsage(X509Certificate x509Certificate)
```

### JavadocDeclaration
`@param timeStampToken` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/SigUtils.java`
#### Snippet
```java
    /**
     * Extract X.509 certificate from a timestamp
     * @param timeStampToken
     * @return the X.509 certificate.
     * @throws CertificateException 
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/SigUtils.java`
#### Snippet
```java
     * @param timeStampToken
     * @return the X.509 certificate.
     * @throws CertificateException 
     */
    public static X509Certificate getCertificateFromTimeStampToken(TimeStampToken timeStampToken)
```

### JavadocDeclaration
`@param certificatesStore` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/SigUtils.java`
#### Snippet
```java
     * <a href="https://issues.apache.org/jira/browse/PDFBOX-3017">PDFBOX-3017</a>.
     *
     * @param certificatesStore
     * @param certFromSignedData
     * @param signDate
```

### JavadocDeclaration
`@param certFromSignedData` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/SigUtils.java`
#### Snippet
```java
     *
     * @param certificatesStore
     * @param certFromSignedData
     * @param signDate
     * @throws CertificateVerificationException
```

### JavadocDeclaration
`@param signDate` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/SigUtils.java`
#### Snippet
```java
     * @param certificatesStore
     * @param certFromSignedData
     * @param signDate
     * @throws CertificateVerificationException
     * @throws CertificateException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/SigUtils.java`
#### Snippet
```java
     * @param certFromSignedData
     * @param signDate
     * @throws CertificateVerificationException
     * @throws CertificateException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/SigUtils.java`
#### Snippet
```java
     * @param signDate
     * @throws CertificateVerificationException
     * @throws CertificateException
     */
    public static void verifyCertificateChain(Store<X509CertificateHolder> certificatesStore,
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
     * @param tsaUrl optional TSA url
     * @param signatureFieldName optional name of an existing (unsigned) signature field
     * @throws IOException
     */
    public void signPDF(File inputFile, File signedFile, String tsaUrl, String signatureFieldName) throws IOException
```

### JavadocDeclaration
`@param name` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
     * Set visible signature properties for new signature fields.
     * 
     * @param name
     * @param location
     * @param reason
```

### JavadocDeclaration
`@param location` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
     * 
     * @param name
     * @param location
     * @param reason
     * @param preferredSize
```

### JavadocDeclaration
`@param reason` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
     * @param name
     * @param location
     * @param reason
     * @param preferredSize
     * @param page the signature should be placed on (1-based)
```

### JavadocDeclaration
`@param preferredSize` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
     * @param location
     * @param reason
     * @param preferredSize
     * @param page the signature should be placed on (1-based)
     * @param visualSignEnabled
```

### JavadocDeclaration
`@param visualSignEnabled` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
     * @param preferredSize
     * @param page the signature should be placed on (1-based)
     * @param visualSignEnabled
     */
    public void setVisibleSignatureProperties(String name, String location, String reason, int preferredSize, 
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
     * @param imageStream input stream of an image.
     * @param page the signature should be placed on (1-based)
     * @throws IOException
     */
    public void setVisibleSignDesigner(String filename, int x, int y, int zoomPercent, 
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
     * @param signedFile The file to be signed.
     * @param tsaUrl optional TSA url
     * @throws IOException
     */
    public void signPDF(File inputFile, File signedFile, String tsaUrl) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
     * @param zoomPercent increase (positive value) or decrease (negative value) image with x percent.
     * @param imageStream input stream of an image.
     * @throws IOException
     */
    public void setVisibleSignDesigner(int zoomPercent, InputStream imageStream) 
```

### JavadocDeclaration
`@param args` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
     * [3] image of visible signature
     *
     * @param args
     * @throws java.security.KeyStoreException
     * @throws java.security.cert.CertificateException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
     *
     * @param args
     * @throws java.security.KeyStoreException
     * @throws java.security.cert.CertificateException
     * @throws java.io.IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
     * @param args
     * @throws java.security.KeyStoreException
     * @throws java.security.cert.CertificateException
     * @throws java.io.IOException
     * @throws java.security.NoSuchAlgorithmException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
     * @throws java.security.KeyStoreException
     * @throws java.security.cert.CertificateException
     * @throws java.io.IOException
     * @throws java.security.NoSuchAlgorithmException
     * @throws java.security.UnrecoverableKeyException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
     * @throws java.security.cert.CertificateException
     * @throws java.io.IOException
     * @throws java.security.NoSuchAlgorithmException
     * @throws java.security.UnrecoverableKeyException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
     * @throws java.io.IOException
     * @throws java.security.NoSuchAlgorithmException
     * @throws java.security.UnrecoverableKeyException
     */
    public static void main(String[] args) throws KeyStoreException, CertificateException,
```

### JavadocDeclaration
`@param lateExternalSigning` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
     * by default.
     *
     * @param lateExternalSigning
     */
    public void setLateExternalSigning(boolean lateExternalSigning)
```

### JavadocDeclaration
`@param name` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
     * Set visible signature properties for existing signature fields.
     * 
     * @param name
     * @param location
     * @param reason
```

### JavadocDeclaration
`@param location` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
     * 
     * @param name
     * @param location
     * @param reason
     * @param visualSignEnabled
```

### JavadocDeclaration
`@param reason` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
     * @param name
     * @param location
     * @param reason
     * @param visualSignEnabled
     */
```

### JavadocDeclaration
`@param visualSignEnabled` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateVisibleSignature.java`
#### Snippet
```java
     * @param location
     * @param reason
     * @param visualSignEnabled
     */
    public void setVisibleSignatureProperties(String name, String location, String reason,
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/CertificateVerifier.java`
#### Snippet
```java
     * @param cert X.509 certificate
     * @return the URL of the OCSP validation service
     * @throws IOException 
     */
    private static String extractOCSPURL(X509Certificate cert) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/CertificateVerifier.java`
#### Snippet
```java
     * @param cert The X.509 certificate to check.
     * @return true if the certificate is self-signed, false if not.
     * @throws java.security.GeneralSecurityException 
     */
    public static boolean isSelfSigned(X509Certificate cert) throws GeneralSecurityException
```

### JavadocDeclaration
`@param additionalCerts` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/CertificateVerifier.java`
#### Snippet
```java
     *
     * @param ocspHelper the OCSP helper.
     * @param additionalCerts
     * @throws RevokedCertificateException
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/CertInformationCollector.java`
#### Snippet
```java
     *
     * @param signerInformation of the signature, to get unsigned attributes from it.
     * @throws IOException
     * @throws CertificateProccessingException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/CertificateVerifier.java`
#### Snippet
```java
     * @param ocspHelper the OCSP helper.
     * @param additionalCerts
     * @throws RevokedCertificateException
     * @throws IOException
     * @throws OCSPException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/CertInformationCollector.java`
#### Snippet
```java
     * @param signerInformation of the signature, to get unsigned attributes from it.
     * @throws IOException
     * @throws CertificateProccessingException
     */
    private void addTimestampCerts(SignerInformation signerInformation)
```

### JavadocDeclaration
`@param certificate` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/CertInformationCollector.java`
#### Snippet
```java
     * Traverse a certificate.
     *
     * @param certificate
     * @return
     * @throws CertificateProccessingException 
```

### JavadocDeclaration
`@return` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/CertInformationCollector.java`
#### Snippet
```java
     *
     * @param certificate
     * @return
     * @throws CertificateProccessingException 
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/CertInformationCollector.java`
#### Snippet
```java
     * @param certificate
     * @return
     * @throws CertificateProccessingException 
     */
    CertSignatureInformation getCertInfo(X509Certificate certificate) throws CertificateProccessingException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/CertInformationCollector.java`
#### Snippet
```java
     * @param signatureContent the byte[]-Content of the signature
     * @return the CertSignatureInformation for this signature
     * @throws IOException
     * @throws CertificateProccessingException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/CertInformationCollector.java`
#### Snippet
```java
     * @return the CertSignatureInformation for this signature
     * @throws IOException
     * @throws CertificateProccessingException
     */
    private CertSignatureInformation getCertInfo(byte[] signatureContent)
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/CertificateVerifier.java`
#### Snippet
```java
     * @param additionalCerts
     * @throws RevokedCertificateException
     * @throws IOException
     * @throws OCSPException
     * @throws CertificateVerificationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/CertificateVerifier.java`
#### Snippet
```java
     * @throws RevokedCertificateException
     * @throws IOException
     * @throws OCSPException
     * @throws CertificateVerificationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/CertificateVerifier.java`
#### Snippet
```java
     * @throws IOException
     * @throws OCSPException
     * @throws CertificateVerificationException
     */
    private static void verifyOCSP(OcspHelper ocspHelper, Set<X509Certificate> additionalCerts)
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/OcspHelper.java`
#### Snippet
```java
     * thrown. Never returns null.
     *
     * @throws IOException
     * @throws OCSPException
     * @throws RevokedCertificateException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/OcspHelper.java`
#### Snippet
```java
     *
     * @throws IOException
     * @throws OCSPException
     * @throws RevokedCertificateException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/OcspHelper.java`
#### Snippet
```java
     * @throws IOException
     * @throws OCSPException
     * @throws RevokedCertificateException
     */
    public OCSPResp getResponseOcsp() throws IOException, OCSPException, RevokedCertificateException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/OcspHelper.java`
#### Snippet
```java
     *
     * @return OCSP request, ready to fetch data
     * @throws OCSPException
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/OcspHelper.java`
#### Snippet
```java
     * @return OCSP request, ready to fetch data
     * @throws OCSPException
     * @throws IOException
     */
    private OCSPReq generateOCSPRequest() throws OCSPException, IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/OcspHelper.java`
#### Snippet
```java
     * 
     * @param ocspResponse to be verified
     * @throws OCSPException
     * @throws RevokedCertificateException
     * @throws IOException if the default security provider can't be instantiated
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/OcspHelper.java`
#### Snippet
```java
     * @param ocspResponse to be verified
     * @throws OCSPException
     * @throws RevokedCertificateException
     * @throws IOException if the default security provider can't be instantiated
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/OcspHelper.java`
#### Snippet
```java
     * @param urlString URL of OCSP service.
     * @return the OCSPResp, that has been fetched from the ocspUrl
     * @throws IOException
     * @throws OCSPException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/OcspHelper.java`
#### Snippet
```java
     * @return the OCSPResp, that has been fetched from the ocspUrl
     * @throws IOException
     * @throws OCSPException
     */
    private OCSPResp performRequest(String urlString) throws IOException, OCSPException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/AddValidationInformation.java`
#### Snippet
```java
     * @param data to write into the COSStream
     * @return COSStream a COSStream object that can be added to the document
     * @throws IOException
     */
    private COSStream writeDataToStream(byte[] data) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/AddValidationInformation.java`
#### Snippet
```java
     * @param filename in file to extract signature
     * @param output where to write the changed document
     * @throws IOException
     */
    private void doValidation(String filename, OutputStream output) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
     * @param contents the /Contents field as a COSString
     * @param sig the PDF signature (the /V dictionary)
     * @throws CMSException
     * @throws OperatorCreationException
     * @throws GeneralSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/AddValidationInformation.java`
#### Snippet
```java
     * 
     * @param certInfo the certificate info, for it to check OCSP data.
     * @throws IOException
     * @throws OCSPException
     * @throws CertificateProccessingException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/AddValidationInformation.java`
#### Snippet
```java
     * @param certInfo the certificate info, for it to check OCSP data.
     * @throws IOException
     * @throws OCSPException
     * @throws CertificateProccessingException
     * @throws RevokedCertificateException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/AddValidationInformation.java`
#### Snippet
```java
     * @throws IOException
     * @throws OCSPException
     * @throws CertificateProccessingException
     * @throws RevokedCertificateException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/AddValidationInformation.java`
#### Snippet
```java
     * @throws OCSPException
     * @throws CertificateProccessingException
     * @throws RevokedCertificateException
     */
    private void addOcspData(CertSignatureInformation certInfo) throws IOException, OCSPException,
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/AddValidationInformation.java`
#### Snippet
```java
     * certificateStore of certInformationHelper. This should be the only call to fill certs.
     *
     * @throws IOException
     */
    private void addAllCertsToCertArray() throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/AddValidationInformation.java`
#### Snippet
```java
     * 
     * @param certInfo the certificate info, for it to check CRL data.
     * @throws IOException
     * @throws RevokedCertificateException
     * @throws GeneralSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/AddValidationInformation.java`
#### Snippet
```java
     * @param certInfo the certificate info, for it to check CRL data.
     * @throws IOException
     * @throws RevokedCertificateException
     * @throws GeneralSecurityException
     * @throws CertificateVerificationException 
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/AddValidationInformation.java`
#### Snippet
```java
     * @throws IOException
     * @throws RevokedCertificateException
     * @throws GeneralSecurityException
     * @throws CertificateVerificationException 
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/AddValidationInformation.java`
#### Snippet
```java
     * @throws RevokedCertificateException
     * @throws GeneralSecurityException
     * @throws CertificateVerificationException 
     */
    private void addCrlRevocationInfo(CertSignatureInformation certInfo)
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
     * @param sig the PDF signature (the /V dictionary)
     * @throws CMSException
     * @throws OperatorCreationException
     * @throws GeneralSecurityException
     * @throws CertificateVerificationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
     * @throws CMSException
     * @throws OperatorCreationException
     * @throws GeneralSecurityException
     * @throws CertificateVerificationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
     * @throws OperatorCreationException
     * @throws GeneralSecurityException
     * @throws CertificateVerificationException
     */
    private void verifyPKCS7(InputStream signedContentAsStream, byte[] contents, PDSignature sig)
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
     *
     * @throws IOException If there is an error reading the file.
     * @throws org.bouncycastle.tsp.TSPException
     * @throws org.apache.pdfbox.examples.signature.cert.CertificateVerificationException
     * @throws java.security.GeneralSecurityException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
     * @throws IOException If there is an error reading the file.
     * @throws org.bouncycastle.tsp.TSPException
     * @throws org.apache.pdfbox.examples.signature.cert.CertificateVerificationException
     * @throws java.security.GeneralSecurityException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
     * @throws org.bouncycastle.tsp.TSPException
     * @throws org.apache.pdfbox.examples.signature.cert.CertificateVerificationException
     * @throws java.security.GeneralSecurityException
     */
    public static void main(String[] args) throws IOException,
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
     * @param signedContentAsStream the byte sequence that has been signed
     * @param contents the /Contents field as a COSString
     * @throws CMSException
     * @throws NoSuchAlgorithmException
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
     * @param contents the /Contents field as a COSString
     * @throws CMSException
     * @throws NoSuchAlgorithmException
     * @throws IOException
     * @throws TSPException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
     * @throws CMSException
     * @throws NoSuchAlgorithmException
     * @throws IOException
     * @throws TSPException
     * @throws OperatorCreationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
     * @throws NoSuchAlgorithmException
     * @throws IOException
     * @throws TSPException
     * @throws OperatorCreationException
     * @throws CertificateVerificationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
     * @throws IOException
     * @throws TSPException
     * @throws OperatorCreationException
     * @throws CertificateVerificationException
     * @throws CertificateException 
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
     * @throws TSPException
     * @throws OperatorCreationException
     * @throws CertificateVerificationException
     * @throws CertificateException 
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
     * @throws OperatorCreationException
     * @throws CertificateVerificationException
     * @throws CertificateException 
     */
    private void verifyETSIdotRFC3161(InputStream signedContentAsStream, byte[] contents)
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/ShowSignature.java`
#### Snippet
```java
     * @param elements COSArray of elements containing a COS Stream
     * @param description to append on Print
     * @throws IOException
     */
    private void printStreamsFromArray(COSArray elements, String description) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/AddValidationInformation.java`
#### Snippet
```java
     * @param certInfo Certificate information from CertInformationHelper containing certificate
     * chains.
     * @throws IOException
     */
    private void addRevocationData(CertSignatureInformation certInfo) throws IOException
```

### JavadocDeclaration
`@param processName` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/PreflightConfiguration.java`
#### Snippet
```java
     * Return the validation process linked with the given name
     *
     * @param processName
     * @return an instance of validationProcess, null if it doesn't exist and if
     * the errorOnMissingProcess is false.
```

### JavadocDeclaration
`@param cos` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/PreflightContext.java`
#### Snippet
```java
     * Tell if the argument is in the set of processed elements.
     *
     * @param cos
     * @return true if in the set, false if not.
     */
```

### JavadocDeclaration
`@param error` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/PreflightContext.java`
#### Snippet
```java
     * Add the given error the PreflightDocument
     * 
     * @param error
     */
    public void addValidationError(ValidationError error)
```

### JavadocDeclaration
`@param document` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/PreflightContext.java`
#### Snippet
```java
     * Initialize the PDFBox object which present the PDF File.
     * 
     * @param document
     */
    public void setDocument(PreflightDocument document)
```

### JavadocDeclaration
`@param cos` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/PreflightContext.java`
#### Snippet
```java
     * Add the argument to the set of processed elements,
     *
     * @param cos
     */
    public void addToProcessedSet(COSObjectable cos)
```

### JavadocDeclaration
`@return` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/PreflightConfiguration.java`
#### Snippet
```java
     * Get the maximum number of errors after which to abort when possible.
     *
     * @return 
     */
    public int getMaxErrors()
```

### JavadocDeclaration
`@param maxErrors` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/PreflightConfiguration.java`
#### Snippet
```java
     * Set the maximum number of errors after which to abort when possible.
     *
     * @param maxErrors 
     */
    public void setMaxErrors(int maxErrors)
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/PreflightDocument.java`
#### Snippet
```java
     * 
     * @return the validation result
     * @throws ValidationException
     */
    public ValidationResult validate() throws ValidationException
```

### JavadocDeclaration
`@param type` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/PreflightPath.java`
#### Snippet
```java
     * Return the index of the first object that have the given type.
     * 
     * @param type
     * @return the object position, -1 if the type doesn't exist in the stack.
     */
```

### JavadocDeclaration
`@param position` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/PreflightPath.java`
#### Snippet
```java
     * Return the object at the given position. The object must be an instance of the given class.
     * 
     * @param position
     * @param expectedType
     * @return the object at the given position.
```

### JavadocDeclaration
`@param expectedType` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/PreflightPath.java`
#### Snippet
```java
     * 
     * @param position
     * @param expectedType
     * @return the object at the given position.
     */
```

### JavadocDeclaration
`@param isValid` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/ValidationResult.java`
#### Snippet
```java
     * Create a Validation result object
     * 
     * @param isValid
     */
    public ValidationResult(boolean isValid)
```

### JavadocDeclaration
`@param errors` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/ValidationResult.java`
#### Snippet
```java
     * Add a set of errors to the list of ValidationError. If the given list is null, this method does nothing.
     * 
     * @param errors
     */
    public void addErrors(List<ValidationError> errors)
```

### JavadocDeclaration
`@param otherResult` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/ValidationResult.java`
#### Snippet
```java
     * the isValid boolean.
     * 
     * @param otherResult
     */
    public void mergeResult(ValidationResult otherResult)
```

### JavadocDeclaration
`@param errorCode` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/ValidationResult.java`
#### Snippet
```java
         * Create a validation error with the given error code
         * 
         * @param errorCode
         */
        public ValidationError(String errorCode)
```

### JavadocDeclaration
`@param error` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/ValidationResult.java`
#### Snippet
```java
     * Add error to the list of ValidationError. If the given error is null, this method does nothing
     * 
     * @param error
     */
    public void addError(ValidationError error)
```

### JavadocDeclaration
`@param details` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/ValidationResult.java`
#### Snippet
```java
         * Set the error explanation
         * 
         * @param details
         */
        public void setDetails(String details)
```

### JavadocDeclaration
`@param cert` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/CRLVerifier.java`
#### Snippet
```java
     * Point" extension in a X.509 certificate. If CRL distribution point
     * extension is unavailable, returns an empty list.
     * @param cert
     * @return List of CRL distribution point URLs.
     * @throws java.io.IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/CRLVerifier.java`
#### Snippet
```java
     * @param cert
     * @return List of CRL distribution point URLs.
     * @throws java.io.IOException
     */
    public static List<String> getCrlDistributionPoints(X509Certificate cert)
```

### JavadocDeclaration
`@param ctog` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/font/DescendantFontValidator.java`
#### Snippet
```java
     * according to the instance of DescendantFontValidator
     *
     * @param ctog
     */
    protected abstract void checkCIDToGIDMap(COSBase ctog);
```

### JavadocDeclaration
`@param sysinfo` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/font/DescendantFontValidator.java`
#### Snippet
```java
     * </UL>
     * 
     * @param sysinfo
     */
    protected void checkCIDSystemInfo(COSDictionary sysinfo)
```

### JavadocDeclaration
`@param ctog` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/font/DescendantFontValidator.java`
#### Snippet
```java
     * returned.
     *
     * @param ctog
     * @param mandatory true for CIDType2 , false for CIDType0
     */
```

### JavadocDeclaration
`@param arguments` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/font/util/PreflightType3Stream.java`
#### Snippet
```java
     * method process this validation. This method is called by the processOperator method.
     * 
     * @param arguments
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/font/util/PreflightType3Stream.java`
#### Snippet
```java
     * 
     * @param arguments
     * @throws IOException
     */
    private void checkType3FirstOperator(List<COSBase> arguments) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/font/container/FontContainer.java`
#### Snippet
```java
     *
     * @param code character code
     * @throws GlyphException
     */
    public void checkGlyphWidth(int code) throws GlyphException
```

### JavadocDeclaration
`@param pfDescriptor` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/font/descriptor/CIDType2DescriptorHelper.java`
#### Snippet
```java
     * respects conditions, the FontContainer is updated.
     * 
     * @param pfDescriptor
     */
    protected void checkCIDSet(PDFontDescriptor pfDescriptor)
```

### JavadocDeclaration
`@param pfDescriptor` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/font/descriptor/CIDType0DescriptorHelper.java`
#### Snippet
```java
     * respects conditions, the FontContainer is updated.
     * 
     * @param pfDescriptor
     */
    protected void checkCIDSet(PDFontDescriptor pfDescriptor)
```

### JavadocDeclaration
`@param cmap` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/font/Type0FontValidator.java`
#### Snippet
```java
     * is Identity-H or Identity-V so this method is called by the checkCMap method.
     * 
     * @param cmap
     */
    private void compareCIDSystemInfo(COSDictionary cmap)
```

### JavadocDeclaration
`@param cidSysInfo` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/font/Type0FontValidator.java`
#### Snippet
```java
     * </UL>
     * 
     * @param cidSysInfo
     * @return the validation result.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/action/AbstractActionManager.java`
#### Snippet
```java
     * 
     * @return True if all Next Action are valid, false otherwise.
     * @throws ValidationException
     */
    protected boolean validNextActions() throws ValidationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/action/AbstractActionManager.java`
#### Snippet
```java
     *            boolean to know if an additional action is authorized.
     * @return the validation state of the Action dictionary.
     * @throws ValidationException
     */
    public boolean valid(boolean additionalActionAuth) throws ValidationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/action/AbstractActionManager.java`
#### Snippet
```java
     * 
     * @return the validation state.
     * @throws ValidationException
     */
    public boolean valid() throws ValidationException
```

### JavadocDeclaration
`@param context` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/utils/ContextHelper.java`
#### Snippet
```java
     * {@link #callValidation(PreflightContext, Object, String)} method.
     * 
     * @param context
     * @param element
     * @param processName
```

### JavadocDeclaration
`@param element` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/utils/ContextHelper.java`
#### Snippet
```java
     * 
     * @param context
     * @param element
     * @param processName
     * @throws ValidationException
```

### JavadocDeclaration
`@param processName` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/utils/ContextHelper.java`
#### Snippet
```java
     * @param context
     * @param element
     * @param processName
     * @throws ValidationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/utils/ContextHelper.java`
#### Snippet
```java
     * @param element
     * @param processName
     * @throws ValidationException
     */
    public static void validateElement(PreflightContext context, Object element, String processName) throws ValidationException
```

### JavadocDeclaration
`@param element` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/utils/ContextHelper.java`
#### Snippet
```java
     * @param context
     *            (mandatory) the preflight context that contains all required information
     * @param element
     * @param processName
     *            the process to instantiate and to compute
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/utils/ContextHelper.java`
#### Snippet
```java
     * @param processName
     *            the process to instantiate and to compute
     * @throws ValidationException
     */
    private static void callValidation(PreflightContext context, Object element, String processName)
```

### JavadocDeclaration
`@param context` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/utils/ContextHelper.java`
#### Snippet
```java
     * call directly the {@link #callValidation(PreflightContext, Object, String)}
     * 
     * @param context
     * @param processName
     * @throws ValidationException
```

### JavadocDeclaration
`@param processName` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/utils/ContextHelper.java`
#### Snippet
```java
     * 
     * @param context
     * @param processName
     * @throws ValidationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/utils/ContextHelper.java`
#### Snippet
```java
     * @param context
     * @param processName
     * @throws ValidationException
     */
    public static void validateElement(PreflightContext context, String processName) throws ValidationException
```

### JavadocDeclaration
`@param fontDescriptor` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/font/descriptor/FontDescriptorHelper.java`
#### Snippet
```java
     * Return true if the FontDescriptor has only one FontFile entry.
     * 
     * @param fontDescriptor
     * @return true if the FontDescriptor has only one FontFile entry.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/action/ActionManagerFactory.java`
#### Snippet
```java
     *            This map is used to know if an Action has already been validated. It is useful to avoid infinite loop
     *            in an action which has a Next entry.
     * @throws ValidationException
     */
    private void callCreateAction(COSBase aDict, PreflightContext ctx, List<AbstractActionManager> result,
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/action/ActionManagerFactory.java`
#### Snippet
```java
     * @param actionDictionary the dictionary to retrieve the actions from.
     * @return the list of actions from the given dictionary.
     * @throws ValidationException
     */
    public final List<AbstractActionManager> getNextActions(PreflightContext ctx, COSDictionary actionDictionary)
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/action/ActionManagerFactory.java`
#### Snippet
```java
     *            the Action identifier if it is an additional action
     * @return the ActionManager instance.
     * @throws ValidationException
     */
    protected AbstractActionManager createActionManager(PreflightContext ctx, COSDictionary action, String aaKey)
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/action/ActionManagerFactory.java`
#### Snippet
```java
     *            This map is used to know if an Action has already been validated. It is useful to avoid infinite loop
     *            in an action which has a Next entry.
     * @throws ValidationException
     */
    private void callCreateAction(COSBase aDict, PreflightContext ctx, List<AbstractActionManager> result,
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/action/ActionManagerFactory.java`
#### Snippet
```java
     * @param dictionary the dictionary to retrieve the actions from.
     * @return the list of actions from the given dictionary.
     * @throws ValidationException
     */
    public final List<AbstractActionManager> getActionManagers(PreflightContext ctx, COSDictionary dictionary)
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightContentStream.java`
#### Snippet
```java
     * 
     * @param pattern the PDTilingPattern to be validated.
     * @throws ValidationException
     */
    public void validatePatternContentStream(PDTilingPattern pattern) throws ValidationException
```

### JavadocDeclaration
`@param operator` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightContentStream.java`
#### Snippet
```java
     * validation error, a ContentStreamException is thrown. (Use the ValidationError attribute to know the cause)
     * 
     * @param operator
     * @param arguments
     * @throws IOException
```

### JavadocDeclaration
`@param arguments` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightContentStream.java`
#### Snippet
```java
     * 
     * @param operator
     * @param arguments
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightContentStream.java`
#### Snippet
```java
     * @param operator
     * @param arguments
     * @throws IOException
     */
    private void validateStringDefinition(Operator operator, List<?> arguments) throws IOException
```

### JavadocDeclaration
`@param operator` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightContentStream.java`
#### Snippet
```java
     * <code>validateStringDefinition</code> or <code>validateStringArray</code>.
     *
     * @param operator
     * @param arguments
     * @throws IOException
```

### JavadocDeclaration
`@param arguments` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightContentStream.java`
#### Snippet
```java
     *
     * @param operator
     * @param arguments
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightContentStream.java`
#### Snippet
```java
     * @param operator
     * @param arguments
     * @throws IOException
     */
    protected void checkShowTextOperators(Operator operator, List<?> arguments) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightContentStream.java`
#### Snippet
```java
     * Process the validation of a PageContent (The page is initialized by the constructor)
     *
     * @throws ValidationException
     */
    public void validatePageContentStream() throws ValidationException
```

### JavadocDeclaration
`@param operator` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightContentStream.java`
#### Snippet
```java
     * validation error, a ContentStreamException is thrown. (Use the ValidationError attribute to know the cause)
     * 
     * @param operator
     * @param arguments
     * @throws IOException
```

### JavadocDeclaration
`@param arguments` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightContentStream.java`
#### Snippet
```java
     * 
     * @param operator
     * @param arguments
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightContentStream.java`
#### Snippet
```java
     * @param operator
     * @param arguments
     * @throws IOException
     */
    private void validateStringArray(Operator operator, List<?> arguments) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightContentStream.java`
#### Snippet
```java
     * 
     * @param form the PDFormXObject to be validated.
     * @throws ValidationException
     */
    public void validateXObjContentStream(PDFormXObject form) throws ValidationException
```

### JavadocDeclaration
`@param string` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightContentStream.java`
#### Snippet
```java
     * </UL>
     * 
     * @param string
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightContentStream.java`
#### Snippet
```java
     * 
     * @param string
     * @throws IOException
     */
    public void validateText(byte[] string) throws IOException
```

### JavadocDeclaration
`@param context` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/graphic/ICCProfileWrapper.java`
#### Snippet
```java
     * parsed and is used to create a IccProfileWrapper.
     * 
     * @param context
     * @return an instance of ICCProfileWrapper or null if there are no DestOutputProfile
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/AcroFormValidationProcess.java`
#### Snippet
```java
     * @param fields the list of fields, never null.
     * @return the result of the validation.
     * @throws IOException
     */
    protected boolean exploreFields(PreflightContext ctx, List<PDField> fields) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/AcroFormValidationProcess.java`
#### Snippet
```java
     * @param field an acro forms field.
     * @return the result of the check for A or AA entries.
     * @throws IOException
     */
    protected boolean validateField(PreflightContext ctx, PDField field) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/AcroFormValidationProcess.java`
#### Snippet
```java
     * @param widgets the list of widgets
     * @return the result of the validation.
     * @throws IOException
     */
    protected boolean exploreWidgets(PreflightContext ctx, List<PDAnnotationWidget> widgets) throws IOException
```

### JavadocDeclaration
`@param arguments` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/StubOperator.java`
#### Snippet
```java
     * If the arguments list of Operator isn't empty, this method throws a ContentStreamException.
     * 
     * @param arguments
     * @throws ContentStreamException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/StubOperator.java`
#### Snippet
```java
     * 
     * @param arguments
     * @throws ContentStreamException
     */
    private void checkNoOperands(List<COSBase> arguments) throws ContentStreamException
```

### JavadocDeclaration
`@param arguments` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/StubOperator.java`
#### Snippet
```java
     * If the arguments list of Operator doesn't have Array parameter, this method throws a ContentStreamException.
     * 
     * @param arguments
     * @param length
     * @throws ContentStreamException
```

### JavadocDeclaration
`@param length` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/StubOperator.java`
#### Snippet
```java
     * 
     * @param arguments
     * @param length
     * @throws ContentStreamException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/StubOperator.java`
#### Snippet
```java
     * @param arguments
     * @param length
     * @throws ContentStreamException
     */
    private void checkArrayOperands(List<COSBase> arguments, int length) throws ContentStreamException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/StubOperator.java`
#### Snippet
```java
     * @param length
     *            the expected size of the list
     * @throws ContentStreamException
     */
    private void checkNumberOperands(List<COSBase> arguments, int length) throws ContentStreamException
```

### JavadocDeclaration
`@param arguments` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/StubOperator.java`
#### Snippet
```java
     * String or a Dictionary
     * 
     * @param arguments
     * @throws ContentStreamException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/StubOperator.java`
#### Snippet
```java
     * 
     * @param arguments
     * @throws ContentStreamException
     */
    private void checkTagAndPropertyOperands(List<COSBase> arguments) throws ContentStreamException
```

### JavadocDeclaration
`@param arguments` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/StubOperator.java`
#### Snippet
```java
     * If the arguments list of Operator doesn't have String parameter, this method throws a ContentStreamException.
     * 
     * @param arguments
     * @param length
     * @throws ContentStreamException
```

### JavadocDeclaration
`@param length` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/StubOperator.java`
#### Snippet
```java
     * 
     * @param arguments
     * @param length
     * @throws ContentStreamException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/StubOperator.java`
#### Snippet
```java
     * @param arguments
     * @param length
     * @throws ContentStreamException
     */
    private void checkStringOperands(List<COSBase> arguments, int length) throws ContentStreamException
```

### JavadocDeclaration
`@param file` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/parser/PreflightParser.java`
#### Snippet
```java
     * Constructor.
     *
     * @param file
     * @throws IOException if there is a reading error.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/parser/PreflightParser.java`
#### Snippet
```java
     *            Configuration bean that will be used by the PreflightDocument. If null the format is used to determine
     *            the default configuration.
     * @throws IOException
     */
    public PDDocument parse(Format format, PreflightConfiguration config) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/parser/PreflightParser.java`
#### Snippet
```java
     * @param format
     *            format that the document should follow (default {@link Format#PDF_A1B})
     * @throws IOException
     */
    public PDDocument parse(Format format) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/parser/PreflightParser.java`
#### Snippet
```java
     * 'stream' must be followed by &lt;CR&gt;&lt;LF&gt; or only &lt;LF&gt;
     * 
     * @throws IOException
     */
    private long checkStreamKeyWord() throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/parser/PreflightParser.java`
#### Snippet
```java
     * 'endstream' must be preceded by an EOL
     * 
     * @throws IOException
     */
    private void checkEndstreamKeyWord(COSDictionary dic, long startOffset)
```

### JavadocDeclaration
`@param filename` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/parser/PreflightParser.java`
#### Snippet
```java
     * Constructor.
     *
     * @param filename
     * @throws IOException if there is a reading error.
     */
```

### JavadocDeclaration
`@param colorSpace` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/graphic/StandardColorSpaceHelper.java`
#### Snippet
```java
    /**
     * Method called by the processAllColorSpace if the ColorSpace to check is a calibrated color (CalGray, CalRGB, Lab).
     * @param colorSpace 
     * 
     */
```

### JavadocDeclaration
`@param colorSpace` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/graphic/StandardColorSpaceHelper.java`
#### Snippet
```java
     * authorized ColorSpace.
     * 
     * @param colorSpace
     * @return true if the default colorspace is a right one, false otherwise.
     */
```

### JavadocDeclaration
`@param colorSpace` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/graphic/StandardColorSpaceHelper.java`
#### Snippet
```java
    /**
     * Method called by the processAllColorSpace if the ColorSpace to check is a Pattern.
     * @param colorSpace 
     */
    protected void processPatternColorSpace(PDColorSpace colorSpace)
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightStreamEngine.java`
#### Snippet
```java
     * 
     * @param operation the color operator
     * @throws ContentStreamException
     */
    protected void checkColorOperators(String operation) throws ContentStreamException
```

### JavadocDeclaration
`@param operator` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightStreamEngine.java`
#### Snippet
```java
     * Valid the number of graphic states if the operator is the Save Graphic state operator ("q")
     * 
     * @param operator
     */
    protected void validateNumberOfGraphicStates(Operator operator)
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightStreamEngine.java`
#### Snippet
```java
     * 
     * @param operator the InlinedImage object (BI to EI)
     * @throws IOException
     */
    protected void validateInlineImageColorSpace(Operator operator) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightStreamEngine.java`
#### Snippet
```java
     *
     * @param operator an operator.
     * @throws ContentStreamException
     */
    void validateDefaultColorSpace(Operator operator) throws ContentStreamException
```

### JavadocDeclaration
`@param operator` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightStreamEngine.java`
#### Snippet
```java
     * the color space defined in OutputIntent dictionaries.
     * 
     * @param operator
     * @param arguments
     * @throws IOException
```

### JavadocDeclaration
`@param arguments` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightStreamEngine.java`
#### Snippet
```java
     * 
     * @param operator
     * @param arguments
     * @throws IOException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/PreflightStreamEngine.java`
#### Snippet
```java
     * @param operator
     * @param arguments
     * @throws IOException
     */
    protected void checkSetColorSpaceOperators(Operator operator, List<COSBase> arguments) throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/BookmarkValidationProcess.java`
#### Snippet
```java
     * @param lastObj The last PDF object of the level.
     * @return true if all items are valid in this level.
     * @throws ValidationException
     */
    protected boolean exploreOutlineLevel(PreflightContext ctx, PDOutlineItem inputItem, 
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/BookmarkValidationProcess.java`
#### Snippet
```java
     * @param inputItem outline item to validate
     * @return the validation result.
     * @throws ValidationException
     */
    protected boolean validateItem(PreflightContext ctx, PDOutlineItem inputItem) throws ValidationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/ExtGStateValidationProcess.java`
#### Snippet
```java
     * @param context the preflight context.
     * @param listOfExtGState a list of ExtGState COSDictionaries.
     * @throws ValidationException
     * 
     */
```

### JavadocDeclaration
`@param ctx` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/CatalogValidationProcess.java`
#### Snippet
```java
     * This method returns a list of ValidationError. It is empty if no errors have been found.
     * 
     * @param ctx
     * @throws ValidationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/ExtGStateValidationProcess.java`
#### Snippet
```java
     * @param context the preflight context.
     * @param egs the Graphic state to check
     * @throws ValidationException
     */
    private void checkFont(PreflightContext context, COSDictionary egs) throws ValidationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/CatalogValidationProcess.java`
#### Snippet
```java
     * 
     * @param ctx
     * @throws ValidationException
     */
    private void validateOutputIntent(PreflightContext ctx) throws ValidationException
```

### JavadocDeclaration
`@param ctx` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/CatalogValidationProcess.java`
#### Snippet
```java
     * present.
     * 
     * @param ctx
     */
    private void validateLang(PreflightContext ctx)
```

### JavadocDeclaration
`@param destOutputProfile` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/CatalogValidationProcess.java`
#### Snippet
```java
     * null is returned.
     * 
     * @param destOutputProfile
     * @param mapDestOutputProfile
     * @param ctx the preflight context.
```

### JavadocDeclaration
`@param mapDestOutputProfile` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/CatalogValidationProcess.java`
#### Snippet
```java
     * 
     * @param destOutputProfile
     * @param mapDestOutputProfile
     * @param ctx the preflight context.
     * @throws ValidationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/CatalogValidationProcess.java`
#### Snippet
```java
     * @param mapDestOutputProfile
     * @param ctx the preflight context.
     * @throws ValidationException
     */
    private void validateICCProfile(COSBase destOutputProfile,
```

### JavadocDeclaration
`@param ctx` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/CatalogValidationProcess.java`
#### Snippet
```java
     * A Catalog shall not contain the OCPProperties (Optional Content Properties) entry.
     * 
     * @param ctx
     */
    private void validateOCProperties(PreflightContext ctx)
```

### JavadocDeclaration
`@param ctx` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/CatalogValidationProcess.java`
#### Snippet
```java
     * A Catalog shall not contain the EmbeddedFiles entry.
     * 
     * @param ctx
     */
    private void validateNames(PreflightContext ctx)
```

### JavadocDeclaration
`@param ctx` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/CatalogValidationProcess.java`
#### Snippet
```java
     * is present.
     * 
     * @param ctx
     * @throws ValidationException Propagate the ActionManager exception
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/xobject/XObjectValidator.java`
#### Snippet
```java
     * Process the validation of the XObject.
     * 
     * @throws ValidationException
     */
    void validate() throws ValidationException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/ShadingPatternValidationProcess.java`
#### Snippet
```java
     * @param page the page to check.
     * @param shadingRes the Shading pattern to check.
     * @throws ValidationException
     */
    protected void checkGraphicState(PreflightContext context, PDPage page, PDShading shadingRes)
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/ShadingPatternValidationProcess.java`
#### Snippet
```java
     * @param page the page to check.
     * @param shadingRes the Shading pattern to check.
     * @throws ValidationException
     */
    protected void checkColorSpace(PreflightContext context, PDPage page, PDShading shadingRes)
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/SinglePageValidationProcess.java`
#### Snippet
```java
     * @param context the preflight context.
     * @param page the page to check.
     * @throws ValidationException
     */
    protected void validateAnnotation(PreflightContext context, PDPage page) throws ValidationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/SinglePageValidationProcess.java`
#### Snippet
```java
     * @param context the preflight context.
     * @param page the page to check.
     * @throws ValidationException
     */
    protected void validateGroupTransparency(PreflightContext context, PDPage page) throws ValidationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/SinglePageValidationProcess.java`
#### Snippet
```java
     * @param context the preflight context.
     * @param page the page to check.
     * @throws ValidationException
     */
    protected void validateGraphicObjects(PreflightContext context, PDPage page) throws ValidationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/SinglePageValidationProcess.java`
#### Snippet
```java
     * @param context the preflight context.
     * @param page the page to check.
     * @throws ValidationException
     */
    protected void validateContent(PreflightContext context, PDPage page) throws ValidationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/SinglePageValidationProcess.java`
#### Snippet
```java
     * @param context the preflight context.
     * @param page the page to check.
     * @throws ValidationException
     */
    protected void validateActions(PreflightContext context, PDPage page) throws ValidationException
```

### JavadocDeclaration
`@param context` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/ResourcesValidationProcess.java`
#### Snippet
```java
     * This method check the Shading entry of the resource dictionary if exists.
     * 
     * @param context
     * @param resources
     * @throws ValidationException
```

### JavadocDeclaration
`@param resources` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/ResourcesValidationProcess.java`
#### Snippet
```java
     * 
     * @param context
     * @param resources
     * @throws ValidationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/ResourcesValidationProcess.java`
#### Snippet
```java
     * @param context
     * @param resources
     * @throws ValidationException
     */
    protected void validateShadingPattern(PreflightContext context, PDResources resources) throws ValidationException
```

### JavadocDeclaration
`@param context` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/ResourcesValidationProcess.java`
#### Snippet
```java
     * This method check the Shading entry of the resource dictionary if exists.
     * 
     * @param context
     * @param resources
     * @throws ValidationException
```

### JavadocDeclaration
`@param resources` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/ResourcesValidationProcess.java`
#### Snippet
```java
     * 
     * @param context
     * @param resources
     * @throws ValidationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/ResourcesValidationProcess.java`
#### Snippet
```java
     * @param context
     * @param resources
     * @throws ValidationException
     */
    protected void validateTilingPattern(PreflightContext context, PDResources resources) throws ValidationException
```

### JavadocDeclaration
`@param context` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/ResourcesValidationProcess.java`
#### Snippet
```java
     * Check that fonts present in the Resources dictionary match with PDF/A-1 rules
     * 
     * @param context
     * @param resources
     * @throws ValidationException
```

### JavadocDeclaration
`@param resources` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/ResourcesValidationProcess.java`
#### Snippet
```java
     * 
     * @param context
     * @param resources
     * @throws ValidationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/ResourcesValidationProcess.java`
#### Snippet
```java
     * @param context
     * @param resources
     * @throws ValidationException
     */
    protected void validateFonts(PreflightContext context, PDResources resources) throws ValidationException
```

### JavadocDeclaration
`@param context` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/ResourcesValidationProcess.java`
#### Snippet
```java
    /**
     * 
     * @param context
     * @param resources
     * @throws ValidationException
```

### JavadocDeclaration
`@param resources` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/ResourcesValidationProcess.java`
#### Snippet
```java
     * 
     * @param context
     * @param resources
     * @throws ValidationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/process/reflect/ResourcesValidationProcess.java`
#### Snippet
```java
     * @param context
     * @param resources
     * @throws ValidationException
     */
    protected void validateExtGStates(PreflightContext context, PDResources resources) throws ValidationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/RDFAboutAttributeConcordanceValidation.java`
#### Snippet
```java
     *
     * @param metadata the XMP metadata.
     * @throws DifferentRDFAboutException
     * @throws ValidationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/RDFAboutAttributeConcordanceValidation.java`
#### Snippet
```java
     * @param metadata the XMP metadata.
     * @throws DifferentRDFAboutException
     * @throws ValidationException
     */
    public void validateRDFAboutAttributes(XMPMetadata metadata) throws ValidationException, DifferentRDFAboutException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/UniquePropertiesValidation.java`
#### Snippet
```java
     * @param metadata the XMP MetaData
     * @return List of validation errors
     * @throws ValidationException
     */
    public List<ValidationResult.ValidationError> validatePropertiesUniqueness(PDDocument document, XMPMetadata metadata)
```

### JavadocDeclaration
`@param prefFound` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/PDFAIdentificationValidation.java`
#### Snippet
```java
     * Return a validationError formatted when a schema has not the expected prefix
     * 
     * @param prefFound
     * @param prefExpected
     * @param schema
```

### JavadocDeclaration
`@param prefExpected` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/PDFAIdentificationValidation.java`
#### Snippet
```java
     * 
     * @param prefFound
     * @param prefExpected
     * @param schema
     * @return the validation error.
```

### JavadocDeclaration
`@param schema` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/PDFAIdentificationValidation.java`
#### Snippet
```java
     * @param prefFound
     * @param prefExpected
     * @param schema
     * @return the validation error.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/PDFAIdentificationValidation.java`
#### Snippet
```java
     * @param metadata the XMP MetaData.
     * @return the list of validation errors.
     * @throws ValidationException
     */
    public List<ValidationError> validatePDFAIdentifer(XMPMetadata metadata) throws ValidationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/SynchronizedMetaDataValidation.java`
#### Snippet
```java
     * @param xmp XMP Basic Schema
     * @param ve The list of validation errors
     * @throws ValidationException
     */
    protected void analyzeCreationDateProperty(PDDocumentInformation dico, XMPBasicSchema xmp, List<ValidationError> ve)
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/SynchronizedMetaDataValidation.java`
#### Snippet
```java
     * @param xmp XMP Basic Schema
     * @param ve The list of validation errors
     * @throws ValidationException
     */
    protected void analyzeModifyDateProperty(PDDocumentInformation dico, XMPBasicSchema xmp, List<ValidationError> ve)
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/SynchronizedMetaDataValidation.java`
#### Snippet
```java
     * @param metadata the XMP MetaData
     * @return List of validation errors
     * @throws ValidationException
     */
    public List<ValidationError> validateMetadataSynchronization(PDDocument document, XMPMetadata metadata)
```

### JavadocDeclaration
`@param date` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/SynchronizedMetaDataValidation.java`
#### Snippet
```java
     * </p>
     *
     * @param date
     * @return the validation result
     */
```

### JavadocDeclaration
`@param prefFound` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/SynchronizedMetaDataValidation.java`
#### Snippet
```java
     * Return a validationError formatted when a schema has not the expected prefix
     * 
     * @param prefFound
     * @param prefExpected
     * @param schema
```

### JavadocDeclaration
`@param prefExpected` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/SynchronizedMetaDataValidation.java`
#### Snippet
```java
     * 
     * @param prefFound
     * @param prefExpected
     * @param schema
     * @return the generated validation error.
```

### JavadocDeclaration
`@param schema` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/metadata/SynchronizedMetaDataValidation.java`
#### Snippet
```java
     * @param prefFound
     * @param prefExpected
     * @param schema
     * @return the generated validation error.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/annotation/AnnotationValidator.java`
#### Snippet
```java
     * 
     * @return the validation state of the AP content.
     * @throws org.apache.pdfbox.preflight.exception.ValidationException
     */
    protected boolean checkAP() throws ValidationException
```

### JavadocDeclaration
`@param fact` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/annotation/AnnotationValidator.java`
#### Snippet
```java
     * this object. Only the Factory should call this method.
     * 
     * @param fact
     */
    public final void setFactory(AnnotationValidatorFactory fact)
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/annotation/AnnotationValidator.java`
#### Snippet
```java
     * 
     * @return the validation state of the annotations actions.
     * @throws ValidationException
     */
    protected boolean checkActions() throws ValidationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/annotation/AnnotationValidator.java`
#### Snippet
```java
     *
     * @return true if the popup entry is valid, false if not.
     * @throws ValidationException
     */
    protected boolean checkPopup() throws ValidationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/annotation/AnnotationValidator.java`
#### Snippet
```java
     * 
     * @return true if a rgb profile is found, false otherwise.
     * @throws org.apache.pdfbox.preflight.exception.ValidationException
     */
    protected boolean searchRGBProfile() throws ValidationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/annotation/AnnotationValidator.java`
#### Snippet
```java
     * 
     * @return true if the C field is present and the RGB profile is used.
     * @throws org.apache.pdfbox.preflight.exception.ValidationException
     */
    protected boolean checkColors() throws ValidationException
```

### JavadocDeclaration
`@throws` tag description is missing
in `preflight/src/main/java/org/apache/pdfbox/preflight/annotation/AnnotationValidator.java`
#### Snippet
```java
     * 
     * @return true if validation succeed, false otherwise.
     * @throws ValidationException
     */
    public boolean validate() throws ValidationException
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `viewstructure` may be 'final'
in `debugger/src/main/java/org/apache/pdfbox/debugger/PDFDebugger.java`
#### Snippet
```java

    @Option(names = "-viewstructure", description = "activate structure mode on startup")
    private boolean viewstructure = false;

    @Parameters(paramLabel = "inputfile", arity="0..1", description = "the PDF file to be loaded")
```

### FieldMayBeFinal
Field `nsFinder` may be 'final'
in `xmpbox/src/main/java/org/apache/xmpbox/xml/DomXmpParser.java`
#### Snippet
```java
    private DocumentBuilder dBuilder;

    private NamespaceFinder nsFinder;

    private boolean strictParsing = true;
```

### FieldMayBeFinal
Field `dBuilder` may be 'final'
in `xmpbox/src/main/java/org/apache/xmpbox/xml/DomXmpParser.java`
#### Snippet
```java
public class DomXmpParser
{
    private DocumentBuilder dBuilder;

    private NamespaceFinder nsFinder;
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/COSParser.java`
#### Snippet
```java
            accessPermission = securityHandler.getCurrentAccessPermission();
        }
        catch (IOException e)
        {
            throw e;
```

### CaughtExceptionImmediatelyRethrown
Caught exception `cvex` is immediately rethrown
in `examples/src/main/java/org/apache/pdfbox/examples/signature/cert/CertificateVerifier.java`
#### Snippet
```java
                    + cert.getSubjectX500Principal(), certPathEx);
        }
        catch (CertificateVerificationException cvex)
        {
            throw cvex;
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `pdfbox/src/main/java/org/apache/pdfbox/pdfparser/BaseParser.java`
#### Snippet
```java
                    ( c == '\b' ) || ( c == '\f' ) )
            {
                continue;
            }
            else
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u02D8` can be replaced with '˘'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        // then do all deviations (based on the table in ISO 32000-1:2008)
        // block 1
        set(0x18, '\u02D8'); // BREVE
        set(0x19, '\u02C7'); // CARON
        set(0x1A, '\u02C6'); // MODIFIER LETTER CIRCUMFLEX ACCENT
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u02C7` can be replaced with 'ˇ'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        // block 1
        set(0x18, '\u02D8'); // BREVE
        set(0x19, '\u02C7'); // CARON
        set(0x1A, '\u02C6'); // MODIFIER LETTER CIRCUMFLEX ACCENT
        set(0x1B, '\u02D9'); // DOT ABOVE
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u02C6` can be replaced with 'ˆ'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x18, '\u02D8'); // BREVE
        set(0x19, '\u02C7'); // CARON
        set(0x1A, '\u02C6'); // MODIFIER LETTER CIRCUMFLEX ACCENT
        set(0x1B, '\u02D9'); // DOT ABOVE
        set(0x1C, '\u02DD'); // DOUBLE ACUTE ACCENT
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u02D9` can be replaced with '˙'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x19, '\u02C7'); // CARON
        set(0x1A, '\u02C6'); // MODIFIER LETTER CIRCUMFLEX ACCENT
        set(0x1B, '\u02D9'); // DOT ABOVE
        set(0x1C, '\u02DD'); // DOUBLE ACUTE ACCENT
        set(0x1D, '\u02DB'); // OGONEK
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u02DD` can be replaced with '˝'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x1A, '\u02C6'); // MODIFIER LETTER CIRCUMFLEX ACCENT
        set(0x1B, '\u02D9'); // DOT ABOVE
        set(0x1C, '\u02DD'); // DOUBLE ACUTE ACCENT
        set(0x1D, '\u02DB'); // OGONEK
        set(0x1E, '\u02DA'); // RING ABOVE
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u02DB` can be replaced with '˛'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x1B, '\u02D9'); // DOT ABOVE
        set(0x1C, '\u02DD'); // DOUBLE ACUTE ACCENT
        set(0x1D, '\u02DB'); // OGONEK
        set(0x1E, '\u02DA'); // RING ABOVE
        set(0x1F, '\u02DC'); // SMALL TILDE
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u02DA` can be replaced with '˚'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x1C, '\u02DD'); // DOUBLE ACUTE ACCENT
        set(0x1D, '\u02DB'); // OGONEK
        set(0x1E, '\u02DA'); // RING ABOVE
        set(0x1F, '\u02DC'); // SMALL TILDE
        // block 2
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u02DC` can be replaced with '˜'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x1D, '\u02DB'); // OGONEK
        set(0x1E, '\u02DA'); // RING ABOVE
        set(0x1F, '\u02DC'); // SMALL TILDE
        // block 2
        set(0x7F, REPLACEMENT_CHARACTER); // undefined
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2022` can be replaced with '•'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        // block 2
        set(0x7F, REPLACEMENT_CHARACTER); // undefined
        set(0x80, '\u2022'); // BULLET
        set(0x81, '\u2020'); // DAGGER
        set(0x82, '\u2021'); // DOUBLE DAGGER
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2020` can be replaced with '†'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x7F, REPLACEMENT_CHARACTER); // undefined
        set(0x80, '\u2022'); // BULLET
        set(0x81, '\u2020'); // DAGGER
        set(0x82, '\u2021'); // DOUBLE DAGGER
        set(0x83, '\u2026'); // HORIZONTAL ELLIPSIS
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2021` can be replaced with '‡'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x80, '\u2022'); // BULLET
        set(0x81, '\u2020'); // DAGGER
        set(0x82, '\u2021'); // DOUBLE DAGGER
        set(0x83, '\u2026'); // HORIZONTAL ELLIPSIS
        set(0x84, '\u2014'); // EM DASH
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2026` can be replaced with '...'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x81, '\u2020'); // DAGGER
        set(0x82, '\u2021'); // DOUBLE DAGGER
        set(0x83, '\u2026'); // HORIZONTAL ELLIPSIS
        set(0x84, '\u2014'); // EM DASH
        set(0x85, '\u2013'); // EN DASH
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2014` can be replaced with '---'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x82, '\u2021'); // DOUBLE DAGGER
        set(0x83, '\u2026'); // HORIZONTAL ELLIPSIS
        set(0x84, '\u2014'); // EM DASH
        set(0x85, '\u2013'); // EN DASH
        set(0x86, '\u0192'); // LATIN SMALL LETTER SCRIPT F
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2013` can be replaced with '--'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x83, '\u2026'); // HORIZONTAL ELLIPSIS
        set(0x84, '\u2014'); // EM DASH
        set(0x85, '\u2013'); // EN DASH
        set(0x86, '\u0192'); // LATIN SMALL LETTER SCRIPT F
        set(0x87, '\u2044'); // FRACTION SLASH (solidus)
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0192` can be replaced with 'ƒ'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x84, '\u2014'); // EM DASH
        set(0x85, '\u2013'); // EN DASH
        set(0x86, '\u0192'); // LATIN SMALL LETTER SCRIPT F
        set(0x87, '\u2044'); // FRACTION SLASH (solidus)
        set(0x88, '\u2039'); // SINGLE LEFT-POINTING ANGLE QUOTATION MARK
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2044` can be replaced with '⁄'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x85, '\u2013'); // EN DASH
        set(0x86, '\u0192'); // LATIN SMALL LETTER SCRIPT F
        set(0x87, '\u2044'); // FRACTION SLASH (solidus)
        set(0x88, '\u2039'); // SINGLE LEFT-POINTING ANGLE QUOTATION MARK
        set(0x89, '\u203A'); // SINGLE RIGHT-POINTING ANGLE QUOTATION MARK
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2039` can be replaced with '‹'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x86, '\u0192'); // LATIN SMALL LETTER SCRIPT F
        set(0x87, '\u2044'); // FRACTION SLASH (solidus)
        set(0x88, '\u2039'); // SINGLE LEFT-POINTING ANGLE QUOTATION MARK
        set(0x89, '\u203A'); // SINGLE RIGHT-POINTING ANGLE QUOTATION MARK
        set(0x8A, '\u2212'); // MINUS SIGN
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u203A` can be replaced with '›'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x87, '\u2044'); // FRACTION SLASH (solidus)
        set(0x88, '\u2039'); // SINGLE LEFT-POINTING ANGLE QUOTATION MARK
        set(0x89, '\u203A'); // SINGLE RIGHT-POINTING ANGLE QUOTATION MARK
        set(0x8A, '\u2212'); // MINUS SIGN
        set(0x8B, '\u2030'); // PER MILLE SIGN
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2212` can be replaced with '−'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x88, '\u2039'); // SINGLE LEFT-POINTING ANGLE QUOTATION MARK
        set(0x89, '\u203A'); // SINGLE RIGHT-POINTING ANGLE QUOTATION MARK
        set(0x8A, '\u2212'); // MINUS SIGN
        set(0x8B, '\u2030'); // PER MILLE SIGN
        set(0x8C, '\u201E'); // DOUBLE LOW-9 QUOTATION MARK (quotedblbase)
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2030` can be replaced with '‰'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x89, '\u203A'); // SINGLE RIGHT-POINTING ANGLE QUOTATION MARK
        set(0x8A, '\u2212'); // MINUS SIGN
        set(0x8B, '\u2030'); // PER MILLE SIGN
        set(0x8C, '\u201E'); // DOUBLE LOW-9 QUOTATION MARK (quotedblbase)
        set(0x8D, '\u201C'); // LEFT DOUBLE QUOTATION MARK (quotedblleft)
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u201E` can be replaced with '„'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x8A, '\u2212'); // MINUS SIGN
        set(0x8B, '\u2030'); // PER MILLE SIGN
        set(0x8C, '\u201E'); // DOUBLE LOW-9 QUOTATION MARK (quotedblbase)
        set(0x8D, '\u201C'); // LEFT DOUBLE QUOTATION MARK (quotedblleft)
        set(0x8E, '\u201D'); // RIGHT DOUBLE QUOTATION MARK (quotedblright)
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u201C` can be replaced with '"'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x8B, '\u2030'); // PER MILLE SIGN
        set(0x8C, '\u201E'); // DOUBLE LOW-9 QUOTATION MARK (quotedblbase)
        set(0x8D, '\u201C'); // LEFT DOUBLE QUOTATION MARK (quotedblleft)
        set(0x8E, '\u201D'); // RIGHT DOUBLE QUOTATION MARK (quotedblright)
        set(0x8F, '\u2018'); // LEFT SINGLE QUOTATION MARK (quoteleft)
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u201D` can be replaced with '"'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x8C, '\u201E'); // DOUBLE LOW-9 QUOTATION MARK (quotedblbase)
        set(0x8D, '\u201C'); // LEFT DOUBLE QUOTATION MARK (quotedblleft)
        set(0x8E, '\u201D'); // RIGHT DOUBLE QUOTATION MARK (quotedblright)
        set(0x8F, '\u2018'); // LEFT SINGLE QUOTATION MARK (quoteleft)
        set(0x90, '\u2019'); // RIGHT SINGLE QUOTATION MARK (quoteright)
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2018` can be replaced with '''
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x8D, '\u201C'); // LEFT DOUBLE QUOTATION MARK (quotedblleft)
        set(0x8E, '\u201D'); // RIGHT DOUBLE QUOTATION MARK (quotedblright)
        set(0x8F, '\u2018'); // LEFT SINGLE QUOTATION MARK (quoteleft)
        set(0x90, '\u2019'); // RIGHT SINGLE QUOTATION MARK (quoteright)
        set(0x91, '\u201A'); // SINGLE LOW-9 QUOTATION MARK (quotesinglbase)
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2019` can be replaced with '''
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x8E, '\u201D'); // RIGHT DOUBLE QUOTATION MARK (quotedblright)
        set(0x8F, '\u2018'); // LEFT SINGLE QUOTATION MARK (quoteleft)
        set(0x90, '\u2019'); // RIGHT SINGLE QUOTATION MARK (quoteright)
        set(0x91, '\u201A'); // SINGLE LOW-9 QUOTATION MARK (quotesinglbase)
        set(0x92, '\u2122'); // TRADE MARK SIGN
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u201A` can be replaced with '‚'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x8F, '\u2018'); // LEFT SINGLE QUOTATION MARK (quoteleft)
        set(0x90, '\u2019'); // RIGHT SINGLE QUOTATION MARK (quoteright)
        set(0x91, '\u201A'); // SINGLE LOW-9 QUOTATION MARK (quotesinglbase)
        set(0x92, '\u2122'); // TRADE MARK SIGN
        set(0x93, '\uFB01'); // LATIN SMALL LIGATURE FI
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2122` can be replaced with '™'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x90, '\u2019'); // RIGHT SINGLE QUOTATION MARK (quoteright)
        set(0x91, '\u201A'); // SINGLE LOW-9 QUOTATION MARK (quotesinglbase)
        set(0x92, '\u2122'); // TRADE MARK SIGN
        set(0x93, '\uFB01'); // LATIN SMALL LIGATURE FI
        set(0x94, '\uFB02'); // LATIN SMALL LIGATURE FL
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\uFB01` can be replaced with 'ﬁ'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x91, '\u201A'); // SINGLE LOW-9 QUOTATION MARK (quotesinglbase)
        set(0x92, '\u2122'); // TRADE MARK SIGN
        set(0x93, '\uFB01'); // LATIN SMALL LIGATURE FI
        set(0x94, '\uFB02'); // LATIN SMALL LIGATURE FL
        set(0x95, '\u0141'); // LATIN CAPITAL LETTER L WITH STROKE
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\uFB02` can be replaced with 'ﬂ'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x92, '\u2122'); // TRADE MARK SIGN
        set(0x93, '\uFB01'); // LATIN SMALL LIGATURE FI
        set(0x94, '\uFB02'); // LATIN SMALL LIGATURE FL
        set(0x95, '\u0141'); // LATIN CAPITAL LETTER L WITH STROKE
        set(0x96, '\u0152'); // LATIN CAPITAL LIGATURE OE
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0141` can be replaced with 'Ł'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x93, '\uFB01'); // LATIN SMALL LIGATURE FI
        set(0x94, '\uFB02'); // LATIN SMALL LIGATURE FL
        set(0x95, '\u0141'); // LATIN CAPITAL LETTER L WITH STROKE
        set(0x96, '\u0152'); // LATIN CAPITAL LIGATURE OE
        set(0x97, '\u0160'); // LATIN CAPITAL LETTER S WITH CARON
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0152` can be replaced with 'Œ'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x94, '\uFB02'); // LATIN SMALL LIGATURE FL
        set(0x95, '\u0141'); // LATIN CAPITAL LETTER L WITH STROKE
        set(0x96, '\u0152'); // LATIN CAPITAL LIGATURE OE
        set(0x97, '\u0160'); // LATIN CAPITAL LETTER S WITH CARON
        set(0x98, '\u0178'); // LATIN CAPITAL LETTER Y WITH DIAERESIS
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0160` can be replaced with 'Š'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x95, '\u0141'); // LATIN CAPITAL LETTER L WITH STROKE
        set(0x96, '\u0152'); // LATIN CAPITAL LIGATURE OE
        set(0x97, '\u0160'); // LATIN CAPITAL LETTER S WITH CARON
        set(0x98, '\u0178'); // LATIN CAPITAL LETTER Y WITH DIAERESIS
        set(0x99, '\u017D'); // LATIN CAPITAL LETTER Z WITH CARON
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0178` can be replaced with 'Ÿ'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x96, '\u0152'); // LATIN CAPITAL LIGATURE OE
        set(0x97, '\u0160'); // LATIN CAPITAL LETTER S WITH CARON
        set(0x98, '\u0178'); // LATIN CAPITAL LETTER Y WITH DIAERESIS
        set(0x99, '\u017D'); // LATIN CAPITAL LETTER Z WITH CARON
        set(0x9A, '\u0131'); // LATIN SMALL LETTER DOTLESS I
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u017D` can be replaced with 'Ž'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x97, '\u0160'); // LATIN CAPITAL LETTER S WITH CARON
        set(0x98, '\u0178'); // LATIN CAPITAL LETTER Y WITH DIAERESIS
        set(0x99, '\u017D'); // LATIN CAPITAL LETTER Z WITH CARON
        set(0x9A, '\u0131'); // LATIN SMALL LETTER DOTLESS I
        set(0x9B, '\u0142'); // LATIN SMALL LETTER L WITH STROKE
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0131` can be replaced with 'ı'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x98, '\u0178'); // LATIN CAPITAL LETTER Y WITH DIAERESIS
        set(0x99, '\u017D'); // LATIN CAPITAL LETTER Z WITH CARON
        set(0x9A, '\u0131'); // LATIN SMALL LETTER DOTLESS I
        set(0x9B, '\u0142'); // LATIN SMALL LETTER L WITH STROKE
        set(0x9C, '\u0153'); // LATIN SMALL LIGATURE OE
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0142` can be replaced with 'ł'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x99, '\u017D'); // LATIN CAPITAL LETTER Z WITH CARON
        set(0x9A, '\u0131'); // LATIN SMALL LETTER DOTLESS I
        set(0x9B, '\u0142'); // LATIN SMALL LETTER L WITH STROKE
        set(0x9C, '\u0153'); // LATIN SMALL LIGATURE OE
        set(0x9D, '\u0161'); // LATIN SMALL LETTER S WITH CARON
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0153` can be replaced with 'œ'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x9A, '\u0131'); // LATIN SMALL LETTER DOTLESS I
        set(0x9B, '\u0142'); // LATIN SMALL LETTER L WITH STROKE
        set(0x9C, '\u0153'); // LATIN SMALL LIGATURE OE
        set(0x9D, '\u0161'); // LATIN SMALL LETTER S WITH CARON
        set(0x9E, '\u017E'); // LATIN SMALL LETTER Z WITH CARON
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0161` can be replaced with 'š'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x9B, '\u0142'); // LATIN SMALL LETTER L WITH STROKE
        set(0x9C, '\u0153'); // LATIN SMALL LIGATURE OE
        set(0x9D, '\u0161'); // LATIN SMALL LETTER S WITH CARON
        set(0x9E, '\u017E'); // LATIN SMALL LETTER Z WITH CARON
        set(0x9F, REPLACEMENT_CHARACTER); // undefined
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u017E` can be replaced with 'ž'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x9C, '\u0153'); // LATIN SMALL LIGATURE OE
        set(0x9D, '\u0161'); // LATIN SMALL LETTER S WITH CARON
        set(0x9E, '\u017E'); // LATIN SMALL LETTER Z WITH CARON
        set(0x9F, REPLACEMENT_CHARACTER); // undefined
        set(0xA0, '\u20AC'); // EURO SIGN
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u20AC` can be replaced with '€'
in `pdfbox/src/main/java/org/apache/pdfbox/cos/PDFDocEncoding.java`
#### Snippet
```java
        set(0x9E, '\u017E'); // LATIN SMALL LETTER Z WITH CARON
        set(0x9F, REPLACEMENT_CHARACTER); // undefined
        set(0xA0, '\u20AC'); // EURO SIGN
        // end of deviations
    }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0300` can be replaced with '̀'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
    {
        Map<Integer, String> map = new HashMap<>(31);
        map.put(0x0060, "\u0300");
        map.put(0x02CB, "\u0300");
        map.put(0x0027, "\u0301");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0300` can be replaced with '̀'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        Map<Integer, String> map = new HashMap<>(31);
        map.put(0x0060, "\u0300");
        map.put(0x02CB, "\u0300");
        map.put(0x0027, "\u0301");
        map.put(0x02B9, "\u0301");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0301` can be replaced with '́'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x0060, "\u0300");
        map.put(0x02CB, "\u0300");
        map.put(0x0027, "\u0301");
        map.put(0x02B9, "\u0301");
        map.put(0x02CA, "\u0301");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0301` can be replaced with '́'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x02CB, "\u0300");
        map.put(0x0027, "\u0301");
        map.put(0x02B9, "\u0301");
        map.put(0x02CA, "\u0301");
        map.put(0x005e, "\u0302");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0301` can be replaced with '́'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x0027, "\u0301");
        map.put(0x02B9, "\u0301");
        map.put(0x02CA, "\u0301");
        map.put(0x005e, "\u0302");
        map.put(0x02C6, "\u0302");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0302` can be replaced with '̂'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x02B9, "\u0301");
        map.put(0x02CA, "\u0301");
        map.put(0x005e, "\u0302");
        map.put(0x02C6, "\u0302");
        map.put(0x007E, "\u0303");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0302` can be replaced with '̂'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x02CA, "\u0301");
        map.put(0x005e, "\u0302");
        map.put(0x02C6, "\u0302");
        map.put(0x007E, "\u0303");
        map.put(0x02C9, "\u0304");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0303` can be replaced with '̃'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x005e, "\u0302");
        map.put(0x02C6, "\u0302");
        map.put(0x007E, "\u0303");
        map.put(0x02C9, "\u0304");
        map.put(0x00B0, "\u030A");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0304` can be replaced with '̄'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x02C6, "\u0302");
        map.put(0x007E, "\u0303");
        map.put(0x02C9, "\u0304");
        map.put(0x00B0, "\u030A");
        map.put(0x02BA, "\u030B");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u030A` can be replaced with '̊'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x007E, "\u0303");
        map.put(0x02C9, "\u0304");
        map.put(0x00B0, "\u030A");
        map.put(0x02BA, "\u030B");
        map.put(0x02C7, "\u030C");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u030B` can be replaced with '̋'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x02C9, "\u0304");
        map.put(0x00B0, "\u030A");
        map.put(0x02BA, "\u030B");
        map.put(0x02C7, "\u030C");
        map.put(0x02C8, "\u030D");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u030C` can be replaced with '̌'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x00B0, "\u030A");
        map.put(0x02BA, "\u030B");
        map.put(0x02C7, "\u030C");
        map.put(0x02C8, "\u030D");
        map.put(0x0022, "\u030E");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u030D` can be replaced with '̍'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x02BA, "\u030B");
        map.put(0x02C7, "\u030C");
        map.put(0x02C8, "\u030D");
        map.put(0x0022, "\u030E");
        map.put(0x02BB, "\u0312");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u030E` can be replaced with '̎'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x02C7, "\u030C");
        map.put(0x02C8, "\u030D");
        map.put(0x0022, "\u030E");
        map.put(0x02BB, "\u0312");
        map.put(0x02BC, "\u0313");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0312` can be replaced with '̒'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x02C8, "\u030D");
        map.put(0x0022, "\u030E");
        map.put(0x02BB, "\u0312");
        map.put(0x02BC, "\u0313");
        map.put(0x0486, "\u0313");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0313` can be replaced with '̓'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x0022, "\u030E");
        map.put(0x02BB, "\u0312");
        map.put(0x02BC, "\u0313");
        map.put(0x0486, "\u0313");
        map.put(0x055A, "\u0313");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0313` can be replaced with '̓'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x02BB, "\u0312");
        map.put(0x02BC, "\u0313");
        map.put(0x0486, "\u0313");
        map.put(0x055A, "\u0313");
        map.put(0x02BD, "\u0314");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0313` can be replaced with '̓'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x02BC, "\u0313");
        map.put(0x0486, "\u0313");
        map.put(0x055A, "\u0313");
        map.put(0x02BD, "\u0314");
        map.put(0x0485, "\u0314");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0314` can be replaced with '̔'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x0486, "\u0313");
        map.put(0x055A, "\u0313");
        map.put(0x02BD, "\u0314");
        map.put(0x0485, "\u0314");
        map.put(0x0559, "\u0314");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0314` can be replaced with '̔'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x055A, "\u0313");
        map.put(0x02BD, "\u0314");
        map.put(0x0485, "\u0314");
        map.put(0x0559, "\u0314");
        map.put(0x02D4, "\u031D");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0314` can be replaced with '̔'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x02BD, "\u0314");
        map.put(0x0485, "\u0314");
        map.put(0x0559, "\u0314");
        map.put(0x02D4, "\u031D");
        map.put(0x02D5, "\u031E");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u031D` can be replaced with '̝'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x0485, "\u0314");
        map.put(0x0559, "\u0314");
        map.put(0x02D4, "\u031D");
        map.put(0x02D5, "\u031E");
        map.put(0x02D6, "\u031F");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u031E` can be replaced with '̞'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x0559, "\u0314");
        map.put(0x02D4, "\u031D");
        map.put(0x02D5, "\u031E");
        map.put(0x02D6, "\u031F");
        map.put(0x02D7, "\u0320");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u031F` can be replaced with '̟'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x02D4, "\u031D");
        map.put(0x02D5, "\u031E");
        map.put(0x02D6, "\u031F");
        map.put(0x02D7, "\u0320");
        map.put(0x02B2, "\u0321");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0320` can be replaced with '̠'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x02D5, "\u031E");
        map.put(0x02D6, "\u031F");
        map.put(0x02D7, "\u0320");
        map.put(0x02B2, "\u0321");
        map.put(0x02CC, "\u0329");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0321` can be replaced with '̡'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x02D6, "\u031F");
        map.put(0x02D7, "\u0320");
        map.put(0x02B2, "\u0321");
        map.put(0x02CC, "\u0329");
        map.put(0x02B7, "\u032B");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0329` can be replaced with '̩'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x02D7, "\u0320");
        map.put(0x02B2, "\u0321");
        map.put(0x02CC, "\u0329");
        map.put(0x02B7, "\u032B");
        map.put(0x02CD, "\u0331");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u032B` can be replaced with '̫'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x02B2, "\u0321");
        map.put(0x02CC, "\u0329");
        map.put(0x02B7, "\u032B");
        map.put(0x02CD, "\u0331");
        map.put(0x005F, "\u0332");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0331` can be replaced with '̱'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x02CC, "\u0329");
        map.put(0x02B7, "\u032B");
        map.put(0x02CD, "\u0331");
        map.put(0x005F, "\u0332");
        map.put(0x204E, "\u0359");
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0332` can be replaced with '̲'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x02B7, "\u032B");
        map.put(0x02CD, "\u0331");
        map.put(0x005F, "\u0332");
        map.put(0x204E, "\u0359");
        return map;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0359` can be replaced with '͙'
in `pdfbox/src/main/java/org/apache/pdfbox/text/TextPosition.java`
#### Snippet
```java
        map.put(0x02CD, "\u0331");
        map.put(0x005F, "\u0332");
        map.put(0x204E, "\u0359");
        return map;
    }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0644` can be replaced with 'ل'
in `pdfbox/src/main/java/org/apache/pdfbox/text/PDFTextStripper.java`
#### Snippet
```java
                        && (word.charAt(q - 1) == 0x0627 || word.charAt(q - 1) == 0xFE8D))
                {
                    builder.append("\u0644\u0644\u0647");
                }
                else
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0644` can be replaced with 'ل'
in `pdfbox/src/main/java/org/apache/pdfbox/text/PDFTextStripper.java`
#### Snippet
```java
                        && (word.charAt(q - 1) == 0x0627 || word.charAt(q - 1) == 0xFE8D))
                {
                    builder.append("\u0644\u0644\u0647");
                }
                else
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0647` can be replaced with 'ه'
in `pdfbox/src/main/java/org/apache/pdfbox/text/PDFTextStripper.java`
#### Snippet
```java
                        && (word.charAt(q - 1) == 0x0627 || word.charAt(q - 1) == 0xFE8D))
                {
                    builder.append("\u0644\u0644\u0647");
                }
                else
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2264` can be replaced with '≤'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/PDAbstractContentStream.java`
#### Snippet
```java
     * @param miterLimit the new miter limit.
     * @throws IOException If the content stream could not be written.
     * @throws IllegalArgumentException If the parameter is \u2264 0.
     */
    public void setMiterLimit(float miterLimit) throws IOException
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0020` can be replaced with ' '
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/function/type4/Parser.java`
#### Snippet
```java
        private static final char CR = '\r'; //CARRIAGE RETURN
        private static final char LF = '\n'; //LINE FEED
        private static final char SPACE = '\u0020'; //SPACE

        private final CharSequence input;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0009` can be replaced with a tab character
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/function/type4/Parser.java`
#### Snippet
```java
        private static final char NUL = '\u0000'; //NUL
        private static final char EOT = '\u0004'; //END OF TRANSMISSION
        private static final char TAB = '\u0009'; //TAB CHARACTER
        private static final char FF = '\u000C'; //FORM FEED
        private static final char CR = '\r'; //CARRIAGE RETURN
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u034F` can be replaced with '͏'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/SaslPrep.java`
#### Snippet
```java
    {
        return ch == '\u00AD'
                || ch == '\u034F'
                || ch == '\u1806'
                || ch == '\u180B'
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1806` can be replaced with '᠆'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/SaslPrep.java`
#### Snippet
```java
        return ch == '\u00AD'
                || ch == '\u034F'
                || ch == '\u1806'
                || ch == '\u180B'
                || ch == '\u180C'
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u180B` can be replaced with '᠋'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/SaslPrep.java`
#### Snippet
```java
                || ch == '\u034F'
                || ch == '\u1806'
                || ch == '\u180B'
                || ch == '\u180C'
                || ch == '\u180D'
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u180C` can be replaced with '᠌'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/SaslPrep.java`
#### Snippet
```java
                || ch == '\u1806'
                || ch == '\u180B'
                || ch == '\u180C'
                || ch == '\u180D'
                || ch == '\u200B'
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u180D` can be replaced with '᠍'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/SaslPrep.java`
#### Snippet
```java
                || ch == '\u180B'
                || ch == '\u180C'
                || ch == '\u180D'
                || ch == '\u200B'
                || ch == '\u200C'
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\uFE00` can be replaced with '︀'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/SaslPrep.java`
#### Snippet
```java
                || ch == '\u200D'
                || ch == '\u2060'
                || '\uFE00' <= ch && ch <= '\uFE0F'
                || ch == '\uFEFF';
    }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\uFE0F` can be replaced with '️'
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/encryption/SaslPrep.java`
#### Snippet
```java
                || ch == '\u200D'
                || ch == '\u2060'
                || '\uFE00' <= ch && ch <= '\uFE0F'
                || ch == '\uFEFF';
    }
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u09BF` can be replaced with 'ি'
in `fontbox/src/main/java/org/apache/fontbox/ttf/gsub/GsubWorkerForBengali.java`
#### Snippet
```java
            "psts", "haln", "calt");

    private static final char[] BEFORE_HALF_CHARS = new char[] { '\u09BF', '\u09C7', '\u09C8' };
    private static final BeforeAndAfterSpanComponent[] BEFORE_AND_AFTER_SPAN_CHARS = new BeforeAndAfterSpanComponent[] {
            new BeforeAndAfterSpanComponent('\u09CB', '\u09C7', '\u09BE'),
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u09C7` can be replaced with 'ে'
in `fontbox/src/main/java/org/apache/fontbox/ttf/gsub/GsubWorkerForBengali.java`
#### Snippet
```java
            "psts", "haln", "calt");

    private static final char[] BEFORE_HALF_CHARS = new char[] { '\u09BF', '\u09C7', '\u09C8' };
    private static final BeforeAndAfterSpanComponent[] BEFORE_AND_AFTER_SPAN_CHARS = new BeforeAndAfterSpanComponent[] {
            new BeforeAndAfterSpanComponent('\u09CB', '\u09C7', '\u09BE'),
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u09C8` can be replaced with 'ৈ'
in `fontbox/src/main/java/org/apache/fontbox/ttf/gsub/GsubWorkerForBengali.java`
#### Snippet
```java
            "psts", "haln", "calt");

    private static final char[] BEFORE_HALF_CHARS = new char[] { '\u09BF', '\u09C7', '\u09C8' };
    private static final BeforeAndAfterSpanComponent[] BEFORE_AND_AFTER_SPAN_CHARS = new BeforeAndAfterSpanComponent[] {
            new BeforeAndAfterSpanComponent('\u09CB', '\u09C7', '\u09BE'),
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u09CB` can be replaced with 'ো'
in `fontbox/src/main/java/org/apache/fontbox/ttf/gsub/GsubWorkerForBengali.java`
#### Snippet
```java

    /**
     * Models characters like O-kar (\u09CB) and OU-kar (\u09CC). Since these 2 characters is
     * represented by 2 components, one before and one after the Vyanjan Varna on which this is
     * used, this glyph has to be replaced by these 2 glyphs. For O-kar, it has to be replaced by
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u09CC` can be replaced with 'ৌ'
in `fontbox/src/main/java/org/apache/fontbox/ttf/gsub/GsubWorkerForBengali.java`
#### Snippet
```java

    /**
     * Models characters like O-kar (\u09CB) and OU-kar (\u09CC). Since these 2 characters is
     * represented by 2 components, one before and one after the Vyanjan Varna on which this is
     * used, this glyph has to be replaced by these 2 glyphs. For O-kar, it has to be replaced by
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u09C7` can be replaced with 'ে'
in `fontbox/src/main/java/org/apache/fontbox/ttf/gsub/GsubWorkerForBengali.java`
#### Snippet
```java
     * represented by 2 components, one before and one after the Vyanjan Varna on which this is
     * used, this glyph has to be replaced by these 2 glyphs. For O-kar, it has to be replaced by
     * E-kar (\u09C7) and AA-kar (\u09BE). For OU-kar, it has be replaced by E-kar (\u09C7) and
     * \u09D7.
     *
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u09BE` can be replaced with 'া'
in `fontbox/src/main/java/org/apache/fontbox/ttf/gsub/GsubWorkerForBengali.java`
#### Snippet
```java
     * represented by 2 components, one before and one after the Vyanjan Varna on which this is
     * used, this glyph has to be replaced by these 2 glyphs. For O-kar, it has to be replaced by
     * E-kar (\u09C7) and AA-kar (\u09BE). For OU-kar, it has be replaced by E-kar (\u09C7) and
     * \u09D7.
     *
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u09C7` can be replaced with 'ে'
in `fontbox/src/main/java/org/apache/fontbox/ttf/gsub/GsubWorkerForBengali.java`
#### Snippet
```java
     * represented by 2 components, one before and one after the Vyanjan Varna on which this is
     * used, this glyph has to be replaced by these 2 glyphs. For O-kar, it has to be replaced by
     * E-kar (\u09C7) and AA-kar (\u09BE). For OU-kar, it has be replaced by E-kar (\u09C7) and
     * \u09D7.
     *
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u09D7` can be replaced with 'ৗ'
in `fontbox/src/main/java/org/apache/fontbox/ttf/gsub/GsubWorkerForBengali.java`
#### Snippet
```java
     * used, this glyph has to be replaced by these 2 glyphs. For O-kar, it has to be replaced by
     * E-kar (\u09C7) and AA-kar (\u09BE). For OU-kar, it has be replaced by E-kar (\u09C7) and
     * \u09D7.
     *
     */
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u09CB` can be replaced with 'ো'
in `fontbox/src/main/java/org/apache/fontbox/ttf/gsub/GsubWorkerForBengali.java`
#### Snippet
```java
    private static final char[] BEFORE_HALF_CHARS = new char[] { '\u09BF', '\u09C7', '\u09C8' };
    private static final BeforeAndAfterSpanComponent[] BEFORE_AND_AFTER_SPAN_CHARS = new BeforeAndAfterSpanComponent[] {
            new BeforeAndAfterSpanComponent('\u09CB', '\u09C7', '\u09BE'),
            new BeforeAndAfterSpanComponent('\u09CC', '\u09C7', '\u09D7') };

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u09C7` can be replaced with 'ে'
in `fontbox/src/main/java/org/apache/fontbox/ttf/gsub/GsubWorkerForBengali.java`
#### Snippet
```java
    private static final char[] BEFORE_HALF_CHARS = new char[] { '\u09BF', '\u09C7', '\u09C8' };
    private static final BeforeAndAfterSpanComponent[] BEFORE_AND_AFTER_SPAN_CHARS = new BeforeAndAfterSpanComponent[] {
            new BeforeAndAfterSpanComponent('\u09CB', '\u09C7', '\u09BE'),
            new BeforeAndAfterSpanComponent('\u09CC', '\u09C7', '\u09D7') };

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u09BE` can be replaced with 'া'
in `fontbox/src/main/java/org/apache/fontbox/ttf/gsub/GsubWorkerForBengali.java`
#### Snippet
```java
    private static final char[] BEFORE_HALF_CHARS = new char[] { '\u09BF', '\u09C7', '\u09C8' };
    private static final BeforeAndAfterSpanComponent[] BEFORE_AND_AFTER_SPAN_CHARS = new BeforeAndAfterSpanComponent[] {
            new BeforeAndAfterSpanComponent('\u09CB', '\u09C7', '\u09BE'),
            new BeforeAndAfterSpanComponent('\u09CC', '\u09C7', '\u09D7') };

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u09CC` can be replaced with 'ৌ'
in `fontbox/src/main/java/org/apache/fontbox/ttf/gsub/GsubWorkerForBengali.java`
#### Snippet
```java
    private static final BeforeAndAfterSpanComponent[] BEFORE_AND_AFTER_SPAN_CHARS = new BeforeAndAfterSpanComponent[] {
            new BeforeAndAfterSpanComponent('\u09CB', '\u09C7', '\u09BE'),
            new BeforeAndAfterSpanComponent('\u09CC', '\u09C7', '\u09D7') };

    private final CmapLookup cmapLookup;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u09C7` can be replaced with 'ে'
in `fontbox/src/main/java/org/apache/fontbox/ttf/gsub/GsubWorkerForBengali.java`
#### Snippet
```java
    private static final BeforeAndAfterSpanComponent[] BEFORE_AND_AFTER_SPAN_CHARS = new BeforeAndAfterSpanComponent[] {
            new BeforeAndAfterSpanComponent('\u09CB', '\u09C7', '\u09BE'),
            new BeforeAndAfterSpanComponent('\u09CC', '\u09C7', '\u09D7') };

    private final CmapLookup cmapLookup;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u09D7` can be replaced with 'ৗ'
in `fontbox/src/main/java/org/apache/fontbox/ttf/gsub/GsubWorkerForBengali.java`
#### Snippet
```java
    private static final BeforeAndAfterSpanComponent[] BEFORE_AND_AFTER_SPAN_CHARS = new BeforeAndAfterSpanComponent[] {
            new BeforeAndAfterSpanComponent('\u09CB', '\u09C7', '\u09BE'),
            new BeforeAndAfterSpanComponent('\u09CC', '\u09C7', '\u09D7') };

    private final CmapLookup cmapLookup;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\uFB01` can be replaced with 'ﬁ'
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/EmbeddedFonts.java`
#### Snippet
```java
                
                // ligature
                stream.showText("Ligatures: \uFB01lm \uFB02ood");
                
                stream.endText();
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\uFB02` can be replaced with 'ﬂ'
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/EmbeddedFonts.java`
#### Snippet
```java
                
                // ligature
                stream.showText("Ligatures: \uFB01lm \uFB02ood");
                
                stream.endText();
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `secondCodeBase` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/PDCIDFont.java`
#### Snippet
```java
                        break;
                    }
                    COSBase secondCodeBase = next;
                    COSBase rangeWidthBase = wArray.getObject(counter++);
                    if (!(secondCodeBase instanceof COSNumber) || !(rangeWidthBase instanceof COSNumber))
```

### UnnecessaryLocalVariable
Local variable `fdfField` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/form/PDAcroForm.java`
#### Snippet
```java
            for (FDFField field : fields)
            {
                FDFField fdfField = field;
                PDField docField = getField(fdfField.getPartialFieldName());
                if (docField != null)
```

### UnnecessaryLocalVariable
Local variable `centerPointsLength` is redundant
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/interactive/annotation/handlers/CloudyBorder.java`
#### Snippet
```java
        // is not true in regions where the ellipse curvature is high.

        int centerPointsLength = n;
        Point2D.Double[] centerPoints = new Point2D.Double[centerPointsLength];
        int centerPointsIndex = 0;
```

### UnnecessaryLocalVariable
Local variable `nextByte` is redundant
in `fontbox/src/main/java/org/apache/fontbox/cmap/CMapParser.java`
#### Snippet
```java
        // header operations, for now return the entire line
        // may need to smarter in the future
        int nextByte = firstByte;
        StringBuilder buffer = new StringBuilder();
        buffer.append((char) nextByte);
```

### UnnecessaryLocalVariable
Local variable `annot` is redundant
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/ReplaceURLs.java`
#### Snippet
```java
                    for (PDAnnotation annotation : annotations)
                    {
                        PDAnnotation annot = annotation;
                        if( annot instanceof PDAnnotationLink )
                        {
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy fields 'pointer', 'currentBufferPointer' and 'bufferListIndex'
in `io/src/main/java/org/apache/pdfbox/io/RandomAccessReadBuffer.java`
#### Snippet
```java
    }

    private RandomAccessReadBuffer(RandomAccessReadBuffer parent)
    {
        chunkSize = parent.chunkSize;
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `examples/src/main/java/org/apache/pdfbox/examples/signature/CreateSignatureBase.java`
#### Snippet
```java
            ContentSigner sha1Signer = new JcaContentSignerBuilder("SHA256WithRSA").build(privateKey);
            gen.addSignerInfoGenerator(new JcaSignerInfoGeneratorBuilder(new JcaDigestCalculatorProviderBuilder().build()).build(sha1Signer, cert));
            gen.addCertificates(new JcaCertStore(Arrays.asList(certificateChain)));
            CMSProcessableInputStream msg = new CMSProcessableInputStream(content);
            CMSSignedData signedData = gen.generate(msg, false);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `examples/src/main/java/org/apache/pdfbox/examples/signature/validation/CertInformationCollector.java`
#### Snippet
```java
            throws CertificateProccessingException
    {
        addAllCerts(Arrays.asList(certHolders));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `preflight/src/main/java/org/apache/pdfbox/preflight/content/StubOperator.java`
#### Snippet
```java
            OperatorName.SET_FLATNESS, OperatorName.SET_LINE_MITERLIMIT);

    private static final List<String> CHECK_ARRAY_OPERANDS = Arrays.asList( //
            OperatorName.SHOW_TEXT_ADJUSTED);

```

## RuleId[id=RedundantFileCreation]
### RedundantFileCreation
`new File` is redundant
in `examples/src/main/java/org/apache/pdfbox/examples/pdmodel/ExtractTTFFonts.java`
#### Snippet
```java
            {
                System.out.println("Writing font: " + name);
                try (OutputStream os = new FileOutputStream(new File(name + ".ttf"));
                     InputStream is = ff2Stream.createInputStream())
                {
```

## RuleId[id=ThrowableNotThrown]
### ThrowableNotThrown
Result of `closeAndLogException()` not thrown
in `pdfbox/src/main/java/org/apache/pdfbox/multipdf/PDFMergerUtility.java`
#### Snippet
```java
                for (PDDocument doc : tobeclosed)
                {
                    IOUtils.closeAndLogException(doc, LOG, "PDDocument", null);
                }
            }
```

## RuleId[id=IntegerDivisionInFloatingPointContext]
### IntegerDivisionInFloatingPointContext
`(ttf.getHorizontalHeader().getAscender() + -ttf.getHorizontalHeader().getDescender()) ...`: integer division in floating-point context
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/font/PDCIDFontType2.java`
#### Snippet
```java
    {
        // todo: really we want the BBox, (for text extraction:)
        return (ttf.getHorizontalHeader().getAscender() + -ttf.getHorizontalHeader().getDescender())
                / ttf.getUnitsPerEm(); // todo: shouldn't this be the yMax/yMin?
    }

```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `pdfbox/src/main/java/org/apache/pdfbox/pdmodel/common/COSArrayList.java`
#### Snippet
```java
     */
    @Override
    public boolean equals(Object o)
    {
        return actual.equals( o );
```

