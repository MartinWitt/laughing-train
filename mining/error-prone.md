# error-prone 
 
# Bad smells
I found 1181 bad smells with 16 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DataFlowIssue | 373 | false |
| UnstableApiUsage | 169 | false |
| Deprecation | 116 | false |
| RedundantTypeArguments | 114 | false |
| SimplifyOptionalCallChains | 43 | false |
| TrivialIf | 36 | false |
| OptionalUsedAsFieldOrParameterType | 36 | false |
| SuspiciousMethodCalls | 26 | false |
| DuplicatedCode | 23 | false |
| OptionalGetWithoutIsPresent | 22 | false |
| UNCHECKED_WARNING | 21 | false |
| JavadocReference | 18 | false |
| JavaReflectionMemberAccess | 14 | false |
| NullableProblems | 12 | false |
| JavadocLinkAsPlainText | 12 | false |
| DeprecatedIsStillUsed | 11 | false |
| UnnecessarySemicolon | 10 | false |
| SimplifyStreamApiCallChains | 10 | false |
| SwitchStatementWithTooFewBranches | 10 | false |
| UnnecessaryLocalVariable | 10 | true |
| IgnoreResultOfCall | 9 | false |
| UnusedAssignment | 7 | false |
| JavaReflectionInvocation | 7 | false |
| UnnecessaryLabelOnContinueStatement | 5 | false |
| EmptyStatementBody | 4 | false |
| CommentedOutCode | 4 | false |
| FinalPrivateMethod | 4 | false |
| MismatchedJavadocCode | 4 | false |
| JavadocDeclaration | 4 | false |
| FieldMayBeFinal | 4 | false |
| FinalMethodInFinalClass | 3 | false |
| TrivialStringConcatenation | 3 | false |
| ConstantValue | 3 | false |
| UnnecessaryModifier | 2 | true |
| UnnecessaryReturn | 2 | true |
| RedundantMethodOverride | 2 | false |
| TypeParameterExtendsObject | 2 | false |
| AutoCloseableResource | 2 | false |
| CastCanBeRemovedNarrowingVariableType | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| RegExpRedundantEscape | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| FinalStaticMethod | 1 | false |
| SimplifiableConditionalExpression | 1 | false |
| FieldCanBeLocal | 1 | false |
| OptionalAssignedToNull | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| SlowListContainsAll | 1 | false |
| SimplifiableBooleanExpression | 1 | false |
| RedundantStringFormatCall | 1 | false |
| PointlessNullCheck | 1 | false |
| OptionalIsPresent | 1 | false |
| ReplaceInefficientStreamCount | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| InnerClassMayBeStatic | 1 | true |
| ConditionCoveredByFurtherCondition | 1 | false |
| RedundantCast | 1 | false |
| InstantiationOfUtilityClass | 1 | false |
| UnnecessaryUnicodeEscape | 1 | false |
| UnnecessaryContinue | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[remainingArgs.size()\]'
in `check_api/src/main/java/com/google/errorprone/ErrorProneOptions.java`
#### Snippet
```java

  public String[] getRemainingArgs() {
    return remainingArgs.toArray(new String[remainingArgs.size()]);
  }

```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
  // Tri-state to represent the fall-thru control flow of a particular case of a particular
  // statement switch
  private static enum CaseFallThru {
    DEFINITELY_DOES_NOT_FALL_THRU,
    MAYBE_FALLS_THRU,
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
  // Tri-state to represent whether cases within a single switch statement meet an (unspecified)
  // qualification predicate
  static enum CaseQualifications {
    NO_CASES_ASSESSED,
    ALL_CASES_QUALIFY,
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `core/src/main/java/com/google/errorprone/bugpatterns/LossyPrimitiveCompare.java`
#### Snippet
```java
        type -> argTypes.stream().allMatch(t -> types.isConvertible(t, type));

    if (argsAreConvertible.test(symtab.byteType)
        || argsAreConvertible.test(symtab.charType)
        || argsAreConvertible.test(symtab.shortType)) {
```

### EmptyStatementBody
`else` statement has empty body
in `core/src/main/java/com/google/errorprone/bugpatterns/MemoizeConstantVisitorStateLookups.java`
#### Snippet
```java
            Name method = fieldAccess.name;
            result.add(new CallSite(method, argumentValue, argumentExpr, tree));
          } else {
            // Just give up on calls we can't understand - maybe from inside VisitorState itself?
          }
```

### EmptyStatementBody
`if` statement has empty body
in `check_api/src/main/java/com/google/errorprone/apply/SourceFile.java`
#### Snippet
```java
      if (lineNum == startLine) {
        newLines.addAll(replacementLines);
      } else if (lineNum > startLine && lineNum <= endLine) {
        // Skip
      } else {
```

### EmptyStatementBody
`if` statement has empty body
in `check_api/src/main/java/com/google/errorprone/fixes/Replacements.java`
#### Snippet
```java
                  coalescePolicy.coalesce(replacement.replaceWith(), existing.replaceWith()));
        }
      } else if (existing.equals(replacement)) {
        // Two copies of a non-insertion edit. Just ignore the new one since it's already done.
      } else {
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
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

### CommentedOutCode
Commented out code (3 lines)
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafeChecker.java`
#### Snippet
```java
      //
      // TODO(b/25630189): fix this
      //
      // if (superType.tsym.getKind() == ElementKind.ANNOTATION_TYPE) {
      //   return superType;
```

### CommentedOutCode
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

### CommentedOutCode
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

## RuleId[id=UnnecessaryLabelOnContinueStatement]
### UnnecessaryLabelOnContinueStatement
Unnecessary label `matchLoop` on continue statement
in `core/src/main/java/com/google/errorprone/refaster/RefasterScanner.java`
#### Snippet
```java
          String matchContents = match.getRange(compilationUnit);
          if (stringContainsComments(matchContents, context)) {
            continue matchLoop;
          }
        }
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `OUTER` on continue statement
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMustBeClosedChecker.java`
#### Snippet
```java
          if (conditionalExpressionTree.getTrueExpression().equals(prev.getLeaf())
              || conditionalExpressionTree.getFalseExpression().equals(prev.getLeaf())) {
            continue OUTER;
          }
          break;
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `OUTER` on continue statement
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMustBeClosedChecker.java`
#### Snippet
```java
              // skip enclosing method invocation
              path = path.getParentPath();
              continue OUTER;
            }
          }
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `OUTER` on continue statement
in `check_api/src/main/java/com/google/errorprone/ErrorProneAnalyzer.java`
#### Snippet
```java
        case EMPTY_STATEMENT:
          // ignore ";" at the top level, which counts as an empty type decl
          continue OUTER;
        case IMPORT:
          // The spec disallows mixing imports and empty top-level declarations (";"), but
```

### UnnecessaryLabelOnContinueStatement
Unnecessary label `OUTER` on continue statement
in `check_api/src/main/java/com/google/errorprone/ErrorProneAnalyzer.java`
#### Snippet
```java
          // Any import declarations after the first semi are incorrectly added to the list
          // of type declarations, so we have to skip over them here.
          continue OUTER;
        default:
          break;
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\}` in RegExp
in `core/src/main/java/com/google/errorprone/bugpatterns/flogger/FloggerMessageFormat.java`
#### Snippet
```java
      instanceMethod().onDescendantOf("com.google.common.flogger.LoggingApi").named("log");

  private static final Pattern MESSAGE_FORMAT_SPECIFIER = Pattern.compile("\\{[0-9]\\}");

  @Override
```

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/errorprone/bugpatterns/StaticAssignmentOfThrowable.java`
#### Snippet
```java
  /* Builds a {@code TreeScanner} that searches for assignments to static {@code Throwable} fields,
   * and reports matches. */
  private final TreeScanner<Void, Void> buildTreeScanner(VisitorState state) {

    Type throwableType = state.getSymtab().throwableType;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/errorprone/bugpatterns/time/StronglyTypeTime.java`
#### Snippet
```java

  /** Tries to strip any time-related suffix off the field name. */
  private static final String createNewName(String fieldName) {
    String newName = TIME_UNIT_REMOVER.matcher(fieldName).replaceAll("");
    // Guard against field names that *just* contain the unit. Not much we can do here.
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/PackagesRule.java`
#### Snippet
```java

  @Override
  public final String id() {
    return "Packages";
  }
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
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

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `core/src/main/java/com/google/errorprone/bugpatterns/StaticAssignmentOfThrowable.java`
#### Snippet
```java
  /* Builds a {@code TreeScanner} that searches for assignments to static {@code Throwable} fields,
   * and reports matches. */
  private final TreeScanner<Void, Void> buildTreeScanner(VisitorState state) {

    Type throwableType = state.getSymtab().throwableType;
```

### FinalPrivateMethod
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

### FinalPrivateMethod
'private' method declared `final`
in `core/src/main/java/com/google/errorprone/bugpatterns/time/StronglyTypeTime.java`
#### Snippet
```java

  /** Tries to strip any time-related suffix off the field name. */
  private static final String createNewName(String fieldName) {
    String newName = TIME_UNIT_REMOVER.matcher(fieldName).replaceAll("");
    // Guard against field names that *just* contain the unit. Not much we can do here.
```

### FinalPrivateMethod
'private' method declared `final`
in `check_api/src/main/java/com/google/errorprone/apply/DiffApplier.java`
#### Snippet
```java
  }

  private final void decrementTasks() {
    if (runState.decrementAndGet() == 0) {
      workerService.shutdown();
```

## RuleId[id=Deprecation]
### Deprecation
'VisitorState(com.sun.tools.javac.util.Context)' is deprecated
in `core/src/main/java/com/google/errorprone/refaster/UMatches.java`
#### Snippet
```java
  static VisitorState makeVisitorState(Tree target, Unifier unifier) {
    Context context = unifier.getContext();
    VisitorState state = new VisitorState(context);
    TreePath path = TreePath.getPath(context.get(JCCompilationUnit.class), target);
    if (path != null) {
```

### Deprecation
'newInstance()' is deprecated
in `core/src/main/java/com/google/errorprone/refaster/UMatches.java`
#### Snippet
```java
  static <T> T makeMatcher(Class<T> klass) {
    try {
      return klass.newInstance();
    } catch (ReflectiveOperationException e) {
      throw new RuntimeException(e);
```

### Deprecation
'newInstance()' is deprecated
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderMethod.java`
#### Snippet
```java
        try {
          return (allowsIdentity || !(t instanceof PlaceholderParamIdent))
              && (matchesClass == null || matchesClass.newInstance().matches(t, state))
              && (notMatchesClass == null || !notMatchesClass.newInstance().matches(t, state))
              && allowedKinds.apply(t.getKind());
```

### Deprecation
'newInstance()' is deprecated
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderMethod.java`
#### Snippet
```java
          return (allowsIdentity || !(t instanceof PlaceholderParamIdent))
              && (matchesClass == null || matchesClass.newInstance().matches(t, state))
              && (notMatchesClass == null || !notMatchesClass.newInstance().matches(t, state))
              && allowedKinds.apply(t.getKind());
        } catch (ReflectiveOperationException e) {
```

### Deprecation
'VisitorState(com.sun.tools.javac.util.Context)' is deprecated
in `core/src/main/java/com/google/errorprone/refaster/RefasterRuleBuilderScanner.java`
#### Snippet
```java
  public Void visitMethod(MethodTree tree, Void v) {
    try {
      VisitorState state = new VisitorState(context);
      logger.log(FINE, "Discovered method with name {0}", tree.getName());
      if (ASTHelpers.hasAnnotation(tree, Placeholder.class, state)) {
```

### Deprecation
'hasAnnotation(com.sun.source.tree.Tree, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/refaster/RefasterRuleBuilderScanner.java`
#### Snippet
```java
      VisitorState state = new VisitorState(context);
      logger.log(FINE, "Discovered method with name {0}", tree.getName());
      if (ASTHelpers.hasAnnotation(tree, Placeholder.class, state)) {
        checkArgument(
            tree.getModifiers().getFlags().contains(Modifier.ABSTRACT),
```

### Deprecation
'hasAnnotation(com.sun.source.tree.Tree, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/refaster/RefasterRuleBuilderScanner.java`
#### Snippet
```java
                params.buildOrThrow(),
                UTemplater.annotationMap(sym)));
      } else if (ASTHelpers.hasAnnotation(tree, BeforeTemplate.class, state)) {
        checkState(afterTemplates.isEmpty(), "BeforeTemplate must come before AfterTemplate");
        Template<?> template = UTemplater.createTemplate(context, tree);
```

### Deprecation
'hasAnnotation(com.sun.source.tree.Tree, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/refaster/RefasterRuleBuilderScanner.java`
#### Snippet
```java
          context.put(UTemplater.REQUIRE_BLOCK_KEY, /* data= */ true);
        }
      } else if (ASTHelpers.hasAnnotation(tree, AfterTemplate.class, state)) {
        afterTemplates.add(UTemplater.createTemplate(context, tree));
      } else if (tree.getModifiers().getFlags().contains(Modifier.ABSTRACT)) {
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
      ExpressionTree arg = Iterables.getOnlyElement(tree.getArguments());
      checkArgument(
          ASTHelpers.hasAnnotation(
              ASTHelpers.getSymbol(arg), Repeated.class, new VisitorState(context)));
      return template(arg);
```

### Deprecation
'VisitorState(com.sun.tools.javac.util.Context)' is deprecated
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
      checkArgument(
          ASTHelpers.hasAnnotation(
              ASTHelpers.getSymbol(arg), Repeated.class, new VisitorState(context)));
      return template(arg);
    }
```

### Deprecation
'getAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class)' is deprecated
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
      checkState(symbol == sym);
      UExpression ident = UFreeIdent.create(tree.getName());
      Matches matches = ASTHelpers.getAnnotation(symbol, Matches.class);
      if (matches != null) {
        ident = UMatches.create(getValue(matches), /* positive= */ true, ident);
```

### Deprecation
'getAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class)' is deprecated
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
        ident = UMatches.create(getValue(matches), /* positive= */ true, ident);
      }
      NotMatches notMatches = ASTHelpers.getAnnotation(symbol, NotMatches.class);
      if (notMatches != null) {
        ident = UMatches.create(getValue(notMatches), /* positive= */ false, ident);
```

### Deprecation
'getAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class)' is deprecated
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
        ident = UMatches.create(getValue(notMatches), /* positive= */ false, ident);
      }
      OfKind hasKind = ASTHelpers.getAnnotation(symbol, OfKind.class);
      if (hasKind != null) {
        EnumSet<Kind> allowed = EnumSet.copyOf(Arrays.asList(hasKind.value()));
```

### Deprecation
'getAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class)' is deprecated
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
      }
      // @Repeated annotations need to be checked last.
      Repeated repeated = ASTHelpers.getAnnotation(symbol, Repeated.class);
      if (repeated != null) {
        ident = URepeated.create(tree.getName(), ident);
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/RestrictedApiChecker.java`
#### Snippet
```java
    // Try each super method for @RestrictedApi
    return streamSuperMethods(method, state.getTypes())
        .filter((t) -> ASTHelpers.hasAnnotation(t, RestrictedApi.class, state))
        .findFirst()
        .map(
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/OrphanedFormatString.java`
#### Snippet
```java
    for (int i = 0; i < params.size(); i++) {
      VarSymbol varSymbol = params.get(i);
      if (hasAnnotation(varSymbol, FormatString.class, state)) {
        return i;
      }
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/OrphanedFormatString.java`
#### Snippet
```java
      LiteralTree tree, MethodInvocationTree methodInvocationTree, VisitorState state) {
    MethodSymbol symbol = getSymbol(methodInvocationTree);
    if (hasAnnotation(symbol, FormatMethod.class, state)) {
      int indexOfParam = findIndexOfFormatStringParameter(state, symbol);
      if (indexOfParam != -1) {
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/OrphanedFormatString.java`
#### Snippet
```java
                              getSymbol(t).name,
                              ms ->
                                  hasAnnotation(ms, FormatMethod.class, s)
                                      || ms.getParameters().stream()
                                          .anyMatch(vs -> hasAnnotation(vs, FormatString.class, s)),
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/OrphanedFormatString.java`
#### Snippet
```java
                                  hasAnnotation(ms, FormatMethod.class, s)
                                      || ms.getParameters().stream()
                                          .anyMatch(vs -> hasAnnotation(vs, FormatString.class, s)),
                              getReceiverType(t),
                              s.getTypes())
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/RxReturnValueIgnored.java`
#### Snippet
```java
    MethodSymbol sym = (MethodSymbol) untypedSymbol;
    // Directly has @CanIgnoreReturnValue
    if (ASTHelpers.hasAnnotation(sym, CanIgnoreReturnValue.class, state)) {
      return true;
    }
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/RxReturnValueIgnored.java`
#### Snippet
```java
        .anyMatch(
            superSym ->
                hasAnnotation(superSym, CanIgnoreReturnValue.class, state)
                    && superSym.getReturnType().tsym.equals(sym.getReturnType().tsym));
  }
```

### Deprecation
'hasAnnotation(com.sun.source.tree.Tree, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/MustBeClosedChecker.java`
#### Snippet
```java
      MethodTree methodTree = (MethodTree) member;
      if (!ASTHelpers.getSymbol(methodTree).isConstructor()
          || ASTHelpers.hasAnnotation(methodTree, MustBeClosed.class, state)
          || !invokedConstructorMustBeClosed(state, methodTree)) {
        continue;
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/MustBeClosedChecker.java`
#### Snippet
```java
    MethodInvocationTree mit = (MethodInvocationTree) est.getExpression();
    MethodSymbol invokedConstructorSymbol = ASTHelpers.getSymbol(mit);
    return ASTHelpers.hasAnnotation(invokedConstructorSymbol, MustBeClosed.class, state);
  }
}
```

### Deprecation
'hasAnnotation(com.sun.source.tree.Tree, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueSubclassLeaked.java`
#### Snippet
```java
          @Override
          public Void visitClass(ClassTree classTree, Void unused) {
            if (hasAnnotation(classTree, AutoValue.class, state)) {
              types.add(getType(classTree));
            }
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/DeprecatedVariable.java`
#### Snippet
```java
  public Description matchVariable(VariableTree tree, VisitorState state) {
    Symbol.VarSymbol sym = ASTHelpers.getSymbol(tree);
    if (!ASTHelpers.hasAnnotation(sym, Deprecated.class, state)) {
      return NO_MATCH;
    }
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/InjectOnBugCheckers.java`
#### Snippet
```java
    if (!isSubtype(
            symbol.owner.type, state.getTypeFromString(BugChecker.class.getCanonicalName()), state)
        || !hasAnnotation(symbol.owner, BugPattern.class, state)) {
      return NO_MATCH;
    }
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/FutureReturnValueIgnored.java`
#### Snippet
```java
          }
          MethodSymbol sym = (MethodSymbol) untypedSymbol;
          if (hasAnnotation(sym, CanIgnoreReturnValue.class, state)) {
            return false;
          }
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/FutureReturnValueIgnored.java`
#### Snippet
```java
            // whose return value really shouldn't be ignored - as a heuristic, check if the super's
            // method is returning a future subtype.
            if (hasAnnotation(superSym, CanIgnoreReturnValue.class, state)
                && ASTHelpers.isSubtype(
                    ASTHelpers.getUpperBound(superSym.getReturnType(), state.getTypes()),
```

### Deprecation
'hasAnnotation(com.sun.source.tree.Tree, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/AnnotateFormatMethod.java`
#### Snippet
```java
    if (enclosingMethod == null
        || !ASTHelpers.getSymbol(enclosingMethod).isVarArgs()
        || ASTHelpers.hasAnnotation(enclosingMethod, FormatMethod.class, state)) {
      return Description.NO_MATCH;
    }
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/MissingOverride.java`
#### Snippet
```java
      return NO_MATCH;
    }
    if (hasAnnotation(sym, Override.class, state)) {
      return NO_MATCH;
    }
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/MissingOverride.java`
#### Snippet
```java
        // to allow deprecated methods to be removed non-atomically, we permit overrides of
        // @Deprecated to skip the annotation
        .filter(override -> !hasAnnotation(override, Deprecated.class, state))
        .map(
            override ->
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodClassMatcher' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/WithSignatureDiscouraged.java`
#### Snippet
```java
/**
 * {@link
 * com.google.errorprone.matchers.method.MethodMatchers.MethodClassMatcher#withSignature(String)} is
 * discouraged: most usages should use .named and/or .withParameters instead.
 *
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/VarChecker.java`
#### Snippet
```java
  public Description matchVariable(VariableTree tree, VisitorState state) {
    Symbol sym = ASTHelpers.getSymbol(tree);
    if (ASTHelpers.hasAnnotation(sym, Var.class, state)) {
      if ((sym.flags() & Flags.EFFECTIVELY_FINAL) != 0) {
        return buildDescription(tree)
```

### Deprecation
'hasAnnotation(com.sun.source.tree.Tree, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/PackageLocation.java`
#### Snippet
```java
    // package-info annotations are special
    // TODO(cushon): fix the core suppression logic to handle this
    if (ASTHelpers.hasAnnotation(tree.getPackage(), SuppressPackageLocation.class, state)) {
      return Description.NO_MATCH;
    }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodMatcher' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryMethodInvocationMatcher.java`
#### Snippet
```java
      return NO_MATCH;
    }
    Type methodMatcherType = state.getTypeFromString(MethodMatcher.class.getCanonicalName());
    ExpressionTree argument = arguments.get(0);
    if (!containsOnlyMethodMatchers(argument, methodMatcherType, state)) {
```

### Deprecation
'getAnnotation(com.sun.source.tree.Tree, java.lang.Class)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/NonOverridingEquals.java`
#### Snippet
```java

      // Add @Override annotation if not present.
      if (ASTHelpers.getAnnotation(methodTree, Override.class) == null) {
        fix.prefixWith(methodTree, "@Override\n");
      }
```

### Deprecation
'getAnnotation(com.sun.source.tree.Tree, java.lang.Class)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/FieldCanBeLocal.java`
#### Snippet
```java
        // replaced with annotation mirror traversals?
        // This is safe given we know that Target does not have Class fields.
        Target target = getAnnotation(annotationTree, Target.class);
        if (target == null) {
          return true;
```

### Deprecation
'getAnnotation(com.sun.source.tree.Tree, java.lang.Class)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/QualifierWithTypeUse.java`
#### Snippet
```java
      if (targetAnnotation.matches()) {
        AnnotationTree annotationTree = targetAnnotation.onlyMatchingNode();
        Target target = ASTHelpers.getAnnotation(tree, Target.class);
        if (hasTypeUseOrTypeParameter(target)) {
          return describeMatch(annotationTree, removeTypeUse(target, annotationTree));
```

### Deprecation
'getAnnotation(com.sun.source.tree.Tree, java.lang.Class)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/InvalidTargetingOnScopingAnnotation.java`
#### Snippet
```java
      if (targetAnnotation.matches()) {
        AnnotationTree targetTree = targetAnnotation.onlyMatchingNode();
        Target target = getAnnotation(classTree, Target.class);
        if (target != null
            && // Unlikely to occur, but just in case Target isn't on the classpath.
```

### Deprecation
'getAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/ScopeOrQualifierAnnotationRetention.java`
#### Snippet
```java
      ClassSymbol classSymbol = ASTHelpers.getSymbol(classTree);
      if (hasSourceRetention(classSymbol)) {
        return describe(classTree, state, ASTHelpers.getAnnotation(classSymbol, Retention.class));
      }

```

### Deprecation
'getAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/ScopeOrQualifierAnnotationRetention.java`
#### Snippet
```java
          return Description.NO_MATCH;
        }
        return describe(classTree, state, ASTHelpers.getAnnotation(classSymbol, Retention.class));
      }
    }
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/ApiDiffChecker.java`
#### Snippet
```java
  private boolean hasAnnotationForbiddingUse(Symbol sym, VisitorState state) {
    return alsoForbidApisAnnotated.isPresent()
        && ASTHelpers.hasAnnotation(sym, alsoForbidApisAnnotated.get(), state);
  }

```

### Deprecation
'hasAnnotation(com.sun.source.tree.Tree, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/Suggester.java`
#### Snippet
```java
  public Description matchMethod(MethodTree tree, VisitorState state) {
    // only suggest @InlineMe on @Deprecated APIs
    if (!hasAnnotation(tree, Deprecated.class, state)) {
      return Description.NO_MATCH;
    }
```

### Deprecation
'hasAnnotation(com.sun.source.tree.Tree, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/Suggester.java`
#### Snippet
```java

    // if the API is already annotated with @DoNotCall, then return no match
    if (hasAnnotation(tree, DoNotCall.class, state)) {
      return Description.NO_MATCH;
    }
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/formatstring/FormatStringAnnotationChecker.java`
#### Snippet
```java
      List<? extends ExpressionTree> args,
      VisitorState state) {
    if (!ASTHelpers.hasAnnotation(symbol, FormatMethod.class, state)) {
      return Description.NO_MATCH;
    }
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/formatstring/FormatStringAnnotationChecker.java`
#### Snippet
```java
    for (int i = 0; i < params.size(); i++) {
      VarSymbol param = params.get(i);
      if (ASTHelpers.hasAnnotation(param, FormatString.class, state)) {
        return i;
      }
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/formatstring/FormatStringAnnotationChecker.java`
#### Snippet
```java

    boolean isFormatMethod =
        ASTHelpers.hasAnnotation(ASTHelpers.getSymbol(tree), FormatMethod.class, state);
    boolean foundFormatString = false;
    boolean foundString = false;
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/formatstring/FormatStringAnnotationChecker.java`
#### Snippet
```java
      }

      if (ASTHelpers.hasAnnotation(paramSymbol, FormatString.class, state)) {
        if (!isFormatMethod) {
          return buildDescription(tree)
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/SynchronizeOnNonFinalField.java`
#### Snippet
```java
      return NO_MATCH;
    }
    if (ASTHelpers.hasAnnotation(varSymbol, LazyInit.class, state)) {
      return NO_MATCH;
    }
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/formatstring/StrictFormatStringValidation.java`
#### Snippet
```java
    if (!ASTHelpers.isSameType(formatString.type, stringType, state)
        || !(formatString.owner instanceof MethodSymbol)
        || !ASTHelpers.hasAnnotation(formatString.owner, FormatMethod.class, state)) {
      return false;
    }
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/formatstring/StrictFormatStringValidation.java`
#### Snippet
```java

    // If the format string is annotated @FormatString in a @FormatMethod, it is a format string.
    if (ASTHelpers.hasAnnotation(formatString, FormatString.class, state)) {
      return true;
    }
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/formatstring/StrictFormatStringValidation.java`
#### Snippet
```java
        if (!formatStringFound) {
          return false;
        } else if (ASTHelpers.hasAnnotation(param, FormatString.class, state)) {
          return false;
        }
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/formatstring/InlineFormatString.java`
#### Snippet
```java
    List<VarSymbol> parameters = sym.getParameters();
    for (VarSymbol p : parameters) {
      if (ASTHelpers.hasAnnotation(p, FormatString.class, state)) {
        return idx;
      }
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/formatstring/InlineFormatString.java`
#### Snippet
```java
      MethodInvocationTree tree, VisitorState state) {
    MethodSymbol sym = getSymbol(tree);
    if (!ASTHelpers.hasAnnotation(sym, FormatMethod.class, state)) {
      return null;
    }
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafeChecker.java`
#### Snippet
```java
      // Don't use getThreadSafeAnnotation here: subtypes of trusted types are
      // also trusted, only check for explicitly annotated supertypes.
      if (ASTHelpers.hasAnnotation(superType.tsym, ThreadSafe.class, state)) {
        return superType;
      }
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafeChecker.java`
#### Snippet
```java
      return NO_MATCH;
    }
    if (ASTHelpers.hasAnnotation(sym, Immutable.class, state)) {
      // If the superclass is @ThreadSafe and the subclass is @Immutable, then the subclass is
      // effectively also @ThreadSafe, and we defer to the @Immutable plugin.
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableAnnotationChecker.java`
#### Snippet
```java
    }

    if (ASTHelpers.hasAnnotation(symbol, Immutable.class, state)) {
      AnnotationTree annotation =
          ASTHelpers.getAnnotationWithSimpleName(tree.getModifiers().getAnnotations(), "Immutable");
```

### Deprecation
'isSuppressed(com.sun.tools.javac.code.Symbol)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafeAnalysis.java`
#### Snippet
```java
      ClassType classType,
      VarSymbol var) {
    if (bugChecker.isSuppressed(var)
        || bugChecker.customSuppressionAnnotations().stream()
            .map(a -> ASTHelpers.hasAnnotation(var, a, state))
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafeAnalysis.java`
#### Snippet
```java
    if (bugChecker.isSuppressed(var)
        || bugChecker.customSuppressionAnnotations().stream()
            .map(a -> ASTHelpers.hasAnnotation(var, a, state))
            .anyMatch(v -> v)) {
      return Violation.absent();
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafeAnalysis.java`
#### Snippet
```java

    if (!var.getModifiers().contains(Modifier.FINAL)
        && !ASTHelpers.hasAnnotation(var, LazyInit.class, state)) {
      return processModifier(tree, classSym, var, Modifier.FINAL, "'%s' has non-final field '%s'");
    }
```

### Deprecation
'addFix(java.util.Optional)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafeAnalysis.java`
#### Snippet
```java
                  "@ThreadSafe class fields should be final or annotated with @GuardedBy. See "
                      + "https://errorprone.info/bugpattern/ThreadSafe for details.")
              .addFix(SuggestedFixes.addModifiers(tree.get(), state, modifier))
              .build());
      return Violation.absent();
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableEnumChecker.java`
#### Snippet
```java
    }

    if (ASTHelpers.hasAnnotation(symbol, Immutable.class, state)
        && !implementsExemptInterface(symbol, state)) {
      AnnotationTree annotation =
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableAnalysis.java`
#### Snippet
```java
    }
    if (!var.getModifiers().contains(Modifier.FINAL)
        && !ASTHelpers.hasAnnotation(var, LazyInit.class, state)) {

      Violation info =
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/CompatibleWithMisuse.java`
#### Snippet
```java
        ASTHelpers.findSuperMethods(declaredMethod, state.getTypes())) {
      if (methodSymbol.params().stream()
          .anyMatch(p -> ASTHelpers.hasAnnotation(p, CompatibleWith.class, state))) {
        return describeWithMessage(
            annoTree,
```

### Deprecation
'getAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class)' is deprecated
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/IncompatibleArgumentType.java`
#### Snippet
```java
    for (int i = 0; i < params.size(); i++) {
      VarSymbol varSymbol = params.get(i);
      CompatibleWith anno = ASTHelpers.getAnnotation(varSymbol, CompatibleWith.class);
      if (anno != null) {
        foundAnyTypeToEnforce = true;
```

### Deprecation
'getAnnotation(com.sun.source.tree.Tree, java.lang.Class)' is deprecated
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
    }

    SuppressWarnings existingAnnotation = getAnnotation(suppressibleNode, SuppressWarnings.class);
    String suppression = state.getTreeMaker().Literal(CLASS, warningToSuppress).toString();

```

### Deprecation
'getAnnotation(com.sun.source.tree.Tree, java.lang.Class)' is deprecated
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
    }

    SuppressWarnings annotation = getAnnotation(suppressibleNode, SuppressWarnings.class);
    ImmutableSet<String> warningsSuppressed = ImmutableSet.copyOf(annotation.value());
    ImmutableSet<String> newWarningSet =
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodNameMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public MethodNameMatcher withAnyName() {
    return this;
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.InstanceMethodMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java
      new MethodMatcherImpl(
          BaseMethodMatcher.METHOD, ImmutableList.of((m, s) -> m.sym().isStatic()));
  static final InstanceMethodMatcher INSTANCE_METHOD =
      new MethodMatcherImpl(
          BaseMethodMatcher.METHOD, ImmutableList.of((m, s) -> !m.sym().isStatic()));
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.ParameterMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public ParameterMatcher withParametersOfType(Iterable<Supplier<Type>> expected) {
    return append(
        (method, state) -> {
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodNameMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public MethodNameMatcher namedAnyOf(Iterable<String> names) {
    ImmutableSet<String> expected = ImmutableSet.copyOf(names);
    return append((m, s) -> expected.contains(m.sym().getSimpleName().toString()));
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.AnyMethodMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java
  }

  static final AnyMethodMatcher ANY_METHOD =
      new MethodMatcherImpl(
          BaseMethodMatcher.METHOD,
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.InstanceMethodMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

final class MethodMatcherImpl
    implements InstanceMethodMatcher,
        StaticMethodMatcher,
        AnyMethodMatcher,
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.StaticMethodMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java
final class MethodMatcherImpl
    implements InstanceMethodMatcher,
        StaticMethodMatcher,
        AnyMethodMatcher,
        MethodClassMatcher,
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.AnyMethodMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java
    implements InstanceMethodMatcher,
        StaticMethodMatcher,
        AnyMethodMatcher,
        MethodClassMatcher,
        MethodSignatureMatcher,
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodClassMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java
        StaticMethodMatcher,
        AnyMethodMatcher,
        MethodClassMatcher,
        MethodSignatureMatcher,
        MethodNameMatcher,
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodSignatureMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java
        AnyMethodMatcher,
        MethodClassMatcher,
        MethodSignatureMatcher,
        MethodNameMatcher,
        ConstructorMatcher,
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodNameMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java
        MethodClassMatcher,
        MethodSignatureMatcher,
        MethodNameMatcher,
        ConstructorMatcher,
        ConstructorClassMatcher,
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.ConstructorMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java
        MethodSignatureMatcher,
        MethodNameMatcher,
        ConstructorMatcher,
        ConstructorClassMatcher,
        ParameterMatcher {
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.ConstructorClassMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java
        MethodNameMatcher,
        ConstructorMatcher,
        ConstructorClassMatcher,
        ParameterMatcher {
  /**
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.ParameterMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java
        ConstructorMatcher,
        ConstructorClassMatcher,
        ParameterMatcher {
  /**
   * The fluent API methods in this class build up a list of constraints, which can either be used
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodClassMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public MethodClassMatcher onDescendantOf(String className) {
    TypePredicate pred = TypePredicates.isDescendantOf(className);
    return append((m, s) -> pred.apply(m.ownerType(), s));
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodClassMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public MethodClassMatcher onDescendantOf(Supplier<Type> classType) {
    return onClass(TypePredicates.isDescendantOf(classType));
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodNameMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java
  }

  private MethodNameMatcher stringConstraint(Predicate<String> constraint) {
    return append((m, s) -> constraint.test(m.sym().getSimpleName().toString()));
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.ConstructorClassMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public ConstructorClassMatcher forClass(Supplier<Type> classType) {
    return forClass(TypePredicates.isExactType(classType));
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodClassMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public MethodClassMatcher onDescendantOfAny(Iterable<String> classTypes) {
    TypePredicate pred = TypePredicates.isDescendantOfAny(classTypes);
    return append((m, s) -> pred.apply(m.ownerType(), s));
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodNameMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public MethodNameMatcher namedAnyOf(String... names) {
    return namedAnyOf(ImmutableSet.copyOf(names));
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodClassMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public MethodClassMatcher onExactClass(Supplier<Type> classType) {
    return onClass(classType);
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodNameMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public MethodNameMatcher named(String name) {
    checkArgument(
        !name.contains("(") && !name.contains(")"),
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.ConstructorClassMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public ConstructorClassMatcher forClass(TypePredicate predicate) {
    return append((m, s) -> predicate.apply(m.ownerType(), s));
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodClassMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public MethodClassMatcher onExactClassAny(Iterable<String> classTypes) {
    return onClassAny(classTypes);
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodSignatureMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public MethodSignatureMatcher withSignature(String signature) {
    // TODO(cushon): build a way to match signatures (including varargs ones!) that doesn't
    // rely on MethodSymbol#toString().
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodClassMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public MethodClassMatcher anyClass() {
    return this;
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodClassMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public MethodClassMatcher onExactClassAny(String... classTypes) {
    return onClassAny(classTypes);
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.ParameterMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public ParameterMatcher withNoParameters() {
    return withParameters(ImmutableList.of());
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodClassMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public MethodClassMatcher onClassAny(Iterable<String> classNames) {
    TypePredicate pred = TypePredicates.isExactTypeAny(classNames);
    return append((m, s) -> pred.apply(m.ownerType(), s));
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodClassMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public MethodClassMatcher onClass(TypePredicate predicate) {
    return append((m, s) -> predicate.apply(m.ownerType(), s));
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.ConstructorMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java
                return true;
              }));
  static final ConstructorMatcher CONSTRUCTOR =
      new MethodMatcherImpl(BaseMethodMatcher.CONSTRUCTOR, ImmutableList.of((m, s) -> true));
  static final StaticMethodMatcher STATIC_METHOD =
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodClassMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public MethodClassMatcher onDescendantOfAny(String... classTypes) {
    return onDescendantOfAny(ImmutableList.copyOf(classTypes));
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.ConstructorClassMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public ConstructorClassMatcher forClass(String className) {
    return append((m, s) -> m.ownerType().asElement().getQualifiedName().contentEquals(className));
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodNameMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public MethodNameMatcher withNameMatching(Pattern pattern) {
    return stringConstraint(s -> pattern.matcher(s).matches());
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.ParameterMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public ParameterMatcher withParameters(Iterable<String> expected) {
    return withParametersOfType(Suppliers.fromStrings(expected));
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodClassMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public MethodClassMatcher onClass(String className) {
    TypePredicate pred = TypePredicates.isExactType(className);
    return append((m, s) -> pred.apply(m.ownerType(), s));
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.StaticMethodMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java
  static final ConstructorMatcher CONSTRUCTOR =
      new MethodMatcherImpl(BaseMethodMatcher.CONSTRUCTOR, ImmutableList.of((m, s) -> true));
  static final StaticMethodMatcher STATIC_METHOD =
      new MethodMatcherImpl(
          BaseMethodMatcher.METHOD, ImmutableList.of((m, s) -> m.sym().isStatic()));
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodClassMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public MethodClassMatcher onExactClass(String className) {
    return onClass(className);
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.ParameterMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public ParameterMatcher withParameters(String first, String... rest) {
    return withParameters(Lists.asList(first, rest));
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodClassMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public MethodClassMatcher onClass(Supplier<Type> classType) {
    return onClass(TypePredicates.isExactType(classType));
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodClassMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatcherImpl.java`
#### Snippet
```java

  @Override
  public MethodClassMatcher onClassAny(String... classNames) {
    return onClassAny(ImmutableList.copyOf(classNames));
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodInvocationMatcher.java`
#### Snippet
```java
/**
 * The machinery and type definitions necessary to model and compile a single efficient matcher out
 * of a list of {@link com.google.errorprone.matchers.method.MethodMatchers.MethodMatcher}s.
 */
public class MethodInvocationMatcher {
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.MethodMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodInvocationMatcher.java`
#### Snippet
```java
   * satisfying at least one of the given Rule specifications. For an easy way to create such Rules,
   * see the factories in {@link com.google.errorprone.matchers.Matchers} returning subtypes of
   * {@link com.google.errorprone.matchers.method.MethodMatchers.MethodMatcher}.
   */
  public static Matcher<ExpressionTree> compile(Iterable<Rule> rules) {
```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
  public static <T extends Tree> Matcher<T> symbolHasAnnotation(
      Class<? extends Annotation> inputClass) {
    return (tree, state) -> ASTHelpers.hasAnnotation(getSymbol(tree), inputClass, state);
  }

```

### Deprecation
'hasAnnotation(com.sun.tools.javac.code.Symbol, java.lang.Class, com.google.errorprone.VisitorState)' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
  public static <T extends Tree> Matcher<T> hasAnnotation(Class<? extends Annotation> inputClass) {
    return (tree, state) ->
        ASTHelpers.hasAnnotation(ASTHelpers.getDeclaredSymbol(tree), inputClass, state);
  }

```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.ConstructorMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java

  /** Matches a constructor. */
  public static ConstructorMatcher constructor() {
    return MethodMatchers.constructor();
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.InstanceMethodMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java

  /** Matches an instance method. */
  public static InstanceMethodMatcher instanceMethod() {
    return MethodMatchers.instanceMethod();
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.StaticMethodMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java

  /** Matches a static method. */
  public static StaticMethodMatcher staticMethod() {
    return MethodMatchers.staticMethod();
  }
```

### Deprecation
'com.google.errorprone.matchers.method.MethodMatchers.AnyMethodMatcher' is deprecated
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java

  /** Matches a static or instance method. */
  public static AnyMethodMatcher anyMethod() {
    return MethodMatchers.anyMethod();
  }
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
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

### UnnecessaryReturn
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

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `core/src/main/java/com/google/errorprone/bugpatterns/time/StronglyTypeTime.java`
#### Snippet
```java

  /** Tries to strip any time-related suffix off the field name. */
  private static final String createNewName(String fieldName) {
    String newName = TIME_UNIT_REMOVER.matcher(fieldName).replaceAll("");
    // Guard against field names that *just* contain the unit. Not much we can do here.
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `core/src/main/java/com/google/errorprone/bugpatterns/LiteProtoToString.java`
#### Snippet
```java
          + " development and optimized builds. Consider using #getNumber if you only need a"
          + " serialized representation of the value, or #name if you really need the name."
          + "";

  private static final TypePredicate IS_LITE_PROTO =
```

### TrivialStringConcatenation
Empty string used in concatenation
in `core/src/main/java/com/google/errorprone/bugpatterns/TypeParameterNaming.java`
#### Snippet
```java

  private static String upperCamelToken(String s) {
    return "" + Ascii.toUpperCase(s.charAt(0)) + (s.length() == 1 ? "" : s.substring(1));
  }

```

### TrivialStringConcatenation
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

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`released == null ? false : released` can be simplified to 'released!=null \&\& released'
in `core/src/main/java/com/google/errorprone/bugpatterns/LockNotBeforeTry.java`
#### Snippet
```java
          }
        }.scan(tryTree.getFinallyBlock(), null);
    return released == null ? false : released;
  }

```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UMethodType.java`
#### Snippet
```java
  public MethodType inline(Inliner inliner) throws CouldNotResolveImportException {
    return new MethodType(
        inliner.<Type>inlineList(getParameterTypes()),
        getReturnType().inline(inliner),
        com.sun.tools.javac.util.List.<Type>nil(),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UMethodType.java`
#### Snippet
```java
        inliner.<Type>inlineList(getParameterTypes()),
        getReturnType().inline(inliner),
        com.sun.tools.javac.util.List.<Type>nil(),
        inliner.symtab().methodClass);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UClassIdent.java`
#### Snippet
```java
    return symbol != null
        ? getName().unify(symbol.getQualifiedName(), unifier)
        : Choice.<Unifier>none();
  }
}
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UIf.java`
#### Snippet
```java
  @Override
  public List<JCStatement> inlineStatements(Inliner inliner) throws CouldNotResolveImportException {
    return List.<JCStatement>of(
        inliner
            .maker()
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UIf.java`
#### Snippet
```java
    return (Unifier unifier) -> {
      if (toUnify == null) {
        return (target == null) ? Choice.of(unifier) : Choice.<Unifier>none();
      }
      List<StatementTree> list = (target == null) ? List.<StatementTree>nil() : List.of(target);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UIf.java`
#### Snippet
```java
        return (target == null) ? Choice.of(unifier) : Choice.<Unifier>none();
      }
      List<StatementTree> list = (target == null) ? List.<StatementTree>nil() : List.of(target);
      return toUnify
          .apply(UnifierWithUnconsumedStatements.create(unifier, list))
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UIf.java`
#### Snippet
```java
                              stateAfterThen.unconsumedStatements().isEmpty()
                                  ? Optional.of(stateAfterThen.unifier())
                                  : Optional.<Unifier>absent());
                })
            .thenChoose(
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UTypeParameter.java`
#### Snippet
```java
  @VisibleForTesting
  static UTypeParameter create(CharSequence name, UExpression... bounds) {
    return create(name, ImmutableList.copyOf(bounds), ImmutableList.<UAnnotation>of());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UNewClass.java`
#### Snippet
```java

  public static UNewClass create(UExpression identifier, UExpression... arguments) {
    return create(ImmutableList.<UExpression>of(), identifier, arguments);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UNewClass.java`
#### Snippet
```java
        .NewClass(
            (getEnclosingExpression() == null) ? null : getEnclosingExpression().inline(inliner),
            inliner.<JCExpression>inlineList(getTypeArguments()),
            getIdentifier().inline(inliner),
            inliner.<JCExpression>inlineList(getArguments()),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UNewClass.java`
#### Snippet
```java
            inliner.<JCExpression>inlineList(getTypeArguments()),
            getIdentifier().inline(inliner),
            inliner.<JCExpression>inlineList(getArguments()),
            (getClassBody() == null) ? null : getClassBody().inline(inliner));
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UType.java`
#### Snippet
```java
  @Override
  public final Choice<Unifier> unify(Type target, Unifier unifier) {
    return (target != null) ? target.accept(this, unifier) : Choice.<Unifier>none();
  }
}
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UTree.java`
#### Snippet
```java
  @Override
  public Choice<Unifier> unify(@Nullable Tree target, Unifier unifier) {
    return (target != null) ? target.accept(this, unifier) : Choice.<Unifier>none();
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UForAll.java`
#### Snippet
```java
  @Override
  public Type inline(Inliner inliner) throws CouldNotResolveImportException {
    return new ForAll(inliner.<Type>inlineList(getTypeVars()), getQuantifiedType().inline(inliner));
  }
}
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderMethod.java`
#### Snippet
```java
    Predicate<Tree.Kind> allowedKinds =
        annotations.containsKey(OfKind.class)
            ? Predicates.<Tree.Kind>in(Arrays.asList(annotations.getInstance(OfKind.class).value()))
            : Predicates.<Tree.Kind>alwaysTrue();
    class PlaceholderMatcher implements Matcher<ExpressionTree> {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderMethod.java`
#### Snippet
```java
        annotations.containsKey(OfKind.class)
            ? Predicates.<Tree.Kind>in(Arrays.asList(annotations.getInstance(OfKind.class).value()))
            : Predicates.<Tree.Kind>alwaysTrue();
    class PlaceholderMatcher implements Matcher<ExpressionTree> {

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UMethodDecl.java`
#### Snippet
```java
            getName().inline(inliner),
            getReturnType().inline(inliner),
            List.<JCTypeParameter>nil(),
            List.convert(JCVariableDecl.class, inliner.inlineList(getParameters())),
            inliner.<JCExpression>inlineList(getThrows()),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UMethodDecl.java`
#### Snippet
```java
            List.<JCTypeParameter>nil(),
            List.convert(JCVariableDecl.class, inliner.inlineList(getParameters())),
            inliner.<JCExpression>inlineList(getThrows()),
            getBody().inline(inliner),
            null);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UClassType.java`
#### Snippet
```java
        classSymbol.owner instanceof ClassSymbol && (classSymbol.flags() & STATIC) == 0;
    Type owner = isNonStaticInnerClass ? classSymbol.owner.type : Type.noType;
    return new ClassType(owner, inliner.<Type>inlineList(typeArguments()), classSymbol);
  }
}
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UBlock.java`
#### Snippet
```java
            state.unconsumedStatements().isEmpty()
                ? Optional.of(state.unifier())
                : Optional.<Unifier>absent());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UAnnotation.java`
#### Snippet
```java
        .maker()
        .Annotation(
            getAnnotationType().inline(inliner), inliner.<JCExpression>inlineList(getArguments()));
  }
}
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UTry.java`
#### Snippet
```java
        .maker()
        .Try(
            inliner.<JCTree>inlineList(getResources()),
            getBlock().inline(inliner),
            inliner.inlineList(getCatches()),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/RefasterRule.java`
#### Snippet
```java
    return create(
        qualifiedTemplateClass,
        ImmutableList.<UTypeVar>of(),
        beforeTemplates,
        afterTemplates,
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UTypeApply.java`
#### Snippet
```java
    return inliner
        .maker()
        .TypeApply(getType().inline(inliner), inliner.<JCExpression>inlineList(getTypeArguments()));
  }
}
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UMethodInvocation.java`
#### Snippet
```java
        .maker()
        .Apply(
            inliner.<JCExpression>inlineList(getTypeArguments()),
            getMethodSelect().inline(inliner),
            inliner.<JCExpression>inlineList(getArguments()));
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UMethodInvocation.java`
#### Snippet
```java
            inliner.<JCExpression>inlineList(getTypeArguments()),
            getMethodSelect().inline(inliner),
            inliner.<JCExpression>inlineList(getArguments()));
  }
}
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/ExpressionTemplate.java`
#### Snippet
```java
    return create(
        ImmutableClassToInstanceMap.of(),
        ImmutableList.<UTypeVar>of(),
        expressionArgumentTypes,
        expression,
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/ExpressionTemplate.java`
#### Snippet
```java

  public static ExpressionTemplate create(UExpression expression, UType returnType) {
    return create(ImmutableMap.<String, UType>of(), expression, returnType);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UForLoop.java`
#### Snippet
```java
            (getCondition() == null) ? null : getCondition().inline(inliner),
            com.sun.tools.javac.util.List.convert(
                JCExpressionStatement.class, inliner.<JCStatement>inlineList(getUpdate())),
            getStatement().inline(inliner));
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/BlockTemplate.java`
#### Snippet
```java

  public static BlockTemplate create(UStatement... templateStatements) {
    return create(ImmutableMap.<String, UType>of(), templateStatements);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/BlockTemplate.java`
#### Snippet
```java
                  block, offset + i, statements.subList(i, statements.size()), context));
    }
    return choice.or(Choice.of(List.<BlockTemplateMatch>nil()));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/BlockTemplate.java`
#### Snippet
```java
  public static BlockTemplate create(
      Map<String, ? extends UType> expressionArgumentTypes, UStatement... templateStatements) {
    return create(ImmutableList.<UTypeVar>of(), expressionArgumentTypes, templateStatements);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/BlockTemplate.java`
#### Snippet
```java
      return matchesStartingAnywhere(block, 0, targetStatements, context)
          .first()
          .or(List.<BlockTemplateMatch>nil());
    }
    return ImmutableList.of();
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UNewArray.java`
#### Snippet
```java
        .NewArray(
            (getType() == null) ? null : getType().inline(inliner),
            (getDimensions() == null) ? null : inliner.<JCExpression>inlineList(getDimensions()),
            (getInitializers() == null)
                ? null
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UNewArray.java`
#### Snippet
```java
            (getInitializers() == null)
                ? null
                : inliner.<JCExpression>inlineList(getInitializers()));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UFreeIdent.java`
#### Snippet
```java
    Names names = Names.instance(unifier.getContext());
    return node.getName().equals(names._super)
        ? Choice.<Unifier>none()
        : defaultAction(node, unifier);
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UBlank.java`
#### Snippet
```java
    ListBuffer<JCStatement> buffer = new ListBuffer<>();
    for (StatementTree stmt :
        inliner.getOptionalBinding(key()).or(ImmutableList.<StatementTree>of())) {
      buffer.add((JCStatement) stmt);
    }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UPlaceholderStatement.java`
#### Snippet
```java
    Choice<State<ConsumptionState>> choiceToHere =
        Choice.of(
            State.create(List.<UVariableDecl>nil(), initState.unifier(), ConsumptionState.empty()));

    if (verification.allRequiredMatched()) {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UPlaceholderExpression.java`
#### Snippet
```java
                expr,
                PlaceholderUnificationVisitor.State.create(
                    List.<UVariableDecl>nil(), unifier, null));
    return states.thenOption(
        (PlaceholderUnificationVisitor.State<? extends JCExpression> state) -> {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UPlaceholderExpression.java`
#### Snippet
```java
              return prevBinding.toString().equals(state.result().toString())
                  ? Optional.of(resultUnifier)
                  : Optional.<Unifier>absent();
            }
            JCExpression result = state.result();
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java

  UTemplater(Context context) {
    this(ImmutableMap.<String, VarSymbol>of(), context);
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/Template.java`
#### Snippet
```java

    Type methodType =
        new MethodType(expectedArgTypes, returnType, List.<Type>nil(), symtab.methodClass);
    if (!freeTypeVariables.isEmpty()) {
      methodType = new ForAll(freeTypeVariables, methodType);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/Template.java`
#### Snippet
```java

    Env<AttrContext> env =
        enter.getTopLevelEnv(TreeMaker.instance(inliner.getContext()).TopLevel(List.<JCTree>nil()));

    // Set up the resolution phase:
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/Template.java`
#### Snippet
```java
          warner,
          inliner,
          inliner.<Type>inlineList(freeTypeVars),
          expectedTypes,
          inliner.symtab().voidType,
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/Template.java`
#### Snippet
```java
                warner,
                inliner,
                inliner.<Type>inlineList(freeTypeVars),
                expectedTypes,
                var.inline(inliner),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/Template.java`
#### Snippet
```java
    ImmutableList<UTypeVar> ruleTypeVars = context.get(RefasterRule.RULE_TYPE_VARS);
    return Iterables.concat(
        (ruleTypeVars == null) ? ImmutableList.<UTypeVar>of() : ruleTypeVars,
        templateTypeVariables());
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/Choice.java`
#### Snippet
```java
      @Override
      public Choice<T> condition(Predicate<? super T> predicate) {
        return predicate.apply(t) ? this : Choice.<T>none();
      }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/Choice.java`
#### Snippet
```java
  /** Returns a choice between any of the options from any of the specified choices. */
  public static <T> Choice<T> any(Collection<Choice<T>> choices) {
    return from(choices).thenChoose(Functions.<Choice<T>>identity());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/Choice.java`
#### Snippet
```java
  public Optional<T> first() {
    Iterator<T> itr = iterator();
    return itr.hasNext() ? Optional.of(itr.next()) : Optional.<T>absent();
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/Choice.java`
#### Snippet
```java
   */
  public static <T> Choice<T> condition(boolean condition, T t) {
    return condition ? of(t) : Choice.<T>none();
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/Choice.java`
#### Snippet
```java
  /** Returns this choice if {@code condition}, otherwise the empty choice. */
  public Choice<T> condition(boolean condition) {
    return condition ? this : Choice.<T>none();
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/Choice.java`
#### Snippet
```java
   */
  public static <T> Choice<T> fromOptional(Optional<T> optional) {
    return optional.isPresent() ? of(optional.get()) : Choice.<T>none();
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/DeadException.java`
#### Snippet
```java
        anyOf(
                new ChildOfBlockOrCase<>(
                    ChildMultiMatcher.MatchType.LAST, Matchers.<StatementTree>isSame(parent)),
                // it could also be a bare if statement with no braces
                parentNode(parentNode(kindIs(IF))))
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/ArrayHashCode.java`
#### Snippet
```java
      allOf(
          staticMethod().onClass("java.util.Objects").named("hashCode"),
          argument(0, Matchers.<ExpressionTree>isArrayType()));

  /** Matches calls to the hashCode instance method on an array. */
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/ArrayHashCode.java`
#### Snippet
```java
              staticMethod().onClass("com.google.common.base.Objects").named("hashCode"),
              staticMethod().onClass("java.util.Objects").named("hash")),
          hasArguments(MatchType.AT_LEAST_ONE, Matchers.<ExpressionTree>isArrayType()));

  /**
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/IterableAndIterator.java`
#### Snippet
```java

  private static boolean matchAnySuperType(ClassTree tree, VisitorState state) {
    List<Tree> superTypes = Lists.<Tree>newArrayList(tree.getImplementsClause());
    Tree superClass = tree.getExtendsClause();
    if (superClass != null) {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/NonAtomicVolatileUpdate.java`
#### Snippet
```java
      ExpressionTree variable) {
    return allOf(
        variableFromAssignmentTree(Matchers.<ExpressionTree>hasModifier(Modifier.VOLATILE)),
        not(inSynchronized()),
        assignment(
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/NonAtomicVolatileUpdate.java`
#### Snippet
```java
        not(inSynchronized()),
        assignment(
            Matchers.<ExpressionTree>anything(),
            toType(
                BinaryTree.class,
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/NonAtomicVolatileUpdate.java`
#### Snippet
```java
            toType(
                BinaryTree.class,
                Matchers.<BinaryTree>allOf(
                    Matchers.<BinaryTree>anyOf(kindIs(Kind.PLUS), kindIs(Kind.MINUS)),
                    binaryTree(sameVariable(variable), Matchers.<ExpressionTree>anything())))));
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/NonAtomicVolatileUpdate.java`
#### Snippet
```java
                BinaryTree.class,
                Matchers.<BinaryTree>allOf(
                    Matchers.<BinaryTree>anyOf(kindIs(Kind.PLUS), kindIs(Kind.MINUS)),
                    binaryTree(sameVariable(variable), Matchers.<ExpressionTree>anything())))));
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/NonAtomicVolatileUpdate.java`
#### Snippet
```java
                Matchers.<BinaryTree>allOf(
                    Matchers.<BinaryTree>anyOf(kindIs(Kind.PLUS), kindIs(Kind.MINUS)),
                    binaryTree(sameVariable(variable), Matchers.<ExpressionTree>anything())))));
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/NonAtomicVolatileUpdate.java`
#### Snippet
```java
  private static final Matcher<UnaryTree> unaryIncrementDecrementMatcher =
      allOf(
          expressionFromUnaryTree(Matchers.<ExpressionTree>hasModifier(Modifier.VOLATILE)),
          not(inSynchronized()),
          anyOf(
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/NonAtomicVolatileUpdate.java`
#### Snippet
```java
      allOf(
          variableFromCompoundAssignmentTree(
              Matchers.<ExpressionTree>hasModifier(Modifier.VOLATILE)),
          not(inSynchronized()),
          anyOf(kindIs(Kind.PLUS_ASSIGNMENT), kindIs(Kind.MINUS_ASSIGNMENT)));
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
      @Nullable ExpressionTree node, State<?> state) {
    if (node == null) {
      return Choice.of(state.<JCExpression>withResult(null));
    }
    Choice<? extends State<? extends JCExpression>> tryBindArguments =
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
      return unifyExpression((ExpressionTree) node, state);
    } else if (node == null) {
      return Choice.of(state.<JCTree>withResult(null));
    } else {
      return node.accept(this, state);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
      @Nullable Iterable<? extends Tree> nodes, State<?> state) {
    if (nodes == null) {
      return Choice.of(state.<List<JCTree>>withResult(null));
    }
    Choice<State<List<JCTree>>> choice = Choice.of(state.withResult(List.<JCTree>nil()));
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
      return Choice.of(state.<List<JCTree>>withResult(null));
    }
    Choice<State<List<JCTree>>> choice = Choice.of(state.withResult(List.<JCTree>nil()));
    for (Tree node : nodes) {
      choice =
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/CannotMockFinalClass.java`
#### Snippet
```java

  private static final Matcher<Tree> enclosingClassIsJunit4Test =
      enclosingClass(Matchers.<ClassTree>annotations(AT_LEAST_ONE, runWithJunit4));

  private static final Matcher<VariableTree> variableOfFinalClassAnnotatedMock =
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/MultiVariableDeclaration.java`
#### Snippet
```java

  private Description checkDeclarations(List<? extends Tree> children, VisitorState state) {
    PeekingIterator<Tree> it = Iterators.<Tree>peekingIterator(children.iterator());
    while (it.hasNext()) {
      if (it.peek().getKind() != Tree.Kind.VARIABLE) {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/ArraysAsListPrimitiveArray.java`
#### Snippet
```java
          staticMethod().onClass("java.util.Arrays").named("asList"),
          Matchers.argumentCount(1),
          Matchers.argument(0, Matchers.<ExpressionTree>isArrayType()));

  private static final ImmutableMap<TypeKind, String> GUAVA_UTILS = getGuavaUtils();
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java

    // NOMUTANTS--for performance/early return only; correctness unchanged
    if (!Matchers.nextStatement(Matchers.<StatementTree>anything()).matches(switchTree, state)) {
      // No lowest-ancestor block or no following statements
      return followingStatements;
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/RedundantThrows.java`
#### Snippet
```java
    // sort by order in input
    ImmutableList<ExpressionTree> delete =
        ImmutableList.<ExpressionTree>copyOf(
            Iterables.filter(tree.getThrows(), Predicates.in(toRemove)));
    return buildDescription(delete.get(0))
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueFinalMethods.java`
#### Snippet
```java
  private static final Matcher<MethodTree> METHOD_MATCHER =
      allOf(
          Matchers.<MethodTree>hasModifier(Modifier.PUBLIC),
          not(Matchers.<MethodTree>hasModifier(Modifier.ABSTRACT)),
          not(Matchers.<MethodTree>hasModifier(Modifier.FINAL)),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueFinalMethods.java`
#### Snippet
```java
      allOf(
          Matchers.<MethodTree>hasModifier(Modifier.PUBLIC),
          not(Matchers.<MethodTree>hasModifier(Modifier.ABSTRACT)),
          not(Matchers.<MethodTree>hasModifier(Modifier.FINAL)),
          not(Matchers.<MethodTree>hasAnnotation(MEMOIZED)),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueFinalMethods.java`
#### Snippet
```java
          Matchers.<MethodTree>hasModifier(Modifier.PUBLIC),
          not(Matchers.<MethodTree>hasModifier(Modifier.ABSTRACT)),
          not(Matchers.<MethodTree>hasModifier(Modifier.FINAL)),
          not(Matchers.<MethodTree>hasAnnotation(MEMOIZED)),
          anyOf(
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueFinalMethods.java`
#### Snippet
```java
          not(Matchers.<MethodTree>hasModifier(Modifier.ABSTRACT)),
          not(Matchers.<MethodTree>hasModifier(Modifier.FINAL)),
          not(Matchers.<MethodTree>hasAnnotation(MEMOIZED)),
          anyOf(
              Matchers.equalsMethodDeclaration(),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/ComparableAndComparator.java`
#### Snippet
```java

  private static boolean matchAnySuperType(ClassTree tree, VisitorState state) {
    List<Tree> superTypes = Lists.<Tree>newArrayList(tree.getImplementsClause());
    Tree superClass = tree.getExtendsClause();
    if (superClass != null) {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/RemoveUnusedImports.java`
#### Snippet
```java
    if (importTree.isStatic()) {
      StaticImportInfo staticImportInfo = StaticImports.tryCreate(importTree, state);
      return staticImportInfo == null ? ImmutableSet.<Symbol>of() : staticImportInfo.members();
    } else {
      @Nullable Symbol importedSymbol = getSymbol(importTree.getQualifiedIdentifier());
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/RemoveUnusedImports.java`
#### Snippet
```java
    } else {
      @Nullable Symbol importedSymbol = getSymbol(importTree.getQualifiedIdentifier());
      return importedSymbol == null ? ImmutableSet.<Symbol>of() : ImmutableSet.of(importedSymbol);
    }
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/EqualsHashCode.java`
#### Snippet
```java
            symbol,
            state.getName("hashCode"),
            ImmutableList.<Type>of(),
            ImmutableList.<Type>of());

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/EqualsHashCode.java`
#### Snippet
```java
            state.getName("hashCode"),
            ImmutableList.<Type>of(),
            ImmutableList.<Type>of());

    if (!expectedMethodSym.owner.equals(state.getSymtab().objectType.tsym)) {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/IsInstanceOfClass.java`
#### Snippet
```java
              // Class is final so we could just use isSameType, but we want to
              // test for the same _erased_ type.
              Matchers.<ExpressionTree>isSubtypeOf("java.lang.Class")));

  /** Suggests removing getClass() or changing to Class.class. */
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/MissingFail.java`
#### Snippet
```java

  private static final Matcher<AssignmentTree> FIELD_ASSIGNMENT =
      assignment(isInstanceField(), Matchers.<ExpressionTree>anything());
  private static final Matcher<Tree> FIELD_ASSIGNMENT_IN_BLOCK =
      contains(toType(AssignmentTree.class, FIELD_ASSIGNMENT));
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/TryFailThrowable.java`
#### Snippet
```java
      // an empty list of statements (regardless of the number of comments),
      // or a list of empty statements.
      if (!Matchers.<Tree>kindIs(EMPTY_STATEMENT).matches(catchStatement, state)) {
        return doesNotMatch();
      }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/ScopeAnnotationOnInterfaceOrAbstractClass.java`
#### Snippet
```java
   */
  private static final Matcher<AnnotationTree> SCOPE_ANNOTATION_MATCHER =
      Matchers.<AnnotationTree>anyOf(
          symbolHasAnnotation(GUICE_SCOPE_ANNOTATION), symbolHasAnnotation(JAVAX_SCOPE_ANNOTATION));

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/guice/BindingToUnqualifiedCommonType.java`
#### Snippet
```java
              annotations(
                  AT_LEAST_ONE,
                  Matchers.<AnnotationTree>anyOf(
                      symbolHasAnnotation(InjectMatchers.GUICE_BINDING_ANNOTATION),
                      symbolHasAnnotation(InjectMatchers.JAVAX_QUALIFIER_ANNOTATION)))),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/Util.java`
#### Snippet
```java
          not(
              hasMethod(
                  Matchers.<MethodTree>allOf(
                      ANNOTATED_WITH_PRODUCES_OR_PROVIDES, not(hasModifier(STATIC))))));

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/Util.java`
#### Snippet
```java
              @Override
              public Matcher<AnnotationTree> apply(String parameter) {
                return hasArgumentWithValue(parameter, Matchers.<ExpressionTree>anything());
              }
            }));
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/EmptySetMultibindingContributions.java`
#### Snippet
```java
  private static final Matcher<AnnotationTree> HAS_DAGGER_ONE_MODULE_ARGUMENT =
      anyOf(
          hasArgumentWithValue("injects", Matchers.<ExpressionTree>anything()),
          hasArgumentWithValue("staticInjections", Matchers.<ExpressionTree>anything()),
          hasArgumentWithValue("overrides", Matchers.<ExpressionTree>anything()),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/EmptySetMultibindingContributions.java`
#### Snippet
```java
      anyOf(
          hasArgumentWithValue("injects", Matchers.<ExpressionTree>anything()),
          hasArgumentWithValue("staticInjections", Matchers.<ExpressionTree>anything()),
          hasArgumentWithValue("overrides", Matchers.<ExpressionTree>anything()),
          hasArgumentWithValue("addsTo", Matchers.<ExpressionTree>anything()),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/EmptySetMultibindingContributions.java`
#### Snippet
```java
          hasArgumentWithValue("injects", Matchers.<ExpressionTree>anything()),
          hasArgumentWithValue("staticInjections", Matchers.<ExpressionTree>anything()),
          hasArgumentWithValue("overrides", Matchers.<ExpressionTree>anything()),
          hasArgumentWithValue("addsTo", Matchers.<ExpressionTree>anything()),
          hasArgumentWithValue("complete", Matchers.<ExpressionTree>anything()),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/EmptySetMultibindingContributions.java`
#### Snippet
```java
          hasArgumentWithValue("staticInjections", Matchers.<ExpressionTree>anything()),
          hasArgumentWithValue("overrides", Matchers.<ExpressionTree>anything()),
          hasArgumentWithValue("addsTo", Matchers.<ExpressionTree>anything()),
          hasArgumentWithValue("complete", Matchers.<ExpressionTree>anything()),
          hasArgumentWithValue("library", Matchers.<ExpressionTree>anything()));
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/EmptySetMultibindingContributions.java`
#### Snippet
```java
          hasArgumentWithValue("overrides", Matchers.<ExpressionTree>anything()),
          hasArgumentWithValue("addsTo", Matchers.<ExpressionTree>anything()),
          hasArgumentWithValue("complete", Matchers.<ExpressionTree>anything()),
          hasArgumentWithValue("library", Matchers.<ExpressionTree>anything()));

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/EmptySetMultibindingContributions.java`
#### Snippet
```java
          hasArgumentWithValue("addsTo", Matchers.<ExpressionTree>anything()),
          hasArgumentWithValue("complete", Matchers.<ExpressionTree>anything()),
          hasArgumentWithValue("library", Matchers.<ExpressionTree>anything()));

  /** We're just not going to worry about Collections.EMPTY_SET. */
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/android/FragmentInjection.java`
#### Snippet
```java
              ISVALIDFRAGMENT.get(state),
              ImmutableList.of(state.getSymtab().stringType),
              ImmutableList.<Type>of());
      methodNotImplemented = isValidFragmentMethodSymbol.owner.equals(preferenceActivityTypeSymbol);
    } catch (FatalError e) {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/Inliner.java`
#### Snippet
```java
  Inliner(ErrorProneFlags flags) {
    this.apiPrefixes =
        ImmutableSet.copyOf(flags.getSet(PREFIX_FLAG).orElse(ImmutableSet.<String>of()));
    this.skipCallsitesWithComments = flags.getBoolean(SKIP_COMMENTS_FLAG).orElse(true);
    this.checkFixCompiles = flags.getBoolean(CHECK_FIX_COMPILES).orElse(false);
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/UnnecessaryCheckNotNull.java`
#### Snippet
```java

  private static final Matcher<MethodInvocationTree> PRIMITIVE_ARG_MATCHER =
      argument(0, Matchers.<ExpressionTree>isPrimitiveType());

  @Override
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/UnnecessaryCheckNotNull.java`
#### Snippet
```java

  private static final Matcher<MethodInvocationTree> STRING_LITERAL_ARG_MATCHER =
      argument(0, Matchers.<ExpressionTree>kindIs(STRING_LITERAL));

  private static final Matcher<MethodInvocationTree> PRIMITIVE_ARG_MATCHER =
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/UnnecessaryCheckNotNull.java`
#### Snippet
```java

  private static final Matcher<MethodInvocationTree> CHECK_NOT_NULL_MATCHER =
      Matchers.<MethodInvocationTree>anyOf(
          staticMethod().onClass("com.google.common.base.Preconditions").named("checkNotNull"),
          staticMethod().onClass("com.google.common.base.Verify").named("verifyNotNull"),
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/UnnecessaryCheckNotNull.java`
#### Snippet
```java
  private static final Matcher<MethodInvocationTree> NEW_INSTANCE_MATCHER =
      argument(
          0, Matchers.<ExpressionTree>kindAnyOf(ImmutableSet.of(Kind.NEW_CLASS, Kind.NEW_ARRAY)));

  private static final Matcher<MethodInvocationTree> STRING_LITERAL_ARG_MATCHER =
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/HeldLockSet.java`
#### Snippet
```java

  private HeldLockSet() {
    this(Empty.<GuardedByExpression>set());
  }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/AnnotationInfo.java`
#### Snippet
```java

  public static AnnotationInfo create(String typeName) {
    return create(typeName, ImmutableSet.<String>of());
  }
}
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/HeldLockAnalyzer.java`
#### Snippet
```java
    /** Matcher for ReadWriteLock lock accessors. */
    private static final Matcher<ExpressionTree> READ_WRITE_ACCESSOR_MATCHER =
        Matchers.<ExpressionTree>anyOf(
            instanceMethod().onDescendantOf(READ_WRITE_LOCK_CLASS).named("readLock"),
            instanceMethod().onDescendantOf(READ_WRITE_LOCK_CLASS).named("writeLock"));
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/HeldLockAnalyzer.java`
#### Snippet
```java
    /** Matcher for methods that release lock resources. */
    private static final Matcher<ExpressionTree> UNLOCK_MATCHER =
        Matchers.<ExpressionTree>anyOf(unlockMatchers());

    private static Iterable<Matcher<ExpressionTree>> unlockMatchers() {
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableAnalysis.java`
#### Snippet
```java
    // Recursive case: check if the supertype is 'effectively' immutable.
    Violation info =
        checkForImmutability(Optional.<ClassTree>empty(), immutableTyParams, superType, reporter);
    if (!info.isPresent()) {
      return Violation.absent();
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `check_api/src/main/java/com/google/errorprone/matchers/ChildMultiMatcher.java`
#### Snippet
```java
      return nodeMatcher.matches(last.tree(), last.state())
          ? MatchResult.match(last.tree())
          : MatchResult.<N>none();
    }
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `check_api/src/main/java/com/google/errorprone/matchers/ChildMultiMatcher.java`
#### Snippet
```java
      }
      ImmutableList<N> allTheTrees = matchingTrees.build();
      return allTheTrees.isEmpty() ? MatchResult.<N>none() : MatchResult.match(allTheTrees);
    }
  }
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `check_api/src/main/java/com/google/errorprone/matchers/ChildMultiMatcher.java`
#### Snippet
```java

    public static <T extends Tree> MatchResult<T> none() {
      return create(ImmutableList.<T>of(), /* matches= */ false);
    }

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `check_api/src/main/java/com/google/errorprone/matchers/Description.java`
#### Snippet
```java
          "<no match>",
          "<no match>",
          ImmutableList.<Fix>of(),
          Optional.of(SUGGESTION));

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `check_api/src/main/java/com/google/errorprone/matchers/JUnitMatchers.java`
#### Snippet
```java
          methodNameStartsWith("test"),
          methodHasNoParameters(),
          Matchers.<MethodTree>hasModifier(Modifier.PUBLIC),
          methodReturns(VOID_TYPE));

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `check_api/src/main/java/com/google/errorprone/matchers/JUnitMatchers.java`
#### Snippet
```java
      allOf(
          not(hasAnnotation(JUNIT4_RUN_WITH_ANNOTATION)),
          not(Matchers.<ClassTree>hasModifier(Modifier.ABSTRACT)),
          nestingKind(TOP_LEVEL));

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `check_api/src/main/java/com/google/errorprone/matchers/JUnitMatchers.java`
#### Snippet
```java
              methodHasVisibility(MethodVisibility.Visibility.PUBLIC),
              methodHasVisibility(MethodVisibility.Visibility.PROTECTED)),
          not(Matchers.<MethodTree>hasModifier(Modifier.ABSTRACT)),
          not(Matchers.<MethodTree>hasModifier(Modifier.STATIC)),
          methodReturns(VOID_TYPE));
```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `check_api/src/main/java/com/google/errorprone/matchers/JUnitMatchers.java`
#### Snippet
```java
              methodHasVisibility(MethodVisibility.Visibility.PROTECTED)),
          not(Matchers.<MethodTree>hasModifier(Modifier.ABSTRACT)),
          not(Matchers.<MethodTree>hasModifier(Modifier.STATIC)),
          methodReturns(VOID_TYPE));

```

### RedundantTypeArguments
Explicit type arguments can be inferred
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
  public static <T extends Tree> Matcher<T> anyOf(Matcher<? super T>... matchers) {
    // IntelliJ claims it can infer <Matcher<? super T>>, but blaze can't (b/132970194).
    return anyOf(Arrays.<Matcher<? super T>>asList(matchers));
  }

```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `core/src/main/java/com/google/errorprone/refaster/Bindings.java`
#### Snippet
```java

  @Override
  protected Map<Key<?>, Object> delegate() {
    return contents;
  }
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `core/src/main/java/com/google/errorprone/refaster/Bindings.java`
#### Snippet
```java

  @Override
  public void putAll(Map<? extends Key<?>, ? extends Object> map) {
    standardPutAll(map);
  }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `core/src/main/java/com/google/errorprone/bugpatterns/flogger/FloggerArgumentToString.java`
#### Snippet
```java
    final Supplier<String> source;
    final Type type;
    @Nullable final Character placeholder;

    private Parameter(ExpressionTree expression, char placeholder) {
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/InlinabilityResult.java`
#### Snippet
```java
    REUSE_OF_ARGUMENTS("Implementations cannot use an argument more than once:");

    private final @Nullable String errorMessage;

    InlineValidationErrorReason(@Nullable String errorMessage) {
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `docgen/src/main/java/com/google/errorprone/BugPatternFileGenerator.java`
#### Snippet
```java

  @Override
  public boolean processLine(String line) throws IOException {
    BugPatternInstance pattern = new Gson().fromJson(line, BugPatternInstance.class);
    pattern.severity = severityRemapper.apply(pattern);
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `docgen/src/main/java/com/google/errorprone/BugPatternFileGenerator.java`
#### Snippet
```java

  /** The base url for links to bugpatterns. */
  @Nullable private final String baseUrl;

  public BugPatternFileGenerator(
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
  }

  @Nullable private static final Class<?> CONSTANT_CASE_LABEL_TREE = constantCaseLabelTree();
  @Nullable private static final Class<?> YIELD_TREE = yieldTree();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java

  @Nullable private static final Class<?> CONSTANT_CASE_LABEL_TREE = constantCaseLabelTree();
  @Nullable private static final Class<?> YIELD_TREE = yieldTree();

  @Nullable
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/NullnessPropagationTransfer.java`
#### Snippet
```java

  /** Cached local inference results for nullability annotations on type parameters */
  @Nullable private transient InferredNullability inferenceResults;

  @Override
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `check_api/src/main/java/com/google/errorprone/matchers/Description.java`
#### Snippet
```java

  /** The raw link URL for the check. May be null if there is no link. */
  @Nullable private final String linkUrl;

  /**
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodInvocationMatcher.java`
#### Snippet
```java

    private final Set<Node> states;
    @Nullable final Set<Node> def;
    final SetMultimap<Token, Node> mapping;

```

### NullableProblems
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

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `core/src/main/java/com/google/errorprone/bugpatterns/ReturnValueIgnored.java`
#### Snippet
```java
   * threading constructs which do not return the same type as the receiver. This check does not
   * deal with them, since the fix is less straightforward. See a list of the SpotBugs checks here:
   * https://github.com/spotbugs/spotbugs/blob/master/spotbugs/src/main/java/edu/umd/cs/findbugs/ba/CheckReturnAnnotationDatabase.java
   */
  private static final ImmutableSet<String> TYPES_TO_CHECK =
```

### JavadocLinkAsPlainText
Link specified as plain text
in `check_api/src/main/java/com/google/errorprone/ErrorProneOptions.java`
#### Snippet
```java
 * Processes command-line options specific to error-prone.
 *
 * <p>Documentation for the available flags are available at https://errorprone.infoflags
 *
 * @author eaftan@google.com (Eddie Aftandilian)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `check_api/src/main/java/com/google/errorprone/util/OperatorPrecedence.java`
#### Snippet
```java
 * The precedence for an operator kind in the {@link com.sun.source.tree} API.
 *
 * <p>As documented at: http://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
 */
public enum OperatorPrecedence {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `check_api/src/main/java/com/google/errorprone/util/SourceCodeEscapers.java`
#### Snippet
```java
 *
 * <p>This is a subset of source code escapers that are in the process of being open-sources as part
 * of guava, see: https://github.com/google/guava/issues/1620
 */
// TODO(cushon): migrate to the guava version once it is open-sourced, and delete this
```

### JavadocLinkAsPlainText
Link specified as plain text
in `check_api/src/main/java/com/google/errorprone/names/NeedlemanWunschEditDistance.java`
#### Snippet
```java
 * times as expensive as editing {@code Christopher} into {@code Christophe}.
 *
 * <p>See http://en.wikipedia.org/wiki/Needleman-Wunsch_algorithm
 *
 * @author alanw@google.com (Alan Wendt)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
   *
   * <p>Prefer this to {@link Symbol#packge}, which throws a {@link NullPointerException} for
   * symbols that are not contained by a package: https://bugs.openjdk.java.net/browse/JDK-8231911
   */
  @Nullable
```

### JavadocLinkAsPlainText
Link specified as plain text
in `annotations/src/main/java/com/google/errorprone/annotations/Modifier.java`
#### Snippet
```java
 *
 * <ul>
 *   <li>https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.1.1
 *   <li>https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.3.1
 *   <li>https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.4.3
```

### JavadocLinkAsPlainText
Link specified as plain text
in `annotations/src/main/java/com/google/errorprone/annotations/Modifier.java`
#### Snippet
```java
 * <ul>
 *   <li>https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.1.1
 *   <li>https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.3.1
 *   <li>https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.4.3
 *   <li>https://docs.oracle.com/javase/specs/jls/se11/html/jls-9.html#jls-9.4
```

### JavadocLinkAsPlainText
Link specified as plain text
in `annotations/src/main/java/com/google/errorprone/annotations/Modifier.java`
#### Snippet
```java
 *   <li>https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.1.1
 *   <li>https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.3.1
 *   <li>https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.4.3
 *   <li>https://docs.oracle.com/javase/specs/jls/se11/html/jls-9.html#jls-9.4
 * </ul>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `annotations/src/main/java/com/google/errorprone/annotations/Modifier.java`
#### Snippet
```java
 *   <li>https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.3.1
 *   <li>https://docs.oracle.com/javase/specs/jls/se11/html/jls-8.html#jls-8.4.3
 *   <li>https://docs.oracle.com/javase/specs/jls/se11/html/jls-9.html#jls-9.4
 * </ul>
 */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `annotations/src/main/java/com/google/errorprone/annotations/ThreadSafe.java`
#### Snippet
```java
 * </ul>
 *
 * Also see https://errorprone.info/bugpattern/ThreadSafe
 */
// TODO(b/112275411): when fixed, delete the comment above about non-private fields
```

### JavadocLinkAsPlainText
Link specified as plain text
in `annotations/src/main/java/com/google/errorprone/annotations/concurrent/LazyInit.java`
#### Snippet
```java
 *
 * <p>The need for using the {@code local} variable is detailed in
 * http://jeremymanson.blogspot.com/2008/12/benign-data-races-in-java.html (see, particularly, the
 * part after "Now, let's break the code").
 *
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ConstantExpressions.java`
#### Snippet
```java
  private static final Pattern NOT_NOW = Pattern.compile("^?!(now)");

  private final Matcher<ExpressionTree> basePureMethods =
      anyOf(
          staticMethod()
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
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

### IgnoreResultOfCall
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

### IgnoreResultOfCall
Result of `LocalDate.parse()` is ignored
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
          .put("java.time.Duration", java.time.Duration::parse)
          .put("java.time.Instant", java.time.Instant::parse)
          .put("java.time.LocalDate", java.time.LocalDate::parse)
          .put("java.time.LocalDateTime", java.time.LocalDateTime::parse)
          .put("java.time.LocalTime", java.time.LocalTime::parse)
```

### IgnoreResultOfCall
Result of `LocalDateTime.parse()` is ignored
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
          .put("java.time.Instant", java.time.Instant::parse)
          .put("java.time.LocalDate", java.time.LocalDate::parse)
          .put("java.time.LocalDateTime", java.time.LocalDateTime::parse)
          .put("java.time.LocalTime", java.time.LocalTime::parse)
          .put("java.time.MonthDay", java.time.MonthDay::parse)
```

### IgnoreResultOfCall
Result of `LocalTime.parse()` is ignored
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
          .put("java.time.LocalDate", java.time.LocalDate::parse)
          .put("java.time.LocalDateTime", java.time.LocalDateTime::parse)
          .put("java.time.LocalTime", java.time.LocalTime::parse)
          .put("java.time.MonthDay", java.time.MonthDay::parse)
          .put("java.time.OffsetDateTime", java.time.OffsetDateTime::parse)
```

### IgnoreResultOfCall
Result of `OffsetDateTime.parse()` is ignored
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
          .put("java.time.LocalTime", java.time.LocalTime::parse)
          .put("java.time.MonthDay", java.time.MonthDay::parse)
          .put("java.time.OffsetDateTime", java.time.OffsetDateTime::parse)
          .put("java.time.OffsetTime", java.time.OffsetTime::parse)
          .put("java.time.Period", java.time.Period::parse)
```

### IgnoreResultOfCall
Result of `OffsetTime.parse()` is ignored
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
          .put("java.time.MonthDay", java.time.MonthDay::parse)
          .put("java.time.OffsetDateTime", java.time.OffsetDateTime::parse)
          .put("java.time.OffsetTime", java.time.OffsetTime::parse)
          .put("java.time.Period", java.time.Period::parse)
          .put("java.time.Year", java.time.Year::parse)
```

### IgnoreResultOfCall
Result of `ZonedDateTime.parse()` is ignored
in `core/src/main/java/com/google/errorprone/bugpatterns/AlwaysThrows.java`
#### Snippet
```java
          .put("java.time.Year", java.time.Year::parse)
          .put("java.time.YearMonth", java.time.YearMonth::parse)
          .put("java.time.ZonedDateTime", java.time.ZonedDateTime::parse)
          .buildOrThrow();

```

### IgnoreResultOfCall
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

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `started()` is identical to its super method
in `check_api/src/main/java/com/google/errorprone/BaseErrorProneJavaCompiler.java`
#### Snippet
```java

    @Override
    public void started(TaskEvent event) {}

    @Override
```

### RedundantMethodOverride
Method `visitSwitchExpression()` is identical to its super method
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/NullnessPropagationTransfer.java`
#### Snippet
```java

  @Override
  Nullness visitSwitchExpression(SwitchExpressionNode node, SubNodeValues inputs, Updates updates) {
    return NULLABLE;
  }
```

## RuleId[id=OptionalAssignedToNull]
### OptionalAssignedToNull
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

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
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

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Optional chain can be simplified
in `core/src/main/java/com/google/errorprone/refaster/ImportPolicy.java`
#### Snippet
```java
                .map(JCCompilationUnit::getImports)
                .map(Collection::stream)
                .orElse(Stream.of())
                .filter(whichImports::existingImportMatches)
                .map(imp -> getQualifiedIdentifier(imp).toString()))
```

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/StaticMockMember.java`
#### Snippet
```java
        SuggestedFixes.removeModifiers(varTree, state, Modifier.STATIC);

    if (!optionalFix.isPresent()) {
      return NO_MATCH;
    }
```

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/JUnitParameterMethodNotFound.java`
#### Snippet
```java
            .findFirst();

    if (!parametersAnnotation.isPresent()) {
      return Description.NO_MATCH;
    }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/JUnitParameterMethodNotFound.java`
#### Snippet
```java
        getParamAssignmentTree(annotationsArguments, /* parameterName= */ "source");

    if (!paramSourceAssignmentTree.isPresent()) {
      return ImmutableSet.of();
    }
```

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractReturnValueIgnored.java`
#### Snippet
```java
     */
    if (parent.getKind() == EXPRESSION_STATEMENT
        && !constantExpressions.constantExpression(invocationTree, state).isPresent()
        && considerBlanketFixes) {
      ImmutableSet<String> identifiersInScope =
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/ApiDiffChecker.java`
#### Snippet
```java

  private boolean classOrEnclosingClassIsForbiddenByAnnotation(Symbol clazz, VisitorState state) {
    if (!alsoForbidApisAnnotated.isPresent()) {
      return false;
    }
```

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/HeldLockAnalyzer.java`
#### Snippet
```java
          GuardedByBinder.bindExpression(guardedMemberExpression, state, flags);

      if (!guardedMember.isPresent()) {
        return Optional.empty();
      }
```

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/InferredNullability.java`
#### Snippet
```java
      }

      checkState(!inferredMemoTable.put(iv, result).isPresent());
      return result;
    }
```

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

### SimplifyOptionalCallChains
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

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
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

## RuleId[id=SimplifiableBooleanExpression]
### SimplifiableBooleanExpression
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

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
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

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'equals()' call
in `core/src/main/java/com/google/errorprone/bugpatterns/SelfAssignment.java`
#### Snippet
```java
    Symbol lhsClass = ASTHelpers.getSymbol(parent);
    if (rhsClass != null
        && lhsClass != null
        && rhsClass.equals(lhsClass)
        && rhs.getIdentifier().contentEquals(tree.getName())) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `currentCharacter` initializer `0` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeEscape.java`
#### Snippet
```java

    private int position = 0;
    private char currentCharacter = 0;
    private boolean isUnicode = false;
    private int lastBackslash = 0;
```

### UnusedAssignment
Variable `origVariable` initializer `null` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/HidingField.java`
#### Snippet
```java
      VisitorState visitorState) {
    Iterator<VariableTree> origVariableIterator = originalClassMembers.iterator();
    VariableTree origVariable = null;

    while (origVariableIterator.hasNext()) {
```

### UnusedAssignment
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

### UnusedAssignment
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

### UnusedAssignment
Variable `enclosingMethod` initializer `null` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/ProvidesNull.java`
#### Snippet
```java

    TreePath path = state.getPath();
    MethodTree enclosingMethod = null;
    while (true) {
      if (path == null || path.getLeaf() instanceof LambdaExpressionTree) {
```

### UnusedAssignment
Variable `trailingComment` initializer `null` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/NoCanIgnoreReturnValueOnClasses.java`
#### Snippet
```java
      public Void visitMethod(MethodTree methodTree, Void unused) {
        if (shouldAddCirv(methodTree, state)) {
          String trailingComment = null;

          if (methodTree.getReturnType() == null) { // constructor
```

### UnusedAssignment
Variable `diff` initializer `null` is redundant
in `check_api/src/main/java/com/google/errorprone/apply/PatchFileDestination.java`
#### Snippet
```java
      List<String> originalLines = LINE_SPLITTER.splitToList(oldSource);

      Patch<String> diff = null;
      try {
        diff = DiffUtils.diff(originalLines, LINE_SPLITTER.splitToList(newSource));
```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `core/src/main/java/com/google/errorprone/refaster/Bindings.java`
#### Snippet
```java

  @Override
  public void putAll(Map<? extends Key<?>, ? extends Object> map) {
    standardPutAll(map);
  }
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/ResultUsePolicyAnalyzer.java`
#### Snippet
```java

  /** Returns a map of optional metadata about why this check matched the given expression. */
  default ImmutableMap<String, ? extends Object> getMatchMetadata(E expression, C context) {
    return ImmutableMap.of();
  }
```

## RuleId[id=ConstantValue]
### ConstantValue
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

### ConstantValue
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

### ConstantValue
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

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
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

### OptionalGetWithoutIsPresent
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

### OptionalGetWithoutIsPresent
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

### OptionalGetWithoutIsPresent
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

### OptionalGetWithoutIsPresent
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

### OptionalGetWithoutIsPresent
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

### OptionalGetWithoutIsPresent
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

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
                        .assignmentSwitchAnalysisResult()
                        .assignmentTargetOptional()
                        .get()))
            .append(" ")
            // Invariant: always present when a finding exists
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
                    .assignmentSwitchAnalysisResult()
                    .assignmentSourceCodeOptional()
                    .get())
            .append(" ")
            .append("switch ")
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
        statements.isEmpty()
            ? getBlockEnd(state, caseTree, cases, caseIndex)
            : state.getEndPosition(Streams.findLast(statements.stream()).get());

    if (!statements.isEmpty() && statements.get(0).getKind().equals(EXPRESSION_STATEMENT)) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
        rhs = Optional.of(((AssignmentTree) expression).getExpression());
      }
      codeBlockStart = getStartPosition(rhs.get());
    } else {
      codeBlockStart = extractLhsComments(caseTree, state, transformedBlockBuilder);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
        filteredStatements.isEmpty()
            ? getBlockEnd(state, caseTree, cases, caseIndex)
            : state.getEndPosition(Streams.findLast(filteredStatements.stream()).get());
    transformedBlockBuilder.append(state.getSourceCode(), codeBlockStart, codeBlockEnd);

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
        statements.isEmpty()
            ? getBlockEnd(state, caseTree, cases, caseIndex)
            : state.getEndPosition(Streams.findLast(statements.stream()).get());

    if (statements.size() == 1 && statements.get(0).getKind().equals(RETURN)) {
```

### OptionalGetWithoutIsPresent
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

### OptionalGetWithoutIsPresent
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

### OptionalGetWithoutIsPresent
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

### OptionalGetWithoutIsPresent
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

### OptionalGetWithoutIsPresent
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

### OptionalGetWithoutIsPresent
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

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `check_api/src/main/java/com/google/errorprone/matchers/Description.java`
#### Snippet
```java

  public BugPattern.SeverityLevel severity() {
    return severity.get();
  }

```

### OptionalGetWithoutIsPresent
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

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
    checkNotNull(classTree);
    List<String> members = Lists.asList(firstMember, otherMembers);
    return addMembers(classTree, state, where, members).get();
  }

```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
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

## RuleId[id=ReplaceInefficientStreamCount]
### ReplaceInefficientStreamCount
Can be replaced with 'stream.findAny().isEmpty()'
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
    for (int caseIndex = 0; caseIndex < cases.size(); caseIndex++) {
      CaseTree caseTree = cases.get(caseIndex);
      boolean isDefaultCase = (getExpressions(caseTree).count() == 0);
      hasDefaultCase |= isDefaultCase;
      // Accumulate enum values included in this case
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/errorprone/bugpatterns/DistinctVarargsChecker.java`
#### Snippet
```java
    }
    if (ALL_DISTINCT_ARG_MATCHER.matches(tree, state)) {
      return checkDistinctArguments(state, tree.getArguments());
    }
    if (EVEN_PARITY_DISTINCT_ARG_MATCHER.matches(tree, state)) {
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/errorprone/bugpatterns/DistinctVarargsChecker.java`
#### Snippet
```java
        arguments.add(tree.getArguments().get(index));
      }
      return checkDistinctArguments(state, arguments);
    }
    if (EVEN_AND_ODD_PARITY_DISTINCT_ARG_MATCHER.matches(tree, state)) {
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/errorprone/bugpatterns/DistinctVarargsChecker.java`
#### Snippet
```java
        }
      }
      return checkDistinctArguments(state, evenParityArguments, oddParityArguments);
    }
    return Description.NO_MATCH;
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueImmutableFields.java`
#### Snippet
```java
public class AutoValueImmutableFields extends BugChecker implements ClassTreeMatcher {
  private static final ImmutableListMultimap<String, Matcher<MethodTree>> REPLACEMENT_TO_MATCHERS =
      ImmutableListMultimap.<String, Matcher<MethodTree>>builder()
          .put("ImmutableCollection", returning("java.util.Collection"))
          .putAll(
              "ImmutableList",
              methodReturns(isArrayType()),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueImmutableFields.java`
#### Snippet
```java
public class AutoValueImmutableFields extends BugChecker implements ClassTreeMatcher {
  private static final ImmutableListMultimap<String, Matcher<MethodTree>> REPLACEMENT_TO_MATCHERS =
      ImmutableListMultimap.<String, Matcher<MethodTree>>builder()
          .put("ImmutableCollection", returning("java.util.Collection"))
          .putAll(
              "ImmutableList",
              methodReturns(isArrayType()),
              returning("java.util.List"),
              returning("java.util.ArrayList"),
              returning("java.util.LinkedList"),
              returning("com.google.common.collect.ImmutableList.Builder"))
          .putAll(
              "ImmutableMap",
              returning("java.util.Map"),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueImmutableFields.java`
#### Snippet
```java
public class AutoValueImmutableFields extends BugChecker implements ClassTreeMatcher {
  private static final ImmutableListMultimap<String, Matcher<MethodTree>> REPLACEMENT_TO_MATCHERS =
      ImmutableListMultimap.<String, Matcher<MethodTree>>builder()
          .put("ImmutableCollection", returning("java.util.Collection"))
          .putAll(
              "ImmutableList",
              methodReturns(isArrayType()),
              returning("java.util.List"),
              returning("java.util.ArrayList"),
              returning("java.util.LinkedList"),
              returning("com.google.common.collect.ImmutableList.Builder"))
          .putAll(
              "ImmutableMap",
              returning("java.util.Map"),
              returning("java.util.HashMap"),
              returning("java.util.LinkedHashMap"),
              returning("com.google.common.collect.ImmutableMap.Builder"))
          .putAll(
              "ImmutableSortedMap",
              returning("java.util.SortedMap"),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueImmutableFields.java`
#### Snippet
```java
public class AutoValueImmutableFields extends BugChecker implements ClassTreeMatcher {
  private static final ImmutableListMultimap<String, Matcher<MethodTree>> REPLACEMENT_TO_MATCHERS =
      ImmutableListMultimap.<String, Matcher<MethodTree>>builder()
          .put("ImmutableCollection", returning("java.util.Collection"))
          .putAll(
              "ImmutableList",
              methodReturns(isArrayType()),
              returning("java.util.List"),
              returning("java.util.ArrayList"),
              returning("java.util.LinkedList"),
              returning("com.google.common.collect.ImmutableList.Builder"))
          .putAll(
              "ImmutableMap",
              returning("java.util.Map"),
              returning("java.util.HashMap"),
              returning("java.util.LinkedHashMap"),
              returning("com.google.common.collect.ImmutableMap.Builder"))
          .putAll(
              "ImmutableSortedMap",
              returning("java.util.SortedMap"),
              returning("java.util.TreeMap"),
              returning("com.google.common.collect.ImmutableSortedMap.Builder"))
          .putAll(
              "ImmutableBiMap",
              returning("com.google.common.collect.BiMap"),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueImmutableFields.java`
#### Snippet
```java
public class AutoValueImmutableFields extends BugChecker implements ClassTreeMatcher {
  private static final ImmutableListMultimap<String, Matcher<MethodTree>> REPLACEMENT_TO_MATCHERS =
      ImmutableListMultimap.<String, Matcher<MethodTree>>builder()
          .put("ImmutableCollection", returning("java.util.Collection"))
          .putAll(
              "ImmutableList",
              methodReturns(isArrayType()),
              returning("java.util.List"),
              returning("java.util.ArrayList"),
              returning("java.util.LinkedList"),
              returning("com.google.common.collect.ImmutableList.Builder"))
          .putAll(
              "ImmutableMap",
              returning("java.util.Map"),
              returning("java.util.HashMap"),
              returning("java.util.LinkedHashMap"),
              returning("com.google.common.collect.ImmutableMap.Builder"))
          .putAll(
              "ImmutableSortedMap",
              returning("java.util.SortedMap"),
              returning("java.util.TreeMap"),
              returning("com.google.common.collect.ImmutableSortedMap.Builder"))
          .putAll(
              "ImmutableBiMap",
              returning("com.google.common.collect.BiMap"),
              returning("com.google.common.collect.ImmutableBiMap.Builder"))
          .putAll(
              "ImmutableSet",
              returning("java.util.Set"),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueImmutableFields.java`
#### Snippet
```java
public class AutoValueImmutableFields extends BugChecker implements ClassTreeMatcher {
  private static final ImmutableListMultimap<String, Matcher<MethodTree>> REPLACEMENT_TO_MATCHERS =
      ImmutableListMultimap.<String, Matcher<MethodTree>>builder()
          .put("ImmutableCollection", returning("java.util.Collection"))
          .putAll(
              "ImmutableList",
              methodReturns(isArrayType()),
              returning("java.util.List"),
              returning("java.util.ArrayList"),
              returning("java.util.LinkedList"),
              returning("com.google.common.collect.ImmutableList.Builder"))
          .putAll(
              "ImmutableMap",
              returning("java.util.Map"),
              returning("java.util.HashMap"),
              returning("java.util.LinkedHashMap"),
              returning("com.google.common.collect.ImmutableMap.Builder"))
          .putAll(
              "ImmutableSortedMap",
              returning("java.util.SortedMap"),
              returning("java.util.TreeMap"),
              returning("com.google.common.collect.ImmutableSortedMap.Builder"))
          .putAll(
              "ImmutableBiMap",
              returning("com.google.common.collect.BiMap"),
              returning("com.google.common.collect.ImmutableBiMap.Builder"))
          .putAll(
              "ImmutableSet",
              returning("java.util.Set"),
              returning("java.util.HashSet"),
              returning("java.util.LinkedHashSet"),
              returning("com.google.common.collect.ImmutableSet.Builder"))
          .putAll(
              "ImmutableSortedSet",
              returning("java.util.SortedSet"),
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueImmutableFields.java`
#### Snippet
```java
mmutableListMultimap<String, Matcher<MethodTree>> REPLACEMENT_TO_MATCHERS =
      ImmutableListMultimap.<String, Matcher<MethodTree>>builder()
          .put("ImmutableCollection", returning("java.util.Collection"))
          .putAll(
              "ImmutableList",
              methodReturns(isArrayType()),
              returning("java.util.List"),
              returning("java.util.ArrayList"),
              returning("java.util.LinkedList"),
              returning("com.google.common.collect.ImmutableList.Builder"))
          .putAll(
              "ImmutableMap",
              returning("java.util.Map"),
              returning("java.util.HashMap"),
              returning("java.util.LinkedHashMap"),
              returning("com.google.common.collect.ImmutableMap.Builder"))
          .putAll(
              "ImmutableSortedMap",
              returning("java.util.SortedMap"),
              returning("java.util.TreeMap"),
              returning("com.google.common.collect.ImmutableSortedMap.Builder"))
          .putAll(
              "ImmutableBiMap",
              returning("com.google.common.collect.BiMap"),
              returning("com.google.common.collect.ImmutableBiMap.Builder"))
          .putAll(
              "ImmutableSet",
              returning("java.util.Set"),
              returning("java.util.HashSet"),
              returning("java.util.LinkedHashSet"),
              returning("com.google.common.collect.ImmutableSet.Builder"))
          .putAll(
              "ImmutableSortedSet",
              returning("java.util.SortedSet"),
              returning("java.util.TreeSet"),
              returning("com.google.common.collect.ImmutableSortedSet.Builder"))
          .putAll(
              "ImmutableMultimap",
              returning("com.google.common.co
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueImmutableFields.java`
#### Snippet
```java
ImmutableListMultimap.<String, Matcher<MethodTree>>builder()
          .put("ImmutableCollection", returning("java.util.Collection"))
          .putAll(
              "ImmutableList",
              methodReturns(isArrayType()),
              returning("java.util.List"),
              returning("java.util.ArrayList"),
              returning("java.util.LinkedList"),
              returning("com.google.common.collect.ImmutableList.Builder"))
          .putAll(
              "ImmutableMap",
              returning("java.util.Map"),
              returning("java.util.HashMap"),
              returning("java.util.LinkedHashMap"),
              returning("com.google.common.collect.ImmutableMap.Builder"))
          .putAll(
              "ImmutableSortedMap",
              returning("java.util.SortedMap"),
              returning("java.util.TreeMap"),
              returning("com.google.common.collect.ImmutableSortedMap.Builder"))
          .putAll(
              "ImmutableBiMap",
              returning("com.google.common.collect.BiMap"),
              returning("com.google.common.collect.ImmutableBiMap.Builder"))
          .putAll(
              "ImmutableSet",
              returning("java.util.Set"),
              returning("java.util.HashSet"),
              returning("java.util.LinkedHashSet"),
              returning("com.google.common.collect.ImmutableSet.Builder"))
          .putAll(
              "ImmutableSortedSet",
              returning("java.util.SortedSet"),
              returning("java.util.TreeSet"),
              returning("com.google.common.collect.ImmutableSortedSet.Builder"))
          .putAll(
              "ImmutableMultimap",
              returning("com.google.common.collect.Multimap"),
              returning("com.google.common.collect.ImmutableMultimap.Builder"))
          .putAll
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueImmutableFields.java`
#### Snippet
```java
ImmutableListMultimap.<String, Matcher<MethodTree>>builder()
          .put("ImmutableCollection", returning("java.util.Collection"))
          .putAll(
              "ImmutableList",
              methodReturns(isArrayType()),
              returning("java.util.List"),
              returning("java.util.ArrayList"),
              returning("java.util.LinkedList"),
              returning("com.google.common.collect.ImmutableList.Builder"))
          .putAll(
              "ImmutableMap",
              returning("java.util.Map"),
              returning("java.util.HashMap"),
              returning("java.util.LinkedHashMap"),
              returning("com.google.common.collect.ImmutableMap.Builder"))
          .putAll(
              "ImmutableSortedMap",
              returning("java.util.SortedMap"),
              returning("java.util.TreeMap"),
              returning("com.google.common.collect.ImmutableSortedMap.Builder"))
          .putAll(
              "ImmutableBiMap",
              returning("com.google.common.collect.BiMap"),
              returning("com.google.common.collect.ImmutableBiMap.Builder"))
          .putAll(
              "ImmutableSet",
              returning("java.util.Set"),
              returning("java.util.HashSet"),
              returning("java.util.LinkedHashSet"),
              returning("com.google.common.collect.ImmutableSet.Builder"))
          .putAll(
              "ImmutableSortedSet",
              returning("java.util.SortedSet"),
              returning("java.util.TreeSet"),
              returning("com.google.common.collect.ImmutableSortedSet.Builder"))
          .putAll(
              "ImmutableMultimap",
              returning("com.google.common.collect.Multimap"),
              returning("com.google.common.collect.ImmutableMultimap.Builder"))
          .putAll(
              "ImmutableListMultimap",
              returning("com.google.common.collect.ListMultimap"),
              returning("com.google.common.collect.ImmutableListMultimap.Builder"))
          .putAll
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueImmutableFields.java`
#### Snippet
```java
ImmutableListMultimap.<String, Matcher<MethodTree>>builder()
          .put("ImmutableCollection", returning("java.util.Collection"))
          .putAll(
              "ImmutableList",
              methodReturns(isArrayType()),
              returning("java.util.List"),
              returning("java.util.ArrayList"),
              returning("java.util.LinkedList"),
              returning("com.google.common.collect.ImmutableList.Builder"))
          .putAll(
              "ImmutableMap",
              returning("java.util.Map"),
              returning("java.util.HashMap"),
              returning("java.util.LinkedHashMap"),
              returning("com.google.common.collect.ImmutableMap.Builder"))
          .putAll(
              "ImmutableSortedMap",
              returning("java.util.SortedMap"),
              returning("java.util.TreeMap"),
              returning("com.google.common.collect.ImmutableSortedMap.Builder"))
          .putAll(
              "ImmutableBiMap",
              returning("com.google.common.collect.BiMap"),
              returning("com.google.common.collect.ImmutableBiMap.Builder"))
          .putAll(
              "ImmutableSet",
              returning("java.util.Set"),
              returning("java.util.HashSet"),
              returning("java.util.LinkedHashSet"),
              returning("com.google.common.collect.ImmutableSet.Builder"))
          .putAll(
              "ImmutableSortedSet",
              returning("java.util.SortedSet"),
              returning("java.util.TreeSet"),
              returning("com.google.common.collect.ImmutableSortedSet.Builder"))
          .putAll(
              "ImmutableMultimap",
              returning("com.google.common.collect.Multimap"),
              returning("com.google.common.collect.ImmutableMultimap.Builder"))
          .putAll(
              "ImmutableListMultimap",
              returning("com.google.common.collect.ListMultimap"),
              returning("com.google.common.collect.ImmutableListMultimap.Builder"))
          .putAll(
              "ImmutableSetMultimap",
              returning("com.google.common.collect.SetMultimap"),
              returning("com.google.common.collect.ImmutableSetMultimap.Builder"))
          .putAll
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueImmutableFields.java`
#### Snippet
```java
ImmutableListMultimap.<String, Matcher<MethodTree>>builder()
          .put("ImmutableCollection", returning("java.util.Collection"))
          .putAll(
              "ImmutableList",
              methodReturns(isArrayType()),
              returning("java.util.List"),
              returning("java.util.ArrayList"),
              returning("java.util.LinkedList"),
              returning("com.google.common.collect.ImmutableList.Builder"))
          .putAll(
              "ImmutableMap",
              returning("java.util.Map"),
              returning("java.util.HashMap"),
              returning("java.util.LinkedHashMap"),
              returning("com.google.common.collect.ImmutableMap.Builder"))
          .putAll(
              "ImmutableSortedMap",
              returning("java.util.SortedMap"),
              returning("java.util.TreeMap"),
              returning("com.google.common.collect.ImmutableSortedMap.Builder"))
          .putAll(
              "ImmutableBiMap",
              returning("com.google.common.collect.BiMap"),
              returning("com.google.common.collect.ImmutableBiMap.Builder"))
          .putAll(
              "ImmutableSet",
              returning("java.util.Set"),
              returning("java.util.HashSet"),
              returning("java.util.LinkedHashSet"),
              returning("com.google.common.collect.ImmutableSet.Builder"))
          .putAll(
              "ImmutableSortedSet",
              returning("java.util.SortedSet"),
              returning("java.util.TreeSet"),
              returning("com.google.common.collect.ImmutableSortedSet.Builder"))
          .putAll(
              "ImmutableMultimap",
              returning("com.google.common.collect.Multimap"),
              returning("com.google.common.collect.ImmutableMultimap.Builder"))
          .putAll(
              "ImmutableListMultimap",
              returning("com.google.common.collect.ListMultimap"),
              returning("com.google.common.collect.ImmutableListMultimap.Builder"))
          .putAll(
              "ImmutableSetMultimap",
              returning("com.google.common.collect.SetMultimap"),
              returning("com.google.common.collect.ImmutableSetMultimap.Builder"))
          .putAll(
              "ImmutableMultiset",
              returning("com.google.common.collect.Multiset"),
              returning("com.google.common.collect.ImmutableMultiset.Builder"))
          .putAll
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueImmutableFields.java`
#### Snippet
```java
ImmutableListMultimap.<String, Matcher<MethodTree>>builder()
          .put("ImmutableCollection", returning("java.util.Collection"))
          .putAll(
              "ImmutableList",
              methodReturns(isArrayType()),
              returning("java.util.List"),
              returning("java.util.ArrayList"),
              returning("java.util.LinkedList"),
              returning("com.google.common.collect.ImmutableList.Builder"))
          .putAll(
              "ImmutableMap",
              returning("java.util.Map"),
              returning("java.util.HashMap"),
              returning("java.util.LinkedHashMap"),
              returning("com.google.common.collect.ImmutableMap.Builder"))
          .putAll(
              "ImmutableSortedMap",
              returning("java.util.SortedMap"),
              returning("java.util.TreeMap"),
              returning("com.google.common.collect.ImmutableSortedMap.Builder"))
          .putAll(
              "ImmutableBiMap",
              returning("com.google.common.collect.BiMap"),
              returning("com.google.common.collect.ImmutableBiMap.Builder"))
          .putAll(
              "ImmutableSet",
              returning("java.util.Set"),
              returning("java.util.HashSet"),
              returning("java.util.LinkedHashSet"),
              returning("com.google.common.collect.ImmutableSet.Builder"))
          .putAll(
              "ImmutableSortedSet",
              returning("java.util.SortedSet"),
              returning("java.util.TreeSet"),
              returning("com.google.common.collect.ImmutableSortedSet.Builder"))
          .putAll(
              "ImmutableMultimap",
              returning("com.google.common.collect.Multimap"),
              returning("com.google.common.collect.ImmutableMultimap.Builder"))
          .putAll(
              "ImmutableListMultimap",
              returning("com.google.common.collect.ListMultimap"),
              returning("com.google.common.collect.ImmutableListMultimap.Builder"))
          .putAll(
              "ImmutableSetMultimap",
              returning("com.google.common.collect.SetMultimap"),
              returning("com.google.common.collect.ImmutableSetMultimap.Builder"))
          .putAll(
              "ImmutableMultiset",
              returning("com.google.common.collect.Multiset"),
              returning("com.google.common.collect.ImmutableMultiset.Builder"))
          .putAll(
              "ImmutableSortedMultiset",
              returning("com.google.common.collect.SortedMultiset"),
              returning("com.google.common.collect.ImmutableSortedMultiset.Builder"))
          .putAll
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueImmutableFields.java`
#### Snippet
```java
ImmutableListMultimap.<String, Matcher<MethodTree>>builder()
          .put("ImmutableCollection", returning("java.util.Collection"))
          .putAll(
              "ImmutableList",
              methodReturns(isArrayType()),
              returning("java.util.List"),
              returning("java.util.ArrayList"),
              returning("java.util.LinkedList"),
              returning("com.google.common.collect.ImmutableList.Builder"))
          .putAll(
              "ImmutableMap",
              returning("java.util.Map"),
              returning("java.util.HashMap"),
              returning("java.util.LinkedHashMap"),
              returning("com.google.common.collect.ImmutableMap.Builder"))
          .putAll(
              "ImmutableSortedMap",
              returning("java.util.SortedMap"),
              returning("java.util.TreeMap"),
              returning("com.google.common.collect.ImmutableSortedMap.Builder"))
          .putAll(
              "ImmutableBiMap",
              returning("com.google.common.collect.BiMap"),
              returning("com.google.common.collect.ImmutableBiMap.Builder"))
          .putAll(
              "ImmutableSet",
              returning("java.util.Set"),
              returning("java.util.HashSet"),
              returning("java.util.LinkedHashSet"),
              returning("com.google.common.collect.ImmutableSet.Builder"))
          .putAll(
              "ImmutableSortedSet",
              returning("java.util.SortedSet"),
              returning("java.util.TreeSet"),
              returning("com.google.common.collect.ImmutableSortedSet.Builder"))
          .putAll(
              "ImmutableMultimap",
              returning("com.google.common.collect.Multimap"),
              returning("com.google.common.collect.ImmutableMultimap.Builder"))
          .putAll(
              "ImmutableListMultimap",
              returning("com.google.common.collect.ListMultimap"),
              returning("com.google.common.collect.ImmutableListMultimap.Builder"))
          .putAll(
              "ImmutableSetMultimap",
              returning("com.google.common.collect.SetMultimap"),
              returning("com.google.common.collect.ImmutableSetMultimap.Builder"))
          .putAll(
              "ImmutableMultiset",
              returning("com.google.common.collect.Multiset"),
              returning("com.google.common.collect.ImmutableMultiset.Builder"))
          .putAll(
              "ImmutableSortedMultiset",
              returning("com.google.common.collect.SortedMultiset"),
              returning("com.google.common.collect.ImmutableSortedMultiset.Builder"))
          .putAll(
              "ImmutableTable",
              returning("com.google.common.collect.Table"),
              returning("com.google.common.collect.ImmutableTable.Builder"))
          .putAll
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueImmutableFields.java`
#### Snippet
```java
ImmutableListMultimap.<String, Matcher<MethodTree>>builder()
          .put("ImmutableCollection", returning("java.util.Collection"))
          .putAll(
              "ImmutableList",
              methodReturns(isArrayType()),
              returning("java.util.List"),
              returning("java.util.ArrayList"),
              returning("java.util.LinkedList"),
              returning("com.google.common.collect.ImmutableList.Builder"))
          .putAll(
              "ImmutableMap",
              returning("java.util.Map"),
              returning("java.util.HashMap"),
              returning("java.util.LinkedHashMap"),
              returning("com.google.common.collect.ImmutableMap.Builder"))
          .putAll(
              "ImmutableSortedMap",
              returning("java.util.SortedMap"),
              returning("java.util.TreeMap"),
              returning("com.google.common.collect.ImmutableSortedMap.Builder"))
          .putAll(
              "ImmutableBiMap",
              returning("com.google.common.collect.BiMap"),
              returning("com.google.common.collect.ImmutableBiMap.Builder"))
          .putAll(
              "ImmutableSet",
              returning("java.util.Set"),
              returning("java.util.HashSet"),
              returning("java.util.LinkedHashSet"),
              returning("com.google.common.collect.ImmutableSet.Builder"))
          .putAll(
              "ImmutableSortedSet",
              returning("java.util.SortedSet"),
              returning("java.util.TreeSet"),
              returning("com.google.common.collect.ImmutableSortedSet.Builder"))
          .putAll(
              "ImmutableMultimap",
              returning("com.google.common.collect.Multimap"),
              returning("com.google.common.collect.ImmutableMultimap.Builder"))
          .putAll(
              "ImmutableListMultimap",
              returning("com.google.common.collect.ListMultimap"),
              returning("com.google.common.collect.ImmutableListMultimap.Builder"))
          .putAll(
              "ImmutableSetMultimap",
              returning("com.google.common.collect.SetMultimap"),
              returning("com.google.common.collect.ImmutableSetMultimap.Builder"))
          .putAll(
              "ImmutableMultiset",
              returning("com.google.common.collect.Multiset"),
              returning("com.google.common.collect.ImmutableMultiset.Builder"))
          .putAll(
              "ImmutableSortedMultiset",
              returning("com.google.common.collect.SortedMultiset"),
              returning("com.google.common.collect.ImmutableSortedMultiset.Builder"))
          .putAll(
              "ImmutableTable",
              returning("com.google.common.collect.Table"),
              returning("com.google.common.collect.ImmutableTable.Builder"))
          .putAll(
              "ImmutableRangeMap",
              returning("com.google.common.collect.RangeMap"),
              returning("com.google.common.collect.ImmutableRangeMap.Builder"))
          .putAll
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueImmutableFields.java`
#### Snippet
```java
ImmutableListMultimap.<String, Matcher<MethodTree>>builder()
          .put("ImmutableCollection", returning("java.util.Collection"))
          .putAll(
              "ImmutableList",
              methodReturns(isArrayType()),
              returning("java.util.List"),
              returning("java.util.ArrayList"),
              returning("java.util.LinkedList"),
              returning("com.google.common.collect.ImmutableList.Builder"))
          .putAll(
              "ImmutableMap",
              returning("java.util.Map"),
              returning("java.util.HashMap"),
              returning("java.util.LinkedHashMap"),
              returning("com.google.common.collect.ImmutableMap.Builder"))
          .putAll(
              "ImmutableSortedMap",
              returning("java.util.SortedMap"),
              returning("java.util.TreeMap"),
              returning("com.google.common.collect.ImmutableSortedMap.Builder"))
          .putAll(
              "ImmutableBiMap",
              returning("com.google.common.collect.BiMap"),
              returning("com.google.common.collect.ImmutableBiMap.Builder"))
          .putAll(
              "ImmutableSet",
              returning("java.util.Set"),
              returning("java.util.HashSet"),
              returning("java.util.LinkedHashSet"),
              returning("com.google.common.collect.ImmutableSet.Builder"))
          .putAll(
              "ImmutableSortedSet",
              returning("java.util.SortedSet"),
              returning("java.util.TreeSet"),
              returning("com.google.common.collect.ImmutableSortedSet.Builder"))
          .putAll(
              "ImmutableMultimap",
              returning("com.google.common.collect.Multimap"),
              returning("com.google.common.collect.ImmutableMultimap.Builder"))
          .putAll(
              "ImmutableListMultimap",
              returning("com.google.common.collect.ListMultimap"),
              returning("com.google.common.collect.ImmutableListMultimap.Builder"))
          .putAll(
              "ImmutableSetMultimap",
              returning("com.google.common.collect.SetMultimap"),
              returning("com.google.common.collect.ImmutableSetMultimap.Builder"))
          .putAll(
              "ImmutableMultiset",
              returning("com.google.common.collect.Multiset"),
              returning("com.google.common.collect.ImmutableMultiset.Builder"))
          .putAll(
              "ImmutableSortedMultiset",
              returning("com.google.common.collect.SortedMultiset"),
              returning("com.google.common.collect.ImmutableSortedMultiset.Builder"))
          .putAll(
              "ImmutableTable",
              returning("com.google.common.collect.Table"),
              returning("com.google.common.collect.ImmutableTable.Builder"))
          .putAll(
              "ImmutableRangeMap",
              returning("com.google.common.collect.RangeMap"),
              returning("com.google.common.collect.ImmutableRangeMap.Builder"))
          .putAll(
              "ImmutableRangeSet",
              returning("com.google.common.collect.RangeSet"),
              returning("com.google.common.collect.ImmutableRangeSet.Builder"))
          .putAll
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/errorprone/bugpatterns/UndefinedEquals.java`
#### Snippet
```java
      Type multimapType = COM_GOOGLE_COMMON_COLLECT_MULTIMAP.get(state);
      Optional<SuggestedFix> fix =
          firstPresent(
              generateTruthFix.apply(iterableType, "containsExactlyElementsIn"),
              generateTruthFix.apply(multimapType, "containsExactlyEntriesIn"));
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/errorprone/bugpatterns/UndefinedEquals.java`
#### Snippet
```java
          return Optional.empty();
        };
    return firstPresent(
        generateCharSequenceFix.apply(receiver, argument),
        generateCharSequenceFix.apply(argument, receiver));
```

### UNCHECKED_WARNING
Unchecked generics array creation for varargs parameter
in `core/src/main/java/com/google/errorprone/bugpatterns/CheckReturnValue.java`
#### Snippet
```java

    ResultUsePolicyEvaluator.Builder<VisitorState, Symbol, MethodSymbol> builder =
        ResultUsePolicyEvaluator.builder(METHOD_INFO)
            .addRules(
                // The order of these rules matters somewhat because when checking a method, we'll
                // evaluate them in the order they're listed here and stop as soon as one of them
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `TYPE_USE`
in `core/src/main/java/com/google/errorprone/bugpatterns/NullableOnContainingClass.java`
#### Snippet
```java

  /**
   * True if this annotation is only {@link TYPE_USE}, or only {@link TYPE_USE} and {@link
   * TYPE_PARAMETER}.
   */
```

### JavadocReference
Cannot resolve symbol `TYPE_USE`
in `core/src/main/java/com/google/errorprone/bugpatterns/NullableOnContainingClass.java`
#### Snippet
```java

  /**
   * True if this annotation is only {@link TYPE_USE}, or only {@link TYPE_USE} and {@link
   * TYPE_PARAMETER}.
   */
```

### JavadocReference
Cannot resolve symbol `TYPE_PARAMETER`
in `core/src/main/java/com/google/errorprone/bugpatterns/NullableOnContainingClass.java`
#### Snippet
```java
  /**
   * True if this annotation is only {@link TYPE_USE}, or only {@link TYPE_USE} and {@link
   * TYPE_PARAMETER}.
   */
  private static boolean isOnlyTypeAnnotation(Symbol anno) {
```

### JavadocReference
Symbol `dagger.Module` is inaccessible from here
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/Util.java`
#### Snippet
```java

  /**
   * Matches Dagger 2 {@linkplain dagger.Module modules} and {@linkplain
   * dagger.producers.ProducersModule producer modules} that could contain abstract binding methods.
   *
```

### JavadocReference
Cannot resolve symbol `dagger.producers.ProducersModule`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/Util.java`
#### Snippet
```java
  /**
   * Matches Dagger 2 {@linkplain dagger.Module modules} and {@linkplain
   * dagger.producers.ProducersModule producer modules} that could contain abstract binding methods.
   *
   * <ul>
```

### JavadocReference
Symbol `dagger.Provides` is inaccessible from here
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/Util.java`
#### Snippet
```java
   * <ul>
   *   <li>an interface or a class with no superclass
   *   <li>no instance {@link dagger.Provides} or {@link dagger.producers.Produces} methods
   * </ul>
   */
```

### JavadocReference
Symbol `dagger.producers.Produces` is inaccessible from here
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/Util.java`
#### Snippet
```java
   * <ul>
   *   <li>an interface or a class with no superclass
   *   <li>no instance {@link dagger.Provides} or {@link dagger.producers.Produces} methods
   * </ul>
   */
```

### JavadocReference
Symbol `dagger.Module` is inaccessible from here
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/Util.java`
#### Snippet
```java

  /**
   * Matches Dagger 2 {@linkplain dagger.Module modules} and {@linkplain
   * dagger.producers.ProducersModule producer modules}.
   */
```

### JavadocReference
Cannot resolve symbol `dagger.producers.ProducersModule`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/Util.java`
#### Snippet
```java
  /**
   * Matches Dagger 2 {@linkplain dagger.Module modules} and {@linkplain
   * dagger.producers.ProducersModule producer modules}.
   */
  static final Matcher<Tree> IS_DAGGER_2_MODULE =
```

### JavadocReference
Cannot resolve symbol `Diff`
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/ApiDiff.java`
#### Snippet
```java
  }

  /** Converts a {@link Diff} to a {@link ApiDiff}. */
  public static ApiDiff fromProto(Diff diff) {
    ImmutableSet.Builder<String> unsupportedClasses = ImmutableSet.builder();
```

### JavadocReference
Cannot resolve symbol `ApiDiffProto.Diff`
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/ApiDiff.java`
#### Snippet
```java
  }

  /** Converts a {@link ApiDiff} to a {@link ApiDiffProto.Diff}. */
  public Diff toProto() {
    ApiDiffProto.Diff.Builder builder = ApiDiffProto.Diff.newBuilder();
```

### JavadocReference
Cannot resolve symbol `GuardedBy`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedBySymbolResolver.java`
#### Snippet
```java
  }

  /** Information about a method that is associated with a {@link GuardedBy} annotation. */
  @AutoValue
  abstract static class MethodInfo {
```

### JavadocReference
Symbol `com.google.errorprone.bugpatterns.threadsafety.ThreadSafeChecker` is inaccessible from here
in `annotations/src/main/java/com/google/errorprone/annotations/ThreadSafe.java`
#### Snippet
```java
 *   <li>For humans: it indicates that the class/interface (and subclasses) is thread-safe
 *   <li>For machines: it causes the annotated class/interface -- and all of its subtypes -- to be
 *       validated by the {@link com.google.errorprone.bugpatterns.threadsafety.ThreadSafeChecker}
 *       {@code BugChecker}.
 * </ul>
```

### JavadocReference
Symbol `com.google.errorprone.bugpatterns.threadsafety.GuardedByChecker` is inaccessible from here
in `annotations/src/main/java/com/google/errorprone/annotations/ThreadSafe.java`
#### Snippet
```java
 *
 * <p>The remainder of this javadoc describes the heuristics enforced by {@code ThreadSafeChecker}
 * and the related {@link com.google.errorprone.bugpatterns.threadsafety.GuardedByChecker} and
 * {@link com.google.errorprone.bugpatterns.threadsafety.ImmutableChecker} on which the former
 * relies.
```

### JavadocReference
Symbol `com.google.errorprone.bugpatterns.threadsafety.ImmutableChecker` is inaccessible from here
in `annotations/src/main/java/com/google/errorprone/annotations/ThreadSafe.java`
#### Snippet
```java
 * <p>The remainder of this javadoc describes the heuristics enforced by {@code ThreadSafeChecker}
 * and the related {@link com.google.errorprone.bugpatterns.threadsafety.GuardedByChecker} and
 * {@link com.google.errorprone.bugpatterns.threadsafety.ImmutableChecker} on which the former
 * relies.
 *
```

### JavadocReference
Symbol `com.google.errorprone.bugpatterns.threadsafety.WellKnownMutability` is inaccessible from here
in `annotations/src/main/java/com/google/errorprone/annotations/ThreadSafe.java`
#### Snippet
```java
 * <ul>
 *   <li>it is listed as a well-known immutable type in {@link
 *       com.google.errorprone.bugpatterns.threadsafety.WellKnownMutability} (e.g. a field of type
 *       {@link String}); and/or
 *   <li>it is listed as a well-known thread-safe type in {@link
```

### JavadocReference
Symbol `com.google.errorprone.bugpatterns.threadsafety.WellKnownThreadSafety` is inaccessible from here
in `annotations/src/main/java/com/google/errorprone/annotations/ThreadSafe.java`
#### Snippet
```java
 *       {@link String}); and/or
 *   <li>it is listed as a well-known thread-safe type in {@link
 *       com.google.errorprone.bugpatterns.threadsafety.WellKnownThreadSafety} (e.g. a field of type
 *       {@link java.util.concurrent.atomic.AtomicBoolean}); and/or
 *   <li>it is annotated with {@link Immutable}; and/or
```

### JavadocReference
Symbol `javax.annotation.concurrent.GuardedBy` is inaccessible from here
in `annotations/src/main/java/com/google/errorprone/annotations/ThreadSafe.java`
#### Snippet
```java
 * <p>This first requirement means the type is at least inherently shallowly thread-safe.
 *
 * <p>Fields annotated with {@link javax.annotation.concurrent.GuardedBy} are likely the meat of a
 * mutable thread-safe class: these are things that need to be mutated, but should be done so in a
 * safe manner -- i.e., (most likely) in critical sections of code that protect their access by
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/main/java/com/google/errorprone/bugpatterns/Finally.java`
#### Snippet
```java
    KEEP_LOOKING,
    NO_MATCH,
    FOUND_ERROR;
  }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/main/java/com/google/errorprone/bugpatterns/ComparisonContractViolated.java`
#### Snippet
```java
    ZERO,
    POSITIVE_CONSTANT,
    NONCONSTANT;
  }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/main/java/com/google/errorprone/bugpatterns/TruthGetOrDefault.java`
#### Snippet
```java
    SAME,
    DIFFERENT,
    UNKNOWN;
  }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
    MAYBE_FALLS_THRU,
    DEFINITELY_DOES_FALL_THRU
  };
  // Tri-state to represent whether cases within a single switch statement meet an (unspecified)
  // qualification predicate
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/main/java/com/google/errorprone/bugpatterns/TryFailThrowable.java`
#### Snippet
```java
  enum HasOtherParameters {
    TRUE,
    FALSE;
  }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/main/java/com/google/errorprone/bugpatterns/TryFailThrowable.java`
#### Snippet
```java
    JAVA_LANG_THROWABLE,
    SOME_ASSERTION_FAILURE,
    ;
  }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/InlinabilityResult.java`
#### Snippet
```java
    PACKAGE,
    PROTECTED,
    PUBLIC;
  }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedByExpression.java`
#### Snippet
```java
    LOCAL_VARIABLE,
    SELECT,
    ERROR;
  }

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `check_api/src/main/java/com/google/errorprone/predicates/type/Array.java`
#### Snippet
```java
      return type != null && state.getTypes().isArray(type);
    }
  };
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `test_helpers/src/main/java/com/google/errorprone/DiagnosticTestHelper.java`
#### Snippet
```java
  enum LookForCheckNameInDiagnostic {
    YES,
    NO;
  }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
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

### DataFlowIssue
Argument `getLabel()` might be null
in `core/src/main/java/com/google/errorprone/refaster/UContinue.java`
#### Snippet
```java

  private ULabeledStatement.Key key() {
    return new ULabeledStatement.Key(getLabel());
  }

```

### DataFlowIssue
Method invocation `getKind` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/UTypeVarIdent.java`
#### Snippet
```java
        public Boolean visitIdentifier(IdentifierTree node, Void p) {
          return ASTHelpers.getSymbol(node) != null
              && ASTHelpers.getSymbol(node).getKind() == ElementKind.PACKAGE;
        }
      };
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getQualifiedName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/UClassIdent.java`
#### Snippet
```java

  public static UClassIdent create(ClassSymbol sym) {
    return create(ASTHelpers.outermostClass(sym).getQualifiedName(), sym.getQualifiedName());
  }

```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `inline` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/UReturn.java`
#### Snippet
```java
  @Override
  public JCReturn inline(Inliner inliner) throws CouldNotResolveImportException {
    return inliner.maker().Return(getExpression().inline(inliner));
  }

```

### DataFlowIssue
Method invocation `asType` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/UMemberSelect.java`
#### Snippet
```java
          .unify(fieldAccess.getIdentifier(), unifier)
          .thenChoose(unifications(getExpression(), fieldAccess.getExpression()))
          .thenChoose(unifications(type(), ASTHelpers.getSymbol(fieldAccess).asType()));
    }
    return Choice.none();
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `attribute` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/NullablePrimitiveArray.java`
#### Snippet
```java
    }
    Attribute.Compound target =
        ASTHelpers.getSymbol(annotation).attribute(state.getSymtab().annotationTargetType.tsym);
    if (!isTypeAnnotation(target)) {
      return NO_MATCH;
```

### DataFlowIssue
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

### DataFlowIssue
Argument `templateExpressions(modifiers.getAnnotations())` might be null
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
    return UModifiers.create(
        ((JCModifiers) modifiers).flags,
        cast(templateExpressions(modifiers.getAnnotations()), UAnnotation.class));
  }

```

### DataFlowIssue
Argument `sym` might be null
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
    if (sym instanceof ClassSymbol) {
      return UClassIdent.create((ClassSymbol) sym);
    } else if (isStatic(sym)) {
      ExpressionTree selected = tree.getExpression();
      checkState(
```

### DataFlowIssue
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

### DataFlowIssue
Argument `templateExpressions(tree.getAnnotations())` might be null
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
        tree.getName(),
        templateTypeExpressions(tree.getBounds()),
        cast(templateExpressions(tree.getAnnotations()), UAnnotation.class));
  }

```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getQualifiedName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/RestrictedApiChecker.java`
#### Snippet
```java
  public Description matchAnnotation(AnnotationTree tree, VisitorState state) {
    // TODO(bangert): Validate all the fields
    if (!getSymbol(tree).getQualifiedName().contentEquals(RestrictedApi.class.getName())) {
      return NO_MATCH;
    }
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/NestedInstanceOfConditions.java`
#### Snippet
```java
        return visitorState
            .getSourceForNode(variableExpressionTree)
            .equals(visitorState.getSourceForNode(((AssignmentTree) tree).getVariable()));
      }

```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `isPrimitive` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UseCorrectAssertInTests.java`
#### Snippet
```java
      // case: "assert expr [op] null"
      addFix(fix, (JCExpression) expr1, foundAssert, state, isEqual ? IS_NULL : IS_NOT_NULL);
    } else if (ASTHelpers.getType(expr1).isPrimitive() || ASTHelpers.getType(expr2).isPrimitive()) {
      // case: eg. "assert expr == 1"
      addFix(
```

### DataFlowIssue
Method invocation `isPrimitive` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UseCorrectAssertInTests.java`
#### Snippet
```java
      // case: "assert expr [op] null"
      addFix(fix, (JCExpression) expr1, foundAssert, state, isEqual ? IS_NULL : IS_NOT_NULL);
    } else if (ASTHelpers.getType(expr1).isPrimitive() || ASTHelpers.getType(expr2).isPrimitive()) {
      // case: eg. "assert expr == 1"
      addFix(
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Dereference of `getSymbol(t)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/OrphanedFormatString.java`
#### Snippet
```java
                  t instanceof MethodInvocationTree
                      && !findMatchingMethods(
                              getSymbol(t).name,
                              ms ->
                                  hasAnnotation(ms, FormatMethod.class, s)
```

### DataFlowIssue
Method invocation `getQualifiedName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ModifyCollectionInEnhancedForLoop.java`
#### Snippet
```java
            s ->
                enclosingPackage(s.asElement())
                    .getQualifiedName()
                    .toString()
                    .startsWith("java.util.concurrent"))) {
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Dereference of `calledSymbol` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/AutoValueBuilderDefaultsInConstructor.java`
#### Snippet
```java
            t -> {
              Symbol calledSymbol = getSymbol(t.getMethodSelect());
              return calledSymbol.owner.equals(symbol.owner)
                  && calledSymbol.getModifiers().contains(Modifier.ABSTRACT);
            })
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `subSequence` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractUseSwitch.java`
#### Snippet
```java
    int start = ((JCTree) statements.get(0)).getStartPosition();
    int end = state.getEndPosition(getLast(statements));
    return state.getSourceCode().subSequence(start, end);
  }

```

### DataFlowIssue
Argument `optionalOfInvocationTree` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/OptionalOfRedundantMethod.java`
#### Snippet
```java
    ImmutableList.Builder<SuggestedFix> fixesBuilder = ImmutableList.builder();
    fixesBuilder.add(
        SuggestedFixes.renameMethodInvocation(optionalOfInvocationTree, nullableMethodName, state));

    if (state.getPath().getParentPath().getLeaf() instanceof ExpressionStatementTree) {
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/LockNotBeforeTry.java`
#### Snippet
```java
    return receiver != null
        && UNLOCK.matches(node, state)
        && state.getSourceForNode(receiver).equals(state.getSourceForNode(lockee));
  }

```

### DataFlowIssue
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

### DataFlowIssue
Argument `varSymbol` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/ImmutableMemberCollection.java`
#### Snippet
```java
        Symbol varSymbol = getSymbol(assignmentTree.getVariable());
        if (replaceableVars.containsKey(varSymbol) && assignmentTree.getExpression() != null) {
          initTreesBuilder.put(varSymbol, assignmentTree.getExpression());
        }
        return scan(assignmentTree.getExpression(), visitorState);
```

### DataFlowIssue
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

### DataFlowIssue
Argument `getSymbol(initializer)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/TryWithResourcesVariable.java`
#### Snippet
```java
        continue;
      }
      if (!isConsideredFinal(getSymbol(initializer))) {
        continue;
      }
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `members` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/TypeNameShadowing.java`
#### Snippet
```java
                ctx ->
                    ctx.tree.getTag() == Tag.CLASSDEF
                        ? ASTHelpers.getSymbol(ctx.tree).members().getSymbols()
                        : ctx.info.getLocalElements())
            .flatMap(
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getSimpleName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/LiteProtoToString.java`
#### Snippet
```java
  private static boolean isStrippedLogMessage(Tree tree) {
    for (; tree instanceof MethodInvocationTree; tree = getReceiver((MethodInvocationTree) tree)) {
      if (METHODS_STRIPPED_BY_OPTIMIZER.contains(getSymbol(tree).getSimpleName().toString())) {
        return true;
      }
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getSimpleName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/DirectInvocationOnMock.java`
#### Snippet
```java
                          "Methods should not be directly invoked on the mock `%s`. Should this be"
                              + " part of a verify(..) call?",
                          getSymbol(receiver).getSimpleName()));
          if (getCurrentPath().getParentPath().getLeaf() instanceof ExpressionStatementTree) {
            var fix = SuggestedFix.builder();
```

### DataFlowIssue
Method invocation `getQualifiedName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/NonCanonicalType.java`
#### Snippet
```java
    switch (tree.getKind()) {
      case IDENTIFIER:
        return getSymbol(tree).getQualifiedName().toString();
      case MEMBER_SELECT:
        MemberSelectTree memberSelectTree = (MemberSelectTree) tree;
```

### DataFlowIssue
Method invocation `getQualifiedName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/NonCanonicalType.java`
#### Snippet
```java
        Symbol expressionSymbol = getSymbol(memberSelectTree.getExpression());
        if (!(expressionSymbol instanceof TypeSymbol)) {
          return getSymbol(tree).getQualifiedName().toString();
        }
        return getNonCanonicalName(memberSelectTree.getExpression())
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/NarrowingCompoundAssignment.java`
#### Snippet
```java

    // e.g. 's *= 42' -> 's = (short) (s * 42)'
    String castType = getType(tree.getVariable()).toString();
    String replacement = String.format("%s = (%s) (%s %s %s)", var, castType, var, op, expr);
    return Optional.of(SuggestedFix.replace(tree, replacement));
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getKind` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/LongDoubleConversion.java`
#### Snippet
```java

  private void checkArgument(ExpressionTree argument, VisitorState state) {
    if (!getType(argument).getKind().equals(TypeKind.LONG)) {
      return;
    }
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java
  public Description matchCompilationUnit(CompilationUnitTree tree, VisitorState state) {
    RangeSet<Integer> violations = TreeRangeSet.create();
    String sourceCode = state.getSourceCode().toString();

    for (int i = 0; i < sourceCode.length(); ++i) {
```

### DataFlowIssue
Method invocation `getVariable` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
            s -> unifyExpression(node.getExpression(), s),
            (variable, expr) -> maker().Assignop(((JCAssignOp) node).getTag(), variable, expr))
        .condition(assignOp -> !(assignOp.result().getVariable() instanceof PlaceholderParamIdent));
  }

```

### DataFlowIssue
Method invocation `getExpression` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
            s ->
                !MUTATING_UNARY_TAGS.contains(tag)
                    || !(s.result().getExpression() instanceof PlaceholderParamIdent));
  }

```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `reverse` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
                              treeState.withResult(s.result().prepend(treeState.result()))));
    }
    return choice.transform(s -> s.withResult(s.result().reverse()));
  }

```

### DataFlowIssue
Method invocation `getVariable` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
            s -> unifyExpression(node.getExpression(), s),
            maker()::Assign)
        .condition(s -> !(s.result().getVariable() instanceof PlaceholderParamIdent));
  }

```

### DataFlowIssue
Method invocation `replaceAll` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/NarrowCalculation.java`
#### Snippet
```java

  private static String forceLiteralType(ExpressionTree tree, Type targetType, VisitorState state) {
    return state.getSourceForNode(tree).replaceAll("[LlFfDd]$", "")
        + suffixForType(targetType, state);
  }
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessarySetDefault.java`
#### Snippet
```java

  static Matcher<ExpressionTree> sourceMatcher(String source) {
    return (tree, state) -> state.getSourceForNode(tree).equals(source);
  }
}
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getQualifiedName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryAnonymousClass.java`
#### Snippet
```java
    }
    if (tree.getModifiers().getAnnotations().stream()
        .anyMatch(at -> getSymbol(at).getQualifiedName().contentEquals("org.mockito.Spy"))) {
      return NO_MATCH;
    }
```

### DataFlowIssue
Method invocation `getKind` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryAnonymousClass.java`
#### Snippet
```java
        // If anything other than the abstract method is used on this anonymous class, we can't hope
        // to generate a fix.
        if (symbol.getKind() != ElementKind.METHOD
            || !symbol.getModifiers().contains(Modifier.ABSTRACT)) {
          failed = true;
```

### DataFlowIssue
Argument `sym` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryAnonymousClass.java`
#### Snippet
```java
            node,
            String.format(
                "%s::%s", isStatic(sym) ? sym.owner.enclClass().getSimpleName() : "this", newName));
      }
    }
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `isConstructor` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/MustBeClosedChecker.java`
#### Snippet
```java
                return false;
              }
              if (t instanceof MethodInvocationTree && ASTHelpers.getSymbol(t).isConstructor()) {
                // Invocations of constructors, like `this()` and `super()`, act kinda weird.
                // they're handled specially in matchClass, and should be ignored here.
```

### DataFlowIssue
Argument `state.getTypeFromString(MustBeClosed.class.getCanonicalName())` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/MustBeClosedChecker.java`
#### Snippet
```java
        String suggestedFixName =
            SuggestedFixes.qualifyType(
                state, builder, state.getTypeFromString(MustBeClosed.class.getCanonicalName()));
        SuggestedFix fix = builder.prefixWith(methodTree, "@" + suggestedFixName + " ").build();

```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/BoxedPrimitiveConstructor.java`
#### Snippet
```java

    if (COMPARE_TO.matches(parent, state)
        && ASTHelpers.getReceiver((ExpressionTree) parent).equals(tree)) {
      JCMethodInvocation compareTo = (JCMethodInvocation) parent;
      // e.g. new Integer($A).compareTo($B) -> Integer.compare($A, $B)
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getTypeParameters` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/TypeParameterNaming.java`
#### Snippet
```java
          && !TypeParameterNamingClassification.classify(typeName.name.toString()).isValidName()) {
        ImmutableList<String> typeVarsInScope =
            Streams.concat(enclosingTypeSymbols.stream(), sym.getTypeParameters().stream())
                .map(v -> v.name.toString())
                .collect(toImmutableList());
```

### DataFlowIssue
Argument `getSymbol(annotation)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/NullableOnContainingClass.java`
#### Snippet
```java

    for (AnnotationTree annotation : annotations) {
      if (!isOnlyTypeAnnotation(getSymbol(annotation))) {
        continue;
      }
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `charValue` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ComparisonOutOfRange.java`
#### Snippet
```java
          Number numericConstantValue =
              constValue(constant) instanceof Character
                  ? Long.valueOf(((Character) constValue(constant)).charValue())
                  : (Number) constValue(constant);

```

### DataFlowIssue
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

### DataFlowIssue
Argument `targetType` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/StronglyType.java`
#### Snippet
```java
    SuggestedFix.Builder fix = SuggestedFix.builder();
    Type targetType = getType(factory);
    String typeName = SuggestedFixes.qualifyType(state.withPath(variableTreePath), fix, targetType);

    fix.replace(
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Dereference of `getDeclaredSymbol(enclosingClass)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ChainedAssertionLosesContext.java`
#### Snippet
```java
     */
    return isSubtype(
        getDeclaredSymbol(enclosingClass).type, COM_GOOGLE_COMMON_TRUTH_SUBJECT.get(state), state);
  }

```

### DataFlowIssue
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

### DataFlowIssue
Argument `paramMethods` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/JUnitParameterMethodNotFound.java`
#### Snippet
```java
        String paramMethods =
            (String) ASTHelpers.constValue(paramMethodAssignmentTree.get().getExpression());
        Splitter.on(',').trimResults().splitToStream(paramMethods).forEach(requiredMethods::add);

        // If source argument is present in the annotation the method should be searched in the
```

### DataFlowIssue
Dereference of `ASTHelpers.enclosingClass(ASTHelpers.getSymbol(tree))` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/JUnitParameterMethodNotFound.java`
#### Snippet
```java

  private static Type getClassType(MethodTree tree) {
    return ASTHelpers.enclosingClass(ASTHelpers.getSymbol(tree)).type;
  }

```

### DataFlowIssue
Method invocation `getTypeArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/JUnitParameterMethodNotFound.java`
#### Snippet
```java

    ClassType classType = (ClassType) getType(paramSourceAssignmentTree.get().getExpression());
    Type typeArgument = classType.getTypeArguments().get(0);
    return getAllMethodIdentifiersForType(typeArgument, state);
  }
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `isSubClass` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/InconsistentCapitalization.java`
#### Snippet
```java
      }
      if (node instanceof ClassTree) {
        if (ASTHelpers.getSymbol(node).isSubClass(ASTHelpers.getSymbol(tree), state.getTypes())) {
          return "super.";
        }
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Argument `sym` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/ParameterName.java`
#### Snippet
```java
    }
    MethodSymbol sym = (MethodSymbol) ASTHelpers.getSymbol(tree);
    if (NamedParameterComment.containsSyntheticParameterName(sym)) {
      return;
    }
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `isConstructor` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ProtectedMembersInFinalClass.java`
#### Snippet
```java
                    m -> {
                      Symbol symbol = ASTHelpers.getSymbol(m);
                      return symbol.isConstructor()
                          ? symbol.owner.name.toString()
                          : symbol.name.toString();
```

### DataFlowIssue
Method invocation `flags` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/DepAnn.java`
#### Snippet
```java
    // (1)
    // javac sets the DEPRECATED bit in flags if the Javadoc contains @deprecated
    if ((symbol.flags() & DEPRECATED) == 0) {
      return Description.NO_MATCH;
    }
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `enclClass` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMustBeClosedChecker.java`
#### Snippet
```java
            Symbol sym = getSymbol(memberSelectTree);
            Type streamType = state.getTypeFromString(Stream.class.getName());
            if (isSubtype(sym.enclClass().asType(), streamType, state)
                && isSameType(type.getReturnType(), streamType, state)) {
              // skip enclosing method invocation
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getSimpleName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMustBeClosedChecker.java`
#### Snippet
```java
      switch (tree.getKind()) {
        case NEW_CLASS:
          symbolName = getSymbol(((NewClassTree) tree).getIdentifier()).getSimpleName().toString();
          break;
        case METHOD_INVOCATION:
```

### DataFlowIssue
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

### DataFlowIssue
Argument `sym` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryLambda.java`
#### Snippet
```java
        receiverCode = state.getSourceForNode(getReceiver(node));
      } else {
        receiverCode = isStatic(sym) ? sym.owner.enclClass().getSimpleName().toString() : "this";
      }
      fix.replace(node, String.format("%s::%s", receiverCode, newName));
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/FloatingPointAssertionWithinEpsilon.java`
#### Snippet
```java
    private static ExpressionTree getReceiverArgument(MethodInvocationTree tree) {
      ExpressionTree receiver = ASTHelpers.getReceiver(tree);
      return getOnlyElement(((MethodInvocationTree) receiver).getArguments());
    }

```

### DataFlowIssue
Method invocation `getSimpleName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/FloatingPointAssertionWithinEpsilon.java`
#### Snippet
```java
      ExpressionTree assertion = ASTHelpers.getReceiver(within);
      String replacementMethod =
          ASTHelpers.getSymbol(within).getSimpleName().toString().contains("Not")
              ? "isNotEqualTo"
              : "isEqualTo";
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `trim` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java

    // If code has comments, use braces for readability
    if (!transformedBlockSource.trim().equals(state.getSourceForNode(firstStatement).trim())) {
      return false;
    }
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
                && caseAssignmentTargetOptional.isPresent()
                && getSymbol(assignmentTargetOptional.get())
                    .equals(getSymbol(caseAssignmentTargetOptional.get())));

    if (compatibleOperator && compatibleReference) {
```

### DataFlowIssue
Argument `state.getSourceForNode( analysisResult .assignmentSwitch...` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
    StringBuilder replacementCodeBuilder =
        new StringBuilder(
                state.getSourceForNode(
                    analysisResult
                        .assignmentSwitchAnalysisResult()
                        .assignmentTargetOptional()
                        .get()))
            .append(" ")
            // Invariant: always present when a finding exists
```

### DataFlowIssue
Method invocation `subSequence` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
          state
              .getSourceCode()
              .subSequence(
                  state.getEndPosition(Iterables.getLast(filteredStatements)),
                  getStartPosition(
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/MixedMutabilityReturnType.java`
#### Snippet
```java
    public Void visitIdentifier(IdentifierTree identifier, Void unused) {
      Tree parent = getCurrentPath().getParentPath().getLeaf();
      if (!getSymbol(identifier).equals(symbol)) {
        return null;
      }
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `substring` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UndefinedEquals.java`
#### Snippet
```java
      String methodText =
          state.getSourceForNode(tree.getMethodSelect()); // e.g. "assertThat(foo).isEqualTo"
      String assertThatWithArg = methodText.substring(0, methodText.lastIndexOf('.'));

      // If both the argument and receiver are subtypes of the given type, rewrites the isEqualTo
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getQualifiedName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ReturnValueIgnored.java`
#### Snippet
```java
    Symbol symbol = getSymbol(tree);
    return symbol instanceof MethodSymbol
        && enclosingPackage(symbol.owner).getQualifiedName().contentEquals("java.util.function");
  }

```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/HidingField.java`
#### Snippet
```java
        && !parentVariable.getModifiers().contains(Modifier.PUBLIC)) { // package-private variable

      if (!enclosingPackage(parentVariable).equals(enclosingPackage(getSymbol(currClass)))) {
        return true;
      }
```

### DataFlowIssue
Method invocation `getSimpleName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/RedundantThrows.java`
#### Snippet
```java
                oxfordJoin(", ", sub),
                sub.size() == 1 ? "is a subtype" : "are subtypes",
                sym.getSimpleName()));
        toRemove.addAll(sub);
      }
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Argument `sym` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/BooleanParameter.java`
#### Snippet
```java
    }
    MethodSymbol sym = (MethodSymbol) ASTHelpers.getSymbol(tree);
    if (NamedParameterComment.containsSyntheticParameterName(sym)) {
      return;
    }
```

### DataFlowIssue
Dereference of `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/BadAnnotationImplementation.java`
#### Snippet
```java

    Symbol objectSymbol = state.getSymtab().objectType.tsym;
    if (equals.owner.equals(objectSymbol) || hashCode.owner.equals(objectSymbol)) {
      return describeMatch(classTree);
    }
```

### DataFlowIssue
Dereference of `hashCode` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/BadAnnotationImplementation.java`
#### Snippet
```java

    Symbol objectSymbol = state.getSymtab().objectType.tsym;
    if (equals.owner.equals(objectSymbol) || hashCode.owner.equals(objectSymbol)) {
      return describeMatch(classTree);
    }
```

### DataFlowIssue
Method invocation `isAnonymous` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/DoNotCallSuggester.java`
#### Snippet
```java

    // if the enclosing class is anonymous, exit
    if (enclosingClass.isAnonymous()) {
      return NO_MATCH;
    }
```

### DataFlowIssue
Argument `state.getSourceForNode(formatTree)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/PreconditionsInvalidPlaceholder.java`
#### Snippet
```java

    String fixedFormatString =
        BAD_PLACEHOLDER_REGEX.matcher(state.getSourceForNode(formatTree)).replaceAll("%s");
    if (expectedArguments(fixedFormatString) == tree.getArguments().size() - 2) {
      return describeMatch(formatTree, SuggestedFix.replace(formatTree, fixedFormatString));
```

### DataFlowIssue
Method invocation `isConstructor` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedMethod.java`
#### Snippet
```java
    fixNonConstructors(
        unusedMethods.values().stream()
            .filter(t -> !getSymbol(t.getLeaf()).isConstructor())
            .collect(toImmutableList()),
        state);
```

### DataFlowIssue
Method invocation `isConstructor` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedMethod.java`
#### Snippet
```java
    ImmutableListMultimap<Symbol, TreePath> unusedConstructors =
        unusedMethods.values().stream()
            .filter(t -> getSymbol(t.getLeaf()).isConstructor())
            .collect(toImmutableListMultimap(t -> getSymbol(t.getLeaf()).owner, t -> t));

```

### DataFlowIssue
Dereference of `getSymbol(t.getLeaf())` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedMethod.java`
#### Snippet
```java
        unusedMethods.values().stream()
            .filter(t -> getSymbol(t.getLeaf()).isConstructor())
            .collect(toImmutableListMultimap(t -> getSymbol(t.getLeaf()).owner, t -> t));

    fixConstructors(unusedConstructors, state);
```

### DataFlowIssue
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

### DataFlowIssue
Argument `state.findEnclosing(ClassTree.class)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/CheckedExceptionNotThrown.java`
#### Snippet
```java
    }
    return Streams.concat(
        Stream.of(tree.getBody()), fieldInitializers(state.findEnclosing(ClassTree.class)));
  }

```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `charAt` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryTypeArgument.java`
#### Snippet
```java
    CharSequence source = state.getSourceForNode(node);

    while (lower >= 0 && source.charAt(lower) != '<') {
      lower--;
    }
```

### DataFlowIssue
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

### DataFlowIssue
Dereference of `enclosingClass(methodSymbol)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/SelfAlwaysReturnsThis.java`
#### Snippet
```java

    // * have the same return type as the enclosing type
    if (!isSameType(getType(returnType), enclosingClass(methodSymbol).type, state)) {
      return NO_MATCH;
    }
```

### DataFlowIssue
Dereference of `multiByteReadMethod` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/InputStreamSlowMultibyteRead.java`
#### Snippet
```java
            ImmutableList.of());

    return multiByteReadMethod.owner.equals(thisClassSymbol)
        ? Description.NO_MATCH
        : maybeMatchReadByte(readByteMethod, state);
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getMembers` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ReplacementVariableFinder.java`
#### Snippet
```java

    ImmutableMultimap<Integer, JCVariableDecl> potentialReplacements =
        ASTHelpers.findEnclosingNode(state.getPath(), JCClassDecl.class).getMembers().stream()
            .filter(JCVariableDecl.class::isInstance)
            .map(JCVariableDecl.class::cast)
```

### DataFlowIssue
Method invocation `length` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeDirectionalityCharacters.java`
#### Snippet
```java
    CharSequence source = state.getSourceCode();

    for (int i = 0; i < source.length(); ++i) {
      char c = source.charAt(i);
      // Do not extract this switch to a method. It's ugly as-is, but profiling suggests this
```

### DataFlowIssue
Method invocation `getMethodSelect` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ImpossibleNullComparison.java`
#### Snippet
```java
                      format(
                          "%s(%s).isTrue()",
                          state.getSourceForNode(receiver.getMethodSelect()), r));
                })
            .orElse(SuggestedFix.emptyFix());
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getKind` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedVariable.java`
#### Snippet
```java
      Symbol symbol = getSymbol(tree.getVariable());
      // Check if it was actually assigned to at this depth (or is a parameter).
      if (!((assignmentSite.containsKey(symbol) && symbol.getKind() == ElementKind.LOCAL_VARIABLE)
          || symbol.getKind() == ElementKind.PARAMETER)) {
        return;
```

### DataFlowIssue
Method invocation `getKind` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedVariable.java`
#### Snippet
```java
      // Check if it was actually assigned to at this depth (or is a parameter).
      if (!((assignmentSite.containsKey(symbol) && symbol.getKind() == ElementKind.LOCAL_VARIABLE)
          || symbol.getKind() == ElementKind.PARAMETER)) {
        return;
      }
```

### DataFlowIssue
Method invocation `getKind` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedVariable.java`
#### Snippet
```java
      StatementTree statement = (StatementTree) usagePath.getLeaf();
      if (statement.getKind() == Kind.VARIABLE) {
        if (getSymbol(statement).getKind() == ElementKind.PARAMETER) {
          continue;
        }
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getTypeArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/IdentityHashMapBoxing.java`
#### Snippet
```java

  private Description checkTypes(ExpressionTree tree, VisitorState state) {
    List<Type> argumentTypes = ASTHelpers.getResultType(tree).getTypeArguments();
    if (argumentTypes.size() != 2) {
      return Description.NO_MATCH;
```

### DataFlowIssue
Method invocation `asType` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ForOverrideChecker.java`
#### Snippet
```java

    for (Symbol overriddenMethod : overriddenMethods) {
      Type declaringClass = ASTHelpers.outermostClass(overriddenMethod).asType();
      if (!ASTHelpers.isSameType(declaringClass, currentClass, state)) {
        String customMessage =
```

### DataFlowIssue
Argument `ASTHelpers.getSymbol(tree)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/TypeParameterQualifier.java`
#### Snippet
```java
    }
    SuggestedFix.Builder fix = SuggestedFix.builder();
    fix.replace(tree, SuggestedFixes.qualifyType(state, fix, ASTHelpers.getSymbol(tree)));
    return describeMatch(tree, fix.build());
  }
```

### DataFlowIssue
Dereference of `sym` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/DefaultCharset.java`
#### Snippet
```java
    }
    if (!ASTHelpers.isSameType(
        sym.type, state.getTypeFromString(original.getCanonicalName()), state)) {
      return;
    }
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `replaceAll` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/BigDecimalLiteralDouble.java`
#### Snippet
```java

    // Strip off 'd', 'f' suffixes and _ separators from the source.
    String literalString = state.getSourceForNode(arg).replaceAll("[_dDfF]", "");

    // We assume that the expected value of `new BigDecimal(double)` is precisely the BigDecimal
```

### DataFlowIssue
Method invocation `isMemberOf` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/SelfEquals.java`
#### Snippet
```java
            state.getTypes().erasure(ASTHelpers.getType(declaration)).tsym;

        if (ASTHelpers.getSymbol(toReplace).isMemberOf(variableTypeSymbol, state.getTypes())) {
          if (toReplace.getKind() == Kind.IDENTIFIER) {
            return SuggestedFix.prefixWith(toReplace, declaration.getName() + ".");
```

### DataFlowIssue
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

### DataFlowIssue
Argument `getSymbol(tree)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/MixedArrayDimensions.java`
#### Snippet
```java
          String replacement = dim.substring(idx) + dim.substring(0, idx);
          // SimpleCharStream generates violations in other packages, and is challenging to fix.
          var enclosingClass = enclosingClass(getSymbol(tree));
          if (enclosingClass != null && enclosingClass.name.contentEquals("SimpleCharStream")) {
            return NO_MATCH;
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Argument `receiver` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/ModifyingCollectionWithItself.java`
#### Snippet
```java

    Description.Builder builder = buildDescription(methodInvocationTree);
    for (Fix fix : buildFixes(methodInvocationTree, state, receiver, argument)) {
      builder.addFix(fix);
    }
```

### DataFlowIssue
Method invocation `getKind` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/ModifyingCollectionWithItself.java`
#### Snippet
```java
      Preconditions.checkState(receiver.getKind() == IDENTIFIER, "receiver.getKind is identifier");

      boolean lhsIsField = ASTHelpers.getSymbol(receiver).getKind() == ElementKind.FIELD;
      fixes =
          lhsIsField
```

### DataFlowIssue
Method invocation `type` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/EqualsIncompatibleType.java`
#### Snippet
```java
    }
    if (IS_EQUAL_MATCHER.matches(invocationTree, state)) {
      Type targetType = ASTHelpers.targetType(state).type();
      if (targetType.getTypeArguments().size() != 1) {
        return NO_MATCH;
```

### DataFlowIssue
Method invocation `getSimpleName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/EqualsIncompatibleType.java`
#### Snippet
```java
    String baseMessage =
        "Calling "
            + ASTHelpers.getSymbol(invocationTree).getSimpleName()
            + " on incompatible types "
            + typeStringPair.getReceiverTypeString()
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getTag` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/BadComparable.java`
#### Snippet
```java

    // If the cast isn't narrowing to an int then don't implicate it in the bug pattern.
    if (treeType.getTag() != TypeTag.INT) {
      return false;
    }
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractJUnit4InitMethodNotRun.java`
#### Snippet
```java
    AnnotationTree annotationNode = null;
    for (AnnotationTree annotation : methodTree.getModifiers().getAnnotations()) {
      if (ASTHelpers.getSymbol(annotation).equals(state.getSymbolFromString(annotationName))) {
        annotationNode = annotation;
      }
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getSimpleName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractJUnit4InitMethodNotRun.java`
#### Snippet
```java
    for (AnnotationTree annotationNode : methodTree.getModifiers().getAnnotations()) {
      Symbol annoSymbol = ASTHelpers.getSymbol(annotationNode);
      if (annoSymbol.getSimpleName().contentEquals(unqualifiedClassName)) {
        SuggestedFix.Builder suggestedFix =
            SuggestedFix.builder()
```

### DataFlowIssue
Method invocation `asElement` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/CheckReturnValue.java`
#### Snippet
```java

    String implementedMethod =
        getType(tree).asElement().getSimpleName()
            + "."
            + state.getTypes().findDescriptorSymbol(getType(tree).asElement()).getSimpleName();
```

### DataFlowIssue
Method invocation `asElement` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/CheckReturnValue.java`
#### Snippet
```java
        getType(tree).asElement().getSimpleName()
            + "."
            + state.getTypes().findDescriptorSymbol(getType(tree).asElement()).getSimpleName();
    String methodReference = state.getSourceForNode(tree);
    String assignmentLambda = parensAndMaybeEllipsis + " -> { var unused = ...; }";
```

### DataFlowIssue
Dereference of `expectedMethodSym` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/EqualsHashCode.java`
#### Snippet
```java
            ImmutableList.<Type>of());

    if (!expectedMethodSym.owner.equals(state.getSymtab().objectType.tsym)) {
      return null;
    }
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Dereference of `enclosingPackage(type.asElement())` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/TypeCompatibilityUtils.java`
#### Snippet
```java
  private static String classNamePart(Type type) {
    String fullClassname = type.asElement().getQualifiedName().toString();
    String packageName = enclosingPackage(type.asElement()).fullname.toString();
    String prefix = fullClassname.substring(packageName.length());
    return prefix.startsWith(".") ? prefix.substring(1) : prefix;
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Dereference of `ASTHelpers.getSymbol(param)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/LambdaFunctionalInterface.java`
#### Snippet
```java
                fixBuilder.replace(
                    param,
                    getFunctionName(mappedFunction) + " " + ASTHelpers.getSymbol(param).name);
                refactorInternalApplyMethods(tree, fixBuilder, param, mappedFunction);
              });
```

### DataFlowIssue
Method invocation `getTypeArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/LambdaFunctionalInterface.java`
#### Snippet
```java
      Tree param, int argIndex, Type type, VisitorState state) {
    return ASTHelpers.isSubtype(
        ASTHelpers.getType(param).getTypeArguments().get(argIndex), type, state);
  }

```

### DataFlowIssue
Method invocation `getModifiers` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/NonOverridingEquals.java`
#### Snippet
```java
    JCClassDecl cls = (JCClassDecl) state.findEnclosing(ClassTree.class);

    if ((cls.getModifiers().flags & ENUM) != 0) {
      /* If the enclosing class is an enum, then just delete the equals method since enums
       * should always be compared for reference equality. Enum defines a final equals method for
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/SwitchDefault.java`
#### Snippet
```java
        int end = state.getEndPosition(getLast(defaultStatementGroup));
        String replacement;
        String source = state.getSourceCode().toString();

        // If the default case isn't the last case in its statement group, move it to the end.
```

### DataFlowIssue
Argument `sym` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/TryFailThrowable.java`
#### Snippet
```java
    String tail = hasOtherParameters == HasOtherParameters.TRUE ? ", " : "";
    // The above casts were checked earlier by failOrAssert.
    return hasInitialStringParameter(sym, state)
        ? state.getSourceForNode(((MethodInvocationTree) expression).getArguments().get(0)) + tail
        : "";
```

### DataFlowIssue
Method invocation `getSimpleName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/FieldCanBeLocal.java`
#### Snippet
```java
        // If the RHS of the assignment is a variable with the same name as the field, just remove
        // the assignment.
        String assigneeName = getSymbol(assignmentTree.getVariable()).getSimpleName().toString();
        if (rhsSymbol != null
            && assignmentTree.getExpression() instanceof IdentifierTree
```

### DataFlowIssue
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

### DataFlowIssue
Dereference of `enclosingClass(symbol)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractReturnValueIgnored.java`
#### Snippet
```java

  private static boolean isExemptedInterfaceMethod(MethodSymbol symbol, VisitorState state) {
    return isExemptedInterfaceType(enclosingClass(symbol).type, state);
  }

```

### DataFlowIssue
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

### DataFlowIssue
Argument `unit` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/CanonicalDuration.java`
#### Snippet
```java

    List<Duration> durations =
        constValues.stream().map(value -> Duration.of(value.longValue(), unit)).collect(toList());
    // Iterate over all possible units from largest to smallest (days to nanos) until we find the
    // largest unit that can be used to exactly express the duration.
```

### DataFlowIssue
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

### DataFlowIssue
Argument `ASTHelpers.getSymbol(expr)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/time/NearbyCallers.java`
#### Snippet
```java
        expr = ((JCFieldAccess) expr).getExpression();
      }
      symbolChain.add(ASTHelpers.getSymbol(expr));
    }
    return Optional.of(symbolChain.build());
```

### DataFlowIssue
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

### DataFlowIssue
Argument `getSymbol(state.getPath().getParentPath().getParentPath().getLeaf())` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/JavaxInjectOnFinalField.java`
#### Snippet
```java
  public Description matchAnnotation(AnnotationTree annotationTree, VisitorState state) {
    if (IS_APPLICATION_OF_JAVAX_INJECT.matches(annotationTree, state)) {
      if (isFinalField(getSymbol(state.getPath().getParentPath().getParentPath().getLeaf()))) {
        return describeMatch(annotationTree, SuggestedFix.delete(annotationTree));
      }
```

### DataFlowIssue
Method invocation `getSimpleName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/time/TimeUnitConversionChecker.java`
#### Snippet
```java
    // long about2500 = SECONDS.toSeconds(42);
    // but... I think that's bad enough to ignore here :)
    String timeUnitName = ASTHelpers.getSymbol(receiverOfConversion).getSimpleName().toString();
    Optional<TimeUnit> receiver = Enums.getIfPresent(TimeUnit.class, timeUnitName);
    if (!receiver.isPresent()) {
```

### DataFlowIssue
Argument `getSymbol(injectedMember)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/MoreThanOneInjectableConstructor.java`
#### Snippet
```java
    if (IS_EITHER_INJECT.matches(tree, state)) {
      Tree injectedMember = state.getPath().getParentPath().getParentPath().getLeaf();
      if (isFirstConstructorOfMultiInjectedClass(getSymbol(injectedMember))) {
        return describeMatch(ASTHelpers.findEnclosingNode(state.getPath(), ClassTree.class));
      }
```

### DataFlowIssue
Method invocation `isConstructor` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/AssistedInjectAndInjectOnSameConstructor.java`
#### Snippet
```java
    if (injectOrAssistedInjectMatcher.matches(annotationTree, state)) {
      Tree treeWithAnnotation = state.getPath().getParentPath().getParentPath().getLeaf();
      if (ASTHelpers.getSymbol(treeWithAnnotation).isConstructor()
          && hasInjectAnnotation().matches(treeWithAnnotation, state)
          && HAS_ASSISTED_INJECT_MATCHER.matches((MethodTree) treeWithAnnotation, state)) {
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/ScopeOrQualifierAnnotationRetention.java`
#### Snippet
```java
    AnnotationTree retentionNode = null;
    for (AnnotationTree annotation : classTree.getModifiers().getAnnotations()) {
      if (ASTHelpers.getSymbol(annotation).equals(JAVA_LANG_ANNOTATION_RETENTION.get(state))) {
        retentionNode = annotation;
      }
```

### DataFlowIssue
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

### DataFlowIssue
Argument `ASTHelpers.outermostClass(method)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/RefersToDaggerCodegen.java`
#### Snippet
```java
      return false;
    }
    return isGeneratedBaseType(ASTHelpers.outermostClass(method), state, "dagger.MembersInjector");
  }

```

### DataFlowIssue
Method invocation `getQualifiedName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/RefersToDaggerCodegen.java`
#### Snippet
```java
  private static boolean isDaggerInternalClass(ClassSymbol symbol) {
    return DAGGER_INTERNAL_PACKAGES.contains(
        enclosingPackage(symbol).getQualifiedName().toString());
  }

```

### DataFlowIssue
Method invocation `getExtendsClause` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/UseBinds.java`
#### Snippet
```java
    }

    if (enclosingClass.getExtendsClause() != null) {
      return fixByDelegating();
    }
```

### DataFlowIssue
Method invocation `isConstructor` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/UseBinds.java`
#### Snippet
```java

    for (Tree member : enclosingClass.getMembers()) {
      if (member.getKind().equals(Tree.Kind.METHOD) && !getSymbol(member).isConstructor()) {
        MethodTree siblingMethod = (MethodTree) member;
        Set<Modifier> siblingFlags = siblingMethod.getModifiers().getFlags();
```

### DataFlowIssue
Method invocation `getQualifiedName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/UseBinds.java`
#### Snippet
```java

    for (AnnotationTree annotation : modifiers.getAnnotations()) {
      Name annotationQualifiedName = getSymbol(annotation).getQualifiedName();
      if (annotationQualifiedName.contentEquals(PROVIDES_CLASS_NAME)
          || annotationQualifiedName.contentEquals(PRODUCES_CLASS_NAME)) {
```

### DataFlowIssue
Method invocation `getSimpleName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/UseBinds.java`
#### Snippet
```java
          checkState(argument.getKind().equals(ASSIGNMENT));
          AssignmentTree assignment = (AssignmentTree) argument;
          checkState(getSymbol(assignment.getVariable()).getSimpleName().contentEquals("type"));
          String typeName = getSymbol(assignment.getExpression()).getSimpleName().toString();
          switch (typeName) {
```

### DataFlowIssue
Method invocation `getSimpleName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/UseBinds.java`
#### Snippet
```java
          AssignmentTree assignment = (AssignmentTree) argument;
          checkState(getSymbol(assignment.getVariable()).getSimpleName().contentEquals("type"));
          String typeName = getSymbol(assignment.getExpression()).getSimpleName().toString();
          switch (typeName) {
            case "SET":
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `isConstructor` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/PrivateConstructorForNoninstantiableModule.java`
#### Snippet
```java
    }

    if (nonSyntheticMembers.stream().anyMatch(tree -> getSymbol(tree).isConstructor())) {
      return NO_MATCH;
    }
```

### DataFlowIssue
Dereference of `annotationClass` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/Util.java`
#### Snippet
```java
    for (AnnotationTree annotationTree : classTree.getModifiers().getAnnotations()) {
      ClassSymbol annotationClass = (ClassSymbol) getSymbol(annotationTree.getAnnotationType());
      if (annotationClass.fullname.contentEquals(annotationName)) {
        return Optional.of(annotationTree);
      }
```

### DataFlowIssue
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

### DataFlowIssue
Argument `state.getSourceForNode(annotation)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/EmptySetMultibindingContributions.java`
#### Snippet
```java

    for (JCAnnotation annotation : enclosingClassModifiers.annotations) {
      classModifierStringsBuilder.add(state.getSourceForNode(annotation));
    }

```

### DataFlowIssue
Method invocation `getQualifiedName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/EmptySetMultibindingContributions.java`
#### Snippet
```java

    for (JCAnnotation annotation : modifiers.annotations) {
      Name annotationQualifiedName = ASTHelpers.getSymbol(annotation).getQualifiedName();
      if (!(annotationQualifiedName.contentEquals("dagger.Provides")
          || annotationQualifiedName.contentEquals("dagger.producers.Produces")
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getModifiers` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/EmptySetMultibindingContributions.java`
#### Snippet
```java

    // Check to see if this is in a Dagger 1 module b/c it doesn't support @Multibinds
    for (JCAnnotation annotation : enclosingClass.getModifiers().getAnnotations()) {
      if (ASTHelpers.getSymbol(annotation.getAnnotationType())
              .getQualifiedName()
```

### DataFlowIssue
Method invocation `getQualifiedName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/EmptySetMultibindingContributions.java`
#### Snippet
```java
    for (JCAnnotation annotation : enclosingClass.getModifiers().getAnnotations()) {
      if (ASTHelpers.getSymbol(annotation.getAnnotationType())
              .getQualifiedName()
              .contentEquals("dagger.Module")
          && HAS_DAGGER_ONE_MODULE_ARGUMENT.matches(annotation, state)) {
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/android/BundleDeserializationCast.java`
#### Snippet
```java

  private Description getDescriptionForType(TypeCastTree tree, String baseType) {
    String targetType = getType(tree.getType()).toString();
    return buildDescription(tree)
        .setMessage(
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getSimpleName` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/android/IsLoggableTagLength.java`
#### Snippet
```java
    if (GET_SIMPLE_NAME_CALL.matches(tagExpr, state)
        && RECEIVER_IS_CLASS_LITERAL.matches((MethodInvocationTree) tagExpr, state)) {
      String tagName = getSymbol(getReceiver(getReceiver(tagExpr))).getSimpleName().toString();
      return isValidTag(tagName) ? NO_MATCH : describeMatch(tagArg);
    }
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Argument `ASTHelpers.getSymbol(t)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/flogger/FloggerRequiredModifiers.java`
#### Snippet
```java
  private static ImmutableSet<Symbol> fieldsToIgnore(VisitorState state) {
    Tree t = state.findEnclosing(VariableTree.class, ClassTree.class);
    return t instanceof VariableTree ? ImmutableSet.of(ASTHelpers.getSymbol(t)) : ImmutableSet.of();
  }
}
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/flogger/FloggerRequiredModifiers.java`
#### Snippet
```java
        if (e instanceof AssignmentTree) {
          AssignmentTree assignment = (AssignmentTree) e;
          if (ASTHelpers.getSymbol(assignment.getVariable()).equals(target)) {
            state.incrementCounter(this, "skip-self-assignment");
            return NO_MATCH;
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/NotJavadoc.java`
#### Snippet
```java
  public Description matchCompilationUnit(CompilationUnitTree tree, VisitorState state) {
    ImmutableMap<Integer, Tree> javadocableTrees = getJavadoccableTrees(tree, state);
    for (ErrorProneToken token : getTokens(state.getSourceCode().toString(), state.context)) {
      for (Comment comment : token.comments()) {
        if (!comment.getStyle().equals(JAVADOC) || comment.getText().equals("/**/")) {
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Argument `getSymbol((Tree) tree)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/InvalidParam.java`
#### Snippet
```java
        .filter(MethodTree.class::isInstance)
        .map(MethodTree.class::cast)
        .filter(tree -> isRecord(getSymbol((Tree) tree)))
        .collect(onlyElement());
  }
```

### DataFlowIssue
Argument `getSymbol((Tree) classTree)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/InvalidParam.java`
#### Snippet
```java
    if (path != null) {
      ImmutableSet<String> parameters =
          isRecord(getSymbol((Tree) classTree))
              ? getCanonicalRecordConstructor(classTree).getParameters().stream()
                  .map(p -> p.getName().toString())
```

### DataFlowIssue
Argument `sym` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/InlinabilityResult.java`
#### Snippet
```java
      private boolean isDeprecatedOrLessVisible(Tree tree, Visibility minVisibility) {
        Symbol sym = getSymbol(tree);
        Visibility visibility = getVisibility(sym);
        if (!(sym instanceof PackageSymbol) && visibility.compareTo(minVisibility) < 0) {
          usesDeprecatedOrLessVisibleApis.set(tree);
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/InlinabilityResult.java`
#### Snippet
```java
      @Override
      public Void visitIdentifier(IdentifierTree identifierTree, Void aVoid) {
        if (!getSymbol(identifierTree).equals(varargsParam)) {
          return super.visitIdentifier(identifierTree, aVoid);
        }
```

### DataFlowIssue
Argument `symbol` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/InlineMeData.java`
#### Snippet
```java
      if (!(node.getExpression() instanceof MemberSelectTree)) {
        Symbol symbol = getSymbol(node);
        if (isStatic(symbol)) {
          maybeAddImport(symbol.owner);
        }
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/Inliner.java`
#### Snippet
```java
    if (methodSelectTree != null) {
      String methodSelect = state.getSourceForNode(methodSelectTree);
      if (methodSelect.equals("super")) {
        receiverString = methodSelect;
      }
```

### DataFlowIssue
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

### DataFlowIssue
Dereference of `enclosingClass(sym)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullArgumentForNonNullParameter.java`
#### Snippet
```java
  private static boolean isParameterOfMethodOnTypeStartingWith(
      VarSymbol sym, Supplier<Name> nameSupplier, VisitorState state) {
    return enclosingClass(sym).fullname.startsWith(nameSupplier.get(state));
  }

```

### DataFlowIssue
Dereference of `enclosingClass(sym)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullArgumentForNonNullParameter.java`
#### Snippet
```java
      VarSymbol sym, Supplier<Type> typeSupplier, VisitorState state) {
    Type target = typeSupplier.get(state);
    return target != null && state.getTypes().isSameType(enclosingClass(sym).type, target);
  }

```

### DataFlowIssue
Dereference of `enclosingClass(sym)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullArgumentForNonNullParameter.java`
#### Snippet
```java

    // Hardcoding #3: Immutable*.Builder.*
    if (enclosingClass(sym).name.equals(BUILDER_NAME.get(state))
        && (isParameterOfMethodOnTypeStartingWith(sym, GUAVA_COLLECT_IMMUTABLE_PREFIX, state)
            || isParameterOfMethodOnTypeStartingWith(sym, GUAVA_GRAPH_IMMUTABLE_PREFIX, state))) {
```

### DataFlowIssue
Argument `constructedClass` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullnessUtils.java`
#### Snippet
```java
    }
    ClassSymbol constructedClass = enclosingClass(symbol);
    return enclosingClass(constructedClass) != null && !constructedClass.isStatic();
  }

```

### DataFlowIssue
Method invocation `getTypeParameters` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafeChecker.java`
#### Snippet
```java
    Violation info =
        analysis.checkInstantiation(
            ASTHelpers.getSymbol(tree.getIdentifier()).getTypeParameters(),
            ASTHelpers.getType(tree).getTypeArguments());
    if (info.isPresent()) {
```

### DataFlowIssue
Method invocation `getTypeArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafeChecker.java`
#### Snippet
```java
        analysis.checkInstantiation(
            ASTHelpers.getSymbol(tree.getIdentifier()).getTypeParameters(),
            ASTHelpers.getType(tree).getTypeArguments());
    if (info.isPresent()) {
      state.reportMatch(buildDescription(tree).setMessage(info.message()).build());
```

### DataFlowIssue
Argument `ASTHelpers.getType(tree)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafeChecker.java`
#### Snippet
```java
    ImmutableSet<String> typarams = analysis.threadSafeTypeParametersInScope(sym);
    Violation info =
        analysis.areFieldsThreadSafe(Optional.of(tree), typarams, ASTHelpers.getType(tree));
    if (!info.isPresent()) {
      return NO_MATCH;
```

### DataFlowIssue
Argument `type` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/formatstring/FormatStringValidation.java`
#### Snippet
```java
    }
    Type type = ASTHelpers.getType(tree);
    return getInstance(type, state);
  }

```

### DataFlowIssue
Argument `sym` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafeAnalysis.java`
#### Snippet
```java
  AnnotationInfo getThreadSafeAnnotation(Tree tree, VisitorState state) {
    Symbol sym = ASTHelpers.getSymbol(tree);
    return getThreadSafeAnnotation(sym, state);
  }

```

### DataFlowIssue
Dereference of `ASTHelpers.getSymbol(tree)` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/GuardedBySymbolResolver.java`
#### Snippet
```java
  public static GuardedBySymbolResolver from(Tree tree, VisitorState visitorState) {
    return GuardedBySymbolResolver.from(
        ASTHelpers.getSymbol(tree).owner.enclClass(),
        MethodInfo.create(tree, visitorState),
        visitorState.getPath().getCompilationUnit(),
```

### DataFlowIssue
Argument `getSymbol(methodInvocationTree)` might be null
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/UnnecessarilyUsedValue.java`
#### Snippet
```java
    // TODO(kak): use the ResultUsePolicyEvaluator from the CheckReturnValue checker
    return hasDirectAnnotationWithSimpleName(
            getSymbol(methodInvocationTree), "CanIgnoreReturnValue")
        // match unused[0-9]*, since those are likely intentional CRV-related suppressions (captured
        // into an unused variable), as opposed to a "normal" variable like `long unusedBalance`.
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getTypeParameters` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableChecker.java`
#### Snippet
```java
          state,
          analysis,
          getSymbol(implementTree).getTypeParameters(),
          ASTHelpers.getType(implementTree).getTypeArguments());
    }
```

### DataFlowIssue
Method invocation `getTypeArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableChecker.java`
#### Snippet
```java
          analysis,
          getSymbol(implementTree).getTypeParameters(),
          ASTHelpers.getType(implementTree).getTypeArguments());
    }

```

### DataFlowIssue
Method invocation `getTypeParameters` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableChecker.java`
#### Snippet
```java
          state,
          analysis,
          getSymbol(extendsClause).getTypeParameters(),
          ASTHelpers.getType(extendsClause).getTypeArguments());
    }
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getTypeArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableChecker.java`
#### Snippet
```java
    Violation info =
        analysis.checkInstantiation(
            lambdaType.getTypeParameters(), getType(tree).getTypeArguments());

    if (info.isPresent()) {
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getTypeArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableChecker.java`
#### Snippet
```java
    Violation info =
        analysis.checkInstantiation(
            memberReferenceType.getTypeParameters(), getType(tree).getTypeArguments());

    if (info.isPresent()) {
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getTypeParameters` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableChecker.java`
#### Snippet
```java
        tree,
        state,
        getSymbol(tree.getIdentifier()).getTypeParameters(),
        ASTHelpers.getType(tree).getTypeArguments());

```

### DataFlowIssue
Method invocation `getTypeArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableChecker.java`
#### Snippet
```java
        state,
        getSymbol(tree.getIdentifier()).getTypeParameters(),
        ASTHelpers.getType(tree).getTypeArguments());

    ClassTree classBody = tree.getClassBody();
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Dereference of `symbol` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ConstantExpressions.java`
#### Snippet
```java
          (tree, state) -> {
            Symbol symbol = getSymbol(tree);
            return hasAnnotation(symbol.owner, "com.google.auto.value.AutoValue", state)
                && symbol.getModifiers().contains(ABSTRACT);
          },
```

### DataFlowIssue
Dereference of `symbol` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ConstantExpressions.java`
#### Snippet
```java
    }
    Symbol symbol = getSymbol(receiver);
    return symbol.owner.isEnum()
        || (symbol instanceof VarSymbol && isConsideredFinal(symbol))
        || symbol instanceof ClassSymbol
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TruthIncompatibleType.java`
#### Snippet
```java
    }

    ExpressionTree assertee = getOnlyElement(((MethodInvocationTree) receiver).getArguments());
    TypeSymbol assertionType =
        getOnlyElement(getSymbol((MethodInvocationTree) receiver).getParameters()).type.tsym;
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TruthIncompatibleType.java`
#### Snippet
```java
    }

    Tree argument = ignoringCasts(getOnlyElement(((MethodInvocationTree) receiver).getArguments()));
    Type targetType =
        getIterableTypeArg(
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TruthIncompatibleType.java`
#### Snippet
```java
    }

    ExpressionTree assertee = getOnlyElement(((MethodInvocationTree) receiver).getArguments());
    TypeSymbol assertionType =
        getOnlyElement(getSymbol((MethodInvocationTree) receiver).getParameters()).type.tsym;
```

### DataFlowIssue
Method invocation `getArguments` may produce `NullPointerException`
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TruthIncompatibleType.java`
#### Snippet
```java
    }

    ExpressionTree assertee = getOnlyElement(((MethodInvocationTree) receiver).getArguments());
    TypeSymbol assertionType =
        getOnlyElement(getSymbol((MethodInvocationTree) receiver).getParameters()).type.tsym;
```

### DataFlowIssue
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

### DataFlowIssue
Argument `ASTHelpers.getFileName(tree)` might be null
in `check_api/src/main/java/com/google/errorprone/ErrorProneAnalyzer.java`
#### Snippet
```java
    Pattern excludedPattern = errorProneOptions.getExcludedPattern();
    return excludedPattern != null
        && excludedPattern.matcher(ASTHelpers.getFileName(tree)).matches();
  }

```

### DataFlowIssue
Dereference of `JAVA_SPECIFICATION_VERSION.value()` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/BaseErrorProneJavaCompiler.java`
#### Snippet
```java

    String overrideLanguageLevel;
    switch (JAVA_SPECIFICATION_VERSION.value()) {
      case "1.7":
        overrideLanguageLevel = "7";
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `subSequence` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/VisitorState.java`
#### Snippet
```java
  public List<ErrorProneToken> getOffsetTokens(int start, int end) {
    return ErrorProneTokens.getTokens(
        getSourceCode().subSequence(start, end).toString(), start, context);
  }

```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/util/Visibility.java`
#### Snippet
```java
        }
      }
      return outermostClass == null || ASTHelpers.outermostClass(symbol).equals(outermostClass);
    }

```

### DataFlowIssue
Argument `symbol` might be null
in `check_api/src/main/java/com/google/errorprone/util/Visibility.java`
#### Snippet
```java
      Symbol symbol = getSymbol(tree);
      ClassTree classTree = ASTHelpers.findEnclosingNode(state.getPath(), ClassTree.class);
      if (isStatic(symbol)) {
        if (classTree == null) {
          return false;
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Dereference of `enclosingClass(symbol)` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/util/Visibility.java`
#### Snippet
```java
      ClassTree classTree = ASTHelpers.findEnclosingNode(state.getPath(), ClassTree.class);
      return classTree != null
          && hasEnclosingClassExtending(enclosingClass(symbol).type, state, classTree);
    }

```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/util/Visibility.java`
#### Snippet
```java
      PackageSymbol packge = compilationUnit.packge;
      // TODO(ghm): Should we handle the default (unnamed) package here?
      return enclosingPackage(symbol).equals(packge);
    }

```

### DataFlowIssue
Method invocation `subSequence` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/util/Comments.java`
#### Snippet
```java
    }

    CharSequence source = sourceCode.subSequence(invocationStart, endPosition.get());

    if (CharMatcher.is('/').matchesNoneOf(source)) {
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/util/FindIdentifiers.java`
#### Snippet
```java
              },
              (curr, unused) ->
                  curr instanceof ClassTree && ASTHelpers.getSymbol(curr).equals(var.owner))) {
            return false;
          }
```

### DataFlowIssue
Argument `ASTHelpers.getSymbol(tree)` might be null
in `check_api/src/main/java/com/google/errorprone/util/FindIdentifiers.java`
#### Snippet
```java
      switch (tree.getKind()) {
        case METHOD:
          return isStatic(ASTHelpers.getSymbol(tree));
        case BLOCK: // static initializer
          if (((BlockTree) tree).isStatic()) {
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `isPresent` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/InferredNullability.java`
#### Snippet
```java
      }

      checkState(!inferredMemoTable.put(iv, result).isPresent());
      return result;
    }
```

### DataFlowIssue
Method invocation `isConstructor` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/matchers/ConstructorOfClass.java`
#### Snippet
```java
    for (Tree member : classTree.getMembers()) {
      // If this member is a constructor...
      if (member instanceof MethodTree && ASTHelpers.getSymbol(member).isConstructor()) {
        result.add((MethodTree) member);
      }
```

### DataFlowIssue
Dereference of `getType(resource)` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
    public void scanResources(TryTree tree) {
      for (Tree resource : tree.getResources()) {
        Symbol symbol = getType(resource).tsym;

        if (symbol instanceof ClassSymbol) {
```

### DataFlowIssue
Dereference of `ASTHelpers.getSymbol(tree.getIdentifier())` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
    public Type visitNewClass(NewClassTree tree, Void unused) {
      if (Objects.equals(current, tree.getEnclosingExpression())) {
        return ASTHelpers.getSymbol(tree.getIdentifier()).owner.type;
      }
      return visitMethodInvocationOrNewClass(
```

### DataFlowIssue
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

### DataFlowIssue
Argument `getDeclaredSymbol(tree)` might be null
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
   */
  public static boolean hasDirectAnnotationWithSimpleName(Tree tree, String simpleName) {
    return hasDirectAnnotationWithSimpleName(getDeclaredSymbol(tree), simpleName);
  }

```

### DataFlowIssue
Method invocation `asType` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
                && isSameType(input.getParameters().get(0).asType(), onlyParameterType, state)
                && isSameType(input.getReturnType(), existingMethod.getReturnType(), state),
        enclosingClass(existingMethod).asType(),
        state.getTypes());
  }
```

### DataFlowIssue
Argument `getSymbol(tree)` might be null
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
        .anyMatch(
            tree ->
                (tree instanceof VariableTree && variableIsStaticFinal((VarSymbol) getSymbol(tree)))
                    || (tree instanceof AssignmentTree
                        && getSymbol(((AssignmentTree) tree).getVariable()) instanceof VarSymbol
```

### DataFlowIssue
Argument `getSymbol(((AssignmentTree) tree).getVariable())` might be null
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
                        && getSymbol(((AssignmentTree) tree).getVariable()) instanceof VarSymbol
                        && variableIsStaticFinal(
                            (VarSymbol) getSymbol(((AssignmentTree) tree).getVariable()))));
  }

```

### DataFlowIssue
Dereference of `varSymbol` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/matchers/CompileTimeConstantExpressionMatcher.java`
#### Snippet
```java
              }
              Symbol.VarSymbol varSymbol = (Symbol.VarSymbol) getSymbol(node);
              Symbol owner = varSymbol.owner;
              ElementKind ownerKind = owner.getKind();
              // Check that the identifier is a formal method/constructor parameter or a class
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `matches` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/matchers/UnusedReturnValueMatcher.java`
#### Snippet
```java
  public Stream<AllowReason> getAllowReasons(ExpressionTree tree, VisitorState state) {
    return validAllowReasons.stream()
        .filter(reason -> ALLOW_MATCHERS.get(reason).matches(tree, state));
  }

```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `getClass` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/matchers/IsSymbol.java`
#### Snippet
```java
  public boolean matches(Tree item, VisitorState state) {
    Symbol sym = ASTHelpers.getSymbol(item);
    return symbolClass.isAssignableFrom(sym.getClass());
  }
}
```

### DataFlowIssue
Condition `node.getElement() instanceof VariableElement` is redundant and can be replaced with a null check
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/NullnessPropagationTransfer.java`
#### Snippet
```java

  private static boolean hasNonNullConstantValue(LocalVariableNode node) {
    if (node.getElement() instanceof VariableElement) {
      VariableElement element = (VariableElement) node.getElement();
      return (element.getConstantValue() != null);
```

### DataFlowIssue
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

### DataFlowIssue
Method invocation `value` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java

    SuppressWarnings annotation = getAnnotation(suppressibleNode, SuppressWarnings.class);
    ImmutableSet<String> warningsSuppressed = ImmutableSet.copyOf(annotation.value());
    ImmutableSet<String> newWarningSet =
        warningsSuppressed.stream()
```

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
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

### DataFlowIssue
Argument `ASTHelpers.getDeclaredSymbol(tree)` might be null
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
    return (tree, state) ->
        ASTHelpers.hasDirectAnnotationWithSimpleName(
            ASTHelpers.getDeclaredSymbol(tree), simpleName);
  }

```

### DataFlowIssue
Argument `symbol` might be null
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
      if (expressionTree instanceof JCFieldAccess) {
        Symbol symbol = getSymbol(expressionTree);
        if (ASTHelpers.isStatic(symbol)
            && state.getTypes().unboxedTypeOrType(symbol.type).getTag() == TypeTag.BOOLEAN) {
          if (value) {
```

### DataFlowIssue
Dereference of `getSymbol(tree)` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
  private static boolean methodReturnsBoolean(ExpressionTree tree, VisitorState state) {
    return ASTHelpers.isSameType(
        getSymbol(tree).type.getReturnType(), state.getSymtab().booleanType, state);
  }

```

### DataFlowIssue
Method invocation `getModifiers` may produce `NullPointerException`
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
  /** Matches an AST node that is transient. */
  public static <T extends Tree> Matcher<T> isTransient() {
    return (tree, state) -> getSymbol(tree).getModifiers().contains(Modifier.TRANSIENT);
  }

```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
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

### SimplifyStreamApiCallChains
Can be merged with previous 'map()' call
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafeAnalysis.java`
#### Snippet
```java
        || bugChecker.customSuppressionAnnotations().stream()
            .map(a -> ASTHelpers.hasAnnotation(var, a, state))
            .anyMatch(v -> v)) {
      return Violation.absent();
    }
```

### SimplifyStreamApiCallChains
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

### SimplifyStreamApiCallChains
'Stream.allMatch(x -\> !(...))' can be replaced with 'noneMatch()'
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/CreatesDuplicateCallHeuristic.java`
#### Snippet
```java
      Changes changes, Tree node, MethodSymbol symbol, VisitorState state) {
    return findArgumentsForOtherInstances(symbol, node, state).stream()
        .allMatch(arguments -> !anyArgumentsMatch(changes.changedPairs(), arguments));
  }

```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `check_api/src/main/java/com/google/errorprone/names/NamingConventions.java`
#### Snippet
```java

  public static String convertToLowerUnderscore(String identifierName) {
    return splitToLowercaseTerms(identifierName).stream().collect(Collectors.joining("_"));
  }

```

### SimplifyStreamApiCallChains
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

### SimplifyStreamApiCallChains
Can be replaced with three-arg 'iterate()'
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
   */
  public static Stream<Symbol> enclosingElements(Symbol sym) {
    return Stream.iterate(sym, Symbol::getEnclosingElement).takeWhile(s -> s != null);
  }

```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
      }
      // The qualified name up to (and including) the component we're currently dealing with.
      String qualifiedName = components.subList(0, i + 1).stream().collect(joining("."));

      Symbol found = FindIdentifiers.findIdent(component, state, KindSelector.VAL_TYP);
```

### SimplifyStreamApiCallChains
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

### SimplifyStreamApiCallChains
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

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
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

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
Deprecated member 'ParameterMatcher' is still used
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatchers.java`
#### Snippet
```java
   */
  @Deprecated
  public interface ParameterMatcher extends MethodMatcher {}

  // Method matcher factories
```

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
Deprecated member 'MethodMatcher' is still used
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatchers.java`
#### Snippet
```java
   */
  @Deprecated
  public interface MethodMatcher extends Matcher<ExpressionTree> {}

  // Language definition for fluent method matchers.
```

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
Deprecated member 'MethodSignatureMatcher' is still used
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodMatchers.java`
#### Snippet
```java
   */
  @Deprecated
  public interface MethodSignatureMatcher extends MethodMatcher {}

  /**
```

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

### DeprecatedIsStillUsed
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

## RuleId[id=JavaReflectionMemberAccess]
### JavaReflectionMemberAccess
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

### JavaReflectionMemberAccess
Cannot resolve method 'ForeachLoop' with specified argument types
in `core/src/main/java/com/google/errorprone/refaster/UEnhancedForLoop.java`
#### Snippet
```java
      return RuntimeVersion.isAtLeast20()
          ? TreeMaker.class.getMethod(
              "ForeachLoop", JCTree.class, JCExpression.class, JCStatement.class)
          : TreeMaker.class.getMethod(
              "ForeachLoop", JCVariableDecl.class, JCExpression.class, JCStatement.class);
```

### JavaReflectionMemberAccess
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

### JavaReflectionMemberAccess
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

### JavaReflectionMemberAccess
Cannot resolve method 'Case' with specified argument types
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
            TreeMaker.class
                .getMethod(
                    "Case",
                    Class.forName("com.sun.source.tree.CaseTree$CaseKind"),
                    List.class,
```

### JavaReflectionMemberAccess
Cannot resolve method 'getLabels'
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
                    caseKind,
                    RuntimeVersion.isAtLeast17()
                        ? CaseTree.class.getMethod("getLabels").invoke(node)
                        : List.of((JCExpression) node.getExpression()),
                    stmts,
```

### JavaReflectionMemberAccess
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

### JavaReflectionMemberAccess
Cannot resolve method 'getExpressions'
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
      if (RuntimeVersion.isAtLeast12()) {
        return ((List<? extends ExpressionTree>)
                CaseTree.class.getMethod("getExpressions").invoke(caseTree))
            .stream();
      } else {
```

### JavaReflectionMemberAccess
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

### JavaReflectionMemberAccess
Cannot resolve method 'dropMetadata'
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/ApiFactory.java`
#### Snippet
```java
      } catch (NoSuchMethodException e) {
        Class<?> annotations = Class.forName("com.sun.tools.javac.code.TypeMetadata$Annotations");
        Method method = Type.class.getMethod("dropMetadata", Class.class);
        return (Type) method.invoke(type, annotations);
      }
```

### JavaReflectionMemberAccess
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

### JavaReflectionMemberAccess
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

### JavaReflectionMemberAccess
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

### JavaReflectionMemberAccess
Cannot resolve method 'annotationTargetType' with specified argument types
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
        return (AnnotationType)
            TypeAnnotations.class
                .getMethod("annotationTargetType", JCTree.class, Compound.class, Symbol.class)
                .invoke(typeAnnotations, tree, compound, target);
      } catch (NoSuchMethodException e1) {
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
      return UTypeVarIdent.create(tree.getName());
    }
    switch (sym.getKind()) {
      case TYPE_PARAMETER:
        return UTypeVarIdent.create(tree.getName());
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryParentheses.java`
#### Snippet
```java
      default: // fall out
    }
    switch (parent.getKind().name()) {
      case "SWITCH_EXPRESSION":
        return NO_MATCH;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `core/src/main/java/com/google/errorprone/bugpatterns/ComplexBooleanConstant.java`
#### Snippet
```java
              return null;
            }
            switch (node.getKind()) {
              case LOGICAL_COMPLEMENT:
                return !r;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `core/src/main/java/com/google/errorprone/bugpatterns/ForEachIterable.java`
#### Snippet
```java
          p -> {
            TreePath path = p.getParentPath().getParentPath();
            switch (path.getParentPath().getLeaf().getKind()) {
              case EXPRESSION_STATEMENT:
                fix.delete(path.getParentPath().getLeaf());
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `core/src/main/java/com/google/errorprone/bugpatterns/TypeParameterUnusedInFormals.java`
#### Snippet
```java
    // e.g. the following is OK: <T> List<T> newArrayList();
    TypeVar retType;
    switch (methodSymbol.getReturnType().getKind()) {
      case TYPEVAR:
        retType = (TypeVar) methodSymbol.getReturnType();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/ParameterMissingNullable.java`
#### Snippet
```java
      default:
    }
    switch (path.getParentPath().getLeaf().getKind()) {
      case FOR_LOOP:
        return true;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `check_api/src/main/java/com/google/errorprone/util/MoreAnnotations.java`
#### Snippet
```java
        return position.type == TargetType.METHOD_RETURN;
      case PARAMETER:
        switch (position.type) {
          case METHOD_FORMAL_PARAMETER:
            return ((MethodSymbol) sym.owner).getParameters().indexOf(sym)
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `check_api/src/main/java/com/google/errorprone/util/MoreAnnotations.java`
#### Snippet
```java
  public static Stream<TypeCompound> getTopLevelTypeAttributes(Symbol sym) {
    Symbol typeAnnotationOwner;
    switch (sym.getKind()) {
      case PARAMETER:
        typeAnnotationOwner = sym.owner;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
  @SuppressWarnings("ASTHelpersSuggestions")
  public static boolean isStatic(Symbol symbol) {
    switch (symbol.getKind()) {
      case MODULE:
        return false;
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `check_api/src/main/java/com/google/errorprone/matchers/method/MethodInvocationMatcher.java`
#### Snippet
```java
      }

      switch (type) {
        case RECEIVER_SUPERTYPE:
          return (ctx, state) -> {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `check_api/src/main/java/com/google/errorprone/apply/SourceFile.java`
#### Snippet
```java
    StringBuilder newContent = new StringBuilder();
    int positionInOriginal = 0;
    for (Replacement repl : replacements) {
      checkArgument(
          repl.endPosition() <= sourceBuilder.length(),
          "End [%s] should not exceed source length [%s]",
          repl.endPosition(),
          sourceBuilder.length());

      // Write the unmodified content leading up to this change
      newContent.append(sourceBuilder, positionInOriginal, repl.startPosition());
      // And the modified content for this change
      newContent.append(repl.replaceWith());
      // Then skip everything from source between start and end
      positionInOriginal = repl.endPosition();
    }
    // Flush out any remaining content after the final change
    newContent.append(sourceBuilder, positionInOriginal, sourceBuilder.length());
```

### DuplicatedCode
Duplicated code
in `check_api/src/main/java/com/google/errorprone/fixes/SuggestedFixes.java`
#### Snippet
```java
    new TreeScanner<Void, Void>() {
      @Override
      public Void visitIdentifier(IdentifierTree tree, Void unused) {
        if (sym.equals(getSymbol(tree))) {
          fix.replace(tree, replacement);
        }
        return super.visitIdentifier(tree, null);
      }

      @Override
      public Void visitMemberSelect(MemberSelectTree tree, Void unused) {
        if (sym.equals(getSymbol(tree))) {
          fix.replace(
              state.getEndPosition(tree.getExpression()),
              state.getEndPosition(tree),
              "." + replacement);
        }
        return super.visitMemberSelect(tree, null);
      }
    }.scan(state.getPath().getCompilationUnit(), null);
    return fix.build();
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/google/errorprone/bugpatterns/BadImport.java`
#### Snippet
```java
    Symbol annotationSymbol = getSymbol(t.getAnnotationType());
    if (annotationSymbol == null) {
      return false;
    }
    Target target = annotationSymbol.getAnnotation(Target.class);
    if (target == null) {
      return false;
    }
    List<ElementType> value = Arrays.asList(target.value());
    return value.contains(ElementType.TYPE_USE) || value.contains(ElementType.TYPE_PARAMETER);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/google/errorprone/bugpatterns/BoxedPrimitiveConstructor.java`
#### Snippet
```java
      String optionalCast = "";
      String optionalSuffix = "";
      switch (doubleAndFloatStatus) {
        case PRIMITIVE_DOUBLE_INTO_FLOAT:
          // new Float(double).compareTo($foo) => Float.compare((float) double, foo)
          optionalCast = "(float) ";
          break;
        case BOXED_DOUBLE_INTO_FLOAT:
          // new Float(Double).compareTo($foo) => Float.compare(Double.floatValue(), foo)
          optionalSuffix = ".floatValue()";
          break;
        default:
          break;
      }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/google/errorprone/bugpatterns/ConstantOverflow.java`
#### Snippet
```java
    switch (kind) {
      case UNARY_PLUS:
        return +value;
      case UNARY_MINUS:
        return -value;
      case BITWISE_COMPLEMENT:
        return ~value;
      default:
        return null;
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/google/errorprone/bugpatterns/DefaultCharset.java`
#### Snippet
```java
    Description.Builder description = buildDescription(tree);
    for (CharsetFix charsetFix : CharsetFix.values()) {
      SuggestedFix.Builder fix =
          SuggestedFix.builder()
              .postfixWith(
                  getOnlyElement(tree.getArguments()),
                  String.format(", %s.name()", charsetFix.replacement()));
      charsetFix.addImport(fix);
      description.addFix(fix.build());
    }
    return description.build();
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/google/errorprone/bugpatterns/ImpossibleNullComparison.java`
#### Snippet
```java
        if (!PROTO_RECEIVER.matches(tree, state)) {
          return null;
        }
        if (tree.getKind() != Kind.METHOD_INVOCATION) {
          return null;
        }
        MethodInvocationTree method = (MethodInvocationTree) tree;
        if (!method.getArguments().isEmpty()) {
          return null;
        }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/google/errorprone/bugpatterns/IncompatibleModifiersChecker.java`
#### Snippet
```java
    Symbol sym = ASTHelpers.getSymbol(tree);
    if (sym == null) {
      return NO_MATCH;
    }
    Attribute.Compound annotation =
        sym.getRawAttributes().stream()
            .filter(a -> a.type.tsym.getQualifiedName().contentEquals(INCOMPATIBLE_MODIFIERS))
            .findAny()
            .orElse(null);
    if (annotation == null) {
      return NO_MATCH;
    }
    Set<Modifier> incompatibleModifiers = new LinkedHashSet<>();
    getValue(annotation, "value").ifPresent(a -> getModifiers(incompatibleModifiers, a));
    getValue(annotation, "modifier").ifPresent(a -> getModifiers(incompatibleModifiers, a));
    if (incompatibleModifiers.isEmpty()) {
      return NO_MATCH;
    }

    Tree parent = state.getPath().getParentPath().getLeaf();
    if (!(parent instanceof ModifiersTree)) {
      // e.g. An annotated package name
      return NO_MATCH;
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/google/errorprone/bugpatterns/IncompatibleModifiersChecker.java`
#### Snippet
```java
    class Visitor extends SimpleAnnotationValueVisitor8<Void, Void> {
      @Override
      public Void visitEnumConstant(VariableElement c, Void unused) {
        modifiers.add(Modifier.valueOf(c.getSimpleName().toString()));
        return null;
      }

      @Override
      public Void visitArray(List<? extends AnnotationValue> vals, Void unused) {
        vals.forEach(val -> val.accept(this, null));
        return null;
      }
    }
    attribute.accept(new Visitor(), null);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/google/errorprone/bugpatterns/PreconditionsInvalidPlaceholder.java`
#### Snippet
```java
    Symbol symbol = getSymbol(tree);
    if (!(symbol instanceof MethodSymbol)) {
      return false;
    }
    MethodSymbol methodSymbol = (MethodSymbol) symbol;
    return methodSymbol.getParameters().size() >= 2
        && isSubtype(methodSymbol.getParameters().get(1).type, state.getSymtab().stringType, state);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
      if (firstCaseInGroup) {
        groupedCaseCommentsAccumulator = new StringBuilder();
        replacementCodeBuilder.append("\n  ");
        if (!isDefaultCase) {
          replacementCodeBuilder.append("case ");
        }
      }
      replacementCodeBuilder.append(
          isDefaultCase ? "default" : printCaseExpressions(caseTree, state));

      if (analysisResult.groupedWithNextCase().get(caseIndex)) {
        firstCaseInGroup = false;
        replacementCodeBuilder.append(", ");
        // Capture comments from this case so they can be added to the group's transformed case
        if (!transformedBlockSource.trim().isEmpty()) {
          groupedCaseCommentsAccumulator.append(removeFallThruLines(transformedBlockSource));
        }
        // Add additional cases to the list on the lhs of the arrow
        continue;
      } else {
        // This case is the last case in its group, so insert the collected comments from the lhs of
        // the colon here
        transformedBlockSource = groupedCaseCommentsAccumulator + transformedBlockSource;
      }

      replacementCodeBuilder.append(" -> ");
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/google/errorprone/bugpatterns/TruthConstantAsserts.java`
#### Snippet
```java
    ExpressionTree rec = ASTHelpers.getReceiver(methodInvocationTree);
    if (rec == null) {
      return Description.NO_MATCH;
    }
    if (!ASSERT_THAT.matches(rec, state)) {
      return Description.NO_MATCH;
    }
    ExpressionTree expr = getOnlyElement(((MethodInvocationTree) rec).getArguments());
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedMethod.java`
#### Snippet
```java
    AtomicBoolean hasAnyNativeMethods = new AtomicBoolean(false);
    new TreeScanner<Void, Void>() {
      @Override
      public Void visitMethod(MethodTree tree, Void unused) {
        if (tree.getModifiers().getFlags().contains(Modifier.NATIVE)) {
          hasAnyNativeMethods.set(true);
        }
        return null;
      }
    }.scan(tree, null);
    return hasAnyNativeMethods.get();
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/CanIgnoreReturnValueSuggester.java`
#### Snippet
```java
    return firstNonNull(
        new SimpleTreeVisitor<Boolean, Void>() {
          @Override
          public Boolean visitParenthesized(ParenthesizedTree tree, Void unused) {
            return visit(tree.getExpression(), null);
          }

          @Override
          public Boolean visitTypeCast(TypeCastTree tree, Void unused) {
            return visit(tree.getExpression(), null);
          }

          @Override
          public Boolean visitIdentifier(IdentifierTree tree, Void unused) {
            return tree.getName().contentEquals("this");
            // TODO(cpovirk): Or a field that is always set to `this`, as in SelfAlwaysReturnsThis.
          }

          @Override
          public Boolean visitMethodInvocation(MethodInvocationTree tree, Void unused) {
            return getSymbol(tree).getSimpleName().contentEquals("self")
                || getSymbol(tree).getSimpleName().contentEquals("getThis");
          }
        }.visit(tree, null),
        false);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/google/errorprone/bugpatterns/collectionincompatibletype/TruthIncompatibleType.java`
#### Snippet
```java
    ExpressionTree receiver = getReceiver(tree);
    if (!START_OF_ASSERTION.matches(receiver, state)) {
      return Stream.empty();
    }

    ExpressionTree assertee = getOnlyElement(((MethodInvocationTree) receiver).getArguments());
    TypeSymbol assertionType =
        getOnlyElement(getSymbol((MethodInvocationTree) receiver).getParameters()).type.tsym;
    Type targetKeyType =
        extractTypeArgAsMemberOfSupertype(
            getType(ignoringCasts(assertee)),
            assertionType,
            /* typeArgIndex= */ 0,
            state.getTypes());
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/InvalidBlockTag.java`
#### Snippet
```java
      int pos = Utils.getStartPosition(docTree, state) + docTree.toString().indexOf(tag.name());
      String message = String.format("Tag name `%s` is unknown.", tag.name());
      state.reportMatch(
          bestMatch
              .map(
                  bm ->
                      buildDescription(diagnosticPosition(getCurrentPath(), state))
                          .setMessage(message + String.format(" Did you mean tag `%s`?", bm))
                          .addFix(SuggestedFix.replace(pos, pos + tag.name().length(), bm))
                          .build())
              .orElse(
                  buildDescription(diagnosticPosition(getCurrentPath(), state))
                      .setMessage(
                          message
                              + " If this is a commonly-used custom tag, please "
                              + "click 'not useful' and file a bug.")
                      .build()));
      fixedTags.add(docTree);
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableAnalysis.java`
#### Snippet
```java
    ClassType superType = (ClassType) state.getTypes().supertype(type);
    if (superType.getKind() == TypeKind.NONE
        || state.getTypes().isSameType(state.getSymtab().objectType, superType)) {
      return Violation.absent();
    }
    if (WellKnownMutability.isAnnotation(state, type)) {
      // TODO(b/25630189): add enforcement
      return Violation.absent();
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableAnalysis.java`
#### Snippet
```java
    Map<Symbol, Tree> declarations = new HashMap<>();
    if (tree.isPresent()) {
      for (Tree member : tree.get().getMembers()) {
        Symbol sym = ASTHelpers.getSymbol(member);
        if (sym != null) {
          declarations.put(sym, member);
        }
      }
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableChecker.java`
#### Snippet
```java
      if (annotation == null) {
        continue;
      }
      for (TypeVariableSymbol typaram : s.getTypeParameters()) {
        String name = typaram.getSimpleName().toString();
        if (annotation.containerOf().contains(name)) {
          result.add(name);
        }
      }
      if (isStatic(s)) {
        break;
      }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/google/errorprone/bugpatterns/time/JodaPlusMinusLong.java`
#### Snippet
```java
    ExpressionTree firstArgumentTree = tree.getArguments().get(0);
    String firstArgumentReplacement;
    if (DURATION_GET_MILLIS_MATCHER.matches(firstArgumentTree, state)) {
      // This is passing {@code someDuration.getMillis()} as the parameter. we can replace this
      // with {@code someDuration}.
      firstArgumentReplacement = state.getSourceForNode(ASTHelpers.getReceiver(firstArgumentTree));
    } else {
      // Wrap the long as a Duration.
      firstArgumentReplacement =
          SuggestedFixes.qualifyType(state, builder, "org.joda.time.Duration")
              + ".millis("
              + state.getSourceForNode(firstArgumentTree)
              + ")";
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/google/errorprone/refaster/UPlaceholderExpression.java`
#### Snippet
```java
    ImmutableList<UVariableDecl> placeholderParams = placeholder.parameters().asList();
    ImmutableList<UExpression> argumentsList = ImmutableList.copyOf(arguments);
    ImmutableMap.Builder<UVariableDecl, UExpression> builder = ImmutableMap.builder();
    for (int i = 0; i < placeholderParams.size(); i++) {
      builder.put(placeholderParams.get(i), argumentsList.get(i));
    }
```

### DuplicatedCode
Duplicated code
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
    String name;
    try {
      matches.value();
      throw new RuntimeException("unreachable");
    } catch (MirroredTypeException e) {
      DeclaredType type = (DeclaredType) e.getTypeMirror();
      name = ((TypeElement) type.asElement()).getQualifiedName().toString();
    }
    try {
      return asSubclass(Class.forName(name), new TypeToken<Matcher<? super ExpressionTree>>() {});
    } catch (ClassNotFoundException | ClassCastException e) {
      throw new RuntimeException(e);
    }
```

### DuplicatedCode
Duplicated code
in `test_helpers/src/main/java/com/google/errorprone/DiagnosticTestHelper.java`
#### Snippet
```java
        if (item.getSource() == null) {
          mismatchDescription
              .appendText("diagnostic not attached to a file: ")
              .appendValue(item.getMessage(ENGLISH));
          return false;
        }

        if (!item.getSource().toUri().equals(fileURI)) {
          mismatchDescription.appendText("diagnostic not in file ").appendValue(fileURI);
          return false;
        }

        if (item.getLineNumber() != line) {
          mismatchDescription
              .appendText("diagnostic not on line ")
              .appendValue(item.getLineNumber());
          return false;
        }
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return 'true' but there's no such enum constant in SuppressedState
in `check_api/src/main/java/com/google/errorprone/SuppressionInfo.java`
#### Snippet
```java

  /**
   * Returns true if this checker should be considered suppressed given the signals present in this
   * object.
   *
```

### MismatchedJavadocCode
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

### MismatchedJavadocCode
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

### MismatchedJavadocCode
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

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
    // unreachable, which would lead to a compile-time error. Therefore, suggest that they be
    // removed.
    statementsToDelete.addAll(followingStatementsInBlock(switchTree, state));

    SuggestedFix.Builder suggestedFixBuilder =
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `AnonymousClassUsingStateMatcher` may be 'static'
in `core/src/main/java/com/google/errorprone/bugpatterns/CollectorShouldNotUseState.java`
#### Snippet
```java
     Matches an anonymous inner class that contains one or more members that are not final
  */
  private class AnonymousClassUsingStateMatcher implements Matcher<Tree> {

    @Override
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Multiset.count()'
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedTypeParameter.java`
#### Snippet
```java
      private void handle(Tree tree, List<? extends TypeParameterTree> typeParameters) {
        for (TypeParameterTree typeParameter : typeParameters) {
          if (usedIdentifiers.count(getSymbol(typeParameter)) == 1) {
            state.reportMatch(
                describeMatch(
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `core/src/main/java/com/google/errorprone/refaster/UTemplater.java`
#### Snippet
```java
        context.get(RefasterRuleBuilderScanner.PLACEHOLDER_METHODS_KEY);
    return (placeholderMethods != null && expr != null)
        ? placeholderMethods.get(ASTHelpers.getSymbol(expr))
        : null;
  }
```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableCollection.contains()'
in `core/src/main/java/com/google/errorprone/bugpatterns/LoopConditionChecker.java`
#### Snippet
```java
    private void check(ExpressionTree expression) {
      Symbol sym = ASTHelpers.getSymbol(expression);
      modified |= variables.contains(sym);
    }
  }
```

### SuspiciousMethodCalls
Suspicious call to 'List.indexOf()'
in `core/src/main/java/com/google/errorprone/bugpatterns/LockNotBeforeTry.java`
#### Snippet
```java
    if (enclosingTry != null && releases(enclosingTry, lockee, state)) {
      Description.Builder description = buildDescription(lockInvocation);
      if (enclosingTry.getBlock().getStatements().indexOf(lockStatement) == 0) {
        description.addFix(
            SuggestedFix.builder()
```

### SuspiciousMethodCalls
Suspicious call to 'List.indexOf()'
in `core/src/main/java/com/google/errorprone/bugpatterns/LockNotBeforeTry.java`
#### Snippet
```java
    }
    BlockTree block = (BlockTree) enclosing;
    int index = block.getStatements().indexOf(lockStatement);
    // Scan through the enclosing statements
    for (StatementTree statement : Iterables.skip(block.getStatements(), index + 1)) {
```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryBoxedVariable.java`
#### Snippet
```java
    public Void scan(Tree tree, Void unused) {
      var symbol = getSymbol(tree);
      if (boxedUsageFound.contains(symbol)) {
        return null;
      }
```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableCollection.contains()'
in `core/src/main/java/com/google/errorprone/bugpatterns/DirectInvocationOnMock.java`
#### Snippet
```java
        var symbol = getSymbol(tree);
        return symbol != null
            && (mocks.contains(symbol)
                || symbol.getAnnotationMirrors().stream()
                    .filter(am -> am.type.tsym.getQualifiedName().contentEquals("org.mockito.Mock"))
```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `core/src/main/java/com/google/errorprone/bugpatterns/StronglyType.java`
#### Snippet
```java
      private void handle(Tree tree) {
        Symbol symbol = getSymbol(tree);
        if (!fields.containsKey(symbol)) {
          return;
        }
```

### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `core/src/main/java/com/google/errorprone/bugpatterns/StronglyType.java`
#### Snippet
```java
        if (!(parent instanceof ExpressionTree)
            || !factoryMatcher().matches((ExpressionTree) parent, state)) {
          fields.remove(symbol);
          return;
        }
```

### SuspiciousMethodCalls
Suspicious call to 'List.indexOf()'
in `core/src/main/java/com/google/errorprone/bugpatterns/JdkObsolete.java`
#### Snippet
```java
    } else if (parent instanceof MethodInvocationTree) {
      MethodInvocationTree tree = (MethodInvocationTree) parent;
      int idx = tree.getArguments().indexOf(state.getPath().getLeaf());
      if (idx == -1) {
        return null;
```

### SuspiciousMethodCalls
Suspicious call to 'List.indexOf()'
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractMustBeClosedChecker.java`
#### Snippet
```java
    }
    BlockTree block = (BlockTree) parent;
    int idx = block.getStatements().indexOf(path.getLeaf());
    if (idx == -1 || idx == block.getStatements().size() - 1) {
      return false;
```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `core/src/main/java/com/google/errorprone/bugpatterns/MixedMutabilityReturnType.java`
#### Snippet
```java
        if (returnTree.getExpression() instanceof IdentifierTree) {
          Symbol symbol = getSymbol(returnTree.getExpression());
          if (mutable.contains(symbol)) {
            mutableReturns.add(returnTree);
            return super.visitReturn(returnTree, null);
```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `core/src/main/java/com/google/errorprone/bugpatterns/MixedMutabilityReturnType.java`
#### Snippet
```java
            return super.visitReturn(returnTree, null);
          }
          if (immutable.contains(symbol)) {
            immutableReturns.add(returnTree);
            return super.visitReturn(returnTree, null);
```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `core/src/main/java/com/google/errorprone/bugpatterns/SelfAlwaysReturnsThis.java`
#### Snippet
```java
      /** Returns whether the given {@link ExpressionTree} is {@code this}. */
      private boolean isThis(ExpressionTree returnExpression) {
        return maybeCastThis(returnExpression) || thises.contains(getSymbol(returnExpression));
      }

```

### SuspiciousMethodCalls
Suspicious call to 'List.indexOf()'
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedVariable.java`
#### Snippet
```java
      Symbol varSymbol, List<TreePath> usagePaths, VisitorState state) {
    MethodSymbol methodSymbol = (MethodSymbol) varSymbol.owner;
    int index = methodSymbol.params.indexOf(varSymbol);
    SuggestedFix.Builder fix = SuggestedFix.builder();
    for (TreePath path : usagePaths) {
```

### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `core/src/main/java/com/google/errorprone/bugpatterns/FieldCanBeLocal.java`
#### Snippet
```java
      public Void visitIdentifier(IdentifierTree identifierTree, Void unused) {
        if (!inMethod) {
          potentialFields.remove(getSymbol(identifierTree));
        }
        return null;
```

### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `core/src/main/java/com/google/errorprone/bugpatterns/FieldCanBeLocal.java`
#### Snippet
```java
      public Void visitMemberSelect(MemberSelectTree memberSelectTree, Void unused) {
        if (!inMethod) {
          potentialFields.remove(getSymbol(memberSelectTree));
        }
        return super.visitMemberSelect(memberSelectTree, null);
```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/EqualsBrokenForNull.java`
#### Snippet
```java
      public Void visitIf(IfTree ifTree, Void unused) {
        ExpressionTree condition = ASTHelpers.stripParentheses(ifTree.getCondition());
        if (condition instanceof IdentifierTree && impliesNonNull.contains(getSymbol(condition))) {
          return scan(ifTree.getElseStatement(), null);
        }
```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/EqualsBrokenForNull.java`
#### Snippet
```java
          InstanceOfTree instanceOf = (InstanceOfTree) initializer;
          if (instanceOf.getExpression() instanceof IdentifierTree
              && incomingVariableSymbols.contains(getSymbol(instanceOf.getExpression()))) {
            impliesNonNull.add(getSymbol(variableTree));
          }
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/InlinabilityResult.java`
#### Snippet
```java
      public Void visitIdentifier(IdentifierTree identifierTree, Void aVoid) {
        Symbol usedSymbol = getSymbol(identifierTree);
        if (parameterVariables.contains(usedSymbol) && !usedVariables.add(usedSymbol)) {
          usesVarsTwice.set(usedSymbol);
        }
```

### SuspiciousMethodCalls
Suspicious call to 'ImmutableCollection.contains()'
in `core/src/main/java/com/google/errorprone/bugpatterns/inlineme/InlinabilityResult.java`
#### Snippet
```java
        // If the lambda captures method parameters, inlining the method body can change the
        // timing of the evaluation of the arguments.
        if (currentLambdaTree != null && params.contains(getSymbol(identifierTree))) {
          paramReferred.set(true);
        }
```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullnessUtils.java`
#### Snippet
```java
         */
        return isVoid(getType(tree), stateForCompilationUnit)
            || definitelyNullVars.contains(getSymbol(tree))
            /*
             * TODO(cpovirk): It would be nicer to report the finding on the null-returning `case`
```

### SuspiciousMethodCalls
Suspicious call to 'List.indexOf()'
in `core/src/main/java/com/google/errorprone/bugpatterns/formatstring/StrictFormatStringValidation.java`
#### Snippet
```java

    List<VarSymbol> ownerParams = ((MethodSymbol) formatStringSymbol.owner).getParameters();
    int ownerFormatStringIndex = ownerParams.indexOf(formatStringSymbol);

    ImmutableList.Builder<Type> ownerFormatArgTypesBuilder = ImmutableList.builder();
```

### SuspiciousMethodCalls
Suspicious call to 'Set.contains()'
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/NoCanIgnoreReturnValueOnClasses.java`
#### Snippet
```java
          /** Returns whether the given {@link ExpressionTree} is {@code this}. */
          private boolean isThis(ExpressionTree returnExpression) {
            return maybeCastThis(returnExpression) || thises.contains(getSymbol(returnExpression));
          }

```

### SuspiciousMethodCalls
Suspicious call to 'List.indexOf()'
in `check_api/src/main/java/com/google/errorprone/util/MoreAnnotations.java`
#### Snippet
```java
        switch (position.type) {
          case METHOD_FORMAL_PARAMETER:
            return ((MethodSymbol) sym.owner).getParameters().indexOf(sym)
                == position.parameter_index;
          default:
```

### SuspiciousMethodCalls
Suspicious call to 'Multimap.containsKey()'
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
      if (tree.getExpression() instanceof IdentifierTree) {
        Symbol symbol = getSymbol(tree.getExpression());
        if (thrownTypesByVariable.containsKey(symbol)) {
          getThrownTypes().addAll(thrownTypesByVariable.get((VarSymbol) symbol));
          return super.visitThrow(tree, null);
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/TruthSelfEquals.java`
#### Snippet
```java
          return false;
        }
        if (!ASTHelpers.sameVariable(
            getOnlyElement(((MethodInvocationTree) rec).getArguments()),
            getOnlyElement(t.getArguments()))) {
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/JUnit3FloatingPointComparisonWithoutDelta.java`
#### Snippet
```java
    }
    // Neither argument is primitive.
    if (!firstType.isPrimitive() && !secondType.isPrimitive()) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/DeduplicateConstants.java`
#### Snippet
```java
      if (parent != null) {
        sym = parent.get(value);
        if (sym != null) {
          return sym;
        }
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java
      return true;
    }
    if (c == 0x1a && i == sourceCode.length() - 1) {
      // javac inserts ASCII_SUB characters at the end of the input, see:
      // https://github.com/google/error-prone/issues/3092
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/MustBeClosedChecker.java`
#### Snippet
```java
                return false;
              }
              if (t instanceof MethodInvocationTree && ASTHelpers.getSymbol(t).isConstructor()) {
                // Invocations of constructors, like `this()` and `super()`, act kinda weird.
                // they're handled specially in matchClass, and should be ignored here.
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/ParameterName.java`
#### Snippet
```java
      return false;
    }
    if (!actual.contains(tokens.getFirst().pos())) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/Interruption.java`
#### Snippet
```java
    }
    Symbol.ClassSymbol classSymbol = enclosingClass(methodSymbol);
    if (!classSymbol.isSubClass(JAVA_UTIL_CONCURRENT_FUTURE.get(state), state.getTypes())) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/JdkObsolete.java`
#### Snippet
```java
      return false;
    }
    if (!ASTHelpers.isSameType(method.getReturnType(), type, state)) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/ReferenceEquality.java`
#### Snippet
```java
      return false;
    }
    if (!implementsEquals(type, state)) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/HidingField.java`
#### Snippet
```java
        && !parentVariable.getModifiers().contains(Modifier.PUBLIC)) { // package-private variable

      if (!enclosingPackage(parentVariable).equals(enclosingPackage(getSymbol(currClass)))) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/ThreeLetterTimeZoneID.java`
#### Snippet
```java
    if (state.getPath().getParentPath() != null) {
      Tree parentLeaf = state.getPath().getParentPath().getLeaf();
      if (parentLeaf instanceof ExpressionTree
          && JODATIME_METHOD_MATCHER.matches((ExpressionTree) parentLeaf, state)) {
        return true;
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/InvalidTimeZoneID.java`
#### Snippet
```java
      return true;
    }
    if (CUSTOM_ID_PATTERN.matcher(value).matches()) {
      // Value is a custom ID, so it's supported.
      return true;
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedMethod.java`
#### Snippet
```java
        // Don't delete unused zero-arg constructors, given those are often there to limit
        // instantiating the class at all (e.g. in utility classes).
        if (methodSymbol.params().isEmpty()) {
          return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedMethod.java`
#### Snippet
```java
          }
        }
        if (!methodSymbol.isPrivate()
            && classesMadeVisible.stream()
                .anyMatch(t -> isSubtype(t.type, methodSymbol.owner.type, state))) {
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/JUnit4TestNotRun.java`
#### Snippet
```java
  private boolean isParameterAnnotation(AnnotationTree annotation, VisitorState state) {
    Type annotationType = getType(annotation);
    if (isSameType(annotationType, FROM_DATA_POINTS.get(state), state)) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/ThreadLocalUsage.java`
#### Snippet
```java
              }
              Type scopeType = COM_GOOGLE_INJECT_SCOPE.get(state);
              if (isSubtype(getType(c), scopeType, state)) {
                return true;
              }
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/ThreadLocalUsage.java`
#### Snippet
```java
      return true;
    }
    if (isSubtype(argType, JAVA_TEXT_DATEFORMAT.get(state), state)) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedVariable.java`
#### Snippet
```java
      }
      // Otherwise it's assigned if the VariableTree has an initializer.
      if (unusedElements.containsKey(symbol) && tree.getInitializer() != null) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/ComparingThisWithNull.java`
#### Snippet
```java
      if (thisExpression.getKind().equals(Kind.IDENTIFIER)) {
        IdentifierTree identifier = (IdentifierTree) thisExpression;
        if (identifier.getName().contentEquals("this")) {
          return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/MissingFail.java`
#### Snippet
```java
    }

    if (tree.getBlock().getStatements().isEmpty()) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/ElementPredicates.java`
#### Snippet
```java
          getConstructorsWithAnnotations(
              injectedMember, Arrays.asList("javax.inject.Inject", "com.google.inject.Inject"));
      if (injectConstructors.size() > 1 && injectConstructors.get(0).equals(injectedMember)) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/dagger/RefersToDaggerCodegen.java`
#### Snippet
```java
        .anyMatch(dagger1Type -> isGeneratedBaseType(rootCallingClass, state, dagger1Type))) {
      return true;
    } else if (isGeneratedBaseType(rootCallingClass, state, "dagger.MembersInjector")
        && rootCallingClass.getSimpleName().toString().contains("$$ParentAdapter")) {
      return true;
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullArgumentForNonNullParameter.java`
#### Snippet
```java
    }

    if (enclosingAnnotationDefaultsNonTypeVariablesToNonNull(sym, state)) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/NoCanIgnoreReturnValueOnClasses.java`
#### Snippet
```java
        if (hasAnnotation(enclosingClass, "com.google.auto.value.AutoValue", state)
            || hasAnnotation(enclosingClass, "com.google.auto.value.AutoValue.Builder", state)) {
          if (methodTree.getBody() == null) {
            return false;
          }
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/BuilderReturnThis.java`
#### Snippet
```java
    // or perhaps "a non-Object supertype of the this-type", for interfaces
    Type returnType = sym.getReturnType();
    if (!isSubtype(enclosingClass.asType(), returnType, state)
        || isSameType(returnType, state.getSymtab().objectType, state)) {
      return false;
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafety.java`
#### Snippet
```java
    }
    // (3)
    if (annotation.containerOf().contains(typaram.getSimpleName().toString())) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `core/src/main/java/com/google/errorprone/bugpatterns/argumentselectiondefects/Matchers.java`
#### Snippet
```java
          }

          if (!ASTHelpers.hasDirectAnnotationWithSimpleName(superSymbol, "AutoValue")) {
            return false;
          }
```

### TrivialIf
`if` statement can be simplified
in `check_api/src/main/java/com/google/errorprone/util/Reachability.java`
#### Snippet
```java
      }
      // (4)
      if (breaks.contains(that)) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `check_api/src/main/java/com/google/errorprone/util/Reachability.java`
#### Snippet
```java
    @Override
    public Boolean visitExpressionStatement(ExpressionStatementTree tree, Void unused) {
      if (isSystemExit(tree.getExpression())) {
        // The spec doesn't have any special handling for {@code System.exit}, but in practice it
        // cannot complete normally
```

### TrivialIf
`if` statement can be simplified
in `check_api/src/main/java/com/google/errorprone/util/Reachability.java`
#### Snippet
```java
      }
      // (2)
      if (breaks.contains(that)) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `check_api/src/main/java/com/google/errorprone/util/Reachability.java`
#### Snippet
```java
      }
      // (5)
      if (breaks.contains(tree)) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `check_api/src/main/java/com/google/errorprone/util/Reachability.java`
#### Snippet
```java
      }
      // (2)
      if (breaks.contains(tree)) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `check_api/src/main/java/com/google/errorprone/util/FindIdentifiers.java`
#### Snippet
```java
                    || (curr.getKind() == Kind.CLASS && parent.getKind() == Kind.BLOCK),
            (curr, unused) -> Objects.equals(var.owner, ASTHelpers.getSymbol(curr)))) {
          if (!isConsideredFinal(var)) {
            return false;
          }
```

### TrivialIf
`if` statement can be simplified
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java

    // don't match overrides (even "effective overrides")
    if (!findSuperMethods(method, state.getTypes()).isEmpty()) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `check_api/src/main/java/com/google/errorprone/matchers/CompileTimeConstantExpressionMatcher.java`
#### Snippet
```java
              }
              // Check if the symbol has the @CompileTimeConstant annotation.
              if (hasCompileTimeConstantAnnotation(state, varSymbol)) {
                return true;
              }
```

### TrivialIf
`if` statement can be simplified
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/NullnessPropagationTransfer.java`
#### Snippet
```java
      }
      MemberName searchMemberName = new MemberName(methodInfo.clazz(), methodInfo.method());
      if (METHODS_WITH_NON_NULLABLE_RETURNS.contains(searchMemberName)) {
        return true;
      }
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'a'
in `core/src/main/java/com/google/errorprone/bugpatterns/MixedDescriptors.java`
#### Snippet
```java
  }

  private static boolean typesDiffer(Optional<TypeSymbol> a, Optional<TypeSymbol> b) {
    return a.isPresent() && b.isPresent() && !a.get().equals(b.get());
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'b'
in `core/src/main/java/com/google/errorprone/bugpatterns/MixedDescriptors.java`
#### Snippet
```java
  }

  private static boolean typesDiffer(Optional<TypeSymbol> a, Optional<TypeSymbol> b) {
    return a.isPresent() && b.isPresent() && !a.get().equals(b.get());
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'assignmentTargetOptional'
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
    static AssignmentSwitchAnalysisResult of(
        boolean canConvertToAssignmentSwitch,
        Optional<ExpressionTree> assignmentTargetOptional,
        Optional<Tree.Kind> assignmentKindOptional,
        Optional<String> assignmentSourceCodeOptional) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'assignmentKindOptional'
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
        boolean canConvertToAssignmentSwitch,
        Optional<ExpressionTree> assignmentTargetOptional,
        Optional<Tree.Kind> assignmentKindOptional,
        Optional<String> assignmentSourceCodeOptional) {
      return new AutoValue_StatementSwitchToExpressionSwitch_AssignmentSwitchAnalysisResult(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'assignmentSourceCodeOptional'
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
        Optional<ExpressionTree> assignmentTargetOptional,
        Optional<Tree.Kind> assignmentKindOptional,
        Optional<String> assignmentSourceCodeOptional) {
      return new AutoValue_StatementSwitchToExpressionSwitch_AssignmentSwitchAnalysisResult(
          canConvertToAssignmentSwitch,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'assignmentTargetOptional'
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
    static AssignmentSwitchAnalysisState of(
        CaseQualifications assignmentSwitchCaseQualifications,
        Optional<ExpressionTree> assignmentTargetOptional,
        Optional<Tree.Kind> assignmentKindOptional,
        Optional<ExpressionTree> assignmentTreeOptional) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'assignmentKindOptional'
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
        CaseQualifications assignmentSwitchCaseQualifications,
        Optional<ExpressionTree> assignmentTargetOptional,
        Optional<Tree.Kind> assignmentKindOptional,
        Optional<ExpressionTree> assignmentTreeOptional) {
      return new AutoValue_StatementSwitchToExpressionSwitch_AssignmentSwitchAnalysisState(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'assignmentTreeOptional'
in `core/src/main/java/com/google/errorprone/bugpatterns/StatementSwitchToExpressionSwitch.java`
#### Snippet
```java
        Optional<ExpressionTree> assignmentTargetOptional,
        Optional<Tree.Kind> assignmentKindOptional,
        Optional<ExpressionTree> assignmentTreeOptional) {
      return new AutoValue_StatementSwitchToExpressionSwitch_AssignmentSwitchAnalysisState(
          assignmentSwitchCaseQualifications,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'fix'
in `core/src/main/java/com/google/errorprone/bugpatterns/AbstractToString.java`
#### Snippet
```java
  }

  private Description maybeFix(Tree tree, VisitorState state, Type matchedType, Optional<Fix> fix) {
    Description.Builder description = buildDescription(tree);
    fix.ifPresent(description::addFix);
```

### OptionalUsedAsFieldOrParameterType
`Optional`> used as type for field 'alsoForbidApisAnnotated'
in `core/src/main/java/com/google/errorprone/bugpatterns/apidiff/ApiDiffChecker.java`
#### Snippet
```java

  private final ApiDiff apiDiff;
  private final Optional<Class<? extends Annotation>> alsoForbidApisAnnotated;

  protected ApiDiffChecker(ApiDiff apiDiff) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'fix'
in `core/src/main/java/com/google/errorprone/bugpatterns/flogger/FloggerRedundantIsEnabled.java`
#### Snippet
```java
    private final ExpressionTree logInvocation;
    private final VisitorState state;
    public Optional<SuggestedFix> fix;

    public LoggerIsEnabledBinaryIfConditionScanner(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'sym'
in `core/src/main/java/com/google/errorprone/bugpatterns/flogger/FloggerRequiredModifiers.java`
#### Snippet
```java
  private static final class LocalLogger {

    LocalLogger(Provenance provenance, Optional<Symbol> sym, String name) {
      this.provenance = provenance;
      this.sym = sym;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'sym'
in `core/src/main/java/com/google/errorprone/bugpatterns/flogger/FloggerRequiredModifiers.java`
#### Snippet
```java

    final Provenance provenance;
    final Optional<Symbol> sym;
    final String name;
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'tree'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafeAnalysis.java`
#### Snippet
```java
  /** Check a single field for thread safe. */
  private Violation isFieldThreadSafe(
      Optional<Tree> tree,
      Set<String> threadSafeTypeParams,
      ClassSymbol classSym,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'tree'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafeAnalysis.java`
#### Snippet
```java
   */
  Violation areFieldsThreadSafe(
      Optional<ClassTree> tree, ImmutableSet<String> threadSafeTypeParams, ClassType classType) {
    ClassSymbol classSym = (ClassSymbol) classType.tsym;
    if (classSym.members() == null) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'tree'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafeAnalysis.java`
#### Snippet
```java
   */
  public Violation checkForThreadSafety(
      Optional<ClassTree> tree, ImmutableSet<String> threadSafeTypeParams, ClassType type) {
    Violation info = areFieldsThreadSafe(tree, threadSafeTypeParams, type);
    if (info.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'tree'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafeAnalysis.java`
#### Snippet
```java

  private Violation processModifier(
      Optional<Tree> tree, ClassSymbol classSym, VarSymbol var, Modifier modifier, String message) {

    if (tree.isPresent()) {
```

### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'suggestedFix'
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ImmutableAnalysis.java`
#### Snippet
```java

    @CheckReturnValue
    default Description report(Tree tree, Violation info, Optional<SuggestedFix> suggestedFix) {
      Description.Builder description = describe(tree, info);
      suggestedFix.ifPresent(description::addFix);
```

### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'methodDefault'
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/Rules.java`
#### Snippet
```java
   */
  public static ResultUseRule<VisitorState, Symbol> globalDefault(
      Optional<ResultUsePolicy> methodDefault, Optional<ResultUsePolicy> constructorDefault) {
    return new SimpleGlobalRule("GLOBAL_DEFAULT", methodDefault, constructorDefault);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'constructorDefault'
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/Rules.java`
#### Snippet
```java
   */
  public static ResultUseRule<VisitorState, Symbol> globalDefault(
      Optional<ResultUsePolicy> methodDefault, Optional<ResultUsePolicy> constructorDefault) {
    return new SimpleGlobalRule("GLOBAL_DEFAULT", methodDefault, constructorDefault);
  }
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'methodDefault'
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/Rules.java`
#### Snippet
```java
  private static final class SimpleGlobalRule extends GlobalRule<VisitorState, Symbol> {
    private final String id;
    private final Optional<ResultUsePolicy> methodDefault;
    private final Optional<ResultUsePolicy> constructorDefault;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'constructorDefault'
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/Rules.java`
#### Snippet
```java
    private final String id;
    private final Optional<ResultUsePolicy> methodDefault;
    private final Optional<ResultUsePolicy> constructorDefault;

    private SimpleGlobalRule(
```

### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'severity'
in `check_api/src/main/java/com/google/errorprone/matchers/Description.java`
#### Snippet
```java
      @Nullable String linkUrl,
      List<Fix> fixes,
      Optional<SeverityLevel> severity) {
    this.position = position;
    this.checkName = checkName;
```

### OptionalUsedAsFieldOrParameterType
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

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'severity'
in `check_api/src/main/java/com/google/errorprone/matchers/Description.java`
#### Snippet
```java
    private final String name;
    private String linkUrl;
    private Optional<SeverityLevel> severity = Optional.empty();
    private final ImmutableList.Builder<Fix> fixListBuilder = ImmutableList.builder();
    private String rawMessage;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'severity'
in `check_api/src/main/java/com/google/errorprone/matchers/Description.java`
#### Snippet
```java

  /** Is this a warning, error, etc.? */
  private final Optional<BugPattern.SeverityLevel> severity;

  public BugPattern.SeverityLevel severity() {
```

### OptionalUsedAsFieldOrParameterType
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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'JavacProcessingEnvironment' used without 'try'-with-resources statement
in `check_api/src/main/java/com/google/errorprone/ErrorPronePlugins.java`
#### Snippet
```java
    // Use the same classloader that Error Prone was loaded from to avoid classloader skew
    // when using Error Prone plugins together with the Error Prone javac plugin.
    JavacProcessingEnvironment processingEnvironment = JavacProcessingEnvironment.instance(context);
    ClassLoader loader = processingEnvironment.getProcessorClassLoader();
    ImmutableList<Class<? extends BugChecker>> extraBugCheckers =
```

### AutoCloseableResource
'JavacProcessingEnvironment' used without 'try'-with-resources statement
in `check_api/src/main/java/com/google/errorprone/matchers/Matchers.java`
#### Snippet
```java
    String annotationName = annotationMirror.toString();
    return (Tree tree, VisitorState state) -> {
      JavacProcessingEnvironment javacEnv = JavacProcessingEnvironment.instance(state.context);
      TypeElement typeElem = (TypeElement) javacEnv.getTypeUtils().asElement(annotationMirror);
      String name;
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `node.getElement()` to `VariableElement` is redundant
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/NullnessPropagationTransfer.java`
#### Snippet
```java
  private static boolean hasNonNullConstantValue(LocalVariableNode node) {
    if (node.getElement() instanceof VariableElement) {
      VariableElement element = (VariableElement) node.getElement();
      return (element.getConstantValue() != null);
    }
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Illegal character
in `core/src/main/java/com/google/errorprone/refaster/RefasterSuppressionHelper.java`
#### Snippet
```java
  }

  /** Adapts a {@link RefasterRule<?, ?>} into a {@link Suppressible}. */
  private static class RefasterSuppressible implements Suppressible {

```

### JavadocDeclaration
Illegal character
in `core/src/main/java/com/google/errorprone/refaster/RefasterSuppressionHelper.java`
#### Snippet
```java
  }

  /** Adapts a {@link RefasterRule<?, ?>} into a {@link Suppressible}. */
  private static class RefasterSuppressible implements Suppressible {

```

### JavadocDeclaration
Illegal character
in `core/src/main/java/com/google/errorprone/refaster/RefasterSuppressionHelper.java`
#### Snippet
```java
  }

  /** Adapts a {@link RefasterRule<?, ?>} into a {@link Suppressible}. */
  private static class RefasterSuppressible implements Suppressible {

```

### JavadocDeclaration
Illegal character
in `core/src/main/java/com/google/errorprone/refaster/RefasterSuppressionHelper.java`
#### Snippet
```java
  }

  /** Adapts a {@link RefasterRule<?, ?>} into a {@link Suppressible}. */
  private static class RefasterSuppressible implements Suppressible {

```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `unconditionallyAssigned` may be 'final'
in `core/src/main/java/com/google/errorprone/bugpatterns/FieldCanBeLocal.java`
#### Snippet
```java
        int depth = Iterables.size(getCurrentPath());
        new TreePathScanner<Void, Void>() {
          Set<VarSymbol> unconditionallyAssigned = new HashSet<>();

          @Override
```

### FieldMayBeFinal
Field `baseUrl` may be 'final'
in `docgen/src/main/java/com/google/errorprone/DocGenTool.java`
#### Snippet
```java
        description = "The base url for links to bugpatterns",
        arity = 1)
    private String baseUrl = null;
  }

```

### FieldMayBeFinal
Field `ancestorState` may be 'final'
in `check_api/src/main/java/com/google/errorprone/matchers/HasIdentifier.java`
#### Snippet
```java

    private Matcher<IdentifierTree> idMatcher;
    private VisitorState ancestorState;

    public HasIdentifierScanner(VisitorState ancestorState, Matcher<IdentifierTree> idMatcher) {
```

### FieldMayBeFinal
Field `idMatcher` may be 'final'
in `check_api/src/main/java/com/google/errorprone/matchers/HasIdentifier.java`
#### Snippet
```java
  private static class HasIdentifierScanner extends TreePathScanner<Boolean, Void> {

    private Matcher<IdentifierTree> idMatcher;
    private VisitorState ancestorState;

```

## RuleId[id=JavaReflectionInvocation]
### JavaReflectionInvocation
Argument is not assignable to 'com.google.errorprone.refaster.USimpleStatement'
in `core/src/main/java/com/google/errorprone/refaster/UEnhancedForLoop.java`
#### Snippet
```java
      return AutoValue_UEnhancedForLoop.class
          .getDeclaredConstructor(UVariableDecl.class, UExpression.class, USimpleStatement.class)
          .newInstance(variable, elements, statement);
    } catch (ReflectiveOperationException e) {
      throw new LinkageError(e.getMessage(), e);
```

### JavaReflectionInvocation
Argument is not assignable to 'com.google.errorprone.refaster.USimpleStatement'
in `core/src/main/java/com/google/errorprone/refaster/UEnhancedForLoop.java`
#### Snippet
```java
              UExpression.class,
              USimpleStatement.class)
          .newInstance(declarationKind, variable, elements, statement);
    } catch (ReflectiveOperationException e) {
      throw new LinkageError(e.getMessage(), e);
```

### JavaReflectionInvocation
Argument is not assignable to 'com.sun.tools.javac.util.List'
in `core/src/main/java/com/google/errorprone/refaster/PlaceholderUnificationVisitor.java`
#### Snippet
```java
                    maker(),
                    caseKind,
                    RuntimeVersion.isAtLeast17()
                        ? CaseTree.class.getMethod("getLabels").invoke(node)
                        : List.of((JCExpression) node.getExpression()),
                    stmts,
                    /* body */ null);
```

### JavaReflectionInvocation
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

### JavaReflectionInvocation
Argument is not assignable to 'com.sun.tools.javac.code.TypeMetadata'
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/ApiFactory.java`
#### Snippet
```java
      try {
        Method method = Type.class.getMethod("cloneWithMetadata", TypeMetadata.class);
        return (Type) method.invoke(type, TypeMetadata.class.getField("EMPTY").get(null));
      } catch (NoSuchMethodException e) {
        Class<?> annotations = Class.forName("com.sun.tools.javac.code.TypeMetadata$Annotations");
```

### JavaReflectionInvocation
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

### JavaReflectionInvocation
Argument is not assignable to 'com.sun.tools.javac.tree.JCTree'
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java
            TypeAnnotations.class
                .getMethod("annotationTargetType", JCTree.class, Compound.class, Symbol.class)
                .invoke(typeAnnotations, tree, compound, target);
      } catch (NoSuchMethodException e1) {
        return (AnnotationType)
```

## RuleId[id=InstantiationOfUtilityClass]
### InstantiationOfUtilityClass
Instantiation of utility class `JavacInvocationInstance`
in `check_api/src/main/java/com/google/errorprone/JavacInvocationInstance.java`
#### Snippet
```java
    JavacInvocationInstance instance = context.get(JavacInvocationInstance.class);
    if (instance == null) {
      instance = new JavacInvocationInstance();
      context.put(JavacInvocationInstance.class, instance);
    }
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00FF` can be replaced with 'ÿ'
in `check_api/src/main/java/com/google/errorprone/util/SourceCodeEscapers.java`
#### Snippet
```java
  // http://java.sun.com/docs/books/jls/third_edition/html/lexical.html#101089
  //  "Octal escapes are provided for compatibility with C, but can express
  //   only Unicode values \u0000 through \u00FF, so Unicode escapes are
  //   usually preferred."
  private static class JavaCharEscaper extends ArrayBasedCharEscaper {
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
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

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
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

### UnnecessaryLocalVariable
Local variable `description` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/InsecureCipherMode.java`
#### Snippet
```java
  @Override
  public Description matchMethodInvocation(MethodInvocationTree tree, VisitorState state) {
    Description description = checkInvocation(tree, state);

    return description;
```

### UnnecessaryLocalVariable
Local variable `fix` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/UnnecessaryTypeArgument.java`
#### Snippet
```java
    verify(source.charAt(lower) == '<' && source.charAt(upper) == '>');

    Fix fix = SuggestedFix.replace(startAbsolute + lower, startAbsolute + upper + 1, "");
    return fix;
  }
```

### UnnecessaryLocalVariable
Local variable `pairings` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/MissingTestCall.java`
#### Snippet
```java
  @Override
  public Description matchMethod(MethodTree tree, VisitorState state) {
    ImmutableSet<MethodPairing> pairings = PAIRINGS;

    Set<MethodPairing> required = new HashSet<>();
```

### UnnecessaryLocalVariable
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

### UnnecessaryLocalVariable
Local variable `result` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/formatstring/StrictFormatStringValidation.java`
#### Snippet
```java

    // Scan down from the scope where the variable was declared
    ValidationResult result =
        path.getLeaf()
            .accept(
```

### UnnecessaryLocalVariable
Local variable `builder` is redundant
in `core/src/main/java/com/google/errorprone/bugpatterns/threadsafety/ThreadSafety.java`
#### Snippet
```java
  public static ThreadSafety.Builder threadSafeBuilder(
      WellKnownThreadSafety wellKnownThreadSafety) {
    ThreadSafety.Builder builder =
        ThreadSafety.builder()
            .setPurpose(Purpose.FOR_THREAD_SAFE_CHECKER)
```

### UnnecessaryLocalVariable
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

### UnnecessaryLocalVariable
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

### UnnecessaryLocalVariable
Local variable `transformed` is redundant
in `test_helpers/src/main/java/com/google/errorprone/BugCheckerRefactoringTestHelper.java`
#### Snippet
```java
    diff.applyDifferences(sourceFile);

    JavaFileObject transformed =
        JavaFileObjects.forSourceString(getFullyQualifiedName(tree), sourceFile.getSourceText());
    return transformed;
```

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
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

### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'treeInstance' to 'InstanceOfTree'
in `core/src/main/java/com/google/errorprone/bugpatterns/InstanceOfAndCastMatchWrongType.java`
#### Snippet
```java

        Types types = state.getTypes();
        InstanceOfTree instanceOfTree = (InstanceOfTree) treeInstance;
        nodeToReplace = instanceOfTree.getType();

```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
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

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/MockNotUsedInProduction.java`
#### Snippet
```java
    }.scan(state.getPath().getCompilationUnit(), null);
    var fix = SuggestedFix.builder();
    for (Range<Integer> range : ImmutableRangeSet.unionOf(deletions.build()).asRanges()) {
      fix.replace(range.lowerEndpoint(), range.upperEndpoint(), "");
    }
```

### UnstableApiUsage
'unionOf(java.lang.Iterable\>)' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/MockNotUsedInProduction.java`
#### Snippet
```java
    }.scan(state.getPath().getCompilationUnit(), null);
    var fix = SuggestedFix.builder();
    for (Range<Integer> range : ImmutableRangeSet.unionOf(deletions.build()).asRanges()) {
      fix.replace(range.lowerEndpoint(), range.upperEndpoint(), "");
    }
```

### UnstableApiUsage
'asRanges()' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/MockNotUsedInProduction.java`
#### Snippet
```java
    }.scan(state.getPath().getCompilationUnit(), null);
    var fix = SuggestedFix.builder();
    for (Range<Integer> range : ImmutableRangeSet.unionOf(deletions.build()).asRanges()) {
      fix.replace(range.lowerEndpoint(), range.upperEndpoint(), "");
    }
```

### UnstableApiUsage
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

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java
  }

  private static ImmutableRangeSet<Integer> commentsAndLiterals(VisitorState state, String source) {
    ImmutableList<ErrorProneToken> tokens = getTokens(source, state.context);
    return ImmutableRangeSet.unionOf(
```

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java
  @Override
  public Description matchCompilationUnit(CompilationUnitTree tree, VisitorState state) {
    RangeSet<Integer> violations = TreeRangeSet.create();
    String sourceCode = state.getSourceCode().toString();

```

### UnstableApiUsage
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java
  @Override
  public Description matchCompilationUnit(CompilationUnitTree tree, VisitorState state) {
    RangeSet<Integer> violations = TreeRangeSet.create();
    String sourceCode = state.getSourceCode().toString();

```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java
  @Override
  public Description matchCompilationUnit(CompilationUnitTree tree, VisitorState state) {
    RangeSet<Integer> violations = TreeRangeSet.create();
    String sourceCode = state.getSourceCode().toString();

```

### UnstableApiUsage
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

### UnstableApiUsage
'isEmpty()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java
    }

    if (violations.isEmpty()) {
      return NO_MATCH;
    }
```

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java
    }

    ImmutableRangeSet<Integer> permissibleUnicodeRegions =
        suppressedRegions(state).union(commentsAndLiterals(state, sourceCode));

```

### UnstableApiUsage
'union(com.google.common.collect.RangeSet)' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java

    ImmutableRangeSet<Integer> permissibleUnicodeRegions =
        suppressedRegions(state).union(commentsAndLiterals(state, sourceCode));

    for (var range : violations.asDescendingSetOfRanges()) {
```

### UnstableApiUsage
'asDescendingSetOfRanges()' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java
        suppressedRegions(state).union(commentsAndLiterals(state, sourceCode));

    for (var range : violations.asDescendingSetOfRanges()) {
      if (!permissibleUnicodeRegions.encloses(range)) {
        state.reportMatch(
```

### UnstableApiUsage
'encloses(com.google.common.collect.Range)' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeInCode.java`
#### Snippet
```java

    for (var range : violations.asDescendingSetOfRanges()) {
      if (!permissibleUnicodeRegions.encloses(range)) {
        state.reportMatch(
            buildDescription(new FixedPosition(tree, range.lowerEndpoint()))
```

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/SuppressWarningsWithoutExplanation.java`
#### Snippet
```java
  }

  private static ImmutableRangeSet<Long> linesWithComments(VisitorState state) {
    RangeSet<Long> lines = TreeRangeSet.create();
    ErrorProneTokens tokens = new ErrorProneTokens(state.getSourceCode().toString(), state.context);
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/SuppressWarningsWithoutExplanation.java`
#### Snippet
```java

  private static ImmutableRangeSet<Long> linesWithComments(VisitorState state) {
    RangeSet<Long> lines = TreeRangeSet.create();
    ErrorProneTokens tokens = new ErrorProneTokens(state.getSourceCode().toString(), state.context);
    LineMap lineMap = tokens.getLineMap();
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/SuppressWarningsWithoutExplanation.java`
#### Snippet
```java

  private static ImmutableRangeSet<Long> linesWithComments(VisitorState state) {
    RangeSet<Long> lines = TreeRangeSet.create();
    ErrorProneTokens tokens = new ErrorProneTokens(state.getSourceCode().toString(), state.context);
    LineMap lineMap = tokens.getLineMap();
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/SuppressWarningsWithoutExplanation.java`
#### Snippet
```java

  private static ImmutableRangeSet<Long> linesWithComments(VisitorState state) {
    RangeSet<Long> lines = TreeRangeSet.create();
    ErrorProneTokens tokens = new ErrorProneTokens(state.getSourceCode().toString(), state.context);
    LineMap lineMap = tokens.getLineMap();
```

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
'splitToStream(java.lang.CharSequence)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/JUnitParameterMethodNotFound.java`
#### Snippet
```java
        String paramMethods =
            (String) ASTHelpers.constValue(paramMethodAssignmentTree.get().getExpression());
        Splitter.on(',').trimResults().splitToStream(paramMethods).forEach(requiredMethods::add);

        // If source argument is present in the annotation the method should be searched in the
```

### UnstableApiUsage
'zip(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiFunction)' is marked unstable with @Beta**
in `core/src/main/java/com/google/errorprone/bugpatterns/UnusedException.java`
#### Snippet
```java

  private static boolean typesEqual(List<Type> typesA, List<Type> typesB, VisitorState state) {
    return Streams.zip(
            typesA.stream(), typesB.stream(), (a, b) -> ASTHelpers.isSameType(a, b, state))
        .allMatch(x -> x);
```

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/UnicodeEscape.java`
#### Snippet
```java
    private final String source;
    private final VisitorState state;
    private final Supplier<ImmutableRangeSet<Integer>> suppressedRegions =
        memoize(() -> suppressedRegions(getState()));

```

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
'zip(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiFunction)' is marked unstable with @Beta**
in `core/src/main/java/com/google/errorprone/bugpatterns/TypeCompatibilityUtils.java`
#### Snippet
```java
    List<Type> rightGenericTypes = typeArgsAsSuper(rightType, superType, state);

    return Streams.zip(leftGenericTypes.stream(), rightGenericTypes.stream(), TypePair::new)
        // If we encounter an f-bound, skip that index's type when comparing the compatibility of
        // types to avoid infinite recursion:
```

### UnstableApiUsage
'stream(java.util.Iterator)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/LambdaFunctionalInterface.java`
#### Snippet
```java
  private static ClassTree getTopLevelClassTree(VisitorState state) {
    return findLast(
            stream(state.getPath().iterator())
                .filter(ClassTree.class::isInstance)
                .map(ClassTree.class::cast))
```

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
'tryParse(java.lang.String)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/time/TimeUnitConversionChecker.java`
#### Snippet
```java

    // if we have a constant and can Long-parse it...
    Long constant = Longs.tryParse(String.valueOf(state.getSourceForNode(arg0)));
    if (constant != null) {
      long converted = invokeConversion(receiver.get(), methodName, constant);
```

### UnstableApiUsage
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

### UnstableApiUsage
'asMap(com.google.common.collect.ListMultimap)' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/inject/guice/AssistedParameters.java`
#### Snippet
```java

      for (Map.Entry<String, List<VariableTree>> assistedValueToParameters :
          Multimaps.asMap(keyForAssistedVariable).entrySet()) {
        if (assistedValueToParameters.getValue().size() > 1) {
          conflicts.add(
```

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
'com.google.common.base.Utf8' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/android/IsLoggableTagLength.java`
#### Snippet
```java

  private static boolean isValidTag(String tag) {
    return Utf8.encodedLength(tag) <= 23;
  }

```

### UnstableApiUsage
'encodedLength(java.lang.CharSequence)' is declared in unstable class 'com.google.common.base.Utf8' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/android/IsLoggableTagLength.java`
#### Snippet
```java

  private static boolean isValidTag(String tag) {
    return Utf8.encodedLength(tag) <= 23;
  }

```

### UnstableApiUsage
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

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
     * {@literal @}code tag put inside them to escape HTML.
     */
    private final RangeSet<Integer> preTags = TreeRangeSet.create();

    /**
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
     * {@literal @}code tag put inside them to escape HTML.
     */
    private final RangeSet<Integer> preTags = TreeRangeSet.create();

    /**
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
     * {@literal @}code tag put inside them to escape HTML.
     */
    private final RangeSet<Integer> preTags = TreeRangeSet.create();

    /**
```

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
'add(com.google.common.collect.Range)' is declared in unstable interface 'com.google.common.collect.RangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
      }

      emittedFixes.add(containingPre);

      SuggestedFix fix = wrapInCodeTag(containingPre);
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
    private final RangeSet<Integer> generics;
    private final RangeSet<Integer> preTags;
    private final RangeSet<Integer> emittedFixes;

    private EntityChecker(
```

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
     * already-escaped HTML.
     */
    private final RangeSet<Integer> dontEmitCodeFix = TreeRangeSet.create();

    private final Deque<Integer> startPosStack = new ArrayDeque<>();
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
     * already-escaped HTML.
     */
    private final RangeSet<Integer> dontEmitCodeFix = TreeRangeSet.create();

    private final Deque<Integer> startPosStack = new ArrayDeque<>();
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
     * already-escaped HTML.
     */
    private final RangeSet<Integer> dontEmitCodeFix = TreeRangeSet.create();

    private final Deque<Integer> startPosStack = new ArrayDeque<>();
```

### UnstableApiUsage
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

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
  }

  private RangeSet<Integer> fixGenerics(
      RangeSet<Integer> generics,
      RangeSet<Integer> preTags,
```

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java

  private RangeSet<Integer> fixGenerics(
      RangeSet<Integer> generics,
      RangeSet<Integer> preTags,
      RangeSet<Integer> dontEmitCodeFix,
```

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
'com.google.common.collect.RangeSet' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/javadoc/UnescapedEntity.java`
#### Snippet
```java
    private final VisitorState state;
    private final RangeSet<Integer> generics;
    private final RangeSet<Integer> preTags;
    private final RangeSet<Integer> emittedFixes;

```

### UnstableApiUsage
'forEachPair(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiConsumer)' is marked unstable with @Beta**
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/ParameterMissingNullable.java`
#### Snippet
```java
    }

    forEachPair(
        arguments.stream(),
        methodSymbol.getParameters().stream(),
```

### UnstableApiUsage
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

### UnstableApiUsage
'forEachPair(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiConsumer)' is marked unstable with @Beta**
in `core/src/main/java/com/google/errorprone/bugpatterns/nullness/NullArgumentForNonNullParameter.java`
#### Snippet
```java
    }

    forEachPair(
        args.stream(),
        methodSymbol.getParameters().stream(),
```

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
'lines()' is marked unstable with @Beta
in `core/src/main/java/com/google/errorprone/bugpatterns/checkreturnvalue/ExternalCanIgnoreReturnValue.java`
#### Snippet
```java
  private static MethodPredicate configByParsingApiObjects(CharSource file) throws IOException {
    ImmutableSetMultimap<String, Api> apis;
    try (Stream<String> lines = file.lines()) {
      apis = lines.map(Api::parse).collect(toImmutableSetMultimap(Api::className, api -> api));
    }
```

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
Overridden method 'processLine(java.lang.String)' is declared in unstable interface 'com.google.common.io.LineProcessor' marked with @Beta
in `docgen/src/main/java/com/google/errorprone/BugPatternFileGenerator.java`
#### Snippet
```java

  @Override
  public boolean processLine(String line) throws IOException {
    BugPatternInstance pattern = new Gson().fromJson(line, BugPatternInstance.class);
    pattern.severity = severityRemapper.apply(pattern);
```

### UnstableApiUsage
Overridden method 'getResult()' is declared in unstable interface 'com.google.common.io.LineProcessor' marked with @Beta
in `docgen/src/main/java/com/google/errorprone/BugPatternFileGenerator.java`
#### Snippet
```java

  @Override
  public List<BugPatternInstance> getResult() {
    return result;
  }
```

### UnstableApiUsage
'com.google.common.io.LineProcessor' is marked unstable with @Beta
in `docgen/src/main/java/com/google/errorprone/BugPatternFileGenerator.java`
#### Snippet
```java
 * @author alexeagle@google.com (Alex Eagle)
 */
class BugPatternFileGenerator implements LineProcessor<List<BugPatternInstance>> {

  private final Path outputDir;
```

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
'asMap(com.google.common.collect.SortedSetMultimap)' is marked unstable with @Beta
in `docgen/src/main/java/com/google/errorprone/BugPatternIndexWriter.java`
#### Snippet
```java

    ImmutableList<Map<String, Object>> bugpatternData =
        Multimaps.asMap(sorted).entrySet().stream()
            .map(
                e ->
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/util/Comments.java`
#### Snippet
```java

    // Ignore comments nested inside arguments.
    TreeRangeSet<Integer> exclude = TreeRangeSet.create();
    arguments.forEach(
        arg ->
```

### UnstableApiUsage
'com.google.common.collect.TreeRangeSet' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/util/Comments.java`
#### Snippet
```java

    // Ignore comments nested inside arguments.
    TreeRangeSet<Integer> exclude = TreeRangeSet.create();
    arguments.forEach(
        arg ->
```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeSet' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/util/Comments.java`
#### Snippet
```java

    // Ignore comments nested inside arguments.
    TreeRangeSet<Integer> exclude = TreeRangeSet.create();
    arguments.forEach(
        arg ->
```

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
'com.google.common.collect.RangeMap' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/fixes/Replacements.java`
#### Snippet
```java

  private final TreeMap<Range<Integer>, Replacement> replacements = new TreeMap<>(DESCENDING);
  private final RangeMap<Integer, Replacement> overlaps = TreeRangeMap.create();
  private final TreeSet<Integer> zeroLengthRanges = new TreeSet<>();

```

### UnstableApiUsage
'com.google.common.collect.TreeRangeMap' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/fixes/Replacements.java`
#### Snippet
```java

  private final TreeMap<Range<Integer>, Replacement> replacements = new TreeMap<>(DESCENDING);
  private final RangeMap<Integer, Replacement> overlaps = TreeRangeMap.create();
  private final TreeSet<Integer> zeroLengthRanges = new TreeSet<>();

```

### UnstableApiUsage
'create()' is declared in unstable class 'com.google.common.collect.TreeRangeMap' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/fixes/Replacements.java`
#### Snippet
```java

  private final TreeMap<Range<Integer>, Replacement> replacements = new TreeMap<>(DESCENDING);
  private final RangeMap<Integer, Replacement> overlaps = TreeRangeMap.create();
  private final TreeSet<Integer> zeroLengthRanges = new TreeSet<>();

```

### UnstableApiUsage
'com.google.common.graph.ImmutableGraph' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/InferredNullability.java`
#### Snippet
```java
 */
public class InferredNullability {
  private final ImmutableGraph<InferenceVariable> constraintGraph;

  private final Map<InferenceVariable, Optional<Nullness>> inferredMemoTable = new HashMap<>();
```

### UnstableApiUsage
'com.google.common.graph.Graph' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/InferredNullability.java`
#### Snippet
```java
  private final Map<InferenceVariable, Optional<Nullness>> inferredMemoTable = new HashMap<>();

  InferredNullability(Graph<InferenceVariable> constraints) {
    this.constraintGraph = ImmutableGraph.copyOf(constraints);
  }
```

### UnstableApiUsage
'com.google.common.graph.ImmutableGraph' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/InferredNullability.java`
#### Snippet
```java

  InferredNullability(Graph<InferenceVariable> constraints) {
    this.constraintGraph = ImmutableGraph.copyOf(constraints);
  }

```

### UnstableApiUsage
'copyOf(com.google.common.graph.Graph)' is declared in unstable class 'com.google.common.graph.ImmutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/InferredNullability.java`
#### Snippet
```java

  InferredNullability(Graph<InferenceVariable> constraints) {
    this.constraintGraph = ImmutableGraph.copyOf(constraints);
  }

```

### UnstableApiUsage
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

### UnstableApiUsage
'forEachPair(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiConsumer)' is marked unstable with @Beta**
in `check_api/src/main/java/com/google/errorprone/util/ASTHelpers.java`
#### Snippet
```java

      private void scan(Collection<Type> from, Collection<Type> to) {
        Streams.forEachPair(from.stream(), to.stream(), this::scan);
      }

```

### UnstableApiUsage
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
  private static ImmutableList<TypeAndSymbol> expandVarargsToArity(
      List<VarSymbol> formalArgs, int arity) {
    ImmutableList.Builder<TypeAndSymbol> result = ImmutableList.builderWithExpectedSize(arity);
    int numberOfVarArgs = arity - formalArgs.size() + 1;

```

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
'com.google.common.graph.GraphBuilder' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
  private NullnessQualifierInference(Tree currentMethodOrInitializerOrLambda) {
    this.currentMethodOrInitializerOrLambda = currentMethodOrInitializerOrLambda;
    this.qualifierConstraints = GraphBuilder.directed().build();

    // Initialize graph with standard nullness lattice; see ASCII art diagram in
```

### UnstableApiUsage
'directed()' is declared in unstable class 'com.google.common.graph.GraphBuilder' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
  private NullnessQualifierInference(Tree currentMethodOrInitializerOrLambda) {
    this.currentMethodOrInitializerOrLambda = currentMethodOrInitializerOrLambda;
    this.qualifierConstraints = GraphBuilder.directed().build();

    // Initialize graph with standard nullness lattice; see ASCII art diagram in
```

### UnstableApiUsage
'build()' is declared in unstable class 'com.google.common.graph.GraphBuilder' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
  private NullnessQualifierInference(Tree currentMethodOrInitializerOrLambda) {
    this.currentMethodOrInitializerOrLambda = currentMethodOrInitializerOrLambda;
    this.qualifierConstraints = GraphBuilder.directed().build();

    // Initialize graph with standard nullness lattice; see ASCII art diagram in
```

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
'putEdge(N, N)' is declared in unstable interface 'com.google.common.graph.MutableGraph' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
    qualifierConstraints.putEdge(ProperInferenceVar.BOTTOM, ProperInferenceVar.NULL);
    qualifierConstraints.putEdge(ProperInferenceVar.NONNULL, ProperInferenceVar.NULLABLE);
    qualifierConstraints.putEdge(ProperInferenceVar.NULL, ProperInferenceVar.NULLABLE);
  }

```

### UnstableApiUsage
'forEachPair(java.util.stream.Stream, java.util.stream.Stream**, java.util.function.BiConsumer)' is marked unstable with @Beta**
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java

    // Generate constraints for each argument write.
    Streams.forEachPair(
        formalParameters.stream(),
        sourceNode.getArguments().stream(),
```

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
'com.google.common.graph.MutableGraph' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/dataflow/nullnesspropagation/inference/NullnessQualifierInference.java`
#### Snippet
```java
   * words, edges point "upwards" in the lattice towards Top == Nullable.
   */
  private final MutableGraph<InferenceVariable> qualifierConstraints;

  private final Tree currentMethodOrInitializerOrLambda;
```

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
'com.google.common.collect.ImmutableRangeSet' is marked unstable with @Beta
in `check_api/src/main/java/com/google/errorprone/bugpatterns/BugChecker.java`
#### Snippet
```java

  /** Computes a RangeSet of code regions which are suppressed by this bug checker. */
  public ImmutableRangeSet<Integer> suppressedRegions(VisitorState state) {
    ImmutableRangeSet.Builder<Integer> suppressedRegions = ImmutableRangeSet.builder();
    new TreeScanner<Void, Void>() {
```

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
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

### UnstableApiUsage
'build()' is declared in unstable class 'com.google.common.collect.ImmutableRangeSet' marked with @Beta
in `check_api/src/main/java/com/google/errorprone/bugpatterns/BugChecker.java`
#### Snippet
```java
      }
    }.scan(state.getPath().getCompilationUnit(), null);
    return suppressedRegions.build();
  }

```

