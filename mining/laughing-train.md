# MartinWitt/laughing-train# Bad smells
I found 196 bad smells with 97 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| MethodMayBeStatic | 87 | true |
| PatternVariableCanBeUsed | 27 | false |
| StringConcatenationInsideStringBufferAppend | 16 | false |
| SimplifyStreamApiCallChains | 6 | false |
| SystemOutErr | 6 | false |
| UnnecessaryLocalVariable | 6 | true |
| RedundantStringFormatCall | 6 | false |
| DeprecatedIsStillUsed | 4 | false |
| UnnecessaryToStringCall | 4 | true |
| AssignmentToMethodParameter | 4 | false |
| ComparatorCombinators | 3 | false |
| ThrowablePrintStackTrace | 3 | false |
| ConstantConditions | 2 | false |
| OptionalUsedAsFieldOrParameterType | 2 | false |
| RedundantStreamOptionalCall | 2 | false |
| RedundantFieldInitialization | 2 | false |
| ReturnNull | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| CommentedOutCode | 1 | false |
| RefusedBequest | 1 | false |
| CatchMayIgnoreException | 1 | false |
| EnhancedSwitchMigration | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| TrivialStringConcatenation | 1 | false |
| SetReplaceableByEnumSet | 1 | false |
| NullableProblems | 1 | false |
| UtilityClassWithPublicConstructor | 1 | false |
| UnnecessaryBoxing | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| RedundantFileCreation | 1 | false |
## Blame
Bad smells by person and commit(**DO NOT SEE THIS AS ANY ATTACK**):
| Person | Bad Smells | 
| --- | --- | 
| Martin Wittlinger | 30 | 
| MartinWitt | 166 | 

## SimplifyStreamApiCallChains
### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/CollectionEmptyCheck.java`
#### Snippet
```java
        innvocation.stream()
                .filter(outer -> innvocation.stream().anyMatch(outer::hasParent))
                .collect(Collectors.toList())
                .forEach(innvocation::remove);
        return innvocation;
```

#### Blame
7f5a83e MartinWitt
### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                .distinct()
                .sorted((o1, o2) -> o1.getName().asText().compareTo(o2.getName().asText()))
                .collect(Collectors.toList());
        for (BadSmell badSmell : badSmells) {
            sb.append("## " + badSmell.getName().asText() + "\n");
```

#### Blame
7f5a83e MartinWitt
### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                .distinct()
                .sorted((o1, o2) -> o1.getName().asText().compareTo(o2.getName().asText()))
                .collect(Collectors.toList());
        for (BadSmell badSmell : badSmells) {
            sb.append("## " + badSmell.getName().asText() + "\n");
```

#### Blame
7f5a83e MartinWitt
### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/NonProtectedConstructorInAbstractClass.java`
#### Snippet
```java
                List<CtAnnotation<? extends Annotation>> annotations = constructor.getAnnotations().stream()
                        .map(CtAnnotation::clone)
                        .collect(Collectors.toList());
                String message = "Constructor " + constructor.getSignature() + " is now protected instead of public";
                String markdown = "Constructor `" + constructor.getSignature() + "` is now protected instead of public";
```

#### Blame
7f5a83e MartinWitt
### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/ProtectedMemberInFinalType.java`
#### Snippet
```java
            List<CtTypeMember> protectedMethods = type.getTypeMembers().stream()
                    .filter(CtModifiable::isProtected)
                    .collect(Collectors.toList());
            for (CtTypeMember ctMethod : protectedMethods) {
                ctMethod.removeModifier(ModifierKind.PROTECTED);
```

#### Blame
7f5a83e MartinWitt
### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
                .distinct()
                .sorted((o1, o2) -> o1.getName().asText().compareTo(o2.getName().asText()))
                .collect(Collectors.toList());
        for (BadSmell badSmell : badSmells) {
            sb.append("## " + badSmell.getName().asText() + "\n");
```

#### Blame
7f5a83e MartinWitt
## DeprecatedIsStillUsed
### DeprecatedIsStillUsed
Deprecated member 'withRemoveResultDir' is still used
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java

        @Deprecated
        public Builder withRemoveResultDir(boolean removeResultDir) {
            return this;
        }
```

#### Blame
7f5a83e MartinWitt
### DeprecatedIsStillUsed
Deprecated member 'Builder' is still used
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaRefactor.java`
#### Snippet
```java

    @Deprecated
    public static class Builder {

        private ChangeListener listener;
```

#### Blame
7f5a83e MartinWitt
### DeprecatedIsStillUsed
Deprecated member 'withCacheFolder' is still used
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaRefactor.java`
#### Snippet
```java

        @Deprecated
        public Builder withCacheFolder(String cacheFolder) {
            return this;
        }
```

#### Blame
7f5a83e MartinWitt
### DeprecatedIsStillUsed
Deprecated member 'analyze' is still used
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaRefactor.java`
#### Snippet
```java
     */
    @Deprecated
    public void analyze(Path projectRoot) {
        var runnerBuilder = new QodanaAnalyzer.Builder();
        settings.forEach(s -> s.accept(runnerBuilder));
```

#### Blame
fcfed1e MartinWitt
## CommentedOutCode
### CommentedOutCode
Commented out code (5 lines)
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                switchToCleanBranch(config, git);
                Changelog changelog = refactorFixPoint(sourceDirectory, tempRepoFolder);
                // Function<ChangeListener, TransformationProcessor<?>> qodanaRefactorFunction = setUpQodana(
                // 	sourceDirectory, tempRepoFolder, changeListener);
                // Changelog changelog = refactorFolderWithQodana(tempRepoFolder, changeListener,
```

#### Blame
28f4aec MartinWitt
## ComparatorCombinators
### ComparatorCombinators
Can be replaced with 'Comparator.comparing'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                .filter(v -> !v.isEmptyRule())
                .distinct()
                .sorted((o1, o2) -> o1.getName().asText().compareTo(o2.getName().asText()))
                .collect(Collectors.toList());
        for (BadSmell badSmell : badSmells) {
```

#### Blame
7f5a83e MartinWitt
### ComparatorCombinators
Can be replaced with 'Comparator.comparing'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                .filter(v -> !v.isEmptyRule())
                .distinct()
                .sorted((o1, o2) -> o1.getName().asText().compareTo(o2.getName().asText()))
                .collect(Collectors.toList());
        for (BadSmell badSmell : badSmells) {
```

#### Blame
7f5a83e MartinWitt
### ComparatorCombinators
Can be replaced with 'Comparator.comparing'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
                .filter(v -> !v.isEmptyRule())
                .distinct()
                .sorted((o1, o2) -> o1.getName().asText().compareTo(o2.getName().asText()))
                .collect(Collectors.toList());
        for (BadSmell badSmell : badSmells) {
```

#### Blame
7f5a83e MartinWitt
## RefusedBequest
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/NewLineAnnotation.java`
#### Snippet
```java

    @Override
    public NewLineAnnotation<A> clone() {
        return (NewLineAnnotation<A>) new NewLineAnnotation<>();
    }
```

#### Blame
fcfed1e MartinWitt
## PatternVariableCanBeUsed
### PatternVariableCanBeUsed
Variable 'other' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/history/Change.java`
#### Snippet
```java
            return false;
        }
        Change other = (Change) obj;
        return Objects.equals(affectedType, other.affectedType)
                && Objects.equals(badsmell, other.badsmell)
```

#### Blame
7f5a83e MartinWitt
### PatternVariableCanBeUsed
Variable 'localVariable' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/UnusedAssignment.java`
#### Snippet
```java
            var assigned = ctAssignment.getAssigned();
            if (assigned instanceof CtVariableWrite) {
                CtVariableWrite<?> localVariable = (CtVariableWrite<?>) assigned;
                if (element.getElements(new VariableAccessFilter<>(localVariable.getVariable()))
                        .isEmpty()) {
```

#### Blame
bba9f4e Martin Wittlinger
### PatternVariableCanBeUsed
Variable 'compilationUnit' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/formatting/ImportGrouper.java`
#### Snippet
```java
    public void process(CtElement element) {
        if (element instanceof CtCompilationUnit) {
            CtCompilationUnit compilationUnit = (CtCompilationUnit) element;
            compilationUnit.setImports(cloneImports(compilationUnit));
        }
```

#### Blame
7f5a83e MartinWitt
### PatternVariableCanBeUsed
Variable 'typeReference' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/ImportHelper.java`
#### Snippet
```java
        for (CtImport ctImport : imports) {
            if (ctImport.getReference() instanceof CtTypeReference) {
                CtTypeReference<?> typeReference = (CtTypeReference<?>) ctImport.getReference();
                if (typeReference.getQualifiedName().equals(importString)) {
                    removalableImports.add(ctImport);
```

#### Blame
7f5a83e MartinWitt
### PatternVariableCanBeUsed
Variable 'executableReference' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/ImportHelper.java`
#### Snippet
```java
            }
            if (ctImport.getReference() instanceof CtExecutableReference) {
                CtExecutableReference<?> executableReference = (CtExecutableReference<?>) ctImport.getReference();
                String simpleName = importString.substring(importString.lastIndexOf('.') + 1);
                if (executableReference.getSimpleName().equals(simpleName)) {
```

#### Blame
7f5a83e MartinWitt
### PatternVariableCanBeUsed
Variable 'assignment' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/InstantReturn.java`
#### Snippet
```java
                CtStatement statement = body.getStatement(index);
                if (statement instanceof CtAssignment) {
                    CtAssignment<?, ?> assignment = (CtAssignment<?, ?>) statement;
                    if (assignment.getAssigned().equals(ctReturn.getReturnedExpression())) {
                        ctReturn.setReturnedExpression((CtExpression) assignment.getAssignment());
```

#### Blame
bba9f4e Martin Wittlinger
### PatternVariableCanBeUsed
Variable 'returnStatement' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/InstantReturn.java`
#### Snippet
```java

        if (element.getBody().getLastStatement() instanceof CtReturn) {
            CtReturn<?> returnStatement = (CtReturn<?>) element.getBody().getLastStatement();
            int size = body.getStatements().size();
            CtStatement statement = body.getStatement(size - 2);
```

#### Blame
7f5a83e MartinWitt
### PatternVariableCanBeUsed
Variable 'ifStatement' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/InstantReturn.java`
#### Snippet
```java
            CtStatement statement = body.getStatement(size - 2);
            if (statement instanceof CtIf) {
                CtIf ifStatement = (CtIf) statement;
                CtStatement thenStatement = ifStatement.getThenStatement();
                if (thenStatement instanceof CtBlock) {
```

#### Blame
7f5a83e MartinWitt
### PatternVariableCanBeUsed
Variable 'thenBlock' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/InstantReturn.java`
#### Snippet
```java
                CtStatement thenStatement = ifStatement.getThenStatement();
                if (thenStatement instanceof CtBlock) {
                    CtBlock<?> thenBlock = (CtBlock<?>) thenStatement;
                    if (thenBlock.getStatements().size() == 1 && thenBlock.getStatement(0) instanceof CtReturn) {
                        CtReturn<?> ifReturnStatement = (CtReturn<?>) thenBlock.getStatement(0);
```

#### Blame
7f5a83e MartinWitt
### PatternVariableCanBeUsed
Variable 'ifReturnStatement' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/InstantReturn.java`
#### Snippet
```java
                    CtBlock<?> thenBlock = (CtBlock<?>) thenStatement;
                    if (thenBlock.getStatements().size() == 1 && thenBlock.getStatement(0) instanceof CtReturn) {
                        CtReturn<?> ifReturnStatement = (CtReturn<?>) thenBlock.getStatement(0);
                    }
                }
```

#### Blame
7f5a83e MartinWitt
### PatternVariableCanBeUsed
Variable 'binaryOperator' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertTrueSameCheck.java`
#### Snippet
```java
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
                CtBinaryOperator<?> binaryOperator = (CtBinaryOperator<?>) expression;
                if (binaryOperator.getKind().equals(BinaryOperatorKind.EQ)) {
                    CtInvocation<?> junit5AssertNotNull = createJunit5AssertSame(
```

#### Blame
bba9f4e Martin Wittlinger
### PatternVariableCanBeUsed
Variable 'equalsInvocation' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertTrueEqualsCheck.java`
#### Snippet
```java
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtInvocation) {
                CtInvocation<?> equalsInvocation = (CtInvocation<?>) expression;
                if (equalsInvocation.getExecutable().getSimpleName().equals("equals")) {
                    CtExpression<?> firstArgument = equalsInvocation.getTarget();
```

#### Blame
bba9f4e Martin Wittlinger
### PatternVariableCanBeUsed
Variable 'equalsInvocation' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertFalseEqualsCheck.java`
#### Snippet
```java
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtInvocation) {
                CtInvocation<?> equalsInvocation = (CtInvocation<?>) expression;
                if (equalsInvocation.getExecutable().getSimpleName().equals("equals")) {
                    CtExpression<?> firstArgument = equalsInvocation.getTarget();
```

#### Blame
bba9f4e Martin Wittlinger
### PatternVariableCanBeUsed
Variable 'fieldRef' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java
        }
        if (ref instanceof CtFieldReference) {
            CtFieldReference fieldRef = (CtFieldReference) ref;
            return fieldRef.getDeclaringType().getQualifiedName() + "." + fieldRef.getSimpleName();
        }
```

#### Blame
7f5a83e MartinWitt
### PatternVariableCanBeUsed
Variable 'execRef' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java
        }
        if (ref instanceof CtExecutableReference) {
            CtExecutableReference execRef = (CtExecutableReference) ref;
            return execRef.getDeclaringType().getQualifiedName() + "." + execRef.getSimpleName();
        }
```

#### Blame
7f5a83e MartinWitt
### PatternVariableCanBeUsed
Variable 'wildRef' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java
        }
        if (ref instanceof CtTypeMemberWildcardImportReference) {
            CtTypeMemberWildcardImportReference wildRef = (CtTypeMemberWildcardImportReference) ref;
            return wildRef.getTypeReference().getQualifiedName() + ".*";
        }
```

#### Blame
7f5a83e MartinWitt
### PatternVariableCanBeUsed
Variable 'typeRef' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java
        }
        if (ref instanceof CtTypeReference) {
            CtTypeReference typeRef = (CtTypeReference) ref;
            return typeRef.getQualifiedName();
        }
```

#### Blame
7f5a83e MartinWitt
### PatternVariableCanBeUsed
Variable 'invocation' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java

            } else if (targetedExpression instanceof CtInvocation<?>) {
                CtInvocation<?> invocation = (CtInvocation<?>) targetedExpression;
                // import static method
                if (invocation.getExecutable().isStatic()) {
```

#### Blame
bba9f4e Martin Wittlinger
### PatternVariableCanBeUsed
Variable 'fieldAccess' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java
            } else if (targetedExpression instanceof CtFieldAccess<?>) {
                // import static field
                CtFieldAccess<?> fieldAccess = (CtFieldAccess<?>) targetedExpression;
                if (fieldAccess.getVariable().isStatic()) {
                    context.addImport(fieldAccess.getVariable());
```

#### Blame
bba9f4e Martin Wittlinger
### PatternVariableCanBeUsed
Variable 'ctReturn' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/UnnecessaryLocalVariable.java`
#### Snippet
```java
                    if (block.getStatements().size() > index + 1
                            && block.getStatements().get(index + 1) instanceof CtReturn) {
                        CtReturn<?> ctReturn =
                                (CtReturn<?>) block.getStatements().get(index + 1);
                        if (ctReturn.getReturnedExpression() instanceof CtVariableRead) {
```

#### Blame
1f6b8d9 MartinWitt
### PatternVariableCanBeUsed
Variable 'invocation' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/StringBuilderDirectUse.java`
#### Snippet
```java
    public void process(CtInvocation<?> element) {
        if (targetIsStringType(element) && element.getTarget() instanceof CtInvocation) {
            CtInvocation<?> invocation = (CtInvocation<?>) element.getTarget();
            if (targetIsStringBuilder(invocation) && stringBuilderHasMethod(element)) {
                element.setTarget(invocation.getTarget());
```

#### Blame
7f5a83e MartinWitt
### PatternVariableCanBeUsed
Variable 'fieldRead' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/ExpectedExceptionRemoval.java`
#### Snippet
```java
    private boolean isNoneType(CtExpression<?> value) {
        if (value instanceof CtFieldRead) {
            CtFieldRead<?> fieldRead = (CtFieldRead<?>) value;
            return fieldRead.getVariable().getDeclaringType().getSimpleName().equals("None");
        }
```

#### Blame
7f5a83e MartinWitt
### PatternVariableCanBeUsed
Variable 'binaryOperator' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertNullTransformation.java`
#### Snippet
```java
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
                CtBinaryOperator<?> binaryOperator = (CtBinaryOperator<?>) expression;
                if (binaryOperator.getKind().equals(BinaryOperatorKind.EQ)) {
                    CtExpression<?> check = findTestingExpression(binaryOperator);
```

#### Blame
bba9f4e Martin Wittlinger
### PatternVariableCanBeUsed
Variable 'methodRef' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/MethodMayBeStatic.java`
#### Snippet
```java
                CtExecutable<?> exec = executableRef.getExecutable().getExecutableDeclaration();
                if (exec instanceof CtMethod) {
                    CtMethod<?> methodRef = (CtMethod<?>) exec;
                    if (methodRef.equals(method)) {
                        CtTypeReference<Object> typeReference = method.getFactory()
```

#### Blame
7f5a83e MartinWitt
### PatternVariableCanBeUsed
Variable 'binaryOperator' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertFalseSameCheck.java`
#### Snippet
```java
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
                CtBinaryOperator<?> binaryOperator = (CtBinaryOperator<?>) expression;
                if (binaryOperator.getKind().equals(BinaryOperatorKind.EQ)) {
                    CtInvocation<?> junit5AssertNotNull = createJunit5AssertSame(
```

#### Blame
bba9f4e Martin Wittlinger
### PatternVariableCanBeUsed
Variable 'targetedExpression' can be replaced with pattern variable
in `code-transformation/src/main/java/spoon/reflect/visitor/ImportAnalyzer.java`
#### Snippet
```java

        if (element instanceof CtTargetedExpression) {
            CtTargetedExpression<?, ?> targetedExpression = (CtTargetedExpression<?, ?>) element;
            handleTargetedExpression(targetedExpression, context);
        } else if (element instanceof CtTypeReference<?>) {
```

#### Blame
7f5a83e MartinWitt
### PatternVariableCanBeUsed
Variable 'binaryOperator' can be replaced with pattern variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertNotNullTransformation.java`
#### Snippet
```java
            CtExpression<?> expression = element.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
                CtBinaryOperator<?> binaryOperator = (CtBinaryOperator<?>) expression;
                if (binaryOperator.getKind().equals(BinaryOperatorKind.NE)) {
                    CtExpression<?> check = findTestingExpression(binaryOperator);
```

#### Blame
bba9f4e Martin Wittlinger
## CatchMayIgnoreException
### CatchMayIgnoreException
'catch' parameter named `ignore` is used
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/mining/MiningCommand.java`
#### Snippet
```java
                                "Update mining results for " + repoName,
                                "gh-mining");
            } catch (Exception ignore) {
                logger.atSevere().withCause(ignore).log("Error while updating mining results");
                try {
```

#### Blame
b8b65b8 MartinWitt
## EnhancedSwitchMigration
### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportComparator.java`
#### Snippet
```java
    private int getImportKindOrder(CtImportKind importKind) {

        switch (importKind) {
            case TYPE:
            case ALL_TYPES:
```

#### Blame
7f5a83e MartinWitt
## StringBufferReplaceableByString
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                git.close();
                PrintStream foo = new PrintStream(new File(tempRepoFolder, "changelog.md"));
                StringBuilder sb = new StringBuilder();
                foo.print(sb);
            } catch (IOException | GitAPIException e) {
```

#### Blame
28f4aec MartinWitt
## TrivialStringConcatenation
### TrivialStringConcatenation
Empty string used in concatenation
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/UnnecessaryToStringCall.java`
#### Snippet
```java
        for (CtInvocation<?> toStringInvocations : type.getElements(new InvocationFilter(toStringMethod))) {
            if (isAlmostMatch(toStringInvocations)) {
                String oldInvocation = "" + toStringInvocations.toString();
                toStringInvocations.replace(toStringInvocations.getTarget());
                toStringInvocations
```

#### Blame
fcfed1e MartinWitt
## ConstantConditions
### ConstantConditions
Method invocation `getPath` may produce `NullPointerException`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/config/ConfigStore.java`
#### Snippet
```java
        property = new Properties();
        URL rootPath = Thread.currentThread().getContextClassLoader().getResource(CONFIG_FILE_NAME);
        String appConfigPath = URLDecoder.decode(rootPath.getPath(), StandardCharsets.UTF_8);
        try (FileInputStream configFile = new FileInputStream(new File(appConfigPath))) {
            property.load(configFile);
```

#### Blame
bba9f4e Martin Wittlinger
### ConstantConditions
Argument `url` might be null
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java
            var url = this.getClass().getResource("/qodana.yml");
            File copyQodanaRules = new File(sourceRoot.toString(), "qodana.yaml");
            FileUtils.copyURLToFile(url, copyQodanaRules);
        } catch (IOException e) {
            logger.atSevere().withCause(e).log("Could not write qodana.yaml");
```

#### Blame
7f5a83e MartinWitt
## UnnecessaryToStringCall
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/CollectionEmptyCheck.java`
#### Snippet
```java
        CtType<?> parent = element.getParent(CtType.class).getTopLevelType();
        String raw = "Replaced " + element + " with " + innvocation.toString();
        String markdown = "Replaced `" + element + "` with `" + innvocation.toString() + "`";
        setChanged(parent, new Change(COLLECTION_EMPTY_CHECK, MarkdownString.fromMarkdown(raw, markdown), parent));
    }
```

#### Blame
bba9f4e Martin Wittlinger
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/UnnecessaryToStringCall.java`
#### Snippet
```java
        for (CtInvocation<?> toStringInvocations : type.getElements(new InvocationFilter(toStringMethod))) {
            if (isAlmostMatch(toStringInvocations)) {
                String oldInvocation = "" + toStringInvocations.toString();
                toStringInvocations.replace(toStringInvocations.getTarget());
                toStringInvocations
```

#### Blame
fcfed1e MartinWitt
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java
            TransformationEngine transformationEngine = new TransformationEngine(List.of(function));
            transformationEngine.setChangeListener(changeListener);
            System.out.println("refactorRepo: " + dir.toString() + "/" + config.getSrcFolder());
            transformationEngine.applyToGivenPath(dir.toString() + "/" + config.getSrcFolder());
        } catch (Exception e) {
```

#### Blame
7f5a83e MartinWitt
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java
            transformationEngine.setChangeListener(changeListener);
            System.out.println("refactorRepo: " + dir.toString() + "/" + config.getSrcFolder());
            transformationEngine.applyToGivenPath(dir.toString() + "/" + config.getSrcFolder());
        } catch (Exception e) {
            logger.atSevere().withCause(e).log("Failed to refactor repo");
```

#### Blame
7f5a83e MartinWitt
## SetReplaceableByEnumSet
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `code-transformation/src/main/java/spoon/reflect/visitor/ImportAnalyzer.java`
#### Snippet
```java

    // The set of roles whose values are always kept implicit
    protected static Set<CtRole> IGNORED_ROLES_WHEN_IMPLICIT = new HashSet<>(Arrays.asList(
            // e.g. List<String> s = new ArrayList</*keep me implicit*/>();
            CtRole.TYPE_ARGUMENT,
```

#### Blame
bba9f4e Martin Wittlinger
## NullableProblems
### NullableProblems
Overridden methods are not annotated
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/RepoCheckout.java`
#### Snippet
```java
     * @return  the path to the checked out repo.
     */
    @Nonnull
    File prepareRepo();
}
```

#### Blame
03daa0e MartinWitt
## UtilityClassWithPublicConstructor
### UtilityClassWithPublicConstructor
Class `CommitBuilder` has only 'static' members, and a 'public' constructor
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class CommitBuilder {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
```

#### Blame
bba9f4e Martin Wittlinger
## UnnecessaryBoxing
### UnnecessaryBoxing
Redundant boxing inside `Boolean.valueOf(property.getProperty("changelog.markdown"))`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/config/ConfigStore.java`
#### Snippet
```java

    public boolean getPrintMarkdown() {
        return Boolean.valueOf(property.getProperty("changelog.markdown"));
    }

```

#### Blame
7f5a83e MartinWitt
## OptionalUsedAsFieldOrParameterType
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'cacheFolder'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java
        private String resultPathString = resultFolder + "/qodana.sarif.json";
        private String sourceFileRoot = "./src/main/java";
        private Optional<String> cacheFolder = Optional.empty();

        public Builder withResultFolder(String resultFolder) {
```

#### Blame
7f5a83e MartinWitt
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'qodanaCache'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java
    private String resultPathString;
    private String sourceFileRoot;
    private Optional<String> qodanaCache;

    private QodanaAnalyzer(Builder builder) {
```

#### Blame
7f5a83e MartinWitt
## SystemOutErr
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
    public static Changelog refactorFixPoint(String sourceDirectory, File tempRepoFolder) {
        Changelog startPoint = applyQodana(sourceDirectory, tempRepoFolder, true);
        System.out.println(startPoint.getChanges().size());
        do {
            Changelog iterativeResult = applyQodana(sourceDirectory, tempRepoFolder, true);
```

#### Blame
28f4aec MartinWitt
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
            }
            startPoint.getChanges().addAll(newChanges);
            System.out.println("New changes");
            for (Change change : newChanges) {
                System.out.println(change.getChangeText().asText());
```

#### Blame
7f5a83e MartinWitt
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
            System.out.println("New changes");
            for (Change change : newChanges) {
                System.out.println(change.getChangeText().asText());
            }
        } while (!startPoint.getChanges().isEmpty());
```

#### Blame
7f5a83e MartinWitt
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java
        try {
            var results = qodanaService.runQodana(repoUrl, dir);
            System.out.println(config.getActiveRules());
            Function<ChangeListener, TransformationProcessor<?>> function =
                    (v -> new QodanaRefactor(config.getActiveRules(), v, results));
```

#### Blame
7f5a83e MartinWitt
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java
            TransformationEngine transformationEngine = new TransformationEngine(List.of(function));
            transformationEngine.setChangeListener(changeListener);
            System.out.println("refactorRepo: " + dir.toString() + "/" + config.getSrcFolder());
            transformationEngine.applyToGivenPath(dir.toString() + "/" + config.getSrcFolder());
        } catch (Exception e) {
```

#### Blame
7f5a83e MartinWitt
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java

    void onConfigEdit(@Issue.Edited GHEventPayload.Issue issueComment) throws IOException {
        System.out.println("onEditConfig");
        if (isNotConfigIssue(issueComment)
                || !userWhitelist.isWhitelisted(GitHubUtils.getLogin(issueComment))
```

#### Blame
7f5a83e MartinWitt
## RedundantStreamOptionalCall
### RedundantStreamOptionalCall
Redundant 'distinct()' call: stream contains at most one element
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                .map(Change::getBadSmell)
                .filter(v -> !v.isEmptyRule())
                .distinct()
                .sorted((o1, o2) -> o1.getName().asText().compareTo(o2.getName().asText()))
                .collect(Collectors.toList());
```

#### Blame
7f5a83e MartinWitt
### RedundantStreamOptionalCall
Redundant 'distinct()' call: stream contains at most one element
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                .map(BadSmell::getName)
                .map(MarkdownString::asText)
                .distinct()
                .collect(Collectors.joining("\n"));
    }
```

#### Blame
7f5a83e MartinWitt
## UnnecessaryFullyQualifiedName
### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/NewLineAnnotation.java`
#### Snippet
```java

    /** (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
```

#### Blame
1a113d4 Martin Wittlinger
## ThrowablePrintStackTrace
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/MentionCommands.java`
#### Snippet
```java
                        ghPullRequest.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
```

#### Blame
30442df MartinWitt
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java
            return relative.toString().replace('\\', '/');
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
```

#### Blame
7f5a83e MartinWitt
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/Config.java`
#### Snippet
```java
            options = markdownPrinter.toYamlMarkdown(MAPPER.writeValueAsString(this));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        String configString =
```

#### Blame
7f5a83e MartinWitt
## RedundantFieldInitialization
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java
        Iterator<CtImport> iter = imports.iterator();
        class Visitor extends CtAbstractImportVisitor {
            boolean found = false;

            @Override
```

#### Blame
7f5a83e MartinWitt
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/Refactoring.java`
#### Snippet
```java
        private List<AfterRefactorStep> afterRefactorStep = new ArrayList<>();
        private ChangeListener listener = new ChangeListener();
        private IPrinting printing = null;
        private String subProjectSuffix = "";

```

#### Blame
7f5a83e MartinWitt
## AssignmentToMethodParameter
### AssignmentToMethodParameter
Assignment to method parameter `sourceRoot`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java
    @Deprecated
    public List<AnalyzerResult> runQodanaNoCacheDelete(Path sourceRoot) {
        sourceRoot = fixWindowsPath(sourceRoot);
        logger.atInfo().log("Running Qodana on %s", sourceRoot);
        copyQodanaRules(sourceRoot);
```

#### Blame
7f5a83e MartinWitt
### AssignmentToMethodParameter
Assignment to method parameter `sourceRoot`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java
                .endsWith(Path.of("/src/main/java").toString())) {
            if (sourceRoot.getRoot() == null) {
                sourceRoot = sourceRoot.subpath(0, sourceRoot.getNameCount() - 3);
            } else {
                sourceRoot = Paths.get(
```

#### Blame
7f5a83e MartinWitt
### AssignmentToMethodParameter
Assignment to method parameter `sourceRoot`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java
                sourceRoot = sourceRoot.subpath(0, sourceRoot.getNameCount() - 3);
            } else {
                sourceRoot = Paths.get(
                        sourceRoot.getRoot().toString(),
                        sourceRoot.subpath(0, sourceRoot.getNameCount() - 3).toString());
```

#### Blame
a3bdd03 Martin Wittlinger
### AssignmentToMethodParameter
Assignment to method parameter `sourceRoot`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java

    public List<AnalyzerResult> runQodana(Path sourceRoot) {
        sourceRoot = fixWindowsPath(sourceRoot);
        logger.atInfo().log("Running Qodana on %s", sourceRoot);
        copyQodanaRules(sourceRoot);
```

#### Blame
7f5a83e MartinWitt
## ReturnNull
### ReturnNull
Return of `null`
in `code-transformation/src/main/java/spoon/reflect/visitor/ImportAnalyzer.java`
#### Snippet
```java
    protected static <T extends CtElement> T getParentIfType(CtElement element, Class<T> type) {
        if (element == null || !element.isParentInitialized()) {
            return null;
        }
        CtElement parent = element.getParent();
```

#### Blame
7f5a83e MartinWitt
### ReturnNull
Return of `null`
in `code-transformation/src/main/java/spoon/reflect/visitor/ImportAnalyzer.java`
#### Snippet
```java
            return type.cast(parent);
        }
        return null;
    }
}
```

#### Blame
7f5a83e MartinWitt
## UnnecessaryLocalVariable
### UnnecessaryLocalVariable
Local variable `junit5AssertTrue` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertTrueSameCheck.java`
#### Snippet
```java
    public void process(CtInvocation<?> invocation) {
        if (invocation.getExecutable() != null && JunitHelper.isJunit5AssertTrue(invocation.getExecutable())) {
            CtInvocation<?> junit5AssertTrue = invocation;
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
```

#### Blame
bba9f4e Martin Wittlinger
### UnnecessaryLocalVariable
Local variable `junit5AssertTrue` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertTrueEqualsCheck.java`
#### Snippet
```java
    public void process(CtInvocation<?> invocation) {
        if (invocation.getExecutable() != null && JunitHelper.isJunit5AssertTrue(invocation.getExecutable())) {
            CtInvocation<?> junit5AssertTrue = invocation;
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtInvocation) {
```

#### Blame
bba9f4e Martin Wittlinger
### UnnecessaryLocalVariable
Local variable `junit5AssertTrue` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertFalseEqualsCheck.java`
#### Snippet
```java
    public void process(CtInvocation<?> invocation) {
        if (invocation.getExecutable() != null && JunitHelper.isJunit5AssertFalse(invocation.getExecutable())) {
            CtInvocation<?> junit5AssertTrue = invocation;
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtInvocation) {
```

#### Blame
bba9f4e Martin Wittlinger
### UnnecessaryLocalVariable
Local variable `junit5AssertTrue` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertNullTransformation.java`
#### Snippet
```java
    public void process(CtInvocation<?> invocation) {
        if (invocation.getExecutable() != null && JunitHelper.isJunit5AssertTrue(invocation.getExecutable())) {
            CtInvocation<?> junit5AssertTrue = invocation;
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
```

#### Blame
bba9f4e Martin Wittlinger
### UnnecessaryLocalVariable
Local variable `junit5AssertTrue` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertFalseSameCheck.java`
#### Snippet
```java
    public void process(CtInvocation<?> invocation) {
        if (invocation.getExecutable() != null && JunitHelper.isJunit5AssertFalse(invocation.getExecutable())) {
            CtInvocation<?> junit5AssertTrue = invocation;
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
```

#### Blame
bba9f4e Martin Wittlinger
### UnnecessaryLocalVariable
Local variable `junit5AssertTrue` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertNotNullTransformation.java`
#### Snippet
```java
    public void process(CtInvocation<?> element) {
        if (element.getExecutable() != null && JunitHelper.isJunit5AssertTrue(element.getExecutable())) {
            CtInvocation<?> junit5AssertTrue = element;
            CtExpression<?> expression = element.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
```

#### Blame
bba9f4e Martin Wittlinger
## RedundantStringFormatCall
### RedundantStringFormatCall
Redundant call to `format()`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertTrueSameCheck.java`
#### Snippet
```java
                parent,
                new Change(
                        String.format("Replaced assertTrue checking same with assertSame"),
                        "assertTrue with equals instead of assertSame",
                        parent));
```

#### Blame
7f5a83e MartinWitt
### RedundantStringFormatCall
Redundant call to `format()`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertTrueEqualsCheck.java`
#### Snippet
```java
                parent,
                new Change(
                        String.format("Replaced assertTrue checking equals with assertEquals"),
                        "AssertTrue with equals instead of AssertEquals",
                        parent));
```

#### Blame
7f5a83e MartinWitt
### RedundantStringFormatCall
Redundant call to `format()`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertFalseEqualsCheck.java`
#### Snippet
```java
                parent,
                new Change(
                        String.format("Replaced assertFalse checking equals with assertNotEquals"),
                        "assertFalse with equals instead of assertNotEquals",
                        parent));
```

#### Blame
7f5a83e MartinWitt
### RedundantStringFormatCall
Redundant call to `format()`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertNullTransformation.java`
#### Snippet
```java
                parent,
                new Change(
                        String.format("Replaced nullcheck in assertTrue with assertNull"),
                        "AssertTrue instead of AssertNull",
                        parent));
```

#### Blame
7f5a83e MartinWitt
### RedundantStringFormatCall
Redundant call to `format()`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertFalseSameCheck.java`
#### Snippet
```java
                parent,
                new Change(
                        String.format("Replaced assertFalse checking not same with assertNotSame"),
                        "assertFalse with not equals instead of assertNotSame",
                        parent));
```

#### Blame
7f5a83e MartinWitt
### RedundantStringFormatCall
Redundant call to `format()`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertNotNullTransformation.java`
#### Snippet
```java
                parent,
                new Change(
                        String.format("Replaced not nullcheck in assertTrue with assertNotNull"),
                        "AssertTrue instead of AssertNotNull",
                        parent));
```

#### Blame
7f5a83e MartinWitt
## RedundantFileCreation
### RedundantFileCreation
`new File` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/config/ConfigStore.java`
#### Snippet
```java
        URL rootPath = Thread.currentThread().getContextClassLoader().getResource(CONFIG_FILE_NAME);
        String appConfigPath = URLDecoder.decode(rootPath.getPath(), StandardCharsets.UTF_8);
        try (FileInputStream configFile = new FileInputStream(new File(appConfigPath))) {
            property.load(configFile);
        } catch (IOException e) {
```

#### Blame
bba9f4e Martin Wittlinger
## OptionalGetWithoutIsPresent
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                        FileVisitOption.FOLLOW_LINKS)
                .findFirst()
                .get();
        String changedFileName =
                tempRepoFolder.toPath().relativize(changedFilePath).toString().replace("\\", "/");
```

#### Blame
7f5a83e MartinWitt
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/impl/SingleChangeGitPushSsh.java`
#### Snippet
```java
                        path.getName(path.getNameCount() - 1).toString().equals(changedFile.getName()),
                FileVisitOption.FOLLOW_LINKS)) {
            Path changedFilePath = changedFiles.findFirst().get();
            String changedFileName =
                    projectRoot.toPath().relativize(changedFilePath).toString().replace("\\", "/");
```

#### Blame
7f5a83e MartinWitt
## StringConcatenationInsideStringBufferAppend
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/history/Changelog.java`
#### Snippet
```java
        builder.append("The following has changed in the code:\n");
        for (Change change : changes) {
            builder.append(change.getChangeText() + "\n");
        }
        return builder.toString();
```

#### Blame
7f5a83e MartinWitt
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
        for (Change change : log.getChanges()) {
            if (change.getAffectedType().getSimpleName().equals(name)) {
                sb.append(change.getChangeText().asText() + "\n");
            }
        }
```

#### Blame
7f5a83e MartinWitt
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
    private static void appendChanges(Map<String, List<Change>> changesByType, StringBuilder sb) {
        for (Entry<String, List<Change>> entry : changesByType.entrySet()) {
            sb.append("### " + entry.getKey() + "\n");
            sb.append(entry.getValue().stream()
                    .map(c -> "- " + c.getChangeText().asMarkdown())
```

#### Blame
7f5a83e MartinWitt
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                .collect(Collectors.toList());
        for (BadSmell badSmell : badSmells) {
            sb.append("## " + badSmell.getName().asText() + "\n");
            sb.append(badSmell.getDescription().asMarkdown() + "\n");
            for (Link link : badSmell.getLinks()) {
```

#### Blame
7f5a83e MartinWitt
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
        for (BadSmell badSmell : badSmells) {
            sb.append("## " + badSmell.getName().asText() + "\n");
            sb.append(badSmell.getDescription().asMarkdown() + "\n");
            for (Link link : badSmell.getLinks()) {
                sb.append("- " + link + "\n");
```

#### Blame
7f5a83e MartinWitt
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
            sb.append(badSmell.getDescription().asMarkdown() + "\n");
            for (Link link : badSmell.getLinks()) {
                sb.append("- " + link + "\n");
            }
        }
```

#### Blame
7f5a83e MartinWitt
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
                .collect(Collectors.toList());
        for (BadSmell badSmell : badSmells) {
            sb.append("## " + badSmell.getName().asText() + "\n");
            sb.append(badSmell.getDescription().asMarkdown() + "\n");
            for (Link link : badSmell.getLinks()) {
```

#### Blame
28f4aec MartinWitt
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
        for (BadSmell badSmell : badSmells) {
            sb.append("## " + badSmell.getName().asText() + "\n");
            sb.append(badSmell.getDescription().asMarkdown() + "\n");
            for (Link link : badSmell.getLinks()) {
                sb.append("- " + link + "\n");
```

#### Blame
7f5a83e MartinWitt
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
            sb.append(badSmell.getDescription().asMarkdown() + "\n");
            for (Link link : badSmell.getLinks()) {
                sb.append("- " + link + "\n");
            }
        }
```

#### Blame
7f5a83e MartinWitt
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/ChangelogPrinter.java`
#### Snippet
```java
        sb.append("## Changes: \n");
        for (var fix : changes) {
            sb.append("* " + fix.getChangeText().asMarkdown()).append("\n");
            if (fix.getAnalyzerResult() != null) {
                sb.append("<!-- ").append(toYaml(fix.getAnalyzerResult())).append(" -->\n");
```

#### Blame
7f5a83e MartinWitt
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/ChangelogPrinter.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder();
        sb.append("# Repairing Code Style Issues\n");
        changes.stream().map(Change::getBadSmell).distinct().forEach(v -> sb.append(
                        "## " + v.getName().asText() + "\n")
                .append(v.getDescription().asMarkdown())
```

#### Blame
7f5a83e MartinWitt
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
        for (Change change : log.getChanges()) {
            if (change.getAffectedType().getSimpleName().equals(name)) {
                sb.append(change.getChangeText().asText() + "\n");
            }
        }
```

#### Blame
7f5a83e MartinWitt
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
                .collect(Collectors.toList());
        for (BadSmell badSmell : badSmells) {
            sb.append("## " + badSmell.getName().asText() + "\n");
            sb.append(badSmell.getDescription().asMarkdown() + "\n");
            for (Link link : badSmell.getLinks()) {
```

#### Blame
7f5a83e MartinWitt
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
        for (BadSmell badSmell : badSmells) {
            sb.append("## " + badSmell.getName().asText() + "\n");
            sb.append(badSmell.getDescription().asMarkdown() + "\n");
            for (Link link : badSmell.getLinks()) {
                sb.append("- " + link + "\n");
```

#### Blame
7f5a83e MartinWitt
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
            sb.append(badSmell.getDescription().asMarkdown() + "\n");
            for (Link link : badSmell.getLinks()) {
                sb.append("- " + link + "\n");
            }
        }
```

#### Blame
7f5a83e MartinWitt
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
    private static void appendChanges(Map<String, List<Change>> changesByType, StringBuilder sb) {
        for (Entry<String, List<Change>> entry : changesByType.entrySet()) {
            sb.append("### " + entry.getKey() + "\n");
            sb.append(entry.getValue().stream()
                    .map(c -> "- " + c.getChangeText().asMarkdown())
```

#### Blame
7f5a83e MartinWitt
## MethodMayBeStatic
### MethodMayBeStatic
Method `createChange()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/RedundantFieldInitialization.java`
#### Snippet
```java
    }

    private Change createChange(CtField<?> field, CtExpression<?> defaultExpression) {
        String raw = "Field Initializer  %s for field %s in type %s was redundant and was removed.";
        String markdown = "Field Initializer  `%s` for field `%s` in type `%s` was redundant and was removed.";
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `hasDefaultExpression()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/RedundantFieldInitialization.java`
#### Snippet
```java
    }

    private boolean hasDefaultExpression(CtField<?> ctField, String defaultExpression) {
        return ctField.getDefaultExpression() != null
                && ctField.getDefaultExpression().toString().equals(defaultExpression);
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `isSizeMethod()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/CollectionEmptyCheck.java`
#### Snippet
```java
    }

    private boolean isSizeMethod(CtInvocation<?> invocation) {
        return invocation.getExecutable().getSimpleName().equals("size")
                && invocation.getArguments().isEmpty();
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `getRightMostInvocation()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/CollectionEmptyCheck.java`
#### Snippet
```java
    }

    private List<CtInvocation<?>> getRightMostInvocation(CtExpression<?> leftHand) {
        List<CtInvocation<?>> innvocation = leftHand.getElements(new TypeFilter<>(CtInvocation.class));
        innvocation.stream()
```

#### Blame
bba9f4e Martin Wittlinger
### MethodMayBeStatic
Method `isEmptyString()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/PrimitiveToString.java`
#### Snippet
```java
    }

    private boolean isEmptyString(CtExpression<?> exp) {
        return exp.toString().equals("\"\"");
    }
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `isPrimitive()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/PrimitiveToString.java`
#### Snippet
```java
    }

    private boolean isPrimitive(CtExpression<?> exp) {
        return exp.getType() != null && exp.getType().isPrimitive();
    }
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `usesNonStaticOuterMethod()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/InnerClassStatic.java`
#### Snippet
```java
    }

    private boolean usesNonStaticOuterMethod(CtClass<?> clazz, Set<CtType<?>> innerClasses) {
        return clazz.getElements(new TypeFilter<>(CtInvocation.class)).stream()
                .anyMatch(v -> Nullsafe.get(
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `usesNonStaticOuterField()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/InnerClassStatic.java`
#### Snippet
```java
    }

    private boolean usesNonStaticOuterField(CtClass<?> clazz, Set<CtType<?>> innerClasses) {
        return clazz.getElements(new TypeFilter<>(CtFieldAccess.class)).stream()
                .anyMatch(v -> Nullsafe.get(
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `usesNonStaticOuterConstructors()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/InnerClassStatic.java`
#### Snippet
```java
    }

    private boolean usesNonStaticOuterConstructors(CtClass<?> clazz, Set<CtType<?>> innerClasses) {
        return clazz.getElements(new TypeFilter<>(CtConstructorCall.class)).stream()
                .anyMatch(v -> Nullsafe.get(
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `getNestedClasses()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/InnerClassStatic.java`
#### Snippet
```java
    }

    private Set<CtType<?>> getNestedClasses(CtClass<?> clazz) {
        Set<CtType<?>> innerClasses = new HashSet<>(clazz.getTopLevelType().getNestedTypes());
        innerClasses.remove(clazz);
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `isEqualsMethod()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/EmptyStringCheck.java`
#### Snippet
```java
    }

    private boolean isEqualsMethod(CtInvocation<?> element) {
        return element.getExecutable().getSimpleName().equals("equals")
                && element.getArguments().size() == 1;
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `isEmptyStringArgument()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/EmptyStringCheck.java`
#### Snippet
```java
    }

    private boolean isEmptyStringArgument(CtInvocation<?> element) {
        return element.getArguments().get(0).toString().equals("\"\"");
    }
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `createChange()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/EmptyStringCheck.java`
#### Snippet
```java
    }

    private Change createChange(CtInvocation<?> invocation, String rawText, String markdown) {
        return new Change(badSmell, MarkdownString.fromMarkdown(rawText, markdown), invocation.getParent(CtType.class));
    }
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `isSingleArgumentAndEmptyString()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/EmptyStringCheck.java`
#### Snippet
```java
    }

    private boolean isSingleArgumentAndEmptyString(List<CtLiteral<?>> literals) {
        return literals.size() == 1 && literals.get(0).getValue().equals("");
    }
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `isEmptyStringArgument()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/EmptyStringCheck.java`
#### Snippet
```java
    }

    private boolean isEmptyStringArgument(List<CtLiteral<?>> literals) {
        return literals.get(0).getValue().equals("");
    }
```

#### Blame
bba9f4e Martin Wittlinger
### MethodMayBeStatic
Method `isStaticInvocation()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/StaticAccess.java`
#### Snippet
```java
    }

    private boolean isStaticInvocation(CtInvocation<?> invocation) {
        return Nullsafe.get(() -> invocation.getExecutable().isStatic(), false)
                && invocation.getParent(CtLambda.class) == null;
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `isTypeAccess()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/StaticAccess.java`
#### Snippet
```java
    }

    private boolean isTypeAccess(CtInvocation<?> invocation) {
        return invocation.getTarget() instanceof CtTypeAccess;
    }
```

#### Blame
bba9f4e Martin Wittlinger
### MethodMayBeStatic
Method `closePullRequestsWithLabelName()` may be 'static'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/MentionCommands.java`
#### Snippet
```java
    }

    private void closePullRequestsWithLabelName(List<GHPullRequest> pr, String name) {
        for (GHPullRequest ghPullRequest : pr) {
            ghPullRequest.getLabels().forEach(v -> {
```

#### Blame
30442df MartinWitt
### MethodMayBeStatic
Method `findConfigIssue()` may be 'static'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/MentionCommands.java`
#### Snippet
```java
    }

    private List<GHIssue> findConfigIssue(GHEventPayload.IssueComment issueComment) throws IOException {
        return issueComment.getRepository().queryIssues().creator(Constants.BOT_NAME).list().toList().stream()
                .filter(v -> v.getTitle().contains(Constants.CONFIG_ISSUE_NAME))
```

#### Blame
b8b65b8 MartinWitt
### MethodMayBeStatic
Method `isSelf()` may be 'static'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/UserWhitelist.java`
#### Snippet
```java
    }

    private boolean isSelf(String user) {
        return user.equals(Constants.BOT_NAME);
    }
```

#### Blame
30442df MartinWitt
### MethodMayBeStatic
Method `findInitalValueMethod()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/ThreadLocalWithInitial.java`
#### Snippet
```java
    }

    private Optional<CtExecutableReference<?>> findInitalValueMethod(CtClass<?> innerClass) {
        return innerClass.getDeclaredExecutables().stream()
                .filter(v -> v.getSimpleName().equals("initialValue"))
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `getReturnStatement()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/ThreadLocalWithInitial.java`
#### Snippet
```java
    }

    private <T> CtExpression<T> getReturnStatement(CtStatement statement) {
        return ((CtReturn<T>) statement).getReturnedExpression();
    }
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `hasNoFields()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/ThreadLocalWithInitial.java`
#### Snippet
```java
    }

    private boolean hasNoFields(CtClass<?> innerClass) {
        return innerClass.getDeclaredFields().isEmpty();
    }
```

#### Blame
bba9f4e Martin Wittlinger
### MethodMayBeStatic
Method `hasOnlyConstructorAndSingleMethod()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/ThreadLocalWithInitial.java`
#### Snippet
```java
    }

    private boolean hasOnlyConstructorAndSingleMethod(CtClass<?> innerClass) {
        return innerClass.getDeclaredExecutables().size() == 2;
    }
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `hasJunit5AssertTrueLeft()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertTrueSameCheck.java`
#### Snippet
```java
    }

    private boolean hasJunit5AssertTrueLeft(CtType<?> parent) {
        return parent.getElements(new TypeFilter<>(CtInvocation.class)).stream()
                .filter(v -> v.getExecutable() != null)
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `hasJunit5AsserTrueLeft()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertTrueEqualsCheck.java`
#### Snippet
```java
    }

    private boolean hasJunit5AsserTrueLeft(CtType<?> parent) {
        return parent.getElements(new TypeFilter<>(CtInvocation.class)).stream()
                .filter(v -> v.getExecutable() != null)
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `isTempoaryFolderAnnotation()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/TempoaryFolderAsParameter.java`
#### Snippet
```java
    }

    private boolean isTempoaryFolderAnnotation(CtAnnotation<? extends Annotation> v1) {
        return v1.getType().getSimpleName().equals("TempDir");
    }
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `methodUsesField()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/TempoaryFolderAsParameter.java`
#### Snippet
```java
    }

    private boolean methodUsesField(CtField<?> ctField, CtMethod<?> method) {
        return !method.getElements(new VariableAccessFilter<>(ctField.getReference()))
                .isEmpty();
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `hasJunit5AssertFalseLeft()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertFalseEqualsCheck.java`
#### Snippet
```java
    }

    private boolean hasJunit5AssertFalseLeft(CtType<?> parent) {
        return parent.getElements(new TypeFilter<>(CtInvocation.class)).stream()
                .filter(v -> v.getExecutable() != null)
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `removeImport()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java
         * Remove an import from the given collection based on equality or textual equality.
         */
        private boolean removeImport(CtImport toRemove, Collection<CtImport> imports) {
            String toRemoveStr = toRemove.toString();
            Iterator<CtImport> it = imports.iterator();
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `isEqualAfterSkippingRole()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java
         * Checks if element and other are equal if comparison for `role` value is skipped
         */
        private boolean isEqualAfterSkippingRole(CtElement element, CtElement other, CtRole role) {
            EqualsVisitor equalsVisitor = new EqualsVisitor();
            boolean isEqual = equalsVisitor.checkEquals(element, other);
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `targetIsStringBuilder()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/StringBuilderDirectUse.java`
#### Snippet
```java
    }

    private boolean targetIsStringBuilder(CtInvocation<?> element) {
        return Nullsafe.get(() -> element.getTarget().getType().getSimpleName().equals("StringBuilder"), false);
    }
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `targetIsStringType()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/StringBuilderDirectUse.java`
#### Snippet
```java
    }

    private boolean targetIsStringType(CtInvocation<?> element) {
        return Nullsafe.get(
                () -> element.getTarget()
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `hasOldName()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/ParameterNameDiffersFromOverriddenParameter.java`
#### Snippet
```java
    }

    private boolean hasOldName(CtParameter<?> parameter, String currentName) {
        return parameter.getSimpleName().equals(currentName);
    }
```

#### Blame
fcfed1e MartinWitt
### MethodMayBeStatic
Method `getSourceStart()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/ParameterNameDiffersFromOverriddenParameter.java`
#### Snippet
```java
    }

    private int getSourceStart(CtParameter<?> parameter) {
        try {
            return (int) FieldUtils.readField(parameter.getPosition(), "sourceStart", true);
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `adjustImports()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/AssertThatTransformation.java`
#### Snippet
```java
    }

    private void adjustImports(CtInvocation<?> invocation) {
        ImportHelper.removeImport(
                "org.junit.Assert.assertThat", true, invocation.getPosition().getCompilationUnit());
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `isInJunit4Assert()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/AssertThatTransformation.java`
#### Snippet
```java
    }

    private boolean isInJunit4Assert(CtExecutableReference<?> exec) {
        return exec.getDeclaringType() != null
                && exec.getDeclaringType().getQualifiedName().equals("org.junit.Assert");
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `isAssertThat()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/AssertThatTransformation.java`
#### Snippet
```java
    }

    private boolean isAssertThat(CtExecutableReference<?> exec) {
        return exec.getSimpleName().equals("assertThat");
    }
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `getJunit4Asserts()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/AssertionsTransformation.java`
#### Snippet
```java
    }

    private List<CtInvocation<?>> getJunit4Asserts(CtMethod<?> method) {
        return method.getElements(new TypeFilter<CtInvocation<?>>(CtInvocation.class)).stream()
                .filter(v -> v.getTarget() instanceof CtTypeAccess)
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `is2ParameterAssertion()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/AssertionsTransformation.java`
#### Snippet
```java
    }

    private boolean is2ParameterAssertion(CtInvocation<?> junit4Assert) {
        String simpleName = junit4Assert.getExecutable().getSimpleName();
        return simpleName.equals("assertTrue")
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `getImports()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/AssertionsTransformation.java`
#### Snippet
```java
    }

    private ModelList<CtImport> getImports(CtMethod<?> method) {
        return method.getPosition().getCompilationUnit().getImports();
    }
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `createChangeHistory()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/AssertionsTransformation.java`
#### Snippet
```java
    }

    private MarkdownString createChangeHistory(CtMethod<?> method) {
        return MarkdownString.fromMarkdown(
                String.format("Transformed junit4 assert to junit 5 assertion in %s", method.getSimpleName()),
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `removeTimeoutValue()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/TestAnnotation.java`
#### Snippet
```java
    }

    private void removeTimeoutValue(CtAnnotation<?> testAnnotation) {
        testAnnotation.setValues(testAnnotation.getValues().entrySet().stream()
                .filter(v -> !v.getKey().equals("timeout"))
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `getNameOfAnnotatedMethod()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/TestAnnotation.java`
#### Snippet
```java
    }

    private String getNameOfAnnotatedMethod(CtAnnotation<?> annotation) {
        return ((CtMethod<?>) annotation.getAnnotatedElement()).getSimpleName();
    }
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `adjustImports()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/TestAnnotation.java`
#### Snippet
```java
    }

    private void adjustImports(CtElement element) {
        ImportHelper.removeImport(JUNIT4_TEST, false, element.getPosition().getCompilationUnit());
        ImportHelper.addImport(JUNIT5_TEST, false, element.getPosition().getCompilationUnit());
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `removeExpectedValue()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/ExpectedExceptionRemoval.java`
#### Snippet
```java
    }

    private void removeExpectedValue(CtAnnotation<?> testAnnotation) {
        testAnnotation.setValues(testAnnotation.getValues().entrySet().stream()
                .filter(v -> !v.getKey().equals("expected"))
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `isNoneType()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/ExpectedExceptionRemoval.java`
#### Snippet
```java
    }

    private boolean isNoneType(CtExpression<?> value) {
        if (value instanceof CtFieldRead) {
            CtFieldRead<?> fieldRead = (CtFieldRead<?>) value;
```

#### Blame
bba9f4e Martin Wittlinger
### MethodMayBeStatic
Method `createNewInvocation()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/SizeReplaceableByIsEmpty.java`
#### Snippet
```java
    }

    private CtInvocation<Boolean> createNewInvocation(CtExpression<?> target, CtExecutableReference<Boolean> ref) {
        return target.getFactory().Code().createInvocation(target, ref, new ArrayList<CtExpression<?>>());
    }
```

#### Blame
e91ee68 MartinWitt
### MethodMayBeStatic
Method `createIsEmptyMethod()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/SizeReplaceableByIsEmpty.java`
#### Snippet
```java
    }

    private CtExecutableReference<Boolean> createIsEmptyMethod(Factory factory) {
        CtExecutableReference<Boolean> ref = factory.createExecutableReference();
        ref.setSimpleName("isEmpty");
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `findLengthInvocation()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/SizeReplaceableByIsEmpty.java`
#### Snippet
```java
    }

    private <T> CtInvocation<T> findLengthInvocation(CtExpression<?> expression) {
        return expression.getElements(new TypeFilter<CtInvocation<T>>(CtInvocation.class)).stream()
                .filter(invocation -> invocation.getExecutable().getSimpleName().equals("length"))
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `findSizeInvocation()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/SizeReplaceableByIsEmpty.java`
#### Snippet
```java
    }

    private <T> CtInvocation<T> findSizeInvocation(CtExpression<?> expression) {
        return expression.getElements(new TypeFilter<CtInvocation<T>>(CtInvocation.class)).stream()
                .filter(invocation -> invocation.getExecutable().getSimpleName().equals("size"))
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `isEquals()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/SizeReplaceableByIsEmpty.java`
#### Snippet
```java
    }

    private boolean isEquals(CtBinaryOperator<?> ctBinaryOperator) {
        return ctBinaryOperator.getKind() == BinaryOperatorKind.EQ;
    }
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `matchesPosition()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/SizeReplaceableByIsEmpty.java`
#### Snippet
```java
    }

    private boolean matchesPosition(CtBinaryOperator<?> op, int line, int column) {
        return op.getPosition().getLine() == line
                && op.getPosition().getColumn() <= column
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `isConstant()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/SizeReplaceableByIsEmpty.java`
#### Snippet
```java
    }

    private boolean isConstant(CtExpression<?> expression) {
        return expression instanceof CtLiteral;
    }
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `hasJunit5AsserTrueLeft()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertNullTransformation.java`
#### Snippet
```java
    }

    private boolean hasJunit5AsserTrueLeft(CtType<?> parent) {
        return parent.getElements(new TypeFilter<>(CtInvocation.class)).stream()
                .filter(v -> v.getExecutable() != null)
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `adjustImportsAfterClass()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/Junit4AnnotationsTransformation.java`
#### Snippet
```java
    }

    private void adjustImportsAfterClass(CtMethod<?> method) {
        ImportHelper.removeImport(
                "org.junit.AfterClass", false, method.getPosition().getCompilationUnit());
```

#### Blame
bba9f4e Martin Wittlinger
### MethodMayBeStatic
Method `adjustImportsIgnore()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/Junit4AnnotationsTransformation.java`
#### Snippet
```java
    }

    private void adjustImportsIgnore(CtMethod<?> method) {
        ImportHelper.removeImport(
                "org.junit.Ignore", false, method.getPosition().getCompilationUnit());
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `replaceAnnotation()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/Junit4AnnotationsTransformation.java`
#### Snippet
```java
    }

    private void replaceAnnotation(CtMethod<?> method, CtAnnotation<?> oldAnnotation, CtAnnotation<?> newAnnotation) {
        method.removeAnnotation(oldAnnotation);
        method.addAnnotation(newAnnotation);
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `adjustImportsAfter()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/Junit4AnnotationsTransformation.java`
#### Snippet
```java
    }

    private void adjustImportsAfter(CtMethod<?> method) {
        ImportHelper.removeImport("org.junit.After", true, method.getPosition().getCompilationUnit());
        ImportHelper.addImport(
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `adjustImportsBefore()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/Junit4AnnotationsTransformation.java`
#### Snippet
```java
    }

    private void adjustImportsBefore(CtCompilationUnit compilationUnit) {
        ImportHelper.removeImport(JUNIT4_BEFORE, false, compilationUnit);
        ImportHelper.addImport(JUNIT5_BEFORE_EACH, false, compilationUnit);
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `adjustImportsBeforeClass()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/Junit4AnnotationsTransformation.java`
#### Snippet
```java
    }

    private void adjustImportsBeforeClass(CtMethod<?> method) {
        ImportHelper.removeImport(
                JUNIT4_BEFORE_CLASS, false, method.getPosition().getCompilationUnit());
```

#### Blame
bba9f4e Martin Wittlinger
### MethodMayBeStatic
Method `getSourceStart()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/MethodMayBeStatic.java`
#### Snippet
```java
    }

    private int getSourceStart(CtMethod<?> method) {
        try {
            return (int) FieldUtils.readField(method.getPosition(), "sourceStart", true);
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `refactorExecutableReferences()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/MethodMayBeStatic.java`
#### Snippet
```java
    }

    private void refactorExecutableReferences(
            CtMethod<?> method, List<CtExecutableReferenceExpression<?, CtTypeAccess<?>>> executableRefs) {
        for (CtExecutableReferenceExpression<?, CtTypeAccess<?>> executableRef : executableRefs) {
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `toYaml()` may be 'static'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/ChangelogPrinter.java`
#### Snippet
```java
    }

    private String toYaml(AnalyzerResult analyzerResult) {
        try {
            return MAPPER.writeValueAsString(analyzerResult);
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `generateTableLine()` may be 'static'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/ChangelogPrinter.java`
#### Snippet
```java
    }

    private String generateTableLine(Set<String> ruleIds, Entry<String, List<AnalyzerResult>> result) {
        return "| " + result.getKey() + " | " + result.getValue().size() + " | "
                + result.getValue().stream().anyMatch(v -> ruleIds.contains(v.ruleID())) + " |\n";
```

#### Blame
e91ee68 MartinWitt
### MethodMayBeStatic
Method `isNotConfigIssue()` may be 'static'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java
    }

    private boolean isNotConfigIssue(GHEventPayload.Issue issueComment) {
        return !issueComment.getIssue().getTitle().equals(Constants.CONFIG_ISSUE_NAME);
    }
```

#### Blame
30442df MartinWitt
### MethodMayBeStatic
Method `relativize()` may be 'static'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java
    }

    private String relativize(Path root, Path child) {
        try {
            Path relative =
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `refreshFlag()` may be 'static'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java
    }

    private String refreshFlag(String body, String flag) {
        return body.replace(flag, flag.replace("[x]", "[ ]"));
    }
```

#### Blame
30442df MartinWitt
### MethodMayBeStatic
Method `createPullRequest()` may be 'static'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java
    }

    private void createPullRequest(GHRepository repo, String typeName, String branchName, String body)
            throws IOException {
        repo.createPullRequest("fix Bad Smells in " + typeName, branchName, repo.getDefaultBranch(), body)
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `containsFlag()` may be 'static'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java
    }

    private boolean containsFlag(GHIssue issue, String flag) {
        return issue.getBody().contains(flag);
    }
```

#### Blame
30442df MartinWitt
### MethodMayBeStatic
Method `getFileForType()` may be 'static'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java
    }

    private Path getFileForType(CtType<?> type) {
        return type.getPosition().getFile().toPath();
    }
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `groupChangesByType()` may be 'static'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java
    }

    private Map<CtType<?>, List<Change>> groupChangesByType(ChangeListener changeListener) {
        return changeListener.getChangelog().getChanges().stream()
                .collect(Collectors.groupingBy(Change::getAffectedType));
```

#### Blame
30442df MartinWitt
### MethodMayBeStatic
Method `getType()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/LambdaToExecutableReference.java`
#### Snippet
```java

    @SuppressWarnings("unchecked")
    private <T> CtTypeReference<T> getType(CtTypedElement<?> typedElement) {
        return (CtTypeReference<T>) typedElement.getType();
    }
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `hasJunit5AssertTrueLeft()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertFalseSameCheck.java`
#### Snippet
```java
    }

    private boolean hasJunit5AssertTrueLeft(CtType<?> parent) {
        return parent.getElements(new TypeFilter<>(CtInvocation.class)).stream()
                .filter(v -> v.getExecutable() != null)
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `createHttpClient()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java
    }

    private ApacheDockerHttpClient createHttpClient(DockerClientConfig standard) {
        return new ApacheDockerHttpClient.Builder()
                .dockerHost(standard.getDockerHost())
```

#### Blame
156b93b MartinWitt
### MethodMayBeStatic
Method `stringToFile()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java
     * @return  	the file object
     */
    private File stringToFile(String path) {
        return Path.of(path).toFile();
    }
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `parseSarif()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java
    }

    private List<AnalyzerResult> parseSarif(Path resultPath) throws IOException {
        StringReader reader = new StringReader(Files.readString(resultPath));
        ObjectMapper mapper = new ObjectMapper();
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `fixWindowsPath()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java
    }

    private Path fixWindowsPath(Path sourceRoot) {
        if (sourceRoot
                .toFile()
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `endsWithNewline()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportAwareSniperPrinter.java`
#### Snippet
```java
    }

    private boolean endsWithNewline(String s) {
        return s.endsWith("\n") || s.endsWith("\r\n");
    }
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `getImportKindOrder()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportComparator.java`
#### Snippet
```java
    }

    private int getImportKindOrder(CtImportKind importKind) {

        switch (importKind) {
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `isStaticImport()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportComparator.java`
#### Snippet
```java
    }

    private boolean isStaticImport(CtImport imp) {
        if (imp.getImportKind() == CtImportKind.UNRESOLVED) {
            return ((CtUnresolvedImport) imp).isStatic();
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `analyseUnresolvedImport()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportComparator.java`
#### Snippet
```java
    }

    private int analyseUnresolvedImport(CtUnresolvedImport imp1) {
        if (imp1.isStatic() && imp1.getUnresolvedReference().contains("*")) {
            return 3;
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `isArrayTarget()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/ArraysToString.java`
#### Snippet
```java
    }

    private boolean isArrayTarget(CtInvocation<?> invocation) {
        return Nullsafe.get(
                () -> invocation.getTarget() != null
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `isToString()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/ArraysToString.java`
#### Snippet
```java
    }

    private boolean isToString(CtInvocation<?> invocation) {
        return invocation.getExecutable().getSimpleName().equals("toString");
    }
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `adjustImports()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/ArraysToString.java`
#### Snippet
```java
    }

    private void adjustImports(CtInvocation<?> invocation) {
        ImportHelper.addImport(
                "java.util.Arrays", false, invocation.getPosition().getCompilationUnit());
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `hasJunit5AsserTrueLeft()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertNotNullTransformation.java`
#### Snippet
```java
    }

    private boolean hasJunit5AsserTrueLeft(CtType<?> parent) {
        return parent.getElements(new TypeFilter<>(CtInvocation.class)).stream()
                .filter(v -> v.getExecutable() != null)
```

#### Blame
7f5a83e MartinWitt
### MethodMayBeStatic
Method `containsColumn()` may be 'static'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/NonStrictComparisonCanBeEquality.java`
#### Snippet
```java
    }

    private boolean containsColumn(CtBinaryOperator<?> binaryOperator, int column) {
        return binaryOperator.getPosition().getColumn() <= column
                && binaryOperator.getPosition().getEndColumn() >= column;
```

#### Blame
7f5a83e MartinWitt
