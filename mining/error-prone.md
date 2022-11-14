# google/error-prone
# Bad smells
I found 1726 bad smells with 22 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=BoundedWildcard] | 278 | false |
| RuleId[ruleID=DataFlowIssue] | 265 | false |
| RuleId[ruleID=UnstableApiUsage] | 219 | false |
| RuleId[ruleID=AbstractClassNeverImplemented] | 186 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 165 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 77 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 49 | false |
| RuleId[ruleID=SimplifyOptionalCallChains] | 43 | false |
| RuleId[ruleID=Convert2Lambda] | 36 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 34 | false |
| RuleId[ruleID=Convert2MethodRef] | 31 | false |
| RuleId[ruleID=ReturnNull] | 26 | false |
| RuleId[ruleID=OptionalUsedAsFieldOrParameterType] | 23 | false |
| RuleId[ruleID=StaticPseudoFunctionalStyleMethod] | 21 | false |
| RuleId[ruleID=NonSerializableFieldInSerializableClass] | 19 | false |
| RuleId[ruleID=OptionalGetWithoutIsPresent] | 15 | false |
| RuleId[ruleID=NullableProblems] | 13 | false |
| RuleId[ruleID=NestedAssignment] | 12 | false |
| RuleId[ruleID=DeprecatedIsStillUsed] | 12 | false |
| RuleId[ruleID=CastConflictsWithInstanceof] | 11 | false |
| RuleId[ruleID=NonShortCircuitBoolean] | 10 | false |
| RuleId[ruleID=SimplifyStreamApiCallChains] | 10 | false |
| RuleId[ruleID=UnnecessaryLocalVariable] | 10 | true |
| RuleId[ruleID=InstanceofIncompatibleInterface] | 9 | false |
| RuleId[ruleID=UnnecessarySemicolon] | 9 | false |
| RuleId[ruleID=OptionalContainsCollection] | 9 | false |
| RuleId[ruleID=JavaReflectionMemberAccess] | 9 | false |
| RuleId[ruleID=UnnecessaryUnboxing] | 8 | false |
| RuleId[ruleID=ClassNameSameAsAncestorName] | 7 | false |
| RuleId[ruleID=UnusedAssignment] | 7 | false |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 6 | true |
| RuleId[ruleID=AssignmentToForLoopParameter] | 5 | false |
| RuleId[ruleID=UnnecessaryQualifierForThis] | 4 | false |
| RuleId[ruleID=FinalPrivateMethod] | 4 | false |
| RuleId[ruleID=CodeBlock2Expr] | 4 | false |
| RuleId[ruleID=NonExceptionNameEndsWithException] | 4 | false |
| RuleId[ruleID=ConstantValue] | 4 | false |
| RuleId[ruleID=MismatchedJavadocCode] | 4 | false |
| RuleId[ruleID=RedundantSuppression] | 4 | false |
| RuleId[ruleID=CommentedOutCode] | 3 | false |
| RuleId[ruleID=ReadWriteStringCanBeUsed] | 3 | false |
| RuleId[ruleID=IgnoreResultOfCall] | 3 | false |
| RuleId[ruleID=EmptyMethod] | 3 | false |
| RuleId[ruleID=RedundantImplements] | 3 | false |
| RuleId[ruleID=SetReplaceableByEnumSet] | 3 | false |
| RuleId[ruleID=UnnecessaryReturn] | 2 | true |
| RuleId[ruleID=TrivialStringConcatenation] | 2 | false |
| RuleId[ruleID=UnnecessarySuperQualifier] | 2 | false |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 2 | false |
| RuleId[ruleID=UnstableTypeUsedInSignature] | 2 | false |
| RuleId[ruleID=UnnecessaryCallToStringValueOf] | 2 | false |
| RuleId[ruleID=Anonymous2MethodRef] | 2 | false |
| RuleId[ruleID=JavaReflectionInvocation] | 2 | false |
| RuleId[ruleID=AssignmentToLambdaParameter] | 2 | false |
| RuleId[ruleID=CastCanBeRemovedNarrowingVariableType] | 2 | false |
| RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument] | 1 | true |
| RuleId[ruleID=EmptyStatementBody] | 1 | false |
| RuleId[ruleID=RegExpRedundantEscape] | 1 | false |
| RuleId[ruleID=DuplicateBranchesInSwitch] | 1 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 1 | true |
| RuleId[ruleID=FinalStaticMethod] | 1 | false |
| RuleId[ruleID=RedundantMethodOverride] | 1 | false |
| RuleId[ruleID=OptionalAssignedToNull] | 1 | false |
| RuleId[ruleID=IfStatementWithIdenticalBranches] | 1 | false |
| RuleId[ruleID=SlowListContainsAll] | 1 | false |
| RuleId[ruleID=SimplifiableBooleanExpression] | 1 | false |
| RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized] | 1 | false |
| RuleId[ruleID=ExceptionNameDoesntEndWithException] | 1 | false |
| RuleId[ruleID=StringRepeatCanBeUsed] | 1 | false |
| RuleId[ruleID=RedundantStringFormatCall] | 1 | false |
| RuleId[ruleID=TypeParameterExtendsObject] | 1 | false |
| RuleId[ruleID=IOResource] | 1 | false |
| RuleId[ruleID=OptionalIsPresent] | 1 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 1 | false |
| RuleId[ruleID=StringOperationCanBeSimplified] | 1 | false |
| RuleId[ruleID=InnerClassMayBeStatic] | 1 | true |
| RuleId[ruleID=UnusedLabel] | 1 | true |
| RuleId[ruleID=SystemOutErr] | 1 | false |
| RuleId[ruleID=ConditionCoveredByFurtherCondition] | 1 | false |
| RuleId[ruleID=ReplaceNullCheck] | 1 | false |
| RuleId[ruleID=UnnecessaryContinue] | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new String\[remainingArgs.size()\]'
in `check_api/src/main/java/com/google/errorprone/ErrorProneOptions.java`
#### Snippet
```java

  public String[] getRemainingArgs() {
    return remainingArgs.toArray(new String[remainingArgs.size()]);
  }

```

## RuleId[ruleID=EmptyStatementBody]
### RuleId[ruleID=EmptyStatementBody]
`for` statement has empty body
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullnessUtils.java`
#### Snippet
```java
      case ARRAY_TYPE:
        Tree beforeBrackets;
        for (beforeBrackets = typeTree;
            beforeBrackets.getKind() == ARRAY_TYPE;
            beforeBrackets = ((ArrayTypeTree) beforeBrackets).getType()) {}
```

## RuleId[ruleID=CommentedOutCode]
### RuleId[ruleID=CommentedOutCode]
Commented out code (6 lines)
in `core/src/main/java/com/google/errorprone/bugpatterns/CanBeStaticAnalyzer.java`
#### Snippet
```java
  // check for implicit references to type parameters of the enclosing
  // class in unqualified references to sibling types, e.g.:
  //
  // class Test<T> {
  //   class One {}
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (3 lines)
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableChecker.java`
#### Snippet
```java
      //
      // TODO(b/25630189): fix this
      //
      // if (superType.tsym.getKind() == ElementKind.ANNOTATION_TYPE) {
      //   return superType;
```

### RuleId[ruleID=CommentedOutCode]
Commented out code (5 lines)
in `check_api/src/main/java/com/google/errorprone/matchers/UnusedReturnValueMatcher.java`
#### Snippet
```java
  public static boolean expectedExceptionTest(VisitorState state) {
    // Allow unused return values in tests that check for thrown exceptions, e.g.:
    //
    // try {
    //   Foo.newFoo(-1);
```

## RuleId[ruleID=RegExpRedundantEscape]
### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\}` in RegExp
in `core/src/main/java/com/google/errorprone/bugpatterns/flogger/FloggerMessageFormat.java`
#### Snippet
```java
      instanceMethod().onDescendantOf("com.google.common.flogger.LoggingApi").named("log");

  private static final Pattern MESSAGE_FORMAT_SPECIFIER = Pattern.compile("\\{[0-9]\\}");

  @Override
```

## RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `core/src/main/java/com/google/errorprone/refaster/UNewArray.java`
#### Snippet
```java
    boolean hasRepeated =
        getInitializers() != null
            && Iterables.any(getInitializers(), Predicates.instanceOf(URepeated.class));
    return unifyNullable(unifier, getType(), newArray.getType())
        .thenChoose(unifications(getDimensions(), newArray.getDimensions()))
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderVerificationVisitor.java`
#### Snippet
```java
      JCExpression expr = (JCExpression) node;
      for (UFreeIdent.Key key :
          Iterables.filter(unifier.getBindings().keySet(), UFreeIdent.Key.class)) {
        JCExpression keyBinding = unifier.getBinding(key);
        if (PlaceholderUnificationVisitor.equivalentExprs(unifier, expr, keyBinding)) {
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderVerificationVisitor.java`
#### Snippet
```java
  public Boolean visitIdentifier(IdentifierTree node, Unifier unifier) {
    for (LocalVarBinding localBinding :
        Iterables.filter(unifier.getBindings().values(), LocalVarBinding.class)) {
      if (localBinding.getSymbol().equals(ASTHelpers.getSymbol(node))) {
        return false;
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `core/src/main/java/com/google/errorprone/refaster/UFreeIdent.java`
#### Snippet
```java
                  Symbol identSym = ASTHelpers.getSymbol(ident);
                  for (ULocalVarIdent.Key key :
                      Iterables.filter(unifier.getBindings().keySet(), ULocalVarIdent.Key.class)) {
                    if (identSym == unifier.getBinding(key).getSymbol()) {
                      return false;
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `core/src/main/java/com/google/errorprone/refaster/RefasterRuleBuilderScanner.java`
#### Snippet
```java
                r.getModifiers().getFlags().contains(Modifier.ABSTRACT));
          }
        }.reverse().immutableSortedCopy(Iterables.filter(tree.getMembers(), MethodTree.class));
    scanner.visit(methods, null);

```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `core/src/main/java/com/google/errorprone/refaster/RefasterRuleBuilderScanner.java`
#### Snippet
```java

    return scanner.createMatchers(
        Iterables.filter(types, UTypeVar.class),
        sym.getQualifiedName().toString(),
        UTemplater.annotationMap(sym));
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `core/src/main/java/com/google/errorprone/refaster/Template.java`
#### Snippet
```java
        Ordering.natural()
            .immutableSortedCopy(
                Iterables.filter(inliner.bindings.keySet(), PlaceholderExpressionKey.class))) {
      Type keyType = key.method.returnType().inline(inliner);
      // See comment in `expectedTypes` for why we skip void placeholder keys.
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `core/src/main/java/com/google/errorprone/refaster/Template.java`
#### Snippet
```java
        Ordering.natural()
            .immutableSortedCopy(
                Iterables.filter(inliner.bindings.keySet(), PlaceholderExpressionKey.class))) {
      Type type = key.method.returnType().inline(inliner);
      // Skip void placeholder expressions, because
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
  public UClassDecl visitClass(ClassTree tree, Void v) {
    ImmutableList.Builder<UMethodDecl> decls = ImmutableList.builder();
    for (MethodTree decl : Iterables.filter(tree.getMembers(), MethodTree.class)) {
      if (ASTHelpers.isGeneratedConstructor(decl)) {
        // skip synthetic constructors
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `core/src/main/java/com/google/errorprone/refaster/Choice.java`
#### Snippet
```java
      @Override
      protected Iterator<R> iterator() {
        return Optional.presentInstances(Iterables.transform(thisChoice.asIterable(), function))
            .iterator();
      }
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `core/src/main/java/com/google/errorprone/bugpatterns/RedundantThrows.java`
#### Snippet
```java
    ImmutableList<ExpressionTree> delete =
        ImmutableList.<ExpressionTree>copyOf(
            Iterables.filter(tree.getThrows(), Predicates.in(toRemove)));
    return buildDescription(delete.get(0))
        .setMessage("Redundant throws clause: " + oxfordJoin("; ", messages))
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/guice/AssistedParameters.java`
#### Snippet
```java

      List<String> simpleParameterNames =
          Lists.transform(conflict.parameters(), t -> t.getName().toString());
      Joiner.on(", ").appendTo(sb, simpleParameterNames);
    }
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/Util.java`
#### Snippet
```java
  private static Matcher<AnnotationTree> hasAnyParameter(String... parameters) {
    return anyOf(
        transform(
            asList(parameters),
            new Function<String, Matcher<AnnotationTree>>() {
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/ExternalCanIgnoreReturnValue.java`
#### Snippet
```java
    return Iterables.elementsEqual(
        parameters,
        Iterables.transform(methodParams, p -> fullyErasedAndUnannotatedType(p.type, types)));
  }

```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/ExternalCanIgnoreReturnValue.java`
#### Snippet
```java
    }
    return String.join(
        ",", Iterables.transform(params, p -> fullyErasedAndUnannotatedType(p.type, types)));
  }
}
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `check_api/src/main/java/com/google/errorprone/apply/ImportStatements.java`
#### Snippet
```java
    importStrings = new LinkedHashSet<>();
    importStrings.addAll(
        Lists.transform(
            importTrees,
            new Function<JCImport, String>() {
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
        public Boolean visitIdentifier(IdentifierTree node, Unifier unifier) {
          for (LocalVarBinding localBinding :
              Iterables.filter(unifier.getBindings().values(), LocalVarBinding.class)) {
            if (localBinding.getSymbol().equals(ASTHelpers.getSymbol(node))) {
              return true;
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
          JCExpression expr = (JCExpression) node;
          for (UFreeIdent.Key key :
              Iterables.filter(unifier.getBindings().keySet(), UFreeIdent.Key.class)) {
            JCExpression keyBinding = unifier.getBinding(key);
            if (equivalentExprs(unifier, expr, keyBinding)) {
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `check_api/src/main/java/com/google/errorprone/suppliers/Suppliers.java`
#### Snippet
```java
  public static ImmutableList<Supplier<Type>> fromStrings(Iterable<String> types) {
    return ImmutableList.copyOf(
        Iterables.transform(
            types,
            new Function<String, Supplier<Type>>() {
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `test_helpers/src/main/java/com/google/errorprone/BugCheckerRefactoringTestHelper.java`
#### Snippet
```java
    JCCompilationUnit tree = (JCCompilationUnit) byURI.get(inputURI);
    Iterable<Diagnostic<? extends JavaFileObject>> errorDiagnostics =
        Iterables.filter(
            diagnosticsCollector.getDiagnostics(), d -> d.getKind() == Diagnostic.Kind.ERROR);
    if (!Iterables.isEmpty(errorDiagnostics)) {
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `test_helpers/src/main/java/com/google/errorprone/BugCheckerRefactoringTestHelper.java`
#### Snippet
```java
  private static String getFullyQualifiedName(JCCompilationUnit tree) {
    Iterator<JCClassDecl> types =
        Iterables.filter(tree.getTypeDecls(), JCClassDecl.class).iterator();
    if (types.hasNext()) {
      return Iterators.getOnlyElement(types).sym.getQualifiedName().toString();
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafety.java`
#### Snippet
```java
          // assume enums are always immutable
          // TODO(b/25630186): add enforcement
          return Violation.absent();
        case INTERFACE:
        case CLASS:
```

## RuleId[ruleID=UnnecessaryQualifierForThis]
### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `UInstanceOf` on 'this' is unnecessary in this context
in `core/src/main/java/com/google/errorprone/refaster/UInstanceOf.java`
#### Snippet
```java
                    default:
                      try {
                        return method.invoke(UInstanceOf.this, args);
                      } catch (IllegalArgumentException e) {
                        throw new LinkageError(method.getName(), e);
```

### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `TypeExtractor` on 'this' is unnecessary in this context
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMockChecker.java`
#### Snippet
```java
    default TypeExtractor<T> or(TypeExtractor<T> other) {
      return (tree, state) ->
          TypeExtractor.this
              .extract(tree, state)
              .map(Optional::of)
```

### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `GuardedByChecker` on 'this' is unnecessary in this context
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedByChecker.java`
#### Snippet
```java
        state,
        (ExpressionTree tree, GuardedByExpression guard, HeldLockSet live) ->
            report(GuardedByChecker.this.checkGuardedAccess(tree, guard, live, state), state),
        tree1 -> isSuppressed(tree1, state),
        flags);
```

### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `BugChecker` on 'this' is unnecessary in this context
in `check_api/src/main/java/com/google/errorprone/bugpatterns/BugChecker.java`
#### Snippet
```java
        SuppressionInfo.EMPTY
            .withExtendedSuppressions(sym, state, customSuppressionAnnotationNames.get(state))
            .suppressedState(BugChecker.this, suppressedInGeneratedCode, state);
    return suppressedState == SuppressionInfo.SuppressedState.SUPPRESSED;
  }
```

## RuleId[ruleID=FinalPrivateMethod]
### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `core/src/main/java/com/google/errorprone/bugpatterns/StaticAssignmentOfThrowable.java`
#### Snippet
```java
  /* Builds a {@code TreeScanner} that searches for assignments to static {@code Throwable} fields,
   * and reports matches. */
  private final TreeScanner<Void, Void> buildTreeScanner(VisitorState state) {

    Type throwableType = state.getSymtab().throwableType;
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMustBeClosedChecker.java`
#### Snippet
```java
   * try-with-resources statement.
   */
  private final Optional<Change> matchNewClassOrMethodInvocation(
      ExpressionTree tree, VisitorState state, NameSuggester suggester) {
    if (ASTHelpers.isInStaticInitializer(state)) {
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `core/src/main/java/com/google/errorprone/bugpatterns/time/StronglyTypeTime.java`
#### Snippet
```java

  /** Tries to strip any time-related suffix off the field name. */
  private static final String createNewName(String fieldName) {
    String newName = TIME_UNIT_REMOVER.matcher(fieldName).replaceAll("");
    // Guard against field names that *just* contain the unit. Not much we can do here.
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `check_api/src/main/java/com/google/errorprone/apply/DiffApplier.java`
#### Snippet
```java
  }

  private final void decrementTasks() {
    if (runState.decrementAndGet() == 0) {
      workerService.shutdown();
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
`description.fixes.size() > 0` can be replaced with '!description.fixes.isEmpty()'
in `check_api/src/main/java/com/google/errorprone/apply/DescriptionBasedDiff.java`
#### Snippet
```java
  public void onDescribed(Description description) {
    // Use only first (most likely) suggested fix
    if (description.fixes.size() > 0) {
      handleFix(description.fixes.get(0));
    }
```

## RuleId[ruleID=ReadWriteStringCanBeUsed]
### RuleId[ruleID=ReadWriteStringCanBeUsed]
Can be replaced with 'Files.readString()'
in `docgen/src/main/java/com/google/errorprone/BugPatternFileGenerator.java`
#### Snippet
```java
                  "%s specifies an explanation via @BugPattern and side-car", pattern.name));
        }
        pattern.explanation = new String(Files.readAllBytes(sidecarExplanation), UTF_8).trim();
      }

```

### RuleId[ruleID=ReadWriteStringCanBeUsed]
Can be replaced with 'Files.readString()'
in `check_api/src/main/java/com/google/errorprone/apply/FsFileSource.java`
#### Snippet
```java
  public SourceFile readFile(String path) throws IOException {
    return new SourceFile(
        path, new String(Files.readAllBytes(rootPath.resolve(path)), StandardCharsets.UTF_8));
  }
}
```

### RuleId[ruleID=ReadWriteStringCanBeUsed]
Can be replaced with 'Files.readString()'
in `check_api/src/main/java/com/google/errorprone/apply/PatchFileDestination.java`
#### Snippet
```java
  public void writeFile(SourceFile update) throws IOException {
    Path sourceFilePath = rootPath.resolve(update.getPath());
    String oldSource = new String(Files.readAllBytes(sourceFilePath), UTF_8);
    String newSource = update.getSourceText();
    if (!oldSource.equals(newSource)) {
```

## RuleId[ruleID=UnnecessaryReturn]
### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
          ByteString.class.getMethod("fromHex", String.class).invoke(null, argument);
        } catch (NoSuchMethodException | IllegalAccessException e) {
          return;
        } catch (InvocationTargetException e) {
          throw Throwables.getCauseAs(e.getCause(), NumberFormatException.class);
```

### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `core/src/main/java/com/google/errorprone/bugpatterns/WildcardImport.java`
#### Snippet
```java
            break;
          default:
            return;
        }
      }
```

## RuleId[ruleID=NonShortCircuitBoolean]
### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `importTopLevelClazz |= importName.contentEquals(topLevelClazz)`
in `core/src/main/java/com/google/errorprone/refaster/ImportPolicy.java`
#### Snippet
```java
          return makeSelectExpression(inliner, qualifiedPath, qualifiedPath.size() - 1);
        }
        importTopLevelClazz |= importName.contentEquals(topLevelClazz);
        if (!importTopLevelClazz) {
          conflictTopLevelClazz |=
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `conflictTopLevelClazz |= topClazz.equals(Iterables.getLast(Splitter.on('.').split(impo...`
in `core/src/main/java/com/google/errorprone/refaster/ImportPolicy.java`
#### Snippet
```java
        importTopLevelClazz |= importName.contentEquals(topLevelClazz);
        if (!importTopLevelClazz) {
          conflictTopLevelClazz |=
              topClazz.equals(Iterables.getLast(Splitter.on('.').split(importName)));
        }
      }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `modified |= variables.contains(sym)`
in `core/src/main/java/com/google/errorprone/bugpatterns/LoopConditionChecker.java`
#### Snippet
```java
    private void check(ExpressionTree expression) {
      Symbol sym = ASTHelpers.getSymbol(expression);
      modified |= variables.contains(sym);
    }
  }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `anyBuilderFixes |= !returnTypeFixer.failed`
in `core/src/main/java/com/google/errorprone/bugpatterns/MixedMutabilityReturnType.java`
#### Snippet
```java
          returnTypeFixer.scan(methodTree, null);

          anyBuilderFixes |= !returnTypeFixer.failed;
          simpleFix.merge(simple);
          fixWithBuilders.merge(returnTypeFixer.failed ? simple : returnTypeFixer.fix.build());
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `hasFinding |= check(formals.get(i).getSimpleName().toString(), actuals.get(i), state)`
in `core/src/main/java/com/google/errorprone/bugpatterns/time/TimeUnitMismatch.java`
#### Snippet
```java
    boolean hasFinding = false;
    for (int i = 0; i < formals.size(); i++) {
      hasFinding |= check(formals.get(i).getSimpleName().toString(), actuals.get(i), state);
    }
    return hasFinding;
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `foundJavaxInject |= ASTHelpers.hasAnnotation(superMethod, JAVAX_INJECT_ANNOTATION, state)`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/guice/OverridesJavaxInjectableMethod.java`
#### Snippet
```java
      // is not necessarily a match even if we find javax Inject on an ancestor
      // since a higher up ancestor may have @com.google.inject.Inject
      foundJavaxInject |= ASTHelpers.hasAnnotation(superMethod, JAVAX_INJECT_ANNOTATION, state);
    }

```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `likelyToProduceException[0] |= state.getTypes().isSubtype(getType(tree), state.getSy...`
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/ParameterMissingNullable.java`
#### Snippet
```java
          @Override
          public Void visitNewClass(NewClassTree tree, Void unused) {
            likelyToProduceException[0] |=
                state.getTypes().isSubtype(getType(tree), state.getSymtab().throwableType);
            return super.visitNewClass(tree, unused);
          }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `completes |= scan(catchTree.getBlock())`
in `check_api/src/main/java/com/google/errorprone/util/Reachability.java`
#### Snippet
```java
      // checked exception handlers
      for (CatchTree catchTree : that.getCatches()) {
        completes |= scan(catchTree.getBlock());
      }
      if (that.getFinallyBlock() != null && !scan(that.getFinallyBlock())) {
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `warningIsError |= diagnostic.getCode().equals("compiler.err.warnings.and.werror")`
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
    boolean warningInSameCompilationUnit = false;
    for (Diagnostic<? extends JavaFileObject> diagnostic : compilationResult.diagnostics()) {
      warningIsError |= diagnostic.getCode().equals("compiler.err.warnings.and.werror");
      JavaFileObject diagnosticSource = diagnostic.getSource();
      // If the source's origin is unknown, assume that new diagnostics are due to a modification.
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `warningInSameCompilationUnit |= diagnosticInSameCompilationUnit`
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
        case WARNING:
          ++countWarnings;
          warningInSameCompilationUnit |= diagnosticInSameCompilationUnit;
          break;
        default:
```

## RuleId[ruleID=FinalStaticMethod]
### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `core/src/main/java/com/google/errorprone/bugpatterns/time/StronglyTypeTime.java`
#### Snippet
```java

  /** Tries to strip any time-related suffix off the field name. */
  private static final String createNewName(String fieldName) {
    String newName = TIME_UNIT_REMOVER.matcher(fieldName).replaceAll("");
    // Guard against field names that *just* contain the unit. Not much we can do here.
```

## RuleId[ruleID=TrivialStringConcatenation]
### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `core/src/main/java/com/google/errorprone/bugpatterns/TypeParameterNaming.java`
#### Snippet
```java

  private static String upperCamelToken(String s) {
    return "" + Ascii.toUpperCase(s.charAt(0)) + (s.length() == 1 ? "" : s.substring(1));
  }

```

### RuleId[ruleID=TrivialStringConcatenation]
Empty string used in concatenation
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
      // The maximum number of errors was not set - pick a default value.
      value = defaultValue;
      newOptions.add(key).add("" + defaultValue);
    }
    return value;
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends V`
in `core/src/main/java/com/google/errorprone/refaster/Inliner.java`
#### Snippet
```java
  }

  public <V> Optional<V> getOptionalBinding(Bindings.Key<V> key) {
    return Optional.fromNullable(bindings.getBinding(key));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends UExpression`
in `core/src/main/java/com/google/errorprone/refaster/UPlaceholderExpression.java`
#### Snippet
```java
  }

  static TreeCopier<Inliner> copier(Map<UVariableDecl, UExpression> arguments, Inliner inliner) {
    return new TreeCopier<Inliner>(inliner.maker()) {
      @Override
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
  }

  private static <T> ImmutableList<T> cast(Iterable<?> elements, Class<T> clazz) {
    ImmutableList.Builder<T> builder = ImmutableList.builder();
    for (Object element : elements) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `core/src/main/java/com/google/errorprone/refaster/Choice.java`
#### Snippet
```java

  /** Maps the choices with the specified function. */
  public <R> Choice<R> transform(Function<? super T, R> function) {
    checkNotNull(function);
    Choice<T> thisChoice = this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `core/src/main/java/com/google/errorprone/refaster/Choice.java`
#### Snippet
```java
   * Returns a choice of the optional value, if it is present, or the empty choice if it is absent.
   */
  public static <T> Choice<T> fromOptional(Optional<T> optional) {
    return optional.isPresent() ? of(optional.get()) : Choice.<T>none();
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `core/src/main/java/com/google/errorprone/refaster/Choice.java`
#### Snippet
```java

      @Override
      public <R> Choice<R> transform(Function<? super T, R> function) {
        return of(function.apply(t));
      }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Optional`
in `core/src/main/java/com/google/errorprone/refaster/Choice.java`
#### Snippet
```java
   * <p>The function may be applied lazily or immediately, at the discretion of the implementation.
   */
  public <R> Choice<R> thenOption(Function<? super T, Optional<R>> function) {
    checkNotNull(function);
    Choice<T> thisChoice = this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Optional`
in `core/src/main/java/com/google/errorprone/refaster/Choice.java`
#### Snippet
```java

      @Override
      public <R> Choice<R> thenOption(Function<? super T, Optional<R>> function) {
        return fromOptional(function.apply(t));
      }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Choice`
in `core/src/main/java/com/google/errorprone/refaster/Choice.java`
#### Snippet
```java

  /** Returns a choice between any of the options from any of the specified choices. */
  public static <T> Choice<T> any(Collection<Choice<T>> choices) {
    return from(choices).thenChoose(Functions.<Choice<T>>identity());
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `core/src/main/java/com/google/errorprone/refaster/Choice.java`
#### Snippet
```java

  /** Returns a choice of the options from this {@code Choice} or from {@code other}. */
  public Choice<T> or(Choice<T> other) {
    checkNotNull(other);
    if (other == none()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Choice`
in `core/src/main/java/com/google/errorprone/refaster/Choice.java`
#### Snippet
```java
   * <p>This is the monadic bind for {@code Choice}.
   */
  public <R> Choice<R> thenChoose(Function<? super T, Choice<R>> function) {
    checkNotNull(function);
    if (Thread.interrupted()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Choice`
in `core/src/main/java/com/google/errorprone/refaster/Choice.java`
#### Snippet
```java

      @Override
      public <R> Choice<R> thenChoose(Function<? super T, Choice<R>> function) {
        return function.apply(t);
      }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TreePath`
in `core/src/main/java/com/google/errorprone/bugpatterns/DifferentNameButSame.java`
#### Snippet
```java
   */
  private static boolean visibleAndReferToSameThing(
      String name, ImmutableList<TreePath> locations, VisitorState state) {
    String firstComponent = name.contains(".") ? name.substring(0, name.indexOf(".")) : name;
    Set<Symbol> idents = new HashSet<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MethodSymbol`
in `core/src/main/java/com/google/errorprone/bugpatterns/CompileTimeConstantChecker.java`
#### Snippet
```java
      VisitorState state,
      List<Integer> compileTimeConstantAnnotationIndexes,
      Iterable<MethodSymbol> superMethods) {
    for (Symbol.MethodSymbol superMethod : superMethods) {
      for (Integer index : compileTimeConstantAnnotationIndexes) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VarSymbol`
in `core/src/main/java/com/google/errorprone/bugpatterns/CompileTimeConstantChecker.java`
#### Snippet
```java
  }

  private static List<Integer> getAnnotatedParams(List<VarSymbol> params, VisitorState state) {
    List<Integer> compileTimeConstantAnnotationIndexes = new ArrayList<>();
    for (int i = 0; i < params.size(); i++) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Symbol.VarSymbol`
in `core/src/main/java/com/google/errorprone/bugpatterns/LoopConditionChecker.java`
#### Snippet
```java
    private final ImmutableSet.Builder<Symbol.VarSymbol> conditionVars;

    public LoopConditionVisitor(ImmutableSet.Builder<Symbol.VarSymbol> conditionVars) {
      this.conditionVars = conditionVars;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Tree`
in `core/src/main/java/com/google/errorprone/bugpatterns/LoopConditionChecker.java`
#### Snippet
```java
  }

  private Description check(ExpressionTree condition, ImmutableList<Tree> loopBodyTrees) {
    ImmutableSet<Symbol.VarSymbol> conditionVars = LoopConditionVisitor.scan(condition);
    if (conditionVars.isEmpty()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Tree`
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableMemberCollection.java`
#### Snippet
```java
    }

    private boolean areAllInitImmutable(ImmutableSet<Tree> initTrees, VisitorState state) {
      return initTrees.stream()
          .allMatch(initTree -> isSameType(type().immutableType()).matches(initTree, state));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Tree`
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableMemberCollection.java`
#### Snippet
```java
    }

    private SuggestedFix getFix(ImmutableSet<Tree> initTrees, VisitorState state) {
      SuggestedFix.Builder fixBuilder =
          SuggestedFix.builder()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Tree`
in `core/src/main/java/com/google/errorprone/bugpatterns/AssertThrowsUtils.java`
#### Snippet
```java
      TryTree tryTree,
      List<? extends StatementTree> throwingStatements,
      Optional<Tree> failureMessage,
      VisitorState state) {
    List<? extends CatchTree> catchTrees = tryTree.getCatches();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `core/src/main/java/com/google/errorprone/bugpatterns/JUnit3FloatingPointComparisonWithoutDelta.java`
#### Snippet
```java

  /** Gets the text for the delta argument to be added. */
  private static String getDeltaArgument(VisitorState state, List<Type> argumentTypes) {
    Type firstType = argumentTypes.get(0);
    Type secondType = argumentTypes.get(1);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `core/src/main/java/com/google/errorprone/bugpatterns/JUnit3FloatingPointComparisonWithoutDelta.java`
#### Snippet
```java
   * Determines if the invocation can be safely converted to JUnit 4 based on its argument types.
   */
  private static boolean canBeConvertedToJUnit4(VisitorState state, List<Type> argumentTypes) {
    // Delta argument is used.
    if (argumentTypes.size() > 2) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `core/src/main/java/com/google/errorprone/bugpatterns/JUnit3FloatingPointComparisonWithoutDelta.java`
#### Snippet
```java

  /** Removes the message argument if it is present. */
  private static void removeMessageArgumentIfPresent(VisitorState state, List<Type> argumentTypes) {
    if (argumentTypes.size() == 2) {
      return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TreePath`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryBoxedVariable.java`
#### Snippet
```java

  private static void fixCastingInvocations(
      List<TreePath> castMethodInvocations, SuggestedFix.Builder fixBuilder, VisitorState state) {
    for (TreePath castPath : castMethodInvocations) {
      MethodInvocationTree castInvocation = (MethodInvocationTree) castPath.getLeaf();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TreePath`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryBoxedVariable.java`
#### Snippet
```java

  private static void fixNullCheckInvocations(
      List<TreePath> nullCheckInvocations, SuggestedFix.Builder fixBuilder, VisitorState state) {
    for (TreePath pathForTree : nullCheckInvocations) {
      checkArgument(pathForTree.getLeaf() instanceof MethodInvocationTree);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MethodInvocationTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryBoxedVariable.java`
#### Snippet
```java

  private static void fixMethodInvocations(
      List<MethodInvocationTree> simpleMethodInvocations,
      SuggestedFix.Builder fixBuilder,
      VisitorState state) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Symbol`
in `core/src/main/java/com/google/errorprone/bugpatterns/TypeNameShadowing.java`
#### Snippet
```java
  }

  private static String buildMessage(List<Symbol> shadowedTypes) {
    return "Found type parameters shadowing other declared types:\n\t"
        + shadowedTypes.stream()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AttrContext`
in `core/src/main/java/com/google/errorprone/bugpatterns/TypeNameShadowing.java`
#### Snippet
```java
   */
  private static Iterable<Symbol> typesInEnclosingScope(
      Env<AttrContext> env, PackageSymbol javaLang) {
    // Collect all visible type names declared in this source file by ascending lexical scopes,
    // collecting all members, filtering to keep type symbols and exclude TypeVariableSymbols
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super MethodInvocationTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMockChecker.java`
#### Snippet
```java
   */
  public static TypeExtractor<MethodInvocationTree> extractFirstArg(
      Matcher<MethodInvocationTree> m) {
    return (tree, state) -> {
      if (m.matches(tree, state)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super VariableTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMockChecker.java`
#### Snippet
```java

  public AbstractMockChecker(
      TypeExtractor<VariableTree> varExtractor,
      TypeExtractor<MethodInvocationTree> methodExtractor,
      Class<T> annotationClass,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super MethodInvocationTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMockChecker.java`
#### Snippet
```java
  public AbstractMockChecker(
      TypeExtractor<VariableTree> varExtractor,
      TypeExtractor<MethodInvocationTree> methodExtractor,
      Class<T> annotationClass,
      Function<T, String> getValueFunction) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMockChecker.java`
#### Snippet
```java
      TypeExtractor<VariableTree> varExtractor,
      TypeExtractor<MethodInvocationTree> methodExtractor,
      Class<T> annotationClass,
      Function<T, String> getValueFunction) {
    this.varExtractor = varExtractor;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMockChecker.java`
#### Snippet
```java
      TypeExtractor<MethodInvocationTree> methodExtractor,
      Class<T> annotationClass,
      Function<T, String> getValueFunction) {
    this.varExtractor = varExtractor;
    this.methodExtractor = methodExtractor;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super MethodInvocationTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMockChecker.java`
#### Snippet
```java
   */
  public static TypeExtractor<MethodInvocationTree> extractClassArg(
      Matcher<MethodInvocationTree> m) {
    return (tree, state) -> {
      if (m.matches(tree, state)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMockChecker.java`
#### Snippet
```java
   * {@link ASTHelpers#getType(Tree)}.
   */
  public static <T extends Tree> TypeExtractor<T> extractType(Matcher<T> m) {
    return (tree, state) -> {
      if (m.matches(tree, state)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMockChecker.java`
#### Snippet
```java
     *     match, falls back to {@code other.extract(t, s)}.
     */
    default TypeExtractor<T> or(TypeExtractor<T> other) {
      return (tree, state) ->
          TypeExtractor.this
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Modifier`
in `core/src/main/java/com/google/errorprone/bugpatterns/RequiredModifiersChecker.java`
#### Snippet
```java
  }

  private static void getModifiers(Collection<Modifier> modifiers, Attribute attribute) {
    class Visitor extends SimpleAnnotationValueVisitor8<Void, Void> {
      @Override
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/NonAtomicVolatileUpdate.java`
#### Snippet
```java

  /** Extracts the expression from a UnaryTree and applies a matcher to it. */
  private static Matcher<UnaryTree> expressionFromUnaryTree(Matcher<ExpressionTree> exprMatcher) {
    return new Matcher<UnaryTree>() {
      @Override
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/NonAtomicVolatileUpdate.java`
#### Snippet
```java
  /** Extracts the variable from an AssignmentTree and applies a matcher to it. */
  private static Matcher<AssignmentTree> variableFromAssignmentTree(
      Matcher<ExpressionTree> exprMatcher) {
    return new Matcher<AssignmentTree>() {
      @Override
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/NonAtomicVolatileUpdate.java`
#### Snippet
```java
  /** Extracts the variable from a CompoundAssignmentTree and applies a matcher to it. */
  private static Matcher<CompoundAssignmentTree> variableFromCompoundAssignmentTree(
      Matcher<ExpressionTree> exprMatcher) {
    return new Matcher<CompoundAssignmentTree>() {
      @Override
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SuggestedFix`
in `core/src/main/java/com/google/errorprone/bugpatterns/DeduplicateConstants.java`
#### Snippet
```java
  }

  private static SuggestedFix mergeFix(Collection<SuggestedFix> fixes) {
    SuggestedFix.Builder fix = SuggestedFix.builder();
    fixes.forEach(fix::merge);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CatchTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/CatchFail.java`
#### Snippet
```java

  private static Optional<Fix> rethrowFix(
      ImmutableList<CatchTree> catchBlocks, VisitorState state) {
    SuggestedFix.Builder fix = SuggestedFix.builder();
    catchBlocks.forEach(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CatchTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/CatchFail.java`
#### Snippet
```java
  // assertWithMessage("message").fail();

  Optional<Fix> deleteFix(TryTree tree, ImmutableList<CatchTree> catchBlocks, VisitorState state) {
    SuggestedFix.Builder fix = SuggestedFix.builder();
    if (tree.getFinallyBlock() != null || catchBlocks.size() < tree.getCatches().size()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AnnotationTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/JUnit4ClassAnnotationNonStatic.java`
#### Snippet
```java
  // Might be a bit overkill just in case people add @BeforeClass and @AfterClass to the same
  // method.
  private static String messageForAnnos(List<AnnotationTree> annotationTrees) {
    String annoNames =
        annotationTrees.stream()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ConstantExpression`
in `core/src/main/java/com/google/errorprone/bugpatterns/OptionalNotPresent.java`
#### Snippet
```java
    }

    private Stream<PureMethodInvocation> getMethodInvocations(Multiset<ConstantExpression> truths) {
      return truths.stream()
          .filter(truth -> truth.kind().equals(ConstantExpressionKind.PURE_METHOD))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `core/src/main/java/com/google/errorprone/bugpatterns/StronglyType.java`
#### Snippet
```java
  // TODO(b/147006492): Consider extracting a helper to find all fields that match a Matcher.
  private ImmutableMap<VarSymbol, TreePath> findPathToPotentialFields(
      VisitorState state, Set<Type> potentialTypes) {
    ImmutableMap.Builder<VarSymbol, TreePath> fields = ImmutableMap.builder();
    bugChecker().new SuppressibleTreePathScanner<Void, Void>(state) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExpressionTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/StronglyType.java`
#### Snippet
```java
      TreePath variableTreePath,
      VarSymbol replacedSymbol,
      Set<ExpressionTree> invocationTrees,
      VisitorState state) {
    if (invocationTrees.stream().map(ASTHelpers::getSymbol).distinct().count() != 1) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/EqualsGetClass.java`
#### Snippet
```java
        ExpressionTree treeA,
        ExpressionTree treeB,
        Matcher<ExpressionTree> matcherA,
        Matcher<ExpressionTree> matcherB) {
      return (matcherA.matches(treeA, state) && matcherB.matches(treeB, state))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/EqualsGetClass.java`
#### Snippet
```java
        ExpressionTree treeB,
        Matcher<ExpressionTree> matcherA,
        Matcher<ExpressionTree> matcherB) {
      return (matcherA.matches(treeA, state) && matcherB.matches(treeB, state))
          || (matcherA.matches(treeB, state) && matcherB.matches(treeA, state));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FieldWithValue`
in `core/src/main/java/com/google/errorprone/bugpatterns/ProtoRedundantSet.java`
#### Snippet
```java

  private Description describe(
      ProtoField protoField, Collection<FieldWithValue> locations, VisitorState state) {
    // We flag up all duplicate sets, but only suggest a fix if the setter is given the same
    // argument (based on source code). This is to avoid the temptation to apply the fix in
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ProtoField`
in `core/src/main/java/com/google/errorprone/bugpatterns/ProtoRedundantSet.java`
#### Snippet
```java
      MethodInvocationTree method,
      String methodName,
      ListMultimap<ProtoField, FieldWithValue> setters) {
    for (FieldType fieldType : FieldType.values()) {
      FieldWithValue match = fieldType.match(methodName, method);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super FieldWithValue`
in `core/src/main/java/com/google/errorprone/bugpatterns/ProtoRedundantSet.java`
#### Snippet
```java
      MethodInvocationTree method,
      String methodName,
      ListMultimap<ProtoField, FieldWithValue> setters) {
    for (FieldType fieldType : FieldType.values()) {
      FieldWithValue match = fieldType.match(methodName, method);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super MethodTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMethodReturnsNull.java`
#### Snippet
```java
  private final Matcher<MethodTree> methodTreeMatcher;

  AbstractMethodReturnsNull(Matcher<MethodTree> methodTreeMatcher) {
    this.methodTreeMatcher = methodTreeMatcher;
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedException.java`
#### Snippet
```java
  }

  private static boolean typesEqual(List<Type> typesA, List<Type> typesB, VisitorState state) {
    return Streams.zip(
            typesA.stream(), typesB.stream(), (a, b) -> ASTHelpers.isSameType(a, b, state))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedException.java`
#### Snippet
```java
  }

  private static boolean typesEqual(List<Type> typesA, List<Type> typesB, VisitorState state) {
    return Streams.zip(
            typesA.stream(), typesB.stream(), (a, b) -> ASTHelpers.isSameType(a, b, state))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Symbol`
in `core/src/main/java/com/google/errorprone/bugpatterns/InconsistentCapitalization.java`
#### Snippet
```java
    private final Symbol classSymbol;

    private FieldScanner(ImmutableSet.Builder<Symbol> fields, Tree classTree) {
      this.fields = fields;
      this.classSymbol = ASTHelpers.getSymbol(classTree);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Symbol`
in `core/src/main/java/com/google/errorprone/bugpatterns/InconsistentCapitalization.java`
#### Snippet
```java

    private MatchingParametersScanner(
        ImmutableMap<String, Symbol> fields,
        ImmutableMap.Builder<TreePath, Symbol> matchedParameters) {
      this.fields = fields;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TreePath`
in `core/src/main/java/com/google/errorprone/bugpatterns/InconsistentCapitalization.java`
#### Snippet
```java
    private MatchingParametersScanner(
        ImmutableMap<String, Symbol> fields,
        ImmutableMap.Builder<TreePath, Symbol> matchedParameters) {
      this.fields = fields;
      this.matchedParameters = matchedParameters;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Symbol`
in `core/src/main/java/com/google/errorprone/bugpatterns/InconsistentCapitalization.java`
#### Snippet
```java
    private MatchingParametersScanner(
        ImmutableMap<String, Symbol> fields,
        ImmutableMap.Builder<TreePath, Symbol> matchedParameters) {
      this.fields = fields;
      this.matchedParameters = matchedParameters;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ErrorProneToken`
in `core/src/main/java/com/google/errorprone/bugpatterns/ParameterName.java`
#### Snippet
```java
  }

  private static boolean advanceTokens(Deque<ErrorProneToken> tokens, Range<Integer> actual) {
    while (!tokens.isEmpty() && tokens.getFirst().pos() < actual.lowerEndpoint()) {
      tokens.removeFirst();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ErrorProneToken`
in `core/src/main/java/com/google/errorprone/bugpatterns/ParameterName.java`
#### Snippet
```java
      int offset,
      VisitorState state,
      Consumer<ErrorProneToken> consumer) {
    String source = state.getSourceCode().subSequence(offset, positions.upperEndpoint()).toString();
    Deque<ErrorProneToken> tokens =
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `core/src/main/java/com/google/errorprone/bugpatterns/JdkObsolete.java`
#### Snippet
```java

  private Description describeIfObsolete(
      @Nullable Tree tree, Iterable<Type> types, VisitorState state) {
    for (Type type : types) {
      Obsolete obsolete = OBSOLETE.get(type.asElement().getQualifiedName().toString());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ImportTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/WildcardImport.java`
#### Snippet
```java
  /** Creates a {@link Fix} that replaces wildcard imports. */
  static Fix createFix(
      ImmutableList<ImportTree> wildcardImports,
      Set<TypeToImport> typesToImport,
      VisitorState state) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TypeToImport`
in `core/src/main/java/com/google/errorprone/bugpatterns/WildcardImport.java`
#### Snippet
```java
  static Fix createFix(
      ImmutableList<ImportTree> wildcardImports,
      Set<TypeToImport> typesToImport,
      VisitorState state) {
    Map<Symbol, List<TypeToImport>> toFix =
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/TruthAssertExpected.java`
#### Snippet
```java
  @Nullable
  private static ExpressionTree findReceiverMatching(
      ExpressionTree tree, VisitorState state, Matcher<ExpressionTree> matcher) {
    return streamReceivers(tree).filter(t -> matcher.matches(t, state)).findFirst().orElse(null);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Tree`
in `core/src/main/java/com/google/errorprone/bugpatterns/PreferredInterfaceType.java`
#### Snippet
```java

  private void reportFixes(
      Map<Symbol, Tree> fixableTypes,
      ListMultimap<Symbol, Type> symbolsToType,
      VisitorState state) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ReturnTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/MixedMutabilityReturnType.java`
#### Snippet
```java

  private static ImmutableList<SuggestedFix> generateFixes(
      List<ReturnTree> returnTrees, TreePath methodTree, VisitorState state) {
    SuggestedFix.Builder simpleFix = SuggestedFix.builder();
    SuggestedFix.Builder fixWithBuilders = SuggestedFix.builder();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Commented`
in `core/src/main/java/com/google/errorprone/bugpatterns/ParameterComment.java`
#### Snippet
```java

  private Description matchNewClassOrMethodInvocation(
      MethodSymbol symbol, ImmutableList<Commented<ExpressionTree>> arguments, Tree tree) {
    if (symbol.getParameters().isEmpty()) {
      return NO_MATCH;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VarSymbol`
in `core/src/main/java/com/google/errorprone/bugpatterns/HidingField.java`
#### Snippet
```java
  private void checkForHiddenFields(
      List<VariableTree> originalClassMembers,
      Map<Name, VarSymbol> parentMembers,
      Name parentClassName,
      ClassTree classTree,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `core/src/main/java/com/google/errorprone/bugpatterns/InterruptedExceptionSwallowed.java`
#### Snippet
```java

  private static SuggestedFix narrowExceptionTypes(
      MethodTree tree, Set<Type> exceptions, VisitorState state) {
    SuggestedFix.Builder fix = SuggestedFix.builder();
    fix.replace(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MemberWithIndex`
in `core/src/main/java/com/google/errorprone/bugpatterns/UngroupedOverloads.java`
#### Snippet
```java
  private static String createMessage(
      MethodTree tree,
      ImmutableList<MemberWithIndex> overloads,
      Map<MemberWithIndex, Integer> groups,
      LineMap lineMap,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super IdentifierTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/ModifiedButNotUsed.java`
#### Snippet
```java
    private boolean isUsed = false;

    private UnusedScanner(Symbol symbol, VisitorState state, Matcher<IdentifierTree> matcher) {
      this.symbol = symbol;
      this.state = state;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TreePath`
in `core/src/main/java/com/google/errorprone/bugpatterns/ModifiedButNotUsed.java`
#### Snippet
```java
    }

    private ImmutableList<SuggestedFix> buildFixes(List<TreePath> removals) {
      boolean encounteredSideEffects = false;
      SuggestedFix.Builder withoutSideEffects =
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ClassSymbol`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedMethod.java`
#### Snippet
```java

      private boolean isMethodSymbolEligibleForChecking(
          MethodTree tree, Set<ClassSymbol> classesMadeVisible) {
        if (exemptedByName(tree.getName())) {
          return false;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TreePath`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedMethod.java`
#### Snippet
```java
  }

  private void fixNonConstructors(Iterable<TreePath> unusedPaths, VisitorState state) {
    for (TreePath unusedPath : unusedPaths) {
      Tree unusedTree = unusedPath.getLeaf();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super MethodSymbol`
in `core/src/main/java/com/google/errorprone/bugpatterns/BadAnnotationImplementation.java`
#### Snippet
```java
  @Nullable
  private static MethodSymbol getMatchingMethod(
      Type type, Name name, Predicate<MethodSymbol> predicate) {
    Scope scope = type.tsym.members();
    for (Symbol sym : scope.getSymbolsByName(name)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ErrorProneToken`
in `core/src/main/java/com/google/errorprone/bugpatterns/BooleanParameter.java`
#### Snippet
```java

  private void checkParameter(
      VarSymbol paramSym, ExpressionTree a, Deque<ErrorProneToken> tokens, VisitorState state) {
    if (!isBooleanLiteral(a)) {
      return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ImmutableSet`
in `core/src/main/java/com/google/errorprone/bugpatterns/InconsistentHashCode.java`
#### Snippet
```java
        VisitorState state,
        ClassSymbol classSymbol,
        Map<MethodSymbol, ImmutableSet<Symbol>> knownMethods,
        Matcher<ExpressionTree> acceptableMethods) {
      this.state = state;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/InconsistentHashCode.java`
#### Snippet
```java
        ClassSymbol classSymbol,
        Map<MethodSymbol, ImmutableSet<Symbol>> knownMethods,
        Matcher<ExpressionTree> acceptableMethods) {
      this.state = state;
      this.classSymbol = classSymbol;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JCVariableDecl`
in `core/src/main/java/com/google/errorprone/bugpatterns/ReplacementVariableFinder.java`
#### Snippet
```java

  private static ImmutableList<Fix> buildValidReplacements(
      Multimap<Integer, JCVariableDecl> potentialReplacements,
      Function<JCVariableDecl, Fix> replacementFunction) {
    if (potentialReplacements.isEmpty()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super JCVariableDecl`
in `core/src/main/java/com/google/errorprone/bugpatterns/ReplacementVariableFinder.java`
#### Snippet
```java
  private static ImmutableList<Fix> buildValidReplacements(
      Multimap<Integer, JCVariableDecl> potentialReplacements,
      Function<JCVariableDecl, Fix> replacementFunction) {
    if (potentialReplacements.isEmpty()) {
      return ImmutableList.of();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Fix`
in `core/src/main/java/com/google/errorprone/bugpatterns/ReplacementVariableFinder.java`
#### Snippet
```java
  private static ImmutableList<Fix> buildValidReplacements(
      Multimap<Integer, JCVariableDecl> potentialReplacements,
      Function<JCVariableDecl, Fix> replacementFunction) {
    if (potentialReplacements.isEmpty()) {
      return ImmutableList.of();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super JCVariableDecl`
in `core/src/main/java/com/google/errorprone/bugpatterns/ReplacementVariableFinder.java`
#### Snippet
```java
   */
  public static ImmutableList<Fix> fixesByReplacingExpressionWithMethodParameter(
      ExpressionTree input, Predicate<JCVariableDecl> validParameterPredicate, VisitorState state) {
    Preconditions.checkState(input.getKind() == IDENTIFIER || input.getKind() == MEMBER_SELECT);

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super JCVariableDecl`
in `core/src/main/java/com/google/errorprone/bugpatterns/ReplacementVariableFinder.java`
#### Snippet
```java
   */
  public static ImmutableList<Fix> fixesByReplacingExpressionWithLocallyDeclaredField(
      ExpressionTree input, Predicate<JCVariableDecl> validFieldPredicate, VisitorState state) {
    Preconditions.checkState(input.getKind() == IDENTIFIER || input.getKind() == MEMBER_SELECT);

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Fix`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractToString.java`
#### Snippet
```java
  }

  private Description maybeFix(Tree tree, VisitorState state, Type matchedType, Optional<Fix> fix) {
    Description.Builder description = buildDescription(tree);
    fix.ifPresent(description::addFix);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TreePath`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedVariable.java`
#### Snippet
```java

  private static ImmutableList<SuggestedFix> buildUnusedVarFixes(
      Symbol varSymbol, List<TreePath> usagePaths, VisitorState state) {
    // Don't suggest a fix for fields annotated @Inject: we can warn on them, but they *could* be
    // used outside the class.
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends UnusedSpec`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedVariable.java`
#### Snippet
```java
  private static SuggestedFix makeAssignmentDeclaration(
      Symbol unusedSymbol,
      Collection<UnusedSpec> specs,
      ImmutableList<TreePath> allUsageSites,
      VisitorState state) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TreePath`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedVariable.java`
#### Snippet
```java
      Symbol unusedSymbol,
      Collection<UnusedSpec> specs,
      ImmutableList<TreePath> allUsageSites,
      VisitorState state) {
    if (unusedSymbol.getKind() != ElementKind.LOCAL_VARIABLE) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TreePath`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedVariable.java`
#### Snippet
```java

  private static ImmutableList<SuggestedFix> buildUnusedParameterFixes(
      Symbol varSymbol, List<TreePath> usagePaths, VisitorState state) {
    MethodSymbol methodSymbol = (MethodSymbol) varSymbol.owner;
    int index = methodSymbol.params.indexOf(varSymbol);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Symbol`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedVariable.java`
#### Snippet
```java

    private FilterUsedVariables(
        Map<Symbol, TreePath> unusedElements, ListMultimap<Symbol, TreePath> usageSites) {
      this.unusedElements = unusedElements;
      this.usageSites = usageSites;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TreePath`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedVariable.java`
#### Snippet
```java

    private FilterUsedVariables(
        Map<Symbol, TreePath> unusedElements, ListMultimap<Symbol, TreePath> usageSites) {
      this.unusedElements = unusedElements;
      this.usageSites = usageSites;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Symbol`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedVariable.java`
#### Snippet
```java

    private FilterUsedVariables(
        Map<Symbol, TreePath> unusedElements, ListMultimap<Symbol, TreePath> usageSites) {
      this.unusedElements = unusedElements;
      this.usageSites = usageSites;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MethodTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/MethodCanBeStatic.java`
#### Snippet
```java
      @Override
      public Description report(
          Set<MethodTree> affectedTrees, SuggestedFix fix, VisitorState state, BugChecker checker) {
        for (MethodTree tree : affectedTrees) {
          state.reportMatch(checker.describeMatch(tree.getModifiers(), fix));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MethodTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/MethodCanBeStatic.java`
#### Snippet
```java
      @Override
      public Description report(
          Set<MethodTree> affectedTrees, SuggestedFix fix, VisitorState state, BugChecker checker) {
        return affectedTrees.stream()
            .min(Comparator.comparingInt(t -> getStartPosition(t)))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `core/src/main/java/com/google/errorprone/bugpatterns/MemoizeConstantVisitorStateLookups.java`
#### Snippet
```java
      VisitorState state,
      SuggestedFix.Builder fix,
      Consumer<String> memberConsumer,
      String argument,
      Name methodName,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `core/src/main/java/com/google/errorprone/bugpatterns/MemoizeConstantVisitorStateLookups.java`
#### Snippet
```java
      Name methodName,
      List<CallSite> instances,
      BiFunction<String, String, String> namingStrategy) {

    CallSite prototype = bestCallsite(instances);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `core/src/main/java/com/google/errorprone/bugpatterns/MemoizeConstantVisitorStateLookups.java`
#### Snippet
```java
      Name methodName,
      List<CallSite> instances,
      BiFunction<String, String, String> namingStrategy) {

    CallSite prototype = bestCallsite(instances);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JCStatement`
in `core/src/main/java/com/google/errorprone/refaster/BlockTemplate.java`
#### Snippet
```java
   * newlines.
   */
  private static String printStatements(Context context, Iterable<JCStatement> statements) {
    StringWriter writer = new StringWriter();
    try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Modifier`
in `core/src/main/java/com/google/errorprone/bugpatterns/IncompatibleModifiersChecker.java`
#### Snippet
```java
  }

  private static void getModifiers(Collection<Modifier> modifiers, Attribute attribute) {
    class Visitor extends SimpleAnnotationValueVisitor8<Void, Void> {
      @Override
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AnnotationTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/AnnotationPosition.java`
#### Snippet
```java

  private static boolean isOrderingIsCorrect(
      List<AnnotationTree> shouldBeBefore, List<AnnotationTree> shouldBeAfter) {
    if (shouldBeBefore.isEmpty() || shouldBeAfter.isEmpty()) {
      return true;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AnnotationTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/AnnotationPosition.java`
#### Snippet
```java

  private static boolean isOrderingIsCorrect(
      List<AnnotationTree> shouldBeBefore, List<AnnotationTree> shouldBeAfter) {
    if (shouldBeBefore.isEmpty() || shouldBeAfter.isEmpty()) {
      return true;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AnnotationTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/AnnotationPosition.java`
#### Snippet
```java
  }

  private static String joinSource(VisitorState state, Iterable<AnnotationTree> moveBefore) {
    return stream(moveBefore).map(state::getSourceForNode).collect(joining(" "));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ErrorProneToken`
in `core/src/main/java/com/google/errorprone/bugpatterns/AnnotationPosition.java`
#### Snippet
```java

  @Nullable
  private static Comment findOrphanedJavadoc(Name name, List<ErrorProneToken> tokens) {
    for (ErrorProneToken token : tokens) {
      for (Comment comment : token.comments()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AnnotationTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/AnnotationPosition.java`
#### Snippet
```java
  }

  private static ImmutableList<String> annotationNames(List<AnnotationTree> annotations) {
    return annotations.stream()
        .map(ASTHelpers::getSymbol)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JCAnnotation`
in `core/src/main/java/com/google/errorprone/bugpatterns/TestExceptionChecker.java`
#### Snippet
```java
  @Nullable
  private static JCExpression deleteExpectedException(
      SuggestedFix.Builder fix, List<JCAnnotation> annotations, VisitorState state) {
    Type testAnnotation = ORG_JUNIT_TEST.get(state);
    for (JCAnnotation annotationTree : annotations) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/MissingFail.java`
#### Snippet
```java
    private final Matcher<ExpressionTree> methodSelectMatcher;

    private UnequalIntegerLiteralMatcher(Matcher<ExpressionTree> methodSelectMatcher) {
      this.methodSelectMatcher = methodSelectMatcher;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ClassTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/MissingFail.java`
#### Snippet
```java
  }

  private static boolean isInClass(TryTree tree, VisitorState state, Matcher<ClassTree> classTree) {
    return Matchers.enclosingNode(toType(ClassTree.class, classTree)).matches(tree, state);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Tree`
in `core/src/main/java/com/google/errorprone/bugpatterns/MissingFail.java`
#### Snippet
```java

  private static boolean anyCatchBlockMatches(
      TryTree tree, VisitorState state, Matcher<Tree> matcher) {
    for (CatchTree catchTree : tree.getCatches()) {
      if (matcher.matches(catchTree.getBlock(), state)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MethodInvocationTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/CanonicalDuration.java`
#### Snippet
```java

  private Description handleAllZeros(
      VisitorState state, Api api, List<MethodInvocationTree> allInvocationsInParentExpression) {
    switch (api) {
      case JODA:
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VarSymbol`
in `core/src/main/java/com/google/errorprone/bugpatterns/time/TimeUnitMismatch.java`
#### Snippet
```java

  private boolean checkAll(
      List<VarSymbol> formals, List<? extends ExpressionTree> actuals, VisitorState state) {
    if (formals.size() != actuals.size()) {
      // varargs? weird usages of inner classes? TODO(cpovirk): Handle those correctly.
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `core/src/main/java/com/google/errorprone/bugpatterns/TypeCompatibilityUtils.java`
#### Snippet
```java
      Type rightType,
      Type superType,
      Set<Type> previousLeftTypes,
      Set<Type> previousRightTypes,
      VisitorState state) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `core/src/main/java/com/google/errorprone/bugpatterns/TypeCompatibilityUtils.java`
#### Snippet
```java
      Type superType,
      Set<Type> previousLeftTypes,
      Set<Type> previousRightTypes,
      VisitorState state) {
    List<Type> leftGenericTypes = typeArgsAsSuper(leftType, superType, state);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StatementTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/ExpectedExceptionChecker.java`
#### Snippet
```java
      Type exceptionType,
      List<String> newAsserts,
      List<StatementTree> throwingStatements,
      VisitorState state) {
    if (throwingStatements.isEmpty()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Tree`
in `core/src/main/java/com/google/errorprone/bugpatterns/ExpectedExceptionChecker.java`
#### Snippet
```java
  private static Fix buildFix(
      VisitorState state,
      List<Tree> expectations,
      @Nullable StatementTree failure,
      List<StatementTree> suffix) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/time/NearbyCallers.java`
#### Snippet
```java
  static boolean containsCallToSameReceiverNearby(
      MethodInvocationTree primaryMethod,
      Matcher<ExpressionTree> secondaryMethodMatcher,
      VisitorState state,
      boolean checkProtoChains) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Integer`
in `core/src/main/java/com/google/errorprone/bugpatterns/time/DateChecker.java`
#### Snippet
```java

  private static void checkBounds(
      ExpressionTree tree, String type, Range<Integer> range, List<String> errors) {
    Integer value = ASTHelpers.constValue(tree, Integer.class);
    if (value != null && !range.contains(value)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `core/src/main/java/com/google/errorprone/bugpatterns/time/DateChecker.java`
#### Snippet
```java

  private static void checkBounds(
      ExpressionTree tree, String type, Range<Integer> range, List<String> errors) {
    Integer value = ASTHelpers.constValue(tree, Integer.class);
    if (value != null && !range.contains(value)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super MethodSymbol`
in `core/src/main/java/com/google/errorprone/bugpatterns/time/PreferJavaTimeOverload.java`
#### Snippet
```java
  // Adapted from ASTHelpers.findMatchingMethods(); but this short-circuits
  private static boolean hasMatchingMethods(
      Name name, Predicate<MethodSymbol> predicate, Type startClass, Types types) {
    Predicate<Symbol> matchesMethodPredicate =
        sym -> sym instanceof MethodSymbol && predicate.test((MethodSymbol) sym);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AnnotationTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/QualifierOrScopeOnInjectMethod.java`
#### Snippet
```java
  }

  private static void deleteAll(List<AnnotationTree> scopes, SuggestedFix.Builder fixBuilder) {
    scopes.forEach(fixBuilder::delete);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AnnotationTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/MisplacedScopeAnnotations.java`
#### Snippet
```java
  }

  private Description deleteAll(List<AnnotationTree> scopeAnnotations) {
    SuggestedFix.Builder fixBuilder = SuggestedFix.builder();
    scopeAnnotations.forEach(fixBuilder::delete);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VariableTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/guice/AssistedParameters.java`
#### Snippet
```java
  // determine which parameters are conflicting with each other.
  private static ListMultimap<Type, VariableTree> partitionParametersByType(
      List<VariableTree> parameters, VisitorState state) {

    Types types = state.getTypes();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ConflictResult`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/guice/AssistedParameters.java`
#### Snippet
```java
  }

  private static String buildErrorMessage(List<ConflictResult> conflicts) {
    StringBuilder sb =
        new StringBuilder(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super MethodTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/android/FragmentInjection.java`
#### Snippet
```java
  @Nullable
  private static MethodTree getMethod(
      Matcher<MethodTree> methodMatcher, ClassTree classTree, VisitorState state) {
    for (Tree member : classTree.getMembers()) {
      if (member instanceof MethodTree) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Fix`
in `core/src/main/java/com/google/errorprone/bugpatterns/flogger/FloggerWithCause.java`
#### Snippet
```java
  }

  private Description getDescription(MethodInvocationTree tree, List<Fix> fixes) {
    Description.Builder description = buildDescription(tree);
    for (Fix fix : fixes) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavadocTag`
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/InvalidBlockTag.java`
#### Snippet
```java

    private InvalidTagChecker(
        VisitorState state, ImmutableSet<JavadocTag> validTags, ImmutableSet<String> parameters) {
      this.state = state;
      this.validTags = validTags;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ErrorProneToken`
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/Validator.java`
#### Snippet
```java
      ErrorProneToken first,
      ErrorProneToken second,
      Predicate<ErrorProneToken> guard,
      Function<ErrorProneToken, T> extractor) {
    return guard.test(first) && !extractor.apply(first).equals(extractor.apply(second));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ErrorProneToken`
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/Validator.java`
#### Snippet
```java
      ErrorProneToken second,
      Predicate<ErrorProneToken> guard,
      Function<ErrorProneToken, T> extractor) {
    return guard.test(first) && !extractor.apply(first).equals(extractor.apply(second));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Integer`
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
    private EntityChecker(
        VisitorState state,
        RangeSet<Integer> generics,
        RangeSet<Integer> preTags,
        RangeSet<Integer> emittedFixes) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullArgumentForNonNullParameter.java`
#### Snippet
```java

  private static boolean isParameterOfMethodOnType(
      VarSymbol sym, Supplier<Type> typeSupplier, VisitorState state) {
    Type target = typeSupplier.get(state);
    return target != null && state.getTypes().isSameType(sym.enclClass().type, target);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JCExpression`
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/InlineMeData.java`
#### Snippet
```java

    public QualifyingTreeCopier(
        VisitorState state, IdentityHashMap<IdentifierTree, JCExpression> qualifications) {
      super(state.getTreeMaker());
      this.state = state;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MethodTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/overloading/InconsistentOverloads.java`
#### Snippet
```java
  }

  private static ImmutableList<MethodTree> sortedByArity(Iterable<MethodTree> methodTrees) {
    return sortedCopyOf(comparingArity().thenComparing(comparingPositions()), methodTrees);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends GuardedByExpression`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/HeldLockSet.java`
#### Snippet
```java

  @CheckReturnValue
  public HeldLockSet plusAll(Collection<GuardedByExpression> locks) {
    return new HeldLockSet(this.locks.plusAll(locks));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/HeldLockAnalyzer.java`
#### Snippet
```java

    private LockOperationFinder(
        VisitorState state, Matcher<ExpressionTree> lockOperationMatcher, GuardedByFlags flags) {
      this.state = state;
      this.lockOperationMatcher = lockOperationMatcher;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Tree`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/HeldLockAnalyzer.java`
#### Snippet
```java
        VisitorState visitorState,
        LockEventListener listener,
        Predicate<Tree> isSuppressed,
        GuardedByFlags flags) {
      this.visitorState = visitorState;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Symbol`
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/Rules.java`
#### Snippet
```java

    private SimpleRule(
        String name, BiPredicate<Symbol, VisitorState> predicate, ResultUsePolicy policy) {
      this.name = name;
      this.predicate = predicate;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super VisitorState`
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/Rules.java`
#### Snippet
```java

    private SimpleRule(
        String name, BiPredicate<Symbol, VisitorState> predicate, ResultUsePolicy policy) {
      this.name = name;
      this.predicate = predicate;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super RuleScope`
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/ResultUseRule.java`
#### Snippet
```java
    /** Returns an ordered stream of policies from rules in this scope. */
    final Stream<ResultUsePolicy> policies(
        MethodSymbol method, VisitorState state, ListMultimap<RuleScope, ResultUseRule> rules) {
      List<ResultUseRule> scopeRules = rules.get(this);
      return members(method)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super RuleScope`
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/ResultUseRule.java`
#### Snippet
```java
    /** Returns an ordered stream of evaluations in this scope. */
    final Stream<Evaluation> evaluations(
        MethodSymbol method, VisitorState state, ListMultimap<RuleScope, ResultUseRule> rules) {
      List<ResultUseRule> scopeRules = rules.get(this);
      return members(method)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ParameterPair`
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/CreatesDuplicateCallHeuristic.java`
#### Snippet
```java
   */
  private static boolean anyArgumentsMatch(
      List<ParameterPair> changedPairs, List<Parameter> arguments) {
    return changedPairs.stream()
        .anyMatch(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Parameter`
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/CreatesDuplicateCallHeuristic.java`
#### Snippet
```java
   */
  private static boolean anyArgumentsMatch(
      List<ParameterPair> changedPairs, List<Parameter> arguments) {
    return changedPairs.stream()
        .anyMatch(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VarSymbol`
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/ExternalCanIgnoreReturnValue.java`
#### Snippet
```java

  private static boolean methodParametersMatch(
      ImmutableList<String> parameters, List<VarSymbol> methodParams, Types types) {
    return Iterables.elementsEqual(
        parameters,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends VarSymbol`
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/ExternalCanIgnoreReturnValue.java`
#### Snippet
```java
  }

  private static String paramsString(Types types, List<VarSymbol> params) {
    if (params.isEmpty()) {
      return "";
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SuggestedFix`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableAnalysis.java`
#### Snippet
```java

    @CheckReturnValue
    default Description report(Tree tree, Violation info, Optional<SuggestedFix> suggestedFix) {
      Description.Builder description = describe(tree, info);
      suggestedFix.ifPresent(description::addFix);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ClassTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableAnalysis.java`
#### Snippet
```java
   */
  Violation areFieldsImmutable(
      Optional<ClassTree> tree,
      ImmutableSet<String> immutableTyParams,
      ClassType classType,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Tree`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableAnalysis.java`
#### Snippet
```java
  /** Check a single field for immutability. */
  Violation isFieldImmutable(
      Optional<Tree> tree,
      ImmutableSet<String> immutableTyParams,
      ClassSymbol classSym,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super RequiredType`
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/IncompatibleArgumentType.java`
#### Snippet
```java
      Type calledMethodType,
      Type calledReceiverType,
      List<RequiredType> argumentTypeRequirements,
      VisitorState state) {
    boolean foundAnyTypeToEnforce = false;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends RequiredType`
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/IncompatibleArgumentType.java`
#### Snippet
```java
  private void reportAnyViolations(
      List<? extends ExpressionTree> arguments,
      List<RequiredType> requiredArgumentTypes,
      VisitorState state) {
    Types types = state.getTypes();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Parameter`
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/Costs.java`
#### Snippet
```java
  private final double[][] costMatrix;

  Costs(ImmutableList<Parameter> formals, ImmutableList<Parameter> actuals) {
    this.formals = formals;
    this.actuals = actuals;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Parameter`
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/Costs.java`
#### Snippet
```java
  private final double[][] costMatrix;

  Costs(ImmutableList<Parameter> formals, ImmutableList<Parameter> actuals) {
    this.formals = formals;
    this.actuals = actuals;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ClassTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafety.java`
#### Snippet
```java
  /** Returns an enclosing instance for the specified type if it is thread-safe. */
  @Nullable
  public Type mutableEnclosingInstance(Optional<ClassTree> tree, ClassType type) {
    if (tree.isPresent()
        && !CanBeStaticAnalyzer.referencesOuter(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafety.java`
#### Snippet
```java
  /** Checks that any thread-safe type parameters are instantiated with thread-safe types. */
  public Violation checkInstantiation(
      TypeVariableSymbol typeParameter, Collection<Type> instantiations) {
    if (!hasThreadSafeTypeParameterAnnotation(typeParameter)) {
      return Violation.absent();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TypeVariableSymbol`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafety.java`
#### Snippet
```java

  public Violation checkInstantiation(
      Collection<TypeVariableSymbol> typeParameters, Collection<Type> typeArguments) {
    return Streams.zip(
            typeParameters.stream(),
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafety.java`
#### Snippet
```java

  public Violation checkInstantiation(
      Collection<TypeVariableSymbol> typeParameters, Collection<Type> typeArguments) {
    return Streams.zip(
            typeParameters.stream(),
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AppliedFix`
in `check_api/src/main/java/com/google/errorprone/JavacErrorDescriptionListener.java`
#### Snippet
```java
  }

  private static String messageForFixes(Description description, List<AppliedFix> appliedFixes) {
    StringBuilder messageBuilder = new StringBuilder(description.getMessage());
    boolean first = true;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super BugPatternInstance`
in `docgen/src/main/java/com/google/errorprone/BugPatternFileGenerator.java`
#### Snippet
```java
      boolean generateFrontMatter,
      String baseUrl,
      Function<BugPatternInstance, SeverityLevel> severityRemapper) {
    this.outputDir = bugpatternDir;
    this.explanationDir = explanationDir;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super URI`
in `check_api/src/main/java/com/google/errorprone/RefactoringCollection.java`
#### Snippet
```java
      Path rootPath,
      FileDestination fileDestination,
      Function<URI, RefactoringResult> postProcess,
      ImportOrganizer importOrganizer,
      Context context) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends RefactoringResult`
in `check_api/src/main/java/com/google/errorprone/RefactoringCollection.java`
#### Snippet
```java
      Path rootPath,
      FileDestination fileDestination,
      Function<URI, RefactoringResult> postProcess,
      ImportOrganizer importOrganizer,
      Context context) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Symbol`
in `check_api/src/main/java/com/google/errorprone/util/ErrorProneScope.java`
#### Snippet
```java
  }

  private Object maybeAsFilter(Predicate<Symbol> predicate) {
    if (FILTER_CLASS == null) {
      return predicate;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Comment`
in `check_api/src/main/java/com/google/errorprone/util/Comments.java`
#### Snippet
```java
    }

    void addAllCommentsToCurrentArgument(Iterable<Comment> comments, Position position) {
      currentCommentedResultBuilder.addAllComment(
          comments, currentArgumentStartPosition, offset, position);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Import`
in `check_api/src/main/java/com/google/errorprone/apply/BasicImportOrganizer.java`
#### Snippet
```java

  @Override
  public OrganizedImports organizeImports(List<Import> imports) {

    // Group into static and non-static. Each group is a set sorted by type.
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `check_api/src/main/java/com/google/errorprone/VisitorState.java`
#### Snippet
```java
    private JavacInvocationInstance provenance;

    private Cache(Supplier<T> impl) {
      this.impl = impl;
      // provenance intentionally left null-initialized
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `check_api/src/main/java/com/google/errorprone/VisitorState.java`
#### Snippet
```java

  /** Build an instance of a Type. */
  public Type getType(Type baseType, boolean isArray, List<Type> typeParams) {
    boolean isGeneric = typeParams != null && !typeParams.isEmpty();
    if (!isArray && !isGeneric) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Import`
in `check_api/src/main/java/com/google/errorprone/apply/IdeaImportOrganizer.java`
#### Snippet
```java

  @Override
  public OrganizedImports organizeImports(List<Import> imports) {
    Map<PackageType, ImmutableSortedSet<Import>> partitioned =
        imports.stream()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super VarSymbol`
in `check_api/src/main/java/com/google/errorprone/util/FindIdentifiers.java`
#### Snippet
```java
  }

  private static void addIfVariable(Tree tree, ImmutableSet.Builder<VarSymbol> setBuilder) {
    if (tree.getKind() == Kind.VARIABLE) {
      setBuilder.add(ASTHelpers.getSymbol((VariableTree) tree));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Symbol`
in `check_api/src/main/java/com/google/errorprone/util/FindIdentifiers.java`
#### Snippet
```java
   */
  private static TreeScanner<Void, Void> createFindIdentifiersScanner(
      ImmutableSet.Builder<Symbol> builder, @Nullable Tree stoppingPoint) {
    return new TreeScanner<Void, Void>() {
      @Override
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Tree`
in `check_api/src/main/java/com/google/errorprone/util/FindIdentifiers.java`
#### Snippet
```java
   */
  private static boolean lowerThan(
      TreePath path, BiPredicate<Tree, Tree> predicate1, BiPredicate<Tree, Tree> predicate2) {
    int index1 = -1;
    int index2 = -1;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Tree`
in `check_api/src/main/java/com/google/errorprone/util/FindIdentifiers.java`
#### Snippet
```java
   */
  private static boolean lowerThan(
      TreePath path, BiPredicate<Tree, Tree> predicate1, BiPredicate<Tree, Tree> predicate2) {
    int index1 = -1;
    int index2 = -1;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Tree`
in `check_api/src/main/java/com/google/errorprone/util/FindIdentifiers.java`
#### Snippet
```java
   */
  private static boolean lowerThan(
      TreePath path, BiPredicate<Tree, Tree> predicate1, BiPredicate<Tree, Tree> predicate2) {
    int index1 = -1;
    int index2 = -1;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Tree`
in `check_api/src/main/java/com/google/errorprone/util/FindIdentifiers.java`
#### Snippet
```java
   */
  private static boolean lowerThan(
      TreePath path, BiPredicate<Tree, Tree> predicate1, BiPredicate<Tree, Tree> predicate2) {
    int index1 = -1;
    int index2 = -1;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `check_api/src/main/java/com/google/errorprone/apply/ImportOrganizer.java`
#### Snippet
```java
    @CanIgnoreReturnValue
    public <K> OrganizedImports addGroups(
        Map<K, ? extends Collection<Import>> groups, Iterable<K> keys) {
      for (K key : keys) {
        Collection<Import> imports = groups.get(key);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super AnnotationValue`
in `check_api/src/main/java/com/google/errorprone/util/MoreAnnotations.java`
#### Snippet
```java

  private static <T> Stream<T> asArray(
      AnnotationValue v, Function<AnnotationValue, Optional<T>> mapper) {
    class Visitor extends SimpleAnnotationValueVisitor8<Stream<T>, Void> {
      @Override
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Import`
in `check_api/src/main/java/com/google/errorprone/apply/AndroidImportOrganizer.java`
#### Snippet
```java
  }

  private static void organizePartition(OrganizedImports organized, List<Import> imports) {

    Map<String, ImmutableSortedSet<Import>> groupedByRoot =
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Import`
in `check_api/src/main/java/com/google/errorprone/apply/AndroidImportOrganizer.java`
#### Snippet
```java

  @Override
  public OrganizedImports organizeImports(List<Import> imports) {
    OrganizedImports organized = new OrganizedImports();

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Replacement`
in `check_api/src/main/java/com/google/errorprone/fixes/AppliedFix.java`
#### Snippet
```java

    /** Get the replacements in an appropriate order to apply correctly. */
    private static ImmutableSet<Replacement> ascending(Set<Replacement> set) {
      Replacements replacements = new Replacements();
      set.forEach(replacements::add);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends BugCheckerInfo`
in `check_api/src/main/java/com/google/errorprone/scanner/ScannerSupplier.java`
#### Snippet
```java

  /** Returns a {@link ScannerSupplier} built from a list of {@link BugCheckerInfo}s. */
  public static ScannerSupplier fromBugCheckerInfos(Iterable<BugCheckerInfo> checkers) {
    ImmutableBiMap<String, BugCheckerInfo> allChecks =
        Streams.stream(checkers)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends BugCheckerInfo`
in `check_api/src/main/java/com/google/errorprone/scanner/ScannerSupplier.java`
#### Snippet
```java

  private static ImmutableMap<String, SeverityLevel> defaultSeverities(
      Iterable<BugCheckerInfo> checkers) {
    ImmutableMap.Builder<String, SeverityLevel> severities = ImmutableMap.builder();
    for (BugCheckerInfo check : checkers) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `check_api/src/main/java/com/google/errorprone/names/TermEditDistance.java`
#### Snippet
```java
   */
  public TermEditDistance(
      BiFunction<String, String, Double> editDistanceFn,
      BiFunction<Integer, Integer, Double> maxDistanceFn) {
    this.editDistanceFn = editDistanceFn;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `check_api/src/main/java/com/google/errorprone/names/TermEditDistance.java`
#### Snippet
```java
   */
  public TermEditDistance(
      BiFunction<String, String, Double> editDistanceFn,
      BiFunction<Integer, Integer, Double> maxDistanceFn) {
    this.editDistanceFn = editDistanceFn;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Integer`
in `check_api/src/main/java/com/google/errorprone/names/TermEditDistance.java`
#### Snippet
```java
  public TermEditDistance(
      BiFunction<String, String, Double> editDistanceFn,
      BiFunction<Integer, Integer, Double> maxDistanceFn) {
    this.editDistanceFn = editDistanceFn;
    this.maxDistanceFn = maxDistanceFn;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Integer`
in `check_api/src/main/java/com/google/errorprone/names/TermEditDistance.java`
#### Snippet
```java
  public TermEditDistance(
      BiFunction<String, String, Double> editDistanceFn,
      BiFunction<Integer, Integer, Double> maxDistanceFn) {
    this.editDistanceFn = editDistanceFn;
    this.maxDistanceFn = maxDistanceFn;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Matchable`
in `check_api/src/main/java/com/google/errorprone/matchers/ChildMultiMatcher.java`
#### Snippet
```java
  private static class AtLeastOneMatcher<N extends Tree> extends ListMatcher<N> {
    @Override
    public MatchResult<N> matches(List<Matchable<N>> matchables, Matcher<N> nodeMatcher) {
      ImmutableList.Builder<N> matchingTrees = ImmutableList.builder();
      for (Matchable<N> matchable : matchables) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super N`
in `check_api/src/main/java/com/google/errorprone/matchers/ChildMultiMatcher.java`
#### Snippet
```java
  private static class AtLeastOneMatcher<N extends Tree> extends ListMatcher<N> {
    @Override
    public MatchResult<N> matches(List<Matchable<N>> matchables, Matcher<N> nodeMatcher) {
      ImmutableList.Builder<N> matchingTrees = ImmutableList.builder();
      for (Matchable<N> matchable : matchables) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Matchable`
in `check_api/src/main/java/com/google/errorprone/matchers/ChildMultiMatcher.java`
#### Snippet
```java
  private static class LastMatcher<N extends Tree> extends ListMatcher<N> {
    @Override
    public MatchResult<N> matches(List<Matchable<N>> matchables, Matcher<N> nodeMatcher) {
      if (matchables.isEmpty()) {
        return MatchResult.none();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super N`
in `check_api/src/main/java/com/google/errorprone/matchers/ChildMultiMatcher.java`
#### Snippet
```java
  private static class LastMatcher<N extends Tree> extends ListMatcher<N> {
    @Override
    public MatchResult<N> matches(List<Matchable<N>> matchables, Matcher<N> nodeMatcher) {
      if (matchables.isEmpty()) {
        return MatchResult.none();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Matchable`
in `check_api/src/main/java/com/google/errorprone/matchers/ChildMultiMatcher.java`
#### Snippet
```java
  private static class AllMatcher<N extends Tree> extends ListMatcher<N> {
    @Override
    public MatchResult<N> matches(List<Matchable<N>> matchables, Matcher<N> nodeMatcher) {
      ImmutableList.Builder<N> matchingTrees = ImmutableList.builder();
      for (Matchable<N> matchable : matchables) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super N`
in `check_api/src/main/java/com/google/errorprone/matchers/ChildMultiMatcher.java`
#### Snippet
```java
  private static class AllMatcher<N extends Tree> extends ListMatcher<N> {
    @Override
    public MatchResult<N> matches(List<Matchable<N>> matchables, Matcher<N> nodeMatcher) {
      ImmutableList.Builder<N> matchingTrees = ImmutableList.builder();
      for (Matchable<N> matchable : matchables) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
      }

      private void scan(Collection<Type> from, Collection<Type> to) {
        Streams.forEachPair(from.stream(), to.stream(), this::scan);
      }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
      }

      private void scan(Collection<Type> from, Collection<Type> to) {
        Streams.forEachPair(from.stream(), to.stream(), this::scan);
      }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
      TypeSymbol base,
      Name name,
      Iterable<Type> argTypes,
      Iterable<Type> tyargTypes) {
    Resolve resolve = Resolve.instance(state.context);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
      Name name,
      Iterable<Type> argTypes,
      Iterable<Type> tyargTypes) {
    Resolve resolve = Resolve.instance(state.context);
    Enter enter = Enter.instance(state.context);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super MethodSymbol`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
   */
  public static Stream<MethodSymbol> matchingMethods(
      Name name, Predicate<MethodSymbol> predicate, Type startClass, Types types) {
    Predicate<Symbol> matchesMethodPredicate =
        sym -> sym instanceof MethodSymbol && predicate.test((MethodSymbol) sym);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Matcher`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
  @Nullable
  public static List<ExpressionTree> matchBinaryTree(
      BinaryTree tree, List<Matcher<ExpressionTree>> matchers, VisitorState state) {
    ExpressionTree leftOperand = tree.getLeftOperand();
    ExpressionTree rightOperand = tree.getRightOperand();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `check_api/src/main/java/com/google/errorprone/matchers/Asserts.java`
#### Snippet
```java
  private final Matcher<ExpressionTree> expressionMatcher;

  public Asserts(Matcher<ExpressionTree> expressionMatcher) {
    this.expressionMatcher = expressionMatcher;
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `check_api/src/main/java/com/google/errorprone/matchers/MethodInvocationArgument.java`
#### Snippet
```java
  private final Matcher<ExpressionTree> argumentMatcher;

  public MethodInvocationArgument(int position, Matcher<ExpressionTree> argumentMatcher) {
    this.position = position;
    this.argumentMatcher = argumentMatcher;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AccessPathStore`
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/AbstractNullnessPropagationTransfer.java`
#### Snippet
```java
  @CheckReturnValue
  private static TransferResult<Nullness, AccessPathStore<Nullness>> updateRegularStore(
      Nullness value, TransferInput<?, AccessPathStore<Nullness>> input, ReadableUpdates updates) {
    ResultingStore newStore = updateStore(input.getRegularStore(), updates);
    return new RegularTransferResult<>(value, newStore.store, newStore.storeChanged);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AccessPathStore`
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/AbstractNullnessPropagationTransfer.java`
#### Snippet
```java

  private static TransferResult<Nullness, AccessPathStore<Nullness>> noStoreChanges(
      Nullness value, TransferInput<?, AccessPathStore<Nullness>> input) {
    return new RegularTransferResult<>(value, input.getRegularStore());
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends BugChecker`
in `check_api/src/main/java/com/google/errorprone/scanner/ErrorProneScanner.java`
#### Snippet
```java

  private static ImmutableMap<String, BugPattern.SeverityLevel> defaultSeverities(
      Iterable<BugChecker> checkers) {
    ImmutableMap.Builder<String, BugPattern.SeverityLevel> builder = ImmutableMap.builder();
    for (BugChecker check : checkers) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends M`
in `check_api/src/main/java/com/google/errorprone/scanner/ErrorProneScanner.java`
#### Snippet
```java

  private <M extends Suppressible, T extends Tree> VisitorState processMatchers(
      Iterable<M> matchers, T tree, TreeProcessor<M, T> processingFunction, VisitorState oldState) {
    ErrorProneOptions errorProneOptions = oldState.errorProneOptions();
    // A VisitorState with our new path, but without mentioning the suppression of any matcher.
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super M`
in `check_api/src/main/java/com/google/errorprone/scanner/ErrorProneScanner.java`
#### Snippet
```java

  private <M extends Suppressible, T extends Tree> VisitorState processMatchers(
      Iterable<M> matchers, T tree, TreeProcessor<M, T> processingFunction, VisitorState oldState) {
    ErrorProneOptions errorProneOptions = oldState.errorProneOptions();
    // A VisitorState with our new path, but without mentioning the suppression of any matcher.
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Class`
in `check_api/src/main/java/com/google/errorprone/scanner/ErrorProneScanner.java`
#### Snippet
```java
  private void registerNodeTypes(
      BugChecker checker,
      ImmutableSet.Builder<Class<? extends Annotation>> customSuppressionAnnotationClasses) {
    customSuppressionAnnotationClasses.addAll(checker.customSuppressionAnnotations());

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TypeArgInferenceVar`
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
      ArrayDeque<Integer> partialSelector,
      Tree sourceNode,
      Consumer<TypeArgInferenceVar> consumer) {
    List<Type> typeArguments = type.getTypeArguments();
    for (int i = 0; i < typeArguments.size(); ++i) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TypeArgInferenceVar`
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
      @Nullable Symbol decl,
      Tree sourceNode,
      Consumer<TypeArgInferenceVar> consumer) {
    visitTypeVarRefs(
        typeVar.typeVar(),
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `check_api/src/main/java/com/google/errorprone/matchers/MethodInvocation.java`
#### Snippet
```java
   */
  public MethodInvocation(
      Matcher<ExpressionTree> methodSelectMatcher,
      MatchType matchType,
      Matcher<ExpressionTree> methodArgumentMatcher) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends LocalVariableNode`
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/NullnessPropagationTransfer.java`
#### Snippet
```java
  @Override
  public AccessPathStore<Nullness> initialStore(
      UnderlyingAST underlyingAST, List<LocalVariableNode> parameters) {
    if (parameters == null) {
      // Documentation of this method states, "parameters is only set if the underlying AST is a
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super MethodInfo`
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/NullnessPropagationTransfer.java`
#### Snippet
```java
   */
  protected NullnessPropagationTransfer(
      Nullness defaultAssumption, Predicate<MethodInfo> methodReturnsNonNull) {
    this.defaultAssumption = defaultAssumption;
    this.methodReturnsNonNull = methodReturnsNonNull;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Node`
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/NullnessPropagationTransfer.java`
#### Snippet
```java

  private static List<LocalVariableNode> variablesAtIndexes(
      Set<Integer> indexes, List<Node> arguments) {
    List<LocalVariableNode> result = new ArrayList<>();
    for (Integer i : indexes) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super MethodInfo`
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/NullnessPropagationTransfer.java`
#### Snippet
```java
   * returning methods.
   */
  public NullnessPropagationTransfer(Predicate<MethodInfo> additionalNonNullReturningMethods) {
    this(NULLABLE, new ReturnValueIsNonNull().or(additionalNonNullReturningMethods));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super BlockTree`
in `check_api/src/main/java/com/google/errorprone/matchers/Enclosing.java`
#### Snippet
```java
    private final Matcher<CaseTree> caseTreeMatcher;

    public BlockOrCase(Matcher<BlockTree> blockTreeMatcher, Matcher<CaseTree> caseTreeMatcher) {
      this.blockTreeMatcher = blockTreeMatcher;
      this.caseTreeMatcher = caseTreeMatcher;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super CaseTree`
in `check_api/src/main/java/com/google/errorprone/matchers/Enclosing.java`
#### Snippet
```java
    private final Matcher<CaseTree> caseTreeMatcher;

    public BlockOrCase(Matcher<BlockTree> blockTreeMatcher, Matcher<CaseTree> caseTreeMatcher) {
      this.blockTreeMatcher = blockTreeMatcher;
      this.caseTreeMatcher = caseTreeMatcher;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `check_api/src/main/java/com/google/errorprone/matchers/AnnotationHasArgumentWithValue.java`
#### Snippet
```java
  private final Matcher<ExpressionTree> valueMatcher;

  public AnnotationHasArgumentWithValue(String element, Matcher<ExpressionTree> valueMatcher) {
    this.element = element;
    this.valueMatcher = valueMatcher;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super IdentifierTree`
in `check_api/src/main/java/com/google/errorprone/matchers/HasIdentifier.java`
#### Snippet
```java
    private VisitorState ancestorState;

    public HasIdentifierScanner(VisitorState ancestorState, Matcher<IdentifierTree> idMatcher) {
      this.ancestorState = ancestorState;
      this.idMatcher = idMatcher;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Tree`
in `check_api/src/main/java/com/google/errorprone/matchers/Contains.java`
#### Snippet
```java
  private final Matcher<Tree> matcher;

  public Contains(Matcher<Tree> matcher) {
    this.matcher = matcher;
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `check_api/src/main/java/com/google/errorprone/matchers/CompoundAssignment.java`
#### Snippet
```java
  public CompoundAssignment(
      Set<Kind> operators,
      Matcher<ExpressionTree> receiverMatcher,
      Matcher<ExpressionTree> expressionMatcher) {
    this.operators = validateOperators(operators);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `check_api/src/main/java/com/google/errorprone/matchers/CompoundAssignment.java`
#### Snippet
```java
      Set<Kind> operators,
      Matcher<ExpressionTree> receiverMatcher,
      Matcher<ExpressionTree> expressionMatcher) {
    this.operators = validateOperators(operators);
    if (receiverMatcher == null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super State`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
  private static <T, R> Choice<State<R>> chooseSubtrees(
      State<?> state,
      Function<State<?>, Choice<? extends State<? extends T>>> choice1,
      Function<T, R> finalizer) {
    return choice1.apply(state).transform(s -> s.withResult(finalizer.apply(s.result())));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Choice``>`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
  private static <T, R> Choice<State<R>> chooseSubtrees(
      State<?> state,
      Function<State<?>, Choice<? extends State<? extends T>>> choice1,
      Function<T, R> finalizer) {
    return choice1.apply(state).transform(s -> s.withResult(finalizer.apply(s.result())));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
      State<?> state,
      Function<State<?>, Choice<? extends State<? extends T>>> choice1,
      Function<T, R> finalizer) {
    return choice1.apply(state).transform(s -> s.withResult(finalizer.apply(s.result())));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super State`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
  private static <T1, T2, T3, T4, R> Choice<State<R>> chooseSubtrees(
      State<?> state,
      Function<State<?>, Choice<? extends State<? extends T1>>> choice1,
      Function<State<?>, Choice<? extends State<? extends T2>>> choice2,
      Function<State<?>, Choice<? extends State<? extends T3>>> choice3,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Choice``>`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
  private static <T1, T2, T3, T4, R> Choice<State<R>> chooseSubtrees(
      State<?> state,
      Function<State<?>, Choice<? extends State<? extends T1>>> choice1,
      Function<State<?>, Choice<? extends State<? extends T2>>> choice2,
      Function<State<?>, Choice<? extends State<? extends T3>>> choice3,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super State`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
      State<?> state,
      Function<State<?>, Choice<? extends State<? extends T1>>> choice1,
      Function<State<?>, Choice<? extends State<? extends T2>>> choice2,
      Function<State<?>, Choice<? extends State<? extends T3>>> choice3,
      Function<State<?>, Choice<? extends State<? extends T4>>> choice4,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Choice``>`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
      State<?> state,
      Function<State<?>, Choice<? extends State<? extends T1>>> choice1,
      Function<State<?>, Choice<? extends State<? extends T2>>> choice2,
      Function<State<?>, Choice<? extends State<? extends T3>>> choice3,
      Function<State<?>, Choice<? extends State<? extends T4>>> choice4,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super State`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
      Function<State<?>, Choice<? extends State<? extends T1>>> choice1,
      Function<State<?>, Choice<? extends State<? extends T2>>> choice2,
      Function<State<?>, Choice<? extends State<? extends T3>>> choice3,
      Function<State<?>, Choice<? extends State<? extends T4>>> choice4,
      QuadFunction<T1, T2, T3, T4, R> finalizer) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Choice``>`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
      Function<State<?>, Choice<? extends State<? extends T1>>> choice1,
      Function<State<?>, Choice<? extends State<? extends T2>>> choice2,
      Function<State<?>, Choice<? extends State<? extends T3>>> choice3,
      Function<State<?>, Choice<? extends State<? extends T4>>> choice4,
      QuadFunction<T1, T2, T3, T4, R> finalizer) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super State`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
      Function<State<?>, Choice<? extends State<? extends T2>>> choice2,
      Function<State<?>, Choice<? extends State<? extends T3>>> choice3,
      Function<State<?>, Choice<? extends State<? extends T4>>> choice4,
      QuadFunction<T1, T2, T3, T4, R> finalizer) {
    return choice1
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Choice``>`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
      Function<State<?>, Choice<? extends State<? extends T2>>> choice2,
      Function<State<?>, Choice<? extends State<? extends T3>>> choice3,
      Function<State<?>, Choice<? extends State<? extends T4>>> choice4,
      QuadFunction<T1, T2, T3, T4, R> finalizer) {
    return choice1
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
      Function<State<?>, Choice<? extends State<? extends T3>>> choice3,
      Function<State<?>, Choice<? extends State<? extends T4>>> choice4,
      QuadFunction<T1, T2, T3, T4, R> finalizer) {
    return choice1
        .apply(state)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super State`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
  private static <T1, T2, R> Choice<State<R>> chooseSubtrees(
      State<?> state,
      Function<State<?>, Choice<? extends State<? extends T1>>> choice1,
      Function<State<?>, Choice<? extends State<? extends T2>>> choice2,
      BiFunction<T1, T2, R> finalizer) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Choice``>`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
  private static <T1, T2, R> Choice<State<R>> chooseSubtrees(
      State<?> state,
      Function<State<?>, Choice<? extends State<? extends T1>>> choice1,
      Function<State<?>, Choice<? extends State<? extends T2>>> choice2,
      BiFunction<T1, T2, R> finalizer) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super State`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
      State<?> state,
      Function<State<?>, Choice<? extends State<? extends T1>>> choice1,
      Function<State<?>, Choice<? extends State<? extends T2>>> choice2,
      BiFunction<T1, T2, R> finalizer) {
    return choice1
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Choice``>`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
      State<?> state,
      Function<State<?>, Choice<? extends State<? extends T1>>> choice1,
      Function<State<?>, Choice<? extends State<? extends T2>>> choice2,
      BiFunction<T1, T2, R> finalizer) {
    return choice1
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
      Function<State<?>, Choice<? extends State<? extends T1>>> choice1,
      Function<State<?>, Choice<? extends State<? extends T2>>> choice2,
      BiFunction<T1, T2, R> finalizer) {
    return choice1
        .apply(state)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super State`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
  private static <T1, T2, T3, R> Choice<State<R>> chooseSubtrees(
      State<?> state,
      Function<State<?>, Choice<? extends State<? extends T1>>> choice1,
      Function<State<?>, Choice<? extends State<? extends T2>>> choice2,
      Function<State<?>, Choice<? extends State<? extends T3>>> choice3,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Choice``>`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
  private static <T1, T2, T3, R> Choice<State<R>> chooseSubtrees(
      State<?> state,
      Function<State<?>, Choice<? extends State<? extends T1>>> choice1,
      Function<State<?>, Choice<? extends State<? extends T2>>> choice2,
      Function<State<?>, Choice<? extends State<? extends T3>>> choice3,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super State`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
      State<?> state,
      Function<State<?>, Choice<? extends State<? extends T1>>> choice1,
      Function<State<?>, Choice<? extends State<? extends T2>>> choice2,
      Function<State<?>, Choice<? extends State<? extends T3>>> choice3,
      TriFunction<T1, T2, T3, R> finalizer) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Choice``>`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
      State<?> state,
      Function<State<?>, Choice<? extends State<? extends T1>>> choice1,
      Function<State<?>, Choice<? extends State<? extends T2>>> choice2,
      Function<State<?>, Choice<? extends State<? extends T3>>> choice3,
      TriFunction<T1, T2, T3, R> finalizer) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super State`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
      Function<State<?>, Choice<? extends State<? extends T1>>> choice1,
      Function<State<?>, Choice<? extends State<? extends T2>>> choice2,
      Function<State<?>, Choice<? extends State<? extends T3>>> choice3,
      TriFunction<T1, T2, T3, R> finalizer) {
    return choice1
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Choice``>`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
      Function<State<?>, Choice<? extends State<? extends T1>>> choice1,
      Function<State<?>, Choice<? extends State<? extends T2>>> choice2,
      Function<State<?>, Choice<? extends State<? extends T3>>> choice3,
      TriFunction<T1, T2, T3, R> finalizer) {
    return choice1
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends R`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
      Function<State<?>, Choice<? extends State<? extends T2>>> choice2,
      Function<State<?>, Choice<? extends State<? extends T3>>> choice3,
      TriFunction<T1, T2, T3, R> finalizer) {
    return choice1
        .apply(state)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `check_api/src/main/java/com/google/errorprone/suppliers/Suppliers.java`
#### Snippet
```java
   * @param n the position of the generic argument
   */
  public static Supplier<Type> genericTypeOfType(Supplier<Type> typeSupplier, int n) {
    return new Supplier<Type>() {
      @Override
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `check_api/src/main/java/com/google/errorprone/suppliers/Suppliers.java`
#### Snippet
```java
      };

  public static Supplier<Type> arrayOf(Supplier<Type> elementType) {
    return new Supplier<Type>() {
      @Override
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Name`
in `check_api/src/main/java/com/google/errorprone/bugpatterns/BugChecker.java`
#### Snippet
```java

  @Override
  public boolean suppressedByAnyOf(Set<Name> annotations, VisitorState s) {
    return checkSuppression.test(annotations, s);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Path`
in `test_helpers/src/main/java/com/google/errorprone/FileManagers.java`
#### Snippet
```java

  private static void setLocation(
      JavacFileManager fileManager, ImmutableList<Path> collect, StandardLocation classPath) {
    // Calling `setLocationFromPaths` on trusted inputs should never fail, so rethrow the
    // specified `IOException` as unchecked so we can call it in lambdas.
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Rule`
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodInvocationMatcher.java`
#### Snippet
```java
   * {@link com.google.errorprone.matchers.method.MethodMatchers.MethodMatcher}.
   */
  public static Matcher<ExpressionTree> compile(Iterable<Rule> rules) {

    // A set of Rule objects represents a predicate stated in disjunctive normal form, where the
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends NodeWithDefault`
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodInvocationMatcher.java`
#### Snippet
```java

    private static BiPredicate<Context, VisitorState> traverse(
        Map<Set<Node>, NodeWithDefault> mappings, NodeWithDefault root) {
      if (root.states.contains(ACCEPT)) {
        // If there was any path from the root to the accept node, the predicate matched.
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Fix`
in `test_helpers/src/main/java/com/google/errorprone/BugCheckerRefactoringTestHelper.java`
#### Snippet
```java
    FOURTH {
      @Override
      public Fix choose(List<Fix> fixes) {
        return fixes.get(3);
      }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Fix`
in `test_helpers/src/main/java/com/google/errorprone/BugCheckerRefactoringTestHelper.java`
#### Snippet
```java
    THIRD {
      @Override
      public Fix choose(List<Fix> fixes) {
        return fixes.get(2);
      }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Fix`
in `test_helpers/src/main/java/com/google/errorprone/BugCheckerRefactoringTestHelper.java`
#### Snippet
```java
    SECOND {
      @Override
      public Fix choose(List<Fix> fixes) {
        return fixes.get(1);
      }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaFileObject`
in `test_helpers/src/main/java/com/google/errorprone/BugCheckerRefactoringTestHelper.java`
#### Snippet
```java
  @CanIgnoreReturnValue
  private JCCompilationUnit doCompile(
      JavaFileObject input, Iterable<JavaFileObject> files, Context context) throws IOException {
    JavacTool tool = JavacTool.create();
    DiagnosticCollector<JavaFileObject> diagnosticsCollector = new DiagnosticCollector<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Fix`
in `test_helpers/src/main/java/com/google/errorprone/BugCheckerRefactoringTestHelper.java`
#### Snippet
```java
    FIRST {
      @Override
      public Fix choose(List<Fix> fixes) {
        return fixes.get(0);
      }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Symbol`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
   * {@code pred}.
   */
  public static <T extends Tree> Matcher<T> symbolMatcher(BiPredicate<Symbol, VisitorState> pred) {
    return (tree, state) -> {
      Symbol sym = getSymbol(tree);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super VisitorState`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
   * {@code pred}.
   */
  public static <T extends Tree> Matcher<T> symbolMatcher(BiPredicate<Symbol, VisitorState> pred) {
    return (tree, state) -> {
      Symbol sym = getSymbol(tree);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Tree`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
   * <p>TODO(eaftan): This could be used instead of enclosingBlock and enclosingClass.
   */
  public static Matcher<Tree> enclosingNode(Matcher<Tree> matcher) {
    return (t, state) -> {
      TreePath path = state.getPath().getParentPath();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
   * (((value)))}.
   */
  public static Matcher<ExpressionTree> ignoreParens(Matcher<ExpressionTree> innerMatcher) {
    return (tree, state) -> innerMatcher.matches(stripParentheses(tree), state);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super VariableTree`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
   */
  public static Matcher<EnhancedForLoopTree> enhancedForLoop(
      Matcher<VariableTree> variableMatcher,
      Matcher<ExpressionTree> expressionMatcher,
      Matcher<StatementTree> statementMatcher) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
  public static Matcher<EnhancedForLoopTree> enhancedForLoop(
      Matcher<VariableTree> variableMatcher,
      Matcher<ExpressionTree> expressionMatcher,
      Matcher<StatementTree> statementMatcher) {
    return (t, state) ->
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super StatementTree`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
      Matcher<VariableTree> variableMatcher,
      Matcher<ExpressionTree> expressionMatcher,
      Matcher<StatementTree> statementMatcher) {
    return (t, state) ->
        variableMatcher.matches(t.getVariable(), state)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super StatementTree`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
   */
  public static Matcher<BlockTree> matchSingleStatementBlock(
      Matcher<StatementTree> statementMatcher) {
    return (blockTree, state) -> {
      if (blockTree == null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
  }

  private static <T extends Tree> Matcher<T> packageMatches(Predicate<String> predicate) {
    return (tree, state) -> predicate.test(getPackageFullName(state));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super StatementTree`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java

  private static boolean siblingStatement(
      int offset, Matcher<StatementTree> matcher, StatementTree statement, VisitorState state) {
    // TODO(cushon): walking arbitrarily far up to find a block tree often isn't what we want
    TreePath blockPath = state.findPathToEnclosing(BlockTree.class);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super MethodTree`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
   * @return True if some method in the class matches the given methodMatcher.
   */
  public static Matcher<ClassTree> hasMethod(Matcher<MethodTree> methodMatcher) {
    return (t, state) -> {
      for (Tree member : t.getMembers()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Matcher`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
   */
  public static Matcher<MethodTree> methodHasParameters(
      List<Matcher<VariableTree>> variableMatcher) {
    return (methodTree, state) -> {
      if (methodTree.getParameters().size() != variableMatcher.size()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
   */
  public static Matcher<AssignmentTree> assignment(
      Matcher<ExpressionTree> variableMatcher, Matcher<? super ExpressionTree> expressionMatcher) {
    return (t, state) ->
        variableMatcher.matches(t.getVariable(), state)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Tree`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
   */
  public static Matcher<TypeCastTree> typeCast(
      Matcher<Tree> typeMatcher, Matcher<ExpressionTree> expressionMatcher) {
    return (t, state) ->
        typeMatcher.matches(t.getType(), state)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
   */
  public static Matcher<TypeCastTree> typeCast(
      Matcher<Tree> typeMatcher, Matcher<ExpressionTree> expressionMatcher) {
    return (t, state) ->
        typeMatcher.matches(t.getType(), state)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Tree`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
   * this;}
   */
  public static <T extends Tree> Matcher<T> parentNode(Matcher<Tree> treeMatcher) {
    return (tree, state) -> {
      TreePath parent = requireNonNull(state.getPath().getParentPath());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
   */
  public static Matcher<ExpressionTree> methodInvocation(
      Matcher<ExpressionTree> methodSelectMatcher) {
    return (expressionTree, state) -> {
      if (!(expressionTree instanceof MethodInvocationTree)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
   */
  public static Matcher<VariableTree> variableInitializer(
      Matcher<ExpressionTree> expressionTreeMatcher) {
    return (variableTree, state) -> {
      ExpressionTree initializer = variableTree.getInitializer();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java

  /** Matches an AST node iff it does not match the given matcher. */
  public static <T extends Tree> Matcher<T> not(Matcher<T> matcher) {
    return (t, state) -> !matcher.matches(t, state);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
   */
  public static Matcher<AssertTree> assertionWithCondition(
      Matcher<ExpressionTree> conditionMatcher) {
    return (tree, state) -> conditionMatcher.matches(tree.getCondition(), state);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
   */
  public static Matcher<StatementTree> matchExpressionReturn(
      Matcher<ExpressionTree> expressionTreeMatcher) {
    return (statement, state) -> {
      if (!(statement instanceof ReturnTree)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java

  /** Matches an {@link ExpressionStatementTree} based on its {@link ExpressionTree}. */
  public static Matcher<StatementTree> expressionStatement(Matcher<ExpressionTree> matcher) {
    return (statementTree, state) ->
        statementTree instanceof ExpressionStatementTree
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Tree`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
   * @param treeMatcher A matcher on the type of the variable.
   */
  public static Matcher<VariableTree> variableType(Matcher<Tree> treeMatcher) {
    return (variableTree, state) -> treeMatcher.matches(variableTree.getType(), state);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExpressionTree`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java

  public static Matcher<MethodInvocationTree> receiverOfInvocation(
      Matcher<ExpressionTree> expressionTreeMatcher) {
    return (methodInvocationTree, state) -> {
      ExpressionTree receiver = ASTHelpers.getReceiver(methodInvocationTree);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java

  private static int findOptionOrAppend(
      ImmutableList.Builder<String> newOptions,
      ImmutableList<String> extraOptions,
      String key,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaFileObject`
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java

    private FixCompiler(
        List<JavaFileObject> fileObjects, VisitorState state, BasicJavacTask javacTask) {
      this.fileObjects = fileObjects;
      this.state = state;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Constraint`
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  // All constructors private: only static final instances are legal starting points for chains.
  private MethodMatcherImpl(BaseMethodMatcher baseMatcher, ImmutableList<Constraint> matchers) {
    this.baseMatcher = baseMatcher;
    this.constraints = matchers;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java
  }

  private MethodNameMatcher stringConstraint(Predicate<String> constraint) {
    return append((m, s) -> constraint.test(m.sym().getSimpleName().toString()));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Type`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
      Suppliers.typeFromString("com.google.io.protocol.ProtocolMessage");

  private static boolean isAssignableTo(Type type, Supplier<Type> supplier, VisitorState state) {
    Type to = supplier.get(state);
    if (to == null) {
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UDoWhileLoop` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UDoWhileLoop.java`
#### Snippet
```java
 */
@AutoValue
abstract class UDoWhileLoop extends USimpleStatement implements DoWhileLoopTree {
  public static UDoWhileLoop create(UStatement body, UExpression condition) {
    return new AutoValue_UDoWhileLoop((USimpleStatement) body, condition);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UIntersectionType` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UIntersectionType.java`
#### Snippet
```java
 */
@AutoValue
abstract class UIntersectionType extends UExpression implements IntersectionTypeTree {
  @VisibleForTesting
  static UIntersectionType create(UExpression... bounds) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UContinue` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UContinue.java`
#### Snippet
```java
 */
@AutoValue
abstract class UContinue extends USimpleStatement implements ContinueTree {
  static UContinue create(@Nullable CharSequence label) {
    return new AutoValue_UContinue((label == null) ? null : StringName.of(label));
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UAssignOp` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UAssignOp.java`
#### Snippet
```java
 */
@AutoValue
abstract class UAssignOp extends UExpression implements CompoundAssignmentTree {
  private static final ImmutableBiMap<Kind, JCTree.Tag> TAG =
      ImmutableBiMap.<Kind, JCTree.Tag>builder()
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `LocalVarBinding` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/LocalVarBinding.java`
#### Snippet
```java
 */
@AutoValue
public abstract class LocalVarBinding {
  public static LocalVarBinding create(VarSymbol symbol, ModifiersTree modifiers) {
    return new AutoValue_LocalVarBinding(symbol, modifiers);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UStaticIdent` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UStaticIdent.java`
#### Snippet
```java
 */
@AutoValue
public abstract class UStaticIdent extends UIdent {
  public static UStaticIdent create(UClassIdent classIdent, CharSequence member, UType memberType) {
    return new AutoValue_UStaticIdent(classIdent, StringName.of(member), memberType);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UOfKind` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UOfKind.java`
#### Snippet
```java
 */
@AutoValue
abstract class UOfKind extends UExpression {
  public static UOfKind create(UExpression expression, Set<Kind> allowed) {
    return new AutoValue_UOfKind(expression, ImmutableSet.copyOf(allowed));
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UAssign` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UAssign.java`
#### Snippet
```java
 */
@AutoValue
abstract class UAssign extends UExpression implements AssignmentTree {
  public static UAssign create(UExpression variable, UExpression expression) {
    return new AutoValue_UAssign(variable, expression);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UArrayType` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UArrayType.java`
#### Snippet
```java
 */
@AutoValue
abstract class UArrayType extends UType {
  public static UArrayType create(UType componentType) {
    return new AutoValue_UArrayType(componentType);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `URepeated` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/URepeated.java`
#### Snippet
```java
/** A variable that can match a sequence of expressions. */
@AutoValue
abstract class URepeated extends UExpression {
  public static URepeated create(CharSequence identifier, UExpression expression) {
    return new AutoValue_URepeated(identifier.toString(), expression);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UExpression` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UExpression.java`
#### Snippet
```java
 * @author lowasser@google.com (Louis Wasserman)
 */
public abstract class UExpression extends UTree<JCExpression> implements ExpressionTree {
  public UExpression negate() {
    return UUnary.create(Kind.LOGICAL_COMPLEMENT, this);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UTypeVarIdent` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UTypeVarIdent.java`
#### Snippet
```java
 */
@AutoValue
abstract class UTypeVarIdent extends UIdent {
  private static final TreeVisitor<Boolean, Void> QUALIFIED_FROM_PACKAGE =
      new SimpleTreeVisitor<Boolean, Void>(false) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UModifiers` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UModifiers.java`
#### Snippet
```java
 */
@AutoValue
abstract class UModifiers extends UTree<JCModifiers> implements ModifiersTree {
  public static UModifiers create(long flagBits, UAnnotation... annotations) {
    return create(flagBits, ImmutableList.copyOf(annotations));
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UIf` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UIf.java`
#### Snippet
```java
 */
@AutoValue
abstract class UIf implements UStatement, IfTree {
  public static UIf create(
      UExpression condition, UStatement thenStatement, UStatement elseStatement) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UPrimitiveType` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UPrimitiveType.java`
#### Snippet
```java
 */
@AutoValue
abstract class UPrimitiveType extends UType {

  public static UPrimitiveType create(TypeKind typeKind) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ULiteral` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/ULiteral.java`
#### Snippet
```java
 */
@AutoValue
public abstract class ULiteral extends UExpression implements LiteralTree {

  public static ULiteral nullLit() {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UExpressionStatement` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UExpressionStatement.java`
#### Snippet
```java
 */
@AutoValue
abstract class UExpressionStatement extends USimpleStatement implements ExpressionStatementTree {
  public static UExpressionStatement create(UExpression expression) {
    return new AutoValue_UExpressionStatement(expression);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UPrimitiveTypeTree` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UPrimitiveTypeTree.java`
#### Snippet
```java
 */
@AutoValue
abstract class UPrimitiveTypeTree extends UExpression implements PrimitiveTypeTree {

  public static UPrimitiveTypeTree create(TypeTag tag) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UMethodType` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UMethodType.java`
#### Snippet
```java
 */
@AutoValue
public abstract class UMethodType extends UType {

  public static UMethodType create(UType returnType, UType... parameterTypes) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UVariableDecl` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UVariableDecl.java`
#### Snippet
```java
 */
@AutoValue
public abstract class UVariableDecl extends USimpleStatement implements VariableTree {

  public static UVariableDecl create(
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `RefasterScanner` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/RefasterScanner.java`
#### Snippet
```java
 */
@AutoValue
abstract class RefasterScanner<M extends TemplateMatch, T extends Template<M>>
    extends TreeScanner<Void, Context> {
  static <M extends TemplateMatch, T extends Template<M>> RefasterScanner<M, T> create(
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UClassIdent` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UClassIdent.java`
#### Snippet
```java
 */
@AutoValue
abstract class UClassIdent extends UIdent {
  @VisibleForTesting
  public static UClassIdent create(String qualifiedName) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UnifierWithUnconsumedStatements` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UStatement.java`
#### Snippet
```java
  /** Tuple of a Unifier and a list of statements that are still waiting to be matched. */
  @AutoValue
  abstract class UnifierWithUnconsumedStatements {
    public static UnifierWithUnconsumedStatements create(
        Unifier unifier, List<? extends StatementTree> unconsumedStatements) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UArrayAccess` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UArrayAccess.java`
#### Snippet
```java
 */
@AutoValue
abstract class UArrayAccess extends UExpression implements ArrayAccessTree {
  public static UArrayAccess create(UExpression arrayExpr, UExpression indexExpr) {
    return new AutoValue_UArrayAccess(arrayExpr, indexExpr);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UEnhancedForLoop` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UEnhancedForLoop.java`
#### Snippet
```java
 */
@AutoValue
abstract class UEnhancedForLoop extends USimpleStatement implements EnhancedForLoopTree {
  public static UEnhancedForLoop create(
      UVariableDecl variable, UExpression elements, UStatement statement) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UClassDecl` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UClassDecl.java`
#### Snippet
```java
 */
@AutoValue
abstract class UClassDecl extends USimpleStatement implements ClassTree {
  public static UClassDecl create(UMethodDecl... members) {
    return create(ImmutableList.copyOf(members));
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UnifierWithRemainingMembers` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UClassDecl.java`
#### Snippet
```java

  @AutoValue
  abstract static class UnifierWithRemainingMembers {
    static UnifierWithRemainingMembers create(
        Unifier unifier, Iterable<UMethodDecl> remainingMembers) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UTypeParameter` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UTypeParameter.java`
#### Snippet
```java
 */
@AutoValue
abstract class UTypeParameter extends UTree<JCTypeParameter> implements TypeParameterTree {
  @VisibleForTesting
  static UTypeParameter create(CharSequence name, UExpression... bounds) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ULambda` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/ULambda.java`
#### Snippet
```java
 */
@AutoValue
abstract class ULambda extends UExpression implements LambdaExpressionTree {
  public static ULambda create(
      ParameterKind parameterKind, Iterable<UVariableDecl> parameters, UTree<?> body) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UMatches` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UMatches.java`
#### Snippet
```java
 */
@AutoValue
abstract class UMatches extends UExpression {
  public static UMatches create(
      Class<? extends Matcher<? super ExpressionTree>> matcherClass,
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UMemberReference` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UMemberReference.java`
#### Snippet
```java
 */
@AutoValue
abstract class UMemberReference extends UExpression implements MemberReferenceTree {
  public static UMemberReference create(
      ReferenceMode mode,
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UArrayTypeTree` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UArrayTypeTree.java`
#### Snippet
```java
 */
@AutoValue
abstract class UArrayTypeTree extends UExpression implements ArrayTypeTree {
  public static UArrayTypeTree create(UExpression elementType) {
    return new AutoValue_UArrayTypeTree(elementType);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UAnnotatedType` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UAnnotatedType.java`
#### Snippet
```java
 */
@AutoValue
abstract class UAnnotatedType extends UExpression implements AnnotatedTypeTree {
  public static UAnnotatedType create(Iterable<UAnnotation> annotations, UExpression type) {
    return new AutoValue_UAnnotatedType(ImmutableList.copyOf(annotations), type);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `StringName` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/StringName.java`
#### Snippet
```java
 */
@AutoValue
public abstract class StringName
    implements Name, Unifiable<Name>, Inlineable<com.sun.tools.javac.util.Name> {
  public static StringName of(CharSequence contents) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UConditional` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UConditional.java`
#### Snippet
```java
 */
@AutoValue
abstract class UConditional extends UExpression implements ConditionalExpressionTree {
  public static UConditional create(
      UExpression conditionExpr, UExpression trueExpr, UExpression falseExpr) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UUnary` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UUnary.java`
#### Snippet
```java
 */
@AutoValue
abstract class UUnary extends UExpression implements UnaryTree {
  private static final ImmutableBiMap<Kind, JCTree.Tag> UNARY_OP_CODES =
      new ImmutableBiMap.Builder<Kind, JCTree.Tag>()
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UWildcard` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UWildcard.java`
#### Snippet
```java
 */
@AutoValue
abstract class UWildcard extends UExpression implements WildcardTree {
  private static final ImmutableBiMap<Kind, BoundKind> BOUND_KINDS;

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UForAll` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UForAll.java`
#### Snippet
```java
 */
@AutoValue
public abstract class UForAll extends UType {
  public static UForAll create(List<UTypeVar> typeVars, UType quantifiedType) {
    return new AutoValue_UForAll(ImmutableList.copyOf(typeVars), quantifiedType);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UNewClass` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UNewClass.java`
#### Snippet
```java
 */
@AutoValue
abstract class UNewClass extends UExpression implements NewClassTree {

  public static UNewClass create(
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UIdent` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UIdent.java`
#### Snippet
```java
 * @author lowasser@google.com (Louis Wasserman)
 */
abstract class UIdent extends UExpression implements IdentifierTree {
  @Override
  public <R, D> R accept(TreeVisitor<R, D> visitor, D data) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UInstanceOf` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UInstanceOf.java`
#### Snippet
```java
 */
@AutoValue
abstract class UInstanceOf extends UExpression {
  public static UInstanceOf create(UExpression expression, UTree<?> type) {
    return new AutoValue_UInstanceOf(expression, type);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UClassType` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UClassType.java`
#### Snippet
```java
 */
@AutoValue
public abstract class UClassType extends UType {
  public static UClassType create(CharSequence fullyQualifiedClass, List<UType> typeArguments) {
    return new AutoValue_UClassType(
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UIntersectionClassType` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UIntersectionClassType.java`
#### Snippet
```java
 */
@AutoValue
public abstract class UIntersectionClassType extends UType {
  static UIntersectionClassType create(Iterable<? extends UType> bounds) {
    return new AutoValue_UIntersectionClassType(ImmutableList.copyOf(bounds));
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UReturn` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UReturn.java`
#### Snippet
```java
 */
@AutoValue
public abstract class UReturn extends USimpleStatement implements ReturnTree {
  public static UReturn create(UExpression expression) {
    return new AutoValue_UReturn(expression);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ULocalVarIdent` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/ULocalVarIdent.java`
#### Snippet
```java
 */
@AutoValue
abstract class ULocalVarIdent extends UIdent {
  /** A key in a {@code Bindings} associated with a local variable of the specified name. */
  static final class Key extends Bindings.Key<LocalVarBinding> {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UMethodDecl` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UMethodDecl.java`
#### Snippet
```java
 */
@AutoValue
abstract class UMethodDecl extends UTree<JCMethodDecl> implements MethodTree {
  public static UMethodDecl create(
      UModifiers modifiers,
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UWildcardType` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UWildcardType.java`
#### Snippet
```java
 */
@AutoValue
abstract class UWildcardType extends UType {
  public static UWildcardType create(BoundKind boundKind, UType bound) {
    return new AutoValue_UWildcardType(boundKind, bound);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `PlaceholderMethod` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderMethod.java`
#### Snippet
```java
 */
@AutoValue
abstract class PlaceholderMethod implements Serializable {
  static PlaceholderMethod create(
      CharSequence name,
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UBlock` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UBlock.java`
#### Snippet
```java
 */
@AutoValue
abstract class UBlock extends USimpleStatement implements BlockTree {
  public static UBlock create(List<UStatement> statements) {
    return new AutoValue_UBlock(ImmutableList.copyOf(statements));
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UAnnotation` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UAnnotation.java`
#### Snippet
```java
 */
@AutoValue
abstract class UAnnotation extends UExpression implements AnnotationTree {
  public static UAnnotation create(UTree<?> annotationType, List<UExpression> arguments) {
    return new AutoValue_UAnnotation(annotationType, ImmutableList.copyOf(arguments));
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UAnyOf` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UAnyOf.java`
#### Snippet
```java
 */
@AutoValue
public abstract class UAnyOf extends UExpression {
  public static UAnyOf create(UExpression... expressions) {
    return create(ImmutableList.copyOf(expressions));
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UMemberSelect` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UMemberSelect.java`
#### Snippet
```java
 */
@AutoValue
public abstract class UMemberSelect extends UExpression implements MemberSelectTree {
  /**
   * Use of this string as an expression in a member select will cause this method select to be
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UTry` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UTry.java`
#### Snippet
```java
 */
@AutoValue
abstract class UTry extends USimpleStatement implements TryTree {
  static UTry create(
      Iterable<? extends UTree<?>> resources,
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UMethodInvocation` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UMethodInvocation.java`
#### Snippet
```java
 */
@AutoValue
public abstract class UMethodInvocation extends UExpression implements MethodInvocationTree {
  public static UMethodInvocation create(UExpression methodSelect, List<UExpression> arguments) {
    return new AutoValue_UMethodInvocation(methodSelect, ImmutableList.copyOf(arguments));
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UTypeApply` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UTypeApply.java`
#### Snippet
```java
 */
@AutoValue
abstract class UTypeApply extends UExpression implements ParameterizedTypeTree {
  public static UTypeApply create(UExpression type, List<UExpression> typeArguments) {
    return new AutoValue_UTypeApply(type, ImmutableList.copyOf(typeArguments));
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `USynchronized` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/USynchronized.java`
#### Snippet
```java
 */
@AutoValue
abstract class USynchronized extends USimpleStatement implements SynchronizedTree {
  public static USynchronized create(UExpression expression, UBlock block) {
    return new AutoValue_USynchronized(expression, block);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ULabeledStatement` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/ULabeledStatement.java`
#### Snippet
```java
 */
@AutoValue
abstract class ULabeledStatement extends USimpleStatement implements LabeledStatementTree {
  static ULabeledStatement create(CharSequence label, UStatement statement) {
    return new AutoValue_ULabeledStatement(StringName.of(label), (USimpleStatement) statement);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `RefasterRule` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/RefasterRule.java`
#### Snippet
```java
 */
@AutoValue
public abstract class RefasterRule<M extends TemplateMatch, T extends Template<M>>
    implements CodeTransformer, Serializable {
  public static RefasterRule<?, ?> create(
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UNewArray` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UNewArray.java`
#### Snippet
```java
/** {@link UTree} version of {@link NewArrayTree}, which represents an array instantiation. */
@AutoValue
abstract class UNewArray extends UExpression implements NewArrayTree {

  public static UNewArray create(
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UForLoop` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UForLoop.java`
#### Snippet
```java
 */
@AutoValue
abstract class UForLoop extends USimpleStatement implements ForLoopTree {

  public static UForLoop create(
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UParens` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UParens.java`
#### Snippet
```java
 */
@AutoValue
abstract class UParens extends UExpression implements ParenthesizedTree {
  public static UParens create(UExpression expression) {
    return new AutoValue_UParens(expression);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UWhileLoop` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UWhileLoop.java`
#### Snippet
```java
 */
@AutoValue
abstract class UWhileLoop extends USimpleStatement implements WhileLoopTree {
  public static UWhileLoop create(UExpression condition, UStatement body) {
    return new AutoValue_UWhileLoop(condition, (USimpleStatement) body);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UFreeIdent` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UFreeIdent.java`
#### Snippet
```java
 */
@AutoValue
public abstract class UFreeIdent extends UIdent {
  static class Key extends Bindings.Key<JCExpression> {
    Key(CharSequence name) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UBinary` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UBinary.java`
#### Snippet
```java
 */
@AutoValue
abstract class UBinary extends UExpression implements BinaryTree {
  static final ImmutableBiMap<Kind, JCTree.Tag> OP_CODES =
      new ImmutableBiMap.Builder<Kind, JCTree.Tag>()
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UThrow` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UThrow.java`
#### Snippet
```java
 */
@AutoValue
abstract class UThrow extends USimpleStatement implements ThrowTree {
  public static UThrow create(UExpression expression) {
    return new AutoValue_UThrow(expression);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UAssert` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UAssert.java`
#### Snippet
```java
 */
@AutoValue
abstract class UAssert extends USimpleStatement implements AssertTree {

  static UAssert create(UExpression condition, @Nullable UExpression detail) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TypeWithExpression` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UTypeVar.java`
#### Snippet
```java
  /** Tuple of an expression with an associated type. */
  @AutoValue
  public abstract static class TypeWithExpression implements Inlineable<JCExpression> {
    public static TypeWithExpression create(Type type, JCExpression expression) {
      return new AutoValue_UTypeVar_TypeWithExpression(type, checkNotNull(expression));
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UUnionType` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UUnionType.java`
#### Snippet
```java
 */
@AutoValue
abstract class UUnionType extends UExpression implements UnionTypeTree {
  @VisibleForTesting
  static UUnionType create(UExpression... typeAlternatives) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ExpressionTemplate` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/ExpressionTemplate.java`
#### Snippet
```java
 */
@AutoValue
public abstract class ExpressionTemplate extends Template<ExpressionTemplateMatch>
    implements Unifiable<JCExpression> {
  private static final Logger logger = Logger.getLogger(ExpressionTemplate.class.toString());
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UCatch` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UCatch.java`
#### Snippet
```java
 */
@AutoValue
abstract class UCatch extends UTree<JCCatch> implements CatchTree {
  static UCatch create(UVariableDecl parameter, UBlock block) {
    return new AutoValue_UCatch(parameter, block);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UTypeCast` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UTypeCast.java`
#### Snippet
```java
 */
@AutoValue
abstract class UTypeCast extends UExpression implements TypeCastTree {
  public static UTypeCast create(UTree<?> type, UExpression expression) {
    return new AutoValue_UTypeCast(type, expression);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ConsumptionState` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UPlaceholderStatement.java`
#### Snippet
```java

  @AutoValue
  abstract static class ConsumptionState {
    static ConsumptionState empty() {
      return new AutoValue_UPlaceholderStatement_ConsumptionState(0, List.<JCStatement>nil());
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UPlaceholderStatement` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UPlaceholderStatement.java`
#### Snippet
```java
 */
@AutoValue
abstract class UPlaceholderStatement implements UStatement {
  static UPlaceholderStatement create(
      PlaceholderMethod placeholder,
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UBlank` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UBlank.java`
#### Snippet
```java
/** Equivalent to a no-arg block placeholder invocation. */
@AutoValue
abstract class UBlank implements UStatement {
  static UBlank create() {
    return new AutoValue_UBlank(UUID.randomUUID());
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UPlaceholderExpression` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/UPlaceholderExpression.java`
#### Snippet
```java
 */
@AutoValue
public abstract class UPlaceholderExpression extends UExpression {

  static UPlaceholderExpression create(
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Template` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/Template.java`
#### Snippet
```java
 * @param <M> Type of a match for this template.
 */
public abstract class Template<M extends TemplateMatch> implements Serializable {
  private static final Logger logger = Logger.getLogger(Template.class.toString());

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `LenientFormatMethod` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/LenientFormatStringValidation.java`
#### Snippet
```java

  @AutoValue
  abstract static class LenientFormatMethod {
    abstract Matcher<ExpressionTree> matcher();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ReplaceableVar` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableMemberCollection.java`
#### Snippet
```java

  @AutoValue
  abstract static class ReplaceableVar {
    abstract Symbol symbol();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ReplaceableType` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableMemberCollection.java`
#### Snippet
```java

  @AutoValue
  abstract static class ReplaceableType<M> {
    abstract Class<M> interfaceType();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ComparisonPair` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/EqualsWrongThing.java`
#### Snippet
```java

  @AutoValue
  abstract static class ComparisonPair {
    abstract Symbol lhs();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ComparisonSite` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/EqualsWrongThing.java`
#### Snippet
```java

  @AutoValue
  abstract static class ComparisonSite {
    abstract Tree tree();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Reason` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMockChecker.java`
#### Snippet
```java
  /** An explanation of what type should not be mocked, and the reason why. */
  @AutoValue
  public abstract static class Reason {

    public static Reason of(Type t, String reason) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `StronglyType` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/StronglyType.java`
#### Snippet
```java
 */
@AutoValue
public abstract class StronglyType {
  abstract Function<String, String> renameFunction();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/StronglyType.java`
#### Snippet
```java
  /** Builder for {@link StronglyType} */
  @AutoValue.Builder
  public abstract static class Builder {
    /**
     * Set a mapping function that maps from the original name to a new name more befitting the
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `FactoryMethodName` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/ChainedAssertionLosesContext.java`
#### Snippet
```java

  @AutoValue
  abstract static class FactoryMethodName {
    static FactoryMethodName create(String clazz, String method) {
      return new AutoValue_ChainedAssertionLosesContext_FactoryMethodName(clazz, method);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `MapField` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/ProtoRedundantSet.java`
#### Snippet
```java

  @AutoValue
  abstract static class MapField implements ProtoField {
    abstract String getName();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `FieldWithValue` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/ProtoRedundantSet.java`
#### Snippet
```java

  @AutoValue
  abstract static class FieldWithValue {
    abstract ProtoField getField();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `SingleField` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/ProtoRedundantSet.java`
#### Snippet
```java

  @AutoValue
  abstract static class SingleField implements ProtoField {
    abstract String getName();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `RepeatedField` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/ProtoRedundantSet.java`
#### Snippet
```java

  @AutoValue
  abstract static class RepeatedField implements ProtoField {
    abstract String getName();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `FixInfo` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/ParameterName.java`
#### Snippet
```java

  @AutoValue
  abstract static class FixInfo {
    abstract boolean isFormatCorrect();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/DangerousLiteralNullChecker.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder {
      abstract Builder setKlass(Name klass);

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `NullReplacementRule` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/DangerousLiteralNullChecker.java`
#### Snippet
```java

  @AutoValue
  abstract static class NullReplacementRule {
    abstract Name klass();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `KnownAlias` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryMethodReference.java`
#### Snippet
```java

  @AutoValue
  abstract static class KnownAlias {
    public static KnownAlias create(Matcher<ExpressionTree> matcher, Supplier<Type> targetType) {
      return new AutoValue_UnnecessaryMethodReference_KnownAlias(matcher, targetType);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TypeToImport` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/WildcardImport.java`
#### Snippet
```java
  /** A type or member that needs to be imported. */
  @AutoValue
  abstract static class TypeToImport {

    /** Returns the simple name of the import. */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Change` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMustBeClosedChecker.java`
#### Snippet
```java
   */
  @AutoValue
  protected abstract static class Change {
    abstract SuggestedFix otherFixes();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMustBeClosedChecker.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder {
      abstract Builder otherFixes(SuggestedFix value);

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `BetterTypes` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/PreferredInterfaceType.java`
#### Snippet
```java

  @AutoValue
  abstract static class BetterTypes {
    abstract TypePredicate predicate();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TypeDetails` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/MixedMutabilityReturnType.java`
#### Snippet
```java

  @AutoValue
  abstract static class TypeDetails {
    abstract String immutableType();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `StaticImportInfo` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/StaticImports.java`
#### Snippet
```java
  /** Information about a static import. */
  @AutoValue
  public abstract static class StaticImportInfo {
    /** The fully qualified name used to import the type (possibly non-canonical). */
    public abstract String importedName();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `MemberWithIndex` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/UngroupedOverloads.java`
#### Snippet
```java

  @AutoValue
  abstract static class MemberWithIndex {

    abstract int index();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `OverloadKey` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/UngroupedOverloads.java`
#### Snippet
```java

  @AutoValue
  abstract static class OverloadKey {
    abstract Name name();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `AbstractLikeException` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/ThrowSpecificExceptions.java`
#### Snippet
```java

  @AutoValue
  abstract static class AbstractLikeException {
    abstract Matcher<ExpressionTree> matcher();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `CanBeStaticResult` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/CanBeStaticAnalyzer.java`
#### Snippet
```java
  /** Stores the result of a can-be-static query. */
  @AutoValue
  public abstract static class CanBeStaticResult {
    /**
     * Whether the method could *possibly* be static: i.e., this is false if it references an
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UnusedSpec` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedVariable.java`
#### Snippet
```java

  @AutoValue
  abstract static class UnusedSpec {
    /** {@link Symbol} of the unused element. */
    abstract Symbol symbol();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `MethodPairing` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/MissingTestCall.java`
#### Snippet
```java

  @AutoValue
  abstract static class MethodPairing {
    abstract String name();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `BlockTemplate` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/BlockTemplate.java`
#### Snippet
```java
 */
@AutoValue
public abstract class BlockTemplate extends Template<BlockTemplateMatch> {
  private static final Logger logger = Logger.getLogger(BlockTemplate.class.toString());

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Operand` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/IsInstanceOfClass.java`
#### Snippet
```java

  @AutoValue
  abstract static class Operand {
    abstract Kind kind();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TypeCompatibilityReport` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/TypeCompatibilityUtils.java`
#### Snippet
```java

  @AutoValue
  public abstract static class TypeCompatibilityReport {
    private static final TypeCompatibilityReport COMPATIBLE =
        new AutoValue_TypeCompatibilityUtils_TypeCompatibilityReport(true, null, null, null);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `MatcherWithUnits` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/time/InvalidJavaTimeConstant.java`
#### Snippet
```java

  @AutoValue
  abstract static class MatcherWithUnits {
    abstract Matcher<ExpressionTree> matcher();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/time/InvalidJavaTimeConstant.java`
#### Snippet
```java

    @AutoValue.Builder
    public abstract static class Builder {
      public abstract Builder setClassName(String className);

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Param` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/time/InvalidJavaTimeConstant.java`
#### Snippet
```java

  @AutoValue
  abstract static class Param {
    abstract String type();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `JavaTimeType` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/time/InvalidJavaTimeConstant.java`
#### Snippet
```java

  @AutoValue
  abstract static class JavaTimeType {
    abstract String className();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ConflictResult` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/guice/AssistedParameters.java`
#### Snippet
```java

  @AutoValue
  abstract static class ConflictResult {
    abstract Type type();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ClassMemberKey` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/ApiDiff.java`
#### Snippet
```java
  /** A per class unique identifier for a field or method. */
  @AutoValue
  public abstract static class ClassMemberKey {

    /** The simple name of the member. */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ApiDiff` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/ApiDiff.java`
#### Snippet
```java
/** The difference between two APIs. */
@AutoValue
public abstract class ApiDiff {

  /** A per class unique identifier for a field or method. */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `JavadocTag` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/JavadocTag.java`
#### Snippet
```java
@Immutable
@AutoValue
abstract class JavadocTag {

  /** Non-standard commonly-used tags which we should allow. */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `InlinabilityResult` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/InlinabilityResult.java`
#### Snippet
```java
/** Whether an API can have {@code @InlineMe} applied to it or not. */
@AutoValue
abstract class InlinabilityResult {

  abstract @Nullable InlineValidationErrorReason error();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Api` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/Inliner.java`
#### Snippet
```java

  @AutoValue
  abstract static class Api {
    private static final Splitter CLASS_NAME_SPLITTER = Splitter.on('.');

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/overloading/ParameterOrderingViolation.java`
#### Snippet
```java

  @AutoValue.Builder
  abstract static class Builder {

    abstract Builder setMethodTree(MethodTree methodTree);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ParameterOrderingViolation` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/overloading/ParameterOrderingViolation.java`
#### Snippet
```java
 */
@AutoValue
abstract class ParameterOrderingViolation {

  public abstract MethodTree methodTree();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ParameterTree` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/overloading/ParameterTree.java`
#### Snippet
```java
 */
@AutoValue
abstract class ParameterTree {

  public abstract Name getName();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `InlineMeData` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/InlineMeData.java`
#### Snippet
```java

@AutoValue
abstract class InlineMeData {

  private static final String INLINE_ME = "InlineMe";
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Parameter` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/overloading/ParameterTrie.java`
#### Snippet
```java
   */
  @AutoValue
  abstract static class Parameter {

    public abstract ParameterTree tree();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `GuardedByFlags` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedByFlags.java`
#### Snippet
```java
 */
@AutoValue
public abstract class GuardedByFlags {
  public static GuardedByFlags allOn() {
    return new AutoValue_GuardedByFlags();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `AnnotationInfo` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/AnnotationInfo.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class AnnotationInfo {
  public abstract String typeName();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `NullCheck` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullnessUtils.java`
#### Snippet
```java
   */
  @com.google.auto.value.AutoValue // fully qualified to work around JDK-7177813(?) in JDK8 build
  abstract static class NullCheck {
    /**
     * Returns the bare identifier that was checked against {@code null}, if the null check took
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `NullableAnnotationToUse` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullnessUtils.java`
#### Snippet
```java

  @AutoValue
  abstract static class NullableAnnotationToUse {
    static NullableAnnotationToUse annotationToBeImported(String qualifiedName, boolean isTypeUse) {
      return new AutoValue_NullnessUtils_NullableAnnotationToUse(
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ValidationResult` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/formatstring/FormatStringValidation.java`
#### Snippet
```java
  /** Description of an incorrect format method call. */
  @AutoValue
  public abstract static class ValidationResult {
    /** A human-readable diagnostic message. */
    public abstract String message();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TypeLiteral` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedByExpression.java`
#### Snippet
```java
   */
  @AutoValue
  public abstract static class TypeLiteral extends GuardedByExpression {
    public static TypeLiteral create(Symbol owner) {
      return new AutoValue_GuardedByExpression_TypeLiteral(Kind.TYPE_LITERAL, owner, owner.type);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Select` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedByExpression.java`
#### Snippet
```java
  /** The member access expression for a field or method. */
  @AutoValue
  public abstract static class Select extends GuardedByExpression {

    public abstract GuardedByExpression base();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `LocalVariable` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedByExpression.java`
#### Snippet
```java
  /** A local variable (or parameter), resolved as part of a lock access expression. */
  @AutoValue
  public abstract static class LocalVariable extends GuardedByExpression {
    public static LocalVariable create(Symbol owner) {
      return new AutoValue_GuardedByExpression_LocalVariable(
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ClassLiteral` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedByExpression.java`
#### Snippet
```java
  /** A 'class' literal: ClassName.class */
  @AutoValue
  public abstract static class ClassLiteral extends GuardedByExpression {
    public static ClassLiteral create(Symbol owner) {
      return new AutoValue_GuardedByExpression_ClassLiteral(Kind.CLASS_LITERAL, owner, owner.type);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `DCLInfo` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/DoubleCheckedLocking.java`
#### Snippet
```java
  /** Information about an instance of DCL. */
  @AutoValue
  abstract static class DCLInfo {
    /** The outer if statement */
    abstract IfTree outerIf();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `GuardedByValidationResult` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedByUtils.java`
#### Snippet
```java

  @AutoValue
  abstract static class GuardedByValidationResult {
    abstract String message();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Truthiness` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ConstantExpressions.java`
#### Snippet
```java
  /** Represents sets of things known to be true and false if a boolean statement evaluated true. */
  @AutoValue
  public abstract static class Truthiness {
    public abstract ImmutableSet<ConstantExpression> requiredTrue();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `PureMethodInvocation` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ConstantExpressions.java`
#### Snippet
```java
   */
  @AutoValue
  public abstract static class PureMethodInvocation {
    public abstract Symbol symbol();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ConstantEquals` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ConstantExpressions.java`
#### Snippet
```java
  /** Represents a binary equals call on two constant expressions. */
  @AutoValue
  public abstract static class ConstantEquals {
    abstract ConstantExpression lhs();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ConstantExpression` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ConstantExpressions.java`
#### Snippet
```java
  /** Represents a constant expression. */
  @AutoOneOf(ConstantExpressionKind.class)
  public abstract static class ConstantExpression {
    /** The kind of a constant expression. */
    public enum ConstantExpressionKind {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `MethodInfo` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedBySymbolResolver.java`
#### Snippet
```java
  /** Information about a method that is associated with a {@link GuardedBy} annotation. */
  @AutoValue
  abstract static class MethodInfo {
    /** The method symbol. */
    abstract MethodSymbol sym();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `LockResource` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/HeldLockAnalyzer.java`
#### Snippet
```java
  /** An abstraction over the lock classes we understand. */
  @AutoValue
  abstract static class LockResource {

    /** The fully-qualified name of the lock class. */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Evaluation` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/ResultUseRule.java`
#### Snippet
```java
  /** An evaluation that a rule makes. */
  @AutoValue
  public abstract static class Evaluation {
    /** Creates a new {@link Evaluation}. */
    public static Evaluation create(
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Changes` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/Changes.java`
#### Snippet
```java
 */
@AutoValue
abstract class Changes {

  abstract ImmutableList<Double> originalCost();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Api` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/Api.java`
#### Snippet
```java
// TODO(kak): if not, then consider renaming to `MethodSignature` or something
@AutoValue
public abstract class Api {

  /** Returns the {@code Api} representation of the given {@code symbol}. */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ParameterPair` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/ParameterPair.java`
#### Snippet
```java
 */
@AutoValue
abstract class ParameterPair {

  abstract Parameter formal();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ArgumentChangeFinder` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/ArgumentChangeFinder.java`
#### Snippet
```java
 */
@AutoValue
abstract class ArgumentChangeFinder {

  /**
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/ArgumentChangeFinder.java`
#### Snippet
```java

  @AutoValue.Builder
  abstract static class Builder {

    /** Set the distance function that {@link ArgumentChangeFinder} should use. */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `MatchedComment` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/NamedParameterComment.java`
#### Snippet
```java

  @AutoValue
  abstract static class MatchedComment {

    abstract Comment comment();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `InvocationInfo` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/InvocationInfo.java`
#### Snippet
```java
 */
@AutoValue
abstract class InvocationInfo {

  abstract Tree tree();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `MatchResult` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/AbstractCollectionIncompatibleTypeMatcher.java`
#### Snippet
```java
   */
  @AutoValue
  public abstract static class MatchResult {
    public abstract ExpressionTree sourceTree();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Parameter` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/Parameter.java`
#### Snippet
```java
 */
@AutoValue
abstract class Parameter {

  private static final ImmutableSet<String> METHODNAME_PREFIXES_TO_REMOVE =
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `RequiredType` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/IncompatibleArgumentType.java`
#### Snippet
```java
  // null requiredType: I found the type variable, but I can't bind it to any type
  @AutoValue
  abstract static class RequiredType {
    @Nullable
    abstract Type type();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `CompositeCodeTransformer` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/CompositeCodeTransformer.java`
#### Snippet
```java
/** Combines multiple {@code CodeTransformer}s into one. */
@AutoValue
public abstract class CompositeCodeTransformer implements CodeTransformer, Serializable {
  public static CodeTransformer compose(CodeTransformer... transformers) {
    return compose(ImmutableList.copyOf(transformers));
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Violation` has no concrete subclass
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafety.java`
#### Snippet
```java
   */
  @AutoValue
  public abstract static class Violation {

    public static Violation create(ConsPStack<String> path) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `RefactoringResult` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/RefactoringCollection.java`
#### Snippet
```java

  @AutoValue
  abstract static class RefactoringResult {
    abstract String message();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `PatchingOptions` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/ErrorProneOptions.java`
#### Snippet
```java

  @AutoValue
  abstract static class PatchingOptions {
    final boolean doRefactor() {
      return inPlace() || !baseDirectory().isEmpty();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/ErrorProneOptions.java`
#### Snippet
```java

    @AutoValue.Builder
    abstract static class Builder {

      abstract Builder namedCheckers(ImmutableSet<String> checkers);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `MiniDescription` has no concrete subclass
in `docgen/src/main/java/com/google/errorprone/BugPatternIndexWriter.java`
#### Snippet
```java

  @AutoValue
  abstract static class MiniDescription {
    abstract String name();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `IndexEntry` has no concrete subclass
in `docgen/src/main/java/com/google/errorprone/BugPatternIndexWriter.java`
#### Snippet
```java

  @AutoValue
  abstract static class IndexEntry {
    abstract boolean onByDefault();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Commented` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/util/Commented.java`
#### Snippet
```java
/** Class to hold AST nodes annotated with the comments that are associated with them */
@AutoValue
public abstract class Commented<T extends Tree> {

  /** Identifies the position of a comment relative to the associated treenode. */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/util/Commented.java`
#### Snippet
```java

  @AutoValue.Builder
  abstract static class Builder<T extends Tree> {

    abstract Builder<T> setTree(T tree);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Import` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/apply/ImportOrganizer.java`
#### Snippet
```java
  /** Represents an import. */
  @AutoValue
  abstract class Import {
    /** True if the import is static, false otherwise. */
    public abstract boolean isStatic();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Replacement` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/fixes/Replacement.java`
#### Snippet
```java
/** A replaced section of a source file. */
@AutoValue
public abstract class Replacement {

  /**
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ErrorProneScannerTransformer` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/scanner/ErrorProneScannerTransformer.java`
#### Snippet
```java
/** Adapter from an {@link ErrorProneScanner} to a {@link CodeTransformer}. */
@AutoValue
public abstract class ErrorProneScannerTransformer implements CodeTransformer {

  public static ErrorProneScannerTransformer create(Scanner scanner) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `AccessPathStore` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/dataflow/AccessPathStore.java`
#### Snippet
```java
 */
@AutoValue
public abstract class AccessPathStore<V extends AbstractValue<V>>
    implements Store<AccessPathStore<V>>, AccessPathValues<V> {

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `AccessPath` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/dataflow/AccessPath.java`
#### Snippet
```java
 */
@AutoValue
public abstract class AccessPath {

  /** If present, base of access path is contained Element; if absent, base is `this` */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `AnalysisParams` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/dataflow/DataFlow.java`
#### Snippet
```java

  @AutoValue
  abstract static class AnalysisParams {

    abstract ForwardTransferFunction<?, ?> transferFunction();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `CfgParams` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/dataflow/DataFlow.java`
#### Snippet
```java

  @AutoValue
  abstract static class CfgParams {
    abstract TreePath methodPath();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TypeVariableInferenceVar` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/TypeVariableInferenceVar.java`
#### Snippet
```java
 */
@AutoValue
abstract class TypeVariableInferenceVar implements InferenceVariable {
  static TypeVariableInferenceVar create(
      TypeVariableSymbol typeVar, MethodInvocationTree typeAppSite) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TypeArgInferenceVar` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/TypeArgInferenceVar.java`
#### Snippet
```java
 */
@AutoValue
abstract class TypeArgInferenceVar implements InferenceVariable {
  static TypeArgInferenceVar create(ImmutableList<Integer> typeArgSelector, Tree astNode) {
    return new AutoValue_TypeArgInferenceVar(typeArgSelector, astNode);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `MatchResult` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/matchers/ChildMultiMatcher.java`
#### Snippet
```java

  @AutoValue
  abstract static class MatchResult<T extends Tree> {
    public abstract ImmutableList<T> matchingNodes();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Matchable` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/matchers/ChildMultiMatcher.java`
#### Snippet
```java

  @AutoValue
  abstract static class Matchable<T extends Tree> {
    public abstract T tree();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TargetType` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
  /** An expression's target type, see {@link #targetType}. */
  @AutoValue
  public abstract static class TargetType {
    public abstract Type type();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TypeAndSymbol` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
  /** Pair of a {@link Type} and an optional {@link Symbol}. */
  @AutoValue
  abstract static class TypeAndSymbol {
    static TypeAndSymbol create(Type type) {
      return create(type, /*symbol=*/ null);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `MultiMatchResult` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/matchers/MultiMatcher.java`
#### Snippet
```java
   */
  @AutoValue
  abstract class MultiMatchResult<N extends Tree> {
    MultiMatchResult() {}
    /** True if the MultiMatcher matched the nodes expected. */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `MethodMatchState` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatchState.java`
#### Snippet
```java
/** The state that is propagated across a match operation for methods. */
@AutoValue
abstract class MethodMatchState implements MatchState {
  /** The type of the class in which a member method or constructor is declared. */
  abstract ExpressionTree tree();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ConstructorMatchState` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/matchers/method/ConstructorMatchState.java`
#### Snippet
```java
/** The state that is propagated across a match operation for constructors. */
@AutoValue
public abstract class ConstructorMatchState implements MatchState {
  /** The type of the class in which a member method or constructor is declared. */
  @Override
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `State` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
   */
  @AutoValue
  abstract static class State<R> {
    static <R> State<R> create(
        List<UVariableDecl> seenParameters, Unifier unifier, @Nullable R result) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `PlaceholderUnificationVisitor` has no concrete subclass
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
 */
@AutoValue
abstract class PlaceholderUnificationVisitor
    extends SimpleTreeVisitor<Choice<? extends State<? extends JCTree>>, State<?>> {

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ReceiverType` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodInvocationMatcher.java`
#### Snippet
```java
     */
    @AutoValue
    abstract class ReceiverType implements Token {
      public abstract String receiverType();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `MethodName` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodInvocationMatcher.java`
#### Snippet
```java
    /** A token limiting the name of the method being invoked. */
    @AutoValue
    abstract class MethodName implements Token {
      public abstract String methodName();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `DefinedIn` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodInvocationMatcher.java`
#### Snippet
```java
    /** A token specifying the class or interface in which the invoked method was defined. */
    @AutoValue
    abstract class DefinedIn implements Token {
      public abstract String owner();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ParameterTypes` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodInvocationMatcher.java`
#### Snippet
```java
    /** A token limiting the types of the formal parameters of the method being invoked. */
    @AutoValue
    abstract class ParameterTypes implements Token {
      public abstract ImmutableList<String> parameterTypes();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ReceiverSupertype` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodInvocationMatcher.java`
#### Snippet
```java
     */
    @AutoValue
    abstract class ReceiverSupertype implements Token {
      public abstract String receiverSupertype();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Rule` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodInvocationMatcher.java`
#### Snippet
```java
   */
  @AutoValue
  public abstract static class Rule {

    /** Builds a Rule object from a map. */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Kind` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodInvocationMatcher.java`
#### Snippet
```java
    /** A token limiting the {@link Kind} of invocation to match. */
    @AutoValue
    abstract class Kind implements Token {
      public abstract MethodKind kind();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Result` has no concrete subclass
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
    /** The result of the compilation. */
    @AutoValue
    public abstract static class Result {
      public abstract List<Diagnostic<? extends JavaFileObject>> diagnostics();

```

## RuleId[ruleID=NullableProblems]
### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `core/src/main/java/com/google/errorprone/bugpatterns/flogger/FloggerArgumentToString.java`
#### Snippet
```java
    final Supplier<String> source;
    final Type type;
    @Nullable final Character placeholder;

    private Parameter(ExpressionTree expression, char placeholder) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/InlinabilityResult.java`
#### Snippet
```java
    REUSE_OF_ARGUMENTS("Implementations cannot use an argument more than once:");

    private final @Nullable String errorMessage;

    InlineValidationErrorReason(@Nullable String errorMessage) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafety.java`
#### Snippet
```java
    @Nullable private Class<? extends Annotation> containerOfAnnotation;
    @Nullable private Class<? extends Annotation> suppressAnnotation;
    @Nullable private Class<? extends Annotation> typeParameterAnnotation;

    /** See {@link Purpose}. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafety.java`
#### Snippet
```java
  private final Class<? extends Annotation> containerOfAnnotation;
  @Nullable private final Class<? extends Annotation> suppressAnnotation;
  @Nullable private final Class<? extends Annotation> typeParameterAnnotation;

  /** Stores recursive invocations of {@link #isTypeParameterThreadSafe} */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafety.java`
#### Snippet
```java
  private final ImmutableSet<String> acceptedAnnotations;
  private final Class<? extends Annotation> containerOfAnnotation;
  @Nullable private final Class<? extends Annotation> suppressAnnotation;
  @Nullable private final Class<? extends Annotation> typeParameterAnnotation;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafety.java`
#### Snippet
```java
    private ImmutableSet<String> acceptedAnnotations = ImmutableSet.of();
    @Nullable private Class<? extends Annotation> containerOfAnnotation;
    @Nullable private Class<? extends Annotation> suppressAnnotation;
    @Nullable private Class<? extends Annotation> typeParameterAnnotation;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafety.java`
#### Snippet
```java
    private ImmutableSet<String> markerAnnotations;
    private ImmutableSet<String> acceptedAnnotations = ImmutableSet.of();
    @Nullable private Class<? extends Annotation> containerOfAnnotation;
    @Nullable private Class<? extends Annotation> suppressAnnotation;
    @Nullable private Class<? extends Annotation> typeParameterAnnotation;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `docgen/src/main/java/com/google/errorprone/BugPatternFileGenerator.java`
#### Snippet
```java

  /** The base url for links to bugpatterns. */
  @Nullable private final String baseUrl;

  public BugPatternFileGenerator(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
  }

  @Nullable private static final Class<?> CONSTANT_CASE_LABEL_TREE = constantCaseLabelTree();

  @Nullable
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/NullnessPropagationTransfer.java`
#### Snippet
```java

  /** Cached local inference results for nullability annotations on type parameters */
  @Nullable private transient InferredNullability inferenceResults;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `check_api/src/main/java/com/google/errorprone/matchers/Description.java`
#### Snippet
```java

  /** The raw link URL for the check. May be null if there is no link. */
  @Nullable private final String linkUrl;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodInvocationMatcher.java`
#### Snippet
```java

    private final Set<Node> states;
    @Nullable final Set<Node> def;
    final SetMultimap<Token, Node> mapping;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `test_helpers/src/main/java/com/google/errorprone/CompilationTestHelper.java`
#### Snippet
```java
  private final List<JavaFileObject> sources = new ArrayList<>();
  private ImmutableList<String> extraArgs = ImmutableList.of();
  @Nullable private ImmutableList<Class<?>> overrideClasspath;
  private boolean expectNoDiagnostics = false;
  private Optional<Result> expectedResult = Optional.empty();
```

## RuleId[ruleID=InstanceofIncompatibleInterface]
### RuleId[ruleID=InstanceofIncompatibleInterface]
'instanceof' incompatible interface `ArrayAccessTreeMatcher`
in `check_api/src/main/java/com/google/errorprone/scanner/ErrorProneScanner.java`
#### Snippet
```java
      annotatedTypeMatchers.add((AnnotatedTypeTreeMatcher) checker);
    }
    if (checker instanceof ArrayAccessTreeMatcher) {
      arrayAccessMatchers.add((ArrayAccessTreeMatcher) checker);
    }
```

### RuleId[ruleID=InstanceofIncompatibleInterface]
'instanceof' incompatible interface `ArrayTypeTreeMatcher`
in `check_api/src/main/java/com/google/errorprone/scanner/ErrorProneScanner.java`
#### Snippet
```java
      arrayAccessMatchers.add((ArrayAccessTreeMatcher) checker);
    }
    if (checker instanceof ArrayTypeTreeMatcher) {
      arrayTypeMatchers.add((ArrayTypeTreeMatcher) checker);
    }
```

### RuleId[ruleID=InstanceofIncompatibleInterface]
'instanceof' incompatible interface `CaseTreeMatcher`
in `check_api/src/main/java/com/google/errorprone/scanner/ErrorProneScanner.java`
#### Snippet
```java
      breakMatchers.add((BreakTreeMatcher) checker);
    }
    if (checker instanceof CaseTreeMatcher) {
      caseMatchers.add((CaseTreeMatcher) checker);
    }
```

### RuleId[ruleID=InstanceofIncompatibleInterface]
'instanceof' incompatible interface `IntersectionTypeTreeMatcher`
in `check_api/src/main/java/com/google/errorprone/scanner/ErrorProneScanner.java`
#### Snippet
```java
      instanceOfMatchers.add((InstanceOfTreeMatcher) checker);
    }
    if (checker instanceof IntersectionTypeTreeMatcher) {
      intersectionTypeMatchers.add((IntersectionTypeTreeMatcher) checker);
    }
```

### RuleId[ruleID=InstanceofIncompatibleInterface]
'instanceof' incompatible interface `LabeledStatementTreeMatcher`
in `check_api/src/main/java/com/google/errorprone/scanner/ErrorProneScanner.java`
#### Snippet
```java
      intersectionTypeMatchers.add((IntersectionTypeTreeMatcher) checker);
    }
    if (checker instanceof LabeledStatementTreeMatcher) {
      labeledStatementMatchers.add((LabeledStatementTreeMatcher) checker);
    }
```

### RuleId[ruleID=InstanceofIncompatibleInterface]
'instanceof' incompatible interface `ModifiersTreeMatcher`
in `check_api/src/main/java/com/google/errorprone/scanner/ErrorProneScanner.java`
#### Snippet
```java
      methodInvocationMatchers.add((MethodInvocationTreeMatcher) checker);
    }
    if (checker instanceof ModifiersTreeMatcher) {
      modifiersMatchers.add((ModifiersTreeMatcher) checker);
    }
```

### RuleId[ruleID=InstanceofIncompatibleInterface]
'instanceof' incompatible interface `PrimitiveTypeTreeMatcher`
in `check_api/src/main/java/com/google/errorprone/scanner/ErrorProneScanner.java`
#### Snippet
```java
      parenthesizedMatchers.add((ParenthesizedTreeMatcher) checker);
    }
    if (checker instanceof PrimitiveTypeTreeMatcher) {
      primitiveTypeMatchers.add((PrimitiveTypeTreeMatcher) checker);
    }
```

### RuleId[ruleID=InstanceofIncompatibleInterface]
'instanceof' incompatible interface `UnionTypeTreeMatcher`
in `check_api/src/main/java/com/google/errorprone/scanner/ErrorProneScanner.java`
#### Snippet
```java
      unaryMatchers.add((UnaryTreeMatcher) checker);
    }
    if (checker instanceof UnionTypeTreeMatcher) {
      unionTypeMatchers.add((UnionTypeTreeMatcher) checker);
    }
```

### RuleId[ruleID=InstanceofIncompatibleInterface]
'instanceof' incompatible interface `WildcardTreeMatcher`
in `check_api/src/main/java/com/google/errorprone/scanner/ErrorProneScanner.java`
#### Snippet
```java
      whileLoopMatchers.add((WhileLoopTreeMatcher) checker);
    }
    if (checker instanceof WildcardTreeMatcher) {
      wildcardMatchers.add((WildcardTreeMatcher) checker);
    }
```

## RuleId[ruleID=IgnoreResultOfCall]
### RuleId[ruleID=IgnoreResultOfCall]
Result of `NotMatches.value()` is ignored
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
    String name;
    try {
      matches.value();
      throw new RuntimeException("unreachable");
    } catch (MirroredTypeException e) {
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `Matches.value()` is ignored
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
    String name;
    try {
      matches.value();
      throw new RuntimeException("unreachable");
    } catch (MirroredTypeException e) {
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `ZoneId.of()` is ignored
in `core/src/main/java/com/google/errorprone/bugpatterns/InvalidZoneId.java`
#### Snippet
```java
  private static boolean isValidID(String value) {
    try {
      ZoneId.of(value);
    } catch (DateTimeException e) { // ZoneRulesException is subclass of DateTimeException
      return false;
```

## RuleId[ruleID=UnnecessaryUnboxing]
### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `core/src/main/java/com/google/errorprone/refaster/ULiteral.java`
#### Snippet
```java
      case CHAR_LITERAL:
        // Why do they do it like this?  I wish I knew.
        value = (int) ((Character) value).charValue();
        break;
      case BOOLEAN_LITERAL:
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `core/src/main/java/com/google/errorprone/bugpatterns/ComparisonOutOfRange.java`
#### Snippet
```java
      switch (literal.getKind()) {
        case DOUBLE_LITERAL:
          double doubleValue = ((Double) literalValue).doubleValue();
          return doubleValue < minValue || doubleValue > maxValue;
        case FLOAT_LITERAL:
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `core/src/main/java/com/google/errorprone/bugpatterns/ComparisonOutOfRange.java`
#### Snippet
```java
          return doubleValue < minValue || doubleValue > maxValue;
        case FLOAT_LITERAL:
          float floatValue = ((Float) literalValue).floatValue();
          return floatValue < minValue || floatValue > maxValue;
        case LONG_LITERAL:
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `core/src/main/java/com/google/errorprone/bugpatterns/ComparisonOutOfRange.java`
#### Snippet
```java
          return floatValue < minValue || floatValue > maxValue;
        case LONG_LITERAL:
          long longValue = ((Long) literalValue).longValue();
          return longValue < minValue || longValue > maxValue;
        default:
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `core/src/main/java/com/google/errorprone/bugpatterns/ComparisonOutOfRange.java`
#### Snippet
```java
          int intValue;
          if (literalValue instanceof Integer) {
            intValue = ((Integer) literalValue).intValue();
          } else if (literalValue instanceof Character) {
            intValue = ((Character) literalValue).charValue();
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `core/src/main/java/com/google/errorprone/bugpatterns/ComparisonOutOfRange.java`
#### Snippet
```java
            intValue = ((Integer) literalValue).intValue();
          } else if (literalValue instanceof Character) {
            intValue = ((Character) literalValue).charValue();
          } else if (literalValue instanceof Boolean) {
            throw new IllegalStateException(
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `core/src/main/java/com/google/errorprone/bugpatterns/XorPower.java`
#### Snippet
```java
      return NO_MATCH;
    }
    switch (lhs.intValue()) {
      case 2:
      case 10:
```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `core/src/main/java/com/google/errorprone/bugpatterns/XorPower.java`
#### Snippet
```java
                        + " evaluate to %d.",
                    state.getSourceForNode(tree), lhs ^ rhs));
    switch (lhs.intValue()) {
      case 2:
        if (rhs <= 31) {
```

## RuleId[ruleID=RedundantMethodOverride]
### RuleId[ruleID=RedundantMethodOverride]
Method `visitSwitchExpression()` is identical to its super method
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/NullnessPropagationTransfer.java`
#### Snippet
```java

  @Override
  Nullness visitSwitchExpression(SwitchExpressionNode node, SubNodeValues inputs, Updates updates) {
    return NULLABLE;
  }
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Key` is the same as one of its superclass' names
in `core/src/main/java/com/google/errorprone/refaster/URepeated.java`
#### Snippet
```java

  /** A key for a variable with count constraints. It maps to a list of expressions in a binding. */
  public static final class Key extends Bindings.Key<List<JCExpression>> {
    public Key(String name) {
      super(name);
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Key` is the same as one of its superclass' names
in `core/src/main/java/com/google/errorprone/refaster/ULocalVarIdent.java`
#### Snippet
```java
abstract class ULocalVarIdent extends UIdent {
  /** A key in a {@code Bindings} associated with a local variable of the specified name. */
  static final class Key extends Bindings.Key<LocalVarBinding> {
    Key(CharSequence name) {
      super(name.toString());
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Key` is the same as one of its superclass' names
in `core/src/main/java/com/google/errorprone/refaster/ULabeledStatement.java`
#### Snippet
```java
  }

  static class Key extends Bindings.Key<CharSequence> {
    Key(CharSequence identifier) {
      super(identifier.toString());
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Key` is the same as one of its superclass' names
in `core/src/main/java/com/google/errorprone/refaster/UFreeIdent.java`
#### Snippet
```java
@AutoValue
public abstract class UFreeIdent extends UIdent {
  static class Key extends Bindings.Key<JCExpression> {
    Key(CharSequence name) {
      super(name.toString());
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Key` is the same as one of its superclass' names
in `core/src/main/java/com/google/errorprone/refaster/UTypeVar.java`
#### Snippet
```java

  /** Bindings key linked to a {@code UTypeVar}. */
  public static final class Key extends Bindings.Key<TypeWithExpression> {
    public Key(CharSequence name) {
      super(name.toString());
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Key` is the same as one of its superclass' names
in `core/src/main/java/com/google/errorprone/refaster/UBlank.java`
#### Snippet
```java
  }

  static class Key extends Bindings.Key<List<? extends StatementTree>> {
    Key(UUID k) {
      super(k.toString());
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Visitor` is the same as one of its superclass' names
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
    ImmutableListMultimap.Builder<Symbol.TypeVariableSymbol, Type> result =
        ImmutableListMultimap.builder();
    class Visitor extends Types.DefaultTypeVisitor<Void, Type> {

      @Override
```

## RuleId[ruleID=OptionalAssignedToNull]
### RuleId[ruleID=OptionalAssignedToNull]
Optional value is compared with null
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/InferredNullability.java`
#### Snippet
```java
      return Optional.of(((ProperInferenceVar) iv).nullness());
      // ...we've already computed and memoized a nullness value for it.
    } else if ((result = inferredMemoTable.get(iv)) != null) {
      return result;
    } else {
```

## RuleId[ruleID=IfStatementWithIdenticalBranches]
### RuleId[ruleID=IfStatementWithIdenticalBranches]
'if' statement can be collapsed
in `core/src/main/java/com/google/errorprone/bugpatterns/RestrictedApiChecker.java`
#### Snippet
```java
    // Maybe find the declared object and get annotations on that...
    Attribute.Compound restrictedApi = (Attribute.Compound) ASTHelpers.getAnnotationMirror(tree);
    if (restrictedApi == null) {
      return NO_MATCH;
    }
```

## RuleId[ruleID=SimplifyOptionalCallChains]
### RuleId[ruleID=SimplifyOptionalCallChains]
Optional chain can be simplified
in `core/src/main/java/com/google/errorprone/refaster/ImportPolicy.java`
#### Snippet
```java
                .map(JCCompilationUnit::getImports)
                .map(Collection::stream)
                .orElse(Stream.of())
                .filter(whichImports::existingImportMatches)
                .map(imp -> imp.getQualifiedIdentifier().toString()))
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/NullablePrimitiveArray.java`
#### Snippet
```java
    Set<String> targets = new HashSet<>();
    Optional<Attribute> value = MoreAnnotations.getValue(attribute, "value");
    if (!value.isPresent()) {
      return false;
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/RestrictedApiChecker.java`
#### Snippet
```java
        MoreAnnotations.getValue(api, "allowlistAnnotations");
    // TODO(b/178905039): remove handling of legacy names
    if (!allowlistAnnotations.isPresent()) {
      allowlistAnnotations = MoreAnnotations.getValue(api, "whitelistAnnotations");
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/RestrictedApiChecker.java`
#### Snippet
```java
        MoreAnnotations.getValue(api, "allowlistWithWarningAnnotations");
    // TODO(b/178905039): remove handling of legacy names
    if (!allowlistWithWarningAnnotations.isPresent()) {
      allowlistWithWarningAnnotations =
          MoreAnnotations.getValue(api, "whitelistWithWarningAnnotations");
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/AssertionFailureIgnored.java`
#### Snippet
```java
    Optional<JCCatch> maybeCatchTree =
        catchesType(tryStatement, state.getSymtab().assertionErrorType, state);
    if (!maybeCatchTree.isPresent()) {
      return NO_MATCH;
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/RedundantOverride.java`
#### Snippet
```java
    MethodSymbol methodSymbol = getSymbol(tree);
    Optional<MethodSymbol> maybeSuperMethod = findSuperMethod(methodSymbol, state.getTypes());
    if (!maybeSuperMethod.isPresent()) {
      return NO_MATCH;
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/StaticMockMember.java`
#### Snippet
```java
        SuggestedFixes.removeModifiers(varTree, state, Modifier.STATIC);

    if (!optionalFix.isPresent()) {
      return NO_MATCH;
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Optional chain can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMockChecker.java`
#### Snippet
```java
              .extract(tree, state)
              .map(Optional::of)
              .orElseGet(() -> other.extract(tree, state));
    }
  }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryAnonymousClass.java`
#### Snippet
```java
    Optional<SuggestedFix> methodReferenceReplacement =
        replaceUsesWithMethodReference(newName, varSym, implementation, state);
    if (!methodReferenceReplacement.isPresent()) {
      return NO_MATCH;
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/JUnitParameterMethodNotFound.java`
#### Snippet
```java
            .findFirst();

    if (!parametersAnnotation.isPresent()) {
      return Description.NO_MATCH;
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/JUnitParameterMethodNotFound.java`
#### Snippet
```java
        getParamAssignmentTree(annotationsArguments, /* parameterName= */ "source");

    if (!paramSourceAssignmentTree.isPresent()) {
      return ImmutableSet.of();
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/DoubleBraceInitialization.java`
#### Snippet
```java
            .filter(type -> type.constructorMatcher.matches(tree, state))
            .findFirst();
    if (!collectionType.isPresent()) {
      return NO_MATCH;
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/MissingDefault.java`
#### Snippet
```java
    Optional<? extends CaseTree> maybeDefault =
        tree.getCases().stream().filter(c -> c.getExpression() == null).findFirst();
    if (!maybeDefault.isPresent()) {
      Description.Builder description = buildDescription(tree);
      if (!tree.getCases().isEmpty()) {
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/AnnotateFormatMethod.java`
#### Snippet
```java
    Optional<? extends VariableTree> argumentsParameter =
        findParameterWithSymbol(enclosingParameters, formatArgs);
    if (!formatParameter.isPresent() || !argumentsParameter.isPresent()) {
      return Description.NO_MATCH;
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/AnnotateFormatMethod.java`
#### Snippet
```java
    Optional<? extends VariableTree> argumentsParameter =
        findParameterWithSymbol(enclosingParameters, formatArgs);
    if (!formatParameter.isPresent() || !argumentsParameter.isPresent()) {
      return Description.NO_MATCH;
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/StringSplitter.java`
#### Snippet
```java
    }
    Optional<String> regexAsLiteral = convertRegexToLiteral(constValue);
    if (!regexAsLiteral.isPresent()) {
      // Can't convert the regex to a literal string: have to treat it as a regex.
      return String.format("onPattern(%s)", argSource);
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/StringSplitter.java`
#### Snippet
```java
    }
    Optional<Fix> fix = buildFix(tree, state);
    if (!fix.isPresent()) {
      return NO_MATCH;
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableSetForContains.java`
#### Snippet
```java
      }
    }
    if (!firstReplacement.isPresent()) {
      return Description.NO_MATCH;
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractReturnValueIgnored.java`
#### Snippet
```java
  private Description checkLostType(MethodInvocationTree tree, VisitorState state) {
    Optional<Type> optionalType = lostType(state);
    if (!optionalType.isPresent()) {
      return NO_MATCH;
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractReturnValueIgnored.java`
#### Snippet
```java
  public Description matchReturn(ReturnTree tree, VisitorState state) {
    Optional<Type> optionalType = lostType(state);
    if (!optionalType.isPresent()) {
      return NO_MATCH;
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractReturnValueIgnored.java`
#### Snippet
```java
    Description description =
        matcher.get().matches(tree, state) ? describeReturnValueIgnored(tree, state) : NO_MATCH;
    if (!lostType(state).isPresent() || !description.equals(NO_MATCH)) {
      return description;
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractReturnValueIgnored.java`
#### Snippet
```java
     */
    if (parent.getKind() == EXPRESSION_STATEMENT
        && !constantExpressions.constantExpression(invocationTree, state).isPresent()) {
      ImmutableSet<String> identifiersInScope =
          findAllIdents(state).stream().map(v -> v.name.toString()).collect(toImmutableSet());
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/SwitchDefault.java`
#### Snippet
```java
    Optional<? extends CaseTree> maybeDefault =
        tree.getCases().stream().filter(c -> c.getExpression() == null).findAny();
    if (!maybeDefault.isPresent()) {
      return NO_MATCH;
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/ApiDiffChecker.java`
#### Snippet
```java

  private boolean classOrEnclosingClassIsForbiddenByAnnotation(Symbol clazz, VisitorState state) {
    if (!alsoForbidApisAnnotated.isPresent()) {
      return false;
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/flogger/FloggerRedundantIsEnabled.java`
#### Snippet
```java
    // If then-block contains exactly one expression and it is a `log` invocation, extract it.
    Optional<MethodInvocationTree> methodCall = extractLoneLogInvocation(ifTree, state);
    if (!methodCall.isPresent()) {
      return NO_MATCH;
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableRefactoring.java`
#### Snippet
```java
                })
            .findFirst();
    if (!immutableImport.isPresent()) {
      return Description.NO_MATCH;
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedByUtils.java`
#### Snippet
```java
    Optional<GuardedByExpression> bound =
        GuardedByBinder.bindString(guard, GuardedBySymbolResolver.from(tree, visitorState), flags);
    if (!bound.isPresent()) {
      return null;
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedByUtils.java`
#### Snippet
```java
      Optional<GuardedByExpression> boundGuard =
          GuardedByBinder.bindString(guard, GuardedBySymbolResolver.from(tree, state), flags);
      if (!boundGuard.isPresent()) {
        return GuardedByValidationResult.invalid("could not resolve guard");
      }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/HeldLockAnalyzer.java`
#### Snippet
```java
        GuardedByBinder.bindExpression(
            Iterables.getOnlyElement(newClassTree.getArguments()), state, flags);
    if (!lockExpression.isPresent()) {
      return locks;
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/HeldLockAnalyzer.java`
#### Snippet
```java
                GuardedBySymbolResolver.from(tree, visitorState.withPath(getCurrentPath())),
                flags);
        if (!guard.isPresent()) {
          invalidLock(tree, locks, guardString);
          continue;
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/HeldLockAnalyzer.java`
#### Snippet
```java
            ExpectedLockCalculator.from(
                (JCTree.JCExpression) tree, guard.get(), visitorState, flags);
        if (!boundGuard.isPresent()) {
          // We couldn't resolve a guarded by expression in the current scope, so we can't
          // guarantee the access is protected and must report an error to be safe.
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/HeldLockAnalyzer.java`
#### Snippet
```java
          GuardedByBinder.bindExpression(guardedMemberExpression, state, flags);

      if (!guardedMember.isPresent()) {
        return Optional.empty();
      }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `check_api/src/main/java/com/google/errorprone/util/Comments.java`
#### Snippet
```java
    CharSequence sourceCode = state.getSourceCode();
    Optional<Integer> endPosition = computeEndPosition(tree, sourceCode, state);
    if (!endPosition.isPresent()) {
      return noComments(arguments);
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/InferredNullability.java`
#### Snippet
```java
              .reduce(Nullness::leastUpperBound); // use least upper bound (lub) to combine
      // 2. If not, resolve successors and use them as upper bounds
      if (!result.isPresent()) {
        result =
            constraintGraph.successors(iv).stream()
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/InferredNullability.java`
#### Snippet
```java
      }

      checkState(!inferredMemoTable.put(iv, result).isPresent());
      return result;
    }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
    Optional<Nullness> fromAnnotations =
        extractExplicitNullness(declaredType, argSelector.isEmpty() ? decl : null);
    if (!fromAnnotations.isPresent()) {
      // Check declared type before inferred type so that type annotations on the declaration take
      // precedence (just like declaration annotations) over annotations on the inferred type.
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
      fromAnnotations = NullnessAnnotations.fromAnnotationsOn(inferredType);
    }
    if (!fromAnnotations.isPresent()) {
      if (declaredType instanceof TypeVariable) {
        // Check bounds second so explicit annotations take precedence. Even for bounds we still use
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
        null,
        (typeVarRef, selector, unused) -> {
          if (!extractExplicitNullness(typeVarRef, selector.isEmpty() ? decl : null).isPresent()) {
            result.add(TypeArgInferenceVar.create(ImmutableList.copyOf(selector), sourceNode));
          }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
    Optional<Nullness> fromAnnotations =
        extractExplicitNullness(lType, argSelector.isEmpty() ? decl : null);
    if (!fromAnnotations.isPresent()) {
      if (lType instanceof TypeVariable) {
        fromAnnotations = NullnessAnnotations.getUpperBound((TypeVariable) lType);
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
        ((JCExpression) sourceNode).type,
        (declaredType, selector, inferredType) -> {
          if (!extractExplicitNullness(type, selector.isEmpty() ? decl : null).isPresent()) {
            consumer.accept(TypeArgInferenceVar.create(ImmutableList.copyOf(selector), sourceNode));
          }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodInvocationMatcher.java`
#### Snippet
```java
      for (Node node : curr) {
        for (Map.Entry<Optional<Token>, Node> entry : nfa.row(node).entrySet()) {
          if (!entry.getKey().isPresent()) {
            acceptsAny.add(entry.getValue());
          }
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
    }
    Optional<ExpressionTree> maybeExistingArgument = findArgument(annotation, parameterName);
    if (!maybeExistingArgument.isPresent()) {
      return SuggestedFix.builder()
          .prefixWith(
```

### RuleId[ruleID=SimplifyOptionalCallChains]
Can be replaced with 'isEmpty()'
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
    }
    Optional<ExpressionTree> maybeExistingArgument = findArgument(annotation, parameterName);
    if (!maybeExistingArgument.isPresent()) {
      return SuggestedFix.builder()
          .prefixWith(
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `core/src/main/java/com/google/errorprone/refaster/Bindings.java`
#### Snippet
```java
  public <V> V getBinding(Key<V> key) {
    checkNotNull(key);
    return (V) super.get(key);
  }

```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/InlinabilityResult.java`
#### Snippet
```java
      public Void visitLambdaExpression(LambdaExpressionTree node, Void unused) {
        // we override so we can ignore the node.getParameters()
        return super.scan(node.getBody(), null);
      }

```

## RuleId[ruleID=SlowListContainsAll]
### RuleId[ruleID=SlowListContainsAll]
Call to 'list.containsAll(collection)' may have poor performance
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/InvalidTargetingOnScopingAnnotation.java`
#### Snippet
```java
        if (target != null
            && // Unlikely to occur, but just in case Target isn't on the classpath.
            !Arrays.asList(target.value()).containsAll(REQUIRED_ELEMENT_TYPES)) {
          return describeMatch(targetTree, replaceTargetAnnotation(target, targetTree));
        }
```

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `core/src/main/java/com/google/errorprone/bugpatterns/TypeParameterShadowing.java`
#### Snippet
```java

    String replacementName;
    while (superTypeVars.contains(replacementName = baseName + typeVarNum)) {
      typeVarNum++;
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `core/src/main/java/com/google/errorprone/bugpatterns/ConstantPatternCompile.java`
#### Snippet
```java
  private static @Nullable String inferName(VariableTree tree, VisitorState state) {
    String name;
    if ((name = fromName(tree)) != null) {
      return name;
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `core/src/main/java/com/google/errorprone/bugpatterns/ConstantPatternCompile.java`
#### Snippet
```java
      return name;
    }
    if ((name = fromInitializer(tree)) != null) {
      return name;
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `core/src/main/java/com/google/errorprone/bugpatterns/ConstantPatternCompile.java`
#### Snippet
```java
      return name;
    }
    if ((name = fromUse(tree, state)) != null) {
      return name;
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `check_api/src/main/java/com/google/errorprone/util/ErrorProneTokens.java`
#### Snippet
```java
      String text = this.text;
      if (text == null) {
        this.text = text = new String(reader.getRawCharacters());
      }
      return text;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `check_api/src/main/java/com/google/errorprone/apply/SourceFile.java`
#### Snippet
```java
    String line;
    try {
      while ((line = reader.readLine()) != null) {
        if (reader.getLineNumber() >= startLine) {
          lines.add(line);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `check_api/src/main/java/com/google/errorprone/names/NeedlemanWunschEditDistance.java`
#### Snippet
```java
    int[][] iMatrix = new int[sourceLength + 1][targetLength + 1];

    mMatrix[0][0] = dMatrix[0][0] = iMatrix[0][0] = 0;

    // Any edit script that changes i chars of source into zero
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `check_api/src/main/java/com/google/errorprone/names/NeedlemanWunschEditDistance.java`
#### Snippet
```java
    int[][] iMatrix = new int[sourceLength + 1][targetLength + 1];

    mMatrix[0][0] = dMatrix[0][0] = iMatrix[0][0] = 0;

    // Any edit script that changes i chars of source into zero
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `check_api/src/main/java/com/google/errorprone/names/NeedlemanWunschEditDistance.java`
#### Snippet
```java
    // using an edit script ending in deletions.
    for (int i = 1; i <= sourceLength; i++) {
      mMatrix[i][0] = dMatrix[i][0] = scriptCost(openGapCost, continueGapCost, i);

      // Make the iMatrix entries impossibly expensive, so they'll be
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `check_api/src/main/java/com/google/errorprone/names/NeedlemanWunschEditDistance.java`
#### Snippet
```java
      // the cost of changing a 0-length string into a j-length string, using
      // an edit script ending in insertions.
      mMatrix[0][j] = iMatrix[0][j] = scriptCost(openGapCost, continueGapCost, j);

      // Make the dMatrix entries impossibly expensive, so they'll be
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `check_api/src/main/java/com/google/errorprone/dataflow/AccessPath.java`
#### Snippet
```java
    Tree tree = fieldAccess.getTree();
    boolean isFieldAccess;
    while ((isFieldAccess = TreeUtils.isFieldAccess(tree)) || isAutoValueAccessor(tree)) {
      if (isFieldAccess) {
        pathBuilder.add(TreeUtils.getFieldName(tree));
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/InferredNullability.java`
#### Snippet
```java
      return Optional.of(((ProperInferenceVar) iv).nullness());
      // ...we've already computed and memoized a nullness value for it.
    } else if ((result = inferredMemoTable.get(iv)) != null) {
      return result;
    } else {
```

## RuleId[ruleID=CodeBlock2Expr]
### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/LambdaFunctionalInterface.java`
#### Snippet
```java
    getMappingForApply(mappedFunction)
        .ifPresent(
            apply -> {
              tree.accept(
                  new TreeScanner<Void, Void>() {
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
  public static Matcher<ExpressionTree> nullLiteral() {
    return (tree, state) -> {
      return tree.getKind() == Kind.NULL_LITERAL;
    };
  }
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
        matchSingleStatementBlock(matchExpressionReturn(expressionTreeMatcher));
    return (methodTree, state) -> {
      return matcher.matches(methodTree.getBody(), state);
    };
  }
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
  public static Matcher<ExpressionTree> intLiteral(int value) {
    return (tree, state) -> {
      return tree.getKind() == Kind.INT_LITERAL
          && value == ((Integer) ((LiteralTree) tree).getValue());
    };
```

## RuleId[ruleID=SimplifiableBooleanExpression]
### RuleId[ruleID=SimplifiableBooleanExpression]
`!(trueIsArray ^ types.isArray(getType(cond.getFalseExpression())))` can be simplified to 'trueIsArray==types.isArray(getType(cond.getFalseExpression()))'
in `core/src/main/java/com/google/errorprone/bugpatterns/InexactVarargsConditional.java`
#### Snippet
```java
    ConditionalExpressionTree cond = (ConditionalExpressionTree) arg;
    boolean trueIsArray = types.isArray(getType(cond.getTrueExpression()));
    if (!(trueIsArray ^ types.isArray(getType(cond.getFalseExpression())))) {
      return NO_MATCH;
    }
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `pw` is accessed in both synchronized and unsynchronized contexts
in `docgen_processor/src/main/java/com/google/errorprone/DocGenProcessor.java`
#### Snippet
```java
  private final Gson gson = new Gson();

  private PrintWriter pw;

  /** {@inheritDoc} */
```

## RuleId[ruleID=EmptyMethod]
### RuleId[ruleID=EmptyMethod]
The method is empty
in `check_api/src/main/java/com/google/errorprone/VisitorState.java`
#### Snippet
```java
  // The default no-op implementation of DescriptionListener. We use this instead of null so callers
  // of getDescriptionListener() don't have to do null-checking.
  private static void nullListener(Description description) {}

  /**
```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `check_api/src/main/java/com/google/errorprone/apply/FileDestination.java`
#### Snippet
```java
  void writeFile(SourceFile file) throws IOException;

  void flush() throws IOException;
}

```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `check_api/src/main/java/com/google/errorprone/matchers/method/MatchState.java`
#### Snippet
```java

  /** The method being matched. */
  MethodSymbol sym();

  /** The method's formal parameter types. */
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/EqualsUnsafeCast.java`
#### Snippet
```java

    new TreePathScanner<Void, Void>() {
      private boolean methodInvoked = false;
      private final List<Type> checkedTypes = new ArrayList<>();

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/LoopConditionChecker.java`
#### Snippet
```java
    }

    private boolean modified = false;
    private final ImmutableSet<Symbol.VarSymbol> variables;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryAnonymousClass.java`
#### Snippet
```java
    private final VisitorState state;
    private final SuggestedFix.Builder fix = SuggestedFix.builder();
    private boolean failed = false;

    ReplaceUsesScanner(Symbol sym, String newName, VisitorState state) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/EqualsGetClass.java`
#### Snippet
```java

    /** Whether we managed to rewrite a {@code getClass}. */
    private boolean matchedGetClass = false;

    /** Whether we failed to generate a satisfactory fix for a boolean replacement. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/EqualsGetClass.java`
#### Snippet
```java

    /** Whether we failed to generate a satisfactory fix for a boolean replacement. */
    private boolean failed = false;

    private EqualsFixer(Symbol parameter, ClassSymbol classSymbol, VisitorState visitorState) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/EqualsReference.java`
#### Snippet
```java
  private static class TreeScannerEquals extends TreeScanner<Void, VarSymbol> {

    private boolean hasIllegalEquals = false;
    private final MethodTree methodTree;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/InstanceOfAndCastMatchWrongType.java`
#### Snippet
```java
    int earliestStart = Integer.MAX_VALUE;
    private InstanceOfTree relevantTree;
    private boolean notApplicable = false;
    private final VisitorState state;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryLambda.java`
#### Snippet
```java

      boolean fixable = true;
      boolean inInitializer = false;

      @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/MixedMutabilityReturnType.java`
#### Snippet
```java
    private final SuggestedFix.Builder fix = SuggestedFix.builder();
    private boolean builderifiedVariable = false;
    private boolean failed = false;

    private ReturnTypeFixer(Symbol symbol, TypeDetails details, VisitorState state) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/MixedMutabilityReturnType.java`
#### Snippet
```java
    private final VisitorState state;
    private final SuggestedFix.Builder fix = SuggestedFix.builder();
    private boolean builderifiedVariable = false;
    private boolean failed = false;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/MixedMutabilityReturnType.java`
#### Snippet
```java
      private final List<ReturnTree> immutableReturns = new ArrayList<>();
      private final List<ReturnTree> mutableReturns = new ArrayList<>();
      private boolean skipMethods = false;

      @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeEscape.java`
#### Snippet
```java
        memoize(() -> suppressedRegions(getState()));

    private int position = 0;
    private char currentCharacter = 0;
    private boolean isUnicode = false;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeEscape.java`
#### Snippet
```java

    private int position = 0;
    private char currentCharacter = 0;
    private boolean isUnicode = false;
    private int lastBackslash = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeEscape.java`
#### Snippet
```java
    private char currentCharacter = 0;
    private boolean isUnicode = false;
    private int lastBackslash = 0;

    private UnicodeScanner(String source, VisitorState state) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeEscape.java`
#### Snippet
```java
    private int position = 0;
    private char currentCharacter = 0;
    private boolean isUnicode = false;
    private int lastBackslash = 0;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/ModifiedButNotUsed.java`
#### Snippet
```java
    private final List<TreePath> usageSites = new ArrayList<>();

    private boolean isUsed = false;

    private UnusedScanner(Symbol symbol, VisitorState state, Matcher<IdentifierTree> matcher) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/InconsistentHashCode.java`
#### Snippet
```java

    // We bail out if we got any unknown method calls to avoid reporting false positives.
    private boolean failed = false;

    private static FieldAccessFinder scanMethod(
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedVariable.java`
#### Snippet
```java
    private final Map<Symbol, TreePath> assignmentSite = new HashMap<>();

    private TreePath currentExpressionStatement = null;

    private final Map<Symbol, TreePath> unusedElements;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedVariable.java`
#### Snippet
```java
    // This is true when we are processing a `return` statement. Elements used in return statement
    // must not be considered unused.
    private boolean inReturnStatement = false;
    // When this greater than zero, the usage of identifiers are real because they are in a method
    // call.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedVariable.java`
#### Snippet
```java
    private boolean leftHandSideAssignment = false;
    // When this greater than zero, the usage of identifiers are real.
    private int inArrayAccess = 0;
    // This is true when we are processing a `return` statement. Elements used in return statement
    // must not be considered unused.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedVariable.java`
#### Snippet
```java
    // When this greater than zero, the usage of identifiers are real because they are in a method
    // call.
    private int inMethodCall = 0;

    private final Map<Symbol, TreePath> assignmentSite = new HashMap<>();
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedVariable.java`
#### Snippet
```java

  private static final class FilterUsedVariables extends TreePathScanner<Void, Void> {
    private boolean leftHandSideAssignment = false;
    // When this greater than zero, the usage of identifiers are real.
    private int inArrayAccess = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/MethodCanBeStatic.java`
#### Snippet
```java
    Map<MethodSymbol, MethodDetails> nodes = new HashMap<>();
    new TreePathScanner<Void, Void>() {
      private int suppressions = 0;

      @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/FunctionalInterfaceMethodChanged.java`
#### Snippet
```java
  private static class BehaviorPreservingChecker extends SimpleTreeVisitor<Boolean, VisitorState> {

    private boolean inBoxedVoidReturningMethod = false;
    private final Symbol methodToCall;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/FieldCanBeLocal.java`
#### Snippet
```java

    new TreePathScanner<Void, Void>() {
      boolean inMethod = false;

      @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/AndroidInjectionBeforeSuper.java`
#### Snippet
```java
    }

    private boolean foundSuper = false;

    @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/InvalidBlockTag.java`
#### Snippet
```java

    private final Set<DocTree> fixedTags = new HashSet<>();
    private int codeTagNestedDepth = 0;

    private InvalidTagChecker(
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java

    private final Deque<Integer> startPosStack = new ArrayDeque<>();
    private boolean containsAnotherTag = false;

    private RangesFinder(VisitorState state) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/InlinabilityResult.java`
#### Snippet
```java
        meth.getParameters().stream().map(ASTHelpers::getSymbol).collect(toImmutableSet());
    new TreeScanner<Void, Void>() {
      LambdaExpressionTree currentLambdaTree = null;

      @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/CanIgnoreReturnValueSuggester.java`
#### Snippet
```java
      private final Type enclosingClassType;
      private final Type methodReturnType;
      private boolean atLeastOneReturn = false;
      private boolean allReturnsIgnorable = true;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `docgen/src/main/java/com/google/errorprone/DocGenTool.java`
#### Snippet
```java
        description = "The base url for links to bugpatterns",
        arity = 1)
    private String baseUrl = null;
  }

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `check_api/src/main/java/com/google/errorprone/ErrorProneAnalyzer.java`
#### Snippet
```java
  }

  private int errorProneErrors = 0;

  @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `check_api/src/main/java/com/google/errorprone/ErrorProneOptions.java`
#### Snippet
```java
    private boolean disableWarningsInGeneratedCode = false;
    private boolean dropErrorsToWarnings = false;
    private boolean enableAllChecksAsWarnings = false;
    private boolean disableAllChecks = false;
    private boolean isTestOnlyTarget = false;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `check_api/src/main/java/com/google/errorprone/ErrorProneOptions.java`
#### Snippet
```java
    private boolean enableAllChecksAsWarnings = false;
    private boolean disableAllChecks = false;
    private boolean isTestOnlyTarget = false;
    private boolean ignoreSuppressionAnnotations = false;
    private boolean ignoreLargeCodeGenerators = true;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `check_api/src/main/java/com/google/errorprone/ErrorProneOptions.java`
#### Snippet
```java
    private boolean disableAllWarnings = false;
    private boolean disableWarningsInGeneratedCode = false;
    private boolean dropErrorsToWarnings = false;
    private boolean enableAllChecksAsWarnings = false;
    private boolean disableAllChecks = false;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `check_api/src/main/java/com/google/errorprone/ErrorProneOptions.java`
#### Snippet
```java
    private boolean ignoreUnknownChecks = false;
    private boolean disableAllWarnings = false;
    private boolean disableWarningsInGeneratedCode = false;
    private boolean dropErrorsToWarnings = false;
    private boolean enableAllChecksAsWarnings = false;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `check_api/src/main/java/com/google/errorprone/ErrorProneOptions.java`
#### Snippet
```java
    private boolean disableAllChecks = false;
    private boolean isTestOnlyTarget = false;
    private boolean ignoreSuppressionAnnotations = false;
    private boolean ignoreLargeCodeGenerators = true;
    private Map<String, Severity> severityMap = new HashMap<>();
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `check_api/src/main/java/com/google/errorprone/ErrorProneOptions.java`
#### Snippet
```java
  private static class Builder {
    private boolean ignoreUnknownChecks = false;
    private boolean disableAllWarnings = false;
    private boolean disableWarningsInGeneratedCode = false;
    private boolean dropErrorsToWarnings = false;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `check_api/src/main/java/com/google/errorprone/ErrorProneOptions.java`
#### Snippet
```java
    private boolean dropErrorsToWarnings = false;
    private boolean enableAllChecksAsWarnings = false;
    private boolean disableAllChecks = false;
    private boolean isTestOnlyTarget = false;
    private boolean ignoreSuppressionAnnotations = false;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `check_api/src/main/java/com/google/errorprone/ErrorProneOptions.java`
#### Snippet
```java

  private static class Builder {
    private boolean ignoreUnknownChecks = false;
    private boolean disableAllWarnings = false;
    private boolean disableWarningsInGeneratedCode = false;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `check_api/src/main/java/com/google/errorprone/util/SideEffectAnalysis.java`
#### Snippet
```java
public final class SideEffectAnalysis extends TreeScanner<Void, Void> {

  private boolean hasSideEffect = false;

  private SideEffectAnalysis() {}
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `check_api/src/main/java/com/google/errorprone/util/ErrorProneTokens.java`
#### Snippet
```java
    private final CommentStyle style;

    private String text = null;

    public CommentWithTextAndPosition(
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `check_api/src/main/java/com/google/errorprone/util/Comments.java`
#### Snippet
```java

    private Commented.Builder<ExpressionTree> currentCommentedResultBuilder = null;
    private Commented.Builder<ExpressionTree> previousCommentedResultBuilder = null;
    private final ImmutableList.Builder<Commented<ExpressionTree>> resultBuilder =
        ImmutableList.builder();
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `check_api/src/main/java/com/google/errorprone/util/Comments.java`
#### Snippet
```java
    private final LineMap lineMap;

    private Commented.Builder<ExpressionTree> currentCommentedResultBuilder = null;
    private Commented.Builder<ExpressionTree> previousCommentedResultBuilder = null;
    private final ImmutableList.Builder<Commented<ExpressionTree>> resultBuilder =
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `check_api/src/main/java/com/google/errorprone/util/Comments.java`
#### Snippet
```java
    private final LineMap lineMap;

    private int tokensOnCurrentLine = 0;
    private int currentLineNumber = -1;
    private boolean previousLineEmpty = true;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `test_helpers/src/main/java/com/google/errorprone/CompilationTestHelper.java`
#### Snippet
```java
  private ImmutableList<String> extraArgs = ImmutableList.of();
  @Nullable private ImmutableList<Class<?>> overrideClasspath;
  private boolean expectNoDiagnostics = false;
  private Optional<Result> expectedResult = Optional.empty();
  private LookForCheckNameInDiagnostic lookForCheckNameInDiagnostic =
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `test_helpers/src/main/java/com/google/errorprone/CompilationTestHelper.java`
#### Snippet
```java
      LookForCheckNameInDiagnostic.YES;

  private boolean run = false;

  private CompilationTestHelper(ScannerSupplier scannerSupplier, String checkName, Class<?> clazz) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `test_helpers/src/main/java/com/google/errorprone/BugCheckerRefactoringTestHelper.java`
#### Snippet
```java
  private String importOrder = "static-first";

  private boolean run = false;

  private BugCheckerRefactoringTestHelper(Class<?> clazz, ScannerSupplier scannerSupplier) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `test_helpers/src/main/java/com/google/errorprone/BugCheckerRefactoringTestHelper.java`
#### Snippet
```java
  private FixChooser fixChooser = FixChoosers.FIRST;
  private ImmutableList<String> options = ImmutableList.of();
  private boolean allowBreakingChanges = false;
  private String importOrder = "static-first";

```

## RuleId[ruleID=RedundantImplements]
### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `MethodInvocationTreeMatcher`
in `core/src/main/java/com/google/errorprone/bugpatterns/BareDotMetacharacter.java`
#### Snippet
```java
    altNames = {"InvalidPatternSyntax"})
public class BareDotMetacharacter extends AbstractPatternSyntaxChecker
    implements MethodInvocationTreeMatcher {

  @Override
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `ReturnTreeMatcher`
in `core/src/main/java/com/google/errorprone/bugpatterns/FutureReturnValueIgnored.java`
#### Snippet
```java
    documentSuppression = false)
public final class FutureReturnValueIgnored extends AbstractReturnValueIgnored
    implements ReturnTreeMatcher {

  private static final Matcher<ExpressionTree> IGNORED_METHODS =
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `Comparable`
in `check_api/src/main/java/com/google/errorprone/util/Visibility.java`
#### Snippet
```java
 * establish whether a given {@link Tree} should be visible.
 */
public enum Visibility implements Comparable<Visibility> {
  // In order of ascending visibility.
  NONE {
```

## RuleId[ruleID=ExceptionNameDoesntEndWithException]
### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `IllegalGuardedBy` does not end with 'Exception'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/IllegalGuardedBy.java`
#### Snippet
```java
 * @author cushon@google.com (Liam Miller-Cushon)
 */
public class IllegalGuardedBy extends RuntimeException {
  public IllegalGuardedBy(String message) {
    super(message);
```

## RuleId[ruleID=StringRepeatCanBeUsed]
### RuleId[ruleID=StringRepeatCanBeUsed]
Can be replaced with 'String.repeat()'
in `core/src/main/java/com/google/errorprone/bugpatterns/PreconditionsInvalidPlaceholder.java`
#### Snippet
```java
    builder.deleteCharAt(builder.length() - 1);
    builder.append(" [%s");
    for (int i = 1; i < missing; i++) {
      builder.append(", %s");
    }
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `core/src/main/java/com/google/errorprone/bugpatterns/formatstring/FormatStringValidation.java`
#### Snippet
```java
          return null;
        case ARRAY:
          return new Object[0];
        default:
          throw new AssertionError(type.getKind());
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `check_api/src/main/java/com/google/errorprone/util/ErrorProneTokens.java`
#### Snippet
```java
    this.offset = offset;
    scannerFactory = ScannerFactory.instance(context);
    char[] buffer = source == null ? new char[] {} : source.toCharArray();
    commentSavingTokenizer = new CommentSavingTokenizer(scannerFactory, buffer, buffer.length);
  }
```

## RuleId[ruleID=RedundantStringFormatCall]
### RuleId[ruleID=RedundantStringFormatCall]
Redundant call to `format()`
in `core/src/main/java/com/google/errorprone/bugpatterns/StringSplitter.java`
#### Snippet
```java
                  /* startPos= */ state.getEndPosition(arrayAccessTree.getExpression()),
                  /* endPos= */ getStartPosition(arrayAccessTree.getIndex()),
                  format(", "))
              .replace(
                  state.getEndPosition(arrayAccessTree.getIndex()),
```

## RuleId[ruleID=UnstableTypeUsedInSignature]
### RuleId[ruleID=UnstableTypeUsedInSignature]
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.escape.CharEscaper'
in `check_api/src/main/java/com/google/errorprone/util/SourceCodeEscapers.java`
#### Snippet
```java
   * >The Java Language Specification</a> for more details.
   */
  public static CharEscaper javaCharEscaper() {
    return JAVA_CHAR_ESCAPER;
  }
```

### RuleId[ruleID=UnstableTypeUsedInSignature]
Method must be marked with '@com.google.common.annotations.Beta' annotation because its signature references unstable type 'com.google.common.collect.ImmutableRangeSet'
in `check_api/src/main/java/com/google/errorprone/bugpatterns/BugChecker.java`
#### Snippet
```java

  /** Computes a RangeSet of code regions which are suppressed by this bug checker. */
  public ImmutableRangeSet<Integer> suppressedRegions(VisitorState state) {
    ImmutableRangeSet.Builder<Integer> suppressedRegions = ImmutableRangeSet.builder();
    new TreeScanner<Void, Void>() {
```

## RuleId[ruleID=CastConflictsWithInstanceof]
### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'JCBinary' type conflicts with preceding 'instanceof BinaryTree' check
in `core/src/main/java/com/google/errorprone/bugpatterns/OperatorPrecedence.java`
#### Snippet
```java
    }
    if (TreeInfo.opPrec(((JCBinary) tree).getTag())
        == TreeInfo.opPrec(((JCBinary) parent).getTag())) {
      return NO_MATCH;
    }
```

### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'MethodInvocationTree' type conflicts with preceding 'instanceof ExpressionTree' check
in `core/src/main/java/com/google/errorprone/bugpatterns/ConstantPatternCompile.java`
#### Snippet
```java
      return null;
    }
    ExpressionTree matchTree = ((MethodInvocationTree) grandParent).getArguments().get(0);
    if (matchTree instanceof IdentifierTree) {
      return convertToConstantName(((IdentifierTree) matchTree).getName().toString());
```

### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'JCAssignOp' type conflicts with preceding 'instanceof CompoundAssignmentTree' check
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedVariable.java`
#### Snippet
```java
                SuggestedFix.replace(
                    tree.getStartPosition(),
                    ((JCAssignOp) tree).getExpression().getStartPosition(),
                    "");
            keepSideEffectsFix.merge(replacement);
```

### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'JCAssign' type conflicts with preceding 'instanceof AssignmentTree' check
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedVariable.java`
#### Snippet
```java
            encounteredSideEffects = true;
            keepSideEffectsFix.replace(
                tree.getStartPosition(), ((JCAssign) tree).getExpression().getStartPosition(), "");
            removeSideEffectsFix.replace(statement, "");
            continue;
```

### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'JCMethodDecl' type conflicts with preceding 'instanceof MethodTree' check
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/UnsafeWildcard.java`
#### Snippet
```java
    if (method instanceof MethodTree) {
      return checkForUnsafeNullAssignment(
          ((JCMethodDecl) method).getReturnType().type, tree.getExpression(), state);
    } else if (method instanceof LambdaExpressionTree) {
      Type targetType = ((JCLambda) method).getDescriptorType(state.getTypes()).getReturnType();
```

### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'JCLambda' type conflicts with preceding 'instanceof LambdaExpressionTree' check
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/UnsafeWildcard.java`
#### Snippet
```java
          ((JCMethodDecl) method).getReturnType().type, tree.getExpression(), state);
    } else if (method instanceof LambdaExpressionTree) {
      Type targetType = ((JCLambda) method).getDescriptorType(state.getTypes()).getReturnType();
      return checkForUnsafeNullAssignment(targetType, tree.getExpression(), state);
    }
```

### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'JCMethodInvocation' type conflicts with preceding 'instanceof MethodInvocationTree' check
in `check_api/src/main/java/com/google/errorprone/dataflow/AccessPath.java`
#### Snippet
```java
    }

    JCMethodInvocation invocationTree = (JCMethodInvocation) tree;
    // methodSelect is always either a field access (e.g. `obj.foo()`) or identifier (e.g. `foo()`)
    JCExpression methodSelect = invocationTree.getMethodSelect();
```

### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'JCVariableDecl' type conflicts with preceding 'instanceof VariableTree' check
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/TrustingNullnessAnalysis.java`
#### Snippet
```java
    Tree decl = fieldDeclPath.getLeaf();
    checkArgument(
        decl instanceof VariableTree && ((JCVariableDecl) decl).sym.getKind() == ElementKind.FIELD,
        "Leaf of fieldDeclPath must be a field declaration: %s",
        decl);
```

### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'JCMemberReference' type conflicts with preceding 'instanceof MemberReferenceTree' check
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
    }
    if (tree instanceof MemberReferenceTree) {
      return ((JCMemberReference) tree).sym;
    }
    if (tree instanceof JCAnnotatedType) {
```

### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'JCTypeParameter' type conflicts with preceding 'instanceof TypeParameterTree' check
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
    }
    if (tree instanceof TypeParameterTree) {
      Type type = ((JCTypeParameter) tree).type;
      return type == null ? null : type.tsym;
    }
```

### RuleId[ruleID=CastConflictsWithInstanceof]
Cast to 'JCTree' type conflicts with preceding 'instanceof MethodTree' check
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
    if (node.getExpression() != null && currentMethodOrInitializerOrLambda instanceof MethodTree) {
      MethodSymbol sym =
          ((MethodSymbol) TreeInfo.symbolFor((JCTree) currentMethodOrInitializerOrLambda));
      generateConstraintsForWrite(sym.getReturnType(), sym, node.getExpression(), node);
    }
```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
Variable `currentCharacter` initializer `0` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeEscape.java`
#### Snippet
```java

    private int position = 0;
    private char currentCharacter = 0;
    private boolean isUnicode = false;
    private int lastBackslash = 0;
```

### RuleId[ruleID=UnusedAssignment]
Variable `origVariable` initializer `null` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/HidingField.java`
#### Snippet
```java
      VisitorState visitorState) {
    Iterator<VariableTree> origVariableIterator = originalClassMembers.iterator();
    VariableTree origVariable = null;

    while (origVariableIterator.hasNext()) {
```

### RuleId[ruleID=UnusedAssignment]
Variable `parameterType` initializer `null` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/NullOptional.java`
#### Snippet
```java
    Iterator<VarSymbol> parameters = symbol.getParameters().iterator();
    VarSymbol parameter = null;
    Type parameterType = null;
    for (ExpressionTree argument : arguments) {
      parameter = parameters.hasNext() ? parameters.next() : parameter;
```

### RuleId[ruleID=UnusedAssignment]
Variable `i` initializer `0` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/time/TimeUnitMismatch.java`
#### Snippet
```java
  private static ImmutableList<String> fixUnitCamelCase(List<String> words) {
    ImmutableList.Builder<String> out = ImmutableList.builderWithExpectedSize(words.size());
    int i = 0;
    for (i = 0; i < words.size() - 1; i++) {
      String current = words.get(i);
```

### RuleId[ruleID=UnusedAssignment]
Variable `enclosingMethod` initializer `null` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/ProvidesNull.java`
#### Snippet
```java

    TreePath path = state.getPath();
    MethodTree enclosingMethod = null;
    while (true) {
      if (path == null || path.getLeaf() instanceof LambdaExpressionTree) {
```

### RuleId[ruleID=UnusedAssignment]
Variable `trailingComment` initializer `null` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/NoCanIgnoreReturnValueOnClasses.java`
#### Snippet
```java
      public Void visitMethod(MethodTree methodTree, Void unused) {
        if (shouldAddCirv(methodTree, state)) {
          String trailingComment = null;

          if (methodTree.getReturnType() == null) { // constructor
```

### RuleId[ruleID=UnusedAssignment]
Variable `diff` initializer `null` is redundant
in `check_api/src/main/java/com/google/errorprone/apply/PatchFileDestination.java`
#### Snippet
```java
      List<String> originalLines = LINE_SPLITTER.splitToList(oldSource);

      Patch<String> diff = null;
      try {
        diff = DiffUtils.diff(originalLines, LINE_SPLITTER.splitToList(newSource));
```

## RuleId[ruleID=NonExceptionNameEndsWithException]
### RuleId[ruleID=NonExceptionNameEndsWithException]
Non-exception class name `DeadException` ends with 'Exception'
in `core/src/main/java/com/google/errorprone/bugpatterns/DeadException.java`
#### Snippet
```java
    summary = "Exception created but not thrown",
    severity = ERROR)
public class DeadException extends BugChecker implements NewClassTreeMatcher {

  public static final Matcher<Tree> MATCHER =
```

### RuleId[ruleID=NonExceptionNameEndsWithException]
Non-exception class name `ThrowsUncheckedException` ends with 'Exception'
in `core/src/main/java/com/google/errorprone/bugpatterns/ThrowsUncheckedException.java`
#### Snippet
```java
    summary = "Unchecked exceptions do not need to be declared in the method signature.",
    severity = SUGGESTION)
public class ThrowsUncheckedException extends BugChecker implements MethodTreeMatcher {
  @Override
  public Description matchMethod(MethodTree tree, VisitorState state) {
```

### RuleId[ruleID=NonExceptionNameEndsWithException]
Non-exception class name `UnusedException` ends with 'Exception'
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedException.java`
#### Snippet
```java
    tags = STYLE,
    documentSuppression = false)
public final class UnusedException extends BugChecker implements CatchTreeMatcher {

  private static final ImmutableSet<Modifier> VISIBILITY_MODIFIERS =
```

### RuleId[ruleID=NonExceptionNameEndsWithException]
Non-exception class name `AbstractLikeException` ends with 'Exception'
in `core/src/main/java/com/google/errorprone/bugpatterns/ThrowSpecificExceptions.java`
#### Snippet
```java

  @AutoValue
  abstract static class AbstractLikeException {
    abstract Matcher<ExpressionTree> matcher();

```

## RuleId[ruleID=TypeParameterExtendsObject]
### RuleId[ruleID=TypeParameterExtendsObject]
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `core/src/main/java/com/google/errorprone/refaster/Bindings.java`
#### Snippet
```java

  @Override
  public void putAll(Map<? extends Key<?>, ? extends Object> map) {
    standardPutAll(map);
  }
```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Condition `keyShaped` is always `true` when reached
in `core/src/main/java/com/google/errorprone/bugpatterns/HashtableContains.java`
#### Snippet
```java
        // definitely a value
        result.addFix(replaceMethodName(tree, state, "containsValue"));
      } else if (valueShaped && keyShaped) {
        // ambiguous
        result.addFix(replaceMethodName(tree, state, "containsValue"));
```

### RuleId[ruleID=ConstantValue]
Condition `!blockChecksForInterruptedException(catchTree.getBlock(), state)` is always `true`
in `core/src/main/java/com/google/errorprone/bugpatterns/InterruptedExceptionSwallowed.java`
#### Snippet
```java
        ImmutableSet<Type> thrownExceptions = getThrownExceptions(tree, state);
        if (thrownExceptions.stream().anyMatch(t -> isSubtype(t, interrupted, state))
            && !blockChecksForInterruptedException(catchTree.getBlock(), state)
            && !(exceptionIsRethrown(catchTree, catchTree.getParameter(), state)
                && methodDeclaresInterruptedException(state.findEnclosing(MethodTree.class), state))
```

### RuleId[ruleID=ConstantValue]
Condition `invalidChronoFields != null` is always `true`
in `core/src/main/java/com/google/errorprone/bugpatterns/time/TemporalAccessorGetChronoField.java`
#### Snippet
```java
    String declaringType = sym.owner.getQualifiedName().toString();
    ImmutableList<ChronoField> invalidChronoFields = UNSUPPORTED.get(declaringType);
    if (invalidChronoFields != null && isDefinitelyInvalidChronoField(tree, invalidChronoFields)) {
      return describeMatch(tree);
    }
```

### RuleId[ruleID=ConstantValue]
Condition `isGeneric` is always `true` when reached
in `check_api/src/main/java/com/google/errorprone/VisitorState.java`
#### Snippet
```java
      ClassSymbol arraySymbol = getSymtab().arrayClass;
      return new ArrayType(baseType, arraySymbol);
    } else if (!isArray && isGeneric) {
      // Generic type, not array.
      com.sun.tools.javac.util.List<Type> typeParamsCopy =
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/com/google/errorprone/refaster/RefasterRule.java`
#### Snippet
```java
                  .<Set<String>>map(t -> t.expressionArgumentTypes().keySet())
                  .reduce(Sets::intersection)
                  .get());
      checkArgument(
          missingArguments.isEmpty(),
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/com/google/errorprone/refaster/UPlaceholderStatement.java`
#### Snippet
```java
                    }
                  }));
      return UPlaceholderExpression.copier(arguments(), inliner).copy(binding.get(), inliner);
    } catch (UncheckedCouldNotResolveImportException e) {
      throw e.getCause();
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedTypeParameter.java`
#### Snippet
```java
                t -> t.pos() <= getStartPosition(typeParameter) && t.kind().equals(TokenKind.LT))
            .findFirst()
            .get()
            .pos();
    int endPos =
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedTypeParameter.java`
#### Snippet
```java
                        && (t.kind().equals(TokenKind.GT) || t.kind().equals(TokenKind.GTGT)))
            .findFirst()
            .get()
            .endPos();
    return SuggestedFix.replace(startPos, endPos, "");
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/com/google/errorprone/bugpatterns/DirectInvocationOnMock.java`
#### Snippet
```java
                .filter(t -> !(t instanceof TypeCastTree))
                .findFirst()
                .get();
        var receiver = getReceiver(tree);
        if (isMock(receiver)
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryAssignment.java`
#### Snippet
```java
            getTokens(source, getStartPosition(tree), state.context);
        int equalsPos =
            findLast(tokens.stream().filter(t -> t.kind().equals(TokenKind.EQ))).get().pos();
        description.addFix(
            SuggestedFix.builder()
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryAssignment.java`
#### Snippet
```java
                                  isSubtype(getType(anno), state.getTypeFromString(fanno), state)))
              .findFirst()
              .get();
      return description
          .setMessage(
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/com/google/errorprone/bugpatterns/StaticImports.java`
#### Snippet
```java
        return String.format("import %s;", canonicalName());
      } else {
        return String.format("import static %s.%s;", canonicalName(), simpleName().get());
      }
    }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/com/google/errorprone/bugpatterns/CheckedExceptionNotThrown.java`
#### Snippet
```java
            .findFirst()
            .map(ErrorProneToken::pos)
            .get();
    return SuggestedFix.replace(startPos, endPos, "");
  }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/com/google/errorprone/bugpatterns/MemoizeConstantVisitorStateLookups.java`
#### Snippet
```java
            .map(cs -> cs.entireTree)
            .min(comparingInt(ASTHelpers::getStartPosition))
            .get(); // Always succeeds, lookups is not empty.
    return describeMatch(fixTree, fix.build());
  }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/com/google/errorprone/bugpatterns/AnnotationPosition.java`
#### Snippet
```java
        shouldBeBefore.stream().map(ASTHelpers::getStartPosition).max(naturalOrder()).get();
    int smallestTypeAnnotationPosition =
        shouldBeAfter.stream().map(ASTHelpers::getStartPosition).min(naturalOrder()).get();
    return largestNonTypeAnnotationPosition < smallestTypeAnnotationPosition;
  }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractReturnValueIgnored.java`
#### Snippet
```java
                  .filter(t -> t.kind() == RPAREN)
                  .findFirst()
                  .get()
                  .pos();
          fix.replace(closingParen, closingParen + 1, "");
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullnessUtils.java`
#### Snippet
```java
                .filter(t -> t.kind() == DOT)
                .findFirst()
                .get()
                .pos();
        return nullableAnnotationToUse.fixPostfixingOnto(lastDot, state, suppressionToRemove);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
    checkNotNull(classTree);
    List<String> members = Lists.asList(firstMember, otherMembers);
    return addMembers(classTree, state, where, members).get();
  }

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
                  state.getOffsetTokensForNode(originalModifiers).stream()
                      .filter(tok -> tok.kind().equals(TokenKind.MONKEYS_AT)))
              .get()
              .pos();
      insertPos =
```

## RuleId[ruleID=IOResource]
### RuleId[ruleID=IOResource]
'LineNumberReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `check_api/src/main/java/com/google/errorprone/apply/SourceFile.java`
#### Snippet
```java

  private List<String> getLines(int startLine, int endLine) {
    LineNumberReader reader = new LineNumberReader(new StringReader(sourceBuilder.toString()));
    List<String> lines = new ArrayList<>(endLine - startLine + 1);
    String line;
```

## RuleId[ruleID=OptionalIsPresent]
### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedByUtils.java`
#### Snippet
```java
    Optional<GuardedByExpression> bound =
        GuardedByBinder.bindString(guard, GuardedBySymbolResolver.from(tree, visitorState), flags);
    if (!bound.isPresent()) {
      return null;
    }
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Reachability` has only 'static' members, and lacks a 'private' constructor
in `check_api/src/main/java/com/google/errorprone/util/Reachability.java`
#### Snippet
```java

/** An implementation of JLS 14.21 reachability. */
public class Reachability {

  /**
```

## RuleId[ruleID=UnnecessarySemicolon]
### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `core/src/main/java/com/google/errorprone/bugpatterns/Finally.java`
#### Snippet
```java
    KEEP_LOOKING,
    NO_MATCH,
    FOUND_ERROR;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `core/src/main/java/com/google/errorprone/bugpatterns/ComparisonContractViolated.java`
#### Snippet
```java
    ZERO,
    POSITIVE_CONSTANT,
    NONCONSTANT;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `core/src/main/java/com/google/errorprone/bugpatterns/TruthGetOrDefault.java`
#### Snippet
```java
    SAME,
    DIFFERENT,
    UNKNOWN;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `core/src/main/java/com/google/errorprone/bugpatterns/TryFailThrowable.java`
#### Snippet
```java
  enum HasOtherParameters {
    TRUE,
    FALSE;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `core/src/main/java/com/google/errorprone/bugpatterns/TryFailThrowable.java`
#### Snippet
```java
    JAVA_LANG_THROWABLE,
    SOME_ASSERTION_FAILURE,
    ;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/InlinabilityResult.java`
#### Snippet
```java
    PACKAGE,
    PROTECTED,
    PUBLIC;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedByExpression.java`
#### Snippet
```java
    LOCAL_VARIABLE,
    SELECT,
    ERROR;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `check_api/src/main/java/com/google/errorprone/predicates/type/Array.java`
#### Snippet
```java
      return type != null && state.getTypes().isArray(type);
    }
  };
}

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `test_helpers/src/main/java/com/google/errorprone/DiagnosticTestHelper.java`
#### Snippet
```java
  enum LookForCheckNameInDiagnostic {
    YES,
    NO;
  }

```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Argument `getLabel()` might be null
in `core/src/main/java/com/google/errorprone/refaster/UContinue.java`
#### Snippet
```java

  private ULabeledStatement.Key key() {
    return new ULabeledStatement.Key(getLabel());
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `thenChoose` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/UStaticIdent.java`
#### Snippet
```java
      return classIdent()
          .unify(symbol.getEnclosingElement(), unifier)
          .thenChoose(unifications(getName(), symbol.getSimpleName()))
          .thenChoose(unifications(memberType(), symbol.asType()));
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `charValue` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/ULiteral.java`
#### Snippet
```java
      case CHAR_LITERAL:
        // Why do they do it like this?  I wish I knew.
        value = (int) ((Character) value).charValue();
        break;
      case BOOLEAN_LITERAL:
```

### RuleId[ruleID=DataFlowIssue]
Unboxing of `value` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/ULiteral.java`
#### Snippet
```java
        break;
      case BOOLEAN_LITERAL:
        value = ((Boolean) value) ? 1 : 0;
        break;
      default:
```

### RuleId[ruleID=DataFlowIssue]
Unboxing of `getValue()` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/ULiteral.java`
#### Snippet
```java
  public UExpression negate() {
    checkState(getKind() == Kind.BOOLEAN_LITERAL, "Cannot negate a non-Boolean literal");
    return booleanLit(!((Boolean) getValue()));
  }
}
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getQualifiedName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/UClassIdent.java`
#### Snippet
```java

  public static UClassIdent create(ClassSymbol sym) {
    return create(ASTHelpers.outermostClass(sym).getQualifiedName(), sym.getQualifiedName());
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `inline` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/UReturn.java`
#### Snippet
```java
  @Override
  public JCReturn inline(Inliner inliner) throws CouldNotResolveImportException {
    return inliner.maker().Return(getExpression().inline(inliner));
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `allowsIdentity` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderMethod.java`
#### Snippet
```java
      ImmutableMap<UVariableDecl, ImmutableClassToInstanceMap<Annotation>> parameters,
      ClassToInstanceMap<Annotation> annotations) {
    boolean allowsIdentity = annotations.getInstance(Placeholder.class).allowsIdentity();
    Class<? extends Matcher<? super ExpressionTree>> matchesClass =
        annotations.containsKey(Matches.class)
```

### RuleId[ruleID=DataFlowIssue]
Argument `annotations.getInstance(Matches.class)` might be null
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderMethod.java`
#### Snippet
```java
    Class<? extends Matcher<? super ExpressionTree>> matchesClass =
        annotations.containsKey(Matches.class)
            ? UTemplater.getValue(annotations.getInstance(Matches.class))
            : null;
    Class<? extends Matcher<? super ExpressionTree>> notMatchesClass =
```

### RuleId[ruleID=DataFlowIssue]
Argument `annotations.getInstance(NotMatches.class)` might be null
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderMethod.java`
#### Snippet
```java
    Class<? extends Matcher<? super ExpressionTree>> notMatchesClass =
        annotations.containsKey(NotMatches.class)
            ? UTemplater.getValue(annotations.getInstance(NotMatches.class))
            : null;
    Predicate<Tree.Kind> allowedKinds =
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `value` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderMethod.java`
#### Snippet
```java
    Predicate<Tree.Kind> allowedKinds =
        annotations.containsKey(OfKind.class)
            ? Predicates.<Tree.Kind>in(Arrays.asList(annotations.getInstance(OfKind.class).value()))
            : Predicates.<Tree.Kind>alwaysTrue();
    class PlaceholderMatcher implements Matcher<ExpressionTree> {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `or` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/ControlFlowVisitor.java`
#### Snippet
```java
      }
      if (!seenDefault) {
        result = result.or(NEVER_EXITS);
      }
      return result;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getQualifiedName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/Inliner.java`
#### Snippet
```java
                  .classReference(
                      inliner,
                      ASTHelpers.outermostClass(classSym).getQualifiedName().toString(),
                      classSym.getQualifiedName().toString());
          List<JCExpression> argExprs = List.nil();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getSymbol` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/UFreeIdent.java`
#### Snippet
```java
                  for (ULocalVarIdent.Key key :
                      Iterables.filter(unifier.getBindings().keySet(), ULocalVarIdent.Key.class)) {
                    if (identSym == unifier.getBinding(key).getSymbol()) {
                      return false;
                    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `value` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/ExpressionTemplate.java`
#### Snippet
```java
    Context context = inliner.getContext();
    if (annotations().containsKey(UseImportPolicy.class)) {
      ImportPolicy.bind(context, annotations().getInstance(UseImportPolicy.class).value());
    } else {
      ImportPolicy.bind(context, ImportPolicy.IMPORT_TOP_LEVEL);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `consume` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/UPlaceholderStatement.java`
#### Snippet
```java
                          (State<? extends JCStatement> stmtState) ->
                              stmtState.withResult(
                                  consumptionState.result().consume(stmtState.result()))));
      if (verification.allRequiredMatched()) {
        realOptions = choiceToHere.or(realOptions);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `consumedStatements` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/UPlaceholderStatement.java`
#### Snippet
```java
              .containsAll(placeholder().requiredParameters())) {
            Unifier resultUnifier = consumptionState.unifier().fork();
            int nConsumedStatements = consumptionState.result().consumedStatements();
            ImmutableList<? extends StatementTree> remainingStatements =
                initState
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toString` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/UPlaceholderExpression.java`
#### Snippet
```java
            JCExpression prevBinding = resultUnifier.getBinding(placeholder().exprKey());
            if (prevBinding != null) {
              return prevBinding.toString().equals(state.result().toString())
                  ? Optional.of(resultUnifier)
                  : Optional.<Unifier>absent();
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `result` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/UPlaceholderExpression.java`
#### Snippet
```java
              return Optional.absent();
            }
            result.type = expr.type;
            resultUnifier.putBinding(placeholder().exprKey(), result);
            return Optional.of(resultUnifier);
```

### RuleId[ruleID=DataFlowIssue]
Argument `getLongLiteral(literalTree, state)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/LongLiteralLowerCaseSuffix.java`
#### Snippet
```java
      return Description.NO_MATCH;
    }
    StringBuilder longLiteral = new StringBuilder(getLongLiteral(literalTree, state));
    longLiteral.setCharAt(longLiteral.length() - 1, 'L');
    Fix fix = SuggestedFix.replace(literalTree, longLiteral.toString());
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/NestedInstanceOfConditions.java`
#### Snippet
```java
        return visitorState
            .getSourceForNode(variableExpressionTree)
            .equals(visitorState.getSourceForNode(((AssignmentTree) tree).getVariable()));
      }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `type` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/Template.java`
#### Snippet
```java
    for (UTypeVar typeVar : typeVariables(unifier.getContext())) {
      varsBuffer.add(inliner.inlineAsVar(typeVar));
      bindingsBuffer.add(unifier.getBinding(typeVar.key()).type());
    }
    List<Type> vars = varsBuffer.toList();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `type` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/Template.java`
#### Snippet
```java
      List<Type> bounds = types.getBounds(inliner.inlineAsVar(typeVar));
      bounds = types.subst(bounds, vars, bindings);
      if (!types.isSubtypeUnchecked(unifier.getBinding(typeVar.key()).type(), bounds, warner)) {
        logger.log(
            FINE,
```

### RuleId[ruleID=DataFlowIssue]
Argument `templateExpressions(modifiers.getAnnotations())` might be null
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
    return UModifiers.create(
        ((JCModifiers) modifiers).flags,
        cast(templateExpressions(modifiers.getAnnotations()), UAnnotation.class));
  }

```

### RuleId[ruleID=DataFlowIssue]
Argument `templateExpressions(tree.getAnnotations())` might be null
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
  public UAnnotatedType visitAnnotatedType(AnnotatedTypeTree tree, Void v) {
    return UAnnotatedType.create(
        cast(templateExpressions(tree.getAnnotations()), UAnnotation.class),
        template(tree.getUnderlyingType()));
  }
```

### RuleId[ruleID=DataFlowIssue]
Argument `templateStatements(tree.getUpdate())` might be null
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
        templateStatements(tree.getInitializer()),
        (tree.getCondition() == null) ? null : template(tree.getCondition()),
        cast(templateStatements(tree.getUpdate()), UExpressionStatement.class),
        template(tree.getStatement()));
  }
```

### RuleId[ruleID=DataFlowIssue]
Argument `templateStatements(decl.getParameters())` might be null
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
        decl.getName(),
        templateType(decl.getReturnType()),
        cast(templateStatements(decl.getParameters()), UVariableDecl.class),
        templateExpressions(decl.getThrows()),
        (UBlock) template(decl.getBody()));
```

### RuleId[ruleID=DataFlowIssue]
Argument `templateStatements(tree.getParameters())` might be null
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
    return ULambda.create(
        ((JCLambda) tree).paramKind,
        cast(templateStatements(tree.getParameters()), UVariableDecl.class),
        (UTree<?>) template(tree.getBody()));
  }
```

### RuleId[ruleID=DataFlowIssue]
Argument `templateTrees(tree.getResources())` might be null
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
    @SuppressWarnings({"unchecked", "rawtypes"})
    ImmutableList<UTree<?>> resources =
        cast(templateTrees(tree.getResources()), (Class<UTree<?>>) (Class) UTree.class);
    UBlock block = visitBlock(tree.getBlock(), null);
    ImmutableList.Builder<UCatch> catchesBuilder = ImmutableList.builder();
```

### RuleId[ruleID=DataFlowIssue]
Argument `templateExpressions(tree.getAnnotations())` might be null
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
        tree.getName(),
        templateTypeExpressions(tree.getBounds()),
        cast(templateExpressions(tree.getAnnotations()), UAnnotation.class));
  }

```

### RuleId[ruleID=DataFlowIssue]
Dereference of `getType(tree.getExpression())` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/WrongOneof.java`
#### Snippet
```java
      SwitchTree tree, ConstantExpression constantReceiver, VisitorState state) {
    ImmutableSet<String> getters =
        enumValues(getType(tree.getExpression()).tsym).stream()
            .map(WrongOneof::getter)
            .collect(toImmutableSet());
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isUnion` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/AssertionFailureIgnored.java`
#### Snippet
```java
            catchTree -> {
              Type type = ASTHelpers.getType(catchTree.getParameter());
              return (type.isUnion()
                      ? Streams.stream(((UnionClassType) type).getAlternativeTypes())
                      : Stream.of(type))
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `accept` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
      void validate(MethodInvocationTree tree, String argument) {
        MethodSymbol sym = ASTHelpers.getSymbol(tree);
        VALIDATORS.get(sym.owner.getQualifiedName().toString()).accept(argument);
      }
    },
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `Throwables.getCauseAs(e.getCause(), NumberFormatException.class)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
          return;
        } catch (InvocationTargetException e) {
          throw Throwables.getCauseAs(e.getCause(), NumberFormatException.class);
        }
      }
```

### RuleId[ruleID=DataFlowIssue]
Unboxing of `constValue(tree, Double.class)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/FloatingPointLiteralPrecision.java`
#### Snippet
```java
    switch (type.getKind()) {
      case DOUBLE:
        value = new BigDecimal(Double.toString(constValue(tree, Double.class)));
        suffix = "";
        break;
```

### RuleId[ruleID=DataFlowIssue]
Unboxing of `constValue(tree, Float.class)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/FloatingPointLiteralPrecision.java`
#### Snippet
```java
        break;
      case FLOAT:
        value = new BigDecimal(Float.toString(constValue(tree, Float.class)));
        suffix = "f";
        break;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `charAt` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/FloatingPointLiteralPrecision.java`
#### Snippet
```java
    }
    String source = state.getSourceForNode(tree);
    switch (source.charAt(source.length() - 1)) {
      case 'f':
      case 'F':
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `indexOf` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/SelfAssignment.java`
#### Snippet
```java
  public Description describeForVarDecl(VariableTree tree, VisitorState state) {
    String varDeclStr = state.getSourceForNode(tree);
    int equalsIndex = varDeclStr.indexOf('=');
    if (equalsIndex < 0) {
      throw new IllegalStateException(
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `replace` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnsafeLocaleUsage.java`
#### Snippet
```java
            arg instanceof JCLiteral
                ? String.format(
                    "\"%s\"", ASTHelpers.constValue(arg, String.class).replace("_", "-"))
                : String.format(
                    "%s.replace(\"_\", \"-\")",
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `replaceFirst` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueBuilderDefaultsInConstructor.java`
#### Snippet
```java
                  && calledSymbol.getModifiers().contains(Modifier.ABSTRACT);
            })
        .map(t -> state.getSourceForNode(t).replaceFirst("^this\\.", ""))
        .collect(toImmutableList());
  }
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `ASTHelpers.getType(node)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/CompileTimeConstantChecker.java`
#### Snippet
```java
      ExpressionTree node, VisitorState state, List<Integer> compileTimeConstantAnnotationIndexes) {
    MethodSymbol descriptorSymbol =
        (MethodSymbol) state.getTypes().findDescriptorSymbol(ASTHelpers.getType(node).tsym);
    ImmutableSet.Builder<Symbol.MethodSymbol> methods = ImmutableSet.builder();
    methods.add(descriptorSymbol);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `subSequence` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractUseSwitch.java`
#### Snippet
```java
    int start = ((JCTree) statements.get(0)).getStartPosition();
    int end = state.getEndPosition(getLast(statements));
    return state.getSourceCode().subSequence(start, end);
  }

```

### RuleId[ruleID=DataFlowIssue]
Argument `optionalOfInvocationTree` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/OptionalOfRedundantMethod.java`
#### Snippet
```java
    ImmutableList.Builder<SuggestedFix> fixesBuilder = ImmutableList.builder();
    fixesBuilder.add(
        SuggestedFixes.renameMethodInvocation(optionalOfInvocationTree, nullableMethodName, state));

    if (state.getPath().getParentPath().getLeaf() instanceof ExpressionStatementTree) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/LockNotBeforeTry.java`
#### Snippet
```java
    return receiver != null
        && LOCK.matches(node, state)
        && state.getSourceForNode(receiver).equals(state.getSourceForNode(lockee));
  }
}
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/LockNotBeforeTry.java`
#### Snippet
```java
    return receiver != null
        && UNLOCK.matches(node, state)
        && state.getSourceForNode(receiver).equals(state.getSourceForNode(lockee));
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `subSequence` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/LockNotBeforeTry.java`
#### Snippet
```java
                .replace(start, end, "")
                .postfixWith(
                    lockStatement, state.getSourceCode().subSequence(start, end).toString())
                .build();
        return buildDescription(lockInvocation)
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getKind` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/StringBuilderInitWithChar.java`
#### Snippet
```java
      ExpressionTree argument = tree.getArguments().get(0);
      Type type = ASTHelpers.getType(argument);
      if (type.getKind() == TypeKind.CHAR) {
        if (argument.getKind() == Kind.CHAR_LITERAL) {
          char ch = (Character) ((LiteralTree) argument).getValue();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getTag` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryBoxedVariable.java`
#### Snippet
```java
      } else {
        Type unboxedReceiverType = state.getTypes().unboxedType(ASTHelpers.getType(receiver));
        if (unboxedReceiverType.getTag() == expressionType.getTag()) {
          // someInteger.intValue() can just become someInt.
          fixBuilder.replace(castInvocation, state.getSourceForNode(receiver));
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `receiverType` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryBoxedVariable.java`
#### Snippet
```java
          String.format(
              "%s.%s(%s)",
              receiverType.tsym.getSimpleName(),
              methodSelect.getIdentifier(),
              state.getSourceForNode(receiver)));
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isPrimitive` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryBoxedVariable.java`
#### Snippet
```java
        if (enclosingMethod != null) {
          Type returnType = ASTHelpers.getType(enclosingMethod.getReturnType());
          if (!returnType.isPrimitive()) {
            boxedUsageFound.add((VarSymbol) nodeSymbol);
          }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isPrimitive` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryBoxedVariable.java`
#### Snippet
```java
    private boolean checkAssignmentExpression(ExpressionTree expression) {
      Type expressionType = ASTHelpers.getType(expression);
      if (expressionType.isPrimitive()) {
        return false;
      }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `subSequence` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/AssertThrowsMultipleStatements.java`
#### Snippet
```java
    fix.prefixWith(
        state.findEnclosing(StatementTree.class),
        state.getSourceCode().subSequence(startPosition, endPosition).toString());
    return describeMatch(last, fix.build());
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isUnion` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ThrowIfUncheckedKnownChecked.java`
#### Snippet
```java
        public boolean matches(ExpressionTree tree, VisitorState state) {
          Type type = ASTHelpers.getType(tree);
          if (type.isUnion()) {
            for (TypeMirror alternative : ((UnionType) type).getAlternatives()) {
              if (!isKnownCheckedException(state, (Type) alternative)) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getTypeArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractAsKeyOfSetOrMap.java`
#### Snippet
```java
  private Description matchType(ExpressionTree tree, VisitorState state) {
    if (CONSTRUCTS_SET_OR_MAP.matches(tree, state)) {
      List<Type> argumentTypes = ASTHelpers.getResultType(tree).getTypeArguments();
      if (argumentTypes.isEmpty()) {
        return Description.NO_MATCH;
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `ASTHelpers.getType(param)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/TypeNameShadowing.java`
#### Snippet
```java
                            sym ->
                                sym.getSimpleName()
                                    .equals(ASTHelpers.getType(param).tsym.getSimpleName()))
                        .orNull())
            .filter(Objects::nonNull)
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getKind` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryLongToIntConversion.java`
#### Snippet
```java
    for (ExpressionTree arg : tree.getArguments()) {
      // The argument's type must be int.
      if (!ASTHelpers.getType(arg).getKind().equals(TypeKind.INT)) {
        continue;
      }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getKind` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/NarrowingCompoundAssignment.java`
#### Snippet
```java
  private static boolean twiddlingConstantBitsOk(CompoundAssignmentTree tree) {
    int shift;
    switch (ASTHelpers.getType(tree.getVariable()).getKind()) {
      case BYTE:
        shift = 8;
```

### RuleId[ruleID=DataFlowIssue]
Argument `getType(tree.getVariable())` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/NarrowingCompoundAssignment.java`
#### Snippet
```java
    String message =
        identifyBadCast(
            getType(tree.getVariable()), getType(tree.getExpression()), state.getTypes());
    if (message == null) {
      return Description.NO_MATCH;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toString` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/NarrowingCompoundAssignment.java`
#### Snippet
```java

    // e.g. 's *= 42' -> 's = (short) (s * 42)'
    String castType = getType(tree.getVariable()).toString();
    String replacement = String.format("%s = (%s) (%s %s %s)", var, castType, var, op, expr);
    return Optional.of(SuggestedFix.replace(tree, replacement));
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getKind` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/LongDoubleConversion.java`
#### Snippet
```java

  private void checkArgument(ExpressionTree argument, VisitorState state) {
    if (!getType(argument).getKind().equals(TypeKind.LONG)) {
      return;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isPrimitive` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ImplementAssertionWithChaining.java`
#### Snippet
```java
     */
    boolean bothPrimitives =
        getType(binaryTree.getLeftOperand()).isPrimitive()
            && getType(binaryTree.getRightOperand()).isPrimitive();
    boolean bothEnums =
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isPrimitive` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ImplementAssertionWithChaining.java`
#### Snippet
```java
    boolean bothPrimitives =
        getType(binaryTree.getLeftOperand()).isPrimitive()
            && getType(binaryTree.getRightOperand()).isPrimitive();
    boolean bothEnums =
        isEnum(binaryTree.getLeftOperand(), state) && isEnum(binaryTree.getRightOperand(), state);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toString` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java
  public Description matchCompilationUnit(CompilationUnitTree tree, VisitorState state) {
    RangeSet<Integer> violations = TreeRangeSet.create();
    String sourceCode = state.getSourceCode().toString();

    for (int i = 0; i < sourceCode.length(); ++i) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `replaceAll` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/NarrowCalculation.java`
#### Snippet
```java

  private static String forceLiteralType(ExpressionTree tree, Type targetType, VisitorState state) {
    return state.getSourceForNode(tree).replaceAll("[LlFfDd]$", "")
        + suffixForType(targetType, state);
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `matches` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessarySetDefault.java`
#### Snippet
```java
    }
    Matcher<ExpressionTree> defaultType = DEFAULTS.get(defaultTypeName);
    if (!defaultType.matches(tree.getArguments().get(1), state)) {
      return NO_MATCH;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessarySetDefault.java`
#### Snippet
```java

  static Matcher<ExpressionTree> sourceMatcher(String source) {
    return (tree, state) -> state.getSourceForNode(tree).equals(source);
  }
}
```

### RuleId[ruleID=DataFlowIssue]
Argument `getAnnotationWithSimpleName( classTree.getModifiers().getAnnotat...` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/JUnit4TestsNotRunWithinEnclosed.java`
#### Snippet
```java
                    fix.merge(
                            updateAnnotationArgumentValues(
                                getAnnotationWithSimpleName(
                                    classTree.getModifiers().getAnnotations(), "RunWith"),
                                state,
                                "value",
```

### RuleId[ruleID=DataFlowIssue]
Argument `getType(classTree.getExtendsClause())` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/JUnit4TestsNotRunWithinEnclosed.java`
#### Snippet
```java
      public Void visitClass(ClassTree classTree, Void unused) {
        if (classTree.getExtendsClause() != null) {
          extendedTypes.add(getType(classTree.getExtendsClause()));
        }
        return super.visitClass(classTree, null);
```

### RuleId[ruleID=DataFlowIssue]
Argument `state.getTypeFromString(MustBeClosed.class.getCanonicalName())` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/MustBeClosedChecker.java`
#### Snippet
```java
        String suggestedFixName =
            SuggestedFixes.qualifyType(
                state, builder, state.getTypeFromString(MustBeClosed.class.getCanonicalName()));
        SuggestedFix fix = builder.prefixWith(methodTree, "@" + suggestedFixName + " ").build();

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `lastIndexOf` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/PackageInfo.java`
#### Snippet
```java
    }
    String name = ASTHelpers.getFileName(tree);
    int idx = name.lastIndexOf('/');
    if (idx != -1) {
      name = name.substring(idx + 1);
```

### RuleId[ruleID=DataFlowIssue]
Argument `getType(classTree)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueSubclassLeaked.java`
#### Snippet
```java
          public Void visitClass(ClassTree classTree, Void unused) {
            if (hasAnnotation(classTree, AutoValue.class, state)) {
              types.add(getType(classTree));
            }
            return super.visitClass(classTree, null);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toString` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/CatchFail.java`
#### Snippet
```java
        return Optional.of(fix.delete(tree).build());
      } else {
        String source = state.getSourceCode().toString();
        // Replace the full region to work around a GJF partial formatting bug that prevents it from
        // re-indenting unchanged lines. This means that fixes may overlap, but that's (hopefully)
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `subSequence` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/CatchFail.java`
#### Snippet
```java
          + state
              .getSourceCode()
              .subSequence(
                  getStartPosition(tree.getArguments().get(0)),
                  state.getEndPosition(getLast(tree.getArguments())))
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isPrimitive` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/BoxedPrimitiveConstructor.java`
#### Snippet
```java
    JCTree.JCExpression arg = (JCTree.JCExpression) getOnlyElement(tree.getArguments());
    Type argType = getType(arg);
    if (autoboxFix && argType.isPrimitive()) {
      return SuggestedFix.builder()
          .replace(getStartPosition(tree), arg.getStartPosition(), maybeCast(state, type, argType))
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/BoxedPrimitiveConstructor.java`
#### Snippet
```java

    if (COMPARE_TO.matches(parent, state)
        && ASTHelpers.getReceiver((ExpressionTree) parent).equals(tree)) {
      JCMethodInvocation compareTo = (JCMethodInvocation) parent;
      // e.g. new Integer($A).compareTo($B) -> Integer.compare($A, $B)
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `getType(annotation)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/NullableOnContainingClass.java`
#### Snippet
```java
        continue;
      }
      if (NULLABLE_ANNOTATION_NAMES.contains(getType(annotation).tsym.getSimpleName().toString())) {
        if (state.getEndPosition(annotation) < endOfOuterType) {
          return describeMatch(
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `substring` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/StreamResourceLeak.java`
#### Snippet
```java
        int pos = getStartPosition(var);
        int initPos = getStartPosition(var.getInitializer());
        int eqPos = pos + state.getSourceForNode(var).substring(0, initPos - pos).lastIndexOf('=');
        fix.replace(
            eqPos,
```

### RuleId[ruleID=DataFlowIssue]
Argument `ASTHelpers.getFileName(tree)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/ClassName.java`
#### Snippet
```java
      return Description.NO_MATCH;
    }
    String filename = Files.getNameWithoutExtension(ASTHelpers.getFileName(tree));
    List<String> names = new ArrayList<>();
    for (Tree member : tree.getTypeDecls()) {
```

### RuleId[ruleID=DataFlowIssue]
Argument `ASTHelpers.getType(a)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/JUnit4ClassAnnotationNonStatic.java`
#### Snippet
```java
    String annoNames =
        annotationTrees.stream()
            .map(a -> Signatures.prettyType(ASTHelpers.getType(a)))
            .collect(Collectors.joining(" and "));
    return annoNames + " can only be applied to static methods.";
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toString` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/SuppressWarningsWithoutExplanation.java`
#### Snippet
```java
  private static ImmutableRangeSet<Long> linesWithComments(VisitorState state) {
    RangeSet<Long> lines = TreeRangeSet.create();
    ErrorProneTokens tokens = new ErrorProneTokens(state.getSourceCode().toString(), state.context);
    LineMap lineMap = tokens.getLineMap();
    for (ErrorProneToken token : tokens.getTokens()) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `subSequence` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryAssignment.java`
#### Snippet
```java
            state
                .getSourceCode()
                .subSequence(getStartPosition(tree), getStartPosition(tree.getInitializer()))
                .toString();
        ImmutableList<ErrorProneToken> tokens =
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `getType(annotationToRemove)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryAssignment.java`
#### Snippet
```java
                      + " initialized by a framework. Remove the assignment if a framework is"
                      + " being used, or the annotation if one isn't.",
                  getType(annotationToRemove).tsym.getSimpleName()))
          .addFix(
              SuggestedFix.builder()
```

### RuleId[ruleID=DataFlowIssue]
Argument `targetType` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/StronglyType.java`
#### Snippet
```java
    SuggestedFix.Builder fix = SuggestedFix.builder();
    Type targetType = getType(factory);
    String typeName = SuggestedFixes.qualifyType(state.withPath(variableTreePath), fix, targetType);

    fix.replace(
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `getDeclaredSymbol(enclosingClass)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ChainedAssertionLosesContext.java`
#### Snippet
```java
     */
    return isSubtype(
        getDeclaredSymbol(enclosingClass).type, COM_GOOGLE_COMMON_TRUTH_SUBJECT.get(state), state);
  }

```

### RuleId[ruleID=DataFlowIssue]
Argument `paramMethods` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/JUnitParameterMethodNotFound.java`
#### Snippet
```java
        String paramMethods =
            (String) ASTHelpers.constValue(paramMethodAssignmentTree.get().getExpression());
        Splitter.on(',').trimResults().splitToStream(paramMethods).forEach(requiredMethods::add);

        // If source argument is present in the annotation the method should be searched in the
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `ASTHelpers.enclosingClass(ASTHelpers.getSymbol(tree))` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/JUnitParameterMethodNotFound.java`
#### Snippet
```java

  private static Type getClassType(MethodTree tree) {
    return ASTHelpers.enclosingClass(ASTHelpers.getSymbol(tree)).type;
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getTypeArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/JUnitParameterMethodNotFound.java`
#### Snippet
```java

    ClassType classType = (ClassType) getType(paramSourceAssignmentTree.get().getExpression());
    Type typeArgument = classType.getTypeArguments().get(0);
    return getAllMethodIdentifiersForType(typeArgument, state);
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `subSequence` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/FallThrough.java`
#### Snippet
```java
          state
              .getSourceCode()
              .subSequence(endPos, ((JCTree) next).getStartPosition())
              .toString()
              .trim();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getComponentType` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ArraysAsListPrimitiveArray.java`
#### Snippet
```java
    }
    ExpressionTree array = Iterables.getOnlyElement(tree.getArguments());
    Type componentType = ((ArrayType) ASTHelpers.getType(array)).getComponentType();
    if (!componentType.isPrimitive()) {
      return NO_MATCH;
```

### RuleId[ruleID=DataFlowIssue]
Argument `ASTHelpers.getType(c.getParameter().getType())` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/ClassNewInstance.java`
#### Snippet
```java
    ImmutableMap.Builder<Type, CatchTree> catches = ImmutableMap.builder();
    for (CatchTree c : tryTree.getCatches()) {
      catches.put(ASTHelpers.getType(c.getParameter().getType()), c);
    }
    UnhandledResult<CatchTree> result = unhandled(catches.buildOrThrow(), state);
```

### RuleId[ruleID=DataFlowIssue]
Argument `ASTHelpers.getType(e)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/ClassNewInstance.java`
#### Snippet
```java
    ImmutableMap.Builder<Type, ExpressionTree> thrown = ImmutableMap.builder();
    for (ExpressionTree e : methodTree.getThrows()) {
      thrown.put(ASTHelpers.getType(e), e);
    }
    UnhandledResult<ExpressionTree> result = unhandled(thrown.buildOrThrow(), state);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `lastIndexOf` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/HashtableContains.java`
#### Snippet
```java
      MethodInvocationTree tree, VisitorState state, String newName) {
    String source = state.getSourceForNode(tree.getMethodSelect());
    int idx = source.lastIndexOf("contains");
    String replacement =
        source.substring(0, idx) + newName + source.substring(idx + "contains".length());
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `indexOf` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedException.java`
#### Snippet
```java
      int startPosition = getStartPosition(constructor);
      int pos =
          source.indexOf('(', state.getEndPosition(constructor.getIdentifier()) - startPosition)
              + startPosition
              + 1;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getMembers` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/SystemExitOutsideMain.java`
#### Snippet
```java
    if (CALLS_TO_SYSTEM_EXIT_OUTSIDE_MAIN.matches(tree, state)) {
      Optional<? extends Tree> mainMethodInThisClass =
          ASTHelpers.findEnclosingNode(state.getPath(), ClassTree.class).getMembers().stream()
              .filter(t -> t instanceof MethodTree)
              .filter(t -> MAIN_METHOD.matches((MethodTree) t, state))
```

### RuleId[ruleID=DataFlowIssue]
Argument `state.getSourceForNode(arguments.get(i))` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/DistinctVarargsChecker.java`
#### Snippet
```java
    ImmutableListMultimap.Builder<String, Integer> result = ImmutableListMultimap.builder();
    for (int i = 0; i < arguments.size(); i++) {
      result.put(state.getSourceForNode(arguments.get(i)), i);
    }
    return result.build();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toString` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/MixedDescriptors.java`
#### Snippet
```java
  /** Ignore packages specifically qualified as proto1 or proto2. */
  private static boolean shouldConsider(TypeSymbol symbol) {
    String packge = enclosingPackage(symbol).toString();
    return !(packge.contains(".proto1api") || packge.contains(".proto2api"));
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/InconsistentCapitalization.java`
#### Snippet
```java
      if (symbol.getKind().equals(ElementKind.FIELD)
          && !isUpperCaseAndStatic(symbol)
          && ASTHelpers.enclosingClass(symbol).equals(classSymbol)) {
        fields.add(symbol);
      }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toString` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ParameterName.java`
#### Snippet
```java
      return;
    }
    String enclosingClass = ASTHelpers.enclosingClass(sym).toString();
    if (exemptPackages.stream().anyMatch(enclosingClass::startsWith)) {
      return;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `subSequence` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ParameterName.java`
#### Snippet
```java
      VisitorState state,
      Consumer<ErrorProneToken> consumer) {
    String source = state.getSourceCode().subSequence(offset, positions.upperEndpoint()).toString();
    Deque<ErrorProneToken> tokens =
        new ArrayDeque<>(ErrorProneTokens.getTokens(source, offset, state.context));
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `indexOf` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/FieldCanBeStatic.java`
#### Snippet
```java
    int pos =
        ((JCTree) variableTree).getStartPosition()
            + state.getSourceForNode(variableTree).indexOf(name, searchOffset);
    SuggestedFix.Builder fix =
        SuggestedFix.builder().replace(pos, pos + name.length(), replacement);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `asElement` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/MissingDefault.java`
#### Snippet
```java
  public Description matchSwitch(SwitchTree tree, VisitorState state) {
    Type switchType = ASTHelpers.getType(tree.getExpression());
    if (switchType.asElement().getKind() == ElementKind.ENUM) {
      // enum switches can omit the default if they're exhaustive, which is enforced separately
      // by MissingCasesInEnumSwitch
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `ASTHelpers.getType(tree.getExtendsClause())` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ClassCanBeStatic.java`
#### Snippet
```java
    }
    if (tree.getExtendsClause() != null
        && ASTHelpers.getType(tree.getExtendsClause()).tsym.hasOuterInstance()) {
      return NO_MATCH;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getReturnType` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/JdkObsolete.java`
#### Snippet
```java
          return state.getTypes().findDescriptorType(ASTHelpers.getType(tree)).getReturnType();
        case METHOD:
          return ASTHelpers.getType(tree).getReturnType();
        case CLASS:
          return null;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getParameterTypes` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/JdkObsolete.java`
#### Snippet
```java
      }
      Type methodType = ASTHelpers.getType(tree.getMethodSelect());
      if (idx >= methodType.getParameterTypes().size()) {
        return null;
      }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isSubClass` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/Interruption.java`
#### Snippet
```java
    }
    Symbol.ClassSymbol classSymbol = enclosingClass(methodSymbol);
    if (!classSymbol.isSubClass(JAVA_UTIL_CONCURRENT_FUTURE.get(state), state.getTypes())) {
      return false;
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `expSrc` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/SizeGreaterThanOrEqualsZero.java`
#### Snippet
```java
      BinaryTree tree, MethodInvocationTree protoGetSize, VisitorState state) {
    String expSrc = state.getSourceForNode(protoGetSize);
    java.util.regex.Matcher protoGetCountMatcher = PROTO_COUNT_METHOD_PATTERN.matcher(expSrc);
    if (!protoGetCountMatcher.find()) {
      throw new AssertionError(
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `getType(lambda)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMustBeClosedChecker.java`
#### Snippet
```java
    }
    if (hasAnnotation(
        state.getTypes().findDescriptorSymbol(getType(lambda).tsym),
        MUST_BE_CLOSED_ANNOTATION_NAME,
        state)) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getReturnType` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMustBeClosedChecker.java`
#### Snippet
```java
            Type streamType = state.getTypeFromString(Stream.class.getName());
            if (isSubtype(sym.enclClass().asType(), streamType, state)
                && isSameType(type.getReturnType(), streamType, state)) {
              // skip enclosing method invocation
              path = path.getParentPath();
```

### RuleId[ruleID=DataFlowIssue]
Argument `state.getSourceForNode(literal)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/FloatingPointAssertionWithinEpsilon.java`
#### Snippet
```java
        // If the value passed to #of was being converted to a float, we can make that explicit with
        // an "f" qualifier.
        return Optional.of(removeSuffixes(state.getSourceForNode(literal)) + "f");
      }
    },
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/FloatingPointAssertionWithinEpsilon.java`
#### Snippet
```java
    private static ExpressionTree getReceiverArgument(MethodInvocationTree tree) {
      ExpressionTree receiver = ASTHelpers.getReceiver(tree);
      return getOnlyElement(((MethodInvocationTree) receiver).getArguments());
    }

```

### RuleId[ruleID=DataFlowIssue]
Argument `state.getSourceForNode(literal)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/FloatingPointAssertionWithinEpsilon.java`
#### Snippet
```java
      @Override
      Optional<String> suffixLiteralIfPossible(LiteralTree literal, VisitorState state) {
        String literalString = removeSuffixes(state.getSourceForNode(literal));
        double asDouble;
        try {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `doubleValue` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/FloatingPointAssertionWithinEpsilon.java`
#### Snippet
```java
        // We need to double-check that the value with a "d" suffix has the same value. For example,
        // 0.1f != 0.1d, so must be replaced with (double) 0.1f
        if (asDouble == ASTHelpers.constValue(literal, Number.class).doubleValue()) {
          return Optional.of(literalString.contains(".") ? literalString : literalString + "d");
        }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `asElement` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryLambda.java`
#### Snippet
```java
    Symbol descriptor;
    try {
      descriptor = state.getTypes().findDescriptorSymbol(getType(type).asElement());
    } catch (FunctionDescriptorLookupError e) {
      return false;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getQualifiedName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryLambda.java`
#### Snippet
```java
      return false;
    }
    if (!PACKAGES_TO_FIX.contains(enclosingPackage(descriptor).getQualifiedName().toString())) {
      return false;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `asElement` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/MissingCasesInEnumSwitch.java`
#### Snippet
```java
  public Description matchSwitch(SwitchTree tree, VisitorState state) {
    Type switchType = ASTHelpers.getType(tree.getExpression());
    if (switchType.asElement().getKind() != ElementKind.ENUM) {
      return Description.NO_MATCH;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `lastIndexOf` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessarilyFullyQualified.java`
#### Snippet
```java
  private static boolean isPackageInfo(CompilationUnitTree tree) {
    String name = ASTHelpers.getFileName(tree);
    int idx = name.lastIndexOf('/');
    if (idx != -1) {
      name = name.substring(idx + 1);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getTypeArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/IsInstanceIncompatibleType.java`
#### Snippet
```java
      return null;
    }
    List<Type> receiverTypeArguments = getType(receiver).getTypeArguments();
    return !receiverTypeArguments.isEmpty() ? getOnlyElement(receiverTypeArguments) : null;
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isReference` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ReferenceEquality.java`
#### Snippet
```java
  protected boolean matchArgument(ExpressionTree tree, VisitorState state) {
    Type type = ASTHelpers.getType(tree);
    if (!type.isReference()) {
      return false;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getKind` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/MixedMutabilityReturnType.java`
#### Snippet
```java
      if (initializer != null
          && getType(initializer) != null
          && getType(initializer).getKind() != TypeKind.NULL
          && RETURNS_COLLECTION.matches(initializer, state)) {
        if (IMMUTABLE.matches(initializer, state)) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `substring` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UndefinedEquals.java`
#### Snippet
```java
      String methodText =
          state.getSourceForNode(tree.getMethodSelect()); // e.g. "assertThat(foo).isEqualTo"
      String assertThatWithArg = methodText.substring(0, methodText.lastIndexOf('.'));

      // If both the argument and receiver are subtypes of the given type, rewrites the isEqualTo
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UndefinedEquals.java`
#### Snippet
```java
    } else if (ASSERT_THAT_EQUALS.matches(tree, state)) {
      receiver = getOnlyElement(arguments);
      argument = getOnlyElement(((MethodInvocationTree) getReceiver(tree)).getArguments());
    } else {
      return Description.NO_MATCH;
```

### RuleId[ruleID=DataFlowIssue]
Method reference argument might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/ReturnValueIgnored.java`
#### Snippet
```java
        .filter(flagName -> flags.getBoolean(flagName).orElse(true))
        .map(FLAG_MATCHERS::get)
        .forEach(builder::add);
    return anyOf(builder.build());
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getQualifiedName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ReturnValueIgnored.java`
#### Snippet
```java
    Symbol symbol = getSymbol(tree);
    return symbol instanceof MethodSymbol
        && enclosingPackage(symbol.owner).getQualifiedName().contentEquals("java.util.function");
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getQualifiedName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ReturnValueIgnored.java`
#### Snippet
```java
    Symbol symbol = getSymbol(tree);
    if (symbol instanceof MethodSymbol) {
      String qualifiedName = enclosingPackage(symbol.owner).getQualifiedName().toString();
      return (qualifiedName.startsWith("java.time") || qualifiedName.startsWith("org.threeten.bp"))
          && symbol.getModifiers().contains(Modifier.PUBLIC)
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toString` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeEscape.java`
#### Snippet
```java
  @Override
  public Description matchCompilationUnit(CompilationUnitTree tree, VisitorState state) {
    new UnicodeScanner(state.getSourceCode().toString(), state).scan();
    return NO_MATCH;
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/HidingField.java`
#### Snippet
```java
        && !parentVariable.getModifiers().contains(Modifier.PUBLIC)) { // package-private variable

      if (!enclosingPackage(parentVariable).equals(getSymbol(currClass).packge())) {
        return true;
      }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getTypeArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ComparableType.java`
#### Snippet
```java
    Type implType = getType(impl);
    ClassType type = getType(tree);
    if (implType.getTypeArguments().isEmpty()) {
      return buildDescription(tree).setMessage("Comparable should not be raw").build();
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `type` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/ComparableType.java`
#### Snippet
```java
              String.format(
                  "Type of Comparable (%s) is not the same as implementing class (%s).",
                  Signatures.prettyType(comparableTypeArgument), Signatures.prettyType(type)))
          .build();
    }
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/BadAnnotationImplementation.java`
#### Snippet
```java

    Symbol objectSymbol = state.getSymtab().objectType.tsym;
    if (equals.owner.equals(objectSymbol) || hashCode.owner.equals(objectSymbol)) {
      return describeMatch(classTree);
    }
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `hashCode` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/BadAnnotationImplementation.java`
#### Snippet
```java

    Symbol objectSymbol = state.getSymtab().objectType.tsym;
    if (equals.owner.equals(objectSymbol) || hashCode.owner.equals(objectSymbol)) {
      return describeMatch(classTree);
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isAnonymous` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/DoNotCallSuggester.java`
#### Snippet
```java

    // if the enclosing class is anonymous, exit
    if (enclosingClass.isAnonymous()) {
      return NO_MATCH;
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `state.getSourceForNode(formatTree)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/PreconditionsInvalidPlaceholder.java`
#### Snippet
```java

    String fixedFormatString =
        BAD_PLACEHOLDER_REGEX.matcher(state.getSourceForNode(formatTree)).replaceAll("%s");
    if (expectedArguments(fixedFormatString) == tree.getArguments().size() - 2) {
      return describeMatch(formatTree, SuggestedFix.replace(formatTree, fixedFormatString));
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `charAt` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryTypeArgument.java`
#### Snippet
```java
    CharSequence source = state.getSourceForNode(node);

    while (lower >= 0 && source.charAt(lower) != '<') {
      lower--;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryTypeArgument.java`
#### Snippet
```java
      lower--;
    }
    while (upper < source.length() && source.charAt(upper) != '>') {
      upper++;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `subSequence` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/CheckedExceptionNotThrown.java`
#### Snippet
```java
    int startPos =
        ErrorProneTokens.getTokens(
                state.getSourceCode().subSequence(methodStartPos, endPos).toString(),
                methodStartPos,
                state.context)
```

### RuleId[ruleID=DataFlowIssue]
Function may return null, but it's not allowed here
in `core/src/main/java/com/google/errorprone/bugpatterns/CheckedExceptionNotThrown.java`
#### Snippet
```java
        tree.getThrows().stream()
            .filter(et -> !canActuallyBeThrown.contains(et))
            .map(state::getSourceForNode)
            .sorted()
            .collect(joining(", ", "(", ")"));
```

### RuleId[ruleID=DataFlowIssue]
Argument `state.findEnclosing(ClassTree.class)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/CheckedExceptionNotThrown.java`
#### Snippet
```java
    }
    return Streams.concat(
        Stream.of(tree.getBody()), fieldInitializers(state.findEnclosing(ClassTree.class)));
  }

```

### RuleId[ruleID=DataFlowIssue]
Dereference of `enclosingClass(methodSymbol)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/SelfAlwaysReturnsThis.java`
#### Snippet
```java

    // * have the same return type as the enclosing type
    if (!isSameType(getType(returnType), enclosingClass(methodSymbol).type, state)) {
      return NO_MATCH;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ImpossibleNullComparison.java`
#### Snippet
```java
        problemType = ProblemUsage.OPTIONAL;
      } else if (matchTestAssertions && TRUTH_NOT_NULL.matches(node, subState)) {
        argument = getOnlyElement(((MethodInvocationTree) getReceiver(node)).getArguments());
        problemType = ProblemUsage.TRUTH;
      } else {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getMethodSelect` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ImpossibleNullComparison.java`
#### Snippet
```java
                      String.format(
                          "%s(%s).isTrue()",
                          state.getSourceForNode(receiver.getMethodSelect()), r));
                })
            .orElse(SuggestedFix.emptyFix());
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `subSequence` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ConstantPatternCompile.java`
#### Snippet
```java
            state
                .getSourceCode()
                .subSequence(getStartPosition(tree.getInitializer()), getStartPosition(regex))
                .toString())
        .postfixWith(def.getInitializer(), ")")
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `multiByteReadMethod` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/InputStreamSlowMultibyteRead.java`
#### Snippet
```java
            ImmutableList.of());

    return multiByteReadMethod.owner.equals(thisClassSymbol)
        ? Description.NO_MATCH
        : maybeMatchReadByte(readByteMethod, state);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getParameters` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ReplacementVariableFinder.java`
#### Snippet
```java
    // as the new argument
    ImmutableMultimap<Integer, JCVariableDecl> potentialReplacements =
        ASTHelpers.findEnclosingNode(state.getPath(), JCMethodDecl.class).getParameters().stream()
            .filter(validParameterPredicate)
            .collect(collectByEditDistanceTo(simpleNameOfIdentifierOrMemberAccess(input)));
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getMembers` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ReplacementVariableFinder.java`
#### Snippet
```java

    ImmutableMultimap<Integer, JCVariableDecl> potentialReplacements =
        ASTHelpers.findEnclosingNode(state.getPath(), JCClassDecl.class).getMembers().stream()
            .filter(JCVariableDecl.class::isInstance)
            .map(JCVariableDecl.class::cast)
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getKind` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/IntLongMath.java`
#### Snippet
```java
    // Note that we don't care about boxing as int isn't assignable to Long;
    // primitive widening conversions can't be combined with autoboxing.
    if (ASTHelpers.getType(init).getKind() != TypeKind.INT) {
      return NO_MATCH;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeDirectionalityCharacters.java`
#### Snippet
```java
    CharSequence source = state.getSourceCode();

    for (int i = 0; i < source.length(); ++i) {
      char c = source.charAt(i);
      // Do not extract this switch to a method. It's ugly as-is, but profiling suggests this
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/SwigMemoryLeak.java`
#### Snippet
```java
    MethodTree enclosingMethodTree =
        ASTHelpers.findEnclosingNode(state.getPath(), MethodTree.class);
    Name name = enclosingMethodTree.getName();
    if (!name.contentEquals("delete")) {
      return NO_MATCH;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `startsWith` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/XorPower.java`
#### Snippet
```java
      return NO_MATCH;
    }
    if (state.getSourceForNode(tree.getRightOperand()).startsWith("0")) {
      // hex and octal literals
      return NO_MATCH;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getKind` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/LongFloatConversion.java`
#### Snippet
```java
  public Description matchMethodInvocation(MethodInvocationTree tree, VisitorState state) {
    for (ExpressionTree arg : tree.getArguments()) {
      if (!getType(arg).getKind().equals(TypeKind.LONG)) {
        continue;
      }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `contains` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/MultipleParallelOrSequentialCalls.java`
#### Snippet
```java
        if (methodInvocationTree.getArguments().stream()
            .map(m -> state.getSourceForNode(m))
            .anyMatch(m -> m.contains(state.getSourceForNode(t)))) {
          break;
        }
```

### RuleId[ruleID=DataFlowIssue]
Argument `state.getSourceForNode(t)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/MultipleParallelOrSequentialCalls.java`
#### Snippet
```java
        if (methodInvocationTree.getArguments().stream()
            .map(m -> state.getSourceForNode(m))
            .anyMatch(m -> m.contains(state.getSourceForNode(t)))) {
          break;
        }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getTypeArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/IdentityHashMapBoxing.java`
#### Snippet
```java

  private Description checkTypes(ExpressionTree tree, VisitorState state) {
    List<Type> argumentTypes = ASTHelpers.getResultType(tree).getTypeArguments();
    if (argumentTypes.size() != 2) {
      return Description.NO_MATCH;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `asType` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ForOverrideChecker.java`
#### Snippet
```java

    for (Symbol overriddenMethod : overriddenMethods) {
      Type declaringClass = ASTHelpers.outermostClass(overriddenMethod).asType();
      if (!ASTHelpers.isSameType(declaringClass, currentClass, state)) {
        String customMessage =
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getTypeArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/Incomparable.java`
#### Snippet
```java
      type = getType(tree.getIdentifier());
    }
    List<Type> typeArguments = type.getTypeArguments();
    if (typeArguments.isEmpty()) {
      return NO_MATCH;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `replaceAll` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/BigDecimalLiteralDouble.java`
#### Snippet
```java

    // Strip off 'd', 'f' suffixes and _ separators from the source.
    String literalString = state.getSourceForNode(arg).replaceAll("[_dDfF]", "");

    // We assume that the expected value of `new BigDecimal(double)` is precisely the BigDecimal
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getLeaf` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableSetForContains.java`
#### Snippet
```java
    // parent class.
    TreePath cuPath = state.findPathToEnclosing(CompilationUnitTree.class);
    usageScanner.scan(cuPath.getLeaf(), state.withPath(cuPath));
    SuggestedFix.Builder fix = SuggestedFix.builder();
    Optional<VariableTree> firstReplacement = Optional.empty();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `subSequence` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/MixedArrayDimensions.java`
#### Snippet
```java
      List<ErrorProneToken> tokens = state.getOffsetTokens(start, end);
      if (tokens.size() > 2 && tokens.get(0).kind() == TokenKind.IDENTIFIER) {
        String dim = source.subSequence(start, end).toString();
        int nonWhitespace = CharMatcher.isNot(' ').indexIn(dim);
        int idx = dim.indexOf("[]", nonWhitespace);
```

### RuleId[ruleID=DataFlowIssue]
Argument `ASTHelpers.getFileName(tree)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/DefaultPackage.java`
#### Snippet
```java
    }
    // module-info.* is a special file name so ignore it.
    if (Files.getNameWithoutExtension(ASTHelpers.getFileName(tree)).equals("module-info")) {
      return Description.NO_MATCH;
    }
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `parameter` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/NullOptional.java`
#### Snippet
```java
    for (ExpressionTree argument : arguments) {
      parameter = parameters.hasNext() ? parameters.next() : parameter;
      parameterType = parameter.type;
      if (symbol.isVarArgs() && !parameters.hasNext()) {
        parameterType = ((ArrayType) parameter.type).elemtype;
```

### RuleId[ruleID=DataFlowIssue]
Argument `receiver` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/ModifyingCollectionWithItself.java`
#### Snippet
```java

    Description.Builder builder = buildDescription(methodInvocationTree);
    for (Fix fix : buildFixes(methodInvocationTree, state, receiver, argument)) {
      builder.addFix(fix);
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `asElement` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/CheckReturnValue.java`
#### Snippet
```java

    String implementedMethod =
        getType(tree).asElement().getSimpleName()
            + "."
            + state.getTypes().findDescriptorSymbol(getType(tree).asElement()).getSimpleName();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `asElement` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/CheckReturnValue.java`
#### Snippet
```java
        getType(tree).asElement().getSimpleName()
            + "."
            + state.getTypes().findDescriptorSymbol(getType(tree).asElement()).getSimpleName();
    String methodReference = state.getSourceForNode(tree);
    String message =
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getTag` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/BadComparable.java`
#### Snippet
```java

    // If the cast isn't narrowing to an int then don't implicate it in the bug pattern.
    if (treeType.getTag() != TypeTag.INT) {
      return false;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isPrimitive` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/BadComparable.java`
#### Snippet
```java
    ExpressionTree rhs = subtract.getRightOperand();
    Fix fix;
    if (ASTHelpers.getType(lhs).isPrimitive()) {
      fix =
          SuggestedFix.replace(
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `ASTHelpers.getType(newClassTree.getIdentifier())` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedAnonymousClass.java`
#### Snippet
```java
      }
    }
    if (!sideEffectFreeConstructor(ASTHelpers.getType(newClassTree.getIdentifier()).tsym, state)) {
      return Description.NO_MATCH;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `value` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/BlockTemplate.java`
#### Snippet
```java
    Context context = inliner.getContext();
    if (annotations().containsKey(UseImportPolicy.class)) {
      ImportPolicy.bind(context, annotations().getInstance(UseImportPolicy.class).value());
    } else {
      ImportPolicy.bind(context, ImportPolicy.IMPORT_TOP_LEVEL);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isPresent` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/BlockTemplate.java`
#### Snippet
```java
                    expectedTypes(inliner),
                    actualTypes(inliner));
            if (checkedUnifier.isPresent()) {
              int consumedStatements = statements.size() - state.unconsumedStatements().size();
              BlockTemplateMatch match =
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `expectedMethodSym` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/EqualsHashCode.java`
#### Snippet
```java
            ImmutableList.<Type>of());

    if (!expectedMethodSym.owner.equals(state.getSymtab().objectType.tsym)) {
      return null;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toString` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractJUnit4InitMethodNotRun.java`
#### Snippet
```java
      CharSequence modifiersSource = state.getSourceForNode(modifiers);
      suggestedFix.replace(
          modifiers, modifiersSource.toString().replaceFirst("protected", "public"));
    }
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getImplementsClause` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/FunctionalInterfaceMethodChanged.java`
#### Snippet
```java
      Types types = state.getTypes();
      ImmutableSet<Symbol> functionalSuperInterfaceSams =
          enclosingClazz.getImplementsClause().stream()
              .filter(t -> IS_FUNCTIONAL_INTERFACE.matches(t, state))
              .map(ASTHelpers::getSymbol)
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `charAt` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/AnnotationPosition.java`
#### Snippet
```java
    int javadocEnd = javadocStart + danglingJavadoc.getText().length();
    // Capturing an extra newline helps the formatter.
    if (state.getSourceCode().charAt(javadocEnd) == '\n') {
      javadocEnd++;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `substring` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/MockitoUsage.java`
#### Snippet
```java
      String receiver = state.getSourceForNode(ASTHelpers.getReceiver(invocation));
      String mode = args.size() > 1 ? ", " + state.getSourceForNode(args.get(1)) : "";
      String call = state.getSourceForNode(invocation).substring(receiver.length());
      builder.addFix(
          SuggestedFix.replace(tree, String.format("%s(%s%s)%s", verify, receiver, mode, call)));
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/MockitoUsage.java`
#### Snippet
```java
      String receiver = state.getSourceForNode(ASTHelpers.getReceiver(invocation));
      String mode = args.size() > 1 ? ", " + state.getSourceForNode(args.get(1)) : "";
      String call = state.getSourceForNode(invocation).substring(receiver.length());
      builder.addFix(
          SuggestedFix.replace(tree, String.format("%s(%s%s)%s", verify, receiver, mode, call)));
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getTypeArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/LambdaFunctionalInterface.java`
#### Snippet
```java
      Tree param, int argIndex, Type type, VisitorState state) {
    return ASTHelpers.isSubtype(
        ASTHelpers.getType(param).getTypeArguments().get(argIndex), type, state);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getModifiers` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/NonOverridingEquals.java`
#### Snippet
```java
    JCClassDecl cls = (JCClassDecl) state.findEnclosing(ClassTree.class);

    if ((cls.getModifiers().flags & ENUM) != 0) {
      /* If the enclosing class is an enum, then just delete the equals method since enums
       * should always be compared for reference equality. Enum defines a final equals method for
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `enclosingClass(symbol)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractReturnValueIgnored.java`
#### Snippet
```java

  private static boolean isExemptedInterfaceMethod(MethodSymbol symbol, VisitorState state) {
    return isExemptedInterfaceType(enclosingClass(symbol).type, state);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toString` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/SwitchDefault.java`
#### Snippet
```java
        int end = state.getEndPosition(getLast(defaultStatementGroup));
        String replacement;
        String source = state.getSourceCode().toString();

        // If the default case isn't the last case in its statement group, move it to the end.
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `subSequence` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/FieldCanBeLocal.java`
#### Snippet
```java
    return state
        .getSourceCode()
        .subSequence(
            getStartPosition(annotations.get(0)), state.getEndPosition(getLast(annotations)))
        .toString();
```

### RuleId[ruleID=DataFlowIssue]
Argument `unit` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/CanonicalDuration.java`
#### Snippet
```java

    List<Duration> durations =
        constValues.stream().map(value -> Duration.of(value.longValue(), unit)).collect(toList());
    // Iterate over all possible units from largest to smallest (days to nanos) until we find the
    // largest unit that can be used to exactly express the duration.
```

### RuleId[ruleID=DataFlowIssue]
Unboxing of `converter.convert(durations.get(i))` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/CanonicalDuration.java`
#### Snippet
```java
        for (int i = 0; i < allInvocationsInParentExpression.size(); i++) {
          MethodInvocationTree m = allInvocationsInParentExpression.get(i);
          long nextValue = converter.convert(durations.get(i));
          String name = FACTORIES.get(api, nextUnit);
          String replacement =
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getSimpleName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/time/TimeUnitMismatch.java`
#### Snippet
```java
            // for the 'this' keyword the argument name is the name of the object's class
            Symbol sym = getSymbol(idTree);
            return (sym == null) ? null : enclosingClass(sym).getSimpleName().toString();
          } else {
            // if we have a variable, just extract its name
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/time/JodaNewPeriod.java`
#### Snippet
```java
  private static SuggestedFix generateFix(MethodInvocationTree tree, VisitorState state) {
    NewClassTree receiver = (NewClassTree) getReceiver(tree);
    List<? extends ExpressionTree> arguments = receiver.getArguments();
    MethodSymbol methodSymbol = getSymbol(receiver);
    String unit =
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `asType` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/time/PreferJavaTimeOverload.java`
#### Snippet
```java
                && isSameType(input.getParameters().get(0).asType(), type, state)
                && isSameType(input.getReturnType(), calledMethod.getReturnType(), state),
        ASTHelpers.enclosingClass(calledMethod).asType(),
        state.getTypes());
  }
```

### RuleId[ruleID=DataFlowIssue]
Argument `classTree` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/AutoFactoryAtInject.java`
#### Snippet
```java
    ClassTree classTree = findEnclosingNode(state.getPath(), ClassTree.class);
    ImmutableList<Tree> potentiallyAnnotatedTrees =
        ImmutableList.<Tree>builder().add(classTree).addAll(getConstructors(classTree)).build();
    for (Tree potentiallyAnnotatedTree : potentiallyAnnotatedTrees) {
      if (HAS_AUTO_FACTORY_ANNOTATION.matches(potentiallyAnnotatedTree, state)
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getQualifiedName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/guice/OverridesGuiceInjectableMethod.java`
#### Snippet
```java
                          + "that is annotated with @com.google.inject.Inject. Guice will inject "
                          + "this method, and it is recommended to annotate it explicitly.",
                      ASTHelpers.enclosingClass(superMethod).getQualifiedName()))
              .build();
        }
```

### RuleId[ruleID=DataFlowIssue]
Argument `ASTHelpers.outermostClass(method)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/RefersToDaggerCodegen.java`
#### Snippet
```java
      return false;
    }
    return isGeneratedBaseType(ASTHelpers.outermostClass(method), state, "dagger.MembersInjector");
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getQualifiedName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/RefersToDaggerCodegen.java`
#### Snippet
```java
  private static boolean isDaggerInternalClass(ClassSymbol symbol) {
    return DAGGER_INTERNAL_PACKAGES.contains(
        enclosingPackage(symbol).getQualifiedName().toString());
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getQualifiedName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/RefersToDaggerCodegen.java`
#### Snippet
```java
    ClassSymbol rootCallingClass =
        ASTHelpers.outermostClass(getSymbol(state.findEnclosing(ClassTree.class)));
    if (rootCallingClass.getQualifiedName().toString().startsWith("dagger.")) {
      return true;
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `state.getSourceForNode(annotation)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/UseBinds.java`
#### Snippet
```java
        }
      } else {
        modifierStringsBuilder.add(state.getSourceForNode(annotation));
      }
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getExtendsClause` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/UseBinds.java`
#### Snippet
```java
    }

    if (enclosingClass.getExtendsClause() != null) {
      return fixByDelegating();
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `state.getSourceForNode(annotation)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/EmptySetMultibindingContributions.java`
#### Snippet
```java

    for (JCAnnotation annotation : enclosingClassModifiers.annotations) {
      classModifierStringsBuilder.add(state.getSourceForNode(annotation));
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getModifiers` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/EmptySetMultibindingContributions.java`
#### Snippet
```java

    // Check to see if this is in a Dagger 1 module b/c it doesn't support @Multibinds
    for (JCAnnotation annotation : enclosingClass.getModifiers().getAnnotations()) {
      if (ASTHelpers.getSymbol(annotation.getAnnotationType())
              .getQualifiedName()
```

### RuleId[ruleID=DataFlowIssue]
Argument `state.getSourceForNode(annotation)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/EmptySetMultibindingContributions.java`
#### Snippet
```java
          || annotationQualifiedName.contentEquals("dagger.producers.Produces")
          || annotationQualifiedName.contentEquals("dagger.multibindings.ElementsIntoSet"))) {
        modifierStringsBuilder.add(state.getSourceForNode(annotation));
      }
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `state.getSourceForNode(annotation)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/Util.java`
#### Snippet
```java
    ImmutableList.Builder<Object> modifiers = ImmutableList.builder();
    for (AnnotationTree annotation : classTree.getModifiers().getAnnotations()) {
      modifiers.add(state.getSourceForNode(annotation));
    }
    modifiers.addAll(flags);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getComponentType` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/android/BundleDeserializationCast.java`
#### Snippet
```java
    // Check component types of arrays. The only type that may cause problems is CharSequence[].
    if (isArrayType().matches(targetType, state)) {
      Type componentType = ((ArrayType) getType(targetType)).getComponentType();
      Types types = state.getTypes();
      Type charSequenceType = typeFromString("java.lang.CharSequence").get(state);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toString` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/android/BundleDeserializationCast.java`
#### Snippet
```java

  private Description getDescriptionForType(TypeCastTree tree, String baseType) {
    String targetType = getType(tree.getType()).toString();
    return buildDescription(tree)
        .setMessage(
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `accept` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/android/IsLoggableTagLength.java`
#### Snippet
```java
    return state
        .findEnclosing(ClassTree.class)
        .accept(
            new TreeScanner<VariableTree, Void>() {
              @Nullable
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `trim` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/android/WakelockReleasedDangerously.java`
#### Snippet
```java
              .matches(condition, state)
          && wakelockSymbol.equals(getSymbol(getReceiver(condition)))) {
        String ifBody = state.getSourceForNode(enclosingIfHeld.getThenStatement()).trim();
        // Remove leading and trailing `{}`
        ifBody = ifBody.startsWith("{") ? ifBody.substring(1) : ifBody;
```

### RuleId[ruleID=DataFlowIssue]
Argument `releaseStatementSource` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/android/WakelockReleasedDangerously.java`
#### Snippet
```java
        return SuggestedFix.replace(
            enclosingIfHeld,
            ifBody.replace(releaseStatementSource, before + releaseStatementSource + after));
      }
    }
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `isValidFragmentMethodSymbol` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/android/FragmentInjection.java`
#### Snippet
```java
              ImmutableList.of(state.getSymtab().stringType),
              ImmutableList.<Type>of());
      methodNotImplemented = isValidFragmentMethodSymbol.owner.equals(preferenceActivityTypeSymbol);
    } catch (FatalError e) {
      // If isValidFragment method symbol is not found, then we must be compiling against an old SDK
```

### RuleId[ruleID=DataFlowIssue]
Argument `source` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/flogger/FloggerMessageFormat.java`
#### Snippet
```java
    Description.Builder description = buildDescription(tree);
    String source = state.getSourceForNode(formatArg);
    String fixed = MESSAGE_FORMAT_SPECIFIER.matcher(source).replaceAll("%s");
    if (!source.equals(fixed)) {
      description.addFix(SuggestedFix.replace(formatArg, fixed));
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toString` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/AlmostJavadoc.java`
#### Snippet
```java
    ImmutableMap<Integer, Tree> javadocableTrees = getJavadocableTrees(tree, state);
    for (ErrorProneToken token :
        ErrorProneTokens.getTokens(state.getSourceCode().toString(), state.context)) {
      for (Comment comment : token.comments()) {
        if (!javadocableTrees.containsKey(token.pos())) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getLeaf` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/flogger/FloggerRequiredModifiers.java`
#### Snippet
```java
    TreePath owner =
        state.findPathToEnclosing(ClassTree.class, MethodTree.class, VariableTree.class);
    Tree parent = owner.getLeaf();
    Tree grandparent = owner.getParentPath().getLeaf();
    boolean isLoggerField =
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `subSequence` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/InvalidInlineTag.java`
#### Snippet
```java
        int startPos = Utils.getStartPosition(unknownInlineTagTree, state);
        int endPos = Utils.getEndPosition(unknownInlineTagTree, state);
        CharSequence text = state.getSourceCode().subSequence(startPos, endPos);
        Matcher matcher = PARAM_MATCHER.matcher(text);
        if (matcher.find()) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `subSequence` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
          if (startPos != null) {
            int endPos = getStartPosition(endTree, state);
            String source = state.getSourceCode().subSequence(startPos, endPos).toString();
            if (SHOULD_NOT_WRAP.matcher(source).find()) {
              dontEmitCodeFix.add(Range.closed(startPos, endPos));
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toString` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/Inliner.java`
#### Snippet
```java
          method.owner.getQualifiedName().toString(),
          method.getSimpleName().toString(),
          enclosingPackage(method).toString(),
          method.isConstructor(),
          hasAnnotation(method, "java.lang.Deprecated", state),
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `enclosingPackage(sym)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullArgumentForNonNullParameter.java`
#### Snippet
```java
      if (hasAnnotation(sym, "org.jspecify.nullness.NullMarked", state)
          && (!beingConservative
              || enclosingPackage(sym)
                  .fullname
                  .startsWith(COM_GOOGLE_COMMON_PREFIX_NAME.get(state)))) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/ParameterMissingNullable.java`
#### Snippet
```java
         */
        return true;
      } else if (tree instanceof IfTree && childInPath.equals(((IfTree) tree).getCondition())) {
        /*
         * We have something like `if (foo == null)`, etc., so we scan the then+else for code that
```

### RuleId[ruleID=DataFlowIssue]
Argument `constructedClass` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullnessUtils.java`
#### Snippet
```java
    }
    ClassSymbol constructedClass = enclosingClass(symbol);
    return enclosingClass(constructedClass) != null && !constructedClass.isStatic();
  }

```

### RuleId[ruleID=DataFlowIssue]
Argument `type` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/formatstring/FormatStringValidation.java`
#### Snippet
```java
    }
    Type type = ASTHelpers.getType(tree);
    return getInstance(type, state);
  }

```

### RuleId[ruleID=DataFlowIssue]
Argument `ASTHelpers.enclosingClass(sym)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/Parameter.java`
#### Snippet
```java
          // for the 'this' keyword the argument name is the name of the object's class
          Symbol sym = ASTHelpers.getSymbol(idTree);
          return sym != null ? getClassName(ASTHelpers.enclosingClass(sym)) : NAME_NOT_PRESENT;
        } else {
          // if we have a variable, just extract its name
```

### RuleId[ruleID=DataFlowIssue]
Argument `ASTHelpers.enclosingClass(methodSym)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/Parameter.java`
#### Snippet
```java
            ExpressionTree receiver = ASTHelpers.getReceiver(methodInvocationTree);
            if (receiver == null) {
              return getClassName(ASTHelpers.enclosingClass(methodSym));
            }
            // recursively try to get a name from the receiver
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `allparams` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TypeArgOfMethodArgMatcher.java`
#### Snippet
```java
  Type extractSourceType(MemberReferenceTree tree, VisitorState state) {
    return extractTypeArgAsMemberOfSupertype(
        getType(tree).allparams().get(methodArgIndex),
        state.getSymbolFromString(methodArgTypeName),
        methodArgTypeArgIndex,
```

### RuleId[ruleID=DataFlowIssue]
Argument `getType(result.sourceTree())` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TypeArgOfMethodArgMatcher.java`
#### Snippet
```java
  @Override
  public String message(MatchResult result, String sourceType, String targetType) {
    String sourceTreeType = Signatures.prettyType(getType(result.sourceTree()));
    return String.format(
        "Argument '%s' should not be passed to this method; its type %s has a type argument "
```

### RuleId[ruleID=DataFlowIssue]
Argument `ASTHelpers.getType(tree)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableChecker.java`
#### Snippet
```java
            Optional.of(tree),
            typarams,
            ASTHelpers.getType(tree),
            (t, i) -> describeAnonymous(t, superType, i));
    if (!info.isPresent()) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `type` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableChecker.java`
#### Snippet
```java
    checkInvocation(tree, getSymbol(tree), ((JCMemberReference) tree).referentType, state);
    ImmutableAnalysis analysis = createImmutableAnalysis(state);
    TypeSymbol memberReferenceType = targetType(state).type().tsym;
    Violation info =
        analysis.checkInstantiation(
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getTypeArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableChecker.java`
#### Snippet
```java
    Violation info =
        analysis.checkInstantiation(
            memberReferenceType.getTypeParameters(), getType(tree).getTypeArguments());

    if (info.isPresent()) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getTypeArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableChecker.java`
#### Snippet
```java
        state,
        getSymbol(tree.getIdentifier()).getTypeParameters(),
        ASTHelpers.getType(tree).getTypeArguments());

    ClassTree classBody = tree.getClassBody();
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `getType(tree)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableChecker.java`
#### Snippet
```java
  @Override
  public Description matchLambdaExpression(LambdaExpressionTree tree, VisitorState state) {
    TypeSymbol lambdaType = getType(tree).tsym;
    ImmutableAnalysis analysis = createImmutableAnalysis(state);
    Violation info =
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getTypeArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableChecker.java`
#### Snippet
```java
    Violation info =
        analysis.checkInstantiation(
            lambdaType.getTypeParameters(), getType(tree).getTypeArguments());

    if (info.isPresent()) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getTypeArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableChecker.java`
#### Snippet
```java
          analysis,
          getSymbol(implementTree).getTypeParameters(),
          ASTHelpers.getType(implementTree).getTypeArguments());
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getTypeArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableChecker.java`
#### Snippet
```java
          analysis,
          getSymbol(extendsClause).getTypeParameters(),
          ASTHelpers.getType(extendsClause).getTypeArguments());
    }
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getTypeArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableChecker.java`
#### Snippet
```java
        state,
        getSymbol(tree).getTypeParameters(),
        ASTHelpers.getType(tree).getTypeArguments());
    return NO_MATCH;
  }
```

### RuleId[ruleID=DataFlowIssue]
Argument `receiver` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TruthIncompatibleType.java`
#### Snippet
```java
    Type targetType =
        getIterableTypeArg(
            getOnlyElement(getSymbol((MethodInvocationTree) receiver).getParameters()).type,
            ignoringCasts(getOnlyElement(((MethodInvocationTree) receiver).getArguments())),
            state);
```

### RuleId[ruleID=DataFlowIssue]
Argument `receiver` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TruthIncompatibleType.java`
#### Snippet
```java
    Type targetType =
        getIterableTypeArg(
            getOnlyElement(getSymbol((MethodInvocationTree) receiver).getParameters()).type,
            ignoringCasts(getOnlyElement(((MethodInvocationTree) receiver).getArguments())),
            state);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TruthIncompatibleType.java`
#### Snippet
```java
    }

    ExpressionTree assertee = getOnlyElement(((MethodInvocationTree) receiver).getArguments());
    TypeSymbol assertionType =
        getOnlyElement(getSymbol((MethodInvocationTree) receiver).getParameters()).type.tsym;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TruthIncompatibleType.java`
#### Snippet
```java
    }

    ExpressionTree assertee = getOnlyElement(((MethodInvocationTree) receiver).getArguments());
    TypeSymbol assertionType =
        getOnlyElement(getSymbol((MethodInvocationTree) receiver).getParameters()).type.tsym;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TruthIncompatibleType.java`
#### Snippet
```java
    }

    Tree argument = ignoringCasts(getOnlyElement(((MethodInvocationTree) receiver).getArguments()));
    Type targetType =
        getIterableTypeArg(
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `((ArrayType) argumentType)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TruthIncompatibleType.java`
#### Snippet
```java
              Type argumentType = getType(arg);
              return isNonVarargsCall(methodSymbol, index, argumentType)
                  ? checkCompatibility(arg, targetType, ((ArrayType) argumentType).elemtype, state)
                  : checkCompatibility(arg, targetType, argumentType, state);
            })
```

### RuleId[ruleID=DataFlowIssue]
Argument `receiver` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TruthIncompatibleType.java`
#### Snippet
```java
    Type targetType =
        getIterableTypeArg(
            getOnlyElement(getSymbol((MethodInvocationTree) receiver).getParameters()).type,
            ignoringCasts(getOnlyElement(((MethodInvocationTree) receiver).getArguments())),
            state);
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `((ArrayType) getType(getOnlyElement(tree.getArguments())))` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TruthIncompatibleType.java`
#### Snippet
```java
            ignoringCasts(getOnlyElement(((MethodInvocationTree) receiver).getArguments())),
            state);
    Type sourceType = ((ArrayType) getType(getOnlyElement(tree.getArguments()))).elemtype;
    return checkCompatibility(getOnlyElement(tree.getArguments()), targetType, sourceType, state);
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TruthIncompatibleType.java`
#### Snippet
```java
    }

    ExpressionTree assertee = getOnlyElement(((MethodInvocationTree) receiver).getArguments());
    TypeSymbol assertionType =
        getOnlyElement(getSymbol((MethodInvocationTree) receiver).getParameters()).type.tsym;
```

### RuleId[ruleID=DataFlowIssue]
Argument `sourceType` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TruthIncompatibleType.java`
#### Snippet
```java
        getType(ignoringCasts(getOnlyElement(((MethodInvocationTree) receiver).getArguments())));
    Type sourceType = getType(getOnlyElement(tree.getArguments()));
    if (isNumericType(sourceType, state) && isNumericType(targetType, state)) {
      return Stream.of();
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `targetType` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TruthIncompatibleType.java`
#### Snippet
```java
        getType(ignoringCasts(getOnlyElement(((MethodInvocationTree) receiver).getArguments())));
    Type sourceType = getType(getOnlyElement(tree.getArguments()));
    if (isNumericType(sourceType, state) && isNumericType(targetType, state)) {
      return Stream.of();
    }
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `JAVA_SPECIFICATION_VERSION.value()` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/BaseErrorProneJavaCompiler.java`
#### Snippet
```java

    String overrideLanguageLevel;
    switch (JAVA_SPECIFICATION_VERSION.value()) {
      case "1.7":
        overrideLanguageLevel = "7";
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `check_api/src/main/java/com/google/errorprone/JavacErrorDescriptionListener.java`
#### Snippet
```java
            type = JCDiagnostic.DiagnosticType.WARNING;
          } else {
            type = JCDiagnostic.DiagnosticType.ERROR;
          }
          break;
```

### RuleId[ruleID=DataFlowIssue]
Argument `ASTHelpers.getFileName(tree)` might be null
in `check_api/src/main/java/com/google/errorprone/ErrorProneAnalyzer.java`
#### Snippet
```java
    Pattern excludedPattern = errorProneOptions.getExcludedPattern();
    return excludedPattern != null
        && excludedPattern.matcher(ASTHelpers.getFileName(tree)).matches();
  }

```

### RuleId[ruleID=DataFlowIssue]
Dereference of `enclosingClass(symbol)` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/util/Visibility.java`
#### Snippet
```java
      ClassTree classTree = ASTHelpers.findEnclosingNode(state.getPath(), ClassTree.class);
      return classTree != null
          && hasEnclosingClassExtending(enclosingClass(symbol).type, state, classTree);
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `equals` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/util/Visibility.java`
#### Snippet
```java
      PackageSymbol packge = compilationUnit.packge;
      // TODO(ghm): Should we handle the default (unnamed) package here?
      return enclosingPackage(symbol).equals(packge);
    }

```

### RuleId[ruleID=DataFlowIssue]
Dereference of `enclosingClass(symbol)` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/util/Visibility.java`
#### Snippet
```java
          return false;
        }
        return hasEnclosingClassExtending(enclosingClass(symbol).type, state, classTree);
      }
      // Anonymous subclasses will match on the synthetic constructor.
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `enclosingClass(symbol)` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/util/Visibility.java`
#### Snippet
```java
      }
      if (!(tree instanceof ExpressionTree)) {
        return hasEnclosingClassExtending(enclosingClass(symbol).type, state, classTree);
      }
      if (tree instanceof MemberSelectTree
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toString` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/util/Visibility.java`
#### Snippet
```java
      if (tree instanceof MemberSelectTree || tree instanceof MemberReferenceTree) {
        ExpressionTree receiver = ASTHelpers.getReceiver((ExpressionTree) tree);
        return receiver.toString().equals("super")
            || hasEnclosingClassOfSuperType(getType(receiver), state, classTree);
      }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `equals` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/util/Visibility.java`
#### Snippet
```java
        }
      }
      return outermostClass == null || ASTHelpers.outermostClass(symbol).equals(outermostClass);
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `subSequence` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/util/Comments.java`
#### Snippet
```java
    }

    CharSequence source = sourceCode.subSequence(invocationStart, endPosition.get());

    if (CharMatcher.is('/').matchesNoneOf(source)) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `length` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/VisitorState.java`
#### Snippet
```java
    checkArgument(start >= 0, "invalid start position (%s) for: %s", start, tree);
    checkArgument(start < end, "invalid source positions (%s, %s) for: %s", start, end, tree);
    checkArgument(end <= source.length(), "invalid end position (%s) for: %s", end, tree);
    return source.subSequence(start, end).toString();
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `subSequence` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/VisitorState.java`
#### Snippet
```java
  public List<ErrorProneToken> getOffsetTokens(int start, int end) {
    return ErrorProneTokens.getTokens(
        getSourceCode().subSequence(start, end).toString(), start, context);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `leastUpperBound` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/dataflow/AccessPathStore.java`
#### Snippet
```java
    ImmutableMap.Builder<AccessPath, V> resultHeap = ImmutableMap.builder();
    for (AccessPath aPath : intersection(heap().keySet(), other.heap().keySet())) {
      resultHeap.put(aPath, heap().get(aPath).leastUpperBound(other.heap().get(aPath)));
    }
    return AccessPathStore.create(resultHeap.buildOrThrow());
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isPresent` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/InferredNullability.java`
#### Snippet
```java
      }

      checkState(!inferredMemoTable.put(iv, result).isPresent());
      return result;
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `getDeclaredSymbol(tree)` might be null
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
   */
  public static boolean hasDirectAnnotationWithSimpleName(Tree tree, String simpleName) {
    return hasDirectAnnotationWithSimpleName(getDeclaredSymbol(tree), simpleName);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `hasTag` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
      return null;
    }
    if (type.hasTag(TypeTag.BOOLEAN) && value instanceof Integer) {
      return ((Integer) value) == 1;
    }
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `getType(resource)` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
    public void scanResources(TryTree tree) {
      for (Tree resource : tree.getResources()) {
        Symbol symbol = getType(resource).tsym;

        if (symbol instanceof ClassSymbol) {
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `tryGetMethodSymbol(node.getTree(), null)` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/AbstractNullnessPropagationTransfer.java`
#### Snippet
```java
     * current code does. To avoid problems, we return a RegularTransferResult when possible.
     */
    if (tryGetMethodSymbol(node.getTree(), null).isBoolean) {
      ResultingStore thenStore = updateStore(input.getThenStore(), thenUpdates, bothUpdates);
      ResultingStore elseStore = updateStore(input.getElseStore(), elseUpdates, bothUpdates);
```

### RuleId[ruleID=DataFlowIssue]
Argument `callee` might be null
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/NullnessPropagationTransfer.java`
#### Snippet
```java
      setNonnullIfTrackable(bothUpdates, node.getTarget().getReceiver());
    }
    setUnconditionalArgumentNullness(bothUpdates, node.getArguments(), callee);
    setConditionalArgumentNullness(
        thenUpdates,
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `matches` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/matchers/UnusedReturnValueMatcher.java`
#### Snippet
```java
  public Stream<AllowReason> getAllowReasons(ExpressionTree tree, VisitorState state) {
    return validAllowReasons.stream()
        .filter(reason -> ALLOW_MATCHERS.get(reason).matches(tree, state));
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getExpression` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
            s ->
                !MUTATING_UNARY_TAGS.contains(tag)
                    || !(s.result().getExpression() instanceof PlaceholderParamIdent));
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getVariable` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
            s -> unifyExpression(node.getExpression(), s),
            (variable, expr) -> maker().Assignop(((JCAssignOp) node).getTag(), variable, expr))
        .condition(assignOp -> !(assignOp.result().getVariable() instanceof PlaceholderParamIdent));
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `prepend` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
                      .transform(
                          treeState ->
                              treeState.withResult(s.result().prepend(treeState.result()))));
    }
    return choice.transform(s -> s.withResult(s.result().reverse()));
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `reverse` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
                              treeState.withResult(s.result().prepend(treeState.result()))));
    }
    return choice.transform(s -> s.withResult(s.result().reverse()));
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getVariable` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
            s -> unifyExpression(node.getExpression(), s),
            maker()::Assign)
        .condition(s -> !(s.result().getVariable() instanceof PlaceholderParamIdent));
  }

```

### RuleId[ruleID=DataFlowIssue]
Argument `JAVA_CLASS_PATH.value()` might be null
in `test_helpers/src/main/java/com/google/errorprone/FileManagers.java`
#### Snippet
```java
  private static ImmutableList<Path> systemClassPath() {
    // splitToStream isn't available if Android guava is on the classpath
    return stream(Splitter.on(File.pathSeparatorChar).split(JAVA_CLASS_PATH.value()))
        .map(Paths::get)
        .collect(toImmutableList());
```

### RuleId[ruleID=DataFlowIssue]
Argument `is` might be null
in `test_helpers/src/main/java/com/google/errorprone/CompilationTestHelper.java`
#### Snippet
```java
          jos.putNextEntry(new JarEntry(entryPath));
          try (InputStream is = clazz.getClassLoader().getResourceAsStream(entryPath)) {
            ByteStreams.copy(is, jos);
          }
        }
```

### RuleId[ruleID=DataFlowIssue]
Argument `ASTHelpers.getDeclaredSymbol(tree)` might be null
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
    return (tree, state) ->
        ASTHelpers.hasDirectAnnotationWithSimpleName(
            ASTHelpers.getDeclaredSymbol(tree), simpleName);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `subSequence` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
    for (Comment comment : comments) {
      int endOfCommentPos = comment.getSourcePos(comment.getText().length() - 1);
      CharSequence stringBetweenComments = sourceCode.subSequence(endOfCommentPos, startPos);
      if (stringBetweenComments.chars().filter(c -> c == '\n').count() > 1) {
        break;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `indexOf` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
    // handle implicit lambda parameter types
    int searchOffset = typeEndPos == -1 ? 0 : (typeEndPos - getStartPosition(tree));
    int pos = getStartPosition(tree) + state.getSourceForNode(tree).indexOf(name, searchOffset);
    return SuggestedFix.builder()
        .replace(pos, pos + name.length(), replacement)
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `value` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java

    SuppressWarnings annotation = getAnnotation(suppressibleNode, SuppressWarnings.class);
    ImmutableSet<String> warningsSuppressed = ImmutableSet.copyOf(annotation.value());
    ImmutableSet<String> newWarningSet =
        warningsSuppressed.stream()
```

## RuleId[ruleID=SimplifyStreamApiCallChains]
### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'List.contains()'
in `core/src/main/java/com/google/errorprone/bugpatterns/NullableOnContainingClass.java`
#### Snippet
```java
      return false;
    }
    return stream(target.value()).anyMatch(t -> t.equals(ElementType.TYPE_USE));
  }

```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'String.join'
in `core/src/main/java/com/google/errorprone/bugpatterns/ModifiedButNotUsed.java`
#### Snippet
```java
          encounteredSideEffects = true;
          withSideEffects.replace(
              enclosingStatement, keepingSideEffects.stream().collect(joining("")));
        } else {
          withSideEffects.replace(enclosingStatement, "");
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
'Stream.allMatch(x -\> !(...))' can be replaced with 'noneMatch()'
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/CreatesDuplicateCallHeuristic.java`
#### Snippet
```java
      Changes changes, Tree node, MethodSymbol symbol, VisitorState state) {
    return findArgumentsForOtherInstances(symbol, node, state).stream()
        .allMatch(arguments -> !anyArgumentsMatch(changes.changedPairs(), arguments));
  }

```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'List.contains()'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafety.java`
#### Snippet
```java
      checkArgument(
          Arrays.stream(typeParameterAnnotation.getAnnotation(Target.class).value())
              .anyMatch(ElementType.TYPE_PARAMETER::equals),
          "%s must be applicable to type parameters",
          typeParameterAnnotation);
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `check_api/src/main/java/com/google/errorprone/util/FindIdentifiers.java`
#### Snippet
```java
        case FOR_LOOP:
          ForLoopTree forLoop = (ForLoopTree) curr;
          forLoop.getInitializer().stream().forEach(t -> addIfVariable(t, definedVariables));
          break;
        case ENHANCED_FOR_LOOP:
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'String.join'
in `check_api/src/main/java/com/google/errorprone/names/NamingConventions.java`
#### Snippet
```java

  public static String convertToLowerUnderscore(String identifierName) {
    return splitToLowercaseTerms(identifierName).stream().collect(Collectors.joining("_"));
  }

```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with three-arg 'iterate()'
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
   */
  public static Stream<Symbol> enclosingElements(Symbol sym) {
    return Stream.iterate(sym, Symbol::getEnclosingElement).takeWhile(s -> s != null);
  }

```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'String.join'
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
      }
      // The qualified name up to (and including) the component we're currently dealing with.
      String qualifiedName = components.subList(0, i + 1).stream().collect(joining("."));

      Symbol found = FindIdentifiers.findIdent(component, state, KindSelector.VAL_TYP);
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'String.join'
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
      if (found == null) {
        fix.addImport(qualifiedName);
        return components.subList(i, components.size()).stream().collect(joining("."));
      }
      // Type already imported or otherwise visible.
```

### RuleId[ruleID=SimplifyStreamApiCallChains]
Can be replaced with 'String.join'
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
      // Type already imported or otherwise visible.
      if (found.getQualifiedName().contentEquals(qualifiedName)) {
        return components.subList(i, components.size()).stream().collect(joining("."));
      }
    }
```

## RuleId[ruleID=StringOperationCanBeSimplified]
### RuleId[ruleID=StringOperationCanBeSimplified]
Unnecessary string length argument
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
    int idx = refString.indexOf('#');
    if (idx >= 0) {
      qualifiedName = sym.owner.getQualifiedName() + refString.substring(idx, refString.length());
    } else {
      qualifiedName = sym.getQualifiedName().toString();
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'descending' is still used
in `check_api/src/main/java/com/google/errorprone/fixes/Replacements.java`
#### Snippet
```java
   */
  @Deprecated
  public Set<Replacement> descending() {
    // TODO(cushon): refactor SuggestedFix#getReplacements and just return a Collection,
    return new LinkedHashSet<>(replacements.values());
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'UnlockMethod' is still used
in `annotations/src/main/java/com/google/errorprone/annotations/concurrent/UnlockMethod.java`
#### Snippet
```java
@Retention(CLASS)
@Deprecated
public @interface UnlockMethod {
  String[] value();
}
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'ParameterMatcher' is still used
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatchers.java`
#### Snippet
```java
   */
  @Deprecated
  public interface ParameterMatcher extends MethodMatcher {}

  // Method matcher factories
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'MethodNameMatcher' is still used
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatchers.java`
#### Snippet
```java
   */
  @Deprecated
  public interface MethodNameMatcher extends MethodMatcher {
    /** Match methods with no formal parameters. */
    ParameterMatcher withNoParameters();
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'InstanceMethodMatcher' is still used
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatchers.java`
#### Snippet
```java
   */
  @Deprecated
  public interface InstanceMethodMatcher extends MethodMatcher {
    /** Match on types that satisfy the given predicate. */
    MethodClassMatcher onClass(TypePredicate predicate);
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'StaticMethodMatcher' is still used
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatchers.java`
#### Snippet
```java
   */
  @Deprecated
  public interface StaticMethodMatcher extends MethodMatcher {
    /** Match on types that satisfy the given predicate. */
    MethodClassMatcher onClass(TypePredicate predicate);
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'ConstructorClassMatcher' is still used
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatchers.java`
#### Snippet
```java
   */
  @Deprecated
  public interface ConstructorClassMatcher extends MethodMatcher {
    /** Match constructors with no formal parameters. */
    ParameterMatcher withNoParameters();
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'ConstructorMatcher' is still used
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatchers.java`
#### Snippet
```java
   */
  @Deprecated
  public interface ConstructorMatcher extends MethodMatcher {
    /** Match on types that satisfy the given predicate. */
    ConstructorClassMatcher forClass(TypePredicate predicate);
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'AnyMethodMatcher' is still used
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatchers.java`
#### Snippet
```java
   */
  @Deprecated
  public interface AnyMethodMatcher extends MethodMatcher {
    /** Match the given type exactly. */
    MethodClassMatcher onClass(TypePredicate predicate);
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'MethodSignatureMatcher' is still used
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatchers.java`
#### Snippet
```java
   */
  @Deprecated
  public interface MethodSignatureMatcher extends MethodMatcher {}

  /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'MethodClassMatcher' is still used
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatchers.java`
#### Snippet
```java
   */
  @Deprecated
  public interface MethodClassMatcher extends MethodMatcher {
    /** Match methods with the given name. (e.g. {@code toString}) */
    MethodNameMatcher named(String name);
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'MethodMatcher' is still used
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatchers.java`
#### Snippet
```java
   */
  @Deprecated
  public interface MethodMatcher extends Matcher<ExpressionTree> {}

  // Language definition for fluent method matchers.
```

## RuleId[ruleID=OptionalContainsCollection]
### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `List`
in `core/src/main/java/com/google/errorprone/refaster/ULambda.java`
#### Snippet
```java
    if (getBody() instanceof UPlaceholderExpression) {
      UPlaceholderExpression body = (UPlaceholderExpression) getBody();
      Optional<List<JCStatement>> blockBinding =
          inliner.getOptionalBinding(body.placeholder().blockKey());
      if (blockBinding.isPresent()) {
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `List`
in `core/src/main/java/com/google/errorprone/refaster/UPlaceholderStatement.java`
#### Snippet
```java
  public List<JCStatement> inlineStatements(Inliner inliner) throws CouldNotResolveImportException {
    try {
      Optional<List<JCStatement>> binding = inliner.getOptionalBinding(placeholder().blockKey());

      // If a placeholder was used as an expression binding in the @BeforeTemplate,
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `java.util.List`
in `core/src/main/java/com/google/errorprone/refaster/Template.java`
#### Snippet
```java
        result.add(singleBinding.get().type);
      } else {
        Optional<java.util.List<JCExpression>> exprs =
            inliner.getOptionalBinding(new URepeated.Key(argName));
        if (exprs.isPresent() && !exprs.get().isEmpty()) {
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `java.util.List`
in `core/src/main/java/com/google/errorprone/refaster/Template.java`
#### Snippet
```java
          inliner.getOptionalBinding(new UFreeIdent.Key(argName));
      if (!singleBinding.isPresent()) {
        Optional<java.util.List<JCExpression>> exprs =
            inliner.getOptionalBinding(new URepeated.Key(argName));
        if (!exprs.isPresent() || exprs.get().isEmpty()) {
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `ImmutableList`
in `core/src/main/java/com/google/errorprone/bugpatterns/time/NearbyCallers.java`
#### Snippet
```java
  //
  // the chain would be [getC(), getB(), getA(), x]
  private static Optional<ImmutableList<Symbol>> buildProtoGetterChain(
      ExpressionTree expr, VisitorState state) {
    ImmutableList.Builder<Symbol> symbolChain = ImmutableList.builder();
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `ImmutableSet`
in `check_api/src/main/java/com/google/errorprone/ErrorProneFlags.java`
#### Snippet
```java
   * empty set will be returned.
   */
  public <T extends Enum<T>> Optional<ImmutableSet<T>> getEnumSet(String key, Class<T> clazz) {
    return this.get(key)
        .map(
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Set`
in `check_api/src/main/java/com/google/errorprone/ErrorProneFlags.java`
#### Snippet
```java
   * <p>(note: empty strings included, e.g. {@code "-XepOpt:Set=,1,,1,2," => ["","1","2"]})
   */
  public Optional<Set<String>> getSet(String key) {
    return this.get(key).map(v -> ImmutableSet.copyOf(Splitter.on(',').split(v)));
  }
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `List`
in `check_api/src/main/java/com/google/errorprone/ErrorProneFlags.java`
#### Snippet
```java
   * <p>(note: empty strings included, e.g. {@code "-XepOpt:List=,1,,2," => ["","1","","2",""]})
   */
  public Optional<List<String>> getList(String key) {
    return this.get(key).map(v -> ImmutableList.copyOf(Splitter.on(',').split(v)));
  }
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `Set`
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodInvocationMatcher.java`
#### Snippet
```java
      int tokensHandled = 0;
      for (TokenType type : TokenType.values()) {
        Optional<Set<Token>> labels = Optional.ofNullable(required.get(type));
        if (labels.isPresent()) {
          tokensHandled++;
```

## RuleId[ruleID=Convert2MethodRef]
### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/UnsafeFinalization.java`
#### Snippet
```java
        tree.getArguments().stream()
            .map(ASTHelpers::getSymbol)
            .filter(x -> x != null)
            .collect(toImmutableList());
    if (arguments.stream()
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/DoNotClaimAnnotations.java`
#### Snippet
```java
              Stream.of("java.util.Set", "javax.annotation.processing.RoundEnvironment")
                  .map(s::getTypeFromString)
                  .filter(x -> x != null)
                  .collect(toImmutableList()));

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/MultipleUnaryOperatorsInMethodCall.java`
#### Snippet
```java
        .filter(arg -> UNARY_OPERATORS.contains(arg.getKind()))
        .map(arg -> ASTHelpers.getSymbol(((UnaryTree) arg).getExpression()))
        .filter(sym -> sym != null)
        .collect(groupingBy(Function.identity(), Collectors.counting()))
        .entrySet()
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/FloatCast.java`
#### Snippet
```java
      if (pow.getArguments().stream()
          .map(ASTHelpers::getType)
          .filter(x -> x != null)
          .map(state.getTypes()::unboxedTypeOrType)
          .map(Type::getKind)
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/CheckedExceptionNotThrown.java`
#### Snippet
```java
        .filter(v -> !getSymbol(v).isStatic())
        .map(VariableTree::getInitializer)
        .filter(i -> i != null);
  }

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/MethodCanBeStatic.java`
#### Snippet
```java
          Set<MethodTree> affectedTrees, SuggestedFix fix, VisitorState state, BugChecker checker) {
        return affectedTrees.stream()
            .min(Comparator.comparingInt(t -> getStartPosition(t)))
            .map(t -> checker.describeMatch(t.getModifiers(), fix))
            .orElse(NO_MATCH);
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/MultipleParallelOrSequentialCalls.java`
#### Snippet
```java
        // this check makes it so that we stop iterating up once it's done
        if (methodInvocationTree.getArguments().stream()
            .map(m -> state.getSourceForNode(m))
            .anyMatch(m -> m.contains(state.getSourceForNode(t)))) {
          break;
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/ForOverrideChecker.java`
#### Snippet
```java
            stream(state.getPath())
                .filter(t -> t instanceof ClassTree)
                .map(t -> ASTHelpers.getType(t)))
        .orElse(null);
  }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/DefaultPackage.java`
#### Snippet
```java
    if (tree.getTypeDecls().stream()
        .map(ASTHelpers::getSymbol)
        .filter(x -> x != null)
        .anyMatch(s -> !ASTHelpers.getGeneratedBy(s, state).isEmpty())) {
      return Description.NO_MATCH;
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/AnnotationPosition.java`
#### Snippet
```java

    int firstModifierPos =
        modifierTokens.stream().findFirst().map(x -> x.pos()).orElse(Integer.MAX_VALUE);
    int lastModifierPos = Streams.findLast(modifierTokens.stream()).map(x -> x.endPos()).orElse(0);

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/AnnotationPosition.java`
#### Snippet
```java
    int firstModifierPos =
        modifierTokens.stream().findFirst().map(x -> x.pos()).orElse(Integer.MAX_VALUE);
    int lastModifierPos = Streams.findLast(modifierTokens.stream()).map(x -> x.endPos()).orElse(0);

    Description description =
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/AnnotationPosition.java`
#### Snippet
```java

  private static final ImmutableMap<String, TokenKind> TOKEN_KIND_BY_NAME =
      Arrays.stream(TokenKind.values()).collect(toImmutableMap(tk -> tk.name(), tk -> tk));

  private static final ImmutableSet<TokenKind> MODIFIERS =
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractReturnValueIgnored.java`
#### Snippet
```java
          () ->
              allOf(
                  (t, s) -> isObjectReturningMethodReferenceExpression(t, s),
                  not((t, s) -> isExemptedInterfaceType(getType(t), s)),
                  not((t, s) -> isThrowingFunctionalInterface(getType(t), s)),
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/CanonicalDuration.java`
#### Snippet
```java
      FACTORIES.rowMap().values().stream()
          .flatMap(x -> x.entrySet().stream())
          .collect(toImmutableMap(x -> x.getValue(), x -> x.getKey()));

  private static final ImmutableMap<ChronoUnit, Converter<Duration, Long>> CONVERTERS =
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/CanonicalDuration.java`
#### Snippet
```java
      FACTORIES.rowMap().values().stream()
          .flatMap(x -> x.entrySet().stream())
          .collect(toImmutableMap(x -> x.getValue(), x -> x.getKey()));

  private static final ImmutableMap<ChronoUnit, Converter<Duration, Long>> CONVERTERS =
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/time/TimeUnitMismatch.java`
#### Snippet
```java
    return wordsLists.stream()
        .map(UNIT_FOR_SUFFIX::get)
        .filter(x -> x != null)
        .collect(toImmutableSet());
  }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/time/DurationTemporalUnit.java`
#### Snippet
```java
  private static final ImmutableSet<ChronoUnit> INVALID_TEMPORAL_UNITS =
      Arrays.stream(ChronoUnit.values())
          .filter(c -> c.isDurationEstimated())
          .filter(c -> !c.equals(ChronoUnit.DAYS)) // DAYS is explicitly allowed
          .collect(toImmutableEnumSet());
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/time/InvalidJavaTimeConstant.java`
#### Snippet
```java

      private static ImmutableList<ChronoField> getParameterUnits(Param... params) {
        return stream(params).map(p -> p.unit()).collect(toImmutableList());
      }

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/time/InvalidJavaTimeConstant.java`
#### Snippet
```java

      private static ImmutableList<String> getParameterTypes(Param... params) {
        return stream(params).map(p -> p.type()).collect(toImmutableList());
      }

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/android/FragmentNotInstantiable.java`
#### Snippet
```java
            anyOf(
                fragmentClasses.stream()
                    .map(fragmentClass -> isSubtypeOf(fragmentClass))
                    .collect(Collectors.toList())));
  }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/formatstring/FormatStringValidation.java`
#### Snippet
```java
    return formatStrings
        .map(formatString -> validate(formatString, instances))
        .filter(x -> x != null)
        .findFirst()
        .orElse(null);
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/formatstring/FormatStringValidation.java`
#### Snippet
```java
      }
    }.visit(tree, null);
    return flat.stream().map(t -> ASTHelpers.constValue(t, String.class)).filter(x -> x != null);
  }

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/ArgumentChangeFinder.java`
#### Snippet
```java
        .filter(ParameterPair::isAlternativePairing)
        .filter(p -> !p.actual().isAssignableTo(p.formal(), invocationInfo.state()))
        .forEach(p -> costs.invalidatePair(p));

    /* If there are no formal parameters which are assignable to any alternative actual parameters
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `check_api/src/main/java/com/google/errorprone/ErrorProneTimings.java`
#### Snippet
```java
  public ImmutableMap<String, Duration> timings() {
    return timers.entrySet().stream()
        .collect(toImmutableMap(e -> e.getKey(), e -> e.getValue().elapsed()));
  }
}
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `check_api/src/main/java/com/google/errorprone/ErrorProneTimings.java`
#### Snippet
```java
    String key = suppressible.canonicalName();
    Stopwatch sw = timers.computeIfAbsent(key, k -> Stopwatch.createUnstarted()).start();
    return () -> sw.stop();
  }

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `check_api/src/main/java/com/google/errorprone/BugCheckerInfo.java`
#### Snippet
```java
        pattern.severity(),
        createLinkUrl(canonicalName, pattern),
        Stream.of(pattern.suppressionAnnotations()).anyMatch(a -> isSuppressWarnings(a)),
        Stream.of(pattern.suppressionAnnotations())
            .filter(a -> !isSuppressWarnings(a))
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `check_api/src/main/java/com/google/errorprone/util/MoreAnnotations.java`
#### Snippet
```java
              @Override
              public Stream<String> visitArray(List<? extends AnnotationValue> list, Void unused) {
                return list.stream().flatMap(a -> a.accept(this, null)).filter(x -> x != null);
              }
            },
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `check_api/src/main/java/com/google/errorprone/scanner/ScannerSupplier.java`
#### Snippet
```java
    if (errorProneOptions.isDisableAllChecks()) {
      getAllChecks().values().stream()
          .filter(c -> c.disableable())
          .forEach(c -> disabled.add(c.canonicalName()));
    }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `check_api/src/main/java/com/google/errorprone/names/TermEditDistance.java`
#### Snippet
```java
    double[][] worstCaseMatrix =
        sourceTerms.stream()
            .map(s -> s.length())
            .map(
                s ->
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `check_api/src/main/java/com/google/errorprone/names/TermEditDistance.java`
#### Snippet
```java
                s ->
                    targetTerms.stream()
                        .map(t -> t.length())
                        .mapToDouble(t -> maxDistanceFn.apply(s, t))
                        .toArray())
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
   */
  public static Stream<Symbol> enclosingElements(Symbol sym) {
    return Stream.iterate(sym, Symbol::getEnclosingElement).takeWhile(s -> s != null);
  }

```

## RuleId[ruleID=UnnecessaryCallToStringValueOf]
### RuleId[ruleID=UnnecessaryCallToStringValueOf]
Unnecessary `Boolean.toString()` call
in `core/src/main/java/com/google/errorprone/bugpatterns/ComparisonOutOfRange.java`
#### Snippet
```java
              (int) Byte.MAX_VALUE,
              state.getSourceForNode(literal),
              Boolean.toString(willEvaluateTo));
    } else {
      fix = SuggestedFix.replace(tree, Boolean.toString(willEvaluateTo));
```

### RuleId[ruleID=UnnecessaryCallToStringValueOf]
Unnecessary `Boolean.toString()` call
in `core/src/main/java/com/google/errorprone/bugpatterns/ComparisonOutOfRange.java`
#### Snippet
```java
              (int) Character.MAX_VALUE,
              state.getSourceForNode(literal),
              Boolean.toString(willEvaluateTo));
    }
    return buildDescription(tree).addFix(fix).setMessage(customDiagnosticMessage).build();
```

## RuleId[ruleID=JavaReflectionMemberAccess]
### RuleId[ruleID=JavaReflectionMemberAccess]
Cannot resolve method 'Break' with specified argument types
in `core/src/main/java/com/google/errorprone/refaster/UBreak.java`
#### Snippet
```java
        return (JCBreak)
            TreeMaker.class
                .getMethod("Break", JCExpression.class)
                .invoke(inliner.maker(), inliner.maker().Ident(label));
      } else {
```

### RuleId[ruleID=JavaReflectionMemberAccess]
Cannot resolve method 'fromHex'
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
      void validate(MethodInvocationTree tree, String argument) {
        try {
          ByteString.class.getMethod("fromHex", String.class).invoke(null, argument);
        } catch (NoSuchMethodException | IllegalAccessException e) {
          return;
```

### RuleId[ruleID=JavaReflectionMemberAccess]
Cannot resolve method 'getExpressions'
in `core/src/main/java/com/google/errorprone/bugpatterns/MissingCasesInEnumSwitch.java`
#### Snippet
```java
      if (RuntimeVersion.isAtLeast12()) {
        return ((List<? extends ExpressionTree>)
                CaseTree.class.getMethod("getExpressions").invoke(caseTree))
            .stream();
      } else {
```

### RuleId[ruleID=JavaReflectionMemberAccess]
Cannot resolve method 'getBody'
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullnessUtils.java`
#### Snippet
```java
    try {
      if (getBodyMethod == null) {
        getBodyMethod = CaseTree.class.getMethod("getBody");
      }
      return (Tree) getBodyMethod.invoke(caseTree);
```

### RuleId[ruleID=JavaReflectionMemberAccess]
Cannot resolve method 'error' with specified argument types
in `check_api/src/main/java/com/google/errorprone/ErrorProneError.java`
#### Snippet
```java
      // use reflection since this overload of error doesn't exist in JDK >= 11
      Method m =
          Log.class.getMethod("error", DiagnosticPosition.class, String.class, Object[].class);
      m.invoke(
          log,
```

### RuleId[ruleID=JavaReflectionMemberAccess]
Cannot resolve method 'findIdent' with specified argument types
in `check_api/src/main/java/com/google/errorprone/util/FindIdentifiers.java`
#### Snippet
```java
      Method method =
          Resolve.class.getDeclaredMethod(
              "findIdent", DiagnosticPosition.class, Env.class, Name.class, KindSelector.class);
      method.setAccessible(true);
      return (Symbol)
```

### RuleId[ruleID=JavaReflectionMemberAccess]
Cannot resolve method 'isDirectlyOrIndirectlyLocal'
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
    }
    try {
      return Symbol.class.getMethod("isDirectlyOrIndirectlyLocal");
    } catch (NoSuchMethodException e) {
      throw new LinkageError(e.getMessage(), e);
```

### RuleId[ruleID=JavaReflectionMemberAccess]
Cannot resolve method 'getCaseKind'
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
    try {
      if (RuntimeVersion.isAtLeast12()) {
        Enum<?> caseKind = (Enum) CaseTree.class.getMethod("getCaseKind").invoke(node);
        checkState(
            caseKind.name().contentEquals("STATEMENT"),
```

### RuleId[ruleID=JavaReflectionMemberAccess]
Cannot resolve method 'Case' with specified argument types
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
            TreeMaker.class
                .getMethod(
                    "Case",
                    Class.forName("com.sun.source.tree.CaseTree.CaseKind"),
                    List.class,
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'constantExpressions' in a Serializable class
in `core/src/main/java/com/google/errorprone/bugpatterns/WrongOneof.java`
#### Snippet
```java
      isDescendantOf("com.google.protobuf.AbstractMessageLite.InternalOneOfEnum");

  private final ConstantExpressions constantExpressions;

  public WrongOneof(ErrorProneFlags flags) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'constantExpressions' in a Serializable class
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
  }

  private final ConstantExpressions constantExpressions;

  public AlwaysThrows(ErrorProneFlags flags) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'constantExpressions' in a Serializable class
in `core/src/main/java/com/google/errorprone/bugpatterns/UnsynchronizedOverridesSynchronized.java`
#### Snippet
```java
public class UnsynchronizedOverridesSynchronized extends BugChecker implements MethodTreeMatcher {

  private final ConstantExpressions constantExpressions;

  public UnsynchronizedOverridesSynchronized() {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'constantExpressions' in a Serializable class
in `core/src/main/java/com/google/errorprone/bugpatterns/OptionalNotPresent.java`
#### Snippet
```java
          instanceMethod().onDescendantOf("java.util.Optional").namedAnyOf("get", "orElseThrow"));

  private final ConstantExpressions constantExpressions;

  public OptionalNotPresent(ErrorProneFlags flags) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'constantExpressions' in a Serializable class
in `core/src/main/java/com/google/errorprone/bugpatterns/AlreadyChecked.java`
#### Snippet
```java
public final class AlreadyChecked extends BugChecker implements CompilationUnitTreeMatcher {

  private final ConstantExpressions constantExpressions;

  public AlreadyChecked(ErrorProneFlags flags) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'wellKnownMutability' in a Serializable class
in `core/src/main/java/com/google/errorprone/bugpatterns/FieldCanBeStatic.java`
#### Snippet
```java
                  .collect(toImmutableSet()));

  private final WellKnownMutability wellKnownMutability;
  private final ConstantExpressions constantExpressions;

```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'constantExpressions' in a Serializable class
in `core/src/main/java/com/google/errorprone/bugpatterns/FieldCanBeStatic.java`
#### Snippet
```java

  private final WellKnownMutability wellKnownMutability;
  private final ConstantExpressions constantExpressions;

  public FieldCanBeStatic(ErrorProneFlags flags) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'typeCompatibilityUtils' in a Serializable class
in `core/src/main/java/com/google/errorprone/bugpatterns/EqualsIncompatibleType.java`
#### Snippet
```java
              staticMethod().anyClass().named("assertFalse")));

  private final TypeCompatibilityUtils typeCompatibilityUtils;

  public EqualsIncompatibleType(ErrorProneFlags flags) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'evaluator' in a Serializable class
in `core/src/main/java/com/google/errorprone/bugpatterns/CheckReturnValue.java`
#### Snippet
```java

  private final MessageTrailerStyle messageTrailerStyle;
  private final ResultUsePolicyEvaluator evaluator;

  public CheckReturnValue(ErrorProneFlags flags) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'constantExpressions' in a Serializable class
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractReturnValueIgnored.java`
#### Snippet
```java
                  specializedMatcher()));

  private final ConstantExpressions constantExpressions;

  protected AbstractReturnValueIgnored() {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'alsoForbidApisAnnotated' in a Serializable class
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/ApiDiffChecker.java`
#### Snippet
```java

  private final ApiDiff apiDiff;
  private final Optional<Class<? extends Annotation>> alsoForbidApisAnnotated;

  protected ApiDiffChecker(ApiDiff apiDiff) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'wellKnownMutability' in a Serializable class
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableAnnotationChecker.java`
#### Snippet
```java
      ImmutableSet.of("com.google.auto.value.processor.AutoAnnotationProcessor");

  private final WellKnownMutability wellKnownMutability;

  public ImmutableAnnotationChecker(ErrorProneFlags flags) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'wellKnownMutability' in a Serializable class
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableEnumChecker.java`
#### Snippet
```java
          + " @com.google.errorprone.annotations.Immutable is unnecessary";

  private final WellKnownMutability wellKnownMutability;

  public ImmutableEnumChecker(ErrorProneFlags flags) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'typeCompatibilityUtils' in a Serializable class
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/CollectionIncompatibleType.java`
#### Snippet
```java

  private final FixType fixType;
  private final TypeCompatibilityUtils typeCompatibilityUtils;

  public CollectionIncompatibleType(ErrorProneFlags flags) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'typeCompatibilityUtils' in a Serializable class
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/IncompatibleArgumentType.java`
#### Snippet
```java
public class IncompatibleArgumentType extends BugChecker implements MethodInvocationTreeMatcher {

  private final TypeCompatibilityUtils typeCompatibilityUtils;

  public IncompatibleArgumentType(ErrorProneFlags flags) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'wellKnownMutability' in a Serializable class
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableChecker.java`
#### Snippet
```java
        MemberReferenceTreeMatcher {

  private final WellKnownMutability wellKnownMutability;
  private final ImmutableSet<String> immutableAnnotations;

```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'typeCompatibilityUtils' in a Serializable class
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TruthIncompatibleType.java`
#### Snippet
```java
      typeFromString("com.google.common.truth.Correspondence");

  private final TypeCompatibilityUtils typeCompatibilityUtils;

  public TruthIncompatibleType(ErrorProneFlags flags) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'provenance' in a Serializable class
in `check_api/src/main/java/com/google/errorprone/VisitorState.java`
#### Snippet
```java

    private SoftReference<T> cache = new SoftReference<>(null);
    private JavacInvocationInstance provenance;

    private Cache(Supplier<T> impl) {
```

### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'cache' in a Serializable class
in `check_api/src/main/java/com/google/errorprone/VisitorState.java`
#### Snippet
```java
    computation which can return null, wrap it in an Optional at the call site.*/

    private SoftReference<T> cache = new SoftReference<>(null);
    private JavacInvocationInstance provenance;

```

## RuleId[ruleID=MismatchedJavadocCode]
### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return 'true' but there's no such enum constant in SuppressedState
in `check_api/src/main/java/com/google/errorprone/SuppressionInfo.java`
#### Snippet
```java

  /**
   * Returns true if this checker should be considered suppressed given the signals present in this
   * object.
   *
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return 'true' but its return type is not boolean
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
  /**
   * Matches a binary tree if the given matchers match the operands in either order. That is,
   * returns true if either: matcher1 matches the left operand and matcher2 matches the right
   * operand or matcher2 matches the left operand and matcher1 matches the right operand
   */
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return 'true' but its return type is not boolean
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
   * Matches an AST node that represents a method declaration, based on the list of
   * variableMatchers. Applies the variableMatcher at index n to the parameter at index n and
   * returns true iff they all match. Returns false if the number of variableMatchers provided does
   * not match the number of parameters.
   *
```

### RuleId[ruleID=MismatchedJavadocCode]
Method is specified to return 'true' but its return type is not boolean
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
   * Matches an AST node that represents a method declaration, based on the list of
   * variableMatchers. Applies the variableMatcher at index n to the parameter at index n and
   * returns true iff they all match. Returns false if the number of variableMatchers provided does
   * not match the number of parameters.
   *
```

## RuleId[ruleID=AssignmentToForLoopParameter]
### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `pos`
in `core/src/main/java/com/google/errorprone/bugpatterns/MisusedDateFormat.java`
#### Snippet
```java
      if (c == '\'') {
        consumer.consumeSpecial('\'');
        pos++;
        for (; pos < format.length(); ++pos) {
          consumer.consumeLiteral(format.charAt(pos));
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `pos`
in `core/src/main/java/com/google/errorprone/bugpatterns/MisusedDateFormat.java`
#### Snippet
```java
        consumer.consumeSpecial('\'');
        pos++;
        for (; pos < format.length(); ++pos) {
          consumer.consumeLiteral(format.charAt(pos));
          if (format.charAt(pos) == '\'') {
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `pos`
in `core/src/main/java/com/google/errorprone/bugpatterns/MisusedDateFormat.java`
#### Snippet
```java
            if (pos + 1 < format.length() && format.charAt(pos + 1) == '\'') {
              consumer.consumeSpecial('\'');
              pos++; // Increment another to skip the escaped '
            } else {
              break;
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `check_api/src/main/java/com/google/errorprone/util/Regexes.java`
#### Snippet
```java
        /* There should be a character following the backslash. No need to check for string length
         * since we have already ascertained we have a well formed regex */
        char escaped = s.charAt(++i);

        if (escaped == 'Q') {
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `check_api/src/main/java/com/google/errorprone/VisitorState.java`
#### Snippet
```java
        char c = escaped.charAt(i);
        if (c == '\\' && i + 1 < escaped.length()) {
          char next = escaped.charAt(++i);
          if (next != '\'') {
            sb.append(c);
```

## RuleId[ruleID=SetReplaceableByEnumSet]
### RuleId[ruleID=SetReplaceableByEnumSet]
`HashSet<>` can be replaced with 'EnumSet'
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/UseBinds.java`
#### Snippet
```java
    }

    Set<Modifier> methodFlags = new HashSet<>(modifiers.getFlags());
    methodFlags.remove(Modifier.STATIC);
    methodFlags.remove(Modifier.FINAL);
```

### RuleId[ruleID=SetReplaceableByEnumSet]
`HashSet<>` can be replaced with 'EnumSet'
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
      Matcher<ExpressionTree> leftOperandMatcher,
      Matcher<ExpressionTree> rightOperandMatcher) {
    Set<Kind> operators = new HashSet<>(1);
    operators.add(operator);
    return new CompoundAssignment(operators, leftOperandMatcher, rightOperandMatcher);
```

### RuleId[ruleID=SetReplaceableByEnumSet]
`TreeSet<>` can be replaced with 'EnumSet'
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
      return Optional.empty();
    }
    return addModifiers(tree, originalModifiers, state, new TreeSet<>(Arrays.asList(modifiers)));
  }

```

## RuleId[ruleID=InnerClassMayBeStatic]
### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `AnonymousClassUsingStateMatcher` may be 'static'
in `core/src/main/java/com/google/errorprone/bugpatterns/CollectorShouldNotUseState.java`
#### Snippet
```java
     Matches an anonymous inner class that contains one or more members that are not final
  */
  private class AnonymousClassUsingStateMatcher implements Matcher<Tree> {

    @Override
```

## RuleId[ruleID=UnusedLabel]
### RuleId[ruleID=UnusedLabel]
Unused label `OUTER`
in `core/src/main/java/com/google/errorprone/bugpatterns/ClassNewInstance.java`
#### Snippet
```java
  private static boolean fixExceptions(VisitorState state, SuggestedFix.Builder fix) {
    TryTree tryTree = null;
    OUTER:
    for (TreePath path = state.getPath(); path != null; path = path.getParentPath()) {
      if (path.getLeaf() instanceof CatchTree) {
```

## RuleId[ruleID=RedundantSuppression]
### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java

  @SuppressWarnings("ConstantConditions") // IntelliJ worries unboxing our Boolean may throw NPE.
  private static boolean isInherited(VisitorState state, Name annotationName) {

    return inheritedAnnotationCache
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
  @Deprecated
  @SuppressWarnings("deprecation")
  public static <T extends Annotation> T getAnnotation(Symbol sym, Class<T> annotationClass) {
    return sym == null ? null : sym.getAnnotation(annotationClass);
  }
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `core/src/main/java/com/google/errorprone/bugpatterns/DepAnn.java`
#### Snippet
```java
   */
  @SuppressWarnings("javadoc")
  private Description checkDeprecatedAnnotation(Tree tree, VisitorState state) {
    Symbol symbol = ASTHelpers.getSymbol(tree);

```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `core/src/main/java/com/google/errorprone/refaster/RefasterRule.java`
#### Snippet
```java
          qualifiedTemplateClass);
    }
    @SuppressWarnings({"unchecked", "rawtypes"})
    RefasterRule<?, ?> result =
        new AutoValue_RefasterRule(
            qualifiedTemplateClass,
            ImmutableList.copyOf(typeVariables),
            ImmutableList.copyOf(beforeTemplates),
            ImmutableList.copyOf(afterTemplates),
            annotations);
    return result;
  }
```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'optional'
in `core/src/main/java/com/google/errorprone/refaster/Choice.java`
#### Snippet
```java
   * Returns a choice of the optional value, if it is present, or the empty choice if it is absent.
   */
  public static <T> Choice<T> fromOptional(Optional<T> optional) {
    return optional.isPresent() ? of(optional.get()) : Choice.<T>none();
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'failureMessage'
in `core/src/main/java/com/google/errorprone/bugpatterns/AssertThrowsUtils.java`
#### Snippet
```java
      TryTree tryTree,
      List<? extends StatementTree> throwingStatements,
      Optional<Tree> failureMessage,
      VisitorState state) {
    List<? extends CatchTree> catchTrees = tryTree.getCatches();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'a'
in `core/src/main/java/com/google/errorprone/bugpatterns/MixedDescriptors.java`
#### Snippet
```java
  }

  private static boolean typesDiffer(Optional<TypeSymbol> a, Optional<TypeSymbol> b) {
    return a.isPresent() && b.isPresent() && !a.get().equals(b.get());
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'b'
in `core/src/main/java/com/google/errorprone/bugpatterns/MixedDescriptors.java`
#### Snippet
```java
  }

  private static boolean typesDiffer(Optional<TypeSymbol> a, Optional<TypeSymbol> b) {
    return a.isPresent() && b.isPresent() && !a.get().equals(b.get());
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'fix'
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractToString.java`
#### Snippet
```java
  }

  private Description maybeFix(Tree tree, VisitorState state, Type matchedType, Optional<Fix> fix) {
    Description.Builder description = buildDescription(tree);
    fix.ifPresent(description::addFix);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for field 'alsoForbidApisAnnotated'
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/ApiDiffChecker.java`
#### Snippet
```java

  private final ApiDiff apiDiff;
  private final Optional<Class<? extends Annotation>> alsoForbidApisAnnotated;

  protected ApiDiffChecker(ApiDiff apiDiff) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'fix'
in `core/src/main/java/com/google/errorprone/bugpatterns/flogger/FloggerRedundantIsEnabled.java`
#### Snippet
```java
    private final ExpressionTree logInvocation;
    private final VisitorState state;
    public Optional<SuggestedFix> fix;

    public LoggerIsEnabledBinaryIfConditionScanner(
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'sym'
in `core/src/main/java/com/google/errorprone/bugpatterns/flogger/FloggerRequiredModifiers.java`
#### Snippet
```java
  private static final class LocalLogger {

    LocalLogger(Provenance provenance, Optional<Symbol> sym, String name) {
      this.provenance = provenance;
      this.sym = sym;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'sym'
in `core/src/main/java/com/google/errorprone/bugpatterns/flogger/FloggerRequiredModifiers.java`
#### Snippet
```java

    final Provenance provenance;
    final Optional<Symbol> sym;
    final String name;
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'receiver'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ConstantExpressions.java`
#### Snippet
```java
        Symbol symbol,
        Iterable<ConstantExpression> arguments,
        Optional<ConstantExpression> receiver) {
      return new AutoValue_ConstantExpressions_PureMethodInvocation(
          symbol, ImmutableList.copyOf(arguments), receiver);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'methodDefault'
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/Rules.java`
#### Snippet
```java
   */
  public static ResultUseRule globalDefault(
      Optional<ResultUsePolicy> methodDefault, Optional<ResultUsePolicy> constructorDefault) {
    return new SimpleGlobalRule("GLOBAL_DEFAULT", methodDefault, constructorDefault);
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'constructorDefault'
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/Rules.java`
#### Snippet
```java
   */
  public static ResultUseRule globalDefault(
      Optional<ResultUsePolicy> methodDefault, Optional<ResultUsePolicy> constructorDefault) {
    return new SimpleGlobalRule("GLOBAL_DEFAULT", methodDefault, constructorDefault);
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'methodDefault'
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/Rules.java`
#### Snippet
```java
  private static final class SimpleGlobalRule extends GlobalRule {
    private final String id;
    private final Optional<ResultUsePolicy> methodDefault;
    private final Optional<ResultUsePolicy> constructorDefault;

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'methodDefault'
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/Rules.java`
#### Snippet
```java
    private SimpleGlobalRule(
        String id,
        Optional<ResultUsePolicy> methodDefault,
        Optional<ResultUsePolicy> constructorDefault) {
      this.id = checkNotNull(id);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'constructorDefault'
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/Rules.java`
#### Snippet
```java
        String id,
        Optional<ResultUsePolicy> methodDefault,
        Optional<ResultUsePolicy> constructorDefault) {
      this.id = checkNotNull(id);
      this.methodDefault = methodDefault;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'constructorDefault'
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/Rules.java`
#### Snippet
```java
    private final String id;
    private final Optional<ResultUsePolicy> methodDefault;
    private final Optional<ResultUsePolicy> constructorDefault;

    private SimpleGlobalRule(
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'suggestedFix'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableAnalysis.java`
#### Snippet
```java

    @CheckReturnValue
    default Description report(Tree tree, Violation info, Optional<SuggestedFix> suggestedFix) {
      Description.Builder description = describe(tree, info);
      suggestedFix.ifPresent(description::addFix);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'tree'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableAnalysis.java`
#### Snippet
```java
   */
  public Violation checkForImmutability(
      Optional<ClassTree> tree,
      ImmutableSet<String> immutableTyParams,
      ClassType type,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'tree'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableAnalysis.java`
#### Snippet
```java
   */
  Violation areFieldsImmutable(
      Optional<ClassTree> tree,
      ImmutableSet<String> immutableTyParams,
      ClassType classType,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'tree'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableAnalysis.java`
#### Snippet
```java
  /** Check a single field for immutability. */
  Violation isFieldImmutable(
      Optional<Tree> tree,
      ImmutableSet<String> immutableTyParams,
      ClassSymbol classSym,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'tree'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafety.java`
#### Snippet
```java
  /** Returns an enclosing instance for the specified type if it is thread-safe. */
  @Nullable
  public Type mutableEnclosingInstance(Optional<ClassTree> tree, ClassType type) {
    if (tree.isPresent()
        && !CanBeStaticAnalyzer.referencesOuter(
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'fix'
in `check_api/src/main/java/com/google/errorprone/matchers/Description.java`
#### Snippet
```java
    @CanIgnoreReturnValue
    @Deprecated
    public Builder addFix(Optional<? extends Fix> fix) {
      checkNotNull(fix, "fix must not be null");
      fix.ifPresent(this::addFix);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'expectedResult'
in `test_helpers/src/main/java/com/google/errorprone/CompilationTestHelper.java`
#### Snippet
```java
  @Nullable private ImmutableList<Class<?>> overrideClasspath;
  private boolean expectNoDiagnostics = false;
  private Optional<Result> expectedResult = Optional.empty();
  private LookForCheckNameInDiagnostic lookForCheckNameInDiagnostic =
      LookForCheckNameInDiagnostic.YES;
```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `docgen/src/main/java/com/google/errorprone/DocGenTool.java`
#### Snippet
```java

  private static void usage(String err) {
    System.err.println(err);
    System.exit(1);
  }
```

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
### RuleId[ruleID=ConditionCoveredByFurtherCondition]
Condition 'classSymbol.owner != null' covered by subsequent condition 'classSymbol.owner instanceof Symbol.ClassSymbol'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedBySymbolResolver.java`
#### Snippet
```java
      }
    }
    if (classSymbol.owner != null
        && classSymbol != classSymbol.owner
        && classSymbol.owner instanceof Symbol.ClassSymbol) {
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueBuilderDefaultsInConstructor.java`
#### Snippet
```java
                  && calledSymbol.getModifiers().contains(Modifier.ABSTRACT);
            })
        .map(t -> state.getSourceForNode(t).replaceFirst("^this\\.", ""))
        .collect(toImmutableList());
  }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/NarrowCalculation.java`
#### Snippet
```java

  private static String forceLiteralType(ExpressionTree tree, Type targetType, VisitorState state) {
    return state.getSourceForNode(tree).replaceAll("[LlFfDd]$", "")
        + suffixForType(targetType, state);
  }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/FloatingPointAssertionWithinEpsilon.java`
#### Snippet
```java

    static String removeSuffixes(String source) {
      return source.replaceAll("[fFdDlL]$", "");
    }
  }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/ParameterComment.java`
#### Snippet
```java

  private static boolean matchingParamComment(Comment c, VarSymbol param) {
    return param.getSimpleName().contentEquals(getTextFromComment(c).replaceAll("\\s*=\\s*$", ""));
  }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/InsecureCipherMode.java`
#### Snippet
```java
    String algorithm = (String) argument;

    if (algorithm.matches("DH")) {
      // Most implementations of Diffie-Hellman on prime fields have vulnerabilities. See b/31574444
      // for a more detailed rationale.
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/InsecureCipherMode.java`
#### Snippet
```java
    }

    if (algorithm.matches("DSA")) {
      // Some crypto libraries may accept invalid DSA signatures in specific configurations (see
      // b/30262692 for details).
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/InsecureCipherMode.java`
#### Snippet
```java
    // cipher. The name of this algorithm is "ARCFOUR" in the SunJce and "ARC4" in Conscrypt.
    // Some other providers like JCraft also seem to use the name "RC4".
    if (transformation.matches("ARCFOUR.*")
        || transformation.matches("ARC4.*")
        || transformation.matches("RC4.*")) {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/InsecureCipherMode.java`
#### Snippet
```java
    // Some other providers like JCraft also seem to use the name "RC4".
    if (transformation.matches("ARCFOUR.*")
        || transformation.matches("ARC4.*")
        || transformation.matches("RC4.*")) {
      return Description.NO_MATCH;
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/InsecureCipherMode.java`
#### Snippet
```java
    if (transformation.matches("ARCFOUR.*")
        || transformation.matches("ARC4.*")
        || transformation.matches("RC4.*")) {
      return Description.NO_MATCH;
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/InsecureCipherMode.java`
#### Snippet
```java
    }

    if (!transformation.matches(".*/.*/.*")) {
      // The mode and padding shall be explicitly specified. We don't allow default settings to be
      // used, regardless of the algorithm and provider.
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/InsecureCipherMode.java`
#### Snippet
```java
    }

    if (transformation.matches(".*/ECB/.*")
        && !transformation.matches("RSA/.*")
        && !transformation.matches("AESWrap/.*")) {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/InsecureCipherMode.java`
#### Snippet
```java

    if (transformation.matches(".*/ECB/.*")
        && !transformation.matches("RSA/.*")
        && !transformation.matches("AESWrap/.*")) {
      // Otherwise, ECB mode should be explicitly specified in order to trigger the check. RSA
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/InsecureCipherMode.java`
#### Snippet
```java
    if (transformation.matches(".*/ECB/.*")
        && !transformation.matches("RSA/.*")
        && !transformation.matches("AESWrap/.*")) {
      // Otherwise, ECB mode should be explicitly specified in order to trigger the check. RSA
      // is an exception, as this transformation doesn't actually implement a block cipher
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/InsecureCipherMode.java`
#### Snippet
```java
    }

    if (transformation.matches("ECIES.*") || transformation.matches("DHIES.*")) {
      // Existing implementations of IES-based algorithms use ECB under the hood and must also be
      // flagged as vulnerable. See b/30424901 for a more detailed rationale.
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/InsecureCipherMode.java`
#### Snippet
```java
    }

    if (transformation.matches("ECIES.*") || transformation.matches("DHIES.*")) {
      // Existing implementations of IES-based algorithms use ECB under the hood and must also be
      // flagged as vulnerable. See b/30424901 for a more detailed rationale.
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/ImpossibleNullComparison.java`
#### Snippet
```java
          MethodInvocationTree methodInvocation, boolean negated, VisitorState state) {
        String methodName = ASTHelpers.getSymbol(methodInvocation).getQualifiedName().toString();
        String hasMethod = methodName.replaceFirst("get", "has");

        // proto3 does not generate has methods for scalar types, e.g. ByteString and String.
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/ImpossibleNullComparison.java`
#### Snippet
```java
        return (negated, state) -> {
          String methodName = getMethodName(methodInvocation);
          String hasMethod = methodName.replaceFirst("get", "has");
          String replacement =
              replaceLast(state.getSourceForNode(methodInvocation), methodName, hasMethod);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/BigDecimalLiteralDouble.java`
#### Snippet
```java

    // Strip off 'd', 'f' suffixes and _ separators from the source.
    String literalString = state.getSourceForNode(arg).replaceAll("[_dDfF]", "");

    // We assume that the expected value of `new BigDecimal(double)` is precisely the BigDecimal
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/MemoizeConstantVisitorStateLookups.java`
#### Snippet
```java
    TypeSymbol returnType = sym.getReturnType().tsym;
    String returnTypeName = returnType.getSimpleName().toString();
    String newConstantPrefix = Ascii.toUpperCase(argument).replaceAll("\\W", "_");
    String newConstantName =
        namingStrategy.apply(newConstantPrefix, Ascii.toUpperCase(returnTypeName));
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractJUnit4InitMethodNotRun.java`
#### Snippet
```java
      CharSequence modifiersSource = state.getSourceForNode(modifiers);
      suggestedFix.replace(
          modifiers, modifiersSource.toString().replaceFirst("protected", "public"));
    }
  }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/WaitNotInLoop.java`
#### Snippet
```java
          return description.build();
        }
        String replacement = ifSource.toString().replaceFirst("if", "while");
        return description.addFix(SuggestedFix.replace(enclosingIf, replacement)).build();
      }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UrlInSee.java`
#### Snippet
```java
                diagnosticPosition(getCurrentPath(), state),
                replace(
                    erroneousTree, erroneousTree.getBody().replaceFirst("@see", "See"), state)));
      }
      return super.visitErroneous(erroneousTree, unused);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/InvalidLink.java`
#### Snippet
```java
        }
        String target = match.group(1);
        String reference = erroneousTree.getBody().replaceFirst("\\{@link ", "");
        String fixedLink = fixLink(reference, target);
        DCDocComment docComment = getDocComment(state, tree);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/MissingSummary.java`
#### Snippet
```java
      DocTreePath docTreePath, ReturnTree returnTree, VisitorState state) {
    int pos = ((DCDocComment) docTreePath.getDocComment()).comment.getSourcePos(0);
    String description = returnTree.toString().replaceAll("^@return ", "");
    if (description.isEmpty()) {
      return NO_MATCH;
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/Inliner.java`
#### Snippet
```java

    if (Strings.isNullOrEmpty(receiverString)) {
      replacement = replacement.replaceAll("\\bthis\\.\\b", "");
    } else {
      if (replacement.equals("this")) { // e.g.: foo.b() -> foo
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/Inliner.java`
#### Snippet
```java
        }
      }
      replacement = replacement.replaceAll("\\bthis\\b", receiverString);
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullnessUtils.java`
#### Snippet
```java
      return new AutoValue_NullnessUtils_NullableAnnotationToUse(
          qualifiedName,
          qualifiedName.replaceFirst(".*[.]", ""),
          isTypeUse,
          /*isAlreadyInScope=*/ false);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/NamedParameterComment.java`
#### Snippet
```java
        String commentText = Comments.getTextFromComment(comment);
        boolean textMatches =
            Arrays.asList(commentText.split("[^a-zA-Z0-9_]+", -1)).contains(formal);
        boolean tooLong = commentText.length() > formal.length() + 5 && commentText.length() > 50;
        boolean tooMuchMarkup = CharMatcher.anyOf("-*!@<>").countIn(commentText) > 5;
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/InvocationInfo.java`
#### Snippet
```java
    just abort */
    if (!formalParameters.isEmpty()
        && formalParameters.get(0).getSimpleName().toString().matches("this\\$[0-9]+")) {
      return ImmutableList.of();
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `check_api/src/main/java/com/google/errorprone/util/Comments.java`
#### Snippet
```java
    switch (comment.getStyle()) {
      case BLOCK:
        return comment.getText().replaceAll("^\\s*/\\*\\s*(.*?)\\s*\\*/\\s*", "$1");
      case LINE:
        return comment.getText().replaceAll("^\\s*//\\s*", "");
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `check_api/src/main/java/com/google/errorprone/util/Comments.java`
#### Snippet
```java
        return comment.getText().replaceAll("^\\s*/\\*\\s*(.*?)\\s*\\*/\\s*", "$1");
      case LINE:
        return comment.getText().replaceAll("^\\s*//\\s*", "");
      case JAVADOC:
        return comment.getText().replaceAll("^\\s*/\\*\\*\\s*(.*?)\\s*\\*/\\s*", "$1");
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `check_api/src/main/java/com/google/errorprone/util/Comments.java`
#### Snippet
```java
        return comment.getText().replaceAll("^\\s*//\\s*", "");
      case JAVADOC:
        return comment.getText().replaceAll("^\\s*/\\*\\*\\s*(.*?)\\s*\\*/\\s*", "$1");
    }
    throw new AssertionError(comment.getStyle());
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `check_api/src/main/java/com/google/errorprone/names/LevenshteinEditDistance.java`
#### Snippet
```java
   */
  private static boolean isEmptyOrWhitespace(String source) {
    return source == null || source.matches("\\s*");
  }
}
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
              annotation
                  .toString()
                  .replaceFirst("\\(\\)", "(" + parameterPrefix + newArgument(newValues) + ")"));
    }
    Optional<ExpressionTree> maybeExistingArgument = findArgument(annotation, parameterName);
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.tools` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/ErrorProneJavaCompiler.java`
#### Snippet
```java

/**
 * An Error Prone compiler that implements {@link javax.tools.JavaCompiler}.
 *
 * <p>Runs all built-in checks by default.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.sun.tools.javac.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/refaster/UForLoop.java`
#### Snippet
```java
            UBlock.inlineStatementList(getInitializer(), inliner),
            (getCondition() == null) ? null : getCondition().inline(inliner),
            com.sun.tools.javac.util.List.convert(
                JCExpressionStatement.class, inliner.<JCStatement>inlineList(getUpdate())),
            getStatement().inline(inliner));
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.sun.tools.javac.util` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/refaster/Inliner.java`
#### Snippet
```java
  }

  public <R> com.sun.tools.javac.util.List<R> inlineList(
      Iterable<? extends Inlineable<? extends R>> elements) throws CouldNotResolveImportException {
    ListBuffer<R> result = new ListBuffer<>();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
  private static final ImmutableMap<String, Consumer<CharSequence>> VALIDATORS =
      ImmutableMap.<String, Consumer<CharSequence>>builder()
          .put("java.time.Duration", java.time.Duration::parse)
          .put("java.time.Instant", java.time.Instant::parse)
          .put("java.time.LocalDate", java.time.LocalDate::parse)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
      ImmutableMap.<String, Consumer<CharSequence>>builder()
          .put("java.time.Duration", java.time.Duration::parse)
          .put("java.time.Instant", java.time.Instant::parse)
          .put("java.time.LocalDate", java.time.LocalDate::parse)
          .put("java.time.LocalDateTime", java.time.LocalDateTime::parse)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
          .put("java.time.Duration", java.time.Duration::parse)
          .put("java.time.Instant", java.time.Instant::parse)
          .put("java.time.LocalDate", java.time.LocalDate::parse)
          .put("java.time.LocalDateTime", java.time.LocalDateTime::parse)
          .put("java.time.LocalTime", java.time.LocalTime::parse)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
          .put("java.time.Instant", java.time.Instant::parse)
          .put("java.time.LocalDate", java.time.LocalDate::parse)
          .put("java.time.LocalDateTime", java.time.LocalDateTime::parse)
          .put("java.time.LocalTime", java.time.LocalTime::parse)
          .put("java.time.MonthDay", java.time.MonthDay::parse)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
          .put("java.time.LocalDate", java.time.LocalDate::parse)
          .put("java.time.LocalDateTime", java.time.LocalDateTime::parse)
          .put("java.time.LocalTime", java.time.LocalTime::parse)
          .put("java.time.MonthDay", java.time.MonthDay::parse)
          .put("java.time.OffsetDateTime", java.time.OffsetDateTime::parse)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
          .put("java.time.LocalDateTime", java.time.LocalDateTime::parse)
          .put("java.time.LocalTime", java.time.LocalTime::parse)
          .put("java.time.MonthDay", java.time.MonthDay::parse)
          .put("java.time.OffsetDateTime", java.time.OffsetDateTime::parse)
          .put("java.time.OffsetTime", java.time.OffsetTime::parse)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
          .put("java.time.LocalTime", java.time.LocalTime::parse)
          .put("java.time.MonthDay", java.time.MonthDay::parse)
          .put("java.time.OffsetDateTime", java.time.OffsetDateTime::parse)
          .put("java.time.OffsetTime", java.time.OffsetTime::parse)
          .put("java.time.Period", java.time.Period::parse)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
          .put("java.time.MonthDay", java.time.MonthDay::parse)
          .put("java.time.OffsetDateTime", java.time.OffsetDateTime::parse)
          .put("java.time.OffsetTime", java.time.OffsetTime::parse)
          .put("java.time.Period", java.time.Period::parse)
          .put("java.time.Year", java.time.Year::parse)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
          .put("java.time.OffsetDateTime", java.time.OffsetDateTime::parse)
          .put("java.time.OffsetTime", java.time.OffsetTime::parse)
          .put("java.time.Period", java.time.Period::parse)
          .put("java.time.Year", java.time.Year::parse)
          .put("java.time.YearMonth", java.time.YearMonth::parse)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
          .put("java.time.OffsetTime", java.time.OffsetTime::parse)
          .put("java.time.Period", java.time.Period::parse)
          .put("java.time.Year", java.time.Year::parse)
          .put("java.time.YearMonth", java.time.YearMonth::parse)
          .put("java.time.ZonedDateTime", java.time.ZonedDateTime::parse)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
          .put("java.time.Period", java.time.Period::parse)
          .put("java.time.Year", java.time.Year::parse)
          .put("java.time.YearMonth", java.time.YearMonth::parse)
          .put("java.time.ZonedDateTime", java.time.ZonedDateTime::parse)
          .buildOrThrow();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.time` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
          .put("java.time.Year", java.time.Year::parse)
          .put("java.time.YearMonth", java.time.YearMonth::parse)
          .put("java.time.ZonedDateTime", java.time.ZonedDateTime::parse)
          .buildOrThrow();

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/OptionalEquality.java`
#### Snippet
```java

  private static final ImmutableSet<String> OPTIONAL_CLASSES =
      ImmutableSet.of(com.google.common.base.Optional.class.getName(), "java.util.Optional");

  @Override
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
      ImmutableMap.<String, String>builder()
          .put(
              com.google.common.collect.BiMap.class.getName(),
              com.google.common.collect.ImmutableBiMap.class.getName())
          .put(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
          .put(
              com.google.common.collect.BiMap.class.getName(),
              com.google.common.collect.ImmutableBiMap.class.getName())
          .put(
              com.google.common.collect.ListMultimap.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              com.google.common.collect.ImmutableBiMap.class.getName())
          .put(
              com.google.common.collect.ListMultimap.class.getName(),
              com.google.common.collect.ImmutableListMultimap.class.getName())
          .put(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
          .put(
              com.google.common.collect.ListMultimap.class.getName(),
              com.google.common.collect.ImmutableListMultimap.class.getName())
          .put(
              com.google.common.collect.Multimap.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              com.google.common.collect.ImmutableListMultimap.class.getName())
          .put(
              com.google.common.collect.Multimap.class.getName(),
              com.google.common.collect.ImmutableMultimap.class.getName())
          .put(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
          .put(
              com.google.common.collect.Multimap.class.getName(),
              com.google.common.collect.ImmutableMultimap.class.getName())
          .put(
              com.google.common.collect.Multiset.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              com.google.common.collect.ImmutableMultimap.class.getName())
          .put(
              com.google.common.collect.Multiset.class.getName(),
              com.google.common.collect.ImmutableMultiset.class.getName())
          .put(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
          .put(
              com.google.common.collect.Multiset.class.getName(),
              com.google.common.collect.ImmutableMultiset.class.getName())
          .put(
              com.google.common.collect.RangeMap.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              com.google.common.collect.ImmutableMultiset.class.getName())
          .put(
              com.google.common.collect.RangeMap.class.getName(),
              com.google.common.collect.ImmutableRangeMap.class.getName())
          .put(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
          .put(
              com.google.common.collect.RangeMap.class.getName(),
              com.google.common.collect.ImmutableRangeMap.class.getName())
          .put(
              com.google.common.collect.RangeSet.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              com.google.common.collect.ImmutableRangeMap.class.getName())
          .put(
              com.google.common.collect.RangeSet.class.getName(),
              com.google.common.collect.ImmutableRangeSet.class.getName())
          .put(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
          .put(
              com.google.common.collect.RangeSet.class.getName(),
              com.google.common.collect.ImmutableRangeSet.class.getName())
          .put(
              com.google.common.collect.SetMultimap.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              com.google.common.collect.ImmutableRangeSet.class.getName())
          .put(
              com.google.common.collect.SetMultimap.class.getName(),
              com.google.common.collect.ImmutableSetMultimap.class.getName())
          .put(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
          .put(
              com.google.common.collect.SetMultimap.class.getName(),
              com.google.common.collect.ImmutableSetMultimap.class.getName())
          .put(
              com.google.common.collect.SortedMultiset.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              com.google.common.collect.ImmutableSetMultimap.class.getName())
          .put(
              com.google.common.collect.SortedMultiset.class.getName(),
              com.google.common.collect.ImmutableSortedMultiset.class.getName())
          .put(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
          .put(
              com.google.common.collect.SortedMultiset.class.getName(),
              com.google.common.collect.ImmutableSortedMultiset.class.getName())
          .put(
              com.google.common.collect.Table.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              com.google.common.collect.ImmutableSortedMultiset.class.getName())
          .put(
              com.google.common.collect.Table.class.getName(),
              com.google.common.collect.ImmutableTable.class.getName())
          .put(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
          .put(
              com.google.common.collect.Table.class.getName(),
              com.google.common.collect.ImmutableTable.class.getName())
          .put(
              java.util.Collection.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              com.google.common.collect.ImmutableTable.class.getName())
          .put(
              java.util.Collection.class.getName(),
              com.google.common.collect.ImmutableCollection.class.getName())
          .put(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
          .put(
              java.util.Collection.class.getName(),
              com.google.common.collect.ImmutableCollection.class.getName())
          .put(
              java.util.List.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              com.google.common.collect.ImmutableCollection.class.getName())
          .put(
              java.util.List.class.getName(),
              com.google.common.collect.ImmutableList.class.getName())
          .put(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
          .put(
              java.util.List.class.getName(),
              com.google.common.collect.ImmutableList.class.getName())
          .put(
              java.util.Map.class.getName(), com.google.common.collect.ImmutableMap.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              com.google.common.collect.ImmutableList.class.getName())
          .put(
              java.util.Map.class.getName(), com.google.common.collect.ImmutableMap.class.getName())
          .put(
              java.util.NavigableMap.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              com.google.common.collect.ImmutableList.class.getName())
          .put(
              java.util.Map.class.getName(), com.google.common.collect.ImmutableMap.class.getName())
          .put(
              java.util.NavigableMap.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              java.util.Map.class.getName(), com.google.common.collect.ImmutableMap.class.getName())
          .put(
              java.util.NavigableMap.class.getName(),
              com.google.common.collect.ImmutableSortedMap.class.getName())
          .put(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
          .put(
              java.util.NavigableMap.class.getName(),
              com.google.common.collect.ImmutableSortedMap.class.getName())
          .put(
              java.util.NavigableSet.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              com.google.common.collect.ImmutableSortedMap.class.getName())
          .put(
              java.util.NavigableSet.class.getName(),
              com.google.common.collect.ImmutableSortedSet.class.getName())
          .put(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
          .put(
              java.util.NavigableSet.class.getName(),
              com.google.common.collect.ImmutableSortedSet.class.getName())
          .put(
              java.util.Set.class.getName(), com.google.common.collect.ImmutableSet.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              com.google.common.collect.ImmutableSortedSet.class.getName())
          .put(
              java.util.Set.class.getName(), com.google.common.collect.ImmutableSet.class.getName())
          .put(
              java.util.EnumSet.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              com.google.common.collect.ImmutableSortedSet.class.getName())
          .put(
              java.util.Set.class.getName(), com.google.common.collect.ImmutableSet.class.getName())
          .put(
              java.util.EnumSet.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              java.util.Set.class.getName(), com.google.common.collect.ImmutableSet.class.getName())
          .put(
              java.util.EnumSet.class.getName(),
              com.google.common.collect.ImmutableSet.class.getName())
          .put(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
          .put(
              java.util.EnumSet.class.getName(),
              com.google.common.collect.ImmutableSet.class.getName())
          .put(
              java.util.ArrayList.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              com.google.common.collect.ImmutableSet.class.getName())
          .put(
              java.util.ArrayList.class.getName(),
              com.google.common.collect.ImmutableList.class.getName())
          .put(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
          .put(
              java.util.ArrayList.class.getName(),
              com.google.common.collect.ImmutableList.class.getName())
          .put(
              java.util.HashMap.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              com.google.common.collect.ImmutableList.class.getName())
          .put(
              java.util.HashMap.class.getName(),
              com.google.common.collect.ImmutableMap.class.getName())
          .put(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
          .put(
              java.util.HashMap.class.getName(),
              com.google.common.collect.ImmutableMap.class.getName())
          .put(
              java.util.HashSet.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              com.google.common.collect.ImmutableMap.class.getName())
          .put(
              java.util.HashSet.class.getName(),
              com.google.common.collect.ImmutableSet.class.getName())
          .put(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
          .put(
              java.util.HashSet.class.getName(),
              com.google.common.collect.ImmutableSet.class.getName())
          .put(
              java.util.EnumMap.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              com.google.common.collect.ImmutableSet.class.getName())
          .put(
              java.util.EnumMap.class.getName(),
              com.google.common.collect.ImmutableMap.class.getName())
          .buildOrThrow();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
          .put(
              java.util.EnumMap.class.getName(),
              com.google.common.collect.ImmutableMap.class.getName())
          .buildOrThrow();

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/DepAnn.java`
#### Snippet
```java
  /**
   * Reports a dep-ann error for a declaration if: (1) javadoc contains the deprecated javadoc tag
   * (2) the declaration is not annotated with {@link java.lang.Deprecated}
   */
  @SuppressWarnings("javadoc")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/ReturnValueIgnored.java`
#### Snippet
```java

  /**
   * The return values of primitive types (e.g., {@link java.lang.Integer}) should always be checked
   * (except for parsing-type methods and void-returning methods, which won't be checked by
   * AbstractReturnValueIgnored).
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/ReturnValueIgnored.java`
#### Snippet
```java
  /**
   * Parsing-style methods on the primitive wrapper types (e.g., {@link
   * java.lang.Integer#decode(String)}).
   */
  // TODO(kak): Instead of special casing the parsing style methods, we could consider looking for a
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/ReturnValueIgnored.java`
#### Snippet
```java
          instanceMethod().onDescendantOf("java.util.Map.Entry").namedAnyOf("getKey", "getValue"));

  /** APIs to check on the {@link java.lang.Iterable} interface. */
  private static final Matcher<ExpressionTree> ITERABLE_METHODS =
      anyOf(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/ReturnValueIgnored.java`
#### Snippet
```java

  /**
   * The return values of {@link java.lang.String} methods should always be checked (except for
   * void-returning ones, which won't be checked by AbstractReturnValueIgnored).
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.sun.tools.javac.util` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/refaster/BlockTemplate.java`
#### Snippet
```java
    StringWriter writer = new StringWriter();
    try {
      pretty(context, writer).printStats(com.sun.tools.javac.util.List.from(statements));
    } catch (IOException e) {
      throw new AssertionError("StringWriter cannot throw IOExceptions", e);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.sun.tools.javac.code` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/TypeParameterUnusedInFormals.java`
#### Snippet
```java

  /**
   * A visitor that records the set of {@link com.sun.tools.javac.code.Type.TypeVar}s referenced by
   * the current type.
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/time/DurationToLongTimeUnit.java`
#### Snippet
```java

  /**
   * Given that this ExpressionTree's type is a {@link java.util.concurrent.TimeUnit}, return the
   * TimeUnit it likely represents.
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.concurrent` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableRefactoring.java`
#### Snippet
```java
        new ImmutableChecker(
            ImmutableSet.of(
                javax.annotation.concurrent.Immutable.class.getName(),
                com.google.errorprone.annotations.Immutable.class.getName()));
    Optional<? extends ImportTree> immutableImport =
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableRefactoring.java`
#### Snippet
```java
            ImmutableSet.of(
                javax.annotation.concurrent.Immutable.class.getName(),
                com.google.errorprone.annotations.Immutable.class.getName()));
    Optional<? extends ImportTree> immutableImport =
        tree.getImports().stream()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.concurrent` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableRefactoring.java`
#### Snippet
```java
                  return s != null
                      && s.getQualifiedName()
                          .contentEquals(javax.annotation.concurrent.Immutable.class.getName());
                })
            .findFirst();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation.concurrent` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableRefactoring.java`
#### Snippet
```java
        immutableImport.get(),
        SuggestedFix.builder()
            .removeImport(javax.annotation.concurrent.Immutable.class.getName())
            .addImport(com.google.errorprone.annotations.Immutable.class.getName())
            .build());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.errorprone.annotations` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableRefactoring.java`
#### Snippet
```java
        SuggestedFix.builder()
            .removeImport(javax.annotation.concurrent.Immutable.class.getName())
            .addImport(com.google.errorprone.annotations.Immutable.class.getName())
            .build());
  }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.errorprone.annotations` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/AnnotationInfo.java`
#### Snippet
```java
/**
 * Specifies information about a type which may be a container specified by generic type arguments,
 * e.g. {@link com.google.errorprone.annotations.Immutable}.
 *
 * <p>Useful for providing information for immutable classes we can't easily annotate, e.g. those in
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.auto.value` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullnessUtils.java`
#### Snippet
```java
   * same value in some cases.
   */
  @com.google.auto.value.AutoValue // fully qualified to work around JDK-7177813(?) in JDK8 build
  abstract static class NullCheck {
    /**
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/DoubleCheckedLocking.java`
#### Snippet
```java
  private static final ImmutableSet<String> IMMUTABLE_PRIMITIVES =
      ImmutableSet.of(
          java.lang.Boolean.class.getName(),
          java.lang.Byte.class.getName(),
          java.lang.Short.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/DoubleCheckedLocking.java`
#### Snippet
```java
      ImmutableSet.of(
          java.lang.Boolean.class.getName(),
          java.lang.Byte.class.getName(),
          java.lang.Short.class.getName(),
          java.lang.Integer.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/DoubleCheckedLocking.java`
#### Snippet
```java
          java.lang.Boolean.class.getName(),
          java.lang.Byte.class.getName(),
          java.lang.Short.class.getName(),
          java.lang.Integer.class.getName(),
          java.lang.Character.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/DoubleCheckedLocking.java`
#### Snippet
```java
          java.lang.Byte.class.getName(),
          java.lang.Short.class.getName(),
          java.lang.Integer.class.getName(),
          java.lang.Character.class.getName(),
          java.lang.Float.class.getName(),
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/DoubleCheckedLocking.java`
#### Snippet
```java
          java.lang.Short.class.getName(),
          java.lang.Integer.class.getName(),
          java.lang.Character.class.getName(),
          java.lang.Float.class.getName(),
          java.lang.String.class.getName());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/DoubleCheckedLocking.java`
#### Snippet
```java
          java.lang.Integer.class.getName(),
          java.lang.Character.class.getName(),
          java.lang.Float.class.getName(),
          java.lang.String.class.getName());

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/DoubleCheckedLocking.java`
#### Snippet
```java
          java.lang.Character.class.getName(),
          java.lang.Float.class.getName(),
          java.lang.String.class.getName());

  /**
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.sun.tools.javac.code` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedByBinder.java`
#### Snippet
```java
  /**
   * A context containing the information necessary to resolve a {@link
   * com.sun.tools.javac.code.Symbol} from an AST node.
   *
   * <p>Guard expressions can be bound from the string value of an {@code @GuardedBy} annotation, or
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.sun.tools.javac.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/AbstractCollectionIncompatibleTypeMatcher.java`
#### Snippet
```java
      return null;
    }
    com.sun.tools.javac.util.List<Type> tyargs = collectionType.getTypeArguments();
    if (tyargs.size() <= typeArgIndex) {
      // Collection is raw, nothing we can do.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.tools` is unnecessary and can be removed
in `check_api/src/main/java/com/google/errorprone/BaseErrorProneJavaCompiler.java`
#### Snippet
```java
import javax.tools.StandardJavaFileManager;

/** An Error Prone compiler that implements {@link javax.tools.JavaCompiler}. */
public class BaseErrorProneJavaCompiler implements JavaCompiler {

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.sun.tools.javac.util` is unnecessary, and can be replaced with an import
in `check_api/src/main/java/com/google/errorprone/util/Signatures.java`
#### Snippet
```java
  private static class SigGen extends SignatureGenerator {

    private final com.sun.tools.javac.util.ByteBuffer buffer =
        new com.sun.tools.javac.util.ByteBuffer();

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.sun.tools.javac.util` is unnecessary, and can be replaced with an import
in `check_api/src/main/java/com/google/errorprone/util/Signatures.java`
#### Snippet
```java

    private final com.sun.tools.javac.util.ByteBuffer buffer =
        new com.sun.tools.javac.util.ByteBuffer();

    protected SigGen(Types types) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.errorprone` is unnecessary and can be removed
in `check_api/src/main/java/com/google/errorprone/VisitorState.java`
#### Snippet
```java
   *
   * <p><b>Note:</b> Do not use this method for a function that depends on the varying state of a
   * {@link com.google.errorprone.VisitorState} (e.g. {@link #getPath()}?including the compilation
   * unit itself!).
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.checkerframework.errorprone.dataflow.analysis` is unnecessary and can be removed
in `check_api/src/main/java/com/google/errorprone/dataflow/DataFlow.java`
#### Snippet
```java

/**
 * Provides a wrapper around {@link org.checkerframework.errorprone.dataflow.analysis.Analysis}.
 *
 * @author konne@google.com (Konstantin Weitz)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.function` is unnecessary and can be removed
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
   * @return The (possibly empty) set of methods in any superclass that match {@code predicate} and
   *     have the given {@code name}. The set's iteration order will be the same as the order
   *     documented in {@link #matchingMethods(Name, java.util.function.Predicate, Type, Types)}.
   */
  public static ImmutableSet<MethodSymbol> findMatchingMethods(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.errorprone.suppliers` is unnecessary, and can be replaced with an import
in `check_api/src/main/java/com/google/errorprone/scanner/ErrorProneScanner.java`
#### Snippet
```java
public class ErrorProneScanner extends Scanner {

  private final com.google.errorprone.suppliers.Supplier<? extends Set<? extends Name>>
      customSuppressionAnnotations;

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.sun.tools.javac.util` is unnecessary, and can be replaced with an import
in `check_api/src/main/java/com/google/errorprone/matchers/JUnitMatchers.java`
#### Snippet
```java
        }
        // Expect one type argument, the type of the JUnit class runner to use.
        com.sun.tools.javac.util.List<Type> typeArgs = type.getTypeArguments();
        if (typeArgs.size() != 1) {
          return false;
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.errorprone.matchers.method` is unnecessary and can be removed
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodInvocationMatcher.java`
#### Snippet
```java
   * satisfying at least one of the given Rule specifications. For an easy way to create such Rules,
   * see the factories in {@link com.google.errorprone.matchers.Matchers} returning subtypes of
   * {@link com.google.errorprone.matchers.method.MethodMatchers.MethodMatcher}.
   */
  public static Matcher<ExpressionTree> compile(Iterable<Rule> rules) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.errorprone.matchers.method` is unnecessary and can be removed
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodInvocationMatcher.java`
#### Snippet
```java
/**
 * The machinery and type definitions necessary to model and compile a single efficient matcher out
 * of a list of {@link com.google.errorprone.matchers.method.MethodMatchers.MethodMatcher}s.
 */
public class MethodInvocationMatcher {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
  }

  static Matcher<Tree> isSymbol(java.lang.Class<? extends Symbol> symbolClass) {
    return new IsSymbol(symbolClass);
  }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
  /**
   * Matches an invocation of a recognized static object equality method such as {@link
   * java.util.Objects#equals}. These are simple facades to {@link Object#equals} that accept null
   * for either argument.
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java

  /** Matches if an AST node is an instance of the given class. */
  public static <T extends Tree> Matcher<T> isInstance(java.lang.Class<?> klass) {
    return (t, state) -> klass.isInstance(t);
  }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add("com.google.common.util.concurrent.AtomicDouble")
        .add("com.google.protobuf.util.FieldMaskUtil.MergeOptions")
        .add(java.util.BitSet.class.getName())
        .add(java.util.Calendar.class.getName())
        .add(java.lang.Iterable.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add("com.google.protobuf.util.FieldMaskUtil.MergeOptions")
        .add(java.util.BitSet.class.getName())
        .add(java.util.Calendar.class.getName())
        .add(java.lang.Iterable.class.getName())
        .add(java.lang.Object.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.util.BitSet.class.getName())
        .add(java.util.Calendar.class.getName())
        .add(java.lang.Iterable.class.getName())
        .add(java.lang.Object.class.getName())
        .add("java.text.DateFormat")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.util.Calendar.class.getName())
        .add(java.lang.Iterable.class.getName())
        .add(java.lang.Object.class.getName())
        .add("java.text.DateFormat")
        .add(java.util.ArrayList.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.lang.Object.class.getName())
        .add("java.text.DateFormat")
        .add(java.util.ArrayList.class.getName())
        .add(java.util.Collection.class.getName())
        .add(java.util.EnumMap.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add("java.text.DateFormat")
        .add(java.util.ArrayList.class.getName())
        .add(java.util.Collection.class.getName())
        .add(java.util.EnumMap.class.getName())
        .add(java.util.EnumSet.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.util.ArrayList.class.getName())
        .add(java.util.Collection.class.getName())
        .add(java.util.EnumMap.class.getName())
        .add(java.util.EnumSet.class.getName())
        .add(java.util.List.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.util.Collection.class.getName())
        .add(java.util.EnumMap.class.getName())
        .add(java.util.EnumSet.class.getName())
        .add(java.util.List.class.getName())
        .add(java.util.logging.Logger.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.util.EnumMap.class.getName())
        .add(java.util.EnumSet.class.getName())
        .add(java.util.List.class.getName())
        .add(java.util.logging.Logger.class.getName())
        .add(java.util.Map.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.logging` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.util.EnumSet.class.getName())
        .add(java.util.List.class.getName())
        .add(java.util.logging.Logger.class.getName())
        .add(java.util.Map.class.getName())
        .add(java.util.HashMap.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.util.List.class.getName())
        .add(java.util.logging.Logger.class.getName())
        .add(java.util.Map.class.getName())
        .add(java.util.HashMap.class.getName())
        .add(java.util.HashSet.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.util.logging.Logger.class.getName())
        .add(java.util.Map.class.getName())
        .add(java.util.HashMap.class.getName())
        .add(java.util.HashSet.class.getName())
        .add(java.util.NavigableMap.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.util.Map.class.getName())
        .add(java.util.HashMap.class.getName())
        .add(java.util.HashSet.class.getName())
        .add(java.util.NavigableMap.class.getName())
        .add(java.util.NavigableSet.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.util.HashMap.class.getName())
        .add(java.util.HashSet.class.getName())
        .add(java.util.NavigableMap.class.getName())
        .add(java.util.NavigableSet.class.getName())
        .add(java.util.Random.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.util.HashSet.class.getName())
        .add(java.util.NavigableMap.class.getName())
        .add(java.util.NavigableSet.class.getName())
        .add(java.util.Random.class.getName())
        .add(java.util.TreeMap.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.util.NavigableMap.class.getName())
        .add(java.util.NavigableSet.class.getName())
        .add(java.util.Random.class.getName())
        .add(java.util.TreeMap.class.getName())
        .add(java.util.TreeSet.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.util.NavigableSet.class.getName())
        .add(java.util.Random.class.getName())
        .add(java.util.TreeMap.class.getName())
        .add(java.util.TreeSet.class.getName())
        .add(java.util.Vector.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.util.Random.class.getName())
        .add(java.util.TreeMap.class.getName())
        .add(java.util.TreeSet.class.getName())
        .add(java.util.Vector.class.getName())
        .add(java.util.Set.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.util.TreeMap.class.getName())
        .add(java.util.TreeSet.class.getName())
        .add(java.util.Vector.class.getName())
        .add(java.util.Set.class.getName())
        .add(java.util.concurrent.atomic.AtomicBoolean.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.util.TreeSet.class.getName())
        .add(java.util.Vector.class.getName())
        .add(java.util.Set.class.getName())
        .add(java.util.concurrent.atomic.AtomicBoolean.class.getName())
        .add(java.util.concurrent.atomic.AtomicReference.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent.atomic` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.util.Vector.class.getName())
        .add(java.util.Set.class.getName())
        .add(java.util.concurrent.atomic.AtomicBoolean.class.getName())
        .add(java.util.concurrent.atomic.AtomicReference.class.getName())
        .add(java.util.concurrent.atomic.AtomicLong.class.getName())
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent.atomic` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.util.Set.class.getName())
        .add(java.util.concurrent.atomic.AtomicBoolean.class.getName())
        .add(java.util.concurrent.atomic.AtomicReference.class.getName())
        .add(java.util.concurrent.atomic.AtomicLong.class.getName())
        .build();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.concurrent.atomic` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.util.concurrent.atomic.AtomicBoolean.class.getName())
        .add(java.util.concurrent.atomic.AtomicReference.class.getName())
        .add(java.util.concurrent.atomic.AtomicLong.class.getName())
        .build();
  }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add("com.google.inject.TypeLiteral")
        .add("com.google.inject.Key")
        .add(com.google.common.base.CharMatcher.class)
        .add(com.google.common.base.Converter.class)
        .add(com.google.common.base.Joiner.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add("com.google.inject.Key")
        .add(com.google.common.base.CharMatcher.class)
        .add(com.google.common.base.Converter.class)
        .add(com.google.common.base.Joiner.class)
        .add(com.google.common.base.Optional.class, "T")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.base.CharMatcher.class)
        .add(com.google.common.base.Converter.class)
        .add(com.google.common.base.Joiner.class)
        .add(com.google.common.base.Optional.class, "T")
        .add(com.google.common.base.Splitter.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.base.Converter.class)
        .add(com.google.common.base.Joiner.class)
        .add(com.google.common.base.Optional.class, "T")
        .add(com.google.common.base.Splitter.class)
        .add(com.google.common.collect.ContiguousSet.class, "C")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.base.Joiner.class)
        .add(com.google.common.base.Optional.class, "T")
        .add(com.google.common.base.Splitter.class)
        .add(com.google.common.collect.ContiguousSet.class, "C")
        .add(com.google.common.collect.ImmutableBiMap.class, "K", "V")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.base.Optional.class, "T")
        .add(com.google.common.base.Splitter.class)
        .add(com.google.common.collect.ContiguousSet.class, "C")
        .add(com.google.common.collect.ImmutableBiMap.class, "K", "V")
        .add(com.google.common.collect.ImmutableCollection.class, "E")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.base.Splitter.class)
        .add(com.google.common.collect.ContiguousSet.class, "C")
        .add(com.google.common.collect.ImmutableBiMap.class, "K", "V")
        .add(com.google.common.collect.ImmutableCollection.class, "E")
        .add(com.google.common.collect.ImmutableList.class, "E")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.collect.ContiguousSet.class, "C")
        .add(com.google.common.collect.ImmutableBiMap.class, "K", "V")
        .add(com.google.common.collect.ImmutableCollection.class, "E")
        .add(com.google.common.collect.ImmutableList.class, "E")
        .add(com.google.common.collect.ImmutableListMultimap.class, "K", "V")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.collect.ImmutableBiMap.class, "K", "V")
        .add(com.google.common.collect.ImmutableCollection.class, "E")
        .add(com.google.common.collect.ImmutableList.class, "E")
        .add(com.google.common.collect.ImmutableListMultimap.class, "K", "V")
        .add(com.google.common.collect.ImmutableMap.class, "K", "V")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.collect.ImmutableCollection.class, "E")
        .add(com.google.common.collect.ImmutableList.class, "E")
        .add(com.google.common.collect.ImmutableListMultimap.class, "K", "V")
        .add(com.google.common.collect.ImmutableMap.class, "K", "V")
        .add(com.google.common.collect.ImmutableMultimap.class, "K", "V")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.collect.ImmutableList.class, "E")
        .add(com.google.common.collect.ImmutableListMultimap.class, "K", "V")
        .add(com.google.common.collect.ImmutableMap.class, "K", "V")
        .add(com.google.common.collect.ImmutableMultimap.class, "K", "V")
        .add(com.google.common.collect.ImmutableMultiset.class, "E")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.collect.ImmutableListMultimap.class, "K", "V")
        .add(com.google.common.collect.ImmutableMap.class, "K", "V")
        .add(com.google.common.collect.ImmutableMultimap.class, "K", "V")
        .add(com.google.common.collect.ImmutableMultiset.class, "E")
        .add(com.google.common.collect.ImmutableRangeMap.class, "K", "V")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.collect.ImmutableMap.class, "K", "V")
        .add(com.google.common.collect.ImmutableMultimap.class, "K", "V")
        .add(com.google.common.collect.ImmutableMultiset.class, "E")
        .add(com.google.common.collect.ImmutableRangeMap.class, "K", "V")
        .add(com.google.common.collect.ImmutableRangeSet.class, "C")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.collect.ImmutableMultimap.class, "K", "V")
        .add(com.google.common.collect.ImmutableMultiset.class, "E")
        .add(com.google.common.collect.ImmutableRangeMap.class, "K", "V")
        .add(com.google.common.collect.ImmutableRangeSet.class, "C")
        .add(com.google.common.collect.ImmutableSet.class, "E")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.collect.ImmutableMultiset.class, "E")
        .add(com.google.common.collect.ImmutableRangeMap.class, "K", "V")
        .add(com.google.common.collect.ImmutableRangeSet.class, "C")
        .add(com.google.common.collect.ImmutableSet.class, "E")
        .add(com.google.common.collect.ImmutableSetMultimap.class, "K", "V")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.collect.ImmutableRangeMap.class, "K", "V")
        .add(com.google.common.collect.ImmutableRangeSet.class, "C")
        .add(com.google.common.collect.ImmutableSet.class, "E")
        .add(com.google.common.collect.ImmutableSetMultimap.class, "K", "V")
        .add(com.google.common.collect.ImmutableSortedMap.class, "K", "V")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.collect.ImmutableRangeSet.class, "C")
        .add(com.google.common.collect.ImmutableSet.class, "E")
        .add(com.google.common.collect.ImmutableSetMultimap.class, "K", "V")
        .add(com.google.common.collect.ImmutableSortedMap.class, "K", "V")
        .add(com.google.common.collect.ImmutableSortedMultiset.class, "E")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.collect.ImmutableSet.class, "E")
        .add(com.google.common.collect.ImmutableSetMultimap.class, "K", "V")
        .add(com.google.common.collect.ImmutableSortedMap.class, "K", "V")
        .add(com.google.common.collect.ImmutableSortedMultiset.class, "E")
        .add(com.google.common.collect.ImmutableSortedSet.class, "E")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.collect.ImmutableSetMultimap.class, "K", "V")
        .add(com.google.common.collect.ImmutableSortedMap.class, "K", "V")
        .add(com.google.common.collect.ImmutableSortedMultiset.class, "E")
        .add(com.google.common.collect.ImmutableSortedSet.class, "E")
        .add(com.google.common.collect.ImmutableTable.class, "R", "C", "V")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.collect.ImmutableSortedMap.class, "K", "V")
        .add(com.google.common.collect.ImmutableSortedMultiset.class, "E")
        .add(com.google.common.collect.ImmutableSortedSet.class, "E")
        .add(com.google.common.collect.ImmutableTable.class, "R", "C", "V")
        .add(com.google.common.collect.Range.class, "C")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.collect.ImmutableSortedMultiset.class, "E")
        .add(com.google.common.collect.ImmutableSortedSet.class, "E")
        .add(com.google.common.collect.ImmutableTable.class, "R", "C", "V")
        .add(com.google.common.collect.Range.class, "C")
        .add(com.google.common.graph.ImmutableGraph.class, "N")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.collect.ImmutableSortedSet.class, "E")
        .add(com.google.common.collect.ImmutableTable.class, "R", "C", "V")
        .add(com.google.common.collect.Range.class, "C")
        .add(com.google.common.graph.ImmutableGraph.class, "N")
        .add(com.google.common.graph.ImmutableNetwork.class, "N", "E")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.graph` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.collect.ImmutableTable.class, "R", "C", "V")
        .add(com.google.common.collect.Range.class, "C")
        .add(com.google.common.graph.ImmutableGraph.class, "N")
        .add(com.google.common.graph.ImmutableNetwork.class, "N", "E")
        .add(com.google.common.graph.ImmutableValueGraph.class, "N", "V")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.graph` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.collect.Range.class, "C")
        .add(com.google.common.graph.ImmutableGraph.class, "N")
        .add(com.google.common.graph.ImmutableNetwork.class, "N", "E")
        .add(com.google.common.graph.ImmutableValueGraph.class, "N", "V")
        .add("com.google.common.hash.AbstractHashFunction") // package-private
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.graph` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.graph.ImmutableGraph.class, "N")
        .add(com.google.common.graph.ImmutableNetwork.class, "N", "E")
        .add(com.google.common.graph.ImmutableValueGraph.class, "N", "V")
        .add("com.google.common.hash.AbstractHashFunction") // package-private
        .add(com.google.common.hash.HashCode.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.hash` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.graph.ImmutableValueGraph.class, "N", "V")
        .add("com.google.common.hash.AbstractHashFunction") // package-private
        .add(com.google.common.hash.HashCode.class)
        .add(com.google.common.io.BaseEncoding.class)
        .add(com.google.common.net.MediaType.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.io` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add("com.google.common.hash.AbstractHashFunction") // package-private
        .add(com.google.common.hash.HashCode.class)
        .add(com.google.common.io.BaseEncoding.class)
        .add(com.google.common.net.MediaType.class)
        .add(com.google.common.primitives.UnsignedInteger.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.net` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.hash.HashCode.class)
        .add(com.google.common.io.BaseEncoding.class)
        .add(com.google.common.net.MediaType.class)
        .add(com.google.common.primitives.UnsignedInteger.class)
        .add(com.google.common.primitives.UnsignedLong.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.primitives` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.io.BaseEncoding.class)
        .add(com.google.common.net.MediaType.class)
        .add(com.google.common.primitives.UnsignedInteger.class)
        .add(com.google.common.primitives.UnsignedLong.class)
        .add("com.ibm.icu.number.LocalizedNumberFormatter")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.primitives` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.net.MediaType.class)
        .add(com.google.common.primitives.UnsignedInteger.class)
        .add(com.google.common.primitives.UnsignedLong.class)
        .add("com.ibm.icu.number.LocalizedNumberFormatter")
        .add("com.ibm.icu.number.LocalizedNumberRangeFormatter")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add("com.ibm.icu.util.Currency")
        .add("com.ibm.icu.util.ULocale")
        .add(java.lang.Class.class)
        .add(java.lang.String.class)
        .add(java.lang.annotation.Annotation.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add("com.ibm.icu.util.ULocale")
        .add(java.lang.Class.class)
        .add(java.lang.String.class)
        .add(java.lang.annotation.Annotation.class)
        .add(java.math.BigDecimal.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.annotation` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.lang.Class.class)
        .add(java.lang.String.class)
        .add(java.lang.annotation.Annotation.class)
        .add(java.math.BigDecimal.class)
        .add(java.math.BigInteger.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.math` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.lang.String.class)
        .add(java.lang.annotation.Annotation.class)
        .add(java.math.BigDecimal.class)
        .add(java.math.BigInteger.class)
        .add(java.net.Inet4Address.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.math` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.lang.annotation.Annotation.class)
        .add(java.math.BigDecimal.class)
        .add(java.math.BigInteger.class)
        .add(java.net.Inet4Address.class)
        .add(java.net.Inet6Address.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.net` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.math.BigDecimal.class)
        .add(java.math.BigInteger.class)
        .add(java.net.Inet4Address.class)
        .add(java.net.Inet6Address.class)
        .add(java.net.InetAddress.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.net` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.math.BigInteger.class)
        .add(java.net.Inet4Address.class)
        .add(java.net.Inet6Address.class)
        .add(java.net.InetAddress.class)
        .add(java.net.URI.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.net` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.net.Inet4Address.class)
        .add(java.net.Inet6Address.class)
        .add(java.net.InetAddress.class)
        .add(java.net.URI.class)
        .add(java.net.http.HttpClient.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.net` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.net.Inet6Address.class)
        .add(java.net.InetAddress.class)
        .add(java.net.URI.class)
        .add(java.net.http.HttpClient.class)
        .add(java.nio.ByteOrder.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.net.http` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.net.InetAddress.class)
        .add(java.net.URI.class)
        .add(java.net.http.HttpClient.class)
        .add(java.nio.ByteOrder.class)
        .add(java.nio.charset.Charset.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.nio` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.net.URI.class)
        .add(java.net.http.HttpClient.class)
        .add(java.nio.ByteOrder.class)
        .add(java.nio.charset.Charset.class)
        .add(java.nio.file.Path.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.nio.charset` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.net.http.HttpClient.class)
        .add(java.nio.ByteOrder.class)
        .add(java.nio.charset.Charset.class)
        .add(java.nio.file.Path.class)
        .add(java.nio.file.WatchEvent.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.nio.ByteOrder.class)
        .add(java.nio.charset.Charset.class)
        .add(java.nio.file.Path.class)
        .add(java.nio.file.WatchEvent.class)
        .add(java.nio.file.attribute.AclEntry.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.nio.file` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.nio.charset.Charset.class)
        .add(java.nio.file.Path.class)
        .add(java.nio.file.WatchEvent.class)
        .add(java.nio.file.attribute.AclEntry.class)
        .add(java.nio.file.attribute.FileTime.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.nio.file.attribute` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.nio.file.Path.class)
        .add(java.nio.file.WatchEvent.class)
        .add(java.nio.file.attribute.AclEntry.class)
        .add(java.nio.file.attribute.FileTime.class)
        .add(java.util.UUID.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.nio.file.attribute` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.nio.file.WatchEvent.class)
        .add(java.nio.file.attribute.AclEntry.class)
        .add(java.nio.file.attribute.FileTime.class)
        .add(java.util.UUID.class)
        .add(java.util.Locale.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.nio.file.attribute.AclEntry.class)
        .add(java.nio.file.attribute.FileTime.class)
        .add(java.util.UUID.class)
        .add(java.util.Locale.class)
        .add(java.util.regex.Pattern.class)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.nio.file.attribute.FileTime.class)
        .add(java.util.UUID.class)
        .add(java.util.Locale.class)
        .add(java.util.regex.Pattern.class)
        .add("android.net.Uri")
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary, and can be replaced with an import
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(java.util.UUID.class)
        .add(java.util.Locale.class)
        .add(java.util.regex.Pattern.class)
        .add("android.net.Uri")
        .add("android.util.Size")
```

## RuleId[ruleID=ReplaceNullCheck]
### RuleId[ruleID=ReplaceNullCheck]
'if' statement can be replaced with call to 'Objects.requireNonNullElse()'
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodInvocationMatcher.java`
#### Snippet
```java
            Object lookupKey = type.extract(ctx, state);
            BiPredicate<Context, VisitorState> child = lookup.get(lookupKey);
            if (child != null) {
              return child.test(ctx, state);
            }
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `TemplateMatch()` of an abstract class should not be declared 'public'
in `core/src/main/java/com/google/errorprone/refaster/TemplateMatch.java`
#### Snippet
```java
  private final Unifier unifier;

  public TemplateMatch(JCTree location, Unifier unifier) {
    this.location = checkNotNull(location);
    this.unifier = checkNotNull(unifier);
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractMockChecker()` of an abstract class should not be declared 'public'
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMockChecker.java`
#### Snippet
```java
    implements MethodInvocationTreeMatcher, VariableTreeMatcher {

  public AbstractMockChecker(
      TypeExtractor<VariableTree> varExtractor,
      TypeExtractor<MethodInvocationTree> methodExtractor,
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `ChildMultiMatcher()` of an abstract class should not be declared 'public'
in `check_api/src/main/java/com/google/errorprone/matchers/ChildMultiMatcher.java`
#### Snippet
```java
  private final ListMatcher<N> listMatcher;

  public ChildMultiMatcher(MatchType matchType, Matcher<N> nodeMatcher) {
    this.nodeMatcher = nodeMatcher;
    this.listMatcher = ListMatcher.create(matchType);
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractTypeMatcher()` of an abstract class should not be declared 'public'
in `check_api/src/main/java/com/google/errorprone/matchers/AbstractTypeMatcher.java`
#### Snippet
```java
  protected Supplier<Type> typeToCompareSupplier;

  public AbstractTypeMatcher(Supplier<Type> typeToCompareSupplier) {
    this.typeToCompareSupplier = typeToCompareSupplier;
  }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractTypeMatcher()` of an abstract class should not be declared 'public'
in `check_api/src/main/java/com/google/errorprone/matchers/AbstractTypeMatcher.java`
#### Snippet
```java
  }

  public AbstractTypeMatcher(String typeString) {
    this(typeFromString(typeString));
  }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `BugChecker()` of an abstract class should not be declared 'public'
in `check_api/src/main/java/com/google/errorprone/bugpatterns/BugChecker.java`
#### Snippet
```java
  private final BiPredicate<Set<? extends Name>, VisitorState> checkSuppression;

  public BugChecker() {
    info = BugCheckerInfo.create(getClass());
    checkSuppression = suppressionPredicate(info.customSuppressionAnnotations());
```

## RuleId[ruleID=Anonymous2MethodRef]
### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new Context.Factory() can be replaced with method reference
in `check_api/src/main/java/com/google/errorprone/MaskedClassLoader.java`
#### Snippet
```java
    context.put(
        JavaFileManager.class,
        new Context.Factory<JavaFileManager>() {
          @Override
          public JavaFileManager make(Context c) {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new Function\>() can be replaced with method reference
in `check_api/src/main/java/com/google/errorprone/suppliers/Suppliers.java`
#### Snippet
```java
        Iterables.transform(
            types,
            new Function<String, Supplier<Type>>() {
              @Override
              public Supplier<Type> apply(String input) {
```

## RuleId[ruleID=JavaReflectionInvocation]
### RuleId[ruleID=JavaReflectionInvocation]
4 arguments are expected
in `check_api/src/main/java/com/google/errorprone/ErrorProneError.java`
#### Snippet
```java
      Method m =
          Log.class.getMethod("error", DiagnosticPosition.class, String.class, Object[].class);
      m.invoke(
          log,
          pos,
          "error.prone.crash",
          Throwables.getStackTraceAsString(cause),
          version,
          checkName);
    } catch (ReflectiveOperationException e) {
      throw new LinkageError(e.getMessage(), e);
```

### RuleId[ruleID=JavaReflectionInvocation]
Argument is not assignable to 'com.sun.tools.javac.tree.JCTree.JCExpression'
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
            TreeMaker.class
                .getMethod("Case", JCExpression.class, List.class)
                .invoke(maker(), node.getExpression(), stmts);
      }
    } catch (ReflectiveOperationException e) {
```

## RuleId[ruleID=Convert2Lambda]
### RuleId[ruleID=Convert2Lambda]
Anonymous new Function() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/refaster/UVariableDecl.java`
#### Snippet
```java
        .thenChoose(unifications(getInitializer(), decl.getInitializer()))
        .transform(
            new Function<Unifier, Unifier>() {
              @Override
              public Unifier apply(Unifier unifier) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function\>() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/refaster/Unifier.java`
#### Snippet
```java
            .condition(index + 1 == toUnify.size())
            .thenOption(
                new Function<Unifier, Optional<Unifier>>() {
                  @Override
                  public Optional<Unifier> apply(Unifier unifier) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function\>() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/refaster/ExpressionTemplate.java`
#### Snippet
```java
        .condition(u -> trueOrNull(PLACEHOLDER_VERIFIER.scan(expression(), u)))
        .thenOption(
            new Function<Unifier, Optional<Unifier>>() {

              @Override
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/LongLiteralLowerCaseSuffix.java`
#### Snippet
```java

  private static final Matcher<LiteralTree> matcher =
      new Matcher<LiteralTree>() {
        @Override
        public boolean matches(LiteralTree literalTree, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/TruthSelfEquals.java`
#### Snippet
```java

  private static Matcher<? super MethodInvocationTree> receiverSameAsParentsArgument() {
    return new Matcher<MethodInvocationTree>() {
      @Override
      public boolean matches(MethodInvocationTree t, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractAsyncTypeReturnsNull.java`
#### Snippet
```java
  private static Matcher<MethodTree> overridesMethodOfClass(Class<?> clazz) {
    checkNotNull(clazz);
    return new Matcher<MethodTree>() {
      @Override
      public boolean matches(MethodTree tree, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/NonAtomicVolatileUpdate.java`
#### Snippet
```java
  /** Extracts the expression from a UnaryTree and applies a matcher to it. */
  private static Matcher<UnaryTree> expressionFromUnaryTree(Matcher<ExpressionTree> exprMatcher) {
    return new Matcher<UnaryTree>() {
      @Override
      public boolean matches(UnaryTree tree, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/NonAtomicVolatileUpdate.java`
#### Snippet
```java
  private static Matcher<AssignmentTree> variableFromAssignmentTree(
      Matcher<ExpressionTree> exprMatcher) {
    return new Matcher<AssignmentTree>() {
      @Override
      public boolean matches(AssignmentTree tree, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/NonAtomicVolatileUpdate.java`
#### Snippet
```java
  private static Matcher<CompoundAssignmentTree> variableFromCompoundAssignmentTree(
      Matcher<ExpressionTree> exprMatcher) {
    return new Matcher<CompoundAssignmentTree>() {
      @Override
      public boolean matches(CompoundAssignmentTree tree, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/FuturesGetCheckedIllegalExceptionType.java`
#### Snippet
```java

  private static final Matcher<ExpressionTree> CLASS_OBJECT_FOR_CLASS_EXTENDING_RUNTIME_EXCEPTION =
      new Matcher<ExpressionTree>() {
        @Override
        public boolean matches(ExpressionTree tree, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/FuturesGetCheckedIllegalExceptionType.java`
#### Snippet
```java
  private static final Matcher<ExpressionTree> CLASS_OBJECT_FOR_CLASS_WITHOUT_USABLE_CONSTRUCTOR =
      classLiteral(
          new Matcher<ExpressionTree>() {
            @Override
            public boolean matches(ExpressionTree tree, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/BadShiftAmount.java`
#### Snippet
```java
   */
  private static final Matcher<BinaryTree> BAD_SHIFT_AMOUNT_INT =
      new Matcher<BinaryTree>() {
        @Override
        public boolean matches(BinaryTree tree, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/ChainingConstructorIgnoresParameter.java`
#### Snippet
```java
      String name, ExpressionTree tree, VisitorState state) {
    Matcher<IdentifierTree> identifierMatcher =
        new Matcher<IdentifierTree>() {
          @Override
          public boolean matches(IdentifierTree tree, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/NoAllocationChecker.java`
#### Snippet
```java
   */
  private static final Matcher<Tree> withinThrowOrAnnotation =
      new Matcher<Tree>() {
        @Override
        public boolean matches(Tree tree, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/NoAllocationChecker.java`
#### Snippet
```java
  /** Matches boxing by method invocation, including varargs. */
  private static final Matcher<MethodInvocationTree> boxingInvocation =
      new Matcher<MethodInvocationTree>() {
        @Override
        public boolean matches(MethodInvocationTree tree, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/NoAllocationChecker.java`
#### Snippet
```java
  /** Matches boxing by unary operator. */
  private static final Matcher<UnaryTree> boxingUnary =
      new Matcher<UnaryTree>() {
        @Override
        public boolean matches(UnaryTree tree, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/TryFailThrowable.java`
#### Snippet
```java

  private static final Matcher<ExpressionTree> failOrAssert =
      new Matcher<ExpressionTree>() {
        @Override
        public boolean matches(ExpressionTree item, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/ScopeAnnotationOnInterfaceOrAbstractClass.java`
#### Snippet
```java

  private static final Matcher<ClassTree> INTERFACE_AND_ABSTRACT_TYPE_MATCHER =
      new Matcher<ClassTree>() {
        @Override
        public boolean matches(ClassTree classTree, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/InjectedConstructorAnnotations.java`
#### Snippet
```java
  // A matcher of binding annotations
  private static final Matcher<AnnotationTree> BINDING_ANNOTATION_MATCHER =
      new Matcher<AnnotationTree>() {
        @Override
        public boolean matches(AnnotationTree annotationTree, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/guice/AssistedInjectScoping.java`
#### Snippet
```java
   */
  private static final Matcher<ClassTree> HAS_ASSISTED_CONSTRUCTOR =
      new Matcher<ClassTree>() {
        @Override
        public boolean matches(ClassTree classTree, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/UseBinds.java`
#### Snippet
```java
public class UseBinds extends BugChecker implements MethodTreeMatcher {
  private static final Matcher<MethodTree> SIMPLE_METHOD =
      new Matcher<MethodTree>() {
        @Override
        public boolean matches(MethodTree t, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/EmptySetMultibindingContributions.java`
#### Snippet
```java

  private static final Matcher<MethodTree> RETURNS_EMPTY_SET =
      new Matcher<MethodTree>() {
        @Override
        public boolean matches(MethodTree method, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/Util.java`
#### Snippet
```java

  private static final Matcher<ClassTree> CLASS_EXTENDS_NOTHING =
      new Matcher<ClassTree>() {
        @Override
        public boolean matches(ClassTree t, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function\>() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/Util.java`
#### Snippet
```java
        transform(
            asList(parameters),
            new Function<String, Matcher<AnnotationTree>>() {
              @Override
              public Matcher<AnnotationTree> apply(String parameter) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/Util.java`
#### Snippet
```java
      constructor(
          AT_LEAST_ONE,
          new Matcher<MethodTree>() {
            @Override
            public boolean matches(MethodTree t, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/AssertEqualsArgumentOrderChecker.java`
#### Snippet
```java
   */
  private static Function<ParameterPair, Double> buildDistanceFunction() {
    return new Function<ParameterPair, Double>() {

      @Override
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/ArgumentSelectionDefectChecker.java`
#### Snippet
```java
   */
  private static Function<ParameterPair, Double> buildDefaultDistanceFunction() {
    return new Function<ParameterPair, Double>() {
      @Override
      public Double apply(ParameterPair pair) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/Matchers.java`
#### Snippet
```java

  private static final Matcher<MethodInvocationTree> THREE_PARAMETER_ASSERT =
      new Matcher<MethodInvocationTree>() {
        @Override
        public boolean matches(MethodInvocationTree tree, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/Matchers.java`
#### Snippet
```java

  private static final Matcher<MethodInvocationTree> TWO_PARAMETER_ASSERT =
      new Matcher<MethodInvocationTree>() {
        @Override
        public boolean matches(MethodInvocationTree tree, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/Matchers.java`
#### Snippet
```java
  /** Matches if the tree is a constructor for an AutoValue class. */
  static final Matcher<NewClassTree> AUTOVALUE_CONSTRUCTOR =
      new Matcher<NewClassTree>() {
        @Override
        public boolean matches(NewClassTree tree, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/AutoValueConstructorOrderChecker.java`
#### Snippet
```java

  private static Function<ParameterPair, Double> buildDistanceFunction() {
    return new Function<ParameterPair, Double>() {
      @Override
      public Double apply(ParameterPair parameterPair) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new ViolationReporter() can be replaced with lambda
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableAnalysis.java`
#### Snippet
```java
            immutableTyParams,
            superType,
            new ViolationReporter() {
              @Override
              public Description.Builder describe(Tree tree, Violation info) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function() can be replaced with lambda
in `check_api/src/main/java/com/google/errorprone/apply/ImportStatements.java`
#### Snippet
```java
        Lists.transform(
            importTrees,
            new Function<JCImport, String>() {
              @Override
              public String apply(JCImport input) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Comparator\>() can be replaced with lambda
in `check_api/src/main/java/com/google/errorprone/fixes/Replacements.java`
#### Snippet
```java
   */
  private static final Comparator<Range<Integer>> DESCENDING =
      new Comparator<Range<Integer>>() {
        @Override
        public int compare(Range<Integer> o1, Range<Integer> o2) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Matcher() can be replaced with lambda
in `check_api/src/main/java/com/google/errorprone/matchers/JUnitMatchers.java`
#### Snippet
```java
   */
  public static Matcher<ExpressionTree> isJUnit4TestRunnerOfType(Iterable<String> runnerTypes) {
    return new Matcher<ExpressionTree>() {
      @Override
      public boolean matches(ExpressionTree t, VisitorState state) {
```

### RuleId[ruleID=Convert2Lambda]
Anonymous new Function\>() can be replaced with lambda
in `check_api/src/main/java/com/google/errorprone/suppliers/Suppliers.java`
#### Snippet
```java
        Iterables.transform(
            types,
            new Function<String, Supplier<Type>>() {
              @Override
              public Supplier<Type> apply(String input) {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `type`
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
    // Packages enclose types, so we cannot just wait until we hit null.
    while (type.getEnclosingElement().getKind() == ElementKind.CLASS) {
      type = (TypeElement) type.getEnclosingElement();
    }
    // Start with outermost class name and append remainder of full type name with '.' -> '$'
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `expr`
in `core/src/main/java/com/google/errorprone/bugpatterns/ConstantOverflow.java`
#### Snippet
```java
    while (expr instanceof BinaryTree) {
      binExpr = (BinaryTree) expr;
      expr = binExpr.getLeftOperand();
    }
    if (!(expr instanceof LiteralTree) || expr.getKind() != Kind.INT_LITERAL) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `type`
in `core/src/main/java/com/google/errorprone/bugpatterns/ThrowIfUncheckedKnownChecked.java`
#### Snippet
```java
          Symtab symtab = state.getSymtab();
          // Check erasure for generics.
          type = types.erasure(type);
          return
          // Has to be some Exception: A variable of type Throwable might be an Error.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `tree`
in `core/src/main/java/com/google/errorprone/bugpatterns/LiteProtoToString.java`
#### Snippet
```java

  private static boolean isStrippedLogMessage(Tree tree) {
    for (; tree instanceof MethodInvocationTree; tree = getReceiver((MethodInvocationTree) tree)) {
      if (METHODS_STRIPPED_BY_OPTIMIZER.contains(getSymbol(tree).getSimpleName().toString())) {
        return true;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `then`
in `core/src/main/java/com/google/errorprone/bugpatterns/ImplementAssertionWithChaining.java`
#### Snippet
```java
        return false;
      }
      then = getOnlyElement(statements);
    }
    if (then.getKind() != EXPRESSION_STATEMENT) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `name`
in `core/src/main/java/com/google/errorprone/bugpatterns/TypeParameterNaming.java`
#### Snippet
```java
    Matcher matcher = TRAILING_DIGIT_EXTRACTOR.matcher(name);
    if (matcher.matches()) {
      name = matcher.group(1);
      typeVarNum = Integer.parseInt(matcher.group(2)) + 1;
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `sym`
in `core/src/main/java/com/google/errorprone/bugpatterns/TypeParameterNaming.java`
#### Snippet
```java
    outer:
    while (!isStatic(sym)) {
      sym = sym.owner;
      switch (sym.getKind()) {
        case PACKAGE:
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `path`
in `core/src/main/java/com/google/errorprone/bugpatterns/AlreadyChecked.java`
#### Snippet
```java
    private @Nullable TreePath escapeBlock(@Nullable TreePath path) {
      while (path != null && path.getLeaf() instanceof BlockTree) {
        path = path.getParentPath();
      }
      return path;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `sym`
in `core/src/main/java/com/google/errorprone/bugpatterns/TypeParameterShadowing.java`
#### Snippet
```java
    outer:
    while (!isStatic(sym)) {
      sym = sym.owner;
      switch (sym.getKind()) {
        case PACKAGE:
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `tree`
in `core/src/main/java/com/google/errorprone/bugpatterns/JdkObsolete.java`
#### Snippet
```java
        SuggestedFix.Builder fix = SuggestedFix.builder();
        while (tree instanceof ParameterizedTypeTree) {
          tree = ((ParameterizedTypeTree) tree).getType();
        }
        fix.replace(tree, SuggestedFixes.qualifyType(state, fix, sym));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `state`
in `core/src/main/java/com/google/errorprone/bugpatterns/NoAllocationChecker.java`
#### Snippet
```java
          while (path != null) {
            Tree node = path.getLeaf();
            state = state.withPath(path);
            switch (node.getKind()) {
              case METHOD:
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `tree`
in `core/src/main/java/com/google/errorprone/bugpatterns/SameNameButDifferent.java`
#### Snippet
```java
          MemberSelectTree select = (MemberSelectTree) tree;
          parts.addFirst(select.getIdentifier());
          tree = select.getExpression();
        }
        if (!(tree instanceof IdentifierTree)) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `path`
in `core/src/main/java/com/google/errorprone/bugpatterns/ForOverrideChecker.java`
#### Snippet
```java
  private static MethodTree findDirectMethod(TreePath path) {
    while (true) {
      path = path.getParentPath();
      if (path != null) {
        Tree leaf = path.getLeaf();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `tree`
in `core/src/main/java/com/google/errorprone/bugpatterns/BigDecimalLiteralDouble.java`
#### Snippet
```java
  private static boolean floatingPointArgument(ExpressionTree tree) {
    if (tree.getKind() == Kind.UNARY_PLUS || tree.getKind() == Kind.UNARY_MINUS) {
      tree = ((UnaryTree) tree).getExpression();
    }
    return tree.getKind() == Kind.DOUBLE_LITERAL || tree.getKind() == Kind.FLOAT_LITERAL;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `type`
in `core/src/main/java/com/google/errorprone/bugpatterns/MixedArrayDimensions.java`
#### Snippet
```java
    }
    CharSequence source = state.getSourceCode();
    for (; type instanceof ArrayTypeTree; type = ((ArrayTypeTree) type).getType()) {
      Tree elemType = ((ArrayTypeTree) type).getType();
      int start = state.getEndPosition(elemType);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `init`
in `core/src/main/java/com/google/errorprone/bugpatterns/FieldCanBeFinal.java`
#### Snippet
```java
        // don't record assignments in initializers that aren't to members of the object
        // being initialized
        init = InitializationContext.NONE;
      }
      writes.recordAssignment(node.getVariable(), init);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `init`
in `core/src/main/java/com/google/errorprone/bugpatterns/FieldCanBeFinal.java`
#### Snippet
```java
    @Override
    public Void visitCompoundAssignment(CompoundAssignmentTree node, InitializationContext init) {
      init = InitializationContext.NONE;
      writes.recordAssignment(node.getVariable(), init);
      return super.visitCompoundAssignment(node, init);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `init`
in `core/src/main/java/com/google/errorprone/bugpatterns/FieldCanBeFinal.java`
#### Snippet
```java
    public Void visitUnary(UnaryTree node, InitializationContext init) {
      if (UNARY_ASSIGNMENT.contains(node.getKind())) {
        init = InitializationContext.NONE;
        writes.recordAssignment(node.getExpression(), init);
      }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `init`
in `core/src/main/java/com/google/errorprone/bugpatterns/FieldCanBeFinal.java`
#### Snippet
```java
      MethodSymbol sym = ASTHelpers.getSymbol(node);
      if (sym.isConstructor()) {
        init = InitializationContext.INSTANCE;
      }
      return super.visitMethod(node, init);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `init`
in `core/src/main/java/com/google/errorprone/bugpatterns/FieldCanBeFinal.java`
#### Snippet
```java
    public Void visitBlock(BlockTree node, InitializationContext init) {
      if (getCurrentPath().getParentPath().getLeaf().getKind() == Kind.CLASS) {
        init = node.isStatic() ? InitializationContext.STATIC : InitializationContext.INSTANCE;
      }
      return super.visitBlock(node, init);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `expr`
in `core/src/main/java/com/google/errorprone/bugpatterns/time/NearbyCallers.java`
#### Snippet
```java
    ImmutableList.Builder<Symbol> symbolChain = ImmutableList.builder();
    while (expr instanceof JCMethodInvocation) {
      expr = ((JCMethodInvocation) expr).getMethodSelect();
      // if the method isn't an immutable protobuf getter, return false
      if (!IS_IMMUTABLE_PROTO_GETTER.matches(expr, state)) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `expr`
in `core/src/main/java/com/google/errorprone/bugpatterns/time/NearbyCallers.java`
#### Snippet
```java
      }
      if (expr instanceof JCFieldAccess) {
        expr = ((JCFieldAccess) expr).getExpression();
      }
      symbolChain.add(ASTHelpers.getSymbol(expr));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `releaseStatement`
in `core/src/main/java/com/google/errorprone/bugpatterns/android/WakelockReleasedDangerously.java`
#### Snippet
```java
      LambdaExpressionTree enclosingLambda = (LambdaExpressionTree) releaseStatement;
      if (enclosingLambda.getBodyKind() == BodyKind.EXPRESSION) {
        releaseStatement = enclosingLambda.getBody();
        before = "{" + before;
        after = ";" + after + "}";
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `clazz`
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/ApiDiffChecker.java`
#### Snippet
```java
      return false;
    }
    for (; clazz instanceof ClassSymbol; clazz = clazz.owner) {
      if (hasAnnotationForbiddingUse(clazz, state)) {
        return true;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `label`
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/InvalidLink.java`
#### Snippet
```java
    private String fixLink(String reference, String label) {
      if (label.isEmpty()) {
        label = "link";
      }
      return String.format("<a href=\"%s\">%s</a>", reference, label);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `path`
in `core/src/main/java/com/google/errorprone/bugpatterns/flogger/FloggerRequiredModifiers.java`
#### Snippet
```java
        result = (ClassTree) leaf;
      }
      path = path.getParentPath();
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `sym`
in `core/src/main/java/com/google/errorprone/bugpatterns/flogger/FloggerRequiredModifiers.java`
#### Snippet
```java
    while (sym instanceof ClassSymbol) {
      result = sym;
      sym = sym.owner;
    }
    return result;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `tree`
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/EqualsBrokenForNull.java`
#### Snippet
```java
          switch (tree.getKind()) {
            case TYPE_CAST:
              tree = ((TypeCastTree) tree).getExpression();
              break;
            case PARENTHESIZED:
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `tree`
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/EqualsBrokenForNull.java`
#### Snippet
```java
              break;
            case PARENTHESIZED:
              tree = ((ParenthesizedTree) tree).getExpression();
              break;
            case IDENTIFIER:
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `callingVars`
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/Inliner.java`
#### Snippet
```java
        String varargsJoined =
            Joiner.on(", ").join(callingVars.subList(varNames.size() - 1, callingVars.size()));
        callingVars =
            ImmutableList.<String>builderWithExpectedSize(varNames.size())
                .addAll(nonvarargs)
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `path`
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/UnnecessaryCheckNotNull.java`
#### Snippet
```java
    // Find enclosing method declaration.
    while (path != null && !(path.getLeaf() instanceof MethodTree)) {
      path = path.getParentPath();
    }
    if (path == null) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `sym`
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullArgumentForNonNullParameter.java`
#### Snippet
```java
  private boolean enclosingAnnotationDefaultsNonTypeVariablesToNonNull(
      Symbol sym, VisitorState state) {
    for (; sym != null; sym = sym.getEnclosingElement()) {
      if (hasAnnotation(sym, "com.google.protobuf.Internal$ProtoNonnullApi", state)) {
        return true;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `targetType`
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/UnsafeWildcard.java`
#### Snippet
```java
    while (targetType instanceof ArrayType) {
      // Check array component type
      targetType = ((ArrayType) targetType).getComponentType();
    }
    int i = 0;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `tree`
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullnessUtils.java`
#### Snippet
```java
  @Nullable
  static NullCheck getNullCheck(ExpressionTree tree) {
    tree = stripParentheses(tree);

    Polarity polarity;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `sym`
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullnessUtils.java`
#### Snippet
```java

  static boolean isInNullMarkedScope(Symbol sym, VisitorState state) {
    for (; sym != null; sym = sym.getEnclosingElement()) {
      if (hasAnnotation(sym, "org.jspecify.nullness.NullMarked", state)) {
        return true;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `typeTree`
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullnessUtils.java`
#### Snippet
```java
      @Nullable String suppressionToRemove) {
    if (typeTree.getKind() == PARAMETERIZED_TYPE) {
      typeTree = ((ParameterizedTypeTree) typeTree).getType();
    }
    switch (typeTree.getKind()) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `type`
in `core/src/main/java/com/google/errorprone/bugpatterns/formatstring/FormatStringValidation.java`
#### Snippet
```java
    Type unboxedType = types.unboxedTypeOrType(types.erasure(type));
    if (unboxedType.isPrimitive()) {
      type = unboxedType;
      switch (type.getKind()) {
        case BOOLEAN:
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `expr`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedByChecker.java`
#### Snippet
```java
        return select;
      }
      expr = select.base();
    }
    return null;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `expr`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedByChecker.java`
#### Snippet
```java
  private static boolean enclosingInstance(GuardedByExpression expr) {
    while (expr.kind() == Kind.SELECT) {
      expr = ((Select) expr).base();
      if (expr.kind() == Kind.THIS) {
        return true;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `condition`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/DoubleCheckedLocking.java`
#### Snippet
```java
  @Nullable
  private static ExpressionTree getNullCheckedExpression(ExpressionTree condition) {
    condition = stripParentheses(condition);
    if (!(condition instanceof BinaryTree)) {
      return null;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `locks`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/HeldLockAnalyzer.java`
#### Snippet
```java
        GuardedByExpression lock =
            mods.contains(Modifier.STATIC) ? F.classLiteral(owner) : F.thisliteral();
        locks = locks.plus(lock);
      }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `locks`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/HeldLockAnalyzer.java`
#### Snippet
```java
                guard, GuardedBySymbolResolver.from(tree, visitorState), flags);
        if (bound.isPresent()) {
          locks = locks.plus(bound.get());
        }
      }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `symbol`
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/PackagesRule.java`
#### Snippet
```java
            : Optional.empty();
      }
      symbol = symbol.owner;
    }
    return Optional.empty();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `expr`
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/CanIgnoreReturnValueSuggester.java`
#### Snippet
```java

  private static boolean isIdentifier(ExpressionTree expr, String identifierName) {
    expr = stripParentheses(expr);
    if (expr instanceof IdentifierTree) {
      return ((IdentifierTree) expr).getName().contentEquals(identifierName);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `calledType`
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/IncompatibleArgumentType.java`
#### Snippet
```java
      // new Foo<String>().new Bar().something(123); // should fail, 123 needs to match String
      ClassSymbol encloser = clazzSymbol.owner.enclClass();
      calledType = calledType.getEnclosingType();
      tyargIndex = findTypeArgInList(encloser, typeArgName);
      if (tyargIndex != -1) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `clazzSymbol`
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/IncompatibleArgumentType.java`
#### Snippet
```java
        return RequiredType.create(calledType.getTypeArguments().get(tyargIndex));
      }
      clazzSymbol = encloser;
    }
    return null;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `check_api/src/main/java/com/google/errorprone/util/SourceCodeEscapers.java`
#### Snippet
```java
    r[1] = 'u';
    r[5] = HEX_DIGITS[c & 0xF];
    c >>>= 4;
    r[4] = HEX_DIGITS[c & 0xF];
    c >>>= 4;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `check_api/src/main/java/com/google/errorprone/util/SourceCodeEscapers.java`
#### Snippet
```java
    c >>>= 4;
    r[4] = HEX_DIGITS[c & 0xF];
    c >>>= 4;
    r[3] = HEX_DIGITS[c & 0xF];
    c >>>= 4;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `check_api/src/main/java/com/google/errorprone/util/SourceCodeEscapers.java`
#### Snippet
```java
    c >>>= 4;
    r[3] = HEX_DIGITS[c & 0xF];
    c >>>= 4;
    r[2] = HEX_DIGITS[c & 0xF];
    return r;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `state`
in `check_api/src/main/java/com/google/errorprone/VisitorState.java`
#### Snippet
```java
       * not just the current VisitorState's TreePath's CompilationUnit.
       */
      state = state.withNoPathForMemoization();

      /* javac is single-threaded, so in principle we don't really need to lock.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `description`
in `check_api/src/main/java/com/google/errorprone/VisitorState.java`
#### Snippet
```java
    SeverityLevel override = sharedState.severityMap.get(description.checkName);
    if (override != null) {
      description = description.applySeverityOverride(override);
    }
    sharedState.statisticsCollector.incrementCounter(statsKey(description.checkName + "-findings"));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `iterable`
in `check_api/src/main/java/com/google/errorprone/util/FindIdentifiers.java`
#### Snippet
```java
            builder.add(t);
          }
          iterable = builder.build();
        }
        return super.scan(iterable, unused);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `path`
in `check_api/src/main/java/com/google/errorprone/util/FindIdentifiers.java`
#### Snippet
```java
    int index2 = -1;
    int count = 0;
    path = path.getParentPath();
    while (path != null) {
      Tree curr = path.getLeaf();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `path`
in `check_api/src/main/java/com/google/errorprone/util/FindIdentifiers.java`
#### Snippet
```java
        break;
      }
      path = parentPath;
      count++;
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `path`
in `check_api/src/main/java/com/google/errorprone/util/FindIdentifiers.java`
#### Snippet
```java

    Tree prev = path.getLeaf();
    path = path.getParentPath();

    for (Tree tree : path) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `treePath`
in `check_api/src/main/java/com/google/errorprone/util/FindIdentifiers.java`
#### Snippet
```java
        return (ClassTree) leaf;
      }
      treePath = parent;
    }
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `replacement`
in `check_api/src/main/java/com/google/errorprone/fixes/Replacements.java`
#### Snippet
```java
        // First check whether it's a duplicate insert.
        if (existing.equals(replacement)) {
          replacement = coalescePolicy.handleDuplicateInsertion(replacement);
        } else {
          // Coalesce overlapping non-duplicate insertions together.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `replacement`
in `check_api/src/main/java/com/google/errorprone/fixes/Replacements.java`
#### Snippet
```java
        } else {
          // Coalesce overlapping non-duplicate insertions together.
          replacement =
              replacement.withDifferentText(
                  coalescePolicy.coalesce(replacement.replaceWith(), existing.replaceWith()));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `source`
in `check_api/src/main/java/com/google/errorprone/names/LevenshteinEditDistance.java`
#### Snippet
```java

    if (!caseSensitive) {
      source = Ascii.toLowerCase(source);
      target = Ascii.toLowerCase(target);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `target`
in `check_api/src/main/java/com/google/errorprone/names/LevenshteinEditDistance.java`
#### Snippet
```java
    if (!caseSensitive) {
      source = Ascii.toLowerCase(source);
      target = Ascii.toLowerCase(target);
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `source`
in `check_api/src/main/java/com/google/errorprone/names/NeedlemanWunschEditDistance.java`
#### Snippet
```java

    if (!caseSensitive) {
      source = Ascii.toLowerCase(source);
      target = Ascii.toLowerCase(target);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `target`
in `check_api/src/main/java/com/google/errorprone/names/NeedlemanWunschEditDistance.java`
#### Snippet
```java
    if (!caseSensitive) {
      source = Ascii.toLowerCase(source);
      target = Ascii.toLowerCase(target);
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `path`
in `check_api/src/main/java/com/google/errorprone/dataflow/DataFlow.java`
#### Snippet
```java
        }
      }
      path = parent;
    }
    return null;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `sym`
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/NullnessAnnotations.java`
#### Snippet
```java
        return Optional.of(Nullness.NONNULL);
      }
      sym = sym.getEnclosingElement();
    }
    return Optional.empty();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `sym`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
      }
    }
    sym = ((ClassSymbol) sym).getSuperclass().tsym;
    while (sym instanceof ClassSymbol && !possibleInherited.isEmpty()) {
      for (Name local : directAnnotationsAmong(sym, possibleInherited)) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `sym`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
        possibleInherited.remove(local);
      }
      sym = ((ClassSymbol) sym).getSuperclass().tsym;
    }
    return result;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `tree`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
  public static ExpressionTree stripParentheses(ExpressionTree tree) {
    while (tree instanceof ParenthesizedTree) {
      tree = ((ParenthesizedTree) tree).getExpression();
    }
    return tree;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `path`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
    if (path != null) {
      do {
        path = path.getParentPath();
      } while (path != null && !klass.isInstance(path.getLeaf()));
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `flags`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java

  public static EnumSet<Flags.Flag> asFlagSet(long flags) {
    flags &= ~(Flags.ANONCONSTR_BASED | Flags.POTENTIALLY_AMBIGUOUS);
    return Flags.asFlagSet(flags);
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `path`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
  @Nullable
  public static <T> T findEnclosingNode(TreePath path, Class<T> klass) {
    path = findPathFromEnclosingNodeToTopLevel(path, klass);
    return (path == null) ? null : klass.cast(path.getLeaf());
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `annotationClass`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
    // TODO(amalloy): unify with hasAnnotation(Symbol, Name, VisitorState)
    // normalize to non-binary names
    annotationClass = annotationClass.replace('$', '.');
    Name annotationName = state.getName(annotationClass);
    if (hasAttribute(sym, annotationName)) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `sym`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
          return true;
        }
        sym = ((ClassSymbol) sym).getSuperclass().tsym;
      } while (sym instanceof ClassSymbol);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `tree`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
      return null;
    }
    tree = stripParentheses(tree);
    Type type = ASTHelpers.getType(tree);
    Object value;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `state`
in `check_api/src/main/java/com/google/errorprone/matchers/Enclosing.java`
#### Snippet
```java
      }
      Tree enclosing = pathToEnclosing.getLeaf();
      state = state.withPath(pathToEnclosing);
      if (enclosing instanceof BlockTree) {
        return blockTreeMatcher.matches((BlockTree) enclosing, state);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `line`
in `test_helpers/src/main/java/com/google/errorprone/DiagnosticTestHelper.java`
#### Snippet
```java
    String restOfLine = line.substring(bugMarkerIndex + matchString.length()).trim();
    result.add(restOfLine);
    line = reader.readLine().trim();
    while (line.startsWith("//")) {
      restOfLine = line.substring(2).trim();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `line`
in `test_helpers/src/main/java/com/google/errorprone/DiagnosticTestHelper.java`
#### Snippet
```java
      restOfLine = line.substring(2).trim();
      result.add(restOfLine);
      line = reader.readLine().trim();
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `sym`
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
          return sym.getSimpleName().toString();
        }
        sym = ((ClassSymbol) sym).getSuperclass().tsym;
      }
    }
```

## RuleId[ruleID=UnnecessaryContinue]
### RuleId[ruleID=UnnecessaryContinue]
`continue` is unnecessary as the last statement in a loop
in `core/src/main/java/com/google/errorprone/bugpatterns/ChainedAssertionLosesContext.java`
#### Snippet
```java
      MethodInvocationTree maybeThatCall = (MethodInvocationTree) leaf;
      if (WITH_MESSAGE_OR_ABOUT.matches(maybeThatCall, state)) {
        continue;
      } else if (SUBJECT_BUILDER_THAT.matches(maybeThatCall, state)) {
        return maybeThatCall;
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/errorprone/refaster/UVariableDecl.java`
#### Snippet
```java
  @Override
  public ExpressionTree getNameExpression() {
    return null;
  }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/errorprone/refaster/UVariableDecl.java`
#### Snippet
```java
  @Override
  public ModifiersTree getModifiers() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/errorprone/refaster/UClassDecl.java`
#### Snippet
```java
  @Override
  public UTree<?> getExtendsClause() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/errorprone/refaster/UClassDecl.java`
#### Snippet
```java
  @Override
  public Name getSimpleName() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/errorprone/refaster/UClassDecl.java`
#### Snippet
```java
  @Override
  public ModifiersTree getModifiers() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/errorprone/refaster/UInstanceOf.java`
#### Snippet
```java
                    case "getPattern":
                      // TODO(cushon): support refaster template matching on instanceof patterns
                      return null;
                    case "getExpression":
                      return getExpression();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/errorprone/refaster/UMethodDecl.java`
#### Snippet
```java
  @Override
  public VariableTree getReceiverParameter() {
    return null;
  }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/errorprone/refaster/UMethodDecl.java`
#### Snippet
```java
  @Override
  public UTree<?> getDefaultValue() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/errorprone/refaster/UPlaceholderExpression.java`
#### Snippet
```java
      public <T extends JCTree> T copy(T tree, Inliner inliner) {
        if (tree == null) {
          return null;
        }
        T result = super.copy(tree, inliner);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/errorprone/bugpatterns/NonCanonicalType.java`
#### Snippet
```java
    Symbol sym = getSymbol(tree);
    if (sym == null) {
      return null;
    }
    if ((sym instanceof Symbol.MethodSymbol || sym instanceof Symbol.VarSymbol) && !isStatic(sym)) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/errorprone/bugpatterns/NonCanonicalType.java`
#### Snippet
```java
    }
    if ((sym instanceof Symbol.MethodSymbol || sym instanceof Symbol.VarSymbol) && !isStatic(sym)) {
      return null;
    }
    return sym.owner.getQualifiedName() + "." + sym.getSimpleName();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/errorprone/bugpatterns/CanonicalDuration.java`
#### Snippet
```java
        allInvocationsInParentExpression.stream()
            .map(t -> getOnlyElement(t.getArguments()))
            .map(arg -> entirelyLiterals(arg) ? arg : null)
            .map(arg -> constValue(arg, Number.class))
            .collect(toList());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/errorprone/bugpatterns/formatstring/FormatStringValidation.java`
#### Snippet
```java
                  } catch (RuntimeException t) {
                    // ignore symbol completion failures
                    return null;
                  }
                })
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedByExpression.java`
#### Snippet
```java
    @Override
    public Symbol sym() {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedByExpression.java`
#### Snippet
```java
    @Override
    public Type type() {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedByExpression.java`
#### Snippet
```java
    @Override
    public Symbol sym() {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedByExpression.java`
#### Snippet
```java
    @Override
    public Type type() {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/DoubleCheckedLocking.java`
#### Snippet
```java
              }
            }
            return null;
          }
        },
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/DoubleCheckedLocking.java`
#### Snippet
```java
              return clazz.cast(node);
            }
            return null;
          }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedBySymbolResolver.java`
#### Snippet
```java
      Class<T> type, ElementKind kind, Symbol classSymbol, String name) {
    if (classSymbol.type == null) {
      return null;
    }
    for (Type t : types.closure(classSymbol.type)) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedBySymbolResolver.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
    @Override
    public Type visitClass(ClassTree node, Void unused) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
    @Override
    public Type visitAnnotation(AnnotationTree tree, Void unused) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
    @Override
    public Type visitMethod(MethodTree node, Void unused) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `check_api/src/main/java/com/google/errorprone/bugpatterns/BugChecker.java`
#### Snippet
```java
    @Override
    public A scan(Tree tree, B b) {
      return suppressed(tree) ? null : super.scan(tree, b);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `check_api/src/main/java/com/google/errorprone/bugpatterns/BugChecker.java`
#### Snippet
```java
    @Override
    public A scan(TreePath treePath, B b) {
      return suppressed(treePath.getLeaf()) ? null : super.scan(treePath, b);
    }

```

## RuleId[ruleID=AssignmentToLambdaParameter]
### RuleId[ruleID=AssignmentToLambdaParameter]
Assignment to lambda parameter `tree`
in `check_api/src/main/java/com/google/errorprone/matchers/method/BaseMethodMatcher.java`
#### Snippet
```java
        }
        if (tree instanceof MethodInvocationTree) {
          tree = ((MethodInvocationTree) tree).getMethodSelect();
        }
        return MethodMatchState.create(tree, (MethodSymbol) sym);
```

### RuleId[ruleID=AssignmentToLambdaParameter]
Assignment to lambda parameter `state`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
      while (path != null) {
        Tree node = path.getLeaf();
        state = state.withPath(path);
        if (matcher.matches(node, state)) {
          return true;
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `fix` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/HashtableContains.java`
#### Snippet
```java
    String replacement =
        source.substring(0, idx) + newName + source.substring(idx + "contains".length());
    Fix fix = SuggestedFix.replace(tree.getMethodSelect(), replacement);
    return fix;
  }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `description` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/InsecureCipherMode.java`
#### Snippet
```java
  @Override
  public Description matchMethodInvocation(MethodInvocationTree tree, VisitorState state) {
    Description description = checkInvocation(tree, state);

    return description;
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `fix` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryTypeArgument.java`
#### Snippet
```java
    verify(source.charAt(lower) == '<' && source.charAt(upper) == '>');

    Fix fix = SuggestedFix.replace(startAbsolute + lower, startAbsolute + upper + 1, "");
    return fix;
  }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `shortCallWithoutNew` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/CheckReturnValue.java`
#### Snippet
```java
    MethodSymbol symbol = getSymbol(tree);
    String shortCall = symbol.name + (tree.getArguments().isEmpty() ? "()" : "(...)");
    String shortCallWithoutNew = shortCall;
    return describeInvocationResultIgnored(tree, shortCall, shortCallWithoutNew, symbol, state);
  }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `pairings` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/MissingTestCall.java`
#### Snippet
```java
  @Override
  public Description matchMethod(MethodTree tree, VisitorState state) {
    ImmutableSet<MethodPairing> pairings = PAIRINGS;

    Set<MethodPairing> required = new HashSet<>();
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `mockitoCall` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/MockitoUsage.java`
#### Snippet
```java
  private static void buildFix(
      Description.Builder builder, MethodInvocationTree tree, VisitorState state) {
    MethodInvocationTree mockitoCall = tree;
    List<? extends ExpressionTree> args = mockitoCall.getArguments();
    Tree mock = mockitoCall.getArguments().get(0);
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `result` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/formatstring/StrictFormatStringValidation.java`
#### Snippet
```java

    // Scan down from the scope where the variable was declared
    ValidationResult result =
        path.getLeaf()
            .accept(
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `result` is redundant
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/AbstractNullnessPropagationTransfer.java`
#### Snippet
```java
     * performed in the store so that they are available to future reads.
     */
    Nullness result = BOTTOM;
    return updateRegularStore(result, input, updates);
  }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `expressionTree` is redundant
in `check_api/src/main/java/com/google/errorprone/matchers/AnnotationMatcherUtils.java`
#### Snippet
```java
        continue;
      }
      ExpressionTree expressionTree = assignmentTree.getExpression();
      return expressionTree;
    }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `transformed` is redundant
in `test_helpers/src/main/java/com/google/errorprone/BugCheckerRefactoringTestHelper.java`
#### Snippet
```java
    diff.applyDifferences(sourceFile);

    JavaFileObject transformed =
        JavaFileObjects.forSourceString(getFullyQualifiedName(tree), sourceFile.getSourceText());
    return transformed;
```

## RuleId[ruleID=CastCanBeRemovedNarrowingVariableType]
### RuleId[ruleID=CastCanBeRemovedNarrowingVariableType]
Cast may be removed by changing the type of 'expression' to 'MethodInvocationTree'
in `core/src/main/java/com/google/errorprone/bugpatterns/RedundantOverride.java`
#### Snippet
```java
      return NO_MATCH;
    }
    MethodInvocationTree methodInvocationTree = (MethodInvocationTree) expression;
    if (!getSymbol(methodInvocationTree).equals(superMethod)) {
      return NO_MATCH;
```

### RuleId[ruleID=CastCanBeRemovedNarrowingVariableType]
Cast may be removed by changing the type of 'treeInstance' to 'InstanceOfTree'
in `core/src/main/java/com/google/errorprone/bugpatterns/InstanceOfAndCastMatchWrongType.java`
#### Snippet
```java

        Types types = state.getTypes();
        InstanceOfTree instanceOfTree = (InstanceOfTree) treeInstance;
        nodeToReplace = instanceOfTree.getType();

```

## RuleId[ruleID=UnstableApiUsage]
### RuleId[ruleID=UnstableApiUsage]
'TypeToken(java.lang.Class)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `core/src/main/java/com/google/errorprone/refaster/Bindings.java`
#### Snippet
```java

    TypeToken<V> getValueType() {
      return new TypeToken<V>(getClass()) {};
    }

```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/refaster/Bindings.java`
#### Snippet
```java

    TypeToken<V> getValueType() {
      return new TypeToken<V>(getClass()) {};
    }

```

### RuleId[ruleID=UnstableApiUsage]
'getRawType()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `core/src/main/java/com/google/errorprone/refaster/Bindings.java`
#### Snippet
```java
    checkNotNull(key, "key");
    checkNotNull(value, "value");
    return super.put(key, key.getValueType().getRawType().cast(value));
  }

```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/refaster/Bindings.java`
#### Snippet
```java
    }

    TypeToken<V> getValueType() {
      return new TypeToken<V>(getClass()) {};
    }
```

### RuleId[ruleID=UnstableApiUsage]
'TypeToken()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
    }
    try {
      return asSubclass(Class.forName(name), new TypeToken<Matcher<? super ExpressionTree>>() {});
    } catch (ClassNotFoundException | ClassCastException e) {
      throw new RuntimeException(e);
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
    }
    try {
      return asSubclass(Class.forName(name), new TypeToken<Matcher<? super ExpressionTree>>() {});
    } catch (ClassNotFoundException | ClassCastException e) {
      throw new RuntimeException(e);
```

### RuleId[ruleID=UnstableApiUsage]
'TypeToken()' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
    }
    try {
      return asSubclass(Class.forName(name), new TypeToken<Matcher<? super ExpressionTree>>() {});
    } catch (ClassNotFoundException | ClassCastException e) {
      throw new RuntimeException(e);
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
    }
    try {
      return asSubclass(Class.forName(name), new TypeToken<Matcher<? super ExpressionTree>>() {});
    } catch (ClassNotFoundException | ClassCastException e) {
      throw new RuntimeException(e);
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java

  /**
   * Similar to {@link Class#asSubclass(Class)}, but it accepts a {@link TypeToken} so it handles
   * generics better.
   */
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.reflect.TypeToken' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
   */
  @SuppressWarnings("unchecked")
  private static <T> Class<? extends T> asSubclass(Class<?> klass, TypeToken<T> token) {
    if (!token.isSupertypeOf(klass)) {
      throw new ClassCastException(klass + " is not assignable to " + token);
```

### RuleId[ruleID=UnstableApiUsage]
'isSupertypeOf(java.lang.reflect.Type)' is declared in unstable class 'com.google.common.reflect.TypeToken' marked with @Beta
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
  @SuppressWarnings("unchecked")
  private static <T> Class<? extends T> asSubclass(Class<?> klass, TypeToken<T> token) {
    if (!token.isSupertypeOf(klass)) {
      throw new ClassCastException(klass + " is not assignable to " + token);
    }
```

### RuleId[ruleID=UnstableApiUsage]
'presentInstances(java.lang.Iterable\>)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/refaster/Choice.java`
#### Snippet
```java
      @Override
      protected Iterator<R> iterator() {
        return Optional.presentInstances(Iterables.transform(thisChoice.asIterable(), function))
            .iterator();
      }
```

### RuleId[ruleID=UnstableApiUsage]
'getCauseAs(java.lang.Throwable, java.lang.Class)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
          return;
        } catch (InvocationTargetException e) {
          throw Throwables.getCauseAs(e.getCause(), NumberFormatException.class);
        }
      }
```

### RuleId[ruleID=UnstableApiUsage]
'stream(java.util.Optional)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableMemberCollection.java`
#### Snippet
```java
            .filter(member -> !isSuppressed(member, state))
            .map(VariableTree.class::cast)
            .flatMap(varTree -> stream(isReplaceable(varTree, state)))
            .collect(toImmutableMap(ReplaceableVar::symbol, var -> var));
    if (replaceableVars.isEmpty()) {
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java
  }

  private static ImmutableRangeSet<Integer> commentsAndLiterals(VisitorState state, String source) {
    ImmutableList<ErrorProneToken> tokens = getTokens(source, state.context);
    return ImmutableRangeSet.unionOf(
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java
  private static ImmutableRangeSet<Integer> commentsAndLiterals(VisitorState state, String source) {
    ImmutableList<ErrorProneToken> tokens = getTokens(source, state.context);
    return ImmutableRangeSet.unionOf(
        concat(
                tokens.stream()
```

### RuleId[ruleID=UnstableApiUsage]
'unionOf(java.lang.Iterable\>)' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java
  private static ImmutableRangeSet<Integer> commentsAndLiterals(VisitorState state, String source) {
    ImmutableList<ErrorProneToken> tokens = getTokens(source, state.context);
    return ImmutableRangeSet.unionOf(
        concat(
                tokens.stream()
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java
  @Override
  public Description matchCompilationUnit(CompilationUnitTree tree, VisitorState state) {
    RangeSet<Integer> violations = TreeRangeSet.create();
    String sourceCode = state.getSourceCode().toString();

```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java
  @Override
  public Description matchCompilationUnit(CompilationUnitTree tree, VisitorState state) {
    RangeSet<Integer> violations = TreeRangeSet.create();
    String sourceCode = state.getSourceCode().toString();

```

### RuleId[ruleID=UnstableApiUsage]
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java
  @Override
  public Description matchCompilationUnit(CompilationUnitTree tree, VisitorState state) {
    RangeSet<Integer> violations = TreeRangeSet.create();
    String sourceCode = state.getSourceCode().toString();

```

### RuleId[ruleID=UnstableApiUsage]
'add(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java
    for (int i = 0; i < sourceCode.length(); ++i) {
      if (!isAcceptableAscii(sourceCode, i)) {
        violations.add(Range.closedOpen(i, i + 1));
      }
    }
```

### RuleId[ruleID=UnstableApiUsage]
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java
    }

    if (violations.isEmpty()) {
      return NO_MATCH;
    }
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java
    }

    ImmutableRangeSet<Integer> permissibleUnicodeRegions =
        suppressedRegions(state).union(commentsAndLiterals(state, sourceCode));

```

### RuleId[ruleID=UnstableApiUsage]
'union(com.google.common.collect.RangeSet)' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java

    ImmutableRangeSet<Integer> permissibleUnicodeRegions =
        suppressedRegions(state).union(commentsAndLiterals(state, sourceCode));

    for (var range : violations.asDescendingSetOfRanges()) {
```

### RuleId[ruleID=UnstableApiUsage]
'asDescendingSetOfRanges()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java
        suppressedRegions(state).union(commentsAndLiterals(state, sourceCode));

    for (var range : violations.asDescendingSetOfRanges()) {
      if (!permissibleUnicodeRegions.encloses(range)) {
        state.reportMatch(
```

### RuleId[ruleID=UnstableApiUsage]
'encloses(com.google.common.collect.Range)' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java

    for (var range : violations.asDescendingSetOfRanges()) {
      if (!permissibleUnicodeRegions.encloses(range)) {
        state.reportMatch(
            buildDescription(new FixedPosition(tree, range.lowerEndpoint()))
```

### RuleId[ruleID=UnstableApiUsage]
'escape(java.lang.String)' is declared in unstable class 'com.google.common.escape.CharEscaper' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java
                            + " literals, as they can be confusing.",
                        javaCharEscaper()
                            .escape(
                                sourceCode.substring(
                                    range.lowerEndpoint(), range.upperEndpoint()))))
```

### RuleId[ruleID=UnstableApiUsage]
'zip(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiFunction)' is marked unstable with @Beta**
in `core/src/main/java/com/google/errorprone/bugpatterns/DoNotClaimAnnotations.java`
#### Snippet
```java
      return NO_MATCH;
    }
    if (!Streams.zip(
            sym.getParameters().stream(),
            PARAMETER_TYPES.get(state).stream(),
```

### RuleId[ruleID=UnstableApiUsage]
'getNameWithoutExtension(java.lang.String)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/ClassName.java`
#### Snippet
```java
      return Description.NO_MATCH;
    }
    String filename = Files.getNameWithoutExtension(ASTHelpers.getFileName(tree));
    List<String> names = new ArrayList<>();
    for (Tree member : tree.getTypeDecls()) {
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/SuppressWarningsWithoutExplanation.java`
#### Snippet
```java
      return NO_MATCH;
    }
    ImmutableRangeSet<Long> linesWithComments = linesWithComments(state);
    new SuppressibleTreePathScanner<Void, Void>(state) {
      @Override
```

### RuleId[ruleID=UnstableApiUsage]
'intersects(com.google.common.collect.Range)' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/SuppressWarningsWithoutExplanation.java`
#### Snippet
```java
                lineMap.getLineNumber(getStartPosition(parent)) - 1,
                lineMap.getLineNumber(state.getEndPosition(parent)) + 1);
        if (!linesWithComments.intersects(linesCovered)) {
          state.reportMatch(
              describeMatch(
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/SuppressWarningsWithoutExplanation.java`
#### Snippet
```java
  }

  private static ImmutableRangeSet<Long> linesWithComments(VisitorState state) {
    RangeSet<Long> lines = TreeRangeSet.create();
    ErrorProneTokens tokens = new ErrorProneTokens(state.getSourceCode().toString(), state.context);
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/SuppressWarningsWithoutExplanation.java`
#### Snippet
```java

  private static ImmutableRangeSet<Long> linesWithComments(VisitorState state) {
    RangeSet<Long> lines = TreeRangeSet.create();
    ErrorProneTokens tokens = new ErrorProneTokens(state.getSourceCode().toString(), state.context);
    LineMap lineMap = tokens.getLineMap();
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/SuppressWarningsWithoutExplanation.java`
#### Snippet
```java

  private static ImmutableRangeSet<Long> linesWithComments(VisitorState state) {
    RangeSet<Long> lines = TreeRangeSet.create();
    ErrorProneTokens tokens = new ErrorProneTokens(state.getSourceCode().toString(), state.context);
    LineMap lineMap = tokens.getLineMap();
```

### RuleId[ruleID=UnstableApiUsage]
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/SuppressWarningsWithoutExplanation.java`
#### Snippet
```java

  private static ImmutableRangeSet<Long> linesWithComments(VisitorState state) {
    RangeSet<Long> lines = TreeRangeSet.create();
    ErrorProneTokens tokens = new ErrorProneTokens(state.getSourceCode().toString(), state.context);
    LineMap lineMap = tokens.getLineMap();
```

### RuleId[ruleID=UnstableApiUsage]
'add(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/SuppressWarningsWithoutExplanation.java`
#### Snippet
```java
    for (ErrorProneToken token : tokens.getTokens()) {
      for (Comment comment : token.comments()) {
        lines.add(
            Range.closed(
                lineMap.getLineNumber(comment.getSourcePos(0)),
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/SuppressWarningsWithoutExplanation.java`
#### Snippet
```java
      }
    }
    return ImmutableRangeSet.copyOf(lines);
  }
}
```

### RuleId[ruleID=UnstableApiUsage]
'copyOf(com.google.common.collect.RangeSet)' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/SuppressWarningsWithoutExplanation.java`
#### Snippet
```java
      }
    }
    return ImmutableRangeSet.copyOf(lines);
  }
}
```

### RuleId[ruleID=UnstableApiUsage]
'findLast(java.util.stream.Stream)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryAssignment.java`
#### Snippet
```java
            getTokens(source, getStartPosition(tree), state.context);
        int equalsPos =
            findLast(tokens.stream().filter(t -> t.kind().equals(TokenKind.EQ))).get().pos();
        description.addFix(
            SuggestedFix.builder()
```

### RuleId[ruleID=UnstableApiUsage]
'splitToStream(java.lang.CharSequence)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/JUnitParameterMethodNotFound.java`
#### Snippet
```java
        String paramMethods =
            (String) ASTHelpers.constValue(paramMethodAssignmentTree.get().getExpression());
        Splitter.on(',').trimResults().splitToStream(paramMethods).forEach(requiredMethods::add);

        // If source argument is present in the annotation the method should be searched in the
```

### RuleId[ruleID=UnstableApiUsage]
'zip(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiFunction)' is marked unstable with @Beta**
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedException.java`
#### Snippet
```java

  private static boolean typesEqual(List<Type> typesA, List<Type> typesB, VisitorState state) {
    return Streams.zip(
            typesA.stream(), typesB.stream(), (a, b) -> ASTHelpers.isSameType(a, b, state))
        .allMatch(x -> x);
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              com.google.common.collect.ImmutableMultiset.class.getName())
          .put(
              com.google.common.collect.RangeMap.class.getName(),
              com.google.common.collect.ImmutableRangeMap.class.getName())
          .put(
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.ImmutableRangeMap' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
          .put(
              com.google.common.collect.RangeMap.class.getName(),
              com.google.common.collect.ImmutableRangeMap.class.getName())
          .put(
              com.google.common.collect.RangeSet.class.getName(),
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
              com.google.common.collect.ImmutableRangeMap.class.getName())
          .put(
              com.google.common.collect.RangeSet.class.getName(),
              com.google.common.collect.ImmutableRangeSet.class.getName())
          .put(
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableCollections.java`
#### Snippet
```java
          .put(
              com.google.common.collect.RangeSet.class.getName(),
              com.google.common.collect.ImmutableRangeSet.class.getName())
          .put(
              com.google.common.collect.SetMultimap.class.getName(),
```

### RuleId[ruleID=UnstableApiUsage]
'forEachEntry(java.util.function.ObjIntConsumer)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMustBeClosedChecker.java`
#### Snippet
```java
      return NO_MATCH;
    }
    closeBraceLocations.forEachEntry((t, count) -> fixBuilder.postfixWith(t, "}".repeat(count)));
    return describeMatch(firstIssuedFixLocation[0], fixBuilder.build());
  }
```

### RuleId[ruleID=UnstableApiUsage]
'zip(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiFunction)' is marked unstable with @Beta**
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryLambda.java`
#### Snippet
```java
    replacement.append(String.format(" %s %s(", prettyType(state, fix, fi.getReturnType()), name));
    replacement.append(
        Streams.zip(
                fi.getParameterTypes().stream(),
                lambda.getParameters().stream(),
```

### RuleId[ruleID=UnstableApiUsage]
'splitToStream(java.lang.CharSequence)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/MemberName.java`
#### Snippet
```java
        CaseFormat.LOWER_CAMEL,
        UNDERSCORE_SPLITTER
            .splitToStream(name)
            .map(c -> CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, c))
            .collect(joining("")));
```

### RuleId[ruleID=UnstableApiUsage]
'asMap(com.google.common.collect.ListMultimap)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/PreferredInterfaceType.java`
#### Snippet
```java
      VisitorState state) {
    Types types = state.getTypes();
    for (Map.Entry<Symbol, List<Type>> entry : asMap(symbolsToType).entrySet()) {
      Symbol symbol = entry.getKey();
      List<Type> assignedTypes = entry.getValue();
```

### RuleId[ruleID=UnstableApiUsage]
'forEachPair(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiConsumer)' is marked unstable with @Beta**
in `core/src/main/java/com/google/errorprone/bugpatterns/ParameterComment.java`
#### Snippet
```java
    }
    SuggestedFix.Builder fix = SuggestedFix.builder();
    forEachPair(
        arguments.stream(),
        Stream.concat(
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeEscape.java`
#### Snippet
```java
    private final String source;
    private final VisitorState state;
    private final Supplier<ImmutableRangeSet<Integer>> suppressedRegions =
        memoize(() -> suppressedRegions(getState()));

```

### RuleId[ruleID=UnstableApiUsage]
'asMap(com.google.common.collect.ListMultimap)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedMethod.java`
#### Snippet
```java
  private void fixConstructors(
      ImmutableListMultimap<Symbol, TreePath> unusedConstructors, VisitorState state) {
    for (Map.Entry<Symbol, List<TreePath>> entry : asMap(unusedConstructors).entrySet()) {
      Symbol symbol = entry.getKey();
      List<TreePath> trees = entry.getValue();
```

### RuleId[ruleID=UnstableApiUsage]
'forEachPair(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiConsumer)' is marked unstable with @Beta**
in `core/src/main/java/com/google/errorprone/bugpatterns/BooleanParameter.java`
#### Snippet
```java
    int end = state.getEndPosition(getLast(arguments));
    Deque<ErrorProneToken> tokens = new ArrayDeque<>(state.getOffsetTokens(start, end));
    forEachPair(
        sym.getParameters().stream(),
        arguments.stream(),
```

### RuleId[ruleID=UnstableApiUsage]
'stream(java.util.Optional)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedVariable.java`
#### Snippet
```java
        specs.stream()
            .map(UnusedSpec::terminatingAssignment)
            .flatMap(Streams::stream)
            .filter(
                a ->
```

### RuleId[ruleID=UnstableApiUsage]
'zip(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiFunction)' is marked unstable with @Beta**
in `core/src/main/java/com/google/errorprone/bugpatterns/RobolectricShadowDirectlyOn.java`
#### Snippet
```java
        Streams.concat(
                Stream.of(state.getConstantExpression(symbol.getSimpleName().toString())),
                Streams.zip(
                    symbol.getParameters().stream(),
                    parent.getArguments().stream(),
```

### RuleId[ruleID=UnstableApiUsage]
'findLast(java.util.stream.Stream)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/ForOverrideChecker.java`
#### Snippet
```java
  @Nullable
  private static Type getOutermostClass(VisitorState state) {
    return findLast(
            stream(state.getPath())
                .filter(t -> t instanceof ClassTree)
```

### RuleId[ruleID=UnstableApiUsage]
'escape(java.lang.String)' is declared in unstable class 'com.google.common.escape.CharEscaper' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/StringSplitter.java`
#### Snippet
```java
      return String.format("onPattern(%s)", argSource);
    }
    String escaped = SourceCodeEscapers.javaCharEscaper().escape(regexAsLiteral.get());
    if (regexAsLiteral.get().length() == 1) {
      return String.format("on('%s')", escaped);
```

### RuleId[ruleID=UnstableApiUsage]
'getNameWithoutExtension(java.lang.String)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/DefaultPackage.java`
#### Snippet
```java
    }
    // module-info.* is a special file name so ignore it.
    if (Files.getNameWithoutExtension(ASTHelpers.getFileName(tree)).equals("module-info")) {
      return Description.NO_MATCH;
    }
```

### RuleId[ruleID=UnstableApiUsage]
'findLast(java.util.stream.Stream)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/MissingTestCall.java`
#### Snippet
```java
  @Nullable
  private static ExpressionTree getUltimateReceiver(ExpressionTree tree) {
    return findLast(streamReceivers(tree)).orElse(null);
  }

```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.util.concurrent.AsyncCallable' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/AsyncCallableReturnsNull.java`
#### Snippet
```java
public final class AsyncCallableReturnsNull extends AbstractAsyncTypeReturnsNull {
  public AsyncCallableReturnsNull() {
    super(AsyncCallable.class);
  }
}
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.util.concurrent.AsyncCallable' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/AsyncCallableReturnsNull.java`
#### Snippet
```java
import com.google.errorprone.BugPattern;

/** Checks that {@link AsyncCallable} implementations do not directly {@code return null}. */
@BugPattern(
    summary = "AsyncCallable should not return a null Future, only a Future whose result is null.",
```

### RuleId[ruleID=UnstableApiUsage]
'findLast(java.util.stream.Stream)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/AnnotationPosition.java`
#### Snippet
```java
    int firstModifierPos =
        modifierTokens.stream().findFirst().map(x -> x.pos()).orElse(Integer.MAX_VALUE);
    int lastModifierPos = Streams.findLast(modifierTokens.stream()).map(x -> x.endPos()).orElse(0);

    Description description =
```

### RuleId[ruleID=UnstableApiUsage]
'findLast(java.util.stream.Stream)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/LambdaFunctionalInterface.java`
#### Snippet
```java
  private static ClassTree getTopLevelClassTree(VisitorState state) {
    return (ClassTree)
        Streams.findLast(
                Streams.stream(state.getPath().iterator())
                    .filter((Tree t) -> t.getKind() == Kind.CLASS))
```

### RuleId[ruleID=UnstableApiUsage]
'stream(java.util.Iterator)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/LambdaFunctionalInterface.java`
#### Snippet
```java
    return (ClassTree)
        Streams.findLast(
                Streams.stream(state.getPath().iterator())
                    .filter((Tree t) -> t.getKind() == Kind.CLASS))
            .orElseThrow(() -> new IllegalArgumentException("No enclosing class found"));
```

### RuleId[ruleID=UnstableApiUsage]
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/time/TimeUnitMismatch.java`
#### Snippet
```java
   */
  private static ImmutableList<String> fixUnitCamelCase(List<String> words) {
    ImmutableList.Builder<String> out = ImmutableList.builderWithExpectedSize(words.size());
    int i = 0;
    for (i = 0; i < words.size() - 1; i++) {
```

### RuleId[ruleID=UnstableApiUsage]
'copyOf(java.lang.Iterable\>)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/time/TimeUnitMismatch.java`
#### Snippet
```java
  // TODO(cpovirk): Maybe also add things like "weeks?"
  private static final ImmutableMap<String, TimeUnit> UNIT_FOR_SUFFIX =
      ImmutableMap.copyOf(
          new ImmutableSetMultimap.Builder<TimeUnit, String>()
              .putAll(SECONDS, "sec", "secs", "second", "seconds")
```

### RuleId[ruleID=UnstableApiUsage]
'zip(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiFunction)' is marked unstable with @Beta**
in `core/src/main/java/com/google/errorprone/bugpatterns/TypeCompatibilityUtils.java`
#### Snippet
```java
    List<Type> rightGenericTypes = typeArgsAsSuper(rightType, superType, state);

    return Streams.zip(leftGenericTypes.stream(), rightGenericTypes.stream(), TypePair::new)
        // If we encounter an f-bound, skip that index's type when comparing the compatibility of
        // types to avoid infinite recursion:
```

### RuleId[ruleID=UnstableApiUsage]
'tryParse(java.lang.String)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/time/TimeUnitConversionChecker.java`
#### Snippet
```java

    // if we have a constant and can Long-parse it...
    Long constant = Longs.tryParse(String.valueOf(state.getSourceForNode(arg0)));
    if (constant != null) {
      long converted = invokeConversion(receiver.get(), methodName, constant);
```

### RuleId[ruleID=UnstableApiUsage]
'asType(javax.lang.model.element.Element)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/ElementPredicates.java`
#### Snippet
```java
  private static boolean hasAnyOfAnnotation(ExecutableElement input, List<String> annotations) {
    return input.getAnnotationMirrors().stream()
        .map(annotationMirror -> asType(annotationMirror.getAnnotationType().asElement()))
        .anyMatch(type -> typeInAnnotations(type, annotations));
  }
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.auto.common.MoreElements' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/guice/AssistedParameters.java`
#### Snippet
```java
  private static String valueFromAssistedAnnotation(VariableTree variableTree) {
    for (Compound c : ASTHelpers.getSymbol(variableTree).getAnnotationMirrors()) {
      if (MoreElements.asType(c.getAnnotationType().asElement())
          .getQualifiedName()
          .contentEquals(ASSISTED_ANNOTATION)) {
```

### RuleId[ruleID=UnstableApiUsage]
'asType(javax.lang.model.element.Element)' is declared in unstable class 'com.google.auto.common.MoreElements' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/guice/AssistedParameters.java`
#### Snippet
```java
  private static String valueFromAssistedAnnotation(VariableTree variableTree) {
    for (Compound c : ASTHelpers.getSymbol(variableTree).getAnnotationMirrors()) {
      if (MoreElements.asType(c.getAnnotationType().asElement())
          .getQualifiedName()
          .contentEquals(ASSISTED_ANNOTATION)) {
```

### RuleId[ruleID=UnstableApiUsage]
'asMap(com.google.common.collect.ListMultimap)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/guice/AssistedParameters.java`
#### Snippet
```java

      for (Map.Entry<String, List<VariableTree>> assistedValueToParameters :
          Multimaps.asMap(keyForAssistedVariable).entrySet()) {
        if (assistedValueToParameters.getValue().size() > 1) {
          conflicts.add(
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.base.Utf8' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/android/IsLoggableTagLength.java`
#### Snippet
```java

  private static boolean isValidTag(String tag) {
    return Utf8.encodedLength(tag) <= 23;
  }

```

### RuleId[ruleID=UnstableApiUsage]
'encodedLength(java.lang.CharSequence)' is declared in unstable class 'com.google.common.base.Utf8' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/android/IsLoggableTagLength.java`
#### Snippet
```java

  private static boolean isValidTag(String tag) {
    return Utf8.encodedLength(tag) <= 23;
  }

```

### RuleId[ruleID=UnstableApiUsage]
'findLast(java.util.stream.Stream)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/android/WakelockReleasedDangerously.java`
#### Snippet
```java
  private static ClassTree getTopLevelClass(VisitorState state) {
    return (ClassTree)
        Streams.findLast(
                Streams.stream(state.getPath().iterator())
                    .filter((Tree t) -> t.getKind() == Kind.CLASS))
```

### RuleId[ruleID=UnstableApiUsage]
'stream(java.util.Iterator)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/android/WakelockReleasedDangerously.java`
#### Snippet
```java
    return (ClassTree)
        Streams.findLast(
                Streams.stream(state.getPath().iterator())
                    .filter((Tree t) -> t.getKind() == Kind.CLASS))
            .orElseThrow(() -> new IllegalArgumentException("No enclosing class found"));
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.io.Resources' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/Java7ApiChecker.java`
#### Snippet
```java
      ApiDiffProto.Diff.Builder diffBuilder = ApiDiffProto.Diff.newBuilder();
      byte[] diffData =
          Resources.toByteArray(Resources.getResource(Java7ApiChecker.class, "7to11diff.binarypb"));
      diffBuilder
          .mergeFrom(diffData)
```

### RuleId[ruleID=UnstableApiUsage]
'toByteArray(java.net.URL)' is declared in unstable class 'com.google.common.io.Resources' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/Java7ApiChecker.java`
#### Snippet
```java
      ApiDiffProto.Diff.Builder diffBuilder = ApiDiffProto.Diff.newBuilder();
      byte[] diffData =
          Resources.toByteArray(Resources.getResource(Java7ApiChecker.class, "7to11diff.binarypb"));
      diffBuilder
          .mergeFrom(diffData)
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.io.Resources' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/Java7ApiChecker.java`
#### Snippet
```java
      ApiDiffProto.Diff.Builder diffBuilder = ApiDiffProto.Diff.newBuilder();
      byte[] diffData =
          Resources.toByteArray(Resources.getResource(Java7ApiChecker.class, "7to11diff.binarypb"));
      diffBuilder
          .mergeFrom(diffData)
```

### RuleId[ruleID=UnstableApiUsage]
'getResource(java.lang.Class, java.lang.String)' is declared in unstable class 'com.google.common.io.Resources' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/Java7ApiChecker.java`
#### Snippet
```java
      ApiDiffProto.Diff.Builder diffBuilder = ApiDiffProto.Diff.newBuilder();
      byte[] diffData =
          Resources.toByteArray(Resources.getResource(Java7ApiChecker.class, "7to11diff.binarypb"));
      diffBuilder
          .mergeFrom(diffData)
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.io.Resources' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/AndroidJdkLibsChecker.java`
#### Snippet
```java
    try {
      byte[] diffData =
          Resources.toByteArray(
              Resources.getResource(
                  AndroidJdkLibsChecker.class,
```

### RuleId[ruleID=UnstableApiUsage]
'toByteArray(java.net.URL)' is declared in unstable class 'com.google.common.io.Resources' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/AndroidJdkLibsChecker.java`
#### Snippet
```java
    try {
      byte[] diffData =
          Resources.toByteArray(
              Resources.getResource(
                  AndroidJdkLibsChecker.class,
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.io.Resources' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/AndroidJdkLibsChecker.java`
#### Snippet
```java
      byte[] diffData =
          Resources.toByteArray(
              Resources.getResource(
                  AndroidJdkLibsChecker.class,
                  allowJava8 ? "android_java8.binarypb" : "android.binarypb"));
```

### RuleId[ruleID=UnstableApiUsage]
'getResource(java.lang.Class, java.lang.String)' is declared in unstable class 'com.google.common.io.Resources' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/AndroidJdkLibsChecker.java`
#### Snippet
```java
      byte[] diffData =
          Resources.toByteArray(
              Resources.getResource(
                  AndroidJdkLibsChecker.class,
                  allowJava8 ? "android_java8.binarypb" : "android.binarypb"));
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.io.Resources' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/Java8ApiChecker.java`
#### Snippet
```java
    try {
      byte[] diffData =
          Resources.toByteArray(Resources.getResource(Java8ApiChecker.class, "8to11diff.binarypb"));
      ApiDiff diff =
          ApiDiff.fromProto(
```

### RuleId[ruleID=UnstableApiUsage]
'toByteArray(java.net.URL)' is declared in unstable class 'com.google.common.io.Resources' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/Java8ApiChecker.java`
#### Snippet
```java
    try {
      byte[] diffData =
          Resources.toByteArray(Resources.getResource(Java8ApiChecker.class, "8to11diff.binarypb"));
      ApiDiff diff =
          ApiDiff.fromProto(
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.io.Resources' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/Java8ApiChecker.java`
#### Snippet
```java
    try {
      byte[] diffData =
          Resources.toByteArray(Resources.getResource(Java8ApiChecker.class, "8to11diff.binarypb"));
      ApiDiff diff =
          ApiDiff.fromProto(
```

### RuleId[ruleID=UnstableApiUsage]
'getResource(java.lang.Class, java.lang.String)' is declared in unstable class 'com.google.common.io.Resources' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/Java8ApiChecker.java`
#### Snippet
```java
    try {
      byte[] diffData =
          Resources.toByteArray(Resources.getResource(Java8ApiChecker.class, "8to11diff.binarypb"));
      ApiDiff diff =
          ApiDiff.fromProto(
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
     * {@literal @}code tag put inside them to escape HTML.
     */
    private final RangeSet<Integer> preTags = TreeRangeSet.create();

    /**
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
     * {@literal @}code tag put inside them to escape HTML.
     */
    private final RangeSet<Integer> preTags = TreeRangeSet.create();

    /**
```

### RuleId[ruleID=UnstableApiUsage]
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
     * {@literal @}code tag put inside them to escape HTML.
     */
    private final RangeSet<Integer> preTags = TreeRangeSet.create();

    /**
```

### RuleId[ruleID=UnstableApiUsage]
'contains(C)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
    private Optional<Description> generateFix(String replacement) {
      int startPosition = getStartPosition(getCurrentPath().getLeaf(), state);
      if (emittedFixes.contains(startPosition)) {
        // We already emitted a fix surrounding this location.
        return Optional.empty();
```

### RuleId[ruleID=UnstableApiUsage]
'rangeContaining(C)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
        return Optional.empty();
      }
      Range<Integer> containingPre = preTags.rangeContaining(startPosition);
      if (containingPre == null) {
        return generics.contains(startPosition)
```

### RuleId[ruleID=UnstableApiUsage]
'contains(C)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
      Range<Integer> containingPre = preTags.rangeContaining(startPosition);
      if (containingPre == null) {
        return generics.contains(startPosition)
            ? Optional.of(replacementFix(replacement))
            : Optional.empty();
```

### RuleId[ruleID=UnstableApiUsage]
'intersects(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
            : Optional.empty();
      }
      if (emittedFixes.intersects(containingPre)) {
        return Optional.empty();
      }
```

### RuleId[ruleID=UnstableApiUsage]
'add(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
      }

      emittedFixes.add(containingPre);

      SuggestedFix fix = wrapInCodeTag(containingPre);
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
    private EntityChecker(
        VisitorState state,
        RangeSet<Integer> generics,
        RangeSet<Integer> preTags,
        RangeSet<Integer> emittedFixes) {
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
        VisitorState state,
        RangeSet<Integer> generics,
        RangeSet<Integer> preTags,
        RangeSet<Integer> emittedFixes) {
      this.state = state;
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
        RangeSet<Integer> generics,
        RangeSet<Integer> preTags,
        RangeSet<Integer> emittedFixes) {
      this.state = state;
      this.generics = generics;
```

### RuleId[ruleID=UnstableApiUsage]
'add(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
            String source = state.getSourceCode().subSequence(startPos, endPos).toString();
            if (SHOULD_NOT_WRAP.matcher(source).find()) {
              dontEmitCodeFix.add(Range.closed(startPos, endPos));
            } else {
              preTags.add(Range.closed(startPos, endPos));
```

### RuleId[ruleID=UnstableApiUsage]
'add(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
              dontEmitCodeFix.add(Range.closed(startPos, endPos));
            } else {
              preTags.add(Range.closed(startPos, endPos));
            }
          }
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
    private final VisitorState state;
    private final RangeSet<Integer> generics;
    private final RangeSet<Integer> preTags;
    private final RangeSet<Integer> emittedFixes;

```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
    private final RangeSet<Integer> generics;
    private final RangeSet<Integer> preTags;
    private final RangeSet<Integer> emittedFixes;

    private EntityChecker(
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
  }

  private RangeSet<Integer> fixGenerics(
      RangeSet<Integer> generics,
      RangeSet<Integer> preTags,
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java

  private RangeSet<Integer> fixGenerics(
      RangeSet<Integer> generics,
      RangeSet<Integer> preTags,
      RangeSet<Integer> dontEmitCodeFix,
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
  private RangeSet<Integer> fixGenerics(
      RangeSet<Integer> generics,
      RangeSet<Integer> preTags,
      RangeSet<Integer> dontEmitCodeFix,
      VisitorState state) {
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
      RangeSet<Integer> generics,
      RangeSet<Integer> preTags,
      RangeSet<Integer> dontEmitCodeFix,
      VisitorState state) {
    RangeSet<Integer> emittedFixes = TreeRangeSet.create();
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
      RangeSet<Integer> dontEmitCodeFix,
      VisitorState state) {
    RangeSet<Integer> emittedFixes = TreeRangeSet.create();
    for (Range<Integer> range : generics.asRanges()) {
      if (emittedFixes.intersects(range) || dontEmitCodeFix.intersects(range)) {
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
      RangeSet<Integer> dontEmitCodeFix,
      VisitorState state) {
    RangeSet<Integer> emittedFixes = TreeRangeSet.create();
    for (Range<Integer> range : generics.asRanges()) {
      if (emittedFixes.intersects(range) || dontEmitCodeFix.intersects(range)) {
```

### RuleId[ruleID=UnstableApiUsage]
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
      RangeSet<Integer> dontEmitCodeFix,
      VisitorState state) {
    RangeSet<Integer> emittedFixes = TreeRangeSet.create();
    for (Range<Integer> range : generics.asRanges()) {
      if (emittedFixes.intersects(range) || dontEmitCodeFix.intersects(range)) {
```

### RuleId[ruleID=UnstableApiUsage]
'asRanges()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
      VisitorState state) {
    RangeSet<Integer> emittedFixes = TreeRangeSet.create();
    for (Range<Integer> range : generics.asRanges()) {
      if (emittedFixes.intersects(range) || dontEmitCodeFix.intersects(range)) {
        continue;
```

### RuleId[ruleID=UnstableApiUsage]
'intersects(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
    RangeSet<Integer> emittedFixes = TreeRangeSet.create();
    for (Range<Integer> range : generics.asRanges()) {
      if (emittedFixes.intersects(range) || dontEmitCodeFix.intersects(range)) {
        continue;
      }
```

### RuleId[ruleID=UnstableApiUsage]
'intersects(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
    RangeSet<Integer> emittedFixes = TreeRangeSet.create();
    for (Range<Integer> range : generics.asRanges()) {
      if (emittedFixes.intersects(range) || dontEmitCodeFix.intersects(range)) {
        continue;
      }
```

### RuleId[ruleID=UnstableApiUsage]
'rangeContaining(C)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
        continue;
      }
      Range<Integer> regionToWrap = preTags.rangeContaining(range.lowerEndpoint());
      if (regionToWrap == null) {
        regionToWrap = range;
```

### RuleId[ruleID=UnstableApiUsage]
'add(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
        regionToWrap = range;
      }
      emittedFixes.add(regionToWrap);
      state.reportMatch(
          buildDescription(getDiagnosticPosition(range.lowerEndpoint(), state.getPath().getLeaf()))
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
  private final class EntityChecker extends DocTreePathScanner<Void, Void> {
    private final VisitorState state;
    private final RangeSet<Integer> generics;
    private final RangeSet<Integer> preTags;
    private final RangeSet<Integer> emittedFixes;
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
     * already-escaped HTML.
     */
    private final RangeSet<Integer> dontEmitCodeFix = TreeRangeSet.create();

    private final Deque<Integer> startPosStack = new ArrayDeque<>();
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
     * already-escaped HTML.
     */
    private final RangeSet<Integer> dontEmitCodeFix = TreeRangeSet.create();

    private final Deque<Integer> startPosStack = new ArrayDeque<>();
```

### RuleId[ruleID=UnstableApiUsage]
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
     * already-escaped HTML.
     */
    private final RangeSet<Integer> dontEmitCodeFix = TreeRangeSet.create();

    private final Deque<Integer> startPosStack = new ArrayDeque<>();
```

### RuleId[ruleID=UnstableApiUsage]
'add(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
      int endPos = getEndPosition(tree, state);
      if (endPos != Position.NOPOS) {
        dontEmitCodeFix.add(Range.closed(getStartPosition(tree, state), endPos));
      }
    }
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
    Comment comment = ((DCDocComment) path.getDocComment()).comment;
    Matcher matcher = GENERIC_PATTERN.matcher(comment.getText());
    RangeSet<Integer> generics = TreeRangeSet.create();
    while (matcher.find()) {
      generics.add(
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
    Comment comment = ((DCDocComment) path.getDocComment()).comment;
    Matcher matcher = GENERIC_PATTERN.matcher(comment.getText());
    RangeSet<Integer> generics = TreeRangeSet.create();
    while (matcher.find()) {
      generics.add(
```

### RuleId[ruleID=UnstableApiUsage]
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
    Comment comment = ((DCDocComment) path.getDocComment()).comment;
    Matcher matcher = GENERIC_PATTERN.matcher(comment.getText());
    RangeSet<Integer> generics = TreeRangeSet.create();
    while (matcher.find()) {
      generics.add(
```

### RuleId[ruleID=UnstableApiUsage]
'add(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
    RangeSet<Integer> generics = TreeRangeSet.create();
    while (matcher.find()) {
      generics.add(
          Range.closedOpen(
              comment.getSourcePos(matcher.start()), comment.getSourcePos(matcher.end())));
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
              comment.getSourcePos(matcher.start()), comment.getSourcePos(matcher.end())));
    }
    RangeSet<Integer> emittedFixes =
        fixGenerics(generics, rangesFinder.preTags, rangesFinder.dontEmitCodeFix, state);
    new EntityChecker(state, generics, rangesFinder.preTags, emittedFixes).scan(path, null);
```

### RuleId[ruleID=UnstableApiUsage]
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/Inliner.java`
#### Snippet
```java
            Joiner.on(", ").join(callingVars.subList(varNames.size() - 1, callingVars.size()));
        callingVars =
            ImmutableList.<String>builderWithExpectedSize(varNames.size())
                .addAll(nonvarargs)
                .add(varargsJoined)
```

### RuleId[ruleID=UnstableApiUsage]
'forEachPair(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiConsumer)' is marked unstable with @Beta**
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullArgumentForNonNullParameter.java`
#### Snippet
```java
    }

    forEachPair(
        args.stream(),
        methodSymbol.getParameters().stream(),
```

### RuleId[ruleID=UnstableApiUsage]
'forEachPair(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiConsumer)' is marked unstable with @Beta**
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/ParameterMissingNullable.java`
#### Snippet
```java
    }

    forEachPair(
        arguments.stream(),
        methodSymbol.getParameters().stream(),
```

### RuleId[ruleID=UnstableApiUsage]
'escape(java.lang.String)' is declared in unstable class 'com.google.common.escape.CharEscaper' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/InlineMeData.java`
#### Snippet
```java
    String annotation =
        "@InlineMe(replacement = \""
            + SourceCodeEscapers.javaCharEscaper().escape(replacement)
            + "\"";
    if (!imports.isEmpty()) {
```

### RuleId[ruleID=UnstableApiUsage]
'lines()' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/ExternalCanIgnoreReturnValue.java`
#### Snippet
```java
  private static MethodPredicate configByParsingApiObjects(CharSource file) throws IOException {
    ImmutableSetMultimap<String, Api> apis;
    try (Stream<String> lines = file.lines()) {
      apis =
          lines
```

### RuleId[ruleID=UnstableApiUsage]
'lines()' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/ExternalCanIgnoreReturnValue.java`
#### Snippet
```java
    ImmutableSet<String> apis;
    // NB: No whitespace stripping here
    try (Stream<String> lines = file.lines()) {
      apis = lines.collect(toImmutableSet());
    }
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/ExternalCanIgnoreReturnValue.java`
#### Snippet
```java
      @Override
      MethodPredicate load(String file) throws IOException {
        return configByParsingApiObjects(MoreFiles.asCharSource(Paths.get(file), UTF_8));
      }
    };
```

### RuleId[ruleID=UnstableApiUsage]
'asCharSource(java.nio.file.Path, java.nio.charset.Charset, java.nio.file.OpenOption...)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/ExternalCanIgnoreReturnValue.java`
#### Snippet
```java
      @Override
      MethodPredicate load(String file) throws IOException {
        return configByParsingApiObjects(MoreFiles.asCharSource(Paths.get(file), UTF_8));
      }
    };
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/ExternalCanIgnoreReturnValue.java`
#### Snippet
```java
      @Override
      MethodPredicate load(String file) throws IOException {
        return configByInterpretingMethodsAsStrings(MoreFiles.asCharSource(Paths.get(file), UTF_8));
      }
    },
```

### RuleId[ruleID=UnstableApiUsage]
'asCharSource(java.nio.file.Path, java.nio.charset.Charset, java.nio.file.OpenOption...)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/ExternalCanIgnoreReturnValue.java`
#### Snippet
```java
      @Override
      MethodPredicate load(String file) throws IOException {
        return configByInterpretingMethodsAsStrings(MoreFiles.asCharSource(Paths.get(file), UTF_8));
      }
    },
```

### RuleId[ruleID=UnstableApiUsage]
'findLast(java.util.stream.Stream)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/NamedParameterComment.java`
#### Snippet
```java
  static MatchedComment match(Commented<ExpressionTree> actual, String formal) {
    Optional<Comment> lastBlockComment =
        Streams.findLast(
            actual.beforeComments().stream().filter(c -> c.getStyle() == CommentStyle.BLOCK));

```

### RuleId[ruleID=UnstableApiUsage]
'mapWithIndex(java.util.stream.Stream, com.google.common.collect.Streams.FunctionWithIndex)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/Parameter.java`
#### Snippet
```java
  static ImmutableList<Parameter> createListFromExpressionTrees(
      List<? extends ExpressionTree> trees) {
    return Streams.mapWithIndex(
            trees.stream(),
            (t, i) ->
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.Streams.FunctionWithIndex' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/Parameter.java`
#### Snippet
```java
    return Streams.mapWithIndex(
            trees.stream(),
            (t, i) ->
                new AutoValue_Parameter(
                    getArgumentName(t),
                    Optional.ofNullable(ASTHelpers.getResultType(t)).orElse(Type.noType),
                    (int) i,
                    t.toString(),
                    t.getKind(),
                    ASTHelpers.constValue(t) != null))
        .collect(toImmutableList());
  }
```

### RuleId[ruleID=UnstableApiUsage]
'mapWithIndex(java.util.stream.Stream, com.google.common.collect.Streams.FunctionWithIndex)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/Parameter.java`
#### Snippet
```java

  static ImmutableList<Parameter> createListFromVarSymbols(List<VarSymbol> varSymbols) {
    return Streams.mapWithIndex(
            varSymbols.stream(),
            (s, i) ->
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.Streams.FunctionWithIndex' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/Parameter.java`
#### Snippet
```java
    return Streams.mapWithIndex(
            varSymbols.stream(),
            (s, i) ->
                new AutoValue_Parameter(
                    s.getSimpleName().toString(),
                    s.asType(),
                    (int) i,
                    s.getSimpleName().toString(),
                    Kind.IDENTIFIER,
                    false))
        .collect(toImmutableList());
  }
```

### RuleId[ruleID=UnstableApiUsage]
'stream(java.util.Iterator)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableChecker.java`
#### Snippet
```java
  private static Optional<ClassSymbol> effectiveTypeOfThis(
      MethodSymbol symbol, TreePath currentPath, VisitorState state) {
    return stream(currentPath.iterator())
        .filter(ClassTree.class::isInstance)
        .map(t -> ASTHelpers.getSymbol((ClassTree) t))
```

### RuleId[ruleID=UnstableApiUsage]
'mapWithIndex(java.util.stream.Stream, com.google.common.collect.Streams.FunctionWithIndex)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TruthIncompatibleType.java`
#### Snippet
```java
            state.getTypes());
    MethodSymbol methodSymbol = getSymbol(tree);
    return Streams.mapWithIndex(
            tree.getArguments().stream(),
            (arg, index) ->
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.Streams.FunctionWithIndex' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TruthIncompatibleType.java`
#### Snippet
```java
    return Streams.mapWithIndex(
            tree.getArguments().stream(),
            (arg, index) ->
                isNonVarargsCall(methodSymbol, index, getType(arg))
                    ? Stream.<Description>empty()
                    : checkCompatibility(
                        arg, index % 2 == 0 ? targetKeyType : targetValueType, getType(arg), state))
        .flatMap(x -> x);
  }
```

### RuleId[ruleID=UnstableApiUsage]
'mapWithIndex(java.util.stream.Stream, com.google.common.collect.Streams.FunctionWithIndex)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TruthIncompatibleType.java`
#### Snippet
```java
            state);
    MethodSymbol methodSymbol = getSymbol(tree);
    return Streams.mapWithIndex(
            tree.getArguments().stream(),
            (arg, index) -> {
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.Streams.FunctionWithIndex' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TruthIncompatibleType.java`
#### Snippet
```java
    return Streams.mapWithIndex(
            tree.getArguments().stream(),
            (arg, index) -> {
              Type argumentType = getType(arg);
              return isNonVarargsCall(methodSymbol, index, argumentType)
                  ? checkCompatibility(arg, targetType, ((ArrayType) argumentType).elemtype, state)
                  : checkCompatibility(arg, targetType, argumentType, state);
            })
        .flatMap(x -> x);
  }
```

### RuleId[ruleID=UnstableApiUsage]
'readLines(com.google.common.io.LineProcessor)' is marked unstable with @Beta
in `docgen/src/main/java/com/google/errorprone/DocGenTool.java`
#### Snippet
```java
        Files.newBufferedWriter(wikiDir.resolve("bugpatterns.md"), StandardCharsets.UTF_8)) {
      List<BugPatternInstance> patterns =
          asCharSource(bugPatterns.toFile(), UTF_8).readLines(generator);
      new BugPatternIndexWriter().dump(patterns, w, options.target, enabledCheckNames());
    }
```

### RuleId[ruleID=UnstableApiUsage]
'zip(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiFunction)' is marked unstable with @Beta**
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafety.java`
#### Snippet
```java
      return info;
    }
    return Streams.zip(
            type.asElement().getTypeParameters().stream(),
            type.getTypeArguments().stream(),
```

### RuleId[ruleID=UnstableApiUsage]
'zip(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiFunction)' is marked unstable with @Beta**
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafety.java`
#### Snippet
```java
  public Violation checkInstantiation(
      Collection<TypeVariableSymbol> typeParameters, Collection<Type> typeArguments) {
    return Streams.zip(
            typeParameters.stream(),
            typeArguments.stream(),
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.io.LineProcessor' is marked unstable with @Beta
in `docgen/src/main/java/com/google/errorprone/BugPatternFileGenerator.java`
#### Snippet
```java
 * @author alexeagle@google.com (Alex Eagle)
 */
class BugPatternFileGenerator implements LineProcessor<List<BugPatternInstance>> {

  private final Path outputDir;
```

### RuleId[ruleID=UnstableApiUsage]
Overridden method 'processLine(java.lang.String)' is declared in unstable interface 'com.google.common.io.LineProcessor' marked with @Beta
in `docgen/src/main/java/com/google/errorprone/BugPatternFileGenerator.java`
#### Snippet
```java

  @Override
  public boolean processLine(String line) throws IOException {
    BugPatternInstance pattern = new Gson().fromJson(line, BugPatternInstance.class);
    pattern.severity = severityRemapper.apply(pattern);
```

### RuleId[ruleID=UnstableApiUsage]
Overridden method 'getResult()' is declared in unstable interface 'com.google.common.io.LineProcessor' marked with @Beta
in `docgen/src/main/java/com/google/errorprone/BugPatternFileGenerator.java`
#### Snippet
```java

  @Override
  public List<BugPatternInstance> getResult() {
    return result;
  }
```

### RuleId[ruleID=UnstableApiUsage]
'trueFirst()' is marked unstable with @Beta
in `docgen/src/main/java/com/google/errorprone/BugPatternIndexWriter.java`
#### Snippet
```java
    SortedSetMultimap<IndexEntry, MiniDescription> sorted =
        TreeMultimap.create(
            comparing(IndexEntry::onByDefault, trueFirst()).thenComparing(IndexEntry::severity),
            Comparator.comparing(MiniDescription::name));
    for (BugPatternInstance pattern : patterns) {
```

### RuleId[ruleID=UnstableApiUsage]
'asMap(com.google.common.collect.SortedSetMultimap)' is marked unstable with @Beta
in `docgen/src/main/java/com/google/errorprone/BugPatternIndexWriter.java`
#### Snippet
```java

    ImmutableList<Map<String, Object>> bugpatternData =
        Multimaps.asMap(sorted).entrySet().stream()
            .map(
                e ->
```

### RuleId[ruleID=UnstableApiUsage]
Overridden method 'escapeUnsafe(char)' is declared in unstable class 'com.google.common.escape.ArrayBasedCharEscaper' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/util/SourceCodeEscapers.java`
#### Snippet
```java

    @Override
    protected char[] escapeUnsafe(char c) {
      return asUnicodeHexEscape(c);
    }
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.escape.CharEscaper' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/util/SourceCodeEscapers.java`
#### Snippet
```java
  }

  private static final CharEscaper JAVA_CHAR_ESCAPER =
      new JavaCharEscaper(
          ImmutableMap.of(
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.escape.ArrayBasedCharEscaper' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/util/SourceCodeEscapers.java`
#### Snippet
```java
  //   only Unicode values \u0000 through \u00FF, so Unicode escapes are
  //   usually preferred."
  private static class JavaCharEscaper extends ArrayBasedCharEscaper {
    JavaCharEscaper(Map<Character, String> replacements) {
      super(replacements, PRINTABLE_ASCII_MIN, PRINTABLE_ASCII_MAX);
```

### RuleId[ruleID=UnstableApiUsage]
'ArrayBasedCharEscaper(java.util.Map, char, char)' is declared in unstable class 'com.google.common.escape.ArrayBasedCharEscaper' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/util/SourceCodeEscapers.java`
#### Snippet
```java
  private static class JavaCharEscaper extends ArrayBasedCharEscaper {
    JavaCharEscaper(Map<Character, String> replacements) {
      super(replacements, PRINTABLE_ASCII_MIN, PRINTABLE_ASCII_MAX);
    }

```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.escape.CharEscaper' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/util/SourceCodeEscapers.java`
#### Snippet
```java
   * >The Java Language Specification</a> for more details.
   */
  public static CharEscaper javaCharEscaper() {
    return JAVA_CHAR_ESCAPER;
  }
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/util/Comments.java`
#### Snippet
```java

    // Ignore comments nested inside arguments.
    TreeRangeSet<Integer> exclude = TreeRangeSet.create();
    arguments.forEach(
        arg ->
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/util/Comments.java`
#### Snippet
```java

    // Ignore comments nested inside arguments.
    TreeRangeSet<Integer> exclude = TreeRangeSet.create();
    arguments.forEach(
        arg ->
```

### RuleId[ruleID=UnstableApiUsage]
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/util/Comments.java`
#### Snippet
```java

    // Ignore comments nested inside arguments.
    TreeRangeSet<Integer> exclude = TreeRangeSet.create();
    arguments.forEach(
        arg ->
```

### RuleId[ruleID=UnstableApiUsage]
'add(com.google.common.collect.Range)' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/util/Comments.java`
#### Snippet
```java
    arguments.forEach(
        arg ->
            exclude.add(
                Range.closed(
                    getStartPosition(arg) - invocationStart,
```

### RuleId[ruleID=UnstableApiUsage]
'intersects(com.google.common.collect.Range)' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/util/Comments.java`
#### Snippet
```java
          int commentStart = comment.getPos();
          int commentEnd = comment.getEndPos();
          if (exclude.intersects(Range.closedOpen(commentStart, commentEnd))) {
            continue;
          }
```

### RuleId[ruleID=UnstableApiUsage]
'stream(java.util.Optional)' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/util/MoreAnnotations.java`
#### Snippet
```java
      @Override
      public Stream<T> visitArray(List<? extends AnnotationValue> vals, Void unused) {
        return vals.stream().map(mapper).flatMap(Streams::stream);
      }
    }
```

### RuleId[ruleID=UnstableApiUsage]
'splitToStream(java.lang.CharSequence)' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/names/NamingConventions.java`
#### Snippet
```java
    }
    return TERM_SPLITTER
        .splitToStream(identifierName)
        .map(String::toLowerCase)
        .collect(toImmutableList());
```

### RuleId[ruleID=UnstableApiUsage]
'subRangeMap(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeMap' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/fixes/Replacements.java`
#### Snippet
```java
    Range<Integer> replacementRange = replacement.range();
    Collection<Replacement> overlap =
        overlaps.subRangeMap(replacementRange).asMapOfRanges().values();
    checkArgument(
        overlap.isEmpty(),
```

### RuleId[ruleID=UnstableApiUsage]
'asMapOfRanges()' is declared in unstable interface 'com.google.common.collect.RangeMap' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/fixes/Replacements.java`
#### Snippet
```java
    Range<Integer> replacementRange = replacement.range();
    Collection<Replacement> overlap =
        overlaps.subRangeMap(replacementRange).asMapOfRanges().values();
    checkArgument(
        overlap.isEmpty(),
```

### RuleId[ruleID=UnstableApiUsage]
'put(com.google.common.collect.Range, V)' is declared in unstable interface 'com.google.common.collect.RangeMap' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/fixes/Replacements.java`
#### Snippet
```java
        replacement,
        Joiner.on(", ").join(containedZeroLengthRangeStarts));
    overlaps.put(replacementRange, replacement);
    if (replacementRange.isEmpty()) {
      zeroLengthRanges.add(replacementRange.lowerEndpoint());
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/fixes/Replacements.java`
#### Snippet
```java

  private final TreeMap<Range<Integer>, Replacement> replacements = new TreeMap<>(DESCENDING);
  private final RangeMap<Integer, Replacement> overlaps = TreeRangeMap.create();
  private final TreeSet<Integer> zeroLengthRanges = new TreeSet<>();

```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.TreeRangeMap' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/fixes/Replacements.java`
#### Snippet
```java

  private final TreeMap<Range<Integer>, Replacement> replacements = new TreeMap<>(DESCENDING);
  private final RangeMap<Integer, Replacement> overlaps = TreeRangeMap.create();
  private final TreeSet<Integer> zeroLengthRanges = new TreeSet<>();

```

### RuleId[ruleID=UnstableApiUsage]
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeMap' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/fixes/Replacements.java`
#### Snippet
```java

  private final TreeMap<Range<Integer>, Replacement> replacements = new TreeMap<>(DESCENDING);
  private final RangeMap<Integer, Replacement> overlaps = TreeRangeMap.create();
  private final TreeSet<Integer> zeroLengthRanges = new TreeSet<>();

```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.graph.Graph' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/InferredNullability.java`
#### Snippet
```java
  private final Map<InferenceVariable, Optional<Nullness>> inferredMemoTable = new HashMap<>();

  InferredNullability(Graph<InferenceVariable> constraints) {
    this.constraintGraph = ImmutableGraph.copyOf(constraints);
  }
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.graph.ImmutableGraph' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/InferredNullability.java`
#### Snippet
```java

  InferredNullability(Graph<InferenceVariable> constraints) {
    this.constraintGraph = ImmutableGraph.copyOf(constraints);
  }

```

### RuleId[ruleID=UnstableApiUsage]
'copyOf(com.google.common.graph.Graph)' is declared in unstable class 'com.google.common.graph.ImmutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/InferredNullability.java`
#### Snippet
```java

  InferredNullability(Graph<InferenceVariable> constraints) {
    this.constraintGraph = ImmutableGraph.copyOf(constraints);
  }

```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.graph.ImmutableGraph' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/InferredNullability.java`
#### Snippet
```java
 */
public class InferredNullability {
  private final ImmutableGraph<InferenceVariable> constraintGraph;

  private final Map<InferenceVariable, Optional<Nullness>> inferredMemoTable = new HashMap<>();
```

### RuleId[ruleID=UnstableApiUsage]
'forEachPair(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiConsumer)' is marked unstable with @Beta**
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java

      private void scan(Collection<Type> from, Collection<Type> to) {
        Streams.forEachPair(from.stream(), to.stream(), this::scan);
      }

```

### RuleId[ruleID=UnstableApiUsage]
'stream(java.util.Iterator)' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
   */
  public static Stream<ExpressionTree> streamReceivers(ExpressionTree tree) {
    return stream(
        new AbstractIterator<ExpressionTree>() {
          private ExpressionTree current = tree;
```

### RuleId[ruleID=UnstableApiUsage]
'putEdge(N, N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
              InferenceVariable var =
                  TypeArgInferenceVar.create(ImmutableList.copyOf(argSelector), sourceTree);
              qualifierConstraints.putEdge(var, annot);
              qualifierConstraints.putEdge(annot, var);
            });
```

### RuleId[ruleID=UnstableApiUsage]
'putEdge(N, N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
                  TypeArgInferenceVar.create(ImmutableList.copyOf(argSelector), sourceTree);
              qualifierConstraints.putEdge(var, annot);
              qualifierConstraints.putEdge(annot, var);
            });
  }
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.graph.MutableGraph' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
   * words, edges point "upwards" in the lattice towards Top == Nullable.
   */
  private final MutableGraph<InferenceVariable> qualifierConstraints;

  private final Tree currentMethodOrInitializerOrLambda;
```

### RuleId[ruleID=UnstableApiUsage]
'forEachPair(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiConsumer)' is marked unstable with @Beta**
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java

    // Generate constraints for each argument write.
    Streams.forEachPair(
        formalParameters.stream(),
        sourceNode.getArguments().stream(),
```

### RuleId[ruleID=UnstableApiUsage]
'putEdge(N, N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
                resRef ->
                    rcvrReferences.forEach(
                        rcvrRef -> qualifierConstraints.putEdge(resRef, rcvrRef)));
        Streams.forEachPair(
            formalParameters.stream(),
```

### RuleId[ruleID=UnstableApiUsage]
'forEachPair(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiConsumer)' is marked unstable with @Beta**
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
                    rcvrReferences.forEach(
                        rcvrRef -> qualifierConstraints.putEdge(resRef, rcvrRef)));
        Streams.forEachPair(
            formalParameters.stream(),
            node.getArguments().stream(),
```

### RuleId[ruleID=UnstableApiUsage]
'putEdge(N, N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
                        argRef ->
                            rcvrReferences.forEach(
                                rcvrRef -> qualifierConstraints.putEdge(argRef, rcvrRef))));
      }
    }
```

### RuleId[ruleID=UnstableApiUsage]
'putEdge(N, N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
          callee,
          node,
          iv -> qualifierConstraints.putEdge(typeVarIV, iv));
      Streams.forEachPair(
          formalParameters.stream(),
```

### RuleId[ruleID=UnstableApiUsage]
'forEachPair(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiConsumer)' is marked unstable with @Beta**
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
          node,
          iv -> qualifierConstraints.putEdge(typeVarIV, iv));
      Streams.forEachPair(
          formalParameters.stream(),
          node.getArguments().stream(),
```

### RuleId[ruleID=UnstableApiUsage]
'putEdge(N, N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
                  formal.symbol(),
                  actual,
                  iv -> qualifierConstraints.putEdge(iv, typeVarIV)));
    }
    return super.visitMethodInvocation(node, unused);
```

### RuleId[ruleID=UnstableApiUsage]
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
  private static ImmutableList<TypeAndSymbol> expandVarargsToArity(
      List<VarSymbol> formalArgs, int arity) {
    ImmutableList.Builder<TypeAndSymbol> result = ImmutableList.builderWithExpectedSize(arity);
    int numberOfVarArgs = arity - formalArgs.size() + 1;

```

### RuleId[ruleID=UnstableApiUsage]
'putEdge(N, N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
    // TODO(kmb): Consider just visiting these expression types
    if (rVal.getKind() == Kind.NULL_LITERAL) {
      qualifierConstraints.putEdge(
          ProperInferenceVar.NULL, TypeArgInferenceVar.create(ImmutableList.of(), rVal));
      qualifierConstraints.putEdge(
```

### RuleId[ruleID=UnstableApiUsage]
'putEdge(N, N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
      qualifierConstraints.putEdge(
          ProperInferenceVar.NULL, TypeArgInferenceVar.create(ImmutableList.of(), rVal));
      qualifierConstraints.putEdge(
          TypeArgInferenceVar.create(ImmutableList.of(), rVal), ProperInferenceVar.NULL);
    } else if ((rVal instanceof LiteralTree)
```

### RuleId[ruleID=UnstableApiUsage]
'putEdge(N, N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
        || ((rVal instanceof IdentifierTree)
            && ((IdentifierTree) rVal).getName().contentEquals("this"))) {
      qualifierConstraints.putEdge(
          ProperInferenceVar.NONNULL, TypeArgInferenceVar.create(ImmutableList.of(), rVal));
      qualifierConstraints.putEdge(
```

### RuleId[ruleID=UnstableApiUsage]
'putEdge(N, N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
      qualifierConstraints.putEdge(
          ProperInferenceVar.NONNULL, TypeArgInferenceVar.create(ImmutableList.of(), rVal));
      qualifierConstraints.putEdge(
          TypeArgInferenceVar.create(ImmutableList.of(), rVal), ProperInferenceVar.NONNULL);
    }
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.graph.GraphBuilder' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
  private NullnessQualifierInference(Tree currentMethodOrInitializerOrLambda) {
    this.currentMethodOrInitializerOrLambda = currentMethodOrInitializerOrLambda;
    this.qualifierConstraints = GraphBuilder.directed().build();

    // Initialize graph with standard nullness lattice; see ASCII art diagram in
```

### RuleId[ruleID=UnstableApiUsage]
'directed()' is declared in unstable class 'com.google.common.graph.GraphBuilder' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
  private NullnessQualifierInference(Tree currentMethodOrInitializerOrLambda) {
    this.currentMethodOrInitializerOrLambda = currentMethodOrInitializerOrLambda;
    this.qualifierConstraints = GraphBuilder.directed().build();

    // Initialize graph with standard nullness lattice; see ASCII art diagram in
```

### RuleId[ruleID=UnstableApiUsage]
'build()' is declared in unstable class 'com.google.common.graph.GraphBuilder' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
  private NullnessQualifierInference(Tree currentMethodOrInitializerOrLambda) {
    this.currentMethodOrInitializerOrLambda = currentMethodOrInitializerOrLambda;
    this.qualifierConstraints = GraphBuilder.directed().build();

    // Initialize graph with standard nullness lattice; see ASCII art diagram in
```

### RuleId[ruleID=UnstableApiUsage]
'putEdge(N, N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
    // Initialize graph with standard nullness lattice; see ASCII art diagram in
    // com.google.errorprone.dataflow.nullnesspropagation.Nullness for more details.
    qualifierConstraints.putEdge(ProperInferenceVar.BOTTOM, ProperInferenceVar.NONNULL);
    qualifierConstraints.putEdge(ProperInferenceVar.BOTTOM, ProperInferenceVar.NULL);
    qualifierConstraints.putEdge(ProperInferenceVar.NONNULL, ProperInferenceVar.NULLABLE);
```

### RuleId[ruleID=UnstableApiUsage]
'putEdge(N, N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
    // com.google.errorprone.dataflow.nullnesspropagation.Nullness for more details.
    qualifierConstraints.putEdge(ProperInferenceVar.BOTTOM, ProperInferenceVar.NONNULL);
    qualifierConstraints.putEdge(ProperInferenceVar.BOTTOM, ProperInferenceVar.NULL);
    qualifierConstraints.putEdge(ProperInferenceVar.NONNULL, ProperInferenceVar.NULLABLE);
    qualifierConstraints.putEdge(ProperInferenceVar.NULL, ProperInferenceVar.NULLABLE);
```

### RuleId[ruleID=UnstableApiUsage]
'putEdge(N, N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
    qualifierConstraints.putEdge(ProperInferenceVar.BOTTOM, ProperInferenceVar.NONNULL);
    qualifierConstraints.putEdge(ProperInferenceVar.BOTTOM, ProperInferenceVar.NULL);
    qualifierConstraints.putEdge(ProperInferenceVar.NONNULL, ProperInferenceVar.NULLABLE);
    qualifierConstraints.putEdge(ProperInferenceVar.NULL, ProperInferenceVar.NULLABLE);
  }
```

### RuleId[ruleID=UnstableApiUsage]
'putEdge(N, N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
    qualifierConstraints.putEdge(ProperInferenceVar.BOTTOM, ProperInferenceVar.NULL);
    qualifierConstraints.putEdge(ProperInferenceVar.NONNULL, ProperInferenceVar.NULLABLE);
    qualifierConstraints.putEdge(ProperInferenceVar.NULL, ProperInferenceVar.NULLABLE);
  }

```

### RuleId[ruleID=UnstableApiUsage]
'putEdge(N, N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
            annot -> {
              InferenceVariable var = TypeArgInferenceVar.create(argSelectorList, rVal);
              qualifierConstraints.putEdge(var, annot);
              if (!oneSided) {
                qualifierConstraints.putEdge(annot, var);
```

### RuleId[ruleID=UnstableApiUsage]
'putEdge(N, N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
              qualifierConstraints.putEdge(var, annot);
              if (!oneSided) {
                qualifierConstraints.putEdge(annot, var);
              }
            });
```

### RuleId[ruleID=UnstableApiUsage]
'putEdge(N, N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
    if (lVal != null) {
      // Constrain this type or type argument on the rVal to be <= its lVal counterpart
      qualifierConstraints.putEdge(
          TypeArgInferenceVar.create(argSelectorList, rVal),
          TypeArgInferenceVar.create(argSelectorList, lVal));
```

### RuleId[ruleID=UnstableApiUsage]
'putEdge(N, N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
                              .typeArgSelector()
                              .subList(depth, typeArg.typeArgSelector().size()));
                  qualifierConstraints.putEdge(typeVarComponent, typeArg);
                  qualifierConstraints.putEdge(typeArg, typeVarComponent);
                });
```

### RuleId[ruleID=UnstableApiUsage]
'putEdge(N, N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
                              .subList(depth, typeArg.typeArgSelector().size()));
                  qualifierConstraints.putEdge(typeVarComponent, typeArg);
                  qualifierConstraints.putEdge(typeArg, typeVarComponent);
                });
            selector.pop();
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/bugpatterns/BugChecker.java`
#### Snippet
```java

  /** Computes a RangeSet of code regions which are suppressed by this bug checker. */
  public ImmutableRangeSet<Integer> suppressedRegions(VisitorState state) {
    ImmutableRangeSet.Builder<Integer> suppressedRegions = ImmutableRangeSet.builder();
    new TreeScanner<Void, Void>() {
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/bugpatterns/BugChecker.java`
#### Snippet
```java
  /** Computes a RangeSet of code regions which are suppressed by this bug checker. */
  public ImmutableRangeSet<Integer> suppressedRegions(VisitorState state) {
    ImmutableRangeSet.Builder<Integer> suppressedRegions = ImmutableRangeSet.builder();
    new TreeScanner<Void, Void>() {
      @Override
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.ImmutableRangeSet.Builder' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/bugpatterns/BugChecker.java`
#### Snippet
```java
  /** Computes a RangeSet of code regions which are suppressed by this bug checker. */
  public ImmutableRangeSet<Integer> suppressedRegions(VisitorState state) {
    ImmutableRangeSet.Builder<Integer> suppressedRegions = ImmutableRangeSet.builder();
    new TreeScanner<Void, Void>() {
      @Override
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/bugpatterns/BugChecker.java`
#### Snippet
```java
  /** Computes a RangeSet of code regions which are suppressed by this bug checker. */
  public ImmutableRangeSet<Integer> suppressedRegions(VisitorState state) {
    ImmutableRangeSet.Builder<Integer> suppressedRegions = ImmutableRangeSet.builder();
    new TreeScanner<Void, Void>() {
      @Override
```

### RuleId[ruleID=UnstableApiUsage]
'builder()' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/bugpatterns/BugChecker.java`
#### Snippet
```java
  /** Computes a RangeSet of code regions which are suppressed by this bug checker. */
  public ImmutableRangeSet<Integer> suppressedRegions(VisitorState state) {
    ImmutableRangeSet.Builder<Integer> suppressedRegions = ImmutableRangeSet.builder();
    new TreeScanner<Void, Void>() {
      @Override
```

### RuleId[ruleID=UnstableApiUsage]
'build()' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/bugpatterns/BugChecker.java`
#### Snippet
```java
      }
    }.scan(state.getPath().getCompilationUnit(), null);
    return suppressedRegions.build();
  }

```

### RuleId[ruleID=UnstableApiUsage]
'add(com.google.common.collect.Range)' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/bugpatterns/BugChecker.java`
#### Snippet
```java
      public Void scan(Tree tree, Void unused) {
        if (getModifiers(tree) != null && isSuppressed(tree, state)) {
          suppressedRegions.add(Range.closed(getStartPosition(tree), state.getEndPosition(tree)));
        } else {
          super.scan(tree, null);
```

### RuleId[ruleID=UnstableApiUsage]
'nullWriter()' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
          JavacTool.create()
              .getTask(
                  CharStreams.nullWriter(),
                  state.context.get(JavaFileManager.class),
                  diagnosticListener,
```

### RuleId[ruleID=UnstableApiUsage]
'findLast(java.util.stream.Stream)' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
      // must appear before @interface.
      int pos =
          Streams.findLast(
                  state.getOffsetTokensForNode(originalModifiers).stream()
                      .filter(tok -> tok.kind().equals(TokenKind.MONKEYS_AT)))
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.ImmutableRangeMap' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.collect.ImmutableMultimap.class, "K", "V")
        .add(com.google.common.collect.ImmutableMultiset.class, "E")
        .add(com.google.common.collect.ImmutableRangeMap.class, "K", "V")
        .add(com.google.common.collect.ImmutableRangeSet.class, "C")
        .add(com.google.common.collect.ImmutableSet.class, "E")
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.collect.ImmutableMultiset.class, "E")
        .add(com.google.common.collect.ImmutableRangeMap.class, "K", "V")
        .add(com.google.common.collect.ImmutableRangeSet.class, "C")
        .add(com.google.common.collect.ImmutableSet.class, "E")
        .add(com.google.common.collect.ImmutableSetMultimap.class, "K", "V")
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.graph.ImmutableGraph' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.collect.ImmutableTable.class, "R", "C", "V")
        .add(com.google.common.collect.Range.class, "C")
        .add(com.google.common.graph.ImmutableGraph.class, "N")
        .add(com.google.common.graph.ImmutableNetwork.class, "N", "E")
        .add(com.google.common.graph.ImmutableValueGraph.class, "N", "V")
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.graph.ImmutableNetwork' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.collect.Range.class, "C")
        .add(com.google.common.graph.ImmutableGraph.class, "N")
        .add(com.google.common.graph.ImmutableNetwork.class, "N", "E")
        .add(com.google.common.graph.ImmutableValueGraph.class, "N", "V")
        .add("com.google.common.hash.AbstractHashFunction") // package-private
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.graph.ImmutableValueGraph' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.graph.ImmutableGraph.class, "N")
        .add(com.google.common.graph.ImmutableNetwork.class, "N", "E")
        .add(com.google.common.graph.ImmutableValueGraph.class, "N", "V")
        .add("com.google.common.hash.AbstractHashFunction") // package-private
        .add(com.google.common.hash.HashCode.class)
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.net.MediaType' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/WellKnownMutability.java`
#### Snippet
```java
        .add(com.google.common.hash.HashCode.class)
        .add(com.google.common.io.BaseEncoding.class)
        .add(com.google.common.net.MediaType.class)
        .add(com.google.common.primitives.UnsignedInteger.class)
        .add(com.google.common.primitives.UnsignedLong.class)
```

