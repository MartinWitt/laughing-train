# intellij-deps-asm 
 
# Bad smells
I found 379 bad smells with 12 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DuplicateBranchesInSwitch | 62 | false |
| ReturnNull | 53 | false |
| NestedAssignment | 43 | false |
| UnnecessaryUnboxing | 33 | false |
| PointlessBitwiseExpression | 27 | false |
| IOResource | 26 | false |
| ConstantValue | 16 | false |
| BoundedWildcard | 13 | false |
| UnnecessaryFullyQualifiedName | 12 | false |
| ZeroLengthArrayInitialization | 11 | false |
| NonShortCircuitBoolean | 10 | false |
| DefaultAnnotationParam | 10 | false |
| EmptyMethod | 8 | false |
| SizeReplaceableByIsEmpty | 7 | true |
| DataFlowIssue | 6 | false |
| SystemOutErr | 5 | false |
| AssignmentToStaticFieldFromInstanceMethod | 4 | false |
| UnnecessaryLocalVariable | 4 | true |
| IfStatementWithIdenticalBranches | 3 | false |
| UnnecessaryContinue | 3 | false |
| UnusedAssignment | 3 | false |
| ManualArrayToCollectionCopy | 2 | false |
| UnnecessarySemicolon | 2 | false |
| CommentedOutCode | 2 | false |
| RegExpRedundantEscape | 2 | false |
| RedundantMethodOverride | 2 | false |
| MismatchedArrayReadWrite | 1 | false |
| DoubleNegation | 1 | false |
| Java8ListReplaceAll | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| ManualMinMaxCalculation | 1 | false |
| StringEqualsEmptyString | 1 | false |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| ListRemoveInLoop | 1 | false |
| Java8MapApi | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=IOResource]
### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/GeneratorBenchmark.java`
#### Snippet
```java
  @Setup
  public void prepare() throws Exception {
    asm5dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/GeneratorBenchmark.java`
#### Snippet
```java
  public void prepare() throws Exception {
    asm5dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/GeneratorBenchmark.java`
#### Snippet
```java
    asm5dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/GeneratorBenchmark.java`
#### Snippet
```java
    asm6dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Generator) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/GeneratorBenchmark.java`
#### Snippet
```java
    asm7dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Generator) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();
    aspectJBcel = new AspectjBcelGenerator();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/GeneratorBenchmark.java`
#### Snippet
```java
    asm8dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Generator) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Generator) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();
    aspectJBcel = new AspectjBcelGenerator();
    bcel = new BcelGenerator();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/MemoryBenchmark.java`
#### Snippet
```java
  @Setup
  public void prepare() throws Exception {
    asm4dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V4_0).newAsmBenchmark();
    asm5dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/MemoryBenchmark.java`
#### Snippet
```java
  public void prepare() throws Exception {
    asm4dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V4_0).newAsmBenchmark();
    asm5dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/MemoryBenchmark.java`
#### Snippet
```java
    asm4dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V4_0).newAsmBenchmark();
    asm5dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/MemoryBenchmark.java`
#### Snippet
```java
    asm5dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/MemoryBenchmark.java`
#### Snippet
```java
    asm6dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Factory) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/MemoryBenchmark.java`
#### Snippet
```java
    asm7dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Factory) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();

```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/MemoryBenchmark.java`
#### Snippet
```java
    asm8dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Factory) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Factory) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();

    // Check that the correct versions of ASM have been loaded.
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmark.java`
#### Snippet
```java
  @Setup
  public void prepare() throws Exception {
    asm4dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V4_0).newAsmBenchmark();
    asm5dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmark.java`
#### Snippet
```java
  public void prepare() throws Exception {
    asm4dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V4_0).newAsmBenchmark();
    asm5dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmark.java`
#### Snippet
```java
    asm4dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V4_0).newAsmBenchmark();
    asm5dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmark.java`
#### Snippet
```java
    asm5dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmark.java`
#### Snippet
```java
    asm6dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Adapter) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmark.java`
#### Snippet
```java
    asm7dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Adapter) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();
    aspectJBcel = new AspectjBcelAdapter();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmark.java`
#### Snippet
```java
    asm8dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Adapter) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();
    aspectJBcel = new AspectjBcelAdapter();
    bcel = new BcelAdapter();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmarkJava8.java`
#### Snippet
```java
  @Setup
  public void prepare() throws Exception {
    asm5dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmarkJava8.java`
#### Snippet
```java
  public void prepare() throws Exception {
    asm5dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmarkJava8.java`
#### Snippet
```java
    asm5dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V5_0).newAsmBenchmark();
    asm6dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmarkJava8.java`
#### Snippet
```java
    asm6dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V6_0).newAsmBenchmark();
    asm7dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Adapter) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();
```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmarkJava8.java`
#### Snippet
```java
    asm7dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V7_0).newAsmBenchmark();
    asm8dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Adapter) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();

```

### IOResource
'AsmBenchmarkFactory' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AdapterBenchmarkJava8.java`
#### Snippet
```java
    asm8dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V8_0).newAsmBenchmark();
    asm9dot0 = (Adapter) new AsmBenchmarkFactory(AsmVersion.V9_0).newAsmBenchmark();
    asmCurrent = (Adapter) new AsmBenchmarkFactory(AsmVersion.V_CURRENT).newAsmBenchmark();

    // Check that the correct versions of ASM have been loaded.
```

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

## RuleId[id=ManualArrayToCollectionCopy]
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

## RuleId[id=DataFlowIssue]
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

## RuleId[id=UnnecessarySemicolon]
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

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `references` from instance context
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/MemoryProfiler.java`
#### Snippet
```java
      return;
    }
    references = new Object[100000];
    referenceCount = 0;
    usedMemoryBeforeIteration = memoryProbe.getUsedMemory();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `referenceCount` from instance context
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/MemoryProfiler.java`
#### Snippet
```java
    }
    references = new Object[100000];
    referenceCount = 0;
    usedMemoryBeforeIteration = memoryProbe.getUsedMemory();
  }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `usedMemoryBeforeIteration` from instance context
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/MemoryProfiler.java`
#### Snippet
```java
    references = new Object[100000];
    referenceCount = 0;
    usedMemoryBeforeIteration = memoryProbe.getUsedMemory();
  }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `references` from instance context
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/MemoryProfiler.java`
#### Snippet
```java
    }
    long usedMemoryAfterIteration = memoryProbe.getUsedMemory();
    references = null;

    long usedMemoryInIteration = usedMemoryAfterIteration - usedMemoryBeforeIteration;
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

## RuleId[id=Java8ListReplaceAll]
### Java8ListReplaceAll
The loop can be replaced with 'List.replaceAll'
in `asm-commons/src/main/java/org/objectweb/asm/commons/ClassRemapper.java`
#### Snippet
```java
      ModuleHashesAttribute moduleHashesAttribute = (ModuleHashesAttribute) attribute;
      List<String> modules = moduleHashesAttribute.modules;
      for (int i = 0; i < modules.size(); ++i) {
        modules.set(i, remapper.mapModuleName(modules.get(i)));
      }
```

## RuleId[id=DuplicateBranchesInSwitch]
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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`name.length() == 0` can be replaced with 'name.isEmpty()'
in `asm-util/src/main/java/org/objectweb/asm/util/CheckSignatureAdapter.java`
#### Snippet
```java

  private void checkIdentifier(final String name, final String message) {
    if (name == null || name.length() == 0) {
      throw new IllegalArgumentException(INVALID + message + " (must not be null or empty)");
    }
```

### SizeReplaceableByIsEmpty
`name.length() == 0` can be replaced with 'name.isEmpty()'
in `asm-util/src/main/java/org/objectweb/asm/util/CheckSignatureAdapter.java`
#### Snippet
```java

  private void checkClassName(final String name, final String message) {
    if (name == null || name.length() == 0) {
      throw new IllegalArgumentException(INVALID + message + " (must not be null or empty)");
    }
```

### SizeReplaceableByIsEmpty
`stringBuilder.length() > 0` can be replaced with '!stringBuilder.isEmpty()'
in `asm-util/src/main/java/org/objectweb/asm/util/Textifier.java`
#### Snippet
```java
      stringBuilder.append(tab).append("// debug info: ").append(debug).append('\n');
    }
    if (stringBuilder.length() > 0) {
      text.add(stringBuilder.toString());
    }
```

### SizeReplaceableByIsEmpty
`typePath.length() == 0` can be replaced with 'typePath.isEmpty()'
in `asm/src/main/java/org/objectweb/asm/TypePath.java`
#### Snippet
```java
   */
  public static TypePath fromString(final String typePath) {
    if (typePath == null || typePath.length() == 0) {
      return null;
    }
```

### SizeReplaceableByIsEmpty
`name.length() == 0` can be replaced with 'name.isEmpty()'
in `asm-util/src/main/java/org/objectweb/asm/util/CheckMethodAdapter.java`
#### Snippet
```java
   */
  static void checkMethodIdentifier(final int version, final String name, final String message) {
    if (name == null || name.length() == 0) {
      throw new IllegalArgumentException(INVALID + message + MUST_NOT_BE_NULL_OR_EMPTY);
    }
```

### SizeReplaceableByIsEmpty
`descriptor.length() == 0` can be replaced with 'descriptor.isEmpty()'
in `asm-util/src/main/java/org/objectweb/asm/util/CheckMethodAdapter.java`
#### Snippet
```java
   */
  static void checkMethodDescriptor(final int version, final String descriptor) {
    if (descriptor == null || descriptor.length() == 0) {
      throw new IllegalArgumentException("Invalid method descriptor (must not be null or empty)");
    }
```

### SizeReplaceableByIsEmpty
`name.length() == 0` can be replaced with 'name.isEmpty()'
in `asm-util/src/main/java/org/objectweb/asm/util/CheckMethodAdapter.java`
#### Snippet
```java
   */
  static void checkInternalName(final int version, final String name, final String message) {
    if (name == null || name.length() == 0) {
      throw new IllegalArgumentException(INVALID + message + MUST_NOT_BE_NULL_OR_EMPTY);
    }
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `frameChanged |= merge(symbolTable, concreteOutputType, dstFrame.inputLocals, i)`
in `asm/src/main/java/org/objectweb/asm/Frame.java`
#### Snippet
```java
        concreteOutputType = getInitializedType(symbolTable, concreteOutputType);
      }
      frameChanged |= merge(symbolTable, concreteOutputType, dstFrame.inputLocals, i);
    }

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `frameChanged |= merge(symbolTable, inputLocals[i], dstFrame.inputLocals, i)`
in `asm/src/main/java/org/objectweb/asm/Frame.java`
#### Snippet
```java
    if (catchTypeIndex > 0) {
      for (int i = 0; i < numLocal; ++i) {
        frameChanged |= merge(symbolTable, inputLocals[i], dstFrame.inputLocals, i);
      }
      if (dstFrame.inputStack == null) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `frameChanged |= merge(symbolTable, catchTypeIndex, dstFrame.inputStack, 0)`
in `asm/src/main/java/org/objectweb/asm/Frame.java`
#### Snippet
```java
        frameChanged = true;
      }
      frameChanged |= merge(symbolTable, catchTypeIndex, dstFrame.inputStack, 0);
      return frameChanged;
    }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `frameChanged |= merge(symbolTable, concreteOutputType, dstFrame.inputStack, i)`
in `asm/src/main/java/org/objectweb/asm/Frame.java`
#### Snippet
```java
        concreteOutputType = getInitializedType(symbolTable, concreteOutputType);
      }
      frameChanged |= merge(symbolTable, concreteOutputType, dstFrame.inputStack, i);
    }
    // Then, do this for the stack operands that have pushed in the basic block (this code is the
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `frameChanged |= merge(symbolTable, concreteOutputType, dstFrame.inputStack, numInputStack ...`
in `asm/src/main/java/org/objectweb/asm/Frame.java`
#### Snippet
```java
        concreteOutputType = getInitializedType(symbolTable, concreteOutputType);
      }
      frameChanged |=
          merge(symbolTable, concreteOutputType, dstFrame.inputStack, numInputStack + i);
    }
    return frameChanged;
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `changed |= oldSubroutine.merge(subroutineBeforeJsr)`
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Analyzer.java`
#### Snippet
```java
    Subroutine oldSubroutine = subroutines[insnIndex];
    if (oldSubroutine != null && subroutineBeforeJsr != null) {
      changed |= oldSubroutine.merge(subroutineBeforeJsr);
    }
    if (changed && !inInstructionsToProcess[insnIndex]) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `changed |= oldSubroutine.merge(subroutine)`
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Analyzer.java`
#### Snippet
```java
    } else {
      if (subroutine != null) {
        changed |= oldSubroutine.merge(subroutine);
      }
    }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasAsmInstructions |= label.resolve(code.data, code.length)`
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
  public void visitLabel(final Label label) {
    // Resolve the forward references to this label, if any.
    hasAsmInstructions |= label.resolve(code.data, code.length);
    // visitLabel starts a new basic block (except for debug only labels), so we need to update the
    // previous and current block references and list of successors.
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasFrames |= methodWriter.hasFrames()`
in `asm/src/main/java/org/objectweb/asm/ClassWriter.java`
#### Snippet
```java
    methodWriter = firstMethod;
    while (methodWriter != null) {
      hasFrames |= methodWriter.hasFrames();
      hasAsmInstructions |= methodWriter.hasAsmInstructions();
      methodWriter.putMethodInfo(result);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasAsmInstructions |= methodWriter.hasAsmInstructions()`
in `asm/src/main/java/org/objectweb/asm/ClassWriter.java`
#### Snippet
```java
    while (methodWriter != null) {
      hasFrames |= methodWriter.hasFrames();
      hasAsmInstructions |= methodWriter.hasAsmInstructions();
      methodWriter.putMethodInfo(result);
      methodWriter = (MethodWriter) methodWriter.mv;
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

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends LabelNode`
in `asm-tree/src/main/java/org/objectweb/asm/tree/LabelNode.java`
#### Snippet
```java

  @Override
  public AbstractInsnNode clone(final Map<LabelNode, LabelNode> clonedLabels) {
    return clonedLabels.get(this);
  }
```

### BoundedWildcard
Can generalize to `? extends V`
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Analyzer.java`
#### Snippet
```java
  private void merge(
      final int insnIndex,
      final Frame<V> frameBeforeJsr,
      final Frame<V> frameAfterRet,
      final Subroutine subroutineBeforeJsr,
```

### BoundedWildcard
Can generalize to `? super AbstractInsnNode`
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Analyzer.java`
#### Snippet
```java
   */
  private void findSubroutine(
      final int insnIndex, final Subroutine subroutine, final List<AbstractInsnNode> jsrInsns)
      throws AnalyzerException {
    ArrayList<Integer> instructionIndicesToProcess = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends V`
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Analyzer.java`
#### Snippet
```java
   * @throws AnalyzerException if the frames have incompatible sizes.
   */
  private void merge(final int insnIndex, final Frame<V> frame, final Subroutine subroutine)
      throws AnalyzerException {
    boolean changed;
```

### BoundedWildcard
Can generalize to `? extends V`
in `asm-util/src/main/java/org/objectweb/asm/util/CheckFrameAnalyzer.java`
#### Snippet
```java
   *     {@literal null} otherwise.
   */
  private String checkMerge(final Frame<V> srcFrame, final Frame<V> dstFrame) {
    int numLocals = srcFrame.getLocals();
    if (numLocals != dstFrame.getLocals()) {
```

### BoundedWildcard
Can generalize to `? extends V`
in `asm-util/src/main/java/org/objectweb/asm/util/CheckFrameAnalyzer.java`
#### Snippet
```java
   *     {@literal null} otherwise.
   */
  private String checkMerge(final Frame<V> srcFrame, final Frame<V> dstFrame) {
    int numLocals = srcFrame.getLocals();
    if (numLocals != dstFrame.getLocals()) {
```

### BoundedWildcard
Can generalize to `? extends V`
in `asm-util/src/main/java/org/objectweb/asm/util/CheckFrameAnalyzer.java`
#### Snippet
```java
   */
  private Frame<V> expandFrame(
      final String owner, final Frame<V> previousFrame, final FrameNode frameNode)
      throws AnalyzerException {
    Frame<V> frame = newFrame(previousFrame);
```

### BoundedWildcard
Can generalize to `? super Instantiation`
in `asm-commons/src/main/java/org/objectweb/asm/commons/JSRInlinerAdapter.java`
#### Snippet
```java
  private void emitInstantiation(
      final Instantiation instantiation,
      final List<Instantiation> worklist,
      final InsnList newInstructions,
      final List<TryCatchBlockNode> newTryCatchBlocks,
```

### BoundedWildcard
Can generalize to `? super TryCatchBlockNode`
in `asm-commons/src/main/java/org/objectweb/asm/commons/JSRInlinerAdapter.java`
#### Snippet
```java
      final List<Instantiation> worklist,
      final InsnList newInstructions,
      final List<TryCatchBlockNode> newTryCatchBlocks,
      final List<LocalVariableNode> newLocalVariables) {
    LabelNode previousLabelNode = null;
```

### BoundedWildcard
Can generalize to `? super LocalVariableNode`
in `asm-commons/src/main/java/org/objectweb/asm/commons/JSRInlinerAdapter.java`
#### Snippet
```java
      final InsnList newInstructions,
      final List<TryCatchBlockNode> newTryCatchBlocks,
      final List<LocalVariableNode> newLocalVariables) {
    LabelNode previousLabelNode = null;
    for (int i = 0; i < instructions.size(); ++i) {
```

### BoundedWildcard
Can generalize to `? extends LabelNode`
in `asm-tree/src/main/java/org/objectweb/asm/tree/AbstractInsnNode.java`
#### Snippet
```java
   * @return the clone of the given label.
   */
  static LabelNode clone(final LabelNode label, final Map<LabelNode, LabelNode> clonedLabels) {
    return clonedLabels.get(label);
  }
```

### BoundedWildcard
Can generalize to `? extends LabelNode`
in `asm-tree/src/main/java/org/objectweb/asm/tree/AbstractInsnNode.java`
#### Snippet
```java
   */
  static LabelNode[] clone(
      final List<LabelNode> labels, final Map<LabelNode, LabelNode> clonedLabels) {
    LabelNode[] clones = new LabelNode[labels.size()];
    for (int i = 0, n = clones.length; i < n; ++i) {
```

### BoundedWildcard
Can generalize to `? super Label`
in `asm-util/src/main/java/org/objectweb/asm/util/CheckMethodAdapter.java`
#### Snippet
```java
      final int api,
      final MethodVisitor methodVisitor,
      final Map<Label, Integer> labelInsnIndices) {
    super(api, methodVisitor);
    this.labelInsnIndices = labelInsnIndices;
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `asm-commons/src/main/java/org/objectweb/asm/commons/Method.java`
#### Snippet
```java
   */
  private static String getDescriptorInternal(final String type, final boolean defaultPackage) {
    if ("".equals(type)) {
      return type;
    }
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `asm-util/src/main/java/org/objectweb/asm/util/Textifier.java`
#### Snippet
```java
      visitType((Type) value);
    } else if (value instanceof Byte) {
      visitByte(((Byte) value).byteValue());
    } else if (value instanceof Boolean) {
      visitBoolean(((Boolean) value).booleanValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm-util/src/main/java/org/objectweb/asm/util/Textifier.java`
#### Snippet
```java
      visitByte(((Byte) value).byteValue());
    } else if (value instanceof Boolean) {
      visitBoolean(((Boolean) value).booleanValue());
    } else if (value instanceof Short) {
      visitShort(((Short) value).shortValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm-util/src/main/java/org/objectweb/asm/util/Textifier.java`
#### Snippet
```java
      visitBoolean(((Boolean) value).booleanValue());
    } else if (value instanceof Short) {
      visitShort(((Short) value).shortValue());
    } else if (value instanceof Character) {
      visitChar(((Character) value).charValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm-util/src/main/java/org/objectweb/asm/util/Textifier.java`
#### Snippet
```java
      visitShort(((Short) value).shortValue());
    } else if (value instanceof Character) {
      visitChar(((Character) value).charValue());
    } else if (value instanceof Integer) {
      visitInt(((Integer) value).intValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm-util/src/main/java/org/objectweb/asm/util/Textifier.java`
#### Snippet
```java
      visitChar(((Character) value).charValue());
    } else if (value instanceof Integer) {
      visitInt(((Integer) value).intValue());
    } else if (value instanceof Float) {
      visitFloat(((Float) value).floatValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm-util/src/main/java/org/objectweb/asm/util/Textifier.java`
#### Snippet
```java
      visitInt(((Integer) value).intValue());
    } else if (value instanceof Float) {
      visitFloat(((Float) value).floatValue());
    } else if (value instanceof Long) {
      visitLong(((Long) value).longValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm-util/src/main/java/org/objectweb/asm/util/Textifier.java`
#### Snippet
```java
      visitFloat(((Float) value).floatValue());
    } else if (value instanceof Long) {
      visitLong(((Long) value).longValue());
    } else if (value instanceof Double) {
      visitDouble(((Double) value).doubleValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm-util/src/main/java/org/objectweb/asm/util/Textifier.java`
#### Snippet
```java
      visitLong(((Long) value).longValue());
    } else if (value instanceof Double) {
      visitDouble(((Double) value).doubleValue());
    } else if (value.getClass().isArray()) {
      stringBuilder.append('{');
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm-util/src/main/java/org/objectweb/asm/util/Textifier.java`
#### Snippet
```java
        }
      } else if (frameTypes[i] instanceof Integer) {
        stringBuilder.append(FRAME_TYPES.get(((Integer) frameTypes[i]).intValue()));
      } else {
        appendLabel((Label) frameTypes[i]);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm/src/main/java/org/objectweb/asm/Frame.java`
#### Snippet
```java
  static int getAbstractTypeFromApiFormat(final SymbolTable symbolTable, final Object type) {
    if (type instanceof Integer) {
      return CONSTANT_KIND | ((Integer) type).intValue();
    } else if (type instanceof String) {
      String descriptor = Type.getObjectType((String) type).getDescriptor();
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm/src/main/java/org/objectweb/asm/AnnotationWriter.java`
#### Snippet
```java
      annotation.put12('s', symbolTable.addConstantUtf8((String) value));
    } else if (value instanceof Byte) {
      annotation.put12('B', symbolTable.addConstantInteger(((Byte) value).byteValue()).index);
    } else if (value instanceof Boolean) {
      int booleanValue = ((Boolean) value).booleanValue() ? 1 : 0;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm/src/main/java/org/objectweb/asm/AnnotationWriter.java`
#### Snippet
```java
      annotation.put12('B', symbolTable.addConstantInteger(((Byte) value).byteValue()).index);
    } else if (value instanceof Boolean) {
      int booleanValue = ((Boolean) value).booleanValue() ? 1 : 0;
      annotation.put12('Z', symbolTable.addConstantInteger(booleanValue).index);
    } else if (value instanceof Character) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm/src/main/java/org/objectweb/asm/AnnotationWriter.java`
#### Snippet
```java
      annotation.put12('Z', symbolTable.addConstantInteger(booleanValue).index);
    } else if (value instanceof Character) {
      annotation.put12('C', symbolTable.addConstantInteger(((Character) value).charValue()).index);
    } else if (value instanceof Short) {
      annotation.put12('S', symbolTable.addConstantInteger(((Short) value).shortValue()).index);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm/src/main/java/org/objectweb/asm/AnnotationWriter.java`
#### Snippet
```java
      annotation.put12('C', symbolTable.addConstantInteger(((Character) value).charValue()).index);
    } else if (value instanceof Short) {
      annotation.put12('S', symbolTable.addConstantInteger(((Short) value).shortValue()).index);
    } else if (value instanceof Type) {
      annotation.put12('c', symbolTable.addConstantUtf8(((Type) value).getDescriptor()));
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm-commons/src/main/java/org/objectweb/asm/commons/InstructionAdapter.java`
#### Snippet
```java
      iconst(((Byte) value).intValue());
    } else if (value instanceof Character) {
      iconst(((Character) value).charValue());
    } else if (value instanceof Short) {
      iconst(((Short) value).intValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm-commons/src/main/java/org/objectweb/asm/commons/InstructionAdapter.java`
#### Snippet
```java
      iconst(((Short) value).intValue());
    } else if (value instanceof Boolean) {
      iconst(((Boolean) value).booleanValue() ? 1 : 0);
    } else if (value instanceof Float) {
      fconst((Float) value);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm-tree/src/main/java/org/objectweb/asm/tree/LookupSwitchInsnNode.java`
#### Snippet
```java
    int[] keysArray = new int[this.keys.size()];
    for (int i = 0, n = keysArray.length; i < n; ++i) {
      keysArray[i] = this.keys.get(i).intValue();
    }
    Label[] labelsArray = new Label[this.labels.size()];
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm-util/src/main/java/org/objectweb/asm/util/ASMifier.java`
#### Snippet
```java
        appendConstant(frameTypes[i]);
      } else if (frameTypes[i] instanceof Integer) {
        stringBuilder.append(FRAME_TYPES.get(((Integer) frameTypes[i]).intValue()));
      } else {
        appendLabel((Label) frameTypes[i]);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm-util/src/main/java/org/objectweb/asm/util/ASMifier.java`
#### Snippet
```java
      stringBuilder.append("new Byte((byte)").append(value).append(')');
    } else if (value instanceof Boolean) {
      stringBuilder.append(((Boolean) value).booleanValue() ? "Boolean.TRUE" : "Boolean.FALSE");
    } else if (value instanceof Short) {
      stringBuilder.append("new Short((short)").append(value).append(')');
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm-util/src/main/java/org/objectweb/asm/util/ASMifier.java`
#### Snippet
```java
      stringBuilder
          .append("new Character((char)")
          .append((int) ((Character) value).charValue())
          .append(')');
    } else if (value instanceof Integer) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm/src/main/java/org/objectweb/asm/SymbolTable.java`
#### Snippet
```java
  Symbol addConstant(final Object value) {
    if (value instanceof Integer) {
      return addConstantInteger(((Integer) value).intValue());
    } else if (value instanceof Byte) {
      return addConstantInteger(((Byte) value).intValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm/src/main/java/org/objectweb/asm/SymbolTable.java`
#### Snippet
```java
      return addConstantInteger(((Byte) value).intValue());
    } else if (value instanceof Character) {
      return addConstantInteger(((Character) value).charValue());
    } else if (value instanceof Short) {
      return addConstantInteger(((Short) value).intValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm/src/main/java/org/objectweb/asm/SymbolTable.java`
#### Snippet
```java
      return addConstantInteger(((Short) value).intValue());
    } else if (value instanceof Boolean) {
      return addConstantInteger(((Boolean) value).booleanValue() ? 1 : 0);
    } else if (value instanceof Float) {
      return addConstantFloat(((Float) value).floatValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm/src/main/java/org/objectweb/asm/SymbolTable.java`
#### Snippet
```java
      return addConstantInteger(((Boolean) value).booleanValue() ? 1 : 0);
    } else if (value instanceof Float) {
      return addConstantFloat(((Float) value).floatValue());
    } else if (value instanceof Long) {
      return addConstantLong(((Long) value).longValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm/src/main/java/org/objectweb/asm/SymbolTable.java`
#### Snippet
```java
      return addConstantFloat(((Float) value).floatValue());
    } else if (value instanceof Long) {
      return addConstantLong(((Long) value).longValue());
    } else if (value instanceof Double) {
      return addConstantDouble(((Double) value).doubleValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm/src/main/java/org/objectweb/asm/SymbolTable.java`
#### Snippet
```java
      return addConstantLong(((Long) value).longValue());
    } else if (value instanceof Double) {
      return addConstantDouble(((Double) value).doubleValue());
    } else if (value instanceof String) {
      return addConstantString((String) value);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
  private void putFrameType(final Object type) {
    if (type instanceof Integer) {
      stackMapTableEntries.putByte(((Integer) type).intValue());
    } else if (type instanceof String) {
      stackMapTableEntries
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm-util/src/main/java/org/objectweb/asm/util/CheckMethodAdapter.java`
#### Snippet
```java
      checkLabel(end[i], /* checkVisited = */ true, END_LABEL);
      checkUnsignedShort(index[i], INVALID_LOCAL_VARIABLE_INDEX);
      int startInsnIndex = labelInsnIndices.get(start[i]).intValue();
      int endInsnIndex = labelInsnIndices.get(end[i]).intValue();
      if (endInsnIndex < startInsnIndex) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm-util/src/main/java/org/objectweb/asm/util/CheckMethodAdapter.java`
#### Snippet
```java
      checkUnsignedShort(index[i], INVALID_LOCAL_VARIABLE_INDEX);
      int startInsnIndex = labelInsnIndices.get(start[i]).intValue();
      int endInsnIndex = labelInsnIndices.get(end[i]).intValue();
      if (endInsnIndex < startInsnIndex) {
        throw new IllegalArgumentException(
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm-util/src/main/java/org/objectweb/asm/util/CheckMethodAdapter.java`
#### Snippet
```java
    checkLabel(end, /* checkVisited = */ true, END_LABEL);
    checkUnsignedShort(index, INVALID_LOCAL_VARIABLE_INDEX);
    int startInsnIndex = labelInsnIndices.get(start).intValue();
    int endInsnIndex = labelInsnIndices.get(end).intValue();
    if (endInsnIndex < startInsnIndex) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm-util/src/main/java/org/objectweb/asm/util/CheckMethodAdapter.java`
#### Snippet
```java
    checkUnsignedShort(index, INVALID_LOCAL_VARIABLE_INDEX);
    int startInsnIndex = labelInsnIndices.get(start).intValue();
    int endInsnIndex = labelInsnIndices.get(end).intValue();
    if (endInsnIndex < startInsnIndex) {
      throw new IllegalArgumentException(
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm-util/src/main/java/org/objectweb/asm/util/CheckMethodAdapter.java`
#### Snippet
```java
      Integer startInsnIndex = labelInsnIndices.get(handlers.get(i));
      Integer endInsnIndex = labelInsnIndices.get(handlers.get(i + 1));
      if (endInsnIndex.intValue() <= startInsnIndex.intValue()) {
        throw new IllegalStateException("Empty try catch block handler range");
      }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `asm-util/src/main/java/org/objectweb/asm/util/CheckMethodAdapter.java`
#### Snippet
```java
      Integer startInsnIndex = labelInsnIndices.get(handlers.get(i));
      Integer endInsnIndex = labelInsnIndices.get(handlers.get(i + 1));
      if (endInsnIndex.intValue() <= startInsnIndex.intValue()) {
        throw new IllegalStateException("Empty try catch block handler range");
      }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `asm-util/src/main/java/org/objectweb/asm/util/CheckClassAdapter.java`
#### Snippet
```java
   */
  public static void main(final String[] args) throws IOException {
    main(args, new PrintWriter(System.err, true));
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `asm-util/src/main/java/org/objectweb/asm/util/Textifier.java`
#### Snippet
```java
   */
  public static void main(final String[] args) throws IOException {
    main(args, new PrintWriter(System.out, true), new PrintWriter(System.err, true));
  }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `asm-util/src/main/java/org/objectweb/asm/util/Textifier.java`
#### Snippet
```java
   */
  public static void main(final String[] args) throws IOException {
    main(args, new PrintWriter(System.out, true), new PrintWriter(System.err, true));
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `asm-util/src/main/java/org/objectweb/asm/util/ASMifier.java`
#### Snippet
```java
   */
  public static void main(final String[] args) throws IOException {
    main(args, new PrintWriter(System.out, true), new PrintWriter(System.err, true));
  }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `asm-util/src/main/java/org/objectweb/asm/util/ASMifier.java`
#### Snippet
```java
   */
  public static void main(final String[] args) throws IOException {
    main(args, new PrintWriter(System.out, true), new PrintWriter(System.err, true));
  }

```

## RuleId[id=RedundantMethodOverride]
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

## RuleId[id=DefaultAnnotationParam]
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

## RuleId[id=IfStatementWithIdenticalBranches]
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

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `asm-util/src/main/java/org/objectweb/asm/util/ASMifier.java`
#### Snippet
```java
      } else {
        text.add("package asm." + name.substring(0, lastSlashIndex).replace('/', '.') + ";\n");
        simpleName = name.substring(lastSlashIndex + 1).replaceAll("[-\\(\\)]", "_");
      }
    }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.objectweb.asm` is unnecessary and can be removed
in `asm-tree/src/main/java/org/objectweb/asm/tree/FieldNode.java`
#### Snippet
```java
   * they must use the {@link #FieldNode(int, int, String, String, String, Object)} version.
   *
   * @param access the field's access flags (see {@link org.objectweb.asm.Opcodes}). This parameter
   *     also indicates if the field is synthetic and/or deprecated.
   * @param name the field's name.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.objectweb.asm` is unnecessary and can be removed
in `asm-tree/src/main/java/org/objectweb/asm/tree/FieldNode.java`
#### Snippet
```java

  /**
   * The field's access flags (see {@link org.objectweb.asm.Opcodes}). This field also indicates if
   * the field is synthetic and/or deprecated.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.objectweb.asm` is unnecessary and can be removed
in `asm-tree/src/main/java/org/objectweb/asm/tree/FieldNode.java`
#### Snippet
```java
   * @param api the ASM API version implemented by this visitor. Must be one of the {@code
   *     ASM}<i>x</i> values in {@link Opcodes}.
   * @param access the field's access flags (see {@link org.objectweb.asm.Opcodes}). This parameter
   *     also indicates if the field is synthetic and/or deprecated.
   * @param name the field's name.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.objectweb.asm` is unnecessary and can be removed
in `asm/src/main/java/org/objectweb/asm/ClassTooLargeException.java`
#### Snippet
```java

  /**
   * Returns the internal name of the class (see {@link org.objectweb.asm.Type#getInternalName()}).
   *
   * @return the internal name of the class.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.objectweb.asm` is unnecessary and can be removed
in `asm/src/main/java/org/objectweb/asm/ClassTooLargeException.java`
#### Snippet
```java
   *
   * @param className the internal name of the class (see {@link
   *     org.objectweb.asm.Type#getInternalName()}).
   * @param constantPoolCount the number of constant pool items of the class.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.objectweb.asm` is unnecessary and can be removed
in `asm-commons/src/main/java/org/objectweb/asm/commons/RecordComponentRemapper.java`
#### Snippet
```java
   *
   * @param api the ASM API version supported by this remapper. Must be one of {@link
   *     org.objectweb.asm.Opcodes#ASM8} or {@link org.objectweb.asm.Opcodes#ASM9}.
   * @param recordComponentVisitor the record component visitor this remapper must delegate to.
   * @param remapper the remapper to use to remap the types in the visited record component.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.objectweb.asm` is unnecessary and can be removed
in `asm-commons/src/main/java/org/objectweb/asm/commons/RecordComponentRemapper.java`
#### Snippet
```java
   *
   * @param api the ASM API version supported by this remapper. Must be one of {@link
   *     org.objectweb.asm.Opcodes#ASM8} or {@link org.objectweb.asm.Opcodes#ASM9}.
   * @param recordComponentVisitor the record component visitor this remapper must delegate to.
   * @param remapper the remapper to use to remap the types in the visited record component.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.objectweb.asm` is unnecessary and can be removed
in `asm-tree/src/main/java/org/objectweb/asm/tree/ClassNode.java`
#### Snippet
```java

  /**
   * The class's access flags (see {@link org.objectweb.asm.Opcodes}). This field also indicates if
   * the class is deprecated {@link Opcodes#ACC_DEPRECATED} or a record {@link Opcodes#ACC_RECORD}.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.objectweb.asm` is unnecessary and can be removed
in `asm-commons/src/main/java/org/objectweb/asm/commons/JSRInlinerAdapter.java`
#### Snippet
```java

/**
 * A {@link org.objectweb.asm.MethodVisitor} that removes JSR instructions and inlines the
 * referenced subroutines.
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary, and can be replaced with an import
in `asm-commons/src/main/java/org/objectweb/asm/commons/Method.java`
#### Snippet
```java
   * @return a {@link Method} corresponding to the given Java constructor declaration.
   */
  public static Method getMethod(final java.lang.reflect.Constructor<?> constructor) {
    return new Method("<init>", Type.getConstructorDescriptor(constructor));
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.objectweb.asm` is unnecessary and can be removed
in `asm-util/src/main/java/org/objectweb/asm/util/Printer.java`
#### Snippet
```java
  };

  /** The names of the {@code tag} field values for {@link org.objectweb.asm.Handle}. */
  public static final String[] HANDLE_TAG = {
    "",
```

### UnnecessaryFullyQualifiedName
Qualifier `org.objectweb.asm.tree.analysis` is unnecessary and can be removed
in `asm-util/src/main/java/org/objectweb/asm/util/CheckMethodAdapter.java`
#### Snippet
```java
 * correct for a given visit method. This adapter can also perform some basic data flow checks (more
 * precisely those that can be performed without the full class hierarchy - see {@link
 * org.objectweb.asm.tree.analysis.BasicVerifier}). For instance in a method whose signature is
 * {@code void m ()}, the invalid instruction IRETURN, or the invalid sequence IADD L2I will be
 * detected if the data flow checks are enabled. These checks are enabled by using the {@link
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

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/RecordComponentWriter.java`
#### Snippet
```java
      final int typeRef, final TypePath typePath, final String descriptor, final boolean visible) {
    if (visible) {
      return lastRuntimeVisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable, typeRef, typePath, descriptor, lastRuntimeVisibleTypeAnnotation);
    } else {
      return lastRuntimeInvisibleTypeAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/RecordComponentWriter.java`
#### Snippet
```java
              symbolTable, typeRef, typePath, descriptor, lastRuntimeVisibleTypeAnnotation);
    } else {
      return lastRuntimeInvisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable, typeRef, typePath, descriptor, lastRuntimeInvisibleTypeAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/RecordComponentWriter.java`
#### Snippet
```java
  public AnnotationVisitor visitAnnotation(final String descriptor, final boolean visible) {
    if (visible) {
      return lastRuntimeVisibleAnnotation =
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeVisibleAnnotation);
    } else {
      return lastRuntimeInvisibleAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/RecordComponentWriter.java`
#### Snippet
```java
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeVisibleAnnotation);
    } else {
      return lastRuntimeInvisibleAnnotation =
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeInvisibleAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `asm-test/src/main/java/org/objectweb/asm/test/AsmTest.java`
#### Snippet
```java
      byte[] data = new byte[INPUT_STREAM_DATA_CHUNK_SIZE];
      int bytesRead;
      while ((bytesRead = inputStream.read(data, 0, data.length)) != -1) {
        outputStream.write(data, 0, bytesRead);
      }
```

### NestedAssignment
Result of assignment expression used
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AbstractBenchmark.java`
#### Snippet
```java
      byte[] data = new byte[8192];
      int bytesRead;
      while ((bytesRead = inputStream.read(data, 0, data.length)) != -1) {
        outputStream.write(data, 0, bytesRead);
      }
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/signature/SignatureReader.java`
#### Snippet
```java
            visited = true;
            // Now, parse the TypeArgument(s), one at a time.
            while ((currentChar = signature.charAt(offset)) != '>') {
              switch (currentChar) {
                case '*':
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/signature/SignatureReader.java`
#### Snippet
```java
        // While the character after the class bound or after the last parsed interface bound
        // is ':', we need to parse another interface bound.
        while ((currentChar = signature.charAt(offset++)) == ':') {
          offset = parseType(signature, offset, signatureVistor.visitInterfaceBound());
        }
```

### NestedAssignment
Result of assignment expression used
in `asm-util/src/main/java/org/objectweb/asm/util/CheckClassAdapter.java`
#### Snippet
```java
      int startIndex = 0;
      int dotIndex;
      while ((dotIndex = name.indexOf('.', startIndex + 1)) != -1) {
        CheckMethodAdapter.checkIdentifier(version, name, startIndex, dotIndex, null);
        startIndex = dotIndex + 1;
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/Frame.java`
#### Snippet
```java
        // If this local has never been assigned in this basic block, so it is still equal to its
        // value in the input frame.
        abstractType = outputLocals[localIndex] = LOCAL_KIND | localIndex;
      }
      return abstractType;
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/FieldWriter.java`
#### Snippet
```java
      final int typeRef, final TypePath typePath, final String descriptor, final boolean visible) {
    if (visible) {
      return lastRuntimeVisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable, typeRef, typePath, descriptor, lastRuntimeVisibleTypeAnnotation);
    } else {
      return lastRuntimeInvisibleTypeAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/FieldWriter.java`
#### Snippet
```java
              symbolTable, typeRef, typePath, descriptor, lastRuntimeVisibleTypeAnnotation);
    } else {
      return lastRuntimeInvisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable, typeRef, typePath, descriptor, lastRuntimeInvisibleTypeAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/FieldWriter.java`
#### Snippet
```java
  public AnnotationVisitor visitAnnotation(final String descriptor, final boolean visible) {
    if (visible) {
      return lastRuntimeVisibleAnnotation =
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeVisibleAnnotation);
    } else {
      return lastRuntimeInvisibleAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/FieldWriter.java`
#### Snippet
```java
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeVisibleAnnotation);
    } else {
      return lastRuntimeInvisibleAnnotation =
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeInvisibleAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/SymbolTable.java`
#### Snippet
```java
    ByteVector bootstrapMethodsAttribute = bootstrapMethods;
    if (bootstrapMethodsAttribute == null) {
      bootstrapMethodsAttribute = bootstrapMethods = new ByteVector();
    }

```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/SymbolTable.java`
#### Snippet
```java
    int index = entry.hashCode % entries.length;
    entry.next = entries[index];
    return entries[index] = entry;
  }

```

### NestedAssignment
Result of assignment expression used
in `asm-commons/src/main/java/org/objectweb/asm/commons/Method.java`
#### Snippet
```java
    StringBuilder stringBuilder = new StringBuilder();
    int arrayBracketsIndex = 0;
    while ((arrayBracketsIndex = type.indexOf("[]", arrayBracketsIndex) + 1) > 0) {
      stringBuilder.append('[');
    }
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
      final int typeRef, final TypePath typePath, final String descriptor, final boolean visible) {
    if (visible) {
      return lastCodeRuntimeVisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable, typeRef, typePath, descriptor, lastCodeRuntimeVisibleTypeAnnotation);
    } else {
      return lastCodeRuntimeInvisibleTypeAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
              symbolTable, typeRef, typePath, descriptor, lastCodeRuntimeVisibleTypeAnnotation);
    } else {
      return lastCodeRuntimeInvisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable, typeRef, typePath, descriptor, lastCodeRuntimeInvisibleTypeAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
      final int typeRef, final TypePath typePath, final String descriptor, final boolean visible) {
    if (visible) {
      return lastRuntimeVisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable, typeRef, typePath, descriptor, lastRuntimeVisibleTypeAnnotation);
    } else {
      return lastRuntimeInvisibleTypeAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
              symbolTable, typeRef, typePath, descriptor, lastRuntimeVisibleTypeAnnotation);
    } else {
      return lastRuntimeInvisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable, typeRef, typePath, descriptor, lastRuntimeInvisibleTypeAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
    typeAnnotation.putShort(symbolTable.addConstantUtf8(descriptor)).putShort(0);
    if (visible) {
      return lastCodeRuntimeVisibleTypeAnnotation =
          new AnnotationWriter(
              symbolTable,
              /* useNamedValues = */ true,
              typeAnnotation,
              lastCodeRuntimeVisibleTypeAnnotation);
    } else {
      return lastCodeRuntimeInvisibleTypeAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
              lastCodeRuntimeVisibleTypeAnnotation);
    } else {
      return lastCodeRuntimeInvisibleTypeAnnotation =
          new AnnotationWriter(
              symbolTable,
              /* useNamedValues = */ true,
              typeAnnotation,
              lastCodeRuntimeInvisibleTypeAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
            || constantSymbol.tag == Symbol.CONSTANT_DOUBLE_TAG
            || (constantSymbol.tag == Symbol.CONSTANT_DYNAMIC_TAG
                && ((firstDescriptorChar = constantSymbol.value.charAt(0)) == 'J'
                    || firstDescriptorChar == 'D'));
    if (isLongOrDouble) {
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
  public AnnotationVisitor visitAnnotation(final String descriptor, final boolean visible) {
    if (visible) {
      return lastRuntimeVisibleAnnotation =
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeVisibleAnnotation);
    } else {
      return lastRuntimeInvisibleAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeVisibleAnnotation);
    } else {
      return lastRuntimeInvisibleAnnotation =
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeInvisibleAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
      final int typeRef, final TypePath typePath, final String descriptor, final boolean visible) {
    if (visible) {
      return lastCodeRuntimeVisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable,
              (typeRef & 0xFF0000FF) | (lastBytecodeOffset << 8),
              typePath,
              descriptor,
              lastCodeRuntimeVisibleTypeAnnotation);
    } else {
      return lastCodeRuntimeInvisibleTypeAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
              lastCodeRuntimeVisibleTypeAnnotation);
    } else {
      return lastCodeRuntimeInvisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable,
              (typeRef & 0xFF0000FF) | (lastBytecodeOffset << 8),
              typePath,
              descriptor,
              lastCodeRuntimeInvisibleTypeAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
            new AnnotationWriter[Type.getArgumentTypes(descriptor).length];
      }
      return lastRuntimeVisibleParameterAnnotations[parameter] =
          AnnotationWriter.create(
              symbolTable, annotationDescriptor, lastRuntimeVisibleParameterAnnotations[parameter]);
    } else {
      if (lastRuntimeInvisibleParameterAnnotations == null) {
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/MethodWriter.java`
#### Snippet
```java
            new AnnotationWriter[Type.getArgumentTypes(descriptor).length];
      }
      return lastRuntimeInvisibleParameterAnnotations[parameter] =
          AnnotationWriter.create(
              symbolTable,
              annotationDescriptor,
              lastRuntimeInvisibleParameterAnnotations[parameter]);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/ClassWriter.java`
#### Snippet
```java
      lastMethod.mv = methodWriter;
    }
    return lastMethod = methodWriter;
  }

```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/ClassWriter.java`
#### Snippet
```java
  public final AnnotationVisitor visitAnnotation(final String descriptor, final boolean visible) {
    if (visible) {
      return lastRuntimeVisibleAnnotation =
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeVisibleAnnotation);
    } else {
      return lastRuntimeInvisibleAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/ClassWriter.java`
#### Snippet
```java
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeVisibleAnnotation);
    } else {
      return lastRuntimeInvisibleAnnotation =
          AnnotationWriter.create(symbolTable, descriptor, lastRuntimeInvisibleAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/ClassWriter.java`
#### Snippet
```java
  public final ModuleVisitor visitModule(
      final String name, final int access, final String version) {
    return moduleWriter =
        new ModuleWriter(
            symbolTable,
            symbolTable.addConstantModule(name).index,
            access,
            version == null ? 0 : symbolTable.addConstantUtf8(version));
  }

```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/ClassWriter.java`
#### Snippet
```java
      final int typeRef, final TypePath typePath, final String descriptor, final boolean visible) {
    if (visible) {
      return lastRuntimeVisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable, typeRef, typePath, descriptor, lastRuntimeVisibleTypeAnnotation);
    } else {
      return lastRuntimeInvisibleTypeAnnotation =
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/ClassWriter.java`
#### Snippet
```java
              symbolTable, typeRef, typePath, descriptor, lastRuntimeVisibleTypeAnnotation);
    } else {
      return lastRuntimeInvisibleTypeAnnotation =
          AnnotationWriter.create(
              symbolTable, typeRef, typePath, descriptor, lastRuntimeInvisibleTypeAnnotation);
    }
  }
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/ClassWriter.java`
#### Snippet
```java
      lastField.fv = fieldWriter;
    }
    return lastField = fieldWriter;
  }

```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/ClassWriter.java`
#### Snippet
```java
      lastRecordComponent.delegate = recordComponentWriter;
    }
    return lastRecordComponent = recordComponentWriter;
  }

```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/ClassReader.java`
#### Snippet
```java
      bootstrapMethodOffset += 2;
    }
    return constantDynamicValues[constantPoolEntryIndex] =
        new ConstantDynamic(name, descriptor, handle, bootstrapMethodArguments);
  }

```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/ClassReader.java`
#### Snippet
```java
    }
    int cpInfoOffset = cpInfoOffsets[constantPoolEntryIndex];
    return constantUtf8Values[constantPoolEntryIndex] =
        readUtf(cpInfoOffset + 2, readUnsignedShort(cpInfoOffset), charBuffer);
  }

```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/ClassReader.java`
#### Snippet
```java
    final int bytecodeStartOffset = currentOffset;
    final int bytecodeEndOffset = currentOffset + codeLength;
    final Label[] labels = context.currentMethodLabels = new Label[codeLength + 1];
    while (currentOffset < bytecodeEndOffset) {
      final int bytecodeOffset = currentOffset - bytecodeStartOffset;
```

### NestedAssignment
Result of assignment expression used
in `asm/src/main/java/org/objectweb/asm/ClassReader.java`
#### Snippet
```java
      int bytesRead;
      int readCount = 0;
      while ((bytesRead = inputStream.read(data, 0, bufferSize)) != -1) {
        outputStream.write(data, 0, bytesRead);
        readCount++;
```

### NestedAssignment
Result of assignment expression used
in `asm-util/src/main/java/org/objectweb/asm/util/CheckMethodAdapter.java`
#### Snippet
```java
      int startIndex = 0;
      int slashIndex;
      while ((slashIndex = name.indexOf('/', startIndex + 1)) != -1) {
        checkIdentifier(version, name, startIndex, slashIndex, null);
        startIndex = slashIndex + 1;
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `asm-util/src/main/java/org/objectweb/asm/util/Textifier.java`
#### Snippet
```java
    }
    String name = labelNames.get(label);
    if (name == null) {
      name = "L" + labelNames.size();
      labelNames.put(label, name);
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `asm/src/main/java/org/objectweb/asm/ClassReader.java`
#### Snippet
```java
   * @param bytecodeOffset the bytecode offset of the next instruction to be visited.
   */
  protected void readBytecodeInstructionOffset(final int bytecodeOffset) {
    // Do nothing by default.
  }
```

### EmptyMethod
The method is empty
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Analyzer.java`
#### Snippet
```java
   * @param successorIndex index of a successor instruction.
   */
  protected void newControlFlowEdge(final int insnIndex, final int successorIndex) {
    // Nothing to do.
  }
```

### EmptyMethod
The method is empty
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Frame.java`
#### Snippet
```java
   *     in the instructions sequence).
   */
  public void initJumpTarget(final int opcode, final LabelNode target) {
    // Does nothing by default.
  }
```

### EmptyMethod
The method is empty
in `asm-commons/src/main/java/org/objectweb/asm/commons/LocalVariablesSorter.java`
#### Snippet
```java
   *     types for the current stack map frame must be updated in place in this array.
   */
  protected void updateNewLocals(final Object[] newLocals) {
    // The default implementation does nothing.
  }
```

### EmptyMethod
The method is empty
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
   *     4.7.8</a>
   */
  private static void dumpSyntheticAttribute() {
    // Nothing to parse.
  }
```

### EmptyMethod
The method is empty
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
   *     4.7.15</a>
   */
  private static void dumpDeprecatedAttribute() {
    // Nothing to parse.
  }
```

### EmptyMethod
The method is empty
in `asm-tree/src/main/java/org/objectweb/asm/tree/AnnotationNode.java`
#### Snippet
```java
   *     Opcodes}.
   */
  public void check(final int api) {
    // nothing to do
  }
```

### EmptyMethod
All implementations of this method are empty
in `asm-util/src/main/java/org/objectweb/asm/util/TextifierSupport.java`
#### Snippet
```java
   * @param labelNames the human readable names of the labels.
   */
  void textify(StringBuilder outputBuilder, Map<Label, String> labelNames);
}

```

## RuleId[id=PointlessBitwiseExpression]
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
  int V1_8 = 0 << 16 | 52;
  int V9 = 0 << 16 | 53;
  int V10 = 0 << 16 | 54;
  int V11 = 0 << 16 | 55;
  int V12 = 0 << 16 | 56;
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
  int V15 = 0 << 16 | 59;
  int V16 = 0 << 16 | 60;
  int V17 = 0 << 16 | 61;
  int V18 = 0 << 16 | 62;
  int V19 = 0 << 16 | 63;
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
  int V11 = 0 << 16 | 55;
  int V12 = 0 << 16 | 56;
  int V13 = 0 << 16 | 57;
  int V14 = 0 << 16 | 58;
  int V15 = 0 << 16 | 59;
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
  int V1_4 = 0 << 16 | 48;
  int V1_5 = 0 << 16 | 49;
  int V1_6 = 0 << 16 | 50;
  int V1_7 = 0 << 16 | 51;
  int V1_8 = 0 << 16 | 52;
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

## RuleId[id=UnnecessaryContinue]
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
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AsmAdapter.java`
#### Snippet
```java
        }
      } catch (NoSuchFieldException e) {
        continue;
      } catch (IllegalAccessException e) {
        throw new AssertionError(e);
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `asm-util/src/main/java/org/objectweb/asm/util/TraceSignatureVisitor.java`
#### Snippet
```java
   */
  public String getReturnType() {
    return returnType == null ? null : returnType.toString();
  }

```

### ReturnNull
Return of `null`
in `asm-util/src/main/java/org/objectweb/asm/util/TraceSignatureVisitor.java`
#### Snippet
```java
   */
  public String getExceptions() {
    return exceptions == null ? null : exceptions.toString();
  }

```

### ReturnNull
Return of `null`
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/SimpleVerifier.java`
#### Snippet
```java
    }
    Class<?> superClass = getClass(type).getSuperclass();
    return superClass == null ? null : Type.getType(superClass);
  }

```

### ReturnNull
Return of `null`
in `asm-commons/src/main/java/org/objectweb/asm/commons/FieldRemapper.java`
#### Snippet
```java
        super.visitTypeAnnotation(typeRef, typePath, remapper.mapDesc(descriptor), visible);
    return annotationVisitor == null
        ? null
        : createAnnotationRemapper(descriptor, annotationVisitor);
  }
```

### ReturnNull
Return of `null`
in `asm-commons/src/main/java/org/objectweb/asm/commons/FieldRemapper.java`
#### Snippet
```java
        super.visitAnnotation(remapper.mapDesc(descriptor), visible);
    return annotationVisitor == null
        ? null
        : createAnnotationRemapper(descriptor, annotationVisitor);
  }
```

### ReturnNull
Return of `null`
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/BasicInterpreter.java`
#### Snippet
```java
      case IF_ACMPNE:
      case PUTFIELD:
        return null;
      default:
        throw new AssertionError();
```

### ReturnNull
Return of `null`
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/BasicInterpreter.java`
#### Snippet
```java
      final BasicValue value3)
      throws AnalyzerException {
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/BasicInterpreter.java`
#### Snippet
```java
    switch (type.getSort()) {
      case Type.VOID:
        return null;
      case Type.BOOLEAN:
      case Type.CHAR:
```

### ReturnNull
Return of `null`
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/BasicInterpreter.java`
#### Snippet
```java
      case ARETURN:
      case PUTSTATIC:
        return null;
      case GETFIELD:
        return newValue(Type.getType(((FieldInsnNode) insn).desc));
```

### ReturnNull
Return of `null`
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/BasicInterpreter.java`
#### Snippet
```java
        return BasicValue.INT_VALUE;
      case ATHROW:
        return null;
      case CHECKCAST:
        return newValue(Type.getObjectType(((TypeInsnNode) insn).desc));
```

### ReturnNull
Return of `null`
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/BasicInterpreter.java`
#### Snippet
```java
      case IFNULL:
      case IFNONNULL:
        return null;
      default:
        throw new AssertionError();
```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/RecordComponentVisitor.java`
#### Snippet
```java
      return delegate.visitAnnotation(descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/RecordComponentVisitor.java`
#### Snippet
```java
      return delegate.visitTypeAnnotation(typeRef, typePath, descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/BasicVerifier.java`
#### Snippet
```java
      throw new AnalyzerException(insn, "Third argument", expected3, value3);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm-commons/src/main/java/org/objectweb/asm/commons/ClassRemapper.java`
#### Snippet
```java
            remapper.mapSignature(signature, false),
            exceptions == null ? null : remapper.mapTypes(exceptions));
    return methodVisitor == null ? null : createMethodRemapper(methodVisitor);
  }

```

### ReturnNull
Return of `null`
in `asm-commons/src/main/java/org/objectweb/asm/commons/ClassRemapper.java`
#### Snippet
```java
        super.visitTypeAnnotation(typeRef, typePath, remapper.mapDesc(descriptor), visible);
    return annotationVisitor == null
        ? null
        : createAnnotationRemapper(descriptor, annotationVisitor);
  }
```

### ReturnNull
Return of `null`
in `asm-commons/src/main/java/org/objectweb/asm/commons/ClassRemapper.java`
#### Snippet
```java
        super.visitAnnotation(remapper.mapDesc(descriptor), visible);
    return annotationVisitor == null
        ? null
        : createAnnotationRemapper(descriptor, annotationVisitor);
  }
```

### ReturnNull
Return of `null`
in `asm-commons/src/main/java/org/objectweb/asm/commons/ClassRemapper.java`
#### Snippet
```java
            remapper.mapSignature(signature, true));
    return recordComponentVisitor == null
        ? null
        : createRecordComponentRemapper(recordComponentVisitor);
  }
```

### ReturnNull
Return of `null`
in `asm-commons/src/main/java/org/objectweb/asm/commons/ClassRemapper.java`
#### Snippet
```java
            remapper.mapSignature(signature, true),
            (value == null) ? null : remapper.mapValue(value));
    return fieldVisitor == null ? null : createFieldRemapper(fieldVisitor);
  }

```

### ReturnNull
Return of `null`
in `asm-commons/src/main/java/org/objectweb/asm/commons/ClassRemapper.java`
#### Snippet
```java
  public ModuleVisitor visitModule(final String name, final int flags, final String version) {
    ModuleVisitor moduleVisitor = super.visitModule(remapper.mapModuleName(name), flags, version);
    return moduleVisitor == null ? null : createModuleRemapper(moduleVisitor);
  }

```

### ReturnNull
Return of `null`
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        return value;
      }
      return parent == null ? null : parent.get(key);
    }
  }
```

### ReturnNull
Return of `null`
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
        throw new UnsupportedClassVersionError("Module info is not supported before JDK 9");
      } else {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
      return constructor.newInstance(arguments.toArray(new Object[0]));
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm-commons/src/main/java/org/objectweb/asm/commons/RecordComponentRemapper.java`
#### Snippet
```java
        super.visitAnnotation(remapper.mapDesc(descriptor), visible);
    return annotationVisitor == null
        ? null
        : createAnnotationRemapper(descriptor, annotationVisitor);
  }
```

### ReturnNull
Return of `null`
in `asm-commons/src/main/java/org/objectweb/asm/commons/RecordComponentRemapper.java`
#### Snippet
```java
        super.visitTypeAnnotation(typeRef, typePath, remapper.mapDesc(descriptor), visible);
    return annotationVisitor == null
        ? null
        : createAnnotationRemapper(descriptor, annotationVisitor);
  }
```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/AnnotationVisitor.java`
#### Snippet
```java
      return av.visitArray(name);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/AnnotationVisitor.java`
#### Snippet
```java
      return av.visitAnnotation(name, descriptor);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/ClassVisitor.java`
#### Snippet
```java
      return cv.visitField(access, name, descriptor, signature, value);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/ClassVisitor.java`
#### Snippet
```java
      return cv.visitTypeAnnotation(typeRef, typePath, descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/ClassVisitor.java`
#### Snippet
```java
      return cv.visitRecordComponent(name, descriptor, signature);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/ClassVisitor.java`
#### Snippet
```java
      return cv.visitModule(name, access, version);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/ClassVisitor.java`
#### Snippet
```java
      return cv.visitMethod(access, name, descriptor, signature, exceptions);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/ClassVisitor.java`
#### Snippet
```java
      return cv.visitAnnotation(descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm-util/src/main/java/org/objectweb/asm/util/CheckFrameAnalyzer.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/MethodVisitor.java`
#### Snippet
```java
      return mv.visitTryCatchAnnotation(typeRef, typePath, descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/MethodVisitor.java`
#### Snippet
```java
      return mv.visitTypeAnnotation(typeRef, typePath, descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/MethodVisitor.java`
#### Snippet
```java
      return mv.visitParameterAnnotation(parameter, descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/MethodVisitor.java`
#### Snippet
```java
      return mv.visitAnnotation(descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/MethodVisitor.java`
#### Snippet
```java
      return mv.visitAnnotationDefault();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/MethodVisitor.java`
#### Snippet
```java
          typeRef, typePath, start, end, index, descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/MethodVisitor.java`
#### Snippet
```java
      return mv.visitInsnAnnotation(typeRef, typePath, descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm-commons/src/main/java/org/objectweb/asm/commons/Remapper.java`
#### Snippet
```java
  public String mapSignature(final String signature, final boolean typeSignature) {
    if (signature == null) {
      return null;
    }
    SignatureReader signatureReader = new SignatureReader(signature);
```

### ReturnNull
Return of `null`
in `asm-commons/src/main/java/org/objectweb/asm/commons/Remapper.java`
#### Snippet
```java
  public String mapType(final String internalName) {
    if (internalName == null) {
      return null;
    }
    return mapType(Type.getObjectType(internalName)).getInternalName();
```

### ReturnNull
Return of `null`
in `asm-commons/src/main/java/org/objectweb/asm/commons/JSRInlinerAdapter.java`
#### Snippet
```java
    Instantiation findOwner(final int insnIndex) {
      if (!subroutineInsns.get(insnIndex)) {
        return null;
      }
      if (!sharedSubroutineInsns.get(insnIndex)) {
```

### ReturnNull
Return of `null`
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/AsmAdapter.java`
#### Snippet
```java
    public ModuleVisitor visitModule(final String name, final int access, final String version) {
      ++count;
      return null;
    }

```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/TypePath.java`
#### Snippet
```java
  public static TypePath fromString(final String typePath) {
    if (typePath == null || typePath.length() == 0) {
      return null;
    }
    int typePathLength = typePath.length();
```

### ReturnNull
Return of `null`
in `asm-commons/src/main/java/org/objectweb/asm/commons/AnnotationRemapper.java`
#### Snippet
```java
    AnnotationVisitor annotationVisitor = super.visitArray(mapAnnotationAttributeName(name));
    if (annotationVisitor == null) {
      return null;
    } else {
      return annotationVisitor == av
```

### ReturnNull
Return of `null`
in `asm-commons/src/main/java/org/objectweb/asm/commons/AnnotationRemapper.java`
#### Snippet
```java
        super.visitAnnotation(mapAnnotationAttributeName(name), remapper.mapDesc(descriptor));
    if (annotationVisitor == null) {
      return null;
    } else {
      return annotationVisitor == av
```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/FieldVisitor.java`
#### Snippet
```java
      return fv.visitAnnotation(descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/FieldVisitor.java`
#### Snippet
```java
      return fv.visitTypeAnnotation(typeRef, typePath, descriptor, visible);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/Handler.java`
#### Snippet
```java
  static Handler removeRange(final Handler firstHandler, final Label start, final Label end) {
    if (firstHandler == null) {
      return null;
    } else {
      firstHandler.nextHandler = removeRange(firstHandler.nextHandler, start, end);
```

### ReturnNull
Return of `null`
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/SourceInterpreter.java`
#### Snippet
```java
  public SourceValue newValue(final Type type) {
    if (type == Type.VOID_TYPE) {
      return null;
    }
    return new SourceValue(type == null ? 1 : type.getSize());
```

### ReturnNull
Return of `null`
in `asm/src/main/java/org/objectweb/asm/ClassReader.java`
#### Snippet
```java
    int constantPoolEntryIndex = readUnsignedShort(offset);
    if (offset == 0 || constantPoolEntryIndex == 0) {
      return null;
    }
    return readUtf(constantPoolEntryIndex, charBuffer);
```

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `asm-tree/src/main/java/org/objectweb/asm/tree/ModuleOpenNode.java`
#### Snippet
```java
  public void accept(final ModuleVisitor moduleVisitor) {
    moduleVisitor.visitOpen(
        packaze, access, modules == null ? null : modules.toArray(new String[0]));
  }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `benchmarks/src/jmh/java/org/objectweb/asm/benchmarks/JClassLibGenerator.java`
#### Snippet
```java
    try {
      ClassFile classFile = new ClassFile();
      classFile.setConstantPool(new CPInfo[0]);
      ConstantPoolUtil.addConstantUTF8Info(classFile, "", 0); // dummy constant
      classFile.setMajorVersion(45);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `asm/src/main/java/org/objectweb/asm/Attribute.java`
#### Snippet
```java
   */
  protected Label[] getLabels() {
    return new Label[0];
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `asm/src/main/java/org/objectweb/asm/Frame.java`
#### Snippet
```java
      final int maxLocals) {
    inputLocals = new int[maxLocals];
    inputStack = new int[0];
    int inputLocalIndex = 0;
    if ((access & Opcodes.ACC_STATIC) == 0) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `asm-test/src/main/java/org/objectweb/asm/test/ClassFile.java`
#### Snippet
```java
      }
      constructor.setAccessible(true); // NOPMD(AvoidAccessibilityAlteration): ok for tests.
      return constructor.newInstance(arguments.toArray(new Object[0]));
    }
    return null;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `asm-analysis/src/main/java/org/objectweb/asm/tree/analysis/Analyzer.java`
#### Snippet
```java
  public Frame<V>[] analyze(final String owner, final MethodNode method) throws AnalyzerException {
    if ((method.access & (ACC_ABSTRACT | ACC_NATIVE)) != 0) {
      frames = (Frame<V>[]) new Frame<?>[0];
      return frames;
    }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `asm-tree/src/main/java/org/objectweb/asm/tree/ModuleExportNode.java`
#### Snippet
```java
  public void accept(final ModuleVisitor moduleVisitor) {
    moduleVisitor.visitExport(
        packaze, access, modules == null ? null : modules.toArray(new String[0]));
  }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `asm-tree/src/main/java/org/objectweb/asm/tree/ModuleProvideNode.java`
#### Snippet
```java
   */
  public void accept(final ModuleVisitor moduleVisitor) {
    moduleVisitor.visitProvide(service, providers.toArray(new String[0]));
  }
}
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `asm-tree/src/main/java/org/objectweb/asm/tree/MethodNode.java`
#### Snippet
```java
   */
  public void accept(final ClassVisitor classVisitor) {
    String[] exceptionsArray = exceptions == null ? null : exceptions.toArray(new String[0]);
    MethodVisitor methodVisitor =
        classVisitor.visitMethod(access, name, desc, signature, exceptionsArray);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `asm-commons/src/main/java/org/objectweb/asm/commons/SerialVersionUIDAdder.java`
#### Snippet
```java
      final boolean dotted)
      throws IOException {
    Item[] items = itemCollection.toArray(new Item[0]);
    Arrays.sort(items);
    for (Item item : items) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `asm/src/main/java/org/objectweb/asm/ClassReader.java`
#### Snippet
```java
   */
  public void accept(final ClassVisitor classVisitor, final int parsingOptions) {
    accept(classVisitor, new Attribute[0], parsingOptions);
  }

```

## RuleId[id=UnusedAssignment]
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
        super.visitAnnotation(remapper.mapDesc(descriptor), visible);
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
        super.visitTryCatchAnnotation(typeRef, typePath, remapper.mapDesc(descriptor), visible);
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
        super.visitTypeAnnotation(typeRef, typePath, remapper.mapDesc(descriptor), visible);
    return annotationVisitor == null
        ? annotationVisitor
        : createAnnotationRemapper(descriptor, annotationVisitor);
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

