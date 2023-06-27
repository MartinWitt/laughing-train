# intellij-deps-asm 
 
# Bad smells
I found 287 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DuplicateBranchesInSwitch | 62 | false |
| JavadocReference | 32 | false |
| DuplicatedCode | 30 | false |
| PointlessBitwiseExpression | 27 | false |
| AutoCloseableResource | 26 | false |
| Deprecation | 18 | false |
| ConstantValue | 16 | false |
| DefaultAnnotationParam | 10 | false |
| FieldMayBeFinal | 7 | false |
| DataFlowIssue | 6 | false |
| JavadocLinkAsPlainText | 6 | false |
| JavadocDeclaration | 4 | false |
| ConfusingMainMethod | 4 | false |
| UnnecessaryLocalVariable | 4 | true |
| FinalMethodInFinalClass | 3 | false |
| IfStatementWithIdenticalBranches | 3 | false |
| UnnecessaryContinue | 3 | false |
| UnusedAssignment | 3 | false |
| ManualArrayToCollectionCopy | 2 | false |
| UnnecessarySemicolon | 2 | false |
| CommentedOutCode | 2 | false |
| RegExpRedundantEscape | 2 | false |
| IOStreamConstructor | 2 | false |
| RedundantMethodOverride | 2 | false |
| RedundantCast | 2 | false |
| MismatchedArrayReadWrite | 1 | false |
| DoubleNegation | 1 | false |
| UnaryPlus | 1 | false |
| EmptyStatementBody | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| ManualMinMaxCalculation | 1 | false |
| TrivialIf | 1 | false |
| ListRemoveInLoop | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `references` are written to, but never read
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/MemoryProfiler.java`
#### Snippet
```java
  private static final Logger LOGGER = Logger.getLogger(MemoryProfiler.class.getName());

  private static Object[] references; // NOPMD(UnusedPrivateField): false positive.
  private static int referenceCount;

```

## RuleId[id=DoubleNegation]
### DoubleNegation
Double negation in `hasDeprecatedAttribute != ((accessFlags & Opcodes.ACC_DEPRECATED) != 0)`
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
        || descriptorIndex != this.descriptorIndex
        || signatureIndex != this.signatureIndex
        || hasDeprecatedAttribute != ((accessFlags & Opcodes.ACC_DEPRECATED) != 0)) {
      return false;
    }
```

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/FieldWriter.java`
#### Snippet
```java
  /**
   * The last runtime invisible type annotation of this field. The previous ones can be accessed
   * with the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/FieldWriter.java`
#### Snippet
```java
  /**
   * The last runtime invisible annotation of this field. The previous ones can be accessed with the
   * {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeInvisibleAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/FieldWriter.java`
#### Snippet
```java
  /**
   * The last runtime visible annotation of this field. The previous ones can be accessed with the
   * {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeVisibleAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/FieldWriter.java`
#### Snippet
```java
  /**
   * The last runtime visible type annotation of this field. The previous ones can be accessed with
   * the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeVisibleTypeAnnotation;
```

### JavadocReference
Symbol `computeMaxStackAndLocal` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/Label.java`
#### Snippet
```java
  /**
   * The number of elements in the input stack of the basic block corresponding to this label. This
   * field is computed in {@link MethodWriter#computeMaxStackAndLocal}.
   */
  short inputStackSize;
```

### JavadocReference
Symbol `computeMaxStackAndLocal` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/Label.java`
#### Snippet
```java
   * several subroutines, this is the id of the "oldest" subroutine that contains it (with the
   * convention that a subroutine calling another one is "older" than the callee). This field is
   * computed in {@link MethodWriter#computeMaxStackAndLocal}, if the method contains JSR
   * instructions.
   */
```

### JavadocReference
Symbol `computeAllFrames` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/Label.java`
#### Snippet
```java
   * this is not used in practice).
   *
   * <p>List of labels are used in {@link MethodWriter#computeAllFrames} and {@link
   * MethodWriter#computeMaxStackAndLocal} to compute stack map frames and the maximum stack size,
   * respectively, as well as in {@link #markSubroutine} and {@link #addSubroutineRetSuccessors} to
```

### JavadocReference
Symbol `computeMaxStackAndLocal` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/Label.java`
#### Snippet
```java
   *
   * <p>List of labels are used in {@link MethodWriter#computeAllFrames} and {@link
   * MethodWriter#computeMaxStackAndLocal} to compute stack map frames and the maximum stack size,
   * respectively, as well as in {@link #markSubroutine} and {@link #addSubroutineRetSuccessors} to
   * compute the basic blocks belonging to subroutines and their outgoing edges. Outside of these
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/RecordComponentWriter.java`
#### Snippet
```java
  /**
   * The last runtime visible type annotation of this record component. The previous ones can be
   * accessed with the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeVisibleTypeAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/RecordComponentWriter.java`
#### Snippet
```java
  /**
   * The last runtime visible annotation of this record component. The previous ones can be accessed
   * with the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeVisibleAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/RecordComponentWriter.java`
#### Snippet
```java
  /**
   * The last runtime invisible annotation of this record component. The previous ones can be
   * accessed with the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeInvisibleAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/RecordComponentWriter.java`
#### Snippet
```java
  /**
   * The last runtime invisible type annotation of this record component. The previous ones can be
   * accessed with the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
```

### JavadocReference
Symbol `frames` is inaccessible from here
in `asm-util/src/main/java/org/objectweb/asm/util/CheckFrameAnalyzer.java`
#### Snippet
```java
  /**
   * Expands the {@link FrameNode} "instructions" of the given method into {@link Frame} objects and
   * stores them at the corresponding indices of the {@link #frames} array. The expanded frames are
   * also associated with the label and line number nodes immediately preceding each frame node.
   *
```

### JavadocReference
Cannot resolve symbol `expandFrame`
in `asm-util/src/main/java/org/objectweb/asm/util/CheckFrameAnalyzer.java`
#### Snippet
```java

  /**
   * The number of locals in the last stack map frame processed by {@link expandFrame}. Long and
   * double values are represented with two elements.
   */
```

### JavadocReference
Symbol `frames` is inaccessible from here
in `asm-util/src/main/java/org/objectweb/asm/util/CheckFrameAnalyzer.java`
#### Snippet
```java
   * @param insnIndex an instruction index.
   * @param frame a frame. This frame is left unchanged by this method.
   * @param requireFrame whether a frame must already exist or not in {@link #frames} at
   *     'insnIndex'.
   * @throws AnalyzerException if the frames have incompatible sizes or if the frame at 'insnIndex'
```

### JavadocReference
Symbol `computeAllFrames` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/Frame.java`
#### Snippet
```java
 *   <li>After all instructions have been visited, a fix point algorithm is used in MethodWriter to
 *       compute the "input frame" of each basic block (i.e. the stack map frame at the beginning of
 *       the basic block). See {@link MethodWriter#computeAllFrames}.
 * </ul>
 *
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
   * The runtime visible parameter annotations of this method. Each array element contains the last
   * annotation of a parameter (which can be {@literal null} - the previous ones can be accessed
   * with the {@link AnnotationWriter#previousAnnotation} field). May be {@literal null}.
   */
  private AnnotationWriter[] lastRuntimeVisibleParameterAnnotations;
```

### JavadocReference
Cannot resolve symbol `COMPUTE_MAX_STACK_AND_LOCAL_FROM_FRAMES`
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
  /**
   * Indicates what must be computed. Must be one of {@link #COMPUTE_ALL_FRAMES}, {@link
   * #COMPUTE_INSERTED_FRAMES}, {@link COMPUTE_MAX_STACK_AND_LOCAL_FROM_FRAMES}, {@link
   * #COMPUTE_MAX_STACK_AND_LOCAL} or {@link #COMPUTE_NOTHING}.
   */
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
  /**
   * The last runtime visible type annotation of this method. The previous ones can be accessed with
   * the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeVisibleTypeAnnotation;
```

### JavadocReference
Symbol `CONSTANT_KIND` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
   * operand stack elements. In summary frame[0] = offset, frame[1] = numLocal, frame[2] = numStack.
   * Local variables and operand stack entries contain abstract types, as defined in {@link Frame},
   * but restricted to {@link Frame#CONSTANT_KIND}, {@link Frame#REFERENCE_KIND} or {@link
   * Frame#UNINITIALIZED_KIND} abstract types. Long and double types use only one array entry.
   */
```

### JavadocReference
Symbol `REFERENCE_KIND` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
   * operand stack elements. In summary frame[0] = offset, frame[1] = numLocal, frame[2] = numStack.
   * Local variables and operand stack entries contain abstract types, as defined in {@link Frame},
   * but restricted to {@link Frame#CONSTANT_KIND}, {@link Frame#REFERENCE_KIND} or {@link
   * Frame#UNINITIALIZED_KIND} abstract types. Long and double types use only one array entry.
   */
```

### JavadocReference
Symbol `UNINITIALIZED_KIND` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
   * Local variables and operand stack entries contain abstract types, as defined in {@link Frame},
   * but restricted to {@link Frame#CONSTANT_KIND}, {@link Frame#REFERENCE_KIND} or {@link
   * Frame#UNINITIALIZED_KIND} abstract types. Long and double types use only one array entry.
   */
  private int[] currentFrame;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
  /**
   * The last runtime invisible type annotation of this method. The previous ones can be accessed
   * with the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
  /**
   * The last runtime visible type annotation of the Code attribute. The previous ones can be
   * accessed with the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastCodeRuntimeVisibleTypeAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
   * The runtime invisible parameter annotations of this method. Each array element contains the
   * last annotation of a parameter (which can be {@literal null} - the previous ones can be
   * accessed with the {@link AnnotationWriter#previousAnnotation} field). May be {@literal null}.
   */
  private AnnotationWriter[] lastRuntimeInvisibleParameterAnnotations;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
  /**
   * The last runtime invisible annotation of this method. The previous ones can be accessed with
   * the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeInvisibleAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
  /**
   * The last runtime visible annotation of this method. The previous ones can be accessed with the
   * {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeVisibleAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
  /**
   * The last runtime invisible type annotation of the Code attribute. The previous ones can be
   * accessed with the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastCodeRuntimeInvisibleTypeAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/ClassWriter.java`
#### Snippet
```java
  /**
   * The last runtime visible type annotation of this class. The previous ones can be accessed with
   * the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeVisibleTypeAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/ClassWriter.java`
#### Snippet
```java
  /**
   * The last runtime invisible annotation of this class. The previous ones can be accessed with the
   * {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeInvisibleAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/ClassWriter.java`
#### Snippet
```java
  /**
   * The last runtime visible annotation of this class. The previous ones can be accessed with the
   * {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeVisibleAnnotation;
```

### JavadocReference
Symbol `previousAnnotation` is inaccessible from here
in `asm/src/main/java/org/objectweb/asm/ClassWriter.java`
#### Snippet
```java
  /**
   * The last runtime invisible type annotation of this class. The previous ones can be accessed
   * with the {@link AnnotationWriter#previousAnnotation} field. May be {@literal null}.
   */
  private AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
```

## RuleId[id=ManualArrayToCollectionCopy]
### ManualArrayToCollectionCopy
Manual array to collection copy
in `asm-tree/src/main/java/org/objectweb/asm/tree/Util.java`
#### Snippet
```java
    }
    ArrayList<T> list = new ArrayList<>(array.length);
    for (T t : array) {
      list.add(t); // NOPMD(UseArraysAsList): we want a modifiable list.
    }
```

### ManualArrayToCollectionCopy
Manual array to collection copy
in `asm-tree/src/main/java/org/objectweb/asm/tree/Util.java`
#### Snippet
```java
  static <T> List<T> asArrayList(final int length, final T[] array) {
    List<T> list = new ArrayList<>(length);
    for (int i = 0; i < length; ++i) {
      list.add(array[i]); // NOPMD(UseArraysAsList): we convert a part of the array.
    }
```

## RuleId[id=UnaryPlus]
### UnaryPlus
Unary `+` operator
in `asm/src/main/java/org/objectweb/asm/Frame.java`
#### Snippet
```java

  /** The constant to be added to an abstract type to get one with one more array dimension. */
  private static final int ARRAY_OF = +1 << DIM_SHIFT;

  /** The constant to be added to an abstract type to get one with one less array dimension. */
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `asm/src/main/java/org/objectweb/asm/Constants.java`
#### Snippet
```java
    }
    int minorVersion;
    try (DataInputStream callerClassStream = new DataInputStream(classInputStream); ) {
      callerClassStream.readInt();
      minorVersion = callerClassStream.readUnsignedShort();
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `asm-util/src/main/java/org/objectweb/asm/util/CheckSignatureAdapter.java`
#### Snippet
```java
    SIMPLE_TYPE,
    CLASS_TYPE,
    END;
  }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Dereference of `findOwner(instructions.indexOf(labelNode))` may produce `NullPointerException`
in `asm-commons/src/main/java/org/objectweb/asm/commons/JSRInlinerAdapter.java`
#### Snippet
```java
      // findOwner should never return null, because owner is null only if an instruction cannot be
      // reached from this subroutine.
      return findOwner(instructions.indexOf(labelNode)).clonedLabels.get(labelNode);
    }

```

### DataFlowIssue
Dereference of `directory.listFiles()` may produce `NullPointerException`
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AbstractBenchmark.java`
#### Snippet
```java
  private static void findClasses(final File directory, final ArrayList<byte[]> classFiles)
      throws IOException {
    for (File file : directory.listFiles()) {
      if (file.isDirectory()) {
        findClasses(file, classFiles);
```

### DataFlowIssue
Argument `getResourceAsStream(name.replace('.', '/') + ".class")` might be null
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AbstractBenchmark.java`
#### Snippet
```java
        byte[] classFile;
        try {
          classFile = readInputStream(getResourceAsStream(name.replace('.', '/') + ".class"));
        } catch (IOException e) {
          throw new ClassNotFoundException(name, e);
```

### DataFlowIssue
Dereference of `listOfBlocksToProcess` may produce `NullPointerException`
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
    // graph, and add these blocks to the list of blocks to process (if not already done).
    Label listOfBlocksToProcess = firstBasicBlock;
    listOfBlocksToProcess.nextListElement = Label.EMPTY_LIST;
    int maxStackSize = maxStack;
    while (listOfBlocksToProcess != Label.EMPTY_LIST) {
```

### DataFlowIssue
Method invocation `getCpInfo` may produce `NullPointerException`
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
     */
    <C extends CpInfo> C getCpInfo(final int cpIndex, final Class<C> cpInfoType) {
      return classContext.getCpInfo(cpIndex, cpInfoType);
    }

```

### DataFlowIssue
Method `readCode` is too complex to analyze by data flow algorithm
in `asm/src/main/java/org/objectweb/asm/ClassReader.java`
#### Snippet
```java
   *     its attribute_name_index and attribute_length fields.
   */
  private void readCode(
      final MethodVisitor methodVisitor, final Context context, final int codeOffset) {
    int currentOffset = codeOffset;
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `asm/src/main/java/org/objectweb/asm/ClassReader.java`
#### Snippet
```java
    // Check the class' major_version. This field is after the magic and minor_version fields, which
    // use 4 and 2 bytes respectively.
    if (checkClassVersion && readShort(classFileOffset + 6) > Opcodes.V21) {
      //[JB: accept any version]
      //throw new IllegalArgumentException(
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `asm-util/src/main/java/org/objectweb/asm/util/CheckClassAdapter.java`
#### Snippet
```java
  private static int checkTypeVariableSignature(final String signature, final int startPos) {
    // From https://docs.oracle.com/javase/specs/jvms/se9/html/jvms-4.html#jvms-4.7.9.1:
    // TypeVariableSignature:
    //  T Identifier ;
    int pos = startPos;
```

### CommentedOutCode
Commented out code (2 lines)
in `asm/src/main/java/org/objectweb/asm/ClassReader.java`
#### Snippet
```java
    if (checkClassVersion && readShort(classFileOffset + 6) > Opcodes.V21) {
      //[JB: accept any version]
      //throw new IllegalArgumentException(
      //    "Unsupported class file major version " + readShort(classFileOffset + 6));
    }
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\(` in RegExp
in `asm-util/src/main/java/org/objectweb/asm/util/ASMifier.java`
#### Snippet
```java
      } else {
        text.add("package asm." + name.substring(0, lastSlashIndex).replace('/', '.') + ";\n");
        simpleName = name.substring(lastSlashIndex + 1).replaceAll("[-\\(\\)]", "_");
      }
    }
```

### RegExpRedundantEscape
Redundant character escape `\\)` in RegExp
in `asm-util/src/main/java/org/objectweb/asm/util/ASMifier.java`
#### Snippet
```java
      } else {
        text.add("package asm." + name.substring(0, lastSlashIndex).replace('/', '.') + ";\n");
        simpleName = name.substring(lastSlashIndex + 1).replaceAll("[-\\(\\)]", "_");
      }
    }
```

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `asm/src/main/java/org/objectweb/asm/FieldWriter.java`
#### Snippet
```java
   * @param attributePrototypes a set of attribute prototypes.
   */
  final void collectAttributePrototypes(final Attribute.Set attributePrototypes) {
    attributePrototypes.addAttributes(firstAttribute);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `asm/src/main/java/org/objectweb/asm/RecordComponentWriter.java`
#### Snippet
```java
   * @param attributePrototypes a set of attribute prototypes.
   */
  final void collectAttributePrototypes(final Attribute.Set attributePrototypes) {
    attributePrototypes.addAttributes(firstAttribute);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
   * @param attributePrototypes a set of attribute prototypes.
   */
  final void collectAttributePrototypes(final Attribute.Set attributePrototypes) {
    attributePrototypes.addAttributes(firstAttribute);
    attributePrototypes.addAttributes(firstCodeAttribute);
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/BasicInterpreter.java`
#### Snippet
```java
        return newValue(Type.getType("[" + Type.getObjectType(((TypeInsnNode) insn).desc)));
      case ARRAYLENGTH:
        return BasicValue.INT_VALUE;
      case ATHROW:
        return null;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/BasicInterpreter.java`
#### Snippet
```java
        return BasicValue.INT_VALUE;
      case ATHROW:
        return null;
      case CHECKCAST:
        return newValue(Type.getObjectType(((TypeInsnNode) insn).desc));
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/BasicInterpreter.java`
#### Snippet
```java
        return newValue(Type.getObjectType(((TypeInsnNode) insn).desc));
      case INSTANCEOF:
        return BasicValue.INT_VALUE;
      case MONITORENTER:
      case MONITOREXIT:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/BasicInterpreter.java`
#### Snippet
```java
      case IFNULL:
      case IFNONNULL:
        return null;
      default:
        throw new AssertionError();
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/BasicInterpreter.java`
#### Snippet
```java
      case DCMPL:
      case DCMPG:
        return BasicValue.INT_VALUE;
      case IF_ICMPEQ:
      case IF_ICMPNE:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/BasicInterpreter.java`
#### Snippet
```java
      case BIPUSH:
      case SIPUSH:
        return BasicValue.INT_VALUE;
      case LDC:
        Object value = ((LdcInsnNode) insn).cst;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Frame.java`
#### Snippet
```java
      case Opcodes.I2C:
      case Opcodes.I2S:
        push(interpreter.unaryOperation(insn, pop()));
        break;
      case Opcodes.IFEQ:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Frame.java`
#### Snippet
```java
        break;
      case Opcodes.GOTO:
        break;
      case Opcodes.JSR:
        push(interpreter.newOperation(insn));
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Frame.java`
#### Snippet
```java
        break;
      case Opcodes.JSR:
        push(interpreter.newOperation(insn));
        break;
      case Opcodes.RET:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Frame.java`
#### Snippet
```java
        break;
      case Opcodes.RET:
        break;
      case Opcodes.TABLESWITCH:
      case Opcodes.LOOKUPSWITCH:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Frame.java`
#### Snippet
```java
      case Opcodes.TABLESWITCH:
      case Opcodes.LOOKUPSWITCH:
        interpreter.unaryOperation(insn, pop());
        break;
      case Opcodes.IRETURN:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Frame.java`
#### Snippet
```java
        break;
      case Opcodes.GETSTATIC:
        push(interpreter.newOperation(insn));
        break;
      case Opcodes.PUTSTATIC:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Frame.java`
#### Snippet
```java
        break;
      case Opcodes.PUTSTATIC:
        interpreter.unaryOperation(insn, pop());
        break;
      case Opcodes.GETFIELD:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Frame.java`
#### Snippet
```java
        break;
      case Opcodes.GETFIELD:
        push(interpreter.unaryOperation(insn, pop()));
        break;
      case Opcodes.INVOKEVIRTUAL:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Frame.java`
#### Snippet
```java
        break;
      case Opcodes.NEW:
        push(interpreter.newOperation(insn));
        break;
      case Opcodes.NEWARRAY:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Frame.java`
#### Snippet
```java
      case Opcodes.ANEWARRAY:
      case Opcodes.ARRAYLENGTH:
        push(interpreter.unaryOperation(insn, pop()));
        break;
      case Opcodes.ATHROW:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Frame.java`
#### Snippet
```java
        break;
      case Opcodes.ATHROW:
        interpreter.unaryOperation(insn, pop());
        break;
      case Opcodes.CHECKCAST:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Frame.java`
#### Snippet
```java
      case Opcodes.CHECKCAST:
      case Opcodes.INSTANCEOF:
        push(interpreter.unaryOperation(insn, pop()));
        break;
      case Opcodes.MONITORENTER:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Frame.java`
#### Snippet
```java
      case Opcodes.MONITORENTER:
      case Opcodes.MONITOREXIT:
        interpreter.unaryOperation(insn, pop());
        break;
      case Opcodes.MULTIANEWARRAY:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Frame.java`
#### Snippet
```java
      case Opcodes.IFNULL:
      case Opcodes.IFNONNULL:
        interpreter.unaryOperation(insn, pop());
        break;
      default:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-commons/src/main/java/org/objectweb/asm/commons/InstructionAdapter.java`
#### Snippet
```java
        break;
      case Opcodes.SIPUSH:
        iconst(operand);
        break;
      case Opcodes.NEWARRAY:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        return;
      case 'c':
        builder.addCpInfo(((char) tag) + ": ", parser.u2());
        return;
      case '@':
        builder.add("@: ", "");
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        case 0xB0: // areturn
        case 0xBE: // arraylength
          builder.addInsn(insnIndex, opcode);
          break;
        case 0x3A: // astore
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
          break;
        case 0x3A: // astore
          builder.addInsn(insnIndex, opcode, parser.u1());
          bytecodeOffset += 1;
          break;
        case 0x4B: // astore_0
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        case 0x33: // baload
        case 0x54: // bastore
          builder.addInsn(insnIndex, opcode);
          break;
        case 0x10: // bipush
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
          break;
        case 0x10: // bipush
          builder.addInsn(insnIndex, opcode, parser.u1());
          bytecodeOffset += 1;
          break;
        case 0x34: // caload
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        case 0x34: // caload
        case 0x55: // castore
          builder.addInsn(insnIndex, opcode);
          break;
        case 0xC0: // checkcast
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
          break;
        case 0xC0: // checkcast
          builder.addInsn(insnIndex, opcode, builder.getCpInfo(parser.u2()));
          bytecodeOffset += 2;
          break;
        case 0x90: // d2f
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        case 0x0F: // dconst_1
        case 0x6F: // ddiv
          builder.addInsn(insnIndex, opcode);
          break;
        case 0x18: // dload
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
          break;
        case 0x18: // dload
          builder.addInsn(insnIndex, opcode, parser.u1());
          bytecodeOffset += 1;
          break;
        case 0x26: // dload_0
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        case 0x73: // drem
        case 0xAF: // dreturn
          builder.addInsn(insnIndex, opcode);
          break;
        case 0x39: // dstore
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
          break;
        case 0x39: // dstore
          builder.addInsn(insnIndex, opcode, parser.u1());
          bytecodeOffset += 1;
          break;
        case 0x47: // dstore_0
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        case 0x0D: // fconst_2
        case 0x6E: // fdiv
          builder.addInsn(insnIndex, opcode);
          break;
        case 0x17: // fload
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
          break;
        case 0x17: // fload
          builder.addInsn(insnIndex, opcode, parser.u1());
          bytecodeOffset += 1;
          break;
        case 0x22: // fload_0
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        case 0x72: // frem
        case 0xAE: // freturn
          builder.addInsn(insnIndex, opcode);
          break;
        case 0x38: // fstore
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
          break;
        case 0x38: // fstore
          builder.addInsn(insnIndex, opcode, parser.u1());
          bytecodeOffset += 1;
          break;
        case 0x43: // fstore_0
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
          break;
        case 0x66: // fsub
          builder.addInsn(insnIndex, opcode);
          break;
        case 0xB4: // getfield
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        case 0xB4: // getfield
        case 0xB2: // getstatic
          builder.addInsn(insnIndex, opcode, builder.getCpInfo(parser.u2()));
          bytecodeOffset += 2;
          break;
        case 0xA7: // goto
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        case 0x08: // iconst_5
        case 0x6C: // idiv
          builder.addInsn(insnIndex, opcode);
          break;
        case 0xA5: // if_acmpeq
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        case 0xC7: // ifnonnull
        case 0xC6: // ifnull
          builder.addInsn(
              insnIndex, opcode, new InstructionIndex(startOffset + parser.s2(), builder));
          bytecodeOffset += 2;
          break;
        case 0x84: // iinc
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
          break;
        case 0x15: // iload
          builder.addInsn(insnIndex, opcode, parser.u1());
          bytecodeOffset += 1;
          break;
        case 0x1A: // iload_0
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        case 0x68: // imul
        case 0x74: // ineg
          builder.addInsn(insnIndex, opcode);
          break;
        case 0xC1: // instanceof
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
          break;
        case 0xC1: // instanceof
          builder.addInsn(insnIndex, opcode, builder.getCpInfo(parser.u2()));
          bytecodeOffset += 2;
          break;
        case 0xBA: // invokedynamic
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        case 0xB8: // invokestatic
        case 0xB6: // invokevirtual
          builder.addInsn(insnIndex, opcode, builder.getCpInfo(parser.u2()));
          bytecodeOffset += 2;
          break;
        case 0x80: // ior
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        case 0x78: // ishl
        case 0x7A: // ishr
          builder.addInsn(insnIndex, opcode);
          break;
        case 0x36: // istore
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
          break;
        case 0x36: // istore
          builder.addInsn(insnIndex, opcode, parser.u1());
          bytecodeOffset += 1;
          break;
        case 0x3B: // istore_0
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        case 0x7C: // iushr
        case 0x82: // ixor
          builder.addInsn(insnIndex, opcode);
          break;
        case 0xA8: // jsr
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
          break;
        case 0xA8: // jsr
          builder.addInsn(
              insnIndex, opcode, new InstructionIndex(startOffset + parser.s2(), builder));
          bytecodeOffset += 2;
          break;
        case 0xC9: // jsr_w
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        case 0x09: // lconst_0
        case 0x0A: // lconst_1
          builder.addInsn(insnIndex, opcode);
          break;
        case 0x12: // ldc
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
          break;
        case 0x6D: // ldiv
          builder.addInsn(insnIndex, opcode);
          break;
        case 0x16: // lload
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
          break;
        case 0x16: // lload
          builder.addInsn(insnIndex, opcode, parser.u1());
          bytecodeOffset += 1;
          break;
        case 0x1E: // lload_0
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        case 0x69: // lmul
        case 0x75: // lneg
          builder.addInsn(insnIndex, opcode);
          break;
        case 0xAB: // lookupswitch
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        case 0x79: // lshl
        case 0x7B: // lshr
          builder.addInsn(insnIndex, opcode);
          break;
        case 0x37: // lstore
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
          break;
        case 0x37: // lstore
          builder.addInsn(insnIndex, opcode, parser.u1());
          bytecodeOffset += 1;
          break;
        case 0x3F: // lstore_0
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        case 0xC2: // monitorenter
        case 0xC3: // monitorexit
          builder.addInsn(insnIndex, opcode);
          break;
        case 0xC5: // multianewarray
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
          break;
        case 0xBB: // new
          builder.addInsn(insnIndex, opcode, builder.getCpInfo(parser.u2()));
          bytecodeOffset += 2;
          break;
        case 0xBC: // newarray
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
          break;
        case 0xBC: // newarray
          builder.addInsn(insnIndex, opcode, parser.u1());
          bytecodeOffset += 1;
          break;
        case 0x00: // nop
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        case 0x57: // pop
        case 0x58: // pop2
          builder.addInsn(insnIndex, opcode);
          break;
        case 0xB5: // putfield
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        case 0xB5: // putfield
        case 0xB3: // putstatic
          builder.addInsn(insnIndex, opcode, builder.getCpInfo(parser.u2()));
          bytecodeOffset += 2;
          break;
        case 0xA9: // ret
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
          break;
        case 0xA9: // ret
          builder.addInsn(insnIndex, opcode, parser.u1());
          bytecodeOffset += 1;
          break;
        case 0xB1: // return
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        case 0x35: // saload
        case 0x56: // sastore
          builder.addInsn(insnIndex, opcode);
          break;
        case 0x11: // sipush
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
          break;
        case 0x5F: // swap
          builder.addInsn(insnIndex, opcode);
          break;
        case 0xAA: // tableswitch
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Analyzer.java`
#### Snippet
```java
    boolean changed;
    Frame<V> oldFrame = frames[insnIndex];
    if (oldFrame == null) {
      frames[insnIndex] = newFrame(frame);
      changed = true;
    } else {
      changed = oldFrame.merge(frame, interpreter);
    }
    Subroutine oldSubroutine = subroutines[insnIndex];
```

### DuplicatedCode
Duplicated code
in `asm-commons/src/main/java/org/objectweb/asm/commons/AdviceAdapter.java`
#### Snippet
```java
    if (api < Opcodes.ASM5 && (opcodeAndSource & Opcodes.SOURCE_DEPRECATED) == 0) {
      // Redirect the call to the deprecated version of this method.
      super.visitMethodInsn(opcodeAndSource, owner, name, descriptor, isInterface);
      return;
    }
    super.visitMethodInsn(opcodeAndSource, owner, name, descriptor, isInterface);
    int opcode = opcodeAndSource & ~Opcodes.SOURCE_MASK;
```

### DuplicatedCode
Duplicated code
in `asm-commons/src/main/java/org/objectweb/asm/commons/GeneratorAdapter.java`
#### Snippet
```java
    if (value >= -1 && value <= 5) {
      mv.visitInsn(Opcodes.ICONST_0 + value);
    } else if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
      mv.visitIntInsn(Opcodes.BIPUSH, value);
    } else if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
      mv.visitIntInsn(Opcodes.SIPUSH, value);
    } else {
      mv.visitLdcInsn(value);
    }
```

### DuplicatedCode
Duplicated code
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        int numberOfLocals = builder.add("number_of_locals: ", parser.u2());
        for (int j = 0; j < numberOfLocals; ++j) {
          dumpVerificationTypeInfo(parser, builder);
        }
        int numberOfStackItems = builder.add("number_of_stack_items: ", parser.u2());
        for (int j = 0; j < numberOfStackItems; ++j) {
          dumpVerificationTypeInfo(parser, builder);
        }
```

### DuplicatedCode
Duplicated code
in `asm-tree/src/main/java/org/objectweb/asm/tree/ClassNode.java`
#### Snippet
```java
    if (visibleAnnotations != null) {
      for (int i = visibleAnnotations.size() - 1; i >= 0; --i) {
        visibleAnnotations.get(i).check(api);
      }
    }
    if (invisibleAnnotations != null) {
      for (int i = invisibleAnnotations.size() - 1; i >= 0; --i) {
        invisibleAnnotations.get(i).check(api);
      }
    }
```

### DuplicatedCode
Duplicated code
in `asm-tree/src/main/java/org/objectweb/asm/tree/ClassNode.java`
#### Snippet
```java
    if (visibleAnnotations != null) {
      for (int i = 0, n = visibleAnnotations.size(); i < n; ++i) {
        AnnotationNode annotation = visibleAnnotations.get(i);
        annotation.accept(classVisitor.visitAnnotation(annotation.desc, true));
      }
    }
    if (invisibleAnnotations != null) {
      for (int i = 0, n = invisibleAnnotations.size(); i < n; ++i) {
        AnnotationNode annotation = invisibleAnnotations.get(i);
        annotation.accept(classVisitor.visitAnnotation(annotation.desc, false));
      }
    }
    if (visibleTypeAnnotations != null) {
      for (int i = 0, n = visibleTypeAnnotations.size(); i < n; ++i) {
        TypeAnnotationNode typeAnnotation = visibleTypeAnnotations.get(i);
        typeAnnotation.accept(
            classVisitor.visitTypeAnnotation(
                typeAnnotation.typeRef, typeAnnotation.typePath, typeAnnotation.desc, true));
      }
    }
    if (invisibleTypeAnnotations != null) {
      for (int i = 0, n = invisibleTypeAnnotations.size(); i < n; ++i) {
        TypeAnnotationNode typeAnnotation = invisibleTypeAnnotations.get(i);
        typeAnnotation.accept(
            classVisitor.visitTypeAnnotation(
                typeAnnotation.typeRef, typeAnnotation.typePath, typeAnnotation.desc, false));
      }
    }
```

### DuplicatedCode
Duplicated code
in `asm-tree/src/main/java/org/objectweb/asm/tree/FieldNode.java`
#### Snippet
```java
    if (fieldVisitor == null) {
      return;
    }
    // Visit the annotations.
    if (visibleAnnotations != null) {
      for (int i = 0, n = visibleAnnotations.size(); i < n; ++i) {
        AnnotationNode annotation = visibleAnnotations.get(i);
        annotation.accept(fieldVisitor.visitAnnotation(annotation.desc, true));
      }
    }
    if (invisibleAnnotations != null) {
      for (int i = 0, n = invisibleAnnotations.size(); i < n; ++i) {
        AnnotationNode annotation = invisibleAnnotations.get(i);
        annotation.accept(fieldVisitor.visitAnnotation(annotation.desc, false));
      }
    }
    if (visibleTypeAnnotations != null) {
      for (int i = 0, n = visibleTypeAnnotations.size(); i < n; ++i) {
        TypeAnnotationNode typeAnnotation = visibleTypeAnnotations.get(i);
        typeAnnotation.accept(
            fieldVisitor.visitTypeAnnotation(
                typeAnnotation.typeRef, typeAnnotation.typePath, typeAnnotation.desc, true));
      }
    }
    if (invisibleTypeAnnotations != null) {
      for (int i = 0, n = invisibleTypeAnnotations.size(); i < n; ++i) {
        TypeAnnotationNode typeAnnotation = invisibleTypeAnnotations.get(i);
        typeAnnotation.accept(
            fieldVisitor.visitTypeAnnotation(
                typeAnnotation.typeRef, typeAnnotation.typePath, typeAnnotation.desc, false));
      }
    }
    // Visit the non standard attributes.
    if (attrs != null) {
      for (int i = 0, n = attrs.size(); i < n; ++i) {
        fieldVisitor.visitAttribute(attrs.get(i));
      }
    }
    fieldVisitor.visitEnd();
```

### DuplicatedCode
Duplicated code
in `asm-tree/src/main/java/org/objectweb/asm/tree/InsnList.java`
#### Snippet
```java
    AbstractInsnNode nextInsn = previousInsn.nextInsn;
    if (nextInsn == null) {
      lastInsn = insnNode;
    } else {
      nextInsn.previousInsn = insnNode;
    }
    previousInsn.nextInsn = insnNode;
    insnNode.nextInsn = nextInsn;
    insnNode.previousInsn = previousInsn;
    cache = null;
```

### DuplicatedCode
Duplicated code
in `asm-tree/src/main/java/org/objectweb/asm/tree/InsnList.java`
#### Snippet
```java
    AbstractInsnNode previousInsn = nextInsn.previousInsn;
    if (previousInsn == null) {
      firstInsn = insnNode;
    } else {
      previousInsn.nextInsn = insnNode;
    }
    nextInsn.previousInsn = insnNode;
    insnNode.nextInsn = nextInsn;
    insnNode.previousInsn = previousInsn;
    cache = null;
```

### DuplicatedCode
Duplicated code
in `asm-util/src/main/java/org/objectweb/asm/util/ASMifier.java`
#### Snippet
```java
    appendAccessFlags(access | ACCESS_FIELD);
    stringBuilder.append(", ");
    appendConstant(name);
    stringBuilder.append(", ");
    appendConstant(descriptor);
    stringBuilder.append(", ");
    appendConstant(signature);
    stringBuilder.append(", ");
```

### DuplicatedCode
Duplicated code
in `asm-util/src/main/java/org/objectweb/asm/util/ASMifier.java`
#### Snippet
```java
    stringBuilder.append(", ");
    appendConstant(name);
    stringBuilder.append(", ");
    appendConstant(descriptor);
    stringBuilder.append(", ");
    appendConstant(signature);
    stringBuilder.append(", ");
    if (exceptions != null && exceptions.length > 0) {
      stringBuilder.append("new String[] {");
      for (int i = 0; i < exceptions.length; ++i) {
        stringBuilder.append(i == 0 ? " " : ", ");
        appendConstant(exceptions[i]);
      }
      stringBuilder.append(" }");
    } else {
      stringBuilder.append("null");
    }
```

### DuplicatedCode
Duplicated code
in `asm-util/src/main/java/org/objectweb/asm/util/ASMifier.java`
#### Snippet
```java
    stringBuilder.append(", ");
    appendConstant(signature);
    stringBuilder.append(", ");
    appendConstant(superName);
    stringBuilder.append(", ");
    if (interfaces != null && interfaces.length > 0) {
      stringBuilder.append("new String[] {");
      for (int i = 0; i < interfaces.length; ++i) {
        stringBuilder.append(i == 0 ? " " : ", ");
        appendConstant(interfaces[i]);
      }
      stringBuilder.append(" }");
    } else {
      stringBuilder.append("null");
    }
```

### DuplicatedCode
Duplicated code
in `asm-util/src/main/java/org/objectweb/asm/util/ASMifier.java`
#### Snippet
```java
    appendConstant(name);
    stringBuilder.append(");\n");
    text.add(stringBuilder.toString());
    ASMifier asmifier = createASMifier(ANNOTATION_VISITOR, id + 1);
    text.add(asmifier.getText());
    text.add("}\n");
    return asmifier;
```

### DuplicatedCode
Duplicated code
in `asm-util/src/main/java/org/objectweb/asm/util/ASMifier.java`
#### Snippet
```java
    appendConstant(descriptor);
    stringBuilder.append(", ").append(visible).append(");\n");
    text.add(stringBuilder.toString());
    ASMifier asmifier = createASMifier(ANNOTATION_VISITOR, 0);
    text.add(asmifier.getText());
    text.add("}\n");
    return asmifier;
```

### DuplicatedCode
Duplicated code
in `asm-util/src/main/java/org/objectweb/asm/util/CheckFieldAdapter.java`
#### Snippet
```java
    checkVisitEndNotCalled();
    int sort = new TypeReference(typeRef).getSort();
    if (sort != TypeReference.FIELD) {
      throw new IllegalArgumentException(
          "Invalid type reference sort 0x" + Integer.toHexString(sort));
    }
    CheckClassAdapter.checkTypeRef(typeRef);
    CheckMethodAdapter.checkDescriptor(Opcodes.V1_5, descriptor, false);
    return new CheckAnnotationAdapter(
        super.visitTypeAnnotation(typeRef, typePath, descriptor, visible));
```

### DuplicatedCode
Duplicated code
in `asm-util/src/main/java/org/objectweb/asm/util/Textifier.java`
#### Snippet
```java
    stringBuilder.setLength(0);
    stringBuilder.append('\n');
    if ((access & Opcodes.ACC_DEPRECATED) != 0) {
      stringBuilder.append(tab).append(DEPRECATED);
    }
    stringBuilder.append(tab);
    appendRawAccess(access);
    if (signature != null) {
      stringBuilder.append(tab);
      appendDescriptor(FIELD_SIGNATURE, signature);
      stringBuilder.append(tab);
      appendJavaDeclaration(name, signature);
    }

    stringBuilder.append(tab);
```

### DuplicatedCode
Duplicated code
in `asm-util/src/main/java/org/objectweb/asm/util/Textifier.java`
#### Snippet
```java
    appendDescriptor(FIELD_DESCRIPTOR, descriptor);
    stringBuilder.append('(');
    text.add(stringBuilder.toString());

    stringBuilder.setLength(0);
    stringBuilder.append(") : ");
    appendTypeReference(typeRef);
    stringBuilder.append(", ").append(typePath);
    stringBuilder.append(visible ? "\n" : INVISIBLE);
    return addNewTextifier(stringBuilder.toString());
```

### DuplicatedCode
Duplicated code
in `asm/src/main/java/org/objectweb/asm/ByteVector.java`
#### Snippet
```java
    currentData[currentLength++] = (byte) (intValue >>> 24);
    currentData[currentLength++] = (byte) (intValue >>> 16);
    currentData[currentLength++] = (byte) (intValue >>> 8);
    currentData[currentLength++] = (byte) intValue;
    length = currentLength;
    return this;
```

### DuplicatedCode
Duplicated code
in `asm/src/main/java/org/objectweb/asm/FieldWriter.java`
#### Snippet
```java
    if ((accessFlags & Opcodes.ACC_SYNTHETIC) != 0 && useSyntheticAttribute) {
      ++attributesCount;
    }
    if (signatureIndex != 0) {
      ++attributesCount;
    }
    if ((accessFlags & Opcodes.ACC_DEPRECATED) != 0) {
      ++attributesCount;
    }
    if (lastRuntimeVisibleAnnotation != null) {
      ++attributesCount;
    }
    if (lastRuntimeInvisibleAnnotation != null) {
      ++attributesCount;
    }
    if (lastRuntimeVisibleTypeAnnotation != null) {
      ++attributesCount;
    }
    if (lastRuntimeInvisibleTypeAnnotation != null) {
      ++attributesCount;
    }
```

### DuplicatedCode
Duplicated code
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
    if (lastRuntimeVisibleTypeAnnotation != null) {
      ++attributeCount;
    }
    if (lastRuntimeInvisibleTypeAnnotation != null) {
      ++attributeCount;
    }
    if (defaultValue != null) {
      ++attributeCount;
    }
    if (parameters != null) {
      ++attributeCount;
    }
    if (firstAttribute != null) {
      attributeCount += firstAttribute.getAttributeCount();
    }
    // For ease of reference, we use here the same attribute order as in Section 4.7 of the JVMS.
    output.putShort(attributeCount);
```

### DuplicatedCode
Duplicated code
in `asm/src/main/java/org/objectweb/asm/Frame.java`
#### Snippet
```java
    int inputLocalIndex = 0;
    for (int i = 0; i < numLocal; ++i) {
      inputLocals[inputLocalIndex++] = getAbstractTypeFromApiFormat(symbolTable, local[i]);
      if (local[i] == Opcodes.LONG || local[i] == Opcodes.DOUBLE) {
        inputLocals[inputLocalIndex++] = TOP;
      }
    }
```

### DuplicatedCode
Duplicated code
in `asm/src/main/java/org/objectweb/asm/Frame.java`
#### Snippet
```java
    if (outputLocals == null) {
      outputLocals = new int[10];
    }
    int outputLocalsLength = outputLocals.length;
    if (localIndex >= outputLocalsLength) {
      int[] newOutputLocals = new int[Math.max(localIndex + 1, 2 * outputLocalsLength)];
      System.arraycopy(outputLocals, 0, newOutputLocals, 0, outputLocalsLength);
      outputLocals = newOutputLocals;
    }
```

### DuplicatedCode
Duplicated code
in `asm/src/main/java/org/objectweb/asm/Frame.java`
#### Snippet
```java
    int initializationsLength = initializations.length;
    if (initializationCount >= initializationsLength) {
      int[] newInitializations =
          new int[Math.max(initializationCount + 1, 2 * initializationsLength)];
      System.arraycopy(initializations, 0, newInitializations, 0, initializationsLength);
      initializations = newInitializations;
    }
    // Store the abstract type.
    initializations[initializationCount++] = abstractType;
```

### DuplicatedCode
Duplicated code
in `asm/src/main/java/org/objectweb/asm/Frame.java`
#### Snippet
```java
        if (arg > 0) {
          int previousLocalType = getLocal(arg - 1);
          if (previousLocalType == LONG || previousLocalType == DOUBLE) {
            setLocal(arg - 1, TOP);
          } else if ((previousLocalType & KIND_MASK) == LOCAL_KIND
              || (previousLocalType & KIND_MASK) == STACK_KIND) {
            // The type of the previous local variable is not known yet, but if it later appears
            // to be LONG or DOUBLE, we should then use TOP instead.
            setLocal(arg - 1, previousLocalType | TOP_IF_LONG_OR_DOUBLE_FLAG);
          }
        }
```

### DuplicatedCode
Duplicated code
in `asm/src/main/java/org/objectweb/asm/ModuleWriter.java`
#### Snippet
```java
    exports.putShort(symbolTable.addConstantPackage(packaze).index).putShort(access);
    if (modules == null) {
      exports.putShort(0);
    } else {
      exports.putShort(modules.length);
      for (String module : modules) {
        exports.putShort(symbolTable.addConstantModule(module).index);
      }
    }
    exportsCount++;
```

### DuplicatedCode
Duplicated code
in `asm/src/main/java/org/objectweb/asm/SymbolTable.java`
#### Snippet
```java
    int hashCode = hash(tag, value);
    Entry entry = get(hashCode);
    while (entry != null) {
      if (entry.tag == tag && entry.hashCode == hashCode && entry.data == value) {
        return entry;
      }
      entry = entry.next;
    }
```

### DuplicatedCode
Duplicated code
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmark.java`
#### Snippet
```java
    asm5dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Adapter) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();
```

### DuplicatedCode
Duplicated code
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmark.java`
#### Snippet
```java
    if (!asm4dot0.getVersion().equals("ASM4")
        || !asm5dot0.getVersion().equals("ASM5")
        || !asm6dot0.getVersion().equals("ASM6")
        || !asm7dot0.getVersion().equals("ASM7")
        || !asm8dot0.getVersion().equals("ASM8")
        || !asm9dot0.getVersion().equals("ASM9")
        || !asmCurrent.getVersion().equals("ASM9")) {
      throw new IllegalStateException();
    }

    prepareClasses();
```

### DuplicatedCode
Duplicated code
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmarkJava8.java`
#### Snippet
```java
    if (!asm5dot0.getVersion().equals("ASM5")
        || !asm6dot0.getVersion().equals("ASM6")
        || !asm7dot0.getVersion().equals("ASM7")
        || !asm8dot0.getVersion().equals("ASM8")
        || !asm9dot0.getVersion().equals("ASM9")
        || !asmCurrent.getVersion().equals("ASM9")) {
      throw new IllegalStateException();
    }
```

### DuplicatedCode
Duplicated code
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AspectjBcelAdapter.java`
#### Snippet
```java
    for (Method method : classGen.getMethods()) {
      MethodGen methodGen = new MethodGen(method, classGen.getClassName(), constantPool);
      if (method.getLocalVariableTable() == null) {
        methodGen.removeLocalVariables();
      }
      if (method.getLineNumberTable() == null) {
        methodGen.removeLineNumbers();
      }
      InstructionList insnList = methodGen.getInstructionList();
      if (insnList != null) {
        InstructionHandle insnHandle = insnList.getStart();
        while (insnHandle != null) {
          insnHandle = insnHandle.getNext();
        }
        if (computeMaxs) {
          methodGen.setMaxStack();
          methodGen.setMaxLocals();
        }
      }
      classGen.replaceMethod(method, methodGen.getMethod());
    }
    return classGen.getJavaClass().getBytes();
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `asm-util/src/main/java/org/objectweb/asm/util/Printer.java`
#### Snippet
```java
        || className.indexOf('/') != -1) {
      // Can't fix PMD warning for 1.5 compatibility.
      try (InputStream inputStream = new FileInputStream(className)) { // NOPMD(AvoidFileStream)
        new ClassReader(inputStream).accept(traceClassVisitor, parsingOptions);
      }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `asm-util/src/main/java/org/objectweb/asm/util/CheckClassAdapter.java`
#### Snippet
```java
    if (args[0].endsWith(".class")) {
      // Can't fix PMD warning for 1.5 compatibility.
      try (InputStream inputStream = new FileInputStream(args[0])) { // NOPMD(AvoidFileStream)
        classReader = new ClassReader(inputStream);
      }
```

## RuleId[id=Deprecation]
### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `asm/src/main/java/org/objectweb/asm/ModuleVisitor.java`
#### Snippet
```java
        && api != Opcodes.ASM5
        && api != Opcodes.ASM4
        && api != Opcodes.ASM10_EXPERIMENTAL) {
      throw new IllegalArgumentException("Unsupported api " + api);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `asm/src/main/java/org/objectweb/asm/ModuleVisitor.java`
#### Snippet
```java
      throw new IllegalArgumentException("Unsupported api " + api);
    }
    if (api == Opcodes.ASM10_EXPERIMENTAL) {
      Constants.checkAsmExperimental(this);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `asm/src/main/java/org/objectweb/asm/MethodVisitor.java`
#### Snippet
```java
        && api != Opcodes.ASM5
        && api != Opcodes.ASM4
        && api != Opcodes.ASM10_EXPERIMENTAL) {
      throw new IllegalArgumentException("Unsupported api " + api);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `asm/src/main/java/org/objectweb/asm/MethodVisitor.java`
#### Snippet
```java
      throw new IllegalArgumentException("Unsupported api " + api);
    }
    if (api == Opcodes.ASM10_EXPERIMENTAL) {
      Constants.checkAsmExperimental(this);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `asm/src/main/java/org/objectweb/asm/RecordComponentVisitor.java`
#### Snippet
```java
        && api != Opcodes.ASM5
        && api != Opcodes.ASM4
        && api != Opcodes.ASM10_EXPERIMENTAL) {
      throw new IllegalArgumentException("Unsupported api " + api);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `asm/src/main/java/org/objectweb/asm/RecordComponentVisitor.java`
#### Snippet
```java
      throw new IllegalArgumentException("Unsupported api " + api);
    }
    if (api == Opcodes.ASM10_EXPERIMENTAL) {
      Constants.checkAsmExperimental(this);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `asm/src/main/java/org/objectweb/asm/ClassVisitor.java`
#### Snippet
```java
        && api != Opcodes.ASM5
        && api != Opcodes.ASM4
        && api != Opcodes.ASM10_EXPERIMENTAL) {
      throw new IllegalArgumentException("Unsupported api " + api);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `asm/src/main/java/org/objectweb/asm/ClassVisitor.java`
#### Snippet
```java
      throw new IllegalArgumentException("Unsupported api " + api);
    }
    if (api == Opcodes.ASM10_EXPERIMENTAL) {
      Constants.checkAsmExperimental(this);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `asm-util/src/main/java/org/objectweb/asm/util/TraceClassVisitor.java`
#### Snippet
```java
  public TraceClassVisitor(
      final ClassVisitor classVisitor, final Printer printer, final PrintWriter printWriter) {
    super(/* latest api = */ Opcodes.ASM10_EXPERIMENTAL, classVisitor);
    this.printWriter = printWriter;
    this.p = printer;
```

### Deprecation
Overrides deprecated method in 'org.objectweb.asm.MethodVisitor'
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AsmAdapter.java`
#### Snippet
```java
        @Override
        @Deprecated
        public void visitMethodInsn(
            final int opcode, final String owner, final String name, final String descriptor) {
          ++count;
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/TypeBenchmark.java`
#### Snippet
```java

    CollectTypesVisitor() {
      super(/* latest */ Opcodes.ASM10_EXPERIMENTAL);
    }

```

### Deprecation
'newInstance()' is deprecated
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AbstractBenchmark.java`
#### Snippet
```java
     */
    public Object newAsmBenchmark() throws ClassNotFoundException, ReflectiveOperationException {
      return loadClass(asmBenchmarkClass).newInstance();
    }

```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `asm-util/src/main/java/org/objectweb/asm/util/CheckClassAdapter.java`
#### Snippet
```java
    ClassNode classNode = new ClassNode();
    classReader.accept(
        new CheckClassAdapter(/*latest*/ Opcodes.ASM10_EXPERIMENTAL, classNode, false) {},
        ClassReader.SKIP_DEBUG);

```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `asm/src/main/java/org/objectweb/asm/signature/SignatureVisitor.java`
#### Snippet
```java
        && api != Opcodes.ASM5
        && api != Opcodes.ASM4
        && api != Opcodes.ASM10_EXPERIMENTAL) {
      throw new IllegalArgumentException("Unsupported api " + api);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `asm/src/main/java/org/objectweb/asm/AnnotationVisitor.java`
#### Snippet
```java
        && api != Opcodes.ASM5
        && api != Opcodes.ASM4
        && api != Opcodes.ASM10_EXPERIMENTAL) {
      throw new IllegalArgumentException("Unsupported api " + api);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `asm/src/main/java/org/objectweb/asm/AnnotationVisitor.java`
#### Snippet
```java
      throw new IllegalArgumentException("Unsupported api " + api);
    }
    if (api == Opcodes.ASM10_EXPERIMENTAL) {
      Constants.checkAsmExperimental(this);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `asm/src/main/java/org/objectweb/asm/FieldVisitor.java`
#### Snippet
```java
        && api != Opcodes.ASM5
        && api != Opcodes.ASM4
        && api != Opcodes.ASM10_EXPERIMENTAL) {
      throw new IllegalArgumentException("Unsupported api " + api);
    }
```

### Deprecation
'ASM10_EXPERIMENTAL' is deprecated
in `asm/src/main/java/org/objectweb/asm/FieldVisitor.java`
#### Snippet
```java
      throw new IllegalArgumentException("Unsupported api " + api);
    }
    if (api == Opcodes.ASM10_EXPERIMENTAL) {
      Constants.checkAsmExperimental(this);
    }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `asm-util/src/main/java/org/objectweb/asm/util/CheckMethodAdapter.java`
#### Snippet
```java
            CheckClassAdapter.printAnalyzerResult(this, analyzer, printWriter);
            printWriter.close();
            throw new IllegalArgumentException(e.getMessage() + ' ' + stringWriter.toString(), e);
          }
        },
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `asm/src/main/java/org/objectweb/asm/ByteVector.java`
#### Snippet
```java
    int doubleCapacity = 2 * data.length;
    int minimalCapacity = length + size;
    byte[] newData = new byte[doubleCapacity > minimalCapacity ? doubleCapacity : minimalCapacity];
    System.arraycopy(data, 0, newData, 0, length);
    data = newData;
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `asm/src/main/java/org/objectweb/asm/MethodVisitor.java`
#### Snippet
```java
   *     is not required to correspond to the i'th parameter descriptor in the method
   *     descriptor</i>, in particular in case of synthetic parameters (see
   *     https://docs.oracle.com/javase/specs/jvms/se9/html/jvms-4.html#jvms-4.7.18).
   * @param descriptor the class descriptor of the annotation class.
   * @param visible {@literal true} if the annotation is visible at runtime.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `asm/src/main/java/org/objectweb/asm/MethodVisitor.java`
#### Snippet
```java
   *     be strictly less when a method has synthetic parameters and when these parameters are
   *     ignored when computing parameter indices for the purpose of parameter annotations (see
   *     https://docs.oracle.com/javase/specs/jvms/se9/html/jvms-4.html#jvms-4.7.18).
   * @param visible {@literal true} to define the number of method parameters that can have
   *     annotations visible at runtime, {@literal false} to define the number of method parameters
```

### JavadocLinkAsPlainText
Link specified as plain text
in `asm-util/src/main/java/org/objectweb/asm/util/Printer.java`
#### Snippet
```java
   *     be strictly less when a method has synthetic parameters and when these parameters are
   *     ignored when computing parameter indices for the purpose of parameter annotations (see
   *     https://docs.oracle.com/javase/specs/jvms/se9/html/jvms-4.html#jvms-4.7.18).
   * @param visible {@literal true} to define the number of method parameters that can have
   *     annotations visible at runtime, {@literal false} to define the number of method parameters
```

### JavadocLinkAsPlainText
Link specified as plain text
in `asm-util/src/main/java/org/objectweb/asm/util/Printer.java`
#### Snippet
```java
   *     is not required to correspond to the i'th parameter descriptor in the method
   *     descriptor</i>, in particular in case of synthetic parameters (see
   *     https://docs.oracle.com/javase/specs/jvms/se9/html/jvms-4.html#jvms-4.7.18).
   * @param descriptor the class descriptor of the annotation class.
   * @param visible {@literal true} if the annotation is visible at runtime.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `asm-tree/src/main/java/org/objectweb/asm/tree/MethodNode.java`
#### Snippet
```java
   * It can be strictly less when a method has synthetic parameters and when these parameters are
   * ignored when computing parameter indices for the purpose of parameter annotations (see
   * https://docs.oracle.com/javase/specs/jvms/se9/html/jvms-4.html#jvms-4.7.18).
   */
  public int invisibleAnnotableParameterCount;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `asm-tree/src/main/java/org/objectweb/asm/tree/MethodNode.java`
#### Snippet
```java
   * can be strictly less when a method has synthetic parameters and when these parameters are
   * ignored when computing parameter indices for the purpose of parameter annotations (see
   * https://docs.oracle.com/javase/specs/jvms/se9/html/jvms-4.html#jvms-4.7.18).
   */
  public int visibleAnnotableParameterCount;
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
    }
    if (exceptionsOffset == 0) {
      if (numberOfExceptions != 0) {
        return false;
      }
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmark.java`
#### Snippet
```java
 */
@Fork(1)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 30, time = 1, timeUnit = TimeUnit.SECONDS)
@State(Scope.Thread)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmark.java`
#### Snippet
```java
@Fork(1)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 30, time = 1, timeUnit = TimeUnit.SECONDS)
@State(Scope.Thread)
public class AdapterBenchmark extends AbstractBenchmark {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/GeneratorBenchmark.java`
#### Snippet
```java
 */
@Fork(1)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 30, time = 1, timeUnit = TimeUnit.SECONDS)
@State(Scope.Thread)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/GeneratorBenchmark.java`
#### Snippet
```java
@Fork(1)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 30, time = 1, timeUnit = TimeUnit.SECONDS)
@State(Scope.Thread)
public class GeneratorBenchmark extends AbstractBenchmark {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/TypeBenchmark.java`
#### Snippet
```java

@Fork(1)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@State(Scope.Thread)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/TypeBenchmark.java`
#### Snippet
```java
@Fork(1)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@State(Scope.Thread)
public class TypeBenchmark extends AbstractBenchmark {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/MemoryBenchmark.java`
#### Snippet
```java
 */
@Fork(1)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@State(Scope.Thread)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/MemoryBenchmark.java`
#### Snippet
```java
@Fork(1)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@State(Scope.Thread)
public class MemoryBenchmark extends AbstractBenchmark {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmarkJava8.java`
#### Snippet
```java
 */
@Fork(1)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 30, time = 1, timeUnit = TimeUnit.SECONDS)
@State(Scope.Thread)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmarkJava8.java`
#### Snippet
```java
@Fork(1)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 30, time = 1, timeUnit = TimeUnit.SECONDS)
@State(Scope.Thread)
public class AdapterBenchmarkJava8 extends AbstractBenchmark {
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `visitClassBound()` is identical to its super method
in `asm/src/main/java/org/objectweb/asm/signature/SignatureWriter.java`
#### Snippet
```java

  @Override
  public SignatureVisitor visitClassBound() {
    return this;
  }
```

### RedundantMethodOverride
Method `visitInterface()` is identical to its super method
in `asm/src/main/java/org/objectweb/asm/signature/SignatureWriter.java`
#### Snippet
```java

  @Override
  public SignatureVisitor visitInterface() {
    return this;
  }
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmark.java`
#### Snippet
```java
  @Setup
  public void prepare() throws Exception {
    asm4dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V4_0).newAsmBenchmark();
    asm5dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmark.java`
#### Snippet
```java
  public void prepare() throws Exception {
    asm4dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V4_0).newAsmBenchmark();
    asm5dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmark.java`
#### Snippet
```java
    asm4dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V4_0).newAsmBenchmark();
    asm5dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmark.java`
#### Snippet
```java
    asm5dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmark.java`
#### Snippet
```java
    asm6dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Adapter) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmark.java`
#### Snippet
```java
    asm7dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Adapter) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();
    aspectJBcel = new AspectjBcelAdapter();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmark.java`
#### Snippet
```java
    asm8dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Adapter) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();
    aspectJBcel = new AspectjBcelAdapter();
    bcel = new BcelAdapter();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/GeneratorBenchmark.java`
#### Snippet
```java
  @Setup
  public void prepare() throws Exception {
    asm5dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/GeneratorBenchmark.java`
#### Snippet
```java
  public void prepare() throws Exception {
    asm5dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/GeneratorBenchmark.java`
#### Snippet
```java
    asm5dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/GeneratorBenchmark.java`
#### Snippet
```java
    asm6dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Generator) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/GeneratorBenchmark.java`
#### Snippet
```java
    asm7dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Generator) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();
    aspectJBcel = new AspectjBcelGenerator();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/GeneratorBenchmark.java`
#### Snippet
```java
    asm8dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Generator) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();
    aspectJBcel = new AspectjBcelGenerator();
    bcel = new BcelGenerator();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/MemoryBenchmark.java`
#### Snippet
```java
  @Setup
  public void prepare() throws Exception {
    asm4dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V4_0).newAsmBenchmark();
    asm5dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/MemoryBenchmark.java`
#### Snippet
```java
  public void prepare() throws Exception {
    asm4dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V4_0).newAsmBenchmark();
    asm5dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/MemoryBenchmark.java`
#### Snippet
```java
    asm4dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V4_0).newAsmBenchmark();
    asm5dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/MemoryBenchmark.java`
#### Snippet
```java
    asm5dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/MemoryBenchmark.java`
#### Snippet
```java
    asm6dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Factory) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/MemoryBenchmark.java`
#### Snippet
```java
    asm7dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Factory) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();

```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/MemoryBenchmark.java`
#### Snippet
```java
    asm8dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Factory) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();

    // Check that the correct versions of ASM have been loaded.
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmarkJava8.java`
#### Snippet
```java
  @Setup
  public void prepare() throws Exception {
    asm5dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmarkJava8.java`
#### Snippet
```java
  public void prepare() throws Exception {
    asm5dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmarkJava8.java`
#### Snippet
```java
    asm5dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmarkJava8.java`
#### Snippet
```java
    asm6dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Adapter) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();
```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmarkJava8.java`
#### Snippet
```java
    asm7dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Adapter) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();

```

### AutoCloseableResource
'AsmBenchmarkFactory' used without 'try'-with-resources statement
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmarkJava8.java`
#### Snippet
```java
    asm8dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Adapter) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();

    // Check that the correct versions of ASM have been loaded.
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `asm-commons/src/main/java/org/objectweb/asm/commons/CodeSizeEvaluator.java`
#### Snippet
```java
  @Override
  public void visitLdcInsn(final Object value) {
    if (value instanceof Long
        || value instanceof Double
        || (value instanceof ConstantDynamic && ((ConstantDynamic) value).getSize() == 2)) {
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `asm/src/main/java/org/objectweb/asm/Label.java`
#### Snippet
```java
      final int relativeOffset = bytecodeOffset - sourceInsnBytecodeOffset;
      int handle = reference & FORWARD_REFERENCE_HANDLE_MASK;
      if ((reference & FORWARD_REFERENCE_TYPE_MASK) == FORWARD_REFERENCE_TYPE_SHORT) {
        if (relativeOffset < Short.MIN_VALUE || relativeOffset > Short.MAX_VALUE) {
          // Change the opcode of the jump instruction, in order to be able to find it later in
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `asm-tree/src/main/java/org/objectweb/asm/tree/InsnList.java`
#### Snippet
```java
    }
    size += insnList.size;
    if (lastInsn == null) {
      firstInsn = insnList.firstInsn;
      lastInsn = insnList.lastInsn;
```

## RuleId[id=ListRemoveInLoop]
### ListRemoveInLoop
Can be replaced with 'List.subList().clear()'
in `asm-commons/src/main/java/org/objectweb/asm/commons/AnalyzerAdapter.java`
#### Snippet
```java
    int size = stack.size();
    int end = size - numSlots;
    for (int i = size - 1; i >= end; --i) {
      stack.remove(i);
    }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
   * The relative stack size after the last visited instruction. This size is relative to the
   * beginning of {@link #currentBasicBlock}, i.e. the true stack size after the last visited
   * instruction is equal to the {@link Label#inputStackSize} of the current basic block plus {@link
   * #relativeStackSize}. When {@link #compute} is equal to {@link
   * #COMPUTE_MAX_STACK_AND_LOCAL_FROM_FRAMES}, {@link #currentBasicBlock} is always the start of
```

### JavadocDeclaration
Javadoc pointing to itself
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
   * the beginning of {@link #currentBasicBlock}, i.e. the true maximum stack size after the last
   * visited instruction is equal to the {@link Label#inputStackSize} of the current basic block
   * plus {@link #maxRelativeStackSize}.When {@link #compute} is equal to {@link
   * #COMPUTE_MAX_STACK_AND_LOCAL_FROM_FRAMES}, {@link #currentBasicBlock} is always the start of
   * the method, so this relative size is also equal to the absolute maximum stack size after the
```

### JavadocDeclaration
Javadoc pointing to itself
in `asm/src/main/java/org/objectweb/asm/ClassWriter.java`
#### Snippet
```java
   * map frames are recomputed from the methods bytecode. The arguments of the {@link
   * MethodVisitor#visitMaxs} method are also ignored and recomputed from the bytecode. In other
   * words, {@link #COMPUTE_FRAMES} implies {@link #COMPUTE_MAXS}.
   *
   * @see #ClassWriter(int)
```

### JavadocDeclaration
Javadoc pointing to itself
in `asm-tree/src/main/java/org/objectweb/asm/tree/LocalVariableAnnotationNode.java`
#### Snippet
```java
  /**
   * Constructs a new {@link LocalVariableAnnotationNode}. <i>Subclasses must not use this
   * constructor</i>. Instead, they must use the {@link #LocalVariableAnnotationNode(int, TypePath,
   * LabelNode[], LabelNode[], int[], String)} version.
   *
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `(opcode - Opcodes.LCONST_0)` to `long` is redundant
in `asm-commons/src/main/java/org/objectweb/asm/commons/InstructionAdapter.java`
#### Snippet
```java
      case Opcodes.LCONST_0:
      case Opcodes.LCONST_1:
        lconst((long) (opcode - Opcodes.LCONST_0));
        break;
      case Opcodes.FCONST_0:
```

### RedundantCast
Casting `(opcode - Opcodes.DCONST_0)` to `double` is redundant
in `asm-commons/src/main/java/org/objectweb/asm/commons/InstructionAdapter.java`
#### Snippet
```java
      case Opcodes.DCONST_0:
      case Opcodes.DCONST_1:
        dconst((double) (opcode - Opcodes.DCONST_0));
        break;
      case Opcodes.IALOAD:
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `classNames` may be 'final'
in `asm-commons/src/main/java/org/objectweb/asm/commons/SignatureRemapper.java`
#### Snippet
```java
  private final Remapper remapper;

  private ArrayList<String> classNames = new ArrayList<>();

  /**
```

### FieldMayBeFinal
Field `constantPool` may be 'final'
in `asm/src/main/java/org/objectweb/asm/SymbolTable.java`
#### Snippet
```java
   * The ClassFile's constant_pool_count field is <i>not</i> included.
   */
  private ByteVector constantPool;

  /**
```

### FieldMayBeFinal
Field `owner` may be 'final'
in `asm-commons/src/main/java/org/objectweb/asm/commons/AnalyzerAdapter.java`
#### Snippet
```java

  /** The owner's class name. */
  private String owner;

  /**
```

### FieldMayBeFinal
Field `referencedLabels` may be 'final'
in `asm-util/src/main/java/org/objectweb/asm/util/CheckMethodAdapter.java`
#### Snippet
```java

  /** The labels referenced by the visited method. */
  private Set<Label> referencedLabels;

  /** The index of the instruction corresponding to the last visited stack map frame. */
```

### FieldMayBeFinal
Field `handlers` may be 'final'
in `asm-util/src/main/java/org/objectweb/asm/util/CheckMethodAdapter.java`
#### Snippet
```java
   * exception handler block.
   */
  private List<Label> handlers;

  /**
```

### FieldMayBeFinal
Field `checkDataFlow` may be 'final'
in `asm-util/src/main/java/org/objectweb/asm/util/CheckClassAdapter.java`
#### Snippet
```java

  /** Whether the bytecode must be checked with a BasicVerifier. */
  private boolean checkDataFlow;

  /** The class version number. */
```

### FieldMayBeFinal
Field `labelInsnIndices` may be 'final'
in `asm-util/src/main/java/org/objectweb/asm/util/CheckClassAdapter.java`
#### Snippet
```java

  /** The index of the instruction designated by each visited label so far. */
  private Map<Label, Integer> labelInsnIndices;

  // -----------------------------------------------------------------------------------------------
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AsmFactory.java`
#### Snippet
```java
        }
      } catch (NoSuchFieldException e) {
        continue;
      }
    }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AsmGenerator.java`
#### Snippet
```java
        }
      } catch (NoSuchFieldException e) {
        continue;
      }
    }
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AsmAdapter.java`
#### Snippet
```java
        }
      } catch (NoSuchFieldException e) {
        continue;
      } catch (IllegalAccessException e) {
        throw new AssertionError(e);
```

## RuleId[id=PointlessBitwiseExpression]
### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int V10 = 0 << 16 | 54;
  int V11 = 0 << 16 | 55;
  int V12 = 0 << 16 | 56;
  int V13 = 0 << 16 | 57;
  int V14 = 0 << 16 | 58;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int V1_7 = 0 << 16 | 51;
  int V1_8 = 0 << 16 | 52;
  int V9 = 0 << 16 | 53;
  int V10 = 0 << 16 | 54;
  int V11 = 0 << 16 | 55;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int V14 = 0 << 16 | 58;
  int V15 = 0 << 16 | 59;
  int V16 = 0 << 16 | 60;
  int V17 = 0 << 16 | 61;
  int V18 = 0 << 16 | 62;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int V13 = 0 << 16 | 57;
  int V14 = 0 << 16 | 58;
  int V15 = 0 << 16 | 59;
  int V16 = 0 << 16 | 60;
  int V17 = 0 << 16 | 61;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int V1_5 = 0 << 16 | 49;
  int V1_6 = 0 << 16 | 50;
  int V1_7 = 0 << 16 | 51;
  int V1_8 = 0 << 16 | 52;
  int V9 = 0 << 16 | 53;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java

  int V1_1 = 3 << 16 | 45;
  int V1_2 = 0 << 16 | 46;
  int V1_3 = 0 << 16 | 47;
  int V1_4 = 0 << 16 | 48;
```

### PointlessBitwiseExpression
`0 << 8` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
   * @deprecated This API is experimental.
   */
  @Deprecated int ASM10_EXPERIMENTAL = 1 << 24 | 10 << 16 | 0 << 8;

  int API_VERSION = ASM9; //[JB: convenience constant]
```

### PointlessBitwiseExpression
`0 << 8` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  // ASM API versions.

  int ASM4 = 4 << 16 | 0 << 8;
  int ASM5 = 5 << 16 | 0 << 8;
  int ASM6 = 6 << 16 | 0 << 8;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int V1_4 = 0 << 16 | 48;
  int V1_5 = 0 << 16 | 49;
  int V1_6 = 0 << 16 | 50;
  int V1_7 = 0 << 16 | 51;
  int V1_8 = 0 << 16 | 52;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int V1_6 = 0 << 16 | 50;
  int V1_7 = 0 << 16 | 51;
  int V1_8 = 0 << 16 | 52;
  int V9 = 0 << 16 | 53;
  int V10 = 0 << 16 | 54;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int V15 = 0 << 16 | 59;
  int V16 = 0 << 16 | 60;
  int V17 = 0 << 16 | 61;
  int V18 = 0 << 16 | 62;
  int V19 = 0 << 16 | 63;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int V19 = 0 << 16 | 63;
  int V20 = 0 << 16 | 64;
  int V21 = 0 << 16 | 65;

  /**
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int V9 = 0 << 16 | 53;
  int V10 = 0 << 16 | 54;
  int V11 = 0 << 16 | 55;
  int V12 = 0 << 16 | 56;
  int V13 = 0 << 16 | 57;
```

### PointlessBitwiseExpression
`0 << 8` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int ASM7 = 7 << 16 | 0 << 8;
  int ASM8 = 8 << 16 | 0 << 8;
  int ASM9 = 9 << 16 | 0 << 8;

  /**
```

### PointlessBitwiseExpression
`0 << 8` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java

  int ASM4 = 4 << 16 | 0 << 8;
  int ASM5 = 5 << 16 | 0 << 8;
  int ASM6 = 6 << 16 | 0 << 8;
  int ASM7 = 7 << 16 | 0 << 8;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int V18 = 0 << 16 | 62;
  int V19 = 0 << 16 | 63;
  int V20 = 0 << 16 | 64;
  int V21 = 0 << 16 | 65;

```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int V1_3 = 0 << 16 | 47;
  int V1_4 = 0 << 16 | 48;
  int V1_5 = 0 << 16 | 49;
  int V1_6 = 0 << 16 | 50;
  int V1_7 = 0 << 16 | 51;
```

### PointlessBitwiseExpression
`0 << 8` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int ASM6 = 6 << 16 | 0 << 8;
  int ASM7 = 7 << 16 | 0 << 8;
  int ASM8 = 8 << 16 | 0 << 8;
  int ASM9 = 9 << 16 | 0 << 8;

```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int V17 = 0 << 16 | 61;
  int V18 = 0 << 16 | 62;
  int V19 = 0 << 16 | 63;
  int V20 = 0 << 16 | 64;
  int V21 = 0 << 16 | 65;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int V16 = 0 << 16 | 60;
  int V17 = 0 << 16 | 61;
  int V18 = 0 << 16 | 62;
  int V19 = 0 << 16 | 63;
  int V20 = 0 << 16 | 64;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int V1_2 = 0 << 16 | 46;
  int V1_3 = 0 << 16 | 47;
  int V1_4 = 0 << 16 | 48;
  int V1_5 = 0 << 16 | 49;
  int V1_6 = 0 << 16 | 50;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int V1_1 = 3 << 16 | 45;
  int V1_2 = 0 << 16 | 46;
  int V1_3 = 0 << 16 | 47;
  int V1_4 = 0 << 16 | 48;
  int V1_5 = 0 << 16 | 49;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int V11 = 0 << 16 | 55;
  int V12 = 0 << 16 | 56;
  int V13 = 0 << 16 | 57;
  int V14 = 0 << 16 | 58;
  int V15 = 0 << 16 | 59;
```

### PointlessBitwiseExpression
`0 << 8` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int ASM5 = 5 << 16 | 0 << 8;
  int ASM6 = 6 << 16 | 0 << 8;
  int ASM7 = 7 << 16 | 0 << 8;
  int ASM8 = 8 << 16 | 0 << 8;
  int ASM9 = 9 << 16 | 0 << 8;
```

### PointlessBitwiseExpression
`0 << 8` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int ASM4 = 4 << 16 | 0 << 8;
  int ASM5 = 5 << 16 | 0 << 8;
  int ASM6 = 6 << 16 | 0 << 8;
  int ASM7 = 7 << 16 | 0 << 8;
  int ASM8 = 8 << 16 | 0 << 8;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int V12 = 0 << 16 | 56;
  int V13 = 0 << 16 | 57;
  int V14 = 0 << 16 | 58;
  int V15 = 0 << 16 | 59;
  int V16 = 0 << 16 | 60;
```

### PointlessBitwiseExpression
`0 << 16` can be replaced with '0'
in `asm/src/main/java/org/objectweb/asm/Opcodes.java`
#### Snippet
```java
  int V1_8 = 0 << 16 | 52;
  int V9 = 0 << 16 | 53;
  int V10 = 0 << 16 | 54;
  int V11 = 0 << 16 | 55;
  int V12 = 0 << 16 | 56;
```

## RuleId[id=ConfusingMainMethod]
### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `asm-util/src/main/java/org/objectweb/asm/util/Printer.java`
#### Snippet
```java
   * @throws IOException if the class cannot be found, or if an IOException occurs.
   */
  static void main(
      final String[] args,
      final String usage,
```

### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `asm-util/src/main/java/org/objectweb/asm/util/ASMifier.java`
#### Snippet
```java
   * @throws IOException if the class cannot be found, or if an IOException occurs.
   */
  static void main(final String[] args, final PrintWriter output, final PrintWriter logger)
      throws IOException {
    main(args, USAGE, new ASMifier(), output, logger);
```

### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `asm-util/src/main/java/org/objectweb/asm/util/Textifier.java`
#### Snippet
```java
   * @throws IOException if the class cannot be found, or if an IOException occurs.
   */
  static void main(final String[] args, final PrintWriter output, final PrintWriter logger)
      throws IOException {
    main(args, USAGE, new Textifier(), output, logger);
```

### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `asm-util/src/main/java/org/objectweb/asm/util/CheckClassAdapter.java`
#### Snippet
```java
   * @throws IOException if the class cannot be found, or if an IO exception occurs.
   */
  static void main(final String[] args, final PrintWriter logger) throws IOException {
    if (args.length != 1) {
      logger.println(USAGE);
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `end` is redundant
in `asm/src/main/java/org/objectweb/asm/Type.java`
#### Snippet
```java
    int hashCode = 13 * (sort == INTERNAL ? OBJECT : sort);
    if (sort >= ARRAY) {
      for (int i = valueBegin, end = valueEnd; i < end; i++) {
        hashCode = 17 * (hashCode + valueBuffer.charAt(i));
      }
```

### UnnecessaryLocalVariable
Local variable `otherEnd` is redundant
in `asm/src/main/java/org/objectweb/asm/Type.java`
#### Snippet
```java
    int end = valueEnd;
    int otherBegin = other.valueBegin;
    int otherEnd = other.valueEnd;
    // Compare the values.
    if (end - begin != otherEnd - otherBegin) {
```

### UnnecessaryLocalVariable
Local variable `pos` is redundant
in `asm-util/src/main/java/org/objectweb/asm/util/CheckClassAdapter.java`
#### Snippet
```java
    //   (one of)
    //   B C D F I J S Z
    int pos = startPos;
    switch (getChar(signature, pos)) {
      case 'B':
```

### UnnecessaryLocalVariable
Local variable `offsetDelta` is redundant
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
      int frameType = parser.u1();
      if (frameType < 64) {
        int offsetDelta = frameType;
        bytecodeOffset += offsetDelta + 1;
        builder.addInsnIndex("SAME ", bytecodeOffset);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `intOp` initializer `-1` is redundant
in `asm-commons/src/main/java/org/objectweb/asm/commons/GeneratorAdapter.java`
#### Snippet
```java
        }
      default:
        int intOp = -1;
        switch (mode) {
          case EQ:
```

### UnusedAssignment
The value `insnNode` assigned to `firstInsn` is never used
in `asm-tree/src/main/java/org/objectweb/asm/tree/InsnList.java`
#### Snippet
```java
    ++size;
    if (firstInsn == null) {
      firstInsn = insnNode;
      lastInsn = insnNode;
    } else {
```

### UnusedAssignment
The value `insnNode` assigned to `lastInsn` is never used
in `asm-tree/src/main/java/org/objectweb/asm/tree/InsnList.java`
#### Snippet
```java
    if (lastInsn == null) {
      firstInsn = insnNode;
      lastInsn = insnNode;
    } else {
      lastInsn.nextInsn = insnNode;
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `asm-tree/src/main/java/org/objectweb/asm/tree/Util.java`
#### Snippet
```java
    ArrayList<T> list = new ArrayList<>(array.length);
    for (T t : array) {
      list.add(t); // NOPMD(UseArraysAsList): we want a modifiable list.
    }
    return list;
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `code` is always 'null'
in `asm/src/main/java/org/objectweb/asm/Attribute.java`
#### Snippet
```java
    final int maxStack = -1;
    final int maxLocals = -1;
    putAttributes(symbolTable, code, codeLength, maxStack, maxLocals, output);
  }

```

### ConstantValue
Value `code` is always 'null'
in `asm/src/main/java/org/objectweb/asm/Attribute.java`
#### Snippet
```java
    final int maxStack = -1;
    final int maxLocals = -1;
    return computeAttributesSize(symbolTable, code, codeLength, maxStack, maxLocals);
  }

```

### ConstantValue
Value `annotationVisitor` is always 'null'
in `asm-commons/src/main/java/org/objectweb/asm/commons/MethodRemapper.java`
#### Snippet
```java
        super.visitTryCatchAnnotation(typeRef, typePath, remapper.mapDesc(descriptor), visible);
    return annotationVisitor == null
        ? annotationVisitor
        : createAnnotationRemapper(descriptor, annotationVisitor);
  }
```

### ConstantValue
Value `frameTypes` is always 'null'
in `asm-commons/src/main/java/org/objectweb/asm/commons/MethodRemapper.java`
#### Snippet
```java
  private Object[] remapFrameTypes(final int numTypes, final Object[] frameTypes) {
    if (frameTypes == null) {
      return frameTypes;
    }
    Object[] remappedFrameTypes = null;
```

### ConstantValue
Value `annotationVisitor` is always 'null'
in `asm-commons/src/main/java/org/objectweb/asm/commons/MethodRemapper.java`
#### Snippet
```java
        super.visitInsnAnnotation(typeRef, typePath, remapper.mapDesc(descriptor), visible);
    return annotationVisitor == null
        ? annotationVisitor
        : createAnnotationRemapper(descriptor, annotationVisitor);
  }
```

### ConstantValue
Value `annotationVisitor` is always 'null'
in `asm-commons/src/main/java/org/objectweb/asm/commons/MethodRemapper.java`
#### Snippet
```java
            typeRef, typePath, start, end, index, remapper.mapDesc(descriptor), visible);
    return annotationVisitor == null
        ? annotationVisitor
        : createAnnotationRemapper(descriptor, annotationVisitor);
  }
```

### ConstantValue
Value `annotationVisitor` is always 'null'
in `asm-commons/src/main/java/org/objectweb/asm/commons/MethodRemapper.java`
#### Snippet
```java
        super.visitParameterAnnotation(parameter, remapper.mapDesc(descriptor), visible);
    return annotationVisitor == null
        ? annotationVisitor
        : createAnnotationRemapper(descriptor, annotationVisitor);
  }
```

### ConstantValue
Value `annotationVisitor` is always 'null'
in `asm-commons/src/main/java/org/objectweb/asm/commons/MethodRemapper.java`
#### Snippet
```java
    AnnotationVisitor annotationVisitor = super.visitAnnotationDefault();
    return annotationVisitor == null
        ? annotationVisitor
        : createAnnotationRemapper(/* descriptor = */ null, annotationVisitor);
  }
```

### ConstantValue
Value `annotationVisitor` is always 'null'
in `asm-commons/src/main/java/org/objectweb/asm/commons/MethodRemapper.java`
#### Snippet
```java
        super.visitTypeAnnotation(typeRef, typePath, remapper.mapDesc(descriptor), visible);
    return annotationVisitor == null
        ? annotationVisitor
        : createAnnotationRemapper(descriptor, annotationVisitor);
  }
```

### ConstantValue
Value `annotationVisitor` is always 'null'
in `asm-commons/src/main/java/org/objectweb/asm/commons/MethodRemapper.java`
#### Snippet
```java
        super.visitAnnotation(remapper.mapDesc(descriptor), visible);
    return annotationVisitor == null
        ? annotationVisitor
        : createAnnotationRemapper(descriptor, annotationVisitor);
  }
```

### ConstantValue
Condition `Opcodes.class.getField(version) != null` is always `true`
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AsmFactory.java`
#### Snippet
```java
      try {
        String version = "ASM" + i;
        if (Opcodes.class.getField(version) != null) {
          return version;
        }
```

### ConstantValue
Condition `Opcodes.class.getField(version) != null` is always `true`
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AsmGenerator.java`
#### Snippet
```java
      try {
        String version = "ASM" + i;
        if (Opcodes.class.getField(version) != null) {
          return version;
        }
```

### ConstantValue
Value `isInstanceMethod` is always 'true'
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Analyzer.java`
#### Snippet
```java
      Type ownerType = Type.getObjectType(owner);
      frame.setLocal(
          currentLocal, interpreter.newParameterValue(isInstanceMethod, currentLocal, ownerType));
      currentLocal++;
    }
```

### ConstantValue
Condition `Opcodes.class.getField(version) != null` is always `true`
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AsmAdapter.java`
#### Snippet
```java
      try {
        String version = "ASM" + i;
        if (Opcodes.class.getField(version) != null) {
          asmApi = Opcodes.class.getField(version).getInt(null);
          return version;
```

### ConstantValue
Condition `startPos == -1` is always `false`
in `asm-util/src/main/java/org/objectweb/asm/util/CheckMethodAdapter.java`
#### Snippet
```java
      case 'L':
        int endPos = descriptor.indexOf(';', startPos);
        if (startPos == -1 || endPos - startPos < 2) {
          throw new IllegalArgumentException(INVALID_DESCRIPTOR + descriptor);
        }
```

### ConstantValue
Condition `frameType >= Frame.CHOP_FRAME` is always `true`
in `asm/src/main/java/org/objectweb/asm/ClassReader.java`
#### Snippet
```java
        context.currentFrameType = Opcodes.F_SAME1;
        context.currentFrameStackCount = 1;
      } else if (frameType >= Frame.CHOP_FRAME && frameType < Frame.SAME_FRAME_EXTENDED) {
        context.currentFrameType = Opcodes.F_CHOP;
        context.currentFrameLocalCountDelta = Frame.SAME_FRAME_EXTENDED - frameType;
```

