# sorald 
 
# Bad smells
I found 76 bad smells with 9 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNCHECKED_WARNING | 29 | false |
| NullableProblems | 14 | false |
| UnnecessaryModifier | 6 | true |
| FieldMayBeFinal | 5 | false |
| ConstantValue | 3 | false |
| IgnoreResultOfCall | 3 | false |
| DataFlowIssue | 2 | false |
| DuplicatedCode | 2 | false |
| DanglingJavadoc | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| JavadocReference | 1 | false |
| UnnecessaryStringEscape | 1 | true |
| StringOperationCanBeSimplified | 1 | false |
| JavadocDeclaration | 1 | false |
| RedundantCast | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| UnnecessaryToStringCall | 1 | true |
| SuspiciousIndentAfterControlStatement | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `sorald-api/src/main/java/sorald/annotations/ProcessorAnnotation.java`
#### Snippet
```java
@Target(ElementType.TYPE)
public @interface ProcessorAnnotation {
    public String key();

    public String description();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `sorald-api/src/main/java/sorald/annotations/ProcessorAnnotation.java`
#### Snippet
```java
    public String key();

    public String description();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `sorald-api/src/main/java/sorald/api/RuleRepository.java`
#### Snippet
```java
     */
    @Nonnull
    public Collection<Rule> getHandledRulesByType(@Nonnull IRuleType... types);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `sorald-api/src/main/java/sorald/api/RuleRepository.java`
#### Snippet
```java
     */
    @Nonnull
    public Collection<Rule> getHandledRules();

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `sorald-api/src/main/java/sorald/api/RuleRepository.java`
#### Snippet
```java
     */
    @Nonnull
    public Collection<Rule> getRulesByType(@Nonnull IRuleType... types);

    /**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `sorald-api/src/main/java/sorald/api/RuleRepository.java`
#### Snippet
```java
     */
    @Nonnull
    public Collection<Rule> getAllRules();

    /**
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.declaration.CtMethod' to 'spoon.reflect.declaration.CtExecutable'
in `sorald/src/main/java/sorald/processor/BigDecimalDoubleConstructorProcessor.java`
#### Snippet
```java
            CtMethod valueOfMethod = (CtMethod) bigDecimalClass.getMethodsByName("valueOf").get(0);
            CtExecutableReference refToMethod =
                    getFactory().Executable().createReference(valueOfMethod);
            CtExpression arg = (CtExpression) cons.getArguments().get(0);
            CtInvocation newInvocation =
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtExecutableReference' to 'spoon.reflect.reference.CtExecutableReference'
in `sorald/src/main/java/sorald/processor/BigDecimalDoubleConstructorProcessor.java`
#### Snippet
```java
            CtExpression arg = (CtExpression) cons.getArguments().get(0);
            CtInvocation newInvocation =
                    getFactory().Code().createInvocation(invoker, refToMethod, arg);
            cons.replace(newInvocation);
        } else {
```

### UNCHECKED_WARNING
Unchecked call to 'set(int, E)' as a member of raw type 'java.util.List'
in `sorald/src/main/java/sorald/processor/BigDecimalDoubleConstructorProcessor.java`
#### Snippet
```java
            String argValue = arg.toString().replaceAll("[fFdD]", "");
            CtLiteral<String> literal = getFactory().Code().createLiteral(argValue);
            newCtConstructorCall.getArguments().set(0, literal);
            cons.replace(newCtConstructorCall);
        }
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.code.CtCodeSnippetExpression' to 'spoon.reflect.code.CtExpression'
in `sorald/src/main/java/sorald/processor/IteratorNextExceptionProcessor.java`
#### Snippet
```java
        CtCodeSnippetExpression expr = getFactory().Core().createCodeSnippetExpression();
        expr.setValue("!hasNext()");
        anIf.setCondition(expr);
        CtType noSuchElementClass = getFactory().Class().get(NoSuchElementException.class);
        CtThrow throwStmnt = getFactory().createCtThrow("");
```

### UNCHECKED_WARNING
Unchecked cast: 'spoon.reflect.code.CtConstructorCall' to 'spoon.reflect.code.CtExpression'
in `sorald/src/main/java/sorald/processor/IteratorNextExceptionProcessor.java`
#### Snippet
```java
        CtThrow throwStmnt = getFactory().createCtThrow("");
        throwStmnt.setThrownExpression(
                ((CtExpression<? extends Throwable>)
                        getFactory()
                                .createConstructorCall(
                                        noSuchElementClass.getReference(), new CtExpression[] {})));
        CtBlock block = getFactory().Core().createBlock();
        block.addStatement(throwStmnt);
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtTypeReference' to 'spoon.reflect.reference.CtTypeReference'. Reason: 'noSuchElementClass' has raw type, so result of getReference is erased
in `sorald/src/main/java/sorald/processor/IteratorNextExceptionProcessor.java`
#### Snippet
```java
                        getFactory()
                                .createConstructorCall(
                                        noSuchElementClass.getReference(), new CtExpression[] {})));
        CtBlock block = getFactory().Core().createBlock();
        block.addStatement(throwStmnt);
```

### UNCHECKED_WARNING
Unchecked cast: 'spoon.reflect.code.CtStatement' to 'spoon.reflect.code.CtReturn'
in `sorald/src/main/java/sorald/processor/ThreadLocalWithInitial.java`
#### Snippet
```java

    private <T> CtExpression<T> getReturnStatement(CtStatement statement) {
        return ((CtReturn<T>) statement).getReturnedExpression();
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.code.CtExpression' to 'spoon.reflect.code.CtExpression'. Reason: 'assignment' has raw type, so result of getAssignment is erased
in `sorald/src/main/java/sorald/processor/DeadStoreProcessor.java`
#### Snippet
```java
        CtVariable<?> decl = (CtVariable<?>) write.getVariable().getDeclaration().clone();
        CtAssignment assignment = write.getParent(CtAssignment.class);
        decl.setDefaultExpression(assignment.getAssignment());
        assignment.replace(decl);
    }
```

### UNCHECKED_WARNING
Unchecked call to 'setEventHandlers(List)' as a member of raw type 'sorald.processor.SoraldAbstractProcessor'
in `sorald/src/main/java/sorald/Repair.java`
#### Snippet
```java
        SoraldAbstractProcessor<?> processor = createBaseProcessor(ruleKey);
        if (processor != null) {
            return processor
                    .setMaxFixes(config.getMaxFixesPerRule())
                    .setEventHandlers(eventHandlers);
        }
        return null;
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.declaration.CtMethod' to 'spoon.reflect.declaration.CtExecutable'
in `sorald/src/main/java/sorald/processor/EqualsOnAtomicClassProcessor.java`
#### Snippet
```java
        CtMethod ctMethodToBeCalled = (CtMethod) atomicClass.getMethodsByName("get").get(0);
        CtExecutableReference ctExecutableReferenceToMethodToBeCalled =
                getFactory().Executable().createReference(ctMethodToBeCalled);

        CtInvocation leftInvocation =
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtExecutableReference' to 'spoon.reflect.reference.CtExecutableReference'
in `sorald/src/main/java/sorald/processor/EqualsOnAtomicClassProcessor.java`
#### Snippet
```java
                        .Code()
                        .createInvocation(
                                element.getTarget(), ctExecutableReferenceToMethodToBeCalled);
        CtInvocation rightInvocation =
                getFactory()
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtExecutableReference' to 'spoon.reflect.reference.CtExecutableReference'
in `sorald/src/main/java/sorald/processor/EqualsOnAtomicClassProcessor.java`
#### Snippet
```java
                        .createInvocation(
                                (CtExpression) element.getArguments().get(0),
                                ctExecutableReferenceToMethodToBeCalled);

        CtBinaryOperator newCtBinaryOperator =
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtFieldReference' to 'spoon.reflect.reference.CtVariableReference'
in `sorald/src/main/java/sorald/processor/XxeProcessingProcessor.java`
#### Snippet
```java
        fieldRead.setTarget(xmlConstantsAccess);
        CtFieldReference fieldRef = xmlConstants.getDeclaredField(constantName);
        fieldRead.setVariable(fieldRef);
        return fieldRead;
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.declaration.CtMethod' to 'spoon.reflect.declaration.CtMethod'
in `sorald/src/main/java/sorald/processor/XxeProcessingProcessor.java`
#### Snippet
```java
        CtTypeReference<?> returnType = returnExp.getType().getTypeDeclaration().getReference();
        CtMethod<T> method =
                getFactory()
                        .createMethod(
                                target,
                                modifiers,
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtVariableReference' to 'spoon.reflect.reference.CtVariableReference'. Reason: '((CtVariable) newField)' has raw type, so result of getReference is erased
in `sorald/src/main/java/sorald/processor/SynchronizationOnStringOrBoxedProcessor.java`
#### Snippet
```java
                    fieldRead.getVariable().getQualifiedName(),
                    ((CtVariable) newField).getReference());
            fieldRead.setVariable(((CtVariable) newField).getReference());
        } else {
            fieldRead.setVariable(old2NewFields.get(fieldRead.getVariable().getQualifiedName()));
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtVariableReference' to 'spoon.reflect.reference.CtVariableReference'
in `sorald/src/main/java/sorald/processor/SynchronizationOnStringOrBoxedProcessor.java`
#### Snippet
```java
            fieldRead.setVariable(((CtVariable) newField).getReference());
        } else {
            fieldRead.setVariable(old2NewFields.get(fieldRead.getVariable().getQualifiedName()));
        }
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.visitor.filter.TypeFilter' to 'spoon.reflect.visitor.Filter'
in `sorald/src/main/java/sorald/processor/SynchronizationOnStringOrBoxedProcessor.java`
#### Snippet
```java
            CtExecutable<?> method = ((CtInvocation) expression).getExecutable().getDeclaration();
            CtExpression<?> oldReturnExpression =
                    ((CtReturn) method.getElements(new TypeFilter(CtReturn.class)).get(0))
                            .getReturnedExpression();
            CtFieldRead<?> oldFieldRead = (CtFieldRead) oldReturnExpression;
```

### UNCHECKED_WARNING
Unchecked call to 'TypeFilter(Class)' as a member of raw type 'spoon.reflect.visitor.filter.TypeFilter'
in `sorald/src/main/java/sorald/processor/SynchronizationOnStringOrBoxedProcessor.java`
#### Snippet
```java
            CtExecutable<?> method = ((CtInvocation) expression).getExecutable().getDeclaration();
            CtExpression<?> oldReturnExpression =
                    ((CtReturn) method.getElements(new TypeFilter(CtReturn.class)).get(0))
                            .getReturnedExpression();
            CtFieldRead<?> oldFieldRead = (CtFieldRead) oldReturnExpression;
```

### UNCHECKED_WARNING
Unchecked call to 'setExecutable(CtExecutableReference)' as a member of raw type 'spoon.reflect.code.CtAbstractInvocation'
in `sorald/src/main/java/sorald/processor/SynchronizationOnStringOrBoxedProcessor.java`
#### Snippet
```java
            newMethod.setType((((CtType) factory.Class().get(Object.class)).getReference()));
            c.addMethod(newMethod);
            ((CtInvocation) expression).setExecutable(((CtExecutable) newMethod).getReference());

            CtExpression<?> returnExpression =
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.visitor.filter.TypeFilter' to 'spoon.reflect.visitor.Filter'
in `sorald/src/main/java/sorald/processor/SynchronizationOnStringOrBoxedProcessor.java`
#### Snippet
```java

            CtExpression<?> returnExpression =
                    ((CtReturn) newMethod.getElements(new TypeFilter(CtReturn.class)).get(0))
                            .getReturnedExpression();
            fieldRead4Update = (CtFieldRead) returnExpression;
```

### UNCHECKED_WARNING
Unchecked call to 'TypeFilter(Class)' as a member of raw type 'spoon.reflect.visitor.filter.TypeFilter'
in `sorald/src/main/java/sorald/processor/SynchronizationOnStringOrBoxedProcessor.java`
#### Snippet
```java

            CtExpression<?> returnExpression =
                    ((CtReturn) newMethod.getElements(new TypeFilter(CtReturn.class)).get(0))
                            .getReturnedExpression();
            fieldRead4Update = (CtFieldRead) returnExpression;
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtTypeReference' to 'spoon.reflect.reference.CtTypeReference'. Reason: 'arraysClass' has raw type, so result of getReference is erased
in `sorald/src/main/java/sorald/processor/ArrayHashCodeAndToStringProcessor.java`
#### Snippet
```java
        CtExpression prevTarget = element.getTarget();
        CtClass arraysClass = getFactory().Class().get(Arrays.class);
        CtTypeAccess<?> newTarget = getFactory().createTypeAccess(arraysClass.getReference());
        CtMethod method = null;
        if (element.getExecutable().getSignature().equals(Constants.HASHCODE_METHOD_NAME + "()")) {
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.declaration.CtMethod' to 'spoon.reflect.declaration.CtExecutable'
in `sorald/src/main/java/sorald/processor/ArrayHashCodeAndToStringProcessor.java`
#### Snippet
```java
            System.err.println("Unhandled case. Something went wrong.");
        }
        CtExecutableReference refToMethod = getFactory().Executable().createReference(method);
        CtInvocation newInvocation =
                getFactory().Code().createInvocation(newTarget, refToMethod, prevTarget);
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtExecutableReference' to 'spoon.reflect.reference.CtExecutableReference'
in `sorald/src/main/java/sorald/processor/ArrayHashCodeAndToStringProcessor.java`
#### Snippet
```java
        CtExecutableReference refToMethod = getFactory().Executable().createReference(method);
        CtInvocation newInvocation =
                getFactory().Code().createInvocation(newTarget, refToMethod, prevTarget);
        element.replace(newInvocation);
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtVariableReference' to 'spoon.reflect.reference.CtVariableReference'. Reason: '((CtVariable) field)' has raw type, so result of getReference is erased
in `sorald/src/main/java/sorald/processor/SelfAssignementProcessor.java`
#### Snippet
```java
            CtField<?> field = type.getField(leftExpression2Check.toString());
            if (field != null) {
                fieldRead.setVariable(((CtVariable) field).getReference());
                leftExpression2Check.replace(fieldRead);
            } else {
```

### UNCHECKED_WARNING
Unchecked cast: 'spoon.reflect.code.CtCatchVariable\>' to 'spoon.reflect.code.CtCatchVariable'
in `sorald/src/main/java/sorald/processor/InterruptedExceptionProcessor.java`
#### Snippet
```java
                factory.createCatchVariable(
                        refToInterruptedException, catchVariable.getSimpleName());
        newCatch.setParameter((CtCatchVariable<? extends Throwable>) newCatchVariable);

        CtTry tryOfViolatedCatcher = violatedCatch.getParent(CtTry.class);
```

### UNCHECKED_WARNING
Unchecked call to 'setTypeCasts(List\>)' as a member of raw type 'spoon.reflect.code.CtExpression'
in `sorald/src/main/java/sorald/processor/MathOnFloatProcessor.java`
#### Snippet
```java
            } else {
                if (isOperationBetweenFloats(binaryOperator)) {
                    binaryOperator
                            .getLeftHandOperand()
                            .setTypeCasts(List.of(getFactory().Type().doublePrimitiveType()));

                    /**
```

### UNCHECKED_WARNING
Unchecked cast: 'spoon.reflect.declaration.CtVariable' to 'spoon.reflect.code.CtLocalVariable'
in `sorald/src/main/java/sorald/processor/UnclosedResourcesProcessor.java`
#### Snippet
```java
        CtVariableReference<T> variableReference = variableWrite.getVariable();

        CtLocalVariable<A> localVariable = (CtLocalVariable<A>) variableReference.getDeclaration();
        CtLocalVariable<A> localVariableClone = localVariable.clone();
        localVariableClone.setAssignment(assignment.getAssignment().clone());
```

### UNCHECKED_WARNING
Unchecked call to 'setLeftHandOperand(CtExpression)' as a member of raw type 'spoon.reflect.code.CtBinaryOperator'
in `sorald/src/main/java/sorald/processor/CastArithmeticOperandProcessor.java`
#### Snippet
```java
                                        + ") "
                                        + element.getLeftHandOperand());
        element.setLeftHandOperand(newBinaryOperator);
        // A nicer code for the casting would be the next line. However, more parentheses are added
        // in
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `org.sonar.java.checks.CastArithmeticOperandCheck`
in `sorald/src/main/java/sorald/processor/CastArithmeticOperandProcessor.java`
#### Snippet
```java
     * @param violation A rule violation
     * @return The operator kind and type of the expression
     * @see org.sonar.java.checks.CastArithmeticOperandCheck
     */
    private Pair<BinaryOperatorKind, CtTypeReference<?>> getOpKindAndType(RuleViolation violation) {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Dereference of `filesList` may produce `NullPointerException`
in `sorald/src/main/java/sorald/segment/SoraldTreeBuilderAlgorithm.java`
#### Snippet
```java
            File[] filesList = currentDir.listFiles();
            Node fileNode = new Node(node);
            for (File f : filesList) {
                if (f.isDirectory()) {
                    node.getChildren().add(new Node(node, f.getAbsolutePath()));
```

### DataFlowIssue
Method invocation `getFirst` may produce `NullPointerException`
in `sorald/src/main/java/sorald/segment/FirstFitSegmentationAlgorithm.java`
#### Snippet
```java
                    int index = maxFiles - currentAddedFiles;
                    Pair<Node, Node> splitted = splitFileNode(node, index);
                    segment.add(splitted.getFirst());
                    resources4Repair.addFirst(splitted.getSecond());
                    segments.add(segment);
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `sorald/src/main/java/sorald/sonar/SonarProcessorRepository.java`
#### Snippet
```java
nS1656: Variables should not be self-assigned\nS1854: Unused assignments should be removed\nS1860: Synchronization should not be based on Strings or boxed primitives\nS1948: Fields in a \"Serializable\" class should either be transient or serializable\nS2057: Every class implementing Serializable should declare a static final serialVersionUID.\n\t(incomplete: This processor does not address the case where the class already has a serialVersionUID with a non long type.)\nS2095: Resources should be closed\nS2097: \"equals(Object obj)\" should test argument type\nS2111: \"BigDecimal(double)\" should not be used\nS2116: \"hashCode\" and \"toString\" should not be called on array instances\nS2142: \"InterruptedException\" should not be ignored\nS2164: Math should not be performed on floats\n\t(incomplete: does not cast the operands to double when the expected type of the result is float.)\nS2167: \"compareTo\" should not return \"Integer.MIN_VALUE\"\nS2184: Math operands should be cast before assignment\nS2204: \".equals()\" should not be used to test the values of \"Atomic\" classes\nS2225: \"toString()\" and \"clone()\" methods should not return null\n\t(incomplete: does not fix null returning clone())\nS2272: \"Iterator.next()\" methods should throw \"NoSuchElementException\"\nS2755: XML parsers should not be vulnerable to XXE attacks\n\t(incomplete: This processor is a WIP and currently supports a subset of rule 2755. See Sorald\'s documentation for details.)\nS3032: JEE applications should not \"getClassLoader\"\nS3067: \"getClass\" should not be used for synchronization\nS3984: Exception should not be created without being thrown\nS4065: \"ThreadLocal.withInitial\" should be preferred\nS4973: Strings and Boxed types should be compared using \"equals()\"";

    @Override
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `sorald-api/src/main/java/sorald/processor/SoraldAbstractProcessor.java`
#### Snippet
```java
                                new IllegalStateException(
                                        getClass().getName() + " does not have a key"))
                .toString();
    }

```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param classpath` tag description is missing
in `sorald/src/main/java/sorald/cli/RepairCommand.java`
#### Snippet
```java
     * @param ruleKey Key of the rule to mine violations of.
     * @param eventHandlers Event handlers to use for events.
     * @param classpath
     * @return All found warnings.
     */
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `expression.getParent(...)` to `CtType` is redundant
in `sorald/src/main/java/sorald/processor/SynchronizationOnGetClassProcessor.java`
#### Snippet
```java
        if (expression.toString().equals("getClass()")) {
            /* implicit this case */
            typeRef = ((CtType) expression.getParent(CtType.class)).getReference();
        } else {
            typeRef = ((CtInvocation) expression).getTarget().getType();
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `children` may be 'final'
in `sorald/src/main/java/sorald/segment/Node.java`
#### Snippet
```java
    private String rootPath;

    private LinkedList<Node> children;

    private List<String>
```

### FieldMayBeFinal
Field `hashCodesOfTypesUsingJEE` may be 'final'
in `sorald/src/main/java/sorald/processor/GetClassLoaderProcessor.java`
#### Snippet
```java
@ProcessorAnnotation(key = "S3032", description = "JEE applications should not \"getClassLoader\"")
public class GetClassLoaderProcessor extends SoraldAbstractProcessor<CtInvocation<?>> {
    private HashMap<Integer, Boolean> hashCodesOfTypesUsingJEE = new HashMap<Integer, Boolean>();

    @Override
```

### FieldMayBeFinal
Field `old2NewFields` may be 'final'
in `sorald/src/main/java/sorald/processor/SynchronizationOnStringOrBoxedProcessor.java`
#### Snippet
```java
public class SynchronizationOnStringOrBoxedProcessor
        extends SoraldAbstractProcessor<CtSynchronized> {
    private Map<String, CtVariableReference> old2NewFields;

    public SynchronizationOnStringOrBoxedProcessor() {
```

### FieldMayBeFinal
Field `ruleToViolations` may be 'final'
in `sorald/src/main/java/sorald/event/collectors/MinerStatisticsCollector.java`
#### Snippet
```java
    private long miningEndTime;

    private Map<String, List<WarningLocation>> ruleToViolations = new HashMap<>();

    @Override
```

### FieldMayBeFinal
Field `ruleTypes` may be 'final'
in `sorald/src/main/java/sorald/cli/MineCommand.java`
#### Snippet
```java
                    "One or more types of rules to check for (use ',' to separate multiple types). Choices: ${COMPLETION-CANDIDATES}",
            split = ",")
    private List<IRuleType> ruleTypes = new ArrayList<>();

    @Parameter(property = "handledRules")
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `sorald/src/main/java/sorald/processor/GetClassLoaderProcessor.java`
#### Snippet
```java
        Factory factory = element.getFactory();
        CtClass<?> c = factory.Class().get(Thread.class);
        CtTypeAccess<?> access = factory.createTypeAccess(c.getReference());
        CtMethod<?> method1 = c.getMethodsByName("currentThread").get(0);
```

### DuplicatedCode
Duplicated code
in `sorald/src/main/java/sorald/sonar/BestFitScanner.java`
#### Snippet
```java
        int[] lineSeps = element.getPosition().getCompilationUnit().getLineSeparatorPositions();
        int violationSourceStart =
                calculateSourcePos(violation.getStartLine(), violation.getStartCol(), lineSeps);
        int violationSourceEnd =
                calculateSourcePos(violation.getEndLine(), violation.getEndCol(), lineSeps);

        int elemSourceStart = element.getPosition().getSourceStart();
        int elemSourceEnd = element.getPosition().getSourceEnd();
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `replacement` is redundant
in `sorald/src/main/java/sorald/processor/DeadStoreProcessor.java`
#### Snippet
```java
            CtVariableWrite<?> varWrite =
                    (CtVariableWrite<?>) ((CtUnaryOperator<?>) element).getOperand();
            CtVariableRead<?> replacement = convertToVarRead(varWrite);
            return replacement;
        } else {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sorald/src/main/java/sorald/FileUtils.java`
#### Snippet
```java
    public static List<File> findFilesByExtension(File directory, String ext) throws IOException {
        if (!directory.isDirectory()) {
            throw new IllegalArgumentException(directory.toString() + " is not a directory");
        }
        try (Stream<Path> files = Files.walk(directory.toPath())) {
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `sorald-api/src/main/java/sorald/annotations/IncompleteProcessor.java`
#### Snippet
```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
/** Annotation to mark that a processor is only a partial fix for its associated rule. */
public @interface IncompleteProcessor {
    /**
```

### DanglingJavadoc
Dangling Javadoc comment
in `sorald/src/main/java/sorald/processor/MathOnFloatProcessor.java`
#### Snippet
```java
                            .setTypeCasts(List.of(getFactory().Type().doublePrimitiveType()));

                    /**
                     * We also set the type so that the other operand is not explicitly cast as JVM
                     * implicitly does that For example, `(double) a + (double) b` is equivalent to
```

## RuleId[id=NullableProblems]
### NullableProblems
Overridden methods are not annotated
in `sorald-api/src/main/java/sorald/api/ProcessorRepository.java`
#### Snippet
```java
     * @return A list of all available processors.
     */
    @Nonnull
    List<Class<? extends SoraldAbstractProcessor<?>>> getAllProcessors();
}
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `sorald/src/main/java/sorald/sonar/SonarRuleRepository.java`
#### Snippet
```java

    @Override
    public Collection<Rule> getHandledRulesByType(IRuleType... types) {
        Set<IRuleType> ruleTypes = Set.of(types);
        return getHandledRules().stream()
```

### NullableProblems
Not annotated parameter overrides @Nonnull parameter
in `sorald/src/main/java/sorald/sonar/SonarRuleRepository.java`
#### Snippet
```java

    @Override
    public Collection<Rule> getHandledRulesByType(IRuleType... types) {
        Set<IRuleType> ruleTypes = Set.of(types);
        return getHandledRules().stream()
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `sorald/src/main/java/sorald/sonar/SonarRuleRepository.java`
#### Snippet
```java

    @Override
    public Collection<Rule> getRulesByType(IRuleType... types) {
        var ruleTypes = Set.of(types);
        return getAllRules().stream()
```

### NullableProblems
Not annotated parameter overrides @Nonnull parameter
in `sorald/src/main/java/sorald/sonar/SonarRuleRepository.java`
#### Snippet
```java

    @Override
    public Collection<Rule> getRulesByType(IRuleType... types) {
        var ruleTypes = Set.of(types);
        return getAllRules().stream()
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `sorald/src/main/java/sorald/sonar/SonarRuleRepository.java`
#### Snippet
```java

    @Override
    public Collection<Rule> getHandledRules() {
        SonarProcessorRepository sonarRepo = new SonarProcessorRepository();
        return getAllRules().stream()
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `sorald/src/main/java/sorald/sonar/SonarRuleRepository.java`
#### Snippet
```java
     * @return All SonarJava rules.
     */
    public Collection<Rule> getAllRules() {
        Collection<SonarLintRuleDefinition> allRules =
                SonarLintEngine.getAllRulesDefinitionsByKey().values();
```

### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `sorald/src/main/java/sorald/sonar/SonarProcessorRepository.java`
#### Snippet
```java

    @Override
    public List<Class<? extends SoraldAbstractProcessor<?>>> getAllProcessors() {
        return new ArrayList<>(RULE_KEY_TO_PROCESSOR.values());
    }
```

### NullableProblems
Overridden methods are not annotated
in `sorald-api/src/main/java/sorald/api/RuleRepository.java`
#### Snippet
```java
     * @return All rules with any of the given types.
     */
    @Nonnull
    public Collection<Rule> getHandledRulesByType(@Nonnull IRuleType... types);
}
```

### NullableProblems
Overridden method parameters are not annotated
in `sorald-api/src/main/java/sorald/api/RuleRepository.java`
#### Snippet
```java
     */
    @Nonnull
    public Collection<Rule> getHandledRulesByType(@Nonnull IRuleType... types);
}

```

### NullableProblems
Overridden methods are not annotated
in `sorald-api/src/main/java/sorald/api/RuleRepository.java`
#### Snippet
```java
     * @return a collection of rules that are handled by Sorald.
     */
    @Nonnull
    public Collection<Rule> getHandledRules();

```

### NullableProblems
Overridden methods are not annotated
in `sorald-api/src/main/java/sorald/api/RuleRepository.java`
#### Snippet
```java
     * @return All rules with any of the given types.
     */
    @Nonnull
    public Collection<Rule> getRulesByType(@Nonnull IRuleType... types);

```

### NullableProblems
Overridden method parameters are not annotated
in `sorald-api/src/main/java/sorald/api/RuleRepository.java`
#### Snippet
```java
     */
    @Nonnull
    public Collection<Rule> getRulesByType(@Nonnull IRuleType... types);

    /**
```

### NullableProblems
Overridden methods are not annotated
in `sorald-api/src/main/java/sorald/api/RuleRepository.java`
#### Snippet
```java
     * @return a collection of all rules.
     */
    @Nonnull
    public Collection<Rule> getAllRules();

```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `handledRules` is always `true` when reached
in `sorald/src/main/java/sorald/rule/RuleProvider.java`
#### Snippet
```java
        // `handledRules` is redundant here, but I am leaving it for the sake of
        // readability.
        if (ruleTypes.isEmpty() && handledRules) {
            return new ArrayList<>(getHandledRules());
        }
```

### ConstantValue
Condition `!ruleTypes.isEmpty()` is always `true`
in `sorald/src/main/java/sorald/rule/RuleProvider.java`
#### Snippet
```java
        // `ruleTypes` is redundant here, but I am leaving it for the sake of
        // readability.
        if (!ruleTypes.isEmpty() && !handledRules) {
            return new ArrayList<>(getRulesByType(ruleTypes));
        }
```

### ConstantValue
Condition `!instanceOfFieldAccess` is always `true`
in `sorald/src/main/java/sorald/processor/SelfAssignementProcessor.java`
#### Snippet
```java
        if (instanceOfFieldAccess) {
            element.delete();
        } else if (!instanceOfFieldAccess && instanceOfVariableAccess) {
            CtField<?> field = type.getField(leftExpression2Check.toString());
            if (field != null) {
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `sorald/src/main/java/sorald/processor/ThreadLocalWithInitial.java`
#### Snippet
```java
                .filter(v -> v.getSimpleName().equals("initialValue"))
                .findFirst()
                .get();
    }
}
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `sorald/src/main/java/sorald/processor/DeadStoreProcessor.java`
#### Snippet
```java
        return statementLists.stream()
                .reduce((lhs, rhs) -> greedyFindDeepestCommonParent(lhs, rhs, depths))
                .get();
    }

```

## RuleId[id=SuspiciousIndentAfterControlStatement]
### SuspiciousIndentAfterControlStatement
Suspicious indentation after 'if' statement
in `sorald/src/main/java/sorald/miner/StatsOutputAnalyzer.java`
#### Snippet
```java

                if (!line.contains("not_cloned")) // a line like: RepoName: discover not_cloned
                totalRepos++;

                warningsOfCurRepo = 0;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `sorald/src/main/java/sorald/FileUtils.java`
#### Snippet
```java
        if (os.contains("Windows")) {
            File cacheDir = new File(home + "\\Cache\\sorald\\");
            cacheDir.mkdirs();
            return cacheDir;
        } else if (os.contains("Linux")) {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `sorald/src/main/java/sorald/FileUtils.java`
#### Snippet
```java
        } else if (os.contains("Linux")) {
            File cacheDir = new File(home + "/.cache/sorald/");
            cacheDir.mkdirs();
            return cacheDir;
        } else if (os.contains("Mac")) {
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `sorald/src/main/java/sorald/FileUtils.java`
#### Snippet
```java
        } else if (os.contains("Mac")) {
            File cacheDir = new File(home + "/Library/Caches/sorald/");
            cacheDir.mkdirs();
            return cacheDir;
        }
```

