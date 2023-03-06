# gradle-baseline 
 
# Bad smells
I found 212 bad smells with 30 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 56 | false |
| CodeBlock2Expr | 28 | true |
| UnstableApiUsage | 27 | false |
| UnnecessaryFullyQualifiedName | 20 | false |
| DataFlowIssue | 14 | false |
| SimplifyOptionalCallChains | 10 | false |
| ReturnNull | 10 | false |
| OptionalContainsCollection | 6 | false |
| OptionalUsedAsFieldOrParameterType | 5 | false |
| DynamicRegexReplaceableByCompiledPattern | 5 | false |
| RedundantFieldInitialization | 5 | false |
| CastToIncompatibleInterface | 3 | false |
| ConstantValue | 3 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| AbstractClassNeverImplemented | 2 | false |
| IgnoreResultOfCall | 2 | false |
| FunctionalExpressionCanBeFolded | 2 | false |
| CastConflictsWithInstanceof | 2 | false |
| UnnecessarySemicolon | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| Convert2MethodRef | 1 | false |
| JavaReflectionMemberAccess | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| RegExpSimplifiable | 1 | false |
| ReadWriteStringCanBeUsed | 1 | false |
| RedundantSuppression | 1 | false |
| NestedAssignment | 1 | false |
| NonExceptionNameEndsWithException | 1 | false |
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
Unboxing of `VALIDATE_METHODS_MESSAGE_ARGS.get(methodName)` may produce `NullPointerException`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/ValidateConstantMessage.java`
#### Snippet
```java
        }

        int messageArgNumber = VALIDATE_METHODS_MESSAGE_ARGS.get(methodName);
        List<? extends ExpressionTree> args = tree.getArguments();

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
Method invocation `addAll` may produce `NullPointerException`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CompileRefasterTask.java`
#### Snippet
```java
                .setCompilerArgs(ImmutableList.of("-Xplugin:BaselineRefasterCompiler --out "
                        + refasterRulesFile.get().getAbsolutePath()));
        getOptions().getForkOptions().getJvmArgs().addAll(REFASTER_EXPORTS);

        // Extract Java sources
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

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'min()'
in `baseline-refaster-rules/src/main/java/com/palantir/baseline/refaster/SortedFirst.java`
#### Snippet
```java
    @BeforeTemplate
    Optional<T> before(Stream<T> stream, Comparator<? super T> comparator) {
        return stream.sorted(comparator).findFirst();
    }

```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `List`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StringBuilderConstantParameters.java`
#### Snippet
```java
     */
    private static final class StringBuilderVisitor
            extends SimpleTreeVisitor<Optional<List<ExpressionTree>>, VisitorState> {
        private static final StringBuilderVisitor INSTANCE = new StringBuilderVisitor();

```

### OptionalContainsCollection
'Optional' contains collection `List`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StringBuilderConstantParameters.java`
#### Snippet
```java

        @Override
        public Optional<List<ExpressionTree>> visitMemberSelect(MemberSelectTree node, VisitorState state) {
            if (node.getIdentifier().contentEquals("append")
                    || node.getIdentifier().contentEquals("toString")) {
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StringBuilderConstantParameters.java`
#### Snippet
```java
            return Description.NO_MATCH;
        }
        Optional<List<ExpressionTree>> result = tree.getMethodSelect().accept(StringBuilderVisitor.INSTANCE, state);
        if (!result.isPresent()) {
            return Description.NO_MATCH;
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StringBuilderConstantParameters.java`
#### Snippet
```java

        @Override
        public Optional<List<ExpressionTree>> visitMethodInvocation(MethodInvocationTree node, VisitorState state) {
            Optional<List<ExpressionTree>> result = node.getMethodSelect().accept(this, state);
            if (result.isPresent()) {
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StringBuilderConstantParameters.java`
#### Snippet
```java
        @Override
        public Optional<List<ExpressionTree>> visitMethodInvocation(MethodInvocationTree node, VisitorState state) {
            Optional<List<ExpressionTree>> result = node.getMethodSelect().accept(this, state);
            if (result.isPresent()) {
                Preconditions.checkState(node.getArguments().size() == 1, "Expected a single argument to 'append'");
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StringBuilderConstantParameters.java`
#### Snippet
```java

        @Override
        public Optional<List<ExpressionTree>> visitNewClass(NewClassTree node, VisitorState state) {
            if (!STRING_BUILDER_TYPE_MATCHER.matches(node.getIdentifier(), state)) {
                return defaultAction(node, state);
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckImplicitDependenciesTask.java`
#### Snippet
```java
        if (!usedButUndeclared.isEmpty()) {
            String suggestion = usedButUndeclared.stream()
                    .map(artifact -> getSuggestionString(artifact))
                    .sorted()
                    .collect(Collectors.joining("\n", "    dependencies {\n", "\n    }"));
```

## RuleId[id=JavaReflectionMemberAccess]
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

## RuleId[id=CastToIncompatibleInterface]
### CastToIncompatibleInterface
Cast to incompatible interface `ExtensionAware`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineNullAway.java`
#### Snippet
```java
                    @Override
                    public void execute(JavaCompile javaCompile) {
                        ((ExtensionAware) javaCompile.getOptions())
                                .getExtensions()
                                .configure(ErrorProneOptions.class, action);
```

### CastToIncompatibleInterface
Cast to incompatible interface `ExtensionAware`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineErrorProne.java`
#### Snippet
```java

        project.getTasks().withType(JavaCompile.class).configureEach(javaCompile -> {
            ((ExtensionAware) javaCompile.getOptions())
                    .getExtensions()
                    .configure(ErrorProneOptions.class, errorProneOptions -> {
```

### CastToIncompatibleInterface
Cast to incompatible interface `ExtensionAware`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineErrorProne.java`
#### Snippet
```java

        project.getPluginManager().withPlugin("java-gradle-plugin", appliedPlugin -> {
            project.getTasks().withType(JavaCompile.class).configureEach(javaCompile -> ((ExtensionAware)
                            javaCompile.getOptions())
                    .getExtensions()
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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`getDifferingSharedClassesInProblemJars(jars).size() > 0` can be replaced with '!getDifferingSharedClassesInProblemJars(jars).isEmpty()'
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/ClassUniquenessAnalyzer.java`
#### Snippet
```java
    public Collection<Set<ModuleVersionIdentifier>> getDifferingProblemJars() {
        return getProblemJars().stream()
                .filter(jars -> getDifferingSharedClassesInProblemJars(jars).size() > 0)
                .collect(Collectors.toSet());
    }
```

### SizeReplaceableByIsEmpty
`collection.size() == 0` can be replaced with 'collection.isEmpty()'
in `baseline-refaster-rules/src/main/java/com/palantir/baseline/refaster/CollectionsIsEmpty.java`
#### Snippet
```java
    @BeforeTemplate
    boolean sizeEqualsZero(Collection<T> collection) {
        return collection.size() == 0;
    }

```

## RuleId[id=ReadWriteStringCanBeUsed]
### ReadWriteStringCanBeUsed
Can be replaced with 'Files.readString()'
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineFormat.java`
#### Snippet
```java
    private static String computeCopyrightComment(Path copyrightFile) {
        try {
            return new String(Files.readAllBytes(copyrightFile), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("Couldn't read copyright file " + copyrightFile, e);
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `JarClassHasher` has no concrete subclass
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/services/JarClassHasher.java`
#### Snippet
```java
import org.slf4j.Logger;

public abstract class JarClassHasher implements BuildService<BuildServiceParameters.None>, AutoCloseable {
    private final Cache<ModuleVersionIdentifier, Result> cache =
            Caffeine.newBuilder().build();
```

### AbstractClassNeverImplemented
Abstract class `JunitReportsFinalizer` has no concrete subclass
in `gradle-junit-reports/src/main/java/com/palantir/gradle/junit/JunitReportsFinalizer.java`
#### Snippet
```java
import org.w3c.dom.Document;

public abstract class JunitReportsFinalizer extends DefaultTask {

    public static void registerFinalizer(
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends MethodSymbol`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/CompileTimeConstantViolatesLiskovSubstitution.java`
#### Snippet
```java

    private boolean anySuperMethodsMissingParameterAnnotation(
            Set<MethodSymbol> superMethods, int parameterIndex, VisitorState state) {
        for (MethodSymbol superMethod : superMethods) {
            VarSymbol parameter = superMethod.getParameters().get(parameterIndex);
```

### BoundedWildcard
Can generalize to `? extends MethodSymbol`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/CompileTimeConstantViolatesLiskovSubstitution.java`
#### Snippet
```java

    private boolean anySuperMethodsHaveParameterAnnotation(
            Set<MethodSymbol> superMethods, int parameterIndex, VisitorState state) {
        for (MethodSymbol superMethod : superMethods) {
            VarSymbol parameter = superMethod.getParameters().get(parameterIndex);
```

### BoundedWildcard
Can generalize to `? super VariableTree`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/JUnit5RuleUsage.java`
#### Snippet
```java
    }

    static Matcher<ClassTree> hasVariable(Matcher<VariableTree> matcher) {
        return (classTree, state) -> classTree.getMembers().stream()
                .filter(tree -> tree instanceof VariableTree)
```

### BoundedWildcard
Can generalize to `? super ExpressionTree`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/PreconditionsMessageFormat.java`
#### Snippet
```java
    private final Matcher<ExpressionTree> methodMatcher;

    protected PreconditionsMessageFormat(Matcher<ExpressionTree> methodMatcher) {
        this.methodMatcher = methodMatcher;
    }
```

### BoundedWildcard
Can generalize to `? extends Type`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/ThrowSpecificity.java`
#### Snippet
```java
    }

    private static boolean containsBroadException(Collection<Type> exceptions, VisitorState state) {
        return exceptions.stream().anyMatch(type -> isBroadException(type, state));
    }
```

### BoundedWildcard
Can generalize to `? super ClassTree`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/MoreMatchers.java`
#### Snippet
```java
     * which matches the input {@link ClassTree}, not the enclosing class.
     */
    static <T extends ClassTree> Matcher<T> classEnclosingClass(Matcher<ClassTree> matcher) {
        return (Matcher<T>) (classTree, state) -> {
            TreePath currentPath = state.getPath().getParentPath();
```

### BoundedWildcard
Can generalize to `? extends O`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/ImmutablesBuilderMissingInitialization.java`
#### Snippet
```java
     * Returns a function for use in Optional.flatMap that filters by type, and casts to that type.
     */
    private <I, O extends I> Function<I, Optional<O>> filterByType(Class<O> clazz) {
        return value -> {
            if (clazz.isInstance(value)) {
```

### BoundedWildcard
Can generalize to `? extends Type`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/CatchSpecificity.java`
#### Snippet
```java
        private final Name exceptionName;

        ImpossibleConditionScanner(SuggestedFix.Builder fix, List<Type> caughtTypes, Name exceptionName) {
            this.fix = fix;
            this.caughtTypes = caughtTypes;
```

### BoundedWildcard
Can generalize to `? extends Type`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/CatchSpecificity.java`
#### Snippet
```java
    /** Caught types cannot be duplicated because code will not compile. */
    private static List<Type> deduplicateCatchTypes(
            List<Type> proposedReplacements, List<Type> caughtTypes, VisitorState state) {
        List<Type> replacements = new ArrayList<>();
        for (Type replacementType : proposedReplacements) {
```

### BoundedWildcard
Can generalize to `? extends Type`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/CatchSpecificity.java`
#### Snippet
```java
    /** Caught types cannot be duplicated because code will not compile. */
    private static List<Type> deduplicateCatchTypes(
            List<Type> proposedReplacements, List<Type> caughtTypes, VisitorState state) {
        List<Type> replacements = new ArrayList<>();
        for (Type replacementType : proposedReplacements) {
```

### BoundedWildcard
Can generalize to `? extends Type`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/CatchSpecificity.java`
#### Snippet
```java
    }

    private static boolean containsBroadException(Collection<Type> exceptions, VisitorState state) {
        return exceptions.stream().anyMatch(type -> isBroadException(type, state));
    }
```

### BoundedWildcard
Can generalize to `? extends Type`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/MoreASTHelpers.java`
#### Snippet
```java
    /** Removes any type that is a subtype of another type in the set. */
    @SuppressWarnings("ReferenceEquality")
    static ImmutableList<Type> flattenTypesForAssignment(ImmutableList<Type> input, VisitorState state) {
        ImmutableList<Type> types =
                input.stream().map(type -> broadenAnonymousType(type, state)).collect(ImmutableList.toImmutableList());
```

### BoundedWildcard
Can generalize to `? extends ResolvedComponentResult`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckJUnitDependencies.java`
#### Snippet
```java
    }

    private boolean hasDep(Set<ResolvedComponentResult> deps, Predicate<ModuleVersionIdentifier> spec) {
        return deps.stream().anyMatch(component -> spec.test(component.getModuleVersion()));
    }
```

### BoundedWildcard
Can generalize to `? super ModuleVersionIdentifier`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckJUnitDependencies.java`
#### Snippet
```java
    }

    private boolean hasDep(Set<ResolvedComponentResult> deps, Predicate<ModuleVersionIdentifier> spec) {
        return deps.stream().anyMatch(component -> spec.test(component.getModuleVersion()));
    }
```

### BoundedWildcard
Can generalize to `? super String`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckJUnitDependencies.java`
#### Snippet
```java
    }

    private boolean fileContainsSubstring(File file, Predicate<String> substring) {
        try (Stream<String> lines = Files.lines(file.toPath())) {
            return lines.anyMatch(substring);
```

### BoundedWildcard
Can generalize to `? extends Set`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckImplicitDependenciesTask.java`
#### Snippet
```java
    }

    public final void ignore(Provider<Set<String>> value) {
        ignore.set(value);
    }
```

### BoundedWildcard
Can generalize to `? extends Set`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckUnusedDependenciesParentTask.java`
#### Snippet
```java

    /** Ignores these coordinates for all source sets. */
    public final void ignore(Provider<Set<String>> value) {
        ignore.addAll(value);
    }
```

### BoundedWildcard
Can generalize to `? extends Set`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckUnusedDependenciesTask.java`
#### Snippet
```java
    }

    public final void ignore(Provider<Set<String>> value) {
        ignore.addAll(value);
    }
```

### BoundedWildcard
Can generalize to `? extends Set`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckImplicitDependenciesParentTask.java`
#### Snippet
```java

    /** Ignores these coordinates for all source sets. */
    public final void ignore(Provider<Set<String>> value) {
        ignore.addAll(value);
    }
```

### BoundedWildcard
Can generalize to `? extends ModuleVersionIdentifier`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckClassUniquenessLockTask.java`
#### Snippet
```java
    }

    private String clashingJarHeader(Set<ModuleVersionIdentifier> clashingJars) {
        return clashingJars.stream()
                .map(mvi -> mvi.getGroup() + ":" + mvi.getName())
```

### BoundedWildcard
Can generalize to `? super Symbol`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
        private final ImmutableMap<Symbol, TreePath> declarationSites;

        private FilterUsedVariables(Map<Symbol, TreePath> unusedElements, ListMultimap<Symbol, TreePath> usageSites) {
            this.unusedElements = unusedElements;
            this.usageSites = usageSites;
```

### BoundedWildcard
Can generalize to `? super TreePath`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
        private final ImmutableMap<Symbol, TreePath> declarationSites;

        private FilterUsedVariables(Map<Symbol, TreePath> unusedElements, ListMultimap<Symbol, TreePath> usageSites) {
            this.unusedElements = unusedElements;
            this.usageSites = usageSites;
```

### BoundedWildcard
Can generalize to `? super Symbol`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
        private final ImmutableMap<Symbol, TreePath> declarationSites;

        private FilterUsedVariables(Map<Symbol, TreePath> unusedElements, ListMultimap<Symbol, TreePath> usageSites) {
            this.unusedElements = unusedElements;
            this.usageSites = usageSites;
```

### BoundedWildcard
Can generalize to `? extends UnusedSpec`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java

    private static ImmutableList<SuggestedFix> buildUnusedLambdaParameterFix(
            Symbol.VarSymbol _symbol, Collection<UnusedSpec> values, VisitorState state) {
        SuggestedFix.Builder fix = SuggestedFix.builder();

```

### BoundedWildcard
Can generalize to `? extends TreePath`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java

    private static ImmutableList<SuggestedFix> buildUnusedVarFixes(
            Symbol varSymbol, List<TreePath> usagePaths, VisitorState state) {
        // Don't suggest a fix for fields annotated @Inject: we can warn on them, but they *could* be
        // used outside the class.
```

### BoundedWildcard
Can generalize to `? extends TreePath`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java

    private static ImmutableList<SuggestedFix> buildUnusedParameterFixes(
            Symbol varSymbol, Symbol.MethodSymbol methodSymbol, List<TreePath> usagePaths, VisitorState state) {
        boolean isPrivateMethod = methodSymbol.getModifiers().contains(Modifier.PRIVATE);
        int index = methodSymbol.params.indexOf(varSymbol);
```

### BoundedWildcard
Can generalize to `? extends TreePath`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
                Symbol symbol,
                TreePath variableTree,
                Iterable<TreePath> treePaths,
                @Nullable AssignmentTree assignmentTree) {
            final ImmutableList<TreePath> treePaths1 = ImmutableList.copyOf(treePaths);
```

### BoundedWildcard
Can generalize to `? extends TreePath`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
    }

    private static SuggestedFix constructUsedVariableSuggestedFix(List<TreePath> usagePaths, VisitorState state) {
        SuggestedFix.Builder fix = SuggestedFix.builder();
        for (TreePath usagePath : usagePaths) {
```

### BoundedWildcard
Can generalize to `? extends UnusedSpec`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
    private static SuggestedFix makeAssignmentDeclaration(
            Symbol unusedSymbol,
            Collection<UnusedSpec> specs,
            ImmutableList<TreePath> allUsageSites,
            VisitorState state) {
```

### BoundedWildcard
Can generalize to `? extends TreePath`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
            Symbol unusedSymbol,
            Collection<UnusedSpec> specs,
            ImmutableList<TreePath> allUsageSites,
            VisitorState state) {
        if (unusedSymbol.getKind() != ElementKind.LOCAL_VARIABLE) {
```

### BoundedWildcard
Can generalize to `? super Node`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/XmlUtils.java`
#### Snippet
```java

    static void createOrUpdateXmlFile(
            File configurationFile, Consumer<Node> configure, Supplier<Node> defaultRootNode) {
        Node rootNode;
        if (configurationFile.isFile()) {
```

### BoundedWildcard
Can generalize to `? extends Node`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/XmlUtils.java`
#### Snippet
```java

    static void createOrUpdateXmlFile(
            File configurationFile, Consumer<Node> configure, Supplier<Node> defaultRootNode) {
        Node rootNode;
        if (configurationFile.isFile()) {
```

### BoundedWildcard
Can generalize to `? super ErrorProneOptions`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineNullAway.java`
#### Snippet
```java
    }

    private static void configureErrorProneOptions(Project proj, Action<ErrorProneOptions> action) {
        proj.afterEvaluate(new Action<Project>() {
            @Override
```

### BoundedWildcard
Can generalize to `? super ModuleComponentIdentifier`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineTesting.java`
#### Snippet
```java

    private static void ifHasResolvedCompileDependenciesMatching(
            Project project, SourceSet sourceSet, Predicate<ModuleComponentIdentifier> spec, Runnable runnable) {
        project.getConfigurations()
                .getByName(sourceSet.getRuntimeClasspathConfigurationName())
```

### BoundedWildcard
Can generalize to `? extends Set`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineModuleJvmArgs.java`
#### Snippet
```java

    private static void addManifestAttribute(
            Jar jarTask, Manifest manifest, String attributeName, Provider<Set<String>> valueProperty) {
        Project project = jarTask.getProject();
        // Only locally defined values are applied to jars
```

### BoundedWildcard
Can generalize to `? extends JavaInstallationMetadata`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/JavaInstallationMetadataWrapper.java`
#### Snippet
```java

    JavaInstallationMetadataWrapper(
            JavaLanguageVersion javaLanguageVersion, Provider<JavaInstallationMetadata> delegate) {
        this.javaLanguageVersion = javaLanguageVersion;
        this.delegate = delegate;
```

### BoundedWildcard
Can generalize to `? extends JavaInstallationMetadata`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/ConfiguredJavaToolchain.java`
#### Snippet
```java
    private final Provider<JavaInstallationMetadata> javaInstallationMetadata;

    ConfiguredJavaToolchain(ObjectFactory objectFactory, Provider<JavaInstallationMetadata> javaInstallationMetadata) {
        this.objectFactory = objectFactory;
        this.javaInstallationMetadata = javaInstallationMetadata;
```

### BoundedWildcard
Can generalize to `? extends File`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineErrorProne.java`
#### Snippet
```java
    private static void configureErrorProneOptions(
            Project project,
            Provider<File> refasterRulesFile,
            TaskProvider<CompileRefasterTask> compileRefaster,
            BaselineErrorProneExtension errorProneExtension,
```

### BoundedWildcard
Can generalize to `? extends SourceSet`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineErrorProne.java`
#### Snippet
```java
            BaselineErrorProneExtension errorProneExtension,
            JavaCompile javaCompile,
            Optional<SourceSet> maybeSourceSet,
            ErrorProneOptions errorProneOptions) {
        // If this javaCompile is associated with a source set, use it to figure out if it has preconditions or not.
```

### BoundedWildcard
Can generalize to `? super ModuleComponentIdentifier`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineErrorProne.java`
#### Snippet
```java
    }

    private static boolean hasDependenciesMatching(Configuration configuration, Spec<ModuleComponentIdentifier> spec) {
        return !Iterables.isEmpty(configuration
                .getIncoming()
```

### BoundedWildcard
Can generalize to `? extends List`
in `gradle-junit-reports/src/main/java/com/palantir/gradle/junit/JunitTaskResultExtension.java`
#### Snippet
```java
    }

    public final void registerTask(String taskName, Provider<List<Failure>> failures) {
        registerTask(taskName, new FailuresSupplier() {
            @Override
```

### BoundedWildcard
Can generalize to `? extends RegularFile`
in `gradle-junit-reports/src/main/java/com/palantir/gradle/junit/BuildFinishedAction.java`
#### Snippet
```java
    private final BuildFailureListener failureListener;

    public BuildFinishedAction(Provider<RegularFile> targetFile, BuildFailureListener failureListener) {
        this.targetFile = targetFile;
        this.failureListener = failureListener;
```

### BoundedWildcard
Can generalize to `? extends Directory`
in `gradle-junit-reports/src/main/java/com/palantir/gradle/junit/JunitReportsFinalizer.java`
#### Snippet
```java
            TaskTimer taskTimer,
            FailuresSupplier failuresSupplier,
            Provider<Directory> reportDir) {
        TaskProvider<Task> wrappedTask = project.getTasks().named(taskName);
        TaskProvider<JunitReportsFinalizer> finalizer = project.getTasks()
```

### BoundedWildcard
Can generalize to `? super Task`
in `gradle-junit-reports/src/main/java/com/palantir/gradle/junit/DefaultTaskTimer.java`
#### Snippet
```java
    private final Predicate<Task> isTrackedTask;

    public DefaultTaskTimer(Predicate<Task> isTrackedTask) {
        this.isTrackedTask = isTrackedTask;
    }
```

### BoundedWildcard
Can generalize to `? extends CheckUnusedDependenciesParentTask`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineExactDependencies.java`
#### Snippet
```java
            Project project,
            SourceSet sourceSet,
            TaskProvider<CheckUnusedDependenciesParentTask> checkUnusedDependencies,
            TaskProvider<CheckImplicitDependenciesParentTask> checkImplicitDependencies) {
        Configuration implementation =
```

### BoundedWildcard
Can generalize to `? extends CheckImplicitDependenciesParentTask`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineExactDependencies.java`
#### Snippet
```java
            SourceSet sourceSet,
            TaskProvider<CheckUnusedDependenciesParentTask> checkUnusedDependencies,
            TaskProvider<CheckImplicitDependenciesParentTask> checkImplicitDependencies) {
        Configuration implementation =
                project.getConfigurations().getByName(sourceSet.getImplementationConfigurationName());
```

### BoundedWildcard
Can generalize to `? extends ResolvedDependency`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineExactDependencies.java`
#### Snippet
```java
        private final Map<ResolvedArtifact, ResolvedDependency> artifactsFromDependency = new ConcurrentHashMap<>();

        public void populateIndexes(Set<ResolvedDependency> declaredDependencies) {
            Set<ResolvedArtifact> allArtifacts = declaredDependencies.stream()
                    .flatMap(dependency -> dependency.getAllModuleArtifacts().stream())
```

### BoundedWildcard
Can generalize to `? extends T`
in `baseline-refaster-rules/src/main/java/com/palantir/baseline/refaster/OptionalOrElseSupplier.java`
#### Snippet
```java
    @BeforeTemplate
    @SuppressWarnings("OptionalOrElseMethodInvocation")
    final T eagerOrElse(Optional<T> optional, Supplier<T> supplier) {
        return optional.orElse(supplier.get());
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `baseline-refaster-rules/src/main/java/com/palantir/baseline/refaster/OptionalOrElseSupplier.java`
#### Snippet
```java

    @AfterTemplate
    final T lazyOrElse(Optional<T> optional, Supplier<T> supplier) {
        return optional.orElseGet(supplier);
    }
```

### BoundedWildcard
Can generalize to `? extends BaselineJavaToolchain`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java

    private static void configureExecutionTasks(
            Project project, Provider<ChosenJavaVersion> runtime, Provider<BaselineJavaToolchain> javaToolchain) {
        project.getTasks().withType(JavaExec.class).configureEach(new Action<JavaExec>() {
            @Override
```

### BoundedWildcard
Can generalize to `? extends BaselineJavaToolchain`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/BaselineJavaVersion.java`
#### Snippet
```java

    private static void configureCompilationTasks(
            Project project, Property<ChosenJavaVersion> target, Provider<BaselineJavaToolchain> javaToolchain) {
        project.getTasks().withType(JavaCompile.class).configureEach(new Action<JavaCompile>() {
            @Override
```

### BoundedWildcard
Can generalize to `? extends Safety`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/safety/SafetyPropagationTransfer.java`
#### Snippet
```java
     * but returning {@link Safety#UNKNOWN} rather than null.
     */
    private static Safety getValueOfSubNode(TransferInput<Safety, AccessPathStore<Safety>> input, Node node) {
        Safety maybeSafety = input.getValueOfSubNode(node);
        return Safety.nullToUnknown(maybeSafety);
```

### BoundedWildcard
Can generalize to `? extends AccessPathStore`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/safety/SafetyPropagationTransfer.java`
#### Snippet
```java
    @CheckReturnValue
    private static TransferResult<Safety, AccessPathStore<Safety>> updateRegularStore(
            Safety value, TransferInput<?, AccessPathStore<Safety>> input, ReadableUpdates updates) {
        ResultingStore newStore = updateStore(input.getRegularStore(), updates);
        return new RegularTransferResult<>(value, newStore.store, newStore.storeChanged);
```

### BoundedWildcard
Can generalize to `? extends AccessPathStore`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/safety/SafetyPropagationTransfer.java`
#### Snippet
```java

    private static TransferResult<Safety, AccessPathStore<Safety>> noStoreChanges(
            Safety value, TransferInput<?, AccessPathStore<Safety>> input) {
        return new RegularTransferResult<>(value, input.getRegularStore());
    }
```

### BoundedWildcard
Can generalize to `? extends Safety`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/safety/SafetyPropagationTransfer.java`
#### Snippet
```java
    @SuppressWarnings("checkstyle:CyclomaticComplexity")
    private Safety fieldSafety(
            @Nullable VarSymbol accessed, @Nullable AccessPath path, AccessPathValues<Safety> store) {
        if (accessed == null) {
            return Safety.UNKNOWN;
```

### BoundedWildcard
Can generalize to `? extends CodeTransformer`
in `baseline-refaster-testing/src/main/java/com/palantir/baseline/refaster/RefasterTestHelper.java`
#### Snippet
```java
        private JavaFileObject input;

        RefactoringTestInput(List<CodeTransformer> transformers, JavaFileObject input) {
            this.transformers = transformers;
            this.input = input;
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineErrorProne.java`
#### Snippet
```java

    @SuppressWarnings("UnstableApiUsage")
    private static void configureErrorProneOptions(
            Project project,
            Provider<File> refasterRulesFile,
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

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `baseline-refaster-rules/src/main/java/com/palantir/baseline/refaster/OptionalOrElseSupplier.java`
#### Snippet
```java
    @BeforeTemplate
    @SuppressWarnings("OptionalOrElseMethodInvocation")
    final T eagerOrElse(Optional<T> optional, Supplier<T> supplier) {
        return optional.orElse(supplier.get());
    }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'optional'
in `baseline-refaster-rules/src/main/java/com/palantir/baseline/refaster/OptionalOrElseSupplier.java`
#### Snippet
```java

    @AfterTemplate
    final T lazyOrElse(Optional<T> optional, Supplier<T> supplier) {
        return optional.orElseGet(supplier);
    }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/javaversions/ChosenJavaVersion.java`
#### Snippet
```java
    public static ChosenJavaVersion fromString(String string) {
        return new ChosenJavaVersion(
                JavaLanguageVersion.of(string.replaceAll("_PREVIEW", "")), string.endsWith("_PREVIEW"));
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/services/JarClassHasher.java`
#### Snippet
```java
                    }

                    String className = entry.getName().replaceAll("/", ".").replaceAll("\\.class$", "");
                    HashingInputStream inputStream = new HashingInputStream(Hashing.sha256(), jarInputStream);
                    ByteStreams.exhaust(inputStream);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/services/JarClassHasher.java`
#### Snippet
```java
                    }

                    String className = entry.getName().replaceAll("/", ".").replaceAll("\\.class$", "");
                    HashingInputStream inputStream = new HashingInputStream(Hashing.sha256(), jarInputStream);
                    ByteStreams.exhaust(inputStream);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `gradle-junit-reports/src/main/java/com/palantir/gradle/junit/FailuresReportGenerator.java`
#### Snippet
```java
        for (Failure failure : failures) {
            String shortSource =
                    failure.source().isEmpty() ? "" : failure.source().replaceAll(".*\\.", "") + " - ";
            String className = getClassName(failure.file());

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `baseline-refaster-testing/src/main/java/com/palantir/baseline/refaster/RefasterTestHelper.java`
#### Snippet
```java
    private static ImmutableList<CodeTransformer> transformersForClass(Class<?> refasterRuleClass) {
        Path sourceFile = Paths.get("src/main/java")
                .resolve(refasterRuleClass.getName().replaceAll("\\.", File.separator) + ".java");
        try {
            Iterable<String> sourceLines = Files.readAllLines(sourceFile, StandardCharsets.UTF_8);
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
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineTesting.java`
#### Snippet
```java
    private void fixSourceSet(Project project, SourceSet ss) {
        Optional<Test> maybeTestTask = getTestTaskForSourceSet(project, ss);
        if (!maybeTestTask.isPresent()) {
            log.warn("Detected 'org:junit.jupiter:junit-jupiter', but unable to find test task");
            return;
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.suppliers` is unnecessary, and can be replaced with an import
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/SafeLoggingPropagation.java`
#### Snippet
```java
            TO_STRING);

    private static final com.google.errorprone.suppliers.Supplier<Name> TO_STRING_NAME =
            VisitorState.memoize(state -> state.getName("toString"));

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.suppliers` is unnecessary, and can be replaced with an import
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/SafeLoggingPropagation.java`
#### Snippet
```java
            VisitorState.memoize(state -> state.getName("toString"));

    private static final com.google.errorprone.suppliers.Supplier<Name> IMMUTABLES_STYLE =
            VisitorState.memoize(state -> state.getName("org.immutables.value.Value.Style"));

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.suppliers` is unnecessary, and can be replaced with an import
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/SafeLoggingPropagation.java`
#### Snippet
```java
            VisitorState.memoize(state -> state.getName("org.immutables.value.Value.Style"));

    private static final com.google.errorprone.suppliers.Supplier<Name> JACKSON_ANNOTATION =
            VisitorState.memoize(state -> state.getName("com.fasterxml.jackson.annotation.JacksonAnnotation"));

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.util` is unnecessary and can be removed
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/MoreASTHelpers.java`
#### Snippet
```java
import javax.annotation.Nullable;

/** Utility functionality that does not exist in {@link com.google.errorprone.util.ASTHelpers}. */
@SuppressWarnings("checkstyle:AbbreviationAsWordInName")
public final class MoreASTHelpers {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.suppliers` is unnecessary, and can be replaced with an import
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/safety/SafetyAnnotations.java`
#### Snippet
```java
    public static final String DO_NOT_LOG = "com.palantir.logsafe.DoNotLog";

    private static final com.google.errorprone.suppliers.Supplier<Name> safeName =
            VisitorState.memoize(state -> state.getName(SAFE));
    private static final com.google.errorprone.suppliers.Supplier<Name> unsafeName =
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.suppliers` is unnecessary, and can be replaced with an import
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/safety/SafetyAnnotations.java`
#### Snippet
```java
    private static final com.google.errorprone.suppliers.Supplier<Name> unsafeName =
            VisitorState.memoize(state -> state.getName(UNSAFE));
    private static final com.google.errorprone.suppliers.Supplier<Name> doNotLogName =
            VisitorState.memoize(state -> state.getName(DO_NOT_LOG));

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.suppliers` is unnecessary, and can be replaced with an import
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/safety/SafetyAnnotations.java`
#### Snippet
```java

    private static final class TypeArgumentHandler {
        private final com.google.errorprone.suppliers.Supplier<Type> typeSupplier;

        TypeArgumentHandler(Class<?> clazz) {
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.suppliers` is unnecessary, and can be replaced with an import
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/safety/SafetyAnnotations.java`
#### Snippet
```java
            VisitorState.memoize(state -> state.getName(DO_NOT_LOG));

    private static final com.google.errorprone.suppliers.Supplier<Type> throwableSupplier =
            Suppliers.typeFromClass(Throwable.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.suppliers` is unnecessary, and can be replaced with an import
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/safety/SafetyAnnotations.java`
#### Snippet
```java
    private static final com.google.errorprone.suppliers.Supplier<Name> safeName =
            VisitorState.memoize(state -> state.getName(SAFE));
    private static final com.google.errorprone.suppliers.Supplier<Name> unsafeName =
            VisitorState.memoize(state -> state.getName(UNSAFE));
    private static final com.google.errorprone.suppliers.Supplier<Name> doNotLogName =
```

### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.plugins.internal` is unnecessary, and can be replaced with an import
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckExplicitSourceCompatibilityTask.java`
#### Snippet
```java
        // We're doing this naughty casting because we need access to the `getRawSourceCompatibility` method.
        if (GradleVersion.current().compareTo(GradleVersion.version("7.0")) < 0) {
            org.gradle.api.plugins.internal.DefaultJavaPluginConvention convention =
                    (org.gradle.api.plugins.internal.DefaultJavaPluginConvention)
                            getProject().getConvention().getPlugin(JavaPluginConvention.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.plugins.internal` is unnecessary, and can be replaced with an import
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckExplicitSourceCompatibilityTask.java`
#### Snippet
```java
        if (GradleVersion.current().compareTo(GradleVersion.version("7.0")) < 0) {
            org.gradle.api.plugins.internal.DefaultJavaPluginConvention convention =
                    (org.gradle.api.plugins.internal.DefaultJavaPluginConvention)
                            getProject().getConvention().getPlugin(JavaPluginConvention.class);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.plugins.internal` is unnecessary, and can be replaced with an import
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckExplicitSourceCompatibilityTask.java`
#### Snippet
```java
            try {
                Method getRawSourceCompatibility =
                        org.gradle.api.plugins.internal.DefaultJavaPluginConvention.class.getMethod(
                                "getRawSourceCompatibility");
                return (JavaVersion) getRawSourceCompatibility.invoke(convention);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.plugins.internal` is unnecessary, and can be replaced with an import
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckExplicitSourceCompatibilityTask.java`
#### Snippet
```java
        }

        org.gradle.api.plugins.internal.DefaultJavaPluginExtension extension =
                (org.gradle.api.plugins.internal.DefaultJavaPluginExtension)
                        getProject().getExtensions().getByType(JavaPluginExtension.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.plugins.internal` is unnecessary, and can be replaced with an import
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckExplicitSourceCompatibilityTask.java`
#### Snippet
```java

        org.gradle.api.plugins.internal.DefaultJavaPluginExtension extension =
                (org.gradle.api.plugins.internal.DefaultJavaPluginExtension)
                        getProject().getExtensions().getByType(JavaPluginExtension.class);
        return extension.getRawSourceCompatibility();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.internal.tasks.testing` is unnecessary, and can be replaced with an import
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineTesting.java`
#### Snippet
```java

    @SuppressWarnings("IllegalImports")
    private static Property<org.gradle.api.internal.tasks.testing.TestFramework> getTestFrameworkWithReflection(
            Test task) {
        try {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.internal.tasks.testing` is unnecessary, and can be replaced with an import
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineTesting.java`
#### Snippet
```java
        try {
            Method getTestFrameworkProperty = Test.class.getMethod("getTestFrameworkProperty");
            return (Property<org.gradle.api.internal.tasks.testing.TestFramework>)
                    getTestFrameworkProperty.invoke(task);
        } catch (ReflectiveOperationException e) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.internal.tasks.testing.junitplatform` is unnecessary, and can be replaced with an import
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineTesting.java`
#### Snippet
```java
                .map(framework -> {
                    if (framework
                            instanceof org.gradle.api.internal.tasks.testing.junitplatform.JUnitPlatformTestFramework) {
                        org.gradle.api.internal.tasks.testing.junitplatform.JUnitPlatformTestFramework
                                platformFramework =
```

### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.internal.tasks.testing.junitplatform` is unnecessary, and can be replaced with an import
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineTesting.java`
#### Snippet
```java
                    if (framework
                            instanceof org.gradle.api.internal.tasks.testing.junitplatform.JUnitPlatformTestFramework) {
                        org.gradle.api.internal.tasks.testing.junitplatform.JUnitPlatformTestFramework
                                platformFramework =
                                        (org.gradle.api.internal.tasks.testing.junitplatform.JUnitPlatformTestFramework)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.internal.tasks.testing.junitplatform` is unnecessary, and can be replaced with an import
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineTesting.java`
#### Snippet
```java
                        org.gradle.api.internal.tasks.testing.junitplatform.JUnitPlatformTestFramework
                                platformFramework =
                                        (org.gradle.api.internal.tasks.testing.junitplatform.JUnitPlatformTestFramework)
                                                framework;
                        return ImmutableSet.copyOf(
```

### UnnecessaryFullyQualifiedName
Qualifier `org.gradle.api.internal.tasks.testing.junitplatform` is unnecessary, and can be replaced with an import
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineTesting.java`
#### Snippet
```java
        }
        return getTestFrameworkWithReflection(task)
                .map(org.gradle.api.internal.tasks.testing.junitplatform.JUnitPlatformTestFramework.class::isInstance)
                .getOrElse(false);
    }
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/services/JarClassHasher.java`
#### Snippet
```java
                    JarInputStream jarInputStream = new JarInputStream(fileInputStream)) {
                JarEntry entry;
                while ((entry = jarInputStream.getNextJarEntry()) != null) {
                    if (entry.isDirectory() || !entry.getName().endsWith(".class")) {
                        continue;
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineReleaseCompatibility.java`
#### Snippet
```java
        this.project = project;

        project.getTasks().withType(JavaCompile.class).configureEach(javaCompile -> {
            javaCompile.getOptions().getCompilerArgumentProviders().add(new ReleaseFlagProvider(javaCompile));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineClassUniquenessPlugin.java`
#### Snippet
```java
        project.getTasks().named(LifecycleBasePlugin.CHECK_TASK_NAME).configure(t -> t.dependsOn(checkClassUniqueness));

        project.getPlugins().withId("java", plugin -> {
            checkClassUniqueness.configure(t -> {
                Configuration runtimeClasspath =
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineNullAway.java`
#### Snippet
```java
    @Override
    public void apply(Project project) {
        project.getPluginManager().withPlugin("com.palantir.baseline-error-prone", _unused0 -> {
            project.getPluginManager().withPlugin("java-base", _unused1 -> {
                applyToProject(project);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineNullAway.java`
#### Snippet
```java
    public void apply(Project project) {
        project.getPluginManager().withPlugin("com.palantir.baseline-error-prone", _unused0 -> {
            project.getPluginManager().withPlugin("java-base", _unused1 -> {
                applyToProject(project);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineReproducibility.java`
#### Snippet
```java
        });

        project.getPluginManager().withPlugin("nebula.info", plugin -> {
            project.getLogger()
                    .warn(
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineReproducibility.java`
#### Snippet
```java
                    .register("checkExplicitSourceCompatibility", CheckExplicitSourceCompatibilityTask.class);

            project.getTasks().named(LifecycleBasePlugin.CHECK_TASK_NAME).configure(check -> {
                check.dependsOn(checkExplicitSourceCompatibility);
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineFormat.java`
#### Snippet
```java

        // necessary because SpotlessPlugin creates tasks in an afterEvaluate block
        TaskProvider<Task> formatTask = project.getTasks().register("format", task -> {
            task.setGroup("Formatting");
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineFormat.java`
#### Snippet
```java
        });
        project.afterEvaluate(p -> {
            formatTask.configure(t -> {
                t.dependsOn("spotlessApply");
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineFormat.java`
#### Snippet
```java

            // re-enable spotless checking, but lazily so it doesn't eagerly configure everything else
            project.getTasks().named(JavaBasePlugin.CHECK_TASK_NAME).configure(t -> {
                t.dependsOn(project.getTasks().named("spotlessCheck"));
            });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineFormat.java`
#### Snippet
```java
            // The copyright step configures itself lazily to allow for baselineUpdateConfig to potentially create the
            // right files. Therefore, also make sure that these will run in the right order.
            project.getPluginManager().withPlugin("com.palantir.baseline-config", baselineConfig -> {
                project.getTasks()
                        .matching(t -> t.getName().startsWith("spotless"))
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineFormat.java`
#### Snippet
```java
        });

        project.getPluginManager().withPlugin("java", plugin -> {
            configureSpotlessJava(project, spotlessExtension);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineFormat.java`
#### Snippet
```java

    private void configureCopyrightStep(Project project, SpotlessExtension spotlessExtension) {
        project.getPluginManager().withPlugin("java", javaPlugin -> {
            spotlessExtension.java(java -> java.addStep(createLazyLicenseHeaderStep(project)));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineFormat.java`
#### Snippet
```java
        // This is tricky as configuring this naively yields the following error:
        // > You must apply the groovy plugin before the spotless plugin if you are using the groovy extension.
        project.getPluginManager().withPlugin("groovy", groovyPlugin -> {
            spotlessExtension.groovy(groovy -> groovy.addStep(createLazyLicenseHeaderStep(project)));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineFormat.java`
#### Snippet
```java
        }

        spotlessExtension.groovyGradle(ext -> {
            ext.greclipse().configFile(configFile.toAbsolutePath());
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineImmutables.java`
#### Snippet
```java
    @Override
    public void apply(Project project) {
        project.getPluginManager().withPlugin("java", unused -> {
            project.getExtensions().getByType(SourceSetContainer.class).configureEach(sourceSet -> {
                project.getTasks()
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineImmutables.java`
#### Snippet
```java
    public void apply(Project project) {
        project.getPluginManager().withPlugin("java", unused -> {
            project.getExtensions().getByType(SourceSetContainer.class).configureEach(sourceSet -> {
                project.getTasks()
                        .named(sourceSet.getCompileJavaTaskName(), JavaCompile.class)
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineCircleCi.java`
#### Snippet
```java
                }));

        project.getPluginManager().withPlugin("com.palantir.junit-reports", unused -> {
            project.getExtensions().configure(JunitReportsExtension.class, junitReports -> junitReports
                    .getReportsDirectory()
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineModuleJvmArgs.java`
#### Snippet
```java
                        project.getExtensions().getByType(BaselineJavaVersionExtension.class);
                extension.setEnablePreview(javaVersionsExtension.runtime().map(chosenJavaVersion -> {
                    return chosenJavaVersion.enablePreview()
                            ? Optional.of(chosenJavaVersion.javaLanguageVersion())
                            : Optional.empty();
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineTesting.java`
#### Snippet
```java
                    .getSourceSets()
                    .configureEach(sourceSet -> {
                        getTestTaskForSourceSet(project, sourceSet).ifPresent(testTask -> {
                            testTask.dependsOn(checkJUnitDependencies);
                        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineErrorProne.java`
#### Snippet
```java
                    return "latest.release";
                });
        Configuration refasterConfiguration = project.getConfigurations().create("refaster", conf -> {
            conf.defaultDependencies(deps -> {
                deps.add(project.getDependencies()
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineErrorProne.java`
#### Snippet
```java
                });
        Configuration refasterConfiguration = project.getConfigurations().create("refaster", conf -> {
            conf.defaultDependencies(deps -> {
                deps.add(project.getDependencies()
                        .create("com.palantir.baseline:baseline-refaster-rules:" + version + ":sources"));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineErrorProne.java`
#### Snippet
```java
                });

        project.getTasks().withType(JavaCompile.class).configureEach(javaCompile -> {
            ((ExtensionAware) javaCompile.getOptions())
                    .getExtensions()
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineErrorProne.java`
#### Snippet
```java
            ((ExtensionAware) javaCompile.getOptions())
                    .getExtensions()
                    .configure(ErrorProneOptions.class, errorProneOptions -> {
                        configureErrorProneOptions(
                                project,
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineErrorProne.java`
#### Snippet
```java
                }));

        project.getPluginManager().withPlugin("java-gradle-plugin", appliedPlugin -> {
            project.getTasks().withType(JavaCompile.class).configureEach(javaCompile -> ((ExtensionAware)
                            javaCompile.getOptions())
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineErrorProne.java`
#### Snippet
```java
    @Override
    public void apply(Project project) {
        project.getPluginManager().withPlugin("java", unused -> {
            applyToJavaProject(project);
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-junit-reports/src/main/java/com/palantir/gradle/junit/JunitReportsPlugin.java`
#### Snippet
```java
        });

        project.getTasks().withType(Checkstyle.class).configureEach(checkstyle -> {
            ext.registerTask(
                    checkstyle.getName(), XmlReportFailuresSupplier.create(checkstyle, new CheckstyleReportHandler()));
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-junit-reports/src/main/java/com/palantir/gradle/junit/JunitReportsPlugin.java`
#### Snippet
```java
        });

        project.getTasks().withType(JavaCompile.class).configureEach(javac -> {
            ext.registerTask(javac.getName(), JavacFailuresSupplier.create(javac));
        });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `gradle-junit-reports/src/main/java/com/palantir/gradle/junit/JunitReportsFinalizer.java`
#### Snippet
```java
                });

        wrappedTask.configure(task -> {
            task.finalizedBy(finalizer);
        });
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
        private final Set<Symbol> hasBeenAssigned = new HashSet<>();

        private TreePath currentExpressionStatement = null;

        private final Map<Symbol, TreePath> unusedElements;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
        // When this greater than zero, the usage of identifiers are real because they are in a method
        // call.
        private int inMethodCall = 0;

        private final Set<Symbol> hasBeenAssigned = new HashSet<>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
        // This is true when we are processing a `return` statement. Elements used in return statement
        // must not be considered unused.
        private boolean inReturnStatement = false;
        // When this greater than zero, the usage of identifiers are real because they are in a method
        // call.
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
        private boolean leftHandSideAssignment = false;
        // When this greater than zero, the usage of identifiers are real.
        private int inArrayAccess = 0;
        // This is true when we are processing a `return` statement. Elements used in return statement
        // must not be considered unused.
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java

    private static final class FilterUsedVariables extends TreePathScanner<Void, Void> {
        private boolean leftHandSideAssignment = false;
        // When this greater than zero, the usage of identifiers are real.
        private int inArrayAccess = 0;
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/SafeLoggingPropagation.java`
#### Snippet
```java
            ExpressionTree expression = node.getExpression();
            if (expression == null) {
                return null;
            }
            // Validate that the discovered ReturnTree is from the same scope as the 'target' method.
```

### ReturnNull
Return of `null`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/SafeLoggingPropagation.java`
#### Snippet
```java
        @Override
        public Safety visitClass(ClassTree _node, VisitorState _obj) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/SafeLoggingPropagation.java`
#### Snippet
```java
        @Override
        public Safety visitNewClass(NewClassTree node, VisitorState _state) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/SafeLoggingPropagation.java`
#### Snippet
```java
        @Override
        public Safety visitLambdaExpression(LambdaExpressionTree node, VisitorState _state) {
            return null;
        }

```

### ReturnNull
Return of `null`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/PreferCollectionConstructors.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/Slf4jLevelCheck.java`
#### Snippet
```java
            // Do not flag logging from a catch withing a level-check conditional. These are sometimes
            // more severe if there's a problem generating fine grained logging.
            return null;
        }

```

### ReturnNull
Return of `null`
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/Slf4jLevelCheck.java`
#### Snippet
```java
                }
            }
            return null;
        }

```

### ReturnNull
Return of `null`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineModuleJvmArgs.java`
#### Snippet
```java
                            }
                        }
                        return null;
                    } catch (IOException e) {
                        project.getLogger().warn("Failed to check jar {} for manifest attributes", file, e);
```

### ReturnNull
Return of `null`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineModuleJvmArgs.java`
#### Snippet
```java
                    } catch (IOException e) {
                        project.getLogger().warn("Failed to check jar {} for manifest attributes", file, e);
                        return null;
                    }
                })
```

### ReturnNull
Return of `null`
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/plugins/BaselineErrorProne.java`
#### Snippet
```java
                            project.getConfigurations().findByName(ss.getCompileClasspathConfigurationName());
                    if (configuration == null) {
                        return null;
                    }
                    return filterOutPreconditions(configuration).and(filterOutSafeLogger(configuration));
```

## RuleId[id=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'JCTree.JCAssignOp' type conflicts with preceding 'instanceof CompoundAssignmentTree' check
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
                        SuggestedFix replacement = SuggestedFix.replace(
                                tree.getStartPosition(),
                                ((JCTree.JCAssignOp) tree).getExpression().getStartPosition(),
                                "");
                        fix.merge(replacement);
```

### CastConflictsWithInstanceof
Cast to 'JCTree.JCAssign' type conflicts with preceding 'instanceof AssignmentTree' check
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/StrictUnusedVariable.java`
#### Snippet
```java
                        fix.replace(
                                tree.getStartPosition(),
                                ((JCTree.JCAssign) tree).getExpression().getStartPosition(),
                                "");
                        continue;
```

## RuleId[id=NonExceptionNameEndsWithException]
### NonExceptionNameEndsWithException
Non-exception class name `CatchBlockLogException` ends with 'Exception'
in `baseline-error-prone/src/main/java/com/palantir/baseline/errorprone/CatchBlockLogException.java`
#### Snippet
```java
        severity = SeverityLevel.ERROR,
        summary = "log statement in catch block does not log the caught exception.")
public final class CatchBlockLogException extends BugChecker implements BugChecker.CatchTreeMatcher {

    private static final long serialVersionUID = 1L;
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
    private static final Matcher<ExpressionTree> DURATION_ZERO_MATCHER = Matchers.methodInvocation(
            MethodMatchers.staticMethod()
                    .onClass(RateLimiter.class.getName())
                    .named("create")
                    .withParameters("double", Duration.class.getName()),
```

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
in `gradle-baseline-java/src/main/groovy/com/palantir/baseline/tasks/CheckUnusedDependenciesTask.java`
#### Snippet
```java
        excludeSourceOnlyDependencies();

        Set<ResolvedArtifact> necessaryArtifacts = Streams.stream(
                        sourceClasses.get().iterator())
                .flatMap(BaselineExactDependencies::referencedClasses)
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
'com.google.common.base.Utf8' is marked unstable with @Beta
in `baseline-refaster-rules/src/main/java/com/palantir/baseline/refaster/Utf8Length.java`
#### Snippet
```java
    @AfterTemplate
    int optimizedMethod(String string) {
        return Utf8.encodedLength(string);
    }
}
```

### UnstableApiUsage
'encodedLength(java.lang.CharSequence)' is declared in unstable class 'com.google.common.base.Utf8' marked with @Beta
in `baseline-refaster-rules/src/main/java/com/palantir/baseline/refaster/Utf8Length.java`
#### Snippet
```java
    @AfterTemplate
    int optimizedMethod(String string) {
        return Utf8.encodedLength(string);
    }
}
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
'nullWriter()' is marked unstable with @Beta
in `baseline-refaster-testing/src/main/java/com/palantir/baseline/refaster/CompilerUtility.java`
#### Snippet
```java

        JavacTaskImpl task = (JavacTaskImpl) compiler.getTask(
                CharStreams.nullWriter(),
                fileManager,
                diagnosticsCollector,
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

