# smali 
 
# Bad smells
I found 909 bad smells with 25 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 471 | false |
| FieldMayBeFinal | 66 | false |
| DuplicateBranchesInSwitch | 43 | false |
| DuplicatedCode | 43 | false |
| DataFlowIssue | 41 | false |
| UNCHECKED_WARNING | 27 | false |
| UnstableApiUsage | 25 | false |
| RedundantTypeArguments | 19 | false |
| FieldCanBeLocal | 18 | false |
| UnnecessaryModifier | 16 | true |
| RedundantStringFormatCall | 14 | false |
| CStyleArrayDeclaration | 9 | false |
| CharsetObjectCanBeUsed | 8 | false |
| MismatchedCollectionQueryUpdate | 7 | false |
| ConstantValue | 7 | false |
| TrivialIf | 7 | false |
| ConditionCoveredByFurtherCondition | 7 | false |
| NonFinalFieldInEnum | 6 | false |
| IgnoreResultOfCall | 6 | false |
| IOStreamConstructor | 6 | false |
| UnnecessaryCallToStringValueOf | 5 | false |
| CatchMayIgnoreException | 5 | false |
| UnnecessaryLabelOnContinueStatement | 4 | false |
| UnnecessaryToStringCall | 4 | true |
| EmptyStatementBody | 3 | false |
| UnusedAssignment | 3 | false |
| NonStrictComparisonCanBeEquality | 3 | true |
| ConditionalBreakInInfiniteLoop | 2 | false |
| NotNullFieldNotInitialized | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| IfStatementWithIdenticalBranches | 2 | false |
| JavadocReference | 2 | false |
| DanglingJavadoc | 2 | false |
| SwitchStatementWithConfusingDeclaration | 2 | false |
| JavadocDeclaration | 2 | false |
| RedundantCast | 2 | false |
| OverwrittenKey | 2 | false |
| StringEquality | 1 | false |
| Deprecation | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| NegativeIntConstantInLongContext | 1 | false |
| EqualsBetweenInconvertibleTypes | 1 | false |
| RedundantMethodOverride | 1 | false |
| PointlessBitwiseExpression | 1 | false |
| TextLabelInSwitchStatement | 1 | false |
| DuplicateThrows | 1 | false |
| StringConcatenationInLoops | 1 | false |
| TypeParameterHidesVisibleType | 1 | false |
| MismatchedJavadocCode | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| InnerClassMayBeStatic | 1 | true |
| AutoCloseableResource | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=StringEquality]
### StringEquality
String values are compared using `!=`, not 'equals()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/TypeRewriter.java`
#### Snippet
```java

            // instance equality, to avoid a value comparison in the common case of the type being unmodified
            if (unwrappedType != rewrittenType) {
                return new StringBuilder(dimensions + rewrittenType.length())
                        .append(value, 0, dimensions).append(rewrittenType).toString();
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Format.java`
#### Snippet
```java
    public final boolean isPayloadFormat;

    private Format(int size) {
        this(size, false);
    }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Format.java`
#### Snippet
```java
    }

    private Format(int size, boolean isPayloadFormat) {
        this.size = size;
        this.isPayloadFormat = isPayloadFormat;
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/AccessFlags.java`
#### Snippet
```java
    }

    private AccessFlags(int value, String accessFlagName, boolean validForClass, boolean validForMethod,
                        boolean validForField) {
        this.value = value;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/iface/instruction/SwitchElement.java`
#### Snippet
```java

public interface SwitchElement {
    public int getKey();
    public int getOffset();
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/iface/instruction/SwitchElement.java`
#### Snippet
```java
public interface SwitchElement {
    public int getKey();
    public int getOffset();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/iface/instruction/formats/ArrayPayload.java`
#### Snippet
```java
public interface ArrayPayload extends PayloadInstruction {
    public int getElementWidth();
    @Nonnull public List<Number> getArrayElements();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/iface/instruction/formats/ArrayPayload.java`
#### Snippet
```java

public interface ArrayPayload extends PayloadInstruction {
    public int getElementWidth();
    @Nonnull public List<Number> getArrayElements();
}
```

### UnnecessaryModifier
Modifier `static` is redundant for inner interfaces
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderEncodedValues.java`
#### Snippet
```java

public abstract class BuilderEncodedValues {
    public static interface BuilderEncodedValue extends EncodedValue {
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/AnnotationsDirectory.java`
#### Snippet
```java
     */
    public interface AnnotationIterator {
        public static final AnnotationIterator EMPTY = new AnnotationIterator() {
            @Override public int seekTo(int key) { return 0; }
            @Override public void reset() {}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/AnnotationsDirectory.java`
#### Snippet
```java
     */
    public interface AnnotationIterator {
        public static final AnnotationIterator EMPTY = new AnnotationIterator() {
            @Override public int seekTo(int key) { return 0; }
            @Override public void reset() {}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/AnnotationsDirectory.java`
#### Snippet
```java
     */
    public interface AnnotationIterator {
        public static final AnnotationIterator EMPTY = new AnnotationIterator() {
            @Override public int seekTo(int key) { return 0; }
            @Override public void reset() {}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/AnnotationsDirectory.java`
#### Snippet
```java
         * @return The annotation offset associated with the requested key, or 0 if not found.
         */
        public int seekTo(int key);

        /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/AnnotationsDirectory.java`
#### Snippet
```java
         * Resets the iterator to the beginning of its list.
         */
        public void reset();
    }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LexerErrorInterface.java`
#### Snippet
```java
    //ANTLR doesn't provide any way to add interfaces to the lexer class directly, so this is an intermediate
    //class that implements LexerErrorInterface that we can have the ANTLR parser extend 
    public abstract static class ANTLRLexerWithErrorInterface extends Lexer implements LexerErrorInterface {
        public ANTLRLexerWithErrorInterface() {
        }
```

### UnnecessaryModifier
Modifier `static` is redundant for inner classes of interfaces
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LexerErrorInterface.java`
#### Snippet
```java
    //ANTLR doesn't provide any way to add interfaces to the lexer class directly, so this is an intermediate
    //class that implements LexerErrorInterface that we can have the ANTLR parser extend 
    public abstract static class ANTLRLexerWithErrorInterface extends Lexer implements LexerErrorInterface {
        public ANTLRLexerWithErrorInterface() {
        }
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LexerErrorInterface.java`
#### Snippet
```java

public interface LexerErrorInterface {
    public int getNumberOfSyntaxErrors();

    //ANTLR doesn't provide any way to add interfaces to the lexer class directly, so this is an intermediate
```

## RuleId[id=ConditionalBreakInInfiniteLoop]
### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
		int _mid;
		int _upper = _keys + _klen - 1;
		while (true) {
			if ( _upper < _lower )
				break;
```

### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
		int _mid;
		int _upper = _keys + (_klen<<1) - 2;
		while (true) {
			if ( _upper < _lower )
				break;
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`while` statement has empty body
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/util/ParamUtil.java`
#### Snippet
```java
                return index+1;
            case 'L':
                while (str.charAt(index++) != ';') {}
                return index;
            case '[':
```

### EmptyStatementBody
`while` statement has empty body
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/util/ParamUtil.java`
#### Snippet
```java
                return index;
            case '[':
                while (str.charAt(index++) != '[') {}
                return findTypeEnd(str, index);
            default:
```

### EmptyStatementBody
`while` statement has empty body
in `third_party/util/src/main/java/com/android/tools/smali/util/PathUtil.java`
#### Snippet
```java
                FileReader reader = new FileReader(f2);

                while (reader.read(buf) != -1 && buf.length() < 4);
                if (buf.length() == 4 && buf.toString().equals("test")) {
                    return false;
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of field `_SyntheticAccessorFSM_trans_actions`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
}

private static final byte _SyntheticAccessorFSM_trans_actions[] = init__SyntheticAccessorFSM_trans_actions_0();


```

### CStyleArrayDeclaration
C-style array declaration of field `_SyntheticAccessorFSM_indicies`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
}

private static final byte _SyntheticAccessorFSM_indicies[] = init__SyntheticAccessorFSM_indicies_0();


```

### CStyleArrayDeclaration
C-style array declaration of field `_SyntheticAccessorFSM_range_lengths`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
}

private static final byte _SyntheticAccessorFSM_range_lengths[] = init__SyntheticAccessorFSM_range_lengths_0();


```

### CStyleArrayDeclaration
C-style array declaration of field `_SyntheticAccessorFSM_actions`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
}

private static final byte _SyntheticAccessorFSM_actions[] = init__SyntheticAccessorFSM_actions_0();


```

### CStyleArrayDeclaration
C-style array declaration of field `_SyntheticAccessorFSM_index_offsets`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
}

private static final short _SyntheticAccessorFSM_index_offsets[] = init__SyntheticAccessorFSM_index_offsets_0();


```

### CStyleArrayDeclaration
C-style array declaration of field `_SyntheticAccessorFSM_key_offsets`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
}

private static final short _SyntheticAccessorFSM_key_offsets[] = init__SyntheticAccessorFSM_key_offsets_0();


```

### CStyleArrayDeclaration
C-style array declaration of field `_SyntheticAccessorFSM_trans_keys`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
}

private static final short _SyntheticAccessorFSM_trans_keys[] = init__SyntheticAccessorFSM_trans_keys_0();


```

### CStyleArrayDeclaration
C-style array declaration of field `_SyntheticAccessorFSM_trans_targs`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
}

private static final byte _SyntheticAccessorFSM_trans_targs[] = init__SyntheticAccessorFSM_trans_targs_0();


```

### CStyleArrayDeclaration
C-style array declaration of field `_SyntheticAccessorFSM_single_lengths`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
}

private static final byte _SyntheticAccessorFSM_single_lengths[] = init__SyntheticAccessorFSM_single_lengths_0();


```

## RuleId[id=UnnecessaryLabelOnContinueStatement]
### UnnecessaryLabelOnContinueStatement
Unnecessary label `_goto` on continue statement
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
	if ( p == pe ) {
		_goto_targ = 4;
		continue _goto;
	}
	if ( cs == 0 ) {
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `_goto` on continue statement
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
	if ( cs == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
case 1:
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `_goto` on continue statement
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
	if ( cs == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
	if ( ++p != pe ) {
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `_goto` on continue statement
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
	if ( ++p != pe ) {
		_goto_targ = 1;
		continue _goto;
	}
case 4:
```

## RuleId[id=NotNullFieldNotInitialized]
### NotNullFieldNotInitialized
Not-null fields must be initialized
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMapEntryCollection.java`
#### Snippet
```java

    private class MapEntry implements Map.Entry<Key, Integer> {
        @Nonnull private Key key;

        @Nonnull @Override public Key getKey() {
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/MutableMethodImplementation.java`
#### Snippet
```java

    private static class SwitchPayloadReferenceLabel extends Label {
        @Nonnull public MethodLocation switchLocation;
    }

```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
	case 8:
// line 122 "SyntheticAccessorFSM.rl"
	{ mathType = INT; }
	break;
	case 9:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
	case 9:
// line 123 "SyntheticAccessorFSM.rl"
	{ mathType = LONG; }
	break;
	case 10:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
	case 10:
// line 124 "SyntheticAccessorFSM.rl"
	{ mathType = FLOAT; }
	break;
	case 11:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
	case 11:
// line 125 "SyntheticAccessorFSM.rl"
	{mathType = DOUBLE; }
	break;
	case 12:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
	case 27:
// line 183 "SyntheticAccessorFSM.rl"
	{
                accessorType = getIncrementType(mathOp, mathType, constantValue, putRegister, returnRegister);
            }
	break;
	case 28:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedDexFile.java`
#### Snippet
```java
                return getFieldSection();
            case ReferenceType.METHOD_PROTO:
                return getMethodSection();
            case ReferenceType.METHOD_HANDLE:
                return getMethodHandleSection();
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
            case RETURN_WIDE:
            case RETURN_OBJECT:
                return true;
            case RETURN_VOID_BARRIER:
            case RETURN_VOID_NO_BARRIER:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/EncodedValue.java`
#### Snippet
```java
                return String.format("0x%x", intValue);
            case ValueType.INT:
                intValue = reader.readSizedInt(valueArg+1);
                return String.format("0x%x", intValue);
            case ValueType.LONG:
                long longValue = reader.readSizedLong(valueArg+1);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
            case MONITOR_ENTER:
            case MONITOR_EXIT:
                return true;
            case CHECK_CAST:
                analyzeCheckCast(analyzedInstruction);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
            case FILLED_NEW_ARRAY:
            case FILLED_NEW_ARRAY_RANGE:
                return true;
            case FILL_ARRAY_DATA:
                return true;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
                return true;
            case FILL_ARRAY_DATA:
                return true;
            case THROW:
            case GOTO:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
            case GOTO_16:
            case GOTO_32:
                return true;
            case PACKED_SWITCH:
            case SPARSE_SWITCH:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
            case PACKED_SWITCH:
            case SPARSE_SWITCH:
                return true;
            case CMPL_FLOAT:
            case CMPG_FLOAT:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
            case IF_GTZ:
            case IF_LEZ:
                return true;
            case IF_EQZ:
            case IF_NEZ:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
            case APUT_WIDE:
            case APUT_OBJECT:
                return true;
            case IGET:
                analyze32BitPrimitiveIgetSget(analyzedInstruction, RegisterType.INTEGER_TYPE);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
            case IPUT_WIDE:
            case IPUT_OBJECT:
                return true;
            case SGET:
                analyze32BitPrimitiveIgetSget(analyzedInstruction, RegisterType.INTEGER_TYPE);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
                return true;
            case SGET:
                analyze32BitPrimitiveIgetSget(analyzedInstruction, RegisterType.INTEGER_TYPE);
                return true;
            case SGET_BOOLEAN:
                analyze32BitPrimitiveIgetSget(analyzedInstruction, RegisterType.BOOLEAN_TYPE);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
                return true;
            case SGET_BOOLEAN:
                analyze32BitPrimitiveIgetSget(analyzedInstruction, RegisterType.BOOLEAN_TYPE);
                return true;
            case SGET_BYTE:
                analyze32BitPrimitiveIgetSget(analyzedInstruction, RegisterType.BYTE_TYPE);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
                return true;
            case SGET_BYTE:
                analyze32BitPrimitiveIgetSget(analyzedInstruction, RegisterType.BYTE_TYPE);
                return true;
            case SGET_CHAR:
                analyze32BitPrimitiveIgetSget(analyzedInstruction, RegisterType.CHAR_TYPE);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
                return true;
            case SGET_CHAR:
                analyze32BitPrimitiveIgetSget(analyzedInstruction, RegisterType.CHAR_TYPE);
                return true;
            case SGET_SHORT:
                analyze32BitPrimitiveIgetSget(analyzedInstruction, RegisterType.SHORT_TYPE);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
                return true;
            case SGET_SHORT:
                analyze32BitPrimitiveIgetSget(analyzedInstruction, RegisterType.SHORT_TYPE);
                return true;
            case SGET_WIDE:
            case SGET_OBJECT:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
            case SGET_WIDE:
            case SGET_OBJECT:
                analyzeIgetSgetWideObject(analyzedInstruction);
                return true;
            case SPUT:
            case SPUT_BOOLEAN:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
            case SPUT_WIDE:
            case SPUT_OBJECT:
                return true;
            case INVOKE_VIRTUAL:
                analyzeInvokeVirtual(analyzedInstruction, false);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
                return true;
            case INVOKE_SUPER:
                analyzeInvokeVirtual(analyzedInstruction, false);
                return true;
            case INVOKE_DIRECT:
                analyzeInvokeDirect(analyzedInstruction);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
                return true;
            case INVOKE_STATIC:
                return true;
            case INVOKE_INTERFACE:
                // TODO: normalize interfaces
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
                return true;
            case INVOKE_SUPER_RANGE:
                analyzeInvokeVirtual(analyzedInstruction, true);
                return true;
            case INVOKE_DIRECT_RANGE:
                analyzeInvokeDirectRange(analyzedInstruction);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
                return true;
            case INVOKE_STATIC_RANGE:
                return true;
            case INVOKE_INTERFACE_RANGE:
                // TODO: normalize interfaces
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
            case INVOKE_INTERFACE_RANGE:
                // TODO: normalize interfaces
                return true;
            case NEG_INT:
            case NOT_INT:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
                return true;
            case INT_TO_LONG:
                analyzeUnaryOp(analyzedInstruction, RegisterType.LONG_LO_TYPE);
                return true;
            case INT_TO_FLOAT:
                analyzeUnaryOp(analyzedInstruction, RegisterType.FLOAT_TYPE);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
                return true;
            case INT_TO_FLOAT:
                analyzeUnaryOp(analyzedInstruction, RegisterType.FLOAT_TYPE);
                return true;
            case INT_TO_DOUBLE:
                analyzeUnaryOp(analyzedInstruction, RegisterType.DOUBLE_LO_TYPE);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
                return true;
            case INT_TO_DOUBLE:
                analyzeUnaryOp(analyzedInstruction, RegisterType.DOUBLE_LO_TYPE);
                return true;
            case LONG_TO_INT:
            case DOUBLE_TO_INT:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
            case LONG_TO_INT:
            case DOUBLE_TO_INT:
                analyzeUnaryOp(analyzedInstruction, RegisterType.INTEGER_TYPE);
                return true;
            case LONG_TO_FLOAT:
            case DOUBLE_TO_FLOAT:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
            case LONG_TO_FLOAT:
            case DOUBLE_TO_FLOAT:
                analyzeUnaryOp(analyzedInstruction, RegisterType.FLOAT_TYPE);
                return true;
            case LONG_TO_DOUBLE:
                analyzeUnaryOp(analyzedInstruction, RegisterType.DOUBLE_LO_TYPE);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
                return true;
            case LONG_TO_DOUBLE:
                analyzeUnaryOp(analyzedInstruction, RegisterType.DOUBLE_LO_TYPE);
                return true;
            case FLOAT_TO_INT:
                analyzeUnaryOp(analyzedInstruction, RegisterType.INTEGER_TYPE);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
                return true;
            case FLOAT_TO_INT:
                analyzeUnaryOp(analyzedInstruction, RegisterType.INTEGER_TYPE);
                return true;
            case FLOAT_TO_LONG:
                analyzeUnaryOp(analyzedInstruction, RegisterType.LONG_LO_TYPE);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
                return true;
            case FLOAT_TO_LONG:
                analyzeUnaryOp(analyzedInstruction, RegisterType.LONG_LO_TYPE);
                return true;
            case FLOAT_TO_DOUBLE:
                analyzeUnaryOp(analyzedInstruction, RegisterType.DOUBLE_LO_TYPE);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
                return true;
            case FLOAT_TO_DOUBLE:
                analyzeUnaryOp(analyzedInstruction, RegisterType.DOUBLE_LO_TYPE);
                return true;
            case DOUBLE_TO_LONG:
                analyzeUnaryOp(analyzedInstruction, RegisterType.LONG_LO_TYPE);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
                return true;
            case DOUBLE_TO_LONG:
                analyzeUnaryOp(analyzedInstruction, RegisterType.LONG_LO_TYPE);
                return true;
            case INT_TO_BYTE:
                analyzeUnaryOp(analyzedInstruction, RegisterType.BYTE_TYPE);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
            case REM_INT_LIT8:
            case SHL_INT_LIT8:
                analyzeLiteralBinaryOp(analyzedInstruction, RegisterType.INTEGER_TYPE, false);
                return true;
            case AND_INT_LIT8:
            case OR_INT_LIT8:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
            case OR_INT_LIT8:
            case XOR_INT_LIT8:
                analyzeLiteralBinaryOp(analyzedInstruction, RegisterType.INTEGER_TYPE, true);
                return true;
            case SHR_INT_LIT8:
                analyzeLiteralBinaryOp(analyzedInstruction, getDestTypeForLiteralShiftRight(analyzedInstruction, true),
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
                return true;
            case THROW_VERIFICATION_ERROR:
                return true;
            case EXECUTE_INLINE:
                analyzeExecuteInline(analyzedInstruction);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
            case SGET_OBJECT_VOLATILE:
            case SPUT_OBJECT_VOLATILE:
                analyzePutGetVolatile(analyzedInstruction);
                return true;
            default:
                assert false;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Format/InstructionMethodItem.java`
#### Snippet
```java
            case Format22x:
            case Format32x:
                writeOpcode(writer);
                writer.write(' ');
                writeFirstRegister(writer);
                writer.write(", ");
                writeSecondRegister(writer);
                break;
            case Format23x:
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `accessFlagName` in enum 'AccessFlags'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/AccessFlags.java`
#### Snippet
```java

    private int value;
    private String accessFlagName;
    private boolean validForClass;
    private boolean validForMethod;
```

### NonFinalFieldInEnum
Non-final field `validForMethod` in enum 'AccessFlags'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/AccessFlags.java`
#### Snippet
```java
    private String accessFlagName;
    private boolean validForClass;
    private boolean validForMethod;
    private boolean validForField;

```

### NonFinalFieldInEnum
Non-final field `validForClass` in enum 'AccessFlags'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/AccessFlags.java`
#### Snippet
```java
    private int value;
    private String accessFlagName;
    private boolean validForClass;
    private boolean validForMethod;
    private boolean validForField;
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'AccessFlags'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/AccessFlags.java`
#### Snippet
```java
    DECLARED_SYNCHRONIZED(0x20000, "declared-synchronized", false, true, false);

    private int value;
    private String accessFlagName;
    private boolean validForClass;
```

### NonFinalFieldInEnum
Non-final field `validForField` in enum 'AccessFlags'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/AccessFlags.java`
#### Snippet
```java
    private boolean validForClass;
    private boolean validForMethod;
    private boolean validForField;

    //cache the array of all AccessFlags, because .values() allocates a new array for every call
```

### NonFinalFieldInEnum
Non-final field `accessFlagsByName` in enum 'AccessFlags'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/AccessFlags.java`
#### Snippet
```java
    private final static AccessFlags[] allFlags;

    private static HashMap<String, AccessFlags> accessFlagsByName;

    static {
```

## RuleId[id=Deprecation]
### Deprecation
'toString(java.io.File, java.nio.charset.Charset)' is deprecated
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/CustomInlineMethodResolver.java`
#### Snippet
```java

    public CustomInlineMethodResolver(@Nonnull ClassPath classPath, @Nonnull File inlineTable) throws IOException {
        this(classPath, Files.toString(inlineTable, Charset.forName("UTF-8")));
    }

```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/ReferenceUtil.java`
#### Snippet
```java

    public static String getShortFieldDescriptor(FieldReference fieldReference) {
        StringBuilder sb = new StringBuilder();
        sb.append(fieldReference.getName());
        sb.append(':');
```

### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/TypeRewriter.java`
#### Snippet
```java
            // instance equality, to avoid a value comparison in the common case of the type being unmodified
            if (unwrappedType != rewrittenType) {
                return new StringBuilder(dimensions + rewrittenType.length())
                        .append(value, 0, dimensions).append(rewrittenType).toString();
            }
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `dexlib2/src/main/java/com/android/tools/smali/util/WrappedIndentingWriter.java`
#### Snippet
```java
            return 0;
        }
        if (currentIndent > maxIndent) {
            return maxIndent;
        }
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `smali/src/main/java/com/android/tools/smali/smali/Main.java`
#### Snippet
```java

    public Main() {
        super(Lists.<JCommander>newArrayList());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java

    private static List<VersionConstraint> allApis(int opcodeValue) {
        return Lists.newArrayList(new VersionConstraint(Range.<Integer>all(), Range.openClosed(0, 0), opcodeValue));
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java

    private static List<VersionConstraint> allVersions(int opcodeValue) {
        return Lists.newArrayList(new VersionConstraint(Range.<Integer>all(), Range.<Integer>all(), opcodeValue));
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java

    private static List<VersionConstraint> allVersions(int opcodeValue) {
        return Lists.newArrayList(new VersionConstraint(Range.<Integer>all(), Range.<Integer>all(), opcodeValue));
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java

    private static List<VersionConstraint> allArtVersions(int opcodeValue) {
        return Lists.newArrayList(new VersionConstraint(Range.openClosed(0, 0), Range.<Integer>all(), opcodeValue));
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderAnnotationSet.java`
#### Snippet
```java
public class BuilderAnnotationSet extends AbstractSet<BuilderAnnotation> {
    public static final BuilderAnnotationSet EMPTY =
            new BuilderAnnotationSet(ImmutableSet.<BuilderAnnotation>of());

    @Nonnull final Set<BuilderAnnotation> annotations;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderTypeList.java`
#### Snippet
```java

public class BuilderTypeList extends AbstractList<BuilderTypeReference> {
    static final BuilderTypeList EMPTY = new BuilderTypeList(ImmutableList.<BuilderTypeReference>of());

    @Nonnull final List<? extends BuilderTypeReference> types;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderArrayPayload.java`
#### Snippet
```java
        super(OPCODE);
        this.elementWidth = elementWidth;
        this.arrayElements = arrayElements==null?ImmutableList.<Number>of():arrayElements;
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java

        List<Map.Entry<? extends ProtoRefKey, Integer>> protoEntries = Lists.newArrayList(protoSection.getItems());
        Collections.sort(protoEntries, DexWriter.<ProtoRefKey>comparableKeyComparator());

        for (Map.Entry<? extends ProtoRefKey, Integer> entry: protoEntries) {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java

        List<Map.Entry<? extends FieldRefKey, Integer>> fieldEntries = Lists.newArrayList(fieldSection.getItems());
        Collections.sort(fieldEntries, DexWriter.<FieldRefKey>comparableKeyComparator());
        
        for (Map.Entry<? extends FieldRefKey, Integer> entry: fieldEntries) {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java

        List<Map.Entry<? extends ClassKey, Integer>> classEntriesKeySorted = Lists.newArrayList(classSection.getItems());
        Collections.sort(classEntriesKeySorted, DexWriter.<ClassKey>comparableKeyComparator());

        int index = 0;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java

        List<Map.Entry<? extends MethodRefKey, Integer>> methodEntries = Lists.newArrayList(methodSection.getItems());
        Collections.sort(methodEntries, DexWriter.<MethodRefKey>comparableKeyComparator());
        
        for (Map.Entry<? extends MethodRefKey, Integer> entry: methodEntries) {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
        }

        List<TypeProto> thisChain = Lists.<TypeProto>newArrayList(this);
        Iterables.addAll(thisChain, TypeProtoUtils.getSuperclassChain(this));

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableClassDef.java`
#### Snippet
```java
        this.accessFlags = accessFlags;
        this.superclass = superclass;
        this.interfaces = interfaces==null ? ImmutableList.<String>of() : ImmutableList.copyOf(interfaces);
        this.sourceFile = sourceFile;
        this.annotations = ImmutableAnnotation.immutableSetOf(annotations);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableClassDef.java`
#### Snippet
```java
        this.accessFlags = accessFlags;
        this.superclass = superclass;
        this.interfaces = interfaces==null ? ImmutableList.<String>of() : ImmutableList.copyOf(interfaces);
        this.sourceFile = sourceFile;
        this.annotations = ImmutableAnnotation.immutableSetOf(annotations);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableArrayPayload.java`
#### Snippet
```java
        this.elementWidth = Preconditions.checkArrayPayloadElementWidth(elementWidth);
        this.arrayElements = Preconditions.checkArrayPayloadElements(elementWidth,
                arrayElements==null ? ImmutableList.<Number>of() : ImmutableList.copyOf(arrayElements));
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `baksmali/src/main/java/com/android/tools/smali/baksmali/Main.java`
#### Snippet
```java

    public Main() {
        super(Lists.<JCommander>newArrayList());
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `baksmali/src/main/java/com/android/tools/smali/baksmali/AnalysisArguments.java`
#### Snippet
```java
            // --bootclasspath "" is a special case, denoting that no bootclasspath should be used
            resolver = new ClassPathResolver(
                    ImmutableList.<String>of(), ImmutableList.<String>of(), classPath, dexEntry);
        } else {
            resolver = new ClassPathResolver(filteredClassPathDirectories, bootClassPath, classPath, dexEntry);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `baksmali/src/main/java/com/android/tools/smali/baksmali/AnalysisArguments.java`
#### Snippet
```java
            // --bootclasspath "" is a special case, denoting that no bootclasspath should be used
            resolver = new ClassPathResolver(
                    ImmutableList.<String>of(), ImmutableList.<String>of(), classPath, dexEntry);
        } else {
            resolver = new ClassPathResolver(filteredClassPathDirectories, bootClassPath, classPath, dexEntry);
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `util/src/main/java/com/android/tools/smali/util/jcommander/Command.java`
#### Snippet
```java
public abstract class Command {

    @Nonnull
    protected final List<JCommander> commandAncestors;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `smali/src/main/java/com/android/tools/smali/smali/SmaliMethodParameter.java`
#### Snippet
```java
    public final int register;
    @Nonnull public final String type;
    @Nonnull public Set<? extends Annotation> annotations;
    @Nullable public String name;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `smali/src/main/java/com/android/tools/smali/smali/SmaliMethodParameter.java`
#### Snippet
```java
    @Nonnull public final String type;
    @Nonnull public Set<? extends Annotation> annotations;
    @Nullable public String name;

    public SmaliMethodParameter(int register, @Nonnull String type) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `smali/src/main/java/com/android/tools/smali/smali/SmaliMethodParameter.java`
#### Snippet
```java
public class SmaliMethodParameter extends BaseMethodParameter implements WithRegister {
    public final int register;
    @Nonnull public final String type;
    @Nonnull public Set<? extends Annotation> annotations;
    @Nullable public String name;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/util/RandomAccessFileOutputStream.java`
#### Snippet
```java
public class RandomAccessFileOutputStream extends OutputStream {
    private int filePosition;
    @Nonnull private final RandomAccessFile raf;

    public RandomAccessFileOutputStream(@Nonnull RandomAccessFile raf, int startFilePosition) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/util/RandomAccessFileOutputStream.java`
#### Snippet
```java
    }

    @Override public void write(byte[] b, int off, int len) throws IOException {
        raf.seek(filePosition);
        filePosition += len;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/util/AbstractForwardSequentialList.java`
#### Snippet
```java
        return new AbstractListIterator<T>() {
            private int index = initialIndex - 1;
            @Nullable private Iterator<T> forwardIterator = initialIterator;

            @Nonnull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/util/ArraySortedSet.java`
#### Snippet
```java

public class ArraySortedSet<T> implements SortedSet<T> {
    @Nonnull private final Comparator<? super T> comparator;
    @Nonnull private final Object[] arr;

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/util/ArraySortedSet.java`
#### Snippet
```java

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/util/ArraySortedSet.java`
#### Snippet
```java
public class ArraySortedSet<T> implements SortedSet<T> {
    @Nonnull private final Comparator<? super T> comparator;
    @Nonnull private final Object[] arr;

    private ArraySortedSet(@Nonnull Comparator<? super T> comparator, @Nonnull T[] arr) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/util/ArraySortedSet.java`
#### Snippet
```java

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/util/ArraySortedSet.java`
#### Snippet
```java

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/util/RandomAccessFileInputStream.java`
#### Snippet
```java
    }

    @Override public int read(byte[] bytes) throws IOException {
        raf.seek(filePosition);
        int bytesRead = raf.read(bytes);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/util/RandomAccessFileInputStream.java`
#### Snippet
```java
public class RandomAccessFileInputStream extends InputStream {
    private int filePosition;
    @Nonnull private final RandomAccessFile raf;

    public RandomAccessFileInputStream(@Nonnull RandomAccessFile raf, int filePosition) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/util/RandomAccessFileInputStream.java`
#### Snippet
```java
    }

    @Override public int read(byte[] bytes, int offset, int length) throws IOException {
        raf.seek(filePosition);
        int bytesRead = raf.read(bytes, offset, length);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcodes.java`
#### Snippet
```java
    @Nonnull private final Opcode[] opcodesByValue = new Opcode[256];
    @Nonnull private final EnumMap<Opcode, Short> opcodeValues;
    @Nonnull private final HashMap<String, Opcode> opcodesByName;

    @Nonnull
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcodes.java`
#### Snippet
```java
    public final int api;
    public final int artVersion;
    @Nonnull private final Opcode[] opcodesByValue = new Opcode[256];
    @Nonnull private final EnumMap<Opcode, Short> opcodeValues;
    @Nonnull private final HashMap<String, Opcode> opcodesByName;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcodes.java`
#### Snippet
```java
    public final int artVersion;
    @Nonnull private final Opcode[] opcodesByValue = new Opcode[256];
    @Nonnull private final EnumMap<Opcode, Short> opcodeValues;
    @Nonnull private final HashMap<String, Opcode> opcodesByName;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/DexFileFactory.java`
#### Snippet
```java
        private final File vdexFile;

        @Nullable
        private byte[] buf = null;
        private boolean loadedVdex = false;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/DexFileFactory.java`
#### Snippet
```java

    public static class UnsupportedOatVersionException extends ExceptionWithContext {
        @Nonnull public final OatFile oatFile;

        public UnsupportedOatVersionException(@Nonnull OatFile oatFile) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/InstructionOffsetMap.java`
#### Snippet
```java

public class InstructionOffsetMap {
    @Nonnull private final int[] instructionCodeOffsets;

    public InstructionOffsetMap(@Nonnull List<? extends Instruction> instructions) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorResolver.java`
#### Snippet
```java
    public static class AccessedMember {
        public final int accessedMemberType;
        @Nonnull public final Reference accessedMember;

        public AccessedMember(int accessedMemberType, @Nonnull Reference accessedMember) {
```

### NullableProblems
Overridden methods are not annotated
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/iface/MultiDexContainer.java`
#### Snippet
```java
         * @return The dex file associated with this entry
         */
        @Nonnull T getDexFile();

        /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/AnnotatedBytes.java`
#### Snippet
```java
        public final List<AnnotationItem> pointAnnotations = Lists.newArrayList();
        /** Annotations that are associated with a range of bytes */
        @Nullable
        public AnnotationItem rangeAnnotation = null;
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/AnnotatedBytes.java`
#### Snippet
```java
    private static class AnnotationEndpoint {
        /** Annotations that are associated with a specific point between bytes */
        @Nonnull
        public final List<AnnotationItem> pointAnnotations = Lists.newArrayList();
        /** Annotations that are associated with a range of bytes */
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/AnnotatedBytes.java`
#### Snippet
```java
     * The point annotations for a point are associated with the key at that point.
     */
    @Nonnull private TreeMap<Integer, AnnotationEndpoint> annotatations = Maps.newTreeMap();

    private int cursor;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/iface/Annotation.java`
#### Snippet
```java
     * @return An integer representing the result of the comparison
     */
    @Override int compareTo(Annotation o);
}

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/iface/AnnotationElement.java`
#### Snippet
```java
     * @return An integer representing the result of the comparison
     */
    @Override int compareTo(AnnotationElement o);
}

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java

    private static class VersionConstraint {
        @Nonnull public final Range<Integer> apiRange;
        @Nonnull public final Range<Integer> artVersionRange;
        public final int opcodeValue;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
    private static class VersionConstraint {
        @Nonnull public final Range<Integer> apiRange;
        @Nonnull public final Range<Integer> artVersionRange;
        public final int opcodeValue;

```

### NullableProblems
Overridden methods are not annotated
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/iface/reference/MethodProtoReference.java`
#### Snippet
```java
     * @return The return type of the referenced method prototype.
     */
    @Nonnull String getReturnType();

    /**
```

### NullableProblems
Overridden methods are not annotated
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/iface/reference/MethodProtoReference.java`
#### Snippet
```java
     * @return A list of the parameter types of this method prototype, as strings.
     */
    @Nonnull List<? extends CharSequence> getParameterTypes();

    /**
```

### NullableProblems
Overridden methods are not annotated
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/iface/instruction/DualReferenceInstruction.java`
#### Snippet
```java

public interface DualReferenceInstruction extends ReferenceInstruction {
    @Nonnull Reference getReference2();
    int getReferenceType2();
}
```

### NullableProblems
Overridden methods are not annotated
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/iface/instruction/ReferenceInstruction.java`
#### Snippet
```java

public interface ReferenceInstruction extends Instruction {
    @Nonnull
    Reference getReference();
    int getReferenceType();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
    public static final int OTHER = 0;

    @Nonnull
		private final Opcodes opcodes;

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/io/MemoryDeferredOutputStream.java`
#### Snippet
```java
    }

    @Override public void write(byte[] bytes) throws IOException {
        write(bytes, 0, bytes.length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/io/MemoryDeferredOutputStream.java`
#### Snippet
```java
    }

    @Override public void write(byte[] bytes, int offset, int length) throws IOException {
        int remaining = remaining();
        int written = 0;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DebugWriter.java`
#### Snippet
```java
    @Nonnull private final StringSection<StringKey, ?> stringSection;
    @Nonnull private final TypeSection<StringKey, TypeKey, ?> typeSection;
    @Nonnull private final DexDataWriter writer;
    private int currentAddress;
    private int currentLine;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DebugWriter.java`
#### Snippet
```java

public class DebugWriter<StringKey extends CharSequence, TypeKey extends CharSequence> {
    @Nonnull private final StringSection<StringKey, ?> stringSection;
    @Nonnull private final TypeSection<StringKey, TypeKey, ?> typeSection;
    @Nonnull private final DexDataWriter writer;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DebugWriter.java`
#### Snippet
```java
public class DebugWriter<StringKey extends CharSequence, TypeKey extends CharSequence> {
    @Nonnull private final StringSection<StringKey, ?> stringSection;
    @Nonnull private final TypeSection<StringKey, TypeKey, ?> typeSection;
    @Nonnull private final DexDataWriter writer;
    private int currentAddress;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/EncodedValueWriter.java`
#### Snippet
```java
    @Nonnull private final ProtoSection<?, ?, ProtoRefKey, ?> protoSection;
    @Nonnull private final MethodHandleSection<MethodHandleKey, ?, ?> methodHandleSection;
    @Nonnull private final AnnotationSection<StringKey, TypeKey, ?, AnnotationElement, EncodedValue> annotationSection;

    public EncodedValueWriter(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/EncodedValueWriter.java`
#### Snippet
```java
        MethodRefKey extends MethodReference, AnnotationElement extends com.android.tools.smali.dexlib2.iface.AnnotationElement,
        ProtoRefKey, MethodHandleKey extends MethodHandleReference, EncodedValue> {
    @Nonnull private final DexDataWriter writer;
    @Nonnull private final StringSection<StringKey, ?> stringSection;
    @Nonnull private final TypeSection<?, TypeKey, ?> typeSection;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/EncodedValueWriter.java`
#### Snippet
```java
    @Nonnull private final MethodSection<?, ?, ?, MethodRefKey, ?> methodSection;
    @Nonnull private final ProtoSection<?, ?, ProtoRefKey, ?> protoSection;
    @Nonnull private final MethodHandleSection<MethodHandleKey, ?, ?> methodHandleSection;
    @Nonnull private final AnnotationSection<StringKey, TypeKey, ?, AnnotationElement, EncodedValue> annotationSection;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/EncodedValueWriter.java`
#### Snippet
```java
        ProtoRefKey, MethodHandleKey extends MethodHandleReference, EncodedValue> {
    @Nonnull private final DexDataWriter writer;
    @Nonnull private final StringSection<StringKey, ?> stringSection;
    @Nonnull private final TypeSection<?, TypeKey, ?> typeSection;
    @Nonnull private final FieldSection<?, ?, FieldRefKey, ?> fieldSection;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/EncodedValueWriter.java`
#### Snippet
```java
    @Nonnull private final FieldSection<?, ?, FieldRefKey, ?> fieldSection;
    @Nonnull private final MethodSection<?, ?, ?, MethodRefKey, ?> methodSection;
    @Nonnull private final ProtoSection<?, ?, ProtoRefKey, ?> protoSection;
    @Nonnull private final MethodHandleSection<MethodHandleKey, ?, ?> methodHandleSection;
    @Nonnull private final AnnotationSection<StringKey, TypeKey, ?, AnnotationElement, EncodedValue> annotationSection;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/EncodedValueWriter.java`
#### Snippet
```java
    @Nonnull private final TypeSection<?, TypeKey, ?> typeSection;
    @Nonnull private final FieldSection<?, ?, FieldRefKey, ?> fieldSection;
    @Nonnull private final MethodSection<?, ?, ?, MethodRefKey, ?> methodSection;
    @Nonnull private final ProtoSection<?, ?, ProtoRefKey, ?> protoSection;
    @Nonnull private final MethodHandleSection<MethodHandleKey, ?, ?> methodHandleSection;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/EncodedValueWriter.java`
#### Snippet
```java
    @Nonnull private final DexDataWriter writer;
    @Nonnull private final StringSection<StringKey, ?> stringSection;
    @Nonnull private final TypeSection<?, TypeKey, ?> typeSection;
    @Nonnull private final FieldSection<?, ?, FieldRefKey, ?> fieldSection;
    @Nonnull private final MethodSection<?, ?, ?, MethodRefKey, ?> methodSection;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/EncodedValueWriter.java`
#### Snippet
```java
    @Nonnull private final StringSection<StringKey, ?> stringSection;
    @Nonnull private final TypeSection<?, TypeKey, ?> typeSection;
    @Nonnull private final FieldSection<?, ?, FieldRefKey, ?> fieldSection;
    @Nonnull private final MethodSection<?, ?, ?, MethodRefKey, ?> methodSection;
    @Nonnull private final ProtoSection<?, ?, ProtoRefKey, ?> protoSection;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/io/MemoryDataStore.java`
#### Snippet
```java
            }

            @Override public int read(byte[] b, int off, int len) throws IOException {
                int readLength = Math.min(len, size - position);
                if (readLength <= 0) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/io/MemoryDataStore.java`
#### Snippet
```java
            }

            @Override public int read(byte[] b) throws IOException {
                int readLength = Math.min(b.length, size - position);
                if (readLength <= 0) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/io/MemoryDataStore.java`
#### Snippet
```java
            }

            @Override public void write(byte[] b, int off, int len) throws IOException {
                growBufferIfNeeded(position + len);
                System.arraycopy(b, off, buf, position, len);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/io/MemoryDataStore.java`
#### Snippet
```java
            }

            @Override public void write(byte[] b) throws IOException {
                growBufferIfNeeded(position + b.length);
                System.arraycopy(b, 0, buf, position, b.length);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/BasePool.java`
#### Snippet
```java

public class BasePool<Key, Value> implements Markable {
    @Nonnull protected final DexPool dexPool;
    @Nonnull protected final Map<Key, Value> internedItems = Maps.newLinkedHashMap();
    private int markedItemCount = -1;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/BasePool.java`
#### Snippet
```java
public class BasePool<Key, Value> implements Markable {
    @Nonnull protected final DexPool dexPool;
    @Nonnull protected final Map<Key, Value> internedItems = Maps.newLinkedHashMap();
    private int markedItemCount = -1;

```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/PoolMethodProto.java`
#### Snippet
```java

    @Override
    public List<? extends CharSequence> getParameterTypes() {
        return methodReference.getParameterTypes();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/PoolMethodProto.java`
#### Snippet
```java

    @Override
    public String getReturnType() {
        return methodReference.getReturnType();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/io/FileDeferredOutputStream.java`
#### Snippet
```java
    }

    @Override public void write(byte[] bytes) throws IOException {
        output.write(bytes);
        writtenBytes += bytes.length;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/io/FileDeferredOutputStream.java`
#### Snippet
```java
    private static final int DEFAULT_BUFFER_SIZE = 4 * 1024;

    @Nonnull private final File backingFile;
    @Nonnull private final NakedBufferedOutputStream output;
    private int writtenBytes;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/io/FileDeferredOutputStream.java`
#### Snippet
```java

    @Nonnull private final File backingFile;
    @Nonnull private final NakedBufferedOutputStream output;
    private int writtenBytes;

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/io/FileDeferredOutputStream.java`
#### Snippet
```java
    }

    @Override public void write(byte[] bytes, int off, int len) throws IOException {
        output.write(bytes, off, len);
        writtenBytes += len;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/TypeListPool.java`
#### Snippet
```java
    public static class Key<TypeCollection extends Collection<? extends CharSequence>>
            implements Comparable<Key<? extends Collection<? extends CharSequence>>> {
        @Nonnull TypeCollection types;

        public Key(@Nonnull TypeCollection types) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexDataWriter.java`
#### Snippet
```java

    @Override
    public void write(byte[] b) throws IOException {
        write(b, 0, b.length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexDataWriter.java`
#### Snippet
```java

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        filePosition += len;
        super.write(b, off, len);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/PoolClassDef.java`
#### Snippet
```java
    @Nonnull final ImmutableSortedSet<Field> instanceFields;
    @Nonnull final ImmutableSortedSet<PoolMethod> directMethods;
    @Nonnull final ImmutableSortedSet<PoolMethod> virtualMethods;

    int classDefIndex = DexPool.NO_INDEX;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/PoolClassDef.java`
#### Snippet
```java
    @Nonnull final ImmutableSortedSet<Field> staticFields;
    @Nonnull final ImmutableSortedSet<Field> instanceFields;
    @Nonnull final ImmutableSortedSet<PoolMethod> directMethods;
    @Nonnull final ImmutableSortedSet<PoolMethod> virtualMethods;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/PoolClassDef.java`
#### Snippet
```java
    @Nonnull final TypeListPool.Key<List<String>> interfaces;
    @Nonnull final ImmutableSortedSet<Field> staticFields;
    @Nonnull final ImmutableSortedSet<Field> instanceFields;
    @Nonnull final ImmutableSortedSet<PoolMethod> directMethods;
    @Nonnull final ImmutableSortedSet<PoolMethod> virtualMethods;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/PoolClassDef.java`
#### Snippet
```java
    @Nonnull final ClassDef classDef;
    @Nonnull final TypeListPool.Key<List<String>> interfaces;
    @Nonnull final ImmutableSortedSet<Field> staticFields;
    @Nonnull final ImmutableSortedSet<Field> instanceFields;
    @Nonnull final ImmutableSortedSet<PoolMethod> directMethods;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/PoolClassDef.java`
#### Snippet
```java
class PoolClassDef extends BaseTypeReference implements ClassDef {
    @Nonnull final ClassDef classDef;
    @Nonnull final TypeListPool.Key<List<String>> interfaces;
    @Nonnull final ImmutableSortedSet<Field> staticFields;
    @Nonnull final ImmutableSortedSet<Field> instanceFields;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/PoolClassDef.java`
#### Snippet
```java

class PoolClassDef extends BaseTypeReference implements ClassDef {
    @Nonnull final ClassDef classDef;
    @Nonnull final TypeListPool.Key<List<String>> interfaces;
    @Nonnull final ImmutableSortedSet<Field> staticFields;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/PoolMethod.java`
#### Snippet
```java

class PoolMethod extends BaseMethodReference implements Method {
    @Nonnull private final Method method;
    protected int annotationSetRefListOffset = DexPool.NO_OFFSET;
    protected int codeItemOffset = DexPool.NO_OFFSET;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BaseBuilderPool.java`
#### Snippet
```java

public class BaseBuilderPool {
    @Nonnull protected final DexBuilder dexBuilder;

    public BaseBuilderPool(@Nonnull DexBuilder dexBuilder) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderAnnotation.java`
#### Snippet
```java
    int visibility;
    @Nonnull final BuilderTypeReference type;
    @Nonnull final Set<? extends BuilderAnnotationElement> elements;
    int offset = DexWriter.NO_OFFSET;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderAnnotation.java`
#### Snippet
```java
class BuilderAnnotation extends BaseAnnotation {
    int visibility;
    @Nonnull final BuilderTypeReference type;
    @Nonnull final Set<? extends BuilderAnnotationElement> elements;
    int offset = DexWriter.NO_OFFSET;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderAnnotationPool.java`
#### Snippet
```java
class BuilderAnnotationPool extends BaseBuilderPool implements AnnotationSection<BuilderStringReference,
        BuilderTypeReference, BuilderAnnotation, BuilderAnnotationElement, BuilderEncodedValue> {
    @Nonnull private final ConcurrentMap<Annotation, BuilderAnnotation> internedItems =
            Maps.newConcurrentMap();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderStringPool.java`
#### Snippet
```java

class BuilderStringPool implements StringSection<BuilderStringReference, BuilderStringReference> {
    @Nonnull private final ConcurrentMap<String, BuilderStringReference> internedItems = Maps.newConcurrentMap();

    @Nonnull BuilderStringReference internString(@Nonnull String string) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
    @Nonnull private final ProtoSection<?, ?, ProtoRefKey, ?> protoSection;
    @Nonnull private final MethodHandleSection<MethodHandleKey, ?, ?> methodHandleSection;
    @Nonnull private final CallSiteSection<CallSiteKey, ?> callSiteSection;

    @Nonnull static <StringRef extends StringReference, TypeRef extends TypeReference,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
    @Nonnull private final FieldSection<?, ?, FieldRefKey, ?> fieldSection;
    @Nonnull private final MethodSection<?, ?, ?, MethodRefKey, ?> methodSection;
    @Nonnull private final ProtoSection<?, ?, ProtoRefKey, ?> protoSection;
    @Nonnull private final MethodHandleSection<MethodHandleKey, ?, ?> methodHandleSection;
    @Nonnull private final CallSiteSection<CallSiteKey, ?> callSiteSection;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
    @Nonnull private final DexDataWriter writer;
    @Nonnull private final StringSection<?, StringRef> stringSection;
    @Nonnull private final TypeSection<?, ?, TypeRef> typeSection;
    @Nonnull private final FieldSection<?, ?, FieldRefKey, ?> fieldSection;
    @Nonnull private final MethodSection<?, ?, ?, MethodRefKey, ?> methodSection;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
        ProtoRefKey extends MethodProtoReference, MethodHandleKey extends MethodHandleReference,
        CallSiteKey extends CallSiteReference> {
    @Nonnull private final Opcodes opcodes;
    @Nonnull private final DexDataWriter writer;
    @Nonnull private final StringSection<?, StringRef> stringSection;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
    @Nonnull private final TypeSection<?, ?, TypeRef> typeSection;
    @Nonnull private final FieldSection<?, ?, FieldRefKey, ?> fieldSection;
    @Nonnull private final MethodSection<?, ?, ?, MethodRefKey, ?> methodSection;
    @Nonnull private final ProtoSection<?, ?, ProtoRefKey, ?> protoSection;
    @Nonnull private final MethodHandleSection<MethodHandleKey, ?, ?> methodHandleSection;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
    @Nonnull private final MethodSection<?, ?, ?, MethodRefKey, ?> methodSection;
    @Nonnull private final ProtoSection<?, ?, ProtoRefKey, ?> protoSection;
    @Nonnull private final MethodHandleSection<MethodHandleKey, ?, ?> methodHandleSection;
    @Nonnull private final CallSiteSection<CallSiteKey, ?> callSiteSection;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
    @Nonnull private final StringSection<?, StringRef> stringSection;
    @Nonnull private final TypeSection<?, ?, TypeRef> typeSection;
    @Nonnull private final FieldSection<?, ?, FieldRefKey, ?> fieldSection;
    @Nonnull private final MethodSection<?, ?, ?, MethodRefKey, ?> methodSection;
    @Nonnull private final ProtoSection<?, ?, ProtoRefKey, ?> protoSection;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
    @Nonnull private final Opcodes opcodes;
    @Nonnull private final DexDataWriter writer;
    @Nonnull private final StringSection<?, StringRef> stringSection;
    @Nonnull private final TypeSection<?, ?, TypeRef> typeSection;
    @Nonnull private final FieldSection<?, ?, FieldRefKey, ?> fieldSection;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
        CallSiteKey extends CallSiteReference> {
    @Nonnull private final Opcodes opcodes;
    @Nonnull private final DexDataWriter writer;
    @Nonnull private final StringSection<?, StringRef> stringSection;
    @Nonnull private final TypeSection<?, ?, TypeRef> typeSection;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderAnnotationElement.java`
#### Snippet
```java
public class BuilderAnnotationElement extends BaseAnnotationElement {
    @Nonnull final BuilderStringReference name;
    @Nonnull final BuilderEncodedValue value;

    public BuilderAnnotationElement(@Nonnull BuilderStringReference name, @Nonnull BuilderEncodedValue value) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderAnnotationElement.java`
#### Snippet
```java

public class BuilderAnnotationElement extends BaseAnnotationElement {
    @Nonnull final BuilderStringReference name;
    @Nonnull final BuilderEncodedValue value;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderFieldPool.java`
#### Snippet
```java
        implements
    FieldSection<BuilderStringReference, BuilderTypeReference, BuilderFieldReference, BuilderField> {
    @Nonnull private final ConcurrentMap<FieldReference, BuilderFieldReference> internedItems =
            Maps.newConcurrentMap();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethodPool.java`
#### Snippet
```java
    private static class MethodKey extends BaseMethodReference implements MethodReference {
        @Nonnull private final String definingClass;
        @Nonnull private final String name;
        @Nonnull private final List<? extends CharSequence> parameterTypes;
        @Nonnull private final String returnType;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethodPool.java`
#### Snippet
```java

    private static class MethodKey extends BaseMethodReference implements MethodReference {
        @Nonnull private final String definingClass;
        @Nonnull private final String name;
        @Nonnull private final List<? extends CharSequence> parameterTypes;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethodPool.java`
#### Snippet
```java
        @Nonnull private final String name;
        @Nonnull private final List<? extends CharSequence> parameterTypes;
        @Nonnull private final String returnType;

        public MethodKey(@Nonnull String definingClass, @Nonnull String name,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethodPool.java`
#### Snippet
```java
        @Nonnull private final String definingClass;
        @Nonnull private final String name;
        @Nonnull private final List<? extends CharSequence> parameterTypes;
        @Nonnull private final String returnType;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethodPool.java`
#### Snippet
```java
class BuilderMethodPool extends BaseBuilderPool implements MethodSection<BuilderStringReference, BuilderTypeReference,
        BuilderMethodProtoReference, BuilderMethodReference, BuilderMethod> {
    @Nonnull private final ConcurrentMap<MethodReference, BuilderMethodReference> internedItems =
            Maps.newConcurrentMap();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderTypeListPool.java`
#### Snippet
```java
class BuilderTypeListPool extends BaseBuilderPool implements
    TypeListSection<BuilderTypeReference, BuilderTypeList> {
    @Nonnull private final ConcurrentMap<List<? extends CharSequence>, BuilderTypeList> internedItems =
            Maps.newConcurrentMap();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderFieldReference.java`
#### Snippet
```java
public class BuilderFieldReference extends BaseFieldReference implements BuilderReference {
    @Nonnull final BuilderTypeReference definingClass;
    @Nonnull final BuilderStringReference name;
    @Nonnull final BuilderTypeReference fieldType;
    int index = DexWriter.NO_INDEX;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderFieldReference.java`
#### Snippet
```java

public class BuilderFieldReference extends BaseFieldReference implements BuilderReference {
    @Nonnull final BuilderTypeReference definingClass;
    @Nonnull final BuilderStringReference name;
    @Nonnull final BuilderTypeReference fieldType;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderFieldReference.java`
#### Snippet
```java
    @Nonnull final BuilderTypeReference definingClass;
    @Nonnull final BuilderStringReference name;
    @Nonnull final BuilderTypeReference fieldType;
    int index = DexWriter.NO_INDEX;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethod.java`
#### Snippet
```java
    @Nonnull final List<? extends BuilderMethodParameter> parameters;
    final int accessFlags;
    @Nonnull final BuilderAnnotationSet annotations;
    @Nonnull final Set<HiddenApiRestriction> hiddenApiRestrictions;
    @Nullable final MethodImplementation methodImplementation;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethod.java`
#### Snippet
```java
    @Nonnull final BuilderAnnotationSet annotations;
    @Nonnull final Set<HiddenApiRestriction> hiddenApiRestrictions;
    @Nullable final MethodImplementation methodImplementation;

    int annotationSetRefListOffset = DexWriter.NO_OFFSET;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethod.java`
#### Snippet
```java
    final int accessFlags;
    @Nonnull final BuilderAnnotationSet annotations;
    @Nonnull final Set<HiddenApiRestriction> hiddenApiRestrictions;
    @Nullable final MethodImplementation methodImplementation;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethod.java`
#### Snippet
```java

public class BuilderMethod extends BaseMethodReference implements Method {
    @Nonnull final BuilderMethodReference methodReference;
    @Nonnull final List<? extends BuilderMethodParameter> parameters;
    final int accessFlags;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethod.java`
#### Snippet
```java
public class BuilderMethod extends BaseMethodReference implements Method {
    @Nonnull final BuilderMethodReference methodReference;
    @Nonnull final List<? extends BuilderMethodParameter> parameters;
    final int accessFlags;
    @Nonnull final BuilderAnnotationSet annotations;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/ClassPool.java`
#### Snippet
```java
    @Nonnull @Override public Collection<? extends Map.Entry<PoolClassDef, Integer>> getItems() {
        class MapEntry implements Map.Entry<PoolClassDef, Integer> {
            @Nonnull private final PoolClassDef classDef;

            public MapEntry(@Nonnull PoolClassDef classDef) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethodHandleReference.java`
#### Snippet
```java
public class BuilderMethodHandleReference extends BaseMethodHandleReference implements BuilderReference {
    final int methodHandleType;
    @Nonnull final BuilderReference memberReference;
    int index = DexWriter.NO_INDEX;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderTypeReference.java`
#### Snippet
```java

public class BuilderTypeReference extends BaseTypeReference implements BuilderReference {
    @Nonnull final BuilderStringReference stringReference;
    int index = DexWriter.NO_INDEX;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/util/TryListBuilder.java`
#### Snippet
```java
        public int startCodeAddress;
        public int endCodeAddress;
        @Nonnull public List<EH> exceptionHandlers = Lists.newArrayList();

        public MutableTryBlock(int startCodeAddress, int endCodeAddress) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/util/TryListBuilder.java`
#### Snippet
```java
    private static class TryBounds<EH extends ExceptionHandler> {
        @Nonnull public final MutableTryBlock<EH> start;
        @Nonnull public final MutableTryBlock<EH> end;

        public TryBounds(@Nonnull MutableTryBlock<EH> start, @Nonnull MutableTryBlock<EH> end) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/util/TryListBuilder.java`
#### Snippet
```java
        return Lists.newArrayList(new Iterator<TryBlock<EH>>() {
            // The next TryBlock to return. This has already been merged, if needed.
            @Nullable private MutableTryBlock<EH> next;

            {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/util/TryListBuilder.java`
#### Snippet
```java

    private static class TryBounds<EH extends ExceptionHandler> {
        @Nonnull public final MutableTryBlock<EH> start;
        @Nonnull public final MutableTryBlock<EH> end;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderCallSiteReference.java`
#### Snippet
```java

public class BuilderCallSiteReference extends BaseCallSiteReference implements BuilderReference {
    @Nonnull final String name;
    @Nonnull final BuilderArrayEncodedValue encodedCallSite;
    int index = DexWriter.NO_INDEX;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderCallSiteReference.java`
#### Snippet
```java
public class BuilderCallSiteReference extends BaseCallSiteReference implements BuilderReference {
    @Nonnull final String name;
    @Nonnull final BuilderArrayEncodedValue encodedCallSite;
    int index = DexWriter.NO_INDEX;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderTryBlock.java`
#### Snippet
```java
    private final int startCodeAddress;
    private final int codeUnitCount;
    @Nonnull private final List<? extends BuilderExceptionHandler> exceptionHandlers;

    public BuilderTryBlock(int startCodeAddress, int codeUnitCount,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMapEntryCollection.java`
#### Snippet
```java

public abstract class BuilderMapEntryCollection<Key> extends AbstractCollection<Map.Entry<Key, Integer>> {
    @Nonnull private final Collection<Key> keys;

    public BuilderMapEntryCollection(@Nonnull Collection<Key> keys) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMapEntryCollection.java`
#### Snippet
```java

    private class MapEntry implements Map.Entry<Key, Integer> {
        @Nonnull private Key key;

        @Nonnull @Override public Key getKey() {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderTypePool.java`
#### Snippet
```java
class BuilderTypePool extends BaseBuilderPool
        implements TypeSection<BuilderStringReference, BuilderTypeReference, BuilderTypeReference> {
    @Nonnull private final ConcurrentMap<String, BuilderTypeReference> internedItems = Maps.newConcurrentMap();

    public BuilderTypePool(@Nonnull DexBuilder dexBuilder) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderAnnotationSet.java`
#### Snippet
```java
            new BuilderAnnotationSet(ImmutableSet.<BuilderAnnotation>of());

    @Nonnull final Set<BuilderAnnotation> annotations;
    int offset = DexWriter.NO_OFFSET;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethodParameter.java`
#### Snippet
```java
public class BuilderMethodParameter extends BaseMethodParameter {
    @Nonnull final BuilderTypeReference type;
    @Nullable final BuilderStringReference name;
    @Nonnull final BuilderAnnotationSet annotations;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethodParameter.java`
#### Snippet
```java

public class BuilderMethodParameter extends BaseMethodParameter {
    @Nonnull final BuilderTypeReference type;
    @Nullable final BuilderStringReference name;
    @Nonnull final BuilderAnnotationSet annotations;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethodParameter.java`
#### Snippet
```java
    @Nonnull final BuilderTypeReference type;
    @Nullable final BuilderStringReference name;
    @Nonnull final BuilderAnnotationSet annotations;

    public BuilderMethodParameter(@Nonnull BuilderTypeReference type,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderStringReference.java`
#### Snippet
```java

public class BuilderStringReference extends BaseStringReference implements BuilderReference {
    @Nonnull final String string;
    int index = DexWriter.NO_INDEX;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderExceptionHandler.java`
#### Snippet
```java

public class BuilderExceptionHandler extends BaseExceptionHandler {
    @Nullable final BuilderTypeReference exceptionType;
    final int handlerCodeAddress;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderProtoPool.java`
#### Snippet
```java
        implements
    ProtoSection<BuilderStringReference, BuilderTypeReference, BuilderMethodProtoReference, BuilderTypeList> {
    @Nonnull private final ConcurrentMap<MethodProtoReference, BuilderMethodProtoReference> internedItems =
            Maps.newConcurrentMap();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderTypeList.java`
#### Snippet
```java
    static final BuilderTypeList EMPTY = new BuilderTypeList(ImmutableList.<BuilderTypeReference>of());

    @Nonnull final List<? extends BuilderTypeReference> types;
    int offset = DexWriter.NO_OFFSET;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderField.java`
#### Snippet
```java
    @Nullable final BuilderEncodedValue initialValue;
    @Nonnull final BuilderAnnotationSet annotations;
    @Nonnull Set<HiddenApiRestriction> hiddenApiRestrictions;

    BuilderField(@Nonnull BuilderFieldReference fieldReference,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderField.java`
#### Snippet
```java

public class BuilderField extends BaseFieldReference implements Field {
    @Nonnull final BuilderFieldReference fieldReference;
    final int accessFlags;
    @Nullable final BuilderEncodedValue initialValue;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderField.java`
#### Snippet
```java
    @Nonnull final BuilderFieldReference fieldReference;
    final int accessFlags;
    @Nullable final BuilderEncodedValue initialValue;
    @Nonnull final BuilderAnnotationSet annotations;
    @Nonnull Set<HiddenApiRestriction> hiddenApiRestrictions;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderField.java`
#### Snippet
```java
    final int accessFlags;
    @Nullable final BuilderEncodedValue initialValue;
    @Nonnull final BuilderAnnotationSet annotations;
    @Nonnull Set<HiddenApiRestriction> hiddenApiRestrictions;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderAnnotationSetPool.java`
#### Snippet
```java
class BuilderAnnotationSetPool extends BaseBuilderPool
        implements AnnotationSetSection<BuilderAnnotation, BuilderAnnotationSet> {
    @Nonnull private final ConcurrentMap<Set<? extends Annotation>, BuilderAnnotationSet> internedItems =
            Maps.newConcurrentMap();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethodProtoReference.java`
#### Snippet
```java
        MethodProtoReference, BuilderReference {
    @Nonnull final BuilderStringReference shorty;
    @Nonnull final BuilderTypeList parameterTypes;
    @Nonnull final BuilderTypeReference returnType;
    int index = DexWriter.NO_INDEX;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethodProtoReference.java`
#### Snippet
```java
public class BuilderMethodProtoReference extends BaseMethodProtoReference implements
        MethodProtoReference, BuilderReference {
    @Nonnull final BuilderStringReference shorty;
    @Nonnull final BuilderTypeList parameterTypes;
    @Nonnull final BuilderTypeReference returnType;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethodProtoReference.java`
#### Snippet
```java
    @Nonnull final BuilderStringReference shorty;
    @Nonnull final BuilderTypeList parameterTypes;
    @Nonnull final BuilderTypeReference returnType;
    int index = DexWriter.NO_INDEX;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethodReference.java`
#### Snippet
```java

public class BuilderMethodReference extends BaseMethodReference implements BuilderReference {
    @Nonnull final BuilderTypeReference definingClass;
    @Nonnull final BuilderStringReference name;
    @Nonnull final BuilderMethodProtoReference proto;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethodReference.java`
#### Snippet
```java
    @Nonnull final BuilderTypeReference definingClass;
    @Nonnull final BuilderStringReference name;
    @Nonnull final BuilderMethodProtoReference proto;
    int index = DexWriter.NO_INDEX;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethodReference.java`
#### Snippet
```java
public class BuilderMethodReference extends BaseMethodReference implements BuilderReference {
    @Nonnull final BuilderTypeReference definingClass;
    @Nonnull final BuilderStringReference name;
    @Nonnull final BuilderMethodProtoReference proto;
    int index = DexWriter.NO_INDEX;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderCallSitePool.java`
#### Snippet
```java
public class BuilderCallSitePool extends BaseBuilderPool
        implements CallSiteSection<BuilderCallSiteReference, BuilderArrayEncodedValue> {
    @Nonnull private final ConcurrentMap<CallSiteReference, BuilderCallSiteReference> internedItems =
            Maps.newConcurrentMap();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderEncodedArrayPool.java`
#### Snippet
```java
public class BuilderEncodedArrayPool extends BaseBuilderPool implements
    EncodedArraySection<BuilderArrayEncodedValue, BuilderEncodedValue> {
    @Nonnull private final ConcurrentMap<ArrayEncodedValue, BuilderArrayEncodedValue> internedItems =
            Maps.newConcurrentMap();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethodHandlePool.java`
#### Snippet
```java
        implements
    MethodHandleSection<BuilderMethodHandleReference, BuilderFieldReference, BuilderMethodReference> {
    @Nonnull private final ConcurrentMap<MethodHandleReference, BuilderMethodHandleReference> internedItems =
            Maps.newConcurrentMap();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderEncodedValues.java`
#### Snippet
```java

    public static class BuilderArrayEncodedValue extends BaseArrayEncodedValue implements BuilderEncodedValue {
        @Nonnull final List<? extends BuilderEncodedValue> elements;
        int offset = DexWriter.NO_OFFSET;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderEncodedValues.java`
#### Snippet
```java
    public static class BuilderMethodTypeEncodedValue extends BaseMethodTypeEncodedValue
            implements BuilderEncodedValue {
        @Nonnull final BuilderMethodProtoReference methodProtoReference;

        public BuilderMethodTypeEncodedValue(@Nonnull BuilderMethodProtoReference methodProtoReference) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderEncodedValues.java`
#### Snippet
```java
    public static class BuilderTypeEncodedValue extends BaseTypeEncodedValue
            implements BuilderEncodedValue {
        @Nonnull final BuilderTypeReference typeReference;

        BuilderTypeEncodedValue(@Nonnull BuilderTypeReference typeReference) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderEncodedValues.java`
#### Snippet
```java
    public static class BuilderMethodHandleEncodedValue extends BaseMethodHandleEncodedValue
            implements BuilderEncodedValue {
        @Nonnull final BuilderMethodHandleReference methodHandleReference;

        public BuilderMethodHandleEncodedValue(@Nonnull BuilderMethodHandleReference methodHandleReference) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderEncodedValues.java`
#### Snippet
```java
    public static class BuilderMethodEncodedValue extends BaseMethodEncodedValue
            implements BuilderEncodedValue {
        @Nonnull final BuilderMethodReference methodReference;

        BuilderMethodEncodedValue(@Nonnull BuilderMethodReference methodReference) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderEncodedValues.java`
#### Snippet
```java
    public static class BuilderFieldEncodedValue extends BaseFieldEncodedValue
            implements BuilderEncodedValue {
        @Nonnull final BuilderFieldReference fieldReference;

        BuilderFieldEncodedValue(@Nonnull BuilderFieldReference fieldReference) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderEncodedValues.java`
#### Snippet
```java
    public static class BuilderAnnotationEncodedValue extends BaseAnnotationEncodedValue
            implements BuilderEncodedValue {
        @Nonnull final BuilderTypeReference typeReference;
        @Nonnull final Set<? extends BuilderAnnotationElement> elements;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderEncodedValues.java`
#### Snippet
```java
    public static class BuilderEnumEncodedValue extends BaseEnumEncodedValue
            implements BuilderEncodedValue {
        @Nonnull final BuilderFieldReference enumReference;

        BuilderEnumEncodedValue(@Nonnull BuilderFieldReference enumReference) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderEncodedValues.java`
#### Snippet
```java
            implements BuilderEncodedValue {
        @Nonnull final BuilderTypeReference typeReference;
        @Nonnull final Set<? extends BuilderAnnotationElement> elements;

        BuilderAnnotationEncodedValue(@Nonnull BuilderTypeReference typeReference,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderEncodedValues.java`
#### Snippet
```java
    public static class BuilderStringEncodedValue extends BaseStringEncodedValue
            implements BuilderEncodedValue {
        @Nonnull final BuilderStringReference stringReference;

        BuilderStringEncodedValue(@Nonnull BuilderStringReference stringReference) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/BuilderInstruction.java`
#### Snippet
```java

public abstract class BuilderInstruction implements Instruction {
    @Nonnull protected final Opcode opcode;

    @Nullable MethodLocation location;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/BuilderInstruction.java`
#### Snippet
```java
    @Nonnull protected final Opcode opcode;

    @Nullable MethodLocation location;

    protected BuilderInstruction(@Nonnull Opcode opcode) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/BuilderTryBlock.java`
#### Snippet
```java
    // The end location is exclusive, it should point to the codeAddress of the instruction immediately after the last
    // covered instruction.
    @Nonnull public final Label end;

    public BuilderTryBlock(@Nonnull Label start, @Nonnull Label end, @Nullable String exceptionType,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/BuilderTryBlock.java`
#### Snippet
```java
    // We only ever have one exception handler per try block. They are later merged as needed in TryListBuilder
    @Nonnull public final BuilderExceptionHandler exceptionHandler;
    @Nonnull public final Label start;
    // The end location is exclusive, it should point to the codeAddress of the instruction immediately after the last
    // covered instruction.
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/BuilderTryBlock.java`
#### Snippet
```java
public class BuilderTryBlock extends BaseTryBlock<BuilderExceptionHandler> {
    // We only ever have one exception handler per try block. They are later merged as needed in TryListBuilder
    @Nonnull public final BuilderExceptionHandler exceptionHandler;
    @Nonnull public final Label start;
    // The end location is exclusive, it should point to the codeAddress of the instruction immediately after the last
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/SwitchLabelElement.java`
#### Snippet
```java
public class SwitchLabelElement {
    public final int key;
    @Nonnull public final Label target;

    public SwitchLabelElement(int key, @Nonnull Label target) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/ItemWithLocation.java`
#### Snippet
```java

public abstract class ItemWithLocation {
    @Nullable
    MethodLocation location;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/BuilderSwitchPayload.java`
#### Snippet
```java

public abstract class BuilderSwitchPayload extends BuilderInstruction implements SwitchPayload {
    @Nullable
    MethodLocation referrer;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/LocatedItems.java`
#### Snippet
```java

                return new Iterator<T>() {
                    private @Nullable
                    T currentItem = null;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/LocatedItems.java`
#### Snippet
```java
    // when building a new dex file, so it's worth the trouble of lazily creating
    // the labels and debugItems lists only when they are needed
    @Nullable
    private List<T> items = null;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassDef.java`
#### Snippet
```java
    @Nonnull final BuilderAnnotationSet annotations;
    @Nonnull final SortedSet<BuilderField> staticFields;
    @Nonnull final SortedSet<BuilderField> instanceFields;
    @Nonnull final SortedSet<BuilderMethod> directMethods;
    @Nonnull final SortedSet<BuilderMethod> virtualMethods;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassDef.java`
#### Snippet
```java
    final int accessFlags;
    @Nullable final BuilderTypeReference superclass;
    @Nonnull final BuilderTypeList interfaces;
    @Nullable final BuilderStringReference sourceFile;
    @Nonnull final BuilderAnnotationSet annotations;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassDef.java`
#### Snippet
```java
    @Nonnull final BuilderTypeReference type;
    final int accessFlags;
    @Nullable final BuilderTypeReference superclass;
    @Nonnull final BuilderTypeList interfaces;
    @Nullable final BuilderStringReference sourceFile;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassPool.java`
#### Snippet
```java
        BuilderTypeReference, BuilderTypeList, BuilderClassDef, BuilderField, BuilderMethod, BuilderAnnotationSet,
        BuilderArrayEncodedValue> {
    @Nonnull private final ConcurrentMap<String, BuilderClassDef> internedItems =
            Maps.newConcurrentMap();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/BuilderExceptionHandler.java`
#### Snippet
```java

public abstract class BuilderExceptionHandler extends BaseExceptionHandler {
    @Nonnull protected final Label handler;

    private BuilderExceptionHandler(@Nonnull Label handler) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassDef.java`
#### Snippet
```java
    @Nullable final BuilderStringReference sourceFile;
    @Nonnull final BuilderAnnotationSet annotations;
    @Nonnull final SortedSet<BuilderField> staticFields;
    @Nonnull final SortedSet<BuilderField> instanceFields;
    @Nonnull final SortedSet<BuilderMethod> directMethods;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassDef.java`
#### Snippet
```java
    @Nullable final BuilderTypeReference superclass;
    @Nonnull final BuilderTypeList interfaces;
    @Nullable final BuilderStringReference sourceFile;
    @Nonnull final BuilderAnnotationSet annotations;
    @Nonnull final SortedSet<BuilderField> staticFields;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassDef.java`
#### Snippet
```java
    @Nonnull final SortedSet<BuilderField> staticFields;
    @Nonnull final SortedSet<BuilderField> instanceFields;
    @Nonnull final SortedSet<BuilderMethod> directMethods;
    @Nonnull final SortedSet<BuilderMethod> virtualMethods;
    @Nullable final BuilderArrayEncodedValue staticInitializers;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassDef.java`
#### Snippet
```java
    @Nonnull final BuilderTypeList interfaces;
    @Nullable final BuilderStringReference sourceFile;
    @Nonnull final BuilderAnnotationSet annotations;
    @Nonnull final SortedSet<BuilderField> staticFields;
    @Nonnull final SortedSet<BuilderField> instanceFields;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassDef.java`
#### Snippet
```java

public class BuilderClassDef extends BaseTypeReference implements ClassDef {
    @Nonnull final BuilderTypeReference type;
    final int accessFlags;
    @Nullable final BuilderTypeReference superclass;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassDef.java`
#### Snippet
```java
    @Nonnull final SortedSet<BuilderMethod> directMethods;
    @Nonnull final SortedSet<BuilderMethod> virtualMethods;
    @Nullable final BuilderArrayEncodedValue staticInitializers;

    int classDefIndex = DexWriter.NO_INDEX;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassDef.java`
#### Snippet
```java
    @Nonnull final SortedSet<BuilderField> instanceFields;
    @Nonnull final SortedSet<BuilderMethod> directMethods;
    @Nonnull final SortedSet<BuilderMethod> virtualMethods;
    @Nullable final BuilderArrayEncodedValue staticInitializers;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/MethodLocation.java`
#### Snippet
```java

public class MethodLocation {
    @Nullable BuilderInstruction instruction;
    int codeAddress;
    int index;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/BuilderOffsetInstruction.java`
#### Snippet
```java
public abstract class BuilderOffsetInstruction extends BuilderInstruction implements
    OffsetInstruction {
    @Nonnull
    protected final Label target;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/debug/BuilderStartLocal.java`
#### Snippet
```java
    @Nullable private final StringReference name;
    @Nullable private final TypeReference type;
    @Nullable private final StringReference signature;

    public BuilderStartLocal(int register,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/debug/BuilderStartLocal.java`
#### Snippet
```java
    private final int register;
    @Nullable private final StringReference name;
    @Nullable private final TypeReference type;
    @Nullable private final StringReference signature;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/debug/BuilderStartLocal.java`
#### Snippet
```java
public class BuilderStartLocal extends BuilderDebugItem implements StartLocal {
    private final int register;
    @Nullable private final StringReference name;
    @Nullable private final TypeReference type;
    @Nullable private final StringReference signature;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/MethodImplementationBuilder.java`
#### Snippet
```java
    private final HashMap<String, Label> labels = new HashMap<String, Label>();

    @Nonnull
    private final MutableMethodImplementation impl;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/debug/BuilderSetSourceFile.java`
#### Snippet
```java

public class BuilderSetSourceFile extends BuilderDebugItem implements SetSourceFile {
    @Nullable
    private final StringReference sourceFile;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderInstruction22c.java`
#### Snippet
```java
    protected final int registerA;
    protected final int registerB;
    @Nonnull protected final Reference reference;

    public BuilderInstruction22c(@Nonnull Opcode opcode,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderSparseSwitchPayload.java`
#### Snippet
```java
    public static final Opcode OPCODE = Opcode.SPARSE_SWITCH_PAYLOAD;

    @Nonnull protected final List<BuilderSwitchElement> switchElements;

    public BuilderSparseSwitchPayload(@Nullable List<? extends SwitchLabelElement> switchElements) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderSwitchElement.java`
#### Snippet
```java
    BuilderSwitchPayload parent;
    private final int key;
    @Nonnull private final Label target;

    public BuilderSwitchElement(@Nonnull BuilderSwitchPayload parent,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderSwitchElement.java`
#### Snippet
```java

public class BuilderSwitchElement implements SwitchElement {
    @Nonnull
    BuilderSwitchPayload parent;
    private final int key;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderInstruction31c.java`
#### Snippet
```java

    protected final int registerA;
    @Nonnull protected final Reference reference;

    public BuilderInstruction31c(@Nonnull Opcode opcode,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderArrayPayload.java`
#### Snippet
```java

    protected final int elementWidth;
    @Nonnull protected final List<Number> arrayElements;

    public BuilderArrayPayload(int elementWidth,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderInstruction4rcc.java`
#### Snippet
```java

    @Nonnull protected final Reference reference;
    @Nonnull protected final Reference reference2;

    public BuilderInstruction4rcc(@Nonnull Opcode opcode,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderInstruction4rcc.java`
#### Snippet
```java
    protected final int registerCount;

    @Nonnull protected final Reference reference;
    @Nonnull protected final Reference reference2;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderInstruction20bc.java`
#### Snippet
```java

    protected final int verificationError;
    @Nonnull protected final Reference reference;

    public BuilderInstruction20bc(@Nonnull Opcode opcode,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderInstruction21c.java`
#### Snippet
```java

    protected final int registerA;
    @Nonnull protected final Reference reference;

    public BuilderInstruction21c(@Nonnull Opcode opcode,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderPackedSwitchPayload.java`
#### Snippet
```java
    public static final Opcode OPCODE = Opcode.PACKED_SWITCH_PAYLOAD;

    @Nonnull protected final List<BuilderSwitchElement> switchElements;

    public BuilderPackedSwitchPayload(final int startKey,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderInstruction3rc.java`
#### Snippet
```java
    protected final int registerCount;

    @Nonnull protected final Reference reference;

    public BuilderInstruction3rc(@Nonnull Opcode opcode,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderInstruction45cc.java`
#### Snippet
```java
    protected final int registerG;
    @Nonnull protected final Reference reference;
    @Nonnull protected final Reference reference2;

    public BuilderInstruction45cc(@Nonnull Opcode opcode,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderInstruction45cc.java`
#### Snippet
```java
    protected final int registerF;
    protected final int registerG;
    @Nonnull protected final Reference reference;
    @Nonnull protected final Reference reference2;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderInstruction35c.java`
#### Snippet
```java
    protected final int registerF;
    protected final int registerG;
    @Nonnull protected final Reference reference;

    public BuilderInstruction35c(@Nonnull Opcode opcode,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/UnknownClassProto.java`
#### Snippet
```java

public class UnknownClassProto implements TypeProto {
    @Nonnull protected final ClassPath classPath;

    public UnknownClassProto(@Nonnull ClassPath classPath) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/CustomInlineMethodResolver.java`
#### Snippet
```java
public class CustomInlineMethodResolver extends InlineMethodResolver {
    @Nonnull private final ClassPath classPath;
    @Nonnull private final Method[] inlineMethods;

    public CustomInlineMethodResolver(@Nonnull ClassPath classPath, @Nonnull String inlineTable) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/CustomInlineMethodResolver.java`
#### Snippet
```java

public class CustomInlineMethodResolver extends InlineMethodResolver {
    @Nonnull private final ClassPath classPath;
    @Nonnull private final Method[] inlineMethods;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassPath.java`
#### Snippet
```java
    };

    @Nonnull private LoadingCache<String, TypeProto> loadedClasses = CacheBuilder.newBuilder().build(classLoader);

    @Nonnull
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassPath.java`
#### Snippet
```java

    private final CacheLoader<String, TypeProto> classLoader = new CacheLoader<String, TypeProto>() {
        @Override public TypeProto load(String type) throws Exception {
            if (type.charAt(0) == '[') {
                return new ArrayProto(ClassPath.this, type);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassPath.java`
#### Snippet
```java

public class ClassPath {
    @Nonnull private final TypeProto unknownClass;
    @Nonnull private List<ClassProvider> classProviders;
    private final boolean checkPackagePrivateAccess;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassPath.java`
#### Snippet
```java
public class ClassPath {
    @Nonnull private final TypeProto unknownClass;
    @Nonnull private List<ClassProvider> classProviders;
    private final boolean checkPackagePrivateAccess;
    public final int oatVersion;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/OdexedFieldInstructionMapper.java`
#### Snippet
```java
        public final boolean isStatic;
        @Nonnull public final Opcode normalOpcode;
        @Nullable public final Opcode quickOpcode;
        @Nullable public final Opcode volatileOpcode;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/OdexedFieldInstructionMapper.java`
#### Snippet
```java
        @Nonnull public final Opcode normalOpcode;
        @Nullable public final Opcode quickOpcode;
        @Nullable public final Opcode volatileOpcode;

        public FieldOpcode(char type, @Nonnull Opcode normalOpcode, @Nullable Opcode quickOpcode,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/OdexedFieldInstructionMapper.java`
#### Snippet
```java
        public final char type;
        public final boolean isStatic;
        @Nonnull public final Opcode normalOpcode;
        @Nullable public final Opcode quickOpcode;
        @Nullable public final Opcode volatileOpcode;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/util/TypeProtoUtils.java`
#### Snippet
```java
            @Override public Iterator<TypeProto> iterator() {
                return new Iterator<TypeProto>() {
                    @Nullable private TypeProto type = getSuperclassAsTypeProto(typeProto);

                    @Override public boolean hasNext() {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/AnalyzedInstruction.java`
#### Snippet
```java
     * This contains the register types *after* the instruction has executed
     */
    @Nonnull
    protected final RegisterType[] postRegisterMap;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/AnalyzedInstruction.java`
#### Snippet
```java
     * This contains the register types *before* the instruction has executed
     */
    @Nonnull
    protected final RegisterType[] preRegisterMap;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/AnalyzedInstruction.java`
#### Snippet
```java
     * Instructions that can execution could pass on to next during normal execution
     */
    @Nonnull
    protected final LinkedList<AnalyzedInstruction> successors = new LinkedList<AnalyzedInstruction>();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/AnalyzedInstruction.java`
#### Snippet
```java
     * Instructions that can pass on execution to this one during normal execution
     */
    @Nonnull
    protected final TreeSet<AnalyzedInstruction> predecessors = new TreeSet<AnalyzedInstruction>();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/AnalyzedInstruction.java`
#### Snippet
```java
     * This contains optional register type overrides for register types from predecessors
     */
    @Nullable
    protected Map<PredecessorOverrideKey, RegisterType> predecessorRegisterOverrides = null;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/AnalyzedInstruction.java`
#### Snippet
```java
     * The actual instruction
     */
    @Nonnull
    protected Instruction instruction;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/AnalyzedInstruction.java`
#### Snippet
```java
     * The MethodAnalyzer containing this instruction
     */
    @Nonnull
    protected final MethodAnalyzer methodAnalyzer;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/MutableMethodImplementation.java`
#### Snippet
```java

    private static class SwitchPayloadReferenceLabel extends Label {
        @Nonnull public MethodLocation switchLocation;
    }

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/RegisterType.java`
#### Snippet
```java
public class RegisterType {
    public final byte category;
    @Nullable public final TypeProto type;

    private RegisterType(byte category, @Nullable TypeProto type) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/DexFileRewriter.java`
#### Snippet
```java

public class DexFileRewriter implements Rewriter<DexFile> {
    @Nonnull protected final Rewriters rewriters;

    public DexFileRewriter(@Nonnull Rewriters rewriters) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/DexFileRewriter.java`
#### Snippet
```java

    protected class RewrittenDexFile implements DexFile {
        @Nonnull protected final DexFile dexFile;

        public RewrittenDexFile(@Nonnull DexFile dexFile) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/FieldRewriter.java`
#### Snippet
```java

    protected class RewrittenField extends BaseFieldReference implements Field {
        @Nonnull protected Field field;

        public RewrittenField(@Nonnull Field field) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/FieldRewriter.java`
#### Snippet
```java

public class FieldRewriter implements Rewriter<Field> {
    @Nonnull protected final Rewriters rewriters;

    public FieldRewriter(@Nonnull Rewriters rewriters) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/InstructionRewriter.java`
#### Snippet
```java

public class InstructionRewriter implements Rewriter<Instruction> {
    @Nonnull protected final Rewriters rewriters;

    public InstructionRewriter(@Nonnull Rewriters rewriters) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/InstructionRewriter.java`
#### Snippet
```java
    protected class BaseRewrittenReferenceInstruction<T extends ReferenceInstruction>
            implements ReferenceInstruction {
        @Nonnull protected T instruction;

        protected BaseRewrittenReferenceInstruction(@Nonnull T instruction) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/MethodParameterRewriter.java`
#### Snippet
```java

public class MethodParameterRewriter implements Rewriter<MethodParameter> {
    @Nonnull protected final Rewriters rewriters;

    public MethodParameterRewriter(@Nonnull Rewriters rewriters) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/MethodParameterRewriter.java`
#### Snippet
```java

    protected class RewrittenMethodParameter extends BaseMethodParameter {
        @Nonnull protected MethodParameter methodParameter;

        public RewrittenMethodParameter(@Nonnull MethodParameter methodParameter) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/MethodReferenceRewriter.java`
#### Snippet
```java

public class MethodReferenceRewriter implements Rewriter<MethodReference> {
    @Nonnull protected final Rewriters rewriters;

    public MethodReferenceRewriter(@Nonnull Rewriters rewriters) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/MethodReferenceRewriter.java`
#### Snippet
```java

    protected class RewrittenMethodReference extends BaseMethodReference {
        @Nonnull protected MethodReference methodReference;

        public RewrittenMethodReference(@Nonnull MethodReference methodReference) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/MethodImplementationRewriter.java`
#### Snippet
```java

public class MethodImplementationRewriter implements Rewriter<MethodImplementation> {
    @Nonnull protected final Rewriters rewriters;

    public MethodImplementationRewriter(@Nonnull Rewriters rewriters) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/MethodImplementationRewriter.java`
#### Snippet
```java

    protected class RewrittenMethodImplementation implements MethodImplementation {
        @Nonnull protected MethodImplementation methodImplementation;

        public RewrittenMethodImplementation(@Nonnull MethodImplementation methodImplementation) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/CallSiteReferenceRewriter.java`
#### Snippet
```java

    protected class RewrittenCallSiteReference extends BaseCallSiteReference {
        @Nonnull protected CallSiteReference callSiteReference;

        public RewrittenCallSiteReference(@Nonnull CallSiteReference callSiteReference) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/CallSiteReferenceRewriter.java`
#### Snippet
```java

public class CallSiteReferenceRewriter implements Rewriter<CallSiteReference> {
    @Nonnull protected final Rewriters rewriters;

    public CallSiteReferenceRewriter(@Nonnull Rewriters rewriters) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/DebugItemRewriter.java`
#### Snippet
```java

    protected class BaseRewrittenLocalInfoDebugItem<T extends DebugItem & LocalInfo> implements DebugItem, LocalInfo {
        @Nonnull protected T debugItem;

        public BaseRewrittenLocalInfoDebugItem (@Nonnull T debugItem) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/DebugItemRewriter.java`
#### Snippet
```java

public class DebugItemRewriter implements Rewriter<DebugItem> {
    @Nonnull protected final Rewriters rewriters;

    public DebugItemRewriter(@Nonnull Rewriters rewriters) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/ExceptionHandlerRewriter.java`
#### Snippet
```java

public class ExceptionHandlerRewriter implements Rewriter<ExceptionHandler> {
    @Nonnull protected final Rewriters rewriters;

    public ExceptionHandlerRewriter(@Nonnull Rewriters rewriters) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/ExceptionHandlerRewriter.java`
#### Snippet
```java

    protected class RewrittenExceptionHandler extends BaseExceptionHandler {
        @Nonnull protected ExceptionHandler exceptionHandler;

        public RewrittenExceptionHandler(@Nonnull ExceptionHandler exceptionHandler) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/FieldReferenceRewriter.java`
#### Snippet
```java

    protected class RewrittenFieldReference extends BaseFieldReference {
        @Nonnull protected FieldReference fieldReference;

        public RewrittenFieldReference(@Nonnull FieldReference fieldReference) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/FieldReferenceRewriter.java`
#### Snippet
```java

public class FieldReferenceRewriter implements Rewriter<FieldReference> {
    @Nonnull protected final Rewriters rewriters;

    public FieldReferenceRewriter(@Nonnull Rewriters rewriters) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/AnnotationRewriter.java`
#### Snippet
```java

public class AnnotationRewriter implements Rewriter<Annotation> {
    @Nonnull protected final Rewriters rewriters;

    public AnnotationRewriter(@Nonnull Rewriters rewriters) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/AnnotationRewriter.java`
#### Snippet
```java

    protected class RewrittenAnnotation extends BaseAnnotation {
        @Nonnull protected Annotation annotation;

        public RewrittenAnnotation(@Nonnull Annotation annotation) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/TryBlockRewriter.java`
#### Snippet
```java

public class TryBlockRewriter implements Rewriter<TryBlock<? extends ExceptionHandler>> {
    @Nonnull protected final Rewriters rewriters;

    public TryBlockRewriter(@Nonnull Rewriters rewriters) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/TryBlockRewriter.java`
#### Snippet
```java

    protected class RewrittenTryBlock extends BaseTryBlock<ExceptionHandler> {
        @Nonnull protected TryBlock<? extends ExceptionHandler> tryBlock;

        public RewrittenTryBlock(@Nonnull TryBlock<? extends ExceptionHandler> tryBlock) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/AnnotationElementRewriter.java`
#### Snippet
```java

public class AnnotationElementRewriter implements Rewriter<AnnotationElement> {
    @Nonnull protected final Rewriters rewriters;

    public AnnotationElementRewriter(@Nonnull Rewriters rewriters) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/AnnotationElementRewriter.java`
#### Snippet
```java

    protected class RewrittenAnnotationElement extends BaseAnnotationElement {
        @Nonnull protected AnnotationElement annotationElement;

        public RewrittenAnnotationElement(@Nonnull AnnotationElement annotationElement) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/MethodRewriter.java`
#### Snippet
```java

    protected class RewrittenMethod extends BaseMethodReference implements Method {
        @Nonnull protected Method method;

        public RewrittenMethod(@Nonnull Method method) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/MethodRewriter.java`
#### Snippet
```java

public class MethodRewriter implements Rewriter<Method> {
    @Nonnull protected final Rewriters rewriters;

    public MethodRewriter(@Nonnull Rewriters rewriters) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/EncodedValueRewriter.java`
#### Snippet
```java

    protected class RewrittenAnnotationEncodedValue extends BaseAnnotationEncodedValue {
        @Nonnull protected AnnotationEncodedValue annotationEncodedValue;

        public RewrittenAnnotationEncodedValue(@Nonnull AnnotationEncodedValue annotationEncodedValue) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/EncodedValueRewriter.java`
#### Snippet
```java

    protected class RewrittenMethodEncodedValue extends BaseMethodEncodedValue {
        @Nonnull protected MethodEncodedValue methodEncodedValue;

        public RewrittenMethodEncodedValue(@Nonnull MethodEncodedValue methodEncodedValue) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/EncodedValueRewriter.java`
#### Snippet
```java

    protected class RewrittenEnumEncodedValue extends BaseEnumEncodedValue {
        @Nonnull protected EnumEncodedValue enumEncodedValue;

        public RewrittenEnumEncodedValue(@Nonnull EnumEncodedValue enumEncodedValue) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/EncodedValueRewriter.java`
#### Snippet
```java

    protected class RewrittenArrayEncodedValue extends BaseArrayEncodedValue {
        @Nonnull protected ArrayEncodedValue arrayEncodedValue;

        public RewrittenArrayEncodedValue(@Nonnull ArrayEncodedValue arrayEncodedValue) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/EncodedValueRewriter.java`
#### Snippet
```java

public class EncodedValueRewriter implements Rewriter<EncodedValue> {
    @Nonnull protected final Rewriters rewriters;

    public EncodedValueRewriter(@Nonnull Rewriters rewriters) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/EncodedValueRewriter.java`
#### Snippet
```java

    protected class RewrittenTypeEncodedValue extends BaseTypeEncodedValue {
        @Nonnull protected TypeEncodedValue typeEncodedValue;

        public RewrittenTypeEncodedValue(@Nonnull TypeEncodedValue typeEncodedValue) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/EncodedValueRewriter.java`
#### Snippet
```java

    protected class RewrittenFieldEncodedValue extends BaseFieldEncodedValue {
        @Nonnull protected FieldEncodedValue fieldEncodedValue;

        public RewrittenFieldEncodedValue(@Nonnull FieldEncodedValue fieldEncodedValue) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/ClassDefRewriter.java`
#### Snippet
```java

public class ClassDefRewriter implements Rewriter<ClassDef> {
    @Nonnull protected final Rewriters rewriters;

    public ClassDefRewriter(@Nonnull Rewriters rewriters) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/ClassDefRewriter.java`
#### Snippet
```java

    protected class RewrittenClassDef extends BaseTypeReference implements ClassDef {
        @Nonnull protected ClassDef classDef;

        public RewrittenClassDef(@Nonnull ClassDef classdef) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedAnnotationElement.java`
#### Snippet
```java
    @Nonnull private final DexBackedDexFile dexFile;
    public final int nameIndex;
    @Nonnull public final EncodedValue value;

    public DexBackedAnnotationElement(@Nonnull DexBackedDexFile dexFile, @Nonnull DexReader<? extends DexBuffer> reader) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedAnnotationElement.java`
#### Snippet
```java

public class DexBackedAnnotationElement extends BaseAnnotationElement {
    @Nonnull private final DexBackedDexFile dexFile;
    public final int nameIndex;
    @Nonnull public final EncodedValue value;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBuffer.java`
#### Snippet
```java

public class DexBuffer {
    @Nonnull final byte[] buf;
    final int baseOffset;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java

    private static class CodeItemOffset<MethodKey> {
        @Nonnull MethodKey method;
        int codeOffset;

```

### NullableProblems
Parameter annotated @Nonnull must not override @Nullable parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedOdexFile.java`
#### Snippet
```java
    }

    @Nonnull public static DexBackedOdexFile fromInputStream(@Nonnull Opcodes opcodes, @Nonnull InputStream is)
            throws IOException {
        DexUtil.verifyOdexHeader(is);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedTryBlock.java`
#### Snippet
```java

public class DexBackedTryBlock extends BaseTryBlock<DexBackedExceptionHandler> {
    @Nonnull public final DexBackedDexFile dexFile;
    private final int tryItemOffset;
    private final int handlersStartOffset;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedMethodImplementation.java`
#### Snippet
```java
public class DexBackedMethodImplementation implements MethodImplementation {
    @Nonnull public final DexBackedDexFile dexFile;
    @Nonnull public final DexBackedMethod method;
    protected final int codeOffset;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedMethodImplementation.java`
#### Snippet
```java

public class DexBackedMethodImplementation implements MethodImplementation {
    @Nonnull public final DexBackedDexFile dexFile;
    @Nonnull public final DexBackedMethod method;
    protected final int codeOffset;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/ZipDexContainer.java`
#### Snippet
```java

    private final File zipFilePath;
    @Nullable private final Opcodes opcodes;

    /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedAnnotation.java`
#### Snippet
```java

public class DexBackedAnnotation extends BaseAnnotation {
    @Nonnull public final DexBackedDexFile dexFile;

    public final int visibility;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexReader.java`
#### Snippet
```java

public class DexReader<T extends DexBuffer> {
    @Nonnull public final T dexBuf;
    private int offset;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedTypedExceptionHandler.java`
#### Snippet
```java

public class DexBackedTypedExceptionHandler extends DexBackedExceptionHandler {
    @Nonnull private final DexBackedDexFile dexFile;
    private final int typeId;
    private final int handlerCodeAddress;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedField.java`
#### Snippet
```java

    public final int accessFlags;
    @Nullable public final EncodedValue initialValue;
    public final int annotationSetOffset;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedField.java`
#### Snippet
```java
public class DexBackedField extends BaseFieldReference implements Field {
    @Nonnull public final DexBackedDexFile dexFile;
    @Nonnull public final ClassDef classDef;

    public final int accessFlags;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedField.java`
#### Snippet
```java

public class DexBackedField extends BaseFieldReference implements Field {
    @Nonnull public final DexBackedDexFile dexFile;
    @Nonnull public final ClassDef classDef;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedMethod.java`
#### Snippet
```java

public class DexBackedMethod extends BaseMethodReference implements Method {
    @Nonnull public final DexBackedDexFile dexFile;
    @Nonnull public final DexBackedClassDef classDef;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedMethod.java`
#### Snippet
```java
public class DexBackedMethod extends BaseMethodReference implements Method {
    @Nonnull public final DexBackedDexFile dexFile;
    @Nonnull public final DexBackedClassDef classDef;

    public final int accessFlags;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/SectionAnnotator.java`
#### Snippet
```java

public abstract class SectionAnnotator {
    @Nonnull public final DexAnnotator annotator;
    @Nonnull public final DexBackedDexFile dexFile;
    public final int itemType;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/SectionAnnotator.java`
#### Snippet
```java
public abstract class SectionAnnotator {
    @Nonnull public final DexAnnotator annotator;
    @Nonnull public final DexBackedDexFile dexFile;
    public final int itemType;
    public final int sectionOffset;
```

### NullableProblems
Primitive type members cannot be annotated
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/CdexDebugOffsetTable.java`
#### Snippet
```java
 */
public class CdexDebugOffsetTable {
    @Nonnull
    public static void annotate(@Nonnull DexAnnotator annotator, DexBuffer buffer) {
        DexReader<? extends DexBuffer> reader = buffer.readerAt(annotator.getCursor());
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedDexFile.java`
#### Snippet
```java
        return new FixedSizeList<MapItem>() {
            @Override
            public MapItem readItem(int index) {
                int mapItemOffset = mapOffset + 4 + index * MapItem.ITEM_SIZE;
                return new MapItem(DexBackedDexFile.this, mapItemOffset);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedDexFile.java`
#### Snippet
```java
    private final DexBuffer dataBuffer;

    @Nonnull private final Opcodes opcodes;

    private final int stringCount;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedClassDef.java`
#### Snippet
```java
    @Nonnull public final DexBackedDexFile dexFile;
    private final int classDefOffset;
    @Nullable private final HiddenApiRestrictionsReader hiddenApiRestrictionsReader;

    private final int staticFieldsOffset;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedClassDef.java`
#### Snippet
```java
    static final int NO_HIDDEN_API_RESTRICTIONS = 7;

    @Nonnull public final DexBackedDexFile dexFile;
    private final int classDefOffset;
    @Nullable private final HiddenApiRestrictionsReader hiddenApiRestrictionsReader;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedClassDef.java`
#### Snippet
```java
                            dexFile.getDataBuffer(), methodsStartOffset) {
                        private int count;
                        @Nullable private MethodReference previousMethod;
                        private int previousIndex;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedClassDef.java`
#### Snippet
```java
                            dexFile.getDataBuffer(), fieldsStartOffset) {
                        private int count;
                        @Nullable private FieldReference previousField;
                        private int previousIndex;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedClassDef.java`
#### Snippet
```java
                            dexFile.getDataBuffer(), fieldsStartOffset) {
                        private int count;
                        @Nullable private FieldReference previousField;
                        private int previousIndex;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedClassDef.java`
#### Snippet
```java
                            dexFile.getDataBuffer(), methodsStartOffset) {
                        private int count;
                        @Nullable private MethodReference previousMethod;
                        private int previousIndex;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedClassDef.java`
#### Snippet
```java
    private final int virtualMethodCount;

    @Nullable private AnnotationsDirectory annotationsDirectory;

    public DexBackedClassDef(@Nonnull DexBackedDexFile dexFile,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/OatFile.java`
#### Snippet
```java

    private final boolean is64bit;
    @Nonnull private final OatHeader oatHeader;
    @Nonnull private final Opcodes opcodes;
    @Nullable private final VdexProvider vdexProvider;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/OatFile.java`
#### Snippet
```java

    class SymbolTable {
        @Nonnull private final StringTable stringTable;
        private final int offset;
        private final int entryCount;
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/OatFile.java`
#### Snippet
```java
        }

        public DexBackedDexFile getDexFile() {
            if (CDexBackedDexFile.isCdex(buf, dexOffset)) {
                return new OatCDexFile(buf, dexOffset);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/OatFile.java`
#### Snippet
```java
    private final boolean is64bit;
    @Nonnull private final OatHeader oatHeader;
    @Nonnull private final Opcodes opcodes;
    @Nullable private final VdexProvider vdexProvider;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/OatFile.java`
#### Snippet
```java
    @Nonnull private final OatHeader oatHeader;
    @Nonnull private final Opcodes opcodes;
    @Nullable private final VdexProvider vdexProvider;

    public OatFile(@Nonnull byte[] buf) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java

    // Which instructions have been analyzed, keyed by instruction index
    @Nonnull private final BitSet analyzedState;

    @Nullable private AnalysisException analysisException = null;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
public class MethodAnalyzer {
    @Nonnull private final Method method;
    @Nonnull private final MethodImplementation methodImpl;

    private final boolean normalizeVirtualMethods;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
    @Nonnull private final BitSet analyzedState;

    @Nullable private AnalysisException analysisException = null;

    // This is a dummy instruction that occurs immediately before the first real instruction. We can initialize the
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java

    @Nonnull private final ClassPath classPath;
    @Nullable private final InlineMethodResolver inlineResolver;

    // This contains all the AnalyzedInstruction instances, keyed by the code unit address of the instruction
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
 */
public class MethodAnalyzer {
    @Nonnull private final Method method;
    @Nonnull private final MethodImplementation methodImpl;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
    private final int paramRegisterCount;

    @Nonnull private final ClassPath classPath;
    @Nullable private final InlineMethodResolver inlineResolver;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java

    // This contains all the AnalyzedInstruction instances, keyed by the code unit address of the instruction
    @Nonnull private final SparseArray<AnalyzedInstruction> analyzedInstructions =
            new SparseArray<AnalyzedInstruction>(0);

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/VariableSizeLookaheadIterator.java`
#### Snippet
```java

public abstract class VariableSizeLookaheadIterator<T> extends AbstractIterator<T> implements Iterator<T> {
    @Nonnull private final DexReader<? extends DexBuffer> reader;

    protected VariableSizeLookaheadIterator(@Nonnull DexBuffer buffer, int offset) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/VariableSizeCollection.java`
#### Snippet
```java

public abstract class VariableSizeCollection<T> extends AbstractCollection<T> {
    @Nonnull private final DexBuffer buffer;
    private final int offset;
    private final int size;
```

### NullableProblems
Overridden methods are not annotated
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/FixedSizeList.java`
#### Snippet
```java
     * @return The item at the given index
     */
    @Nonnull
    public abstract T readItem(int index);
}
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/VariableSizeSet.java`
#### Snippet
```java

public abstract class VariableSizeSet<T> extends AbstractSet<T> {
    @Nonnull private final DexBuffer buffer;
    private final int offset;
    private final int size;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/VariableSizeIterator.java`
#### Snippet
```java

public abstract class VariableSizeIterator<T> implements Iterator<T> {
    @Nonnull private final DexReader<? extends DexBuffer> reader;
    protected final int size;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/EncodedArrayItemIterator.java`
#### Snippet
```java
    private static class EncodedArrayItemIteratorImpl extends EncodedArrayItemIterator {
        @Nonnull private final DexReader<? extends DexBuffer> reader;
        @Nonnull private final DexBackedDexFile dexFile;
        private final int size;
        private int index = 0;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/EncodedArrayItemIterator.java`
#### Snippet
```java

    private static class EncodedArrayItemIteratorImpl extends EncodedArrayItemIterator {
        @Nonnull private final DexReader<? extends DexBuffer> reader;
        @Nonnull private final DexBackedDexFile dexFile;
        private final int size;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/VariableSizeList.java`
#### Snippet
```java

public abstract class VariableSizeList<T> extends AbstractSequentialList<T> {
    @Nonnull private final DexBuffer buffer;
    private final int offset;
    private final int size;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/VariableSizeListIterator.java`
#### Snippet
```java

public abstract class VariableSizeListIterator<T> implements ListIterator<T> {
    @Nonnull private DexReader<? extends DexBuffer> reader;
    protected final int size;
    private final int startOffset;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/value/DexBackedStringEncodedValue.java`
#### Snippet
```java

public class DexBackedStringEncodedValue extends BaseStringEncodedValue {
    @Nonnull public final DexBackedDexFile dexFile;
    private final int stringIndex;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/value/DexBackedMethodHandleEncodedValue.java`
#### Snippet
```java

public class DexBackedMethodHandleEncodedValue extends BaseMethodHandleEncodedValue {
    @Nonnull public final DexBackedDexFile dexFile;
    private final int methodHandleIndex;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/HeaderItem.java`
#### Snippet
```java
    public static final int DATA_START_OFFSET = 108;

    @Nonnull private DexBackedDexFile dexFile;

    public HeaderItem(@Nonnull DexBackedDexFile dexFile) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/value/DexBackedTypeEncodedValue.java`
#### Snippet
```java

public class DexBackedTypeEncodedValue extends BaseTypeEncodedValue {
    @Nonnull public final DexBackedDexFile dexFile;
    private final int typeIndex;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/value/DexBackedMethodTypeEncodedValue.java`
#### Snippet
```java

public class DexBackedMethodTypeEncodedValue extends BaseMethodTypeEncodedValue {
    @Nonnull public final DexBackedDexFile dexFile;
    private final int methodProtoIndex;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/value/DexBackedEnumEncodedValue.java`
#### Snippet
```java

public class DexBackedEnumEncodedValue extends BaseEnumEncodedValue {
    @Nonnull public final DexBackedDexFile dexFile;
    private final int fieldIndex;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/util/DexAnnotator.java`
#### Snippet
```java

public class DexAnnotator extends AnnotatedBytes {
    @Nonnull public final DexBackedDexFile dexFile;

    private final Map<Integer, SectionAnnotator> annotators = Maps.newHashMap();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/AnnotationsDirectory.java`
#### Snippet
```java

    private static class AnnotationsDirectoryImpl extends AnnotationsDirectory {
        @Nonnull public final DexBackedDexFile dexFile;
        private final int directoryOffset;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/value/DexBackedFieldEncodedValue.java`
#### Snippet
```java

public class DexBackedFieldEncodedValue extends BaseFieldEncodedValue {
    @Nonnull public final DexBackedDexFile dexFile;
    private final int fieldIndex;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/value/DexBackedAnnotationEncodedValue.java`
#### Snippet
```java
public class DexBackedAnnotationEncodedValue extends BaseAnnotationEncodedValue implements AnnotationEncodedValue {
    @Nonnull public final DexBackedDexFile dexFile;
    @Nonnull public final String type;
    private final int elementCount;
    private final int elementsOffset;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/value/DexBackedAnnotationEncodedValue.java`
#### Snippet
```java

public class DexBackedAnnotationEncodedValue extends BaseAnnotationEncodedValue implements AnnotationEncodedValue {
    @Nonnull public final DexBackedDexFile dexFile;
    @Nonnull public final String type;
    private final int elementCount;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/value/DexBackedMethodEncodedValue.java`
#### Snippet
```java

public class DexBackedMethodEncodedValue extends BaseMethodEncodedValue {
    @Nonnull public final DexBackedDexFile dexFile;
    private final int methodIndex;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/value/DexBackedArrayEncodedValue.java`
#### Snippet
```java

public class DexBackedArrayEncodedValue extends BaseArrayEncodedValue implements ArrayEncodedValue {
    @Nonnull public final DexBackedDexFile dexFile;
    private final int elementCount;
    private final int encodedArrayOffset;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/reference/DexBackedMethodHandleReference.java`
#### Snippet
```java

public class DexBackedMethodHandleReference extends BaseMethodHandleReference {
    @Nonnull public final DexBackedDexFile dexFile;
    public final int methodHandleIndex;
    public final int methodHandleOffset;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/reference/DexBackedStringReference.java`
#### Snippet
```java

public class DexBackedStringReference extends BaseStringReference {
    @Nonnull public final DexBackedDexFile dexFile;
    public final int stringIndex;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/reference/DexBackedTypeReference.java`
#### Snippet
```java

public class DexBackedTypeReference extends BaseTypeReference {
    @Nonnull public final DexBackedDexFile dexFile;
    public final int typeIndex;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/reference/DexBackedFieldReference.java`
#### Snippet
```java

public class DexBackedFieldReference extends BaseFieldReference {
    @Nonnull public final DexBackedDexFile dexFile;
    private final int fieldIndex;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/reference/DexBackedMethodProtoReference.java`
#### Snippet
```java

public class DexBackedMethodProtoReference extends BaseMethodProtoReference {
    @Nonnull public final DexBackedDexFile dexFile;
    private final int protoIndex;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/reference/DexBackedMethodReference.java`
#### Snippet
```java

public class DexBackedMethodReference extends BaseMethodReference {
    @Nonnull public final DexBackedDexFile dexFile;
    private final int methodIndex;
    private int protoIdItemOffset;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/reference/DexBackedCallSiteReference.java`
#### Snippet
```java

public class DexBackedCallSiteReference extends BaseCallSiteReference {
    @Nonnull public final DexBackedDexFile dexFile;
    public final int callSiteIndex;
    public final int callSiteIdOffset;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
     * This calculates the interfaces in the order required for vtable generation for dalvik and pre-default method ART
     */
    @Nonnull
    private final Supplier<LinkedHashMap<String, ClassDef>> preDefaultMethodInterfaceSupplier =
            Suppliers.memoize(new Supplier<LinkedHashMap<String, ClassDef>>() {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
    }

    @Nonnull private final Supplier<SparseArray<FieldReference>> artInstanceFieldsSupplier =
            Suppliers.memoize(new Supplier<SparseArray<FieldReference>>() {

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
     * This calculates the interfaces in the order required for vtable generation for post-default method ART
     */
    @Nonnull
    private final Supplier<LinkedHashMap<String, ClassDef>> postDefaultMethodInterfaceSupplier =
            Suppliers.memoize(new Supplier<LinkedHashMap<String, ClassDef>>() {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
    });

    @Nonnull private final Supplier<List<Method>> postDefaultMethodVtableSupplier = Suppliers.memoize(new Supplier<List<Method>>() {
        @Override public List<Method> get() {
            List<Method> vtable = Lists.newArrayList();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java

    //TODO: check the case when we have a package private method that overrides an interface method
    @Nonnull private final Supplier<List<Method>> preDefaultMethodVtableSupplier = Suppliers.memoize(new Supplier<List<Method>>() {
        @Override public List<Method> get() {
            List<Method> vtable = Lists.newArrayList();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
    private static final byte OTHER = 2;

    @Nonnull protected final ClassPath classPath;
    @Nonnull protected final String type;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
    }

    @Nonnull private final Supplier<SparseArray<FieldReference>> dalvikInstanceFieldsSupplier =
            Suppliers.memoize(new Supplier<SparseArray<FieldReference>>() {
                @Override public SparseArray<FieldReference> get() {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
     * generate an identical vtable
     */
    @Nonnull private final Supplier<List<Method>> buggyPostDefaultMethodVtableSupplier = Suppliers.memoize(new Supplier<List<Method>>() {
        @Override public List<Method> get() {
            List<Method> vtable = Lists.newArrayList();
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java


    @Nonnull private final Supplier<ClassDef> classDefSupplier = Suppliers.memoize(new Supplier<ClassDef>() {
        @Override public ClassDef get() {
            return classPath.getClassDef(type);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java

    @Nonnull protected final ClassPath classPath;
    @Nonnull protected final String type;

    protected boolean vtableFullyResolved = true;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/DebugInfo.java`
#### Snippet
```java

    private static class DebugInfoImpl extends DebugInfo {
        @Nonnull public final DexBackedDexFile dexFile;
        private final int debugInfoOffset;
        @Nonnull private final DexBackedMethodImplementation methodImpl;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/DebugInfo.java`
#### Snippet
```java
        @Nonnull public final DexBackedDexFile dexFile;
        private final int debugInfoOffset;
        @Nonnull private final DexBackedMethodImplementation methodImpl;

        public DebugInfoImpl(@Nonnull DexBackedDexFile dexFile,
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/instruction/DexBackedInstruction45cc.java`
#### Snippet
```java

    @Override
    public Reference getReference2() {
        return DexBackedReference.makeReference(dexFile, opcode.referenceType2,
                dexFile.getDataBuffer().readUshort(instructionStart + 6));
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/instruction/DexBackedInstruction4rcc.java`
#### Snippet
```java

    @Override
    public Reference getReference2() {
        return DexBackedReference.makeReference(dexFile, opcode.referenceType2,
                dexFile.getDataBuffer().readUshort(instructionStart + 6));
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/instruction/DexBackedInstruction.java`
#### Snippet
```java

public abstract class DexBackedInstruction implements Instruction {
    @Nonnull public final DexBackedDexFile dexFile;
    @Nonnull public final Opcode opcode;
    public final int instructionStart;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/instruction/DexBackedInstruction.java`
#### Snippet
```java
public abstract class DexBackedInstruction implements Instruction {
    @Nonnull public final DexBackedDexFile dexFile;
    @Nonnull public final Opcode opcode;
    public final int instructionStart;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableDexFile.java`
#### Snippet
```java

public class ImmutableDexFile implements DexFile {
    @Nonnull protected final ImmutableSet<? extends ImmutableClassDef> classes;
    @Nonnull private final Opcodes opcodes;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableDexFile.java`
#### Snippet
```java
public class ImmutableDexFile implements DexFile {
    @Nonnull protected final ImmutableSet<? extends ImmutableClassDef> classes;
    @Nonnull private final Opcodes opcodes;

    public ImmutableDexFile(@Nonnull Opcodes opcodes, @Nullable Collection<? extends ClassDef> classes) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableAnnotationElement.java`
#### Snippet
```java

public class ImmutableAnnotationElement extends BaseAnnotationElement {
    @Nonnull protected final String name;
    @Nonnull protected final ImmutableEncodedValue value;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableAnnotationElement.java`
#### Snippet
```java
public class ImmutableAnnotationElement extends BaseAnnotationElement {
    @Nonnull protected final String name;
    @Nonnull protected final ImmutableEncodedValue value;

    public ImmutableAnnotationElement(@Nonnull String name,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableMethodParameter.java`
#### Snippet
```java

public class ImmutableMethodParameter extends BaseMethodParameter {
    @Nonnull protected final String type;
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotation> annotations;
    @Nullable protected final String name;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableMethodParameter.java`
#### Snippet
```java
    @Nonnull protected final String type;
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotation> annotations;
    @Nullable protected final String name;

    public ImmutableMethodParameter(@Nonnull String type,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableMethodParameter.java`
#### Snippet
```java
public class ImmutableMethodParameter extends BaseMethodParameter {
    @Nonnull protected final String type;
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotation> annotations;
    @Nullable protected final String name;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableExceptionHandler.java`
#### Snippet
```java

public class ImmutableExceptionHandler extends BaseExceptionHandler implements ExceptionHandler {
    @Nullable protected final String exceptionType;
    protected final int handlerCodeAddress;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableField.java`
#### Snippet
```java
    @Nonnull protected final String definingClass;
    @Nonnull protected final String name;
    @Nonnull protected final String type;
    protected final int accessFlags;
    @Nullable protected final ImmutableEncodedValue initialValue;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableField.java`
#### Snippet
```java
    @Nonnull protected final String type;
    protected final int accessFlags;
    @Nullable protected final ImmutableEncodedValue initialValue;
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotation> annotations;
    @Nonnull protected final ImmutableSet<HiddenApiRestriction> hiddenApiRestrictions;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableField.java`
#### Snippet
```java
public class ImmutableField extends BaseFieldReference implements Field {
    @Nonnull protected final String definingClass;
    @Nonnull protected final String name;
    @Nonnull protected final String type;
    protected final int accessFlags;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableField.java`
#### Snippet
```java
    @Nullable protected final ImmutableEncodedValue initialValue;
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotation> annotations;
    @Nonnull protected final ImmutableSet<HiddenApiRestriction> hiddenApiRestrictions;

    public ImmutableField(@Nonnull String definingClass,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableMethodImplementation.java`
#### Snippet
```java
public class ImmutableMethodImplementation implements MethodImplementation {
    protected final int registerCount;
    @Nonnull protected final ImmutableList<? extends ImmutableInstruction> instructions;
    @Nonnull protected final ImmutableList<? extends ImmutableTryBlock> tryBlocks;
    @Nonnull protected final ImmutableList<? extends ImmutableDebugItem> debugItems;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableMethodImplementation.java`
#### Snippet
```java
    @Nonnull protected final ImmutableList<? extends ImmutableInstruction> instructions;
    @Nonnull protected final ImmutableList<? extends ImmutableTryBlock> tryBlocks;
    @Nonnull protected final ImmutableList<? extends ImmutableDebugItem> debugItems;

    public ImmutableMethodImplementation(int registerCount,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableMethodImplementation.java`
#### Snippet
```java
    protected final int registerCount;
    @Nonnull protected final ImmutableList<? extends ImmutableInstruction> instructions;
    @Nonnull protected final ImmutableList<? extends ImmutableTryBlock> tryBlocks;
    @Nonnull protected final ImmutableList<? extends ImmutableDebugItem> debugItems;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableField.java`
#### Snippet
```java
    protected final int accessFlags;
    @Nullable protected final ImmutableEncodedValue initialValue;
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotation> annotations;
    @Nonnull protected final ImmutableSet<HiddenApiRestriction> hiddenApiRestrictions;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableField.java`
#### Snippet
```java

public class ImmutableField extends BaseFieldReference implements Field {
    @Nonnull protected final String definingClass;
    @Nonnull protected final String name;
    @Nonnull protected final String type;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableTryBlock.java`
#### Snippet
```java
    protected final int startCodeAddress;
    protected final int codeUnitCount;
    @Nonnull protected final ImmutableList<? extends ImmutableExceptionHandler> exceptionHandlers;

    public ImmutableTryBlock(int startCodeAddress,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableAnnotation.java`
#### Snippet
```java
public class ImmutableAnnotation extends BaseAnnotation {
    protected final int visibility;
    @Nonnull protected final String type;
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotationElement> elements;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableAnnotation.java`
#### Snippet
```java
    protected final int visibility;
    @Nonnull protected final String type;
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotationElement> elements;

    public ImmutableAnnotation(int visibility,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/debug/ImmutableStartLocal.java`
#### Snippet
```java
    @Nullable protected final String name;
    @Nullable protected final String type;
    @Nullable protected final String signature;

    public ImmutableStartLocal(int codeAddress,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/debug/ImmutableStartLocal.java`
#### Snippet
```java
    protected final int register;
    @Nullable protected final String name;
    @Nullable protected final String type;
    @Nullable protected final String signature;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/debug/ImmutableStartLocal.java`
#### Snippet
```java
public class ImmutableStartLocal extends ImmutableDebugItem implements StartLocal {
    protected final int register;
    @Nullable protected final String name;
    @Nullable protected final String type;
    @Nullable protected final String signature;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableMethod.java`
#### Snippet
```java
    protected final int accessFlags;
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotation> annotations;
    @Nonnull protected final ImmutableSet<HiddenApiRestriction> hiddenApiRestrictions;
    @Nullable protected final ImmutableMethodImplementation methodImplementation;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableMethod.java`
#### Snippet
```java
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotation> annotations;
    @Nonnull protected final ImmutableSet<HiddenApiRestriction> hiddenApiRestrictions;
    @Nullable protected final ImmutableMethodImplementation methodImplementation;

    public ImmutableMethod(@Nonnull String definingClass,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableMethod.java`
#### Snippet
```java
public class ImmutableMethod extends BaseMethodReference implements Method {
    @Nonnull protected final String definingClass;
    @Nonnull protected final String name;
    @Nonnull protected final ImmutableList<? extends ImmutableMethodParameter> parameters;
    @Nonnull protected final String returnType;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableMethod.java`
#### Snippet
```java
    @Nonnull protected final String definingClass;
    @Nonnull protected final String name;
    @Nonnull protected final ImmutableList<? extends ImmutableMethodParameter> parameters;
    @Nonnull protected final String returnType;
    protected final int accessFlags;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableMethod.java`
#### Snippet
```java
    @Nonnull protected final String returnType;
    protected final int accessFlags;
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotation> annotations;
    @Nonnull protected final ImmutableSet<HiddenApiRestriction> hiddenApiRestrictions;
    @Nullable protected final ImmutableMethodImplementation methodImplementation;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableMethod.java`
#### Snippet
```java
    @Nonnull protected final String name;
    @Nonnull protected final ImmutableList<? extends ImmutableMethodParameter> parameters;
    @Nonnull protected final String returnType;
    protected final int accessFlags;
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotation> annotations;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableMethod.java`
#### Snippet
```java

public class ImmutableMethod extends BaseMethodReference implements Method {
    @Nonnull protected final String definingClass;
    @Nonnull protected final String name;
    @Nonnull protected final ImmutableList<? extends ImmutableMethodParameter> parameters;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/debug/ImmutableRestartLocal.java`
#### Snippet
```java
public class ImmutableRestartLocal extends ImmutableDebugItem implements RestartLocal {
    protected final int register;
    @Nullable protected final String name;
    @Nullable protected final String type;
    @Nullable protected final String signature;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/debug/ImmutableRestartLocal.java`
#### Snippet
```java
    @Nullable protected final String name;
    @Nullable protected final String type;
    @Nullable protected final String signature;

    public ImmutableRestartLocal(int codeAddress,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/debug/ImmutableRestartLocal.java`
#### Snippet
```java
    protected final int register;
    @Nullable protected final String name;
    @Nullable protected final String type;
    @Nullable protected final String signature;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableClassDef.java`
#### Snippet
```java
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableField> instanceFields;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableMethod> directMethods;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableMethod> virtualMethods;

    public ImmutableClassDef(@Nonnull String type,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableClassDef.java`
#### Snippet
```java
    protected final int accessFlags;
    @Nullable protected final String superclass;
    @Nonnull protected final ImmutableList<String> interfaces;
    @Nullable protected final String sourceFile;
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotation> annotations;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableClassDef.java`
#### Snippet
```java
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotation> annotations;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableField> staticFields;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableField> instanceFields;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableMethod> directMethods;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableMethod> virtualMethods;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableClassDef.java`
#### Snippet
```java
    @Nullable protected final String superclass;
    @Nonnull protected final ImmutableList<String> interfaces;
    @Nullable protected final String sourceFile;
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotation> annotations;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableField> staticFields;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableClassDef.java`
#### Snippet
```java
    @Nonnull protected final ImmutableList<String> interfaces;
    @Nullable protected final String sourceFile;
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotation> annotations;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableField> staticFields;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableField> instanceFields;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableClassDef.java`
#### Snippet
```java

public class ImmutableClassDef extends BaseTypeReference implements ClassDef {
    @Nonnull protected final String type;
    protected final int accessFlags;
    @Nullable protected final String superclass;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableClassDef.java`
#### Snippet
```java
    @Nullable protected final String sourceFile;
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotation> annotations;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableField> staticFields;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableField> instanceFields;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableMethod> directMethods;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableClassDef.java`
#### Snippet
```java
    @Nonnull protected final String type;
    protected final int accessFlags;
    @Nullable protected final String superclass;
    @Nonnull protected final ImmutableList<String> interfaces;
    @Nullable protected final String sourceFile;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableClassDef.java`
#### Snippet
```java
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableField> staticFields;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableField> instanceFields;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableMethod> directMethods;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableMethod> virtualMethods;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/debug/ImmutableEndLocal.java`
#### Snippet
```java
    @Nullable protected final String name;
    @Nullable protected final String type;
    @Nullable protected final String signature;

    public ImmutableEndLocal(int codeAddress,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/debug/ImmutableEndLocal.java`
#### Snippet
```java
    protected final int register;
    @Nullable protected final String name;
    @Nullable protected final String type;
    @Nullable protected final String signature;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/debug/ImmutableEndLocal.java`
#### Snippet
```java
public class ImmutableEndLocal extends ImmutableDebugItem implements EndLocal {
    protected final int register;
    @Nullable protected final String name;
    @Nullable protected final String type;
    @Nullable protected final String signature;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/debug/ImmutableSetSourceFile.java`
#### Snippet
```java

public class ImmutableSetSourceFile extends ImmutableDebugItem implements SetSourceFile {
    @Nullable protected final String sourceFile;

    public ImmutableSetSourceFile(int codeAddress,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/value/ImmutableArrayEncodedValue.java`
#### Snippet
```java

public class ImmutableArrayEncodedValue extends BaseArrayEncodedValue implements ImmutableEncodedValue {
    @Nonnull protected final ImmutableList<? extends ImmutableEncodedValue> value;

    public ImmutableArrayEncodedValue(@Nonnull Collection<? extends EncodedValue> value) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/value/ImmutableFieldEncodedValue.java`
#### Snippet
```java

public class ImmutableFieldEncodedValue extends BaseFieldEncodedValue implements ImmutableEncodedValue {
    @Nonnull protected final ImmutableFieldReference value;

    public ImmutableFieldEncodedValue(@Nonnull ImmutableFieldReference value) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/value/ImmutableStringEncodedValue.java`
#### Snippet
```java

public class ImmutableStringEncodedValue extends BaseStringEncodedValue implements ImmutableEncodedValue {
    @Nonnull protected final String value;

    public ImmutableStringEncodedValue(@Nonnull String value) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/value/ImmutableTypeEncodedValue.java`
#### Snippet
```java

public class ImmutableTypeEncodedValue extends BaseTypeEncodedValue implements ImmutableEncodedValue {
    @Nonnull protected final String value;

    public ImmutableTypeEncodedValue(@Nonnull String value) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/value/ImmutableMethodHandleEncodedValue.java`
#### Snippet
```java

public class ImmutableMethodHandleEncodedValue extends BaseMethodHandleEncodedValue implements ImmutableEncodedValue {
    @Nonnull protected final ImmutableMethodHandleReference methodHandleReference;

    public ImmutableMethodHandleEncodedValue(@Nonnull ImmutableMethodHandleReference methodHandleReference) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/value/ImmutableMethodEncodedValue.java`
#### Snippet
```java

public class ImmutableMethodEncodedValue extends BaseMethodEncodedValue implements ImmutableEncodedValue {
    @Nonnull protected final ImmutableMethodReference value;

    public ImmutableMethodEncodedValue(@Nonnull ImmutableMethodReference value) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/value/ImmutableMethodTypeEncodedValue.java`
#### Snippet
```java

public class ImmutableMethodTypeEncodedValue extends BaseMethodTypeEncodedValue implements ImmutableEncodedValue {
    @Nonnull protected final ImmutableMethodProtoReference methodProtoReference;

    public ImmutableMethodTypeEncodedValue(@Nonnull ImmutableMethodProtoReference methodProtoReference) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/value/ImmutableEnumEncodedValue.java`
#### Snippet
```java

public class ImmutableEnumEncodedValue extends BaseEnumEncodedValue implements ImmutableEncodedValue {
    @Nonnull protected final ImmutableFieldReference value;

    public ImmutableEnumEncodedValue(@Nonnull ImmutableFieldReference value) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/reference/ImmutableStringReference.java`
#### Snippet
```java

public class ImmutableStringReference extends BaseStringReference implements ImmutableReference {
    @Nonnull protected final String str;

    public ImmutableStringReference(String str) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/value/ImmutableAnnotationEncodedValue.java`
#### Snippet
```java
public class ImmutableAnnotationEncodedValue extends BaseAnnotationEncodedValue implements ImmutableEncodedValue {
    @Nonnull protected final String type;
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotationElement> elements;

    public ImmutableAnnotationEncodedValue(@Nonnull String type,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/value/ImmutableAnnotationEncodedValue.java`
#### Snippet
```java

public class ImmutableAnnotationEncodedValue extends BaseAnnotationEncodedValue implements ImmutableEncodedValue {
    @Nonnull protected final String type;
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotationElement> elements;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/reference/ImmutableFieldReference.java`
#### Snippet
```java
public class ImmutableFieldReference extends BaseFieldReference implements ImmutableReference {
    @Nonnull protected final String definingClass;
    @Nonnull protected final String name;
    @Nonnull protected final String type;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/reference/ImmutableFieldReference.java`
#### Snippet
```java

public class ImmutableFieldReference extends BaseFieldReference implements ImmutableReference {
    @Nonnull protected final String definingClass;
    @Nonnull protected final String name;
    @Nonnull protected final String type;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/reference/ImmutableFieldReference.java`
#### Snippet
```java
    @Nonnull protected final String definingClass;
    @Nonnull protected final String name;
    @Nonnull protected final String type;

    public ImmutableFieldReference(@Nonnull String definingClass,
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/reference/ImmutableMethodProtoReference.java`
#### Snippet
```java

    @Override
    public String getReturnType() {
        return returnType;
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/reference/ImmutableMethodProtoReference.java`
#### Snippet
```java

public class ImmutableMethodProtoReference extends BaseMethodProtoReference implements ImmutableReference {
    @Nonnull protected final ImmutableList<String> parameters;
    @Nonnull protected final String returnType;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/reference/ImmutableMethodProtoReference.java`
#### Snippet
```java
public class ImmutableMethodProtoReference extends BaseMethodProtoReference implements ImmutableReference {
    @Nonnull protected final ImmutableList<String> parameters;
    @Nonnull protected final String returnType;

    public ImmutableMethodProtoReference(@Nullable ImmutableList<String> parameters,
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/reference/ImmutableMethodProtoReference.java`
#### Snippet
```java

    @Override
    public List<? extends CharSequence> getParameterTypes() {
        return parameters;
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/reference/ImmutableMethodHandleReference.java`
#### Snippet
```java
public class ImmutableMethodHandleReference extends BaseMethodHandleReference implements ImmutableReference {
    protected final int methodHandleType;
    @Nonnull protected final ImmutableReference memberReference;

    public ImmutableMethodHandleReference(int methodHandleType, @Nonnull ImmutableReference memberReference) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/reference/ImmutableTypeReference.java`
#### Snippet
```java

public class ImmutableTypeReference extends BaseTypeReference implements ImmutableReference {
    @Nonnull protected final String type;

    public ImmutableTypeReference(String type) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/reference/ImmutableCallSiteReference.java`
#### Snippet
```java
public class ImmutableCallSiteReference extends BaseCallSiteReference implements ImmutableReference {
    @Nonnull protected final String name;
    @Nonnull protected final ImmutableMethodHandleReference methodHandle;
    @Nonnull protected final String methodName;
    @Nonnull protected final ImmutableMethodProtoReference methodProto;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/reference/ImmutableCallSiteReference.java`
#### Snippet
```java

public class ImmutableCallSiteReference extends BaseCallSiteReference implements ImmutableReference {
    @Nonnull protected final String name;
    @Nonnull protected final ImmutableMethodHandleReference methodHandle;
    @Nonnull protected final String methodName;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/reference/ImmutableCallSiteReference.java`
#### Snippet
```java
    @Nonnull protected final ImmutableMethodHandleReference methodHandle;
    @Nonnull protected final String methodName;
    @Nonnull protected final ImmutableMethodProtoReference methodProto;
    @Nonnull protected final ImmutableList<? extends ImmutableEncodedValue> extraArguments;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/reference/ImmutableCallSiteReference.java`
#### Snippet
```java
    @Nonnull protected final String name;
    @Nonnull protected final ImmutableMethodHandleReference methodHandle;
    @Nonnull protected final String methodName;
    @Nonnull protected final ImmutableMethodProtoReference methodProto;
    @Nonnull protected final ImmutableList<? extends ImmutableEncodedValue> extraArguments;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/reference/ImmutableCallSiteReference.java`
#### Snippet
```java
    @Nonnull protected final String methodName;
    @Nonnull protected final ImmutableMethodProtoReference methodProto;
    @Nonnull protected final ImmutableList<? extends ImmutableEncodedValue> extraArguments;

    public ImmutableCallSiteReference(@Nonnull String name, @Nonnull MethodHandleReference methodHandle,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableInstruction22c.java`
#### Snippet
```java
    protected final int registerA;
    protected final int registerB;
    @Nonnull protected final ImmutableReference reference;

    public ImmutableInstruction22c(@Nonnull Opcode opcode,
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/formatter/DexFormattedWriter.java`
#### Snippet
```java
    }

    @Override public void write(String str) throws IOException {
        writer.write(str);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/formatter/DexFormattedWriter.java`
#### Snippet
```java
    }

    @Override public void write(String str, int off, int len) throws IOException {
        writer.write(str, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/formatter/DexFormattedWriter.java`
#### Snippet
```java
    }

    @Override public void write(char[] cbuf, int off, int len) throws IOException {
        writer.write(cbuf, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/formatter/DexFormattedWriter.java`
#### Snippet
```java
    }

    @Override public void write(char[] cbuf) throws IOException {
        writer.write(cbuf);
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/reference/ImmutableMethodReference.java`
#### Snippet
```java
    @Nonnull protected final String name;
    @Nonnull protected final ImmutableList<String> parameters;
    @Nonnull protected final String returnType;

    public ImmutableMethodReference(@Nonnull String definingClass,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/reference/ImmutableMethodReference.java`
#### Snippet
```java
public class ImmutableMethodReference extends BaseMethodReference implements ImmutableReference {
    @Nonnull protected final String definingClass;
    @Nonnull protected final String name;
    @Nonnull protected final ImmutableList<String> parameters;
    @Nonnull protected final String returnType;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/reference/ImmutableMethodReference.java`
#### Snippet
```java

public class ImmutableMethodReference extends BaseMethodReference implements ImmutableReference {
    @Nonnull protected final String definingClass;
    @Nonnull protected final String name;
    @Nonnull protected final ImmutableList<String> parameters;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/reference/ImmutableMethodReference.java`
#### Snippet
```java
    @Nonnull protected final String definingClass;
    @Nonnull protected final String name;
    @Nonnull protected final ImmutableList<String> parameters;
    @Nonnull protected final String returnType;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableInstruction35c.java`
#### Snippet
```java
    protected final int registerF;
    protected final int registerG;
    @Nonnull protected final ImmutableReference reference;

    public ImmutableInstruction35c(@Nonnull Opcode opcode,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableInstruction21c.java`
#### Snippet
```java

    protected final int registerA;
    @Nonnull protected final ImmutableReference reference;

    public ImmutableInstruction21c(@Nonnull Opcode opcode,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableArrayPayload.java`
#### Snippet
```java

    protected final int elementWidth;
    @Nonnull protected final ImmutableList<Number> arrayElements;

    public ImmutableArrayPayload(int elementWidth,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableInstruction45cc.java`
#### Snippet
```java
    protected final int registerF;
    protected final int registerG;
    @Nonnull protected final ImmutableReference reference;
    @Nonnull protected final ImmutableReference reference2;

```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableInstruction45cc.java`
#### Snippet
```java
    @Override public int getReferenceType() { return opcode.referenceType; }

    @Override public ImmutableReference getReference2() { return reference2; }
    @Override public int getReferenceType2() { return opcode.referenceType2; }

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableInstruction45cc.java`
#### Snippet
```java
    protected final int registerG;
    @Nonnull protected final ImmutableReference reference;
    @Nonnull protected final ImmutableReference reference2;

    public ImmutableInstruction45cc(@Nonnull Opcode opcode,
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableInstruction45cc.java`
#### Snippet
```java
    @Override public int getRegisterG() { return registerG; }

    @Override public ImmutableReference getReference() { return reference; }
    @Override public int getReferenceType() { return opcode.referenceType; }

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutablePackedSwitchPayload.java`
#### Snippet
```java
    public static final Opcode OPCODE = Opcode.PACKED_SWITCH_PAYLOAD;

    @Nonnull protected final ImmutableList<? extends ImmutableSwitchElement> switchElements;

    public ImmutablePackedSwitchPayload(@Nullable List<? extends SwitchElement> switchElements) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableInstruction20bc.java`
#### Snippet
```java

    protected final int verificationError;
    @Nonnull protected final ImmutableReference reference;

    public ImmutableInstruction20bc(@Nonnull Opcode opcode,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableInstruction31c.java`
#### Snippet
```java

    protected final int registerA;
    @Nonnull protected final ImmutableReference reference;

    public ImmutableInstruction31c(@Nonnull Opcode opcode,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableInstruction4rcc.java`
#### Snippet
```java

    @Nonnull protected final ImmutableReference reference;
    @Nonnull protected final ImmutableReference reference2;

    public ImmutableInstruction4rcc(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableInstruction4rcc.java`
#### Snippet
```java
    protected final int registerCount;

    @Nonnull protected final ImmutableReference reference;
    @Nonnull protected final ImmutableReference reference2;

```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableInstruction4rcc.java`
#### Snippet
```java
    @Override public int getReferenceType() { return opcode.referenceType; }

    @Override public Reference getReference2() { return reference2; }
    @Override public int getReferenceType2() { return opcode.referenceType2; }

```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableInstruction4rcc.java`
#### Snippet
```java
    @Override public int getRegisterCount() { return registerCount; }

    @Override public Reference getReference() { return reference; }
    @Override public int getReferenceType() { return opcode.referenceType; }

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableInstruction.java`
#### Snippet
```java

public abstract class ImmutableInstruction implements Instruction {
    @Nonnull protected final Opcode opcode;

    protected ImmutableInstruction(@Nonnull Opcode opcode) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableInstruction3rc.java`
#### Snippet
```java
    protected final int registerCount;

    @Nonnull protected final ImmutableReference reference;

    public ImmutableInstruction3rc(@Nonnull Opcode opcode,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableSparseSwitchPayload.java`
#### Snippet
```java
    public static final Opcode OPCODE = Opcode.SPARSE_SWITCH_PAYLOAD;

    @Nonnull protected final ImmutableList<? extends ImmutableSwitchElement> switchElements;

    public ImmutableSparseSwitchPayload(@Nullable List<? extends SwitchElement> switchElements) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Debug/StartLocalMethodItem.java`
#### Snippet
```java

public class StartLocalMethodItem extends DebugMethodItem {
    @Nonnull private final ClassDefinition classDef;
    @Nonnull private final StartLocal startLocal;
    @Nonnull private final RegisterFormatter registerFormatter;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Debug/StartLocalMethodItem.java`
#### Snippet
```java
    @Nonnull private final ClassDefinition classDef;
    @Nonnull private final StartLocal startLocal;
    @Nonnull private final RegisterFormatter registerFormatter;

    public StartLocalMethodItem(@Nonnull ClassDefinition classDef, int codeAddress, int sortOrder,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Debug/StartLocalMethodItem.java`
#### Snippet
```java
public class StartLocalMethodItem extends DebugMethodItem {
    @Nonnull private final ClassDefinition classDef;
    @Nonnull private final StartLocal startLocal;
    @Nonnull private final RegisterFormatter registerFormatter;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Debug/SetSourceFileMethodItem.java`
#### Snippet
```java

public class SetSourceFileMethodItem extends DebugMethodItem {
    @Nullable private final String sourceFile;

    public SetSourceFileMethodItem(int codeAddress, int sortOrder, @Nonnull SetSourceFile setSourceFile) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/formatter/BaksmaliFormatter.java`
#### Snippet
```java
public class BaksmaliFormatter extends DexFormatter {

    @Nullable private final String classContext;

    public BaksmaliFormatter() {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Debug/EndLocalMethodItem.java`
#### Snippet
```java
public class EndLocalMethodItem extends DebugMethodItem {
    @Nonnull private final EndLocal endLocal;
    @Nonnull private final RegisterFormatter registerFormatter;

    public EndLocalMethodItem(int codeAddress, int sortOrder, @Nonnull RegisterFormatter registerFormatter,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Debug/EndLocalMethodItem.java`
#### Snippet
```java

public class EndLocalMethodItem extends DebugMethodItem {
    @Nonnull private final EndLocal endLocal;
    @Nonnull private final RegisterFormatter registerFormatter;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Debug/RestartLocalMethodItem.java`
#### Snippet
```java

public class RestartLocalMethodItem extends DebugMethodItem {
    @Nonnull private final ClassDefinition classDef;
    @Nonnull private final RestartLocal restartLocal;
    @Nonnull private final RegisterFormatter registerFormatter;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Debug/RestartLocalMethodItem.java`
#### Snippet
```java
    @Nonnull private final ClassDefinition classDef;
    @Nonnull private final RestartLocal restartLocal;
    @Nonnull private final RegisterFormatter registerFormatter;

    public RestartLocalMethodItem(@Nonnull ClassDefinition classDef, int codeAddress, int sortOrder,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Debug/RestartLocalMethodItem.java`
#### Snippet
```java
public class RestartLocalMethodItem extends DebugMethodItem {
    @Nonnull private final ClassDefinition classDef;
    @Nonnull private final RestartLocal restartLocal;
    @Nonnull private final RegisterFormatter registerFormatter;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/formatter/BaksmaliWriter.java`
#### Snippet
```java
public class BaksmaliWriter extends DexFormattedWriter {

    @Nullable private final String classContext;

    protected final char[] buffer = new char[24];
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/IndentingWriter.java`
#### Snippet
```java

    @Override
    public void write(char[] chars) throws IOException {
        write(chars, 0, chars.length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/IndentingWriter.java`
#### Snippet
```java

    @Override
    public void write(char[] chars, int start, int len) throws IOException {
        final int end = start+len;
        int pos = start;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/IndentingWriter.java`
#### Snippet
```java

    @Override
    public void write(String s) throws IOException {
        write(s, 0, s.length());
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/IndentingWriter.java`
#### Snippet
```java

    @Override
    public void write(String str, int start, int len) throws IOException {
        final int end = start+len;
        int pos = start;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/PostInstructionRegisterInfoMethodItem.java`
#### Snippet
```java

public class PostInstructionRegisterInfoMethodItem extends MethodItem {
    @Nonnull private final RegisterFormatter registerFormatter;
    @Nonnull private final AnalyzedInstruction analyzedInstruction;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/PostInstructionRegisterInfoMethodItem.java`
#### Snippet
```java
public class PostInstructionRegisterInfoMethodItem extends MethodItem {
    @Nonnull private final RegisterFormatter registerFormatter;
    @Nonnull private final AnalyzedInstruction analyzedInstruction;

    public PostInstructionRegisterInfoMethodItem(@Nonnull RegisterFormatter registerFormatter,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/RegisterFormatter.java`
#### Snippet
```java
 */
public class RegisterFormatter {
    @Nonnull public final BaksmaliOptions options;
    public final int registerCount;
    public final int parameterRegisterCount;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/ClassDefinition.java`
#### Snippet
```java

public class ClassDefinition {
    @Nonnull public final BaksmaliOptions options;
    @Nonnull public final ClassDef classDef;
    @Nonnull private final HashSet<String> fieldsSetInStaticConstructor;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/ClassDefinition.java`
#### Snippet
```java
    @Nonnull public final ClassDef classDef;
    @Nonnull private final HashSet<String> fieldsSetInStaticConstructor;
    @Nonnull private final BaksmaliFormatter formatter;

    protected boolean validationErrors;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/ClassDefinition.java`
#### Snippet
```java
    @Nonnull public final BaksmaliOptions options;
    @Nonnull public final ClassDef classDef;
    @Nonnull private final HashSet<String> fieldsSetInStaticConstructor;
    @Nonnull private final BaksmaliFormatter formatter;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/ClassDefinition.java`
#### Snippet
```java
public class ClassDefinition {
    @Nonnull public final BaksmaliOptions options;
    @Nonnull public final ClassDef classDef;
    @Nonnull private final HashSet<String> fieldsSetInStaticConstructor;
    @Nonnull private final BaksmaliFormatter formatter;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/PreInstructionRegisterInfoMethodItem.java`
#### Snippet
```java
public class PreInstructionRegisterInfoMethodItem extends MethodItem {
    private final int registerInfo;
    @Nonnull private final MethodAnalyzer methodAnalyzer;
    @Nonnull private final RegisterFormatter registerFormatter;
    @Nonnull private final AnalyzedInstruction analyzedInstruction;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/PreInstructionRegisterInfoMethodItem.java`
#### Snippet
```java
    @Nonnull private final MethodAnalyzer methodAnalyzer;
    @Nonnull private final RegisterFormatter registerFormatter;
    @Nonnull private final AnalyzedInstruction analyzedInstruction;

    public PreInstructionRegisterInfoMethodItem(int registerInfo,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `third_party/util/src/main/java/com/android/tools/smali/util/ClassFileNameHandler.java`
#### Snippet
```java

    private class DirectoryEntry extends FileSystemEntry {
        @Nullable private File file = null;
        private int caseSensitivity = forcedCaseSensitivity;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `third_party/util/src/main/java/com/android/tools/smali/util/ClassFileNameHandler.java`
#### Snippet
```java
        @Nullable public final DirectoryEntry parent;
        @Nonnull public final String logicalName;
        @Nullable protected String physicalName = null;

        private FileSystemEntry(@Nullable DirectoryEntry parent, @Nonnull String logicalName) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/util/src/main/java/com/android/tools/smali/util/ClassFileNameHandler.java`
#### Snippet
```java
    private abstract class FileSystemEntry {
        @Nullable public final DirectoryEntry parent;
        @Nonnull public final String logicalName;
        @Nullable protected String physicalName = null;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `third_party/util/src/main/java/com/android/tools/smali/util/ClassFileNameHandler.java`
#### Snippet
```java

    private abstract class FileSystemEntry {
        @Nullable public final DirectoryEntry parent;
        @Nonnull public final String logicalName;
        @Nullable protected String physicalName = null;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/PreInstructionRegisterInfoMethodItem.java`
#### Snippet
```java
    private final int registerInfo;
    @Nonnull private final MethodAnalyzer methodAnalyzer;
    @Nonnull private final RegisterFormatter registerFormatter;
    @Nonnull private final AnalyzedInstruction analyzedInstruction;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java
    @Nonnull public final MethodImplementation methodImpl;
    @Nonnull public final ImmutableList<Instruction> instructions;
    @Nonnull public final List<Instruction> effectiveInstructions;

    @Nonnull public final ImmutableList<MethodParameter> methodParameters;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java

public class MethodDefinition {
    @Nonnull public final ClassDefinition classDef;
    @Nonnull public final Method method;
    @Nonnull public final MethodImplementation methodImpl;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java
    @Nonnull public final Method method;
    @Nonnull public final MethodImplementation methodImpl;
    @Nonnull public final ImmutableList<Instruction> instructions;
    @Nonnull public final List<Instruction> effectiveInstructions;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java
    public RegisterFormatter registerFormatter;

    @Nonnull private final LabelCache labelCache = new LabelCache();

    @Nonnull private final SparseIntArray packedSwitchMap;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java

    @Nonnull private final SparseIntArray packedSwitchMap;
    @Nonnull private final SparseIntArray sparseSwitchMap;
    @Nonnull private final InstructionOffsetMap instructionOffsetMap;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java
    @Nonnull public final List<Instruction> effectiveInstructions;

    @Nonnull public final ImmutableList<MethodParameter> methodParameters;
    public RegisterFormatter registerFormatter;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java
    @Nonnull private final SparseIntArray packedSwitchMap;
    @Nonnull private final SparseIntArray sparseSwitchMap;
    @Nonnull private final InstructionOffsetMap instructionOffsetMap;

    public MethodDefinition(@Nonnull ClassDefinition classDef, @Nonnull Method method,
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java
public class MethodDefinition {
    @Nonnull public final ClassDefinition classDef;
    @Nonnull public final Method method;
    @Nonnull public final MethodImplementation methodImpl;
    @Nonnull public final ImmutableList<Instruction> instructions;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java
    @Nonnull private final LabelCache labelCache = new LabelCache();

    @Nonnull private final SparseIntArray packedSwitchMap;
    @Nonnull private final SparseIntArray sparseSwitchMap;
    @Nonnull private final InstructionOffsetMap instructionOffsetMap;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java
    @Nonnull public final ClassDefinition classDef;
    @Nonnull public final Method method;
    @Nonnull public final MethodImplementation methodImpl;
    @Nonnull public final ImmutableList<Instruction> instructions;
    @Nonnull public final List<Instruction> effectiveInstructions;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Format/InstructionMethodItem.java`
#### Snippet
```java

public class InstructionMethodItem<T extends Instruction> extends MethodItem {
    @Nonnull protected final MethodDefinition methodDef;
    @Nonnull protected final T instruction;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Format/InstructionMethodItem.java`
#### Snippet
```java
public class InstructionMethodItem<T extends Instruction> extends MethodItem {
    @Nonnull protected final MethodDefinition methodDef;
    @Nonnull protected final T instruction;

    public InstructionMethodItem(@Nonnull MethodDefinition methodDef, int codeAddress, @Nonnull T instruction) {
```

## RuleId[id=NegativeIntConstantInLongContext]
### NegativeIntConstantInLongContext
Negative int hexadecimal constant in long context
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LiteralTools.java`
#### Snippet
```java

    public static void checkInt(long value) {
        if (value > 0xFFFFFFFF || value < -0x80000000) {
            throw new NumberFormatException(Long.toString(value) + " cannot fit into an int");
        }
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
No class found which is a subtype of both 'Method' and 'ImmutableMethodReference'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/CustomInlineMethodResolver.java`
#### Snippet
```java
            ClassDef classDef = ((ClassProto)typeProto).getClassDef();
            for (Method method: classDef.getMethods()) {
                if (method.equals(methodRef)) {
                    resolved = true;
                    accessFlags = method.getAccessFlags();
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `smali/src/main/java/com/android/tools/smali/smali/PrintTokensCommand.java`
#### Snippet
```java
            description = "The numeric api level to use while assembling.")
    @ExtendedParameter(argumentNames = "api")
    private int apiLevel = 15;

    @Parameter(description = "Assembles the given files. If a directory is specified, it will be " +
```

### FieldCanBeLocal
Field can be converted to a local variable
in `smali/src/main/java/com/android/tools/smali/smali/AssembleCommand.java`
#### Snippet
```java
    @Parameter(names = "--verbose",
            description = "Generate verbose error messages.")
    private boolean verbose = false;

    @Parameter(names = {"--allow-odex-opcodes", "--allow-odex", "--ao"},
```

### FieldCanBeLocal
Field can be converted to a local variable
in `smali/src/main/java/com/android/tools/smali/smali/AssembleCommand.java`
#### Snippet
```java
            description = "The numeric api level to use while assembling.")
    @ExtendedParameter(argumentNames = "api")
    private int apiLevel = 15;

    @Parameter(names = {"-o", "--output"},
```

### FieldCanBeLocal
Field can be converted to a local variable
in `smali/src/main/java/com/android/tools/smali/smali/AssembleCommand.java`
#### Snippet
```java
            description = "The name/path of the dex file to write.")
    @ExtendedParameter(argumentNames = "file")
    private String output = "out.dex";

    @Parameter(names = "--verbose",
```

### FieldCanBeLocal
Field can be converted to a local variable
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/DexClassProvider.java`
#### Snippet
```java

public class DexClassProvider implements ClassProvider {
    private final DexFile dexFile;
    private Map<String, ClassDef> classMap = Maps.newHashMap();

```

### FieldCanBeLocal
Field can be converted to a local variable
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListVtablesCommand.java`
#### Snippet
```java
                    "can be used, e.g. to list vtables from a dex file, as if they were in an oat file of the given " +
                    "version.")
    private int oatVersion = 0;

    public ListVtablesCommand(@Nonnull List<JCommander> commandAncestors) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Debug/StartLocalMethodItem.java`
#### Snippet
```java

public class StartLocalMethodItem extends DebugMethodItem {
    @Nonnull private final ClassDefinition classDef;
    @Nonnull private final StartLocal startLocal;
    @Nonnull private final RegisterFormatter registerFormatter;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
    @Parameter(names = {"--code-offsets", "--offsets", "--off"},
            description = "Add a comment before each instruction with it's code offset within the method.")
    private boolean codeOffsets = false;

    @Parameter(names = {"--resolve-resources", "--rr"}, arity = 2,
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
            description = "Create label names using a sequential numbering scheme per label type, rather than " +
                    "using the bytecode address.")
    private boolean sequentialLabels = false;

    @Parameter(names = {"--implicit-references", "--implicit", "--ir"},
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
            description = "When disassembling, output the .locals directive with the number of non-parameter " +
                    "registers instead of the .registers directive with the total number of registers.")
    private boolean localsDirective = false;

    @Parameter(names = {"--accessor-comments", "--ac"}, arity = 1,
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
            description = "The directory to write the disassembled files to.")
    @ExtendedParameter(argumentNames = "dir")
    private String outputDir = "out";

    @Parameter(names = {"--parameter-registers", "--preg", "--pr"}, arity = 1,
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
    @Parameter(names = "--allow-odex-opcodes",
            description = "Allows odex opcodes to be disassembled, even if the result won't be able to be reassembled.")
    private boolean allowOdex = false;

    @Parameter(names = "--classes",
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
                    "by default, use --parameter-registers=false to disable.")
    @ExtendedParameter(argumentNames = "boolean")
    private boolean parameterRegisters = true;

    @Parameter(names = {"-r", "--register-info"},
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
                    "by default, use --debug-info=false to disable.")
    @ExtendedParameter(argumentNames = "boolean")
    private boolean debugInfo = true;

    @Parameter(names = {"--code-offsets", "--offsets", "--off"},
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
                    "--accessor-comments=false to disable.")
    @ExtendedParameter(argumentNames = "boolean")
    private boolean accessorComments = true;

    @Parameter(names = {"--normalize-virtual-methods", "--norm", "--nvm"},
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
            description = "Use implicit method and field references (without the class name) for methods and " +
                    "fields from the current class.")
    private boolean implicitReferences = false;

    @Parameter(names = "--allow-odex-opcodes",
```

### FieldCanBeLocal
Field can be converted to a local variable
in `baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Debug/RestartLocalMethodItem.java`
#### Snippet
```java

public class RestartLocalMethodItem extends DebugMethodItem {
    @Nonnull private final ClassDefinition classDef;
    @Nonnull private final RestartLocal restartLocal;
    @Nonnull private final RegisterFormatter registerFormatter;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/SyntheticAccessCommentMethodItem.java`
#### Snippet
```java

public class SyntheticAccessCommentMethodItem extends MethodItem {
    private final ClassDefinition classDef;
    private final SyntheticAccessorResolver.AccessedMember accessedMember;

```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/io/FileDeferredOutputStream.java`
#### Snippet
```java
            InputStream fis = new FileInputStream(backingFile);
            ByteStreams.copy(fis, dest);
            backingFile.delete();
        }

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `third_party/util/src/main/java/com/android/tools/smali/util/PathUtil.java`
#### Snippet
```java
                writer.close();
            } catch (IOException ex) {
                try {f.delete();} catch (Exception ex2) {}
                throw ex;
            }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `third_party/util/src/main/java/com/android/tools/smali/util/PathUtil.java`
#### Snippet
```java
            }
        } finally {
            try { f.delete(); } catch (Exception ex) {}
            try { f2.delete(); } catch (Exception ex) {}
        }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `third_party/util/src/main/java/com/android/tools/smali/util/PathUtil.java`
#### Snippet
```java
        } finally {
            try { f.delete(); } catch (Exception ex) {}
            try { f2.delete(); } catch (Exception ex) {}
        }
    }
```

### IgnoreResultOfCall
Result of `File.createNewFile()` is ignored
in `third_party/util/src/main/java/com/android/tools/smali/util/ClassFileNameHandler.java`
#### Snippet
```java
                // future potential filename that would end up colliding. So we have to actually create the file here,
                // to force the Schrodinger filename to collapse to this particular version.
                file.createNewFile();
            }
        }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `third_party/util/src/main/java/com/android/tools/smali/util/ClassFileNameHandler.java`
#### Snippet
```java
                // future potential filename that would end up colliding. So we have to actually create the file here,
                // to force the Schrodinger filename to collapse to this particular version.
                file.mkdirs();
            }
        }
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `markSupported()` is identical to its super method
in `dexlib2/src/main/java/com/android/tools/smali/util/RandomAccessFileInputStream.java`
#### Snippet
```java
    }

    @Override public boolean markSupported() {
        return false;
    }
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `dexlib2/src/main/java/com/android/tools/smali/util/SparseIntArray.java`
#### Snippet
```java
        int i = binarySearch(mKeys, 0, mSize, key);

        if (i < 0) {
            i = ~i;
            if (i > 0) {
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/HiddenApiRestriction.java`
#### Snippet
```java

        for (HiddenApiRestriction flag : flags) {
            if (flag.isDomainSpecificApiFlag) {
                value += flag.value;
            } else {
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `commands` are queried, but never updated
in `smali/src/main/java/com/android/tools/smali/smali/HelpCommand.java`
#### Snippet
```java
    @Parameter(description = "If specified, show the detailed usage information for the given commands")
    @ExtendedParameter(argumentNames = "commands")
    private List<String> commands;

    public HelpCommand(@Nonnull List<JCommander> commandAncestors) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `inputList` are queried, but never updated
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListDexCommand.java`
#### Snippet
```java
    @Parameter(description = "An apk or oat file.")
    @ExtendedParameter(argumentNames = "file")
    private List<String> inputList = Lists.newArrayList();

    public ListDexCommand(@Nonnull List<JCommander> commandAncestors) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `inputList` are queried, but never updated
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListDependenciesCommand.java`
#### Snippet
```java
    @Parameter(description = "An oat/odex file")
    @ExtendedParameter(argumentNames = "file")
    private List<String> inputList = Lists.newArrayList();

    public ListDependenciesCommand(@Nonnull List<JCommander> commandAncestors) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `commands` are queried, but never updated
in `baksmali/src/main/java/com/android/tools/smali/baksmali/HelpCommand.java`
#### Snippet
```java
    @Parameter(description = "If specified, show the detailed usage information for the given commands")
    @ExtendedParameter(argumentNames = "commands")
    private List<String> commands = Lists.newArrayList();

    public void run() {
```

### MismatchedCollectionQueryUpdate
Contents of collection `commands` are queried, but never updated
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListHelpCommand.java`
#### Snippet
```java
    @Parameter(description = "If specified, show the detailed usage information for the given commands")
    @ExtendedParameter(argumentNames = "commands")
    private List<String> commands;

    public ListHelpCommand(@Nonnull List<JCommander> commandAncestors) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `registerInfoTypes` are queried, but never updated
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
                    "FULLMERGE. See \"baksmali help register-info\" for more information.")
    @ExtendedParameter(argumentNames = "register info specifier")
    private List<String> registerInfoTypes = Lists.newArrayList();

    @Parameter(names = {"--sequential-labels", "--seq", "--sl"},
```

### MismatchedCollectionQueryUpdate
Contents of collection `resourceIdFiles` are queried, but never updated
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
                    "multiple times to provide resources from multiple packages.")
    @ExtendedParameter(argumentNames = {"resource prefix", "public.xml file"})
    private List<String> resourceIdFiles = Lists.newArrayList();

    @Parameter(names = {"-j", "--jobs"},
```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`1 << 0` can be replaced with '1'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/CodeItem.java`
#### Snippet
```java
    public static int CDEX_INSTRUCTIONS_SIZE_SHIFT = 5;
    public static int CDEX_PREHEADER_FLAGS_MASK = 0x1f;
    public static int CDEX_PREHEADER_FLAG_REGISTER_COUNT = 1 << 0;
    public static int CDEX_PREHEADER_FLAG_INS_COUNT = 1 << 1;
    public static int CDEX_PREHEADER_FLAG_OUTS_COUNT = 1 << 2;
```

## RuleId[id=TextLabelInSwitchStatement]
### TextLabelInSwitchStatement
Text label `_match:` in 'switch' statement
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
	}
case 1:
	_match: do {
	_keys = _SyntheticAccessorFSM_key_offsets[cs];
	_trans = _SyntheticAccessorFSM_index_offsets[cs];
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedMethodImplementation.java`
#### Snippet
```java
        }
        if (debugOffset < 0) {
            System.err.println(String.format("%s: Invalid debug offset", method));
            return DebugInfo.newOrEmpty(dexFile, 0, this);
        }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedMethodImplementation.java`
#### Snippet
```java
        }
        if ((debugOffset + dexFile.getBaseDataOffset()) >= dexFile.getBuffer().buf.length) {
            System.err.println(String.format("%s: Invalid debug offset", method));
            return DebugInfo.newOrEmpty(dexFile, 0, this);
        }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/util/DexAnnotator.java`
#### Snippet
```java
                    annotator.annotateSection(this);
                } catch (Exception ex) {
                    System.err.println(String.format("There was an error while dumping the %s section",
                            ItemType.getItemTypeName(mapItem.getType())));
                    ex.printStackTrace(System.err);
```

### RedundantStringFormatCall
Redundant call to `format()`
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListDexCommand.java`
#### Snippet
```java

        if (!file.exists()) {
            System.err.println(String.format("Could not find the file: %s", input));
            System.exit(-1);
        }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DeodexCommand.java`
#### Snippet
```java
                File inlineTableFile = new File(inlineTable);
                if (!inlineTableFile.exists()) {
                    System.err.println(String.format("Could not find file: %s", inlineTable));
                    System.exit(-1);
                }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DeodexCommand.java`
#### Snippet
```java
                    options.inlineResolver = new CustomInlineMethodResolver(options.classPath, inlineTableFile);
                } catch (IOException ex) {
                    System.err.println(String.format("Error while reading file: %s", inlineTableFile));
                    ex.printStackTrace(System.err);
                    System.exit(-1);
```

### RedundantStringFormatCall
Redundant call to `format()`
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java

                if (!publicXmlFile.exists()) {
                    System.err.println(String.format("Can't find file: %s", publicXmlFile));
                    System.exit(-1);
                }
```

### RedundantStringFormatCall
Redundant call to `format()`
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
                options.registerInfo  |= BaksmaliOptions.FULLMERGE;
            } else {
                System.err.println(String.format("Invalid register info type: %s", registerInfoType));
                usage();
                System.exit(-1);
```

### RedundantStringFormatCall
Redundant call to `format()`
in `baksmali/src/main/java/com/android/tools/smali/baksmali/AnalysisArguments.java`
#### Snippet
```java
                File file = new File(dir);
                if (!file.exists()) {
                    System.err.println(String.format("Warning: directory %s does not exist. Ignoring.", dir));
                } else if (!file.isDirectory()) {
                    System.err.println(String.format("Warning: %s is not a directory. Ignoring.", dir));
```

### RedundantStringFormatCall
Redundant call to `format()`
in `baksmali/src/main/java/com/android/tools/smali/baksmali/AnalysisArguments.java`
#### Snippet
```java
                    System.err.println(String.format("Warning: directory %s does not exist. Ignoring.", dir));
                } else if (!file.isDirectory()) {
                    System.err.println(String.format("Warning: %s is not a directory. Ignoring.", dir));
                } else {
                    filteredClassPathDirectories.add(dir);
```

### RedundantStringFormatCall
Redundant call to `format()`
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/ClassDefinition.java`
#### Snippet
```java
                writer.write("# There is both a direct and virtual method with this signature.\n" +
                             "# You will need to rename one of these methods, including all references.\n");
                System.err.println(String.format("Duplicate direct+virtual method found: %s->%s",
                        classDef.getType(), methodString));
                System.err.println("You will need to rename one of these methods, including all references.");
```

### RedundantStringFormatCall
Redundant call to `format()`
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/ClassDefinition.java`
#### Snippet
```java
                writer.write("# duplicate field ignored\n");
                fieldWriter = getCommentingWriter(writer);
                System.err.println(String.format("Ignoring duplicate field: %s->%s", classDef.getType(), fieldString));
            } else if (staticFields.contains(fieldString)) {
                System.err.println(String.format("Duplicate static+instance field found: %s->%s",
```

### RedundantStringFormatCall
Redundant call to `format()`
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/ClassDefinition.java`
#### Snippet
```java
                System.err.println(String.format("Ignoring duplicate field: %s->%s", classDef.getType(), fieldString));
            } else if (staticFields.contains(fieldString)) {
                System.err.println(String.format("Duplicate static+instance field found: %s->%s",
                        classDef.getType(), fieldString));
                System.err.println("You will need to rename one of these fields, including all references.");
```

### RedundantStringFormatCall
Redundant call to `format()`
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/ClassDefinition.java`
#### Snippet
```java
                writer.write("# duplicate field ignored\n");
                fieldWriter = getCommentingWriter(writer);
                System.err.println(String.format("Ignoring duplicate field: %s->%s", classDef.getType(), fieldString));
                setInStaticConstructor = false;
            } else {
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/io/FileDataStore.java`
#### Snippet
```java
    private final RandomAccessFile raf;

    public FileDataStore(@Nonnull File file) throws FileNotFoundException, IOException {
        this.raf = new RandomAccessFile(file, "rw");
        this.raf.setLength(0);
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListVtablesCommand.java`
#### Snippet
```java
            String methodString = i + ":" + method.getDefiningClass() + "->" + method.getName() + "(";
            for (CharSequence parameter : method.getParameterTypes()) {
                methodString += parameter;
            }
            methodString += ")" + method.getReturnType() + "\n";
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `at` initializer `0` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/util/Utf8Utils.java`
#### Snippet
```java
        int outAt = 0;

        int at = 0;
        for (at = start; utf16Length > 0; utf16Length--) {
            int v0 = bytes[at] & 0xFF;
```

### UnusedAssignment
Variable `_trans` initializer `0` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
	{
	int _klen;
	int _trans = 0;
	int _acts;
	int _nacts;
```

### UnusedAssignment
Variable `smaliFile` initializer `null` is redundant
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Baksmali.java`
#### Snippet
```java
        }

        File smaliFile = null;
        try {
            smaliFile = fileNameHandler.getUniqueFilenameForClass(classDescriptor);
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `cs == 0` is always `false`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
		continue _goto;
	}
	if ( cs == 0 ) {
		_goto_targ = 5;
		continue _goto;
```

### ConstantValue
Condition is always false
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
		_trans += _klen;
	}
	} while (false);

	_trans = _SyntheticAccessorFSM_indicies[_trans];
```

### ConstantValue
Condition is always true
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
// line 167 "SyntheticAccessorFSM.rl"
	{
                accessorType = SyntheticAccessorResolver.GETTER; { p += 1; _goto_targ = 5; if (true)  continue _goto;}
            }
	break;
```

### ConstantValue
Condition is always true
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
// line 171 "SyntheticAccessorFSM.rl"
	{
                accessorType = SyntheticAccessorResolver.SETTER; { p += 1; _goto_targ = 5; if (true)  continue _goto;}
            }
	break;
```

### ConstantValue
Condition is always true
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
// line 175 "SyntheticAccessorFSM.rl"
	{
                accessorType = SyntheticAccessorResolver.METHOD; { p += 1; _goto_targ = 5; if (true)  continue _goto;}
            }
	break;
```

### ConstantValue
Condition is always true
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
// line 191 "SyntheticAccessorFSM.rl"
	{
                accessorType = mathOp; { p += 1; _goto_targ = 5; if (true)  continue _goto;}
            }
	break;
```

### ConstantValue
Condition `classPathDirectories != null` is always `true`
in `baksmali/src/main/java/com/android/tools/smali/baksmali/AnalysisArguments.java`
#### Snippet
```java

        List<String> filteredClassPathDirectories = Lists.newArrayList();
        if (classPathDirectories != null) {
            for (String dir: classPathDirectories) {
                File file = new File(dir);
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Iterable\>' to 'com.google.common.collect.ImmutableSortedSet'
in `dexlib2/src/main/java/com/android/tools/smali/util/ImmutableConverter.java`
#### Snippet
```java

        if (!needsCopy) {
            return (ImmutableSortedSet<ImmutableItem>)iterable;
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Iterable\>' to 'com.google.common.collect.ImmutableList'
in `dexlib2/src/main/java/com/android/tools/smali/util/ImmutableConverter.java`
#### Snippet
```java

        if (!needsCopy) {
            return (ImmutableList<ImmutableItem>)iterable;
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Iterable\>' to 'com.google.common.collect.ImmutableSet'
in `dexlib2/src/main/java/com/android/tools/smali/util/ImmutableConverter.java`
#### Snippet
```java

        if (!needsCopy) {
            return (ImmutableSet<ImmutableItem>)iterable;
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'E'
in `dexlib2/src/main/java/com/android/tools/smali/util/SparseArray.java`
#### Snippet
```java
        }

        return (E) mValues[index];
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'E'
in `dexlib2/src/main/java/com/android/tools/smali/util/SparseArray.java`
#### Snippet
```java
            return valueIfKeyNotFound;
        } else {
            return (E) mValues[i];
        }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object\[\]' to 'E\[\]'
in `dexlib2/src/main/java/com/android/tools/smali/util/SparseArray.java`
#### Snippet
```java
     */
    public List<E> getValues() {
        return Collections.unmodifiableList(Arrays.asList((E[])mValues));
    }

```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
    INVOKE_DIRECT_EMPTY(lastApi(0xf0, 13), "invoke-direct-empty", ReferenceType.METHOD,  Format.Format35c, Opcode.ODEX_ONLY | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_RESULT | Opcode.CAN_INITIALIZE_REFERENCE),
    INVOKE_OBJECT_INIT_RANGE(firstApi(0xf0, 14), "invoke-object-init/range", ReferenceType.METHOD,  Format.Format3rc, Opcode.ODEX_ONLY | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_RESULT | Opcode.CAN_INITIALIZE_REFERENCE),
    RETURN_VOID_BARRIER(combine(firstApi(0xf1, 11), lastArtVersion(0x73, 59)), "return-void-barrier", ReferenceType.NONE, Format.Format10x, Opcode.ODEX_ONLY),
    RETURN_VOID_NO_BARRIER(firstArtVersion(0x73, 60), "return-void-no-barrier", ReferenceType.NONE, Format.Format10x, Opcode.ODEX_ONLY),
    IGET_QUICK(combine(allApis(0xf2), allArtVersions(0xe3)), "iget-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_REGISTER),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
    IGET_WIDE_QUICK(combine(allApis(0xf3), allArtVersions(0xe4)), "iget-wide-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_REGISTER | Opcode.SETS_WIDE_REGISTER),
    IGET_OBJECT_QUICK(combine(allApis(0xf4), allArtVersions(0xe5)), "iget-object-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_REGISTER),
    IPUT_QUICK(combine(allApis(0xf5), allArtVersions(0xe6)), "iput-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE),
    IPUT_WIDE_QUICK(combine(allApis(0xf6), allArtVersions(0xe7)), "iput-wide-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE),
    IPUT_OBJECT_QUICK(combine(allApis(0xf7), allArtVersions(0xe8)), "iput-object-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
    IGET_QUICK(combine(allApis(0xf2), allArtVersions(0xe3)), "iget-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_REGISTER),
    IGET_WIDE_QUICK(combine(allApis(0xf3), allArtVersions(0xe4)), "iget-wide-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_REGISTER | Opcode.SETS_WIDE_REGISTER),
    IGET_OBJECT_QUICK(combine(allApis(0xf4), allArtVersions(0xe5)), "iget-object-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_REGISTER),
    IPUT_QUICK(combine(allApis(0xf5), allArtVersions(0xe6)), "iput-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE),
    IPUT_WIDE_QUICK(combine(allApis(0xf6), allArtVersions(0xe7)), "iput-wide-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
    
    INVOKE_VIRTUAL_QUICK(combine(allApis(0xf8), allArtVersions(0xe9)), "invoke-virtual-quick", ReferenceType.NONE,  Format.Format35ms, Opcode.ODEX_ONLY | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_RESULT),
    INVOKE_VIRTUAL_QUICK_RANGE(combine(allApis(0xf9), allArtVersions(0xea)), "invoke-virtual-quick/range", ReferenceType.NONE,  Format.Format3rms, Opcode.ODEX_ONLY | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_RESULT),
    INVOKE_SUPER_QUICK(lastApi(0xfa, 25), "invoke-super-quick", ReferenceType.NONE,  Format.Format35ms, Opcode.ODEX_ONLY | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_RESULT),
    INVOKE_SUPER_QUICK_RANGE(lastApi(0xfb, 25), "invoke-super-quick/range", ReferenceType.NONE,  Format.Format3rms, Opcode.ODEX_ONLY | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_RESULT),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
    IGET_SHORT_QUICK(allArtVersions(0xf2), "iget-short-quick", ReferenceType.NONE, Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_REGISTER),
    
    INVOKE_VIRTUAL_QUICK(combine(allApis(0xf8), allArtVersions(0xe9)), "invoke-virtual-quick", ReferenceType.NONE,  Format.Format35ms, Opcode.ODEX_ONLY | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_RESULT),
    INVOKE_VIRTUAL_QUICK_RANGE(combine(allApis(0xf9), allArtVersions(0xea)), "invoke-virtual-quick/range", ReferenceType.NONE,  Format.Format3rms, Opcode.ODEX_ONLY | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_RESULT),
    INVOKE_SUPER_QUICK(lastApi(0xfa, 25), "invoke-super-quick", ReferenceType.NONE,  Format.Format35ms, Opcode.ODEX_ONLY | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_RESULT),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
    IPUT_QUICK(combine(allApis(0xf5), allArtVersions(0xe6)), "iput-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE),
    IPUT_WIDE_QUICK(combine(allApis(0xf6), allArtVersions(0xe7)), "iput-wide-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE),
    IPUT_OBJECT_QUICK(combine(allApis(0xf7), allArtVersions(0xe8)), "iput-object-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE),
    IPUT_BOOLEAN_QUICK(allArtVersions(0xeb), "iput-boolean-quick", ReferenceType.NONE, Format.Format22cs, Opcode.ODEX_ONLY | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.QUICK_FIELD_ACCESSOR),
    IPUT_BYTE_QUICK(allArtVersions(0xec), "iput-byte-quick", ReferenceType.NONE, Format.Format22cs, Opcode.ODEX_ONLY | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.QUICK_FIELD_ACCESSOR),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
    RETURN_VOID_BARRIER(combine(firstApi(0xf1, 11), lastArtVersion(0x73, 59)), "return-void-barrier", ReferenceType.NONE, Format.Format10x, Opcode.ODEX_ONLY),
    RETURN_VOID_NO_BARRIER(firstArtVersion(0x73, 60), "return-void-no-barrier", ReferenceType.NONE, Format.Format10x, Opcode.ODEX_ONLY),
    IGET_QUICK(combine(allApis(0xf2), allArtVersions(0xe3)), "iget-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_REGISTER),
    IGET_WIDE_QUICK(combine(allApis(0xf3), allArtVersions(0xe4)), "iget-wide-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_REGISTER | Opcode.SETS_WIDE_REGISTER),
    IGET_OBJECT_QUICK(combine(allApis(0xf4), allArtVersions(0xe5)), "iget-object-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_REGISTER),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
    IGET_OBJECT_QUICK(combine(allApis(0xf4), allArtVersions(0xe5)), "iget-object-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_REGISTER),
    IPUT_QUICK(combine(allApis(0xf5), allArtVersions(0xe6)), "iput-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE),
    IPUT_WIDE_QUICK(combine(allApis(0xf6), allArtVersions(0xe7)), "iput-wide-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE),
    IPUT_OBJECT_QUICK(combine(allApis(0xf7), allArtVersions(0xe8)), "iput-object-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE),
    IPUT_BOOLEAN_QUICK(allArtVersions(0xeb), "iput-boolean-quick", ReferenceType.NONE, Format.Format22cs, Opcode.ODEX_ONLY | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.QUICK_FIELD_ACCESSOR),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
    RETURN_VOID_NO_BARRIER(firstArtVersion(0x73, 60), "return-void-no-barrier", ReferenceType.NONE, Format.Format10x, Opcode.ODEX_ONLY),
    IGET_QUICK(combine(allApis(0xf2), allArtVersions(0xe3)), "iget-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_REGISTER),
    IGET_WIDE_QUICK(combine(allApis(0xf3), allArtVersions(0xe4)), "iget-wide-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_REGISTER | Opcode.SETS_WIDE_REGISTER),
    IGET_OBJECT_QUICK(combine(allApis(0xf4), allArtVersions(0xe5)), "iget-object-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE | Opcode.SETS_REGISTER),
    IPUT_QUICK(combine(allApis(0xf5), allArtVersions(0xe6)), "iput-quick", ReferenceType.NONE,  Format.Format22cs, Opcode.ODEX_ONLY | Opcode.QUICK_FIELD_ACCESSOR | Opcode.CAN_THROW | Opcode.CAN_CONTINUE),
```

### UNCHECKED_WARNING
Unchecked cast: 'com.android.tools.smali.dexlib2.iface.reference.Reference' to 'FieldRefKey'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
        switch (referenceType) {
            case ReferenceType.FIELD:
                return fieldSection.getItemIndex((FieldRefKey) reference);
            case ReferenceType.METHOD:
                return methodSection.getItemIndex((MethodRefKey) reference);
```

### UNCHECKED_WARNING
Unchecked cast: 'com.android.tools.smali.dexlib2.iface.reference.Reference' to 'MethodRefKey'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
                return fieldSection.getItemIndex((FieldRefKey) reference);
            case ReferenceType.METHOD:
                return methodSection.getItemIndex((MethodRefKey) reference);
            case ReferenceType.STRING:
                return stringSection.getItemIndex((StringRef) reference);
```

### UNCHECKED_WARNING
Unchecked cast: 'com.android.tools.smali.dexlib2.iface.reference.Reference' to 'StringRef'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
                return methodSection.getItemIndex((MethodRefKey) reference);
            case ReferenceType.STRING:
                return stringSection.getItemIndex((StringRef) reference);
            case ReferenceType.TYPE:
                return typeSection.getItemIndex((TypeRef) reference);
```

### UNCHECKED_WARNING
Unchecked cast: 'com.android.tools.smali.dexlib2.iface.reference.Reference' to 'TypeRef'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
                return stringSection.getItemIndex((StringRef) reference);
            case ReferenceType.TYPE:
                return typeSection.getItemIndex((TypeRef) reference);
            case ReferenceType.METHOD_PROTO:
                return protoSection.getItemIndex((ProtoRefKey) reference);
```

### UNCHECKED_WARNING
Unchecked cast: 'com.android.tools.smali.dexlib2.iface.reference.Reference' to 'ProtoRefKey'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
                return typeSection.getItemIndex((TypeRef) reference);
            case ReferenceType.METHOD_PROTO:
                return protoSection.getItemIndex((ProtoRefKey) reference);
            case ReferenceType.METHOD_HANDLE:
                return methodHandleSection.getItemIndex((MethodHandleKey) reference);
```

### UNCHECKED_WARNING
Unchecked cast: 'com.android.tools.smali.dexlib2.iface.reference.Reference' to 'MethodHandleKey'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
                return protoSection.getItemIndex((ProtoRefKey) reference);
            case ReferenceType.METHOD_HANDLE:
                return methodHandleSection.getItemIndex((MethodHandleKey) reference);
            case ReferenceType.CALL_SITE:
                return callSiteSection.getItemIndex((CallSiteKey) reference);
```

### UNCHECKED_WARNING
Unchecked cast: 'com.android.tools.smali.dexlib2.iface.reference.Reference' to 'CallSiteKey'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
                return methodHandleSection.getItemIndex((MethodHandleKey) reference);
            case ReferenceType.CALL_SITE:
                return callSiteSection.getItemIndex((CallSiteKey) reference);
            default:
                throw new ExceptionWithContext("Unknown reference type: %d",  referenceType);
```

### UNCHECKED_WARNING
Unchecked cast: 'com.android.tools.smali.dexlib2.iface.reference.Reference' to 'StringRef'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
            if (instruction.getOpcode() == Opcode.CONST_STRING) {
                if (stringSection.getItemIndex(
                        (StringRef)((ReferenceInstruction)instruction).getReference()) >= 65536) {
                    methodImplementation.replaceInstruction(i, new BuilderInstruction31c(Opcode.CONST_STRING_JUMBO,
                            ((OneRegisterInstruction)instruction).getRegisterA(),
```

### UNCHECKED_WARNING
Unchecked cast: 'com.android.tools.smali.dexlib2.iface.reference.Reference' to 'StringRef'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
                        if (instruction.getOpcode() == Opcode.CONST_STRING) {
                            if (stringSection.getItemIndex(
                                    (StringRef)((ReferenceInstruction)instruction).getReference()) >= 65536) {
                                needsFix = true;
                                break;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Iterator' to 'java.util.Iterator'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedMethodImplementation.java`
#### Snippet
```java
    @Nonnull
    public Iterator<String> getParameterNames(@Nullable DexReader dexReader) {
        return getDebugInfo().getParameterNames(dexReader);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.android.tools.smali.dexlib2.dexbacked.DexReader' to 'com.android.tools.smali.dexlib2.dexbacked.DexReader'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedMethodImplementation.java`
#### Snippet
```java
    @Nonnull
    public Iterator<String> getParameterNames(@Nullable DexReader dexReader) {
        return getDebugInfo().getParameterNames(dexReader);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'com.android.tools.smali.dexlib2.iface.MultiDexContainer.DexEntry' to 'com.android.tools.smali.dexlib2.iface.MultiDexContainer.DexEntry'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/ZipDexContainer.java`
#### Snippet
```java
            }

            return loadEntry(zipFile, entry);
        } finally {
            zipFile.close();
```

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `com.android.tools.smali.baksmali.formatter.BaksmaliWriter` is inaccessible from here
in `dexlib2/src/main/java/com/android/tools/smali/util/StringUtils.java`
#### Snippet
```java

    /**
     * @deprecated Use {@link com.android.tools.smali.baksmali.formatter.BaksmaliWriter#writeCharEncodedValue}
     */
    @Deprecated
```

### JavadocReference
Symbol `writeCharEncodedValue` is inaccessible from here
in `dexlib2/src/main/java/com/android/tools/smali/util/StringUtils.java`
#### Snippet
```java

    /**
     * @deprecated Use {@link com.android.tools.smali.baksmali.formatter.BaksmaliWriter#writeCharEncodedValue}
     */
    @Deprecated
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `dexlib2/src/main/java/com/android/tools/smali/util/ImmutableConverter.java`
#### Snippet
```java
        boolean needsCopy = false;
        if (iterable instanceof ImmutableSortedSet &&
                ((ImmutableSortedSet)iterable).comparator().equals(comparator)) {
            for (Item element: iterable) {
                if (!isImmutable(element)) {
```

### DataFlowIssue
Argument `opcodes` might be null
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/DexFileFactory.java`
#### Snippet
```java

            try {
                return DexBackedOdexFile.fromInputStream(opcodes, inputStream);
            } catch (DexBackedOdexFile.NotAnOdexFile ex) {
                // just eat it
```

### DataFlowIssue
Argument `opcodes` might be null
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/DexFileFactory.java`
#### Snippet
```java

            try {
                DexBackedOdexFile odexFile = DexBackedOdexFile.fromInputStream(opcodes, inputStream);
                return new SingletonMultiDexContainer(file.getPath(), odexFile);
            } catch (DexBackedOdexFile.NotAnOdexFile ex) {
```

### DataFlowIssue
Variable is already assigned to this value
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
            case LONG: {
                if (constantValue == 1) {
                    negativeConstant = false;
                } else if (constantValue == -1) {
                    negativeConstant = true;
```

### DataFlowIssue
Variable is already assigned to this value
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
                float val = Float.intBitsToFloat((int)constantValue);
                if (val == 1) {
                    negativeConstant = false;
                } else if (val == -1) {
                    negativeConstant = true;
```

### DataFlowIssue
Variable is already assigned to this value
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
                double val = Double.longBitsToDouble(constantValue);
                if (val == 1) {
                    negativeConstant = false;
                } else if (val == -1) {
                    negativeConstant = true;
```

### DataFlowIssue
Unboxing of `opcodes.getOpcodeValue(instructions.get(p).getOpcode())` may produce `NullPointerException`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java

			_mid = _lower + ((_upper-_lower) >> 1);
			if ( ( opcodes.getOpcodeValue(instructions.get(p).getOpcode())) < _SyntheticAccessorFSM_trans_keys[_mid] )
				_upper = _mid - 1;
			else if ( ( opcodes.getOpcodeValue(instructions.get(p).getOpcode())) > _SyntheticAccessorFSM_trans_keys[_mid] )
```

### DataFlowIssue
Unboxing of `opcodes.getOpcodeValue(instructions.get(p).getOpcode())` may produce `NullPointerException`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
			if ( ( opcodes.getOpcodeValue(instructions.get(p).getOpcode())) < _SyntheticAccessorFSM_trans_keys[_mid] )
				_upper = _mid - 1;
			else if ( ( opcodes.getOpcodeValue(instructions.get(p).getOpcode())) > _SyntheticAccessorFSM_trans_keys[_mid] )
				_lower = _mid + 1;
			else {
```

### DataFlowIssue
Unboxing of `opcodes.getOpcodeValue(instructions.get(p).getOpcode())` may produce `NullPointerException`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java

			_mid = _lower + (((_upper-_lower) >> 1) & ~1);
			if ( ( opcodes.getOpcodeValue(instructions.get(p).getOpcode())) < _SyntheticAccessorFSM_trans_keys[_mid] )
				_upper = _mid - 2;
			else if ( ( opcodes.getOpcodeValue(instructions.get(p).getOpcode())) > _SyntheticAccessorFSM_trans_keys[_mid+1] )
```

### DataFlowIssue
Unboxing of `opcodes.getOpcodeValue(instructions.get(p).getOpcode())` may produce `NullPointerException`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
			if ( ( opcodes.getOpcodeValue(instructions.get(p).getOpcode())) < _SyntheticAccessorFSM_trans_keys[_mid] )
				_upper = _mid - 2;
			else if ( ( opcodes.getOpcodeValue(instructions.get(p).getOpcode())) > _SyntheticAccessorFSM_trans_keys[_mid+1] )
				_lower = _mid + 2;
			else {
```

### DataFlowIssue
Switch label `2` is unreachable
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
	}

case 2:
	if ( cs == 0 ) {
		_goto_targ = 5;
```

### DataFlowIssue
Argument `poolMethod.getImplementation()` might be null
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/ClassPool.java`
#### Snippet
```java
    @Nonnull @Override
    public MutableMethodImplementation makeMutableMethodImplementation(@Nonnull PoolMethod poolMethod) {
        return new MutableMethodImplementation(poolMethod.getImplementation());
    }

```

### DataFlowIssue
Dereference of `next` may produce `NullPointerException`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/util/TryListBuilder.java`
#### Snippet
```java
            @Nullable protected MutableTryBlock<EH> readNextItem() {
                // We can assume that next is not null, due to the way iteration happens
                MutableTryBlock<EH> ret = next.next;

                if (ret == listEnd) {
```

### DataFlowIssue
@Nullable method 'apply' always returns a non-null value
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderAnnotationSetPool.java`
#### Snippet
```java
                ImmutableSet.copyOf(Iterators.transform(annotations.iterator(),
                        new Function<Annotation, BuilderAnnotation>() {
                            @Nullable @Override public BuilderAnnotation apply(Annotation input) {
                                return dexBuilder.annotationSection.internAnnotation(input);
                            }
```

### DataFlowIssue
Argument `impl` might be null
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassPool.java`
#### Snippet
```java
            return (MutableMethodImplementation)impl;
        }
        return new MutableMethodImplementation(impl);
    }

```

### DataFlowIssue
@Nullable method 'getExceptionTypeReference' always returns a non-null value
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/BuilderExceptionHandler.java`
#### Snippet
```java
            }

            @Nullable @Override public TypeReference getExceptionTypeReference() {
                return exceptionType;
            }
```

### DataFlowIssue
@Nullable method 'getExceptionType' always returns a non-null value
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/BuilderExceptionHandler.java`
#### Snippet
```java
        }
        return new BuilderExceptionHandler(handler) {
            @Nullable @Override public String getExceptionType() {
                return exceptionType.getType();
            }
```

### DataFlowIssue
@Nullable method 'getExceptionType' always returns a non-null value
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/BuilderExceptionHandler.java`
#### Snippet
```java
        }
        return new BuilderExceptionHandler(handler) {
            @Nullable @Override public String getExceptionType() {
                return exceptionType;
            }
```

### DataFlowIssue
Argument `instruction` might be null
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/MethodImplementationBuilder.java`
#### Snippet
```java

    public void addInstruction(@Nullable BuilderInstruction instruction) {
        impl.addInstruction(instruction);
        currentLocation = impl.instructionList.get(impl.instructionList.size()-1);
    }
```

### DataFlowIssue
@Nullable method 'apply' always returns a non-null value
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderSparseSwitchPayload.java`
#### Snippet
```java
        } else {
            this.switchElements = Lists.transform(switchElements, new Function<SwitchLabelElement, BuilderSwitchElement>() {
                @Nullable @Override public BuilderSwitchElement apply(@Nullable SwitchLabelElement element) {
                    assert element != null;
                    return new BuilderSwitchElement(BuilderSparseSwitchPayload.this, element.key, element.target);
```

### DataFlowIssue
@Nullable method 'apply' always returns a non-null value
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/DexBuilder.java`
#### Snippet
```java
        return ImmutableList.copyOf(Iterators.transform(methodParameters.iterator(),
                new Function<MethodParameter, BuilderMethodParameter>() {
                    @Nullable @Override public BuilderMethodParameter apply(MethodParameter input) {
                        return internMethodParameter(input);
                    }
```

### DataFlowIssue
@Nullable method 'apply' always returns a non-null value
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/DexBuilder.java`
#### Snippet
```java
                Iterators.transform(elements.iterator(),
                        new Function<AnnotationElement, BuilderAnnotationElement>() {
                            @Nullable @Override
                            public BuilderAnnotationElement apply(AnnotationElement input) {
                                return internAnnotationElement(input);
```

### DataFlowIssue
@Nullable method 'apply' always returns a non-null value
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/DexBuilder.java`
#### Snippet
```java
                        Iterators.transform(value.getValue().iterator(),
                                new Function<EncodedValue, BuilderEncodedValue>() {
                                    @Nullable @Override public BuilderEncodedValue apply(EncodedValue input) {
                                        return internEncodedValue(input);
                                    }
```

### DataFlowIssue
Method invocation `getDexFile` may produce `NullPointerException`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/PathEntryLoader.java`
#### Snippet
```java

        for (String entryName : entryNames) {
            classProviders.add(new DexClassProvider(container.getEntry(entryName).getDexFile()));
        }

```

### DataFlowIssue
@Nullable method 'apply' always returns a non-null value
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/MutableMethodImplementation.java`
#### Snippet
```java
        return Iterables.concat(
                Iterables.transform(instructionList, new Function<MethodLocation, Iterable<? extends DebugItem>>() {
                    @Nullable @Override public Iterable<? extends DebugItem> apply(@Nullable MethodLocation input) {
                        assert input != null;
                        if (fixInstructions) {
```

### DataFlowIssue
@Nullable method 'apply' always returns a non-null value
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/reflection/ReflectionClassDef.java`
#### Snippet
```java
                return Iterators.transform(staticFields,
                        new Function<java.lang.reflect.Field, Field>() {
                            @Nullable @Override public Field apply(@Nullable java.lang.reflect.Field input) {
                                return new ReflectionField(input);
                            }
```

### DataFlowIssue
@Nullable method 'apply' always returns a non-null value
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/reflection/ReflectionClassDef.java`
#### Snippet
```java
                return Iterators.transform(directMethods,
                        new Function<java.lang.reflect.Method, Method>() {
                            @Nullable @Override public Method apply(@Nullable java.lang.reflect.Method input) {
                                return new ReflectionMethod(input);
                            }
```

### DataFlowIssue
@Nullable method 'apply' always returns a non-null value
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/reflection/ReflectionClassDef.java`
#### Snippet
```java
                        Iterators.transform(Iterators.forArray(cls.getDeclaredConstructors()),
                                new Function<Constructor, Method>() {
                                    @Nullable @Override public Method apply(@Nullable Constructor input) {
                                        return new ReflectionConstructor(input);
                                    }
```

### DataFlowIssue
@Nullable method 'apply' always returns a non-null value
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/reflection/ReflectionClassDef.java`
#### Snippet
```java
                        Iterators.transform(Iterators.forArray(cls.getDeclaredMethods()),
                                new Function<java.lang.reflect.Method, Method>() {
                                    @Nullable @Override public Method apply(@Nullable java.lang.reflect.Method input) {
                                        return new ReflectionMethod(input);
                                    }
```

### DataFlowIssue
@Nullable method 'apply' always returns a non-null value
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/reflection/ReflectionClassDef.java`
#### Snippet
```java
                Iterator<Method> methodIterator = Iterators.transform(directMethods,
                        new Function<java.lang.reflect.Method, Method>() {
                            @Nullable @Override public Method apply(@Nullable java.lang.reflect.Method input) {
                                return new ReflectionMethod(input);
                            }
```

### DataFlowIssue
@Nullable method 'apply' always returns a non-null value
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/reflection/ReflectionClassDef.java`
#### Snippet
```java
                        Iterators.transform(Iterators.forArray(cls.getDeclaredConstructors()),
                                new Function<Constructor, Method>() {
                                    @Nullable @Override public Method apply(@Nullable Constructor input) {
                                        return new ReflectionConstructor(input);
                                    }
```

### DataFlowIssue
@Nullable method 'apply' always returns a non-null value
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/reflection/ReflectionClassDef.java`
#### Snippet
```java
                return Iterators.transform(Iterators.forArray(cls.getDeclaredFields()),
                        new Function<java.lang.reflect.Field, Field>() {
                            @Nullable @Override public Field apply(@Nullable java.lang.reflect.Field input) {
                                return new ReflectionField(input);
                            }
```

### DataFlowIssue
@Nullable method 'apply' always returns a non-null value
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/reflection/ReflectionClassDef.java`
#### Snippet
```java
                return Iterators.transform(staticFields,
                        new Function<java.lang.reflect.Field, Field>() {
                            @Nullable @Override public Field apply(@Nullable java.lang.reflect.Field input) {
                                return new ReflectionField(input);
                            }
```

### DataFlowIssue
Method invocation `setItemIdentity` may produce `NullPointerException`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/CdexDebugOffsetTable.java`
#### Snippet
```java
                            offsetDelta, debugOffset);

                    debugInfoAnnotator.setItemIdentity(debugOffset,
                            annotator.dexFile.getMethodSection().get(methodIndex + i).toString());
                }
```

### DataFlowIssue
Method invocation `getOffset` may produce `NullPointerException`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedDexFile.java`
#### Snippet
```java
                                String.format("Invalid callsite index %d, not in [0, %d)", index, size()));
                    }
                    return mapItem.getOffset() + index * CallSiteIdItem.ITEM_SIZE;
                }
            };
```

### DataFlowIssue
Method invocation `getOffset` may produce `NullPointerException`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedDexFile.java`
#### Snippet
```java
                                String.format("Invalid method handle index %d, not in [0, %d)", index, size()));
                    }
                    return mapItem.getOffset() + index * MethodHandleItem.ITEM_SIZE;
                }
            };
```

### DataFlowIssue
@Nullable method 'apply' always returns a non-null value
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/OatFile.java`
#### Snippet
```java
                    Iterators.filter(new DexEntryIterator(), Objects::nonNull),
                        new Function<OatDexEntry, DexBackedDexFile>() {
                            @Nullable @Override public DexBackedDexFile apply(OatDexEntry dexEntry) {
                                return dexEntry.getDexFile();
                            }
```

### DataFlowIssue
The call to 'checkArgument' always fails, according to its method contracts
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/value/ImmutableEncodedValueFactory.java`
#### Snippet
```java
                return ImmutableMethodTypeEncodedValue.of((MethodTypeEncodedValue) encodedValue);
            default:
                Preconditions.checkArgument(false);
                return null;
        }
```

### DataFlowIssue
Argument `getLabelPrefix()` might be null
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Format/OffsetInstructionFormatMethodItem.java`
#### Snippet
```java
        super(methodDef, codeAddress, instruction);

        label = new LabelMethodItem(options, codeAddress + instruction.getCodeOffset(), getLabelPrefix());
        label = methodDef.getLabelCache().internLabel(label);
    }
```

### DataFlowIssue
Dereference of `parent` may produce `NullPointerException`
in `third_party/util/src/main/java/com/android/tools/smali/util/ClassFileNameHandler.java`
#### Snippet
```java
            }
            String physicalName = getPhysicalNameWithSuffix(suffix);
            File file = new File(parent.file, physicalName).getCanonicalFile();
            this.physicalName = file.getName();
            createIfNeeded();
```

### DataFlowIssue
Method invocation `write` may produce `NullPointerException`
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Format/InstructionMethodItem.java`
#### Snippet
```java
                writeFirstRegister(writer);
                writer.write(", ");
                referenceWritable.write();
                break;
            case Format21ih:
```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `T` hides type parameter 'T'
in `dexlib2/src/main/java/com/android/tools/smali/util/ArraySortedSet.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        if (a.length <= arr.length) {
            System.arraycopy(arr, 0, (Object[])a, 0, arr.length);
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `Character.toString()` call
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/util/ParamUtil.java`
#### Snippet
```java
            default:
                throw new IllegalArgumentException(String.format("Param string \"%s\" contains invalid type prefix: %s",
                        str, Character.toString(c)));
        }
    }
```

### UnnecessaryCallToStringValueOf
Unnecessary `Long.toString()` call
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LiteralTools.java`
#### Snippet
```java
    public static void checkShort(long value) {
        if (value > 0xFFFF | value < -0x8000) {
            throw new NumberFormatException(Long.toString(value) + " cannot fit into a short");
        }
    }
```

### UnnecessaryCallToStringValueOf
Unnecessary `Long.toString()` call
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LiteralTools.java`
#### Snippet
```java
    public static void checkNibble(long value) {
        if (value > 0x0F | value < -0x08) {
            throw new NumberFormatException(Long.toString(value) + " cannot fit into a nibble");
        }
    }
```

### UnnecessaryCallToStringValueOf
Unnecessary `Long.toString()` call
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LiteralTools.java`
#### Snippet
```java
    public static void checkByte(long value) {
        if (value > 0xFF | value < -0x80) {
            throw new NumberFormatException(Long.toString(value) + " cannot fit into a byte");
        }
    }
```

### UnnecessaryCallToStringValueOf
Unnecessary `Long.toString()` call
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LiteralTools.java`
#### Snippet
```java
    public static void checkInt(long value) {
        if (value > 0xFFFFFFFF || value < -0x80000000) {
            throw new NumberFormatException(Long.toString(value) + " cannot fit into an int");
        }
    }
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Debug/EndLocalMethodItem.java`
#### Snippet
```java
        registerFormatter.writeTo(writer, endLocal.getRegister());

        String name = endLocal.getName();
        String type = endLocal.getType();
        String signature = endLocal.getSignature();
        if (name != null || type != null || signature != null) {
            writer.write("    # ");
            LocalFormatter.writeLocal(writer, name, type, signature);
        }
        return true;
```

### DuplicatedCode
Duplicated code
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
        if (help || inputList == null || inputList.isEmpty()) {
            usage();
            return;
        }

        if (inputList.size() > 1) {
            System.err.println("Too many files specified");
            usage();
            return;
        }

        String input = inputList.get(0);
```

### DuplicatedCode
Duplicated code
in `baksmali/src/main/java/com/android/tools/smali/baksmali/HelpCommand.java`
#### Snippet
```java
                    JCommander command = ExtendedCommands.getSubcommand(parentJc, cmd);
                    if (command == null) {
                        System.err.println("No such command: " + cmd);
                    } else {
                        printedHelp = true;
                        System.out.println(new HelpFormatter()
                                .width(ConsoleUtil.getConsoleWidth())
                                .format(((Command)command.getObjects().get(0)).getCommandHierarchy()));
                    }
```

### DuplicatedCode
Duplicated code
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListHelpCommand.java`
#### Snippet
```java
            for (String cmd : commands) {
                JCommander command = ExtendedCommands.getSubcommand(parentJc, cmd);
                if (command == null) {
                    System.err.println("No such command: " + cmd);
                } else {
                    printedHelp = true;
                    System.out.println(new HelpFormatter()
                            .width(ConsoleUtil.getConsoleWidth())
                            .format(((Command)command.getObjects().get(0)).getCommandHierarchy()));
                }
            }
            if (!printedHelp) {
                System.out.println(new HelpFormatter()
                        .width(ConsoleUtil.getConsoleWidth())
                        .format(commandAncestors));
            }
```

### DuplicatedCode
Duplicated code
in `baksmali/src/main/java/com/android/tools/smali/baksmali/Main.java`
#### Snippet
```java
        jc.parse(args);

        if (main.version) {
            version();
        }

        if (jc.getParsedCommand() == null || main.help) {
            main.usage();
            return;
        }

        Command command = (Command)jc.getCommands().get(jc.getParsedCommand()).getObjects().get(0);
        command.run();
```

### DuplicatedCode
Duplicated code
in `baksmali/src/main/java/com/android/tools/smali/baksmali/Main.java`
#### Snippet
```java
        String version = "[unknown version]";
        if (propertiesStream != null) {
            Properties properties = new Properties();
            try {
                properties.load(propertiesStream);
                version = properties.getProperty("application.version");
            } catch (IOException ex) {
                // ignore
            }
        }
        return version;
```

### DuplicatedCode
Duplicated code
in `baksmali/src/main/java/com/android/tools/smali/baksmali/formatter/BaksmaliWriter.java`
#### Snippet
```java
        writer.write("\\u");
        writer.write(Character.forDigit(c >> 12, 16));
        writer.write(Character.forDigit((c >> 8) & 0x0f, 16));
        writer.write(Character.forDigit((c >> 4) & 0x0f, 16));
        writer.write(Character.forDigit(c & 0x0f, 16));
```

### DuplicatedCode
Duplicated code
in `baksmali/src/main/java/com/android/tools/smali/baksmali/formatter/BaksmaliWriter.java`
#### Snippet
```java
        writeSimpleName(callSiteReference.getName());
        writer.write('(');
        writeQuotedString(callSiteReference.getMethodName());
        writer.write(", ");
        writeMethodProtoDescriptor(callSiteReference.getMethodProto());

        for (EncodedValue encodedValue : callSiteReference.getExtraArguments()) {
            writer.write(", ");
            writeEncodedValue(encodedValue);
        }

        writer.write(")@");
        MethodHandleReference methodHandle = callSiteReference.getMethodHandle();
        if (methodHandle.getMethodHandleType() != MethodHandleType.INVOKE_STATIC) {
            throw new IllegalArgumentException("The linker method handle for a call site must be of type invoke-static");
        }
        writeMethodDescriptor((MethodReference) callSiteReference.getMethodHandle().getMemberReference());
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/AnalyzedInstruction.java`
#### Snippet
```java
int originalSourceRegister = -1;

                    RegisterType newType = null;

                    for (AnalyzedInstruction prevPrevAnalyzedInstruction : prevInstruction.predecessors) {
                        Opcode opcode = prevPrevAnalyzedInstruction.instruction.getOpcode();
                        if (opcode == Opcode.MOVE_OBJECT || opcode == Opcode.MOVE_OBJECT_16 ||
                                opcode == Opcode.MOVE_OBJECT_FROM16) {
                            TwoRegisterInstruction moveInstruction =
                                    ((TwoRegisterInstruction)prevPrevAnalyzedInstruction.instruction);
                            RegisterType originalType =
                                    prevPrevAnalyzedInstruction.getPostInstructionRegisterType(
                                            moveInstruction.getRegisterB());
                            if (moveInstruction.getRegisterA() != instanceOfInstruction.getRegisterB()) {
                                originalSourceRegister = -1;
                                break;
                            }
                            if (originalType.type == null) {
                                originalSourceRegister = -1;
                                break;
                            }

                            if (newType == null) {
                                newType = RegisterType.getRegisterType(methodAnalyzer.getClassPath(),
                                        (TypeReference)instanceOfInstruction.getReference());
                            }

                            if (MethodAnalyzer.isNotWideningConversion(originalType, newType)) {
                                if (originalSourceRegister != -1) {
                                    if (originalSourceRegister != moveInstruction.getRegisterB()) {
                                        originalSourceRegister = -1;
                                        break;
                                    }
                                } else {
                                    originalSourceRegister = moveInstruction.getRegisterB();
                                }
                            }
                        } else {
                            originalSourceRegister = -1;
                            break;
                        }
                    }
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
                        if (fieldTypes[front] != REFERENCE) {
                            while (back > front) {
                                if (fieldTypes[back] == REFERENCE) {
                                    swap(fieldTypes, fields, front, back--);
                                    break;
                                }
                                back--;
                            }
                        }

                        if (fieldTypes[front] != REFERENCE) {
                            break;
                        }
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
            List<Method> vtable = Lists.newArrayList();

            //copy the virtual methods from the superclass
            String superclassType;
            try {
                superclassType = getSuperclass();
            } catch (UnresolvedClassException ex) {
                vtable.addAll(((ClassProto)classPath.getClass("Ljava/lang/Object;")).getVtable());
                vtableFullyResolved = false;
                return vtable;
            }

            if (superclassType != null) {
                ClassProto superclass = (ClassProto) classPath.getClass(superclassType);
                vtable.addAll(superclass.getVtable());

                // if the superclass's vtable wasn't fully resolved, then we can't know where the new methods added by this
                // class should start, so we just propagate what we can from the parent and hope for the best.
                if (!superclass.vtableFullyResolved) {
                    vtableFullyResolved = false;
                    return vtable;
                }
            }
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
int defaultMethodIndex = findMethodIndexInVtable(defaultMethods, interfaceMethod);

                        if (defaultMethodIndex >= 0) {
                            if (!AccessFlags.ABSTRACT.isSet(interfaceMethod.getAccessFlags())) {
                                ClassProto existingInterface = (ClassProto)classPath.getClass(
                                        defaultMethods.get(defaultMethodIndex).getDefiningClass());
                                if (!existingInterface.implementsInterface(interfaceMethod.getDefiningClass())) {
                                    Method removedMethod = defaultMethods.remove(defaultMethodIndex);
                                    defaultConflictMethods.add(removedMethod);
                                }
                            }
                            continue;
                        }

                        int defaultConflictMethodIndex = findMethodIndexInVtable(
                                defaultConflictMethods, interfaceMethod);
                        if (defaultConflictMethodIndex >= 0) {
                            // There's already a matching method in the conflict list, we don't need to do
                            // anything else
                            continue;
                        }

                        int mirandaMethodIndex = findMethodIndexInVtable(mirandaMethods, interfaceMethod);

                        if (mirandaMethodIndex >= 0) {
                            if (!AccessFlags.ABSTRACT.isSet(interfaceMethod.getAccessFlags())) {

                                ClassProto existingInterface = (ClassProto)classPath.getClass(
                                        mirandaMethods.get(mirandaMethodIndex).getDefiningClass());
                                if (!existingInterface.implementsInterface(interfaceMethod.getDefiningClass())) {
                                    Method oldMethod = mirandaMethods.remove(mirandaMethodIndex);
                                    int methodOrderValue = methodOrder.get(oldMethod);
                                    methodOrder.put(interfaceMethod, methodOrderValue);
                                    defaultMethods.add(interfaceMethod);
                                }
                            }
                            continue;
                        }
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
                Comparator<MethodReference> comparator = new Comparator<MethodReference>() {
                    @Override public int compare(MethodReference o1, MethodReference o2) {
                        return Ints.compare(methodOrder.get(o1), methodOrder.get(o2));
                    }
                };

                // The methods should be in the same order within each list as they were iterated over.
                // They can be misordered if, e.g. a method was originally added to the default list, but then moved
                // to the conflict list.
                Collections.sort(mirandaMethods, comparator);
                Collections.sort(defaultMethods, comparator);
                Collections.sort(defaultConflictMethods, comparator);
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
        BitSet changedInstructions = new BitSet(analyzedInstructions.size());

        if (!analyzedInstruction.setPostRegisterType(registerNumber, registerType)) {
            return;
        }

        propagateRegisterToSuccessors(analyzedInstruction, registerNumber, changedInstructions, false);

        propagateChanges(changedInstructions, registerNumber, false);

        if (registerType.category == RegisterType.LONG_LO) {
            checkWidePair(registerNumber, analyzedInstruction);
            setPostRegisterTypeAndPropagateChanges(analyzedInstruction, registerNumber+1, RegisterType.LONG_HI_TYPE);
        } else if (registerType.category == RegisterType.DOUBLE_LO) {
            checkWidePair(registerNumber, analyzedInstruction);
            setPostRegisterTypeAndPropagateChanges(analyzedInstruction, registerNumber+1, RegisterType.DOUBLE_HI_TYPE);
        }
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/reflection/ReflectionConstructor.java`
#### Snippet
```java
        return new AbstractList<MethodParameter>() {
            private final Class[] parameters = method.getParameterTypes();

            @Override public MethodParameter get(final int index) {
                return new BaseMethodParameter() {
                    @Nonnull @Override public Set<? extends Annotation> getAnnotations() {
                        return ImmutableSet.of();
                    }

                    @Nullable @Override public String getName() {
                        return null;
                    }

                    @Nonnull @Override public String getType() {
                        return ReflectionUtils.javaToDexName(parameters[index].getName());
                    }
                };
            }

            @Override public int size() {
                return parameters.length;
            }
        };
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/reflection/ReflectionConstructor.java`
#### Snippet
```java
        return new AbstractList<String>() {
            private final List<? extends MethodParameter> parameters = getParameters();

            @Override public String get(int index) {
                return parameters.get(index).getType();
            }

            @Override public int size() {
                return parameters.size();
            }
        };
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedClassDef.java`
#### Snippet
```java
                                FieldReference currentField = previousField;
                                FieldReference nextField = ImmutableFieldReference.of(item);

                                previousField = nextField;
                                previousIndex = item.fieldIndex;

                                if (skipDuplicates && currentField != null && currentField.equals(nextField)) {
                                    continue;
                                }

                                return item;
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedClassDef.java`
#### Snippet
```java
                                int hiddenApiRestrictions = NO_HIDDEN_API_RESTRICTIONS;
                                if (hiddenApiRestrictionIterator != null) {
                                    hiddenApiRestrictions = hiddenApiRestrictionIterator.next();
                                }

                                DexBackedMethod item = new DexBackedMethod(dexFile, reader, DexBackedClassDef.this,
                                        previousIndex, methodAnnotationIterator, parameterAnnotationIterator,
                                        hiddenApiRestrictions);
                                MethodReference currentMethod = previousMethod;
                                MethodReference nextMethod = ImmutableMethodReference.of(item);

                                previousMethod = nextMethod;
                                previousIndex = item.methodIndex;

                                if (skipDuplicates && currentMethod != null && currentMethod.equals(nextMethod)) {
                                    continue;
                                }
                                return item;
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedClassDef.java`
#### Snippet
```java
                                DexBackedMethod item = new DexBackedMethod(dexFile, reader, DexBackedClassDef.this,
                                        previousIndex, methodAnnotationIterator, parameterAnnotationIterator,
                                        hiddenApiRestrictions);
                                MethodReference currentMethod = previousMethod;
                                MethodReference nextMethod = ImmutableMethodReference.of(item);

                                previousMethod = nextMethod;
                                previousIndex = item.methodIndex;

                                if (skipDuplicates && currentMethod != null && currentMethod.equals(nextMethod)) {
                                    continue;

                                }
                                return item;
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedMethod.java`
#### Snippet
```java
        if (parametersOffset > 0) {
            final int parameterCount = dexFile.getDataBuffer().readSmallUint(parametersOffset + TypeListItem.SIZE_OFFSET);
            final int paramListStart = parametersOffset + TypeListItem.LIST_OFFSET;
            return new FixedSizeList<String>() {
                @Nonnull
                @Override
                public String readItem(final int index) {
                    return dexFile.getTypeSection().get(dexFile.getDataBuffer().readUshort(paramListStart + 2*index));
                }
                @Override public int size() { return parameterCount; }
            };
        }
        return ImmutableList.of();
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBuffer.java`
#### Snippet
```java
        return (buf[offset] & 0xff) |
                ((buf[offset+1] & 0xff) << 8) |
                ((buf[offset+2] & 0xff) << 16) |
                ((buf[offset+3] & 0xffL) << 24) |
                ((buf[offset+4] & 0xffL) << 32) |
                ((buf[offset+5] & 0xffL) << 40) |
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexReader.java`
#### Snippet
```java
                result = (buf[o] & 0xff) |
                        ((buf[o+1] & 0xff) << 8) |
                        ((buf[o+2] & 0xff) << 16) |
                        ((buf[o+3] & 0xffL) << 24) |
                        ((buf[o+4] & 0xffL) << 32) |
                        ((buf[o+5] & 0xffL) << 40) |
                        ((buf[o+6] & 0xffL) << 48) |
                        (((long)buf[o+7]) << 56);
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/CdexHeaderItem.java`
#### Snippet
```java
        if (buf.length - offset < 8) {
            return false;
        }

        for (int i=0; i<4; i++) {
            if (buf[offset + i] != MAGIC_VALUE[i]) {
                return false;
            }
        }
        for (int i=4; i<7; i++) {
            if (buf[offset + i] < '0' ||
                    buf[offset + i] > '9') {
                return false;
            }
        }
        if (buf[offset + 7] != MAGIC_VALUE[7]) {
            return false;
        }

        return true;
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/DebugInfoItem.java`
#### Snippet
```java
                            out.indent();
                            int registerNum = reader.readSmallUleb128();
                            out.annotateTo(reader.getOffset(), "register_num = v%d", registerNum);
                            int nameIndex = reader.readSmallUleb128() - 1;
                            out.annotateTo(reader.getOffset(), "name_idx = %s",
                                    StringIdItem.getOptionalReferenceAnnotation(dexFile, nameIndex, true));
                            int typeIndex = reader.readSmallUleb128() - 1;
                            out.annotateTo(reader.getOffset(), "type_idx = %s",
                                    TypeIdItem.getOptionalReferenceAnnotation(dexFile, typeIndex));
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/formatter/DexFormattedWriter.java`
#### Snippet
```java
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if ((c >= ' ') && (c < 0x7f)) {
                if ((c == '\'') || (c == '\"') || (c == '\\')) {
                    writer.write('\\');
                }
                writer.write(c);
                continue;
            } else if (c <= 0x7f) {
                switch (c) {
                    case '\n': writer.write("\\n"); continue;
                    case '\r': writer.write("\\r"); continue;
                    case '\t': writer.write("\\t"); continue;
                }
            }

            writer.write("\\u");
            writer.write(Character.forDigit(c >> 12, 16));
            writer.write(Character.forDigit((c >> 8) & 0x0f, 16));
            writer.write(Character.forDigit((c >> 4) & 0x0f, 16));
            writer.write(Character.forDigit(c & 0x0f, 16));
        }
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/RewriterUtils.java`
#### Snippet
```java
                final Iterator<? extends T> iterator = set.iterator();
                return new Iterator<T>() {
                    @Override public boolean hasNext() {
                        return iterator.hasNext();
                    }

                    @Override public T next() {
                        return rewriteNullable(rewriter, iterator.next());
                    }

                    @Override public void remove() {
                        iterator.remove();
                    }
                };
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/DexUtil.java`
#### Snippet
```java
        int endian = HeaderItem.getEndian(buf, offset);
        if (endian == HeaderItem.BIG_ENDIAN_TAG) {
            throw new UnsupportedFile("Big endian dex files are not supported");
        }

        if (endian != HeaderItem.LITTLE_ENDIAN_TAG) {
            throw new InvalidFile(String.format("Invalid endian tag: 0x%x", endian));
        }

        return dexVersion;
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexDataWriter.java`
#### Snippet
```java
        int index = 0;
        if (value >= 0) {
            while (value > 0x7f) {
                tempBuf[index++] = (byte)value;
                value >>= 8;
            }
        } else {
            while (value < -0x80) {
                tempBuf[index++] = (byte)value;
                value >>= 8;
            }
        }
        tempBuf[index++] = (byte)value;
        writeEncodedValueHeader(valueType, index-1);
        write(tempBuf, 0, index);
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
        if (typeSection.getItems().size()  > 0) {
            numItems++;
        }
        if (protoSection.getItems().size() > 0) {
            numItems++;
        }
        if (fieldSection.getItems().size() > 0) {
            numItems++;
        }
        if (methodSection.getItems().size() > 0) {
            numItems++;
        }
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
            writer.write(getOpcodeValue(instruction.getOpcode()));
            writer.write(packNibbles(instruction.getRegisterG(), instruction.getRegisterCount()));
            writer.writeUshort(getReferenceIndex(instruction));
            writer.write(packNibbles(instruction.getRegisterC(), instruction.getRegisterD()));
            writer.write(packNibbles(instruction.getRegisterE(), instruction.getRegisterF()));
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/util/NumberUtils.java`
#### Snippet
```java
        String asInt = format.format(value);
        String asFloat = format.format(floatValue);

        // try to strip off any small imprecision near the end of the mantissa
        int decimalPoint = asFloat.indexOf('.');
        int exponent = asFloat.indexOf("E");
        int zeros = asFloat.indexOf("000");
        if (zeros > decimalPoint && zeros < exponent) {
            asFloat = asFloat.substring(0, zeros) + asFloat.substring(exponent);
        } else {
            int nines = asFloat.indexOf("999");
            if (nines > decimalPoint && nines < exponent) {
                asFloat = asFloat.substring(0, nines) + asFloat.substring(exponent);
            }
        }

        return asFloat.length() < asInt.length();
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/util/SparseArray.java`
#### Snippet
```java
            if (mSize >= mKeys.length) {
                int n = Math.max(mSize + 1, mKeys.length * 2);

                int[] nkeys = new int[n];
                Object[] nvalues = new Object[n];

                // Log.e("SparseArray", "grow " + mKeys.length + " to " + n);
                System.arraycopy(mKeys, 0, nkeys, 0, mKeys.length);
                System.arraycopy(mValues, 0, nvalues, 0, mValues.length);

                mKeys = nkeys;
                mValues = nvalues;
            }
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/util/SparseArray.java`
#### Snippet
```java
            if (mSize - i != 0) {
                // Log.e("SparseArray", "move " + (mSize - i));
                System.arraycopy(mKeys, i, mKeys, i + 1, mSize - i);
                System.arraycopy(mValues, i, mValues, i + 1, mSize - i);
            }

            mKeys[i] = key;
            mValues[i] = value;
            mSize++;
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/util/SparseArray.java`
#### Snippet
```java
        int high = start + len, low = start - 1, guess;

        while (high - low > 1) {
            guess = (high + low) / 2;

            if (a[guess] < key)
                low = guess;
            else
                high = guess;
        }

        if (high == start + len)
            return ~(start + len);
        else if (a[high] == key)
            return high;
        else
            return ~high;
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/util/SparseIntArray.java`
#### Snippet
```java
            if (mSize >= mKeys.length) {
                int n = Math.max(mSize + 1, mKeys.length * 2);

                int[] nkeys = new int[n];
                int[] nvalues = new int[n];

                // Log.e("SparseIntArray", "grow " + mKeys.length + " to " + n);
                System.arraycopy(mKeys, 0, nkeys, 0, mKeys.length);
                System.arraycopy(mValues, 0, nvalues, 0, mValues.length);

                mKeys = nkeys;
                mValues = nvalues;
            }
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/util/Utf8Utils.java`
#### Snippet
```java
                    int v1 = bytes[at + 1] & 0xFF;
                    if ((v1 & 0xc0) != 0x80) {
                        return throwBadUtf8(v1, at + 1);
                    }
                    int value = ((v0 & 0x1f) << 6) | (v1 & 0x3f);
                    if ((value != 0) && (value < 0x80)) {
                        /*
                         * This should have been represented with
                         * one-byte encoding.
                         */
                        return throwBadUtf8(v1, at + 1);
                    }
                    out = (char) value;
                    at += 2;
                    break;
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/util/Utf8Utils.java`
#### Snippet
```java
                    int value = ((v0 & 0x1f) << 6) | (v1 & 0x3f);
                    if ((value != 0) && (value < 0x80)) {
                        /*
                         * This should have been represented with
                         * one-byte encoding.
                         */
                        return throwBadUtf8(v1, at + 1);
                    }
                    out = (char) value;
                    at += 2;
                    break;
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/util/Utf8Utils.java`
#### Snippet
```java
                    int v1 = bytes[at + 1] & 0xFF;
                    if ((v1 & 0xc0) != 0x80) {
                        return throwBadUtf8(v1, at + 1);
                    }
                    int v2 = bytes[at + 2] & 0xFF;
                    if ((v2 & 0xc0) != 0x80) {
                        return throwBadUtf8(v2, at + 2);
                    }
                    int value = ((v0 & 0x0f) << 12) | ((v1 & 0x3f) << 6) |
                        (v2 & 0x3f);
                    if (value < 0x800) {
                        /*
                         * This should have been represented with one- or
                         * two-byte encoding.
                         */
                        return throwBadUtf8(v2, at + 2);
                    }
                    out = (char) value;
                    at += 3;
                    break;
```

### DuplicatedCode
Duplicated code
in `dexlib2/src/main/java/com/android/tools/smali/util/Utf8Utils.java`
#### Snippet
```java
                    int v2 = bytes[at + 2] & 0xFF;
                    if ((v2 & 0xc0) != 0x80) {
                        return throwBadUtf8(v2, at + 2);
                    }
                    int value = ((v0 & 0x0f) << 12) | ((v1 & 0x3f) << 6) |
                            (v2 & 0x3f);
                    if (value < 0x800) {
                        /*
                         * This should have been represented with one- or
                         * two-byte encoding.
                         */
                        return throwBadUtf8(v2, at + 2);
                    }
                    out = (char) value;
                    at += 3;
                    break;
```

### DuplicatedCode
Duplicated code
in `smali/src/main/java/com/android/tools/smali/smali/Smali.java`
#### Snippet
```java
        TreeSet<File> filesToProcessSet = new TreeSet<File>();

        for (String fileToProcess: input) {
            File argFile = new File(fileToProcess);

            if (!argFile.exists()) {
                throw new IllegalArgumentException("Cannot find file or directory \"" + fileToProcess + "\"");
            }

            if (argFile.isDirectory()) {
                getSmaliFilesInDir(argFile, filesToProcessSet);
            } else if (argFile.isFile()) {
                filesToProcessSet.add(argFile);
            }
        }

        boolean errors = false;
```

### DuplicatedCode
Duplicated code
in `smali/src/main/java/com/android/tools/smali/smali/Smali.java`
#### Snippet
```java
                    Token token = tokens.get(i);
                    if (token.getChannel() == smaliParser.HIDDEN) {
                        continue;
                    }

                    String tokenName;
                    if (token.getType() == -1) {
                        tokenName = "EOF";
                    } else {
                        tokenName = smaliParser.tokenNames[token.getType()];
                    }
```

### DuplicatedCode
Duplicated code
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java
            if (i != effectiveInstructions.size() - 1) {
                methodItems.add(new BlankMethodItem(currentCodeAddress));
            }

            if (classDef.options.codeOffsets) {
                methodItems.add(new MethodItem(currentCodeAddress) {

                    @Override
                    public double getSortOrder() {
                        return -1000;
                    }

                    @Override
                    public boolean writeTo(BaksmaliWriter writer) throws IOException {
                        writer.write("#@");
                        writer.writeUnsignedLongAsHex(codeAddress & 0xFFFFFFFFL);
                        return true;
                    }
                });
            }
```

### DuplicatedCode
Duplicated code
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LiteralTools.java`
#### Snippet
```java
        int position = 0;
        int radix = 10;
        boolean negative = false;
        if (byteChars[position] == '-') {
            position++;
            negative = true;
        }

        if (byteChars[position] == '0') {
            position++;
            if (position == byteChars.length) {
                return 0;
            } else if (byteChars[position] == 'x' || byteChars[position] == 'X') {
                radix = 16;
                position++;
            } else if (Character.digit(byteChars[position], 8) >= 0) {
                radix = 8;
            }
        }
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `third_party/util/src/main/java/com/android/tools/smali/util/ConsoleUtil.java`
#### Snippet
```java
            try {
                return attemptMode();
            } catch (Exception ex) {
            }
        } else {
```

### CatchMayIgnoreException
Empty `catch` block
in `third_party/util/src/main/java/com/android/tools/smali/util/ConsoleUtil.java`
#### Snippet
```java
            try {
                return attemptStty();
            } catch (Exception ex) {
            }
        }
```

### CatchMayIgnoreException
Empty `catch` block
in `third_party/util/src/main/java/com/android/tools/smali/util/PathUtil.java`
#### Snippet
```java
                writer.close();
            } catch (IOException ex) {
                try {f.delete();} catch (Exception ex2) {}
                throw ex;
            }
```

### CatchMayIgnoreException
Empty `catch` block
in `third_party/util/src/main/java/com/android/tools/smali/util/PathUtil.java`
#### Snippet
```java
            }
        } finally {
            try { f.delete(); } catch (Exception ex) {}
            try { f2.delete(); } catch (Exception ex) {}
        }
```

### CatchMayIgnoreException
Empty `catch` block
in `third_party/util/src/main/java/com/android/tools/smali/util/PathUtil.java`
#### Snippet
```java
        } finally {
            try { f.delete(); } catch (Exception ex) {}
            try { f2.delete(); } catch (Exception ex) {}
        }
    }
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return set but the return type is map
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
     * If any interface couldn't be resolved, then the interfacesFullyResolved field will be set to false upon return.
     *
     * @return the set of interfaces that this class implements as a Map<String, ClassDef>.
     */
    @Nonnull
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/util/TryListBuilder.java`
#### Snippet
```java
             * @return The next item, or null if there is no next item
             */
            @Nullable protected MutableTryBlock<EH> readNextItem() {
                // We can assume that next is not null, due to the way iteration happens
                MutableTryBlock<EH> ret = next.next;
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/DexFileFactory.java`
#### Snippet
```java
        }

        InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            try {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/DexFileFactory.java`
#### Snippet
```java
        }

        InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            try {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/DexFileFactory.java`
#### Snippet
```java
        }

        InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            OatFile oatFile = null;
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/io/FileDeferredOutputStream.java`
#### Snippet
```java
    public FileDeferredOutputStream(@Nonnull File backingFile, int bufferSize) throws FileNotFoundException {
        this.backingFile = backingFile;
        output = new NakedBufferedOutputStream(new FileOutputStream(backingFile), bufferSize);
    }

```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/io/FileDeferredOutputStream.java`
#### Snippet
```java
        // did we actually write something out to disk?
        if (count != writtenBytes) {
            InputStream fis = new FileInputStream(backingFile);
            ByteStreams.copy(fis, dest);
            backingFile.delete();
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Baksmali.java`
#### Snippet
```java

            BufferedWriter bufWriter = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(smaliFile), "UTF8"));

            writer = new BaksmaliWriter(
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
        if (!validCategories.get(registerType.category)) {
            throw new AnalysisException(String.format("Invalid register type %s for register v%d.",
                    registerType.toString(), registerNumber));
        }
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Baksmali.java`
#### Snippet
```java
                    // check again, it's likely it was created in a different thread
                    if (!smaliParent.exists()) {
                        System.err.println("Unable to create directory " + smaliParent.toString() + " - skipping class");
                        return false;
                    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Baksmali.java`
#### Snippet
```java
            if (!smaliFile.exists()){
                if (!smaliFile.createNewFile()) {
                    System.err.println("Unable to create file " + smaliFile.toString() + " - skipping class");
                    return false;
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Baksmali.java`
#### Snippet
```java
                    writer.close();
                } catch (Throwable ex) {
                    System.err.println("\n\nError occurred while closing file " + smaliFile.toString());
                    ex.printStackTrace();
                }
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Baksmali.java`
#### Snippet
```java
    private static boolean disassembleClass(ClassDef classDef, ClassFileNameHandler fileNameHandler,
                                            BaksmaliOptions options) {
        /**
         * The path for the disassembly file is based on the package name
         * The class descriptor will look something like:
```

### DanglingJavadoc
Dangling Javadoc comment
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java
            }

            /**
             * The end address points to the address immediately after the end of the last
             * instruction that the try block covers. We want the .catch directive and end_try
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `PreInstructionInfo` may be 'static'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/CodeItem.java`
#### Snippet
```java
        }

        protected class PreInstructionInfo {
            public int triesCount;
            public int instructionSize;
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `fieldIndex` declared in one 'switch' branch and used in another
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/EncodedValue.java`
#### Snippet
```java
                return TypeIdItem.getReferenceAnnotation(dexFile, typeIndex);
            case ValueType.FIELD:
                int fieldIndex = reader.readSizedSmallUint(valueArg+1);
                return FieldIdItem.getReferenceAnnotation(dexFile, fieldIndex);
            case ValueType.METHOD:
```

### SwitchStatementWithConfusingDeclaration
Local variable `baseAddress` declared in one 'switch' branch and used in another
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Format/InstructionMethodItem.java`
#### Snippet
```java
            switch (instruction.getOpcode()) {
                case PACKED_SWITCH:
                    int baseAddress = methodDef.getPackedSwitchBaseAddress(
                            this.codeAddress + ((Instruction31t)instruction).getCodeOffset());
                    if (baseAddress == -1) {
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `smali/src/main/java/com/android/tools/smali/smali/Smali.java`
#### Snippet
```java
        }

        if (errors) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/AnalyzedMethodUtil.java`
#### Snippet
```java
            ClassPath classPath = type.getClassPath();
            ClassDef methodClassDef = classPath.getClassDef(virtualMethod.getDefiningClass());
            if (!TypeUtils.canAccessClass(type.getType(), methodClassDef)) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/AnalyzedInstruction.java`
#### Snippet
```java
            return true;
        }
        if (instruction.getOpcode().setsWideRegister() && registerNumber == (destinationRegister + 1)) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/OdexHeaderItem.java`
#### Snippet
```java
            }
        }
        if (buf[offset + 7] != MAGIC_VALUE[7]) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
                return true;
        }
            if (commonSuperclass.getType().equals(newType.type.getType())) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/CdexHeaderItem.java`
#### Snippet
```java
            }
        }
        if (buf[offset + 7] != MAGIC_VALUE[7]) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/HeaderItem.java`
#### Snippet
```java
            }
        }
        if (buf[offset + 7] != MAGIC_VALUE[7]) {
            return false;
        }
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassPathResolver.java`
#### Snippet
```java
                    "/system/framework/services.jar",
                    "/system/framework/apache-xml.jar");
        } else if (apiLevel <= 18) {
            return Lists.newArrayList(
                    "/system/framework/core.jar",
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassPathResolver.java`
#### Snippet
```java
                    "/system/framework/services.jar",
                    "/system/framework/apache-xml.jar");
        } else if (apiLevel <= 19) {
            return Lists.newArrayList(
                    "/system/framework/core.jar",
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassPathResolver.java`
#### Snippet
```java
                    "/system/framework/android.policy.jar",
                    "/system/framework/apache-xml.jar");
        } else if (apiLevel <= 23) {
            return Lists.newArrayList(
                    "/system/framework/core-libart.jar",
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `smali/src/main/java/com/android/tools/smali/smali/Smali.java`
#### Snippet
```java
        try {
            fis = new FileInputStream(smaliFile);
            InputStreamReader reader = new InputStreamReader(fis, "UTF-8");

            LexerErrorInterface lexer = new smaliFlexLexer(reader, options.apiLevel);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `smali/src/main/java/com/android/tools/smali/smali/Smali.java`
#### Snippet
```java
        try {
            fis = new FileInputStream(smaliFile);
            InputStreamReader reader = new InputStreamReader(fis, "UTF-8");

            LexerErrorInterface lexer = new smaliFlexLexer(reader, options.apiLevel);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/CustomInlineMethodResolver.java`
#### Snippet
```java

    public CustomInlineMethodResolver(@Nonnull ClassPath classPath, @Nonnull File inlineTable) throws IOException {
        this(classPath, Files.toString(inlineTable, Charset.forName("UTF-8")));
    }

```

### CharsetObjectCanBeUsed
StandardCharsets.US_ASCII can be used instead
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedOdexFile.java`
#### Snippet
```java
                reader.moveRelative(length + 20);
                try {
                    return new String(fromStartBuffer.buf, offset, length-1, "US-ASCII");
                } catch (UnsupportedEncodingException ex) {
                    throw new RuntimeException(ex);
```

### CharsetObjectCanBeUsed
StandardCharsets.US_ASCII can be used instead
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/CDexBackedDexFile.java`
#### Snippet
```java
        byte[] cdexMagic;
        try {
            cdexMagic = "cdex".getBytes("US-ASCII");
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
```

### CharsetObjectCanBeUsed
StandardCharsets.US_ASCII can be used instead
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/OatFile.java`
#### Snippet
```java
            }

            return new String(buf, start, end-start, Charset.forName("US-ASCII"));
        }
    }
```

### CharsetObjectCanBeUsed
StandardCharsets.US_ASCII can be used instead
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/OatFile.java`
#### Snippet
```java

                // TODO: what is the correct character encoding?
                String filename = new String(buf, offset, filenameLength, Charset.forName("US-ASCII"));
                offset += filenameLength;

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Baksmali.java`
#### Snippet
```java

            BufferedWriter bufWriter = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(smaliFile), "UTF8"));

            writer = new BaksmaliWriter(
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'FileReader' used without 'try'-with-resources statement
in `third_party/util/src/main/java/com/android/tools/smali/util/PathUtil.java`
#### Snippet
```java
            try {
                CharBuffer buf = CharBuffer.allocate(32);
                FileReader reader = new FileReader(f2);

                while (reader.read(buf) != -1 && buf.length() < 4);
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'o != null' covered by subsequent condition 'o instanceof AnnotationElement'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/base/BaseAnnotationElement.java`
#### Snippet
```java
    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof AnnotationElement) {
            AnnotationElement other = (AnnotationElement)o;
            return getName().equals(other.getName()) &&
```

### ConditionCoveredByFurtherCondition
Condition 'o != null' covered by subsequent condition 'o instanceof FloatEncodedValue'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/base/value/BaseFloatEncodedValue.java`
#### Snippet
```java
    @Override
    public boolean equals(@Nullable Object o) {
        if (o != null && o instanceof FloatEncodedValue) {
            return Float.floatToRawIntBits(getValue()) == Float.floatToRawIntBits(((FloatEncodedValue)o).getValue());
        }
```

### ConditionCoveredByFurtherCondition
Condition 'o != null' covered by subsequent condition 'o instanceof MethodReference'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/base/reference/BaseMethodReference.java`
#### Snippet
```java
    @Override
    public boolean equals(@Nullable Object o) {
        if (o != null && o instanceof MethodReference) {
            MethodReference other = (MethodReference)o;
            return getDefiningClass().equals(other.getDefiningClass()) &&
```

### ConditionCoveredByFurtherCondition
Condition 'o != null' covered by subsequent condition 'o instanceof StringReference'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/base/reference/BaseStringReference.java`
#### Snippet
```java
    @Override
    public boolean equals(@Nullable Object o) {
        if (o != null && o instanceof StringReference) {
            return getString().equals(((StringReference)o).getString());
        }
```

### ConditionCoveredByFurtherCondition
Condition 'o != null' covered by subsequent condition 'o instanceof MethodHandleReference'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/base/reference/BaseMethodHandleReference.java`
#### Snippet
```java
    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof MethodHandleReference) {
            MethodHandleReference other = (MethodHandleReference) o;
            return getMethodHandleType() == other.getMethodHandleType() &&
```

### ConditionCoveredByFurtherCondition
Condition 'o != null' covered by subsequent condition 'o instanceof CallSiteReference'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/base/reference/BaseCallSiteReference.java`
#### Snippet
```java
    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof CallSiteReference) {
            CallSiteReference other = (CallSiteReference) o;
            return getMethodHandle().equals(other.getMethodHandle()) &&
```

### ConditionCoveredByFurtherCondition
Condition 'targetInstruction == null' covered by subsequent condition '!(targetInstruction instanceof BuilderSwitchPayload)'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/MutableMethodImplementation.java`
#### Snippet
```java
                            targetInstruction = getFirstNonNop(targetLocation.index+1);
                        }
                        if (targetInstruction == null || !(targetInstruction instanceof BuilderSwitchPayload)) {
                            throw new IllegalStateException(String.format("Switch instruction at address/index " +
                                    "0x%x/%d does not refer to a payload instruction.",
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/ReferenceType.java`
#### Snippet
```java
     * Validate a specific reference type. Note that the NONE placeholder is specifically not considered valid here.
     *
     * @throws InvalidReferenceTypeException
     */
    public static void validateReferenceType(int referenceType) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DumpCommand.java`
#### Snippet
```java
     *               when needed.
     *
     * @throws IOException
     */
    public static void dump(@Nonnull DexBackedDexFile dexFile, @Nonnull OutputStream output)
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `a` to `Object[]` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/util/ArraySortedSet.java`
#### Snippet
```java
    public <T> T[] toArray(T[] a) {
        if (a.length <= arr.length) {
            System.arraycopy(arr, 0, (Object[])a, 0, arr.length);
            return a;
        }
```

### RedundantCast
Casting `_SyntheticAccessorFSM_actions[_acts++]` to `int` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
	if ( _SyntheticAccessorFSM_trans_actions[_trans] != 0 ) {
		_acts = _SyntheticAccessorFSM_trans_actions[_trans];
		_nacts = (int) _SyntheticAccessorFSM_actions[_acts++];
		while ( _nacts-- > 0 )
	{
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `apiLevel` may be 'final'
in `smali/src/main/java/com/android/tools/smali/smali/PrintTokensCommand.java`
#### Snippet
```java
            description = "The numeric api level to use while assembling.")
    @ExtendedParameter(argumentNames = "api")
    private int apiLevel = 15;

    @Parameter(description = "Assembles the given files. If a directory is specified, it will be " +
```

### FieldMayBeFinal
Field `verbose` may be 'final'
in `smali/src/main/java/com/android/tools/smali/smali/AssembleCommand.java`
#### Snippet
```java
    @Parameter(names = "--verbose",
            description = "Generate verbose error messages.")
    private boolean verbose = false;

    @Parameter(names = {"--allow-odex-opcodes", "--allow-odex", "--ao"},
```

### FieldMayBeFinal
Field `apiLevel` may be 'final'
in `smali/src/main/java/com/android/tools/smali/smali/AssembleCommand.java`
#### Snippet
```java
            description = "The numeric api level to use while assembling.")
    @ExtendedParameter(argumentNames = "api")
    private int apiLevel = 15;

    @Parameter(names = {"-o", "--output"},
```

### FieldMayBeFinal
Field `jobs` may be 'final'
in `smali/src/main/java/com/android/tools/smali/smali/AssembleCommand.java`
#### Snippet
```java
            validateWith = PositiveInteger.class)
    @ExtendedParameter(argumentNames = "n")
    private int jobs = Runtime.getRuntime().availableProcessors();

    @Parameter(names = {"-a", "--api"},
```

### FieldMayBeFinal
Field `output` may be 'final'
in `smali/src/main/java/com/android/tools/smali/smali/AssembleCommand.java`
#### Snippet
```java
            description = "The name/path of the dex file to write.")
    @ExtendedParameter(argumentNames = "file")
    private String output = "out.dex";

    @Parameter(names = "--verbose",
```

### FieldMayBeFinal
Field `context` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/util/ExceptionWithContext.java`
#### Snippet
```java
        extends RuntimeException {
    /** non-null; human-oriented context of the exception */
    private StringBuffer context;

    /**
```

### FieldMayBeFinal
Field `NAMES` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/AnnotationVisibility.java`
#### Snippet
```java
    public static final int SYSTEM = 2;

    private static String[] NAMES = new String[] {"build", "runtime", "system"};

    public static String getVisibility(int visibility) {
```

### FieldMayBeFinal
Field `accessFlagName` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/AccessFlags.java`
#### Snippet
```java

    private int value;
    private String accessFlagName;
    private boolean validForClass;
    private boolean validForMethod;
```

### FieldMayBeFinal
Field `validForMethod` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/AccessFlags.java`
#### Snippet
```java
    private String accessFlagName;
    private boolean validForClass;
    private boolean validForMethod;
    private boolean validForField;

```

### FieldMayBeFinal
Field `validForClass` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/AccessFlags.java`
#### Snippet
```java
    private int value;
    private String accessFlagName;
    private boolean validForClass;
    private boolean validForMethod;
    private boolean validForField;
```

### FieldMayBeFinal
Field `value` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/AccessFlags.java`
#### Snippet
```java
    DECLARED_SYNCHRONIZED(0x20000, "declared-synchronized", false, true, false);

    private int value;
    private String accessFlagName;
    private boolean validForClass;
```

### FieldMayBeFinal
Field `validForField` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/AccessFlags.java`
#### Snippet
```java
    private boolean validForClass;
    private boolean validForMethod;
    private boolean validForField;

    //cache the array of all AccessFlags, because .values() allocates a new array for every call
```

### FieldMayBeFinal
Field `accessFlagsByName` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/AccessFlags.java`
#### Snippet
```java
    private final static AccessFlags[] allFlags;

    private static HashMap<String, AccessFlags> accessFlagsByName;

    static {
```

### FieldMayBeFinal
Field `directMask` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/MethodUtil.java`
#### Snippet
```java

public final class MethodUtil {
    private static int directMask = AccessFlags.STATIC.getValue() | AccessFlags.PRIVATE.getValue() |
            AccessFlags.CONSTRUCTOR.getValue();

```

### FieldMayBeFinal
Field `annotatations` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/AnnotatedBytes.java`
#### Snippet
```java
     * The point annotations for a point are associated with the key at that point.
     */
    @Nonnull private TreeMap<Integer, AnnotationEndpoint> annotatations = Maps.newTreeMap();

    private int cursor;
```

### FieldMayBeFinal
Field `hexCols` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/AnnotatedBytes.java`
#### Snippet
```java
     * in annotations
     */
    private int hexCols = 8;

    private int startLimit = -1;
```

### FieldMayBeFinal
Field `outputWidth` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/AnnotatedBytes.java`
#### Snippet
```java

    /** &gt;= 40 (if used); the desired maximum output width */
    private int outputWidth;

    /**
```

### FieldMayBeFinal
Field `zeroBuf` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexDataWriter.java`
#### Snippet
```java

    /** A buffer of 0s to use for writing alignment values */
    private byte[] zeroBuf = new byte[3];

    /**
```

### FieldMayBeFinal
Field `iter` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/ClassPool.java`
#### Snippet
```java
            @Nonnull @Override public Iterator<Entry<PoolClassDef, Integer>> iterator() {
                return new Iterator<Entry<PoolClassDef, Integer>>() {
                    Iterator<PoolClassDef> iter = internedItems.values().iterator();

                    @Override public boolean hasNext() {
```

### FieldMayBeFinal
Field `classMap` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/DexClassProvider.java`
#### Snippet
```java
public class DexClassProvider implements ClassProvider {
    private final DexFile dexFile;
    private Map<String, ClassDef> classMap = Maps.newHashMap();

    public DexClassProvider(DexFile dexFile) {
```

### FieldMayBeFinal
Field `loadedClasses` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassPath.java`
#### Snippet
```java
    };

    @Nonnull private LoadingCache<String, TypeProto> loadedClasses = CacheBuilder.newBuilder().build(classLoader);

    @Nonnull
```

### FieldMayBeFinal
Field `classProviders` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassPath.java`
#### Snippet
```java
public class ClassPath {
    @Nonnull private final TypeProto unknownClass;
    @Nonnull private List<ClassProvider> classProviders;
    private final boolean checkPackagePrivateAccess;
    public final int oatVersion;
```

### FieldMayBeFinal
Field `primitiveMap` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/reflection/util/ReflectionUtils.java`
#### Snippet
```java
public class ReflectionUtils {

    private static ImmutableBiMap<String, String> primitiveMap = ImmutableBiMap.<String, String>builder()
            .put("boolean", "Z")
            .put("int", "I")
```

### FieldMayBeFinal
Field `callSiteComparator` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
                                              @Nonnull EncodedValue encodedValue) throws IOException;

    private Comparator<Map.Entry<? extends CallSiteKey, Integer>> callSiteComparator =
            new Comparator<Entry<? extends CallSiteKey, Integer>>() {
                @Override
```

### FieldMayBeFinal
Field `toStringKeyComparator` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
            };

    private static Comparator<Map.Entry> toStringKeyComparator =
            new Comparator<Map.Entry>() {
                @Override public int compare(Entry o1, Entry o2) {
```

### FieldMayBeFinal
Field `methodHandleSection` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedDexFile.java`
#### Snippet
```java
    }

    private IndexedSection<DexBackedMethodHandleReference> methodHandleSection =
            new IndexedSection<DexBackedMethodHandleReference>() {
                @Override
```

### FieldMayBeFinal
Field `classSection` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedDexFile.java`
#### Snippet
```java
    }

    private IndexedSection<DexBackedClassDef> classSection = new IndexedSection<DexBackedClassDef>() {
        @Override
        public DexBackedClassDef get(int index) {
```

### FieldMayBeFinal
Field `typeSection` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedDexFile.java`
#### Snippet
```java
    }

    private OptionalIndexedSection<String> typeSection = new OptionalIndexedSection<String>() {
        @Override
        public String get(int index) {
```

### FieldMayBeFinal
Field `fieldSection` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedDexFile.java`
#### Snippet
```java
    }

    private IndexedSection<DexBackedFieldReference> fieldSection = new IndexedSection<DexBackedFieldReference>() {
        @Override
        public DexBackedFieldReference get(int index) {
```

### FieldMayBeFinal
Field `callSiteSection` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedDexFile.java`
#### Snippet
```java
    }

    private IndexedSection<DexBackedCallSiteReference> callSiteSection =
            new IndexedSection<DexBackedCallSiteReference>() {
                @Override
```

### FieldMayBeFinal
Field `methodSection` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedDexFile.java`
#### Snippet
```java
    }

    private IndexedSection<DexBackedMethodReference> methodSection = new IndexedSection<DexBackedMethodReference>() {
        @Override
        public DexBackedMethodReference get(int index) {
```

### FieldMayBeFinal
Field `protoSection` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedDexFile.java`
#### Snippet
```java
    }

    private IndexedSection<DexBackedMethodProtoReference> protoSection =
            new IndexedSection<DexBackedMethodProtoReference>() {
                @Override
```

### FieldMayBeFinal
Field `stringSection` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedDexFile.java`
#### Snippet
```java
    }

    private OptionalIndexedSection<String> stringSection = new OptionalIndexedSection<String>() {
        @Override
        public String get(int index) {
```

### FieldMayBeFinal
Field `reader` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/VariableSizeListIterator.java`
#### Snippet
```java

public abstract class VariableSizeListIterator<T> implements ListIterator<T> {
    @Nonnull private DexReader<? extends DexBuffer> reader;
    protected final int size;
    private final int startOffset;
```

### FieldMayBeFinal
Field `dexFile` may be 'final'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/HeaderItem.java`
#### Snippet
```java
    public static final int DATA_START_OFFSET = 108;

    @Nonnull private DexBackedDexFile dexFile;

    public HeaderItem(@Nonnull DexBackedDexFile dexFile) {
```

### FieldMayBeFinal
Field `inputList` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListDexCommand.java`
#### Snippet
```java
    @Parameter(description = "An apk or oat file.")
    @ExtendedParameter(argumentNames = "file")
    private List<String> inputList = Lists.newArrayList();

    public ListDexCommand(@Nonnull List<JCommander> commandAncestors) {
```

### FieldMayBeFinal
Field `inputList` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListDependenciesCommand.java`
#### Snippet
```java
    @Parameter(description = "An oat/odex file")
    @ExtendedParameter(argumentNames = "file")
    private List<String> inputList = Lists.newArrayList();

    public ListDependenciesCommand(@Nonnull List<JCommander> commandAncestors) {
```

### FieldMayBeFinal
Field `analysisArguments` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListFieldOffsetsCommand.java`
#### Snippet
```java

    @ParametersDelegate
    private AnalysisArguments analysisArguments = new AnalysisArguments();

    public ListFieldOffsetsCommand(@Nonnull List<JCommander> commandAncestors) {
```

### FieldMayBeFinal
Field `commands` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/HelpCommand.java`
#### Snippet
```java
    @Parameter(description = "If specified, show the detailed usage information for the given commands")
    @ExtendedParameter(argumentNames = "commands")
    private List<String> commands = Lists.newArrayList();

    public void run() {
```

### FieldMayBeFinal
Field `checkPackagePrivateArgument` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListVtablesCommand.java`
#### Snippet
```java

    @ParametersDelegate
    private CheckPackagePrivateArgument checkPackagePrivateArgument = new CheckPackagePrivateArgument();

    @Parameter(names = "--classes",
```

### FieldMayBeFinal
Field `analysisArguments` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListVtablesCommand.java`
#### Snippet
```java

    @ParametersDelegate
    private AnalysisArguments analysisArguments = new AnalysisArguments();

    @ParametersDelegate
```

### FieldMayBeFinal
Field `classes` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListVtablesCommand.java`
#### Snippet
```java
            description = "A comma separated list of classes. Only print the vtable for these classes")
    @ExtendedParameter(argumentNames = "classes")
    private List<String> classes = null;

    @Parameter(names = "--override-oat-version",
```

### FieldMayBeFinal
Field `oatVersion` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListVtablesCommand.java`
#### Snippet
```java
                    "can be used, e.g. to list vtables from a dex file, as if they were in an oat file of the given " +
                    "version.")
    private int oatVersion = 0;

    public ListVtablesCommand(@Nonnull List<JCommander> commandAncestors) {
```

### FieldMayBeFinal
Field `jobs` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
            validateWith = PositiveInteger.class)
    @ExtendedParameter(argumentNames = "n")
    private int jobs = Runtime.getRuntime().availableProcessors();

    @Parameter(names = {"-l", "--use-locals"},
```

### FieldMayBeFinal
Field `classes` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
            description = "A comma separated list of classes. Only disassemble these classes")
    @ExtendedParameter(argumentNames = "classes")
    private List<String> classes = null;

    public DisassembleCommand(@Nonnull List<JCommander> commandAncestors) {
```

### FieldMayBeFinal
Field `localsDirective` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
            description = "When disassembling, output the .locals directive with the number of non-parameter " +
                    "registers instead of the .registers directive with the total number of registers.")
    private boolean localsDirective = false;

    @Parameter(names = {"--accessor-comments", "--ac"}, arity = 1,
```

### FieldMayBeFinal
Field `parameterRegisters` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
                    "by default, use --parameter-registers=false to disable.")
    @ExtendedParameter(argumentNames = "boolean")
    private boolean parameterRegisters = true;

    @Parameter(names = {"-r", "--register-info"},
```

### FieldMayBeFinal
Field `accessorComments` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
                    "--accessor-comments=false to disable.")
    @ExtendedParameter(argumentNames = "boolean")
    private boolean accessorComments = true;

    @Parameter(names = {"--normalize-virtual-methods", "--norm", "--nvm"},
```

### FieldMayBeFinal
Field `normalizeVirtualMethods` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
            description = "Normalize virtual method references to use the base class where the method is " +
                    "originally declared.")
    private boolean normalizeVirtualMethods = false;

    @Parameter(names = {"-o", "--output"},
```

### FieldMayBeFinal
Field `codeOffsets` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
    @Parameter(names = {"--code-offsets", "--offsets", "--off"},
            description = "Add a comment before each instruction with it's code offset within the method.")
    private boolean codeOffsets = false;

    @Parameter(names = {"--resolve-resources", "--rr"}, arity = 2,
```

### FieldMayBeFinal
Field `sequentialLabels` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
            description = "Create label names using a sequential numbering scheme per label type, rather than " +
                    "using the bytecode address.")
    private boolean sequentialLabels = false;

    @Parameter(names = {"--implicit-references", "--implicit", "--ir"},
```

### FieldMayBeFinal
Field `outputDir` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
            description = "The directory to write the disassembled files to.")
    @ExtendedParameter(argumentNames = "dir")
    private String outputDir = "out";

    @Parameter(names = {"--parameter-registers", "--preg", "--pr"}, arity = 1,
```

### FieldMayBeFinal
Field `allowOdex` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
    @Parameter(names = "--allow-odex-opcodes",
            description = "Allows odex opcodes to be disassembled, even if the result won't be able to be reassembled.")
    private boolean allowOdex = false;

    @Parameter(names = "--classes",
```

### FieldMayBeFinal
Field `registerInfoTypes` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
                    "FULLMERGE. See \"baksmali help register-info\" for more information.")
    @ExtendedParameter(argumentNames = "register info specifier")
    private List<String> registerInfoTypes = Lists.newArrayList();

    @Parameter(names = {"--sequential-labels", "--seq", "--sl"},
```

### FieldMayBeFinal
Field `debugInfo` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
                    "by default, use --debug-info=false to disable.")
    @ExtendedParameter(argumentNames = "boolean")
    private boolean debugInfo = true;

    @Parameter(names = {"--code-offsets", "--offsets", "--off"},
```

### FieldMayBeFinal
Field `resourceIdFiles` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
                    "multiple times to provide resources from multiple packages.")
    @ExtendedParameter(argumentNames = {"resource prefix", "public.xml file"})
    private List<String> resourceIdFiles = Lists.newArrayList();

    @Parameter(names = {"-j", "--jobs"},
```

### FieldMayBeFinal
Field `implicitReferences` may be 'final'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
            description = "Use implicit method and field references (without the class name) for methods and " +
                    "fields from the current class.")
    private boolean implicitReferences = false;

    @Parameter(names = "--allow-odex-opcodes",
```

### FieldMayBeFinal
Field `odexedInstruction` may be 'final'
in `third_party/smali/src/main/java/com/android/tools/smali/smali/OdexedInstructionException.java`
#### Snippet
```java

public class OdexedInstructionException extends RecognitionException {
    private String odexedInstruction;

    OdexedInstructionException(IntStream input, String odexedInstruction) {
```

### FieldMayBeFinal
Field `errorMessage` may be 'final'
in `third_party/smali/src/main/java/com/android/tools/smali/smali/SemanticException.java`
#### Snippet
```java

public class SemanticException extends RecognitionException {
    private String errorMessage;


```

### FieldMayBeFinal
Field `endTryAddress` may be 'final'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/EndTryLabelMethodItem.java`
#### Snippet
```java

public class EndTryLabelMethodItem extends LabelMethodItem {
    private int endTryAddress;

    public EndTryLabelMethodItem(@Nonnull BaksmaliOptions options, int codeAddress, int endTryAddress) {
```

### FieldMayBeFinal
Field `top` may be 'final'
in `third_party/util/src/main/java/com/android/tools/smali/util/ClassFileNameHandler.java`
#### Snippet
```java
    private int forcedCaseSensitivity = NO_VALUE;

    private DirectoryEntry top;
    private String fileExtension;
    private boolean modifyWindowsReservedFilenames;
```

### FieldMayBeFinal
Field `reservedFileNameRegex` may be 'final'
in `third_party/util/src/main/java/com/android/tools/smali/util/ClassFileNameHandler.java`
#### Snippet
```java
    }

    private static Pattern reservedFileNameRegex = Pattern.compile("^(CON|PRN|AUX|NUL|COM[1-9]|LPT[1-9])(\\..*)?$",
            Pattern.CASE_INSENSITIVE);
    private static boolean isReservedFileName(String className) {
```

### FieldMayBeFinal
Field `fileExtension` may be 'final'
in `third_party/util/src/main/java/com/android/tools/smali/util/ClassFileNameHandler.java`
#### Snippet
```java

    private DirectoryEntry top;
    private String fileExtension;
    private boolean modifyWindowsReservedFilenames;

```

### FieldMayBeFinal
Field `modifyWindowsReservedFilenames` may be 'final'
in `third_party/util/src/main/java/com/android/tools/smali/util/ClassFileNameHandler.java`
#### Snippet
```java
    private DirectoryEntry top;
    private String fileExtension;
    private boolean modifyWindowsReservedFilenames;

    public ClassFileNameHandler(File path, String fileExtension) {
```

### FieldMayBeFinal
Field `specialDoubleRegex` may be 'final'
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LiteralTools.java`
#### Snippet
```java
    }

    private static Pattern specialDoubleRegex = Pattern.compile("((-)?infinityd?)|(nand?)", Pattern.CASE_INSENSITIVE);
    public static double parseDouble(String doubleString) {
        Matcher m = specialDoubleRegex.matcher(doubleString);
```

### FieldMayBeFinal
Field `specialFloatRegex` may be 'final'
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LiteralTools.java`
#### Snippet
```java
    }

    private static Pattern specialFloatRegex = Pattern.compile("((-)?infinityf)|(nanf)", Pattern.CASE_INSENSITIVE);
    public static float parseFloat(String floatString) {
        Matcher m = specialFloatRegex.matcher(floatString);
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java

        for (LabelMethodItem labelMethodItem: labelCache.getLabels()) {
            methodItems.add(labelMethodItem);
        }

```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcodes.java`
#### Snippet
```java

        for (Opcode opcode: Opcode.values()) {
            RangeMap<Integer, Short> versionToValueMap;

            if (isArt()) {
```

### UnstableApiUsage
'get(K)' is declared in unstable interface 'com.google.common.collect.RangeMap' marked with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcodes.java`
#### Snippet
```java
            }

            Short opcodeValue = versionToValueMap.get(version);
            if (opcodeValue != null) {
                if (!opcode.format.isPayloadFormat) {
```

### UnstableApiUsage
'readFully(java.io.InputStream, byte\[\])' is marked unstable with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/DexUtil.java`
#### Snippet
```java
        byte[] partialHeader = new byte[44];
        try {
            ByteStreams.readFully(inputStream, partialHeader);
        } catch (EOFException ex) {
            throw new NotADexFile("File is too short");
```

### UnstableApiUsage
'readFully(java.io.InputStream, byte\[\])' is marked unstable with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/DexUtil.java`
#### Snippet
```java
        byte[] partialHeader = new byte[8];
        try {
            ByteStreams.readFully(inputStream, partialHeader);
        } catch (EOFException ex) {
            throw new NotAnOdexFile("File is too short");
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap' is marked unstable with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
    Opcode(List<VersionConstraint> versionConstraints, String opcodeName, int referenceType, int referenceType2,
           Format format, int flags) {
        ImmutableRangeMap.Builder<Integer, Short> apiToValueBuilder = ImmutableRangeMap.builder();
        ImmutableRangeMap.Builder<Integer, Short> artVersionToValueBuilder = ImmutableRangeMap.builder();

```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap.Builder' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
    Opcode(List<VersionConstraint> versionConstraints, String opcodeName, int referenceType, int referenceType2,
           Format format, int flags) {
        ImmutableRangeMap.Builder<Integer, Short> apiToValueBuilder = ImmutableRangeMap.builder();
        ImmutableRangeMap.Builder<Integer, Short> artVersionToValueBuilder = ImmutableRangeMap.builder();

```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap' is marked unstable with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
    Opcode(List<VersionConstraint> versionConstraints, String opcodeName, int referenceType, int referenceType2,
           Format format, int flags) {
        ImmutableRangeMap.Builder<Integer, Short> apiToValueBuilder = ImmutableRangeMap.builder();
        ImmutableRangeMap.Builder<Integer, Short> artVersionToValueBuilder = ImmutableRangeMap.builder();

```

### UnstableApiUsage
'builder()' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
    Opcode(List<VersionConstraint> versionConstraints, String opcodeName, int referenceType, int referenceType2,
           Format format, int flags) {
        ImmutableRangeMap.Builder<Integer, Short> apiToValueBuilder = ImmutableRangeMap.builder();
        ImmutableRangeMap.Builder<Integer, Short> artVersionToValueBuilder = ImmutableRangeMap.builder();

```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap' is marked unstable with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
           Format format, int flags) {
        ImmutableRangeMap.Builder<Integer, Short> apiToValueBuilder = ImmutableRangeMap.builder();
        ImmutableRangeMap.Builder<Integer, Short> artVersionToValueBuilder = ImmutableRangeMap.builder();

        for (VersionConstraint versionConstraint : versionConstraints) {
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap.Builder' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
           Format format, int flags) {
        ImmutableRangeMap.Builder<Integer, Short> apiToValueBuilder = ImmutableRangeMap.builder();
        ImmutableRangeMap.Builder<Integer, Short> artVersionToValueBuilder = ImmutableRangeMap.builder();

        for (VersionConstraint versionConstraint : versionConstraints) {
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeMap' is marked unstable with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
           Format format, int flags) {
        ImmutableRangeMap.Builder<Integer, Short> apiToValueBuilder = ImmutableRangeMap.builder();
        ImmutableRangeMap.Builder<Integer, Short> artVersionToValueBuilder = ImmutableRangeMap.builder();

        for (VersionConstraint versionConstraint : versionConstraints) {
```

### UnstableApiUsage
'builder()' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
           Format format, int flags) {
        ImmutableRangeMap.Builder<Integer, Short> apiToValueBuilder = ImmutableRangeMap.builder();
        ImmutableRangeMap.Builder<Integer, Short> artVersionToValueBuilder = ImmutableRangeMap.builder();

        for (VersionConstraint versionConstraint : versionConstraints) {
```

### UnstableApiUsage
'put(com.google.common.collect.Range, V)' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
        for (VersionConstraint versionConstraint : versionConstraints) {
            if (!versionConstraint.apiRange.isEmpty()) {
                apiToValueBuilder.put(versionConstraint.apiRange, (short)versionConstraint.opcodeValue);
            }
            if (!versionConstraint.artVersionRange.isEmpty()) {
```

### UnstableApiUsage
'put(com.google.common.collect.Range, V)' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
            }
            if (!versionConstraint.artVersionRange.isEmpty()) {
                artVersionToValueBuilder.put(versionConstraint.artVersionRange, (short)versionConstraint.opcodeValue);
            }
        }
```

### UnstableApiUsage
'build()' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
        }

        this.apiToValueMap = apiToValueBuilder.build();
        this.artVersionToValueMap = artVersionToValueBuilder.build();
        this.name = opcodeName;
```

### UnstableApiUsage
'build()' is declared in unstable class 'com.google.common.collect.ImmutableRangeMap' marked with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java

        this.apiToValueMap = apiToValueBuilder.build();
        this.artVersionToValueMap = artVersionToValueBuilder.build();
        this.name = opcodeName;
        this.referenceType = referenceType;
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
    // the apis in minApis are guaranteed to be
    public final RangeMap<Integer, Short> apiToValueMap;
    public final RangeMap<Integer, Short> artVersionToValueMap;

    public final String name;
```

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
    // values and minApis provide a mapping of api -> bytecode value.
    // the apis in minApis are guaranteed to be
    public final RangeMap<Integer, Short> apiToValueMap;
    public final RangeMap<Integer, Short> artVersionToValueMap;

```

### UnstableApiUsage
'mergeSorted(java.lang.Iterable\>, java.util.Comparator)' is marked unstable with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/PoolClassDef.java`
#### Snippet
```java
        return new AbstractCollection<Field>() {
            @Nonnull @Override public Iterator<Field> iterator() {
                return Iterators.mergeSorted(
                        ImmutableList.of(staticFields.iterator(), instanceFields.iterator()),
                        Ordering.natural());
```

### UnstableApiUsage
'mergeSorted(java.lang.Iterable\>, java.util.Comparator)' is marked unstable with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/PoolClassDef.java`
#### Snippet
```java
        return new AbstractCollection<PoolMethod>() {
            @Nonnull @Override public Iterator<PoolMethod> iterator() {
                return Iterators.mergeSorted(
                        ImmutableList.of(directMethods.iterator(), virtualMethods.iterator()),
                        Ordering.natural());
```

### UnstableApiUsage
'mergeSorted(java.lang.Iterable\>, java.util.Comparator)' is marked unstable with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassDef.java`
#### Snippet
```java
        return new AbstractCollection<BuilderField>() {
            @Nonnull @Override public Iterator<BuilderField> iterator() {
                return Iterators.mergeSorted(
                        ImmutableList.of(staticFields.iterator(), instanceFields.iterator()),
                        Ordering.natural());
```

### UnstableApiUsage
'mergeSorted(java.lang.Iterable\>, java.util.Comparator)' is marked unstable with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassDef.java`
#### Snippet
```java
        return new AbstractCollection<BuilderMethod>() {
            @Nonnull @Override public Iterator<BuilderMethod> iterator() {
                return Iterators.mergeSorted(
                        ImmutableList.of(directMethods.iterator(), virtualMethods.iterator()),
                        Ordering.natural());
```

### UnstableApiUsage
'readFully(java.io.InputStream, byte\[\])' is marked unstable with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedOdexFile.java`
#### Snippet
```java
        is.reset();
        byte[] odexBuf = new byte[OdexHeaderItem.ITEM_SIZE];
        ByteStreams.readFully(is, odexBuf);
        int dexOffset = OdexHeaderItem.getDexOffset(odexBuf);
        if (dexOffset > OdexHeaderItem.ITEM_SIZE) {
```

### UnstableApiUsage
'skipFully(java.io.InputStream, long)' is marked unstable with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedOdexFile.java`
#### Snippet
```java
        int dexOffset = OdexHeaderItem.getDexOffset(odexBuf);
        if (dexOffset > OdexHeaderItem.ITEM_SIZE) {
            ByteStreams.skipFully(is, dexOffset - OdexHeaderItem.ITEM_SIZE);
        }

```

### UnstableApiUsage
'readFully(java.io.InputStream, byte\[\])' is marked unstable with @Beta
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/OatFile.java`
#### Snippet
```java
        byte[] partialHeader = new byte[4];
        try {
            ByteStreams.readFully(is, partialHeader);
        } catch (EOFException ex) {
            throw new NotAnOatFileException();
```

## RuleId[id=OverwrittenKey]
### OverwrittenKey
Overwritten array element
in `dexlib2/src/main/java/com/android/tools/smali/util/Utf8Utils.java`
#### Snippet
```java

        if (readLength != null && readLength.length > 0) {
            readLength[0] = at - start;
            readLength[0] = at - start;
        }
```

### OverwrittenKey
Overwritten array element
in `dexlib2/src/main/java/com/android/tools/smali/util/Utf8Utils.java`
#### Snippet
```java
        if (readLength != null && readLength.length > 0) {
            readLength[0] = at - start;
            readLength[0] = at - start;
        }
        return new String(chars, 0, outAt);
```

