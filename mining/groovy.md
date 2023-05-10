# groovy 
 
# Bad smells
I found 2400 bad smells with 92 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNCHECKED_WARNING | 475 | false |
| JavadocDeclaration | 182 | false |
| UnnecessaryUnicodeEscape | 180 | false |
| FieldMayBeFinal | 165 | false |
| NullableProblems | 128 | false |
| DuplicatedCode | 109 | false |
| ConstantValue | 106 | false |
| DataFlowIssue | 104 | false |
| UnusedAssignment | 89 | false |
| RedundantCast | 76 | false |
| AutoCloseableResource | 51 | false |
| TrivialIf | 43 | false |
| UnnecessaryLocalVariable | 36 | true |
| DefaultAnnotationParam | 36 | false |
| EmptyStatementBody | 35 | false |
| Deprecation | 32 | false |
| UnnecessaryToStringCall | 31 | true |
| CommentedOutCode | 29 | false |
| OptionalUsedAsFieldOrParameterType | 29 | false |
| SuspiciousMethodCalls | 24 | false |
| RegExpRedundantEscape | 22 | false |
| IgnoreResultOfCall | 21 | false |
| RefusedBequest | 21 | false |
| JavadocLinkAsPlainText | 20 | false |
| TrivialStringConcatenation | 19 | false |
| RegExpSimplifiable | 16 | false |
| DeprecatedIsStillUsed | 16 | false |
| EqualsWhichDoesntCheckParameterClass | 16 | false |
| FieldCanBeLocal | 15 | false |
| SimplifyOptionalCallChains | 13 | false |
| RedundantMethodOverride | 12 | false |
| WrongPackageStatement | 10 | false |
| AccessStaticViaInstance | 9 | false |
| MismatchedCollectionQueryUpdate | 9 | false |
| ProtectedMemberInFinalClass | 9 | true |
| DuplicateBranchesInSwitch | 9 | false |
| SimplifiableConditionalExpression | 9 | false |
| MismatchedJavadocCode | 9 | false |
| JavadocReference | 8 | false |
| UNUSED_IMPORT | 7 | false |
| IfStatementWithIdenticalBranches | 7 | false |
| UnnecessaryModifier | 6 | true |
| NumberEquality | 6 | false |
| DanglingJavadoc | 6 | false |
| RegExpUnnecessaryNonCapturingGroup | 6 | false |
| CStyleArrayDeclaration | 5 | false |
| PointlessNullCheck | 5 | false |
| MagicConstant | 4 | false |
| ObviousNullCheck | 4 | false |
| CollectionContainsUrl | 4 | false |
| OptionalGetWithoutIsPresent | 4 | false |
| NonAtomicOperationOnVolatileField | 4 | false |
| SwitchStatementWithTooFewBranches | 4 | false |
| RegExpRepeatedSpace | 4 | false |
| UnnecessaryContinue | 4 | false |
| CopyConstructorMissesField | 4 | false |
| ThrowableNotThrown | 4 | false |
| ToArrayCallWithZeroLengthArrayArgument | 3 | true |
| FinalStaticMethod | 3 | false |
| IntegerMultiplicationImplicitCastToLong | 3 | false |
| StringOperationCanBeSimplified | 3 | false |
| NonStrictComparisonCanBeEquality | 3 | true |
| SuspiciousSystemArraycopy | 3 | false |
| SlowListContainsAll | 3 | false |
| RedundantLengthCheck | 3 | false |
| CatchMayIgnoreException | 3 | false |
| ConditionCoveredByFurtherCondition | 3 | false |
| BigDecimalMethodWithoutRoundingCalled | 3 | false |
| MismatchedArrayReadWrite | 2 | false |
| PointlessArithmeticExpression | 2 | false |
| RedundantTypeArguments | 2 | false |
| UnnecessaryCallToStringValueOf | 2 | false |
| JavaReflectionMemberAccess | 2 | false |
| RegExpUnexpectedAnchor | 2 | false |
| CharsetObjectCanBeUsed | 2 | false |
| CaughtExceptionImmediatelyRethrown | 2 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 2 | false |
| IntegerDivisionInFloatingPointContext | 2 | false |
| ConditionalBreakInInfiniteLoop | 2 | false |
| ManualMinMaxCalculation | 2 | false |
| JUnitMalformedDeclaration | 2 | false |
| ConditionalExpressionWithIdenticalBranches | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| RegExpSingleCharAlternation | 2 | false |
| SuspiciousIndentAfterControlStatement | 2 | false |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| WrapperTypeMayBePrimitive | 1 | false |
| CloneableImplementsClone | 1 | false |
| SuspiciousNameCombination | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| TypeParameterHidesVisibleType | 1 | false |
| SwitchStatementWithConfusingDeclaration | 1 | false |
| SuspiciousToArrayCall | 1 | false |
| JavaReflectionInvocation | 1 | false |
| RedundantFileCreation | 1 | false |
| AssignmentToCatchBlockParameter | 1 | false |
| EmptyTryBlock | 1 | false |
| UnnecessaryStringEscape | 1 | true |
| NonFinalFieldInEnum | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| UnnecessaryReturn | 1 | true |
| ThrowablePrintedToSystemOut | 1 | false |
| ThrowFromFinallyBlock | 1 | false |
| InfiniteLoopStatement | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| RedundantOperationOnEmptyContainer | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[JDK_TO_BYTECODE_VERSION_MAP.size()\]'
in `src/main/java/org/codehaus/groovy/control/CompilerConfiguration.java`
#### Snippet
```java
     * The valid targetBytecode values.
     */
    public static final String[] ALLOWED_JDKS = JDK_TO_BYTECODE_VERSION_MAP.keySet().toArray(new String[JDK_TO_BYTECODE_VERSION_MAP.size()]);

    /**
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Parameter\[closureParameters.size()\]'
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/classgen/asm/ContractClosureWriter.java`
#### Snippet
```java

        MethodNode method =
                answer.addMethod("doCall", ACC_PUBLIC, ClassHelper.Boolean_TYPE, closureParameters.toArray(new Parameter[closureParameters.size()]), ClassNode.EMPTY_ARRAY, expression.getCode());
        method.setSourcePosition(expression);

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Parameter\[closureParameters.size()\]'
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/classgen/asm/ContractClosureWriter.java`
#### Snippet
```java
                ACC_PUBLIC,
                ClassHelper.Boolean_TYPE,
                closureParameters.toArray(new Parameter[closureParameters.size()]),
                ClassNode.EMPTY_ARRAY,
                returnS(callThisX("doCall", arguments)));
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `src/main/java/org/codehaus/groovy/transform/ASTTransformationVisitor.java`
#### Snippet
```java
        @Override
        public int compare(Tuple2<ASTTransformation, ASTNode[]> o1, Tuple2<ASTTransformation, ASTNode[]> o2) {
            Integer i1 = 0;
            Integer i2 = 0;
            if (o1.getV1() instanceof TransformWithPriority) {
```

## RuleId[id=MismatchedArrayReadWrite]
### MismatchedArrayReadWrite
Contents of array `threadValues` are written to, but never read
in `subprojects/stress/src/stressTest/java/org/codehaus/groovy/util/ManagedConcurrentValueMapStressTest.java`
#### Snippet
```java
        final int threadCount = 16;
        final CyclicBarrier barrier = new CyclicBarrier(threadCount + 1);
        final Object[] threadValues = new Object[threadCount];
        for (int i = 0; i < threadCount; i++) {
            final int idx = i;
```

### MismatchedArrayReadWrite
Contents of array `threadKeys` are written to, but never read
in `subprojects/stress/src/stressTest/java/org/codehaus/groovy/util/ManagedConcurrentMapStressTest.java`
#### Snippet
```java
        final int threadCount = 16;
        final CyclicBarrier barrier = new CyclicBarrier(threadCount + 1);
        final Object[] threadKeys = new Object[threadCount];
        for (int i = 0; i < threadCount; i++) {
            final int idx = i;
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/common/spi/Lifecycle.java`
#### Snippet
```java
    public void beforeProcessingMethodNode(final ProcessingContextInformation processingContextInformation, final ClassNode classNode, final MethodNode methodNode);

    public void afterProcessingMethodNode(final ProcessingContextInformation processingContextInformation, final ClassNode classNode, final MethodNode methodNode);

    public void beforeProcessingConstructorNode(final ProcessingContextInformation processingContextInformation, final ClassNode classNode, final MethodNode constructorNode);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/common/spi/Lifecycle.java`
#### Snippet
```java
    public void beforeProcessingClassNode(final ProcessingContextInformation processingContextInformation, final ClassNode classNode);

    public void afterProcessingClassNode(final ProcessingContextInformation processingContextInformation, final ClassNode classNode);

    public void beforeProcessingMethodNode(final ProcessingContextInformation processingContextInformation, final ClassNode classNode, final MethodNode methodNode);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/common/spi/Lifecycle.java`
#### Snippet
```java
public interface Lifecycle {

    public void beforeProcessingClassNode(final ProcessingContextInformation processingContextInformation, final ClassNode classNode);

    public void afterProcessingClassNode(final ProcessingContextInformation processingContextInformation, final ClassNode classNode);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/common/spi/Lifecycle.java`
#### Snippet
```java
    public void afterProcessingClassNode(final ProcessingContextInformation processingContextInformation, final ClassNode classNode);

    public void beforeProcessingMethodNode(final ProcessingContextInformation processingContextInformation, final ClassNode classNode, final MethodNode methodNode);

    public void afterProcessingMethodNode(final ProcessingContextInformation processingContextInformation, final ClassNode classNode, final MethodNode methodNode);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/common/spi/Lifecycle.java`
#### Snippet
```java
    public void afterProcessingMethodNode(final ProcessingContextInformation processingContextInformation, final ClassNode classNode, final MethodNode methodNode);

    public void beforeProcessingConstructorNode(final ProcessingContextInformation processingContextInformation, final ClassNode classNode, final MethodNode constructorNode);

    public void afterProcessingConstructorNode(final ProcessingContextInformation processingContextInformation, final ClassNode classNode, final MethodNode constructorNode);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/common/spi/Lifecycle.java`
#### Snippet
```java
    public void beforeProcessingConstructorNode(final ProcessingContextInformation processingContextInformation, final ClassNode classNode, final MethodNode constructorNode);

    public void afterProcessingConstructorNode(final ProcessingContextInformation processingContextInformation, final ClassNode classNode, final MethodNode constructorNode);
}

```

## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: Calendar.ERA, Calendar.YEAR, Calendar.MONTH, Calendar.WEEK_OF_YEAR, Calendar.WEEK_OF_MONTH, ...
in `subprojects/groovy-dateutil/src/main/java/org/apache/groovy/dateutil/extensions/DateUtilExtensions.java`
#### Snippet
```java
            Object key = entry.getKey();
            if (key instanceof String) key = CAL_MAP.get(key);
            if (key instanceof Integer) self.set((Integer) key, entry.getValue());
        }
    }
```

### MagicConstant
Should be one of: Pattern.UNIX_LINES, Pattern.CASE_INSENSITIVE, Pattern.COMMENTS, Pattern.MULTILINE, ... or their combination
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/AbstractHttpServlet.java`
#### Snippet
```java
              flags = Integer.decode(flagsStr.trim());//throws NumberFormatException
            }
            resourceNamePattern = Pattern.compile(regex, flags);
            this.resourceNameReplacement = replacement;
            String all = config.getInitParameter("resource.name.replace.all");
```

### MagicConstant
Should be one of: ResultSet.HOLD_CURSORS_OVER_COMMIT, ResultSet.CLOSE_CURSORS_AT_COMMIT
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
            return connection.createStatement(resultSetType, resultSetConcurrency);
        }
        return connection.createStatement(resultSetType, resultSetConcurrency, resultSetHoldability);
    }

```

### MagicConstant
Should be one of: ResultSet.HOLD_CURSORS_OVER_COMMIT, ResultSet.CLOSE_CURSORS_AT_COMMIT
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
                return connection.prepareStatement(sql, resultSetType, resultSetConcurrency);
            }
            return connection.prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
        }

```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`(MAX_ARGS + 1) * numberOfBaseMethods()` can be replaced with 'numberOfBaseMethods()'
in `src/main/java/org/codehaus/groovy/classgen/asm/MethodCallerMultiAdapter.java`
#### Snippet
```java
        if (spreadSafe && !skipSpreadSafeAndSafe) offset = 2;
        if (numberOfArguments > MAX_ARGS || numberOfArguments < 0) {
            offset += (MAX_ARGS + 1) * numberOfBaseMethods();
        } else {
            offset += numberOfArguments * numberOfBaseMethods();
```

### PointlessArithmeticExpression
`(MAX_ARGS + 1) * numberOfBaseMethods` can be replaced with 'numberOfBaseMethods'
in `src/main/java/org/codehaus/groovy/classgen/asm/MethodCallerMultiAdapter.java`
#### Snippet
```java
                mcma.methods[idx + 2] = MethodCaller.newStatic(theClass, baseName + i + "SpreadSafe");
            }
            final int idx = (MAX_ARGS + 1) * numberOfBaseMethods;
            mcma.methods[idx] = MethodCaller.newStatic(theClass, baseName + "N");
            if (!skipSpreadSafeAndSafe) {
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/ast/expr/DeclarationExpression.java`
#### Snippet
```java

    private static void check(final Expression left) {
        if (left instanceof VariableExpression) {
            // all good
        } else if (left instanceof TupleExpression) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/ast/decompiled/TypeSignatureParser.java`
#### Snippet
```java
        } else {
            ClassNode parameterizedType = baseType.getPlainNodeReference();
            if (arguments.isEmpty()) {
                // GROOVY-10234: no type arguments -> raw type
            } else {
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/org/codehaus/groovy/util/ComplexKeyHashMap.java`
#### Snippet
```java
                Entry n = null;
                if (size != 0) { // advance to first entry
                    while (i > 0 && (n = t[--i]) == null) {}
                }
                next = n;
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/ast/tools/GeneralUtils.java`
#### Snippet
```java
            return maybeFallsThrough(((IfStatement) statement).getElseBlock())
                || maybeFallsThrough(((IfStatement) statement).getIfBlock());
        } else if (statement instanceof SwitchStatement) {
            // TODO
        } else if (statement instanceof TryCatchStatement) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/ast/tools/GenericsUtils.java`
#### Snippet
```java
        } else if (type.isArray() && target.isArray()) {
            extractSuperClassGenerics(type.getComponentType(), target.getComponentType(), spec);
        } else if (type.isArray() && target.getName().equals(JAVA_LANG_OBJECT)) {
            // Object is the superclass of an array, but no generics are involved
        } else if (type.equals(target) || !implementsInterfaceOrIsSubclassOf(type, target)) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/control/InstanceOfVerifier.java`
#### Snippet
```java
                    addTypeError(expression.getRightExpression(), "type parameter " + referenceType.getUnresolvedName() +
                        ". Use its erasure " + referenceType.getNameWithoutPackage() + " instead since further generic type information will be erased at runtime");
                } else if (referenceType.getGenericsTypes() != null) {
                    // TODO: Cannot perform instanceof check against parameterized type Class<Type>. Use the form Class<?> instead since further generic type information will be erased at runtime
                }
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/org/codehaus/groovy/runtime/memoize/Memoize.java`
#### Snippet
```java
         */
        private static void cleanUpNullReferences(final MemoizeCache<Object, Object> cache, final ReferenceQueue queue) {
            while(queue.poll() != null) {}  //empty the reference queue
            cache.cleanUpNullReferences();
        }
```

### EmptyStatementBody
`while` statement has empty body
in `src/main/java/org/codehaus/groovy/runtime/metaclass/MetaMethodIndex.java`
#### Snippet
```java
                Entry n = null;
                if (size != 0) { // advance to first entry
                    while (i > 0 && (n = t[--i]) == null) {
                    }
                }
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/classgen/AnnotationVisitor.java`
#### Snippet
```java
        if (attrType.isArray()) {
            checkReturnType(attrType.getComponentType(), node);
        } else if (ClassHelper.isPrimitiveType(attrType)) {
        } else if (ClassHelper.isStringType(attrType)) {
        } else if (ClassHelper.isClassType(attrType)) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/classgen/AnnotationVisitor.java`
#### Snippet
```java
            checkReturnType(attrType.getComponentType(), node);
        } else if (ClassHelper.isPrimitiveType(attrType)) {
        } else if (ClassHelper.isStringType(attrType)) {
        } else if (ClassHelper.isClassType(attrType)) {
        } else if (attrType.isDerivedFrom(ClassHelper.Enum_Type)) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/classgen/AnnotationVisitor.java`
#### Snippet
```java
        } else if (ClassHelper.isPrimitiveType(attrType)) {
        } else if (ClassHelper.isStringType(attrType)) {
        } else if (ClassHelper.isClassType(attrType)) {
        } else if (attrType.isDerivedFrom(ClassHelper.Enum_Type)) {
        } else if (isValidAnnotationClass(attrType)) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/classgen/AnnotationVisitor.java`
#### Snippet
```java
        } else if (ClassHelper.isStringType(attrType)) {
        } else if (ClassHelper.isClassType(attrType)) {
        } else if (attrType.isDerivedFrom(ClassHelper.Enum_Type)) {
        } else if (isValidAnnotationClass(attrType)) {
        } else {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/classgen/AnnotationVisitor.java`
#### Snippet
```java
        } else if (ClassHelper.isClassType(attrType)) {
        } else if (attrType.isDerivedFrom(ClassHelper.Enum_Type)) {
        } else if (isValidAnnotationClass(attrType)) {
        } else {
            addError("Unexpected return type " + attrType.getName(), node);
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/classgen/asm/OperandStack.java`
#### Snippet
```java
            }
            box();
        } else if (primTarget) {
            // top is not primitive so unbox
            // leave that BH#doCast later
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/classgen/asm/OptimizingStatementWriter.java`
#### Snippet
```java
                            resultType = BigDecimal_TYPE;
                            opt.chainShouldOptimize(true);
                        } else if (isBigDecCategory(leftType) && isBigDecCategory(rightType)) {
                            // no optimization for BigDecimal yet
                            //resultType = BigDecimal_TYPE;
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/classgen/asm/OptimizingStatementWriter.java`
#### Snippet
```java
                            resultType = long_TYPE;
                            opt.chainShouldOptimize(true);
                        } else if (isBigDecCategory(leftType) && isBigDecCategory(rightType)) {
                            // no optimization for BigDecimal yet
                            //resultType = BigDecimal_TYPE;
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/classgen/asm/WriterController.java`
#### Snippet
```java
        Map<String,Boolean> optOptions = config.getOptimizationOptions();
        boolean invokedynamic = true;
        if (optOptions.isEmpty()) {
            // IGNORE
        } else if (Boolean.FALSE.equals(optOptions.get("all"))) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/classgen/asm/InvocationWriter.java`
#### Snippet
```java
        if (opcode == INVOKESPECIAL) { // GROOVY-8693, GROOVY-9909
            if (!declaringClass.isInterface() || receiverType.implementsInterface(declaringClass)) ownerClass = receiverType;
        } else if (opcode == INVOKEVIRTUAL && isObjectType(declaringClass)) {
            // avoid using a narrowed type if the method is defined on Object, because it can interfere
            // with delegate type inference in static compilation mode and trigger a ClassCastException
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/classgen/asm/sc/StaticTypesUnaryExpressionHelper.java`
#### Snippet
```java
        expression.getExpression().visit(controller.getAcg());
        ClassNode top = controller.getOperandStack().getTopOperand();
        if (isPrimitiveInt(top) || isPrimitiveLong(top) || isPrimitiveShort(top)|| isPrimitiveFloat(top)
                || isPrimitiveDouble(top) || isPrimitiveByte(top) || isPrimitiveChar(top)) {
            // only visit the sub-expression
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/classgen/AsmClassGenerator.java`
#### Snippet
```java
            if (c == '/') {
                ret.append('$');
            } else if (c == ';') {
                //append nothing -> delete ';'
            } else {
```

### EmptyStatementBody
`else` statement has empty body
in `src/main/java/org/codehaus/groovy/transform/NamedVariantASTTransformation.java`
#### Snippet
```java
            type = fromParam.getType();
            namedParam.addMember("type", classX(type));
        } else {
            // TODO: Check attribute type is assignable to declared param type?
        }
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/transform/sc/transformers/BooleanExpressionTransformer.java`
#### Snippet
```java
         */
        private static boolean replaceAsBooleanWithCompareToNull(final ClassNode type, final ClassLoader dgmProvider) {
            if (type.getMethod("asBoolean", Parameter.EMPTY_ARRAY) != null) {
                // GROOVY-10711
            } else if (Modifier.isFinal(type.getModifiers()) || isEffectivelyFinal(type)) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
                && isTypeSource(expr, enclosingExpression.getRightExpression())) {
            targetType = getDeclaredOrInferredType(enclosingExpression.getLeftExpression());
        } else if (enclosingMethodCall != null
                && InvocationWriter.makeArgumentList(enclosingMethodCall.getArguments())
                        .getExpressions().stream().anyMatch(arg -> isTypeSource(expr, arg))) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
        if (targetType.isArray() && expressionType.isArray()) {
            return checkCast(targetType.getComponentType(), varX("foo", expressionType.getComponentType()));
        } else if (isPrimitiveChar(targetType) && isStringType(expressionType)
                && source instanceof ConstantExpression && source.getText().length() == 1) {
            // ex: (char) 'c'
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
                && source instanceof ConstantExpression && source.getText().length() == 1) {
            // ex: (char) 'c'
        } else if (isWrapperCharacter(targetType) && (isStringType(expressionType) || sourceIsNull)
                && (sourceIsNull || source instanceof ConstantExpression && source.getText().length() == 1)) {
            // ex : (Character) 'c'
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
                && (sourceIsNull || source instanceof ConstantExpression && source.getText().length() == 1)) {
            // ex : (Character) 'c'
        } else if (isNumberCategory(getWrapper(targetType)) && (isNumberCategory(getWrapper(expressionType)) || isPrimitiveChar(expressionType))) {
            // ex: short s = (short) 0
        } else if (sourceIsNull && !isPrimitiveType(targetType)) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
        } else if (isNumberCategory(getWrapper(targetType)) && (isNumberCategory(getWrapper(expressionType)) || isPrimitiveChar(expressionType))) {
            // ex: short s = (short) 0
        } else if (sourceIsNull && !isPrimitiveType(targetType)) {
            // ex: (Date)null
        } else if (isPrimitiveChar(targetType) && isPrimitiveType(expressionType) && isNumberType(expressionType)) {
```

### EmptyStatementBody
`if` statement has empty body
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
        } else if (sourceIsNull && !isPrimitiveType(targetType)) {
            // ex: (Date)null
        } else if (isPrimitiveChar(targetType) && isPrimitiveType(expressionType) && isNumberType(expressionType)) {
            // char c = (char) ...
        } else if (sourceIsNull && isPrimitiveType(targetType) && !isPrimitiveBoolean(targetType)) {
```

### EmptyStatementBody
`while` statement has empty body
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/GroovyFilter.java`
#### Snippet
```java

            if (offset > -1 && segment.array[offset] == '{') {
                while (offset > -1 &&
                        !Character.isWhitespace(segment.array[offset--])) {
                }
```

### EmptyStatementBody
`if` statement has empty body
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/FindReplaceUtility.java`
#### Snippet
```java
            findReplaceCount = 0;

            if (FIND_REPLACE_DIALOG.isVisible() &&
                    FIND_REPLACE_DIALOG.getTitle().equals(FIND_ACTION_COMMAND)) {
            }
```

### EmptyStatementBody
`while` statement has empty body
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
                // while condition
                int groupNum = 0;
                while ((offset = matcher.start(++groupNum)) == -1) {
                }

```

### EmptyStatementBody
`while` statement has empty body
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/util/LifecycleImplementationLoader.java`
#### Snippet
```java
            r = new BufferedReader(new InputStreamReader(in, "utf-8"));
            int lc = 1;
            while ((lc = parseLine(service, u, r, lc, names)) >= 0) ;
        } catch (IOException x) {
            fail(service, "Error reading configuration file", x);
```

### EmptyStatementBody
`if` statement has empty body
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/transform/GinqASTTransformation.java`
#### Snippet
```java

            Expression resultExpression = transformGinqCode(sourceUnit, ginqConfigurationMapExpression, origCode);
            if (DEFAULT_RESULT_TYPE.equals(targetType)) { // same as `GQ {...}`
                // DO NOTHING
            } else if (LIST_TYPE.equals(targetType)) { // same as `GQL {...}`
```

### EmptyStatementBody
`if` statement has empty body
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonFastParser.java`
#### Snippet
```java
        while (true) {
            currentChar = array[index];
            if (isNumberDigit(currentChar)) {
                //noop
            } else if (currentChar <= 32) { //white
```

### EmptyStatementBody
`if` statement has empty body
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserLax.java`
#### Snippet
```java
        while (true) {
            currentChar = array[index];
            if (isNumberDigit(currentChar)) {
                //noop
            } else if (currentChar <= 32) { //white
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `at`
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
    protected boolean typeCheckMethodsWithGenericsOrFail(final ClassNode receiver, final ClassNode[] arguments, final MethodNode candidateMethod, final Expression location) {
        if (!typeCheckMethodsWithGenerics(receiver, arguments, candidateMethod)) {
            ClassNode r = receiver, at[] = arguments; MethodNode m = candidateMethod;
            if (candidateMethod instanceof ExtensionMethodNode) {
                m = ((ExtensionMethodNode) candidateMethod).getExtensionMethodNode();
```

### CStyleArrayDeclaration
C-style array declaration of parameter `regexps`
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
         * @param regexps
         */
        public void removeStyle(String regexps[]) {
            removeStyle(buildRegexp(regexps));
        }
```

### CStyleArrayDeclaration
C-style array declaration of parameter `regexps`
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
         * @param style
         */
        public void putStyle(String regexps[], Style style) {
            putStyle(buildRegexp(regexps), style);
        }
```

### CStyleArrayDeclaration
C-style array declaration of local variable `signature`
in `subprojects/groovy-jmx/src/main/java/groovy/jmx/GroovyMBean.java`
#### Snippet
```java
        MBeanOperationInfo[] operationInfos = beanInfo.getOperations();
        for (MBeanOperationInfo info : operationInfos) {
            String signature[] = createSignature(info);
            // Construct a simplistic key to support overloaded operations on the MBean.
            String operationKey = createOperationKey(info.getName(), signature.length);
```

### CStyleArrayDeclaration
C-style array declaration of local variable `statements`
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java

    private void clearStatementCache() {
        Statement statements[];
        if (statementCache.isEmpty())
            return;
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (18 lines)
in `src/main/java/org/codehaus/groovy/control/SourceUnit.java`
#### Snippet
```java
        // If you find another way, please add it.
        if (getErrorCollector().hasErrors()) {
            /*
            Message last = (Message) getErrorCollector().getLastError();
            Throwable cause = null;
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/codehaus/groovy/control/SourceUnit.java`
#### Snippet
```java
    }

    /*protected boolean isEofToken(groovyjarjarantlr.Token token) {
        return token.getType() == groovyjarjarantlr.Token.EOF_TYPE;
    }*/
```

### CommentedOutCode
Commented out code (14 lines)
in `src/main/java/org/codehaus/groovy/control/CompilationFailedException.java`
#### Snippet
```java
     */

    /*public String toString() {
        StringWriter data = new StringWriter();
        PrintWriter writer = new PrintWriter(data);
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/codehaus/groovy/runtime/MetaClassHelper.java`
#### Snippet
```java
            baseClass = obj.getClass();
        }
        /*if (GString.class.isAssignableFrom(baseClass)) {
              baseClass = GString.class;
          }*/
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/codehaus/groovy/runtime/ProxyGeneratorAdapter.java`
#### Snippet
```java
    protected MethodVisitor makeDelegateToClosureCall(final String name, final String desc, final String signature, final String[] exceptions, final int accessFlags) {
        MethodVisitor mv = super.visitMethod(accessFlags, name, desc, signature, exceptions);
//        TraceMethodVisitor tmv = new TraceMethodVisitor(mv);
//        mv = tmv;
        mv.visitCode();
```

### CommentedOutCode
Commented out code (8 lines)
in `src/main/java/org/codehaus/groovy/classgen/asm/BinaryIntExpressionHelper.java`
#### Snippet
```java
    };

/*
    public static final int LEFT_SHIFT_EQUAL            = 285;   // <<=
    public static final int RIGHT_SHIFT_EQUAL           = 286;   // >>=
```

### CommentedOutCode
Commented out code (24 lines)
in `src/main/java/org/codehaus/groovy/classgen/asm/sc/StaticTypesCallSiteWriter.java`
#### Snippet
```java
    }

    /*private boolean getField(final PropertyExpression expression, final Expression receiver, ClassNode receiverType, final String name) {
        boolean safe = expression.isSafe();
        boolean implicitThis = expression.isImplicitThis();
```

### CommentedOutCode
Commented out code (6 lines)
in `src/main/java/org/codehaus/groovy/vmplugin/v8/Selector.java`
#### Snippet
```java
        public void doCallSiteTargetSet() {
            if (LOG_ENABLED) LOG.info("call site stays uncached");
            /*
            if (!cache) {
                if (LOG_ENABLED) LOG.info("call site stays uncached");
```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/org/codehaus/groovy/transform/BaseScriptASTTransformation.java`
#### Snippet
```java

    private void changeBaseScriptTypeFromClass(final ClassNode parent, final AnnotationNode node) {
//        Expression value = node.getMember("value");
//        if (!(value instanceof ClassExpression)) {
//            addError("Annotation " + MY_TYPE_NAME + " member 'value' should be a class literal.", value);
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
    }

//    public static Boolean negate(Boolean left) {
//        return Boolean.valueOf(!left.booleanValue());
//    }
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/codehaus/groovy/transform/stc/TypeCheckingContext.java`
#### Snippet
```java
    }

    /*public TypeCheckingContext(final SourceUnit source) {
        this.source = source;
        pushErrorCollector(source.getErrorCollector());
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/codehaus/groovy/transform/trait/TraitASTTransformation.java`
#### Snippet
```java

        // Cannot add static compilation of init method because of GROOVY-7217, see example 2 of test case
        //AnnotationNode an = new AnnotationNode(TraitComposer.COMPILESTATIC_CLASSNODE);
        //initializer.addAnnotation(an);
        //cNode.addTransform(StaticCompileTransformation.class, an);
```

### CommentedOutCode
Commented out code (5 lines)
in `src/main/java/org/codehaus/groovy/reflection/ReflectionCache.java`
#### Snippet
```java
          return true;

//        SoftDoubleKeyMap.Entry val = (SoftDoubleKeyMap.Entry) assignableMap.getOrPut(klazz, aClass, null);
//        if (val.getValue() == null) {
//            val.setValue(Boolean.valueOf(klazz.isAssignableFrom(aClass)));
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/codehaus/groovy/reflection/ReflectionCache.java`
#### Snippet
```java
    static void setAssignableFrom(Class klazz, Class aClass) {
        // FIXME no implementation?
//        SoftDoubleKeyMap.Entry val = (SoftDoubleKeyMap.Entry) assignableMap.getOrPut(klazz, aClass, null);
//        if (val.getValue() == null) {
//            val.setValue(Boolean.TRUE);
```

### CommentedOutCode
Commented out code (13 lines)
in `src/main/java/groovy/lang/MetaMethod.java`
#### Snippet
```java
     */
    public final RuntimeException processDoMethodInvokeException (Exception e, Object object, Object [] argumentArray) {
//        if (e instanceof IllegalArgumentException) {
//            //TODO: test if this is OK with new MOP, should be changed!
//            // we don't want the exception being unwrapped if it is a IllegalArgumentException
```

### CommentedOutCode
Commented out code (22 lines)
in `src/main/java/groovy/lang/NumberRange.java`
#### Snippet
```java
     * @return the hashCode value
     */
//    public int canonicalHashCode() {
//        if (canonicalHashCodeCache == null) {
//            int hashCode = 1;
```

### CommentedOutCode
Commented out code (12 lines)
in `src/main/java/groovy/lang/NumberRange.java`
#### Snippet
```java
     * @return the calculated hash code
     */
//    public int fastHashCode() {
//        if (fastHashCodeCache == null) {
//            int result = 17;
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/groovy/util/ObjectGraphBuilder.java`
#### Snippet
```java
            Map context = builder.getContext();
            if(value instanceof String || value instanceof GString) {
                /*
                String classname = value.toString();
                klass = resolveClass(builder, classname, name, value, properties);
```

### CommentedOutCode
Commented out code (6 lines)
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java

//  TODO: I (ait) don't know why these strange tricks needed and comment following as it effects some Grails tests
//                if (!setter && mbp.getSetter() != null) {
//                    mp = new MetaBeanProperty(mbp.getName(), mbp.getType(), mbp.getGetter(), null);
//                }
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
            return ((PropertyExpression) expression).getObjectExpression();
        }
        /*if (expression instanceof MethodPointerExpression) {
            return ((MethodPointerExpression) expression).getExpression();
        }*/
```

### CommentedOutCode
Commented out code (3 lines)
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/SmartDocumentFilter.java`
#### Snippet
```java
            int tokenType = token.getType();

//                if (token instanceof CommonToken) {
//                    System.out.println(((CommonToken) token).toString(lexer));
//                }
```

### CommentedOutCode
Commented out code (3 lines)
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/SimpleGroovyExecutableMemberDoc.java`
#### Snippet
```java
    @Override
    public GroovyType[] thrownExceptionTypes() {/*todo*/return null;}
//    public GroovyThrowsTag[] throwsTags() {/*todo*/return null;}
//    public GroovyTypeVariable[] typeParameters() {/*todo*/return null;}
//    public GroovyParamTag[] typeParamTags() {/*todo*/return null;}
```

### CommentedOutCode
Commented out code (23 lines)
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/SimpleGroovyType.java`
#### Snippet
```java
    }

//    public GroovyAnnotationTypeDoc asAnnotationTypeDoc() {/*todo*/
//        return null;
//    }
```

### CommentedOutCode
Commented out code (2 lines)
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/SimpleGroovyDoc.java`
#### Snippet
```java
    // Methods from GroovyDoc

    //    public GroovyTag[] firstSentenceTags() {/*todo*/return null;}
    //    public GroovyTag[] inlineTags() {/*todo*/return null;}

```

### CommentedOutCode
Commented out code (2 lines)
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/SimpleGroovyDoc.java`
#### Snippet
```java
        return false;
    }
//    public GroovySourcePosition position() {/*todo*/return null;}
//    public GroovySeeTag[] seeTags() {/*todo*/return null;}

```

### CommentedOutCode
Commented out code (3 lines)
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/SimpleGroovyClassDoc.java`
#### Snippet
```java
            return null;
        }
//        if (name.equals("T") || name.equals("U") || name.equals("K") || name.equals("V") || name.equals("G")) {
//            name = "java/lang/Object";
//        }
```

### CommentedOutCode
Commented out code (6 lines)
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/SimpleGroovyClassDoc.java`
#### Snippet
```java

    // methods from GroovyType (todo: remove this horrible copy of SimpleGroovyType.java)
//    public GroovyAnnotationTypeDoc asAnnotationTypeDoc() {/*todo*/return null;}
//    public GroovyClassDoc asClassDoc() {/*todo*/ return null; }
//    public GroovyParameterizedType asParameterizedType() {/*todo*/return null;}
```

### CommentedOutCode
Commented out code (6 lines)
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java
                        break;
                    //There is no requirement to escape solidus so we will not.
//                        case '/':
//                            _buffer[_location] = '\\';
//                            _location ++;
```

### CommentedOutCode
Commented out code (2 lines)
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/TemplateServlet.java`
#### Snippet
```java
            log("Making template \"" + name + "\"...");
        }
        // String made = template.make(binding.getVariables()).toString();
        // log(" = " + made);
        long makeMillis = System.currentTimeMillis();
```

## RuleId[id=CloneableImplementsClone]
### CloneableImplementsClone
`FastArray` is 'Cloneable' but does not define 'clone()' method
in `src/main/java/org/codehaus/groovy/util/FastArray.java`
#### Snippet
```java
import java.util.List;

public class FastArray implements Cloneable, Serializable {
    private static final long serialVersionUID = -9143440116071577249L;
    private Object[] data;
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `src/test/groovy/ThisAndSuperTest.groovy`
#### Snippet
```java
            new C().test()
        '''
        assert err =~ /No signature of method: java\.lang\.Object\.whatever\(\) is applicable for argument types: \(\) values: \[\]/
    }

```

### RegExpRedundantEscape
Redundant character escape `\]` in RegExp
in `src/test/groovy/ThisAndSuperTest.groovy`
#### Snippet
```java
            new Outer.Inner(new Outer()).test()
        '''
        assert err =~ /No signature of method: java\.lang\.Object\.whatever\(\) is applicable for argument types: \(\) values: \[\]/
    }

```

### RegExpRedundantEscape
Redundant character escape `\\(` in RegExp
in `src/main/java/groovy/grape/GrabAnnotationTransformation.java`
#### Snippet
```java
    private static final Collection<String> GRAB_ALL = DefaultGroovyMethods.plus(GRAB_REQUIRED, GRAB_OPTIONAL);
    private static final Pattern IVY_PATTERN = Pattern.compile("([a-zA-Z0-9-/._+=]+)#([a-zA-Z0-9-/._+=]+)(;([a-zA-Z0-9-/.\\(\\)\\[\\]\\{\\}_+=,:@][a-zA-Z0-9-/.\\(\\)\\]\\{\\}_+=,:@]*))?(\\[([a-zA-Z0-9-/._+=,]*)\\])?");
    private static final Pattern ATTRIBUTES_PATTERN = Pattern.compile("(.*;|^)([a-zA-Z0-9]+)=([a-zA-Z0-9.*\\[\\]\\-\\(\\),]*)$");

    private static final String AUTO_DOWNLOAD_SETTING = Grape.AUTO_DOWNLOAD_SETTING;
```

### RegExpRedundantEscape
Redundant character escape `\\)` in RegExp
in `src/main/java/groovy/grape/GrabAnnotationTransformation.java`
#### Snippet
```java
    private static final Collection<String> GRAB_ALL = DefaultGroovyMethods.plus(GRAB_REQUIRED, GRAB_OPTIONAL);
    private static final Pattern IVY_PATTERN = Pattern.compile("([a-zA-Z0-9-/._+=]+)#([a-zA-Z0-9-/._+=]+)(;([a-zA-Z0-9-/.\\(\\)\\[\\]\\{\\}_+=,:@][a-zA-Z0-9-/.\\(\\)\\]\\{\\}_+=,:@]*))?(\\[([a-zA-Z0-9-/._+=,]*)\\])?");
    private static final Pattern ATTRIBUTES_PATTERN = Pattern.compile("(.*;|^)([a-zA-Z0-9]+)=([a-zA-Z0-9.*\\[\\]\\-\\(\\),]*)$");

    private static final String AUTO_DOWNLOAD_SETTING = Grape.AUTO_DOWNLOAD_SETTING;
```

### RegExpRedundantEscape
Redundant character escape `\\(` in RegExp
in `src/main/java/groovy/grape/GrabAnnotationTransformation.java`
#### Snippet
```java
    private static final List<String> GRAB_BOOLEAN = Arrays.asList("transitive", "changing", "force", "initClass");
    private static final Collection<String> GRAB_ALL = DefaultGroovyMethods.plus(GRAB_REQUIRED, GRAB_OPTIONAL);
    private static final Pattern IVY_PATTERN = Pattern.compile("([a-zA-Z0-9-/._+=]+)#([a-zA-Z0-9-/._+=]+)(;([a-zA-Z0-9-/.\\(\\)\\[\\]\\{\\}_+=,:@][a-zA-Z0-9-/.\\(\\)\\]\\{\\}_+=,:@]*))?(\\[([a-zA-Z0-9-/._+=,]*)\\])?");
    private static final Pattern ATTRIBUTES_PATTERN = Pattern.compile("(.*;|^)([a-zA-Z0-9]+)=([a-zA-Z0-9.*\\[\\]\\-\\(\\),]*)$");

```

### RegExpRedundantEscape
Redundant character escape `\\)` in RegExp
in `src/main/java/groovy/grape/GrabAnnotationTransformation.java`
#### Snippet
```java
    private static final List<String> GRAB_BOOLEAN = Arrays.asList("transitive", "changing", "force", "initClass");
    private static final Collection<String> GRAB_ALL = DefaultGroovyMethods.plus(GRAB_REQUIRED, GRAB_OPTIONAL);
    private static final Pattern IVY_PATTERN = Pattern.compile("([a-zA-Z0-9-/._+=]+)#([a-zA-Z0-9-/._+=]+)(;([a-zA-Z0-9-/.\\(\\)\\[\\]\\{\\}_+=,:@][a-zA-Z0-9-/.\\(\\)\\]\\{\\}_+=,:@]*))?(\\[([a-zA-Z0-9-/._+=,]*)\\])?");
    private static final Pattern ATTRIBUTES_PATTERN = Pattern.compile("(.*;|^)([a-zA-Z0-9]+)=([a-zA-Z0-9.*\\[\\]\\-\\(\\),]*)$");

```

### RegExpRedundantEscape
Redundant character escape `\\{` in RegExp
in `src/main/java/groovy/grape/GrabAnnotationTransformation.java`
#### Snippet
```java
    private static final List<String> GRAB_BOOLEAN = Arrays.asList("transitive", "changing", "force", "initClass");
    private static final Collection<String> GRAB_ALL = DefaultGroovyMethods.plus(GRAB_REQUIRED, GRAB_OPTIONAL);
    private static final Pattern IVY_PATTERN = Pattern.compile("([a-zA-Z0-9-/._+=]+)#([a-zA-Z0-9-/._+=]+)(;([a-zA-Z0-9-/.\\(\\)\\[\\]\\{\\}_+=,:@][a-zA-Z0-9-/.\\(\\)\\]\\{\\}_+=,:@]*))?(\\[([a-zA-Z0-9-/._+=,]*)\\])?");
    private static final Pattern ATTRIBUTES_PATTERN = Pattern.compile("(.*;|^)([a-zA-Z0-9]+)=([a-zA-Z0-9.*\\[\\]\\-\\(\\),]*)$");

```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `src/main/java/groovy/grape/GrabAnnotationTransformation.java`
#### Snippet
```java
    private static final List<String> GRAB_BOOLEAN = Arrays.asList("transitive", "changing", "force", "initClass");
    private static final Collection<String> GRAB_ALL = DefaultGroovyMethods.plus(GRAB_REQUIRED, GRAB_OPTIONAL);
    private static final Pattern IVY_PATTERN = Pattern.compile("([a-zA-Z0-9-/._+=]+)#([a-zA-Z0-9-/._+=]+)(;([a-zA-Z0-9-/.\\(\\)\\[\\]\\{\\}_+=,:@][a-zA-Z0-9-/.\\(\\)\\]\\{\\}_+=,:@]*))?(\\[([a-zA-Z0-9-/._+=,]*)\\])?");
    private static final Pattern ATTRIBUTES_PATTERN = Pattern.compile("(.*;|^)([a-zA-Z0-9]+)=([a-zA-Z0-9.*\\[\\]\\-\\(\\),]*)$");

```

### RegExpRedundantEscape
Redundant character escape `\\(` in RegExp
in `src/main/java/groovy/grape/GrabAnnotationTransformation.java`
#### Snippet
```java
    private static final List<String> GRAB_BOOLEAN = Arrays.asList("transitive", "changing", "force", "initClass");
    private static final Collection<String> GRAB_ALL = DefaultGroovyMethods.plus(GRAB_REQUIRED, GRAB_OPTIONAL);
    private static final Pattern IVY_PATTERN = Pattern.compile("([a-zA-Z0-9-/._+=]+)#([a-zA-Z0-9-/._+=]+)(;([a-zA-Z0-9-/.\\(\\)\\[\\]\\{\\}_+=,:@][a-zA-Z0-9-/.\\(\\)\\]\\{\\}_+=,:@]*))?(\\[([a-zA-Z0-9-/._+=,]*)\\])?");
    private static final Pattern ATTRIBUTES_PATTERN = Pattern.compile("(.*;|^)([a-zA-Z0-9]+)=([a-zA-Z0-9.*\\[\\]\\-\\(\\),]*)$");

```

### RegExpRedundantEscape
Redundant character escape `\\)` in RegExp
in `src/main/java/groovy/grape/GrabAnnotationTransformation.java`
#### Snippet
```java
    private static final List<String> GRAB_BOOLEAN = Arrays.asList("transitive", "changing", "force", "initClass");
    private static final Collection<String> GRAB_ALL = DefaultGroovyMethods.plus(GRAB_REQUIRED, GRAB_OPTIONAL);
    private static final Pattern IVY_PATTERN = Pattern.compile("([a-zA-Z0-9-/._+=]+)#([a-zA-Z0-9-/._+=]+)(;([a-zA-Z0-9-/.\\(\\)\\[\\]\\{\\}_+=,:@][a-zA-Z0-9-/.\\(\\)\\]\\{\\}_+=,:@]*))?(\\[([a-zA-Z0-9-/._+=,]*)\\])?");
    private static final Pattern ATTRIBUTES_PATTERN = Pattern.compile("(.*;|^)([a-zA-Z0-9]+)=([a-zA-Z0-9.*\\[\\]\\-\\(\\),]*)$");

```

### RegExpRedundantEscape
Redundant character escape `\\{` in RegExp
in `src/main/java/groovy/grape/GrabAnnotationTransformation.java`
#### Snippet
```java
    private static final List<String> GRAB_BOOLEAN = Arrays.asList("transitive", "changing", "force", "initClass");
    private static final Collection<String> GRAB_ALL = DefaultGroovyMethods.plus(GRAB_REQUIRED, GRAB_OPTIONAL);
    private static final Pattern IVY_PATTERN = Pattern.compile("([a-zA-Z0-9-/._+=]+)#([a-zA-Z0-9-/._+=]+)(;([a-zA-Z0-9-/.\\(\\)\\[\\]\\{\\}_+=,:@][a-zA-Z0-9-/.\\(\\)\\]\\{\\}_+=,:@]*))?(\\[([a-zA-Z0-9-/._+=,]*)\\])?");
    private static final Pattern ATTRIBUTES_PATTERN = Pattern.compile("(.*;|^)([a-zA-Z0-9]+)=([a-zA-Z0-9.*\\[\\]\\-\\(\\),]*)$");

```

### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `src/main/java/groovy/grape/GrabAnnotationTransformation.java`
#### Snippet
```java
    private static final List<String> GRAB_BOOLEAN = Arrays.asList("transitive", "changing", "force", "initClass");
    private static final Collection<String> GRAB_ALL = DefaultGroovyMethods.plus(GRAB_REQUIRED, GRAB_OPTIONAL);
    private static final Pattern IVY_PATTERN = Pattern.compile("([a-zA-Z0-9-/._+=]+)#([a-zA-Z0-9-/._+=]+)(;([a-zA-Z0-9-/.\\(\\)\\[\\]\\{\\}_+=,:@][a-zA-Z0-9-/.\\(\\)\\]\\{\\}_+=,:@]*))?(\\[([a-zA-Z0-9-/._+=,]*)\\])?");
    private static final Pattern ATTRIBUTES_PATTERN = Pattern.compile("(.*;|^)([a-zA-Z0-9]+)=([a-zA-Z0-9.*\\[\\]\\-\\(\\),]*)$");

```

### RegExpRedundantEscape
Redundant character escape `\\]` in RegExp
in `src/main/java/groovy/grape/GrabAnnotationTransformation.java`
#### Snippet
```java
    private static final List<String> GRAB_BOOLEAN = Arrays.asList("transitive", "changing", "force", "initClass");
    private static final Collection<String> GRAB_ALL = DefaultGroovyMethods.plus(GRAB_REQUIRED, GRAB_OPTIONAL);
    private static final Pattern IVY_PATTERN = Pattern.compile("([a-zA-Z0-9-/._+=]+)#([a-zA-Z0-9-/._+=]+)(;([a-zA-Z0-9-/.\\(\\)\\[\\]\\{\\}_+=,:@][a-zA-Z0-9-/.\\(\\)\\]\\{\\}_+=,:@]*))?(\\[([a-zA-Z0-9-/._+=,]*)\\])?");
    private static final Pattern ATTRIBUTES_PATTERN = Pattern.compile("(.*;|^)([a-zA-Z0-9]+)=([a-zA-Z0-9.*\\[\\]\\-\\(\\),]*)$");

```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `src/main/groovy/groovy/grape/GrapeIvy.groovy`
#### Snippet
```java
            if (v instanceof CharSequence) {
                if (k.toString().contains('v')) { // revision, version, rev
                    if (!(v ==~ '[^\\/:"<>|]*')) {
                        throw new RuntimeException("Grab: invalid value of '$v' for $k: should not contain any of / \\ : \" < > |")
                    }
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovy.java`
#### Snippet
```java
            String name = PREFIX;
            if (getLocation().getFileName().length() > 0)
                name += getLocation().getFileName().replaceAll("[^\\w_\\.]", "_").replaceAll("[\\.]", "_dot_");
            else
                name += SUFFIX;
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovy.java`
#### Snippet
```java
            String name = PREFIX;
            if (getLocation().getFileName().length() > 0)
                name += getLocation().getFileName().replaceAll("[^\\w_\\.]", "_").replaceAll("[\\.]", "_dot_");
            else
                name += SUFFIX;
```

### RegExpRedundantEscape
Redundant character escape `\\$` in RegExp
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/SimpleGroovyClassDoc.java`
#### Snippet
```java
    public static final Pattern CODE_REGEX    = Pattern.compile("(?m)[{]@(code)\\s+([^}]*)}");

    public static final Pattern REF_LABEL_REGEX = Pattern.compile("([\\w.#\\$]*(\\(.*\\))?)(\\s(.*))?");
    public static final Pattern NAME_ARGS_REGEX = Pattern.compile("([^(]+)\\(([^)]*)\\)");
    public static final Pattern SPLIT_ARGS_REGEX = Pattern.compile(",\\s*");
```

### RegExpRedundantEscape
Redundant character escape `\\/` in RegExp
in `subprojects/groovy-json/src/main/java/groovy/json/JsonTokenType.java`
#### Snippet
```java
     */
    STRING          ( "a string",                           new Closure(null) {
        private Pattern replacePattern = Pattern.compile("(?:\\\\[\"\\\\bfnrt\\/]|\\\\u[0-9a-fA-F]{4})");
        private Pattern validatePattern = Pattern.compile("\"[^\"\\\\]*\"");
        public boolean doCall(String it) {
```

### RegExpRedundantEscape
Redundant character escape `\}` in RegExp
in `subprojects/groovy-test/src/main/groovy/groovy/test/JavadocAssertionTestBuilder.groovy`
#### Snippet
```java
            assertion = assertion.replaceAll("(?i)&$key;", value)
        }
        assertion = assertion.replaceAll(/(?i)\{@code ([^}]*)\}/, '$1')
        return assertion
    }
```

### RegExpRedundantEscape
Redundant character escape `\@` in RegExp
in `subprojects/performance/src/files/pleac03.groovy`
#### Snippet
```java
        def m = (mail =~ /(?m)^Date:\s+(.*)/)
        firstDate = parseDate(m[0][1])
        firstSender = (mail =~ /(?m)^From.*\@([^\s>]*)/)[0][1]
        out('Sender Recipient Time Delta'.split(' '))
    }
```

### RegExpRedundantEscape
Redundant character escape `\@` in RegExp
in `subprojects/performance/src/files/pleac05_06.groovy`
#### Snippet
```java
    m = (line =~ /^From:?\s(.*)/)
    if (m) {
        addr = m[0][1] =~ /([^<>(),;\s]+\@[^<>(),;\s]+)/
        x = addr[0][1]
        if (seen.containsKey(x)) seen[x] += 1 else seen[x] = 1
```

### RegExpRedundantEscape
Redundant character escape `\#` in RegExp
in `subprojects/performance/src/files/pleac05_06.groovy`
#### Snippet
```java

termcap = ':co#80:li#24:'
m = (termcap =~ /:co\#(\d+):/)
assert m.count == 1
assert m[0][1] == '80'
```

## RuleId[id=Deprecation]
### Deprecation
'box(org.objectweb.asm.MethodVisitor, java.lang.Class)' is deprecated
in `src/main/java/org/codehaus/groovy/tools/DgmConverter.java`
#### Snippet
```java
        }
        mv.visitMethodInsn(INVOKESTATIC, BytecodeHelper.getClassInternalName(method.getDeclaringClass().getTheClass()), method.getName(), methodDescriptor, false);
        BytecodeHelper.box(mv, returnType);
        if (method.getReturnType() == void.class) {
            mv.visitInsn(ACONST_NULL);
```

### Deprecation
'box(org.objectweb.asm.MethodVisitor, java.lang.Class)' is deprecated
in `src/main/java/org/codehaus/groovy/tools/DgmConverter.java`
#### Snippet
```java
        loadParameters(method, 2, mv);
        mv.visitMethodInsn(INVOKESTATIC, BytecodeHelper.getClassInternalName(method.getDeclaringClass().getTheClass()), method.getName(), methodDescriptor, false);
        BytecodeHelper.box(mv, returnType);
        if (method.getReturnType() == void.class) {
            mv.visitInsn(ACONST_NULL);
```

### Deprecation
'convertToByteArray(java.lang.Object)' is deprecated
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethods.java`
#### Snippet
```java
     */
    public static Writable encodeBase64Url(Byte[] data, boolean pad) {
        return encodeBase64Url(DefaultTypeTransformation.convertToByteArray(data), pad);
    }

```

### Deprecation
'convertToByteArray(java.lang.Object)' is deprecated
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethods.java`
#### Snippet
```java
     */
    public static Writable encodeBase64(Byte[] data) {
        return encodeBase64(DefaultTypeTransformation.convertToByteArray(data), false);
    }

```

### Deprecation
'convertToByteArray(java.lang.Object)' is deprecated
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethods.java`
#### Snippet
```java
     */
    public static Writable encodeBase64(Byte[] data, final boolean chunked) {
        return encodeBase64(DefaultTypeTransformation.convertToByteArray(data), chunked);
    }

```

### Deprecation
'convertToByteArray(java.lang.Object)' is deprecated
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethods.java`
#### Snippet
```java
     */
    public static Writable encodeHex(final Byte[] data) {
        return encodeHex(DefaultTypeTransformation.convertToByteArray(data));
    }

```

### Deprecation
'getCharFromSizeOneString(java.lang.Object)' is deprecated
in `src/main/java/org/codehaus/groovy/runtime/dgmimpl/arrays/FloatArrayPutAtMetaMethod.java`
#### Snippet
```java
        if (!(newValue instanceof Float)) {
            if (newValue instanceof Character || newValue instanceof String || newValue instanceof GString) {
                Character ch = DefaultTypeTransformation.getCharFromSizeOneString(newValue);
                objects[index] = (Float) DefaultTypeTransformation.castToType(ch, Float.class);
            } else {
```

### Deprecation
'getCharFromSizeOneString(java.lang.Object)' is deprecated
in `src/main/java/org/codehaus/groovy/runtime/dgmimpl/arrays/CharacterArrayPutAtMetaMethod.java`
#### Snippet
```java
        final char[] objects = (char[]) object;
        final int index = normaliseIndex((Integer) args[0], objects.length);
        objects[index] = DefaultTypeTransformation.getCharFromSizeOneString(args[1]);
        return null;
    }
```

### Deprecation
'getCharFromSizeOneString(java.lang.Object)' is deprecated
in `src/main/java/org/codehaus/groovy/runtime/dgmimpl/arrays/DoubleArrayPutAtMetaMethod.java`
#### Snippet
```java
        if (!(newValue instanceof Double)) {
            if (newValue instanceof Character || newValue instanceof String || newValue instanceof GString) {
                Character ch = DefaultTypeTransformation.getCharFromSizeOneString(newValue);
                objects[index] = (Double) DefaultTypeTransformation.castToType(ch, Double.class);
            } else {
```

### Deprecation
'getCharFromSizeOneString(java.lang.Object)' is deprecated
in `src/main/java/org/codehaus/groovy/runtime/dgmimpl/arrays/ShortArrayPutAtMetaMethod.java`
#### Snippet
```java
        if (!(newValue instanceof Short)) {
            if (newValue instanceof Character || newValue instanceof String || newValue instanceof GString) {
                Character ch = DefaultTypeTransformation.getCharFromSizeOneString(newValue);
                objects[index] = (Short) DefaultTypeTransformation.castToType(ch, Short.class);
            } else {
```

### Deprecation
'getCharFromSizeOneString(java.lang.Object)' is deprecated
in `src/main/java/org/codehaus/groovy/runtime/dgmimpl/arrays/LongArrayPutAtMetaMethod.java`
#### Snippet
```java
        if (!(newValue instanceof Long)) {
            if (newValue instanceof Character || newValue instanceof String || newValue instanceof GString) {
                Character ch = DefaultTypeTransformation.getCharFromSizeOneString(newValue);
                objects[index] = (Long) DefaultTypeTransformation.castToType(ch, Long.class);
            } else {
```

### Deprecation
'getCharFromSizeOneString(java.lang.Object)' is deprecated
in `src/main/java/org/codehaus/groovy/runtime/dgmimpl/arrays/IntegerArrayPutAtMetaMethod.java`
#### Snippet
```java
        if (!(newValue instanceof Integer)) {
            if (newValue instanceof Character || newValue instanceof String || newValue instanceof GString) {
                Character ch = DefaultTypeTransformation.getCharFromSizeOneString(newValue);
                objects[index] = (Integer) DefaultTypeTransformation.castToType(ch, Integer.class);
            } else {
```

### Deprecation
'getCharFromSizeOneString(java.lang.Object)' is deprecated
in `src/main/java/org/codehaus/groovy/runtime/dgmimpl/arrays/ObjectArrayPutAtMetaMethod.java`
#### Snippet
```java
            }
        } else if (Character.class.isAssignableFrom(arrayComponentClass)) {
            adjustedNewVal = DefaultTypeTransformation.getCharFromSizeOneString(newValue);
        } else if (String.class.equals(arrayComponentClass) && newValue instanceof GString) {
            adjustedNewVal = DefaultTypeTransformation.castToType(newValue, arrayComponentClass);
```

### Deprecation
'getCharFromSizeOneString(java.lang.Object)' is deprecated
in `src/main/java/org/codehaus/groovy/runtime/dgmimpl/arrays/ObjectArrayPutAtMetaMethod.java`
#### Snippet
```java
        } else if (Number.class.isAssignableFrom(arrayComponentClass)) {
            if (newValue instanceof Character || newValue instanceof String || newValue instanceof GString) {
                Character ch = DefaultTypeTransformation.getCharFromSizeOneString(newValue);
                adjustedNewVal = DefaultTypeTransformation.castToType(ch, arrayComponentClass);
            }
```

### Deprecation
Overrides deprecated method in 'org.codehaus.groovy.control.CompilerConfiguration'
in `src/main/java/org/codehaus/groovy/control/CompilerConfiguration.java`
#### Snippet
```java

        @Override
        public void setOutput(final PrintWriter output) {
            throw new UnsupportedOperationException();
        }
```

### Deprecation
'box(org.objectweb.asm.MethodVisitor, java.lang.Class)' is deprecated
in `src/main/java/org/codehaus/groovy/runtime/callsite/CallSiteGenerator.java`
#### Snippet
```java

        // produce result
        BytecodeHelper.box(mv, cachedMethod.getReturnType());
        if (cachedMethod.getReturnType() == void.class) {
            mv.visitInsn(Opcodes.ACONST_NULL);
```

### Deprecation
'chooseMostGeneralMethodWith1NullParam(org.codehaus.groovy.util.FastArray)' is deprecated
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ClosureMetaClass.java`
#### Snippet
```java
                return MetaClassHelper.chooseEmptyMethodParams(methods);
            } else if (arguments.length == 1 && arguments[0] == null) {
                return MetaClassHelper.chooseMostGeneralMethodWith1NullParam(methods);
            } else {
                List matchingMethods = new ArrayList();
```

### Deprecation
Overrides deprecated method in 'org.codehaus.groovy.classgen.asm.WriterController'
in `src/main/java/org/codehaus/groovy/classgen/asm/DelegatingController.java`
#### Snippet
```java
    @Override
    @Deprecated
    public ClassVisitor getCv() {
        return delegationController.getCv();
    }
```

### Deprecation
'getOutput()' is deprecated
in `src/main/java/org/codehaus/groovy/classgen/asm/util/LoggableTextifier.java`
#### Snippet
```java
        super(CompilerConfiguration.ASM_API_VERSION);
        this.compilerConfiguration = compilerConfiguration;
        this.out = Optional.ofNullable(compilerConfiguration.getOutput()).orElseGet(() -> new PrintWriter(System.out, true));
    }

```

### Deprecation
Overrides deprecated method in 'org.objectweb.asm.util.Printer'
in `src/main/java/org/codehaus/groovy/classgen/asm/util/LoggableTextifier.java`
#### Snippet
```java
    @Override
    @Deprecated
    public void visitMethodInsn(int opcode, String owner, String name, String desc) {
        super.visitMethodInsn(opcode, owner, name, desc);
        log();
```

### Deprecation
'isAccessible()' is deprecated
in `src/main/java/org/codehaus/groovy/vmplugin/v8/Java8.java`
#### Snippet
```java

    private Object getInvokeSpecialHandleFallback(final Method method, final Object receiver) {
        if (!method.isAccessible()) {
            doPrivilegedInternal(() -> {
                ReflectionUtils.trySetAccessible(method);
```

### Deprecation
'isAccessible()' is deprecated
in `src/main/java/org/codehaus/groovy/vmplugin/v8/Java8.java`
#### Snippet
```java
            }
            try {
                if (!lookup.isAccessible()) {
                    final Constructor<MethodHandles.Lookup> finalReference = lookup;
                    doPrivilegedInternal(() -> {
```

### Deprecation
'isAccessible()' is deprecated
in `src/main/java/org/codehaus/groovy/vmplugin/v9/Java9.java`
#### Snippet
```java
                try {
                    lookup = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                    if (!lookup.isAccessible()) {
                        ReflectionUtils.trySetAccessible(lookup);
                    }
```

### Deprecation
'org.codehaus.groovy.reflection.GroovyClassValuePreJava7' is deprecated
in `src/main/java/org/codehaus/groovy/reflection/GroovyClassValueFactory.java`
#### Snippet
```java
		return (USE_CLASSVALUE)
                ? new GroovyClassValueJava7<>(computeValue)
                : new GroovyClassValuePreJava7<>(computeValue);
	}
}
```

### Deprecation
'isAccessible()' is deprecated
in `src/main/java/org/codehaus/groovy/reflection/AccessPermissionChecker.java`
#### Snippet
```java
    static void checkAccessPermission(Method method) {
        try {
            checkAccessPermission(method.getDeclaringClass(), method.getModifiers(), method.isAccessible());
        } catch (java.security.AccessControlException e) {
            throw createCacheAccessControlExceptionOf(method, e);
```

### Deprecation
'isAccessible()' is deprecated
in `src/main/java/org/codehaus/groovy/reflection/AccessPermissionChecker.java`
#### Snippet
```java
    static void checkAccessPermission(Field field) {
        try {
            checkAccessPermission(field.getDeclaringClass(), field.getModifiers(), field.isAccessible());
        } catch (java.security.AccessControlException e) {
            throw createCacheAccessControlExceptionOf(field, e);
```

### Deprecation
'isAccessible()' is deprecated
in `src/main/java/org/codehaus/groovy/reflection/AccessPermissionChecker.java`
#### Snippet
```java
    static void checkAccessPermission(Constructor constructor) {
        try {
            checkAccessPermission(constructor.getDeclaringClass(), constructor.getModifiers(), constructor.isAccessible());
        } catch (java.security.AccessControlException e) {
            throw createCacheAccessControlExceptionOf(constructor, e);
```

### Deprecation
'convertToPrimitiveArray(java.lang.Object, java.lang.Class)' is deprecated
in `src/main/java/org/codehaus/groovy/reflection/stdclasses/ArrayCachedClass.java`
#### Snippet
```java
        Class paramComponent = getTheClass().getComponentType();
        if (paramComponent.isPrimitive()) {
            argument = DefaultTypeTransformation.convertToPrimitiveArray(argument, paramComponent);
        } else if (paramComponent == String.class && argument instanceof GString[]) {
            GString[] strings = (GString[]) argument;
```

### Deprecation
'toList(int\[\])' is deprecated
in `subprojects/groovy-sql/src/main/java/groovy/sql/BatchingStatementWrapper.java`
#### Snippet
```java
            log.warning("Problem executing batch - expected result length of " + batchCount + " but got " + lastResult.length);
        } else if (foundError) {
            log.warning("Problem executing batch - at least one result failed in: " + DefaultGroovyMethods.toList(lastResult));
        } else {
            log.fine("Successfully executed batch with " + lastResult.length + " command(s)");
```

### Deprecation
Overrides deprecated method in 'java.lang.Object'
in `subprojects/performance/src/files/pleac11_15.groovy`
#### Snippet
```java

class MyClass4{
    void finalize() {
        println "Object [internal id=${hashCode()}] is dying at ${new Date()}"
    }
```

### Deprecation
Overrides deprecated method in 'java.lang.Object'
in `subprojects/performance/src/files/pleac11_15.groovy`
#### Snippet
```java
        personCounter += 1
    }
    void finalize() {
        personCounter -= 1
    }
```

### Deprecation
Overrides deprecated method in 'java.lang.Object'
in `subprojects/performance/src/files/pleac11_15.groovy`
#### Snippet
```java
class Person9 {
    def friend
    void finalize() {
        println "Object [internal id=${hashCode()}] is dying at ${new Date()}"
    }
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/BaseJsonParser.java`
#### Snippet
```java
    }

    protected static final boolean isNumberDigit(int c) {
        return c >= ALPHA_0 && c <= ALPHA_9;
    }
```

### FinalStaticMethod
'static' method declared `final`
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/BaseJsonParser.java`
#### Snippet
```java
    }

    protected static final boolean isDoubleQuote(int c) {
        return c == DOUBLE_QUOTE;
    }
```

### FinalStaticMethod
'static' method declared `final`
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/BaseJsonParser.java`
#### Snippet
```java
    }

    protected static final boolean isEscape(int c) {
        return c == ESCAPE;
    }
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/codehaus/groovy/control/GenericsVisitor.java`
#### Snippet
```java

    private static String plural(final String string, final int count) {
        return "" + count + " " + (count == 1 ? string : string + "s");
    }
}
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/codehaus/groovy/runtime/StringGroovyMethods.java`
#### Snippet
```java
    public static String capitalize(final CharSequence self) {
        if (self.length() == 0) return "";
        return "" + Character.toUpperCase(self.charAt(0)) + self.subSequence(1, self.length());
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/codehaus/groovy/runtime/StringGroovyMethods.java`
#### Snippet
```java
            return multiply(padding, length / padding.length() + 1).substring(0, length);
        } else {
            return "" + padding.subSequence(0, length);
        }
    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/codehaus/groovy/runtime/StringGroovyMethods.java`
#### Snippet
```java
    public static String uncapitalize(final CharSequence self) {
        if (self.length() == 0) return "";
        return "" + Character.toLowerCase(self.charAt(0)) + self.subSequence(1, self.length());
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
            return self.orElse(null);
          default:
            throw new IndexOutOfBoundsException("" + index);
        }
    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/groovy/lang/ObjectRange.java`
#### Snippet
```java
        final String toText = FormatHelper.inspect(to);
        final String fromText = FormatHelper.inspect(from);
        return reverse ? "" + toText + ".." + fromText : "" + fromText + ".." + toText;
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/groovy/lang/ObjectRange.java`
#### Snippet
```java
        final String toText = FormatHelper.inspect(to);
        final String fromText = FormatHelper.inspect(from);
        return reverse ? "" + toText + ".." + fromText : "" + fromText + ".." + toText;
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/groovy/lang/ObjectRange.java`
#### Snippet
```java
    @Override
    public String toString() {
        return reverse ? "" + to + ".." + from : "" + from + ".." + to;
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/groovy/lang/ObjectRange.java`
#### Snippet
```java
    @Override
    public String toString() {
        return reverse ? "" + to + ".." + from : "" + from + ".." + to;
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/groovy/lang/IntRange.java`
#### Snippet
```java
    public String toString() {
        if (inclusiveRight == null && inclusiveLeft == null)  {
               return reverse ? "" + to + ".." + from : "" + from + ".." + to;
        }
        return "" + from + (inclusiveLeft ? "" : "<") + ".." + (inclusiveRight ? "" : "<") + to;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/groovy/lang/IntRange.java`
#### Snippet
```java
    public String toString() {
        if (inclusiveRight == null && inclusiveLeft == null)  {
               return reverse ? "" + to + ".." + from : "" + from + ".." + to;
        }
        return "" + from + (inclusiveLeft ? "" : "<") + ".." + (inclusiveRight ? "" : "<") + to;
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/groovy/lang/IntRange.java`
#### Snippet
```java
               return reverse ? "" + to + ".." + from : "" + from + ".." + to;
        }
        return "" + from + (inclusiveLeft ? "" : "<") + ".." + (inclusiveRight ? "" : "<") + to;
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/groovy/lang/NumberRange.java`
#### Snippet
```java
        String sepLeft = inclusiveLeft ? ".." : "<..";
        String sep = inclusiveRight ? sepLeft : sepLeft + "<";
        String base = reverse ? "" + toText + sep + fromText : "" + fromText + sep + toText;
        return Integer.valueOf(1).equals(stepSize) ? base : base + ".by(" + stepSize + ")";
    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/groovy/lang/NumberRange.java`
#### Snippet
```java
        String sepLeft = inclusiveLeft ? ".." : "<..";
        String sep = inclusiveRight ? sepLeft : sepLeft + "<";
        String base = reverse ? "" + toText + sep + fromText : "" + fromText + sep + toText;
        return Integer.valueOf(1).equals(stepSize) ? base : base + ".by(" + stepSize + ")";
    }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/groovy/time/BaseDuration.java`
#### Snippet
```java
            int norm_millis = this.millis % 1000;
            int norm_seconds = this.seconds + DefaultGroovyMethods.intdiv(this.millis - norm_millis, 1000).intValue();
            CharSequence millisToPad = "" + Math.abs(norm_millis);
            buffer.add((norm_seconds == 0 ? (norm_millis < 0 ? "-0" : "0") : norm_seconds) + "." + StringGroovyMethods.padLeft(millisToPad, 3, "0") + " seconds");
        }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/groovy/util/MapEntry.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "" + key + ":" + value;
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
            }
        }
        return "" + value;
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/SimpleGroovyDoc.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "" + getClass() + "(" + name + ")";
    }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `subprojects/groovy-json/src/main/java/groovy/json/JsonLexer.java`
#### Snippet
```java
            token.setEndColumn(startColumn + 1);
            token.setType(possibleTokenType);
            token.setText("" + firstChar);

            if (possibleTokenType.ordinal() >= OPEN_CURLY.ordinal() && possibleTokenType.ordinal() <= FALSE.ordinal()) {
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
            return ((FastArray) o).toList();
        }
        return Collections.<MetaMethod>singletonList((MetaMethod) o);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/generation/BaseGenerator.java`
#### Snippet
```java
                    new ArrayExpression(
                            ClassHelper.OBJECT_TYPE,
                            Arrays.<Expression>asList(VariableExpression.THIS_EXPRESSION, VariableExpression.THIS_EXPRESSION)
                    )
            );
```

## RuleId[id=NumberEquality]
### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
            }
        }
        return compareTo(left, right) == ONE;
    }

```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
        }
        Integer result = compareTo(left, right);
        return  result == MINUS_ONE || result == ZERO;
    }

```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
        }
        Integer result = compareTo(left, right);
        return  result == MINUS_ONE || result == ZERO;
    }

```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
        }
        Integer result = compareTo(left, right);
        return  result == ONE || result == ZERO;
    }

```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
        }
        Integer result = compareTo(left, right);
        return  result == ONE || result == ZERO;
    }

```

### NumberEquality
Number objects are compared using `==`, not 'equals()'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
            }
        }
        return compareTo(left, right) == MINUS_ONE;
    }

```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/groovy/io/StringBuilderWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(final String value) {
        if (value != null) {
            builder.append(value);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/groovy/io/StringBuilderWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(final char[] value, final int offset, final int length) {
        if (value != null) {
            builder.append(value, offset, length);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/LinkedDeque.java`
#### Snippet
```java

  @Override
  public Iterator<E> iterator() {
    return new AbstractLinkedIterator(first) {
      @Override E computeNext() {
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/LinkedDeque.java`
#### Snippet
```java

  @Override
  public Iterator<E> descendingIterator() {
    return new AbstractLinkedIterator(last) {
      @Override E computeNext() {
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java

    @Override
    public <T> T[] toArray(T[] array) {
      return map.data.keySet().toArray(array);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java

    @Override
    public <T> T[] toArray(T[] array) {
      return map.data.keySet().toArray(array);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
   */
  @Override
  public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
    return compute(key, mappingFunction, true);
  }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java

    @Override
    public Object[] toArray() {
      return map.data.keySet().toArray();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java

    @Override
    public Iterator<V> iterator() {
      return new ValueIterator();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java

  @Override
  public boolean remove(Object key, Object value) {
    final Node<K, V> node = data.get(key);
    if ((node == null) || (value == null)) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java

  @Override
  public V putIfAbsent(K key, V value) {
    return put(key, value, true);
  }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
    @Override public Object peek() { return null; }
    @Override public int size() { return 0; }
    @Override public Iterator<Object> iterator() { return Collections.emptyIterator(); }
  }

```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java

    @Override
    public Iterator<Entry<K, V>> iterator() {
      return new EntryIterator();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java

    @Override
    public Iterator<K> iterator() {
      return new KeyIterator();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java

  @Override
  public boolean replace(K key, V oldValue, V newValue) {
    checkNotNull(key);
    checkNotNull(oldValue);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java

  @Override
  public boolean replace(K key, V oldValue, V newValue) {
    checkNotNull(key);
    checkNotNull(oldValue);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java

  @Override
  public boolean replace(K key, V oldValue, V newValue) {
    checkNotNull(key);
    checkNotNull(oldValue);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java

  @Override
  public V replace(K key, V value) {
    checkNotNull(key);
    checkNotNull(value);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java

  @Override
  public V replace(K key, V value) {
    checkNotNull(key);
    checkNotNull(value);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/util/CharSequenceReader.java`
#### Snippet
```java
     */
    @Override
    public int read(final char[] array, final int offset, final int length) {
        if (idx >= charSequence.length()) {
            return EOF;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/control/io/NullWriter.java`
#### Snippet
```java

    @Override
    public void write(char[] cbuf, int off, int len ) {}
}

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/runtime/StringBufferWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(char[] text, int offset, int length) {
        if ((offset < 0) || (offset > text.length) || (length < 0) || ((offset + length) > text.length) || ((offset + length) < 0)) {
            throw new IndexOutOfBoundsException();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/runtime/StringBufferWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(String text, int offset, int length) {
        buffer.append(text, offset, offset + length);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/runtime/StringBufferWriter.java`
#### Snippet
```java
     */
    @Override
    public void write(String text) {
        buffer.append(text);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/runtime/GroovyCategorySupport.java`
#### Snippet
```java
         */
        @Override
        public int compareTo(final Object that) {
            Class thisClass = metaClass;
            Class thatClass = ((CategoryMethod) that).metaClass;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/runtime/MethodRankHelper.java`
#### Snippet
```java

        @Override
        public int compareTo(Object o) {
            RankableMethod mo = (RankableMethod) o;
            return score.compareTo(mo.score);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/runtime/MethodRankHelper.java`
#### Snippet
```java

        @Override
        public int compareTo(Object o) {
            RankableField co = (RankableField) o;
            return score.compareTo(co.score);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/runtime/MethodRankHelper.java`
#### Snippet
```java

        @Override
        public int compareTo(Object o) {
            RankableConstructor co = (RankableConstructor) o;
            return score.compareTo(co.score);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/runtime/FlushingStreamWriter.java`
#### Snippet
```java

    @Override
    public void write(String str, int off, int len) throws IOException {
        super.write(str, off, len);
        flush();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/runtime/FlushingStreamWriter.java`
#### Snippet
```java

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        super.write(cbuf, off, len);
        flush();
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/codehaus/groovy/runtime/StringGroovyMethods.java`
#### Snippet
```java

        @Override
        public Iterator<String> iterator() {
            return IOGroovyMethods.iterator(new CharSequenceReader(delegate));
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/runtime/memoize/CommonCache.java`
#### Snippet
```java

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        map.putAll(m);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/runtime/memoize/UnlimitedConcurrentCache.java`
#### Snippet
```java

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        map.putAll(m);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/codehaus/groovy/runtime/memoize/UnlimitedConcurrentCache.java`
#### Snippet
```java
     */
    @Override
    public Collection<V> values() {
        return map.values();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/codehaus/groovy/runtime/memoize/UnlimitedConcurrentCache.java`
#### Snippet
```java

    @Override
    public Set<K> keySet() {
        return map.keySet();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/codehaus/groovy/runtime/memoize/UnlimitedConcurrentCache.java`
#### Snippet
```java

    @Override
    public Set<Entry<K, V>> entrySet() {
        return map.entrySet();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/runtime/memoize/ConcurrentCommonCache.java`
#### Snippet
```java

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        doWithWriteLock(c -> {
            c.putAll(m);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/runtime/memoize/StampedCommonCache.java`
#### Snippet
```java

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        doWithWriteLock(c -> {
            c.putAll(m);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
    }
    @Override
    public Object[] toArray(Object[] a) {
      Collection c = new ArrayList(this);
      return c.toArray(a);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
    }
    @Override
    public Object[] toArray(Object[] a) {
      Collection c = new ArrayList(this);
      return c.toArray(a);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
    }
    @Override
    public Object[] toArray() {
      Collection c = new ArrayList(this);
      return c.toArray();
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
  private class Values extends AbstractCollection {
    @Override
    public Iterator iterator() {
      return new ValueIterator();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
    }
    @Override
    public Object[] toArray() {
      Collection c = new ArrayList(this);
      return c.toArray();
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
    }
    @Override
    public Object[] toArray() {
      Collection c = new ArrayList(this);
      return c.toArray();
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
    }
    @Override
    public Object[] toArray(Object[] a) {
      Collection c = new ArrayList(this);
      return c.toArray(a);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
    }
    @Override
    public Object[] toArray(Object[] a) {
      Collection c = new ArrayList(this);
      return c.toArray(a);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
    }
    @Override
    public Object[] toArray(Object[] a) {
      Collection c = new ArrayList(this);
      return c.toArray(a);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
    }
    @Override
    public Object[] toArray(Object[] a) {
      Collection c = new ArrayList(this);
      return c.toArray(a);
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
  private class KeySet extends AbstractSet {
    @Override
    public Iterator iterator() {
      return new KeyIterator();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
  private class EntrySet extends AbstractSet {
    @Override
    public Iterator iterator() {
      return new HashIterator();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java

        @Override
        public E get(final long timeout, final TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
            return transform.call(delegate.get(timeout, unit));
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/reflection/CachedMethod.java`
#### Snippet
```java

    @Override
    public int compareTo(final Object other) {
        if (other == this) return 0;
        if (other == null) return -1;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/io/PlatformLineWriter.java`
#### Snippet
```java

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        for (; len > 0; len--) {
            char c = cbuf[off++];
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/io/LineColumnReader.java`
#### Snippet
```java
     */
    @Override
    public int read(char[] chars) throws IOException {
        return read(chars, 0, chars.length - 1);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/io/LineColumnReader.java`
#### Snippet
```java
     */
    @Override
    public int read(CharBuffer buffer) {
        throw new UnsupportedOperationException("read(CharBuffer) not yet implemented");
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/io/LineColumnReader.java`
#### Snippet
```java
     */
    @Override
    public int read(char[] chars, int startOffset, int length) throws IOException {
        for (int i = startOffset; i <= startOffset + length; i++) {
            int readInt = read();
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/lang/EmptyRange.java`
#### Snippet
```java
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("cannot remove from Empty Ranges");
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/lang/EmptyRange.java`
#### Snippet
```java
     */
    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("cannot retainAll in Empty Ranges");
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/lang/EmptyRange.java`
#### Snippet
```java
     */
    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException("cannot add to Empty Ranges");
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/lang/EmptyRange.java`
#### Snippet
```java
     */
    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException("cannot add to Empty Ranges");
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/lang/IntRange.java`
#### Snippet
```java

    @Override
    public boolean containsAll(Collection other) {
        if (other instanceof IntRange) {
            final IntRange range = (IntRange) other;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/lang/ListWithDefault.java`
#### Snippet
```java

    @Override
    public boolean removeAll(Collection<?> objects) {
        return delegate.removeAll(objects);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/lang/ListWithDefault.java`
#### Snippet
```java

    @Override
    public boolean containsAll(Collection<?> objects) {
        return delegate.containsAll(objects);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/lang/ListWithDefault.java`
#### Snippet
```java

    @Override
    public boolean addAll(Collection<? extends T> ts) {
        return delegate.addAll(ts);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/groovy/lang/ListWithDefault.java`
#### Snippet
```java
     */
    @Override
    public ListWithDefault<T> subList(int fromIndex, int toIndex) {
        return new ListWithDefault<T>(delegate.subList(fromIndex, toIndex), lazyDefaultValues, (Closure) initClosure.clone());
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/groovy/lang/ListWithDefault.java`
#### Snippet
```java

    @Override
    public ListIterator<T> listIterator(int i) {
        return delegate.listIterator(i);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/lang/ListWithDefault.java`
#### Snippet
```java

    @Override
    public boolean addAll(int i, Collection<? extends T> ts) {
        return delegate.addAll(i, ts);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/lang/ListWithDefault.java`
#### Snippet
```java

    @Override
    public boolean retainAll(Collection<?> objects) {
        return delegate.retainAll(objects);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/groovy/lang/ListWithDefault.java`
#### Snippet
```java

    @Override
    public <U> U[] toArray(U[] ts) {
        return delegate.toArray(ts);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/lang/ListWithDefault.java`
#### Snippet
```java

    @Override
    public <U> U[] toArray(U[] ts) {
        return delegate.toArray(ts);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/groovy/lang/ListWithDefault.java`
#### Snippet
```java

    @Override
    public ListIterator<T> listIterator() {
        return delegate.listIterator();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/groovy/lang/ListWithDefault.java`
#### Snippet
```java

    @Override
    public Object[] toArray() {
        return delegate.toArray();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/groovy/lang/ListWithDefault.java`
#### Snippet
```java

    @Override
    public Iterator<T> iterator() {
        return delegate.iterator();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/groovy/lang/MapWithDefault.java`
#### Snippet
```java

    @Override
    public Collection<V> values() {
        return delegate.values();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/groovy/lang/MapWithDefault.java`
#### Snippet
```java

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return delegate.entrySet();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/main/java/groovy/lang/MapWithDefault.java`
#### Snippet
```java

    @Override
    public Set<K> keySet() {
        return delegate.keySet();
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/util/ObservableMap.java`
#### Snippet
```java

    @Override
    public void putAll(Map map) {
        int oldSize = size();
        if (map != null) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/util/ConfigObject.java`
#### Snippet
```java

    @Override
    public void putAll(Map m) {
        delegateMap.putAll(m);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/util/ObservableSet.java`
#### Snippet
```java

    @Override
    public <T> T[] toArray(T[] ts) {
        return (T[]) delegate.toArray(ts);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/util/ObservableSet.java`
#### Snippet
```java

    @Override
    public boolean removeAll(Collection<?> c) {
        if (c == null) {
            return false;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/util/ObservableSet.java`
#### Snippet
```java

    @Override
    public boolean containsAll(Collection<?> objects) {
        return delegate.containsAll(objects);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/util/ObservableSet.java`
#### Snippet
```java

    @Override
    public boolean retainAll(Collection<?> c) {
        if (c == null) {
            return false;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/util/ObservableSet.java`
#### Snippet
```java

    @Override
    public boolean addAll(Collection<? extends E> c) {
        Set<E> duplicates = new HashSet<E>();
        if (null != c) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java

    @Override
    public boolean addAll(int index, Collection c) {
        int oldSize = size();
        boolean success = delegate.addAll(index, c);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java

    @Override
    public boolean addAll(Collection c) {
        return addAll(size(), c);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java

    @Override
    public boolean containsAll(Collection c) {
        return delegate.containsAll(c);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java

    @Override
    public boolean retainAll(Collection c) {
        if (c == null) {
            return false;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java

    @Override
    public Object[] toArray(Object[] a) {
        return delegate.toArray(a);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java

    @Override
    public boolean removeAll(Collection c) {
        if (c == null) {
            return false;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/SystemOutputInterceptor.java`
#### Snippet
```java
     */
    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        Boolean result = (Boolean) callback.call(consoleId.get(), new String(b, off, len));
        if (result) {
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java

        @Override
        public boolean addAll(int index, Collection c) {
            throw new UnsupportedOperationException();
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java

        @Override
        public Object[] toArray(Object[] a) {
            throw new UnsupportedOperationException();
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java

        @Override
        public boolean addAll(Collection coll) {
            throw new UnsupportedOperationException();
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java

        @Override
        public boolean removeAll(Collection coll) {
            throw new UnsupportedOperationException();
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java

        @Override
        public boolean retainAll(Collection coll) {
            throw new UnsupportedOperationException();
        }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/util/LifecycleImplementationLoader.java`
#### Snippet
```java

    @Override
    public Iterator<S> iterator() {
        return new Iterator<S>() {

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/ExternalGroovyClassDoc.java`
#### Snippet
```java

    @Override
    public int compareTo(GroovyDoc o) {
        return 0;
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/ArrayClassDocWrapper.java`
#### Snippet
```java

    @Override
    public int compareTo(GroovyDoc o) {
        return delegate.compareTo(o);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharSequenceValue.java`
#### Snippet
```java

    @Override
    public final CharSequence subSequence(int start, int end) {
        return new CharSequenceValue(false, type, start, end, buffer, decodeStrings, checkDate);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

    @Override
    public void write(char[] cbuf, int off, int len) {
        if (off == 0 && cbuf.length == len) {
            this.add(cbuf);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-nio/src/main/java/org/apache/groovy/nio/runtime/WritablePath.java`
#### Snippet
```java

    @Override
    public WatchKey register(WatchService watcher, WatchEvent.Kind<?>[] events, WatchEvent.Modifier... modifiers) throws IOException {
        return delegate.register(watcher, events, modifiers);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-nio/src/main/java/org/apache/groovy/nio/runtime/WritablePath.java`
#### Snippet
```java

    @Override
    public WatchKey register(WatchService watcher, WatchEvent.Kind<?>[] events, WatchEvent.Modifier... modifiers) throws IOException {
        return delegate.register(watcher, events, modifiers);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-nio/src/main/java/org/apache/groovy/nio/runtime/WritablePath.java`
#### Snippet
```java

    @Override
    public boolean endsWith(String other) {
        return delegate.endsWith(other);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-nio/src/main/java/org/apache/groovy/nio/runtime/WritablePath.java`
#### Snippet
```java

    @Override
    public Path toRealPath(LinkOption... options) throws IOException {
        return delegate.toRealPath(options);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-nio/src/main/java/org/apache/groovy/nio/runtime/WritablePath.java`
#### Snippet
```java

    @Override
    public int compareTo(Path other) {
        return delegate.compareTo(other);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-nio/src/main/java/org/apache/groovy/nio/runtime/WritablePath.java`
#### Snippet
```java

    @Override
    public Path relativize(Path other) {
        return delegate.relativize(other);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-nio/src/main/java/org/apache/groovy/nio/runtime/WritablePath.java`
#### Snippet
```java

    @Override
    public boolean startsWith(String other) {
        return delegate.startsWith(other);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-nio/src/main/java/org/apache/groovy/nio/runtime/WritablePath.java`
#### Snippet
```java

    @Override
    public boolean startsWith(Path other) {
        return delegate.startsWith(other);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-nio/src/main/java/org/apache/groovy/nio/runtime/WritablePath.java`
#### Snippet
```java

    @Override
    public Path resolveSibling(Path other) {
        return delegate.resolveSibling(other);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-nio/src/main/java/org/apache/groovy/nio/runtime/WritablePath.java`
#### Snippet
```java

    @Override
    public Path resolve(Path other) {
        return delegate.resolve(other);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-nio/src/main/java/org/apache/groovy/nio/runtime/WritablePath.java`
#### Snippet
```java

    @Override
    public Path resolve(String other) {
        return delegate.resolve(other);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-nio/src/main/java/org/apache/groovy/nio/runtime/WritablePath.java`
#### Snippet
```java

    @Override
    public WatchKey register(WatchService watcher, WatchEvent.Kind<?>... events) throws IOException {
        return delegate.register(watcher, events);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-nio/src/main/java/org/apache/groovy/nio/runtime/WritablePath.java`
#### Snippet
```java

    @Override
    public WatchKey register(WatchService watcher, WatchEvent.Kind<?>... events) throws IOException {
        return delegate.register(watcher, events);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-nio/src/main/java/org/apache/groovy/nio/runtime/WritablePath.java`
#### Snippet
```java

    @Override
    public Path resolveSibling(String other) {
        return delegate.resolveSibling(other);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-nio/src/main/java/org/apache/groovy/nio/runtime/WritablePath.java`
#### Snippet
```java

    @Override
    public boolean endsWith(Path other) {
        return delegate.endsWith(other);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/ServletBinding.java`
#### Snippet
```java
                }
                @Override
                public void write(String s, int off, int len) {
                    getResponseWriter().write(s, off, len);
                }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/ServletBinding.java`
#### Snippet
```java
                }
                @Override
                public void write(byte[] b) throws IOException {
                    getResponseStream().write(b);
                }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/ServletBinding.java`
#### Snippet
```java
                }
                @Override
                public void write(char[] buf, int off, int len) {
                    getResponseWriter().write(buf, off, len);
                }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/ServletBinding.java`
#### Snippet
```java
                }
                @Override
                public PrintWriter format(Locale l, String format, Object... args) {
                    getResponseWriter().format(l, format, args);
                    return this;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/ServletBinding.java`
#### Snippet
```java
                }
                @Override
                public void write(byte[] b, int off, int len) throws IOException {
                    getResponseStream().write(b, off, len);
                }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/ServletBinding.java`
#### Snippet
```java
                }
                @Override
                public void write(char[] buf) {
                    getResponseWriter().write(buf);
                }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/ServletBinding.java`
#### Snippet
```java
                }
                @Override
                public PrintWriter format(String format, Object... args) {
                    getResponseWriter().format(format, args);
                    return this;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/DelegatingIndentWriter.java`
#### Snippet
```java

    @Override
    public void write(final char[] cbuf) throws IOException {
        delegate.write(cbuf);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/DelegatingIndentWriter.java`
#### Snippet
```java

    @Override
    public void write(final String str, final int off, final int len) throws IOException {
        delegate.write(str, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/DelegatingIndentWriter.java`
#### Snippet
```java

    @Override
    public void write(final String str) throws IOException {
        delegate.write(str);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/DelegatingIndentWriter.java`
#### Snippet
```java

    @Override
    public void write(final char[] cbuf, final int off, final int len) throws IOException {
        delegate.write(cbuf, off, len);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-xml/src/main/java/groovy/xml/streamingmarkupsupport/StreamingMarkupWriter.java`
#### Snippet
```java
    */
    @Override
    public void write(final char[] cbuf, int off, int len) throws IOException {
        while (len-- > 0) {
            write(cbuf[off++]);
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `subprojects/groovy-xml/src/main/java/groovy/xml/streamingmarkupsupport/StreamingMarkupWriter.java`
#### Snippet
```java
        */
        @Override
        public void write(final char[] cbuf, int off, int len) throws IOException {
            while (len-- > 0) {
                write(cbuf[off++]);
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/codehaus/groovy/tools/DgmConverter.java`
#### Snippet
```java

            File targetFile = new File(targetDirectory + className + ".class").getCanonicalFile();
            targetFile.getParentFile().mkdirs();

            try (final FileOutputStream fileOutputStream = new FileOutputStream(targetFile)) {
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/org/codehaus/groovy/tools/FileSystemCompiler.java`
#### Snippet
```java
        }
        if (file.isFile()) {
            file.delete();
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/org/codehaus/groovy/tools/FileSystemCompiler.java`
#### Snippet
```java
                deleteRecursive(value);
            }
            file.delete();
        }
    }
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/codehaus/groovy/tools/javac/JavaStubGenerator.java`
#### Snippet
```java

        // when outputPath is null, generate stubs in memory
        if (outputPath != null) outputPath.mkdirs();
    }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/codehaus/groovy/tools/javac/JavaStubGenerator.java`
#### Snippet
```java
        if (index == -1) return;
        File dir = new File(parent, relativeFile.substring(0, index));
        dir.mkdirs();
    }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `src/main/java/org/codehaus/groovy/control/CompilationUnit.java`
#### Snippet
```java
            File directory = path.getParentFile();
            if (directory != null && !directory.exists()) {
                directory.mkdirs();
            }

```

### IgnoreResultOfCall
Result of `Path.toFile()` is ignored
in `src/main/java/org/codehaus/groovy/runtime/ResourceGroovyMethods.java`
#### Snippet
```java
     */
    public static File createParentDirectories(File self) throws IOException {
        Files.createDirectories(self.getParentFile().toPath()).toFile();
        return self;
    }
```

### IgnoreResultOfCall
Result of `Reader.skip()` is ignored
in `src/main/java/org/codehaus/groovy/runtime/IOGroovyMethods.java`
#### Snippet
```java
        //reset() and skip over last linesep
        input.reset();
        input.skip(line.length() + skipLS);
        return line.toString();
    }
```

### IgnoreResultOfCall
Result of `Matcher.find()` is ignored
in `src/main/java/org/codehaus/groovy/runtime/StringGroovyMethods.java`
#### Snippet
```java
            self.reset();
            for (int i = 0; i < index; i += 1) {
                self.find();
            }
        } else if (index < 0) {
```

### IgnoreResultOfCall
Result of `Matcher.find()` is ignored
in `src/main/java/org/codehaus/groovy/runtime/StringGroovyMethods.java`
#### Snippet
```java
            index += getCount(self);
            for (int i = 0; i < index; i += 1) {
                self.find();
            }
        }
```

### IgnoreResultOfCall
Result of `AnnotatedNode.getAnnotations()` is ignored
in `src/main/java/org/codehaus/groovy/transform/PackageScopeASTTransformation.java`
#### Snippet
```java
            else targets = determineTargets(value);
            visitClassNode((ClassNode) parent, targets);
            parent.getAnnotations();
        } else {
            if (value != null) {
```

### IgnoreResultOfCall
Result of `ListWithDefault.get()` is ignored
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
        // initialization up to that index takes place
        if (self.size() < info.to) {
            self.get(info.to - 1);
        }

```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `src/main/java/groovy/ui/GroovyMain.java`
#### Snippet
```java
                backup = new File(file.getPath() + backupExtension);
            }
            backup.delete();
            if (!file.renameTo(backup))
                throw new IOException("unable to rename " + file + " to " + backup);
```

### IgnoreResultOfCall
Result of `URI.toURL()` is ignored
in `src/main/java/groovy/lang/GroovyClassLoader.java`
#### Snippet
```java
                newURI = new URI(path);
                // check if we can create a URL from that URI
                newURI.toURL();
            } catch (URISyntaxException | IllegalArgumentException | MalformedURLException e) {
                // the URI has a false format, so lets try it with files ...
```

### IgnoreResultOfCall
Result of `LineNumberReader.read()` is ignored
in `src/main/java/groovy/util/CharsetToolkit.java`
#### Snippet
```java
        if (hasUTF8Bom() || hasUTF16LEBom() || hasUTF16BEBom()) {
            try {
                reader.read();
            }
            catch (IOException e) {
```

### IgnoreResultOfCall
Result of `ValueList.get()` is ignored
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/ValueList.java`
#### Snippet
```java
            converted = true;
            for (int index = 0; index < list.size(); index++) {
                this.get(index);
            }
        }
```

### IgnoreResultOfCall
Result of `LineColumnReader.read()` is ignored
in `subprojects/groovy-json/src/main/java/groovy/json/JsonLexer.java`
#### Snippet
```java
            int numCharsToRead = ((String) type.getValidator()).length();
            char[] chars = new char[numCharsToRead];
            reader.read(chars);
            String stringRead = new String(chars);

```

### IgnoreResultOfCall
Result of `LineColumnReader.read()` is ignored
in `subprojects/groovy-json/src/main/java/groovy/json/JsonLexer.java`
#### Snippet
```java
                StringBuilder currentContent = new StringBuilder("\"");
                // consume the first double quote starting the string
                reader.read();
                boolean isEscaped = false;
                for (;;) {
```

### IgnoreResultOfCall
Result of `LineNumberReader.skip()` is ignored
in `subprojects/groovy-templates/src/main/groovy/groovy/text/StreamingTemplateEngine.java`
#### Snippet
```java

            try (LineNumberReader reader = new LineNumberReader(new StringReader(templateSource.toString()))) {
                reader.skip(Long.MAX_VALUE); // SR_NOT_CHECKED
                result = reader.getLineNumber();
            }
```

### IgnoreResultOfCall
Result of `CountDownLatch.await()` is ignored
in `subprojects/stress/src/stressTest/java/org/codehaus/groovy/reflection/ClassInfoDeadlockStressTest.java`
#### Snippet
```java
        }
        startLatch.countDown();
        completeLatch.await(10L, TimeUnit.SECONDS);
        if (completeLatch.getCount() != 0) {
            System.err.println("Possible deadlock, grab a thread dump now");
```

### IgnoreResultOfCall
Result of `CountDownLatch.await()` is ignored
in `subprojects/stress/src/stressTest/java/org/codehaus/groovy/reflection/ClassInfoDeadlockStressTest.java`
#### Snippet
```java
        if (completeLatch.getCount() != 0) {
            System.err.println("Possible deadlock, grab a thread dump now");
            completeLatch.await(1L, TimeUnit.MINUTES);
            if (completeLatch.getCount() == 0) {
                System.out.println("No deadlock, but took longer than expected");
```

## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'java.lang.Thread.sleep(long)' accessed via instance reference
in `src/test/groovy/TestInterruptor.java`
#### Snippet
```java
    public void run() {
        try {
            Thread.currentThread().sleep(100); // enforce yield, so we have something to interrupt
        } catch (InterruptedException e) {
            // ignore
```

### AccessStaticViaInstance
Static member 'org.codehaus.groovy.transform.BuilderASTTransformation.getMemberStringList(org.codehaus.groovy.ast.AnnotationNode, java.lang.String)' accessed via instance reference
in `src/main/java/org/codehaus/groovy/transform/BuilderASTTransformation.java`
#### Snippet
```java

        protected boolean getIncludeExclude(BuilderASTTransformation transform, AnnotationNode anno, ClassNode cNode, List<String> excludes, List<String> includes) {
            List<String> directExcludes = transform.getMemberStringList(anno, "excludes");
            if (directExcludes != null) excludes.addAll(directExcludes);
            List<String> directIncludes = transform.getMemberStringList(anno, "includes");
```

### AccessStaticViaInstance
Static member 'org.codehaus.groovy.transform.BuilderASTTransformation.getMemberStringList(org.codehaus.groovy.ast.AnnotationNode, java.lang.String)' accessed via instance reference
in `src/main/java/org/codehaus/groovy/transform/BuilderASTTransformation.java`
#### Snippet
```java
            List<String> directExcludes = transform.getMemberStringList(anno, "excludes");
            if (directExcludes != null) excludes.addAll(directExcludes);
            List<String> directIncludes = transform.getMemberStringList(anno, "includes");
            if (directIncludes != null) {
                includes.clear();
```

### AccessStaticViaInstance
Static member 'org.codehaus.groovy.transform.BuilderASTTransformation.getMemberStringList(org.codehaus.groovy.ast.AnnotationNode, java.lang.String)' accessed via instance reference
in `src/main/java/org/codehaus/groovy/transform/BuilderASTTransformation.java`
#### Snippet
```java
                    AnnotationNode tupleConstructor = cNode.getAnnotations(TupleConstructorASTTransformation.MY_TYPE).get(0);
                    if (excludes.isEmpty()) {
                        List<String>  tupleExcludes = transform.getMemberStringList(tupleConstructor, "excludes");
                        if (tupleExcludes != null) excludes.addAll(tupleExcludes);
                    }
```

### AccessStaticViaInstance
Static member 'org.codehaus.groovy.transform.BuilderASTTransformation.getMemberStringList(org.codehaus.groovy.ast.AnnotationNode, java.lang.String)' accessed via instance reference
in `src/main/java/org/codehaus/groovy/transform/BuilderASTTransformation.java`
#### Snippet
```java
                    }
                    if (includes.isEmpty()) {
                        List<String>  tupleIncludes = transform.getMemberStringList(tupleConstructor, "includes");
                        if (tupleIncludes != null) {
                            includes.clear();
```

### AccessStaticViaInstance
Static member 'org.codehaus.groovy.transform.BuilderASTTransformation.getMemberStringValue(org.codehaus.groovy.ast.AnnotationNode, java.lang.String, java.lang.String)' accessed via instance reference
in `src/main/java/groovy/transform/builder/ExternalStrategy.java`
#### Snippet
```java
        }
        ClassNode builder = (ClassNode) annotatedNode;
        String prefix = transform.getMemberStringValue(anno, "prefix", "");
        ClassNode buildee = transform.getMemberClassValue(anno, "forClass");
        if (buildee == null) {
```

### AccessStaticViaInstance
Static member 'org.codehaus.groovy.transform.BuilderASTTransformation.getMemberStringValue(org.codehaus.groovy.ast.AnnotationNode, java.lang.String, java.lang.String)' accessed via instance reference
in `src/main/java/groovy/transform/builder/ExternalStrategy.java`
#### Snippet
```java

    private static MethodNode createBuildMethod(BuilderASTTransformation transform, AnnotationNode anno, ClassNode sourceClass, List<PropertyInfo> fields) {
        String buildMethodName = transform.getMemberStringValue(anno, "buildMethodName", "build");
        final BlockStatement body = new BlockStatement();
        Expression sourceClassInstance = initializeInstance(sourceClass, fields, body);
```

### AccessStaticViaInstance
Static member 'groovy.console.ui.SystemOutputInterceptor.consoleId' accessed via instance reference
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/SystemOutputInterceptor.java`
#### Snippet
```java
     */
    public void removeConsoleId() {
        this.consoleId.remove();
    }
}
```

### AccessStaticViaInstance
Static member 'groovy.console.ui.SystemOutputInterceptor.consoleId' accessed via instance reference
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/SystemOutputInterceptor.java`
#### Snippet
```java
     */
    public void setConsoleId(int consoleId) {
        this.consoleId.set(consoleId);
    }

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `visitEmptyExpression()` is identical to its super method
in `src/main/java/org/codehaus/groovy/ast/GroovyCodeVisitorAdapter.java`
#### Snippet
```java

    @Override
    public void visitEmptyExpression(EmptyExpression expression) {
    }

```

### RedundantMethodOverride
Method `visitEmptyStatement()` is identical to its super method
in `src/main/java/org/codehaus/groovy/ast/GroovyCodeVisitorAdapter.java`
#### Snippet
```java

    @Override
    public void visitEmptyStatement(EmptyStatement statement) {
    }

```

### RedundantMethodOverride
Method `visitEmptyStatement()` is identical to its super method
in `src/main/java/org/codehaus/groovy/ast/CodeVisitorSupport.java`
#### Snippet
```java

    @Override
    public void visitEmptyStatement(final EmptyStatement statement) {
    }

```

### RedundantMethodOverride
Method `hashCode()` is identical to its super method
in `src/main/java/org/codehaus/groovy/runtime/metaclass/OwnedMetaClass.java`
#### Snippet
```java

    @Override
    public int hashCode() {
        return delegate.hashCode();
    }
```

### RedundantMethodOverride
Method `equals()` is identical to its super method
in `src/main/java/org/codehaus/groovy/runtime/metaclass/OwnedMetaClass.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj) {
        return delegate.equals(obj);
    }
```

### RedundantMethodOverride
Method `supportsDivision()` is identical to its super method
in `src/main/java/org/codehaus/groovy/classgen/asm/BinaryDoubleExpressionHelper.java`
#### Snippet
```java

    @Override
    protected boolean supportsDivision() {
        return true;
    }
```

### RedundantMethodOverride
Method `setup()` is identical to its super method
in `src/main/java/org/codehaus/groovy/transform/stc/TraitTypeCheckingExtension.java`
#### Snippet
```java

    @Override
    public void setup() {
    }

```

### RedundantMethodOverride
Method `getMonths()` is identical to its super method
in `src/main/java/groovy/time/DatumDependentDuration.java`
#### Snippet
```java

    @Override
    public int getMonths() {
        return this.months;
    }
```

### RedundantMethodOverride
Method `getYears()` is identical to its super method
in `src/main/java/groovy/time/DatumDependentDuration.java`
#### Snippet
```java

    @Override
    public int getYears() {
        return this.years;
    }
```

### RedundantMethodOverride
Method `visitReturnStatement()` is identical to its super method
in `subprojects/groovy-sql/src/main/java/groovy/sql/SqlOrderByVisitor.java`
#### Snippet
```java

    @Override
    public void visitReturnStatement(ReturnStatement statement) {
        statement.getExpression().visit(this);
    }
```

### RedundantMethodOverride
Method `visitBooleanExpression()` is identical to its super method
in `subprojects/groovy-sql/src/main/java/groovy/sql/SqlWhereVisitor.java`
#### Snippet
```java

    @Override
    public void visitBooleanExpression(BooleanExpression expression) {
        expression.getExpression().visit(this);
    }
```

### RedundantMethodOverride
Method `visitReturnStatement()` is identical to its super method
in `subprojects/groovy-sql/src/main/java/groovy/sql/SqlWhereVisitor.java`
#### Snippet
```java

    @Override
    public void visitReturnStatement(ReturnStatement statement) {
        statement.getExpression().visit(this);
    }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
hours \* 60 \* 60 \* 1000: integer multiplication implicitly cast to long
in `src/main/java/groovy/time/TimeCategory.java`
#### Snippet
```java
        milliseconds -= days * 24 * 60 * 60 * 1000;
        int hours = (int) (milliseconds / (60 * 60 * 1000));
        milliseconds -= hours * 60 * 60 * 1000;
        int minutes = (int) (milliseconds / (60 * 1000));
        milliseconds -= minutes * 60 * 1000;
```

### IntegerMultiplicationImplicitCastToLong
minutes \* 60 \* 1000: integer multiplication implicitly cast to long
in `src/main/java/groovy/time/TimeCategory.java`
#### Snippet
```java
        milliseconds -= hours * 60 * 60 * 1000;
        int minutes = (int) (milliseconds / (60 * 1000));
        milliseconds -= minutes * 60 * 1000;
        int seconds = (int) (milliseconds / 1000);
        milliseconds -= seconds * 1000;
```

### IntegerMultiplicationImplicitCastToLong
seconds \* 1000: integer multiplication implicitly cast to long
in `src/main/java/groovy/time/TimeCategory.java`
#### Snippet
```java
        milliseconds -= minutes * 60 * 1000;
        int seconds = (int) (milliseconds / 1000);
        milliseconds -= seconds * 1000;

        return new TimeDuration((int) days, hours, minutes, seconds, (int) milliseconds);
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.security.PrivilegedActionException;`
in `src/main/java/org/codehaus/groovy/reflection/SunClassLoader.java`
#### Snippet
```java
import java.io.InputStream;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.HashMap;
```

### UNUSED_IMPORT
Unused import `import java.security.PrivilegedExceptionAction;`
in `src/main/java/org/codehaus/groovy/reflection/SunClassLoader.java`
#### Snippet
```java
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.HashMap;
import java.util.Map;
```

### UNUSED_IMPORT
Unused import `import org.codehaus.groovy.util.DoubleArrayIterable;`
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
import org.codehaus.groovy.util.ArrayIterable;
import org.codehaus.groovy.util.ArrayIterator;
import org.codehaus.groovy.util.DoubleArrayIterable;
import org.codehaus.groovy.util.IntArrayIterable;
import org.codehaus.groovy.util.IteratorBufferedIterator;
```

### UNUSED_IMPORT
Unused import `import org.codehaus.groovy.util.IntArrayIterable;`
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
import org.codehaus.groovy.util.ArrayIterator;
import org.codehaus.groovy.util.DoubleArrayIterable;
import org.codehaus.groovy.util.IntArrayIterable;
import org.codehaus.groovy.util.IteratorBufferedIterator;
import org.codehaus.groovy.util.ListBufferedIterator;
```

### UNUSED_IMPORT
Unused import `import org.codehaus.groovy.util.LongArrayIterable;`
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
import org.codehaus.groovy.util.IteratorBufferedIterator;
import org.codehaus.groovy.util.ListBufferedIterator;
import org.codehaus.groovy.util.LongArrayIterable;

import java.io.ByteArrayOutputStream;
```

### UNUSED_IMPORT
Unused import `import org.codehaus.groovy.ast.RecordComponentNode;`
in `src/main/java/org/codehaus/groovy/transform/BuilderASTTransformation.java`
#### Snippet
```java
import org.codehaus.groovy.ast.Parameter;
import org.codehaus.groovy.ast.PropertyNode;
import org.codehaus.groovy.ast.RecordComponentNode;
import org.codehaus.groovy.ast.tools.BeanUtils;
import org.codehaus.groovy.control.CompilationUnit;
```

### UNUSED_IMPORT
Unused import `import groovy.transform.NonSealed;`
in `src/main/java/org/codehaus/groovy/transform/SealedCompletionASTTransformation.java`
#### Snippet
```java
package org.codehaus.groovy.transform;

import groovy.transform.NonSealed;
import groovy.transform.Sealed;
import org.codehaus.groovy.ast.ASTNode;
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `delta` are queried, but never updated
in `src/main/java/org/codehaus/groovy/tools/gse/StringSetMap.java`
#### Snippet
```java

        for (String k: nameSet) {
            StringSetMap delta = new StringSetMap();
            for (String i: nameSet) {
                for (String j: nameSet) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `flags` are queried, but never updated
in `src/main/java/org/codehaus/groovy/tools/FileSystemCompiler.java`
#### Snippet
```java

        @Option(names = "-F", paramLabel = "<flag>", description = "Passed to javac for joint compilation")
        private List<String> flags;

        @Option(names = {"--configscript"}, paramLabel = "<script>", description = "A script for tweaking the configuration options")
```

### MismatchedCollectionQueryUpdate
Contents of collection `javacOptionsMap` are queried, but never updated
in `src/main/java/org/codehaus/groovy/tools/FileSystemCompiler.java`
#### Snippet
```java

        @Option(names = "-J", paramLabel = "<property=value>", description = "Name-value pairs to pass to javac")
        private Map<String, String> javacOptionsMap;

        @Option(names = "-F", paramLabel = "<flag>", description = "Passed to javac for joint compilation")
```

### MismatchedCollectionQueryUpdate
Contents of collection `systemProperties` are queried, but never updated
in `src/main/java/groovy/ui/GroovyMain.java`
#### Snippet
```java

        @Option(names = {"-D", "--define"}, paramLabel = "<property=value>", description = "Define a system property")
        private Map<String, String> systemProperties = new LinkedHashMap<String, String>();

        @Option(names = "--disableopt", paramLabel = "optlist", split = ",",
```

### MismatchedCollectionQueryUpdate
Contents of collection `disableopt` are queried, but never updated
in `src/main/java/groovy/ui/GroovyMain.java`
#### Snippet
```java
                                "all (disables all optimizations), ",
                                "int (disable any int based optimizations)"})
        private List<String> disableopt = new ArrayList<String>();

        @Option(names = {"-d", "--debug"}, description = "Debug mode will print out full stack traces")
```

### MismatchedCollectionQueryUpdate
Contents of collection `packageSets` are queried, but never updated
in `subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovydoc.java`
#### Snippet
```java
    private Boolean noTimestamp;
    private Boolean noVersionStamp;
    private final List<DirSet> packageSets;
    private final List<String> sourceFilesToDoc;
    private final List<LinkArgument> links = new ArrayList<>();
```

### MismatchedCollectionQueryUpdate
Contents of collection `excludePackageNames` are queried, but never updated
in `subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovydoc.java`
#### Snippet
```java
    private File destDir;
    private final List<String> packageNames;
    private final List<String> excludePackageNames;
    private String windowTitle = "Groovy Documentation";
    private String docTitle = "Groovy Documentation";
```

### MismatchedCollectionQueryUpdate
Contents of collection `annotationRefs` are queried, but never updated
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/ExternalGroovyClassDoc.java`
#### Snippet
```java
    private static final GroovyType[] EMPTY_GROOVYTYPE_ARRAY = new GroovyType[0];
    private final Class externalClass;
    private final List<GroovyAnnotationRef> annotationRefs;

    public ExternalGroovyClassDoc(Class externalClass) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `refList` are updated, but never queried
in `subprojects/stress/src/stressTest/java/org/codehaus/groovy/reflection/ClassInfoLeakStressTest.java`
#### Snippet
```java

    // Used to keep a hard reference to the References so they are not collected
    private List<Reference<?>> refList = new ArrayList<Reference<?>>(NUM_OBJECTS * 3);

    @Before
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `tokeTypeN` initializer `tokenType2` is redundant
in `src/main/java/org/apache/groovy/parser/antlr4/SemanticPredicates.java`
#### Snippet
```java

        if (DOT == tokenType2) {
            int tokeTypeN = tokenType2;

            do {
```

### UnusedAssignment
The value `getMap()` assigned to `map` is never used
in `src/main/java/org/apache/groovy/plugin/GroovyRunnerRegistry.java`
#### Snippet
```java
        Map<String, GroovyRunner> map = runnerMap; // direct read
        if (map == null) {
            map = getMap(); // initialize and load (recursive call), result ignored
            if (classLoader == null) {
                // getMap() already loaded using a null classloader
```

### UnusedAssignment
Variable `staticContext` initializer `false` is redundant
in `src/main/java/org/codehaus/groovy/ast/DynamicVariable.java`
#### Snippet
```java
    private final String name;
    private boolean closureShare = false;
    private boolean staticContext = false;

    public DynamicVariable(String name, boolean context) {
```

### UnusedAssignment
Variable `mapEntryExpression` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/ast/expr/MapExpression.java`
#### Snippet
```java
        sb.append("[");
        int size = mapEntryExpressions.size();
        MapEntryExpression mapEntryExpression = null;
        if (size > 0) {
            mapEntryExpression = mapEntryExpressions.get(0);
```

### UnusedAssignment
Variable `url` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/util/ReleaseInfo.java`
#### Snippet
```java

    static {
        URL url = null;
        ClassLoader cl = ReleaseInfo.class.getClassLoader();
        // we need no security check for getting the system class
```

### UnusedAssignment
Variable `r` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/util/ReferenceManager.java`
#### Snippet
```java
            thread = new Thread(() -> {
                ReferenceQueue queue1 = getReferenceQueue();
                java.lang.ref.Reference r=null;
                while (shouldRun) {
                    try {
```

### UnusedAssignment
The value `null` assigned to `r` is never used
in `src/main/java/org/codehaus/groovy/util/ReferenceManager.java`
#### Snippet
```java
                    }
                    r.clear();
                    r=null;
                }
            });
```

### UnusedAssignment
The value `null` assigned to `r` is never used
in `src/main/java/org/codehaus/groovy/util/ReferenceManager.java`
#### Snippet
```java
                }
                r.clear();
                r=null;
            }
        }
```

### UnusedAssignment
Variable `base` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/tools/ErrorReporter.java`
#### Snippet
```java
 */
public class ErrorReporter {
    private Throwable base = null;    // The exception on which to report
    private boolean debug = false;   // If true, stack traces are always output

```

### UnusedAssignment
Variable `type` initializer `tp.getType()` is redundant
in `src/main/java/org/codehaus/groovy/ast/tools/GenericsUtils.java`
#### Snippet
```java
            for (GenericsType tp : tps) {
                String name = tp.getName();
                ClassNode type = tp.getType();
                ClassNode redirect;
                if (tp.getUpperBounds() != null) {
```

### UnusedAssignment
Variable `elements` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/syntax/Reduction.java`
#### Snippet
```java
    // INITIALIZATION AND SUCH

    private List elements = null;    // The set of child nodes
    private boolean marked = false;   // Used for completion marking by some parts of the parser

```

### UnusedAssignment
Variable `c` initializer `' '` is redundant
in `src/main/java/org/codehaus/groovy/syntax/Numbers.java`
#### Snippet
```java
        text1 = text1.replace("_", "");

        char c = ' ';
        int length = text1.length();

```

### UnusedAssignment
The value `1` assigned to `length` is never used
in `src/main/java/org/codehaus/groovy/syntax/Numbers.java`
#### Snippet
```java
            text1 = text1.substring(0, length - 1);

            length -= 1;
        }

```

### UnusedAssignment
The value `classNameInfo.getV2()` assigned to `doInitialClassTest` is never used
in `src/main/java/org/codehaus/groovy/control/ResolveVisitor.java`
#### Snippet
```java
                Tuple2<StringBuilder, Boolean> classNameInfo = makeClassName(doInitialClassTest, name, varName);
                name = classNameInfo.getV1();
                doInitialClassTest = classNameInfo.getV2();

                break;
```

### UnusedAssignment
Variable `pname` initializer `name` is redundant
in `src/main/java/org/codehaus/groovy/control/ResolveVisitor.java`
#### Snippet
```java
        // the while loop enables a check for inner classes which are not fully imported,
        // but visible as the surrounding class is imported and the inner class is public/protected static
        String pname = name;
        int index = name.length();
        /*
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
        MetaClass metaClass = receiver.getMetaClass();
        // ignore interception and missing method fallback
        Object result = null;
        try {
            result = metaClass.invokeMethod(senderClass, receiver, messageName, messageArguments, true, true);
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
    //  --------------------------------------------------------
    public static Object invokeMethodOnCurrentN(Class senderClass, GroovyObject receiver, String messageName, Object[] messageArguments) throws Throwable {
        Object result = null;
        boolean intercepting = receiver instanceof GroovyInterceptable;
        try {
```

### UnusedAssignment
The value `getWarningLevel()` assigned to `numeric` is never used
in `src/main/java/org/codehaus/groovy/control/CompilerConfiguration.java`
#### Snippet
```java
        int numeric;

        numeric = getWarningLevel();
        text = configuration.getProperty("groovy.warnings", "likely errors");
        try {
```

### UnusedAssignment
The value `10` assigned to `numeric` is never used
in `src/main/java/org/codehaus/groovy/control/CompilerConfiguration.java`
#### Snippet
```java
        if (text != null) setDebug(text.equalsIgnoreCase("true"));

        numeric = 10;
        text = configuration.getProperty("groovy.errors.tolerance", "10");
        try {
```

### UnusedAssignment
The value `packagePrefix` assigned to `name` is never used
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ReflectorLoader.java`
#### Snippet
```java
            if (theClass.isArray()) {
                   Class clazz = theClass;
                   name = packagePrefix;
                   int level = 0;
                   while (clazz.isArray()) {
```

### UnusedAssignment
Variable `e` initializer `first` is redundant
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
    int index = hash & (tab.length-1);
    Entry first = tab[index];
    Entry e = first;

    for (e = first; e != null; e = e.next)
```

### UnusedAssignment
Variable `mc` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/runtime/metaclass/MetaClassRegistryImpl.java`
#### Snippet
```java
        Class theClass = obj instanceof Class ? (Class)obj : obj.getClass();
        ClassInfo info = ClassInfo.getClassInfo(theClass);
        MetaClass mc = null;
        info.lock();
        try {
```

### UnusedAssignment
Variable `mc` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/runtime/metaclass/MetaClassRegistryImpl.java`
#### Snippet
```java
    private void setMetaClass(Class theClass, MetaClass oldMC, MetaClass newMC) {
        ClassInfo info = ClassInfo.getClassInfo(theClass);
        MetaClass mc = null;
        info.lock();
        try {
```

### UnusedAssignment
The value `ClassHelper.getWrapper(rhsType)` assigned to `rhsType` is never used
in `src/main/java/org/codehaus/groovy/classgen/asm/BinaryExpressionHelper.java`
#### Snippet
```java
            if (var.isClosureSharedVariable() && ClassHelper.isPrimitiveType(rhsType)) {
                // GROOVY-5570: if a closure shared variable is a primitive type, it must be boxed
                rhsType = ClassHelper.getWrapper(rhsType);
                operandStack.box();
            }
```

### UnusedAssignment
Variable `ex` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/classgen/asm/OptimizingStatementWriter.java`
#### Snippet
```java

    private boolean writeDeclarationExtraction(final Statement statement) {
        Expression ex = null;
        if (statement instanceof ReturnStatement) {
            ReturnStatement rs = (ReturnStatement) statement;
```

### UnusedAssignment
Variable `paraTypes` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/classgen/asm/OptimizingStatementWriter.java`
#### Snippet
```java

            // find method call target
            Parameter[] paraTypes = null;
            if (callArgs instanceof ArgumentListExpression) {
                ArgumentListExpression args = (ArgumentListExpression) callArgs;
```

### UnusedAssignment
Variable `prefix` initializer `""` is redundant
in `src/main/java/org/codehaus/groovy/classgen/asm/BytecodeHelper.java`
#### Snippet
```java
        }

        String prefix = "";
        if (name.endsWith("[]")) { // todo need process multi
            prefix = "[";
```

### UnusedAssignment
The value `makeClassTarget(typeOrTargetRefType, typeOrTargetRef)` assigned to `typeOrTargetRef` is never used
in `src/main/java/org/codehaus/groovy/classgen/asm/sc/StaticTypesMethodReferenceExpressionWriter.java`
#### Snippet
```java
            } else if (methodRefMethod.isStatic() && !targetIsArgument) {
                // "string"::valueOf refers to static method, so instance is superfluous
                typeOrTargetRef = makeClassTarget(typeOrTargetRefType, typeOrTargetRef);
                isClassExpression = true;
            } else {
```

### UnusedAssignment
Variable `genericsSpec` initializer `createGenericsSpec(classNode)` is redundant
in `src/main/java/org/codehaus/groovy/transform/InheritConstructorsASTTransformation.java`
#### Snippet
```java
        Parameter[] oldParams = ctorNode.getParameters();
        Parameter[] newParams = new Parameter[oldParams.length];
        Map<String, ClassNode> genericsSpec = createGenericsSpec(classNode);
        genericsSpec = createGenericsSpec(classNode.getUnresolvedSuperClass());
        List<Expression> theArgs = buildParams(oldParams, newParams, genericsSpec, copyParameterAnnotations);
```

### UnusedAssignment
Variable `thatType` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/transform/sc/StaticCompilationVisitor.java`
#### Snippet
```java
                if (method instanceof ConstructorNode) {
                    // create constructor with a nested class as the first parameter, creating one if necessary
                    ClassNode thatType = null;
                    Iterator<InnerClassNode> innerClasses = node.getInnerClasses();
                    if (innerClasses.hasNext()) {
```

### UnusedAssignment
Variable `encoded` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/transform/stc/SignatureCodecVersion1.java`
#### Snippet
```java
        DataOutputStream dos = new DataOutputStream(baos);
        Writer wrt = new StringBuilderWriter();
        String encoded = null;
        try {
            doEncode(node, dos);
```

### UnusedAssignment
Variable `fieldMods` initializer `0` is redundant
in `src/main/java/org/codehaus/groovy/transform/trait/TraitComposer.java`
#### Snippet
```java
                    boolean getter = "get".equals(operation);
                    ClassNode returnType = correctToGenericsSpecRecurse(genericsSpec, methodNode.getReturnType());
                    int fieldMods = 0;
                    int isStatic = 0;
                    boolean publicField = true;
```

### UnusedAssignment
Variable `isStatic` initializer `0` is redundant
in `src/main/java/org/codehaus/groovy/transform/trait/TraitComposer.java`
#### Snippet
```java
                    ClassNode returnType = correctToGenericsSpecRecurse(genericsSpec, methodNode.getReturnType());
                    int fieldMods = 0;
                    int isStatic = 0;
                    boolean publicField = true;
                    FieldNode helperField = null;
```

### UnusedAssignment
Variable `cls` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/reflection/GeneratedMetaMethod.java`
#### Snippet
```java
                        continue;

                    Class cls = null;
                    try {
                        cls = loader.loadClass(name);
```

### UnusedAssignment
Variable `line` initializer `null` is redundant
in `src/main/java/groovy/ui/GroovySocketServer.java`
#### Snippet
```java
        public void run() {
            try {
                String line = null;
                script.setProperty("out", writer);
                script.setProperty("socket", socket);
```

### UnusedAssignment
The value `applyGenericsContext(connections, oldValue)` assigned to `newValue` is never used
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java`
#### Snippet
```java
                }
                if (newValue == null) {
                    entry.setValue(newValue = applyGenericsContext(connections, oldValue));
                } else if (!newValue.isPlaceholder() || newValue != resolvedPlaceholders.get(name)) {
                    // GROOVY-6787: Don't override the original if the replacement doesn't respect the bounds otherwise
```

### UnusedAssignment
Variable `su` initializer `null` is redundant
in `src/main/java/groovy/lang/GroovyClassLoader.java`
#### Snippet
```java
            unit.addFirstPhaseOperation(TimestampAdder.INSTANCE, CompilePhase.CLASS_GENERATION.getPhaseNumber());
        }
        SourceUnit su = null;
        File file = codeSource.getFile();
        if (file != null) {
```

### UnusedAssignment
Variable `value` initializer `null` is redundant
in `src/main/java/groovy/lang/MetaExpandoProperty.java`
#### Snippet
```java
public class MetaExpandoProperty extends MetaProperty {

    Object value = null;

    public MetaExpandoProperty(Entry entry) {
```

### UnusedAssignment
Variable `metaMethod` initializer `null` is redundant
in `src/main/java/groovy/lang/ExpandoMetaClass.java`
#### Snippet
```java
                methodName = name;

            ClosureStaticMetaMethod metaMethod = null;

            if (paramTypes != null) {
```

### UnusedAssignment
Variable `oldValue` initializer `null` is redundant
in `src/main/java/groovy/util/ObservableMap.java`
#### Snippet
```java
    public Object put(Object key, Object value) {
        int oldSize = size();
        Object oldValue = null;
        boolean newKey = !delegate.containsKey(key);
        if (test != null) {
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/main/java/groovy/util/ObservableMap.java`
#### Snippet
```java
        if (test != null) {
            oldValue = delegate.put(key, value);
            Object result = null;
            if (test.getMaximumNumberOfParameters() == 2) {
                result = test.call(key, value);
```

### UnusedAssignment
Variable `oldValue` initializer `null` is redundant
in `src/main/java/groovy/util/ObservableMap.java`
#### Snippet
```java
                String key = String.valueOf(entry.getKey());
                Object newValue = entry.getValue();
                Object oldValue = null;

                boolean newKey = !delegate.containsKey(key);
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/main/java/groovy/util/ObservableMap.java`
#### Snippet
```java
                if (test != null) {
                    oldValue = delegate.put(key, newValue);
                    Object result = null;
                    if (test.getMaximumNumberOfParameters() == 2) {
                        result = test.call(key, newValue);
```

### UnusedAssignment
Variable `node` initializer `null` is redundant
in `src/main/java/groovy/util/BuilderSupport.java`
#### Snippet
```java

    protected Object doInvokeMethod(final String methodName, final Object name, final Object args) {
        Object node = null;
        Closure closure = null;
        List list = InvokerHelper.asList(args);
```

### UnusedAssignment
Variable `bean` initializer `null` is redundant
in `src/main/java/groovy/util/ObjectGraphBuilder.java`
#### Snippet
```java
            if(value == null) return super.newInstance(builder, name, value, properties);

            Object bean = null;
            Class klass = null;
            Map context = builder.getContext();
```

### UnusedAssignment
Variable `klass` initializer `null` is redundant
in `src/main/java/groovy/util/ObjectGraphBuilder.java`
#### Snippet
```java

            Object bean = null;
            Class klass = null;
            Map context = builder.getContext();
            if(value instanceof String || value instanceof GString) {
```

### UnusedAssignment
Variable `lastMod` initializer `0` is redundant
in `src/main/java/groovy/util/GroovyScriptEngine.java`
#### Snippet
```java
    private long getLastModified(String scriptName) throws ResourceException {
        URLConnection conn = rc.getResourceConnection(scriptName);
        long lastMod = 0;
        try {
            lastMod = conn.getLastModified();
```

### UnusedAssignment
Variable `answer` initializer `null` is redundant
in `src/main/java/groovy/util/GroovyScriptEngine.java`
#### Snippet
```java
            localTh.set(localData);
            StringSetMap cache = localData.dependencyCache;
            Class<?> answer = null;
            try {
                updateLocalDependencyCache(codeSource, localData);
```

### UnusedAssignment
Variable `result` initializer `null` is redundant
in `src/main/java/groovy/util/FactoryBuilderSupport.java`
#### Snippet
```java
        }

        Object result = null;
        Object previousContext = getProxyBuilder().getContext();
        FactoryBuilderSupport previousProxyBuilder = localProxyBuilder.get();
```

### UnusedAssignment
Variable `line` initializer `""` is redundant
in `subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovy.java`
#### Snippet
```java
        log.debug("runStatements()");
        StringBuilder txt = new StringBuilder();
        String line = "";
        BufferedReader in = new BufferedReader(reader);

```

### UnusedAssignment
Variable `metaProperty` initializer `null` is redundant
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
    @Override
    public MetaProperty getMetaProperty(final String name) {
        MetaProperty metaProperty = null;

        LinkedHashMap<String, MetaProperty> propertyMap = classPropertyIndex.computeIfAbsent(theCachedClass, k -> new LinkedHashMap<>());
```

### UnusedAssignment
Variable `lType` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
            leftExpression.visit(this);
            SetterInfo setterInfo = removeSetterInfo(leftExpression);
            ClassNode lType = null;
            if (setterInfo != null) {
                if (ensureValidSetter(expression, leftExpression, rightExpression, setterInfo)) {
```

### UnusedAssignment
Variable `style` initializer `null` is redundant
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
            // the start and end indices of a match in the Matcher looking
            int matchEnd = offset;
            Style style = null;
            while (matchEnd < checkPoint && matcher.find(offset)) {
                // when we get something other than -1, we know which regexp
```

### UnusedAssignment
Variable `ans` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java
    @Deprecated
    public static int[] convertToIntArray(Object a) {
        int[] ans = null;

        // conservative coding
```

### UnusedAssignment
Variable `ans` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java
    @Deprecated
    public static short[] convertToShortArray(Object a) {
        short[] ans = null;

        // conservative coding
```

### UnusedAssignment
Variable `ans` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java
    @Deprecated
    public static double[] convertToDoubleArray(Object a) {
        double[] ans = null;

        // conservative coding
```

### UnusedAssignment
Variable `ans` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java
    @Deprecated
    public static float[] convertToFloatArray(Object a) {
        float[] ans = null;

        // conservative coding
```

### UnusedAssignment
Variable `ans` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java
    @Deprecated
    public static byte[] convertToByteArray(Object a) {
        byte[] ans = null;

        // conservative coding
```

### UnusedAssignment
Variable `ans` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java
    @Deprecated
    public static char[] convertToCharArray(Object a) {
        char[] ans = null;

        // conservative coding
```

### UnusedAssignment
Variable `ans` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java
    @Deprecated
    public static boolean[] convertToBooleanArray(Object a) {
        boolean[] ans = null;

        // conservative coding
```

### UnusedAssignment
Variable `ans` initializer `null` is redundant
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java
    @Deprecated
    public static long[] convertToLongArray(Object a) {
        long[] ans = null;

        // conservative coding
```

### UnusedAssignment
Variable `object` initializer `null` is redundant
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/LazyValueMap.java`
#### Snippet
```java
    @Override
    public final Object get(Object key) {
        Object object = null;

        /* if the map is null, then we create it. */
```

### UnusedAssignment
Variable `date` initializer `null` is redundant
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharSequenceValue.java`
#### Snippet
```java
            case STRING:
                if (checkDate) {
                    Date date = null;
                    if (Dates.isISO8601QuickCheck(buffer, startIndex, endIndex)) {
                        if (Dates.isJsonDate(buffer, startIndex, endIndex)) {
```

### UnusedAssignment
Variable `tz` initializer `null` is redundant
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/Dates.java`
#### Snippet
```java

                int second = CharScanner.parseIntFromTo(charArray, from + 17, from + 19);
                TimeZone tz = null;

                if (charArray[from + 19] == 'Z') {
```

### UnusedAssignment
Variable `list` initializer `null` is redundant
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserUsingCharacterSource.java`
#### Snippet
```java

    protected final List decodeJsonArray() {
        ArrayList<Object> list = null;

        boolean foundEnd = false;
```

### UnusedAssignment
Variable `value` initializer `null` is redundant
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserUsingCharacterSource.java`
#### Snippet
```java
        char[] chars = characterSource.findNextChar('"', '\\');

        String value = null;
        if (characterSource.hadEscape()) {
            value = builder.decodeJsonString(chars).toString();
```

### UnusedAssignment
Variable `value` initializer `null` is redundant
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserUsingCharacterSource.java`
#### Snippet
```java
    private Object decodeValue() {
        CharacterSource characterSource = this.characterSource;
        Object value = null;
        characterSource.skipWhiteSpace();

```

### UnusedAssignment
Variable `list` initializer `null` is redundant
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserCharArray.java`
#### Snippet
```java

    protected final List decodeJsonArray() {
        ArrayList<Object> list = null;

        boolean foundEnd = false;
```

### UnusedAssignment
Variable `value` initializer `null` is redundant
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserCharArray.java`
#### Snippet
```java

    private Object decodeValueInternal() {
        Object value = null;
        skipWhiteSpace();

```

### UnusedAssignment
Variable `value` initializer `null` is redundant
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserCharArray.java`
#### Snippet
```java
        index = indexHolder[0];

        String value = null;
        if (encoded) {
            index = findEndQuote(array, index);
```

### UnusedAssignment
Variable `currentChar` initializer `charArray[__index]` is redundant
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserLax.java`
#### Snippet
```java
    private Value decodeStringLax() {
        int index = __index;
        char currentChar = charArray[__index];
        final int startIndex = __index;
        boolean encoded = false;
```

### UnusedAssignment
Variable `value` initializer `null` is redundant
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharScanner.java`
#### Snippet
```java

    public static Number parseJsonNumber(char[] buffer, int from, int max, int[] size) {
        Number value = null;
        boolean simple = true;
        int digitsPastPoint = 0;
```

### UnusedAssignment
Variable `previousToken` initializer `null` is redundant
in `subprojects/groovy-json/src/main/java/groovy/json/JsonSlurperClassic.java`
#### Snippet
```java
        Map content = new HashMap();

        JsonToken previousToken = null;
        JsonToken currentToken = null;

```

### UnusedAssignment
Variable `currentToken` initializer `null` is redundant
in `subprojects/groovy-json/src/main/java/groovy/json/JsonSlurperClassic.java`
#### Snippet
```java

        JsonToken previousToken = null;
        JsonToken currentToken = null;

        for(;;) {
```

### UnusedAssignment
Variable `uri` initializer `null` is redundant
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/AbstractHttpServlet.java`
#### Snippet
```java
        //

        String uri = null;
        String info = null;

```

### UnusedAssignment
Variable `info` initializer `null` is redundant
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/AbstractHttpServlet.java`
#### Snippet
```java

        String uri = null;
        String info = null;

        //
```

### UnusedAssignment
Variable `finder` initializer `null` is redundant
in `subprojects/groovy-test/src/main/java/groovy/test/AllTestSuite.java`
#### Snippet
```java

    private static final String[] EMPTY_ARGS = new String[]{};
    private static IFileNameFinder finder = null;

    static { // this is only needed since the Groovy Build compiles *.groovy files after *.java files
```

### UnusedAssignment
Variable `rows` initializer `null` is redundant
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
     */
    public GroovyRowResult firstRow(String sql, List<Object> params) throws SQLException {
        List<GroovyRowResult> rows = null;
        try {
            rows = rows(sql, params, 1, 1, null);
```

### UnusedAssignment
Variable `rs` initializer `null` is redundant
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
    protected final ResultSet executeQuery(String sql) throws SQLException {
        AbstractQueryCommand command = createQueryCommand(sql);
        ResultSet rs = null;
        try {
            rs = command.execute();
```

### UnusedAssignment
Variable `rows` initializer `null` is redundant
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
     */
    public GroovyRowResult firstRow(String sql) throws SQLException {
        List<GroovyRowResult> rows = null;
        try {
            rows = rows(sql, 1, 1, null);
```

### UnusedAssignment
Variable `rs` initializer `null` is redundant
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
            throws SQLException {
        AbstractQueryCommand command = createPreparedQueryCommand(sql, params);
        ResultSet rs = null;
        try {
            rs = command.execute();
```

### UnusedAssignment
The value `null` assigned to `value77` is never used
in `subprojects/stress/src/stressTest/java/org/codehaus/groovy/util/ManagedConcurrentValueMapStressTest.java`
#### Snippet
```java

        // Clear hardrefs and gc()
        value77 = null;
        value1337 = null;
        valueList.clear();
```

### UnusedAssignment
The value `null` assigned to `value1337` is never used
in `subprojects/stress/src/stressTest/java/org/codehaus/groovy/util/ManagedConcurrentValueMapStressTest.java`
#### Snippet
```java
        // Clear hardrefs and gc()
        value77 = null;
        value1337 = null;
        valueList.clear();

```

### UnusedAssignment
The value `null` assigned to `gcl` is never used
in `subprojects/stress/src/stressTest/java/org/codehaus/groovy/reflection/ClassInfoLeakStressTest.java`
#### Snippet
```java
            refList.add(classRef);
            refList.add(classInfoRef);
            gcl = null;
            scriptClass = null;
            ci = null;
```

### UnusedAssignment
The value `null` assigned to `scriptClass` is never used
in `subprojects/stress/src/stressTest/java/org/codehaus/groovy/reflection/ClassInfoLeakStressTest.java`
#### Snippet
```java
            refList.add(classInfoRef);
            gcl = null;
            scriptClass = null;
            ci = null;
            GCUtils.gc();
```

### UnusedAssignment
The value `null` assigned to `ci` is never used
in `subprojects/stress/src/stressTest/java/org/codehaus/groovy/reflection/ClassInfoLeakStressTest.java`
#### Snippet
```java
            gcl = null;
            scriptClass = null;
            ci = null;
            GCUtils.gc();
        }
```

### UnusedAssignment
The value `null` assigned to `key1337` is never used
in `subprojects/stress/src/stressTest/java/org/codehaus/groovy/util/ManagedConcurrentMapStressTest.java`
#### Snippet
```java
        assertEquals("value77", map.get(key77));

        key1337 = null;
        key77 = null;

```

### UnusedAssignment
The value `null` assigned to `key77` is never used
in `subprojects/stress/src/stressTest/java/org/codehaus/groovy/util/ManagedConcurrentMapStressTest.java`
#### Snippet
```java

        key1337 = null;
        key77 = null;

        GCUtils.gc();
```

### UnusedAssignment
The value `null` assigned to `o` is never used
in `subprojects/stress/src/stressTest/java/org/codehaus/groovy/util/ManagedConcurrentLinkedQueueStressTest.java`
#### Snippet
```java
        Object o = elements.get(ENTRY_COUNT / 2);
        assertTrue("should contain an element", queue.values().contains(o));
        o = null;

        elements.remove(0);
```

## RuleId[id=SuspiciousNameCombination]
### SuspiciousNameCombination
'width' should probably not be passed as parameter 'height'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/ConsoleTextEditor.java`
#### Snippet
```java

                int width = 3 * fontSize;
                numbersPanel.setPreferredSize(new Dimension(width, width));
            }
        });
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `https`
in `src/main/java/org/apache/groovy/util/BeanUtils.java`
#### Snippet
```java
     *
     * @since 3.0.0
     * @see https://stackoverflow.com/questions/4052840/most-efficient-way-to-make-the-first-character-of-a-string-lower-case/4052914
     */
    public static String decapitalize(final String property) {
```

### JavadocReference
Symbol `extractType(GenericsType)` is inaccessible from here
in `src/main/java/org/codehaus/groovy/ast/tools/GenericsUtils.java`
#### Snippet
```java

    /**
     * @see org.codehaus.groovy.transform.stc.StaticTypeCheckingSupport#extractType(GenericsType)
     */
    private static GenericsType erasure(GenericsType gt) {
```

### JavadocReference
Cannot resolve symbol `message`
in `src/main/java/org/codehaus/groovy/control/messages/SimpleMessage.java`
#### Snippet
```java
public class SimpleMessage extends Message {

    /** used when {@link message} is an I18N identifier */
    protected Object data;
    protected String message;
```

### JavadocReference
Symbol `resolveStrategy` is inaccessible from here
in `src/main/java/groovy/lang/DelegatesTo.java`
#### Snippet
```java

    /**
     * The {@link Closure#resolveStrategy} used by the closure.
     */
    int strategy() default Closure.OWNER_FIRST;
```

### JavadocReference
Symbol `groovy.servlet.TemplateServlet` is inaccessible from here
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
 * The conference committee.
 * </pre>
 * The template engine can also be used as the engine for {@link groovy.servlet.TemplateServlet} by placing the
 * following in your <code>web.xml</code> file (plus a corresponding servlet-mapping element):
 * <pre>
```

### JavadocReference
Symbol `groovy.servlet.TemplateServlet` is inaccessible from here
in `subprojects/groovy-templates/src/main/groovy/groovy/text/SimpleTemplateEngine.java`
#### Snippet
```java
 * The conference committee.
 * </pre>
 * The template engine can also be used as the engine for {@link groovy.servlet.TemplateServlet} by placing the
 * following in your <code>web.xml</code> file (plus a corresponding servlet-mapping element):
 * <pre>
```

### JavadocReference
Symbol `groovy.servlet.TemplateServlet` is inaccessible from here
in `subprojects/groovy-templates/src/main/groovy/groovy/text/XmlTemplateEngine.java`
#### Snippet
```java
 * &lt;/document&gt;
 * </pre>
 * The XML template engine can also be used as the engine for {@link groovy.servlet.TemplateServlet} by placing the
 * following in your web.xml file (plus a corresponding servlet-mapping element):
 * <pre>
```

### JavadocReference
Symbol `groovy.servlet.TemplateServlet` is inaccessible from here
in `subprojects/groovy-templates/src/main/groovy/groovy/text/StreamingTemplateEngine.java`
#### Snippet
```java
 * <h3>StreamingTemplateEngine as a servlet engine</h3>
 * The template engine can also be used as the engine for
 * {@link groovy.servlet.TemplateServlet} by placing the following in your
 * <code>web.xml</code> file (plus a corresponding servlet-mapping element):
 * <pre>
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/antlr4/GroovyDocParser.java`
#### Snippet
```java
        ModuleNode root = unit.getAST();
        GroovydocVisitor visitor = new GroovydocVisitor(unit, packagePath, links, properties);
        root.getClasses().stream().forEach(clazz -> visitor.visitClass(clazz));
        return visitor.getGroovyClassDocs();
    }
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/generation/Configurator.java`
#### Snippet
```java
                assertionConfiguration.put(packageName, Boolean.FALSE);
            } else if (arg.startsWith(ENABLE_PACKAGE_ASSERTIONS)) {
                final String className = arg.substring(ENABLE_PACKAGE_ASSERTIONS.length(), arg.length());
                assertionConfiguration.put(className, Boolean.TRUE);

```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/generation/Configurator.java`
#### Snippet
```java

            } else if (arg.startsWith(DISABLE_PACKAGE_ASSERTIONS)) {
                final String className = arg.substring(DISABLE_PACKAGE_ASSERTIONS.length(), arg.length());

                assertionConfiguration.put(className, Boolean.FALSE);
```

### StringOperationCanBeSimplified
Unnecessary arguments
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharScanner.java`
#### Snippet
```java
                buf.addLine(new String(array, start, index));
            } catch (Exception ex2) {
                buf.addLine(new String(array, 0, array.length));
            }
        }
```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `E` hides type parameter 'E'
in `src/main/java/groovy/util/ObservableSet.java`
#### Snippet
```java
    }

    protected class ObservableIterator<E> implements Iterator<E> {
        private final Iterator<E> iterDelegate;
        private final Stack<E> stack = new Stack<E>();
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `Long.toString()` call
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/TemplateServlet.java`
#### Snippet
```java
        if (generateBy) {
            String sb = "\n<!-- Generated by Groovy TemplateServlet [create/get=" +
                    Long.toString(getMillis) +
                    " ms, make=" +
                    Long.toString(makeMillis) +
```

### UnnecessaryCallToStringValueOf
Unnecessary `Long.toString()` call
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/TemplateServlet.java`
#### Snippet
```java
                    Long.toString(getMillis) +
                    " ms, make=" +
                    Long.toString(makeMillis) +
                    " ms] -->\n";
            out.write(sb);
```

## RuleId[id=JavaReflectionMemberAccess]
### JavaReflectionMemberAccess
Cannot resolve constructor with specified argument types
in `src/main/java/org/codehaus/groovy/vmplugin/v8/Java8.java`
#### Snippet
```java
            Constructor<MethodHandles.Lookup> lookup;
            try {
                lookup = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            } catch (final NoSuchMethodException e) {
                throw new IllegalStateException("Incompatible JVM", e);
```

### JavaReflectionMemberAccess
Cannot resolve constructor with specified argument types
in `src/main/java/org/codehaus/groovy/vmplugin/v9/Java9.java`
#### Snippet
```java
            } catch (final NoSuchMethodException | RuntimeException e) { // java 8 or fallback if anything else goes wrong
                try {
                    lookup = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                    if (!lookup.isAccessible()) {
                        ReflectionUtils.trySetAccessible(lookup);
```

## RuleId[id=ObviousNullCheck]
### ObviousNullCheck
Redundant null-check: newly created object is never null
in `src/main/java/org/codehaus/groovy/transform/DelegateASTTransformation.java`
#### Snippet
```java
                    ACC_PUBLIC,
                    ClassHelper.VOID_TYPE,
                    params(new Parameter(nonGeneric(prop.getType()), "value")),
                    null,
                    assignS(propX(delegate.getOp, name), varX("value"))
```

### ObviousNullCheck
Redundant null-check: newly created object is never null
in `src/main/java/org/codehaus/groovy/transform/IndexedPropertyASTTransformation.java`
#### Snippet
```java
        BlockStatement body = new BlockStatement();
        Parameter[] theParams = params(
                new Parameter(ClassHelper.int_TYPE, "index"),
                new Parameter(componentType, "value"));
        body.addStatement(assignS(indexX(varX(fNode), varX(theParams[0])), varX(theParams[1])));
```

### ObviousNullCheck
Redundant null-check: newly created object is never null
in `src/main/java/org/codehaus/groovy/transform/ImmutableASTTransformation.java`
#### Snippet
```java
            ACC_PUBLIC | ACC_FINAL,
            cNode.getPlainNodeReference(),
            params(new Parameter(new ClassNode(Map.class), "map")),
            null,
            body);
```

### ObviousNullCheck
Redundant null-check: newly created object is never null
in `src/main/java/org/codehaus/groovy/transform/TupleConstructorASTTransformation.java`
#### Snippet
```java

    public static void addSpecialMapConstructors(final int modifiers, final ClassNode cNode, final String message, final boolean addNoArg) {
        Parameter[] parameters = params(new Parameter(LHMAP_TYPE, NAMED_ARGS));
        BlockStatement code = new BlockStatement();
        VariableExpression namedArgs = varX(NAMED_ARGS);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/groovy/groovy/beans/ListenerListASTTransformation.groovy`
#### Snippet
```java
        def methodModifiers = synchronize ? ACC_PUBLIC | ACC_SYNCHRONIZED : ACC_PUBLIC
        def methodReturnType = ClassHelper.make(Void.TYPE)
        def methodName = "add${name.capitalize()}"
        def cn = ClassHelper.makeWithoutCaching(listener.name)
        cn.redirect = listener
        def methodParameter = [param(cn, 'listener')] as Parameter[]

        if (declaringClass.hasMethod(methodName, methodParameter)) {
            addError node, source, "Conflict using @${MY_CLASS.name}. Class $declaringClass.name already has method $methodName"
            return
        }

        BlockStatement block = new BlockStatement()
```

### DuplicatedCode
Duplicated code
in `src/main/groovy/groovy/cli/internal/CliBuilderInternal.groovy`
#### Snippet
```java
    public <T> TypedOption<T> option(Map args, Class<T> type, String description) {
        def name = args.opt ?: '_'
        args.type = type
        args.remove('opt')
        "$name"(args, description)
    }
```

### DuplicatedCode
Duplicated code
in `src/main/groovy/groovy/cli/internal/CliBuilderInternal.groovy`
#### Snippet
```java
            if (args.size() == 2 && args[0] instanceof Map) {
                Map m = args[0] as Map
                if (m.type && !(m.type instanceof Class)) {
                    throw new CliBuilderException("'type' must be a Class")
                }
                def option = option(name, m, args[1])
                commandSpec.addOption(option)
                return create(option, m.type, option.defaultValue(), option.converters())
            }
```

### DuplicatedCode
Duplicated code
in `src/main/groovy/groovy/cli/internal/CliBuilderInternal.groovy`
#### Snippet
```java
        String opt = o.names().sort { a, b -> a.length() - b.length() }.first()
        opt = opt?.length() == 2 ? opt.substring(1) : null

        String longOpt = o.names().sort { a, b -> b.length() - a.length() }.first()
        longOpt = longOpt?.startsWith("--") ? longOpt.substring(2) : null

        Map<String, Object> result = new TypedOption<Object>()
        if (opt != null) result.put("opt", opt)
        result.put("longOpt", longOpt)
        result.put("cliOption", o)
        if (defaultValue) {
            result.put("defaultValue", defaultValue)
        }
        if (convert) {
            if (theType) {
                throw new CliBuilderException("You can't specify 'type' when using 'convert'")
            }
            result.put("convert", convert)
            result.put("type", convert instanceof Class ? convert : convert.getClass())
        } else {
            result.put("type", theType)
        }
        savedTypeOptions[longOpt ?: opt] = result
        result
```

### DuplicatedCode
Duplicated code
in `src/main/groovy/groovy/cli/internal/CliBuilderInternal.groovy`
#### Snippet
```java
    OptionAccessor parse(args) {
        CommandLine commandLine = createCommandLine()
        try {
            def accessor = new OptionAccessor(commandLine.parseArgs(args as String[]))
            accessor.savedTypeOptions = savedTypeOptions
            return accessor
        } catch (CommandLine.ParameterException pe) {
            errorWriter.println("error: " + pe.message)
            printUsage(pe.commandLine, errorWriter)
            return null
        }
    }
```

### DuplicatedCode
Duplicated code
in `src/main/groovy/groovy/cli/internal/CliBuilderInternal.groovy`
#### Snippet
```java
        commons2picocli(shortname, details).each { key, value ->
            if (builder.hasProperty(key)) {
                builder[key] = value
            } else if (key != 'opt') {    // GROOVY-8607 ignore opt since we already have that
                builder.invokeMethod(key, value)
            }
        }
        if (!builder.type() && !builder.arity() && builder.converters()?.length > 0) {
            builder.arity("1").type(details.convert ? Object : String[])
        }
        return builder.build()
```

### DuplicatedCode
Duplicated code
in `src/main/groovy/groovy/cli/internal/OptionAccessor.groovy`
#### Snippet
```java
/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-cli-commons/src/main/groovy/groovy/cli/commons/OptionAccessor.groovy`
#### Snippet
```java
    public <T> T defaultValue(String name) {
        Class<T> type = savedTypeOptions[name]?.type
        String value = savedTypeOptions[name]?.defaultValue() ? savedTypeOptions[name].defaultValue() : null
        return (T) value ? getTypedValue(type, name, value) : null
    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/groovy/grape/GrabAnnotationTransformation.java`
#### Snippet
```java
            String name = annotation.getClassNode().getName();
            if ((GRAB_CLASS_NAME.equals(name))
                    || (allowShortGrab && GRAB_SHORT_NAME.equals(name))
                    || (grabAliases.contains(name))) {
                grabAnnotations.add(annotation);
            }
            if ((GRABEXCLUDE_CLASS_NAME.equals(name))
                    || (allowShortGrabExcludes && GRABEXCLUDE_SHORT_NAME.equals(name))
                    || (grabExcludeAliases.contains(name))) {
                grabExcludeAnnotations.add(annotation);
            }
            if ((GRABCONFIG_CLASS_NAME.equals(name))
                    || (allowShortGrabConfig && GRABCONFIG_SHORT_NAME.equals(name))
                    || (grabConfigAliases.contains(name))) {
                grabConfigAnnotations.add(annotation);
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/groovy/lang/ObjectRange.java`
#### Snippet
```java
        Comparable value = iter.next();
        for (int i = 0; i < index; i++) {
            if (!iter.hasNext()) {
                throw new IndexOutOfBoundsException("Index: " + index + " is too big for range: " + this);
            }
            value = iter.next();
        }
        return value;
```

### DuplicatedCode
Duplicated code
in `src/main/java/groovy/lang/NumberRange.java`
#### Snippet
```java
        if (fromIndex < 0) {
            throw new IndexOutOfBoundsException("fromIndex = " + fromIndex);
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException("fromIndex(" + fromIndex + ") > toIndex(" + toIndex + ")");
        }
        if (fromIndex == toIndex) {
            return new EmptyRange<Comparable>(from);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/groovy/lang/ObjectRange.java`
#### Snippet
```java
        Comparable toValue = iter.next();
        int i = 0;
        for (; i < fromIndex; i++) {
            if (!iter.hasNext()) {
                throw new IndexOutOfBoundsException("Index: " + i + " is too big for range: " + this);
            }
            toValue = iter.next();
        }
        final Comparable fromValue = toValue;
        for (; i < toIndex - 1; i++) {
            if (!iter.hasNext()) {
                throw new IndexOutOfBoundsException("Index: " + i + " is too big for range: " + this);
            }
            toValue = iter.next();
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/groovy/lang/NumberRange.java`
#### Snippet
```java
        int i = 0;
        for (; i < fromIndex; i++) {
            if (!iter.hasNext()) {
                throw new IndexOutOfBoundsException("Index: " + i + " is too big for range: " + this);
            }
            value = iter.next();
        }
        final Comparable fromValue = value;
        for (; i < toIndex - 1; i++) {
            if (!iter.hasNext()) {
                throw new IndexOutOfBoundsException("Index: " + i + " is too big for range: " + this);
            }
            value = iter.next();
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/groovy/time/DatumDependentDuration.java`
#### Snippet
```java
        cal.add(Calendar.DAY_OF_YEAR, -this.getDays());
        cal.add(Calendar.HOUR_OF_DAY, -this.getHours());
        cal.add(Calendar.MINUTE, -this.getMinutes());
        cal.add(Calendar.SECOND, -this.getSeconds());
        cal.add(Calendar.MILLISECOND, -this.getMillis());

        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        return new Date(cal.getTimeInMillis());
```

### DuplicatedCode
Duplicated code
in `src/main/java/groovy/time/Duration.java`
#### Snippet
```java
        final Calendar cal = Calendar.getInstance();

        cal.add(Calendar.DAY_OF_YEAR, -this.getDays());
        cal.add(Calendar.HOUR_OF_DAY, -this.getHours());
        cal.add(Calendar.MINUTE, -this.getMinutes());
        cal.add(Calendar.SECOND, -this.getSeconds());
        cal.add(Calendar.MILLISECOND, -this.getMillis());
```

### DuplicatedCode
Duplicated code
in `src/main/java/groovy/transform/builder/DefaultStrategy.java`
#### Snippet
```java
        List<String> excludes = new ArrayList<String>();
        List<String> includes = new ArrayList<String>();
        includes.add(Undefined.STRING);
        if (!getIncludeExclude(transform, anno, buildee, excludes, includes)) return;
        if (includes.size() == 1 && Undefined.isUndefined(includes.get(0))) includes = null;
```

### DuplicatedCode
Duplicated code
in `src/main/java/groovy/transform/builder/InitializerStrategy.java`
#### Snippet
```java
        List<String> excludes = new ArrayList<>();
        List<String> includes = new ArrayList<>();
        includes.add(Undefined.STRING);
        if (!getIncludeExclude(transform, anno, buildee, excludes, includes)) return;
        if (includes.size() == 1 && Undefined.isUndefined(includes.get(0))) includes = null;
```

### DuplicatedCode
Duplicated code
in `src/main/java/groovy/transform/builder/InitializerStrategy.java`
#### Snippet
```java
        ClassNode paramType = makeClassSafeWithGenerics(builder, setGenTypes(fields.size()));
        List<Expression> argsList = new ArrayList<>();
        Parameter initParam = param(paramType, "initializer");
        for (FieldNode fieldNode : fields) {
            argsList.add(propX(varX(initParam), fieldNode.getName()));
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/groovy/util/FactoryBuilderSupport.java`
#### Snippet
```java
        try {
            return delegate.invokeMethod(object, methodName, arguments);
        } catch (MissingMethodException mme) {
            // attempt builder resolution
            try {
                if (builder.getMetaClass().respondsTo(builder, methodName).isEmpty()) {
                    // dispatch to factories if it is not a literal method
                    return builder.invokeMethod(methodName, arguments);
                } else {
                    return InvokerHelper.invokeMethod(builder, methodName, arguments);
                }
            } catch (MissingMethodException mme2) {
                // chain secondary exception
                Throwable root = mme;
                while (root.getCause() != null) {
                    root = root.getCause();
                }
                root.initCause(mme2);
                // throw original
                throw mme;
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
                String childText = null;
                if (child instanceof String) {
                    childText = (String) child;
                } else if (child instanceof Node) {
                    childText = ((Node) child).text();
                }
                if (childText != null) {
                    if (previousText == null) {
                        previousText = childText;
                    } else {
                        if (sb == null) {
                            sb = new StringBuilder();
                            sb.append(previousText);
                        }
                        sb.append(childText);
                    }
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
                if (child instanceof Node) {
                    Node childNode = (Node) child;
                    List children = childNode.getDirectChildren();
                    if (children.size() > 1 || (children.size() == 1 && !(children.get(0) instanceof String))) nextLevelChildren.addAll(preorder ? children : DefaultGroovyMethods.reverse(children));
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
        for (Object element : c) {
            if (delegateSet.contains(element)) {
                values.add(element);
            }
        }

        int oldSize = size();
        boolean success = delegate.removeAll(c);
        if (success && !values.isEmpty()) {
            fireMultiElementRemovedEvent(values);
            fireSizeChangedEvent(oldSize, size());
        }

        return success;
```

### DuplicatedCode
Duplicated code
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
        if (c == null) {
            return false;
        }

        List values = new ArrayList();
        // GROOVY-7783 use Set for O(1) performance for contains
        if (!(c instanceof Set)) {
            c = new HashSet<Object>(c);
        }
        for (Object element : delegate) {
            if (!c.contains(element)) {
                values.add(element);
            }
        }

        int oldSize = size();
        boolean success = delegate.retainAll(c);
        if (success && !values.isEmpty()) {
            fireMultiElementRemovedEvent(values);
            fireSizeChangedEvent(oldSize, size());
        }

        return success;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/groovy/ast/tools/ExpressionUtils.java`
#### Snippet
```java
                        if (ClassHelper.isWrapperByte(wrapperType)) {
                            return configure(be, new ConstantExpression(result.byteValue(), true));
                        }
                        if (ClassHelper.isWrapperLong(wrapperType)) {
                            return configure(be, new ConstantExpression(result.longValue(), true));
                        }
                        if (ClassHelper.isWrapperShort(wrapperType)) {
                            return configure(be, new ConstantExpression(result.shortValue(), true));
                        }
                        if (ClassHelper.isWrapperFloat(wrapperType)) {
                            return configure(be, new ConstantExpression(result.floatValue(), true));
                        }
                        if (ClassHelper.isWrapperDouble(wrapperType)) {
                            return configure(be, new ConstantExpression(result.doubleValue(), true));
                        }
                        if (ClassHelper.isWrapperCharacter(wrapperType)) {
                            return configure(be, new ConstantExpression((char) result.intValue(), true));
                        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/groovy/ast/tools/ImmutablePropertyUtils.java`
#### Snippet
```java
        List<AnnotationNode> annotations = cNode.getAnnotations(ImmutablePropertyUtils.IMMUTABLE_OPTIONS_TYPE);
        AnnotationNode anno = annotations.isEmpty() ? null : annotations.get(0);
        final List<String> immutables = new ArrayList<String>();
        if (anno == null) return immutables;

        final Expression expression = anno.getMember(MEMBER_KNOWN_IMMUTABLES);
        if (expression == null) return immutables;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
        checkNotNull(value);

        final int weight = weigher.weightOf(key, value);
        final WeightedValue<V> weightedValue = new WeightedValue<>(value, weight);
        final Node<K, V> node = new Node<>(key, weightedValue);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
      for (;;) {
        final WeightedValue<V> oldWeightedValue = prior.get();
        if (!oldWeightedValue.isAlive()) {
          break;
        }

        if (prior.compareAndSet(oldWeightedValue, weightedValue)) {
          final int weightedDifference = weight - oldWeightedValue.weight;
          if (weightedDifference == 0) {
            afterRead(prior);
          } else {
            afterWrite(new UpdateTask(prior, weightedDifference));
          }
          return oldWeightedValue.value;
        }
      }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
      if (node.compareAndSet(oldWeightedValue, weightedValue)) {
        final int weightedDifference = weight - oldWeightedValue.weight;
        if (weightedDifference == 0) {
          afterRead(node);
        } else {
          afterWrite(new UpdateTask(node, weightedDifference));
        }
        return oldWeightedValue.value;
      }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
    checkNotNull(key);
    checkNotNull(value);

    final int weight = weigher.weightOf(key, value);
    final WeightedValue<V> weightedValue = new WeightedValue<>(value, weight);

    final Node<K, V> node = data.get(key);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/ast/expr/AttributeExpression.java`
#### Snippet
```java
        ret.setImplicitThis(this.isImplicitThis());
        ret.setSpreadSafe(this.isSpreadSafe());
        ret.setStatic(this.isStatic());
        ret.setType(this.getType());
        ret.setSourcePosition(this);
        ret.copyNodeMetaData(this);
        return ret;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/classgen/asm/BinaryExpressionHelper.java`
#### Snippet
```java
        AsmClassGenerator acg = controller.getAcg();
        MethodVisitor mv = controller.getMethodVisitor();
        OperandStack operandStack = controller.getOperandStack();

        expression.getLeftExpression().visit(acg);
        operandStack.doGroovyCast(ClassHelper.boolean_TYPE);
        Label falseCase = operandStack.jump(IFEQ);

        expression.getRightExpression().visit(acg);
        operandStack.doGroovyCast(ClassHelper.boolean_TYPE);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/classgen/asm/BinaryExpressionHelper.java`
#### Snippet
```java
        Expression truePart = expression.getTrueExpression();
        Expression falsePart = expression.getFalseExpression();

        TypeChooser typeChooser = controller.getTypeChooser();
        ClassNode truePartType = typeChooser.resolveType(truePart, controller.getClassNode());
        ClassNode falsePartType = typeChooser.resolveType(falsePart, controller.getClassNode());
        ClassNode commonType = WideningCategories.lowestUpperBound(truePartType, falsePartType);

        // write "x?:y" as "boolean(x)?T(x):T(y)" where T is common type of x and y
        OperandStack operandStack = controller.getOperandStack();
        MethodVisitor mv = controller.getMethodVisitor();

        // load x, dup it and cast to boolean
        truePart.visit(controller.getAcg());
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/classgen/asm/BinaryExpressionWriter.java`
#### Snippet
```java
            Label l1 = new Label();
            mv.visitJumpInsn(bytecode,l1);
            mv.visitInsn(ICONST_1);
            Label l2 = new Label();
            mv.visitJumpInsn(GOTO, l2);
            mv.visitLabel(l1);
            mv.visitInsn(ICONST_0);
            mv.visitLabel(l2);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/classgen/asm/BytecodeHelper.java`
#### Snippet
```java
        Label trueLabel = new Label();
        Label falseLabel = new Label();
        Label falseLabelWithPop = new Label();
        mv.visitInsn(DUP2); // will need the extra for isNaN call if required
        mv.visitInsn(DCONST_0);
        mv.visitInsn(DCMPL);
        mv.visitJumpInsn(IFEQ, falseLabelWithPop);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/classgen/asm/BytecodeHelper.java`
#### Snippet
```java
        mv.visitJumpInsn(IFNE, falseLabel);
        mv.visitInsn(ICONST_1);
        mv.visitJumpInsn(GOTO, trueLabel);
        mv.visitLabel(falseLabelWithPop);
        mv.visitInsn(POP2);
        mv.visitLabel(falseLabel);
        mv.visitInsn(ICONST_0);
        mv.visitLabel(trueLabel);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/classgen/asm/OptimizingStatementWriter.java`
#### Snippet
```java
                        if (isLongCategory(leftType) && isLongCategory(rightType)) {
                            resultType = BigDecimal_TYPE;
                            opt.chainShouldOptimize(true);
                        } else if (isBigDecCategory(leftType) && isBigDecCategory(rightType)) {
                            // no optimization for BigDecimal yet
                            //resultType = BigDecimal_TYPE;
                        } else if (isDoubleCategory(leftType) && isDoubleCategory(rightType)) {
                            resultType = double_TYPE;
                            opt.chainShouldOptimize(true);
                        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/classgen/asm/sc/StaticInvocationWriter.java`
#### Snippet
```java
                    ClassNode current = thisClass.getOuterClass();
                    fixedReceiver = varX("thisObject", current);
                    // adjust for multiple levels of nesting if needed
                    while (current.getOuterClass() != null && !lookupClassNode.equals(current)) {
                        FieldNode thisField = current.getField("this$0");
                        current = current.getOuterClass();
                        if (thisField != null) {
                            fixedReceiver = propX(fixedReceiver, "this$0");
                            fixedReceiver.setType(current);
                        }
                    }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/control/LabelVerifier.java`
#### Snippet
```java
        if (label != null) {
            boolean found = false;
            for (String element : visitedLabels) {
                if (element.equals(label)) {
                    found = true;
                    break;
                }
            }
            if (!found) breakLabels.add(statement);
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/control/ResolveVisitor.java`
#### Snippet
```java
        MethodCallExpression ret = new MethodCallExpression(object, method, args);
        ret.setGenericsTypes(mce.getGenericsTypes());
        ret.setMethodTarget(mce.getMethodTarget());
        ret.setImplicitThis(mce.isImplicitThis());
        ret.setSpreadSafe(mce.isSpreadSafe());
        ret.setSafe(mce.isSafe());
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/reflection/CachedMethod.java`
#### Snippet
```java
        int pd = params.length - otherParams.length;
        if (pd != 0)
            return pd;

        for (int i = 0, n = params.length; i < n; i += 1) {
            final int nameComp = params[i].getName().compareTo(otherParams[i].getName());
            if (nameComp != 0)
                return nameComp;
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/runtime/IOGroovyMethods.java`
#### Snippet
```java
        Throwable thrown = null;
        try {
            return action.call(self);
        } catch (Throwable e) {
            thrown = e;
            throw e;
        } finally {
            if (thrown != null) {
                Throwable suppressed = tryClose(self, true);
                if (suppressed != null) {
                    thrown.addSuppressed(suppressed);
                }
            } else {
                self.close();
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/runtime/ProcessGroovyMethods.java`
#### Snippet
```java
        Thread tout = consumeProcessOutputStream(self, output);
        Thread terr = consumeProcessErrorStream(self, error);
        boolean interrupted = false;
        try {
            try { tout.join(); } catch (InterruptedException ignore) { interrupted = true; }
            try { terr.join(); } catch (InterruptedException ignore) { interrupted = true; }
            try { self.waitFor(); } catch (InterruptedException ignore) { interrupted = true; }
            closeStreams(self);
        } finally {
            if (interrupted) Thread.currentThread().interrupt();
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
                if (leftClass == Long.class) {
                    return (Long) left < (Long) right;
                }
                if (leftClass == Double.class) {
                    return (Double) left < (Double) right;
                }
                if (leftClass == Float.class) {
                    return (Float) left < (Float) right;
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
                if (leftClass == Long.class) {
                    return (Long) left <= (Long) right;
                }
                if (leftClass == Double.class) {
                    return (Double) left <= (Double) right;
                }
                if (leftClass == Float.class) {
                    return (Float) left <= (Float) right;
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/runtime/callsite/GetEffectivePogoPropertySite.java`
#### Snippet
```java
        if (GroovyCategorySupport.hasCategoryInCurrentThread() || !(receiver instanceof GroovyObject) || ((GroovyObject) receiver).getMetaClass() != metaClass) {
            return createGetPropertySite(receiver).getProperty(receiver);
        } else {
            try {
                return effective.getProperty(receiver);
            } catch (GroovyRuntimeException gre) {
                throw ScriptBytecodeAdapter.unwrap(gre);
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
            e.value = null;
            count--;

            Entry head = e.next;
            for (Entry p = first; p != e; p = p.next) 
              head = new Entry(p.hash, p.key, p.value, head);

            tab[index] = head;
            recordModification(head);
            return oldValue;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/runtime/metaclass/MetaMethodIndex.java`
#### Snippet
```java
            {
                Entry[] t = table;
                int i = t.length;
                Entry n = null;
                if (size != 0) { // advance to first entry
                    while (i > 0 && (n = t[--i]) == null) {
                    }
                }
                next = n;
                index = i;
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/syntax/Types.java`
#### Snippet
```java
                switch (specific) {
                    case REGEX_PATTERN:
                    case NOT:
                    case PREFIX_PLUS:
                    case PREFIX_PLUS_PLUS:
                    case PREFIX_MINUS:
                    case PREFIX_MINUS_MINUS:
                    case SYNTH_CAST:
                        return true;
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/syntax/Types.java`
#### Snippet
```java
                switch (specific) {
                    case LEFT_CURLY_BRACE:
                    case RIGHT_CURLY_BRACE:
                    case LEFT_SQUARE_BRACKET:
                    case RIGHT_SQUARE_BRACKET:
                    case LEFT_PARENTHESIS:
                    case RIGHT_PARENTHESIS:
                        return true;
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/tools/DgmConverter.java`
#### Snippet
```java
        mv.visitMethodInsn(INVOKESTATIC, BytecodeHelper.getClassInternalName(method.getDeclaringClass().getTheClass()), method.getName(), methodDescriptor, false);
        BytecodeHelper.box(mv, returnType);
        if (method.getReturnType() == void.class) {
            mv.visitInsn(ACONST_NULL);
        }
        mv.visitInsn(ARETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/transform/AutoCloneASTTransformation.java`
#### Snippet
```java
            List<String> excludes = getMemberStringList(anno, "excludes");
            if (!checkPropertyList(cNode, excludes, "excludes", anno, MY_TYPE_NAME, includeFields)) return;
            List<FieldNode> list = getInstancePropertyFields(cNode);
            if (includeFields) {
                list.addAll(getInstanceNonPropertyFields(cNode));
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/transform/AutoCloneASTTransformation.java`
#### Snippet
```java
                Statement assignDirect = assignS(to, direct);
                Statement assignCloned = assignS(to, castX(fieldType, callCloneDirectX(direct)));
                Statement assignClonedDynamic = assignS(to, castX(fieldType, callCloneDynamicX(direct)));
                if (isCloneableType(fieldType)) {
                    initBody.addStatement(assignCloned);
                } else if (!possiblyCloneable(fieldType)) {
                    initBody.addStatement(assignDirect);
                } else {
                    initBody.addStatement(ifElseS(isInstanceOfX(direct, CLONEABLE_TYPE), assignClonedDynamic, assignDirect));
                }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/transform/EqualsAndHashCodeASTTransformation.java`
#### Snippet
```java
        boolean hasExistingHashCode = hasDeclaredMethod(cNode, HASH_CODE, 0);
        if (hasExistingHashCode) {
            // no point in the private method if one with that name already exists
            if (hasDeclaredMethod(cNode, UNDER_HASH_CODE, 0)) return;
            // an existing generated method also takes precedence
            MethodNode hashCode = cNode.getDeclaredMethod(HASH_CODE, Parameter.EMPTY_ARRAY);
            if (AnnotatedNodeUtils.isGenerated(hashCode)) return;
        }

        final BlockStatement body = new BlockStatement();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/transform/EqualsAndHashCodeASTTransformation.java`
#### Snippet
```java
        final Set<String> names = new HashSet<>();
        final List<PropertyNode> pList = getAllProperties(names, cNode, true, false, allProperties, false, false, false);
        final List<FieldNode> fList = new ArrayList<>();
        if (includeFields) {
            fList.addAll(getInstanceNonPropertyFields(cNode));
        }
        final BlockStatement body = new BlockStatement();
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/transform/FieldASTTransformation.java`
#### Snippet
```java
        sourceUnit = source;
        if (nodes.length != 2 || !(nodes[0] instanceof AnnotationNode) || !(nodes[1] instanceof AnnotatedNode)) {
            throw new GroovyBugError("Internal error: expecting [AnnotationNode, AnnotatedNode] but got: " + Arrays.asList(nodes));
        }

        AnnotatedNode parent = (AnnotatedNode) nodes[1];
        AnnotationNode node = (AnnotationNode) nodes[0];
        if (!MY_TYPE.equals(node.getClassNode())) return;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/transform/MapConstructorASTTransformation.java`
#### Snippet
```java
            Expression pre = anno.getMember("pre");
            if (pre != null && !(pre instanceof ClosureExpression)) {
                addError("Expected closure value for annotation parameter 'pre'. Found " + pre, cNode);
                return;
            }
            Expression post = anno.getMember("post");
            if (post != null && !(post instanceof ClosureExpression)) {
                addError("Expected closure value for annotation parameter 'post'. Found " + post, cNode);
                return;
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/transform/NewifyASTTransformation.java`
#### Snippet
```java
        final ListExpression oldClassesToNewify = classesToNewify;
        final boolean oldAuto = auto;
        final Pattern oldCnPattern = classNamePattern;

        classesToNewify = list;
        auto = autoFlag;
        classNamePattern = cnPattern;

        super.visitClass(cNode);

        classesToNewify = oldClassesToNewify;
        auto = oldAuto;
        classNamePattern = oldCnPattern;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/transform/tailrec/TailRecursiveASTTransformation.java`
#### Snippet
```java
                if (!(statement instanceof ReturnStatement)) {
                    return false;
                }

                Expression inner = ((ReturnStatement) statement).getExpression();
                if (!(inner instanceof MethodCallExpression) && !(inner instanceof StaticMethodCallExpression)) {
                    return false;
                }

                return isRecursiveIn(inner, method);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/util/SingleKeyHashMap.java`
#### Snippet
```java
      final ComplexKeyHashMap.Entry[] t = table;
      final int index = h & (t.length - 1);
    ComplexKeyHashMap.Entry e = t[index];
    for (; e != null; e = e.next)
        if (e.hash == h && ((Entry) e).key.equals(key))
          return (Entry) e;

      Entry entry = new Entry();
      entry.next = t [index];
      entry.hash = h;
      entry.key = key;
      t[index] = entry;

    if ( ++size == threshold )
      resize(2* t.length);

    return entry;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/codehaus/groovy/util/SingleKeyHashMap.java`
#### Snippet
```java
        ComplexKeyHashMap.Entry e = t[index];
        for (; e != null; e = e.next)
            if (e.hash == h && ((Entry) e).key.equals(key))
              return (Entry) e;

          Entry entry = new Entry();
          entry.next = t [index];
          entry.hash = h;
          entry.key = key;
          t[index] = entry;

        if ( ++size == threshold )
          resize(2* t.length);

        return entry;
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/CompileTaskSupport.java`
#### Snippet
```java
        if (src == null) {
            throw new BuildException("Missing attribute: srcdir (or one or more nested <src> elements).", getLocation());
        }

        if (destdir == null) {
            throw new BuildException("Missing attribute: destdir", getLocation());
        }

        if (!destdir.exists()) {
            throw new BuildException("Destination directory does not exist: " + destdir, getLocation());
        }
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-cli-picocli/src/main/groovy/groovy/cli/picocli/CliBuilder.groovy`
#### Snippet
```java
        builder.getter(attr.getter)
        builder.setter(attr.setter)
        builder.hasInitialValue(attr.hasInitialValue)
        if (arity.max == 0 && attr.type.simpleName.toLowerCase() == 'boolean' && !attr.initialValue) {
            attr.initialValue = false
        }
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/AstBrowser.groovy`
#### Snippet
```java
                def table = e.source
                int r = table.rowAtPoint(e.point)
                if (r >= 0 && r < table.rowCount) {
                    table.setRowSelectionInterval(r, r)
                } else {
                    table.clearSelection()
                }

                if (table.selectedRow < 0) return
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/Console.groovy`
#### Snippet
```java
        OptionAccessor options = cli.parse(args)

        if (options == null) {
            // CliBuilder prints error, but does not exit
            System.exit(22) // Invalid Args
        }

        if (options.h) {
            cli.usage()
            System.exit(0)
        }

        if (options.V) {
            System.out.println(messages.format('cli.info.version', GroovySystem.version))
            System.exit(0)
        }
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-datetime/src/main/java/org/apache/groovy/datetime/extensions/DateTimeExtensions.java`
#### Snippet
```java
        cal.set(Calendar.DATE, self.getDayOfMonth());
        cal.set(Calendar.MONTH, self.getMonthValue() - 1);
        cal.set(Calendar.YEAR, self.getYear());
        cal.set(Calendar.HOUR_OF_DAY, self.getHour());
        cal.set(Calendar.MINUTE, self.getMinute());
        cal.set(Calendar.SECOND, self.getSecond());
        cal.set(Calendar.MILLISECOND, millisFromNanos(self.getNano()));
        return cal;
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-docgenerator/src/main/resources/org/apache/groovy/docgenerator/stylesheet.css`
#### Snippet
```java
@media (min-width: 768px) {
    .container {
        max-width: 750px
    }

    .col-sm-1, .col-sm-2, .col-sm-3, .col-sm-4, .col-sm-5, .col-sm-6, .col-sm-7, .col-sm-8, .col-sm-9, .col-sm-10, .col-sm-11 {
        float: left
    }

    .col-sm-1 {
        width: 8.333333333333332%
    }

    .col-sm-2 {
        width: 16.666666666666664%
    }

    .col-sm-3 {
        width: 25%
    }

    .col-sm-4 {
        width: 33.33333333333333%
    }

    .col-sm-5 {
        width: 41.66666666666667%
    }

    .col-sm-6 {
        width: 50%
    }

    .col-sm-7 {
        width: 58.333333333333336%
    }

    .col-sm-8 {
        width: 66.66666666666666%
    }

    .col-sm-9 {
        width: 75%
    }

    .col-sm-10 {
        width: 83.33333333333334%
    }

    .col-sm-11 {
        width: 91.66666666666666%
    }

    .col-sm-12 {
        width: 100%
    }

    .col-sm-push-1 {
        left: 8.333333333333332%
    }

    .col-sm-push-2 {
        left: 16.666666666666664%
    }

    .col-sm-push-3 {
        left: 25%
    }

    .col-sm-push-4 {
        left: 33.33333333333333%
    }

    .col-sm-push-5 {
        left: 41.66666666666667%
    }

    .col-sm-push-6 {
        left: 50%
    }

    .col-sm-push-7 {
        left: 58.333333333333336%
    }

    .col-sm-push-8 {
        left: 66.66666666666666%
    }

    .col-sm-push-9 {
        left: 75%
    }

    .col-sm-push-10 {
        left: 83.33333333333334%
    }

    .col-sm-push-11 {
        left: 91.66666666666666%
    }

    .col-sm-pull-1 {
        right: 8.333333333333332%
    }

    .col-sm-pull-2 {
        right: 16.666666666666664%
    }

    .col-sm-pull-3 {
        right: 25%
    }

    .col-sm-pull-4 {
        right: 33.33333333333333%
    }

    .col-sm-pull-5 {
        right: 41.66666666666667%
    }

    .col-sm-pull-6 {
        right: 50%
    }

    .col-sm-pull-7 {
        right: 58.333333333333336%
    }

    .col-sm-pull-8 {
        right: 66.66666666666666%
    }

    .col-sm-pull-9 {
        right: 75%
    }

    .col-sm-pull-10 {
        right: 83.33333333333334%
    }

    .col-sm-pull-11 {
        right: 91.66666666666666%
    }

    .col-sm-offset-1 {
        margin-left: 8.333333333333332%
    }

    .col-sm-offset-2 {
        margin-left: 16.666666666666664%
    }

    .col-sm-offset-3 {
        margin-left: 25%
    }

    .col-sm-offset-4 {
        margin-left: 33.33333333333333%
    }

    .col-sm-offset-5 {
        margin-left: 41.66666666666667%
    }

    .col-sm-offset-6 {
        margin-left: 50%
    }

    .col-sm-offset-7 {
        margin-left: 58.333333333333336%
    }

    .col-sm-offset-8 {
        margin-left: 66.66666666666666%
    }

    .col-sm-offset-9 {
        margin-left: 75%
    }

    .col-sm-offset-10 {
        margin-left: 83.33333333333334%
    }

    .col-sm-offset-11 {
        margin-left: 91.66666666666666%
    }
}
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-docgenerator/src/main/resources/org/apache/groovy/docgenerator/stylesheet.css`
#### Snippet
```java
@media (min-width: 992px) {
    .container {
        max-width: 970px
    }

    .col-md-1, .col-md-2, .col-md-3, .col-md-4, .col-md-5, .col-md-6, .col-md-7, .col-md-8, .col-md-9, .col-md-10, .col-md-11 {
        float: left
    }

    .col-md-1 {
        width: 8.333333333333332%
    }

    .col-md-2 {
        width: 16.666666666666664%
    }

    .col-md-3 {
        width: 25%
    }

    .col-md-4 {
        width: 33.33333333333333%
    }

    .col-md-5 {
        width: 41.66666666666667%
    }

    .col-md-6 {
        width: 50%
    }

    .col-md-7 {
        width: 58.333333333333336%
    }

    .col-md-8 {
        width: 66.66666666666666%
    }

    .col-md-9 {
        width: 75%
    }

    .col-md-10 {
        width: 83.33333333333334%
    }

    .col-md-11 {
        width: 91.66666666666666%
    }

    .col-md-12 {
        width: 100%
    }

    .col-md-push-0 {
        left: auto
    }

    .col-md-push-1 {
        left: 8.333333333333332%
    }

    .col-md-push-2 {
        left: 16.666666666666664%
    }

    .col-md-push-3 {
        left: 25%
    }

    .col-md-push-4 {
        left: 33.33333333333333%
    }

    .col-md-push-5 {
        left: 41.66666666666667%
    }

    .col-md-push-6 {
        left: 50%
    }

    .col-md-push-7 {
        left: 58.333333333333336%
    }

    .col-md-push-8 {
        left: 66.66666666666666%
    }

    .col-md-push-9 {
        left: 75%
    }

    .col-md-push-10 {
        left: 83.33333333333334%
    }

    .col-md-push-11 {
        left: 91.66666666666666%
    }

    .col-md-pull-0 {
        right: auto
    }

    .col-md-pull-1 {
        right: 8.333333333333332%
    }

    .col-md-pull-2 {
        right: 16.666666666666664%
    }

    .col-md-pull-3 {
        right: 25%
    }

    .col-md-pull-4 {
        right: 33.33333333333333%
    }

    .col-md-pull-5 {
        right: 41.66666666666667%
    }

    .col-md-pull-6 {
        right: 50%
    }

    .col-md-pull-7 {
        right: 58.333333333333336%
    }

    .col-md-pull-8 {
        right: 66.66666666666666%
    }

    .col-md-pull-9 {
        right: 75%
    }

    .col-md-pull-10 {
        right: 83.33333333333334%
    }

    .col-md-pull-11 {
        right: 91.66666666666666%
    }

    .col-md-offset-0 {
        margin-left: 0
    }

    .col-md-offset-1 {
        margin-left: 8.333333333333332%
    }

    .col-md-offset-2 {
        margin-left: 16.666666666666664%
    }

    .col-md-offset-3 {
        margin-left: 25%
    }

    .col-md-offset-4 {
        margin-left: 33.33333333333333%
    }

    .col-md-offset-5 {
        margin-left: 41.66666666666667%
    }

    .col-md-offset-6 {
        margin-left: 50%
    }

    .col-md-offset-7 {
        margin-left: 58.333333333333336%
    }

    .col-md-offset-8 {
        margin-left: 66.66666666666666%
    }

    .col-md-offset-9 {
        margin-left: 75%
    }

    .col-md-offset-10 {
        margin-left: 83.33333333333334%
    }

    .col-md-offset-11 {
        margin-left: 91.66666666666666%
    }
}
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-docgenerator/src/main/resources/org/apache/groovy/docgenerator/stylesheet.css`
#### Snippet
```java
@media (min-width: 1200px) {
    .container {
        max-width: 1170px
    }

    .col-lg-1, .col-lg-2, .col-lg-3, .col-lg-4, .col-lg-5, .col-lg-6, .col-lg-7, .col-lg-8, .col-lg-9, .col-lg-10, .col-lg-11 {
        float: left
    }

    .col-lg-1 {
        width: 8.333333333333332%
    }

    .col-lg-2 {
        width: 16.666666666666664%
    }

    .col-lg-3 {
        width: 25%
    }

    .col-lg-4 {
        width: 33.33333333333333%
    }

    .col-lg-5 {
        width: 41.66666666666667%
    }

    .col-lg-6 {
        width: 50%
    }

    .col-lg-7 {
        width: 58.333333333333336%
    }

    .col-lg-8 {
        width: 66.66666666666666%
    }

    .col-lg-9 {
        width: 75%
    }

    .col-lg-10 {
        width: 83.33333333333334%
    }

    .col-lg-11 {
        width: 91.66666666666666%
    }

    .col-lg-12 {
        width: 100%
    }

    .col-lg-push-0 {
        left: auto
    }

    .col-lg-push-1 {
        left: 8.333333333333332%
    }

    .col-lg-push-2 {
        left: 16.666666666666664%
    }

    .col-lg-push-3 {
        left: 25%
    }

    .col-lg-push-4 {
        left: 33.33333333333333%
    }

    .col-lg-push-5 {
        left: 41.66666666666667%
    }

    .col-lg-push-6 {
        left: 50%
    }

    .col-lg-push-7 {
        left: 58.333333333333336%
    }

    .col-lg-push-8 {
        left: 66.66666666666666%
    }

    .col-lg-push-9 {
        left: 75%
    }

    .col-lg-push-10 {
        left: 83.33333333333334%
    }

    .col-lg-push-11 {
        left: 91.66666666666666%
    }

    .col-lg-pull-0 {
        right: auto
    }

    .col-lg-pull-1 {
        right: 8.333333333333332%
    }

    .col-lg-pull-2 {
        right: 16.666666666666664%
    }

    .col-lg-pull-3 {
        right: 25%
    }

    .col-lg-pull-4 {
        right: 33.33333333333333%
    }

    .col-lg-pull-5 {
        right: 41.66666666666667%
    }

    .col-lg-pull-6 {
        right: 50%
    }

    .col-lg-pull-7 {
        right: 58.333333333333336%
    }

    .col-lg-pull-8 {
        right: 66.66666666666666%
    }

    .col-lg-pull-9 {
        right: 75%
    }

    .col-lg-pull-10 {
        right: 83.33333333333334%
    }

    .col-lg-pull-11 {
        right: 91.66666666666666%
    }

    .col-lg-offset-0 {
        margin-left: 0
    }

    .col-lg-offset-1 {
        margin-left: 8.333333333333332%
    }

    .col-lg-offset-2 {
        margin-left: 16.666666666666664%
    }

    .col-lg-offset-3 {
        margin-left: 25%
    }

    .col-lg-offset-4 {
        margin-left: 33.33333333333333%
    }

    .col-lg-offset-5 {
        margin-left: 41.66666666666667%
    }

    .col-lg-offset-6 {
        margin-left: 50%
    }

    .col-lg-offset-7 {
        margin-left: 58.333333333333336%
    }

    .col-lg-offset-8 {
        margin-left: 66.66666666666666%
    }

    .col-lg-offset-9 {
        margin-left: 75%
    }

    .col-lg-offset-10 {
        margin-left: 83.33333333333334%
    }

    .col-lg-offset-11 {
        margin-left: 91.66666666666666%
    }
}
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-docgenerator/src/main/resources/org/apache/groovy/docgenerator/stylesheet.css`
#### Snippet
```java
.btn {
    display: inline-block;
    padding: 6px 12px;
    margin-bottom: 0;
    font-size: 14px;
    font-weight: normal;
    line-height: 1.428571429;
    text-align: center;
    vertical-align: middle;
    cursor: pointer;
    border: 1px solid transparent;
    border-radius: 0;
    white-space: nowrap;
    -webkit-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    -o-user-select: none;
    user-select: none
}
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-docgenerator/src/main/resources/org/apache/groovy/docgenerator/stylesheet.css`
#### Snippet
```java
.caret {
    display: inline-block;
    width: 0;
    height: 0;
    margin-left: 2px;
    vertical-align: middle;
    border-top: 4px solid #000;
    border-right: 4px solid transparent;
    border-left: 4px solid transparent;
    border-bottom: 0 dotted;
    content: ""
}
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-docgenerator/src/main/resources/org/apache/groovy/docgenerator/stylesheet.css`
#### Snippet
```java
.dropdown-menu {
    position: absolute;
    top: 100%;
    left: 0;
    z-index: 1000;
    display: none;
    float: left;
    min-width: 160px;
    padding: 5px 0;
    margin: 2px 0 0;
    list-style: none;
    font-size: 14px;
    background-color: #fff;
    border: 1px solid #ccc;
    border: 1px solid rgba(0, 0, 0, 0.15);
    border-radius: 0;
    background-clip: padding-box
}
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-docgenerator/src/main/resources/org/apache/groovy/docgenerator/stylesheet.css`
#### Snippet
```java
body.left h1, body.left h2 {
    display: inline;
    text-align: left;
    font-weight: 100;
    font-size: 1em;
    margin: 0 10px;
    padding: 3px 10px;
    margin-top: 10px;
    background: #db4800;
    color: white;
    line-height: 40px
}
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/GroovyDocTemplateEngine.java`
#### Snippet
```java
            Template t = classTemplates.get(templatePath);
            if (t == null) {
                t = engine.createTemplate(resourceManager.getReader(templatePath));
                classTemplates.put(templatePath, t);
            }
            Map<String, Object> binding = new LinkedHashMap<String, Object>();
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/SimpleGroovyClassDoc.java`
#### Snippet
```java
            for (GroovyParameter groovyParameter : constructor.parameters()) {
                SimpleGroovyParameter param = (SimpleGroovyParameter) groovyParameter;
                String paramTypeName = param.typeName();
                if (visibleClasses.containsKey(paramTypeName)) {
                    param.setType((GroovyType) visibleClasses.get(paramTypeName));
                } else {
                    GroovyClassDoc doc = resolveClass(rootDoc, paramTypeName);
                    if (doc != null) param.setType(doc);
                }
                processAnnotationRefs(rootDoc, param.annotations());
            }
            processAnnotationRefs(rootDoc, constructor.annotations());
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/SimpleGroovyClassDoc.java`
#### Snippet
```java
            String typeName = fieldType.typeName();
            if (visibleClasses.containsKey(typeName)) {
                mutableField.setType((GroovyType) visibleClasses.get(typeName));
            } else {
                GroovyClassDoc doc = resolveClass(rootDoc, typeName);
                if (doc != null) mutableField.setType(doc);
            }
            processAnnotationRefs(rootDoc, field.annotations());
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-groovysh/src/main/groovy/org/apache/groovy/groovysh/util/CommandArgumentParser.groovy`
#### Snippet
```java
                if (doubleHyphenOpen) {
                    tokens.add(currentToken)
                    currentToken = ''
                    doubleHyphenOpen = false
                } else {
                    if (currentToken.size() > 0) {
                        tokens.add(currentToken)
                        currentToken = ''
                    }
                    doubleHyphenOpen = true
                }
                continue
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxClientConnectorFactory.groovy`
#### Snippet
```java
        def protocol = nodeAttribs?.remove("protocol") ?: nodeAttribs?.remove("transport") ?: "rmi"
        def port = nodeAttribs?.remove("port")
        def host = nodeAttribs?.remove("host") ?: nodeAttribs?.remove("address") ?: "localhost"
        def url = nodeAttribs?.remove("url")
        def props = nodeAttribs?.remove("properties") ?: nodeAttribs?.remove("props") ?: nodeAttribs?.remove("env")
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxClientConnectorFactory.groovy`
#### Snippet
```java
        if (!port && !url) {
            throw new JmxBuilderException("Node '${nodeName} requires attribute 'port' to specify server's port number.")
        }
        if (!SUPPORTED_PROTOCOLS.contains(protocol)) {
            throw new JmxBuilderException("Connector protocol '${protocol} is not supported at this time. " +
                    "Supported protocols are ${SUPPORTED_PROTOCOLS}.")
        }
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxMetaMapBuilder.groovy`
#### Snippet
```java
                map = [
                        target      : object,
                        name        : object.getClass().name,
                        displayName : descriptor.desc ?: descriptor.desc,
                        attributes  : buildAttributeMapFrom(object, descriptor.attributes ?: descriptor.attribs),
                        constructors: buildConstructorMapFrom(object, descriptor.constructors ?: descriptor.ctors),
                        operations  : buildOperationMapFrom(object, descriptor.operations ?: descriptor.ops),
                        listeners   : buildListenerMapFrom(descriptor.listeners),
                        mbeanServer : descriptor.server ?: descriptor.mbeanServer
                ]

                // validate object Name
                map.jmxName = getObjectName(descriptor) ?:
                        JmxBeanInfoManager.buildDefaultObjectName(
                                JmxBuilderTools.DEFAULT_DOMAIN,
                                JmxBuilderTools.DEFAULT_NAME_TYPE,
                                object)
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-jmx/src/main/groovy/groovy/jmx/builder/JmxOperationInfoManager.groovy`
#### Snippet
```java
        MBeanParameterInfo[] params = (MBeanParameterInfo[]) buildParamInfosFromMaps(map.remove("params"))

        Descriptor desc = new DescriptorSupport()
        desc.setField(JmxBuilderTools.DESC_KEY_NAME, map.remove(JmxBuilderTools.DESC_KEY_NAME))
        desc.setField(JmxBuilderTools.DESC_KEY_TYPE, JmxBuilderTools.DESC_VAL_TYPE_OP)
        desc.setField(JmxBuilderTools.DESC_KEY_ROLE, map.remove(JmxBuilderTools.DESC_KEY_ROLE))
        desc.setField JmxBuilderTools.DESC_KEY_DISPLAY_NAME, map.remove(JmxBuilderTools.DESC_KEY_DISPLAY_NAME)
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-json/src/main/java/groovy/json/JsonSlurper.java`
#### Snippet
```java
        Reader reader = null;
        try {
            if (params == null || params.isEmpty()) {
                reader = ResourceGroovyMethods.newReader(url, charset);
            } else {
                reader = ResourceGroovyMethods.newReader(url, params, charset);
            }
            return parse(reader);
        } catch (IOException ioe) {
            throw new JsonException("Unable to process url: " + url.toString(), ioe);
        } finally {
            if (reader != null) {
                DefaultGroovyMethodsSupport.closeWithWarning(reader);
            }
        }
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-json/src/main/java/groovy/json/JsonSlurperClassic.java`
#### Snippet
```java
        Reader reader = null;
        try {
            if (charset == null || charset.length() == 0) {
                reader = ResourceGroovyMethods.newReader(file);
            } else {
                reader = ResourceGroovyMethods.newReader(file, charset);
            }
            return parse(reader);
        } catch (IOException ioe) {
            throw new JsonException("Unable to process file: " + file.getPath(), ioe);
        } finally {
            if (reader != null) {
                DefaultGroovyMethodsSupport.closeWithWarning(reader);
            }
        }
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/BaseJsonParser.java`
#### Snippet
```java
        String charString;
        if (c == ' ') {
            charString = "[SPACE]";
        } else if (c == '\t') {
            charString = "[TAB]";

        } else if (c == '\n') {
            charString = "[NEWLINE]";

        } else {
            charString = "'" + (char) c + "'";
        }

        charString = charString + " with an int value of " + ((int) c);
        return charString;
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/BaseJsonParser.java`
#### Snippet
```java
        switch (currentChar) {
            case MINUS:
            case PLUS:
            case LETTER_E:
            case LETTER_BIG_E:
            case DECIMAL_POINT:
                return true;
        }
        return false;
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java
        char[] chars = bigDCache.get(key);

        if (chars == null) {
            String str = key.toString();
            chars = FastStringUtils.toCharArray(str);
            bigDCache.put(key, chars);
        }

        add(chars);

        return this;
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharScanner.java`
#### Snippet
```java
        int cmpLen = cmpStr.length();
        if (len < cmpLen) return true;
        if (len > cmpLen) return false;

        for (int i = 0; i < cmpLen; ++i) {
            int diff = digitChars[offset + i] - cmpStr.charAt(i);
            if (diff != 0) {
                return (diff < 0);
            }
        }
        return true;
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharScanner.java`
#### Snippet
```java
            int num;
            boolean negative = false;
            char c = digitChars[offset];
            if (c == '-') {
                offset++;
                negative = true;
            }
            if (offset >= to) {
                die();
            }
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharScanner.java`
#### Snippet
```java
        c = digitChars[offset];
        num = (c - '0');
        offset++;

        for (; offset < to; offset++) {
            c = digitChars[offset];
            if (c != '.') {
                num = (num * 10) + (c - '0');
            }
        }

        return negative ? num * -1 : num;
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharScanner.java`
#### Snippet
```java
        long num;
        boolean negative = false;
        char c = digitChars[offset];
        if (c == '-') {
            offset++;
            negative = true;
        }
        if (offset >= to) {
            die();
        }
        c = digitChars[offset];
        num = (c - '0');
        offset++;
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharScanner.java`
#### Snippet
```java
            } else if (ch == '.') {
                if (foundDot) {
                    die("unexpected character " + ch);
                }
                foundDot = true;
            } else if (ch == 'E' || ch == 'e' || ch == '-' || ch == '+') {
                simple = false;
            } else {
                die("unexpected character " + ch);
            }
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/Dates.java`
#### Snippet
```java
                int year = CharScanner.parseIntFromTo(charArray, from, from + 4);
                int month = CharScanner.parseIntFromTo(charArray, from + 5, from + 7);
                int day = CharScanner.parseIntFromTo(charArray, from + 8, from + 10);
                int hour = CharScanner.parseIntFromTo(charArray, from + 11, from + 13);

                int minute = CharScanner.parseIntFromTo(charArray, from + 14, from + 16);

                int second = CharScanner.parseIntFromTo(charArray, from + 17, from + 19);
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonFastParser.java`
#### Snippet
```java
        char[] array = charArray;

        final int startIndex = __index;
        int index = __index;
        char currentChar;
        boolean doubleFloat = false;
        boolean foundDot = false;
        boolean foundSign = false;
        boolean foundExp = false;

        if (minus && index + 1 < array.length) {
            index++;
        }
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonFastParser.java`
#### Snippet
```java
        char[] array = charArray;
        int index = __index;
        char currentChar = charArray[index];

        if (index < array.length && currentChar == '"') {
            index++;
        }

        final int startIndex = index;

        boolean encoded = hasEscapeChar(array, index, indexHolder);
        index = indexHolder[0];
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonFastParser.java`
#### Snippet
```java
        if (__currentChar == '[') {
            __index++;
        }

        skipWhiteSpace();

        /* the list might be empty  */
        if (__currentChar == ']') {
            __index++;
            return new ValueContainer(new ArrayList());
        }

        List<Object> list;

        if (useValues) {
            list = new ArrayList<Object>();
        } else {
            list = new ValueList(lazyChop);
        }

        Value value = new ValueContainer(list);
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserCharArray.java`
#### Snippet
```java
                String key = decodeString();

                if (internKeys) {
                    String keyPrime = internedKeysCache.get(key);
                    if (keyPrime == null) {
                        key = key.intern();
                        internedKeysCache.put(key, key);
                    } else {
                        key = keyPrime;
                    }
                }
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-nio/src/main/java/org/apache/groovy/nio/extensions/NioExtensions.java`
#### Snippet
```java
        final Closure pre = (Closure) options.get("preDir");
        final Closure post = (Closure) options.get("postDir");
        final FileType type = (FileType) options.get("type");
        final Object filter = options.get("filter");
        final Object nameFilter = options.get("nameFilter");
        final Object excludeFilter = options.get("excludeFilter");
        final Object excludeNameFilter = options.get("excludeNameFilter");
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-nio/src/main/java/org/apache/groovy/nio/extensions/NioExtensions.java`
#### Snippet
```java
        Object filterToUse = null;
        Object filterParam = null;
        if (filter != null) {
            filterToUse = filter;
            filterParam = path;
        } else if (nameFilter != null) {
            filterToUse = nameFilter;
            filterParam = path.getFileName().toString();
        }
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/GroovyServlet.java`
#### Snippet
```java
                error.append(runtimeException.getMessage());
                if (runtimeException.getStackTrace().length > 0)
                    error.append(runtimeException.getStackTrace()[0].toString());
                servletContext.log(error.toString());
                System.err.println(error.toString());
                runtimeException.printStackTrace(System.err);
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, error.toString());
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-swing/src/main/groovy/groovy/swing/factory/ComponentFactory.groovy`
#### Snippet
```java
    public void setChild(FactoryBuilderSupport builder, Object parent, Object child) {
        if (!(child instanceof Component) || (child instanceof Window)) {
            return
        }
        try {
            def constraints = builder.context.constraints
            if (constraints != null) {
                LayoutFactory.getLayoutTarget(parent).add(child, constraints)
                if (child instanceof JComponent) {
                    child.putClientProperty(DEFAULT_DELEGATE_PROPERTY_CONSTRAINT, constraints)
                }
                builder.context.remove('constraints')
            } else {
                LayoutFactory.getLayoutTarget(parent).add(child)
            }
        } catch (MissingPropertyException mpe) {
            LayoutFactory.getLayoutTarget(parent).add(child)
        }
    }
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-swing/src/main/java/org/apache/groovy/swing/extensions/SwingExtensions.java`
#### Snippet
```java
        return new Iterator<Object>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index > -1 && index < self.getSize();
            }

            @Override
            public Object next() {
                return self.getElementAt(index++);
            }

            @Override
            public void remove() {
                if (hasNext()) self.removeElementAt(index--);
            }
        };
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-swing/src/main/java/org/apache/groovy/swing/extensions/SwingExtensions.java`
#### Snippet
```java
            @Override
            public Object next() {
                int cols = self.getColumnCount();
                Object[] rowData = new Object[cols];
                for (int col = 0; col < cols; col++) {
                    rowData[col] = self.getValueAt(row, col);
                }
                row++;
                return rowData;
            }
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-templates/src/main/groovy/groovy/text/XmlTemplateEngine.java`
#### Snippet
```java
            out.print("<");
            if (!begin) {
                out.print("/");
            }
            out.print(getName(node));
            if (ctx != null) {
                printNamespace(node, ctx);
            }
            if (begin) {
                printNameAttributes(node.attributes(), ctx);
            }
            out.print(">");
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-test/src/main/groovy/groovy/mock/interceptor/MockFor.groovy`
#### Snippet
```java
        thisproxy.interceptor = new MockInterceptor(expectation: thisexpect)
        instance.metaClass = thisproxy
        def wrapped = instance
        if (isDelegate && clazz.isInterface()) {
            wrapped = ProxyGenerator.INSTANCE.instantiateDelegate([clazz], instance)
        }
        instanceExpectations[wrapped] = thisexpect
        return wrapped
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-test/src/main/java/groovy/test/GroovyTestCase.java`
#### Snippet
```java
        StringBuilder message = new StringBuilder();

        message.append(expected).append(" not in {");

        for (int i = 0; i < array.length; ++i) {
            message.append("'").append(array[i]).append("'");

            if (i < (array.length - 1)) {
                message.append(", ");
            }
        }

        message.append(" }");

        fail(message.toString());
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-typecheckers/src/main/groovy/groovy/typecheckers/RegexChecker.groovy`
#### Snippet
```java
                @Override
                void visitDeclarationExpression(DeclarationExpression decl) {
                    super.visitDeclarationExpression(decl)
                    if (decl.variableExpression != null) {
                        if (isConstantExpression(decl.rightExpression)) {
                            localConstVars.put(decl.variableExpression, decl.rightExpression)
                        }
                        def groupCount = decl.rightExpression.getNodeMetaData(REGEX_GROUP_COUNT)
                        if (groupCount != null) {
                            decl.variableExpression.putNodeMetaData(REGEX_GROUP_COUNT, groupCount)
                        }
                    }
                }
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-xml/src/main/groovy/groovy/xml/StreamingDOMBuilder.groovy`
#### Snippet
```java
            body.each {
                if (it instanceof Closure) {
                    def body1 = it.clone()
                    body1.delegate = doc
                    body1(doc)
                } else if (it instanceof Buildable) {
                    it.build(doc)
                } else {
                    dom.element.appendChild(dom.document.createTextNode(it))
                }
            }
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-xml/src/main/groovy/groovy/xml/StreamingDOMBuilder.groovy`
#### Snippet
```java
        if (prefix != "") {
            if (namespaces.containsKey(prefix)) {
                uri = namespaces[prefix]
            } else if (pendingNamespaces.containsKey(prefix)) {
                uri = pendingNamespaces[prefix]
            } else {
                throw new GroovyRuntimeException("Namespace prefix: ${prefix} is not bound to a URI")
            }
            if (prefix != ":") {
                qualifiedName = prefix + ":" + tag
            }
        }
```

### DuplicatedCode
Duplicated code
in `subprojects/groovy-xml/src/main/groovy/groovy/xml/StreamingMarkupBuilder.groovy`
#### Snippet
```java
            body.each {
                if (it instanceof Closure) {
                    def body1 = it.clone()
                    body1.delegate = doc
                    body1(doc)
                } else if (it instanceof Buildable) {
                    it.build(doc)
                } else {
                    out.escaped() << it
                }
            }
```

### DuplicatedCode
Duplicated code
in `subprojects/stress/src/stressTest/java/org/codehaus/groovy/util/ManagedConcurrentMapStressTest.java`
#### Snippet
```java
        keyList1.clear();
        GCUtils.gc();

        final int threadCount = 16;
        final CyclicBarrier barrier = new CyclicBarrier(threadCount + 1);
        final Object[] threadKeys = new Object[threadCount];
        for (int i = 0; i < threadCount; i++) {
            final int idx = i;
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    Object k = new Object();
                    threadKeys[idx] = k;
                    String v = "thread-" + idx;
                    ThreadUtils.await(barrier);
                    map.put(k, v);
                    ThreadUtils.await(barrier);
                }
            });
            t.setDaemon(true);
            t.start();
        }
        barrier.await(); // start threads
        barrier.await(30L, TimeUnit.SECONDS); // wait for them to complete
```

## RuleId[id=CollectionContainsUrl]
### CollectionContainsUrl
Map `transformNames` may contain URL objects
in `src/main/java/org/codehaus/groovy/transform/ASTTransformationVisitor.java`
#### Snippet
```java
        final CompilationUnit compilationUnit = context.getCompilationUnit();
        GroovyClassLoader transformLoader = compilationUnit.getTransformLoader();
        Map<String, URL> transformNames = new LinkedHashMap<String, URL>();
        try {
            Enumeration<URL> globalServices = transformLoader.getResources("META-INF/services/org.codehaus.groovy.transform.ASTTransformation");
```

### CollectionContainsUrl
Map `transformNames` may contain URL objects
in `src/main/java/org/codehaus/groovy/transform/ASTTransformationVisitor.java`
#### Snippet
```java
    }

    private static void addPhaseOperationsForGlobalTransforms(CompilationUnit compilationUnit, Map<String, URL> transformNames, boolean isFirstScan) {
        GroovyClassLoader transformLoader = compilationUnit.getTransformLoader();
        for (Map.Entry<String, URL> entry : transformNames.entrySet()) {
```

### CollectionContainsUrl
Map `cache` may contain URL objects
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/MarkupTemplateEngine.java`
#### Snippet
```java
         * @param cache the backing cache
         */
        public CachingTemplateResolver(final Map<String, URL> cache) {
            this.cache = cache;
        }
```

### CollectionContainsUrl
Map `cache` may contain URL objects
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/MarkupTemplateEngine.java`
#### Snippet
```java
        // Those member should stay protected so that subclasses may use different
        // cache keys as the ones used by this implementation
        protected final Map<String, URL> cache;
        protected boolean useCache = false;

```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/codehaus/groovy/control/customizers/builder/ImportCustomizerFactory.java`
#### Snippet
```java
        }

        protected void staticMember(String name, String field) {
            customizer.addStaticImport(name, field);
        }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/codehaus/groovy/control/customizers/builder/ImportCustomizerFactory.java`
#### Snippet
```java
        }

        protected void staticStar(String... classNames) {
            customizer.addStaticStars(classNames);
        }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/codehaus/groovy/control/customizers/builder/ImportCustomizerFactory.java`
#### Snippet
```java
        }

        protected void normal(String... names) {
            customizer.addImports(names);
        }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/codehaus/groovy/control/customizers/builder/ImportCustomizerFactory.java`
#### Snippet
```java
        }

        protected void star(String... packages) {
            customizer.addStarImports(packages);
        }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/codehaus/groovy/control/customizers/builder/ImportCustomizerFactory.java`
#### Snippet
```java
            customizer.addImport(alias, name);
        }
        protected void alias(String alias, Class clazz) {
            customizer.addImport(alias, clazz.getName());
        }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/codehaus/groovy/control/customizers/builder/ImportCustomizerFactory.java`
#### Snippet
```java
            customizer.addStaticImport(name, field);
        }
        protected void staticMember(String alias, String name, String field) {
            customizer.addStaticImport(alias, name, field);
        }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/codehaus/groovy/control/customizers/builder/ImportCustomizerFactory.java`
#### Snippet
```java
        }

        protected void alias(String alias, String name) {
            customizer.addImport(alias, name);
        }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/codehaus/groovy/control/customizers/builder/ImportCustomizerFactory.java`
#### Snippet
```java
            customizer.addStaticStars(classNames);
        }
        protected void staticStar(Class... classes) {
            for (Class aClass : classes) {
                customizer.addStaticStars(aClass.getName());
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/codehaus/groovy/control/customizers/builder/ImportCustomizerFactory.java`
#### Snippet
```java
            customizer.addImports(names);
        }
        protected void normal(Class... classes) {
            for (Class aClass : classes) {
                customizer.addImports(aClass.getName());
```

## RuleId[id=RegExpUnexpectedAnchor]
### RegExpUnexpectedAnchor
Anchor `$` in unexpected position
in `src/spec/test/OperatorsTest.groovy`
#### Snippet
```java
        p = ~'foo'                                                        // <1>
        p = ~"foo"                                                        // <2>
        p = ~$/dollar/slashy $ string/$                                   // <3>
        p = ~"${pattern}"                                                 // <4>
        // end::pattern_op_variants[]
```

### RegExpUnexpectedAnchor
Anchor `$` in unexpected position
in `subprojects/performance/src/files/pleac07_10.groovy`
#### Snippet
```java
name = System.getProperty('user.name')
home = System.getProperty('user.home')
println home + path.replaceAll("~$name(.*)", '$1')
// => C:\Documents and Settings\Paul/.cvspass
//----------------------------------------------------------------------------------
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/codehaus/groovy/control/CompilationFailedException.java`
#### Snippet
```java


    /**
     * Formats the error data as a String.
     */
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/codehaus/groovy/runtime/MethodKey.java`
#### Snippet
```java
        int size = getParameterCount();

        /** @todo we should use the real Josh Bloch algorithm here */

        // can't remember the exact Josh Bloch algorithm and I've not got the book handy
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/codehaus/groovy/runtime/MetaClassHelper.java`
#### Snippet
```java
        //                     VArgs_penalty(D)<VArgs_penalty(B)

        /**
         * In general we want to match the signature that allows us to use
         * as less arguments for the vargs part as possible. That means the
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static int compareTo(Number left, Number right) {
        /** @todo maybe a double dispatch thing to handle new large numbers? */
        return NumberMath.compareTo(left, right);
    }
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/groovy/lang/Binding.java`
#### Snippet
```java
    @Override
    public void setProperty(String property, Object newValue) {
        /** @todo we should check if we have the property with the metaClass instead of try/catch  */
        try {
            super.setProperty(property, newValue);
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/main/java/groovy/lang/Binding.java`
#### Snippet
```java
    @Override
    public Object getProperty(String property) {
        /** @todo we should check if we have the property with the metaClass instead of try/catch  */
        try {
            return super.getProperty(property);
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `expr` declared in one 'switch' branch and used in another
in `src/main/java/org/codehaus/groovy/transform/sc/transformers/BinaryExpressionTransformer.java`
#### Snippet
```java
          case Types.ASSIGN:
            optimizeArrayCollectionAssignment(bin); // GROOVY-10029
            Expression expr = transformAssignmentToSetterCall(bin);
            if (expr != null) return expr;
            if (leftExpression instanceof TupleExpression
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/groovy/parser/antlr4/SemanticPredicates.java`
#### Snippet
```java
        String str2 = String.valueOf((char) c2);

        if (matches(str1, SURROGATE_PAIR1_PATTERN)
                && matches(str2, SURROGATE_PAIR2_PATTERN)
                && Character.isJavaIdentifierPart(Character.toCodePoint((char) c1, (char) c2))) {
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/control/SourceUnit.java`
#### Snippet
```java
        // to report an unexpected EOF. Perhaps this implementation misses some.
        // If you find another way, please add it.
        if (getErrorCollector().hasErrors()) {
            /*
            Message last = (Message) getErrorCollector().getLastError();
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/control/StaticImportVisitor.java`
#### Snippet
```java
                }
                // GROOVY-9587: don't check for property for non-empty call args
                if (args instanceof TupleExpression && ((TupleExpression) args).getExpressions().isEmpty()
                        && hasPossibleStaticProperty(cn, methodName)) {
                    return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/runtime/MetaClassHelper.java`
#### Snippet
```java
            return false;

        if (params[0] != getClassWithNullAndWrapper(arg1)) return false;

        return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/classgen/FinalVariableAnalyzer.java`
#### Snippet
```java
        }
        Statement last = DefaultGroovyMethods.last(bs.getStatements());
        if (last instanceof ReturnStatement || last instanceof ThrowStatement) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/classgen/Verifier.java`
#### Snippet
```java
        if (m.getDeclaringClass() == getClassNode()) return false;
        // do not overwrite final
        if (isFinal(m.getModifiers())) return false;
        return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/classgen/asm/BytecodeHelper.java`
#### Snippet
```java
    private static boolean usesGenericsInTypeSignature(ClassNode node) {
        if (!node.isUsingGenerics()) return false;
        if (hasGenerics(node)) return true;

        return false;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/classgen/AsmClassGenerator.java`
#### Snippet
```java

        // a protected or package-private member is accessible from the declaring package
        if (Objects.equals(accessingClass.getPackageName(), declaringClass.getPackageName())) return true;

        return false;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/classgen/asm/sc/StaticTypesBinaryExpressionMultiTypeDispatcher.java`
#### Snippet
```java
                receiverType = controller.getClassNode();
            }
            if (makeSetPrivateFieldWithBridgeMethod(receiver, receiverType, property, arguments, safe, spreadSafe, implicitThis)) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/classgen/asm/sc/StaticInvocationWriter.java`
#### Snippet
```java
        if (receiver.redirect() == caller) return true;
        if (isPrivateBridgeMethodsCallAllowed(receiver.getOuterClass(), caller)) return true;
        if (caller.getOuterClass() != null && isPrivateBridgeMethodsCallAllowed(receiver, caller.getOuterClass())) return true;
        return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/vmplugin/v8/Java8.java`
#### Snippet
```java
        if (accessibleObject instanceof Constructor) {
            Constructor<?> c = (Constructor<?>) accessibleObject;
            if (c.getDeclaringClass() == Class.class) {
                return false; // Cannot make a java.lang.Class constructor accessible
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/transform/AbstractASTTransformation.java`
#### Snippet
```java
        if (itemExpr instanceof ConstantExpression) {
            Object value = ((ConstantExpression) itemExpr).getValue();
            if (value instanceof String && isUndefined((String)value)) return true;
        } else if (itemExpr instanceof ClassExpression && isUndefined(itemExpr.getType())) {
            return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/transform/AbstractASTTransformation.java`
#### Snippet
```java
            Object value = ((ConstantExpression) itemExpr).getValue();
            if (value instanceof String && isUndefined((String)value)) return true;
        } else if (itemExpr instanceof ClassExpression && isUndefined(itemExpr.getType())) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/transform/DelegateASTTransformation.java`
#### Snippet
```java
            if (javaObjectMethods.contains(candidate.getTypeDescriptor())) return true;

            if (ownClassMethods.contains(candidate.getTypeDescriptor())) return true;

            return false;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/transform/NewifyASTTransformation.java`
#### Snippet
```java
            // Global classes
            final ClassNode globalType = nameToGlobalClassesNodesMap.get(methodName);
            if (globalType != null) {
                return globalType;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/transform/LogASTTransformation.java`
#### Snippet
```java
            private boolean isSimpleExpression(final Expression exp) {
                if (exp instanceof ConstantExpression) return true;
                if (exp instanceof VariableExpression) return true;
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/transform/sc/transformers/CastExpressionOptimizer.java`
#### Snippet
```java
            return true;
        }
        if (ClassHelper.isPrimitiveType(exprInferredType) && ClassHelper.isPrimitiveType(castType)) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/transform/sc/transformers/BooleanExpressionTransformer.java`
#### Snippet
```java
                    if (theAsBoolean instanceof ExtensionMethodNode) {
                        ClassNode selfType = (((ExtensionMethodNode) theAsBoolean).getExtensionMethodNode()).getParameters()[0].getType();
                        if (ClassHelper.isObjectType(selfType)) {
                            return true;
                        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/transform/stc/SecondPassExpression.java`
#### Snippet
```java

        if (!Objects.equals(data, that.data)) return false;
        if (!expression.equals(that.expression)) return false;

        return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/transform/trait/TraitComposer.java`
#### Snippet
```java

    private static boolean shouldSkipMethod(final ClassNode cNode, final String name, final Parameter[] params) {
        if (isExistingProperty(name, cNode, params) || findExistingMethod(cNode, name, params) != null) {
            // override exists in the weaved class itself
            return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/transform/trait/TraitASTTransformation.java`
#### Snippet
```java
        if (mNode.getDeclaringClass() == cNode) return false;
        // do not overwrite final
        if ((mNode.getModifiers() & ACC_FINAL) != 0) return false;
        return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/reflection/MixinInMetaClass.java`
#### Snippet
```java
        MixinInMetaClass that = (MixinInMetaClass) o;

        if (!Objects.equals(mixinClass, that.mixinClass)) return false;

        return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/reflection/ParameterTypes.java`
#### Snippet
```java
        else if (nArguments == nParameters)
            return isValidExactMethod(argumentTypes, pt);
        else if (nArguments == 0 && nParameters == 1 && !pt[0].isPrimitive)
            return true; // implicit null argument
        return false;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/reflection/ParameterTypes.java`
#### Snippet
```java
            }
            return true;
        } else if (nArguments == 0 && nParameters == 1 && !parameterTypes[0].isPrimitive) {
            return true; // implicit null argument
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java`
#### Snippet
```java
        if (allowConstructorCoercion && isGroovyConstructorCompatible(rightExpression)) {
            // TODO: in case of the array we could maybe make a partial check
            if (rightRedirect.isArray() && !leftRedirect.isArray()) {
                return false;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java`
#### Snippet
```java
        if ("with".equals(name) && arguments instanceof ArgumentListExpression) {
            List<Expression> args = ((ArgumentListExpression) arguments).getExpressions();
            if (args.size() == 1 && args.get(0) instanceof ClosureExpression) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java`
#### Snippet
```java
            if (!GenericsUtils.buildWildcardType(parameterType).isCompatibleWith(argumentType)) {
                boolean samCoercion = argumentType.equals(CLOSURE_TYPE) && isSAMType(parameterType);
                if (!samCoercion) return false; // else assume parameters and return checked earlier
            }
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java`
#### Snippet
```java
            }
            ClassNode oc = cn.getOuterClass();
            if (oc != null && oc.getGenericsTypes() != null
                    && (cn.getModifiers() & Opcodes.ACC_STATIC) == 0) {
                return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java`
#### Snippet
```java
            }
        }
        if (isGroovyObjectType(superOrInterface) && isBeingCompiled(type) && !type.isInterface()) {//TODO: !POJO !Trait
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/groovy/util/ProxyGenerator.java`
#### Snippet
```java
            if (!Objects.equals(delegateClass, cacheKey.delegateClass)) return false;
            if (!Arrays.equals(interfaces, cacheKey.interfaces)) return false;
            if (!Objects.equals(methods, cacheKey.methods)) return false;

            return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
        } else if (!Modifier.isFinal(targetType.getModifiers()) && expressionType.isInterface()) {
            return true;
        } else if (!isAssignableTo(targetType, expressionType) && !implementsInterfaceOrIsSubclassOf(expressionType, targetType)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
            statement = last(((BlockStatement) statement).getStatements());
        // end break, continue, return or throw
        if (statement instanceof BreakStatement
                || statement instanceof ContinueStatement
                || !GeneralUtils.maybeFallsThrough(statement)) {
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
            if (type.getOuterClass() != null) {
                MethodNode enclosingMethod = type.getEnclosingMethod();
                if (enclosingMethod != null && isSkipMode(enclosingMethod)) {
                    return true;
                }
```

### TrivialIf
`if` statement can be simplified
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/generation/CandidateChecks.java`
#### Snippet
```java
     */
    public static boolean isPreOrPostconditionCandidate(final ClassNode type, final MethodNode method) {
        if (!isPreconditionCandidate(type, method) && !isPostconditionCandidate(type, method)) return false;

        return true;
```

### TrivialIf
`if` statement can be simplified
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/generation/CandidateChecks.java`
#### Snippet
```java
    public static boolean isClassInvariantCandidate(final ClassNode type, final MethodNode method) {
        if (method.isSynthetic() || method.isAbstract() || method.isStatic() || !method.isPublic()) return false;
        if (method.getDeclaringClass() != type) return false;

        return true;
```

### TrivialIf
`if` statement can be simplified
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/generation/CandidateChecks.java`
#### Snippet
```java
    public static boolean isPostconditionCandidate(final ClassNode type, final MethodNode method) {
        if (!isPreconditionCandidate(type, method)) return false;
        if (method.isStatic()) return false;

        return true;
```

### TrivialIf
`if` statement can be simplified
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/generation/CandidateChecks.java`
#### Snippet
```java
    public static boolean couldBeContractElementMethodNode(final ClassNode type, final MethodNode method) {
        if (method.isSynthetic() || !method.isPublic()) return false;
        if (method.getDeclaringClass() != null && !method.getDeclaringClass().getName().equals(type.getName()))
            return false;

```

### TrivialIf
`if` statement can be simplified
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/generation/CandidateChecks.java`
#### Snippet
```java
    public static boolean isPreconditionCandidate(final ClassNode type, final MethodNode method) {
        if (method.isSynthetic() || method.isAbstract()) return false;
        if (method.getDeclaringClass() != type) return false;

        return true;
```

### TrivialIf
`if` statement can be simplified
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/generation/ContractExecutionTracker.java`
#### Snippet
```java
            if (!Objects.equals(className, that.className))
                return false;
            if (!Objects.equals(methodIdentifier, that.methodIdentifier))
                return false;

```

### TrivialIf
`if` statement can be simplified
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java
        } else if (c == 92) {  /* backslash */
            return true;
        } else if (!disableUnicodeEscaping && c > 126) {  /* non-ascii char range */
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserLax.java`
#### Snippet
```java
    private boolean isFalse() {
        if (__index + FALSE.length <= charArray.length) {
            if (charArray[__index] == 'f' &&
                    charArray[__index + 1] == 'a' &&
                    charArray[__index + 2] == 'l' &&
```

### TrivialIf
`if` statement can be simplified
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserLax.java`
#### Snippet
```java
    private boolean isNull() {
        if (__index + NULL.length <= charArray.length) {
            if (charArray[__index] == 'n' &&
                    charArray[__index + 1] == 'u' &&
                    charArray[__index + 2] == 'l' &&
```

### TrivialIf
`if` statement can be simplified
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserLax.java`
#### Snippet
```java
    private boolean isTrue() {
        if (__index + TRUE.length <= charArray.length) {
            if (charArray[__index] == 't' &&
                    charArray[__index + 1] == 'r' &&
                    charArray[__index + 2] == 'u' &&
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/codehaus/groovy/classgen/VerifierCodeVisitor.java`
#### Snippet
```java
    public static void assertValidIdentifier(String name, String message, ASTNode node) {
        int size = name.length();
        if (size <= 0) {
            throw new RuntimeParserException("Invalid " + message + ". Identifier must not be empty", node);
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
    protected String asSql(GString gstring, List<Object> values) {
        String[] strings = gstring.getStrings();
        if (strings.length <= 0) {
            throw new IllegalArgumentException("No SQL specified in GString: " + gstring);
        }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `subprojects/groovy-xml/src/main/java/groovy/xml/XmlParser.java`
#### Snippet
```java
            name = qName;
        }
        if (namespaceURI == null || namespaceURI.length() <= 0) {
            return name;
        }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/runtime/StreamGroovyMethods.java`
#### Snippet
```java
     * @since 3.0.0
     */
    public static DoubleStream stream(final OptionalDouble self) {
        if (!self.isPresent()) {
            return DoubleStream.empty();
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/runtime/StreamGroovyMethods.java`
#### Snippet
```java
     * @since 3.0.0
     */
    public static LongStream stream(final OptionalLong self) {
        if (!self.isPresent()) {
            return LongStream.empty();
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/runtime/StreamGroovyMethods.java`
#### Snippet
```java
     * @since 3.0.0
     */
    public static IntStream stream(final OptionalInt self) {
        if (!self.isPresent()) {
            return IntStream.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/runtime/StreamGroovyMethods.java`
#### Snippet
```java
     * @since 3.0.0
     */
    public static <T> Stream<T> stream(final Optional<T> self) {
        return self.map(Stream::of).orElseGet(Stream::empty);
    }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * @since 5.0.0
     */
    public static OptionalInt peek(final OptionalInt self, final IntConsumer action) {
        self.ifPresent(action);
        return self;
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * @since 3.0.0
     */
    public static <T> Optional<T> mapToObj(final OptionalInt self, final IntFunction<? extends T> mapper) {
        if (!self.isPresent()) {
            return Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * @since 5.0.0
     */
    public static <T> T getAt(final Optional<T> self, final int index) {
        switch (index) {
          case  0:
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * @since 3.0.0
     */
    public static double get(final OptionalDouble self) {
        return self.getAsDouble();
    }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java

    @Deprecated
    public static IntStream stream(final OptionalInt self) {
        return StreamGroovyMethods.stream(self);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * @since 3.0.0
     */
    public static <T> OptionalLong mapToLong(final Optional<T> self, final ToLongFunction<? super T> mapper) {
        return self.map(t -> OptionalLong.of(mapper.applyAsLong(t))).orElseGet(OptionalLong::empty);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * @since 3.0.0
     */
    public static <T> OptionalDouble mapToDouble(final Optional<T> self, final ToDoubleFunction<? super T> mapper) {
        return self.map(t -> OptionalDouble.of(mapper.applyAsDouble(t))).orElseGet(OptionalDouble::empty);
    }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java

    @Deprecated
    public static DoubleStream stream(final OptionalDouble self) {
        return StreamGroovyMethods.stream(self);
    }
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * @since 3.0.0
     */
    public static int get(final OptionalInt self) {
        return self.getAsInt();
    }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java

    @Deprecated
    public static LongStream stream(final OptionalLong self) {
        return StreamGroovyMethods.stream(self);
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * @since 5.0.0
     */
    public static <T> Optional<T> peek(final Optional<T> self, final Consumer<? super T> action) {
        self.ifPresent(action);
        return self;
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * @since 3.0.0
     */
    public static OptionalDouble filter(final OptionalDouble self, final DoublePredicate test) {
        if (!self.isPresent() || !test.test(self.getAsDouble())) {
            return OptionalDouble.empty();
```

### OptionalUsedAsFieldOrParameterType
`OptionalInt` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * @since 3.0.0
     */
    public static OptionalInt filter(final OptionalInt self, final IntPredicate test) {
        if (!self.isPresent() || !test.test(self.getAsInt())) {
            return OptionalInt.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * @since 2.5.0
     */
    public static boolean asBoolean(final Optional<?> optional) {
        return optional.isPresent();
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * @since 3.0.6
     */
    public static <T> Optional<T> orOptional(final Optional<T> self, final Supplier<Optional<? extends T>> supplier) {
        if (self.isPresent()) {
            return self;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * @since 3.0.0
     */
    public static <T> OptionalInt mapToInt(final Optional<T> self, final ToIntFunction<? super T> mapper) {
        return self.map(t -> OptionalInt.of(mapper.applyAsInt(t))).orElseGet(OptionalInt::empty);
    }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * @since 3.0.0
     */
    public static long get(final OptionalLong self) {
        return self.getAsLong();
    }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * @since 3.0.0
     */
    public static <T> Optional<T> mapToObj(final OptionalLong self, final LongFunction<? extends T> mapper) {
        if (!self.isPresent()) {
            return Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * @since 3.0.0
     */
    public static OptionalLong filter(final OptionalLong self, final LongPredicate test) {
        if (!self.isPresent() || !test.test(self.getAsLong())) {
            return OptionalLong.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java

    @Deprecated
    public static <T> Stream<T> stream(final Optional<T> self) {
        return StreamGroovyMethods.stream(self);
    }
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * @since 5.0.0
     */
    public static OptionalLong peek(final OptionalLong self, final LongConsumer action) {
        self.ifPresent(action);
        return self;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * @since 3.0.0
     */
    public static <S,T> Optional<T> collect(final Optional<S> self, @ClosureParams(FirstParam.FirstGenericType.class) final Closure<T> transform) {
        Objects.requireNonNull(transform);
        return self.map(transform::call);
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * @since 3.0.0
     */
    public static <T> Optional<T> mapToObj(final OptionalDouble self, final DoubleFunction<? extends T> mapper) {
        if (!self.isPresent()) {
            return Optional.empty();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * @since 3.0.0
     */
    public static <T> Optional<T> filter(final Optional<?> self, final Class<T> type) {
        return self.filter(type::isInstance).map(type::cast);
    }
```

### OptionalUsedAsFieldOrParameterType
`OptionalDouble` used as type for parameter 'self'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * @since 5.0.0
     */
    public static OptionalDouble peek(final OptionalDouble self, final DoubleConsumer action) {
        self.ifPresent(action);
        return self;
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/groovy/lang/GroovyClassLoader.java`
#### Snippet
```java
        String decodedFile = fileName;
        try {
            decodedFile = URLDecoder.decode(fileName, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            System.err.println("Encountered an invalid encoding scheme when trying to use URLDecoder.decode() inside of the GroovyClassLoader.decodeFileName() method.  Returning the unencoded URL.");
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/util/LifecycleImplementationLoader.java`
#### Snippet
```java
        try {
            in = u.openStream();
            r = new BufferedReader(new InputStreamReader(in, "utf-8"));
            int lc = 1;
            while ((lc = parseLine(service, u, r, lc, names)) >= 0) ;
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'StringBuilderWriter' used without 'try'-with-resources statement
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethods.java`
#### Snippet
```java
            @Override
            public String toString() {
                Writer buffer = new StringBuilderWriter();

                try {
```

### AutoCloseableResource
'StringBuilderWriter' used without 'try'-with-resources statement
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethods.java`
#### Snippet
```java
            @Override
            public String toString() {
                Writer buffer = new StringBuilderWriter();

                try {
```

### AutoCloseableResource
'StringBuilderWriter' used without 'try'-with-resources statement
in `src/main/java/org/codehaus/groovy/runtime/IOGroovyMethods.java`
#### Snippet
```java
            @Override
            public String toString() {
                Writer buffer = new StringBuilderWriter();
                try {
                    writeTo(buffer);
```

### AutoCloseableResource
'StringBuilderWriter' used without 'try'-with-resources statement
in `src/main/java/groovy/lang/Closure.java`
#### Snippet
```java
        @Override
        public String toString() {
            final Writer writer = new StringBuilderWriter();

            try {
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/IO.java`
#### Snippet
```java
    public static CharBuf read(Reader input, CharBuf charBuf, final int bufSize) {
        if (charBuf == null) {
            charBuf = CharBuf.create(bufSize);
        } else {
            charBuf.readForRecycle();
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/Chr.java`
#### Snippet
```java
            length += str.length;
        }
        CharBuf builder = CharBuf.createExact(length);
        for (char[] str : strings) {
            if (str == null) {
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonStringDecoder.java`
#### Snippet
```java
    public static String decodeForSure(char[] chars, int start, int to) {
        // consider wrapping in a try with resources block if CharBuf is ever refactored to have a non-empty close()
        CharBuf builder = CharBuf.create(to - start);
        builder.decodeJsonString(chars, start, to);
        return builder.toString();
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

    public final CharBuf addChar(short i) {
        add((char) i);
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

    public final CharBuf add(float d) {
        add(Float.toString(d));
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

    public final CharBuf addChar(byte i) {
        add((char) i);
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

    public final CharBuf addByte(byte i) {
        addInt(i);
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

    public final CharBuf addString(String str) {
        add(FastStringUtils.toCharArray(str));
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

    public final CharBuf add(double d) {
        add(Double.toString(d));
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java
        }

        add(chars);

        return this;
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

    public final CharBuf add(String str) {
        add(FastStringUtils.toCharArray(str));
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

    public final CharBuf addShort(short i) {
        addInt(i);
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java
    public final CharBuf addJsonFieldName(char[] chars, boolean disableUnicodeEscaping) {
        if (chars.length > 0) {
            addJsonEscapedString(chars, disableUnicodeEscaping);
        } else {
            addChars(EMPTY_STRING_CHARS);
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java
            addJsonEscapedString(chars, disableUnicodeEscaping);
        } else {
            addChars(EMPTY_STRING_CHARS);
        }
        addChar(':');
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java
            addChars(EMPTY_STRING_CHARS);
        }
        addChar(':');
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

    public final CharBuf add(int i) {
        add(Integer.toString(i));
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

    public final CharBuf addBoolean(boolean b) {
        add(Boolean.toString(b));
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java
    public final CharBuf addQuoted(String str) {
        final char[] chars = FastStringUtils.toCharArray(str);
        addQuoted(chars);
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

    public CharBuf addLine(String str) {
        add(str.toCharArray());
        add('\n');
        return this;
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java
    public CharBuf addLine(String str) {
        add(str.toCharArray());
        add('\n');
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java
        switch (i) {
            case 0:
                addChar('0');
                return this;
            case 1:
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java
                return this;
            case 1:
                addChar('1');
                return this;
            case -1:
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java
                return this;
            case -1:
                addChar('-');
                addChar('1');
                return this;
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java
            case -1:
                addChar('-');
                addChar('1');
                return this;
        }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java
        }

        addInt(Integer.valueOf(i));
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

    public final CharBuf addLong(long l) {
        addLong(Long.valueOf(l));
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

    public final CharBuf addDouble(double d) {
        addDouble(Double.valueOf(d));
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

    public final CharBuf addFloat(float d) {
        addFloat(Float.valueOf(d));
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

    public CharBuf addLine(CharSequence str) {
        add(str.toString());
        add('\n');
        return this;
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java
    public CharBuf addLine(CharSequence str) {
        add(str.toString());
        add('\n');
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java
        }

        add(chars);

        return this;
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

    public final CharBuf add(boolean b) {
        addChars(b ? trueChars : falseChars);
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

    public final CharBuf add(short i) {
        add(Short.toString(i));
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

    public final CharBuf addChar(int i) {
        add((char) i);
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

    public final CharBuf add(byte i) {
        add(Byte.toString(i));
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java
        }

        add(chars);
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java
        }

        add(chars);

        return this;
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java
        }

        addChars(chars);
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java
        }

        add(chars);

        return this;
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

    public final CharBuf add(long l) {
        add(Long.toString(l));
        return this;
    }
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/groovy/json/JsonOutput.java`
#### Snippet
```java
        int indentSize = 0;
        // Just a guess that the pretty view will take 20 percent more than original.
        final CharBuf output = CharBuf.create((int) (jsonPayload.length() * 1.2));

        JsonLexer lexer = new JsonLexer(new StringReader(jsonPayload));
```

### AutoCloseableResource
'CharBuf' used without 'try'-with-resources statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharScanner.java`
#### Snippet
```java

    public static String errorDetails(String message, char[] array, int index, int ch) {
        CharBuf buf = CharBuf.create(255);

        buf.addLine(message);
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/ServletBinding.java`
#### Snippet
```java
                @Override
                public PrintWriter format(Locale l, String format, Object... args) {
                    getResponseWriter().format(l, format, args);
                    return this;
                }
```

### AutoCloseableResource
'PrintWriter' used without 'try'-with-resources statement
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/ServletBinding.java`
#### Snippet
```java
                @Override
                public PrintWriter format(String format, Object... args) {
                    getResponseWriter().format(format, args);
                    return this;
                }
```

### AutoCloseableResource
'GroovyClassLoader' used without 'try'-with-resources statement
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
                    REUSE_CLASS_LOADER && parentLoader instanceof GroovyClassLoader
                            ? (GroovyClassLoader) parentLoader
                            : createClassLoader(parentLoader);
            final Class<?> groovyClass;
            try {
```

### AutoCloseableResource
'StringBuilderWriter' used without 'try'-with-resources statement
in `subprojects/groovy-templates/src/main/groovy/groovy/text/SimpleTemplateEngine.java`
#### Snippet
```java
                @Override
                public String toString() {
                    Writer sw = new StringBuilderWriter();
                    writeTo(sw);
                    return sw.toString();
```

### AutoCloseableResource
'GroovyClassLoader' used without 'try'-with-resources statement
in `subprojects/groovy-templates/src/main/groovy/groovy/text/StreamingTemplateEngine.java`
#### Snippet
```java
                    REUSE_CLASS_LOADER && parentLoader instanceof GroovyClassLoader
                            ? (GroovyClassLoader) parentLoader
                            : createClassLoader(parentLoader);
            final Class<?> groovyClass;
            try {
```

## RuleId[id=SuspiciousToArrayCall]
### SuspiciousToArrayCall
Array of type 'java.lang.Object\[\]' expected, 'java.lang.String\[\]' found
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java`
#### Snippet
```java
        } else if (ce instanceof ListExpression) {
            if (expr.getType().isArray() && isStringType(expr.getType().getComponentType()))
                return ((ListExpression) ce).getExpressions().stream().map(e -> evaluateExpression(e, config, loader)).toArray(String[]::new);
        }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param transformer` tag description is missing
in `src/main/java/org/codehaus/groovy/ast/expr/Expression.java`
#### Snippet
```java
    /**
     * Return a copy of the expression calling the transformer on any nested expressions 
     * @param transformer
     */
    public abstract Expression transformExpression(ExpressionTransformer transformer);
```

### JavadocDeclaration
`@param useRef` tag description is missing
in `src/main/java/org/codehaus/groovy/ast/expr/VariableExpression.java`
#### Snippet
```java
     * be converted to a node metadata in the future.
     *
     * @param useRef
     */
    public void setUseReferenceDirectly(boolean useRef) {
```

### JavadocDeclaration
Class/method reference, quoted text, or HTML link are expected after @see tag
in `src/main/java/org/codehaus/groovy/ast/tools/ClosureUtils.java`
#### Snippet
```java
     * Returns the constant name associated with the given resolve strategy.
     *
     * @see {@link Closure#DELEGATE_FIRST}, et al.
     *
     * @since 3.0.5
```

### JavadocDeclaration
`@param baseType1` tag description is missing
in `src/main/java/org/codehaus/groovy/ast/tools/WideningCategories.java`
#### Snippet
```java
     * Given two class nodes supposedly at the upper common level, returns a class node which is able to represent
     * their lowest upper bound.
     * @param baseType1
     * @param baseType2
     * @param interfaces interfaces both class nodes share, which their lowest common super class do not implement.
```

### JavadocDeclaration
`@param baseType2` tag description is missing
in `src/main/java/org/codehaus/groovy/ast/tools/WideningCategories.java`
#### Snippet
```java
     * their lowest upper bound.
     * @param baseType1
     * @param baseType2
     * @param interfaces interfaces both class nodes share, which their lowest common super class do not implement.
     * @return the class node representing the lowest upper bound
```

### JavadocDeclaration
`@param a` tag description is missing
in `src/main/java/org/codehaus/groovy/ast/tools/WideningCategories.java`
#### Snippet
```java
    /**
     * Compares two class nodes, but including their generics types.
     * @param a
     * @param b
     * @return true if the class nodes are equal, false otherwise
```

### JavadocDeclaration
`@param b` tag description is missing
in `src/main/java/org/codehaus/groovy/ast/tools/WideningCategories.java`
#### Snippet
```java
     * Compares two class nodes, but including their generics types.
     * @param a
     * @param b
     * @return true if the class nodes are equal, false otherwise
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/codehaus/groovy/control/CompilationUnit.java`
#### Snippet
```java
     *
     * @return true if there was a queued source
     * @throws CompilationFailedException
     */
    protected boolean dequeued() throws CompilationFailedException {
```

### JavadocDeclaration
`@param original` tag description is missing
in `src/main/java/org/codehaus/groovy/runtime/MethodRankHelper.java`
#### Snippet
```java
     * most closely resembles original.
     *
     * @param original
     * @param candidates
     * @return a sorted lists of Methods
```

### JavadocDeclaration
`@param candidates` tag description is missing
in `src/main/java/org/codehaus/groovy/runtime/MethodRankHelper.java`
#### Snippet
```java
     *
     * @param original
     * @param candidates
     * @return a sorted lists of Methods
     */
```

### JavadocDeclaration
`@param c` tag description is missing
in `src/main/java/org/codehaus/groovy/runtime/MethodRankHelper.java`
#### Snippet
```java
     * otherwise c is returned.
     * In java 1.5 this can be simplified thanks to the Type class.
     * @param c
     * @return a boxed version of c if c can be boxed, else c
     */
```

### JavadocDeclaration
`@param name` tag description is missing
in `src/main/java/org/codehaus/groovy/runtime/MethodRankHelper.java`
#### Snippet
```java
     * most closely resembles original.
     *
     * @param name
     * @param original
     * @param methods
```

### JavadocDeclaration
`@param original` tag description is missing
in `src/main/java/org/codehaus/groovy/runtime/MethodRankHelper.java`
#### Snippet
```java
     *
     * @param name
     * @param original
     * @param methods
     * @return a sorted lists of Methods
```

### JavadocDeclaration
`@param methods` tag description is missing
in `src/main/java/org/codehaus/groovy/runtime/MethodRankHelper.java`
#### Snippet
```java
     * @param name
     * @param original
     * @param methods
     * @return a sorted lists of Methods
     */
```

### JavadocDeclaration
`@param evictableCache` tag description is missing
in `src/main/java/org/codehaus/groovy/runtime/memoize/EvictableCache.java`
#### Snippet
```java
        /**
         * Deal with the cache
         * @param evictableCache
         */
        R doWith(EvictableCache<K, V> evictableCache);
```

### JavadocDeclaration
`@param key` tag description is missing
in `src/main/java/org/codehaus/groovy/runtime/memoize/LRUCache.java`
#### Snippet
```java
     * The operation is completed atomically.
     *
     * @param key
     * @param valueProvider provide the value if the associated value not found
     */
```

### JavadocDeclaration
`@param key` tag description is missing
in `src/main/java/org/codehaus/groovy/runtime/memoize/UnlimitedConcurrentCache.java`
#### Snippet
```java
     * If not found, create the value by {@link MemoizeCache.ValueProvider} and put it into the cache, at last return the value.
     *
     * @param key
     * @param valueProvider provide the value if the associated value not found
     * @return the cached value
```

### JavadocDeclaration
`@param key` tag description is missing
in `src/main/java/org/codehaus/groovy/runtime/memoize/UnlimitedConcurrentCache.java`
#### Snippet
```java
     * Remove the cached value by the key
     *
     * @param key
     * @return returns the removed value
     */
```

### JavadocDeclaration
`@param includeExtension` tag description is missing
in `src/main/java/org/codehaus/groovy/runtime/metaclass/MetaClassRegistryImpl.java`
#### Snippet
```java
     * Singleton of MetaClassRegistry.
     *
     * @param includeExtension
     * @return the registry
     */
```

### JavadocDeclaration
Wrong tag `returns`
in `src/main/java/org/codehaus/groovy/classgen/asm/OptimizingStatementWriter.java`
#### Snippet
```java
         * Optimizes "Z = X/Y" with Z being int or long style.
         *
         * @returns null if the optimization cannot be applied, otherwise it will return the new target type
         */
        private ClassNode optimizeDivWithIntOrLongTarget(final Expression rhs, final ClassNode assignmentTartgetType) {
```

### JavadocDeclaration
`@param methodVisitor` tag description is missing
in `src/main/java/org/codehaus/groovy/classgen/asm/MethodCallerMultiAdapter.java`
#### Snippet
```java

    /**
     * @param methodVisitor
     * @param numberOfArguments a value &gt; 0 describing how many arguments are additionally used for the method call
     * @param safe
```

### JavadocDeclaration
`@param safe` tag description is missing
in `src/main/java/org/codehaus/groovy/classgen/asm/MethodCallerMultiAdapter.java`
#### Snippet
```java
     * @param methodVisitor
     * @param numberOfArguments a value &gt; 0 describing how many arguments are additionally used for the method call
     * @param safe
     * @param spreadSafe
     */
```

### JavadocDeclaration
`@param spreadSafe` tag description is missing
in `src/main/java/org/codehaus/groovy/classgen/asm/MethodCallerMultiAdapter.java`
#### Snippet
```java
     * @param numberOfArguments a value &gt; 0 describing how many arguments are additionally used for the method call
     * @param safe
     * @param spreadSafe
     */
    public void call(MethodVisitor methodVisitor, int numberOfArguments, boolean safe, boolean spreadSafe) {
```

### JavadocDeclaration
`@param self` tag description is missing
in `src/main/java/org/codehaus/groovy/vmplugin/v10/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     * Get the pid of the current Java process
     *
     * @param self
     * @return the pid
     * @since 4.0.0
```

### JavadocDeclaration
`@param compilationUnit` tag description is missing
in `src/main/java/org/codehaus/groovy/transform/stc/GroovyTypeCheckingExtensionSupport.java`
#### Snippet
```java
     * @param typeCheckingVisitor the type checking visitor
     * @param scriptPath the path to the type checking script (in classpath)
     * @param compilationUnit
     */
    public GroovyTypeCheckingExtensionSupport(
```

### JavadocDeclaration
Class/method reference, quoted text, or HTML link are expected after @see tag
in `src/main/java/org/codehaus/groovy/transform/stc/AbstractTypeCheckingExtension.java`
#### Snippet
```java

    protected final TypeCheckingContext context;
    /** @see {@link #log(String)} */ protected boolean debug;
    /** @see {@link #setHandled(boolean)} */ protected boolean handled;
    private final Set<MethodNode> generatedMethods = new LinkedHashSet<>();
```

### JavadocDeclaration
Class/method reference, quoted text, or HTML link are expected after @see tag
in `src/main/java/org/codehaus/groovy/transform/stc/AbstractTypeCheckingExtension.java`
#### Snippet
```java
    protected final TypeCheckingContext context;
    /** @see {@link #log(String)} */ protected boolean debug;
    /** @see {@link #setHandled(boolean)} */ protected boolean handled;
    private final Set<MethodNode> generatedMethods = new LinkedHashSet<>();
    private final LinkedList<TypeCheckingScope> scopeData = new LinkedList<>();
```

### JavadocDeclaration
`@param genericsSpec` tag description is missing
in `src/main/java/org/codehaus/groovy/transform/trait/TraitComposer.java`
#### Snippet
```java
     * Creates, if necessary, a super forwarder method, for stackable traits.
     * @param forwarder a forwarder method
     * @param genericsSpec
     */
    private static void createSuperForwarder(ClassNode targetNode, MethodNode forwarder, final Map<String,ClassNode> genericsSpec) {
```

### JavadocDeclaration
`@param targetNode` tag description is missing
in `src/main/java/org/codehaus/groovy/transform/trait/TraitComposer.java`
#### Snippet
```java
     * }
     * </pre>
     * @param targetNode
     * @param forwarderMethod
     * @param interfacesToGenerateForwarderFor
```

### JavadocDeclaration
`@param forwarderMethod` tag description is missing
in `src/main/java/org/codehaus/groovy/transform/trait/TraitComposer.java`
#### Snippet
```java
     * </pre>
     * @param targetNode
     * @param forwarderMethod
     * @param interfacesToGenerateForwarderFor
     * @param genericsSpec
```

### JavadocDeclaration
`@param interfacesToGenerateForwarderFor` tag description is missing
in `src/main/java/org/codehaus/groovy/transform/trait/TraitComposer.java`
#### Snippet
```java
     * @param targetNode
     * @param forwarderMethod
     * @param interfacesToGenerateForwarderFor
     * @param genericsSpec
     */
```

### JavadocDeclaration
`@param genericsSpec` tag description is missing
in `src/main/java/org/codehaus/groovy/transform/trait/TraitComposer.java`
#### Snippet
```java
     * @param forwarderMethod
     * @param interfacesToGenerateForwarderFor
     * @param genericsSpec
     */
    private static void doCreateSuperForwarder(final ClassNode targetNode, final MethodNode forwarderMethod, final ClassNode[] interfacesToGenerateForwarderFor, final Map<String,ClassNode> genericsSpec) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java`
#### Snippet
```java
     * @param loader the compiler class loader
     * @return the result of the expression
     * @throws GroovyBugError
     */
    public static Object evaluateExpression(final Expression expr, final CompilerConfiguration config, /*@Nullable*/ final GroovyClassLoader loader) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/groovy/lang/EmptyRange.java`
#### Snippet
```java
     * Always throws <code>UnsupportedOperationException</code> for an empty range.
     *
     * @throws UnsupportedOperationException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/groovy/lang/EmptyRange.java`
#### Snippet
```java
     * Always throws <code>UnsupportedOperationException</code> for an empty range.
     *
     * @throws UnsupportedOperationException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/groovy/lang/EmptyRange.java`
#### Snippet
```java
     * Always throws <code>UnsupportedOperationException</code> for an empty range.
     *
     * @throws UnsupportedOperationException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/groovy/lang/EmptyRange.java`
#### Snippet
```java
     * Always throws <code>UnsupportedOperationException</code> for an empty range.
     *
     * @throws UnsupportedOperationException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/groovy/lang/EmptyRange.java`
#### Snippet
```java
     * Always throws <code>UnsupportedOperationException</code> for an empty range.
     *
     * @throws UnsupportedOperationException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/groovy/lang/EmptyRange.java`
#### Snippet
```java
     * Always throws <code>UnsupportedOperationException</code> for an empty range.
     *
     * @throws UnsupportedOperationException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/groovy/lang/EmptyRange.java`
#### Snippet
```java
     * Always throws <code>UnsupportedOperationException</code> for an empty range.
     *
     * @throws UnsupportedOperationException
     */
    @Override
```

### JavadocDeclaration
`@param uriOrFilename` tag description is missing
in `src/main/java/groovy/ui/GroovyMain.java`
#### Snippet
```java
     * then use {@link GroovyMain#getScriptSource(boolean, String)}.
     *
     * @param uriOrFilename
     * @return the text content at the location
     * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/groovy/ui/GroovyMain.java`
#### Snippet
```java
     * @param uriOrFilename
     * @return the text content at the location
     * @throws IOException
     * @deprecated
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/groovy/ui/GroovyMain.java`
#### Snippet
```java
     * @param script       the location or context of the script
     * @return a new GroovyCodeSource for the given script
     * @throws IOException
     * @throws URISyntaxException
     * @since 2.3.0
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/groovy/ui/GroovyMain.java`
#### Snippet
```java
     * @return a new GroovyCodeSource for the given script
     * @throws IOException
     * @throws URISyntaxException
     * @since 2.3.0
     */
```

### JavadocDeclaration
`@param field` tag description is missing
in `src/main/java/groovy/lang/MetaBeanProperty.java`
#### Snippet
```java
     * Sets the field of this property
     *
     * @param field
     */
    public void setField(CachedField field) {
```

### JavadocDeclaration
`@param codeSource` tag description is missing
in `src/main/java/groovy/lang/GroovyShell.java`
#### Snippet
```java
     * given to the script.
     *
     * @param codeSource
     * @return ready to run script
     */
```

### JavadocDeclaration
`@param codeSource` tag description is missing
in `src/main/java/groovy/lang/GroovyShell.java`
#### Snippet
```java
     * Evaluates some script against the current Binding and returns the result
     *
     * @param codeSource
     * @throws CompilationFailedException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/groovy/lang/GroovyShell.java`
#### Snippet
```java
     *
     * @param codeSource
     * @throws CompilationFailedException
     */
    public Object evaluate(GroovyCodeSource codeSource) throws CompilationFailedException {
```

### JavadocDeclaration
`@param codeSource` tag description is missing
in `src/main/java/groovy/lang/GroovyShell.java`
#### Snippet
```java
     * given to the script.
     *
     * @param codeSource
     * @param binding
     * @return ready to run script
```

### JavadocDeclaration
`@param binding` tag description is missing
in `src/main/java/groovy/lang/GroovyShell.java`
#### Snippet
```java
     *
     * @param codeSource
     * @param binding
     * @return ready to run script
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/groovy/lang/GroovyClassLoader.java`
#### Snippet
```java
     * invoked. Any classes that are already loaded are still accessible.
     *
     * @throws IOException
     * @see URLClassLoader#close()
     * @see #clearCache()
```

### JavadocDeclaration
`@param classNode` tag description is missing
in `src/main/java/groovy/lang/GroovyClassLoader.java`
#### Snippet
```java
     * WARNING: this compilation is not synchronized
     *
     * @param classNode
     * @return a class
     */
```

### JavadocDeclaration
Exception is not declared to be thrown by method getProperty
in `src/main/java/groovy/lang/MetaExpandoProperty.java`
#### Snippet
```java
    /**
     * @return the property of the given object
     * @throws Exception if the property could not be evaluated
     */
    @Override
```

### JavadocDeclaration
`@param metaMethod` tag description is missing
in `src/main/java/groovy/lang/ExpandoMetaClass.java`
#### Snippet
```java
     * Registers a new instance method for the given method name and closure on this MetaClass
     *
     * @param metaMethod
     */
    public void registerInstanceMethod(final MetaMethod metaMethod) {
```

### JavadocDeclaration
`@param cause` tag description is missing
in `src/main/java/groovy/util/ResourceException.java`
#### Snippet
```java

    /**
     * @param cause
     */
    public ResourceException(Throwable cause) {
```

### JavadocDeclaration
`@param message` tag description is missing
in `src/main/java/groovy/util/ResourceException.java`
#### Snippet
```java

    /**
     * @param message
     */
    public ResourceException(String message) {
```

### JavadocDeclaration
`@param message` tag description is missing
in `src/main/java/groovy/util/ResourceException.java`
#### Snippet
```java

    /**
     * @param message
     * @param cause
     */
```

### JavadocDeclaration
`@param cause` tag description is missing
in `src/main/java/groovy/util/ResourceException.java`
#### Snippet
```java
    /**
     * @param message
     * @param cause
     */
    public ResourceException(String message, Throwable cause) {
```

### JavadocDeclaration
`@param name` tag description is missing
in `src/main/java/groovy/util/ResourceConnector.java`
#### Snippet
```java
     * Retrieve a URLConnection to a script referenced by name.
     *
     * @param name
     * @throws ResourceException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/groovy/util/ResourceConnector.java`
#### Snippet
```java
     *
     * @param name
     * @throws ResourceException
     */
    URLConnection getResourceConnection(String name) throws ResourceException;
```

### JavadocDeclaration
`@param message` tag description is missing
in `src/main/java/groovy/util/ScriptException.java`
#### Snippet
```java

    /**
     * @param message
     */
    public ScriptException(String message) {
```

### JavadocDeclaration
`@param message` tag description is missing
in `src/main/java/groovy/util/ScriptException.java`
#### Snippet
```java

    /**
     * @param message
     * @param cause
     */
```

### JavadocDeclaration
`@param cause` tag description is missing
in `src/main/java/groovy/util/ScriptException.java`
#### Snippet
```java
    /**
     * @param message
     * @param cause
     */
    public ScriptException(String message, Throwable cause) {
```

### JavadocDeclaration
`@param cause` tag description is missing
in `src/main/java/groovy/util/ScriptException.java`
#### Snippet
```java

    /**
     * @param cause
     */
    public ScriptException(Throwable cause) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/groovy/util/GroovyScriptEngine.java`
#### Snippet
```java
     * @param resourceName name of the resource to be retrieved
     * @return a URLConnection to the resource
     * @throws ResourceException
     */
    @Override
```

### JavadocDeclaration
Wrong tag `em`
in `src/main/java/groovy/transform/TupleConstructor.java`
#### Snippet
```java
     * default values are given for the respective property/field.
     * Additional positional constructors are generated as per Groovy's normal default value processing.
     * Properties/fields with an explicit initial value are deemed {@em optional} and may be dropped.
     * Properties/fields with no initial value are deemed {@em mandatory} and must be supplied as an argument to the respective constructor.
     * Optional arguments to a positional constructor are dropped from the right.
```

### JavadocDeclaration
Wrong tag `em`
in `src/main/java/groovy/transform/TupleConstructor.java`
#### Snippet
```java
     * Additional positional constructors are generated as per Groovy's normal default value processing.
     * Properties/fields with an explicit initial value are deemed {@em optional} and may be dropped.
     * Properties/fields with no initial value are deemed {@em mandatory} and must be supplied as an argument to the respective constructor.
     * Optional arguments to a positional constructor are dropped from the right.
     *
```

### JavadocDeclaration
`@param usage` tag description is missing
in `src/main/java/groovy/transform/stc/FromString.java`
#### Snippet
```java
     * @param compilationUnit the compilation unit (of the file being compiled)
     * @param mn the method node
     * @param usage
     * @return a class node if it could be parsed and resolved, null otherwise
     */
```

### JavadocDeclaration
`@param commandLineList` tag description is missing
in `subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovyc.java`
#### Snippet
```java
     * Add "groovyc" parameters to the commandLineList, based on the ant configuration.
     *
     * @param commandLineList
     * @param jointOptions
     * @param classpath
```

### JavadocDeclaration
`@param jointOptions` tag description is missing
in `subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovyc.java`
#### Snippet
```java
     *
     * @param commandLineList
     * @param jointOptions
     * @param classpath
     */
```

### JavadocDeclaration
`@param classpath` tag description is missing
in `subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovyc.java`
#### Snippet
```java
     * @param commandLineList
     * @param jointOptions
     * @param classpath
     */
    private void doNormalCommandLineList(List<String> commandLineList, List<String> jointOptions, Path classpath) {
```

### JavadocDeclaration
`@param receiver` tag description is missing
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
     * {@code it} may be inferred.
     *
     * @param receiver
     * @param arguments
     * @param expression closure or lambda expression for which the argument types should be inferred
```

### JavadocDeclaration
`@param arguments` tag description is missing
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
     *
     * @param receiver
     * @param arguments
     * @param expression closure or lambda expression for which the argument types should be inferred
     * @param target     parameter which may provide {@link ClosureParams} annotation or SAM type
```

### JavadocDeclaration
`@param filter` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxHandler.java`
#### Snippet
```java
     * Creates a new instance of MasterFrameHandler
     *
     * @param filter
     */
    public StructuredSyntaxHandler(StructuredSyntaxDocumentFilter filter) {
```

### JavadocDeclaration
`@param regexps` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java

        /**
         * @param regexps
         */
        public void removeStyle(String regexps[]) {
```

### JavadocDeclaration
`@param offset` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
     * position.  Called by the filter after it has updated the text.
     *
     * @param offset
     * @param length
     * @throws BadLocationException
```

### JavadocDeclaration
`@param length` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
     *
     * @param offset
     * @param length
     * @throws BadLocationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
     * @param offset
     * @param length
     * @throws BadLocationException
     */
    protected void parseDocument(int offset, int length) throws BadLocationException {
```

### JavadocDeclaration
`@param regexp` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java

        /**
         * @param regexp
         */
        public void removeChild(String regexp) {
```

### JavadocDeclaration
`@param regexp` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java

        /**
         * @param regexp
         */
        public void removeStyle(String regexp) {
```

### JavadocDeclaration
`@param buffer` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java

        /**
         * @param buffer
         * @param offset
         * @param length
```

### JavadocDeclaration
`@param offset` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
        /**
         * @param buffer
         * @param offset
         * @param length
         * @throws BadLocationException
```

### JavadocDeclaration
`@param length` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
         * @param buffer
         * @param offset
         * @param length
         * @throws BadLocationException
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
         * @param offset
         * @param length
         * @throws BadLocationException
         */
        public void parse(CharBuffer buffer, int offset, int length) throws BadLocationException {
```

### JavadocDeclaration
`@param regexps` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java

        /**
         * @param regexps
         * @param node
         */
```

### JavadocDeclaration
`@param node` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
        /**
         * @param regexps
         * @param node
         */
        public void putChild(String[] regexps, LexerNode node) {
```

### JavadocDeclaration
`@param fb` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
     * set.
     *
     * @param fb
     * @param offset
     * @param length
```

### JavadocDeclaration
`@param offset` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
     *
     * @param fb
     * @param offset
     * @param length
     * @param text
```

### JavadocDeclaration
`@param length` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
     * @param fb
     * @param offset
     * @param length
     * @param text
     * @param attrs
```

### JavadocDeclaration
`@param text` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
     * @param offset
     * @param length
     * @param text
     * @param attrs
     * @throws BadLocationException
```

### JavadocDeclaration
`@param attrs` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
     * @param length
     * @param text
     * @param attrs
     * @throws BadLocationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
     * @param text
     * @param attrs
     * @throws BadLocationException
     */
    @Override
```

### JavadocDeclaration
`@param regexp` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java

        /**
         * @param regexp
         * @param node
         */
```

### JavadocDeclaration
`@param node` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
        /**
         * @param regexp
         * @param node
         */
        public void putChild(String regexp, LexerNode node) {
```

### JavadocDeclaration
`@param fb` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
     * set.
     *
     * @param fb
     * @param offset
     * @param length
```

### JavadocDeclaration
`@param offset` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
     *
     * @param fb
     * @param offset
     * @param length
     * @throws BadLocationException
```

### JavadocDeclaration
`@param length` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
     * @param fb
     * @param offset
     * @param length
     * @throws BadLocationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
     * @param offset
     * @param length
     * @throws BadLocationException
     */
    @Override
```

### JavadocDeclaration
`@param fb` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
     * set.
     *
     * @param fb
     * @param offset
     * @param text
```

### JavadocDeclaration
`@param offset` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
     *
     * @param fb
     * @param offset
     * @param text
     * @param attrs
```

### JavadocDeclaration
`@param text` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
     * @param fb
     * @param offset
     * @param text
     * @param attrs
     * @throws BadLocationException
```

### JavadocDeclaration
`@param attrs` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
     * @param offset
     * @param text
     * @param attrs
     * @throws BadLocationException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
     * @param text
     * @param attrs
     * @throws BadLocationException
     */
    @Override
```

### JavadocDeclaration
`@param regexps` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java

        /**
         * @param regexps
         * @param style
         */
```

### JavadocDeclaration
`@param style` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
        /**
         * @param regexps
         * @param style
         */
        public void putStyle(String regexps[], Style style) {
```

### JavadocDeclaration
`@param regexp` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java

        /**
         * @param regexp
         * @param style
         */
```

### JavadocDeclaration
`@param style` tag description is missing
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
        /**
         * @param regexp
         * @param style
         */
        public void putStyle(String regexp, Style style) {
```

### JavadocDeclaration
`@param key` tag description is missing
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/ValueMapImpl.java`
#### Snippet
```java
     * Get the items for the key.
     *
     * @param key
     * @return the items for the given key
     */
```

### JavadocDeclaration
`@param jsonPayload` tag description is missing
in `subprojects/groovy-json/src/main/java/groovy/json/JsonOutput.java`
#### Snippet
```java
     * Pretty print a JSON payload.
     *
     * @param jsonPayload
     * @return a pretty representation of JSON payload.
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-json/src/main/java/groovy/json/JsonLexer.java`
#### Snippet
```java
     * Method not implemented.
     *
     * @throws UnsupportedOperationException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-json/src/main/java/groovy/json/StreamingJsonBuilder.java`
#### Snippet
```java
         * @param name The name of the JSON attribute
         * @param list The list representing the array
         * @throws IOException
         */
        public void call(String name, List<Object> list) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-json/src/main/java/groovy/json/StreamingJsonBuilder.java`
#### Snippet
```java
         * @param name The attribute name
         * @param value The value
         * @throws IOException
         */
        public void call(String name, Object value, @DelegatesTo(value = StreamingJsonDelegate.class, strategy = Closure.DELEGATE_FIRST) Closure callable) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-json/src/main/java/groovy/json/StreamingJsonBuilder.java`
#### Snippet
```java
         * @param name The name of the JSON attribute
         * @param array The list representing the array
         * @throws IOException
         */
        public void call(String name, Object... array) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-json/src/main/java/groovy/json/StreamingJsonBuilder.java`
#### Snippet
```java
     * @param content a pre-existing data structure, default to null
     * @param generator used to generate the output
     * @throws IOException
     * @since 2.5.0
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-json/src/main/java/groovy/json/StreamingJsonBuilder.java`
#### Snippet
```java
         * @param name The attribute name
         * @param json The writable value
         * @throws IOException
         */
        public void call(String name, Writable json) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-json/src/main/java/groovy/json/StreamingJsonBuilder.java`
#### Snippet
```java
         * @param name The attribute name
         * @param json The value
         * @throws IOException
         */
        public void call(String name, JsonOutput.JsonUnescaped json) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-json/src/main/java/groovy/json/StreamingJsonBuilder.java`
#### Snippet
```java
         * @param name The attribute name
         * @param value The value
         * @throws IOException
         */
        public void call(String name, Object value) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-json/src/main/java/groovy/json/StreamingJsonBuilder.java`
#### Snippet
```java
         * @param name The attribute name
         * @param value The value
         * @throws IOException
         */
        public void call(String name, @DelegatesTo(value = StreamingJsonDelegate.class, strategy = Closure.DELEGATE_FIRST) Closure value) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-json/src/main/java/groovy/json/StreamingJsonBuilder.java`
#### Snippet
```java
     * @param map The attributes of the JSON object
     * @param callable Additional attributes of the JSON object represented by the closure
     * @throws IOException
     */
    public void call(String name, Map map, @DelegatesTo(value = StreamingJsonDelegate.class, strategy = Closure.DELEGATE_FIRST) Closure callable) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-json/src/main/java/groovy/json/StreamingJsonBuilder.java`
#### Snippet
```java
     *
     * @param name The name of the empty object to create
     * @throws IOException
     */
    public void call(String name) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-json/src/main/java/groovy/json/StreamingJsonBuilder.java`
#### Snippet
```java
     * @param writer  A writer to which Json will be written
     * @param content a pre-existing data structure, default to null
     * @throws IOException
     */
    public StreamingJsonBuilder(Writer writer, Object content) throws IOException {
```

### JavadocDeclaration
`@param reader` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
         * </pre>
         *
         * @param reader
         * @param parentLoader
         * @throws CompilationFailedException
```

### JavadocDeclaration
`@param parentLoader` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
         *
         * @param reader
         * @param parentLoader
         * @throws CompilationFailedException
         * @throws ClassNotFoundException
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
         * @param reader
         * @param parentLoader
         * @throws CompilationFailedException
         * @throws ClassNotFoundException
         * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
         * @param parentLoader
         * @throws CompilationFailedException
         * @throws ClassNotFoundException
         * @throws IOException
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
         * @throws CompilationFailedException
         * @throws ClassNotFoundException
         * @throws IOException
         */
        GStringTemplate(final Reader reader, final ClassLoader parentLoader) throws CompilationFailedException, ClassNotFoundException, IOException {
```

### JavadocDeclaration
`@param pendingC` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
         * then write the section as a statement
         *
         * @param pendingC
         * @param reader
         * @param writingString
```

### JavadocDeclaration
`@param reader` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
         *
         * @param pendingC
         * @param reader
         * @param writingString
         * @param templateExpressions
```

### JavadocDeclaration
`@param writingString` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
         * @param pendingC
         * @param reader
         * @param writingString
         * @param templateExpressions
         * @throws IOException
```

### JavadocDeclaration
`@param templateExpressions` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
         * @param reader
         * @param writingString
         * @param templateExpressions
         * @throws IOException
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
         * @param writingString
         * @param templateExpressions
         * @throws IOException
         */
        private static void parseSection(final int pendingC,
```

### JavadocDeclaration
`@param reader` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
         * Parse a &lt;%= .... %&gt; expression
         *
         * @param reader
         * @param writingString
         * @param templateExpressions
```

### JavadocDeclaration
`@param writingString` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
         *
         * @param reader
         * @param writingString
         * @param templateExpressions
         * @throws IOException
```

### JavadocDeclaration
`@param templateExpressions` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
         * @param reader
         * @param writingString
         * @param templateExpressions
         * @throws IOException
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
         * @param writingString
         * @param templateExpressions
         * @throws IOException
         */
        private static void parseExpression(final Reader reader,
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/TemplateResolver.java`
#### Snippet
```java
     * @param templatePath path to the template
     * @return the template URL, that will be used to load the template
     * @throws IOException
     */
    URL resolveTemplate(String templatePath) throws IOException;
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/BaseTemplate.java`
#### Snippet
```java
     * @param templateName the name of the template to be used as a layout
     * @return this template instance
     * @throws IOException
     * @throws ClassNotFoundException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/BaseTemplate.java`
#### Snippet
```java
     * @return this template instance
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object layout(Map model, String templateName) throws IOException, ClassNotFoundException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/BaseTemplate.java`
#### Snippet
```java
     * @param args tag generation arguments
     * @return this template instance
     * @throws IOException
     */
    public Object methodMissing(String tagName, Object args) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/BaseTemplate.java`
#### Snippet
```java
     * @param attrs the attributes to render
     * @return this template instance
     * @throws IOException
     */
    public BaseTemplate pi(Map<?, ?> attrs) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/BaseTemplate.java`
#### Snippet
```java
     * @param obj the object to be rendered
     * @return this template instance
     * @throws IOException
     */
    public BaseTemplate yield(Object obj) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/BaseTemplate.java`
#### Snippet
```java
     * @param cs the object to be rendered inside an XML comment block.
     * @return this template instance.
     * @throws IOException
     */
    public BaseTemplate comment(Object cs) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/BaseTemplate.java`
#### Snippet
```java
     * @param templateText template body
     * @return this template instance
     * @throws IOException
     * @throws ClassNotFoundException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/BaseTemplate.java`
#### Snippet
```java
     * @return this template instance
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object fragment(Map model, String templateText) throws IOException, ClassNotFoundException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/BaseTemplate.java`
#### Snippet
```java
     * Adds a new line to the output. The new line string can be configured by
     * {@link groovy.text.markup.TemplateConfiguration#setNewLineString(String)}
     * @throws IOException
     */
    public void newLine() throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/BaseTemplate.java`
#### Snippet
```java
     * @param obj the object to be rendered unescaped
     * @return this template instance
     * @throws IOException
     */
    public BaseTemplate yieldUnescaped(Object obj) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/BaseTemplate.java`
#### Snippet
```java
     * Includes another template inside this template.
     * @param templatePath the path to the included resource.
     * @throws IOException
     * @throws ClassNotFoundException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/BaseTemplate.java`
#### Snippet
```java
     * @param templatePath the path to the included resource.
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void includeGroovy(String templatePath) throws IOException, ClassNotFoundException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/BaseTemplate.java`
#### Snippet
```java
     *
     * @param templatePath the path to the other file
     * @throws IOException
     */
    public void includeEscaped(String templatePath) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/BaseTemplate.java`
#### Snippet
```java
     * @param out the Writer to which this Writable should output its data.
     * @return a writer instance
     * @throws IOException
     */
    @Override
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/BaseTemplate.java`
#### Snippet
```java
     * @param inheritModel a boolean indicating if we should inherit the parent model
     * @return this template instance
     * @throws IOException
     * @throws ClassNotFoundException
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/BaseTemplate.java`
#### Snippet
```java
     * @return this template instance
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object layout(Map model, String templateName, boolean inheritModel) throws IOException, ClassNotFoundException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/BaseTemplate.java`
#### Snippet
```java
     * then the encoding is rendered into the declaration.
     * @return this template instance
     * @throws IOException
     */
    public BaseTemplate xmlDeclaration() throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/BaseTemplate.java`
#### Snippet
```java
     *
     * @param templatePath the path to the other file
     * @throws IOException
     */
    public void includeUnescaped(String templatePath) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/StreamingTemplateEngine.java`
#### Snippet
```java
         * @param sourcePosition The reader position in the source stream
         * @param targetPosition The writer position in the target stream
         * @throws IOException
         * @throws FinishedReadingException
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/StreamingTemplateEngine.java`
#### Snippet
```java
         * @param targetPosition The writer position in the target stream
         * @throws IOException
         * @throws FinishedReadingException
         */
        private void parseDollarCurlyIdentifier(final Reader reader,
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/StreamingTemplateEngine.java`
#### Snippet
```java
         * specifically, returns true if the first character after the dollar sign is a valid
         * java identifier. Note that the dollar curly syntax is handled by another method.
         * @throws IOException
         * @throws FinishedReadingException If we encountered the end of the source stream.
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/StreamingTemplateEngine.java`
#### Snippet
```java
         * @param source       A reader into the template source data
         * @param parentLoader A class loader we use
         * @throws CompilationFailedException
         * @throws ClassNotFoundException
         * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/StreamingTemplateEngine.java`
#### Snippet
```java
         * @param parentLoader A class loader we use
         * @throws CompilationFailedException
         * @throws ClassNotFoundException
         * @throws IOException
         */
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-templates/src/main/groovy/groovy/text/StreamingTemplateEngine.java`
#### Snippet
```java
         * @throws CompilationFailedException
         * @throws ClassNotFoundException
         * @throws IOException
         */
        StreamingTemplate(final Reader source, final ClassLoader parentLoader) throws CompilationFailedException, ClassNotFoundException, IOException {
```

### JavadocDeclaration
`@param expected` tag description is missing
in `subprojects/groovy-test/src/main/java/groovy/test/GroovyTestCase.java`
#### Snippet
```java
     * Asserts that the arrays are equivalent and contain the same values
     *
     * @param expected
     * @param value
     */
```

### JavadocDeclaration
`@param value` tag description is missing
in `subprojects/groovy-test/src/main/java/groovy/test/GroovyTestCase.java`
#### Snippet
```java
     *
     * @param expected
     * @param value
     */
    protected void assertArrayEquals(Object[] expected, Object[] value) {
```

### JavadocDeclaration
`@param coll` tag description is missing
in `subprojects/groovy-toml/src/main/java/groovy/toml/TomlBuilder.java`
#### Snippet
```java
    /**
     * Delegates to {@link #call(Iterable, Closure)}
     * @param coll
     * @param c
     */
```

### JavadocDeclaration
`@param c` tag description is missing
in `subprojects/groovy-toml/src/main/java/groovy/toml/TomlBuilder.java`
#### Snippet
```java
     * Delegates to {@link #call(Iterable, Closure)}
     * @param coll
     * @param c
     */
    public Object call(Collection coll, Closure c) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-xml/src/main/java/groovy/xml/XmlUtil.java`
#### Snippet
```java
     * @param schema         a URL pointing to the schema to validate against
     * @return the created SAXParser
     * @throws SAXException
     * @throws ParserConfigurationException
     * @since 1.8.7
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-xml/src/main/java/groovy/xml/XmlUtil.java`
#### Snippet
```java
     * @return the created SAXParser
     * @throws SAXException
     * @throws ParserConfigurationException
     * @since 1.8.7
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-xml/src/main/java/groovy/xml/XmlUtil.java`
#### Snippet
```java
     * @param schema         a URL pointing to the schema to validate against
     * @return the created SAXParser
     * @throws SAXException
     * @throws ParserConfigurationException
     * @see #newSAXParser(String, boolean, boolean, URL)
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-xml/src/main/java/groovy/xml/XmlUtil.java`
#### Snippet
```java
     * @return the created SAXParser
     * @throws SAXException
     * @throws ParserConfigurationException
     * @see #newSAXParser(String, boolean, boolean, URL)
     * @since 1.8.7
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-xml/src/main/java/groovy/xml/XmlUtil.java`
#### Snippet
```java
     * @param schemas        the schemas to validate against
     * @return the created SAXParser
     * @throws SAXException
     * @throws ParserConfigurationException
     * @see #newSAXParser(String, boolean, boolean, Source...)
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-xml/src/main/java/groovy/xml/XmlUtil.java`
#### Snippet
```java
     * @return the created SAXParser
     * @throws SAXException
     * @throws ParserConfigurationException
     * @see #newSAXParser(String, boolean, boolean, Source...)
     * @since 1.8.7
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-xml/src/main/java/groovy/xml/XmlUtil.java`
#### Snippet
```java
     * @param schema         a file containing the schema to validate against
     * @return the created SAXParser
     * @throws SAXException
     * @throws ParserConfigurationException
     * @see #newSAXParser(String, boolean, boolean, File)
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-xml/src/main/java/groovy/xml/XmlUtil.java`
#### Snippet
```java
     * @return the created SAXParser
     * @throws SAXException
     * @throws ParserConfigurationException
     * @see #newSAXParser(String, boolean, boolean, File)
     * @since 1.8.7
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-xml/src/main/java/groovy/xml/XmlUtil.java`
#### Snippet
```java
     * @param schemas          the schemas to validate against
     * @return the created SAXParser
     * @throws SAXException
     * @throws ParserConfigurationException
     * @since 3.0.11
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-xml/src/main/java/groovy/xml/XmlUtil.java`
#### Snippet
```java
     * @return the created SAXParser
     * @throws SAXException
     * @throws ParserConfigurationException
     * @since 3.0.11
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-xml/src/main/java/groovy/xml/XmlUtil.java`
#### Snippet
```java
     * @param schema         a file containing the schema to validate against
     * @return the created SAXParser
     * @throws SAXException
     * @throws ParserConfigurationException
     * @since 1.8.7
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-xml/src/main/java/groovy/xml/XmlUtil.java`
#### Snippet
```java
     * @return the created SAXParser
     * @throws SAXException
     * @throws ParserConfigurationException
     * @since 1.8.7
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-xml/src/main/java/groovy/xml/XmlUtil.java`
#### Snippet
```java
     * @param schemas        the schemas to validate against
     * @return the created SAXParser
     * @throws SAXException
     * @throws ParserConfigurationException
     * @since 1.8.7
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/groovy-xml/src/main/java/groovy/xml/XmlUtil.java`
#### Snippet
```java
     * @return the created SAXParser
     * @throws SAXException
     * @throws ParserConfigurationException
     * @since 1.8.7
     */
```

### JavadocDeclaration
`@param coll` tag description is missing
in `subprojects/groovy-yaml/src/main/java/groovy/yaml/YamlBuilder.java`
#### Snippet
```java
    /**
     * Delegates to {@link #call(Iterable, Closure)}
     * @param coll
     * @param c
     */
```

### JavadocDeclaration
`@param c` tag description is missing
in `subprojects/groovy-yaml/src/main/java/groovy/yaml/YamlBuilder.java`
#### Snippet
```java
     * Delegates to {@link #call(Iterable, Closure)}
     * @param coll
     * @param c
     */
    public Object call(Collection coll, Closure c) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/stress/src/stressTest/java/org/codehaus/groovy/util/ManagedConcurrentValueMapStressTest.java`
#### Snippet
```java
     * won't always be detected in one run.
     *
     * @throws Exception
     */
    @Test
```

### JavadocDeclaration
`@throws` tag description is missing
in `subprojects/stress/src/stressTest/java/org/codehaus/groovy/util/ManagedConcurrentMapStressTest.java`
#### Snippet
```java
     * won't always be detected in one run.
     *
     * @throws Exception
     */
    @Test
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `(Weigher``)IterableWeigher.INSTANCE` to `Weigher`> is redundant
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/Weighers.java`
#### Snippet
```java
  @SuppressWarnings({"cast", "unchecked"})
  public static <E> Weigher<? super Iterable<E>> iterable() {
    return (Weigher<Iterable<E>>) (Weigher<?>) IterableWeigher.INSTANCE;
  }

```

### RedundantCast
Casting `(Weigher``)ListWeigher.INSTANCE` to `Weigher`> is redundant
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/Weighers.java`
#### Snippet
```java
  @SuppressWarnings({"cast", "unchecked"})
  public static <E> Weigher<? super List<E>> list() {
    return (Weigher<List<E>>) (Weigher<?>) ListWeigher.INSTANCE;
  }

```

### RedundantCast
Casting `(Weigher``)CollectionWeigher.INSTANCE` to `Weigher`> is redundant
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/Weighers.java`
#### Snippet
```java
  @SuppressWarnings({"cast", "unchecked"})
  public static <E> Weigher<? super Collection<E>> collection() {
    return (Weigher<Collection<E>>) (Weigher<?>) CollectionWeigher.INSTANCE;
  }

```

### RedundantCast
Casting `(Weigher``)MapWeigher.INSTANCE` to `Weigher`> is redundant
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/Weighers.java`
#### Snippet
```java
  @SuppressWarnings({"cast", "unchecked"})
  public static <A, B> Weigher<? super Map<A, B>> map() {
    return (Weigher<Map<A, B>>) (Weigher<?>) MapWeigher.INSTANCE;
  }

```

### RedundantCast
Casting `(Weigher``)SetWeigher.INSTANCE` to `Weigher`> is redundant
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/Weighers.java`
#### Snippet
```java
  @SuppressWarnings({"cast", "unchecked"})
  public static <E> Weigher<? super Set<E>> set() {
    return (Weigher<Set<E>>) (Weigher<?>) SetWeigher.INSTANCE;
  }

```

### RedundantCast
Casting `docCommentNodeText` to `Object` is redundant
in `src/main/java/org/apache/groovy/parser/antlr4/GroovydocManager.java`
#### Snippet
```java
                // if no doc comment node found and no siblings of same type before the node,
                // try to find doc comment node of its parent
                if (!asBoolean((Object) docCommentNodeText) && !sameTypeNodeBefore) {
                    return findDocCommentByNode(parentContext);
                }
```

### RedundantCast
Casting `text` to `CharSequence` is redundant
in `src/main/java/org/apache/groovy/parser/antlr4/util/StringUtils.java`
#### Snippet
```java
		}

		String result = StringGroovyMethods.replaceAll((CharSequence) text, STANDARD_ESCAPES_PATTERN, new Closure<Void>(null, null) {
			Object doCall(String _0, String _1, String _2) {
				if (isLengthOdd(_1)) {
```

### RedundantCast
Casting `text` to `CharSequence` is redundant
in `src/main/java/org/apache/groovy/parser/antlr4/util/StringUtils.java`
#### Snippet
```java
		}

		return StringGroovyMethods.replaceAll((CharSequence) text, OCTAL_ESCAPES_PATTERN, new Closure<Void>(null, null) {
			Object doCall(String _0, String _1, String _2) {
				if (isLengthOdd(_1)) {
```

### RedundantCast
Casting `text` to `CharSequence` is redundant
in `src/main/java/org/apache/groovy/parser/antlr4/util/StringUtils.java`
#### Snippet
```java
		}

		return StringGroovyMethods.replaceAll((CharSequence) text, HEX_ESCAPES_PATTERN, new Closure<Void>(null, null) {
			Object doCall(String _0, String _1, String _2) {
				if (isLengthOdd(_1)) {
```

### RedundantCast
Casting `text` to `CharSequence` is redundant
in `src/main/java/org/apache/groovy/parser/antlr4/util/StringUtils.java`
#### Snippet
```java
		}

		text = StringGroovyMethods.replaceAll((CharSequence) text, LINE_ESCAPE_PATTERN, new Closure<Void>(null, null) {
			Object doCall(String _0, String _1) {
				if (isLengthOdd(_1)) {
```

### RedundantCast
Casting `() -> {...}` to `PrivilegedExceptionAction` is redundant
in `src/main/java/org/apache/groovy/internal/util/ReevaluatingReference.java`
#### Snippet
```java
        try {
            //TODO Jochen: move the findSpecial to a central place together with others to easy security configuration
            FALLBACK_HANDLE = doPrivileged((PrivilegedExceptionAction<MethodHandle>) () -> MethodHandles.lookup().findSpecial(
                    ReevaluatingReference.class, "replacePayLoad",
                    MethodType.methodType(Object.class),
```

### RedundantCast
Casting `innerMap.put(...)` to `V` is redundant
in `src/main/java/org/codehaus/groovy/util/ListHashMap.java`
#### Snippet
```java
            }
        }
        V val = (V) innerMap.put(key, value);
        size = innerMap.size();
        return val;
```

### RedundantCast
Casting `e` to `Entry` is redundant
in `src/main/java/org/codehaus/groovy/util/SingleKeyHashMap.java`
#### Snippet
```java
    for (; e != null; e = e.next)
        if (e.hash == h && ((Entry) e).key.equals(key))
          return ((Entry)e).value;

    return null;
```

### RedundantCast
Casting `paths` to `Iterable` is redundant
in `src/main/java/org/codehaus/groovy/tools/javac/JavacJavaCompiler.java`
#### Snippet
```java

            params.add("-classpath");
            params.add(DefaultGroovyMethods.join((Iterable<String>) paths, File.pathSeparator));
        }

```

### RedundantCast
Casting `e.getCause()` to `MissingMethodException` is redundant
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
            } catch (MissingMethodException e) {
                if (e instanceof MissingMethodExecutionFailed) {
                    throw (MissingMethodException)e.getCause();
                } else if (!intercepting && receiver.getClass() == e.getType() && e.getMethod().equals(messageName)) {
                    // in case there's nothing else, invoke the object's own invokeMethod()
```

### RedundantCast
Casting `regex.toString()` to `CharSequence` is redundant
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java

    public static Pattern regexPattern(final Object regex) {
        return StringGroovyMethods.bitwiseNegate((CharSequence)regex.toString());
    }

```

### RedundantCast
Casting `null` to `OutputStream` is redundant
in `src/main/java/org/codehaus/groovy/runtime/ProcessGroovyMethods.java`
#### Snippet
```java
     */
    public static void waitForProcessOutput(Process self) {
        waitForProcessOutput(self, (OutputStream)null, (OutputStream)null);
    }

```

### RedundantCast
Casting `null` to `OutputStream` is redundant
in `src/main/java/org/codehaus/groovy/runtime/ProcessGroovyMethods.java`
#### Snippet
```java
     */
    public static void consumeProcessOutput(Process self) {
        consumeProcessOutput(self, (OutputStream)null, (OutputStream)null);
    }

```

### RedundantCast
Casting `f` to `Object` is redundant
in `src/main/java/org/codehaus/groovy/runtime/ResourceGroovyMethods.java`
#### Snippet
```java
            return (T) asWritable(f);
        }
        return DefaultGroovyMethods.asType((Object) f, c);
    }

```

### RedundantCast
Casting `files` to `Iterable` is redundant
in `src/main/java/org/codehaus/groovy/runtime/ResourceGroovyMethods.java`
#### Snippet
```java
        if (origFiles != null) {
            List<File> files = Arrays.asList(origFiles);
            if (sort != null) files = DefaultGroovyMethods.sort((Iterable<File>) files, sort);
            for (File file : files) {
                if (file.isDirectory()) {
```

### RedundantCast
Casting `self.toString()` to `CharSequence` is redundant
in `src/main/java/org/codehaus/groovy/runtime/StringGroovyMethods.java`
#### Snippet
```java
     */
    public static <T> T eachLine(final CharSequence self, @ClosureParams(value=FromString.class, options={"String","String,Integer"}) final Closure<T> closure) throws IOException {
        return eachLine((CharSequence)self.toString(), 0, closure);
    }

```

### RedundantCast
Casting `replacements.entrySet()` to `Iterable`> is redundant
in `src/main/java/org/codehaus/groovy/runtime/StringGroovyMethods.java`
#### Snippet
```java
        public ReplaceState(Map<CharSequence, CharSequence> replacements) {
            this.noMoreMatches = new boolean[replacements.size()];
            this.replacementsList = DefaultGroovyMethods.toList((Iterable<Map.Entry<CharSequence,CharSequence>>) replacements.entrySet());
        }

```

### RedundantCast
Casting `() -> {...}` to `PrivilegedAction` is redundant
in `src/main/java/org/codehaus/groovy/runtime/callsite/CallSiteArray.java`
#### Snippet
```java

    private static CallSite createCallStaticSite(CallSite callSite, final Class receiver, Object[] args) {
        doPrivileged((PrivilegedAction<Void>) () -> {
            try {
                Class.forName(receiver.getName(), true, receiver.getClassLoader());
```

### RedundantCast
Casting `e.getCause()` to `MissingMethodException` is redundant
in `src/main/java/org/codehaus/groovy/runtime/callsite/PogoMetaClassSite.java`
#### Snippet
```java
                } catch (MissingMethodException e) {
                    if (e instanceof MissingMethodExecutionFailed) {
                        throw (MissingMethodException) e.getCause();
                    } else if (receiver.getClass() == e.getType() && e.getMethod().equals(name)) {
                        // in case there's nothing else, invoke the receiver's own invokeMethod()
```

### RedundantCast
Casting `mme.getCause()` to `MissingMethodException` is redundant
in `src/main/java/org/codehaus/groovy/runtime/callsite/PogoMetaClassSite.java`
#### Snippet
```java
                        } catch (MissingMethodException mme) {
                            if (mme instanceof MissingMethodExecutionFailed)
                                throw (MissingMethodException) mme.getCause();
                            // GROOVY-9387: in rare cases, this form still works
                            return metaClass.invokeMethod(receiver, name, args);
```

### RedundantCast
Casting `e.getCause()` to `MissingMethodException` is redundant
in `src/main/java/org/codehaus/groovy/runtime/callsite/PogoMetaClassSite.java`
#### Snippet
```java
                } catch (MissingMethodException e) {
                    if (e instanceof MissingMethodExecutionFailed) {
                        throw (MissingMethodException)e.getCause();
                    } else if (receiver.getClass() == e.getType() && e.getMethod().equals(name)) {
                        // in case there's nothing else, invoke the object's own invokeMethod()
```

### RedundantCast
Casting `() -> {...}` to `PrivilegedAction` is redundant
in `src/main/java/org/codehaus/groovy/vmplugin/VMPluginFactory.java`
#### Snippet
```java

    private static VMPlugin createPlugin() {
        return doPrivileged((PrivilegedAction<VMPlugin>) () -> {
            final BigDecimal specVer = new BigDecimal(VMPlugin.getJavaVersion());
            ClassLoader loader = VMPluginFactory.class.getClassLoader();
```

### RedundantCast
Casting `property.getName()` to `CharSequence` is redundant
in `src/main/java/org/codehaus/groovy/transform/SortableASTTransformation.java`
#### Snippet
```java

    private static void createComparatorFor(ClassNode classNode, PropertyNode property, boolean reversed) {
        String propName = StringGroovyMethods.capitalize((CharSequence) property.getName());
        String className = classNode.getName() + "$" + propName + "Comparator";
        ClassNode superClass = makeClassSafeWithGenerics(AbstractComparator.class, classNode);
```

### RedundantCast
Casting `constX(...)` to `Expression` is redundant
in `src/main/java/org/codehaus/groovy/transform/SynchronizedASTTransformation.java`
#### Snippet
```java

    private static Expression zeroLengthObjectArray() {
        return new ArrayExpression(ClassHelper.OBJECT_TYPE, null, Collections.singletonList((Expression) constX(0)));
    }

```

### RedundantCast
Casting `toList(...)` to `Iterable` is redundant
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T> Iterator<T> sort(Iterator<T> self) {
        return sort((Iterable<T>) toList(self)).listIterator();
    }

```

### RedundantCast
Casting `entries` to `Iterable`> is redundant
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
        Map<K, V> result = new LinkedHashMap<>();
        List<Map.Entry<K, V>> entries = asList(self.entrySet());
        sort((Iterable<Map.Entry<K, V>>) entries, closure);
        for (Map.Entry<K, V> entry : entries) {
            result.put(entry.getKey(), entry.getValue());
```

### RedundantCast
Casting `toList(...)` to `Iterable` is redundant
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T> Iterator<T> sort(Iterator<T> self, @ClosureParams(value=FromString.class, options={"T","T,T"}) Closure closure) {
        return sort((Iterable<T>) toList(self), closure).listIterator();
    }

```

### RedundantCast
Casting `temp.toArray(...)` to `T[]` is redundant
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
          default:
            Collection<T> temp = minus((Collection<T>) toList(self), Arrays.asList(removeMe));
            return (T[]) temp.toArray(createSimilarArray(self, temp.size()));
        }
    }
```

### RedundantCast
Casting `toList(...)` to `Collection` is redundant
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
    public static <T> T asType(Iterable iterable, Class<T> clazz) {
        if (Collection.class.isAssignableFrom(clazz)) {
            return asType((Collection) toList(iterable), clazz);
        }

```

### RedundantCast
Casting `expression.getNodeMetaData(...)` to `MethodNode` is redundant
in `src/main/java/org/codehaus/groovy/transform/stc/TypeCheckingExtension.java`
#### Snippet
```java

    public MethodNode getTargetMethod(final Expression expression) {
        return (MethodNode) expression.getNodeMetaData(StaticTypesMarker.DIRECT_METHOD_CALL_TARGET);
    }

```

### RedundantCast
Casting `() -> {...}` to `PrivilegedAction` is redundant
in `src/main/java/org/codehaus/groovy/reflection/SunClassLoader.java`
#### Snippet
```java
        SunClassLoader res;
        try {
            res = doPrivileged((PrivilegedAction<SunClassLoader>) () -> {
                try {
                    return new SunClassLoader();
```

### RedundantCast
Casting `map.getOrPut(...)` to `EntryWithValue` is redundant
in `src/main/java/org/codehaus/groovy/reflection/GroovyClassValuePreJava7.java`
#### Snippet
```java
	public T get(Class<?> type) {
		// the value isn't use in the getOrPut call - see the EntryWithValue constructor above
		T value = ((EntryWithValue)map.getOrPut(type, null)).getValue();
		//all entries are guaranteed to be EntryWithValue. Value can only be null if computeValue returns null
		return value;
```

### RedundantCast
Casting `argument` to `Number` is redundant
in `src/main/java/org/codehaus/groovy/reflection/stdclasses/NumberCachedClass.java`
#### Snippet
```java
            argument = ((Number) argument).byteValue();
        } else if (param == BigInteger.class) {
            argument = new BigInteger(String.valueOf((Number) argument));
        }

```

### RedundantCast
Casting `super.get(...)` to `T` is redundant
in `src/main/java/groovy/cli/TypedOption.java`
#### Snippet
```java

    public T defaultValue() {
        return (T) super.get("defaultValue");
    }
}
```

### RedundantCast
Casting `() -> {...}` to `PrivilegedAction` is redundant
in `src/main/java/groovy/lang/GroovyClassLoader.java`
#### Snippet
```java

    public Class parseClass(final Reader reader, final String fileName) throws CompilationFailedException {
        GroovyCodeSource gcs = createCodeSource((PrivilegedAction<GroovyCodeSource>) () -> {
            try {
                String scriptText = IOGroovyMethods.getText(reader);
```

### RedundantCast
Casting `() -> {...}` to `PrivilegedAction` is redundant
in `src/main/java/groovy/lang/GroovyClassLoader.java`
#### Snippet
```java
     */
    public Class parseClass(final String text, final String fileName) throws CompilationFailedException {
        GroovyCodeSource gcs = createCodeSource((PrivilegedAction<GroovyCodeSource>) () -> new GroovyCodeSource(text, fileName, "/groovy/script"));
        gcs.setCachable(false);
        return parseClass(gcs);
```

### RedundantCast
Casting `() -> {...}` to `PrivilegedExceptionAction` is redundant
in `src/main/java/groovy/lang/GroovyCodeSource.java`
#### Snippet
```java
        //package private and used only by the GroovyClassLoader.
        try {
            Object[] info = doPrivileged((PrivilegedExceptionAction<Object[]>) () -> {
                // retrieve the content of the file using the provided encoding
                if (encoding != null) {
```

### RedundantCast
Casting `events.toArray(...)` to `PropertyEvent[]` is redundant
in `src/main/java/groovy/util/ObservableMap.java`
#### Snippet
```java

    protected void fireMultiPropertyEvent(List<PropertyEvent> events) {
        firePropertyEvent(new MultiPropertyEvent(this, (PropertyEvent[]) events.toArray(new PropertyEvent[0])));
    }

```

### RedundantCast
Casting `delegate.toArray(...)` to `T[]` is redundant
in `src/main/java/groovy/util/ObservableSet.java`
#### Snippet
```java
    @Override
    public <T> T[] toArray(T[] ts) {
        return (T[]) delegate.toArray(ts);
    }

```

### RedundantCast
Casting `text()` to `CharSequence` is redundant
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
            return null;
        }
        return StringGroovyMethods.toBigInteger((CharSequence)text());
    }

```

### RedundantCast
Casting `text()` to `CharSequence` is redundant
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
            return null;
        }
        return StringGroovyMethods.toInteger((CharSequence)text());
    }

```

### RedundantCast
Casting `text()` to `CharSequence` is redundant
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
            return null;
        }
        return StringGroovyMethods.toBigDecimal((CharSequence)text());
    }

```

### RedundantCast
Casting `text()` to `CharSequence` is redundant
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
            return null;
        }
        return StringGroovyMethods.toDouble((CharSequence)text());
    }

```

### RedundantCast
Casting `text()` to `CharSequence` is redundant
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
            return null;
        }
        return StringGroovyMethods.toLong((CharSequence)text());
    }

```

### RedundantCast
Casting `text()` to `CharSequence` is redundant
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
            return null;
        }
        return StringGroovyMethods.toFloat((CharSequence)text());
    }

```

### RedundantCast
Casting `name` to `String` is redundant
in `src/main/java/groovy/util/ObjectGraphBuilder.java`
#### Snippet
```java
            return objectRefFactory;
        }
        if (beanFactoryName != null && beanFactoryName.equals((String) name)) {
            return objectBeanFactory;
        }
```

### RedundantCast
Casting `() -> {...}` to `PrivilegedAction` is redundant
in `src/main/java/groovy/util/GroovyScriptEngine.java`
#### Snippet
```java
    private GroovyClassLoader initGroovyLoader() {
        GroovyClassLoader groovyClassLoader =
                doPrivileged((PrivilegedAction<ScriptClassLoader>) () -> {
                    if (parentLoader instanceof GroovyClassLoader) {
                        return new ScriptClassLoader((GroovyClassLoader) parentLoader);
```

### RedundantCast
Casting `iter.next()` to `MetaMethod` is redundant
in `src/main/java/groovy/inspect/Inspector.java`
#### Snippet
```java
        int i = 0;
        for (Iterator<MetaMethod> iter = metaMethods.iterator(); iter.hasNext(); i++) {
            MetaMethod metaMethod = (MetaMethod) iter.next();
            result[i] = Tuple2.tuple(metaMethod, methodInfo(metaMethod));
        }
```

### RedundantCast
Casting `() -> {...}` to `PrivilegedExceptionAction` is redundant
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
        try {
            if (isBeanDerivative(theClass)) {
                info = (BeanInfo) doPrivileged((PrivilegedExceptionAction) () -> Introspector.getBeanInfo(theClass, Introspector.IGNORE_ALL_BEANINFO));
            } else {
                info = (BeanInfo) doPrivileged((PrivilegedExceptionAction) () -> Introspector.getBeanInfo(theClass));
```

### RedundantCast
Casting `() -> {...}` to `PrivilegedExceptionAction` is redundant
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
                info = (BeanInfo) doPrivileged((PrivilegedExceptionAction) () -> Introspector.getBeanInfo(theClass, Introspector.IGNORE_ALL_BEANINFO));
            } else {
                info = (BeanInfo) doPrivileged((PrivilegedExceptionAction) () -> Introspector.getBeanInfo(theClass));
            }
        } catch (PrivilegedActionException pae) {
```

### RedundantCast
Casting `commandLineList` to `Iterable` is redundant
in `subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovyc.java`
#### Snippet
```java

    private String[] makeCommandLine(List<String> commandLineList) {
        log.info("Compilation arguments:\n" + DefaultGroovyMethods.join((Iterable<String>) commandLineList, "\n"));
        return commandLineList.toArray(EMPTY_STRING_ARRAY);
    }
```

### RedundantCast
Casting `Integer.toString(...)` to `CharSequence` is redundant
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/ConsoleTextEditor.java`
#### Snippet
```java
            g.setFont(f);
            for (int line = startline, y = startingY; line <= endline; y += fontHeight, line++) {
                String lineNumber = StringGroovyMethods.padLeft((CharSequence)Integer.toString(line), 4, " ");
                g.drawString(lineNumber, 0, y);
            }
```

### RedundantCast
Casting `source.getExpression()` to `ClassExpression` is redundant
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
            params = ((ExtensionMethodNode) target).getExtensionMethodNode().getParameters();
        } else if (!target.isStatic() && source.getExpression() instanceof ClassExpression) {
            ClassNode thisType = ((ClassExpression) source.getExpression()).getType();
            // there is an implicit parameter for "String::length"
            int n = target.getParameters().length;
```

### RedundantCast
Casting `graphics` to `Graphics2D` is redundant
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/TextEditor.java`
#### Snippet
```java
                    (float) height - fm.getHeight() / 2);

            ((Graphics2D) graphics).translate(0, fm.getHeight());
            width = SwingUtilities.computeStringWidth(fm, pageStr);
            ((Graphics2D) graphics).drawString(pageStr,
```

### RedundantCast
Casting `typeUrls` to `Iterable` is redundant
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/SimpleGroovyClassDoc.java`
#### Snippet
```java
                    sb = new StringBuilder(getDocUrl(outerType, full, links, relativePath, rootDoc, classDoc));
                    sb.append("&lt;");
                    sb.append(DefaultGroovyMethods.join((Iterable) typeUrls, ", "));
                    sb.append("&gt;");
                    return sb.toString();
```

### RedundantCast
Casting `e.getValue()` to `Iterable` is redundant
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/SimpleGroovyClassDoc.java`
#### Snippet
```java
                sb.append(e.getKey());
                sb.append(postKey);
                sb.append(DefaultGroovyMethods.join((Iterable)e.getValue(), valueSeparator));
                sb.append(postValues);
            }
```

### RedundantCast
Casting `c` to `int` is redundant
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/BaseJsonParser.java`
#### Snippet
```java
        }

        charString = charString + " with an int value of " + ((int) c);
        return charString;
    }
```

### RedundantCast
Casting `c` to `int` is redundant
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharScanner.java`
#### Snippet
```java
        }

        charString = charString + " with an int value of " + ((int) c);
        return charString;
    }
```

### RedundantCast
Casting `coll` to `Iterable` is redundant
in `subprojects/groovy-json/src/main/java/groovy/json/StreamingJsonBuilder.java`
#### Snippet
```java

        public static Object writeCollectionWithClosure(Writer writer, Collection coll, @DelegatesTo(value = StreamingJsonDelegate.class, strategy = Closure.DELEGATE_FIRST) Closure closure) throws IOException {
            return writeCollectionWithClosure(writer, (Iterable) coll, closure, JsonOutput.DEFAULT_GENERATOR);
        }

```

### RedundantCast
Casting `userdata.get(...)` to `List` is redundant
in `subprojects/groovy-macro/src/main/groovy/org/codehaus/groovy/macro/matcher/TreeContext.java`
#### Snippet
```java
    @SuppressWarnings("unchecked")
    public void putUserdata(Object key, Object value) {
        ((List)userdata.get(key)).add(value);
    }

```

### RedundantCast
Casting `cache.get(...)` to `TemplateCacheEntry` is redundant
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/TemplateServlet.java`
#### Snippet
```java
        }

        TemplateCacheEntry entry = (TemplateCacheEntry) cache.get(key);
        if (entry != null) {
            if (entry.validate(file)) {
```

### RedundantCast
Casting `tableColumns.get(...)` to `DefaultTableColumn` is redundant
in `subprojects/groovy-swing/src/main/java/groovy/swing/model/DefaultTableModel.java`
#### Snippet
```java
        public void renumberTableColumns() {
            for (int i = tableColumns.size() - 1; i >= 0; i--) {
                ((DefaultTableColumn)tableColumns.get(i)).setModelIndex(i);
            }
        }
```

### RedundantCast
Casting `sortingColumns.elementAt(...)` to `Integer` is redundant
in `subprojects/groovy-swing/src/main/java/groovy/swing/table/TableSorter.java`
#### Snippet
```java
    public int compare(int row1, int row2) {
        for (int level = 0; level < sortingColumns.size(); level++) {
            Integer column = (Integer) sortingColumns.elementAt(level);
            int result = compareRowsByColumn(row1, row2, column);
            if (result != 0)
```

### RedundantCast
Casting `indexes.clone()` to `int[]` is redundant
in `subprojects/groovy-swing/src/main/java/groovy/swing/table/TableSorter.java`
#### Snippet
```java
    public void sort(Object sender) {
        checkModel();
        shuttlesort((int[]) indexes.clone(), indexes, 0, indexes.length);
    }

```

### RedundantCast
Casting `files` to `Iterable` is redundant
in `subprojects/groovy-nio/src/main/java/org/apache/groovy/nio/extensions/NioExtensions.java`
#### Snippet
```java
            }

            if (sort != null) files = DefaultGroovyMethods.sort((Iterable<Path>) files, sort);

            for (Path path : files) {
```

### RedundantCast
Casting `text()` to `CharSequence` is redundant
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/GPathResult.java`
#### Snippet
```java
            return null;
        }
        return StringGroovyMethods.toBigInteger((CharSequence)text());
    }

```

### RedundantCast
Casting `text()` to `CharSequence` is redundant
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/GPathResult.java`
#### Snippet
```java
            return null;
        }
        return StringGroovyMethods.toFloat((CharSequence)text());
    }

```

### RedundantCast
Casting `text()` to `CharSequence` is redundant
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/GPathResult.java`
#### Snippet
```java
            return null;
        }
        return StringGroovyMethods.toDouble((CharSequence)text());
    }

```

### RedundantCast
Casting `text()` to `CharSequence` is redundant
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/GPathResult.java`
#### Snippet
```java
            return null;
        }
        return StringGroovyMethods.toInteger((CharSequence)text());
    }

```

### RedundantCast
Casting `text()` to `CharSequence` is redundant
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/GPathResult.java`
#### Snippet
```java
            return null;
        }
        return StringGroovyMethods.toBigDecimal((CharSequence)text());
    }

```

### RedundantCast
Casting `text()` to `CharSequence` is redundant
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/GPathResult.java`
#### Snippet
```java
            return null;
        }
        return StringGroovyMethods.toLong((CharSequence)text());
    }

```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `caller` may be 'final'
in `src/test/groovy/TestInterruptor.java`
#### Snippet
```java

public class TestInterruptor implements Runnable {
    private Thread caller;

    public TestInterruptor(Thread caller) {
```

### FieldMayBeFinal
Field `astBuilder` may be 'final'
in `src/main/java/org/apache/groovy/parser/antlr4/TryWithResourcesASTTransformation.java`
#### Snippet
```java
        this.astBuilder = astBuilder;
    }
    private AstBuilder astBuilder;

    private int resourceCount;
```

### FieldMayBeFinal
Field `modifierNodeList` may be 'final'
in `src/main/java/org/apache/groovy/parser/antlr4/ModifierManager.java`
#### Snippet
```java
    );
    private AstBuilder astBuilder;
    private List<ModifierNode> modifierNodeList;

    public ModifierManager(AstBuilder astBuilder, List<ModifierNode> modifierNodeList) {
```

### FieldMayBeFinal
Field `astBuilder` may be 'final'
in `src/main/java/org/apache/groovy/parser/antlr4/ModifierManager.java`
#### Snippet
```java
            MethodNode.class, Arrays.asList(VOLATILE/*, TRANSIENT*/) // Transient is left open for properties for legacy reasons but should be removed before ClassCompletionVerifier runs (CLASSGEN)
    );
    private AstBuilder astBuilder;
    private List<ModifierNode> modifierNodeList;

```

### FieldMayBeFinal
Field `charStream` may be 'final'
in `src/main/java/org/apache/groovy/parser/antlr4/internal/DescriptiveErrorStrategy.java`
#### Snippet
```java
 */
public class DescriptiveErrorStrategy extends BailErrorStrategy {
    private CharStream charStream;

    public DescriptiveErrorStrategy(CharStream charStream) {
```

### FieldMayBeFinal
Field `repeatable` may be 'final'
in `src/main/java/org/codehaus/groovy/ast/ModifierNode.java`
#### Snippet
```java
    private String text;
    private AnnotationNode annotationNode;
    private boolean repeatable;

    public static final int ANNOTATION_TYPE = -999;
```

### FieldMayBeFinal
Field `opcode` may be 'final'
in `src/main/java/org/codehaus/groovy/ast/ModifierNode.java`
#### Snippet
```java
public class ModifierNode extends ASTNode {
    private Integer type;
    private Integer opcode; // ASM opcode
    private String text;
    private AnnotationNode annotationNode;
```

### FieldMayBeFinal
Field `type` may be 'final'
in `src/main/java/org/codehaus/groovy/ast/ModifierNode.java`
#### Snippet
```java
 */
public class ModifierNode extends ASTNode {
    private Integer type;
    private Integer opcode; // ASM opcode
    private String text;
```

### FieldMayBeFinal
Field `safe` may be 'final'
in `src/main/java/org/codehaus/groovy/ast/expr/PropertyExpression.java`
#### Snippet
```java
    private Expression objectExpression;
    private final Expression property;
    private boolean safe;
    private boolean spreadSafe;
    private boolean isStatic;
```

### FieldMayBeFinal
Field `label` may be 'final'
in `src/main/java/org/codehaus/groovy/ast/stmt/BreakStatement.java`
#### Snippet
```java
public class BreakStatement extends Statement {

    private String label;

    public BreakStatement() {
```

### FieldMayBeFinal
Field `variable` may be 'final'
in `src/main/java/org/codehaus/groovy/ast/stmt/ForStatement.java`
#### Snippet
```java
    public static final Parameter FOR_LOOP_DUMMY = new Parameter(ClassHelper.OBJECT_TYPE,"forLoopDummyParameter");

    private Parameter variable;
    private Expression collectionExpression;
    private Statement loopBlock;
```

### FieldMayBeFinal
Field `label` may be 'final'
in `src/main/java/org/codehaus/groovy/ast/stmt/ContinueStatement.java`
#### Snippet
```java
public class ContinueStatement extends Statement {

    private String label;

    public ContinueStatement() {
```

### FieldMayBeFinal
Field `statements` may be 'final'
in `src/main/java/org/codehaus/groovy/ast/stmt/BlockStatement.java`
#### Snippet
```java
public class BlockStatement extends Statement {

    private List<Statement> statements;
    private VariableScope scope;

```

### FieldMayBeFinal
Field `variable` may be 'final'
in `src/main/java/org/codehaus/groovy/ast/stmt/CatchStatement.java`
#### Snippet
```java
public class CatchStatement extends Statement {

    private Parameter variable;

    private Statement code;
```

### FieldMayBeFinal
Field `refCnt` may be 'final'
in `src/main/java/org/codehaus/groovy/util/ReferenceManager.java`
#### Snippet
```java

        return new ReferenceManager(queue){
            private AtomicInteger refCnt = new AtomicInteger();
            private volatile ReferenceManager manager = createIdlingManager(queue);
            @Override
```

### FieldMayBeFinal
Field `queue` may be 'final'
in `src/main/java/org/codehaus/groovy/util/ReferenceManager.java`
#### Snippet
```java
    }  

    private ReferenceQueue queue;

    public ReferenceManager(ReferenceQueue queue) {
```

### FieldMayBeFinal
Field `eol` may be 'final'
in `src/main/java/org/codehaus/groovy/tools/Utilities.java`
#### Snippet
```java
    }    

    private static String eol = System.lineSeparator();

}
```

### FieldMayBeFinal
Field `context` may be 'final'
in `src/main/java/org/codehaus/groovy/control/messages/LocatedMessage.java`
#### Snippet
```java

    /** The CSTNode that indicates the location to which the message applies. */
    private CSTNode context;

    public LocatedMessage(String message, CSTNode context, SourceUnit source) {
```

### FieldMayBeFinal
Field `nameIterator` may be 'final'
in `src/main/java/org/codehaus/groovy/control/CompilationUnit.java`
#### Snippet
```java
    public Iterator<SourceUnit> iterator() {
        return new Iterator<SourceUnit>() {
            private Iterator<String> nameIterator = sources.keySet().iterator();
            @Override
            public boolean hasNext() {
```

### FieldMayBeFinal
Field `generatedClasses` may be 'final'
in `src/main/java/org/codehaus/groovy/control/CompilationUnit.java`
#### Snippet
```java

    /** The classes generated during classgen. */
    private List<GroovyClass> generatedClasses = new ArrayList<>();

    private Deque<PhaseOperation>[] phaseOperations;
```

### FieldMayBeFinal
Field `javaCompilationUnitSet` may be 'final'
in `src/main/java/org/codehaus/groovy/control/CompilationUnit.java`
#### Snippet
```java
    protected ASTTransformationsContext astTransformationsContext;

    private Set<javax.tools.JavaFileObject> javaCompilationUnitSet = new HashSet<>();

    /**
```

### FieldMayBeFinal
Field `newPhaseOperations` may be 'final'
in `src/main/java/org/codehaus/groovy/control/CompilationUnit.java`
#### Snippet
```java

    private Deque<PhaseOperation>[] phaseOperations;
    private Deque<PhaseOperation>[] newPhaseOperations;
    {
        final int n = Phases.ALL + 1;
```

### FieldMayBeFinal
Field `phaseOperations` may be 'final'
in `src/main/java/org/codehaus/groovy/control/CompilationUnit.java`
#### Snippet
```java
    private List<GroovyClass> generatedClasses = new ArrayList<>();

    private Deque<PhaseOperation>[] phaseOperations;
    private Deque<PhaseOperation>[] newPhaseOperations;
    {
```

### FieldMayBeFinal
Field `ignoreZeroSign` may be 'final'
in `src/main/java/org/codehaus/groovy/runtime/NumberAwareComparator.java`
#### Snippet
```java
public class NumberAwareComparator<T> implements Comparator<T>, Serializable {
    private static final long serialVersionUID = 9017657289076651660L;
    private boolean ignoreZeroSign;

    public NumberAwareComparator() {
```

### FieldMayBeFinal
Field `variable` may be 'final'
in `src/main/java/org/codehaus/groovy/runtime/ScriptReference.java`
#### Snippet
```java
    private static final long serialVersionUID = -2914281513576690336L;
    private Script script;
    private String variable;

    public ScriptReference(Script script, String variable) {
```

### FieldMayBeFinal
Field `script` may be 'final'
in `src/main/java/org/codehaus/groovy/runtime/ScriptReference.java`
#### Snippet
```java

    private static final long serialVersionUID = -2914281513576690336L;
    private Script script;
    private String variable;

```

### FieldMayBeFinal
Field `second` may be 'final'
in `src/main/java/org/codehaus/groovy/runtime/ComposedClosure.java`
#### Snippet
```java
    private static final long serialVersionUID = -4816724431590921285L;
    private Closure first;
    private Closure<V> second;

    public ComposedClosure(Closure first, Closure<V> second) {
```

### FieldMayBeFinal
Field `first` may be 'final'
in `src/main/java/org/codehaus/groovy/runtime/ComposedClosure.java`
#### Snippet
```java

    private static final long serialVersionUID = -4816724431590921285L;
    private Closure first;
    private Closure<V> second;

```

### FieldMayBeFinal
Field `EOF` may be 'final'
in `src/main/java/org/codehaus/groovy/runtime/IOGroovyMethods.java`
#### Snippet
```java
    private static int charBufferSize = 4096;     // half the default stream buffer size
    private static int expectedLineLength = 160;  // double the default line length
    private static int EOF = -1;                  // End Of File

    /*
```

### FieldMayBeFinal
Field `charBufferSize` may be 'final'
in `src/main/java/org/codehaus/groovy/runtime/IOGroovyMethods.java`
#### Snippet
```java
    }

    private static int charBufferSize = 4096;     // half the default stream buffer size
    private static int expectedLineLength = 160;  // double the default line length
    private static int EOF = -1;                  // End Of File
```

### FieldMayBeFinal
Field `expectedLineLength` may be 'final'
in `src/main/java/org/codehaus/groovy/runtime/IOGroovyMethods.java`
#### Snippet
```java

    private static int charBufferSize = 4096;     // half the default stream buffer size
    private static int expectedLineLength = 160;  // double the default line length
    private static int EOF = -1;                  // End Of File

```

### FieldMayBeFinal
Field `cause` may be 'final'
in `src/main/java/org/codehaus/groovy/runtime/metaclass/MissingMethodExecutionFailed.java`
#### Snippet
```java
public class MissingMethodExecutionFailed extends MissingMethodExceptionNoStack {
    private static final long serialVersionUID = -7894095278952483769L;
    private Throwable cause;
    public MissingMethodExecutionFailed(String method, Class type, Object[] arguments, boolean isStatic, Throwable cause) {
        super(method, type, arguments, isStatic);
```

### FieldMayBeFinal
Field `normalizedText` may be 'final'
in `src/main/java/org/codehaus/groovy/runtime/powerassert/SourceText.java`
#### Snippet
```java
public class SourceText {
    private final int firstLine;
    private String normalizedText;

    private final List<Integer> lineOffsets = new ArrayList<Integer>();
```

### FieldMayBeFinal
Field `sig` may be 'final'
in `src/main/java/org/codehaus/groovy/classgen/asm/CallSiteWriter.java`
#### Snippet
```java
public class CallSiteWriter {
    private static final int SIG_ARRAY_LENGTH = 255;
    private static String [] sig = new String [SIG_ARRAY_LENGTH];
    private static String getCreateArraySignature(int numberOfArguments) {
        if (numberOfArguments >= SIG_ARRAY_LENGTH) {
```

### FieldMayBeFinal
Field `afterPath` may be 'final'
in `src/main/java/org/codehaus/groovy/classgen/asm/OptimizingStatementWriter.java`
#### Snippet
```java
    private static class FastPathData {
        private Label pathStart = new Label();
        private Label afterPath = new Label();
    }

```

### FieldMayBeFinal
Field `pathStart` may be 'final'
in `src/main/java/org/codehaus/groovy/classgen/asm/OptimizingStatementWriter.java`
#### Snippet
```java

    private static class FastPathData {
        private Label pathStart = new Label();
        private Label afterPath = new Label();
    }
```

### FieldMayBeFinal
Field `superMethodNames` may be 'final'
in `src/main/java/org/codehaus/groovy/classgen/asm/WriterController.java`
#### Snippet
```java
    private int lineNumber = -1;
    private int helperMethodIndex = 0;
    private List<String> superMethodNames = new ArrayList<>();
    private MethodPointerExpressionWriter methodPointerExpressionWriter;
    private MethodReferenceExpressionWriter methodReferenceExpressionWriter;
```

### FieldMayBeFinal
Field `icn` may be 'final'
in `src/main/java/org/codehaus/groovy/classgen/asm/ClosureWriter.java`
#### Snippet
```java

    protected static class CorrectAccessedVariableVisitor extends CodeVisitorSupport {
        private InnerClassNode icn;

        public CorrectAccessedVariableVisitor(final InnerClassNode icn) {
```

### FieldMayBeFinal
Field `DTT_CLASSNAME` may be 'final'
in `src/main/java/org/codehaus/groovy/classgen/asm/BytecodeHelper.java`
#### Snippet
```java
public class BytecodeHelper {

    private static String DTT_CLASSNAME = BytecodeHelper.getClassInternalName(DefaultTypeTransformation.class);

    /**
```

### FieldMayBeFinal
Field `type` may be 'final'
in `src/main/java/org/codehaus/groovy/classgen/asm/BytecodeHelper.java`
#### Snippet
```java

    private static abstract class PrimitiveTypeHandler {
        private ClassNode type;

        PrimitiveTypeHandler(ClassNode type) {
```

### FieldMayBeFinal
Field `idx` may be 'final'
in `src/main/java/org/codehaus/groovy/classgen/asm/BytecodeHelper.java`
#### Snippet
```java
    private static class StoreVarHandler extends PrimitiveTypeHandler {
        private MethodVisitor mv;
        private int idx;

        StoreVarHandler(MethodVisitor mv, ClassNode type, int idx) {
```

### FieldMayBeFinal
Field `mv` may be 'final'
in `src/main/java/org/codehaus/groovy/classgen/asm/BytecodeHelper.java`
#### Snippet
```java

    private static class LoadVarHandler extends PrimitiveTypeHandler {
        private MethodVisitor mv;
        private int idx;

```

### FieldMayBeFinal
Field `mv` may be 'final'
in `src/main/java/org/codehaus/groovy/classgen/asm/BytecodeHelper.java`
#### Snippet
```java

    private static class ReturnVarHandler extends PrimitiveTypeHandler {
        private MethodVisitor mv;

        ReturnVarHandler(MethodVisitor mv, ClassNode type) {
```

### FieldMayBeFinal
Field `mv` may be 'final'
in `src/main/java/org/codehaus/groovy/classgen/asm/BytecodeHelper.java`
#### Snippet
```java

    private static class StoreVarHandler extends PrimitiveTypeHandler {
        private MethodVisitor mv;
        private int idx;

```

### FieldMayBeFinal
Field `idx` may be 'final'
in `src/main/java/org/codehaus/groovy/classgen/asm/BytecodeHelper.java`
#### Snippet
```java
    private static class LoadVarHandler extends PrimitiveTypeHandler {
        private MethodVisitor mv;
        private int idx;

        LoadVarHandler(MethodVisitor mv, ClassNode type, int idx) {
```

### FieldMayBeFinal
Field `num` may be 'final'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
        private final LinkedList<E> discards;
        private boolean exhausted;
        private int num;

        private DropRightIterator(Iterator<E> delegate, int num) {
```

### FieldMayBeFinal
Field `nameToGlobalClassesNodesMap` may be 'final'
in `src/main/java/org/codehaus/groovy/transform/NewifyASTTransformation.java`
#### Snippet
```java
    private Pattern classNamePattern;

    private static Map<String, ClassNode> nameToGlobalClassesNodesMap;
    private Map<String, NewifyClassData> nameToInnerClassesNodesMap;

```

### FieldMayBeFinal
Field `nameTable` may be 'final'
in `src/main/java/org/codehaus/groovy/transform/OperatorRenameASTTransformation.java`
#### Snippet
```java
    private static final String MY_TYPE_NAME = "@" + MY_TYPE.getNameWithoutPackage();
    private SourceUnit sourceUnit;
    private Map<String, String> nameTable = new HashMap<>();

    @Override
```

### FieldMayBeFinal
Field `constructors` may be 'final'
in `src/main/java/org/codehaus/groovy/reflection/CachedClass.java`
#### Snippet
```java
    };

    private LazyReference<CachedConstructor[]> constructors = new LazyReference<CachedConstructor[]>(softBundle) {
        private static final long serialVersionUID = -5834446523983631635L;

```

### FieldMayBeFinal
Field `cachedSuperClass` may be 'final'
in `src/main/java/org/codehaus/groovy/reflection/CachedClass.java`
#### Snippet
```java
    };

    private LazyReference<CachedClass> cachedSuperClass = new LazyReference<CachedClass>(softBundle) {
        private static final long serialVersionUID = -4663740963306806058L;

```

### FieldMayBeFinal
Field `softBundle` may be 'final'
in `src/main/java/org/codehaus/groovy/reflection/CachedClass.java`
#### Snippet
```java
    public static final CachedClass[] EMPTY_ARRAY = new CachedClass[0];

    private static ReferenceBundle softBundle = ReferenceBundle.getSoftBundle();

    private final LazyReference<CachedField[]> fields = new LazyReference<CachedField[]>(softBundle) {
```

### FieldMayBeFinal
Field `socket` may be 'final'
in `src/main/java/groovy/ui/GroovySocketServer.java`
#### Snippet
```java
    static class GroovyClientConnection implements Runnable {
        private Script script;
        private Socket socket;
        private BufferedReader reader;
        private PrintWriter writer;
```

### FieldMayBeFinal
Field `reader` may be 'final'
in `src/main/java/groovy/ui/GroovySocketServer.java`
#### Snippet
```java
        private Script script;
        private Socket socket;
        private BufferedReader reader;
        private PrintWriter writer;
        private boolean autoOutputFlag;
```

### FieldMayBeFinal
Field `script` may be 'final'
in `src/main/java/groovy/ui/GroovySocketServer.java`
#### Snippet
```java

    static class GroovyClientConnection implements Runnable {
        private Script script;
        private Socket socket;
        private BufferedReader reader;
```

### FieldMayBeFinal
Field `writer` may be 'final'
in `src/main/java/groovy/ui/GroovySocketServer.java`
#### Snippet
```java
        private Socket socket;
        private BufferedReader reader;
        private PrintWriter writer;
        private boolean autoOutputFlag;

```

### FieldMayBeFinal
Field `autoOutputFlag` may be 'final'
in `src/main/java/groovy/ui/GroovySocketServer.java`
#### Snippet
```java
        private BufferedReader reader;
        private PrintWriter writer;
        private boolean autoOutputFlag;

        GroovyClientConnection(Script script, boolean autoOutput,Socket socket) throws IOException {
```

### FieldMayBeFinal
Field `conf` may be 'final'
in `src/main/java/groovy/ui/GroovyMain.java`
#### Snippet
```java

    // Compiler configuration, used to set the encodings of the scripts/classes
    private CompilerConfiguration conf = new CompilerConfiguration(System.getProperties());

    /**
```

### FieldMayBeFinal
Field `systemProperties` may be 'final'
in `src/main/java/groovy/ui/GroovyMain.java`
#### Snippet
```java

        @Option(names = {"-D", "--define"}, paramLabel = "<property=value>", description = "Define a system property")
        private Map<String, String> systemProperties = new LinkedHashMap<String, String>();

        @Option(names = "--disableopt", paramLabel = "optlist", split = ",",
```

### FieldMayBeFinal
Field `disableopt` may be 'final'
in `src/main/java/groovy/ui/GroovyMain.java`
#### Snippet
```java
                                "all (disables all optimizations), ",
                                "int (disable any int based optimizations)"})
        private List<String> disableopt = new ArrayList<String>();

        @Option(names = {"-d", "--debug"}, description = "Debug mode will print out full stack traces")
```

### FieldMayBeFinal
Field `classLoader` may be 'final'
in `src/main/java/groovy/ui/GroovyMain.java`
#### Snippet
```java
        final Thread current = Thread.currentThread();
        class DoSetContext implements PrivilegedAction<Object> {
            ClassLoader classLoader;

            public DoSetContext(ClassLoader loader) {
```

### FieldMayBeFinal
Field `size` may be 'final'
in `src/main/java/groovy/lang/IntRange.java`
#### Snippet
```java
         * The number of values in the range.
         */
        private int size = size();

        /**
```

### FieldMayBeFinal
Field `name` may be 'final'
in `src/main/java/groovy/lang/GroovyCodeSource.java`
#### Snippet
```java
     * The name given to the generated class
     */
    private String name;

    /**
```

### FieldMayBeFinal
Field `codeSource` may be 'final'
in `src/main/java/groovy/lang/GroovyCodeSource.java`
#### Snippet
```java
     * grants to administer security.
     */
    private CodeSource codeSource;

    /**
```

### FieldMayBeFinal
Field `tagList` may be 'final'
in `src/main/java/groovy/lang/groovydoc/Groovydoc.java`
#### Snippet
```java
public class Groovydoc {
    private final String content;
    private List<GroovydocTag> tagList = Collections.emptyList();
    private GroovydocHolder holder;
    public static final Groovydoc EMPTY_GROOVYDOC = new Groovydoc("") {
```

### FieldMayBeFinal
Field `content` may be 'final'
in `src/main/java/groovy/lang/groovydoc/GroovydocTag.java`
#### Snippet
```java
public class GroovydocTag {
    private String name;
    private String content;
    private Groovydoc groovydoc;

```

### FieldMayBeFinal
Field `groovydoc` may be 'final'
in `src/main/java/groovy/lang/groovydoc/GroovydocTag.java`
#### Snippet
```java
    private String name;
    private String content;
    private Groovydoc groovydoc;

    public GroovydocTag(String name, String content, Groovydoc groovydoc) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `src/main/java/groovy/lang/groovydoc/GroovydocTag.java`
#### Snippet
```java
 */
public class GroovydocTag {
    private String name;
    private String content;
    private Groovydoc groovydoc;
```

### FieldMayBeFinal
Field `values` may be 'final'
in `src/main/java/groovy/util/ObservableMap.java`
#### Snippet
```java
    public static class PropertyClearedEvent extends PropertyEvent {
        private static final long serialVersionUID = -1472110679547513634L;
        private Map values = new HashMap();

        public PropertyClearedEvent(Object source, Map values) {
```

### FieldMayBeFinal
Field `type` may be 'final'
in `src/main/java/groovy/util/ObservableMap.java`
#### Snippet
```java
    public abstract static class PropertyEvent extends PropertyChangeEvent {
        private static final long serialVersionUID = -8328412226044328674L;
        private ChangeType type;

        public PropertyEvent(Object source, String propertyName, Object oldValue, Object newValue, ChangeType type) {
```

### FieldMayBeFinal
Field `values` may be 'final'
in `src/main/java/groovy/util/ObservableSet.java`
#### Snippet
```java
    public static class MultiElementAddedEvent extends ElementEvent {
        private static final long serialVersionUID = 575204921472897312L;
        private List values = new ArrayList();

        public MultiElementAddedEvent(Object source, List values) {
```

### FieldMayBeFinal
Field `values` may be 'final'
in `src/main/java/groovy/util/ObservableSet.java`
#### Snippet
```java
    public static class ElementClearedEvent extends ElementEvent {
        private static final long serialVersionUID = 6075523774365623231L;
        private List values = new ArrayList();

        public ElementClearedEvent(Object source, List values) {
```

### FieldMayBeFinal
Field `values` may be 'final'
in `src/main/java/groovy/util/ObservableSet.java`
#### Snippet
```java
    public static class MultiElementRemovedEvent extends ElementEvent {
        private static final long serialVersionUID = 8894701122065438905L;
        private List values = new ArrayList();

        public MultiElementRemovedEvent(Object source, List values) {
```

### FieldMayBeFinal
Field `values` may be 'final'
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
    public static class MultiElementRemovedEvent extends ElementEvent {
        private static final long serialVersionUID = 2590238951081945868L;
        private List values = new ArrayList();

        public MultiElementRemovedEvent(Object source, List values) {
```

### FieldMayBeFinal
Field `values` may be 'final'
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
    public static class MultiElementAddedEvent extends ElementEvent {
        private static final long serialVersionUID = 443060557109693114L;
        private List values = new ArrayList();

        public MultiElementAddedEvent(Object source, int index, List values) {
```

### FieldMayBeFinal
Field `values` may be 'final'
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
    public static class ElementClearedEvent extends ElementEvent {
        private static final long serialVersionUID = -2754983590419383972L;
        private List values = new ArrayList();

        public ElementClearedEvent(Object source, List values) {
```

### FieldMayBeFinal
Field `namespaceURI` may be 'final'
in `src/main/java/groovy/namespace/QName.java`
#### Snippet
```java

    /** Field namespaceURI */
    private String namespaceURI;

    /** Field localPart */
```

### FieldMayBeFinal
Field `prefix` may be 'final'
in `src/main/java/groovy/namespace/QName.java`
#### Snippet
```java

    /** Field prefix */
    private String prefix;

    /**
```

### FieldMayBeFinal
Field `localPart` may be 'final'
in `src/main/java/groovy/namespace/QName.java`
#### Snippet
```java

    /** Field localPart */
    private String localPart;

    /** Field prefix */
```

### FieldMayBeFinal
Field `includeNoSourcePackages` may be 'final'
in `subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovydoc.java`
#### Snippet
```java
    private Boolean includeMainForScripts;
    private boolean useDefaultExcludes;
    private boolean includeNoSourcePackages;
    private Boolean noTimestamp;
    private Boolean noVersionStamp;
```

### FieldMayBeFinal
Field `useDefaultExcludes` may be 'final'
in `subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovydoc.java`
#### Snippet
```java
    private Boolean processScripts;
    private Boolean includeMainForScripts;
    private boolean useDefaultExcludes;
    private boolean includeNoSourcePackages;
    private Boolean noTimestamp;
```

### FieldMayBeFinal
Field `output` may be 'final'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/SystemOutputInterceptor.java`
#### Snippet
```java

    private Closure callback;
    private boolean output;

    private static final ThreadLocal<Integer> consoleId = new InheritableThreadLocal<Integer>() {
```

### FieldMayBeFinal
Field `callback` may be 'final'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/SystemOutputInterceptor.java`
#### Snippet
```java
public class SystemOutputInterceptor extends FilterOutputStream {

    private Closure callback;
    private boolean output;

```

### FieldMayBeFinal
Field `editable` may be 'final'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/ConsoleTextEditor.java`
#### Snippet
```java
    private PrintAction printAction = new PrintAction();

    private boolean editable = true;

    private TextUndoManager undoManager;
```

### FieldMayBeFinal
Field `numbersPanel` may be 'final'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/ConsoleTextEditor.java`
#### Snippet
```java
    private static final PrinterJob PRINTER_JOB = PrinterJob.getPrinterJob();

    private LineNumbersPanel numbersPanel = new LineNumbersPanel();

    private boolean documentChangedSinceLastRepaint = false;
```

### FieldMayBeFinal
Field `undoManager` may be 'final'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/ConsoleTextEditor.java`
#### Snippet
```java
    private boolean editable = true;

    private TextUndoManager undoManager;
    private int fontSize;

```

### FieldMayBeFinal
Field `redoAction` may be 'final'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/ConsoleTextEditor.java`
#### Snippet
```java

    private UndoAction undoAction = new UndoAction();
    private RedoAction redoAction = new RedoAction();
    private PrintAction printAction = new PrintAction();

```

### FieldMayBeFinal
Field `textEditor` may be 'final'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/ConsoleTextEditor.java`
#### Snippet
```java
    private boolean documentChangedSinceLastRepaint = false;

    private TextEditor textEditor = new TextEditor(true, true, true) {

        @Override
```

### FieldMayBeFinal
Field `undoAction` may be 'final'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/ConsoleTextEditor.java`
#### Snippet
```java
    };

    private UndoAction undoAction = new UndoAction();
    private RedoAction redoAction = new RedoAction();
    private PrintAction printAction = new PrintAction();
```

### FieldMayBeFinal
Field `printAction` may be 'final'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/ConsoleTextEditor.java`
#### Snippet
```java
    private UndoAction undoAction = new UndoAction();
    private RedoAction redoAction = new RedoAction();
    private PrintAction printAction = new PrintAction();

    private boolean editable = true;
```

### FieldMayBeFinal
Field `TUPLE_TYPES` may be 'final'
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
    protected static final ClassNode ITERABLE_TYPE = ClassHelper.ITERABLE_TYPE;

    private static List<ClassNode> TUPLE_TYPES = Arrays.stream(ClassHelper.TUPLE_CLASSES).map(ClassHelper::makeWithoutCaching).collect(Collectors.toList());

    public static final MethodNode CLOSURE_CALL_NO_ARG  = CLOSURE_TYPE.getDeclaredMethod("call", Parameter.EMPTY_ARRAY);
```

### FieldMayBeFinal
Field `propChangeSupport` may be 'final'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/TextUndoManager.java`
#### Snippet
```java
public class TextUndoManager extends UndoManager {

    private SwingPropertyChangeSupport propChangeSupport =
            new SwingPropertyChangeSupport(this);

```

### FieldMayBeFinal
Field `segment` may be 'final'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java

    // the document buffer and segment
    private Segment segment = new Segment();
    private CharBuffer buffer;

```

### FieldMayBeFinal
Field `start` may be 'final'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
    protected class MultiLineRun {

        private Position start;
        private Position end;
        private int delimeterSize;
```

### FieldMayBeFinal
Field `groupList` may be 'final'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java

        private Matcher matcher;
        private List<String> groupList = new ArrayList<>();

        private boolean initialized;
```

### FieldMayBeFinal
Field `styleMap` may be 'final'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
        private Style defaultStyle;

        private Map<String, Style> styleMap = new LinkedHashMap<>();
        private Map<String, LexerNode> children = new HashMap<>();

```

### FieldMayBeFinal
Field `delimeterSize` may be 'final'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
        private Position start;
        private Position end;
        private int delimeterSize;

        public MultiLineRun(int start, int end) throws BadLocationException {
```

### FieldMayBeFinal
Field `end` may be 'final'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java

        private Position start;
        private Position end;
        private int delimeterSize;

```

### FieldMayBeFinal
Field `children` may be 'final'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java

        private Map<String, Style> styleMap = new LinkedHashMap<>();
        private Map<String, LexerNode> children = new HashMap<>();

        private Matcher matcher;
```

### FieldMayBeFinal
Field `delegate` may be 'final'
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java

    static class ArrayToUnmodifiableListAdapter implements List {
        private Object delegate;

        public ArrayToUnmodifiableListAdapter(Object delegate) {
```

### FieldMayBeFinal
Field `overtypeCaret` may be 'final'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/TextEditor.java`
#### Snippet
```java

    private Caret defaultCaret;
    private Caret overtypeCaret;

    private static final PageFormat PAGE_FORMAT;
```

### FieldMayBeFinal
Field `mouseAdapter` may be 'final'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/TextEditor.java`
#### Snippet
```java
    private int numPages;

    private MouseAdapter mouseAdapter =
            new MouseAdapter() {
                Cursor cursor;
```

### FieldMayBeFinal
Field `defaultCaret` may be 'final'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/TextEditor.java`
#### Snippet
```java
    private static boolean isOvertypeMode;

    private Caret defaultCaret;
    private Caret overtypeCaret;

```

### FieldMayBeFinal
Field `violations` may be 'final'
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/ViolationTracker.java`
#### Snippet
```java
    }

    private TreeMap<Long, AssertionViolation> violations = new TreeMap<Long, AssertionViolation>();

    public void track(final AssertionViolation assertionViolation) {
```

### FieldMayBeFinal
Field `postconditionsEnabled` may be 'final'
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/common/spi/ProcessingContextInformation.java`
#### Snippet
```java
    private boolean constructorAssertionsEnabled = true;
    private boolean preconditionsEnabled = true;
    private boolean postconditionsEnabled = true;
    private boolean classInvariantsEnabled = true;

```

### FieldMayBeFinal
Field `preconditionsEnabled` may be 'final'
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/common/spi/ProcessingContextInformation.java`
#### Snippet
```java

    private boolean constructorAssertionsEnabled = true;
    private boolean preconditionsEnabled = true;
    private boolean postconditionsEnabled = true;
    private boolean classInvariantsEnabled = true;
```

### FieldMayBeFinal
Field `classInvariantsEnabled` may be 'final'
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/common/spi/ProcessingContextInformation.java`
#### Snippet
```java
    private boolean preconditionsEnabled = true;
    private boolean postconditionsEnabled = true;
    private boolean classInvariantsEnabled = true;

    private Map<String, Object> extra = new HashMap<String, Object>();
```

### FieldMayBeFinal
Field `extra` may be 'final'
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/common/spi/ProcessingContextInformation.java`
#### Snippet
```java
    private boolean classInvariantsEnabled = true;

    private Map<String, Object> extra = new HashMap<String, Object>();

    public ProcessingContextInformation(ClassNode classNode, SourceUnit sourceUnit, ReaderSource source) {
```

### FieldMayBeFinal
Field `contract` may be 'final'
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/common/spi/ProcessingContextInformation.java`
#### Snippet
```java
public class ProcessingContextInformation {

    private Contract contract;
    private SourceUnit sourceUnit;
    private ReaderSource source;
```

### FieldMayBeFinal
Field `sourceUnit` may be 'final'
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/common/spi/ProcessingContextInformation.java`
#### Snippet
```java

    private Contract contract;
    private SourceUnit sourceUnit;
    private ReaderSource source;

```

### FieldMayBeFinal
Field `source` may be 'final'
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/common/spi/ProcessingContextInformation.java`
#### Snippet
```java
    private Contract contract;
    private SourceUnit sourceUnit;
    private ReaderSource source;

    private boolean constructorAssertionsEnabled = true;
```

### FieldMayBeFinal
Field `knownProviders` may be 'final'
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/util/LifecycleImplementationLoader.java`
#### Snippet
```java
        return new Iterator<S>() {

            Iterator<Map.Entry<String, S>> knownProviders = providers.entrySet().iterator();

            @Override
```

### FieldMayBeFinal
Field `providers` may be 'final'
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/util/LifecycleImplementationLoader.java`
#### Snippet
```java
    private Class<S> service;
    private ClassLoader loader;
    private LinkedHashMap<String, S> providers = new LinkedHashMap<String, S>();
    private LazyIterator lookupIterator;

```

### FieldMayBeFinal
Field `loader` may be 'final'
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/util/LifecycleImplementationLoader.java`
#### Snippet
```java

    private Class<S> service;
    private ClassLoader loader;
    private LinkedHashMap<String, S> providers = new LinkedHashMap<String, S>();
    private LazyIterator lookupIterator;
```

### FieldMayBeFinal
Field `service` may be 'final'
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/util/LifecycleImplementationLoader.java`
#### Snippet
```java
    private static final String PREFIX = "META-INF/services/";

    private Class<S> service;
    private ClassLoader loader;
    private LinkedHashMap<String, S> providers = new LinkedHashMap<String, S>();
```

### FieldMayBeFinal
Field `pci` may be 'final'
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/ast/visitor/AnnotationProcessorVisitor.java`
#### Snippet
```java

    private static final String DO_CALL = "doCall";
    private ProcessingContextInformation pci;

    public AnnotationProcessorVisitor(final SourceUnit sourceUnit, final ReaderSource source, final ProcessingContextInformation pci) {
```

### FieldMayBeFinal
Field `executions` may be 'final'
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/generation/ContractExecutionTracker.java`
#### Snippet
```java
    }

    private static ThreadLocal<HashSet<ContractExecution>> executions = new ContractExecutionThreadLocal();

    public static boolean track(String className, String methodIdentifier, String assertionType, boolean isStatic) {
```

### FieldMayBeFinal
Field `packagePath` may be 'final'
in `subprojects/groovy-groovydoc/src/main/java/org/apache/groovy/antlr/GroovydocVisitor.java`
#### Snippet
```java
    private final SourceUnit unit;
    private final List<LinkArgument> links;
    private String packagePath;
    private SimpleGroovyClassDoc currentClassDoc = null;
    private Map<String, GroovyClassDoc> classDocs = new HashMap<>();
```

### FieldMayBeFinal
Field `classDocs` may be 'final'
in `subprojects/groovy-groovydoc/src/main/java/org/apache/groovy/antlr/GroovydocVisitor.java`
#### Snippet
```java
    private String packagePath;
    private SimpleGroovyClassDoc currentClassDoc = null;
    private Map<String, GroovyClassDoc> classDocs = new HashMap<>();
    private final Properties properties;
    private static final String FS = "/";
```

### FieldMayBeFinal
Field `outputAreas` may be 'final'
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/MockOutputTool.java`
#### Snippet
```java

public class MockOutputTool implements OutputTool {
    private Set<String> outputAreas; // dirs
    private Map<String, String> output;

```

### FieldMayBeFinal
Field `output` may be 'final'
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/MockOutputTool.java`
#### Snippet
```java
public class MockOutputTool implements OutputTool {
    private Set<String> outputAreas; // dirs
    private Map<String, String> output;

    public MockOutputTool() {
```

### FieldMayBeFinal
Field `DEFAULT_UNITS` may be 'final'
in `subprojects/groovy-datetime/src/main/java/org/apache/groovy/datetime/extensions/DateTimeExtensions.java`
#### Snippet
```java
     * the upto/downto methods, should have an entry.
     */
    private static Map<Class<? extends Temporal>, TemporalUnit> DEFAULT_UNITS = new HashMap<>();

    static {
```

### FieldMayBeFinal
Field `classDocs` may be 'final'
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/antlr4/GroovydocJavaVisitor.java`
#### Snippet
```java
    private final List<LinkArgument> links;
    private SimpleGroovyClassDoc currentClassDoc = null;
    private Map<String, GroovyClassDoc> classDocs = new HashMap<>();
    private String packagePath;
    private final Map<String, String> aliases = new HashMap<>();
```

### FieldMayBeFinal
Field `imports` may be 'final'
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/antlr4/GroovydocJavaVisitor.java`
#### Snippet
```java
    private String packagePath;
    private final Map<String, String> aliases = new HashMap<>();
    private List<String> imports = new ArrayList<>();
    private static final String FS = "/";

```

### FieldMayBeFinal
Field `packagePath` may be 'final'
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/antlr4/GroovydocJavaVisitor.java`
#### Snippet
```java
    private SimpleGroovyClassDoc currentClassDoc = null;
    private Map<String, GroovyClassDoc> classDocs = new HashMap<>();
    private String packagePath;
    private final Map<String, String> aliases = new HashMap<>();
    private List<String> imports = new ArrayList<>();
```

### FieldMayBeFinal
Field `beanInfo` may be 'final'
in `subprojects/groovy-jmx/src/main/java/groovy/jmx/GroovyMBean.java`
#### Snippet
```java
    private final MBeanServerConnection server;
    private final ObjectName name;
    private MBeanInfo beanInfo;
    private final boolean ignoreErrors;
    private final Map<String, String[]> operations = new HashMap<String, String[]>();
```

### FieldMayBeFinal
Field `cache` may be 'final'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/SimpleCache.java`
#### Snippet
```java

public class SimpleCache<K, V> implements Cache<K, V> {
    private EvictableCache<K, V> cache;

    public SimpleCache(final int limit, CacheType type) {
```

### FieldMayBeFinal
Field `UTC_TIME_ZONE` may be 'final'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/Dates.java`
#### Snippet
```java
public class Dates {

    private static TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone("UTC");

    public static long utc(long time) {
```

### FieldMayBeFinal
Field `builder` may be 'final'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserUsingCharacterSource.java`
#### Snippet
```java
    }

    private CharBuf builder = CharBuf.create(20);

    private String decodeString() {
```

### FieldMayBeFinal
Field `builder` may be 'final'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserCharArray.java`
#### Snippet
```java
    }

    private CharBuf builder = CharBuf.create(20);

    private String decodeString() {
```

### FieldMayBeFinal
Field `text` may be 'final'
in `subprojects/groovy-json/src/main/java/groovy/json/JsonOutput.java`
#### Snippet
```java
     */
    public static class JsonUnescaped {
        private CharSequence text;

        public JsonUnescaped(CharSequence text) {
```

### FieldMayBeFinal
Field `powersOf10` may be 'final'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharScanner.java`
#### Snippet
```java
    static final String MAX_INT_STR = String.valueOf(Integer.MAX_VALUE);

    private static double[] powersOf10 = {
            1.0,
            10.0,
```

### FieldMayBeFinal
Field `validatePattern` may be 'final'
in `subprojects/groovy-json/src/main/java/groovy/json/JsonTokenType.java`
#### Snippet
```java
    STRING          ( "a string",                           new Closure(null) {
        private Pattern replacePattern = Pattern.compile("(?:\\\\[\"\\\\bfnrt\\/]|\\\\u[0-9a-fA-F]{4})");
        private Pattern validatePattern = Pattern.compile("\"[^\"\\\\]*\"");
        public boolean doCall(String it) {
            return validatePattern.matcher(replacePattern.matcher(it).replaceAll("@")).matches();
```

### FieldMayBeFinal
Field `replacePattern` may be 'final'
in `subprojects/groovy-json/src/main/java/groovy/json/JsonTokenType.java`
#### Snippet
```java
     */
    STRING          ( "a string",                           new Closure(null) {
        private Pattern replacePattern = Pattern.compile("(?:\\\\[\"\\\\bfnrt\\/]|\\\\u[0-9a-fA-F]{4})");
        private Pattern validatePattern = Pattern.compile("\"[^\"\\\\]*\"");
        public boolean doCall(String it) {
```

### FieldMayBeFinal
Field `debug` may be 'final'
in `subprojects/groovy-jsr223/src/main/java/org/codehaus/groovy/jsr223/GroovyScriptEngineImpl.java`
#### Snippet
```java
public class GroovyScriptEngineImpl extends AbstractScriptEngine implements Compilable, Invocable {

    private static boolean debug = false;

    // script-string-to-generated Class map
```

### FieldMayBeFinal
Field `sourceModel` may be 'final'
in `subprojects/groovy-swing/src/main/java/groovy/swing/model/PropertyModel.java`
#### Snippet
```java
public class PropertyModel implements ValueModel, NestedValueModel {

    private ValueModel sourceModel;
    private String property;
    private Class type;
```

### FieldMayBeFinal
Field `type` may be 'final'
in `subprojects/groovy-swing/src/main/java/groovy/swing/model/PropertyModel.java`
#### Snippet
```java
    private ValueModel sourceModel;
    private String property;
    private Class type;
    boolean editable;

```

### FieldMayBeFinal
Field `property` may be 'final'
in `subprojects/groovy-swing/src/main/java/groovy/swing/model/PropertyModel.java`
#### Snippet
```java

    private ValueModel sourceModel;
    private String property;
    private Class type;
    boolean editable;
```

### FieldMayBeFinal
Field `valueModel` may be 'final'
in `subprojects/groovy-swing/src/main/java/groovy/swing/model/DefaultTableColumn.java`
#### Snippet
```java
public class DefaultTableColumn extends TableColumn {

    private ValueModel valueModel;    

    public DefaultTableColumn(ValueModel valueModel) {
```

### FieldMayBeFinal
Field `fieldModels` may be 'final'
in `subprojects/groovy-swing/src/main/java/groovy/swing/model/FormModel.java`
#### Snippet
```java
 */
public class FormModel {
    private Map<String, Object> fieldModels;

    public FormModel() {
```

### FieldMayBeFinal
Field `rowModel` may be 'final'
in `subprojects/groovy-swing/src/main/java/groovy/swing/model/DefaultTableModel.java`
#### Snippet
```java
public class DefaultTableModel extends AbstractTableModel {

    private ValueModel rowModel;
    private ValueModel rowsModel;
    private MyTableColumnModel columnModel = new MyTableColumnModel();
```

### FieldMayBeFinal
Field `columnModel` may be 'final'
in `subprojects/groovy-swing/src/main/java/groovy/swing/model/DefaultTableModel.java`
#### Snippet
```java
    private ValueModel rowModel;
    private ValueModel rowsModel;
    private MyTableColumnModel columnModel = new MyTableColumnModel();

    public DefaultTableModel(ValueModel rowsModel) {
```

### FieldMayBeFinal
Field `rowsModel` may be 'final'
in `subprojects/groovy-swing/src/main/java/groovy/swing/model/DefaultTableModel.java`
#### Snippet
```java

    private ValueModel rowModel;
    private ValueModel rowsModel;
    private MyTableColumnModel columnModel = new MyTableColumnModel();

```

### FieldMayBeFinal
Field `parent` may be 'final'
in `subprojects/groovy-swing/src/main/groovy/groovy/swing/impl/TableLayoutCell.java`
#### Snippet
```java
    protected static final Logger LOG = Logger.getLogger(TableLayoutCell.class.getName());

    private TableLayoutRow parent;
    private Component component;
    private GridBagConstraints constraints;
```

### FieldMayBeFinal
Field `lineNumber` may be 'final'
in `subprojects/groovy-templates/src/main/groovy/groovy/text/TemplateExecutionException.java`
#### Snippet
```java
public class TemplateExecutionException extends Exception  {
    private static final long serialVersionUID = 3940987189684210921L;
    private int lineNumber;

    public TemplateExecutionException(int lineNumber) {
```

### FieldMayBeFinal
Field `lineNumber` may be 'final'
in `subprojects/groovy-templates/src/main/groovy/groovy/text/TemplateParseException.java`
#### Snippet
```java
public class TemplateParseException extends RuntimeException {
    private static final long serialVersionUID = 1607958968337123274L;
    private int lineNumber;
    private int column;

```

### FieldMayBeFinal
Field `column` may be 'final'
in `subprojects/groovy-templates/src/main/groovy/groovy/text/TemplateParseException.java`
#### Snippet
```java
    private static final long serialVersionUID = 1607958968337123274L;
    private int lineNumber;
    private int column;

    public TemplateParseException(int lineNumber, int column) {
```

### FieldMayBeFinal
Field `counter` may be 'final'
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
public class GStringTemplateEngine extends TemplateEngine {
    private final ClassLoader parentLoader;
    private static AtomicInteger counter = new AtomicInteger();
    private static final boolean REUSE_CLASS_LOADER = SystemUtil.getBooleanSafe("groovy.GStringTemplateEngine.reuseClassLoader");

```

### FieldMayBeFinal
Field `counter` may be 'final'
in `subprojects/groovy-templates/src/main/groovy/groovy/text/SimpleTemplateEngine.java`
#### Snippet
```java
public class SimpleTemplateEngine extends TemplateEngine {
    private boolean verbose;
    private static AtomicInteger counter = new AtomicInteger(0);
    private GroovyShell groovyShell;
    private boolean escapeBackslash;
```

### FieldMayBeFinal
Field `escapeBackslash` may be 'final'
in `subprojects/groovy-templates/src/main/groovy/groovy/text/SimpleTemplateEngine.java`
#### Snippet
```java

        protected Script script;
        private boolean escapeBackslash;

        public SimpleTemplate() {
```

### FieldMayBeFinal
Field `groovyShell` may be 'final'
in `subprojects/groovy-templates/src/main/groovy/groovy/text/SimpleTemplateEngine.java`
#### Snippet
```java
    private boolean verbose;
    private static AtomicInteger counter = new AtomicInteger(0);
    private GroovyShell groovyShell;
    private boolean escapeBackslash;

```

### FieldMayBeFinal
Field `counter` may be 'final'
in `subprojects/groovy-templates/src/main/groovy/groovy/text/XmlTemplateEngine.java`
#### Snippet
```java
public class XmlTemplateEngine extends TemplateEngine {

    private static AtomicInteger counter = new AtomicInteger(0);

    private Closure configurePrinter = null;
```

### FieldMayBeFinal
Field `arguments` may be 'final'
in `subprojects/groovy-test/src/main/java/org/apache/groovy/test/ScriptTestAdapter.java`
#### Snippet
```java
public class ScriptTestAdapter implements Test {
    private Class scriptClass;
    private String[] arguments;

    public ScriptTestAdapter(Class scriptClass, String[] arguments) {
```

### FieldMayBeFinal
Field `scriptClass` may be 'final'
in `subprojects/groovy-test/src/main/java/org/apache/groovy/test/ScriptTestAdapter.java`
#### Snippet
```java
 */
public class ScriptTestAdapter implements Test {
    private Class scriptClass;
    private String[] arguments;

```

### FieldMayBeFinal
Field `params` may be 'final'
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java

    private final class PreparedQueryCommand extends AbstractQueryCommand {
        private List<Object> params;

        private PreparedQueryCommand(String sql, List<Object> queryParams) {
```

### FieldMayBeFinal
Field `templateSource` may be 'final'
in `subprojects/groovy-templates/src/main/groovy/groovy/text/StreamingTemplateEngine.java`
#### Snippet
```java
                + "}";

        private StringBuilder templateSource;

        // we use a hard index instead of incrementing the _i variable due to previous
```

### FieldMayBeFinal
Field `useAgileDoxNaming` may be 'final'
in `subprojects/groovy-test/src/main/java/groovy/test/GroovyTestCase.java`
#### Snippet
```java
    public static final String TEST_SCRIPT_NAME_PREFIX = "TestScript";

    private boolean useAgileDoxNaming = false;

    /**
```

### FieldMayBeFinal
Field `emptyAttributes` may be 'final'
in `subprojects/groovy-xml/src/main/java/groovy/xml/SAXBuilder.java`
#### Snippet
```java

    private final ContentHandler handler;
    private Attributes emptyAttributes = new AttributesImpl();

    public SAXBuilder(ContentHandler handler) {
```

### FieldMayBeFinal
Field `builder` may be 'final'
in `subprojects/groovy-xml/src/main/java/groovy/xml/NamespaceBuilder.java`
#### Snippet
```java
public class NamespaceBuilder {

    private BuilderSupport builder;

    public static NamespaceBuilderSupport newInstance(BuilderSupport builder, String uri) {
```

### FieldMayBeFinal
Field `builder` may be 'final'
in `subprojects/groovy-xml/src/main/java/groovy/xml/NamespaceBuilderSupport.java`
#### Snippet
```java
    private boolean autoPrefix;
    private Map<String, String> nsMap = new HashMap<String, String>();
    private BuilderSupport builder;

    public NamespaceBuilderSupport(BuilderSupport builder) {
```

### FieldMayBeFinal
Field `out` may be 'final'
in `subprojects/groovy-xml/src/main/java/groovy/xml/MarkupBuilder.java`
#### Snippet
```java
    public enum CharFilter { XML_STRICT, XML_ALL, NONE }

    private IndentPrinter out;
    private boolean nospace;
    private int state;
```

### FieldMayBeFinal
Field `classQueue` may be 'final'
in `subprojects/stress/src/stressTest/java/org/codehaus/groovy/reflection/ClassInfoLeakStressTest.java`
#### Snippet
```java

    private ReferenceQueue<ClassLoader> classLoaderQueue = new ReferenceQueue<ClassLoader>();
    private ReferenceQueue<Class<?>> classQueue = new ReferenceQueue<Class<?>>();
    private ReferenceQueue<ClassInfo> classInfoQueue = new ReferenceQueue<ClassInfo>();

```

### FieldMayBeFinal
Field `classLoaderQueue` may be 'final'
in `subprojects/stress/src/stressTest/java/org/codehaus/groovy/reflection/ClassInfoLeakStressTest.java`
#### Snippet
```java
    private static ReferenceBundle bundle = ReferenceBundle.getWeakBundle();

    private ReferenceQueue<ClassLoader> classLoaderQueue = new ReferenceQueue<ClassLoader>();
    private ReferenceQueue<Class<?>> classQueue = new ReferenceQueue<Class<?>>();
    private ReferenceQueue<ClassInfo> classInfoQueue = new ReferenceQueue<ClassInfo>();
```

### FieldMayBeFinal
Field `classInfoQueue` may be 'final'
in `subprojects/stress/src/stressTest/java/org/codehaus/groovy/reflection/ClassInfoLeakStressTest.java`
#### Snippet
```java
    private ReferenceQueue<ClassLoader> classLoaderQueue = new ReferenceQueue<ClassLoader>();
    private ReferenceQueue<Class<?>> classQueue = new ReferenceQueue<Class<?>>();
    private ReferenceQueue<ClassInfo> classInfoQueue = new ReferenceQueue<ClassInfo>();

    // Used to keep a hard reference to the References so they are not collected
```

### FieldMayBeFinal
Field `bundle` may be 'final'
in `subprojects/stress/src/stressTest/java/org/codehaus/groovy/reflection/ClassInfoLeakStressTest.java`
#### Snippet
```java

    private static final int NUM_OBJECTS = 3101;
    private static ReferenceBundle bundle = ReferenceBundle.getWeakBundle();

    private ReferenceQueue<ClassLoader> classLoaderQueue = new ReferenceQueue<ClassLoader>();
```

### FieldMayBeFinal
Field `refList` may be 'final'
in `subprojects/stress/src/stressTest/java/org/codehaus/groovy/reflection/ClassInfoLeakStressTest.java`
#### Snippet
```java

    // Used to keep a hard reference to the References so they are not collected
    private List<Reference<?>> refList = new ArrayList<Reference<?>>(NUM_OBJECTS * 3);

    @Before
```

## RuleId[id=JavaReflectionInvocation]
### JavaReflectionInvocation
Argument is not assignable to 'org.w3c.dom.Element'
in `src/main/java/org/codehaus/groovy/runtime/FormatHelper.java`
#### Snippet
```java
            try {
                Method serialize = Class.forName(XMLUTIL_CLASS_FULL_NAME).getMethod(SERIALIZE_METHOD_NAME, Element.class);
                return (String) serialize.invoke(null, arguments);
            } catch (ClassNotFoundException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                throw new RuntimeException(e);
```

## RuleId[id=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `src/main/java/org/codehaus/groovy/vmplugin/v8/Java8.java`
#### Snippet
```java
            } catch (SecurityException ignore) {
                lookup = null;
            } catch (RuntimeException e) {
                throw e;
            }
```

### CaughtExceptionImmediatelyRethrown
Caught exception `e` is immediately rethrown
in `src/main/java/groovy/lang/GroovyCodeSource.java`
#### Snippet
```java
                throw new RuntimeException(file.toString() + " can not be read. Check the read permission of the file \"" + file.toString() + "\" (" + file.getAbsolutePath() + ").");
        }
        catch (SecurityException e) {
            throw e;
        }
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
public class EncodingGroovyMethodsSupport {
    static final byte[] TRANSLATE_TABLE = (
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
public class EncodingGroovyMethodsSupport {
    static final byte[] TRANSLATE_TABLE = (
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
public class EncodingGroovyMethodsSupport {
    static final byte[] TRANSLATE_TABLE = (
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
public class EncodingGroovyMethodsSupport {
    static final byte[] TRANSLATE_TABLE = (
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
public class EncodingGroovyMethodsSupport {
    static final byte[] TRANSLATE_TABLE = (
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
public class EncodingGroovyMethodsSupport {
    static final byte[] TRANSLATE_TABLE = (
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
public class EncodingGroovyMethodsSupport {
    static final byte[] TRANSLATE_TABLE = (
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
public class EncodingGroovyMethodsSupport {
    static final byte[] TRANSLATE_TABLE = (
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0041` can be replaced with 'A'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0041` can be replaced with 'A'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0041` can be replaced with 'A'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0041` can be replaced with 'A'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u003E` can be replaced with '\>'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u003F` can be replaced with '?'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0034` can be replaced with '4'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0035` can be replaced with '5'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0036` can be replaced with '6'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0037` can be replaced with '7'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0038` can be replaced with '8'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0039` can be replaced with '9'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u003A` can be replaced with ':'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u003B` can be replaced with ';'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u003E\u0042\u0042\u0042\u003F"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u003C` can be replaced with '\<'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
                    //      @     A     B     C     D     E     F     G
                    + "\u0042\u0000\u0001\u0002\u0003\u0004\u0005\u0006"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u003D` can be replaced with '='
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
                    //      @     A     B     C     D     E     F     G
                    + "\u0042\u0000\u0001\u0002\u0003\u0004\u0005\u0006"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
                    //      @     A     B     C     D     E     F     G
                    + "\u0042\u0000\u0001\u0002\u0003\u0004\u0005\u0006"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
                    //      @     A     B     C     D     E     F     G
                    + "\u0042\u0000\u0001\u0002\u0003\u0004\u0005\u0006"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
                    //      @     A     B     C     D     E     F     G
                    + "\u0042\u0000\u0001\u0002\u0003\u0004\u0005\u0006"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0040` can be replaced with '@'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
                    //      @     A     B     C     D     E     F     G
                    + "\u0042\u0000\u0001\u0002\u0003\u0004\u0005\u0006"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
                    //      @     A     B     C     D     E     F     G
                    + "\u0042\u0000\u0001\u0002\u0003\u0004\u0005\u0006"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
                    //      @     A     B     C     D     E     F     G
                    + "\u0042\u0000\u0001\u0002\u0003\u0004\u0005\u0006"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
                    //      @     A     B     C     D     E     F     G
                    + "\u0042\u0000\u0001\u0002\u0003\u0004\u0005\u0006"
                    //      H     I J K     L     M N     O
                    + "\u0007\u0008\t\n\u000B\u000C\r\u000E"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016"
                    //      X     Y     Z     [     \     ]     ^     _
                    + "\u0017\u0018\u0019\u0042\u0042\u0042\u0042\u0042"
                    //      '     a     b     c     d     e     f     g
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016"
                    //      X     Y     Z     [     \     ]     ^     _
                    + "\u0017\u0018\u0019\u0042\u0042\u0042\u0042\u0042"
                    //      '     a     b     c     d     e     f     g
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016"
                    //      X     Y     Z     [     \     ]     ^     _
                    + "\u0017\u0018\u0019\u0042\u0042\u0042\u0042\u0042"
                    //      '     a     b     c     d     e     f     g
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016"
                    //      X     Y     Z     [     \     ]     ^     _
                    + "\u0017\u0018\u0019\u0042\u0042\u0042\u0042\u0042"
                    //      '     a     b     c     d     e     f     g
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016"
                    //      X     Y     Z     [     \     ]     ^     _
                    + "\u0017\u0018\u0019\u0042\u0042\u0042\u0042\u0042"
                    //      '     a     b     c     d     e     f     g
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0017\u0018\u0019\u0042\u0042\u0042\u0042\u0042"
                    //      '     a     b     c     d     e     f     g
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
                    //      h i     j     k     l     m     n     o
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0020` can be replaced with ' '
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0017\u0018\u0019\u0042\u0042\u0042\u0042\u0042"
                    //      '     a     b     c     d     e     f     g
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
                    //      h i     j     k     l     m     n     o
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0021` can be replaced with '!'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
                    //      h i     j     k     l     m     n     o
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0023` can be replaced with '#'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
                    //      h i     j     k     l     m     n     o
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0024` can be replaced with '$'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
                    //      h i     j     k     l     m     n     o
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0025` can be replaced with '%'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
                    //      h i     j     k     l     m     n     o
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0026` can be replaced with '\&'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
                    //      h i     j     k     l     m     n     o
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0027` can be replaced with '''
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
                    //      h i     j     k     l     m     n     o
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0028` can be replaced with '('
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
                    //      h i     j     k     l     m     n     o
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0029` can be replaced with ')'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u002A` can be replaced with '\*'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u002B` can be replaced with '+'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u002C` can be replaced with ','
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u002D` can be replaced with '-'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u002E` can be replaced with '.'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u002F` can be replaced with '/'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0030` can be replaced with '0'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0031` can be replaced with '1'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();

    static final byte[] TRANSLATE_TABLE_URLSAFE = (
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0032` can be replaced with '2'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();

    static final byte[] TRANSLATE_TABLE_URLSAFE = (
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0033` can be replaced with '3'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();

    static final byte[] TRANSLATE_TABLE_URLSAFE = (
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java

    static final byte[] TRANSLATE_TABLE_URLSAFE = (
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java

    static final byte[] TRANSLATE_TABLE_URLSAFE = (
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java

    static final byte[] TRANSLATE_TABLE_URLSAFE = (
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java

    static final byte[] TRANSLATE_TABLE_URLSAFE = (
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java

    static final byte[] TRANSLATE_TABLE_URLSAFE = (
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java

    static final byte[] TRANSLATE_TABLE_URLSAFE = (
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java

    static final byte[] TRANSLATE_TABLE_URLSAFE = (
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java

    static final byte[] TRANSLATE_TABLE_URLSAFE = (
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0041` can be replaced with 'A'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0041` can be replaced with 'A'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0041` can be replaced with 'A'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
            "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //           \t    \n                \r
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0041\u0041\u0042\u0042\u0041\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0041` can be replaced with 'A'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //     sp     !     "     #     $     %     &     '
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u003E` can be replaced with '\>'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0041\u0042\u0042\u0042\u0042\u0042\u0042\u0042"
                    //      (     )     *     +     ,     -     .     /
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0034` can be replaced with '4'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0035` can be replaced with '5'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0036` can be replaced with '6'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0037` can be replaced with '7'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0038` can be replaced with '8'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0039` can be replaced with '9'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u003A` can be replaced with ':'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u003B` can be replaced with ';'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u0042\u0042\u0042\u0042\u003E\u0042\u0042"
                    //      0     1     2     3     4     5     6     7
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u003C` can be replaced with '\<'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
                    //      @     A     B     C     D     E     F     G
                    + "\u0042\u0000\u0001\u0002\u0003\u0004\u0005\u0006"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u003D` can be replaced with '='
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
                    //      @     A     B     C     D     E     F     G
                    + "\u0042\u0000\u0001\u0002\u0003\u0004\u0005\u0006"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
                    //      @     A     B     C     D     E     F     G
                    + "\u0042\u0000\u0001\u0002\u0003\u0004\u0005\u0006"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
                    //      @     A     B     C     D     E     F     G
                    + "\u0042\u0000\u0001\u0002\u0003\u0004\u0005\u0006"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
                    //      @     A     B     C     D     E     F     G
                    + "\u0042\u0000\u0001\u0002\u0003\u0004\u0005\u0006"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0040` can be replaced with '@'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
                    //      @     A     B     C     D     E     F     G
                    + "\u0042\u0000\u0001\u0002\u0003\u0004\u0005\u0006"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
                    //      @     A     B     C     D     E     F     G
                    + "\u0042\u0000\u0001\u0002\u0003\u0004\u0005\u0006"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B"
                    //      8     9     :     ;     <     =     >     ?
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
                    //      @     A     B     C     D     E     F     G
                    + "\u0042\u0000\u0001\u0002\u0003\u0004\u0005\u0006"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u003C\u003D\u0042\u0042\u0042\u0040\u0042\u0042"
                    //      @     A     B     C     D     E     F     G
                    + "\u0042\u0000\u0001\u0002\u0003\u0004\u0005\u0006"
                    //      H     I J K     L     M N     O
                    + "\u0007\u0008\t\n\u000B\u000C\r\u000E"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016"
                    //      X     Y     Z     [     \     ]     ^     _
                    + "\u0017\u0018\u0019\u0042\u0042\u0042\u0042\u003F"
                    //      '     a     b     c     d     e     f     g
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016"
                    //      X     Y     Z     [     \     ]     ^     _
                    + "\u0017\u0018\u0019\u0042\u0042\u0042\u0042\u003F"
                    //      '     a     b     c     d     e     f     g
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016"
                    //      X     Y     Z     [     \     ]     ^     _
                    + "\u0017\u0018\u0019\u0042\u0042\u0042\u0042\u003F"
                    //      '     a     b     c     d     e     f     g
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016"
                    //      X     Y     Z     [     \     ]     ^     _
                    + "\u0017\u0018\u0019\u0042\u0042\u0042\u0042\u003F"
                    //      '     a     b     c     d     e     f     g
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u003F` can be replaced with '?'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016"
                    //      X     Y     Z     [     \     ]     ^     _
                    + "\u0017\u0018\u0019\u0042\u0042\u0042\u0042\u003F"
                    //      '     a     b     c     d     e     f     g
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0042` can be replaced with 'B'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0017\u0018\u0019\u0042\u0042\u0042\u0042\u003F"
                    //      '     a     b     c     d     e     f     g
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
                    //      h i     j     k     l     m     n     o
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0020` can be replaced with ' '
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0017\u0018\u0019\u0042\u0042\u0042\u0042\u003F"
                    //      '     a     b     c     d     e     f     g
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
                    //      h i     j     k     l     m     n     o
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0021` can be replaced with '!'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
                    //      h i     j     k     l     m     n     o
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0023` can be replaced with '#'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
                    //      h i     j     k     l     m     n     o
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0024` can be replaced with '$'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
                    //      h i     j     k     l     m     n     o
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0025` can be replaced with '%'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
                    //      h i     j     k     l     m     n     o
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0026` can be replaced with '\&'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
                    //      h i     j     k     l     m     n     o
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0027` can be replaced with '''
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
                    //      h i     j     k     l     m     n     o
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0028` can be replaced with '('
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0042\u001A\u001B\u001C\u001D\u001E\u001F\u0020"
                    //      h i     j     k     l     m     n     o
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0029` can be replaced with ')'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u002A` can be replaced with '\*'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u002B` can be replaced with '+'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u002C` can be replaced with ','
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u002D` can be replaced with '-'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u002E` can be replaced with '.'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u002F` can be replaced with '/'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0030` can be replaced with '0'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0021\"\u0023\u0024\u0025\u0026\u0027\u0028"
                    //      p     q     r     s     t     u     v     w
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0031` can be replaced with '1'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();
}

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0032` can be replaced with '2'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();
}

```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0033` can be replaced with '3'
in `src/main/java/org/codehaus/groovy/runtime/EncodingGroovyMethodsSupport.java`
#### Snippet
```java
                    + "\u0029\u002A\u002B\u002C\u002D\u002E\u002F\u0030"
                    //      x     y     z
                    + "\u0031\u0032\u0033").getBytes();
}

```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `metaClassRegistry`
in `src/main/java/groovy/lang/ExpandoMetaClassCreationHandle.java`
#### Snippet
```java
    public static void disable() {
        final MetaClassRegistry metaClassRegistry = GroovySystem.getMetaClassRegistry();
        synchronized (metaClassRegistry) {
            if (metaClassRegistry.getMetaClassCreationHandler() == instance) {
                ClassInfo.clearModifiedExpandos();
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `metaClassRegistry`
in `src/main/java/groovy/lang/ExpandoMetaClassCreationHandle.java`
#### Snippet
```java
    public static void enable() {
        final MetaClassRegistry metaClassRegistry = GroovySystem.getMetaClassRegistry();
        synchronized (metaClassRegistry) {
            if (metaClassRegistry.getMetaClassCreationHandler() != instance) {
                ClassInfo.clearModifiedExpandos();
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `source` is redundant
in `src/main/java/org/codehaus/groovy/ast/tools/GeneralUtils.java`
#### Snippet
```java
        }

        String source = result.toString().trim();

        return source;
```

### UnnecessaryLocalVariable
Local variable `cached` is redundant
in `src/main/java/org/codehaus/groovy/control/ClassNodeResolver.java`
#### Snippet
```java
        // calls to ClassLoader#loadClass. Disabling this cache will
        // cause a major performance hit.
        ClassNode cached = cachedClasses.get(name);
        return cached;
    }
```

### UnnecessaryLocalVariable
Local variable `hasYieldOrThrowStatement` is redundant
in `src/main/java/org/apache/groovy/parser/antlr4/AstBuilder.java`
#### Snippet
```java
            Boolean isArrow = statementInfoList.get(0).getV2();
            if (!isArrow && statementInfoList.stream().noneMatch(e -> {
                Boolean hasYieldOrThrowStatement = e.getV3();
                return hasYieldOrThrowStatement;
            })) {
```

### UnnecessaryLocalVariable
Local variable `node` is redundant
in `src/main/java/org/apache/groovy/parser/antlr4/AstBuilder.java`
#### Snippet
```java

    private static AnnotationNode makeAnnotationNode(final Class<? extends Annotation> type) {
        AnnotationNode node = new AnnotationNode(ClassHelper.make(type));
        // TODO: source offsets
        return node;
```

### UnnecessaryLocalVariable
Local variable `node` is redundant
in `src/main/java/org/apache/groovy/parser/antlr4/AstBuilder.java`
#### Snippet
```java

    private static ClassNode makeClassNode(final String name) {
        ClassNode node = ClassHelper.make(name);
        // TODO: shared instances
        return node;
```

### UnnecessaryLocalVariable
Local variable `sb` is redundant
in `src/main/java/org/codehaus/groovy/runtime/m12n/ExtensionModule.java`
#### Snippet
```java
    @Override
    public String toString() {
        String sb = "ExtensionModule{" + "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
```

### UnnecessaryLocalVariable
Local variable `type` is redundant
in `src/main/java/org/codehaus/groovy/runtime/metaclass/TemporaryMethodKey.java`
#### Snippet
```java

        if (value != null) {
            Class type = (Class)((value.getClass() == java.lang.Class.class) ?
                    value :
                    value.getClass());
```

### UnnecessaryLocalVariable
Local variable `msg` is redundant
in `src/main/java/org/codehaus/groovy/runtime/typehandling/GroovyCastException.java`
#### Snippet
```java
        else if (cls==double.class) {ncls=Double.class;}
        if (cls!=null && ncls!=cls) {
            String msg = ". Try '" + ncls.getName() + "' instead";
            return msg;
        }
```

### UnnecessaryLocalVariable
Local variable `metaClass` is redundant
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ClosureMetaClass.java`
#### Snippet
```java
            return registry.getMetaClass(ownerClass);
        }
        MetaClass metaClass = InvokerHelper.getMetaClass(object);
        return metaClass;
    }
```

### UnnecessaryLocalVariable
Local variable `cap` is redundant
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
   */
  private static int p2capacity(int initialCapacity) {
    int cap = initialCapacity;

    // Compute the appropriate capacity
```

### UnnecessaryLocalVariable
Local variable `name` is redundant
in `src/main/java/org/codehaus/groovy/classgen/Verifier.java`
#### Snippet
```java
        if (node.isInterface() && !Traits.isTrait(node)) return false;

        String name = SWAP_INIT;
        int mods = ACC_STATIC | ACC_SYNTHETIC | ACC_PUBLIC;
        BlockStatement methodCode = block(new SwapInitStatement());
```

### UnnecessaryLocalVariable
Local variable `size` is redundant
in `src/main/java/org/codehaus/groovy/classgen/AsmClassGenerator.java`
#### Snippet
```java
        if (arguments instanceof TupleExpression) {
            TupleExpression tupleExpression = (TupleExpression) arguments;
            int size = tupleExpression.getExpressions().size();
            return size;
        }
```

### UnnecessaryLocalVariable
Local variable `name` is redundant
in `src/main/java/org/codehaus/groovy/classgen/AsmClassGenerator.java`
#### Snippet
```java
        }
        if (prefix.length() != 0) prefix.insert(0, "array");
        String name = prefix + "$class$" + makeFieldClassName(componentType);
        return name;
    }
```

### UnnecessaryLocalVariable
Local variable `targetParameter` is redundant
in `src/main/java/org/codehaus/groovy/classgen/asm/sc/StaticTypesMethodReferenceExpressionWriter.java`
#### Snippet
```java

                Parameter parameter = parameters[i];
                Parameter targetParameter = parameter;

                ClassNode type = convertParameterType(targetParameter.getType(), parameter.getType(), inferredParamType);
```

### UnnecessaryLocalVariable
Local variable `handle` is redundant
in `src/main/java/org/codehaus/groovy/vmplugin/v8/IndyArrayAccess.java`
#### Snippet
```java

        MethodHandle guard = MethodHandles.dropArguments(notNegative, 0, arrayClass);
        MethodHandle handle = MethodHandles.guardWithTest(guard, set, fallback);
        return handle;
    }
```

### UnnecessaryLocalVariable
Local variable `handle` is redundant
in `src/main/java/org/codehaus/groovy/vmplugin/v8/IndyArrayAccess.java`
#### Snippet
```java

        MethodHandle guard = MethodHandles.dropArguments(notNegative, 0, arrayClass);
        MethodHandle handle = MethodHandles.guardWithTest(guard, get, fallback);
        return handle;
    }
```

### UnnecessaryLocalVariable
Local variable `includePseudoSetters` is redundant
in `src/main/java/org/codehaus/groovy/transform/MapConstructorASTTransformation.java`
#### Snippet
```java
        cNode.getDeclaredConstructors().removeIf(next -> next.getFirstStatement() == null);

        boolean includePseudoGetters = false, includePseudoSetters = allProperties, skipReadOnly = false; // GROOVY-4363
        Set<String> names = new HashSet<>();
        List<PropertyNode> properties;
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `src/main/java/org/codehaus/groovy/vmplugin/v9/Java9.java`
#### Snippet
```java

    private static Map<String, Set<String>> doFindClasses(final URI uri, final String packageName, final List<String> defaultPackageNames) {
        Map<String, Set<String>> result = ClassFinder.find(uri, packageName, true)
                .entrySet().stream()
                .filter(e -> e.getValue().stream().anyMatch(defaultPackageNames::contains))
```

### UnnecessaryLocalVariable
Local variable `pattern` is redundant
in `src/main/java/org/codehaus/groovy/transform/NewifyASTTransformation.java`
#### Snippet
```java
        if (constExpr.getValue() == null || text.isEmpty()) { return null; }
        try {
            final Pattern pattern = Pattern.compile(text);
            return pattern;
        } catch (PatternSyntaxException e) {
```

### UnnecessaryLocalVariable
Local variable `includePseudoGetters` is redundant
in `src/main/java/org/codehaus/groovy/transform/ToStringASTTransformation.java`
#### Snippet
```java

        Set<String> names = new HashSet<>();
        boolean includeProperties = true, includePseudoGetters = allProperties, includePseudoSetters = false, skipReadOnly = false, includeStatic = false;
        List<PropertyNode> list = getAllProperties(names, cNode, cNode, includeProperties, includeFields, includePseudoGetters, includePseudoSetters, /*super*/false, skipReadOnly, /*reverse*/false, allNames, includeStatic);
        if (includeSuperProperties || includeSuperFields) {
```

### UnnecessaryLocalVariable
Local variable `includePseudoSetters` is redundant
in `src/main/java/org/codehaus/groovy/transform/TupleConstructorASTTransformation.java`
#### Snippet
```java
        if (!force && !makeImmutable && hasExplicitConstructor(null, cNode)) return;

        boolean includePseudoGetters = false, includePseudoSetters = allProperties, skipReadOnly = true;
        Set<String> names = new HashSet<>();
        List<PropertyNode> superList;
```

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `src/main/java/org/codehaus/groovy/transform/sc/transformers/ConstructorCallTransformer.java`
#### Snippet
```java
                        // for example, foo(x:1, y:2) is replaced with:
                        // { def tmp = new Foo(); tmp.x = 1; tmp.y = 2; return tmp }()
                        MapStyleConstructorCall result = new MapStyleConstructorCall(
                                staticCompilationTransformer,
                                declaringClass,
```

### UnnecessaryLocalVariable
Local variable `sb` is redundant
in `src/main/java/org/codehaus/groovy/transform/stc/Receiver.java`
#### Snippet
```java
    @Override
    public String toString() {
        String sb = "Receiver" +
                "{type=" + type +
                ", data=" + data +
```

### UnnecessaryLocalVariable
Local variable `argAssignment` is redundant
in `src/main/java/org/codehaus/groovy/transform/tailrec/ReturnStatementToIterationConverter.java`
#### Snippet
```java
        String argName = (String) positionMapping.get(index).get("name");
        ClassNode argAndTempType = (ClassNode) positionMapping.get(index).get("type");
        ExpressionStatement argAssignment = (ExpressionStatement) assignS(varX(argName, argAndTempType), expression);
        return argAssignment;
    }
```

### UnnecessaryLocalVariable
Local variable `value` is redundant
in `src/main/java/org/codehaus/groovy/reflection/GroovyClassValuePreJava7.java`
#### Snippet
```java
	public T get(Class<?> type) {
		// the value isn't use in the getOrPut call - see the EntryWithValue constructor above
		T value = ((EntryWithValue)map.getOrPut(type, null)).getValue();
		//all entries are guaranteed to be EntryWithValue. Value can only be null if computeValue returns null
		return value;
```

### UnnecessaryLocalVariable
Local variable `metaMethod` is redundant
in `src/main/java/org/codehaus/groovy/reflection/MixinInMetaClass.java`
#### Snippet
```java

        for (MetaMethod res : arr) {
            final MetaMethod metaMethod = res;
            if (metaMethod.getDeclaringClass().isAssignableFrom(selfClass))
                mc.registerInstanceMethod(metaMethod);
```

### UnnecessaryLocalVariable
Local variable `propertyList` is redundant
in `src/main/java/groovy/lang/ExpandoMetaClass.java`
#### Snippet
```java
    @Override
    public List<MetaProperty> getProperties() {
        List<MetaProperty> propertyList = new ArrayList<MetaProperty>(super.getProperties());
        return propertyList;
    }
```

### UnnecessaryLocalVariable
Local variable `ret` is redundant
in `src/main/java/groovy/util/Expando.java`
#### Snippet
```java
            Closure closure = (Closure) method;
            closure.setDelegate(this);
            Integer ret = (Integer) closure.call();
            return ret;
        } else {
```

### UnnecessaryLocalVariable
Local variable `ret` is redundant
in `src/main/java/groovy/util/Expando.java`
#### Snippet
```java
            Closure closure = (Closure) method;
            closure.setDelegate(this);
            Boolean ret = (Boolean) closure.call(obj);
            return ret;
        } else {
```

### UnnecessaryLocalVariable
Local variable `group` is redundant
in `src/main/java/groovy/util/FactoryBuilderSupport.java`
#### Snippet
```java

    private Set<String> getRegistrationGroup(String name) {
        Set<String> group = registrationGroup.computeIfAbsent(name, k -> new TreeSet<String>());
        return group;
    }
```

### UnnecessaryLocalVariable
Local variable `success` is redundant
in `src/main/java/groovy/transform/options/DefaultPropertyHandler.java`
#### Snippet
```java
    @Override
    public boolean validateAttributes(final AbstractASTTransformation xform, final AnnotationNode anno) {
        boolean success = true;
      //success |= isValidAttribute(xform, anno, "");
        return success;
```

### UnnecessaryLocalVariable
Local variable `metaClass` is redundant
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
        Class ownerClass = object.getClass();
        if (ownerClass == Class.class) ownerClass = (Class) object;
        MetaClass metaClass = registry.getMetaClass(ownerClass);
        return metaClass;
    }
```

### UnnecessaryLocalVariable
Local variable `clazz` is redundant
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java

    private MetaProperty getMetaProperty(final String name, final boolean useStatic) {
        CachedClass clazz = theCachedClass;
        Map<String, MetaProperty> propertyMap;
        if (useStatic) {
```

### UnnecessaryLocalVariable
Local variable `closureSignatures` is redundant
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
            @SuppressWarnings("unchecked")
            Class<? extends ClosureSignatureHint> hintClass = (Class<? extends ClosureSignatureHint>) getTransformLoader().loadClass(hintTypeName);
            List<ClassNode[]> closureSignatures = hintClass.getDeclaredConstructor().newInstance().getClosureSignatures(
                    mn instanceof ExtensionMethodNode ? ((ExtensionMethodNode) mn).getExtensionMethodNode() : mn,
                    typeCheckingContext.getSource(),
```

### UnnecessaryLocalVariable
Local variable `_chars` is redundant
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/ReaderCharacterSource.java`
#### Snippet
```java
    public final boolean consumeIfMatch(char[] match) {
        try {
            char[] _chars = readBuf;
            int i = 0;
            int idx = index;
```

### UnnecessaryLocalVariable
Local variable `key` is redundant
in `subprojects/groovy-xml/src/main/java/groovy/xml/streamingmarkupsupport/Builder.java`
#### Snippet
```java

        for (Object o : methodMap.keySet()) {
            final Object key = o;
            final Object value = methodMap.get(key);

```

## RuleId[id=RedundantFileCreation]
### RedundantFileCreation
`new File` is redundant
in `subprojects/groovy-xml/src/main/java/org/apache/groovy/xml/tools/DomToGroovy.java`
#### Snippet
```java
        } else {
            try {
                writer = new PrintWriter(new FileWriter(new File(args[1])));
            } catch (IOException e) {
                System.out.println("Unable to create output file '" + args[1] + "': " + e.getMessage());
```

## RuleId[id=IntegerDivisionInFloatingPointContext]
### IntegerDivisionInFloatingPointContext
`fm.getHeight() / 2`: integer division in floating-point context
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/TextEditor.java`
#### Snippet
```java
            ((Graphics2D) graphics).drawString(name,
                    (float) (paper.getImageableWidth() / 2 - width / 2),
                    (float) height - fm.getHeight() / 2);

            ((Graphics2D) graphics).translate(0, fm.getHeight());
```

### IntegerDivisionInFloatingPointContext
`fm.getHeight() / 2`: integer division in floating-point context
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/TextEditor.java`
#### Snippet
```java
            ((Graphics2D) graphics).drawString(pageStr,
                    (float) (paper.getImageableWidth() / 2 - width / 2),
                    (float) height - fm.getHeight() / 2);

            return Printable.PAGE_EXISTS;
```

## RuleId[id=AssignmentToCatchBlockParameter]
### AssignmentToCatchBlockParameter
Assignment to 'catch' block parameter `e`
in `src/main/java/groovy/ui/GroovyMain.java`
#### Snippet
```java
            if (e instanceof InvokerInvocationException) {
                InvokerInvocationException iie = (InvokerInvocationException) e;
                e = iie.getCause();
            }
            System.err.println("Caught: " + e);
```

## RuleId[id=ConditionalBreakInInfiniteLoop]
### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `src/main/java/org/apache/groovy/antlr/LexerFrame.java`
#### Snippet
```java

        int tokenCnt = 0;
        while (true) {
            token = lexer.nextToken();
            JToggleButton tokenButton = new JToggleButton(tokens.get(token.getType()));
```

### ConditionalBreakInInfiniteLoop
Conditional break inside loop
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java

        int index = 0;
        while (true) {
            char c = charArray[index];

```

## RuleId[id=EmptyTryBlock]
### EmptyTryBlock
Empty `try` block
in `src/main/java/groovy/util/GroovyScriptEngine.java`
#### Snippet
```java

    private static void verifyInputStream(URLConnection urlConnection) throws IOException {
        try (InputStream in = urlConnection.getInputStream()) {
        }
    }
```

## RuleId[id=SuspiciousSystemArraycopy]
### SuspiciousSystemArraycopy
`result` is not of an array type
in `src/main/java/org/codehaus/groovy/runtime/MetaClassHelper.java`
#### Snippet
```java
        }
        Object result = makeArray(null, baseClass, arguments.length - offset);
        System.arraycopy(arguments, offset, result, 0, arguments.length - offset);
        return result;
    }
```

### SuspiciousSystemArraycopy
Source parameter type 'java.lang.Object\[\]' is not assignable to destination parameter `result` of type 'T\[\]'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
        List<T> items = Arrays.asList(self);
        Collections.shuffle(items, rnd);
        System.arraycopy(items.toArray(), 0, result, 0, items.size());
        return result;
    }
```

### SuspiciousSystemArraycopy
`newArray` is not of an array type
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/LazyMap.java`
#### Snippet
```java
    public static <V> V[] grow(V[] array) {
        Object newArray = Array.newInstance(array.getClass().getComponentType(), array.length * 2);
        System.arraycopy(array, 0, newArray, 0, array.length);
        return (V[]) newArray;
    }
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `subprojects/groovy-json/src/main/java/groovy/json/DefaultJsonGenerator.java`
#### Snippet
```java
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                throw new IllegalArgumentException("Maps with null keys can\'t be converted to JSON");
            }
            String key = entry.getKey().toString();
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/org/codehaus/groovy/runtime/CurriedClosure.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("unchecked")
    public Object clone() {
        Closure<V> uncurriedClosure = (Closure<V>) ((Closure) getOwner()).clone();
        return new CurriedClosure<V>(index, uncurriedClosure, curriedParams);
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/org/codehaus/groovy/runtime/ComposedClosure.java`
#### Snippet
```java

    @Override
    public Object clone() {
        return new ComposedClosure<V>(first, second);
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/groovy/lang/Tuple9.java`
#### Snippet
```java

    @Override
    public Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> clone() {
        return new Tuple9<>(this);
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/groovy/lang/Tuple16.java`
#### Snippet
```java

    @Override
    public Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> clone() {
        return new Tuple16<>(this);
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/groovy/lang/Closure.java`
#### Snippet
```java
         */
        @Override
        public Object clone() {
            return ((Closure) Closure.this.clone()).asWritable();
        }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/groovy/lang/Tuple14.java`
#### Snippet
```java

    @Override
    public Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> clone() {
        return new Tuple14<>(this);
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/groovy/lang/Tuple8.java`
#### Snippet
```java

    @Override
    public Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> clone() {
        return new Tuple8<>(this);
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/groovy/lang/Tuple2.java`
#### Snippet
```java

    @Override
    public Tuple2<T1, T2> clone() {
        return new Tuple2<>(this);
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/groovy/lang/Tuple5.java`
#### Snippet
```java

    @Override
    public Tuple5<T1, T2, T3, T4, T5> clone() {
        return new Tuple5<>(this);
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/groovy/lang/Tuple3.java`
#### Snippet
```java

    @Override
    public Tuple3<T1, T2, T3> clone() {
        return new Tuple3<>(this);
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/groovy/lang/Tuple11.java`
#### Snippet
```java

    @Override
    public Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> clone() {
        return new Tuple11<>(this);
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/groovy/lang/Tuple4.java`
#### Snippet
```java

    @Override
    public Tuple4<T1, T2, T3, T4> clone() {
        return new Tuple4<>(this);
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/groovy/lang/Tuple10.java`
#### Snippet
```java

    @Override
    public Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> clone() {
        return new Tuple10<>(this);
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/groovy/lang/Tuple6.java`
#### Snippet
```java

    @Override
    public Tuple6<T1, T2, T3, T4, T5, T6> clone() {
        return new Tuple6<>(this);
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/groovy/lang/Tuple13.java`
#### Snippet
```java

    @Override
    public Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> clone() {
        return new Tuple13<>(this);
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/groovy/lang/Tuple1.java`
#### Snippet
```java

    @Override
    public Tuple1<T1> clone() {
        return new Tuple1<>(this);
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/groovy/lang/Tuple7.java`
#### Snippet
```java

    @Override
    public Tuple7<T1, T2, T3, T4, T5, T6, T7> clone() {
        return new Tuple7<>(this);
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/groovy/lang/Tuple12.java`
#### Snippet
```java

    @Override
    public Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> clone() {
        return new Tuple12<>(this);
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/groovy/lang/Tuple.java`
#### Snippet
```java

    @Override
    public Tuple<E> clone() {
        return new Tuple<>(this);
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/groovy/lang/Tuple15.java`
#### Snippet
```java

    @Override
    public Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> clone() {
        return new Tuple15<>(this);
    }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
     */
    @Override
    public Object clone() {
        Object newValue = value;
        if (value instanceof NodeList) {
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserCharArray.java`
#### Snippet
```java
                break;
            case '-':
                value = decodeNumber();
                break;

```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserLax.java`
#### Snippet
```java

                case '\r':
                    break;

                case ' ':
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserLax.java`
#### Snippet
```java

                case ' ':
                    break;

                case '\t':
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserLax.java`
#### Snippet
```java

                case '\t':
                    break;

                case '\b':
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserLax.java`
#### Snippet
```java

                case '\b':
                    break;

                case '\f':
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserLax.java`
#### Snippet
```java

                case '\f':
                    break;

                case '/': /* */ //
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserLax.java`
#### Snippet
```java
                case ',':
                case ';':
                    continue;

                case ']':
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserLax.java`
#### Snippet
```java

                case ']':
                    continue;
                default:
                    break endIndexLookup;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `subprojects/groovy-json/src/main/java/groovy/json/JsonSlurper.java`
#### Snippet
```java

            case CHAR_BUFFER:
                return new JsonParserCharArray();

            case CHARACTER_SOURCE:
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `phaseNumber` in enum 'CompilePhase'
in `src/main/java/org/codehaus/groovy/control/CompilePhase.java`
#### Snippet
```java
    };

    int phaseNumber;
    CompilePhase(int phaseNumber) {
        this.phaseNumber = phaseNumber;
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`\\p{Digit}` can be simplified to '\\d'
in `src/test/groovy/GroovyMethodsTest.groovy`
#### Snippet
```java

    void testReplaceAllClosurePattern() {
        assert "1 a 2 b 3 c 4".replaceAll(~"\\p{Digit}") {it * 2} == "11 a 22 b 33 c 44"
    }

```

### RegExpSimplifiable
`[\\.]` can be simplified to '\\.'
in `subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovy.java`
#### Snippet
```java
            String name = PREFIX;
            if (getLocation().getFileName().length() > 0)
                name += getLocation().getFileName().replaceAll("[^\\w_\\.]", "_").replaceAll("[\\.]", "_dot_");
            else
                name += SUFFIX;
```

### RegExpSimplifiable
`[\t]` can be simplified to ' '
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/TextEditor.java`
#### Snippet
```java
    private static final String TABBED_SPACES = "    ";
    private static final Pattern TAB_BACK_PATTERN =
            Pattern.compile("^(([\t])|(    )|(   )|(  )|( ))", Pattern.MULTILINE);
    private static final Pattern LINE_START =
            Pattern.compile("^", Pattern.MULTILINE);
```

### RegExpSimplifiable
`{1}` is redundant
in `subprojects/groovy-groovysh/src/main/groovy/org/apache/groovy/groovysh/commands/ImportCommand.groovy`
#### Snippet
```java
     */
    // matches fully qualified Classnames with dot at the end
    private static final Pattern QUALIFIED_CLASS_DOT_PATTERN = ~/^[a-z_]{1}[a-z0-9_]*(\.[a-z0-9_]*)*\.[A-Z][^.]*\.$/
    // matches empty, packagenames or fully qualified classNames
    private static final Pattern PACK_OR_CLASSNAME_PATTERN = ~/^([a-z_]{1}[a-z0-9_]*(\.[a-z0-9_]*)*(\.[A-Z][^.]*)?)?$/
```

### RegExpSimplifiable
`{1}` is redundant
in `subprojects/groovy-groovysh/src/main/groovy/org/apache/groovy/groovysh/commands/ImportCommand.groovy`
#### Snippet
```java
    private static final Pattern QUALIFIED_CLASS_DOT_PATTERN = ~/^[a-z_]{1}[a-z0-9_]*(\.[a-z0-9_]*)*\.[A-Z][^.]*\.$/
    // matches empty, packagenames or fully qualified classNames
    private static final Pattern PACK_OR_CLASSNAME_PATTERN = ~/^([a-z_]{1}[a-z0-9_]*(\.[a-z0-9_]*)*(\.[A-Z][^.]*)?)?$/
    // matches empty, packagenames or fully qualified classNames without special symbols
    private static final Pattern PACK_OR_SIMPLE_CLASSNAME_PATTERN = ~'^([a-z_]{1}[a-z0-9_]*(\\.[a-z0-9_]*)*(\\.[A-Z][^.\$_]*)?)?\$'
```

### RegExpSimplifiable
`{1}` is redundant
in `subprojects/groovy-groovysh/src/main/groovy/org/apache/groovy/groovysh/commands/ImportCommand.groovy`
#### Snippet
```java
    private static final Pattern PACK_OR_CLASSNAME_PATTERN = ~/^([a-z_]{1}[a-z0-9_]*(\.[a-z0-9_]*)*(\.[A-Z][^.]*)?)?$/
    // matches empty, packagenames or fully qualified classNames without special symbols
    private static final Pattern PACK_OR_SIMPLE_CLASSNAME_PATTERN = ~'^([a-z_]{1}[a-z0-9_]*(\\.[a-z0-9_]*)*(\\.[A-Z][^.\$_]*)?)?\$'
    // matches empty, packagenames or fully qualified classNames or fully qualified method names
    private static final Pattern PACK_OR_CLASS_OR_METHODNAME_PATTERN = ~'^([a-z_]{1}[a-z0-9.]*(\\.[a-z0-9_]*)*(\\.[A-Z][^.\$_]*(\\.[a-zA-Z0-9_]*)?)?)?\$'
```

### RegExpSimplifiable
`{1}` is redundant
in `subprojects/groovy-groovysh/src/main/groovy/org/apache/groovy/groovysh/commands/ImportCommand.groovy`
#### Snippet
```java
    private static final Pattern PACK_OR_SIMPLE_CLASSNAME_PATTERN = ~'^([a-z_]{1}[a-z0-9_]*(\\.[a-z0-9_]*)*(\\.[A-Z][^.\$_]*)?)?\$'
    // matches empty, packagenames or fully qualified classNames or fully qualified method names
    private static final Pattern PACK_OR_CLASS_OR_METHODNAME_PATTERN = ~'^([a-z_]{1}[a-z0-9.]*(\\.[a-z0-9_]*)*(\\.[A-Z][^.\$_]*(\\.[a-zA-Z0-9_]*)?)?)?\$'
    private static final Pattern LOWERCASE_IMPORT_ITEM_PATTERN = ~/^[a-z0-9.]+$/

```

### RegExpSimplifiable
`[=]` can be simplified to '='
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java

        private boolean appearsLikeStoredProc(String sql) {
            return sql.matches("\\s*[{]?\\s*[?]?\\s*[=]?\\s*[cC][aA][lL][lL].*");
        }
    }
```

### RegExpSimplifiable
`{` can be simplified to '\*'
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
        int firstWhere = findWhereKeyword(sql);
        if (firstWhere >= 0) {
            Pattern[] patterns = {Pattern.compile("(?is)^(.{" + firstWhere + "}.*?)!=\\s{0,1}(\\s*)\\?'\"\\?(.*)"),
                    Pattern.compile("(?is)^(.{" + firstWhere + "}.*?)<>\\s{0,1}(\\s*)\\?'\"\\?(.*)"),
                    Pattern.compile("(?is)^(.{" + firstWhere + "}.*?[^<>])=\\s{0,1}(\\s*)\\?'\"\\?(.*)"),};
```

### RegExpSimplifiable
`{0,1}` can be simplified to '?'
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
        int firstWhere = findWhereKeyword(sql);
        if (firstWhere >= 0) {
            Pattern[] patterns = {Pattern.compile("(?is)^(.{" + firstWhere + "}.*?)!=\\s{0,1}(\\s*)\\?'\"\\?(.*)"),
                    Pattern.compile("(?is)^(.{" + firstWhere + "}.*?)<>\\s{0,1}(\\s*)\\?'\"\\?(.*)"),
                    Pattern.compile("(?is)^(.{" + firstWhere + "}.*?[^<>])=\\s{0,1}(\\s*)\\?'\"\\?(.*)"),};
```

### RegExpSimplifiable
`{` can be simplified to '\*'
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
        if (firstWhere >= 0) {
            Pattern[] patterns = {Pattern.compile("(?is)^(.{" + firstWhere + "}.*?)!=\\s{0,1}(\\s*)\\?'\"\\?(.*)"),
                    Pattern.compile("(?is)^(.{" + firstWhere + "}.*?)<>\\s{0,1}(\\s*)\\?'\"\\?(.*)"),
                    Pattern.compile("(?is)^(.{" + firstWhere + "}.*?[^<>])=\\s{0,1}(\\s*)\\?'\"\\?(.*)"),};
            String[] replacements = {"$1 is not $2null$3", "$1 is not $2null$3", "$1 is $2null$3",};
```

### RegExpSimplifiable
`{0,1}` can be simplified to '?'
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
        if (firstWhere >= 0) {
            Pattern[] patterns = {Pattern.compile("(?is)^(.{" + firstWhere + "}.*?)!=\\s{0,1}(\\s*)\\?'\"\\?(.*)"),
                    Pattern.compile("(?is)^(.{" + firstWhere + "}.*?)<>\\s{0,1}(\\s*)\\?'\"\\?(.*)"),
                    Pattern.compile("(?is)^(.{" + firstWhere + "}.*?[^<>])=\\s{0,1}(\\s*)\\?'\"\\?(.*)"),};
            String[] replacements = {"$1 is not $2null$3", "$1 is not $2null$3", "$1 is $2null$3",};
```

### RegExpSimplifiable
`{` can be simplified to '\*'
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
            Pattern[] patterns = {Pattern.compile("(?is)^(.{" + firstWhere + "}.*?)!=\\s{0,1}(\\s*)\\?'\"\\?(.*)"),
                    Pattern.compile("(?is)^(.{" + firstWhere + "}.*?)<>\\s{0,1}(\\s*)\\?'\"\\?(.*)"),
                    Pattern.compile("(?is)^(.{" + firstWhere + "}.*?[^<>])=\\s{0,1}(\\s*)\\?'\"\\?(.*)"),};
            String[] replacements = {"$1 is not $2null$3", "$1 is not $2null$3", "$1 is $2null$3",};
            for (int i = 0; i < patterns.length; i++) {
```

### RegExpSimplifiable
`{0,1}` can be simplified to '?'
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
            Pattern[] patterns = {Pattern.compile("(?is)^(.{" + firstWhere + "}.*?)!=\\s{0,1}(\\s*)\\?'\"\\?(.*)"),
                    Pattern.compile("(?is)^(.{" + firstWhere + "}.*?)<>\\s{0,1}(\\s*)\\?'\"\\?(.*)"),
                    Pattern.compile("(?is)^(.{" + firstWhere + "}.*?[^<>])=\\s{0,1}(\\s*)\\?'\"\\?(.*)"),};
            String[] replacements = {"$1 is not $2null$3", "$1 is not $2null$3", "$1 is $2null$3",};
            for (int i = 0; i < patterns.length; i++) {
```

### RegExpSimplifiable
`{1}` is redundant
in `subprojects/performance/src/files/pleac05_06.groovy`
#### Snippet
```java

// extract basename
assert 'c:/usr/temp.txt'.replaceAll(/^.*\/{1}/, '') == 'temp.txt'

termcap = ':co#80:li#24:'
```

### RegExpSimplifiable
`{1}` is redundant
in `subprojects/performance/src/files/pleac05_06.groovy`
#### Snippet
```java
assert m[0][1] == '80'

assert 'cmd c:/tmp/junk.txt'.replaceAll(/ \S+\/{1}/, ' ') == 'cmd junk.txt'

os = System.getProperty('os.name')
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder result` can be replaced with 'String'
in `src/main/java/groovy/lang/TracingInterceptor.java`
#### Snippet
```java
                .map(arg -> arg != null ? arg.getClass().getName() : "java.lang.Object") // GROOVY-10009
                .collect(java.util.stream.Collectors.joining(", "));
        StringBuilder result = new StringBuilder(aClass.getName());
        result.append('.').append(methodName).append('(');
        result.append(argumentTypes).append(')');
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/dsl/GinqAstBuilder.java`
#### Snippet
```java
            latestGinqExpression.setSourcePosition(call);

            return;
        }
    }
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`preRootValue == null ? false : DefaultGroovyMethods.asType(preRootValue, Boolean.class).booleanValue()` can be simplified to 'preRootValue!=null \&\& DefaultGroovyMethods.asType(preRootValue, Boolean.class).booleanValue()'
in `src/main/java/org/codehaus/groovy/runtime/ResourceGroovyMethods.java`
#### Snippet
```java
            maxDepth = maxDepthValue == null ? -1 : DefaultGroovyMethods.asType(maxDepthValue, Number.class).intValue();
            Object preRootValue = options.get("preRoot");
            preRoot = preRootValue == null ? false : DefaultGroovyMethods.asType(preRootValue, Boolean.class).booleanValue();
            Object postRootValue = options.get("postRoot");
            postRoot = postRootValue == null ? false : DefaultGroovyMethods.asType(postRootValue, Boolean.class).booleanValue();
```

### SimplifiableConditionalExpression
`postRootValue == null ? false : DefaultGroovyMethods.asType(postRootValue, Boolean.class).booleanValue()` can be simplified to 'postRootValue!=null \&\& DefaultGroovyMethods.asType(postRootValue, Boolean.class).booleanValue()'
in `src/main/java/org/codehaus/groovy/runtime/ResourceGroovyMethods.java`
#### Snippet
```java
            preRoot = preRootValue == null ? false : DefaultGroovyMethods.asType(preRootValue, Boolean.class).booleanValue();
            Object postRootValue = options.get("postRoot");
            postRoot = postRootValue == null ? false : DefaultGroovyMethods.asType(postRootValue, Boolean.class).booleanValue();
            Object visitRootValue = options.get("visitRoot");
            visitRoot = visitRootValue == null ? false : DefaultGroovyMethods.asType(visitRootValue, Boolean.class).booleanValue();
```

### SimplifiableConditionalExpression
`visitRootValue == null ? false : DefaultGroovyMethods.asType(visitRootValue, Boolean.class).booleanValue()` can be simplified to 'visitRootValue!=null \&\& DefaultGroovyMethods.asType(visitRootValue, Boolean.class).booleanValue()'
in `src/main/java/org/codehaus/groovy/runtime/ResourceGroovyMethods.java`
#### Snippet
```java
            postRoot = postRootValue == null ? false : DefaultGroovyMethods.asType(postRootValue, Boolean.class).booleanValue();
            Object visitRootValue = options.get("visitRoot");
            visitRoot = visitRootValue == null ? false : DefaultGroovyMethods.asType(visitRootValue, Boolean.class).booleanValue();
        }

```

### SimplifiableConditionalExpression
`!handlers.contains(handler) ? handlers.add(handler) : false` can be simplified to '!handlers.contains(handler) \&\& handlers.add(handler)'
in `src/main/java/org/codehaus/groovy/transform/stc/DefaultTypeCheckingExtension.java`
#### Snippet
```java

    public boolean addHandler(final TypeCheckingExtension handler) {
        return !handlers.contains(handler) ? handlers.add(handler) : false;
    }

```

### SimplifiableConditionalExpression
`inClosure ? call.isImplicitThis() : false` can be simplified to 'inClosure \&\& call.isImplicitThis()'
in `src/main/java/org/codehaus/groovy/transform/trait/TraitReceiverTransformer.java`
#### Snippet
```java

        MethodCallExpression newCall = callX(inClosure ? thisExpr : weaved, method, transform(arguments));
        newCall.setImplicitThis(inClosure ? call.isImplicitThis() : false);
        newCall.setSafe(inClosure ? call.isSafe() : false);
        newCall.setSpreadSafe(call.isSpreadSafe());
```

### SimplifiableConditionalExpression
`inClosure ? call.isSafe() : false` can be simplified to 'inClosure \&\& call.isSafe()'
in `src/main/java/org/codehaus/groovy/transform/trait/TraitReceiverTransformer.java`
#### Snippet
```java
        MethodCallExpression newCall = callX(inClosure ? thisExpr : weaved, method, transform(arguments));
        newCall.setImplicitThis(inClosure ? call.isImplicitThis() : false);
        newCall.setSafe(inClosure ? call.isSafe() : false);
        newCall.setSpreadSafe(call.isSpreadSafe());
        newCall.setSourcePosition(call);
```

### SimplifiableConditionalExpression
`isNonStaticHelperMethod(node) ? false : node.isStatic()` can be simplified to '!isNonStaticHelperMethod(node) \&\& node.isStatic()'
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
            try {
                // GROOVY-7890: non-static trait method is static in helper type
                typeCheckingContext.isInStaticContext = isNonStaticHelperMethod(node) ? false : node.isStatic();

                super.visitMethod(node);
```

### SimplifiableConditionalExpression
`receiver.getData() == null ? staticOnlyAccess : false` can be simplified to 'receiver.getData() == null \&\& staticOnlyAccess'
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
                }

                boolean staticOnly = (receiver.getData() == null ? staticOnlyAccess : false);
                // in case of a lookup on java.lang.Class, look for instance methods on Class
                // as well; in case of static property access Class<Type> and Type are listed
```

### SimplifiableConditionalExpression
`backwards ? !reverse : reverse` can be simplified to 'backwards != reverse'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/FindReplaceUtility.java`
#### Snippet
```java
    private static int findNext(boolean reverse, int pos) {
        boolean backwards = IS_BACKWARDS_CHECKBOX.isSelected();
        backwards = backwards ? !reverse : reverse;

        String pattern = (String) FIND_FIELD.getSelectedItem();
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `src/main/java/org/apache/groovy/parser/antlr4/util/StringUtils.java`
#### Snippet
```java
		final int replLength = searchString.length();
		int increase = replacement.length() - replLength;
		increase = (increase < 0 ? 0 : increase) * 16;
		final StringBuilder buf = new StringBuilder(text.length() + increase);
		while (end != INDEX_NOT_FOUND) {
```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
                // the default style of this lexer node
                if (offset != matchEnd) {
                    offset = offset > checkPoint ? checkPoint : offset;
                    styledDocument.setCharacterAttributes(matchEnd, offset - matchEnd, defaultStyle, true);
                    if (offset >= checkPoint) {
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/groovy/io/StringBuilderWriter.java`
#### Snippet
```java

/**
 * Copied from https://github.com/apache/commons-io/blob/master/src/main/java/org/apache/commons/io/output/StringBuilderWriter.java
 *
 * {@link Writer} implementation that outputs to a {@link StringBuilder}.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/groovy/parser/antlr4/TryWithResourcesASTTransformation.java`
#### Snippet
```java
/**
 * Transform try-with-resources to try-catch-finally
 * Reference JLS "14.20.3. try-with-resources"(https://docs.oracle.com/javase/specs/jls/se7/html/jls-14.html)
 */
public class TryWithResourcesASTTransformation {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/groovy/parser/antlr4/TryWithResourcesASTTransformation.java`
#### Snippet
```java

    /**
     * See https://docs.oracle.com/javase/specs/jls/se9/html/jls-14.html
     * 14.20.3.1. Basic try-with-resources
     *
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/codehaus/groovy/runtime/InvokerHelper.java`
#### Snippet
```java
    /**
     * According to the initial entry count, calculate the initial capacity of hash map, which is power of 2
     * (SEE https://stackoverflow.com/questions/8352378/why-does-hashmap-require-that-the-initial-capacity-be-a-power-of-two)
     *
     * @param initialEntryCnt the initial entry count
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/codehaus/groovy/reflection/GroovyClassValueFactory.java`
#### Snippet
```java
	 * This flag is introduced as a (hopefully) temporary workaround for a JVM bug, that is to say that using
	 * ClassValue prevents the classes and classloaders from being unloaded.
	 * See https://bugs.openjdk.java.net/browse/JDK-8136353
	 * This issue does not exist on IBM Java (J9) so use ClassValue by default on that JVM.
	 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/groovy/lang/GrabResolver.java`
#### Snippet
```java
 * For example:
 * <pre>
 * {@code @GrabResolver}(name='restlet.org', root='http://maven.restlet.org')
 * {@code @Grab}(group='org.restlet', module='org.restlet', version='1.1.6')
 * class MyRestlet extends org.restlet.Restlet {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/groovy/lang/GroovyCodeSource.java`
#### Snippet
```java
     * charset from Content-Type header) in future releases.
     *
     * see GROOVY-8056 and https://github.com/apache/groovy/pull/500
     */
    private static String getContentEncoding(URL url) throws IOException {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `subprojects/groovy-json/src/main/java/groovy/json/JsonTokenType.java`
#### Snippet
```java
     * Original pattern throws the StackOverflowError for long strings with backslashes.
     * So it is replaced by a 2-step approach inspired from json2.js sources:
     *     https://github.com/douglascrockford/JSON-js/blob/master/json2.js#L462
     *
     * See JsonTokenTypeTest#testMatchingLongStringWithBackslashes() for details.
```

### JavadocLinkAsPlainText
Link specified as plain text
in `subprojects/groovy-templates/src/main/groovy/groovy/text/XmlTemplateEngine.java`
#### Snippet
```java
 * def text = '''\
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;
 * &lt;document xmlns:gsp='http://groovy.codehaus.org/2005/gsp' xmlns:foo='baz' type='letter'&gt;
 *   &lt;gsp:scriptlet&gt;def greeting = "${salutation}est"&lt;/gsp:scriptlet&gt;
 *   &lt;gsp:expression&gt;greeting&lt;/gsp:expression&gt;
```

### JavadocLinkAsPlainText
Link specified as plain text
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
 * Or insert a row using JDBC PreparedStatement inspired syntax:
 * <pre>
 * def params = [10, 'Groovy', 'http://groovy.codehaus.org']
 * sql.execute 'insert into PROJECT (id, name, url) values (?, ?, ?)', params
 * </pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
 * Or insert a row using GString syntax:
 * <pre>
 * def map = [id:20, name:'Grails', url:'http://grails.codehaus.org']
 * sql.execute "insert into PROJECT (id, name, url) values ($map.id, $map.name, $map.url)"
 * </pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
 * Or a row update:
 * <pre>
 * def newUrl = 'http://grails.org'
 * def project = 'Grails'
 * sql.executeUpdate "update PROJECT set url=$newUrl where name=$project"
```

### JavadocLinkAsPlainText
Link specified as plain text
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
 * <pre>
 * Some GR8 projects:
 * Groovy     (http://groovy.codehaus.org)
 * Grails     (http://grails.org)
 * Griffon    (http://griffon.codehaus.org)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
 * Some GR8 projects:
 * Groovy     (http://groovy.codehaus.org)
 * Grails     (http://grails.org)
 * Griffon    (http://griffon.codehaus.org)
 * Gradle     (http://gradle.org)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
 * Groovy     (http://groovy.codehaus.org)
 * Grails     (http://grails.org)
 * Griffon    (http://griffon.codehaus.org)
 * Gradle     (http://gradle.org)
 * </pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
 * Grails     (http://grails.org)
 * Griffon    (http://griffon.codehaus.org)
 * Gradle     (http://gradle.org)
 * </pre>
 * Now try a query using <code>rows</code>:
```

### JavadocLinkAsPlainText
Link specified as plain text
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
 * with output like this:
 * <pre>
 * [ID:20, NAME:Grails, URL:http://grails.org]
 * [ID:40, NAME:Gradle, URL:http://gradle.org]
 * </pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
 * <pre>
 * [ID:20, NAME:Grails, URL:http://grails.org]
 * [ID:40, NAME:Gradle, URL:http://gradle.org]
 * </pre>
 * Also, <code>eachRow</code> and <code>rows</code> support paging.  Here's an example:
```

### JavadocLinkAsPlainText
Link specified as plain text
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
 * Which will start at the second row and return a maximum of 2 rows.  Here's an example result:
 * <pre>
 * Grails     (http://grails.org)
 * Griffon    (http://griffon.codehaus.org)
 * </pre>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
 * <pre>
 * Grails     (http://grails.org)
 * Griffon    (http://griffon.codehaus.org)
 * </pre>
 *
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/groovy/antlr/LexerFrame.java`
#### Snippet
```java
    }

    private final Action loadFileAction = new AbstractAction("Open File...") {
        private static final long serialVersionUID = 4541927184172762704L;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/codehaus/groovy/tools/javac/JavaAwareCompilationUnit.java`
#### Snippet
```java
    private final Set<String> javaSources = new HashSet<>();
    private JavaCompilerFactory compilerFactory = new JavacCompilerFactory();
    private final File generationGoal;
    private final boolean keepStubs;
    private final boolean memStubEnabled;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/codehaus/groovy/tools/javac/JavaAwareCompilationUnit.java`
#### Snippet
```java
    private final File generationGoal;
    private final boolean keepStubs;
    private final boolean memStubEnabled;

    public JavaAwareCompilationUnit() {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/codehaus/groovy/runtime/IOGroovyMethods.java`
#### Snippet
```java
    }

    private static int charBufferSize = 4096;     // half the default stream buffer size
    private static int expectedLineLength = 160;  // double the default line length
    private static int EOF = -1;                  // End Of File
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/codehaus/groovy/classgen/DummyClassGenerator.java`
#### Snippet
```java
    private ClassNode classNode;
    private String internalClassName;
    private String internalBaseClassName;


```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/codehaus/groovy/classgen/DummyClassGenerator.java`
#### Snippet
```java
    // current class details
    private ClassNode classNode;
    private String internalClassName;
    private String internalBaseClassName;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/ConsoleTextEditor.java`
#### Snippet
```java
    private PrintAction printAction = new PrintAction();

    private boolean editable = true;

    private TextUndoManager undoManager;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxHandler.java`
#### Snippet
```java
    public static final String UNDERLINE = "underline";

    private StructuredSyntaxDocumentFilter.LexerNode currentNode;

    private final StructuredSyntaxDocumentFilter filter;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
    // the document buffer and segment
    private Segment segment = new Segment();
    private CharBuffer buffer;

    /**
```

### FieldCanBeLocal
Field can be converted to a local variable
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/common/spi/ProcessingContextInformation.java`
#### Snippet
```java
    private boolean constructorAssertionsEnabled = true;
    private boolean preconditionsEnabled = true;
    private boolean postconditionsEnabled = true;
    private boolean classInvariantsEnabled = true;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/common/spi/ProcessingContextInformation.java`
#### Snippet
```java

    private boolean constructorAssertionsEnabled = true;
    private boolean preconditionsEnabled = true;
    private boolean postconditionsEnabled = true;
    private boolean classInvariantsEnabled = true;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/common/spi/ProcessingContextInformation.java`
#### Snippet
```java
    private boolean preconditionsEnabled = true;
    private boolean postconditionsEnabled = true;
    private boolean classInvariantsEnabled = true;

    private Map<String, Object> extra = new HashMap<String, Object>();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/provider/collection/runtime/WindowImpl.java`
#### Snippet
```java
    private final Comparator<? super T> comparator;
    private final int index;
    private final U value;
    private final List<T> list;
    private static final BigDecimal MIN_VALUE = toBigDecimal(Long.MIN_VALUE);
```

### FieldCanBeLocal
Field can be converted to a local variable
in `subprojects/groovy-jsr223/src/main/java/org/codehaus/groovy/jsr223/GroovyScriptEngineImpl.java`
#### Snippet
```java
public class GroovyScriptEngineImpl extends AbstractScriptEngine implements Compilable, Invocable {

    private static boolean debug = false;

    // script-string-to-generated Class map
```

### FieldCanBeLocal
Field can be converted to a local variable
in `subprojects/groovy-test/src/main/java/groovy/test/GroovyTestCase.java`
#### Snippet
```java
    public static final String TEST_SCRIPT_NAME_PREFIX = "TestScript";

    private boolean useAgileDoxNaming = false;

    /**
```

## RuleId[id=ThrowablePrintedToSystemOut]
### ThrowablePrintedToSystemOut
'Throwable' argument `e` to 'System.err.println()' call
in `src/main/java/groovy/ui/GroovyMain.java`
#### Snippet
```java
            return true;
        } catch (CompilationFailedException e) {
            System.err.println(e);
            return false;
        } catch (Throwable e) {
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/codehaus/groovy/transform/AutoImplementASTTransformation.java`
#### Snippet
```java
 * Generates code for the {@code @AutoImplement} annotation.
 */
@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)
public class AutoImplementASTTransformation extends AbstractASTTransformation {

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/codehaus/groovy/transform/SortableASTTransformation.java`
#### Snippet
```java
 * Injects a set of Comparators and sort methods.
 */
@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)

public class SortableASTTransformation extends AbstractASTTransformation {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/codehaus/groovy/transform/MapConstructorASTTransformation.java`
#### Snippet
```java
 * Handles generation of code for the @MapConstructor annotation.
 */
@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)
public class MapConstructorASTTransformation extends AbstractASTTransformation implements CompilationUnitAware {

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/codehaus/groovy/transform/SingletonASTTransformation.java`
#### Snippet
```java
 * Handles generation of code for the @Singleton annotation
 */
@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)
public class SingletonASTTransformation extends AbstractASTTransformation {

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/codehaus/groovy/transform/ReadWriteLockASTTransformation.java`
#### Snippet
```java
 * For more information see {@link WithReadLock} and {@link WithWriteLock}
 */
@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)
public class ReadWriteLockASTTransformation extends AbstractASTTransformation {

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/codehaus/groovy/transform/InheritConstructorsASTTransformation.java`
#### Snippet
```java
 * Handles generation of code for the {@code @}InheritConstructors annotation.
 */
@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)
public class InheritConstructorsASTTransformation extends AbstractASTTransformation {

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/codehaus/groovy/transform/SynchronizedASTTransformation.java`
#### Snippet
```java
 * Handles generation of code for the {@code @Synchronized} annotation.
 */
@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)
public class SynchronizedASTTransformation extends AbstractASTTransformation {

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/codehaus/groovy/transform/ExternalizeMethodsASTTransformation.java`
#### Snippet
```java
 * Handles generation of code for the @ExternalizeMethods annotation.
 */
@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)
public class ExternalizeMethodsASTTransformation extends AbstractASTTransformation {
    static final Class MY_CLASS = ExternalizeMethods.class;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
    public static <T,U> U tap(
            @DelegatesTo.Target("self") U self,
            @DelegatesTo(value=DelegatesTo.Target.class,
                    target="self",
                    strategy=Closure.DELEGATE_FIRST)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
    public static <T,U> T with(
            @DelegatesTo.Target("self") U self,
            @DelegatesTo(value=DelegatesTo.Target.class,
                    target="self",
                    strategy=Closure.DELEGATE_FIRST)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
            @DelegatesTo.Target("self") U self,
            boolean returning,
            @DelegatesTo(value=DelegatesTo.Target.class,
                    target="self",
                    strategy=Closure.DELEGATE_FIRST)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
    public static <T,U> T identity(
            @DelegatesTo.Target("self") U self,
            @DelegatesTo(value=DelegatesTo.Target.class,
                    target="self",
                    strategy=Closure.DELEGATE_FIRST)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/codehaus/groovy/transform/AutoCloneASTTransformation.java`
#### Snippet
```java
 * Handles generation of code for the @AutoClone annotation.
 */
@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)
public class AutoCloneASTTransformation extends AbstractASTTransformation {
    static final Class MY_CLASS = AutoClone.class;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/codehaus/groovy/transform/DelegateASTTransformation.java`
#### Snippet
```java
 * Handles generation of code for the <code>@Delegate</code> annotation
 */
@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)
public class DelegateASTTransformation extends AbstractASTTransformation {

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/codehaus/groovy/transform/EqualsAndHashCodeASTTransformation.java`
#### Snippet
```java
import static org.objectweb.asm.Opcodes.ACC_SYNTHETIC;

@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)
public class EqualsAndHashCodeASTTransformation extends AbstractASTTransformation {
    static final Class MY_CLASS = EqualsAndHashCode.class;
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/codehaus/groovy/transform/NewifyASTTransformation.java`
#### Snippet
```java
 * Handles generation of code for the {@code @Newify} AST transform.
 */
@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)
public class NewifyASTTransformation extends ClassCodeExpressionTransformer implements ASTTransformation {
    private static final ClassNode MY_TYPE = make(Newify.class);
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/codehaus/groovy/transform/SealedCompletionASTTransformation.java`
#### Snippet
```java
 * Handles sealed class permitted subclass detection.
 */
@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)
public class SealedCompletionASTTransformation extends AbstractASTTransformation {

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/codehaus/groovy/transform/ToStringASTTransformation.java`
#### Snippet
```java
 * Handles generation of code for the @ToString annotation.
 */
@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)
public class ToStringASTTransformation extends AbstractASTTransformation {

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/codehaus/groovy/transform/IndexedPropertyASTTransformation.java`
#### Snippet
```java
 * Handles generation of code for the {@code @}IndexedProperty annotation.
 */
@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)
public class IndexedPropertyASTTransformation extends AbstractASTTransformation {

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/codehaus/groovy/transform/ImmutableASTTransformation.java`
#### Snippet
```java
 * Handles generation of code for the @Immutable annotation.
 */
@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)
public class ImmutableASTTransformation extends AbstractASTTransformation implements CompilationUnitAware {

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/org/codehaus/groovy/transform/TupleConstructorASTTransformation.java`
#### Snippet
```java
 * Handles generation of code for the @TupleConstructor annotation.
 */
@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)
public class TupleConstructorASTTransformation extends AbstractASTTransformation implements CompilationUnitAware, TransformWithPriority {

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/groovy/beans/VetoableASTTransformation.java`
#### Snippet
```java
 * to what {@link BindableASTTransformation} would do.
 */
@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)
public class VetoableASTTransformation extends BindableASTTransformation {

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `src/main/java/groovy/beans/BindableASTTransformation.java`
#### Snippet
```java
 * lets the {@link VetoableASTTransformation} handle all the changes.
 */
@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)
public class BindableASTTransformation implements ASTTransformation, Opcodes {

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `subprojects/groovy-test/src/main/java/org/apache/groovy/test/transform/NotYetImplementedASTTransformation.java`
#### Snippet
```java
 * @see groovy.test.NotYetImplemented
 */
@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)
public class NotYetImplementedASTTransformation extends AbstractASTTransformation {
    private static final ClassNode DEFAULT_THROW_TYPE = ClassHelper.make(AssertionError.class);
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `subprojects/performance/src/jmh/groovy/org/apache/groovy/bench/GeneratedHashCodeBench.java`
#### Snippet
```java
import java.util.concurrent.TimeUnit;

@Warmup(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Fork(3)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `subprojects/performance/src/jmh/groovy/org/apache/groovy/bench/GeneratedHashCodeBench.java`
#### Snippet
```java

@Warmup(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Fork(3)
@BenchmarkMode(Mode.Throughput)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `subprojects/performance/src/jmh/groovy/org/apache/groovy/bench/FiboBench.java`
#### Snippet
```java
import java.util.concurrent.TimeUnit;

@Warmup(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Fork(3)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `subprojects/performance/src/jmh/groovy/org/apache/groovy/bench/FiboBench.java`
#### Snippet
```java

@Warmup(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Fork(3)
@BenchmarkMode(Mode.AverageTime)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `subprojects/performance/src/jmh/groovy/org/apache/groovy/bench/AckermannBench.java`
#### Snippet
```java
import java.util.concurrent.TimeUnit;

@Warmup(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Fork(3)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `subprojects/performance/src/jmh/groovy/org/apache/groovy/bench/AckermannBench.java`
#### Snippet
```java

@Warmup(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Fork(3)
@BenchmarkMode(Mode.AverageTime)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `subprojects/performance/src/jmh/groovy/org/apache/groovy/bench/AryBench.java`
#### Snippet
```java
import java.util.concurrent.TimeUnit;

@Warmup(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Fork(3)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `subprojects/performance/src/jmh/groovy/org/apache/groovy/bench/AryBench.java`
#### Snippet
```java

@Warmup(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Fork(3)
@BenchmarkMode(Mode.AverageTime)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `subprojects/performance/src/jmh/groovy/org/apache/groovy/plugin/GroovyRunnerRegistryBench.java`
#### Snippet
```java
import java.util.concurrent.TimeUnit;

@Warmup(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Fork(3)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `subprojects/performance/src/jmh/groovy/org/apache/groovy/plugin/GroovyRunnerRegistryBench.java`
#### Snippet
```java

@Warmup(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Fork(3)
@BenchmarkMode(Mode.Throughput)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `subprojects/performance/src/jmh/groovy/org/apache/groovy/bench/dispatch/CallsiteBench.java`
#### Snippet
```java
import java.util.concurrent.TimeUnit;

@Warmup(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Fork(3)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `subprojects/performance/src/jmh/groovy/org/apache/groovy/bench/dispatch/CallsiteBench.java`
#### Snippet
```java

@Warmup(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Fork(3)
@BenchmarkMode(Mode.Throughput)
```

## RuleId[id=ThrowFromFinallyBlock]
### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `subprojects/groovy-ant/src/main/java/groovy/ant/AntBuilder.java`
#### Snippet
```java
                BuildException be = new BuildException(e);
                be.setLocation(task.getLocation());
                throw be;
            }
        }
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
'if' statement can be collapsed with side effect extraction
in `src/main/java/org/apache/groovy/ast/tools/ImmutablePropertyUtils.java`
#### Snippet
```java
            }
        }
        if (!xform.checkPropertyList(cNode, immutables, "knownImmutables", anno, "immutable class", false)) return immutables;

        return immutables;
```

### IfStatementWithIdenticalBranches
Common parts with variables can be extracted from 'if'
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMapBase.java`
#### Snippet
```java
            Object o = tab[index];
            if (o != null) {
                if (o instanceof Entry) {
                    Object[] arr = new Object [2];
                    arr [0] = ee;
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `src/main/java/org/codehaus/groovy/classgen/asm/WriterController.java`
#### Snippet
```java

        this.unaryExpressionHelper = new UnaryExpressionHelper(this);
        if (this.optimizeForInt) {
            this.fastPathBinaryExpHelper = new BinaryExpressionMultiTypeDispatcher(this);
            // TODO: replace with a real fast path unary expression helper when available
```

### IfStatementWithIdenticalBranches
'if' statement can be collapsed with side effect extraction
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
        }

        if (methodC.isAssignableFrom(newMethodC)) {
            return newMethod;
        }
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/TemplateServlet.java`
#### Snippet
```java

        File file = getScriptUriAsFile(request);
        if (file != null) {
            name = file.getName();
            if (!file.exists()) {
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
                    if (c == '%') {
                        c = reader.read();
                        if (c == '=') {
                            parseExpression(reader, writingString, templateExpressions);
                            writingString = true;
```

### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `subprojects/groovy-templates/src/main/groovy/groovy/text/StreamingTemplateEngine.java`
#### Snippet
```java
                            c = read(source, sourcePosition);
                            clear(lookAhead);
                            if (c == '=') {
                                finishStringSection(sections, currentSection, target, lastSourcePosition, targetPosition);
                                parseExpression(source, target, sourcePosition, targetPosition);
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/java/org/codehaus/groovy/runtime/StreamGroovyMethods.java`
#### Snippet
```java
     */
    public static DoubleStream stream(final OptionalDouble self) {
        if (!self.isPresent()) {
            return DoubleStream.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/java/org/codehaus/groovy/runtime/StreamGroovyMethods.java`
#### Snippet
```java
     */
    public static LongStream stream(final OptionalLong self) {
        if (!self.isPresent()) {
            return LongStream.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/java/org/codehaus/groovy/runtime/StreamGroovyMethods.java`
#### Snippet
```java
     */
    public static IntStream stream(final OptionalInt self) {
        if (!self.isPresent()) {
            return IntStream.empty();
        }
```

### SimplifyOptionalCallChains
Optional chain can be simplified
in `src/main/java/org/codehaus/groovy/runtime/StreamGroovyMethods.java`
#### Snippet
```java
     */
    public static <T> Stream<T> stream(final Optional<T> self) {
        return self.map(Stream::of).orElseGet(Stream::empty);
    }

```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/java/org/codehaus/groovy/classgen/asm/sc/StaticTypesLambdaWriter.java`
#### Snippet
```java
        Optional<ConstructorNode> generatedConstructor = lambdaClass.getDeclaredConstructors().stream()
                .filter(ctor -> Boolean.TRUE.equals(ctor.getNodeMetaData(IS_GENERATED_CONSTRUCTOR))).findFirst();
        if (!generatedConstructor.isPresent()) {
            throw new GroovyBugError("Failed to find the generated constructor");
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/java/org/codehaus/groovy/classgen/asm/sc/StaticTypesCallSiteWriter.java`
#### Snippet
```java
        // replace "map.foo" with "map.get('foo')" -- if no public field "foo" is declared
        if (!isStaticProperty && isOrImplements(receiverType, MAP_TYPE)
                && !java.util.Optional.ofNullable(getField(receiverType, propertyName)).filter(FieldNode::isPublic).isPresent()) {
            writeMapDotProperty(receiver, propertyName, safe);
            return;
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T> Optional<T> mapToObj(final OptionalLong self, final LongFunction<? extends T> mapper) {
        if (!self.isPresent()) {
            return Optional.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T> Optional<T> mapToObj(final OptionalInt self, final IntFunction<? extends T> mapper) {
        if (!self.isPresent()) {
            return Optional.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static OptionalLong filter(final OptionalLong self, final LongPredicate test) {
        if (!self.isPresent() || !test.test(self.getAsLong())) {
            return OptionalLong.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static OptionalDouble filter(final OptionalDouble self, final DoublePredicate test) {
        if (!self.isPresent() || !test.test(self.getAsDouble())) {
            return OptionalDouble.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static OptionalInt filter(final OptionalInt self, final IntPredicate test) {
        if (!self.isPresent() || !test.test(self.getAsInt())) {
            return OptionalInt.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T> Optional<T> mapToObj(final OptionalDouble self, final DoubleFunction<? extends T> mapper) {
        if (!self.isPresent()) {
            return Optional.empty();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `src/main/java/org/codehaus/groovy/vmplugin/v9/Java9.java`
#### Snippet
```java
            CachedMethod cachedMethod = (CachedMethod) metaMethod;
            Optional<CachedMethod> transformedMethod = Optional.ofNullable(cachedMethod.getTransformedMethod());
            if (!transformedMethod.isPresent()
                    // if caller can access the method legally, there is no need to transform the cached method
                    && !checkAccessible(caller, declaringClass.getTheClass(), metaMethod.getModifiers(), false)) {
```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/groovy/lang/ListWithDefault.java`
#### Snippet
```java
    @Override
    public boolean containsAll(Collection<?> objects) {
        return delegate.containsAll(objects);
    }

```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
    @Override
    public boolean containsAll(Collection c) {
        return delegate.containsAll(c);
    }

```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `subprojects/groovy-swing/src/main/groovy/groovy/swing/impl/ListWrapperListModel.java`
#### Snippet
```java

    public boolean containsAll(Collection<?> objects) {
        return delegate.containsAll(objects);
    }

```

## RuleId[id=InfiniteLoopStatement]
### InfiniteLoopStatement
`while` statement cannot complete without throwing an exception
in `src/main/java/groovy/ui/GroovySocketServer.java`
#### Snippet
```java
    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(url.getPort())) {
            while (true) {
                // Create one script per socket connection.
                // This is purposefully not caching the Script
```

## RuleId[id=JUnitMalformedDeclaration]
### JUnitMalformedDeclaration
Method `testClassesHaveSuperModiferSet` should be public, non-static, have no parameters and of type void
in `src/test/groovy/ClassTest.groovy`
#### Snippet
```java
    }

    def testClassesHaveSuperModiferSet() {
        assert java.lang.reflect.Modifier.isSynchronized(this.class.modifiers)
    }
```

### JUnitMalformedDeclaration
Method `testInEDT` should be public, non-static, have no parameters and of type void
in `subprojects/groovy-swing/src/testFixtures/groovy/groovy/swing/GroovySwingTestCase.groovy`
#### Snippet
```java
abstract class GroovySwingTestCase extends GroovyTestCase {

    static void testInEDT(Closure test) {
        Throwable exception = null
        if (HeadlessTestSupport.headless) {
```

## RuleId[id=ConditionalExpressionWithIdenticalBranches]
### ConditionalExpressionWithIdenticalBranches
Conditional expression `decodeNull() == null ? ValueContainer.NULL : ValueContainer.NULL` with identical branches
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonFastParser.java`
#### Snippet
```java

            case 'n':
                return decodeNull() == null ? ValueContainer.NULL : ValueContainer.NULL;

            case '[':
```

### ConditionalExpressionWithIdenticalBranches
Conditional expression `decodeNull() == null ? ValueContainer.NULL : ValueContainer.NULL` with identical branches
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserLax.java`
#### Snippet
```java
                case 'n':
                    if (isNull()) {
                        return decodeNull() == null ? ValueContainer.NULL : ValueContainer.NULL;
                    } else {
                        value = decodeStringLax();
```

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'isPrimitiveType()' call
in `src/main/java/org/codehaus/groovy/tools/javac/JavaStubGenerator.java`
#### Snippet
```java
            out.print(")");
        }
        if (type != null && isPrimitiveType(type)) {
            if (isPrimitiveBoolean(type)) {
                out.print("false");
```

### PointlessNullCheck
Unnecessary 'null' check before 'returningBlock()' call
in `src/main/java/org/codehaus/groovy/classgen/FinalVariableAnalyzer.java`
#### Snippet
```java
        catchStatement.visit(this);
        finallyStatement.visit(this);
        if (code == null || !returningBlock(code)) {
            afterTryCatchStates.add(new HashMap<>(getState()));
        }
```

### PointlessNullCheck
Unnecessary 'null' check before 'isPrimitiveType()' call
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
     */
    protected static ClassNode wrapTypeIfNecessary(final ClassNode type) {
        return (type != null && isPrimitiveType(type) ? getWrapper(type) : type);
    }

```

### PointlessNullCheck
Unnecessary 'null' check before 'isPrimitiveType()' call
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
            if (isDynamicTyped(cn)) return;
        }
        if (cn != null && isPrimitiveType(cn)) {
            if (exp instanceof VariableExpression && ((VariableExpression) exp).isClosureSharedVariable()) {
                cn = getWrapper(cn);
```

### PointlessNullCheck
Unnecessary 'null' check before 'isInstance()' call
in `subprojects/groovy-test/src/main/java/groovy/test/GroovyAssert.java`
#### Snippet
```java
        if (orig == null) {
            fail("Closure " + code + " should have failed with an exception having a nested cause of type " + expectedCause.getName());
        } else if (cause == null || !expectedCause.isInstance(cause)) {
            fail("Closure " + code + " should have failed with an exception having a nested cause of type " + expectedCause.getName() + ", instead found these Exceptions:\n" + buildExceptionList(orig));
        }
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `contents`, unclear if a varargs or non-varargs call is desired
in `src/main/java/groovy/lang/Tuple.java`
#### Snippet
```java
    @Override
    public int hashCode() {
        return Objects.hash(contents);
    }

```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `src/main/java/org/codehaus/groovy/classgen/asm/sc/StaticTypesMethodReferenceExpressionWriter.java`
#### Snippet
```java
            }
            return score;
        }).thenComparing(StaticTypesMethodReferenceExpressionWriter::isExtensionMethod)).get();
    }

```

### OptionalGetWithoutIsPresent
`OptionalDouble.getAsDouble()` without 'isPresent()' check
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static double get(final OptionalDouble self) {
        return self.getAsDouble();
    }

```

### OptionalGetWithoutIsPresent
`OptionalInt.getAsInt()` without 'isPresent()' check
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static int get(final OptionalInt self) {
        return self.getAsInt();
    }

```

### OptionalGetWithoutIsPresent
`OptionalLong.getAsLong()` without 'isPresent()' check
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static long get(final OptionalLong self) {
        return self.getAsLong();
    }

```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `pojo` is always `true`
in `src/main/java/org/apache/groovy/ast/tools/ConstructorNodeUtils.java`
#### Snippet
```java

        Expression sb = localVarX("sb");
        Expression toString = pojo ? toStringX(sb) : callX(INVOKER_TYPE, "toString", sb);
        Statement errorBlock = block(
                declS(sb, ctorX(STRINGBUILDER_TYPE)),
```

### ConstantValue
Condition `trySpread && foundSpread` is always `false`
in `src/main/java/org/apache/groovy/ast/tools/ClassNodeUtils.java`
#### Snippet
```java
                    if (count >= parameters.length - 1) return true;
                    // fuzzy match any spread to a varargs
                    if (trySpread && foundSpread) return true;
                }

```

### ConstantValue
Condition `foundSpread` is always `false` when reached
in `src/main/java/org/apache/groovy/ast/tools/ClassNodeUtils.java`
#### Snippet
```java
                    if (count >= parameters.length - 1) return true;
                    // fuzzy match any spread to a varargs
                    if (trySpread && foundSpread) return true;
                }

```

### ConstantValue
Condition `field != null` is always `true`
in `src/main/java/org/apache/groovy/ast/tools/ExpressionUtils.java`
#### Snippet
```java
                    try {
                        Field field = type.redirect().getTypeClass().getField(pe.getPropertyAsString());
                        if (field != null && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                            ConstantExpression ce = new ConstantExpression(field.get(null), true);
                            configure(exp, ce);
```

### ConstantValue
Value `recurse` is always 'true'
in `src/main/java/org/apache/groovy/ast/tools/ExpressionUtils.java`
#### Snippet
```java
        if (targetType == null) return false;
        if (type.equals(targetType)) return true;
        return (targetType.isArray() && recurse ? isTypeOrArrayOfType(targetType.getComponentType(), type, recurse) : type.equals(targetType.getComponentType()));
    }

```

### ConstantValue
Value `recurse` is always 'true'
in `src/main/java/org/apache/groovy/ast/tools/ExpressionUtils.java`
#### Snippet
```java
        if (targetType == null) return false;
        if (targetType.isDerivedFrom(ClassHelper.Number_TYPE)) return true;
        return (targetType.isArray() && recurse ? isNumberOrArrayOfNumber(targetType.getComponentType(), recurse) : targetType.isArray() && targetType.getComponentType().isDerivedFrom(ClassHelper.Number_TYPE));
    }

```

### ConstantValue
Condition `node instanceof GroovyParser.ClassBodyContext` is always `true`
in `src/main/java/org/apache/groovy/parser/antlr4/GroovydocManager.java`
#### Snippet
```java
        }

        if (node instanceof GroovyParser.ClassBodyContext) {
            return null;
        }
```

### ConstantValue
Value `variableDeclaration` is always 'null'
in `src/main/java/org/apache/groovy/parser/antlr4/TryWithResourcesASTTransformation.java`
#### Snippet
```java
    private Statement makeVariableDeclarationFinal(final ExpressionStatement variableDeclaration) {
        if (!asBoolean(variableDeclaration)) {
            return variableDeclaration;
        }

```

### ConstantValue
Value `includeSuperProperties` is always 'true'
in `src/main/java/org/codehaus/groovy/ast/tools/BeanUtils.java`
#### Snippet
```java
        List<PropertyNode> result = new ArrayList<PropertyNode>();
        if (superFirst && includeSuperProperties) {
            result.addAll(getAllProperties(origType, type.getSuperClass(), names, includeSuperProperties, includeStatic, includePseudoGetters, includePseudoSetters, superFirst));
        }
        addExplicitProperties(type, result, names, includeStatic);
```

### ConstantValue
Value `superFirst` is always 'true'
in `src/main/java/org/codehaus/groovy/ast/tools/BeanUtils.java`
#### Snippet
```java
        List<PropertyNode> result = new ArrayList<PropertyNode>();
        if (superFirst && includeSuperProperties) {
            result.addAll(getAllProperties(origType, type.getSuperClass(), names, includeSuperProperties, includeStatic, includePseudoGetters, includePseudoSetters, superFirst));
        }
        addExplicitProperties(type, result, names, includeStatic);
```

### ConstantValue
Value `includeSuperProperties` is always 'true'
in `src/main/java/org/codehaus/groovy/ast/tools/BeanUtils.java`
#### Snippet
```java
        addPseudoProperties(origType, type, result, names, includeStatic, includePseudoGetters, includePseudoSetters, includeSuperProperties);
        if (!superFirst && includeSuperProperties) {
            result.addAll(getAllProperties(origType, type.getSuperClass(), names, includeSuperProperties, includeStatic, includePseudoGetters, includePseudoSetters, superFirst));
        }
        return result;
```

### ConstantValue
Value `superFirst` is always 'false'
in `src/main/java/org/codehaus/groovy/ast/tools/BeanUtils.java`
#### Snippet
```java
        addPseudoProperties(origType, type, result, names, includeStatic, includePseudoGetters, includePseudoSetters, includeSuperProperties);
        if (!superFirst && includeSuperProperties) {
            result.addAll(getAllProperties(origType, type.getSuperClass(), names, includeSuperProperties, includeStatic, includePseudoGetters, includePseudoSetters, superFirst));
        }
        return result;
```

### ConstantValue
Condition `isPrimitiveB` is always `true` when reached
in `src/main/java/org/codehaus/groovy/ast/tools/WideningCategories.java`
#### Snippet
```java
            return lowestUpperBound(a, getWrapper(b), null, null);
        }
        if (isPrimitiveA && isPrimitiveB) {
            Integer pa = NUMBER_TYPES_PRECEDENCE.get(a);
            Integer pb = NUMBER_TYPES_PRECEDENCE.get(b);
```

### ConstantValue
Condition `gtb != null` is always `true` when reached
in `src/main/java/org/codehaus/groovy/ast/tools/WideningCategories.java`
#### Snippet
```java
        if (gta == null && gtb != null) return false;
        if (gtb == null && gta != null) return false;
        if (gta != null && gtb != null) {
            if (gta.length != gtb.length) return false;
            for (int i = 0, n = gta.length; i < n; i += 1) {
```

### ConstantValue
Condition `c * ssize < 512` is always `false`
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMapBase.java`
#### Snippet
```java

        int c = 512 / ssize;
        if (c * ssize < 512)
            ++c;
        int cap = 1;
```

### ConstantValue
Condition `propertyIndexEnd == -1` is always `true`
in `src/main/java/org/codehaus/groovy/tools/LoaderConfiguration.java`
#### Snippet
```java
        if (propertyIndexStart == -1 || propertyIndexStart >= str.length()) {
            result.append(str, propertyIndexEnd, str.length());
        } else if (propertyIndexEnd == -1) {
            result.append(str, propertyIndexStart, str.length());
        }
```

### ConstantValue
Condition `propertyValue.length() > 0` is always `true`
in `src/main/java/org/codehaus/groovy/tools/LoaderConfiguration.java`
#### Snippet
```java
        if (index < str.length() && str.charAt(index) == '/' &&
                propertyValue.endsWith("/") &&
                propertyValue.length() > 0) {
            propertyValue = propertyValue.substring(0, propertyValue.length() - 1);
        }
```

### ConstantValue
Condition `error != null` is always `false`
in `src/main/java/org/codehaus/groovy/tools/shell/util/MessageSource.java`
#### Snippet
```java
                //

                if (error != null) {
                    error = e;
                }
```

### ConstantValue
Condition `error != null` is always `false`
in `src/main/java/org/codehaus/groovy/tools/shell/util/MessageSource.java`
#### Snippet
```java
        }

        assert error != null;

        throw error;
```

### ConstantValue
Value `filenames` is always 'null'
in `src/main/java/org/codehaus/groovy/tools/FileSystemCompiler.java`
#### Snippet
```java
        }

        fileNameErrors = fileNameErrors && !validateFiles(filenames);

        if (!fileNameErrors) {
```

### ConstantValue
Value `e` is always 'null'
in `src/main/java/org/apache/groovy/parser/antlr4/AstBuilder.java`
#### Snippet
```java
                        mapEntryExpressionList.add(mapEntryExpression);
                    } else {
                        expressionList.add(e);
                    }
                });
```

### ConstantValue
Condition `isVariableAccess` is always `true`
in `src/main/java/org/apache/groovy/parser/antlr4/AstBuilder.java`
#### Snippet
```java
            if (isVariableDeclaration) {
                assignmentExpression = (BinaryExpression) expression;
            } else if (isVariableAccess) {
                assignmentExpression = tryWithResourcesASTTransformation.transformResourceAccess(expression);
            } else {
```

### ConstantValue
Condition `phase <= Phases.ALL` is always `true` when reached
in `src/main/java/org/codehaus/groovy/control/CompilationUnit.java`
#### Snippet
```java
        throughPhase = Math.min(throughPhase, Phases.ALL);

        while (throughPhase >= phase && phase <= Phases.ALL) {
            if (phase == Phases.CONVERSION) {
                (sources.size() > 1 && Boolean.TRUE.equals(configuration.getOptimizationOptions().get(CompilerConfiguration.PARALLEL_PARSE))
```

### ConstantValue
Condition `e instanceof SyntaxException` is always `false`
in `src/main/java/org/codehaus/groovy/control/CompilationUnit.java`
#### Snippet
```java
                        }
                        if (context != null) {
                            if (e instanceof SyntaxException) {
                                unit.getErrorCollector().addError((SyntaxException) e, context);
                            } else if (e.getCause() instanceof SyntaxException) {
```

### ConstantValue
Condition is always false
in `src/main/java/org/codehaus/groovy/runtime/StackTraceUtils.java`
#### Snippet
```java
            STACK_LOG = Logger.getLogger(STACK_LOG_NAME);
            STACK_LOG.setUseParentHandlers(false);
        } while (false);
    }

```

### ConstantValue
Condition `constructor.getDeclaringClass().getPackage() != null` is always `true` when reached
in `src/main/java/org/codehaus/groovy/runtime/MetaClassHelper.java`
#### Snippet
```java
            return Boolean.TRUE;
        }
        if (at.getPackage() == null && constructor.getDeclaringClass().getPackage() != null) {
            return Boolean.FALSE;
        }
```

### ConstantValue
Condition `at.getPackage() != null` is always `true`
in `src/main/java/org/codehaus/groovy/runtime/MetaClassHelper.java`
#### Snippet
```java
            return Boolean.FALSE;
        }
        if (at.getPackage() != null && constructor.getDeclaringClass().getPackage() == null) {
            return Boolean.FALSE;
        }
```

### ConstantValue
Condition `!flag` is always `true`
in `src/main/java/org/codehaus/groovy/runtime/MetaClassHelper.java`
#### Snippet
```java
                boolean flag = false;
                Class clazz = at;
                while (!flag && clazz != null) {
                    if (clazz.equals(constructor.getDeclaringClass())) {
                        flag = true;
```

### ConstantValue
Value `append` is always 'true'
in `src/main/java/org/codehaus/groovy/runtime/ResourceGroovyMethods.java`
#### Snippet
```java
        boolean shouldWriteBom = writeBom && !file.exists();
        if (append) {
            FileOutputStream stream = new FileOutputStream(file, append);
            if (shouldWriteBom) {
                writeUTF16BomIfRequired(stream, charset);
```

### ConstantValue
Condition `objectDelegate` is always `true`
in `src/main/java/org/codehaus/groovy/runtime/ProxyGeneratorAdapter.java`
#### Snippet
```java
                        || ((objectDelegate || closureDelegate) && Arrays.stream(superClass.getMethods()).filter(m -> m.getName().equals(name)).mapToInt(Method::getModifiers).noneMatch(Modifier::isAbstract)))) {

                if (closureDelegate || wildcardDelegate || !(objectDelegate && generateDelegateField)) {
                    delegatedClosures.put(name, Boolean.TRUE);
                    return makeDelegateToClosureCall(name, desc, signature, exceptions, access & ~ACC_ABSTRACT);
```

### ConstantValue
Value `self` is always 'null'
in `src/main/java/org/codehaus/groovy/runtime/StringGroovyMethods.java`
#### Snippet
```java
     */
    public static String collectReplacements(final String self, @ClosureParams(value=FromString.class, conflictResolutionStrategy=PickFirstResolver.class, options={"String", "Character"}) final Closure<String> transform) {
        if (self == null) return self;

        StringBuilder sb = null; // lazy create for edge-case efficiency
```

### ConstantValue
Condition `index < 0` is always `true`
in `src/main/java/org/codehaus/groovy/runtime/StringGroovyMethods.java`
#### Snippet
```java
                self.find();
            }
        } else if (index < 0) {
            self.reset();
            index += getCount(self);
```

### ConstantValue
Value `self` is always 'null'
in `src/main/java/org/codehaus/groovy/runtime/StringGroovyMethods.java`
#### Snippet
```java
     */
    public static String collectReplacements(final String self, final List<Function<Character, Optional<String>>> transforms) {
        if (self == null) return self;

        StringBuilder sb = null; // lazy create for edge-case efficiency
```

### ConstantValue
Value `jointCompilationOptions` is always 'null'
in `src/main/java/org/codehaus/groovy/control/CompilerConfiguration.java`
#### Snippet
```java

        Map<String, Object> jointCompilationOptions = configuration.getJointCompilationOptions();
        setJointCompilationOptions(null != jointCompilationOptions ? new HashMap<>(jointCompilationOptions) : jointCompilationOptions);

        // TODO GROOVY-9585: add line below once gradle build issues fixed
```

### ConstantValue
Condition `method != null` is always `true`
in `src/main/java/org/codehaus/groovy/runtime/callsite/AbstractCallSite.java`
#### Snippet
```java
        try {
            final Method method = aClass.getMethod("getProperty", String.class);
            if (method != null && (method.isSynthetic() || isMarkedInternal(method)) && ((GroovyObject) receiver).getMetaClass() instanceof MetaClassImpl)
                return createPogoMetaClassGetPropertySite((GroovyObject) receiver);
        } catch (NoSuchMethodException e) {
```

### ConstantValue
Value `method` is always 'null'
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ClosureMetaClass.java`
#### Snippet
```java
            }

            return method;
        }
    }
```

### ConstantValue
Condition `isEqual` at the left side of assignment expression is always `true`. Can be simplified
in `src/main/java/org/codehaus/groovy/classgen/ClassCompletionVerifier.java`
#### Snippet
```java
        boolean isEqual = true;
        for (int i = 0; i < p2.length; i++) {
            isEqual &= p1[i].getType().equals(p2[i].getType());
            if (!isEqual) break;
        }
```

### ConstantValue
Condition `lastEscape == -1` is always `false`
in `src/main/java/org/codehaus/groovy/classgen/GeneratorContext.java`
#### Snippet
```java
        }
        if (b == null) return name;
        if (lastEscape == -1) throw new GroovyBugError("unexpected escape char control flow in " + name);
        b.append(name, lastEscape + 1, n);
        return b.toString();
```

### ConstantValue
Condition `statement instanceof ExpressionStatement` is always `true`
in `src/main/java/org/codehaus/groovy/classgen/asm/OptimizingStatementWriter.java`
#### Snippet
```java
            ReturnStatement rs = (ReturnStatement) statement;
            rs.setExpression(assignment);
        } else if (statement instanceof ExpressionStatement) {
            ExpressionStatement es = (ExpressionStatement) statement;
            es.setExpression(assignment);
```

### ConstantValue
Value `ret` is always 'true'
in `src/main/java/org/codehaus/groovy/classgen/asm/ClosureWriter.java`
#### Snippet
```java
    private static boolean classNodeUsesReferences(final ClassNode classNode) {
        boolean ret = classNode.getSuperClass().equals(ClassHelper.CLOSURE_TYPE);
        if (ret) return ret;
        if (classNode instanceof InnerClassNode) {
            InnerClassNode inner = (InnerClassNode) classNode;
```

### ConstantValue
Result of `numberOfArguments * numberOfBaseMethods()` is always '0'
in `src/main/java/org/codehaus/groovy/classgen/asm/MethodCallerMultiAdapter.java`
#### Snippet
```java
            offset += (MAX_ARGS + 1) * numberOfBaseMethods();
        } else {
            offset += numberOfArguments * numberOfBaseMethods();
        }
        methods[offset].call(methodVisitor);
```

### ConstantValue
Result of `i * numberOfBaseMethods` is always '0'
in `src/main/java/org/codehaus/groovy/classgen/asm/MethodCallerMultiAdapter.java`
#### Snippet
```java
            mcma.methods = new MethodCaller[(MAX_ARGS + 2) * numberOfBaseMethods];
            for (int i = 0; i <= MAX_ARGS; i++) {
                final int idx = i * numberOfBaseMethods;
                mcma.methods[idx] = MethodCaller.newStatic(theClass, baseName + i);
                if (skipSpreadSafeAndSafe) continue;
```

### ConstantValue
Condition `numberOfArguments > 0` is always `false`
in `src/main/java/org/codehaus/groovy/classgen/asm/InvocationWriter.java`
#### Snippet
```java
                ae.visit(acg);
            }
        } else if (numberOfArguments > 0) {
            operandsToRemove += numberOfArguments;
            TupleExpression te = (TupleExpression) arguments;
```

### ConstantValue
Value `safe` is always 'false'
in `src/main/java/org/codehaus/groovy/classgen/asm/sc/StaticTypesBinaryExpressionMultiTypeDispatcher.java`
#### Snippet
```java

        if (receiverType.isArray() && !safe && binExpWriter[getOperandType(receiverType.getComponentType())].arraySet(true)) {
            super.assignToArray(enclosing, receiver, subscript, rhsValueLoader, safe);

        } else { // this code path is needed because ACG creates array access expressions
```

### ConstantValue
Condition `mcc == AdaptingMetaClass.class` is always `false`
in `src/main/java/org/codehaus/groovy/vmplugin/v8/Selector.java`
#### Snippet
```java
        Class<?> mcc = mc.getClass();
        boolean valid = mcc == MetaClassImpl.class ||
                mcc == AdaptingMetaClass.class ||
                mcc == ClosureMetaClass.class ||
                (includeEMC && mcc == ExpandoMetaClass.class);
```

### ConstantValue
Condition `cn != null` is always `true`
in `src/main/java/org/codehaus/groovy/transform/AbstractASTTransformation.java`
#### Snippet
```java
            ClassNode cn = expr.getType();
            if (isUndefined(cn)) return null;
            if (cn != null) list.add(cn);
        } else if (expr instanceof VariableExpression) {
            addError("Expecting to find a class value for '" + name + "' but found variable: " + expr.getText() + ". Missing import or unknown class?", anno);
```

### ConstantValue
Value `isFirstScan` is always 'true'
in `src/main/java/org/codehaus/groovy/transform/ASTTransformationVisitor.java`
#### Snippet
```java
                context.getGlobalTransformNames().add(entry.getKey());
            }
            addPhaseOperationsForGlobalTransforms(context.getCompilationUnit(), transformNames, isFirstScan);
        } else {
            // phase operations for this transform class have already been added before, so remove from current scan cycle
```

### ConstantValue
Value `isFirstScan` is always 'false'
in `src/main/java/org/codehaus/groovy/transform/ASTTransformationVisitor.java`
#### Snippet
```java
            // phase operations for this transform class have already been added before, so remove from current scan cycle
            transformNames.entrySet().removeIf(entry -> !context.getGlobalTransformNames().add(entry.getKey()));
            addPhaseOperationsForGlobalTransforms(context.getCompilationUnit(), transformNames, isFirstScan);
        }
    }
```

### ConstantValue
Condition `accessedFields != null` is always `true`
in `src/main/java/org/codehaus/groovy/transform/sc/StaticCompilationVisitor.java`
#### Snippet
```java

        int acc = -1;
        privateFieldAccessors = (accessedFields != null ? new HashMap<>() : null);
        privateFieldMutators = (mutatedFields != null ? new HashMap<>() : null);
        final int modifiers = ACC_PUBLIC | ACC_STATIC | ACC_SYNTHETIC;
```

### ConstantValue
Condition `accessedFields != null` is always `true`
in `src/main/java/org/codehaus/groovy/transform/sc/StaticCompilationVisitor.java`
#### Snippet
```java
        final int modifiers = ACC_PUBLIC | ACC_STATIC | ACC_SYNTHETIC;
        for (FieldNode fieldNode : node.getFields()) {
            boolean generateAccessor = accessedFields != null && accessedFields.contains(fieldNode);
            boolean generateMutator = mutatedFields != null && mutatedFields.contains(fieldNode);
            if (generateAccessor) {
```

### ConstantValue
Condition `privateFieldAccessors != null` is always `true`
in `src/main/java/org/codehaus/groovy/transform/sc/StaticCompilationVisitor.java`
#### Snippet
```java
            }
        }
        if (privateFieldAccessors != null) {
            node.setNodeMetaData(PRIVATE_FIELDS_ACCESSORS, privateFieldAccessors);
        }
```

### ConstantValue
Condition `classNodes == null` is always `false`
in `src/main/java/org/codehaus/groovy/transform/stc/UnionTypeClassNode.java`
#### Snippet
```java
    UnionTypeClassNode(final ClassNode... classNodes) {
        super(makeName(classNodes), 0, ClassHelper.OBJECT_TYPE);
        delegates = classNodes == null ? ClassNode.EMPTY_ARRAY : classNodes;
        isPrimaryNode = false;
    }
```

### ConstantValue
Value `lastArg` is always 'true'
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java`
#### Snippet
```java
            // the last one of the call, so we're in the cast of a vargs call
            // (otherwise, we face a type checker bug)
            return typeCheckMethodArgumentWithGenerics(parameterType.getComponentType(), argumentType, lastArg);

        } else if (parameterType.isUsingGenerics() && argumentType.isUsingGenerics()) {
```

### ConstantValue
Condition `methodName.equals(METHOD_MISSING)` is always `false`
in `src/main/java/groovy/lang/ExpandoMetaClass.java`
#### Snippet
```java
                invokeStaticMethodMethod = metaMethod;
            } else {
                if (methodName.equals(METHOD_MISSING)) {
                    methodName = STATIC_METHOD_MISSING;
                }
```

### ConstantValue
Condition `c != null` is always `true` when reached
in `src/main/java/groovy/util/ObservableSet.java`
#### Snippet
```java
        boolean success = delegate.addAll(c);

        if (success && c != null) {
            List<E> values = new ArrayList<E>();
            for (E element : c) {
```

### ConstantValue
Condition `c != null` is always `true` when reached
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
        boolean success = delegate.addAll(index, c);

        if (success && c != null) {
            List values = new ArrayList();
            for (Object element : c) {
```

### ConstantValue
Condition `success` is always `true`
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
        int oldSize = size();
        boolean success = delegate.add(o);
        if (success) {
            fireAddWithTest(o, oldSize, oldSize);
        }
```

### ConstantValue
Value `success` is always 'true'
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
            fireAddWithTest(o, oldSize, oldSize);
        }
        return success;
    }

```

### ConstantValue
Value `value` is always 'null'
in `src/main/java/groovy/util/ObjectGraphBuilder.java`
#### Snippet
```java
        public Object newInstance(FactoryBuilderSupport builder, Object name, Object value,
                                  Map properties) throws InstantiationException, IllegalAccessException {
            if(value == null) return super.newInstance(builder, name, value, properties);

            Object bean = null;
```

### ConstantValue
Value `isCallToSuper` is always 'false'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
    public MetaMethod getMethodWithCaching(Class sender, String methodName, Object[] arguments, boolean isCallToSuper) {
        if (!isCallToSuper && GroovyCategorySupport.hasCategoryInCurrentThread()) {
            return getMethodWithoutCaching(sender, methodName, MetaClassHelper.convertToTypeArray(arguments), isCallToSuper);
        }
        MetaMethodIndex.Entry e = metaMethodIndex.getMethods(sender, methodName);
```

### ConstantValue
Condition `isStatic` is always `false`
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
        // error due to missing method/field
        //----------------------------------------------------------------------
        if (isStatic || object instanceof Class) {
            return new MetaProperty(name, Object.class) {
                @Override
```

### ConstantValue
Condition `delegate != closure` is always `true`
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
                        if (method != null) {
                            return delegateMetaClass.invokeMethod(delegate, methodName, originalArguments);
                        } else if (delegate != closure && (delegate instanceof GroovyObject)) {
                            return invokeMethodOnGroovyObject(methodName, originalArguments, delegate);
                        }
```

### ConstantValue
Condition `resolveStrategy != Closure.TO_SELF` is always `true` when reached
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
                    }

                    if (method == null && resolveStrategy != Closure.TO_SELF) {
                        // still no methods found, test if delegate or owner are GroovyObjects
                        // and invoke the method on them if so.
```

### ConstantValue
Condition `last == null` is always `true`
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
                                return invokeMethodOnGroovyObject(methodName, originalArguments, delegate);
                            } catch (MissingMethodException mme) {
                                if (last == null) last = mme;
                            }
                        }
```

### ConstantValue
Condition `resolveStrategy != Closure.TO_SELF` is always `true` when reached
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
                    }

                    if (method == null && resolveStrategy != Closure.TO_SELF) {
                        // still no methods found, test if delegate or owner are GroovyObjects
                        // and invoke the method on them if so.
```

### ConstantValue
Condition `last == null` is always `true`
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
                            } catch (MissingMethodException mme) {
                                if (methodName.equals(mme.getMethod())) {
                                    if (last == null) last = mme;
                                } else {
                                    throw mme;
```

### ConstantValue
Condition `last == null` is always `true`
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
                                    MissingMethodException mme = (MissingMethodException) iie.getCause();
                                    if (methodName.equals(mme.getMethod())) {
                                        if (last == null) last = mme;
                                    } else {
                                        throw iie;
```

### ConstantValue
Condition `gts != null` is always `true` when reached
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java

    private static boolean isClosureWithType(final ClassNode type) {
        return CLOSURE_TYPE.equals(type) && Optional.ofNullable(type.getGenericsTypes()).filter(gts -> gts != null && gts.length == 1).isPresent();
    }

```

### ConstantValue
Value `functorsVisited` is always 'false'
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java

            boolean functorsVisited = false; // visit *after* method selection
            visitMethodCallArguments(type, argumentList, functorsVisited, null);

            {
```

### ConstantValue
Value `functorsVisited` is always 'true'
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
                            if (isUsingGenericsOrIsArrayUsingGenerics(returnType)) {
                                functorsVisited = true; // visit functional argument(s) with selected method
                                visitMethodCallArguments(type, argumentList, functorsVisited, targetMethod);
                                ClassNode rt = inferReturnTypeGenerics(type, targetMethod, argumentList);
                                if (rt != null && implementsInterfaceOrIsSubclassOf(rt, returnType)) {
```

### ConstantValue
Condition `null != matchedToken` is always `true` when reached
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/MatchingHighlighter.java`
#### Snippet
```java
        }

        if (null != triggerToken && null != matchedToken) {
            highlightToken(p, triggerToken);
            highlightToken(p, matchedToken);
```

### ConstantValue
Condition `pos > -1` is always `false`
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/FindReplaceUtility.java`
#### Snippet
```java
            }

            if (pos > -1) {
                textComponent.select(pos, pos + find.length());
            } else {
```

### ConstantValue
Value `found` is always 'true'
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/FindReplaceUtility.java`
#### Snippet
```java
            while (!found && (backwards ? pos > end : pos < end)) {
                found = !MATCH_CASE_CHECKBOX.isSelected() && SEGMENT.array[pos] == oppFirst;
                found = found ? found : SEGMENT.array[pos] == first;

                if (found) {
```

### ConstantValue
Condition `set != null` is always `true`
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/StructuredSyntaxDocumentFilter.java`
#### Snippet
```java
            // clean the tree by ensuring multi line styles are reset in area of parsing
            SortedSet<Object> set = mlTextRunSet.subSet(offset, offset + length);
            if (set != null) {
                set.clear();
            }
```

### ConstantValue
Condition `annotationNodes == null` is always `false`
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/ast/visitor/AnnotationProcessorVisitor.java`
#### Snippet
```java
            for (MethodNode interfaceMethodNode : methodNodes) {
                final List<AnnotationNode> annotationNodes = AnnotationUtils.hasMetaAnnotations(interfaceMethodNode, ContractElement.class.getName());
                if (annotationNodes == null || annotationNodes.isEmpty()) continue;

                MethodNode implementingMethodNode = superClass.getMethod(interfaceMethodNode.getName(), interfaceMethodNode.getParameters());
```

### ConstantValue
Condition `annotationProcessor != null` is always `true`
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/ast/visitor/AnnotationProcessorVisitor.java`
#### Snippet
```java
        for (AnnotationNode annotationNode : annotationNodes) {
            final AnnotationProcessor annotationProcessor = createAnnotationProcessor(annotationNode);
            if (annotationProcessor != null && annotationNode.getMember(CLOSURE_ATTRIBUTE_NAME) instanceof ClassExpression) {
                handleMethodAnnotation(methodNode, annotationNode, annotationProcessor);
            }
```

### ConstantValue
Condition `annotationProcessor != null` is always `true`
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/ast/visitor/AnnotationProcessorVisitor.java`
#### Snippet
```java
            final AnnotationProcessor annotationProcessor = createAnnotationProcessor(annotationNode);

            if (annotationProcessor != null && annotationNode.getMember(CLOSURE_ATTRIBUTE_NAME) instanceof ClassExpression) {
                final ClassExpression closureClassExpression = (ClassExpression) annotationNode.getMember(CLOSURE_ATTRIBUTE_NAME);

```

### ConstantValue
Condition `booleanExpressions == null` is always `false`
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/ast/visitor/AnnotationClosureVisitor.java`
#### Snippet
```java

                final List<BooleanExpression> booleanExpressions = ExpressionUtils.getBooleanExpression(closureExpression);
                if (booleanExpressions == null || booleanExpressions.isEmpty()) continue;

                BlockStatement closureBlockStatement = (BlockStatement) closureExpression.getCode();
```

### ConstantValue
Condition `booleanExpressions == null` is always `false`
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/ast/visitor/AnnotationClosureVisitor.java`
#### Snippet
```java

        final List<BooleanExpression> booleanExpressions = ExpressionUtils.getBooleanExpression(closureExpression);
        if (booleanExpressions == null || booleanExpressions.isEmpty()) return;

        BlockStatement closureBlockStatement = (BlockStatement) closureExpression.getCode();
```

### ConstantValue
Value `type` is always 'null'
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/SimpleGroovyClassDoc.java`
#### Snippet
```java
    public static String getDocUrl(String type, boolean full, List<LinkArgument> links, String relativePath, GroovyRootDoc rootDoc, SimpleGroovyClassDoc classDoc) {
        if (type == null)
            return type;
        type = type.trim();
        if (isPrimitiveType(type) || type.length() == 1) return type;
```

### ConstantValue
Condition `interfaces != null` is always `true`
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/SimpleGroovyClassDoc.java`
#### Snippet
```java
        Set<GroovyClassDoc> result = new LinkedHashSet<>();
        Class[] interfaces = d.externalClass().getInterfaces();
        if (interfaces != null) {
            for (Class i : interfaces) {
                ExternalGroovyClassDoc doc = new ExternalGroovyClassDoc(i);
```

### ConstantValue
Condition `valid` at the left side of assignment expression is always `true`. Can be simplified
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/Dates.java`
#### Snippet
```java
        }

        valid &= (charArray[start + 4] == '-') &&
                (charArray[start + 7] == '-') &&
                (charArray[start + 10] == 'T') &&
```

### ConstantValue
Condition `index < array.length` is always `true`
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserCharArray.java`
#### Snippet
```java
        char currentChar = array[index];

        if (index < array.length && currentChar == '"') {
            index++;
        }
```

### ConstantValue
Condition `index < array.length` is always `true`
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonFastParser.java`
#### Snippet
```java
        char currentChar = charArray[index];

        if (index < array.length && currentChar == '"') {
            index++;
        }
```

### ConstantValue
Condition `foundExp` is always `true`
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonFastParser.java`
#### Snippet
```java
                    case PLUS:
                        if (foundSign || !foundExp) { complain("unexpected character " + currentChar); }
                        if (foundExp && array[index - 1] != LETTER_E && array[index - 1] != LETTER_BIG_E) {
                            complain("unexpected character " + currentChar);
                        }
```

### ConstantValue
Condition `index < to` is always `true`
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharBuf.java`
#### Snippet
```java
            char c = chars[index];
            if (c == '\\') {
                if (index < to) {
                    index++;
                    c = chars[index];
```

### ConstantValue
Condition `foundExp` is always `true`
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserLax.java`
#### Snippet
```java
                    case PLUS:
                        if (foundSign || !foundExp) { return decodeStringLax(); }
                        if (foundExp && array[index - 1] != LETTER_E && array[index - 1] != LETTER_BIG_E) {
                            return decodeStringLax();
                        }
```

### ConstantValue
Condition `__index < charArray.length` is always `true`
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserLax.java`
#### Snippet
```java
        __currentChar = charArray[__index];

        if (__index < charArray.length && __currentChar == '"') {
            __index++;
        }
```

### ConstantValue
Condition `__index < charArray.length` is always `true`
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserLax.java`
#### Snippet
```java
        __currentChar = charArray[__index];

        if (__index < charArray.length && __currentChar == '\'') {
            __index++;
        }
```

### ConstantValue
Condition `ok` at the left side of assignment expression is always `true`. Can be simplified
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/ReaderCharacterSource.java`
#### Snippet
```java

            for (; i < match.length; i++, idx++) {
                ok &= (match[i] == _chars[idx]);
                if (!ok) break;
            }
```

### ConstantValue
Condition `possibleTokenType.ordinal() >= OPEN_CURLY.ordinal()` is always `true`
in `subprojects/groovy-json/src/main/java/groovy/json/JsonLexer.java`
#### Snippet
```java
            token.setText("" + firstChar);

            if (possibleTokenType.ordinal() >= OPEN_CURLY.ordinal() && possibleTokenType.ordinal() <= FALSE.ordinal()) {
                return readingConstant(possibleTokenType, token);
            } else if (possibleTokenType == STRING) {
```

### ConstantValue
Condition `template == null` is always `false`
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/TemplateServlet.java`
#### Snippet
```java
            // Last sanity check.
            //
            if (template == null) {
                throw new ServletException("Template is null? Should not happen here!");
            }
```

### ConstantValue
Value `answer` is always 'null'
in `subprojects/groovy-swing/src/main/java/groovy/swing/model/DefaultTableModel.java`
#### Snippet
```java
        String answer = null;
        if (columnIndex < 0 || columnIndex >= columnModel.getColumnCount()) {
            return answer;
        }
        Object value = columnModel.getColumn(columnIndex).getHeaderValue();
```

### ConstantValue
Value `answer` is always 'null'
in `subprojects/groovy-swing/src/main/java/groovy/swing/model/DefaultTableModel.java`
#### Snippet
```java
            return value.toString();
        }
        return answer;
    }

```

### ConstantValue
Value `answer` is always 'null'
in `subprojects/groovy-swing/src/main/java/groovy/swing/model/DefaultTableModel.java`
#### Snippet
```java
        Object answer = null;
        if (rowIndex < 0 || rowIndex >= rows.size()) {
            return answer;
        }
        if (columnIndex < 0 || columnIndex >= columnModel.getColumnCount()) {
```

### ConstantValue
Value `answer` is always 'null'
in `subprojects/groovy-swing/src/main/java/groovy/swing/model/DefaultTableModel.java`
#### Snippet
```java
        }
        if (columnIndex < 0 || columnIndex >= columnModel.getColumnCount()) {
            return answer;
        }
        Object row = getRows().get(rowIndex);
```

### ConstantValue
Value `answer` is always 'null'
in `subprojects/groovy-swing/src/main/java/groovy/swing/model/DefaultTableModel.java`
#### Snippet
```java
        DefaultTableColumn column = (DefaultTableColumn) columnModel.getColumn(columnIndex);
        if (row == null || column == null) {
            return answer;
        }
        return column.getValue(row, rowIndex, columnIndex);
```

### ConstantValue
Condition `added` is always `true`
in `subprojects/groovy-swing/src/main/groovy/groovy/swing/impl/ListWrapperListModel.java`
#### Snippet
```java
        int i = delegate.size();
        boolean added = delegate.add(e);
        if (added) fireIntervalAdded(this, i, i);
        return added;
    }
```

### ConstantValue
Value `added` is always 'true'
in `subprojects/groovy-swing/src/main/groovy/groovy/swing/impl/ListWrapperListModel.java`
#### Snippet
```java
        boolean added = delegate.add(e);
        if (added) fireIntervalAdded(this, i, i);
        return added;
    }

```

### ConstantValue
Value `writingString` is always 'true'
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
                    c = reader.read();
                    if (c == '{') {
                        appendCharacter('{', templateExpressions, writingString);
                        writingString = true;
                        parseGSstring(reader, writingString, templateExpressions);
```

### ConstantValue
Value `writingString` is always 'true'
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
                        appendCharacter('{', templateExpressions, writingString);
                        writingString = true;
                        parseGSstring(reader, writingString, templateExpressions);
                        writingString = true;
                        continue;
```

### ConstantValue
Condition `processResultsSets != NO_RESULT_SETS` is always `true` when reached
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
                hasResultSet = statement.getMoreResults();
            }
            while (hasResultSet && (processResultsSets != NO_RESULT_SETS)) {
                resultSets.add(asList(sql, statement.getResultSet()));
                if (processResultsSets == FIRST_RESULT_SET) {
```

### ConstantValue
Value `isResultSet` is always 'true'
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
                    ResultSet resultSet = statement.getResultSet();
                    List<GroovyRowResult> rowResult = resultSet == null ? null : asList(sql, resultSet);
                    processResults.call(isResultSet, rowResult);
                } else {
                    processResults.call(isResultSet, updateCount);
```

### ConstantValue
Value `isResultSet` is always 'false'
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
                    processResults.call(isResultSet, rowResult);
                } else {
                    processResults.call(isResultSet, updateCount);
                }
                isResultSet = statement.getMoreResults();
```

### ConstantValue
Value `isResultSet` is always 'true'
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
                    ResultSet resultSet = statement.getResultSet();
                    List<GroovyRowResult> rowResult = resultSet == null ? null : asList(sql, resultSet);
                    processResults.call(isResultSet, rowResult);
                } else {
                    processResults.call(isResultSet, updateCount);
```

### ConstantValue
Value `isResultSet` is always 'false'
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
                    processResults.call(isResultSet, rowResult);
                } else {
                    processResults.call(isResultSet, updateCount);
                }
                isResultSet = statement.getMoreResults();
```

## RuleId[id=NonAtomicOperationOnVolatileField]
### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `count`
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java
                            arr [1] = e;
                            tab[index] = arr;
                            count++;
                            return ee;
                        }
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `count`
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java
                            if (e == null) {
                                arr [i] = ee;
                                count++;
                                return ee;
                            }
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `count`
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java
                        System.arraycopy(arr, 0, newArr, 1, arr.length);
                        tab [index] = newArr;
                        count++;
                        return ee;
                    }
```

### NonAtomicOperationOnVolatileField
Non-atomic operation on volatile field `count`
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java
                Entry e = createEntry(key, hash, value);
                tab[index] = e;
                count++; // write-volatile
                return e;
            } finally {
```

## RuleId[id=RedundantOperationOnEmptyContainer]
### RedundantOperationOnEmptyContainer
Collection `Collections.EMPTY_LIST` is always empty
in `src/main/java/org/codehaus/groovy/runtime/NullObject.java`
#### Snippet
```java
     */
    public Iterator iterator() {
        return Collections.EMPTY_LIST.iterator();
    }

```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `src/main/java/org/codehaus/groovy/ast/MethodNode.java`
#### Snippet
```java
        this.hasDefaultValue = false;
        this.parameters = parameters;
        if (parameters != null && parameters.length > 0) {
            for (Parameter para : parameters) {
                if (para.hasInitialExpression()) {
```

### RedundantLengthCheck
Redundant array length check
in `src/main/java/org/codehaus/groovy/ast/tools/WideningCategories.java`
#### Snippet
```java
                if (type.implementsInterface(interfaceNode)) result.add(interfaceNode);
            }
            if (result.isEmpty() && interfaces.length > 0) {
                // none if the direct interfaces match, but we must check "upper" in the hierarchy
                for (ClassNode interfaceNode : interfaces) {
```

### RedundantLengthCheck
Redundant array length check
in `src/main/java/org/codehaus/groovy/classgen/asm/BytecodeHelper.java`
#### Snippet
```java

    private static boolean hasGenerics(Parameter[] param) {
        if (param.length == 0) return false;
        for (Parameter parameter : param) {
            ClassNode type = parameter.getType();
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `src/main/java/org/apache/groovy/internal/util/ReevaluatingReference.java`
#### Snippet
```java
        this.valueSupplier = valueSupplier;
        this.validationSupplier = validationSupplier;
        clazzRef = new WeakReference<Class<T>>(clazz);
        replacePayLoad();
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/java/org/apache/groovy/internal/util/ReevaluatingReference.java`
#### Snippet
```java
        T ref = null;
        try {
            ref = (T) returnRef.invokeExact();
        } catch (Throwable throwable) {
            UncheckedThrow.rethrow(throwable);
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.groovy.internal.metaclass.MetaClassConstant\>' to 'org.apache.groovy.internal.metaclass.MetaClassConstant'
in `src/main/java/org/apache/groovy/metaclass/Realm.java`
#### Snippet
```java

    public <T> MetaClass<T> getMetaClass(final Class<T> theClass) {
        Supplier<MetaClassConstant<T>> valueSupplier = () -> (MetaClassConstant<T>) cv.get(theClass);
        Function<MetaClassConstant<T>, SwitchPoint> validationSupplier = MetaClassConstant::getSwitchPoint;
        ReevaluatingReference<MetaClassConstant<T>> ref = new ReevaluatingReference<>(
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/org/codehaus/groovy/ast/InterfaceHelperClassNode.java`
#### Snippet
```java

    public List<String> getCallSites() {
        return callSites;
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.codehaus.groovy.util.ManagedLinkedList.Element' to 'org.codehaus.groovy.util.ManagedLinkedList.Element'
in `src/main/java/org/codehaus/groovy/util/ManagedLinkedList.java`
#### Snippet
```java
                next.previous = previous;
            }
            if (this == head) head = next;
            next = null;
            if (this == tail) tail = previous;
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.codehaus.groovy.util.ManagedLinkedList.Element' to 'org.codehaus.groovy.util.ManagedLinkedList.Element'
in `src/main/java/org/codehaus/groovy/util/ManagedLinkedList.java`
#### Snippet
```java
            if (this == head) head = next;
            next = null;
            if (this == tail) tail = previous;
            previous = null;
            super.finalizeReference();
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.codehaus.groovy.util.ManagedLinkedList.Element' to 'org.codehaus.groovy.util.ManagedLinkedList.Element'
in `src/main/java/org/codehaus/groovy/util/ManagedLinkedList.java`
#### Snippet
```java
        @Override
        public T next() {
            if (currentHandled) current = current.next;
            currentHandled = true;
            if (current == null) return null;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V'
in `src/main/java/org/codehaus/groovy/util/ListHashMap.java`
#### Snippet
```java
            List<V> list = new ArrayList<V>(size);
            for (int i = 0; i < size; i++) {
                list.add((V) listValues[i]);
            }
            return list;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `src/main/java/org/codehaus/groovy/util/ListHashMap.java`
#### Snippet
```java

    private Map<K,V> makeMap() {
        Map<K,V> m = new HashMap();
        for (int i=0; i<size; i++) {
            m.put((K) listKeys[i], (V) listValues[i]);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'
in `src/main/java/org/codehaus/groovy/util/ListHashMap.java`
#### Snippet
```java
        Map<K,V> m = new HashMap();
        for (int i=0; i<size; i++) {
            m.put((K) listKeys[i], (V) listValues[i]);
        }
        return m;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V'
in `src/main/java/org/codehaus/groovy/util/ListHashMap.java`
#### Snippet
```java
        Map<K,V> m = new HashMap();
        for (int i=0; i<size; i++) {
            m.put((K) listKeys[i], (V) listValues[i]);
        }
        return m;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V'
in `src/main/java/org/codehaus/groovy/util/ListHashMap.java`
#### Snippet
```java
            for (int i=0; i<size; i++) {
                if (listKeys[i].equals(key)) {
                    V old = (V) listValues[i];
                    size--;
                    // If last element is not being removed shift the last element into this slot
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'. Reason: 'm' has raw type, so result of keySet is erased
in `src/main/java/org/codehaus/groovy/util/ListHashMap.java`
#### Snippet
```java
    public Set<K> keySet() {
        Map m = innerMap!=null?innerMap:makeMap();
        return m.keySet();
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V'
in `src/main/java/org/codehaus/groovy/util/ListHashMap.java`
#### Snippet
```java
        for (int i = 0; i < size; ++i) {
            if (key.equals(listKeys[i]))
                return (V) listValues[i];
        }
        return null;
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.codehaus.groovy.util.AbstractConcurrentMap.Entry' to 'org.codehaus.groovy.util.AbstractConcurrentMap.Entry'
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java
            if (o != null) {
                if (o instanceof Entry) {
                    Entry<K,V> e = (Entry) o;
                    if (e.isEqual(key, hash)) {
                        return e.getValue();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.codehaus.groovy.util.AbstractConcurrentMap.Entry'
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java
                    Object[] arr = (Object[]) o;
                    for (Object value : arr) {
                        Entry<K, V> e = (Entry<K, V>) value;
                        if (e != null && e.isEqual(key, hash)) {
                            return e.getValue();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.codehaus.groovy.util.AbstractConcurrentMap.Entry'
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java
                if (o != null) {
                    if (o instanceof Entry) {
                        if (((Entry<K,V>)o).isEqual(key, hash)) {
                          tab[index] = null;
                          count = c;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.codehaus.groovy.util.AbstractConcurrentMap.Entry'
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java
                        Object[] arr = (Object[]) o;
                        for (int i = 0; i < arr.length; i++) {
                            Entry<K,V> e = (Entry<K,V>) arr[i];
                            if (e != null && e.isEqual(key, hash)) {
                                arr [i] = null;
```

### UNCHECKED_WARNING
Unchecked call to 'remove(K, int)' as a member of raw type 'org.codehaus.groovy.util.AbstractConcurrentMap.Segment'
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java
    public void remove(K key) {
        int hash = hash(key);
        segmentFor(hash).remove(key, hash);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.codehaus.groovy.util.AbstractConcurrentMap.Entry' to 'org.codehaus.groovy.util.AbstractConcurrentMap.Entry'. Reason: 'segmentFor(hash)' has raw type, so result of getOrPut is erased
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java
    public Entry<K,V> getOrPut(K key, V value) {
        int hash = hash(key);
        return segmentFor(hash).getOrPut(key, hash, value);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'getOrPut(K, int, V)' as a member of raw type 'org.codehaus.groovy.util.AbstractConcurrentMap.Segment'
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java
    public Entry<K,V> getOrPut(K key, V value) {
        int hash = hash(key);
        return segmentFor(hash).getOrPut(key, hash, value);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.codehaus.groovy.util.AbstractConcurrentMap.Entry' to 'org.codehaus.groovy.util.AbstractConcurrentMap.Entry'
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java
            if (o != null) {
                if (o instanceof Entry) {
                    Entry<K,V> e = (Entry) o;
                    if (e.isEqual(key, hash)) {
                        return e;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.codehaus.groovy.util.AbstractConcurrentMap.Entry'
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java
                    Object[] arr = (Object[]) o;
                    for (Object item : arr) {
                        Entry<K, V> e = (Entry<K, V>) item;
                        if (e != null && e.isEqual(key, hash)) {
                            return e;
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.codehaus.groovy.util.AbstractConcurrentMap.Entry' to 'org.codehaus.groovy.util.AbstractConcurrentMap.Entry'
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java
                }
            }
            return put(key, hash, value);
        }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, int, V)' as a member of raw type 'org.codehaus.groovy.util.AbstractConcurrentMap.Segment'
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java
    public void put(K key, V value) {
        int hash = hash(key);
        segmentFor(hash).put(key, hash, value);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'isEqual(K, int)' as a member of raw type 'org.codehaus.groovy.util.AbstractConcurrentMap.Entry'
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java
                    if (o instanceof Entry) {
                        Entry e = (Entry) o;
                        if (e.isEqual(key, hash)) {
                            e.setValue(value);
                            return e;
```

### UNCHECKED_WARNING
Unchecked call to 'setValue(V)' as a member of raw type 'org.codehaus.groovy.util.AbstractConcurrentMapBase.Entry'
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java
                        Entry e = (Entry) o;
                        if (e.isEqual(key, hash)) {
                            e.setValue(value);
                            return e;
                        }
```

### UNCHECKED_WARNING
Unchecked call to 'isEqual(K, int)' as a member of raw type 'org.codehaus.groovy.util.AbstractConcurrentMap.Entry'
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java
                        for (Object item : arr) {
                            Entry e = (Entry) item;
                            if (e != null && e.isEqual(key, hash)) {
                                e.setValue(value);
                                return e;
```

### UNCHECKED_WARNING
Unchecked call to 'setValue(V)' as a member of raw type 'org.codehaus.groovy.util.AbstractConcurrentMapBase.Entry'
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java
                            Entry e = (Entry) item;
                            if (e != null && e.isEqual(key, hash)) {
                                e.setValue(value);
                                return e;
                            }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V'. Reason: 'segmentFor(hash)' has raw type, so result of get is erased
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java
    public V get(K key) {
        int hash = hash(key);
        return (V) segmentFor(hash).get(key, hash);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'get(K, int)' as a member of raw type 'org.codehaus.groovy.util.AbstractConcurrentMap.Segment'
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java
    public V get(K key) {
        int hash = hash(key);
        return (V) segmentFor(hash).get(key, hash);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.codehaus.groovy.util.ManagedReference' to 'org.codehaus.groovy.util.ManagedReference'
in `src/main/java/org/codehaus/groovy/util/LazyReference.java`
#### Snippet
```java

    public void clear() {
        reference = INIT;
    }

```

### UNCHECKED_WARNING
Unchecked call to 'ManagedReference(ReferenceType, ReferenceManager, T)' as a member of raw type 'org.codehaus.groovy.util.ManagedReference'
in `src/main/java/org/codehaus/groovy/util/LazyReference.java`
#### Snippet
```java
 */
public abstract class LazyReference<T> extends LockableObject {
    private static final ManagedReference INIT = new ManagedReference(ReferenceType.HARD,null,null){};
    private static final ManagedReference NULL_REFERENCE = new ManagedReference(ReferenceType.HARD,null,null){};
    private static final long serialVersionUID = -828564509716680325L;
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.codehaus.groovy.util.ManagedReference' to 'org.codehaus.groovy.util.ManagedReference'
in `src/main/java/org/codehaus/groovy/util/LazyReference.java`
#### Snippet
```java
            T res = initValue();
            if (res == null) {
                reference = NULL_REFERENCE;
            } else {
                reference = new ManagedReference<T>(bundle,res);
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.codehaus.groovy.util.ManagedReference' to 'org.codehaus.groovy.util.ManagedReference'
in `src/main/java/org/codehaus/groovy/util/LazyReference.java`
#### Snippet
```java
    private static final ManagedReference NULL_REFERENCE = new ManagedReference(ReferenceType.HARD,null,null){};
    private static final long serialVersionUID = -828564509716680325L;
    private ManagedReference<T> reference = INIT;
    private final ReferenceBundle bundle;

```

### UNCHECKED_WARNING
Unchecked call to 'ManagedReference(ReferenceType, ReferenceManager, T)' as a member of raw type 'org.codehaus.groovy.util.ManagedReference'
in `src/main/java/org/codehaus/groovy/util/LazyReference.java`
#### Snippet
```java
public abstract class LazyReference<T> extends LockableObject {
    private static final ManagedReference INIT = new ManagedReference(ReferenceType.HARD,null,null){};
    private static final ManagedReference NULL_REFERENCE = new ManagedReference(ReferenceType.HARD,null,null){};
    private static final long serialVersionUID = -828564509716680325L;
    private ManagedReference<T> reference = INIT;
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.codehaus.groovy.util.ReferenceType.SoftRef' to 'org.codehaus.groovy.util.Reference'
in `src/main/java/org/codehaus/groovy/util/ReferenceType.java`
#### Snippet
```java
        @Override
        protected <T,V extends Finalizable> Reference<T,V> createReference(T value, V handler, ReferenceQueue queue) {
            return new SoftRef(value, handler, queue);
        }
    },
```

### UNCHECKED_WARNING
Unchecked call to 'SoftRef(TT, V, ReferenceQueue)' as a member of raw type 'org.codehaus.groovy.util.ReferenceType.SoftRef'
in `src/main/java/org/codehaus/groovy/util/ReferenceType.java`
#### Snippet
```java
        @Override
        protected <T,V extends Finalizable> Reference<T,V> createReference(T value, V handler, ReferenceQueue queue) {
            return new SoftRef(value, handler, queue);
        }
    },
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.codehaus.groovy.util.ReferenceType.HardRef' to 'org.codehaus.groovy.util.Reference'
in `src/main/java/org/codehaus/groovy/util/ReferenceType.java`
#### Snippet
```java
        @Override
        protected <T,V extends Finalizable> Reference<T,V> createReference(T value, V handler, ReferenceQueue queue) {
            return new HardRef(value, handler, queue);
        }
    };
```

### UNCHECKED_WARNING
Unchecked call to 'HardRef(TT, V, ReferenceQueue)' as a member of raw type 'org.codehaus.groovy.util.ReferenceType.HardRef'
in `src/main/java/org/codehaus/groovy/util/ReferenceType.java`
#### Snippet
```java
        @Override
        protected <T,V extends Finalizable> Reference<T,V> createReference(T value, V handler, ReferenceQueue queue) {
            return new HardRef(value, handler, queue);
        }
    };
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.codehaus.groovy.util.ReferenceType.PhantomRef' to 'org.codehaus.groovy.util.Reference'
in `src/main/java/org/codehaus/groovy/util/ReferenceType.java`
#### Snippet
```java
        @Override
        protected <T,V extends Finalizable> Reference<T,V> createReference(T value, V handler, ReferenceQueue queue) {
            return new PhantomRef(value, handler, queue);
        }            
    },
```

### UNCHECKED_WARNING
Unchecked call to 'PhantomRef(TT, V, ReferenceQueue)' as a member of raw type 'org.codehaus.groovy.util.ReferenceType.PhantomRef'
in `src/main/java/org/codehaus/groovy/util/ReferenceType.java`
#### Snippet
```java
        @Override
        protected <T,V extends Finalizable> Reference<T,V> createReference(T value, V handler, ReferenceQueue queue) {
            return new PhantomRef(value, handler, queue);
        }            
    },
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.codehaus.groovy.util.ReferenceType.WeakRef' to 'org.codehaus.groovy.util.Reference'
in `src/main/java/org/codehaus/groovy/util/ReferenceType.java`
#### Snippet
```java
        @Override
        protected <T,V extends Finalizable> Reference<T,V> createReference(T value, V handler, ReferenceQueue queue) {
            return new WeakRef(value, handler, queue);
        }
    },
```

### UNCHECKED_WARNING
Unchecked call to 'WeakRef(TT, V, ReferenceQueue)' as a member of raw type 'org.codehaus.groovy.util.ReferenceType.WeakRef'
in `src/main/java/org/codehaus/groovy/util/ReferenceType.java`
#### Snippet
```java
        @Override
        protected <T,V extends Finalizable> Reference<T,V> createReference(T value, V handler, ReferenceQueue queue) {
            return new WeakRef(value, handler, queue);
        }
    },
```

### UNCHECKED_WARNING
Unchecked cast: 'org.codehaus.groovy.util.ManagedConcurrentMap.Entry' to 'V'
in `src/main/java/org/codehaus/groovy/util/ManagedConcurrentMap.java`
#### Snippet
```java
        @Override
        public V getValue() {
            return (V)this;
        }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Collection'
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMapBase.java`
#### Snippet
```java
                            Entry e = (Entry) o;
                            if (e.isValid())
                                result.add(e);
                        } else {
                            Object[] arr = (Object[]) o;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Collection'
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMapBase.java`
#### Snippet
```java
                                Entry info = (Entry) value;
                                if (info != null && info.isValid())
                                    result.add(info);
                            }
                        }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/tools/StringHelper.java`
#### Snippet
```java
            int last = scanToken(s, first);
            if (first < last) {
                tokens.add(s.substring(first, last));
            }
            first = last;
```

### UNCHECKED_WARNING
Unchecked call to 'toArray(T\[\])' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/tools/StringHelper.java`
#### Snippet
```java
            first = last;
        }
        return (String[])tokens.toArray(EMPTY_STRING_ARRAY);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `src/main/java/org/codehaus/groovy/tools/gse/DependencyTracker.java`
#### Snippet
```java

    public DependencyTracker(SourceUnit source, StringSetMap cache) {
        this(source, cache, new HashMap());
    }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/syntax/Reduction.java`
#### Snippet
```java
        if (index >= count) {
            for (int i = count; i <= index; i++) {
                elements.add(null);
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'set(int, E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/syntax/Reduction.java`
#### Snippet
```java
        // Then set in the element.

        elements.set(index, element);

        return element;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Set'
in `src/main/java/org/codehaus/groovy/control/Janitor.java`
#### Snippet
```java

    public void register(HasCleanup object) {
        pending.add(object);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'set(T)' as a member of raw type 'java.lang.ThreadLocal'
in `src/main/java/org/codehaus/groovy/runtime/RegexSupport.java`
#### Snippet
```java

    public static void setLastMatcher(Matcher matcher) {
        CURRENT_MATCHER.set(matcher);
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Deque\[\]' to 'java.util.Deque\[\]'
in `src/main/java/org/codehaus/groovy/control/CompilationUnit.java`
#### Snippet
```java
    {
        final int n = Phases.ALL + 1;
        phaseOperations = new Deque[n];
        newPhaseOperations = new Deque[n];
        for (int i = 0; i < n; i += 1) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Deque\[\]' to 'java.util.Deque\[\]'
in `src/main/java/org/codehaus/groovy/control/CompilationUnit.java`
#### Snippet
```java
        final int n = Phases.ALL + 1;
        phaseOperations = new Deque[n];
        newPhaseOperations = new Deque[n];
        for (int i = 0; i < n; i += 1) {
            phaseOperations[i] = new LinkedList<>();
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/MethodKey.java`
#### Snippet
```java
        List params = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            params.add(getParameterType(i));
        }
        return params;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/InvokerHelper.java`
#### Snippet
```java
            List newlist = new ArrayList();
            for (Object o : ((ArrayList) value)) {
                newlist.add(bitwiseNegate(o));
            }
            return newlist;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/InvokerHelper.java`
#### Snippet
```java
            List newlist = new ArrayList();
            for (Object o : ((ArrayList) value)) {
                newlist.add(unaryMinus(o));
            }
            return newlist;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/InvokerHelper.java`
#### Snippet
```java
            List answer = new ArrayList();
            while (e.hasMoreElements()) {
                answer.add(e.nextElement());
            }
            return answer;
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/org/codehaus/groovy/runtime/InvokerHelper.java`
#### Snippet
```java
                for (Object e : smap.entrySet()) {
                    Map.Entry entry = (Map.Entry) e;
                    answer.put(entry.getKey(), entry.getValue());
                }
                i += 2;
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/org/codehaus/groovy/runtime/InvokerHelper.java`
#### Snippet
```java
                i += 2;
            } else {
                answer.put(values[i++], values[i++]);
            }
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.Collection'
in `src/main/java/org/codehaus/groovy/runtime/InvokerHelper.java`
#### Snippet
```java
        // GROOVY-8995: Improve the performance of creating list
        // answer.addAll(Arrays.asList(values));
        Collections.addAll(answer, values);

        return answer;
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(E...)' as a member of raw type 'groovy.lang.Tuple'
in `src/main/java/org/codehaus/groovy/runtime/InvokerHelper.java`
#### Snippet
```java

    public static Tuple createTuple(Object[] array) {
        return new Tuple(array);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/InvokerHelper.java`
#### Snippet
```java
            List newlist = new ArrayList();
            for (Object o : ((ArrayList) value)) {
                newlist.add(unaryPlus(o));
            }
            return newlist;
```

### UNCHECKED_WARNING
Unchecked call to 'EmptyRange(T)' as a member of raw type 'groovy.lang.EmptyRange'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
        if (exclusiveLeft && exclusiveRight) {
            if (compareEqual(from, to)) {
                return new EmptyRange((Comparable) from);
            }
            Object tmpFrom;
```

### UNCHECKED_WARNING
Unchecked call to 'EmptyRange(T)' as a member of raw type 'groovy.lang.EmptyRange'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
            boolean sameSign = (fromComp >= 0 && toComp >= 0) || (fromComp < 0 && toComp < 0);
            if (compareEqual(tmpFrom, to) && sameSign) {
                return new EmptyRange((Comparable) from);
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'EmptyRange(T)' as a member of raw type 'groovy.lang.EmptyRange'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
        }
        if ((exclusiveLeft || exclusiveRight) && compareEqual(from, to)) {
            return new EmptyRange((Comparable) from);
        }
        if (from instanceof Integer && to instanceof Integer) {
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(E...)' as a member of raw type 'groovy.lang.Tuple'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java

    public static Tuple createTuple(Object[] array) {
        return new Tuple(array);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
        List answer = new ArrayList();
        for (Iterator it = InvokerHelper.asIterator(receiver); it.hasNext();) {
            answer.add(invokeMethodNSafe(senderClass, it.next(), messageName, messageArguments));
        }
        return answer;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
        List answer = new ArrayList();
        for (Iterator it = InvokerHelper.asIterator(receiver); it.hasNext();) {
            answer.add(invokeMethodNSafe(senderClass, it.next(), messageName, messageArguments));
        }
        return answer;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
        List answer = new ArrayList();
        for (Iterator it = InvokerHelper.asIterator(receiver); it.hasNext();) {
            answer.add(invokeMethodNSafe(senderClass, it.next(), messageName, messageArguments));
        }
        return answer;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
        List answer = new ArrayList();
        for (Iterator it = InvokerHelper.asIterator(receiver); it.hasNext();) {
            answer.add(getFieldOnSuper(senderClass, it.next(), messageName));
        }
        return answer;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
        List answer = new ArrayList();
        for (Iterator it = InvokerHelper.asIterator(receiver); it.hasNext();) {
            answer.add(getPropertySafe(senderClass, it.next(), messageName));
        }
        return answer;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
        List answer = new ArrayList();
        for (Iterator it = InvokerHelper.asIterator(receiver); it.hasNext();) {
            answer.add(getFieldSafe(senderClass, it.next(), messageName));
        }
        return answer;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
        List answer = new ArrayList();
        for (Iterator it = InvokerHelper.asIterator(receiver); it.hasNext();) {
            answer.add(getFieldSafe(senderClass, it.next(), messageName));
        }
        return answer;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
        for (int position : positions) {
            for (; argsPos < position; argsPos++) {
                ret.add(args[argsPos]);
            }
            Object value = spreads[spreadPos];
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
            Object value = spreads[spreadPos];
            if (value == null) {
                ret.add(null);
            } else if (value instanceof List) {
                ret.addAll((List) value);
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
                ret.add(null);
            } else if (value instanceof List) {
                ret.addAll((List) value);
            } else if (value.getClass().isArray()) {
                ret.addAll(DefaultTypeTransformation.primitiveArrayToList(value));
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
                ret.addAll((List) value);
            } else if (value.getClass().isArray()) {
                ret.addAll(DefaultTypeTransformation.primitiveArrayToList(value));
            } else {
                String error = "cannot spread the type " + value.getClass().getName() + " with value " + value;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
        }
        for (; argsPos < args.length; argsPos++) {
            ret.add(args[argsPos]);
        }
        return ret.toArray();
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/ScriptBytecodeAdapter.java`
#### Snippet
```java
        List answer = new ArrayList();
        for (Iterator it = InvokerHelper.asIterator(receiver); it.hasNext();) {
            answer.add(getPropertySafe(senderClass, it.next(), messageName));
        }
        return answer;
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/codehaus/groovy/runtime/GroovyCategorySupport.java`
#### Snippet
```java

            if (thisClass == thatClass) return 0;
            if (thisClass.isAssignableFrom(thatClass)) return 1;
            if (thatClass.isAssignableFrom(thisClass)) return -1;

```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/codehaus/groovy/runtime/GroovyCategorySupport.java`
#### Snippet
```java
            if (thisClass == thatClass) return 0;
            if (thisClass.isAssignableFrom(thatClass)) return 1;
            if (thatClass.isAssignableFrom(thisClass)) return -1;

            return 0;
```

### UNCHECKED_WARNING
Unchecked call to 'SoftReference(T)' as a member of raw type 'java.lang.ref.SoftReference'
in `src/main/java/org/codehaus/groovy/runtime/GroovyCategorySupport.java`
#### Snippet
```java
                if( tcinfo == null ) {
                    tcinfo = new ThreadCategoryInfo();
                    set(new SoftReference(tcinfo));
                }
            }
```

### UNCHECKED_WARNING
Unchecked call to 'SoftReference(T)' as a member of raw type 'java.lang.ref.SoftReference'
in `src/main/java/org/codehaus/groovy/runtime/GroovyCategorySupport.java`
#### Snippet
```java
            else {
                tcinfo = new ThreadCategoryInfo();
                set(new SoftReference(tcinfo));
            }
            return tcinfo;
```

### UNCHECKED_WARNING
Unchecked method 'sort(List)' invocation
in `src/main/java/org/codehaus/groovy/runtime/GroovyCategorySupport.java`
#### Snippet
```java
                        }
                        list.add(mmethod);
                        Collections.sort(list);
                        cachePropertyAccessor(mmethod);
                    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/org/codehaus/groovy/runtime/ProcessGroovyMethods.java`
#### Snippet
```java
        new Thread(() -> {
            try {
                IOGroovyMethods.withStream(new BufferedOutputStream(getOut(self)), closure);
            } catch (IOException e) {
                throw new GroovyRuntimeException("exception while reading process stream", e);
```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/org/codehaus/groovy/runtime/ProcessGroovyMethods.java`
#### Snippet
```java
        new Thread(() -> {
            try {
                IOGroovyMethods.withWriter(new BufferedOutputStream(getOut(self)), closure);
            } catch (IOException e) {
                throw new GroovyRuntimeException("exception while reading process stream", e);
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/codehaus/groovy/runtime/MetaClassHelper.java`
#### Snippet
```java
            } else {
                for (; baseClass != Object.class; baseClass = baseClass.getSuperclass()) {
                    if (baseClass.isAssignableFrom(argClass)) break;
                }
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/org/codehaus/groovy/runtime/ResourceGroovyMethods.java`
#### Snippet
```java
     */
    public static Object withOutputStream(File file, @ClosureParams(value = SimpleType.class, options = "java.io.OutputStream") Closure closure) throws IOException {
        return IOGroovyMethods.withStream(newOutputStream(file), closure);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/org/codehaus/groovy/runtime/ResourceGroovyMethods.java`
#### Snippet
```java
     */
    public static Object withInputStream(File file, @ClosureParams(value = SimpleType.class, options = "java.io.InputStream") Closure closure) throws IOException {
        return IOGroovyMethods.withStream(newInputStream(file), closure);
    }

```

### UNCHECKED_WARNING
Unchecked method 'sort(List)' invocation
in `src/main/java/org/codehaus/groovy/runtime/MethodRankHelper.java`
#### Snippet
```java
            rm.add(new RankableMethod(name, ta, m));
        }
        Collections.sort(rm);

        List<MetaMethod> l =  new ArrayList<MetaMethod>(rm.size());
```

### UNCHECKED_WARNING
Unchecked method 'sort(List)' invocation
in `src/main/java/org/codehaus/groovy/runtime/MethodRankHelper.java`
#### Snippet
```java

        for(MetaProperty mp : fi) rf.add(new RankableField(fieldName, mp));
        Collections.sort(rf);

        int i = 0;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T\[\]'
in `src/main/java/org/codehaus/groovy/runtime/StreamGroovyMethods.java`
#### Snippet
```java
    public static <T> T[] toArray(final Stream<? extends T> self, final Class<T> type) {
        if (type == null) throw new IllegalArgumentException("type cannot be null");
        return self.toArray(length -> (T[]) Array.newInstance(type, length));
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'groovy.lang.Closure'
in `src/main/java/org/codehaus/groovy/runtime/ComposedClosure.java`
#### Snippet
```java
        super(first.clone());
        this.first = (Closure) getOwner();
        this.second = (Closure<V>) second.clone();
        maximumNumberOfParameters = first.getMaximumNumberOfParameters();
    }
```

### UNCHECKED_WARNING
Unchecked call to 'getConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/codehaus/groovy/runtime/ProxyGeneratorAdapter.java`
#### Snippet
```java
        Constructor<?> constructor;
        try {
            constructor = cachedClass.getConstructor(args);
        } catch (NoSuchMethodException e) {
            constructor = null;
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.codehaus.groovy.runtime.IteratorClosureAdapter' to 'groovy.lang.Closure'
in `src/main/java/org/codehaus/groovy/runtime/IOGroovyMethods.java`
#### Snippet
```java
    public static List<String> readLines(Reader reader) throws IOException {
        IteratorClosureAdapter<String> closure = new IteratorClosureAdapter<String>(reader);
        eachLine(reader, closure);
        return closure.asList();
    }
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/StringGroovyMethods.java`
#### Snippet
```java
        for (Object value : indices) {
            if (value instanceof Range) {
                result.addAll(getAt(self, (Range) value));
            } else {
                int idx = DefaultTypeTransformation.intUnbox(value);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/StringGroovyMethods.java`
#### Snippet
```java
            } else {
                int idx = DefaultTypeTransformation.intUnbox(value);
                result.add(getAt(self, idx));
            }
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.ref.ReferenceQueue' to 'java.lang.ref.ReferenceQueue'
in `src/main/java/org/codehaus/groovy/runtime/memoize/Memoize.java`
#### Snippet
```java
                Object r = closure.call(args);

                return null != r ? new SoftReference<Object>(r, queue) : new SoftReference<Object>(MEMOIZE_NULL);
            });

```

### UNCHECKED_WARNING
Unchecked call to 'touch(K, V)' as a member of raw type 'org.codehaus.groovy.runtime.memoize.ProtectionStorage'
in `src/main/java/org/codehaus/groovy/runtime/memoize/Memoize.java`
#### Snippet
```java

            Object result = reference.get();
            lruProtectionStorage.touch(key, result);

            return result == MEMOIZE_NULL ? null : (V) result;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V'
in `src/main/java/org/codehaus/groovy/runtime/memoize/Memoize.java`
#### Snippet
```java
            lruProtectionStorage.touch(key, result);

            return result == MEMOIZE_NULL ? null : (V) result;
        }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V'
in `src/main/java/org/codehaus/groovy/runtime/memoize/Memoize.java`
#### Snippet
```java
            });

            return result == MEMOIZE_NULL ? null : (V) result;
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.codehaus.groovy.runtime.memoize.MemoizeCache' to 'org.codehaus.groovy.runtime.memoize.MemoizeCache'
in `src/main/java/org/codehaus/groovy/runtime/memoize/Memoize.java`
#### Snippet
```java
        MemoizeFunction(final MemoizeCache<Object, ?> cache, Closure<V> closure) {
            super(closure.getOwner());
            this.cache = coerce(cache);
            this.closure = closure;
            parameterTypes = closure.getParameterTypes();
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'org.apache.groovy.util.concurrent.ConcurrentReferenceHashMap'
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ThreadManagedMetaBeanProperty.java`
#### Snippet
```java
        @Override
        public Object invoke(Object object, Object[] arguments) {
            instance2Prop.put(object, arguments[0]);
            return null;
        }
```

### UNCHECKED_WARNING
Unchecked call to 'getOrPut(K, V)' as a member of raw type 'org.apache.groovy.util.concurrent.ManagedIdentityConcurrentMap'
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ThreadManagedMetaBeanProperty.java`
#### Snippet
```java
        @Override
        public Object invoke(Object object, Object[] arguments) {
            return instance2Prop.getOrPut(object, getInitialValue());
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'WeakReference(T)' as a member of raw type 'java.lang.ref.WeakReference'
in `src/main/java/org/codehaus/groovy/runtime/metaclass/MixedInMetaClass.java`
#### Snippet
```java
    public MixedInMetaClass(Object instance, Object owner) {
        super(GroovySystem.getMetaClassRegistry().getMetaClass(instance.getClass()));
        this.owner = new WeakReference(owner);
        MetaClassHelper.doSetMetaClass(instance, this);
    }
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ReflectorLoader.java`
#### Snippet
```java
        inDefine = true;
        Class c = defineClass(name, bytecode, 0, bytecode.length, domain);
        loadedClasses.put(name,c); 
        resolveClass(c);
        inDefine = false;
```

### UNCHECKED_WARNING
Unchecked method 'valueOf(Class, String)' invocation
in `src/main/java/org/codehaus/groovy/runtime/typehandling/ShortTypeHandling.java`
#### Snippet
```java
        if (type.isInstance(object)) return (Enum) object;
        if (object instanceof String || object instanceof GString) {
            return Enum.valueOf(type, object.toString());
        }
        throw new GroovyCastException(object, type);
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'java.util.List', required 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ClosureMetaClass.java`
#### Snippet
```java

    @Override
    public List respondsTo(final Object obj, final String name) {
        loadMetaInfo();
        return super.respondsTo(obj, name);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.Collection'
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ClosureMetaClass.java`
#### Snippet
```java
    public List<MetaMethod> getMethods() {
        List<MetaMethod> answer = CLOSURE_METACLASS.getMetaMethods();
        answer.addAll(closureMethods.toList());
        return answer;
    }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ClosureMetaClass.java`
#### Snippet
```java
                    // making this false helps find matches
                    if (((ParameterTypes) method).isValidMethod(arguments)) {
                        matchingMethods.add(method);
                    }
                }
```

### UNCHECKED_WARNING
Unchecked overriding: return type requires unchecked conversion. Found 'java.util.List', required 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ClosureMetaClass.java`
#### Snippet
```java

    @Override
    public List respondsTo(final Object obj, final String name, final Object[] argTypes) {
        loadMetaInfo();
        return super.respondsTo(obj, name, argTypes);
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
    @Override
    public Object[] toArray(Object[] a) {
      Collection c = new ArrayList(this);
      return c.toArray(a);
    }
```

### UNCHECKED_WARNING
Unchecked call to 'toArray(T\[\])' as a member of raw type 'java.util.Collection'
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
    public Object[] toArray(Object[] a) {
      Collection c = new ArrayList(this);
      return c.toArray(a);
    }
  }
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
    @Override
    public Object[] toArray() {
      Collection c = new ArrayList(this);
      return c.toArray();
    }
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
    @Override
    public Object[] toArray() {
      Collection c = new ArrayList(this);
      return c.toArray();
    }
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
    @Override
    public Object[] toArray() {
      Collection c = new ArrayList(this);
      return c.toArray();
    }
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
    @Override
    public Object[] toArray(Object[] a) {
      Collection c = new ArrayList(this);
      return c.toArray(a);
    }
```

### UNCHECKED_WARNING
Unchecked call to 'toArray(T\[\])' as a member of raw type 'java.util.Collection'
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
    public Object[] toArray(Object[] a) {
      Collection c = new ArrayList(this);
      return c.toArray(a);
    }
  }
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
    @Override
    public Object[] toArray(Object[] a) {
      Collection c = new ArrayList(this);
      return c.toArray(a);
    }
```

### UNCHECKED_WARNING
Unchecked call to 'toArray(T\[\])' as a member of raw type 'java.util.Collection'
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ConcurrentReaderHashMap.java`
#### Snippet
```java
    public Object[] toArray(Object[] a) {
      Collection c = new ArrayList(this);
      return c.toArray(a);
    }
  }
```

### UNCHECKED_WARNING
Unchecked call to 'getConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/codehaus/groovy/runtime/metaclass/MetaClassRegistryImpl.java`
#### Snippet
```java
           try {
               final Class customMetaClassHandle = Class.forName("groovy.runtime.metaclass.CustomMetaClassCreationHandle");
               final Constructor customMetaClassHandleConstructor = customMetaClassHandle.getConstructor();
                 this.metaClassCreationHandle = (MetaClassCreationHandle)customMetaClassHandleConstructor.newInstance();
           } catch (final ClassNotFoundException e) {
```

### UNCHECKED_WARNING
Unchecked call to 'getDeclaredConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/codehaus/groovy/runtime/metaclass/MetaClassRegistryImpl.java`
#### Snippet
```java
    private void createMetaMethodFromClass(Map<CachedClass, List<MetaMethod>> map, Class aClass) {
        try {
            MetaMethod method = (MetaMethod) aClass.getDeclaredConstructor().newInstance();
            final CachedClass declClass = method.getDeclaringClass();
            List<MetaMethod> arr = map.computeIfAbsent(declClass, k -> new ArrayList<MetaMethod>(4));
```

### UNCHECKED_WARNING
Unchecked call to 'add(int, E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/classgen/Verifier.java`
#### Snippet
```java
                        return; // GROOVY-5150: primitive type constants will be initialized directly
                    }
                    staticList.add(0, statement);
                } else {
                    staticList.add(statement);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/classgen/Verifier.java`
#### Snippet
```java
                    staticList.add(0, statement);
                } else {
                    staticList.add(statement);
                }
                fieldNode.setInitialValueExpression(null); // to avoid double initialization in case of several constructors
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/classgen/Verifier.java`
#### Snippet
```java
                 */
                if (isEnumClassNode && explicitStaticPropsInEnum.contains(fieldNode.getName())) {
                    initStmtsAfterEnumValuesInit.add(statement);
                }
            } else {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/classgen/Verifier.java`
#### Snippet
```java
                }
            } else {
                list.add(statement);
            }
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Tuple2' to 'groovy.lang.Tuple2'
in `src/main/java/org/codehaus/groovy/vmplugin/v9/ClassFinder.java`
#### Snippet
```java
    private static Tuple2<FileSystem, Boolean> maybeNewFileSystem(URI uri) throws IOException {
        try {
            return new Tuple2(FileSystems.newFileSystem(uri, Collections.emptyMap()), true);
        } catch (FileSystemAlreadyExistsException e) {
            return new Tuple2(FileSystems.getFileSystem(uri), false);
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple2(T1, T2)' as a member of raw type 'groovy.lang.Tuple2'
in `src/main/java/org/codehaus/groovy/vmplugin/v9/ClassFinder.java`
#### Snippet
```java
    private static Tuple2<FileSystem, Boolean> maybeNewFileSystem(URI uri) throws IOException {
        try {
            return new Tuple2(FileSystems.newFileSystem(uri, Collections.emptyMap()), true);
        } catch (FileSystemAlreadyExistsException e) {
            return new Tuple2(FileSystems.getFileSystem(uri), false);
```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Tuple2' to 'groovy.lang.Tuple2'
in `src/main/java/org/codehaus/groovy/vmplugin/v9/ClassFinder.java`
#### Snippet
```java
            return new Tuple2(FileSystems.newFileSystem(uri, Collections.emptyMap()), true);
        } catch (FileSystemAlreadyExistsException e) {
            return new Tuple2(FileSystems.getFileSystem(uri), false);
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple2(T1, T2)' as a member of raw type 'groovy.lang.Tuple2'
in `src/main/java/org/codehaus/groovy/vmplugin/v9/ClassFinder.java`
#### Snippet
```java
            return new Tuple2(FileSystems.newFileSystem(uri, Collections.emptyMap()), true);
        } catch (FileSystemAlreadyExistsException e) {
            return new Tuple2(FileSystems.getFileSystem(uri), false);
        }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Optional\>' to 'java.util.Optional'
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
            return self;
        }
        return (Optional<T>) supplier.get();
    }

```

### UNCHECKED_WARNING
Unchecked call to 'HashMap(Map)' as a member of raw type 'java.util.HashMap'
in `src/main/java/org/codehaus/groovy/transform/AbstractASTTransformation.java`
#### Snippet
```java
                List<ClassNode> remaining = new LinkedList<>();
                remaining.add(cn);
                Map updatedGenericsSpec = new HashMap(genericsSpec);
                while (!remaining.isEmpty()) {
                    ClassNode next = remaining.remove(0);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/org/codehaus/groovy/transform/AbstractASTTransformation.java`
#### Snippet
```java
                    ClassNode next = remaining.remove(0);
                    if (!isObjectType(next)) {
                        updatedGenericsSpec = GenericsUtils.createGenericsSpec(next, updatedGenericsSpec);
                        for (MethodNode mn : next.getMethods()) {
                            MethodNode correctedMethodNode = GenericsUtils.correctToGenericsSpec(updatedGenericsSpec, mn);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/org/codehaus/groovy/transform/AbstractASTTransformation.java`
#### Snippet
```java
                        updatedGenericsSpec = GenericsUtils.createGenericsSpec(next, updatedGenericsSpec);
                        for (MethodNode mn : next.getMethods()) {
                            MethodNode correctedMethodNode = GenericsUtils.correctToGenericsSpec(updatedGenericsSpec, mn);
                            if (checkReturn) {
                                String md = correctedMethodNode.getTypeDescriptor();
```

### UNCHECKED_WARNING
Unchecked call to 'HashMap(Map)' as a member of raw type 'java.util.HashMap'
in `src/main/java/org/codehaus/groovy/transform/AbstractASTTransformation.java`
#### Snippet
```java
            List<ClassNode> remaining = new LinkedList<>();
            remaining.add(cn);
            Map updatedGenericsSpec = new HashMap(genericsSpec);
            while (!remaining.isEmpty()) {
                ClassNode next = remaining.remove(0);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/org/codehaus/groovy/transform/AbstractASTTransformation.java`
#### Snippet
```java
                ClassNode next = remaining.remove(0);
                if (!isObjectType(next)) {
                    updatedGenericsSpec = GenericsUtils.createGenericsSpec(next, updatedGenericsSpec);
                    for (MethodNode mn : next.getMethods()) {
                        MethodNode correctedMethodNode = GenericsUtils.correctToGenericsSpec(updatedGenericsSpec, mn);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/org/codehaus/groovy/transform/AbstractASTTransformation.java`
#### Snippet
```java
                    updatedGenericsSpec = GenericsUtils.createGenericsSpec(next, updatedGenericsSpec);
                    for (MethodNode mn : next.getMethods()) {
                        MethodNode correctedMethodNode = GenericsUtils.correctToGenericsSpec(updatedGenericsSpec, mn);
                        if (checkReturn) {
                            String md = correctedMethodNode.getTypeDescriptor();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T, U extends T, V extends T> T findResult(Iterator<U> self, V defaultResult) {
        T result = (T) findResult(self, Closure.IDENTITY);
        return result == null ? defaultResult : result;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T, U extends T, V extends T> T findResult(Iterator<U> self, V defaultResult) {
        T result = (T) findResult(self, Closure.IDENTITY);
        return result == null ? defaultResult : result;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T> Collection<T> findResults(T[] self) {
        return findResults(self, Closure.IDENTITY);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T> Collection<T> findResults(T[] self) {
        return findResults(self, Closure.IDENTITY);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T, U extends T, V extends T> T findResult(U[] self, V defaultResult) {
        return (T) findResult(new ArrayIterator<>(self), defaultResult, Closure.IDENTITY);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T, U extends T, V extends T> T findResult(U[] self, V defaultResult) {
        return (T) findResult(new ArrayIterator<>(self), defaultResult, Closure.IDENTITY);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T> T findResult(Iterator<T> self) {
        return (T) findResult(self, Closure.IDENTITY);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T> T findResult(Iterator<T> self) {
        return (T) findResult(self, Closure.IDENTITY);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T> Collection<T> findResults(Iterator<T> self) {
        return findResults(self, Closure.IDENTITY);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T> Collection<T> findResults(Iterator<T> self) {
        return findResults(self, Closure.IDENTITY);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T, U extends T, V extends T> T findResult(Iterable<U> self, V defaultResult) {
        T result = (T) findResult(self, Closure.IDENTITY);
        if (result == null) return defaultResult;
        return result;
```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T, U extends T, V extends T> T findResult(Iterable<U> self, V defaultResult) {
        T result = (T) findResult(self, Closure.IDENTITY);
        if (result == null) return defaultResult;
        return result;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Collection' to 'java.util.Collection'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T> Collection<T> findResults(Iterable<T> self) {
        return findResults(self.iterator(), Closure.IDENTITY);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T> Collection<T> findResults(Iterable<T> self) {
        return findResults(self.iterator(), Closure.IDENTITY);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T> T findResult(T[] self) {
        return (T) findResult(new ArrayIterator<>(self), Closure.IDENTITY);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T> T findResult(T[] self) {
        return (T) findResult(new ArrayIterator<>(self), Closure.IDENTITY);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T> T findResult(Iterable<T> self) {
        return (T) findResult(self.iterator(), Closure.IDENTITY);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <T> T findResult(Iterable<T> self) {
        return (T) findResult(self.iterator(), Closure.IDENTITY);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Class'
in `src/main/java/org/codehaus/groovy/transform/LogASTTransformation.java`
#### Snippet
```java
        // try configurable logging strategy
        try {
            Class<? extends LoggingStrategyV2> strategyClass = (Class<? extends LoggingStrategyV2>) defaultValue;
            if (AbstractLoggingStrategy.class.isAssignableFrom(strategyClass)) {
                return DefaultGroovyMethods.newInstance(strategyClass, new Object[]{classLoader});
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Class'
in `src/main/java/org/codehaus/groovy/transform/LogASTTransformation.java`
#### Snippet
```java
        // try legacy logging strategy
        try {
            Class<? extends LoggingStrategy> strategyClass = (Class<? extends LoggingStrategy>) defaultValue;
            if (AbstractLoggingStrategy.class.isAssignableFrom(strategyClass)) {
                return DefaultGroovyMethods.newInstance(strategyClass, new Object[]{classLoader});
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List\>'
in `src/main/java/org/codehaus/groovy/transform/tailrec/RecursivenessTester.java`
#### Snippet
```java

        List<List<ClassNode>> classNodePairs =
                transpose(Arrays.asList(
                        Arrays.stream(method.getParameters()).map(Parameter::getType).collect(Collectors.toList()),
                        arguments.getExpressions().stream().map(Expression::getType).collect(Collectors.toList())));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/org/codehaus/groovy/transform/tailrec/ReturnStatementToIterationConverter.java`
#### Snippet
```java

    private void replaceArgUsageByTempUsage(BinaryExpression binary, Map tempMapping, UsedVariableTracker tracker) {
        VariableAccessReplacer replacer = new VariableAccessReplacer(tempMapping, tracker);
        // Replacement must only happen in binary.rightExpression. It's a hack in VariableExpressionReplacer which takes care of that.
        replacer.replaceIn(binary);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/org/codehaus/groovy/transform/tailrec/VariableAccessReplacer.java`
#### Snippet
```java
        Closure<VariableExpression> replaceWithLocalVariable = new Closure<VariableExpression>(this, this) {
            public VariableExpression doCall(VariableExpression expr) {
                VariableExpression newVar = AstHelper.createVariableReference(nameAndTypeMapping.get(expr.getName()));
                getListener().variableReplaced(expr, newVar);
                return newVar;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map\>'
in `src/main/java/org/codehaus/groovy/transform/tailrec/TailRecursiveASTTransformation.java`
#### Snippet
```java

    private void replaceAllRecursiveReturnsWithIteration(MethodNode method, Map positionMapping) {
        replaceRecursiveReturnsOutsideClosures(method, positionMapping);
        replaceRecursiveReturnsInsideClosures(method, positionMapping);
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map\>'
in `src/main/java/org/codehaus/groovy/transform/tailrec/TailRecursiveASTTransformation.java`
#### Snippet
```java
    private void replaceAllRecursiveReturnsWithIteration(MethodNode method, Map positionMapping) {
        replaceRecursiveReturnsOutsideClosures(method, positionMapping);
        replaceRecursiveReturnsInsideClosures(method, positionMapping);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'getConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/codehaus/groovy/reflection/ClassLoaderForClassArtifacts.java`
#### Snippet
```java
        if (cls != null) {
            try {
                return cls.getConstructor(CallSite.class, MetaClassImpl.class, MetaMethod.class, Class[].class, Constructor.class);
            } catch (NoSuchMethodException e) { //
            }
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/codehaus/groovy/reflection/ReflectionCache.java`
#### Snippet
```java
//        }
//        return ((Boolean)val.getValue()).booleanValue();
        return klazz.isAssignableFrom(aClass);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'org.apache.groovy.util.concurrent.ConcurrentReferenceHashMap'
in `src/main/java/org/codehaus/groovy/reflection/MixinInMetaClass.java`
#### Snippet
```java
            mixinInstance = constructor.invoke(MetaClassHelper.EMPTY_ARRAY);
            new MixedInMetaClass(mixinInstance, object);
            managedIdentityConcurrentMap.put(object, mixinInstance);
        }
        return mixinInstance;
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'org.apache.groovy.util.concurrent.ConcurrentReferenceHashMap'
in `src/main/java/org/codehaus/groovy/reflection/MixinInMetaClass.java`
#### Snippet
```java
            managedIdentityConcurrentMap.remove(object);
        } else {
            managedIdentityConcurrentMap.put(object, mixinInstance);
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/codehaus/groovy/reflection/MixinInMetaClass.java`
#### Snippet
```java
            arr.add(metaMethod);
        } else {
            if (self.getTheClass().isAssignableFrom(paramTypes[0].getTheClass())) {
                metaMethod = new NewInstanceMetaMethod(method);
                arr.add(metaMethod);
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/codehaus/groovy/reflection/stdclasses/CachedSAMClass.java`
#### Snippet
```java

    public static Object coerceToSAM(Closure argument, Method method, Class clazz, boolean isInterface) {
        if (argument != null && clazz.isAssignableFrom(argument.getClass())) {
            return argument;
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.reflect.Constructor' to 'java.lang.reflect.Constructor'
in `src/main/java/org/codehaus/groovy/reflection/CachedMethod.java`
#### Snippet
```java
            if (ctor == null) {
                if (CallSiteGenerator.isCompilable(this)) {
                    ctor = CallSiteGenerator.compileStaticMethod(this);
                }
                if (ctor != null) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.reflect.Constructor' to 'java.lang.reflect.Constructor'
in `src/main/java/org/codehaus/groovy/reflection/CachedMethod.java`
#### Snippet
```java
            if (ctor == null) {
                if (CallSiteGenerator.isCompilable(this)) {
                    ctor = CallSiteGenerator.compilePojoMethod(this);
                }
                if (ctor != null) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.reflect.Constructor' to 'java.lang.reflect.Constructor'
in `src/main/java/org/codehaus/groovy/reflection/CachedMethod.java`
#### Snippet
```java
            if (ctor == null) {
                if (CallSiteGenerator.isCompilable(this)) {
                    ctor = CallSiteGenerator.compilePogoMethod(this);
                }
                if (ctor != null) {
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/codehaus/groovy/reflection/CachedClass.java`
#### Snippet
```java
            if (m.getName().equals(name)
                    && ReflectionCache.arrayContentsEq(parameterTypes, m.getParameterTypes())
                    && (res == null || res.getReturnType().isAssignableFrom(m.getReturnType())))
                res = m;
        }
```

### UNCHECKED_WARNING
Unchecked method 'sort(List)' invocation
in `src/main/java/org/codehaus/groovy/reflection/CachedClass.java`
#### Snippet
```java
                }
            }
            Collections.sort(methods);

            CachedClass superClass = getCachedSuperClass();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Comparator' to 'java.util.Comparator'
in `src/main/java/org/codehaus/groovy/reflection/CachedClass.java`
#### Snippet
```java
            }
            if (mopMethods.size() > 1)
                mopMethods.sort(CachedMethodComparatorByName.INSTANCE);

            CachedClass.this.mopMethods = mopMethods.toArray(CachedMethod.EMPTY_ARRAY);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/lang/BenchmarkInterceptor.java`
#### Snippet
```java
    @Override
    public Object afterInvoke(Object object, String methodName, Object[] arguments, Object result) {
        ((List) calls.get(methodName)).add(System.currentTimeMillis());
        return result;
    }
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/lang/BenchmarkInterceptor.java`
#### Snippet
```java
    @Override
    public Object beforeInvoke(Object object, String methodName, Object[] arguments) {
        if (!calls.containsKey(methodName)) calls.put(methodName, new LinkedList());
        ((List) calls.get(methodName)).add(System.currentTimeMillis());

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/lang/BenchmarkInterceptor.java`
#### Snippet
```java
    public Object beforeInvoke(Object object, String methodName, Object[] arguments) {
        if (!calls.containsKey(methodName)) calls.put(methodName, new LinkedList());
        ((List) calls.get(methodName)).add(System.currentTimeMillis());

        return null;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/lang/BenchmarkInterceptor.java`
#### Snippet
```java
        for (Object o : calls.keySet()) {
            Object[] line = new Object[3];
            result.add(line);
            line[0] = o;
            List times = (List) calls.get(line[0]);
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(E...)' as a member of raw type 'groovy.lang.Tuple'
in `src/main/java/groovy/lang/Tuple9.java`
#### Snippet
```java

    public Tuple9(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9) {
        super(v1, v2, v3, v4, v5, v6, v7, v8, v9);

        this.v1 = v1;
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(E...)' as a member of raw type 'groovy.lang.Tuple'
in `src/main/java/groovy/lang/Tuple16.java`
#### Snippet
```java

    public Tuple16(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11, T12 v12, T13 v13, T14 v14, T15 v15, T16 v16) {
        super(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16);

        this.v1 = v1;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V'
in `src/main/java/groovy/lang/TrampolineClosure.java`
#### Snippet
```java
            if (result instanceof TrampolineClosure) {
                result = ((TrampolineClosure)result).original.call();
            } else return (V) result;
        }
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/groovy/lang/Closure.java`
#### Snippet
```java
        if (maxCacheSize < 0) throw new IllegalArgumentException("A non-negative number is required as the maxCacheSize parameter for memoizeAtMost.");

        return Memoize.buildMemoizeFunction(new LRUCache(maxCacheSize), this);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.codehaus.groovy.runtime.memoize.LRUCache' to 'org.codehaus.groovy.runtime.memoize.MemoizeCache'
in `src/main/java/groovy/lang/Closure.java`
#### Snippet
```java
        if (maxCacheSize < 0) throw new IllegalArgumentException("A non-negative number is required as the maxCacheSize parameter for memoizeAtMost.");

        return Memoize.buildMemoizeFunction(new LRUCache(maxCacheSize), this);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'CurriedClosure(Closure, Object...)' as a member of raw type 'org.codehaus.groovy.runtime.CurriedClosure'
in `src/main/java/groovy/lang/Closure.java`
#### Snippet
```java
        @Override
        public Closure curry(final Object... arguments) {
            return (new CurriedClosure(this, arguments)).asWritable();
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/groovy/lang/Closure.java`
#### Snippet
```java
     */
    public Closure<V> memoize() {
        return Memoize.buildMemoizeFunction(new ConcurrentCommonCache(), this);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.codehaus.groovy.runtime.memoize.ConcurrentCommonCache' to 'org.codehaus.groovy.runtime.memoize.MemoizeCache'
in `src/main/java/groovy/lang/Closure.java`
#### Snippet
```java
     */
    public Closure<V> memoize() {
        return Memoize.buildMemoizeFunction(new ConcurrentCommonCache(), this);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(E...)' as a member of raw type 'groovy.lang.Tuple'
in `src/main/java/groovy/lang/Tuple14.java`
#### Snippet
```java

    public Tuple14(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11, T12 v12, T13 v13, T14 v14) {
        super(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14);

        this.v1 = v1;
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(E...)' as a member of raw type 'groovy.lang.Tuple'
in `src/main/java/groovy/lang/Tuple8.java`
#### Snippet
```java

    public Tuple8(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8) {
        super(v1, v2, v3, v4, v5, v6, v7, v8);

        this.v1 = v1;
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(E...)' as a member of raw type 'groovy.lang.Tuple'
in `src/main/java/groovy/lang/Tuple2.java`
#### Snippet
```java

    public Tuple2(T1 v1, T2 v2) {
        super(v1, v2);

        this.v1 = v1;
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(E...)' as a member of raw type 'groovy.lang.Tuple'
in `src/main/java/groovy/lang/Tuple5.java`
#### Snippet
```java

    public Tuple5(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5) {
        super(v1, v2, v3, v4, v5);

        this.v1 = v1;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `src/main/java/groovy/lang/GroovyShell.java`
#### Snippet
```java
            // treat it just like a script if it is one
            try {
                Script script = InvokerHelper.newScript(scriptClass, context);
                return script.run();
            } catch (InstantiationException | InvocationTargetException | IllegalAccessException | NoSuchMethodException e) {
```

### UNCHECKED_WARNING
Unchecked call to 'getMethod(String, Class...)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/lang/GroovyShell.java`
#### Snippet
```java
        try {
            // let's find a main method
            scriptClass.getMethod(MAIN_METHOD_NAME, String[].class);
            // if that main method exist, invoke it
            return InvokerHelper.invokeMethod(scriptClass, MAIN_METHOD_NAME, new Object[]{args});
```

### UNCHECKED_WARNING
Unchecked call to 'getConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/lang/GroovyShell.java`
#### Snippet
```java
        try {
            // first, fetch the constructor taking String[] as parameter
            constructor = scriptClass.getConstructor(String[].class);
            try {
                // instantiate a runnable and run it
```

### UNCHECKED_WARNING
Unchecked call to 'getConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/lang/GroovyShell.java`
#### Snippet
```java
            try {
                // otherwise, find the default constructor
                constructor = scriptClass.getConstructor();
                try {
                    // instantiate a runnable and run it
```

### UNCHECKED_WARNING
Unchecked assignment: 'DoSetContext' to 'java.security.PrivilegedAction'
in `src/main/java/groovy/lang/GroovyShell.java`
#### Snippet
```java
        }

        doPrivileged(new DoSetContext(loader));

        // Parse the script, generate the class, and invoke the main method.  This is a little looser than
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(E...)' as a member of raw type 'groovy.lang.Tuple'
in `src/main/java/groovy/lang/Tuple3.java`
#### Snippet
```java

    public Tuple3(T1 v1, T2 v2, T3 v3) {
        super(v1, v2, v3);

        this.v1 = v1;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'
in `src/main/java/groovy/lang/MapWithDefault.java`
#### Snippet
```java
        V value = getDefaultValue(key);
        if (autoGrow) {
            delegate.put((K)key, value);
        }
        return value;
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(E...)' as a member of raw type 'groovy.lang.Tuple'
in `src/main/java/groovy/lang/Tuple11.java`
#### Snippet
```java

    public Tuple11(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11) {
        super(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11);

        this.v1 = v1;
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(E...)' as a member of raw type 'groovy.lang.Tuple'
in `src/main/java/groovy/lang/Tuple4.java`
#### Snippet
```java

    public Tuple4(T1 v1, T2 v2, T3 v3, T4 v4) {
        super(v1, v2, v3, v4);

        this.v1 = v1;
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/lang/Binding.java`
#### Snippet
```java
        if (variables == null)
            variables = new LinkedHashMap();
        variables.put(name, value);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(E...)' as a member of raw type 'groovy.lang.Tuple'
in `src/main/java/groovy/lang/Tuple10.java`
#### Snippet
```java

    public Tuple10(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10) {
        super(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10);

        this.v1 = v1;
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(E...)' as a member of raw type 'groovy.lang.Tuple'
in `src/main/java/groovy/lang/Tuple6.java`
#### Snippet
```java

    public Tuple6(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6) {
        super(v1, v2, v3, v4, v5, v6);

        this.v1 = v1;
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(E...)' as a member of raw type 'groovy.lang.Tuple'
in `src/main/java/groovy/lang/Tuple13.java`
#### Snippet
```java

    public Tuple13(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11, T12 v12, T13 v13) {
        super(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13);

        this.v1 = v1;
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(E...)' as a member of raw type 'groovy.lang.Tuple'
in `src/main/java/groovy/lang/Tuple1.java`
#### Snippet
```java

    public Tuple1(T1 t1) {
        super(t1);

        this.v1 = t1;
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/lang/ExpandoMetaClass.java`
#### Snippet
```java
    public Object castToMixedType(Object obj, Class type) {
        for (MixinInMetaClass mixin : mixinClasses) {
            if (type.isAssignableFrom(mixin.getMixinClass().getTheClass()))
                return mixin.getMixinInstance(obj);
        }
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.concurrent.ConcurrentHashMap'
in `src/main/java/groovy/lang/ExpandoMetaClass.java`
#### Snippet
```java
        Object methodOrList = expandoSubclassMethods.get(name);
        if (methodOrList == null) {
            expandoSubclassMethods.put(name, metaMethod);
        } else {
            if (methodOrList instanceof MetaMethod) {
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.concurrent.ConcurrentHashMap'
in `src/main/java/groovy/lang/ExpandoMetaClass.java`
#### Snippet
```java
                arr.add(methodOrList);
                arr.add(metaMethod);
                expandoSubclassMethods.put(name, arr);
            } else {
                ((FastArray) methodOrList).add(metaMethod);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/groovy/lang/ExpandoMetaClass.java`
#### Snippet
```java

        public void mixin(List categories) {
            DefaultGroovyMethods.mixin(ExpandoMetaClass.this, categories);
        }

```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/lang/ExpandoMetaClass.java`
#### Snippet
```java

        public Object getAt(Class key) {
            if (key.isAssignableFrom(object.getClass())) {
                return new GroovyObjectSupport() {
                    {
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/lang/ExpandoMetaClass.java`
#### Snippet
```java

            for (final MixinInMetaClass mixin : mixinClasses) {
                if (key.isAssignableFrom(mixin.getMixinClass().getTheClass())) {
                    return new GroovyObjectSupport() {
                        {
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(E...)' as a member of raw type 'groovy.lang.Tuple'
in `src/main/java/groovy/lang/Tuple7.java`
#### Snippet
```java

    public Tuple7(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7) {
        super(v1, v2, v3, v4, v5, v6, v7);

        this.v1 = v1;
```

### UNCHECKED_WARNING
Unchecked call to 'HashMap(Map)' as a member of raw type 'java.util.HashMap'
in `src/main/java/groovy/lang/SpreadMap.java`
#### Snippet
```java

    public SpreadMap(Map map) {
        super(map);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `src/main/java/groovy/lang/SpreadMap.java`
#### Snippet
```java
        int i = 0;
        while (i < values.length) {
            super.put(values[i++], values[i++]);
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'getConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/lang/MetaClassRegistry.java`
#### Snippet
```java
                final Class customMetaClass = Class.forName("groovy.runtime.metaclass." + theClass.getName() + "MetaClass");
                if (DelegatingMetaClass.class.isAssignableFrom(customMetaClass)) {
                    final Constructor customMetaClassConstructor = customMetaClass.getConstructor(MetaClass.class);
                    MetaClass normalMetaClass = createNormalMetaClass(theClass, registry);
                    return (MetaClass)customMetaClassConstructor.newInstance(normalMetaClass);
```

### UNCHECKED_WARNING
Unchecked call to 'getConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/lang/MetaClassRegistry.java`
#### Snippet
```java
                }
                else {
                    final Constructor customMetaClassConstructor = customMetaClass.getConstructor(MetaClassRegistry.class, Class.class);
                    return (MetaClass)customMetaClassConstructor.newInstance(registry, theClass);
                }
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(E...)' as a member of raw type 'groovy.lang.Tuple'
in `src/main/java/groovy/lang/Tuple12.java`
#### Snippet
```java

    public Tuple12(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11, T12 v12) {
        super(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12);

        this.v1 = v1;
```

### UNCHECKED_WARNING
Unchecked call to 'Tuple(E...)' as a member of raw type 'groovy.lang.Tuple'
in `src/main/java/groovy/lang/Tuple15.java`
#### Snippet
```java

    public Tuple15(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10, T11 v11, T12 v12, T13 v13, T14 v14, T15 v15) {
        super(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15);

        this.v1 = v1;
```

### UNCHECKED_WARNING
Unchecked call to 'set(int, E)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/groovy/lang/Sequence.java`
#### Snippet
```java
    public Object set(int index, Object element) {
        hashCode = 0;
        return super.set(index, element);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'add(int, E)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/groovy/lang/Sequence.java`
#### Snippet
```java
        checkType(element);
        hashCode = 0;
        super.add(index, element);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/groovy/lang/Sequence.java`
#### Snippet
```java
        checkCollectionType(c);
        hashCode = 0;
        return super.addAll(c);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'addAll(int, Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/groovy/lang/Sequence.java`
#### Snippet
```java
        checkCollectionType(c);
        hashCode = 0;
        return super.addAll(index, c);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/groovy/lang/Sequence.java`
#### Snippet
```java
        checkType(element);
        hashCode = 0;
        return super.add(element);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/lang/Sequence.java`
#### Snippet
```java
            for (Object element : this) {
                Object value = InvokerHelper.invokeMethod(element, name, args);
                answer.add(value);
            }
            return answer;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/time/BaseDuration.java`
#### Snippet
```java
        List buffer = new ArrayList();

        if (this.years != 0) buffer.add(this.years + " years");
        if (this.months != 0) buffer.add(this.months + " months");
        if (this.days != 0) buffer.add(this.days + " days");
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/time/BaseDuration.java`
#### Snippet
```java

        if (this.years != 0) buffer.add(this.years + " years");
        if (this.months != 0) buffer.add(this.months + " months");
        if (this.days != 0) buffer.add(this.days + " days");
        if (this.hours != 0) buffer.add(this.hours + " hours");
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/time/BaseDuration.java`
#### Snippet
```java
        if (this.years != 0) buffer.add(this.years + " years");
        if (this.months != 0) buffer.add(this.months + " months");
        if (this.days != 0) buffer.add(this.days + " days");
        if (this.hours != 0) buffer.add(this.hours + " hours");
        if (this.minutes != 0) buffer.add(this.minutes + " minutes");
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/time/BaseDuration.java`
#### Snippet
```java
        if (this.months != 0) buffer.add(this.months + " months");
        if (this.days != 0) buffer.add(this.days + " days");
        if (this.hours != 0) buffer.add(this.hours + " hours");
        if (this.minutes != 0) buffer.add(this.minutes + " minutes");

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/time/BaseDuration.java`
#### Snippet
```java
        if (this.days != 0) buffer.add(this.days + " days");
        if (this.hours != 0) buffer.add(this.hours + " hours");
        if (this.minutes != 0) buffer.add(this.minutes + " minutes");

        if (this.seconds != 0 || this.millis != 0) {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/time/BaseDuration.java`
#### Snippet
```java
            int norm_seconds = this.seconds + DefaultGroovyMethods.intdiv(this.millis - norm_millis, 1000).intValue();
            CharSequence millisToPad = "" + Math.abs(norm_millis);
            buffer.add((norm_seconds == 0 ? (norm_millis < 0 ? "-0" : "0") : norm_seconds) + "." + StringGroovyMethods.padLeft(millisToPad, 3, "0") + " seconds");
        }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/util/Expando.java`
#### Snippet
```java
    public void setProperty(String property, Object newValue) {
        // always use the expando properties
        getProperties().put(property, newValue);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Expando.java`
#### Snippet
```java
        for (Object o : getProperties().entrySet()) {
            Entry entry = (Entry) o;
            ret.add(new MetaExpandoProperty(entry));
        }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/util/ObservableMap.java`
#### Snippet
```java
        boolean newKey = !delegate.containsKey(key);
        if (test != null) {
            oldValue = delegate.put(key, value);
            Object result = null;
            if (test.getMaximumNumberOfParameters() == 2) {
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/util/ObservableMap.java`
#### Snippet
```java
            }
        } else {
            oldValue = delegate.put(key, value);
            if (newKey) {
                firePropertyAddedEvent(key, value);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/util/ObservableMap.java`
#### Snippet
```java
                boolean newKey = !delegate.containsKey(key);
                if (test != null) {
                    oldValue = delegate.put(key, newValue);
                    Object result = null;
                    if (test.getMaximumNumberOfParameters() == 2) {
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/util/ObservableMap.java`
#### Snippet
```java
                    }
                } else {
                    oldValue = delegate.put(key, newValue);
                    if (newKey) {
                        events.add(new PropertyAddedEvent(this, key, newValue));
```

### UNCHECKED_WARNING
Unchecked call to 'putAll(Map)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/util/ObservableMap.java`
#### Snippet
```java
        Map values = new HashMap();
        if (!delegate.isEmpty()) {
            values.putAll(delegate);
        }
        delegate.clear();
```

### UNCHECKED_WARNING
Unchecked call to 'putAll(Map)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/util/ObservableMap.java`
#### Snippet
```java
            super(source, ObservableMap.CLEARED_PROPERTY, values, null, ChangeType.CLEARED);
            if (values != null) {
                this.values.putAll(values);
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/util/ConfigObject.java`
#### Snippet
```java
            } else {
                try {
                    config.put(suffix + key, value);
                } catch (NullPointerException e) {
                    // it is idiotic story but if config map doesn't allow null values (like Hashtable)
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/util/ConfigObject.java`
#### Snippet
```java

            if (configEntry == null) {
                config.put(key, value);

            } else {
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/util/ConfigObject.java`
#### Snippet
```java
                    doMerge((Map) configEntry, (Map) value);
                } else {
                    config.put(key, value);
                }
            }
```

### UNCHECKED_WARNING
Unchecked call to 'putAll(Map)' as a member of raw type 'java.util.HashMap'
in `src/main/java/groovy/util/ConfigObject.java`
#### Snippet
```java
    @Override
    public void putAll(Map m) {
        delegateMap.putAll(m);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.HashMap'
in `src/main/java/groovy/util/ConfigObject.java`
#### Snippet
```java
    @Override
    public Object put(Object key, Object value) {
        return delegateMap.put(key, value);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/ObservableSet.java`
#### Snippet
```java
            super(source, ChangeType.oldValue, ChangeType.newValue, ChangeType.MULTI_ADD);
            if (values != null) {
                this.values.addAll(values);
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/ObservableSet.java`
#### Snippet
```java
            super(source, ChangeType.oldValue, ChangeType.newValue, ChangeType.MULTI_REMOVE);
            if (values != null) {
                this.values.addAll(values);
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/ObservableSet.java`
#### Snippet
```java
            super(source, ChangeType.oldValue, ChangeType.newValue, ChangeType.CLEARED);
            if (values != null) {
                this.values.addAll(values);
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/ObservableSet.java`
#### Snippet
```java
        for (Object element : c) {
            if (delegate.contains(element)) {
                values.add(element);
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/ObservableSet.java`
#### Snippet
```java
        for (Object element : delegate) {
            if (!c.contains(element)) {
                values.add(element);
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'add(int, E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
    public void add(int index, Object element) {
        int oldSize = size();
        delegate.add(index, element);
        fireAddWithTest(element, index, oldSize);
    }
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(int, Collection)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
    public boolean addAll(int index, Collection c) {
        int oldSize = size();
        boolean success = delegate.addAll(index, c);

        if (success && c != null) {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
                    Object result = test.call(element);
                    if (result instanceof Boolean && (Boolean) result) {
                        values.add(element);
                    }
                } else {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
                    }
                } else {
                    values.add(element);
                }
            }
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
            super(source, ChangeType.oldValue, ChangeType.newValue, 0, ChangeType.CLEARED);
            if (values != null) {
                this.values.addAll(values);
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'set(int, E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
    @Override
    public Object set(int index, Object element) {
        Object oldValue = delegate.set(index, element);
        if (test != null) {
            Object result = test.call(element);
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
            super(source, ChangeType.oldValue, ChangeType.newValue, index, ChangeType.MULTI_ADD);
            if (values != null) {
                this.values.addAll(values);
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'containsAll(Collection)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
    @Override
    public boolean containsAll(Collection c) {
        return delegate.containsAll(c);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
    public void clear() {
        int oldSize = size();
        List values = new ArrayList(delegate);
        delegate.clear();
        if (!values.isEmpty()) {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
        for (Object element : delegate) {
            if (!c.contains(element)) {
                values.add(element);
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'retainAll(Collection)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java

        int oldSize = size();
        boolean success = delegate.retainAll(c);
        if (success && !values.isEmpty()) {
            fireMultiElementRemovedEvent(values);
```

### UNCHECKED_WARNING
Unchecked call to 'toArray(T\[\])' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
    @Override
    public Object[] toArray(Object[] a) {
        return delegate.toArray(a);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
    public boolean add(Object o) {
        int oldSize = size();
        boolean success = delegate.add(o);
        if (success) {
            fireAddWithTest(o, oldSize, oldSize);
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
            super(source, ChangeType.oldValue, ChangeType.newValue, 0, ChangeType.MULTI_REMOVE);
            if (values != null) {
                this.values.addAll(values);
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java
        for (Object element : c) {
            if (delegateSet.contains(element)) {
                values.add(element);
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'removeAll(Collection)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java

        int oldSize = size();
        boolean success = delegate.removeAll(c);
        if (success && !values.isEmpty()) {
            fireMultiElementRemovedEvent(values);
```

### UNCHECKED_WARNING
Unchecked call to 'toArray(T\[\])' as a member of raw type 'java.util.Collection'
in `src/main/java/groovy/util/CharsetToolkit.java`
#### Snippet
```java
    public static Charset[] getAvailableCharsets() {
        Collection collection = Charset.availableCharsets().values();
        return (Charset[]) collection.toArray(EMPTY_CHARSET_ARRAY);
    }
}
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
        // we're probably just a String
        List result = new NodeList();
        result.add(value);
        return result;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
        List answer = new NodeList();
        Stack stack = new Stack();
        List nextLevelChildren = preorder ? getDirectChildren() : DefaultGroovyMethods.reverse(getDirectChildren());
        while (!nextLevelChildren.isEmpty()) {
            List working = new NodeList(nextLevelChildren);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
            for (Object child : working) {
                if (preorder) {
                    answer.add(child);
                } else {
                    stack.push(child);
```

### UNCHECKED_WARNING
Unchecked call to 'push(E)' as a member of raw type 'java.util.Stack'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
                    answer.add(child);
                } else {
                    stack.push(child);
                }
                if (child instanceof Node) {
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
                    Node childNode = (Node) child;
                    List children = childNode.getDirectChildren();
                    if (children.size() > 1 || (children.size() == 1 && !(children.get(0) instanceof String))) nextLevelChildren.addAll(preorder ? children : DefaultGroovyMethods.reverse(children));
                }
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
                    Node childNode = (Node) child;
                    List children = childNode.getDirectChildren();
                    if (children.size() > 1 || (children.size() == 1 && !(children.get(0) instanceof String))) nextLevelChildren.addAll(preorder ? children : DefaultGroovyMethods.reverse(children));
                }
            }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
        }
        while (!stack.isEmpty()) {
            answer.add(stack.pop());
        }
        return answer;
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
            parent().appendNode(child.name(), child.attributes(), child.value());
        }
        parent().children().addAll(tail);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'HashMap(Map)' as a member of raw type 'java.util.HashMap'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
            newValue = nodes.clone();
        }
        return new Node(null, name, new HashMap(attributes), newValue);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
            public void setAttribute(final Object object, final String attribute, final Object newValue) {
                Node n = (Node) object;
                n.attributes().put(attribute, newValue);
            }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
        } else {
            parentList = new NodeList();
            parentList.add(parentValue);
            parent.setValue(parentList);
        }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
                Node childNode = (Node) child;
                List children = childNode.depthFirstRest(preorder);
                if (preorder) answer.add(childNode);
                if (children.size() > 1 || (children.size() == 1 && !(children.get(0) instanceof String))) answer.addAll(children);
                if (!preorder) answer.add(childNode);
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
                List children = childNode.depthFirstRest(preorder);
                if (preorder) answer.add(childNode);
                if (children.size() > 1 || (children.size() == 1 && !(children.get(0) instanceof String))) answer.addAll(children);
                if (!preorder) answer.add(childNode);
            } else if (child instanceof String) {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
                if (preorder) answer.add(childNode);
                if (children.size() > 1 || (children.size() == 1 && !(children.get(0) instanceof String))) answer.addAll(children);
                if (!preorder) answer.add(childNode);
            } else if (child instanceof String) {
                answer.add(child);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
                if (!preorder) answer.add(childNode);
            } else if (child instanceof String) {
                answer.add(child);
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
        List tail = getTail();
        parent().appendNode(n.name(), n.attributes(), n.value());
        parent().children().addAll(tail);
        getParentList(parent()).remove(this);
        this.setParent(null);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
    private void breadthFirstRest(boolean preorder, int level, Closure c) {
        Stack<Tuple2<Object, Integer>> stack = new Stack<Tuple2<Object, Integer>>();
        List nextLevelChildren = preorder ? getDirectChildren() : DefaultGroovyMethods.reverse(getDirectChildren());
        while (!nextLevelChildren.isEmpty()) {
            List working = new NodeList(nextLevelChildren);
```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
            for (Object child : working) {
                if (preorder) {
                    callClosureForNode(c, child, level);
                } else {
                    stack.push(new Tuple2<Object, Integer>(child, level));
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
                    Node childNode = (Node) child;
                    List children = childNode.getDirectChildren();
                    if (children.size() > 1 || (children.size() == 1 && !(children.get(0) instanceof String))) nextLevelChildren.addAll(preorder ? children : DefaultGroovyMethods.reverse(children));
                }
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
                    Node childNode = (Node) child;
                    List children = childNode.getDirectChildren();
                    if (children.size() > 1 || (children.size() == 1 && !(children.get(0) instanceof String))) nextLevelChildren.addAll(preorder ? children : DefaultGroovyMethods.reverse(children));
                }
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
        while (!stack.isEmpty()) {
            Tuple2<Object, Integer> next = stack.pop();
            callClosureForNode(c, next.getV1(), next.getV2());
        }
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
        NodeBuilder b = new NodeBuilder();
        Node newNode = (Node) b.invokeMethod("dummyNode", c);
        return newNode.children();
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
    public void breadthFirst(Map<String, Object> options, Closure c) {
        boolean preorder = Boolean.parseBoolean(options.get("preorder").toString());
        if (preorder) callClosureForNode(c, this, 1);
        breadthFirstRest(preorder, 2, c);
        if (!preorder) callClosureForNode(c, this, 1);
```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
        if (preorder) callClosureForNode(c, this, 1);
        breadthFirstRest(preorder, 2, c);
        if (!preorder) callClosureForNode(c, this, 1);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
            if (child instanceof Node) {
                Node childNode = (Node) child;
                answer.add(childNode);
            } else if (child instanceof String) {
                answer.add(child);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
                answer.add(childNode);
            } else if (child instanceof String) {
                answer.add(child);
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
    public List depthFirst(boolean preorder) {
        List answer = new NodeList();
        if (preorder) answer.add(this);
        answer.addAll(depthFirstRest(preorder));
        if (!preorder) answer.add(this);
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
        List answer = new NodeList();
        if (preorder) answer.add(this);
        answer.addAll(depthFirstRest(preorder));
        if (!preorder) answer.add(this);
        return answer;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
        if (preorder) answer.add(this);
        answer.addAll(depthFirstRest(preorder));
        if (!preorder) answer.add(this);
        return answer;
    }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java

        if (parent != null) {
            getParentList(parent).add(this);
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
        List list = parent().children();
        int afterIndex = list.indexOf(this);
        List tail = new ArrayList(list.subList(afterIndex + 1, list.size()));
        list.subList(afterIndex + 1, list.size()).clear();
        return tail;
```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
            if (child instanceof Node) {
                Node childNode = (Node) child;
                if (preorder) callClosureForNode(c, childNode, level);
                childNode.depthFirstRest(preorder, level + 1, c);
                if (!preorder) callClosureForNode(c, childNode, level);
```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
                if (preorder) callClosureForNode(c, childNode, level);
                childNode.depthFirstRest(preorder, level + 1, c);
                if (!preorder) callClosureForNode(c, childNode, level);
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
    public boolean append(Node child) {
        child.setParent(this);
        return getParentList(this).add(child);
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
    public void depthFirst(Map<String, Object> options, Closure c) {
        boolean preorder = Boolean.parseBoolean(options.get("preorder").toString());
        if (preorder) callClosureForNode(c, this, 1);
        depthFirstRest(preorder, 2, c);
        if (!preorder) callClosureForNode(c, this, 1);
```

### UNCHECKED_WARNING
Unchecked assignment: 'groovy.lang.Closure' to 'groovy.lang.Closure'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
        if (preorder) callClosureForNode(c, this, 1);
        depthFirstRest(preorder, 2, c);
        if (!preorder) callClosureForNode(c, this, 1);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
                    QName qn = (QName) childNodeName;
                    if (qn.matches(name)) {
                        answer.add(childNode);
                    }
                } else if (name.equals(childNodeName)) {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
                    }
                } else if (name.equals(childNodeName)) {
                    answer.add(childNode);
                }
            }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
                Object childNodeName = childNode.name();
                if (name.matches(childNodeName)) {
                    answer.add(childNode);
                }
            }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
    public List breadthFirst(boolean preorder) {
        List answer = new NodeList();
        if (preorder) answer.add(this);
        answer.addAll(breadthFirstRest(preorder));
        if (!preorder) answer.add(this);
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
        List answer = new NodeList();
        if (preorder) answer.add(this);
        answer.addAll(breadthFirstRest(preorder));
        if (!preorder) answer.add(this);
        return answer;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/Node.java`
#### Snippet
```java
        if (preorder) answer.add(this);
        answer.addAll(breadthFirstRest(preorder));
        if (!preorder) answer.add(this);
        return answer;
    }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/groovy/util/NodeList.java`
#### Snippet
```java
            if (next instanceof Node) {
                Node n = (Node) next;
                result.add(n.clone());
            } else {
                result.add(next);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/groovy/util/NodeList.java`
#### Snippet
```java
                result.add(n.clone());
            } else {
                result.add(next);
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/util/NodeList.java`
#### Snippet
```java
                for (Object o : (NodeList) object) {
                    Node node = (Node) o;
                    node.attributes().put(attribute, newValue);
                }
            }
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/groovy/util/NodeList.java`
#### Snippet
```java

    public NodeList(Collection collection) {
        super(collection);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/NodeList.java`
#### Snippet
```java
                while (it.hasNext()) {
                    Node node = (Node) it.next();
                    result.add(node.attributes().get(attribute));
                }
                return result;
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/groovy/util/NodeList.java`
#### Snippet
```java
                Object temp = childNode.get(name);
                if (temp instanceof Collection) {
                    answer.addAll((Collection) temp);
                } else {
                    answer.add(temp);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/groovy/util/NodeList.java`
#### Snippet
```java
                    answer.addAll((Collection) temp);
                } else {
                    answer.add(temp);
                }
            }
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/groovy/util/NodeList.java`
#### Snippet
```java
                Node childNode = (Node) child;
                NodeList temp = childNode.getAt(name);
                answer.addAll(temp);
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/GroovyCollections.java`
#### Snippet
```java
        if (minSize == 0) return result;
        for (int i = 0; i < minSize; i++) {
            result.add(new ArrayList());
        }
        for (Object listLike : lists) {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/GroovyCollections.java`
#### Snippet
```java
            for (int i = 0; i < minSize; i++) {
                List resultList = (List) result.get(i);
                resultList.add(list.get(i));
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/GroovyCollections.java`
#### Snippet
```java
                for (Object item : items) {
                    List l = new ArrayList();
                    l.add(item);
                    collectedCombos.add(l);
                }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/GroovyCollections.java`
#### Snippet
```java
                    List l = new ArrayList();
                    l.add(item);
                    collectedCombos.add(l);
                }
            } else {
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/groovy/util/GroovyCollections.java`
#### Snippet
```java
                }
            } else {
                List savedCombos = new ArrayList(collectedCombos);
                List newCombos = new ArrayList();
                for (Object value : items) {
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/groovy/util/GroovyCollections.java`
#### Snippet
```java
                for (Object value : items) {
                    for (Object savedCombo : savedCombos) {
                        List oldList = new ArrayList((List) savedCombo);
                        oldList.add(value);
                        newCombos.add(oldList);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/GroovyCollections.java`
#### Snippet
```java
                    for (Object savedCombo : savedCombos) {
                        List oldList = new ArrayList((List) savedCombo);
                        oldList.add(value);
                        newCombos.add(oldList);
                    }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/util/GroovyCollections.java`
#### Snippet
```java
                        List oldList = new ArrayList((List) savedCombo);
                        oldList.add(value);
                        newCombos.add(oldList);
                    }
                }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/groovy/util/ProxyGenerator.java`
#### Snippet
```java
     */
    public GroovyObject instantiateDelegateWithBaseClass(Map closureMap, List<Class> interfaces, Object delegate, Class baseClass, String name) {
        Map<Object,Object> map = closureMap != null ? closureMap : EMPTY_CLOSURE_MAP;
        ProxyGeneratorAdapter adapter = createAdapter(map, interfaces, delegate.getClass(), baseClass);

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `src/main/java/groovy/util/ProxyGenerator.java`
#### Snippet
```java
            throw new GroovyCastException("Cannot coerce a map to class " + clazz.getName() + " because it is a final class");
        }
        Map<Object,Object> map = closureMap != null ? closureMap : EMPTY_CLOSURE_MAP;
        ProxyGeneratorAdapter adapter = createAdapter(map, interfaces, null, clazz);

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/util/ObjectGraphBuilder.java`
#### Snippet
```java

            Map context = ogbuilder.getContext();
            context.put(ObjectGraphBuilder.NODE_NAME, name);
            context.put(ObjectGraphBuilder.LAZY_REF, lazy);

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/util/ObjectGraphBuilder.java`
#### Snippet
```java
            Map context = ogbuilder.getContext();
            context.put(ObjectGraphBuilder.NODE_NAME, name);
            context.put(ObjectGraphBuilder.LAZY_REF, lazy);

            if (lazy) {
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/util/ObjectGraphBuilder.java`
#### Snippet
```java
                        (String) refId));
            } else {
                context.put(ObjectGraphBuilder.NODE_CLASS, object.getClass());
            }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/util/ObjectGraphBuilder.java`
#### Snippet
```java
                nodename = nodename.toLowerCase();
            }
            context.put(ObjectGraphBuilder.NODE_NAME, nodename);
            context.put(ObjectGraphBuilder.NODE_CLASS, klass);
            return bean;
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/util/ObjectGraphBuilder.java`
#### Snippet
```java
            }
            context.put(ObjectGraphBuilder.NODE_NAME, nodename);
            context.put(ObjectGraphBuilder.NODE_CLASS, klass);
            return bean;
        }
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/util/ObjectGraphBuilder.java`
#### Snippet
```java
        super.preInstantiate(name, attributes, value);
        Map context = getContext();
        context.put(OBJECT_ID,
                attributes.remove(identifierResolver.getIdentifierFor((String) name)));
    }
```

### UNCHECKED_WARNING
Unchecked call to 'getDeclaredConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/util/ObjectGraphBuilder.java`
#### Snippet
```java
                IllegalAccessException {
            try {
                return klass.getDeclaredConstructor().newInstance();
            } catch (InvocationTargetException | NoSuchMethodException e) {
                throw new GroovyRuntimeException("Unable to create instance resolver", e);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Collection'
in `src/main/java/groovy/util/ObjectGraphBuilder.java`
#### Snippet
```java
                Object property = InvokerHelper.getProperty(parent, propertyName);
                if (property != null && Collection.class.isAssignableFrom(property.getClass())) {
                    ((Collection) property).add(child);
                } else {
                    InvokerHelper.setProperty(parent, propertyName, child);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/util/ObjectGraphBuilder.java`
#### Snippet
```java
            Class klass = resolveClass(builder, classname, name, value, properties);
            Map context = builder.getContext();
            context.put(ObjectGraphBuilder.NODE_NAME, name);
            context.put(ObjectGraphBuilder.NODE_CLASS, klass);
            return resolveInstance(builder, name, value, klass, properties);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/util/ObjectGraphBuilder.java`
#### Snippet
```java
            Map context = builder.getContext();
            context.put(ObjectGraphBuilder.NODE_NAME, name);
            context.put(ObjectGraphBuilder.NODE_CLASS, klass);
            return resolveInstance(builder, name, value, klass, properties);
        }
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/util/ObjectGraphBuilder.java`
#### Snippet
```java
                                  Map properties) throws InstantiationException, IllegalAccessException {
            ObjectGraphBuilder ogbuilder = (ObjectGraphBuilder) builder;
            if (value != null && klass.isAssignableFrom(value.getClass())) {
                return value;
            }
```

### UNCHECKED_WARNING
Unchecked call to 'getDeclaredConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/util/FactoryBuilderSupport.java`
#### Snippet
```java
                } else {
                    try {
                        return beanClass.getDeclaredConstructor().newInstance();
                    } catch (NoSuchMethodException | InvocationTargetException e) {
                        throw new GroovyRuntimeException("Failed to register bean factory", e);
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/util/FactoryBuilderSupport.java`
#### Snippet
```java
    public static boolean checkValueIsType(Object value, Object name, Class type) {
        if (value != null) {
            if (type.isAssignableFrom(value.getClass())) {
                return true;
            } else {
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/util/FactoryBuilderSupport.java`
#### Snippet
```java
    public static boolean checkValueIsTypeNotString(Object value, Object name, Class type) {
        if (value != null) {
            if (type.isAssignableFrom(value.getClass())) {
                return true;
            } else if (value instanceof String) {
```

### UNCHECKED_WARNING
Unchecked call to 'set(T)' as a member of raw type 'groovy.lang.Reference'
in `src/main/java/groovy/util/FactoryBuilderSupport.java`
#### Snippet
```java
        if (explicitMethod != null) {
            if (args instanceof Object[]) {
                result.set(explicitMethod.call((Object[]) args));
            } else {
                //todo push through InvokerHelper.asList?
```

### UNCHECKED_WARNING
Unchecked call to 'set(T)' as a member of raw type 'groovy.lang.Reference'
in `src/main/java/groovy/util/FactoryBuilderSupport.java`
#### Snippet
```java
            } else {
                //todo push through InvokerHelper.asList?
                result.set(explicitMethod.call(args));
            }
            return true;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'groovy.lang.Tuple2'
in `src/main/java/groovy/inspect/Inspector.java`
#### Snippet
```java
        @Override
        public int compare(Object a, Object b) {
            Tuple2<Object, String[]> aTuple = (Tuple2<Object, String[]>) a;
            Tuple2<Object, String[]> bTuple = (Tuple2<Object, String[]>) b;
            return delegate.compare(aTuple.getV2(), bTuple.getV2());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'groovy.lang.Tuple2'
in `src/main/java/groovy/inspect/Inspector.java`
#### Snippet
```java
        public int compare(Object a, Object b) {
            Tuple2<Object, String[]> aTuple = (Tuple2<Object, String[]>) a;
            Tuple2<Object, String[]> bTuple = (Tuple2<Object, String[]>) b;
            return delegate.compare(aTuple.getV2(), bTuple.getV2());
        }
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
                    (args.length == 2 && args[1] instanceof Map &&
                            theClass.getEnclosingClass() != null &&
                            theClass.getEnclosingClass().isAssignableFrom(argTypes[0]))) {
                constructor = (CachedConstructor) retrieveNamedArgCompatibleConstructor(argTypes, args);
                if (constructor != null) {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
            ret = element;
        } else if (ret instanceof List) {
            ((List) ret).add(element);
        } else {
            List list = new LinkedList();
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
        } else {
            List list = new LinkedList();
            list.add(ret);
            list.add(element);
            ret = list;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
            List list = new LinkedList();
            list.add(ret);
            list.add(element);
            ret = list;
        }
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
        Class selfType2 = categoryMethod.getDeclaringClass().getTheClass();
        // replace if self type is the same or the category self type is more specific
        if (selfType1 == selfType2 || selfType1.isAssignableFrom(selfType2)) return Boolean.TRUE;
        // GROOVY-6363: replace if the private method self type is more specific
        if (aMethod.isPrivate() && selfType2.isAssignableFrom(selfType1)) return Boolean.TRUE;
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
        if (selfType1 == selfType2 || selfType1.isAssignableFrom(selfType2)) return Boolean.TRUE;
        // GROOVY-6363: replace if the private method self type is more specific
        if (aMethod.isPrivate() && selfType2.isAssignableFrom(selfType1)) return Boolean.TRUE;

        return null;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.security.PrivilegedExceptionAction' to 'java.security.PrivilegedExceptionAction'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
    @SuppressWarnings("removal") // TODO a future Groovy version should perform the operation not as a privileged action
    private Object doPrivileged(PrivilegedExceptionAction action) throws PrivilegedActionException {
        return java.security.AccessController.doPrivileged(action);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java

    private static MetaMethod findSubClassMethod(Class instanceKlazz, Class[] arguments, MetaMethod method, MetaMethod m) {
        if (m.getDeclaringClass().getTheClass().isAssignableFrom(instanceKlazz) && m.isValidExactMethod(arguments)) {
            method = (method == null ? m : mostSpecific(method, m, instanceKlazz));
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Comparator' to 'java.util.Comparator'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java

            private int mopArrayIndex(final MetaMethod method, final String mopName) {
                int index = Arrays.binarySearch(mopMethods, mopName, CachedClass.CachedMethodComparatorWithString.INSTANCE);
                if (index >= 0) {
                    int from = index, to = index; // include overloads in search
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
        Class methodC = method.getDeclaringClass().getTheClass();

        if (!newMethodC.isAssignableFrom(instanceKlazz))
            return method;

```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
            return newMethod;

        if (newMethodC.isAssignableFrom(methodC)) {
            return method;
        }
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
        }

        if (methodC.isAssignableFrom(newMethodC)) {
            return newMethod;
        }
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java

        Class<?> instanceKlazz = instance.getClass();
        if (theClass != instanceKlazz && theClass.isAssignableFrom(instanceKlazz))
            instanceKlazz = theClass;

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.LinkedList'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
    protected static long handleMatches(long matchesDistance, LinkedList matches, Object method, long dist) {
        if (matches.isEmpty()) {
            matches.add(method);
            matchesDistance = dist;
        } else if (dist < matchesDistance) {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.LinkedList'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
            matchesDistance = dist;
            matches.clear();
            matches.add(method);
        } else if (dist == matchesDistance) {
            matches.add(method);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.LinkedList'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
            matches.add(method);
        } else if (dist == matchesDistance) {
            matches.add(method);
        }
        return matchesDistance;
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
            if (Modifier.isFinal(modifiers)) {
                if (mapInstance) { // GROOVY-8065
                    ((Map) object).put(name, newValue);
                    return;
                }
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
        //------------------------------------------------------------------
        if (isMap && !isStatic) {
            ((Map) object).put(name, newValue);
            return;
        }
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
                (arguments.length == 2 && arguments[1] instanceof Map &&
                        theClass.getEnclosingClass() != null &&
                        theClass.getEnclosingClass().isAssignableFrom(argTypes[0]))) {
            res = retrieveNamedArgCompatibleConstructor(argTypes, arguments);
        }
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
            addFields(iclass, iPropertyIndex);
            for (CachedClass superClass : superClasses) {
                if (!iclass.getTheClass().isAssignableFrom(superClass.getTheClass())) continue;
                LinkedHashMap<String, MetaProperty> sPropertyIndex = classPropertyIndex.computeIfAbsent(superClass, k -> new LinkedHashMap<>());
                copyNonPrivateFields(iPropertyIndex, sPropertyIndex, null);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.lang.Iterable'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
                createMetaBeanProperty(target, propName, isGetter, (MetaMethod) propertyMethods);
            } else {
                for (MetaMethod m : (Iterable<MetaMethod>) propertyMethods) {
                    createMetaBeanProperty(target, propName, isGetter, m);
                }
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
                (arguments.length == 2 && arguments[1] instanceof Map &&
                        theClass.getEnclosingClass() != null &&
                        theClass.getEnclosingClass().isAssignableFrom(argTypes[0]))) {
            constructor = (CachedConstructor)  retrieveNamedArgCompatibleConstructor(argTypes, arguments);
            if (constructor != null) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
        final Object o = getMethods(getTheClass(), name, false);
        if (o instanceof FastArray) {
            return ((FastArray) o).toList();
        }
        return Collections.<MetaMethod>singletonList((MetaMethod) o);
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
                // if the owner is a class and the method closure can be related to some instance method(s)
                // try to invoke method with adjusted arguments -- first argument is instance of owner type
                if (arguments.length > 0 && ownerClass.isAssignableFrom(arguments[0].getClass())
                        && (Boolean) object.getProperty(MethodClosure.ANY_INSTANCE_METHOD_EXISTS)) {
                    try {
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
                }
                for (CategoryMethod cm : used) {
                    if (!cm.getDeclaringClass().getTheClass().isAssignableFrom(sender))
                        continue;
                    filterMatchingMethodForCategory(arr, cm);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
                        matchingMethods = method;
                    } else if (matchingMethods instanceof ArrayList) {
                        ((ArrayList) matchingMethods).add(method);
                    } else {
                        List arr = new ArrayList(4);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
                    } else {
                        List arr = new ArrayList(4);
                        arr.add(matchingMethods);
                        arr.add(method);
                        matchingMethods = arr;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
                        List arr = new ArrayList(4);
                        arr.add(matchingMethods);
                        arr.add(method);
                        matchingMethods = arr;
                    }
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java

        CachedConstructor constructor = createCachedConstructor(arguments);
        List l = new ArrayList(constructors.toList());
        Comparator comp = (arg0, arg1) -> {
            CachedConstructor c0 = (CachedConstructor) arg0;
```

### UNCHECKED_WARNING
Unchecked call to 'sort(Comparator)' as a member of raw type 'java.util.List'
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
            return descriptor0.compareTo(descriptor1);
        };
        l.sort(comp);
        int found = -1;
        for (int i = 0, n = l.size(); i < n; i++) {
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java

    private static Object continueCastOnCollection(final Object object, final Class type) {
        if (object instanceof Collection && type.isAssignableFrom(LinkedHashSet.class)) {
            return new LinkedHashSet((Collection) object);
        }
```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashSet(Collection)' as a member of raw type 'java.util.LinkedHashSet'
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java
    private static Object continueCastOnCollection(final Object object, final Class type) {
        if (object instanceof Collection && type.isAssignableFrom(LinkedHashSet.class)) {
            return new LinkedHashSet((Collection) object);
        }

```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java

        Supplier<Collection> newCollection = () -> {
            if (type.isAssignableFrom(ArrayList.class) && Modifier.isAbstract(type.getModifiers())) {
                return new ArrayList();
            } else if (type.isAssignableFrom(LinkedHashSet.class) && Modifier.isAbstract(type.getModifiers())) {
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java
            if (type.isAssignableFrom(ArrayList.class) && Modifier.isAbstract(type.getModifiers())) {
                return new ArrayList();
            } else if (type.isAssignableFrom(LinkedHashSet.class) && Modifier.isAbstract(type.getModifiers())) {
                return new LinkedHashSet();
            } else {
```

### UNCHECKED_WARNING
Unchecked call to 'getDeclaredConstructor(Class...)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java
            } else {
                try {
                    return (Collection) type.getDeclaredConstructor().newInstance();
                } catch (Exception e) {
                    throw new GroovyCastException("Could not instantiate instance of: " + type.getName() + ". Reason: " + e);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Collection'
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java
            int length = Array.getLength(object);
            for (int i = 0; i < length; i += 1) {
                answer.add(Array.get(object, i));
            }
            return answer;
```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.Collection'
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java
        if (object instanceof BaseStream || object instanceof Optional) {
            Collection answer = newCollection.get();
            answer.addAll(asCollection(object));
            return answer;
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.stream.BaseStream' to 'java.util.stream.BaseStream'
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java
            return arrayAsCollection(value);
        } else if (value instanceof BaseStream) {
            return StreamGroovyMethods.toList((BaseStream) value);
        } else if (value instanceof String || value instanceof GString) {
            return StringGroovyMethods.toList((CharSequence) value);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java
                item = primitiveArrayToList(item);
            }
            list.add(item);
        }
        return list;
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java

    public static Object asArray(final Object object, final Class type) {
        if (type.isAssignableFrom(object.getClass())) {
            return object;
        }
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java

        final Class aClass = object.getClass();
        if (type == aClass || type.isAssignableFrom(aClass)) {
            return object;
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java
            return asArray(object, type);
        } else if (type.isEnum()) {
            return ShortTypeHandling.castToEnum(object, type);
        } else if (Collection.class.isAssignableFrom(type)) {
            return continueCastOnCollection(object, type);
```

### UNCHECKED_WARNING
Unchecked assignment: '? extends ? extends U' to 'U'
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/provider/collection/runtime/Window.java`
#### Snippet
```java
                : binarySearch(listWithIndex, currentRecord, WindowImpl.makeComparator(WindowImpl.composeOrders(orderList)).thenComparing(Tuple2::getV2));
        int index = tmpIndex >= 0 ? tmpIndex : -tmpIndex - 1;
        U value = null == order ? null : order.getKeyExtractor().apply(currentRecord.getV1());

        RowBound validRowBound = WindowImpl.getValidRowBound(windowDefinition, index, value, listWithIndex);
```

### UNCHECKED_WARNING
Unchecked call to 'PartitionImpl(Iterable)' as a member of raw type 'org.apache.groovy.ginq.provider.collection.runtime.PartitionImpl'
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/provider/collection/runtime/Partition.java`
#### Snippet
```java
     */
    @SuppressWarnings("rawtypes")
    Partition EMPTY_PARTITION = new PartitionImpl(Collections.emptyList());

    /**
```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.groovy.ginq.provider.collection.runtime.Partition' to 'org.apache.groovy.ginq.provider.collection.runtime.Partition'
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/provider/collection/runtime/Partition.java`
#### Snippet
```java
     */
    static <T> Partition<T> emptyPartition() {
        return (Partition<T>) EMPTY_PARTITION;
    }
}
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.groovy.ginq.provider.collection.runtime.Queryable.Order\[\]' to 'org.apache.groovy.ginq.provider.collection.runtime.Queryable.Order...'
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/provider/collection/runtime/Queryable.java`
#### Snippet
```java
     */
    default <U extends Comparable<? super U>> Queryable<T> orderBy(List<? extends Order<? super T, ? extends U>> orders) {
        return orderBy(orders.toArray(Order.EMPTY_ARRAY));
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.apache.groovy.ginq.provider.collection.runtime.Queryable' to 'org.apache.groovy.ginq.provider.collection.runtime.Queryable'
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/provider/collection/runtime/Queryable.java`
#### Snippet
```java
     */
    static <T> Queryable<T> emptyQueryable() {
        return (Queryable<T>) EMPTY_QUERYABLE;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: '? extends U' to 'U'
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/provider/collection/runtime/WindowImpl.java`
#### Snippet
```java
        } else if (null != windowDefinition.range() && null != windowDefinition.orderBy()) {
            ValueBound<? extends U> valueBound = windowDefinition.range();
            U lower = valueBound.getLower();
            U upper = valueBound.getUpper();
            if (value instanceof Number && (lower instanceof Number || null == lower) && (upper instanceof Number || null == upper)) {
```

### UNCHECKED_WARNING
Unchecked assignment: '? extends U' to 'U'
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/provider/collection/runtime/WindowImpl.java`
#### Snippet
```java
            ValueBound<? extends U> valueBound = windowDefinition.range();
            U lower = valueBound.getLower();
            U upper = valueBound.getUpper();
            if (value instanceof Number && (lower instanceof Number || null == lower) && (upper instanceof Number || null == upper)) {
                final List<Order<? super T, ? extends U>> orderList = windowDefinition.orderBy();
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/provider/collection/runtime/WindowImpl.java`
#### Snippet
```java
        this.currentRecord = currentRecord;
        this.order = order;
        this.comparator = null == order ? null : makeComparator(order);
        this.index = index;
        this.value = value;
```

### UNCHECKED_WARNING
Unchecked assignment: '? extends ? extends U' to 'U'
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/provider/collection/runtime/WindowImpl.java`
#### Snippet
```java
    static <T, U extends Comparable<? super U>> List<Order<Tuple2<T, Long>, U>> composeOrders(List<Queryable.Order<? super T, ? extends U>> orderList) {
        return orderList.stream()
                .map(order -> new Order<Tuple2<T, Long>, U>(t -> order.getKeyExtractor().apply(t.getV1()), order.isAsc(), order.isNullsLast()))
                .collect(Collectors.toList());
    }
```

### UNCHECKED_WARNING
Unchecked call to 'getMethod(String, Class...)' as a member of raw type 'java.lang.Class'
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/transform/GinqASTTransformation.java`
#### Snippet
```java
    private static Object getDefaultOptionValue(String optionName) {
        try {
            return GQ_CLASS_NODE.getTypeClass().getMethod(optionName).getDefaultValue();
        } catch (NoSuchMethodException e) {
            throw new GroovyBugError("Unknown GINQ option: " + optionName, e);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'groovy.lang.Tuple3'
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/provider/collection/runtime/QueryableCollection.java`
#### Snippet
```java
    @Override
    public <U extends Comparable<? super U>> Window<T> over(Tuple2<T, Long> currentRecord, WindowDefinition<T, U> windowDefinition) {
        final Tuple3<String, String, String> idTuple = (Tuple3<String, String, String>) windowDefinition.getId(); // (partitionId, orderId, windowDefinitionId)
        final String partitionId = idTuple.getV1();

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.groovy.ginq.provider.collection.runtime.Queryable.Order\[\]' to 'org.apache.groovy.ginq.provider.collection.runtime.Queryable.Order...'
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/provider/collection/runtime/QueryableCollection.java`
#### Snippet
```java

    protected static <T, U extends Comparable<? super U>> Comparator<T> makeComparator(List<? extends Order<? super T, ? extends U>> orders) {
        return makeComparator(orders.toArray(Order.EMPTY_ARRAY));
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'groovy.lang.Tuple2' to 'T'
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/provider/collection/runtime/QueryableCollection.java`
#### Snippet
```java
                this.makeReusable();
                if (0 == this.count()) {
                    stream = Stream.of((T) tuple(NULL, EMPTY_QUERYABLE)).map((T t) -> mapper.apply(t, this));
                }
            }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'U'. Reason: '((CompletableFuture) u)' has raw type, so result of get is erased
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/provider/collection/runtime/QueryableCollection.java`
#### Snippet
```java
                    boolean interrupted = false;
                    try {
                        return (U) ((CompletableFuture) u).get();
                    } catch (InterruptedException | ExecutionException ex) {
                        if (ex instanceof InterruptedException) interrupted = true;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Enum' to 'T'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharSequenceValue.java`
#### Snippet
```java
    public static <T extends Enum> T toEnum(Class<T> cls, String value) {
        try {
            return (T) Enum.valueOf(cls, value);
        } catch (Exception ex) {
            return (T) Enum.valueOf(cls, value.toUpperCase().replace('-', '_'));
```

### UNCHECKED_WARNING
Unchecked method 'valueOf(Class, String)' invocation
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharSequenceValue.java`
#### Snippet
```java
    public static <T extends Enum> T toEnum(Class<T> cls, String value) {
        try {
            return (T) Enum.valueOf(cls, value);
        } catch (Exception ex) {
            return (T) Enum.valueOf(cls, value.toUpperCase().replace('-', '_'));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Enum' to 'T'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharSequenceValue.java`
#### Snippet
```java
            return (T) Enum.valueOf(cls, value);
        } catch (Exception ex) {
            return (T) Enum.valueOf(cls, value.toUpperCase().replace('-', '_'));
        }
    }
```

### UNCHECKED_WARNING
Unchecked method 'valueOf(Class, String)' invocation
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharSequenceValue.java`
#### Snippet
```java
            return (T) Enum.valueOf(cls, value);
        } catch (Exception ex) {
            return (T) Enum.valueOf(cls, value.toUpperCase().replace('-', '_'));
        }
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.ArrayList'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserUsingCharacterSource.java`
#### Snippet
```java
            }

            list = new ArrayList();

            do {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/LazyMap.java`
#### Snippet
```java
    public void putAll(Map m) {
        buildIfNeeded();
        map.putAll(m);
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'V\[\]'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/LazyMap.java`
#### Snippet
```java
        Object newArray = Array.newInstance(array.getClass().getComponentType(), array.length * 2);
        System.arraycopy(array, 0, newArray, 0, array.length);
        return (V[]) newArray;
    }
}
```

### UNCHECKED_WARNING
Unchecked call to 'LinkedHashMap(Map)' as a member of raw type 'java.util.LinkedHashMap'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/LazyMap.java`
#### Snippet
```java
                return ((LinkedHashMap) map).clone();
            } else {
                return new LinkedHashMap(this);
            }
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.ArrayList'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserCharArray.java`
#### Snippet
```java
            }

            list = new ArrayList();

            while (this.hasMore()) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.groovy.json.internal.ValueMap' to 'java.util.Map'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonFastParser.java`
#### Snippet
```java

        ValueMap map = useValues ? new ValueMapImpl() : new LazyValueMap(lazyChop);
        Value value = new ValueContainer(map);

        objectLoop:
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonFastParser.java`
#### Snippet
```java
        if (__currentChar == ']') {
            __index++;
            return new ValueContainer(new ArrayList());
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'org.apache.groovy.json.internal.ValueMap' to 'java.util.Map'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserLax.java`
#### Snippet
```java

        ValueMap map = useValues ? new ValueMapImpl() : new LazyValueMap(lazyChop);
        Value value = new ValueContainer(map);

        skipWhiteSpace();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserLax.java`
#### Snippet
```java
        if (__currentChar == ']') {
            __index++;
            return new ValueContainer(new ArrayList());
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `subprojects/groovy-json/src/main/java/groovy/json/JsonSlurper.java`
#### Snippet
```java
                reader = ResourceGroovyMethods.newReader(url, charset);
            } else {
                reader = ResourceGroovyMethods.newReader(url, params, charset);
            }
            return parse(reader);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `subprojects/groovy-json/src/main/java/groovy/json/JsonSlurper.java`
#### Snippet
```java
     */
    public Object parse(URL url, Map params) {
        return parseURL(url, params);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `subprojects/groovy-json/src/main/java/groovy/json/JsonSlurperClassic.java`
#### Snippet
```java

            if (currentToken.getType() == OPEN_CURLY) {
                content.add(parseObject(lexer));
            } else if (currentToken.getType() == OPEN_BRACKET) {
                content.add(parseArray(lexer));
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `subprojects/groovy-json/src/main/java/groovy/json/JsonSlurperClassic.java`
#### Snippet
```java
                content.add(parseObject(lexer));
            } else if (currentToken.getType() == OPEN_BRACKET) {
                content.add(parseArray(lexer));
            } else if (currentToken.getType().ordinal() >= NULL.ordinal()) {
                content.add(currentToken.getValue());
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `subprojects/groovy-json/src/main/java/groovy/json/JsonSlurperClassic.java`
#### Snippet
```java
                content.add(parseArray(lexer));
            } else if (currentToken.getType().ordinal() >= NULL.ordinal()) {
                content.add(currentToken.getValue());
            } else if (currentToken.getType() == CLOSE_BRACKET) {
                return content;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `subprojects/groovy-json/src/main/java/groovy/json/JsonSlurperClassic.java`
#### Snippet
```java
                reader = ResourceGroovyMethods.newReader(url);
            } else {
                reader = ResourceGroovyMethods.newReader(url, params);
            }
            return parse(reader);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `subprojects/groovy-json/src/main/java/groovy/json/JsonSlurperClassic.java`
#### Snippet
```java

            if (currentToken.getType() == OPEN_CURLY) {
                content.put(mapKey, parseObject(lexer));
            } else if (currentToken.getType() == OPEN_BRACKET) {
                content.put(mapKey, parseArray(lexer));
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `subprojects/groovy-json/src/main/java/groovy/json/JsonSlurperClassic.java`
#### Snippet
```java
                content.put(mapKey, parseObject(lexer));
            } else if (currentToken.getType() == OPEN_BRACKET) {
                content.put(mapKey, parseArray(lexer));
            } else if (currentToken.getType().ordinal() >= NULL.ordinal()) {
                content.put(mapKey, currentToken.getValue());
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `subprojects/groovy-json/src/main/java/groovy/json/JsonSlurperClassic.java`
#### Snippet
```java
                content.put(mapKey, parseArray(lexer));
            } else if (currentToken.getType().ordinal() >= NULL.ordinal()) {
                content.put(mapKey, currentToken.getValue());
            } else {
                throw new JsonException(
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `subprojects/groovy-json/src/main/java/groovy/json/JsonSlurperClassic.java`
#### Snippet
```java
                reader = ResourceGroovyMethods.newReader(url, charset);
            } else {
                reader = ResourceGroovyMethods.newReader(url, params, charset);
            }
            return parse(reader);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `subprojects/groovy-swing/src/main/groovy/groovy/swing/impl/ClosureRenderer.java`
#### Snippet
```java
                    tcr = table.getDefaultRenderer(table.getColumnClass(column));
                }
                children.add(tcr.getTableCellRendererComponent(table, value, selected, focused, row, column));
            } else if (tree != null) {
                TreeCellRenderer tcr;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `subprojects/groovy-swing/src/main/groovy/groovy/swing/impl/ClosureRenderer.java`
#### Snippet
```java
                TreeCellRenderer tcr;
                tcr = new DefaultTreeCellRenderer();
                children.add(tcr.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, focused));
            } else if (list != null) {
                ListCellRenderer lcr = (ListCellRenderer) UIManager.get("List.cellRenderer");
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `subprojects/groovy-swing/src/main/groovy/groovy/swing/impl/ClosureRenderer.java`
#### Snippet
```java
                    lcr = new DefaultListCellRenderer();
                }
                children.add(lcr.getListCellRendererComponent(list, value, row, selected, focused));
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'getListCellRendererComponent(JList, E, int, boolean, boolean)' as a member of raw type 'javax.swing.ListCellRenderer'
in `subprojects/groovy-swing/src/main/groovy/groovy/swing/impl/ClosureRenderer.java`
#### Snippet
```java
                    lcr = new DefaultListCellRenderer();
                }
                children.add(lcr.getListCellRendererComponent(list, value, row, selected, focused));
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'isAssignableFrom(Class)' as a member of raw type 'java.lang.Class'
in `subprojects/groovy-swing/src/main/groovy/groovy/swing/binding/AbstractSyntheticBinding.java`
#### Snippet
```java
        }
        Object bean = ((PropertyBinding) source).getBean();
        if ((bean == null) || !klass.isAssignableFrom(bean.getClass())) {
            throw new IllegalArgumentException("SourceBean must be a " + klass.getName());
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.security.PrivilegedExceptionAction' to 'java.security.PrivilegedExceptionAction'
in `subprojects/groovy-xml/src/main/java/groovy/xml/FactorySupport.java`
#### Snippet
```java
    static Object createFactory(PrivilegedExceptionAction action) throws ParserConfigurationException {
        try {
            return java.security.AccessController.doPrivileged(action);
        } catch (java.security.PrivilegedActionException pae) {
            Exception e = pae.getException();
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `subprojects/groovy-xml/src/main/java/groovy/xml/XmlParser.java`
#### Snippet
```java
        String text = bodyText.toString();
        if (!trimWhitespace && keepIgnorableWhitespace) {
            parent.children().add(text);
        } else if (!trimWhitespace && text.trim().length() > 0) {
            parent.children().add(text);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `subprojects/groovy-xml/src/main/java/groovy/xml/XmlParser.java`
#### Snippet
```java
            parent.children().add(text);
        } else if (!trimWhitespace && text.trim().length() > 0) {
            parent.children().add(text);
        } else if (text.trim().length() > 0) {
            parent.children().add(text.trim());
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `subprojects/groovy-xml/src/main/java/groovy/xml/XmlParser.java`
#### Snippet
```java
            parent.children().add(text);
        } else if (text.trim().length() > 0) {
            parent.children().add(text.trim());
        }
        bodyText = new StringBuilder();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `subprojects/groovy-xml/src/main/java/groovy/xml/NamespaceBuilderSupport.java`
#### Snippet
```java
    public NamespaceBuilderSupport(BuilderSupport builder, Map nsMap) {
        this(builder);
        this.nsMap = nsMap;
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Iterator' to 'java.util.Iterator'. Reason: 'attributes.entrySet()' has raw type, so result of iterator is erased
in `subprojects/groovy-xml/src/main/java/groovy/xml/NamespaceBuilderSupport.java`
#### Snippet
```java
        // detect namespace declared on the added node like xmlns:foo="http:/foo"
    	Map attributes = findAttributes(args);
    	for (Iterator<Map.Entry> iter = attributes.entrySet().iterator(); iter.hasNext();) {
    		Map.Entry entry = iter.next();
    		String key = String.valueOf(entry.getKey());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `subprojects/groovy-xml/src/main/java/groovy/xml/NamespaceBuilderSupport.java`
#### Snippet
```java

    public NamespaceBuilderSupport declareNamespace(Map nsMap) {
        this.nsMap = nsMap;
        return this;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `subprojects/groovy-xml/src/main/java/groovy/xml/DOMBuilder.java`
#### Snippet
```java
            if ("xmlns".equals(attrName)) {
                if (value instanceof Map) {
                    appendNamespaceAttributes(element, (Map) value);
                } else if (value instanceof String) {
                    setStringNS(element, "", value);
```

### UNCHECKED_WARNING
Unchecked call to 'HashMap(Map)' as a member of raw type 'java.util.HashMap'
in `subprojects/groovy-xml/src/main/java/org/apache/groovy/xml/tools/DomToGroovy.java`
#### Snippet
```java
        String prefix = element.getPrefix();
        if (prefix != null && prefix.length() > 0 && !namespaces.containsKey(prefix)) {
            answer = new HashMap(namespaces);
            defineNamespace(answer, prefix, element.getNamespaceURI());
        }
```

### UNCHECKED_WARNING
Unchecked call to 'HashMap(Map)' as a member of raw type 'java.util.HashMap'
in `subprojects/groovy-xml/src/main/java/org/apache/groovy/xml/tools/DomToGroovy.java`
#### Snippet
```java
            if (prefix != null && prefix.length() > 0 && !namespaces.containsKey(prefix)) {
                if (answer == null) {
                    answer = new HashMap(namespaces);
                }
                defineNamespace(answer, prefix, attribute.getNamespaceURI());
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `subprojects/groovy-xml/src/main/java/org/apache/groovy/xml/tools/DomToGroovy.java`
#### Snippet
```java

    protected void defineNamespace(Map namespaces, String prefix, String uri) {
        namespaces.put(prefix, uri);
        if (!prefix.equals("xmlns") && !prefix.equals("xml")) {
            printIndent();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map.Entry' to 'java.util.Map.Entry'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/NamespaceAwareHashMap.java`
#### Snippet
```java
        for (Object o : m.entrySet())
            if (o instanceof Map.Entry) {
                Map.Entry<String, String> e = (Map.Entry) o;
                put(e.getKey(), e.getValue());
            }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/Attributes.java`
#### Snippet
```java
        final List result = new ArrayList();
        while (iter.hasNext()) {
            result.add(iter.next());
        }
        return result;
```

### UNCHECKED_WARNING
Unchecked call to 'putAll(Map)' as a member of raw type 'java.util.Map'
in `subprojects/groovy-xml/src/main/java/groovy/xml/streamingmarkupsupport/Builder.java`
#### Snippet
```java

        public Built(final Closure root, final Map namespaceTagMap) {
            this.namespaceSpecificTags.putAll(namespaceTagMap);

            this.root = (Closure)root.clone();
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `subprojects/groovy-xml/src/main/java/groovy/xml/streamingmarkupsupport/Builder.java`
#### Snippet
```java
            final Closure dg = ((Closure) value.get(1)).asWritable();

            this.namespaceMethodMap.put(key, new Object[] { value.get(0), dg, fettleMethodMap(dg, (Map) value.get(2)) });
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `subprojects/groovy-xml/src/main/java/groovy/xml/streamingmarkupsupport/Builder.java`
#### Snippet
```java

            if ((value instanceof Closure)) {
                newMethodMap.put(key, value);
            } else {
                newMethodMap.put(key, defaultGenerator.curry((Object[]) value));
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `subprojects/groovy-xml/src/main/java/groovy/xml/streamingmarkupsupport/Builder.java`
#### Snippet
```java
                newMethodMap.put(key, value);
            } else {
                newMethodMap.put(key, defaultGenerator.curry((Object[]) value));
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'push(E)' as a member of raw type 'java.util.Stack'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/Node.java`
#### Snippet
```java
                c.setDelegate(builder);
                c.call(new Object[]{result});
                Node.this.replacementNodeStack.push(this);
            }
        });
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/Node.java`
#### Snippet
```java
    protected void appendNode(final Object newValue, final GPathResult result) {
        if (newValue instanceof Closure) {
            this.children.add(new ReplacementNode() {
                @Override
                public void build(final GroovyObject builder, final Map namespaceMap, final Map<String, String> namespaceTagHints) {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/Node.java`
#### Snippet
```java
            });
        } else {
            this.children.add(newValue);
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/Node.java`
#### Snippet
```java

                final Map newNamespace = new HashMap();
                newNamespace.put(tag, namespaceURI);
                builder.getProperty("mkp");
                builder.invokeMethod("declareNamespace", new Object[]{newNamespace});
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/Node.java`
#### Snippet
```java
                builder.getProperty("mkp");
                builder.invokeMethod("declareNamespace", new Object[]{newNamespace});
                newTags.add(tag);
            }
        }
```

### UNCHECKED_WARNING
Unchecked call to 'HashMap(Map)' as a member of raw type 'java.util.HashMap'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/Node.java`
#### Snippet
```java
                    builder.invokeMethod(this.name, new Object[]{this.attributes, rest});
                } else {
                    final Map attributesWithNamespaces = new HashMap(this.attributes);
                    for (Object key : this.attributes.keySet()) {
                        final Object attributeNamespaceURI = this.attributeNamespaces.get(key);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/Node.java`
#### Snippet
```java
                        final Object attributeNamespaceURI = this.attributeNamespaces.get(key);
                        if (attributeNamespaceURI != null) {
                            attributesWithNamespaces.put(getTagFor(attributeNamespaceURI, current, pending, namespaceMap, namespaceTagHints, newTags, builder) +
                                    "$" + key, attributesWithNamespaces.remove(key));
                        }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/Node.java`
#### Snippet
```java
     */
    public void addChild(final Object child) {
        this.children.add(child);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'push(E)' as a member of raw type 'java.util.Stack'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/Node.java`
#### Snippet
```java

    public void replaceNode(final Closure replacementClosure, final GPathResult result) {
        this.replacementNodeStack.push(new ReplacementNode() {
            @Override
            public void build(final GroovyObject builder, final Map namespaceMap, final Map<String, String> namespaceTagHints) {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/Node.java`
#### Snippet
```java
    protected void replaceBody(final Object newValue) {
        this.children.clear();
        this.children.add(newValue);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/GPathResult.java`
#### Snippet
```java
        final List result = new LinkedList();
        while (iter.hasNext()) {
            result.add(new NodeChild((Node) iter.next(), this.parent, this.namespacePrefix, this.namespaceTagHints));
        }
        return result;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/GPathResult.java`
#### Snippet
```java
     */
    public Object getAt(final IntRange range) {
        return DefaultGroovyMethods.getAt(list(), range);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/GPathResult.java`
#### Snippet
```java
                    final NodeChild child = (NodeChild) o;

                    child.attributes().put(property.substring(1), newValue);
                }
            }
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/GPathResult.java`
#### Snippet
```java
            // we are the top of the tree
            this.parent = this;
            this.namespaceMap.put("xml", "http://www.w3.org/XML/1998/namespace");  // The XML namespace is always defined
        } else {
            this.parent = parent;
```

### UNCHECKED_WARNING
Unchecked call to 'putAll(Map)' as a member of raw type 'java.util.Map'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/GPathResult.java`
#### Snippet
```java
        } else {
            this.parent = parent;
            this.namespaceMap.putAll(parent.namespaceMap);
        }
        this.name = name;
```

### UNCHECKED_WARNING
Unchecked call to 'putAll(Map)' as a member of raw type 'java.util.Map'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/GPathResult.java`
#### Snippet
```java
     */
    public GPathResult declareNamespace(final Map newNamespaceMapping) {
        this.namespaceMap.putAll(newNamespaceMapping);
        return this;
    }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/GPathResult.java`
#### Snippet
```java
                    if (this.iter.hasNext()) {
                        final GPathResult node = (GPathResult) this.iter.next();
                        this.list.add(node);
                        this.list.add(this.iter);
                        children.add(node.children());
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/GPathResult.java`
#### Snippet
```java
                        final GPathResult node = (GPathResult) this.iter.next();
                        this.list.add(node);
                        this.list.add(this.iter);
                        children.add(node.children());
                    } else {
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/GPathResult.java`
#### Snippet
```java
                        this.list.add(node);
                        this.list.add(this.iter);
                        children.add(node.children());
                    } else {
                        List nextLevel = new ArrayList();
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/GPathResult.java`
#### Snippet
```java
                            GPathResult next = (GPathResult) child;
                            for (Object o : next) {
                                nextLevel.add(o);
                            }
                        }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/GPathResult.java`
#### Snippet
```java
                while (this.iter.hasNext()) {
                    final GPathResult node = (GPathResult) this.iter.next();
                    this.list.add(node);
                    this.stack.push(this.iter);
                    this.iter = node.children().iterator();
```

### UNCHECKED_WARNING
Unchecked call to 'push(E)' as a member of raw type 'java.util.Stack'
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/GPathResult.java`
#### Snippet
```java
                    final GPathResult node = (GPathResult) this.iter.next();
                    this.list.add(node);
                    this.stack.push(this.iter);
                    this.iter = node.children().iterator();
                }
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `subprojects/groovy-xml/src/main/java/groovy/xml/streamingmarkupsupport/BaseMarkupBuilder.java`
#### Snippet
```java
        {

            namespaces.put("xml", "http://www.w3.org/XML/1998/namespace");             // built in namespace
            namespaces.put("mkp", "http://www.codehaus.org/Groovy/markup/keywords");   // pseudo namespace for markup keywords

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `subprojects/groovy-xml/src/main/java/groovy/xml/streamingmarkupsupport/BaseMarkupBuilder.java`
#### Snippet
```java

            namespaces.put("xml", "http://www.w3.org/XML/1998/namespace");             // built in namespace
            namespaces.put("mkp", "http://www.codehaus.org/Groovy/markup/keywords");   // pseudo namespace for markup keywords

            specialProperties.put("out", new OutputSink("out") {
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `subprojects/groovy-xml/src/main/java/groovy/xml/streamingmarkupsupport/BaseMarkupBuilder.java`
#### Snippet
```java
            namespaces.put("mkp", "http://www.codehaus.org/Groovy/markup/keywords");   // pseudo namespace for markup keywords

            specialProperties.put("out", new OutputSink("out") {
                @Override
                public Object leftShift(final Object value) {
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `subprojects/groovy-xml/src/main/java/groovy/xml/streamingmarkupsupport/BaseMarkupBuilder.java`
#### Snippet
```java
                }
            });
            specialProperties.put("unescaped", new OutputSink("unescaped") {
                @Override
                public Object leftShift(final Object value) {
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `subprojects/groovy-xml/src/main/java/groovy/xml/streamingmarkupsupport/BaseMarkupBuilder.java`
#### Snippet
```java
                }
            });
            specialProperties.put("namespaces", new OutputSink("namespaces") {
                @Override
                public Object leftShift(final Object value) {
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `subprojects/groovy-xml/src/main/java/groovy/xml/streamingmarkupsupport/BaseMarkupBuilder.java`
#### Snippet
```java
                }
            });
            specialProperties.put("pi", new OutputSink("pi") {
                @Override
                public Object leftShift(final Object value) {
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `subprojects/groovy-xml/src/main/java/groovy/xml/streamingmarkupsupport/BaseMarkupBuilder.java`
#### Snippet
```java
                }
            });
            specialProperties.put("comment", new OutputSink("comment") {
                @Override
                public Object leftShift(final Object value) {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `src/main/java/org/apache/groovy/util/ScriptRunner.java`
#### Snippet
```java
    public static void runScript(String cp) {
        try {
            runScript(new File(ScriptRunner.class.getResource(cp).toURI()));
        } catch (URISyntaxException e) {
            throw new GroovyRuntimeException("Failed to run script: " + cp, e);
```

### DataFlowIssue
Argument `clazzRef.get()` might be null
in `src/main/java/org/apache/groovy/internal/util/ReevaluatingReference.java`
#### Snippet
```java
    private T replacePayLoad() {
        T payload = valueSupplier.get();
        MethodHandle ref = MethodHandles.constant(clazzRef.get(), payload);
        SwitchPoint sp = validationSupplier.apply(payload);
        returnRef = sp.guardWithTest(ref, FALLBACK_HANDLE);
```

### DataFlowIssue
Dereference of `sizeExpressions` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/ast/expr/ArrayExpression.java`
#### Snippet
```java
        }
        if (!hasInitializer()) {
            for (Object item : sizeExpressions) {
                if (!(item instanceof Expression)) {
                    throw new ClassCastException("Item: " + item + " is not an Expression");
```

### DataFlowIssue
Argument `sc` might be null
in `src/main/java/org/codehaus/groovy/ast/tools/WideningCategories.java`
#### Snippet
```java
            do {
                sc = getNextSuperClass(source, target);
                if (GenericsUtils.hasUnresolvedGenerics(sc)) {
                    sc = GenericsUtils.correctToGenericsSpecRecurse(GenericsUtils.createGenericsSpec(source), sc);
                }
```

### DataFlowIssue
Method invocation `invoke` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/tools/GroovyStarter.java`
#### Snippet
```java
        }
        try {
            m.invoke(null, new Object[]{mainArgs});
        } catch (ReflectiveOperationException | IllegalArgumentException e3) {
            exit(e3);
```

### DataFlowIssue
Argument `cn` might be null
in `src/main/java/org/codehaus/groovy/ast/tools/GenericsUtils.java`
#### Snippet
```java
            do { // walk target type hierarchy towards hint
                cn = ClassHelper.getNextSuperClass(cn, hint);
                if (hasUnresolvedGenerics(cn)) {
                    gt = createGenericsSpec(hint);
                    extractSuperClassGenerics(hint, cn, gt);
```

### DataFlowIssue
Argument `assignProperties(System.getProperty(key))` might be null
in `src/main/java/org/codehaus/groovy/tools/LoaderConfiguration.java`
#### Snippet
```java
                    String params = line.substring(PROP_PREFIX.length()).trim();
                    String key = SystemUtil.setSystemPropertyFrom(params);
                    System.setProperty(key, assignProperties(System.getProperty(key)));
                } else if (line.startsWith(CONFIGSCRIPT_PREFIX)) {
                    String script = line.substring(CONFIGSCRIPT_PREFIX.length()).trim();
```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/tools/FileSystemCompiler.java`
#### Snippet
```java
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File value : files) {
                deleteRecursive(value);
            }
```

### DataFlowIssue
Argument `a` might be null
in `src/main/java/org/codehaus/groovy/control/CompilationUnit.java`
#### Snippet
```java
                ClassNode a = getClassNode(arg1.replace('/', '.'));
                ClassNode b = getClassNode(arg2.replace('/', '.'));
                return getCommonSuperClassNode(a,b).getName().replace('.','/');
            }
        };
```

### DataFlowIssue
Method invocation `getOuterClasses` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/control/ResolveVisitor.java`
#### Snippet
```java
        // anyway.

        List<ClassNode> outerClasses = currentClass.getOuterClasses();
        if (!outerClasses.isEmpty()) {
            // Since we have B and want to get A we start with the most
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/codehaus/groovy/runtime/StackTraceUtils.java`
#### Snippet
```java

    public static void printSanitizedStackTrace(Throwable t, PrintWriter p) {
        t = StackTraceUtils.sanitize(t);

        StackTraceElement[] trace = t.getStackTrace();
```

### DataFlowIssue
Array access `a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]` will produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/BytecodeInterface8.java`
#### Snippet
```java
            a[i]=v;
        } catch (Throwable t) {
            a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]=v;
        }
    }
```

### DataFlowIssue
Array access `a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]` will produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/BytecodeInterface8.java`
#### Snippet
```java
            return a[i];
        } catch (Throwable t) {
            return a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)];
        }
    }
```

### DataFlowIssue
Array access `a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]` will produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/BytecodeInterface8.java`
#### Snippet
```java
            return a[i];
        } catch (Throwable t) {
            return a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)];
        }
    }
```

### DataFlowIssue
Array access `a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]` will produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/BytecodeInterface8.java`
#### Snippet
```java
            return a[i];
        } catch (Throwable t) {
            return a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)];
        }
    }
```

### DataFlowIssue
Array access `a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]` will produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/BytecodeInterface8.java`
#### Snippet
```java
            a[i]=v;
        } catch (Throwable t) {
            a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]=v;
        }
    }
```

### DataFlowIssue
Array access `a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]` will produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/BytecodeInterface8.java`
#### Snippet
```java
            a[i]=v;
        } catch (Throwable t) {
            a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]=v;
        }
    }
```

### DataFlowIssue
Array access `a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]` will produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/BytecodeInterface8.java`
#### Snippet
```java
            a[i]=v;
        } catch (Throwable t) {
            a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]=v;
        }
    }
```

### DataFlowIssue
Array access `a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]` will produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/BytecodeInterface8.java`
#### Snippet
```java
            return a[i];
        } catch (Throwable t) {
            return a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)];
        }
    }
```

### DataFlowIssue
Array access `a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]` will produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/BytecodeInterface8.java`
#### Snippet
```java
            return a[i];
        } catch (Throwable t) {
            return a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)];
        }
    }
```

### DataFlowIssue
Array access `a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]` will produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/BytecodeInterface8.java`
#### Snippet
```java
            a[i]=v;
        } catch (Throwable t) {
            a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]=v;
        }
    }
```

### DataFlowIssue
Array access `a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]` will produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/BytecodeInterface8.java`
#### Snippet
```java
            a[i]=v;
        } catch (Throwable t) {
            a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]=v;
        }
    }
```

### DataFlowIssue
Array access `a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]` will produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/BytecodeInterface8.java`
#### Snippet
```java
            return a[i];
        } catch (Throwable t) {
            return a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)];
        }
    }
```

### DataFlowIssue
Array access `a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]` will produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/BytecodeInterface8.java`
#### Snippet
```java
            return a[i];
        } catch (Throwable t) {
            return a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)];
        }
    }
```

### DataFlowIssue
Array access `a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]` will produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/BytecodeInterface8.java`
#### Snippet
```java
            a[i]=v;
        } catch (Throwable t) {
            a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]=v;
        }
    }
```

### DataFlowIssue
Array access `a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]` will produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/BytecodeInterface8.java`
#### Snippet
```java
            return a[i];
        } catch (Throwable t) {
            return a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)];
        }
    }
```

### DataFlowIssue
Array access `a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]` will produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/BytecodeInterface8.java`
#### Snippet
```java
            return a[i];
        } catch (Throwable t) {
            return a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)];
        }
    }
```

### DataFlowIssue
Array access `a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]` will produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/BytecodeInterface8.java`
#### Snippet
```java
            a[i]=v;
        } catch (Throwable t) {
            a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]=v;
        }
    }
```

### DataFlowIssue
Array access `a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]` will produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/BytecodeInterface8.java`
#### Snippet
```java
            a[i]=v;
        } catch (Throwable t) {
            a[DefaultGroovyMethodsSupport.normaliseIndex(i,a.length)]=v;
        }
    }
```

### DataFlowIssue
Unboxing of `DefaultTypeTransformation.castToType(ch, Float.class)` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/dgmimpl/arrays/FloatArrayPutAtMetaMethod.java`
#### Snippet
```java
            if (newValue instanceof Character || newValue instanceof String || newValue instanceof GString) {
                Character ch = DefaultTypeTransformation.getCharFromSizeOneString(newValue);
                objects[index] = (Float) DefaultTypeTransformation.castToType(ch, Float.class);
            } else {
                objects[index] = ((Number) newValue).floatValue();
```

### DataFlowIssue
Unboxing of `DefaultTypeTransformation.castToType(ch, Double.class)` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/dgmimpl/arrays/DoubleArrayPutAtMetaMethod.java`
#### Snippet
```java
            if (newValue instanceof Character || newValue instanceof String || newValue instanceof GString) {
                Character ch = DefaultTypeTransformation.getCharFromSizeOneString(newValue);
                objects[index] = (Double) DefaultTypeTransformation.castToType(ch, Double.class);
            } else {
                objects[index] = ((Number) newValue).doubleValue();
```

### DataFlowIssue
Unboxing of `DefaultTypeTransformation.castToType(ch, Short.class)` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/dgmimpl/arrays/ShortArrayPutAtMetaMethod.java`
#### Snippet
```java
            if (newValue instanceof Character || newValue instanceof String || newValue instanceof GString) {
                Character ch = DefaultTypeTransformation.getCharFromSizeOneString(newValue);
                objects[index] = (Short) DefaultTypeTransformation.castToType(ch, Short.class);
            } else {
                objects[index] = ((Number) newValue).shortValue();
```

### DataFlowIssue
Unboxing of `DefaultTypeTransformation.castToType(ch, Long.class)` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/dgmimpl/arrays/LongArrayPutAtMetaMethod.java`
#### Snippet
```java
            if (newValue instanceof Character || newValue instanceof String || newValue instanceof GString) {
                Character ch = DefaultTypeTransformation.getCharFromSizeOneString(newValue);
                objects[index] = (Long) DefaultTypeTransformation.castToType(ch, Long.class);
            } else {
                objects[index] = ((Number) newValue).longValue();
```

### DataFlowIssue
Unboxing of `DefaultTypeTransformation.castToType(ch, Integer.class)` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/dgmimpl/arrays/IntegerArrayPutAtMetaMethod.java`
#### Snippet
```java
            if (newValue instanceof Character || newValue instanceof String || newValue instanceof GString) {
                Character ch = DefaultTypeTransformation.getCharFromSizeOneString(newValue);
                objects[index] = (Integer) DefaultTypeTransformation.castToType(ch, Integer.class);
            } else {
                objects[index] = ((Number) newValue).intValue();
```

### DataFlowIssue
Argument `asStream` might be null
in `src/main/java/org/codehaus/groovy/runtime/callsite/GroovySunClassLoader.java`
#### Snippet
```java
    private void loadAbstract(int parsingOptions) throws IOException {
        try (final InputStream asStream = GroovySunClassLoader.class.getClassLoader().getResourceAsStream(resName("org.codehaus.groovy.runtime.callsite.AbstractCallSite"))) {
            ClassReader reader = new ClassReader(asStream);
            final ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
            final ClassVisitor cv = new ClassVisitor(ASM_API_VERSION, cw) {
```

### DataFlowIssue
Argument `receiver` might be null
in `src/main/java/org/codehaus/groovy/runtime/callsite/PogoGetPropertySite.java`
#### Snippet
```java
    public CallSite acceptGroovyObjectGetProperty(Object receiver) {
        if (receiver == null || receiver.getClass() != aClass)
            return createGroovyObjectGetPropertySite(receiver);
        else
          return this;
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ClosureMetaClass.java`
#### Snippet
```java
                    invokeOnDelegate = delegate != closure;
                    invokeOnOwner = owner != closure;
                    ownerFirst = true;
                }
                break;
```

### DataFlowIssue
Dereference of `first` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/runtime/metaclass/ClosureMetaClass.java`
#### Snippet
```java
            }
        }
        throw first;
    }

```

### DataFlowIssue
Argument `variable` might be null
in `src/main/java/org/codehaus/groovy/classgen/VariableScopeVisitor.java`
#### Snippet
```java
        //TODO: change that to get the correct scope
        Variable variable = findVariableDeclaration(name);
        checkVariableContextAccess(variable, expression);
    }

```

### DataFlowIssue
Method invocation `call` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/classgen/asm/OptimizingStatementWriter.java`
#### Snippet
```java
        for (int i = 0, n = guards.length; i < n; i += 1) {
            if (meta.involvedTypes[i]) {
                guards[i].call(mv);
                mv.visitJumpInsn(IFEQ, slowPath);
            }
```

### DataFlowIssue
Method invocation `visitEnd` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/classgen/AsmClassGenerator.java`
#### Snippet
```java
            }
            visitAnnotationAttributes(an, av);
            av.visitEnd();
        }
    }
```

### DataFlowIssue
Method invocation `visitEnd` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/classgen/AsmClassGenerator.java`
#### Snippet
```java
            AnnotationVisitor av = getAnnotationVisitor(targetNode, an, visitor);
            visitAnnotationAttributes(an, av);
            av.visitEnd();
        }
    }
```

### DataFlowIssue
Method invocation `getParameters` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/classgen/asm/sc/StaticTypesMethodReferenceExpressionWriter.java`
#### Snippet
```java
                targetIsArgument = true; // ex: "string"::size
            }
        } else if (isVargs(methodRefMethod.getParameters())) {
            int mParameters = abstractMethod.getParameters().length;
            int nParameters = methodRefMethod.getParameters().length;
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/vmplugin/v9/Java9.java`
#### Snippet
```java
                    CompletableFuture.supplyAsync(() -> doFindClasses(URI.create("jrt:/modules/java.base/"), "java", javaPackages));
            try {
                URI gsLocation = DefaultGroovyMethods.getLocation(gcl.loadClass("groovy.lang.GroovySystem")).toURI();
                CompletableFuture<Map<String, Set<String>>> groovyDefaultImportsFuture1 =
                        CompletableFuture.supplyAsync(() -> doFindClasses(gsLocation, "groovy", groovyPackages));
```

### DataFlowIssue
Method invocation `toURI` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/vmplugin/v9/Java9.java`
#### Snippet
```java
                // in production environment, groovy-core classes, e.g. `GroovySystem`(java class) and `GrapeIvy`(groovy class) are all packaged in the groovy-core jar file,
                // but in Groovy development environment, groovy-core classes are distributed in different directories
                URI giLocation = DefaultGroovyMethods.getLocation(gcl.loadClass("groovy.grape.GrapeIvy")).toURI();
                CompletableFuture<Map<String, Set<String>>> groovyDefaultImportsFuture2 =
                        gsLocation.equals(giLocation)
```

### DataFlowIssue
Argument `temp` might be null
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
        T[] result = Arrays.copyOf(left, left.length + right.length);
        T[] temp = (T[]) DefaultTypeTransformation.castToType(right, left.getClass());
        System.arraycopy(temp, 0, result, left.length, temp.length);
        return result;
    }
```

### DataFlowIssue
Method invocation `phase` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/transform/ASTTransformationCollectorCodeVisitor.java`
#### Snippet
```java
        }

        CompilePhase specifiedCompilePhase = transformationClass.phase();
        if (specifiedCompilePhase.getPhaseNumber() < CompilePhase.SEMANTIC_ANALYSIS.getPhaseNumber()) {
            String error = annotation.getClassNode().getName() + " is defined to be run in compile phase " + specifiedCompilePhase + ". Local AST transformations must run in SEMANTIC_ANALYSIS or later!";
```

### DataFlowIssue
Argument `equals` might be null
in `src/main/java/org/codehaus/groovy/transform/EqualsAndHashCodeASTTransformation.java`
#### Snippet
```java
            // an existing generated method also takes precedence
            MethodNode equals = findDeclaredMethod(cNode, EQUALS, 1);
            if (AnnotatedNodeUtils.isGenerated(equals)) return;
        }
        if (hasExistingEquals && hasDeclaredMethod(cNode, UNDER_EQUALS, 1)) return;
```

### DataFlowIssue
Argument `is` might be null
in `src/main/java/org/codehaus/groovy/transform/stc/GroovyTypeCheckingExtensionSupport.java`
#### Snippet
```java
                GroovyShell shell = new GroovyShell(transformLoader, new Binding(), config);
                script = (TypeCheckingDSL) shell.parse(
                        new InputStreamReader(is, typeCheckingVisitor.getSourceUnit().getConfiguration().getSourceEncoding())
                );
            } catch (CompilationFailedException e) {
```

### DataFlowIssue
Argument `sourceExceptions` might be null
in `src/main/java/org/codehaus/groovy/transform/trait/TraitComposer.java`
#### Snippet
```java
    private static ClassNode[] copyExceptions(final ClassNode[] sourceExceptions) {
        ClassNode[] exceptionNodes = new ClassNode[sourceExceptions == null ? 0 : sourceExceptions.length];
        System.arraycopy(sourceExceptions, 0, exceptionNodes, 0, exceptionNodes.length);
        return exceptionNodes;
    }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/codehaus/groovy/transform/trait/TraitComposer.java`
#### Snippet
```java
                    boolean publicField = true;
                    FieldNode helperField = null;
                    fieldMods = 0;
                    isStatic = 0;

```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/codehaus/groovy/transform/trait/TraitComposer.java`
#### Snippet
```java
                    FieldNode helperField = null;
                    fieldMods = 0;
                    isStatic = 0;

                    // look first for field with encoded modifier information
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/reflection/ClassLoaderForClassArtifacts.java`
#### Snippet
```java
    public String createClassName(String methodName) {
        final String name;
        final String clsName = klazz.get().getName();
        if (clsName.startsWith("java."))
            name = clsName.replace('.', '_') + "$" + methodName;
```

### DataFlowIssue
Method invocation `getProtectionDomain` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/reflection/ClassLoaderForClassArtifacts.java`
#### Snippet
```java

    public Class define(String name, byte[] bytes) {
        Class cls = defineClass(name, bytes, 0, bytes.length, klazz.get().getProtectionDomain());
        resolveClass(cls);
        return cls;
```

### DataFlowIssue
Argument `asStream` might be null
in `src/main/java/org/codehaus/groovy/reflection/SunClassLoader.java`
#### Snippet
```java
    protected void loadFromRes(String name) throws IOException {
        try (final InputStream asStream = SunClassLoader.class.getClassLoader().getResourceAsStream(resName(name))) {
            ClassReader reader = new ClassReader(asStream);
            final ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
            reader.accept(cw, ClassReader.SKIP_DEBUG);
```

### DataFlowIssue
Argument `loader.getResourceAsStream("META-INF/dgminfo")` might be null
in `src/main/java/org/codehaus/groovy/reflection/GeneratedMetaMethod.java`
#### Snippet
```java
                         new DataInputStream(
                                 new BufferedInputStream(
                                         loader.getResourceAsStream("META-INF/dgminfo")))) {

                Map<Integer, Class> classes = new HashMap<Integer, Class>();
```

### DataFlowIssue
Argument `info.classRef.get()` might be null
in `src/main/java/org/codehaus/groovy/reflection/ClassInfo.java`
#### Snippet
```java
        @SuppressWarnings("removal") // TODO a future Groovy version should perform the operation not as a privileged action
        public ClassLoaderForClassArtifacts initValue() {
            return java.security.AccessController.doPrivileged((PrivilegedAction<ClassLoaderForClassArtifacts>) () -> new ClassLoaderForClassArtifacts(info.classRef.get()));
        }
    }
```

### DataFlowIssue
Method invocation `getModifiers` may produce `NullPointerException`
in `src/main/java/groovy/lang/MetaBeanProperty.java`
#### Snippet
```java
        if (setter != null && getter == null) return setter.getModifiers();
        if (getter != null && setter == null) return getter.getModifiers();
        int modifiers = getter.getModifiers() | setter.getModifiers();
        int visibility = 0;
        if (Modifier.isPublic(modifiers)) visibility = Modifier.PUBLIC;
```

### DataFlowIssue
Method invocation `getModifiers` may produce `NullPointerException`
in `src/main/java/groovy/lang/MetaBeanProperty.java`
#### Snippet
```java
        if (setter != null && getter == null) return setter.getModifiers();
        if (getter != null && setter == null) return getter.getModifiers();
        int modifiers = getter.getModifiers() | setter.getModifiers();
        int visibility = 0;
        if (Modifier.isPublic(modifiers)) visibility = Modifier.PUBLIC;
```

### DataFlowIssue
Unboxing of `inclusiveRight` may produce `NullPointerException`
in `src/main/java/groovy/lang/IntRange.java`
#### Snippet
```java
               return reverse ? "" + to + ".." + from : "" + from + ".." + to;
        }
        return "" + from + (inclusiveLeft ? "" : "<") + ".." + (inclusiveRight ? "" : "<") + to;
    }

```

### DataFlowIssue
Argument `c` might be null
in `src/main/java/groovy/util/ObservableSet.java`
#### Snippet
```java

        int oldSize = size();
        boolean success = delegate.addAll(c);

        if (success && c != null) {
```

### DataFlowIssue
Method invocation `size` may produce `NullPointerException`
in `src/main/java/groovy/util/GroovyCollections.java`
#### Snippet
```java
        for (Object listLike : lists) {
            List list = (List) DefaultTypeTransformation.castToType(listLike, List.class);
            if (list.size() < minSize) minSize = list.size();
        }
        if (minSize == 0) return result;
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `src/main/java/groovy/util/GroovyCollections.java`
#### Snippet
```java
            for (int i = 0; i < minSize; i++) {
                List resultList = (List) result.get(i);
                resultList.add(list.get(i));
            }
        }
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/groovy/util/GroovyScriptEngine.java`
#### Snippet
```java
            } catch (IOException e1) {
                String message = "Cannot open URL: " + scriptURL;
                groovyScriptConn = null;
                if (se == null) {
                    se = new ResourceException(message);
```

### DataFlowIssue
Method invocation `getSuperClass` may produce `NullPointerException`
in `src/main/java/groovy/beans/VetoableASTTransformation.java`
#### Snippet
```java
        }
        // check if a super class has @Vetoable annotations
        consideredClass = declaringClass.getSuperClass();
        while (consideredClass!=null) {
            if (hasVetoableAnnotation(consideredClass)) return false;
```

### DataFlowIssue
Method invocation `getSuperClass` may produce `NullPointerException`
in `src/main/java/groovy/beans/BindableASTTransformation.java`
#### Snippet
```java
        }
        // check if a super class has @Bindable annotations
        consideredClass = declaringClass.getSuperClass();
        while (consideredClass!=null) {
            if (hasBindableAnnotation(consideredClass)) return false;
```

### DataFlowIssue
Method invocation `getValue` may produce `NullPointerException`
in `src/main/java/groovy/grape/GrabAnnotationTransformation.java`
#### Snippet
```java
                        }
                        if (node.getMember(s) != null) {
                            grabMap.put(s, ((ConstantExpression)member).getValue());
                        }
                    }
```

### DataFlowIssue
Method invocation `getInputStream` may produce `NullPointerException`
in `subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovy.java`
#### Snippet
```java
                    } else {
                        if (encoding != null && !encoding.isEmpty()) {
                            reader = new InputStreamReader(new BufferedInputStream(src.getInputStream()), encoding);
                        } else {
                            reader = new InputStreamReader(new BufferedInputStream(src.getInputStream()), Charset.defaultCharset());
```

### DataFlowIssue
Method invocation `getInputStream` may produce `NullPointerException`
in `subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovy.java`
#### Snippet
```java
                            reader = new InputStreamReader(new BufferedInputStream(src.getInputStream()), encoding);
                        } else {
                            reader = new InputStreamReader(new BufferedInputStream(src.getInputStream()), Charset.defaultCharset());
                        }
                    }
```

### DataFlowIssue
Method invocation `getReturnType` may produce `NullPointerException`
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
                    Class<?> type = mbp.getType();
                    if (type == Boolean.TYPE && shadow)
                        type = getterMethod.getReturnType();
                    staticProperty = new MetaBeanProperty(mbp.getName(), type, getterMethod, setterMethod);
                }
```

### DataFlowIssue
Dereference of `theCachedClass` may produce `NullPointerException`
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
                superClasses.addFirst(c);
            }
            if (theCachedClass.isArray && theClass != Object[].class && !theClass.getComponentType().isPrimitive()) {
                superClasses.addFirst(ReflectionCache.OBJECT_ARRAY_CLASS);
            }
```

### DataFlowIssue
Method invocation `encode` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
            anno.setMember("version", CURRENT_SIGNATURE_PROTOCOL);
            SignatureCodec codec = SignatureCodecFactory.getCodec(CURRENT_SIGNATURE_PROTOCOL_VERSION, getTransformLoader());
            String genericsSignature = codec.encode(rtype);
            if (genericsSignature != null) {
                ConstantExpression signature = new ConstantExpression(genericsSignature);
```

### DataFlowIssue
Method invocation `isEmpty` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
                    }
                }
                if (mn.isEmpty() && isThisObjectExpression && call.isImplicitThis() && typeCheckingContext.getEnclosingClosure() != null) {
                    mn = CLOSURE_TYPE.getDeclaredMethods(name);
                    if (!mn.isEmpty()) {
```

### DataFlowIssue
Method invocation `visitMethod` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
                    pexp.removeNodeMetaData(DECLARATION_INFERRED_TYPE);
                    pexp.removeNodeMetaData(INFERRED_TYPE);
                    visitor.visitMethod(mopMethod);
                    return true;
                }
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
            if (!GenericsUtils.hasUnresolvedGenerics(at)) continue;

            while (!at.equals(pt) && !isObjectType(at) && !isGenericsPlaceHolderOrArrayOf(at) && !isGenericsPlaceHolderOrArrayOf(pt)) {
                at = applyGenericsContext(GenericsUtils.extractPlaceholders(at), getNextSuperClass(at, pt));
            }
```

### DataFlowIssue
Argument `selectedMethod` might be null
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
                    boolean coerceToMethod = isSAMType(targetType);
                    if (coerceToMethod) { // resolve the target parameter's type
                        Map<GenericsTypeName, GenericsType> context = extractPlaceHoldersVisibleToDeclaration(receiver, selectedMethod, arguments);
                        targetType = applyGenericsContext(context, targetType);
                        expression.putNodeMetaData(PARAMETER_TYPE, targetType);
```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/FindReplaceUtility.java`
#### Snippet
```java
                Document doc = textComponent.getDocument();
                try {
                    doc.remove(pos, find.length());
                    doc.insertString(pos, replace, attributeSet);

```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/FindReplaceUtility.java`
#### Snippet
```java
            if (pos > -1) {
                String pattern = (String) FIND_FIELD.getSelectedItem();
                textComponent.select(pos, pos + pattern.length());
                findReplaceCount = 1;
            }
```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/FindReplaceUtility.java`
#### Snippet
```java
                Document doc = textComponent.getDocument();
                try {
                    doc.remove(pos, find.length());
                    doc.insertString(pos, replace, attributeSet);

```

### DataFlowIssue
Method invocation `getNodeMetaData` may produce `NullPointerException`
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/dsl/GinqAstBuilder.java`
#### Snippet
```java
                    call.getLineNumber(), call.getColumnNumber()));
        }
        return ginqExpression.getNodeMetaData(__LATEST_GINQ_EXPRESSION_CLAUSE);
    }

```

### DataFlowIssue
Method invocation `putNodeMetaData` may produce `NullPointerException`
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/dsl/GinqAstBuilder.java`
#### Snippet
```java
    private void setLatestGinqExpressionClause(AbstractGinqExpression ginqExpressionClause) {
        GinqExpression ginqExpression = ginqExpressionStack.peek();
        ginqExpression.putNodeMetaData(__LATEST_GINQ_EXPRESSION_CLAUSE, ginqExpressionClause);
    }

```

### DataFlowIssue
Casting `expression` to `BinaryExpression` may produce `ClassCastException`
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/dsl/GinqAstBuilder.java`
#### Snippet
```java
                );
            }
            BinaryExpression binaryExpression = (BinaryExpression) expression;
            Expression aliasExpr = binaryExpression.getLeftExpression();
            Expression dataSourceExpr = binaryExpression.getRightExpression();
```

### DataFlowIssue
Method invocation `getLeftExpression` may produce `NullPointerException`
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/dsl/GinqAstBuilder.java`
#### Snippet
```java
            }
            BinaryExpression binaryExpression = (BinaryExpression) expression;
            Expression aliasExpr = binaryExpression.getLeftExpression();
            Expression dataSourceExpr = binaryExpression.getRightExpression();

```

### DataFlowIssue
Method invocation `setFromExpression` may produce `NullPointerException`
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/dsl/GinqAstBuilder.java`
#### Snippet
```java
            if (KW_FROM.equals(methodName)) {
                dataSourceExpression = new FromExpression(aliasExpr, dataSourceExpr);
                currentGinqExpression.setFromExpression((FromExpression) dataSourceExpression);
            } else {
                dataSourceExpression = new JoinExpression(methodName, aliasExpr, dataSourceExpr);
```

### DataFlowIssue
Method invocation `addJoinExpression` may produce `NullPointerException`
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/dsl/GinqAstBuilder.java`
#### Snippet
```java
            } else {
                dataSourceExpression = new JoinExpression(methodName, aliasExpr, dataSourceExpr);
                currentGinqExpression.addJoinExpression((JoinExpression) dataSourceExpression);
            }
            dataSourceExpression.setSourcePosition(call.getMethod());
```

### DataFlowIssue
Method invocation `getGroupExpression` may produce `NullPointerException`
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/dsl/GinqAstBuilder.java`
#### Snippet
```java
                ((JoinExpression) latestGinqExpressionClause).setOnExpression((OnExpression) filterExpression);
            } else if (latestGinqExpressionClause instanceof DataSourceHolder && filterExpression instanceof WhereExpression) {
                if (null != currentGinqExpression.getGroupExpression() || null != currentGinqExpression.getOrderExpression() || null != currentGinqExpression.getLimitExpression()) {
                    this.collectSyntaxError(new GinqSyntaxError(
                            "The preceding clause of `" + methodName + "` should be `from`/" + "join clause",
```

### DataFlowIssue
Method invocation `setGroupExpression` may produce `NullPointerException`
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/dsl/GinqAstBuilder.java`
#### Snippet
```java
            groupExpression.setSourcePosition(call.getMethod());

            currentGinqExpression.setGroupExpression(groupExpression);

            if (latestGinqExpressionClause instanceof OrderExpression) {
```

### DataFlowIssue
Method invocation `setOrderExpression` may produce `NullPointerException`
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/dsl/GinqAstBuilder.java`
#### Snippet
```java
            orderExpression.setSourcePosition(call.getMethod());

            currentGinqExpression.setOrderExpression(orderExpression);

            if (latestGinqExpressionClause instanceof LimitExpression) {
```

### DataFlowIssue
Method invocation `setLimitExpression` may produce `NullPointerException`
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/dsl/GinqAstBuilder.java`
#### Snippet
```java
            limitExpression.setSourcePosition(call.getMethod());

            currentGinqExpression.setLimitExpression(limitExpression);

            if (latestGinqExpressionClause instanceof DataSourceHolder) {
```

### DataFlowIssue
Method invocation `putNodeMetaData` may produce `NullPointerException`
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/dsl/GinqAstBuilder.java`
#### Snippet
```java
                    if (KW_DISTINCT.equals(mce.getMethodAsString())) {
                        tupleExpression = (TupleExpression) mce.getArguments();
                        currentGinqExpression.putNodeMetaData(GINQ_SELECT_DISTINCT, true);
                    }
                }
```

### DataFlowIssue
Method invocation `setSelectExpression` may produce `NullPointerException`
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/dsl/GinqAstBuilder.java`
#### Snippet
```java
            selectExpression.setSourcePosition(call.getMethod());

            currentGinqExpression.setSelectExpression(selectExpression);

            if (latestGinqExpressionClause instanceof DataSourceHolder) {
```

### DataFlowIssue
Variable is already assigned to this value
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/antlr4/GroovyDocParser.java`
#### Snippet
```java
                switch(raw) {
                    // some dup here but kept simple since we may swap Phases to an enum
                    case "CONVERSION": phase = 3; break;
                    case "SEMANTIC_ANALYSIS": phase = 4; break;
                    case "CANONICALIZATION": phase = 5; break;
```

### DataFlowIssue
Variable is already assigned to this value
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/provider/collection/runtime/QueryableCollection.java`
#### Snippet
```java

        Stream<Candidate<U>> stream = candidateList.stream();
        if (isParallel()) stream = stream.parallel();

        return stream.filter(c -> Objects.equals(otherFields, c.extracted))
```

### DataFlowIssue
Variable is already assigned to this value
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/provider/collection/runtime/QueryableCollection.java`
#### Snippet
```java

            if (!sourceStream.isParallel() && isParallel()) {
                sourceStream = sourceStream.parallel();
            }

```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/MapItemValue.java`
#### Snippet
```java
                key = name.toString();

                String keyPrime = internedKeysCache.get(key);
                if (keyPrime == null) {
                    key = key.intern();
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserUsingCharacterSource.java`
#### Snippet
```java

                    if (internKeys) {
                        String keyPrime = internedKeysCache.get(key);
                        if (keyPrime == null) {
                            key = key.intern();
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserCharArray.java`
#### Snippet
```java

                if (internKeys) {
                    String keyPrime = internedKeysCache.get(key);
                    if (keyPrime == null) {
                        key = key.intern();
```

### DataFlowIssue
Variable is already assigned to this value
in `subprojects/groovy-json/src/main/java/groovy/json/StringEscapeUtils.java`
#### Snippet
```java
                        unicode.setLength(0);
                        inUnicode = false;
                        hadSlash = false;
                    } catch (NumberFormatException nfe) {
                        throw new RuntimeException("Unable to parse unicode value: " + unicode, nfe);
```

### DataFlowIssue
Argument `tupleArguments` might be null
in `subprojects/groovy-macro/src/main/groovy/org/codehaus/groovy/macro/methods/MacroGroovyMethods.java`
#### Snippet
```java
        int size = tupleArguments == null ? -1 : tupleArguments.getExpressions().size();
        if (size < 1) {
            source.addError(new SyntaxException("Call arguments should have at least one argument" + '\n', tupleArguments));
            return null;
        }
```

### DataFlowIssue
Variable is already assigned to this value
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
                    if (c == '{') {
                        appendCharacter('{', templateExpressions, writingString);
                        writingString = true;
                        parseGSstring(reader, writingString, templateExpressions);
                        writingString = true;
```

### DataFlowIssue
Variable is already assigned to this value
in `subprojects/groovy-templates/src/main/groovy/groovy/text/GStringTemplateEngine.java`
#### Snippet
```java
                        writingString = true;
                        parseGSstring(reader, writingString, templateExpressions);
                        writingString = true;
                        continue;
                    }
```

### DataFlowIssue
Method invocation `attributes` may produce `NullPointerException`
in `subprojects/groovy-templates/src/main/groovy/groovy/text/XmlTemplateEngine.java`
#### Snippet
```java
            }
            if (begin) {
                printNameAttributes(node.attributes(), ctx);
            }
            out.print(">");
```

### DataFlowIssue
Method invocation `endsWith` may produce `NullPointerException`
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
                        if (i < strings.length - 1) {
                            String nextText = strings[i + 1];
                            if ((text.endsWith("\"") || text.endsWith("'")) && (nextText.startsWith("'") || nextText.startsWith("\""))) {
                                if (!warned) {
                                    LOG.warning("In Groovy SQL please do not use quotes around dynamic expressions " +
```

### DataFlowIssue
Argument `self.item(0)` might be null
in `subprojects/groovy-xml/src/main/java/groovy/xml/dom/DOMCategory.java`
#### Snippet
```java
            );
        }
        return replaceNode(self.item(0), c);
    }

```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'DYNAMIC_TYPE' is still used
in `src/main/java/org/codehaus/groovy/ast/ClassHelper.java`
#### Snippet
```java

    @Deprecated
    public static final ClassNode DYNAMIC_TYPE = OBJECT_TYPE;

    private static final ClassNode[] types = new ClassNode[]{
```

### DeprecatedIsStillUsed
Deprecated member 'ManagedLinkedList' is still used
in `src/main/java/org/codehaus/groovy/util/ManagedLinkedList.java`
#### Snippet
```java
 */
@Deprecated
public class ManagedLinkedList<T> {

    private final class Element<V> extends ManagedReference<V> {
```

### DeprecatedIsStillUsed
Deprecated member 'AbstractConcurrentMap' is still used
in `src/main/java/org/codehaus/groovy/util/AbstractConcurrentMap.java`
#### Snippet
```java

@Deprecated
public abstract class AbstractConcurrentMap<K, V> extends AbstractConcurrentMapBase {

    public AbstractConcurrentMap(Object segmentInfo) {
```

### DeprecatedIsStillUsed
Deprecated member 'ManagedConcurrentMap' is still used
in `src/main/java/org/codehaus/groovy/util/ManagedConcurrentMap.java`
#### Snippet
```java

@Deprecated
public class ManagedConcurrentMap<K,V> extends AbstractConcurrentMap<K,V> {
    protected ReferenceBundle bundle;
    public ManagedConcurrentMap(ReferenceBundle bundle) {
```

### DeprecatedIsStillUsed
Deprecated member 'setConstantTypesWhiteList' is still used
in `src/main/java/org/codehaus/groovy/control/customizers/SecureASTCustomizer.java`
#### Snippet
```java
     */
    @Deprecated
    public void setConstantTypesWhiteList(final List<String> allowedConstantTypes) {
        setAllowedConstantTypes(allowedConstantTypes);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setReceiversBlackList' is still used
in `src/main/java/org/codehaus/groovy/control/customizers/SecureASTCustomizer.java`
#### Snippet
```java
     */
    @Deprecated
    public void setReceiversBlackList(final List<String> disallowedReceivers) {
        setDisallowedReceivers(disallowedReceivers);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setReceiversWhiteList' is still used
in `src/main/java/org/codehaus/groovy/control/customizers/SecureASTCustomizer.java`
#### Snippet
```java
     */
    @Deprecated
    public void setReceiversWhiteList(final List<String> allowedReceivers) {
        if (disallowedReceivers != null) {
            throw new IllegalArgumentException("You are not allowed to set both an allowed list and a disallowed list");
```

### DeprecatedIsStillUsed
Deprecated member 'chooseMostGeneralMethodWith1NullParam' is still used
in `src/main/java/org/codehaus/groovy/runtime/MetaClassHelper.java`
#### Snippet
```java
     */
    @Deprecated
    public static Object chooseMostGeneralMethodWith1NullParam(FastArray methods) {
        // let's look for methods with 1 argument which matches the type of the
        // arguments
```

### DeprecatedIsStillUsed
Deprecated member 'getOutput' is still used
in `src/main/java/org/codehaus/groovy/control/CompilerConfiguration.java`
#### Snippet
```java
     */
    @Deprecated
    public PrintWriter getOutput() {
        return this.output;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'setOutput' is still used
in `src/main/java/org/codehaus/groovy/control/CompilerConfiguration.java`
#### Snippet
```java
     */
    @Deprecated
    public void setOutput(final PrintWriter output) {
        if (output == null) {
            this.output = new PrintWriter(NullWriter.DEFAULT);
```

### DeprecatedIsStillUsed
Deprecated member 'GroovyClassValuePreJava7' is still used
in `src/main/java/org/codehaus/groovy/reflection/GroovyClassValuePreJava7.java`
#### Snippet
```java
 */
@Deprecated
class GroovyClassValuePreJava7<T> implements GroovyClassValue<T> {
	private static final ReferenceBundle weakBundle = ReferenceBundle.getWeakBundle();

```

### DeprecatedIsStillUsed
Deprecated member 'isVargs' is still used
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java`
#### Snippet
```java

    @Deprecated(forRemoval = true, since = "4.0.4")
    static boolean isVargs(final Parameter[] parameters) {
        return ParameterUtils.isVargs(parameters);
    }
```

### DeprecatedIsStillUsed
Deprecated member 'USE_REFLECTION' is still used
in `src/main/java/groovy/lang/GroovySystem.java`
#### Snippet
```java
     */
    @Deprecated
    private static final boolean USE_REFLECTION;

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'convertToPrimitiveArray' is still used
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java

    @Deprecated
    public static Object convertToPrimitiveArray(Object a, Class type) {
        if (type == Byte.TYPE) {
            return convertToByteArray(a);
```

### DeprecatedIsStillUsed
Deprecated member 'convertToByteArray' is still used
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java

    @Deprecated
    public static byte[] convertToByteArray(Object a) {
        byte[] ans = null;

```

### DeprecatedIsStillUsed
Deprecated member 'getCharFromSizeOneString' is still used
in `src/main/java/org/codehaus/groovy/runtime/typehandling/DefaultTypeTransformation.java`
#### Snippet
```java

    @Deprecated
    public static Character getCharFromSizeOneString(Object value) {
        if (value instanceof GString) value = value.toString();
        if (value instanceof String) {
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/org/codehaus/groovy/classgen/FinalVariableAnalyzer.java`
#### Snippet
```java

        public VariableState getNext() {
            switch (this) {
                case is_uninitialized:
                    return is_final;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
    public static class SignatureCodecFactory {
        public static SignatureCodec getCodec(final int version, final ClassLoader classLoader) {
            switch (version) {
              case 1:
                return new SignatureCodecVersion1(classLoader);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonFastParser.java`
#### Snippet
```java
        for (; __index < array.length; __index++) {
            skipWhiteSpace();
            switch (__currentChar) {

                case '"':
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
        int inWhere = 0;
        while (i < chars.length) {
            switch (chars[i]) {
                case '\'':
                    inString = !inString;
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return string but the return type is array
in `src/main/java/org/codehaus/groovy/runtime/ResourceGroovyMethods.java`
#### Snippet
```java
     *
     * @param file the file whose content we want to read
     * @return a String containing the content of the file
     * @throws IOException if an IOException occurs.
     * @since 1.7.1
```

### MismatchedJavadocCode
Method is specified to return string but the return type is list
in `src/main/java/org/codehaus/groovy/runtime/StringGroovyMethods.java`
#### Snippet
```java
     * @param self    a Matcher
     * @param indices a Collection of indices
     * @return a String of the values at the given indices
     *
     * @since 1.6.0
```

### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `src/main/java/org/codehaus/groovy/control/CompilerConfiguration.java`
#### Snippet
```java
    /**
     * Returns the list of disabled global AST transformation class names.
     * @return a list of global AST transformation fully qualified class names
     */
    public Set<String> getDisabledGlobalASTTransformations() {
```

### MismatchedJavadocCode
Method is specified to return 'null' but its return type is primitive
in `src/main/java/org/codehaus/groovy/transform/trait/Traits.java`
#### Snippet
```java
     * of a trait.
     * @param someMethod a method node
     * @return null if it is not a method implemented in a trait. If it is, returns the method from the trait class.
     */
    public static boolean isBridgeMethod(Method someMethod) {
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovyc.java`
#### Snippet
```java
     * Gets the list of files to be compiled.
     *
     * @return the list of files as an array
     */
    public File[] getFileList() {
```

### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/CharacterSource.java`
#### Snippet
```java
     * @param ch  character to find
     * @param esc escape character to avoid next char if escaped
     * @return list of chars until this is found.
     */
    char[] findNextChar(int ch, int esc);
```

### MismatchedJavadocCode
Method is specified to return string but the return type is array
in `subprojects/groovy-nio/src/main/java/org/apache/groovy/nio/extensions/NioExtensions.java`
#### Snippet
```java
     *
     * @param self the file whose content we want to read
     * @return a String containing the content of the file
     * @throws java.io.IOException if an IOException occurs.
     * @since 2.3.0
```

### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `subprojects/groovy-templates/src/main/groovy/groovy/text/StreamingTemplateEngine.java`
#### Snippet
```java
         * @param sourcePosition The reader position in the source stream
         * @param targetPosition The writer position in the target stream
         * @return true if a valid dollar preceded identifier was found, false otherwise. More
         * specifically, returns true if the first character after the dollar sign is a valid
         * java identifier. Note that the dollar curly syntax is handled by another method.
```

### MismatchedJavadocCode
Method is specified to return 'false' but its return type is not boolean
in `subprojects/groovy-templates/src/main/groovy/groovy/text/StreamingTemplateEngine.java`
#### Snippet
```java
         * @param sourcePosition The reader position in the source stream
         * @param targetPosition The writer position in the target stream
         * @return true if a valid dollar preceded identifier was found, false otherwise. More
         * specifically, returns true if the first character after the dollar sign is a valid
         * java identifier. Note that the dollar curly syntax is handled by another method.
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
'catch' parameter named `ignore` is used
in `src/main/java/org/codehaus/groovy/vmplugin/v9/Java9.java`
#### Snippet
```java
                result.putAll(javaDefaultImportsFuture.get());
            }
        } catch (Exception ignore) {
            Logger logger = Logger.getLogger(getClass().getName());
            if (logger.isLoggable(Level.FINEST)) {
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/groovy/lang/GroovyClassLoader.java`
#### Snippet
```java
                        if (ret != null)
                            return ret;
                    } catch (Throwable t) {
                    }
                }
```

### CatchMayIgnoreException
Empty `catch` block
in `src/main/java/groovy/lang/MetaClassImpl.java`
#### Snippet
```java
                try {
                    return mp.getProperty(object);
                } catch (GroovyRuntimeException e) {
                }
            }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/codehaus/groovy/ast/AstToTextHelper.java`
#### Snippet
```java
            result.add(getClassText(exception));
        }
        return " throws " + result.toString();
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/codehaus/groovy/control/SourceExtensionHandler.java`
#### Snippet
```java
                } catch (IOException ex) {
                    throw new GroovyRuntimeException("IO Exception attempting to load registered source extension " +
                            service.toExternalForm() + ". Exception: " + ex.toString());
                }
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/codehaus/groovy/control/SourceExtensionHandler.java`
#### Snippet
```java
            }
        } catch (IOException ex) {
            throw new GroovyRuntimeException("IO Exception getting registered source extensions. Exception: " + ex.toString());
        }
        return extensions;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/codehaus/groovy/tools/javac/JavaStubGenerator.java`
#### Snippet
```java
            sj.add(gt.toString().replace('$', '.'));
        }
        out.print(sj.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/codehaus/groovy/tools/javac/JavaStubGenerator.java`
#### Snippet
```java
            }
        }
        out.print(sj.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/codehaus/groovy/tools/javac/JavaStubGenerator.java`
#### Snippet
```java
            sj.add(entry.getKey() + "=" + getAnnotationValue(entry.getValue()));
        }
        out.print(sj.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/codehaus/groovy/classgen/asm/OperandStack.java`
#### Snippet
```java
    @Override
    public String toString() {
        return "OperandStack(size=" + stack.size() + ":" + stack.toString() + ")";
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/codehaus/groovy/vmplugin/v9/ClassFinder.java`
#### Snippet
```java
                prefix = path.toString();
            } else {
                uri = URI.create("jar:" + classpathEntryURI.toString());
                prefix = "";
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/codehaus/groovy/vmplugin/v8/PluginDefaultGroovyMethods.java`
#### Snippet
```java
            // is going to be extremely expensive, due to calls to GString#charAt,
            // which is going to re-evaluate the GString for each character!
            return self.append(value.toString());
        }
        if (value instanceof CharSequence) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/codehaus/groovy/transform/ASTTransformationVisitor.java`
#### Snippet
```java
                        compilationUnit.getErrorCollector().addError(new SimpleMessage(
                                "IOException reading the service definition at "
                                        + service.toExternalForm() + " because of exception " + ioe.toString(), null));
                        continue;
                    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/codehaus/groovy/transform/ASTTransformationVisitor.java`
#### Snippet
```java
                                        compilationUnit.getErrorCollector().addWarning(
                                                WarningMessage.POSSIBLE_ERRORS,
                                                "Failed to parse URL as URI because of exception " + e.toString(),
                                                null,
                                                null);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/codehaus/groovy/transform/ASTTransformationVisitor.java`
#### Snippet
```java
                            compilationUnit.getErrorCollector().addError(new SimpleMessage(
                                    "IOException reading the service definition at "
                                            + service.toExternalForm() + " because of exception " + ioe.toString(), null));
                        }
                    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/codehaus/groovy/transform/AnnotationCollectorTransform.java`
#### Snippet
```java

        if (!unusedNames.isEmpty()) {
            String message = "Annotation collector got unmapped names "+unusedNames.toString()+".";
            addError(message, aliasAnnotationUsage, source);
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/groovy/lang/GroovyCodeSource.java`
#### Snippet
```java
        final File file = new File(infile.getCanonicalPath());
        if (!file.exists()) {
            throw new FileNotFoundException(file.toString() + " (" + file.getAbsolutePath() + ")");
        }
        if (file.isDirectory()) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/groovy/lang/GroovyCodeSource.java`
#### Snippet
```java
        }
        if (file.isDirectory()) {
            throw new IllegalArgumentException(file.toString() + " (" + file.getAbsolutePath() + ") is a directory not a Groovy source file.");
        }
        try {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/groovy/lang/GroovyCodeSource.java`
#### Snippet
```java
        try {
            if (!file.canRead())
                throw new RuntimeException(file.toString() + " can not be read. Check the read permission of the file \"" + file.toString() + "\" (" + file.getAbsolutePath() + ").");
        }
        catch (SecurityException e) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/groovy/lang/GroovyCodeSource.java`
#### Snippet
```java
        try {
            if (!file.canRead())
                throw new RuntimeException(file.toString() + " can not be read. Check the read permission of the file \"" + file.toString() + "\" (" + file.getAbsolutePath() + ").");
        }
        catch (SecurityException e) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/Groovy.java`
#### Snippet
```java
        log.verbose("Script: " + txt);
        if (classpath != null) {
            log.debug("Explicit Classpath: " + classpath.toString());
        }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/SimpleGroovyClassDoc.java`
#### Snippet
```java
                while (doc == null && maybeName.isPresent()) {
                    Name name = maybeName.get();
                    doc = ((SimpleGroovyRootDoc) rootDoc).classNamedExact(name.asString().replace('.', '/') + staticPart.toString());
                    staticPart.insert(0, name.getIdentifier());
                    staticPart.insert(0, ".");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/antlr4/GroovydocJavaVisitor.java`
#### Snippet
```java
                fieldDoc.setRawCommentText(javadocComment.getContent()));
        n.getDefaultValue().ifPresent(defValue -> {
            fieldDoc.setRawCommentText(fieldDoc.getRawCommentText() + "\n* @default " + defValue.toString());
            fieldDoc.setConstantValueExpression(defValue.toString());
        });
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/antlr4/GroovydocJavaVisitor.java`
#### Snippet
```java
    private String fullName(ClassOrInterfaceType et) {
        StringBuilder name = new StringBuilder();
        et.getScope().ifPresent(sc -> name.append(sc.toString()));
        name.append(et.getNameAsString());
        return name.toString();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `subprojects/groovy-jmx/src/main/java/groovy/jmx/GroovyMBean.java`
#### Snippet
```java
                Object val = this.getProperty(name);
                if (val != null) {
                    list.add(name + " : " + val.toString());
                }
            } catch (Exception e) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `subprojects/groovy-json/src/main/java/groovy/json/DefaultJsonGenerator.java`
#### Snippet
```java
            Class<?> param1 = closure.getParameterTypes()[0];
            if (!param1.isAssignableFrom(type)) {
                throw new IllegalArgumentException("Expected first parameter to be of type: " + type.toString());
            }
            if (paramCount > 1) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `subprojects/groovy-json/src/main/java/groovy/json/DefaultJsonGenerator.java`
#### Snippet
```java
                Class<?> param2 = closure.getParameterTypes()[1];
                if (!param2.isAssignableFrom(String.class)) {
                    throw new IllegalArgumentException("Expected second parameter to be of type: " + String.class.toString());
                }
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/GroovyServlet.java`
#### Snippet
```java
                    error.append(runtimeException.getStackTrace()[0].toString());
                servletContext.log(error.toString());
                System.err.println(error.toString());
                runtimeException.printStackTrace(System.err);
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, error.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/GroovyServlet.java`
#### Snippet
```java
                error.append(" Script not found, sending 404.");
                servletContext.log(error.toString());
                System.err.println(error.toString());
                response.sendError(HttpServletResponse.SC_NOT_FOUND);
                return;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `subprojects/groovy-servlet/src/main/java/groovy/servlet/GroovyServlet.java`
#### Snippet
```java
                error.append(e.getStackTrace()[0].toString());
            servletContext.log(e.toString());
            System.err.println(e.toString());
            runtimeException.printStackTrace(System.err);
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.toString());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `subprojects/groovy-sql/src/main/java/groovy/sql/GroovyResultSetExtension.java`
#### Snippet
```java
                Object object = resultSet.getObject(i);
                if (object!=null) {
                    sb.append(object.toString());
                } else {
                    sb.append("[null]");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `subprojects/groovy-sql/src/main/java/groovy/sql/DataSet.java`
#### Snippet
```java
        }
        buffer.append(") values (");
        buffer.append(paramBuffer.toString());
        buffer.append(")");
        return buffer.toString();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `subprojects/groovy-sql/src/main/java/groovy/sql/DataSet.java`
#### Snippet
```java
        }
        buffer.append(") values (");
        buffer.append(paramBuffer.toString());
        buffer.append(")");
        return buffer.toString();
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
                                            "(which start with $) as this means we cannot use a JDBC PreparedStatement " +
                                            "and so is a security hole. Groovy has worked around your mistake but the security hole is still there. " +
                                            "The expression so far is: " + buffer.toString() + "?" + nextText);
                                    warned = true;
                                }
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
      }
      Entry<?, ?> entry = (Entry<?, ?>) obj;
      Node<K, V> node = map.data.get(entry.getKey());
      return (node != null) && (node.getValue().equals(entry.getValue()));
    }
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
  @Override
  public boolean remove(Object key, Object value) {
    final Node<K, V> node = data.get(key);
    if ((node == null) || (value == null)) {
      return false;
```

### SuspiciousMethodCalls
Suspicious call to 'ConcurrentLinkedHashMap.remove()'
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
      }
      Entry<?, ?> entry = (Entry<?, ?>) obj;
      return map.remove(entry.getKey(), entry.getValue());
    }
  }
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/main/java/org/apache/groovy/util/concurrent/concurrentlinkedhashmap/ConcurrentLinkedHashMap.java`
#### Snippet
```java
   */
  public V getQuietly(Object key) {
    final Node<K, V> node = data.get(key);
    return (node == null) ? null : node.getValue();
  }
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `src/main/java/org/codehaus/groovy/control/customizers/builder/SourceAwareCustomizerFactory.java`
#### Snippet
```java
                @Override
                public Boolean call(final Object arguments) {
                    return basenames.contains(arguments);
                }
            };
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `src/main/java/org/codehaus/groovy/control/customizers/builder/SourceAwareCustomizerFactory.java`
#### Snippet
```java
                @Override
                public Boolean call(final Object arguments) {
                    return extensions.contains(arguments);
                }
            };
```

### SuspiciousMethodCalls
Suspicious call to 'ConcurrentHashMap.remove()'
in `src/main/java/org/codehaus/groovy/runtime/memoize/UnlimitedConcurrentCache.java`
#### Snippet
```java
            Object entryVal = entry.getValue();
            if (entryVal instanceof SoftReference && ((SoftReference) entryVal).get() == null) {
                map.remove(entry.getKey(), entryVal);
            }
        }
```

### SuspiciousMethodCalls
'Collection' may not contain objects of type 'Object'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static boolean containsAll(Iterable<?> self, Object[] items) {
        return asCollection(self).containsAll(Arrays.asList(items));
    }

```

### SuspiciousMethodCalls
'Set' may not contain objects of type 'capture of ?'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
                answer = new TreeSet<>(comparator);
                answer.addAll(self1);
                answer.removeAll(removeMe1);
            }

```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <K,V> V getAt(Map<K,V> self, Object key) {
        return self.get(key);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'Collection.remove()'
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethods.java`
#### Snippet
```java
     */
    public static <E> boolean removeElement(Collection<E> self, Object o) {
        return self.remove(o);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'Map.getOrDefault()'
in `src/main/java/org/codehaus/groovy/transform/NamedVariantASTTransformation.java`
#### Snippet
```java
            }
            if (v instanceof VariableExpression) { // maybe it's a reference to a previous parameter
                return seen.getOrDefault(((VariableExpression) v).getAccessedVariable(), defaultValue);
            }
        }
```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `src/main/java/groovy/lang/MapWithDefault.java`
#### Snippet
```java
    @Override
    public V get(Object key) {
        if (delegate.containsKey(key)) {
            return delegate.get(key);
        }
```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `src/main/java/groovy/util/ObservableSet.java`
#### Snippet
```java
        List values = new ArrayList();
        for (Object element : c) {
            if (delegate.contains(element)) {
                values.add(element);
            }
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `src/main/java/groovy/util/FactoryBuilderSupport.java`
#### Snippet
```java
    protected Factory resolveFactory(Object name, Map attributes, Object value) {
        getProxyBuilder().getContext().put(CHILD_BUILDER, getProxyBuilder());
        return getProxyBuilder().getFactories().get(name);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java`
#### Snippet
```java
        if (!collectedNames.isEmpty()) {
            for (Map.Entry<Object, Expression> entry : entries.entrySet()) {
                if (!collectedNames.contains(entry.getKey())) {
                    addStaticTypeError("unexpected named arg: " + entry.getKey(), args);
                }
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `subprojects/groovy-contracts/src/main/java/org/apache/groovy/contracts/common/impl/EnsuresAnnotationProcessor.java`
#### Snippet
```java
        final List<ConstructorNode> declaredConstructors = classNode.getDeclaredConstructors();

        contract.postconditions().and(methodNode, new Postcondition(blockStatement, booleanExpression, declaredConstructors.contains(methodNode)));
    }
}
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `subprojects/groovy-sql/src/main/java/groovy/sql/GroovyRowResult.java`
#### Snippet
```java
            Object key = lookupKeyIgnoringCase(property);
            if (key != null) {
                return result.get(key);
            }
            throw new MissingPropertyException(property, GroovyRowResult.class);
```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `subprojects/groovy-sql/src/main/java/groovy/sql/GroovyRowResult.java`
#### Snippet
```java
    private Object lookupKeyIgnoringCase(Object key) {
        // try some special cases first for efficiency
        if (result.containsKey(key))
            return key;
        if (!(key instanceof CharSequence))
```

### SuspiciousMethodCalls
'List' may not contain objects of type 'capture of ?'
in `subprojects/groovy-swing/src/main/groovy/groovy/swing/impl/ListWrapperListModel.java`
#### Snippet
```java

    public boolean containsAll(Collection<?> objects) {
        return delegate.containsAll(objects);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'List.indexOf()'
in `subprojects/groovy-swing/src/main/groovy/groovy/swing/impl/ListWrapperListModel.java`
#### Snippet
```java

    public int indexOf(Object o) {
        return delegate.indexOf(o);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'List.remove()'
in `subprojects/groovy-swing/src/main/groovy/groovy/swing/impl/ListWrapperListModel.java`
#### Snippet
```java
    public boolean remove(Object o) {
        int i = indexOf(o);
        boolean rv = delegate.remove(o);
        if (i >= 0) {
            fireIntervalRemoved(this, i, i);
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `subprojects/groovy-swing/src/main/groovy/groovy/swing/impl/ListWrapperListModel.java`
#### Snippet
```java

    public boolean contains(Object o) {
        return delegate.contains(o);
    }

```

### SuspiciousMethodCalls
Suspicious call to 'List.lastIndexOf()'
in `subprojects/groovy-swing/src/main/groovy/groovy/swing/impl/ListWrapperListModel.java`
#### Snippet
```java

    public int lastIndexOf(Object o) {
        return delegate.lastIndexOf(o);
    }

```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `NonStaticInner` may be 'static'
in `src/test/groovy/JavaClass.java`
#### Snippet
```java
    }

    class NonStaticInner {

    }
```

### InnerClassMayBeStatic
Inner class `AbstractStatementCommand` may be 'static'
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
    //-------------------------------------------------------------------------

    private abstract class AbstractStatementCommand {
        /**
         * Execute the command that's defined by the subclass following
```

## RuleId[id=RegExpRepeatedSpace]
### RegExpRepeatedSpace
4 consecutive spaces in RegExp
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/TextEditor.java`
#### Snippet
```java
    private static final String TABBED_SPACES = "    ";
    private static final Pattern TAB_BACK_PATTERN =
            Pattern.compile("^(([\t])|(    )|(   )|(  )|( ))", Pattern.MULTILINE);
    private static final Pattern LINE_START =
            Pattern.compile("^", Pattern.MULTILINE);
```

### RegExpRepeatedSpace
3 consecutive spaces in RegExp
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/TextEditor.java`
#### Snippet
```java
    private static final String TABBED_SPACES = "    ";
    private static final Pattern TAB_BACK_PATTERN =
            Pattern.compile("^(([\t])|(    )|(   )|(  )|( ))", Pattern.MULTILINE);
    private static final Pattern LINE_START =
            Pattern.compile("^", Pattern.MULTILINE);
```

### RegExpRepeatedSpace
2 consecutive spaces in RegExp
in `subprojects/groovy-console/src/main/groovy/groovy/console/ui/text/TextEditor.java`
#### Snippet
```java
    private static final String TABBED_SPACES = "    ";
    private static final Pattern TAB_BACK_PATTERN =
            Pattern.compile("^(([\t])|(    )|(   )|(  )|( ))", Pattern.MULTILINE);
    private static final Pattern LINE_START =
            Pattern.compile("^", Pattern.MULTILINE);
```

### RegExpRepeatedSpace
2 consecutive spaces in RegExp
in `subprojects/performance/src/files/pleac05_06.groovy`
#### Snippet
```java
sentences = []
strip = input.replaceAll(/(\p{Punct})\n/, '$1  ').replaceAll(/\n/, ' ').replaceAll(/ {3,}/,'  ')
m = strip =~ /(\S.*?\p{Punct})(?=  |\Z)/
(0..<m.count).each{ sentences += m[it][1] }
assert sentences == ["Is this a sentence?", "Yes!", "And so is this.", "And the fourth."]
```

## RuleId[id=WrongPackageStatement]
### WrongPackageStatement
Package name 'groovy' does not correspond to the file path ''
in `src/test/groovy/TestInterruptor.java`
#### Snippet
```java
 *  under the License.
 */
package groovy;

public class TestInterruptor implements Runnable {
```

### WrongPackageStatement
Package name 'groovy' does not correspond to the file path ''
in `src/test/groovy/SomeClass.java`
#### Snippet
```java
 *  under the License.
 */
package groovy;

/**
```

### WrongPackageStatement
Package name 'groovy' does not correspond to the file path ''
in `src/test/groovy/Language.java`
#### Snippet
```java
 *  under the License.
 */
package groovy;

/** Java Enum for testing purposes */
```

### WrongPackageStatement
Package name 'groovy' does not correspond to the file path ''
in `src/test/groovy/NamedParameterHelper.java`
#### Snippet
```java
 *  under the License.
 */
package groovy;

import groovy.transform.NamedParam;
```

### WrongPackageStatement
Package name 'groovy' does not correspond to the file path ''
in `src/test/groovy/DummyMethodsJava.java`
#### Snippet
```java
 *  under the License.
 */
package groovy;

/**
```

### WrongPackageStatement
Package name 'groovy' does not correspond to the file path ''
in `src/test/groovy/JavaClass.java`
#### Snippet
```java
 *  under the License.
 */
package groovy;

public class JavaClass {
```

### WrongPackageStatement
Package name 'groovy' does not correspond to the file path ''
in `src/test/groovy/DummyInterface.java`
#### Snippet
```java
 *  under the License.
 */
package groovy;

public interface DummyInterface {
```

### WrongPackageStatement
Package name 'groovy' does not correspond to the file path ''
in `src/test/groovy/JointJava.java`
#### Snippet
```java
 *  under the License.
 */
package groovy;

import groovy.lang.Closure;
```

### WrongPackageStatement
Package name 'groovy' does not correspond to the file path ''
in `src/test/groovy/OuterUser.java`
#### Snippet
```java
 *  under the License.
 */
package groovy;

/**
```

### WrongPackageStatement
Package name 'groovy' does not correspond to the file path ''
in `src/test/groovy/ClosureJavaIntegrationTest.java`
#### Snippet
```java
 *  under the License.
 */
package groovy;

import groovy.lang.Closure;
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'child instanceof GroovyParser.NlsContext' covered by subsequent condition 'child instanceof GroovyParser.SepContext'
in `src/main/java/org/apache/groovy/parser/antlr4/GroovydocManager.java`
#### Snippet
```java
            }

            if (!(child instanceof GroovyParser.NlsContext || child instanceof GroovyParser.SepContext)) {
                continue;
            }
```

### ConditionCoveredByFurtherCondition
Condition 'callback != null' covered by subsequent condition 'callback instanceof Closure'
in `subprojects/groovy-jmx/src/main/java/groovy/jmx/builder/JmxEventListener.java`
#### Snippet
```java
            Object del = event.get("managedObject");
            Object callback = event.get("callback");
            if (callback != null && callback instanceof Closure) {
                Closure closure = (Closure) callback;
                closure.setDelegate(del);
```

### ConditionCoveredByFurtherCondition
Condition 'callback != null' covered by subsequent condition 'callback instanceof Closure'
in `subprojects/groovy-jmx/src/main/java/groovy/jmx/builder/JmxBuilderModelMBean.java`
#### Snippet
```java
                Object del = event.get("managedObject");
                Object callback = event.get("callback");
                if (callback != null && callback instanceof Closure) {
                    Closure closure = (Closure) callback;
                    closure.setDelegate(del);
```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `subprojects/groovy-json/src/main/java/groovy/json/JsonTokenType.java`
#### Snippet
```java
    TRUE            ( "the constant 'true'",                "true"      ),
    FALSE           ( "the constant 'false'",               "false"     ),
    NUMBER          ( "a number",                           Pattern.compile("-?\\d+(\\.\\d+)?((e|E)(\\+|-)?\\d+)?")),
    //STRING          ( "a string",                           Pattern.compile("\"([^\"\\\\]*|\\\\[\"\\\\bfnrt\\/]|\\\\u[0-9a-fA-F]{4})*\"", Pattern.DOTALL));
    /**
```

### RegExpSingleCharAlternation
Single character alternation in RegExp
in `subprojects/groovy-json/src/main/java/groovy/json/JsonTokenType.java`
#### Snippet
```java
    TRUE            ( "the constant 'true'",                "true"      ),
    FALSE           ( "the constant 'false'",               "false"     ),
    NUMBER          ( "a number",                           Pattern.compile("-?\\d+(\\.\\d+)?((e|E)(\\+|-)?\\d+)?")),
    //STRING          ( "a string",                           Pattern.compile("\"([^\"\\\\]*|\\\\[\"\\\\bfnrt\\/]|\\\\u[0-9a-fA-F]{4})*\"", Pattern.DOTALL));
    /**
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserUsingCharacterSource.java`
#### Snippet
```java
                if (c == COMMA) {
                    characterSource.nextChar();
                    continue;
                } else if (c == CLOSED_BRACKET) {
                    foundEnd = true;
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserUsingCharacterSource.java`
#### Snippet
```java
                } else if (ch == ',') {
                    characterSource.nextChar();
                    continue;
                } else {
                    complain(
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserCharArray.java`
#### Snippet
```java
                if (c == ',') {
                    __index++;
                    continue;
                } else if (c == ']' && lastIndex != __index) {
                    __index++;
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/JsonParserCharArray.java`
#### Snippet
```java
                break;
            } else if (__currentChar == ',') {
                continue;
            } else {
                complain(
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy fields 'output' and 'targetBytecode'
in `src/main/java/org/codehaus/groovy/control/CompilerConfiguration.java`
#### Snippet
```java
     * @param configuration The configuration to copy.
     */
    public CompilerConfiguration(final CompilerConfiguration configuration) {
        setWarningLevel(configuration.getWarningLevel());
        setTargetDirectory(configuration.getTargetDirectory());
```

### CopyConstructorMissesField
Copy constructor does not copy field 'config'
in `src/main/java/groovy/lang/GroovyShell.java`
#### Snippet
```java
     * @param shell is the parent shell used for the variable bindings and the parent class loader
     */
    public GroovyShell(GroovyShell shell) {
        this(shell.loader, shell.context);
    }
```

### CopyConstructorMissesField
Copy constructor does not copy field 'cacheTemplates'
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/TemplateConfiguration.java`
#### Snippet
```java
    }

    public TemplateConfiguration(TemplateConfiguration that) {
        this.declarationEncoding = that.declarationEncoding;
        this.expandEmptyElements = that.expandEmptyElements;
```

### CopyConstructorMissesField
Copy constructor does not copy 12 fields
in `subprojects/groovy-sql/src/main/java/groovy/sql/Sql.java`
#### Snippet
```java
    }

    public Sql(Sql parent) {
        this.dataSource = parent.dataSource;
        this.useConnection = parent.useConnection;
```

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:ab([d|x-z]+))`
in `src/test/groovy/RegularExpressionsTest.groovy`
#### Snippet
```java
        }

        m = "abcabdabeabfabxyzabx" =~ /(?:ab([d|x-z]+))/
        assert 3 == m.count
        assert m.hasGroup()
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:ab([d|x-z]+))`
in `src/test/groovy/RegularExpressionsTest.groovy`
#### Snippet
```java
    @Test
    void testAnotherOneGroupMatcherAndGet() {
        def m = "abcabdabeabfabxyzabx" =~ /(?:ab([d|x-z]+))/
        def result = []

```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:\\\\[\"\\\\bfnrt\\/]|\\\\u[0-9a-fA-F]{4})`
in `subprojects/groovy-json/src/main/java/groovy/json/JsonTokenType.java`
#### Snippet
```java
     */
    STRING          ( "a string",                           new Closure(null) {
        private Pattern replacePattern = Pattern.compile("(?:\\\\[\"\\\\bfnrt\\/]|\\\\u[0-9a-fA-F]{4})");
        private Pattern validatePattern = Pattern.compile("\"[^\"\\\\]*\"");
        public boolean doCall(String it) {
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:_[A-Z]{2,3})`
in `subprojects/groovy-templates/src/main/groovy/groovy/text/markup/MarkupTemplateEngine.java`
#### Snippet
```java
    static final String MODELTYPES_ASTKEY = "MTE.modelTypes";

    private static final Pattern LOCALIZED_RESOURCE_PATTERN = Pattern.compile("(.+?)(?:_([a-z]{2}(?:_[A-Z]{2,3})))?\\.([\\p{Alnum}.]+)$");

    private static final boolean DEBUG_BYTECODE = Boolean.getBoolean("markuptemplateengine.compiler.debug");
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:^.*bell.*lab)`
in `subprojects/performance/src/files/pleac05_06.groovy`
#### Snippet
```java

// eliminate overlapping
assert !(string =~ /(?:^.*bell.*lab)|(?:^.*lab.*bell)/)

brandRegex = '''(?x)
```

### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:^.*lab.*bell)`
in `subprojects/performance/src/files/pleac05_06.groovy`
#### Snippet
```java

// eliminate overlapping
assert !(string =~ /(?:^.*bell.*lab)|(?:^.*lab.*bell)/)

brandRegex = '''(?x)
```

## RuleId[id=ThrowableNotThrown]
### ThrowableNotThrown
Result of `createParsingFailedException()` not thrown
in `src/main/java/org/apache/groovy/parser/antlr4/AstBuilder.java`
#### Snippet
```java
                String propertyName = expression.getPropertyAsString();
                if (THIS_STR.equals(receiverText) && Arrays.stream(header).anyMatch(p -> p.getName().equals(propertyName))) {
                    createParsingFailedException("Cannot assign a value to final variable '" + propertyName + "'", expression.getProperty());
                }
                super.visitPropertyExpression(expression);
```

### ThrowableNotThrown
Result of `createParsingFailedException()` not thrown
in `src/main/java/org/apache/groovy/parser/antlr4/AstBuilder.java`
#### Snippet
```java
        if (isRecord) {
            classNode.getFields().stream().filter(f -> !isTrue(f, IS_RECORD_GENERATED) && !f.isStatic()).findFirst()
                    .ifPresent(fn -> this.createParsingFailedException("Instance field is not allowed in `record`", fn));
        }
        classNodeStack.pop();
```

### ThrowableNotThrown
Result of `tryClose()` not thrown
in `src/main/java/org/codehaus/groovy/runtime/DefaultGroovyMethodsSupport.java`
#### Snippet
```java
     */
    public static void closeWithWarning(Closeable closeable) {
        tryClose(closeable, true); // ignore result
    }

```

### ThrowableNotThrown
Result of `deepSanitize()` not thrown
in `src/main/java/groovy/ui/GroovyMain.java`
#### Snippet
```java
            System.err.println("Caught: " + e);
            if (!debug) {
                StackTraceUtils.deepSanitize(e);
            }
            e.printStackTrace();
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/org/codehaus/groovy/ast/decompiled/LazyFieldNode.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        lazyInit();
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/org/codehaus/groovy/ast/decompiled/LazyMethodNode.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj) {
        lazyInit();
        return delegate.equals(obj);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/org/codehaus/groovy/ast/decompiled/LazyConstructorNode.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj) {
        lazyInit();
        return delegate.equals(obj);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/org/codehaus/groovy/runtime/NullObject.java`
#### Snippet
```java
     */
    @Override
    public boolean equals(Object to) {
        return to == null;
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/org/codehaus/groovy/runtime/metaclass/OwnedMetaClass.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj) {
        return delegate.equals(obj);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/groovy/lang/Closure.java`
#### Snippet
```java
         */
        @Override
        public boolean equals(Object arg0) {
            return Closure.this.equals(arg0);
        }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/groovy/lang/ListWithDefault.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj) {
        return delegate.equals(obj);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/groovy/lang/MapWithDefault.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj) {
        return delegate.equals(obj);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/groovy/lang/DelegatingMetaClass.java`
#### Snippet
```java
     */
    @Override
    public boolean equals(Object obj) {
        return delegate.equals(obj);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/groovy/util/ObservableMap.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o) {
        return delegate.equals(o);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/groovy/util/ObservableList.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o) {
        return delegate.equals(o);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `subprojects/groovy-ant/src/main/java/org/codehaus/groovy/ant/AntProjectPropertiesDelegate.java`
#### Snippet
```java

    @Override
    public synchronized boolean equals(Object o) {
        return project.getProperties().equals(o);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `subprojects/groovy-json/src/main/java/org/apache/groovy/json/internal/LazyMap.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o) {
        buildIfNeeded();
        return map.equals(o);
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `subprojects/groovy-nio/src/main/java/org/apache/groovy/nio/runtime/WritablePath.java`
#### Snippet
```java

    @Override
    public boolean equals(Object other) {
        return delegate.equals(other);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `subprojects/groovy-sql/src/main/java/groovy/sql/GroovyRowResult.java`
#### Snippet
```java

    @Override
    public boolean equals(Object o) {
        return result.equals(o);
    }
```

### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `subprojects/groovy-xml/src/main/java/groovy/xml/slurpersupport/GPathResult.java`
#### Snippet
```java

    @Override
    public boolean equals(Object obj) {
        if (null == obj) {
            return false;
```

## RuleId[id=BigDecimalMethodWithoutRoundingCalled]
### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.divide()' called without a rounding mode argument
in `src/test/groovy/ClosureJavaIntegrationTest.java`
#### Snippet
```java
        Closure<? extends Number> closure = new Closure<BigDecimal>(c) {
            BigDecimal doCall(BigDecimal total, Integer next) {
                return total.add(BigDecimal.ONE.divide(new BigDecimal(next)));
            }
        };
```

### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.divide()' called without a rounding mode argument
in `src/main/java/org/codehaus/groovy/runtime/typehandling/BigDecimalMath.java`
#### Snippet
```java
        BigDecimal bigRight = toBigDecimal(right);
        try {
            return bigLeft.divide(bigRight);
        } catch (ArithmeticException e) {
            // set a DEFAULT precision if otherwise non-terminating
```

### BigDecimalMethodWithoutRoundingCalled
'BigDecimal.divide()' called without a rounding mode argument
in `subprojects/groovy-ginq/src/main/groovy/org/apache/groovy/ginq/provider/collection/runtime/QueryableCollection.java`
#### Snippet
```java

        if (0 == size % 2) {
            return num.add(sortedNumList.get(index - 1)).divide(BD_TWO);
        }

```

## RuleId[id=SuspiciousIndentAfterControlStatement]
### SuspiciousIndentAfterControlStatement
Suspicious indentation after 'if' statement
in `subprojects/groovy-groovydoc/src/main/java/org/codehaus/groovy/tools/groovydoc/SimpleGroovyClassDoc.java`
#### Snippet
```java
    private static String resolveMethodArgs(GroovyRootDoc rootDoc, SimpleGroovyClassDoc classDoc, String type) {
        if (!type.contains("(")) return type;
            Matcher m = NAME_ARGS_REGEX.matcher(type);
        if (m.matches()) {
            String name = m.group(1);
```

### SuspiciousIndentAfterControlStatement
Suspicious indentation after 'if' statement
in `subprojects/groovy-jmx/src/main/java/groovy/jmx/GroovyMBean.java`
#### Snippet
```java
        catch (Exception e) {
            if (!ignoreErrors)
            throwException("Could not access property: " + property + ". Reason: ", e);
        }
        return null;
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'node' to 'Expression'
in `subprojects/groovy-astbuilder/src/main/java/org/apache/groovy/ast/builder/AstBuilderTransformation.java`
#### Snippet
```java
                for (ASTNode node : ((TupleExpression) call.getArguments()).getExpressions()) {
                    if (!(node instanceof ClosureExpression)) {
                        result.add((Expression) node);
                    }
                }
```

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'next' to 'String'
in `subprojects/groovy-sql/src/main/java/groovy/sql/GroovyRowResult.java`
#### Snippet
```java
            if (!(next instanceof String))
                continue;
            if (keyStr.equalsIgnoreCase((String)next))
                return next;
        }
```

