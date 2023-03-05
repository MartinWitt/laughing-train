# smali 
 
# Bad smells
I found 1244 bad smells with 165 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 430 | false |
| SystemOutErr | 102 | false |
| AssignmentToMethodParameter | 88 | false |
| RedundantFieldInitialization | 68 | false |
| SizeReplaceableByIsEmpty | 61 | true |
| UtilityClassWithoutPrivateConstructor | 57 | true |
| DuplicateBranchesInSwitch | 43 | false |
| DataFlowIssue | 41 | false |
| BoundedWildcard | 32 | false |
| UnstableApiUsage | 25 | false |
| StaticPseudoFunctionalStyleMethod | 23 | false |
| NonProtectedConstructorInAbstractClass | 22 | true |
| Convert2Lambda | 18 | false |
| UnnecessaryModifier | 16 | true |
| RedundantStringFormatCall | 14 | false |
| CStyleArrayDeclaration | 9 | false |
| RedundantImplements | 8 | false |
| ExceptionNameDoesntEndWithException | 8 | false |
| CharsetObjectCanBeUsed | 8 | false |
| AbstractClassNeverImplemented | 7 | false |
| MissortedModifiers | 7 | false |
| MismatchedCollectionQueryUpdate | 7 | false |
| CastConflictsWithInstanceof | 7 | false |
| ConstantValue | 7 | false |
| ConditionCoveredByFurtherCondition | 7 | false |
| ReturnNull | 7 | false |
| IgnoreResultOfCall | 6 | false |
| ReplaceAssignmentWithOperatorAssignment | 5 | false |
| ZeroLengthArrayInitialization | 5 | false |
| UnnecessaryCallToStringValueOf | 5 | false |
| CatchMayIgnoreException | 5 | false |
| EnumSwitchStatementWhichMissesCases | 4 | false |
| NonShortCircuitBoolean | 4 | false |
| NonFinalFieldOfException | 4 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 4 | false |
| UnnecessaryToStringCall | 4 | true |
| AssignmentToForLoopParameter | 4 | false |
| EmptyStatementBody | 3 | false |
| NestedAssignment | 3 | false |
| UnusedAssignment | 3 | false |
| IOResource | 3 | false |
| FieldMayBeStatic | 3 | false |
| AbstractMethodCallInConstructor | 3 | false |
| SwitchStatementWithConfusingDeclaration | 3 | false |
| NonStrictComparisonCanBeEquality | 3 | true |
| ThrowablePrintStackTrace | 3 | false |
| Anonymous2MethodRef | 3 | false |
| UseCompareMethod | 3 | false |
| ConditionalBreakInInfiniteLoop | 2 | false |
| NotNullFieldNotInitialized | 2 | false |
| UnnecessaryQualifierForThis | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| ClassNameSameAsAncestorName | 2 | false |
| IfStatementWithIdenticalBranches | 2 | false |
| StringBufferReplaceableByStringBuilder | 2 | false |
| UnstableTypeUsedInSignature | 2 | false |
| UnnecessaryBoxing | 2 | false |
| OverwrittenKey | 2 | false |
| StringEquality | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| NegativeIntConstantInLongContext | 1 | false |
| EqualsBetweenInconvertibleTypes | 1 | false |
| AnonymousHasLambdaAlternative | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| EqualsAndHashcode | 1 | false |
| PointlessBitwiseExpression | 1 | false |
| TextLabelInSwitchStatement | 1 | false |
| DuplicateThrows | 1 | false |
| MethodOverridesStaticMethod | 1 | false |
| TypeParameterHidesVisibleType | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| MismatchedJavadocCode | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| InnerClassMayBeStatic | 1 | true |
| UnnecessaryFullyQualifiedName | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (instruction.getOpcode()) { case SPARSE_SWITCH: case ...` statement on enum type 'com.android.tools.smali.dexlib2.Opcode' misses cases: 'NOP', 'MOVE', 'MOVE_FROM16', 'MOVE_16', ...
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/MutableMethodImplementation.java`
#### Snippet
```java
switch (instruction.getOpcode()) {
                    case SPARSE_SWITCH:
                    case PACKED_SWITCH: {
                        MethodLocation targetLocation =
                                ((BuilderOffsetInstruction)instruction).getTarget().getLocation();
                        BuilderInstruction targetInstruction = targetLocation.instruction;
                        if (targetInstruction == null) {
                            throw new IllegalStateException(String.format("Switch instruction at address/index " +
                                    "0x%x/%d points to the end of the method.", location.codeAddress, location.index));
                        }

                        if (targetInstruction.getOpcode() == Opcode.NOP) {
                            targetInstruction = getFirstNonNop(targetLocation.index+1);
                        }
                        if (targetInstruction == null || !(targetInstruction instanceof BuilderSwitchPayload)) {
                            throw new IllegalStateException(String.format("Switch instruction at address/index " +
                                    "0x%x/%d does not refer to a payload instruction.",
                                    location.codeAddress, location.index));
                        }
                        if ((instruction.opcode == Opcode.PACKED_SWITCH &&
                                targetInstruction.getOpcode() != Opcode.PACKED_SWITCH_PAYLOAD) ||
                            (instruction.opcode == Opcode.SPARSE_SWITCH &&
                                targetInstruction.getOpcode() != Opcode.SPARSE_SWITCH_PAYLOAD)) {
                            throw new IllegalStateException(String.format("Switch instruction at address/index " +
                                    "0x%x/%d refers to the wrong type of payload instruction.",
                                    location.codeAddress, location.index));
                        }

                        if (!payloadLocations.add(targetLocation)) {
                            throw new IllegalStateException("Multiple switch instructions refer to the same payload. " +
                                    "This is not currently supported. Please file a bug :)");
                        }

                        ((BuilderSwitchPayload)targetInstruction).referrer = location;
                        break;
                    }
                }
```

### EnumSwitchStatementWhichMissesCases
`switch (instruction.getOpcode()) { case GOTO: { ...` statement on enum type 'com.android.tools.smali.dexlib2.Opcode' misses cases: 'NOP', 'MOVE', 'MOVE_FROM16', 'MOVE_16', ...
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/MutableMethodImplementation.java`
#### Snippet
```java
switch (instruction.getOpcode()) {
                        case GOTO: {
                            int offset = ((BuilderOffsetInstruction)instruction).internalGetCodeOffset();
                            if (offset < Byte.MIN_VALUE || offset > Byte.MAX_VALUE) {
                                BuilderOffsetInstruction replacement;
                                if (offset < Short.MIN_VALUE || offset > Short.MAX_VALUE) {
                                    replacement = new BuilderInstruction30t(Opcode.GOTO_32,
                                            ((BuilderOffsetInstruction)instruction).getTarget());
                                } else {
                                    replacement = new BuilderInstruction20t(Opcode.GOTO_16,
                                            ((BuilderOffsetInstruction)instruction).getTarget());
                                }
                                replaceInstruction(location.index, replacement);
                                madeChanges = true;
                            }
                            break;
                        }
                        case GOTO_16: {
                            int offset = ((BuilderOffsetInstruction)instruction).internalGetCodeOffset();
                            if (offset < Short.MIN_VALUE || offset > Short.MAX_VALUE) {
                                BuilderOffsetInstruction replacement =  new BuilderInstruction30t(Opcode.GOTO_32,
                                            ((BuilderOffsetInstruction)instruction).getTarget());
                                replaceInstruction(location.index, replacement);
                                madeChanges = true;
                            }
                            break;
                        }
                        case SPARSE_SWITCH_PAYLOAD:
                        case PACKED_SWITCH_PAYLOAD:
                            if (((BuilderSwitchPayload)instruction).referrer == null) {
                                // if the switch payload isn't referenced, just remove it
                                removeInstruction(index);
                                index--;
                                madeChanges = true;
                                break;
                            }
                            // intentional fall-through
                        case ARRAY_PAYLOAD: {
                            if ((location.codeAddress & 0x01) != 0) {
                                int previousIndex = location.index - 1;
                                MethodLocation previousLocation = instructionList.get(previousIndex);
                                Instruction previousInstruction = previousLocation.instruction;
                                assert previousInstruction != null;
                                if (previousInstruction.getOpcode() == Opcode.NOP) {
                                    removeInstruction(previousIndex);
                                    index--;
                                } else {
                                    addInstruction(location.index, new BuilderInstruction10x(Opcode.NOP));
                                    index++;
                                }
                                madeChanges = true;
                            }
                            break;
                        }
                    }
```

### EnumSwitchStatementWhichMissesCases
`switch (opcode.format) { case Format10t: case Format20t: case Fo...` statement on enum type 'com.android.tools.smali.dexlib2.Format' misses cases: 'Format10x', 'Format11n', 'Format11x', ...
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Format/OffsetInstructionFormatMethodItem.java`
#### Snippet
```java
    private String getLabelPrefix() {
        Opcode opcode = instruction.getOpcode();
        switch (opcode.format) {
            case Format10t:
            case Format20t:
            case Format30t:
                return "goto_";
            case Format21t:
            case Format22t:
                return "cond_";
            case Format31t:
                if (opcode == Opcode.FILL_ARRAY_DATA) {
                    return "array_";
                }
                if (opcode == Opcode.PACKED_SWITCH) {
                    return "pswitch_data_";
                }
                // Opcode.SPARSE_SWITCH;
                return "sswitch_data_";
        }

        assert false;
```

### EnumSwitchStatementWhichMissesCases
`switch (instruction.getOpcode()) { case SPUT: ...` statement on enum type 'com.android.tools.smali.dexlib2.Opcode' misses cases: 'NOP', 'MOVE', 'MOVE_FROM16', 'MOVE_16', ...
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/ClassDefinition.java`
#### Snippet
```java
                if (impl != null) {
                    for (Instruction instruction: impl.getInstructions()) {
                        switch (instruction.getOpcode()) {
                            case SPUT:
                            case SPUT_BOOLEAN:
                            case SPUT_BYTE:
                            case SPUT_CHAR:
                            case SPUT_OBJECT:
                            case SPUT_SHORT:
                            case SPUT_WIDE: {
                                Instruction21c ins = (Instruction21c)instruction;
                                FieldReference fieldRef = (FieldReference)ins.getReference();
                                try {
                                    fieldRef.validateReference();
                                    if (fieldRef.getDefiningClass().equals((classDef.getType()))) {
                                        fieldsSetInStaticConstructor.add(
                                                formatter.getShortFieldDescriptor(fieldRef));
                                    }
                                } catch (Reference.InvalidReferenceException ex) {
                                    // Just ignore for now. We'll deal with it when processing the instruction
                                }
                                break;
                            }
                        }
                    }
                }
```

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
    }

    private Format(int size, boolean isPayloadFormat) {
        this.size = size;
        this.isPayloadFormat = isPayloadFormat;
```

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

### CStyleArrayDeclaration
C-style array declaration of field `_SyntheticAccessorFSM_actions`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
}

private static final byte _SyntheticAccessorFSM_actions[] = init__SyntheticAccessorFSM_actions_0();


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
C-style array declaration of field `_SyntheticAccessorFSM_key_offsets`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
}

private static final short _SyntheticAccessorFSM_key_offsets[] = init__SyntheticAccessorFSM_key_offsets_0();


```

### CStyleArrayDeclaration
C-style array declaration of field `_SyntheticAccessorFSM_trans_actions`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
}

private static final byte _SyntheticAccessorFSM_trans_actions[] = init__SyntheticAccessorFSM_trans_actions_0();


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
C-style array declaration of field `_SyntheticAccessorFSM_indicies`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
}

private static final byte _SyntheticAccessorFSM_indicies[] = init__SyntheticAccessorFSM_indicies_0();


```

### CStyleArrayDeclaration
C-style array declaration of field `_SyntheticAccessorFSM_index_offsets`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/SyntheticAccessorFSM.java`
#### Snippet
```java
}

private static final short _SyntheticAccessorFSM_index_offsets[] = init__SyntheticAccessorFSM_index_offsets_0();


```

## RuleId[id=StaticPseudoFunctionalStyleMethod]
### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/util/CharSequenceUtils.java`
#### Snippet
```java

    public static int listHashCode(List<? extends CharSequence> list) {
        return Lists.transform(list, TO_STRING).hashCode();
    }

```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/util/CharSequenceUtils.java`
#### Snippet
```java

    public static boolean listEquals(List<? extends CharSequence> list1, List<? extends CharSequence> list2) {
        return Lists.transform(list1, TO_STRING).equals(
                Lists.transform(list2, TO_STRING));
    }
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/util/CharSequenceUtils.java`
#### Snippet
```java
    public static boolean listEquals(List<? extends CharSequence> list1, List<? extends CharSequence> list2) {
        return Lists.transform(list1, TO_STRING).equals(
                Lists.transform(list2, TO_STRING));
    }
}
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/PoolClassDef.java`
#### Snippet
```java
        instanceFields = ImmutableSortedSet.copyOf(classDef.getInstanceFields());
        directMethods = ImmutableSortedSet.copyOf(
                Iterables.transform(classDef.getDirectMethods(), PoolMethod.TRANSFORM));
        virtualMethods = ImmutableSortedSet.copyOf(
                Iterables.transform(classDef.getVirtualMethods(), PoolMethod.TRANSFORM));
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/PoolClassDef.java`
#### Snippet
```java
                Iterables.transform(classDef.getDirectMethods(), PoolMethod.TRANSFORM));
        virtualMethods = ImmutableSortedSet.copyOf(
                Iterables.transform(classDef.getVirtualMethods(), PoolMethod.TRANSFORM));
    }

```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderTypeListPool.java`
#### Snippet
```java

        BuilderTypeList typeList = new BuilderTypeList(
                ImmutableList.copyOf(Iterables.transform(types, new Function<CharSequence, BuilderTypeReference>() {
                    @Nonnull @Override public BuilderTypeReference apply(CharSequence input) {
                        return dexBuilder.typeSection.internType(input.toString());
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/ClassPool.java`
#### Snippet
```java

    @Nullable @Override public Iterable<CharSequence> getParameterNames(@Nonnull PoolMethod method) {
        return Iterables.transform(method.getParameters(), new Function<MethodParameter, CharSequence>() {
            @Nullable @Override public CharSequence apply(MethodParameter input) {
                return input.getName();
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/ClassPool.java`
#### Snippet
```java
            @Nonnull final PoolMethod method) {
        final List<? extends MethodParameter> parameters = method.getParameters();
        boolean hasParameterAnnotations = Iterables.any(parameters, HAS_PARAMETER_ANNOTATIONS);

        if (hasParameterAnnotations) {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassPool.java`
#### Snippet
```java
    @Nullable @Override
    public Iterable<? extends BuilderStringReference> getParameterNames(@Nonnull BuilderMethod method) {
        return Iterables.transform(method.getParameters(), new Function<BuilderMethodParameter, BuilderStringReference>() {
            @Nullable @Override public BuilderStringReference apply(BuilderMethodParameter input) {
                return input.name;
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassPool.java`
#### Snippet
```java
            @Nonnull final BuilderMethod method) {
        final List<? extends BuilderMethodParameter> parameters = method.getParameters();
        boolean hasParameterAnnotations = Iterables.any(parameters, HAS_PARAMETER_ANNOTATIONS);

        if (hasParameterAnnotations) {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassDef.java`
#### Snippet
```java
        this.staticFields = staticFields;
        this.instanceFields = instanceFields;
        this.directMethods = ImmutableSortedSet.copyOf(Iterables.filter(methods, MethodUtil.METHOD_IS_DIRECT));
        this.virtualMethods = ImmutableSortedSet.copyOf(Iterables.filter(methods, MethodUtil.METHOD_IS_VIRTUAL));
        this.staticInitializers = staticInitializers;
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassDef.java`
#### Snippet
```java
        this.instanceFields = instanceFields;
        this.directMethods = ImmutableSortedSet.copyOf(Iterables.filter(methods, MethodUtil.METHOD_IS_DIRECT));
        this.virtualMethods = ImmutableSortedSet.copyOf(Iterables.filter(methods, MethodUtil.METHOD_IS_VIRTUAL));
        this.staticInitializers = staticInitializers;
    }
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassDef.java`
#### Snippet
```java
    @Nonnull @Override
    public List<String> getInterfaces() {
        return Lists.transform(this.interfaces, Functions.toStringFunction());
    }

```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderSparseSwitchPayload.java`
#### Snippet
```java
            this.switchElements = ImmutableList.of();
        } else {
            this.switchElements = Lists.transform(switchElements, new Function<SwitchLabelElement, BuilderSwitchElement>() {
                @Nullable @Override public BuilderSwitchElement apply(@Nullable SwitchLabelElement element) {
                    assert element != null;
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/DexBuilder.java`
#### Snippet
```java
        BuilderArrayEncodedValue internedStaticInitializers = null;
        if (fields != null) {
            staticFields = ImmutableSortedSet.copyOf(Iterables.filter(fields, FieldUtil.FIELD_IS_STATIC));
            instanceFields = ImmutableSortedSet.copyOf(Iterables.filter(fields, FieldUtil.FIELD_IS_INSTANCE));
            ArrayEncodedValue staticInitializers = StaticInitializerUtil.getStaticInitializers(staticFields);
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/DexBuilder.java`
#### Snippet
```java
        if (fields != null) {
            staticFields = ImmutableSortedSet.copyOf(Iterables.filter(fields, FieldUtil.FIELD_IS_STATIC));
            instanceFields = ImmutableSortedSet.copyOf(Iterables.filter(fields, FieldUtil.FIELD_IS_INSTANCE));
            ArrayEncodedValue staticInitializers = StaticInitializerUtil.getStaticInitializers(staticFields);
            if (staticInitializers != null) {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/MutableMethodImplementation.java`
#### Snippet
```java
        }
        return Iterables.concat(
                Iterables.transform(instructionList, new Function<MethodLocation, Iterable<? extends DebugItem>>() {
                    @Nullable @Override public Iterable<? extends DebugItem> apply(@Nullable MethodLocation input) {
                        assert input != null;
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/MethodReferenceRewriter.java`
#### Snippet
```java
        @Override @Nonnull public List<? extends CharSequence> getParameterTypes() {
            return RewriterUtils.rewriteList(rewriters.getTypeRewriter(),
                    Lists.transform(methodReference.getParameterTypes(),
                    new Function<CharSequence, String>() {
                        @Nonnull @Override public String apply(CharSequence input) {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java

    public List<Instruction> getInstructions() {
        return Lists.transform(analyzedInstructions.getValues(), new Function<AnalyzedInstruction, Instruction>() {
            @Nullable @Override public Instruction apply(@Nullable AnalyzedInstruction input) {
                if (input == null) {
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableClassDef.java`
#### Snippet
```java
        this.sourceFile = sourceFile;
        this.annotations = ImmutableAnnotation.immutableSetOf(annotations);
        this.staticFields = ImmutableField.immutableSetOf(Iterables.filter(fields, FieldUtil.FIELD_IS_STATIC));
        this.instanceFields = ImmutableField.immutableSetOf(Iterables.filter(fields, FieldUtil.FIELD_IS_INSTANCE));
        this.directMethods = ImmutableMethod.immutableSetOf(Iterables.filter(methods, MethodUtil.METHOD_IS_DIRECT));
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableClassDef.java`
#### Snippet
```java
        this.annotations = ImmutableAnnotation.immutableSetOf(annotations);
        this.staticFields = ImmutableField.immutableSetOf(Iterables.filter(fields, FieldUtil.FIELD_IS_STATIC));
        this.instanceFields = ImmutableField.immutableSetOf(Iterables.filter(fields, FieldUtil.FIELD_IS_INSTANCE));
        this.directMethods = ImmutableMethod.immutableSetOf(Iterables.filter(methods, MethodUtil.METHOD_IS_DIRECT));
        this.virtualMethods = ImmutableMethod.immutableSetOf(Iterables.filter(methods, MethodUtil.METHOD_IS_VIRTUAL));
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableClassDef.java`
#### Snippet
```java
        this.staticFields = ImmutableField.immutableSetOf(Iterables.filter(fields, FieldUtil.FIELD_IS_STATIC));
        this.instanceFields = ImmutableField.immutableSetOf(Iterables.filter(fields, FieldUtil.FIELD_IS_INSTANCE));
        this.directMethods = ImmutableMethod.immutableSetOf(Iterables.filter(methods, MethodUtil.METHOD_IS_DIRECT));
        this.virtualMethods = ImmutableMethod.immutableSetOf(Iterables.filter(methods, MethodUtil.METHOD_IS_VIRTUAL));
    }
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableClassDef.java`
#### Snippet
```java
        this.instanceFields = ImmutableField.immutableSetOf(Iterables.filter(fields, FieldUtil.FIELD_IS_INSTANCE));
        this.directMethods = ImmutableMethod.immutableSetOf(Iterables.filter(methods, MethodUtil.METHOD_IS_DIRECT));
        this.virtualMethods = ImmutableMethod.immutableSetOf(Iterables.filter(methods, MethodUtil.METHOD_IS_VIRTUAL));
    }

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

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `MethodLocation` on 'this' is unnecessary in this context
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/MethodLocation.java`
#### Snippet
```java
    @Nonnull
    public Set<BuilderDebugItem> getDebugItems() {
        return debugItems.getModifiableItems(MethodLocation.this);
    }

```

### UnnecessaryQualifierForThis
Qualifier `MethodLocation` on 'this' is unnecessary in this context
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/MethodLocation.java`
#### Snippet
```java
    @Nonnull
    public Set<Label> getLabels() {
        return labels.getModifiableItems(MethodLocation.this);
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/InstructionRewriter.java`
#### Snippet
```java
                    return instruction.getReference2();
                case ReferenceType.METHOD_PROTO:
                    return instruction.getReference2();
                default:
                    throw new IllegalArgumentException();
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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`sortedSet.size() == 0` can be replaced with 'sortedSet.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/util/ImmutableConverter.java`
#### Snippet
```java
    public SortedSet<ImmutableItem> toSortedSet(@Nonnull Comparator<? super ImmutableItem> comparator,
                                                @Nullable final SortedSet<? extends Item> sortedSet) {
        if (sortedSet == null || sortedSet.size() == 0) {
            return ImmutableSortedSet.of();
        }
```

### SizeReplaceableByIsEmpty
`partialEntries.size() == 0` can be replaced with 'partialEntries.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/DexFileFactory.java`
#### Snippet
```java
            }

            if (partialEntries.size() == 0) {
                throw new DexFileNotFoundException("Could not find a dex entry in %s matching %s",
                        filename, targetEntry);
```

### SizeReplaceableByIsEmpty
`oatDexFiles.size() == 0` can be replaced with 'oatDexFiles.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/DexFileFactory.java`
#### Snippet
```java
                List<DexBackedDexFile> oatDexFiles = oatFile.getDexFiles();

                if (oatDexFiles.size() == 0) {
                    throw new DexFileNotFoundException("Oat file %s contains no dex files", file.getName());
                }
```

### SizeReplaceableByIsEmpty
`oatDexFiles.size() == 0` can be replaced with 'oatDexFiles.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/DexFileFactory.java`
#### Snippet
```java
                List<? extends DexFile> oatDexFiles = oatFile.getDexFiles();

                if (oatDexFiles.size() == 0) {
                    throw new DexFileNotFoundException("Oat file %s contains no dex files", file.getName());
                }
```

### SizeReplaceableByIsEmpty
`nextEndpoint.pointAnnotations.size() > 0` can be replaced with '!nextEndpoint.pointAnnotations.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/AnnotatedBytes.java`
#### Snippet
```java
                                        formatAnnotation(nextKey, nextRangeAnnotation.annotation));
                    }
                    if (nextEndpoint.pointAnnotations.size() > 0) {
                        throw new ExceptionWithContext(
                                "Cannot add annotation %s, due to existing annotation %s",
```

### SizeReplaceableByIsEmpty
`types.size() > 0` can be replaced with '!types.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/TypeListPool.java`
#### Snippet
```java

    public void intern(@Nonnull Collection<? extends CharSequence> types) {
        if (types.size() > 0) {
            Key<? extends Collection<? extends CharSequence>> key = new Key<Collection<? extends CharSequence>>(types);
            Integer prev = internedItems.put(key, 0);
```

### SizeReplaceableByIsEmpty
`annotationSet.size() > 0` can be replaced with '!annotationSet.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/AnnotationSetPool.java`
#### Snippet
```java

    public void intern(@Nonnull Set<? extends Annotation> annotationSet) {
        if (annotationSet.size() > 0) {
            Integer prev = internedItems.put(annotationSet, 0);
            if (prev == null) {
```

### SizeReplaceableByIsEmpty
`key.size()==0` can be replaced with 'key.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderTypeListPool.java`
#### Snippet
```java

    @Override public int getNullableItemOffset(@Nullable BuilderTypeList key) {
        return (key==null||key.size()==0)? DexWriter.NO_OFFSET:key.offset;
    }

```

### SizeReplaceableByIsEmpty
`types.size() == 0` can be replaced with 'types.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderTypeListPool.java`
#### Snippet
```java

    @Nonnull public BuilderTypeList internTypeList(@Nullable List<? extends CharSequence> types) {
        if (types == null || types.size() == 0) {
            return BuilderTypeList.EMPTY;
        }
```

### SizeReplaceableByIsEmpty
`input.getAnnotations().size() > 0` can be replaced with '!input.getAnnotations().isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/ClassPool.java`
#### Snippet
```java
        @Override
        public boolean apply(MethodParameter input) {
            return input.getAnnotations().size() > 0;
        }
    };
```

### SizeReplaceableByIsEmpty
`annotations.size() == 0` can be replaced with 'annotations.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/ClassPool.java`
#### Snippet
```java
    @Nullable @Override public Set<? extends Annotation> getClassAnnotations(@Nonnull PoolClassDef classDef) {
        Set<? extends Annotation> annotations = classDef.getAnnotations();
        if (annotations.size() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`annotations.size() == 0` can be replaced with 'annotations.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/ClassPool.java`
#### Snippet
```java
    @Nullable @Override public Set<? extends Annotation> getMethodAnnotations(@Nonnull PoolMethod method) {
        Set<? extends Annotation> annotations = method.getAnnotations();
        if (annotations.size() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`tryBlocks.size() > 0` can be replaced with '!tryBlocks.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/ClassPool.java`
#### Snippet
```java

            List<? extends TryBlock> tryBlocks = methodImpl.getTryBlocks();
            if (!hasInstruction && tryBlocks.size() > 0) {
                throw new ExceptionWithContext("Method %s has no instructions, but has try blocks.", method);
            }
```

### SizeReplaceableByIsEmpty
`annotations.size() == 0` can be replaced with 'annotations.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/ClassPool.java`
#### Snippet
```java
    @Nullable @Override public Set<? extends Annotation> getFieldAnnotations(@Nonnull Field field) {
        Set<? extends Annotation> annotations = field.getAnnotations();
        if (annotations.size() == 0) {
            return null;
        }
```

### SizeReplaceableByIsEmpty
`input.getAnnotations().size() > 0` can be replaced with '!input.getAnnotations().isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassPool.java`
#### Snippet
```java
                @Override
                public boolean apply(BuilderMethodParameter input) {
                    return input.getAnnotations().size() > 0;
                }
            };
```

### SizeReplaceableByIsEmpty
`line.length() > 0` can be replaced with '!line.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/CustomInlineMethodResolver.java`
#### Snippet
```java

            while (line != null) {
                if (line.length() > 0) {
                    lines.add(line);
                }
```

### SizeReplaceableByIsEmpty
`stringSection.getItems().size() > 0` can be replaced with '!stringSection.getItems().isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
        numItems++;

        if (stringSection.getItems().size() > 0) {
            numItems += 2; // index and data
        }
```

### SizeReplaceableByIsEmpty
`typeSection.getItems().size() > 0` can be replaced with '!typeSection.getItems().isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
            numItems += 2; // index and data
        }
        if (typeSection.getItems().size()  > 0) {
            numItems++;
        }
```

### SizeReplaceableByIsEmpty
`protoSection.getItems().size() > 0` can be replaced with '!protoSection.getItems().isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
            numItems++;
        }
        if (protoSection.getItems().size() > 0) {
            numItems++;
        }
```

### SizeReplaceableByIsEmpty
`fieldSection.getItems().size() > 0` can be replaced with '!fieldSection.getItems().isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
            numItems++;
        }
        if (fieldSection.getItems().size() > 0) {
            numItems++;
        }
```

### SizeReplaceableByIsEmpty
`methodSection.getItems().size() > 0` can be replaced with '!methodSection.getItems().isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
            numItems++;
        }
        if (methodSection.getItems().size() > 0) {
            numItems++;
        }
```

### SizeReplaceableByIsEmpty
`callSiteSection.getItems().size() > 0` can be replaced with '!callSiteSection.getItems().isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
            numItems++;
        }
        if (callSiteSection.getItems().size() > 0) {
            numItems++;
        }
```

### SizeReplaceableByIsEmpty
`methodHandleSection.getItems().size() > 0` can be replaced with '!methodHandleSection.getItems().isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
            numItems++;
        }
        if (methodHandleSection.getItems().size() > 0) {
            numItems++;
        }
```

### SizeReplaceableByIsEmpty
`typeListSection.getItems().size() > 0` can be replaced with '!typeListSection.getItems().isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
            numItems++;
        }
        if (typeListSection.getItems().size() > 0) {
            numItems++;
        }
```

### SizeReplaceableByIsEmpty
`encodedArraySection.getItems().size() > 0` can be replaced with '!encodedArraySection.getItems().isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
            numItems++;
        }
        if (encodedArraySection.getItems().size() > 0) {
            numItems++;
        }
```

### SizeReplaceableByIsEmpty
`annotationSection.getItems().size() > 0` can be replaced with '!annotationSection.getItems().isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
            numItems++;
        }
        if (annotationSection.getItems().size() > 0) {
            numItems++;
        }
```

### SizeReplaceableByIsEmpty
`annotationSetSection.getItems().size() > 0` can be replaced with '!annotationSetSection.getItems().isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
            numItems++;
        }
        if (annotationSetSection.getItems().size() > 0 || shouldCreateEmptyAnnotationSet()) {
            numItems++;
        }
```

### SizeReplaceableByIsEmpty
`classSection.getItems().size() > 0` can be replaced with '!classSection.getItems().isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
            numItems++;
        }
        if (classSection.getItems().size() > 0) {
            numItems++;
        }
```

### SizeReplaceableByIsEmpty
`staticFields.size() > 0` can be replaced with '!staticFields.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
        Collection<? extends MethodKey> directMethods = classSection.getSortedDirectMethods(key);
        Collection<? extends MethodKey> virtualMethods = classSection.getSortedVirtualMethods(key);
        boolean classHasData = staticFields.size() > 0 ||
                instanceFields.size() > 0 ||
                directMethods.size() > 0 ||
```

### SizeReplaceableByIsEmpty
`instanceFields.size() > 0` can be replaced with '!instanceFields.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
        Collection<? extends MethodKey> virtualMethods = classSection.getSortedVirtualMethods(key);
        boolean classHasData = staticFields.size() > 0 ||
                instanceFields.size() > 0 ||
                directMethods.size() > 0 ||
                virtualMethods.size() > 0;
```

### SizeReplaceableByIsEmpty
`directMethods.size() > 0` can be replaced with '!directMethods.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
        boolean classHasData = staticFields.size() > 0 ||
                instanceFields.size() > 0 ||
                directMethods.size() > 0 ||
                virtualMethods.size() > 0;

```

### SizeReplaceableByIsEmpty
`virtualMethods.size() > 0` can be replaced with '!virtualMethods.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
                instanceFields.size() > 0 ||
                directMethods.size() > 0 ||
                virtualMethods.size() > 0;

        if (classHasData) {
```

### SizeReplaceableByIsEmpty
`tryBlocks.size() > 0` can be replaced with '!tryBlocks.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
            }

            if (tryBlocks.size() > 0) {
                writer.align();

```

### SizeReplaceableByIsEmpty
`tryBlock.getExceptionHandlers().size() == 0` can be replaced with 'tryBlock.getExceptionHandlers().isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
                    writer.writeUshort(tbCodeUnitCount);

                    if (tryBlock.getExceptionHandlers().size() == 0) {
                        throw new ExceptionWithContext("No exception handlers for the try block!");
                    }
```

### SizeReplaceableByIsEmpty
`annotationSetSection.getAnnotations(annotationSetKey).size() > 0` can be replaced with '!annotationSetSection.getAnnotations(annotationSetKey).isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
                        writer.writeInt(parameterAnnotations.size());
                        for (AnnotationSetKey annotationSetKey: parameterAnnotations) {
                            if (annotationSetSection.getAnnotations(annotationSetKey).size() > 0) {
                                writer.writeInt(annotationSetSection.getItemOffset(annotationSetKey));
                            } else if (shouldCreateEmptyAnnotationSet()) {
```

### SizeReplaceableByIsEmpty
`switchElements.size() == 0` can be replaced with 'switchElements.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/MutableMethodImplementation.java`
#### Snippet
```java
                                                                     @Nonnull PackedSwitchPayload instruction) {
        List<? extends SwitchElement> switchElements = instruction.getSwitchElements();
        if (switchElements.size() == 0) {
            return new BuilderPackedSwitchPayload(0, null);
        }
```

### SizeReplaceableByIsEmpty
`switchElements.size() == 0` can be replaced with 'switchElements.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/MutableMethodImplementation.java`
#### Snippet
```java
                                                                     @Nonnull SparseSwitchPayload instruction) {
        List<? extends SwitchElement> switchElements = instruction.getSwitchElements();
        if (switchElements.size() == 0) {
            return new BuilderSparseSwitchPayload(null);
        }
```

### SizeReplaceableByIsEmpty
`value.length() > 0` can be replaced with '!value.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/TypeRewriter.java`
#### Snippet
```java
public class TypeRewriter implements Rewriter<String> {
    @Nonnull @Override public String rewrite(@Nonnull String value) {
        if (value.length() > 0 && value.charAt(0) == '[') {
            int dimensions = 0;
            while (value.charAt(dimensions) == '[') {
```

### SizeReplaceableByIsEmpty
`predecessors.size() == 0` can be replaced with 'predecessors.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/AnalyzedInstruction.java`
#### Snippet
```java
        //if this instruction has no predecessors, it is either the fake "StartOfMethod" instruction or it is an
        //unreachable instruction.
        if (predecessors.size() == 0) {
            return false;
        }
```

### SizeReplaceableByIsEmpty
`elements.size() == 0` can be replaced with 'elements.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
            List<? extends SwitchElement> elements = instruction.getSwitchElements();
            writer.writeUshort(elements.size());
            if (elements.size() == 0) {
                writer.writeInt(0);
            } else {
```

### SizeReplaceableByIsEmpty
`elements.size() > 0` can be replaced with '!elements.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/CodeItem.java`
#### Snippet
```java
            out.indent();
            out.annotate(2, "size = %d", elements.size());
            if (elements.size() > 0) {
                out.annotate(0, "keys:");
                out.indent();
```

### SizeReplaceableByIsEmpty
`elements.size() == 0` can be replaced with 'elements.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/CodeItem.java`
#### Snippet
```java

            out.annotate(2, "size = %d", elements.size());
            if (elements.size() == 0) {
                out.annotate(4, "first_key");
            } else {
```

### SizeReplaceableByIsEmpty
`elements.size() > 0` can be replaced with '!elements.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/CodeItem.java`
#### Snippet
```java
            out.annotate(2, "element_width = %d", elementWidth);
            out.annotate(4, "size = %d", elements.size());
            if (elements.size() > 0) {
                out.annotate(0, "elements:");
            }
```

### SizeReplaceableByIsEmpty
`elements.size() > 0` can be replaced with '!elements.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/CodeItem.java`
#### Snippet
```java
            }
            out.indent();
            if (elements.size() > 0) {
                for (int i = 0; i < elements.size(); i++) {
                    if (elementWidth == 8) {
```

### SizeReplaceableByIsEmpty
`unresolvedInterfaces.size() > 0` can be replaced with '!unresolvedInterfaces.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
                    }

                    if (unresolvedInterfaces.size() > 0) {
                        ClassProto.this.unresolvedInterfaces = unresolvedInterfaces;
                    }
```

### SizeReplaceableByIsEmpty
`unresolvedInterfaces.size() > 0` can be replaced with '!unresolvedInterfaces.isEmpty()'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
                    }

                    if (unresolvedInterfaces.size() > 0) {
                        ClassProto.this.unresolvedInterfaces = unresolvedInterfaces;
                    }
```

### SizeReplaceableByIsEmpty
`classPathDirectories.size() == 0` can be replaced with 'classPathDirectories.isEmpty()'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/AnalysisArguments.java`
#### Snippet
```java
        }

        if (classPathDirectories == null || classPathDirectories.size() == 0) {
            classPathDirectories = Lists.newArrayList(dexFileDir.getPath());
        }
```

### SizeReplaceableByIsEmpty
`bootClassPath.get(0).length() == 0` can be replaced with 'bootClassPath.get(0).isEmpty()'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/AnalysisArguments.java`
#### Snippet
```java
            // except that the oat version -> api mapping doesn't fully work yet
            resolver = new ClassPathResolver(filteredClassPathDirectories, classPath, dexEntry);
        }  else if (bootClassPath.size() == 1 && bootClassPath.get(0).length() == 0) {
            // --bootclasspath "" is a special case, denoting that no bootclasspath should be used
            resolver = new ClassPathResolver(
```

### SizeReplaceableByIsEmpty
`values.size() == 0` can be replaced with 'values.isEmpty()'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/formatter/BaksmaliWriter.java`
#### Snippet
```java
        writer.write('{');
        Collection<? extends EncodedValue> values = array.getValue();
        if (values.size() == 0) {
            writer.write('}');
            return;
```

### SizeReplaceableByIsEmpty
`sb.length() != 0` can be replaced with '!sb.isEmpty()'
in `third_party/util/src/main/java/com/android/tools/smali/util/PathUtil.java`
#### Snippet
```java
        for (int i=commonDirs; i<pathToRelativize.size(); i++) {
            if (first) {
                if (sb.length() != 0) {
                    sb.append(File.separatorChar);
                }
```

### SizeReplaceableByIsEmpty
`sb.length() == 0` can be replaced with 'sb.isEmpty()'
in `third_party/util/src/main/java/com/android/tools/smali/util/PathUtil.java`
#### Snippet
```java
        }

        if (sb.length() == 0) {
            return ".";
        }
```

### SizeReplaceableByIsEmpty
`longLiteral.length() == 0` can be replaced with 'longLiteral.isEmpty()'
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LiteralTools.java`
#### Snippet
```java
            throw new NumberFormatException("string is null");
        }
        if (longLiteral.length() == 0) {
            throw new NumberFormatException("string is blank");
        }
```

### SizeReplaceableByIsEmpty
`intLiteral.length() == 0` can be replaced with 'intLiteral.isEmpty()'
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LiteralTools.java`
#### Snippet
```java
            throw new NumberFormatException("string is null");
        }
        if (intLiteral.length() == 0) {
            throw new NumberFormatException("string is blank");
        }
```

### SizeReplaceableByIsEmpty
`byteLiteral.length() == 0` can be replaced with 'byteLiteral.isEmpty()'
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LiteralTools.java`
#### Snippet
```java
            throw new NumberFormatException("string is null");
        }
        if (byteLiteral.length() == 0) {
            throw new NumberFormatException("string is blank");
        }
```

### SizeReplaceableByIsEmpty
`shortLiteral.length() == 0` can be replaced with 'shortLiteral.isEmpty()'
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LiteralTools.java`
#### Snippet
```java
            throw new NumberFormatException("string is null");
        }
        if (shortLiteral.length() == 0) {
            throw new NumberFormatException("string is blank");
        }
```

### SizeReplaceableByIsEmpty
`annotations.size() > 0` can be replaced with '!annotations.isEmpty()'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/FieldDefinition.java`
#### Snippet
```java

        Collection<? extends Annotation> annotations = field.getAnnotations();
        if (annotations.size() > 0) {
            writer.indent(4);

```

### SizeReplaceableByIsEmpty
`interfaces.size() != 0` can be replaced with '!interfaces.isEmpty()'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/ClassDefinition.java`
#### Snippet
```java
        List<String> interfaces = classDef.getInterfaces();

        if (interfaces.size() != 0) {
            writer.write('\n');
            writer.write("# interfaces\n");
```

### SizeReplaceableByIsEmpty
`classAnnotations.size() != 0` can be replaced with '!classAnnotations.isEmpty()'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/ClassDefinition.java`
#### Snippet
```java
    private void writeAnnotations(BaksmaliWriter writer) throws IOException {
        Collection<? extends Annotation> classAnnotations = classDef.getAnnotations();
        if (classAnnotations.size() != 0) {
            writer.write("\n\n");
            writer.write("# annotations\n");
```

### SizeReplaceableByIsEmpty
`tryBlocks.size() == 0` can be replaced with 'tryBlocks.isEmpty()'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java
    private void addTries(List<MethodItem> methodItems) {
        List<? extends TryBlock<? extends ExceptionHandler>> tryBlocks = methodImpl.getTryBlocks();
        if (tryBlocks.size() == 0) {
            return;
        }
```

### SizeReplaceableByIsEmpty
`annotations.size() != 0` can be replaced with '!annotations.isEmpty()'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java
            String parameterName = parameter.getName();
            Collection<? extends Annotation> annotations = parameter.getAnnotations();
            if ((classDef.options.debugInfo && parameterName != null) || annotations.size() != 0) {
                writer.write(".param p");
                writer.writeSignedIntAsDec(registerNumber);
```

### SizeReplaceableByIsEmpty
`annotations.size() > 0` can be replaced with '!annotations.isEmpty()'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java
                writer.writeType(parameterType);
                writer.write("\n");
                if (annotations.size() > 0) {
                    writer.indent(4);
                    AnnotationFormatter.writeTo(writer, annotations);
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

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `errors |= !printTokensForSingleFile(file, options)`
in `smali/src/main/java/com/android/tools/smali/smali/Smali.java`
#### Snippet
```java
        for (final File file: filesToProcessSet) {
            try {
                errors |= !printTokensForSingleFile(file, options);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `value > 0xFFFF | value < -0x8000`
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LiteralTools.java`
#### Snippet
```java

    public static void checkShort(long value) {
        if (value > 0xFFFF | value < -0x8000) {
            throw new NumberFormatException(Long.toString(value) + " cannot fit into a short");
        }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `value > 0x0F | value < -0x08`
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LiteralTools.java`
#### Snippet
```java

    public static void checkNibble(long value) {
        if (value > 0x0F | value < -0x08) {
            throw new NumberFormatException(Long.toString(value) + " cannot fit into a nibble");
        }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `value > 0xFF | value < -0x80`
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LiteralTools.java`
#### Snippet
```java

    public static void checkByte(long value) {
        if (value > 0xFF | value < -0x80) {
            throw new NumberFormatException(Long.toString(value) + " cannot fit into a byte");
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super File`
in `smali/src/main/java/com/android/tools/smali/smali/Smali.java`
#### Snippet
```java
    }

    private static void getSmaliFilesInDir(@Nonnull File dir, @Nonnull Set<File> smaliFiles) {
        File[] files = dir.listFiles();
        if (files != null) {
```

### BoundedWildcard
Can generalize to `? extends JCommander`
in `util/src/main/java/com/android/tools/smali/util/jcommander/HelpFormatter.java`
#### Snippet
```java

    @Nonnull
    public String format(@Nonnull List<JCommander> commandHierarchy) {
        try {
            StringWriter stringWriter = new StringWriter();
```

### BoundedWildcard
Can generalize to `? super StringKey`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DebugWriter.java`
#### Snippet
```java
    private int currentLine;

    DebugWriter(@Nonnull StringSection<StringKey, ?> stringSection,
                @Nonnull TypeSection<StringKey, TypeKey, ?> typeSection,
                @Nonnull DexDataWriter writer) {
```

### BoundedWildcard
Can generalize to `? super TypeKey`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DebugWriter.java`
#### Snippet
```java

    DebugWriter(@Nonnull StringSection<StringKey, ?> stringSection,
                @Nonnull TypeSection<StringKey, TypeKey, ?> typeSection,
                @Nonnull DexDataWriter writer) {
        this.stringSection = stringSection;
```

### BoundedWildcard
Can generalize to `? super StringKey`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/EncodedValueWriter.java`
#### Snippet
```java
    public EncodedValueWriter(
            @Nonnull DexDataWriter writer,
            @Nonnull StringSection<StringKey, ?> stringSection,
            @Nonnull TypeSection<?, TypeKey, ?> typeSection,
            @Nonnull FieldSection<?, ?, FieldRefKey, ?> fieldSection,
```

### BoundedWildcard
Can generalize to `? super TypeKey`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/EncodedValueWriter.java`
#### Snippet
```java
            @Nonnull DexDataWriter writer,
            @Nonnull StringSection<StringKey, ?> stringSection,
            @Nonnull TypeSection<?, TypeKey, ?> typeSection,
            @Nonnull FieldSection<?, ?, FieldRefKey, ?> fieldSection,
            @Nonnull MethodSection<?, ?, ?, MethodRefKey, ?> methodSection,
```

### BoundedWildcard
Can generalize to `? super FieldRefKey`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/EncodedValueWriter.java`
#### Snippet
```java
            @Nonnull StringSection<StringKey, ?> stringSection,
            @Nonnull TypeSection<?, TypeKey, ?> typeSection,
            @Nonnull FieldSection<?, ?, FieldRefKey, ?> fieldSection,
            @Nonnull MethodSection<?, ?, ?, MethodRefKey, ?> methodSection,
            ProtoSection<?, ?, ProtoRefKey, ?> protoSection,
```

### BoundedWildcard
Can generalize to `? super MethodRefKey`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/EncodedValueWriter.java`
#### Snippet
```java
            @Nonnull TypeSection<?, TypeKey, ?> typeSection,
            @Nonnull FieldSection<?, ?, FieldRefKey, ?> fieldSection,
            @Nonnull MethodSection<?, ?, ?, MethodRefKey, ?> methodSection,
            ProtoSection<?, ?, ProtoRefKey, ?> protoSection,
            MethodHandleSection<MethodHandleKey, ?, ?> methodHandleSection,
```

### BoundedWildcard
Can generalize to `? super ProtoRefKey`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/EncodedValueWriter.java`
#### Snippet
```java
            @Nonnull FieldSection<?, ?, FieldRefKey, ?> fieldSection,
            @Nonnull MethodSection<?, ?, ?, MethodRefKey, ?> methodSection,
            ProtoSection<?, ?, ProtoRefKey, ?> protoSection,
            MethodHandleSection<MethodHandleKey, ?, ?> methodHandleSection,
            @Nonnull AnnotationSection<StringKey, TypeKey, ?, AnnotationElement, EncodedValue> annotationSection) {
```

### BoundedWildcard
Can generalize to `? super MethodHandleKey`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/EncodedValueWriter.java`
#### Snippet
```java
            @Nonnull MethodSection<?, ?, ?, MethodRefKey, ?> methodSection,
            ProtoSection<?, ?, ProtoRefKey, ?> protoSection,
            MethodHandleSection<MethodHandleKey, ?, ?> methodHandleSection,
            @Nonnull AnnotationSection<StringKey, TypeKey, ?, AnnotationElement, EncodedValue> annotationSection) {
        this.writer = writer;
```

### BoundedWildcard
Can generalize to `? extends StringKey`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/EncodedValueWriter.java`
#### Snippet
```java
            ProtoSection<?, ?, ProtoRefKey, ?> protoSection,
            MethodHandleSection<MethodHandleKey, ?, ?> methodHandleSection,
            @Nonnull AnnotationSection<StringKey, TypeKey, ?, AnnotationElement, EncodedValue> annotationSection) {
        this.writer = writer;
        this.stringSection = stringSection;
```

### BoundedWildcard
Can generalize to `? super AnnotationElement`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/EncodedValueWriter.java`
#### Snippet
```java
            ProtoSection<?, ?, ProtoRefKey, ?> protoSection,
            MethodHandleSection<MethodHandleKey, ?, ?> methodHandleSection,
            @Nonnull AnnotationSection<StringKey, TypeKey, ?, AnnotationElement, EncodedValue> annotationSection) {
        this.writer = writer;
        this.stringSection = stringSection;
```

### BoundedWildcard
Can generalize to `? extends EncodedValue`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/EncodedValueWriter.java`
#### Snippet
```java
            ProtoSection<?, ?, ProtoRefKey, ?> protoSection,
            MethodHandleSection<MethodHandleKey, ?, ?> methodHandleSection,
            @Nonnull AnnotationSection<StringKey, TypeKey, ?, AnnotationElement, EncodedValue> annotationSection) {
        this.writer = writer;
        this.stringSection = stringSection;
```

### BoundedWildcard
Can generalize to `? super CharSequence`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/ClassPool.java`
#### Snippet
```java
    }

    @Override public void writeDebugItem(@Nonnull DebugWriter<CharSequence, CharSequence> writer,
                                         DebugItem debugItem) throws IOException {
        switch (debugItem.getDebugItemType()) {
```

### BoundedWildcard
Can generalize to `? super CharSequence`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/ClassPool.java`
#### Snippet
```java
    }

    @Override public void writeDebugItem(@Nonnull DebugWriter<CharSequence, CharSequence> writer,
                                         DebugItem debugItem) throws IOException {
        switch (debugItem.getDebugItemType()) {
```

### BoundedWildcard
Can generalize to `? super BuilderStringReference`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassPool.java`
#### Snippet
```java

    @Override
    public void writeDebugItem(@Nonnull DebugWriter<BuilderStringReference, BuilderTypeReference> writer,
                               DebugItem debugItem) throws IOException {
        switch (debugItem.getDebugItemType()) {
```

### BoundedWildcard
Can generalize to `? super BuilderTypeReference`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassPool.java`
#### Snippet
```java

    @Override
    public void writeDebugItem(@Nonnull DebugWriter<BuilderStringReference, BuilderTypeReference> writer,
                               DebugItem debugItem) throws IOException {
        switch (debugItem.getDebugItemType()) {
```

### BoundedWildcard
Can generalize to `? extends ClassProvider`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassPath.java`
#### Snippet
```java
     *                       order
     */
    public ClassPath(Iterable<ClassProvider> classProviders) throws IOException {
        this(classProviders, false, NOT_ART);
    }
```

### BoundedWildcard
Can generalize to `? super StringRef`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
    InstructionWriter(@Nonnull Opcodes opcodes,
                      @Nonnull DexDataWriter writer,
                      @Nonnull StringSection<?, StringRef> stringSection,
                      @Nonnull TypeSection<?, ?, TypeRef> typeSection,
                      @Nonnull FieldSection<?, ?, FieldRefKey, ?> fieldSection,
```

### BoundedWildcard
Can generalize to `? super TypeRef`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
                      @Nonnull DexDataWriter writer,
                      @Nonnull StringSection<?, StringRef> stringSection,
                      @Nonnull TypeSection<?, ?, TypeRef> typeSection,
                      @Nonnull FieldSection<?, ?, FieldRefKey, ?> fieldSection,
                      @Nonnull MethodSection<?, ?, ?, MethodRefKey, ?> methodSection,
```

### BoundedWildcard
Can generalize to `? super FieldRefKey`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
                      @Nonnull StringSection<?, StringRef> stringSection,
                      @Nonnull TypeSection<?, ?, TypeRef> typeSection,
                      @Nonnull FieldSection<?, ?, FieldRefKey, ?> fieldSection,
                      @Nonnull MethodSection<?, ?, ?, MethodRefKey, ?> methodSection,
                      @Nonnull ProtoSection<?, ?, ProtoRefKey, ?> protoSection,
```

### BoundedWildcard
Can generalize to `? super MethodRefKey`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
                      @Nonnull TypeSection<?, ?, TypeRef> typeSection,
                      @Nonnull FieldSection<?, ?, FieldRefKey, ?> fieldSection,
                      @Nonnull MethodSection<?, ?, ?, MethodRefKey, ?> methodSection,
                      @Nonnull ProtoSection<?, ?, ProtoRefKey, ?> protoSection,
                      @Nonnull MethodHandleSection<MethodHandleKey, ?, ?> methodHandleSection,
```

### BoundedWildcard
Can generalize to `? super ProtoRefKey`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
                      @Nonnull FieldSection<?, ?, FieldRefKey, ?> fieldSection,
                      @Nonnull MethodSection<?, ?, ?, MethodRefKey, ?> methodSection,
                      @Nonnull ProtoSection<?, ?, ProtoRefKey, ?> protoSection,
                      @Nonnull MethodHandleSection<MethodHandleKey, ?, ?> methodHandleSection,
                      @Nonnull CallSiteSection<CallSiteKey, ?> callSiteSection) {
```

### BoundedWildcard
Can generalize to `? super MethodHandleKey`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
                      @Nonnull MethodSection<?, ?, ?, MethodRefKey, ?> methodSection,
                      @Nonnull ProtoSection<?, ?, ProtoRefKey, ?> protoSection,
                      @Nonnull MethodHandleSection<MethodHandleKey, ?, ?> methodHandleSection,
                      @Nonnull CallSiteSection<CallSiteKey, ?> callSiteSection) {
        this.opcodes = opcodes;
```

### BoundedWildcard
Can generalize to `? super CallSiteKey`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
                      @Nonnull ProtoSection<?, ?, ProtoRefKey, ?> protoSection,
                      @Nonnull MethodHandleSection<MethodHandleKey, ?, ?> methodHandleSection,
                      @Nonnull CallSiteSection<CallSiteKey, ?> callSiteSection) {
        this.opcodes = opcodes;
        this.writer = writer;
```

### BoundedWildcard
Can generalize to `? super FieldGap`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
                }

                private void addFieldGap(int gapStart, int gapEnd, @Nonnull PriorityQueue<FieldGap> gaps) {
                    int offset = gapStart;

```

### BoundedWildcard
Can generalize to `? extends Method`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
    }

    private int findMethodIndexInVtableReverse(@Nonnull List<Method> vtable, MethodReference method) {
        for (int i=vtable.size() - 1; i>=0; i--) {
            Method candidate = vtable.get(i);
```

### BoundedWildcard
Can generalize to `? extends Method`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
    }

    private int findMethodIndexInVtable(@Nonnull List<Method> vtable, MethodReference method) {
        for (int i=0; i<vtable.size(); i++) {
            Method candidate = vtable.get(i);
```

### BoundedWildcard
Can generalize to `? super MethodItem`
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java
    }

    private void addDebugInfo(final List<MethodItem> methodItems) {
        for (DebugItem debugItem: methodImpl.getDebugItems()) {
            methodItems.add(DebugMethodItem.build(classDef, registerFormatter, debugItem));
```

### BoundedWildcard
Can generalize to `? super MethodItem`
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java
    }

    private void addTries(List<MethodItem> methodItems) {
        List<? extends TryBlock<? extends ExceptionHandler>> tryBlocks = methodImpl.getTryBlocks();
        if (tryBlocks.size() == 0) {
```

### BoundedWildcard
Can generalize to `? super MethodItem`
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java
    }

    private void addAnalyzedInstructionMethodItems(List<MethodItem> methodItems) {
        MethodAnalyzer methodAnalyzer = new MethodAnalyzer(classDef.options.classPath, method,
                classDef.options.inlineResolver, classDef.options.normalizeVirtualMethods);
```

### BoundedWildcard
Can generalize to `? super MethodItem`
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java
    }

    private void addInstructionMethodItems(List<MethodItem> methodItems) {
        int currentCodeAddress = 0;

```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `NibbleUtils` has no concrete subclass
in `dexlib2/src/main/java/com/android/tools/smali/util/NibbleUtils.java`
#### Snippet
```java
package com.android.tools.smali.util;

public abstract class NibbleUtils {
    /**
     * Extracts the high signed 4-bit nibble from the least significant
```

### AbstractClassNeverImplemented
Abstract class `AlignmentUtils` has no concrete subclass
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/AlignmentUtils.java`
#### Snippet
```java
package com.android.tools.smali.dexlib2.util;

public abstract class AlignmentUtils {
    public static int alignOffset(int offset, int alignment) {
        int mask = alignment - 1;
```

### AbstractClassNeverImplemented
Abstract class `BuilderEncodedValues` has no concrete subclass
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderEncodedValues.java`
#### Snippet
```java
import java.util.Set;

public abstract class BuilderEncodedValues {
    public static interface BuilderEncodedValue extends EncodedValue {
    }
```

### AbstractClassNeverImplemented
Abstract class `VariableSizeCollection` has no concrete subclass
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/VariableSizeCollection.java`
#### Snippet
```java
import java.util.AbstractCollection;

public abstract class VariableSizeCollection<T> extends AbstractCollection<T> {
    @Nonnull private final DexBuffer buffer;
    private final int offset;
```

### AbstractClassNeverImplemented
Abstract class `DexBackedReference` has no concrete subclass
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/reference/DexBackedReference.java`
#### Snippet
```java
import javax.annotation.Nonnull;

public abstract class DexBackedReference {
    public static Reference makeReference(@Nonnull DexBackedDexFile dexFile, int referenceType, int referenceIndex) {
        switch (referenceType) {
```

### AbstractClassNeverImplemented
Abstract class `DexBackedEncodedValue` has no concrete subclass
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/value/DexBackedEncodedValue.java`
#### Snippet
```java
import javax.annotation.Nonnull;

public abstract class DexBackedEncodedValue {
    @Nonnull
    public static EncodedValue readFrom(@Nonnull DexBackedDexFile dexFile, @Nonnull DexReader reader) {
```

### AbstractClassNeverImplemented
Abstract class `ANTLRLexerWithErrorInterface` has no concrete subclass
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LexerErrorInterface.java`
#### Snippet
```java
    //ANTLR doesn't provide any way to add interfaces to the lexer class directly, so this is an intermediate
    //class that implements LexerErrorInterface that we can have the ANTLR parser extend 
    public abstract static class ANTLRLexerWithErrorInterface extends Lexer implements LexerErrorInterface {
        public ANTLRLexerWithErrorInterface() {
        }
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/AccessFlags.java`
#### Snippet
```java

    //cache the array of all AccessFlags, because .values() allocates a new array for every call
    private final static AccessFlags[] allFlags;

    private static HashMap<String, AccessFlags> accessFlagsByName;
```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/LocatedItems.java`
#### Snippet
```java

                return new Iterator<T>() {
                    private @Nullable
                    T currentItem = null;

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedDexFile.java`
#### Snippet
```java
    }

    public static abstract class OptionalIndexedSection<T> extends IndexedSection<T> {
        /**
         * @param index The index of the item, or -1 for a null item.
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedDexFile.java`
#### Snippet
```java
    }

    public static abstract class IndexedSection<T> extends AbstractList<T> {
        /**
         * @param index The index of the item to get the offset for.
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
            });

    private static abstract class FieldGap implements Comparable<FieldGap> {
        public final int offset;
        public final int size;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Format/PackedSwitchMethodItem.java`
#### Snippet
```java
    }

    private static abstract class PackedSwitchTarget {
        public abstract void writeTargetTo(BaksmaliWriter writer) throws IOException;
    }
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Format/SparseSwitchMethodItem.java`
#### Snippet
```java
    }

    private static abstract class SparseSwitchTarget {
        private final int key;
        public SparseSwitchTarget(int key) {
```

## RuleId[id=NullableProblems]
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
in `dexlib2/src/main/java/com/android/tools/smali/util/ArraySortedSet.java`
#### Snippet
```java
public class ArraySortedSet<T> implements SortedSet<T> {
    @Nonnull private final Comparator<? super T> comparator;
    @Nonnull private final Object[] arr;

    private ArraySortedSet(@Nonnull Comparator<? super T> comparator, @Nonnull T[] arr) {
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
in `dexlib2/src/main/java/com/android/tools/smali/util/RandomAccessFileInputStream.java`
#### Snippet
```java
public class RandomAccessFileInputStream extends InputStream {
    private int filePosition;
    @Nonnull private final RandomAccessFile raf;

    public RandomAccessFileInputStream(@Nonnull RandomAccessFile raf, int filePosition) {
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
    public final int artVersion;
    @Nonnull private final Opcode[] opcodesByValue = new Opcode[256];
    @Nonnull private final EnumMap<Opcode, Short> opcodeValues;
    @Nonnull private final HashMap<String, Opcode> opcodesByName;

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
    @Nonnull private final StringSection<StringKey, ?> stringSection;
    @Nonnull private final TypeSection<?, TypeKey, ?> typeSection;
    @Nonnull private final FieldSection<?, ?, FieldRefKey, ?> fieldSection;
    @Nonnull private final MethodSection<?, ?, ?, MethodRefKey, ?> methodSection;
    @Nonnull private final ProtoSection<?, ?, ProtoRefKey, ?> protoSection;
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
class BuilderAnnotation extends BaseAnnotation {
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderStringPool.java`
#### Snippet
```java

class BuilderStringPool implements StringSection<BuilderStringReference, BuilderStringReference> {
    @Nonnull private final ConcurrentMap<String, BuilderStringReference> internedItems = Maps.newConcurrentMap();

    @Nonnull BuilderStringReference internString(@Nonnull String string) {
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
public class BuilderMethod extends BaseMethodReference implements Method {
    @Nonnull final BuilderMethodReference methodReference;
    @Nonnull final List<? extends BuilderMethodParameter> parameters;
    final int accessFlags;
    @Nonnull final BuilderAnnotationSet annotations;
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
    @Nonnull final List<? extends BuilderMethodParameter> parameters;
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
    final int accessFlags;
    @Nonnull final BuilderAnnotationSet annotations;
    @Nonnull final Set<HiddenApiRestriction> hiddenApiRestrictions;
    @Nullable final MethodImplementation methodImplementation;

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
    @Nonnull final BuilderTypeReference definingClass;
    @Nonnull final BuilderStringReference name;
    @Nonnull final BuilderTypeReference fieldType;
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMapEntryCollection.java`
#### Snippet
```java

    private class MapEntry implements Map.Entry<Key, Integer> {
        @Nonnull private Key key;

        @Nonnull @Override public Key getKey() {
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

        public TryBounds(@Nonnull MutableTryBlock<EH> start, @Nonnull MutableTryBlock<EH> end) {
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
    @Nonnull final BuilderTypeReference type;
    @Nullable final BuilderStringReference name;
    @Nonnull final BuilderAnnotationSet annotations;

    public BuilderMethodParameter(@Nonnull BuilderTypeReference type,
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderAnnotationSetPool.java`
#### Snippet
```java
class BuilderAnnotationSetPool extends BaseBuilderPool
        implements AnnotationSetSection<BuilderAnnotation, BuilderAnnotationSet> {
    @Nonnull private final ConcurrentMap<Set<? extends Annotation>, BuilderAnnotationSet> internedItems =
            Maps.newConcurrentMap();

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

public class BuilderField extends BaseFieldReference implements Field {
    @Nonnull final BuilderFieldReference fieldReference;
    final int accessFlags;
    @Nullable final BuilderEncodedValue initialValue;
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
    final int accessFlags;
    @Nullable final BuilderEncodedValue initialValue;
    @Nonnull final BuilderAnnotationSet annotations;
    @Nonnull Set<HiddenApiRestriction> hiddenApiRestrictions;

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

    public static class BuilderArrayEncodedValue extends BaseArrayEncodedValue implements BuilderEncodedValue {
        @Nonnull final List<? extends BuilderEncodedValue> elements;
        int offset = DexWriter.NO_OFFSET;

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
    public static class BuilderStringEncodedValue extends BaseStringEncodedValue
            implements BuilderEncodedValue {
        @Nonnull final BuilderStringReference stringReference;

        BuilderStringEncodedValue(@Nonnull BuilderStringReference stringReference) {
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
    public static class BuilderMethodTypeEncodedValue extends BaseMethodTypeEncodedValue
            implements BuilderEncodedValue {
        @Nonnull final BuilderMethodProtoReference methodProtoReference;

        public BuilderMethodTypeEncodedValue(@Nonnull BuilderMethodProtoReference methodProtoReference) {
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderEncodedArrayPool.java`
#### Snippet
```java
public class BuilderEncodedArrayPool extends BaseBuilderPool implements
    EncodedArraySection<BuilderArrayEncodedValue, BuilderEncodedValue> {
    @Nonnull private final ConcurrentMap<ArrayEncodedValue, BuilderArrayEncodedValue> internedItems =
            Maps.newConcurrentMap();

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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/BuilderInstruction.java`
#### Snippet
```java
    @Nonnull protected final Opcode opcode;

    @Nullable MethodLocation location;

    protected BuilderInstruction(@Nonnull Opcode opcode) {
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/BuilderSwitchPayload.java`
#### Snippet
```java

public abstract class BuilderSwitchPayload extends BuilderInstruction implements SwitchPayload {
    @Nullable
    MethodLocation referrer;

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
public class BuilderStartLocal extends BuilderDebugItem implements StartLocal {
    private final int register;
    @Nullable private final StringReference name;
    @Nullable private final TypeReference type;
    @Nullable private final StringReference signature;
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

public class BuilderClassDef extends BaseTypeReference implements ClassDef {
    @Nonnull final BuilderTypeReference type;
    final int accessFlags;
    @Nullable final BuilderTypeReference superclass;
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
    @Nonnull final BuilderTypeReference type;
    final int accessFlags;
    @Nullable final BuilderTypeReference superclass;
    @Nonnull final BuilderTypeList interfaces;
    @Nullable final BuilderStringReference sourceFile;
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderSparseSwitchPayload.java`
#### Snippet
```java
    public static final Opcode OPCODE = Opcode.SPARSE_SWITCH_PAYLOAD;

    @Nonnull protected final List<BuilderSwitchElement> switchElements;

    public BuilderSparseSwitchPayload(@Nullable List<? extends SwitchLabelElement> switchElements) {
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderInstruction4rcc.java`
#### Snippet
```java
    protected final int registerCount;

    @Nonnull protected final Reference reference;
    @Nonnull protected final Reference reference2;

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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderInstruction4rcc.java`
#### Snippet
```java

    @Nonnull protected final Reference reference;
    @Nonnull protected final Reference reference2;

    public BuilderInstruction4rcc(@Nonnull Opcode opcode,
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderArrayPayload.java`
#### Snippet
```java

    protected final int elementWidth;
    @Nonnull protected final List<Number> arrayElements;

    public BuilderArrayPayload(int elementWidth,
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/instruction/BuilderPackedSwitchPayload.java`
#### Snippet
```java
    public static final Opcode OPCODE = Opcode.PACKED_SWITCH_PAYLOAD;

    @Nonnull protected final List<BuilderSwitchElement> switchElements;

    public BuilderPackedSwitchPayload(final int startKey,
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassPath.java`
#### Snippet
```java
    };

    @Nonnull private LoadingCache<String, TypeProto> loadedClasses = CacheBuilder.newBuilder().build(classLoader);

    @Nonnull
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java

    private static class CodeItemOffset<MethodKey> {
        @Nonnull MethodKey method;
        int codeOffset;

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
     * The MethodAnalyzer containing this instruction
     */
    @Nonnull
    protected final MethodAnalyzer methodAnalyzer;

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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/DexFileRewriter.java`
#### Snippet
```java

    protected class RewrittenDexFile implements DexFile {
        @Nonnull protected final DexFile dexFile;

        public RewrittenDexFile(@Nonnull DexFile dexFile) {
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/MethodReferenceRewriter.java`
#### Snippet
```java

    protected class RewrittenMethodReference extends BaseMethodReference {
        @Nonnull protected MethodReference methodReference;

        public RewrittenMethodReference(@Nonnull MethodReference methodReference) {
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/MethodImplementationRewriter.java`
#### Snippet
```java

    protected class RewrittenMethodImplementation implements MethodImplementation {
        @Nonnull protected MethodImplementation methodImplementation;

        public RewrittenMethodImplementation(@Nonnull MethodImplementation methodImplementation) {
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/FieldReferenceRewriter.java`
#### Snippet
```java

public class FieldReferenceRewriter implements Rewriter<FieldReference> {
    @Nonnull protected final Rewriters rewriters;

    public FieldReferenceRewriter(@Nonnull Rewriters rewriters) {
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/DebugItemRewriter.java`
#### Snippet
```java

public class DebugItemRewriter implements Rewriter<DebugItem> {
    @Nonnull protected final Rewriters rewriters;

    public DebugItemRewriter(@Nonnull Rewriters rewriters) {
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/AnnotationRewriter.java`
#### Snippet
```java

    protected class RewrittenAnnotation extends BaseAnnotation {
        @Nonnull protected Annotation annotation;

        public RewrittenAnnotation(@Nonnull Annotation annotation) {
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

    protected class RewrittenFieldEncodedValue extends BaseFieldEncodedValue {
        @Nonnull protected FieldEncodedValue fieldEncodedValue;

        public RewrittenFieldEncodedValue(@Nonnull FieldEncodedValue fieldEncodedValue) {
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/TryBlockRewriter.java`
#### Snippet
```java

    protected class RewrittenTryBlock extends BaseTryBlock<ExceptionHandler> {
        @Nonnull protected TryBlock<? extends ExceptionHandler> tryBlock;

        public RewrittenTryBlock(@Nonnull TryBlock<? extends ExceptionHandler> tryBlock) {
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/EncodedValueRewriter.java`
#### Snippet
```java

    protected class RewrittenEnumEncodedValue extends BaseEnumEncodedValue {
        @Nonnull protected EnumEncodedValue enumEncodedValue;

        public RewrittenEnumEncodedValue(@Nonnull EnumEncodedValue enumEncodedValue) {
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/AnnotationElementRewriter.java`
#### Snippet
```java

public class AnnotationElementRewriter implements Rewriter<AnnotationElement> {
    @Nonnull protected final Rewriters rewriters;

    public AnnotationElementRewriter(@Nonnull Rewriters rewriters) {
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/MethodRewriter.java`
#### Snippet
```java

    protected class RewrittenMethod extends BaseMethodReference implements Method {
        @Nonnull protected Method method;

        public RewrittenMethod(@Nonnull Method method) {
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBuffer.java`
#### Snippet
```java

public class DexBuffer {
    @Nonnull final byte[] buf;
    final int baseOffset;

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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedAnnotationElement.java`
#### Snippet
```java
    @Nonnull private final DexBackedDexFile dexFile;
    public final int nameIndex;
    @Nonnull public final EncodedValue value;

    public DexBackedAnnotationElement(@Nonnull DexBackedDexFile dexFile, @Nonnull DexReader reader) {
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedTypedExceptionHandler.java`
#### Snippet
```java

public class DexBackedTypedExceptionHandler extends DexBackedExceptionHandler {
    @Nonnull private final DexBackedDexFile dexFile;
    private final int typeId;
    private final int handlerCodeAddress;
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexReader.java`
#### Snippet
```java

public class DexReader<T extends DexBuffer> {
    @Nonnull public final T dexBuf;
    private int offset;

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

    @Nonnull private final ClassPath classPath;
    @Nullable private final InlineMethodResolver inlineResolver;

    // This contains all the AnalyzedInstruction instances, keyed by the code unit address of the instruction
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

    // Which instructions have been analyzed, keyed by instruction index
    @Nonnull private final BitSet analyzedState;

    @Nullable private AnalysisException analysisException = null;
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
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedDexFile.java`
#### Snippet
```java
    private final DexBuffer dataBuffer;

    @Nonnull private final Opcodes opcodes;

    private final int stringCount;
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
        DexReader reader = buffer.readerAt(annotator.getCursor());
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
        CallSiteKey extends CallSiteReference> {
    @Nonnull private final Opcodes opcodes;
    @Nonnull private final DexDataWriter writer;
    @Nonnull private final StringSection<?, StringRef> stringSection;
    @Nonnull private final TypeSection<?, ?, TypeRef> typeSection;
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
    @Nonnull private final DexDataWriter writer;
    @Nonnull private final StringSection<?, StringRef> stringSection;
    @Nonnull private final TypeSection<?, ?, TypeRef> typeSection;
    @Nonnull private final FieldSection<?, ?, FieldRefKey, ?> fieldSection;
    @Nonnull private final MethodSection<?, ?, ?, MethodRefKey, ?> methodSection;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/VariableSizeLookaheadIterator.java`
#### Snippet
```java

public abstract class VariableSizeLookaheadIterator<T> extends AbstractIterator<T> implements Iterator<T> {
    @Nonnull private final DexReader reader;

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
    private final int virtualMethodCount;

    @Nullable private AnnotationsDirectory annotationsDirectory;

    public DexBackedClassDef(@Nonnull DexBackedDexFile dexFile,
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
    @Nonnull public final DexBackedDexFile dexFile;
    private final int classDefOffset;
    @Nullable private final HiddenApiRestrictionsReader hiddenApiRestrictionsReader;

    private final int staticFieldsOffset;
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
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/EncodedArrayItemIterator.java`
#### Snippet
```java

    private static class EncodedArrayItemIteratorImpl extends EncodedArrayItemIterator {
        @Nonnull private final DexReader reader;
        @Nonnull private final DexBackedDexFile dexFile;
        private final int size;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/EncodedArrayItemIterator.java`
#### Snippet
```java
    private static class EncodedArrayItemIteratorImpl extends EncodedArrayItemIterator {
        @Nonnull private final DexReader reader;
        @Nonnull private final DexBackedDexFile dexFile;
        private final int size;
        private int index = 0;
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/VariableSizeIterator.java`
#### Snippet
```java

public abstract class VariableSizeIterator<T> implements Iterator<T> {
    @Nonnull private final DexReader reader;
    protected final int size;

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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/HeaderItem.java`
#### Snippet
```java
    public static final int DATA_START_OFFSET = 108;

    @Nonnull private DexBackedDexFile dexFile;

    public HeaderItem(@Nonnull DexBackedDexFile dexFile) {
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/value/DexBackedTypeEncodedValue.java`
#### Snippet
```java

public class DexBackedTypeEncodedValue extends BaseTypeEncodedValue {
    @Nonnull public final DexBackedDexFile dexFile;
    private final int typeIndex;

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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/value/DexBackedFieldEncodedValue.java`
#### Snippet
```java

public class DexBackedFieldEncodedValue extends BaseFieldEncodedValue {
    @Nonnull public final DexBackedDexFile dexFile;
    private final int fieldIndex;

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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/value/DexBackedMethodEncodedValue.java`
#### Snippet
```java

public class DexBackedMethodEncodedValue extends BaseMethodEncodedValue {
    @Nonnull public final DexBackedDexFile dexFile;
    private final int methodIndex;

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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/reference/DexBackedStringReference.java`
#### Snippet
```java

public class DexBackedStringReference extends BaseStringReference {
    @Nonnull public final DexBackedDexFile dexFile;
    public final int stringIndex;

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
    }

    @Nonnull private final Supplier<SparseArray<FieldReference>> artInstanceFieldsSupplier =
            Suppliers.memoize(new Supplier<SparseArray<FieldReference>>() {

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


    @Nonnull private final Supplier<ClassDef> classDefSupplier = Suppliers.memoize(new Supplier<ClassDef>() {
        @Override public ClassDef get() {
            return classPath.getClassDef(type);
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
     * This calculates the interfaces in the order required for vtable generation for post-default method ART
     */
    @Nonnull
    private final Supplier<LinkedHashMap<String, ClassDef>> postDefaultMethodInterfaceSupplier =
            Suppliers.memoize(new Supplier<LinkedHashMap<String, ClassDef>>() {
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/util/DexAnnotator.java`
#### Snippet
```java

public class DexAnnotator extends AnnotatedBytes {
    @Nonnull public final DexBackedDexFile dexFile;

    private final Map<Integer, SectionAnnotator> annotators = Maps.newHashMap();
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
    protected final int accessFlags;
    @Nullable protected final ImmutableEncodedValue initialValue;
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotation> annotations;
    @Nonnull protected final ImmutableSet<HiddenApiRestriction> hiddenApiRestrictions;

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
    protected final int visibility;
    @Nonnull protected final String type;
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotationElement> elements;

    public ImmutableAnnotation(int visibility,
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
public class ImmutableStartLocal extends ImmutableDebugItem implements StartLocal {
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
public class ImmutableEndLocal extends ImmutableDebugItem implements EndLocal {
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
    protected final int register;
    @Nullable protected final String name;
    @Nullable protected final String type;
    @Nullable protected final String signature;

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

public class ImmutableMethod extends BaseMethodReference implements Method {
    @Nonnull protected final String definingClass;
    @Nonnull protected final String name;
    @Nonnull protected final ImmutableList<? extends ImmutableMethodParameter> parameters;
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
    @Nonnull protected final String definingClass;
    @Nonnull protected final String name;
    @Nonnull protected final ImmutableList<? extends ImmutableMethodParameter> parameters;
    @Nonnull protected final String returnType;
    protected final int accessFlags;
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/value/ImmutableFieldEncodedValue.java`
#### Snippet
```java

public class ImmutableFieldEncodedValue extends BaseFieldEncodedValue implements ImmutableEncodedValue {
    @Nonnull protected final ImmutableFieldReference value;

    public ImmutableFieldEncodedValue(@Nonnull ImmutableFieldReference value) {
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/value/ImmutableStringEncodedValue.java`
#### Snippet
```java

public class ImmutableStringEncodedValue extends BaseStringEncodedValue implements ImmutableEncodedValue {
    @Nonnull protected final String value;

    public ImmutableStringEncodedValue(@Nonnull String value) {
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/value/ImmutableMethodTypeEncodedValue.java`
#### Snippet
```java

public class ImmutableMethodTypeEncodedValue extends BaseMethodTypeEncodedValue implements ImmutableEncodedValue {
    @Nonnull protected final ImmutableMethodProtoReference methodProtoReference;

    public ImmutableMethodTypeEncodedValue(@Nonnull ImmutableMethodProtoReference methodProtoReference) {
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/value/ImmutableEnumEncodedValue.java`
#### Snippet
```java

public class ImmutableEnumEncodedValue extends BaseEnumEncodedValue implements ImmutableEncodedValue {
    @Nonnull protected final ImmutableFieldReference value;

    public ImmutableEnumEncodedValue(@Nonnull ImmutableFieldReference value) {
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/reference/ImmutableStringReference.java`
#### Snippet
```java

public class ImmutableStringReference extends BaseStringReference implements ImmutableReference {
    @Nonnull protected final String str;

    public ImmutableStringReference(String str) {
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
    @Nonnull protected final String methodName;
    @Nonnull protected final ImmutableMethodProtoReference methodProto;
    @Nonnull protected final ImmutableList<? extends ImmutableEncodedValue> extraArguments;

    public ImmutableCallSiteReference(@Nonnull String name, @Nonnull MethodHandleReference methodHandle,
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableInstruction22c.java`
#### Snippet
```java
    protected final int registerA;
    protected final int registerB;
    @Nonnull protected final ImmutableReference reference;

    public ImmutableInstruction22c(@Nonnull Opcode opcode,
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableClassDef.java`
#### Snippet
```java
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableField> instanceFields;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableMethod> directMethods;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableMethod> virtualMethods;

    public ImmutableClassDef(@Nonnull String type,
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
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotation> annotations;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableField> staticFields;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableField> instanceFields;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableMethod> directMethods;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableMethod> virtualMethods;
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
    @Nullable protected final String sourceFile;
    @Nonnull protected final ImmutableSet<? extends ImmutableAnnotation> annotations;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableField> staticFields;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableField> instanceFields;
    @Nonnull protected final ImmutableSortedSet<? extends ImmutableMethod> directMethods;
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableInstruction4rcc.java`
#### Snippet
```java
    protected final int registerCount;

    @Nonnull protected final ImmutableReference reference;
    @Nonnull protected final ImmutableReference reference2;

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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableInstruction45cc.java`
#### Snippet
```java
    protected final int registerG;
    @Nonnull protected final ImmutableReference reference;
    @Nonnull protected final ImmutableReference reference2;

    public ImmutableInstruction45cc(@Nonnull Opcode opcode,
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableInstruction31c.java`
#### Snippet
```java

    protected final int registerA;
    @Nonnull protected final ImmutableReference reference;

    public ImmutableInstruction31c(@Nonnull Opcode opcode,
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
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableInstruction3rc.java`
#### Snippet
```java
    protected final int registerCount;

    @Nonnull protected final ImmutableReference reference;

    public ImmutableInstruction3rc(@Nonnull Opcode opcode,
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
in `baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Debug/EndLocalMethodItem.java`
#### Snippet
```java

public class EndLocalMethodItem extends DebugMethodItem {
    @Nonnull private final EndLocal endLocal;
    @Nonnull private final RegisterFormatter registerFormatter;

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
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/formatter/BaksmaliWriter.java`
#### Snippet
```java
public class BaksmaliWriter extends DexFormattedWriter {

    @Nullable private final String classContext;

    protected final char[] buffer = new char[24];
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
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/PostInstructionRegisterInfoMethodItem.java`
#### Snippet
```java

public class PostInstructionRegisterInfoMethodItem extends MethodItem {
    @Nonnull private final RegisterFormatter registerFormatter;
    @Nonnull private final AnalyzedInstruction analyzedInstruction;

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

    @Nonnull private final SparseIntArray packedSwitchMap;
    @Nonnull private final SparseIntArray sparseSwitchMap;
    @Nonnull private final InstructionOffsetMap instructionOffsetMap;

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
    @Nonnull public final ImmutableList<Instruction> instructions;
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
    @Nonnull public final ClassDefinition classDef;
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
    public RegisterFormatter registerFormatter;

    @Nonnull private final LabelCache labelCache = new LabelCache();

    @Nonnull private final SparseIntArray packedSwitchMap;
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
    @Nonnull public final List<Instruction> effectiveInstructions;

    @Nonnull public final ImmutableList<MethodParameter> methodParameters;
    public RegisterFormatter registerFormatter;

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

## RuleId[id=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new ThreadLocal () can be replaced with ThreadLocal.withInitial()
in `dexlib2/src/main/java/com/android/tools/smali/util/Utf8Utils.java`
#### Snippet
```java

    private static final ThreadLocal<char[]> localBuffer =
            new ThreadLocal<char[]> () {
                @Override protected char[] initialValue() {
                    // A reasonably sized initial value
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

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `AnnotationElement` is the same as one of its superclass' names
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/EncodedValueWriter.java`
#### Snippet
```java

public abstract class EncodedValueWriter<StringKey, TypeKey, FieldRefKey extends FieldReference,
        MethodRefKey extends MethodReference, AnnotationElement extends com.android.tools.smali.dexlib2.iface.AnnotationElement,
        ProtoRefKey, MethodHandleKey extends MethodHandleReference, EncodedValue> {
    @Nonnull private final DexDataWriter writer;
```

### ClassNameSameAsAncestorName
Class name `AnnotationElement` is the same as one of its superclass' names
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
        EncodedArrayKey,
        EncodedValue,
        AnnotationElement extends com.android.tools.smali.dexlib2.iface.AnnotationElement,
        StringSectionType extends StringSection<StringKey, StringRef>,
        TypeSectionType extends TypeSection<StringKey, TypeKey, TypeRef>,
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

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/MapItem.java`
#### Snippet
```java
                out.annotate(4, "size = %d", mapItemCount);

                super.annotateSectionInner(out, mapItemCount);
            }
        };
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`literalShift = literalShift & 0x1f` could be simplified to 'literalShift \&= 0x1f'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
        }

        literalShift = literalShift & 0x1f;

        switch (sourceRegisterType.category) {
```

### ReplaceAssignmentWithOperatorAssignment
`value = value / 10` could be simplified to 'value /= 10'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/formatter/BaksmaliWriter.java`
#### Snippet
```java
            buffer[bufferIndex--] = (char)(digit + '0');

            value = value / 10;
        } while (value != 0);

```

### ReplaceAssignmentWithOperatorAssignment
`value = value / 10` could be simplified to 'value /= 10'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/formatter/BaksmaliWriter.java`
#### Snippet
```java
            buffer[bufferIndex--] = (char)(digit + '0');

            value = value / 10;
        } while (value != 0);

```

### ReplaceAssignmentWithOperatorAssignment
`value = value >>> 8` could be simplified to 'value \>\>\>= 8'
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LiteralTools.java`
#### Snippet
```java
        for (int i=0; value != 0; i++) {
            bytes[i] = (byte)value;
            value = value >>> 8;
        }
        return bytes;
```

### ReplaceAssignmentWithOperatorAssignment
`value = value >>> 8` could be simplified to 'value \>\>\>= 8'
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LiteralTools.java`
#### Snippet
```java
        for (int i=0; value != 0; i++) {
            bytes[i] = (byte)value;
            value = value >>> 8;
        }
        return bytes;
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/ClassPool.java`
#### Snippet
```java

            @Override public Integer setValue(Integer value) {
                return classDef.classDefIndex = value;
            }
        };
```

### NestedAssignment
Result of assignment expression used
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassPool.java`
#### Snippet
```java

            @Override public Integer setValue(Integer value) {
                return classDef.classDefIndex = value;
            }
        };
```

### NestedAssignment
Result of assignment expression used
in `third_party/util/src/main/java/com/android/tools/smali/util/ConsoleUtil.java`
#### Snippet
```java
            String line;

            while ((line = reader.readLine()) != null) {
                if (buffer == null) {
                    buffer = new StringBuffer();
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
Contents of collection `resourceIdFiles` are queried, but never updated
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
                    "multiple times to provide resources from multiple packages.")
    @ExtendedParameter(argumentNames = {"resource prefix", "public.xml file"})
    private List<String> resourceIdFiles = Lists.newArrayList();

    @Parameter(names = {"-j", "--jobs"},
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

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `file` is accessed in both synchronized and unsynchronized contexts
in `third_party/util/src/main/java/com/android/tools/smali/util/ClassFileNameHandler.java`
#### Snippet
```java

    private class DirectoryEntry extends FileSystemEntry {
        @Nullable private File file = null;
        private int caseSensitivity = forcedCaseSensitivity;

```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `smali/src/main/java/com/android/tools/smali/smali/SmaliOptions.java`
#### Snippet
```java
    public int jobs = Runtime.getRuntime().availableProcessors();
    public boolean allowOdexOpcodes = false;
    public boolean verboseErrors = false;
    public boolean printTokens = false;
}
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `smali/src/main/java/com/android/tools/smali/smali/SmaliOptions.java`
#### Snippet
```java

    public int jobs = Runtime.getRuntime().availableProcessors();
    public boolean allowOdexOpcodes = false;
    public boolean verboseErrors = false;
    public boolean printTokens = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `smali/src/main/java/com/android/tools/smali/smali/SmaliOptions.java`
#### Snippet
```java
    public boolean allowOdexOpcodes = false;
    public boolean verboseErrors = false;
    public boolean printTokens = false;
}

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `smali/src/main/java/com/android/tools/smali/smali/AssembleCommand.java`
#### Snippet
```java
    @Parameter(names = "--verbose",
            description = "Generate verbose error messages.")
    private boolean verbose = false;

    @Parameter(names = {"--allow-odex-opcodes", "--allow-odex", "--ao"},
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/util/TwoColumnOutput.java`
#### Snippet
```java
    }

    private String[] leftLines = null;
    private String[] rightLines = null;
    public void write(String left, String right) throws IOException {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/util/TwoColumnOutput.java`
#### Snippet
```java

    private String[] leftLines = null;
    private String[] rightLines = null;
    public void write(String left, String right) throws IOException {
        leftLines = StringWrapper.wrapString(left, leftWidth, leftLines);
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/util/WrappedIndentingWriter.java`
#### Snippet
```java
    private final int maxWidth;

    private int currentIndent = 0;
    private final StringBuilder line = new StringBuilder();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/util/SparseArray.java`
#### Snippet
```java
public class SparseArray<E> {
    private static final Object DELETED = new Object();
    private boolean mGarbage = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/util/StringWrapper.java`
#### Snippet
```java
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    private int currentLineStart = 0;
                    private boolean nextLineSet = false;
                    private String nextLine;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/util/StringWrapper.java`
#### Snippet
```java
                return new Iterator<String>() {
                    private int currentLineStart = 0;
                    private boolean nextLineSet = false;
                    private String nextLine;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/DexFileFactory.java`
#### Snippet
```java

        @Nullable
        private byte[] buf = null;
        private boolean loadedVdex = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/DexFileFactory.java`
#### Snippet
```java
        @Nullable
        private byte[] buf = null;
        private boolean loadedVdex = false;

        public FilenameVdexProvider(File oatFile) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/AnnotatedBytes.java`
#### Snippet
```java
        /** Annotations that are associated with a range of bytes */
        @Nullable
        public AnnotationItem rangeAnnotation = null;
    }

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/io/MemoryDataStore.java`
#### Snippet
```java
public class MemoryDataStore implements DexDataStore {
    private byte[] buf;
    private int size = 0;

    public MemoryDataStore() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/util/TryListBuilder.java`
#### Snippet
```java
    private static class MutableTryBlock<EH extends ExceptionHandler> extends BaseTryBlock<EH> {
        public MutableTryBlock<EH> prev = null;
        public MutableTryBlock<EH> next = null;

        public int startCodeAddress;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/util/TryListBuilder.java`
#### Snippet
```java

    private static class MutableTryBlock<EH extends ExceptionHandler> extends BaseTryBlock<EH> {
        public MutableTryBlock<EH> prev = null;
        public MutableTryBlock<EH> next = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/ClassPool.java`
#### Snippet
```java
    }

    private ImmutableList<PoolClassDef> sortedClasses = null;
    @Nonnull @Override public Collection<? extends PoolClassDef> getSortedClasses() {
        if (sortedClasses == null) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/LocatedItems.java`
#### Snippet
```java
                return new Iterator<T>() {
                    private @Nullable
                    T currentItem = null;

                    @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/LocatedItems.java`
#### Snippet
```java
    // the labels and debugItems lists only when they are needed
    @Nullable
    private List<T> items = null;

    @Nonnull
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassPool.java`
#### Snippet
```java
    }

    private ImmutableList<BuilderClassDef> sortedClasses = null;
    @Nonnull @Override public Collection<? extends BuilderClassDef> getSortedClasses() {
        if (sortedClasses == null) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
    protected int numDebugInfoItems = 0;
    protected int numCodeItemItems = 0;
    protected int numClassDataItems = 0;

    // The sections defined here must be kept in sync with these section arrays:
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java

    protected int numAnnotationSetRefItems = 0;
    protected int numAnnotationDirectoryItems = 0;
    protected int numDebugInfoItems = 0;
    protected int numCodeItemItems = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java

        private boolean writeRestrictionsForClass = false;
        private int pendingBlankEntries = 0;

        public RestrictionsWriter(DexDataStore dataStore, DexDataWriter offsetWriter, int numClasses)
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
    protected int numAnnotationDirectoryItems = 0;
    protected int numDebugInfoItems = 0;
    protected int numCodeItemItems = 0;
    protected int numClassDataItems = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
    protected boolean hasHiddenApiRestrictions = false;

    protected int numAnnotationSetRefItems = 0;
    protected int numAnnotationDirectoryItems = 0;
    protected int numDebugInfoItems = 0;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
    protected int mapSectionOffset = NO_OFFSET;

    protected boolean hasHiddenApiRestrictions = false;

    protected int numAnnotationSetRefItems = 0;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
        private final DexDataWriter restrictionsWriter;

        private boolean writeRestrictionsForClass = false;
        private int pendingBlankEntries = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
    protected int numAnnotationSetRefItems = 0;
    protected int numAnnotationDirectoryItems = 0;
    protected int numDebugInfoItems = 0;
    protected int numCodeItemItems = 0;
    protected int numClassDataItems = 0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/AnalyzedInstruction.java`
#### Snippet
```java
     */
    @Nullable
    protected Map<PredecessorOverrideKey, RegisterType> predecessorRegisterOverrides = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
    @Nonnull private final BitSet analyzedState;

    @Nullable private AnalysisException analysisException = null;

    // This is a dummy instruction that occurs immediately before the first real instruction. We can initialize the
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/ClassDataItem.java`
#### Snippet
```java
    public static SectionAnnotator makeAnnotator(@Nonnull DexAnnotator annotator, @Nonnull MapItem mapItem) {
        return new SectionAnnotator(annotator, mapItem) {
            private SectionAnnotator codeItemAnnotator = null;

            @Override public void annotateSection(@Nonnull AnnotatedBytes out) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/OatFile.java`
#### Snippet
```java

    private class DexEntryIterator implements Iterator<OatDexEntry> {
        int index = 0;
        int offset = oatHeader.getDexListStart();

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/ClassDefItem.java`
#### Snippet
```java
    public static SectionAnnotator makeAnnotator(@Nonnull DexAnnotator annotator, @Nonnull MapItem mapItem) {
        return new SectionAnnotator(annotator, mapItem) {
            private SectionAnnotator classDataAnnotator = null;

            @Override public void annotateSection(@Nonnull AnnotatedBytes out) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedClassDef.java`
#### Snippet
```java

    private final int staticFieldsOffset;
    private int instanceFieldsOffset = 0;
    private int directMethodsOffset = 0;
    private int virtualMethodsOffset = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedClassDef.java`
#### Snippet
```java
    private int instanceFieldsOffset = 0;
    private int directMethodsOffset = 0;
    private int virtualMethodsOffset = 0;

    private final int staticFieldCount;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedClassDef.java`
#### Snippet
```java
    private final int staticFieldsOffset;
    private int instanceFieldsOffset = 0;
    private int directMethodsOffset = 0;
    private int virtualMethodsOffset = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/EncodedArrayItemIterator.java`
#### Snippet
```java
        @Nonnull private final DexBackedDexFile dexFile;
        private final int size;
        private int index = 0;

        public EncodedArrayItemIteratorImpl(@Nonnull DexBackedDexFile dexFile, int offset) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/FixedSizeSet.java`
#### Snippet
```java
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;

            @Override public boolean hasNext() { return index < size(); }
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/CodeItem.java`
#### Snippet
```java
    public static final int INSTRUCTION_START_OFFSET = 16;

    public static int CDEX_TRIES_SIZE_SHIFT = 0;
    public static int CDEX_OUTS_COUNT_SHIFT = 4;
    public static int CDEX_INS_COUNT_SHIFT = 8;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
    protected boolean interfacesFullyResolved = true;

    protected Set<String> unresolvedInterfaces = null;

    public ClassProto(@Nonnull ClassPath classPath, @Nonnull String type) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/DebugInfo.java`
#### Snippet
```java

            return new VariableSizeLookaheadIterator<DebugItem>(dexFile.getDataBuffer(), reader.getOffset()) {
                private int codeAddress = 0;
                private int lineNumber = lineNumberStart;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/util/ParamUtil.java`
#### Snippet
```java
                return new Iterator<ImmutableMethodParameter>() {

                    private int index = 0;

                    @Override public boolean hasNext() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListVtablesCommand.java`
#### Snippet
```java
                    "can be used, e.g. to list vtables from a dex file, as if they were in an oat file of the given " +
                    "version.")
    private int oatVersion = 0;

    public ListVtablesCommand(@Nonnull List<JCommander> commandAncestors) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListVtablesCommand.java`
#### Snippet
```java
            description = "A comma separated list of classes. Only print the vtable for these classes")
    @ExtendedParameter(argumentNames = "classes")
    private List<String> classes = null;

    @Parameter(names = "--override-oat-version",
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/BaksmaliOptions.java`
#### Snippet
```java
    public boolean sequentialLabels = false;
    public boolean debugInfo = true;
    public boolean codeOffsets = false;
    public boolean accessorComments = true;
    public boolean allowOdex = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/BaksmaliOptions.java`
#### Snippet
```java

    public Map<Integer,String> resourceIds = new HashMap<Integer,String>();
    public InlineMethodResolver inlineResolver = null;
    public ClassPath classPath = null;
    public SyntheticAccessorResolver syntheticAccessorResolver = null;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/BaksmaliOptions.java`
#### Snippet
```java
    public static final int FULLMERGE = 64;

    public int registerInfo = 0;

    public Map<Integer,String> resourceIds = new HashMap<Integer,String>();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/BaksmaliOptions.java`
#### Snippet
```java
    public Map<Integer,String> resourceIds = new HashMap<Integer,String>();
    public InlineMethodResolver inlineResolver = null;
    public ClassPath classPath = null;
    public SyntheticAccessorResolver syntheticAccessorResolver = null;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/BaksmaliOptions.java`
#### Snippet
```java

    public boolean parameterRegisters = true;
    public boolean localsDirective = false;
    public boolean sequentialLabels = false;
    public boolean debugInfo = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/BaksmaliOptions.java`
#### Snippet
```java
    public boolean deodex = false;
    public boolean implicitReferences = false;
    public boolean normalizeVirtualMethods = false;

    // register info values
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/BaksmaliOptions.java`
#### Snippet
```java
    public boolean codeOffsets = false;
    public boolean accessorComments = true;
    public boolean allowOdex = false;
    public boolean deodex = false;
    public boolean implicitReferences = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/BaksmaliOptions.java`
#### Snippet
```java
    public InlineMethodResolver inlineResolver = null;
    public ClassPath classPath = null;
    public SyntheticAccessorResolver syntheticAccessorResolver = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/BaksmaliOptions.java`
#### Snippet
```java
    public boolean accessorComments = true;
    public boolean allowOdex = false;
    public boolean deodex = false;
    public boolean implicitReferences = false;
    public boolean normalizeVirtualMethods = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/BaksmaliOptions.java`
#### Snippet
```java
    public boolean parameterRegisters = true;
    public boolean localsDirective = false;
    public boolean sequentialLabels = false;
    public boolean debugInfo = true;
    public boolean codeOffsets = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/BaksmaliOptions.java`
#### Snippet
```java
    public boolean allowOdex = false;
    public boolean deodex = false;
    public boolean implicitReferences = false;
    public boolean normalizeVirtualMethods = false;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/AnalysisArguments.java`
#### Snippet
```java
                    "specify multiple directories to search. They will be searched in the order they are provided.")
    @ExtendedParameter(argumentNames = "dir")
    public List<String> classPathDirectories = null;

    public static class CheckPackagePrivateArgument {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/AnalysisArguments.java`
#### Snippet
```java
            splitter = ColonParameterSplitter.class)
    @ExtendedParameter(argumentNames = "classpath")
    public List<String> bootClassPath = null;

    @Parameter(names = {"-c", "--classpath", "--cp"},
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/AnalysisArguments.java`
#### Snippet
```java
                        "by default for oat files. For odex files, this is only needed for odexes from 4.2.0. It " +
                        "was reverted in 4.2.1.")
        public boolean checkPackagePrivateAccess = false;
    }

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
    @Parameter(names = {"--code-offsets", "--offsets", "--off"},
            description = "Add a comment before each instruction with it's code offset within the method.")
    private boolean codeOffsets = false;

    @Parameter(names = {"--resolve-resources", "--rr"}, arity = 2,
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
            description = "A comma separated list of classes. Only disassemble these classes")
    @ExtendedParameter(argumentNames = "classes")
    private List<String> classes = null;

    public DisassembleCommand(@Nonnull List<JCommander> commandAncestors) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
            description = "When disassembling, output the .locals directive with the number of non-parameter " +
                    "registers instead of the .registers directive with the total number of registers.")
    private boolean localsDirective = false;

    @Parameter(names = {"--accessor-comments", "--ac"}, arity = 1,
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
    @Parameter(names = "--allow-odex-opcodes",
            description = "Allows odex opcodes to be disassembled, even if the result won't be able to be reassembled.")
    private boolean allowOdex = false;

    @Parameter(names = "--classes",
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
            description = "Create label names using a sequential numbering scheme per label type, rather than " +
                    "using the bytecode address.")
    private boolean sequentialLabels = false;

    @Parameter(names = {"--implicit-references", "--implicit", "--ir"},
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
            description = "Normalize virtual method references to use the base class where the method is " +
                    "originally declared.")
    private boolean normalizeVirtualMethods = false;

    @Parameter(names = {"-o", "--output"},
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
            description = "Use implicit method and field references (without the class name) for methods and " +
                    "fields from the current class.")
    private boolean implicitReferences = false;

    @Parameter(names = "--allow-odex-opcodes",
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/IndentingWriter.java`
#### Snippet
```java
    protected final Writer writer;
    protected final char[] buffer = new char[24];
    protected int indentLevel = 0;
    private boolean beginningOfLine = true;
    private static final String newLine = System.getProperty("line.separator");
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `third_party/util/src/main/java/com/android/tools/smali/util/ClassFileNameHandler.java`
#### Snippet
```java

    private class DirectoryEntry extends FileSystemEntry {
        @Nullable private File file = null;
        private int caseSensitivity = forcedCaseSensitivity;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `third_party/util/src/main/java/com/android/tools/smali/util/ClassFileNameHandler.java`
#### Snippet
```java
        @Nullable public final DirectoryEntry parent;
        @Nonnull public final String logicalName;
        @Nullable protected String physicalName = null;

        private FileSystemEntry(@Nullable DirectoryEntry parent, @Nonnull String logicalName) {
```

## RuleId[id=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/base/BaseTryBlock.java`
#### Snippet
```java
import com.android.tools.smali.dexlib2.iface.TryBlock;

public abstract class BaseTryBlock<EH extends ExceptionHandler> implements TryBlock<EH> {
    @Override public boolean equals(Object o) {
        if (o instanceof TryBlock) {
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

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `MethodProtoReference`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/PoolMethodProto.java`
#### Snippet
```java
import java.util.List;

public class PoolMethodProto extends BaseMethodProtoReference implements MethodProtoReference {
    private final MethodReference methodReference;

```

### RedundantImplements
Redundant interface declaration `Markable`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/StringTypeBasePool.java`
#### Snippet
```java

public abstract class StringTypeBasePool extends BasePool<String, Integer>
        implements NullableIndexSection<CharSequence>, Markable {

    public StringTypeBasePool(@Nonnull DexPool dexPool) {
```

### RedundantImplements
Redundant interface declaration `MethodReference`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethodPool.java`
#### Snippet
```java
    }

    private static class MethodKey extends BaseMethodReference implements MethodReference {
        @Nonnull private final String definingClass;
        @Nonnull private final String name;
```

### RedundantImplements
Redundant interface declaration `MethodProtoReference`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMethodProtoReference.java`
#### Snippet
```java

public class BuilderMethodProtoReference extends BaseMethodProtoReference implements
        MethodProtoReference, BuilderReference {
    @Nonnull final BuilderStringReference shorty;
    @Nonnull final BuilderTypeList parameterTypes;
```

### RedundantImplements
Redundant interface declaration `Iterator`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/VariableSizeLookaheadIterator.java`
#### Snippet
```java
import java.util.Iterator;

public abstract class VariableSizeLookaheadIterator<T> extends AbstractIterator<T> implements Iterator<T> {
    @Nonnull private final DexReader reader;

```

### RedundantImplements
Redundant interface declaration `AnnotationEncodedValue`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/value/DexBackedAnnotationEncodedValue.java`
#### Snippet
```java
import java.util.Set;

public class DexBackedAnnotationEncodedValue extends BaseAnnotationEncodedValue implements AnnotationEncodedValue {
    @Nonnull public final DexBackedDexFile dexFile;
    @Nonnull public final String type;
```

### RedundantImplements
Redundant interface declaration `ArrayEncodedValue`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/value/DexBackedArrayEncodedValue.java`
#### Snippet
```java
import java.util.List;

public class DexBackedArrayEncodedValue extends BaseArrayEncodedValue implements ArrayEncodedValue {
    @Nonnull public final DexBackedDexFile dexFile;
    private final int elementCount;
```

### RedundantImplements
Redundant interface declaration `ExceptionHandler`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableExceptionHandler.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class ImmutableExceptionHandler extends BaseExceptionHandler implements ExceptionHandler {
    @Nullable protected final String exceptionType;
    protected final int handlerCodeAddress;
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `ExceptionWithContext` does not end with 'Exception'
in `dexlib2/src/main/java/com/android/tools/smali/util/ExceptionWithContext.java`
#### Snippet
```java
 * Exception which carries around structured context.
 */
public class ExceptionWithContext
        extends RuntimeException {
    /** non-null; human-oriented context of the exception */
```

### ExceptionNameDoesntEndWithException
Exception class name `InvalidInstructionOffset` does not end with 'Exception'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/InstructionOffsetMap.java`
#### Snippet
```java
    }

    public static class InvalidInstructionOffset extends ExceptionWithContext {
        private final int instructionOffset;

```

### ExceptionNameDoesntEndWithException
Exception class name `InvalidInstructionIndex` does not end with 'Exception'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/InstructionOffsetMap.java`
#### Snippet
```java
    }

    public static class InvalidInstructionIndex extends ExceptionWithContext {
        private final int instructionIndex;

```

### ExceptionNameDoesntEndWithException
Exception class name `InvalidFile` does not end with 'Exception'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/DexUtil.java`
#### Snippet
```java
    }

    public static class InvalidFile extends RuntimeException {
        public InvalidFile() {
        }
```

### ExceptionNameDoesntEndWithException
Exception class name `UnsupportedFile` does not end with 'Exception'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/DexUtil.java`
#### Snippet
```java
    }

    public static class UnsupportedFile extends RuntimeException {
        public UnsupportedFile() {
        }
```

### ExceptionNameDoesntEndWithException
Exception class name `NotAnOdexFile` does not end with 'Exception'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedOdexFile.java`
#### Snippet
```java
    }

    public static class NotAnOdexFile extends RuntimeException {
        public NotAnOdexFile() {
        }
```

### ExceptionNameDoesntEndWithException
Exception class name `NotADexFile` does not end with 'Exception'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedDexFile.java`
#### Snippet
```java
    }

    public static class NotADexFile extends RuntimeException {
        public NotADexFile() {
        }
```

### ExceptionNameDoesntEndWithException
Exception class name `InvalidSwitchPayload` does not end with 'Exception'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java
    }

    public static class InvalidSwitchPayload extends ExceptionWithContext {
        private final int payloadOffset;

```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer buffer` may be declared as 'StringBuilder'
in `third_party/util/src/main/java/com/android/tools/smali/util/ConsoleUtil.java`
#### Snippet
```java

    private static String attemptCommand(String[] command) {
        StringBuffer buffer = null;

        try {
```

### StringBufferReplaceableByStringBuilder
`StringBuffer sb` may be declared as 'StringBuilder'
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/Hex.java`
#### Snippet
```java
        }

        StringBuffer sb = new StringBuffer(length * 4 + 6);
        boolean bol = true;
        int col = 0;
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
                setInStaticConstructor = false;
            } else {
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

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `context` of exception class
in `dexlib2/src/main/java/com/android/tools/smali/util/ExceptionWithContext.java`
#### Snippet
```java
        extends RuntimeException {
    /** non-null; human-oriented context of the exception */
    private StringBuffer context;

    /**
```

### NonFinalFieldOfException
Non-final field `codeAddress` of exception class
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/AnalysisException.java`
#### Snippet
```java

public class AnalysisException extends ExceptionWithContext {
    public int codeAddress;

    public AnalysisException(Throwable cause) {
```

### NonFinalFieldOfException
Non-final field `odexedInstruction` of exception class
in `third_party/smali/src/main/java/com/android/tools/smali/smali/OdexedInstructionException.java`
#### Snippet
```java

public class OdexedInstructionException extends RecognitionException {
    private String odexedInstruction;

    OdexedInstructionException(IntStream input, String odexedInstruction) {
```

### NonFinalFieldOfException
Non-final field `errorMessage` of exception class
in `third_party/smali/src/main/java/com/android/tools/smali/smali/SemanticException.java`
#### Snippet
```java

public class SemanticException extends RecognitionException {
    private String errorMessage;


```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `util/src/main/java/com/android/tools/smali/util/jcommander/ExtendedCommands.java`
#### Snippet
```java
        }

        return new String[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/ProtoIdItem.java`
#### Snippet
```java
        MapItem mapItem = dexFile.getMapItemForSection(ItemType.PROTO_ID_ITEM);
        if (mapItem == null) {
            return new String[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/FieldIdItem.java`
#### Snippet
```java
        MapItem mapItem = dexFile.getMapItemForSection(ItemType.FIELD_ID_ITEM);
        if (mapItem == null) {
            return new String[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/MethodIdItem.java`
#### Snippet
```java
        MapItem mapItem = dexFile.getMapItemForSection(ItemType.METHOD_ID_ITEM);
        if (mapItem == null) {
            return new String[0];
        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/ClassDefItem.java`
#### Snippet
```java
        MapItem mapItem = dexFile.getMapItemForSection(ItemType.CLASS_DEF_ITEM);
        if (mapItem == null) {
            return new String[0];
        }

```

## RuleId[id=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'Instruction20bc' type conflicts with preceding 'instanceof ReferenceInstruction' check
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/InstructionRewriter.java`
#### Snippet
```java
            switch (instruction.getOpcode().format) {
                case Format20bc:
                    return new RewrittenInstruction20bc((Instruction20bc)instruction);
                case Format21c:
                    return new RewrittenInstruction21c((Instruction21c)instruction);
```

### CastConflictsWithInstanceof
Cast to 'Instruction21c' type conflicts with preceding 'instanceof ReferenceInstruction' check
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/InstructionRewriter.java`
#### Snippet
```java
                    return new RewrittenInstruction20bc((Instruction20bc)instruction);
                case Format21c:
                    return new RewrittenInstruction21c((Instruction21c)instruction);
                case Format22c:
                    return new RewrittenInstruction22c((Instruction22c)instruction);
```

### CastConflictsWithInstanceof
Cast to 'Instruction22c' type conflicts with preceding 'instanceof ReferenceInstruction' check
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/InstructionRewriter.java`
#### Snippet
```java
                    return new RewrittenInstruction21c((Instruction21c)instruction);
                case Format22c:
                    return new RewrittenInstruction22c((Instruction22c)instruction);
                case Format31c:
                    return new RewrittenInstruction31c((Instruction31c)instruction);
```

### CastConflictsWithInstanceof
Cast to 'Instruction31c' type conflicts with preceding 'instanceof ReferenceInstruction' check
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/InstructionRewriter.java`
#### Snippet
```java
                    return new RewrittenInstruction22c((Instruction22c)instruction);
                case Format31c:
                    return new RewrittenInstruction31c((Instruction31c)instruction);
                case Format35c:
                    return new RewrittenInstruction35c((Instruction35c)instruction);
```

### CastConflictsWithInstanceof
Cast to 'Instruction35c' type conflicts with preceding 'instanceof ReferenceInstruction' check
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/InstructionRewriter.java`
#### Snippet
```java
                    return new RewrittenInstruction31c((Instruction31c)instruction);
                case Format35c:
                    return new RewrittenInstruction35c((Instruction35c)instruction);
                case Format3rc:
                    return new RewrittenInstruction3rc((Instruction3rc)instruction);
```

### CastConflictsWithInstanceof
Cast to 'Instruction3rc' type conflicts with preceding 'instanceof ReferenceInstruction' check
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/InstructionRewriter.java`
#### Snippet
```java
                    return new RewrittenInstruction35c((Instruction35c)instruction);
                case Format3rc:
                    return new RewrittenInstruction3rc((Instruction3rc)instruction);
                case Format45cc:
                    return new RewrittenInstruction45cc((Instruction45cc) instruction);
```

### CastConflictsWithInstanceof
Cast to 'Instruction45cc' type conflicts with preceding 'instanceof ReferenceInstruction' check
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/InstructionRewriter.java`
#### Snippet
```java
                    return new RewrittenInstruction3rc((Instruction3rc)instruction);
                case Format45cc:
                    return new RewrittenInstruction45cc((Instruction45cc) instruction);
                default:
                    throw new IllegalArgumentException();
```

## RuleId[id=UnstableTypeUsedInSignature]
### UnstableTypeUsedInSignature
Field must be marked with '@com.google.common.annotations.Beta' annotation because its type references unstable type 'com.google.common.collect.RangeMap'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
    // values and minApis provide a mapping of api -> bytecode value.
    // the apis in minApis are guaranteed to be
    public final RangeMap<Integer, Short> apiToValueMap;
    public final RangeMap<Integer, Short> artVersionToValueMap;

```

### UnstableTypeUsedInSignature
Field must be marked with '@com.google.common.annotations.Beta' annotation because its type references unstable type 'com.google.common.collect.RangeMap'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/Opcode.java`
#### Snippet
```java
    // the apis in minApis are guaranteed to be
    public final RangeMap<Integer, Short> apiToValueMap;
    public final RangeMap<Integer, Short> artVersionToValueMap;

    public final String name;
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

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `fromInputStream()` tries to override a static method of a superclass
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedOdexFile.java`
#### Snippet
```java
    }

    @Nonnull public static DexBackedOdexFile fromInputStream(@Nonnull Opcodes opcodes, @Nonnull InputStream is)
            throws IOException {
        DexUtil.verifyOdexHeader(is);
```

## RuleId[id=IOResource]
### IOResource
'WrappedIndentingWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `util/src/main/java/com/android/tools/smali/util/jcommander/HelpFormatter.java`
#### Snippet
```java
        try {
            StringWriter stringWriter = new StringWriter();
            WrappedIndentingWriter writer = new WrappedIndentingWriter(stringWriter, width - 5, width);

            JCommander leafJc = Iterables.getLast(commandHierarchy);
```

### IOResource
'BufferedReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/CustomInlineMethodResolver.java`
#### Snippet
```java
        List<String> lines = new ArrayList<String>();

        BufferedReader br = new BufferedReader(reader);

        try {
```

### IOResource
'FileReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `third_party/util/src/main/java/com/android/tools/smali/util/PathUtil.java`
#### Snippet
```java
            try {
                CharBuffer buf = CharBuffer.allocate(32);
                FileReader reader = new FileReader(f2);

                while (reader.read(buf) != -1 && buf.length() < 4);
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `NO_VALUE` may be 'static'
in `third_party/util/src/main/java/com/android/tools/smali/util/ClassFileNameHandler.java`
#### Snippet
```java
    private static final int NUMERIC_SUFFIX_RESERVE = 6;

    private final int NO_VALUE = -1;
    private final int CASE_INSENSITIVE = 0;
    private final int CASE_SENSITIVE = 1;
```

### FieldMayBeStatic
Field `CASE_SENSITIVE` may be 'static'
in `third_party/util/src/main/java/com/android/tools/smali/util/ClassFileNameHandler.java`
#### Snippet
```java
    private final int NO_VALUE = -1;
    private final int CASE_INSENSITIVE = 0;
    private final int CASE_SENSITIVE = 1;
    private int forcedCaseSensitivity = NO_VALUE;

```

### FieldMayBeStatic
Field `CASE_INSENSITIVE` may be 'static'
in `third_party/util/src/main/java/com/android/tools/smali/util/ClassFileNameHandler.java`
#### Snippet
```java

    private final int NO_VALUE = -1;
    private final int CASE_INSENSITIVE = 0;
    private final int CASE_SENSITIVE = 1;
    private int forcedCaseSensitivity = NO_VALUE;
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `LinearSearch` has only 'static' members, and lacks a 'private' constructor
in `util/src/main/java/com/android/tools/smali/util/LinearSearch.java`
#### Snippet
```java
import java.util.List;

public class LinearSearch {
    /**
     * Performs a linear search in a sorted list for key, starting at initialGuess
```

### UtilityClassWithoutPrivateConstructor
Class `ExtendedCommands` has only 'static' members, and lacks a 'private' constructor
in `util/src/main/java/com/android/tools/smali/util/jcommander/ExtendedCommands.java`
#### Snippet
```java
 * Utilities related to "extended" commands - JCommander commands with additional information
 */
public class ExtendedCommands {

    @Nonnull
```

### UtilityClassWithoutPrivateConstructor
Class `CharSequenceUtils` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/util/CharSequenceUtils.java`
#### Snippet
```java
import java.util.List;

public class CharSequenceUtils {
    private static final Function<Object, String> TO_STRING = Functions.toStringFunction();

```

### UtilityClassWithoutPrivateConstructor
Class `ImmutableUtils` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/util/ImmutableUtils.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class ImmutableUtils {
    @Nonnull public static <T> ImmutableList<T> nullToEmptyList(@Nullable ImmutableList<T> list) {
        if (list == null) {
```

### UtilityClassWithoutPrivateConstructor
Class `BitSetUtils` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/util/BitSetUtils.java`
#### Snippet
```java
import java.util.BitSet;

public class BitSetUtils {
    public static BitSet bitSetOfIndexes(int... indexes) {
        BitSet bitSet = new BitSet();
```

### UtilityClassWithoutPrivateConstructor
Class `Smali` has only 'static' members, and lacks a 'private' constructor
in `smali/src/main/java/com/android/tools/smali/smali/Smali.java`
#### Snippet
```java
import java.util.TreeSet;

public class Smali {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `CollectionUtils` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/util/CollectionUtils.java`
#### Snippet
```java
import javax.annotation.Nonnull;

public class CollectionUtils {
    public static <T> int listHashCode(@Nonnull Iterable<T> iterable) {
        int hashCode = 1;
```

### UtilityClassWithoutPrivateConstructor
Class `StringUtils` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/util/StringUtils.java`
#### Snippet
```java
import java.io.Writer;

public class StringUtils {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `MethodHandleType` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/MethodHandleType.java`
#### Snippet
```java
import javax.annotation.Nonnull;

public class MethodHandleType {
    public static final int STATIC_PUT = 0;
    public static final int STATIC_GET = 1;
```

### UtilityClassWithoutPrivateConstructor
Class `NumberUtils` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/util/NumberUtils.java`
#### Snippet
```java
import java.text.DecimalFormat;

public class NumberUtils {
    private static final int canonicalFloatNaN = Float.floatToRawIntBits(Float.NaN);
    private static final int maxFloat = Float.floatToRawIntBits(Float.MAX_VALUE);
```

### UtilityClassWithoutPrivateConstructor
Class `VersionMap` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/VersionMap.java`
#### Snippet
```java
package com.android.tools.smali.dexlib2;

public class VersionMap {
    public static final int NO_VERSION = -1;

```

### UtilityClassWithoutPrivateConstructor
Class `Utf8Utils` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/util/Utf8Utils.java`
#### Snippet
```java
 * Constants of type <code>CONSTANT_Utf8_info</code>.
 */
public final class Utf8Utils {
    /**
     * Converts a string into its Java-style UTF-8 form. Java-style UTF-8
```

### UtilityClassWithoutPrivateConstructor
Class `VerificationError` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/VerificationError.java`
#### Snippet
```java
import java.util.HashMap;

public class VerificationError {
    public static final int GENERIC = 1;
    public static final int NO_SUCH_CLASS = 2;
```

### UtilityClassWithoutPrivateConstructor
Class `StringWrapper` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/util/StringWrapper.java`
#### Snippet
```java
import java.util.Iterator;

public class StringWrapper {
    /**
     * Splits the given string into lines of maximum width maxWidth. The splitting is done using the current locale's
```

### UtilityClassWithoutPrivateConstructor
Class `DexUtil` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/DexUtil.java`
#### Snippet
```java
import java.io.InputStream;

public class DexUtil {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `Preconditions` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/util/Preconditions.java`
#### Snippet
```java
import java.util.List;

public class Preconditions {
    public static void checkFormat(Opcode opcode, Format expectedFormat) {
        if (opcode.format != expectedFormat) {
```

### UtilityClassWithoutPrivateConstructor
Class `CallSiteUtil` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/util/CallSiteUtil.java`
#### Snippet
```java
import java.util.List;

public class CallSiteUtil {
    public static ArrayEncodedValue getEncodedCallSite(CallSiteReference callSiteReference) {
        return new BaseArrayEncodedValue() {
```

### UtilityClassWithoutPrivateConstructor
Class `StaticInitializerUtil` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/util/StaticInitializerUtil.java`
#### Snippet
```java
import java.util.SortedSet;

public class StaticInitializerUtil {

    @Nullable public static ArrayEncodedValue getStaticInitializers(
```

### UtilityClassWithoutPrivateConstructor
Class `AnalyzedMethodUtil` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/AnalyzedMethodUtil.java`
#### Snippet
```java
import javax.annotation.Nonnull;

public class AnalyzedMethodUtil {
    public static boolean canAccess(@Nonnull TypeProto type, @Nonnull Method virtualMethod, boolean checkPackagePrivate,
                                    boolean checkProtected, boolean checkClass) {
```

### UtilityClassWithoutPrivateConstructor
Class `TypeProtoUtils` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/util/TypeProtoUtils.java`
#### Snippet
```java
import java.util.NoSuchElementException;

public class TypeProtoUtils {
    /**
     * Get the chain of superclasses of the given class. The first element will be the immediate superclass followed by
```

### UtilityClassWithoutPrivateConstructor
Class `ReflectionUtils` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/reflection/util/ReflectionUtils.java`
#### Snippet
```java
import com.google.common.collect.ImmutableBiMap;

public class ReflectionUtils {

    private static ImmutableBiMap<String, String> primitiveMap = ImmutableBiMap.<String, String>builder()
```

### UtilityClassWithoutPrivateConstructor
Class `RewriterUtils` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/rewriter/RewriterUtils.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class RewriterUtils {
    @Nullable
    public static <T> T rewriteNullable(@Nonnull Rewriter<T> rewriter, @Nullable T value) {
```

### UtilityClassWithoutPrivateConstructor
Class `ProtoIdItem` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/ProtoIdItem.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class ProtoIdItem {
    public static final int ITEM_SIZE = 12;

```

### UtilityClassWithoutPrivateConstructor
Class `FieldIdItem` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/FieldIdItem.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class FieldIdItem {
    public static final int ITEM_SIZE = 8;

```

### UtilityClassWithoutPrivateConstructor
Class `EncodedArrayItem` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/EncodedArrayItem.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class EncodedArrayItem {
    @Nonnull
    public static SectionAnnotator makeAnnotator(@Nonnull DexAnnotator annotator, @Nonnull MapItem mapItem) {
```

### UtilityClassWithoutPrivateConstructor
Class `StringDataItem` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/StringDataItem.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class StringDataItem {
    @Nonnull
    public static SectionAnnotator makeAnnotator(@Nonnull DexAnnotator annotator, @Nonnull MapItem mapItem) {
```

### UtilityClassWithoutPrivateConstructor
Class `AnnotationSetItem` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/AnnotationSetItem.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class AnnotationSetItem {
    public static final int SIZE_OFFSET = 0;
    public static final int LIST_OFFSET = 4;
```

### UtilityClassWithoutPrivateConstructor
Class `MethodHandleItem` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/MethodHandleItem.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class MethodHandleItem {
    public static final int ITEM_SIZE = 8;

```

### UtilityClassWithoutPrivateConstructor
Class `CdexDebugOffsetTable` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/CdexDebugOffsetTable.java`
#### Snippet
```java
 * the beginning of the debug offset table.
 */
public class CdexDebugOffsetTable {
    @Nonnull
    public static void annotate(@Nonnull DexAnnotator annotator, DexBuffer buffer) {
```

### UtilityClassWithoutPrivateConstructor
Class `MethodIdItem` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/MethodIdItem.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class MethodIdItem {
    public static final int ITEM_SIZE = 8;

```

### UtilityClassWithoutPrivateConstructor
Class `ItemType` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/ItemType.java`
#### Snippet
```java
import javax.annotation.Nonnull;

public class ItemType {
    public static final int HEADER_ITEM = 0x0000;
    public static final int STRING_ID_ITEM = 0x0001;
```

### UtilityClassWithoutPrivateConstructor
Class `TypeListItem` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/TypeListItem.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class TypeListItem {
    public static final int SIZE_OFFSET = 0;
    public static final int LIST_OFFSET = 4;
```

### UtilityClassWithoutPrivateConstructor
Class `AnnotationSetRefList` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/AnnotationSetRefList.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class AnnotationSetRefList {
    public static final int SIZE_OFFSET = 0;
    public static final int LIST_OFFSET = 4;
```

### UtilityClassWithoutPrivateConstructor
Class `ClassDataItem` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/ClassDataItem.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class ClassDataItem {
    @Nonnull
    public static SectionAnnotator makeAnnotator(@Nonnull DexAnnotator annotator, @Nonnull MapItem mapItem) {
```

### UtilityClassWithoutPrivateConstructor
Class `AnnotationDirectoryItem` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/AnnotationDirectoryItem.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class AnnotationDirectoryItem {
    public static final int CLASS_ANNOTATIONS_OFFSET  = 0;
    public static final int FIELD_SIZE_OFFSET = 4;
```

### UtilityClassWithoutPrivateConstructor
Class `StringIdItem` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/StringIdItem.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class StringIdItem {
    public static final int ITEM_SIZE = 4;

```

### UtilityClassWithoutPrivateConstructor
Class `TypeIdItem` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/TypeIdItem.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class TypeIdItem {
    public static final int ITEM_SIZE = 4;

```

### UtilityClassWithoutPrivateConstructor
Class `CallSiteIdItem` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/CallSiteIdItem.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class CallSiteIdItem {
    public static final int ITEM_SIZE = 4;

```

### UtilityClassWithoutPrivateConstructor
Class `OdexHeaderItem` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/OdexHeaderItem.java`
#### Snippet
```java
import com.android.tools.smali.dexlib2.dexbacked.DexBuffer;

public class OdexHeaderItem {
    public static final int ITEM_SIZE = 40;

```

### UtilityClassWithoutPrivateConstructor
Class `AnnotationItem` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/AnnotationItem.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class AnnotationItem {
    public static final int VISIBILITY_OFFSET = 0;
    public static final int ANNOTATION_OFFSET = 1;
```

### UtilityClassWithoutPrivateConstructor
Class `ClassDefItem` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/ClassDefItem.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class ClassDefItem {
    public static final int ITEM_SIZE = 32;

```

### UtilityClassWithoutPrivateConstructor
Class `CdexHeaderItem` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/CdexHeaderItem.java`
#### Snippet
```java
import javax.annotation.Nonnull;

public class CdexHeaderItem {

    private static final byte[] MAGIC_VALUE = new byte[] { 0x63, 0x64, 0x65, 0x78, 0x00, 0x00, 0x00, 0x00 };
```

### UtilityClassWithoutPrivateConstructor
Class `HiddenApiClassDataItem` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/HiddenApiClassDataItem.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class HiddenApiClassDataItem {
    public static final int SIZE_OFFSET = 0x0;
    public static final int OFFSETS_LIST_OFFSET = 0x4;
```

### UtilityClassWithoutPrivateConstructor
Class `EncodedValue` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/EncodedValue.java`
#### Snippet
```java
import javax.annotation.Nonnull;

public class EncodedValue {
    public static void annotateEncodedValue(
            @Nonnull DexBackedDexFile dexFile,
```

### UtilityClassWithoutPrivateConstructor
Class `DebugInfoItem` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/DebugInfoItem.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class DebugInfoItem {

    @Nonnull
```

### UtilityClassWithoutPrivateConstructor
Class `CodeItem` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/CodeItem.java`
#### Snippet
```java
import java.util.List;

public class CodeItem {
    public static final int REGISTERS_OFFSET = 0;
    public static final int INS_OFFSET = 2;
```

### UtilityClassWithoutPrivateConstructor
Class `TryItem` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/CodeItem.java`
#### Snippet
```java
    public static int CDEX_PREHEADER_FLAG_INSTRUCTIONS_SIZE = 1 << 4;

    public static class TryItem {
        public static final int ITEM_SIZE = 8;

```

### UtilityClassWithoutPrivateConstructor
Class `ParamUtil` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/util/ParamUtil.java`
#### Snippet
```java
import java.util.Iterator;

public class ParamUtil {
    private static int findTypeEnd(@Nonnull String str, int index) {
        char c = str.charAt(index);
```

### UtilityClassWithoutPrivateConstructor
Class `ImmutableEncodedValueFactory` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/value/ImmutableEncodedValueFactory.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class ImmutableEncodedValueFactory {
    @Nonnull
    public static ImmutableEncodedValue of(@Nonnull EncodedValue encodedValue) {
```

### UtilityClassWithoutPrivateConstructor
Class `ImmutableReferenceFactory` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/reference/ImmutableReferenceFactory.java`
#### Snippet
```java
import javax.annotation.Nonnull;

public class ImmutableReferenceFactory {
    @Nonnull
    public static ImmutableReference of(Reference reference) {
```

### UtilityClassWithoutPrivateConstructor
Class `AccessorTestGenerator` has only 'static' members, and lacks a 'private' constructor
in `dexlib2/accessorTestGenerator/src/main/java/com/android/tools/smali/dexlib2/AccessorTestGenerator.java`
#### Snippet
```java
import org.stringtemplate.v4.STGroupFile;

public class AccessorTestGenerator {
    private static class UnaryOperation {
        public final String name;
```

### UtilityClassWithoutPrivateConstructor
Class `LocalFormatter` has only 'static' members, and lacks a 'private' constructor
in `baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Debug/LocalFormatter.java`
#### Snippet
```java
import java.io.IOException;

public class LocalFormatter {
    /**
     * Writes out the given local info
```

### UtilityClassWithoutPrivateConstructor
Class `AnnotationFormatter` has only 'static' members, and lacks a 'private' constructor
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/AnnotationFormatter.java`
#### Snippet
```java
import java.util.Collection;

public class AnnotationFormatter {

    public static void writeTo(@Nonnull BaksmaliWriter writer,
```

### UtilityClassWithoutPrivateConstructor
Class `ConsoleUtil` has only 'static' members, and lacks a 'private' constructor
in `third_party/util/src/main/java/com/android/tools/smali/util/ConsoleUtil.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class ConsoleUtil {
    /**
     * Attempt to find the width of the console. If it can't get the width, return a default of 80
```

### UtilityClassWithoutPrivateConstructor
Class `Baksmali` has only 'static' members, and lacks a 'private' constructor
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Baksmali.java`
#### Snippet
```java
import java.util.Set;

public class Baksmali {
    public static boolean disassembleDexFile(DexFile dexFile, File outputDir, int jobs, final BaksmaliOptions options) {
        return disassembleDexFile(dexFile, outputDir, jobs, options, null);
```

### UtilityClassWithoutPrivateConstructor
Class `LiteralTools` has only 'static' members, and lacks a 'private' constructor
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LiteralTools.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class LiteralTools
{
    public static byte parseByte(String byteLiteral)
```

### UtilityClassWithoutPrivateConstructor
Class `FieldDefinition` has only 'static' members, and lacks a 'private' constructor
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/FieldDefinition.java`
#### Snippet
```java
import java.util.Set;

public class FieldDefinition {
    public static void writeTo(BaksmaliWriter writer, Field field,
                               boolean setInStaticConstructor) throws IOException {
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
                DexBackedOdexFile odexFile = DexBackedOdexFile.fromInputStream(opcodes, inputStream);
                return new SingletonMultiDexContainer(file.getPath(), odexFile);
            } catch (DexBackedOdexFile.NotAnOdexFile ex) {
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
    public static void checkInt(long value) {
        if (value > 0xFFFFFFFF || value < -0x80000000) {
            throw new NumberFormatException(Long.toString(value) + " cannot fit into an int");
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

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `getFormat()` during object construction
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/BuilderInstruction.java`
#### Snippet
```java

    protected BuilderInstruction(@Nonnull Opcode opcode) {
        Preconditions.checkFormat(opcode, getFormat());
        this.opcode = opcode;
    }
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getSectionProvider()` during object construction
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
        this.opcodes = opcodes;

        SectionProvider sectionProvider = getSectionProvider();
        this.stringSection = sectionProvider.getStringSection();
        this.typeSection = sectionProvider.getTypeSection();
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getFormat()` during object construction
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/instruction/ImmutableInstruction.java`
#### Snippet
```java

    protected ImmutableInstruction(@Nonnull Opcode opcode) {
        Preconditions.checkFormat(opcode, getFormat());
        this.opcode = opcode;
    }
```

## RuleId[id=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `mark()` overrides synchronized method
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/io/MemoryDataStore.java`
#### Snippet
```java
            }

            @Override public void mark(int i) {
                mark = position;
            }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `reset()` overrides synchronized method
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/io/MemoryDataStore.java`
#### Snippet
```java
            }

            @Override public void reset() throws IOException {
                position = mark;
            }
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `write()` overrides synchronized method
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexDataWriter.java`
#### Snippet
```java

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        filePosition += len;
        super.write(b, off, len);
```

### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `write()` overrides synchronized method
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexDataWriter.java`
#### Snippet
```java

    @Override
    public void write(int b) throws IOException {
        filePosition++;
        super.write(b);
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'oatFile' in a Serializable class
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/DexFileFactory.java`
#### Snippet
```java

    public static class UnsupportedOatVersionException extends ExceptionWithContext {
        @Nonnull public final OatFile oatFile;

        public UnsupportedOatVersionException(@Nonnull OatFile oatFile) {
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

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/MutableMethodImplementation.java`
#### Snippet
```java
                                // if the switch payload isn't referenced, just remove it
                                removeInstruction(index);
                                index--;
                                madeChanges = true;
                                break;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/MutableMethodImplementation.java`
#### Snippet
```java
                                if (previousInstruction.getOpcode() == Opcode.NOP) {
                                    removeInstruction(previousIndex);
                                    index--;
                                } else {
                                    addInstruction(location.index, new BuilderInstruction10x(Opcode.NOP));
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `index`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/MutableMethodImplementation.java`
#### Snippet
```java
                                } else {
                                    addInstruction(location.index, new BuilderInstruction10x(Opcode.NOP));
                                    index++;
                                }
                                madeChanges = true;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `third_party/util/src/main/java/com/android/tools/smali/util/ClassFileNameHandler.java`
#### Snippet
```java

                packageElements[elementIndex++] = className.substring(elementStart, i);
                elementStart = ++i;
            }
        }
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
Local variable `intValue` declared in one 'switch' branch and used in another
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/EncodedValue.java`
#### Snippet
```java
        switch (valueType) {
            case ValueType.BYTE:
                int intValue = reader.readByte();
                return String.format("0x%x", intValue);
            case ValueType.SHORT:
```

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

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/OatFile.java`
#### Snippet
```java

        public int getVersion() {
            return Integer.valueOf(new String(buf, headerOffset + 4, 3));
        }

```

### UnnecessaryBoxing
Unnecessary boxing
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Format/InstructionMethodItem.java`
#### Snippet
```java
    protected boolean writeCommentIfResourceId(BaksmaliWriter writer, int val) throws IOException {
        Map<Integer,String> resourceIds = methodDef.classDef.options.resourceIds;
        String resource = resourceIds.get(Integer.valueOf(val));
        if (resource != null) {
            writer.write("    # ");
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

                // TODO: what is the correct character encoding?
                String filename = new String(buf, offset, filenameLength, Charset.forName("US-ASCII"));
                offset += filenameLength;

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
StandardCharsets.UTF_8 can be used instead
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Baksmali.java`
#### Snippet
```java

            BufferedWriter bufWriter = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(smaliFile), "UTF8"));

            writer = new BaksmaliWriter(
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smali/src/main/java/com/android/tools/smali/smali/HelpCommand.java`
#### Snippet
```java

        if (commands == null || commands.isEmpty()) {
            System.out.println(new HelpFormatter()
                    .width(ConsoleUtil.getConsoleWidth())
                    .format(commandAncestors));
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `smali/src/main/java/com/android/tools/smali/smali/HelpCommand.java`
#### Snippet
```java
                JCommander command = ExtendedCommands.getSubcommand(parentJc, cmd);
                if (command == null) {
                    System.err.println("No such command: " + cmd);
                } else {
                    printedHelp = true;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smali/src/main/java/com/android/tools/smali/smali/HelpCommand.java`
#### Snippet
```java
                } else {
                    printedHelp = true;
                    System.out.println(new HelpFormatter()
                            .width(ConsoleUtil.getConsoleWidth())
                            .format(((Command)command.getObjects().get(0)).getCommandHierarchy()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smali/src/main/java/com/android/tools/smali/smali/HelpCommand.java`
#### Snippet
```java
            }
            if (!printedHelp) {
                System.out.println(new HelpFormatter()
                        .width(ConsoleUtil.getConsoleWidth())
                        .format(commandAncestors));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smali/src/main/java/com/android/tools/smali/smali/Main.java`
#### Snippet
```java

    protected static void version() {
        System.out.println("smali " + VERSION + " (http://smali.org)");
        System.out.println("Copyright (C) 2010 Ben Gruver (JesusFreke@JesusFreke.com)");
        System.out.println("BSD license (http://www.opensource.org/licenses/bsd-license.php)");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smali/src/main/java/com/android/tools/smali/smali/Main.java`
#### Snippet
```java
    protected static void version() {
        System.out.println("smali " + VERSION + " (http://smali.org)");
        System.out.println("Copyright (C) 2010 Ben Gruver (JesusFreke@JesusFreke.com)");
        System.out.println("BSD license (http://www.opensource.org/licenses/bsd-license.php)");
        System.exit(0);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smali/src/main/java/com/android/tools/smali/smali/Main.java`
#### Snippet
```java
        System.out.println("smali " + VERSION + " (http://smali.org)");
        System.out.println("Copyright (C) 2010 Ben Gruver (JesusFreke@JesusFreke.com)");
        System.out.println("BSD license (http://www.opensource.org/licenses/bsd-license.php)");
        System.exit(0);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `util/src/main/java/com/android/tools/smali/util/jcommander/Command.java`
#### Snippet
```java

    public void usage() {
        System.out.println(new HelpFormatter()
                .width(ConsoleUtil.getConsoleWidth())
                .format(getCommandHierarchy()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smali/src/main/java/com/android/tools/smali/smali/Smali.java`
#### Snippet
```java
                    tokenName = smaliParser.tokenNames[token.getType()];
                }
                System.out.println(tokenName + "(\"" + StringUtils.escapeString(token.getText()) + "\")");
            }
            System.out.flush();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smali/src/main/java/com/android/tools/smali/smali/Smali.java`
#### Snippet
```java
                System.out.println(tokenName + "(\"" + StringUtils.escapeString(token.getText()) + "\")");
            }
            System.out.flush();

            return lexer.getNumberOfSyntaxErrors() == 0;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smali/src/main/java/com/android/tools/smali/smali/Smali.java`
#### Snippet
```java
                        tokenName = smaliParser.tokenNames[token.getType()];
                    }
                    System.out.println(tokenName + ": " + token.getText());
                }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smali/src/main/java/com/android/tools/smali/smali/Smali.java`
#### Snippet
```java
                }

                System.out.flush();
            }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `smali/src/main/java/com/android/tools/smali/smali/Smali.java`
#### Snippet
```java

            if (options.printTokens) {
                System.out.println(t.toStringTree());
            }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedMethodImplementation.java`
#### Snippet
```java
        }
        if (debugOffset < 0) {
            System.err.println(String.format("%s: Invalid debug offset", method));
            return DebugInfo.newOrEmpty(dexFile, 0, this);
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBackedMethodImplementation.java`
#### Snippet
```java
        }
        if ((debugOffset + dexFile.getBaseDataOffset()) >= dexFile.getBuffer().buf.length) {
            System.err.println(String.format("%s: Invalid debug offset", method));
            return DebugInfo.newOrEmpty(dexFile, 0, this);
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/ProtoIdItem.java`
#### Snippet
```java
            return String.format("proto_id_item[%d]: %s", protoIndex, protoString);
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
        return String.format("proto_id_item[%d]", protoIndex);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/FieldIdItem.java`
#### Snippet
```java
            return String.format("field_id_item[%d]: %s", fieldIndex, fieldString);
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
        return String.format("field_id_item[%d]", fieldIndex);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/MethodIdItem.java`
#### Snippet
```java
            return String.format("method_id_item[%d]: %s", methodIndex, methodString);
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
        return String.format("method_id_item[%d]", methodIndex);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/TypeListItem.java`
#### Snippet
```java
            return String.format("type_list_item[0x%x]: %s", typeListOffset, typeList);
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
        return String.format("type_list_item[0x%x]", typeListOffset);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/StringIdItem.java`
#### Snippet
```java
            return String.format("string_id_item[%d]: %s", stringIndex, string);
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
        return String.format("string_id_item[%d]", stringIndex);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/StringIdItem.java`
#### Snippet
```java
                    return;
                } catch (Exception ex) {
                    System.err.print("Error while resolving string value at index: ");
                    System.err.print(itemIndex);
                    ex.printStackTrace(System.err);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/StringIdItem.java`
#### Snippet
```java
                } catch (Exception ex) {
                    System.err.print("Error while resolving string value at index: ");
                    System.err.print(itemIndex);
                    ex.printStackTrace(System.err);
                }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/StringIdItem.java`
#### Snippet
```java
                    System.err.print("Error while resolving string value at index: ");
                    System.err.print(itemIndex);
                    ex.printStackTrace(System.err);
                }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/TypeIdItem.java`
#### Snippet
```java
            return String.format("type_id_item[%d]: %s", typeIndex, typeString);
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
        return String.format("type_id_item[%d]", typeIndex);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/AnnotationItem.java`
#### Snippet
```java
            return String.format("annotation_item[0x%x]: %s", annotationItemOffset, annotationType);
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
        return String.format("annotation_item[0x%x]", annotationItemOffset);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/CodeItem.java`
#### Snippet
```java
                }
            } catch (ExceptionWithContext ex) {
                ex.printStackTrace(System.err);
                out.annotate(0, "annotation error: %s", ex.getMessage());
                out.moveTo(end);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/util/DexAnnotator.java`
#### Snippet
```java
                    annotator.annotateSection(this);
                } catch (Exception ex) {
                    System.err.println(String.format("There was an error while dumping the %s section",
                            ItemType.getItemTypeName(mapItem.getType())));
                    ex.printStackTrace(System.err);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/util/DexAnnotator.java`
#### Snippet
```java
                    System.err.println(String.format("There was an error while dumping the %s section",
                            ItemType.getItemTypeName(mapItem.getType())));
                    ex.printStackTrace(System.err);
                }
            }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListClassesCommand.java`
#### Snippet
```java

        if (inputList.size() > 1) {
            System.err.println("Too many files specified");
            usage();
            return;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListClassesCommand.java`
#### Snippet
```java

        for (ClassDef classDef: dexFile.getClasses()) {
            System.out.println(formatter.getType(classDef.getType()));
        }
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DexInputCommand.java`
#### Snippet
```java

        if (file == null || !file.exists() || file.isDirectory()) {
            System.err.println("Can't find file: " + input);
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListDexCommand.java`
#### Snippet
```java

        if (inputList.size() > 1) {
            System.err.println("Too many files specified");
            usage();
            return;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListDexCommand.java`
#### Snippet
```java

        if (!file.exists()) {
            System.err.println(String.format("Could not find the file: %s", input));
            System.exit(-1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListDexCommand.java`
#### Snippet
```java

        for (String entry: entries) {
            System.out.println(entry);
        }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListVtablesCommand.java`
#### Snippet
```java
        String className = "Class " + classProto.getType() + " extends " + classProto.getSuperclass() +
                " : " + methods.size() + " methods\n";
        System.out.write(className.getBytes());
        for (int i = 0; i < methods.size(); i++) {
            Method method = methods.get(i);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListVtablesCommand.java`
#### Snippet
```java
            }
            methodString += ")" + method.getReturnType() + "\n";
            System.out.write(methodString.getBytes());
        }
        System.out.write("\n".getBytes());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListVtablesCommand.java`
#### Snippet
```java
            System.out.write(methodString.getBytes());
        }
        System.out.write("\n".getBytes());
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListVtablesCommand.java`
#### Snippet
```java
                    dexEntry, checkPackagePrivateArgument.checkPackagePrivateAccess, oatVersion);
        } catch (Exception ex) {
            System.err.println("Error occurred while loading class path files.");
            ex.printStackTrace(System.err);
            return null;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListVtablesCommand.java`
#### Snippet
```java
        } catch (Exception ex) {
            System.err.println("Error occurred while loading class path files.");
            ex.printStackTrace(System.err);
            return null;
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListVtablesCommand.java`
#### Snippet
```java

        if (inputList.size() > 1) {
            System.err.println("Too many files specified");
            usage();
            return;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DumpCommand.java`
#### Snippet
```java

        if (inputList.size() > 1) {
            System.err.println("Too many files specified");
            usage();
            return;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DumpCommand.java`
#### Snippet
```java

        try {
            dump(dexFile, System.out);
        } catch (IOException ex) {
            System.err.println("There was an error while dumping the dex file");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DumpCommand.java`
#### Snippet
```java
            dump(dexFile, System.out);
        } catch (IOException ex) {
            System.err.println("There was an error while dumping the dex file");
            ex.printStackTrace(System.err);
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DumpCommand.java`
#### Snippet
```java
        } catch (IOException ex) {
            System.err.println("There was an error while dumping the dex file");
            ex.printStackTrace(System.err);
        }
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `dexlib2/accessorTestGenerator/src/main/java/com/android/tools/smali/dexlib2/AccessorTestGenerator.java`
#### Snippet
```java
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Usage: java com.android.tools.smali.dexlib2.AccessorTestGenerator <output_file>");
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/Main.java`
#### Snippet
```java

    protected static void version() {
        System.out.println("baksmali " + VERSION + " (http://smali.org)");
        System.out.println("Copyright (C) 2010 Ben Gruver (JesusFreke@JesusFreke.com)");
        System.out.println("BSD license (http://www.opensource.org/licenses/bsd-license.php)");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/Main.java`
#### Snippet
```java
    protected static void version() {
        System.out.println("baksmali " + VERSION + " (http://smali.org)");
        System.out.println("Copyright (C) 2010 Ben Gruver (JesusFreke@JesusFreke.com)");
        System.out.println("BSD license (http://www.opensource.org/licenses/bsd-license.php)");
        System.exit(0);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/Main.java`
#### Snippet
```java
        System.out.println("baksmali " + VERSION + " (http://smali.org)");
        System.out.println("Copyright (C) 2010 Ben Gruver (JesusFreke@JesusFreke.com)");
        System.out.println("BSD license (http://www.opensource.org/licenses/bsd-license.php)");
        System.exit(0);
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListDependenciesCommand.java`
#### Snippet
```java

        if (inputList.size() > 1) {
            System.err.println("Too many files specified");
            usage();
            return;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListDependenciesCommand.java`
#### Snippet
```java
            inputStream = new BufferedInputStream(new FileInputStream(input));
        } catch (FileNotFoundException ex) {
            System.err.println("Could not find file: " + input);
            System.exit(-1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListDependenciesCommand.java`
#### Snippet
```java
            OatFile oatFile = OatFile.fromInputStream(inputStream);
            for (String entry: oatFile.getBootClassPath()) {
                System.out.println(entry);
            }
            return;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListDependenciesCommand.java`
#### Snippet
```java
            DexBackedOdexFile odexFile = DexBackedOdexFile.fromInputStream(Opcodes.getDefault(), inputStream);
            for (String entry: odexFile.getDependencies()) {
                System.out.println(entry);
            }
            return;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListDependenciesCommand.java`
#### Snippet
```java
        }

        System.err.println(input + " is not an odex or oat file.");
        System.exit(-1);
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListFieldOffsetsCommand.java`
#### Snippet
```java

        if (inputList.size() > 1) {
            System.err.println("Too many files specified");
            usage();
            return;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListFieldOffsetsCommand.java`
#### Snippet
```java
                SparseArray<FieldReference> fields = classProto.getInstanceFields();
                String className = "Class "  + formatter.getType(classDef.getType()) + " : " + fields.size() + " instance fields\n";
                System.out.write(className.getBytes());
                for (int i=0;i<fields.size();i++) {
                    String field = fields.keyAt(i) + ":" + fields.valueAt(i).getType() + " " + fields.valueAt(i).getName() + "\n";
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListFieldOffsetsCommand.java`
#### Snippet
```java
                for (int i=0;i<fields.size();i++) {
                    String field = fields.keyAt(i) + ":" + fields.valueAt(i).getType() + " " + fields.valueAt(i).getName() + "\n";
                    System.out.write(field.getBytes());
                }
                System.out.write("\n".getBytes());
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListFieldOffsetsCommand.java`
#### Snippet
```java
                    System.out.write(field.getBytes());
                }
                System.out.write("\n".getBytes());
            }
            System.out.close();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListFieldOffsetsCommand.java`
#### Snippet
```java
                System.out.write("\n".getBytes());
            }
            System.out.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListFieldOffsetsCommand.java`
#### Snippet
```java
                    inputFile.getAbsoluteFile().getParentFile(), dexEntry, false);
        } catch (Exception ex) {
            System.err.println("Error occurred while loading class path files.");
            ex.printStackTrace(System.err);
            System.exit(-1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListFieldOffsetsCommand.java`
#### Snippet
```java
        } catch (Exception ex) {
            System.err.println("Error occurred while loading class path files.");
            ex.printStackTrace(System.err);
            System.exit(-1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/HelpCommand.java`
#### Snippet
```java

        if (commands == null || commands.isEmpty()) {
            System.out.println(new HelpFormatter()
                    .width(ConsoleUtil.getConsoleWidth())
                    .format(commandAncestors));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/HelpCommand.java`
#### Snippet
```java
                            ConsoleUtil.getConsoleWidth());
                    for (String line : lines) {
                        System.out.println(line);
                    }
                } else if (cmd.equals("input")) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/HelpCommand.java`
#### Snippet
```java
                            ConsoleUtil.getConsoleWidth());
                    for (String line : lines) {
                        System.out.println(line);
                    }
                } else if (cmd.equals("classpath")) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/HelpCommand.java`
#### Snippet
```java
                            ConsoleUtil.getConsoleWidth());
                    for (String line : lines) {
                        System.out.println(line);
                    }
                } else {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/HelpCommand.java`
#### Snippet
```java
                    JCommander command = ExtendedCommands.getSubcommand(parentJc, cmd);
                    if (command == null) {
                        System.err.println("No such command: " + cmd);
                    } else {
                        printedHelp = true;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/HelpCommand.java`
#### Snippet
```java
                    } else {
                        printedHelp = true;
                        System.out.println(new HelpFormatter()
                                .width(ConsoleUtil.getConsoleWidth())
                                .format(((Command)command.getObjects().get(0)).getCommandHierarchy()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/HelpCommand.java`
#### Snippet
```java
            }
            if (!printedHelp) {
                System.out.println(new HelpFormatter()
                        .width(ConsoleUtil.getConsoleWidth())
                        .format(commandAncestors));
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListReferencesCommand.java`
#### Snippet
```java

        if (inputList.size() > 1) {
            System.err.println("Too many files specified");
            usage();
            return;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListReferencesCommand.java`
#### Snippet
```java

        for (Reference reference: dexFile.getReferences(referenceType)) {
            System.out.println(formatter.getReference(reference));
        }
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/AnalysisArguments.java`
#### Snippet
```java
                File file = new File(dir);
                if (!file.exists()) {
                    System.err.println(String.format("Warning: directory %s does not exist. Ignoring.", dir));
                } else if (!file.isDirectory()) {
                    System.err.println(String.format("Warning: %s is not a directory. Ignoring.", dir));
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/AnalysisArguments.java`
#### Snippet
```java
                    System.err.println(String.format("Warning: directory %s does not exist. Ignoring.", dir));
                } else if (!file.isDirectory()) {
                    System.err.println(String.format("Warning: %s is not a directory. Ignoring.", dir));
                } else {
                    filteredClassPathDirectories.add(dir);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DeodexCommand.java`
#### Snippet
```java
                File inlineTableFile = new File(inlineTable);
                if (!inlineTableFile.exists()) {
                    System.err.println(String.format("Could not find file: %s", inlineTable));
                    System.exit(-1);
                }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DeodexCommand.java`
#### Snippet
```java
                    options.inlineResolver = new CustomInlineMethodResolver(options.classPath, inlineTableFile);
                } catch (IOException ex) {
                    System.err.println(String.format("Error while reading file: %s", inlineTableFile));
                    ex.printStackTrace(System.err);
                    System.exit(-1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DeodexCommand.java`
#### Snippet
```java
                } catch (IOException ex) {
                    System.err.println(String.format("Error while reading file: %s", inlineTableFile));
                    ex.printStackTrace(System.err);
                    System.exit(-1);
                }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
                        inputFile.getAbsoluteFile().getParentFile(), dexEntry, shouldCheckPackagePrivateAccess());
            } catch (Exception ex) {
                System.err.println("\n\nError occurred while loading class path files. Aborting.");
                ex.printStackTrace(System.err);
                System.exit(-1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
            } catch (Exception ex) {
                System.err.println("\n\nError occurred while loading class path files. Aborting.");
                ex.printStackTrace(System.err);
                System.exit(-1);
            }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java

                if (!publicXmlFile.exists()) {
                    System.err.println(String.format("Can't find file: %s", publicXmlFile));
                    System.exit(-1);
                }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
                options.loadResourceIds(resourceFiles);
            } catch (IOException ex) {
                System.err.println("Error while loading resource files:");
                ex.printStackTrace(System.err);
                System.exit(-1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
            } catch (IOException ex) {
                System.err.println("Error while loading resource files:");
                ex.printStackTrace(System.err);
                System.exit(-1);
            } catch (SAXException ex) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
                System.exit(-1);
            } catch (SAXException ex) {
                System.err.println("Error while loading resource files:");
                ex.printStackTrace(System.err);
                System.exit(-1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
            } catch (SAXException ex) {
                System.err.println("Error while loading resource files:");
                ex.printStackTrace(System.err);
                System.exit(-1);
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListHelpCommand.java`
#### Snippet
```java
    public void run() {
        if (commands == null || commands.isEmpty()) {
            System.out.println(new HelpFormatter()
                    .width(ConsoleUtil.getConsoleWidth())
                    .format(commandAncestors));
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListHelpCommand.java`
#### Snippet
```java
                JCommander command = ExtendedCommands.getSubcommand(parentJc, cmd);
                if (command == null) {
                    System.err.println("No such command: " + cmd);
                } else {
                    printedHelp = true;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListHelpCommand.java`
#### Snippet
```java
                } else {
                    printedHelp = true;
                    System.out.println(new HelpFormatter()
                            .width(ConsoleUtil.getConsoleWidth())
                            .format(((Command)command.getObjects().get(0)).getCommandHierarchy()));
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListHelpCommand.java`
#### Snippet
```java
            }
            if (!printedHelp) {
                System.out.println(new HelpFormatter()
                        .width(ConsoleUtil.getConsoleWidth())
                        .format(commandAncestors));
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
                options.registerInfo  |= BaksmaliOptions.FULLMERGE;
            } else {
                System.err.println(String.format("Invalid register info type: %s", registerInfoType));
                usage();
                System.exit(-1);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java

        if (inputList.size() > 1) {
            System.err.println("Too many files specified");
            usage();
            return;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java

        if (showDeodexWarning() && dexFile.supportsOptimizedOpcodes()) {
            StringWrapper.printWrappedString(System.err,
                    "Warning: You are disassembling an odex/oat file without deodexing it. You won't be able to " +
                            "re-assemble the results unless you deodex it. See \"baksmali help deodex\"",
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DisassembleCommand.java`
#### Snippet
```java
        if (!outputDirectoryFile.exists()) {
            if (!outputDirectoryFile.mkdirs()) {
                System.err.println("Can't create the output directory " + outputDir);
                System.exit(-1);
            }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Baksmali.java`
#### Snippet
```java
        if (classDescriptor.charAt(0) != 'L' ||
                classDescriptor.charAt(classDescriptor.length()-1) != ';') {
            System.err.println("Unrecognized class descriptor - " + classDescriptor + " - skipping class");
            return false;
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Baksmali.java`
#### Snippet
```java
            smaliFile = fileNameHandler.getUniqueFilenameForClass(classDescriptor);
        } catch (IOException ex) {
            System.err.println("\n\nError occurred while creating file for class " + classDescriptor);
            ex.printStackTrace();
            return false;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Baksmali.java`
#### Snippet
```java
                    // check again, it's likely it was created in a different thread
                    if (!smaliParent.exists()) {
                        System.err.println("Unable to create directory " + smaliParent.toString() + " - skipping class");
                        return false;
                    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Baksmali.java`
#### Snippet
```java
            if (!smaliFile.exists()){
                if (!smaliFile.createNewFile()) {
                    System.err.println("Unable to create file " + smaliFile.toString() + " - skipping class");
                    return false;
                }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Baksmali.java`
#### Snippet
```java
            classDefinition.writeTo(writer);
        } catch (Exception ex) {
            System.err.println("\n\nError occurred while disassembling class " + classDescriptor.replace('/', '.') + " - skipping class");
            ex.printStackTrace();
            // noinspection ResultOfMethodCallIgnored
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Baksmali.java`
#### Snippet
```java
                    writer.close();
                } catch (Throwable ex) {
                    System.err.println("\n\nError occurred while closing file " + smaliFile.toString());
                    ex.printStackTrace();
                }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/ClassDefinition.java`
#### Snippet
```java
                writer.write("# There is both a direct and virtual method with this signature.\n" +
                             "# You will need to rename one of these methods, including all references.\n");
                System.err.println(String.format("Duplicate direct+virtual method found: %s->%s",
                        classDef.getType(), methodString));
                System.err.println("You will need to rename one of these methods, including all references.");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/ClassDefinition.java`
#### Snippet
```java
                System.err.println(String.format("Duplicate direct+virtual method found: %s->%s",
                        classDef.getType(), methodString));
                System.err.println("You will need to rename one of these methods, including all references.");
            }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/ClassDefinition.java`
#### Snippet
```java
                writer.write("# duplicate field ignored\n");
                fieldWriter = getCommentingWriter(writer);
                System.err.println(String.format("Ignoring duplicate field: %s->%s", classDef.getType(), fieldString));
                setInStaticConstructor = false;
            } else {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/ClassDefinition.java`
#### Snippet
```java
                writer.write("# duplicate field ignored\n");
                fieldWriter = getCommentingWriter(writer);
                System.err.println(String.format("Ignoring duplicate field: %s->%s", classDef.getType(), fieldString));
            } else if (staticFields.contains(fieldString)) {
                System.err.println(String.format("Duplicate static+instance field found: %s->%s",
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/ClassDefinition.java`
#### Snippet
```java
                System.err.println(String.format("Ignoring duplicate field: %s->%s", classDef.getType(), fieldString));
            } else if (staticFields.contains(fieldString)) {
                System.err.println(String.format("Duplicate static+instance field found: %s->%s",
                        classDef.getType(), fieldString));
                System.err.println("You will need to rename one of these fields, including all references.");
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/ClassDefinition.java`
#### Snippet
```java
                System.err.println(String.format("Duplicate static+instance field found: %s->%s",
                        classDef.getType(), fieldString));
                System.err.println("You will need to rename one of these fields, including all references.");

                writer.write("# There is both a static and instance field with this signature.\n" +
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodDefinition.java`
#### Snippet
```java
                    String.format("AnalysisException: %s", analysisException.getMessage()),
                    analysisException.codeAddress, Integer.MIN_VALUE));
            analysisException.printStackTrace(System.err);
        }

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

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary and can be removed
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/AnalyzedInstruction.java`
#### Snippet
```java
            if (o == null || getClass() != o.getClass()) return false;
            PredecessorOverrideKey that = (PredecessorOverrideKey)o;
            return com.google.common.base.Objects.equal(registerNumber, that.registerNumber) &&
                    Objects.equal(analyzedInstruction, that.analyzedInstruction);
        }
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Baksmali.java`
#### Snippet
```java
        } catch (IOException ex) {
            System.err.println("\n\nError occurred while creating file for class " + classDescriptor);
            ex.printStackTrace();
            return false;
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Baksmali.java`
#### Snippet
```java
        } catch (Exception ex) {
            System.err.println("\n\nError occurred while disassembling class " + classDescriptor.replace('/', '.') + " - skipping class");
            ex.printStackTrace();
            // noinspection ResultOfMethodCallIgnored
            smaliFile.delete();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Baksmali.java`
#### Snippet
```java
                } catch (Throwable ex) {
                    System.err.println("\n\nError occurred while closing file " + smaliFile.toString());
                    ex.printStackTrace();
                }
            }
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `Command()` of an abstract class should not be declared 'public'
in `util/src/main/java/com/android/tools/smali/util/jcommander/Command.java`
#### Snippet
```java
    protected final List<JCommander> commandAncestors;

    public Command(@Nonnull List<JCommander> commandAncestors) {
        this.commandAncestors = commandAncestors;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseNullableOffsetPool()` of an abstract class should not be declared 'public'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/BaseNullableOffsetPool.java`
#### Snippet
```java
        implements NullableOffsetSection<Key> {

    public BaseNullableOffsetPool(@Nonnull DexPool dexPool) {
        super(dexPool);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseOffsetPool()` of an abstract class should not be declared 'public'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/BaseOffsetPool.java`
#### Snippet
```java
    OffsetSection<Key> {

    public BaseOffsetPool(@Nonnull DexPool dexPool) {
        super(dexPool);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseIndexPool()` of an abstract class should not be declared 'public'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/BaseIndexPool.java`
#### Snippet
```java
    IndexSection<Key> {

    public BaseIndexPool(@Nonnull DexPool dexPool) {
        super(dexPool);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `StringTypeBasePool()` of an abstract class should not be declared 'public'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/StringTypeBasePool.java`
#### Snippet
```java
        implements NullableIndexSection<CharSequence>, Markable {

    public StringTypeBasePool(@Nonnull DexPool dexPool) {
        super(dexPool);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `EncodedValueWriter()` of an abstract class should not be declared 'public'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/EncodedValueWriter.java`
#### Snippet
```java
    @Nonnull private final AnnotationSection<StringKey, TypeKey, ?, AnnotationElement, EncodedValue> annotationSection;

    public EncodedValueWriter(
            @Nonnull DexDataWriter writer,
            @Nonnull StringSection<StringKey, ?> stringSection,
```

### NonProtectedConstructorInAbstractClass
Constructor `BuilderMapEntryCollection()` of an abstract class should not be declared 'public'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderMapEntryCollection.java`
#### Snippet
```java
    @Nonnull private final Collection<Key> keys;

    public BuilderMapEntryCollection(@Nonnull Collection<Key> keys) {
        this.keys = keys;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `BuilderOffsetInstruction()` of an abstract class should not be declared 'public'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/BuilderOffsetInstruction.java`
#### Snippet
```java
    protected final Label target;

    public BuilderOffsetInstruction(@Nonnull Opcode opcode,
                                    @Nonnull Label target) {
        super(opcode);
```

### NonProtectedConstructorInAbstractClass
Constructor `BuilderDebugItem()` of an abstract class should not be declared 'public'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/BuilderDebugItem.java`
#### Snippet
```java
public abstract class BuilderDebugItem extends ItemWithLocation implements DebugItem {

    public BuilderDebugItem() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `SectionAnnotator()` of an abstract class should not be declared 'public'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/SectionAnnotator.java`
#### Snippet
```java
    protected Map<Integer, String> itemIdentities = Maps.newHashMap();

    public SectionAnnotator(@Nonnull DexAnnotator annotator, @Nonnull MapItem mapItem) {
        this.annotator = annotator;
        this.dexFile = annotator.dexFile;
```

### NonProtectedConstructorInAbstractClass
Constructor `Symbol()` of an abstract class should not be declared 'public'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/OatFile.java`
#### Snippet
```java
        public abstract class Symbol {
            protected final int offset;
            public Symbol(int offset) { this.offset = offset; }
            @Nonnull public abstract String getName();
            public abstract long getValue();
```

### NonProtectedConstructorInAbstractClass
Constructor `SectionHeader()` of an abstract class should not be declared 'public'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/OatFile.java`
#### Snippet
```java
        protected final int offset;
        public static final int TYPE_DYNAMIC_SYMBOL_TABLE = 11;
        public SectionHeader(int offset) { this.offset = offset; }
        @Nonnull public String getName() { return getSectionNameStringTable().getString(readSmallUint(offset)); }
        public int getType() { return readInt(offset + 4); }
```

### NonProtectedConstructorInAbstractClass
Constructor `VariableSizeCollection()` of an abstract class should not be declared 'public'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/VariableSizeCollection.java`
#### Snippet
```java
    private final int size;

    public VariableSizeCollection(@Nonnull DexBuffer buffer, int offset, int size) {
        this.buffer = buffer;
        this.offset = offset;
```

### NonProtectedConstructorInAbstractClass
Constructor `VariableSizeSet()` of an abstract class should not be declared 'public'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/VariableSizeSet.java`
#### Snippet
```java
    private final int size;

    public VariableSizeSet(@Nonnull DexBuffer buffer, int offset, int size) {
        this.buffer = buffer;
        this.offset = offset;
```

### NonProtectedConstructorInAbstractClass
Constructor `VariableSizeList()` of an abstract class should not be declared 'public'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/VariableSizeList.java`
#### Snippet
```java
    private final int size;

    public VariableSizeList(@Nonnull DexBuffer buffer, int offset, int size) {
        this.buffer = buffer;
        this.offset = offset;
```

### NonProtectedConstructorInAbstractClass
Constructor `DexBackedInstruction()` of an abstract class should not be declared 'public'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/instruction/DexBackedInstruction.java`
#### Snippet
```java
    public final int instructionStart;

    public DexBackedInstruction(@Nonnull DexBackedDexFile dexFile,
                                @Nonnull Opcode opcode,
                                int instructionStart) {
```

### NonProtectedConstructorInAbstractClass
Constructor `ImmutableDebugItem()` of an abstract class should not be declared 'public'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/debug/ImmutableDebugItem.java`
#### Snippet
```java
    protected final int codeAddress;

    public ImmutableDebugItem(int codeAddress) {
        this.codeAddress = codeAddress;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `DexInputCommand()` of an abstract class should not be declared 'public'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/DexInputCommand.java`
#### Snippet
```java
    protected DexBackedDexFile dexFile;

    public DexInputCommand(@Nonnull List<JCommander> commandAncestors) {
        super(commandAncestors);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ListReferencesCommand()` of an abstract class should not be declared 'public'
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListReferencesCommand.java`
#### Snippet
```java
    private boolean help;

    public ListReferencesCommand(@Nonnull List<JCommander> commandAncestors, int referenceType) {
        super(commandAncestors);
        this.referenceType = referenceType;
```

### NonProtectedConstructorInAbstractClass
Constructor `ANTLRLexerWithErrorInterface()` of an abstract class should not be declared 'public'
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LexerErrorInterface.java`
#### Snippet
```java
        }

        public ANTLRLexerWithErrorInterface(CharStream input, RecognizerSharedState state) {
            super(input, state);
        }
```

### NonProtectedConstructorInAbstractClass
Constructor `ANTLRLexerWithErrorInterface()` of an abstract class should not be declared 'public'
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LexerErrorInterface.java`
#### Snippet
```java
    //class that implements LexerErrorInterface that we can have the ANTLR parser extend 
    public abstract static class ANTLRLexerWithErrorInterface extends Lexer implements LexerErrorInterface {
        public ANTLRLexerWithErrorInterface() {
        }

```

### NonProtectedConstructorInAbstractClass
Constructor `SparseSwitchTarget()` of an abstract class should not be declared 'public'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Format/SparseSwitchMethodItem.java`
#### Snippet
```java
    private static abstract class SparseSwitchTarget {
        private final int key;
        public SparseSwitchTarget(int key) {
            this.key = key;
        }
```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Function() can be replaced with method reference
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/PoolMethod.java`
#### Snippet
```java
    protected int codeItemOffset = DexPool.NO_OFFSET;

    public static final Function<Method, PoolMethod> TRANSFORM = new Function<Method, PoolMethod>() {
        @Override public PoolMethod apply(Method method) {
            return new PoolMethod(method);
```

### Anonymous2MethodRef
Anonymous new Function\>() can be replaced with method reference
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/pool/ClassPool.java`
#### Snippet
```java

    private static final Function<MethodParameter, Set<? extends Annotation>> PARAMETER_ANNOTATIONS =
            new Function<MethodParameter, Set<? extends Annotation>>() {
                @Override
                public Set<? extends Annotation> apply(MethodParameter input) {
```

### Anonymous2MethodRef
Anonymous new Function() can be replaced with method reference
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassPool.java`
#### Snippet
```java

    private static final Function<BuilderMethodParameter, BuilderAnnotationSet> PARAMETER_ANNOTATIONS =
            new Function<BuilderMethodParameter, BuilderAnnotationSet>() {
                @Override
                public BuilderAnnotationSet apply(BuilderMethodParameter input) {
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `smali/src/main/java/com/android/tools/smali/smali/SmaliMethodParameter.java`
#### Snippet
```java
    @Nullable @Override public String getSignature() { return null; }

    public static final Comparator<WithRegister> COMPARATOR = new Comparator<WithRegister>() {
        @Override public int compare(WithRegister o1, WithRegister o2) {
            return Ints.compare(o1.getRegister(), o2.getRegister());
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `smali/src/main/java/com/android/tools/smali/smali/Smali.java`
#### Snippet
```java

        for (final File file: filesToProcessSet) {
            tasks.add(executor.submit(new Callable<Boolean>() {
                @Override public Boolean call() throws Exception {
                    return assembleSmaliFile(file, dexBuilder, options);
```

### Convert2Lambda
Anonymous new Comparator\>() can be replaced with lambda
in `dexlib2/src/main/java/com/android/tools/smali/util/CollectionUtils.java`
#### Snippet
```java
    public static <T> Comparator<Collection<? extends T>> listComparator(
            @Nonnull final Comparator<? super T> elementComparator) {
        return new Comparator<Collection<? extends T>>() {
            @Override
            public int compare(Collection<? extends T> list1, Collection<? extends T> list2) {
```

### Convert2Lambda
Anonymous new Comparator\>() can be replaced with lambda
in `dexlib2/src/main/java/com/android/tools/smali/util/CollectionUtils.java`
#### Snippet
```java
    public static <T> Comparator<Collection<? extends T>> setComparator(
            @Nonnull final Comparator<? super T> elementComparator) {
        return new Comparator<Collection<? extends T>>() {
            @Override
            public int compare(Collection<? extends T> list1, Collection<? extends T> list2) {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `util/src/main/java/com/android/tools/smali/util/jcommander/HelpFormatter.java`
#### Snippet
```java
        final Pattern pattern = Pattern.compile("^-*(.*)$");

        Collections.sort(parameters, new Comparator<ParameterDescription>() {
            @Override public int compare(ParameterDescription o1, ParameterDescription o2) {
                String s1;
```

### Convert2Lambda
Anonymous new Comparator\>() can be replaced with lambda
in `util/src/main/java/com/android/tools/smali/util/jcommander/HelpFormatter.java`
#### Snippet
```java

                List<Entry<String, JCommander>> entryList = Lists.newArrayList(leafJc.getCommands().entrySet());
                Collections.sort(entryList, new Comparator<Entry<String, JCommander>>() {
                    @Override public int compare(Entry<String, JCommander> o1, Entry<String, JCommander> o2) {
                        return o1.getKey().compareTo(o2.getKey());
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/base/BaseAnnotationElement.java`
#### Snippet
```java
    }

    public static final Comparator<AnnotationElement> BY_NAME = new Comparator<AnnotationElement>() {
        @Override
        public int compare(@Nonnull AnnotationElement element1, @Nonnull AnnotationElement element2) {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/base/BaseAnnotation.java`
#### Snippet
```java
    }

    public static final Comparator<? super Annotation> BY_TYPE = new Comparator<Annotation>() {
        @Override
        public int compare(Annotation annotation1, Annotation annotation2) {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/base/BaseExceptionHandler.java`
#### Snippet
```java


    public static final Comparator<ExceptionHandler> BY_EXCEPTION = new Comparator<ExceptionHandler>() {
        @Override public int compare(ExceptionHandler o1, ExceptionHandler o2) {
            String exceptionType1 = o1.getExceptionType();
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java

    private static Comparator<Map.Entry> toStringKeyComparator =
            new Comparator<Map.Entry>() {
                @Override public int compare(Entry o1, Entry o2) {
                    return o1.getKey().toString().compareTo(o2.getKey().toString());
```

### Convert2Lambda
Anonymous new Comparator\>() can be replaced with lambda
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java

    private static <T extends Comparable<? super T>> Comparator<Map.Entry<? extends T, ?>> comparableKeyComparator() {
        return new Comparator<Entry<? extends T, ?>>() {
            @Override public int compare(Entry<? extends T, ?> o1, Entry<? extends T, ?> o2) {
                return o1.getKey().compareTo(o2.getKey());
```

### Convert2Lambda
Anonymous new Comparator\>() can be replaced with lambda
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java

    private static <T extends Comparable<? super T>> Comparator<Entry<?, ? extends T>> comparableValueComparator() {
        return new Comparator<Entry<?, ? extends T>>() {
            @Override public int compare(Entry<?, ? extends T> o1, Entry<?, ? extends T> o2) {
                return o1.getValue().compareTo(o2.getValue());
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/InstructionWriter.java`
#### Snippet
```java
    }

    private final Comparator<SwitchElement> switchElementComparator = new Comparator<SwitchElement>() {
        @Override public int compare(SwitchElement element1, SwitchElement element2) {
            return Ints.compare(element1.getKey(), element2.getKey());
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
                }

                Comparator<MethodReference> comparator = new Comparator<MethodReference>() {
                    @Override public int compare(MethodReference o1, MethodReference o2) {
                        return Ints.compare(methodOrder.get(o1), methodOrder.get(o2));
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
                private ArrayList<Field> getSortedInstanceFields(@Nonnull ClassDef classDef) {
                    ArrayList<Field> fields = Lists.newArrayList(classDef.getInstanceFields());
                    Collections.sort(fields, new Comparator<Field>() {
                        @Override public int compare(Field field1, Field field2) {
                            int result = Ints.compare(getFieldSortOrder(field1), getFieldSortOrder(field2));
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
                }

                Comparator<MethodReference> comparator = new Comparator<MethodReference>() {
                    @Override public int compare(MethodReference o1, MethodReference o2) {
                        return Ints.compare(methodOrder.get(o1), methodOrder.get(o2));
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/util/DexAnnotator.java`
#### Snippet
```java
        List<MapItem> mapItems = dexFile.getMapItems();
        // sort the map items based on the order defined by sectionAnnotationOrder
        Ordering<MapItem> ordering = Ordering.from(new Comparator<MapItem>() {
            @Override public int compare(MapItem o1, MapItem o2) {
                return Ints.compare(sectionAnnotationOrder.get(o1.getType()), sectionAnnotationOrder.get(o2.getType()));
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Baksmali.java`
#### Snippet
```java
                continue;
            }
            tasks.add(executor.submit(new Callable<Boolean>() {
                @Override public Boolean call() throws Exception {
                    return disassembleClass(classDef, fileNameHandler, options);
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `amt`
in `dexlib2/src/main/java/com/android/tools/smali/util/TwoColumnOutput.java`
#### Snippet
```java
        while (amt > 0) {
            out.write(' ');
            amt--;
        }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `visibility`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/AnnotationVisibility.java`
#### Snippet
```java

    public static int getVisibility(String visibility) {
        visibility = visibility.toLowerCase();
        if (visibility.equals("build")) {
            return BUILD;
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `dexlib2/src/main/java/com/android/tools/smali/util/Utf8Utils.java`
#### Snippet
```java
                case 0x04: case 0x05: case 0x06: case 0x07: {
                    // 0XXXXXXX -- single-byte encoding
                    length--;
                    if (v0 == 0) {
                        // A single zero byte is illegal.
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `dexlib2/src/main/java/com/android/tools/smali/util/Utf8Utils.java`
#### Snippet
```java
                case 0x0c: case 0x0d: {
                    // 110XXXXX -- two-byte encoding
                    length -= 2;
                    if (length < 0) {
                        return throwBadUtf8(v0, at);
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `dexlib2/src/main/java/com/android/tools/smali/util/Utf8Utils.java`
#### Snippet
```java
                case 0x0e: {
                    // 1110XXXX -- three-byte encoding
                    length -= 3;
                    if (length < 0) {
                        return throwBadUtf8(v0, at);
```

### AssignmentToMethodParameter
Assignment to method parameter `utf16Length`
in `dexlib2/src/main/java/com/android/tools/smali/util/Utf8Utils.java`
#### Snippet
```java

        int at = 0;
        for (at = start; utf16Length > 0; utf16Length--) {
            int v0 = bytes[at] & 0xFF;
            char out;
```

### AssignmentToMethodParameter
Assignment to method parameter `output`
in `dexlib2/src/main/java/com/android/tools/smali/util/StringWrapper.java`
#### Snippet
```java
    public static String[] wrapString(@Nonnull String str, int maxWidth, @Nullable String[] output) {
        if (output == null) {
            output = new String[(int)((str.length() / maxWidth) * 1.5d + 1)];
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `output`
in `dexlib2/src/main/java/com/android/tools/smali/util/StringWrapper.java`
#### Snippet
```java

            if (c == '\n') {
                output = addString(output, str.substring(lineStart, i), arrayIndex++);
                lineStart = i+1;
            } else if (i - lineStart == maxWidth) {
```

### AssignmentToMethodParameter
Assignment to method parameter `output`
in `dexlib2/src/main/java/com/android/tools/smali/util/StringWrapper.java`
#### Snippet
```java
                lineStart = i+1;
            } else if (i - lineStart == maxWidth) {
                output = addString(output, str.substring(lineStart, i), arrayIndex++);
                lineStart = i;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `output`
in `dexlib2/src/main/java/com/android/tools/smali/util/StringWrapper.java`
#### Snippet
```java
        }
        if (lineStart != i || i == 0) {
            output = addString(output, str.substring(lineStart), arrayIndex++, output.length+1);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `arr`
in `dexlib2/src/main/java/com/android/tools/smali/util/StringWrapper.java`
#### Snippet
```java
    private static String[] addString(@Nonnull String[] arr, String str, int index, int newLength) {
        if (index >= arr.length) {
            arr = enlargeArray(arr, newLength);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `arr`
in `dexlib2/src/main/java/com/android/tools/smali/util/StringWrapper.java`
#### Snippet
```java
    private static String[] addString(@Nonnull String[] arr, String str, int index) {
        if (index >= arr.length) {
            arr = enlargeArray(arr, (int)(Math.ceil((arr.length + 1) * 1.5)));
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `entry`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/DexFileFactory.java`
#### Snippet
```java

        if (entry.charAt(0) == '/') {
            entry = entry.substring(1);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `targetEntry`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/DexFileFactory.java`
#### Snippet
```java

        if (targetEntry.charAt(0) == '/') {
            targetEntry = targetEntry.substring(1);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexDataWriter.java`
#### Snippet
```java
        do {
            tempBuf[index--] = (byte)((value & 0xFF00000000000000L) >>> 56);
            value <<= 8;
        } while (value != 0);

```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexDataWriter.java`
#### Snippet
```java
            while (value > 0x7f) {
                tempBuf[index++] = (byte)value;
                value >>= 8;
            }
        } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexDataWriter.java`
#### Snippet
```java
            while (value < -0x80) {
                tempBuf[index++] = (byte)value;
                value >>= 8;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexDataWriter.java`
#### Snippet
```java
        do {
            tempBuf[index++] = (byte)value;
            value >>>= 8;
        } while (value != 0);
        writeEncodedValueHeader(valueType, index-1);
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexDataWriter.java`
#### Snippet
```java
            while (value > 0x3f) {
                out.write((value & 0x7f) | 0x80);
                value >>>= 7;
            }
            out.write(value & 0x7f);
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexDataWriter.java`
#### Snippet
```java
            while (value < -0x40) {
                out.write((value & 0x7f) | 0x80);
                value >>= 7;
            }
            out.write(value & 0x7f);
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexDataWriter.java`
#### Snippet
```java
        while ((value & 0xffffffffL) > 0x7f) {
            out.write((value & 0x7f) | 0x80);
            value >>>= 7;
        }
        out.write(value);
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexDataWriter.java`
#### Snippet
```java
        do {
            tempBuf[index--] = (byte)((value & 0xFF000000) >>> 24);
            value <<= 8;
        } while (value != 0);

```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexDataWriter.java`
#### Snippet
```java
            while (value > 0x7f) {
                tempBuf[index++] = (byte)value;
                value >>= 8;
            }
        } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexDataWriter.java`
#### Snippet
```java
            while (value < -0x80) {
                tempBuf[index++] = (byte)value;
                value >>= 8;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `methods`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassDef.java`
#### Snippet
```java
                    @Nullable BuilderArrayEncodedValue staticInitializers) {
        if (methods == null) {
            methods = ImmutableList.of();
        }
        if (staticFields == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `staticFields`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassDef.java`
#### Snippet
```java
        }
        if (staticFields == null) {
            staticFields = ImmutableSortedSet.of();
        }
        if (instanceFields == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `instanceFields`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/BuilderClassDef.java`
#### Snippet
```java
        }
        if (instanceFields == null) {
            instanceFields = ImmutableSortedSet.of();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `parameters`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/DexBuilder.java`
#### Snippet
```java
                                               @Nullable MethodImplementation methodImplementation) {
        if (parameters == null) {
            parameters = ImmutableList.of();
        }
        return new BuilderMethod(methodSection.internMethod(definingClass, name, parameters, returnType),
```

### AssignmentToMethodParameter
Assignment to method parameter `interfaces`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/builder/DexBuilder.java`
#### Snippet
```java
                                                   @Nullable Iterable<? extends BuilderMethod> methods) {
        if (interfaces == null) {
            interfaces = ImmutableList.of();
        } else {
            Set<String> interfaces_copy = Sets.newHashSet(interfaces);
```

### AssignmentToMethodParameter
Assignment to method parameter `nextIndex`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
        Map.Entry<? extends ClassKey, Integer> superEntry =
                classSection.getClassEntryByType(classSection.getSuperclass(key));
        nextIndex = writeClass(indexWriter, offsetWriter, nextIndex, superEntry);

        // then, try to write interfaces
```

### AssignmentToMethodParameter
Assignment to method parameter `nextIndex`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java
        for (TypeKey interfaceTypeKey: typeListSection.getTypes(classSection.getInterfaces(key))) {
            Map.Entry<? extends ClassKey, Integer> interfaceEntry = classSection.getClassEntryByType(interfaceTypeKey);
            nextIndex = writeClass(indexWriter, offsetWriter, nextIndex, interfaceEntry);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `nextIndex`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java

        // now set the index for real
        entry.setValue(nextIndex++);

        // and finally, write the class itself
```

### AssignmentToMethodParameter
Assignment to method parameter `tryBlocks`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/writer/DexWriter.java`
#### Snippet
```java

        if (instructions != null) {
            tryBlocks = TryListBuilder.massageTryBlocks(tryBlocks);

            int outParamCount = 0;
```

### AssignmentToMethodParameter
Assignment to method parameter `codeAddress`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/MutableMethodImplementation.java`
#### Snippet
```java
        do {
            if (codeAddress >= codeAddressToIndex.length) {
                codeAddress = codeAddressToIndex.length - 1;
            }
            index = codeAddressToIndex[codeAddress];
```

### AssignmentToMethodParameter
Assignment to method parameter `codeAddress`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/MutableMethodImplementation.java`
#### Snippet
```java
            index = codeAddressToIndex[codeAddress];
            if (index < 0) {
                codeAddress--;
            } else {
                return index;
```

### AssignmentToMethodParameter
Assignment to method parameter `index2`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/MutableMethodImplementation.java`
#### Snippet
```java
        if (index2 < index1) {
            int tmp = index2;
            index2 = index1;
            index1 = tmp;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `index1`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/builder/MutableMethodImplementation.java`
#### Snippet
```java
            int tmp = index2;
            index2 = index1;
            index1 = tmp;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBuffer.java`
#### Snippet
```java
    public long readLong(int offset) {
        byte[] buf = this.buf;
        offset += baseOffset;
        return (buf[offset] & 0xff) |
                ((buf[offset+1] & 0xff) << 8) |
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBuffer.java`
#### Snippet
```java
    public int readShort(int offset) {
        byte[] buf = this.buf;
        offset += baseOffset;
        return (buf[offset] & 0xff) |
                (buf[offset+1] << 8);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBuffer.java`
#### Snippet
```java
    public int readUshort(int offset) {
        byte[] buf = this.buf;
        offset += baseOffset;
        return (buf[offset] & 0xff) |
                ((buf[offset+1] & 0xff) << 8);
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBuffer.java`
#### Snippet
```java
    public int readInt(int offset) {
        byte[] buf = this.buf;
        offset += baseOffset;
        return (buf[offset] & 0xff) |
                ((buf[offset+1] & 0xff) << 8) |
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBuffer.java`
#### Snippet
```java
    public int readOptionalUint(int offset) {
        byte[] buf = this.buf;
        offset += baseOffset;
        int result = (buf[offset] & 0xff) |
                ((buf[offset+1] & 0xff) << 8) |
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBuffer.java`
#### Snippet
```java
    public int readSmallUint(int offset) {
        byte[] buf = this.buf;
        offset += baseOffset;
        int result = (buf[offset] & 0xff) |
                ((buf[offset+1] & 0xff) << 8) |
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/DexBuffer.java`
#### Snippet
```java
    public int readLongAsSmallUint(int offset) {
        byte[] buf = this.buf;
        offset += baseOffset;
        long result = (buf[offset] & 0xff) |
                ((buf[offset+1] & 0xff) << 8) |
```

### AssignmentToMethodParameter
Assignment to method parameter `bootClassPathEntries`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassPathResolver.java`
#### Snippet
```java

        if (bootClassPathEntries == null) {
            bootClassPathEntries = getDefaultBootClassPath(dexEntry, dexFile.getOpcodes().api);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `destRegisterType`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
            if (BooleanCategories.get(source1RegisterType.category) &&
                    BooleanCategories.get(source2RegisterType.category)) {
                destRegisterType = RegisterType.BOOLEAN_TYPE;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `destRegisterType`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
                int literal = ((NarrowLiteralInstruction)analyzedInstruction.instruction).getNarrowLiteral();
                if (literal == 0 || literal == 1) {
                    destRegisterType = RegisterType.BOOLEAN_TYPE;
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `destRegisterType`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/MethodAnalyzer.java`
#### Snippet
```java
            if (BooleanCategories.get(source1RegisterType.category) &&
                    BooleanCategories.get(source2RegisterType.category)) {
                destRegisterType = RegisterType.BOOLEAN_TYPE;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `dexVersion`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/raw/HeaderItem.java`
#### Snippet
```java
            int digit = dexVersion % 10;
            magic[i] = (byte)('0' + digit);
            dexVersion /= 10;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `localMethods`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/ClassProto.java`
#### Snippet
```java
            ArrayList<Method> methods = Lists.newArrayList(localMethods);
            Collections.sort(methods);
            localMethods = methods;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `reader`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/util/DebugInfo.java`
#### Snippet
```java
        public VariableSizeIterator<String> getParameterNames(@Nullable DexReader reader) {
            if (reader == null) {
                reader = dexFile.getDataBuffer().readerAt(debugInfoOffset);
                reader.skipUleb128();
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/util/ParamUtil.java`
#### Snippet
```java
                return index+1;
            case 'L':
                while (str.charAt(index++) != ';') {}
                return index;
            case '[':
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/util/ParamUtil.java`
#### Snippet
```java
                return index;
            case '[':
                while (str.charAt(index++) != '[') {}
                return findTypeEnd(str, index);
            default:
```

### AssignmentToMethodParameter
Assignment to method parameter `fields`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableClassDef.java`
#### Snippet
```java
                             @Nullable Iterable<? extends Method> methods) {
        if (fields == null) {
            fields = ImmutableList.of();
        }
        if (methods == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `methods`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/ImmutableClassDef.java`
#### Snippet
```java
        }
        if (methods == null) {
            methods = ImmutableList.of();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `checkPackagePrivateAccess`
in `baksmali/src/main/java/com/android/tools/smali/baksmali/AnalysisArguments.java`
#### Snippet
```java
        if (oatVersion == NOT_SPECIFIED) {
            if (container instanceof OatFile) {
                checkPackagePrivateAccess = true;
                oatVersion = ((OatFile) container).getOatVersion();
            } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `oatVersion`
in `baksmali/src/main/java/com/android/tools/smali/baksmali/AnalysisArguments.java`
#### Snippet
```java
            if (container instanceof OatFile) {
                checkPackagePrivateAccess = true;
                oatVersion = ((OatFile) container).getOatVersion();
            } else {
                oatVersion = VersionMap.mapApiToArtVersion(dexEntry.getDexFile().getOpcodes().api);
```

### AssignmentToMethodParameter
Assignment to method parameter `oatVersion`
in `baksmali/src/main/java/com/android/tools/smali/baksmali/AnalysisArguments.java`
#### Snippet
```java
                oatVersion = ((OatFile) container).getOatVersion();
            } else {
                oatVersion = VersionMap.mapApiToArtVersion(dexEntry.getDexFile().getOpcodes().api);
            }
        } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `checkPackagePrivateAccess`
in `baksmali/src/main/java/com/android/tools/smali/baksmali/AnalysisArguments.java`
#### Snippet
```java
        } else {
            // this should always be true for ART
            checkPackagePrivateAccess = true;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `oatVersion`
in `baksmali/src/main/java/com/android/tools/smali/baksmali/AnalysisArguments.java`
#### Snippet
```java

        if (oatVersion == 0 && container instanceof OatFile) {
            oatVersion = ((OatFile) container).getOatVersion();
        }
        return new ClassPath(resolver.getResolvedClassProviders(), checkPackagePrivateAccess, oatVersion);
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/IndentingWriter.java`
#### Snippet
```java
                beginningOfLine = true;
                pos++;
                start = pos;
            } else {
                pos++;
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/IndentingWriter.java`
#### Snippet
```java
                writer.write(newLine);
                beginningOfLine = true;
                start = pos+1;
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `baksmali/src/main/java/com/android/tools/smali/baksmali/formatter/BaksmaliWriter.java`
#### Snippet
```java
            buffer[bufferIndex--] = (char)(digit + '0');

            value = value / 10;
        } while (value != 0);

```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `baksmali/src/main/java/com/android/tools/smali/baksmali/formatter/BaksmaliWriter.java`
#### Snippet
```java
            }

            value >>>= 4;
        } while (value != 0);

```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `baksmali/src/main/java/com/android/tools/smali/baksmali/formatter/BaksmaliWriter.java`
#### Snippet
```java
            buffer[bufferIndex--] = (char)(digit + '0');

            value = value / 10;
        } while (value != 0);

```

### AssignmentToMethodParameter
Assignment to method parameter `file`
in `third_party/util/src/main/java/com/android/tools/smali/util/PathUtil.java`
#### Snippet
```java
            }

            file = parentFile;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `baseFile`
in `third_party/util/src/main/java/com/android/tools/smali/util/PathUtil.java`
#### Snippet
```java
    public static File getRelativeFile(File baseFile, File fileToRelativize) throws IOException {
        if (baseFile.isFile()) {
            baseFile = baseFile.getParentFile();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `outOffset`
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/Hex.java`
#### Snippet
```java
            }
            sb.append(Hex.u1(arr[offset]));
            outOffset++;
            offset++;
            col++;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/Hex.java`
#### Snippet
```java
            sb.append(Hex.u1(arr[offset]));
            outOffset++;
            offset++;
            col++;
            if (col == bpl) {
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/Hex.java`
#### Snippet
```java
                col = 0;
            }
            length--;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `v`
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/Hex.java`
#### Snippet
```java
        for (int i = 0; i < 16; i++) {
            result[15 - i] = Character.forDigit((int) v & 0x0f, 16);
            v >>= 4;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `v`
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/Hex.java`
#### Snippet
```java
        if (v < 0) {
            result[0] = '-';
            v = -v;
        } else {
            result[0] = '+';
```

### AssignmentToMethodParameter
Assignment to method parameter `v`
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/Hex.java`
#### Snippet
```java
        for (int i = 0; i < 16; i++) {
            result[16 - i] = Character.forDigit((int) v & 0x0f, 16);
            v >>= 4;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `v`
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/Hex.java`
#### Snippet
```java
        for (int i = 0; i < 8; i++) {
            result[7 - i] = Character.forDigit(v & 0x0f, 16);
            v >>= 4;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `v`
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/Hex.java`
#### Snippet
```java
        if (v < 0) {
            result[0] = '-';
            v = -v;
        } else {
            result[0] = '+';
```

### AssignmentToMethodParameter
Assignment to method parameter `v`
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/Hex.java`
#### Snippet
```java
        for (int i = 0; i < 8; i++) {
            result[8 - i] = Character.forDigit(v & 0x0f, 16);
            v >>= 4;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `v`
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/Hex.java`
#### Snippet
```java
        for (int i = 0; i < 4; i++) {
            result[3 - i] = Character.forDigit(v & 0x0f, 16);
            v >>= 4;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `v`
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/Hex.java`
#### Snippet
```java
        if (v < 0) {
            result[0] = '-';
            v = -v;
        } else {
            result[0] = '+';
```

### AssignmentToMethodParameter
Assignment to method parameter `v`
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/Hex.java`
#### Snippet
```java
        for (int i = 0; i < 2; i++) {
            result[2 - i] = Character.forDigit(v & 0x0f, 16);
            v >>= 4;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `v`
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/Hex.java`
#### Snippet
```java
        for (int i = 0; i < 2; i++) {
            result[1 - i] = Character.forDigit(v & 0x0f, 16);
            v >>= 4;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `v`
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/Hex.java`
#### Snippet
```java
        if (v < 0) {
            result[0] = '-';
            v = -v;
        } else {
            result[0] = '+';
```

### AssignmentToMethodParameter
Assignment to method parameter `v`
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/Hex.java`
#### Snippet
```java
        for (int i = 0; i < 4; i++) {
            result[4 - i] = Character.forDigit(v & 0x0f, 16);
            v >>= 4;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `v`
in `third_party/dexlib2/src/main/java/com/android/tools/smali/util/Hex.java`
#### Snippet
```java
        for (int i = 0; i < 6; i++) {
            result[5 - i] = Character.forDigit(v & 0x0f, 16);
            v >>= 4;
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LiteralTools.java`
#### Snippet
```java
        for (int i=0; value != 0; i++) {
            bytes[i] = (byte)value;
            value = value >>> 8;
        }
        return bytes;
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `third_party/smali/src/main/java/com/android/tools/smali/smali/LiteralTools.java`
#### Snippet
```java
        for (int i=0; value != 0; i++) {
            bytes[i] = (byte)value;
            value = value >>> 8;
        }
        return bytes;
```

### AssignmentToMethodParameter
Assignment to method parameter `writer`
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Format/PackedSwitchMethodItem.java`
#### Snippet
```java
    public boolean writeTo(BaksmaliWriter writer) throws IOException {
        if (commentedOut) {
            writer = methodDef.classDef.getCommentingWriter(writer);
        }
        writer.write(".packed-switch ");
```

### AssignmentToMethodParameter
Assignment to method parameter `writer`
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Format/SparseSwitchMethodItem.java`
#### Snippet
```java
    public boolean writeTo(BaksmaliWriter writer) throws IOException {
        if (commentedOut) {
            writer = methodDef.classDef.getCommentingWriter(writer);
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `bytesToRemove`
in `third_party/util/src/main/java/com/android/tools/smali/util/ClassFileNameHandler.java`
#### Snippet
```java
    static String shortenPathComponent(@Nonnull String pathComponent, int bytesToRemove) {
        // We replace the removed part with a #, so we need to remove 1 extra char
        bytesToRemove++;

        int[] codePoints;
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `dexlib2/src/main/java/com/android/tools/smali/util/ExceptionWithContext.java`
#### Snippet
```java
    private static String formatMessage(String message, Object... formatArgs) {
        if (message == null) {
            return null;
        }
        return String.format(message, formatArgs);
```

### ReturnNull
Return of `null`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/dexbacked/OatFile.java`
#### Snippet
```java
                return new OatDexEntry(filename, buf, dexOffset);
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/immutable/value/ImmutableEncodedValueFactory.java`
#### Snippet
```java
            default:
                Preconditions.checkArgument(false);
                return null;
        }
    }
```

### ReturnNull
Return of `null`
in `baksmali/src/main/java/com/android/tools/smali/baksmali/ListVtablesCommand.java`
#### Snippet
```java
            System.err.println("Error occurred while loading class path files.");
            ex.printStackTrace(System.err);
            return null;
        }

```

### ReturnNull
Return of `null`
in `third_party/util/src/main/java/com/android/tools/smali/util/ConsoleUtil.java`
#### Snippet
```java
                return buffer.toString();
            }
            return null;
        } catch (Exception ex) {
            return null;
```

### ReturnNull
Return of `null`
in `third_party/util/src/main/java/com/android/tools/smali/util/ConsoleUtil.java`
#### Snippet
```java
            return null;
        } catch (Exception ex) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/Format/OffsetInstructionFormatMethodItem.java`
#### Snippet
```java

        assert false;
        return null;
    }
}
```

## RuleId[id=UseCompareMethod]
### UseCompareMethod
Expression can be replaced with 'Integer.compare'
in `dexlib2/src/main/java/com/android/tools/smali/dexlib2/analysis/AnalyzedInstruction.java`
#### Snippet
```java

    public int compareTo(@Nonnull AnalyzedInstruction analyzedInstruction) {
        if (instructionIndex < analyzedInstruction.instructionIndex) {
            return -1;
        } else if (instructionIndex == analyzedInstruction.instructionIndex) {
```

### UseCompareMethod
Expression can be replaced with 'Integer.compare'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodItem.java`
#### Snippet
```java

    public int compareTo(MethodItem methodItem) {
        int result = ((Integer) codeAddress).compareTo(methodItem.codeAddress);

        if (result == 0){
```

### UseCompareMethod
Expression can be replaced with 'Double.compare'
in `third_party/baksmali/src/main/java/com/android/tools/smali/baksmali/Adaptors/MethodItem.java`
#### Snippet
```java

        if (result == 0){
            return ((Double)getSortOrder()).compareTo(methodItem.getSortOrder());
        }
        return result;
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
    // values and minApis provide a mapping of api -> bytecode value.
    // the apis in minApis are guaranteed to be
    public final RangeMap<Integer, Short> apiToValueMap;
    public final RangeMap<Integer, Short> artVersionToValueMap;

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

