# commons-bcel 
 
# Bad smells
I found 292 bad smells with 6 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantCast | 43 | false |
| JavadocDeclaration | 35 | false |
| UnusedAssignment | 24 | false |
| CommentedOutCode | 19 | false |
| DuplicatedCode | 18 | false |
| DeprecatedIsStillUsed | 17 | false |
| DataFlowIssue | 16 | false |
| DanglingJavadoc | 16 | false |
| StaticInitializerReferencesSubClass | 15 | false |
| Deprecation | 11 | false |
| EqualsWhichDoesntCheckParameterClass | 7 | false |
| ConstantValue | 7 | false |
| JavadocReference | 6 | false |
| DuplicateBranchesInSwitch | 5 | false |
| UnnecessaryToStringCall | 5 | true |
| ThrowablePrintedToSystemOut | 5 | false |
| UnnecessaryCallToStringValueOf | 4 | false |
| MismatchedJavadocCode | 4 | false |
| IOStreamConstructor | 4 | false |
| TrivialStringConcatenation | 4 | false |
| NonAtomicOperationOnVolatileField | 4 | false |
| RefusedBequest | 3 | false |
| JavadocLinkAsPlainText | 3 | false |
| RedundantMethodOverride | 3 | false |
| CopyConstructorMissesField | 3 | false |
| WrapperTypeMayBePrimitive | 2 | false |
| FieldCanBeLocal | 2 | false |
| MagicConstant | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| StringBufferReplaceableByString | 1 | false |
| SuspiciousToArrayCall | 1 | false |
| CloneDeclaresCloneNotSupported | 1 | false |
| InstantiationOfUtilityClass | 1 | false |
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

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `out` is inaccessible from here
in `src/main/java/org/apache/bcel/classfile/LocalVariable.java`
#### Snippet
```java
     * @param dataOutputStream Output file stream
     * @throws IOException if an I/O error occurs.
     * @see java.io.FilterOutputStream#out
     */
    public void dump(final DataOutputStream dataOutputStream) throws IOException {
```

### JavadocReference
Cannot resolve symbol `bootstrap_index`
in `src/main/java/org/apache/bcel/generic/InstructionFactory.java`
#### Snippet
```java
     * Create an invokedynamic instruction.
     *
     * @param bootstrap_index index into the bootstrap_methods array
     * @param name name of the called method
     * @param ret_type return type of method
```

### JavadocReference
Cannot resolve symbol `name`
in `src/main/java/org/apache/bcel/generic/InstructionFactory.java`
#### Snippet
```java
     *
     * @param bootstrap_index index into the bootstrap_methods array
     * @param name name of the called method
     * @param ret_type return type of method
     * @param argTypes argument types of method
```

### JavadocReference
Cannot resolve symbol `ret_type`
in `src/main/java/org/apache/bcel/generic/InstructionFactory.java`
#### Snippet
```java
     * @param bootstrap_index index into the bootstrap_methods array
     * @param name name of the called method
     * @param ret_type return type of method
     * @param argTypes argument types of method
     * @see Const
```

### JavadocReference
Cannot resolve symbol `argTypes`
in `src/main/java/org/apache/bcel/generic/InstructionFactory.java`
#### Snippet
```java
     * @param name name of the called method
     * @param ret_type return type of method
     * @param argTypes argument types of method
     * @see Const
     */
```

### JavadocReference
Cannot resolve symbol `stream`
in `src/main/java/org/apache/bcel/util/CodeHTML.java`
#### Snippet
```java
     * Disassemble a stream of byte codes and return the string representation.
     *
     * @param stream data input stream
     * @return String representation of byte code
     */
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

## RuleId[id=StaticInitializerReferencesSubClass]
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
    public static final BasicType BYTE = new BasicType(Const.T_BYTE);
    public static final BasicType LONG = new BasicType(Const.T_LONG);
    public static final BasicType DOUBLE = new BasicType(Const.T_DOUBLE);
    public static final BasicType FLOAT = new BasicType(Const.T_FLOAT);
    public static final BasicType CHAR = new BasicType(Const.T_CHAR);
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
    public static final BasicType DOUBLE = new BasicType(Const.T_DOUBLE);
    public static final BasicType FLOAT = new BasicType(Const.T_FLOAT);
    public static final BasicType CHAR = new BasicType(Const.T_CHAR);
    public static final ObjectType OBJECT = new ObjectType("java.lang.Object");
    public static final ObjectType CLASS = new ObjectType("java.lang.Class");
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
     * Predefined constants
     */
    public static final BasicType VOID = new BasicType(Const.T_VOID);

    public static final BasicType BOOLEAN = new BasicType(Const.T_BOOLEAN);
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
    public static final BasicType INT = new BasicType(Const.T_INT);
    public static final BasicType SHORT = new BasicType(Const.T_SHORT);
    public static final BasicType BYTE = new BasicType(Const.T_BYTE);
    public static final BasicType LONG = new BasicType(Const.T_LONG);
    public static final BasicType DOUBLE = new BasicType(Const.T_DOUBLE);
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

## RuleId[id=CommentedOutCode]
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

## RuleId[id=DeprecatedIsStillUsed]
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
Deprecated member '_this' is still used
in `src/main/java/org/apache/bcel/verifier/structurals/Frame.java`
#### Snippet
```java
     */
    @Deprecated
    protected static UninitializedObjectType _this;

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
Deprecated member 'name_and_type_index' is still used
in `src/main/java/org/apache/bcel/classfile/ConstantCP.java`
#### Snippet
```java
     */
    @java.lang.Deprecated
    protected int name_and_type_index; // TODO make private (has getter & setter)

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

## RuleId[id=RefusedBequest]
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

## RuleId[id=DuplicateBranchesInSwitch]
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/bcel/classfile/ModuleExports.java`
#### Snippet
```java
        final StringBuilder buf = new StringBuilder();
        final String packageName = constantPool.constantToString(exportsIndex, Const.CONSTANT_Package);
        buf.append(Utility.compactClassName(packageName, false));
        buf.append(", ").append(String.format("%04x", exportsFlags));
        buf.append(", to(").append(exportsToCount).append("):\n");
        for (final int index : exportsToIndex) {
            final String moduleName = constantPool.getConstantString(index, Const.CONSTANT_Module);
            buf.append("      ").append(Utility.compactClassName(moduleName, false)).append("\n");
        }
        return buf.substring(0, buf.length() - 1); // remove the last newline
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
                if (signature.charAt(consumedChars) == '+') {
                    type.append("? extends ");
                    consumedChars++;
                } else if (signature.charAt(consumedChars) == '-') {
                    type.append("? super ");
                    consumedChars++;
                }

                // get the first TypeArgument
                if (signature.charAt(consumedChars) == '*') {
                    type.append("?");
                    consumedChars++;
                } else {
                    type.append(typeSignatureToString(signature.substring(consumedChars), chopit));
                    // update our consumed count by the number of characters the for type argument
                    consumedChars = unwrap(Utility.CONSUMER_CHARS) + consumedChars;
                    wrap(Utility.CONSUMER_CHARS, consumedChars);
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/bcel/generic/INVOKEDYNAMIC.java`
#### Snippet
```java
        v.visitExceptionThrower(this);
        v.visitTypedInstruction(this);
        v.visitStackConsumer(this);
        v.visitStackProducer(this);
        v.visitLoadClass(this);
        v.visitCPInstruction(this);
        v.visitFieldOrMethod(this);
        v.visitInvokeInstruction(this);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/bcel/generic/PUTFIELD.java`
#### Snippet
```java
        v.visitExceptionThrower(this);
        v.visitStackConsumer(this);
        v.visitPopInstruction(this);
        v.visitTypedInstruction(this);
        v.visitLoadClass(this);
        v.visitCPInstruction(this);
        v.visitFieldOrMethod(this);
        v.visitFieldInstruction(this);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/bcel/verifier/VerifierAppFrame.java`
#### Snippet
```java
                if (vr.getStatus() == VerificationResult.VERIFIED_REJECTED) {
                    all3aok = false;
                    rejected = true;
                }
                JavaClass jc = null;
                try {
                    jc = Repository.lookupClass(v.getClassName());
                    all3amsg.append("Method '").append(jc.getMethods()[i]).append("': ").append(vr.getMessage().replace('\n', ' ')).append("\n\n");
                } catch (final ClassNotFoundException ex) {
                    // FIXME: handle the error
                    ex.printStackTrace();
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java
                        checkIndex(obj, excIndex, CONST_Class);
                        final ConstantClass cc = (ConstantClass) cp.getConstant(excIndex);
                        // cannot be sure this ConstantClass has already been visited (checked)!
                        checkIndex(cc, cc.getNameIndex(), CONST_Utf8);
                        final String cname = Utility.pathToPackage(((ConstantUtf8) cp.getConstant(cc.getNameIndex())).getBytes());

                        Verifier v = VerifierFactory.getVerifier(cname);
                        VerificationResult vr = v.doPass1();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java
            final int classIndex = obj.getClassIndex();
            final ConstantClass cc = (ConstantClass) cp.getConstant(classIndex);
            final String className = ((ConstantUtf8) cp.getConstant(cc.getNameIndex())).getBytes(); // Class Name in internal form
            if (!validClassName(className)) {
                throw new ClassConstraintException("Illegal class name '" + className + "' used by '" + tostring(obj) + "'.");
            }

            final String sig = ((ConstantUtf8) cp.getConstant(cnat.getSignatureIndex())).getBytes(); // Field or Method sig.(=descriptor)
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/bcel/verifier/statics/Pass3aVerifier.java`
#### Snippet
```java
            final int idx = o.getIndex();
            if (idx < 0) {
                constraintViolated(o, "Index '" + idx + "' must be non-negative.");
            } else {
                final int maxminus1 = maxLocals() - 1;
                if (idx > maxminus1) {
                    constraintViolated(o, "Index '" + idx + "' must not be greater than max_locals-1 '" + maxminus1 + "'.");
                }
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/bcel/verifier/statics/Pass3aVerifier.java`
#### Snippet
```java
            final int idx = o.getIndex();
            if (idx < 0) {
                constraintViolated(o, "Index '" + idx + "' must be non-negative."
                    + " [Constraint by JustIce as an analogon to the single-slot xLOAD/xSTORE instructions; may not happen anyway.]");
            } else {
                final int maxminus2 = maxLocals() - 2;
                if (idx > maxminus2) {
                    constraintViolated(o, "Index '" + idx + "' must not be greater than max_locals-2 '" + maxminus2 + "'.");
                }
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/bcel/verifier/statics/Pass3aVerifier.java`
#### Snippet
```java
                final String fieldName = o.getFieldName(constantPoolGen);
                final JavaClass jc = Repository.lookupClass(getObjectType(o).getClassName());
                final Field f = jc.findField(fieldName, o.getType(constantPoolGen));
                if (f == null) {
                    throw new AssertionViolatedException("Field '" + fieldName + "' not found in " + jc.getClassName());
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/bcel/verifier/statics/Pass3aVerifier.java`
#### Snippet
```java
                final String className = o.getClassName(constantPoolGen);
                final JavaClass jc = Repository.lookupClass(className);
                final Method m = getMethodRecursive(jc, o);
                if (m == null) {
                    constraintViolated(o, "Referenced method '" + o.getMethodName(constantPoolGen) + "' with expected signature '"
                        + o.getSignature(constantPoolGen) + "' not found in class '" + jc.getClassName() + "'.");
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/bcel/verifier/statics/Pass3aVerifier.java`
#### Snippet
```java
        String ret;
        try {
            ret = obj.toString();
        }

        catch (final RuntimeException e) {
            // including ClassFormatException, trying to convert the "signature" of a ReturnaddressType LocalVariable
            // (shouldn't occur, but people do crazy things)
            String s = obj.getClass().getName();
            s = s.substring(s.lastIndexOf(".") + 1);
            ret = "<<" + s + ">>";
        }
        return ret;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/bcel/verifier/structurals/ControlFlowGraph.java`
#### Snippet
```java
                if (inst instanceof Select) {
                    // BCEL's getTargets() returns only the non-default targets,
                    // thanks to Eli Tilevich for reporting.
                    final InstructionHandle[] matchTargets = ((Select) inst).getTargets();
                    final InstructionHandle[] ret = new InstructionHandle[matchTargets.length + 1];
                    ret[0] = ((Select) inst).getTarget();
                    System.arraycopy(matchTargets, 0, ret, 1, matchTargets.length);
                    return ret;
                }
                final InstructionHandle[] pair = new InstructionHandle[2];
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/bcel/verifier/structurals/ExecutionVisitor.java`
#### Snippet
```java
            final Type u = stack().pop();
            if (u.getSize() == 2) {
                stack().push(t);
            } else {
                final Type v = stack().pop();
                stack().push(t);
                stack().push(v);
            }
            stack().push(u);
            stack().push(t);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/bcel/verifier/structurals/ExecutionVisitor.java`
#### Snippet
```java
        if (w2.getSize() == 2) {
            stack().push(w1);
        } else {
            final Type w3 = stack().pop();
            stack().push(w1);
            stack().push(w3);
        }
        stack().push(w2);
        stack().push(w1);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/bcel/verifier/structurals/ExecutionVisitor.java`
#### Snippet
```java
        stack().pop(o.getArgumentTypes(cpg).length);
        // We are sure the invoked method will xRETURN eventually
        // We simulate xRETURNs functionality here because we
        // don't really "jump into" and simulate the invoked
        // method.
        if (o.getReturnType(cpg) != Type.VOID) {
            Type t = o.getReturnType(cpg);
            if (t.equals(Type.BOOLEAN) || t.equals(Type.CHAR) || t.equals(Type.BYTE) || t.equals(Type.SHORT)) {
                t = Type.INT;
            }
            stack().push(t);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/bcel/verifier/structurals/ExecutionVisitor.java`
#### Snippet
```java
        stack().pop(); // objectref
        stack().pop(o.getArgumentTypes(cpg).length);
        // We are sure the invoked method will xRETURN eventually
        // We simulate xRETURNs functionality here because we
        // don't really "jump into" and simulate the invoked
        // method.
        if (o.getReturnType(cpg) != Type.VOID) {
            Type t = o.getReturnType(cpg);
            if (t.equals(Type.BOOLEAN) || t.equals(Type.CHAR) || t.equals(Type.BYTE) || t.equals(Type.SHORT)) {
                t = Type.INT;
            }
            stack().push(t);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/bcel/verifier/structurals/ExecutionVisitor.java`
#### Snippet
```java
        final Constant c = cpg.getConstant(o.getIndex());
        if (c instanceof ConstantInteger) {
            stack().push(Type.INT);
        }
        if (c instanceof ConstantFloat) {
            stack().push(Type.FLOAT);
        }
        if (c instanceof ConstantString) {
            stack().push(Type.STRING);
        }
        if (c instanceof ConstantClass) {
            stack().push(Type.CLASS);
        }
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

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
                @Override
                public InputStream getInputStream() throws IOException {
                    return new FileInputStream(file);
                }

```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
            final File file = toFile(name);
            try {
                return file.exists() ? new FileInputStream(file) : null;
            } catch (final IOException e) {
                return null;
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java
            }
        }
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            dump(dos);
        }
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/bcel/classfile/ClassParser.java`
#### Snippet
```java
                    dataInputStream = new DataInputStream(new BufferedInputStream(zip.getInputStream(entry), BUFSIZE));
                } else {
                    dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName), BUFSIZE));
                }
            }
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

## RuleId[id=Deprecation]
### Deprecation
'signature' is deprecated
in `src/main/java/org/apache/bcel/generic/ArrayType.java`
#### Snippet
```java
    @Override
    public String getClassName() {
        return signature;
    }

```

### Deprecation
'org.apache.bcel.Constants' is deprecated
in `src/main/java/org/apache/bcel/classfile/LocalVariable.java`
#### Snippet
```java
 * @see LocalVariableTypeTable
 */
public final class LocalVariable implements Cloneable, Node, Constants {

    static final LocalVariable[] EMPTY_ARRAY = {};
```

### Deprecation
'org.apache.bcel.generic.InstructionConstants' is deprecated
in `src/main/java/org/apache/bcel/generic/InstructionFactory.java`
#### Snippet
```java
 * @see InstructionConst
 */
public class InstructionFactory implements InstructionConstants {

    private static class MethodObject {
```

### Deprecation
'org.apache.bcel.Constants' is deprecated
in `src/main/java/org/apache/bcel/classfile/CodeException.java`
#### Snippet
```java
 * @see Code
 */
public final class CodeException implements Cloneable, Node, Constants {

    /**
```

### Deprecation
'org.apache.bcel.Constants' is deprecated
in `src/main/java/org/apache/bcel/verifier/structurals/UninitializedObjectType.java`
#### Snippet
```java
 * 147: 4.9.4 for more details.
 */
public class UninitializedObjectType extends ReferenceType implements Constants {

    /** The "initialized" version. */
```

### Deprecation
'org.apache.bcel.util.ClassLoader' is deprecated
in `src/main/java/org/apache/bcel/util/JavaWrapper.java`
#### Snippet
```java
 * </pre>
 *
 * @see ClassLoader
 */
public class JavaWrapper {
```

### Deprecation
'org.apache.bcel.generic.InstructionConstants' is deprecated
in `src/main/java/org/apache/bcel/generic/PUSH.java`
#### Snippet
```java
 * Wrapper class for push operations, which are implemented either as BIPUSH, LDC or xCONST_n instructions.
 */
public final class PUSH implements CompoundInstruction, VariableLengthInstruction, InstructionConstants {

    private final Instruction instruction;
```

### Deprecation
'org.apache.bcel.Constants' is deprecated
in `src/main/java/org/apache/bcel/util/Class2HTML.java`
#### Snippet
```java
 * appropriate method in the Code frame.
 */
public class Class2HTML implements Constants {

    private static String classPackage; // name of package, unclean to make it static, but ...
```

### Deprecation
Overrides deprecated method in 'org.apache.bcel.generic.FieldOrMethod'
in `src/main/java/org/apache/bcel/generic/InvokeInstruction.java`
#### Snippet
```java
     */
    @Override
    public String getClassName(final ConstantPoolGen cpg) {
        final ConstantPool cp = cpg.getConstantPool();
        final ConstantCP cmr = (ConstantCP) cp.getConstant(super.getIndex());
```

### Deprecation
'org.apache.bcel.Constants' is deprecated
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java
 * @see #do_verify()
 */
public final class Pass2Verifier extends PassVerifier implements Constants {

    /**
```

### Deprecation
'getClassName(org.apache.bcel.generic.ConstantPoolGen)' is deprecated
in `src/main/java/org/apache/bcel/util/BCELFactory.java`
#### Snippet
```java
    public void visitFieldInstruction(final FieldInstruction i) {
        final short opcode = i.getOpcode();
        final String className = i.getClassName(constantPoolGen);
        final String fieldName = i.getFieldName(constantPoolGen);
        final Type type = i.getFieldType(constantPoolGen);
```

## RuleId[id=TrivialStringConcatenation]
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
in `src/main/java/org/apache/bcel/util/CodeHTML.java`
#### Snippet
```java
                        anchor2 = "<A NAME=code" + methodNumber + "@" + code.length + ">" + offset + "</A>";
                    } else {
                        anchor2 = "" + offset;
                    }
                    printWriter.println("<TR VALIGN=TOP><TD>" + anchor2 + "</TD><TD>" + anchor + str + "</TR>");
```

## RuleId[id=UnnecessaryToStringCall]
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
        buf.append(")");
        return access + (!access.isEmpty() ? " " : "") + // May be an empty string
            type + " " + name + buf.toString();
    }

```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/bcel/classfile/EmptyVisitor.java`
#### Snippet
```java
    }

    /**
     * @since 6.0
     * @Override public void visitStackMapTable(StackMapTable obj) { }
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/bcel/classfile/EmptyVisitor.java`
#### Snippet
```java
     */

    /**
     * @since 6.0
     * @Override public void visitStackMapTableEntry(StackMapTableEntry obj) { }
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/bcel/classfile/ConstantCP.java`
#### Snippet
```java
public abstract class ConstantCP extends Constant {

    /**
     * References to the constants containing the class and the field signature
     */
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/bcel/classfile/ClassParser.java`
#### Snippet
```java
                }
            }
            /****************** Read headers ********************************/
            // Check magic tag of class file
            readID();
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/bcel/classfile/ClassParser.java`
#### Snippet
```java
            // Get compiler version
            readVersion();
            /****************** Read constant pool and related **************/
            // Read constant pool entries
            readConstantPool();
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/bcel/classfile/ClassParser.java`
#### Snippet
```java
            // Get interface information, i.e., implemented interfaces
            readInterfaces();
            /****************** Read class fields and methods ***************/
            // Read class fields, i.e., the variables of the class
            readFields();
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/bcel/classfile/ClassParser.java`
#### Snippet
```java
    }

    /******************** Private utility methods **********************/
    /**
     * Checks whether the header of the file is ok. Of course, this has to be the first action on successive file reads.
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
    }

    /***************************************************************/
    /* "generic"visitXXXX methods where XXXX is an interface */
    /* therefore, we don't know the order of visiting; but we know */
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
    /* therefore, we don't know the order of visiting; but we know */
    /* these methods are called before the visitYYYY methods below */
    /***************************************************************/

    /**
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
    }

    /***************************************************************/
    /* "special"visitXXXX methods for one type of instruction each */
    /***************************************************************/
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
    /***************************************************************/
    /* "special"visitXXXX methods for one type of instruction each */
    /***************************************************************/

    /**
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
    }

    /***************************************************************/
    /* "generic" visitYYYY methods where YYYY is a superclass. */
    /* therefore, we know the order of visiting; we know */
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
    /* therefore, we know the order of visiting; we know */
    /* these methods are called after the visitXXXX methods above. */
    /***************************************************************/
    /**
     * Ensures the general preconditions of a CPInstruction instance.
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
    }

    /***************************************************************/
    /* MISC */
    /***************************************************************/
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
    /***************************************************************/
    /* MISC */
    /***************************************************************/
    /**
     * Ensures the general preconditions of an instruction that accesses the stack. This method is here because BCEL has no
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/apache/bcel/classfile/Utility.java`
#### Snippet
```java
    }

    /**
     * WARNING:
     *
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/bcel/classfile/Field.java`
#### Snippet
```java

    /**
     * See https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.2.2
     *
     * @return type of field
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/bcel/classfile/StackMapEntry.java`
#### Snippet
```java
 * byte code offset. See CLDC specification 5.3.1.2.
 *
 * See also https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.7.4
 *
 * <pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/bcel/classfile/ElementValue.java`
#### Snippet
```java

/**
 * The element_value structure is documented at https://docs.oracle.com/javase/specs/jvms/se11/html/jvms-4.html#jvms-4.7.16.1
 *
 * <pre>
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/bcel/classfile/Module.java`
#### Snippet
```java
    private ModuleExports[] exportsTable;
    private ModuleOpens[] opensTable;
    private final int usesCount;
    private final int[] usesIndex;
    private ModuleProvides[] providesTable;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/bcel/verifier/VerifierAppFrame.java`
#### Snippet
```java

    private static final long serialVersionUID = -542458133073307640L;
    private JPanel contentPane;
    private final JSplitPane jSplitPane1 = new JSplitPane();
    private final JPanel jPanel1 = new JPanel();
```

## RuleId[id=ThrowablePrintedToSystemOut]
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

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `visitStackMapType()` is identical to its super method
in `src/main/java/org/apache/bcel/classfile/EmptyVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitStackMapType(final StackMapType obj) {
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
Method `visitConstantDynamic()` is identical to its super method
in `src/main/java/org/apache/bcel/classfile/EmptyVisitor.java`
#### Snippet
```java
     */
    @Override
    public void visitConstantDynamic(final ConstantDynamic obj) {
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param constantPool` tag description is missing
in `src/main/java/org/apache/bcel/classfile/ConstantPool.java`
#### Snippet
```java

    /**
     * @param constantPool
     */
    public void setConstantPool(final Constant[] constantPool) {
```

### JavadocDeclaration
`@param sourceFileIndex` tag description is missing
in `src/main/java/org/apache/bcel/classfile/SourceFile.java`
#### Snippet
```java

    /**
     * @param sourceFileIndex
     */
    public void setSourceFileIndex(final int sourceFileIndex) {
```

### JavadocDeclaration
`@param THIS` tag description is missing
in `src/main/java/org/apache/bcel/util/BCELComparator.java`
#### Snippet
```java
     * Return hashcode for THIS.hashCode()
     *
     * @param THIS
     * @return hashcode for THIS.hashCode()
     */
```

### JavadocDeclaration
`@param THIS` tag description is missing
in `src/main/java/org/apache/bcel/util/BCELComparator.java`
#### Snippet
```java
     * Compare two objects and return what THIS.equals(THAT) should return
     *
     * @param THIS
     * @param THAT
     * @return true if and only if THIS equals THAT
```

### JavadocDeclaration
`@param THAT` tag description is missing
in `src/main/java/org/apache/bcel/util/BCELComparator.java`
#### Snippet
```java
     *
     * @param THIS
     * @param THAT
     * @return true if and only if THIS equals THAT
     */
```

### JavadocDeclaration
`@param index` tag description is missing
in `src/main/java/org/apache/bcel/Const.java`
#### Snippet
```java
     * The primitive class names corresponding to the T_XX constants, e.g., CLASS_TYPE_NAMES[T_INT] = "java.lang.Integer"
     *
     * @param index
     * @return the class name
     * @since 6.0
```

### JavadocDeclaration
`@param index` tag description is missing
in `src/main/java/org/apache/bcel/Const.java`
#### Snippet
```java
    /**
     *
     * @param index
     * @return the CONSTANT_NAMES entry at the given index
     * @since 6.0
```

### JavadocDeclaration
`@param index` tag description is missing
in `src/main/java/org/apache/bcel/Const.java`
#### Snippet
```java
    /**
     *
     * @param index
     * @return Number of words produced onto operand stack
     * @since 6.0
```

### JavadocDeclaration
`@param index` tag description is missing
in `src/main/java/org/apache/bcel/Const.java`
#### Snippet
```java
    /**
     *
     * @param index
     * @return the attribute name
     * @since 6.0
```

### JavadocDeclaration
`@param index` tag description is missing
in `src/main/java/org/apache/bcel/Const.java`
#### Snippet
```java

    /**
     * @param index
     * @return the ACCESS_NAMES entry at the given index
     * @since 6.0
```

### JavadocDeclaration
`@param index` tag description is missing
in `src/main/java/org/apache/bcel/Const.java`
#### Snippet
```java
    /**
     *
     * @param index
     * @return Number of byte code operands
     * @since 6.0
```

### JavadocDeclaration
`@param index` tag description is missing
in `src/main/java/org/apache/bcel/Const.java`
#### Snippet
```java
    /**
     *
     * @param index
     * @return the method handle name
     * @since 6.0
```

### JavadocDeclaration
`@param index` tag description is missing
in `src/main/java/org/apache/bcel/Const.java`
#### Snippet
```java
    /**
     *
     * @param index
     * @return Number of words consumed on operand stack
     * @since 6.0
```

### JavadocDeclaration
`@param index` tag description is missing
in `src/main/java/org/apache/bcel/Const.java`
#### Snippet
```java
    /**
     *
     * @param index
     * @return the short type name
     * @since 6.0
```

### JavadocDeclaration
`@param index` tag description is missing
in `src/main/java/org/apache/bcel/Const.java`
#### Snippet
```java
     * The primitive type names corresponding to the T_XX constants, e.g., TYPE_NAMES[T_INT] = "int"
     *
     * @param index
     * @return the type name
     * @since 6.0
```

### JavadocDeclaration
`@param index` tag description is missing
in `src/main/java/org/apache/bcel/Const.java`
#### Snippet
```java
    /**
     *
     * @param index
     * @return the item name
     * @since 6.0
```

### JavadocDeclaration
`@param classPath` tag description is missing
in `src/main/java/org/apache/bcel/util/ClassPath.java`
#### Snippet
```java
     * Search for classes in given path.
     *
     * @param classPath
     */
    public ClassPath(final String classPath) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java
     * @param fieldType the field type to find
     * @return field matching given name and type, null if field is not found or not accessible from this class.
     * @throws ClassNotFoundException
     * @since 6.8.0
     */
```

### JavadocDeclaration
`@param pmgIndex` tag description is missing
in `src/main/java/org/apache/bcel/classfile/PMGClass.java`
#### Snippet
```java

    /**
     * @param pmgIndex
     */
    public void setPMGIndex(final int pmgIndex) {
```

### JavadocDeclaration
`@param pmgClassIndex` tag description is missing
in `src/main/java/org/apache/bcel/classfile/PMGClass.java`
#### Snippet
```java

    /**
     * @param pmgClassIndex
     */
    public void setPMGClassIndex(final int pmgClassIndex) {
```

### JavadocDeclaration
`@param byteCodeOffset` tag description is missing
in `src/main/java/org/apache/bcel/classfile/StackMapEntry.java`
#### Snippet
```java
     * DO NOT USE
     *
     * @param byteCodeOffset
     * @param numberOfLocals NOT USED
     * @param typesOfLocals array of {@link StackMapType}s of locals
```

### JavadocDeclaration
`@param byteCodeOffset` tag description is missing
in `src/main/java/org/apache/bcel/classfile/StackMapEntry.java`
#### Snippet
```java
     *
     * @param tag the frameType to use
     * @param byteCodeOffset
     * @param typesOfLocals array of {@link StackMapType}s of locals
     * @param typesOfStackItems array ot {@link StackMapType}s of stack items
```

### JavadocDeclaration
`@param cp` tag description is missing
in `src/main/java/org/apache/bcel/generic/PUSH.java`
#### Snippet
```java
    /**
     *
     * @param cp
     * @param value
     * @since 6.0
```

### JavadocDeclaration
`@param value` tag description is missing
in `src/main/java/org/apache/bcel/generic/PUSH.java`
#### Snippet
```java
     *
     * @param cp
     * @param value
     * @since 6.0
     */
```

### JavadocDeclaration
`@param bytes` tag description is missing
in `src/main/java/org/apache/bcel/classfile/Synthetic.java`
#### Snippet
```java

    /**
     * @param bytes
     */
    public void setBytes(final byte[] bytes) {
```

### JavadocDeclaration
`@param array` tag description is missing
in `src/main/java/org/apache/bcel/generic/Select.java`
#### Snippet
```java
    /**
     *
     * @param array
     * @since 6.0
     */
```

### JavadocDeclaration
`@param array` tag description is missing
in `src/main/java/org/apache/bcel/generic/Select.java`
#### Snippet
```java
    /**
     *
     * @param array
     * @since 6.0
     */
```

### JavadocDeclaration
`@param index` tag description is missing
in `src/main/java/org/apache/bcel/generic/Select.java`
#### Snippet
```java
    /**
     *
     * @param index
     * @param value
     * @since 6.0
```

### JavadocDeclaration
`@param value` tag description is missing
in `src/main/java/org/apache/bcel/generic/Select.java`
#### Snippet
```java
     *
     * @param index
     * @param value
     * @since 6.0
     */
```

### JavadocDeclaration
`@param array` tag description is missing
in `src/main/java/org/apache/bcel/generic/Select.java`
#### Snippet
```java
    /**
     *
     * @param array
     * @since 6.0
     */
```

### JavadocDeclaration
`@param value` tag description is missing
in `src/main/java/org/apache/bcel/generic/ArrayElementValueGen.java`
#### Snippet
```java

    /**
     * @param value
     * @param cpool
     */
```

### JavadocDeclaration
`@param cpool` tag description is missing
in `src/main/java/org/apache/bcel/generic/ArrayElementValueGen.java`
#### Snippet
```java
    /**
     * @param value
     * @param cpool
     */
    public ArrayElementValueGen(final ArrayElementValue value, final ConstantPoolGen cpool, final boolean copyPoolEntries) {
```

### JavadocDeclaration
`@param input` tag description is missing
in `src/main/java/org/apache/bcel/classfile/AnnotationEntry.java`
#### Snippet
```java
     * Factory method to create an AnnotionEntry from a DataInput
     *
     * @param input
     * @param constantPool
     * @param isRuntimeVisible
```

### JavadocDeclaration
`@param constantPool` tag description is missing
in `src/main/java/org/apache/bcel/classfile/AnnotationEntry.java`
#### Snippet
```java
     *
     * @param input
     * @param constantPool
     * @param isRuntimeVisible
     * @return the entry
```

### JavadocDeclaration
`@param isRuntimeVisible` tag description is missing
in `src/main/java/org/apache/bcel/classfile/AnnotationEntry.java`
#### Snippet
```java
     * @param input
     * @param constantPool
     * @param isRuntimeVisible
     * @return the entry
     * @throws IOException if an I/O error occurs.
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `cp.getConstant(...)` to `ConstantCP` is redundant
in `src/main/java/org/apache/bcel/generic/NameSignatureInstruction.java`
#### Snippet
```java
    public ConstantNameAndType getNameAndType(final ConstantPoolGen cpg) {
        final ConstantPool cp = cpg.getConstantPool();
        final ConstantCP cmr = (ConstantCP) cp.getConstant(super.getIndex());
        return (ConstantNameAndType) cp.getConstant(cmr.getNameAndTypeIndex());
    }
```

### RedundantCast
Casting `cp.getConstant(...)` to `ConstantNameAndType` is redundant
in `src/main/java/org/apache/bcel/generic/NameSignatureInstruction.java`
#### Snippet
```java
        final ConstantPool cp = cpg.getConstantPool();
        final ConstantCP cmr = (ConstantCP) cp.getConstant(super.getIndex());
        return (ConstantNameAndType) cp.getConstant(cmr.getNameAndTypeIndex());
    }

```

### RedundantCast
Casting `type` to `ObjectType` is redundant
in `src/main/java/org/apache/bcel/generic/InstructionFactory.java`
#### Snippet
```java

    private static boolean isString(final Type type) {
        return type instanceof ObjectType && ((ObjectType) type).getClassName().equals("java.lang.String");
    }

```

### RedundantCast
Casting `destType` to `ObjectType` is redundant
in `src/main/java/org/apache/bcel/generic/InstructionFactory.java`
#### Snippet
```java
            return new CHECKCAST(cp.addArrayClass((ArrayType) destType));
        }
        return new CHECKCAST(cp.addClass(((ObjectType) destType).getClassName()));
    }

```

### RedundantCast
Casting `null` to `byte[]` is redundant
in `src/main/java/org/apache/bcel/classfile/Code.java`
#### Snippet
```java
    Code(final int nameIndex, final int length, final DataInput file, final ConstantPool constantPool) throws IOException {
        // Initialize with some default values which will be overwritten later
        this(nameIndex, length, file.readUnsignedShort(), file.readUnsignedShort(), (byte[]) null, (CodeException[]) null, (Attribute[]) null, constantPool);
        final int codeLength = Args.requireU4(file.readInt(), 1, "Code length attribute");
        code = new byte[codeLength]; // Read byte code
```

### RedundantCast
Casting `null` to `CodeException[]` is redundant
in `src/main/java/org/apache/bcel/classfile/Code.java`
#### Snippet
```java
    Code(final int nameIndex, final int length, final DataInput file, final ConstantPool constantPool) throws IOException {
        // Initialize with some default values which will be overwritten later
        this(nameIndex, length, file.readUnsignedShort(), file.readUnsignedShort(), (byte[]) null, (CodeException[]) null, (Attribute[]) null, constantPool);
        final int codeLength = Args.requireU4(file.readInt(), 1, "Code length attribute");
        code = new byte[codeLength]; // Read byte code
```

### RedundantCast
Casting `null` to `Attribute[]` is redundant
in `src/main/java/org/apache/bcel/classfile/Code.java`
#### Snippet
```java
    Code(final int nameIndex, final int length, final DataInput file, final ConstantPool constantPool) throws IOException {
        // Initialize with some default values which will be overwritten later
        this(nameIndex, length, file.readUnsignedShort(), file.readUnsignedShort(), (byte[]) null, (CodeException[]) null, (Attribute[]) null, constantPool);
        final int codeLength = Args.requireU4(file.readInt(), 1, "Code length attribute");
        code = new byte[codeLength]; // Read byte code
```

### RedundantCast
Casting `super.getConstantPool().getConstant(...)` to `ConstantInteger` is redundant
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java
            throw new IllegalStateException("Don't call getValueShort() on a non SHORT ElementValue");
        }
        final ConstantInteger s = (ConstantInteger) super.getConstantPool().getConstant(getIndex());
        return (short) s.getBytes();
    }
```

### RedundantCast
Casting `super.getConstantPool().getConstant(...)` to `ConstantFloat` is redundant
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java
            throw new IllegalStateException("Don't call getValueFloat() on a non FLOAT ElementValue");
        }
        final ConstantFloat f = (ConstantFloat) super.getConstantPool().getConstant(getIndex());
        return f.getBytes();
    }
```

### RedundantCast
Casting `super.getConstantPool().getConstant(...)` to `ConstantDouble` is redundant
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java
            throw new IllegalStateException("Don't call getValueDouble() on a non DOUBLE ElementValue");
        }
        final ConstantDouble d = (ConstantDouble) super.getConstantPool().getConstant(getIndex());
        return d.getBytes();
    }
```

### RedundantCast
Casting `super.getConstantPool().getConstant(...)` to `ConstantInteger` is redundant
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java
            throw new IllegalStateException("Don't call getValueBoolean() on a non BOOLEAN ElementValue");
        }
        final ConstantInteger bo = (ConstantInteger) super.getConstantPool().getConstant(getIndex());
        return bo.getBytes() != 0;
    }
```

### RedundantCast
Casting `super.getConstantPool().getConstant(...)` to `ConstantLong` is redundant
in `src/main/java/org/apache/bcel/classfile/SimpleElementValue.java`
#### Snippet
```java
            throw new IllegalStateException("Don't call getValueLong() on a non LONG ElementValue");
        }
        final ConstantLong j = (ConstantLong) super.getConstantPool().getConstant(getIndex());
        return j.getBytes();
    }
```

### RedundantCast
Casting `this` to `ObjectType` is redundant
in `src/main/java/org/apache/bcel/generic/ReferenceType.java`
#### Snippet
```java
             */
            if (T instanceof ObjectType && ((ObjectType) T).referencesClassExact()
                && (this.equals(T) || Repository.instanceOf(((ObjectType) this).getClassName(), ((ObjectType) T).getClassName()))) {
                return true;
            }
```

### RedundantCast
Casting `T` to `ObjectType` is redundant
in `src/main/java/org/apache/bcel/generic/ReferenceType.java`
#### Snippet
```java
             */
            if (T instanceof ObjectType && ((ObjectType) T).referencesClassExact()
                && (this.equals(T) || Repository.instanceOf(((ObjectType) this).getClassName(), ((ObjectType) T).getClassName()))) {
                return true;
            }
```

### RedundantCast
Casting `this` to `ObjectType` is redundant
in `src/main/java/org/apache/bcel/generic/ReferenceType.java`
#### Snippet
```java
             */
            if (T instanceof ObjectType && ((ObjectType) T).referencesInterfaceExact()
                && Repository.implementationOf(((ObjectType) this).getClassName(), ((ObjectType) T).getClassName())) {
                return true;
            }
```

### RedundantCast
Casting `T` to `ObjectType` is redundant
in `src/main/java/org/apache/bcel/generic/ReferenceType.java`
#### Snippet
```java
             */
            if (T instanceof ObjectType && ((ObjectType) T).referencesInterfaceExact()
                && Repository.implementationOf(((ObjectType) this).getClassName(), ((ObjectType) T).getClassName())) {
                return true;
            }
```

### RedundantCast
Casting `this` to `ObjectType` is redundant
in `src/main/java/org/apache/bcel/generic/ReferenceType.java`
#### Snippet
```java
             */
            if (T instanceof ObjectType && ((ObjectType) T).referencesInterfaceExact()
                && (this.equals(T) || Repository.implementationOf(((ObjectType) this).getClassName(), ((ObjectType) T).getClassName()))) {
                return true;
            }
```

### RedundantCast
Casting `T` to `ObjectType` is redundant
in `src/main/java/org/apache/bcel/generic/ReferenceType.java`
#### Snippet
```java
             */
            if (T instanceof ObjectType && ((ObjectType) T).referencesInterfaceExact()
                && (this.equals(T) || Repository.implementationOf(((ObjectType) this).getClassName(), ((ObjectType) T).getClassName()))) {
                return true;
            }
```

### RedundantCast
Casting `cp.getConstant(...)` to `ConstantCP` is redundant
in `src/main/java/org/apache/bcel/generic/FieldOrMethod.java`
#### Snippet
```java
    public String getSignature(final ConstantPoolGen cpg) {
        final ConstantPool cp = cpg.getConstantPool();
        final ConstantCP cmr = (ConstantCP) cp.getConstant(super.getIndex());
        final ConstantNameAndType cnat = (ConstantNameAndType) cp.getConstant(cmr.getNameAndTypeIndex());
        return ((ConstantUtf8) cp.getConstant(cnat.getSignatureIndex())).getBytes();
```

### RedundantCast
Casting `cp.getConstant(...)` to `ConstantNameAndType` is redundant
in `src/main/java/org/apache/bcel/generic/FieldOrMethod.java`
#### Snippet
```java
        final ConstantPool cp = cpg.getConstantPool();
        final ConstantCP cmr = (ConstantCP) cp.getConstant(super.getIndex());
        final ConstantNameAndType cnat = (ConstantNameAndType) cp.getConstant(cmr.getNameAndTypeIndex());
        return ((ConstantUtf8) cp.getConstant(cnat.getSignatureIndex())).getBytes();
    }
```

### RedundantCast
Casting `cp.getConstant(...)` to `ConstantCP` is redundant
in `src/main/java/org/apache/bcel/generic/FieldOrMethod.java`
#### Snippet
```java
    public String getClassName(final ConstantPoolGen cpg) {
        final ConstantPool cp = cpg.getConstantPool();
        final ConstantCP cmr = (ConstantCP) cp.getConstant(super.getIndex());
        final String className = cp.getConstantString(cmr.getClassIndex(), Const.CONSTANT_Class);
        if (className.startsWith("[")) {
```

### RedundantCast
Casting `cp.getConstant(...)` to `ConstantCP` is redundant
in `src/main/java/org/apache/bcel/generic/FieldOrMethod.java`
#### Snippet
```java
    public ReferenceType getReferenceType(final ConstantPoolGen cpg) {
        final ConstantPool cp = cpg.getConstantPool();
        final ConstantCP cmr = (ConstantCP) cp.getConstant(super.getIndex());
        String className = cp.getConstantString(cmr.getClassIndex(), Const.CONSTANT_Class);
        if (className.startsWith("[")) {
```

### RedundantCast
Casting `cp.getConstant(...)` to `ConstantCP` is redundant
in `src/main/java/org/apache/bcel/generic/FieldOrMethod.java`
#### Snippet
```java
    public String getName(final ConstantPoolGen cpg) {
        final ConstantPool cp = cpg.getConstantPool();
        final ConstantCP cmr = (ConstantCP) cp.getConstant(super.getIndex());
        final ConstantNameAndType cnat = (ConstantNameAndType) cp.getConstant(cmr.getNameAndTypeIndex());
        return ((ConstantUtf8) cp.getConstant(cnat.getNameIndex())).getBytes();
```

### RedundantCast
Casting `cp.getConstant(...)` to `ConstantNameAndType` is redundant
in `src/main/java/org/apache/bcel/generic/FieldOrMethod.java`
#### Snippet
```java
        final ConstantPool cp = cpg.getConstantPool();
        final ConstantCP cmr = (ConstantCP) cp.getConstant(super.getIndex());
        final ConstantNameAndType cnat = (ConstantNameAndType) cp.getConstant(cmr.getNameAndTypeIndex());
        return ((ConstantUtf8) cp.getConstant(cnat.getNameIndex())).getBytes();
    }
```

### RedundantCast
Casting `cp.getConstant(...)` to `ConstantCP` is redundant
in `src/main/java/org/apache/bcel/generic/InvokeInstruction.java`
#### Snippet
```java
    public String getClassName(final ConstantPoolGen cpg) {
        final ConstantPool cp = cpg.getConstantPool();
        final ConstantCP cmr = (ConstantCP) cp.getConstant(super.getIndex());
        final String className = cp.getConstantString(cmr.getClassIndex(), Const.CONSTANT_Class);
        return Utility.pathToPackage(className);
```

### RedundantCast
Casting `t` to `ObjectType` is redundant
in `src/main/java/org/apache/bcel/verifier/statics/Pass3aVerifier.java`
#### Snippet
```java
            }
            if (t instanceof ObjectType) {
                final Verifier v = VerifierFactory.getVerifier(((ObjectType) t).getClassName());
                final VerificationResult vr = v.doPass2();
                if (vr.getStatus() != VerificationResult.VERIFIED_OK) {
```

### RedundantCast
Casting `t` to `ObjectType` is redundant
in `src/main/java/org/apache/bcel/verifier/statics/Pass3aVerifier.java`
#### Snippet
```java
                }
                if (t instanceof ObjectType) {
                    final Verifier v = VerifierFactory.getVerifier(((ObjectType) t).getClassName());
                    final VerificationResult vr = v.doPass2();
                    if (vr.getStatus() != VerificationResult.VERIFIED_OK) {
```

### RedundantCast
Casting `cp.getConstant(...)` to `ConstantNameAndType` is redundant
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java
            }
            final int nameAndTypeIndex = obj.getNameAndTypeIndex();
            final ConstantNameAndType cnat = (ConstantNameAndType) cp.getConstant(nameAndTypeIndex);
            final String name = ((ConstantUtf8) cp.getConstant(cnat.getNameIndex())).getBytes(); // Field or Method name
            if (!validInterfaceMethodName(name)) {
```

### RedundantCast
Casting `cp.getConstant(...)` to `ConstantClass` is redundant
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java

            final int classIndex = obj.getClassIndex();
            final ConstantClass cc = (ConstantClass) cp.getConstant(classIndex);
            final String className = ((ConstantUtf8) cp.getConstant(cc.getNameIndex())).getBytes(); // Class Name in internal form
            if (!validClassName(className)) {
```

### RedundantCast
Casting `cp.getConstant(...)` to `ConstantNameAndType` is redundant
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java
            }
            final int nameAndTypeIndex = obj.getNameAndTypeIndex();
            final ConstantNameAndType cnat = (ConstantNameAndType) cp.getConstant(nameAndTypeIndex);
            final String name = ((ConstantUtf8) cp.getConstant(cnat.getNameIndex())).getBytes(); // Field or Method name
            if (!validFieldName(name)) {
```

### RedundantCast
Casting `cp.getConstant(...)` to `ConstantClass` is redundant
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java

            final int classIndex = obj.getClassIndex();
            final ConstantClass cc = (ConstantClass) cp.getConstant(classIndex);
            final String className = ((ConstantUtf8) cp.getConstant(cc.getNameIndex())).getBytes(); // Class Name in internal form
            if (!validClassName(className)) {
```

### RedundantCast
Casting `cp.getConstant(...)` to `ConstantClass` is redundant
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java
                    checkIndex(obj, excIndice, CONST_Class);

                    final ConstantClass cc = (ConstantClass) cp.getConstant(excIndice);
                    checkIndex(cc, cc.getNameIndex(), CONST_Utf8); // can't be sure this ConstantClass has already been visited (checked)!
                    // convert internal notation on-the-fly to external notation:
```

### RedundantCast
Casting `cp.getConstant(...)` to `ConstantClass` is redundant
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java
                    if (excIndex != 0) { // if 0, it catches all Throwables
                        checkIndex(obj, excIndex, CONST_Class);
                        final ConstantClass cc = (ConstantClass) cp.getConstant(excIndex);
                        // cannot be sure this ConstantClass has already been visited (checked)!
                        checkIndex(cc, cc.getNameIndex(), CONST_Utf8);
```

### RedundantCast
Casting `cp.getConstant(...)` to `ConstantNameAndType` is redundant
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java
            }
            final int nameAndTypeIndex = obj.getNameAndTypeIndex();
            final ConstantNameAndType cnat = (ConstantNameAndType) cp.getConstant(nameAndTypeIndex);
            final String name = ((ConstantUtf8) cp.getConstant(cnat.getNameIndex())).getBytes(); // Field or Method name
            if (!validClassMethodName(name)) {
```

### RedundantCast
Casting `cp.getConstant(...)` to `ConstantClass` is redundant
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java

            final int classIndex = obj.getClassIndex();
            final ConstantClass cc = (ConstantClass) cp.getConstant(classIndex);
            final String className = ((ConstantUtf8) cp.getConstant(cc.getNameIndex())).getBytes(); // Class Name in internal form
            if (!validClassName(className)) {
```

### RedundantCast
Casting `act` to `ObjectType` is redundant
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java
            }
            if (act instanceof ObjectType) {
                final Verifier v = VerifierFactory.getVerifier(((ObjectType) act).getClassName());
                final VerificationResult vr = v.doPass1();
                if (vr != VerificationResult.VR_OK) {
```

### RedundantCast
Casting `act` to `ObjectType` is redundant
in `src/main/java/org/apache/bcel/verifier/statics/Pass2Verifier.java`
#### Snippet
```java
                }
                if (act instanceof ObjectType) {
                    final Verifier v = VerifierFactory.getVerifier(((ObjectType) act).getClassName());
                    final VerificationResult vr = v.doPass1();
                    if (vr != VerificationResult.VR_OK) {
```

### RedundantCast
Casting `type` to `ObjectType` is redundant
in `src/main/java/org/apache/bcel/util/BCELFactory.java`
#### Snippet
```java
        switch (opcode) {
        case Const.NEW:
            printWriter.println("il.append(_factory.createNew(\"" + ((ObjectType) type).getClassName() + "\"));");
            break;
        case Const.MULTIANEWARRAY:
```

### RedundantCast
Casting `objref` to `ObjectType` is redundant
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
            }

            final String objRefClassName = ((ObjectType) objref).getClassName();

            final String theClass = o.getClassName(cpg);
```

### RedundantCast
Casting `objref` to `ObjectType` is redundant
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
                }

                objRefClassName = ((ObjectType) objref).getClassName();
            } else {
                if (!(objref instanceof UninitializedObjectType)) {
```

### RedundantCast
Casting `t` to `ObjectType` is redundant
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
        final Type t = o.getType(cpg);
        if (t instanceof ObjectType) {
            final String name = ((ObjectType) t).getClassName();
            final Verifier v = VerifierFactory.getVerifier(name);
            final VerificationResult vr = v.doPass2();
```

### RedundantCast
Casting `t` to `ObjectType` is redundant
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
        final Type t = o.getType(cpg);
        if (t instanceof ObjectType) {
            final String name = ((ObjectType) t).getClassName();
            final Verifier v = VerifierFactory.getVerifier(name);
            final VerificationResult vr = v.doPass2();
```

### RedundantCast
Casting `t` to `ObjectType` is redundant
in `src/main/java/org/apache/bcel/verifier/structurals/InstConstraintVisitor.java`
#### Snippet
```java
        final Type t = o.getType(cpg);
        if (t instanceof ObjectType) {
            final String name = ((ObjectType) t).getClassName();
            final Verifier v = VerifierFactory.getVerifier(name);
            final VerificationResult vr = v.doPass2();
```

## RuleId[id=CloneDeclaresCloneNotSupported]
### CloneDeclaresCloneNotSupported
`clone()` does not declare 'CloneNotSupportedException'
in `src/main/java/org/apache/bcel/verifier/structurals/Frame.java`
#### Snippet
```java
     */
    @Override
    protected Object clone() {
        return new Frame(locals.getClone(), stack.getClone());
    }
```

## RuleId[id=InstantiationOfUtilityClass]
### InstantiationOfUtilityClass
Instantiation of utility class `GraphicalVerifier`
in `src/main/java/org/apache/bcel/verifier/GraphicalVerifier.java`
#### Snippet
```java
            e.printStackTrace();
        }
        new GraphicalVerifier();
    }

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
in `src/main/java/org/apache/bcel/classfile/Field.java`
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
in `src/main/java/org/apache/bcel/generic/MethodGen.java`
#### Snippet
```java
     */
    @Override
    public boolean equals(final Object obj) {
        return bcelComparator.equals(this, obj);
    }
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
Variable `source` initializer `HEAP` is redundant
in `src/main/java/org/apache/bcel/classfile/JavaClass.java`
#### Snippet
```java

    private AnnotationEntry[] annotations; // annotations defined on the class
    private byte source = HEAP; // Generated in memory

    private boolean isAnonymous;
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
Variable `parameters` initializer `EMPTY_METHOD_PARAMETER_ARRAY` is redundant
in `src/main/java/org/apache/bcel/classfile/MethodParameters.java`
#### Snippet
```java
    private static final MethodParameter[] EMPTY_METHOD_PARAMETER_ARRAY = {};

    private MethodParameter[] parameters = EMPTY_METHOD_PARAMETER_ARRAY;

    MethodParameters(final int nameIndex, final int length, final DataInput input, final ConstantPool constantPool) throws IOException {
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

## RuleId[id=ConstantValue]
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

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `skipped`
in `src/main/java/org/apache/bcel/classfile/ConstantUtf8.java`
#### Snippet
```java
    public static ConstantUtf8 getCachedInstance(final String value) {
        if (value.length() > Cache.MAX_ENTRY_SIZE) {
            skipped++;
            return new ConstantUtf8(value);
        }
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `considered`
in `src/main/java/org/apache/bcel/classfile/ConstantUtf8.java`
#### Snippet
```java
            return new ConstantUtf8(value);
        }
        considered++;
        synchronized (ConstantUtf8.class) { // might be better with a specific lock object
            ConstantUtf8 result = Cache.CACHE.get(value);
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `created`
in `src/main/java/org/apache/bcel/classfile/ConstantUtf8.java`
#### Snippet
```java
        super(Const.CONSTANT_Utf8);
        value = dataInput.readUTF();
        created++;
    }

```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `created`
in `src/main/java/org/apache/bcel/classfile/ConstantUtf8.java`
#### Snippet
```java
        super(Const.CONSTANT_Utf8);
        this.value = Objects.requireNonNull(value, "value");
        created++;
    }

```

