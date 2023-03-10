# debugger-agent 
 
# Bad smells
I found 35 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 9 | false |
| UtilityClassWithoutPrivateConstructor | 5 | true |
| DynamicRegexReplaceableByCompiledPattern | 4 | false |
| RedundantFieldInitialization | 4 | false |
| AssignmentToMethodParameter | 3 | false |
| MissortedModifiers | 2 | false |
| RedundantSuppression | 2 | false |
| IOResource | 1 | false |
| NestedAssignment | 1 | false |
| CommentedOutCode | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| RedundantEscapeInRegexReplacement | 1 | false |
| BoundedWildcard | 1 | false |
## RuleId[id=IOResource]
### IOResource
'DataOutputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/com/intellij/rt/debugger/agent/CaptureStorage.java`
#### Snippet
```java
    }
    ByteArrayOutputStream bas = new ByteArrayOutputStream();
    DataOutputStream dos = new DataOutputStream(bas);
    for (StackTraceElement elem : getStackTrace(stack, limit)) {
      if (elem == null) {
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `DebuggerAgent` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/intellij/rt/debugger/agent/DebuggerAgent.java`
#### Snippet
```java

@SuppressWarnings("UseOfSystemOutOrSystemErr")
public class DebuggerAgent {
  public static void premain(String args, Instrumentation instrumentation) {
    // never instrument twice
```

### UtilityClassWithoutPrivateConstructor
Class `CollectionBreakpointInstrumentor` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/intellij/rt/debugger/agent/CollectionBreakpointInstrumentor.java`
#### Snippet
```java

@SuppressWarnings({"UseOfSystemOutOrSystemErr", "CallToPrintStackTrace", "rawtypes"})
public class CollectionBreakpointInstrumentor {
  private static final String OBJECT_TYPE = "Ljava/lang/Object;";
  private static final String STRING_TYPE = "Ljava/lang/String;";
```

### UtilityClassWithoutPrivateConstructor
Class `CaptureStorage` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/intellij/rt/debugger/agent/CaptureStorage.java`
#### Snippet
```java

@SuppressWarnings("UseOfSystemOutOrSystemErr")
public final class CaptureStorage {
  public static final String GENERATED_INSERT_METHOD_POSTFIX = "$$$capture";
  private static final ReferenceQueue KEY_REFERENCE_QUEUE = new ReferenceQueue();
```

### UtilityClassWithoutPrivateConstructor
Class `CollectionBreakpointStorage` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/intellij/rt/debugger/agent/CollectionBreakpointStorage.java`
#### Snippet
```java
import java.util.concurrent.locks.ReentrantLock;

public class CollectionBreakpointStorage {
  private static final ConcurrentMap<CapturedField, FieldHistory> FIELD_MODIFICATIONS_STORAGE;
  private static final ConcurrentMap<CollectionWrapper, CollectionHistory> COLLECTION_MODIFICATIONS_STORAGE;
```

### UtilityClassWithoutPrivateConstructor
Class `CaptureAgent` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/com/intellij/rt/debugger/agent/CaptureAgent.java`
#### Snippet
```java

@SuppressWarnings({"UseOfSystemOutOrSystemErr", "CallToPrintStackTrace", "rawtypes"})
public final class CaptureAgent {
  private static Instrumentation ourInstrumentation;
  private static final Set<Class> mySkipped = new HashSet<Class>();
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/intellij/rt/debugger/agent/CollectionBreakpointInstrumentor.java`
#### Snippet
```java
    try {
      System.out.println("instrumented: " + className);
      FileOutputStream stream = new FileOutputStream("instrumented_" + className.replaceAll("/", "_") + ".class");
      try {
        stream.write(bytes);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/intellij/rt/debugger/agent/CaptureAgent.java`
#### Snippet
```java
      InstrumentPoint point = addPoint((String)entry.getKey(), (String)entry.getValue());
      if (point != null) {
        classNames.add(point.myClassName.replaceAll("/", "\\."));
      }
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/intellij/rt/debugger/agent/CaptureAgent.java`
#### Snippet
```java
                             String methodDisplayName) {
      keyProvider.loadKey(mv, isStatic, argumentTypes, methodDisplayName, this);
      mv.visitMethodInsn(Opcodes.INVOKESTATIC, CaptureStorage.class.getName().replaceAll("\\.", "/"), storageMethodName,
                         "(Ljava/lang/Object;)V", false);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/com/intellij/rt/debugger/agent/CaptureAgent.java`
#### Snippet
```java
            if (CaptureStorage.DEBUG) {
              try {
                FileOutputStream stream = new FileOutputStream("instrumented_" + className.replaceAll("/", "_") + ".class");
                try {
                  stream.write(bytes);
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/com/intellij/rt/debugger/agent/CaptureStorage.java`
#### Snippet
```java
  private static void processQueue() {
    WeakKey key;
    while ((key = (WeakKey)KEY_REFERENCE_QUEUE.poll()) != null) {
      STORAGE.remove(key);
    }
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (11 lines)
in `src/main/java/com/intellij/rt/debugger/agent/CaptureAgent.java`
#### Snippet
```java
      // Trying to reinstrument java.lang.Thread
      // fails with dcevm, does not work with other vms :(
      //for (Class aClass : instrumentation.getAllLoadedClasses()) {
      //  String name = aClass.getName().replaceAll("\\.", "/");
      //  if (myCapturePoints.containsKey(name) || myInsertPoints.containsKey(name)) {
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/intellij/rt/debugger/agent/CollectionBreakpointInstrumentor.java`
#### Snippet
```java
      private int myShouldCaptureVar;
      private int myAdditionalStackSpace = 0;
      private int myNumberOfAdditionalLocalVars = 0;

      protected CollectionMethodVisitor(int api, int access, String name, String descriptor, MethodVisitor methodVisitor) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/intellij/rt/debugger/agent/CollectionBreakpointInstrumentor.java`
#### Snippet
```java

    private class CaptureFieldsMethodVisitor extends MethodVisitor {
      private int myAdditionalStackSpace = 0;

      private CaptureFieldsMethodVisitor(int api, MethodVisitor methodVisitor) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/com/intellij/rt/debugger/agent/CollectionBreakpointInstrumentor.java`
#### Snippet
```java
      private int myCollectionCopyVar;
      private int myShouldCaptureVar;
      private int myAdditionalStackSpace = 0;
      private int myNumberOfAdditionalLocalVars = 0;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/com/intellij/rt/debugger/agent/CaptureAgent.java`
#### Snippet
```java
              if (CONSTRUCTOR.equals(name) && point.myKeyProvider == THIS_KEY_PROVIDER) {
                return new MethodVisitor(api, super.visitMethod(access, name, desc, signature, exceptions)) {
                  boolean captured = false;

                  @Override
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `stack`
in `src/main/java/com/intellij/rt/debugger/agent/CaptureStorage.java`
#### Snippet
```java
        int newEnd = depth + 2;
        if (newEnd > size) {
          stack = null; // Insertion point was not found - stop
        }
        else {
```

### AssignmentToMethodParameter
Assignment to method parameter `stack`
in `src/main/java/com/intellij/rt/debugger/agent/CaptureStorage.java`
#### Snippet
```java
        else {
          stackTrace = stackTrace.subList(0, newEnd);
          stack = ((DeepCapturedStack)stack).myInsertMatch;
        }
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `stack`
in `src/main/java/com/intellij/rt/debugger/agent/CaptureStorage.java`
#### Snippet
```java
      }
      else {
        stack = null;
      }
      res.addAll(stackTrace);
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/intellij/rt/debugger/agent/CollectionBreakpointInstrumentor.java`
#### Snippet
```java
    @Override
    public Object setValue(Object value) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/com/intellij/rt/debugger/agent/CollectionBreakpointInstrumentor.java`
#### Snippet
```java
    try {
      if (!shouldCapture) {
        return null;
      }
      return Multiset.toMultiset(collectionInstance);
```

### ReturnNull
Return of `null`
in `src/main/java/com/intellij/rt/debugger/agent/CollectionBreakpointInstrumentor.java`
#### Snippet
```java
      e.printStackTrace();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/com/intellij/rt/debugger/agent/CollectionBreakpointInstrumentor.java`
#### Snippet
```java
                            byte[] classfileBuffer) {
      if (className == null) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `src/main/java/com/intellij/rt/debugger/agent/CollectionBreakpointInstrumentor.java`
#### Snippet
```java
        }
      }
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/main/java/com/intellij/rt/debugger/agent/CaptureStorage.java`
#### Snippet
```java
  private static String wrapInString(CapturedStack stack, int limit) throws IOException {
    if (stack == null) {
      return null;
    }
    ByteArrayOutputStream bas = new ByteArrayOutputStream();
```

### ReturnNull
Return of `null`
in `src/main/java/com/intellij/rt/debugger/agent/CaptureStorage.java`
#### Snippet
```java
  private static Object[][] wrapInArray(CapturedStack stack, int limit) {
    if (stack == null) {
      return null;
    }
    List<StackTraceElement> stackTrace = getStackTrace(stack, limit);
```

### ReturnNull
Return of `null`
in `src/main/java/com/intellij/rt/debugger/agent/CaptureAgent.java`
#### Snippet
```java
      return addPoint(false, propertyValue);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/com/intellij/rt/debugger/agent/CaptureAgent.java`
#### Snippet
```java
        }
      }
      return null;
    }
  }
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/com/intellij/rt/debugger/agent/CaptureAgent.java`
#### Snippet
```java

      //noinspection SSBasedInspection
      ourInstrumentation.retransformClasses(classes.toArray(new Class[0]));
    }
  }
```

## RuleId[id=RedundantEscapeInRegexReplacement]
### RedundantEscapeInRegexReplacement
Redundant escape of '.'
in `src/main/java/com/intellij/rt/debugger/agent/CaptureAgent.java`
#### Snippet
```java
      InstrumentPoint point = addPoint((String)entry.getKey(), (String)entry.getValue());
      if (point != null) {
        classNames.add(point.myClassName.replaceAll("/", "\\."));
      }
    }
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Modification`
in `src/main/java/com/intellij/rt/debugger/agent/CollectionBreakpointInstrumentor.java`
#### Snippet
```java
  }

  private static void saveCollectionModifications(Object collectionInstance, ArrayList<Modification> modifications) {
    Collections.sort(modifications);
    for (Modification modification : modifications) {
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `abstract public`
in `src/main/java/com/intellij/rt/debugger/agent/CollectionBreakpointInstrumentor.java`
#### Snippet
```java
    }

    abstract public int addCaptureModificationCode(MethodVisitor mv, int shouldCaptureVar);

    @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `src/main/java/com/intellij/rt/debugger/agent/CaptureAgent.java`
#### Snippet
```java

  private static class InstrumentPoint {
    final static String ANY_DESC = "*";

    final boolean myCapture;
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/com/intellij/rt/debugger/agent/CaptureAgent.java`
#### Snippet
```java
      }

      //noinspection SSBasedInspection
      ourInstrumentation.retransformClasses(classes.toArray(new Class[0]));
    }
```

### RedundantSuppression
Redundant suppression
in `src/main/java/com/intellij/rt/debugger/agent/CaptureStorage.java`
#### Snippet
```java

  @SuppressWarnings("SSBasedInspection")
  private static final ThreadLocal<Deque<CapturedStack>> CURRENT_STACKS = new ThreadLocal<Deque<CapturedStack>>() {
    @Override
    protected Deque<CapturedStack> initialValue() {
```

