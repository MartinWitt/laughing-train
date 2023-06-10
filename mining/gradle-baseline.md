# gradle-baseline 
 
# Bad smells
I found 181 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| NullableProblems | 50 | false |
| Deprecation | 36 | false |
| UnstableApiUsage | 24 | false |
| DataFlowIssue | 18 | false |
| UNCHECKED_WARNING | 12 | false |
| SimplifyOptionalCallChains | 10 | false |
| DuplicatedCode | 5 | false |
| RedundantCast | 4 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| JavadocReference | 3 | false |
| ConstantValue | 3 | false |
| FunctionalExpressionCanBeFolded | 2 | false |
| JavaReflectionMemberAccess | 2 | false |
| IgnoreResultOfCall | 2 | false |
| AutoCloseableResource | 1 | false |
| UnnecessarySemicolon | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| RegExpSimplifiable | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| TrivialIf | 1 | false |
## RuleId[id=FunctionalExpressionCanBeFolded]
### FunctionalExpressionCanBeFolded
Method reference can be replaced with qualifier
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/InvocationHandlerDelegation.java`
#### Snippet
```java
            // If Method.invoke occurs in a lambda or anonymous class, we don't have enough
            // conviction that it's a bug.
            Matchers.contains(LambdaExpressionTree.class, CONTAINS_METHOD_INVOKE::matches),
            Matchers.contains(NewClassTree.class, CONTAINS_METHOD_INVOKE::matches));

```

### FunctionalExpressionCanBeFolded
Method reference can be replaced with qualifier
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/InvocationHandlerDelegation.java`
#### Snippet
```java
            // conviction that it's a bug.
            Matchers.contains(LambdaExpressionTree.class, CONTAINS_METHOD_INVOKE::matches),
            Matchers.contains(NewClassTree.class, CONTAINS_METHOD_INVOKE::matches));

    private static final Matcher<MethodInvocationTree> MATCHER = Matchers.allOf(
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'NO_MATCH'
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictCollectionIncompatibleType.java`
#### Snippet
```java
         * additional {@link IncompatibleTypeMatcher matchers}.
         */
        Optional<Description> NO_MATCH = Optional.of(Description.NO_MATCH);

        /**
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'maybeSourceSet'
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineErrorProne.java`
#### Snippet
```java
            BaselineErrorProneExtension errorProneExtension,
            JavaCompile javaCompile,
            Optional<SourceSet> maybeSourceSet,
            ErrorProneOptions errorProneOptions) {
        // If this javaCompile is associated with a source set, use it to figure out if it has preconditions or not.
```

### OptionalUsedAsFieldOrParameterType
`OptionalLong` used as type for field 'endTime'
in `gradle-junit-reports/src/main/java/com/palantir/gradle/junit/DefaultTaskTimer.java`
#### Snippet
```java
    static final class Timer {
        private final long startTime;
        private OptionalLong endTime;

        Timer() {
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'org.gradle.api.provider.Property'
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineTesting.java`
#### Snippet
```java
        try {
            Method getTestFrameworkProperty = Test.class.getMethod("getTestFrameworkProperty");
            return (Property<org.gradle.api.internal.tasks.testing.TestFramework>)
                    getTestFrameworkProperty.invoke(task);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(
```

### UNCHECKED_WARNING
Unchecked call to 'filter(Predicate)' as a member of raw type 'java.util.stream.Stream'
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
            String targetJvmVersion = "-target:" + SCALA_TARGET_VERSION;
            Node rootNode = xmlProvider.asNode();
            Node scalaCompilerConf = (Node) rootNode.getAt(new QName("component")).stream()
                    .filter(o -> ((Node) o).attributes().get("name").equals("ScalaCompilerConfiguration"))
                    .findFirst()
                    .orElseGet(() ->
```

### UNCHECKED_WARNING
Unchecked call to 'orElseGet(Supplier)' as a member of raw type 'java.util.Optional'
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
            String targetJvmVersion = "-target:" + SCALA_TARGET_VERSION;
            Node rootNode = xmlProvider.asNode();
            Node scalaCompilerConf = (Node) rootNode.getAt(new QName("component")).stream()
                    .filter(o -> ((Node) o).attributes().get("name").equals("ScalaCompilerConfiguration"))
                    .findFirst()
                    .orElseGet(() ->
                            rootNode.appendNode("component", ImmutableMap.of("name", "ScalaCompilerConfiguration")));
            // configure scala compilation order
```

### UNCHECKED_WARNING
Unchecked call to 'filter(Predicate)' as a member of raw type 'java.util.stream.Stream'
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
                            rootNode.appendNode("component", ImmutableMap.of("name", "ScalaCompilerConfiguration")));
            // configure scala compilation order
            Node compilerOrder = (Node) scalaCompilerConf.getAt(new QName("option")).stream()
                    .filter(o -> ((Node) o).attributes().get("name").equals("compileOrder"))
                    .findFirst()
                    .orElseGet(() -> scalaCompilerConf.appendNode("option"));
```

### UNCHECKED_WARNING
Unchecked call to 'orElseGet(Supplier)' as a member of raw type 'java.util.Optional'
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
                            rootNode.appendNode("component", ImmutableMap.of("name", "ScalaCompilerConfiguration")));
            // configure scala compilation order
            Node compilerOrder = (Node) scalaCompilerConf.getAt(new QName("option")).stream()
                    .filter(o -> ((Node) o).attributes().get("name").equals("compileOrder"))
                    .findFirst()
                    .orElseGet(() -> scalaCompilerConf.appendNode("option"));
            compilerOrder.attributes().put("name", "compileOrder");
            compilerOrder.attributes().put("value", compilerMode);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
                    .findFirst()
                    .orElseGet(() -> scalaCompilerConf.appendNode("option"));
            compilerOrder.attributes().put("name", "compileOrder");
            compilerOrder.attributes().put("value", compilerMode);
            Node parametersNode = (Node) scalaCompilerConf.getAt(new QName("parameters")).stream()
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
                    .orElseGet(() -> scalaCompilerConf.appendNode("option"));
            compilerOrder.attributes().put("name", "compileOrder");
            compilerOrder.attributes().put("value", compilerMode);
            Node parametersNode = (Node) scalaCompilerConf.getAt(new QName("parameters")).stream()
                    .findFirst()
```

### UNCHECKED_WARNING
Unchecked call to 'orElseGet(Supplier)' as a member of raw type 'java.util.Optional'
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
            compilerOrder.attributes().put("name", "compileOrder");
            compilerOrder.attributes().put("value", compilerMode);
            Node parametersNode = (Node) scalaCompilerConf.getAt(new QName("parameters")).stream()
                    .findFirst()
                    .orElseGet(() -> scalaCompilerConf.appendNode("parameters"));
            Node parameter = (Node) parametersNode.getAt(new QName("parameter")).stream()
                    .filter(o -> ((Node) o).attributes().get("value").equals(targetJvmVersion))
```

### UNCHECKED_WARNING
Unchecked call to 'filter(Predicate)' as a member of raw type 'java.util.stream.Stream'
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
                    .findFirst()
                    .orElseGet(() -> scalaCompilerConf.appendNode("parameters"));
            Node parameter = (Node) parametersNode.getAt(new QName("parameter")).stream()
                    .filter(o -> ((Node) o).attributes().get("value").equals(targetJvmVersion))
                    .findFirst()
                    .orElseGet(() -> parametersNode.appendNode("parameter"));
```

### UNCHECKED_WARNING
Unchecked call to 'orElseGet(Supplier)' as a member of raw type 'java.util.Optional'
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
                    .findFirst()
                    .orElseGet(() -> scalaCompilerConf.appendNode("parameters"));
            Node parameter = (Node) parametersNode.getAt(new QName("parameter")).stream()
                    .filter(o -> ((Node) o).attributes().get("value").equals(targetJvmVersion))
                    .findFirst()
                    .orElseGet(() -> parametersNode.appendNode("parameter"));
            parameter.attributes().put("value", targetJvmVersion);
        });
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
                    .findFirst()
                    .orElseGet(() -> parametersNode.appendNode("parameter"));
            parameter.attributes().put("value", targetJvmVersion);
        });
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.gradle.api.attributes.Attribute\>' to 'org.gradle.api.attributes.Attribute'
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineExactDependencies.java`
#### Snippet
```java
                    compileClasspath.getAttributes().keySet().forEach(attribute -> {
                        Object value = compileClasspath.getAttributes().getAttribute(attribute);
                        conf.getAttributes().attribute((Attribute<Object>) attribute, value);
                    });
                });
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineFormat.java`
#### Snippet
```java
        Stream<Path> files;
        try {
            files = Files.list(copyrightDir.toPath()).sorted(Comparator.comparing(Path::getFileName));
        } catch (IOException e) {
            throw new RuntimeException("Couldn't list copyright directory: " + copyrightDir);
```

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `Type` is inaccessible from here
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictCollectionIncompatibleType.java`
#### Snippet
```java
    /**
     * Pretty prints the input type for use in description messages. This is not suitable for suggested fixes because
     * unlike {@link SuggestedFixes#prettyType(VisitorState, SuggestedFix.Builder, Type)} with non-null state and
     * builder, it doesn't add relevant imports.
     */
```

### JavadocReference
Symbol `Symbol` is inaccessible from here
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java

    interface UnusedSpec {
        /** {@link Symbol} of the unsued element. */
        Symbol symbol();

```

### JavadocReference
Cannot resolve symbol `getCompileConfigurationName()`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineExactDependencies.java`
#### Snippet
```java

    /**
     * The {@link SourceSet#getCompileConfigurationName()} method got removed in Gradle 7. Because we want to stay
     * compatible with Gradle 6 but can't compile this method, we reimplement it temporarily.
     * TODO(fwindheuser): Remove after dropping support for Gradle 6.
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/PreferSafeLoggableExceptions.java`
#### Snippet
```java
                .reduce((one, two) -> one);

        if (!messageArg.isPresent()) {
            return Description.NO_MATCH;
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/OptionalFlatMapOfNullable.java`
#### Snippet
```java
        LambdaExpressionTree lambdaExpressionTree = (LambdaExpressionTree) functionParameter;
        Optional<ExpressionTree> maybeExpression = finalExpression(lambdaExpressionTree);
        if (!maybeExpression.isPresent()) {
            return Description.NO_MATCH;
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/ImmutablesBuilderMissingInitialization.java`
#### Snippet
```java
                        ASTHelpers.hasAnnotation(classSymbol, "org.immutables.value.Value.Immutable", state))
                .findAny();
        if (!interfaceClass.isPresent()) {
            return Description.NO_MATCH;
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/Slf4jLevelCheck.java`
#### Snippet
```java
        // against it.
        Optional<MethodInvocationTree> maybeCheckLevel = tree.getCondition().accept(ConditionVisitor.INSTANCE, state);
        if (!maybeCheckLevel.isPresent()) {
            return Description.NO_MATCH;
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StringBuilderConstantParameters.java`
#### Snippet
```java
        }
        Optional<List<ExpressionTree>> result = tree.getMethodSelect().accept(StringBuilderVisitor.INSTANCE, state);
        if (!result.isPresent()) {
            return Description.NO_MATCH;
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
                .filter(a -> allUsageSites.stream().noneMatch(tp -> tp.getLeaf().equals(a)))
                .findFirst();
        if (!removedVariableTree.isPresent() || !reassignment.isPresent()) {
            return SuggestedFix.builder().build();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
                .filter(a -> allUsageSites.stream().noneMatch(tp -> tp.getLeaf().equals(a)))
                .findFirst();
        if (!removedVariableTree.isPresent() || !reassignment.isPresent()) {
            return SuggestedFix.builder().build();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckJUnitDependencies.java`
#### Snippet
```java
        getProbablyTestSourceSets().forEach(ss -> {
            Optional<Test> maybeTestTask = BaselineTesting.getTestTaskForSourceSet(getProject(), ss);
            if (!maybeTestTask.isPresent()) {
                // source set doesn't have a test task, e.g. 'schema'
                return;
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineReleaseCompatibility.java`
#### Snippet
```java
                    Optional.ofNullable(javaCompile.getTargetCompatibility()).map(JavaVersion::toVersion);

            if (!taskTarget.isPresent()) {
                log.debug(
                        "BaselineReleaseCompatibility is a no-op for {} in {} as no targetCompatibility is set",
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineTesting.java`
#### Snippet
```java
    private void fixSourceSet(Project project, SourceSet ss) {
        Optional<Test> maybeTestTask = getTestTaskForSourceSet(project, ss);
        if (!maybeTestTask.isPresent()) {
            log.warn("Detected 'org:junit.jupiter:junit-jupiter', but unable to find test task");
            return;
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineModuleJvmArgs.java`
#### Snippet
```java
    enum OpensMode {
        COMPILATION,
        RUNTIME;
    }
}
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `ASTHelpers.getResultType(tree)` might be null
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/MoreAbstractAsKeyOfSetOrMap.java`
#### Snippet
```java
        }
        if (HASH_KEYED_METHODS.matches(tree, state)) {
            return checkType(tree, ASTHelpers.getResultType(tree), state);
        }
        if (HASH_KEYED_COLLECTOR_METHODS.matches(tree, state)) {
```

### DataFlowIssue
Dereference of `ASTHelpers.enclosingClass(methodSymbol)` may produce `NullPointerException`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/ClassInitializationDeadlock.java`
#### Snippet
```java
            if (methodSymbol != null
                    && methodSymbol.isStatic()
                    && isSubtype(ASTHelpers.enclosingClass(methodSymbol).type, baseType, state)) {
                state.reportMatch(describeMatch(node));
                return null;
```

### DataFlowIssue
Dereference of `type` may produce `NullPointerException`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/ImmutablesReferenceEquality.java`
#### Snippet
```java
    protected boolean matchArgument(ExpressionTree tree, VisitorState state) {
        Type type = ASTHelpers.getType(tree);
        if (!(type.tsym instanceof ClassSymbol)) {
            return false;
        }
```

### DataFlowIssue
Method invocation `subSequence` may produce `NullPointerException`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/PreferSafeLogger.java`
#### Snippet
```java
        if (args > MAX_SUPPORTED_ARGS) {
            // Update the call to wrap args with 'Arrays.asList' so the result will compile.
            CharSequence argsSource = state.getSourceCode().subSequence(firstArgStartPosition, lastArgEndPosition);
            String qualifiedArrays = SuggestedFixes.qualifyType(state, fix, Arrays.class.getName());
            fix.replace(
```

### DataFlowIssue
Method invocation `replace` may produce `NullPointerException`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/UnnecessarilyQualified.java`
#### Snippet
```java
                SuggestedFix.Builder fix = SuggestedFix.builder();
                String treeSource = state.getSourceForNode(tree);
                String updated = treeSource.replace(nameString, SuggestedFixes.qualifyType(state, fix, nameString));
                return buildDescription(tree)
                        .addFix(fix.replace(tree, updated).build())
```

### DataFlowIssue
Method invocation `indexOf` may produce `NullPointerException`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/ImplicitPublicBuilderConstructor.java`
#### Snippet
```java
        // If no fields exist, the constructor is placed after the curly brace
        int constructorPosition = ((JCTree) tree).getStartPosition()
                + state.getSourceForNode(tree).indexOf('{')
                + 1;

```

### DataFlowIssue
Argument `receiverSymbol` might be null
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/LambdaMethodReference.java`
#### Snippet
```java
        if (!symbol.isStatic()
                && receiver instanceof IdentifierTree
                && !Objects.equals(ImmutableList.of(receiverSymbol), getSymbols(root.getParameters()))) {
            if (!isFinal(receiverSymbol)) {
                // Not safe to replace lambdas which lazily reference values with an eager capture.
```

### DataFlowIssue
Method invocation `getModifiers` may produce `NullPointerException`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/ThrowSpecificity.java`
#### Snippet
```java
                && (symbol.isStatic()
                        || methodModifiers.contains(Modifier.FINAL)
                        || ASTHelpers.enclosingClass(symbol).getModifiers().contains(Modifier.FINAL));
    }

```

### DataFlowIssue
Unboxing of `VALIDATE_METHODS_MESSAGE_ARGS.get(methodName)` may produce `NullPointerException`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/ValidateConstantMessage.java`
#### Snippet
```java
        }

        int messageArgNumber = VALIDATE_METHODS_MESSAGE_ARGS.get(methodName);
        List<? extends ExpressionTree> args = tree.getArguments();

```

### DataFlowIssue
Argument `builderClass` might be null
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/ImmutablesBuilderMissingInitialization.java`
#### Snippet
```java
        }
        ClassSymbol builderClass = ASTHelpers.enclosingClass(ASTHelpers.getSymbol(tree));
        ClassSymbol immutableClass = ASTHelpers.enclosingClass(builderClass);
        if (immutableClass == null) {
            return Description.NO_MATCH;
```

### DataFlowIssue
Dereference of `symbol` may produce `NullPointerException`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/IllegalSafeLoggingArgument.java`
#### Snippet
```java
            Symbol symbol = ASTHelpers.getSymbol(tree);
            // List<String> -> Collection<E> gives us Collection<String>
            Type boundToMethodOwner = state.getTypes().asSuper(receiver, symbol.owner);
            List<TypeVariableSymbol> ownerTypeVars = symbol.owner.getTypeParameters();
            // Validate that the type parameters match -- it's possible raw types are used, and
```

### DataFlowIssue
Argument `ASTHelpers.getType(typeTree)` might be null
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/VarUsage.java`
#### Snippet
```java
                                        token.pos(),
                                        token.endPos(),
                                        SuggestedFixes.prettyType(state, fix, ASTHelpers.getType(typeTree)))
                                .build())
                        .build();
```

### DataFlowIssue
Method invocation `getKind` may produce `NullPointerException`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
            Symbol symbol = getSymbol(tree.getVariable());
            // Check if it was actually assigned to at this depth (or is a parameter).
            if (!((hasBeenAssigned.contains(symbol) && symbol.getKind() == ElementKind.LOCAL_VARIABLE)
                    || symbol.getKind() == ElementKind.PARAMETER)) {
                return;
```

### DataFlowIssue
Method invocation `getKind` may produce `NullPointerException`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
            // Check if it was actually assigned to at this depth (or is a parameter).
            if (!((hasBeenAssigned.contains(symbol) && symbol.getKind() == ElementKind.LOCAL_VARIABLE)
                    || symbol.getKind() == ElementKind.PARAMETER)) {
                return;
            }
```

### DataFlowIssue
Argument `assignmentSite` might be null
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
            hasBeenAssigned.add(symbol);
            TreePath assignmentSite = declarationSites.get(symbol);
            if (scopeDepth(assignmentSite) != Iterables.size(getCurrentPath().getParentPath())) {
                return;
            }
```

### DataFlowIssue
Method invocation `getKind` may produce `NullPointerException`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
            StatementTree statement = (StatementTree) usagePath.getLeaf();
            if (statement.getKind() == Tree.Kind.VARIABLE) {
                if (getSymbol(statement).getKind() == ElementKind.PARAMETER) {
                    continue;
                }
```

### DataFlowIssue
Method invocation `getRequired` may produce `NullPointerException`
in `gradle-junit-reports/src/main/java/com/palantir/gradle/junit/CheckstyleReportHandler.java`
#### Snippet
```java
    public void configureTask(Checkstyle task) {
        // Ensure XML output is enabled
        task.getReports().findByName("xml").getRequired().set(true);
    }

```

### DataFlowIssue
Argument `value` might be null
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineExactDependencies.java`
#### Snippet
```java
                    compileClasspath.getAttributes().keySet().forEach(attribute -> {
                        Object value = compileClasspath.getAttributes().getAttribute(attribute);
                        conf.getAttributes().attribute((Attribute<Object>) attribute, value);
                    });
                });
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `(classTree, state) -> {...}` to `Matcher` is redundant
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/MoreMatchers.java`
#### Snippet
```java
     */
    static <T extends ClassTree> Matcher<T> classEnclosingClass(Matcher<ClassTree> matcher) {
        return (Matcher<T>) (classTree, state) -> {
            TreePath currentPath = state.getPath().getParentPath();
            while (currentPath != null) {
```

### RedundantCast
Casting `(tree, state) -> {...}` to `Matcher` is redundant
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/MoreMatchers.java`
#### Snippet
```java
     */
    static <T extends Tree> Matcher<T> hasExplicitModifier(Modifier modifier) {
        return (Matcher<T>) (tree, state) -> {
            if (tree instanceof ClassTree) {
                return containsModifier(((ClassTree) tree).getModifiers(), state, modifier);
```

### RedundantCast
Casting `(type, state) -> {...}` to `TypePredicate` is redundant
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/InvocationHandlerDelegation.java`
#### Snippet
```java
            new DescendantOf(Suppliers.typeFromClass(InvocationTargetException.class));

    private static final TypePredicate IS_ITE_UNION = (TypePredicate) (type, state) -> {
        if (type.isUnion()) {
            for (Type unionType : MoreASTHelpers.expandUnion(type)) {
```

### RedundantCast
Casting `node.getTree()` to `TypeCastTree` is redundant
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/safety/SafetyPropagationTransfer.java`
#### Snippet
```java
    public TransferResult<Safety, AccessPathStore<Safety>> visitTypeCast(
            TypeCastNode node, TransferInput<Safety, AccessPathStore<Safety>> input) {
        TypeCastTree castTree = (TypeCastTree) node.getTree();
        return handleTypeConversion(castTree.getType(), node.getOperand(), input);
    }
```

## RuleId[id=JavaReflectionMemberAccess]
### JavaReflectionMemberAccess
Cannot resolve method 'getRecordComponents'
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/SafeLoggingPropagation.java`
#### Snippet
```java
        try {
            return (List<VarSymbol>)
                    ClassSymbol.class.getMethod("getRecordComponents").invoke(classSymbol);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Failed to get record components", e);
```

### JavaReflectionMemberAccess
Cannot resolve method 'getRawSourceCompatibility'
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckExplicitSourceCompatibilityTask.java`
#### Snippet
```java
                Method getRawSourceCompatibility =
                        org.gradle.api.plugins.internal.DefaultJavaPluginConvention.class.getMethod(
                                "getRawSourceCompatibility");
                return (JavaVersion) getRawSourceCompatibility.invoke(convention);
            } catch (Exception e) {
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/SafeLoggingPropagation.java`
#### Snippet
```java
            case SAFE:
                // Do not suggest promotion to safe, this check is not exhaustive.
                return Description.NO_MATCH;
            case DO_NOT_LOG:
                return annotate(tree, treeModifiers, state, SafetyAnnotations.DO_NOT_LOG);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/PreconditionsMessageFormat.java`
#### Snippet
```java
        if (!messageArg.getKind().equals(Tree.Kind.STRING_LITERAL)) {
            return Description.NO_MATCH;
        }

        if (!(messageArg instanceof LiteralTree)) {
            return Description.NO_MATCH;
        }
        LiteralTree literalTreeMessageArg = (LiteralTree) messageArg;

        Object value = literalTreeMessageArg.getValue();

        if (!(value instanceof String)) {
            return Description.NO_MATCH;
        }
        String message = (String) value;
```

### DuplicatedCode
Duplicated code
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictCollectionIncompatibleType.java`
#### Snippet
```java
        for (int i = 0; i < matchers.size(); i++) {
            IncompatibleTypeMatcher matcher = matchers.get(i);
            Optional<Description> result = matcher.describe(tree, state);
            if (result.isPresent()) {
                return result.get();
            }
        }
        return Description.NO_MATCH;
```

### DuplicatedCode
Duplicated code
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictCollectionIncompatibleType.java`
#### Snippet
```java
                Type targetType = getTargetTypeAsSuper(tree, baseType, state);
                if (targetType == null) {
                    return IncompatibleTypeMatcher.NO_MATCH;
                }
                if (targetType.getTypeArguments().size() <= typeArgumentIndex) {
                    return IncompatibleTypeMatcher.NO_MATCH;
                }
                Type typeArgumentType = targetType.getTypeArguments().get(typeArgumentIndex);
```

### DuplicatedCode
Duplicated code
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/safety/SafetyPropagationTransfer.java`
#### Snippet
```java
            Analysis<Safety, AccessPathStore<Safety>, SafetyPropagationTransfer> analysis =
                    new ForwardAnalysisImpl<>(this);
            analysis.performAnalysis(cfg);
            Safety maybeResult = analysis.getValue(variableDefinition.getLeaf());
            return maybeResult == null ? Safety.UNKNOWN : maybeResult;
```

### DuplicatedCode
Duplicated code
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineModuleJvmArgs.java`
#### Snippet
```java
                    test.getJvmArgumentProviders().add(new CommandLineArgumentProvider() {

                        @Override
                        public Iterable<String> asArguments() {
                            ImmutableList<String> arguments =
                                    collectClasspathArgs(project, extension, test.getClasspath(), OpensMode.RUNTIME);
                            project.getLogger()
                                    .debug(
                                            "BaselineModuleJvmArgs executing {} on {} with exports: {}",
                                            test.getName(),
                                            project,
                                            arguments);
                            return arguments;
                        }
                    });

                    setTaskInputsFromExtension(test, extension);
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[^\\s]` can be simplified to '\\S'
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/util/VersionsProps.java`
#### Snippet
```java

public final class VersionsProps {
    private static final Pattern VERSION_FORCE_REGEX = Pattern.compile("([^:=\\s]+:[^:=\\s]+)\\s*=\\s*([^\\s]+)");

    private VersionsProps() {}
```

## RuleId[id=Deprecation]
### Deprecation
'org.gradle.util.GFileUtils' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/util/GitUtils.java`
#### Snippet
```java
    public static Optional<String> maybeGitHubUri() {
        try {
            String gitConfigContents = GFileUtils.readFile(new File(".git/config"));
            Matcher matcher = GIT_ORIGIN.matcher(gitConfigContents);
            if (matcher.find()) {
```

### Deprecation
'getConvention()' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckJUnitDependencies.java`
#### Snippet
```java

    private Stream<SourceSet> getProbablyTestSourceSets() {
        return getProject().getConvention().getPlugin(JavaPluginConvention.class).getSourceSets().stream()
                .filter(ss -> !ss.getName().equals(SourceSet.MAIN_SOURCE_SET_NAME));
    }
```

### Deprecation
'org.gradle.api.plugins.JavaPluginConvention' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckJUnitDependencies.java`
#### Snippet
```java

    private Stream<SourceSet> getProbablyTestSourceSets() {
        return getProject().getConvention().getPlugin(JavaPluginConvention.class).getSourceSets().stream()
                .filter(ss -> !ss.getName().equals(SourceSet.MAIN_SOURCE_SET_NAME));
    }
```

### Deprecation
'getConvention()' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckExplicitSourceCompatibilityTask.java`
#### Snippet
```java
            org.gradle.api.plugins.internal.DefaultJavaPluginConvention convention =
                    (org.gradle.api.plugins.internal.DefaultJavaPluginConvention)
                            getProject().getConvention().getPlugin(JavaPluginConvention.class);

            try {
```

### Deprecation
'org.gradle.api.plugins.JavaPluginConvention' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckExplicitSourceCompatibilityTask.java`
#### Snippet
```java
            org.gradle.api.plugins.internal.DefaultJavaPluginConvention convention =
                    (org.gradle.api.plugins.internal.DefaultJavaPluginConvention)
                            getProject().getConvention().getPlugin(JavaPluginConvention.class);

            try {
```

### Deprecation
'org.gradle.util.GFileUtils' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckClassUniquenessLockTask.java`
#### Snippet
```java
        if (lockFile.exists()) {
            if (getProject().getGradle().getStartParameter().isWriteDependencyLocks()) {
                GFileUtils.deleteQuietly(lockFile);
                getLogger()
                        .lifecycle(
```

### Deprecation
'org.gradle.util.GFileUtils' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckClassUniquenessLockTask.java`
#### Snippet
```java
    private void ensureLockfileContains(String expected) {
        if (getProject().getGradle().getStartParameter().isWriteDependencyLocks()) {
            GFileUtils.writeFile(expected, lockFile);
            getLogger()
                    .lifecycle("Updated {}", getProject().getRootDir().toPath().relativize(lockFile.toPath()));
```

### Deprecation
'org.gradle.util.GFileUtils' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckClassUniquenessLockTask.java`
#### Snippet
```java
        }

        String onDisk = GFileUtils.readFile(lockFile);
        if (!onDisk.equals(expected)) {
            List<String> onDiskLines = Splitter.on('\n').splitToList(onDisk);
```

### Deprecation
'org.gradle.api.plugins.JavaPluginConvention' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineCheckstyle.java`
#### Snippet
```java
        // Configure checkstyle
        project.getPluginManager().withPlugin("java", plugin -> {
            JavaPluginConvention javaConvention = project.getConvention().getPlugin(JavaPluginConvention.class);
            // We use the "JavadocMethod" module in our Checkstyle configuration, making
            // Java 8+ new doclint compiler feature redundant.
```

### Deprecation
'getConvention()' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineCheckstyle.java`
#### Snippet
```java
        // Configure checkstyle
        project.getPluginManager().withPlugin("java", plugin -> {
            JavaPluginConvention javaConvention = project.getConvention().getPlugin(JavaPluginConvention.class);
            // We use the "JavadocMethod" module in our Checkstyle configuration, making
            // Java 8+ new doclint compiler feature redundant.
```

### Deprecation
'org.gradle.api.plugins.JavaPluginConvention' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineCheckstyle.java`
#### Snippet
```java
        // Configure checkstyle
        project.getPluginManager().withPlugin("java", plugin -> {
            JavaPluginConvention javaConvention = project.getConvention().getPlugin(JavaPluginConvention.class);
            // We use the "JavadocMethod" module in our Checkstyle configuration, making
            // Java 8+ new doclint compiler feature redundant.
```

### Deprecation
'groovy.util.XmlParser' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/XmlUtils.java`
#### Snippet
```java
        if (configurationFile.isFile()) {
            try {
                rootNode = new XmlParser().parse(configurationFile);
            } catch (IOException | SAXException | ParserConfigurationException e) {
                throw new RuntimeException("Couldn't parse existing configuration file: " + configurationFile, e);
```

### Deprecation
'groovy.util.XmlNodePrinter' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/XmlUtils.java`
#### Snippet
```java
        try (BufferedWriter writer = Files.newWriter(configurationFile, StandardCharsets.UTF_8);
                PrintWriter printWriter = new PrintWriter(writer)) {
            XmlNodePrinter nodePrinter = new XmlNodePrinter(printWriter);
            nodePrinter.setPreserveWhitespace(true);
            nodePrinter.print(rootNode);
```

### Deprecation
'groovy.util.XmlNodePrinter' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/XmlUtils.java`
#### Snippet
```java
        try (BufferedWriter writer = Files.newWriter(configurationFile, StandardCharsets.UTF_8);
                PrintWriter printWriter = new PrintWriter(writer)) {
            XmlNodePrinter nodePrinter = new XmlNodePrinter(printWriter);
            nodePrinter.setPreserveWhitespace(true);
            nodePrinter.print(rootNode);
```

### Deprecation
'getConvention()' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineFormat.java`
#### Snippet
```java
            // Configure a lazy FileCollection then pass it as the target
            ConfigurableFileCollection allJavaFiles = project.files();
            project.getConvention()
                    .getPlugin(JavaPluginConvention.class)
                    .getSourceSets()
```

### Deprecation
'org.gradle.api.plugins.JavaPluginConvention' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineFormat.java`
#### Snippet
```java
            ConfigurableFileCollection allJavaFiles = project.files();
            project.getConvention()
                    .getPlugin(JavaPluginConvention.class)
                    .getSourceSets()
                    .all(sourceSet -> allJavaFiles.from(sourceSet.getAllJava().filter(file -> !file.toString()
```

### Deprecation
'getConvention()' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineTesting.java`
#### Snippet
```java
                    project.getTasks().register("checkJUnitDependencies", CheckJUnitDependencies.class);

            project.getConvention()
                    .getPlugin(JavaPluginConvention.class)
                    .getSourceSets()
```

### Deprecation
'org.gradle.api.plugins.JavaPluginConvention' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineTesting.java`
#### Snippet
```java

            project.getConvention()
                    .getPlugin(JavaPluginConvention.class)
                    .getSourceSets()
                    .configureEach(sourceSet -> {
```

### Deprecation
'org.gradle.api.plugins.JavaPluginConvention' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
        this.project = project;
        project.getPluginManager().withPlugin("scala", plugin -> {
            JavaPluginConvention javaConvention = project.getConvention().getPlugin(JavaPluginConvention.class);
            project.getTasks().withType(ScalaCompile.class).configureEach(scalaCompile -> scalaCompile
                    .getScalaCompileOptions()
```

### Deprecation
'getConvention()' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
        this.project = project;
        project.getPluginManager().withPlugin("scala", plugin -> {
            JavaPluginConvention javaConvention = project.getConvention().getPlugin(JavaPluginConvention.class);
            project.getTasks().withType(ScalaCompile.class).configureEach(scalaCompile -> scalaCompile
                    .getScalaCompileOptions()
```

### Deprecation
'org.gradle.api.plugins.JavaPluginConvention' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
        this.project = project;
        project.getPluginManager().withPlugin("scala", plugin -> {
            JavaPluginConvention javaConvention = project.getConvention().getPlugin(JavaPluginConvention.class);
            project.getTasks().withType(ScalaCompile.class).configureEach(scalaCompile -> scalaCompile
                    .getScalaCompileOptions()
```

### Deprecation
'org.gradle.api.tasks.ScalaSourceSet' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
    private void configureIdeaPlugin(IdeaModel ideaModel, SourceSet mainSourceSet) {
        Convention scalaConvention = (Convention) InvokerHelper.getProperty(mainSourceSet, "convention");
        ScalaSourceSet scalaSourceSet = scalaConvention.getPlugin(ScalaSourceSet.class);
        // If scala source directory doesn't contain java files use "JavaThenScala" compilation mode
        String compilerMode = scalaSourceSet
```

### Deprecation
'org.gradle.api.tasks.ScalaSourceSet' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
    private void configureIdeaPlugin(IdeaModel ideaModel, SourceSet mainSourceSet) {
        Convention scalaConvention = (Convention) InvokerHelper.getProperty(mainSourceSet, "convention");
        ScalaSourceSet scalaSourceSet = scalaConvention.getPlugin(ScalaSourceSet.class);
        // If scala source directory doesn't contain java files use "JavaThenScala" compilation mode
        String compilerMode = scalaSourceSet
```

### Deprecation
'getAt(groovy.xml.QName)' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
            String targetJvmVersion = "-target:" + SCALA_TARGET_VERSION;
            Node rootNode = xmlProvider.asNode();
            Node scalaCompilerConf = (Node) rootNode.getAt(new QName("component")).stream()
                    .filter(o -> ((Node) o).attributes().get("name").equals("ScalaCompilerConfiguration"))
                    .findFirst()
```

### Deprecation
'groovy.xml.QName' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
            String targetJvmVersion = "-target:" + SCALA_TARGET_VERSION;
            Node rootNode = xmlProvider.asNode();
            Node scalaCompilerConf = (Node) rootNode.getAt(new QName("component")).stream()
                    .filter(o -> ((Node) o).attributes().get("name").equals("ScalaCompilerConfiguration"))
                    .findFirst()
```

### Deprecation
'getAt(groovy.xml.QName)' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
                            rootNode.appendNode("component", ImmutableMap.of("name", "ScalaCompilerConfiguration")));
            // configure scala compilation order
            Node compilerOrder = (Node) scalaCompilerConf.getAt(new QName("option")).stream()
                    .filter(o -> ((Node) o).attributes().get("name").equals("compileOrder"))
                    .findFirst()
```

### Deprecation
'groovy.xml.QName' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
                            rootNode.appendNode("component", ImmutableMap.of("name", "ScalaCompilerConfiguration")));
            // configure scala compilation order
            Node compilerOrder = (Node) scalaCompilerConf.getAt(new QName("option")).stream()
                    .filter(o -> ((Node) o).attributes().get("name").equals("compileOrder"))
                    .findFirst()
```

### Deprecation
'getAt(groovy.xml.QName)' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
            compilerOrder.attributes().put("name", "compileOrder");
            compilerOrder.attributes().put("value", compilerMode);
            Node parametersNode = (Node) scalaCompilerConf.getAt(new QName("parameters")).stream()
                    .findFirst()
                    .orElseGet(() -> scalaCompilerConf.appendNode("parameters"));
```

### Deprecation
'groovy.xml.QName' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
            compilerOrder.attributes().put("name", "compileOrder");
            compilerOrder.attributes().put("value", compilerMode);
            Node parametersNode = (Node) scalaCompilerConf.getAt(new QName("parameters")).stream()
                    .findFirst()
                    .orElseGet(() -> scalaCompilerConf.appendNode("parameters"));
```

### Deprecation
'getAt(groovy.xml.QName)' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
                    .findFirst()
                    .orElseGet(() -> scalaCompilerConf.appendNode("parameters"));
            Node parameter = (Node) parametersNode.getAt(new QName("parameter")).stream()
                    .filter(o -> ((Node) o).attributes().get("value").equals(targetJvmVersion))
                    .findFirst()
```

### Deprecation
'groovy.xml.QName' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineScala.java`
#### Snippet
```java
                    .findFirst()
                    .orElseGet(() -> scalaCompilerConf.appendNode("parameters"));
            Node parameter = (Node) parametersNode.getAt(new QName("parameter")).stream()
                    .filter(o -> ((Node) o).attributes().get("value").equals(targetJvmVersion))
                    .findFirst()
```

### Deprecation
'getConvention()' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineErrorProne.java`
#### Snippet
```java

            Optional<SourceSet> maybeSourceSet = project
                    .getConvention()
                    .getPlugin(JavaPluginConvention.class)
                    .getSourceSets()
```

### Deprecation
'org.gradle.api.plugins.JavaPluginConvention' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineErrorProne.java`
#### Snippet
```java
            Optional<SourceSet> maybeSourceSet = project
                    .getConvention()
                    .getPlugin(JavaPluginConvention.class)
                    .getSourceSets()
                    .matching(ss -> javaCompile.getName().equals(ss.getCompileJavaTaskName()))
```

### Deprecation
'getConvention()' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineExactDependencies.java`
#### Snippet
```java
                    project.getTasks().register("checkImplicitDependencies", CheckImplicitDependenciesParentTask.class);

            project.getConvention()
                    .getPlugin(JavaPluginConvention.class)
                    .getSourceSets()
```

### Deprecation
'org.gradle.api.plugins.JavaPluginConvention' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineExactDependencies.java`
#### Snippet
```java

            project.getConvention()
                    .getPlugin(JavaPluginConvention.class)
                    .getSourceSets()
                    .all(sourceSet ->
```

### Deprecation
'org.gradle.util.GUtil' is deprecated
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineExactDependencies.java`
#### Snippet
```java
        String baseName = sourceSet.getName().equals(SourceSet.MAIN_SOURCE_SET_NAME)
                ? ""
                : GUtil.toCamelCase(sourceSet.getName());
        return StringUtils.uncapitalize(baseName + StringUtils.capitalize("compile"));
    }
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'List.indexOf()'
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
            Symbol varSymbol, Symbol.MethodSymbol methodSymbol, List<TreePath> usagePaths, VisitorState state) {
        boolean isPrivateMethod = methodSymbol.getModifiers().contains(Modifier.PRIVATE);
        int index = methodSymbol.params.indexOf(varSymbol);
        Preconditions.checkState(index != -1, "symbol %s must be a parameter to the owning method", varSymbol);
        SuggestedFix.Builder fix = SuggestedFix.builder();
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/Baseline.java`
#### Snippet
```java

    @Override
    public void apply(Project project) {
        if (GradleVersion.current().compareTo(MIN_GRADLE_VERSION) < 0) {
            throw new GradleException(String.format(
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineNullAway.java`
#### Snippet
```java
                project.getTasks().withType(JavaCompile.class).configureEach(new Action<JavaCompile>() {
                    @Override
                    public void execute(JavaCompile javaCompile) {
                        ((ExtensionAware) javaCompile.getOptions())
                                .getExtensions()
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineNullAway.java`
#### Snippet
```java
        configureErrorProneOptions(project, new Action<ErrorProneOptions>() {
            @Override
            public void execute(ErrorProneOptions options) {
                options.option("NullAway:AnnotatedPackages", String.join(",", DEFAULT_ANNOTATED_PACKAGES));
                // Relax some checks for test code
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineNullAway.java`
#### Snippet
```java
        proj.afterEvaluate(new Action<Project>() {
            @Override
            public void execute(Project project) {
                project.getTasks().withType(JavaCompile.class).configureEach(new Action<JavaCompile>() {
                    @Override
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineNullAway.java`
#### Snippet
```java
                .configureEach(new Action<Configuration>() {
                    @Override
                    public void execute(Configuration _files) {
                        project.getDependencies()
                                .add("errorprone", "com.palantir.baseline:baseline-null-away:" + version);
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineConfig.java`
#### Snippet
```java

        @Override
        public void execute(Task task) {
            if (configuration.getFiles().size() != 1) {
                throw new IllegalArgumentException("Expected to find exactly one config dependency in the "
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaCompiler.java`
#### Snippet
```java

    @Override
    public JavaInstallationMetadata getMetadata() {
        return javaInstallationMetadata;
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaCompiler.java`
#### Snippet
```java

    @Override
    public RegularFile getExecutablePath() {
        return JavaInstallationMetadataUtils.findExecutable(javaInstallationMetadata, "javac");
    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/LazyFormatterStep.java`
#### Snippet
```java
    @Nullable
    @Override
    public String format(String rawUnix, File file) throws Exception {
        return delegate.get().format(rawUnix, file);
    }
```

### NullableProblems
Not annotated parameter overrides @ParametersAreNonnullByDefault parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/LazyFormatterStep.java`
#### Snippet
```java
    @Nullable
    @Override
    public String format(String rawUnix, File file) throws Exception {
        return delegate.get().format(rawUnix, file);
    }
```

### NullableProblems
Not annotated method overrides method annotated with @ReturnValuesAreNonnullByDefault
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/LazyFormatterStep.java`
#### Snippet
```java

    @Override
    public String getName() {
        return name;
    }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineCircleCi.java`
#### Snippet
```java

    @Override
    public void apply(Project project) {
        configurePluginsForReports(project);
        configurePluginsForArtifacts(project);
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaLauncher.java`
#### Snippet
```java

    @Override
    public RegularFile getExecutablePath() {
        return JavaInstallationMetadataUtils.findExecutable(javaInstallationMetadata, "java");
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaLauncher.java`
#### Snippet
```java

    @Override
    public JavaInstallationMetadata getMetadata() {
        return javaInstallationMetadata;
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavadocTool.java`
#### Snippet
```java

    @Override
    public RegularFile getExecutablePath() {
        return JavaInstallationMetadataUtils.findExecutable(javaInstallationMetadata, "javadoc");
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavadocTool.java`
#### Snippet
```java

    @Override
    public JavaInstallationMetadata getMetadata() {
        return javaInstallationMetadata;
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/JavaInstallationMetadataWrapper.java`
#### Snippet
```java

    @Override
    public Directory getInstallationPath() {
        return delegate.get().getInstallationPath();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/JavaInstallationMetadataWrapper.java`
#### Snippet
```java

    @Override
    public String getJvmVersion() {
        return delegate.get().getJvmVersion();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/JavaInstallationMetadataWrapper.java`
#### Snippet
```java

    @Override
    public String getJavaRuntimeVersion() {
        return delegate.get().getJavaRuntimeVersion();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/JavaInstallationMetadataWrapper.java`
#### Snippet
```java

    @Override
    public String getVendor() {
        return delegate.get().getVendor();
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullApi
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/JavaInstallationMetadataWrapper.java`
#### Snippet
```java

    @Override
    public JavaLanguageVersion getLanguageVersion() {
        return javaLanguageVersion;
    }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersions.java`
#### Snippet
```java

    @Override
    public void apply(Project project) {
        if (!Objects.equals(project, project.getRootProject())) {
            throw new GradleException("BaselineJavaVersions may only be applied to the root project");
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineModuleJvmArgs.java`
#### Snippet
```java
            project.getTasks().withType(Jar.class).configureEach(new Action<Jar>() {
                @Override
                public void execute(Jar jar) {
                    jar.doFirst(new Action<Task>() {
                        @Override
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineModuleJvmArgs.java`
#### Snippet
```java
                    jar.doFirst(new Action<Task>() {
                        @Override
                        public void execute(Task task) {
                            jar.manifest(new Action<Manifest>() {
                                @Override
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineModuleJvmArgs.java`
#### Snippet
```java

                @Override
                public void execute(Test test) {
                    test.getJvmArgumentProviders().add(new CommandLineArgumentProvider() {

```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineModuleJvmArgs.java`
#### Snippet
```java
                            jar.manifest(new Action<Manifest>() {
                                @Override
                                public void execute(Manifest manifest) {
                                    addManifestAttribute(jar, manifest, ADD_EXPORTS_ATTRIBUTE, extension.exports());
                                    addManifestAttribute(jar, manifest, ADD_OPENS_ATTRIBUTE, extension.opens());
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineModuleJvmArgs.java`
#### Snippet
```java

                @Override
                public void execute(JavaExec javaExec) {
                    javaExec.getJvmArgumentProviders().add(new CommandLineArgumentProvider() {

```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineModuleJvmArgs.java`
#### Snippet
```java
                        javadocTask.doFirst(new Action<Task>() {
                            @Override
                            public void execute(Task task) {
                                // The '--release' flag is set when BaselineJavaVersion is not used.
                                if (!project.getPlugins().hasPlugin(BaselineJavaVersion.class)) {
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java
        project.getTasks().withType(JavaCompile.class).configureEach(new Action<JavaCompile>() {
            @Override
            public void execute(JavaCompile javaCompileTask) {
                javaCompileTask.getJavaCompiler().set(javaToolchain.flatMap(BaselineJavaToolchain::javaCompiler));
                javaCompileTask
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java
        project.getTasks().withType(ScalaCompile.class).configureEach(new Action<ScalaCompile>() {
            @Override
            public void execute(ScalaCompile scalaCompileTask) {
                scalaCompileTask.getJavaLauncher().set(javaToolchain.flatMap(BaselineJavaToolchain::javaLauncher));
                scalaCompileTask
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java
                    .register("checkJavaVersions", CheckJavaVersionsTask.class, new Action<CheckJavaVersionsTask>() {
                        @Override
                        public void execute(CheckJavaVersionsTask task) {
                            task.getTargetVersion().set(extension.target());
                            task.getRuntimeVersion().set(extension.runtime());
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java
        project.getTasks().withType(GroovyCompile.class).configureEach(new Action<GroovyCompile>() {
            @Override
            public void execute(GroovyCompile groovyCompileTask) {
                groovyCompileTask.getJavaLauncher().set(javaToolchain.flatMap(BaselineJavaToolchain::javaLauncher));
                groovyCompileTask
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java
                javaCompileTask.doFirst(new Action<Task>() {
                    @Override
                    public void execute(Task task) {
                        ((JavaCompile) task)
                                .setSourceCompatibility(
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java
                scalaCompileTask.doFirst(new Action<Task>() {
                    @Override
                    public void execute(Task task) {
                        ((ScalaCompile) task)
                                .setSourceCompatibility(
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java
            project.getTasks().withType(Checkstyle.class).configureEach(new Action<Checkstyle>() {
                @Override
                public void execute(Checkstyle checkstyle) {
                    checkstyle.getJavaLauncher().set(javaToolchain.flatMap(BaselineJavaToolchain::javaLauncher));
                }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java
            javaPluginExtension.toolchain(new Action<JavaToolchainSpec>() {
                @Override
                public void execute(JavaToolchainSpec javaToolchainSpec) {
                    javaToolchainSpec
                            .getLanguageVersion()
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java
                javadocTask.doFirst(new Action<Task>() {
                    @Override
                    public void execute(Task task) {
                        CoreJavadocOptions options = (CoreJavadocOptions) ((Javadoc) task).getOptions();
                        if (target.get().enablePreview()) {
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java
        project.getTasks().withType(JavaExec.class).configureEach(new Action<JavaExec>() {
            @Override
            public void execute(JavaExec javaExec) {
                javaExec.getJavaLauncher().set(javaToolchain.flatMap(BaselineJavaToolchain::javaLauncher));
                javaExec.getJvmArgumentProviders().add(new EnablePreviewArgumentProvider(runtime));
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java
        project.getTasks().withType(Javadoc.class).configureEach(new Action<Javadoc>() {
            @Override
            public void execute(Javadoc javadocTask) {
                javadocTask.getJavadocTool().set(javaToolchain.flatMap(BaselineJavaToolchain::javadocTool));

```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java
                groovyCompileTask.doFirst(new Action<Task>() {
                    @Override
                    public void execute(Task task) {
                        ((GroovyCompile) task)
                                .setSourceCompatibility(
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java
        project.getTasks().withType(Test.class).configureEach(new Action<Test>() {
            @Override
            public void execute(Test test) {
                test.getJavaLauncher().set(javaToolchain.flatMap(BaselineJavaToolchain::javaLauncher));
                test.getJvmArgumentProviders().add(new EnablePreviewArgumentProvider(runtime));
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java
        project.getTasks().withType(ScalaDoc.class).configureEach(new Action<ScalaDoc>() {
            @Override
            public void execute(ScalaDoc scalaDoc) {
                scalaDoc.getJavaLauncher().set(javaToolchain.flatMap(BaselineJavaToolchain::javaLauncher));
            }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-junit-reports/src/main/java/com/palantir/gradle/junit/BuildFinishedAction.java`
#### Snippet
```java
    @Override
    @SuppressWarnings("StrictUnusedVariable")
    public void execute(BuildResult result) {
        Report report = new Report.Builder()
                .name("gradle")
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-junit-reports/src/main/java/com/palantir/gradle/junit/BuildFailureListener.java`
#### Snippet
```java

    @Override
    public void beforeExecute(Task _task) {}

    @Override
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-junit-reports/src/main/java/com/palantir/gradle/junit/BuildFailureListener.java`
#### Snippet
```java

    @Override
    public synchronized void afterExecute(Task task, TaskState state) {
        if (!isTracked.test(task)) {
            Report.TestCase.Builder testCase =
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-junit-reports/src/main/java/com/palantir/gradle/junit/BuildFailureListener.java`
#### Snippet
```java

    @Override
    public synchronized void afterExecute(Task task, TaskState state) {
        if (!isTracked.test(task)) {
            Report.TestCase.Builder testCase =
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-junit-reports/src/main/java/com/palantir/gradle/junit/XmlReportFailuresSupplier.java`
#### Snippet
```java
        task.getProject().afterEvaluate(new Action<Project>() {
            @Override
            public void execute(Project _project) {
                reportHandler.configureTask(task);
            }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-junit-reports/src/main/java/com/palantir/gradle/junit/DefaultTaskTimer.java`
#### Snippet
```java

    @Override
    public void beforeExecute(Task task) {
        if (isTrackedTask.test(task)) {
            taskTimers.put(task, new Timer());
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-junit-reports/src/main/java/com/palantir/gradle/junit/DefaultTaskTimer.java`
#### Snippet
```java

    @Override
    public void afterExecute(Task task, TaskState _taskState) {
        Optional.ofNullable(taskTimers.get(task)).ifPresent(Timer::stop);
    }
```

### NullableProblems
Not annotated parameter overrides @NonNullApi parameter
in `gradle-junit-reports/src/main/java/com/palantir/gradle/junit/DefaultTaskTimer.java`
#### Snippet
```java

    @Override
    public void afterExecute(Task task, TaskState _taskState) {
        Optional.ofNullable(taskTimers.get(task)).ifPresent(Timer::stop);
    }
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineClassUniquenessPlugin.java`
#### Snippet
```java

/**
 * This plugin is similar to https://github.com/nebula-plugins/gradle-lint-plugin/wiki/Duplicate-Classes-Rule but goes
 * one step further and actually hashes any identically named classfiles to figure out if they're <i>completely</i>
 * identical (and therefore safely interchangeable).
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `toolchainSpec == null` is always `false`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckExplicitSourceCompatibilityTask.java`
#### Snippet
```java
                if (maybeExtension != null) {
                    JavaToolchainSpec toolchainSpec = maybeExtension.getToolchain();
                    return toolchainSpec == null
                            || !toolchainSpec.getLanguageVersion().isPresent();
                }
```

### ConstantValue
Condition `rule.getGroup() != null` is always `true`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineExactDependencies.java`
#### Snippet
```java
        // Both 'ExcludeRule#getGroup' and 'ExcludeRule#getModule' can return null.
        Builder<String, String> excludeRule = ImmutableMap.builder();
        if (rule.getGroup() != null) {
            excludeRule.put("group", rule.getGroup());
        }
```

### ConstantValue
Condition `rule.getModule() != null` is always `true`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineExactDependencies.java`
#### Snippet
```java
            excludeRule.put("group", rule.getGroup());
        }
        if (rule.getModule() != null) {
            excludeRule.put("module", rule.getModule());
        }
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/ZeroWarmupRateLimiter.java`
#### Snippet
```java
    private static final Matcher<MethodInvocationTree> INT_LITERAL_ZERO_MATCHER = Matchers.allOf(
            MethodMatchers.staticMethod()
                    .onClass(RateLimiter.class.getName())
                    .named("create")
                    .withParameters("double", "long", TimeUnit.class.getName()),
```

### UnstableApiUsage
'com.google.common.util.concurrent.RateLimiter' is marked unstable with @Beta
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/ZeroWarmupRateLimiter.java`
#### Snippet
```java
    private static final Matcher<ExpressionTree> DURATION_ZERO_MATCHER = Matchers.methodInvocation(
            MethodMatchers.staticMethod()
                    .onClass(RateLimiter.class.getName())
                    .named("create")
                    .withParameters("double", Duration.class.getName()),
```

### UnstableApiUsage
'stream(java.util.Optional)' is marked unstable with @Beta
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/ImmutablesBuilderMissingInitialization.java`
#### Snippet
```java
        return Streams.stream(builderClass.members().getSymbols())
                .map(filterByType(MethodSymbol.class))
                .flatMap(Streams::stream)
                .filter(symbol -> !symbol.isStaticOrInstanceInit()
                        && !symbol.isConstructor()
```

### UnstableApiUsage
'stream(java.util.Optional)' is marked unstable with @Beta
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/ImmutablesBuilderMissingInitialization.java`
#### Snippet
```java
                .map(type -> type.tsym)
                .map(filterByType(ClassSymbol.class))
                .flatMap(Streams::stream)
                .filter(classSymbol ->
                        ASTHelpers.hasAnnotation(classSymbol, "org.immutables.value.Value.Immutable", state))
```

### UnstableApiUsage
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/MoreASTHelpers.java`
#### Snippet
```java
        ImmutableList<Type> types =
                input.stream().map(type -> broadenAnonymousType(type, state)).collect(ImmutableList.toImmutableList());
        ImmutableList.Builder<Type> deduplicatedBuilder = ImmutableList.builderWithExpectedSize(types.size());
        for (int i = 0; i < types.size(); i++) {
            Type current = types.get(i);
```

### UnstableApiUsage
'splitToStream(java.lang.CharSequence)' is marked unstable with @Beta
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/util/VersionUtils.java`
#### Snippet
```java
    public static int majorVersionNumber(String version) {
        return Integer.parseInt(Splitter.on('.')
                .splitToStream(version)
                .findFirst()
                .orElseThrow(() -> new GradleException("Cannot find major version number for version " + version)));
```

### UnstableApiUsage
'stream(java.util.Iterator)' is marked unstable with @Beta
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckUnusedDependenciesTask.java`
#### Snippet
```java
        excludeSourceOnlyDependencies();

        Set<ResolvedArtifact> necessaryArtifacts = Streams.stream(
                        sourceClasses.get().iterator())
                .flatMap(BaselineExactDependencies::referencedClasses)
```

### UnstableApiUsage
'stream(java.util.Iterator)' is marked unstable with @Beta
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckUnusedDependenciesTask.java`
#### Snippet
```java
    /** All classes which are mentioned in this project's source code. */
    private Set<String> referencedClasses() {
        return Streams.stream(sourceClasses.get().iterator())
                .flatMap(BaselineExactDependencies::referencedClasses)
                .collect(Collectors.toSet());
```

### UnstableApiUsage
'stream(java.util.Iterator)' is marked unstable with @Beta
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckImplicitDependenciesTask.java`
#### Snippet
```java
    /** All classes which are mentioned in this project's source code. */
    private Set<String> referencedClasses() {
        return Streams.stream(sourceClasses.get().iterator())
                .flatMap(BaselineExactDependencies::referencedClasses)
                .collect(Collectors.toSet());
```

### UnstableApiUsage
'stream(java.util.Optional)' is marked unstable with @Beta
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckImplicitDependenciesTask.java`
#### Snippet
```java
                // Select a single deterministic artifact for the suggestion
                .map(artifacts -> artifacts.stream().min(ARTIFACT_COMPARATOR))
                .flatMap(Streams::stream)
                .sorted(ARTIFACT_COMPARATOR)
                .collect(Collectors.toList());
```

### UnstableApiUsage
'getJvmArgumentProviders()' is declared in unstable class 'org.gradle.api.tasks.compile.ProviderAwareCompilerDaemonForkOptions' marked with @Incubating
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineImmutables.java`
#### Snippet
```java
                                    .getOptions()
                                    .getForkOptions()
                                    .getJvmArgumentProviders()
                                    .add(new CommandLineArgumentProvider() {
                                        @Override
```

### UnstableApiUsage
Overridden method 'getJvmVersion()' is marked unstable with @Incubating
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/JavaInstallationMetadataWrapper.java`
#### Snippet
```java

    @Override
    public String getJvmVersion() {
        return delegate.get().getJvmVersion();
    }
```

### UnstableApiUsage
'getJvmVersion()' is marked unstable with @Incubating
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/JavaInstallationMetadataWrapper.java`
#### Snippet
```java
    @Override
    public String getJvmVersion() {
        return delegate.get().getJvmVersion();
    }

```

### UnstableApiUsage
Overridden method 'getJavaRuntimeVersion()' is marked unstable with @Incubating
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/JavaInstallationMetadataWrapper.java`
#### Snippet
```java

    @Override
    public String getJavaRuntimeVersion() {
        return delegate.get().getJavaRuntimeVersion();
    }
```

### UnstableApiUsage
'getJavaRuntimeVersion()' is marked unstable with @Incubating
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/JavaInstallationMetadataWrapper.java`
#### Snippet
```java
    @Override
    public String getJavaRuntimeVersion() {
        return delegate.get().getJavaRuntimeVersion();
    }

```

### UnstableApiUsage
'com.google.common.hash.HashingInputStream' is marked unstable with @Beta
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/services/JarClassHasher.java`
#### Snippet
```java

                    String className = entry.getName().replaceAll("/", ".").replaceAll("\\.class$", "");
                    HashingInputStream inputStream = new HashingInputStream(Hashing.sha256(), jarInputStream);
                    ByteStreams.exhaust(inputStream);

```

### UnstableApiUsage
'HashingInputStream(com.google.common.hash.HashFunction, java.io.InputStream)' is declared in unstable class 'com.google.common.hash.HashingInputStream' marked with @Beta
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/services/JarClassHasher.java`
#### Snippet
```java

                    String className = entry.getName().replaceAll("/", ".").replaceAll("\\.class$", "");
                    HashingInputStream inputStream = new HashingInputStream(Hashing.sha256(), jarInputStream);
                    ByteStreams.exhaust(inputStream);

```

### UnstableApiUsage
'com.google.common.hash.HashingInputStream' is marked unstable with @Beta
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/services/JarClassHasher.java`
#### Snippet
```java

                    String className = entry.getName().replaceAll("/", ".").replaceAll("\\.class$", "");
                    HashingInputStream inputStream = new HashingInputStream(Hashing.sha256(), jarInputStream);
                    ByteStreams.exhaust(inputStream);

```

### UnstableApiUsage
'exhaust(java.io.InputStream)' is marked unstable with @Beta
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/services/JarClassHasher.java`
#### Snippet
```java
                    String className = entry.getName().replaceAll("/", ".").replaceAll("\\.class$", "");
                    HashingInputStream inputStream = new HashingInputStream(Hashing.sha256(), jarInputStream);
                    ByteStreams.exhaust(inputStream);

                    hashesByClassName.put(className, inputStream.hash());
```

### UnstableApiUsage
'hash()' is declared in unstable class 'com.google.common.hash.HashingInputStream' marked with @Beta
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/services/JarClassHasher.java`
#### Snippet
```java
                    ByteStreams.exhaust(inputStream);

                    hashesByClassName.put(className, inputStream.hash());
                }
            } catch (IOException e) {
```

### UnstableApiUsage
'isConfigureOnDemand()' is marked unstable with @Incubating
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineExactDependencies.java`
#### Snippet
```java
                .beforeResolve(ir -> Preconditions.checkState(
                        projectsEvaluated.get()
                                || (project.getGradle().getStartParameter().isConfigureOnDemand()
                                        && project.getState().getExecuted()),
                        "Tried to resolve %s too early.",
```

### UnstableApiUsage
'getJavaLauncher()' is marked unstable with @Incubating
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java
            @Override
            public void execute(ScalaCompile scalaCompileTask) {
                scalaCompileTask.getJavaLauncher().set(javaToolchain.flatMap(BaselineJavaToolchain::javaLauncher));
                scalaCompileTask
                        .getOptions()
```

### UnstableApiUsage
'getJavaLauncher()' is marked unstable with @Incubating
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java
                @Override
                public void execute(Checkstyle checkstyle) {
                    checkstyle.getJavaLauncher().set(javaToolchain.flatMap(BaselineJavaToolchain::javaLauncher));
                }
            });
```

### UnstableApiUsage
'getJavaLauncher()' is marked unstable with @Incubating
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java
            @Override
            public void execute(ScalaDoc scalaDoc) {
                scalaDoc.getJavaLauncher().set(javaToolchain.flatMap(BaselineJavaToolchain::javaLauncher));
            }
        });
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/XmlUtils.java`
#### Snippet
```java
        configure.accept(rootNode);

        configurationFile.getParentFile().mkdirs();

        try (BufferedWriter writer = Files.newWriter(configurationFile, StandardCharsets.UTF_8);
```

### IgnoreResultOfCall
Result of `File.renameTo()` is ignored
in `gradle-junit-reports/src/main/java/com/palantir/gradle/junit/XmlReportFailuresSupplier.java`
#### Snippet
```java
                                rawReport.getOutputLocation().getAsFile().getOrNull())
                        .orElseThrow(() -> new IllegalStateException("Could not get raw report file: " + rawReport));
                rawReportFile.renameTo(
                        rawReportsDir.resolve(rawReportFile.getName()).toFile());
            }
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
            }
            // Otherwise it's assigned if the VariableTree has an initializer.
            if (unusedElements.containsKey(symbol) && tree.getInitializer() != null) {
                return true;
            }
```

