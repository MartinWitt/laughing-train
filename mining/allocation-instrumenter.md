# allocation-instrumenter 
 
# Bad smells
I found 133 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessarySuperQualifier | 100 | false |
| RedundantFieldInitialization | 5 | false |
| SystemOutErr | 4 | false |
| UnnecessaryFullyQualifiedName | 4 | false |
| ReturnNull | 4 | false |
| UnnecessaryModifier | 2 | true |
| AssignmentToMethodParameter | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| MismatchedArrayReadWrite | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| UnnecessarySemicolon | 1 | false |
| DataFlowIssue | 1 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 1 | false |
| RedundantArrayCreation | 1 | true |
| CatchMayIgnoreException | 1 | false |
| ConstantValue | 1 | false |
| AnonymousHasLambdaAlternative | 1 | false |
## RuleId[ruleID=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationInstrumenter.java`
#### Snippet
```java

    if (!inst.isRetransformClassesSupported()) {
      System.err.println("Some JDK classes are already loaded and will not be instrumented.");
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationInstrumenter.java`
#### Snippet
```java
      canRewriteBootstrap = false;
      // The loggers aren't installed yet, so we use println.
      System.err.println("Class loading breakage: Will not be able to instrument JDK classes");
      return;
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationInstrumenter.java`
#### Snippet
```java
      inst.retransformClasses(new Class<?>[] {Object.class});
    } catch (UnmodifiableClassException e) {
      System.err.println("AllocationInstrumenter was unable to retransform java.lang.Object.");
    }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationInstrumenter.java`
#### Snippet
```java
      inst.retransformClasses(classList.toArray(workaround));
    } catch (UnmodifiableClassException e) {
      System.err.println("AllocationInstrumenter was unable to retransform early loaded classes.");
    }
  }
```

## RuleId[ruleID=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `cs` are written to, but never read
in `src/main/java/com/google/monitoring/runtime/instrumentation/ConstructorInstrumenter.java`
#### Snippet
```java
        samplerMap.put(c, samplerList);
        Instrumentation inst = AllocationRecorder.getInstrumentation();
        Class<?>[] cs = new Class<?>[1];
        cs[0] = c;
        inst.retransformClasses(c);
```

## RuleId[ruleID=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/google/monitoring/runtime/instrumentation/Sampler.java`
#### Snippet
```java
   * @param size the size of the object being allocated.
   */
  public void sampleAllocation(int count, String desc, Object newObj, long size);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/com/google/monitoring/runtime/instrumentation/ConstructorCallback.java`
#### Snippet
```java
   *     subject to the memory model constraints related to such objects.
   */
  public void sample(T newObj);
}

```

## RuleId[ruleID=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common parts with variables can be extracted from 'if'
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationRecorder.java`
#### Snippet
```java
      Sampler[] samplers = additionalSamplers;
      /* create a new list of samplers from the old, adding this sampler */
      if (samplers != null) {
        Sampler[] newSamplers = new Sampler[samplers.length + 1];
        System.arraycopy(samplers, 0, newSamplers, 0, samplers.length);
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `AllocationRecorder` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationRecorder.java`
#### Snippet
```java
 * AllocationInstrumenter}.
 */
public class AllocationRecorder {
  static {
    // Sun's JVMs in 1.5.0_06 and 1.6.0{,_01} have a bug where calling
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/ConstructorInstrumenter.java`
#### Snippet
```java
      }
      if (opcode == Opcodes.RETURN) {
        super.visitVarInsn(Opcodes.ALOAD, 0);
        super.visitMethodInsn(
            Opcodes.INVOKESTATIC,
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/ConstructorInstrumenter.java`
#### Snippet
```java
      if (opcode == Opcodes.RETURN) {
        super.visitVarInsn(Opcodes.ALOAD, 0);
        super.visitMethodInsn(
            Opcodes.INVOKESTATIC,
            "com/google/monitoring/runtime/instrumentation/ConstructorInstrumenter",
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    Label endLabel = new Label();

    super.visitLabel(beginScopeLabel);

    // stack: ... intArray
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java

    // stack: ... intArray
    super.visitVarInsn(Opcodes.ASTORE, dimsArrayIndex);
    // -> stack: ...

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java

    // counter = 0
    super.visitInsn(Opcodes.ICONST_0);
    super.visitVarInsn(Opcodes.ISTORE, counterIndex);
    // product = 1
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    // counter = 0
    super.visitInsn(Opcodes.ICONST_0);
    super.visitVarInsn(Opcodes.ISTORE, counterIndex);
    // product = 1
    super.visitInsn(Opcodes.ICONST_1);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitVarInsn(Opcodes.ISTORE, counterIndex);
    // product = 1
    super.visitInsn(Opcodes.ICONST_1);
    super.visitVarInsn(Opcodes.ISTORE, productIndex);
    // loop:
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    // product = 1
    super.visitInsn(Opcodes.ICONST_1);
    super.visitVarInsn(Opcodes.ISTORE, productIndex);
    // loop:
    super.visitLabel(loopLabel);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitVarInsn(Opcodes.ISTORE, productIndex);
    // loop:
    super.visitLabel(loopLabel);
    // if index >= arraylength goto end:
    super.visitVarInsn(Opcodes.ILOAD, counterIndex);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitLabel(loopLabel);
    // if index >= arraylength goto end:
    super.visitVarInsn(Opcodes.ILOAD, counterIndex);
    super.visitVarInsn(Opcodes.ALOAD, dimsArrayIndex);
    super.visitInsn(Opcodes.ARRAYLENGTH);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    // if index >= arraylength goto end:
    super.visitVarInsn(Opcodes.ILOAD, counterIndex);
    super.visitVarInsn(Opcodes.ALOAD, dimsArrayIndex);
    super.visitInsn(Opcodes.ARRAYLENGTH);
    super.visitJumpInsn(Opcodes.IF_ICMPGE, endLabel);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitVarInsn(Opcodes.ILOAD, counterIndex);
    super.visitVarInsn(Opcodes.ALOAD, dimsArrayIndex);
    super.visitInsn(Opcodes.ARRAYLENGTH);
    super.visitJumpInsn(Opcodes.IF_ICMPGE, endLabel);
    // product = product * max(array[counter],1)
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitVarInsn(Opcodes.ALOAD, dimsArrayIndex);
    super.visitInsn(Opcodes.ARRAYLENGTH);
    super.visitJumpInsn(Opcodes.IF_ICMPGE, endLabel);
    // product = product * max(array[counter],1)
    super.visitVarInsn(Opcodes.ALOAD, dimsArrayIndex);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitJumpInsn(Opcodes.IF_ICMPGE, endLabel);
    // product = product * max(array[counter],1)
    super.visitVarInsn(Opcodes.ALOAD, dimsArrayIndex);
    super.visitVarInsn(Opcodes.ILOAD, counterIndex);
    super.visitInsn(Opcodes.IALOAD);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    // product = product * max(array[counter],1)
    super.visitVarInsn(Opcodes.ALOAD, dimsArrayIndex);
    super.visitVarInsn(Opcodes.ILOAD, counterIndex);
    super.visitInsn(Opcodes.IALOAD);
    super.visitInsn(Opcodes.DUP);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitVarInsn(Opcodes.ALOAD, dimsArrayIndex);
    super.visitVarInsn(Opcodes.ILOAD, counterIndex);
    super.visitInsn(Opcodes.IALOAD);
    super.visitInsn(Opcodes.DUP);
    Label nonZeroDimension = new Label();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitVarInsn(Opcodes.ILOAD, counterIndex);
    super.visitInsn(Opcodes.IALOAD);
    super.visitInsn(Opcodes.DUP);
    Label nonZeroDimension = new Label();
    super.visitJumpInsn(Opcodes.IFNE, nonZeroDimension);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitInsn(Opcodes.DUP);
    Label nonZeroDimension = new Label();
    super.visitJumpInsn(Opcodes.IFNE, nonZeroDimension);
    super.visitInsn(Opcodes.POP);
    super.visitInsn(Opcodes.ICONST_1);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    Label nonZeroDimension = new Label();
    super.visitJumpInsn(Opcodes.IFNE, nonZeroDimension);
    super.visitInsn(Opcodes.POP);
    super.visitInsn(Opcodes.ICONST_1);
    super.visitLabel(nonZeroDimension);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitJumpInsn(Opcodes.IFNE, nonZeroDimension);
    super.visitInsn(Opcodes.POP);
    super.visitInsn(Opcodes.ICONST_1);
    super.visitLabel(nonZeroDimension);
    super.visitVarInsn(Opcodes.ILOAD, productIndex);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitInsn(Opcodes.POP);
    super.visitInsn(Opcodes.ICONST_1);
    super.visitLabel(nonZeroDimension);
    super.visitVarInsn(Opcodes.ILOAD, productIndex);
    super.visitInsn(Opcodes.IMUL); // if overflow happens it happens.
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitInsn(Opcodes.ICONST_1);
    super.visitLabel(nonZeroDimension);
    super.visitVarInsn(Opcodes.ILOAD, productIndex);
    super.visitInsn(Opcodes.IMUL); // if overflow happens it happens.
    super.visitVarInsn(Opcodes.ISTORE, productIndex);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitLabel(nonZeroDimension);
    super.visitVarInsn(Opcodes.ILOAD, productIndex);
    super.visitInsn(Opcodes.IMUL); // if overflow happens it happens.
    super.visitVarInsn(Opcodes.ISTORE, productIndex);
    // iinc counter 1
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitVarInsn(Opcodes.ILOAD, productIndex);
    super.visitInsn(Opcodes.IMUL); // if overflow happens it happens.
    super.visitVarInsn(Opcodes.ISTORE, productIndex);
    // iinc counter 1
    super.visitIincInsn(counterIndex, 1);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitVarInsn(Opcodes.ISTORE, productIndex);
    // iinc counter 1
    super.visitIincInsn(counterIndex, 1);
    // goto loop
    super.visitJumpInsn(Opcodes.GOTO, loopLabel);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitIincInsn(counterIndex, 1);
    // goto loop
    super.visitJumpInsn(Opcodes.GOTO, loopLabel);
    // end:
    super.visitLabel(endLabel);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitJumpInsn(Opcodes.GOTO, loopLabel);
    // end:
    super.visitLabel(endLabel);
    // re-push dimensions array
    super.visitVarInsn(Opcodes.ALOAD, dimsArrayIndex);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitLabel(endLabel);
    // re-push dimensions array
    super.visitVarInsn(Opcodes.ALOAD, dimsArrayIndex);
    // push product
    super.visitVarInsn(Opcodes.ILOAD, productIndex);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitVarInsn(Opcodes.ALOAD, dimsArrayIndex);
    // push product
    super.visitVarInsn(Opcodes.ILOAD, productIndex);

    super.visitLabel(endScopeLabel);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitVarInsn(Opcodes.ILOAD, productIndex);

    super.visitLabel(endScopeLabel);
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    // arrays and clone().
    Label zeroDimension = new Label();
    super.visitInsn(Opcodes.DUP); // -> stack: ... origaref aref0
    super.visitLdcInsn(1); // -> stack: ... origaref aref0 productTo1
    for (int i = 0; i < dimCount; ++i) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    Label zeroDimension = new Label();
    super.visitInsn(Opcodes.DUP); // -> stack: ... origaref aref0
    super.visitLdcInsn(1); // -> stack: ... origaref aref0 productTo1
    for (int i = 0; i < dimCount; ++i) {
      // pre: stack: ... origaref aref0 productToI
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    for (int i = 0; i < dimCount; ++i) {
      // pre: stack: ... origaref aref0 productToI
      super.visitInsn(Opcodes.SWAP); // -> stack: ... origaref productToI aref
      super.visitInsn(Opcodes.DUP);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
      // pre: stack: ... origaref aref0 productToI
      super.visitInsn(Opcodes.SWAP); // -> stack: ... origaref productToI aref
      super.visitInsn(Opcodes.DUP);

      Label nonNullDimension = new Label();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
      Label nonNullDimension = new Label();
      // -> stack: ... origaref productToI aref aref
      super.visitJumpInsn(Opcodes.IFNONNULL, nonNullDimension);
      // -> stack: ... origaref productToI aref
      super.visitInsn(Opcodes.SWAP);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
      super.visitJumpInsn(Opcodes.IFNONNULL, nonNullDimension);
      // -> stack: ... origaref productToI aref
      super.visitInsn(Opcodes.SWAP);
      // -> stack: ... origaref aref productToI
      super.visitJumpInsn(Opcodes.GOTO, zeroDimension);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
      super.visitInsn(Opcodes.SWAP);
      // -> stack: ... origaref aref productToI
      super.visitJumpInsn(Opcodes.GOTO, zeroDimension);
      super.visitLabel(nonNullDimension);

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
      // -> stack: ... origaref aref productToI
      super.visitJumpInsn(Opcodes.GOTO, zeroDimension);
      super.visitLabel(nonNullDimension);

      // -> stack: ... origaref productToI aref
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java

      // -> stack: ... origaref productToI aref
      super.visitInsn(Opcodes.DUP_X1);
      // -> stack: ... origaref aref0 productToI aref
      super.visitInsn(Opcodes.ARRAYLENGTH);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
      super.visitInsn(Opcodes.DUP_X1);
      // -> stack: ... origaref aref0 productToI aref
      super.visitInsn(Opcodes.ARRAYLENGTH);
      // -> stack: ... origaref aref0 productToI dimI

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java

      Label nonZeroDimension = new Label();
      super.visitInsn(Opcodes.DUP);
      // -> stack: ... origaref aref0 productToI dimI dimI
      super.visitJumpInsn(Opcodes.IFNE, nonZeroDimension);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
      super.visitInsn(Opcodes.DUP);
      // -> stack: ... origaref aref0 productToI dimI dimI
      super.visitJumpInsn(Opcodes.IFNE, nonZeroDimension);
      // -> stack: ... origaref aref0 productToI dimI
      super.visitInsn(Opcodes.POP);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
      super.visitJumpInsn(Opcodes.IFNE, nonZeroDimension);
      // -> stack: ... origaref aref0 productToI dimI
      super.visitInsn(Opcodes.POP);
      // -> stack: ... origaref aref0 productToI
      super.visitJumpInsn(Opcodes.GOTO, zeroDimension);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
      super.visitInsn(Opcodes.POP);
      // -> stack: ... origaref aref0 productToI
      super.visitJumpInsn(Opcodes.GOTO, zeroDimension);
      super.visitLabel(nonZeroDimension);
      // -> stack: ... origaref aref0 productToI max(dimI,1)
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
      // -> stack: ... origaref aref0 productToI
      super.visitJumpInsn(Opcodes.GOTO, zeroDimension);
      super.visitLabel(nonZeroDimension);
      // -> stack: ... origaref aref0 productToI max(dimI,1)

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
      // -> stack: ... origaref aref0 productToI max(dimI,1)

      super.visitInsn(Opcodes.IMUL);
      // -> stack: ... origaref aref0 productTo{I+1}
      if (i < dimCount - 1) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
      // -> stack: ... origaref aref0 productTo{I+1}
      if (i < dimCount - 1) {
        super.visitInsn(Opcodes.SWAP);
        // -> stack: ... origaref productTo{I+1} aref0
        super.visitInsn(Opcodes.ICONST_0);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        super.visitInsn(Opcodes.SWAP);
        // -> stack: ... origaref productTo{I+1} aref0
        super.visitInsn(Opcodes.ICONST_0);
        // -> stack: ... origaref productTo{I+1} aref0 0
        super.visitInsn(Opcodes.AALOAD);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        super.visitInsn(Opcodes.ICONST_0);
        // -> stack: ... origaref productTo{I+1} aref0 0
        super.visitInsn(Opcodes.AALOAD);
        // -> stack: ... origaref productTo{I+1} aref0'
        super.visitInsn(Opcodes.SWAP);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        super.visitInsn(Opcodes.AALOAD);
        // -> stack: ... origaref productTo{I+1} aref0'
        super.visitInsn(Opcodes.SWAP);
      }
      // post: stack: ... origaref aref0 productTo{I+1}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
      // post: stack: ... origaref aref0 productTo{I+1}
    }
    super.visitLabel(zeroDimension);

    super.visitInsn(Opcodes.SWAP); // -> stack: ... origaref product aref0
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitLabel(zeroDimension);

    super.visitInsn(Opcodes.SWAP); // -> stack: ... origaref product aref0
    super.visitInsn(Opcodes.POP); // -> stack: ... origaref product
    super.visitInsn(Opcodes.SWAP); // -> stack: ... product origaref
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java

    super.visitInsn(Opcodes.SWAP); // -> stack: ... origaref product aref0
    super.visitInsn(Opcodes.POP); // -> stack: ... origaref product
    super.visitInsn(Opcodes.SWAP); // -> stack: ... product origaref
    invokeRecordAllocation(typeName);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitInsn(Opcodes.SWAP); // -> stack: ... origaref product aref0
    super.visitInsn(Opcodes.POP); // -> stack: ... origaref product
    super.visitInsn(Opcodes.SWAP); // -> stack: ... product origaref
    invokeRecordAllocation(typeName);
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
      ++outstandingAllocs;
    } else if (opcode == Opcodes.ANEWARRAY) {
      super.visitInsn(Opcodes.DUP);
      super.visitTypeInsn(opcode, typeName);
      invokeRecordAllocation(typeName);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        Label beginScopeLabel = new Label();
        Label endScopeLabel = new Label();
        super.visitLabel(beginScopeLabel);

        // stack: ... class count
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        // stack: ... class count
        int countIndex = newLocal("I", beginScopeLabel, endScopeLabel);
        super.visitVarInsn(Opcodes.ISTORE, countIndex);
        // -> stack: ... class
        pushClassNameOnStack();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        // -> stack: ... class className
        int typeNameIndex = newLocal("Ljava/lang/String;", beginScopeLabel, endScopeLabel);
        super.visitVarInsn(Opcodes.ASTORE, typeNameIndex);
        // -> stack: ... class
        super.visitVarInsn(Opcodes.ILOAD, countIndex);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        super.visitVarInsn(Opcodes.ASTORE, typeNameIndex);
        // -> stack: ... class
        super.visitVarInsn(Opcodes.ILOAD, countIndex);
        // -> stack: ... class count
        super.visitMethodInsn(opcode, owner, name, signature, itf);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        super.visitMethodInsn(opcode, owner, name, signature, itf);
        // -> stack: ... newobj
        super.visitInsn(Opcodes.DUP);
        // -> stack: ... newobj newobj
        super.visitVarInsn(Opcodes.ILOAD, countIndex);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        super.visitInsn(Opcodes.DUP);
        // -> stack: ... newobj newobj
        super.visitVarInsn(Opcodes.ILOAD, countIndex);
        // -> stack: ... newobj newobj count
        super.visitInsn(Opcodes.SWAP);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        super.visitVarInsn(Opcodes.ILOAD, countIndex);
        // -> stack: ... newobj newobj count
        super.visitInsn(Opcodes.SWAP);
        // -> stack: ... newobj count newobj
        super.visitVarInsn(Opcodes.ALOAD, typeNameIndex);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        super.visitInsn(Opcodes.SWAP);
        // -> stack: ... newobj count newobj
        super.visitVarInsn(Opcodes.ALOAD, typeNameIndex);
        super.visitLabel(endScopeLabel);
        // -> stack: ... newobj count newobj className
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        // -> stack: ... newobj count newobj
        super.visitVarInsn(Opcodes.ALOAD, typeNameIndex);
        super.visitLabel(endScopeLabel);
        // -> stack: ... newobj count newobj className
        super.visitInsn(Opcodes.SWAP);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        super.visitLabel(endScopeLabel);
        // -> stack: ... newobj count newobj className
        super.visitInsn(Opcodes.SWAP);
        // -> stack: ... newobj count className newobj
        super.visitMethodInsn(
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        Label beginScopeLabel = new Label();
        Label endScopeLabel = new Label();
        super.visitLabel(beginScopeLabel);

        int dimsArrayIndex = newLocal("[I", beginScopeLabel, endScopeLabel);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        // -> stack: ... class dimsArray product
        int productIndex = newLocal("I", beginScopeLabel, endScopeLabel);
        super.visitVarInsn(Opcodes.ISTORE, productIndex);
        // -> stack: ... class dimsArray

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        // -> stack: ... class dimsArray

        super.visitVarInsn(Opcodes.ASTORE, dimsArrayIndex);
        // -> stack: ... class
        pushClassNameOnStack();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        // -> stack: ... class className
        int typeNameIndex = newLocal("Ljava/lang/String;", beginScopeLabel, endScopeLabel);
        super.visitVarInsn(Opcodes.ASTORE, typeNameIndex);
        // -> stack: ... class
        super.visitVarInsn(Opcodes.ALOAD, dimsArrayIndex);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        super.visitVarInsn(Opcodes.ASTORE, typeNameIndex);
        // -> stack: ... class
        super.visitVarInsn(Opcodes.ALOAD, dimsArrayIndex);
        // -> stack: ... class dimsArray
        super.visitMethodInsn(opcode, owner, name, signature, itf);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        // -> stack: ... newobj

        super.visitInsn(Opcodes.DUP);
        // -> stack: ... newobj newobj
        super.visitVarInsn(Opcodes.ILOAD, productIndex);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        super.visitInsn(Opcodes.DUP);
        // -> stack: ... newobj newobj
        super.visitVarInsn(Opcodes.ILOAD, productIndex);
        // -> stack: ... newobj newobj product
        super.visitInsn(Opcodes.SWAP);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        super.visitVarInsn(Opcodes.ILOAD, productIndex);
        // -> stack: ... newobj newobj product
        super.visitInsn(Opcodes.SWAP);
        // -> stack: ... newobj product newobj
        super.visitVarInsn(Opcodes.ALOAD, typeNameIndex);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        super.visitInsn(Opcodes.SWAP);
        // -> stack: ... newobj product newobj
        super.visitVarInsn(Opcodes.ALOAD, typeNameIndex);
        super.visitLabel(endScopeLabel);
        // -> stack: ... newobj product newobj className
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        // -> stack: ... newobj product newobj
        super.visitVarInsn(Opcodes.ALOAD, typeNameIndex);
        super.visitLabel(endScopeLabel);
        // -> stack: ... newobj product newobj className
        super.visitInsn(Opcodes.SWAP);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        super.visitLabel(endScopeLabel);
        // -> stack: ... newobj product newobj className
        super.visitInsn(Opcodes.SWAP);
        // -> stack: ... newobj product className newobj
        super.visitMethodInsn(
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        } else {
          // -> stack: ... newobj
          super.visitInsn(Opcodes.DUP);
          // -> stack: ... newobj newobj
          super.visitTypeInsn(Opcodes.CHECKCAST, owner);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
          super.visitTypeInsn(Opcodes.CHECKCAST, owner);
          // -> stack: ... newobj arrayref
          super.visitInsn(Opcodes.ARRAYLENGTH);
          // -> stack: ... newobj length
          super.visitInsn(Opcodes.SWAP);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
          super.visitInsn(Opcodes.ARRAYLENGTH);
          // -> stack: ... newobj length
          super.visitInsn(Opcodes.SWAP);
          // -> stack: ... length newobj
          invokeRecordAllocation(owner.substring(i));
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
      } else if ("newInstance".equals(name)) {
        if ("java/lang/Class".equals(owner) && "()Ljava/lang/Object;".equals(signature)) {
          super.visitInsn(Opcodes.DUP);
          // -> stack: ... Class Class
          super.visitMethodInsn(opcode, owner, name, signature, itf);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
          super.visitMethodInsn(opcode, owner, name, signature, itf);
          // -> stack: ... Class newobj
          super.visitInsn(Opcodes.DUP_X1);
          // -> stack: ... newobj Class newobj
          super.visitMethodInsn(
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        dupStackElementBeforeSignatureArgs(signature);
        super.visitMethodInsn(opcode, owner, name, signature, itf);
        super.visitLdcInsn(-1);
        super.visitInsn(Opcodes.SWAP);
        invokeRecordAllocation(owner);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        super.visitMethodInsn(opcode, owner, name, signature, itf);
        super.visitLdcInsn(-1);
        super.visitInsn(Opcodes.SWAP);
        invokeRecordAllocation(owner);
        super.visitInsn(Opcodes.POP);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        super.visitInsn(Opcodes.SWAP);
        invokeRecordAllocation(owner);
        super.visitInsn(Opcodes.POP);
        return;
      }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
  // post: stack: ... class className
  private void pushClassNameOnStack() {
    super.visitInsn(Opcodes.DUP);
    // -> stack: ... class class
    super.visitMethodInsn(
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
      // outstack: ... aref
      if (operand >= 4 && operand <= 11) {
        super.visitInsn(Opcodes.DUP); // -> stack: ... count count
        super.visitIntInsn(opcode, operand); // -> stack: ... count aref
        invokeRecordAllocation(primitiveTypeNames[operand]);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    final Label beginScopeLabel = new Label();
    final Label endScopeLabel = new Label();
    super.visitLabel(beginScopeLabel);

    Type[] argTypes = Type.getArgumentTypes(sig);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    for (int i = argTypes.length - 1; i >= 0; --i) {
      args[i] = newLocal(argTypes[i], beginScopeLabel, endScopeLabel);
      super.visitVarInsn(argTypes[i].getOpcode(Opcodes.ISTORE), args[i]);
    }
    super.visitInsn(Opcodes.DUP);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
      super.visitVarInsn(argTypes[i].getOpcode(Opcodes.ISTORE), args[i]);
    }
    super.visitInsn(Opcodes.DUP);
    for (int i = 0; i < argTypes.length; ++i) {
      int op = argTypes[i].getOpcode(Opcodes.ILOAD);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    for (int i = 0; i < argTypes.length; ++i) {
      int op = argTypes[i].getOpcode(Opcodes.ILOAD);
      super.visitVarInsn(op, args[i]);
      if (op == Opcodes.ALOAD) {
        super.visitInsn(Opcodes.ACONST_NULL);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
      super.visitVarInsn(op, args[i]);
      if (op == Opcodes.ALOAD) {
        super.visitInsn(Opcodes.ACONST_NULL);
        super.visitVarInsn(Opcodes.ASTORE, args[i]);
      }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
      if (op == Opcodes.ALOAD) {
        super.visitInsn(Opcodes.ACONST_NULL);
        super.visitVarInsn(Opcodes.ASTORE, args[i]);
      }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
      }
    }
    super.visitLabel(endScopeLabel);
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    if (localScopes != null) {
      for (VariableScope scope : localScopes) {
        super.visitLocalVariable(
            "xxxxx$" + scope.index, scope.desc, null, scope.start, scope.end, scope.index);
      }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitMethodInsn(opcode, owner, name, signature, itf);
    // -> stack: ... newobj
    super.visitInsn(Opcodes.DUP);
    // -> stack: ... newobj newobj
    super.visitInsn(Opcodes.DUP);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitInsn(Opcodes.DUP);
    // -> stack: ... newobj newobj
    super.visitInsn(Opcodes.DUP);
    // -> stack: ... newobj newobj newobj
    // We could be instantiating this class or a subclass, so we
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
        Opcodes.INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
    // -> stack: ... newobj newobj Class
    super.visitInsn(Opcodes.SWAP);
    // -> stack: ... newobj Class newobj
    super.visitMethodInsn(
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    }
    // stack: ... count newobj
    super.visitInsn(Opcodes.DUP_X1);
    // -> stack: ... newobj count newobj
    super.visitLdcInsn(typeName);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitInsn(Opcodes.DUP_X1);
    // -> stack: ... newobj count newobj
    super.visitLdcInsn(typeName);
    // -> stack: ... newobj count newobj typename
    super.visitInsn(Opcodes.SWAP);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    super.visitLdcInsn(typeName);
    // -> stack: ... newobj count newobj typename
    super.visitInsn(Opcodes.SWAP);
    // -> stack: ... newobj count typename newobj
    super.visitMethodInsn(
```

## RuleId[ruleID=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/com/google/monitoring/runtime/instrumentation/VerifyingClassAdapter.java`
#### Snippet
```java
    PASS,
    UNKNOWN,
    FAIL_TOO_LONG;
  }

```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.objectweb.asm` is unnecessary and can be removed
in `src/main/java/com/google/monitoring/runtime/instrumentation/VerifyingClassAdapter.java`
#### Snippet
```java
   * {@inheritDoc}
   *
   * <p>In addition, the returned {@link org.objectweb.asm.MethodVisitor} will throw an exception if
   * the method is greater than 64K in length.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.objectweb.asm` is unnecessary and can be removed
in `src/main/java/com/google/monitoring/runtime/instrumentation/VerifyingClassAdapter.java`
#### Snippet
```java
/**
 * This is a class writer that gets used in place of the existing {@link
 * org.objectweb.asm.ClassWriter}, and verifies properties of the class getting written.
 *
 * <p>Currently, it only checks to see if the methods are of the correct length for Java methods
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
   * constructor call (INVOKESPECIAL) so we hook that here too as a proxy for the new bytecode which
   * leaves an uninitialized object on the stack that we're not allowed to touch. {@link
   * java.lang.Object#clone} is also a call to INVOKESPECIAL, and is hooked here. {@link
   * java.lang.Class#newInstance} and {@link java.lang.reflect.Constructor#newInstance} are both
   * INVOKEVIRTUAL calls, so they are hooked here, as well.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
   * leaves an uninitialized object on the stack that we're not allowed to touch. {@link
   * java.lang.Object#clone} is also a call to INVOKESPECIAL, and is hooked here. {@link
   * java.lang.Class#newInstance} and {@link java.lang.reflect.Constructor#newInstance} are both
   * INVOKEVIRTUAL calls, so they are hooked here, as well.
   */
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Argument `is` might be null
in `src/main/java/com/google/monitoring/runtime/instrumentation/StaticClassWriter.java`
#### Snippet
```java
            ClassLoader.getSystemResourceAsStream(fileName) :
            loader.getResourceAsStream(fileName);
        cr = new ClassReader(is);
      } catch (IOException e) {
        throw new RuntimeException("Error reading: " + fileName, e);
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `samplerMap` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/com/google/monitoring/runtime/instrumentation/ConstructorInstrumenter.java`
#### Snippet
```java

  private static final Logger logger = Logger.getLogger(ConstructorInstrumenter.class.getName());
  private static ConcurrentHashMap<Class<?>, List<ConstructorCallback<?>>> samplerMap =
      new ConcurrentHashMap<Class<?>, List<ConstructorCallback<?>>>();

```

## RuleId[ruleID=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationInstrumenter.java`
#### Snippet
```java
     */
    try {
      inst.retransformClasses(new Class<?>[] {Object.class});
    } catch (UnmodifiableClassException e) {
      System.err.println("AllocationInstrumenter was unable to retransform java.lang.Object.");
```

## RuleId[ruleID=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationRecorder.java`
#### Snippet
```java
  // See the comment above the addShutdownHook in the static block above
  // for why this is volatile.
  private static volatile Instrumentation instrumentation = null;

  static Instrumentation getInstrumentation() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/google/monitoring/runtime/instrumentation/ConstructorInstrumenter.java`
#### Snippet
```java
     * setter of this should be AllocationClassAdapter.visitMethod().
     */
    public LocalVariablesSorter lvs = null;

    Class<?> cl;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
   * of this should be AllocationClassAdapter.visitMethod().
   */
  public LocalVariablesSorter lvs = null;

  /** A new AllocationMethodAdapter is created for each method that gets visited. */
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
  // accumulate the scopes here and set them all at the end of the visit to
  // ensure all labels have been resolved.  Allocated on-demand.
  private List<VariableScope> localScopes = null;

  private List<VariableScope> getLocalScopes() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
  // and <init>'s called because of superclass initialization, we track the
  // number of NEWs that still need to have their <init>'s called.
  private int outstandingAllocs = 0;

  // We need to set the scope of any local variables we materialize;
```

## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `desc`
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationRecorder.java`
#### Snippet
```java

    if (count >= 0) {
      desc = desc.replace('.', '/');
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `typeName`
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationMethodAdapter.java`
#### Snippet
```java
    Matcher matcher = namePattern.matcher(typeName);
    if (matcher.find()) {
      typeName = matcher.group(1);
    }
    // stack: ... count newobj
```

## RuleId[ruleID=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/com/google/monitoring/runtime/instrumentation/StaticClassWriter.java`
#### Snippet
```java
          try {
            is.close();
          } catch (Exception e) {
          }
        }
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/google/monitoring/runtime/instrumentation/StaticClassWriter.java`
#### Snippet
```java
      int cpIndex = cr.getItem(cr.readUnsignedShort(offset));
      if (cpIndex == 0) {
        return null;
        // throw new RuntimeException("Bad constant pool index");
      }
```

### ReturnNull
Return of `null`
in `src/main/java/com/google/monitoring/runtime/instrumentation/StaticClassWriter.java`
#### Snippet
```java
    ClassInfo getSuperclass() {
      if (superClass == null) {
        return null;
      }
      return new ClassInfo(superClass, loader, alwaysStatic);
```

### ReturnNull
Return of `null`
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationInstrumenter.java`
#### Snippet
```java
      byte[] origBytes) {
    if (!canRewriteClass(className, loader)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/google/monitoring/runtime/instrumentation/ConstructorInstrumenter.java`
#### Snippet
```java
      byte[] classfileBuffer) {
    if ((classBeingRedefined == null) || (!samplerMap.containsKey(classBeingRedefined))) {
      return null;
    }
    if (!AllocationInstrumenter.canRewriteClass(className, loader)) {
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/google/monitoring/runtime/instrumentation/StaticClassWriter.java`
#### Snippet
```java
    ClassInfo[] getInterfaces() {
      if (interfaces == null) {
        return new ClassInfo[0];
      }
      ClassInfo[] result = new ClassInfo[interfaces.length];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationInstrumenter.java`
#### Snippet
```java

    canRewriteBootstrap = true;
    List<String> args = Arrays.asList(agentArgs == null ? new String[0] : agentArgs.split(","));

    // When "subclassesAlso" is specified, samplers are also invoked when
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `objectSize < 0` is always `true`
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationRecorder.java`
#### Snippet
```java
      Sampler[] samplers = additionalSamplers;
      if (samplers != null) {
        if (objectSize < 0) {
          objectSize = getObjectSize(newObj, (count >= 0), instr);
        }
```

## RuleId[ruleID=AnonymousHasLambdaAlternative]
### AnonymousHasLambdaAlternative
Anonymous new Thread() can be replaced with new Thread(() -\> {...})
in `src/main/java/com/google/monitoring/runtime/instrumentation/AllocationRecorder.java`
#### Snippet
```java
    Runtime.getRuntime()
        .addShutdownHook(
            new Thread() {
              @Override
              public void run() {
```

