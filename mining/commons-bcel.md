# commons-bcel 
 
# Bad smells
I found 1174 bad smells with 18 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessarySuperQualifier | 335 | false |
| UnnecessaryFullyQualifiedName | 253 | false |
| ReturnNull | 85 | false |
| SystemOutErr | 54 | false |
| RedundantMethodOverride | 48 | false |
| NestedAssignment | 46 | false |
| UnnecessaryBoxing | 39 | false |
| EmptyMethod | 37 | false |
| AssignmentToMethodParameter | 27 | false |
| UnusedAssignment | 24 | false |
| CommentedOutCode | 19 | false |
| ObsoleteCollection | 19 | false |
| DeprecatedIsStillUsed | 17 | false |
| DataFlowIssue | 16 | false |
| StaticInitializerReferencesSubClass | 15 | false |
| UnnecessaryUnboxing | 12 | false |
| ThrowablePrintStackTrace | 12 | false |
| AssignmentToStaticFieldFromInstanceMethod | 10 | false |
| NonProtectedConstructorInAbstractClass | 9 | true |
| BoundedWildcard | 7 | false |
| ConstantValue | 7 | false |
| EqualsWhichDoesntCheckParameterClass | 7 | false |
| AssignmentToForLoopParameter | 6 | false |
| DuplicateBranchesInSwitch | 5 | false |
| ThrowablePrintedToSystemOut | 5 | false |
| UnnecessaryToStringCall | 5 | true |
| TrivialStringConcatenation | 4 | false |
| AbstractClassNeverImplemented | 4 | false |
| UnnecessaryCallToStringValueOf | 4 | false |
| MismatchedJavadocCode | 4 | false |
| RefusedBequest | 3 | false |
| ReplaceAssignmentWithOperatorAssignment | 3 | false |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| RedundantSuppression | 3 | false |
| DynamicRegexReplaceableByCompiledPattern | 3 | false |
| CopyConstructorMissesField | 3 | false |
| WrapperTypeMayBePrimitive | 2 | false |
| NonFinalFieldOfException | 2 | false |
| NonSerializableFieldInSerializableClass | 2 | false |
| AssignmentToLambdaParameter | 2 | false |
| MagicConstant | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| ClassNameSameAsAncestorName | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| SynchronizeOnThis | 1 | false |
| CastConflictsWithInstanceof | 1 | false |
| NonExceptionNameEndsWithException | 1 | false |
| IOResource | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| UtilityClassWithPublicConstructor | 1 | false |
| SuspiciousToArrayCall | 1 | false |
## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/org/apache/bcel/util/BCELFactory.java`
#### Snippet
```java
            embed = "(char)0x" + Integer.toHexString(((Character) value).charValue());
        } else if (value instanceof Float) {
            final Float f = (Float) value;
            if (Float.isNaN(f)) {
                embed = "Float.NaN";
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/org/apache/bcel/util/BCELFactory.java`
#### Snippet
```java
            }
        }  else if (value instanceof Double) {
            final Double d = (Double) value;
            if (Double.isNaN(d)) {
                embed = "Double.NaN";
```

## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: Modifier.PUBLIC, Modifier.PRIVATE, Modifier.PROTECTED, Modifier.STATIC, Modifier.FINAL, ... or their combination
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java
    public Method getMethod(final java.lang.reflect.Method m) {
        for (final Method method : methods) {
            if (m.getName().equals(method.getName()) && m.getModifiers() == method.getModifiers() && Type.getSignature(m).equals(method.getSignature())) {
                return method;
            }
```

## RuleId[id=StaticInitializerReferencesSubClass]
### StaticInitializerReferencesSubClass
Referencing subclass ObjectType from superclass Type initializer might lead to class loading deadlock
in `src/main/java/org/apache/bcel/generic/Type.java`
#### Snippet
```java
    public static final BasicType FLOAT = new BasicType(Const.T_FLOAT);
    public static final BasicType CHAR = new BasicType(Const.T_CHAR);
    public static final ObjectType OBJECT = new ObjectType("java.lang.Object");
    public static final ObjectType CLASS = new ObjectType("java.lang.Class");
    public static final ObjectType STRING = new ObjectType("java.lang.String");
```

### StaticInitializerReferencesSubClass
Referencing subclass BasicType from superclass Type initializer might lead to class loading deadlock
in `src/main/java/org/apache/bcel/generic/Type.java`
#### Snippet
```java
    public static final BasicType BYTE = new BasicType(Const.T_BYTE);
    public static final BasicType LONG = new BasicType(Const.T_LONG);
    public static final BasicType DOUBLE = new BasicType(Const.T_DOUBLE);
    public static final BasicType FLOAT = new BasicType(Const.T_FLOAT);
    public static final BasicType CHAR = new BasicType(Const.T_CHAR);
```

### StaticInitializerReferencesSubClass
Referencing subclass BasicType from superclass Type initializer might lead to class loading deadlock
in `src/main/java/org/apache/bcel/generic/Type.java`
#### Snippet
```java
    public static final BasicType BOOLEAN = new BasicType(Const.T_BOOLEAN);
    public static final BasicType INT = new BasicType(Const.T_INT);
    public static final BasicType SHORT = new BasicType(Const.T_SHORT);
    public static final BasicType BYTE = new BasicType(Const.T_BYTE);
    public static final BasicType LONG = new BasicType(Const.T_LONG);
```

### StaticInitializerReferencesSubClass
Referencing subclass ObjectType from superclass Type initializer might lead to class loading deadlock
in `src/main/java/org/apache/bcel/generic/Type.java`
#### Snippet
```java
    public static final ObjectType STRING = new ObjectType("java.lang.String");
    public static final ObjectType STRINGBUFFER = new ObjectType("java.lang.StringBuffer");
    public static final ObjectType THROWABLE = new ObjectType("java.lang.Throwable");

    /**
```

### StaticInitializerReferencesSubClass
Referencing subclass BasicType from superclass Type initializer might lead to class loading deadlock
in `src/main/java/org/apache/bcel/generic/Type.java`
#### Snippet
```java
    public static final BasicType DOUBLE = new BasicType(Const.T_DOUBLE);
    public static final BasicType FLOAT = new BasicType(Const.T_FLOAT);
    public static final BasicType CHAR = new BasicType(Const.T_CHAR);
    public static final ObjectType OBJECT = new ObjectType("java.lang.Object");
    public static final ObjectType CLASS = new ObjectType("java.lang.Class");
```

### StaticInitializerReferencesSubClass
Referencing subclass ObjectType from superclass Type initializer might lead to class loading deadlock
in `src/main/java/org/apache/bcel/generic/Type.java`
#### Snippet
```java
    public static final BasicType CHAR = new BasicType(Const.T_CHAR);
    public static final ObjectType OBJECT = new ObjectType("java.lang.Object");
    public static final ObjectType CLASS = new ObjectType("java.lang.Class");
    public static final ObjectType STRING = new ObjectType("java.lang.String");
    public static final ObjectType STRINGBUFFER = new ObjectType("java.lang.StringBuffer");
```

### StaticInitializerReferencesSubClass
Referencing subclass BasicType from superclass Type initializer might lead to class loading deadlock
in `src/main/java/org/apache/bcel/generic/Type.java`
#### Snippet
```java
     * Predefined constants
     */
    public static final BasicType VOID = new BasicType(Const.T_VOID);

    public static final BasicType BOOLEAN = new BasicType(Const.T_BOOLEAN);
```

### StaticInitializerReferencesSubClass
Referencing subclass BasicType from superclass Type initializer might lead to class loading deadlock
in `src/main/java/org/apache/bcel/generic/Type.java`
#### Snippet
```java
    public static final BasicType SHORT = new BasicType(Const.T_SHORT);
    public static final BasicType BYTE = new BasicType(Const.T_BYTE);
    public static final BasicType LONG = new BasicType(Const.T_LONG);
    public static final BasicType DOUBLE = new BasicType(Const.T_DOUBLE);
    public static final BasicType FLOAT = new BasicType(Const.T_FLOAT);
```

### StaticInitializerReferencesSubClass
Referencing subclass BasicType from superclass Type initializer might lead to class loading deadlock
in `src/main/java/org/apache/bcel/generic/Type.java`
#### Snippet
```java
    public static final BasicType INT = new BasicType(Const.T_INT);
    public static final BasicType SHORT = new BasicType(Const.T_SHORT);
    public static final BasicType BYTE = new BasicType(Const.T_BYTE);
    public static final BasicType LONG = new BasicType(Const.T_LONG);
    public static final BasicType DOUBLE = new BasicType(Const.T_DOUBLE);
```

### StaticInitializerReferencesSubClass
Referencing subclass ReferenceType from superclass Type initializer might lead to class loading deadlock
in `src/main/java/org/apache/bcel/generic/Type.java`
#### Snippet
```java
     */
    public static final Type[] NO_ARGS = {};
    public static final ReferenceType NULL = new ReferenceType() {
    };

```

### StaticInitializerReferencesSubClass
Referencing subclass BasicType from superclass Type initializer might lead to class loading deadlock
in `src/main/java/org/apache/bcel/generic/Type.java`
#### Snippet
```java
    public static final BasicType VOID = new BasicType(Const.T_VOID);

    public static final BasicType BOOLEAN = new BasicType(Const.T_BOOLEAN);
    public static final BasicType INT = new BasicType(Const.T_INT);
    public static final BasicType SHORT = new BasicType(Const.T_SHORT);
```

### StaticInitializerReferencesSubClass
Referencing subclass BasicType from superclass Type initializer might lead to class loading deadlock
in `src/main/java/org/apache/bcel/generic/Type.java`
#### Snippet
```java

    public static final BasicType BOOLEAN = new BasicType(Const.T_BOOLEAN);
    public static final BasicType INT = new BasicType(Const.T_INT);
    public static final BasicType SHORT = new BasicType(Const.T_SHORT);
    public static final BasicType BYTE = new BasicType(Const.T_BYTE);
```

### StaticInitializerReferencesSubClass
Referencing subclass BasicType from superclass Type initializer might lead to class loading deadlock
in `src/main/java/org/apache/bcel/generic/Type.java`
#### Snippet
```java
    public static final BasicType LONG = new BasicType(Const.T_LONG);
    public static final BasicType DOUBLE = new BasicType(Const.T_DOUBLE);
    public static final BasicType FLOAT = new BasicType(Const.T_FLOAT);
    public static final BasicType CHAR = new BasicType(Const.T_CHAR);
    public static final ObjectType OBJECT = new ObjectType("java.lang.Object");
```

### StaticInitializerReferencesSubClass
Referencing subclass ObjectType from superclass Type initializer might lead to class loading deadlock
in `src/main/java/org/apache/bcel/generic/Type.java`
#### Snippet
```java
    public static final ObjectType CLASS = new ObjectType("java.lang.Class");
    public static final ObjectType STRING = new ObjectType("java.lang.String");
    public static final ObjectType STRINGBUFFER = new ObjectType("java.lang.StringBuffer");
    public static final ObjectType THROWABLE = new ObjectType("java.lang.Throwable");

```

### StaticInitializerReferencesSubClass
Referencing subclass ObjectType from superclass Type initializer might lead to class loading deadlock
in `src/main/java/org/apache/bcel/generic/Type.java`
#### Snippet
```java
    public static final ObjectType OBJECT = new ObjectType("java.lang.Object");
    public static final ObjectType CLASS = new ObjectType("java.lang.Class");
    public static final ObjectType STRING = new ObjectType("java.lang.String");
    public static final ObjectType STRINGBUFFER = new ObjectType("java.lang.StringBuffer");
    public static final ObjectType THROWABLE = new ObjectType("java.lang.Throwable");
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `className` from instance context
in `src/main/java/org/apache/bcel/util/Class2HTML.java`
#### Snippet
```java
        this.javaClass = javaClass;
        this.dir = dir;
        className = javaClass.getClassName(); // Remember full name
        constantPool = javaClass.getConstantPool();
        // Get package name by tacking off everything after the last '.'
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `constantPool` from instance context
in `src/main/java/org/apache/bcel/util/Class2HTML.java`
#### Snippet
```java
        this.dir = dir;
        className = javaClass.getClassName(); // Remember full name
        constantPool = javaClass.getConstantPool();
        // Get package name by tacking off everything after the last '.'
        final int index = className.lastIndexOf('.');
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `classPackage` from instance context
in `src/main/java/org/apache/bcel/util/Class2HTML.java`
#### Snippet
```java
        final int index = className.lastIndexOf('.');
        if (index > -1) {
            classPackage = className.substring(0, index);
        } else {
            classPackage = ""; // default package
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `classPackage` from instance context
in `src/main/java/org/apache/bcel/util/Class2HTML.java`
#### Snippet
```java
            classPackage = className.substring(0, index);
        } else {
            classPackage = ""; // default package
        }
        final ConstantHTML constantHtml = new ConstantHTML(dir, className, classPackage, methods, constantPool, charset);
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `wide` from instance context
in `src/main/java/org/apache/bcel/util/CodeHTML.java`
#### Snippet
```java
            if (wide) {
                vindex = bytes.readShort();
                wide = false; // Clear flag
            } else {
                vindex = bytes.readUnsignedByte();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `wide` from instance context
in `src/main/java/org/apache/bcel/util/CodeHTML.java`
#### Snippet
```java
         */
        case Const.WIDE:
            wide = true;
            buf.append("(wide)");
            break;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `wide` from instance context
in `src/main/java/org/apache/bcel/util/CodeHTML.java`
#### Snippet
```java
                vindex = bytes.readShort();
                constant = bytes.readShort();
                wide = false;
            } else {
                vindex = bytes.readUnsignedByte();
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `classesToVerify` from instance context
in `src/main/java/org/apache/bcel/verifier/VerifyDialog.java`
#### Snippet
```java
                    @Override
                    public void windowClosing(final WindowEvent e) {
                        classesToVerify--;
                        if (classesToVerify == 0) {
                            System.exit(0);
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `created` from instance context
in `src/main/java/org/apache/bcel/classfile/ConstantUtf8.java`
#### Snippet
```java
        super(Const.CONSTANT_Utf8);
        value = dataInput.readUTF();
        created++;
    }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `created` from instance context
in `src/main/java/org/apache/bcel/classfile/ConstantUtf8.java`
#### Snippet
```java
        super(Const.CONSTANT_Utf8);
        this.value = Objects.requireNonNull(value, "value");
        created++;
    }

```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/bcel/generic/ClassElementValueGen.java`
#### Snippet
```java
        final ConstantUtf8 cu8 = (ConstantUtf8) getConstantPool().getConstant(idx);
        return cu8.getBytes();
        // ConstantClass c = (ConstantClass)getConstantPool().getConstant(idx);
        // ConstantUtf8 utf8 =
        // (ConstantUtf8)getConstantPool().getConstant(c.getNameIndex());
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/bcel/generic/EnumElementValueGen.java`
#### Snippet
```java
    public String getEnumValueString() {
        return ((ConstantUtf8) getConstantPool().getConstant(valueIdx)).getBytes();
        // ConstantString cu8 =
        // (ConstantString)getConstantPool().getConstant(valueIdx);
        // return
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/bcel/generic/EnumElementValueGen.java`
#### Snippet
```java
        final ConstantUtf8 cu8 = (ConstantUtf8) getConstantPool().getConstant(valueIdx);
        return cu8.getBytes();
        // ConstantString cu8 =
        // (ConstantString)getConstantPool().getConstant(valueIdx);
        // return
```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/org/apache/bcel/generic/EnumElementValueGen.java`
#### Snippet
```java
    // here?
    public String getEnumTypeString() {
        // Constant cc = getConstantPool().getConstant(typeIdx);
        // ConstantClass cu8 =
        // (ConstantClass)getConstantPool().getConstant(typeIdx);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/bcel/verifier/exc/VerifierConstraintViolatedException.java`
#### Snippet
```java
 */
public abstract class VerifierConstraintViolatedException extends RuntimeException {
    // /** The name of the offending class that did not pass the verifier. */
    // String name_of_offending_class;

```

### CommentedOutCode
Commented out code (19 lines)
in `src/main/java/org/apache/bcel/util/InstructionFinder.java`
#### Snippet
```java
     * Internal debugging routines.
     */
//    private static final String pattern2string( String pattern ) {
//        return pattern2string(pattern, true);
//    }
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
        final String bootClassPathProp = System.getProperty("sun.boot.class.path");
        final String extDirs = System.getProperty("java.ext.dirs");
        // System.out.println("java.version = " + System.getProperty("java.version"));
        // System.out.println("java.class.path = " + classPathProp);
        // System.out.println("sun.boot.class.path=" + bootClassPathProp);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/bcel/util/CodeHTML.java`
#### Snippet
```java
                bytes.readUnsignedByte(); // Redundant
                bytes.readUnsignedByte(); // Reserved
//                    int nargs = bytes.readUnsignedByte(); // Redundant
//                    int reserved = bytes.readUnsignedByte(); // Reserved
                final ConstantInterfaceMethodref c = constantPool.getConstant(mIndex, Const.CONSTANT_InterfaceMethodref, ConstantInterfaceMethodref.class);
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
                    + "'; Instruction expects a ReferenceType or a ReturnadressType.");
            }
            // if (stacktop instanceof ReferenceType) {
            // referenceTypeIsInitialized(o, (ReferenceType) stacktop);
            // }
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
    public void setFrame(final Frame f) { // TODO could be package-protected?
        this.frame = f;
        // if (singleInstance.mg == null || singleInstance.cpg == null)
        // throw new AssertionViolatedException("Forgot to set important values first.");
    }
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
            // TODO: This can only be checked if using Staerk-et-al's "set of object types" instead of a
            // "wider cast object type" created during verification.
            // if (! (objectref.isAssignmentCompatibleWith(mg.getType())) ) {
            // constraintViolated(o, "Type on stack top which should be returned is a '"+stack().peek()+
            // "' which is not assignment compatible with the return type of this method, '"+mg.getType()+"'.");
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
            constraintViolated(o, "The 'objectref' is not of a ReferenceType or of ReturnaddressType but of " + stack().peek() + ".");
        }
        // if (stack().peek() instanceof ReferenceType) {
        // referenceTypeIsInitialized(o, (ReferenceType) (stack().peek()) );
        // }
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
                    // TODO: This can only be checked when using Staerk-et-al's "set of object types"
                    // instead of a "wider cast object type" created during verification.
                    // if ( ! rFromStack.isAssignmentCompatibleWith(rFromDesc) ) {
                    // constraintViolated(o, "Expecting a '"+fromDesc+"' but found a '"+fromStack+
                    // "' on the stack (which is not assignment compatible).");
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
        // TODO: This can only be checked if we're using Staerk-et-al's "set of object types"
        // instead of "wider cast object types" generated during verification.
        // if ( ! Repository.implementationOf(objref_classname, theInterface) ) {
        // constraintViolated(o, "The 'objref' item '"+objref+"' does not implement '"+theInterface+"' as expected.");
        // }
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
        // It cannot be done using Staerk-et-al's "set of object types" instead of a
        // "wider cast object type", anyway.
        // if (! objectref.isAssignmentCompatibleWith(mg.getReturnType() )) {
        // constraintViolated(o, "The 'objectref' type "+objectref+
        // " at the stack top is not assignment compatible with the return type '"+mg.getReturnType()+"' of the method.");
```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/org/apache/bcel/generic/ElementValuePairGen.java`
#### Snippet
```java
        // Could assert nvp.getNameString() points to the same thing as
        // constantPoolGen.getConstant(nvp.getNameIndex())
        // if
        // (!nvp.getNameString().equals(((ConstantUtf8)constantPoolGen.getConstant(nvp.getNameIndex())).getBytes()))
        // {
```

### CommentedOutCode
Commented out code (9 lines)
in `src/main/java/org/apache/bcel/classfile/ClassParser.java`
#### Snippet
```java
            // System.err.println("WARNING: " + u[i]);
            // Everything should have been read now
            // if(file.available() > 0) {
            // int bytes = file.available();
            // byte[] buf = new byte[bytes];
```

### CommentedOutCode
Commented out code (22 lines)
in `src/main/java/org/apache/bcel/generic/ConstantPoolGen.java`
#### Snippet
```java
                }
            }
//            else if (c == null) { // entries may be null
//                // nothing to do
//            } else if (c instanceof ConstantInteger) {
```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/org/apache/bcel/classfile/DescendingVisitor.java`
#### Snippet
```java
        stack.push(bm);
        bm.accept(visitor);
        // BootstrapMethod[] bms = bm.getBootstrapMethods();
        // for (int i = 0; i < bms.length; i++)
        // {
```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `src/main/java/org/apache/bcel/verifier/statics/LocalVariableInfo.java`
#### Snippet
```java

    /** The types database. KEY: String representing the offset integer. */
    private final Hashtable<String, Type> types = new Hashtable<>();

    /** The names database. KEY: String representing the offset integer. */
```

### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `src/main/java/org/apache/bcel/verifier/statics/LocalVariableInfo.java`
#### Snippet
```java

    /** The types database. KEY: String representing the offset integer. */
    private final Hashtable<String, Type> types = new Hashtable<>();

    /** The names database. KEY: String representing the offset integer. */
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `src/main/java/org/apache/bcel/verifier/statics/LocalVariableInfo.java`
#### Snippet
```java

    /** The names database. KEY: String representing the offset integer. */
    private final Hashtable<String, String> names = new Hashtable<>();

    /**
```

### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `src/main/java/org/apache/bcel/verifier/statics/LocalVariableInfo.java`
#### Snippet
```java

    /** The names database. KEY: String representing the offset integer. */
    private final Hashtable<String, String> names = new Hashtable<>();

    /**
```

### ObsoleteCollection
Obsolete collection type `Vector<>` used
in `src/main/java/org/apache/bcel/verifier/structurals/Pass3bVerifier.java`
#### Snippet
```java
        private final List<InstructionContext> ics = new Vector<>();
        /** The second elements from pairs in the queue. */
        private final List<ArrayList<InstructionContext>> ecs = new Vector<>();

        /**
```

### ObsoleteCollection
Obsolete collection type `Vector<>` used
in `src/main/java/org/apache/bcel/verifier/structurals/Pass3bVerifier.java`
#### Snippet
```java
        // The following two fields together represent the queue.
        /** The first elements from pairs in the queue. */
        private final List<InstructionContext> ics = new Vector<>();
        /** The second elements from pairs in the queue. */
        private final List<ArrayList<InstructionContext>> ecs = new Vector<>();
```

### ObsoleteCollection
Obsolete collection type `Vector` used
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
     */
    public Enumeration<URL> getResources(final String name) {
        final Vector<URL> results = new Vector<>();
        for (final AbstractPathEntry path : paths) {
            URL url;
```

### ObsoleteCollection
Obsolete collection type `Vector<>` used
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
     */
    public Enumeration<URL> getResources(final String name) {
        final Vector<URL> results = new Vector<>();
        for (final AbstractPathEntry path : paths) {
            URL url;
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `src/main/java/org/apache/bcel/util/ClassStack.java`
#### Snippet
```java
public class ClassStack {

    private final Stack<JavaClass> stack = new Stack<>();

    public boolean empty() {
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `src/main/java/org/apache/bcel/util/ClassStack.java`
#### Snippet
```java
public class ClassStack {

    private final Stack<JavaClass> stack = new Stack<>();

    public boolean empty() {
```

### ObsoleteCollection
Obsolete collection type `Vector<>` used
in `src/main/java/org/apache/bcel/verifier/VerifierFactory.java`
#### Snippet
```java
     * The VerifierFactoryObserver instances that observe the VerifierFactory.
     */
    private static final List<VerifierFactoryObserver> OBSVERVERS = new Vector<>();

    /**
```

### ObsoleteCollection
Obsolete collection type `Hashtable`> used
in `src/main/java/org/apache/bcel/util/ClassLoader.java`
#### Snippet
```java
    public static final String[] DEFAULT_IGNORED_PACKAGES = {"java.", "javax.", "sun."};

    private final Hashtable<String, Class<?>> classes = new Hashtable<>();
    // Hashtable is synchronized thus thread-safe
    private final String[] ignoredPackages;
```

### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `src/main/java/org/apache/bcel/util/ClassLoader.java`
#### Snippet
```java
    public static final String[] DEFAULT_IGNORED_PACKAGES = {"java.", "javax.", "sun."};

    private final Hashtable<String, Class<?>> classes = new Hashtable<>();
    // Hashtable is synchronized thus thread-safe
    private final String[] ignoredPackages;
```

### ObsoleteCollection
Obsolete collection type `Hashtable` used
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java

        private final Stack<BranchTarget> branchTargets = new Stack<>();
        private final Hashtable<InstructionHandle, BranchTarget> visitedTargets = new Hashtable<>();

        public BranchTarget pop() {
```

### ObsoleteCollection
Obsolete collection type `Hashtable<>` used
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java

        private final Stack<BranchTarget> branchTargets = new Stack<>();
        private final Hashtable<InstructionHandle, BranchTarget> visitedTargets = new Hashtable<>();

        public BranchTarget pop() {
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
    static final class BranchStack {

        private final Stack<BranchTarget> branchTargets = new Stack<>();
        private final Hashtable<InstructionHandle, BranchTarget> visitedTargets = new Hashtable<>();

```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
    static final class BranchStack {

        private final Stack<BranchTarget> branchTargets = new Stack<>();
        private final Hashtable<InstructionHandle, BranchTarget> visitedTargets = new Hashtable<>();

```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `src/main/java/org/apache/bcel/classfile/DescendingVisitor.java`
#### Snippet
```java
    private final Visitor visitor;

    private final Stack<Object> stack = new Stack<>();

    /**
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `src/main/java/org/apache/bcel/classfile/DescendingVisitor.java`
#### Snippet
```java
    private final Visitor visitor;

    private final Stack<Object> stack = new Stack<>();

    /**
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/org/apache/bcel/verifier/structurals/OperandStack.java`
#### Snippet
```java
     */
    @Override
    public Object clone() {
        final OperandStack newstack = new OperandStack(this.maxStack);
        @SuppressWarnings("unchecked") // OK because this.stack is the same type
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/org/apache/bcel/verifier/structurals/LocalVariables.java`
#### Snippet
```java
     */
    @Override
    public Object clone() {
        final LocalVariables lvs = new LocalVariables(locals.length);
        System.arraycopy(this.locals, 0, lvs.locals, 0, locals.length);
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/org/apache/bcel/verifier/structurals/Frame.java`
#### Snippet
```java
     */
    @Override
    protected Object clone() {
        return new Frame(locals.getClone(), stack.getClone());
    }
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java
            return Integer.toString(s.getBytes());
        case PRIMITIVE_BYTE:
            final ConstantInteger b = cpool.getConstantInteger(getIndex());
            return Integer.toString(b.getBytes());
        case PRIMITIVE_CHAR:
            final ConstantInteger ch = cpool.getConstantInteger(getIndex());
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/bcel/util/CodeHTML.java`
#### Snippet
```java
         */
        case Const.ANEWARRAY:
            index = bytes.readShort();
            buf.append(constantHtml.referenceConstant(index));
            break;
        /*
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/bcel/generic/SimpleElementValueGen.java`
#### Snippet
```java
            return Float.toString(f.getBytes());
        case PRIMITIVE_SHORT:
            final ConstantInteger s = (ConstantInteger) getConstantPool().getConstant(idx);
            return Integer.toString(s.getBytes());
        case PRIMITIVE_BYTE:
            final ConstantInteger b = (ConstantInteger) getConstantPool().getConstant(idx);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/bcel/generic/SimpleElementValueGen.java`
#### Snippet
```java
            return Integer.toString(s.getBytes());
        case PRIMITIVE_BYTE:
            final ConstantInteger b = (ConstantInteger) getConstantPool().getConstant(idx);
            return Integer.toString(b.getBytes());
        case PRIMITIVE_CHAR:
            final ConstantInteger ch = (ConstantInteger) getConstantPool().getConstant(idx);
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `src/main/java/org/apache/bcel/generic/SimpleElementValueGen.java`
#### Snippet
```java
            return Integer.toString(b.getBytes());
        case PRIMITIVE_CHAR:
            final ConstantInteger ch = (ConstantInteger) getConstantPool().getConstant(idx);
            return Integer.toString(ch.getBytes());
        case PRIMITIVE_BOOLEAN:
            final ConstantInteger bo = (ConstantInteger) getConstantPool().getConstant(idx);
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `src/main/java/org/apache/bcel/classfile/ElementValuePair.java`
#### Snippet
```java

    public String toShortString() {
        final StringBuilder result = new StringBuilder();
        result.append(getNameString()).append("=").append(getValue().toShortString());
        return result.toString();
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/bcel/generic/BranchInstruction.java`
#### Snippet
```java
                    // the instruction located there.
                    // t = target.getInstruction().toString(false); // Avoid circles
                    t = "" + target.getPosition();
                }
            } else {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/bcel/generic/BranchInstruction.java`
#### Snippet
```java
                // index = getTargetOffset(); crashes if positions haven't been set
                // t = "" + (index + position);
                t = "" + index;
            }
        }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/bcel/util/Class2HTML.java`
#### Snippet
```java
                if (argv[i].equals("-d")) { // Specify target directory, default '.'
                    dir = argv[++i];
                    if (!dir.endsWith("" + sep)) {
                        dir = dir + sep;
                    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/bcel/util/CodeHTML.java`
#### Snippet
```java
                        anchor2 = "<A NAME=code" + methodNumber + "@" + code.length + ">" + offset + "</A>";
                    } else {
                        anchor2 = "" + offset;
                    }
                    printWriter.println("<TR VALIGN=TOP><TD>" + anchor2 + "</TD><TD>" + anchor + str + "</TR>");
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Integer`
in `src/main/java/org/apache/bcel/generic/Type.java`
#### Snippet
```java
    }

    private static void wrap(final ThreadLocal<Integer> tl, final int value) {
        tl.set(Integer.valueOf(value));
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
    public static final ClassPath SYSTEM_CLASS_PATH = new ClassPath(getClassPath());

    private static void addJdkModules(final String javaHome, final List<String> list) {
        String modulesPath = System.getProperty("java.modules.path");
        if (modulesPath == null || modulesPath.trim().isEmpty()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
    }

    private static void getPathComponents(final String path, final List<String> list) {
        if (path != null) {
            final StringTokenizer tokenizer = new StringTokenizer(path, File.pathSeparator);
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/bcel/generic/ConstantPoolGen.java`
#### Snippet
```java
    }

    private int computeIfAbsent(final Map<String, Integer> map, final String key, final int value) {
        return map.computeIfAbsent(key, k -> Integer.valueOf(value));
    }
```

### BoundedWildcard
Can generalize to `? super Integer`
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
    }

    private static void wrap(final ThreadLocal<Integer> tl, final int value) {
        tl.set(Integer.valueOf(value));
    }
```

### BoundedWildcard
Can generalize to `? super Integer`
in `src/main/java/org/apache/bcel/verifier/structurals/Subroutines.java`
#### Snippet
```java
     * @throws StructuralCodeConstraintException if the above constraint is not satisfied.
     */
    private void noRecursiveCalls(final Subroutine sub, final Set<Integer> set) {
        final Subroutine[] subs = sub.subSubs();

```

### BoundedWildcard
Can generalize to `? super Integer`
in `src/main/java/org/apache/bcel/verifier/structurals/Subroutines.java`
#### Snippet
```java
         * @see #getRecursivelyAccessedLocalsIndices()
         */
        private void getRecursivelyAccessedLocalsIndicesHelper(final Set<Integer> set, final Subroutine[] subs) {
            for (final Subroutine sub : subs) {
                final int[] lvs = sub.getAccessedLocalsIndices();
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `NameSignatureInstruction` has no concrete subclass
in `src/main/java/org/apache/bcel/generic/NameSignatureInstruction.java`
#### Snippet
```java
 * @since 6.0
 */
public abstract class NameSignatureInstruction extends CPInstruction {

    public NameSignatureInstruction() {
```

### AbstractClassNeverImplemented
Abstract class `NativeVerifier` has no concrete subclass
in `src/main/java/org/apache/bcel/verifier/NativeVerifier.java`
#### Snippet
```java
 * runs between the JVM-internal verifier and JustIce.
 */
public abstract class NativeVerifier {

    /**
```

### AbstractClassNeverImplemented
Abstract class `Repository` has no concrete subclass
in `src/main/java/org/apache/bcel/Repository.java`
#### Snippet
```java
 * @see SyntheticRepository
 */
public abstract class Repository {

    private static org.apache.bcel.util.Repository repository = SyntheticRepository.getInstance();
```

### AbstractClassNeverImplemented
Abstract class `Utility` has no concrete subclass
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
 */
// @since 6.0 methods are no longer final
public abstract class Utility {

    /**
```

## RuleId[id=ThrowablePrintedToSystemOut]
### ThrowablePrintedToSystemOut
'Throwable' argument `e` to 'System.err.println()' call
in `src/main/java/org/apache/bcel/generic/InstructionList.java`
#### Snippet
```java
            out.flush();
        } catch (final IOException e) {
            System.err.println(e);
            return ArrayUtils.EMPTY_BYTE_ARRAY;
        }
```

### ThrowablePrintedToSystemOut
'Throwable' argument `eiie` to 'System.out.println()' call
in `src/main/java/org/apache/bcel/verifier/NativeVerifier.java`
#### Snippet
```java
        } catch (final ExceptionInInitializerError eiie) { // subclass of LinkageError!
            System.out.println("NativeVerifier: ExceptionInInitializerError encountered on '" + args[0] + "'.");
            System.out.println(eiie);
            System.exit(1);
        } catch (final LinkageError le) {
```

### ThrowablePrintedToSystemOut
'Throwable' argument `le` to 'System.out.println()' call
in `src/main/java/org/apache/bcel/verifier/NativeVerifier.java`
#### Snippet
```java
        } catch (final LinkageError le) {
            System.out.println("NativeVerifier: LinkageError encountered on '" + args[0] + "'.");
            System.out.println(le);
            System.exit(1);
        } catch (final ClassNotFoundException cnfe) {
```

### ThrowablePrintedToSystemOut
'Throwable' argument `e` to 'System.err.println()' call
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
            }
        } catch (final StringIndexOutOfBoundsException e) { // Should not occur
            System.err.println(e);
        }
        return str;
```

### ThrowablePrintedToSystemOut
'Throwable' argument `e` to 'System.err.println()' call
in `src/main/java/org/apache/bcel/generic/Instruction.java`
#### Snippet
```java
                i = (Instruction) clone();
            } catch (final CloneNotSupportedException e) {
                System.err.println(e);
            }
        }
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
        case Const.T_BOOLEAN:
        case Const.T_SHORT:
            return super.getConstantPool().addInteger(((Integer) value).intValue());
        case Const.T_FLOAT:
            return super.getConstantPool().addFloat(((Float) value).floatValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
            return super.getConstantPool().addInteger(((Integer) value).intValue());
        case Const.T_FLOAT:
            return super.getConstantPool().addFloat(((Float) value).floatValue());
        case Const.T_DOUBLE:
            return super.getConstantPool().addDouble(((Double) value).doubleValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
            return super.getConstantPool().addFloat(((Float) value).floatValue());
        case Const.T_DOUBLE:
            return super.getConstantPool().addDouble(((Double) value).doubleValue());
        case Const.T_LONG:
            return super.getConstantPool().addLong(((Long) value).longValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
            return super.getConstantPool().addDouble(((Double) value).doubleValue());
        case Const.T_LONG:
            return super.getConstantPool().addLong(((Long) value).longValue());
        case Const.T_REFERENCE:
            return super.getConstantPool().addString((String) value);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/bcel/generic/Type.java`
#### Snippet
```java

    private static int unwrap(final ThreadLocal<Integer> tl) {
        return tl.get().intValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/bcel/util/BCELFactory.java`
#### Snippet
```java
            embed = '"' + Utility.convertString(embed) + '"';
        } else if (value instanceof Character) {
            embed = "(char)0x" + Integer.toHexString(((Character) value).charValue());
        } else if (value instanceof Float) {
            final Float f = (Float) value;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/bcel/classfile/ConstantUtf8.java`
#### Snippet
```java

        private static final boolean BCEL_STATISTICS = Boolean.getBoolean(SYS_PROP_STATISTICS);
        private static final int MAX_ENTRIES = Integer.getInteger(SYS_PROP_CACHE_MAX_ENTRIES, 0).intValue();
        private static final int INITIAL_CAPACITY = (int) (MAX_ENTRIES / 0.75);

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/bcel/classfile/ConstantUtf8.java`
#### Snippet
```java

        // Set the size to 0 or below to skip caching entirely
        private static final int MAX_ENTRY_SIZE = Integer.getInteger(SYS_PROP_CACHE_MAX_ENTRY_SIZE, 200).intValue();

        static boolean isEnabled() {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/bcel/generic/ConstantPoolGen.java`
#### Snippet
```java

    private int toIndex(final Integer index) {
        return index != null ? index.intValue() : -1;
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java

    private static int unwrap(final ThreadLocal<Integer> tl) {
        return tl.get().intValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/bcel/verifier/structurals/Subroutines.java`
#### Snippet
```java
            for (final Integer index : s) {
                j++;
                ret[j] = index.intValue();
            }
            return ret;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/bcel/verifier/structurals/Subroutines.java`
#### Snippet
```java
                for (final Integer accessedLocal : acc) {
                    j++;
                    ret[j] = accessedLocal.intValue();
                }
                return ret;
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `ClassLoader` is the same as one of its superclass' names
in `src/main/java/org/apache/bcel/util/ClassLoader.java`
#### Snippet
```java
 */
@Deprecated
public class ClassLoader extends java.lang.ClassLoader {

    private static final String BCEL_TOKEN = "$$BCEL$$";
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `visitModuleOpens()` is identical to its super method
in `src/main/java/org/apache/bcel/classfile/EmptyVisitor.java`
#### Snippet
```java
    /** @since 6.4.0 */
    @Override
    public void visitModuleOpens(final ModuleOpens obj) {
    }

```

### RedundantMethodOverride
Method `visitModuleMainClass()` is identical to its super method
in `src/main/java/org/apache/bcel/classfile/EmptyVisitor.java`
#### Snippet
```java
    /** @since 6.4.0 */
    @Override
    public void visitModuleMainClass(final ModuleMainClass obj) {
    }

```

### RedundantMethodOverride
Method `visitModule()` is identical to its super method
in `src/main/java/org/apache/bcel/classfile/EmptyVisitor.java`
#### Snippet
```java
    /** @since 6.4.0 */
    @Override
    public void visitModule(final Module obj) {
    }

```

### RedundantMethodOverride
Method `visitModuleRequires()` is identical to its super method
in `src/main/java/org/apache/bcel/classfile/EmptyVisitor.java`
#### Snippet
```java
    /** @since 6.4.0 */
    @Override
    public void visitModuleRequires(final ModuleRequires obj) {
    }

```

### RedundantMethodOverride
Method `visitMethodParameter()` is identical to its super method
in `src/main/java/org/apache/bcel/classfile/EmptyVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitMethodParameter(final MethodParameter obj) {
    }

```

### RedundantMethodOverride
Method `visitModuleExports()` is identical to its super method
in `src/main/java/org/apache/bcel/classfile/EmptyVisitor.java`
#### Snippet
```java
    /** @since 6.4.0 */
    @Override
    public void visitModuleExports(final ModuleExports obj) {
    }

```

### RedundantMethodOverride
Method `visitConstantDynamic()` is identical to its super method
in `src/main/java/org/apache/bcel/classfile/EmptyVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitConstantDynamic(final ConstantDynamic obj) {
    }

```

### RedundantMethodOverride
Method `visitNestMembers()` is identical to its super method
in `src/main/java/org/apache/bcel/classfile/EmptyVisitor.java`
#### Snippet
```java
    /** @since 6.4.0 */
    @Override
    public void visitNestMembers(final NestMembers obj) {
    }

```

### RedundantMethodOverride
Method `visitNestHost()` is identical to its super method
in `src/main/java/org/apache/bcel/classfile/EmptyVisitor.java`
#### Snippet
```java
    /** @since 6.4.0 */
    @Override
    public void visitNestHost(final NestHost obj) {
    }

```

### RedundantMethodOverride
Method `visitModuleProvides()` is identical to its super method
in `src/main/java/org/apache/bcel/classfile/EmptyVisitor.java`
#### Snippet
```java
    /** @since 6.4.0 */
    @Override
    public void visitModuleProvides(final ModuleProvides obj) {
    }

```

### RedundantMethodOverride
Method `visitModulePackages()` is identical to its super method
in `src/main/java/org/apache/bcel/classfile/EmptyVisitor.java`
#### Snippet
```java
    /** @since 6.4.0 */
    @Override
    public void visitModulePackages(final ModulePackages obj) {
    }

```

### RedundantMethodOverride
Method `clone()` only delegates to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/GenericArray.java`
#### Snippet
```java

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
```

### RedundantMethodOverride
Method `visitTABLESWITCH()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/statics/Pass3aVerifier.java`
#### Snippet
```java
        /** Checks if the constraints of operands of the said instruction(s) are satisfied. */
        @Override
        public void visitTABLESWITCH(final TABLESWITCH o) {
            // "high" must be >= "low". We cannot check this, as BCEL hides
            // it from us.
```

### RedundantMethodOverride
Method `visitACONST_NULL()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitACONST_NULL(final ACONST_NULL o) {
        // Nothing needs to be done here.
    }
```

### RedundantMethodOverride
Method `visitGOTO()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitGOTO(final GOTO o) {
        // nothing to do here.
    }
```

### RedundantMethodOverride
Method `visitDSTORE()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitDSTORE(final DSTORE o) {
        // visitStoreInstruction(StoreInstruction) is called before.

```

### RedundantMethodOverride
Method `visitALOAD()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitALOAD(final ALOAD o) {
        // visitLoadInstruction(LoadInstruction) is called before.

```

### RedundantMethodOverride
Method `visitILOAD()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitILOAD(final ILOAD o) {
        // All done by visitLocalVariableInstruction(), visitLoadInstruction()
    }
```

### RedundantMethodOverride
Method `visitInvokeInstruction()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitInvokeInstruction(final InvokeInstruction o) {
        // visitLoadClass(o) has been called before: Every FieldOrMethod
        // implements LoadClass.
```

### RedundantMethodOverride
Method `visitLSTORE()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitLSTORE(final LSTORE o) {
        // visitStoreInstruction(StoreInstruction) is called before.

```

### RedundantMethodOverride
Method `visitISTORE()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitISTORE(final ISTORE o) {
        // visitStoreInstruction(StoreInstruction) is called before.

```

### RedundantMethodOverride
Method `visitBIPUSH()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitBIPUSH(final BIPUSH o) {
        // Nothing to do...
    }
```

### RedundantMethodOverride
Method `visitLLOAD()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitLLOAD(final LLOAD o) {
        // visitLoadInstruction(LoadInstruction) is called before.

```

### RedundantMethodOverride
Method `visitJSR_W()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitJSR_W(final JSR_W o) {
        // nothing to do here.
    }
```

### RedundantMethodOverride
Method `visitGOTO_W()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitGOTO_W(final GOTO_W o) {
        // nothing to do here.
    }
```

### RedundantMethodOverride
Method `visitFCONST()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitFCONST(final FCONST o) {
        // nothing to do here.
    }
```

### RedundantMethodOverride
Method `visitJSR()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitJSR(final JSR o) {
        // nothing to do here.
    }
```

### RedundantMethodOverride
Method `visitNOP()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitNOP(final NOP o) {
        // nothing is to be done here.
    }
```

### RedundantMethodOverride
Method `visitLCONST()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitLCONST(final LCONST o) {
        // Nothing to do here.
    }
```

### RedundantMethodOverride
Method `visitDLOAD()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitDLOAD(final DLOAD o) {
        // visitLoadInstruction(LoadInstruction) is called before.

```

### RedundantMethodOverride
Method `visitFSTORE()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitFSTORE(final FSTORE o) {
        // visitStoreInstruction(StoreInstruction) is called before.

```

### RedundantMethodOverride
Method `visitDCONST()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitDCONST(final DCONST o) {
        // There's nothing to be done here.
    }
```

### RedundantMethodOverride
Method `visitGETSTATIC()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitGETSTATIC(final GETSTATIC o) {
        // Field must be static: see Pass 3a.
    }
```

### RedundantMethodOverride
Method `visitSIPUSH()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitSIPUSH(final SIPUSH o) {
        // nothing to do here. Generic visitXXX() methods did the trick before.
    }
```

### RedundantMethodOverride
Method `visitICONST()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitICONST(final ICONST o) {
        // nothing to do here.
    }
```

### RedundantMethodOverride
Method `visitFLOAD()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitFLOAD(final FLOAD o) {
        // visitLoadInstruction(LoadInstruction) is called before.

```

### RedundantMethodOverride
Method `visitLocalVariableTable()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java

        @Override
        public void visitLocalVariableTable(final LocalVariableTable obj) {// vmspec2 4.7.9
            // In JustIce,this check is partially delayed to Pass 3a.
            // The other part can be found in the visitCode(Code) method.
```

### RedundantMethodOverride
Method `visitInnerClass()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java

        @Override
        public void visitInnerClass(final InnerClass obj) {
            // This does not represent an Attribute but is only
            // related to internal BCEL data representation.
```

### RedundantMethodOverride
Method `visitLineNumber()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java

        @Override
        public void visitLineNumber(final LineNumber obj) {
            // This does not represent an Attribute but is only
            // related to internal BCEL data representation.
```

### RedundantMethodOverride
Method `visitLocalVariable()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java
        //////////
        @Override
        public void visitLocalVariable(final LocalVariable obj) {
            // This does not represent an Attribute but is only
            // related to internal BCEL data representation.
```

### RedundantMethodOverride
Method `visitCodeException()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java

        @Override
        public void visitCodeException(final CodeException obj) {
            // Code constraints are checked in Pass3 (3a and 3b).
            // This does not represent an Attribute but is only
```

### RedundantMethodOverride
Method `visitConstantPool()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java

        @Override
        public void visitConstantPool(final ConstantPool obj) {
            // No need to. We're piggybacked by the DescendingVisitor.
            // This does not represent an Attribute but is only
```

### RedundantMethodOverride
Method `visitGOTO_W()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/ExecutionVisitor.java`
#### Snippet
```java
    /** Symbolically executes the corresponding Java Virtual Machine instruction. */
    @Override
    public void visitGOTO_W(final GOTO_W o) {
        // no stack changes.
    }
```

### RedundantMethodOverride
Method `visitGOTO()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/ExecutionVisitor.java`
#### Snippet
```java
    /** Symbolically executes the corresponding Java Virtual Machine instruction. */
    @Override
    public void visitGOTO(final GOTO o) {
        // no stack changes.
    }
```

### RedundantMethodOverride
Method `visitNOP()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/ExecutionVisitor.java`
#### Snippet
```java
    /** Symbolically executes the corresponding Java Virtual Machine instruction. */
    @Override
    public void visitNOP(final NOP o) {
    }

```

### RedundantMethodOverride
Method `visitRETURN()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/ExecutionVisitor.java`
#### Snippet
```java
    /** Symbolically executes the corresponding Java Virtual Machine instruction. */
    @Override
    public void visitRETURN(final RETURN o) {
        // do nothing.
    }
```

### RedundantMethodOverride
Method `visitIINC()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/ExecutionVisitor.java`
#### Snippet
```java
    /** Symbolically executes the corresponding Java Virtual Machine instruction. */
    @Override
    public void visitIINC(final IINC o) {
        // stack is not changed.
    }
```

### RedundantMethodOverride
Method `visitRET()` is identical to its super method
in `src/main/java/org/apache/bcel/verifier/structurals/ExecutionVisitor.java`
#### Snippet
```java
    /** Symbolically executes the corresponding Java Virtual Machine instruction. */
    @Override
    public void visitRET(final RET o) {
        // do nothing, return address
        // is in the local variables.
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IF_ICMPGE.java`
#### Snippet
```java
    @Override
    public IfInstruction negate() {
        return new IF_ICMPLT(super.getTarget());
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/INVOKESTATIC.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream out) throws IOException {
        out.writeByte(super.getOpcode());
        out.writeShort(super.getIndex());
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/INVOKESTATIC.java`
#### Snippet
```java
    public void dump(final DataOutputStream out) throws IOException {
        out.writeByte(super.getOpcode());
        out.writeShort(super.getIndex());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FCONST.java`
#### Snippet
```java
        super(org.apache.bcel.Const.FCONST_0, (short) 1);
        if (f == 0.0) {
            super.setOpcode(org.apache.bcel.Const.FCONST_0);
        } else if (f == 1.0) {
            super.setOpcode(org.apache.bcel.Const.FCONST_1);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FCONST.java`
#### Snippet
```java
            super.setOpcode(org.apache.bcel.Const.FCONST_0);
        } else if (f == 1.0) {
            super.setOpcode(org.apache.bcel.Const.FCONST_1);
        } else if (f == 2.0) {
            super.setOpcode(org.apache.bcel.Const.FCONST_2);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FCONST.java`
#### Snippet
```java
            super.setOpcode(org.apache.bcel.Const.FCONST_1);
        } else if (f == 2.0) {
            super.setOpcode(org.apache.bcel.Const.FCONST_2);
        } else {
            throw new ClassGenException("FCONST can be used only for 0.0, 1.0 and 2.0: " + f);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ConstantInteger.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream file) throws IOException {
        file.writeByte(super.getTag());
        file.writeInt(bytes);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IFLT.java`
#### Snippet
```java
    @Override
    public IfInstruction negate() {
        return new IFGE(super.getTarget());
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ConstantCP.java`
#### Snippet
```java
    @Override
    public final void dump(final DataOutputStream file) throws IOException {
        file.writeByte(super.getTag());
        file.writeShort(class_index);
        file.writeShort(name_and_type_index);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/SIPUSH.java`
#### Snippet
```java
    @Override
    protected void initFromFile(final ByteSequence bytes, final boolean wide) throws IOException {
        super.setLength(3);
        b = bytes.readShort();
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/FieldOrMethod.java`
#### Snippet
```java
     */
    public final void dump(final DataOutputStream file) throws IOException {
        file.writeShort(super.getAccessFlags());
        file.writeShort(name_index);
        file.writeShort(signature_index);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Module.java`
#### Snippet
```java
    @Override
    public String toString() {
        final ConstantPool cp = super.getConstantPool();
        final StringBuilder buf = new StringBuilder();
        buf.append("Module:\n");
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ConstantLong.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream file) throws IOException {
        file.writeByte(super.getTag());
        file.writeLong(bytes);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/EnclosingMethod.java`
#### Snippet
```java

    public final ConstantClass getEnclosingClass() {
        return super.getConstantPool().getConstant(classIndex, Const.CONSTANT_Class, ConstantClass.class);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/EnclosingMethod.java`
#### Snippet
```java
            return null;
        }
        return super.getConstantPool().getConstant(methodIndex, Const.CONSTANT_NameAndType, ConstantNameAndType.class);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IFGT.java`
#### Snippet
```java
    @Override
    public IfInstruction negate() {
        return new IFLE(super.getTarget());
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/AnnotationElementValueGen.java`
#### Snippet
```java
    @Override
    public ElementValue getElementValue() {
        return new AnnotationElementValue(super.getElementValueType(), a.getAnnotation(), getConstantPool().getConstantPool());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/AnnotationElementValueGen.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream dos) throws IOException {
        dos.writeByte(super.getElementValueType()); // u1 type of value (ANNOTATION == '@')
        a.dump(dos);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LCONST.java`
#### Snippet
```java
        super(org.apache.bcel.Const.LCONST_0, (short) 1);
        if (l == 0) {
            super.setOpcode(org.apache.bcel.Const.LCONST_0);
        } else if (l == 1) {
            super.setOpcode(org.apache.bcel.Const.LCONST_1);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LCONST.java`
#### Snippet
```java
            super.setOpcode(org.apache.bcel.Const.LCONST_0);
        } else if (l == 1) {
            super.setOpcode(org.apache.bcel.Const.LCONST_1);
        } else {
            throw new ClassGenException("LCONST can be used only for 0 and 1: " + l);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ExceptionTable.java`
#### Snippet
```java
        buf.append("Exceptions: ");
        for (int i = 0; i < exceptionIndexTable.length; i++) {
            str = super.getConstantPool().getConstantString(exceptionIndexTable[i], Const.CONSTANT_Class);
            buf.append(Utility.compactClassName(str, false));
            if (i < exceptionIndexTable.length - 1) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ExceptionTable.java`
#### Snippet
```java
    public String[] getExceptionNames() {
        final String[] names = new String[exceptionIndexTable.length];
        Arrays.setAll(names, i -> Utility.pathToPackage(super.getConstantPool().getConstantString(exceptionIndexTable[i], Const.CONSTANT_Class)));
        return names;
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/BootstrapMethods.java`
#### Snippet
```java
            buf.append("  ").append(i).append(": ");
            final int indentCount = buf.length() - start;
            final String[] lines = bootstrapMethods[i].toString(super.getConstantPool()).split("\\r?\\n");
            buf.append(lines[0]);
            for (int j = 1; j < lines.length; j++) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ModulePackages.java`
#### Snippet
```java
    public String[] getPackageNames() {
        final String[] names = new String[packageIndexTable.length];
        Arrays.setAll(names, i -> Utility.pathToPackage(super.getConstantPool().getConstantString(packageIndexTable[i], Const.CONSTANT_Package)));
        return names;
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ModulePackages.java`
#### Snippet
```java
        buf.append("):\n");
        for (final int index : packageIndexTable) {
            final String packageName = super.getConstantPool().getConstantString(index, Const.CONSTANT_Package);
            buf.append("  ").append(Utility.compactClassName(packageName, false)).append("\n");
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IFEQ.java`
#### Snippet
```java
    @Override
    public IfInstruction negate() {
        return new IFNE(super.getTarget());
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LOOKUPSWITCH.java`
#### Snippet
```java
        final short fixedLength = (short) (9 + matchLength * 8);
        setFixedLength(fixedLength);
        final short length = (short) (matchLength + super.getPadding());
        super.setLength(length);
        super.setMatches(new int[matchLength]);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LOOKUPSWITCH.java`
#### Snippet
```java
        setFixedLength(fixedLength);
        final short length = (short) (matchLength + super.getPadding());
        super.setLength(length);
        super.setMatches(new int[matchLength]);
        super.setIndices(new int[matchLength]);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LOOKUPSWITCH.java`
#### Snippet
```java
        final short length = (short) (matchLength + super.getPadding());
        super.setLength(length);
        super.setMatches(new int[matchLength]);
        super.setIndices(new int[matchLength]);
        super.setTargets(new InstructionHandle[matchLength]);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LOOKUPSWITCH.java`
#### Snippet
```java
        super.setLength(length);
        super.setMatches(new int[matchLength]);
        super.setIndices(new int[matchLength]);
        super.setTargets(new InstructionHandle[matchLength]);
        for (int i = 0; i < matchLength; i++) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LOOKUPSWITCH.java`
#### Snippet
```java
        super.setMatches(new int[matchLength]);
        super.setIndices(new int[matchLength]);
        super.setTargets(new InstructionHandle[matchLength]);
        for (int i = 0; i < matchLength; i++) {
            super.setMatch(i, bytes.readInt());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LOOKUPSWITCH.java`
#### Snippet
```java
        super.setTargets(new InstructionHandle[matchLength]);
        for (int i = 0; i < matchLength; i++) {
            super.setMatch(i, bytes.readInt());
            super.setIndices(i, bytes.readInt());
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LOOKUPSWITCH.java`
#### Snippet
```java
        for (int i = 0; i < matchLength; i++) {
            super.setMatch(i, bytes.readInt());
            super.setIndices(i, bytes.readInt());
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LOOKUPSWITCH.java`
#### Snippet
```java
        /* alignment remainder assumed 0 here, until dump time. */
        final short length = (short) (9 + getMatchLength() * 8);
        super.setLength(length);
        setFixedLength(length);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LOOKUPSWITCH.java`
#### Snippet
```java
        out.writeInt(matchLength); // npairs
        for (int i = 0; i < matchLength; i++) {
            out.writeInt(super.getMatch(i)); // match-offset pairs
            out.writeInt(setIndices(i, getTargetOffset(super.getTarget(i))));
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LOOKUPSWITCH.java`
#### Snippet
```java
        for (int i = 0; i < matchLength; i++) {
            out.writeInt(super.getMatch(i)); // match-offset pairs
            out.writeInt(setIndices(i, getTargetOffset(super.getTarget(i))));
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/BranchInstruction.java`
#### Snippet
```java
    @Override
    protected void initFromFile(final ByteSequence bytes, final boolean wide) throws IOException {
        super.setLength(3);
        index = bytes.readShort();
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/BranchInstruction.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream out) throws IOException {
        out.writeByte(super.getOpcode());
        index = getTargetOffset();
        if (!isValidShort(index)) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/INVOKEVIRTUAL.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream out) throws IOException {
        out.writeByte(super.getOpcode());
        out.writeShort(super.getIndex());
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/INVOKEVIRTUAL.java`
#### Snippet
```java
    public void dump(final DataOutputStream out) throws IOException {
        out.writeByte(super.getOpcode());
        out.writeShort(super.getIndex());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
    public Field getField() {
        final String signature = getSignature();
        final int nameIndex = super.getConstantPool().addUtf8(super.getName());
        final int signatureIndex = super.getConstantPool().addUtf8(signature);
        if (value != null) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
    public Field getField() {
        final String signature = getSignature();
        final int nameIndex = super.getConstantPool().addUtf8(super.getName());
        final int signatureIndex = super.getConstantPool().addUtf8(signature);
        if (value != null) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
        final String signature = getSignature();
        final int nameIndex = super.getConstantPool().addUtf8(super.getName());
        final int signatureIndex = super.getConstantPool().addUtf8(signature);
        if (value != null) {
            checkType(super.getType());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
        final int signatureIndex = super.getConstantPool().addUtf8(signature);
        if (value != null) {
            checkType(super.getType());
            final int index = addConstant();
            addAttribute(new ConstantValue(super.getConstantPool().addUtf8("ConstantValue"), 2, index, super.getConstantPool().getConstantPool())); // sic
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
            checkType(super.getType());
            final int index = addConstant();
            addAttribute(new ConstantValue(super.getConstantPool().addUtf8("ConstantValue"), 2, index, super.getConstantPool().getConstantPool())); // sic
        }
        addAnnotationsAsAttribute(super.getConstantPool());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
            checkType(super.getType());
            final int index = addConstant();
            addAttribute(new ConstantValue(super.getConstantPool().addUtf8("ConstantValue"), 2, index, super.getConstantPool().getConstantPool())); // sic
        }
        addAnnotationsAsAttribute(super.getConstantPool());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
            addAttribute(new ConstantValue(super.getConstantPool().addUtf8("ConstantValue"), 2, index, super.getConstantPool().getConstantPool())); // sic
        }
        addAnnotationsAsAttribute(super.getConstantPool());
        return new Field(super.getAccessFlags(), nameIndex, signatureIndex, getAttributes(), super.getConstantPool().getConstantPool()); // sic
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
        }
        addAnnotationsAsAttribute(super.getConstantPool());
        return new Field(super.getAccessFlags(), nameIndex, signatureIndex, getAttributes(), super.getConstantPool().getConstantPool()); // sic
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
        }
        addAnnotationsAsAttribute(super.getConstantPool());
        return new Field(super.getAccessFlags(), nameIndex, signatureIndex, getAttributes(), super.getConstantPool().getConstantPool()); // sic
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java

    private void checkType(final Type atype) {
        final Type superType = super.getType();
        if (superType == null) {
            throw new ClassGenException("You haven't defined the type of the field yet");
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java

    private void addAnnotationsAsAttribute(final ConstantPoolGen cp) {
        Stream.of(AnnotationEntryGen.getAnnotationAttributes(cp, super.getAnnotationEntries())).forEach(this::addAttribute);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
        String signature;
        String access; // Short cuts to constant pool
        access = Utility.accessToString(super.getAccessFlags());
        access = access.isEmpty() ? "" : access + " ";
        signature = super.getType().toString();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
        access = Utility.accessToString(super.getAccessFlags());
        access = access.isEmpty() ? "" : access + " ";
        signature = super.getType().toString();
        name = getName();
        final StringBuilder buf = new StringBuilder(32); // CHECKSTYLE IGNORE MagicNumber
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java

    private int addConstant() {
        switch (super.getType().getType()) { // sic
        case Const.T_INT:
        case Const.T_CHAR:
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
        case Const.T_BOOLEAN:
        case Const.T_SHORT:
            return super.getConstantPool().addInteger(((Integer) value).intValue());
        case Const.T_FLOAT:
            return super.getConstantPool().addFloat(((Float) value).floatValue());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
            return super.getConstantPool().addInteger(((Integer) value).intValue());
        case Const.T_FLOAT:
            return super.getConstantPool().addFloat(((Float) value).floatValue());
        case Const.T_DOUBLE:
            return super.getConstantPool().addDouble(((Double) value).doubleValue());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
            return super.getConstantPool().addFloat(((Float) value).floatValue());
        case Const.T_DOUBLE:
            return super.getConstantPool().addDouble(((Double) value).doubleValue());
        case Const.T_LONG:
            return super.getConstantPool().addLong(((Long) value).longValue());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
            return super.getConstantPool().addDouble(((Double) value).doubleValue());
        case Const.T_LONG:
            return super.getConstantPool().addLong(((Long) value).longValue());
        case Const.T_REFERENCE:
            return super.getConstantPool().addString((String) value);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
            return super.getConstantPool().addLong(((Long) value).longValue());
        case Const.T_REFERENCE:
            return super.getConstantPool().addString((String) value);
        default:
            throw new IllegalStateException("Unhandled : " + super.getType().getType()); // sic
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
            return super.getConstantPool().addString((String) value);
        default:
            throw new IllegalStateException("Unhandled : " + super.getType().getType()); // sic
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java

    private void setValue(final int index) {
        final ConstantPool cp = super.getConstantPool().getConstantPool();
        final Constant c = cp.getConstant(index);
        value = ((ConstantObject) c).getConstantValue(cp);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
    @Override
    public String getSignature() {
        return super.getType().getSignature();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/AnnotationElementValue.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream dos) throws IOException {
        dos.writeByte(super.getType()); // u1 type of value (ANNOTATION == '@')
        annotationEntry.dump(dos);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/ClassElementValueGen.java`
#### Snippet
```java
    @Override
    public ElementValue getElementValue() {
        return new ClassElementValue(super.getElementValueType(), idx, getConstantPool().getConstantPool());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/ClassElementValueGen.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream dos) throws IOException {
        dos.writeByte(super.getElementValueType()); // u1 kind of value
        dos.writeShort(idx);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java

    public final boolean isSuper() {
        return (super.getAccessFlags() & Const.ACC_SUPER) != 0;
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java
    @Override
    public String toString() {
        String access = Utility.accessToString(super.getAccessFlags(), true);
        access = access.isEmpty() ? "" : access + " ";
        final StringBuilder buf = new StringBuilder(128);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java
        access = access.isEmpty() ? "" : access + " ";
        final StringBuilder buf = new StringBuilder(128);
        buf.append(access).append(Utility.classOrInterface(super.getAccessFlags())).append(" ").append(className).append(" extends ")
            .append(Utility.compactClassName(superclassName, false)).append('\n');
        final int size = interfaces.length;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java
        buf.append("compiled from\t\t").append(sourceFileName).append('\n');
        buf.append("compiler version\t").append(major).append(".").append(minor).append('\n');
        buf.append("access flags\t\t").append(super.getAccessFlags()).append('\n');
        buf.append("constant pool\t\t").append(constantPool.getLength()).append(" entries\n");
        buf.append("ACC_SUPER flag\t\t").append(isSuper()).append("\n");
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java

    public final boolean isClass() {
        return (super.getAccessFlags() & Const.ACC_INTERFACE) == 0;
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java
        file.writeShort(major);
        constantPool.dump(file);
        file.writeShort(super.getAccessFlags());
        file.writeShort(classNameIndex);
        file.writeShort(superclassNameIndex);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ConstantInvokeDynamic.java`
#### Snippet
```java
     */
    public int getBootstrapMethodAttrIndex() {
        return super.getClassIndex(); // AKA bootstrap_method_attr_index
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/RET.java`
#### Snippet
```java
            out.writeByte(org.apache.bcel.Const.WIDE);
        }
        out.writeByte(super.getOpcode());
        if (wide) {
            out.writeShort(index);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/RET.java`
#### Snippet
```java
        if (wide) {
            index = bytes.readUnsignedShort();
            super.setLength(4);
        } else {
            index = bytes.readUnsignedByte();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/RET.java`
#### Snippet
```java
        } else {
            index = bytes.readUnsignedByte();
            super.setLength(2);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/RET.java`
#### Snippet
```java
        wide = index > org.apache.bcel.Const.MAX_BYTE;
        if (wide) {
            super.setLength(4); // Including the wide byte
        } else {
            super.setLength(2);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/RET.java`
#### Snippet
```java
            super.setLength(4); // Including the wide byte
        } else {
            super.setLength(2);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/ArrayType.java`
#### Snippet
```java
        }
        buf.append(basicType.getSignature());
        super.setSignature(buf.toString());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ConstantModule.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream file) throws IOException {
        file.writeByte(super.getTag());
        file.writeShort(nameIndex);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Deprecated.java`
#### Snippet
```java
    public void dump(final DataOutputStream file) throws IOException {
        super.dump(file);
        if (super.getLength() > 0) {
            file.write(bytes, 0, super.getLength());
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Deprecated.java`
#### Snippet
```java
        super.dump(file);
        if (super.getLength() > 0) {
            file.write(bytes, 0, super.getLength());
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SourceFile.java`
#### Snippet
```java
     */
    public String getSourceFileName() {
        return super.getConstantPool().getConstantUtf8(sourceFileIndex).getBytes();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/EnumElementValueGen.java`
#### Snippet
```java
    public ElementValue getElementValue() {
        System.err.println("Duplicating value: " + getEnumTypeString() + ":" + getEnumValueString());
        return new EnumElementValue(super.getElementValueType(), typeIdx, valueIdx, getConstantPool().getConstantPool());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/EnumElementValueGen.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream dos) throws IOException {
        dos.writeByte(super.getElementValueType()); // u1 type of value (ENUM_CONSTANT == 'e')
        dos.writeShort(typeIdx); // u2
        dos.writeShort(valueIdx); // u2
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/EnumElementValueGen.java`
#### Snippet
```java
    protected EnumElementValueGen(final int typeIdx, final int valueIdx, final ConstantPoolGen cpool) {
        super(ElementValueGen.ENUM_CONSTANT, cpool);
        if (super.getElementValueType() != ENUM_CONSTANT) {
            throw new IllegalArgumentException("Only element values of type enum can be built with this ctor - type specified: " + super.getElementValueType());
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/EnumElementValueGen.java`
#### Snippet
```java
        super(ElementValueGen.ENUM_CONSTANT, cpool);
        if (super.getElementValueType() != ENUM_CONSTANT) {
            throw new IllegalArgumentException("Only element values of type enum can be built with this ctor - type specified: " + super.getElementValueType());
        }
        this.typeIdx = typeIdx;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java

    public long getValueLong() {
        if (super.getType() != PRIMITIVE_LONG) {
            throw new IllegalStateException("Don't call getValueLong() on a non LONG ElementValue");
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java
            throw new IllegalStateException("Don't call getValueLong() on a non LONG ElementValue");
        }
        final ConstantLong j = (ConstantLong) super.getConstantPool().getConstant(getIndex());
        return j.getBytes();
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java

    public char getValueChar() {
        if (super.getType() != PRIMITIVE_CHAR) {
            throw new IllegalStateException("Don't call getValueChar() on a non CHAR ElementValue");
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java
            throw new IllegalStateException("Don't call getValueChar() on a non CHAR ElementValue");
        }
        return (char) super.getConstantPool().getConstantInteger(getIndex()).getBytes();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream dos) throws IOException {
        final int type = super.getType();
        dos.writeByte(type); // u1 kind of value
        switch (type) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java

    public byte getValueByte() {
        if (super.getType() != PRIMITIVE_BYTE) {
            throw new IllegalStateException("Don't call getValueByte() on a non BYTE ElementValue");
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java
            throw new IllegalStateException("Don't call getValueByte() on a non BYTE ElementValue");
        }
        return (byte) super.getConstantPool().getConstantInteger(getIndex()).getBytes();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java
    @Override
    public String stringifyValue() {
        final ConstantPool cpool = super.getConstantPool();
        final int type = super.getType();
        switch (type) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java
    public String stringifyValue() {
        final ConstantPool cpool = super.getConstantPool();
        final int type = super.getType();
        switch (type) {
        case PRIMITIVE_INT:
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java

    public String getValueString() {
        if (super.getType() != STRING) {
            throw new IllegalStateException("Don't call getValueString() on a non STRING ElementValue");
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java
            throw new IllegalStateException("Don't call getValueString() on a non STRING ElementValue");
        }
        return super.getConstantPool().getConstantUtf8(getIndex()).getBytes();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java

    public int getValueInt() {
        if (super.getType() != PRIMITIVE_INT) {
            throw new IllegalStateException("Don't call getValueInt() on a non INT ElementValue");
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java
            throw new IllegalStateException("Don't call getValueInt() on a non INT ElementValue");
        }
        return super.getConstantPool().getConstantInteger(getIndex()).getBytes();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java

    public double getValueDouble() {
        if (super.getType() != PRIMITIVE_DOUBLE) {
            throw new IllegalStateException("Don't call getValueDouble() on a non DOUBLE ElementValue");
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java
            throw new IllegalStateException("Don't call getValueDouble() on a non DOUBLE ElementValue");
        }
        final ConstantDouble d = (ConstantDouble) super.getConstantPool().getConstant(getIndex());
        return d.getBytes();
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java

    public short getValueShort() {
        if (super.getType() != PRIMITIVE_SHORT) {
            throw new IllegalStateException("Don't call getValueShort() on a non SHORT ElementValue");
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java
            throw new IllegalStateException("Don't call getValueShort() on a non SHORT ElementValue");
        }
        final ConstantInteger s = (ConstantInteger) super.getConstantPool().getConstant(getIndex());
        return (short) s.getBytes();
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java

    public boolean getValueBoolean() {
        if (super.getType() != PRIMITIVE_BOOLEAN) {
            throw new IllegalStateException("Don't call getValueBoolean() on a non BOOLEAN ElementValue");
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java
            throw new IllegalStateException("Don't call getValueBoolean() on a non BOOLEAN ElementValue");
        }
        final ConstantInteger bo = (ConstantInteger) super.getConstantPool().getConstant(getIndex());
        return bo.getBytes() != 0;
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java

    public float getValueFloat() {
        if (super.getType() != PRIMITIVE_FLOAT) {
            throw new IllegalStateException("Don't call getValueFloat() on a non FLOAT ElementValue");
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java
            throw new IllegalStateException("Don't call getValueFloat() on a non FLOAT ElementValue");
        }
        final ConstantFloat f = (ConstantFloat) super.getConstantPool().getConstant(getIndex());
        return f.getBytes();
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Code.java`
#### Snippet
```java
    public void setExceptionTable(final CodeException[] exceptionTable) {
        this.exceptionTable = exceptionTable != null ? exceptionTable : CodeException.EMPTY_CODE_EXCEPTION_ARRAY;
        super.setLength(calculateLength()); // Adjust length
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Code.java`
#### Snippet
```java
    public void setCode(final byte[] code) {
        this.code = code != null ? code : ArrayUtils.EMPTY_BYTE_ARRAY;
        super.setLength(calculateLength()); // Adjust length
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Code.java`
#### Snippet
```java
    public void setAttributes(final Attribute[] attributes) {
        this.attributes = attributes != null ? attributes : EMPTY_ARRAY;
        super.setLength(calculateLength()); // Adjust length
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Code.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder(100); // CHECKSTYLE IGNORE MagicNumber
        buf.append("Code(maxStack = ").append(maxStack).append(", maxLocals = ").append(maxLocals).append(", code_length = ").append(code.length).append(")\n")
            .append(Utility.codeToString(code, super.getConstantPool(), 0, -1, verbose));
        if (exceptionTable.length > 0) {
            buf.append("\nException handler(s) = \n").append("From\tTo\tHandler\tType\n");
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Code.java`
#### Snippet
```java
            buf.append("\nException handler(s) = \n").append("From\tTo\tHandler\tType\n");
            for (final CodeException exception : exceptionTable) {
                buf.append(exception.toString(super.getConstantPool(), verbose)).append("\n");
            }
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Code.java`
#### Snippet
```java
        Args.requireU2(this.exceptionTable.length, "exceptionTable.length");
        this.attributes = attributes != null ? attributes : EMPTY_ARRAY;
        super.setLength(calculateLength()); // Adjust length
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Code.java`
#### Snippet
```java
         * attributes into account yet! Very subtle bug, fixed in 3.1.1.
         */
        super.setLength(length);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/ArrayInstruction.java`
#### Snippet
```java
    @Override
    public Type getType(final ConstantPoolGen cp) {
        final short opcode = super.getOpcode();
        switch (opcode) {
        case org.apache.bcel.Const.IALOAD:
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IF_ICMPEQ.java`
#### Snippet
```java
    @Override
    public IfInstruction negate() {
        return new IF_ICMPNE(super.getTarget());
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/PMGClass.java`
#### Snippet
```java
     */
    public String getPMGClassName() {
        return super.getConstantPool().getConstantUtf8(pmgClassIndex).getBytes();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/PMGClass.java`
#### Snippet
```java
     */
    public String getPMGName() {
        return super.getConstantPool().getConstantUtf8(pmgIndex).getBytes();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ArrayElementValue.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream dos) throws IOException {
        dos.writeByte(super.getType()); // u1 type of value (ARRAY == '[')
        dos.writeShort(elementValues.length);
        for (final ElementValue evalue : elementValues) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/NestHost.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        buf.append("NestHost: ");
        final String className = super.getConstantPool().getConstantString(hostClassIndex, Const.CONSTANT_Class);
        buf.append(Utility.compactClassName(className, false));
        return buf.toString();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/GOTO.java`
#### Snippet
```java
        setPosition(getPosition() + offset); // Position may be shifted by preceding expansions
        if (Math.abs(i) >= Short.MAX_VALUE - maxOffset) { // to large for short (estimate)
            super.setOpcode(org.apache.bcel.Const.GOTO_W);
            final short oldLength = (short) super.getLength();
            super.setLength(5);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/GOTO.java`
#### Snippet
```java
        if (Math.abs(i) >= Short.MAX_VALUE - maxOffset) { // to large for short (estimate)
            super.setOpcode(org.apache.bcel.Const.GOTO_W);
            final short oldLength = (short) super.getLength();
            super.setLength(5);
            return super.getLength() - oldLength;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/GOTO.java`
#### Snippet
```java
            super.setOpcode(org.apache.bcel.Const.GOTO_W);
            final short oldLength = (short) super.getLength();
            super.setLength(5);
            return super.getLength() - oldLength;
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/GOTO.java`
#### Snippet
```java
            final short oldLength = (short) super.getLength();
            super.setLength(5);
            return super.getLength() - oldLength;
        }
        return 0;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/GOTO.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream out) throws IOException {
        super.setIndex(getTargetOffset());
        final short opcode = getOpcode();
        if (opcode == org.apache.bcel.Const.GOTO) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/GOTO.java`
#### Snippet
```java
            super.dump(out);
        } else { // GOTO_W
            super.setIndex(getTargetOffset());
            out.writeByte(opcode);
            out.writeInt(super.getIndex());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/GOTO.java`
#### Snippet
```java
            super.setIndex(getTargetOffset());
            out.writeByte(opcode);
            out.writeInt(super.getIndex());
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/NameSignatureInstruction.java`
#### Snippet
```java
    public ConstantNameAndType getNameAndType(final ConstantPoolGen cpg) {
        final ConstantPool cp = cpg.getConstantPool();
        final ConstantCP cmr = (ConstantCP) cp.getConstant(super.getIndex());
        return (ConstantNameAndType) cp.getConstant(cmr.getNameAndTypeIndex());
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/Select.java`
#### Snippet
```java
        }
        // Default branch target common for both cases (TABLESWITCH, LOOKUPSWITCH)
        super.setIndex(bytes.readInt());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/Select.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream out) throws IOException {
        out.writeByte(super.getOpcode());
        for (int i = 0; i < padding; i++) {
            out.writeByte(0);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/Select.java`
#### Snippet
```java
            out.writeByte(0);
        }
        super.setIndex(getTargetOffset()); // Write default target offset
        out.writeInt(super.getIndex());
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/Select.java`
#### Snippet
```java
        }
        super.setIndex(getTargetOffset()); // Write default target offset
        out.writeInt(super.getIndex());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/Select.java`
#### Snippet
```java
    protected int updatePosition(final int offset, final int maxOffset) {
        setPosition(getPosition() + offset); // Additional offset caused by preceding SWITCHs, GOTOs, etc.
        final short oldLength = (short) super.getLength();
        /*
         * Alignment on 4-byte-boundary, + 1, because of tag byte.
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/Select.java`
#### Snippet
```java
         */
        padding = (4 - (getPosition() + 1) % 4) % 4;
        super.setLength((short) (fixed_length + padding)); // Update length
        return super.getLength() - oldLength;
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/Select.java`
#### Snippet
```java
        padding = (4 - (getPosition() + 1) % 4) % 4;
        super.setLength((short) (fixed_length + padding)); // Update length
        return super.getLength() - oldLength;
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/Select.java`
#### Snippet
```java
    public void updateTarget(final InstructionHandle oldIh, final InstructionHandle newIh) {
        boolean targeted = false;
        if (super.getTarget() == oldIh) {
            targeted = true;
            setTarget(newIh);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/Select.java`
#### Snippet
```java
    @Override
    public boolean containsTarget(final InstructionHandle ih) {
        if (super.getTarget() == ih) {
            return true;
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/CPInstruction.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream out) throws IOException {
        out.writeByte(super.getOpcode());
        out.writeShort(index);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/CPInstruction.java`
#### Snippet
```java
            str = Utility.packageToPath(str);
        }
        return org.apache.bcel.Const.getOpcodeName(super.getOpcode()) + " " + str;
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/CPInstruction.java`
#### Snippet
```java
    protected void initFromFile(final ByteSequence bytes, final boolean wide) throws IOException {
        setIndex(bytes.readUnsignedShort());
        super.setLength(3);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/ICONST.java`
#### Snippet
```java
            throw new ClassGenException("ICONST can be used only for value between -1 and 5: " + i);
        }
        super.setOpcode((short) (org.apache.bcel.Const.ICONST_0 + i)); // Even works for i == -1
        value = i;
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Synthetic.java`
#### Snippet
```java
    public void dump(final DataOutputStream file) throws IOException {
        super.dump(file);
        if (super.getLength() > 0) {
            file.write(bytes, 0, super.getLength());
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Synthetic.java`
#### Snippet
```java
        super.dump(file);
        if (super.getLength() > 0) {
            file.write(bytes, 0, super.getLength());
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Synthetic.java`
#### Snippet
```java
    public String toString() {
        final StringBuilder buf = new StringBuilder("Synthetic");
        if (super.getLength() > 0) {
            buf.append(" ").append(Utility.toHexString(bytes));
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ConstantDouble.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream file) throws IOException {
        file.writeByte(super.getTag());
        file.writeDouble(bytes);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/INVOKESPECIAL.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream out) throws IOException {
        out.writeByte(super.getOpcode());
        out.writeShort(super.getIndex());
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/INVOKESPECIAL.java`
#### Snippet
```java
    public void dump(final DataOutputStream out) throws IOException {
        out.writeByte(super.getOpcode());
        out.writeShort(super.getIndex());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Method.java`
#### Snippet
```java
     */
    public ExceptionTable getExceptionTable() {
        for (final Attribute attribute : super.getAttributes()) {
            if (attribute instanceof ExceptionTable) {
                return (ExceptionTable) attribute;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Method.java`
#### Snippet
```java
    @Override
    public String toString() {
        final String access = Utility.accessToString(super.getAccessFlags());
        // Get name and signature from constant pool
        ConstantUtf8 c = super.getConstantPool().getConstantUtf8(super.getSignatureIndex());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Method.java`
#### Snippet
```java
        final String access = Utility.accessToString(super.getAccessFlags());
        // Get name and signature from constant pool
        ConstantUtf8 c = super.getConstantPool().getConstantUtf8(super.getSignatureIndex());
        String signature = c.getBytes();
        c = super.getConstantPool().getConstantUtf8(super.getNameIndex());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Method.java`
#### Snippet
```java
        final String access = Utility.accessToString(super.getAccessFlags());
        // Get name and signature from constant pool
        ConstantUtf8 c = super.getConstantPool().getConstantUtf8(super.getSignatureIndex());
        String signature = c.getBytes();
        c = super.getConstantPool().getConstantUtf8(super.getNameIndex());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Method.java`
#### Snippet
```java
        ConstantUtf8 c = super.getConstantPool().getConstantUtf8(super.getSignatureIndex());
        String signature = c.getBytes();
        c = super.getConstantPool().getConstantUtf8(super.getNameIndex());
        final String name = c.getBytes();
        signature = Utility.methodSignatureToString(signature, name, access, true, getLocalVariableTable());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Method.java`
#### Snippet
```java
        ConstantUtf8 c = super.getConstantPool().getConstantUtf8(super.getSignatureIndex());
        String signature = c.getBytes();
        c = super.getConstantPool().getConstantUtf8(super.getNameIndex());
        final String name = c.getBytes();
        signature = Utility.methodSignatureToString(signature, name, access, true, getLocalVariableTable());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Method.java`
#### Snippet
```java
        signature = Utility.methodSignatureToString(signature, name, access, true, getLocalVariableTable());
        final StringBuilder buf = new StringBuilder(signature);
        for (final Attribute attribute : super.getAttributes()) {
            if (!(attribute instanceof Code || attribute instanceof ExceptionTable)) {
                buf.append(" [").append(attribute).append("]");
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Method.java`
#### Snippet
```java
     */
    public Code getCode() {
        for (final Attribute attribute : super.getAttributes()) {
            if (attribute instanceof Code) {
                return (Code) attribute;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/ArithmeticInstruction.java`
#### Snippet
```java
    @Override
    public Type getType(final ConstantPoolGen cp) {
        final short opcode = super.getOpcode();
        switch (opcode) {
        case Const.DADD:
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/JSR.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream out) throws IOException {
        super.setIndex(getTargetOffset());
        if (super.getOpcode() == org.apache.bcel.Const.JSR) {
            super.dump(out);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/JSR.java`
#### Snippet
```java
    public void dump(final DataOutputStream out) throws IOException {
        super.setIndex(getTargetOffset());
        if (super.getOpcode() == org.apache.bcel.Const.JSR) {
            super.dump(out);
        } else { // JSR_W
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ConstantMethodHandle.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream file) throws IOException {
        file.writeByte(super.getTag());
        file.writeByte(referenceKind);
        file.writeShort(referenceIndex);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/JSR.java`
#### Snippet
```java
            super.dump(out);
        } else { // JSR_W
            super.setIndex(getTargetOffset());
            out.writeByte(super.getOpcode());
            out.writeInt(super.getIndex());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/JSR.java`
#### Snippet
```java
        } else { // JSR_W
            super.setIndex(getTargetOffset());
            out.writeByte(super.getOpcode());
            out.writeInt(super.getIndex());
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/JSR.java`
#### Snippet
```java
            super.setIndex(getTargetOffset());
            out.writeByte(super.getOpcode());
            out.writeInt(super.getIndex());
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/JSR.java`
#### Snippet
```java
        setPosition(getPosition() + offset); // Position may be shifted by preceding expansions
        if (Math.abs(i) >= Short.MAX_VALUE - maxOffset) { // to large for short (estimate)
            super.setOpcode(org.apache.bcel.Const.JSR_W);
            final short oldLength = (short) super.getLength();
            super.setLength(5);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/JSR.java`
#### Snippet
```java
        if (Math.abs(i) >= Short.MAX_VALUE - maxOffset) { // to large for short (estimate)
            super.setOpcode(org.apache.bcel.Const.JSR_W);
            final short oldLength = (short) super.getLength();
            super.setLength(5);
            return super.getLength() - oldLength;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/JSR.java`
#### Snippet
```java
            super.setOpcode(org.apache.bcel.Const.JSR_W);
            final short oldLength = (short) super.getLength();
            super.setLength(5);
            return super.getLength() - oldLength;
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/JSR.java`
#### Snippet
```java
            final short oldLength = (short) super.getLength();
            super.setLength(5);
            return super.getLength() - oldLength;
        }
        return 0;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/InnerClasses.java`
#### Snippet
```java
        buf.append("):\n");
        for (final InnerClass innerClass : innerClasses) {
            buf.append(innerClass.toString(super.getConstantPool())).append("\n");
        }
        return buf.substring(0, buf.length() - 1); // remove the last newline
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/TABLESWITCH.java`
#### Snippet
```java
        final short fixedLength = (short) (13 + matchLength * 4);
        setFixedLength(fixedLength);
        super.setLength((short) (fixedLength + super.getPadding()));
        super.setMatches(new int[matchLength]);
        super.setIndices(new int[matchLength]);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/TABLESWITCH.java`
#### Snippet
```java
        final short fixedLength = (short) (13 + matchLength * 4);
        setFixedLength(fixedLength);
        super.setLength((short) (fixedLength + super.getPadding()));
        super.setMatches(new int[matchLength]);
        super.setIndices(new int[matchLength]);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/TABLESWITCH.java`
#### Snippet
```java
        setFixedLength(fixedLength);
        super.setLength((short) (fixedLength + super.getPadding()));
        super.setMatches(new int[matchLength]);
        super.setIndices(new int[matchLength]);
        super.setTargets(new InstructionHandle[matchLength]);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/TABLESWITCH.java`
#### Snippet
```java
        super.setLength((short) (fixedLength + super.getPadding()));
        super.setMatches(new int[matchLength]);
        super.setIndices(new int[matchLength]);
        super.setTargets(new InstructionHandle[matchLength]);
        for (int i = 0; i < matchLength; i++) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/TABLESWITCH.java`
#### Snippet
```java
        super.setMatches(new int[matchLength]);
        super.setIndices(new int[matchLength]);
        super.setTargets(new InstructionHandle[matchLength]);
        for (int i = 0; i < matchLength; i++) {
            super.setMatch(i, low + i);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/TABLESWITCH.java`
#### Snippet
```java
        super.setTargets(new InstructionHandle[matchLength]);
        for (int i = 0; i < matchLength; i++) {
            super.setMatch(i, low + i);
            super.setIndices(i, bytes.readInt());
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/TABLESWITCH.java`
#### Snippet
```java
        for (int i = 0; i < matchLength; i++) {
            super.setMatch(i, low + i);
            super.setIndices(i, bytes.readInt());
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/TABLESWITCH.java`
#### Snippet
```java
        /* Alignment remainder assumed 0 here, until dump time */
        final short length = (short) (13 + getMatchLength() * 4);
        super.setLength(length);
        setFixedLength(length);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/TABLESWITCH.java`
#### Snippet
```java
        super.dump(out);
        final int matchLength = getMatchLength();
        final int low = matchLength > 0 ? super.getMatch(0) : 0;
        out.writeInt(low);
        final int high = matchLength > 0 ? super.getMatch(matchLength - 1) : 0;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/TABLESWITCH.java`
#### Snippet
```java
        final int low = matchLength > 0 ? super.getMatch(0) : 0;
        out.writeInt(low);
        final int high = matchLength > 0 ? super.getMatch(matchLength - 1) : 0;
        out.writeInt(high);
        for (int i = 0; i < matchLength; i++) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/TABLESWITCH.java`
#### Snippet
```java
        out.writeInt(high);
        for (int i = 0; i < matchLength; i++) {
            out.writeInt(setIndices(i, getTargetOffset(super.getTarget(i))));
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/ReturnInstruction.java`
#### Snippet
```java

    public Type getType() {
        final short opcode = super.getOpcode();
        switch (opcode) {
        case Const.IRETURN:
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/EnumElementValue.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream dos) throws IOException {
        dos.writeByte(super.getType()); // u1 type of value (ENUM_CONSTANT == 'e')
        dos.writeShort(typeIdx); // u2
        dos.writeShort(valueIdx); // u2
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/EnumElementValue.java`
#### Snippet
```java

    public String getEnumValueString() {
        return super.getConstantPool().getConstantUtf8(valueIdx).getBytes();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/EnumElementValue.java`
#### Snippet
```java

    public String getEnumTypeString() {
        return super.getConstantPool().getConstantUtf8(typeIdx).getBytes();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/EnumElementValue.java`
#### Snippet
```java
    @Override
    public String stringifyValue() {
        return super.getConstantPool().getConstantUtf8(valueIdx).getBytes();
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ConstantString.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream file) throws IOException {
        file.writeByte(super.getTag());
        file.writeShort(stringIndex);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/DCONST.java`
#### Snippet
```java
        super(org.apache.bcel.Const.DCONST_0, (short) 1);
        if (f == 0.0) {
            super.setOpcode(org.apache.bcel.Const.DCONST_0);
        } else if (f == 1.0) {
            super.setOpcode(org.apache.bcel.Const.DCONST_1);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/DCONST.java`
#### Snippet
```java
            super.setOpcode(org.apache.bcel.Const.DCONST_0);
        } else if (f == 1.0) {
            super.setOpcode(org.apache.bcel.Const.DCONST_1);
        } else {
            throw new ClassGenException("DCONST can be used only for 0.0 and 1.0: " + f);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IF_ACMPNE.java`
#### Snippet
```java
    @Override
    public IfInstruction negate() {
        return new IF_ACMPEQ(super.getTarget());
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ConstantClass.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream file) throws IOException {
        file.writeByte(super.getTag());
        file.writeShort(nameIndex);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ConstantDynamic.java`
#### Snippet
```java
     */
    public int getBootstrapMethodAttrIndex() {
        return super.getClassIndex(); // AKA bootstrap_method_attr_index
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IFLE.java`
#### Snippet
```java
    @Override
    public IfInstruction negate() {
        return new IFGT(super.getTarget());
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Unknown.java`
#### Snippet
```java
    @Override
    public String toString() {
        if (super.getLength() == 0 || bytes == null) {
            return "(Unknown attribute " + name + ")";
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Unknown.java`
#### Snippet
```java
        String hex;
        final int limit = 10;
        if (super.getLength() > limit) {
            final byte[] tmp = Arrays.copyOf(bytes, limit);
            hex = Utility.toHexString(tmp) + "... (truncated)";
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Unknown.java`
#### Snippet
```java
    public void dump(final DataOutputStream file) throws IOException {
        super.dump(file);
        if (super.getLength() > 0) {
            file.write(bytes, 0, super.getLength());
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Unknown.java`
#### Snippet
```java
        super.dump(file);
        if (super.getLength() > 0) {
            file.write(bytes, 0, super.getLength());
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/JSR_W.java`
#### Snippet
```java
    @Override
    protected void initFromFile(final ByteSequence bytes, final boolean wide) throws IOException {
        super.setIndex(bytes.readInt());
        super.setLength(5);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/JSR_W.java`
#### Snippet
```java
    protected void initFromFile(final ByteSequence bytes, final boolean wide) throws IOException {
        super.setIndex(bytes.readInt());
        super.setLength(5);
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/JSR_W.java`
#### Snippet
```java
    public JSR_W(final InstructionHandle target) {
        super(org.apache.bcel.Const.JSR_W, target);
        super.setLength(5);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/JSR_W.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream out) throws IOException {
        super.setIndex(getTargetOffset());
        out.writeByte(super.getOpcode());
        out.writeInt(super.getIndex());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/JSR_W.java`
#### Snippet
```java
    public void dump(final DataOutputStream out) throws IOException {
        super.setIndex(getTargetOffset());
        out.writeByte(super.getOpcode());
        out.writeInt(super.getIndex());
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/JSR_W.java`
#### Snippet
```java
        super.setIndex(getTargetOffset());
        out.writeByte(super.getOpcode());
        out.writeInt(super.getIndex());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LocalVariableInstruction.java`
#### Snippet
```java
            out.writeByte(Const.WIDE);
        }
        out.writeByte(super.getOpcode());
        if (super.getLength() > 1) { // Otherwise ILOAD_n, instruction, e.g.
            if (wide()) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LocalVariableInstruction.java`
#### Snippet
```java
        }
        out.writeByte(super.getOpcode());
        if (super.getLength() > 1) { // Otherwise ILOAD_n, instruction, e.g.
            if (wide()) {
                out.writeShort(n);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LocalVariableInstruction.java`
#### Snippet
```java
    @Override
    public String toString(final boolean verbose) {
        final short opcode = super.getOpcode();
        if (opcode >= Const.ILOAD_0 && opcode <= Const.ALOAD_3 || opcode >= Const.ISTORE_0 && opcode <= Const.ASTORE_3) {
            return super.toString(verbose);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LocalVariableInstruction.java`
#### Snippet
```java
        // Cannot be < 0 as this is checked above
        if (n <= 3) { // Use more compact instruction xLOAD_n
            super.setOpcode((short) (cTag + n));
            super.setLength(1);
        } else {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LocalVariableInstruction.java`
#### Snippet
```java
        if (n <= 3) { // Use more compact instruction xLOAD_n
            super.setOpcode((short) (cTag + n));
            super.setLength(1);
        } else {
            super.setOpcode(canonTag);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LocalVariableInstruction.java`
#### Snippet
```java
            super.setLength(1);
        } else {
            super.setOpcode(canonTag);
            if (wide()) {
                super.setLength(4);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LocalVariableInstruction.java`
#### Snippet
```java
            super.setOpcode(canonTag);
            if (wide()) {
                super.setLength(4);
            } else {
                super.setLength(2);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LocalVariableInstruction.java`
#### Snippet
```java
                super.setLength(4);
            } else {
                super.setLength(2);
            }
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LocalVariableInstruction.java`
#### Snippet
```java
        if (wide) {
            n = bytes.readUnsignedShort();
            super.setLength(4);
        } else {
            final short opcode = super.getOpcode();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LocalVariableInstruction.java`
#### Snippet
```java
            super.setLength(4);
        } else {
            final short opcode = super.getOpcode();
            if (opcode >= Const.ILOAD && opcode <= Const.ALOAD || opcode >= Const.ISTORE && opcode <= Const.ASTORE) {
                n = bytes.readUnsignedByte();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LocalVariableInstruction.java`
#### Snippet
```java
            if (opcode >= Const.ILOAD && opcode <= Const.ALOAD || opcode >= Const.ISTORE && opcode <= Const.ASTORE) {
                n = bytes.readUnsignedByte();
                super.setLength(2);
            } else {
                if (opcode <= Const.ALOAD_3) { // compact load instruction such as ILOAD_2
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LocalVariableInstruction.java`
#### Snippet
```java
                    n = (opcode - Const.ISTORE_0) % 4;
                }
                super.setLength(1);
            }
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IFNULL.java`
#### Snippet
```java
    @Override
    public IfInstruction negate() {
        return new IFNONNULL(super.getTarget());
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/ArrayElementValueGen.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream dos) throws IOException {
        dos.writeByte(super.getElementValueType()); // u1 type of value (ARRAY == '[')
        dos.writeShort(evalues.size());
        for (final ElementValueGen element : evalues) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/ArrayElementValueGen.java`
#### Snippet
```java
            immutableData[i++] = element.getElementValue();
        }
        return new ArrayElementValue(super.getElementValueType(), immutableData, getConstantPool().getConstantPool());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/GOTO_W.java`
#### Snippet
```java
    @Override
    protected void initFromFile(final ByteSequence bytes, final boolean wide) throws IOException {
        super.setIndex(bytes.readInt());
        super.setLength(5);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/GOTO_W.java`
#### Snippet
```java
    protected void initFromFile(final ByteSequence bytes, final boolean wide) throws IOException {
        super.setIndex(bytes.readInt());
        super.setLength(5);
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/GOTO_W.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream out) throws IOException {
        super.setIndex(getTargetOffset());
        out.writeByte(super.getOpcode());
        out.writeInt(super.getIndex());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/GOTO_W.java`
#### Snippet
```java
    public void dump(final DataOutputStream out) throws IOException {
        super.setIndex(getTargetOffset());
        out.writeByte(super.getOpcode());
        out.writeInt(super.getIndex());
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/GOTO_W.java`
#### Snippet
```java
        super.setIndex(getTargetOffset());
        out.writeByte(super.getOpcode());
        out.writeInt(super.getIndex());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/GOTO_W.java`
#### Snippet
```java
    public GOTO_W(final InstructionHandle target) {
        super(org.apache.bcel.Const.GOTO_W, target);
        super.setLength(5);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/ClassGen.java`
#### Snippet
```java
        // Must be last since the above calls may still add something to it
        final ConstantPool cp = this.cp.getFinalConstantPool();
        return new JavaClass(classNameIndex, superclassNameIndex, fileName, major, minor, super.getAccessFlags(), cp, interfaces, fields, methods,
            attributes);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IF_ICMPLT.java`
#### Snippet
```java
    @Override
    public IfInstruction negate() {
        return new IF_ICMPGE(super.getTarget());
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IFNONNULL.java`
#### Snippet
```java
    @Override
    public IfInstruction negate() {
        return new IFNULL(super.getTarget());
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Signature.java`
#### Snippet
```java
     */
    public String getSignature() {
        return super.getConstantPool().getConstantUtf8(signatureIndex).getBytes();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/InvokeInstruction.java`
#### Snippet
```java
    @Override
    public String toString(final ConstantPool cp) {
        final Constant c = cp.getConstant(super.getIndex());
        final StringTokenizer tok = new StringTokenizer(cp.constantToString(c));

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/InvokeInstruction.java`
#### Snippet
```java
        final StringTokenizer tok = new StringTokenizer(cp.constantToString(c));

        final String opcodeName = Const.getOpcodeName(super.getOpcode());

        final StringBuilder sb = new StringBuilder(opcodeName);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/InvokeInstruction.java`
#### Snippet
```java
    public String getClassName(final ConstantPoolGen cpg) {
        final ConstantPool cp = cpg.getConstantPool();
        final ConstantCP cmr = (ConstantCP) cp.getConstant(super.getIndex());
        final String className = cp.getConstantString(cmr.getClassIndex(), Const.CONSTANT_Class);
        return Utility.pathToPackage(className);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/InvokeInstruction.java`
#### Snippet
```java
    public int consumeStack(final ConstantPoolGen cpg) {
        int sum;
        if (super.getOpcode() == Const.INVOKESTATIC || super.getOpcode() == Const.INVOKEDYNAMIC) {
            sum = 0;
        } else {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/InvokeInstruction.java`
#### Snippet
```java
    public int consumeStack(final ConstantPoolGen cpg) {
        int sum;
        if (super.getOpcode() == Const.INVOKESTATIC || super.getOpcode() == Const.INVOKEDYNAMIC) {
            sum = 0;
        } else {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IFGE.java`
#### Snippet
```java
    @Override
    public IfInstruction negate() {
        return new IFLT(super.getTarget());
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ModuleMainClass.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        buf.append("ModuleMainClass: ");
        final String className = super.getConstantPool().getConstantString(mainClassIndex, Const.CONSTANT_Class);
        buf.append(Utility.compactClassName(className, false));
        return buf.toString();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IF_ICMPLE.java`
#### Snippet
```java
    @Override
    public IfInstruction negate() {
        return new IF_ICMPGT(super.getTarget());
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/ConversionInstruction.java`
#### Snippet
```java
    @Override
    public Type getType(final ConstantPoolGen cp) {
        final short opcode = super.getOpcode();
        switch (opcode) {
        case Const.D2I:
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/MULTIANEWARRAY.java`
#### Snippet
```java
        }
        this.dimensions = dimensions;
        super.setLength(4);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/MULTIANEWARRAY.java`
#### Snippet
```java
        super.initFromFile(bytes, wide);
        dimensions = bytes.readByte();
        super.setLength(4);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/MULTIANEWARRAY.java`
#### Snippet
```java
    @Override
    public String toString(final boolean verbose) {
        return super.toString(verbose) + " " + super.getIndex() + " " + dimensions;
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/MULTIANEWARRAY.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream out) throws IOException {
        out.writeByte(super.getOpcode());
        out.writeShort(super.getIndex());
        out.writeByte(dimensions);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/MULTIANEWARRAY.java`
#### Snippet
```java
    public void dump(final DataOutputStream out) throws IOException {
        out.writeByte(super.getOpcode());
        out.writeShort(super.getIndex());
        out.writeByte(dimensions);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LDC_W.java`
#### Snippet
```java
        setIndex(bytes.readUnsignedShort());
        // Override just in case it has been changed
        super.setOpcode(org.apache.bcel.Const.LDC_W);
        super.setLength(3);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LDC_W.java`
#### Snippet
```java
        // Override just in case it has been changed
        super.setOpcode(org.apache.bcel.Const.LDC_W);
        super.setLength(3);
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ConstantFloat.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream file) throws IOException {
        file.writeByte(super.getTag());
        file.writeFloat(bytes);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ConstantValue.java`
#### Snippet
```java
    @Override
    public String toString() {
        Constant c = super.getConstantPool().getConstant(constantValueIndex);
        String buf;
        int i;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ConstantValue.java`
#### Snippet
```java
        case Const.CONSTANT_String:
            i = ((ConstantString) c).getStringIndex();
            c = super.getConstantPool().getConstantUtf8(i);
            buf = "\"" + Utility.convertString(((ConstantUtf8) c).getBytes()) + "\"";
            break;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ConstantMethodType.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream file) throws IOException {
        file.writeByte(super.getTag());
        file.writeShort(descriptorIndex);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ConstantUtf8.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream file) throws IOException {
        file.writeByte(super.getTag());
        file.writeUTF(value);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LDC2_W.java`
#### Snippet
```java

    public Number getValue(final ConstantPoolGen cpg) {
        final org.apache.bcel.classfile.Constant c = cpg.getConstantPool().getConstant(super.getIndex());
        switch (c.getTag()) {
        case org.apache.bcel.Const.CONSTANT_Long:
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LDC2_W.java`
#### Snippet
```java
            return Double.valueOf(((org.apache.bcel.classfile.ConstantDouble) c).getBytes());
        default: // Never reached
            throw new IllegalArgumentException("Unknown or invalid constant type at " + super.getIndex());
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LDC2_W.java`
#### Snippet
```java
    @Override
    public Type getType(final ConstantPoolGen cpg) {
        switch (cpg.getConstantPool().getConstant(super.getIndex()).getTag()) {
        case org.apache.bcel.Const.CONSTANT_Long:
            return Type.LONG;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LDC2_W.java`
#### Snippet
```java
            return Type.DOUBLE;
        default: // Never reached
            throw new IllegalArgumentException("Unknown constant type " + super.getOpcode());
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/BIPUSH.java`
#### Snippet
```java
    @Override
    protected void initFromFile(final ByteSequence bytes, final boolean wide) throws IOException {
        super.setLength(2);
        b = bytes.readByte();
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ClassElementValue.java`
#### Snippet
```java

    public String getClassString() {
        return super.getConstantPool().getConstantUtf8(idx).getBytes();
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ClassElementValue.java`
#### Snippet
```java
    @Override
    public String stringifyValue() {
        return super.getConstantPool().getConstantUtf8(idx).getBytes();
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ClassElementValue.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream dos) throws IOException {
        dos.writeByte(super.getType()); // u1 kind of value
        dos.writeShort(idx);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/JsrInstruction.java`
#### Snippet
```java
     */
    public InstructionHandle physicalSuccessor() {
        InstructionHandle ih = super.getTarget();
        // Rewind!
        while (ih.getPrev() != null) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
    @Override
    public String getSignature() {
        return Type.getMethodSignature(super.getType(), argTypes);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
    public Method getMethod() {
        final String signature = getSignature();
        final ConstantPoolGen cp = super.getConstantPool();
        final int nameIndex = cp.addUtf8(super.getName());
        final int signatureIndex = cp.addUtf8(signature);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
        final String signature = getSignature();
        final ConstantPoolGen cp = super.getConstantPool();
        final int nameIndex = cp.addUtf8(super.getName());
        final int signatureIndex = cp.addUtf8(signature);
        /*
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
            // Add 'Exceptions' if there are "throws" clauses
        }
        final Method m = new Method(super.getAccessFlags(), nameIndex, signatureIndex, getAttributes(), cp.getConstantPool());
        // Undo effects of adding attributes
        if (lvt != null) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
    public void setMaxStack() { // TODO could be package-protected? (some tests would need repackaging)
        if (il != null) {
            maxStack = getMaxStack(super.getConstantPool(), il, getExceptionHandlers());
        } else {
            maxStack = 0;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
    public MethodGen copy(final String className, final ConstantPoolGen cp) {
        final Method m = ((MethodGen) clone()).getMethod();
        final MethodGen mg = new MethodGen(m, className, super.getConstantPool());
        if (super.getConstantPool() != cp) {
            mg.setConstantPool(cp);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
        final Method m = ((MethodGen) clone()).getMethod();
        final MethodGen mg = new MethodGen(m, className, super.getConstantPool());
        if (super.getConstantPool() != cp) {
            mg.setConstantPool(cp);
            mg.getInstructionList().replaceConstantPool(super.getConstantPool(), cp);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
        if (super.getConstantPool() != cp) {
            mg.setConstantPool(cp);
            mg.getInstructionList().replaceConstantPool(super.getConstantPool(), cp);
        }
        return mg;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java

    private Attribute[] addRuntimeAnnotationsAsAttribute(final ConstantPoolGen cp) {
        final Attribute[] attrs = AnnotationEntryGen.getAnnotationAttributes(cp, super.getAnnotationEntries());
        addAll(attrs);
        return attrs;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
        final int size = exceptionList.size();
        final CodeException[] cExc = new CodeException[size];
        Arrays.setAll(cExc, i -> exceptionList.get(i).getCodeException(super.getConstantPool()));
        return cExc;
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
    @Override
    public final String toString() {
        final String access = Utility.accessToString(super.getAccessFlags());
        String signature = Type.getMethodSignature(super.getType(), argTypes);
        signature = Utility.methodSignatureToString(signature, super.getName(), access, true, getLocalVariableTable(super.getConstantPool()));
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
    public final String toString() {
        final String access = Utility.accessToString(super.getAccessFlags());
        String signature = Type.getMethodSignature(super.getType(), argTypes);
        signature = Utility.methodSignatureToString(signature, super.getName(), access, true, getLocalVariableTable(super.getConstantPool()));
        final StringBuilder buf = new StringBuilder(signature);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
        final String access = Utility.accessToString(super.getAccessFlags());
        String signature = Type.getMethodSignature(super.getType(), argTypes);
        signature = Utility.methodSignatureToString(signature, super.getName(), access, true, getLocalVariableTable(super.getConstantPool()));
        final StringBuilder buf = new StringBuilder(signature);
        for (final Attribute a : getAttributes()) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
        final String access = Utility.accessToString(super.getAccessFlags());
        String signature = Type.getMethodSignature(super.getType(), argTypes);
        signature = Utility.methodSignatureToString(signature, super.getName(), access, true, getLocalVariableTable(super.getConstantPool()));
        final StringBuilder buf = new StringBuilder(signature);
        for (final Attribute a : getAttributes()) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
     */
    public void addAnnotationsAsAttribute(final ConstantPoolGen cp) {
        addAll(AnnotationEntryGen.getAnnotationAttributes(cp, super.getAnnotationEntries()));
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
                final Instruction ins = ih.getInstruction();
                if (ins instanceof LocalVariableInstruction || ins instanceof RET || ins instanceof IINC) {
                    final int index = ((IndexedInstruction) ins).getIndex() + ((TypedInstruction) ins).getType(super.getConstantPool()).getSize();
                    if (index > max) {
                        max = index;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/NEWARRAY.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream out) throws IOException {
        out.writeByte(super.getOpcode());
        out.writeByte(type);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldInstruction.java`
#### Snippet
```java
    @Override
    public String toString(final ConstantPool cp) {
        return org.apache.bcel.Const.getOpcodeName(super.getOpcode()) + " " + cp.constantToString(super.getIndex(), org.apache.bcel.Const.CONSTANT_Fieldref);
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldInstruction.java`
#### Snippet
```java
    @Override
    public String toString(final ConstantPool cp) {
        return org.apache.bcel.Const.getOpcodeName(super.getOpcode()) + " " + cp.constantToString(super.getIndex(), org.apache.bcel.Const.CONSTANT_Fieldref);
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/NEWARRAY.java`
#### Snippet
```java
    protected void initFromFile(final ByteSequence bytes, final boolean wide) throws IOException {
        type = bytes.readByte();
        super.setLength(2);
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ConstantNameAndType.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream file) throws IOException {
        file.writeByte(super.getTag());
        file.writeShort(nameIndex);
        file.writeShort(signatureIndex);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/INVOKEINTERFACE.java`
#### Snippet
```java
    protected void initFromFile(final ByteSequence bytes, final boolean wide) throws IOException {
        super.initFromFile(bytes, wide);
        super.setLength(5);
        nargs = bytes.readUnsignedByte();
        bytes.readByte(); // Skip 0 byte
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/INVOKEINTERFACE.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream out) throws IOException {
        out.writeByte(super.getOpcode());
        out.writeShort(super.getIndex());
        out.writeByte(nargs);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/INVOKEINTERFACE.java`
#### Snippet
```java
    public void dump(final DataOutputStream out) throws IOException {
        out.writeByte(super.getOpcode());
        out.writeShort(super.getIndex());
        out.writeByte(nargs);
        out.writeByte(0);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/INVOKEINTERFACE.java`
#### Snippet
```java
    public INVOKEINTERFACE(final int index, final int nargs) {
        super(Const.INVOKEINTERFACE, index);
        super.setLength(5);
        if (nargs < 1) {
            throw new ClassGenException("Number of arguments must be > 0 " + nargs);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IFNE.java`
#### Snippet
```java
    @Override
    public IfInstruction negate() {
        return new IFEQ(super.getTarget());
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IINC.java`
#### Snippet
```java

    private void setWide() {
        wide = super.getIndex() > Const.MAX_BYTE;
        if (c > 0) {
            wide = wide || c > Byte.MAX_VALUE;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IINC.java`
#### Snippet
```java
        }
        if (wide) {
            super.setLength(6); // wide byte included
        } else {
            super.setLength(3);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IINC.java`
#### Snippet
```java
            super.setLength(6); // wide byte included
        } else {
            super.setLength(3);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IINC.java`
#### Snippet
```java
            out.writeByte(Const.WIDE);
        }
        out.writeByte(super.getOpcode());
        if (wide) {
            out.writeShort(super.getIndex());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IINC.java`
#### Snippet
```java
        out.writeByte(super.getOpcode());
        if (wide) {
            out.writeShort(super.getIndex());
            out.writeShort(c);
        } else {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IINC.java`
#### Snippet
```java
            out.writeShort(c);
        } else {
            out.writeByte(super.getIndex());
            out.writeByte(c);
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IINC.java`
#### Snippet
```java
            throw new ClassGenException("Negative index value: " + n);
        }
        super.setIndexOnly(n);
        setWide();
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IINC.java`
#### Snippet
```java
        this.wide = wide;
        if (wide) {
            super.setLength(6);
            super.setIndexOnly(bytes.readUnsignedShort());
            c = bytes.readShort();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IINC.java`
#### Snippet
```java
        if (wide) {
            super.setLength(6);
            super.setIndexOnly(bytes.readUnsignedShort());
            c = bytes.readShort();
        } else {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IINC.java`
#### Snippet
```java
            c = bytes.readShort();
        } else {
            super.setLength(3);
            super.setIndexOnly(bytes.readUnsignedByte());
            c = bytes.readByte();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IINC.java`
#### Snippet
```java
        } else {
            super.setLength(3);
            super.setIndexOnly(bytes.readUnsignedByte());
            c = bytes.readByte();
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IINC.java`
#### Snippet
```java
    public IINC(final int n, final int c) {
        // Default behavior of LocalVariableInstruction causes error
        super.setOpcode(Const.IINC);
        super.setLength((short) 3);
        setIndex(n); // May set wide as side effect
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IINC.java`
#### Snippet
```java
        // Default behavior of LocalVariableInstruction causes error
        super.setOpcode(Const.IINC);
        super.setLength((short) 3);
        setIndex(n); // May set wide as side effect
        setIncrement(c);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/NestMembers.java`
#### Snippet
```java
    public String[] getClassNames() {
        final String[] names = new String[classes.length];
        Arrays.setAll(names, i -> Utility.pathToPackage(super.getConstantPool().getConstantString(classes[i], Const.CONSTANT_Class)));
        return names;
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/NestMembers.java`
#### Snippet
```java
        buf.append("):\n");
        for (final int index : classes) {
            final String className = super.getConstantPool().getConstantString(index, Const.CONSTANT_Class);
            buf.append("  ").append(Utility.compactClassName(className, false)).append("\n");
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/SimpleElementValueGen.java`
#### Snippet
```java
    @Override
    public ElementValue getElementValue() {
        return new SimpleElementValue(super.getElementValueType(), idx, getConstantPool().getConstantPool());
    }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/SimpleElementValueGen.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream dos) throws IOException {
        dos.writeByte(super.getElementValueType()); // u1 kind of value
        switch (super.getElementValueType()) {
        case PRIMITIVE_INT:
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/SimpleElementValueGen.java`
#### Snippet
```java
    public void dump(final DataOutputStream dos) throws IOException {
        dos.writeByte(super.getElementValueType()); // u1 kind of value
        switch (super.getElementValueType()) {
        case PRIMITIVE_INT:
        case PRIMITIVE_BYTE:
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/SimpleElementValueGen.java`
#### Snippet
```java
            break;
        default:
            throw new IllegalStateException("SimpleElementValueGen doesn't know how to write out type " + super.getElementValueType());
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/SimpleElementValueGen.java`
#### Snippet
```java

    public String getValueString() {
        if (super.getElementValueType() != STRING) {
            throw new IllegalStateException("Don't call getValueString() on a non STRING ElementValue");
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/SimpleElementValueGen.java`
#### Snippet
```java

    public int getValueInt() {
        if (super.getElementValueType() != PRIMITIVE_INT) {
            throw new IllegalStateException("Don't call getValueString() on a non STRING ElementValue");
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/SimpleElementValueGen.java`
#### Snippet
```java
                break;
            default:
                throw new IllegalArgumentException("SimpleElementValueGen class does not know how to copy this type " + super.getElementValueType());
            }
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/SimpleElementValueGen.java`
#### Snippet
```java
    @Override
    public String stringifyValue() {
        switch (super.getElementValueType()) {
        case PRIMITIVE_INT:
            final ConstantInteger c = (ConstantInteger) getConstantPool().getConstant(idx);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/SimpleElementValueGen.java`
#### Snippet
```java
            return cu8.getBytes();
        default:
            throw new IllegalStateException("SimpleElementValueGen class does not know how to stringify type " + super.getElementValueType());
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IF_ICMPNE.java`
#### Snippet
```java
    @Override
    public IfInstruction negate() {
        return new IF_ICMPEQ(super.getTarget());
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Field.java`
#### Snippet
```java
     */
    public ConstantValue getConstantValue() {
        for (final Attribute attribute : super.getAttributes()) {
            if (attribute.getTag() == Const.ATTR_CONSTANT_VALUE) {
                return (ConstantValue) attribute;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Field.java`
#### Snippet
```java

        // Get names from constant pool
        access = Utility.accessToString(super.getAccessFlags());
        access = access.isEmpty() ? "" : access + " ";
        signature = Utility.signatureToString(getSignature());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/Field.java`
#### Snippet
```java
            buf.append(" = ").append(cv);
        }
        for (final Attribute attribute : super.getAttributes()) {
            if (!(attribute instanceof ConstantValue)) {
                buf.append(" [").append(attribute).append("]");
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/INVOKEDYNAMIC.java`
#### Snippet
```java
    protected void initFromFile(final ByteSequence bytes, final boolean wide) throws IOException {
        super.initFromFile(bytes, wide);
        super.setLength(5);
        bytes.readByte(); // Skip 0 byte
        bytes.readByte(); // Skip 0 byte
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/INVOKEDYNAMIC.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream out) throws IOException {
        out.writeByte(super.getOpcode());
        out.writeShort(super.getIndex());
        out.writeByte(0);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/INVOKEDYNAMIC.java`
#### Snippet
```java
    public void dump(final DataOutputStream out) throws IOException {
        out.writeByte(super.getOpcode());
        out.writeShort(super.getIndex());
        out.writeByte(0);
        out.writeByte(0);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/INVOKEDYNAMIC.java`
#### Snippet
```java
    public String getClassName(final ConstantPoolGen cpg) {
        final ConstantPool cp = cpg.getConstantPool();
        final ConstantInvokeDynamic cid = cp.getConstant(super.getIndex(), Const.CONSTANT_InvokeDynamic, ConstantInvokeDynamic.class);
        return cp.getConstant(cid.getNameAndTypeIndex(), ConstantNameAndType.class).getName(cp);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IF_ACMPEQ.java`
#### Snippet
```java
    @Override
    public IfInstruction negate() {
        return new IF_ACMPNE(super.getTarget());
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/BasicType.java`
#### Snippet
```java
    @Override
    public int hashCode() {
        return super.getType();
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
    @Override
    public Type getType(final ConstantPoolGen cpg) {
        switch (cpg.getConstantPool().getConstant(super.getIndex()).getTag()) {
        case org.apache.bcel.Const.CONSTANT_String:
            return Type.STRING;
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
            return Type.CLASS;
        default: // Never reached
            throw new IllegalArgumentException("Unknown or invalid constant type at " + super.getIndex());
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream out) throws IOException {
        out.writeByte(super.getOpcode());
        if (super.getLength() == 2) { // TODO useless check?
            out.writeByte(super.getIndex());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
    public void dump(final DataOutputStream out) throws IOException {
        out.writeByte(super.getOpcode());
        if (super.getLength() == 2) { // TODO useless check?
            out.writeByte(super.getIndex());
        } else {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
        out.writeByte(super.getOpcode());
        if (super.getLength() == 2) { // TODO useless check?
            out.writeByte(super.getIndex());
        } else {
            out.writeShort(super.getIndex());
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
            out.writeByte(super.getIndex());
        } else {
            out.writeShort(super.getIndex());
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java

    public Object getValue(final ConstantPoolGen cpg) {
        org.apache.bcel.classfile.Constant c = cpg.getConstantPool().getConstant(super.getIndex());
        switch (c.getTag()) {
        case org.apache.bcel.Const.CONSTANT_String:
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
            return Type.getType(((org.apache.bcel.classfile.ConstantUtf8) c).getBytes());
        default: // Never reached
            throw new IllegalArgumentException("Unknown or invalid constant type at " + super.getIndex());
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
    // Adjust to proper size
    protected final void setSize() {
        if (super.getIndex() <= org.apache.bcel.Const.MAX_BYTE) { // Fits in one byte?
            super.setOpcode(org.apache.bcel.Const.LDC);
            super.setLength(2);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
    protected final void setSize() {
        if (super.getIndex() <= org.apache.bcel.Const.MAX_BYTE) { // Fits in one byte?
            super.setOpcode(org.apache.bcel.Const.LDC);
            super.setLength(2);
        } else {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
        if (super.getIndex() <= org.apache.bcel.Const.MAX_BYTE) { // Fits in one byte?
            super.setOpcode(org.apache.bcel.Const.LDC);
            super.setLength(2);
        } else {
            super.setOpcode(org.apache.bcel.Const.LDC_W);
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
            super.setLength(2);
        } else {
            super.setOpcode(org.apache.bcel.Const.LDC_W);
            super.setLength(3);
        }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
        } else {
            super.setOpcode(org.apache.bcel.Const.LDC_W);
            super.setLength(3);
        }
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
    @Override
    protected void initFromFile(final ByteSequence bytes, final boolean wide) throws IOException {
        super.setLength(2);
        super.setIndex(bytes.readUnsignedByte());
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/classfile/ConstantPackage.java`
#### Snippet
```java
    @Override
    public void dump(final DataOutputStream file) throws IOException {
        file.writeByte(super.getTag());
        file.writeShort(nameIndex);
    }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/IF_ICMPGT.java`
#### Snippet
```java
    @Override
    public IfInstruction negate() {
        return new IF_ICMPLE(super.getTarget());
    }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldOrMethod.java`
#### Snippet
```java
    public String getClassName(final ConstantPoolGen cpg) {
        final ConstantPool cp = cpg.getConstantPool();
        final ConstantCP cmr = (ConstantCP) cp.getConstant(super.getIndex());
        final String className = cp.getConstantString(cmr.getClassIndex(), Const.CONSTANT_Class);
        if (className.startsWith("[")) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldOrMethod.java`
#### Snippet
```java
    public ReferenceType getReferenceType(final ConstantPoolGen cpg) {
        final ConstantPool cp = cpg.getConstantPool();
        final ConstantCP cmr = (ConstantCP) cp.getConstant(super.getIndex());
        String className = cp.getConstantString(cmr.getClassIndex(), Const.CONSTANT_Class);
        if (className.startsWith("[")) {
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldOrMethod.java`
#### Snippet
```java
    public String getSignature(final ConstantPoolGen cpg) {
        final ConstantPool cp = cpg.getConstantPool();
        final ConstantCP cmr = (ConstantCP) cp.getConstant(super.getIndex());
        final ConstantNameAndType cnat = (ConstantNameAndType) cp.getConstant(cmr.getNameAndTypeIndex());
        return ((ConstantUtf8) cp.getConstant(cnat.getSignatureIndex())).getBytes();
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/bcel/generic/FieldOrMethod.java`
#### Snippet
```java
    public String getName(final ConstantPoolGen cpg) {
        final ConstantPool cp = cpg.getConstantPool();
        final ConstantCP cmr = (ConstantCP) cp.getConstant(super.getIndex());
        final ConstantNameAndType cnat = (ConstantNameAndType) cp.getConstant(cmr.getNameAndTypeIndex());
        return ((ConstantUtf8) cp.getConstant(cnat.getNameIndex())).getBytes();
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`dir = dir + sep` could be simplified to 'dir += sep'
in `src/main/java/org/apache/bcel/util/Class2HTML.java`
#### Snippet
```java
                    dir = argv[++i];
                    if (!dir.endsWith("" + sep)) {
                        dir = dir + sep;
                    }
                    final File store = new File(dir);
```

### ReplaceAssignmentWithOperatorAssignment
`type = type + typeSignatureToString(signature.substring(index), chopit)` could be simplified to 'type += typeSignatureToString(signature.substring(index), chopit)'
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
            index += unwrap(CONSUMER_CHARS); // update position
            // add return type
            type = type + typeSignatureToString(signature.substring(index), chopit);
            index += unwrap(CONSUMER_CHARS); // update position
            // ignore any throws information in the signature
```

### ReplaceAssignmentWithOperatorAssignment
`acc = acc & ~(Const.ACC_PUBLIC | Const.ACC_PRIVATE | Const.ACC_PROTECTED | Const.ACC_STATIC | Const....` could be simplified to 'acc \&= \~(Const.ACC_PUBLIC \| Const.ACC_PRIVATE \| Const.ACC_PROTECTED \| Const.ACC_STATIC \| Const.ACC_FINAL \| Const.ACC_INTERFACE \| Const.ACC_ABSTRACT)'
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java
                }
                int acc = ic.getInnerAccessFlags();
                acc = acc & ~(Const.ACC_PUBLIC | Const.ACC_PRIVATE | Const.ACC_PROTECTED | Const.ACC_STATIC | Const.ACC_FINAL | Const.ACC_INTERFACE |
                    Const.ACC_ABSTRACT);
                if (acc != 0) {
                    addMessage("Unknown access flag for inner class '" + tostring(ic) + "' set (InnerClasses attribute '" + tostring(innerClasses) + "').");
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/InstructionHandle.java`
#### Snippet
```java
     */
    void dispose() {
        next = prev = null;
        instruction.dispose();
        instruction = null;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/Select.java`
#### Snippet
```java
            notifyTarget(null, target2, this);
        }
        if ((match_length = match.length) != targets.length) {
            throw new ClassGenException("Match and target array have not the same length: Match length: " + match.length + " Target length: " + targets.length);
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/verifier/structurals/Pass3bVerifier.java`
#### Snippet
```java
                }
            }
        } while ((ih = ih.getNext()) != null);

    }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
        for (final AbstractPathEntry path : paths) {
            URL url;
            if ((url = path.getResource(name)) != null) {
                results.add(url);
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
        for (final AbstractPathEntry path : paths) {
            URL url;
            if ((url = path.getResource(name)) != null) {
                return url;
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
        for (final AbstractPathEntry path : paths) {
            InputStream is;
            if ((is = path.getResourceAsStream(name)) != null) {
                return is;
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/util/Class2HTML.java`
#### Snippet
```java
        for (int i = 0; i < str.length(); i++) {
            char ch;
            switch (ch = str.charAt(i)) {
            case '<':
                buf.append("&lt;");
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/util/BCELifier.java`
#### Snippet
```java
    static JavaClass getJavaClass(final String name) throws ClassNotFoundException, IOException {
        JavaClass javaClass;
        if ((javaClass = Repository.lookupClass(name)) == null) {
            javaClass = new ClassParser(name).parse(); // May throw IOException
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/classfile/Signature.java`
#### Snippet
```java
    private static void matchIdent(final MyByteArrayInputStream in, final StringBuilder buf) {
        int ch;
        if ((ch = in.read()) == -1) {
            throw new IllegalArgumentException("Illegal signature: " + in.getData() + " no ident, reaching EOF");
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/classfile/Signature.java`
#### Snippet
```java
            buf.append((char) ch);
            matchGJIdent(in, buf);
            while ((ch = in.read()) != '>' && ch != ')') { // List of parameters
                if (ch == -1) {
                    throw new IllegalArgumentException("Illegal signature: " + in.getData() + " reaching EOF");
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/InstructionList.java`
#### Snippet
```java
         * Pass 3: Update position numbers (which may have changed due to the preceding expansions), like pass 1.
         */
        index = count = 0;
        for (InstructionHandle ih = start; ih != null; ih = ih.getNext()) {
            final Instruction i = ih.getInstruction();
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/InstructionList.java`
#### Snippet
```java
    private void append(final InstructionHandle ih) {
        if (isEmpty()) {
            start = end = ih;
            ih.setNext(ih.setPrev(null));
        } else {
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/InstructionList.java`
#### Snippet
```java

    private void clear() {
        start = end = null;
        length = 0;
    }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/InstructionList.java`
#### Snippet
```java
        InstructionHandle fromIh;
        InstructionHandle toIh;
        if ((fromIh = findInstruction1(from)) == null) {
            throw new ClassGenException("Instruction " + from + " is not contained in this list.");
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/InstructionList.java`
#### Snippet
```java
            throw new ClassGenException("Instruction " + from + " is not contained in this list.");
        }
        if ((toIh = findInstruction2(to)) == null) {
            throw new ClassGenException("Instruction " + to + " is not contained in this list.");
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/InstructionList.java`
#### Snippet
```java
    public InstructionHandle insert(final Instruction i, final InstructionList il) {
        InstructionHandle ih;
        if ((ih = findInstruction1(i)) == null) {
            throw new ClassGenException("Instruction " + i + " is not contained in this list.");
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/InstructionList.java`
#### Snippet
```java
    private void insert(final InstructionHandle ih) {
        if (isEmpty()) {
            start = end = ih;
            ih.setNext(ih.setPrev(null));
        } else {
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/InstructionList.java`
#### Snippet
```java
    public void delete(final Instruction i) throws TargetLostException {
        InstructionHandle ih;
        if ((ih = findInstruction1(i)) == null) {
            throw new ClassGenException("Instruction " + i + " is not contained in this list.");
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/InstructionList.java`
#### Snippet
```java
    public InstructionHandle append(final Instruction i, final InstructionList il) {
        InstructionHandle ih;
        if ((ih = findInstruction2(i)) == null) {
            throw new ClassGenException("Instruction " + i + " is not contained in this list.");
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/InstructionList.java`
#### Snippet
```java
            first = start;
            last = end;
            start = end = null;
        } else {
            if (prev == null) { // At start of list
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/util/ClassLoader.java`
#### Snippet
```java
         * First try: lookup hash table.
         */
        if ((cl = classes.get(className)) == null) {
            /*
             * Second try: Load system class using system class loader. You better don't mess around with them.
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/util/ClassLoader.java`
#### Snippet
```java
                    clazz = createClass(className);
                } else { // Fourth try: Load classes via repository
                    if ((clazz = repository.loadClass(className)) == null) {
                        throw new ClassNotFoundException(className);
                    }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/classfile/ConstantUtf8.java`
#### Snippet
```java
    // for access by test code
    static synchronized void clearStats() {
        hits = considered = skipped = created = 0;
    }

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/classfile/ConstantUtf8.java`
#### Snippet
```java
    // for access by test code
    static synchronized void clearStats() {
        hits = considered = skipped = created = 0;
    }

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/classfile/ConstantUtf8.java`
#### Snippet
```java
    // for access by test code
    static synchronized void clearStats() {
        hits = considered = skipped = created = 0;
    }

```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
        if (!variableList.isEmpty() && !stripAttributes) {
            updateLocalVariableTable(getLocalVariableTable(cp));
            addCodeAttribute(lvt = getLocalVariableTable(cp));
        }
        if (localVariableTypeTable != null) {
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
        }
        if (!lineNumberList.isEmpty() && !stripAttributes) {
            addCodeAttribute(lnt = getLineNumberTable(cp));
        }
        final Attribute[] codeAttrs = getCodeAttributes();
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
        ExceptionTable et = null;
        if (!throwsList.isEmpty()) {
            addAttribute(et = getExceptionTable(cp));
            // Add 'Exceptions' if there are "throws" clauses
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
            final LocalVariableGen l = new LocalVariableGen(slot, name, type, start, end, origIndex);
            int i;
            if ((i = variableList.indexOf(l)) >= 0) {
                variableList.set(i, l);
            } else {
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/verifier/exc/AssertionViolatedException.java`
#### Snippet
```java
     */
    public AssertionViolatedException(String message, final Throwable initCause) {
        super(message = "INTERNAL ERROR: " + message, initCause);
        detailMessage = message;
    }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/verifier/exc/AssertionViolatedException.java`
#### Snippet
```java
     */
    public AssertionViolatedException(String message) {
        super(message = "INTERNAL ERROR: " + message); // Thanks to Java, the constructor call here must be first.
        detailMessage = message;
    }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/ConstantPoolGen.java`
#### Snippet
```java
    public int addMethodref(final String className, final String methodName, final String signature) {
        final int cpRet;
        if ((cpRet = lookupMethodref(className, methodName, signature)) != -1) {
            return cpRet; // Already in CP
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/ConstantPoolGen.java`
#### Snippet
```java
    public int addInteger(final int n) {
        int ret;
        if ((ret = lookupInteger(n)) != -1) {
            return ret; // Already in CP
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/ConstantPoolGen.java`
#### Snippet
```java
    public int addString(final String str) {
        int ret;
        if ((ret = lookupString(str)) != -1) {
            return ret; // Already in CP
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/ConstantPoolGen.java`
#### Snippet
```java
    public int addNameAndType(final String name, final String signature) {
        int ret;
        if ((ret = lookupNameAndType(name, signature)) != -1) {
            return ret; // Already in CP
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/ConstantPoolGen.java`
#### Snippet
```java
    private int addClass_(final String clazz) {
        final int cpRet;
        if ((cpRet = lookupClass(clazz)) != -1) {
            return cpRet; // Already in CP
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/ConstantPoolGen.java`
#### Snippet
```java
    public int addLong(final long n) {
        int ret;
        if ((ret = lookupLong(n)) != -1) {
            return ret; // Already in CP
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/ConstantPoolGen.java`
#### Snippet
```java
    public int addInterfaceMethodref(final String className, final String methodName, final String signature) {
        final int cpRet;
        if ((cpRet = lookupInterfaceMethodref(className, methodName, signature)) != -1) {
            return cpRet; // Already in CP
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/ConstantPoolGen.java`
#### Snippet
```java
    public int addFloat(final float n) {
        int ret;
        if ((ret = lookupFloat(n)) != -1) {
            return ret; // Already in CP
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/ConstantPoolGen.java`
#### Snippet
```java
    public int addDouble(final double n) {
        int ret;
        if ((ret = lookupDouble(n)) != -1) {
            return ret; // Already in CP
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/ConstantPoolGen.java`
#### Snippet
```java
    public int addUtf8(final String n) {
        int ret;
        if ((ret = lookupUtf8(n)) != -1) {
            return ret; // Already in CP
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/generic/ConstantPoolGen.java`
#### Snippet
```java
    public int addFieldref(final String className, final String fieldName, final String signature) {
        final int cpRet;
        if ((cpRet = lookupFieldref(className, fieldName, signature)) != -1) {
            return cpRet; // Already in CP
        }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
            for (int i = 0; i < noPadBytes; i++) {
                byte b;
                if ((b = bytes.readByte()) != 0) {
                    System.err.println("Warning: Padding byte != 0 in " + Const.getOpcodeName(opcode) + ":" + b);
                }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
        try (JavaReader jr = new JavaReader(new CharArrayReader(s.toCharArray())); ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            int ch;
            while ((ch = jr.read()) >= 0) {
                bos.write(ch);
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
            int count = 0;
            int b;
            while ((b = gis.read()) >= 0) {
                tmp[count++] = (byte) b;
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
                oldIndex = 0; // String start offset
                // While we have something to replace
                while ((index = str.indexOf(old, oldIndex)) != -1) {
                    buf.append(str, oldIndex, index); // append prefix
                    buf.append(new_); // append replacement
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `src/main/java/org/apache/bcel/classfile/StackMapEntry.java`
#### Snippet
```java
     */
    @java.lang.Deprecated
    public void setNumberOfLocals(final int n) { // TODO unused
    }

```

### EmptyMethod
The method is empty
in `src/main/java/org/apache/bcel/classfile/StackMapEntry.java`
#### Snippet
```java
     */
    @java.lang.Deprecated
    public void setNumberOfStackItems(final int n) { // TODO unused
    }

```

### EmptyMethod
The method and all its derivables are empty
in `src/main/java/org/apache/bcel/generic/EmptyVisitor.java`
#### Snippet
```java

    @Override
    public void visitGOTO(final GOTO obj) {
    }

```

### EmptyMethod
The method and all its derivables are empty
in `src/main/java/org/apache/bcel/generic/EmptyVisitor.java`
#### Snippet
```java

    @Override
    public void visitGOTO_W(final GOTO_W obj) {
    }

```

### EmptyMethod
The method and all its derivables are empty
in `src/main/java/org/apache/bcel/generic/EmptyVisitor.java`
#### Snippet
```java

    @Override
    public void visitNOP(final NOP obj) {
    }

```

### EmptyMethod
The method is empty
in `src/main/java/org/apache/bcel/generic/InstructionHandle.java`
#### Snippet
```java
     */
    @Deprecated
    protected void addHandle() {
        // noop
    }
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java

        @Override
        public void visitCodeException(final CodeException obj) {
            // Code constraints are checked in Pass3 (3a and 3b).
            // This does not represent an Attribute but is only
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java

        @Override
        public void visitConstantPool(final ConstantPool obj) {
            // No need to. We're piggybacked by the DescendingVisitor.
            // This does not represent an Attribute but is only
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java

        @Override
        public void visitInnerClass(final InnerClass obj) {
            // This does not represent an Attribute but is only
            // related to internal BCEL data representation.
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java

        @Override
        public void visitLineNumber(final LineNumber obj) {
            // This does not represent an Attribute but is only
            // related to internal BCEL data representation.
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java
        //////////
        @Override
        public void visitLocalVariable(final LocalVariable obj) {
            // This does not represent an Attribute but is only
            // related to internal BCEL data representation.
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java

        @Override
        public void visitLocalVariableTable(final LocalVariableTable obj) {// vmspec2 4.7.9
            // In JustIce,this check is partially delayed to Pass 3a.
            // The other part can be found in the visitCode(Code) method.
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/statics/Pass3aVerifier.java`
#### Snippet
```java
        /** Checks if the constraints of operands of the said instruction(s) are satisfied. */
        @Override
        public void visitTABLESWITCH(final TABLESWITCH o) {
            // "high" must be >= "low". We cannot check this, as BCEL hides
            // it from us.
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/ExecutionVisitor.java`
#### Snippet
```java
    /** Symbolically executes the corresponding Java Virtual Machine instruction. */
    @Override
    public void visitIINC(final IINC o) {
        // stack is not changed.
    }
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/ExecutionVisitor.java`
#### Snippet
```java
    /** Symbolically executes the corresponding Java Virtual Machine instruction. */
    @Override
    public void visitRET(final RET o) {
        // do nothing, return address
        // is in the local variables.
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/ExecutionVisitor.java`
#### Snippet
```java
    /** Symbolically executes the corresponding Java Virtual Machine instruction. */
    @Override
    public void visitRETURN(final RETURN o) {
        // do nothing.
    }
```

### EmptyMethod
Method only calls its super
in `src/main/java/org/apache/bcel/verifier/structurals/GenericArray.java`
#### Snippet
```java

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitACONST_NULL(final ACONST_NULL o) {
        // Nothing needs to be done here.
    }
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitALOAD(final ALOAD o) {
        // visitLoadInstruction(LoadInstruction) is called before.

```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitBIPUSH(final BIPUSH o) {
        // Nothing to do...
    }
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitDCONST(final DCONST o) {
        // There's nothing to be done here.
    }
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitDLOAD(final DLOAD o) {
        // visitLoadInstruction(LoadInstruction) is called before.

```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitDSTORE(final DSTORE o) {
        // visitStoreInstruction(StoreInstruction) is called before.

```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitFCONST(final FCONST o) {
        // nothing to do here.
    }
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitFLOAD(final FLOAD o) {
        // visitLoadInstruction(LoadInstruction) is called before.

```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitFSTORE(final FSTORE o) {
        // visitStoreInstruction(StoreInstruction) is called before.

```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitGETSTATIC(final GETSTATIC o) {
        // Field must be static: see Pass 3a.
    }
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitICONST(final ICONST o) {
        // nothing to do here.
    }
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitILOAD(final ILOAD o) {
        // All done by visitLocalVariableInstruction(), visitLoadInstruction()
    }
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitInvokeInstruction(final InvokeInstruction o) {
        // visitLoadClass(o) has been called before: Every FieldOrMethod
        // implements LoadClass.
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitISTORE(final ISTORE o) {
        // visitStoreInstruction(StoreInstruction) is called before.

```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitJSR(final JSR o) {
        // nothing to do here.
    }
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitJSR_W(final JSR_W o) {
        // nothing to do here.
    }
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitLCONST(final LCONST o) {
        // Nothing to do here.
    }
```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitLLOAD(final LLOAD o) {
        // visitLoadInstruction(LoadInstruction) is called before.

```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitLSTORE(final LSTORE o) {
        // visitStoreInstruction(StoreInstruction) is called before.

```

### EmptyMethod
Empty method overrides empty method
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitSIPUSH(final SIPUSH o) {
        // nothing to do here. Generic visitXXX() methods did the trick before.
    }
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-17-08-16-32.996.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/bcel/verifier/structurals/Subroutines.java`
#### Snippet
```java
        private static final int UNSET = -1;

        private final SubroutineImpl[] EMPTY_ARRAY = {};

        /**
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `src/main/java/org/apache/bcel/classfile/ConstantUtf8.java`
#### Snippet
```java
        }
        considered++;
        synchronized (ConstantUtf8.class) { // might be better with a specific lock object
            ConstantUtf8 result = Cache.CACHE.get(value);
            if (result != null) {
```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `detailMessage` of exception class
in `src/main/java/org/apache/bcel/verifier/exc/VerifierConstraintViolatedException.java`
#### Snippet
```java
    private static final long serialVersionUID = 2946136970490179465L;
    /** The specified error message. */
    private String detailMessage;

    /**
```

### NonFinalFieldOfException
Non-final field `detailMessage` of exception class
in `src/main/java/org/apache/bcel/verifier/exc/AssertionViolatedException.java`
#### Snippet
```java

    /** The error message. */
    private String detailMessage;

    /** Constructs a new AssertionViolatedException with null as its error message string. */
```

## RuleId[id=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'ObjectType' type conflicts with preceding 'instanceof ReferenceType' check
in `src/main/java/org/apache/bcel/generic/InstructionFactory.java`
#### Snippet
```java
            return new CHECKCAST(cp.addArrayClass((ArrayType) destType));
        }
        return new CHECKCAST(cp.addClass(((ObjectType) destType).getClassName()));
    }

```

## RuleId[id=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `CodeException` ends with 'Exception'
in `src/main/java/org/apache/bcel/classfile/CodeException.java`
#### Snippet
```java
 * @see Code
 */
public final class CodeException implements Cloneable, Node, Constants {

    /**
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `index` initializer `-1` is redundant
in `src/main/java/org/apache/bcel/classfile/StackMapType.java`
#### Snippet
```java

    private byte type;
    private int index = -1; // Index to CONSTANT_Class or offset
    private ConstantPool constantPool;

```

### UnusedAssignment
Variable `source` initializer `HEAP` is redundant
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java

    private AnnotationEntry[] annotations; // annotations defined on the class
    private byte source = HEAP; // Generated in memory

    private boolean isAnonymous;
```

### UnusedAssignment
Variable `attr` initializer `null` is redundant
in `src/main/java/org/apache/bcel/classfile/Attribute.java`
#### Snippet
```java
    @Override
    public Object clone() {
        Attribute attr = null;
        try {
            attr = (Attribute) super.clone();
```

### UnusedAssignment
Variable `jc` initializer `null` is redundant
in `src/main/java/org/apache/bcel/verifier/VerifierAppFrame.java`
#### Snippet
```java
                    rejected = true;
                }
                JavaClass jc = null;
                try {
                    jc = Repository.lookupClass(v.getClassName());
```

### UnusedAssignment
Variable `jc` initializer `null` is redundant
in `src/main/java/org/apache/bcel/verifier/VerifierAppFrame.java`
#### Snippet
```java
                    rejected = true;
                }
                JavaClass jc = null;
                try {
                    jc = Repository.lookupClass(v.getClassName());
```

### UnusedAssignment
Variable `i` initializer `null` is redundant
in `src/main/java/org/apache/bcel/generic/InstructionFactory.java`
#### Snippet
```java
            }
            final String name = "org.apache.bcel.generic." + shortNames[src - Const.T_CHAR] + "2" + shortNames[dest - Const.T_CHAR];
            Instruction i = null;
            try {
                i = (Instruction) Class.forName(name).newInstance();
```

### UnusedAssignment
Variable `returnedType` initializer `null` is redundant
in `src/main/java/org/apache/bcel/verifier/structurals/Pass3bVerifier.java`
#### Snippet
```java
                }
                // see JVM $4.8.2
                Type returnedType = null;
                final OperandStack inStack = ic.getInFrame().getStack();
                if (inStack.size() >= 1) {
```

### UnusedAssignment
Variable `method` initializer `null` is redundant
in `src/main/java/org/apache/bcel/util/JavaWrapper.java`
#### Snippet
```java
    public void runMain(final String className, final String[] argv) throws ClassNotFoundException {
        final Class<?> cl = loader.loadClass(className);
        Method method = null;
        try {
            method = cl.getMethod("main", argv.getClass());
```

### UnusedAssignment
Variable `parser` initializer `null` is redundant
in `src/main/java/org/apache/bcel/util/Class2HTML.java`
#### Snippet
```java
        final String[] fileName = new String[argv.length];
        int files = 0;
        ClassParser parser = null;
        JavaClass javaClass = null;
        String zipFile = null;
```

### UnusedAssignment
Variable `javaClass` initializer `null` is redundant
in `src/main/java/org/apache/bcel/util/Class2HTML.java`
#### Snippet
```java
        int files = 0;
        ClassParser parser = null;
        JavaClass javaClass = null;
        String zipFile = null;
        final char sep = File.separatorChar;
```

### UnusedAssignment
Variable `attributes` initializer `null` is redundant
in `src/main/java/org/apache/bcel/generic/ClassGen.java`
#### Snippet
```java
        final Field[] fields = getFields();
        final Method[] methods = getMethods();
        Attribute[] attributes = null;
        if (annotationList.isEmpty()) {
            attributes = getAttributes();
```

### UnusedAssignment
Variable `superclassNameIndex` initializer `-1` is redundant
in `src/main/java/org/apache/bcel/generic/ClassGen.java`
#### Snippet
```java
    private final String fileName;
    private int classNameIndex = -1;
    private int superclassNameIndex = -1;
    private int major = Const.MAJOR_1_1;
    private int minor = Const.MINOR_1_1;
```

### UnusedAssignment
Variable `classNameIndex` initializer `-1` is redundant
in `src/main/java/org/apache/bcel/generic/ClassGen.java`
#### Snippet
```java
    private String superClassName;
    private final String fileName;
    private int classNameIndex = -1;
    private int superclassNameIndex = -1;
    private int major = Const.MAJOR_1_1;
```

### UnusedAssignment
The value `in.read()` assigned to `ch` is never used
in `src/main/java/org/apache/bcel/classfile/Signature.java`
#### Snippet
```java
                }
                buf.append(buf2);
                ch = in.read();
                in.unread();
                // System.out.println("so far:" + buf2 + ":next:" +(char)ch);
```

### UnusedAssignment
Variable `jc` initializer `null` is redundant
in `src/main/java/org/apache/bcel/verifier/VerifyDialog.java`
#### Snippet
```java
        VerificationResult vr = v.doPass2();
        if (vr.getStatus() == VerificationResult.VERIFIED_OK) {
            JavaClass jc = null;
            try {
                jc = Repository.lookupClass(className);
```

### UnusedAssignment
The value `GENERIC_ARRAY` assigned to `objref` is never used
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
                constraintViolated(o, "Expecting an ObjectType as 'objectref' on the stack, not a '" + objref + "'.");
            } else {
                objref = GENERIC_ARRAY;
            }
        }
```

### UnusedAssignment
Variable `objRefClassName` initializer `null` is redundant
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
                constraintViolated(o, "Expecting a reference type as 'objectref' on the stack, not a '" + objref + "'.");
            }
            String objRefClassName = null;
            if (!o.getMethodName(cpg).equals(Const.CONSTRUCTOR_NAME)) {
                referenceTypeIsInitialized(o, (ReferenceType) objref);
```

### UnusedAssignment
Variable `parameters` initializer `EMPTY_METHOD_PARAMETER_ARRAY` is redundant
in `src/main/java/org/apache/bcel/classfile/MethodParameters.java`
#### Snippet
```java
    private static final MethodParameter[] EMPTY_METHOD_PARAMETER_ARRAY = {};

    private MethodParameter[] parameters = EMPTY_METHOD_PARAMETER_ARRAY;

    MethodParameters(final int nameIndex, final int length, final DataInput input, final ConstantPool constantPool) throws IOException {
```

### UnusedAssignment
Variable `cl` initializer `null` is redundant
in `src/main/java/org/apache/bcel/util/ClassLoader.java`
#### Snippet
```java
    @Override
    protected Class<?> loadClass(final String className, final boolean resolve) throws ClassNotFoundException {
        Class<?> cl = null;
        /*
         * First try: lookup hash table.
```

### UnusedAssignment
Variable `clazz` initializer `null` is redundant
in `src/main/java/org/apache/bcel/util/ClassLoader.java`
#### Snippet
```java
            }
            if (cl == null) {
                JavaClass clazz = null;
                /*
                 * Third try: Special request?
```

### UnusedAssignment
Variable `clazz` initializer `null` is redundant
in `src/main/java/org/apache/bcel/util/ClassLoader.java`
#### Snippet
```java
        final int index = className.indexOf(BCEL_TOKEN);
        final String realName = className.substring(index + BCEL_TOKEN.length());
        JavaClass clazz = null;
        try {
            final byte[] bytes = Utility.decode(realName, true);
```

### UnusedAssignment
Variable `type` initializer `""` is redundant
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
     */
    public static String signatureToString(final String signature, final boolean chopit) {
        String type = "";
        String typeParams = "";
        int index = 0;
```

### UnusedAssignment
The value `unwrap(CONSUMER_CHARS)` assigned to `index` is never used
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
            // add return type
            type = type + typeSignatureToString(signature.substring(index), chopit);
            index += unwrap(CONSUMER_CHARS); // update position
            // ignore any throws information in the signature
            return type;
```

### UnusedAssignment
Variable `obj` initializer `null` is redundant
in `src/main/java/org/apache/bcel/generic/Instruction.java`
#### Snippet
```java
        boolean wide = false;
        short opcode = (short) bytes.readUnsignedByte();
        Instruction obj = null;
        if (opcode == Const.WIDE) { // Read next opcode after wide byte
            wide = true;
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `rejected` is always `true`
in `src/main/java/org/apache/bcel/verifier/VerifierAppFrame.java`
#### Snippet
```java
        }
        pass3aTextPane.setText(all3amsg.toString());
        pass3aTextPane.setBackground(all3aok ? Color.green : rejected ? Color.red : Color.yellow);
    }

```

### ConstantValue
Condition `rejected` is always `true`
in `src/main/java/org/apache/bcel/verifier/VerifierAppFrame.java`
#### Snippet
```java
        }
        pass3bTextPane.setText(all3bmsg.toString());
        pass3bTextPane.setBackground(all3bok ? Color.green : rejected ? Color.red : Color.yellow);
    }

```

### ConstantValue
Condition `i < size` is always `true` when reached
in `src/main/java/org/apache/bcel/util/InstructionFinder.java`
#### Snippet
```java
            if (Character.isLetterOrDigit(ch)) {
                final StringBuilder name = new StringBuilder();
                while ((Character.isLetterOrDigit(ch) || ch == '_') && i < size) {
                    name.append(ch);
                    if (++i >= size) {
```

### ConstantValue
Condition `zipFile != null` is always `true`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
        @Override
        public void close() throws IOException {
            if (zipFile != null) {
                zipFile.close();
            }
```

### ConstantValue
Value `end` is always 'null'
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
             */
            if (!isStatic() && className != null) { // Instance method -> 'this' is local var 0
                addLocalVariable("this", ObjectType.getInstance(className), start, end);
            }
        }
```

### ConstantValue
Value `end` is always 'null'
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
            if (!abstract_) {
                for (int i = 0; i < size; i++) {
                    addLocalVariable(argNames[i], argTypes[i], start, end);
                }
            }
```

### ConstantValue
Condition `ins instanceof IINC` is always `false`
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
            for (InstructionHandle ih = il.getStart(); ih != null; ih = ih.getNext()) {
                final Instruction ins = ih.getInstruction();
                if (ins instanceof LocalVariableInstruction || ins instanceof RET || ins instanceof IINC) {
                    final int index = ((IndexedInstruction) ins).getIndex() + ((TypedInstruction) ins).getType(super.getConstantPool()).getSize();
                    if (index > max) {
```

## RuleId[id=IOResource]
### IOResource
'GZIPInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
        }
        if (uncompress) {
            final GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(bytes));
            final byte[] tmp = new byte[bytes.length * 3]; // Rough estimate
            int count = 0;
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `GraphicalVerifier` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/bcel/verifier/GraphicalVerifier.java`
#### Snippet
```java
 * A graphical user interface application demonstrating JustIce.
 */
public class GraphicalVerifier {

    private static final boolean packFrame = false;
```

### UtilityClassWithoutPrivateConstructor
Class `Args` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/bcel/util/Args.java`
#### Snippet
```java
 * @since 6.7.0
 */
public class Args {

    /**
```

### UtilityClassWithoutPrivateConstructor
Class `ExceptionConst` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/bcel/ExceptionConst.java`
#### Snippet
```java
 * @since 6.0 (intended to replace the InstructionConstant interface)
 */
public final class ExceptionConst {

    /**
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `AnnotationEntryGen.getAnnotationAttributes(cp, super.getAnnotationEntries())` might be null
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java

    private void addAnnotationsAsAttribute(final ConstantPoolGen cp) {
        Stream.of(AnnotationEntryGen.getAnnotationAttributes(cp, super.getAnnotationEntries())).forEach(this::addAttribute);
    }

```

### DataFlowIssue
Casting `i` to `MULTIANEWARRAY` may produce `ClassCastException`
in `src/main/java/org/apache/bcel/util/BCELFactory.java`
#### Snippet
```java
            break;
        case Const.MULTIANEWARRAY:
            dim = ((MULTIANEWARRAY) i).getDimensions();
            //$FALL-THROUGH$
        case Const.NEWARRAY:
```

### DataFlowIssue
Dereference of `annAttributes` may produce `NullPointerException`
in `src/main/java/org/apache/bcel/generic/ClassGen.java`
#### Snippet
```java
            // TODO: Sometime later, trash any attributes called 'RuntimeVisibleAnnotations' or 'RuntimeInvisibleAnnotations'
            final Attribute[] annAttributes = AnnotationEntryGen.getAnnotationAttributes(cp, getAnnotationEntries());
            attributes = new Attribute[attributeList.size() + annAttributes.length];
            attributeList.toArray(attributes);
            System.arraycopy(annAttributes, 0, attributes, attributeList.size(), annAttributes.length);
```

### DataFlowIssue
Method invocation `getClassName` may produce `NullPointerException`
in `src/main/java/org/apache/bcel/verifier/statics/Pass3aVerifier.java`
#### Snippet
```java
            try {
                final String fieldName = o.getFieldName(constantPoolGen);
                final JavaClass jc = Repository.lookupClass(getObjectType(o).getClassName());
                final Field f = jc.findField(fieldName, o.getType(constantPoolGen));
                if (f == null) {
```

### DataFlowIssue
Method invocation `getCode` may produce `NullPointerException`
in `src/main/java/org/apache/bcel/verifier/statics/Pass3aVerifier.java`
#### Snippet
```java
                // instruction and so on.
                try {
                    instructionList = new InstructionList(method.getCode().getCode());
                } catch (final RuntimeException re) {
                    return new VerificationResult(VerificationResult.VERIFIED_REJECTED,
```

### DataFlowIssue
Method invocation `getClassName` may produce `NullPointerException`
in `src/main/java/org/apache/bcel/verifier/statics/Pass3aVerifier.java`
#### Snippet
```java
            try {
                final String fieldName = o.getFieldName(constantPoolGen);
                final JavaClass jc = Repository.lookupClass(getObjectType(o).getClassName());
                final Field f = jc.findField(fieldName, o.getType(constantPoolGen));
                if (f == null) {
```

### DataFlowIssue
Method invocation `getClassName` may produce `NullPointerException`
in `src/main/java/org/apache/bcel/verifier/statics/Pass3aVerifier.java`
#### Snippet
```java
                }

                if (f.isFinal() && !verifier.getClassName().equals(getObjectType(o).getClassName())) {
                    constraintViolated(o, "Referenced field '" + f + "' is final and must therefore be declared in the current class '"
                            + verifier.getClassName() + "' which is not the case: it is declared in '" + o.getReferenceType(constantPoolGen) + "'.");
```

### DataFlowIssue
Method invocation `getClassName` may produce `NullPointerException`
in `src/main/java/org/apache/bcel/verifier/statics/Pass3aVerifier.java`
#### Snippet
```java
                final String fieldName = o.getFieldName(constantPoolGen);

                final JavaClass jc = Repository.lookupClass(getObjectType(o).getClassName());
                final Field f = jc.findField(fieldName, o.getType(constantPoolGen));
                if (f == null) {
```

### DataFlowIssue
Method invocation `getMaxLocals` may produce `NullPointerException`
in `src/main/java/org/apache/bcel/verifier/statics/Pass3aVerifier.java`
#### Snippet
```java
        private int maxLocals() {
            try {
                return Repository.lookupClass(verifier.getClassName()).getMethods()[methodNo].getCode().getMaxLocals();
            } catch (final ClassNotFoundException e) {
                // FIXME: maybe not the best way to handle this
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
                final ObjectType curr = ObjectType.getInstance(mg.getClassName());

                if (classtype.equals(curr) || curr.subclassOf(classtype)) {
                    final Type tp = stack().peek(1);
                    if (tp == Type.NULL) {
```

### DataFlowIssue
Method invocation `getClassName` may produce `NullPointerException`
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
    private Field visitFieldInstructionInternals(final FieldInstruction o) throws ClassNotFoundException {
        final String fieldName = o.getFieldName(cpg);
        final JavaClass jc = Repository.lookupClass(getObjectType(o).getClassName());
        final Field f = jc.findField(fieldName, o.getType(cpg));
        if (f == null) {
```

### DataFlowIssue
Method invocation `getClassName` may produce `NullPointerException`
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
            final String fieldName = o.getFieldName(cpg);

            final JavaClass jc = Repository.lookupClass(getObjectType(o).getClassName());
            final Field f = jc.findField(fieldName, o.getType(cpg));
            if (f == null) {
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
                final ObjectType curr = ObjectType.getInstance(mg.getClassName());

                if (classtype.equals(curr) || curr.subclassOf(classtype)) {
                    final Type t = stack().peek();
                    if (t == Type.NULL) {
```

### DataFlowIssue
Casting `this` to `ObjectType` may produce `ClassCastException`
in `src/main/java/org/apache/bcel/generic/ReferenceType.java`
#### Snippet
```java
        }
        // this and t are ObjectTypes, see above.
        final ObjectType thiz = (ObjectType) this;
        final ObjectType other = (ObjectType) t;
        final JavaClass[] thizSups = Repository.getSuperClasses(thiz.getClassName());
```

### DataFlowIssue
Casting `t` to `ObjectType` may produce `ClassCastException`
in `src/main/java/org/apache/bcel/generic/ReferenceType.java`
#### Snippet
```java
        // this and t are ObjectTypes, see above.
        final ObjectType thiz = (ObjectType) this;
        final ObjectType other = (ObjectType) t;
        final JavaClass[] thizSups = Repository.getSuperClasses(thiz.getClassName());
        final JavaClass[] otherSups = Repository.getSuperClasses(other.getClassName());
```

### DataFlowIssue
Method invocation `getClassName` may produce `NullPointerException`
in `src/main/java/org/apache/bcel/generic/ReferenceType.java`
#### Snippet
```java
        final ObjectType other = (ObjectType) t;
        final JavaClass[] thizSups = Repository.getSuperClasses(thiz.getClassName());
        final JavaClass[] otherSups = Repository.getSuperClasses(other.getClassName());
        if (thizSups == null || otherSups == null) {
            return null;
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
        }

        return list.stream().collect(Collectors.joining(File.pathSeparator));
    }

```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'name_and_type_index' is still used
in `src/main/java/org/apache/bcel/classfile/ConstantCP.java`
#### Snippet
```java
     */
    @java.lang.Deprecated
    protected int name_and_type_index; // TODO make private (has getter & setter)

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'class_index' is still used
in `src/main/java/org/apache/bcel/classfile/ConstantCP.java`
#### Snippet
```java
     */
    @java.lang.Deprecated
    protected int class_index; // TODO make private (has getter & setter)
    // This field has the same meaning for all subclasses.

```

### DeprecatedIsStillUsed
Deprecated member 'name_index' is still used
in `src/main/java/org/apache/bcel/classfile/FieldOrMethod.java`
#### Snippet
```java
     */
    @java.lang.Deprecated
    protected int name_index; // Points to field name in constant pool

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'constant_pool' is still used
in `src/main/java/org/apache/bcel/classfile/FieldOrMethod.java`
#### Snippet
```java
     */
    @java.lang.Deprecated
    protected ConstantPool constant_pool;

    private String signatureAttributeString;
```

### DeprecatedIsStillUsed
Deprecated member 'attributes_count' is still used
in `src/main/java/org/apache/bcel/classfile/FieldOrMethod.java`
#### Snippet
```java
     */
    @java.lang.Deprecated
    protected int attributes_count; // No. of attributes

    // @since 6.0
```

### DeprecatedIsStillUsed
Deprecated member 'signature_index' is still used
in `src/main/java/org/apache/bcel/classfile/FieldOrMethod.java`
#### Snippet
```java
     */
    @java.lang.Deprecated
    protected int signature_index; // Points to encoded signature

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'i_position' is still used
in `src/main/java/org/apache/bcel/generic/InstructionHandle.java`
#### Snippet
```java
     */
    @Deprecated
    protected int i_position = -1; // byte code offset of instruction
    private Set<InstructionTargeter> targeters;

```

### DeprecatedIsStillUsed
Deprecated member 'InstructionConstants' is still used
in `src/main/java/org/apache/bcel/generic/InstructionConstants.java`
#### Snippet
```java
 */
@Deprecated
public interface InstructionConstants {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'cpGen' is still used
in `src/main/java/org/apache/bcel/generic/ElementValueGen.java`
#### Snippet
```java
     */
    @Deprecated
    protected ConstantPoolGen cpGen;

    protected ElementValueGen(final int type, final ConstantPoolGen cpGen) {
```

### DeprecatedIsStillUsed
Deprecated member 'access_flags' is still used
in `src/main/java/org/apache/bcel/classfile/AccessFlags.java`
#### Snippet
```java
     */
    @java.lang.Deprecated
    protected int access_flags; // TODO not used externally at present

    public AccessFlags() {
```

### DeprecatedIsStillUsed
Deprecated member 'padding' is still used
in `src/main/java/org/apache/bcel/generic/Select.java`
#### Snippet
```java
     */
    @Deprecated
    protected int padding; // number of pad bytes for alignment TODO could be package-protected?

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'match_length' is still used
in `src/main/java/org/apache/bcel/generic/Select.java`
#### Snippet
```java
     */
    @Deprecated
    protected int match_length; // number of cases TODO could be package-protected?

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'fixed_length' is still used
in `src/main/java/org/apache/bcel/generic/Select.java`
#### Snippet
```java
     */
    @Deprecated
    protected int fixed_length; // fixed length defined by subclasses TODO could be package-protected?

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'constant_pool' is still used
in `src/main/java/org/apache/bcel/classfile/Attribute.java`
#### Snippet
```java
     */
    @java.lang.Deprecated
    protected ConstantPool constant_pool; // TODO make private (has getter & setter)

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'name_index' is still used
in `src/main/java/org/apache/bcel/classfile/Attribute.java`
#### Snippet
```java
     */
    @java.lang.Deprecated
    protected int name_index; // Points to attribute name in constant pool TODO make private (has getter & setter)

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'vec' is still used
in `src/main/java/org/apache/bcel/util/ClassQueue.java`
#### Snippet
```java
     */
    @Deprecated
    protected LinkedList<JavaClass> vec = new LinkedList<>(); // TODO not used externally

    public JavaClass dequeue() {
```

### DeprecatedIsStillUsed
Deprecated member '_this' is still used
in `src/main/java/org/apache/bcel/verifier/structurals/Frame.java`
#### Snippet
```java
     */
    @Deprecated
    protected static UninitializedObjectType _this;

    /**
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/bcel/classfile/StackMapEntry.java`
#### Snippet
```java
            buf.append("SAME_LOCALS_1_STACK_EXTENDED");
        } else if (frameType >= Const.CHOP_FRAME && frameType <= Const.CHOP_FRAME_MAX) {
            buf.append("CHOP ").append(String.valueOf(251 - frameType));
        } else if (frameType == Const.SAME_FRAME_EXTENDED) {
            buf.append("SAME_EXTENDED");
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/bcel/classfile/StackMapEntry.java`
#### Snippet
```java
            buf.append("SAME_EXTENDED");
        } else if (frameType >= Const.APPEND_FRAME && frameType <= Const.APPEND_FRAME_MAX) {
            buf.append("APPEND ").append(String.valueOf(frameType - 251));
        } else if (frameType == Const.FULL_FRAME) {
            buf.append("FULL");
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/main/java/org/apache/bcel/verifier/structurals/OperandStack.java`
#### Snippet
```java
            sb.append(peek(i));
            sb.append(" (Size: ");
            sb.append(String.valueOf(peek(i).getSize()));
            sb.append(")\n");
        }
```

### UnnecessaryCallToStringValueOf
Unnecessary `Integer.toString()` call
in `src/main/java/org/apache/bcel/verifier/structurals/LocalVariables.java`
#### Snippet
```java
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < locals.length; i++) {
            sb.append(Integer.toString(i));
            sb.append(": ");
            sb.append(locals[i]);
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'targets' in a Serializable class
in `src/main/java/org/apache/bcel/generic/TargetLostException.java`
#### Snippet
```java

    private static final long serialVersionUID = -6857272667645328384L;
    private final InstructionHandle[] targets;

    TargetLostException(final InstructionHandle[] t, final String mesg) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'ivjEventHandler' in a Serializable class
in `src/main/java/org/apache/bcel/verifier/VerifyDialog.java`
#### Snippet
```java

    /** Machine-generated. */
    private final IvjEventHandler ivjEventHandler = new IvjEventHandler();

    /**
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java

    /**
     * @return list of super classes of this class in ascending order, i.e., java.lang.Object is always the last element
     * @throws ClassNotFoundException if any of the superclasses can't be found
     */
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `src/main/java/org/apache/bcel/generic/TargetLostException.java`
#### Snippet
```java

    /**
     * @return list of instructions still being targeted.
     */
    public InstructionHandle[] getTargets() {
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `src/main/java/org/apache/bcel/Repository.java`
#### Snippet
```java

    /**
     * @return list of super classes of clazz in ascending order, i.e., Object is always the last element.
     * @throws ClassNotFoundException if the named class or any of its superclasses can't be found
     */
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `src/main/java/org/apache/bcel/Repository.java`
#### Snippet
```java

    /**
     * @return list of super classes of clazz in ascending order, i.e., Object is always the last element
     * @throws ClassNotFoundException if any of the superclasses can't be found
     */
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/bcel/verifier/statics/Pass3aVerifier.java`
#### Snippet
```java
     * RuntimeException, or else it is a string derived only from obj's class name.
     */
    protected String tostring(final Object obj) {
        String ret;
        try {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/bcel/util/BCELifier.java`
#### Snippet
```java
            }
        }
        return "new Type[] { " + args.toString() + " }";
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/bcel/verifier/statics/Pass1Verifier.java`
#### Snippet
```java
            // BCEL does not catch every possible RuntimeException; e.g. if
            // a constant pool index is referenced that does not exist.
            return new VerificationResult(VerificationResult.VERIFIED_REJECTED, "Parsing via BCEL did not succeed. " + " exception occurred:\n" + e.toString());
            // Don't think we want to dump a stack trace unless we have some sort of a debug option.
            // e.getClass().getName()+" occurred:\n"+Utility.getStackTrace(e));
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
                final int temp = unwrap(Utility.CONSUMER_CHARS) + consumedChars;
                wrap(Utility.CONSUMER_CHARS, temp);
                return type + brackets.toString();
            }
            case 'V':
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
            }
        } catch (final IOException e) {
            throw new ClassFormatException("Byte code error: " + buf.toString(), e);
        }
        return buf.toString();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
        buf.append(")");
        return access + (!access.isEmpty() ? " " : "") + // May be an empty string
            type + " " + name + buf.toString();
    }

```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/bcel/util/InstructionFinder.java`
#### Snippet
```java
                while ((Character.isLetterOrDigit(ch) || ch == '_') && i < size) {
                    name.append(ch);
                    if (++i >= size) {
                        break;
                    }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/bcel/util/InstructionFinder.java`
#### Snippet
```java
                    ch = lower.charAt(i);
                }
                i--;
                buf.append(mapName(name.toString()));
            } else if (!Character.isWhitespace(ch)) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/bcel/util/Class2HTML.java`
#### Snippet
```java
            if (argv[i].charAt(0) == '-') { // command line switch
                if (argv[i].equals("-d")) { // Specify target directory, default '.'
                    dir = argv[++i];
                    if (!dir.endsWith("" + sep)) {
                        dir = dir + sep;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/bcel/util/Class2HTML.java`
#### Snippet
```java
                    }
                } else if (argv[i].equals("-zip")) {
                    zipFile = argv[++i];
                } else {
                    System.out.println("Unknown option " + argv[i]);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `pow`
in `src/main/java/org/apache/bcel/util/BCELifier.java`
#### Snippet
```java
                }
            }
            pow <<= 1;
        }
        final String str = buf.toString();
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/bcel/classfile/ConstantPool.java`
#### Snippet
```java
            tag = constantPool[i].getTag();
            if (tag == Const.CONSTANT_Double || tag == Const.CONSTANT_Long) {
                i++;
            }
        }
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java

    @SuppressWarnings("resource")
    public ClassPath(final ClassPath parent, final String classPathString) {
        this.parent = parent;
        this.classPathString = Objects.requireNonNull(classPathString, "classPathString");
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
        try {
            final java.lang.ClassLoader classLoader = getClass().getClassLoader();
            @SuppressWarnings("resource") // closed by caller
            final
            InputStream inputStream = classLoader == null ? null : classLoader.getResourceAsStream(name + suffix);
            if (inputStream != null) {
                return inputStream;
```

### RedundantSuppression
Redundant suppression
in `src/main/java/org/apache/bcel/util/ModularRuntimeImage.java`
#### Snippet
```java
     */
    @SuppressWarnings("resource") // See #close()
    public ModularRuntimeImage() {
        this(null, FileSystems.getFileSystem(URI.create("jrt:/")));
    }
```

## RuleId[id=UtilityClassWithPublicConstructor]
### UtilityClassWithPublicConstructor
Class `GraphicalVerifier` has only 'static' members, and a 'public' constructor
in `src/main/java/org/apache/bcel/verifier/GraphicalVerifier.java`
#### Snippet
```java
 * A graphical user interface application demonstrating JustIce.
 */
public class GraphicalVerifier {

    private static final boolean packFrame = false;
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/FCONST.java`
#### Snippet
```java
    @Override
    public Number getValue() {
        return Float.valueOf(value);
    }
}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/classfile/ConstantInteger.java`
#### Snippet
```java
    @Override
    public Object getConstantValue(final ConstantPool cp) {
        return Integer.valueOf(bytes);
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/SIPUSH.java`
#### Snippet
```java
    @Override
    public Number getValue() {
        return Integer.valueOf(b);
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/classfile/ConstantLong.java`
#### Snippet
```java
    @Override
    public Object getConstantValue(final ConstantPool cp) {
        return Long.valueOf(bytes);
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/LCONST.java`
#### Snippet
```java
    @Override
    public Number getValue() {
        return Long.valueOf(value);
    }
}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
        checkType(Type.INT);
        if (i != 0) {
            value = Integer.valueOf(i);
        }
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
        checkType(Type.DOUBLE);
        if (d != 0.0) {
            value = Double.valueOf(d);
        }
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
        checkType(Type.SHORT);
        if (s != 0) {
            value = Integer.valueOf(s);
        }
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
        checkType(Type.LONG);
        if (l != 0L) {
            value = Long.valueOf(l);
        }
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
        checkType(Type.CHAR);
        if (c != 0) {
            value = Integer.valueOf(c);
        }
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
        checkType(Type.FLOAT);
        if (f != 0.0) {
            value = Float.valueOf(f);
        }
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
        checkType(Type.BYTE);
        if (b != 0) {
            value = Integer.valueOf(b);
        }
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
        checkType(Type.BOOLEAN);
        if (b) {
            value = Integer.valueOf(1);
        }
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/Type.java`
#### Snippet
```java

    private static void wrap(final ThreadLocal<Integer> tl, final int value) {
        tl.set(Integer.valueOf(value));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/Type.java`
#### Snippet
```java
    };

    private static final ThreadLocal<Integer> CONSUMED_CHARS = ThreadLocal.withInitial(() -> Integer.valueOf(0));

    // int consumed_chars=0; // Remember position in string, see getArgumentTypes
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/ICONST.java`
#### Snippet
```java
    @Override
    public Number getValue() {
        return Integer.valueOf(value);
    }
}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/classfile/ConstantDouble.java`
#### Snippet
```java
    @Override
    public Object getConstantValue(final ConstantPool cp) {
        return Double.valueOf(bytes);
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/DCONST.java`
#### Snippet
```java
    @Override
    public Number getValue() {
        return Double.valueOf(value);
    }
}
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/verifier/statics/IntList.java`
#### Snippet
```java
    /** Adds an element to the list. */
    void add(final int i) {
        list.add(Integer.valueOf(i));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/classfile/ConstantFloat.java`
#### Snippet
```java
    @Override
    public Object getConstantValue(final ConstantPool cp) {
        return Float.valueOf(bytes);
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/LDC2_W.java`
#### Snippet
```java
        switch (c.getTag()) {
        case org.apache.bcel.Const.CONSTANT_Long:
            return Long.valueOf(((org.apache.bcel.classfile.ConstantLong) c).getBytes());
        case org.apache.bcel.Const.CONSTANT_Double:
            return Double.valueOf(((org.apache.bcel.classfile.ConstantDouble) c).getBytes());
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/LDC2_W.java`
#### Snippet
```java
            return Long.valueOf(((org.apache.bcel.classfile.ConstantLong) c).getBytes());
        case org.apache.bcel.Const.CONSTANT_Double:
            return Double.valueOf(((org.apache.bcel.classfile.ConstantDouble) c).getBytes());
        default: // Never reached
            throw new IllegalArgumentException("Unknown or invalid constant type at " + super.getIndex());
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/BIPUSH.java`
#### Snippet
```java
    @Override
    public Number getValue() {
        return Integer.valueOf(b);
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/ConstantPoolGen.java`
#### Snippet
```java

    private int computeIfAbsent(final Map<String, Integer> map, final String key, final int value) {
        return map.computeIfAbsent(key, k -> Integer.valueOf(value));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/ConstantPoolGen.java`
#### Snippet
```java
                final String key = u8.getBytes();
                if (!stringTable.containsKey(key)) {
                    stringTable.put(key, Integer.valueOf(i));
                }
            } else if (c instanceof ConstantClass) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/ConstantPoolGen.java`
#### Snippet
```java
                final String key = u8.getBytes();
                if (!classTable.containsKey(key)) {
                    classTable.put(key, Integer.valueOf(i));
                }
            } else if (c instanceof ConstantNameAndType) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/ConstantPoolGen.java`
#### Snippet
```java

                if (!natTable.containsKey(key)) {
                    natTable.put(key, Integer.valueOf(i));
                }
            } else if (c instanceof ConstantUtf8) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/ConstantPoolGen.java`
#### Snippet
```java
                final String key = u.getBytes();
                if (!utf8Table.containsKey(key)) {
                    utf8Table.put(key, Integer.valueOf(i));
                }
            } else if (c instanceof ConstantCP) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/ConstantPoolGen.java`
#### Snippet
```java

                if (!cpTable.containsKey(key)) {
                    cpTable.put(key, Integer.valueOf(i));
                }
            }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java

    private static void wrap(final ThreadLocal<Integer> tl, final int value) {
        tl.set(Integer.valueOf(value));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
     * by side effect, but only internally.
     */
    private static final ThreadLocal<Integer> CONSUMER_CHARS = ThreadLocal.withInitial(() -> Integer.valueOf(0));

    /*
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
            return ((org.apache.bcel.classfile.ConstantUtf8) c).getBytes();
        case org.apache.bcel.Const.CONSTANT_Float:
            return Float.valueOf(((org.apache.bcel.classfile.ConstantFloat) c).getBytes());
        case org.apache.bcel.Const.CONSTANT_Integer:
            return Integer.valueOf(((org.apache.bcel.classfile.ConstantInteger) c).getBytes());
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
            return Float.valueOf(((org.apache.bcel.classfile.ConstantFloat) c).getBytes());
        case org.apache.bcel.Const.CONSTANT_Integer:
            return Integer.valueOf(((org.apache.bcel.classfile.ConstantInteger) c).getBytes());
        case org.apache.bcel.Const.CONSTANT_Class:
            final int nameIndex = ((org.apache.bcel.classfile.ConstantClass) c).getNameIndex();
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/verifier/structurals/Subroutines.java`
#### Snippet
```java
            final int index = ((RET) sub2.getLeavingRET().getInstruction()).getIndex();

            if (!set.add(Integer.valueOf(index))) {
                // Don't use toString() here because of possibly infinite recursive subSubs() calls then.
                final SubroutineImpl si = (SubroutineImpl) sub2;
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/verifier/structurals/Subroutines.java`
#### Snippet
```java
            noRecursiveCalls(sub2, set);

            set.remove(Integer.valueOf(index));
        }
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/verifier/structurals/Subroutines.java`
#### Snippet
```java
                final int[] lvs = sub.getAccessedLocalsIndices();
                for (final int lv : lvs) {
                    set.add(Integer.valueOf(lv));
                }
                if (sub.subSubs().length != 0) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/verifier/structurals/Subroutines.java`
#### Snippet
```java
            final int[] lvs = getAccessedLocalsIndices();
            for (final int lv : lvs) {
                s.add(Integer.valueOf(lv));
            }
            getRecursivelyAccessedLocalsIndicesHelper(s, this.subSubs());
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/verifier/structurals/Subroutines.java`
#### Snippet
```java
                    if (ih.getInstruction() instanceof LocalVariableInstruction || ih.getInstruction() instanceof RET) {
                        final int idx = ((IndexedInstruction) ih.getInstruction()).getIndex();
                        acc.add(Integer.valueOf(idx));
                        // LONG? DOUBLE?.
                        try {
```

### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/bcel/verifier/structurals/Subroutines.java`
#### Snippet
```java
                                final int s = ((LocalVariableInstruction) ih.getInstruction()).getType(null).getSize();
                                if (s == 2) {
                                    acc.add(Integer.valueOf(idx + 1));
                                }
                            }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java
    static void Debug(final String str) {
        if (debug) {
            System.out.println(str);
        }
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/generic/EnumElementValueGen.java`
#### Snippet
```java
    @Override
    public ElementValue getElementValue() {
        System.err.println("Duplicating value: " + getEnumTypeString() + ":" + getEnumValueString());
        return new EnumElementValue(super.getElementValueType(), typeIdx, valueIdx, getConstantPool().getConstantPool());
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/classfile/Attribute.java`
#### Snippet
```java
    protected static void println(final String msg) {
        if (debug) {
            System.err.println(msg);
        }
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/generic/AnnotationEntryGen.java`
#### Snippet
```java
            return newAttributes.toArray(Attribute.EMPTY_ARRAY);
        } catch (final IOException e) {
            System.err.println("IOException whilst processing annotations");
            e.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/generic/AnnotationEntryGen.java`
#### Snippet
```java
            return newAttributes.toArray(Attribute.EMPTY_ARRAY);
        } catch (final IOException e) {
            System.err.println("IOException whilst processing parameter annotations");
            e.printStackTrace();
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/util/JavaWrapper.java`
#### Snippet
```java
            }
        } catch (final NoSuchMethodException no) {
            System.out.println("In class " + className + ": public static void main(String[] argv) is not defined");
            return;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/util/JavaWrapper.java`
#### Snippet
```java
         */
        if (argv.length == 0) {
            System.out.println("Missing class name.");
            return;
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
                } catch (final IOException e) {
                    if (path.endsWith(".zip") || path.endsWith(".jar")) {
                        System.err.println("CLASSPATH component " + file + ": " + e);
                    }
                }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/util/Class2HTML.java`
#### Snippet
```java
                        final boolean created = store.mkdirs(); // Create target directory if necessary
                        if (!created && !store.isDirectory()) {
                            System.out.println("Tried to create the directory " + dir + " but failed");
                        }
                    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/util/Class2HTML.java`
#### Snippet
```java
                    zipFile = argv[++i];
                } else {
                    System.out.println("Unknown option " + argv[i]);
                }
            } else {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/util/Class2HTML.java`
#### Snippet
```java
        }
        if (files == 0) {
            System.err.println("Class2HTML: No input files specified.");
        } else { // Loop through files ...
            for (int i = 0; i < files; i++) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/util/Class2HTML.java`
#### Snippet
```java
        } else { // Loop through files ...
            for (int i = 0; i < files; i++) {
                System.out.print("Processing " + fileName[i] + "...");
                if (zipFile == null) {
                    parser = new ClassParser(fileName[i]); // Create parser object from file
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/util/Class2HTML.java`
#### Snippet
```java
                javaClass = parser.parse();
                new Class2HTML(javaClass, dir);
                System.out.println("Done.");
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/TransitiveHull.java`
#### Snippet
```java
        System.gc(); // avoid swapping if possible.
        for (int i = 0; i < indent; i++) {
            System.out.print(" ");
        }
        System.out.println(className);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/TransitiveHull.java`
#### Snippet
```java
            System.out.print(" ");
        }
        System.out.println(className);
        indent += 1;
        final Verifier v = VerifierFactory.getVerifier(className);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/TransitiveHull.java`
#### Snippet
```java
        vr = v.doPass1();
        if (vr != VerificationResult.VR_OK) {
            System.out.println("Pass 1:\n" + vr);
        }
        vr = v.doPass2();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/TransitiveHull.java`
#### Snippet
```java
        vr = v.doPass2();
        if (vr != VerificationResult.VR_OK) {
            System.out.println("Pass 2:\n" + vr);
        }
        if (vr == VerificationResult.VR_OK) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/TransitiveHull.java`
#### Snippet
```java
                    vr = v.doPass3a(i);
                    if (vr != VerificationResult.VR_OK) {
                        System.out.println(v.getClassName() + ", Pass 3a, method " + i + " ['" + jc.getMethods()[i] + "']:\n" + vr);
                    }
                    vr = v.doPass3b(i);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/TransitiveHull.java`
#### Snippet
```java
                    vr = v.doPass3b(i);
                    if (vr != VerificationResult.VR_OK) {
                        System.out.println(v.getClassName() + ", Pass 3b, method " + i + " ['" + jc.getMethods()[i] + "']:\n" + vr);
                    }
                }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/TransitiveHull.java`
#### Snippet
```java
                }
            } catch (final ClassNotFoundException e) {
                System.err.println("Could not find class " + v.getClassName() + " in Repository");
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/TransitiveHull.java`
#### Snippet
```java
    public static void main(final String[] args) {
        if (args.length != 1) {
            System.out.println("Need exactly one argument: The root class to verify.");
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/util/BCELifier.java`
#### Snippet
```java
    public static void main(final String[] argv) throws Exception {
        if (argv.length != 1) {
            System.out.println("Usage: BCELifier className");
            System.out.println("\tThe class must exist on the classpath");
            return;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/util/BCELifier.java`
#### Snippet
```java
        if (argv.length != 1) {
            System.out.println("Usage: BCELifier className");
            System.out.println("\tThe class must exist on the classpath");
            return;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/util/BCELifier.java`
#### Snippet
```java
            return;
        }
        final BCELifier bcelifier = new BCELifier(getJavaClass(argv[0]), System.out);
        bcelifier.start();
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/VerifyDialog.java`
#### Snippet
```java
                aVerifyDialog.setVisible(true);
            } catch (final Throwable exception) {
                System.err.println("Exception occurred in main() of JDialog");
                exception.printStackTrace(System.out);
            }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/VerifyDialog.java`
#### Snippet
```java
            } catch (final Throwable exception) {
                System.err.println("Exception occurred in main() of JDialog");
                exception.printStackTrace(System.out);
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/VerifyDialog.java`
#### Snippet
```java
    private void handleException(final Throwable exception) {
        /* Uncomment the following lines to print uncaught exceptions to stdout */
        System.out.println("--------- UNCAUGHT EXCEPTION ---------");
        exception.printStackTrace(System.out);
        // manually added code
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/VerifyDialog.java`
#### Snippet
```java
        /* Uncomment the following lines to print uncaught exceptions to stdout */
        System.out.println("--------- UNCAUGHT EXCEPTION ---------");
        exception.printStackTrace(System.out);
        // manually added code
        if (exception instanceof ThreadDeath) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/generic/InstructionList.java`
#### Snippet
```java
            out.flush();
        } catch (final IOException e) {
            System.err.println(e);
            return ArrayUtils.EMPTY_BYTE_ARRAY;
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/classfile/ConstantUtf8.java`
#### Snippet
```java
    static void printStats() {
        final String prefix = "[Apache Commons BCEL]";
        System.err.printf("%s Cache hit %,d/%,d, %d skipped.%n", prefix, hits, considered, skipped);
        System.err.printf("%s Total of %,d ConstantUtf8 objects created.%n", prefix, created);
        System.err.printf("%s Configuration: %s=%,d, %s=%,d.%n", prefix, SYS_PROP_CACHE_MAX_ENTRIES, Cache.MAX_ENTRIES, SYS_PROP_CACHE_MAX_ENTRY_SIZE,
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/classfile/ConstantUtf8.java`
#### Snippet
```java
        final String prefix = "[Apache Commons BCEL]";
        System.err.printf("%s Cache hit %,d/%,d, %d skipped.%n", prefix, hits, considered, skipped);
        System.err.printf("%s Total of %,d ConstantUtf8 objects created.%n", prefix, created);
        System.err.printf("%s Configuration: %s=%,d, %s=%,d.%n", prefix, SYS_PROP_CACHE_MAX_ENTRIES, Cache.MAX_ENTRIES, SYS_PROP_CACHE_MAX_ENTRY_SIZE,
            Cache.MAX_ENTRY_SIZE);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/classfile/ConstantUtf8.java`
#### Snippet
```java
        System.err.printf("%s Cache hit %,d/%,d, %d skipped.%n", prefix, hits, considered, skipped);
        System.err.printf("%s Total of %,d ConstantUtf8 objects created.%n", prefix, created);
        System.err.printf("%s Configuration: %s=%,d, %s=%,d.%n", prefix, SYS_PROP_CACHE_MAX_ENTRIES, Cache.MAX_ENTRIES, SYS_PROP_CACHE_MAX_ENTRY_SIZE,
            Cache.MAX_ENTRY_SIZE);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/NativeVerifier.java`
#### Snippet
```java
    public static void main(final String[] args) {
        if (args.length != 1) {
            System.out.println("Verifier front-end: need exactly one argument.");
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/NativeVerifier.java`
#### Snippet
```java
            Class.forName(args[0]);
        } catch (final ExceptionInInitializerError eiie) { // subclass of LinkageError!
            System.out.println("NativeVerifier: ExceptionInInitializerError encountered on '" + args[0] + "'.");
            System.out.println(eiie);
            System.exit(1);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/NativeVerifier.java`
#### Snippet
```java
        } catch (final ExceptionInInitializerError eiie) { // subclass of LinkageError!
            System.out.println("NativeVerifier: ExceptionInInitializerError encountered on '" + args[0] + "'.");
            System.out.println(eiie);
            System.exit(1);
        } catch (final LinkageError le) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/NativeVerifier.java`
#### Snippet
```java
            System.exit(1);
        } catch (final LinkageError le) {
            System.out.println("NativeVerifier: LinkageError encountered on '" + args[0] + "'.");
            System.out.println(le);
            System.exit(1);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/NativeVerifier.java`
#### Snippet
```java
        } catch (final LinkageError le) {
            System.out.println("NativeVerifier: LinkageError encountered on '" + args[0] + "'.");
            System.out.println(le);
            System.exit(1);
        } catch (final ClassNotFoundException cnfe) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/NativeVerifier.java`
#### Snippet
```java
            System.exit(1);
        } catch (final ClassNotFoundException cnfe) {
            System.out.println("NativeVerifier: FILE NOT FOUND: '" + args[0] + "'.");
            System.exit(1);
        } catch (final Throwable t) { // OK to catch Throwable here as we call exit.
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/NativeVerifier.java`
#### Snippet
```java
            System.exit(1);
        } catch (final Throwable t) { // OK to catch Throwable here as we call exit.
            System.out.println("NativeVerifier: Unspecified verification error on '" + args[0] + "'.");
            System.exit(1);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/NativeVerifier.java`
#### Snippet
```java
            System.exit(1);
        }
        System.out.println("NativeVerifier: Class file '" + args[0] + "' seems to be okay.");
        System.exit(0);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/Verifier.java`
#### Snippet
```java
        VerificationResult verificationResult;
        verificationResult = verifier.doPass1();
        System.out.println("Pass 1:\n" + verificationResult);
        verificationResult = verifier.doPass2();
        System.out.println("Pass 2:\n" + verificationResult);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/Verifier.java`
#### Snippet
```java
        System.out.println("Pass 1:\n" + verificationResult);
        verificationResult = verifier.doPass2();
        System.out.println("Pass 2:\n" + verificationResult);
        if (verificationResult == VerificationResult.VR_OK) {
            final JavaClass jc = org.apache.bcel.Repository.lookupClass(fullyQualifiedClassName);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/Verifier.java`
#### Snippet
```java
            for (int i = 0; i < jc.getMethods().length; i++) {
                verificationResult = verifier.doPass3a(i);
                System.out.println("Pass 3a, method number " + i + " ['" + jc.getMethods()[i] + "']:\n" + verificationResult);
                verificationResult = verifier.doPass3b(i);
                System.out.println("Pass 3b, method number " + i + " ['" + jc.getMethods()[i] + "']:\n" + verificationResult);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/Verifier.java`
#### Snippet
```java
                System.out.println("Pass 3a, method number " + i + " ['" + jc.getMethods()[i] + "']:\n" + verificationResult);
                verificationResult = verifier.doPass3b(i);
                System.out.println("Pass 3b, method number " + i + " ['" + jc.getMethods()[i] + "']:\n" + verificationResult);
            }
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/Verifier.java`
#### Snippet
```java
            }
        }
        System.out.println("Warnings:");
        final String[] warnings = verifier.getMessages();
        if (warnings.length == 0) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/Verifier.java`
#### Snippet
```java
        final String[] warnings = verifier.getMessages();
        if (warnings.length == 0) {
            System.out.println("<none>");
        }
        for (final String warning : warnings) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/Verifier.java`
#### Snippet
```java
        }
        for (final String warning : warnings) {
            System.out.println(warning);
        }
        System.out.println("\n");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/Verifier.java`
#### Snippet
```java
            System.out.println(warning);
        }
        System.out.println("\n");
        // avoid swapping.
        verifier.flush();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/Verifier.java`
#### Snippet
```java
     */
    public static void main(final String[] args) {
        System.out.println(BANNER);
        for (int index = 0; index < args.length; index++) {
            try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/Verifier.java`
#### Snippet
```java
                }
                args[index] = Utility.pathToPackage(args[index]);
                System.out.println("Now verifying: " + args[index] + "\n");
                verifyType(args[index]);
                org.apache.bcel.Repository.clearCache();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
                byte b;
                if ((b = bytes.readByte()) != 0) {
                    System.err.println("Warning: Padding byte != 0 in " + Const.getOpcodeName(opcode) + ":" + b);
                }
            }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
            }
        } catch (final StringIndexOutOfBoundsException e) { // Should not occur
            System.err.println(e);
        }
        return str;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/generic/Instruction.java`
#### Snippet
```java
                i = (Instruction) clone();
            } catch (final CloneNotSupportedException e) {
                System.err.println(e);
            }
        }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/structurals/Subroutines.java`
#### Snippet
```java
            }
        }
        System.err.println("DEBUG: Please verify '" + any.toString(true) + "' lies in dead code.");
        return null;
        // throw new AssertionViolatedException("No subroutine for InstructionHandle found (DEAD CODE?).");
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/bcel/classfile/BootstrapMethods.java`
#### Snippet
```java
            buf.append("  ").append(i).append(": ");
            final int indentCount = buf.length() - start;
            final String[] lines = bootstrapMethods[i].toString(super.getConstantPool()).split("\\r?\\n");
            buf.append(lines[0]);
            for (int j = 1; j < lines.length; j++) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/bcel/classfile/ConstantInvokeDynamic.java`
#### Snippet
```java
    @Override
    public String toString() {
        return super.toString().replace("class_index", "bootstrap_method_attr_index");
    }
}
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/bcel/classfile/ConstantDynamic.java`
#### Snippet
```java
    @Override
    public String toString() {
        return super.toString().replace("class_index", "bootstrap_method_attr_index");
    }
}
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DUP.java`
#### Snippet
```java

    public DUP() {
        super(org.apache.bcel.Const.DUP);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IMPDEP2.java`
#### Snippet
```java

    public IMPDEP2() {
        super(org.apache.bcel.Const.IMPDEP2, (short) 1);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LCMP.java`
#### Snippet
```java

    public LCMP() {
        super(org.apache.bcel.Const.LCMP, (short) 1);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDIV.java`
#### Snippet
```java

    public LDIV() {
        super(org.apache.bcel.Const.LDIV);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/CASTORE.java`
#### Snippet
```java
     */
    public CASTORE() {
        super(org.apache.bcel.Const.CASTORE);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IF_ICMPGE.java`
#### Snippet
```java

    public IF_ICMPGE(final InstructionHandle target) {
        super(org.apache.bcel.Const.IF_ICMPGE, target);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DSUB.java`
#### Snippet
```java
     */
    public DSUB() {
        super(org.apache.bcel.Const.DSUB);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/INSTANCEOF.java`
#### Snippet
```java

    public INSTANCEOF(final int index) {
        super(org.apache.bcel.Const.INSTANCEOF, index);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LASTORE.java`
#### Snippet
```java
     */
    public LASTORE() {
        super(org.apache.bcel.Const.LASTORE);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LMUL.java`
#### Snippet
```java

    public LMUL() {
        super(org.apache.bcel.Const.LMUL);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FCONST.java`
#### Snippet
```java

    public FCONST(final float f) {
        super(org.apache.bcel.Const.FCONST_0, (short) 1);
        if (f == 0.0) {
            super.setOpcode(org.apache.bcel.Const.FCONST_0);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FCONST.java`
#### Snippet
```java
        super(org.apache.bcel.Const.FCONST_0, (short) 1);
        if (f == 0.0) {
            super.setOpcode(org.apache.bcel.Const.FCONST_0);
        } else if (f == 1.0) {
            super.setOpcode(org.apache.bcel.Const.FCONST_1);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FCONST.java`
#### Snippet
```java
            super.setOpcode(org.apache.bcel.Const.FCONST_0);
        } else if (f == 1.0) {
            super.setOpcode(org.apache.bcel.Const.FCONST_1);
        } else if (f == 2.0) {
            super.setOpcode(org.apache.bcel.Const.FCONST_2);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FCONST.java`
#### Snippet
```java
            super.setOpcode(org.apache.bcel.Const.FCONST_1);
        } else if (f == 2.0) {
            super.setOpcode(org.apache.bcel.Const.FCONST_2);
        } else {
            throw new ClassGenException("FCONST can be used only for 0.0, 1.0 and 2.0: " + f);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/D2I.java`
#### Snippet
```java
     */
    public D2I() {
        super(org.apache.bcel.Const.D2I);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IFLT.java`
#### Snippet
```java

    public IFLT(final InstructionHandle target) {
        super(org.apache.bcel.Const.IFLT, target);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/BREAKPOINT.java`
#### Snippet
```java

    public BREAKPOINT() {
        super(org.apache.bcel.Const.BREAKPOINT, (short) 1);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DCMPG.java`
#### Snippet
```java

    public DCMPG() {
        super(org.apache.bcel.Const.DCMPG, (short) 1);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DUP2_X2.java`
#### Snippet
```java

    public DUP2_X2() {
        super(org.apache.bcel.Const.DUP2_X2);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/SIPUSH.java`
#### Snippet
```java

    public SIPUSH(final short b) {
        super(org.apache.bcel.Const.SIPUSH, (short) 3);
        this.b = b;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/bcel/classfile/FieldOrMethod.java`
#### Snippet
```java
     * @param file Input stream
     * @throws IOException if an I/O error occurs.
     * @deprecated (6.0) Use {@link #FieldOrMethod(java.io.DataInput, ConstantPool)} instead.
     */
    @java.lang.Deprecated
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IREM.java`
#### Snippet
```java
     */
    public IREM() {
        super(org.apache.bcel.Const.IREM);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LLOAD.java`
#### Snippet
```java

    public LLOAD(final int n) {
        super(org.apache.bcel.Const.LLOAD, org.apache.bcel.Const.LLOAD_0, n);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LLOAD.java`
#### Snippet
```java

    public LLOAD(final int n) {
        super(org.apache.bcel.Const.LLOAD, org.apache.bcel.Const.LLOAD_0, n);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LLOAD.java`
#### Snippet
```java
     */
    LLOAD() {
        super(org.apache.bcel.Const.LLOAD, org.apache.bcel.Const.LLOAD_0);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LLOAD.java`
#### Snippet
```java
     */
    LLOAD() {
        super(org.apache.bcel.Const.LLOAD, org.apache.bcel.Const.LLOAD_0);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FSTORE.java`
#### Snippet
```java
     */
    public FSTORE(final int n) {
        super(org.apache.bcel.Const.FSTORE, org.apache.bcel.Const.FSTORE_0, n);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FSTORE.java`
#### Snippet
```java
     */
    public FSTORE(final int n) {
        super(org.apache.bcel.Const.FSTORE, org.apache.bcel.Const.FSTORE_0, n);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FSTORE.java`
#### Snippet
```java
     */
    FSTORE() {
        super(org.apache.bcel.Const.FSTORE, org.apache.bcel.Const.FSTORE_0);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FSTORE.java`
#### Snippet
```java
     */
    FSTORE() {
        super(org.apache.bcel.Const.FSTORE, org.apache.bcel.Const.FSTORE_0);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ALOAD.java`
#### Snippet
```java
     */
    ALOAD() {
        super(org.apache.bcel.Const.ALOAD, org.apache.bcel.Const.ALOAD_0);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ALOAD.java`
#### Snippet
```java
     */
    ALOAD() {
        super(org.apache.bcel.Const.ALOAD, org.apache.bcel.Const.ALOAD_0);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ALOAD.java`
#### Snippet
```java
     */
    public ALOAD(final int n) {
        super(org.apache.bcel.Const.ALOAD, org.apache.bcel.Const.ALOAD_0, n);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ALOAD.java`
#### Snippet
```java
     */
    public ALOAD(final int n) {
        super(org.apache.bcel.Const.ALOAD, org.apache.bcel.Const.ALOAD_0, n);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FASTORE.java`
#### Snippet
```java
     */
    public FASTORE() {
        super(org.apache.bcel.Const.FASTORE);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/I2S.java`
#### Snippet
```java

    public I2S() {
        super(org.apache.bcel.Const.I2S);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/classfile/AttributeReader.java`
#### Snippet
```java
     * @see Attribute#addAttributeReader( String, AttributeReader )
     */
    Attribute createAttribute(int nameIndex, int length, java.io.DataInputStream file, ConstantPool constantPool);
}

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/MONITORENTER.java`
#### Snippet
```java

    public MONITORENTER() {
        super(org.apache.bcel.Const.MONITORENTER, (short) 1);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ARETURN.java`
#### Snippet
```java
     */
    public ARETURN() {
        super(org.apache.bcel.Const.ARETURN);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IFGT.java`
#### Snippet
```java

    public IFGT(final InstructionHandle target) {
        super(org.apache.bcel.Const.IFGT, target);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FADD.java`
#### Snippet
```java
     */
    public FADD() {
        super(org.apache.bcel.Const.FADD);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FRETURN.java`
#### Snippet
```java
     */
    public FRETURN() {
        super(org.apache.bcel.Const.FRETURN);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/CHECKCAST.java`
#### Snippet
```java
     */
    public CHECKCAST(final int index) {
        super(org.apache.bcel.Const.CHECKCAST, index);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LCONST.java`
#### Snippet
```java

    public LCONST(final long l) {
        super(org.apache.bcel.Const.LCONST_0, (short) 1);
        if (l == 0) {
            super.setOpcode(org.apache.bcel.Const.LCONST_0);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LCONST.java`
#### Snippet
```java
        super(org.apache.bcel.Const.LCONST_0, (short) 1);
        if (l == 0) {
            super.setOpcode(org.apache.bcel.Const.LCONST_0);
        } else if (l == 1) {
            super.setOpcode(org.apache.bcel.Const.LCONST_1);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LCONST.java`
#### Snippet
```java
            super.setOpcode(org.apache.bcel.Const.LCONST_0);
        } else if (l == 1) {
            super.setOpcode(org.apache.bcel.Const.LCONST_1);
        } else {
            throw new ClassGenException("LCONST can be used only for 0 and 1: " + l);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LUSHR.java`
#### Snippet
```java

    public LUSHR() {
        super(org.apache.bcel.Const.LUSHR);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FCMPL.java`
#### Snippet
```java

    public FCMPL() {
        super(org.apache.bcel.Const.FCMPL, (short) 1);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IFEQ.java`
#### Snippet
```java

    public IFEQ(final InstructionHandle target) {
        super(org.apache.bcel.Const.IFEQ, target);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LOOKUPSWITCH.java`
#### Snippet
```java

    public LOOKUPSWITCH(final int[] match, final InstructionHandle[] targets, final InstructionHandle defaultTarget) {
        super(org.apache.bcel.Const.LOOKUPSWITCH, match, targets, defaultTarget);
        /* alignment remainder assumed 0 here, until dump time. */
        final short length = (short) (9 + getMatchLength() * 8);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IMPDEP1.java`
#### Snippet
```java

    public IMPDEP1() {
        super(org.apache.bcel.Const.IMPDEP1, (short) 1);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DSTORE.java`
#### Snippet
```java
     */
    public DSTORE(final int n) {
        super(org.apache.bcel.Const.DSTORE, org.apache.bcel.Const.DSTORE_0, n);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DSTORE.java`
#### Snippet
```java
     */
    public DSTORE(final int n) {
        super(org.apache.bcel.Const.DSTORE, org.apache.bcel.Const.DSTORE_0, n);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DSTORE.java`
#### Snippet
```java
     */
    DSTORE() {
        super(org.apache.bcel.Const.DSTORE, org.apache.bcel.Const.DSTORE_0);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DSTORE.java`
#### Snippet
```java
     */
    DSTORE() {
        super(org.apache.bcel.Const.DSTORE, org.apache.bcel.Const.DSTORE_0);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LRETURN.java`
#### Snippet
```java

    public LRETURN() {
        super(org.apache.bcel.Const.LRETURN);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DCMPL.java`
#### Snippet
```java

    public DCMPL() {
        super(org.apache.bcel.Const.DCMPL, (short) 1);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DNEG.java`
#### Snippet
```java

    public DNEG() {
        super(org.apache.bcel.Const.DNEG);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FLOAD.java`
#### Snippet
```java
     */
    public FLOAD(final int n) {
        super(org.apache.bcel.Const.FLOAD, org.apache.bcel.Const.FLOAD_0, n);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FLOAD.java`
#### Snippet
```java
     */
    public FLOAD(final int n) {
        super(org.apache.bcel.Const.FLOAD, org.apache.bcel.Const.FLOAD_0, n);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FLOAD.java`
#### Snippet
```java
     */
    FLOAD() {
        super(org.apache.bcel.Const.FLOAD, org.apache.bcel.Const.FLOAD_0);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FLOAD.java`
#### Snippet
```java
     */
    FLOAD() {
        super(org.apache.bcel.Const.FLOAD, org.apache.bcel.Const.FLOAD_0);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel.util` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java
     * better.
     */
    private transient org.apache.bcel.util.Repository repository = SyntheticRepository.getInstance();

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel.util` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java
     * SyntheticRepository.getInstance();
     */
    public org.apache.bcel.util.Repository getRepository() {
        return repository;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel.util` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java
     * Sets the ClassRepository which loaded the JavaClass. Should be called immediately after parsing is done.
     */
    public void setRepository(final org.apache.bcel.util.Repository repository) { // TODO make protected?
        this.repository = repository;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FDIV.java`
#### Snippet
```java
     */
    public FDIV() {
        super(org.apache.bcel.Const.FDIV);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/D2F.java`
#### Snippet
```java
     */
    public D2F() {
        super(org.apache.bcel.Const.D2F);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/RET.java`
#### Snippet
```java
    public void dump(final DataOutputStream out) throws IOException {
        if (wide) {
            out.writeByte(org.apache.bcel.Const.WIDE);
        }
        out.writeByte(super.getOpcode());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/RET.java`
#### Snippet
```java

    public RET(final int index) {
        super(org.apache.bcel.Const.RET, (short) 2);
        setIndex(index); // May set wide as side effect
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/RET.java`
#### Snippet
```java

    private void setWide() {
        wide = index > org.apache.bcel.Const.MAX_BYTE;
        if (wide) {
            super.setLength(4); // Including the wide byte
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/MONITOREXIT.java`
#### Snippet
```java

    public MONITOREXIT() {
        super(org.apache.bcel.Const.MONITOREXIT, (short) 1);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FMUL.java`
#### Snippet
```java
     */
    public FMUL() {
        super(org.apache.bcel.Const.FMUL);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LALOAD.java`
#### Snippet
```java
     */
    public LALOAD() {
        super(org.apache.bcel.Const.LALOAD);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/SALOAD.java`
#### Snippet
```java

    public SALOAD() {
        super(org.apache.bcel.Const.SALOAD);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ISHL.java`
#### Snippet
```java

    public ISHL() {
        super(org.apache.bcel.Const.ISHL);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ArrayInstruction.java`
#### Snippet
```java
        final short opcode = super.getOpcode();
        switch (opcode) {
        case org.apache.bcel.Const.IALOAD:
        case org.apache.bcel.Const.IASTORE:
            return Type.INT;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ArrayInstruction.java`
#### Snippet
```java
        switch (opcode) {
        case org.apache.bcel.Const.IALOAD:
        case org.apache.bcel.Const.IASTORE:
            return Type.INT;
        case org.apache.bcel.Const.CALOAD:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ArrayInstruction.java`
#### Snippet
```java
        case org.apache.bcel.Const.IASTORE:
            return Type.INT;
        case org.apache.bcel.Const.CALOAD:
        case org.apache.bcel.Const.CASTORE:
            return Type.CHAR;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ArrayInstruction.java`
#### Snippet
```java
            return Type.INT;
        case org.apache.bcel.Const.CALOAD:
        case org.apache.bcel.Const.CASTORE:
            return Type.CHAR;
        case org.apache.bcel.Const.BALOAD:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ArrayInstruction.java`
#### Snippet
```java
        case org.apache.bcel.Const.CASTORE:
            return Type.CHAR;
        case org.apache.bcel.Const.BALOAD:
        case org.apache.bcel.Const.BASTORE:
            return Type.BYTE;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ArrayInstruction.java`
#### Snippet
```java
            return Type.CHAR;
        case org.apache.bcel.Const.BALOAD:
        case org.apache.bcel.Const.BASTORE:
            return Type.BYTE;
        case org.apache.bcel.Const.SALOAD:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ArrayInstruction.java`
#### Snippet
```java
        case org.apache.bcel.Const.BASTORE:
            return Type.BYTE;
        case org.apache.bcel.Const.SALOAD:
        case org.apache.bcel.Const.SASTORE:
            return Type.SHORT;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ArrayInstruction.java`
#### Snippet
```java
            return Type.BYTE;
        case org.apache.bcel.Const.SALOAD:
        case org.apache.bcel.Const.SASTORE:
            return Type.SHORT;
        case org.apache.bcel.Const.LALOAD:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ArrayInstruction.java`
#### Snippet
```java
        case org.apache.bcel.Const.SASTORE:
            return Type.SHORT;
        case org.apache.bcel.Const.LALOAD:
        case org.apache.bcel.Const.LASTORE:
            return Type.LONG;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ArrayInstruction.java`
#### Snippet
```java
            return Type.SHORT;
        case org.apache.bcel.Const.LALOAD:
        case org.apache.bcel.Const.LASTORE:
            return Type.LONG;
        case org.apache.bcel.Const.DALOAD:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ArrayInstruction.java`
#### Snippet
```java
        case org.apache.bcel.Const.LASTORE:
            return Type.LONG;
        case org.apache.bcel.Const.DALOAD:
        case org.apache.bcel.Const.DASTORE:
            return Type.DOUBLE;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ArrayInstruction.java`
#### Snippet
```java
            return Type.LONG;
        case org.apache.bcel.Const.DALOAD:
        case org.apache.bcel.Const.DASTORE:
            return Type.DOUBLE;
        case org.apache.bcel.Const.FALOAD:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ArrayInstruction.java`
#### Snippet
```java
        case org.apache.bcel.Const.DASTORE:
            return Type.DOUBLE;
        case org.apache.bcel.Const.FALOAD:
        case org.apache.bcel.Const.FASTORE:
            return Type.FLOAT;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ArrayInstruction.java`
#### Snippet
```java
            return Type.DOUBLE;
        case org.apache.bcel.Const.FALOAD:
        case org.apache.bcel.Const.FASTORE:
            return Type.FLOAT;
        case org.apache.bcel.Const.AALOAD:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ArrayInstruction.java`
#### Snippet
```java
        case org.apache.bcel.Const.FASTORE:
            return Type.FLOAT;
        case org.apache.bcel.Const.AALOAD:
        case org.apache.bcel.Const.AASTORE:
            return Type.OBJECT;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ArrayInstruction.java`
#### Snippet
```java
            return Type.FLOAT;
        case org.apache.bcel.Const.AALOAD:
        case org.apache.bcel.Const.AASTORE:
            return Type.OBJECT;
        default:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DADD.java`
#### Snippet
```java
     */
    public DADD() {
        super(org.apache.bcel.Const.DADD);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DLOAD.java`
#### Snippet
```java
     */
    public DLOAD(final int n) {
        super(org.apache.bcel.Const.DLOAD, org.apache.bcel.Const.DLOAD_0, n);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DLOAD.java`
#### Snippet
```java
     */
    public DLOAD(final int n) {
        super(org.apache.bcel.Const.DLOAD, org.apache.bcel.Const.DLOAD_0, n);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DLOAD.java`
#### Snippet
```java
     */
    DLOAD() {
        super(org.apache.bcel.Const.DLOAD, org.apache.bcel.Const.DLOAD_0);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DLOAD.java`
#### Snippet
```java
     */
    DLOAD() {
        super(org.apache.bcel.Const.DLOAD, org.apache.bcel.Const.DLOAD_0);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IF_ICMPEQ.java`
#### Snippet
```java

    public IF_ICMPEQ(final InstructionHandle target) {
        super(org.apache.bcel.Const.IF_ICMPEQ, target);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/GOTO.java`
#### Snippet
```java
        setPosition(getPosition() + offset); // Position may be shifted by preceding expansions
        if (Math.abs(i) >= Short.MAX_VALUE - maxOffset) { // to large for short (estimate)
            super.setOpcode(org.apache.bcel.Const.GOTO_W);
            final short oldLength = (short) super.getLength();
            super.setLength(5);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/GOTO.java`
#### Snippet
```java

    public GOTO(final InstructionHandle target) {
        super(org.apache.bcel.Const.GOTO, target);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/GOTO.java`
#### Snippet
```java
        super.setIndex(getTargetOffset());
        final short opcode = getOpcode();
        if (opcode == org.apache.bcel.Const.GOTO) {
            super.dump(out);
        } else { // GOTO_W
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LSUB.java`
#### Snippet
```java

    public LSUB() {
        super(org.apache.bcel.Const.LSUB);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IDIV.java`
#### Snippet
```java
     */
    public IDIV() {
        super(org.apache.bcel.Const.IDIV);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/Type.java`
#### Snippet
```java
    }

    public static String getSignature(final java.lang.reflect.Method meth) {
        final StringBuilder sb = new StringBuilder("(");
        final Class<?>[] params = meth.getParameterTypes(); // avoid clone
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/CPInstruction.java`
#### Snippet
```java
    public Type getType(final ConstantPoolGen cpg) {
        final ConstantPool cp = cpg.getConstantPool();
        String name = cp.getConstantString(index, org.apache.bcel.Const.CONSTANT_Class);
        if (!name.startsWith("[")) {
            name = "L" + name + ";";
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/CPInstruction.java`
#### Snippet
```java
            str = Utility.packageToPath(str);
        }
        return org.apache.bcel.Const.getOpcodeName(super.getOpcode()) + " " + str;
    }
}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IAND.java`
#### Snippet
```java

    public IAND() {
        super(org.apache.bcel.Const.IAND);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ICONST.java`
#### Snippet
```java

    public ICONST(final int i) {
        super(org.apache.bcel.Const.ICONST_0, (short) 1);
        if (i < -1 || i > 5) {
            throw new ClassGenException("ICONST can be used only for value between -1 and 5: " + i);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ICONST.java`
#### Snippet
```java
            throw new ClassGenException("ICONST can be used only for value between -1 and 5: " + i);
        }
        super.setOpcode((short) (org.apache.bcel.Const.ICONST_0 + i)); // Even works for i == -1
        value = i;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LADD.java`
#### Snippet
```java

    public LADD() {
        super(org.apache.bcel.Const.LADD);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FREM.java`
#### Snippet
```java
     */
    public FREM() {
        super(org.apache.bcel.Const.FREM);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ISTORE.java`
#### Snippet
```java
     */
    public ISTORE(final int n) {
        super(org.apache.bcel.Const.ISTORE, org.apache.bcel.Const.ISTORE_0, n);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ISTORE.java`
#### Snippet
```java
     */
    public ISTORE(final int n) {
        super(org.apache.bcel.Const.ISTORE, org.apache.bcel.Const.ISTORE_0, n);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ISTORE.java`
#### Snippet
```java
     */
    ISTORE() {
        super(org.apache.bcel.Const.ISTORE, org.apache.bcel.Const.ISTORE_0);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ISTORE.java`
#### Snippet
```java
     */
    ISTORE() {
        super(org.apache.bcel.Const.ISTORE, org.apache.bcel.Const.ISTORE_0);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IMUL.java`
#### Snippet
```java
     */
    public IMUL() {
        super(org.apache.bcel.Const.IMUL);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.swing` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/verifier/VerifierAppFrame.java`
#### Snippet
```java
        messagesTextPane.setEditable(false);
        newFileMenuItem.setText("New...");
        newFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(78, InputEvent.CTRL_MASK, true));
        newFileMenuItem.addActionListener(this::newFileMenuItem_actionPerformed);
        pass3aTextPane.setEditable(false);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ISUB.java`
#### Snippet
```java
     */
    public ISUB() {
        super(org.apache.bcel.Const.ISUB);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DUP2_X1.java`
#### Snippet
```java

    public DUP2_X1() {
        super(org.apache.bcel.Const.DUP2_X1);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/F2I.java`
#### Snippet
```java
     */
    public F2I() {
        super(org.apache.bcel.Const.F2I);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/POP2.java`
#### Snippet
```java

    public POP2() {
        super(org.apache.bcel.Const.POP2);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LSTORE.java`
#### Snippet
```java

    public LSTORE(final int n) {
        super(org.apache.bcel.Const.LSTORE, org.apache.bcel.Const.LSTORE_0, n);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LSTORE.java`
#### Snippet
```java

    public LSTORE(final int n) {
        super(org.apache.bcel.Const.LSTORE, org.apache.bcel.Const.LSTORE_0, n);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LSTORE.java`
#### Snippet
```java
     */
    LSTORE() {
        super(org.apache.bcel.Const.LSTORE, org.apache.bcel.Const.LSTORE_0);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LSTORE.java`
#### Snippet
```java
     */
    LSTORE() {
        super(org.apache.bcel.Const.LSTORE, org.apache.bcel.Const.LSTORE_0);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ASTORE.java`
#### Snippet
```java
     */
    public ASTORE(final int n) {
        super(org.apache.bcel.Const.ASTORE, org.apache.bcel.Const.ASTORE_0, n);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ASTORE.java`
#### Snippet
```java
     */
    public ASTORE(final int n) {
        super(org.apache.bcel.Const.ASTORE, org.apache.bcel.Const.ASTORE_0, n);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ASTORE.java`
#### Snippet
```java
     */
    ASTORE() {
        super(org.apache.bcel.Const.ASTORE, org.apache.bcel.Const.ASTORE_0);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ASTORE.java`
#### Snippet
```java
     */
    ASTORE() {
        super(org.apache.bcel.Const.ASTORE, org.apache.bcel.Const.ASTORE_0);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/BALOAD.java`
#### Snippet
```java
     */
    public BALOAD() {
        super(org.apache.bcel.Const.BALOAD);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FALOAD.java`
#### Snippet
```java
     */
    public FALOAD() {
        super(org.apache.bcel.Const.FALOAD);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/JSR.java`
#### Snippet
```java
    public void dump(final DataOutputStream out) throws IOException {
        super.setIndex(getTargetOffset());
        if (super.getOpcode() == org.apache.bcel.Const.JSR) {
            super.dump(out);
        } else { // JSR_W
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/JSR.java`
#### Snippet
```java
        setPosition(getPosition() + offset); // Position may be shifted by preceding expansions
        if (Math.abs(i) >= Short.MAX_VALUE - maxOffset) { // to large for short (estimate)
            super.setOpcode(org.apache.bcel.Const.JSR_W);
            final short oldLength = (short) super.getLength();
            super.setLength(5);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/JSR.java`
#### Snippet
```java

    public JSR(final InstructionHandle target) {
        super(org.apache.bcel.Const.JSR, target);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/AASTORE.java`
#### Snippet
```java
     */
    public AASTORE() {
        super(org.apache.bcel.Const.AASTORE);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FCMPG.java`
#### Snippet
```java

    public FCMPG() {
        super(org.apache.bcel.Const.FCMPG, (short) 1);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/TABLESWITCH.java`
#### Snippet
```java
     */
    public TABLESWITCH(final int[] match, final InstructionHandle[] targets, final InstructionHandle defaultTarget) {
        super(org.apache.bcel.Const.TABLESWITCH, match, targets, defaultTarget);
        /* Alignment remainder assumed 0 here, until dump time */
        final short length = (short) (13 + getMatchLength() * 4);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ATHROW.java`
#### Snippet
```java
     */
    public ATHROW() {
        super(org.apache.bcel.Const.ATHROW, (short) 1);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel.classfile` is unnecessary and can be removed
in `src/main/java/org/apache/bcel/classfile/LocalVariable.java`
#### Snippet
```java
 * LocalVariableTypeTable attribute does have a signatureIndex.
 *
 * @see org.apache.bcel.classfile.Utility for more details on the difference.
 *
 * @see LocalVariableTable
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/I2F.java`
#### Snippet
```java
     */
    public I2F() {
        super(org.apache.bcel.Const.I2F);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DCONST.java`
#### Snippet
```java

    public DCONST(final double f) {
        super(org.apache.bcel.Const.DCONST_0, (short) 1);
        if (f == 0.0) {
            super.setOpcode(org.apache.bcel.Const.DCONST_0);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DCONST.java`
#### Snippet
```java
        super(org.apache.bcel.Const.DCONST_0, (short) 1);
        if (f == 0.0) {
            super.setOpcode(org.apache.bcel.Const.DCONST_0);
        } else if (f == 1.0) {
            super.setOpcode(org.apache.bcel.Const.DCONST_1);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DCONST.java`
#### Snippet
```java
            super.setOpcode(org.apache.bcel.Const.DCONST_0);
        } else if (f == 1.0) {
            super.setOpcode(org.apache.bcel.Const.DCONST_1);
        } else {
            throw new ClassGenException("DCONST can be used only for 0.0 and 1.0: " + f);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DMUL.java`
#### Snippet
```java
     */
    public DMUL() {
        super(org.apache.bcel.Const.DMUL);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/AALOAD.java`
#### Snippet
```java
     */
    public AALOAD() {
        super(org.apache.bcel.Const.AALOAD);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ACONST_NULL.java`
#### Snippet
```java
     */
    public ACONST_NULL() {
        super(org.apache.bcel.Const.ACONST_NULL, (short) 1);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IF_ACMPNE.java`
#### Snippet
```java

    public IF_ACMPNE(final InstructionHandle target) {
        super(org.apache.bcel.Const.IF_ACMPNE, target);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/F2D.java`
#### Snippet
```java
     */
    public F2D() {
        super(org.apache.bcel.Const.F2D);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/I2B.java`
#### Snippet
```java
     */
    public I2B() {
        super(org.apache.bcel.Const.I2B);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IUSHR.java`
#### Snippet
```java

    public IUSHR() {
        super(org.apache.bcel.Const.IUSHR);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IFLE.java`
#### Snippet
```java

    public IFLE(final InstructionHandle target) {
        super(org.apache.bcel.Const.IFLE, target);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/org/apache/bcel/classfile/Unknown.java`
#### Snippet
```java
/**
 * This class represents a reference to an unknown (i.e., application-specific) attribute of a class. It is instantiated
 * from the {@link Attribute#readAttribute(java.io.DataInput, ConstantPool)} method. Applications that need to read in
 * application-specific attributes should create an {@link UnknownAttributeReader} implementation and attach it via
 * {@link Attribute#addAttributeReader(String, UnknownAttributeReader)}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/POP.java`
#### Snippet
```java

    public POP() {
        super(org.apache.bcel.Const.POP);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel.verifier` is unnecessary and can be removed
in `src/main/java/org/apache/bcel/verifier/structurals/Pass3bVerifier.java`
#### Snippet
```java
     * This class should only be instantiated by a Verifier.
     *
     * @see org.apache.bcel.verifier.Verifier
     */
    public Pass3bVerifier(final Verifier myOwner, final int methodNo) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DREM.java`
#### Snippet
```java
     */
    public DREM() {
        super(org.apache.bcel.Const.DREM);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LOR.java`
#### Snippet
```java

    public LOR() {
        super(org.apache.bcel.Const.LOR);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IADD.java`
#### Snippet
```java
     */
    public IADD() {
        super(org.apache.bcel.Const.IADD);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/JSR_W.java`
#### Snippet
```java

    public JSR_W(final InstructionHandle target) {
        super(org.apache.bcel.Const.JSR_W, target);
        super.setLength(5);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DALOAD.java`
#### Snippet
```java
     */
    public DALOAD() {
        super(org.apache.bcel.Const.DALOAD);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LAND.java`
#### Snippet
```java

    public LAND() {
        super(org.apache.bcel.Const.LAND);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/RETURN.java`
#### Snippet
```java

    public RETURN() {
        super(org.apache.bcel.Const.RETURN);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IFNULL.java`
#### Snippet
```java

    public IFNULL(final InstructionHandle target) {
        super(org.apache.bcel.Const.IFNULL, target);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DUP2.java`
#### Snippet
```java

    public DUP2() {
        super(org.apache.bcel.Const.DUP2);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/SWAP.java`
#### Snippet
```java

    public SWAP() {
        super(org.apache.bcel.Const.SWAP);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LSHL.java`
#### Snippet
```java

    public LSHL() {
        super(org.apache.bcel.Const.LSHL);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LXOR.java`
#### Snippet
```java

    public LXOR() {
        super(org.apache.bcel.Const.LXOR);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ISHR.java`
#### Snippet
```java

    public ISHR() {
        super(org.apache.bcel.Const.ISHR);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/I2C.java`
#### Snippet
```java
     */
    public I2C() {
        super(org.apache.bcel.Const.I2C);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel.classfile` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/util/BCELifier.java`
#### Snippet
```java
 * of BCEL, but tries to mimic hand-written code as close as possible.
 */
public class BCELifier extends org.apache.bcel.classfile.EmptyVisitor {

    /**
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/L2D.java`
#### Snippet
```java

    public L2D() {
        super(org.apache.bcel.Const.L2D);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/GOTO_W.java`
#### Snippet
```java

    public GOTO_W(final InstructionHandle target) {
        super(org.apache.bcel.Const.GOTO_W, target);
        super.setLength(5);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/INEG.java`
#### Snippet
```java

    public INEG() {
        super(org.apache.bcel.Const.INEG);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IASTORE.java`
#### Snippet
```java
     */
    public IASTORE() {
        super(org.apache.bcel.Const.IASTORE);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IF_ICMPLT.java`
#### Snippet
```java

    public IF_ICMPLT(final InstructionHandle target) {
        super(org.apache.bcel.Const.IF_ICMPLT, target);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IFNONNULL.java`
#### Snippet
```java

    public IFNONNULL(final InstructionHandle target) {
        super(org.apache.bcel.Const.IFNONNULL, target);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/NOP.java`
#### Snippet
```java

    public NOP() {
        super(org.apache.bcel.Const.NOP, (short) 1);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/I2D.java`
#### Snippet
```java
     */
    public I2D() {
        super(org.apache.bcel.Const.I2D);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/NEW.java`
#### Snippet
```java

    public NEW(final int index) {
        super(org.apache.bcel.Const.NEW, index);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel.generic` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/verifier/statics/Pass3aVerifier.java`
#### Snippet
```java
     * This visitor class does the actual checking for the instruction operand's constraints.
     */
    private class InstOperandConstraintVisitor extends org.apache.bcel.generic.EmptyVisitor {
        /** The ConstantPoolGen instance this Visitor operates on. */
        private final ConstantPoolGen constantPoolGen;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/D2L.java`
#### Snippet
```java
     */
    public D2L() {
        super(org.apache.bcel.Const.D2L);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary and can be removed
in `src/main/java/org/apache/bcel/verifier/statics/Pass1Verifier.java`
#### Snippet
```java
     * </P>
     *
     * @see org.apache.bcel.Repository
     * @see org.apache.bcel.Const#JVM_CLASSFILE_MAGIC
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IOR.java`
#### Snippet
```java

    public IOR() {
        super(org.apache.bcel.Const.IOR);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ANEWARRAY.java`
#### Snippet
```java

    public ANEWARRAY(final int index) {
        super(org.apache.bcel.Const.ANEWARRAY, index);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IFGE.java`
#### Snippet
```java

    public IFGE(final InstructionHandle target) {
        super(org.apache.bcel.Const.IFGE, target);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ILOAD.java`
#### Snippet
```java
     */
    public ILOAD(final int n) {
        super(org.apache.bcel.Const.ILOAD, org.apache.bcel.Const.ILOAD_0, n);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ILOAD.java`
#### Snippet
```java
     */
    public ILOAD(final int n) {
        super(org.apache.bcel.Const.ILOAD, org.apache.bcel.Const.ILOAD_0, n);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ILOAD.java`
#### Snippet
```java
     */
    ILOAD() {
        super(org.apache.bcel.Const.ILOAD, org.apache.bcel.Const.ILOAD_0);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ILOAD.java`
#### Snippet
```java
     */
    ILOAD() {
        super(org.apache.bcel.Const.ILOAD, org.apache.bcel.Const.ILOAD_0);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/CALOAD.java`
#### Snippet
```java
     */
    public CALOAD() {
        super(org.apache.bcel.Const.CALOAD);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/F2L.java`
#### Snippet
```java
     */
    public F2L() {
        super(org.apache.bcel.Const.F2L);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LREM.java`
#### Snippet
```java

    public LREM() {
        super(org.apache.bcel.Const.LREM);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IF_ICMPLE.java`
#### Snippet
```java

    public IF_ICMPLE(final InstructionHandle target) {
        super(org.apache.bcel.Const.IF_ICMPLE, target);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DASTORE.java`
#### Snippet
```java
     */
    public DASTORE() {
        super(org.apache.bcel.Const.DASTORE);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/MULTIANEWARRAY.java`
#### Snippet
```java

    public MULTIANEWARRAY(final int index, final short dimensions) {
        super(org.apache.bcel.Const.MULTIANEWARRAY, index);
        if (dimensions < 1) {
            throw new ClassGenException("Invalid dimensions value: " + dimensions);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/L2F.java`
#### Snippet
```java

    public L2F() {
        super(org.apache.bcel.Const.L2F);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC_W.java`
#### Snippet
```java
        setIndex(bytes.readUnsignedShort());
        // Override just in case it has been changed
        super.setOpcode(org.apache.bcel.Const.LDC_W);
        super.setLength(3);
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/classfile/UnknownAttributeReader.java`
#### Snippet
```java
     * @see Attribute#addAttributeReader(String, UnknownAttributeReader)
     */
    Attribute createAttribute(int nameIndex, int length, java.io.DataInput file, ConstantPool constantPool);
}

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/SASTORE.java`
#### Snippet
```java

    public SASTORE() {
        super(org.apache.bcel.Const.SASTORE);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/I2L.java`
#### Snippet
```java
     */
    public I2L() {
        super(org.apache.bcel.Const.I2L);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FNEG.java`
#### Snippet
```java

    public FNEG() {
        super(org.apache.bcel.Const.FNEG);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DRETURN.java`
#### Snippet
```java
     */
    public DRETURN() {
        super(org.apache.bcel.Const.DRETURN);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel.classfile` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC2_W.java`
#### Snippet
```java

    public Number getValue(final ConstantPoolGen cpg) {
        final org.apache.bcel.classfile.Constant c = cpg.getConstantPool().getConstant(super.getIndex());
        switch (c.getTag()) {
        case org.apache.bcel.Const.CONSTANT_Long:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC2_W.java`
#### Snippet
```java
        final org.apache.bcel.classfile.Constant c = cpg.getConstantPool().getConstant(super.getIndex());
        switch (c.getTag()) {
        case org.apache.bcel.Const.CONSTANT_Long:
            return Long.valueOf(((org.apache.bcel.classfile.ConstantLong) c).getBytes());
        case org.apache.bcel.Const.CONSTANT_Double:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel.classfile` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC2_W.java`
#### Snippet
```java
        switch (c.getTag()) {
        case org.apache.bcel.Const.CONSTANT_Long:
            return Long.valueOf(((org.apache.bcel.classfile.ConstantLong) c).getBytes());
        case org.apache.bcel.Const.CONSTANT_Double:
            return Double.valueOf(((org.apache.bcel.classfile.ConstantDouble) c).getBytes());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC2_W.java`
#### Snippet
```java
        case org.apache.bcel.Const.CONSTANT_Long:
            return Long.valueOf(((org.apache.bcel.classfile.ConstantLong) c).getBytes());
        case org.apache.bcel.Const.CONSTANT_Double:
            return Double.valueOf(((org.apache.bcel.classfile.ConstantDouble) c).getBytes());
        default: // Never reached
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel.classfile` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC2_W.java`
#### Snippet
```java
            return Long.valueOf(((org.apache.bcel.classfile.ConstantLong) c).getBytes());
        case org.apache.bcel.Const.CONSTANT_Double:
            return Double.valueOf(((org.apache.bcel.classfile.ConstantDouble) c).getBytes());
        default: // Never reached
            throw new IllegalArgumentException("Unknown or invalid constant type at " + super.getIndex());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC2_W.java`
#### Snippet
```java
    public Type getType(final ConstantPoolGen cpg) {
        switch (cpg.getConstantPool().getConstant(super.getIndex()).getTag()) {
        case org.apache.bcel.Const.CONSTANT_Long:
            return Type.LONG;
        case org.apache.bcel.Const.CONSTANT_Double:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC2_W.java`
#### Snippet
```java
        case org.apache.bcel.Const.CONSTANT_Long:
            return Type.LONG;
        case org.apache.bcel.Const.CONSTANT_Double:
            return Type.DOUBLE;
        default: // Never reached
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC2_W.java`
#### Snippet
```java

    public LDC2_W(final int index) {
        super(org.apache.bcel.Const.LDC2_W, index);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IRETURN.java`
#### Snippet
```java
     */
    public IRETURN() {
        super(org.apache.bcel.Const.IRETURN);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FSUB.java`
#### Snippet
```java
     */
    public FSUB() {
        super(org.apache.bcel.Const.FSUB);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/BIPUSH.java`
#### Snippet
```java
     */
    public BIPUSH(final byte b) {
        super(org.apache.bcel.Const.BIPUSH, (short) 2);
        this.b = b;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/ARRAYLENGTH.java`
#### Snippet
```java
     */
    public ARRAYLENGTH() {
        super(org.apache.bcel.Const.ARRAYLENGTH, (short) 1);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DUP_X2.java`
#### Snippet
```java

    public DUP_X2() {
        super(org.apache.bcel.Const.DUP_X2);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LSHR.java`
#### Snippet
```java

    public LSHR() {
        super(org.apache.bcel.Const.LSHR);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FieldInstruction.java`
#### Snippet
```java
    @Override
    public String toString(final ConstantPool cp) {
        return org.apache.bcel.Const.getOpcodeName(super.getOpcode()) + " " + cp.constantToString(super.getIndex(), org.apache.bcel.Const.CONSTANT_Fieldref);
    }
}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/FieldInstruction.java`
#### Snippet
```java
    @Override
    public String toString(final ConstantPool cp) {
        return org.apache.bcel.Const.getOpcodeName(super.getOpcode()) + " " + cp.constantToString(super.getIndex(), org.apache.bcel.Const.CONSTANT_Fieldref);
    }
}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/NEWARRAY.java`
#### Snippet
```java
    @Override
    public String toString(final boolean verbose) {
        return super.toString(verbose) + " " + org.apache.bcel.Const.getTypeName(type);
    }
}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/NEWARRAY.java`
#### Snippet
```java

    public NEWARRAY(final byte type) {
        super(org.apache.bcel.Const.NEWARRAY, (short) 2);
        this.type = type;
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IFNE.java`
#### Snippet
```java

    public IFNE(final InstructionHandle target) {
        super(org.apache.bcel.Const.IFNE, target);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DUP_X1.java`
#### Snippet
```java

    public DUP_X1() {
        super(org.apache.bcel.Const.DUP_X1);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LNEG.java`
#### Snippet
```java

    public LNEG() {
        super(org.apache.bcel.Const.LNEG);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/BASTORE.java`
#### Snippet
```java
     */
    public BASTORE() {
        super(org.apache.bcel.Const.BASTORE);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IF_ICMPNE.java`
#### Snippet
```java

    public IF_ICMPNE(final InstructionHandle target) {
        super(org.apache.bcel.Const.IF_ICMPNE, target);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/L2I.java`
#### Snippet
```java

    public L2I() {
        super(org.apache.bcel.Const.L2I);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/verifier/Verifier.java`
#### Snippet
```java
            final int meth = pv.getMethodNo();
            for (final String element : pv.getMessages()) {
                messages.add("Pass 3a, method " + meth + " ('" + org.apache.bcel.Repository.lookupClass(className).getMethods()[meth] + "'): " + element);
            }
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/verifier/Verifier.java`
#### Snippet
```java
            final int meth = pv.getMethodNo();
            for (final String element : pv.getMessages()) {
                messages.add("Pass 3b, method " + meth + " ('" + org.apache.bcel.Repository.lookupClass(className).getMethods()[meth] + "'): " + element);
            }
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/verifier/Verifier.java`
#### Snippet
```java
        System.out.println("Pass 2:\n" + verificationResult);
        if (verificationResult == VerificationResult.VR_OK) {
            final JavaClass jc = org.apache.bcel.Repository.lookupClass(fullyQualifiedClassName);
            for (int i = 0; i < jc.getMethods().length; i++) {
                verificationResult = verifier.doPass3a(i);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/verifier/Verifier.java`
#### Snippet
```java
                System.out.println("Now verifying: " + args[index] + "\n");
                verifyType(args[index]);
                org.apache.bcel.Repository.clearCache();
                System.gc();
            } catch (final ClassNotFoundException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IXOR.java`
#### Snippet
```java

    public IXOR() {
        super(org.apache.bcel.Const.IXOR);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IALOAD.java`
#### Snippet
```java
     */
    public IALOAD() {
        super(org.apache.bcel.Const.IALOAD);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IF_ACMPEQ.java`
#### Snippet
```java

    public IF_ACMPEQ(final InstructionHandle target) {
        super(org.apache.bcel.Const.IF_ACMPEQ, target);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/DDIV.java`
#### Snippet
```java
     */
    public DDIV() {
        super(org.apache.bcel.Const.DDIV);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
    public Type getType(final ConstantPoolGen cpg) {
        switch (cpg.getConstantPool().getConstant(super.getIndex()).getTag()) {
        case org.apache.bcel.Const.CONSTANT_String:
            return Type.STRING;
        case org.apache.bcel.Const.CONSTANT_Float:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
        case org.apache.bcel.Const.CONSTANT_String:
            return Type.STRING;
        case org.apache.bcel.Const.CONSTANT_Float:
            return Type.FLOAT;
        case org.apache.bcel.Const.CONSTANT_Integer:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
        case org.apache.bcel.Const.CONSTANT_Float:
            return Type.FLOAT;
        case org.apache.bcel.Const.CONSTANT_Integer:
            return Type.INT;
        case org.apache.bcel.Const.CONSTANT_Class:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
        case org.apache.bcel.Const.CONSTANT_Integer:
            return Type.INT;
        case org.apache.bcel.Const.CONSTANT_Class:
            return Type.CLASS;
        default: // Never reached
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java

    public LDC(final int index) {
        super(org.apache.bcel.Const.LDC_W, index);
        setSize();
    }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel.classfile` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java

    public Object getValue(final ConstantPoolGen cpg) {
        org.apache.bcel.classfile.Constant c = cpg.getConstantPool().getConstant(super.getIndex());
        switch (c.getTag()) {
        case org.apache.bcel.Const.CONSTANT_String:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
        org.apache.bcel.classfile.Constant c = cpg.getConstantPool().getConstant(super.getIndex());
        switch (c.getTag()) {
        case org.apache.bcel.Const.CONSTANT_String:
            final int i = ((org.apache.bcel.classfile.ConstantString) c).getStringIndex();
            c = cpg.getConstantPool().getConstant(i);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel.classfile` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
        switch (c.getTag()) {
        case org.apache.bcel.Const.CONSTANT_String:
            final int i = ((org.apache.bcel.classfile.ConstantString) c).getStringIndex();
            c = cpg.getConstantPool().getConstant(i);
            return ((org.apache.bcel.classfile.ConstantUtf8) c).getBytes();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel.classfile` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
            final int i = ((org.apache.bcel.classfile.ConstantString) c).getStringIndex();
            c = cpg.getConstantPool().getConstant(i);
            return ((org.apache.bcel.classfile.ConstantUtf8) c).getBytes();
        case org.apache.bcel.Const.CONSTANT_Float:
            return Float.valueOf(((org.apache.bcel.classfile.ConstantFloat) c).getBytes());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
            c = cpg.getConstantPool().getConstant(i);
            return ((org.apache.bcel.classfile.ConstantUtf8) c).getBytes();
        case org.apache.bcel.Const.CONSTANT_Float:
            return Float.valueOf(((org.apache.bcel.classfile.ConstantFloat) c).getBytes());
        case org.apache.bcel.Const.CONSTANT_Integer:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel.classfile` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
            return ((org.apache.bcel.classfile.ConstantUtf8) c).getBytes();
        case org.apache.bcel.Const.CONSTANT_Float:
            return Float.valueOf(((org.apache.bcel.classfile.ConstantFloat) c).getBytes());
        case org.apache.bcel.Const.CONSTANT_Integer:
            return Integer.valueOf(((org.apache.bcel.classfile.ConstantInteger) c).getBytes());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
        case org.apache.bcel.Const.CONSTANT_Float:
            return Float.valueOf(((org.apache.bcel.classfile.ConstantFloat) c).getBytes());
        case org.apache.bcel.Const.CONSTANT_Integer:
            return Integer.valueOf(((org.apache.bcel.classfile.ConstantInteger) c).getBytes());
        case org.apache.bcel.Const.CONSTANT_Class:
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel.classfile` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
            return Float.valueOf(((org.apache.bcel.classfile.ConstantFloat) c).getBytes());
        case org.apache.bcel.Const.CONSTANT_Integer:
            return Integer.valueOf(((org.apache.bcel.classfile.ConstantInteger) c).getBytes());
        case org.apache.bcel.Const.CONSTANT_Class:
            final int nameIndex = ((org.apache.bcel.classfile.ConstantClass) c).getNameIndex();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
        case org.apache.bcel.Const.CONSTANT_Integer:
            return Integer.valueOf(((org.apache.bcel.classfile.ConstantInteger) c).getBytes());
        case org.apache.bcel.Const.CONSTANT_Class:
            final int nameIndex = ((org.apache.bcel.classfile.ConstantClass) c).getNameIndex();
            c = cpg.getConstantPool().getConstant(nameIndex);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel.classfile` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
            return Integer.valueOf(((org.apache.bcel.classfile.ConstantInteger) c).getBytes());
        case org.apache.bcel.Const.CONSTANT_Class:
            final int nameIndex = ((org.apache.bcel.classfile.ConstantClass) c).getNameIndex();
            c = cpg.getConstantPool().getConstant(nameIndex);
            return Type.getType(((org.apache.bcel.classfile.ConstantUtf8) c).getBytes());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel.classfile` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
            final int nameIndex = ((org.apache.bcel.classfile.ConstantClass) c).getNameIndex();
            c = cpg.getConstantPool().getConstant(nameIndex);
            return Type.getType(((org.apache.bcel.classfile.ConstantUtf8) c).getBytes());
        default: // Never reached
            throw new IllegalArgumentException("Unknown or invalid constant type at " + super.getIndex());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
    // Adjust to proper size
    protected final void setSize() {
        if (super.getIndex() <= org.apache.bcel.Const.MAX_BYTE) { // Fits in one byte?
            super.setOpcode(org.apache.bcel.Const.LDC);
            super.setLength(2);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
    protected final void setSize() {
        if (super.getIndex() <= org.apache.bcel.Const.MAX_BYTE) { // Fits in one byte?
            super.setOpcode(org.apache.bcel.Const.LDC);
            super.setLength(2);
        } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/LDC.java`
#### Snippet
```java
            super.setLength(2);
        } else {
            super.setOpcode(org.apache.bcel.Const.LDC_W);
            super.setLength(3);
        }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/generic/IF_ICMPGT.java`
#### Snippet
```java

    public IF_ICMPGT(final InstructionHandle target) {
        super(org.apache.bcel.Const.IF_ICMPGT, target);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.bcel.classfile` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/bcel/verifier/statics/StringRepresentation.java`
#### Snippet
```java
 * placeholder for more sophisticated message handling in future versions of JustIce.
 */
public class StringRepresentation extends org.apache.bcel.classfile.EmptyVisitor {
    /** The string representation, created by a visitXXX() method, output by toString(). */
    private String tostring;
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java
            dump(dos);
        } catch (final IOException e) {
            e.printStackTrace();
        }
        return baos.toByteArray();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/VerifierAppFrame.java`
#### Snippet
```java
        } catch (final ClassNotFoundException ex) {
            // FIXME: report the error using the GUI
            ex.printStackTrace();
        }
        classNamesJList.setSelectedValue(currentClass, true);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/VerifierAppFrame.java`
#### Snippet
```java
                } catch (final ClassNotFoundException ex) {
                    // FIXME: handle the error
                    ex.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/VerifierAppFrame.java`
#### Snippet
```java
                } catch (final ClassNotFoundException ex) {
                    // FIXME: handle the error
                    ex.printStackTrace();
                }
            }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/VerifierAppFrame.java`
#### Snippet
```java
            jbInit();
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/generic/AnnotationEntryGen.java`
#### Snippet
```java
        } catch (final IOException e) {
            System.err.println("IOException whilst processing annotations");
            e.printStackTrace();
        }
        return null;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/generic/AnnotationEntryGen.java`
#### Snippet
```java
        } catch (final IOException e) {
            System.err.println("IOException whilst processing parameter annotations");
            e.printStackTrace();
        }
        return null;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/GraphicalVerifier.java`
#### Snippet
```java
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (final Exception e) {
            e.printStackTrace();
        }
        new GraphicalVerifier();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/util/JavaWrapper.java`
#### Snippet
```java
            method.invoke(null, (Object[]) argv);
        } catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/VerifyDialog.java`
#### Snippet
```java
            } catch (final ClassNotFoundException ex) {
                // FIXME: report the error
                ex.printStackTrace();
            }
        } else {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/util/ClassLoader.java`
#### Snippet
```java
            clazz = parser.parse();
        } catch (final IOException e) {
            e.printStackTrace();
            return null;
        }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/bcel/verifier/Verifier.java`
#### Snippet
```java
                System.gc();
            } catch (final ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
```

## RuleId[id=SuspiciousToArrayCall]
### SuspiciousToArrayCall
Array of type 'org.apache.bcel.verifier.structurals.Subroutine\[\]' expected, 'org.apache.bcel.verifier.structurals.Subroutines.SubroutineImpl\[\]' found
in `src/main/java/org/apache/bcel/verifier/structurals/Subroutines.java`
#### Snippet
```java
                }
            }
            return h.toArray(EMPTY_ARRAY);
        }

```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `Annotations()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/bcel/classfile/Annotations.java`
#### Snippet
```java
     * @param isRuntimeVisible whether this Annotation visible at runtime
     */
    public Annotations(final byte annotationType, final int nameIndex, final int length, final AnnotationEntry[] annotationTable,
            final ConstantPool constantPool, final boolean isRuntimeVisible) {
        super(annotationType, nameIndex, length, constantPool);
```

### NonProtectedConstructorInAbstractClass
Constructor `ConstantCP()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/bcel/classfile/ConstantCP.java`
#### Snippet
```java
     * @param c Source to copy.
     */
    public ConstantCP(final ConstantCP c) {
        this(c.getTag(), c.getClassIndex(), c.getNameAndTypeIndex());
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `ParameterAnnotations()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/bcel/classfile/ParameterAnnotations.java`
#### Snippet
```java
     * @param constantPool Array of constants
     */
    public ParameterAnnotations(final byte parameterAnnotationType, final int nameIndex, final int length,
        final ParameterAnnotationEntry[] parameterAnnotationTable, final ConstantPool constantPool) {
        super(parameterAnnotationType, nameIndex, length, constantPool);
```

### NonProtectedConstructorInAbstractClass
Constructor `AccessFlags()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/bcel/classfile/AccessFlags.java`
#### Snippet
```java
     * @param a initial access flags
     */
    public AccessFlags(final int a) {
        access_flags = a;
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `AccessFlags()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/bcel/classfile/AccessFlags.java`
#### Snippet
```java
    protected int access_flags; // TODO not used externally at present

    public AccessFlags() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `NameSignatureInstruction()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/bcel/generic/NameSignatureInstruction.java`
#### Snippet
```java
    }

    public NameSignatureInstruction(final short opcode, final int index) {
        super(opcode, index);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `NameSignatureInstruction()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/bcel/generic/NameSignatureInstruction.java`
#### Snippet
```java
public abstract class NameSignatureInstruction extends CPInstruction {

    public NameSignatureInstruction() {
    }

```

### NonProtectedConstructorInAbstractClass
Constructor `StaticCodeConstraintException()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/bcel/verifier/exc/StaticCodeConstraintException.java`
#### Snippet
```java
    private static final long serialVersionUID = 3858523065007725128L;

    public StaticCodeConstraintException(final String message) {
        super(message);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `Instruction()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/bcel/generic/Instruction.java`
#### Snippet
```java
    }

    public Instruction(final short opcode, final short length) {
        this.length = length;
        this.opcode = opcode;
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `arrayNesting`
in `src/main/java/org/apache/bcel/classfile/ElementValue.java`
#### Snippet
```java

        case ARRAY:
            arrayNesting++;
            if (arrayNesting > Const.MAX_ARRAY_DIMENSIONS) {
                // JVM spec 4.4.1
```

### AssignmentToMethodParameter
Assignment to method parameter `interfaces`
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java
        super(accessFlags);
        if (interfaces == null) {
            interfaces = ArrayUtils.EMPTY_INT_ARRAY;
        }
        if (attributes == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `attributes`
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java
        }
        if (attributes == null) {
            attributes = Attribute.EMPTY_ARRAY;
        }
        if (fields == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `fields`
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java
        }
        if (fields == null) {
            fields = Field.EMPTY_FIELD_ARRAY;
        }
        if (methods == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `methods`
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java
        }
        if (methods == null) {
            methods = Method.EMPTY_METHOD_ARRAY;
        }
        this.classNameIndex = classNameIndex;
```

### AssignmentToMethodParameter
Assignment to method parameter `pre`
in `src/main/java/org/apache/bcel/verifier/exc/VerifierConstraintViolatedException.java`
#### Snippet
```java
    public void extendMessage(String pre, String post) {
        if (pre == null) {
            pre = "";
        }
        if (detailMessage == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `post`
in `src/main/java/org/apache/bcel/verifier/exc/VerifierConstraintViolatedException.java`
#### Snippet
```java
        }
        if (post == null) {
            post = "";
        }
        detailMessage = pre + detailMessage + post;
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
        if (index > 0) {
            suffix = name.substring(index);
            name = name.substring(0, index);
        }
        return getPath(name, suffix);
```

### AssignmentToMethodParameter
Assignment to method parameter `fullyQualifiedClassName`
in `src/main/java/org/apache/bcel/verifier/VerifyDialog.java`
#### Snippet
```java
        final int dotclasspos = fullyQualifiedClassName.lastIndexOf(JavaClass.EXTENSION);
        if (dotclasspos != -1) {
            fullyQualifiedClassName = fullyQualifiedClassName.substring(0, dotclasspos);
        }
        fullyQualifiedClassName = Utility.pathToPackage(fullyQualifiedClassName);
```

### AssignmentToMethodParameter
Assignment to method parameter `fullyQualifiedClassName`
in `src/main/java/org/apache/bcel/verifier/VerifyDialog.java`
#### Snippet
```java
            fullyQualifiedClassName = fullyQualifiedClassName.substring(0, dotclasspos);
        }
        fullyQualifiedClassName = Utility.pathToPackage(fullyQualifiedClassName);
        this.className = fullyQualifiedClassName;
        initialize();
```

### AssignmentToMethodParameter
Assignment to method parameter `next`
in `src/main/java/org/apache/bcel/generic/InstructionList.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder("{ ");
        for (InstructionHandle ih = first; ih != null; ih = next) {
            next = ih.getNext();
            length--;
            if (ih.hasTargeters()) { // Still got targeters?
```

### AssignmentToMethodParameter
Assignment to method parameter `argNames`
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
                }
            } else { // Give them dummy names
                argNames = new String[size];
                for (int i = 0; i < size; i++) {
                    argNames[i] = "arg" + i;
```

### AssignmentToMethodParameter
Assignment to method parameter `className`
in `src/main/java/org/apache/bcel/util/AbstractClassPathRepository.java`
#### Snippet
```java
            throw new IllegalArgumentException("Invalid class name " + className);
        }
        className = Utility.pathToPackage(className); // Just in case, canonical form
        final JavaClass clazz = findClass(className);
        if (clazz != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `src/main/java/org/apache/bcel/verifier/exc/AssertionViolatedException.java`
#### Snippet
```java
     */
    public AssertionViolatedException(String message, final Throwable initCause) {
        super(message = "INTERNAL ERROR: " + message, initCause);
        detailMessage = message;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `pre`
in `src/main/java/org/apache/bcel/verifier/exc/AssertionViolatedException.java`
#### Snippet
```java
    public void extendMessage(String pre, String post) {
        if (pre == null) {
            pre = "";
        }
        if (detailMessage == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `post`
in `src/main/java/org/apache/bcel/verifier/exc/AssertionViolatedException.java`
#### Snippet
```java
        }
        if (post == null) {
            post = "";
        }
        detailMessage = pre + detailMessage + post;
```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `src/main/java/org/apache/bcel/verifier/exc/AssertionViolatedException.java`
#### Snippet
```java
     */
    public AssertionViolatedException(String message) {
        super(message = "INTERNAL ERROR: " + message); // Thanks to Java, the constructor call here must be first.
        detailMessage = message;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
     */
    public static short searchOpcode(String name) {
        name = name.toLowerCase(Locale.ENGLISH);
        for (short i = 0; i < Const.OPCODE_NAMES_LENGTH; i++) {
            if (Const.getOpcodeName(i).equals(name)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
            brackets = countBrackets(type.substring(index));
        }
        type = buf.toString();
        buf.setLength(0);
        for (int i = 0; i < brackets; i++) {
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
                }
                buf.append(str.substring(oldIndex)); // append rest of string
                str = buf.toString();
            }
        } catch (final StringIndexOutOfBoundsException e) { // Should not occur
```

### AssignmentToMethodParameter
Assignment to method parameter `bytes`
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
                gos.write(bytes, 0, bytes.length);
                gos.close();
                bytes = baos.toByteArray();
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
    public static String compactClassName(String str, final String prefix, final boolean chopit) {
        final int len = prefix.length();
        str = pathToPackage(str); // Is '/' on all systems, even DOS
        // If string starts with 'prefix' and contains no further dots
        if (chopit && str.startsWith(prefix) && str.substring(len).indexOf('.') == -1) {
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
        // If string starts with 'prefix' and contains no further dots
        if (chopit && str.startsWith(prefix) && str.substring(len).indexOf('.') == -1) {
            str = str.substring(len);
        }
        return str;
```

### AssignmentToMethodParameter
Assignment to method parameter `c`
in `src/main/java/org/apache/bcel/classfile/ConstantPool.java`
#### Snippet
```java
        case Const.CONSTANT_Class:
            i = ((ConstantClass) c).getNameIndex();
            c = getConstantUtf8(i);
            str = Utility.compactClassName(((ConstantUtf8) c).getBytes(), false);
            break;
```

### AssignmentToMethodParameter
Assignment to method parameter `c`
in `src/main/java/org/apache/bcel/classfile/ConstantPool.java`
#### Snippet
```java
        case Const.CONSTANT_String:
            i = ((ConstantString) c).getStringIndex();
            c = getConstantUtf8(i);
            str = "\"" + escape(((ConstantUtf8) c).getBytes()) + "\"";
            break;
```

### AssignmentToMethodParameter
Assignment to method parameter `c`
in `src/main/java/org/apache/bcel/classfile/ConstantPool.java`
#### Snippet
```java
        case Const.CONSTANT_Module:
            i = ((ConstantModule) c).getNameIndex();
            c = getConstantUtf8(i);
            str = Utility.compactClassName(((ConstantUtf8) c).getBytes(), false);
            break;
```

### AssignmentToMethodParameter
Assignment to method parameter `c`
in `src/main/java/org/apache/bcel/classfile/ConstantPool.java`
#### Snippet
```java
        case Const.CONSTANT_Package:
            i = ((ConstantPackage) c).getNameIndex();
            c = getConstantUtf8(i);
            str = Utility.compactClassName(((ConstantUtf8) c).getBytes(), false);
            break;
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/MethodParameter.java`
#### Snippet
```java
    public String getParameterName(final ConstantPool constantPool) {
        if (nameIndex == 0) {
            return null;
        }
        return constantPool.getConstantUtf8(nameIndex).getBytes();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/MethodParameter.java`
#### Snippet
```java
            // TODO should this throw?
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/generic/INSTANCEOF.java`
#### Snippet
```java
            t = ((ArrayType) t).getBasicType();
        }
        return t instanceof ObjectType ? (ObjectType) t : null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/BootstrapMethod.java`
#### Snippet
```java
            // TODO should this throw?
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/ModuleOpens.java`
#### Snippet
```java
            // TODO should this throw?
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/Annotations.java`
#### Snippet
```java
    public Attribute copy(final ConstantPool constantPool) {
        // TODO Auto-generated method stub
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/InnerClass.java`
#### Snippet
```java
            // TODO should this throw?
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/LocalVariableTable.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/LocalVariableTable.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/EnclosingMethod.java`
#### Snippet
```java
    public final ConstantNameAndType getEnclosingMethod() {
        if (methodIndex == 0) {
            return null;
        }
        return super.getConstantPool().getConstant(methodIndex, Const.CONSTANT_NameAndType, ConstantNameAndType.class);
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/generic/CHECKCAST.java`
#### Snippet
```java
            t = ((ArrayType) t).getBasicType();
        }
        return t instanceof ObjectType ? (ObjectType) t : null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/ModuleExports.java`
#### Snippet
```java
            // TODO should this throw?
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/StackMapType.java`
#### Snippet
```java
            // TODO should this throw?
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/generic/InstructionHandle.java`
#### Snippet
```java
            return attributes.get(key);
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
            return value.toString();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java
            return c;
        } catch (final CloneNotSupportedException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java
    public JavaClass getSuperClass() throws ClassNotFoundException {
        if ("java.lang.Object".equals(getClassName())) {
            return null;
        }
        return repository.loadClass(getSuperclassName());
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/Code.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/Code.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/CodeException.java`
#### Snippet
```java
            // TODO should this throw?
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/Constant.java`
#### Snippet
```java
            // TODO should this throw?
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/generic/AnnotationEntryGen.java`
#### Snippet
```java
            e.printStackTrace();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/generic/AnnotationEntryGen.java`
#### Snippet
```java
            e.printStackTrace();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/Method.java`
#### Snippet
```java
        final Code code = getCode();
        if (code == null) {
            return null;
        }
        return code.getLineNumberTable();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/Method.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/Method.java`
#### Snippet
```java
        final Code code = getCode();
        if (code == null) {
            return null;
        }
        return code.getLocalVariableTable();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/Method.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/LocalVariable.java`
#### Snippet
```java
            // TODO should this throw?
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
            final Path resovled = modulePath.resolve(name);
            try {
                return Files.exists(resovled) ? new URL("jrt:" + modulePath + "/" + name) : null;
            } catch (final MalformedURLException e) {
                return null;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
                return Files.exists(resovled) ? new URL("jrt:" + modulePath + "/" + name) : null;
            } catch (final MalformedURLException e) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
                };
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
                        return file.getCanonicalPath();
                    } catch (final IOException e) {
                        return null;
                    }
                }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java

            if (entry == null) {
                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
            final File file = toFile(name);
            try {
                return file.exists() ? file.toURI().toURL() : null;
            } catch (final MalformedURLException e) {
                return null;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
                return file.exists() ? file.toURI().toURL() : null;
            } catch (final MalformedURLException e) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
                    return file.lastModified();
                }
            } : null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
            final ZipEntry entry = zipFile.getEntry(name);
            try {
                return entry != null ? new URL("jar:file:" + zipFile.getName() + "!/" + name) : null;
            } catch (final MalformedURLException e) {
                return null;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
                return entry != null ? new URL("jar:file:" + zipFile.getName() + "!/" + name) : null;
            } catch (final MalformedURLException e) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
            final ZipEntry entry = zipFile.getEntry(name);
            try {
                return entry != null ? zipFile.getInputStream(entry) : null;
            } catch (final IOException e) {
                return null;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
                return entry != null ? zipFile.getInputStream(entry) : null;
            } catch (final IOException e) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
                return Files.newInputStream(modulePath.resolve(name));
            } catch (final IOException e) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
            final File file = toFile(name);
            try {
                return file.exists() ? new FileInputStream(file) : null;
            } catch (final IOException e) {
                return null;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
                return file.exists() ? new FileInputStream(file) : null;
            } catch (final IOException e) {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassLoaderRepository.java`
#### Snippet
```java
    @Override
    public ClassPath getClassPath() {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/MemorySensitiveClassPathRepository.java`
#### Snippet
```java
    public JavaClass findClass(final String className) {
        final SoftReference<JavaClass> ref = loadedClasses.get(className);
        return ref == null ? null : ref.get();
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/generic/ClassGen.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/generic/ClassGen.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/verifier/structurals/OperandStack.java`
#### Snippet
```java
            pop();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/verifier/statics/Pass3aVerifier.java`
#### Snippet
```java
            }
            constraintViolated(o, "expecting ObjectType but got " + rt);
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/verifier/statics/Pass3aVerifier.java`
#### Snippet
```java
            }
            // method not found in the hierarchy
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/verifier/statics/Pass3aVerifier.java`
#### Snippet
```java
            }

            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/generic/InstructionList.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/generic/InstructionList.java`
#### Snippet
```java
        }
        if (il.isEmpty()) {
            return null;
        }
        if (isEmpty()) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/generic/InstructionList.java`
#### Snippet
```java
            }
        } while (l <= r);
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/generic/InstructionList.java`
#### Snippet
```java
            ih = ih.getNext();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/generic/InstructionList.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/generic/ANEWARRAY.java`
#### Snippet
```java
            t = ((ArrayType) t).getBasicType();
        }
        return t instanceof ObjectType ? (ObjectType) t : null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/verifier/structurals/ControlFlowGraph.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
        }
        constraintViolated(o, "expecting ObjectType but got " + rt);
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/ClassLoader.java`
#### Snippet
```java
        } catch (final IOException e) {
            e.printStackTrace();
            return null;
        }
        // Adapt the class name to the passed value
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/generic/MULTIANEWARRAY.java`
#### Snippet
```java
            t = ((ArrayType) t).getBasicType();
        }
        return t instanceof ObjectType ? (ObjectType) t : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/generic/ReferenceType.java`
#### Snippet
```java
        final JavaClass[] otherSups = Repository.getSuperClasses(other.getClassName());
        if (thizSups == null || otherSups == null) {
            return null;
        }
        // Waaahh...
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/generic/ReferenceType.java`
#### Snippet
```java
        }
        // Huh? Did you ask for Type.OBJECT's superclass??
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/ModuleProvides.java`
#### Snippet
```java
            // TODO should this throw?
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/ModuleRequires.java`
#### Snippet
```java
            // TODO should this throw?
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
        ensureExistingParameterAnnotationsUnpacked();
        if (!hasParameterAnnotations || i > argTypes.length) {
            return null;
        }
        return paramAnnotations[i];
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
                return branchTargets.pop();
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/Repository.java`
#### Snippet
```java
    public static ClassPath.ClassFile lookupClassFile(final String className) {
        try (ClassPath path = repository.getClassPath()) {
            return path == null ? null : path.getClassFile(className);
        } catch (final IOException e) {
            return null;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/Repository.java`
#### Snippet
```java
            return path == null ? null : path.getClassFile(className);
        } catch (final IOException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/util/AbstractClassPathRepository.java`
#### Snippet
```java
            return loadClass(clsStream, className);
        } catch (final IOException e) {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/LineNumber.java`
#### Snippet
```java
            // TODO should this throw?
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/DescendingVisitor.java`
#### Snippet
```java
        final int size = stack.size();
        if (size < 2 || level < 0) {
            return null;
        }
        return stack.elementAt(size - (level + 2)); // size - 1 == current
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/Field.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/LocalVariableTypeTable.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
    public static String printArray(final Object[] obj, final boolean braces, final boolean quote) {
        if (obj == null) {
            return null;
        }
        final StringBuilder buf = new StringBuilder();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java
    public LocalVariablesInfo getLocalVariablesInfo(final int methodNr) {
        if (this.verify() != VerificationResult.VR_OK) {
            return null; // It's cached, don't worry.
        }
        if (methodNr < 0 || methodNr >= localVariablesInfos.length) {
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/bcel/verifier/structurals/Subroutines.java`
#### Snippet
```java
        }
        System.err.println("DEBUG: Please verify '" + any.toString(true) + "' lies in dead code.");
        return null;
        // throw new AssertionViolatedException("No subroutine for InstructionHandle found (DEAD CODE?).");
    }
```

## RuleId[id=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `name`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java

    private static final FilenameFilter ARCHIVE_FILTER = (dir, name) -> {
        name = name.toLowerCase(Locale.ENGLISH);
        return name.endsWith(".zip") || name.endsWith(".jar");
    };
```

### AssignmentToLambdaParameter
Assignment to lambda parameter `name`
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java

    private static final FilenameFilter MODULES_FILTER = (dir, name) -> {
        name = name.toLowerCase(Locale.ENGLISH);
        return name.endsWith(org.apache.bcel.classfile.Module.EXTENSION);
    };
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy 5 fields
in `src/main/java/org/apache/bcel/classfile/FieldOrMethod.java`
#### Snippet
```java
     * @param c Source to copy.
     */
    protected FieldOrMethod(final FieldOrMethod c) {
        this(c.getAccessFlags(), c.getNameIndex(), c.getSignatureIndex(), c.getAttributes(), c.getConstantPool());
    }
```

### CopyConstructorMissesField
Copy constructor does not copy field 'parameterAnnotationEntries'
in `src/main/java/org/apache/bcel/classfile/Method.java`
#### Snippet
```java
     * @param c Source to copy.
     */
    public Method(final Method c) {
        super(c);
    }
```

### CopyConstructorMissesField
Copy constructor does not copy field 'origIndex'
in `src/main/java/org/apache/bcel/classfile/LocalVariable.java`
#### Snippet
```java
     * @param localVariable Another LocalVariable.
     */
    public LocalVariable(final LocalVariable localVariable) {
        this(localVariable.getStartPC(), localVariable.getLength(), localVariable.getNameIndex(), localVariable.getSignatureIndex(), localVariable.getIndex(),
            localVariable.getConstantPool());
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/org/apache/bcel/generic/FieldGen.java`
#### Snippet
```java
     */
    @Override
    public boolean equals(final Object obj) {
        return bcelComparator.equals(this, obj);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java
     */
    @Override
    public boolean equals(final Object obj) {
        return bcelComparator.equals(this, obj);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/org/apache/bcel/classfile/Constant.java`
#### Snippet
```java
     */
    @Override
    public boolean equals(final Object obj) {
        return bcelComparator.equals(this, obj);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/org/apache/bcel/classfile/Method.java`
#### Snippet
```java
     */
    @Override
    public boolean equals(final Object obj) {
        return bcelComparator.equals(this, obj);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/org/apache/bcel/generic/ClassGen.java`
#### Snippet
```java
     */
    @Override
    public boolean equals(final Object obj) {
        return bcelComparator.equals(this, obj);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
     */
    @Override
    public boolean equals(final Object obj) {
        return bcelComparator.equals(this, obj);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/org/apache/bcel/classfile/Field.java`
#### Snippet
```java
     */
    @Override
    public boolean equals(final Object obj) {
        return bcelComparator.equals(this, obj);
    }
```
