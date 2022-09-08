# Bad smells
I found 106 bad smells with 10 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SimplifyStreamApiCallChains | 5 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| CommentedOutCode | 1 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| DeprecatedIsStillUsed | 4 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| ComparatorCombinators | 3 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| PatternVariableCanBeUsed | 27 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| CatchMayIgnoreException | 1 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| StringBufferReplaceableByString | 1 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| EnhancedSwitchMigration | 1 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| TrivialStringConcatenation | 1 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| ConstantConditions | 2 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryToStringCall | 4 | true |
| ruleID | number | fixable |
| --- | --- | --- |
| SetReplaceableByEnumSet | 1 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 1 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| UtilityClassWithPublicConstructor | 1 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryBoxing | 1 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalUsedAsFieldOrParameterType | 2 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| SystemOutErr | 6 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantStreamOptionalCall | 2 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| ThrowablePrintStackTrace | 3 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantFieldInitialization | 2 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| AssignmentToMethodParameter | 4 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 2 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryLocalVariable | 6 | true |
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantStringFormatCall | 6 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantFileCreation | 1 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| OptionalGetWithoutIsPresent | 2 | false |
| ruleID | number | fixable |
| --- | --- | --- |
| StringConcatenationInsideStringBufferAppend | 16 | false |
## SimplifyStreamApiCallChains
<details>### SimplifyStreamApiCallChains
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
</details>## CommentedOutCode
<details>### CommentedOutCode
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
</details>## DeprecatedIsStillUsed
<details>### DeprecatedIsStillUsed
Deprecated member 'withCacheFolder' is still used
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaRefactor.java`
#### Snippet
```java

        @Deprecated
        public Builder withCacheFolder(String cacheFolder) {
            return this;
        }
```
### DeprecatedIsStillUsed
Deprecated member 'Builder' is still used
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaRefactor.java`
#### Snippet
```java

    @Deprecated
    public static class Builder {

        private ChangeListener listener;
```
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
</details>## ComparatorCombinators
<details>### ComparatorCombinators
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
</details>## PatternVariableCanBeUsed
<details>### PatternVariableCanBeUsed
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
</details>## CatchMayIgnoreException
<details>### CatchMayIgnoreException
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
</details>## StringBufferReplaceableByString
<details>### StringBufferReplaceableByString
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
</details>## EnhancedSwitchMigration
<details>### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportComparator.java`
#### Snippet
```java
    private int getImportKindOrder(CtImportKind importKind) {

        switch (importKind) {
            case TYPE:
            case ALL_TYPES:
```
</details>## TrivialStringConcatenation
<details>### TrivialStringConcatenation
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
</details>## ConstantConditions
<details>### ConstantConditions
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
</details>## UnnecessaryToStringCall
<details>### UnnecessaryToStringCall
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
</details>## SetReplaceableByEnumSet
<details>### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `code-transformation/src/main/java/spoon/reflect/visitor/ImportAnalyzer.java`
#### Snippet
```java

    // The set of roles whose values are always kept implicit
    protected static Set<CtRole> IGNORED_ROLES_WHEN_IMPLICIT = new HashSet<>(Arrays.asList(
            // e.g. List<String> s = new ArrayList</*keep me implicit*/>();
            CtRole.TYPE_ARGUMENT,
```
</details>## NullableProblems
<details>### NullableProblems
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
</details>## UtilityClassWithPublicConstructor
<details>### UtilityClassWithPublicConstructor
Class `CommitBuilder` has only 'static' members, and a 'public' constructor
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
import xyz.keksdose.spoon.code_solver.transformations.BadSmell;

public class CommitBuilder {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
```
</details>## UnnecessaryBoxing
<details>### UnnecessaryBoxing
Redundant boxing inside `Boolean.valueOf(property.getProperty("changelog.markdown"))`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/config/ConfigStore.java`
#### Snippet
```java

    public boolean getPrintMarkdown() {
        return Boolean.valueOf(property.getProperty("changelog.markdown"));
    }

```
</details>## OptionalUsedAsFieldOrParameterType
<details>### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'qodanaCache'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java
    private String resultPathString;
    private String sourceFileRoot;
    private Optional<String> qodanaCache;

    private QodanaAnalyzer(Builder builder) {
```
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
</details>## SystemOutErr
<details>### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java

    void onConfigEdit(@Issue.Edited GHEventPayload.Issue issueComment) throws IOException {
        System.out.println("onEditConfig");
        if (isNotConfigIssue(issueComment)
                || !userWhitelist.isWhitelisted(GitHubUtils.getLogin(issueComment))
```
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
</details>## RedundantStreamOptionalCall
<details>### RedundantStreamOptionalCall
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
</details>## ThrowablePrintStackTrace
<details>### ThrowablePrintStackTrace
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
</details>## RedundantFieldInitialization
<details>### RedundantFieldInitialization
Field initialization to `false` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java
        Iterator<CtImport> iter = imports.iterator();
        class Visitor extends CtAbstractImportVisitor {
            boolean found = false;

            @Override
```
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
</details>## AssignmentToMethodParameter
<details>### AssignmentToMethodParameter
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
</details>## ReturnNull
<details>### ReturnNull
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
</details>## UnnecessaryLocalVariable
<details>### UnnecessaryLocalVariable
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
</details>## RedundantStringFormatCall
<details>### RedundantStringFormatCall
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
</details>## RedundantFileCreation
<details>### RedundantFileCreation
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
</details>## OptionalGetWithoutIsPresent
<details>### OptionalGetWithoutIsPresent
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
</details>## StringConcatenationInsideStringBufferAppend
<details>### StringConcatenationInsideStringBufferAppend
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
</details>