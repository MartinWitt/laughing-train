# laughing-train 
 
# Bad smells
I found 199 bad smells with 9 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 60 | false |
| Deprecation | 17 | false |
| StringConcatenationInsideStringBufferAppend | 17 | false |
| DuplicatedCode | 13 | false |
| UNCHECKED_WARNING | 11 | false |
| CdiInjectionPointsInspection | 10 | false |
| JavadocReference | 8 | false |
| UnnecessaryLocalVariable | 6 | true |
| RedundantStringFormatCall | 6 | false |
| SimplifyStreamApiCallChains | 5 | false |
| AutoCloseableResource | 5 | false |
| RedundantCast | 5 | false |
| CdiManagedBeanInconsistencyInspection | 4 | false |
| DataFlowIssue | 3 | false |
| EmptyStatementBody | 3 | false |
| UnnecessaryStringEscape | 3 | true |
| DeprecatedIsStillUsed | 3 | false |
| RedundantTypeArguments | 2 | false |
| NullableProblems | 2 | false |
| RedundantStreamOptionalCall | 2 | false |
| OptionalGetWithoutIsPresent | 2 | false |
| CommentedOutCode | 1 | false |
| ReactiveStreamsUnusedPublisher | 1 | false |
| RefusedBequest | 1 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| FieldCanBeLocal | 1 | false |
| TrivialIf | 1 | false |
| DefaultAnnotationParam | 1 | false |
| JavadocDeclaration | 1 | false |
| RedundantFileCreation | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=CdiManagedBeanInconsistencyInspection]
### CdiManagedBeanInconsistencyInspection
Managed bean must have a constructor with no parameters or a constructor annotated with @Inject
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/mining/SearchProjectService.java`
#### Snippet
```java
 */
@ApplicationScoped
public class SearchProjectService {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
```

### CdiManagedBeanInconsistencyInspection
Managed bean must have a constructor with no parameters or a constructor annotated with @Inject
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/summary/GetFixableBadSmells.java`
#### Snippet
```java

@ApplicationScoped
public class GetFixableBadSmells {

    ProjectRepository projectRepository;
```

### CdiManagedBeanInconsistencyInspection
Managed bean must have a constructor with no parameters or a constructor annotated with @Inject
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/services/QodanaService.java`
#### Snippet
```java

@ApplicationScoped
public class QodanaService {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

```

### CdiManagedBeanInconsistencyInspection
Managed bean must have a constructor with no parameters or a constructor annotated with @Inject
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/mining/PeriodicMiner.java`
#### Snippet
```java

@ApplicationScoped
public class PeriodicMiner {

    static final FluentLogger logger = FluentLogger.forEnclosingClass();
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'xyz.keksdose.spoon.code_solver.spoon.NewLineAnnotation' to 'xyz.keksdose.spoon.code_solver.spoon.NewLineAnnotation'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/NewLineAnnotation.java`
#### Snippet
```java
    @Override
    public NewLineAnnotation<A> clone() {
        return (NewLineAnnotation<A>) new NewLineAnnotation<>();
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtTypeReference' to 'spoon.reflect.reference.CtTypeReference'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/NewLineAnnotation.java`
#### Snippet
```java

    private CtTypeReference<A> generateType() {
        return (CtTypeReference) getFactory().Type().createReference("");
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.reference.CtExecutableReference' to 'spoon.reflect.reference.CtExecutableReference'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/LambdaToExecutableReference.java`
#### Snippet
```java
            CtExecutableReferenceExpression<?, CtTypeAccess<?>> exec =
                    getFactory().Core().createExecutableReferenceExpression();
            exec.setExecutable((CtExecutableReference) invocation.getExecutable());
            exec.setType(getType(invocation));
            exec.setTarget(getFactory().createTypeAccess(invocation.getType()));
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.code.CtExpression' to 'spoon.reflect.code.CtExpression'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/UnnecessaryLocalVariable.java`
#### Snippet
```java
                        if (ctReturn.getReturnedExpression() instanceof CtVariableRead) {
                            ctReturn.setReturnedExpression(
                                    (CtExpression) ((CtLocalVariable<?>) statement).getDefaultExpression());
                            block.getStatements().remove(index);
                            listener.setChanged(
```

### UNCHECKED_WARNING
Unchecked call to 'setExpression(CtExpression)' as a member of raw type 'spoon.reflect.code.CtLambda'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/CodeBlock2Expr.java`
#### Snippet
```java
                CtExpression<?> statement = ((CtReturn) lambda.getBody().getStatement(0)).getReturnedExpression();
                lambda.setBody(null);
                lambda.setExpression(statement);
                String message =
                        "Lambda expression in %s was rewritten as statement".formatted(type.getQualifiedName());
```

### UNCHECKED_WARNING
Unchecked cast: 'spoon.reflect.declaration.CtElement' to 'spoon.reflect.code.CtInvocation'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/UnnecessaryToStringCall.java`
#### Snippet
```java
        return matches.stream()
                .filter(CtInvocation.class::isInstance)
                .map(v -> (CtInvocation<T>) v)
                .filter(v -> v.getExecutable() != null)
                .filter(v -> v.getExecutable().getSimpleName().equalsIgnoreCase("toString"))
```

### UNCHECKED_WARNING
Unchecked cast: 'spoon.reflect.code.CtStatement' to 'spoon.reflect.code.CtReturn'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/ThreadLocalWithInitial.java`
#### Snippet
```java

    private <T> CtExpression<T> getReturnStatement(CtStatement statement) {
        return ((CtReturn<T>) statement).getReturnedExpression();
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'spoon.reflect.code.CtExpression\>' to 'spoon.reflect.code.CtExpression'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/BooleanExpression.java`
#### Snippet
```java
            if (element.getRightHandOperand().toString().equals("false")) {
                CtUnaryOperator<Boolean> op = getFactory().createUnaryOperator();
                op.setOperand((CtExpression<Boolean>) element.getLeftHandOperand());
                op.setKind(UnaryOperatorKind.NOT);
                element.replace(op);
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.declaration.CtConstructor' to 'spoon.reflect.declaration.CtConstructor'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/UtilityClassWithoutPrivateConstructor.java`
#### Snippet
```java
        Factory factory = clazz.getFactory();
        CtConstructor<T> newConstructor =
                factory.createConstructor(clazz, Set.of(ModifierKind.PRIVATE), new ArrayList<>(), new HashSet<>());
        CtBlock<?> body = factory.createBlock();
        CtComment comment = createBodyComment(factory);
```

### UNCHECKED_WARNING
Unchecked cast: 'spoon.reflect.declaration.CtElement' to 'spoon.reflect.code.CtLiteral'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/UnnecessaryStringEscape.java`
#### Snippet
```java
        return matches.stream()
                .filter(CtLiteral.class::isInstance)
                .map(v -> (CtLiteral<T>) v)
                .toList();
    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'spoon.reflect.code.CtExpression' to 'spoon.reflect.code.CtExpression'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/InstantReturn.java`
#### Snippet
```java
                    CtAssignment<?, ?> assignment = (CtAssignment<?, ?>) statement;
                    if (assignment.getAssigned().equals(ctReturn.getReturnedExpression())) {
                        ctReturn.setReturnedExpression((CtExpression) assignment.getAssignment());
                        // setChanged(element, new Change("Removed return", "InstantReturn", element));
                    }
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `asString`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/history/MarkdownString.java`
#### Snippet
```java
 * This class wrappes a string with it's markdown formatted value.
 * Use this class to create markdown formatted strings.
 * {@link asString()} returns the raw string.
 * {@link asMarkdown()} returns the markdown formatted string.
 */
```

### JavadocReference
Cannot resolve symbol `asMarkdown`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/history/MarkdownString.java`
#### Snippet
```java
 * Use this class to create markdown formatted strings.
 * {@link asString()} returns the raw string.
 * {@link asMarkdown()} returns the markdown formatted string.
 */
public class MarkdownString {
```

### JavadocReference
Cannot resolve symbol `run`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaRefactor.java`
#### Snippet
```java
/**
 * This aggregates all qodana refactorings and wraps them in a single processor.
 * Use {@link run(Path, ChangeListener)} to analyse the source code.
 * <b> Note: </b> This requires a running docker host and can take some minutes.
 */
```

### JavadocReference
Cannot resolve symbol `apply(CtType)`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/AbstractRefactoring.java`
#### Snippet
```java
 * This defines a refactoring of a reported {@link AnalyzerResult}.
 * With the help of this class, the refactoring can be applied to the source code.
 * The refactoring is applied by calling the {@link #apply(CtType)} method.
 */
public abstract class AbstractRefactoring {
```

### JavadocReference
Cannot resolve symbol `compilationUnit`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/AbstractRefactoring.java`
#### Snippet
```java
     * Applies the refactoring to the given {@link CtType}.
     * @param listener  The listener which is used to report the changes.
     * @param compilationUnit  The type which contains the reported bad smell.
     */
    public abstract void refactor(ChangeListener listener, CtType<?> type);
```

### JavadocReference
Cannot resolve symbol
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/util/Nullsafe.java`
#### Snippet
```java
     * Returns the value of the given supplier if it doesn't throw an exception, otherwise returns the default value.
     * This method is useful for null-safe access to a value in the spoon metamodel.
     * @param <T>  the type of the value
     * @param supplier  the supplier
     * @param defaultValue  the default value to return if the supplier throws an exception
```

### JavadocReference
Cannot resolve symbol `ImportConflictDetector`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java
 * Updates list of import statements of compilation unit following {@link CtElement#isImplicit()}.
 * Can be configured to add or remove imports using {@link #setCanAddImports(boolean)} and {@link #setCanRemoveImports(boolean)}.
 * This does not force some references to be implicit, and doesn't fix the wrong implicit which causes conflicts: this fixing done by {@link ImportConflictDetector}
 */
@Experimental
```

### JavadocReference
Cannot resolve symbol `source`
in `application/src/main/java/io/github/martinwitt/laughing_train/application/base/converter/Converter.java`
#### Snippet
```java
    /**
     * Converts the given source object to a target object.
     * @param source the source object
     * @return the target object or {@code null} if the source object is {@code null}
     */
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
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

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/PointlessBooleanExpression.java`
#### Snippet
```java
    private boolean isAlreadyFixed(ChangeListener listener) {
        return listener.getChangelog().getChanges().stream()
                .anyMatch(v -> v.getAnalyzerResult().equals(result));
    }

```

### DataFlowIssue
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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/LambdaToExecutableReference.java`
#### Snippet
```java
        if (lambda.getBody() == null) {
            CtExpression<?> expression = lambda.getExpression();
            if (expression instanceof CtInvocation) {
                // TODO: handle this
            }
```

### EmptyStatementBody
`if` statement has empty body
in `code-transformation/src/main/java/spoon/reflect/visitor/ImportAnalyzer.java`
#### Snippet
```java
                            parent2 = parent.getParent();
                        }
                        if (parent2 instanceof CtConstructorCall<?>) {
                            // new SomeType(); is relevant for import
                            // continue
```

### EmptyStatementBody
`if` statement has empty body
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java
                    // the import doesn't exist in computed imports. Remove it
                    if (canRemoveImports) {
                        if (oldImport instanceof CtUnresolvedImport) {
                            // never remove unresolved imports
                        } else {
```

## RuleId[id=SimplifyStreamApiCallChains]
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

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/UnnecessaryStringEscape.java`
#### Snippet
```java
              ```java
              public String toString() {
              	return type.name() + ": \'" + token + "\'";
              }
              Here `\'` is an unnecessary escape. It can be replaced with `'`.
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/UnnecessaryStringEscape.java`
#### Snippet
```java
              ```java
              public String toString() {
              	return type.name() + ": \'" + token + "\'";
              }
              Here `\'` is an unnecessary escape. It can be replaced with `'`.
```

### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/UnnecessaryStringEscape.java`
#### Snippet
```java
              	return type.name() + ": \'" + token + "\'";
              }
              Here `\'` is an unnecessary escape. It can be replaced with `'`.
              ```
              """;
```

## RuleId[id=CommentedOutCode]
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

## RuleId[id=DeprecatedIsStillUsed]
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

## RuleId[id=ReactiveStreamsUnusedPublisher]
### ReactiveStreamsUnusedPublisher
Value is never used as Publisher
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/api/graphql/endpoints/RefactorGraphQL.java`
#### Snippet
```java
                        .map(RuleId::id)
                        .toList());
        refactorService.refactor(badSmellsToRefactor);

        return "Refactoring done";
```

## RuleId[id=RefusedBequest]
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

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/services/RefactorService.java`
#### Snippet
```java
            var analyzer = entry.getKey();
            var badSmellList = entry.getValue();
            switch (analyzer) {
                case "Qodana" -> refactorQodana(badSmellList);
                default -> logger.atWarning().log("Unknown analyzer %s", analyzer);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/TransformationEngine.java`
#### Snippet
```java
        PrinterCreation.setPrettyPrinter(environment, model);
        if (printing == null) {
            printing = new ChangedTypePrinting(environment.createPrettyPrinter());
        }
        if (changeListener == null) {
            changeListener = new ChangeListener();
        }
        ProcessingManager pm = new RepeatingProcessingManager(launcher.getFactory(), changeListener);
```

### DuplicatedCode
Duplicated code
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/NonStrictComparisonCanBeEquality.java`
#### Snippet
```java
        if (type.isAnonymous() || !isSameType(type, Path.of(result.filePath()))) {
            return;
        }
        int column = result.position().startColumn();
        int line = result.position().startLine();
        var operators = type.getElements(new TypeFilter<>(CtBinaryOperator.class));
```

### DuplicatedCode
Duplicated code
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/SizeReplaceableByIsEmpty.java`
#### Snippet
```java
            if (invocation == null) {
                return;
            }
            String invocationString = invocation.toString();
            String markdown = "Replaced `%s` in `%s` with `%s`";
            String raw = "Replaced %s in %s with %s";
            var isEmpty = createIsEmptyMethod(invocation.getFactory());
            ctBinaryOperator.replace(createNewInvocation(invocation.getTarget(), isEmpty));

            listener.setChanged(
                    type,
                    new Change(
                            badSmell,
                            MarkdownString.fromMarkdown(
                                    String.format(raw, invocationString, ctBinaryOperator, isEmpty),
                                    String.format(markdown, invocationString, ctBinaryOperator, isEmpty)),
                            type,
                            result));
```

### DuplicatedCode
Duplicated code
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/diffs/ExtraWhiteSpaceCleaner.java`
#### Snippet
```java
        if (!gitLineChange.newContent().equals(content)) {
            return content;
        }
        int position = delta.getTarget().getPosition();
        if (delta.getTarget().getLines().iterator().next().isBlank()) {
            return content.substring(0, position)
                    + content.substring(
                            position + delta.getTarget().getLines().get(0).length());
        }
        return content;
```

### DuplicatedCode
Duplicated code
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
        for (Entry<String, List<Change>> entry : changesByType.entrySet()) {
            sb.append("### " + entry.getKey() + "\n");
            sb.append(entry.getValue().stream()
                    .map(c -> "- " + c.getChangeText().asMarkdown())
                    .collect(Collectors.joining("\n")));
            sb.append("\n");
        }
```

### DuplicatedCode
Duplicated code
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
        for (BadSmell badSmell : badSmells) {
            sb.append("## " + badSmell.getName().asText() + "\n");
            sb.append(badSmell.getDescription().asMarkdown() + "\n");
            for (Link link : badSmell.getLinks()) {
                sb.append("- " + link + "\n");
            }
        }
        sb.append("\n");
```

### DuplicatedCode
Duplicated code
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder();
        sb.append("The following has changed in the code:\n");
        for (Change change : log.getChanges()) {
            if (change.getAffectedType().getSimpleName().equals(name)) {
                sb.append(change.getChangeText().asText() + "\n");
            }
        }
        return sb.toString();
```

### DuplicatedCode
Duplicated code
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
        StringBuilder sb = new StringBuilder();
        sb.append("# Changelog\n");
        appendBadSmells(changelog, sb);
        sb.append("## The following has changed in the code:\n");
        appendChanges(changesByType, sb);
        try {
            Files.writeString(path, sb);
        } catch (IOException e) {
            logger.atSevere().withCause(e).log("Could not write markdown changelog" + path);
        }
```

### DuplicatedCode
Duplicated code
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertFalseSameCheck.java`
#### Snippet
```java
            CtInvocation<?> junit5AssertTrue = invocation;
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
                CtBinaryOperator<?> binaryOperator = (CtBinaryOperator<?>) expression;
                if (binaryOperator.getKind().equals(BinaryOperatorKind.EQ)) {
                    CtInvocation<?> junit5AssertNotNull = createJunit5AssertSame(
                            binaryOperator.getLeftHandOperand(), binaryOperator.getRightHandOperand());
                    junit5AssertNotNull.setComments(invocation.getComments());
                    junit5AssertTrue.replace(junit5AssertNotNull);
                    if (invocation.getArguments().size() == 3) {
                        // readd the String if it fails argument
                        junit5AssertNotNull.addArgument(
                                invocation.getArguments().get(2).clone());
                    }
                    adjustImports(invocation);
                    notifyChangeListener(junit5AssertTrue);
                }
            }
```

### DuplicatedCode
Duplicated code
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertNotNullTransformation.java`
#### Snippet
```java
        CtExpression<?> left = binaryOperator.getLeftHandOperand();
        CtExpression<?> right = binaryOperator.getRightHandOperand();
        if (isNullType(left)) {
            return right;
        }
        if (isNullType(right)) {
            return left;
        }
        return null;
```

### DuplicatedCode
Duplicated code
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java
        GHRef mainRef = repo.getRef("heads/" + repo.getDefaultBranch());
        logger.atInfo().log("Found changes for %s types", changes.size());
        String branchName = branchNameSupplier.createBranchName();
        GHRef ref =
                repo.createRef("refs/heads/" + branchName, mainRef.getObject().getSha());
        StringBuilder body = new StringBuilder();
        body.append(changelogPrinter.printRepairedIssues(changes));
```

### DuplicatedCode
Duplicated code
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java
        var treeBuilder = repo.createTree().baseTree(ref.getObject().getSha());
        for (CtType<?> ctType : types) {
            treeBuilder.add(
                    relativize(dir, getFileForType(ctType)),
                    Files.readString(getFileForType(ctType)).replace("\r\n", "\n"),
                    false);
        }
        var tree = treeBuilder.create();
```

### DuplicatedCode
Duplicated code
in `persistence/src/main/java/io/github/martinwitt/laughing_train/persistence/impl/MongoProjectConfigRepository.java`
#### Snippet
```java
        var list = find("projectUrl", projectConfig.getProjectUrl()).list();
        if (list.isEmpty()) {
            persist(projectConfigConverter.convertToDao(projectConfig));
        } else {
            var dao = projectConfigConverter.convertToDao(projectConfig);
            dao.id = list.get(0).id;
            update(dao);
        }
        return projectConfig;
```

## RuleId[id=StringBufferReplaceableByString]
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

## RuleId[id=Deprecation]
### Deprecation
'xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor.Builder' is deprecated
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/QodanaBuilder.java`
#### Snippet
```java

    public QodanaBuilder withNonProtectedConstructorInAbstractClass() {
        qodanaCreator.add(QodanaRefactor.Builder::withNonProtectedConstructorInAbstractClass);
        return this;
    }
```

### Deprecation
'xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor.Builder' is deprecated
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/QodanaBuilder.java`
#### Snippet
```java

    public QodanaBuilder withUnnecessaryLocalVariable() {
        qodanaCreator.add(QodanaRefactor.Builder::withUnnecessaryLocalVariable);
        return this;
    }
```

### Deprecation
'xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor.Builder' is deprecated
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/QodanaBuilder.java`
#### Snippet
```java

    public QodanaBuilder withNonStrictComparisonCanBeEquality() {
        qodanaCreator.add(QodanaRefactor.Builder::withNonStrictComparisonCanBeEquality);
        return this;
    }
```

### Deprecation
'xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor.Builder' is deprecated
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/QodanaBuilder.java`
#### Snippet
```java

    public QodanaBuilder withMethodMayBeStatic() {
        qodanaCreator.add(QodanaRefactor.Builder::withMethodMayBeStatic);
        return this;
    }
```

### Deprecation
'xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor.Builder' is deprecated
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/QodanaBuilder.java`
#### Snippet
```java

    public QodanaBuilder withSizeReplaceableByIsEmpty() {
        qodanaCreator.add(QodanaRefactor.Builder::withSizeReplaceableByIsEmpty);
        return this;
    }
```

### Deprecation
'xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor.Builder' is deprecated
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/QodanaBuilder.java`
#### Snippet
```java

    public QodanaBuilder withUnnecessaryReturn() {
        qodanaCreator.add(QodanaRefactor.Builder::withUnnecessaryReturn);
        return this;
    }
```

### Deprecation
'xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor.Builder' is deprecated
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/QodanaBuilder.java`
#### Snippet
```java
public class QodanaBuilder {

    private List<UnaryOperator<QodanaRefactor.Builder>> qodanaCreator;
    private Supplier<QodanaRefactor.Builder> qodanaCreatorSupplier;

```

### Deprecation
'xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor.Builder' is deprecated
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/QodanaBuilder.java`
#### Snippet
```java

    public QodanaBuilder withUnnecessaryToStringCall() {
        qodanaCreator.add(QodanaRefactor.Builder::withUnnecessaryToStringCall);
        return this;
    }
```

### Deprecation
'xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor.Builder' is deprecated
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/QodanaBuilder.java`
#### Snippet
```java

    public QodanaBuilder withParameterNameDiffersFromOverriddenParameter() {
        qodanaCreator.add(QodanaRefactor.Builder::withParameterNameDiffersFromOverriddenParameter);
        return this;
    }
```

### Deprecation
'xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor.Builder' is deprecated
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/QodanaBuilder.java`
#### Snippet
```java

    public QodanaBuilder withUnusedImport() {
        qodanaCreator.add(QodanaRefactor.Builder::withUnusedImport);
        return this;
    }
```

### Deprecation
'xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor.Builder' is deprecated
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/QodanaBuilder.java`
#### Snippet
```java
    public QodanaRefactor build() {
        @Var var builder = qodanaCreatorSupplier.get();
        for (UnaryOperator<QodanaRefactor.Builder> function : qodanaCreator) {
            builder = function.apply(builder);
        }
```

### Deprecation
'xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor.Builder' is deprecated
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/QodanaBuilder.java`
#### Snippet
```java

    public QodanaBuilder(ChangeListener listener) {
        qodanaCreatorSupplier = () -> new QodanaRefactor.Builder(listener);
        qodanaCreator = new ArrayList<>();
    }
```

### Deprecation
'withCacheFolder(java.lang.String)' is deprecated
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/QodanaBuilder.java`
#### Snippet
```java

    public QodanaBuilder withCacheFolder(String cacheFolder) {
        qodanaCreator.add(v -> v.withCacheFolder(cacheFolder));
        return this;
    }
```

### Deprecation
'xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor.Builder' is deprecated
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/QodanaBuilder.java`
#### Snippet
```java

    public QodanaBuilder withUnnecessaryInterfaceModifier() {
        qodanaCreator.add(QodanaRefactor.Builder::withUnnecessaryInterfaceModifier);
        return this;
    }
```

### Deprecation
'xyz.keksdose.spoon.code_solver.analyzer.qodana.QodanaRefactor.Builder' is deprecated
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/QodanaBuilder.java`
#### Snippet
```java

    private List<UnaryOperator<QodanaRefactor.Builder>> qodanaCreator;
    private Supplier<QodanaRefactor.Builder> qodanaCreatorSupplier;

    public QodanaBuilder(ChangeListener listener) {
```

### Deprecation
'analyze(java.nio.file.Path)' is deprecated
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/Refactoring.java`
#### Snippet
```java
    public void apply() {
        File project = repoCheckout.prepareRepo();
        qodanaRefactor.analyze(project.toPath());
        TransformationEngine transformationEngine = new TransformationEngine(List.of(v -> qodanaRefactor));
        transformationEngine.setPrinting(printing);
```

### Deprecation
'withRemoveResultDir(boolean)' is deprecated
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
        var builder = new QodanaAnalyzer.Builder();
        if (keepCache) {
            builder.withRemoveResultDir(false);
        }
        ChangeListener listener = new ChangeListener();
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/formatting/GoogleStyle.java`
#### Snippet
```java
        }
        LinkedList<CtImport> newImports = new LinkedList<>();
        newImports.addAll(nonStaticImports);
        newImports.add(getNewLineImport());
        newImports.addAll(staticImports);
```

## RuleId[id=CdiInjectionPointsInspection]
### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/api/graphql/endpoints/ProjectGraphQL.java`
#### Snippet
```java

    @Inject
    Vertx vertx;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/api/graphql/endpoints/ProjectGraphQL.java`
#### Snippet
```java

    @Inject
    PeriodicMiner periodicMiner;

    @Query("getProjects")
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/mining/SearchProjectService.java`
#### Snippet
```java

        @Inject
        SearchProjectService searchProjectService;

        @Override
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/api/graphql/endpoints/BadSmellGraphQL.java`
#### Snippet
```java

    @Inject
    GetFixableBadSmells getFixableBadSmells;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `persistence/src/main/java/io/github/martinwitt/laughing_train/persistence/DataBaseMigration.java`
#### Snippet
```java

    @Inject
    Vertx vertx;

    /**
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/services/ProjectService.java`
#### Snippet
```java

    @Inject
    Vertx vertx;

    public ProjectResult handleProjectRequest(ProjectRequest request) {
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/MentionCommands.java`
#### Snippet
```java

    @Inject
    QodanaService qodanaService;

    @Inject
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/MentionCommands.java`
#### Snippet
```java

    @Inject
    Vertx vertx;

    void mentionCommands(@IssueComment GHEventPayload.IssueComment issueComment) throws IOException {
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/App.java`
#### Snippet
```java

    @Inject
    QodanaService qodanaService;

    void onConfigEdit(@Issue.Edited GHEventPayload.Issue issueComment) throws IOException {
```

### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/services/RefactorService.java`
#### Snippet
```java

    @Inject
    Vertx vertx;

    @Inject
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/services/ProjectService.java`
#### Snippet
```java
                        .invoke(e -> FileUtils.deleteQuietly(dir.toFile()))
                        .onItemOrFailure()
                        .<ProjectResult>transform((git, error) -> toResult(url, repoName, dir, git, error))
                        .await()
                        .indefinitely();
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/services/RefactorService.java`
#### Snippet
```java
        logger.atInfo().log("Found %s config ", projectConfig);
        projectConfig
                .<ProjectConfig>flatMap(list -> {
                    if (list.isEmpty()) {
                        logger.atWarning().log("No config found for %s", projectUrl);
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @Nonnull
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/impl/GitCheckout.java`
#### Snippet
```java

    @Override
    public File prepareRepo() {
        try {
            ConfigStore config = new ConfigStore();
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

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaRefactor.java`
#### Snippet
```java
    private List<AbstractRefactoring> refactorings;
    private List<Consumer<QodanaAnalyzer.Builder>> settings = new ArrayList<>();
    private List<AnalyzerResult> results;

    private QodanaRefactor(Builder builder) {
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/qodana/EmptyStringCheck.java`
#### Snippet
```java
            } else {
                List<CtLiteral<?>> literals = element.getTarget().getElements(new TypeFilter<>(CtLiteral.class));
                if (isSingleArgumentAndEmptyString(literals)) {
                    return true;
                }
```

## RuleId[id=RedundantStreamOptionalCall]
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

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/summary/PeriodicSummary.java`
#### Snippet
```java
    }

    @Scheduled(every = "2h", delay = 10, delayUnit = TimeUnit.MINUTES)
    public void createSummary() {
        var summaryIssue = issueRequestService.getSummaryIssue();
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Git' used without 'try'-with-resources statement
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/CommitBuilder.java`
#### Snippet
```java
            String path, String sourceFiles, String file, BiFunction<String, String, Changelog> transformation) {
        ConfigStore config = new ConfigStore();
        try (Repository repository = Git.open(new File(path)).checkout().getRepository()) {
            Git git = new Git(repository);
            git.checkout().setName(config.getGitDefaultBranchName()).call();
```

### AutoCloseableResource
'Git' used without 'try'-with-resources statement
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/impl/GitPushSsh.java`
#### Snippet
```java
    public void apply(Changelog changelog, File projectRoot) {
        ConfigStore config = new ConfigStore();
        try (Repository repository = Git.open(projectRoot).getRepository()) {
            Git git = new Git(repository);
            addFileToGit(projectRoot, git, changelog);
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
    private static void addFileToGit(File tempRepoFolder, Git git, Change change) throws IOException, GitAPIException {
        File changedFile = change.getAffectedType().getPosition().getFile();
        Path changedFilePath = Files.find(
                        tempRepoFolder.toPath(),
                        Integer.MAX_VALUE,
```

### AutoCloseableResource
'Git' used without 'try'-with-resources statement
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
            ConfigStore config = new ConfigStore();
            File tempRepoFolder = Files.createTempDirectory(repoName).toFile();
            Git.cloneRepository().setURI(repoUrl).setDirectory(tempRepoFolder).call();
            try (Repository repository = Git.open(tempRepoFolder).checkout().getRepository()) {
                Git git = new Git(repository);
```

### AutoCloseableResource
'Git' used without 'try'-with-resources statement
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/github/PullRequest.java`
#### Snippet
```java
            File tempRepoFolder = Files.createTempDirectory(repoName).toFile();
            Git.cloneRepository().setURI(repoUrl).setDirectory(tempRepoFolder).call();
            try (Repository repository = Git.open(tempRepoFolder).checkout().getRepository()) {
                Git git = new Git(repository);
                switchToCleanBranch(config, git);
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/mining/SearchProjectService.java`
#### Snippet
```java
     * Only projects from the config property {@code mining.github.search.orgs} are considered.
     * @return  a random project from github as a {@link Project}
     * @throws IOException
     */
    public Project searchProjectOnGithub() throws IOException {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `new NewLineAnnotation<>()` to `NewLineAnnotation` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/NewLineAnnotation.java`
#### Snippet
```java
    @Override
    public NewLineAnnotation<A> clone() {
        return (NewLineAnnotation<A>) new NewLineAnnotation<>();
    }

```

### RedundantCast
Casting `getFactory().Type().createReference(...)` to `CtTypeReference` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/NewLineAnnotation.java`
#### Snippet
```java

    private CtTypeReference<A> generateType() {
        return (CtTypeReference) getFactory().Type().createReference("");
    }

```

### RedundantCast
Casting `getFactory().Type().voidType()` to `CtTypeReference` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/migration/ExpectedExceptionRemoval.java`
#### Snippet
```java
                        typeRef, getFactory().Type().voidType(), "assertThrows", List.of(clazzRef, executableJunit));
        CtLambda<?> lambda = getFactory().createLambda();
        lambda.setType((CtTypeReference) getFactory().Type().voidType());
        lambda.setBody(body);
        return getFactory().createInvocation(null, assertThrows, List.of(exceptionClass, lambda));
```

### RedundantCast
Casting `element.getBody().getLastStatement()` to `CtReturn` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/InstantReturn.java`
#### Snippet
```java

        if (element.getBody().getLastStatement() instanceof CtReturn) {
            CtReturn<?> returnStatement = (CtReturn<?>) element.getBody().getLastStatement();
            int size = body.getStatements().size();
            CtStatement statement = body.getStatement(size - 2);
```

### RedundantCast
Casting `thenBlock.getStatement(...)` to `CtReturn` is redundant
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/self/InstantReturn.java`
#### Snippet
```java
                    CtBlock<?> thenBlock = (CtBlock<?>) thenStatement;
                    if (thenBlock.getStatements().size() == 1 && thenBlock.getStatement(0) instanceof CtReturn) {
                        CtReturn<?> ifReturnStatement = (CtReturn<?>) thenBlock.getStatement(0);
                    }
                }
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `url` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/history/Link.java`
#### Snippet
```java
public class Link {

    private String url;

    public Link(String url) {
```

### FieldMayBeFinal
Field `text` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/history/MarkdownString.java`
#### Snippet
```java
public class MarkdownString {

    private String text;
    private String markdownText;

```

### FieldMayBeFinal
Field `markdownText` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/history/MarkdownString.java`
#### Snippet
```java

    private String text;
    private String markdownText;

    private MarkdownString(String text) {
```

### FieldMayBeFinal
Field `changes` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/history/Changelog.java`
#### Snippet
```java
public class Changelog {

    private List<Change> changes = new ArrayList<>();

    public void addChange(Change change) {
```

### FieldMayBeFinal
Field `changedTypes` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/history/ChangeListener.java`
#### Snippet
```java
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private boolean changed;
    private Set<CtType<?>> changedTypes = new HashSet<>();
    private Changelog changelog = new Changelog();

```

### FieldMayBeFinal
Field `changelog` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/history/ChangeListener.java`
#### Snippet
```java
    private boolean changed;
    private Set<CtType<?>> changedTypes = new HashSet<>();
    private Changelog changelog = new Changelog();

    public boolean isChanged() {
```

### FieldMayBeFinal
Field `property` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/config/ConfigStore.java`
#### Snippet
```java

    private static final String CONFIG_FILE_NAME = "app.properties";
    private Properties property;

    public ConfigStore() {
```

### FieldMayBeFinal
Field `affectedType` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/history/Change.java`
#### Snippet
```java
    private MarkdownString text;
    private String issue;
    private CtType<?> affectedType;
    private BadSmell badsmell = BadSmell.emptyRule();
    private AnalyzerResult analyzerResult;
```

### FieldMayBeFinal
Field `issue` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/history/Change.java`
#### Snippet
```java

    private MarkdownString text;
    private String issue;
    private CtType<?> affectedType;
    private BadSmell badsmell = BadSmell.emptyRule();
```

### FieldMayBeFinal
Field `text` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/history/Change.java`
#### Snippet
```java
public class Change {

    private MarkdownString text;
    private String issue;
    private CtType<?> affectedType;
```

### FieldMayBeFinal
Field `ruleParser` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaRefactor.java`
#### Snippet
```java
public class QodanaRefactor extends TransformationProcessor<CtType<?>> {

    private Map<RuleId, Function<AnalyzerResult, AbstractRefactoring>> ruleParser;
    private List<AbstractRefactoring> refactorings;
    private List<Consumer<QodanaAnalyzer.Builder>> settings = new ArrayList<>();
```

### FieldMayBeFinal
Field `refactorings` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaRefactor.java`
#### Snippet
```java

    private Map<RuleId, Function<AnalyzerResult, AbstractRefactoring>> ruleParser;
    private List<AbstractRefactoring> refactorings;
    private List<Consumer<QodanaAnalyzer.Builder>> settings = new ArrayList<>();
    private List<AnalyzerResult> results;
```

### FieldMayBeFinal
Field `listener` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaRefactor.java`
#### Snippet
```java
    public static class Builder {

        private ChangeListener listener;
        private Map<String, Function<AnalyzerResult, AbstractRefactoring>> ruleParser = new HashMap<>();
        private List<Consumer<QodanaAnalyzer.Builder>> settings = new ArrayList<>();
```

### FieldMayBeFinal
Field `settings` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaRefactor.java`
#### Snippet
```java
        private ChangeListener listener;
        private Map<String, Function<AnalyzerResult, AbstractRefactoring>> ruleParser = new HashMap<>();
        private List<Consumer<QodanaAnalyzer.Builder>> settings = new ArrayList<>();

        public Builder(ChangeListener listener) {
```

### FieldMayBeFinal
Field `ruleParser` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaRefactor.java`
#### Snippet
```java

        private ChangeListener listener;
        private Map<String, Function<AnalyzerResult, AbstractRefactoring>> ruleParser = new HashMap<>();
        private List<Consumer<QodanaAnalyzer.Builder>> settings = new ArrayList<>();

```

### FieldMayBeFinal
Field `settings` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaRefactor.java`
#### Snippet
```java
    private Map<RuleId, Function<AnalyzerResult, AbstractRefactoring>> ruleParser;
    private List<AbstractRefactoring> refactorings;
    private List<Consumer<QodanaAnalyzer.Builder>> settings = new ArrayList<>();
    private List<AnalyzerResult> results;

```

### FieldMayBeFinal
Field `endLine` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/PositionScanner.java`
#### Snippet
```java
    private int startLine;
    private int startColumn;
    private int endLine;
    private int endColumn;
    private int charOffset;
```

### FieldMayBeFinal
Field `startLine` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/PositionScanner.java`
#### Snippet
```java
public class PositionScanner extends EarlyTerminatingScanner<List<CtElement>> {

    private int startLine;
    private int startColumn;
    private int endLine;
```

### FieldMayBeFinal
Field `endColumn` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/PositionScanner.java`
#### Snippet
```java
    private int startColumn;
    private int endLine;
    private int endColumn;
    private int charOffset;
    private int charLength;
```

### FieldMayBeFinal
Field `projectDaoConverter` may be 'final'
in `persistence/src/main/java/io/github/martinwitt/laughing_train/persistence/impl/MongoProjectRepository.java`
#### Snippet
```java

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private ProjectDaoConverter projectDaoConverter = new ProjectDaoConverter();

    public List<Project> findByProjectName(String projectName) {
```

### FieldMayBeFinal
Field `qodanaCreatorSupplier` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/QodanaBuilder.java`
#### Snippet
```java

    private List<UnaryOperator<QodanaRefactor.Builder>> qodanaCreator;
    private Supplier<QodanaRefactor.Builder> qodanaCreatorSupplier;

    public QodanaBuilder(ChangeListener listener) {
```

### FieldMayBeFinal
Field `qodanaCreator` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/QodanaBuilder.java`
#### Snippet
```java
public class QodanaBuilder {

    private List<UnaryOperator<QodanaRefactor.Builder>> qodanaCreator;
    private Supplier<QodanaRefactor.Builder> qodanaCreatorSupplier;

```

### FieldMayBeFinal
Field `style` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/formatting/ImportGrouper.java`
#### Snippet
```java
public class ImportGrouper extends AbstractProcessor<CtElement> {

    private ImportGrouping style;

    public ImportGrouper(ImportGrouping style) {
```

### FieldMayBeFinal
Field `repoCheckout` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/Refactoring.java`
#### Snippet
```java
public class Refactoring {

    private RepoCheckout repoCheckout;
    private QodanaRefactor qodanaRefactor;
    private List<AfterRefactorStep> afterRefactorSteps;
```

### FieldMayBeFinal
Field `afterRefactorSteps` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/Refactoring.java`
#### Snippet
```java
    private RepoCheckout repoCheckout;
    private QodanaRefactor qodanaRefactor;
    private List<AfterRefactorStep> afterRefactorSteps;
    private ChangeListener listener;
    private IPrinting printing;
```

### FieldMayBeFinal
Field `subProjectSuffix` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/Refactoring.java`
#### Snippet
```java
    private ChangeListener listener;
    private IPrinting printing;
    private String subProjectSuffix;

    private Refactoring(Refactoring.Builder builder) {
```

### FieldMayBeFinal
Field `afterRefactorStep` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/Refactoring.java`
#### Snippet
```java
        private RepoCheckout repoCheckout;
        private QodanaRefactor qodanaRefactor;
        private List<AfterRefactorStep> afterRefactorStep = new ArrayList<>();
        private ChangeListener listener = new ChangeListener();
        private IPrinting printing = null;
```

### FieldMayBeFinal
Field `qodanaRefactor` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/Refactoring.java`
#### Snippet
```java
    public static class Builder {
        private RepoCheckout repoCheckout;
        private QodanaRefactor qodanaRefactor;
        private List<AfterRefactorStep> afterRefactorStep = new ArrayList<>();
        private ChangeListener listener = new ChangeListener();
```

### FieldMayBeFinal
Field `qodanaRefactor` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/Refactoring.java`
#### Snippet
```java

    private RepoCheckout repoCheckout;
    private QodanaRefactor qodanaRefactor;
    private List<AfterRefactorStep> afterRefactorSteps;
    private ChangeListener listener;
```

### FieldMayBeFinal
Field `listener` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/Refactoring.java`
#### Snippet
```java
    private QodanaRefactor qodanaRefactor;
    private List<AfterRefactorStep> afterRefactorSteps;
    private ChangeListener listener;
    private IPrinting printing;
    private String subProjectSuffix;
```

### FieldMayBeFinal
Field `printing` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/Refactoring.java`
#### Snippet
```java
    private List<AfterRefactorStep> afterRefactorSteps;
    private ChangeListener listener;
    private IPrinting printing;
    private String subProjectSuffix;

```

### FieldMayBeFinal
Field `repoCheckout` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/api/Refactoring.java`
#### Snippet
```java

    public static class Builder {
        private RepoCheckout repoCheckout;
        private QodanaRefactor qodanaRefactor;
        private List<AfterRefactorStep> afterRefactorStep = new ArrayList<>();
```

### FieldMayBeFinal
Field `importString` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/ImportHelper.java`
#### Snippet
```java
        }

        private String importString;
        private CtImport result;

```

### FieldMayBeFinal
Field `prettyPrinter` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/printing/ChangedTypePrinting.java`
#### Snippet
```java
public class ChangedTypePrinting implements IPrinting {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private PrettyPrinter prettyPrinter;

    public ChangedTypePrinting(PrettyPrinter prettyPrinter) {
```

### FieldMayBeFinal
Field `typeRefQNames` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java
        private Map<String, CtImport> computedImports;
        private String packageQName;
        private Set<String> typeRefQNames;

        Context(CtCompilationUnit cu) {
```

### FieldMayBeFinal
Field `compilationUnit` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java
    /** a set of imports for a given compilation unit */
    public class Context {
        private CtCompilationUnit compilationUnit;
        private Map<String, CtImport> computedImports;
        private String packageQName;
```

### FieldMayBeFinal
Field `computedImports` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/spoon/ImportCleaner.java`
#### Snippet
```java
    public class Context {
        private CtCompilationUnit compilationUnit;
        private Map<String, CtImport> computedImports;
        private String packageQName;
        private Set<String> typeRefQNames;
```

### FieldMayBeFinal
Field `badSmell` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/ToArrayCallWithZeroLengthArrayArgument.java`
#### Snippet
```java
public class ToArrayCallWithZeroLengthArrayArgument extends AbstractRefactoring {

    private static BadSmell badSmell = new BadSmell() {

        @Override
```

### FieldMayBeFinal
Field `badSmell` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/rules/ProtectedMemberInFinalClass.java`
#### Snippet
```java
public class ProtectedMemberInFinalClass extends AbstractRefactoring {

    private static BadSmell badSmell = new BadSmell() {

        @Override
```

### FieldMayBeFinal
Field `projectConfigConverter` may be 'final'
in `persistence/src/main/java/io/github/martinwitt/laughing_train/persistence/impl/MongoProjectConfigRepository.java`
#### Snippet
```java
public class MongoProjectConfigRepository implements ProjectConfigRepository, PanacheMongoRepository<ProjectConfigDao> {

    private static ProjectConfigConverter projectConfigConverter = new ProjectConfigConverter();

    public List<ProjectConfig> findByProjectUrl(String projectUrl) {
```

### FieldMayBeFinal
Field `projectName` may be 'final'
in `commons/src/main/java/io/github/martinwitt/laughing_train/domain/entity/Project.java`
#### Snippet
```java
public class Project implements Serializable {

    private String projectName;
    private String projectUrl;
    private List<String> commitHashes;
```

### FieldMayBeFinal
Field `projectUrl` may be 'final'
in `commons/src/main/java/io/github/martinwitt/laughing_train/domain/entity/Project.java`
#### Snippet
```java

    private String projectName;
    private String projectUrl;
    private List<String> commitHashes;

```

### FieldMayBeFinal
Field `commitHashes` may be 'final'
in `commons/src/main/java/io/github/martinwitt/laughing_train/domain/entity/Project.java`
#### Snippet
```java
    private String projectName;
    private String projectUrl;
    private List<String> commitHashes;

    public Project(String projectName, String projectUrl) {
```

### FieldMayBeFinal
Field `queue` may be 'final'
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/mining/PeriodicMiner.java`
#### Snippet
```java

    private final Random random = new Random();
    private Queue<Project> queue = new ArrayDeque<>();

    public PeriodicMiner(
```

### FieldMayBeFinal
Field `processors` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/TransformationEngine.java`
#### Snippet
```java

    private static final FluentLogger LOGGER = FluentLogger.forEnclosingClass();
    private List<Function<ChangeListener, TransformationProcessor<?>>> processors;
    private IPrinting printing;
    private ChangeListener changeListener;
```

### FieldMayBeFinal
Field `position` may be 'final'
in `persistence/src/main/java/io/github/martinwitt/laughing_train/persistence/BadSmell.java`
#### Snippet
```java
    private String projectUrl;
    private String commitHash;
    private Position position;

    public BadSmell(AnalyzerResult result, String projectName, String projectUrl, String commitHash) {
```

### FieldMayBeFinal
Field `commitHash` may be 'final'
in `persistence/src/main/java/io/github/martinwitt/laughing_train/persistence/BadSmell.java`
#### Snippet
```java
    private String projectName;
    private String projectUrl;
    private String commitHash;
    private Position position;

```

### FieldMayBeFinal
Field `messageMarkdown` may be 'final'
in `persistence/src/main/java/io/github/martinwitt/laughing_train/persistence/BadSmell.java`
#### Snippet
```java
    private String filePath;
    private String message;
    private String messageMarkdown;
    private String snippet;
    private String projectName;
```

### FieldMayBeFinal
Field `analyzer` may be 'final'
in `persistence/src/main/java/io/github/martinwitt/laughing_train/persistence/BadSmell.java`
#### Snippet
```java
public class BadSmell implements AnalyzerResult {

    private String analyzer;
    private String identifier;
    private String ruleID;
```

### FieldMayBeFinal
Field `projectName` may be 'final'
in `persistence/src/main/java/io/github/martinwitt/laughing_train/persistence/BadSmell.java`
#### Snippet
```java
    private String messageMarkdown;
    private String snippet;
    private String projectName;
    private String projectUrl;
    private String commitHash;
```

### FieldMayBeFinal
Field `ruleID` may be 'final'
in `persistence/src/main/java/io/github/martinwitt/laughing_train/persistence/BadSmell.java`
#### Snippet
```java
    private String analyzer;
    private String identifier;
    private String ruleID;
    private String filePath;
    private String message;
```

### FieldMayBeFinal
Field `identifier` may be 'final'
in `persistence/src/main/java/io/github/martinwitt/laughing_train/persistence/BadSmell.java`
#### Snippet
```java

    private String analyzer;
    private String identifier;
    private String ruleID;
    private String filePath;
```

### FieldMayBeFinal
Field `projectUrl` may be 'final'
in `persistence/src/main/java/io/github/martinwitt/laughing_train/persistence/BadSmell.java`
#### Snippet
```java
    private String snippet;
    private String projectName;
    private String projectUrl;
    private String commitHash;
    private Position position;
```

### FieldMayBeFinal
Field `snippet` may be 'final'
in `persistence/src/main/java/io/github/martinwitt/laughing_train/persistence/BadSmell.java`
#### Snippet
```java
    private String message;
    private String messageMarkdown;
    private String snippet;
    private String projectName;
    private String projectUrl;
```

### FieldMayBeFinal
Field `filePath` may be 'final'
in `persistence/src/main/java/io/github/martinwitt/laughing_train/persistence/BadSmell.java`
#### Snippet
```java
    private String identifier;
    private String ruleID;
    private String filePath;
    private String message;
    private String messageMarkdown;
```

### FieldMayBeFinal
Field `message` may be 'final'
in `persistence/src/main/java/io/github/martinwitt/laughing_train/persistence/BadSmell.java`
#### Snippet
```java
    private String ruleID;
    private String filePath;
    private String message;
    private String messageMarkdown;
    private String snippet;
```

### FieldMayBeFinal
Field `qodanaImageName` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private String resultFolder;
    private String qodanaImageName;
    private String resultPathString;
    private String sourceFileRoot;
```

### FieldMayBeFinal
Field `resultPathString` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java
    private String resultFolder;
    private String qodanaImageName;
    private String resultPathString;
    private String sourceFileRoot;

```

### FieldMayBeFinal
Field `resultFolder` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java
    private static final int QODANA_TIME_LIMIT = 25;
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private String resultFolder;
    private String qodanaImageName;
    private String resultPathString;
```

### FieldMayBeFinal
Field `sourceFileRoot` may be 'final'
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/analyzer/qodana/QodanaAnalyzer.java`
#### Snippet
```java
    private String qodanaImageName;
    private String resultPathString;
    private String sourceFileRoot;

    private QodanaAnalyzer(Builder builder) {
```

## RuleId[id=UnnecessaryLocalVariable]
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
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertNullTransformation.java`
#### Snippet
```java
    public void process(CtInvocation<?> invocation) {
        if (invocation.getExecutable() != null && JunitHelper.isJunit5AssertTrue(invocation.getExecutable())) {
            CtInvocation<?> junit5AssertTrue = invocation;
            CtExpression<?> expression = invocation.getArguments().iterator().next();
            if (expression instanceof CtBinaryOperator) {
```

## RuleId[id=RedundantStringFormatCall]
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
in `code-transformation/src/main/java/xyz/keksdose/spoon/code_solver/transformations/junit/simplification/AssertNullTransformation.java`
#### Snippet
```java
                parent,
                new Change(
                        String.format("Replaced nullcheck in assertTrue with assertNull"),
                        "AssertTrue instead of AssertNull",
                        parent));
```

## RuleId[id=RedundantFileCreation]
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

## RuleId[id=OptionalGetWithoutIsPresent]
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

## RuleId[id=ConstantValue]
### ConstantValue
Condition `result == null` is always `false`
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/summary/PeriodicSummary.java`
#### Snippet
```java
                .replace("\"", "")
                .trim();
        if (result == null || result.isEmpty()) {
            return "Multiple rules";
        } else {
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
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
    private static void appendChanges(Map<String, List<Change>> changesByType, StringBuilder sb) {
        for (Entry<String, List<Change>> entry : changesByType.entrySet()) {
            sb.append("### " + entry.getKey() + "\n");
            sb.append(entry.getValue().stream()
                    .map(c -> "- " + c.getChangeText().asMarkdown())
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/ChangelogPrinter.java`
#### Snippet
```java
        sb.append("# Repairing Code Style Issues\n");
        sb.append("<!-- laughing-train-refactor -->\n");
        changes.stream().map(Change::getBadSmell).distinct().forEach(v -> sb.append(
                        "## " + v.getName().asText() + "\n")
                .append(v.getDescription().asMarkdown())
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `github-bot/src/main/java/io/github/martinwitt/laughing_train/ChangelogPrinter.java`
#### Snippet
```java
        var changesByBadSmell = changes.stream().collect(Collectors.groupingBy(Change::getBadSmell));
        for (var change : changesByBadSmell.entrySet()) {
            sb.append("* %s".formatted(change.getKey().getName().asMarkdown())
                    + " (%s)%n".formatted(change.getValue().size()));
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

