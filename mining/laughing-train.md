# MartinWitt/laughing-train
# Bad smells
I found 150 bad smells with 9 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| PatternVariableCanBeUsed | 28 | false |
| BoundedWildcard | 22 | false |
| StringConcatenationInsideStringBufferAppend | 16 | false |
| UnnecessaryModifier | 8 | false |
| SimplifyStreamApiCallChains | 6 | false |
| SystemOutErr | 6 | false |
| UnnecessaryLocalVariable | 6 | true |
| RedundantStringFormatCall | 6 | false |
| StaticCallOnSubclass | 4 | false |
| DeprecatedIsStillUsed | 4 | false |
| ConstantConditions | 4 | false |
| AssignmentToMethodParameter | 4 | false |
| ComparatorCombinators | 3 | false |
| UnnecessaryToStringCall | 3 | true |
| ThrowablePrintStackTrace | 3 | false |
| CommentedOutCode | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| NullableProblems | 2 | false |
| OptionalUsedAsFieldOrParameterType | 2 | false |
| RedundantStreamOptionalCall | 2 | false |
| DefaultAnnotationParam | 2 | false |
| RedundantFieldInitialization | 2 | false |
| GroovyUnusedAssignment | 2 | false |
| ReturnNull | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| RefusedBequest | 1 | false |
| EnhancedSwitchMigration | 1 | false |
| SetReplaceableByEnumSet | 1 | false |
| UtilityClassWithPublicConstructor | 1 | false |
| UnnecessaryBoxing | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| RedundantFileCreation | 1 | false |
## UnnecessaryModifier
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/analyzer/AnalyzerResult.java`
#### Snippet
```java
    public String messageMarkdown();

    public String snippet();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/analyzer/AnalyzerResult.java`
#### Snippet
```java
    public String filePath();

    public Position position();

    public String message();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/analyzer/AnalyzerResult.java`
#### Snippet
```java
    public String ruleID();

    public String filePath();

    public Position position();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/analyzer/AnalyzerResult.java`
#### Snippet
```java
    public String message();

    public String messageMarkdown();

    public String snippet();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/analyzer/AnalyzerResult.java`
#### Snippet
```java
    public Position position();

    public String message();

    public String messageMarkdown();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/analyzer/AnalyzerResult.java`
#### Snippet
```java

    @Nonnull
    public String ruleID();

    public String filePath();
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaRules.java`
#### Snippet
```java
    private final Function<AnalyzerResult, AbstractRefactoring> refactoring;

    private QodanaRules(String ruleId, Function<AnalyzerResult, AbstractRefactoring> refactoring) {
        this.ruleId = ruleId;
        this.refactoring = refactoring;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/AfterRefactorStep.java`
#### Snippet
```java
public interface AfterRefactorStep {

    public void apply(Changelog changelog, File projectRoot);
}

```

## StaticCallOnSubclass
### StaticCallOnSubclass
Static method `listAll()` declared in class 'io.quarkus.mongodb.panache.PanacheMongoEntityBase' but referenced via subclass 'io.github.martinwitt.laughing_train.persistence.BadSmell'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/api/BadSmellGraphQL.java`
#### Snippet
```java
    @Description("Gets all bad smells from the database")
    public List<BadSmell> getAllBadSmells() {
        return BadSmell.<BadSmell>listAll();
    }

```

### StaticCallOnSubclass
Static method `findAll()` declared in class 'io.quarkus.mongodb.panache.PanacheMongoEntityBase' but referenced via subclass 'io.github.martinwitt.laughing_train.persistence.Project'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/api/ProjectGraphQL.java`
#### Snippet
```java
    @Description("Gets all projects from the database")
    public List<Project> getAllProjects() {
        return Project.<Project>findAll().list();
    }

```

### StaticCallOnSubclass
Static method `list()` declared in class 'io.quarkus.mongodb.panache.PanacheMongoEntityBase' but referenced via subclass 'io.github.martinwitt.laughing_train.persistence.Project'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/api/ProjectGraphQL.java`
#### Snippet
```java
    @Description("Gets project with given name from the database")
    public Project getProject(String projectName) {
        return Project.<Project>list("projectName", projectName).stream()
                .findAny()
                .orElse(null);
```

### StaticCallOnSubclass
Static method `mongoCollection()` declared in class 'io.quarkus.mongodb.panache.PanacheMongoEntityBase' but referenced via subclass 'io.github.martinwitt.laughing_train.persistence.BadSmell'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/api/ProjectGraphQL.java`
#### Snippet
```java
        Bson groupStage = group("$commitHash");
        Bson sortStage = sort(ascending("commitHash"));
        return BadSmell.<BadSmell>mongoCollection()
                .aggregate(List.of(matchStage, groupStage, sortStage), BsonDocument.class)
                .map(v -> v.get(v.getFirstKey()).asString().getValue())
```

## SimplifyStreamApiCallChains
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
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/NonProtectedConstructorInAbstractClass.java`
#### Snippet
```java
                List<CtAnnotation<? extends Annotation>> annotations = constructor.getAnnotations().stream()
                        .map(CtAnnotation::clone)
                        .collect(Collectors.toList());
                String message = "Constructor " + constructor.getSignature() + " is now protected instead of public";
                String markdown = "Constructor `" + constructor.getSignature() + "` is now protected instead of public";
```

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

## CommentedOutCode
### CommentedOutCode
Commented out code (2 lines)
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/mining/MiningPrinter.java`
#### Snippet
```java
                .append("\n");
        sb.append(generateTableBadSmells(results, ruleIds));
        // var blameTable = calculateGtBlameForIssues(results, project);
        // sb.append(generateBlameTable(blameTable));
        var grouped = results.stream().collect(Collectors.groupingBy(AnalyzerResult::ruleID));
```

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

## ComparatorCombinators
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

## PatternVariableCanBeUsed
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

### PatternVariableCanBeUsed
Variable 'other' can be replaced with pattern variable
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/persistence/BadSmell.java`
#### Snippet
```java
            return false;
        }
        BadSmell other = (BadSmell) obj;
        return Objects.equals(ruleID, other.ruleID)
                && Objects.equals(filePath, other.filePath)
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

## StringBufferReplaceableByString
### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/mining/PeriodicMiner.java`
#### Snippet
```java
                    return Promise.promise();
                }
                StringBuilder builder = new StringBuilder();
                builder.append("# ")
                        .append(success.project().getOwnerRepoName())
```

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

### ConstantConditions
Condition `gitBlame == null` is always `true`
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/mining/MiningPrinter.java`
#### Snippet
```java
                        .setTextComparator(RawTextComparator.WS_IGNORE_ALL)
                        .call();
                if (gitBlame == null) {
                    logger.atSevere().log("Git blame is null for %s", analyzerResult.filePath());
                    continue;
```

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

### ConstantConditions
Method invocation `equals` may produce `NullPointerException`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/PointlessBooleanExpression.java`
#### Snippet
```java
    private boolean isAlreadyFixed(ChangeListener listener) {
        return listener.getChangelog().getChanges().stream()
                .anyMatch(v -> v.getAnalyzerResult().equals(result));
    }

```

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

## BoundedWildcard
### BoundedWildcard
Can generalize to `? extends CtImport`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/formatting/GoogleStyle.java`
#### Snippet
```java

    @Override
    public List<CtImport> group(List<CtImport> imports) {
        LinkedList<CtImport> staticImports = new LinkedList<>();
        LinkedList<CtImport> nonStaticImports = new LinkedList<>();
```

### BoundedWildcard
Can generalize to `? extends CtImport`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/formatting/SpoonStyle.java`
#### Snippet
```java

    @Override
    public List<CtImport> group(List<CtImport> imports) {
        LinkedList<CtImport> staticImports = new LinkedList<>();
        LinkedList<CtImport> nonStaticImports = new LinkedList<>();
```

### BoundedWildcard
Can generalize to `? extends CtType`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/printing/ChangedTypePrinting.java`
#### Snippet
```java
    }

    public void printChangedTypes(ChangeListener listener, Iterable<CtType<?>> newTypes) {
        for (CtType<?> type : newTypes) {
            if (type.getPosition().getFile() == null || !listener.isChanged(type)) {
```

### BoundedWildcard
Can generalize to `? super String`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java

    public static void refactorRepo(
            String path, String sourceFiles, String file, BiFunction<String, String, Changelog> transformation) {
        ConfigStore config = new ConfigStore();
        try (Repository repository = Git.open(new File(path)).checkout().getRepository()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java

    public static void refactorRepo(
            String path, String sourceFiles, String file, BiFunction<String, String, Changelog> transformation) {
        ConfigStore config = new ConfigStore();
        try (Repository repository = Git.open(new File(path)).checkout().getRepository()) {
```

### BoundedWildcard
Can generalize to `? extends Changelog`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java

    public static void refactorRepo(
            String path, String sourceFiles, String file, BiFunction<String, String, Changelog> transformation) {
        ConfigStore config = new ConfigStore();
        try (Repository repository = Git.open(new File(path)).checkout().getRepository()) {
```

### BoundedWildcard
Can generalize to `? extends GHPullRequest`
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/MentionCommands.java`
#### Snippet
```java
    }

    private void closePullRequestsWithLabelName(List<GHPullRequest> pr, String name) {
        for (GHPullRequest ghPullRequest : pr) {
            ghPullRequest.getLabels().forEach(v -> {
```

### BoundedWildcard
Can generalize to `? extends Message`
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/MentionCommands.java`
#### Snippet
```java
    }

    private void runQodanaOnRepo(GHEventPayload.IssueComment issueComment, AsyncResult<Message<ProjectResult>> v) {
        if (v.succeeded() && v.result().body() instanceof ProjectResult.Success success) {
            vertx.executeBlocking(project -> eventBus.<QodanaResult>request(
```

### BoundedWildcard
Can generalize to `? extends Message`
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/mining/PeriodicMiner.java`
#### Snippet
```java
    }

    private Promise<Void> mineProject(String repoName, AsyncResult<Message<ProjectResult>> message) {
        if (message.succeeded()) {
            logger.atInfo().log("Mining periodic %s", repoName);
```

### BoundedWildcard
Can generalize to `? extends List`
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/mining/MiningPrinter.java`
#### Snippet
```java
    }

    private String generateTableLine(Set<String> ruleIds, Entry<String, List<AnalyzerResult>> result) {
        return "| " + result.getKey() + " | " + result.getValue().size() + " | "
                + result.getValue().stream().anyMatch(v -> ruleIds.contains(v.ruleID())) + " |\n";
```

### BoundedWildcard
Can generalize to `? extends CtLiteral`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/EmptyStringCheck.java`
#### Snippet
```java
    }

    private boolean isSingleArgumentAndEmptyString(List<CtLiteral<?>> literals) {
        return literals.size() == 1 && literals.get(0).getValue().equals("");
    }
```

### BoundedWildcard
Can generalize to `? extends CtLiteral`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/EmptyStringCheck.java`
#### Snippet
```java
    }

    private boolean isEmptyStringArgument(List<CtLiteral<?>> literals) {
        return literals.get(0).getValue().equals("");
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/util/Nullsafe.java`
#### Snippet
```java
     * @return  the value of the given supplier if it doesn't throw an exception, otherwise returns the default value.
     */
    public static <T> T get(Supplier<T> supplier, T defaultValue) {
        try {
            return supplier.get();
```

### BoundedWildcard
Can generalize to `? extends CtExecutableReferenceExpression``>`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/MethodMayBeStatic.java`
#### Snippet
```java

    private void refactorExecutableReferences(
            CtMethod<?> method, List<CtExecutableReferenceExpression<?, CtTypeAccess<?>>> executableRefs) {
        for (CtExecutableReferenceExpression<?, CtTypeAccess<?>> executableRef : executableRefs) {
            if (executableRef.getExecutable() != null) {
```

### BoundedWildcard
Can generalize to `? extends CtInvocation`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/AssertionsTransformation.java`
#### Snippet
```java
    }

    private void convertToJunit5(List<CtInvocation<?>> junit4Asserts) {
        for (CtInvocation<?> junit4Assert : junit4Asserts) {
            junit4Assert.setTarget(null);
```

### BoundedWildcard
Can generalize to `? extends CtType`
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java

    private void createPullRequestForAffectedType(
            GHRepository repo, Path dir, Map<CtType<?>, List<Change>> changesByType) throws IOException {
        GHRef mainRef = repo.getRef("heads/" + repo.getDefaultBranch());
        logger.atInfo().log(
```

### BoundedWildcard
Can generalize to `? extends List`
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java

    private void createPullRequestForAffectedType(
            GHRepository repo, Path dir, Map<CtType<?>, List<Change>> changesByType) throws IOException {
        GHRef mainRef = repo.getRef("heads/" + repo.getDefaultBranch());
        logger.atInfo().log(
```

### BoundedWildcard
Can generalize to `? extends List`
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/ChangelogPrinter.java`
#### Snippet
```java
    }

    private String generateTableLine(Set<String> ruleIds, Entry<String, List<AnalyzerResult>> result) {
        return "| " + result.getKey() + " | " + result.getValue().size() + " | "
                + result.getValue().stream().anyMatch(v -> ruleIds.contains(v.ruleID())) + " |\n";
```

### BoundedWildcard
Can generalize to `? extends Change`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
    }

    private static String getFixedIssues(Collection<Change> change) {
        return change.stream()
                .map(Change::getBadSmell)
```

### BoundedWildcard
Can generalize to `? extends Change`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
    }

    private static void appendBadSmells(Collection<Change> changelog, StringBuilder sb) {
        sb.append("The following bad smells are refactored:\n");
        List<BadSmell> badSmells = changelog.stream()
```

### BoundedWildcard
Can generalize to `? extends CtImport`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/formatting/NewLineImportGroups.java`
#### Snippet
```java

    @Override
    public List<CtImport> group(List<CtImport> imports) {
        LinkedList<CtImport> newImports = new LinkedList<>();
        newImports.add(new NewlineImport());
```

### BoundedWildcard
Can generalize to `? extends AnalyzerResult`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaRefactor.java`
#### Snippet
```java
    }

    private void splitResults(List<AnalyzerResult> results) {
        for (AnalyzerResult result : results) {
            Optional.ofNullable(ruleParser.get(result.ruleID())).ifPresent(v -> refactorings.add(v.apply(result)));
```

## NullableProblems
### NullableProblems
Overridden methods are not annotated
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/analyzer/AnalyzerResult.java`
#### Snippet
```java
    String getAnalyzer();

    @Nonnull
    public String ruleID();

```

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

## SystemOutErr
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

## DefaultAnnotationParam
### DefaultAnnotationParam
Redundant default parameter value assignment
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/mining/PeriodicMiner.java`
#### Snippet
```java
    Vertx vertx;

    @Scheduled(every = "4h", delay = 10, delayUnit = TimeUnit.MINUTES)
    void mineRepos() throws IOException {
        Path dir = Files.createTempDirectory("laughing-wiki");
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/summary/PeriodicSummary.java`
#### Snippet
```java
    EventBus eventBus;

    @Scheduled(every = "2h", delay = 10, delayUnit = TimeUnit.MINUTES)
    public void createSummary() {
        eventBus.<FindIssueResult>request(ServiceAdresses.FIND_SUMMARY_ISSUE_REQUEST, "message")
```

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

## RedundantFieldInitialization
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

## GroovyUnusedAssignment
### GroovyUnusedAssignment
Assignment is not used
in `code-transformation/build.gradle`
#### Snippet
```java


def test = tasks.named("test") {
	useJUnitPlatform {
		excludeTags "Mining"
```

### GroovyUnusedAssignment
Assignment is not used
in `code-transformation/build.gradle`
#### Snippet
```java
}

def mining = tasks.register("mining", Test) {
	useJUnitPlatform {
		includeTags "Mining"
```

## AssignmentToMethodParameter
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
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertNotNullTransformation.java`
#### Snippet
```java
    public void process(CtInvocation<?> element) {
        if (element.getExecutable() != null && JunitHelper.isJunit5AssertTrue(element.getExecutable())) {
            CtInvocation<?> junit5AssertTrue = element;
            CtExpression<?> expression = element.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
```

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
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertNotNullTransformation.java`
#### Snippet
```java
                parent,
                new Change(
                        String.format("Replaced not nullcheck in assertTrue with assertNotNull"),
                        "AssertTrue instead of AssertNotNull",
                        parent));
```

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

## OptionalGetWithoutIsPresent
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

## StringConcatenationInsideStringBufferAppend
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

